#!/usr/bin/env bash
set -euo pipefail

SELF_DIR="$(cd "$(dirname "$0")" && pwd)"
if [ -x "$SELF_DIR/native-reader" ] && [ -d "$SELF_DIR/lib" ]; then
    DIST="$SELF_DIR"
    ROOT="$SELF_DIR"
else
    ROOT="$(cd "$SELF_DIR/.." && pwd)"
    DIST="$ROOT/dist/native-reader-linux-x64"
fi
PREFIX="${PREFIX:-${HOME}/.local}"
APP="$PREFIX/share/native-reader"

if [ ! -x "$DIST/native-reader" ]; then
    "$ROOT/tools/build.sh"
    "$ROOT/tools/package.sh"
fi

BK="$(mktemp -d)"
trap 'rm -rf "$BK"' EXIT
for f in settings.lua state.lua window.lua; do
    [ -f "$APP/$f" ] && cp "$APP/$f" "$BK/$f"
done

rm -rf "$APP"
mkdir -p "$APP" "$PREFIX/bin" "$PREFIX/share/applications"
cp -r "$DIST/." "$APP/"
for f in settings.lua state.lua window.lua; do
    [ -f "$BK/$f" ] && cp "$BK/$f" "$APP/$f"
done
chmod +x "$APP/native-reader" "$APP/run.sh" "$APP/launch.sh" "$APP/reader-agent" "$APP/reader-lua" "$APP/lib/luajit"

# 启动入口指向哪一份：
# - 在仓库里安装（存在 build/ + tools/launch.sh）：指向仓库，桌面/命令行启动
#   始终是最近一次 ./tools/build.sh 的产物，不会跑到安装快照上（AGENTS §3.1）。
# - 从 dist 安装（没有仓库）：指向安装目录，自成一体。
if [ -x "$ROOT/tools/launch.sh" ] && [ -x "$ROOT/build/native-reader" ]; then
    LAUNCH="$ROOT/tools/launch.sh"
    LAUNCH_ICON="$ROOT/assets/icons/native-reader.png"
else
    LAUNCH="$APP/launch.sh"
    LAUNCH_ICON="$APP/assets/icons/native-reader.png"
fi
ln -sf "$LAUNCH" "$PREFIX/bin/native-reader"
ln -sf "$APP/reader-agent" "$PREFIX/bin/reader-agent"
ln -sf "$APP/reader-lua" "$PREFIX/bin/reader-lua"

for s in 256 128 64; do
    mkdir -p "$PREFIX/share/icons/hicolor/${s}x${s}/apps"
    cp "$APP/assets/icons/native-reader-${s}.png" \
       "$PREFIX/share/icons/hicolor/${s}x${s}/apps/native-reader.png"
done

write_desktop() {
    local out="$1"
    cat > "$out" <<EOF
[Desktop Entry]
Type=Application
Version=1.0
Name=reader
GenericName=Ebook Reader
Comment=本地电子书阅读器
Exec=$LAUNCH %f
Icon=$LAUNCH_ICON
Terminal=false
Categories=Office;Viewer;
MimeType=application/pdf;application/epub+zip;application/x-mobipocket-ebook;text/plain;
StartupNotify=true
StartupWMClass=native-reader
EOF
    chmod 755 "$out"
    if command -v gio >/dev/null 2>&1; then
        gio set "$out" metadata::trusted true >/dev/null 2>&1 || true
    fi
}

write_desktop "$PREFIX/share/applications/native-reader.desktop"
if [ -d "$HOME/Desktop" ]; then
    write_desktop "$HOME/Desktop/native-reader.desktop"
fi

if command -v update-desktop-database >/dev/null 2>&1; then
    update-desktop-database "$PREFIX/share/applications" >/dev/null 2>&1 || true
fi
if command -v gtk-update-icon-cache >/dev/null 2>&1; then
    gtk-update-icon-cache -f -t "$PREFIX/share/icons/hicolor" >/dev/null 2>&1 || true
fi

echo "installed: $APP"
echo "command:   $PREFIX/bin/native-reader"
echo "desktop:   $PREFIX/share/applications/native-reader.desktop"
case ":$PATH:" in
    *":$PREFIX/bin:"*) ;;
    *) echo "note: add $PREFIX/bin to PATH to run 'native-reader'" ;;
esac
