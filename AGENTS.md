# AGENTS.md — native_reader Agent 双规范（开发 + 使用）

> **本文件是 Agent 进入本目录后的第一份必读文件。**
> 打开目录后先读本文件，再读 `native_reader.md`。本文件是开发 / 测试 / 验证的权威规范；与其它文档冲突时以本文件为准。
>
> 目标：Agent **自己设计、自己构建、自己运行、自己操作、自己截图、自己读图、自己验证、自己迭代**，尽量不打断人。只有产品取舍 / 模糊需求才问人。

---

## 这份规范怎么用

本文件是 **Agent 双规范**，对内开发、对外使用都走自动化：

- **Part I — 全自动开发测试规范（§0–§9）**
  给要改代码的 Agent：构建、运行、截图读图、回归、失败处理、代码与产物规范。
- **Part II — 对外自动化操作规范（§10）**
  给只使用阅读器的外部 Agent：`reader-agent` / `reader-lua` / `agent.lua` 的入口、命令表、示例和截图规范。
- **附录（§11–§12）**：常用命令与参考。

> 改代码的 Agent：先按 Part I 跑通 `./tools/test.sh`。
> 只读内容的 Agent：直接跳到 §10，用 `reader-agent` 或 `reader-lua -e`。

---

## 0. 启动检查（每次打开目录先做）

1. 读本文件 + `native_reader.md`。
2. `git status` 确认工作区；不要覆盖用户未提交的改动。
3. 检查工具链：`cmake`、`luajit`、`pkg-config`、`SDL2`、`mupdf`、`libmobi`、`libchmlib`、`libzip`、`freetype`、`harfbuzz`、`sqlite3`。
4. 构建：
   ```bash
   ./tools/build.sh
   ```
5. 跑全量回归：
   ```bash
   ./tools/test.sh
   ```
6. 以上都通过，才开始改代码。

> 当前仓库已实现可运行的 native reader；外部 Agent 直接读第 10 节，用 `reader-agent` / `reader-lua` 操作和读取内容。

---

## 1. 铁律（MUST / MUST NOT）

### MUST

- 每次改动后**重新构建**并跑相关测试；不跑不算完成。
- UI / 交互 / 视觉改动必须**截图 + Read 读图**验收。
- 操作走 `automation/reader.lua`（Unix socket `click` / `call`），不靠像素猜坐标。
- 书内容截图用 `app.snapshot`（只含页面内容）；UI 验收用 `app.capture`（整窗）。X11 截图只作兜底。
- 失败时保存 `state_before.json`、`state_after.json`、`screenshot.png`、`app.log` 到 `artifacts/`。
- C ABI 变更同步更新 LuaJIT `ffi.cdef` 与 `native_reader.md`。
- 提交信息用约定式：`feat/fix/style/docs/chore(scope): ...`。
- **只有用户明确要求时才 `git commit` / `git push`。**

### MUST NOT

- 不使用 **Chrome / WebView / CEF / Electron**。
- 不启动 `xdotool` / `wmctrl` / `import` 等外部进程；窗口控制用 `automation/x11.lua` + `automation/xdo.lua`（LuaJIT FFI）。
- 不用 `systemd --user` 启动 UI。
- 不用 `pkill -f`（会误杀自身）；用 `pkill -x` 或 `'name[r]'` 括号技巧。
- 不在没有截图 / 测试证据时宣称“完成”。

---

## 2. 全自动闭环

```text
设计 → 构建 → 会话内运行 → LuaJIT FFI 驱动 → 截图 → Read 读图
  ▲                                                        │
  └──────────────── 定位差异 ← 改代码 ←────────────────────┘
```

- **操作零推理**：能 `click(id)` / `call(fn,args)` 就不猜像素。
- **视觉只在验收期**：截图 + 读图，不做每一步的“看屏—猜动作”。
- 每次循环把证据落到 `artifacts/<timestamp>/<case>/`。

---

## 3. 构建、运行与测试

```bash
# 构建（会自动检查/构建 shared MuPDF）
./tools/build.sh
# 若 shared MuPDF 不存在：SUDO=1 ./tools/build_mupdf_shared.sh

# 运行（推荐）
./tools/run.sh                  # 书库
./tools/run.sh /path/book.epub  # 直接打开

# 本机全量回归（Xvfb + 独立数据目录）
./tools/test.sh
# 包含：core / Agent API / 格式 smoke
```

- MuPDF 默认使用 `/opt/mupdf/build/shared-release/libmupdf.so`；可用 `MUPDF_ROOT` / `MUPDF_LIB` 覆盖。
- LuaJIT 已静态编入 `native-reader`，cjson 已随包内置，不需要系统 luajit。
- 安装：`./tools/package.sh && ./tools/install.sh`；安装目录 `~/.local/share/native-reader`，命令 `~/.local/bin/native-reader`。
- 安装会保留 `settings.lua` / `state.lua` / `window.lua`。
- 自动化验收优先用 `app.snapshot`（书内容）或 `app.capture`（整窗）。

## 4. 截图与视觉验收

- **书内容验收**：`app.snapshot` → 只截页面内容，双栏合成一张，保存到 `$HOME`。
- **UI 验收**：`app.capture` → 截整个窗口（含工具栏/页脚），用于调试布局。
- **兜底**：`automation/x11.lua` 的 `w:capture(path)`（FFI `ak_capture`）。
- 截图后用 **Read 读图**，检查：布局、字体、图片、主题、分页、目录、搜索结果。
- 关键画面存 golden：`testdata/golden/<backend>/<case>.png`；视觉变更需人工确认后再更新 golden。
- 失败时同时保存 `expected.png` 与 `actual.png`。

---

## 5. 测试分层

1. **本机全量**：`./tools/test.sh`（core + Agent API + 格式 smoke）。
2. **格式冒烟**：`pdf / epub / mobi / azw3 / txt / chm / cbz` 各一个最小样本：
   打开 → 页数 > 0 → 渲染第 0 页 → 渲染输出非空 → 目录 / 元数据。
   - 本机样本：`/home/quqiufeng/Downloads/book`，清单 `testdata/samples.lua`；
     `READER_BOOK_DIR` 可覆盖；不把电子书复制进仓库。
   - 当前样本：2×PDF、1×EPUB、2×MOBI、1×AZW3（均无 DRM）。
3. **交互**：next / prev、goto、TOC、搜索、书签、主题 / 字体、缩放、双页、RTL。
4. **视觉**：关键页截图 + golden 对比 / 读图。
5. **回归矩阵**：格式 × 功能 × 主题。
6. **健壮性**：损坏文件、超大文件、缺字体、DRM、路径穿越、ZIP 炸弹（限制解压大小 / 比例）。

### Definition of Done

1. 构建通过、无 warning；
2. 格式冒烟全过；
3. 关键视觉截图已 Read 验收；
4. `state` 断言通过；
5. 失败产物已归档；
6. 文档 / `ffi.cdef` 已同步；
7. （用户要求提交时）提交信息符合约定。

---

## 6. 失败处理

- 失败先复现、再定位；保存：
  ```text
  artifacts/<timestamp>/<case>/
  ├── state_before.json
  ├── state_after.json
  ├── screenshot.png
  ├── expected.png        # 视觉失败时
  ├── actual.png
  ├── app.log
  └── result.json
  ```
- 能自己修就自己修；修完重跑全链路。
- 只有**产品取舍 / 需求不明确 / 需要外部资源**时才问人；问时带上证据和已尝试的方案。

---

## 7. 代码规范

- C：`cmake --build` 无 warning；C ABI 稳定；资源生命周期放 C shim。
- Lua：模块化；自动化脚本不启动外部进程；统一走 `automation/reader.lua`。
- 复用而非重写：解析 / 渲染调 C 库（MuPDF / libmobi / libchmlib / libzip / litehtml）。
- GUI：SDL2 + SDL2_ttf 直接绘制，页面为 RGBA 纹理；事件驱动重绘，空闲不重绘。
- 不引入 Chrome / WebView / CEF / Electron。
- 字体：默认仓耳今楷02（`assets/fonts/TsangerJinKai02-W04.ttf` / `W05`）；`READER_FONT` / `READER_FONT_BOLD` 可覆盖。
- 提交信息：`feat/fix/style/docs/chore(scope): ...`。

---

## 8. 目录与产物

```text
native-reader/
├── AGENTS.md               # 本文件（权威规范）
├── native_reader.md        # 设计与迁移文档
├── CMakeLists.txt
├── src/                    # C 核心 + shim + worker
├── lua/                    # ui / core / render / ffi
├── assets/fonts/           # 仓耳今楷02（UI/TXT 字体）
├── automation/             # reader.lua / x11.lua / xdo.lua / native_demo.lua
├── tools/                  # auto_smoke.lua / auto_visual.lua / run_headless.sh
├── testdata/               # 格式样本 + golden
├── artifacts/              # 测试证据
└── build/                  # 构建产物
```

---

## 9. 当前里程碑（Agent 从这里开始）

1. **P0 骨架**：`CMakeLists.txt`、`src/main.c`（SDL2 窗口 + LuaJIT）、`src/shim/reader_api.c`、`lua/ui/app.lua`。
2. **P0 PDF**：MuPDF 打开 / 渲染 / 翻页 / 目录 / 进度。
3. **P0 TXT**：编码探测、分页、字体设置。
4. **P1 EPUB**：MuPDF 先行；复杂排版接 litehtml。
5. **P1 MOBI/AZW3**：libmobi → EPUB。
6. **P1 自动化**：socket + `automation/reader.lua` + `tools/auto_smoke.lua`。
7. **P2 CHM / 漫画**。
8. **P2 搜索 / 书签 / 高亮 / 主题 / 双页**。
9. **P3 打包**：AppImage / Flatpak。

---

## 10. 对外自动化操作规范（Part II）

### 10.1 入口与前提

```text
高层 Agent API：automation/agent.lua      require("agent")
底层客户端：    automation/reader.lua     require("reader")
命令行：        tools/agent_reader.lua    -> 安装后的 reader-agent
动态 -e：       reader-lua -e '...'       （自带 LuaJIT）
```

- 默认 socket：`/tmp/native-reader-automation.sock`。
- `open` 支持本地路径，也支持 `file://` / `dav://` / `davs://` / `smb://` / `sftp://`；后四者会自动转成 GVFS 挂载路径。
- `reader-agent open <path> [page]` 会在阅读器未运行时**自动拉起**，再打开指定书；`reader-agent launch` 启动书库。
- 可用 `READER_AUTOMATION_SOCK=/path.sock` 指定其他实例。
- 仓库内直接用 `./tools/reader-agent`、`./tools/reader-lua`；安装后是 `~/.local/bin/reader-agent`、`~/.local/bin/reader-lua`。
- 截图默认保存到 `$HOME`，文件名：`书名_左页_右页.png`（单页为 `书名_页.png`，同名自动 `-1`、`-2`）。

### 10.2 最快用法

```bash
# 已运行阅读器后
reader-agent open /path/book.epub 1   # 没运行会自动启动
reader-agent launch                   # 只启动书库
reader-agent state
reader-agent text
reader-agent read 5
reader-agent toc.open
reader-agent toc.select 3
reader-agent toc.activate 3
reader-agent search.open 罗马
reader-agent open 'dav://192.168.1.53:5005/share/book.mobi' 25
reader-agent history.clear
reader-agent snapshot          # 只截书的内容页
reader-agent zoom 1.25
reader-agent pan 80
reader-agent dual              # 双栏/单栏切换
reader-agent quit
```

```lua
-- reader-lua -e '...'
local A = require("agent")
local a = assert(A.new())
print(a:state().state.page)
print(a:text().text)
a:next()
local path = a:snapshot()      -- 返回内容页截图路径
print(path.path)
a:close()
```

### 10.3 操作表（真实支持）

点击动作（`click(id)` / `reader-agent click <id>`）：
`reader.next` `reader.prev` `app.toc` `app.bookmarks` `app.settings`
`app.search` `app.library` `app.fullscreen` `app.maximize` `app.dual`
`app.eye` `app.quit`

调用函数（`call(fn,args)`）：
| 函数 | 参数 / 说明 |
|---|---|
| `reader.open` | `{path, page}`，page 从 1 开始 |
| `reader.close` | 关闭当前书 |
| `reader.state` / `app.state` | 当前书、页码、总页数、进度、主题、双栏、缩放 |
| `reader.next` / `reader.prev` | 翻页（双栏按 2 页步进） |
| `reader.goto` | `{page}`（1 开始） |
| `reader.text` | `{page}` 可省略，返回整页纯文本 |
| `reader.scroll` | `{dy}` 或 `{delta}` 滚动 |
| `reader.zoom` | `{zoom}` 或 `{z}`，0.5–3.0 |
| `reader.pan` | `{dx}` 水平平移 |
| `reader.toc` | 返回目录列表（不打开面板） |
| `reader.search` | `{q}` 返回搜索结果（不打开面板） |
| `reader.bookmark.add/list/remove` | `{note}` / 无 / `{index}` |
| `settings.get` / `settings.set` | 主题、font_size、line_factor、margin |
| `library.scan/select/activate/close` | 书库 |
| `history.remove` | `{index}` 或 `{path}`，清除阅读历史（保留书签） |
| `history.clear` | 清空全部阅读历史（保留书签） |
| `toc.open/select/activate/close` | 目录面板 |
| `search.open/select/activate/close` | 搜索面板 |
| `bookmark.open/select/activate/close` | 书签面板 |
| `settings.open/adjust/close` | 设置面板 |
| `app.capture` | `{path}` 截整个窗口（调试用） |
| `app.snapshot` | `{path}` 只截书的内容页；不传 path 自动命名 |
| `app.maximize/fullscreen/dual/eye` | 视图切换 |
| `app.quit` | 退出 |

### 10.4 Agent 高层方法

```lua
local A = require("agent")
local a = assert(A.new())

a:openBook(path, page)   a:closeBook()      a:state()
a:next()                 a:prev()           a:goto(page)
a:text(page)             a:scroll(dy)      a:zoom(z)       a:pan(dx)
a:toc()                  a:tocOpen()        a:tocSelect(i)  a:tocActivate(i)
a:search(q)              a:searchOpen(q)    a:searchSelect(i) a:searchActivate(i)
a:bookmarks()            a:bookmarkAdd(note) a:bookmarkRemove(index)
a:settings()             a:setSettings(t)   a:settingsOpen(row) a:settingsAdjust(row, delta)
a:library()              a:libraryOpen()    a:librarySelect(i)  a:libraryActivate(i)
a:removeHistory(i, path) a:clearHistory()
a:dual()                 a:maximize()       a:fullscreen()      a:eye()
a:capture(path)          a:snapshot(path)   a:quit()
a:read(count, opts)      a:turn(n, delay)   a:close()
```

- `read(count)` 会按当前布局读取连续页；双栏时同时返回右页。
- `snapshot` 只包含书的页面内容，不含工具栏、页脚、背景。
- `app.capture` 仍保留，用于 UI 验收/调试；内容页给 Agent 用 `snapshot`。

### 10.5 原始协议

Unix socket，JSON Lines：

```json
{"cmd":"state"}
{"cmd":"list"}
{"cmd":"click","id":"reader.next"}
{"cmd":"call","fn":"reader.open","args":{"path":"/books/a.epub","page":1}}
{"cmd":"call","fn":"reader.zoom","args":{"zoom":1.25}}
{"cmd":"call","fn":"app.snapshot","args":{}}
```

### 10.6 窗口兜底

`automation/x11.lua` / `automation/xdo.lua` 仅用于窗口定位、激活、X11 截图兜底；
正常操作优先走 `reader-agent` / `agent.lua`，不要像素猜坐标。

### 10.7 底层原理：LuaJIT FFI + X11 / libxdo / 截图

外部自动化有两层，优先级从高到低：

1. **应用内语义 API（首选）**：`lua/core/automation.lua` 在 App 进程内监听 Unix socket；`src/ctl/*_ctl.c` 提供 `ctl_open/call/state` 等 C ABI；Lua 通过 `ffi.load("lib*_ctl.so")` 连接。操作是 `click(id)` / `call(fn,args)`，不碰像素。
2. **X11 兜底（无应用 API 时）**：LuaJIT 直接 FFI 调 `libX11` / `libXtst` / `libxdo` 做窗口查找、激活、鼠标/键盘注入。

#### FFI 原理

LuaJIT FFI 不需要写 C 扩展：用 `ffi.cdef` 声明 C 结构/函数，用 `ffi.load` 加载 `.so`，之后像调用 Lua 函数一样调用 C。

```lua
local ffi = require("ffi")
ffi.cdef[[
typedef unsigned long Window;
typedef struct xdo xdo_t;
xdo_t *xdo_new(const char *display);
int xdo_move_mouse(const xdo_t *xdo, int x, int y, int screen);
int xdo_click_window(const xdo_t *xdo, Window window, int button);
int xdo_send_keysequence_window(const xdo_t *xdo, Window window,
    const char *keysequence, unsigned int delay);
]]
local xdo = ffi.load("xdo")          -- libxdo.so
local h = xdo.xdo_new(nil)            -- nil = 使用当前 DISPLAY
xdo.xdo_move_mouse(h, 300, 200, 0)    -- 绝对坐标
xdo.xdo_click_window(h, win, 1)       -- 窗口内点击
xdo.xdo_send_keysequence_window(h, win, "ctrl+l", 0)
```

#### 用到的底层库

| 库 | 作用 |
|---|---|
| `libX11.so.6` | `XOpenDisplay`、`_NET_CLIENT_LIST`、`_NET_WM_NAME`、`XGetClassHint`、`XGetGeometry`、`XTranslateCoordinates`、`XSync/XFlush` |
| `libXtst.so.6` | `XTestFakeButtonEvent` / `XTestFakeKeyEvent` / `XTestFakeMotionEvent`，底层输入注入 |
| `libxdo.so`（libxdo3） | 对 X11/XTest 的高层封装：窗口查找、激活、移动、点击、按键、输入文本 |
| `libagentkit.so` | `ak_capture(x,y,w,h,out.png)`，X11 root/窗口截图兜底；路径 `/opt/my-agent/agentkit/lib/libagentkit.so` |
| SDL2 + `stb_image_write` | 应用自截图：`SDL_RenderReadPixels` → `stbi_write_png`，确定性最好 |

#### 窗口定位与坐标

- 窗口列表：`_NET_CLIENT_LIST`；标题：`_NET_WM_NAME` / `XFetchName`；形态：`XClassHint` 的 `res_name/res_class`。
- 使用 **WM_CLASS** 优先于标题，避免误认终端/浏览器。
- 客户区坐标：`XGetGeometry` + `XTranslateCoordinates` 到 root；WM 装饰、reparent、最大化会改变几何，点击前必须 `refresh()`。
- 点击流程：`activate()` → `raise()` → `refresh()` → 窗口内相对坐标点击。
- 合成鼠标移动可能不触发 hover/tooltip；需要 hover 时用真实 motion 序列或改用应用 API。

#### 自动 UI 检测

- **语义检测优先**：`state()` 返回书名/页码/进度/面板状态；`actions()` 列出可点击动作。用它判断操作是否成功，不靠猜。
- **视觉检测兜底**：`app.snapshot`（只含书页内容）或 `app.capture`（整窗）→ PNG → Agent Read 读图。
- X11 截图仅在应用自截图不可用时使用 `Win:capture()` / `capture_screen()`。
- 失败证据存 `artifacts/<timestamp>/`：`state_before.json`、`state_after.json`、`screenshot.png`、`app.log`。

#### 新应用复用清单

要把一个 App 接入这套自动化，复制/实现这些关键件：

```text
automation/xdo.lua        # FFI：X11 + Xtst + libxdo，窗口/鼠标/键盘
automation/x11.lua        # 窗口对象：activate/center/move/click/key/type/capture
lua/core/automation.lua   # 应用内 Unix socket JSON 服务（模板）
src/ctl/*_ctl.c           # C ABI：ctl_open/call/state/click（模板）
automation/reader.lua     # Lua FFI 客户端（改名复用）
automation/agent.lua      # 高层语义 API（改名复用）
tools/agent_reader.lua    # JSON CLI（改名复用）
```

可选依赖：`libagentkit.so`（截图兜底）。只要保持 `state / actions / click / call` 与 JSON 返回结构一致，上层 Agent 就能像管道一样组合不同小应用。

## 11. 常用命令速查

```bash
./tools/build.sh
./tools/run.sh
./tools/test.sh
./tools/package.sh
./tools/install.sh

./tools/reader-agent open /path/book.epub 1   # 自动拉起 + 打开
./tools/reader-agent launch
./tools/reader-agent state
./tools/reader-agent text
./tools/reader-agent read 5
./tools/reader-agent snapshot
./tools/reader-agent zoom 1.25
./tools/reader-agent pan 80
./tools/reader-agent quit

./tools/reader-lua -e 'local A=require("agent"); local a=assert(A.new());
  print(a:state().state.page); print(a:text().text); a:close()'
```

## 12. 参考

- `native_reader.md`（尤其附录 A：全自动开发/测试规范）
- `/opt/WordCard/AGENTS.md`
- `/opt/WordCard/automation.md`
- `automation/xdo.lua`、`automation/x11.lua`（复用 WordCard，已适配 native_reader）
