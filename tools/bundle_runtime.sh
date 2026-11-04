#!/usr/bin/env bash
set -euo pipefail

DIST="${1:?dist dir}"
BUILD="${2:?build dir}"
LIB="$DIST/lib"
mkdir -p "$LIB"

declare -A SEEN=()

is_system() {
    case "$1" in
        libc.so*|libm.so*|libdl.so*|libpthread.so*|librt.so*|libgcc_s.so*|\
        libresolv.so*|libutil.so*|libanl.so*|libnss_*|ld-linux*|linux-vdso*)
            return 0 ;;
    esac
    return 1
}

copy_one() {
    local path="$1"
    [ -e "$path" ] || return 0
    local base
    base="$(basename "$path")"
    is_system "$base" && return 0
    [ -n "${SEEN[$base]:-}" ] && return 0
    SEEN[$base]=1

    if [ ! -e "$LIB/$base" ]; then
        cp -L "$path" "$LIB/$base"
    fi

    while IFS= read -r line; do
        local dep=""
        dep="$(awk '{for(i=1;i<=NF;i++) if($i=="=>"){print $(i+1); exit}}' <<<"$line")"
        [ -z "$dep" ] && dep="$(awk '{print $1}' <<<"$line")"
        case "$dep" in
            /*) copy_one "$dep" ;;
        esac
    done < <(ldd "$path" 2>/dev/null || true)
}

# App binaries/libs
for f in "$BUILD/native-reader" "$BUILD/libreader_native.so" "$BUILD/libreader_ctl.so"; do
    copy_one "$(readlink -f "$f")"
done

# SDL is loaded dynamically by LuaJIT FFI.
for name in libSDL2-2.0.so.0 libSDL2_ttf-2.0.so.0; do
    path="$(ldconfig -p | awk -v n="$name" '$1==n && /x86-64/ {print $NF; exit}')"
    if [ -n "$path" ]; then
        copy_one "$path"
    fi
done

# FFI loads "SDL2"/"SDL2_ttf"; provide unversioned symlinks.
[ -e "$LIB/libSDL2-2.0.so.0" ] && ln -sf libSDL2-2.0.so.0 "$LIB/libSDL2.so"
[ -e "$LIB/libSDL2_ttf-2.0.so.0" ] && ln -sf libSDL2_ttf-2.0.so.0 "$LIB/libSDL2_ttf.so"

echo "bundled runtime libraries: $(find "$LIB" -maxdepth 1 -type f | wc -l) files, $(du -sh "$LIB" | cut -f1)"
