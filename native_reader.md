# native_reader.md

> 将 Android 极空间阅读器的功能实现，迁移到 **LuaJIT FFI + Lua + C 库** 的桌面原生阅读器。
>
> 约束：**不使用 Chrome / WebView / CEF / Electron**；桌面优先 Linux（X11 / Wayland）。
>
> 目标格式：PDF、EPUB、MOBI、AZW3、TXT、CHM、漫画（CBZ/CBR）。
>
> 说明：本文是设计与迁移文档，不是可直接编译的代码。反编译源码仅作行为参考。

---

## 1. 目标与范围

### 1.1 必做

- 打开 PDF / EPUB / MOBI / AZW3 / TXT / CHM / CBZ / CBR
- 目录、翻页、跳转、阅读进度、书签
- 字体、字号、行距、页边距、主题（日间/夜间/护眼）
- 搜索（当前书内）
- 图片、封面、表格、代码块、脚注链接
- 高 DPI、鼠标/触控板/键盘、拖拽打开文件
- 本地书库、最近阅读、封面缓存

### 1.2 可选 / 明确不做

- Office（docx/xlsx/pptx）：用 LibreOffice headless 转 PDF，或接商业引擎；不进入核心
- DWG：需要商业/自研引擎，暂不做
- DRM（Kindle AZW3 DRM、Readium LCP、Adobe DRM）：不支持
- 账号 / NAS 同步 / 云书库：桌面版先做本地文件，后续可加 WebDAV
- TTS：可接 espeak-ng / piper，非核心

---

## 2. 技术选型

| 能力 | 选型 | 说明 |
|---|---|---|
| 语言/运行时 | **LuaJIT** | FFI 直接调 C；单线程，重活放 C worker |
| 窗口/输入/GPU | **SDL2** | X11/Wayland、键鼠/触控板、纹理、全屏、高 DPI |
| 2D 绘制 | SDL2 纹理 / Cairo / Skia | 页面位图贴纹理；UI 用简单矢量/文字 |
| PDF | **MuPDF** | C API，渲染、目录、链接、搜索 |
| EPUB（简单） | **MuPDF** `fz_layout_document` | 文本型 EPUB 足够；CSS 支持有限 |
| EPUB（复杂） | **litehtml** | C++，需 `extern "C"` 薄 shim；CSS2.1 + 部分 CSS3，无 JS |
| MOBI/AZW3 | **libmobi** | 原生 KF8/AZW3 解析；输出 HTML/资源 |
| CHM | **libchmlib** | 枚举对象、取 HTML/图片 |
| ZIP/RAR | **libzip** / **libunrar** | EPUB/CBZ/CBR 解包 |
| 图片 | **stb_image** + libjpeg-turbo + libpng + libwebp | 缩略图、漫画、封面 |
| 字体 | **FreeType** + **fontconfig** | 系统字体、嵌入字体、CJK |
| 文本整形 | **HarfBuzz** + **FriBiDi** | 复杂脚本、RTL |
| 断行 | **libunibreak** | CJK/Unicode 行断点 |
| 数据 | **SQLite**（FTS5） | 书库、进度、书签、全文搜索索引 |
| 异步 | Lua 协程 + C worker + 队列 | 解析/渲染不阻塞 UI |
| 打包 | CMake + AppImage/Flatpak | 桌面分发 |

> 不使用 Chrome/WebView/CEF。EPUB 的 HTML/CSS 由 **MuPDF** 或 **litehtml** 处理；两者都不跑 JS。
> 如果未来需要完整 CSS/JS，可另加 WebKitGTK（非 Chrome）作为可选后端，但不属于本方案基线。

---

## 3. Android → 桌面映射

| Android 实现 | 桌面替代 |
|---|---|
| `NewZReaderActivity` / `ZReaderActivity` | `ui/reader.lua`（场景 + 状态机） |
| `PageView`（点击分区翻页） | `ui/pageview.lua` + 同一套左/右/中间区域算法 |
| `NovelRecycleView` / `NovelViewPager` | 自定义页面容器 / 列表视图（SDL2） |
| `PDFTronZReader` / `PdfBitmapLoader` / `MuPdfPageView` | `render/pdf.lua` + MuPDF |
| `EpubReadiumZReader` / Readium | `render/epub_mupdf.lua` 或 `render/epub_litehtml.lua` |
| `MobiUtilBusiness` / `ZspaceMobiJni` | `ffi/libmobi.lua` + `native/mobi.c` |
| `ComicEpubZReader` / `ComicReaderActivity` | `render/comic.lua` |
| `BookModel.getBookFileType()` | `core/detect.lua`（扩展名 + 魔数） |
| `SharedPreferences` / Room | SQLite + JSON 配置 |
| Glide | `stb_image` + 纹理 LRU |
| Coroutines / RxJava | Lua 协程 + C worker 线程池 |
| Hilt / Dagger | Lua 模块表 + 显式注入 |
| EventBus | `core/event.lua` 简单发布订阅 |
| WebView（EPUB） | MuPDF EPUB / litehtml |

---

## 4. 总体架构

```text
┌──────────────────────────────────────────────┐
│ ui/          书库、阅读器、设置、目录、搜索   │
├──────────────────────────────────────────────┤
│ core/        文档模型、进度、书签、事件、缓存 │
├──────────────────────────────────────────────┤
│ render/      pdf / epub / txt / comic        │
├──────────────────────────────────────────────┤
│ ffi/         mupdf / libmobi / chmlib / zip  │
│              freetype / harfbuzz / stb_image │
├──────────────────────────────────────────────┤
│ native/      libreader_native.so（C ABI）     │
├──────────────────────────────────────────────┤
│ C 库         MuPDF / libmobi / libchmlib …    │
└──────────────────────────────────────────────┘
```

LuaJIT 只依赖 `native/libreader_native.so` 暴露的稳定 C ABI；复杂结构体、回调、资源生命周期都封在 C 层，避免在 Lua 里操作危险指针。

---

## 5. 目录结构

```text
native-reader/
├── CMakeLists.txt
├── src/
│   ├── main.c                 # SDL2 窗口、事件循环、Lua 状态
│   ├── shim/
│   │   ├── reader_api.c       # 对外 C ABI
│   │   ├── pdf_mupdf.c
│   │   ├── mobi_libmobi.c
│   │   ├── chm_libchmlib.c
│   │   ├── zip_util.c
│   │   ├── image_util.c
│   │   └── html_litehtml.cpp  # litehtml C++ shim（extern "C"）
│   └── worker/
│       ├── job_queue.c        # 后台解析/渲染
│       └── cache.c            # 页/图 LRU
├── lua/
│   ├── ui/
│   │   ├── app.lua
│   │   ├── bookshelf.lua
│   │   ├── reader.lua
│   │   ├── pageview.lua
│   │   ├── toc.lua
│   │   ├── search.lua
│   │   └── settings.lua
│   ├── core/
│   │   ├── detect.lua
│   │   ├── book.lua
│   │   ├── progress.lua
│   │   ├── bookmark.lua
│   │   ├── event.lua
│   │   └── db.lua
│   ├── render/
│   │   ├── pdf.lua
│   │   ├── epub_mupdf.lua
│   │   ├── epub_litehtml.lua
│   │   ├── txt.lua
│   │   └── comic.lua
│   └── ffi/
│       ├── reader.lua         # 绑定 libreader_native
│       ├── freetype.lua
│       ├── harfbuzz.lua
│       └── sqlite.lua
└── third_party/               # mupdf / libmobi / litehtml / ...
```

---

## 6. 格式管线

### 6.1 探测

`core/detect.lua`，扩展名只作提示，真正看魔数：

| 格式 | 判据 |
|---|---|
| PDF | `%PDF-` |
| EPUB | ZIP + `mimetype` = `application/epub+zip` + `META-INF/container.xml` |
| MOBI/AZW3 | PalmDB 偏移 60 为 `BOOKMOBI`；`mobi_is_kf8()` 区分 KF8 |
| CHM | `ITSF` |
| ZIP 漫画 | ZIP + 图片条目占多数 |
| RAR 漫画 | `Rar!` |
| TXT | 无魔数，做编码探测 |

### 6.2 PDF

```text
MuPDF: fz_open_document → fz_count_pages → fz_load_page
       → fz_new_pixmap_from_page(zoom) → RGBA → SDL 纹理
目录: fz_load_outline
链接: fz_load_links
搜索: fz_search_page
```

- 高倍缩放重新渲染，不放大旧位图。
- 超大页面 tile 渲染。
- 封面：渲染第 0 页小图。

### 6.3 EPUB（简单）

```text
MuPDF: fz_open_document("book.epub")
       → fz_layout_document(w, h, em)
       → fz_count_pages / fz_load_page → render
```

适合文字型 EPUB；CSS/复杂排版支持有限。

### 6.4 EPUB（复杂）

```text
libzip 解包 → container.xml → OPF → spine
→ 每个 spine item 的 XHTML 交给 litehtml
→ litehtml 布局 + Cairo/Skia 绘制
```

- litehtml 是 C++，通过 `html_litehtml.cpp` 暴露 C ABI。
- 字体用 FreeType/fontconfig；图片用 stb_image/libjpeg/libpng/libwebp。
- 不支持 JS；固定版式/重 CSS 需要逐书评估。
- 分页：先按视口宽度布局，再用 CSS 多列/分页规则切页；或按滚动模式连续显示。

### 6.5 MOBI / AZW3

```text
libmobi: mobi_init → mobi_open → mobi_is_kf8
        → mobi_dump_rawml（HTML）
        → mobi_get_filemeta_by_type（封面/缩略图）
        → mobi_get_embedded_source（图片/字体）
        → 组装临时 EPUB 或直接 HTML+资源
        → 复用 EPUB 管线
```

- DRM 文件不支持。
- KF8/AZW3 的 FDST/skeleton/fragments 由 libmobi 还原。
- `recindex` / `kindle:embed:` 引用要重写为资源路径。
- 图片保持原始字节，不二次压缩。

### 6.6 TXT

```text
编码探测（uchardet / ICU / 简单 BOM 判断）
→ 解码 UTF-8
→ 章节切分（正则/空行/“第X章”）
→ 按视口分页（FreeType 字体度量 + libunibreak 断行）
```

- 大文件按块读取，建立章节偏移索引。
- 记住 `(章节, 字符偏移)` 作为进度。

### 6.7 CHM

```text
libchmlib: chm_open → chm_enumerate → chm_retrieve_object
→ HTML + 图片资源
→ HTML 引擎（litehtml / MuPDF）
```

### 6.8 漫画 CBZ/CBR

```text
libzip / libunrar 解包
→ 图片列表排序（自然排序）
→ stb_image / libjpeg / libpng / libwebp 解码
→ 页面纹理
```

- 预加载前后 1–2 页；LRU。
- 双页/单页/从右到左阅读模式。
- GIF 动图用 giflib 或 libpl_droidsonroids_gif（如果复用 Android so）。

### 6.9 Office / DWG（可选）

- Office：调 `libreoffice --headless --convert-to pdf` 转 PDF，再走 PDF 管线。
- DWG：不进入核心；需要时接商业引擎。

---

## 7. C ABI（libreader_native）

建议把所有 C 库封在 `libreader_native.so` 后，LuaJIT 只调这些函数：

```c
// 格式
int  rd_detect_format(const char *path);          // 1=pdf 2=epub 3=mobi 4=chm 5=comic 6=txt

// 通用文档
void *rd_open(const char *path, int *err);
void  rd_close(void *doc);

int   rd_page_count(void *doc);
void  rd_page_size(void *doc, int page, int *w, int *h);
int   rd_render_page(void *doc, int page, float zoom,
                     uint8_t **rgba, int *w, int *h);
void  rd_free(void *p);

// 目录 / 链接 / 搜索
char *rd_toc_json(void *doc);                     // 调用方 free
char *rd_links_json(void *doc, int page);
char *rd_search_json(void *doc, const char *q, int max);

// 元数据 / 封面
char *rd_metadata_json(void *doc);
int   rd_cover(void *doc, uint8_t **data, int *len);
int   rd_thumbnail(void *doc, int w, int h, uint8_t **rgba);

// 格式专用
int   rd_mobi_to_epub(const char *in, const char *out);
int   rd_mobi_raw_html(const char *in, char **html, char ***resources, int *n);
int   rd_chm_extract(const char *in, const char *out_dir);
int   rd_zip_list(const char *in, char ***names, int *n);
int   rd_image_decode(const uint8_t *data, int len,
                      uint8_t **rgba, int *w, int *h);
```

LuaJIT 侧：

```lua
local ffi = require("ffi")
local R = ffi.load("reader_native")

ffi.cdef[[
int rd_detect_format(const char *path);
void *rd_open(const char *path, int *err);
void rd_close(void *doc);
int rd_page_count(void *doc);
int rd_render_page(void *doc, int page, float zoom,
                   uint8_t **rgba, int *w, int *h);
void rd_free(void *p);
]]

local err = ffi.new("int[1]")
local doc = R.rd_open(path, err)
local n = R.rd_page_count(doc)

local buf = ffi.new("uint8_t*[1]")
local w, h = ffi.new("int[1]"), ffi.new("int[1]")
if R.rd_render_page(doc, 0, 1.0, buf, w, h) == 0 then
    -- buf[0], w[0], h[0] -> SDL_UpdateTexture
    R.rd_free(buf[0])
end
```

---

## 8. 渲染与排版

### 8.1 PDF

- MuPDF 输出 RGBA8888，直接 `SDL_CreateTexture`/`SDL_UpdateTexture`。
- 缩放：`zoom = dpi_scale * user_zoom`。
- 大页面：按视口 tile 渲染，缓存可见 tile。
- 夜间模式：渲染后做反色/调色，或重新渲染带颜色变换。

### 8.2 EPUB / HTML

- 文本整形：FreeType 度量 + HarfBuzz shaping + FriBiDi（RTL）+ libunibreak 断行。
- litehtml 负责 HTML/CSS 布局；Cairo/Skia 作为绘制后端。
- 图片：stb_image/libjpeg/libpng/libwebp；SVG 用 nanosvg 或 librsvg（可选）。
- 字体：fontconfig 选择系统字体；EPUB `@font-face` 嵌入字体；CJK fallback。
- 分页：
  - 连续滚动模式：最简单，先做。
  - 分页模式：按视口高度切页；记录每页起始 DOM/字符位置。
- 主题：日间/夜间/护眼，通过 CSS 变量 + 背景色 + 字体色。

### 8.3 TXT

- 用同一套 FreeType/HarfBuzz/libunibreak 排版。
- 按字符偏移分页；缓存每页起始 offset。
- 字体、字号、行距、页边距即时生效，重新分页。

### 8.4 漫画

- 图片解码为 RGBA 纹理，适配屏幕（contain/cover）。
- 双页拼接、从右到左、单页放大/拖动。
- 预加载相邻页，滑动/翻页动画用纹理平移。

---

## 9. UI 与交互

### 9.1 页面点击分区（迁移 `PageView`）

Android `PageView` 的规则：

- 左 1/3 → 上一页
- 右 1/3 → 下一页
- 中间 1/3 上下半区分别触发上一页/下一页
- 中间竖条 `RectF` 用于菜单/弹窗

桌面实现保持同样算法：

```lua
local function hit_zone(x, y, w, h, m)
    m = m or w / 3
    if x < (w - m) / 2 then return "prev" end
    if x > (w + m) / 2 then return "next" end
    if x < (w + m) / 2 and y < (h - B) / 2 then return "prev" end
    if x > (w - m) / 2 and y > (h + B) / 2 then return "next" end
    return "menu"
end
```

同时支持：

- 键盘：`←/→`、`PageUp/PageDown`、`Space`、`Home/End`
- 鼠标滚轮：滚动/翻页
- 触控板双指：缩放
- 右键/长按：菜单、书签、复制

### 9.2 阅读器 UI

- 顶部：返回、书名、目录、搜索、更多
- 底部：进度条、页码、主题、字体
- 侧栏：目录树、书签、笔记
- 设置：字体、字号、行距、页边距、翻页动画、日夜模式

### 9.3 桌面特性

- 高 DPI：`SDL_GetDisplayDPI` / `SDL_GetWindowSizeInPixels`，界面按 scale 渲染。
- 字体：fontconfig；不要硬编码字体路径。
- 文件打开：命令行参数、拖拽到窗口、文件对话框（xdg-desktop-portal 或 GTK dialog shim）。
- 窗口：全屏、无边框、双页、记住窗口大小。
- 剪贴板：复制选中文本。
- 通知：可选 libnotify。
- 多显示器：记住窗口位置。

---

## 10. 数据与状态（SQLite）

```sql
CREATE TABLE books (
  id INTEGER PRIMARY KEY,
  path TEXT UNIQUE,
  format TEXT,
  title TEXT,
  author TEXT,
  cover_path TEXT,
  added_at INTEGER,
  last_read_at INTEGER
);

CREATE TABLE progress (
  book_id INTEGER PRIMARY KEY,
  chapter INTEGER,
  page INTEGER,
  char_offset INTEGER,
  percent REAL,
  updated_at INTEGER
);

CREATE TABLE bookmarks (
  id INTEGER PRIMARY KEY,
  book_id INTEGER,
  chapter INTEGER,
  page INTEGER,
  char_offset INTEGER,
  note TEXT,
  created_at INTEGER
);

CREATE TABLE highlights (
  id INTEGER PRIMARY KEY,
  book_id INTEGER,
  chapter INTEGER,
  start_offset INTEGER,
  end_offset INTEGER,
  color INTEGER,
  note TEXT
);

CREATE VIRTUAL TABLE search_index USING fts5(
  book_id, chapter, content
);
```

- 配置用 JSON（主题、字体、快捷键）。
- 封面/缩略图缓存放 `~/.cache/native-reader/`。
- 书库监听用 inotify（可选），或启动时扫描。

---

## 11. 线程、异步与缓存

- LuaJIT 单线程；UI 主线程只做事件和绘制。
- C worker 线程池：解析、分页、渲染、图片解码、搜索索引。
- 结果通过线程安全队列回到 Lua；Lua 用 `luv` 或自定义 `poll` 取。
- 页面缓存：
  - 当前页 + 前后各 1–2 页的 RGBA/纹理
  - LRU，按内存预算淘汰
  - 缩放/窗口尺寸变化时清空重渲染
- 图片缓存：原图字节 + 解码后的缩略图分开缓存。
- 搜索索引：后台增量建索引，SQLite FTS5。

---

## 12. 构建与依赖

### 12.1 CMake 依赖

```cmake
# 伪代码
find_package(SDL2 REQUIRED)
find_package(Freetype REQUIRED)
find_package(HarfBuzz REQUIRED)
find_package(SQLite3 REQUIRED)
# 源码内置/子模块：mupdf, libmobi, libchmlib, libzip, litehtml,
# libunibreak, stb, libjpeg-turbo, libpng, libwebp
```

### 12.2 授权

| 库 | 授权 | 注意 |
|---|---|---|
| MuPDF | AGPL-3.0 / 商业 | 闭源分发需商业授权 |
| litehtml | BSD-3 | 可商用 |
| libmobi | LGPL | 动态链接注意 |
| libchmlib | LGPL | 同上 |
| libzip | BSD-3 | |
| FreeType | FTL / GPLv2 | FTL 可商用 |
| HarfBuzz | MIT | |
| FriBiDi | LGPL | |
| libunibreak | zlib | |
| SDL2 | zlib | |
| SQLite | Public Domain | |
| stb | MIT / Public Domain | |

### 12.3 分发

- Linux：AppImage / Flatpak；带上依赖库和字体配置。
- 注意 MuPDF AGPL：如果产品闭源，购买商业授权或改用许可更宽松的 PDF 引擎（PDFium 是 BSD，但 C++ 接口，FFI 需 shim）。

---

## 13. 迁移清单（按功能）

| Android 功能 | 桌面实现 | 优先级 |
|---|---|---|
| 书库/最近阅读 | SQLite + 列表视图 | P0 |
| PDF 打开/翻页 | MuPDF | P0 |
| EPUB 打开/翻页 | MuPDF（简单）/ litehtml（复杂） | P0 |
| TXT 打开/分页 | 自定义排版 | P0 |
| 目录/跳转 | `rd_toc_json` | P0 |
| 阅读进度 | SQLite `progress` | P0 |
| 字体/字号/行距/边距 | 设置 + 重新分页 | P1 |
| 日间/夜间/护眼 | 主题系统 | P1 |
| 书签/高亮/笔记 | SQLite + 文本选择 | P1 |
| 搜索 | MuPDF / FTS5 | P1 |
| MOBI/AZW3 | libmobi → EPUB | P1 |
| CHM | libchmlib → HTML | P2 |
| 漫画 CBZ/CBR | libzip/unrar + 图片解码 | P2 |
| 双页/从右到左 | 页面布局 | P2 |
| 自动翻页 | 定时器 | P2 |
| Office/DWG | 外部转换/商业引擎 | P3 |

---

## 14. 风险与对策

| 风险 | 对策 |
|---|---|
| litehtml 的 CSS 支持有限 | 先做连续滚动 + 简单 CSS；复杂书用 MuPDF 或逐书评估 |
| EPUB 固定版式 | litehtml 绝对定位可覆盖一部分；不行的标记为“不支持” |
| 字体/断行效果 | FreeType + HarfBuzz + libunibreak；内置 CJK 字体回退 |
| MuPDF AGPL | 商业授权或换 PDFium/Poppler（注意各自授权） |
| 大 PDF 内存 | tile 渲染 + 页缓存上限 |
| LuaJIT FFI 回调/生命周期 | 所有资源生命周期放 C shim；Lua 只拿 handle |
| 桌面输入差异 | SDL2 统一键鼠/触控板；高 DPI 适配 |
| 无 JS | 不支持脚本化 EPUB；必要时再评估 WebKitGTK（非 Chrome） |
| DRM | 明确不支持 |

---

## 15. 里程碑

1. **骨架**：SDL2 窗口 + LuaJIT + `libreader_native` + 书库列表
2. **PDF**：打开、渲染、翻页、目录、进度
3. **TXT**：编码探测、分页、字体设置
4. **EPUB（MuPDF）**：打开、分页、目录
5. **MOBI/AZW3**：libmobi → EPUB，复用 EPUB
6. **EPUB（litehtml）**：HTML/CSS 布局、图片、链接
7. **CHM / 漫画**
8. **搜索 / 书签 / 高亮**
9. **主题 / 双页 / 动画 / 高 DPI**
10. **打包**：AppImage/Flatpak

---

## 16. 附：最小页面翻页逻辑

```lua
-- ui/pageview.lua
local PageView = {}
PageView.__index = PageView

function PageView.new(w, h)
    return setmetatable({ w = w, h = h, B = 24 }, PageView)
end

function PageView:zone(x, y)
    local m = self.w / 3
    if x < (self.w - m) / 2 then return "prev" end
    if x > (self.w + m) / 2 then return "next" end
    if x < (self.w + m) / 2 and y < (self.h - self.B) / 2 then return "prev" end
    if x > (self.w - m) / 2 and y > (self.h + self.B) / 2 then return "next" end
    return "menu"
end

function PageView:on_click(x, y)
    local z = self:zone(x, y)
    if z == "next" then return self:next_page()
    elseif z == "prev" then return self:prev_page()
    else return self:toggle_menu() end
end
```

---

## 17. 结论

- **PDF**：MuPDF 一条路，稳定、C API、FFI 友好。
- **EPUB**：MuPDF 先跑通，litehtml 补复杂排版；完全不依赖 Chrome。
- **MOBI/AZW3**：libmobi 原生解析，转 EPUB 或直出 HTML。
- **TXT/CHM/漫画**：纯 C + 自定义排版/解码。
- 桌面用 SDL2 + LuaJIT + C shim，把 Android 的 Activity/View/WebView 职责拆成“场景 + 文档模型 + 渲染器”。

按本文里程碑推进，可以先得到一个 PDF/TXT/EPUB 可用的桌面阅读器，再逐步补齐 MOBI/AZW3、CHM、漫画和高级功能。

---

## 附录 A：全自动开发/测试规范（参考 WordCard）

> 已落地：`automation/xdo.lua`、`automation/x11.lua`、`automation/reader.lua`、`automation/native_demo.lua`；开发约定见根目录 `AGENTS.md`。
>
> 参考 `/opt/WordCard/AGENTS.md` 与 `/opt/WordCard/automation.md`，结合本项目 SDL2 + LuaJIT + C 的架构调整。
>
> 核心：**结构化操作 + 视觉验收**。Agent 自己构建、运行、用 API 操作、截图、读图、定位差异、改代码，形成闭环。

### A.1 闭环

```text
设计 → 构建 → 会话内运行 → LuaJIT FFI 驱动 → 截图 → Read 读图
  ▲                                                        │
  └──────────────── 定位差异 ← 改代码 ←────────────────────┘
```

- 操作走**语义化 API**（`click(id)` / `call(fn,args)`），不靠像素猜坐标。
- 截图只用于**验收**，不是每一步都做。
- 失败时自动保存 `state.json + screenshot.png + app.log`，便于复盘。

### A.2 与 WordCard 的对应

| WordCard | native_reader |
|---|---|
| Flutter UI | SDL2 + Lua UI |
| `libwordcard_ctl.so` + Unix socket | `libreader_ctl.so` + Unix socket |
| `automation/wordcard.lua` | `automation/reader.lua` |
| `automation/x11.lua` + `xdo.lua` | 同结构，窗口/截图用 FFI |
| `ak_capture` 截 GL 窗口 | **优先自截图** `SDL_RenderReadPixels`；X11 截图兜底 |
| `Automation.invoke(id)` | `Automation.invoke(id)` / `call(fn,args)` |
| `agents` 能读图自检 | 同 |

### A.3 进程内自动化桥

应用内启动一个 Unix socket 服务（JSON Lines）：

```text
/tmp/native-reader-automation.sock
```

协议：

```json
{"cmd":"list"}
{"cmd":"state"}
{"cmd":"click","id":"reader.next"}
{"cmd":"call","fn":"reader.open","args":{"path":"/books/a.epub"}}
{"cmd":"call","fn":"app.capture","args":{"path":"/tmp/opencode/reader.png"}}
```

- `list`：返回当前页面可点击动作。
- `state`：返回页面、书名、页码、进度、主题、目录位置等 JSON。
- `click`：触发 UI 动作。
- `call`：调用带参函数。
- `ping`：存活检查。

实现方式二选一：

1. **C 控制库**（对齐 WordCard）：`libreader_ctl.so` 连 socket，LuaJIT FFI 只调 `ctl_open/call/list/state/click`。
2. **纯 Lua socket 客户端**：`luasocket` / `luv` 直接说 JSON Lines；少一个 C 库。

推荐 1，和 WordCard 一致，FFI 层稳定、易复用。

### A.4 LuaJIT FFI 客户端

`automation/reader.lua`：

```lua
local ffi = require("ffi")

ffi.cdef[[
typedef struct rdctl_t rdctl_t;
rdctl_t* rdctl_open(const char* path);
void     rdctl_close(rdctl_t* c);
int      rdctl_call(rdctl_t* c, const char* req, char* out, int outlen);
int      rdctl_list(rdctl_t* c, char* out, int outlen);
int      rdctl_state(rdctl_t* c, char* out, int outlen);
int      rdctl_click(rdctl_t* c, const char* id, char* out, int outlen);
]]

local M = {}
M.__index = M
M.BUF = 1024 * 1024

function M.open(path)
    path = path or os.getenv("READER_AUTOMATION_SOCK")
        or "/tmp/native-reader-automation.sock"
    local lib = ffi.load(os.getenv("RDCTL_LIB") or "reader_ctl")
    local h = lib.rdctl_open(path)
    if h == nil then return nil, "cannot connect: " .. path end
    return setmetatable({ h = h, lib = lib }, M)
end

function M:raw(req)
    local out = ffi.new("char[?]", M.BUF)
    local n = self.lib.rdctl_call(self.h, req, out, M.BUF)
    if n < 0 then return nil end
    return ffi.string(out, n)
end

function M:state() return self:raw('{"cmd":"state"}') end
function M:list() return self:raw('{"cmd":"list"}') end
function M:click(id) return self:raw(('{"cmd":"click","id":"%s"}'):format(id)) end
function M:call(fn, args) return self:raw(('{"cmd":"call","fn":"%s","args":%s}'):format(fn, args or "{}")) end

function M:capture(path)
    return self:call("app.capture", ('{"path":"%s"}'):format(path))
end

function M:close() self.lib.rdctl_close(self.h) end

return M
```

### A.5 窗口与截图

- **首选：应用自截图**（确定性最好，不依赖 X11）
  - `app.capture` 调 `SDL_RenderReadPixels` 读当前帧，`stbi_write_png` 写文件。
  - 适合 CI/Xvfb/dummy 渲染；不受窗口移动/缩放影响。
- **兜底：X11 截图**（参考 WordCard 的 `ak_capture`）
  - 仅当需要截整个窗口/多窗口时使用。
  - 通过 LuaJIT FFI 调 `libagentkit.so` 的 `ak_capture`，不启动 `import`/`xdotool`/`wmctrl`。
- 窗口控制（可选）：`automation/x11.lua` + `xdo.lua`，提供 `activate/center/move/click/key/type/capture`。

### A.6 自动化命令表

| 命令/函数 | 说明 |
|---|---|
| `nav.books` / `nav.goto` | 书库/页面跳转 |
| `reader.open` | 打开 `path` |
| `reader.close` | 关闭当前书 |
| `reader.state` | 书名、格式、页码、章节、进度、主题 |
| `reader.next` / `reader.prev` | 下一页/上一页 |
| `reader.goto` | `{page|chapter|offset|percent}` |
| `reader.toc` | 目录 JSON |
| `reader.search` | 当前书搜索 |
| `reader.bookmark.add/list/remove` | 书签 |
| `reader.highlight.add/list` | 高亮/笔记 |
| `settings.get/set` | 主题、字体、字号、行距、边距、单双页 |
| `app.capture` | 截图到 `path` |
| `app.state` | 进程/窗口/内存状态 |
| `app.quit` | 退出 |

### A.7 测试分层

1. **单元测试**
   - C：`ctest` / 自带断言；解析、分页、缓存、编码探测。
   - Lua：`busted` 或轻量断言；页面分区、进度计算、设置合并。
2. **格式冒烟**（每个格式一个最小样本）
   - 打开 → 页数 > 0 → 渲染第 0 页 → 渲染 checksum 非空 → 目录/元数据。
   - 本机样本：`/home/quqiufeng/Downloads/book`，清单 `testdata/samples.lua`；`READER_BOOK_DIR` 可覆盖。
   - 当前覆盖：2×PDF、1×EPUB、2×MOBI、1×AZW3（均无 DRM）；TXT/CHM/CBZ 待补样本。
3. **交互测试**
   - next/prev、goto chapter、TOC 跳转、搜索、书签、主题/字体、缩放、双页、RTL。
4. **视觉验收**
   - 固定窗口尺寸/DPI/字体，截图后与 golden 对比（像素 diff 或人工 Read）。
   - 关键画面：封面、正文首屏、夜间模式、设置页、目录、搜索结果。
5. **回归矩阵**
   - 格式 × 功能 × 主题；每次提交跑冒烟 + 关键视觉。
6. **健壮性**
   - 损坏文件、超大文件、缺字体、DRM、路径穿越、ZIP 炸弹（限制解压大小/比例）。

### A.8 无头/CI 运行

```bash
# 逻辑测试：无窗口
SDL_VIDEODRIVER=dummy ./build/native-reader --headless

# 截图/渲染测试：Xvfb + 软件 GL
Xvfb :99 -screen 0 1080x1920x24 &
DISPLAY=:99 LIBGL_ALWAYS_SOFTWARE=1 ./build/native-reader &
DISPLAY=:99 luajit tools/auto_smoke.lua

# Wayland 无头
XDG_RUNTIME_DIR=/run/user/1000 weston \
  --backend=headless-backend.so --socket=wayland-0 --idle-time=0 &
XDG_RUNTIME_DIR=/run/user/1000 WAYLAND_DISPLAY=wayland-0 ./build/native-reader &
```

注意：

- **不要用 `systemd --user` 启动 UI**：缺 `XAUTHORITY`/GL 上下文，会“进程在、无窗口”。
- 从图形会话进程继承 `DISPLAY`/`XAUTHORITY`（WordCard 的 `ensure_display` 思路）。
- NVIDIA 驱动内核态/用户态版本要一致；自查 `nvidia-smi`、`/proc/driver/nvidia/version`、`glxinfo -B`。
- 不要用 `pkill -f` 匹配自身命令行；用 `pkill -x` 或 `'llama-serve[r]'` 括号技巧。

### A.9 标准闭环命令

```bash
# 1) 构建
cmake -S . -B build -DCMAKE_BUILD_TYPE=Release
cmake --build build -j

# 2) 会话内运行
P=$(pgrep -x pcmanfm-qt | head -1)
XA=$(tr '\0' '\n' < /proc/$P/environ | sed -n 's/^XAUTHORITY=//p')
setsid env DISPLAY=:0 XAUTHORITY="$XA" XDG_RUNTIME_DIR=/run/user/1000 \
  ./build/native-reader >/tmp/opencode/reader.log 2>&1 </dev/null & disown

# 3) 驱动 + 截图
luajit tools/auto_smoke.lua
luajit -e 'package.path="automation/?.lua;"..package.path;
  local R=require("reader"); local c=assert(R.open());
  c:call("reader.open", "{\"path\":\"testdata/epub/min.epub\"}");
  c:call("reader.next"); c:capture("/tmp/opencode/reader.png"); c:close()'

# 4) Read /tmp/opencode/reader.png 看图 → 判差异 → 改代码 → 回到 1)
```

### A.10 失败产物

每次自动化运行输出到：

```text
artifacts/<timestamp>/<case>/
├── state_before.json
├── state_after.json
├── screenshot.png
├── app.log
└── result.json      # ok / error / timings
```

- 失败用例必须带截图 + 状态 + 日志尾部。
- 视觉 diff 失败时同时保存 `expected.png` 和 `actual.png`。

### A.11 规范约定

- C：`cmake --build` 无 warning；C ABI 变更同步更新 LuaJIT `ffi.cdef` 和文档。
- Lua：模块化；自动化脚本不启动外部进程（xdotool/wmctrl/import）；统一走 `automation/reader.lua`。
- 提交信息：`feat/fix/style/docs/chore(scope): ...`。
- Definition of Done：
  1. 构建通过、无 warning；
  2. 格式冒烟全过；
  3. 关键视觉截图已 Read 验收；
  4. `state` 断言通过；
  5. 失败产物已归档；
  6. 提交信息符合约定。

### A.12 与 WordCard 的差异

- WordCard 的 UI 是 Flutter，窗口截图走 X11/GL；本项目 UI 是 SDL2 + Lua，**优先应用自截图**，更稳定、更适合 CI。
- 本项目 UI 就是 Lua，`Automation.invoke(id)` 可以在进程内直接调用 Lua 函数；外部 `luajit` 客户端仍通过 Unix socket 控制。
- EPUB 没有 Chrome/WebView，视觉验收需要覆盖 litehtml/MuPDF 的排版差异，golden 截图按渲染后端分开存。
