#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
BUILD="$ROOT/build"
DIST="$ROOT/dist/native-reader-linux-x64"

rm -rf "$DIST"
mkdir -p "$DIST/lib" "$DIST/lua" "$DIST/assets" "$DIST/testdata" "$DIST/tools"

cp "$BUILD/native-reader" "$DIST/"
cp "$BUILD/libreader_native.so" "$BUILD/libreader_ctl.so" "$DIST/lib/"
cp -r "$ROOT/lua/." "$DIST/lua/"
cp -r "$ROOT/assets/." "$DIST/assets/"
cp "$ROOT/testdata/sample.txt" "$DIST/testdata/"
cp -r "$ROOT/automation" "$DIST/automation"
cp "$ROOT/tools/run.sh" "$DIST/run.sh"
cp "$ROOT/tools/launch.sh" "$DIST/launch.sh"
cp "$ROOT/tools/install.sh" "$DIST/install.sh"
cp "$ROOT/tools/reader-agent" "$DIST/reader-agent"
cp "$ROOT/tools/reader-lua" "$DIST/reader-lua"
cp "$ROOT/tools/agent_reader.lua" "$DIST/tools/agent_reader.lua"
cp "$ROOT/third_party/luajit/src/luajit" "$DIST/lib/luajit"
CJSON_SO="$ROOT/third_party/cjson/lua/5.1/cjson.so"
if [ ! -f "$CJSON_SO" ]; then
    CJSON_SO="$(luajit -e 'local p=package.cpath; for pat in p:gmatch("[^;]+") do local f=pat:gsub("%?", "cjson"); local h=io.open(f,"rb"); if h then h:close(); print(f); break end end' 2>/dev/null)"
fi
if [ -n "$CJSON_SO" ] && [ -f "$CJSON_SO" ]; then
    mkdir -p "$DIST/lib/lua/5.1"
    cp -L "$CJSON_SO" "$DIST/lib/lua/5.1/cjson.so"
fi
"$ROOT/tools/bundle_runtime.sh" "$DIST" "$BUILD"

chmod +x "$DIST/native-reader" "$DIST/run.sh" "$DIST/launch.sh" "$DIST/install.sh" "$DIST/reader-agent" "$DIST/reader-lua" "$DIST/lib/luajit"

# 去掉调试符号，缩减包体；保留动态符号。
if command -v strip >/dev/null 2>&1; then
    find "$DIST/lib" -maxdepth 1 -type f -name '*.so*' \
        -exec strip --strip-unneeded {} + 2>/dev/null || true
    find "$DIST/lib/lua" -type f -name '*.so' \
        -exec strip --strip-unneeded {} + 2>/dev/null || true
    strip --strip-debug "$DIST/native-reader" 2>/dev/null || true
    strip --strip-debug "$DIST/lib/libreader_native.so" \
        "$DIST/lib/libreader_ctl.so" 2>/dev/null || true
    strip --strip-debug "$DIST/lib/luajit" 2>/dev/null || true
fi
tar -C "$ROOT/dist" -czf "$ROOT/dist/native-reader-linux-x64.tar.gz" native-reader-linux-x64

echo "package: $ROOT/dist/native-reader-linux-x64.tar.gz"
