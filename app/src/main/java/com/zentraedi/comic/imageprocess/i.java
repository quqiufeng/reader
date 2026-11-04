package com.zentraedi.comic.imageprocess;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.comic.viewmodel.Layout;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class i implements f {

    @fo.k
    private final Layout a;

    public i(@fo.k Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.a = layout;
    }

    private final float b(int i, int i2, int i3, int i4) {
        return RangesKt.coerceAtMost(Math.min(i3 / i, i4 / i2), 1.0f);
    }

    private final Bitmap c(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth() + bitmap2.getWidth(), Math.max(bitmap.getHeight(), bitmap2.getHeight()), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmap2, bitmap.getWidth(), 0.0f, (Paint) null);
        return bitmapCreateBitmap;
    }

    private final Bitmap d(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmapCreateBitmap;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int width = bitmap.getWidth() + bitmap2.getWidth();
        int iMax = Math.max(bitmap.getHeight(), bitmap2.getHeight());
        if (((long) width) * ((long) iMax) > ((long) k0.i()) * ((long) k0.l())) {
            return e(bitmap, bitmap2, config);
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(width, iMax, config);
        } catch (OutOfMemoryError unused) {
            System.gc();
            bitmapCreateBitmap = Bitmap.createBitmap(width, iMax, config);
        }
        Intrinsics.checkNotNull(bitmapCreateBitmap);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmap2, bitmap.getWidth(), 0.0f, (Paint) null);
        return bitmapCreateBitmap;
    }

    private final Bitmap e(Bitmap bitmap, Bitmap bitmap2, Bitmap.Config config) {
        float fB = b(bitmap.getWidth() + bitmap2.getWidth(), Math.max(bitmap.getHeight(), bitmap2.getHeight()), k0.l(), k0.i());
        int iCoerceAtLeast = RangesKt.coerceAtLeast((int) (bitmap.getWidth() * fB), 1);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast((int) (bitmap.getHeight() * fB), 1);
        int iCoerceAtLeast3 = RangesKt.coerceAtLeast((int) (bitmap2.getWidth() * fB), 1);
        int iCoerceAtLeast4 = RangesKt.coerceAtLeast((int) (bitmap2.getHeight() * fB), 1);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iCoerceAtLeast, iCoerceAtLeast2, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmap2, iCoerceAtLeast3, iCoerceAtLeast4, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap2, "createScaledBitmap(...)");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCoerceAtLeast3 + iCoerceAtLeast, Math.max(iCoerceAtLeast2, iCoerceAtLeast4), config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmapCreateScaledBitmap2, iCoerceAtLeast, 0.0f, (Paint) null);
        if (!Intrinsics.areEqual(bitmapCreateScaledBitmap, bitmap)) {
            bitmapCreateScaledBitmap.recycle();
        }
        if (!Intrinsics.areEqual(bitmapCreateScaledBitmap2, bitmap2)) {
            bitmapCreateScaledBitmap2.recycle();
        }
        return bitmapCreateBitmap;
    }

    private final boolean g(long j) {
        Runtime runtime = Runtime.getRuntime();
        return ((double) j) < ((double) (runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory()))) * 0.8d;
    }

    @Override // com.zentraedi.comic.imageprocess.f
    @fo.l
    public Object a(@fo.k Object obj, @fo.k Continuation<? super Bitmap> continuation) {
        if (!(obj instanceof Pair)) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            return bitmapCreateBitmap;
        }
        if (this.a == Layout.DOUBLE) {
            Pair pair = (Pair) obj;
            Object first = pair.getFirst();
            Intrinsics.checkNotNull(first, "null cannot be cast to non-null type android.graphics.Bitmap");
            Object second = pair.getSecond();
            Intrinsics.checkNotNull(second, "null cannot be cast to non-null type android.graphics.Bitmap");
            return d((Bitmap) first, (Bitmap) second);
        }
        Pair pair2 = (Pair) obj;
        Object second2 = pair2.getSecond();
        Intrinsics.checkNotNull(second2, "null cannot be cast to non-null type android.graphics.Bitmap");
        Object first2 = pair2.getFirst();
        Intrinsics.checkNotNull(first2, "null cannot be cast to non-null type android.graphics.Bitmap");
        return d((Bitmap) second2, (Bitmap) first2);
    }

    @fo.k
    public final Layout f() {
        return this.a;
    }
}
