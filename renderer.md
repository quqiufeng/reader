# Renderer 重写设计

> 目标：把当前 `lua/ui/app.lua` 里耦合的“窗口尺寸 / 排版 / 缩放 / 双栏 / 绘制 / 事件”拆成明确的渲染层。
> 不改阅读功能，先换主链路；每一步都可截图 + 回归。

---

## 1. 当前问题

1. **窗口尺寸来源不统一**
   - 有时用 renderer output，有时用 SDL window size，WM 最大化后两者会短暂不一致。
   - 导致：窗口已 2560，内容仍按 900 渲染。

2. **计时器用错**
   - 曾用 `os.clock()`（CPU 时间）做 debounce；主循环 sleep 时几乎不走，表现为“最大化要等几秒”。
   - 已改为 `gettimeofday` 墙钟，但逻辑仍分散。

3. **排版与绘制耦合**
   - `apply_resize`、`toggle_max`、`toggle_fs`、`load_page`、`relayout` 互相调用。
   - 同一个尺寸可能触发多次 layout/render；不同尺寸又可能漏掉。

4. **没有页纹理缓存**
   - 每次翻页/重绘都重新 raster；回退/前进没有缓存。

5. **状态全局可变**
   - `W/H/page/spread/zoom/scroll` 分散在全局 upvalue，绘制时读取，事件中修改。
   - 无法清楚回答“这次为什么要重绘”。

---

## 2. 目标分层

```text
lua/ui/view.lua        ViewState：窗口/模式/缩放/滚动/DPI/签名
lua/ui/layout.lua      LayoutManager：按 view 参数缓存排版
lua/ui/page_cache.lua  PageCache：页纹理缓存 + LRU + 失效
lua/ui/renderer.lua    Renderer：只负责画（content/home/panels）
lua/ui/input.lua       事件 -> intent（翻页/缩放/打开/重排）
lua/ui/app.lua         组装、生命周期、状态持久化
```

### ViewState

```lua
View = {
  win_w, win_h,        -- 物理像素目标尺寸（来自 window event / window size * dpi）
  dpi_scale,
  mode,                -- window/max/fullscreen
  spread,              -- single/dual
  zoom, pan_x, scroll_y,
  font, line, margin,
  theme,
}
View:signature()       -- 只含影响渲染的字段
```

规则：

- 事件只更新 ViewState，并标记 `dirty`。
- `renderer` 只读 ViewState，不修改它。
- `signature` 变化才触发 layout/render；否则只重绘（甚至不重绘）。

### LayoutManager

```lua
Layout:get(doc, view) -> { page_count, page_size(w,h), layout_key }
```

- key = `width + height + em + line_factor + margin + doc_id`。
- 同一 key 只 `fz_layout_document` 一次。
- 可选：缓存“窗口双栏”和“最大化双栏”两套 layout，避免最大化重排。
- 宽度下限 600，避免窄双栏 3s 级重排。

### PageCache

```lua
PageCache:get(doc, page, view) -> texture, w, h
PageCache:invalidate(layout_key / theme_dark / zoom)
```

- key = `doc_id + page + layout_key + zoom + dark`。
- LRU 保留当前/相邻页；翻回/返回不再 raster。
- 主题 light/sepia/china 不失效（页面像素不变）；dark 失效。

### Renderer

- 输入：ViewState + 当前页面/面板。
- 负责：viewport clip、单/双栏、页边距、页脚、进度条、滚动/平移。
- 不负责：layout、事件、持久化。

---

## 2.1 渲染区域清单（就这几类）

| kind | 内容 | 备注 |
|---|---|---|
| `content` | 书籍内容页 | PDF/EPUB/MOBI/AZW3；单栏/双栏、缩放/平移、TXT 卡片 |
| `library` | 首页/书库 | 历史列表、打开新书、清空历史 |
| `toc` | 目录面板 | panel.items |
| `bookmarks` | 书签面板 | panel.items |
| `settings` | 设置面板 | 主题/字号/行距/边距 |
| `search` | 搜索面板 | 输入框 + 结果列表 |
| `browser` | 文件浏览器 | 目录/文件（如果启用；当前文件框走 zenity 可先不启用） |

公共覆盖层（不属于独立 kind）：

- `chrome`：顶部标题/按钮、底部页码/进度条；由 Renderer 根据 `kind` 决定是否画。
- `snapshot`：不是区域，只是 `app.snapshot` 从 content 纹理导出。
- 提示/空状态：属于各 kind 内部。

分发逻辑：

```lua
Renderer.draw(view, kind, state)
  -- content / library / toc / bookmarks / settings / search / browser
```

- 只有 `content` 需要 layout/raster/cache。
- 其他区域只画列表/文本/卡片，直接读 ViewState 的宽高。
- `chrome` 跟随 `kind`：content/library 画顶部，fullscreen content 不画顶部。
- 这样删除 app.lua 里重复的“当前在哪个面板”判断，只保留一个 `kind` 状态。

---

## 3. Resize / Maximize 契约

```text
WM event(size/max/restore)
  -> View:set_window(win_w, win_h, mode)   // 用 SDL window size * DPI，不用 renderer output
  -> debounce(120ms, wall clock)
  -> size 稳定后再比较 View:signature()
       signature 不变：只重绘
       signature 变化：layout（key 未命中才真排版）→ render
```

- 最大化/恢复正常尺寸都走同一个入口，显式传 `win_w/win_h/mode`。
- 不允许在事件回调里直接 `load_page`。
- 启动恢复最大化：先等 WM settle，再开书/书库，避免先按 900 渲染一遍。

---

## 4. 迁移步骤

1. **只抽 ViewState**
   - `View:set_window/signature` 替代散落的 W/H/scale 计算。
   - `apply_resize` 只更新 ViewState + dirty。

2. **抽 Renderer.draw(view)**
   - 把 `draw_page` / `draw_library` / panel 调用集中到 `Renderer`。
   - 先保证单页/双页/首页画面一致。

3. **抽 LayoutManager**
   - 用 key 去重；宽度下限 600。
   - 统一 `pending_layout` 语义，删除 `startup_sync/force_reload` 等补丁。

4. **PageCache**
   - 先缓存当前页；再加前后各 1 页；最后 LRU。

5. **删除旧路径**
   - 删除 app.lua 里重复的 resize/layout 判断。
   - 事件层只发 intent。

---

## 5. 验收

- [ ] 启动恢复最大化：首帧就是 2560，内容不再先按 900 渲染。
- [ ] 最大化/恢复：只 layout 一次；墙钟延迟 < 150ms；不出现 content 900/window 2560。
- [ ] 双栏/单栏/缩放/主题切换：signature 变化才 raster。
- [ ] PDF/EPUB/MOBI/AZW3/TXT：翻页、目录、搜索、截图回归通过。
- [ ] 首页书库在窗口尺寸变化后跟随。
- [ ] `tools/test.sh` 全绿。

---

## 6. 不做

- 不换 UI 框架。
- 不引入 WebView/Flutter。
- 首期不做异步 raster；先把尺寸/布局/缓存契约做对。
