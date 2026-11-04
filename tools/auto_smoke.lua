-- tools/auto_smoke.lua — 格式冒烟测试
--
-- 前置：native-reader 已运行，并开启 automation socket。
--
--   ./build/native-reader &
--   luajit tools/auto_smoke.lua
--
-- 对 testdata/samples.lua 中每个样本：
--   打开 → 读 state → 页数 > 0 → 翻一页 → 状态变化 → 关闭
--
-- 结果写入 artifacts/<timestamp>/smoke/。

local dir = arg[0]:match("^(.*)/[^/]+$") or "."
package.path = dir .. "/../automation/?.lua;" .. dir .. "/../?.lua;" .. package.path

local R = require("reader")
local manifest = dofile(dir .. "/../testdata/samples.lua")

local ok_open, c, err = pcall(R.open)
if not ok_open or not c then
  io.stderr:write("[smoke] automation unavailable: " .. tostring(err or c) .. "\n")
  io.stderr:write("[smoke] start native-reader first, then re-run\n")
  os.exit(1)
end

local stamp = os.date("%Y%m%d-%H%M%S")
local outdir = dir .. "/../artifacts/" .. stamp .. "/smoke"
os.execute(("mkdir -p %q"):format(outdir))

local function page_count(state)
  state = state or ""
  return tonumber(state:match('"pages"%s*:%s*(%d+)')
    or state:match('"page_count"%s*:%s*(%d+)')
    or "0") or 0
end

local rows, ok, fail = {}, 0, 0
for i, s in ipairs(manifest.samples) do
  local path = s.path or (manifest.root .. "/" .. s.file)
  local r = c:openBook(path, 0)
  local st = c:state() or ""
  local pages = page_count(st)
  local pass = r ~= nil and pages > 0

  if pass and pages > 1 then
    c:next()
    local after = c:state() or ""
    pass = after ~= st
  end

  if pass then
    ok = ok + 1
    c:capture(string.format("%s/%02d_%s.png", outdir, i, s.format))
  else
    fail = fail + 1
  end

  local row = string.format("%-5s %-58s pages=%-5d %s",
    s.format, s.file, pages, pass and "OK" or "FAIL")
  print(row)
  rows[#rows + 1] = row
  c:closeBook()
end

c:close()

local f = io.open(outdir .. "/result.txt", "w")
if f then
  f:write(table.concat(rows, "\n"), "\n")
  f:write(string.format("ok=%d fail=%d\n", ok, fail))
  f:close()
end

print(string.format("[smoke] %d ok, %d fail -> %s", ok, fail, outdir))
os.exit(fail == 0 and 0 or 1)
