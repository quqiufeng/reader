package com.zentraedi.reader.pageflip;

import android.content.Context;
import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class m extends d {
    static final String i = "u_MVPMatrix";
    static final String j = "u_vexZ";
    static final String k = "a_vexPosition";
    int f = -1;
    int g = -1;
    int h = -1;

    @Override // com.zentraedi.reader.pageflip.d
    public void a() {
        super.a();
        this.f = -1;
        this.g = -1;
        this.h = -1;
    }

    @Override // com.zentraedi.reader.pageflip.d
    protected void c() {
        int i2 = this.b;
        if (i2 != 0) {
            this.g = GLES20.glGetUniformLocation(i2, j);
            this.h = GLES20.glGetAttribLocation(this.b, k);
            this.f = GLES20.glGetUniformLocation(this.b, i);
        }
    }

    public m e(Context context) throws Throwable {
        super.d(context, com.zentraedi.reader.h.p.h, com.zentraedi.reader.h.p.g);
        return this;
    }
}
