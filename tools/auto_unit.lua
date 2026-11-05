-- tools/auto_unit.lua — 纯 Lua 模块单测（不依赖窗口/真实文档）。
local dir = arg[0]:match("^(.*)/[^/]+$") or "."
package.path = dir .. "/../lua/?.lua;" .. dir .. "/../lua/?/init.lua;" .. package.path

local ok, fail = 0, 0
local function check(cond, name)
    if cond then
        ok = ok + 1
    else
        fail = fail + 1
        print("FAIL " .. name)
    end
end

-- list: 可见窗口与行纹理
do
    local list = require("ui.list")
    local s, f, l = list.range(3, 2, 2)
    check(s == 2 and f == 1 and l == 2, "list.range middle")
    local s2, f2 = list.range(0, 1, 5)
    check(s2 == 1 and f2 == 1, "list.range empty")

    local made = 0
    local ttf = {
        size = function(_, text) return #text, 10 end,
        render_texture = function()
            made = made + 1
            return { id = made }
        end,
    }
    local theme = { ink = { 0, 0, 0, 255 }, text = { 1, 1, 1, 255 } }
    local texs, sel, first = list.rebuild({
        ttf = ttf, ren = nil, font = nil, theme = theme,
        items = { "a", "bb", "ccc" }, selected = 2, visible = 2,
        text = function(it) return it end,
    })
    check(#texs == 2 and sel == 2 and first == 1, "list.rebuild window")
    check(texs[1].index == 1 and texs[2].index == 2, "list.rebuild index")
end

-- text: UTF-8 遍历/截断
do
    local text = require("ui.text")
    local n = 0
    for _ in text.utf8_chars("中文abc") do n = n + 1 end
    check(n == 5, "text.utf8_chars")
    check(text.truncate_utf8("abcdef", 3) == "abc…", "text.truncate_utf8")
end

-- epub: 纯函数
do
    local epub = require("ui.epub")
    check(epub.hash("abc") == epub.hash("abc"), "epub.hash stable")
    check(epub.hash("abc") ~= epub.hash("abd"), "epub.hash differs")
    check(epub.join("/root/OEBPS", "../Text/a.xhtml") == "/root/Text/a.xhtml", "epub.join")
    check(epub.strip(" <b>hi</b>  there ") == "hi there", "epub.strip")

    local path = os.tmpname() .. ".html"
    local f = assert(io.open(path, "wb"))
    f:write('<p><a href="#x">x</a></p><a id="x"></a><p class="c">target</p>'
        .. '<span style="font-style: italic;">en</span>'
        .. "<span style='font-style: oblique;'>fr</span>"
        .. '<p style="font-style: italic;">block</p>')
    f:close()
    check(epub.fix_anchors(path), "epub.fix_anchors rewrites")
    local s = assert(io.open(path, "rb")):read("*a")
    check(s == '<p><a href="#x">x</a></p><a></a><p id="x" class="c">target</p>'
        .. '<span style="">en</span><span style=\'\'>fr</span><p style="">block</p>',
        "epub.fix_anchors moves id and strips italic")
    check(not epub.fix_anchors(path), "epub.fix_anchors idempotent")
    os.remove(path)
    os.remove(path .. ".normalize-v2")
end

-- store: 保存/读取（保留 chapter，百分比已移除）
do
    local store = require("ui.store")
    local path = os.tmpname()
    store.save_state(path, {
        ["/x.epub"] = {
            page = 4, chapter = 7, updated = 123,
            bookmarks = {
                { page = 2, chapter = 7, note = "n", created = 9 },
                { page = 5, note = "m", created = 10 },
            },
        },
    })
    local t = store.load(path)
    os.remove(path)
    local rec = t["/x.epub"]
    check(rec and rec.page == 4 and rec.chapter == 7, "store.record")
    check(rec and rec.bookmarks and rec.bookmarks[1].chapter == 7, "store.bookmark chapter")
    check(rec and rec.bookmarks and rec.bookmarks[2].chapter == nil, "store.bookmark nil chapter")
    check(not rec.percent and not rec.bookmarks[1].percent, "store.percent removed")
end

-- nav: 翻页与章末切换
do
    local navmod = require("ui.nav")
    local calls = {}
    local v = {
        spread_mode = function() return true end,
        load_page = function(n) calls[#calls + 1] = "page:" .. n end,
        save_progress = function() end,
        open_chapter = function(c, p) calls[#calls + 1] = "ch:" .. c .. ":" .. p end,
    }
    local R = { page = 2, total = 10, chapter_mode = false }
    local nav = navmod.new({ v = v, get_reader = function() return R end })
    nav:turn(1)
    check(calls[1] == "page:4", "nav.turn spread")
    calls = {}
    R = { page = 2, total = 4, chapter_mode = true, chapter_idx = 1,
          chapters = { {}, {} } }
    local nav2 = navmod.new({ v = v, get_reader = function() return R end })
    nav2:turn(1)
    check(calls[1] == "ch:2:0", "nav.turn next chapter")
end

-- reader: 路径归一化
do
    local ffi = require("ffi")
    local reader = require("ui.reader")
    local r = reader.new({ ffi = ffi })
    check(r:normalize("/tmp/a.epub") == "/tmp/a.epub", "reader.normalize abs")
    local path = os.tmpname()
    local f = assert(io.open(path, "w")); f:write("x"); f:close()
    check(r:normalize("file://" .. path) == path, "reader.normalize file://")
    os.remove(path)
end

-- input: 内容区点击优先级（链接 > 图片 > 翻页）
do
    local input = require("ui.input")

    local function make_ctx(links, images)
        local calls = { loaded = nil, image = false, turn = nil }
        local v = {
            rects = { { x = 0, y = 0, w = 100, h = 100, page = 0 } },
            links = { [0] = links or {} },
            images = { [0] = images or {} },
        }
        local ctx = {
            v = v,
            get_doc = function() return {} end,
            get_page = function() return 0 end,
            get_w = function() return 100 end,
            get_tex_h = function() return 100 end,
            rd = { link_at = function() return 7, nil, 0 end },
            show_image = function() calls.image = true end,
            turn = function(n) calls.turn = n end,
        }
        v.load_page = function(n) calls.loaded = n end
        v.save_progress = function() end
        return setmetatable({ ctx = ctx }, { __index = input }), calls
    end

    local inp, calls = make_ctx(
        { { x0 = 0.1, y0 = 0.1, x1 = 0.9, y1 = 0.9, page = 7 } },
        { { x0 = 0, y0 = 0, x1 = 1, y1 = 1 } })
    inp:content_click(50, 50)
    check(calls.loaded == 7 and not calls.image, "input.link wins over image")

    inp, calls = make_ctx(nil, { { x0 = 0, y0 = 0, x1 = 1, y1 = 1 } })
    inp:content_click(50, 50)
    check(calls.image and not calls.loaded, "input.image when no link")

    inp, calls = make_ctx(nil, nil)
    inp:content_click(10, 50)
    check(calls.turn == -1, "input.click left turns prev")
end

print(string.format("[unit] %d ok, %d fail", ok, fail))
os.exit(fail == 0 and 0 or 1)
