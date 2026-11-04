package com.zentraedi.comic.imageprocess;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.zspace.jni.ZspaceJni;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class e implements f {
    private final boolean a;

    @fo.k
    private final AssetManager b;

    public e(boolean z, @fo.k AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.a = z;
        this.b = assetManager;
    }

    @Override // com.zentraedi.comic.imageprocess.f
    @fo.l
    public Object a(@fo.k Object obj, @fo.k Continuation<Object> continuation) {
        if (!(obj instanceof Bitmap) || !this.a) {
            return obj;
        }
        ZspaceJni.applyFiltersOptimized(this.b, (Bitmap) obj, true, false, 1.0f, false, 1.0f);
        return obj;
    }

    @fo.k
    public final AssetManager b() {
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }
}
