package com.zentraedi.reader.pageflip;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
final class o {
    float a;
    float b;
    float c;

    public o(float f, float f2, float f3) {
        a(f, f2, f3);
    }

    public void a(float f, float f2, float f3) {
        if (f >= 0.0f && f2 >= 0.0f && f <= f2 && f3 > 0.0f && f3 <= 1.0f) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            return;
        }
        throw new IllegalArgumentException("One of Min(" + f + ") Max(" + f2 + ") Ration(" + f3 + ")is invalid!");
    }

    public float b(float f) {
        float f2 = f * this.c;
        float f3 = this.a;
        return f2 < f3 ? f3 : Math.min(f2, this.b);
    }
}
