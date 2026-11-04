package.path = "./lua/?.lua;./lua/?/init.lua;" .. package.path

local ffi = require("ffi")
local sdl = require("ffi.sdl2")
local ttf = require("ffi.sdl2_ttf")
local rd = require("ffi.reader")
local automation = require("core.automation")

local initial_book = READER_BOOK or ""
local shot = READER_SCREENSHOT or ""
local initial_page = tonumber(READER_PAGE or "")
local zoom = tonumber(READER_ZOOM or "1.2") or 1.2
local frames = tonumber(READER_FRAMES or "0") or 0

if initial_book == "" then
    error("usage: native-reader <book> [--screenshot out.png] [--page N] [--zoom Z] [--frames N]")
end

if not sdl.init() then error("SDL_Init failed") end
if not ttf.init() then error("TTF_Init failed") end

local W, H = 900, 1200
local win = assert(sdl.create_window("native-reader", W, H), "SDL_CreateWindow failed")
local ren = assert(sdl.create_renderer(win), "SDL_CreateRenderer failed")

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

local THEMES = {
    light = {
        paper = { 245, 244, 237 }, card = { 255, 255, 255 },
        line = { 218, 214, 198 }, ink = { 27, 54, 93 },
        text = { 42, 42, 42 }, muted = { 120, 120, 120 },
        sel = { 240, 236, 224 }, shadow = { 236, 232, 222 },
    },
    sepia = {
        paper = { 243, 235, 215 }, card = { 250, 244, 226 },
        line = { 214, 200, 170 }, ink = { 90, 58, 30 },
        text = { 60, 50, 35 }, muted = { 140, 120, 90 },
        sel = { 238, 228, 206 }, shadow = { 228, 218, 196 },
    },
    dark = {
        paper = { 28, 28, 30 }, card = { 38, 38, 40 },
        line = { 70, 70, 74 }, ink = { 160, 190, 230 },
        text = { 220, 220, 220 }, muted = { 150, 150, 150 },
        sel = { 52, 52, 56 }, shadow = { 20, 20, 22 },
    },
}

local THEME_ORDER = { "light", "sepia", "dark" }
local THEME_NAMES = { light = "浅色", sepia = "护眼", dark = "深色" }
local FONT_ORDER = { 18, 20, 22, 24, 26 }
local LINE_ORDER = { 1.4, 1.6, 1.8, 2.0 }
local MARGIN_ORDER = { 48, 72, 96 }

local settings = {
    theme = "light",
    font_size = 22,
    line_factor = 1.6,
    margin = 72,
}
do
    local f = loadfile(settings_file)
    if f then
        local ok, t = pcall(f)
        if ok and type(t) == "table" then
            for k, v in pairs(t) do settings[k] = v end
        end
    end
end
if not THEMES[settings.theme] then settings.theme = "light" end
settings.font_size = tonumber(settings.font_size) or 22
settings.line_factor = tonumber(settings.line_factor) or 1.6
settings.margin = tonumber(settings.margin) or 72

local theme = THEMES[settings.theme]
local body_size = settings.font_size

local function save_settings()
    local f = io.open(settings_file, "w")
    if not f then return end
    f:write(string.format(
        "return {theme=%q,font_size=%d,line_factor=%.1f,margin=%d}\n",
        settings.theme, settings.font_size, settings.line_factor, settings.margin))
    f:close()
end

local f_title = ttf.open(font_bold, 26)
local f_page = ttf.open(font_regular, 18)
local f_body = ttf.open(font_regular, body_size)
if not f_title then f_title = f_page end
if not f_page then f_page = f_title end
if not f_body then f_body = f_page end

local function set_color(c)
    sdl.set_draw_color(ren, c[1], c[2], c[3], c[4] or 255)
end

local progress = {}
do
    local f = loadfile(state_file)
    if f then
        local ok, t = pcall(f)
        if ok and type(t) == "table" then progress = t end
    end
end

local book
local doc = nil
local total = 0
local pages = nil
local is_txt = false
local page = 0
local running = true

local tex, tex_w, tex_h = nil, 0, 0
local line_texs = {}
local title_text = ""
local title_tex, title_w, title_h
local page_tex, page_w, page_h

local hdr_toc_tex, hdr_toc_w, hdr_toc_h
local hdr_bm_tex, hdr_bm_w, hdr_bm_h
local hdr_st_tex, hdr_st_w, hdr_st_h
local hdr_bm_x, hdr_toc_x, hdr_st_x

local toc_open = false
local toc_items = {}
local toc_selected = 1
local toc_first = 1
local toc_texs = {}
local toc_title_tex, toc_title_w, toc_title_h
local toc_count_tex, toc_count_w, toc_count_h
local toc_hint_tex, toc_hint_w, toc_hint_h
local toc_empty_tex, toc_empty_w, toc_empty_h
local toc_line_h = 34
local toc_visible = 20
local toc_top = 120

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
    line_h = 34,
    visible = 16,
    top = 180,
}

local function save_state()
    local f = io.open(state_file, "w")
    if not f then return end
    f:write("return {\n")
    for path, rec in pairs(progress) do
        f:write(string.format("[%q]={page=%d,updated=%d,bookmarks={\n",
            path, rec.page or 0, rec.updated or 0))
        for _, b in ipairs(rec.bookmarks or {}) do
            f:write(string.format("{page=%d,note=%q,created=%d},\n",
                b.page or 0, b.note or "", b.created or 0))
        end
        f:write("}},\n")
    end
    f:write("}\n")
    f:close()
end

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
    save_state()
end

local function make_text(text, font, c)
    if not font then return nil, 0, 0 end
    local w, h = ttf.size(font, text)
    local t = ttf.render_texture(ren, font, text, c[1], c[2], c[3], c[4] or 255)
    return t, w, h
end

local function rebuild_header_actions()
    if hdr_toc_tex then sdl.destroy_texture(hdr_toc_tex); hdr_toc_tex = nil end
    if hdr_bm_tex then sdl.destroy_texture(hdr_bm_tex); hdr_bm_tex = nil end
    if hdr_st_tex then sdl.destroy_texture(hdr_st_tex); hdr_st_tex = nil end
    hdr_toc_tex, hdr_toc_w, hdr_toc_h = make_text("目录", f_page, theme.muted)
    hdr_bm_tex, hdr_bm_w, hdr_bm_h = make_text("书签", f_page, theme.muted)
    hdr_st_tex, hdr_st_w, hdr_st_h = make_text("设置", f_page, theme.muted)
    hdr_bm_x = W - 24 - (hdr_bm_w or 0)
    hdr_toc_x = hdr_bm_x - 24 - (hdr_toc_w or 0)
    hdr_st_x = hdr_toc_x - 24 - (hdr_st_w or 0)
end
rebuild_header_actions()

local function refresh_text()
    if title_tex then sdl.destroy_texture(title_tex); title_tex = nil end
    title_tex, title_w, title_h = make_text(title_text, f_title, theme.ink)

    if page_tex then sdl.destroy_texture(page_tex); page_tex = nil end
    local pct = total > 0 and ((page + 1) * 100.0 / total) or 0
    local ptxt = string.format("%d / %d · %.1f%%", page + 1, total, pct)
    page_tex, page_w, page_h = make_text(ptxt, f_page, theme.muted)
end

local function utf8_chars(s)
    local i = 1
    return function()
        if i > #s then return nil end
        local c = s:byte(i)
        local n = 1
        if c >= 0xF0 then n = 4
        elseif c >= 0xE0 then n = 3
        elseif c >= 0xC0 then n = 2 end
        local ch = s:sub(i, i + n - 1)
        i = i + n
        return ch
    end
end

local function truncate_utf8(s, max_chars)
    local out = {}
    local n = 0
    for ch in utf8_chars(s) do
        if n >= max_chars then
            out[#out + 1] = "…"
            break
        end
        out[#out + 1] = ch
        n = n + 1
    end
    return table.concat(out)
end

local function remove_last_utf8(s)
    local i = #s
    while i > 0 and s:byte(i) >= 0x80 and s:byte(i) < 0xC0 do
        i = i - 1
    end
    if i > 0 then i = i - 1 end
    return s:sub(1, i)
end

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

local function wrap_line(text, maxw)
    local out = {}
    if text == "" then out[1] = ""; return out end
    local buf = ""
    for ch in utf8_chars(text) do
        local candidate = buf .. ch
        local w = ttf.size(f_body, candidate)
        if w > maxw and buf ~= "" then
            out[#out + 1] = buf
            buf = ch
        else
            buf = candidate
        end
    end
    if buf ~= "" or #out == 0 then out[#out + 1] = buf end
    return out
end

local function txt_line_height()
    return math.max(1, math.floor(settings.font_size * settings.line_factor + 0.5))
end

local function build_txt_pages(path)
    local f, ferr = io.open(path, "rb")
    if not f then return false, ferr end
    local data = f:read("*a")
    f:close()
    data = data:gsub("^\239\187\191", "")
    data = data:gsub("\r\n", "\n"):gsub("\r", "\n")

    local top, bottom = 96, 80
    local line_h = txt_line_height()
    local margin = settings.margin
    local maxw = W - 2 * margin
    local lines_per_page = math.max(1, math.floor((H - top - bottom - 8) / line_h))

    local all = {}
    for para in (data .. "\n"):gmatch("(.-)\n") do
        local p = para
        if p ~= "" then p = "　　" .. p end
        for _, line in ipairs(wrap_line(p, maxw)) do
            all[#all + 1] = line
        end
    end

    pages = {}
    for i = 1, #all, lines_per_page do
        local p = {}
        for j = i, math.min(i + lines_per_page - 1, #all) do
            p[#p + 1] = all[j]
        end
        pages[#pages + 1] = p
    end
    if #pages == 0 then pages = { { "" } } end
    total = #pages
    return true
end

local function destroy_toc()
    for _, t in ipairs(toc_texs) do sdl.destroy_texture(t.tex) end
    toc_texs = {}
    if toc_title_tex then sdl.destroy_texture(toc_title_tex); toc_title_tex = nil end
    if toc_count_tex then sdl.destroy_texture(toc_count_tex); toc_count_tex = nil end
    if toc_hint_tex then sdl.destroy_texture(toc_hint_tex); toc_hint_tex = nil end
    if toc_empty_tex then sdl.destroy_texture(toc_empty_tex); toc_empty_tex = nil end
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
    toc_open = false
    toc_items = {}
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
    for _, t in ipairs(line_texs) do sdl.destroy_texture(t.tex) end
    line_texs = {}
    if title_tex then sdl.destroy_texture(title_tex); title_tex = nil end
    if page_tex then sdl.destroy_texture(page_tex); page_tex = nil end
    if doc then rd.close(doc); doc = nil end
    pages = nil
    total = 0
    page = 0
    tex_w, tex_h = 0, 0
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

local function load_page(n)
    if tex then sdl.destroy_texture(tex); tex = nil end
    for _, t in ipairs(line_texs) do sdl.destroy_texture(t.tex) end
    line_texs = {}

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
        refresh_text()
        print(string.format("[reader] txt page %d/%d", page + 1, total))
        return true
    end

    local pixels, w, h, stride = rd.render_page(doc, n, zoom)
    if not pixels then return false end
    if settings.theme == "dark" then
        invert_rgba(pixels, w, h, stride or (w * 4))
    end
    tex = assert(sdl.create_texture(ren, w, h), "SDL_CreateTexture failed")
    sdl.update_texture(tex, pixels, stride or (w * 4))
    rd.free(pixels)
    tex_w, tex_h = w, h
    page = n
    refresh_text()
    print(string.format("[reader] page %d/%d  %dx%d", page + 1, total, w, h))
    return true
end

local function open_book(path, start_page)
    if not path or path == "" then return false, "empty path" end
    close_book()
    book = path
    is_txt = rd.detect(path) == 5

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
        start = rec and rec.page or 0
    end
    start = math.max(0, math.min(total - 1, start or 0))

    page = 0
    local name = path:match("([^/]+)$") or path
    name = name:gsub("%.%w+$", "")
    title_text = truncate_utf8(name, 24)
    refresh_text()
    if not load_page(start) then return false, "render failed" end
    refresh_text()
    save_progress()
    return true
end

local function draw_page()
    set_color(theme.paper)
    sdl.render_clear(ren)

    if is_txt then
        local line_h = txt_line_height()
        local card_x = math.max(24, settings.margin - 24)
        local card = ffi.new("SDL_Rect")
        card.x, card.y, card.w, card.h = card_x, 72, W - 2 * card_x, H - 72 - 64
        set_color(theme.card)
        sdl.render_fill_rect(ren, card)
        set_color(theme.line)
        sdl.render_draw_rect(ren, card)

        for i, t in ipairs(line_texs) do
            local r = ffi.new("SDL_Rect")
            r.x, r.y, r.w, r.h = settings.margin, 96 + (i - 1) * line_h, t.w, t.h
            sdl.render_copy(ren, t.tex, nil, r)
        end
    elseif tex then
        local top, bottom = 96, 80
        local avail_w = W
        local avail_h = H - top - bottom
        local scale = math.min(avail_w / tex_w, avail_h / tex_h)
        local dw = math.floor(tex_w * scale)
        local dh = math.floor(tex_h * scale)
        local dst = ffi.new("SDL_Rect")
        dst.x = math.floor((W - dw) / 2)
        dst.y = top + math.floor((avail_h - dh) / 2)
        dst.w = dw
        dst.h = dh

        local shadow = ffi.new("SDL_Rect")
        shadow.x, shadow.y, shadow.w, shadow.h = dst.x + 4, dst.y + 4, dst.w, dst.h
        set_color(theme.shadow)
        sdl.render_fill_rect(ren, shadow)

        sdl.render_copy(ren, tex, nil, dst)

        set_color(theme.line)
        sdl.render_draw_rect(ren, dst)
    end

    if title_tex then
        local r = ffi.new("SDL_Rect")
        r.x, r.y, r.w, r.h = 24, 18, title_w, title_h
        sdl.render_copy(ren, title_tex, nil, r)
    end
    if hdr_st_tex then
        local r = ffi.new("SDL_Rect")
        r.x, r.y, r.w, r.h = hdr_st_x, 20, hdr_st_w, hdr_st_h
        sdl.render_copy(ren, hdr_st_tex, nil, r)
    end
    if hdr_toc_tex then
        local r = ffi.new("SDL_Rect")
        r.x, r.y, r.w, r.h = hdr_toc_x, 20, hdr_toc_w, hdr_toc_h
        sdl.render_copy(ren, hdr_toc_tex, nil, r)
    end
    if hdr_bm_tex then
        local r = ffi.new("SDL_Rect")
        r.x, r.y, r.w, r.h = hdr_bm_x, 20, hdr_bm_w, hdr_bm_h
        sdl.render_copy(ren, hdr_bm_tex, nil, r)
    end

    set_color(theme.line)
    local line = ffi.new("SDL_Rect")
    line.x, line.y, line.w, line.h = 24, 58, W - 48, 1
    sdl.render_fill_rect(ren, line)
    line.y = H - 50
    sdl.render_fill_rect(ren, line)

    if page_tex then
        local r = ffi.new("SDL_Rect")
        r.x, r.y, r.w, r.h = W - page_w - 24, H - 38, page_w, page_h
        sdl.render_copy(ren, page_tex, nil, r)
    end

    local bar_bg = ffi.new("SDL_Rect")
    bar_bg.x, bar_bg.y, bar_bg.w, bar_bg.h = 0, H - 3, W, 3
    set_color(theme.line)
    sdl.render_fill_rect(ren, bar_bg)

    local bar_fg = ffi.new("SDL_Rect")
    bar_fg.x, bar_fg.y, bar_fg.w, bar_fg.h = 0, H - 3,
        math.floor(W * (page + 1) / math.max(1, total)), 3
    set_color(theme.ink)
    sdl.render_fill_rect(ren, bar_fg)
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
    for _, t in ipairs(toc_texs) do sdl.destroy_texture(t.tex) end
    toc_texs = {}
    if #toc_items == 0 then return end

    toc_selected = math.max(1, math.min(#toc_items, toc_selected))
    local first = math.max(1, toc_selected - math.floor(toc_visible / 2))
    if first + toc_visible - 1 > #toc_items then
        first = math.max(1, #toc_items - toc_visible + 1)
    end
    toc_first = first
    local last = math.min(#toc_items, first + toc_visible - 1)

    for i = first, last do
        local it = toc_items[i]
        local text = string.rep("  ", it.level or 0) .. (it.title or "")
        local w, h = ttf.size(f_body, text)
        local c = (i == toc_selected) and theme.ink or theme.text
        local t = ttf.render_texture(ren, f_body, text, c[1], c[2], c[3], 255)
        if t then
            toc_texs[#toc_texs + 1] = { tex = t, w = w, h = h, index = i }
        end
    end
end

local function open_toc()
    close_bm()
    close_st()
    toc_items = load_toc_data()
    toc_open = true
    toc_selected = 1
    toc_title_tex, toc_title_w, toc_title_h = make_text("目录", f_title, theme.ink)
    toc_count_tex, toc_count_w, toc_count_h = make_text(
        string.format("%d 条", #toc_items), f_page, theme.muted)
    toc_hint_tex, toc_hint_w, toc_hint_h = make_text(
        "↑/↓ 选择 · Enter 跳转 · T/Esc 关闭", f_page, theme.muted)
    if #toc_items == 0 then
        toc_empty_tex, toc_empty_w, toc_empty_h = make_text("（无目录）", f_body, theme.muted)
    end
    rebuild_toc_texs()
end

local function toggle_toc()
    if toc_open then close_toc() else open_toc() end
end

local function toc_move(delta)
    if #toc_items == 0 then return end
    toc_selected = math.max(1, math.min(#toc_items, toc_selected + delta))
    rebuild_toc_texs()
end

local function toc_activate()
    local it = toc_items[toc_selected]
    if not it then return end
    close_toc()
    if it.page and it.page >= 0 and it.page < total then
        load_page(it.page)
        save_progress()
    end
end

local function draw_panel_frame(title_tex, title_w, title_h, count_tex, count_w, count_h)
    set_color(theme.paper)
    sdl.render_clear(ren)

    local card = ffi.new("SDL_Rect")
    card.x, card.y, card.w, card.h = 24, 24, W - 48, H - 48
    set_color(theme.card)
    sdl.render_fill_rect(ren, card)
    set_color(theme.line)
    sdl.render_draw_rect(ren, card)

    if title_tex then
        local r = ffi.new("SDL_Rect")
        r.x, r.y, r.w, r.h = 48, 44, title_w, title_h
        sdl.render_copy(ren, title_tex, nil, r)
    end
    if count_tex then
        local r = ffi.new("SDL_Rect")
        r.x = W - 48 - count_w
        r.y, r.w, r.h = 50, count_w, count_h
        sdl.render_copy(ren, count_tex, nil, r)
    end

    set_color(theme.line)
    local line = ffi.new("SDL_Rect")
    line.x, line.y, line.w, line.h = 40, 96, W - 80, 1
    sdl.render_fill_rect(ren, line)
end

local function draw_panel_items(texs, selected, empty_tex, empty_w, empty_h)
    if #texs == 0 then
        if empty_tex then
            local r = ffi.new("SDL_Rect")
            r.x, r.y, r.w, r.h = 48, toc_top, empty_w, empty_h
            sdl.render_copy(ren, empty_tex, nil, r)
        end
        return
    end

    local y = toc_top
    for _, t in ipairs(texs) do
        if t.index == selected then
            set_color(theme.sel)
            local row = ffi.new("SDL_Rect")
            row.x, row.y, row.w, row.h = 40, y - 4, W - 80, toc_line_h
            sdl.render_fill_rect(ren, row)

            set_color(theme.ink)
            local accent = ffi.new("SDL_Rect")
            accent.x, accent.y, accent.w, accent.h = 40, y - 4, 4, toc_line_h
            sdl.render_fill_rect(ren, accent)
        end

        local r = ffi.new("SDL_Rect")
        r.x, r.y, r.w, r.h = 56, y, t.w, t.h
        sdl.render_copy(ren, t.tex, nil, r)

        set_color(theme.line)
        local line = ffi.new("SDL_Rect")
        line.x, line.y, line.w, line.h = 40, y + toc_line_h - 1, W - 80, 1
        sdl.render_fill_rect(ren, line)

        y = y + toc_line_h
    end
end

local function draw_panel_hint(tex, w, h)
    if not tex then return end
    local r = ffi.new("SDL_Rect")
    r.x, r.y, r.w, r.h = 48, H - 56, w, h
    sdl.render_copy(ren, tex, nil, r)
end

local function draw_toc()
    draw_panel_frame(toc_title_tex, toc_title_w, toc_title_h,
        toc_count_tex, toc_count_w, toc_count_h)
    draw_panel_items(toc_texs, toc_selected, toc_empty_tex, toc_empty_w, toc_empty_h)
    draw_panel_hint(toc_hint_tex, toc_hint_w, toc_hint_h)
    sdl.render_present(ren)
end

local function load_bookmarks_data()
    local rec = progress[book]
    return rec and rec.bookmarks or {}
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
    rec.bookmarks[#rec.bookmarks + 1] = {
        page = page,
        note = (note and note ~= "") and note or string.format("第 %d 页", page + 1),
        created = os.time(),
    }
    table.sort(rec.bookmarks, function(a, b) return (a.page or 0) < (b.page or 0) end)
    save_state()
    return true
end

local function remove_bookmark(index)
    local rec = progress[book]
    if not rec or not rec.bookmarks or not rec.bookmarks[index] then
        return false
    end
    table.remove(rec.bookmarks, index)
    save_state()
    return true
end

local function rebuild_bm_texs()
    for _, t in ipairs(bm_texs) do sdl.destroy_texture(t.tex) end
    bm_texs = {}
    if #bm_items == 0 then return end

    bm_selected = math.max(1, math.min(#bm_items, bm_selected))
    local first = math.max(1, bm_selected - math.floor(toc_visible / 2))
    if first + toc_visible - 1 > #bm_items then
        first = math.max(1, #bm_items - toc_visible + 1)
    end
    bm_first = first
    local last = math.min(#bm_items, first + toc_visible - 1)

    for i = first, last do
        local b = bm_items[i]
        local text = string.format("第 %d 页  %s", (b.page or 0) + 1, b.note or "")
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
    if b.page and b.page >= 0 and b.page < total then
        load_page(b.page)
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
    draw_panel_frame(bm_title_tex, bm_title_w, bm_title_h,
        bm_count_tex, bm_count_w, bm_count_h)
    draw_panel_items(bm_texs, bm_selected, bm_empty_tex, bm_empty_w, bm_empty_h)
    draw_panel_hint(bm_hint_tex, bm_hint_w, bm_hint_h)
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
    if body_size ~= settings.font_size then
        local nf = ttf.open(font_regular, settings.font_size) or f_page
        local old = f_body
        f_body = nf
        body_size = settings.font_size
        if old and old ~= f_page and old ~= nf then ttf.close(old) end
    end
    theme = THEMES[settings.theme] or THEMES.light
    rebuild_header_actions()
    save_settings()
    if total > 0 then
        if is_txt then
            build_txt_pages(book)
            page = math.max(0, math.min(total - 1, page))
        end
        load_page(page)
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
    apply_settings()
end

local function draw_settings()
    draw_panel_frame(st_title_tex, st_title_w, st_title_h, nil, 0, 0)
    draw_panel_items(st_texs, st_selected, nil, 0, 0)
    draw_panel_hint(st_hint_tex, st_hint_w, st_hint_h)
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
    if is_txt then
        search.results = search_txt(q, page, 50)
    elseif doc then
        search.results = rd.search(doc, q, page, 50)
    else
        search.results = {}
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
    draw_panel_frame(search.title_tex, search.title_w, search.title_h,
        search.count_tex, search.count_w, search.count_h)

    local box = ffi.new("SDL_Rect")
    box.x, box.y, box.w, box.h = 48, 110, W - 96, 44
    set_color(theme.card)
    sdl.render_fill_rect(ren, box)
    set_color(theme.line)
    sdl.render_draw_rect(ren, box)
    if search.query_tex then
        local r = ffi.new("SDL_Rect")
        r.x, r.y, r.w, r.h = 64, 118, search.query_w, search.query_h
        sdl.render_copy(ren, search.query_tex, nil, r)
    end

    if #search.results == 0 then
        if search.empty_tex then
            local r = ffi.new("SDL_Rect")
            r.x, r.y, r.w, r.h = 56, search.top, search.empty_w, search.empty_h
            sdl.render_copy(ren, search.empty_tex, nil, r)
        end
    else
        local y = search.top
        for _, t in ipairs(search.texs) do
            if t.index == search.selected then
                set_color(theme.sel)
                local row = ffi.new("SDL_Rect")
                row.x, row.y, row.w, row.h = 40, y - 4, W - 80, search.line_h
                sdl.render_fill_rect(ren, row)
                set_color(theme.ink)
                local accent = ffi.new("SDL_Rect")
                accent.x, accent.y, accent.w, accent.h = 40, y - 4, 4, search.line_h
                sdl.render_fill_rect(ren, accent)
            end
            local r = ffi.new("SDL_Rect")
            r.x, r.y, r.w, r.h = 56, y, t.w, t.h
            sdl.render_copy(ren, t.tex, nil, r)
            set_color(theme.line)
            local line = ffi.new("SDL_Rect")
            line.x, line.y, line.w, line.h = 40, y + search.line_h - 1, W - 80, 1
            sdl.render_fill_rect(ren, line)
            y = y + search.line_h
        end
    end

    draw_panel_hint(search.hint_tex, search.hint_w, search.hint_h)
    sdl.render_present(ren)
end

local function draw()
    if search.open then
        draw_search()
        return
    end
    if toc_open then
        draw_toc()
        return
    end
    if bm_open then
        draw_bookmarks()
        return
    end
    if st_open then
        draw_settings()
        return
    end
    draw_page()
    sdl.render_present(ren)
end

local function turn(delta)
    local n = page + delta
    if n >= 0 and n < total then
        load_page(n)
        save_progress()
    end
end

local function state_table()
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
        return { ok = true, open = toc_open }
    elseif id == "app.bookmarks" then
        toggle_bookmarks()
        return { ok = true, open = bm_open }
    elseif id == "app.settings" then
        if st_open then close_st() else open_settings() end
        return { ok = true, open = st_open }
    elseif id == "app.search" then
        if search.open then close_search() else open_search() end
        return { ok = true, open = search.open }
    elseif id == "app.quit" then
        running = false
        return { ok = true }
    end
    return { ok = false, error = "unknown action: " .. tostring(id) }
end

local function do_call(fn, args)
    if fn == "reader.open" then
        if search.open then close_search() end
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
    elseif fn == "reader.toc" then
        return { ok = true, toc = load_toc_data() }
    elseif fn == "reader.search" then
        local q = args.q or ""
        local results
        if is_txt then
            results = search_txt(q, page, 50)
        elseif doc then
            results = rd.search(doc, q, page, 50)
        else
            results = {}
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
        apply_settings()
        return { ok = true, settings = settings_table() }
    elseif fn == "app.toc" then
        if search.open then close_search() end
        toggle_toc()
        return { ok = true, open = toc_open }
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
    elseif fn == "app.capture" then
        draw()
        local path = args.path or "/tmp/opencode/native_reader.png"
        local ok = sdl.capture(ren, W, H, path, rd)
        return { ok = ok, path = path }
    elseif fn == "app.quit" then
        running = false
        return { ok = true }
    end
    return { ok = false, error = "unknown fn: " .. tostring(fn) }
end

local function actions()
    return { "reader.next", "reader.prev", "app.toc", "app.bookmarks", "app.settings", "app.search", "app.quit" }
end

local ok, err = open_book(initial_book, initial_page)
if not ok then error("open failed: " .. tostring(err)) end

local server = nil
if shot == "" then
    local sock = os.getenv("READER_AUTOMATION_SOCK")
        or "/tmp/native-reader-automation.sock"
    local ok_srv, s = pcall(automation.start, sock, {
        actions = actions,
        state = state_table,
        click = do_click,
        call = do_call,
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
    save_progress()
    close_book()
    if hdr_toc_tex then sdl.destroy_texture(hdr_toc_tex); hdr_toc_tex = nil end
    if hdr_bm_tex then sdl.destroy_texture(hdr_bm_tex); hdr_bm_tex = nil end
    if hdr_st_tex then sdl.destroy_texture(hdr_st_tex); hdr_st_tex = nil end
    local seen = {}
    for _, f in ipairs({ f_title, f_page, f_body }) do
        if f and not seen[f] then
            seen[f] = true
            ttf.close(f)
        end
    end
    ttf.quit()
    sdl.destroy_renderer(ren)
    sdl.destroy_window(win)
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
        local t = ev[0].type
        if t == sdl.QUIT then
            running = false
        elseif t == sdl.KEYDOWN then
            local k = ev[0].key.sym
            if search.open then
                if k == sdl.SDLK_UP then
                    search_move(-1)
                elseif k == sdl.SDLK_DOWN then
                    search_move(1)
                elseif k == sdl.SDLK_PAGEUP then
                    search_move(-10)
                elseif k == sdl.SDLK_PAGEDOWN then
                    search_move(10)
                elseif k == sdl.SDLK_RETURN then
                    run_search()
                elseif k == sdl.SDLK_ESCAPE then
                    close_search()
                elseif k == sdl.SDLK_BACKSPACE then
                    search.query = remove_last_utf8(search.query)
                    update_search_query_tex()
                end
            elseif toc_open then
                if k == sdl.SDLK_UP then
                    toc_move(-1)
                elseif k == sdl.SDLK_DOWN then
                    toc_move(1)
                elseif k == sdl.SDLK_PAGEUP then
                    toc_move(-10)
                elseif k == sdl.SDLK_PAGEDOWN then
                    toc_move(10)
                elseif k == sdl.SDLK_RETURN or k == sdl.SDLK_RIGHT then
                    toc_activate()
                elseif k == sdl.SDLK_ESCAPE or k == sdl.SDLK_T then
                    close_toc()
                end
            elseif bm_open then
                if k == sdl.SDLK_UP then
                    bm_move(-1)
                elseif k == sdl.SDLK_DOWN then
                    bm_move(1)
                elseif k == sdl.SDLK_PAGEUP then
                    bm_move(-10)
                elseif k == sdl.SDLK_PAGEDOWN then
                    bm_move(10)
                elseif k == sdl.SDLK_RETURN or k == sdl.SDLK_RIGHT then
                    bm_activate()
                elseif k == sdl.SDLK_DELETE or k == sdl.SDLK_BACKSPACE then
                    bm_remove()
                elseif k == sdl.SDLK_ESCAPE or k == sdl.SDLK_B then
                    close_bm()
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
            elseif st_open then
                if k == sdl.SDLK_UP then
                    st_move(-1)
                elseif k == sdl.SDLK_DOWN then
                    st_move(1)
                elseif k == sdl.SDLK_LEFT then
                    st_adjust(-1)
                elseif k == sdl.SDLK_RIGHT or k == sdl.SDLK_RETURN then
                    st_adjust(1)
                elseif k == sdl.SDLK_ESCAPE or k == sdl.SDLK_S then
                    close_st()
                end
            else
                if k == sdl.SDLK_ESCAPE then
                    running = false
                elseif k == sdl.SDLK_RIGHT or k == sdl.SDLK_PAGEDOWN then
                    turn(1)
                elseif k == sdl.SDLK_LEFT or k == sdl.SDLK_PAGEUP then
                    turn(-1)
                elseif k == sdl.SDLK_T then
                    open_toc()
                elseif k == sdl.SDLK_B then
                    open_bookmarks()
                elseif k == sdl.SDLK_S then
                    open_settings()
                elseif k == sdl.SDLK_SLASH or k == sdl.SDLK_F then
                    open_search()
                elseif k == sdl.SDLK_A then
                    add_bookmark(nil)
                elseif k == sdl.SDLK_F12 then
                    if sdl.capture(ren, W, H, "/tmp/opencode/native_reader.png", rd) then
                        print("screenshot: /tmp/opencode/native_reader.png")
                    end
                end
            end
        elseif t == sdl.TEXTINPUT then
            if search.open then
                search.query = search.query .. ffi.string(ev[0].text.text)
                update_search_query_tex()
            end
        elseif t == sdl.MOUSEBUTTONDOWN then
            local x = ev[0].button.x
            local y = ev[0].button.y
            if search.open then
                if y >= search.top and y < search.top + search.visible * search.line_h then
                    local idx = search.first + math.floor((y - search.top) / search.line_h)
                    if idx >= 1 and idx <= #search.results then
                        search.selected = idx
                        rebuild_search_texs()
                        search_activate()
                    end
                end
            elseif toc_open then
                if y >= toc_top and y < toc_top + toc_visible * toc_line_h then
                    local idx = toc_first + math.floor((y - toc_top) / toc_line_h)
                    if idx >= 1 and idx <= #toc_items then
                        toc_selected = idx
                        rebuild_toc_texs()
                        toc_activate()
                    end
                end
            elseif bm_open then
                if y >= toc_top and y < toc_top + toc_visible * toc_line_h then
                    local idx = bm_first + math.floor((y - toc_top) / toc_line_h)
                    if idx >= 1 and idx <= #bm_items then
                        bm_selected = idx
                        rebuild_bm_texs()
                        bm_activate()
                    end
                end
            elseif st_open then
                if y >= toc_top and y < toc_top + 4 * toc_line_h then
                    local idx = math.floor((y - toc_top) / toc_line_h) + 1
                    if idx >= 1 and idx <= 4 then
                        st_selected = idx
                        rebuild_st_texs()
                        st_adjust(1)
                    end
                end
            else
                if y <= 58 then
                    if x >= hdr_bm_x then
                        open_bookmarks()
                    elseif x >= hdr_toc_x then
                        open_toc()
                    elseif x >= hdr_st_x then
                        open_settings()
                    else
                        open_toc()
                    end
                elseif x < W / 3 then
                    turn(-1)
                elseif x > W * 2 / 3 then
                    turn(1)
                end
            end
        end
    end

    draw()
    sdl.delay(16)
end

cleanup()
