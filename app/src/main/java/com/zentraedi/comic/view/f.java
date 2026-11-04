package com.zentraedi.comic.view;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.zentraedi.outreader.reader.PDFTronZReader;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class f implements ComicTiledImageView.c {

    @fo.k
    private final PDFTronZReader a;
    private final int b;

    @fo.k
    private final Pair<Integer, Integer> c;
    private final int d;
    private final int e;

    public f(@fo.k PDFTronZReader reader, int i) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.a = reader;
        this.b = i;
        Pair<Integer, Integer> pairC0 = reader.c0(i);
        if (pairC0 != null) {
            this.c = pairC0;
            this.d = pairC0.getFirst().intValue();
            this.e = pairC0.getSecond().intValue();
        } else {
            throw new IllegalArgumentException("PDF page " + i + " is unavailable");
        }
    }

    @Override // com.zentraedi.comic.view.ComicTiledImageView.c
    @fo.l
    public Bitmap a(@fo.k Rect region, int i, int i2) {
        Intrinsics.checkNotNullParameter(region, "region");
        return this.a.i0(this.b, region, i, i2);
    }

    @Override // com.zentraedi.comic.view.ComicTiledImageView.c
    public /* bridge */ void close() {
        n.a(this);
    }

    @Override // com.zentraedi.comic.view.ComicTiledImageView.c
    public int getHeight() {
        return this.e;
    }

    @Override // com.zentraedi.comic.view.ComicTiledImageView.c
    public int getWidth() {
        return this.d;
    }
}
