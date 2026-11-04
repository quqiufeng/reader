package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class g5 extends f5 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i J = null;

    @androidx.annotation.p0
    private static final SparseIntArray K;

    @androidx.annotation.n0
    private final ConstraintLayout H;
    private long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.bA, 1);
        sparseIntArray.put(com.zentraedi.comic.q.i.aA, 2);
        sparseIntArray.put(com.zentraedi.comic.q.i.Xz, 3);
    }

    public g5(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 4, J, K));
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
            this.I = 1L;
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
            this.I = 0L;
        }
    }

    private g5(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[1]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        P0(view);
        i0();
    }
}
