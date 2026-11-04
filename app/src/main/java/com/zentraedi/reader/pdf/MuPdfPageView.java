package com.zentraedi.reader.pdf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Scroller;
import com.artifex.mupdf.fitz.Link;
import com.artifex.mupdf.fitz.Quad;
import com.tencent.tbs.one.TBSOneErrorCodes;
import com.zentraedi.reader.adapter.view.NovelLinearLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class MuPdfPageView extends View implements GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener {
    private static final Class<?> C = MuPdfPageView.class;
    private final Rect A;
    private boolean B;
    protected d a;
    protected float b;
    protected float c;
    protected final float d;
    protected final float e;
    protected Bitmap f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected Link[] m;
    protected Quad[] n;
    protected final boolean o;
    protected final GestureDetector p;
    protected final ScaleGestureDetector q;
    protected final Scroller r;
    protected boolean s;
    protected final Paint t;
    protected final Path u;
    protected final Paint v;
    protected final Paint w;
    private NovelLinearLayout.a x;
    private boolean y;
    private boolean z;

    public MuPdfPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = true;
        this.y = true;
        this.z = false;
        this.A = new Rect(0, 0, 0, 0);
        this.r = new Scroller(context);
        this.p = new GestureDetector(context, this);
        this.q = new ScaleGestureDetector(context, this);
        this.b = 1.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 2.0f;
        Paint paint = new Paint();
        this.v = paint;
        paint.setARGB(32, 0, 0, 255);
        Paint paint2 = new Paint();
        this.w = paint2;
        paint2.setARGB(32, 255, 0, 0);
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.t = paint3;
        paint3.setARGB(255, 255, 80, 80);
        paint3.setStrokeWidth(5.0f);
        paint3.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        this.u = path;
        path.moveTo(-100.0f, -100.0f);
        path.lineTo(100.0f, 100.0f);
        path.moveTo(100.0f, -100.0f);
        path.lineTo(-100.0f, 100.0f);
    }

    public void a() {
        if (this.f != null) {
            this.f = null;
        }
        this.m = null;
        this.n = null;
        this.f = null;
    }

    public void b() {
        this.r.forceFinished(true);
        int i = this.l;
        if (i <= 0) {
            int i2 = this.k;
            if (i2 <= 0) {
                d dVar = this.a;
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            this.r.startScroll(i2, i, ((-this.i) * 9) / 10, (this.h - this.j) - i, TBSOneErrorCodes.OTHER_BASE);
        } else {
            this.r.startScroll(this.k, i, 0, ((-this.j) * 9) / 10, 250);
        }
        invalidate();
    }

    public void c() {
        this.r.forceFinished(true);
        int i = this.l;
        int i2 = this.j;
        if (i + i2 >= this.h) {
            int i3 = this.k;
            int i4 = this.i;
            if (i3 + i4 >= this.g) {
                d dVar = this.a;
                if (dVar != null) {
                    dVar.f();
                    return;
                }
                return;
            }
            this.r.startScroll(i3, i, (i4 * 9) / 10, -i, TBSOneErrorCodes.OTHER_BASE);
        } else {
            this.r.startScroll(this.k, i, 0, (i2 * 9) / 10, 250);
        }
        invalidate();
    }

    public boolean d() {
        return this.B;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void e() {
        this.n = null;
        invalidate();
    }

    public void f(Bitmap bitmap, float f, boolean z, Link[] linkArr, Quad[] quadArr) {
        Bitmap bitmap2 = this.f;
        if (bitmap2 != null && bitmap2 != bitmap) {
            bitmap2.recycle();
        }
        this.s = false;
        this.m = linkArr;
        this.n = quadArr;
        this.f = bitmap;
        this.g = (int) ((bitmap.getWidth() * this.c) / f);
        this.h = (int) ((this.f.getHeight() * this.c) / f);
        this.r.forceFinished(true);
        if (this.b == f) {
            this.k = z ? this.g - this.i : 0;
            this.l = z ? this.h - this.j : 0;
        }
        this.b = f;
        invalidate();
    }

    public void g() {
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.s = true;
        this.m = null;
        this.n = null;
        this.f = null;
        invalidate();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.r.forceFinished(true);
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        try {
            nd.a.e(C.getName(), "onDraw ViewHeight " + getHeight());
            Bitmap bitmap = this.f;
            if (bitmap != null && !bitmap.isRecycled()) {
                if (this.r.computeScrollOffset()) {
                    this.k = this.r.getCurrX();
                    this.l = this.r.getCurrY();
                    invalidate();
                }
                int i3 = this.g;
                int i4 = this.i;
                if (i3 <= i4) {
                    this.k = 0;
                    i = (i4 - i3) / 2;
                } else {
                    if (this.k < 0) {
                        this.k = 0;
                    }
                    if (this.k > i3 - i4) {
                        this.k = i3 - i4;
                    }
                    i = -this.k;
                }
                int i5 = i;
                int i6 = this.h;
                int i7 = this.j;
                if (i6 <= i7) {
                    this.l = 0;
                    i2 = (i7 - i6) / 2;
                } else {
                    if (this.l < 0) {
                        this.l = 0;
                    }
                    if (this.l > i6 - i7) {
                        this.l = i6 - i7;
                    }
                    i2 = -this.l;
                }
                int i8 = i2;
                Rect rect = this.A;
                rect.left = i5;
                rect.top = i8;
                rect.right = i3 + i5;
                rect.bottom = i6 + i8;
                canvas.drawBitmap(this.f, (Rect) null, rect, (Paint) null);
                Link[] linkArr = this.m;
                if (linkArr != null && linkArr.length > 0) {
                    for (Link link : linkArr) {
                        com.artifex.mupdf.fitz.Rect bounds = link.getBounds();
                        float f = i5;
                        float f2 = bounds.x0;
                        float f3 = this.c;
                        float f4 = i8;
                        canvas.drawRect((f2 * f3) + f, (bounds.y0 * f3) + f4, f + (bounds.x1 * f3), f4 + (bounds.y1 * f3), this.v);
                    }
                }
                Quad[] quadArr = this.n;
                if (quadArr == null || quadArr.length <= 0) {
                    return;
                }
                for (Quad quad : quadArr) {
                    Path path = new Path();
                    float f5 = i5;
                    float f6 = quad.ul_x;
                    float f7 = this.c;
                    float f8 = i8;
                    path.moveTo((f6 * f7) + f5, (quad.ul_y * f7) + f8);
                    float f9 = quad.ll_x;
                    float f10 = this.c;
                    path.lineTo((f9 * f10) + f5, (quad.ll_y * f10) + f8);
                    float f11 = quad.lr_x;
                    float f12 = this.c;
                    path.lineTo((f11 * f12) + f5, (quad.lr_y * f12) + f8);
                    float f13 = quad.ur_x;
                    float f14 = this.c;
                    path.lineTo(f5 + (f13 * f14), f8 + (quad.ur_y * f14));
                    path.close();
                    canvas.drawPath(path, this.w);
                }
                return;
            }
            if (this.s) {
                canvas.translate(this.i / 2.0f, this.j / 2.0f);
                canvas.drawPath(this.u, this.t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f != null) {
            int i = this.g;
            int i2 = this.i;
            int i3 = i > i2 ? i - i2 : 0;
            int i4 = this.h;
            int i5 = this.j;
            int i6 = i4 > i5 ? i4 - i5 : 0;
            this.r.forceFinished(true);
            this.r.fling(this.k, this.l, (int) (-f), (int) (-f2), 0, i3, 0, i6);
            invalidate();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        nd.a.a(com.zentraedi.reader.f.a, "");
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.f != null) {
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            float f = this.k + focusX;
            float f2 = this.c;
            float f3 = f / f2;
            float f4 = (this.l + focusY) / f2;
            float f5 = scaleFactor * f2;
            if (Math.abs(f2 - this.d) < 0.01d && f5 <= ((double) this.d) + 0.01d) {
                return true;
            }
            if (Math.abs(f2 - this.e) < 0.01d && f5 >= ((double) this.e) - 0.01d) {
                return true;
            }
            this.c = f5;
            float f6 = this.d;
            if (f5 < f6) {
                this.c = f6;
            }
            float f7 = this.c;
            float f8 = this.e;
            if (f7 > f8) {
                this.c = f8;
            }
            this.g = (int) ((this.f.getWidth() * this.c) / this.b);
            float height = this.f.getHeight();
            float f9 = this.c;
            this.h = (int) ((height * f9) / this.b);
            this.k = (int) ((f3 * f9) - focusX);
            this.l = (int) ((f4 * f9) - focusY);
            this.r.forceFinished(true);
            invalidate();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        d dVar = this.a;
        if (dVar != null) {
            dVar.d(this.c);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f != null) {
            this.k += (int) f;
            this.l += (int) f2;
            this.r.forceFinished(true);
            if ((Math.abs(f) > Math.abs(f2) && this.k <= 0) || this.k > this.g - this.i) {
                int i = this.k;
                if (i <= 0) {
                    this.k = 0;
                } else {
                    int i2 = this.g;
                    int i3 = this.i;
                    if (i > i2 - i3) {
                        this.k = i2 - i3;
                    }
                }
                getParent().requestDisallowInterceptTouchEvent(false);
                return false;
            }
            invalidate();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        nd.a.a(com.zentraedi.reader.f.a, "");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        d dVar;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Link[] linkArr = this.m;
        boolean z = false;
        if (linkArr != null) {
            int i = this.g;
            int i2 = this.i;
            float f = i <= i2 ? (i - i2) / 2 : this.k;
            int i3 = this.h;
            int i4 = this.j;
            float f2 = i3 <= i4 ? (i3 - i4) / 2 : this.l;
            float f3 = this.c;
            float f4 = (f + x) / f3;
            float f5 = (y + f2) / f3;
            for (Link link : linkArr) {
                com.artifex.mupdf.fitz.Rect bounds = link.getBounds();
                if (f4 >= bounds.x0 && f4 <= bounds.x1 && f5 >= bounds.y0 && f5 <= bounds.y1) {
                    if (link.isExternal()) {
                        this.a.g(link.getURI());
                    } else {
                        this.a.c(link.getURI());
                    }
                    z = true;
                    break;
                }
            }
        }
        this.z = z;
        if (!z) {
            float f6 = this.i / 3.0f;
            float f7 = 2.0f * f6;
            if (x <= f6) {
                b();
            } else if (x >= f7) {
                c();
            } else if (x > f6 && x < f7 && (dVar = this.a) != null) {
                dVar.a();
            }
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.i = i;
        this.j = i2;
        d dVar = this.a;
        if (dVar != null) {
            dVar.e(i, i2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.y && motionEvent.getAction() == 1) {
            this.y = true;
            return true;
        }
        if (motionEvent.getPointerCount() == 1 || d()) {
            getParent().requestDisallowInterceptTouchEvent(true);
            if (this.y) {
                this.p.onTouchEvent(motionEvent);
            }
        } else {
            this.y = false;
            this.q.onTouchEvent(motionEvent);
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        if (this.x == null || Math.abs(iArr[0]) > 100 || this.z) {
            return false;
        }
        return this.x.onTouchEvent(motionEvent);
    }

    public void setActionListener(d dVar) {
        this.a = dVar;
    }

    public void setForbiddenZoom(boolean z) {
        this.B = z;
    }

    public void setInnerOnTouchListener(NovelLinearLayout.a aVar) {
        this.x = aVar;
    }

    public void setViewScale(float f) {
        this.c = f;
    }
}
