package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class m4 extends l4 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i K = null;

    @androidx.annotation.p0
    private static final SparseIntArray L;

    @androidx.annotation.n0
    private final LinearLayout I;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.tU, 1);
        sparseIntArray.put(com.zentraedi.comic.q.i.sU, 2);
        sparseIntArray.put(com.zentraedi.comic.q.i.Qp, 3);
        sparseIntArray.put(com.zentraedi.comic.q.i.Bq, 4);
    }

    public m4(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 5, K, L));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    private m4(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (LinearLayout) objArr[3], (LinearLayout) objArr[4], (View) objArr[2], (View) objArr[1]);
        this.J = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.I = linearLayout;
        linearLayout.setTag(null);
        P0(view);
        i0();
    }
}
