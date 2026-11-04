package com.zentraedi.reader.pageflip;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
final class b extends q {
    private static final Class<?> k = b.class;
    float j;

    public b() {
        this.b = 4;
        this.j = 0.6f;
    }

    public void r(a aVar, i iVar, boolean z, int i) {
        GLES20.glUniformMatrix4fv(aVar.f, 1, false, p.o, 0);
        GLES20.glBindTexture(3553, iVar.l());
        GLES20.glUniform1i(aVar.i, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(aVar.p, 1);
        GLES20.glUniform1f(aVar.r, z ? 1.0f : 0.0f);
        int i2 = aVar.q;
        float[] fArr = iVar.k[0];
        GLES20.glUniform4f(i2, fArr[0], fArr[1], fArr[2], z ? 0.0f : this.j);
        g(5, aVar.g, aVar.h);
    }

    public void s(int i) {
        super.l(i << 1, 4, true);
        this.g = 0;
    }

    public void t(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            this.j = f;
            return;
        }
        throw new IllegalArgumentException("Alpha: " + f + "is out of [0 .. 1]!");
    }

    public void u(int i) {
        if (i >= 0 && i <= 255) {
            this.j = i / 255.0f;
            return;
        }
        throw new IllegalArgumentException("Alpha: " + i + "is out of [0 .. 255]!");
    }
}
