package com.zentraedi.outreader.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.a;
import fo.k;
import fo.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class SliderViewPager extends ViewPager {
    private float a;
    private float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderViewPager(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(@k MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int action = ev.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.a = ev.getX();
            this.b = ev.getY();
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (action == 2) {
            float x = ev.getX() - this.a;
            if (Math.abs(x) <= Math.abs(ev.getY() - this.b)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (getCurrentItem() != 0 || x <= 0.0f) {
                int currentItem = getCurrentItem();
                a adapter = getAdapter();
                if (currentItem != (adapter != null ? adapter.getCount() : 0) - 1 || x >= 0.0f) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super/*android.view.ViewGroup*/.dispatchTouchEvent(ev);
    }
}
