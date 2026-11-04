package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class o0 extends n0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i K = null;

    @androidx.annotation.p0
    private static final SparseIntArray L;

    @androidx.annotation.n0
    private final FrameLayout I;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.P6, 1);
        sparseIntArray.put(com.zentraedi.comic.q.i.le, 2);
        sparseIntArray.put(com.zentraedi.comic.q.i.EA, 3);
        sparseIntArray.put(com.zentraedi.comic.q.i.S7, 4);
    }

    public o0(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
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

    private o0(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[1], (TextView) objArr[4], (TextView) objArr[2], (RecyclerView) objArr[3]);
        this.J = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.I = frameLayout;
        frameLayout.setTag(null);
        P0(view);
        i0();
    }
}
