# AGENTS.md — native_reader 自动化开发规范（Agent 必读）

> **本文件是 Agent 进入本目录后的第一份必读文件。**
> 打开目录后先读本文件，再读 `native_reader.md`。本文件是开发 / 测试 / 验证的权威规范；与其它文档冲突时以本文件为准。
>
> 目标：Agent **自己设计、自己构建、自己运行、自己操作、自己截图、自己读图、自己验证、自己迭代**，尽量不打断人。只有产品取舍 / 模糊需求才问人。

---

## 0. 启动检查（每次打开目录先做）

1. 读本文件 + `native_reader.md`。
2. `git status` 确认工作区；不要覆盖用户未提交的改动。
3. 检查工具链：`cmake`、`luajit`、`pkg-config`、`SDL2`、`mupdf`、`libmobi`、`libchmlib`、`libzip`、`freetype`、`harfbuzz`、`sqlite3`。
4. 构建：
   ```bash
   cmake -S . -B build -DCMAKE_BUILD_TYPE=Release
   cmake --build build -j
   ```
5. 跑冒烟（若已存在）：
   ```bash
   luajit tools/auto_smoke.lua
   ```
6. 以上都通过，才开始改代码。

> 当前仓库处于**设计与自动化规范阶段**：`native_reader.md` + `automation/`。代码落地时按 `native_reader.md` 第 4/5/12 节建目录与 CMake；第一目标是 **SDL2 窗口 + LuaJIT + `libreader_native.so` + PDF/TXT 最小闭环**。

---

## 1. 铁律（MUST / MUST NOT）

### MUST

- 每次改动后**重新构建**并跑相关测试；不跑不算完成。
- UI / 交互 / 视觉改动必须**截图 + Read 读图**验收。
- 操作走 `automation/reader.lua`（Unix socket `click` / `call`），不靠像素猜坐标。
- 截图优先 **应用自截图** `app.capture`（`SDL_RenderReadPixels`），X11 截图只作兜底。
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

## 3. 构建与运行

```bash
# 构建
cmake -S . -B build -DCMAKE_BUILD_TYPE=Release
cmake --build build -j

# 会话内运行（继承 DISPLAY / XAUTHORITY）
P=$(pgrep -x "${READER_DESKTOP_PROC:-pcmanfm-qt}" | head -1)
XA=$(tr '\0' '\n' < /proc/$P/environ | sed -n 's/^XAUTHORITY=//p')
setsid env DISPLAY=:0 XAUTHORITY="$XA" XDG_RUNTIME_DIR=/run/user/1000 \
  ./build/native-reader >/tmp/opencode/reader.log 2>&1 </dev/null & disown

# 无头逻辑测试
SDL_VIDEODRIVER=dummy ./build/native-reader --headless
```

- **不要用 `systemd --user` 启动 UI**：缺 `XAUTHORITY` / GL 上下文，会“进程在、无窗口”。
- NVIDIA 驱动内核态 / 用户态版本要一致；自查 `nvidia-smi`、`/proc/driver/nvidia/version`、`glxinfo -B`。
- 无头渲染：`Xvfb :99 -screen 0 1080x1920x24` + `LIBGL_ALWAYS_SOFTWARE=1`；Wayland 用 `weston --backend=headless-backend.so`。

---

## 4. 自动化控制面

### 4.1 协议

Unix socket：`/tmp/native-reader-automation.sock`，JSON Lines：

```json
{"cmd":"list"}
{"cmd":"state"}
{"cmd":"click","id":"reader.next"}
{"cmd":"call","fn":"reader.open","args":{"path":"/books/a.epub"}}
{"cmd":"call","fn":"app.capture","args":{"path":"/tmp/opencode/reader.png"}}
{"cmd":"call","fn":"app.quit"}
```

### 4.2 LuaJIT 客户端

`automation/reader.lua`（已提供）：

```lua
local R = require("reader")
local c = assert(R.open())
print(c:state())
c:openBook("testdata/epub/min.epub")
c:next()
c:capture("/tmp/opencode/reader.png")
c:close()
```

### 4.3 命令表

| 命令 | 说明 |
|---|---|
| `nav.books` / `nav.goto` | 书库 / 页面跳转 |
| `reader.open` / `reader.close` | 打开 / 关闭 |
| `reader.state` | 书名、格式、页码、章节、进度、主题 |
| `reader.next` / `reader.prev` | 翻页 |
| `reader.goto` | `{page|chapter|offset|percent}` |
| `reader.toc` / `reader.search` | 目录 / 搜索 |
| `reader.bookmark.add/list/remove` | 书签 |
| `reader.highlight.add/list` | 高亮 / 笔记 |
| `settings.get/set` | 主题、字体、字号、行距、边距 |
| `app.capture` / `app.state` / `app.quit` | 截图 / 状态 / 退出 |

### 4.4 窗口控制（兜底）

`automation/x11.lua` + `automation/xdo.lua`（复用 `/opt/WordCard`）：

```lua
local x11 = require("x11")
local w = assert(x11.window("native-reader"))
w:activate():center()
w:capture("/tmp/opencode/native_reader.png")   -- X11 兜底
w:click(120, 240); w:key("ctrl+l")
```

---

## 5. 截图与视觉验收

- **首选**：`app.capture` → `SDL_RenderReadPixels` + `stbi_write_png`；确定性最好，CI / Xvfb 可用。
- **兜底**：`automation/x11.lua` 的 `w:capture(path)`（FFI `ak_capture`）。
- 截图后用 **Read 读图**，检查：布局、字体、图片、主题、分页、目录、搜索结果。
- 关键画面存 golden：`testdata/golden/<backend>/<case>.png`；视觉变更需人工确认后再更新 golden。
- 失败时同时保存 `expected.png` 与 `actual.png`。

---

## 6. 测试分层

1. **单元**：C `ctest`；Lua 轻量断言（分区、进度、设置合并）。
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

## 7. 失败处理

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

## 8. 代码规范

- C：`cmake --build` 无 warning；C ABI 稳定；资源生命周期放 C shim。
- Lua：模块化；自动化脚本不启动外部进程；统一走 `automation/reader.lua`。
- 复用而非重写：解析 / 渲染调 C 库（MuPDF / libmobi / libchmlib / libzip / litehtml）。
- 不引入 Chrome / WebView / CEF / Electron。
- 字体：默认仓耳今楷02（`assets/fonts/TsangerJinKai02-W04.ttf` / `W05`）；`READER_FONT` / `READER_FONT_BOLD` 可覆盖。
- 提交信息：`feat/fix/style/docs/chore(scope): ...`。

---

## 9. 目录与产物

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

## 10. 当前里程碑（Agent 从这里开始）

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

## 11. 常用命令速查

```bash
cmake -S . -B build -DCMAKE_BUILD_TYPE=Release
cmake --build build -j
./build/native-reader
luajit automation/native_demo.lua          # 窗口定位 / X11 兜底截图
luajit tools/auto_smoke.lua                # 格式冒烟
luajit -e 'package.path="automation/?.lua;"..package.path;
  local R=require("reader"); local c=assert(R.open());
  c:openBook("testdata/epub/min.epub"); c:next();
  c:capture("/tmp/opencode/reader.png"); c:close()'
```

---

## 12. 参考

- `native_reader.md`（尤其附录 A：全自动开发/测试规范）
- `/opt/WordCard/AGENTS.md`
- `/opt/WordCard/automation.md`
- `automation/xdo.lua`、`automation/x11.lua`（复用 WordCard，已适配 native_reader）
