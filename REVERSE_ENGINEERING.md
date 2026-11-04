# 极空间 APK 逆向与去壳记录

> 目标样本：`com.zentraedi.zspace`，versionName `2.5.653`，versionCode `465`，`arm64-v8a`，`minSdk 23`，`targetSdk 35`。
>
> 目的：研究其阅读器（TXT / EPUB / PDF / MOBI / AZW3 / 漫画）的实现方式。
>
> **声明**：本文仅记录对自有设备和自有样本的逆向学习过程。请勿用于侵犯版权、绕过付费/DRM、传播修改版或任何未授权用途。

---

## 1. 环境与工具

### 1.1 环境

| 项目 | 说明 |
|---|---|
| 主机 | Linux x86_64，X11（`DISPLAY=:0`） |
| 手机 | Redmi `24094RAD4C`，HyperOS `V816`，Android 15 |
| 容器 | waydroid x86_64 + libhoudini（支持 `arm64-v8a` 翻译） |
| 目标 ABI | `arm64-v8a` |

### 1.2 工具清单

| 工具 | 用途 |
|---|---|
| `adb` | 设备连接、安装、日志、截图、文件传输 |
| `apktool` | 解包 APK，解码 `AndroidManifest.xml` 与 `res/` |
| `jadx` | dex → Java 反编译 |
| `frida` / `frida-tools` | 动态注入、脚本控制 |
| `frida-server` | waydroid 容器内 root 注入服务 |
| `frida-dexdump` | 从进程内存 dump dex |
| `apksigner` | APK 签名/验签 |
| `zipalign` | 对齐（`resources.arsc` / so） |
| `d8` | class → dex |
| `javac` / `keytool` | 编译壳入口、生成调试签名 |
| `openssl` | 从 v1 签名块提取原始证书 |
| `Python` | 修 dex checksum/signature、辅助脚本、socket 监听 |
| `zip` / `unzip` | APK 内条目增删 |
| `readelf` | 查看 `.so` 的 `DT_NEEDED` 依赖 |
| `strings` | 从 dex/so 提取类名、JNI 符号、路径 |
| `dexdump` / `apkanalyzer` | dex 结构、包/类/方法检查 |
| `waydroid` | 带 root 的 Android 容器 |
| `weston` | 无头 Wayland 合成器（waydroid 依赖） |
| `tmux` | 保持长任务/监听器 |
| `tmux` / `setsid` | 后台持久进程 |

---

## 2. 初始侦察

```bash
adb devices -l
adb shell pm list packages | grep -iE "zspace|zsp|space"
# package:com.zentraedi.zspace

adb shell pm path com.zentraedi.zspace
# /data/app/.../base.apk

adb shell dumpsys package com.zentraedi.zspace | grep -E "versionName|versionCode|primaryCpuAbi"
# versionCode=465 versionName=2.5.653 primaryCpuAbi=arm64-v8a

adb pull /data/app/.../base.apk base.apk
```

拿到 APK 后先看包结构：

```bash
unzip -l base.apk | awk '{print $4}' | grep -E '^lib/|\.dex$|^assets/'
```

关键发现：

- 只有 `classes.dex` 一个 dex；
- `assets/.jgapp`、`assets/libjiagu_a64.so`、`assets/libjiagu_x64.so`；
- `assets/reader/` 下有一批阅读器原生库和 Office 资源包。

---

## 3. 壳识别：360 加固

### 3.1 特征

| 特征 | 值 |
|---|---|
| Application | `com.stub.StubApp` |
| 壳库 | `assets/libjiagu_a64.so` |
| 壳标记 | `assets/.jgapp`（16 字节 ASCII） |
| 主 dex | 40MB，但 `class_defs_size=4`、`string_ids_size=872` |
| 熵 | 头部之后接近 8.0（加密数据） |

`classes.dex` 头部正常，但绝大部分是加密 payload，真正的业务代码在运行时由 `libjiagu` 解密到内存。

### 3.2 libjiagu 关键字符串

```bash
strings assets/libjiagu_a64.so | grep -iE "getPackageInfo|GET_SIGNATURES|META-INF|signature|MessageDigest|CertificateFactory|ptrace|/proc/self/maps"
```

可以看到：

- `android/content/pm/PackageManager`、`getPackageInfo`、`GET_SIGNATURES`
- `java/security/MessageDigest`、`CertificateFactory`
- `META-INF/*`、`META-INF/MANIFEST.MF`
- `ptrace`、`/proc/self/maps`

结论：`libjiagu` 在 `JNI_OnLoad` 里做签名/完整性/反调试检查，签名不匹配就返回 `JNI_ERR`：

```text
java.lang.UnsatisfiedLinkError: JNI_ERR returned from JNI_OnLoad
    at com.stub.StubApp.attachBaseContext(SourceFile:198)
```

---

## 4. 静态可见的阅读器架构

壳只加密代码，资源和 `AndroidManifest.xml` 仍是明文（apktool 可解）。

### 4.1 阅读相关 Activity

```xml
com.zentraedi.outreader.v2.activity.NewZReaderActivity
com.zentraedi.outreader.activity.ZReaderActivity
com.zentraedi.outreader.activity.ReaderSettingActivity
com.zentraedi.outreader.activity.LocalTxtActivity
com.zentraedi.business.reader.ReaderActivity
com.zentraedi.comic.activity.ComicReaderActivity
com.zentraedi.zs_business.baiduMap.read.CnReaderActivity
```

### 4.2 阅读器自定义 View

从布局 XML 中提取（无需 dex）：

```text
com.zentraedi.reader.reader.PageView
com.zentraedi.reader.NovelViewPager
com.zentraedi.reader.NovelRecycleView
com.zentraedi.reader.NovelTextView
com.zentraedi.reader.pdf.MuPdfPageView
com.zentraedi.reader.view.PdfPhotoView
com.zentraedi.outreader.view.SliderViewPager
com.zentraedi.outreader.widget.TypeFaceTextView
```

### 4.3 原生库与格式引擎映射

| 原生库 | 作用 |
|---|---|
| `libPDFNetC.so` | PDFTron / Apryse 11.0（PDF 解析/渲染） |
| `assets/reader/libmttpdfcore.so` | Tencent PDFium 核心 |
| `assets/reader/libmttpdfjni.so` | `com.tencent.pdfium` JNI |
| `libzspace-mobi.so` | 基于 libmobi，MOBI/AZW3 → EPUB |
| `assets/reader/libchmlib.so` | CHM 解析（`com.ChmReader`） |
| `assets/reader/libdrawingEngine.so` | DWG/CAD 绘制 |
| `assets/reader/docxRes.apk` / `excelRes.apk` / `pptxRes.apk` | Office 文档资源包 |
| `libzrpc.so` | NAS 文件访问 RPC |
| `libc++_shared.so` | C++ 运行库依赖 |

除此之外，Java 层用到了：

- **Readium 2**：`org.readium.r2.*`（EPUB）
- **MuPDF**：`com.artifex.mupdf.fitz.*`（PDF/EPUB 渲染、目录）
- **Kotlin Coroutines / AndroidX / Retrofit / OkHttp / Glide**

---

## 5. 路线 A：Frida Gadget 重打包（手机侧，未完全成功）

思路：不动壳的加密 dex，只在壳加载前注入 Frida Gadget。

### 5.1 注入点

原 APK 的 `AndroidManifest.xml`：

```xml
<application
    android:name="com.stub.StubApp"
    android:appComponentFactory="androidx.core.app.CoreComponentFactory" ...>
```

构造一个 `classes2.dex`，把 `androidx.core.app.CoreComponentFactory` 替换成自己的实现：

```java
package androidx.core.app;

public class CoreComponentFactory extends AppComponentFactory {
    @Override
    public Application instantiateApplication(ClassLoader cl, String className) {
        System.loadLibrary("gadget");
        return super.instantiateApplication(cl, className);
    }
}
```

这样框架在实例化 `StubApp` 之前就会加载 `libgadget.so`。

### 5.2 Gadget 配置

```json
{
  "interaction": { "type": "listen", "address": "127.0.0.1", "port": 27042, "on_load": "wait" },
  "runtime": "v8"
}
```

配置文件必须与 `libgadget.so` 同目录，命名为 `libgadget.config.so`。

### 5.3 遇到的问题

1. **MIUI / HyperOS 的 USB 安装确认**
   - `pm install --user 10` 会触发 `com.miui.securitycenter/com.miui.permcenter.install.AdbInstallActivity`；
   - 该 Activity 只在 **user 0 前台** 才能显示；
   - 切到副用户安装时弹窗无法显示，超时后报：
     `INSTALL_FAILED_USER_RESTRICTED: Install canceled by user`。
   - 解决：切回 user 0、解锁，用 `input tap` 点“继续安装”。

2. **Gadget 运行时**
   - 默认 QJS 运行时没有 Java bridge（`Java is not defined`）；
   - 需要 `"runtime": "v8"`，并把脚本放进 APK 的 `lib/arm64-v8a/`，用相对路径 `"path": "libhook.so"` 自动加载（gadget 会以 `.so` 所在目录解析相对路径）。

3. **360 签名校验**
   - 重打包后 `libjiagu` 的 `JNI_OnLoad` 仍返回 `JNI_ERR`；
   - 尝试在 Java 层 hook `ApplicationPackageManager.getPackageInfo` 返回原始证书（证书 DER 从 `META-INF/ZENTRAED.RSA` 用 `openssl pkcs7` 提取）；
   - 但 Gadget 脚本加载与 `libjiagu` 的加载存在时序竞争，且壳还会检查 `META-INF` / `/proc/self/maps`；
   - 结论：手机侧重打包路线成本高、稳定性差。

---

## 6. 路线 B：waydroid 脱壳（成功）

### 6.1 为什么可行

- waydroid 是带 root 的 Android 容器；
- 安装 **原始未改签名 APK**，360 的签名校验自然通过；
- 容器内 root 可运行 `frida-server`，不需要重打包；
- ABI 列表包含 `arm64-v8a`（libhoudini 翻译）。

### 6.2 启动

```bash
# 无头 Wayland
XDG_RUNTIME_DIR=/run/user/1000 weston \
  --backend=headless-backend.so --socket=wayland-0 --idle-time=0

# 启动 waydroid
XDG_RUNTIME_DIR=/run/user/1000 WAYLAND_DISPLAY=wayland-0 waydroid session start

waydroid status
# Session: RUNNING
# Container: RUNNING
# IP address: 192.168.240.112
```

### 6.3 安装原版 APK

```bash
waydroid app install base.apk
sudo waydroid shell -- am start -n com.zentraedi.zspace/com.zentraedi.zspace.activity.SplashActivity
```

日志确认壳正常启动：

```text
naslog: SDK(init) ...
zrpc init ...
Displayed com.zentraedi.zspace/.activity.SplashActivity: +582ms
```

### 6.4 运行 frida-server

```bash
# 下载 x86_64 版（与容器内核架构一致）
curl -L -o frida-server.xz \
  https://github.com/frida/frida/releases/download/17.25.2/frida-server-17.25.2-android-x86_64.xz
xz -dkf frida-server.xz

# 通过 stdin 推进容器（宿主机有 root）
cat frida-server | sudo waydroid shell -- sh -c 'cat > /data/local/tmp/frida-server'
sudo waydroid shell -- chmod 755 /data/local/tmp/frida-server
sudo waydroid shell -- sh -c 'nohup /data/local/tmp/frida-server -l 0.0.0.0:27042 >/data/local/tmp/fs.log 2>&1 &'

frida-ps -H 192.168.240.112:27042
```

### 6.5 dump dex

```bash
frida-ps -H 192.168.240.112:27042 | grep zspace
frida-dexdump -H 192.168.240.112:27042 -p <pid> -o dump/
```

得到 72 个 dex。其中：

- `classes02.dex` ~ `classes44.dex` 是应用 + 依赖库；
- `classes45.dex` ~ `classes72.dex` 多为系统 boot dex；
- `classes.dex` 是壳的残留结构（33KB，可排除）。

### 6.6 修 dex checksum / signature

`frida-dexdump` 输出的 dex 常常 checksum 不对，jadx/ART 会拒绝：

```text
Bad dex file checksum: 0xbb5963a7, expected: 0xa5161a4b
```

修复脚本：

```python
import struct, zlib, hashlib

def fix(path):
    d = bytearray(open(path, "rb").read())
    if d[:4] != b"dex\n":
        return False
    d[12:32] = hashlib.sha1(d[32:]).digest()
    d[8:12] = struct.pack("<I", zlib.adler32(bytes(d[12:])) & 0xffffffff)
    open(path, "wb").write(d)
    return True
```

修复后再用 jadx 反编译：

```bash
jadx -d jadx_out --no-res -j 4 classes02.dex ... classes44.dex
```

---

## 7. 阅读器关键代码

### 7.1 格式判定

`com.zentraedi.outreader.responsemodel.BookModel.getBookFileType()`（BookModel.java:170）：

```java
if (str.endsWith(".pdf"))  return "pdf";
if (str.endsWith(".epub")) return "epub";
if (str.endsWith(".mobi")) return "mobi";
if (str.endsWith(".azw3")) return "azw3";
return "txt";
```

常量定义在 `com.zbooklibrary.constant.a`：

```java
h = "mobi"; i = "epub"; j = "txt"; k = "pdf"; l = "azw3";
```

### 7.2 PDF

**主路径：PDFTron / Apryse**

`com.zentraedi.outreader.reader.PDFTronZReader`：

```java
com.zentraedi.zspace.pdftron.c.a(context);       // 初始化
this.g = new PDFDoc(new FileInputStream(file));   // 打开
Boolean sec = doc.w4();                           // 加密
int count = doc.a3();                             // 页数
Bookmark outline = doc.H2();                      // 目录
```

**MuPDF 渲染路径**

`com.zentraedi.reader.adapter.PdfBitmapLoader`（PdfBitmapLoader.java:93）：

```java
Page page = doc.loadPage(pageNo);
Matrix m = AndroidDrawDevice.fitPage(page, w, h);
Pixmap pix = page.toPixmap(m, ColorSpace.DeviceBGR, true, true);
```

`com.zentraedi.reader.pdf.MuPdfPageView` 也是 `com.artifex.mupdf.fitz.*`。

**PDFium**

`com.tencent.pdfium` + `libmttpdfcore.so` / `libmttpdfjni.so`，主要用于部分 PDF/注解场景。

### 7.3 EPUB

Readium 2 管线，核心在 `com.zentraedi.reader.readium.Readium`（d.java:108）：

```java
AssetRetriever retriever = new AssetRetriever(contentResolver, httpClient);
PublicationOpener opener = new PublicationOpener(
    new DefaultPublicationParser(context, httpClient, retriever, null, null, 16, null),
    null, null, 6, null);

Asset asset = retriever.retrieve(file, new FormatHints(...));
Publication pub = opener.open(asset);
```

`com.zentraedi.outreader.reader.EpubReadiumZReader` 校验：

```java
pub.conformsTo(Publication.Profile.EPUB) ||
LinkKt.getAllAreHtml(pub.getReadingOrder())
```

然后用 `EpubNavigatorFragment` + `EpubPreferences` 渲染。

本地 EPUB 解包/拆分：

- `com.zentraedi.outreader.local.localepub.b`：读 `META-INF/container.xml`，用 Apache Commons Compress 处理 zip；
- `EpubSplitUtil`：大 EPUB 拆分。

### 7.4 MOBI / AZW3

不直接解析，先转 EPUB。

`MobiUtilBusiness.isMobi()`（MobiUtilBusiness.java:260）：

```java
return str.endsWith(".mobi", true) || str.endsWith(".azw3", true);
```

转换（MobiUtilBusiness.java:70）：

```java
// 在线：优先让 NAS 服务端转好，下载 application/epub+zip
if (!offline && convertToEpubByNasSync(epubPath, nasFilePath)) return epubPath;

// 本地：JNI 调 libmobi
ZspaceMobiJni.mobiDebug(false);
int ret = ZspaceMobiJni.convertToEpub(mobiPath, epubPath);
```

JNI 封装（ZspaceMobiJni.java）：

```java
static { System.loadLibrary("zspace-mobi"); }

static native String bookInfo(String mobiPath);
static native int    convertToEpub(String mobiPath, String targetFile);
static native void   mobiDebug(boolean debug);
```

`libzspace-mobi.so` 基于 libmobi：解析 PalmDB、MOBI header、EXTH、PalmDOC/HUFF-CDIC 压缩、图片/字体资源，输出标准 EPUB。

转换后（local/d.java:426）：

```java
String epubPath = MobiUtilBusiness.INSTANCE.convertToEpub(mobiPath, null, nasPath);
if (!isSupport) epubPath = EpubSplitUtil.split(...);
Document doc = Document.openDocument(epubPath);   // MuPDF 打开 EPUB
doc.layout(width, height - 80f, 50f);
List<Chapter> chapters = com.zentraedi.reader.pdf.e.a(doc);
```

### 7.5 点右侧翻页

`com.zentraedi.reader.reader.PageView`：

- `onSizeChanged`：`v = 宽`、`w = 高`、`A = 宽 / 3`；
- 触摸回调 `g.onTouchEvent`（PageView.java:402）：
  - `ACTION_DOWN` 记录 `d0 = x`、`e0 = y`；
  - `ACTION_UP` 未滑动时：
    - `m1(x, y)` 命中左侧 → `P1()`（上一页）
    - `l1(x, y)` 命中右侧 → `v1()`（下一页）

区域判定（PageView.java:1592 / 1575）：

```java
// 左：上一页
boolean m1(int x, int y) {
    int w = this.v, m = this.A;              // m = 宽/3
    if (x < (w - m) / 2) return true;        // 左 1/3
    return x < (w + m) / 2 && y < (this.w - this.B) / 2;
}

// 右：下一页
boolean l1(int x, int y) {
    int w = this.v, m = this.A;
    if (x > (w + m) / 2) return true;        // 右 1/3
    return x > (w - m) / 2 && y > (this.w + this.B) / 2;
}
```

翻页动作：

- `v1()`（PageView.java:2774）：翻下一页，章节末调 `R1()` 进下一章，否则 `getPageFlipView().a()`；
- `P1()`（PageView.java:1833）：翻上一页，`getPageFlipView().b()`。

---

## 8. 去壳重打包（产出可运行 APK）

目标：不依赖 360 壳，把 dump 出的真实 dex 放回 APK，保留原始资源和 so，使 APK 可直接安装运行。

### 8.1 真实 Application

dump 出的 dex 中检索到：

```text
com.zentraedi.zspace.NasApplication
```

它继承 `com.zentraedi.zspace.f`（Hilt 生成的基类），不是 `final`，可以继承。

### 8.2 同名壳入口

原 manifest 的 `android:name` 是 `com.stub.StubApp`，不修改 manifest，直接提供同名类：

```java
package com.stub;

public class StubApp extends com.zentraedi.zspace.NasApplication {
}
```

用 `javac` + `d8` 编译成 `classes.dex`（只包含 `StubApp`，`NasApplication` 仅作为编译期 classpath）。

### 8.3 组装 APK

1. 以原 `base.apk` 为底，删除 360 的 `classes.dex`；
2. 加入新的 `classes.dex`（StubApp）；
3. 加入 43 个真实 dex：`classes2.dex` ~ `classes44.dex`；
4. 保留原 `resources.arsc`、`res/`、`assets/`、`lib/`；
5. `zipalign -f -p 4` 对齐；
6. `apksigner` 用调试证书重新签名。

### 8.4 踩过的坑

| 问题 | 原因 | 解决 |
|---|---|---|
| `Targeting R+ requires resources.arsc ... aligned` | 重新 zip 后 `resources.arsc` 偏移不对 | `zipalign -f -p 4` |
| `Bad checksum ... classes2.dex` | frida-dexdump 的 dex checksum 未重算 | 批量修 Adler32 + SHA-1 |
| `ClassNotFoundException: com.stub.StubApp` | `classes2.dex` 被 ART 拒绝，导致 `NasApplication` 找不到 | 修完所有 dex checksum |
| `ClassNotFoundException: androidx.core.app.CoreComponentFactory` | 该工厂类不在当前 dex 可见路径 | 框架会回退默认实现，不影响启动 |
| 签名冲突 | 调试签名 ≠ 官方签名 | 卸载官方版，或装到副用户/工作资料 |

### 8.5 验证

在 waydroid 安装并启动：

```bash
cat out/zspace-reader.apk | sudo waydroid shell -- sh -c 'cat > /data/local/tmp/zs.apk'
sudo waydroid shell -- pm install /data/local/tmp/zs.apk
sudo waydroid shell -- am start -n com.zentraedi.zspace/com.zentraedi.zspace.activity.SplashActivity
```

日志确认：

```text
naslog: SDK(init) ...
zrpc init ...
Displayed com.zentraedi.zspace/.activity.SplashActivity: +582ms
```

进程存活，无 `JNI_ERR`，说明去壳成功。

---

## 9. 产物与复现

### 9.1 项目结构

```text
reader/
├── build-apk.sh                  # 入口，调用 tools/build-apk.sh
├── tools/
│   ├── build-apk.sh              # 去壳重打包脚本
│   ├── fixdex.py                 # 修 dex checksum / SHA-1
│   ├── frida/
│   │   ├── hook_sig.js           # PackageManager 签名 hook
│   │   ├── libhook.js            # gadget 自动加载 + socket 回传
│   │   ├── diag.js               # runtime / Java 环境诊断
│   │   ├── driver.py             # attach / load / resume 驱动
│   │   └── listener.py           # 宿主机 TCP 监听（adb reverse）
│   ├── gadget/
│   │   └── CoreComponentFactory.java  # appComponentFactory 注入
│   └── stub/
│       ├── StubApp.java          # 同名壳入口
│       └── NasApplication.java   # 编译期占位类
├── out/zspace-reader.apk         # 可直接安装的 APK
├── reference/
│   ├── base/base.apk             # 原始加固 APK
│   ├── app_dex/classes2..44.dex  # dump 出的真实 dex（已修 checksum）
│   ├── stub/classes.dex          # StubApp 入口
│   ├── stub/src/...              # StubApp 源码
│   └── debug.keystore            # 调试签名
├── app/src/main/                 # 反编译阅读器源码（浏览用）
├── app/src/main/jniLibs/         # 阅读器 so
├── app/src/main/assets/reader/   # Office/DWG 资源
├── app/src/main/res/             # 反编译资源
├── reference/dex/                # 阅读器相关 dex（classes06/11/26/29/32）
└── REVERSE_ENGINEERING.md        # 本文
```

### 9.2 重新打包

```bash
cd ~/Desktop/reader
./build-apk.sh
# 或：tools/build-apk.sh
# 输出：out/zspace-reader.apk
```

### 9.3 安装

- PC：`~/Desktop/reader/out/zspace-reader.apk`
- 手机：`/sdcard/Download/zspace-reader.apk`

注意：

- 包名/版本与原版一致：`com.zentraedi.zspace` / `2.5.653`；
- 调试签名与官方不同，**不能覆盖安装**；
- 先卸载官方极空间（会丢登录/数据），或安装到副用户/工作资料。

### 9.4 工具脚本

| 脚本 | 用途 |
|---|---|
| `tools/fixdex.py` | 批量修 dex 的 Adler32 checksum 和 SHA-1 signature |
| `tools/frida/hook_sig.js` | hook `ApplicationPackageManager.getPackageInfo`，返回原始证书 |
| `tools/frida/libhook.js` | Gadget 自动加载脚本：PackageManager hook + socket 回传 |
| `tools/frida/diag.js` | 输出 `Script.runtime`、`typeof Java` 等诊断信息 |
| `tools/frida/driver.py` | attach gadget、加载脚本、resume |
| `tools/frida/listener.py` | 宿主机 TCP 监听，配合 `adb reverse` 收数据 |
| `tools/gadget/CoreComponentFactory.java` | 替换 `appComponentFactory`，在 `StubApp` 前加载 gadget |
| `tools/stub/StubApp.java` | 同名壳入口，继承真实 `NasApplication` |
| `tools/stub/NasApplication.java` | 编译期占位类（不打包） |
| `tools/build-apk.sh` | 去壳重打包，输出 `out/zspace-reader.apk` |

示例：

```bash
python3 tools/fixdex.py dump/*.dex
python3 tools/frida/driver.py tools/frida/hook_sig.js 20
cd ~/Desktop/reader && ./build-apk.sh
```

---

## 10. 关键命令速查

```bash
# 侦察
adb shell pm list packages | grep zspace
adb shell pm path com.zentraedi.zspace
adb pull /data/app/.../base.apk base.apk

# 解包/反编译
apktool d -f -s -o decoded base.apk
jadx -d jadx_out --no-res -j 4 classes*.dex

# 修 dex
python3 fixdex.py classes*.dex

# waydroid
XDG_RUNTIME_DIR=/run/user/1000 weston --backend=headless-backend.so --socket=wayland-0 --idle-time=0
XDG_RUNTIME_DIR=/run/user/1000 WAYLAND_DISPLAY=wayland-0 waydroid session start
waydroid app install base.apk
sudo waydroid shell -- am start -n com.zentraedi.zspace/com.zentraedi.zspace.activity.SplashActivity

# frida-server + dump
cat frida-server | sudo waydroid shell -- sh -c 'cat > /data/local/tmp/frida-server'
sudo waydroid shell -- chmod 755 /data/local/tmp/frida-server
sudo waydroid shell -- sh -c 'nohup /data/local/tmp/frida-server -l 0.0.0.0:27042 &'
frida-dexdump -H 192.168.240.112:27042 -p <pid> -o dump/

# 去壳重打包（根目录入口）
./build-apk.sh
# 或直接调用工具脚本
tools/build-apk.sh
```

---

## 11. 经验与风险

1. **360 加固的核心是签名/完整性校验**：重打包后 `libjiagu` 的 `JNI_OnLoad` 会返回 `JNI_ERR`。最稳的脱壳方式是“原签名运行 + 内存 dump”，而不是硬碰签名校验。
2. **MIUI/HyperOS 的 USB 安装限制**：`AdbInstallActivity` 只在 user 0 前台弹出，切用户安装会超时失败。
3. **Frida Gadget 运行时**：默认 QJS 没有 Java bridge，需要 V8；相对脚本路径以 gadget 所在目录解析。
4. **frida-dexdump 的 dex 需要修 checksum**：否则 ART/jadx 会拒绝。
5. **资源 ID 不要重编**：反编译代码引用的是原始 `resources.arsc` 的硬编码 ID；保留原 `resources.arsc` 是去壳包能跑的关键。
6. **法律风险**：修改版 APK 不要传播、不要商用；仅用于自有设备/授权研究。官方 App 的数据、账号、版权内容请遵守其服务条款。
