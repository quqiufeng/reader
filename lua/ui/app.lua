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
    rects = {}, links = {}, search_cache = {},
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

local book
local doc = nil
local total = 0
local pages = nil
local is_txt = false
local page = 0
local running = true

v.snapshot_path = function()
    local home = os.getenv("HOME") or "/tmp"
    local name = book and book:match("([^/]+)$") or "reader"
    name = name:gsub("%.[%w]+$", "")
    name = name:gsub('[\\/:*?"<>|%c]', "_")
    if name == "" then name = "reader" end

    local p1 = page + 1
    local p2 = v.p2 and (page + 2) or nil
    local label = p2 and string.format("%d_%d", p1, p2)
                       or string.format("%d", p1)
    local base = string.format("%s/%s_%s", home, name, label)
    local path = base .. ".png"
    local i = 1
    while true do
        local f = io.open(path, "rb")
        if not f then break end
        f:close()
        path = string.format("%s-%d.png", base, i)
        i = i + 1
    end
    return path
end

local tex, tex_w, tex_h = nil, 0, 0
local line_texs = {}
local title_text = ""
local title_tex, title_w, title_h
local page_tex, page_w, page_h

local hdr_toc_tex, hdr_toc_w, hdr_toc_h
local hdr_bm_tex, hdr_bm_w, hdr_bm_h
local hdr_st_tex, hdr_st_w, hdr_st_h
local hdr_bm_x, hdr_toc_x, hdr_st_x

local toc = {
    open = false,
    items = {},
    selected = 1,
    first = 1,
    texs = {},
    line_h = S(34),
    visible = 20,
    top = S(120),
}

local bm_open = false
local bm_items = {}
local bm_selected = 1
local bm_first = 1
local bm_texs = {}
local bm_title_tex, bm_title_w, bm_title_h
local bm_count_tex, bm_count_w, bm_count_h
local bm_hint_tex, bm_hint_w, bm_hint_h
local bm_empty_tex, bm_empty_w, bm_empty_h

local st_open = false
local st_selected = 1
local st_texs = {}
local st_title_tex, st_title_w, st_title_h
local st_hint_tex, st_hint_w, st_hint_h

local search = {
    open = false,
    query = "",
    results = {},
    selected = 1,
    first = 1,
    texs = {},
    line_h = S(34),
    visible = 16,
    top = S(180),
}

local lib = {
    open = false,
    items = {},
    selected = 1,
    first = 1,
    texs = {},
    dir = "",
    line_h = S(44),
    visible = 12,
    top = S(120),
    open_tex = nil, open_w = 0, open_h = 0, open_x = 0,
    clear_tex = nil, clear_w = 0, clear_h = 0, clear_x = 0,
    ui_w = 0, ui_h = 0,
}

local browser = {
    open = false,
    dir = "",
    items = {},
    selected = 1,
    first = 1,
    texs = {},
    line_h = S(40),
    visible = 14,
    top = S(120),
    title_tex = nil, title_w = 0, title_h = 0,
    count_tex = nil, count_w = 0, count_h = 0,
    hint_tex = nil, hint_w = 0, hint_h = 0,
    empty_tex = nil, empty_w = 0, empty_h = 0,
}

local refresh_lib_texts = nil

local function book_rec()
    local rec = progress[book]
    if not rec then
        rec = {}
        progress[book] = rec
    end
    return rec
end

local function save_progress()
    if not book then return end
    local rec = book_rec()
    rec.page = page
    rec.updated = os.time()
    rec.percent = total > 0 and ((page + 1) * 100.0 / total) or 0
    store.save_state(state_file, progress)
end

local function make_text(text, font, c)
    if not font then return nil, 0, 0 end
    local w, h = ttf.size(font, text)
    local t = ttf.render_texture(ren, font, text, c[1], c[2], c[3], c[4] or 255)
    return t, w, h
end

v.show_toast = function(text, seconds)
    if v.toast_tex then sdl.destroy_texture(v.toast_tex); v.toast_tex = nil end
    v.toast = text
    v.toast_tex, v.toast_w, v.toast_h = make_text(text, f_page, theme.text)
    v.toast_until = v.now() + (seconds or 3)
    v.dirty = true
end

local function draw_toast()
    if not v.toast or not v.toast_tex then return end
    if v.now() >= (v.toast_until or 0) then return end
    local pad = S(18)
    local bw = v.toast_w + pad * 2
    local bh = v.toast_h + pad
    local x = math.floor((W - bw) / 2)
    local y = H - bh - S(70)
    local box = ffi.new("SDL_Rect")
    box.x, box.y, box.w, box.h = x, y, bw, bh
    set_color(theme.card)
    sdl.render_fill_rect(ren, box)
    set_color(theme.line)
    sdl.render_draw_rect(ren, box)
    local tr = ffi.new("SDL_Rect")
    tr.x, tr.y, tr.w, tr.h = x + pad, y + math.floor(pad / 2), v.toast_w, v.toast_h
    sdl.render_copy(ren, v.toast_tex, nil, tr)
end

local function rebuild_header_actions()
    if hdr_toc_tex then sdl.destroy_texture(hdr_toc_tex); hdr_toc_tex = nil end
    if hdr_bm_tex then sdl.destroy_texture(hdr_bm_tex); hdr_bm_tex = nil end
    if hdr_st_tex then sdl.destroy_texture(hdr_st_tex); hdr_st_tex = nil end
    if v.fs_tex then sdl.destroy_texture(v.fs_tex); v.fs_tex = nil end
    if v.max_tex then sdl.destroy_texture(v.max_tex); v.max_tex = nil end
    if v.eye_tex then sdl.destroy_texture(v.eye_tex); v.eye_tex = nil end
    if v.dual_tex then sdl.destroy_texture(v.dual_tex); v.dual_tex = nil end
    if v.shot_tex then sdl.destroy_texture(v.shot_tex); v.shot_tex = nil end
    if v.hdr_open_tex then sdl.destroy_texture(v.hdr_open_tex); v.hdr_open_tex = nil end
    hdr_toc_tex, hdr_toc_w, hdr_toc_h = make_text("目录", f_page, theme.muted)
    hdr_bm_tex, hdr_bm_w, hdr_bm_h = make_text("书签", f_page, theme.muted)
    hdr_st_tex, hdr_st_w, hdr_st_h = make_text("设置", f_page, theme.muted)
    v.fs_tex, v.fs_w, v.fs_h = make_text("全屏", f_page, theme.muted)
    v.max_tex, v.max_w, v.max_h = make_text(v.max and "还原" or "最大化", f_page, theme.muted)
    v.eye_tex, v.eye_w, v.eye_h = make_text("换色", f_page, theme.muted)
    v.dual_tex, v.dual_w, v.dual_h = make_text(
        (v.fs or v.dual) and "单栏" or "双栏", f_page, theme.muted)
    v.shot_tex, v.shot_w, v.shot_h = make_text("截图", f_page, theme.muted)
    v.hdr_open_tex, v.hdr_open_w, v.hdr_open_h = make_text("打开", f_page, theme.muted)
    v.fs_x = W - S(24) - (v.fs_w or 0)
    v.max_x = v.fs_x - S(14) - (v.max_w or 0)
    v.eye_x = v.max_x - S(14) - (v.eye_w or 0)
    v.dual_x = v.eye_x - S(14) - (v.dual_w or 0)
    v.shot_x = v.dual_x - S(14) - (v.shot_w or 0)
    v.hdr_open_x = v.shot_x - S(14) - (v.hdr_open_w or 0)
    hdr_bm_x = v.hdr_open_x - S(14) - (hdr_bm_w or 0)
    hdr_toc_x = hdr_bm_x - S(14) - (hdr_toc_w or 0)
    hdr_st_x = hdr_toc_x - S(14) - (hdr_st_w or 0)
end
rebuild_header_actions()

local function refresh_text()
    if title_tex then sdl.destroy_texture(title_tex); title_tex = nil end
    title_tex, title_w, title_h = make_text(title_text, f_title, theme.ink)

    if page_tex then sdl.destroy_texture(page_tex); page_tex = nil end
    local pct = total > 0 and ((page + 1) * 100.0 / total) or 0
    local ptxt
    if (v.fs or v.dual) and not is_txt and doc and page > 0 and page + 2 <= total then
        ptxt = string.format("%d-%d / %d · %.1f%%", page + 1, page + 2, total, pct)
    else
        ptxt = string.format("%d / %d · %.1f%%", page + 1, total, pct)
    end
    if v.zoom and v.zoom ~= 1 then
        ptxt = ptxt .. string.format(" · %d%%", math.floor(v.zoom * 100 + 0.5))
    end
    page_tex, page_w, page_h = make_text(ptxt, f_page, theme.muted)
end

local textutil = require("ui.text")
local txtmod = require("ui.txt")
local utf8_chars = textutil.utf8_chars
local truncate_utf8 = textutil.truncate_utf8
local remove_last_utf8 = textutil.remove_last_utf8

local function search_txt(q, start_page, max_hits)
    local out = {}
    if q == "" or not pages or total <= 0 then return out end
    local ql = q:lower()
    local hits = 0
    for k = 0, total - 1 do
        local p = (start_page + k) % total
        local lines = pages[p + 1] or {}
        local count = 0
        local snippet = ""
        for _, line in ipairs(lines) do
            if line:lower():find(ql, 1, true) then
                count = count + 1
                if snippet == "" then snippet = line end
            end
        end
        if count > 0 then
            out[#out + 1] = {
                page = p,
                count = count,
                snippet = truncate_utf8(snippet, 32),
            }
            hits = hits + count
            if hits >= max_hits then break end
        end
    end
    return out
end

local function txt_line_height()
    return txtmod.line_height(S(settings.font_size), settings.line_factor)
end

local function build_txt_pages(path)
    local pgs, tot, err = txtmod.paginate(path, {
        ttf = ttf, font = f_body,
        width = W, height = H, top = S(96), bottom = S(80),
        margin = S(settings.margin), font_size = S(settings.font_size),
        line_factor = settings.line_factor, utf8_chars = utf8_chars,
    })
    if not pgs then return false, err end
    pages = pgs
    total = tot
    return true
end

local function destroy_toc()
    for _, t in ipairs(toc.texs) do sdl.destroy_texture(t.tex) end
    toc.texs = {}
    if toc.title_tex then sdl.destroy_texture(toc.title_tex); toc.title_tex = nil end
    if toc.count_tex then sdl.destroy_texture(toc.count_tex); toc.count_tex = nil end
    if toc.hint_tex then sdl.destroy_texture(toc.hint_tex); toc.hint_tex = nil end
    if toc.empty_tex then sdl.destroy_texture(toc.empty_tex); toc.empty_tex = nil end
end

local function destroy_bm()
    for _, t in ipairs(bm_texs) do sdl.destroy_texture(t.tex) end
    bm_texs = {}
    if bm_title_tex then sdl.destroy_texture(bm_title_tex); bm_title_tex = nil end
    if bm_count_tex then sdl.destroy_texture(bm_count_tex); bm_count_tex = nil end
    if bm_hint_tex then sdl.destroy_texture(bm_hint_tex); bm_hint_tex = nil end
    if bm_empty_tex then sdl.destroy_texture(bm_empty_tex); bm_empty_tex = nil end
end

local function destroy_st()
    for _, t in ipairs(st_texs) do sdl.destroy_texture(t.tex) end
    st_texs = {}
    if st_title_tex then sdl.destroy_texture(st_title_tex); st_title_tex = nil end
    if st_hint_tex then sdl.destroy_texture(st_hint_tex); st_hint_tex = nil end
end

local function close_toc()
    destroy_toc()
    toc.open = false
    toc.items = {}
end

local function close_bm()
    destroy_bm()
    bm_open = false
    bm_items = {}
end

local function close_st()
    destroy_st()
    st_open = false
end

local function close_book()
    close_toc()
    close_bm()
    close_st()
    save_progress()
    if tex then sdl.destroy_texture(tex); tex = nil end
    if v.p2 then sdl.destroy_texture(v.p2); v.p2 = nil end
    if v.pcache then v.pcache:clear() end
    for _, t in ipairs(line_texs) do sdl.destroy_texture(t.tex) end
    line_texs = {}
    if title_tex then sdl.destroy_texture(title_tex); title_tex = nil end
    if page_tex then sdl.destroy_texture(page_tex); page_tex = nil end
    if doc then rd.close(doc); doc = nil end
    pages = nil
    total = 0
    page = 0
    tex_w, tex_h = 0, 0
    v.p2w, v.p2h = 0, 0
    v.sy = 0
    v.pending_layout = false
    v.reflow = false
    v.layout:reset()
    v.content_sig_value = nil
    v.search_cache = {}
    book = nil
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
    return (v.fs or v.dual) and not is_txt and doc ~= nil
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
    if not v.reflow or not doc then return end
    local _, _, _, avail_h, target_w = v.view_metrics()
    local layout_w = v.view.layout_width(target_w)
    local margin = math.min(settings.margin, math.floor(layout_w / 8))
    local nt, hit = v.layout:apply(doc, layout_w, avail_h,
        settings.font_size, settings.line_factor, margin)
    if hit then return end
    if nt and nt > 0 then
        total = nt
        page = math.max(0, math.min(total - 1,
            math.floor((frac or 0) * total)))
        v.search_cache = {}
    end
end

v.load_links = function(idx)
    local arr = {}
    local raw = rd.page_links(doc, idx)
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
    local pw = rd.page_size(doc, idx)
    local z = tonumber(zoom) or 1.2
    if pw and pw > 0 then z = target_w / pw end
    z = math.max(0.05, math.min(8.0, z))
    local br, bg, bb = v.page_bg_rgb()
    local pixels, w, h, stride = rd.render_page(doc, idx, z, br, bg, bb)
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

v.save_content_snapshot = function(path)
    if is_txt then
        local card_x = math.max(S(24), S(settings.margin - 24))
        local card_top = v.fs and S(24) or S(72)
        local w = W - 2 * card_x
        local h = H - card_top - S(64)
        return sdl.capture_rect(ren, card_x, card_top, w, h, path, rd)
    end
    if not doc or not tex then return false end

    local function shot(idx, target_w)
        if not target_w or target_w <= 0 then return nil end
        local pw = rd.page_size(doc, idx)
        if not pw or pw <= 0 then return nil end
        local br, bg, bb = v.page_bg_rgb()
        local pixels, w, h, stride = rd.render_page(doc, idx, target_w / pw, br, bg, bb)
        if not pixels then return nil end
        if settings.theme == "dark" then
            invert_rgba(pixels, w, h, stride or (w * 4))
        end
        return pixels, w, h
    end

    local a, aw, ah = shot(page, tex_w)
    if not a then return false end
    local b, bw, bh
    if v.p2 then b, bw, bh = shot(page + 1, v.p2w) end
    local ok = rd.save_pages_png(path, a, aw, ah, b, bw, bh, theme.paper, 0)
    rd.free(a)
    if b then rd.free(b) end
    return ok
end

local function load_page(n, keep_scroll)
    local sig = v.content_sig()
    local invalidate = v.pending_layout or sig ~= v.content_sig_value
    if invalidate then
        v.pcache:clear()
        if tex then sdl.destroy_texture(tex); tex = nil end
        if v.p2 then sdl.destroy_texture(v.p2); v.p2 = nil end
    else
        if tex then
            v.pcache:put(sig .. ":" .. page, { tex = tex, w = tex_w, h = tex_h })
            tex = nil
        end
        if v.p2 then
            v.pcache:put(sig .. ":" .. (page + 1),
                { tex = v.p2, w = v.p2w, h = v.p2h })
            v.p2 = nil
        end
    end
    for _, t in ipairs(line_texs) do sdl.destroy_texture(t.tex) end
    line_texs = {}
    tex_w, tex_h, v.p2w, v.p2h = 0, 0, 0, 0

    if is_txt then
        local lines = pages and pages[n + 1]
        if not lines then return false end
        for _, line in ipairs(lines) do
            local w, h = ttf.size(f_body, line)
            local t = ttf.render_texture(ren, f_body, line,
                theme.text[1], theme.text[2], theme.text[3], 255)
            if t then line_texs[#line_texs + 1] = { tex = t, w = w, h = h } end
        end
        tex_w, tex_h = W, H
        page = n
        v.sy = 0
        refresh_text()
        v.content_sig_value = v.content_sig()
        print(string.format("[reader] txt page %d/%d", page + 1, total))
        return true
    end

    if v.pending_layout and v.reflow then
        v.pending_layout = false
        local frac = total > 0 and (n / total) or 0
        v.relayout(frac)
        n = page
    end

    local spread, _, _, _, target_w = v.view_metrics()
    if spread and n == 0 then
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
    if spread and n > 0 and n + 1 < total then
        local ce2 = v.pcache:take(sig .. ":" .. (n + 1))
        if ce2 then
            v.p2, v.p2w, v.p2h = ce2.tex, ce2.w, ce2.h
        else
            v.p2, v.p2w, v.p2h = v.render_into(n + 1, target_w)
        end
    end
    page = n
    v.pan_x = 0
    v.links = {}
    v.load_links(page)
    if v.p2 then v.load_links(page + 1) end
    v.sy = keep_scroll and (v.sy or 0) or 0
    v.sy = math.max(0, math.min(v.max_scroll(), v.sy))
    refresh_text()
    v.content_sig_value = sig
    print(string.format("[reader] page %d/%d  %dx%d%s", page + 1, total,
        tex_w, tex_h, v.p2 and " (+1)" or ""))
    return true
end

local function url_decode(s)
    return (s:gsub("%%(%x%x)", function(h)
        return string.char(tonumber(h, 16))
    end))
end

v.normalize_book_path = function(path)
    if not path or path == "" or path:sub(1, 1) == "/" then return path end
    local uid = tonumber(ffi.C.getuid()) or 1000
    local gvfs = string.format("/run/user/%d/gvfs/", uid)
    local p = path

    if p:sub(1, 7) == "file://" then
        local q = url_decode(p:sub(8))
        local f = io.open(q, "rb")
        if f then f:close(); return q end
        return path
    end

    local scheme, host, port, rest = p:match("^(davs?)://([^/:]+):?(%d*)(/.*)$")
    if scheme then
        local ssl = (scheme == "davs") and "true" or "false"
        local base
        if port and port ~= "" then
            base = string.format("%sdav:host=%s,port=%s,ssl=%s",
                gvfs, host, port, ssl)
        else
            base = string.format("%sdav:host=%s,ssl=%s", gvfs, host, ssl)
        end
        local q = base .. url_decode(rest)
        local f = io.open(q, "rb")
        if f then f:close(); return q end
    end

    local smb_host, share, srest = p:match("^smb://([^/]+)/([^/]+)(/.*)$")
    if smb_host then
        local q = string.format("%ssmb-share:server=%s,share=%s%s",
            gvfs, smb_host, share, url_decode(srest))
        local f = io.open(q, "rb")
        if f then f:close(); return q end
    end

    local shost, srest2 = p:match("^sftp://([^/]+)(/.*)$")
    if shost then
        local q = string.format("%ssftp:host=%s%s",
            gvfs, shost, url_decode(srest2))
        local f = io.open(q, "rb")
        if f then f:close(); return q end
    end
    return path
end

local function open_book(path, start_page)
    if not path or path == "" then return false, "empty path" end
    path = v.normalize_book_path(path)
    if v.close_panels then v.close_panels() end
    close_book()
    book = path
    v.layout:reset()
    v.content_sig_value = nil
    v.last_browse_dir = path:match("^(.*)/[^/]*$")
    local fmt = rd.detect(path)
    is_txt = fmt == 5
    v.reflow = fmt == 2 or fmt == 3 or fmt == 4

    if is_txt then
        local ok, err = build_txt_pages(path)
        if not ok then return false, err end
    else
        local err
        doc, err = rd.open(path)
        if not doc then return false, "open failed: " .. tostring(err) end
        total = rd.page_count(doc)
        if total <= 0 then return false, "no pages" end
    end

    local start = start_page
    if start == nil then
        local rec = progress[path]
        if rec and v.reflow and rec.percent then
            start = math.floor((rec.percent / 100) * math.max(0, total - 1) + 0.5)
        else
            start = rec and rec.page or 0
        end
    end
    start = math.max(0, math.min(total - 1, start or 0))
    v.pending_layout = v.reflow

    page = 0
    v.zoom = 1.0
    v.pan_x = 0
    local name = path:match("([^/]+)$") or path
    name = name:gsub("%.%w+$", "")
    title_text = truncate_utf8(name, 14)
    refresh_text()
    if not load_page(start) then return false, "render failed" end
    refresh_text()
    save_progress()
    return true
end

local function draw_page()
    v.content.draw({
        sdl = sdl, ffi = ffi, ren = ren, W = W, H = H, S = S,
        set_color = set_color,
        is_txt = is_txt, settings = settings, theme = theme,
        line_texs = line_texs, tex = tex, tex_w = tex_w, tex_h = tex_h,
        v = v, page = page, total = total,
        txt_line_height = txt_line_height,
        title_tex = title_tex, title_w = title_w, title_h = title_h,
        page_tex = page_tex, page_w = page_w, page_h = page_h,
        hdr_st_tex = hdr_st_tex, hdr_st_w = hdr_st_w, hdr_st_h = hdr_st_h,
        hdr_st_x = hdr_st_x,
        hdr_toc_tex = hdr_toc_tex, hdr_toc_w = hdr_toc_w, hdr_toc_h = hdr_toc_h,
        hdr_toc_x = hdr_toc_x,
        hdr_bm_tex = hdr_bm_tex, hdr_bm_w = hdr_bm_w, hdr_bm_h = hdr_bm_h,
        hdr_bm_x = hdr_bm_x,
        fs_tex = v.fs_tex, fs_w = v.fs_w, fs_h = v.fs_h, fs_x = v.fs_x,
        max_tex = v.max_tex, max_w = v.max_w, max_h = v.max_h, max_x = v.max_x,
        eye_tex = v.eye_tex, eye_w = v.eye_w, eye_h = v.eye_h, eye_x = v.eye_x,
        dual_tex = v.dual_tex, dual_w = v.dual_w, dual_h = v.dual_h, dual_x = v.dual_x,
        shot_tex = v.shot_tex, shot_w = v.shot_w, shot_h = v.shot_h, shot_x = v.shot_x,
        open_tex = v.hdr_open_tex, open_w = v.hdr_open_w, open_h = v.hdr_open_h, open_x = v.hdr_open_x,
    })
end

local function load_toc_data()
    if is_txt then
        local t = {}
        for i = 1, total do
            t[#t + 1] = { page = i - 1, level = 0, title = string.format("第 %d 页", i) }
        end
        return t
    end
    if doc then
        local raw = rd.toc(doc)
        local t = {}
        for _, it in ipairs(raw) do
            if it.page and it.page >= 0 then t[#t + 1] = it end
        end
        if #t > 0 then return t end
    end
    return {}
end

local function rebuild_toc_texs()
    for _, t in ipairs(toc.texs) do sdl.destroy_texture(t.tex) end
    toc.texs = {}
    if #toc.items == 0 then return end

    toc.selected = math.max(1, math.min(#toc.items, toc.selected))
    local first = math.max(1, toc.selected - math.floor(toc.visible / 2))
    if first + toc.visible - 1 > #toc.items then
        first = math.max(1, #toc.items - toc.visible + 1)
    end
    toc.first = first
    local last = math.min(#toc.items, first + toc.visible - 1)

    for i = first, last do
        local it = toc.items[i]
        local text = string.rep("  ", it.level or 0) .. (it.title or "")
        local w, h = ttf.size(f_body, text)
        local c = (i == toc.selected) and theme.ink or theme.text
        local t = ttf.render_texture(ren, f_body, text, c[1], c[2], c[3], 255)
        if t then
            toc.texs[#toc.texs + 1] = { tex = t, w = w, h = h, index = i }
        end
    end
end

local function open_toc()
    close_bm()
    close_st()
    toc.items = load_toc_data()
    toc.open = true
    toc.selected = 1
    toc.title_tex, toc.title_w, toc.title_h = make_text("目录", f_title, theme.ink)
    toc.count_tex, toc.count_w, toc.count_h = make_text(
        string.format("%d 条", #toc.items), f_page, theme.muted)
    toc.hint_tex, toc.hint_w, toc.hint_h = make_text(
        "↑/↓ 选择 · Enter 跳转 · T/Esc 关闭", f_page, theme.muted)
    if #toc.items == 0 then
        toc.empty_tex, toc.empty_w, toc.empty_h = make_text("（无目录）", f_body, theme.muted)
    end
    rebuild_toc_texs()
end

local function toggle_toc()
    if toc.open then close_toc() else open_toc() end
end

local function toc_move(delta)
    if #toc.items == 0 then return end
    toc.selected = math.max(1, math.min(#toc.items, toc.selected + delta))
    rebuild_toc_texs()
end

local function toc_activate()
    local it = toc.items[toc.selected]
    if not it then return end
    close_toc()
    if it.page and it.page >= 0 and it.page < total then
        load_page(it.page)
        save_progress()
    end
end

local function draw_toc()
    panel.frame(ren, W, H, theme, v.ui_scale, toc.title_tex, toc.title_w, toc.title_h,
        toc.count_tex, toc.count_w, toc.count_h)
    panel.items(ren, W, theme, v.ui_scale, toc.top, toc.line_h, toc.texs, toc.selected,
        toc.empty_tex, toc.empty_w, toc.empty_h)
    panel.hint(ren, H, v.ui_scale, toc.hint_tex, toc.hint_w, toc.hint_h)
    sdl.render_present(ren)
end

local function load_bookmarks_data()
    local rec = progress[book]
    return rec and rec.bookmarks or {}
end

v.bookmark_page = function(b)
    if b.percent and b.percent > 0 and total > 0 then
        local p = math.floor((b.percent / 100) * total + 0.5) - 1
        return math.max(0, math.min(total - 1, p))
    end
    return b.page or 0
end

local function refresh_bm_count()
    if bm_count_tex then sdl.destroy_texture(bm_count_tex); bm_count_tex = nil end
    bm_count_tex, bm_count_w, bm_count_h = make_text(
        string.format("%d 条", #bm_items), f_page, theme.muted)
end

local function add_bookmark(note)
    if not book then return false, "no book" end
    local rec = book_rec()
    rec.bookmarks = rec.bookmarks or {}
    for _, b in ipairs(rec.bookmarks) do
        if b.page == page then return false, "bookmark exists" end
    end
    local pct = total > 0 and ((page + 1) * 100.0 / total) or 0
    rec.bookmarks[#rec.bookmarks + 1] = {
        page = page,
        percent = pct,
        note = (note and note ~= "") and note or string.format("第 %d 页", page + 1),
        created = os.time(),
    }
    table.sort(rec.bookmarks, function(a, b)
        local ap = a.percent or ((a.page or 0) + 1)
        local bp = b.percent or ((b.page or 0) + 1)
        return ap < bp
    end)
    store.save_state(state_file, progress)
    return true
end

local function remove_bookmark(index)
    local rec = progress[book]
    if not rec or not rec.bookmarks or not rec.bookmarks[index] then
        return false
    end
    table.remove(rec.bookmarks, index)
    store.save_state(state_file, progress)
    return true
end

local function rebuild_bm_texs()
    for _, t in ipairs(bm_texs) do sdl.destroy_texture(t.tex) end
    bm_texs = {}
    if #bm_items == 0 then return end

    bm_selected = math.max(1, math.min(#bm_items, bm_selected))
    local first = math.max(1, bm_selected - math.floor(toc.visible / 2))
    if first + toc.visible - 1 > #bm_items then
        first = math.max(1, #bm_items - toc.visible + 1)
    end
    bm_first = first
    local last = math.min(#bm_items, first + toc.visible - 1)

    for i = first, last do
        local b = bm_items[i]
        local text = string.format("第 %d 页  %s", v.bookmark_page(b) + 1, b.note or "")
        local w, h = ttf.size(f_body, text)
        local c = (i == bm_selected) and theme.ink or theme.text
        local t = ttf.render_texture(ren, f_body, text, c[1], c[2], c[3], 255)
        if t then
            bm_texs[#bm_texs + 1] = { tex = t, w = w, h = h, index = i }
        end
    end
end

local function open_bookmarks()
    close_toc()
    close_st()
    bm_items = load_bookmarks_data()
    bm_open = true
    bm_selected = 1
    bm_title_tex, bm_title_w, bm_title_h = make_text("书签", f_title, theme.ink)
    refresh_bm_count()
    bm_hint_tex, bm_hint_w, bm_hint_h = make_text(
        "A 添加 · ↑/↓ 选择 · Enter 跳转 · Delete 删除 · B/Esc 关闭",
        f_page, theme.muted)
    if #bm_items == 0 then
        bm_empty_tex, bm_empty_w, bm_empty_h = make_text("（暂无书签）", f_body, theme.muted)
    end
    rebuild_bm_texs()
end

local function toggle_bookmarks()
    if bm_open then close_bm() else open_bookmarks() end
end

local function bm_move(delta)
    if #bm_items == 0 then return end
    bm_selected = math.max(1, math.min(#bm_items, bm_selected + delta))
    rebuild_bm_texs()
end

local function bm_activate()
    local b = bm_items[bm_selected]
    if not b then return end
    close_bm()
    local p = v.bookmark_page(b)
    if p >= 0 and p < total then
        load_page(p)
        save_progress()
    end
end

local function bm_remove()
    if #bm_items == 0 then return end
    remove_bookmark(bm_selected)
    bm_items = load_bookmarks_data()
    refresh_bm_count()
    bm_selected = math.max(1, math.min(#bm_items, bm_selected))
    if #bm_items == 0 then
        if bm_empty_tex then sdl.destroy_texture(bm_empty_tex); bm_empty_tex = nil end
        bm_empty_tex, bm_empty_w, bm_empty_h = make_text("（暂无书签）", f_body, theme.muted)
    end
    rebuild_bm_texs()
end

local function draw_bookmarks()
    panel.frame(ren, W, H, theme, v.ui_scale, bm_title_tex, bm_title_w, bm_title_h,
        bm_count_tex, bm_count_w, bm_count_h)
    panel.items(ren, W, theme, v.ui_scale, toc.top, toc.line_h, bm_texs, bm_selected,
        bm_empty_tex, bm_empty_w, bm_empty_h)
    panel.hint(ren, H, v.ui_scale, bm_hint_tex, bm_hint_w, bm_hint_h)
    sdl.render_present(ren)
end

local function st_rows()
    return {
        "主题    " .. (THEME_NAMES[settings.theme] or settings.theme),
        string.format("字号    %d", settings.font_size),
        string.format("行距    %.1f", settings.line_factor),
        string.format("边距    %d", settings.margin),
    }
end

local function rebuild_st_texs()
    for _, t in ipairs(st_texs) do sdl.destroy_texture(t.tex) end
    st_texs = {}
    for i, text in ipairs(st_rows()) do
        local w, h = ttf.size(f_body, text)
        local c = (i == st_selected) and theme.ink or theme.text
        local t = ttf.render_texture(ren, f_body, text, c[1], c[2], c[3], 255)
        if t then
            st_texs[#st_texs + 1] = { tex = t, w = w, h = h, index = i }
        end
    end
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

    if total > 0 then
        if is_txt then
            build_txt_pages(book)
            page = math.max(0, math.min(total - 1, page))
            load_page(page)
        elseif v.pending_layout or old_dark ~= new_dark
            or (v.reflow and old_theme ~= settings.theme) then
            load_page(page)
        end
    end
    refresh_text()
    if st_open then
        if st_title_tex then sdl.destroy_texture(st_title_tex); st_title_tex = nil end
        if st_hint_tex then sdl.destroy_texture(st_hint_tex); st_hint_tex = nil end
        st_title_tex, st_title_w, st_title_h = make_text("设置", f_title, theme.ink)
        st_hint_tex, st_hint_w, st_hint_h = make_text(
            "↑/↓ 选择 · ←/→ 调整 · S/Esc 关闭", f_page, theme.muted)
        rebuild_st_texs()
    end
    if lib.open and refresh_lib_texts then
        refresh_lib_texts()
    end
end

local function open_settings()
    close_toc()
    close_bm()
    st_open = true
    st_selected = 1
    st_title_tex, st_title_w, st_title_h = make_text("设置", f_title, theme.ink)
    st_hint_tex, st_hint_w, st_hint_h = make_text(
        "↑/↓ 选择 · ←/→ 调整 · S/Esc 关闭", f_page, theme.muted)
    rebuild_st_texs()
end

local function st_move(delta)
    st_selected = math.max(1, math.min(4, st_selected + delta))
    rebuild_st_texs()
end

local function st_adjust(delta)
    if st_selected == 1 then
        settings.theme = cycle(THEME_ORDER, settings.theme, delta)
    elseif st_selected == 2 then
        settings.font_size = cycle(FONT_ORDER, settings.font_size, delta)
    elseif st_selected == 3 then
        settings.line_factor = cycle(LINE_ORDER, settings.line_factor, delta)
    elseif st_selected == 4 then
        settings.margin = cycle(MARGIN_ORDER, settings.margin, delta)
    end
    if st_selected >= 2 then v.pending_layout = v.reflow end
    apply_settings()
end

local function draw_settings()
    panel.frame(ren, W, H, theme, v.ui_scale, st_title_tex, st_title_w, st_title_h, nil, 0, 0)
    panel.items(ren, W, theme, v.ui_scale, toc.top, toc.line_h, st_texs, st_selected, nil, 0, 0)
    panel.hint(ren, H, v.ui_scale, st_hint_tex, st_hint_w, st_hint_h)
    sdl.render_present(ren)
end

local function destroy_search()
    for _, t in ipairs(search.texs) do sdl.destroy_texture(t.tex) end
    search.texs = {}
    if search.title_tex then sdl.destroy_texture(search.title_tex); search.title_tex = nil end
    if search.count_tex then sdl.destroy_texture(search.count_tex); search.count_tex = nil end
    if search.hint_tex then sdl.destroy_texture(search.hint_tex); search.hint_tex = nil end
    if search.empty_tex then sdl.destroy_texture(search.empty_tex); search.empty_tex = nil end
    if search.query_tex then sdl.destroy_texture(search.query_tex); search.query_tex = nil end
end

local function update_search_query_tex()
    if search.query_tex then sdl.destroy_texture(search.query_tex); search.query_tex = nil end
    if search.query == "" then
        search.query_tex, search.query_w, search.query_h =
            make_text("输入关键词…", f_body, theme.muted)
    else
        search.query_tex, search.query_w, search.query_h =
            make_text(search.query .. "|", f_body, theme.text)
    end
end

local function refresh_search_count()
    if search.count_tex then sdl.destroy_texture(search.count_tex); search.count_tex = nil end
    search.count_tex, search.count_w, search.count_h =
        make_text(string.format("%d 条", #search.results), f_page, theme.muted)
end

local function refresh_search_empty()
    if search.empty_tex then sdl.destroy_texture(search.empty_tex); search.empty_tex = nil end
    if #search.results == 0 then
        local text = (search.query == "") and "输入关键词，按 Enter 搜索" or "无匹配结果"
        search.empty_tex, search.empty_w, search.empty_h =
            make_text(text, f_body, theme.muted)
    end
end

local function rebuild_search_texs()
    for _, t in ipairs(search.texs) do sdl.destroy_texture(t.tex) end
    search.texs = {}
    if #search.results == 0 then return end

    search.selected = math.max(1, math.min(#search.results, search.selected))
    local first = math.max(1, search.selected - math.floor(search.visible / 2))
    if first + search.visible - 1 > #search.results then
        first = math.max(1, #search.results - search.visible + 1)
    end
    search.first = first
    local last = math.min(#search.results, first + search.visible - 1)

    for i = first, last do
        local r = search.results[i]
        local text
        if r.snippet then
            text = string.format("第 %d 页  %s", (r.page or 0) + 1, r.snippet)
        else
            text = string.format("第 %d 页 · %d 处", (r.page or 0) + 1, r.count or 1)
        end
        local w, h = ttf.size(f_body, text)
        local c = (i == search.selected) and theme.ink or theme.text
        local t = ttf.render_texture(ren, f_body, text, c[1], c[2], c[3], 255)
        if t then
            search.texs[#search.texs + 1] = { tex = t, w = w, h = h, index = i }
        end
    end
end

local function open_search()
    close_toc()
    close_bm()
    close_st()
    search.open = true
    search.query = ""
    search.results = {}
    search.selected = 1
    search.first = 1
    search.title_tex, search.title_w, search.title_h = make_text("搜索", f_title, theme.ink)
    search.hint_tex, search.hint_w, search.hint_h = make_text(
        "Enter 搜索 · ↑/↓ 选择 · Esc 关闭", f_page, theme.muted)
    update_search_query_tex()
    refresh_search_count()
    refresh_search_empty()
    rebuild_search_texs()
    sdl.start_text_input()
end

local function close_search()
    sdl.stop_text_input()
    destroy_search()
    search.open = false
    search.query = ""
    search.results = {}
end

local function run_search()
    local q = search.query
    if q == "" then
        search.results = {}
        search.selected = 1
        refresh_search_count()
        refresh_search_empty()
        rebuild_search_texs()
        return
    end
    local cached = v.search_cache[q]
    if cached then
        search.results = cached
    else
        if is_txt then
            search.results = search_txt(q, page, 50)
        elseif doc then
            search.results = rd.search(doc, q, page, 50)
        else
            search.results = {}
        end
        local n = 0
        for _ in pairs(v.search_cache) do n = n + 1 end
        if n >= 20 then v.search_cache = {} end
        v.search_cache[q] = search.results
    end
    search.selected = 1
    refresh_search_count()
    refresh_search_empty()
    rebuild_search_texs()
end

local function search_move(delta)
    if #search.results == 0 then return end
    search.selected = math.max(1, math.min(#search.results, search.selected + delta))
    rebuild_search_texs()
end

local function search_activate()
    local r = search.results[search.selected]
    if not r then return end
    local p = r.page
    close_search()
    if p and p >= 0 and p < total then
        load_page(p)
        save_progress()
    end
end

local function draw_search()
    panel.frame(ren, W, H, theme, v.ui_scale, search.title_tex, search.title_w, search.title_h,
        search.count_tex, search.count_w, search.count_h)

    local box = ffi.new("SDL_Rect")
    box.x, box.y, box.w, box.h = S(48), S(110), W - S(96), S(44)
    set_color(theme.card)
    sdl.render_fill_rect(ren, box)
    set_color(theme.line)
    sdl.render_draw_rect(ren, box)
    if search.query_tex then
        local r = ffi.new("SDL_Rect")
        r.x, r.y, r.w, r.h = S(64), S(118), search.query_w, search.query_h
        sdl.render_copy(ren, search.query_tex, nil, r)
    end

    if #search.results == 0 then
        if search.empty_tex then
            local r = ffi.new("SDL_Rect")
            r.x, r.y, r.w, r.h = S(56), search.top, search.empty_w, search.empty_h
            sdl.render_copy(ren, search.empty_tex, nil, r)
        end
    else
        local y = search.top
        for _, t in ipairs(search.texs) do
            if t.index == search.selected then
                set_color(theme.sel)
                local row = ffi.new("SDL_Rect")
                row.x, row.y, row.w, row.h = S(40), y - S(4), W - S(80), search.line_h
                sdl.render_fill_rect(ren, row)
                set_color(theme.ink)
                local accent = ffi.new("SDL_Rect")
                accent.x, accent.y, accent.w, accent.h = S(40), y - S(4), S(4), search.line_h
                sdl.render_fill_rect(ren, accent)
            end
            local r = ffi.new("SDL_Rect")
            r.x, r.y, r.w, r.h = S(56), y, t.w, t.h
            sdl.render_copy(ren, t.tex, nil, r)
            set_color(theme.line)
            local line = ffi.new("SDL_Rect")
            line.x, line.y, line.w, line.h = S(40), y + search.line_h - 1, W - S(80), 1
            sdl.render_fill_rect(ren, line)
            y = y + search.line_h
        end
    end

    panel.hint(ren, H, v.ui_scale, search.hint_tex, search.hint_w, search.hint_h)
    sdl.render_present(ren)
end

local function destroy_lib()
    for _, t in ipairs(lib.texs) do sdl.destroy_texture(t.tex) end
    lib.texs = {}
    if lib.title_tex then sdl.destroy_texture(lib.title_tex); lib.title_tex = nil end
    if lib.count_tex then sdl.destroy_texture(lib.count_tex); lib.count_tex = nil end
    if lib.hint_tex then sdl.destroy_texture(lib.hint_tex); lib.hint_tex = nil end
    if lib.empty_tex then sdl.destroy_texture(lib.empty_tex); lib.empty_tex = nil end
    if lib.open_tex then sdl.destroy_texture(lib.open_tex); lib.open_tex = nil end
    if lib.clear_tex then sdl.destroy_texture(lib.clear_tex); lib.clear_tex = nil end
end

local function scan_library()
    local env = os.getenv("READER_LIBRARY")
    local candidates = {}
    if env and env ~= "" then candidates[#candidates + 1] = env end
    candidates[#candidates + 1] = home .. "/Books"
    candidates[#candidates + 1] = home .. "/Downloads/book"
    candidates[#candidates + 1] = "/home/quqiufeng/Downloads/book"

    local scanned = {}
    lib.dir = env or ""
    for _, d in ipairs(candidates) do
        local items = library.scan(d)
        if items and #items > 0 then
            scanned = items
            lib.dir = d
            break
        end
    end

    lib.items = {}
    local seen = {}
    for _, it in ipairs(scanned) do
        seen[it.path] = true
        local rec = progress[it.path]
        local pct = (rec and rec.percent and rec.percent > 0) and rec.percent or 0
        if pct > 0 then
            it.percent = pct
            it.updated = (rec and rec.updated and rec.updated > 0)
                and rec.updated or 0
            lib.items[#lib.items + 1] = it
        end
    end

    -- 文件选择器/DAV 打开的书可能不在扫描目录里，也要进入历史列表。
    local fmt_map = {
        pdf = "PDF", epub = "EPUB", mobi = "MOBI", azw3 = "AZW3",
        txt = "TXT", chm = "CHM", cbz = "CBZ", cbr = "CBR",
    }
    for path, rec in pairs(progress) do
        local pct = (rec.percent and rec.percent > 0) and rec.percent or 0
        if not seen[path] and pct > 0 then
            local f = io.open(path, "rb")
            if f then
                f:close()
                local ext = path:match("%.([%w]+)$")
                ext = ext and ext:lower() or ""
                lib.items[#lib.items + 1] = {
                    path = path,
                    name = path:match("([^/]+)$") or path,
                    format = fmt_map[ext] or ext:upper(),
                    percent = pct,
                    updated = (rec.updated and rec.updated > 0) and rec.updated or 0,
                }
            end
        end
    end

    table.sort(lib.items, function(a, b)
        if (a.updated or 0) ~= (b.updated or 0) then
            return (a.updated or 0) > (b.updated or 0)
        end
        return (a.name or "") < (b.name or "")
    end)
end

v.choose_book = function()
    if v.dialog then return end
    local cmd
    if os.execute("command -v zenity >/dev/null 2>&1") == 0 then
        cmd = string.format('zenity --file-selection --title=%q --filename=%q',
            "选择电子书", home .. "/")
    elseif os.execute("command -v kdialog >/dev/null 2>&1") == 0 then
        cmd = string.format('kdialog --getopenfilename %q', home)
    else
        v.open_browser()
        return
    end
    local out = os.tmpname()
    local done = out .. ".done"
    os.remove(out)
    os.remove(done)
    os.execute(string.format("( %s > %q 2>/dev/null; : > %q ) &", cmd, out, done))
    v.dialog = { out = out, done = done }
    v.show_toast("请选择电子书…", 2)
end

local function rebuild_lib_texs()
    for _, t in ipairs(lib.texs) do sdl.destroy_texture(t.tex) end
    lib.texs = {}
    if #lib.items == 0 then return end

    lib.selected = math.max(1, math.min(#lib.items, lib.selected))
    local first = math.max(1, lib.selected - math.floor(lib.visible / 2))
    if first + lib.visible - 1 > #lib.items then
        first = math.max(1, #lib.items - lib.visible + 1)
    end
    lib.first = first
    local last = math.min(#lib.items, first + lib.visible - 1)

    for i = first, last do
        local it = lib.items[i]
        local pct = it.percent and string.format("%.1f%%", it.percent) or "未读"
        local text = string.format("%s   %s   %s", it.format, it.name, pct)
        local w, h = ttf.size(f_body, text)
        local c = (i == lib.selected) and theme.ink or theme.text
        local t = ttf.render_texture(ren, f_body, text, c[1], c[2], c[3], 255)
        if t then
            lib.texs[#lib.texs + 1] = { tex = t, w = w, h = h, index = i }
        end
    end
end

local function clear_history_fields(rec)
    if not rec then return end
    rec.page = 0
    rec.percent = nil
    rec.updated = nil
end

v.remove_history = function(index)
    local it = lib.items[index]
    if not it then return false end
    clear_history_fields(progress[it.path])
    store.save_state(state_file, progress)
    scan_library()
    refresh_lib_texts()
    print("history removed: " .. tostring(it.path))
    return true
end

v.clear_history = function()
    for _, rec in pairs(progress) do
        clear_history_fields(rec)
    end
    store.save_state(state_file, progress)
    scan_library()
    refresh_lib_texts()
    print("history cleared")
    return true
end

v.browser_destroy = function()
    for _, t in ipairs(browser.texs) do sdl.destroy_texture(t.tex) end
    browser.texs = {}
    for _, k in ipairs({ "title_tex", "count_tex", "hint_tex", "empty_tex" }) do
        if browser[k] then sdl.destroy_texture(browser[k]); browser[k] = nil end
    end
end

v.browser_rebuild = function()
    for _, t in ipairs(browser.texs) do sdl.destroy_texture(t.tex) end
    browser.texs = {}
    if #browser.items == 0 then return end

    browser.selected = math.max(1, math.min(#browser.items, browser.selected))
    local first = math.max(1, browser.selected - math.floor(browser.visible / 2))
    if first + browser.visible - 1 > #browser.items then
        first = math.max(1, #browser.items - browser.visible + 1)
    end
    browser.first = first
    local last = math.min(#browser.items, first + browser.visible - 1)

    for i = first, last do
        local it = browser.items[i]
        local text = (it.is_dir and "[目录] " or "") .. it.name
        local w, h = ttf.size(f_body, text)
        local c = (i == browser.selected) and theme.ink or theme.text
        local t = ttf.render_texture(ren, f_body, text, c[1], c[2], c[3], 255)
        if t then
            browser.texs[#browser.texs + 1] = { tex = t, w = w, h = h, index = i }
        end
    end
end

v.browser_load = function(dir)
    dir = tostring(dir or home)
    dir = dir:gsub("/+$", "")
    if dir == "" then dir = "/" end
    browser.dir = dir
    browser.items = {}
    browser.selected = 1

    local parent = dir:match("^(.*)/[^/]+$")
    if parent and parent ~= "" then
        browser.items[#browser.items + 1] = {
            name = "..", is_dir = true, path = parent,
        }
    end

    local gvfs = string.format("/run/user/%d/gvfs", tonumber(ffi.C.getuid()) or 1000)
    if dir == home and rd.list_dir(gvfs) ~= "" then
        browser.items[#browser.items + 1] = {
            name = "[网络位置] " .. gvfs, is_dir = true, path = gvfs,
        }
    end
    local dl = home .. "/Downloads/book"
    if dir == home and rd.list_dir(dl) ~= "" then
        browser.items[#browser.items + 1] = {
            name = "[书库] " .. dl, is_dir = true, path = dl,
        }
    end

    local exts = {
        pdf = true, epub = true, mobi = true, azw3 = true,
        txt = true, chm = true, cbz = true, cbr = true,
    }
    local raw = rd.list_dir(dir)
    for line in raw:gmatch("[^\n]+") do
        local typ, name = line:match("^(%a)\t(.+)$")
        if typ and name and name:sub(1, 1) ~= "." then
            if typ == "d" then
                browser.items[#browser.items + 1] = {
                    name = name, is_dir = true, path = dir .. "/" .. name,
                }
            else
                local ext = name:match("%.([%w]+)$")
                ext = ext and ext:lower() or ""
                if exts[ext] then
                    browser.items[#browser.items + 1] = {
                        name = name, is_dir = false, path = dir .. "/" .. name,
                    }
                end
            end
        end
    end

    table.sort(browser.items, function(a, b)
        if a.is_dir ~= b.is_dir then return a.is_dir end
        return (a.name or ""):lower() < (b.name or ""):lower()
    end)

    v.browser_destroy()
    browser.title_tex, browser.title_w, browser.title_h =
        make_text("打开书籍 · " .. dir, f_page, theme.ink)
    browser.count_tex, browser.count_w, browser.count_h =
        make_text(string.format("%d 项", #browser.items), f_page, theme.muted)
    browser.hint_tex, browser.hint_w, browser.hint_h = make_text(
        "↑/↓ 选择 · Enter 打开/进入 · Backspace 上级 · Esc 关闭", f_page, theme.muted)
    if #browser.items == 0 then
        browser.empty_tex, browser.empty_w, browser.empty_h =
            make_text("目录为空或无法读取", f_body, theme.muted)
    end
    v.browser_rebuild()
end

v.open_browser = function(start)
    close_toc()
    close_bm()
    close_st()
    close_search()
    browser.open = true
    local dir = start or v.last_browse_dir
    if not dir or dir == "" then
        if book then dir = book:match("^(.*)/[^/]*$") end
    end
    if not dir or dir == "" then dir = home end
    v.browser_load(dir)
    sdl.stop_text_input()
end

v.browser_close = function()
    browser.open = false
    v.browser_destroy()
    v.dirty = true
end

v.close_panels = function()
    if search.open then close_search() end
    if toc.open then close_toc() end
    if bm_open then close_bm() end
    if st_open then close_st() end
    if browser.open then v.browser_close() end
    if lib.open then
        lib.open = false
        destroy_lib()
    end
end

v.browser_move = function(delta)
    if #browser.items == 0 then return end
    browser.selected = math.max(1, math.min(#browser.items, browser.selected + delta))
    v.browser_rebuild()
end

v.browser_activate = function()
    local it = browser.items[browser.selected]
    if not it then return end
    if it.is_dir then
        v.browser_load(it.path)
        return
    end
    v.last_browse_dir = browser.dir
    browser.open = false
    v.browser_destroy()
    local ok, err = open_book(it.path, nil)
    if not ok then
        print("open failed: " .. tostring(err))
        browser.open = true
        v.browser_load(v.last_browse_dir)
    elseif lib.open then
        lib.open = false
        destroy_lib()
    end
end

v.draw_browser = function()
    panel.frame(ren, W, H, theme, v.ui_scale, browser.title_tex, browser.title_w,
        browser.title_h, browser.count_tex, browser.count_w, browser.count_h)
    panel.items(ren, W, theme, v.ui_scale, browser.top, browser.line_h,
        browser.texs, browser.selected, browser.empty_tex,
        browser.empty_w, browser.empty_h)
    panel.hint(ren, H, v.ui_scale, browser.hint_tex, browser.hint_w, browser.hint_h)
    sdl.render_present(ren)
end

v.key_browser = function(k)
    if k == sdl.SDLK_UP then v.browser_move(-1)
    elseif k == sdl.SDLK_DOWN then v.browser_move(1)
    elseif k == sdl.SDLK_PAGEUP then v.browser_move(-10)
    elseif k == sdl.SDLK_PAGEDOWN then v.browser_move(10)
    elseif k == sdl.SDLK_RETURN or k == sdl.SDLK_RIGHT then v.browser_activate()
    elseif k == sdl.SDLK_BACKSPACE then
        local parent = browser.dir:match("^(.*)/[^/]+$")
        if parent and parent ~= "" then v.browser_load(parent) end
    elseif k == sdl.SDLK_ESCAPE then v.browser_close()
    end
end

refresh_lib_texts = function()
    if lib.title_tex then sdl.destroy_texture(lib.title_tex); lib.title_tex = nil end
    if lib.count_tex then sdl.destroy_texture(lib.count_tex); lib.count_tex = nil end
    if lib.hint_tex then sdl.destroy_texture(lib.hint_tex); lib.hint_tex = nil end
    if lib.empty_tex then sdl.destroy_texture(lib.empty_tex); lib.empty_tex = nil end
    if lib.open_tex then sdl.destroy_texture(lib.open_tex); lib.open_tex = nil end

    lib.title_tex, lib.title_w, lib.title_h = make_text("书库", f_title, theme.ink)
    lib.count_tex, lib.count_w, lib.count_h = make_text(
        string.format("%d 本", #lib.items), f_page, theme.muted)
    lib.open_tex, lib.open_w, lib.open_h = make_text("＋ 打开新书", f_page, theme.ink)
    lib.clear_tex, lib.clear_w, lib.clear_h = make_text("清空历史", f_page, theme.muted)
    lib.open_x = W - S(48) - lib.count_w - S(24) - lib.open_w
    lib.clear_x = lib.open_x - S(16) - lib.clear_w
    lib.hint_tex, lib.hint_w, lib.hint_h = make_text(
        "↑/↓ 选择 · Enter 打开 · Delete 清历史 · Shift+Delete 清空 · O 新书 · Esc 退出",
        f_page, theme.muted)
    if #lib.items == 0 then
        lib.empty_tex, lib.empty_w, lib.empty_h = make_text(
            "暂无阅读历史 · 打开新书开始阅读", f_body, theme.muted)
    end
    lib.ui_w, lib.ui_h = W, H
    rebuild_lib_texs()
end

local function open_library()
    close_toc()
    close_bm()
    close_st()
    close_search()
    save_progress()
    close_book()
    lib.open = true
    scan_library()
    lib.selected = 1
    lib.first = 1
    refresh_lib_texts()
    sdl.stop_text_input()
end

local function lib_move(delta)
    if #lib.items == 0 then return end
    lib.selected = math.max(1, math.min(#lib.items, lib.selected + delta))
    rebuild_lib_texs()
end

local function lib_activate()
    local it = lib.items[lib.selected]
    if not it then return end
    lib.open = false
    destroy_lib()
    local ok, err = open_book(it.path, nil)
    if not ok then
        lib.open = true
        scan_library()
        refresh_lib_texts()
        print("open failed: " .. tostring(err))
    end
end

local function draw_lib_items()
    if #lib.items == 0 then
        if lib.empty_tex then
            local r = ffi.new("SDL_Rect")
            r.x, r.y, r.w, r.h = S(56), lib.top, lib.empty_w, lib.empty_h
            sdl.render_copy(ren, lib.empty_tex, nil, r)
        end
        return
    end

    local y = lib.top
    for _, t in ipairs(lib.texs) do
        if t.index == lib.selected then
            set_color(theme.sel)
            local row = ffi.new("SDL_Rect")
            row.x, row.y, row.w, row.h = S(40), y - S(4), W - S(80), lib.line_h
            sdl.render_fill_rect(ren, row)

            set_color(theme.ink)
            local accent = ffi.new("SDL_Rect")
            accent.x, accent.y, accent.w, accent.h = S(40), y - S(4), S(4), lib.line_h
            sdl.render_fill_rect(ren, accent)
        end

        local r = ffi.new("SDL_Rect")
        r.x, r.y, r.w, r.h = S(56), y, t.w, t.h
        sdl.render_copy(ren, t.tex, nil, r)

        set_color(theme.line)
        local line = ffi.new("SDL_Rect")
        line.x, line.y, line.w, line.h = S(40), y + lib.line_h - 1, W - S(80), 1
        sdl.render_fill_rect(ren, line)

        y = y + lib.line_h
    end
end

local function draw_library()
    panel.frame(ren, W, H, theme, v.ui_scale, lib.title_tex, lib.title_w, lib.title_h,
        lib.count_tex, lib.count_w, lib.count_h)
    if lib.open_tex then
        local r = ffi.new("SDL_Rect")
        r.x, r.y, r.w, r.h = lib.open_x, S(50), lib.open_w, lib.open_h
        sdl.render_copy(ren, lib.open_tex, nil, r)
    end
    if lib.clear_tex then
        local r = ffi.new("SDL_Rect")
        r.x, r.y, r.w, r.h = lib.clear_x, S(50), lib.clear_w, lib.clear_h
        sdl.render_copy(ren, lib.clear_tex, nil, r)
    end
    draw_lib_items()
    panel.hint(ren, H, v.ui_scale, lib.hint_tex, lib.hint_w, lib.hint_h)
    sdl.render_present(ren)
end

local function draw()
    local kind = renderer.kind({
        browser = browser.open,
        search = search.open,
        toc = toc.open,
        bookmarks = bm_open,
        settings = st_open,
        library = lib.open,
    })
    renderer.draw(kind, {
        browser = v.draw_browser,
        search = draw_search,
        toc = draw_toc,
        bookmarks = draw_bookmarks,
        settings = draw_settings,
        library = draw_library,
        content = draw_page,
    })
    draw_toast()
    sdl.render_present(ren)
end

local function turn(delta)
    local n
    if v.spread_mode() then
        if delta > 0 then
            n = (page == 0) and 1 or (page + 2)
        else
            n = (page <= 1) and 0 or (page - 2)
        end
    else
        n = page + delta
    end
    if n < 0 then n = 0 end
    if n >= total then return end
    if n ~= page then
        load_page(n)
        save_progress()
    end
end

v.scroll_by = function(dy)
    if is_txt or not tex then return end
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
    if book then load_page(page) end
    v.dirty = true
end

v.pan = function(dx)
    local total = tex_w + (v.p2 and (S(5) + v.p2w) or 0)
    local maxp = math.max(0, math.floor((total - W) / 2))
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
    if lib.open and refresh_lib_texts then refresh_lib_texts() end
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
    if lib.open and refresh_lib_texts then refresh_lib_texts() end
    v.dirty = true
end

local function toggle_dual()
    v.dual = not v.dual
    rebuild_header_actions()
    if lib.open and refresh_lib_texts then refresh_lib_texts() end
    v.sy = 0
    v.pending_layout = v.reflow
    if book then load_page(page) end
    refresh_text()
end

local function toggle_eye()
    settings.theme = cycle(THEME_ORDER, settings.theme, 1)
    apply_settings()
end

local function go_back()
    if browser.open then
        v.browser_close()
    elseif search.open then
        close_search()
    elseif toc.open then
        close_toc()
    elseif bm_open then
        close_bm()
    elseif st_open then
        close_st()
    elseif v.fs then
        v.toggle_fs()
    elseif v.max then
        v.toggle_max()
    elseif book then
        open_library()
    end
end

v.set_cursor = function(hand)
    if v.hover == hand then return end
    v.hover = hand
    local c = hand and v.cursor_hand or v.cursor_arrow
    if c then sdl.set_cursor(c) end
end

v.update_cursor = function(x, y)
    local hand = false
    if browser.open then
        if y >= browser.top and y < browser.top + browser.visible * browser.line_h then
            local idx = browser.first + math.floor((y - browser.top) / browser.line_h)
            hand = idx >= 1 and idx <= #browser.items
        end
    elseif search.open then
        if y >= search.top and y < search.top + search.visible * search.line_h then
            local idx = search.first + math.floor((y - search.top) / search.line_h)
            hand = idx >= 1 and idx <= #search.results
        end
    elseif toc.open then
        if y >= toc.top and y < toc.top + toc.visible * toc.line_h then
            local idx = toc.first + math.floor((y - toc.top) / toc.line_h)
            hand = idx >= 1 and idx <= #toc.items
        end
    elseif bm_open then
        if y >= toc.top and y < toc.top + toc.visible * toc.line_h then
            local idx = bm_first + math.floor((y - toc.top) / toc.line_h)
            hand = idx >= 1 and idx <= #bm_items
        end
    elseif st_open then
        if y >= toc.top and y < toc.top + 4 * toc.line_h then
            hand = true
        end
    elseif lib.open then
        if y >= S(30) and y <= S(80) and x >= lib.open_x - S(12) then
            hand = true
        elseif y >= S(30) and y <= S(80) and x >= lib.clear_x - S(8) then
            hand = true
        elseif y >= lib.top and y < lib.top + lib.visible * lib.line_h then
            local idx = lib.first + math.floor((y - lib.top) / lib.line_h)
            hand = idx >= 1 and idx <= #lib.items
        end
    elseif not v.fs and y <= 58 then
        hand = x >= hdr_st_x
    elseif doc and not is_txt then
        for _, r in ipairs(v.rects) do
            if x >= r.x and x < r.x + r.w and
               y >= r.y and y < r.y + r.h then
                local nx = (x - r.x) / r.w
                local ny = (y - r.y) / r.h
                for _, l in ipairs(v.links[r.page] or {}) do
                    if nx >= l.x0 and nx <= l.x1 and
                       ny >= l.y0 and ny <= l.y1 then
                        hand = true
                        break
                    end
                end
                break
            end
        end
    end
    v.set_cursor(hand)
end

v.ensure_content_size = function()
    local dirty = false
    if lib.open and (lib.ui_w ~= W or lib.ui_h ~= H) then
        refresh_lib_texts()
        dirty = true
    end
    if book and not is_txt and tex then
        local spread, _, _, _, tw = v.view_metrics()
        if spread and page == 0 then tw = math.max(160, W - S(48)) end
        local expected = math.floor(tw * (v.zoom or 1) + 0.5)
        if math.abs((tex_w or 0) - expected) > 2 or
           (v.p2 and math.abs((v.p2w or 0) - expected) > 2) then
            v.pending_layout = v.reflow
            load_page(page)
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

    if is_txt and book and size_changed then
        build_txt_pages(book)
        page = math.max(0, math.min(total - 1, page))
    end
    local sig = v.content_sig()
    local content_changed = sig ~= v.content_sig_value or v.pending_layout
    rebuild_header_actions()
    if lib.open and refresh_lib_texts then refresh_lib_texts() end
    v.sy = 0
    if book and content_changed then
        v.pending_layout = v.reflow
        load_page(page)
    else
        v.content_sig_value = sig
        refresh_text()
    end
    return true
end

v.content_click = function(x, y)
            local linked = false
            for _, r in ipairs(v.rects) do
                if x >= r.x and x < r.x + r.w and
                   y >= r.y and y < r.y + r.h then
                    if doc then
                        local nx = (x - r.x) / r.w
                        local ny = (y - r.y) / r.h
                        for _, l in ipairs(v.links[r.page] or {}) do
                            if nx >= l.x0 and nx <= l.x1 and
                               ny >= l.y0 and ny <= l.y1 then
                                local tp, _, oy = rd.link_at(doc, r.page, nx, ny)
                                tp = tp or l.page
                                load_page(tp)
                                if oy and oy > 0 then
                                    local h = tex_h
                                    if v.spread_mode() and tp == page + 1 then
                                        h = v.p2h
                                    end
                                    v.sy = math.max(0, math.min(v.max_scroll(),
                                        math.floor(oy * h) - 60))
                                end
                                save_progress()
                                linked = true
                                break
                            end
                        end
                    end
                    break
                end
            end
            if not linked then
                if x < W / 3 then
                    turn(-1)
                elseif x > W * 2 / 3 then
                    turn(1)
                end
            end
end

v.on_mouse_down = function(x, y, button)
    if button == 3 then
        go_back()
    elseif browser.open then
        if y >= browser.top and y < browser.top + browser.visible * browser.line_h then
            local idx = browser.first + math.floor((y - browser.top) / browser.line_h)
            if idx >= 1 and idx <= #browser.items then
                browser.selected = idx
                v.browser_rebuild()
                v.browser_activate()
            end
        end
    elseif search.open then
        if y >= search.top and y < search.top + search.visible * search.line_h then
            local idx = search.first + math.floor((y - search.top) / search.line_h)
            if idx >= 1 and idx <= #search.results then
                search.selected = idx
                rebuild_search_texs()
                search_activate()
            end
        end
    elseif toc.open then
        if y >= toc.top and y < toc.top + toc.visible * toc.line_h then
            local idx = toc.first + math.floor((y - toc.top) / toc.line_h)
            if idx >= 1 and idx <= #toc.items then
                toc.selected = idx
                rebuild_toc_texs()
                toc_activate()
            end
        end
    elseif bm_open then
        if y >= toc.top and y < toc.top + toc.visible * toc.line_h then
            local idx = bm_first + math.floor((y - toc.top) / toc.line_h)
            if idx >= 1 and idx <= #bm_items then
                bm_selected = idx
                rebuild_bm_texs()
                bm_activate()
            end
        end
    elseif st_open then
        if y >= toc.top and y < toc.top + 4 * toc.line_h then
            local idx = math.floor((y - toc.top) / toc.line_h) + 1
            if idx >= 1 and idx <= 4 then
                st_selected = idx
                rebuild_st_texs()
                st_adjust(1)
            end
        end
    elseif lib.open then
        if y >= S(30) and y <= S(80) and x >= lib.open_x - S(12) then
            v.choose_book()
        elseif y >= S(30) and y <= S(80) and x >= lib.clear_x - S(8) then
            v.clear_history()
        elseif y >= lib.top and y < lib.top + lib.visible * lib.line_h then
            local idx = lib.first + math.floor((y - lib.top) / lib.line_h)
            if idx >= 1 and idx <= #lib.items then
                lib.selected = idx
                rebuild_lib_texs()
                lib_activate()
            end
        end
    else
        if not v.fs and y <= 58 then
            if x >= v.fs_x then
                v.toggle_fs()
            elseif x >= v.max_x then
                v.toggle_max()
            elseif x >= v.eye_x then
                toggle_eye()
            elseif x >= v.dual_x then
                toggle_dual()
            elseif x >= v.shot_x then
                v.take_snapshot()
            elseif x >= v.hdr_open_x then
                v.choose_book()
            elseif x >= hdr_bm_x then
                open_bookmarks()
            elseif x >= hdr_toc_x then
                open_toc()
            elseif x >= hdr_st_x then
                open_settings()
            else
                open_toc()
            end
        else
            v.content_click(x, y)
        end
    end
end

v.key_search = function(k)
    if k == sdl.SDLK_UP then search_move(-1)
    elseif k == sdl.SDLK_DOWN then search_move(1)
    elseif k == sdl.SDLK_PAGEUP then search_move(-10)
    elseif k == sdl.SDLK_PAGEDOWN then search_move(10)
    elseif k == sdl.SDLK_RETURN then run_search()
    elseif k == sdl.SDLK_ESCAPE then close_search()
    elseif k == sdl.SDLK_BACKSPACE then
        search.query = remove_last_utf8(search.query)
        update_search_query_tex()
    end
end

v.key_toc = function(k)
    if k == sdl.SDLK_UP then toc_move(-1)
    elseif k == sdl.SDLK_DOWN then toc_move(1)
    elseif k == sdl.SDLK_PAGEUP then toc_move(-10)
    elseif k == sdl.SDLK_PAGEDOWN then toc_move(10)
    elseif k == sdl.SDLK_RETURN or k == sdl.SDLK_RIGHT then toc_activate()
    elseif k == sdl.SDLK_ESCAPE or k == sdl.SDLK_T then close_toc()
    end
end

v.key_bm = function(k)
    if k == sdl.SDLK_UP then bm_move(-1)
    elseif k == sdl.SDLK_DOWN then bm_move(1)
    elseif k == sdl.SDLK_PAGEUP then bm_move(-10)
    elseif k == sdl.SDLK_PAGEDOWN then bm_move(10)
    elseif k == sdl.SDLK_RETURN or k == sdl.SDLK_RIGHT then bm_activate()
    elseif k == sdl.SDLK_DELETE or k == sdl.SDLK_BACKSPACE then bm_remove()
    elseif k == sdl.SDLK_ESCAPE or k == sdl.SDLK_B then close_bm()
    elseif k == sdl.SDLK_A then
        add_bookmark(nil)
        bm_items = load_bookmarks_data()
        refresh_bm_count()
        if #bm_items == 0 then
            if bm_empty_tex then sdl.destroy_texture(bm_empty_tex); bm_empty_tex = nil end
            bm_empty_tex, bm_empty_w, bm_empty_h = make_text("（暂无书签）", f_body, theme.muted)
        end
        rebuild_bm_texs()
    end
end

v.key_st = function(k)
    if k == sdl.SDLK_UP then st_move(-1)
    elseif k == sdl.SDLK_DOWN then st_move(1)
    elseif k == sdl.SDLK_LEFT then st_adjust(-1)
    elseif k == sdl.SDLK_RIGHT or k == sdl.SDLK_RETURN then st_adjust(1)
    elseif k == sdl.SDLK_ESCAPE or k == sdl.SDLK_S then close_st()
    end
end

v.key_lib = function(k, mod)
    if k == sdl.SDLK_UP then lib_move(-1)
    elseif k == sdl.SDLK_DOWN then lib_move(1)
    elseif k == sdl.SDLK_PAGEUP then lib_move(-10)
    elseif k == sdl.SDLK_PAGEDOWN then lib_move(10)
    elseif k == sdl.SDLK_RETURN or k == sdl.SDLK_RIGHT then lib_activate()
    elseif k == sdl.SDLK_ESCAPE or k == sdl.SDLK_Q then running = false
    elseif k == sdl.SDLK_S then open_settings()
    elseif k == sdl.SDLK_O then v.choose_book()
    elseif k == sdl.SDLK_DELETE then
        if require("bit").band(mod or 0, 3) ~= 0 then
            v.clear_history()
        else
            v.remove_history(lib.selected)
        end
    end
end

v.key_content = function(k, mod)
    if k == sdl.SDLK_ESCAPE then go_back()
    elseif k == sdl.SDLK_Q then running = false
    elseif k == sdl.SDLK_C then toggle_dual()
    elseif k == sdl.SDLK_E then toggle_eye()
    elseif (k == sdl.SDLK_RIGHT or k == sdl.SDLK_LEFT) and
           require("bit").band(mod, 3) ~= 0 then
        v.pan(k == sdl.SDLK_RIGHT and 120 or -120)
    elseif k == sdl.SDLK_RIGHT or k == sdl.SDLK_PAGEDOWN then turn(1)
    elseif k == sdl.SDLK_LEFT or k == sdl.SDLK_PAGEUP then turn(-1)
    elseif k == sdl.SDLK_PLUS or k == sdl.SDLK_EQUALS or
           k == sdl.SDLK_KP_PLUS then
        v.set_zoom(v.zoom * 1.25)
    elseif k == sdl.SDLK_MINUS or k == sdl.SDLK_KP_MINUS then
        v.set_zoom(v.zoom / 1.25)
    elseif k == sdl.SDLK_0 then v.set_zoom(1.0)
    elseif k == sdl.SDLK_DOWN then v.scroll_by(80)
    elseif k == sdl.SDLK_UP then v.scroll_by(-80)
    elseif k == sdl.SDLK_T then open_toc()
    elseif k == sdl.SDLK_O then v.choose_book()
    elseif k == sdl.SDLK_B then open_bookmarks()
    elseif k == sdl.SDLK_S then open_settings()
    elseif k == sdl.SDLK_SLASH or k == sdl.SDLK_F then open_search()
    elseif k == sdl.SDLK_A then add_bookmark(nil)
    elseif k == sdl.SDLK_F12 then
        v.take_snapshot()
    end
end

v.on_key = function(k, mod)
    if k == sdl.SDLK_F10 then v.toggle_max()
    elseif k == sdl.SDLK_F11 then v.toggle_fs()
    elseif browser.open then v.key_browser(k)
    elseif search.open then v.key_search(k)
    elseif toc.open then v.key_toc(k)
    elseif bm_open then v.key_bm(k)
    elseif st_open then v.key_st(k)
    elseif lib.open then v.key_lib(k, mod)
    else v.key_content(k, mod)
    end
end

v.take_snapshot = function()
    local path = v.snapshot_path()
    draw()
    local ok = v.save_content_snapshot(path)
    if ok then
        print("snapshot: " .. path)
        v.show_toast("截图已保存：" .. path, 4)
    else
        v.show_toast("截图失败", 3)
    end
    return ok, path
end

local function state_table()
    if lib.open then
        return { library = true, count = #lib.items, library_dir = lib.dir }
    end
    local pct = total > 0 and ((page + 1) * 100.0 / total) or 0
    return {
        book = book,
        page = page + 1,
        pages = total,
        percent = math.floor(pct * 10 + 0.5) / 10,
        bookmarks = #load_bookmarks_data(),
        format = is_txt and "txt" or "doc",
        theme = settings.theme,
        font_size = settings.font_size,
        zoom = v.zoom,
        fullscreen = v.fs,
        maximized = v.max,
        dual = v.dual,
        spread = v.spread_mode(),
        window_width = W,
        window_height = H,
    }
end

local function settings_table()
    return {
        theme = settings.theme,
        font_size = settings.font_size,
        line_factor = settings.line_factor,
        margin = settings.margin,
    }
end

local function do_click(id)
    if id == "reader.next" then
        turn(1)
        return { ok = true, state = state_table() }
    elseif id == "reader.prev" then
        turn(-1)
        return { ok = true, state = state_table() }
    elseif id == "app.toc" then
        toggle_toc()
        return { ok = true, open = toc.open }
    elseif id == "app.bookmarks" then
        toggle_bookmarks()
        return { ok = true, open = bm_open }
    elseif id == "app.settings" then
        if st_open then close_st() else open_settings() end
        return { ok = true, open = st_open }
    elseif id == "app.search" then
        if search.open then close_search() else open_search() end
        return { ok = true, open = search.open }
    elseif id == "app.library" then
        open_library()
        return { ok = true, library = true, count = #lib.items }
    elseif id == "app.fullscreen" then
        v.toggle_fs()
        return { ok = true, fullscreen = v.fs, state = state_table() }
    elseif id == "app.maximize" then
        v.toggle_max()
        return { ok = true, maximized = v.max, state = state_table() }
    elseif id == "app.dual" then
        toggle_dual()
        return { ok = true, dual = v.dual, state = state_table() }
    elseif id == "app.eye" then
        toggle_eye()
        return { ok = true, theme = settings.theme, state = state_table() }
    elseif id == "app.quit" then
        running = false
        return { ok = true }
    end
    return { ok = false, error = "unknown action: " .. tostring(id) }
end

v.extra_controls = function(fn, args)
    if fn == "app.state" then
        return { ok = true, state = state_table() }
    elseif fn == "reader.scroll" then
        v.scroll_by(tonumber(args.dy or args.delta) or 0)
        return { ok = true, state = state_table() }
    elseif fn == "reader.zoom" then
        local z = tonumber(args.zoom or args.z)
        if z then v.set_zoom(z) end
        return { ok = true, zoom = v.zoom, state = state_table() }
    elseif fn == "reader.pan" then
        v.pan(tonumber(args.dx) or 0)
        return { ok = true, state = state_table() }
    elseif fn == "library.scan" then
        if not lib.open then open_library() end
        scan_library()
        refresh_lib_texts()
        return { ok = true, count = #lib.items, items = lib.items }
    elseif fn == "library.select" then
        if not lib.open then open_library() end
        local idx = tonumber(args.index or args.selected)
        if idx then
            lib.selected = math.max(1, math.min(#lib.items, idx))
        else
            lib_move(tonumber(args.delta) or 1)
        end
        rebuild_lib_texs()
        return { ok = true, selected = lib.selected, item = lib.items[lib.selected] }
    elseif fn == "library.activate" then
        if not lib.open then open_library() end
        local idx = tonumber(args.index or args.selected)
        if idx then
            lib.selected = math.max(1, math.min(#lib.items, idx))
            rebuild_lib_texs()
        end
        lib_activate()
        return { ok = true, state = state_table() }
    elseif fn == "toc.open" then
        open_toc()
        return { ok = true, open = true, toc = toc.items }
    elseif fn == "toc.close" then
        close_toc()
        return { ok = true, open = false }
    elseif fn == "toc.select" then
        local idx = tonumber(args.index or args.selected)
        if idx then
            if #toc.items > 0 then
                toc.selected = math.max(1, math.min(#toc.items, idx))
                rebuild_toc_texs()
            end
        else
            toc_move(tonumber(args.delta) or 1)
        end
        return { ok = true, selected = toc.selected, item = toc.items[toc.selected] }
    elseif fn == "toc.activate" then
        if not toc.open then open_toc() end
        local idx = tonumber(args.index or args.selected)
        if idx and #toc.items > 0 then
            toc.selected = math.max(1, math.min(#toc.items, idx))
            rebuild_toc_texs()
        end
        toc_activate()
        return { ok = true, state = state_table() }
    elseif fn == "search.open" then
        open_search()
        if args.q then
            search.query = tostring(args.q)
            update_search_query_tex()
            run_search()
        end
        return { ok = true, open = true, query = search.query, results = search.results }
    elseif fn == "search.select" then
        local idx = tonumber(args.index or args.selected)
        if idx then
            if #search.results > 0 then
                search.selected = math.max(1, math.min(#search.results, idx))
                rebuild_search_texs()
            end
        else
            search_move(tonumber(args.delta) or 1)
        end
        return { ok = true, selected = search.selected, item = search.results[search.selected] }
    elseif fn == "search.activate" then
        if not search.open then open_search() end
        local idx = tonumber(args.index or args.selected)
        if idx and #search.results > 0 then
            search.selected = math.max(1, math.min(#search.results, idx))
            rebuild_search_texs()
        end
        search_activate()
        return { ok = true, state = state_table() }
    elseif fn == "bookmark.open" then
        open_bookmarks()
        return { ok = true, open = true, bookmarks = bm_items }
    elseif fn == "bookmark.select" then
        if not bm_open then open_bookmarks() end
        local idx = tonumber(args.index or args.selected)
        if idx then
            if #bm_items > 0 then
                bm_selected = math.max(1, math.min(#bm_items, idx))
                rebuild_bm_texs()
            end
        else
            bm_move(tonumber(args.delta) or 1)
        end
        return { ok = true, selected = bm_selected, item = bm_items[bm_selected] }
    elseif fn == "bookmark.activate" then
        if not bm_open then open_bookmarks() end
        local idx = tonumber(args.index or args.selected)
        if idx and #bm_items > 0 then
            bm_selected = math.max(1, math.min(#bm_items, idx))
            rebuild_bm_texs()
        end
        bm_activate()
        return { ok = true, state = state_table() }
    elseif fn == "settings.open" then
        open_settings()
        local row = tonumber(args.row or args.selected)
        if row then
            st_selected = math.max(1, math.min(4, row))
            rebuild_st_texs()
        end
        return { ok = true, open = true, selected = st_selected, settings = settings_table() }
    elseif fn == "settings.adjust" then
        if not st_open then open_settings() end
        local row = tonumber(args.row or args.selected)
        if row then
            st_selected = math.max(1, math.min(4, row))
            rebuild_st_texs()
        end
        st_adjust(tonumber(args.delta) or 1)
        return { ok = true, selected = st_selected, settings = settings_table() }
    elseif fn == "search.close" then
        close_search()
        return { ok = true, open = false }
    elseif fn == "settings.close" then
        close_st()
        return { ok = true, open = false }
    elseif fn == "bookmark.close" then
        close_bm()
        return { ok = true, open = false }
    elseif fn == "library.close" then
        lib.open = false
        destroy_lib()
        return { ok = true, library = false }
    elseif fn == "history.remove" then
        local idx = tonumber(args.index or args.selected)
        if not idx and args.path then
            for i, it in ipairs(lib.items) do
                if it.path == args.path then idx = i; break end
            end
        end
        if not idx then return { ok = false, error = "missing index/path" } end
        if not lib.open then open_library() end
        local ok = v.remove_history(idx)
        return { ok = ok, items = lib.items }
    elseif fn == "history.clear" then
        if not lib.open then open_library() end
        v.clear_history()
        return { ok = true, items = lib.items }
    end
    return nil
end

local function do_call(fn, args)
    local handled = v.extra_controls(fn, args)
    if handled ~= nil then return handled end
    if fn == "reader.open" then
        if search.open then close_search() end
        lib.open = false
        destroy_lib()
        local ok, err = open_book(args.path or "", args.page)
        if not ok then return { ok = false, error = tostring(err) } end
        return { ok = true, state = state_table() }
    elseif fn == "reader.close" then
        if search.open then close_search() end
        close_book()
        return { ok = true }
    elseif fn == "reader.next" then
        turn(1)
        return { ok = true, state = state_table() }
    elseif fn == "reader.prev" then
        turn(-1)
        return { ok = true, state = state_table() }
    elseif fn == "reader.state" then
        return { ok = true, state = state_table() }
    elseif fn == "reader.list" then
        if not lib.open then scan_library() end
        return { ok = true, items = lib.items, library_dir = lib.dir }
    elseif fn == "app.library" or fn == "nav.books" then
        open_library()
        return { ok = true, library = true, count = #lib.items }
    elseif fn == "app.fullscreen" then
        v.toggle_fs()
        return { ok = true, fullscreen = v.fs, state = state_table() }
    elseif fn == "app.maximize" then
        v.toggle_max()
        return { ok = true, maximized = v.max, state = state_table() }
    elseif fn == "app.dual" then
        toggle_dual()
        return { ok = true, dual = v.dual, state = state_table() }
    elseif fn == "app.eye" then
        toggle_eye()
        return { ok = true, theme = settings.theme, state = state_table() }
    elseif fn == "reader.text" then
        local n = tonumber(args.page)
        if n then
            n = math.max(0, math.min(total - 1, n - 1))
        else
            n = page
        end
        local txt = ""
        if is_txt then
            txt = table.concat((pages and pages[n + 1]) or {}, "\n")
        elseif doc then
            txt = rd.page_text(doc, n) or ""
        end
        return { ok = true, page = n + 1, pages = total, text = txt }
    elseif fn == "reader.toc" then
        return { ok = true, toc = load_toc_data() }
    elseif fn == "reader.search" then
        local q = args.q or ""
        local results = v.search_cache[q]
        if not results then
            if is_txt then
                results = search_txt(q, page, 50)
            elseif doc then
                results = rd.search(doc, q, page, 50)
            else
                results = {}
            end
            local n = 0
            for _ in pairs(v.search_cache) do n = n + 1 end
            if n >= 20 then v.search_cache = {} end
            v.search_cache[q] = results
        end
        return { ok = true, query = q, results = results }
    elseif fn == "reader.goto" then
        local n = tonumber(args.page or args.index)
        if n then
            load_page(math.max(0, math.min(total - 1, n - 1)))
            save_progress()
        end
        return { ok = true, state = state_table() }
    elseif fn == "reader.bookmark.add" then
        local ok, err = add_bookmark(args.note)
        return { ok = ok, error = err, bookmarks = load_bookmarks_data() }
    elseif fn == "reader.bookmark.list" then
        return { ok = true, bookmarks = load_bookmarks_data() }
    elseif fn == "reader.bookmark.remove" then
        local idx = tonumber(args.index)
        local ok = idx and remove_bookmark(idx) or false
        return { ok = ok, bookmarks = load_bookmarks_data() }
    elseif fn == "settings.get" then
        return { ok = true, settings = settings_table() }
    elseif fn == "settings.set" then
        if args.theme then settings.theme = args.theme end
        if args.font_size then settings.font_size = tonumber(args.font_size) or settings.font_size end
        if args.line_factor then settings.line_factor = tonumber(args.line_factor) or settings.line_factor end
        if args.margin then settings.margin = tonumber(args.margin) or settings.margin end
        if not THEMES[settings.theme] then settings.theme = "light" end
        if args.font_size or args.line_factor or args.margin then
            v.pending_layout = v.reflow
        end
        apply_settings()
        return { ok = true, settings = settings_table() }
    elseif fn == "app.toc" then
        if search.open then close_search() end
        toggle_toc()
        return { ok = true, open = toc.open }
    elseif fn == "app.bookmarks" then
        if search.open then close_search() end
        toggle_bookmarks()
        return { ok = true, open = bm_open }
    elseif fn == "app.settings" then
        if search.open then close_search() end
        if st_open then close_st() else open_settings() end
        return { ok = true, open = st_open }
    elseif fn == "app.search" then
        if not search.open then open_search() end
        if args.q and args.q ~= "" then
            search.query = args.q
            update_search_query_tex()
            run_search()
        end
        return { ok = true, open = search.open, query = search.query, results = search.results }
    elseif fn == "app.snapshot" then
        draw()
        local path = args.path or v.snapshot_path()
        local ok = v.save_content_snapshot(path)
        return { ok = ok, path = path }
    elseif fn == "app.capture" then
        draw()
        local path = args.path or v.snapshot_path()
        local ok = sdl.capture(ren, W, H, path, rd)
        return { ok = ok, path = path }
    elseif fn == "app.quit" then
        running = false
        return { ok = true }
    end
    return { ok = false, error = "unknown fn: " .. tostring(fn) }
end

local function actions()
    return { "reader.next", "reader.prev", "app.library", "app.toc", "app.bookmarks", "app.settings", "app.search", "app.fullscreen", "app.maximize", "app.dual", "app.eye", "app.quit" }
end

if v.startup_sync and shot == "" then
    v.pending_initial = { book = initial_book, page = initial_page }
elseif initial_book ~= "" then
    local ok, err = open_book(initial_book, initial_page)
    if not ok then error("open failed: " .. tostring(err)) end
else
    open_library()
end

local server = nil
if shot == "" then
    local sock = os.getenv("READER_AUTOMATION_SOCK")
        or "/tmp/native-reader-automation.sock"
    local ok_srv, s = pcall(automation.start, sock, {
        actions = actions,
        state = state_table,
        click = function(id)
            local r = do_click(id)
            v.dirty = true
            return r
        end,
        call = function(fn, args)
            local r = do_call(fn, args)
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
    if search.open then close_search() end
    if browser.open then v.browser_close() end
    save_progress()
    close_book()
    if lib.open then destroy_lib() end
    if hdr_toc_tex then sdl.destroy_texture(hdr_toc_tex); hdr_toc_tex = nil end
    if hdr_bm_tex then sdl.destroy_texture(hdr_bm_tex); hdr_bm_tex = nil end
    if hdr_st_tex then sdl.destroy_texture(hdr_st_tex); hdr_st_tex = nil end
    if v.fs_tex then sdl.destroy_texture(v.fs_tex); v.fs_tex = nil end
    if v.max_tex then sdl.destroy_texture(v.max_tex); v.max_tex = nil end
    if v.eye_tex then sdl.destroy_texture(v.eye_tex); v.eye_tex = nil end
    if v.dual_tex then sdl.destroy_texture(v.dual_tex); v.dual_tex = nil end
    if v.shot_tex then sdl.destroy_texture(v.shot_tex); v.shot_tex = nil end
    if v.hdr_open_tex then sdl.destroy_texture(v.hdr_open_tex); v.hdr_open_tex = nil end
    if v.toast_tex then sdl.destroy_texture(v.toast_tex); v.toast_tex = nil end
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
        v.had_event = true
        local t = ev[0].type
        if t == sdl.QUIT then
            running = false
        elseif t == sdl.WINDOWEVENT then
            local we = ev[0].window.event
            if we == sdl.WINDOWEVENT_SIZE_CHANGED or
               we == sdl.WINDOWEVENT_MAXIMIZED or
               we == sdl.WINDOWEVENT_RESTORED then
                v.resize_pending = true
                local ew, eh = ev[0].window.data1, ev[0].window.data2
                if (we == sdl.WINDOWEVENT_SIZE_CHANGED or
                    we == 5) and ew and eh and ew > 0 and eh > 0 then
                    v.resize_target_w = math.floor(ew * (v.scale_x or 1) + 0.5)
                    v.resize_target_h = math.floor(eh * (v.scale_y or 1) + 0.5)
                else
                    v.resize_target_w, v.resize_target_h = v.window_target_size()
                end
                if we == sdl.WINDOWEVENT_MAXIMIZED or
                   we == sdl.WINDOWEVENT_RESTORED then
                    v.resize_last_w, v.resize_last_h = nil, nil
                    v.resize_due = v.now() + 0.05
                else
                    v.resize_due = v.now() + 0.20
                end
            end
        elseif t == sdl.KEYDOWN then
            v.on_key(ev[0].key.sym, ev[0].key.mod)
        elseif t == sdl.TEXTINPUT then
            if search.open then
                search.query = search.query .. ffi.string(ev[0].text.text)
                update_search_query_tex()
            end
        elseif t == sdl.MOUSEMOTION then
            local x = ev[0].motion.x * v.scale_x
            local y = ev[0].motion.y * v.scale_y
            if v.dragging then
                local dx = x - v.drag_x
                local dy = y - v.drag_y
                v.drag_x, v.drag_y = x, y
                v.pan(dx)
                v.sy = math.max(0, math.min(v.max_scroll(), v.sy - dy))
                v.dirty = true
                v.set_cursor(false)
            else
                v.update_cursor(x, y)
            end
        elseif t == sdl.MOUSEWHEEL then
            if not search.open and not toc.open and not bm_open and not st_open and not lib.open then
                local dy = ev[0].wheel.y
                if dy ~= 0 then v.scroll_by(-dy * 90) end
            end
        elseif t == sdl.MOUSEBUTTONDOWN then
            local x = ev[0].button.x * v.scale_x
            local y = ev[0].button.y * v.scale_y
            local button = ev[0].button.button
            if button == 2 then
                v.dragging = true
                v.drag_x, v.drag_y = x, y
                v.set_cursor(false)
            else
                v.on_mouse_down(x, y, button)
            end
        elseif t == sdl.MOUSEBUTTONUP then
            if ev[0].button.button == 2 then
                v.dragging = false
            end
        end
    end

    local now = v.now()
    if v.toast and now >= (v.toast_until or 0) then
        v.toast = nil
        if v.toast_tex then sdl.destroy_texture(v.toast_tex); v.toast_tex = nil end
        v.dirty = true
    end
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
                local ok, err = open_book(chosen, nil)
                if not ok then
                    print("open failed: " .. tostring(err))
                    v.show_toast("打开失败：" .. tostring(err), 3)
                end
            end
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
                local ok, err = open_book(pending.book, pending.page)
                if not ok then error("open failed: " .. tostring(err)) end
            else
                open_library()
            end
        else
            if lib.open and refresh_lib_texts then refresh_lib_texts() end
            v.sy = 0
            v.pending_layout = v.reflow
            if book then load_page(page) end
            refresh_text()
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
    v.drew = false
    if v.dirty then
        draw()
        v.dirty = false
        v.drew = true
    end
    sdl.delay(v.drew and 16 or 30)
end

cleanup()
