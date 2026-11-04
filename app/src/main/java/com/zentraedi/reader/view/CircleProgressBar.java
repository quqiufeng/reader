package com.zentraedi.reader.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zentraedi.reader.h;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class CircleProgressBar extends View {
    Paint.FontMetrics a;
    private int b;
    private int c;
    private Paint d;
    private float e;
    private final RectF f;
    private int g;
    private int h;
    private int i;
    private float j;
    private int k;
    private String l;
    private Paint m;
    private final Paint.Style n;

    public CircleProgressBar(Context context) {
        this(context, null);
    }

    private void a() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(this.g);
        this.d.setAntiAlias(true);
        this.d.setStyle(this.n);
        this.d.setStrokeWidth(this.e);
        Paint paint2 = new Paint();
        this.m = paint2;
        paint2.setTextSize(this.j);
        this.m.setAntiAlias(true);
        this.m.setColor(this.i);
    }

    public void b(int i, int i2) {
        this.g = i;
        this.h = i2;
        postInvalidate();
    }

    public void c(int i, String str) {
        this.k = i;
        this.l = str;
        postInvalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.d.setColor(this.g);
        int i = this.k;
        if (i < 360) {
            canvas.drawArc(this.f, i + 270.0f, 360.0f - i, this.n == Paint.Style.FILL, this.d);
        }
        this.d.setColor(this.h);
        canvas.drawArc(this.f, 270.0f, this.k, this.n == Paint.Style.FILL, this.d);
        this.a = this.m.getFontMetrics();
        canvas.drawText(this.l, (this.c / 2.0f) - (this.m.measureText(this.l) / 2.0f), (this.b / 2.0f) - ((this.m.ascent() + this.m.descent()) / 2.0f), this.m);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        this.b = View.MeasureSpec.getSize(i2);
        int size = View.MeasureSpec.getSize(i);
        this.c = size;
        int i3 = this.b;
        if (i3 > size) {
            RectF rectF = this.f;
            float f = this.e;
            rectF.left = f;
            rectF.top = ((i3 / 2.0f) - (size / 2.0f)) + f;
            rectF.right = size - f;
            rectF.bottom = ((i3 / 2.0f) + (size / 2.0f)) - f;
        } else if (size > i3) {
            RectF rectF2 = this.f;
            float f2 = this.e;
            rectF2.left = ((size / 2.0f) - (i3 / 2.0f)) + f2;
            rectF2.top = f2;
            rectF2.right = ((size / 2.0f) + (i3 / 2.0f)) - f2;
            rectF2.bottom = i3 - f2;
        } else {
            RectF rectF3 = this.f;
            float f3 = this.e;
            rectF3.left = f3;
            rectF3.top = f3;
            rectF3.right = size - f3;
            rectF3.bottom = i3 - f3;
        }
        super.onMeasure(i, i2);
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = null;
        this.e = 7.0f;
        this.f = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.g = Color.parseColor("#A5A5A5");
        this.h = Color.parseColor("#FA9025");
        this.i = this.g;
        this.j = 20.0f;
        this.k = 0;
        this.l = "";
        this.m = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.s.o8);
        this.j = typedArrayObtainStyledAttributes.getDimension(h.s.J8, this.j);
        this.i = typedArrayObtainStyledAttributes.getColor(h.s.I8, this.i);
        this.l = typedArrayObtainStyledAttributes.getString(h.s.G8) == null ? this.l : typedArrayObtainStyledAttributes.getString(h.s.G8);
        this.e = typedArrayObtainStyledAttributes.getDimension(h.s.F8, this.e);
        this.g = typedArrayObtainStyledAttributes.getColor(h.s.t8, this.g);
        this.h = typedArrayObtainStyledAttributes.getColor(h.s.z8, this.h);
        this.k = typedArrayObtainStyledAttributes.getInt(h.s.u8, this.k);
        this.n = typedArrayObtainStyledAttributes.getInt(h.s.A8, 0) == 0 ? Paint.Style.STROKE : Paint.Style.FILL;
        typedArrayObtainStyledAttributes.recycle();
        a();
    }
}
