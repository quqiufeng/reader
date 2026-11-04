package com.zentraedi.reader.simulation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import com.zentraedi.reader.pageflip.j;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public abstract class d {
    public static final int i = 1;
    static final int j = 0;
    static final int k = 1;
    static final int l = 2;
    static final int m = 30;
    private static final Class<?> n = d.class;
    Bitmap b;
    Bitmap d;
    final Context e;
    final Handler f;
    final j g;
    protected c.b h;
    int a = 2;
    Canvas c = new Canvas();

    public d(Context context, j jVar, Handler handler, int i2) {
        this.e = context;
        this.g = jVar;
        this.f = handler;
    }

    protected int a(int i2) {
        return (int) (i2 * this.e.getResources().getDisplayMetrics().scaledDensity);
    }

    abstract void b();

    abstract boolean c(int i2);

    public boolean d(float f, float f2) {
        this.a = 0;
        return true;
    }

    public boolean e(float f, float f2) {
        if (!this.g.b()) {
            return false;
        }
        this.a = 1;
        return true;
    }

    abstract void f(int i2, int i3);

    public void g() {
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            bitmap.recycle();
            this.b = null;
        }
        this.c = null;
        this.d = null;
    }

    public void h(c.b bVar) {
        this.h = bVar;
    }
}
