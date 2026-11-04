package com.zentraedi.comic.imageprocess;

import android.graphics.Bitmap;
import com.zentraedi.comic.viewmodel.ReadModel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class l implements f {

    @fo.k
    private final ReadModel a;
    private final int b;

    public l(@fo.k ReadModel readModel, int i) {
        Intrinsics.checkNotNullParameter(readModel, "readModel");
        this.a = readModel;
        this.b = i;
    }

    @Override // com.zentraedi.comic.imageprocess.f
    @fo.l
    public Object a(@fo.k Object obj, @fo.k Continuation<? super Bitmap> continuation) {
        try {
            if (!(obj instanceof Bitmap)) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                return bitmapCreateBitmap;
            }
            int width = ((Bitmap) obj).getWidth();
            int height = ((Bitmap) obj).getHeight();
            if (this.a == ReadModel.MANGA_READ) {
                if (this.b % 2 == 0) {
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((Bitmap) obj, width / 2, 0, width / 2, height);
                    Intrinsics.checkNotNull(bitmapCreateBitmap2);
                    return bitmapCreateBitmap2;
                }
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap((Bitmap) obj, 0, 0, width / 2, height);
                Intrinsics.checkNotNull(bitmapCreateBitmap3);
                return bitmapCreateBitmap3;
            }
            if (this.b % 2 == 0) {
                Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap((Bitmap) obj, 0, 0, width / 2, height);
                Intrinsics.checkNotNull(bitmapCreateBitmap4);
                return bitmapCreateBitmap4;
            }
            Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap((Bitmap) obj, width / 2, 0, width / 2, height);
            Intrinsics.checkNotNull(bitmapCreateBitmap5);
            return bitmapCreateBitmap5;
        } catch (Exception e) {
            nd.a.d("ImageProcessStep", "SingleBitmap Failed to process image", e);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.graphics.Bitmap");
            return (Bitmap) obj;
        }
    }

    public final int b() {
        return this.b;
    }

    @fo.k
    public final ReadModel c() {
        return this.a;
    }
}
