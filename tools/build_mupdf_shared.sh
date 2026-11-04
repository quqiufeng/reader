#!/usr/bin/env bash
set -euo pipefail

SRC="${MUPDF_SRC:-/opt/mupdf}"
SUDO="${SUDO:-}"
LIB="$SRC/build/shared-release/libmupdf.so"

if [ ! -f "$SRC/Makefile" ]; then
    echo "MuPDF source not found: $SRC" >&2
    echo "set MUPDF_SRC=/path/to/mupdf" >&2
    exit 1
fi

if [ ! -e "$LIB" ]; then
    echo "building shared MuPDF: $SRC"
    if [ -n "$SUDO" ]; then
        $SUDO make -C "$SRC" shared=yes build=release -j"$(nproc)"
    else
        make -C "$SRC" shared=yes build=release -j"$(nproc)"
    fi
fi

ls -lh "$LIB"
