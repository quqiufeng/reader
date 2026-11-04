# reader

极空间（`com.zentraedi.zspace` 2.5.653）阅读器逆向工程记录、可浏览的反编译源码，以及可复现的去壳重打包脚本。

> 仅用于个人学习 / 自有设备研究。仓库中的反编译代码、资源、so、dex 版权归原厂所有，请勿传播或商用。

## native-reader（桌面实现）

基于 `native_reader.md` 的 LuaJIT FFI + C 桌面阅读器，支持 PDF / EPUB / MOBI / AZW3 / TXT，带书库、目录、进度、书签、设置、书内搜索和自动化测试。

```bash
./tools/build.sh                    # 编译
./tools/run.sh                      # 打开书库
./tools/run.sh testdata/sample.txt  # 直接打开一本书
READER_LIBRARY=/path/to/books ./tools/run.sh
./tools/package.sh                  # 打包
./tools/install.sh                  # 安装到 ~/.local（含桌面图标）
# 产物：dist/native-reader-linux-x64.tar.gz
```

安装后会创建：

- `~/.local/bin/native-reader`
- `~/.local/share/applications/native-reader.desktop`
- `~/.local/share/icons/hicolor/*/apps/native-reader.png`
- 图标使用 WordCard 的书本图标（`assets/icons/`）

- 书库默认扫描 `~/Books` / `~/Downloads/book`，可用 `READER_LIBRARY` 指定
- 阅读中 `Esc` 返回书库，`Q` 退出；`S` 设置，`T` 目录，`B` 书签，`/` 搜索

- 依赖：SDL2、LuaJIT、MuPDF、libmobi、libxml2、libzip、SDL2_ttf
- 自动化：`tools/auto_core.lua`（核心冒烟）、`tools/auto_smoke.lua`（UI 冒烟）
- 字体：仓耳今楷02（`assets/fonts/`）
- 设计 / 迁移：`native_reader.md`；开发规范：`AGENTS.md`

## 快速开始

### 构建去壳 APK

```bash
./build-apk.sh
# 输出：out/zspace-reader.apk
```

依赖：`zip`、`zipalign`、`apksigner`、`keytool`，以及 Android SDK build-tools（默认 `/opt/android-sdk/build-tools/34.0.0`，可用 `ANDROID_SDK_ROOT` 覆盖）。

### 安装

- 包名 / 版本与原版一致：`com.zentraedi.zspace` / `2.5.653`
- 使用调试签名，**不能覆盖官方版**；需先卸载官方极空间（会丢登录 / 数据），或装到副用户 / 工作资料
- 仅支持 `arm64-v8a`

## 项目结构

```text
reader/
├── build-apk.sh                  # 入口，调用 tools/build-apk.sh
├── tools/
│   ├── build-apk.sh              # 去壳重打包
│   ├── fixdex.py                 # 修 dex checksum / SHA-1
│   ├── frida/
│   │   ├── hook_sig.js           # PackageManager 签名 hook
│   │   ├── libhook.js            # Gadget 自动加载 + socket 回传
│   │   ├── diag.js               # runtime / Java 环境诊断
│   │   ├── driver.py             # attach / load / resume
│   │   └── listener.py           # 宿主机 TCP 监听
│   ├── gadget/
│   │   └── CoreComponentFactory.java
│   └── stub/
│       ├── StubApp.java          # 同名壳入口
│       └── NasApplication.java   # 编译期占位
├── out/                          # 构建产物（.gitignore）
├── reference/
│   ├── base/                     # 原始 APK（.gitignore）
│   ├── app_dex/                  # dump 出的真实 dex
│   ├── stub/                     # StubApp 入口
│   ├── dex/                      # 阅读器相关 dex
│   └── debug.keystore            # 调试签名（.gitignore）
├── app/src/main/                 # 反编译阅读器源码（浏览用）
│   ├── java/com/zentraedi/{reader,outreader,comic}
│   ├── java/com/zspace/mobi
│   ├── jniLibs/arm64-v8a/        # 阅读器原生库
│   ├── assets/reader/            # Office / DWG 资源
│   └── res/                      # 反编译资源
└── REVERSE_ENGINEERING.md        # 详细过程与工具
```

## 做了什么

1. **识别 360 加固**：`com.stub.StubApp`、`assets/libjiagu_a64.so`、加密的 40MB `classes.dex`
2. **静态分析**：从 manifest / 资源 / so 定位阅读器 Activity、`PageView`、PDFTron / PDFium / MuPDF / libmobi / Readium
3. **内存脱壳**：waydroid（root）+ 原签名 APK + `frida-server` + `frida-dexdump`，dump 出真实 dex
4. **修复 dex**：批量重算 Adler32 checksum / SHA-1
5. **jadx 反编译**：分析格式解析与翻页实现
6. **去壳重打包**：去掉 360 壳，保留原 `resources.arsc` / `res` / `assets` / `lib`，加入真实 dex 与同名 `com.stub.StubApp` 入口，重新签名

详细步骤、踩坑与命令见 [REVERSE_ENGINEERING.md](REVERSE_ENGINEERING.md)。

## 阅读器关键实现

| 格式 | 解析链路 |
|---|---|
| PDF | PDFTron / Apryse `PDFTronZReader`；MuPDF `PdfBitmapLoader`；Tencent PDFium |
| EPUB | Readium 2：`AssetRetriever` + `PublicationOpener` + `EpubNavigatorFragment` |
| MOBI / AZW3 | `MobiUtilBusiness` → `ZspaceMobiJni.convertToEpub`（libmobi）→ EPUB |
| TXT | 自定义 `PageView` 编码识别与分页 |
| 漫画 | `ComicEpubZReader` / `ComicReaderActivity` |

翻页入口：`com.zentraedi.reader.reader.PageView`

- 右侧 1/3（`l1`）→ `v1()` 下一页
- 左侧 1/3（`m1`）→ `P1()` 上一页
- 中间 1/3 按上下半区分别触发上一页 / 下一页

## 工具脚本

| 脚本 | 用途 |
|---|---|
| `tools/fixdex.py` | 批量修 dex checksum / SHA-1 |
| `tools/frida/hook_sig.js` | hook `PackageManager` 返回原始证书 |
| `tools/frida/libhook.js` | Gadget 自动加载 + socket 回传 |
| `tools/frida/diag.js` | runtime / Java 环境诊断 |
| `tools/frida/driver.py` | attach / load / resume |
| `tools/frida/listener.py` | 宿主机 TCP 监听 |
| `tools/gadget/CoreComponentFactory.java` | `appComponentFactory` 注入 |
| `tools/stub/StubApp.java` | 同名壳入口 |
| `tools/build-apk.sh` | 去壳重打包 |

## 注意

- 仓库不包含原始 `base.apk` 和构建出的 APK（`.gitignore` 已排除大文件）
- `app/src/main/jniLibs/arm64-v8a/libPDFNetC.so` 约 50.5MB，超过 GitHub 50MB 建议值；未超 100MB 硬限制。后续大文件建议使用 Git LFS
- 调试签名仅用于本地安装测试
- 反编译源码仅用于阅读分析，`app/` 模块不能直接编译运行
