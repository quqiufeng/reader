#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
DIST="$ROOT/dist/native-reader-linux-x64"
PREFIX="${HOME}/.local"
APP="$PREFIX/share/native-reader"

if [ ! -x "$DIST/native-reader" ]; then
    "$ROOT/tools/build.sh"
    "$ROOT/tools/package.sh"
fi

rm -rf "$APP"
mkdir -p "$APP" "$PREFIX/bin" "$PREFIX/share/applications"
cp -r "$DIST/." "$APP/"
chmod +x "$APP/native-reader" "$APP/run.sh"
ln -sf "$APP/run.sh" "$PREFIX/bin/native-reader"

for s in 256 128 64; do
    mkdir -p "$PREFIX/share/icons/hicolor/${s}x${s}/apps"
    cp "$APP/assets/icons/native-reader-${s}.png" \
       "$PREFIX/share/icons/hicolor/${s}x${s}/apps/native-reader.png"
done

cat > "$PREFIX/share/applications/native-reader.desktop" <<EOF
[Desktop Entry]
Type=Application
Name=Native Reader
Comment=Local ebook reader
Exec=$APP/run.sh %f
Icon=$APP/assets/icons/native-reader.png
Terminal=false
Categories=Office;Viewer;
MimeType=application/pdf;application/epub+zip;application/x-mobipocket-ebook;text/plain;
StartupWMClass=native-reader
EOF
chmod 644 "$PREFIX/share/applications/native-reader.desktop"

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
