-- 页面渲染层：页纹理、页缓存、链接与分页加载。
local M = {}
M.__index = M

function M.new(ctx)
    return setmetatable({ ctx = ctx }, M)
end

function M:content_sig()
    local ctx = self.ctx
    local v, s = ctx.v, ctx.settings
    local spread, _, _, avail_h, target_w = v.view_metrics()
    return v.view.signature({
        spread = spread, target_w = target_w, reflow = v.reflow,
        avail_h = avail_h, zoom = v.zoom,
        font_size = s.font_size, line_factor = s.line_factor, margin = s.margin,
        dark = s.theme == "dark",
        page_bg = (v.reflow and s.theme ~= "dark") and s.theme or 0,
    })
end

function M:max_scroll()
    local v = self.ctx.v
    local _, _, _, avail_h = v.view_metrics()
    local mh = math.max(v.tex_h or 0, v.p2h or 0)
    return math.max(0, mh - avail_h)
end

function M:relayout(frac)
    local ctx = self.ctx
    local v, s, R = ctx.v, ctx.settings, ctx.get_reader()
    if not v.reflow or not R.doc then return end
    local _, _, _, avail_h, target_w = v.view_metrics()
    local layout_w = v.view.layout_width(target_w)
    local margin = math.min(s.margin, math.floor(layout_w / 8))
    local nt, hit = v.layout:apply(R.doc, layout_w, avail_h,
        s.font_size, s.line_factor, margin)
    if hit then return end
    if nt and nt > 0 then
        R.total = nt
        R.page = math.max(0, math.min(R.total - 1,
            math.floor((frac or 0) * R.total)))
    end
end

function M:load_links(idx)
    local ctx = self.ctx
    local v, R = ctx.v, ctx.get_reader()
    local arr = {}
    local raw = ctx.rd.page_links(R.doc, idx)
    if raw then
        for line in raw:gmatch("[^\n]+") do
            local x0, y0, x1, y1, tp, ty = line:match(
                "([^\t]+)\t([^\t]+)\t([^\t]+)\t([^\t]+)\t(%-?%d+)\t([^\t]+)")
            if tp then
                arr[#arr + 1] = {
                    x0 = tonumber(x0), y0 = tonumber(y0),
                    x1 = tonumber(x1), y1 = tonumber(y1),
                    page = tonumber(tp), y = tonumber(ty) or 0,
                }
            end
        end
    end
    v.links[idx] = arr
end

function M:render_into(idx, target_w)
    local ctx = self.ctx
    local v, s, R = ctx.v, ctx.settings, ctx.get_reader()
    local rd = ctx.rd
    local pw = rd.page_size(R.doc, idx)
    local z = v.zoom or 1.2
    if pw and pw > 0 then z = target_w / pw end
    z = math.max(0.05, math.min(8.0, z))
    local br, bg, bb = v.page_bg_rgb()
    local pixels, w, h, stride = rd.render_page(R.doc, idx, z, br, bg, bb)
    if not pixels then return nil end
    if s.theme == "dark" then
        ctx.invert_rgba(pixels, w, h, stride or (w * 4))
    end
    local t = ctx.sdl.create_texture(ctx.ren, w, h)
    if not t then rd.free(pixels); return nil end
    ctx.sdl.update_texture(t, pixels, stride or (w * 4))
    rd.free(pixels)
    return t, w, h
end

function M:teardown()
    local ctx = self.ctx
    local v, sdl = ctx.v, ctx.sdl
    if v.tex then sdl.destroy_texture(v.tex); v.tex = nil end
    if v.p2 then sdl.destroy_texture(v.p2); v.p2 = nil end
    if v.pcache then v.pcache:clear() end
    for _, t in ipairs(v.line_texs) do sdl.destroy_texture(t.tex) end
    v.line_texs = {}
    v.tex_w, v.tex_h = 0, 0
    v.p2w, v.p2h = 0, 0
end

function M:load_page(n, keep_scroll)
    local ctx = self.ctx
    local v, s, R = ctx.v, ctx.settings, ctx.get_reader()
    local W, H = ctx.get_w(), ctx.get_h()
    local S = ctx.S
    local sdl, ttf, ren = ctx.sdl, ctx.ttf, ctx.ren

    local sig = self:content_sig()
    local invalidate = v.pending_layout or sig ~= v.content_sig_value
    if invalidate then
        v.pcache:clear()
        if v.tex then sdl.destroy_texture(v.tex); v.tex = nil end
        if v.p2 then sdl.destroy_texture(v.p2); v.p2 = nil end
    else
        if v.tex then
            v.pcache:put(sig .. ":" .. R.page, { tex = v.tex, w = v.tex_w, h = v.tex_h })
            v.tex = nil
        end
        if v.p2 then
            v.pcache:put(sig .. ":" .. (R.page + 1),
                { tex = v.p2, w = v.p2w, h = v.p2h })
            v.p2 = nil
        end
    end
    for _, t in ipairs(v.line_texs) do sdl.destroy_texture(t.tex) end
    v.line_texs = {}
    v.tex_w, v.tex_h, v.p2w, v.p2h = 0, 0, 0, 0

    if R.is_txt then
        local lines = R.pages and R.pages[n + 1]
        if not lines then return false end
        local f_body = ctx.get_font_body()
        local theme = ctx.get_theme()
        for _, line in ipairs(lines) do
            local w, h = ttf.size(f_body, line)
            local t = ttf.render_texture(ren, f_body, line,
                theme.text[1], theme.text[2], theme.text[3], 255)
            if t then v.line_texs[#v.line_texs + 1] = { tex = t, w = w, h = h } end
        end
        v.tex_w, v.tex_h = W, H
        R.page = n
        v.sy = 0
        v.refresh_text()
        v.content_sig_value = self:content_sig()
        print(string.format("[reader] txt page %d/%d", R.page + 1, R.total))
        return true
    end

    if v.pending_layout and v.reflow then
        v.pending_layout = false
        local frac = R.total > 0 and (n / R.total) or 0
        self:relayout(frac)
        n = R.page
    end

    local spread, _, _, _, target_w = v.view_metrics()
    if spread and n == 0 and not R.chapter_mode then
        target_w = math.max(160, W - S(48))
    end
    target_w = math.floor(target_w * v.zoom)
    sig = self:content_sig()
    local ce = v.pcache:take(sig .. ":" .. n)
    if ce then
        v.tex, v.tex_w, v.tex_h = ce.tex, ce.w, ce.h
    else
        v.tex, v.tex_w, v.tex_h = self:render_into(n, target_w)
    end
    if not v.tex then return false end
    if spread and (n > 0 or R.chapter_mode) and n + 1 < R.total then
        local ce2 = v.pcache:take(sig .. ":" .. (n + 1))
        if ce2 then
            v.p2, v.p2w, v.p2h = ce2.tex, ce2.w, ce2.h
        else
            v.p2, v.p2w, v.p2h = self:render_into(n + 1, target_w)
        end
    end
    R.page = n
    v.pan_x = 0
    v.links = {}
    self:load_links(R.page)
    if v.p2 then self:load_links(R.page + 1) end
    v.sy = keep_scroll and (v.sy or 0) or 0
    v.sy = math.max(0, math.min(self:max_scroll(), v.sy))
    v.refresh_text()
    v.content_sig_value = sig
    v.prefetch = nil
    if R.chapter_mode then
        local step = spread and 2 or 1
        local np = n + step
        if np < R.total then
            v.prefetch = { sig = sig, page = np, target_w = target_w }
        end
    end
    print(string.format("[reader] page %d/%d  %dx%d%s", R.page + 1, R.total,
        v.tex_w, v.tex_h, v.p2 and " (+1)" or ""))
    return true
end

return M
