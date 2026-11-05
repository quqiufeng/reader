-- 目录面板：状态、列表渲染、跳转。
local M = {}
M.__index = M

function M.new(ctx)
    local S = ctx.S
    return setmetatable({
        ctx = ctx,
        open = false,
        items = {},
        selected = 1,
        first = 1,
        texs = {},
        line_h = S(34),
        visible = 20,
        top = S(120),
    }, M)
end

function M:destroy()
    local ctx = self.ctx
    local sdl = ctx.sdl
    for _, t in ipairs(self.texs) do sdl.destroy_texture(t.tex) end
    self.texs = {}
    for _, k in ipairs({ "title", "count", "hint", "empty" }) do
        local tex = self[k .. "_tex"]
        if tex then sdl.destroy_texture(tex); self[k .. "_tex"] = nil end
    end
end

function M:close()
    self:destroy()
    self.open = false
    self.items = {}
end

function M:load_data()
    local ctx = self.ctx
    local R = ctx.get_reader()
    if R.chapter_mode and R.chapters then
        local t = {}
        for i, ch in ipairs(R.chapters) do
            t[#t + 1] = {
                chapter = i, level = 0,
                title = ch.title or string.format("第 %d 章", i),
            }
        end
        return t
    end
    if ctx.get_is_txt() then
        local t = {}
        local total = ctx.get_total()
        for i = 1, total do
            t[#t + 1] = { page = i - 1, level = 0, title = string.format("第 %d 页", i) }
        end
        return t
    end
    local doc = ctx.get_doc()
    if doc then
        local raw = ctx.rd.toc(doc)
        local t = {}
        for _, it in ipairs(raw) do
            if it.page and it.page >= 0 then t[#t + 1] = it end
        end
        if #t > 0 then return t end
    end
    return {}
end

function M:rebuild()
    local ctx = self.ctx
    local sdl, ttf, ren = ctx.sdl, ctx.ttf, ctx.ren
    for _, t in ipairs(self.texs) do sdl.destroy_texture(t.tex) end
    self.texs = {}
    if #self.items == 0 then return end

    self.selected = math.max(1, math.min(#self.items, self.selected))
    local first = math.max(1, self.selected - math.floor(self.visible / 2))
    if first + self.visible - 1 > #self.items then
        first = math.max(1, #self.items - self.visible + 1)
    end
    self.first = first
    local last = math.min(#self.items, first + self.visible - 1)
    local f_body = ctx.get_fonts()
    local theme = ctx.get_theme()

    for i = first, last do
        local it = self.items[i]
        local text = string.rep("  ", it.level or 0) .. (it.title or "")
        local w, h = ttf.size(f_body, text)
        local c = (i == self.selected) and theme.ink or theme.text
        local t = ttf.render_texture(ren, f_body, text, c[1], c[2], c[3], 255)
        if t then
            self.texs[#self.texs + 1] = { tex = t, w = w, h = h, index = i }
        end
    end
end

function M:show()
    local ctx = self.ctx
    local v = ctx.v
    local f_body, f_title, f_page = ctx.get_fonts()
    local theme = ctx.get_theme()
    ctx.close_others()
    self:destroy()
    self.items = self:load_data()
    self.open = true
    self.selected = 1
    self.title_tex, self.title_w, self.title_h = v.make_text("目录", f_title, theme.ink)
    self.count_tex, self.count_w, self.count_h = v.make_text(
        string.format("%d 条", #self.items), f_page, theme.muted)
    self.hint_tex, self.hint_w, self.hint_h = v.make_text(
        "↑/↓ 选择 · Enter 跳转 · T/Esc 关闭", f_page, theme.muted)
    if #self.items == 0 then
        self.empty_tex, self.empty_w, self.empty_h =
            v.make_text("（无目录）", f_body, theme.muted)
    end
    self:rebuild()
end

function M:toggle()
    if self.open then self:close() else self:show() end
end

function M:move(delta)
    if #self.items == 0 then return end
    self.selected = math.max(1, math.min(#self.items, self.selected + delta))
    self:rebuild()
end

function M:activate()
    local it = self.items[self.selected]
    if not it then return end
    self:close()
    local ctx = self.ctx
    local v = ctx.v
    local R = ctx.get_reader()
    if R.chapter_mode and R.chapters and it.chapter and R.chapters[it.chapter] then
        v.open_chapter(it.chapter, 0)
        v.save_progress()
    elseif it.page and it.page >= 0 and it.page < ctx.get_total() then
        v.load_page(it.page)
        v.save_progress()
    end
end

function M:draw()
    local ctx = self.ctx
    local W, H = ctx.get_wh()
    local theme = ctx.get_theme()
    ctx.panel.frame(ctx.ren, W, H, theme, ctx.v.ui_scale,
        self.title_tex, self.title_w, self.title_h,
        self.count_tex, self.count_w, self.count_h)
    ctx.panel.items(ctx.ren, W, theme, ctx.v.ui_scale, self.top, self.line_h,
        self.texs, self.selected, self.empty_tex, self.empty_w, self.empty_h)
    ctx.panel.hint(ctx.ren, H, ctx.v.ui_scale, self.hint_tex, self.hint_w, self.hint_h)
end

return M
