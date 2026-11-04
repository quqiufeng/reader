package com.zentraedi.reader.reader;

import android.graphics.Paint;
import android.text.TextPaint;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class g {
    public final int a;
    public final int b;
    public final Paint c;
    public final int d;
    public final int e;
    private int f;

    public g(Paint paint, int i, int i2, int i3, int i4) {
        this.c = new TextPaint(paint);
        this.d = i2;
        this.e = i;
        this.a = i3;
        this.b = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj || !(obj instanceof g)) {
            return true;
        }
        g gVar = (g) obj;
        return gVar.c.getTextSize() == this.c.getTextSize() && gVar.d == this.d && gVar.e == this.e && gVar.a == this.a && gVar.b == this.b;
    }

    public int hashCode() {
        if (this.f == 0) {
            int textSize = ((int) (620 + this.c.getTextSize())) * 31;
            int i = this.d;
            this.f = ((((((((textSize + i) * 31) + this.e) * 31) + this.a) * 31) + i) * 31) + this.b;
        }
        return this.f;
    }
}
