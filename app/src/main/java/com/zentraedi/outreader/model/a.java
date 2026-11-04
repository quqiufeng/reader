package com.zentraedi.outreader.model;

import androidx.compose.animation.w;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class a {
    private final int a;
    private final boolean b;

    public a(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static /* synthetic */ a d(a aVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.a;
        }
        if ((i2 & 2) != 0) {
            z = aVar.b;
        }
        return aVar.c(i, z);
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    @k
    public final a c(int i, boolean z) {
        return new a(i, z);
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b;
    }

    public final boolean f() {
        return this.b;
    }

    public int hashCode() {
        return (this.a * 31) + w.a(this.b);
    }

    @k
    public String toString() {
        return "BookPreviewModel(pageNumber=" + this.a + ", selected=" + this.b + ')';
    }
}
