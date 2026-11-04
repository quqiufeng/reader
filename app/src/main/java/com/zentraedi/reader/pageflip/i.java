package com.zentraedi.reader.pageflip;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class i {
    private static final int A = -1;
    private static final int[][] B = {new int[]{0, 1, 2, 3}, new int[]{1, 0, 3, 2}, new int[]{2, 3, 0, 1}, new int[]{3, 2, 1, 0}};
    private static final int[][] C = {new int[]{4, 3, 1, 2, 0}, new int[]{3, 3, 2, 0, 1}, new int[]{3, 2, 1, 3, 0}, new int[]{2, 2, 3, 1, 0}, new int[]{1, 0, 1, 3, 2}};
    private static final int w = 3;
    private static final int x = 0;
    private static final int y = 1;
    private static final int z = 2;
    float a;
    float b;
    float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    c i;
    c j;
    float[][] k;
    private c l;
    private c m;
    private FloatBuffer n;
    private FloatBuffer o;
    private float[] p;
    private float[] q;
    private int r;
    private int s;
    private int[] t;
    private int[] u;
    private int v;

    public i() {
        n(0.0f, 0.0f, 0.0f, 0.0f);
    }

    private void a() {
        float[] fArr = this.p;
        float f = this.b;
        fArr[0] = f;
        fArr[1] = this.d;
        fArr[2] = 0.0f;
        this.q[0] = D(f);
        this.q[1] = E(this.d);
        float[] fArr2 = this.p;
        float f2 = this.b;
        fArr2[3] = f2;
        fArr2[4] = this.c;
        fArr2[5] = 0.0f;
        this.q[2] = D(f2);
        this.q[3] = E(this.c);
        float[] fArr3 = this.p;
        float f3 = this.a;
        fArr3[6] = f3;
        fArr3[7] = this.c;
        fArr3[8] = 0.0f;
        this.q[4] = D(f3);
        this.q[5] = E(this.c);
        float[] fArr4 = this.p;
        float f4 = this.a;
        fArr4[9] = f4;
        fArr4[10] = this.d;
        fArr4[11] = 0.0f;
        this.q[6] = D(f4);
        this.q[7] = E(this.d);
        this.n.put(this.p, 0, 12).position(0);
        this.o.put(this.q, 0, 8).position(0);
    }

    private void d() {
        this.s = 0;
        c cVar = this.i;
        float f = cVar.a;
        float f2 = this.b;
        if (f < f2 && cVar.b < 0.0f) {
            this.s = 3;
            return;
        }
        if (cVar.b > 0.0f) {
            this.s = 1;
        }
        if (f < f2) {
            this.s++;
        }
    }

    private void f() {
        this.n = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.o = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.p = new float[12];
        this.q = new float[8];
    }

    private void j(p pVar, int i) {
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(pVar.i, 0);
        GLES20.glVertexAttribPointer(pVar.g, 3, 5126, false, 0, (Buffer) this.n);
        GLES20.glEnableVertexAttribArray(pVar.g);
        GLES20.glVertexAttribPointer(pVar.h, 2, 5126, false, 0, (Buffer) this.o);
        GLES20.glEnableVertexAttribArray(pVar.h);
        GLES20.glDrawArrays(6, 0, 4);
    }

    private void n(float f, float f2, float f3, float f4) {
        this.c = f3;
        this.a = f;
        this.b = f2;
        this.d = f4;
        float f5 = f2 - f;
        this.e = f5;
        float f6 = f3 - f4;
        this.f = f6;
        this.g = f5;
        this.h = f6;
        this.r = 0;
        this.s = 0;
        this.l = new c();
        this.m = new c();
        this.i = new c();
        this.j = new c();
        this.k = new float[][]{new float[]{0.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f}};
        this.t = new int[]{-1, -1, -1};
        this.v = 0;
        this.u = new int[]{-1, -1, -1};
        f();
        a();
    }

    public void A(Bitmap bitmap) {
        int iA = k.a(bitmap, 30);
        this.k[1][0] = Color.red(iA) / 255.0f;
        this.k[1][1] = Color.green(iA) / 255.0f;
        this.k[1][2] = Color.blue(iA) / 255.0f;
        GLES20.glGenTextures(1, this.t, 1);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.t[1]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
    }

    public i B() {
        int[] iArr = this.t;
        int i = iArr[1];
        if (i > -1) {
            int[] iArr2 = this.u;
            int i2 = this.v;
            this.v = i2 + 1;
            iArr2[i2] = i;
        }
        float[][] fArr = this.k;
        float[] fArr2 = fArr[1];
        float[] fArr3 = fArr[0];
        fArr2[0] = fArr3[0];
        fArr2[1] = fArr3[1];
        fArr2[2] = fArr3[2];
        iArr[1] = iArr[0];
        iArr[0] = -1;
        return this;
    }

    public i C(i iVar) {
        int[] iArr = this.u;
        int i = this.v;
        int i2 = i + 1;
        this.v = i2;
        int[] iArr2 = this.t;
        iArr[i] = iArr2[1];
        iArr2[1] = iArr2[0];
        this.v = i + 2;
        iArr[i2] = iArr2[2];
        int[] iArr3 = iVar.t;
        iArr2[2] = iArr3[0];
        iArr2[0] = iArr3[2];
        iArr3[2] = -1;
        iArr3[0] = iArr3[1];
        iArr3[1] = -1;
        return this;
    }

    public float D(float f) {
        return (f - this.a) / this.g;
    }

    public float E(float f) {
        return (this.c - f) / this.h;
    }

    public float F() {
        return this.e;
    }

    public void b(q qVar, PointF pointF, PointF pointF2, float f) {
        int i;
        int i2;
        float f2 = this.f * 0.5f;
        c cVar = this.l;
        float f3 = pointF.x;
        cVar.a(f3, this.i.b, 0.0f, D(f3), this.i.e);
        if (v(pointF.x)) {
            c cVar2 = this.l;
            c cVar3 = this.j;
            cVar2.a = cVar3.a;
            float f4 = this.i.b + ((pointF.x - cVar3.a) / f);
            cVar2.b = f4;
            cVar2.d = cVar3.d;
            cVar2.e = E(f4);
            i = 2;
        } else {
            i = 0;
        }
        c cVar4 = this.m;
        c cVar5 = this.i;
        float f5 = cVar5.a;
        float f6 = pointF2.y;
        cVar4.a(f5, f6, 0.0f, cVar5.d, E(f6));
        if (Math.abs(pointF2.y) > f2) {
            int i3 = i + 1;
            c cVar6 = this.m;
            float f7 = this.i.a + ((pointF2.y - this.j.b) * f);
            cVar6.a = f7;
            if (v(f7)) {
                i += 2;
            } else {
                c cVar7 = this.m;
                cVar7.b = this.j.b;
                cVar7.d = D(cVar7.a);
                this.m.e = this.j.e;
                i = i3;
            }
        }
        int[] iArr = B[this.s];
        int[] iArr2 = C[i];
        if (iArr2[0] > 1) {
            qVar.e(this.l).e(this.m);
        }
        int i4 = 1;
        while (true) {
            i2 = iArr2[0];
            if (i4 >= i2) {
                break;
            }
            int i5 = iArr[iArr2[i4]];
            int i6 = i5 * 3;
            int i7 = i5 << 1;
            float[] fArr = this.p;
            float f8 = fArr[i6];
            float f9 = fArr[i6 + 1];
            float[] fArr2 = this.q;
            qVar.c(f8, f9, 0.0f, fArr2[i7], fArr2[i7 + 1]);
            i4++;
        }
        this.r = qVar.g / 3;
        if (i2 > 1) {
            c cVar8 = this.l;
            this.m.c = -1.0f;
            cVar8.c = -1.0f;
            qVar.e(cVar8).e(this.m);
        }
        for (int i8 = iArr2[0]; i8 < iArr2.length; i8++) {
            int i9 = iArr[iArr2[i8]];
            int i10 = i9 * 3;
            int i11 = i9 << 1;
            float[] fArr3 = this.p;
            float f10 = fArr3[i10];
            float f11 = fArr3[i10 + 1];
            float[] fArr4 = this.q;
            qVar.c(f10, f11, -1.0f, fArr4[i11], fArr4[i11 + 1]);
        }
    }

    public void c(q qVar, PointF pointF) {
        char c;
        int i;
        if (v(pointF.x)) {
            c = 4;
        } else {
            float fD = D(pointF.x);
            c cVar = this.l;
            float f = pointF.x;
            c cVar2 = this.i;
            cVar.a(f, cVar2.b, 0.0f, fD, cVar2.e);
            c cVar3 = this.m;
            float f2 = pointF.x;
            c cVar4 = this.j;
            cVar3.a(f2, cVar4.b, 0.0f, fD, cVar4.e);
            c = 1;
        }
        int[] iArr = B[this.s];
        int[] iArr2 = C[c];
        if (iArr2[0] > 1) {
            qVar.e(this.l).e(this.m);
        }
        int i2 = 1;
        while (true) {
            i = iArr2[0];
            if (i2 >= i) {
                break;
            }
            int i3 = iArr[iArr2[i2]];
            int i4 = i3 * 3;
            int i5 = i3 << 1;
            float[] fArr = this.p;
            float f3 = fArr[i4];
            float f4 = fArr[i4 + 1];
            float[] fArr2 = this.q;
            qVar.c(f3, f4, 0.0f, fArr2[i5], fArr2[i5 + 1]);
            i2++;
        }
        this.r = qVar.g / 3;
        if (i > 1) {
            c cVar5 = this.l;
            this.m.c = -1.0f;
            cVar5.c = -1.0f;
            qVar.e(cVar5).e(this.m);
        }
        for (int i6 = iArr2[0]; i6 < iArr2.length; i6++) {
            int i7 = iArr[iArr2[i6]];
            int i8 = i7 * 3;
            int i9 = i7 << 1;
            float[] fArr3 = this.p;
            float f5 = fArr3[i8];
            float f6 = fArr3[i8 + 1];
            float[] fArr4 = this.q;
            qVar.c(f5, f6, -1.0f, fArr4[i9], fArr4[i9 + 1]);
        }
    }

    boolean e(float f, float f2) {
        float f3 = this.a;
        float f4 = this.b;
        if (f3 >= f4) {
            return false;
        }
        float f5 = this.d;
        float f6 = this.c;
        return f5 < f6 && f3 <= f && f < f4 && f5 <= f2 && f2 < f6;
    }

    public void g() {
        GLES20.glDeleteTextures(3, this.t, 0);
        int[] iArr = this.t;
        iArr[0] = -1;
        iArr[1] = -1;
        iArr[2] = -1;
    }

    public void h() {
        int i = this.v;
        if (i > 0) {
            GLES20.glDeleteTextures(i, this.u, 0);
            this.v = 0;
        }
    }

    public void i(p pVar, q qVar) {
        GLES20.glUniformMatrix4fv(pVar.f, 1, false, p.o, 0);
        GLES20.glBindTexture(3553, this.t[0]);
        GLES20.glUniform1i(pVar.i, 0);
        qVar.h(5, pVar.g, pVar.h, 0, this.r);
        GLES20.glBindTexture(3553, this.t[1]);
        GLES20.glUniform1i(pVar.i, 0);
        int i = this.r;
        GLES20.glDrawArrays(5, i, qVar.a - i);
    }

    public void k(p pVar, boolean z2) {
        if (z2) {
            j(pVar, this.t[0]);
        } else {
            j(pVar, this.t[1]);
        }
    }

    int l() {
        int[] iArr = this.t;
        int i = iArr[2];
        return i == -1 ? iArr[0] : i;
    }

    public float m() {
        return this.f;
    }

    void o() {
        c cVar = this.i;
        float f = cVar.b;
        c cVar2 = this.j;
        cVar.b = cVar2.b;
        cVar2.b = f;
        float f2 = cVar.e;
        cVar.e = cVar2.e;
        cVar2.e = f2;
        d();
    }

    public boolean p() {
        return this.t[2] != -1;
    }

    public boolean q() {
        return this.t[0] != -1;
    }

    public boolean r() {
        return this.b <= 0.0f;
    }

    public boolean s() {
        return this.a >= 0.0f;
    }

    public boolean t() {
        return this.t[1] != -1;
    }

    boolean u(float f, float f2) {
        float f3 = this.e * f2;
        float f4 = this.i.a;
        if (f4 < 0.0f) {
            return f < f4 + f3;
        }
        return f > f4 - f3;
    }

    boolean v(float f) {
        if (this.i.a < 0.0f) {
            return f > this.j.a;
        }
        return f < this.j.a;
    }

    public void w(Bitmap bitmap) {
        if (bitmap == null) {
            int[] iArr = this.t;
            int i = iArr[2];
            if (i != -1) {
                int[] iArr2 = this.u;
                int i2 = this.v;
                this.v = i2 + 1;
                iArr2[i2] = i;
            }
            iArr[2] = -1;
            return;
        }
        int iA = k.a(bitmap, 50);
        this.k[2][0] = Color.red(iA) / 255.0f;
        this.k[2][1] = Color.green(iA) / 255.0f;
        this.k[2][2] = Color.blue(iA) / 255.0f;
        GLES20.glGenTextures(1, this.t, 2);
        GLES20.glBindTexture(3553, this.t[2]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
    }

    public void x(Bitmap bitmap) {
        int iA = k.a(bitmap, 30);
        this.k[0][0] = Color.red(iA) / 255.0f;
        this.k[0][1] = Color.green(iA) / 255.0f;
        this.k[0][2] = Color.blue(iA) / 255.0f;
        GLES20.glGenTextures(1, this.t, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.t[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
    }

    public i y() {
        int[] iArr = this.t;
        int i = iArr[0];
        if (i > -1) {
            int[] iArr2 = this.u;
            int i2 = this.v;
            this.v = i2 + 1;
            iArr2[i2] = i;
        }
        float[][] fArr = this.k;
        float[] fArr2 = fArr[0];
        float[] fArr3 = fArr[1];
        fArr2[0] = fArr3[0];
        fArr2[1] = fArr3[1];
        fArr2[2] = fArr3[2];
        iArr[0] = iArr[1];
        iArr[1] = -1;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    i z(boolean z2, float f) {
        if (z2) {
            float f2 = this.a;
            if (f2 < 0.0f) {
                this.i.a = f2;
                this.j.a = this.b;
            } else {
                this.i.a = this.b;
                this.j.a = this.a;
            }
        } else {
            this.i.a = this.b;
            this.j.a = this.a;
        }
        if (f > 0.0f) {
            this.i.b = this.d;
            this.j.b = this.c;
        } else {
            this.i.b = this.c;
            this.j.b = this.d;
        }
        d();
        c cVar = this.i;
        float f3 = cVar.a;
        float f4 = this.a;
        float f5 = this.g;
        cVar.d = (f3 - f4) / f5;
        float f6 = this.c;
        float f7 = f6 - cVar.b;
        float f8 = this.h;
        cVar.e = f7 / f8;
        c cVar2 = this.j;
        cVar2.d = (cVar2.a - f4) / f5;
        cVar2.e = (f6 - cVar2.b) / f8;
        return this;
    }

    public i(float f, float f2, float f3, float f4) {
        n(f, f2, f3, f4);
    }
}
