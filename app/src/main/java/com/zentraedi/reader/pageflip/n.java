package com.zentraedi.reader.pageflip;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
class n {
    int a;
    float b;
    float[] c;
    FloatBuffer d;
    final l e;
    int f;
    private int g;
    private int h;
    private int i;

    public n() {
        e();
        this.e = new l();
    }

    public n a(boolean z, float f, float f2, float f3, float f4) {
        return z ? c(f, f2, f3, f4) : b(f, f2, f3, f4);
    }

    public n b(float f, float f2, float f3, float f4) {
        float[] fArr = this.c;
        int i = this.h;
        int i2 = i - 1;
        this.h = i2;
        l lVar = this.e;
        fArr[i2] = lVar.d;
        int i3 = i - 2;
        this.h = i3;
        fArr[i3] = lVar.c;
        int i4 = i - 3;
        this.h = i4;
        fArr[i4] = f4;
        int i5 = i - 4;
        this.h = i5;
        fArr[i5] = f3;
        int i6 = i - 5;
        this.h = i6;
        fArr[i6] = lVar.b;
        int i7 = i - 6;
        this.h = i7;
        fArr[i7] = lVar.a;
        int i8 = i - 7;
        this.h = i8;
        fArr[i8] = f2;
        int i9 = i - 8;
        this.h = i9;
        fArr[i9] = f;
        return this;
    }

    public n c(float f, float f2, float f3, float f4) {
        float[] fArr = this.c;
        int i = this.i;
        int i2 = i + 1;
        this.i = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.i = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.i = i4;
        l lVar = this.e;
        fArr[i3] = lVar.a;
        int i5 = i + 4;
        this.i = i5;
        fArr[i4] = lVar.b;
        int i6 = i + 5;
        this.i = i6;
        fArr[i5] = f3;
        int i7 = i + 6;
        this.i = i7;
        fArr[i6] = f4;
        int i8 = i + 7;
        this.i = i8;
        fArr[i7] = lVar.c;
        this.i = i + 8;
        fArr[i8] = lVar.d;
        return this;
    }

    public void d(m mVar) {
        if (this.a > 0) {
            GLES20.glUniformMatrix4fv(mVar.f, 1, false, p.o, 0);
            GLES20.glUniform1f(mVar.g, this.b);
            GLES20.glDisable(3553);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            GLES20.glVertexAttribPointer(mVar.h, 4, 5126, false, 0, (Buffer) this.d);
            GLES20.glEnableVertexAttribArray(mVar.h);
            GLES20.glDrawArrays(5, 0, this.a);
            GLES20.glDisable(3042);
        }
    }

    public void e() {
        this.h = 0;
        this.i = 0;
        this.f = 0;
        this.g = 0;
        this.c = null;
        this.d = null;
    }

    public void f() {
        this.b = 0.0f;
        int i = this.f;
        this.h = i;
        this.i = i + (this.g << 2);
    }

    public n g(int i) {
        this.f = i << 3;
        int i2 = (i << 4) + (this.g << 2);
        this.c = new float[i2];
        this.d = ByteBuffer.allocateDirect(i2 << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        f();
        return this;
    }

    public n h(int i, float f, float f2, float f3, float f4) {
        float[] fArr = this.c;
        fArr[i] = f;
        fArr[i + 1] = f2;
        l lVar = this.e;
        fArr[i + 2] = lVar.a;
        fArr[i + 3] = lVar.b;
        fArr[i + 4] = f3;
        fArr[i + 5] = f4;
        fArr[i + 6] = lVar.c;
        fArr[i + 7] = lVar.d;
        return this;
    }

    public void i() {
        int i = this.i;
        int i2 = this.h;
        this.a = (i - i2) / 4;
        this.d.put(this.c, i2, i - i2).position(0);
    }

    public void j(int i) {
        this.d.put(this.c, 0, i).position(0);
        this.a = i / 4;
    }

    public n(int i, float f, float f2, float f3, float f4) {
        e();
        this.g = i;
        this.e = new l(f, f2, f3, f4);
    }
}
