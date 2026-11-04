package com.zentraedi.reader;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class BatteryView extends View {
    private int a;
    private int b;
    private int c;
    private Paint d;

    public BatteryView(Context context) {
        super(context);
        this.a = 100;
    }

    private void a(Canvas canvas) {
        Paint paint = this.d;
        paint.setStyle(Paint.Style.STROKE);
        float f = this.b / 20.0f;
        float f2 = f / 2.0f;
        paint.setStrokeWidth(f);
        RectF rectF = new RectF(f2, f2, (this.b - f) - f2, this.c - f2);
        canvas.drawRect(rectF, paint);
        paint.setStrokeWidth(0.0f);
        paint.setStyle(Paint.Style.FILL);
        float fWidth = (((rectF.width() - 4) - ((f - f2) * 2.0f)) * this.a) / 100.0f;
        float f3 = 2;
        float f4 = f + f3;
        canvas.drawRect(new RectF(f4, f4, fWidth + f4, (this.c - f) - f3), paint);
        int i = this.b;
        float f5 = i - f;
        int i2 = this.c;
        canvas.drawRect(new RectF(f5, i2 * 0.25f, i, i2 * 0.75f), paint);
    }

    public int getPower() {
        return this.a;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = getMeasuredWidth();
        this.c = getMeasuredHeight();
    }

    public void setColor(int i) {
        Paint paint = this.d;
        if (paint != null) {
            paint.setColor(i);
        }
        invalidate();
    }

    public void setPaint(Paint paint) {
        this.d = paint;
        invalidate();
    }

    public void setPower(int i) {
        if (i == this.a) {
            return;
        }
        this.a = i;
        if (i < 0) {
            this.a = 100;
        }
        invalidate();
    }

    public BatteryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 100;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.s.t5);
        this.a = typedArrayObtainStyledAttributes.getInt(h.s.w5, 100);
        this.b = getMeasuredWidth();
        this.c = getMeasuredHeight();
        typedArrayObtainStyledAttributes.recycle();
    }
}
