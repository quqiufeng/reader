package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class g2 extends f2 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i I = null;

    @androidx.annotation.p0
    private static final SparseIntArray J;

    @androidx.annotation.n0
    private final RelativeLayout G;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.WS, 1);
        sparseIntArray.put(com.zentraedi.comic.q.i.RP, 2);
    }

    public g2(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 3, I, J));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.H = 1L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        return false;
    }

    protected void r() {
        synchronized (this) {
            this.H = 0L;
        }
    }

    private g2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (TextView) objArr[2], (TextView) objArr[1]);
        this.H = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.G = relativeLayout;
        relativeLayout.setTag(null);
        P0(view);
        i0();
    }
}
