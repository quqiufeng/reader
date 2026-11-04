package com.zentraedi.comic.imageprocess;

import android.graphics.Bitmap;
import com.zentraedi.comic.viewmodel.ReadSetting;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class m implements f {

    @fo.l
    private final ReadSetting.Stretcher a;

    public m(@fo.l ReadSetting.Stretcher stretcher) {
        this.a = stretcher;
    }

    @Override // com.zentraedi.comic.imageprocess.f
    @fo.l
    public Object a(@fo.k Object obj, @fo.k Continuation<Object> continuation) {
        if (this.a == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            return bitmapCreateBitmap;
        }
        if (!(obj instanceof Bitmap)) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(...)");
            return bitmapCreateBitmap2;
        }
        Bitmap bitmap = (Bitmap) obj;
        double dCoerceAtLeast = RangesKt.coerceAtLeast(bitmap.getWidth() * this.a.h(), 1.0d);
        double dCoerceAtLeast2 = RangesKt.coerceAtLeast(bitmap.getHeight() * this.a.g(), 1.0d);
        double dMin = Math.min(1.0d, Math.min(Math.sqrt(1.2E7d / (dCoerceAtLeast * dCoerceAtLeast2)), 8192.0d / Math.max(dCoerceAtLeast, dCoerceAtLeast2)));
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, RangesKt.coerceAtLeast((int) (dCoerceAtLeast * dMin), 1), RangesKt.coerceAtLeast((int) (dCoerceAtLeast2 * dMin), 1), true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        return bitmapCreateScaledBitmap;
    }
}
