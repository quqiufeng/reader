# native_reader Lua 架构与开发实践

> 基线：本仓库当前代码（`lua/`，约 5.4k 行，30 个 UI 模块）。
> 本文分两部分：
> - **现状**：现在真实运行的架构，按代码描述。
> - **理想参考**：`context.lua` 模块的推荐设计，供新项目从 0 搭建时参考；当前仓库尚未实现。

---

## 1. 运行形态与硬约束（本项目）

- 单进程桌面应用：C 核心（MuPDF / SDL2 / LuaJIT）+ Lua UI。
- 入口：`build/native-reader` → `lua/ui/app.lua`。
- 部署：桌面与 `~/.local/bin/native-reader` 指向仓库 `tools/launch.sh` → `tools/run.sh` → `build/native-reader` + 仓库 `lua/`、`assets/`；`tools/package.sh` 只生成 `dist/`。
- 自动化：Unix socket + JSON Lines（`core/automation.lua`）；`ui/remote.lua` 暴露 `state/click/call`。
- 格式：PDF/TXT 用全局页；EPUB/MOBI/AZW3 用章节模式，解包到 `/dev/shm/native-reader-cache/book_<hash>/`。
- 字体：默认仓耳今楷02；reflow 由 C 侧用户 CSS 固定字号/行距。
- 约束：
  - LuaJIT 单函数局部变量 < 200；
  - 不使用 `xdotool/wmctrl/import` 等外部 UI 进程；
  - 不使用 Chrome/WebView/CEF/Electron；
  - 纹理与文档句柄由 C/FFI 管理，不能序列化。

---

## 2. 现状：目录与分层

```
lua/
├── ffi/                 C ABI 薄封装
│   ├── reader.lua       MuPDF：open/layout/render/toc/links/images
│   ├── sdl2.lua         SDL：window/renderer/events/capture
│   └── sdl2_ttf.lua     字体纹理
├── core/
│   ├── automation.lua   socket 服务端
│   └── library.lua      目录扫描
└── ui/
    ├── app.lua          722 行，组合根/初始化/接线/清理
    ├── loop.lua         109 行，主循环/启动同步/resize/预取/重绘
    ├── reader.lua       243 行，书籍会话（doc/page/chapter/进度入口）
    ├── render.lua       303 行，页纹理/pcache/load_page/图片区域渲染
    ├── nav.lua          125 行，翻页/滚动/缩放/平移/返回
    ├── window.lua       145 行，全屏/最大化/尺寸适配
    ├── settings_apply.lua 56 行，字体/主题/布局刷新
    ├── input.lua        413 行，键鼠/拖拽/光标/预览交互
    ├── remote.lua       356 行，自动化 API
    ├── content.lua      118 行，内容页绘制
    ├── chrome.lua        74 行，书名 + 页码
    ├── header.lua        92 行，右上动作栏
    ├── panel.lua         87 行，面板公共框/列表/提示
    ├── list.lua          37 行，列表可见窗口 + 行纹理
    ├── toc/bookmarks/settings/bookshelf/browser  面板
    ├── file_dialog.lua   69 行，打开新书
    ├── screenshot.lua    92 行，截图
    └── layout/page_cache/view/store/themes/text/txt/epub/renderer/toast
```

依赖方向（实际）：

```
app.lua ──require──▶ ui/*
ui/*    ──require──▶ list / themes / store / ffi / 纯工具
core/*  ──require──▶ ffi / bit
```

模块不反向 `require("ui.app")`；跨模块能力通过构造时传入的 `ctx`（getter/回调表）获得。

---

## 3. 现状：状态归属

| 状态 | 所在 | 说明 |
|---|---|---|
| 文档/页/章节 | `ui/reader.lua` 实例 `R` | `book/doc/total/page/pages/is_txt/chapters/chapter_idx/chapter_mode` |
| 视图/运行时 | `app.lua` 的 `v` | `fs/max/dual/zoom/pan_x/sy/ui_scale/pcache/layout/tex/p2/line_texs/dirty/prefetch/links/rects/preview/...` |
| 设置 | `app.lua` 的 `settings` + `themes` | `theme/font_size/line_factor/margin` |
| 进度/书签 | `ui/store.lua` + `progress` | 按书路径的 `page/chapter/bookmarks/updated` |
| 面板 | 各自模块 | `open/items/selected/first/texs` |
| 纹理/缓存 | `render.lua` + `v` | `v.tex/v.p2/v.line_texs/v.pcache` |
| 字体 | `app/settings_apply` | `f_title/f_page/f_body` |

这是当前最大的历史耦合：`v` 是共享大对象，模块通过 `ctx` 闭包读写它。

---

## 4. 现状：关键流程

### 启动

```
app.lua 建窗口/渲染器/字体/主题 → 建 R/render/nav/window/input/remote/面板
 → automation.start() → startup_sync → 打开书或书库 → loop:run()
```

### 主循环（loop.lua）

```
poll socket → poll SDL events → input:handle
 → toast/filedialog/进度防抖
 → startup_sync → resize 适配 → 空闲预取 → dirty 时 draw
```

### 打开书

```
input/remote/library → v.open_book → R:open_book
 → rd.open（styled CSS）/章节解析/解包
 → render:load_page → layout/pcache/纹理
 → chrome:refresh / v.refresh_text
```

### 渲染

```
render_frame: renderer.kind 选面板/content
  content.lua: 页纹理 + chrome + header + 进度条 + 图片预览浮层
  面板: list.rebuild + panel.frame/items/hint
```

### 输入

```
SDL event → input:handle
  key/mouse/wheel → nav / 面板 / 预览
  图片点击 → render:preview（区域渲染 + 滚轮缩放 + 拖拽平移）
  右键返回不改变窗口尺寸
```

### 自动化

```
core/automation socket → remote:state/click/call
  → reader/面板/settings/render
  → v.dirty
```

---

## 5. 本项目已采用的最佳实践

1. **组合根**：`app.lua` 只创建模块、接线、启动；业务在各自模块。
2. **模块骨架**：`M.new(ctx)` 只保存 ctx；方法 `M:method()`；不反向 require app。
3. **面板模式**：
   - `show()` 先 `close_others()`，再 `destroy()` 旧纹理；
   - `list.rebuild()` 统一可见窗口与行纹理；
   - `panel.frame/items/hint` 统一绘制；
   - `move/activate/key` 各自实现，互不 require。
4. **渲染分层**：`render.lua` 拥有页纹理/pcache/预取；`content.lua` 只画；`chrome/header` 只画外框。
5. **资源 ownership**：
   - 谁创建谁销毁；`teardown` 幂等；
   - `page_cache:put` 覆盖同 key 先销毁旧纹理；
   - 预览关闭/换书必须释放纹理。
6. **性能**：
   - 仅脏帧重绘；鼠标移动不触发整帧；
   - 页缓存 + 空闲预取；
   - 进度写盘 1s 防抖，关闭强制 flush；
   - 一次 `load_page` 复用 `content_sig`（避免重复计算）。
7. **FFI 边界**：
   - `ffi/*` 只做声明与薄封装；
   - C ABI 变更同步 `ffi.cdef` 与文档；
   - 指针/内存成对释放（`rd.free`）。
8. **LuaJIT 约束**：按模块拆分，避免单函数 200 locals。
9. **测试**：
   - `auto_unit.lua`：list/text/epub/store/nav/reader；
   - `auto_core.lua`：格式 open/render；
   - `auto_agent.lua`：自动化；
   - `auto_smoke.lua`：全格式冒烟；
   - 视觉：`app.snapshot` + Read 读图。
10. **自动化边界**：socket 层只做协议，业务在 `remote.lua`；失败不影响主循环。

---

## 6. 理想参考：`context.lua`（供新项目）

> 本节是**推荐设计**，当前仓库未实现。新项目从 0 开始时建议直接采用。

### 6.1 目标

- 一个 `context` 对象贯穿全应用，模块只依赖它。
- 状态按 slice 组织，单一数据源；纹理/文档句柄仍在各自 owner。
- 变化通过事件/`touch()` 通知，主循环只认 `ctx.ui.dirty`。

### 6.2 状态切片

| 切片 | 内容 |
|---|---|
| `ctx.session` | `book/doc/format/is_txt/total/page/pages/chapters/chapter_idx/chapter_mode/reflow` |
| `ctx.view` | `zoom/pan_x/sy/dual/fs/max/theme` |
| `ctx.page` | `layout/pcache/pending_layout/content_sig/prefetch` + 纹理引用（由 render 管理） |
| `ctx.window` | `scale_x/scale_y/ui_scale/win_w/win_h/window_target` |
| `ctx.ui` | `dirty/panels/preview/links/rects/cursor/toast/dialog` |
| `ctx.settings` | `theme/font_size/line_factor/margin` |
| `ctx.progress` | 按书路径的 `page/chapter/bookmarks/updated` |

### 6.3 参考实现

```lua
-- lua/ui/context.lua（理想参考）
local M = {}
M.__index = M

function M.new()
    local self = setmetatable({
        session = {},
        view = { dual = true, zoom = 1, pan_x = 0, sy = 0, theme = "light" },
        page = { pending_layout = false, content_sig = nil, prefetch = nil },
        window = { scale_x = 1, scale_y = 1, ui_scale = 1, fs = false, max = false },
        ui = { dirty = true, panels = {}, links = {}, rects = {}, preview = nil },
        settings = { theme = "light", font_size = 22, line_factor = 1.6, margin = 72 },
        progress = {},
        listeners = {},
    }, M)
    return self
end

function M:on(evt, fn)
    local list = self.listeners[evt] or {}
    list[#list + 1] = fn
    self.listeners[evt] = list
end

function M:emit(evt, ...)
    for _, fn in ipairs(self.listeners[evt] or {}) do fn(...) end
    if evt ~= "dirty" then self:touch() end
end

function M:touch()
    self.ui.dirty = true
    self:emit("dirty")
end

return M
```

模块骨架：

```lua
-- lua/ui/render.lua（理想参考）
local M = {}
M.__index = M

function M.new(ctx)
    return setmetatable({ ctx = ctx }, M)
end

function M:load_page(n, keep)
    local S, P, V = self.ctx.session, self.ctx.page, self.ctx.view
    -- 只读写 ctx 切片；纹理由 render 自己持有
    self.ctx:emit("page_changed", n)
end

return M
```

启动：

```lua
-- app.lua（理想参考）
local ctx = require("ui.context").new()

local reader = require("ui.reader").new(ctx)
local render = require("ui.render").new(ctx)
local nav    = require("ui.nav").new(ctx)
local input  = require("ui.input").new(ctx)
local remote = require("ui.remote").new(ctx)

require("ui.loop").new(ctx):run()
```

### 6.4 规则

- 切片是**同一份内存**的组织，不能出现 `ctx.view.zoom` 与 `v.zoom` 两份。
- 纹理/文档/字体句柄不进 context 的持久化部分；由 owner 模块管理。
- 面板开关、翻页、缩放等状态变化统一 `ctx:touch()`。
- 跨模块响应（设置变化、页变化）用事件，不直接调用别的模块。
- 迁移期间允许 `ctx` 作为 `v` 的门面（`__index/__newindex` 指向同一表），但不要复制字段。

---

## 7. 新项目落地模板

```
app.lua          创建 context → 建模块 → loop.run
context.lua      状态切片 + 事件 + dirty
loop.lua         poll/events/resize/prefetch/draw
reader.lua       文档会话
render.lua       纹理/缓存/分页渲染
nav.lua          导航
window.lua       窗口/全屏/尺寸
input.lua        事件
remote.lua       自动化
content/chrome/header/panel/list/...
```

启动顺序建议：

1. `context.new()`
2. 窗口/渲染器/字体/设置/progress
3. `reader/render/nav/window/input/remote`
4. `automation.start()`
5. `ctx:emit("startup")` → 打开书或书库
6. `loop.run(ctx)`

---

## 8. 开发与测试命令（本项目）

```bash
./tools/build.sh        # 编译（桌面启动直接用仓库 build）
./tools/run.sh          # 开发运行
./tools/test.sh         # unit + core + agent + smoke
./tools/package.sh      # 只生成 dist/
./tools/install.sh      # 可选安装到 ~/.local/share/native-reader
```

自动化：

```bash
./tools/reader-agent open /path/book.epub 1
./tools/reader-agent text
./tools/reader-agent snapshot
./tools/reader-agent zoom 1.25
```

测试分层：

| 层 | 文件 |
|---|---|
| 单元 | `tools/auto_unit.lua`（list/text/epub/store/nav/reader） |
| 核心 | `tools/auto_core.lua` |
| Agent | `tools/auto_agent.lua` |
| 冒烟 | `tools/auto_smoke.lua` |
| 视觉 | `app.snapshot` / `app.capture` + Read 读图 |

---

## 9. 评审清单

- [ ] 模块不反向 `require("ui.app")`
- [ ] 状态只有一处 owner；切片不复制
- [ ] 纹理/文档/预览有明确 release 路径
- [ ] 面板重复 `show()` 先销毁旧纹理
- [ ] 只有真实变化才 `v.dirty/ctx:touch()`
- [ ] 热路径没有每帧闭包/大表
- [ ] FFI 指针释放成对
- [ ] C ABI 变更同步 `ffi.cdef` 与文档
- [ ] 新模块有单测；UI 改动有截图
- [ ] `./tools/test.sh` 全绿
