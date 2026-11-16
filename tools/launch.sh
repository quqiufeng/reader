#!/usr/bin/env bash
# launch.sh — 桌面图标入口：单实例、在图形会话内启动。
# 注意：本脚本可能通过软链（~/.local/bin/native-reader）被调用，
# 所以必须解析软链再定位 run.sh。
set -uo pipefail

SELF="$(readlink -f "$0")"
HERE="$(cd "$(dirname "$SELF")" && pwd)"
ROOT="$(cd "$HERE/.." && pwd)"
LOG=/tmp/native-reader_launch.log

{
    echo "=== $(date '+%F %T') ==="
    echo "DISPLAY=$DISPLAY XAUTHORITY=${XAUTHORITY:-} XDG_SESSION_TYPE=${XDG_SESSION_TYPE:-}"

    if pgrep -x native-reader >/dev/null 2>&1; then
        # 已运行：用 LuaJIT FFI 把窗口提到最前（不调 xdotool/wmctrl）
        if [ -x "$HERE/reader-lua" ] && [ -f "$ROOT/automation/x11.lua" ]; then
            READER_ROOT="$ROOT" "$HERE/reader-lua" -e '
                package.path = (os.getenv("READER_ROOT") or ".").."/automation/?.lua;"..package.path
                local ok, x11 = pcall(require, "x11")
                if ok then
                    local w = x11.window_class("native-reader")
                    if w then w:activate(); w:raise() end
                end
            ' 2>/dev/null || true
        fi
        echo "already running, bring to front"
        exit 0
    fi

    export XDG_RUNTIME_DIR="${XDG_RUNTIME_DIR:-/run/user/$(id -u)}"
    export DISPLAY="${DISPLAY:-:0}"
    setsid "$HERE/run.sh" "$@" >/dev/null 2>&1 < /dev/null &
    echo "started run.sh pid $!"
} >> "$LOG" 2>&1
