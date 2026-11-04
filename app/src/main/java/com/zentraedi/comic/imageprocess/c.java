package com.zentraedi.comic.imageprocess;

import android.graphics.Bitmap;
import com.zentraedi.business.utils.v;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class c implements f {
    @Override // com.zentraedi.comic.imageprocess.f
    @fo.l
    public Object a(@fo.k Object obj, @fo.k Continuation<Object> continuation) {
        if (obj instanceof Bitmap) {
            return v.a.b(v.a, (Bitmap) obj, 0, continuation, 2, (Object) null);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }
}
