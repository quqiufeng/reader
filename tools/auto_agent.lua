-- tools/auto_agent.lua — Agent API 全链路回归。
local dir = arg[0]:match("^(.*)/[^/]+$") or "."
package.path = dir .. "/../automation/?.lua;" .. dir .. "/../lua/?.lua;" .. package.path

local Agent = require("agent")
local manifest = dofile(dir .. "/../testdata/samples.lua")
local a, err = Agent.new()
if not a then
    io.stderr:write("[agent] connect failed: " .. tostring(err) .. "\n")
    os.exit(1)
end

local ok, fail = 0, 0
local function check(cond, name)
    if cond then
        ok = ok + 1
        print("OK   " .. name)
    else
        fail = fail + 1
        print("FAIL " .. name)
    end
end

local sample = manifest.samples[1]
local path = sample.path or (manifest.root .. "/" .. sample.file)
local r = a:openBook(path, 1)
check(r and r.ok, "open")
local st = a:state()
check(st and st.state and st.state.page >= 1, "state")
local tx = a:text()
check(tx and tx.text and #tx.text > 0, "text")

local toc = a:toc()
check(toc and toc.toc and #toc.toc > 0, "toc")
a:tocOpen()
a:tocSelect(1)
a:tocActivate(1)
check((a:state() or {}).state ~= nil, "toc.activate")

local before = (a:state() or {}).state
local bm = a:bookmarkAdd("agent-ci")
check(bm and bm.ok, "bookmark.add")
local bms = a:bookmarks()
check(bms and bms.bookmarks and #bms.bookmarks > 0, "bookmark.list")
a:bookmarkRemove(1)

local set = a:setSettings({ theme = "moon" })
check(set and set.ok, "settings.set")
set = a:setSettings({ theme = "indigo" })
check(set and set.ok, "settings.restore")

local target = math.min((before and before.pages or 10), (before and before.page or 1) + 3)
if before and target == before.page then target = math.max(1, target - 2) end
local g = a:goto(target)
check(g and g.ok, "goto")
local after = (a:state() or {}).state
check(after and before and after.page ~= before.page, "page.changed")

check((a:state() or {}).state.dual == true, "dual.default")
a:dual()
check((a:state() or {}).state.dual == false, "dual.off")
a:dual()
check((a:state() or {}).state.dual == true, "dual.on")
a:zoom(1.25)
check((a:state() or {}).state.zoom == 1.25, "zoom")
a:pan(80)
a:zoom(1)

local cap = a:capture("/tmp/opencode/agent_ci.png")
local f = io.open("/tmp/opencode/agent_ci.png", "rb")
check(cap and cap.ok and f ~= nil, "capture")
if f then f:close() end

local snap = a:snapshot("/tmp/opencode/agent_snapshot.png")
local sf = io.open("/tmp/opencode/agent_snapshot.png", "rb")
check(snap and snap.ok and sf ~= nil, "snapshot")
if sf then sf:close() end

local lib = a:library()
check(lib and lib.items and #lib.items > 0, "library.list")

a:closeBook()
a:close()
print(string.format("[agent] %d ok, %d fail", ok, fail))
os.exit(fail == 0 and 0 or 1)
