package com.zentraedi.comic.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicTiledImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicTiledImageView.kt\ncom/zentraedi/comic/view/ComicPairTileSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,527:1\n1#2:528\n*E\n"})
public final class e implements ComicTiledImageView.c {

    @fo.k
    private final ComicTiledImageView.c a;

    @fo.k
    private final ComicTiledImageView.c b;
    private final int c;
    private final int d;

    public e(@fo.k ComicTiledImageView.c first, @fo.k ComicTiledImageView.c second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.a = first;
        this.b = second;
        this.c = first.getWidth() + second.getWidth();
        this.d = Math.max(first.getHeight(), second.getHeight());
    }

    private static final void b(Rect rect, int i, int i2, Canvas canvas, ComicTiledImageView.c cVar, int i3) {
        Rect rect2 = new Rect(i3, 0, cVar.getWidth() + i3, cVar.getHeight());
        if (rect2.intersect(rect)) {
            Rect rect3 = new Rect(rect2);
            rect3.offset(-i3, 0);
            float f = i;
            float f2 = i2;
            RectF rectF = new RectF(((rect2.left - rect.left) * f) / rect.width(), ((rect2.top - rect.top) * f2) / rect.height(), ((rect2.right - rect.left) * f) / rect.width(), ((rect2.bottom - rect.top) * f2) / rect.height());
            Bitmap bitmapA = cVar.a(rect3, RangesKt.coerceIn((int) Math.ceil(rectF.width()), 1, 512), RangesKt.coerceIn((int) Math.ceil(rectF.height()), 1, 512));
            if (bitmapA == null) {
                return;
            }
            try {
                canvas.drawBitmap(bitmapA, (Rect) null, rectF, new Paint(2));
            } finally {
                bitmapA.recycle();
            }
        }
    }

    @Override // com.zentraedi.comic.view.ComicTiledImageView.c
    @fo.l
    public Bitmap a(@fo.k Rect region, int i, int i2) {
        Intrinsics.checkNotNullParameter(region, "region");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        b(region, i, i2, canvas, this.a, 0);
        b(region, i, i2, canvas, this.b, this.a.getWidth());
        return bitmapCreateBitmap;
    }

    @Override // com.zentraedi.comic.view.ComicTiledImageView.c
    public void close() {
        this.a.close();
        this.b.close();
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
