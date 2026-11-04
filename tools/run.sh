#!/usr/bin/env bash
set -euo pipefail

SELF="$(readlink -f "$0")"
DIR="$(cd "$(dirname "$SELF")" && pwd)"
if [ -x "$DIR/native-reader" ]; then
    ROOT="$DIR"
    BIN="$DIR/native-reader"
else
    ROOT="$(cd "$DIR/.." && pwd)"
    BIN="$ROOT/build/native-reader"
fi

export READER_ROOT="$ROOT"
MUPDF_LIBDIR="${READER_MUPDF_LIBDIR:-/opt/mupdf/build/shared-release}"
export LD_LIBRARY_PATH="$ROOT/lib:$ROOT/build:$MUPDF_LIBDIR:/usr/local/lib:${LD_LIBRARY_PATH:-}"

if [ -z "${DISPLAY:-}" ]; then
    export DISPLAY="${READER_DISPLAY:-:0}"
fi
if [ -z "${XAUTHORITY:-}" ]; then
    PROC="${READER_DESKTOP_PROC:-pcmanfm-qt}"
    P="$(pgrep -x "$PROC" | head -1 || true)"
    if [ -n "$P" ]; then
        XA="$(tr '\0' '\n' < "/proc/$P/environ" | sed -n 's/^XAUTHORITY=//p' | head -1)"
        [ -n "$XA" ] && export XAUTHORITY="$XA"
    fi
fi

cd "$ROOT"
exec "$BIN" "$@"
