package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class n extends m {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i M = null;

    @androidx.annotation.p0
    private static final SparseIntArray N;

    @androidx.annotation.n0
    private final RelativeLayout K;
    private long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.d8, 1);
        sparseIntArray.put(com.zentraedi.comic.q.i.t4, 2);
        sparseIntArray.put(com.zentraedi.comic.q.i.r4, 3);
        sparseIntArray.put(com.zentraedi.comic.q.i.Uq, 4);
        sparseIntArray.put(com.zentraedi.comic.q.i.I7, 5);
        sparseIntArray.put(com.zentraedi.comic.q.i.JF, 6);
    }

    public n(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 7, M, N));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.L = 1L;
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
            this.L = 0L;
        }
    }

    private n(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (RadioGroup) objArr[3], (RelativeLayout) objArr[2], (RadioButton) objArr[5], (FrameLayout) objArr[1], (RadioButton) objArr[4], (RadioButton) objArr[6]);
        this.L = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.K = relativeLayout;
        relativeLayout.setTag(null);
        P0(view);
        i0();
    }
}
