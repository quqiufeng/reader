package com.zentraedi.comic.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.comic.viewmodel.PageOver;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nZoomRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoomRecyclerView.kt\ncom/zentraedi/comic/view/ZoomRecyclerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,711:1\n1#2:712\n*E\n"})
public final class e0 extends RecyclerView {

    @fo.k
    public static final a S = new a(null);
    private static final int T = 100;
    private static final float U = 1.0f;
    private static final float V = 10.0f;
    private static final float W = 2.0f;
    private static final float a0 = 1.0f;

    @fo.k
    private static final String b0 = "scale";

    @fo.k
    private static final String c0 = "tranX";

    @fo.k
    private static final String d0 = "tranY";
    private static final float e0 = -1.0f;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private ValueAnimator E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private int N;
    private boolean O;
    private float P;
    private float Q;
    private float R;

    @fo.l
    private RecyclerView.OnScrollListener a;

    @fo.l
    private w b;
    private boolean c;

    @fo.l
    private ArrayList<RecyclerView.OnScrollListener> d;

    @fo.l
    private ScaleGestureDetector e;

    @fo.l
    private androidx.core.view.e0 f;

    @fo.l
    private c g;

    @fo.l
    private v h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private boolean q;
    private boolean r;
    private float s;

    @fo.l
    private PageOver t;
    private boolean u;
    private int v;
    private float w;
    private float x;
    private float y;
    private float z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(@fo.k MotionEvent e) {
            float mDefaultScaleFactor;
            Intrinsics.checkNotNullParameter(e, "e");
            float mScaleFactor = e0.this.getMScaleFactor();
            if (e0.this.getMScaleFactor() == e0.this.getMDefaultScaleFactor()) {
                e0.this.setMScaleCenterX(e.getX());
                e0.this.setMScaleCenterY(e.getY());
                mDefaultScaleFactor = e0.this.getMClickScaleFactor();
            } else {
                e0 e0Var = e0.this;
                e0Var.setMScaleCenterX(e0Var.getMScaleFactor() == 1.0f ? e.getX() : (-e0.this.getMTranX()) / (e0.this.getMScaleFactor() - 1));
                e0 e0Var2 = e0.this;
                e0Var2.setMScaleCenterY(e0Var2.getMScaleFactor() == 1.0f ? e.getY() : (-e0.this.getMTranY()) / (e0.this.getMScaleFactor() - 1));
                mDefaultScaleFactor = e0.this.getMDefaultScaleFactor();
            }
            e0.this.setHandMove(false);
            e0.this.o(mScaleFactor, mDefaultScaleFactor);
            e0.this.setMResponseScaling(false);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(@fo.k MotionEvent e) {
            c mPageClickListener;
            Intrinsics.checkNotNullParameter(e, "e");
            if (e0.this.getMScaleFactor() <= 1.0f && (mPageClickListener = e0.this.getMPageClickListener()) != null) {
                mPageClickListener.a(e);
            }
            return super.onSingleTapConfirmed(e);
        }
    }

    public interface c {
        void a(@fo.l MotionEvent motionEvent);
    }

    private final class d implements ScaleGestureDetector.OnScaleGestureListener {
        public d() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(@fo.k ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            float mScaleFactor = e0.this.getMScaleFactor();
            e0 e0Var = e0.this;
            e0Var.setMScaleFactor(e0Var.getMScaleFactor() * detector.getScaleFactor());
            e0 e0Var2 = e0.this;
            e0Var2.setMScaleFactor(Math.max(e0Var2.getMMinScaleFactor(), Math.min(e0.this.getMScaleFactor(), e0.this.getMMaxScaleFactor())));
            float mViewWidth = e0.this.getMViewWidth() + e0.this.getCanMoveX();
            float mViewHeight = e0.this.getMViewHeight() + e0.this.getCanMoveY();
            float mScaleFactor2 = mViewWidth * e0.this.getMScaleFactor();
            float mScaleFactor3 = mViewHeight * e0.this.getMScaleFactor();
            e0 e0Var3 = e0.this;
            e0Var3.setMMaxTranX(mScaleFactor2 > e0Var3.getMViewWidth() ? e0.this.getMViewWidth() - mScaleFactor2 : (e0.this.getMViewWidth() - mScaleFactor2) / 2);
            e0 e0Var4 = e0.this;
            e0Var4.setMMaxTranY(mScaleFactor3 > e0Var4.getMViewHeight() ? e0.this.getMViewHeight() - mScaleFactor3 : (e0.this.getMViewHeight() - mScaleFactor3) / 2);
            float focusX = detector.getFocusX();
            float focusY = detector.getFocusY();
            e0 e0Var5 = e0.this;
            e0Var5.setMTranX(focusX - ((focusX - e0Var5.getMTranX()) * (e0.this.getMScaleFactor() / mScaleFactor)));
            e0 e0Var6 = e0.this;
            e0Var6.setMTranY(focusY - ((focusY - e0Var6.getMTranY()) * (e0.this.getMScaleFactor() / mScaleFactor)));
            e0.this.e();
            e0 e0Var7 = e0.this;
            e0Var7.setMScale(e0Var7.getMScaleFactor());
            e0.this.setHandMove(false);
            w mOnZoomListener = e0.this.getMOnZoomListener();
            if (mOnZoomListener != null) {
                mOnZoomListener.a(e0.this.getMScale());
            }
            e0.this.invalidate();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(@fo.k ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            if (e0.this.E != null) {
                ValueAnimator valueAnimator = e0.this.E;
                ValueAnimator valueAnimator2 = null;
                if (valueAnimator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mScaleAnimator");
                    valueAnimator = null;
                }
                if (valueAnimator.isRunning()) {
                    ValueAnimator valueAnimator3 = e0.this.E;
                    if (valueAnimator3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mScaleAnimator");
                    } else {
                        valueAnimator2 = valueAnimator3;
                    }
                    valueAnimator2.cancel();
                }
            }
            e0.this.setScaling(true);
            e0.this.setMoveToY0(false);
            e0.this.stopScroll();
            ViewParent parent = e0.this.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(@fo.k ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            e0.this.setScaling(false);
            if (e0.this.getMScaleFactor() <= e0.this.getMDefaultScaleFactor()) {
                e0 e0Var = e0.this;
                float f = 1;
                e0Var.setMScaleCenterX((-e0Var.getMTranX()) / (e0.this.getMScaleFactor() - f));
                e0 e0Var2 = e0.this;
                e0Var2.setMScaleCenterY((-e0Var2.getMTranY()) / (e0.this.getMScaleFactor() - f));
                e0 e0Var3 = e0.this;
                e0Var3.setMScaleCenterX(Math.abs(e0Var3.getMScaleCenterX()) <= Float.MAX_VALUE ? e0.this.getMScaleCenterX() : 0.0f);
                e0 e0Var4 = e0.this;
                e0Var4.setMScaleCenterY(Math.abs(e0Var4.getMScaleCenterY()) <= Float.MAX_VALUE ? e0.this.getMScaleCenterY() : 0.0f);
                e0 e0Var5 = e0.this;
                e0Var5.o(e0Var5.getMScaleFactor(), e0.this.getMDefaultScaleFactor());
                e0.this.setMResponseScaling(false);
            }
            e0.this.invalidate();
        }
    }

    public static final class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            e0.this.setScaling(false);
            e0.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            e0.this.setScaling(false);
            e0.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            e0.this.setScaling(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(@fo.k Context context, @fo.l AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.n = 1.0f;
        this.u = true;
        this.v = -1;
        this.D = true;
        this.O = true;
        this.e = new ScaleGestureDetector(context, new d());
        this.f = new androidx.core.view.e0(context, new b());
        this.J = V;
        this.K = W;
        this.L = 1.0f;
        this.M = 1.0f;
        this.m = 1.0f;
        this.N = 100;
        this.P = e0;
        this.Q = e0;
        this.R = e0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        float[] fArrF = f(this.k, this.l);
        this.k = fArrF[0];
        this.l = fArrF[1];
    }

    private final float[] f(float f, float f2) {
        if (this.m < 1.0f) {
            return new float[]{f, f2};
        }
        if (f > 0.0f) {
            f = 0.0f;
        } else {
            float f3 = this.H;
            if (f < f3) {
                f = f3;
            }
        }
        if (f2 > 0.0f) {
            f2 = 0.0f;
        } else if (f2 < getMMaxTranY()) {
            f2 = getMMaxTranY();
        }
        return new float[]{f, f2};
    }

    private final void h(float f) {
        o(this.m, f);
    }

    private final void j() {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        ValueAnimator valueAnimator2 = this.E;
        ValueAnimator valueAnimator3 = null;
        if (valueAnimator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mScaleAnimator");
            valueAnimator2 = null;
        }
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zentraedi.comic.view.d0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                e0.k(this.a, valueAnimator4);
            }
        });
        ValueAnimator valueAnimator4 = this.E;
        if (valueAnimator4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mScaleAnimator");
        } else {
            valueAnimator3 = valueAnimator4;
        }
        valueAnimator3.addListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(e0 e0Var, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        try {
            Object animatedValue = animation.getAnimatedValue(b0);
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            e0Var.m = ((Float) animatedValue).floatValue();
            Object animatedValue2 = animation.getAnimatedValue(c0);
            Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue2).floatValue();
            Object animatedValue3 = animation.getAnimatedValue(d0);
            Intrinsics.checkNotNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
            e0Var.m(fFloatValue, ((Float) animatedValue3).floatValue());
            e0Var.q = false;
            e0Var.invalidate();
        } catch (Exception unused) {
            e0Var.m = e0Var.L;
        }
    }

    private final void m(float f, float f2) {
        this.k = f;
        this.l = f2;
    }

    private final void n() {
        float f = this.m;
        if (f <= 1.0f) {
            float f2 = this.p;
            this.H = f2 == 0.0f ? 0.0f : -f2;
            float f3 = this.o;
            this.I = f3 != 0.0f ? -f3 : 0.0f;
            return;
        }
        float f4 = this.i;
        float f5 = this.p + f4;
        float f6 = this.j;
        float f7 = f5 * f;
        float f8 = (this.o + f6) * f;
        this.H = f7 > f4 ? f4 - f7 : (f4 - f7) / 2;
        this.I = f8 > f6 ? f6 - f8 : (f6 - f8) / 2;
    }

    public void addOnScrollListener(@fo.k RecyclerView.OnScrollListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.d == null) {
            this.d = new ArrayList<>();
        }
        ArrayList<RecyclerView.OnScrollListener> arrayList = this.d;
        Intrinsics.checkNotNull(arrayList);
        arrayList.add(listener);
        super.addOnScrollListener(listener);
    }

    public void clearOnScrollListeners() {
        ArrayList<RecyclerView.OnScrollListener> arrayList = this.d;
        if (arrayList != null) {
            Intrinsics.checkNotNull(arrayList);
            arrayList.clear();
        }
        super.clearOnScrollListeners();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void dispatchDraw(@fo.k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        if (this.q && !this.c && this.m <= 1.0f) {
            this.k = 0.0f;
            this.s = this.l;
        }
        if (this.r && this.m <= 1.0f) {
            this.l = 0.0f;
        }
        if (this.P != this.k || this.Q != this.l || this.R != this.m) {
            com.zentraedi.comic.util.a.a.b("ZoomRecyclerView", "dispatchDraw: mTranX=" + this.k + ", mTranY=" + this.l + ", mScaleFactor=" + this.m);
            this.P = this.k;
            this.Q = this.l;
            this.R = this.m;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewFindViewById = getChildAt(i).findViewById(com.zentraedi.comic.q.i.zx);
            ComicTiledImageView comicTiledImageView = viewFindViewById instanceof ComicTiledImageView ? (ComicTiledImageView) viewFindViewById : null;
            if (comicTiledImageView != null) {
                comicTiledImageView.D();
            }
        }
        canvas.translate(this.k, this.l);
        float f = this.m;
        canvas.scale(f, f);
        super/*android.view.ViewGroup*/.dispatchDraw(canvas);
        canvas.restore();
    }

    public boolean fling(int i, int i2) {
        if (this.t == PageOver.SCROLL) {
            return super.fling(i, i2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(@fo.k View child, @fo.k RectF output) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(output, "output");
        if (!child.isAttachedToWindow() || child.getWidth() <= 0 || child.getHeight() <= 0) {
            return false;
        }
        Rect rect = new Rect(0, 0, child.getWidth(), child.getHeight());
        offsetDescendantRectToMyCoords(child, rect);
        Float fValueOf = Float.valueOf(this.m);
        if (fValueOf.floatValue() <= 0.0f) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
        output.set(Math.max(rect.left, (-this.k) / fFloatValue) - rect.left, Math.max(rect.top, (-this.l) / fFloatValue) - rect.top, Math.min(rect.right, (getWidth() - this.k) / fFloatValue) - rect.left, Math.min(rect.bottom, (getHeight() - this.l) / fFloatValue) - rect.top);
        return !output.isEmpty();
    }

    public final boolean getAllowImageScrollOnTurn() {
        return this.u;
    }

    public final float getCanMoveX() {
        return this.p;
    }

    public final float getCanMoveY() {
        return this.o;
    }

    public final boolean getHandMove() {
        return this.q;
    }

    public final int getMActivePointerId() {
        return this.v;
    }

    public final float getMClickScaleFactor() {
        return this.K;
    }

    public final float getMDefaultScaleFactor() {
        return this.M;
    }

    @fo.l
    public final androidx.core.view.e0 getMGestureDetector() {
        return this.f;
    }

    public final float getMMaxScaleFactor() {
        return this.J;
    }

    public final float getMMaxTranX() {
        return this.H;
    }

    public final float getMMaxTranY() {
        if (Math.abs(this.I) < 0.1d) {
            return 0.0f;
        }
        return this.I;
    }

    public final float getMMinScaleFactor() {
        return this.L;
    }

    @fo.l
    public final v getMOnRecyclerViewListener() {
        return this.h;
    }

    @fo.l
    public final w getMOnZoomListener() {
        return this.b;
    }

    @fo.l
    public final c getMPageClickListener() {
        return this.g;
    }

    public final boolean getMResponseScaling() {
        return this.O;
    }

    public final float getMScale() {
        if (Math.abs(this.n) < 1.01d) {
            return 1.0f;
        }
        return this.n;
    }

    public final float getMScaleCenterX() {
        return this.F;
    }

    public final float getMScaleCenterY() {
        return this.G;
    }

    @fo.l
    public final ScaleGestureDetector getMScaleDetector() {
        return this.e;
    }

    public final int getMScaleDuration() {
        return this.N;
    }

    public final float getMScaleFactor() {
        return this.m;
    }

    public final float getMTranX() {
        return this.k;
    }

    public final float getMTranY() {
        return this.l;
    }

    public final float getMViewHeight() {
        return this.j;
    }

    public final float getMViewWidth() {
        return this.i;
    }

    public final boolean getMoveToY0() {
        return this.r;
    }

    public final float getMoveY0() {
        return this.s;
    }

    @fo.l
    public final PageOver getPageOver() {
        return this.t;
    }

    public final boolean getReadScrollModel() {
        return this.c;
    }

    public final boolean i() {
        return this.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        this.r = true;
        this.k = 0.0f;
        this.l = 0.0f;
        invalidate();
    }

    public final void o(float f, float f2) {
        if (f == f2) {
            return;
        }
        ValueAnimator valueAnimator = this.E;
        ValueAnimator valueAnimator2 = null;
        if (valueAnimator != null) {
            if (valueAnimator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mScaleAnimator");
                valueAnimator = null;
            }
            if (valueAnimator.isRunning()) {
                return;
            }
        }
        this.r = false;
        this.n = f2;
        this.q = false;
        w wVar = this.b;
        if (wVar != null) {
            wVar.a(getMScale());
        }
        j();
        if (f2 < this.L) {
            return;
        }
        float f3 = this.i;
        float f4 = this.p + f3;
        float f5 = this.j;
        float f6 = f4 * f2;
        float f7 = (this.o + f5) * f2;
        this.H = f6 > f3 ? f3 - f6 : (f3 - f6) / 2;
        this.I = f7 > f5 ? f5 - f7 : (f5 - f7) / 2;
        float f8 = this.k;
        float f9 = this.l;
        float f10 = f2 - f;
        float[] fArrF = f(f8 - (this.F * f10), f9 - (f10 * this.G));
        float f11 = fArrF[0];
        float f12 = fArrF[1];
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(b0, f, f2);
        Intrinsics.checkNotNullExpressionValue(propertyValuesHolderOfFloat, "ofFloat(...)");
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat(c0, f8, f11);
        Intrinsics.checkNotNullExpressionValue(propertyValuesHolderOfFloat2, "ofFloat(...)");
        PropertyValuesHolder propertyValuesHolderOfFloat3 = PropertyValuesHolder.ofFloat(d0, f9, f12);
        Intrinsics.checkNotNullExpressionValue(propertyValuesHolderOfFloat3, "ofFloat(...)");
        ValueAnimator valueAnimator3 = this.E;
        if (valueAnimator3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mScaleAnimator");
            valueAnimator3 = null;
        }
        valueAnimator3.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2, propertyValuesHolderOfFloat3);
        ValueAnimator valueAnimator4 = this.E;
        if (valueAnimator4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mScaleAnimator");
            valueAnimator4 = null;
        }
        valueAnimator4.setDuration(this.N);
        ValueAnimator valueAnimator5 = this.E;
        if (valueAnimator5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mScaleAnimator");
        } else {
            valueAnimator2 = valueAnimator5;
        }
        valueAnimator2.start();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    protected void onMeasure(int i, int i2) {
        this.i = View.MeasureSpec.getSize(i);
        this.j = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x0174  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b4  */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@fo.k MotionEvent ev) {
        PageOver pageOver;
        float f;
        v vVar;
        v vVar2;
        float f2;
        v vVar3;
        v vVar4;
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (!this.D) {
            return super.onTouchEvent(ev);
        }
        ScaleGestureDetector scaleGestureDetector = this.e;
        Intrinsics.checkNotNull(scaleGestureDetector);
        boolean zOnTouchEvent = scaleGestureDetector.onTouchEvent(ev);
        if (getScrollState() == 0) {
            androidx.core.view.e0 e0Var = this.f;
            Intrinsics.checkNotNull(e0Var);
            zOnTouchEvent = e0Var.b(ev) || zOnTouchEvent;
        }
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            int actionIndex = ev.getActionIndex();
            float x = ev.getX(actionIndex);
            float y = ev.getY(actionIndex);
            this.w = x;
            this.x = y;
            this.y = 0.0f;
            this.z = 0.0f;
            this.B = false;
            this.v = ev.getPointerId(0);
            this.A = false;
            com.zentraedi.comic.util.a.a.b("ZoomRecyclerView", "ACTION_DOWN: (" + x + ", " + y + ')');
        } else if (actionMasked == 1) {
            com.zentraedi.comic.util.a.a.b("ZoomRecyclerView", "ACTION_UP, ACTION_CANCEL");
            this.v = -1;
            this.w = e0;
            this.x = e0;
            if (ev.getActionMasked() == 1 && !this.A && (((pageOver = this.t) == PageOver.NO || pageOver == PageOver.TRANSLATION) && this.m <= 1.0f)) {
                if (!this.c) {
                    f = this.z;
                    if (f > 30.0f) {
                        vVar2 = this.h;
                        if (vVar2 != null) {
                            vVar2.b();
                        }
                    } else if (f < -30.0f && (vVar = this.h) != null) {
                        vVar.a();
                    }
                } else if (!this.B) {
                    f2 = this.y;
                    if (f2 > 30.0f) {
                        vVar4 = this.h;
                        if (vVar4 != null) {
                            vVar4.b();
                        }
                    } else if (f2 < -30.0f && (vVar3 = this.h) != null) {
                        vVar3.a();
                    }
                }
            }
            this.B = false;
        } else if (actionMasked == 2) {
            try {
                if (ev.getPointerCount() >= 2) {
                    this.q = false;
                    return true;
                }
                int iFindPointerIndex = ev.findPointerIndex(this.v);
                float x2 = ev.getX(iFindPointerIndex);
                float y2 = ev.getY(iFindPointerIndex);
                this.r = false;
                if (ev.getPointerCount() == 2) {
                    this.q = false;
                } else if (ev.getPointerCount() == 1) {
                    this.q = true;
                }
                float f3 = x2 - this.w;
                float f4 = y2 - this.x;
                float f5 = this.y + f3;
                this.y = f5;
                this.z += f4;
                float fAbs = Math.abs(f5);
                float fAbs2 = Math.abs(this.z);
                boolean z = this.C;
                if (!z && this.m > 1.0f) {
                    this.q = true;
                    this.k += f3;
                    this.l += f4;
                    e();
                    invalidate();
                    this.w = x2;
                    this.x = y2;
                    return true;
                }
                if (!z && this.m <= 1.0f && this.o > 0.0f && !this.c && (this.B || fAbs2 > fAbs)) {
                    this.B = true;
                    this.q = true;
                    this.k = 0.0f;
                    this.l += f4;
                    e();
                    invalidate();
                    this.w = x2;
                    this.x = y2;
                    return true;
                }
                if (!this.u && this.t != PageOver.SCROLL && this.m <= 1.0f) {
                    this.w = x2;
                    this.x = y2;
                    return true;
                }
                if (this.t == PageOver.NO) {
                    return false;
                }
                this.w = x2;
                this.x = y2;
            } catch (Exception e2) {
                com.zentraedi.comic.util.a.a.b("ZoomRecyclerView", "Exception: " + e2.getLocalizedMessage());
                float x3 = ev.getX();
                float y3 = ev.getY();
                if (!this.C) {
                    float f6 = x3 - this.w;
                    float f7 = y3 - this.x;
                    if (this.m > 1.0f) {
                        m(this.k + f6, this.l + f7);
                        e();
                    }
                    this.w = x3;
                    this.x = y3;
                    invalidate();
                }
            }
        } else if (actionMasked == 3) {
            com.zentraedi.comic.util.a.a.b("ZoomRecyclerView", "ACTION_UP, ACTION_CANCEL");
            this.v = -1;
            this.w = e0;
            this.x = e0;
            if (ev.getActionMasked() == 1) {
                if (!this.c) {
                    f = this.z;
                    if (f > 30.0f) {
                        vVar2 = this.h;
                        if (vVar2 != null) {
                            vVar2.b();
                        }
                    } else if (f < -30.0f) {
                        vVar.a();
                    }
                } else if (!this.B) {
                    f2 = this.y;
                    if (f2 > 30.0f) {
                        vVar4 = this.h;
                        if (vVar4 != null) {
                            vVar4.b();
                        }
                    } else if (f2 < -30.0f) {
                        vVar3.a();
                    }
                }
            }
            this.B = false;
        } else if (actionMasked == 6) {
            this.A = true;
            int actionIndex2 = ev.getActionIndex();
            if (ev.getPointerId(actionIndex2) == this.v) {
                int i = actionIndex2 == 0 ? 1 : 0;
                this.w = ev.getX(i);
                this.x = ev.getY(i);
                this.v = ev.getPointerId(i);
            }
        }
        Object parent = getParent().getParent();
        ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView = parent instanceof ComicPullToRefreshRecyclerView ? (ComicPullToRefreshRecyclerView) parent : null;
        return (comicPullToRefreshRecyclerView != null ? comicPullToRefreshRecyclerView.D(ev) : false) || super.onTouchEvent(ev) || zOnTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean performClick() {
        return super/*android.view.ViewGroup*/.performClick();
    }

    public final void setAllowImageScrollOnTurn(boolean z) {
        this.u = z;
    }

    public final void setCanMoveX(float f) {
        this.p = f;
        if (this.m == 1.0f) {
            this.H = -f;
        } else {
            n();
        }
    }

    public final void setCanMoveY(float f) {
        this.o = f;
        if (this.m == 1.0f) {
            this.I = -f;
        } else {
            n();
        }
    }

    public final void setHandMove(boolean z) {
        this.q = z;
    }

    public final void setMActivePointerId(int i) {
        this.v = i;
    }

    public final void setMClickScaleFactor(float f) {
        this.K = f;
    }

    public final void setMDefaultScaleFactor(float f) {
        this.M = f;
    }

    public final void setMGestureDetector(@fo.l androidx.core.view.e0 e0Var) {
        this.f = e0Var;
    }

    public final void setMMaxScaleFactor(float f) {
        this.J = f;
    }

    public final void setMMaxTranX(float f) {
        this.H = f;
    }

    public final void setMMaxTranY(float f) {
        this.I = f;
    }

    public final void setMMinScaleFactor(float f) {
        this.L = f;
    }

    public final void setMOnRecyclerViewListener(@fo.l v vVar) {
        this.h = vVar;
    }

    public final void setMOnZoomListener(@fo.l w wVar) {
        this.b = wVar;
    }

    public final void setMPageClickListener(@fo.l c cVar) {
        this.g = cVar;
    }

    public final void setMResponseScaling(boolean z) {
        this.O = z;
    }

    public final void setMScale(float f) {
        this.n = f;
    }

    public final void setMScaleCenterX(float f) {
        this.F = f;
    }

    public final void setMScaleCenterY(float f) {
        this.G = f;
    }

    public final void setMScaleDetector(@fo.l ScaleGestureDetector scaleGestureDetector) {
        this.e = scaleGestureDetector;
    }

    public final void setMScaleDuration(int i) {
        this.N = i;
    }

    public final void setMScaleFactor(float f) {
        this.m = f;
    }

    public final void setMTranX(float f) {
        this.k = f;
    }

    public final void setMTranY(float f) {
        this.l = f;
    }

    public final void setMViewHeight(float f) {
        this.j = f;
    }

    public final void setMViewWidth(float f) {
        this.i = f;
    }

    public final void setMoveToY0(boolean z) {
        this.r = z;
    }

    public final void setMoveY0(float f) {
        this.s = f;
    }

    public void setOnScrollListener(@fo.l RecyclerView.OnScrollListener onScrollListener) {
        this.a = onScrollListener;
        super.setOnScrollListener(onScrollListener);
    }

    public final void setPageOver(@fo.l PageOver pageOver) {
        this.t = pageOver;
    }

    public final void setReadScrollModel(boolean z) {
        this.c = z;
    }

    public final void setScaling(boolean z) {
        this.C = z;
    }
}
