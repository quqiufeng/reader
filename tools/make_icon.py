#!/usr/bin/env python3
from pathlib import Path

from PIL import Image

ROOT = Path(__file__).resolve().parent.parent
OUT = ROOT / "assets" / "icons"
SOURCE = OUT / "native-reader-source.png"
FALLBACK = Path("/opt/WordCard/gui/flutter/assets/icons/wordcard-1024.png")


def main() -> None:
    src = SOURCE if SOURCE.exists() else FALLBACK
    img = Image.open(src).convert("RGBA")
    w, h = img.size
    side = min(w, h)
    img = img.crop(((w - side) // 2, (h - side) // 2,
                    (w + side) // 2, (h + side) // 2))

    OUT.mkdir(parents=True, exist_ok=True)
    for size in (512, 256, 128, 64):
        img.resize((size, size), Image.Resampling.LANCZOS).save(
            OUT / f"native-reader-{size}.png")
    img.resize((256, 256), Image.Resampling.LANCZOS).convert("RGB").save(
        OUT / "native-reader.bmp")
    (OUT / "native-reader.png").write_bytes(
        (OUT / "native-reader-512.png").read_bytes())
    print("icons:", OUT)


if __name__ == "__main__":
    main()
