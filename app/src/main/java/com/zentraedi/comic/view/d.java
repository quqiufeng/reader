package com.zentraedi.comic.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.comic.viewmodel.ReadModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class d extends RecyclerView.SmoothScroller {

    @fo.l
    private final ReadModel a;
    private final boolean b;
    private final float c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final float h;

    @fo.k
    private final LinearInterpolator i;

    @fo.k
    private final DecelerateInterpolator j;

    @fo.l
    private PointF k;

    @fo.l
    private DisplayMetrics l;
    private boolean m;
    private float n;
    private int o;
    private int p;

    public d(@fo.k Context context, @fo.l ReadModel readModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = readModel;
        this.c = 25.0f;
        this.d = 10000;
        this.e = -1;
        this.f = 1;
        this.h = 1.2f;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.l = context.getResources().getDisplayMetrics();
    }

    private final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        if (i5 == this.e) {
            return i3 - i;
        }
        if (i5 == this.f) {
            return i4 - i2;
        }
        if (i5 != this.g) {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    private final int calculateDxToMakeVisible(View view, int i) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = layoutParams;
        return calculateDtToFit(view.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, view.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, this.a == ReadModel.MANGA_READ ? layoutManager.getPaddingLeft() - (view.getWidth() - layoutManager.getWidth()) : layoutManager.getPaddingLeft(), this.a == ReadModel.NORMAL_READ ? layoutManager.getPaddingRight() + view.getWidth() : layoutManager.getWidth() - layoutManager.getPaddingRight(), i);
    }

    private final int calculateDyToMakeVisible(View view, int i) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = layoutParams;
        return calculateDtToFit(layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
    }

    private final int getVerticalSnapPreference() {
        PointF pointF = this.k;
        if (pointF != null) {
            Intrinsics.checkNotNull(pointF);
            if (pointF.y != 0.0f) {
                PointF pointF2 = this.k;
                Intrinsics.checkNotNull(pointF2);
                return pointF2.y > 0.0f ? this.f : this.e;
            }
        }
        return this.g;
    }

    private final void updateActionForInterimTarget(RecyclerView.SmoothScroller.Action action) {
        PointF pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x == 0.0f && pointFComputeScrollVectorForPosition.y == 0.0f)) {
            action.jumpTo(getTargetPosition());
            stop();
            return;
        }
        normalize(pointFComputeScrollVectorForPosition);
        this.k = pointFComputeScrollVectorForPosition;
        int i = this.d;
        this.o = (int) (i * pointFComputeScrollVectorForPosition.x);
        this.p = (int) (i * pointFComputeScrollVectorForPosition.y);
        int iCalculateTimeForScrolling = calculateTimeForScrolling(i);
        float f = this.o;
        float f2 = this.h;
        action.update((int) (f * f2), (int) (this.p * f2), (int) (iCalculateTimeForScrolling * f2), this.i);
    }

    public final boolean a() {
        return this.b;
    }

    @fo.k
    public final DecelerateInterpolator b() {
        return this.j;
    }

    @fo.l
    public final DisplayMetrics c() {
        return this.l;
    }

    public final float calculateSpeedPerPixel(@fo.l DisplayMetrics displayMetrics) {
        float f = this.c;
        Intrinsics.checkNotNull(displayMetrics);
        return f / displayMetrics.densityDpi;
    }

    public final int calculateTimeForDeceleration(int i) {
        return (int) Math.ceil(((double) calculateTimeForScrolling(i)) / 0.3356d);
    }

    public final int calculateTimeForScrolling(int i) {
        return (int) Math.ceil(Math.abs(i) * getSpeedPerPixel());
    }

    public int clampApplyScroll(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    public final boolean d() {
        return this.m;
    }

    public final float e() {
        return this.c;
    }

    public final int f() {
        return this.o;
    }

    public final int g() {
        return this.p;
    }

    public final int getHorizontalSnapPreference() {
        PointF pointF = this.k;
        if (pointF != null) {
            Intrinsics.checkNotNull(pointF);
            if (pointF.x != 0.0f) {
                PointF pointF2 = this.k;
                Intrinsics.checkNotNull(pointF2);
                return pointF2.x > 0.0f ? this.f : this.e;
            }
        }
        return this.g;
    }

    public float getSpeedPerPixel() {
        if (!this.m) {
            this.n = calculateSpeedPerPixel(this.l);
            this.m = true;
        }
        return this.n;
    }

    @fo.k
    public final LinearInterpolator h() {
        return this.i;
    }

    public final float i() {
        return this.n;
    }

    @fo.l
    public final PointF j() {
        return this.k;
    }

    @fo.l
    public final ReadModel k() {
        return this.a;
    }

    public final int l() {
        return this.g;
    }

    public final int m() {
        return this.f;
    }

    public final int n() {
        return this.e;
    }

    public final float o() {
        return this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if ((r5.y * r4) >= 0.0f) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onSeekTargetStep(int r3, int r4, @fo.k androidx.recyclerview.widget.RecyclerView.State r5, @fo.k androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action r6) {
        /*
            r2 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r5 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            int r5 = r2.getChildCount()
            if (r5 != 0) goto L14
            r2.stop()
            return
        L14:
            boolean r5 = r2.b
            if (r5 == 0) goto L3e
            android.graphics.PointF r5 = r2.k
            if (r5 == 0) goto L3e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            float r5 = r5.x
            float r0 = (float) r3
            float r5 = r5 * r0
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 < 0) goto L36
            android.graphics.PointF r5 = r2.k
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            float r5 = r5.y
            float r1 = (float) r4
            float r5 = r5 * r1
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 < 0) goto L36
            goto L3e
        L36:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Scroll happened in the opposite direction of the target. Some calculations are wrong"
            r3.<init>(r4)
            throw r3
        L3e:
            int r5 = r2.o
            int r3 = r2.clampApplyScroll(r5, r3)
            r2.o = r3
            int r3 = r2.p
            int r3 = r2.clampApplyScroll(r3, r4)
            r2.p = r3
            int r4 = r2.o
            if (r4 != 0) goto L57
            if (r3 != 0) goto L57
            r2.updateActionForInterimTarget(r6)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.view.d.onSeekTargetStep(int, int, androidx.recyclerview.widget.RecyclerView$State, androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action):void");
    }

    protected void onStart() {
    }

    protected void onStop() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    protected void onTargetFound(@fo.k View targetView, @fo.k RecyclerView.State state, @fo.k RecyclerView.SmoothScroller.Action action) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(action, "action");
        int iCalculateDxToMakeVisible = calculateDxToMakeVisible(targetView, getHorizontalSnapPreference());
        int iCalculateDyToMakeVisible = calculateDyToMakeVisible(targetView, getVerticalSnapPreference());
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iCalculateDxToMakeVisible * iCalculateDxToMakeVisible) + (iCalculateDyToMakeVisible * iCalculateDyToMakeVisible)));
        if (iCalculateTimeForDeceleration > 0) {
            action.update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iCalculateTimeForDeceleration, this.j);
        }
    }

    public final int p() {
        return this.d;
    }

    public final void q(@fo.l DisplayMetrics displayMetrics) {
        this.l = displayMetrics;
    }

    public final void r(boolean z) {
        this.m = z;
    }

    public final void s(int i) {
        this.o = i;
    }

    public final void t(int i) {
        this.p = i;
    }

    public final void u(float f) {
        this.n = f;
    }

    public final void v(@fo.l PointF pointF) {
        this.k = pointF;
    }
}
