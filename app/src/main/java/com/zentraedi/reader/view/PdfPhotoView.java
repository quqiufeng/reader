package com.zentraedi.reader.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.n0;
import com.davemorrissey.labs.subscaleview.b;
import com.zentraedi.business.widget.BigGifView;
import com.zentraedi.reader.adapter.view.NovelLinearLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class PdfPhotoView extends b {
    private int m6;
    private boolean n6;
    private boolean o6;
    public BigGifView p6;
    public String q6;
    private float r6;
    private float s6;
    private int t6;
    private NovelLinearLayout.a u6;
    private com.zentraedi.reader.reader.b v6;
    private GestureDetector w6;

    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            int iW1 = PdfPhotoView.this.W1(motionEvent.getX(), PdfPhotoView.this.getWidth());
            if (iW1 == 0) {
                nd.a.e("nas_book", "PdfPhotoView 点击了左边");
                if (PdfPhotoView.this.v6 != null) {
                    PdfPhotoView.this.v6.e();
                }
            } else if (iW1 == 1) {
                nd.a.e("nas_book", "PdfPhotoView 点击了中间");
                if (PdfPhotoView.this.v6 != null) {
                    PdfPhotoView.this.v6.a();
                }
            } else if (iW1 == 2) {
                nd.a.e("nas_book", "PdfPhotoView 点击了右边");
                if (PdfPhotoView.this.v6 != null) {
                    PdfPhotoView.this.v6.b();
                }
            }
            PdfPhotoView.this.performClick();
            return true;
        }
    }

    public PdfPhotoView(Context context) {
        super(context);
        this.o6 = false;
        this.p6 = null;
        this.t6 = 0;
        X1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int W1(float f, float f2) {
        float f3 = f2 / 3.0f;
        if (f < f3) {
            return 0;
        }
        return f < f3 * 2.0f ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void X1() {
        this.w6 = new GestureDetector(getContext(), new a());
    }

    public boolean Y1() {
        return this.n6;
    }

    public void Z1(int i) {
        if (this.t6 == 0 && getOrientation() != 0 && !this.o6) {
            this.o6 = true;
        }
        this.t6 = i;
        if (this.o6) {
            i = getOrientation() + i >= 360 ? (i + getOrientation()) - 360 : i + getOrientation();
        }
        setOrientation(i);
    }

    public int getBgColorId() {
        return this.m6;
    }

    public boolean onTouchEvent(@n0 MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.w6;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.r6 = motionEvent.getX();
            this.s6 = motionEvent.getY();
            return true;
        }
        if (action == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float f = x - this.r6;
            float f2 = y - this.s6;
            if (Math.abs(f) > 100.0f && Math.abs(f2) < 200.0f) {
                if (f > 0.0f) {
                    nd.a.e("nas_book", "PdfPhotoView 右滑了");
                    com.zentraedi.reader.reader.b bVar = this.v6;
                    if (bVar != null) {
                        bVar.c();
                    }
                } else {
                    nd.a.e("nas_book", "PdfPhotoView 左滑了");
                    com.zentraedi.reader.reader.b bVar2 = this.v6;
                    if (bVar2 != null) {
                        bVar2.d();
                    }
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundColor(int i) {
        super/*android.view.View*/.setBackgroundColor(i);
    }

    public void setBackgroundColorId(int i) {
        this.m6 = i;
        if (this.n6) {
            return;
        }
        setBackgroundColor(com.zentraedi.basic.function.utils.a.d(i));
    }

    public void setFull(boolean z) {
        this.n6 = z;
        super.setFull(z);
    }

    public void setInnerOnTouchListener(NovelLinearLayout.a aVar) {
        this.u6 = aVar;
    }

    public void setPageClickEvent(com.zentraedi.reader.reader.b bVar) {
        this.v6 = bVar;
    }

    public PdfPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o6 = false;
        this.p6 = null;
        this.t6 = 0;
        X1();
    }
}
