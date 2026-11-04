package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class o4 extends n4 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i J = null;

    @androidx.annotation.p0
    private static final SparseIntArray K;

    @androidx.annotation.n0
    private final FrameLayout H;
    private long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.fT, 2);
    }

    public o4(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 3, J, K));
    }

    @Override // com.zentraedi.comic.databinding.n4
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.b1 b1Var) {
        this.G = b1Var;
        synchronized (this) {
            this.I |= 1;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.I = 2L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.b1) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        return false;
    }

    protected void r() {
        long j;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        com.zentraedi.comic.viewmodel.b1 b1Var = this.G;
        long j2 = j & 3;
        View.OnClickListener onClickListenerR0 = (j2 == 0 || b1Var == null) ? null : b1Var.r0();
        if (j2 != 0) {
            this.H.setOnClickListener(onClickListenerR0);
        }
    }

    private o4(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (LinearLayout) objArr[0], (ImageView) objArr[2]);
        this.I = -1L;
        this.E.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[1];
        this.H = frameLayout;
        frameLayout.setTag(null);
        P0(view);
        i0();
    }
}
