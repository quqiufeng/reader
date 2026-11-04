package com.zentraedi.comic.view;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.basic.function.utils.m0;
import com.zentraedi.business.utils.g8;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class a extends PagerSnapHelper implements View.OnTouchListener {
    private static final int j = 100;
    static final float k = 50.0f;
    protected e0 a;
    protected float c;
    protected float d;
    protected boolean b = true;
    protected float e = 1.0f;
    protected boolean f = false;
    protected View g = null;
    protected boolean h = false;
    protected boolean i = false;

    /* JADX INFO: renamed from: com.zentraedi.comic.view.a$a, reason: collision with other inner class name */
    class C0126a extends LinearSmoothScroller {
        C0126a(Context context) {
            super(context);
        }

        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return a.k / displayMetrics.densityDpi;
        }

        protected int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            a aVar = a.this;
            int[] iArrCalculateDistanceToFinalSnap = aVar.calculateDistanceToFinalSnap(aVar.a.getLayoutManager(), view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                action.update(i, i2, iCalculateTimeForDeceleration, ((LinearSmoothScroller) this).mDecelerateInterpolator);
            }
        }
    }

    private void d() {
        this.b = true;
    }

    private void e() {
        this.b = false;
    }

    public int a(View view, RecyclerView.LayoutManager layoutManager) {
        int left = this.b ? view.getLeft() : view.getRight();
        int paddingLeft = layoutManager.getPaddingLeft();
        Log.d("CustomSnapHelper", "location= " + layoutManager.getPosition(view));
        Log.d("CustomSnapHelper", "SystemUIUtils.getScreenWidth= " + g8.f());
        Log.d("CustomSnapHelper", "SystemUIUtils.getStatusBarHeight()" + g8.h());
        Log.d("CustomSnapHelper", "getDecoratedRight= " + layoutManager.getDecoratedRight(view));
        Log.d("CustomSnapHelper", "childStart= " + left + " containerStart = " + paddingLeft + "moveLeft==" + this.b);
        Log.d("CustomSnapHelper", "childStart= " + left + " containerStart = " + paddingLeft + "moveLeft==" + this.b + "SystemUIUtils.getScreenWidth(SystemUIUtils.getStatusBarHeight()==" + g8.g(g8.h()));
        StringBuilder sb = new StringBuilder();
        sb.append("left= ");
        sb.append(view.getLeft());
        sb.append(" right = ");
        sb.append(view.getRight());
        sb.append("width==");
        sb.append(view.getWidth());
        Log.d("CustomSnapHelper", sb.toString());
        if (this.b) {
            if (layoutManager.getWidth() > (view.getWidth() * this.e) + m0.b(10.0f)) {
                return view.getRight() > 0 ? view.getRight() : left - paddingLeft;
            }
            return left - paddingLeft;
        }
        int left2 = (view.getLeft() - g8.g(g8.h())) + ((int) (m0.b(10.0f) * this.e));
        int iG = left - g8.g(g8.h());
        float width = view.getWidth();
        float f = this.e;
        return (((float) layoutManager.getWidth()) <= (((float) view.getWidth()) * this.e) + ((float) m0.b(10.0f)) || left2 > 0) ? iG + ((int) ((width * (f - 1.0f)) / f)) : left2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.zentraedi.comic.view.e0] */
    public void attachToRecyclerView(@p0 RecyclerView recyclerView) throws IllegalStateException {
        if (recyclerView instanceof e0) {
            ?? r0 = (e0) recyclerView;
            this.a = r0;
            r0.setOnTouchListener(this);
        } else {
            this.a = null;
        }
        super/*androidx.recyclerview.widget.SnapHelper*/.attachToRecyclerView(recyclerView);
    }

    protected View b(LinearLayoutManager linearLayoutManager) {
        if (linearLayoutManager.getChildCount() == 0) {
            return null;
        }
        return linearLayoutManager.findViewByPosition(this.b ? linearLayoutManager.findFirstVisibleItemPosition() : linearLayoutManager.findLastVisibleItemPosition());
    }

    public boolean c() {
        return this.f;
    }

    public int[] calculateDistanceToFinalSnap(@n0 RecyclerView.LayoutManager layoutManager, @n0 View view) {
        int[] iArr = new int[2];
        if (this.f || !this.i) {
            iArr[0] = 0;
            return iArr;
        }
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(view, layoutManager);
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = a(view, layoutManager);
        } else {
            iArr[1] = 0;
        }
        this.i = false;
        nd.a.a("CustomSnapHelper", "out[0] = " + iArr[0] + " out[1] = " + iArr[1]);
        return iArr;
    }

    @p0
    protected RecyclerView.SmoothScroller createScroller(@n0 RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new C0126a(this.a.getContext());
        }
        return null;
    }

    public void f(boolean z) {
        this.f = z;
    }

    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return super.findSnapView(layoutManager);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindLastVisibleItemPosition = this.b ? linearLayoutManager.findLastVisibleItemPosition() : linearLayoutManager.findFirstVisibleItemPosition();
        Log.d("CustomSnapHelper", "linearLayoutManager.findFirstVisibleItemPosition()===" + linearLayoutManager.findFirstVisibleItemPosition());
        Log.d("CustomSnapHelper", "linearLayoutManager.findLastVisibleItemPosition()===" + linearLayoutManager.findLastVisibleItemPosition());
        View viewFindViewByPosition = layoutManager.findViewByPosition(iFindLastVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            this.f = false;
            return super.findSnapView(layoutManager);
        }
        Log.d("CustomSnapHelper", "viewItem left===" + viewFindViewByPosition.getLeft());
        Log.d("CustomSnapHelper", "viewItem  right===" + viewFindViewByPosition.getRight());
        Log.d("CustomSnapHelper", "viewItem  location===" + iFindLastVisibleItemPosition);
        if (this.b && viewFindViewByPosition.getLeft() * this.e > linearLayoutManager.getWidth()) {
            viewFindViewByPosition = layoutManager.findViewByPosition(iFindLastVisibleItemPosition - 1);
        }
        Log.d("CustomSnapHelper", "location===" + iFindLastVisibleItemPosition);
        Log.d("CustomSnapHelper", "linearLayoutManager.getWidth() " + linearLayoutManager.getWidth() + " viewItem.getWidth()==" + viewFindViewByPosition.getWidth());
        if (linearLayoutManager.getWidth() > (viewFindViewByPosition.getWidth() * this.e) + 10.0f) {
            this.f = false;
            return b(linearLayoutManager);
        }
        this.f = this.g == viewFindViewByPosition;
        this.g = viewFindViewByPosition;
        return viewFindViewByPosition;
    }

    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        nd.a.a("CustomSnapHelper", "velocityX= " + i + " findTargetSnapPosition  ");
        if (layoutManager.getItemCount() == 0) {
            return -1;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = this.b ? linearLayoutManager.findFirstVisibleItemPosition() : linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition) == null) {
            return -1;
        }
        if (i > 0) {
            return Math.min(iFindFirstVisibleItemPosition + 1, layoutManager.getItemCount() - 1);
        }
        if (i < 0) {
            return Math.max(iFindFirstVisibleItemPosition - 1, 0);
        }
        return -1;
    }

    public void g(boolean z) {
        this.b = z;
    }

    public void h(boolean z) {
        this.h = z;
    }

    public void i(float f) {
        this.e = f;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f = true;
        this.i = true;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.c = motionEvent.getX();
            return false;
        }
        if (action != 1) {
            return false;
        }
        float x = motionEvent.getX();
        this.d = x;
        float f = this.c - x;
        if (Math.abs(f) > k) {
            if (f > 0.0f) {
                d();
            } else {
                e();
            }
        }
        return false;
    }
}
