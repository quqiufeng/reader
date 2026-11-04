package com.zentraedi.reader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.e0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class NovelRecycleView extends RecyclerView {
    private final e0 a;
    private GestureDetector.SimpleOnGestureListener b;

    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (NovelRecycleView.this.b == null) {
                return false;
            }
            NovelRecycleView.this.b.onSingleTapUp(motionEvent);
            return true;
        }
    }

    public NovelRecycleView(Context context) {
        this(context, null, 0);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (getScrollState() < 5) {
            this.a.b(motionEvent);
        }
        return zOnTouchEvent;
    }

    public void setSimpleOnGestureListener(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.b = simpleOnGestureListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NovelRecycleView(@n0 Context context, @p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new e0(getContext(), new a());
    }

    public NovelRecycleView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
