package com.zentraedi.comic.imageprocess;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.zspace.jni.ZspaceJni;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class d implements f {
    private final boolean a;
    private final float b;

    @fo.k
    private final AssetManager c;

    public d(boolean z, float f, @fo.k AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.a = z;
        this.b = f;
        this.c = assetManager;
    }

    @Override // com.zentraedi.comic.imageprocess.f
    @fo.l
    public Object a(@fo.k Object obj, @fo.k Continuation<Object> continuation) {
        if (!(obj instanceof Bitmap) || !this.a) {
            return obj;
        }
        ZspaceJni.applyFiltersOptimized(this.c, (Bitmap) obj, false, true, this.b, false, 1.0f);
        return obj;
    }

    @fo.k
    public final AssetManager b() {
        return this.c;
    }

    public final float c() {
        return this.b;
    }

    public final boolean d() {
        return this.a;
    }
}
