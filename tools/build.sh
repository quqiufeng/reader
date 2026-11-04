#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
MUPDF_SRC="${MUPDF_SRC:-/opt/mupdf}"
if [ ! -e "$MUPDF_SRC/build/shared-release/libmupdf.so" ]; then
    "$ROOT/tools/build_mupdf_shared.sh"
fi
cmake -S "$ROOT" -B "$ROOT/build" -DCMAKE_BUILD_TYPE=Release -DMUPDF_ROOT="$MUPDF_SRC"
cmake --build "$ROOT/build" -j"$(nproc)"
