#!/usr/bin/env bash
# 本地/CI 回归：Xvfb + 独立数据目录，不碰当前桌面会话。
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
BUILD="$ROOT/build"
LUAJIT="${LUAJIT:-$ROOT/third_party/luajit/src/luajit}"
DISPLAY_NUM="${READER_TEST_DISPLAY:-:101}"
TMP="$(mktemp -d /tmp/reader-test.XXXXXX)"
SOCK="$TMP/reader.sock"
APP_PID=""
XVFB_PID=""
OB_PID=""

cleanup() {
    if [ -n "$APP_PID" ]; then kill "$APP_PID" 2>/dev/null || true; fi
    if [ -n "$OB_PID" ]; then kill "$OB_PID" 2>/dev/null || true; fi
    if [ -n "$XVFB_PID" ]; then kill "$XVFB_PID" 2>/dev/null || true; fi
    rm -rf "$TMP"
}
trap cleanup EXIT

[ -x "$BUILD/native-reader" ] || "$ROOT/tools/build.sh"

if [ -f "/tmp/.X${DISPLAY_NUM#:}-lock" ]; then
    echo "display $DISPLAY_NUM already in use" >&2
    exit 1
fi
Xvfb "$DISPLAY_NUM" -screen 0 1600x1000x24 >"$TMP/xvfb.log" 2>&1 &
XVFB_PID=$!
sleep 1
if command -v openbox >/dev/null 2>&1; then
    DISPLAY="$DISPLAY_NUM" openbox >"$TMP/openbox.log" 2>&1 &
    OB_PID=$!
    sleep 1
fi

mkdir -p "$TMP/data"
(
    cd "$ROOT"
    DISPLAY="$DISPLAY_NUM" \
    XDG_DATA_HOME="$TMP/data" \
    READER_AUTOMATION_SOCK="$SOCK" \
    LD_LIBRARY_PATH="$ROOT/lib:/opt/mupdf/build/shared-release:${LD_LIBRARY_PATH:-}" \
    "$BUILD/native-reader" >"$TMP/app.log" 2>&1
) &
APP_PID=$!
sleep 3
if [ ! -S "$SOCK" ]; then
    echo "app failed to start; log:" >&2
    cat "$TMP/app.log" >&2 || true
    exit 1
fi

export READER_ROOT="$ROOT"
export READER_AUTOMATION_SOCK="$SOCK"
export LUA_PATH="$ROOT/automation/?.lua;$ROOT/lua/?.lua;$ROOT/lua/?/init.lua;;"
export LUA_CPATH="$ROOT/third_party/cjson/lua/5.1/?.so;;"

echo "== core =="
"$LUAJIT" "$ROOT/tools/auto_core.lua"

echo "== agent =="
"$LUAJIT" "$ROOT/tools/auto_agent.lua"

echo "== smoke =="
"$LUAJIT" "$ROOT/tools/auto_smoke.lua"

echo "== done =="
