# reader × 词汇学习 / 双语阅读迁移清单

> 结论：**不迁移 WordCard 的代码与 UI，从 0 重写需要的功能。**
> WordCard 只作为行为参考和 StaticPy 语言管线的调用方；reader 保持原生 C + LuaJIT + SDL2 的轻量架构。

---

## 0. 目标与非目标

### 目标

在 reader 内实现：

1. **边读边查**：选中单词/段落 → 释义或翻译。
2. **边读边记**：一键加入生词；自动记录书名、句子上下文。
3. **SM-2 复习**：到期队列、0–5 评分、下次复习时间。
4. **双语阅读**：段落原文 + 按需译文，不打断阅读流。
5. **对外 Agent API**：上述能力全部可被外部 Agent 调用。

### 非目标（暂不做）

- 不迁移 WordCard 的 Flutter UI、数据库结构、任务/卡片/口语体系。
- 不复制 WordCard 的 C 源码；SM-2 按公开算法重写。
- 首期不做 OCR、TTS、ASR、卡片导出、微信/语音。
- 不引入 WebView / Electron / Flutter。

---

## 1. 总体架构

```text
reader UI (SDL2)
  ├─ lua/core/vocab.lua        生词/掌握度/SM-2（自己实现）
  ├─ lua/core/translate.lua    翻译/释义适配层
  │    └─ StaticPy 语言管线（优先）
  │         ├─ wc_translate    OpenAI 兼容 /v1/chat/completions
  │         └─ wc_define       词典 + 可选 LLM
  ├─ lua/core/store.lua        原子持久化（复用）
  └─ automation/agent.lua      对外 API
```

原则：

- **优先集成 StaticPy 管线**：先进程调用，稳定后再考虑 FFI。
- 翻译/查词失败不阻断阅读；超时/取消必须可用。
- 所有新能力都同时暴露 CLI + Agent API。

---

## 2. 优先级 P0：集成 StaticPy 语言流水线

### 2.1 先确认可用的入口

参考路径（只调用，不复制实现）：

```bash
# 翻译：text -> out.txt；url/model 可省略
native/staticpy/translate/wc_translate "text" /tmp/out.txt \
  http://127.0.0.1:8081/v1/chat/completions deepseek-flash

# 查词：支持多个词、词典 TSV、可选 LLM
native/staticpy/define/wc_define abandon --dict data/wordlists/cet4.tsv

# 电子书解析（reader 已有 MuPDF，可后置）
native/staticpy/ebook_text/wc_ebook_text <book>
```

环境变量：

- `WC_LLM_URL`：默认 `http://127.0.0.1:8081/v1/chat/completions`
- `WC_LLM_MODEL` / `DEEPSEEK_MODEL`
- `DEEPSEEK_API_KEY`（可选）
- `READER_STATICPY_ROOT`：StaticPy 根目录，默认 `/opt/WordCard/native/staticpy`
- 运行 `wc_define`/`wc_translate` 时需带对应 `LD_LIBRARY_PATH`

### 2.2 写适配层（不依赖 WordCard 源码）

新增：

```text
lua/core/staticpy.lua     # 进程调用、超时、临时文件、错误归一化
lua/core/translate.lua    # translate.text / translate.paragraph
```

要求：

- [ ] `translate.text(text, opts)` → `{ ok, text, error }`
- [ ] 支持 `url/model/dict` 覆盖
- [ ] 超时（默认 90s）与取消
- [ ] 失败返回空译文，不抛到 UI
- [ ] 不在主线程长时间阻塞：先 `busy` 状态，后续可换后台进程/FIFO
- [ ] 临时文件落在 `$XDG_RUNTIME_DIR` 或 `/tmp/opencode`，用完删除

### 2.3 对外 API（P0 验收）

```json
{"cmd":"call","fn":"translate.text","args":{"text":"hello","url":"..."}}
{"cmd":"call","fn":"vocab.lookup","args":{"word":"abandon"}}
```

Agent/CLI：

```bash
reader-agent translate "hello world"
reader-agent lookup abandon
```

验收：

- [ ] 本机 llama-server 或 DeepSeek 可用时，能返回中文
- [ ] 服务不可用时返回清晰错误，不崩溃
- [ ] Agent 与 UI 使用同一个适配层

### 2.4 打包策略（后续）

- 开发期：`READER_STATICPY_ROOT=/opt/WordCard/native/staticpy`
- 发布期：只打包实际用到的二进制 + 依赖 `.so` + 词表
- 模型不打包；通过 `WC_LLM_URL` 连接本地 llama-server
- 明确许可证：StaticPy 产物、词典、模型各自独立

---

## 3. P1：生词与 SM-2（从 0 实现）

### 3.1 数据结构

```lua
vocab = {
  ["word|book"] = {
    word = "abandon",
    lemma = "abandon",
    phonetic = "",
    definition = "",
    sentence = "",          -- 原文上下文
    book = "/path/book.epub",
    page = 12,
    created = 0,
    updated = 0,
    due = 0,                -- unix 秒
    interval = 1,           -- 天
    ease = 2.5,
    reps = 0,
    lapses = 0,
    status = "new",         -- new/learning/review/mastered
  }
}
```

存储：

- [ ] `~/.local/share/native-reader/vocab.lua`（原子写入，复用 `ui/store.lua` 风格）
- [ ] 不塞进现有 `state.lua`，避免阅读进度和词库互相影响

### 3.2 SM-2（自己写）

规则：

- [ ] quality 0–5；`quality < 3` 视为忘记
- [ ] 首次记住：interval = 1 天；第二次 = 6 天；之后 `interval * ease`
- [ ] 忘记：reps=0，interval=1，lapses+1
- [ ] `ease = ease + (0.1 - (5-q)*(0.08 + (5-q)*0.02))`，下限 1.3
- [ ] `due = now + interval*86400`
- [ ] 连续 reps≥5 且 interval≥21 天 → mastered

单元测试：

- [ ] 固定输入序列，断言 interval/ease/due
- [ ] 不依赖时间：注入 `now`
- [ ] 不依赖 WordCard 实现

### 3.3 API

```text
vocab.add {word,definition,sentence,book,page}
vocab.lookup {word}
vocab.due {limit}
vocab.review {word|id, quality}
vocab.stats
vocab.remove {word|id}
```

- [ ] Agent 方法：`addWord/lookupWord/dueWords/reviewWord/vocabStats/removeWord`
- [ ] CLI：`reader-agent vocab.add ...` 等
- [ ] 先无 UI，用 API 测试闭环

---

## 4. P2：阅读页交互

### 4.1 选词

- [ ] 单击词：选中并显示释义/翻译浮层
- [ ] 拖选/双词短语：先支持单词，短语后置
- [ ] 键盘：`V` 查词、`Ctrl+Enter` 加入生词
- [ ] 仅对文本来源（EPUB/MOBI/AZW3/TXT）启用；PDF 扫描版后置

### 4.2 翻译

- [ ] 段落“译”按钮 → 下方插入译文
- [ ] 按需翻译，不预翻译整章
- [ ] loading/失败/重试
- [ ] 双语模式可开关

### 4.3 生词面板

- [ ] 当前书生词
- [ ] 到期复习队列
- [ ] 0–5 评分
- [ ] 删除/重置
- [ ] 全部走 SDL 面板，不引入新 UI 框架

---

## 5. P3：性能、测试、发布

- [ ] 翻译进程异步化，避免阻塞 SDL 主循环
- [ ] 查词结果缓存（word+dict）
- [ ] 翻译缓存（段落 hash）
- [ ] `tools/auto_vocab.lua`：SM-2 + 假翻译服务回归
- [ ] `tools/test.sh` 纳入词汇/翻译测试
- [ ] 打包：`wc_translate`/`wc_define` + 依赖 + 词表；模型外置
- [ ] AGENTS.md 增补“词汇/翻译”对外 API

---

## 6. 实施顺序（严格按此推进）

1. [ ] `lua/core/staticpy.lua` + `lua/core/translate.lua`
2. [ ] `reader-agent translate` / `lookup` + 假服务测试
3. [ ] `lua/core/sm2.lua` + 单元测试
4. [ ] `lua/core/vocab.lua` + 存储 + Agent API
5. [ ] 阅读页查词/翻译弹窗
6. [ ] 生词面板 + 复习队列
7. [ ] 双语段落模式
8. [ ] 缓存、异步、打包、文档

---

## 7. 风险

- **本地模型依赖**：没有 llama-server/网络时翻译不可用，必须有清晰降级。
- **阻塞**：`wc_translate` 是同步 HTTP 调用，先 busy 状态，后续进程化。
- **许可证**：StaticPy 二进制、词典、模型分别确认。
- **PDF 选词**：PDF 文本层可做；扫描版需要 OCR，首期不做。
- **数据迁移**：不迁移 WordCard 数据；从空词库开始。
