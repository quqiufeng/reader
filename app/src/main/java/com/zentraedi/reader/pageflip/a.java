package com.zentraedi.reader.pageflip;

import android.content.Context;
import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class a extends p {
    static final String s = "u_texXOffset";
    static final String t = "u_maskColor";
    static final String u = "u_shadow";
    int p = -1;
    int q = -1;
    int r = -1;

    @Override // com.zentraedi.reader.pageflip.p, com.zentraedi.reader.pageflip.d
    public void a() {
        super.a();
        this.p = -1;
        this.q = -1;
        this.r = -1;
    }

    @Override // com.zentraedi.reader.pageflip.p, com.zentraedi.reader.pageflip.d
    protected void c() {
        super.c();
        int i = this.b;
        if (i != 0) {
            this.p = GLES20.glGetUniformLocation(i, u);
            this.q = GLES20.glGetUniformLocation(this.b, t);
            this.r = GLES20.glGetUniformLocation(this.b, s);
        }
    }

    @Override // com.zentraedi.reader.pageflip.p
    public /* bridge */ /* synthetic */ void f(float f, float f2, float f3, float f4) {
        super.f(f, f2, f3, f4);
    }

    @Override // com.zentraedi.reader.pageflip.p
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a e(Context context) throws Throwable {
        super.d(context, com.zentraedi.reader.h.p.e, com.zentraedi.reader.h.p.d);
        return this;
    }
}
