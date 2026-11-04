package com.zentraedi.comic.imageprocess;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.zentraedi.comic.viewmodel.ReadSetting;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class b implements f {

    @fo.l
    private final ReadSetting.Coordinate a;

    public b(@fo.l ReadSetting.Coordinate coordinate) {
        this.a = coordinate;
    }

    private final Bitmap b(Bitmap bitmap, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, new Rect(i, i2, i3, i4), new Rect(0, 0, i5, i6), (Paint) null);
        return bitmapCreateBitmap;
    }

    @Override // com.zentraedi.comic.imageprocess.f
    @fo.l
    public Object a(@fo.k Object obj, @fo.k Continuation<Object> continuation) {
        if (!(obj instanceof Bitmap)) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            return bitmapCreateBitmap;
        }
        if (this.a == null) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(...)");
            return bitmapCreateBitmap2;
        }
        Bitmap bitmap = (Bitmap) obj;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = width;
        float fM = this.a.m() * f;
        float f2 = height;
        return b(bitmap, (int) (f * this.a.l()), (int) (f2 * this.a.n()), (int) fM, (int) (this.a.j() * f2));
    }

    @fo.l
    public final ReadSetting.Coordinate c() {
        return this.a;
    }
}
