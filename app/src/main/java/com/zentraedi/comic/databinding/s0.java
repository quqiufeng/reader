package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class s0 extends r0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i U = null;

    @androidx.annotation.p0
    private static final SparseIntArray V;

    @androidx.annotation.n0
    private final LinearLayout S;
    private long T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.ei, 1);
        sparseIntArray.put(com.zentraedi.comic.q.i.Ys, 2);
        sparseIntArray.put(com.zentraedi.comic.q.i.hI, 3);
        sparseIntArray.put(com.zentraedi.comic.q.i.P6, 4);
        sparseIntArray.put(com.zentraedi.comic.q.i.Ta, 5);
        sparseIntArray.put(com.zentraedi.comic.q.i.e5, 6);
        sparseIntArray.put(com.zentraedi.comic.q.i.zv, 7);
        sparseIntArray.put(com.zentraedi.comic.q.i.n2, 8);
        sparseIntArray.put(com.zentraedi.comic.q.i.JT, 9);
        sparseIntArray.put(com.zentraedi.comic.q.i.Jd, 10);
        sparseIntArray.put(com.zentraedi.comic.q.i.CF, 11);
        sparseIntArray.put(com.zentraedi.comic.q.i.f511id, 12);
        sparseIntArray.put(com.zentraedi.comic.q.i.Hb, 13);
        sparseIntArray.put(com.zentraedi.comic.q.i.ju, 14);
    }

    public s0(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 15, U, V));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.T != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.T = 1L;
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
            this.T = 0L;
        }
    }

    private s0(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (TextView) objArr[8], (TextView) objArr[6], (ImageView) objArr[4], (TextView) objArr[5], (TextView) objArr[13], (TextView) objArr[12], (TextView) objArr[10], (ImageView) objArr[1], (TextView) objArr[2], (TextView) objArr[14], (TextView) objArr[7], (TextView) objArr[11], (TextView) objArr[3], (TextView) objArr[9]);
        this.T = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.S = linearLayout;
        linearLayout.setTag(null);
        P0(view);
        i0();
    }
}
