package com.zentraedi.outreader.widget.fastscrollview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Keep;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mm.opensdk.constants.Build;
import com.zentraedi.basic.function.utils.k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class FastScroller {
    private static final int z = 1500;
    private final FastScrollRecyclerView a;
    private final FastScrollPopup b;
    private final Context c;
    private final int d;
    private final int e;
    private final Paint f;
    private final Paint g;
    private final int k;
    private int l;
    private boolean o;
    private Animator p;
    private boolean q;
    private int r;
    private boolean s;
    private final Runnable t;
    private int u;
    private int v;
    private boolean w;
    private final int x;
    private int y;
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final Rect j = new Rect();
    private final Point m = new Point(-1, -1);
    private final Point n = new Point(0, 0);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FastScroller.this.o) {
                return;
            }
            if (FastScroller.this.p != null) {
                FastScroller.this.p.cancel();
            }
            FastScroller fastScroller = FastScroller.this;
            fastScroller.p = ObjectAnimator.ofInt(fastScroller, "offsetX", (k0.u(fastScroller.a.getResources()) ? -1 : 1) * FastScroller.this.e);
            FastScroller.this.p.setInterpolator(new androidx.interpolator.view.animation.a());
            FastScroller.this.p.setDuration(200L);
            FastScroller.this.p.start();
        }
    }

    class b extends RecyclerView.OnScrollListener {
        b() {
        }

        public void onScrolled(@n0 RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            if (FastScroller.this.a.isInEditMode()) {
                return;
            }
            FastScroller.this.C();
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            super.onAnimationCancel(animation);
            FastScroller.this.q = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            FastScroller.this.q = false;
        }
    }

    public @interface d {
        public static final int Sf = 0;
        public static final int Tf = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
        public static final int Uf = 0;
        public static final int Vf = 1;
    }

    public FastScroller(Context context, FastScrollRecyclerView recyclerView, AttributeSet attrs) {
        this.c = context;
        this.v = 2030043136;
        this.s = true;
        this.r = z;
        Resources resources = context.getResources();
        this.a = recyclerView;
        FastScrollPopup fastScrollPopup = new FastScrollPopup(resources, recyclerView);
        this.b = fastScrollPopup;
        this.d = k0.z(resources, 41.0f);
        this.e = k0.z(resources, 4.0f);
        this.k = k0.z(resources, -24.0f);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.g = paint2;
        this.x = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, com.zentraedi.outreader.d.s.Jp, 0, 0);
        try {
            this.s = typedArrayObtainStyledAttributes.getBoolean(com.zentraedi.outreader.d.s.Kp, true);
            this.r = typedArrayObtainStyledAttributes.getInteger(com.zentraedi.outreader.d.s.Lp, z);
            this.w = typedArrayObtainStyledAttributes.getBoolean(com.zentraedi.outreader.d.s.Mp, true);
            this.u = typedArrayObtainStyledAttributes.getColor(com.zentraedi.outreader.d.s.Tp, 2030043136);
            this.v = typedArrayObtainStyledAttributes.getColor(com.zentraedi.outreader.d.s.Vp, 2030043136);
            int color = typedArrayObtainStyledAttributes.getColor(com.zentraedi.outreader.d.s.Wp, Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE);
            int color2 = typedArrayObtainStyledAttributes.getColor(com.zentraedi.outreader.d.s.Op, -16777216);
            int color3 = typedArrayObtainStyledAttributes.getColor(com.zentraedi.outreader.d.s.Qp, -1);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.zentraedi.outreader.d.s.Rp, k0.A(resources, 44.0f));
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.zentraedi.outreader.d.s.Np, k0.z(resources, 88.0f));
            int integer = typedArrayObtainStyledAttributes.getInteger(com.zentraedi.outreader.d.s.Sp, 0);
            int integer2 = typedArrayObtainStyledAttributes.getInteger(com.zentraedi.outreader.d.s.Pp, 0);
            paint2.setColor(color);
            paint.setColor(this.w ? this.v : this.u);
            fastScrollPopup.h(color2);
            fastScrollPopup.l(color3);
            fastScrollPopup.m(dimensionPixelSize);
            fastScrollPopup.g(dimensionPixelSize2);
            fastScrollPopup.j(integer);
            fastScrollPopup.i(integer2);
            typedArrayObtainStyledAttributes.recycle();
            this.t = new a();
            recyclerView.addOnScrollListener(new b());
            if (this.s) {
                o();
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private boolean n(int x, int y) {
        Rect rect = this.h;
        Point point = this.m;
        int i = point.x;
        int i2 = point.y;
        rect.set(i, i2, this.e + i, this.d + i2);
        Rect rect2 = this.h;
        int i3 = this.k;
        rect2.inset(i3, i3);
        return this.h.contains(x, y);
    }

    public void A(int x, int y) {
        Point point = this.m;
        int i = point.x;
        if (i == x && point.y == y) {
            return;
        }
        Rect rect = this.i;
        Point point2 = this.n;
        int i2 = point2.x;
        rect.set(i + i2, point2.y, i + i2 + this.e, this.a.getHeight() + this.n.y);
        this.m.set(x, y);
        Rect rect2 = this.j;
        int i3 = this.m.x;
        Point point3 = this.n;
        int i4 = point3.x;
        rect2.set(i3 + i4, point3.y, i3 + i4 + this.e, this.a.getHeight() + this.n.y);
        this.i.union(this.j);
        this.a.invalidate(this.i);
    }

    public void B(@l int color) {
        this.g.setColor(color);
        this.a.invalidate(this.i);
    }

    public void C() {
        if (!this.q) {
            Animator animator = this.p;
            if (animator != null) {
                animator.cancel();
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "offsetX", 0);
            this.p = objectAnimatorOfInt;
            objectAnimatorOfInt.setInterpolator(new androidx.interpolator.view.animation.c());
            this.p.setDuration(150L);
            this.p.addListener(new c());
            this.q = true;
            this.p.start();
        }
        if (this.s) {
            o();
        } else {
            g();
        }
    }

    protected void g() {
        RecyclerView.OnItemTouchListener onItemTouchListener = this.a;
        if (onItemTouchListener != null) {
            onItemTouchListener.removeCallbacks(this.t);
        }
    }

    @Keep
    public int getOffsetX() {
        return this.n.x;
    }

    public void h(Canvas canvas) {
        Point point = this.m;
        int i = point.x;
        if (i < 0 || point.y < 0) {
            return;
        }
        Point point2 = this.n;
        canvas.drawRect(i + point2.x, point2.y + this.a.getPaddingTop(), this.m.x + this.n.x + this.e, (this.a.getHeight() + this.n.y) - this.a.getPaddingBottom(), this.g);
        Point point3 = this.m;
        int i2 = point3.x;
        Point point4 = this.n;
        int i3 = point4.x;
        int i4 = point3.y;
        int i5 = point4.y;
        canvas.drawRoundRect(new RectF(i2 + i3, i4 + i5, i2 + i3 + this.e, i4 + i5 + this.d), k0.a(this.c, 6), k0.a(this.c, 6), this.f);
        this.b.c(canvas);
    }

    public void i(boolean enableInactiveColor) {
        this.w = enableInactiveColor;
        this.f.setColor(enableInactiveColor ? this.v : this.u);
    }

    public int j() {
        return this.d;
    }

    public int k() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19, types: [android.view.View, com.zentraedi.outreader.widget.fastscrollview.FastScrollRecyclerView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void l(MotionEvent ev, int downX, int downY, int lastY, com.zentraedi.outreader.widget.fastscrollview.a stateChangeListener) {
        int action = ev.getAction();
        int y = (int) ev.getY();
        if (action == 0) {
            if (n(downX, downY)) {
                this.l = downY - this.m.y;
                return;
            }
            return;
        }
        if (action != 1) {
            if (action == 2) {
                if (!this.o && n(downX, downY) && Math.abs(y - downY) > this.x) {
                    this.a.getParent().requestDisallowInterceptTouchEvent(true);
                    this.o = true;
                    this.l += lastY - downY;
                    this.b.a(true);
                    if (stateChangeListener != null) {
                        stateChangeListener.b();
                    }
                    if (this.w) {
                        this.f.setColor(this.u);
                    }
                }
                if (this.o) {
                    int i = this.y;
                    if (i == 0 || Math.abs(i - y) >= this.x) {
                        this.y = y;
                        boolean zK = this.a.k();
                        int height = this.a.getHeight() - this.d;
                        float fMax = Math.max(0, Math.min(height, y - this.l)) / height;
                        if (zK) {
                            fMax = 1.0f - fMax;
                        }
                        String strM = this.a.m(fMax);
                        this.b.k(strM);
                        this.b.a(!strM.isEmpty());
                        ?? r5 = this.a;
                        r5.invalidate(this.b.o(r5, this.m.y));
                        return;
                    }
                    return;
                }
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.l = 0;
        this.y = 0;
        if (this.o) {
            this.o = false;
            this.b.a(false);
            if (stateChangeListener != null) {
                stateChangeListener.a();
            }
        }
        if (this.w) {
            this.f.setColor(this.v);
        }
    }

    public boolean m() {
        return this.o;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected void o() {
        if (this.a != null) {
            g();
            this.a.postDelayed(this.t, this.r);
        }
    }

    public void p(int hideDelay) {
        this.r = hideDelay;
        if (this.s) {
            o();
        }
    }

    public void q(boolean autoHideEnabled) {
        this.s = autoHideEnabled;
        if (autoHideEnabled) {
            o();
        } else {
            g();
        }
    }

    public void r(int x, int y) {
        Point point = this.n;
        int i = point.x;
        if (i == x && point.y == y) {
            return;
        }
        Rect rect = this.i;
        int i2 = this.m.x;
        rect.set(i2 + i, point.y, i2 + i + this.e, this.a.getHeight() + this.n.y);
        this.n.set(x, y);
        Rect rect2 = this.j;
        int i3 = this.m.x;
        Point point2 = this.n;
        int i4 = point2.x;
        rect2.set(i3 + i4, point2.y, i3 + i4 + this.e, this.a.getHeight() + this.n.y);
        this.i.union(this.j);
        this.a.invalidate(this.i);
    }

    public void s(@l int color) {
        this.b.h(color);
    }

    @Keep
    public void setOffsetX(int x) {
        r(x, this.n.y);
    }

    public void t(@d int popupPosition) {
        this.b.i(popupPosition);
    }

    public void u(@l int color) {
        this.b.l(color);
    }

    public void v(int size) {
        this.b.m(size);
    }

    public void w(Typeface typeface) {
        this.b.n(typeface);
    }

    public void x(@l int color) {
        this.u = color;
        this.f.setColor(color);
        this.a.invalidate(this.i);
    }

    public void y(@l int color) {
        this.v = color;
        i(true);
    }

    @Deprecated
    public void z(boolean thumbInactiveColor) {
        i(thumbInactiveColor);
    }
}
