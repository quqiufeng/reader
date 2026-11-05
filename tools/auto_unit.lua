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

print(string.format("[unit] %d ok, %d fail", ok, fail))
os.exit(fail == 0 and 0 or 1)
