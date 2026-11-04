package com.zentraedi.reader.simulation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.n0;
import com.zentraedi.reader.f;
import com.zentraedi.reader.pageflip.PageFlipState;
import com.zentraedi.reader.pageflip.i;
import com.zentraedi.reader.pageflip.j;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class e extends d {
    public static final Class<?> q = e.class;
    public static final int r = 0;
    public static final int s = 1;
    public static final int t = 2;
    private int o;
    private final b p;

    public e(Context context, j jVar, Handler handler, int i, @n0 b bVar) {
        super(context, jVar, handler, i);
        this.o = 1;
        this.p = bVar;
    }

    private void k(int i) {
        int width = this.c.getWidth();
        int height = this.c.getHeight();
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        Bitmap bitmapF = this.p.f(i);
        if (bitmapF == null || bitmapF.isRecycled()) {
            nd.a.c(f.a, " background == null  ");
        } else {
            this.c.drawBitmap(bitmapF, (Rect) null, new Rect(0, 0, width, height), paint);
        }
    }

    @Override // com.zentraedi.reader.simulation.d
    public void b() {
        this.g.v();
        i iVarA = this.g.A();
        int i = this.a;
        if (i == 0 || i == 1) {
            if (this.g.B() == PageFlipState.FORWARD_FLIP) {
                if (!iVarA.t()) {
                    k(2);
                    iVarA.A(this.b);
                }
            } else if (!iVarA.q()) {
                this.o--;
                k(0);
                iVarA.x(this.b);
            }
            this.g.w();
        } else if (i == 2) {
            if (!iVarA.q()) {
                k(1);
                iVarA.x(this.b);
            }
            this.g.x();
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.arg1 = this.a;
        this.f.sendMessage(messageObtain);
    }

    @Override // com.zentraedi.reader.simulation.d
    public boolean c(int i) {
        c.b bVar;
        if (i != 1) {
            return false;
        }
        if (this.g.b()) {
            this.a = 1;
        } else {
            PageFlipState pageFlipStateB = this.g.B();
            if (pageFlipStateB == PageFlipState.END_WITH_BACKWARD) {
                c.b bVar2 = this.h;
                if (bVar2 != null) {
                    bVar2.a(false);
                }
            } else if (pageFlipStateB == PageFlipState.END_WITH_FORWARD) {
                this.g.A().y();
                int i2 = this.o + 1;
                this.o = i2;
                if (i2 == 1) {
                    c.b bVar3 = this.h;
                    if (bVar3 != null) {
                        bVar3.onCancel();
                    }
                } else {
                    c.b bVar4 = this.h;
                    if (bVar4 != null) {
                        bVar4.a(true);
                    }
                }
            } else if (pageFlipStateB == PageFlipState.END_WITH_RESTORE && (bVar = this.h) != null) {
                bVar.onCancel();
            }
            this.o = 1;
            this.a = 2;
        }
        return true;
    }

    @Override // com.zentraedi.reader.simulation.d
    public void f(int i, int i2) {
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap bitmap2 = this.b;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        i iVarA = this.g.A();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) iVarA.F(), (int) iVarA.m(), Bitmap.Config.ARGB_8888);
        this.b = bitmapCreateBitmap;
        this.c.setBitmap(bitmapCreateBitmap);
    }

    public boolean i() {
        this.g.A().B();
        return true;
    }

    public boolean j() {
        return true;
    }
}
