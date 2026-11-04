package com.zentraedi.reader.pageflip;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class l {
    float a;
    float b;
    float c;
    float d;

    public l() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    public void a(float f, float f2, float f3, float f4) {
        if (f < 0.0f || f > 1.0f || f2 < 0.0f || f2 > 1.0f || f3 < 0.0f || f3 > 1.0f || f4 < 0.0f || f4 > 1.0f) {
            throw new IllegalArgumentException("Illegal color or alpha value!");
        }
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public l(float f, float f2, float f3, float f4) {
        a(f, f2, f3, f4);
    }
}
