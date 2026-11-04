#!/usr/bin/env bash
# launch.sh — 桌面图标入口：单实例、在图形会话内启动。
set -uo pipefail

HERE="$(cd "$(dirname "$0")" && pwd)"
LOG=/tmp/native-reader_launch.log

{
    echo "=== $(date '+%F %T') ==="
    echo "DISPLAY=$DISPLAY XAUTHORITY=${XAUTHORITY:-} XDG_SESSION_TYPE=${XDG_SESSION_TYPE:-}"

    if pgrep -x native-reader >/dev/null 2>&1; then
        xdotool search --class native-reader windowactivate 2>/dev/null || \
            wmctrl -x -a native-reader 2>/dev/null || true
        echo "already running, bring to front"
        exit 0
    fi

    export XDG_RUNTIME_DIR="${XDG_RUNTIME_DIR:-/run/user/$(id -u)}"
    export DISPLAY="${DISPLAY:-:0}"
    setsid "$HERE/run.sh" "$@" >/dev/null 2>&1 < /dev/null &
    echo "started run.sh pid $!"
} >> "$LOG" 2>&1
