package com.zentraedi.reader.pageflip;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class f {
    float a;
    float b;
    float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    float k;
    float l;

    public f() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
    }

    public float a() {
        return Math.max(this.e, this.f);
    }

    public f b(float f, float f2) {
        return c(f, f2, this.i, this.j);
    }

    public f c(float f, float f2, float f3, float f4) {
        this.k = f;
        this.l = f2;
        this.i = f3;
        this.j = f4;
        float f5 = (f - f3) - f4;
        this.e = f5;
        this.f = f2;
        float f6 = f5 * 0.5f;
        this.g = f6;
        float f7 = f2 * 0.5f;
        this.h = f7;
        this.a = (-f6) + f3;
        this.b = f6 - f4;
        this.c = f7;
        this.d = -f7;
        return this;
    }

    public f d(float f, float f2) {
        return c(this.k, this.l, f, f2);
    }

    public float e(float f) {
        return f - this.g;
    }

    public float f(float f) {
        return this.h - f;
    }

    public f(float f, float f2, float f3, float f4) {
        c(f, f2, f3, f4);
    }
}
