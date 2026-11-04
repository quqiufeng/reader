package com.zentraedi.reader.pageflip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.widget.Scroller;
import com.zentraedi.basic.function.utils.k0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class j {
    private static final int P = 10;
    private static final int Q = 20;
    private static final int R = 5;
    private static final int S = 65;
    private static final int T = 60;
    private static final float U = 0.08726646f;
    private static final float V = 1.134464f;
    private static final float Y = 0.7222222f;
    private static final float b0 = 0.5f;
    private static final float c0 = 0.4f;
    private static final int d0 = 22;
    private static final float e0 = 0.1f;
    private static final float f0 = 0.25f;
    private static final float g0 = 0.3f;
    private static final float h0 = 0.0f;
    private static final float i0 = 0.05f;
    private static final float j0 = 0.4f;
    private static final float k0 = 0.3f;
    private static final float l0 = 0.0f;
    private static final int m0 = 0;
    private static final int n0 = 1;
    private static final int o0 = 2;
    private static final int p0 = 0;
    private static final int q0 = 1;
    private final Scroller F;
    private final Context G;
    private g N;
    private int c;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private int t;
    static final Class<?> O = j.class;
    private static final float W = (float) Math.tan(0.0872664600610733d);
    private static final float X = (float) Math.tan(1.1344640254974365d);
    private static final float Z = (float) Math.tan(0.5235987755982988d);
    private static final float a0 = (float) Math.tan(0.15707963267948966d);
    private PageFlipState E = PageFlipState.END_FLIP;
    private boolean D = false;
    private final f a = new f();
    private int b = 10;
    private float s = 0.8f;
    private boolean J = true;
    private h M = null;
    private float K = b0;
    private float L = 0.4f;
    private final i[] H = new i[2];
    private int I = 0;
    private final PointF g = new PointF();
    private final PointF h = new PointF();
    private final PointF i = new PointF();
    private final PointF j = new PointF();
    private final PointF k = new PointF();
    private final PointF l = new PointF();
    private final PointF m = new PointF();
    private final PointF d = new PointF();
    private final PointF e = new PointF();
    private final PointF f = new PointF();
    private final o u = new o(5.0f, 30.0f, f0);
    private final o v = new o(2.0f, 40.0f, 0.4f);
    private final p A = new p();
    private final a B = new a();
    private final m C = new m();
    private final q w = new q();
    private final b x = new b();
    private final n y = new n(22, e0, f0, 0.3f, 0.0f);
    private final n z = new n(0, i0, 0.4f, 0.3f, 0.0f);

    public j(Context context) {
        this.G = context;
        this.F = new Scroller(context);
    }

    private void d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = (f * f4) + (f2 * f5);
        double d = (((f * f5) - (f2 * f4)) - f3) / this.r;
        double dSin = Math.sin(d);
        float f11 = this.r;
        float f12 = (float) (((double) f3) + (((double) f11) * dSin));
        this.x.d((f12 * f5) + (f10 * f4) + f8, ((f10 * f5) - (f12 * f4)) + f9, (float) (((double) f11) * (1.0d - Math.cos(d))), (float) dSin, f6, f7);
    }

    private void e(boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        float f12 = (f * f6) + (f2 * f7);
        float f13 = (f3 * f6) + (f4 * f7);
        double d = (((f * f7) - (f2 * f6)) - f5) / this.r;
        double dSin = Math.sin(d);
        double d2 = f5;
        float f14 = this.r;
        float f15 = (float) ((((double) f14) * dSin) + d2);
        float f16 = (f15 * f7) + (f12 * f6) + f10;
        float f17 = ((f12 * f7) - (f15 * f6)) + f11;
        this.x.d(f16, f17, (float) (((double) f14) * (1.0d - Math.cos(d))), (float) dSin, f8, f9);
        float f18 = this.r;
        float fSin = (float) (d2 + (((double) f18) * Math.sin((((f3 * f7) - (f4 * f6)) - f5) / f18)));
        this.y.a(z, f16, f17, (fSin * f7) + (f13 * f6) + f10, ((f13 * f7) - (fSin * f6)) + f11);
    }

    private void f(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        float f11 = (f * f5) - (f2 * f4);
        float f12 = (f * f4) + (f2 * f5);
        float f13 = this.r;
        float fSin = (float) (((double) f3) + (((double) f13) * Math.sin((f11 - f3) / f13)));
        float f14 = (fSin * f5) + (f12 * f4) + f8;
        float f15 = ((f12 * f5) - (fSin * f4)) + f9;
        float f16 = this.p;
        this.z.a(false, f14 + ((f15 - f10) * f16), f10, f6 + f14 + (f16 * ((f15 - f7) - f10)), f10);
    }

    private void g(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = (f * f5) - (f2 * f4);
        float f11 = (f * f4) + (f2 * f5);
        float f12 = this.r;
        double d = (f10 - f3) / f12;
        float fSin = (float) (((double) f3) + (((double) f12) * Math.sin(d)));
        this.w.c((fSin * f5) + (f11 * f4) + f8, ((f11 * f5) - (fSin * f4)) + f9, (float) (((double) this.r) * (1.0d - Math.cos(d))), f6, f7);
    }

    private void h(boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        float f13 = (f * f5) - (f2 * f4);
        float f14 = (f * f4) + (f2 * f5);
        float f15 = this.r;
        double d = (f13 - f3) / f15;
        float fSin = (float) (((double) f3) + (((double) f15) * Math.sin(d)));
        float f16 = (fSin * f5) + (f14 * f4) + f10;
        float f17 = ((f14 * f5) - (fSin * f4)) + f11;
        this.w.c(f16, f17, (float) (((double) this.r) * (1.0d - Math.cos(d))), f8, f9);
        this.z.a(z, f16, f17, f16 + f6, f17 - f7);
    }

    private void i() {
        c cVar = this.H[0].i;
        float f = cVar.a;
        float f2 = cVar.b;
        PointF pointF = this.g;
        float f3 = pointF.x;
        float f4 = f3 - f;
        float f5 = pointF.y - f2;
        float f6 = this.s;
        float f7 = 1.0f - f6;
        float f8 = f6 + 1.0f;
        this.k.set(f3 + ((f5 * f5) / f4), f2);
        PointF pointF2 = this.l;
        PointF pointF3 = this.k;
        pointF2.set(((pointF3.x - f) * f7) + f, pointF3.y);
        PointF pointF4 = this.m;
        PointF pointF5 = this.k;
        pointF4.set(((pointF5.x - f) * f8) + f, pointF5.y);
        this.h.set(f, this.g.y + ((f4 * f4) / f5));
        PointF pointF6 = this.i;
        PointF pointF7 = this.h;
        pointF6.set(pointF7.x, ((pointF7.y - f2) * f7) + f2);
        PointF pointF8 = this.j;
        PointF pointF9 = this.h;
        pointF8.set(pointF9.x, (f8 * (pointF9.y - f2)) + f2);
        PointF pointF10 = this.d;
        float fHypot = (float) Math.hypot(pointF10.x - f, pointF10.y - f2);
        this.q = fHypot;
        this.r = (float) (((double) (fHypot * this.s)) / 3.141592653589793d);
        PointF pointF11 = this.d;
        this.p = (pointF11.y - f2) / (pointF11.x - f);
        l();
    }

    private void j() {
        i iVar = this.H[0];
        c cVar = iVar.i;
        float f = cVar.a;
        float f2 = cVar.b;
        float f3 = iVar.j.b;
        this.d.y = f2;
        PointF pointF = this.g;
        pointF.y = f2;
        float f4 = this.s;
        this.k.set(pointF.x, f2);
        PointF pointF2 = this.l;
        PointF pointF3 = this.k;
        pointF2.set(((pointF3.x - f) * (1.0f - f4)) + f, pointF3.y);
        PointF pointF4 = this.m;
        PointF pointF5 = this.k;
        pointF4.set(((f4 + 1.0f) * (pointF5.x - f)) + f, pointF5.y);
        this.h.set(this.g.x, f3);
        this.i.set(this.l.x, this.h.y);
        this.j.set(this.m.x, this.h.y);
        float fAbs = Math.abs(this.d.x - f);
        this.q = fAbs;
        this.r = (float) (((double) (fAbs * this.s)) / 3.141592653589793d);
        l();
    }

    private void k() {
        int iA = ((int) this.a.a()) / this.b;
        if (iA % 2 != 0) {
            iA++;
        }
        int i = iA + 2;
        this.x.s(i);
        this.w.l((iA << 1) + 8, 3, true);
        this.y.g(i);
        this.z.g(i);
    }

    private void l() {
        float fAbs = Math.abs(this.l.x - this.m.x);
        float fAbs2 = Math.abs(this.i.y - this.j.y);
        if (!this.D) {
            fAbs = Math.min(fAbs, fAbs2);
        }
        int i = (int) fAbs;
        this.t = 0;
        for (int i2 = this.b; i2 >= 1 && this.t < 20; i2 >>= 1) {
            this.t = i / i2;
        }
        int i3 = this.t;
        if (i3 % 2 != 0) {
            this.t = i3 + 1;
        }
        this.t >>= 1;
    }

    private boolean m(float f, Point point, Point point2) {
        h hVar;
        h hVar2;
        i[] iVarArr = this.H;
        i iVar = iVarArr[0];
        if (iVar == null) {
            return false;
        }
        c cVar = iVar.i;
        c cVar2 = iVar.j;
        boolean z = iVarArr[1] != null;
        float f2 = Z;
        float f3 = a0;
        float f4 = cVar.b;
        if ((f4 < 0.0f && cVar.a > 0.0f) || (f4 > 0.0f && cVar.a < 0.0f)) {
            f2 = -f2;
            f3 = -f3;
        }
        if (!z && f < cVar2.a + (iVar.e * this.K) && (hVar2 = this.M) != null && hVar2.b()) {
            this.E = PageFlipState.BACKWARD_FLIP;
            this.p = f3;
            point.set((int) cVar2.a, (int) (cVar.b + ((point.x - cVar.a) * f3)));
            point2.set(((int) cVar.a) - 5, (int) cVar.b);
            return true;
        }
        if (!iVar.u(f, this.K) || (hVar = this.M) == null || !hVar.a()) {
            return false;
        }
        this.E = PageFlipState.FORWARD_FLIP;
        this.p = f2;
        float f5 = cVar.a;
        if (f5 < 0.0f) {
            point.x = (int) ((iVar.e * f0) + f5);
        } else {
            point.x = (int) (f5 - (iVar.e * f0));
        }
        float f6 = cVar.b;
        point.y = (int) (((point.x - f5) * f2) + f6);
        if (!z || f5 >= 0.0f) {
            point2.x = (int) (cVar2.a - iVar.e);
        } else {
            point2.x = (int) (cVar2.a + iVar.e);
        }
        point2.y = (int) f6;
        return true;
    }

    private float n(float f) {
        float f2 = f / this.a.h;
        if (f2 <= 0.2777778f) {
            return X;
        }
        float f3 = 65.0f - (f2 * 60.0f);
        return f3 < 5.0f ? W : (float) Math.tan((((double) f3) * 3.141592653589793d) / 180.0d);
    }

    private void o() {
        if (this.D) {
            j();
            r();
        } else {
            i();
            q();
        }
    }

    private void p(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = 2.0f * f3 * f4;
        float fPow = (float) (1.0d - (Math.pow(f3, 2.0d) * 2.0d));
        float f8 = 0.0f;
        int i = 0;
        int i2 = this.y.f;
        while (i < 11) {
            double d = f8;
            float fCos = (float) (((double) f5) * Math.cos(d));
            float fSin = (float) (((double) f6) * Math.sin(d));
            this.y.h(i2, f, f2, (fCos * fPow) + (fSin * f7) + f, ((fSin * fPow) - (fCos * f7)) + f2);
            i++;
            f8 += 0.15707964f;
            i2 += 8;
        }
    }

    private void q() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        j jVar = this;
        i iVar = jVar.H[0];
        if (iVar == null) {
            return;
        }
        c cVar = iVar.i;
        float f8 = cVar.a;
        float f9 = cVar.b;
        c cVar2 = iVar.j;
        float f10 = cVar2.b;
        float f11 = cVar.d;
        float f12 = cVar.e;
        float f13 = cVar2.e;
        float f14 = iVar.f;
        float f15 = f10 - f9;
        PointF pointF = jVar.d;
        float f16 = pointF.y - f9;
        float f17 = jVar.q;
        float f18 = f16 / f17;
        float f19 = (f8 - pointF.x) / f17;
        int i2 = jVar.t;
        float f20 = (jVar.m.x - f8) * f19;
        float fB = jVar.u.b(jVar.r);
        float fB2 = jVar.v.b(jVar.r);
        float f21 = fB2 * f19;
        float f22 = fB2 * f18;
        float f23 = f9 > 0.0f ? fB : -fB;
        if (f8 <= 0.0f) {
            fB = -fB;
        }
        float f24 = i2;
        float f25 = f23 / f24;
        float f26 = fB / f24;
        jVar.y.f();
        jVar.z.f();
        jVar.w.k();
        jVar.x.k();
        b bVar = jVar.x;
        PointF pointF2 = jVar.d;
        float f27 = fB;
        float f28 = f12;
        int i3 = i2;
        bVar.d(pointF2.x, pointF2.y, 1.0f, 0.0f, f11, f28);
        float f29 = f11;
        float f30 = jVar.l.x;
        float f31 = (f30 - jVar.k.x) / f24;
        float f32 = jVar.i.y;
        float f33 = (f32 - jVar.h.y) / f24;
        float f34 = f30 - f8;
        float f35 = f32 - f9;
        float f36 = f27;
        float f37 = f23;
        int i4 = 0;
        while (i4 <= i3 && Math.abs(f35) < f14) {
            float f38 = f14;
            float f39 = f34;
            int i5 = i4;
            float f40 = f18;
            float f41 = f19;
            float f42 = f27;
            float f43 = f28;
            float f44 = f20;
            jVar.e(true, f39, 0.0f, f39, f37, f44, f40, f41, iVar.D(f34 + f8), f43, f8, f9);
            jVar = this;
            float f45 = f29;
            float f46 = f36;
            jVar.e(false, 0.0f, f35, f46, f35, f44, f40, f41, f45, iVar.E(f35 + f9), f8, f9);
            i4 = i5 + 1;
            f34 = f39 - f31;
            f35 -= f33;
            f37 -= f25;
            f36 = f46 - f26;
            f18 = f40;
            f13 = f13;
            f19 = f41;
            f14 = f38;
            f29 = f45;
            f20 = f44;
            f28 = f43;
            f10 = f10;
            f27 = f42;
        }
        float f47 = f18;
        float f48 = f13;
        float f49 = f19;
        float f50 = f14;
        float f51 = f37;
        float f52 = f28;
        float f53 = f27;
        float f54 = f10;
        float f55 = f20;
        float f56 = f29;
        float f57 = f36;
        float f58 = f34;
        int i6 = i4;
        if (i6 <= i3) {
            if (Math.abs(f35) == f50) {
                f = f47;
                f2 = f49;
                f3 = f55;
                f4 = f48;
                f5 = f56;
            } else if (Math.abs(jVar.i.y - f9) > f50) {
                float f59 = jVar.p;
                float f60 = (2.0f * f59 * (jVar.h.y - f54)) + f8;
                float f61 = f54 + (f59 * (f60 - f8));
                jVar.x.d(f60, f61, 1.0f, 0.0f, f56, f48);
                f5 = f56;
                f4 = f48;
                float f62 = f60 - f57;
                jVar.y.a(false, f60, f61, f62, f54 + (jVar.p * (f62 - f8)));
                f = f47;
                f2 = f49;
                f3 = f55;
            } else {
                f4 = f48;
                f5 = f56;
                float f63 = jVar.p * f15;
                f = f47;
                f2 = f49;
                f3 = f55;
                jVar.e(true, f63, 0.0f, f63, f51, f3, f, f2, iVar.D(f63 + f8), f52, f8, f9);
                e(false, 0.0f, f15, f57, f15, f3, f, f2, f5, f4, f8, f9);
            }
            float f64 = f58;
            float f65 = f51;
            while (i6 <= i3) {
                e(true, f64, 0.0f, f64, f65, f3, f, f2, iVar.D(f64 + f8), f52, f8, f9);
                float f66 = f65;
                float f67 = this.p * ((f35 + f9) - f54);
                float f68 = f3;
                float f69 = f;
                float f70 = f2;
                d(f67, f15, f68, f69, f70, iVar.D(f67 + f8), f4, f8, f9);
                f3 = f68;
                f = f69;
                f2 = f70;
                i6++;
                f64 -= f31;
                f35 -= f33;
                f65 = f66 - f25;
            }
            jVar = this;
        } else {
            f = f47;
            f2 = f49;
            f3 = f55;
            f4 = f48;
            f5 = f56;
        }
        float f71 = f52;
        jVar.x.p();
        float f72 = jVar.k.x;
        float f73 = (f72 - jVar.m.x) / f24;
        float f74 = jVar.h.y;
        float f75 = (f74 - jVar.j.y) / f24;
        float f76 = (f74 - f9) - f75;
        float f77 = (f72 - f8) - f73;
        int i7 = 0;
        while (i7 < i3 && Math.abs(f76) < f50) {
            float f78 = f;
            float f79 = f21;
            float f80 = f3;
            float f81 = f2;
            float f82 = f22;
            jVar.h(true, f77, 0.0f, f80, f78, f81, f79, f82, iVar.D(f77 + f8), f71, f8, f9, f54);
            float f83 = f76;
            jVar = this;
            jVar.h(false, 0.0f, f83, f80, f78, f81, f79, f82, f5, iVar.E(f76 + f9), f8, f9, f54);
            f = f78;
            f2 = f81;
            f3 = f80;
            f76 = f83 - f75;
            f22 = f82;
            i7++;
            f77 -= f73;
            f21 = f79;
            i3 = i3;
            f71 = f71;
        }
        float f84 = f71;
        int i8 = i3;
        float f85 = f21;
        int i9 = i7;
        float f86 = f77;
        float f87 = f22;
        float f88 = f76;
        if (i9 < i8) {
            if (Math.abs(f88) == f50 || i9 <= 0) {
                f6 = f87;
                f7 = f85;
                i = i8;
            } else {
                float f89 = jVar.p * f15;
                float f90 = f2;
                float f91 = f3;
                float f92 = f;
                i = i8;
                jVar.h(true, f89, 0.0f, f91, f92, f90, f85, f87, iVar.D(f89 + f8), f84, f8, f9, f54);
                f6 = f87;
                f7 = f85;
                g(0.0f, f15, f91, f92, f90, f5, iVar.E(f15 + f9), f8, f9);
                f3 = f91;
                f = f92;
                f2 = f90;
            }
            float f93 = f3;
            float f94 = f;
            float f95 = f2;
            float f96 = f7;
            float f97 = f6;
            f(0.0f, f88, f93, f94, f95, f96, f97, f8, f9, f54);
            float f98 = f97;
            f2 = f95;
            float f99 = f96;
            float f100 = f93;
            float f101 = f88;
            int i10 = i9;
            float f102 = f86;
            while (true) {
                f = f94;
                if (i10 >= i) {
                    break;
                }
                int i11 = i10;
                float f103 = f99;
                float f104 = f100;
                float f105 = f2;
                float f106 = f98;
                h(true, f102, 0.0f, f104, f, f105, f103, f106, iVar.D(f102 + f8), f84, f8, f9, f54);
                float f107 = this.p * ((f101 + f9) - f54);
                f94 = f;
                g(f107, f15, f104, f94, f105, iVar.D(f107 + f8), f4, f8, f9);
                f100 = f104;
                f2 = f105;
                i10 = i11 + 1;
                f102 -= f73;
                f101 -= f75;
                f99 = f103;
                f98 = f106;
            }
            jVar = this;
        }
        jVar.y.b = jVar.w.i(2);
        jVar.z.b = -0.5f;
        iVar.b(jVar.w, jVar.m, jVar.j, jVar.p);
        jVar.w.p();
        jVar.z.i();
        PointF pointF3 = jVar.d;
        jVar.p(pointF3.x, pointF3.y, f, f2, -f53, f23);
        jVar.y.i();
    }

    private void r() {
        float f = this.g.x;
        float f2 = (f - this.l.x) / this.t;
        boolean z = false;
        i iVar = this.H[0];
        if (iVar == null) {
            return;
        }
        c cVar = iVar.i;
        float f3 = cVar.b;
        c cVar2 = iVar.j;
        float f4 = cVar2.b;
        float f5 = cVar2.e;
        float f6 = cVar.e;
        float f7 = cVar.d;
        this.x.k();
        int i = 0;
        while (i <= this.t) {
            double d = (f - this.m.x) / this.r;
            float fSin = (float) Math.sin(d);
            float fD = iVar.D(f);
            float f8 = this.m.x;
            boolean z2 = z;
            float f9 = this.r;
            float f10 = f8 + (f9 * fSin);
            float f11 = f;
            float f12 = f2;
            float fCos = (float) (((double) f9) * (1.0d - Math.cos(d)));
            q qVarD = this.x.d(f10, f4, fCos, fSin, fD, f5);
            float f13 = f6;
            qVarD.d(f10, f3, fCos, fSin, fD, f13);
            i++;
            f4 = f4;
            f6 = f13;
            f = f11 - f12;
            z = z2;
            f2 = f12;
        }
        boolean z3 = z;
        float f14 = f4;
        float f15 = this.d.x;
        this.x.d(f15, f4, 1.0f, 0.0f, f7, f5).d(f15, f3, 1.0f, 0.0f, f7, f6).p();
        float f16 = -this.u.b(this.r);
        float fB = this.v.b(this.r);
        if (iVar.i.a < 0.0f) {
            f16 = -f16;
            fB = -fB;
        }
        float f17 = this.x.c[z3 ? 1 : 0];
        float f18 = f17 + fB;
        this.z.h(0, f17, f3, f18, f3).h(8, f17, f14, f18, f14).j(16);
        float f19 = f15 + f16;
        this.y.h(0, f15, f3, f19, f3).h(8, f15, f14, f19, f14).j(16);
        this.w.k();
        iVar.c(this.w, this.m);
        this.w.p();
    }

    private void s() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(33984);
        this.c = iArr[0];
        Bitmap bitmapB = k.b();
        GLES20.glBindTexture(3553, this.c);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLUtils.texImage2D(3553, 0, bitmapB, 0);
        bitmapB.recycle();
    }

    private void t() {
        i iVar = this.H[0];
        if (iVar != null) {
            iVar.g();
        }
        i iVar2 = this.H[1];
        if (iVar2 != null) {
            iVar2.g();
        }
        if (this.I == 1) {
            f fVar = this.a;
            if (fVar.k > fVar.l) {
                i[] iVarArr = this.H;
                f fVar2 = this.a;
                iVarArr[0] = new i(fVar2.a, 0.0f, fVar2.c, fVar2.d);
                i[] iVarArr2 = this.H;
                f fVar3 = this.a;
                iVarArr2[1] = new i(0.0f, fVar3.b, fVar3.c, fVar3.d);
                return;
            }
        }
        i[] iVarArr3 = this.H;
        f fVar4 = this.a;
        iVarArr3[0] = new i(fVar4.a, fVar4.b, fVar4.c, fVar4.d);
        this.H[1] = null;
    }

    private void u() {
        i iVar = this.H[0];
        c cVar = iVar.i;
        c cVar2 = iVar.j;
        Class<?> cls = O;
        nd.a.a(cls.getName(), "************************************");
        nd.a.a(cls.getName(), " Mesh Count:    " + this.t);
        nd.a.a(cls.getName(), " Mesh Pixels:   " + this.b);
        nd.a.a(cls.getName(), " Origin:        " + cVar.a + ", " + cVar.b);
        nd.a.a(cls.getName(), " Diagonal:      " + cVar2.a + ", " + cVar2.b);
        nd.a.a(cls.getName(), " OriginTouchP:  " + this.f.x + ", " + this.f.y);
        nd.a.a(cls.getName(), " TouchP:        " + this.d.x + ", " + this.d.y);
        nd.a.a(cls.getName(), " MiddleP:       " + this.g.x + ", " + this.g.y);
        nd.a.a(cls.getName(), " XFoldP:        " + this.k.x + ", " + this.k.y);
        nd.a.a(cls.getName(), " XFoldP0:       " + this.l.x + ", " + this.l.y);
        nd.a.a(cls.getName(), " XFoldP1:       " + this.m.x + ", " + this.m.y);
        nd.a.a(cls.getName(), " YFoldP:        " + this.h.x + ", " + this.h.y);
        nd.a.a(cls.getName(), " YFoldP0:       " + this.i.x + ", " + this.i.y);
        nd.a.a(cls.getName(), " YFoldP1:       " + this.j.x + ", " + this.j.y);
        String name = cls.getName();
        StringBuilder sb = new StringBuilder();
        sb.append(" LengthT->O:    ");
        sb.append(this.q);
        nd.a.a(name, sb.toString());
    }

    public i A() {
        return this.H[0];
    }

    public PageFlipState B() {
        return this.E;
    }

    public int C() {
        return this.b;
    }

    public i D() {
        return this.H[1];
    }

    public int E() {
        return (int) this.a.l;
    }

    public int F() {
        return (int) this.a.k;
    }

    public void G() {
        Point point = new Point();
        Point point2 = new Point();
        m(k0.l(), point, point2);
        Scroller scroller = this.F;
        int i = point.x;
        int i2 = point.y;
        scroller.startScroll(i, i2, point2.x - i, point2.y - i2, 1000);
    }

    public boolean H() {
        return !this.F.isFinished();
    }

    public boolean I() {
        return this.I == 1;
    }

    public boolean J() {
        PageFlipState pageFlipState = this.E;
        return pageFlipState == PageFlipState.END_FLIP || pageFlipState == PageFlipState.END_WITH_RESTORE || pageFlipState == PageFlipState.END_WITH_BACKWARD || pageFlipState == PageFlipState.END_WITH_FORWARD;
    }

    public boolean K() {
        PageFlipState pageFlipState = this.E;
        return pageFlipState == PageFlipState.BACKWARD_FLIP || pageFlipState == PageFlipState.FORWARD_FLIP || pageFlipState == PageFlipState.RESTORE_FLIP;
    }

    public void L(float f, float f2) {
        float fE = this.a.e(f);
        float f3 = this.a.f(f2);
        if (!this.H[0].e(fE, f3)) {
            i iVar = this.H[1];
            if (iVar == null || !iVar.e(fE, f3)) {
                return;
            }
            i[] iVarArr = this.H;
            i iVar2 = iVarArr[1];
            iVarArr[1] = iVarArr[0];
            iVarArr[0] = iVar2;
        }
        this.n = 0.0f;
        this.o = 0.0f;
        this.e.set(fE, f3);
        this.f.set(fE, f3);
        this.d.set(fE, f3);
        this.E = PageFlipState.BEGIN_FLIP;
    }

    public boolean M(float f, float f2) {
        h hVar;
        h hVar2;
        float fE = this.a.e(f);
        float f3 = this.a.f(f2);
        PointF pointF = this.f;
        float fCeil = f3 - pointF.y;
        float f4 = fE - pointF.x;
        i iVar = this.H[0];
        if (iVar == null) {
            return false;
        }
        c cVar = iVar.i;
        c cVar2 = iVar.j;
        if (this.E == PageFlipState.BEGIN_FLIP && Math.abs(f4) > this.a.e * i0) {
            iVar.z(this.H[1] != null, fCeil);
            float fAbs = Math.abs(this.f.y - cVar.b);
            float fAbs2 = Math.abs(this.f.y - cVar2.b);
            this.n = n(fAbs);
            float fN = n(fAbs2);
            this.o = fN;
            float f5 = cVar.b;
            if ((f5 >= 0.0f || iVar.b <= 0.0f) && (f5 <= 0.0f || iVar.b > 0.0f)) {
                this.o = -fN;
            } else {
                this.n = -this.n;
            }
            if (this.H[1] == null && f4 > 0.0f && (hVar2 = this.M) != null && hVar2.b()) {
                PointF pointF2 = this.f;
                float f6 = cVar.a;
                pointF2.x = f6;
                f4 = fE - f6;
                this.E = PageFlipState.BACKWARD_FLIP;
            } else if (((f4 < 0.0f && cVar.a > 0.0f) || (f4 > 0.0f && cVar.a < 0.0f)) && (hVar = this.M) != null && hVar.a()) {
                this.E = PageFlipState.FORWARD_FLIP;
            }
        }
        PageFlipState pageFlipState = this.E;
        PageFlipState pageFlipState2 = PageFlipState.FORWARD_FLIP;
        if (pageFlipState != pageFlipState2 && pageFlipState != PageFlipState.BACKWARD_FLIP && pageFlipState != PageFlipState.RESTORE_FLIP) {
            return false;
        }
        this.D = Math.abs(fCeil) <= 1.0f;
        float f7 = f4 * (pageFlipState2 == this.E ? 1.2f : 1.1f);
        if ((fCeil < 0.0f && cVar.b < 0.0f) || (fCeil > 0.0f && cVar.b > 0.0f)) {
            float f8 = this.o;
            this.o = this.n;
            this.n = f8;
            iVar.o();
        }
        float f9 = this.n * f7;
        if (Math.abs(fCeil) > Math.abs(f9)) {
            fCeil = f9;
        }
        float f10 = (this.s + 1.0f) * b0;
        if (Math.abs((((fCeil / f7) * fCeil) + f7) * f10) + 2.0f >= iVar.e) {
            float f11 = (((cVar2.a - cVar.a) / f10) - f7) * f7;
            if (f11 < 0.0f) {
                return false;
            }
            double dSqrt = Math.sqrt(f11);
            fCeil = (int) (cVar.b > 0.0f ? Math.ceil(-dSqrt) : Math.floor(dSqrt));
        }
        this.e.set(fE, f3);
        this.d.set(f7 + cVar.a, fCeil + cVar.b);
        PointF pointF3 = this.g;
        PointF pointF4 = this.d;
        pointF3.x = (pointF4.x + cVar.a) * b0;
        pointF3.y = (pointF4.y + cVar.b) * b0;
        o();
        return true;
    }

    public boolean N(float f, float f2, int i) {
        float fE = this.a.e(f);
        float f3 = this.a.f(f2);
        i[] iVarArr = this.H;
        i iVar = iVarArr[0];
        if (iVar == null) {
            return false;
        }
        c cVar = iVar.i;
        c cVar2 = iVar.j;
        boolean z = iVarArr[1] != null;
        PointF pointF = this.d;
        Point point = new Point((int) pointF.x, (int) pointF.y);
        Point point2 = new Point(0, 0);
        PageFlipState pageFlipState = this.E;
        PageFlipState pageFlipState2 = PageFlipState.FORWARD_FLIP;
        if (pageFlipState == pageFlipState2) {
            if (iVar.u(fE, this.L)) {
                point2.x = (int) cVar.a;
                this.E = PageFlipState.RESTORE_FLIP;
            } else if (!z || cVar.a >= 0.0f) {
                point2.x = (int) (cVar2.a - iVar.e);
            } else {
                point2.x = (int) (cVar2.a + iVar.e);
            }
            point2.y = (int) cVar.b;
        } else if (pageFlipState == PageFlipState.BACKWARD_FLIP) {
            if (iVar.u(fE, 0.7f)) {
                PointF pointF2 = this.d;
                float f4 = pointF2.y;
                float f5 = cVar.b;
                float f6 = pointF2.x;
                float f7 = cVar.a;
                this.n = (f4 - f5) / (f6 - f7);
                point2.set((int) f7, (int) f5);
            } else {
                this.E = pageFlipState2;
                point2.set((int) (cVar2.a - iVar.e), (int) cVar.b);
            }
        } else if (pageFlipState == PageFlipState.BEGIN_FLIP) {
            this.D = false;
            this.E = PageFlipState.END_FLIP;
            iVar.z(z, -f3);
            g gVar = this.N;
            if (gVar != null && gVar.b()) {
                return false;
            }
            if (this.J && Math.abs(fE - this.f.x) < 2.0f) {
                if (m(fE, point, point2)) {
                    nd.a.a(O.getName(), "");
                } else {
                    g gVar2 = this.N;
                    if (gVar2 != null) {
                        gVar2.a();
                    }
                }
            }
        }
        PageFlipState pageFlipState3 = this.E;
        if (pageFlipState3 != pageFlipState2 && pageFlipState3 != PageFlipState.BACKWARD_FLIP && pageFlipState3 != PageFlipState.RESTORE_FLIP) {
            return false;
        }
        Scroller scroller = this.F;
        int i2 = point.x;
        int i3 = point.y;
        scroller.startScroll(i2, i3, point2.x - i2, point2.y - i3, i);
        return true;
    }

    public void O(int i, int i2) {
        this.a.b(i, i2);
        GLES20.glViewport(0, 0, i, i2);
        p pVar = this.A;
        f fVar = this.a;
        float f = fVar.g;
        float f2 = fVar.h;
        pVar.f(-f, f, -f2, f2);
        k();
        t();
    }

    public void P() throws PageFlipException {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glEnable(2929);
        try {
            this.A.e(this.G);
            this.B.e(this.G);
            this.C.e(this.G);
            s();
        } catch (PageFlipException e) {
            this.A.a();
            this.B.a();
            this.C.a();
            throw e;
        }
    }

    public j Q(h hVar) {
        this.M = hVar;
        return this;
    }

    public j R(int i) {
        this.x.u(i);
        return this;
    }

    public void S(g gVar) {
        this.N = gVar;
    }

    public j T(int i) {
        if (i <= 0) {
            i = 10;
        }
        this.b = i;
        return this;
    }

    public j U(float f) {
        if (f > 0.0f && f <= 1.0f) {
            this.s = f;
            return this;
        }
        throw new IllegalArgumentException("Invalid ratio value: " + f);
    }

    public j V(float f, float f2, float f3, float f4) {
        this.z.e.a(f, f2, f3, f4);
        return this;
    }

    public j W(float f, float f2, float f3, float f4) {
        this.y.e.a(f, f2, f3, f4);
        return this;
    }

    public j X(float f, float f2, float f3) {
        this.v.a(f, f2, f3);
        return this;
    }

    public j Y(float f, float f2, float f3) {
        this.u.a(f, f2, f3);
        return this;
    }

    public j Z(float f) {
        if (f > 0.0f && f <= b0) {
            this.K = f;
            return this;
        }
        throw new IllegalArgumentException("Invalid ratio value: " + f);
    }

    public void a() {
        this.F.abortAnimation();
        PageFlipState pageFlipState = this.E;
        if (pageFlipState == PageFlipState.FORWARD_FLIP) {
            this.E = PageFlipState.END_WITH_FORWARD;
        } else if (pageFlipState == PageFlipState.BACKWARD_FLIP) {
            this.E = PageFlipState.END_WITH_BACKWARD;
        } else if (pageFlipState == PageFlipState.RESTORE_FLIP) {
            this.E = PageFlipState.END_WITH_RESTORE;
        }
    }

    public j a0(float f) {
        if (f > 0.0f && f <= b0) {
            this.L = f;
            return this;
        }
        throw new IllegalArgumentException("Invalid ratio value: " + f);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0123  */
    public boolean b() {
        boolean z = false;
        i iVar = this.H[0];
        if (iVar == null) {
            return false;
        }
        c cVar = iVar.i;
        c cVar2 = iVar.j;
        boolean zIsFinished = this.F.isFinished();
        boolean z2 = !zIsFinished;
        if (!zIsFinished) {
            this.F.computeScrollOffset();
            this.d.set(this.F.getCurrX(), this.F.getCurrY());
            PageFlipState pageFlipState = this.E;
            if (pageFlipState == PageFlipState.BACKWARD_FLIP || pageFlipState == PageFlipState.RESTORE_FLIP) {
                PointF pointF = this.d;
                float f = pointF.x;
                float f2 = cVar.a;
                pointF.y = ((f - f2) * this.p) + cVar.b;
                z2 = Math.abs(f - f2) > 10.0f;
            } else {
                this.D = Math.abs(this.d.y - cVar.b) < 1.0f;
            }
            PointF pointF2 = this.g;
            PointF pointF3 = this.d;
            pointF2.set((pointF3.x + cVar.a) * b0, (pointF3.y + cVar.b) * b0);
            if (this.D) {
                j();
            } else {
                i();
            }
            if (this.H[1] != null) {
                if (iVar.v(this.m.x)) {
                    this.m.x = cVar2.a;
                    float f3 = (this.d.x - cVar.a) / this.q;
                    float fAbs = iVar.e * Math.abs(f3);
                    float f4 = this.q;
                    float f5 = 1.0f - (fAbs / f4);
                    this.r = (float) (((double) ((1.0f - (f5 * 2.0f)) * f4)) / 3.141592653589793d);
                    PointF pointF4 = this.l;
                    float f6 = (f4 * f5) / f3;
                    float f7 = cVar.a;
                    float f8 = f6 + f7;
                    pointF4.x = f8;
                    if (this.D) {
                        this.i.x = f8;
                        this.j.x = this.m.x;
                    } else {
                        PointF pointF5 = this.j;
                        float f9 = cVar.b;
                        float f10 = this.m.x - f7;
                        float f11 = this.p;
                        pointF5.y = (f10 / f11) + f9;
                        this.i.y = f9 + ((f8 - f7) / f11);
                    }
                    float fAbs2 = Math.abs(this.g.x - pointF4.x);
                    if (this.t > fAbs2) {
                        this.t = (int) fAbs2;
                    }
                    if (this.t > 0 && Math.abs(this.l.x - cVar2.a) >= 2.0f) {
                        z = true;
                    }
                    z2 = z;
                }
            } else if (this.E == PageFlipState.FORWARD_FLIP) {
                if (((this.j.y - cVar2.b) * this.p) + ((float) (((double) (this.q * this.s)) / 3.141592653589793d)) > cVar2.a - cVar.a) {
                    z = true;
                }
                z2 = z;
            }
        }
        if (!z2) {
            a();
            return z2;
        }
        if (this.D) {
            r();
            return z2;
        }
        q();
        return z2;
    }

    public boolean c(float f, float f2) {
        return this.E == PageFlipState.FORWARD_FLIP && !this.H[0].e(this.a.e(f), this.a.f(f2));
    }

    public void v() {
        this.H[0].h();
        i iVar = this.H[1];
        if (iVar != null) {
            iVar.h();
        }
    }

    public void w() {
        GLES20.glClear(16640);
        boolean z = this.H[1] != null;
        GLES20.glUseProgram(this.B.b);
        GLES20.glActiveTexture(33984);
        this.x.r(this.B, this.H[0], z, this.c);
        GLES20.glUseProgram(this.A.b);
        GLES20.glActiveTexture(33984);
        this.H[0].i(this.A, this.w);
        if (z) {
            this.H[1].k(this.A, true);
        }
        GLES20.glUseProgram(this.C.b);
        this.z.d(this.C);
        this.y.d(this.C);
    }

    public void x() {
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.A.b);
        GLES20.glUniformMatrix4fv(this.A.f, 1, false, p.o, 0);
        GLES20.glActiveTexture(33984);
        this.H[0].k(this.A, true);
        i iVar = this.H[1];
        if (iVar != null) {
            iVar.k(this.A, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    public boolean y(boolean z) {
        if (this.I == z) {
            return false;
        }
        this.I = z ? 1 : 0;
        if (!z) {
            return !z ? false : false;
        }
        f fVar = this.a;
        if (fVar.k <= fVar.l || this.H[1] != null) {
            if (!z || this.H[1] == null) {
            }
        }
        t();
        return true;
    }

    public j z(boolean z) {
        this.J = z;
        return this;
    }
}
