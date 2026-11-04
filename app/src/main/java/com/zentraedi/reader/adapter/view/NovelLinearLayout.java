package com.zentraedi.reader.adapter.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.p0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class NovelLinearLayout extends LinearLayout {
    private a a;
    private boolean b;

    public interface a {
        boolean onTouchEvent(MotionEvent motionEvent);
    }

    public NovelLinearLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (this.b) {
            return true;
        }
        return zOnInterceptTouchEvent;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        if (this.a == null || Math.abs(iArr[0]) > 100) {
            return false;
        }
        return this.a.onTouchEvent(motionEvent);
    }

    public void setInnerOnTouchListener(a aVar) {
        this.a = aVar;
    }

    public void setScrolling(boolean z) {
        this.b = z;
    }

    public NovelLinearLayout(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NovelLinearLayout(Context context, @p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
