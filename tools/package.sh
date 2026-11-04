#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
BUILD="$ROOT/build"
DIST="$ROOT/dist/native-reader-linux-x64"

rm -rf "$DIST"
mkdir -p "$DIST/lib" "$DIST/lua" "$DIST/assets" "$DIST/testdata"

cp "$BUILD/native-reader" "$DIST/"
cp "$BUILD/libreader_native.so" "$BUILD/libreader_ctl.so" "$DIST/lib/"
cp -r "$ROOT/lua/." "$DIST/lua/"
cp -r "$ROOT/assets/." "$DIST/assets/"
cp "$ROOT/testdata/sample.txt" "$DIST/testdata/"
cp -r "$ROOT/automation" "$DIST/automation"
cp "$ROOT/tools/run.sh" "$DIST/run.sh"

chmod +x "$DIST/native-reader" "$DIST/run.sh"
tar -C "$ROOT/dist" -czf "$ROOT/dist/native-reader-linux-x64.tar.gz" native-reader-linux-x64

echo "package: $ROOT/dist/native-reader-linux-x64.tar.gz"
