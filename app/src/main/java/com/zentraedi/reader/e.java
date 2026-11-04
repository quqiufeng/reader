package com.zentraedi.reader;

import android.content.Context;
import android.util.Log;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class e extends Scroller {
    private static final Interpolator c = new a();
    private boolean a;
    private int b;

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public e(Context context) {
        this(context, c);
    }

    public void a(int i) {
        this.b = i;
    }

    public void b(boolean z) {
        this.a = z;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        if (this.a) {
            super.startScroll(i, i2, i3, i4, 0);
            return;
        }
        int i6 = this.b;
        int i7 = i6 == 0 ? i5 : i6;
        Log.d("MScroller", i7 + "  " + i5);
        super.startScroll(i, i2, i3, i4, i7);
    }

    public e(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }
}
