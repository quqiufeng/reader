package com.zentraedi.outreader.widget.fastscrollview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.zentraedi.basic.function.utils.k0;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class FastScrollRecyclerView<VH extends RecyclerView.ViewHolder> extends RecyclerView implements RecyclerView.OnItemTouchListener {
    private static final Class<?> k = FastScrollRecyclerView.class;
    private final FastScroller a;
    private boolean b;
    private final d c;
    private int d;
    private int e;
    private int f;
    private ih.b g;
    private final SparseIntArray h;
    private final FastScrollRecyclerView<VH>.c i;
    private com.zentraedi.outreader.widget.fastscrollview.a j;

    public interface b<VH extends RecyclerView.ViewHolder> {
        int a(RecyclerView recyclerView, @p0 VH viewHolder, int viewType);
    }

    private class c extends RecyclerView.AdapterDataObserver {
        private c() {
        }

        private void a() {
            FastScrollRecyclerView.this.h.clear();
        }

        public void onChanged() {
            a();
        }

        public void onItemRangeChanged(int positionStart, int itemCount) {
            a();
        }

        public void onItemRangeInserted(int positionStart, int itemCount) {
            a();
        }

        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            a();
        }

        public void onItemRangeRemoved(int positionStart, int itemCount) {
            a();
        }

        public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
            a();
        }
    }

    public static class d {
        int a;
        int b;
        int c;
    }

    public interface e {
        @n0
        String a(int position);
    }

    public FastScrollRecyclerView(Context context) {
        this(context, null);
    }

    private int d() {
        if (getAdapter() instanceof b) {
            return e(getAdapter().getItemCount());
        }
        throw new IllegalStateException("calculateAdapterHeight() should only be called where the RecyclerView.Adapter<?> is an instance of MeasurableAdapter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int e(int adapterIndex) {
        if (!(getAdapter() instanceof b)) {
            throw new IllegalStateException("calculateScrollDistanceToPosition() should only be called where the RecyclerView.Adapter<?> is an instance of MeasurableAdapter");
        }
        if (this.h.indexOfKey(adapterIndex) >= 0) {
            return this.h.get(adapterIndex);
        }
        b bVar = (b) getAdapter();
        int iA = 0;
        for (int i = 0; i < adapterIndex; i++) {
            this.h.put(i, iA);
            iA += bVar.a(this, findViewHolderForAdapterPosition(i), getAdapter().getItemViewType(i));
        }
        this.h.put(adapterIndex, iA);
        return iA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private float f(float touchFraction) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            return 0.0f;
        }
        if (adapter instanceof b) {
            b bVar = (b) adapter;
            int iD = (int) (d() * touchFraction);
            for (int i = 0; i < adapter.getItemCount(); i++) {
                int iE = e(i);
                int iA = bVar.a(this, findViewHolderForAdapterPosition(i), adapter.getItemViewType(i)) + iE;
                if (i == adapter.getItemCount() - 1) {
                    if (iD >= iE && iD <= iA) {
                        return i;
                    }
                } else if (iD >= iE && iD < iA) {
                    return i;
                }
            }
        }
        return touchFraction * adapter.getItemCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int g(int passedHeight) {
        if (!(getAdapter() instanceof b)) {
            throw new IllegalStateException("findMeasureAdapterFirstVisiblePosition() should only be called where the RecyclerView.Adapter<?> is an instance of MeasurableAdapter");
        }
        b bVar = (b) getAdapter();
        for (int i = 0; i < getAdapter().getItemCount(); i++) {
            int iE = e(i);
            int iA = bVar.a(this, findViewHolderForAdapterPosition(i), getAdapter().getItemViewType(i)) + iE;
            if (i == getAdapter().getItemCount() - 1) {
                if (passedHeight >= iE && passedHeight <= iA) {
                    return i;
                }
            } else {
                if (passedHeight >= iE && passedHeight < iA) {
                    return i;
                }
            }
        }
        throw new IllegalStateException(String.format(Locale.getDefault(), "Invalid passed height: %d, [low: %d, height: %d]", Integer.valueOf(passedHeight), Integer.valueOf(e(0)), Integer.valueOf(e(getAdapter().getItemCount() - 1) + bVar.a(this, findViewHolderForAdapterPosition(getAdapter().getItemCount() - 1), getAdapter().getItemViewType(getAdapter().getItemCount() - 1)))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i(d stateOut) {
        stateOut.a = -1;
        stateOut.b = -1;
        stateOut.c = -1;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null || adapter.getItemCount() == 0 || getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        stateOut.a = getChildAdapterPosition(childAt);
        GridLayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        if (layoutManager instanceof GridLayoutManager) {
            stateOut.a /= layoutManager.getSpanCount();
        }
        if (!(adapter instanceof b)) {
            stateOut.b = layoutManager.getDecoratedTop(childAt);
            stateOut.c = childAt.getHeight() + layoutManager.getTopDecorationHeight(childAt) + layoutManager.getBottomDecorationHeight(childAt);
        } else {
            stateOut.b = layoutManager.getDecoratedTop(childAt);
            stateOut.c = ((b) adapter).a(this, findViewHolderForAdapterPosition(stateOut.a), adapter.getItemViewType(stateOut.a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    private boolean j(MotionEvent ev) {
        int action = ev.getAction();
        int x = (int) ev.getX();
        int y = (int) ev.getY();
        if (action == 0) {
            this.d = x;
            this.f = y;
            this.e = y;
            this.a.l(ev, x, y, y, this.j);
        } else if (action == 1) {
            this.a.l(ev, this.d, this.e, this.f, this.j);
        } else if (action == 2) {
            this.f = y;
            this.a.l(ev, this.d, this.e, y, this.j);
        } else if (action == 3) {
            this.a.l(ev, this.d, this.e, this.f, this.j);
        }
        return this.a.m();
    }

    public void addItemDecoration(@n0 RecyclerView.ItemDecoration decor) {
        if (decor instanceof ih.b) {
            this.g = (ih.b) decor;
        }
        super.addItemDecoration(decor);
    }

    public void c(boolean allowInactiveColor) {
        this.a.i(allowInactiveColor);
    }

    public void draw(Canvas c2) {
        super.draw(c2);
        if (this.b) {
            l();
            this.a.h(c2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected int getAvailableScrollBarHeight() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.a.j();
    }

    public int getScrollBarThumbHeight() {
        return this.a.j();
    }

    public int getScrollBarWidth() {
        return this.a.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected int h(int adapterHeight, int yOffset) {
        return (((getPaddingTop() + yOffset) + adapterHeight) + getPaddingBottom()) - getHeight();
    }

    protected boolean k() {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return getLayoutManager().getReverseLayout();
        }
        return false;
    }

    public void l() {
        if (getAdapter() == null) {
            return;
        }
        int itemCount = getAdapter().getItemCount();
        if (getLayoutManager() instanceof GridLayoutManager) {
            itemCount = (int) Math.ceil(((double) itemCount) / ((double) getLayoutManager().getSpanCount()));
        }
        if (itemCount == 0) {
            this.a.A(-1, -1);
            return;
        }
        i(this.c);
        d dVar = this.c;
        if (dVar.a < 0) {
            this.a.A(-1, -1);
        } else {
            o(dVar, itemCount);
        }
    }

    public String m(float touchFraction) {
        int itemCount;
        int spanCount;
        int iE;
        float itemCount2;
        int iG;
        e adapter = getAdapter();
        if (adapter == null || (itemCount = adapter.getItemCount()) == 0) {
            return "";
        }
        if (getLayoutManager() instanceof GridLayoutManager) {
            spanCount = getLayoutManager().getSpanCount();
            itemCount = (int) Math.ceil(((double) itemCount) / ((double) spanCount));
        } else {
            spanCount = 1;
        }
        stopScroll();
        i(this.c);
        if (adapter instanceof b) {
            itemCount2 = f(touchFraction);
            int iH = (int) (h(d(), 0) * touchFraction);
            iG = g(iH);
            iE = e(iG) - iH;
        } else {
            float f = f(touchFraction);
            int iH2 = (int) (h(itemCount * this.c.c, 0) * touchFraction);
            int i = this.c.c;
            int i2 = (spanCount * iH2) / i;
            iE = -(iH2 % i);
            itemCount2 = f;
            iG = i2;
        }
        LinearLayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return "";
        }
        layoutManager.scrollToPositionWithOffset(iG, iE);
        if (!(adapter instanceof e)) {
            return "";
        }
        if (touchFraction == 1.0f) {
            itemCount2 = adapter.getItemCount() - 1;
        }
        return adapter.a((int) itemCount2);
    }

    public void n() {
        this.a.C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void o(d scrollPosState, int rowCount) {
        int iH;
        int iE;
        if (getAdapter() instanceof b) {
            iH = h(d(), 0);
            iE = e(scrollPosState.a);
        } else {
            iH = h(rowCount * scrollPosState.c, 0);
            iE = scrollPosState.c * scrollPosState.a;
        }
        int availableScrollBarHeight = getAvailableScrollBarHeight();
        if (iH <= 0) {
            this.a.A(-1, -1);
            return;
        }
        int iMin = (int) ((Math.min(iH, getPaddingTop() + iE) / iH) * availableScrollBarHeight);
        this.a.A(k0.u(getResources()) ? 0 : getWidth() - this.a.k(), k() ? (availableScrollBarHeight - iMin) + getPaddingBottom() : iMin + getPaddingTop());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onFinishInflate() {
        super/*android.view.ViewGroup*/.onFinishInflate();
        addOnItemTouchListener(this);
    }

    public boolean onInterceptTouchEvent(@n0 RecyclerView rv, @n0 MotionEvent ev) {
        return j(ev);
    }

    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }

    public void onTouchEvent(@n0 RecyclerView rv, @n0 MotionEvent ev) {
        j(ev);
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        if (getAdapter() != null) {
            getAdapter().unregisterAdapterDataObserver(this.i);
        }
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.i);
        }
        super.setAdapter(adapter);
    }

    public void setAutoHideDelay(int hideDelay) {
        this.a.p(hideDelay);
    }

    public void setAutoHideEnabled(boolean autoHideEnabled) {
        this.a.q(autoHideEnabled);
    }

    public void setFastScrollEnabled(boolean fastScrollEnabled) {
        this.b = fastScrollEnabled;
    }

    public void setOnFastScrollStateChangeListener(com.zentraedi.outreader.widget.fastscrollview.a stateChangeListener) {
        this.j = stateChangeListener;
    }

    public void setPopUpTypeface(Typeface typeface) {
        this.a.w(typeface);
    }

    public void setPopupBgColor(@l int color) {
        this.a.s(color);
    }

    public void setPopupPosition(@FastScroller.d int popupPosition) {
        this.a.t(popupPosition);
    }

    public void setPopupTextColor(@l int color) {
        this.a.u(color);
    }

    public void setPopupTextSize(int textSize) {
        this.a.v(textSize);
    }

    @Deprecated
    public void setStateChangeListener(com.zentraedi.outreader.widget.fastscrollview.a stateChangeListener) {
        setOnFastScrollStateChangeListener(stateChangeListener);
    }

    public void setThumbColor(@l int color) {
        this.a.x(color);
    }

    @Deprecated
    public void setThumbEnabled(boolean thumbEnabled) {
        setFastScrollEnabled(thumbEnabled);
    }

    public void setThumbInactiveColor(@l int color) {
        this.a.y(color);
    }

    public void setTrackColor(@l int color) {
        this.a.B(color);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @Deprecated
    public void setThumbInactiveColor(boolean allowInactiveColor) {
        c(allowInactiveColor);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.c = new d();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, com.zentraedi.outreader.d.s.Jp, 0, 0);
        try {
            this.b = typedArrayObtainStyledAttributes.getBoolean(com.zentraedi.outreader.d.s.Up, true);
            typedArrayObtainStyledAttributes.recycle();
            this.a = new FastScroller(context, this, attrs);
            this.i = new c();
            this.h = new SparseIntArray();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
