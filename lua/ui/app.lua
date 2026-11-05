package.path = "./lua/?.lua;./lua/?/init.lua;" .. package.path

local ffi = require("ffi")
ffi.cdef[[
unsigned int getuid(void);
]]
local sdl = require("ffi.sdl2")
local ttf = require("ffi.sdl2_ttf")
local rd = require("ffi.reader")
local automation = require("core.automation")
local library = require("core.library")

local initial_book = READER_BOOK or ""
local shot = READER_SCREENSHOT or ""
local initial_page = tonumber(READER_PAGE or "")
local zoom = tonumber(READER_ZOOM or "1.2") or 1.2
local frames = tonumber(READER_FRAMES or "0") or 0
local forced_ui_scale = tonumber(os.getenv("READER_UI_SCALE") or "")

sdl.set_hint("SDL_MOUSE_FOCUS_CLICKTHROUGH", "1")
if not sdl.init() then error("SDL_Init failed") end
if not ttf.init() then error("TTF_Init failed") end

local W, H = 900, 1200
local v = {
    win_w = W, win_h = H, win_x = 0, win_y = 0,
    fs = false, max = false, dual = true, auto_dual = false, sy = 0,
    reflow = false, pending_layout = false,
    zoom = 1.0, pan_x = 0,
    scale_x = 1, scale_y = 1, ui_scale = nil,
    dragging = false, drag_x = 0, drag_y = 0,
    cursor_arrow = nil, cursor_hand = nil, hover = false, hover_t = 0,
    dirty = true, had_event = false, drew = false,
    resize_pending = false, resize_due = 0, sync_at = 0,
    resize_last_w = nil, resize_last_h = nil, force_reload = false,
    startup_sync = false, startup_at = 0,
    resize_target_w = nil, resize_target_h = nil, scale_ready = false,
    p2 = nil, p2w = 0, p2h = 0,
    fs_tex = nil, fs_w = 0, fs_h = 0, fs_x = 0,
    max_tex = nil, max_w = 0, max_h = 0, max_x = 0,
    eye_tex = nil, eye_w = 0, eye_h = 0, eye_x = 0,
    dual_tex = nil, dual_w = 0, dual_h = 0, dual_x = 0,
    shot_tex = nil, shot_w = 0, shot_h = 0, shot_x = 0,
    hdr_open_tex = nil, hdr_open_w = 0, hdr_open_h = 0, hdr_open_x = 0,
    last_browse_dir = nil,
    toast = nil, toast_tex = nil, toast_w = 0, toast_h = 0, toast_until = 0,
    dialog = nil,
    rects = {}, links = {},
}
v.pcache = require("ui.page_cache").new(sdl, 4)

local win = assert(sdl.create_window("reader", W, H), "SDL_CreateWindow failed")
v.win_x, v.win_y = sdl.get_window_position(win)
local icon = sdl.load_bmp("assets/icons/native-reader.bmp")
if icon ~= nil then
    sdl.set_window_icon(win, icon)
    sdl.free_surface(icon)
end
local ren = assert(sdl.create_renderer(win), "SDL_CreateRenderer failed")
local function sync_scale()
    if v.scale_ready then return end
    local ww, wh = sdl.get_window_size(win)
    local ow, oh = sdl.get_renderer_output_size(ren)
    if ww and wh and ww > 0 and wh > 0 and ow and oh then
        v.scale_x, v.scale_y = ow / ww, oh / wh
        if forced_ui_scale and forced_ui_scale > 0 then
            v.ui_scale = forced_ui_scale
        elseif not v.ui_scale then
            v.ui_scale = v.scale_x
        end
        v.scale_ready = true
    end
end
sync_scale()
v.window_target_size = function()
    return v.view.target_size(win, sdl, v.scale_x, v.scale_y, W, H)
end
ffi.cdef[[
typedef struct { long tv_sec; long tv_usec; } reader_timeval;
int gettimeofday(reader_timeval *tv, void *tz);
]]
v.now = function()
    local tv = ffi.new("reader_timeval")
    ffi.C.gettimeofday(tv, nil)
    return tonumber(tv.tv_sec) + tonumber(tv.tv_usec) / 1000000
end
local function S(n)
    return math.floor(n * (v.ui_scale or 1) + 0.5)
end
v.cursor_arrow = sdl.create_system_cursor(sdl.SYSTEM_CURSOR_ARROW)
v.cursor_hand = sdl.create_system_cursor(sdl.SYSTEM_CURSOR_HAND)
if v.cursor_arrow then sdl.set_cursor(v.cursor_arrow) end

local font_regular = os.getenv("READER_FONT")
    or "assets/fonts/TsangerJinKai02-W04.ttf"
local font_bold = os.getenv("READER_FONT_BOLD")
    or "assets/fonts/TsangerJinKai02-W05.ttf"

local home = os.getenv("HOME") or "."
local data_base = os.getenv("XDG_DATA_HOME") or (home .. "/.local/share")
local data_dir = data_base .. "/native-reader"
os.execute(("mkdir -p %q"):format(data_dir))
local state_file = data_dir .. "/state.lua"
local settings_file = data_dir .. "/settings.lua"

local themes = require("ui.themes")
local store = require("ui.store")
local panel = require("ui.panel")
local renderer = require("ui.renderer")
v.view = require("ui.view")
v.layout = require("ui.layout").new(rd)
v.content = require("ui.content")
local window_file = data_dir .. "/window.lua"
local wgeo = store.load(window_file)
if wgeo and wgeo.w and wgeo.h and wgeo.w >= 480 and wgeo.h >= 480 then
    W, H = math.floor(wgeo.w), math.floor(wgeo.h)
    v.win_w, v.win_h = W, H
    sdl.set_window_size(win, W, H)
    if wgeo.x and wgeo.y and not (wgeo.x == 0 and wgeo.y == 0) then
        sdl.set_window_position(win, math.floor(wgeo.x), math.floor(wgeo.y))
        v.win_x, v.win_y = math.floor(wgeo.x), math.floor(wgeo.y)
    end
    if wgeo.full and wgeo.full ~= 0 then
        v.fs = true
        sdl.set_window_fullscreen(win, true)
    elseif wgeo.max and wgeo.max ~= 0 then
        v.max = true
        v.dual = true
        sdl.maximize_window(win)
    end
    if (v.fs or v.max) then
        v.startup_sync = true
        v.startup_at = v.now() + 0.30
    end
end
local THEMES = themes.THEMES
local THEME_ORDER = themes.ORDER
local THEME_NAMES = themes.NAMES
local FONT_ORDER = themes.FONT_ORDER
local LINE_ORDER = themes.LINE_ORDER
local MARGIN_ORDER = themes.MARGIN_ORDER

local settings = {
    theme = "light",
    font_size = 22,
    line_factor = 1.6,
    margin = 72,
}
for k, val in pairs(store.load(settings_file)) do settings[k] = val end
if not THEMES[settings.theme] then settings.theme = "light" end
settings.font_size = tonumber(settings.font_size) or 22
settings.line_factor = tonumber(settings.line_factor) or 1.6
settings.margin = tonumber(settings.margin) or 72
v.last_line = settings.line_factor
v.last_margin = settings.margin
v.last_theme = settings.theme

local theme = THEMES[settings.theme]
local body_size = settings.font_size

local f_title = ttf.open(font_bold, S(26))
local f_page = ttf.open(font_regular, S(18))
local f_body = ttf.open(font_regular, S(body_size))
if not f_title then f_title = f_page end
if not f_page then f_page = f_title end
if not f_body then f_body = f_page end

local function set_color(c)
    sdl.set_draw_color(ren, c[1], c[2], c[3], c[4] or 255)
end

local progress = store.load(state_file)

local R
local running = true

local tex, tex_w, tex_h = nil, 0, 0
local line_texs = {}
local title_text = ""
local title_tex, title_w, title_h
local page_tex, page_w, page_h

local function teardown_pages()
    if tex then sdl.destroy_texture(tex); tex = nil end
    if v.p2 then sdl.destroy_texture(v.p2); v.p2 = nil end
    if v.pcache then v.pcache:clear() end
    for _, t in ipairs(line_texs) do sdl.destroy_texture(t.tex) end
    line_texs = {}
    if title_tex then sdl.destroy_texture(title_tex); title_tex = nil end
    if page_tex then sdl.destroy_texture(page_tex); page_tex = nil end
    tex_w, tex_h = 0, 0
    v.p2w, v.p2h = 0, 0
end

local toc

local bm

local st

local lib
local remote

local browser

local function book_rec()
    local rec = progress[R.book]
    if not rec then
        rec = {}
        progress[R.book] = rec
    end
    return rec
end

function v.save_progress()
    if not R.book then return end
    local rec = book_rec()
    rec.page = R.page
    rec.updated = os.time()
    if R.chapter_mode and R.chapters and #R.chapters > 0 then
        rec.chapter = R.chapter_idx
        local frac = R.total > 0 and ((R.page + 1) / R.total) or 0
        rec.percent = ((R.chapter_idx - 1) + frac) * 100.0 / #R.chapters
    else
        rec.chapter = nil
        rec.percent = R.total > 0 and ((R.page + 1) * 100.0 / R.total) or 0
    end
    store.save_state(state_file, progress)
end

function v.make_text(text, font, c)
    if not font then return nil, 0, 0 end
    local w, h = ttf.size(font, text)
    local t = ttf.render_texture(ren, font, text, c[1], c[2], c[3], c[4] or 255)
    return t, w, h
end

local toast = require("ui.toast").new({
    sdl = sdl, ffi = ffi, ren = ren, S = S, set_color = set_color,
    make_text = v.make_text, f_page = f_page,
    get_theme = function() return theme end,
    get_wh = function() return W, H end,
    now = v.now, v = v,
})
v.show_toast = function(text, seconds) toast:show(text, seconds) end

header = require("ui.header").new({
    v = v, sdl = sdl, ffi = ffi, S = S,
    get_theme = function() return theme end,
    get_font = function() return f_page end,
    get_w = function() return W end,
    get_wh = function() return W, H end,
    set_color = set_color,
})
local function rebuild_header_actions() header:rebuild() end
rebuild_header_actions()

function v.refresh_text()
    if title_tex then sdl.destroy_texture(title_tex); title_tex = nil end
    title_tex, title_w, title_h = v.make_text(title_text, f_title, theme.ink)

    if page_tex then sdl.destroy_texture(page_tex); page_tex = nil end
    local ptxt
    if R.chapter_mode then
        if (v.fs or v.dual) and R.page + 2 <= R.total then
            ptxt = string.format("第 %d-%d 页", R.page + 1, R.page + 2)
        else
            ptxt = string.format("第 %d 页", R.page + 1)
        end
    elseif (v.fs or v.dual) and not R.is_txt and R.doc and R.page > 0 and R.page + 2 <= R.total then
        ptxt = string.format("%d-%d / %d", R.page + 1, R.page + 2, R.total)
    else
        ptxt = string.format("%d / %d", R.page + 1, R.total)
    end
    if v.zoom and v.zoom ~= 1 then
        ptxt = ptxt .. string.format(" · %d%%", math.floor(v.zoom * 100 + 0.5))
    end
    page_tex, page_w, page_h = v.make_text(ptxt, f_page, theme.muted)
end

local epub = require("ui.epub")
local textutil = require("ui.text")
local txtmod = require("ui.txt")
local utf8_chars = textutil.utf8_chars
local truncate_utf8 = textutil.truncate_utf8

local function txt_line_height()
    return txtmod.line_height(S(settings.font_size), settings.line_factor)
end

toc = require("ui.toc").new({
    v = v, rd = rd, sdl = sdl, ttf = ttf, panel = panel, S = S, ren = ren,
    get_reader = function() return R end,
    get_theme = function() return theme end,
    get_wh = function() return W, H end,
    get_fonts = function() return f_body, f_title, f_page end,
    get_is_txt = function() return R.is_txt end,
    get_total = function() return R.total end,
    get_doc = function() return R.doc end,
    close_others = function() bm:close(); st:close() end,
})

bm = require("ui.bookmarks").new({
    v = v, sdl = sdl, ttf = ttf, panel = panel, S = S, ren = ren,
    get_reader = function() return R end,
    store = store, state_file = state_file,
    get_theme = function() return theme end,
    get_wh = function() return W, H end,
    get_fonts = function() return f_body, f_title, f_page end,
    get_book = function() return R.book end,
    get_page = function() return R.page end,
    get_total = function() return R.total end,
    get_progress = function() return progress end,
    book_rec = book_rec,
    close_others = function() toc:close(); st:close() end,
})

local function close_book()
    toc:close()
    bm:close()
    st:close()
    v.save_progress()
    R:close()
    teardown_pages()
    v.sy = 0
    v.prefetch = nil
    v.pending_layout = false
    v.reflow = false
    v.layout:reset()
    v.content_sig_value = nil
end

local function invert_rgba(pixels, w, h, stride)
    local p = ffi.cast("uint8_t*", pixels)
    for y = 0, h - 1 do
        local base = y * stride
        for x = 0, w - 1 do
            local i = base + x * 4
            p[i] = 255 - p[i]
            p[i + 1] = 255 - p[i + 1]
            p[i + 2] = 255 - p[i + 2]
        end
    end
end

v.spread_mode = function()
    return (v.fs or v.dual) and not R.is_txt and R.doc ~= nil
end

v.view_metrics = function()
    local spread = v.spread_mode()
    local top = v.fs and 0 or S(59)
    local bottom = v.fs and S(42) or S(50)
    local avail_h = H - top - bottom
    local target_w
    if spread then
        local side, gap = S(16), S(5)
        target_w = math.floor((W - 2 * side - gap) / 2)
    else
        target_w = math.max(160, W - S(48))
    end
    return spread, top, bottom, avail_h, target_w
end

v.page_bg_rgb = function()
    if not v.reflow or settings.theme == "dark" then return nil end
    local p = theme.paper
    return p[1], p[2], p[3]
end

v.content_sig = function()
    local spread, _, _, avail_h, target_w = v.view_metrics()
    return v.view.signature({
        spread = spread, target_w = target_w, reflow = v.reflow,
        avail_h = avail_h, zoom = v.zoom,
        font_size = settings.font_size,
        line_factor = settings.line_factor,
        margin = settings.margin,
        dark = settings.theme == "dark",
        page_bg = (v.reflow and settings.theme ~= "dark") and settings.theme or 0,
    })
end

v.max_scroll = function()
    local _, _, _, avail_h = v.view_metrics()
    local mh = math.max(tex_h or 0, v.p2h or 0)
    return math.max(0, mh - avail_h)
end

v.relayout = function(frac)
    if not v.reflow or not R.doc then return end
    local _, _, _, avail_h, target_w = v.view_metrics()
    local layout_w = v.view.layout_width(target_w)
    local margin = math.min(settings.margin, math.floor(layout_w / 8))
    local nt, hit = v.layout:apply(R.doc, layout_w, avail_h,
        settings.font_size, settings.line_factor, margin)
    if hit then return end
    if nt and nt > 0 then
        R.total = nt
        R.page = math.max(0, math.min(R.total - 1,
            math.floor((frac or 0) * R.total)))
    end
end

v.load_links = function(idx)
    local arr = {}
    local raw = rd.page_links(R.doc, idx)
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

v.render_into = function(idx, target_w)
    local pw = rd.page_size(R.doc, idx)
    local z = tonumber(zoom) or 1.2
    if pw and pw > 0 then z = target_w / pw end
    z = math.max(0.05, math.min(8.0, z))
    local br, bg, bb = v.page_bg_rgb()
    local pixels, w, h, stride = rd.render_page(R.doc, idx, z, br, bg, bb)
    if not pixels then return nil end
    if settings.theme == "dark" then
        invert_rgba(pixels, w, h, stride or (w * 4))
    end
    local t = sdl.create_texture(ren, w, h)
    if not t then rd.free(pixels); return nil end
    sdl.update_texture(t, pixels, stride or (w * 4))
    rd.free(pixels)
    return t, w, h
end

function v.load_page(n, keep_scroll)
    local sig = v.content_sig()
    local invalidate = v.pending_layout or sig ~= v.content_sig_value
    if invalidate then
        v.pcache:clear()
        if tex then sdl.destroy_texture(tex); tex = nil end
        if v.p2 then sdl.destroy_texture(v.p2); v.p2 = nil end
    else
        if tex then
            v.pcache:put(sig .. ":" .. R.page, { tex = tex, w = tex_w, h = tex_h })
            tex = nil
        end
        if v.p2 then
            v.pcache:put(sig .. ":" .. (R.page + 1),
                { tex = v.p2, w = v.p2w, h = v.p2h })
            v.p2 = nil
        end
    end
    for _, t in ipairs(line_texs) do sdl.destroy_texture(t.tex) end
    line_texs = {}
    tex_w, tex_h, v.p2w, v.p2h = 0, 0, 0, 0

    if R.is_txt then
        local lines = R.pages and R.pages[n + 1]
        if not lines then return false end
        for _, line in ipairs(lines) do
            local w, h = ttf.size(f_body, line)
            local t = ttf.render_texture(ren, f_body, line,
                theme.text[1], theme.text[2], theme.text[3], 255)
            if t then line_texs[#line_texs + 1] = { tex = t, w = w, h = h } end
        end
        tex_w, tex_h = W, H
        R.page = n
        v.sy = 0
        v.refresh_text()
        v.content_sig_value = v.content_sig()
        print(string.format("[reader] txt page %d/%d", R.page + 1, R.total))
        return true
    end

    if v.pending_layout and v.reflow then
        v.pending_layout = false
        local frac = R.total > 0 and (n / R.total) or 0
        v.relayout(frac)
        n = R.page
    end

    local spread, _, _, _, target_w = v.view_metrics()
    if spread and n == 0 and not R.chapter_mode then
        target_w = math.max(160, W - S(48))
    end
    target_w = math.floor(target_w * v.zoom)
    sig = v.content_sig()
    local ce = v.pcache:take(sig .. ":" .. n)
    if ce then
        tex, tex_w, tex_h = ce.tex, ce.w, ce.h
    else
        tex, tex_w, tex_h = v.render_into(n, target_w)
    end
    if not tex then return false end
    if spread and (n > 0 or R.chapter_mode) and n + 1 < R.total then
        local ce2 = v.pcache:take(sig .. ":" .. (n + 1))
        if ce2 then
            v.p2, v.p2w, v.p2h = ce2.tex, ce2.w, ce2.h
        else
            v.p2, v.p2w, v.p2h = v.render_into(n + 1, target_w)
        end
    end
    R.page = n
    v.pan_x = 0
    v.links = {}
    v.load_links(R.page)
    if v.p2 then v.load_links(R.page + 1) end
    v.sy = keep_scroll and (v.sy or 0) or 0
    v.sy = math.max(0, math.min(v.max_scroll(), v.sy))
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
        tex_w, tex_h, v.p2 and " (+1)" or ""))
    return true
end

local function url_decode(s)
    return (s:gsub("%%(%x%x)", function(h)
        return string.char(tonumber(h, 16))
    end))
end

R = require("ui.reader").new({
    v = v, rd = rd, ttf = ttf, ffi = ffi, S = S, settings = settings,
    epub = epub, txtmod = txtmod, utf8_chars = utf8_chars,
    truncate_utf8 = truncate_utf8,
    get_w = function() return W end,
    get_h = function() return H end,
    get_font_body = function() return f_body end,
    get_progress = function() return progress end,
    save_progress = function() v.save_progress() end,
    refresh_text = function() v.refresh_text() end,
    load_page = function(n, k) return v.load_page(n, k) end,
    close_panels = function() v.close_panels() end,
    reset_book = function() close_book() end,
    teardown_pages = function() teardown_pages() end,
    set_title = function(t) title_text = t end,
})
v.open_book = function(path, start) return R:open_book(path, start) end
v.open_chapter = function(idx, p) return R:open_chapter(idx, p) end
v.normalize_book_path = function(path) return R:normalize(path) end

local function draw_page()
    v.content.draw({
        sdl = sdl, ffi = ffi, ren = ren, W = W, H = H, S = S,
        set_color = set_color,
        is_txt = R.is_txt, settings = settings, theme = theme,
        line_texs = line_texs, tex = tex, tex_w = tex_w, tex_h = tex_h,
        v = v, page = R.page, total = R.total,
        txt_line_height = txt_line_height,
        title_tex = title_tex, title_w = title_w, title_h = title_h,
        page_tex = page_tex, page_w = page_w, page_h = page_h,
        header = header,
    })
end

local function cycle(list, value, delta)
    local idx = 1
    for i, v in ipairs(list) do
        if v == value then idx = i end
    end
    idx = ((idx - 1 + delta) % #list) + 1
    return list[idx]
end

local function apply_settings()
    local font_changed = body_size ~= settings.font_size
    local line_changed = v.last_line ~= settings.line_factor
    local margin_changed = v.last_margin ~= settings.margin
    local old_dark = theme == THEMES.dark
    local old_theme = v.last_theme

    if font_changed then
        local nf = ttf.open(font_regular, S(settings.font_size)) or f_page
        local old = f_body
        f_body = nf
        body_size = settings.font_size
        if old and old ~= f_page and old ~= nf then ttf.close(old) end
    end
    theme = THEMES[settings.theme] or THEMES.light
    local new_dark = theme == THEMES.dark
    v.last_line = settings.line_factor
    v.last_margin = settings.margin
    v.last_theme = settings.theme

    rebuild_header_actions()
    store.save_settings(settings_file, settings)

    local style_changed = font_changed or line_changed or margin_changed
    if R.total > 0 then
        if R.is_txt then
            R:build_txt(R.book)
            R.page = math.max(0, math.min(R.total - 1, R.page))
            v.load_page(R.page)
        elseif R.reflow and style_changed then
            R:restyle()
        elseif v.pending_layout or old_dark ~= new_dark
            or (v.reflow and old_theme ~= settings.theme) then
            v.load_page(R.page)
        end
    end
    v.refresh_text()
    if st and st.open then st:refresh() end
    if lib and lib.open then lib:refresh() end
end

st = require("ui.settings").new({
    v = v, sdl = sdl, ttf = ttf, panel = panel, ren = ren, S = S,
    get_theme = function() return theme end,
    get_wh = function() return W, H end,
    get_fonts = function() return f_body, f_title, f_page end,
    get_settings = function() return settings end,
    get_list_layout = function() return toc.top, toc.line_h end,
    close_others = function() toc:close(); bm:close() end,
    apply = function() apply_settings() end,
})

lib = require("ui.bookshelf").new({
    v = v, sdl = sdl, ttf = ttf, panel = panel, ffi = ffi, ren = ren, S = S,
    set_color = set_color, library = library,
    get_theme = function() return theme end,
    get_wh = function() return W, H end,
    get_fonts = function() return f_body, f_title, f_page end,
    get_home = function() return home end,
    get_progress = function() return progress end,
    save_state = function() store.save_state(state_file, progress) end,
    save_progress = function() v.save_progress() end,
    close_book = function() close_book() end,
    open_book = function(path, start) return v.open_book(path, start) end,
    close_others = function() toc:close(); bm:close(); st:close() end,
    open_settings = function() st:show() end,
    choose_book = function() v.choose_book() end,
    quit = function() running = false end,
})

browser = require("ui.browser").new({
    v = v, rd = rd, sdl = sdl, ttf = ttf, panel = panel, ffi = ffi, ren = ren, S = S,
    get_theme = function() return theme end,
    get_wh = function() return W, H end,
    get_fonts = function() return f_body, f_title, f_page end,
    get_home = function() return home end,
    get_book = function() return R.book end,
    get_last_dir = function() return v.last_browse_dir end,
    set_last_dir = function(d) v.last_browse_dir = d end,
    open_book = function(path, start) return v.open_book(path, start) end,
    close_others = function() toc:close(); bm:close(); st:close() end,
    close_library = function() if lib.open then lib:close() end end,
    mark_dirty = function() v.dirty = true end,
})
v.open_browser = function(start) browser:show(start) end

v.choose_book = function()
    local cmd
    if os.execute("command -v zenity >/dev/null 2>&1") == 0 then
        cmd = string.format('zenity --file-selection --title=%q --filename=%q',
            "选择电子书", (v.last_browse_dir or home) .. "/")
    elseif os.execute("command -v kdialog >/dev/null 2>&1") == 0 then
        cmd = string.format('kdialog --getopenfilename %q', v.last_browse_dir or home)
    else
        v.open_browser()
        return
    end
    if v.dialog then return end
    local out = os.tmpname()
    local done = out .. ".done"
    os.remove(out)
    os.remove(done)
    os.execute(string.format(
        "( timeout 300 %s > %q 2>/dev/null; : > %q ) &", cmd, out, done))
    v.dialog = { out = out, done = done, started = v.now() }
    v.show_toast("请选择电子书…", 2)
end

v.close_panels = function()
    if toc.open then toc:close() end
    if bm.open then bm:close() end
    if st.open then st:close() end
    if browser.open then browser:close() end
    if lib.open then
        lib:close()
    end
end

local function render_frame()
    local kind = renderer.kind({
        browser = browser.open,
        toc = toc.open,
        bookmarks = bm.open,
        settings = st.open,
        library = lib.open,
    })
    renderer.draw(kind, {
        browser = function() browser:draw() end,
        toc = function() toc:draw() end,
        bookmarks = function() bm:draw() end,
        settings = function() st:draw() end,
        library = function() lib:draw() end,
        content = draw_page,
    })
    toast:draw()
end

local function draw()
    render_frame()
    sdl.render_present(ren)
end

local function turn(delta)
    local n
    if v.spread_mode() then
        if R.chapter_mode then
            n = (delta > 0) and (R.page + 2) or (R.page - 2)
        elseif delta > 0 then
            n = (R.page == 0) and 1 or (R.page + 2)
        else
            n = (R.page <= 1) and 0 or (R.page - 2)
        end
    else
        n = R.page + delta
    end

    if R.chapter_mode and R.chapters then
        if delta > 0 and n >= R.total then
            if R.chapter_idx < #R.chapters then
                v.open_chapter(R.chapter_idx + 1, 0)
                v.save_progress()
            end
            return
        elseif delta < 0 and n < 0 then
            if R.chapter_idx > 1 then
                v.open_chapter(R.chapter_idx - 1, -1)
                v.save_progress()
            end
            return
        end
    end

    if n < 0 then n = 0 end
    if n >= R.total then return end
    if n ~= R.page then
        v.load_page(n)
        v.save_progress()
    end
end

v.scroll_by = function(dy)
    if R.is_txt or not tex then return end
    local maxs = v.max_scroll()
    if maxs <= 0 then
        if dy > 0 then turn(1) elseif dy < 0 then turn(-1) end
        return
    end
    if dy > 0 and v.sy >= maxs then
        turn(1)
    elseif dy < 0 and v.sy <= 0 then
        turn(-1)
    else
        v.sy = math.max(0, math.min(maxs, v.sy + dy))
    end
end

v.set_zoom = function(z)
    z = math.max(0.5, math.min(3.0, z))
    if math.abs(z - v.zoom) < 0.001 then return end
    v.zoom = z
    v.pan_x = 0
    v.sy = 0
    if R.book then v.load_page(R.page) end
    v.dirty = true
end

v.pan = function(dx)
    local total_w = tex_w + (v.p2 and (S(5) + v.p2w) or 0)
    local maxp = math.max(0, math.floor((total_w - W) / 2))
    v.pan_x = math.max(-maxp, math.min(maxp, (v.pan_x or 0) + dx))
    v.dirty = true
end

v.toggle_fs = function()
    if not v.fs and v.max then
        v.max = false
        sdl.restore_window(win)
        sdl.delay(40)
    end
    v.fs = not v.fs
    sdl.set_window_fullscreen(win, v.fs)
    sdl.delay(60)
    v.resize_pending = true
    v.resize_due = v.now() + 0.05
    v.resize_target_w, v.resize_target_h = v.window_target_size()
    v.resize_last_w, v.resize_last_h = nil, nil
    rebuild_header_actions()
    if lib and lib.open then lib:refresh() end
    v.dirty = true
end

v.toggle_max = function()
    if v.fs then
        v.fs = false
        sdl.set_window_fullscreen(win, false)
        sdl.delay(60)
    end
    v.max = not v.max
    v.dual = v.max
    v.auto_dual = v.max
    if v.max then
        sdl.maximize_window(win)
    else
        sdl.restore_window(win)
    end
    sdl.delay(80)
    v.resize_pending = true
    v.resize_due = v.now() + 0.05
    v.resize_target_w, v.resize_target_h = v.window_target_size()
    v.resize_last_w, v.resize_last_h = nil, nil
    rebuild_header_actions()
    if lib and lib.open then lib:refresh() end
    v.dirty = true
end

local function toggle_dual()
    v.dual = not v.dual
    rebuild_header_actions()
    if lib and lib.open then lib:refresh() end
    v.sy = 0
    v.pending_layout = v.reflow
    if R.book then v.load_page(R.page) end
    v.refresh_text()
end

local function toggle_eye()
    settings.theme = cycle(THEME_ORDER, settings.theme, 1)
    apply_settings()
end

local function go_back()
    if browser.open then
        browser:close()
    elseif toc.open then
        toc:close()
    elseif bm.open then
        bm:close()
    elseif st.open then
        st:close()
    elseif v.fs then
        v.toggle_fs()
    elseif v.max then
        v.toggle_max()
    elseif R.book then
        lib:show()
    end
end

v.ensure_content_size = function()
    local dirty = false
    if lib.open and (lib.ui_w ~= W or lib.ui_h ~= H) then
        lib:refresh()
        dirty = true
    end
    if R.book and not R.is_txt and tex then
        local spread, _, _, _, tw = v.view_metrics()
        if spread and R.page == 0 then tw = math.max(160, W - S(48)) end
        local expected = math.floor(tw * (v.zoom or 1) + 0.5)
        if math.abs((tex_w or 0) - expected) > 2 or
           (v.p2 and math.abs((v.p2w or 0) - expected) > 2) then
            v.pending_layout = v.reflow
            v.load_page(R.page)
            dirty = true
        end
    end
    return dirty
end

local function apply_resize(nw, nh)
    local mode_changed = false
    if not v.fs then
        local flags = sdl.get_window_flags(win)
        local ismax = require("bit").band(flags, sdl.WINDOW_MAXIMIZED) ~= 0
        if ismax then
            if not v.max then
                v.auto_dual = not v.dual
                mode_changed = true
            end
            v.max = true
            v.dual = true
        else
            if v.max then
                if v.auto_dual then v.dual = false end
                v.auto_dual = false
                mode_changed = true
            end
            v.max = false
        end
    end

    if not nw or not nh or nw <= 0 or nh <= 0 then
        nw, nh = v.window_target_size()
    end
    if not nw or nw <= 0 or nh <= 0 then
        if not mode_changed then return false end
        nw, nh = W, H
    end
    local size_changed = nw ~= W or nh ~= H
    if not size_changed and not mode_changed and not v.pending_layout then
        return false
    end
    W, H = nw, nh
    sync_scale()
    if not v.fs and not v.max then
        local ww, wh = sdl.get_window_size(win)
        v.win_w, v.win_h = ww or nw, wh or nh
        v.win_x, v.win_y = sdl.get_window_position(win)
    end

    if R.is_txt and R.book and size_changed then
        R:build_txt(R.book)
        R.page = math.max(0, math.min(R.total - 1, R.page))
    end
    local sig = v.content_sig()
    local content_changed = sig ~= v.content_sig_value or v.pending_layout
    rebuild_header_actions()
    if lib and lib.open then lib:refresh() end
    v.sy = 0
    if R.book and content_changed then
        v.pending_layout = v.reflow
        v.load_page(R.page)
    else
        v.content_sig_value = sig
        v.refresh_text()
    end
    return true
end

if v.startup_sync and shot == "" then
    v.pending_initial = { book = initial_book, page = initial_page }
elseif initial_book ~= "" then
    local ok, err = v.open_book(initial_book, initial_page)
    if not ok then error("open failed: " .. tostring(err)) end
else
    lib:show()
end

local screenshot = require("ui.screenshot").new({
    v = v, rd = rd, sdl = sdl, ren = ren, S = S, settings = settings,
    get_w = function() return W end,
    get_h = function() return H end,
    get_page = function() return R.page end,
    get_tex = function() return tex, tex_w end,
    get_is_txt = function() return R.is_txt end,
    get_doc = function() return R.doc end,
    get_book = function() return R.book end,
    get_theme = function() return theme end,
    invert_rgba = function(pixels, w, h, stride) invert_rgba(pixels, w, h, stride) end,
    draw = function() draw() end,
    show_toast = function(text, secs) v.show_toast(text, secs) end,
})
v.snapshot_path = function() return screenshot:path() end
v.save_content_snapshot = function(path) return screenshot:save_content(path) end
v.take_snapshot = function() return screenshot:take() end

local input = require("ui.input").new({
    v = v, sdl = sdl, rd = rd, S = S, header = header,
    browser = browser, toc = toc, bm = bm, st = st, lib = lib,
    get_page = function() return R.page end,
    get_tex_h = function() return tex_h end,
    get_is_txt = function() return R.is_txt end,
    get_doc = function() return R.doc end,
    get_w = function() return W end,
    turn = function(n) turn(n) end,
    go_back = function() go_back() end,
    toggle_dual = function() toggle_dual() end,
    toggle_eye = function() toggle_eye() end,
    choose_book = function() v.choose_book() end,
    take_snapshot = function() v.take_snapshot() end,
    quit = function() running = false end,
})

remote = require("ui.remote").new({
    v = v, rd = rd, settings = settings, lib = lib, toc = toc, bm = bm, st = st,
    reader = R,
    get_page = function() return R.page end,
    get_total = function() return R.total end,
    get_book = function() return R.book end,
    get_is_txt = function() return R.is_txt end,
    get_pages = function() return R.pages end,
    get_doc = function() return R.doc end,
    get_w = function() return W end,
    get_h = function() return H end,
    validate_theme = function(t) return THEMES[t] ~= nil end,
    turn = function(n) turn(n) end,
    toggle_dual = function() toggle_dual() end,
    toggle_eye = function() toggle_eye() end,
    close_book = function() close_book() end,
    open_book = function(path, pg) return v.open_book(path, pg) end,
    apply_settings = function() apply_settings() end,
    draw = function() draw() end,
    capture = function(path)
        render_frame()
        local ok = sdl.capture(ren, W, H, path, rd)
        sdl.render_present(ren)
        return ok
    end,
    quit = function() running = false end,
})

local server = nil
if shot == "" then
    local sock = os.getenv("READER_AUTOMATION_SOCK")
        or "/tmp/native-reader-automation.sock"
    local ok_srv, s = pcall(automation.start, sock, {
        actions = function() return remote:actions() end,
        state = function() return remote:state() end,
        click = function(id)
            local r = remote:click(id)
            v.dirty = true
            return r
        end,
        call = function(fn, args)
            local r = remote:call(fn, args)
            v.dirty = true
            return r
        end,
    })
    if ok_srv then
        server = s
        print("[reader] automation: " .. sock)
    else
        io.stderr:write("[reader] automation disabled: " .. tostring(s) .. "\n")
    end
end

local function cleanup()
    if server then server:stop(); server = nil end
    if browser.open then browser:close() end
    v.save_progress()
    close_book()
    if lib.open then lib:destroy() end
    header:destroy()
    toast:clear()
    local seen = {}
    for _, f in ipairs({ f_title, f_page, f_body }) do
        if f and not seen[f] then
            seen[f] = true
            ttf.close(f)
        end
    end
    local wx, wy = sdl.get_window_position(win)
    if v.fs or v.max then
        wx, wy = v.win_x, v.win_y
    end
    store.save_window(window_file, {
        w = v.win_w, h = v.win_h, x = wx, y = wy,
        max = v.max and 1 or 0, full = v.fs and 1 or 0,
    })
    ttf.quit()
    sdl.destroy_renderer(ren)
    sdl.destroy_window(win)
    sdl.free_cursor(v.cursor_hand); v.cursor_hand = nil
    sdl.free_cursor(v.cursor_arrow); v.cursor_arrow = nil
    sdl.quit()
end

if shot ~= "" then
    for _ = 1, math.max(1, frames) do
        draw()
        sdl.delay(16)
    end
    if sdl.capture(ren, W, H, shot, rd) then
        print("screenshot: " .. shot)
    else
        io.stderr:write("screenshot failed\n")
    end
    cleanup()
    os.exit(0)
end

local ev = ffi.new("SDL_Event[1]")
while running do
    if server then server:poll() end

    while sdl.poll_event(ev) ~= 0 do
        if ev[0].type ~= sdl.MOUSEMOTION then v.had_event = true end
        input:handle(ev[0])
    end

    local now = v.now()
    toast:tick(now)
    if v.dialog then
        local df = io.open(v.dialog.done, "rb")
        if df then
            df:close()
            local pf = io.open(v.dialog.out, "rb")
            local chosen = pf and pf:read("*l") or nil
            if pf then pf:close() end
            os.remove(v.dialog.out)
            os.remove(v.dialog.done)
            v.dialog = nil
            if chosen and chosen ~= "" then
                local ok, err = v.open_book(chosen, nil)
                if not ok then
                    print("open failed: " .. tostring(err))
                    v.show_toast("打开失败：" .. tostring(err), 3)
                end
            end
            v.dirty = true
        elseif now >= (v.dialog.started or now) + 310 then
            os.remove(v.dialog.out)
            os.remove(v.dialog.done)
            v.dialog = nil
            v.dirty = true
        end
    end
    if v.startup_sync and now >= v.startup_at then
        v.startup_sync = false
        local nw, nh = v.window_target_size()
        if nw and nh and nw > 0 and nh > 0 then W, H = nw, nh end
        rebuild_header_actions()
        local pending = v.pending_initial
        v.pending_initial = nil
        if pending then
            if pending.book and pending.book ~= "" then
                local ok, err = v.open_book(pending.book, pending.page)
                if not ok then error("open failed: " .. tostring(err)) end
            else
                lib:show()
            end
        else
            if lib and lib.open then lib:refresh() end
            v.sy = 0
            v.pending_layout = v.reflow
            if R.book then v.load_page(R.page) end
            v.refresh_text()
        end
        v.dirty = true
    end
    if not v.resize_pending and now >= (v.sync_at or 0) then
        v.sync_at = now + 0.5
        if apply_resize() then v.dirty = true end
        if v.ensure_content_size() then v.dirty = true end
    end
    if v.resize_pending and v.now() >= v.resize_due then
        local nw, nh = v.resize_target_w, v.resize_target_h
        if not nw or not nh then nw, nh = v.window_target_size() end
        if nw and nh and nw > 0 and nh > 0 then
            if v.resize_last_w ~= nw or v.resize_last_h ~= nh then
                v.resize_target_w, v.resize_target_h = nw, nh
                v.resize_last_w, v.resize_last_h = nw, nh
                v.resize_due = v.now() + 0.10
            else
                v.resize_pending = false
                apply_resize(nw, nh)
                v.dirty = true
            end
        else
            v.resize_pending = false
        end
    end
    if v.had_event then
        v.dirty = true
        v.had_event = false
    end
    if not v.dirty and v.prefetch then
        local P = v.prefetch
        v.prefetch = nil
        if R.doc and not R.is_txt and P.sig == v.content_sig() and P.page < R.total then
            local key = P.sig .. ":" .. P.page
            if not v.pcache.map[key] then
                local t, w, h = v.render_into(P.page, P.target_w)
                if t then v.pcache:put(key, { tex = t, w = w, h = h }) end
            end
        end
    end
    v.drew = false
    if v.dirty then
        draw()
        v.dirty = false
        v.drew = true
    end
    sdl.delay(v.drew and 16 or 30)
end

cleanup()
