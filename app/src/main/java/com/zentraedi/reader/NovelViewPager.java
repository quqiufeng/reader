package com.zentraedi.reader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.viewpager.widget.V4ViewPager;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class NovelViewPager extends V4ViewPager {
    private boolean P4;
    private boolean Q4;
    private final j Z4;

    public NovelViewPager(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.Q4) {
            return false;
        }
        if (this.P4) {
            return true;
        }
        if (getCurrentItem() == 0 && getChildCount() == 0) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((getCurrentItem() == 0 && getChildCount() == 0) || this.P4) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCurrentItemQuick(int i) {
        e eVarA = this.Z4.a();
        if (Math.abs(getCurrentItem() - i) < 1) {
            eVarA.b(false);
            super.W(i, true);
        } else {
            eVarA.b(true);
            super.W(i, true);
            eVarA.b(false);
        }
    }

    public void setIntercept(boolean z) {
        this.P4 = z;
    }

    public void setNotIntercept(boolean z) {
        this.Q4 = z;
    }

    public NovelViewPager(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        j jVar = new j(this);
        this.Z4 = jVar;
        jVar.a().a(600);
    }
}
