package com.zentraedi.comic.view;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.j1;
import androidx.annotation.p0;
import androidx.core.view.a2;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.tbs.one.TBSOneErrorCodes;
import com.zentraedi.basic.function.utils.k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@j1
public class r extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 2;
    private static final int J = 0;
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 3;
    private static final int N = 500;
    private static final int O = 1500;
    private static final int P = 1200;
    private static final int Q = 500;
    private static final int R = 255;
    private static final int[] S = {R.attr.state_pressed};
    private static final int[] T = new int[0];
    private int A;
    private final Runnable B;
    private final RecyclerView.OnScrollListener C;
    private final int a;
    private final int b;
    private final StateListDrawable c;
    private final Drawable d;
    private final int e;
    private final int f;
    private final StateListDrawable g;
    private final Drawable h;
    private final int i;
    private final int j;

    @j1
    int k;

    @j1
    int l;

    @j1
    float m;

    @j1
    int n;

    @j1
    int o;

    @j1
    float p;
    private RecyclerView s;
    private final ValueAnimator z;
    private int q = 0;
    private int r = 0;
    private boolean t = false;
    private boolean u = false;
    private int v = 0;
    private int w = 0;
    private final int[] x = new int[2];
    private final int[] y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.hide(TBSOneErrorCodes.OTHER_BASE);
        }
    }

    class b extends RecyclerView.OnScrollListener {
        b() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            r.this.updateScrollPosition(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    private @interface c {
    }

    private class e implements ValueAnimator.AnimatorUpdateListener {
        private e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            r.this.c.setAlpha(iFloatValue);
            r.this.d.setAlpha(iFloatValue);
            r.this.requestRedraw();
        }

        /* synthetic */ e(r rVar, a aVar) {
            this();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    private @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    private @interface g {
    }

    public r(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        a aVar = null;
        valueAnimatorOfFloat.addListener(new d(this, aVar));
        valueAnimatorOfFloat.addUpdateListener(new e(this, aVar));
        attachToRecyclerView(recyclerView);
    }

    private void cancelHide() {
        this.s.removeCallbacks(this.B);
    }

    private void destroyCallbacks() {
        this.s.removeItemDecoration(this);
        this.s.removeOnItemTouchListener(this);
        this.s.removeOnScrollListener(this.C);
        cancelHide();
    }

    private void drawHorizontalScrollbar(Canvas canvas) {
        int i = this.r;
        int i2 = this.i;
        int i3 = i - i2;
        int i4 = this.o;
        int i5 = this.n;
        int i6 = i4 - (i5 / 2);
        this.g.setBounds(0, 0, i5, i2);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, i3);
        this.h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    private void drawVerticalScrollbar(Canvas canvas) {
        int i = this.q;
        int i2 = this.e;
        int i3 = i - i2;
        int i4 = this.l;
        int i5 = this.k;
        int i6 = i4 - (i5 / 2);
        this.c.setBounds(0, 0, i2, i5);
        this.d.setBounds(0, 0, this.f, this.r);
        if (!isLayoutRTL()) {
            canvas.translate(i3, 0.0f);
            this.d.draw(canvas);
            canvas.translate(0.0f, i6);
            this.c.draw(canvas);
            canvas.translate(-i3, -i6);
            return;
        }
        this.d.draw(canvas);
        canvas.translate(this.e, i6);
        canvas.scale(-1.0f, 1.0f);
        this.c.draw(canvas);
        canvas.scale(1.0f, 1.0f);
        canvas.translate(-this.e, -i6);
    }

    private int[] getHorizontalRange() {
        int[] iArr = this.y;
        int i = this.b;
        iArr[0] = i;
        iArr[1] = this.q - i;
        return iArr;
    }

    private int[] getVerticalRange() {
        int[] iArr = this.x;
        int i = this.b;
        iArr[0] = i;
        iArr[1] = this.r - i;
        return iArr;
    }

    private void horizontalScrollTo(float f2) {
        int[] horizontalRange = getHorizontalRange();
        float fMax = Math.max(horizontalRange[0], Math.min(horizontalRange[1], f2));
        if (Math.abs(this.o - fMax) < 2.0f) {
            return;
        }
        int iScrollTo = scrollTo(this.p, fMax, horizontalRange, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
        if (iScrollTo != 0) {
            this.s.scrollBy(iScrollTo, 0);
        }
        this.p = fMax;
    }

    private boolean isLayoutRTL() {
        return a2.e0(this.s) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestRedraw() {
        this.s.invalidate();
    }

    private void resetHideDelay(int i) {
        cancelHide();
        this.s.postDelayed(this.B, i);
    }

    private int scrollTo(float f2, float f3, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f3 - f2) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        if (i == 2 && this.v != 2) {
            this.c.setState(S);
            cancelHide();
        }
        if (i == 0) {
            requestRedraw();
        } else {
            show();
        }
        if (this.v == 2 && i != 2) {
            this.c.setState(T);
            resetHideDelay(P);
        } else if (i == 1) {
            resetHideDelay(O);
        }
        this.v = i;
    }

    private void setupCallbacks() {
        this.s.addItemDecoration(this);
        this.s.addOnItemTouchListener(this);
        this.s.addOnScrollListener(this.C);
    }

    private void verticalScrollTo(float f2) {
        int[] verticalRange = getVerticalRange();
        float fMax = Math.max(verticalRange[0], Math.min(verticalRange[1], f2));
        if (Math.abs(this.l - fMax) < 2.0f) {
            return;
        }
        int iScrollTo = scrollTo(this.m, fMax, verticalRange, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
        if (iScrollTo != 0) {
            this.s.scrollBy(0, iScrollTo);
        }
        this.m = fMax;
    }

    public void attachToRecyclerView(@p0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.s = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
        }
    }

    public void g() {
        hide(0);
    }

    @j1
    Drawable getHorizontalThumbDrawable() {
        return this.g;
    }

    @j1
    Drawable getHorizontalTrackDrawable() {
        return this.h;
    }

    @j1
    Drawable getVerticalThumbDrawable() {
        return this.c;
    }

    @j1
    Drawable getVerticalTrackDrawable() {
        return this.d;
    }

    @j1
    boolean h() {
        return this.v == 0;
    }

    @j1
    void hide(int i) {
        int i2 = this.A;
        if (i2 == 1) {
            this.z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.z.setDuration(i);
        this.z.start();
    }

    public boolean isDragging() {
        return this.v == 2;
    }

    @j1
    boolean isPointInsideHorizontalThumb(float f2, float f3) {
        if (f3 < this.r - this.i) {
            return false;
        }
        int i = this.o;
        int i2 = this.n;
        return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
    }

    @j1
    boolean isPointInsideVerticalThumb(float f2, float f3) {
        if (isLayoutRTL()) {
            if (f2 > this.e / 2) {
                return false;
            }
        } else if (f2 < this.q - this.e) {
            return false;
        }
        int i = this.l;
        int i2 = this.k;
        return f3 >= ((float) (i - (i2 / 2))) && f3 <= ((float) (i + (i2 / 2)));
    }

    @j1
    boolean isVisible() {
        return this.v == 1;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            setState(0);
        } else if (this.A != 0) {
            if (this.t) {
                drawVerticalScrollbar(canvas);
            }
            if (this.u) {
                drawHorizontalScrollbar(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.v;
        if (i != 1) {
            return i == 2;
        }
        boolean zIsPointInsideVerticalThumb = isPointInsideVerticalThumb(motionEvent.getX(), motionEvent.getY());
        boolean zIsPointInsideHorizontalThumb = isPointInsideHorizontalThumb(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zIsPointInsideVerticalThumb && !zIsPointInsideHorizontalThumb)) {
            return false;
        }
        if (zIsPointInsideHorizontalThumb) {
            this.w = 1;
            this.p = (int) motionEvent.getX();
        } else if (zIsPointInsideVerticalThumb) {
            this.w = 2;
            this.m = (int) motionEvent.getY();
        }
        setState(2);
        return true;
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zIsPointInsideVerticalThumb = isPointInsideVerticalThumb(motionEvent.getX(), motionEvent.getY());
            boolean zIsPointInsideHorizontalThumb = isPointInsideHorizontalThumb(motionEvent.getX(), motionEvent.getY());
            if (zIsPointInsideVerticalThumb || zIsPointInsideHorizontalThumb) {
                if (zIsPointInsideHorizontalThumb) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (zIsPointInsideVerticalThumb) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                setState(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            setState(1);
            this.w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.v == 2) {
            show();
            if (this.w == 1) {
                horizontalScrollTo(motionEvent.getX());
            }
            if (this.w == 2) {
                verticalScrollTo(motionEvent.getY());
            }
        }
    }

    public void show() {
        int i = this.A;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }

    void updateScrollPosition(int i, int i2) {
        int iComputeVerticalScrollRange = this.s.computeVerticalScrollRange();
        int i3 = this.r;
        this.t = iComputeVerticalScrollRange - i3 > 0 && i3 >= this.a;
        int iComputeHorizontalScrollRange = this.s.computeHorizontalScrollRange();
        int i4 = this.q;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= this.a;
        this.u = z;
        boolean z2 = this.t;
        if (!z2 && !z) {
            if (this.v != 0) {
                setState(0);
                return;
            }
            return;
        }
        if (z2) {
            float f2 = i3;
            this.l = (int) ((f2 * (i2 + (f2 / 2.0f))) / iComputeVerticalScrollRange);
            this.k = k0.a(this.s.getContext(), 38);
        }
        if (this.u) {
            float f3 = i4;
            this.o = (int) ((f3 * (i + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            this.n = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = this.v;
        if (i5 == 0 || i5 == 1) {
            setState(1);
        }
    }

    private class d extends AnimatorListenerAdapter {
        private boolean a;

        private d() {
            this.a = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
            } else if (((Float) r.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                r.this.A = 0;
                r.this.setState(0);
            } else {
                r.this.A = 2;
                r.this.requestRedraw();
            }
        }

        /* synthetic */ d(r rVar, a aVar) {
            this();
        }
    }
}
