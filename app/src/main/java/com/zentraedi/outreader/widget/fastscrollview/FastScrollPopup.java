package com.zentraedi.outreader.widget.fastscrollview;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.zentraedi.basic.function.utils.k0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class FastScrollPopup {
    private final FastScrollRecyclerView a;
    private final Resources b;
    private int c;
    private int d;
    private String l;
    private final Paint m;
    private ObjectAnimator p;
    private boolean q;
    private int r;

    @FastScroller.d
    private int s;
    private final Path e = new Path();
    private final RectF f = new RectF();
    private int h = -16777216;
    private final Rect i = new Rect();
    private final Rect j = new Rect();
    private final Rect k = new Rect();
    private final Rect n = new Rect();
    private float o = 1.0f;
    private final Paint g = new Paint(1);

    FastScrollPopup(Resources resources, FastScrollRecyclerView recyclerView) {
        this.b = resources;
        this.a = recyclerView;
        Paint paint = new Paint(1);
        this.m = paint;
        paint.setAlpha(0);
        m(k0.A(resources, 44.0f));
        g(k0.z(resources, 88.0f));
    }

    private float[] b() {
        if (this.s == 1) {
            int i = this.d;
            return new float[]{i, i, i, i, i, i, i, i};
        }
        if (k0.u(this.b)) {
            int i2 = this.d;
            return new float[]{i2, i2, i2, i2, i2, i2, 0.0f, 0.0f};
        }
        int i3 = this.d;
        return new float[]{i3, i3, i3, i3, 0.0f, 0.0f, i3, i3};
    }

    public void a(boolean visible) {
        if (this.q != visible) {
            this.q = visible;
            ObjectAnimator objectAnimator = this.p;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", visible ? 1.0f : 0.0f);
            this.p = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(visible ? 200L : 150L);
            this.p.start();
        }
    }

    public void c(Canvas canvas) {
        float fHeight;
        if (f()) {
            int iSave = canvas.save();
            Rect rect = this.k;
            canvas.translate(rect.left, rect.top);
            this.j.set(this.k);
            this.j.offsetTo(0, 0);
            this.e.reset();
            this.f.set(this.j);
            float[] fArrB = b();
            if (this.r == 1) {
                Paint.FontMetrics fontMetrics = this.m.getFontMetrics();
                fHeight = ((this.k.height() - fontMetrics.ascent) - fontMetrics.descent) / 2.0f;
            } else {
                fHeight = (this.k.height() + this.n.height()) / 2.0f;
            }
            this.e.addRoundRect(this.f, fArrB, Path.Direction.CW);
            this.g.setAlpha((int) (Color.alpha(this.h) * this.o));
            this.m.setAlpha((int) (this.o * 255.0f));
            canvas.drawPath(this.e, this.g);
            canvas.drawText(this.l, (this.k.width() - this.n.width()) / 2.0f, fHeight, this.m);
            canvas.restoreToCount(iSave);
        }
    }

    @FastScroller.d
    public int d() {
        return this.s;
    }

    public int e() {
        return this.r;
    }

    public boolean f() {
        String str;
        return (this.o <= 0.0f || (str = this.l) == null || TextUtils.isEmpty(str)) ? false : true;
    }

    public void g(int size) {
        this.c = size;
        this.d = size / 2;
        this.a.invalidate(this.k);
    }

    @Keep
    public float getAlpha() {
        return this.o;
    }

    public void h(int color) {
        this.h = color;
        this.g.setColor(color);
        this.a.invalidate(this.k);
    }

    public void i(@FastScroller.d int position) {
        this.s = position;
    }

    public void j(int mode) {
        this.r = mode;
    }

    public void k(String sectionName) {
        if (sectionName.equals(this.l)) {
            return;
        }
        this.l = sectionName;
        this.m.getTextBounds(sectionName, 0, sectionName.length(), this.n);
        Rect rect = this.n;
        rect.right = (int) (rect.left + this.m.measureText(sectionName));
    }

    public void l(int color) {
        this.m.setColor(color);
        this.a.invalidate(this.k);
    }

    public void m(int size) {
        this.m.setTextSize(size);
        this.a.invalidate(this.k);
    }

    public void n(Typeface typeface) {
        this.m.setTypeface(typeface);
        this.a.invalidate(this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Rect o(FastScrollRecyclerView recyclerView, int thumbOffsetY) {
        this.i.set(this.k);
        if (f()) {
            int scrollBarWidth = recyclerView.getScrollBarWidth();
            int iRound = Math.round((this.c - this.n.height()) / 10.0f);
            int i = this.c;
            int iMax = Math.max(i, this.n.width() + (iRound * 10));
            if (this.s == 1) {
                this.k.left = (recyclerView.getWidth() - iMax) / 2;
                Rect rect = this.k;
                rect.right = rect.left + iMax;
                rect.top = (recyclerView.getHeight() - i) / 2;
            } else {
                if (k0.u(this.b)) {
                    this.k.left = recyclerView.getScrollBarWidth() * 2;
                    Rect rect2 = this.k;
                    rect2.right = rect2.left + iMax;
                } else {
                    this.k.right = recyclerView.getWidth() - (recyclerView.getScrollBarWidth() * 2);
                    Rect rect3 = this.k;
                    rect3.left = rect3.right - iMax;
                }
                this.k.top = (((recyclerView.getPaddingTop() - recyclerView.getPaddingBottom()) + thumbOffsetY) - i) + (recyclerView.getScrollBarThumbHeight() / 2);
                this.k.top = Math.max(recyclerView.getPaddingTop() + scrollBarWidth, Math.min(this.k.top, ((recyclerView.getPaddingTop() + recyclerView.getHeight()) - scrollBarWidth) - i));
            }
            Rect rect4 = this.k;
            rect4.bottom = rect4.top + i;
        } else {
            this.k.setEmpty();
        }
        this.i.union(this.k);
        return this.i;
    }

    @Keep
    public void setAlpha(float alpha) {
        this.o = alpha;
        this.a.invalidate(this.k);
    }
}
