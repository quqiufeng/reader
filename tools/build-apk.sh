#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
SDK="${ANDROID_SDK_ROOT:-/opt/android-sdk}"
BT="$SDK/build-tools/34.0.0"
OUT="$ROOT/out"
WORK="$ROOT/.build"

rm -rf "$WORK"
mkdir -p "$WORK/dex" "$OUT"

cp "$ROOT/reference/base/base.apk" "$WORK/app.apk"
(cd "$WORK" && zip -q -d app.apk classes.dex || true)

cp "$ROOT/reference/stub/classes.dex" "$WORK/dex/classes.dex"

for i in $(seq 2 44); do
    cp "$ROOT/reference/app_dex/classes$i.dex" "$WORK/dex/classes$i.dex"
done

(cd "$WORK/dex" && zip -q -X ../app.apk classes*.dex)
(cd "$WORK" && zip -q -0 -X app.apk resources.arsc 2>/dev/null || true)

"$BT/zipalign" -f -p 4 "$WORK/app.apk" "$WORK/app-aligned.apk"

KS="$ROOT/reference/debug.keystore"
if [ ! -f "$KS" ]; then
    keytool -genkeypair \
        -keystore "$KS" \
        -storepass android \
        -keypass android \
        -alias androiddebugkey \
        -keyalg RSA \
        -keysize 2048 \
        -validity 10000 \
        -dname "CN=Android Debug,O=Android,C=US"
fi

"$BT/apksigner" sign \
    --ks "$KS" \
    --ks-pass pass:android \
    --key-pass pass:android \
    --out "$OUT/zspace-reader.apk" \
    "$WORK/app-aligned.apk"

echo "built: $OUT/zspace-reader.apk"
