package com.zentraedi.reader.pageflip;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
class p extends d {
    static final String j = "u_MVPMatrix";
    static final String k = "a_vexPosition";
    static final String l = "a_texCoord";
    static final String m = "u_texture";
    static final float[] n = new float[16];
    static final float[] o = new float[16];
    int i = -1;
    int f = -1;
    int h = -1;
    int g = -1;

    @Override // com.zentraedi.reader.pageflip.d
    public void a() {
        super.a();
        this.i = -1;
        this.f = -1;
        this.h = -1;
        this.g = -1;
    }

    @Override // com.zentraedi.reader.pageflip.d
    protected void c() {
        int i = this.b;
        if (i != 0) {
            this.g = GLES20.glGetAttribLocation(i, k);
            this.h = GLES20.glGetAttribLocation(this.b, l);
            this.f = GLES20.glGetUniformLocation(this.b, j);
            this.i = GLES20.glGetUniformLocation(this.b, m);
        }
    }

    public p e(Context context) throws Throwable {
        super.d(context, com.zentraedi.reader.h.p.i, com.zentraedi.reader.h.p.f);
        return this;
    }

    public void f(float f, float f2, float f3, float f4) {
        float[] fArr = new float[16];
        Matrix.orthoM(fArr, 0, f, f2, f3, f4, 0.0f, 6000.0f);
        float[] fArr2 = n;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 3000.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = o;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
    }
}
