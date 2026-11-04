package com.zentraedi.outreader.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class a extends FrameLayout {
    private static final int d = 20;
    private ViewPager2 a;
    private float b;
    private float c;

    public a(@n0 Context context, @p0 AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() <= 0 || !(getChildAt(0) instanceof ViewPager2)) {
            return;
        }
        this.a = getChildAt(0);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2 == null || viewPager2.getAdapter() == null) {
            return super.onInterceptTouchEvent(ev);
        }
        int action = ev.getAction();
        if (action == 0) {
            this.b = ev.getX();
            this.c = ev.getY();
        } else if (action == 2) {
            float x = ev.getX() - this.b;
            float y = ev.getY() - this.c;
            if (Math.abs(x) > 20.0f && Math.abs(x) > Math.abs(y) && this.a.getCurrentItem() == this.a.getAdapter().getItemCount() - 1 && x > 0.0f) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }
}
