package com.zentraedi.reader;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.annotation.w0;
import androidx.appcompat.widget.AppCompatTextView;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.reader.reader.m;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class NovelTextView extends AppCompatTextView {
    private static final Class<?> y = NovelTextView.class;
    final float[] h;
    private m i;
    private c j;
    private int k;
    private final int l;
    private Paint m;
    private int n;
    private int o;
    private Paint p;
    private final int q;
    private int r;
    private a s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private Paint x;

    public interface a {
        void a(int i);
    }

    public NovelTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new float[1];
        this.l = com.zentraedi.reader.reader.e.c(context);
        this.q = com.zentraedi.reader.reader.e.d(context);
    }

    private void setLetterSpacingImpl(float f) {
        this.m.setLetterSpacing(f);
    }

    private float v(String str, int i, boolean z) {
        this.m.breakText(str, true, i - (this.k * 2.0f), this.h);
        if ((z || (i - (this.k * 2)) - this.h[0] < this.m.getTextSize()) && str.length() > 1) {
            return (((i - (this.k * 2)) - this.h[0]) / (str.length() - 1)) / this.m.getTextSize();
        }
        return 0.0f;
    }

    private void w(int i) {
        this.m = this.j.getContentProperty().c;
        this.n = this.j.getContentProperty().a;
        this.o = this.j.getContentProperty().b;
        this.p = this.j.getTitleProperty().c;
        if (i != 0) {
            this.m.setColor(i);
            this.p.setColor(i);
        }
    }

    public int getContentHeight() {
        return this.r;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0332  */
    /* JADX WARN: Code duplicated, block: B:96:0x0320  */
    /* JADX WARN: Code duplicated, block: B:98:0x0328  */
    /* JADX WARN: Multi-variable type inference failed */
    @w0(api = 21)
    protected void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        int i5;
        int i6;
        String str;
        int i7;
        float f3;
        int i8;
        float f4;
        Canvas canvas2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int measuredWidth = getMeasuredWidth();
        this.r = 0;
        if (this.i == null) {
            return;
        }
        c cVar = this.j;
        if (cVar != null) {
            this.k = cVar.getMarginWidth();
            this.x = this.j.getHighlightPaint();
        }
        if (this.x == null) {
            Paint paint = new Paint();
            this.x = paint;
            paint.setColor(getResources().getColor(h.f.V));
        }
        int i14 = this.u;
        int i15 = -1;
        if (i14 < 0 || (i9 = this.v) <= 0 || i9 <= i14) {
            i = -1;
            i2 = -1;
            i3 = -1;
            i4 = -1;
        } else {
            int i16 = 0;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            for (int i21 = 0; i21 < this.i.e().size(); i21++) {
                int length = this.i.e().get(i21).length();
                i16 += length;
                if (i17 == -1 && (i12 = this.u) < i16 && i12 >= (i13 = i16 - length)) {
                    i19 = i12 - i13;
                    i17 = i21;
                    if (i19 < 0) {
                        i19 = 0;
                    }
                }
                if (i18 == -1 && (i10 = this.v) <= i16 && i10 >= (i11 = i16 - length)) {
                    i20 = i10 - i11;
                    i18 = i21;
                    if (i20 < 0) {
                        i20 = 0;
                    }
                }
                if (i19 != -1 && i18 != -1) {
                    break;
                }
            }
            i = i17;
            i2 = i18;
            i3 = i19;
            i4 = i20;
        }
        float f5 = this.l - this.m.getFontMetrics().ascent;
        float f6 = this.l - this.p.getFontMetrics().ascent;
        int textSize = this.n + ((int) this.m.getTextSize());
        int i22 = 0;
        boolean z = true;
        while (i22 < this.i.e().size()) {
            String str2 = this.i.e().get(i22);
            setLetterSpacingImpl(0.0f);
            boolean z2 = this.i.d().get(i22);
            int length2 = str2.length();
            if (!this.i.q() || !z) {
                f = f5;
                f2 = f6;
                i5 = i22;
                i6 = textSize;
                Canvas canvas3 = canvas;
                str = str2;
                if (str.trim().length() == 0) {
                    f3 = f;
                    i8 = i6;
                    i7 = -1;
                } else {
                    setLetterSpacingImpl(v(str, measuredWidth, z2));
                    if (i == -1 || i2 == -1) {
                        i7 = -1;
                    } else {
                        if (i == i2 && i5 == i) {
                            float fMeasureText = this.m.measureText(str) / length2;
                            i7 = -1;
                            canvas3.drawRect(this.k + (i3 * fMeasureText), this.m.getFontMetrics().ascent + f, this.k + (i4 * fMeasureText), this.m.getFontMetrics().bottom + f, this.x);
                        } else {
                            i7 = -1;
                            if (i5 == i) {
                                float fMeasureText2 = this.m.measureText(str);
                                canvas3 = canvas;
                                canvas3.drawRect(this.k + (i3 * (fMeasureText2 / length2)), this.m.getFontMetrics().ascent + f, this.k + fMeasureText2, f + this.m.getFontMetrics().bottom, this.x);
                            } else if (i5 == i2) {
                                canvas3 = canvas;
                                canvas3.drawRect(this.k, this.m.getFontMetrics().ascent + f, this.k + (i4 * (this.m.measureText(str) / length2)), f + this.m.getFontMetrics().bottom, this.x);
                            } else if (i5 > i && i5 < i2) {
                                canvas3 = canvas;
                                canvas3.drawRect(this.k, this.m.getFontMetrics().ascent + f, this.k + this.m.measureText(str), f + this.m.getFontMetrics().bottom, this.x);
                            }
                        }
                        canvas3 = canvas;
                    }
                    canvas3.drawText(str, this.k, f, this.m);
                    if (this.i.q() || !z) {
                        i8 = i6;
                        if (!str.endsWith("\n") || str.endsWith("\r\n")) {
                            f4 = i8 + this.o;
                        } else {
                            f4 = i8;
                        }
                        f3 = f4 + f;
                    } else if (str.endsWith("\n") || str.endsWith("\r\n")) {
                        i8 = i6;
                        f3 = i8 + f2 + this.o + this.q;
                        z = false;
                    } else {
                        i8 = i6;
                        f2 = i8 + f2;
                        f3 = f;
                    }
                }
            } else if (str2.trim().length() == 0) {
                float f7 = textSize;
                float f8 = f6 - f7;
                float f9 = f7 + f8 + this.q;
                f2 = f8;
                i5 = i22;
                i7 = i15;
                i8 = textSize;
                z = false;
                f3 = f9;
            } else {
                if (i == i15 || i2 == i15) {
                    f = f5;
                    f2 = f6;
                    i5 = i22;
                    i6 = textSize;
                    canvas2 = canvas;
                    str = str2;
                } else if (i == i2 && i22 == i) {
                    float fMeasureText3 = this.p.measureText(str2) / length2;
                    i5 = i22;
                    i6 = textSize;
                    str = str2;
                    f2 = f6;
                    f = f5;
                    canvas2 = canvas;
                    canvas2.drawRect(this.k + (i3 * fMeasureText3), this.p.getFontMetrics().ascent + f6, this.k + (i4 * fMeasureText3), this.p.getFontMetrics().bottom + f6, this.x);
                } else {
                    f = f5;
                    f2 = f6;
                    i5 = i22;
                    i6 = textSize;
                    str = str2;
                    if (i5 == i) {
                        float fMeasureText4 = this.p.measureText(str);
                        canvas2 = canvas;
                        canvas2.drawRect(this.k + (i3 * (fMeasureText4 / length2)), this.p.getFontMetrics().ascent + f2, this.k + fMeasureText4, f2 + this.p.getFontMetrics().bottom, this.x);
                    } else if (i5 == i2) {
                        canvas2 = canvas;
                        canvas2.drawRect(this.k, this.p.getFontMetrics().ascent + f2, this.k + (i4 * (this.p.measureText(str) / length2)), f2 + this.p.getFontMetrics().bottom, this.x);
                    } else if (i5 <= i || i5 >= i2) {
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        canvas2.drawRect(this.k, this.p.getFontMetrics().ascent + f2, this.k + this.p.measureText(str), f2 + this.p.getFontMetrics().bottom, this.x);
                    }
                }
                canvas2.drawText(str, this.k, f2, this.p);
                i7 = -1;
                if (this.i.q()) {
                    i8 = i6;
                    if (str.endsWith("\n")) {
                        f4 = i8 + this.o;
                    } else {
                        f4 = i8 + this.o;
                    }
                    f3 = f4 + f;
                } else {
                    i8 = i6;
                    if (str.endsWith("\n")) {
                        f4 = i8 + this.o;
                    } else {
                        f4 = i8 + this.o;
                    }
                    f3 = f4 + f;
                }
            }
            textSize = i8;
            f5 = f3;
            i22 = i5 + 1;
            f6 = f2;
            i15 = i7;
        }
        int i23 = (int) (f5 - textSize);
        this.r = i23;
        if (i23 <= 0) {
            this.r = 1;
        }
        a aVar = this.s;
        if (aVar == null || !this.t) {
            return;
        }
        aVar.a(this.r);
        this.t = false;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setOnDrawCompleteListener(a aVar) {
        this.s = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTxtPage(m mVar) {
        this.u = -1;
        this.v = -1;
        this.t = true;
        this.i = mVar;
        if (mVar != null && !j0.l(mVar.e())) {
            Iterator<String> it = this.i.e().iterator();
            int length = 0;
            while (it.hasNext()) {
                length += it.next().length();
            }
            this.w = length;
        }
        this.r = 0;
        w(0);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void x(int i, int i2) {
        if (this.v == i2 && i == this.u) {
            return;
        }
        this.u = i;
        this.v = i2;
        int i3 = this.w;
        if (i2 > i3) {
            this.v = i3;
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void y(c cVar, int i) {
        this.u = -1;
        this.v = -1;
        this.t = true;
        this.r = 0;
        this.j = cVar;
        w(i);
        invalidate();
    }
}
