-- tools/auto_core.lua — 核心格式冒烟（不依赖 UI / socket）
--
--   luajit tools/auto_core.lua
--
-- 对 testdata/samples.lua 中每个样本：
--   打开 → 页数 > 0 → 渲染第 0 页 → 输出尺寸 > 0。

local dir = arg[0]:match("^(.*)/[^/]+$") or "."
package.path = dir .. "/../lua/?.lua;" .. dir .. "/../lua/?/init.lua;" .. package.path

local rd = require("ffi.reader")
local manifest = dofile(dir .. "/../testdata/samples.lua")

local ok, fail = 0, 0
for _, s in ipairs(manifest.samples) do
    local path = s.path or (manifest.root .. "/" .. s.file)
    if s.format == "txt" then
        local f = io.open(path, "rb")
        local size = 0
        if f then
            size = #f:read("*a")
            f:close()
        end
        local pass = size > 0
        print(string.format("%-5s %-58s bytes=%-6d %s",
            s.format, s.file, size, pass and "OK" or "FAIL"))
        if pass then ok = ok + 1 else fail = fail + 1 end
    else
        local doc, err = rd.open(path)
        if not doc then
            print(string.format("%-5s %-58s FAIL open err=%s", s.format, s.file, tostring(err)))
            fail = fail + 1
        else
            local pages = rd.page_count(doc)
            local pixels, w, h = rd.render_page(doc, 0, 0.5)
            local pass = pages > 0 and pixels ~= nil and w > 0 and h > 0
            if pixels then rd.free(pixels) end
            rd.close(doc)
            print(string.format("%-5s %-58s pages=%-5d %dx%d %s",
                s.format, s.file, pages, w or 0, h or 0, pass and "OK" or "FAIL"))
            if pass then ok = ok + 1 else fail = fail + 1 end
        end
    end
end

print(string.format("[core] %d ok, %d fail", ok, fail))
os.exit(fail == 0 and 0 or 1)
