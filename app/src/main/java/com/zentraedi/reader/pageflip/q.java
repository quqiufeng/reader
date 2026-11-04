package com.zentraedi.reader.pageflip;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
class q {
    private static final Class<?> h = q.class;
    static final /* synthetic */ boolean i = false;
    int a;
    int b;
    float[] c;
    float[] d;
    FloatBuffer e;
    FloatBuffer f;
    int g;

    public q() {
        this.g = 0;
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.e = null;
        this.d = null;
        this.f = null;
    }

    public q a(float f, float f2, float f3) {
        float[] fArr = this.c;
        int i2 = this.g;
        int i3 = i2 + 1;
        this.g = i3;
        fArr[i2] = f;
        int i4 = i2 + 2;
        this.g = i4;
        fArr[i3] = f2;
        this.g = i2 + 3;
        fArr[i4] = f3;
        return this;
    }

    public q b(float f, float f2, float f3, float f4) {
        float[] fArr = this.c;
        int i2 = this.g;
        int i3 = i2 + 1;
        this.g = i3;
        fArr[i2] = f;
        int i4 = i2 + 2;
        this.g = i4;
        fArr[i3] = f2;
        int i5 = i2 + 3;
        this.g = i5;
        fArr[i4] = f3;
        this.g = i2 + 4;
        fArr[i5] = f4;
        return this;
    }

    public q c(float f, float f2, float f3, float f4, float f5) {
        int i2 = this.g;
        int i3 = (i2 / this.b) * 2;
        float[] fArr = this.c;
        int i4 = i2 + 1;
        this.g = i4;
        fArr[i2] = f;
        int i5 = i2 + 2;
        this.g = i5;
        fArr[i4] = f2;
        this.g = i2 + 3;
        fArr[i5] = f3;
        float[] fArr2 = this.d;
        fArr2[i3] = f4;
        fArr2[i3 + 1] = f5;
        return this;
    }

    public q d(float f, float f2, float f3, float f4, float f5, float f6) {
        int i2 = this.g;
        int i3 = (i2 / this.b) * 2;
        float[] fArr = this.c;
        int i4 = i2 + 1;
        this.g = i4;
        fArr[i2] = f;
        int i5 = i2 + 2;
        this.g = i5;
        fArr[i4] = f2;
        int i6 = i2 + 3;
        this.g = i6;
        fArr[i5] = f3;
        this.g = i2 + 4;
        fArr[i6] = f4;
        float[] fArr2 = this.d;
        fArr2[i3] = f5;
        fArr2[i3 + 1] = f6;
        return this;
    }

    public q e(c cVar) {
        int i2 = this.g;
        int i3 = (i2 / this.b) * 2;
        float[] fArr = this.c;
        int i4 = i2 + 1;
        this.g = i4;
        fArr[i2] = cVar.a;
        int i5 = i2 + 2;
        this.g = i5;
        fArr[i4] = cVar.b;
        this.g = i2 + 3;
        fArr[i5] = cVar.c;
        float[] fArr2 = this.d;
        fArr2[i3] = cVar.d;
        fArr2[i3 + 1] = cVar.e;
        return this;
    }

    public int f() {
        float[] fArr = this.c;
        if (fArr == null) {
            return 0;
        }
        return fArr.length / this.b;
    }

    public void g(int i2, int i3, int i4) {
        GLES20.glVertexAttribPointer(i3, this.b, 5126, false, 0, (Buffer) this.e);
        GLES20.glEnableVertexAttribArray(i3);
        GLES20.glVertexAttribPointer(i4, 2, 5126, false, 0, (Buffer) this.f);
        GLES20.glEnableVertexAttribArray(i4);
        GLES20.glDrawArrays(i2, 0, this.a);
    }

    public void h(int i2, int i3, int i4, int i5, int i6) {
        GLES20.glVertexAttribPointer(i3, this.b, 5126, false, 0, (Buffer) this.e);
        GLES20.glEnableVertexAttribArray(i3);
        GLES20.glVertexAttribPointer(i4, 2, 5126, false, 0, (Buffer) this.f);
        GLES20.glEnableVertexAttribArray(i4);
        GLES20.glDrawArrays(i2, i5, i6);
    }

    public float i(int i2) {
        if (i2 >= 0 && i2 < this.g) {
            return this.c[i2];
        }
        nd.a.a(h.getName(), "");
        return 0.0f;
    }

    public q j() {
        this.g = 0;
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.e = null;
        this.d = null;
        this.f = null;
        return this;
    }

    public void k() {
        this.g = 0;
    }

    public q l(int i2, int i3, boolean z) {
        if (i3 < 2) {
            nd.a.h(h.getName(), "sizeOfPerVex is invalid: " + i3);
            throw new IllegalArgumentException("sizeOfPerVex:" + i3 + "is less than 2!");
        }
        this.g = 0;
        this.c = null;
        this.e = null;
        this.d = null;
        this.f = null;
        this.b = i3;
        int i4 = i3 * i2;
        this.c = new float[i4];
        this.e = ByteBuffer.allocateDirect(i4 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        if (z) {
            this.d = new float[i2 << 1];
            this.f = ByteBuffer.allocateDirect(i2 << 3).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        return this;
    }

    public q m(int i2, float f, float f2) {
        float[] fArr = this.d;
        fArr[i2] = f;
        fArr[i2 + 1] = f2;
        return this;
    }

    public q n(int i2, float f, float f2, float f3) {
        float[] fArr = this.c;
        fArr[i2] = f;
        fArr[i2 + 1] = f2;
        fArr[i2 + 2] = f3;
        return this;
    }

    public q o(int i2, float f, float f2, float f3, float f4) {
        float[] fArr = this.c;
        fArr[i2] = f;
        fArr[i2 + 1] = f2;
        fArr[i2 + 2] = f3;
        fArr[i2 + 3] = f4;
        return this;
    }

    public void p() {
        this.e.put(this.c, 0, this.g).position(0);
        int i2 = this.g / this.b;
        this.a = i2;
        float[] fArr = this.d;
        if (fArr != null) {
            this.f.put(fArr, 0, i2 << 1).position(0);
        }
    }

    public void q(int i2, int i3) {
        this.e.put(this.c, i2, i3).position(0);
        int i4 = this.b;
        int i5 = i3 / i4;
        this.a = i5;
        float[] fArr = this.d;
        if (fArr != null) {
            this.f.put(fArr, (i2 / i4) * 2, i5 * 2).position(0);
        }
    }

    public q(int i2, int i3) {
        l(i2, i3, true);
    }

    public q(int i2, int i3, boolean z) {
        l(i2, i3, z);
    }
}
