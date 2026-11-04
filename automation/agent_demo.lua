-- agent_demo.lua — 演示 AI agent 通过 LuaJIT 驱动 native_reader
--
--   luajit automation/agent_demo.lua
--
-- 逻辑：列出动作 → 读状态 → 打开样本 → 翻几页 → 截图。

local dir = arg[0]:match("^(.*)/[^/]+$") or "."
package.path = dir .. "/?.lua;" .. package.path

local R = require("reader")
local c = assert(R.open())

print("== 可用动作 ==")
for _, id in ipairs(c:actions()) do print("  " .. id) end

print("\n== 状态 ==")
print("  " .. tostring(c:state()))

local sample = os.getenv("READER_SAMPLE") or "testdata/epub/min.epub"
print("\n== 打开样本: " .. sample)
print("  " .. tostring(c:openBook(sample)))
print("  " .. tostring(c:state()))

print("\n== 翻 3 页 ==")
for i = 1, 3 do
  c:next()
  print(string.format("  #%d  %s", i, tostring(c:state())))
end

c:capture("/tmp/opencode/native_reader.png")
c:close()
print("\n完成。")
