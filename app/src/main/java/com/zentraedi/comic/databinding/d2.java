package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import com.zentraedi.comic.viewmodel.p6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class d2 extends c2 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i H = null;

    @androidx.annotation.p0
    private static final SparseIntArray I = null;
    private long G;

    public d2(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 1, H, I));
    }

    @Override // com.zentraedi.comic.databinding.c2
    public void C1(@androidx.annotation.p0 p6 p6Var) {
        this.F = p6Var;
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.G = 2L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((p6) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        return false;
    }

    protected void r() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    private d2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (FrameLayout) objArr[0]);
        this.G = -1L;
        this.E.setTag(null);
        P0(view);
        i0();
    }
}
