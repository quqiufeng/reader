package com.zentraedi.comic.view;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class h implements ComicTiledImageView.c {

    @fo.k
    private final ComicTiledImageView.c a;

    @fo.k
    private final Rect b;
    private final int c;
    private final int d;

    public h(@fo.k ComicTiledImageView.c original, @fo.k Rect region) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(region, "region");
        this.a = original;
        this.b = region;
        this.c = region.width();
        this.d = region.height();
    }

    @Override // com.zentraedi.comic.view.ComicTiledImageView.c
    @fo.l
    public Bitmap a(@fo.k Rect tile, int i, int i2) {
        Intrinsics.checkNotNullParameter(tile, "tile");
        ComicTiledImageView.c cVar = this.a;
        Rect rect = this.b;
        int i3 = rect.left;
        int i4 = tile.left + i3;
        int i5 = rect.top;
        return cVar.a(new Rect(i4, tile.top + i5, i3 + tile.right, i5 + tile.bottom), i, i2);
    }

    @Override // com.zentraedi.comic.view.ComicTiledImageView.c
    public void close() {
        this.a.close();
    }

    @Override // com.zentraedi.comic.view.ComicTiledImageView.c
    public int getHeight() {
        return this.d;
    }

    @Override // com.zentraedi.comic.view.ComicTiledImageView.c
    public int getWidth() {
        return this.c;
    }
}
