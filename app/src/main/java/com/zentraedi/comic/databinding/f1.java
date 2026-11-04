package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class f1 extends e1 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i N = null;

    @androidx.annotation.p0
    private static final SparseIntArray O;

    @androidx.annotation.n0
    private final LinearLayout L;
    private long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.WS, 1);
        sparseIntArray.put(com.zentraedi.comic.q.i.KP, 2);
        sparseIntArray.put(com.zentraedi.comic.q.i.dK, 3);
        sparseIntArray.put(com.zentraedi.comic.q.i.Pe, 4);
        sparseIntArray.put(com.zentraedi.comic.q.i.tP, 5);
        sparseIntArray.put(com.zentraedi.comic.q.i.JP, 6);
    }

    public f1(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 7, N, O));
    }

    @Override // com.zentraedi.comic.databinding.e1
    public void C1(@androidx.annotation.p0 n6 n6Var) {
        this.K = n6Var;
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.M = 2L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.B4 != i) {
            return false;
        }
        C1((n6) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        return false;
    }

    protected void r() {
        synchronized (this) {
            this.M = 0L;
        }
    }

    private f1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (EditText) objArr[4], (TextView) objArr[3], (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[2], (TextView) objArr[1]);
        this.M = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.L = linearLayout;
        linearLayout.setTag(null);
        P0(view);
        i0();
    }
}
