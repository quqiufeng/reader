package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class p2 extends o2 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i G = null;

    @androidx.annotation.p0
    private static final SparseIntArray H = null;

    @androidx.annotation.n0
    private final LinearLayout E;
    private long F;

    public p2(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 1, G, H));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.F = 1L;
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
            this.F = 0L;
        }
    }

    private p2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0);
        this.F = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.E = linearLayout;
        linearLayout.setTag(null);
        P0(view);
        i0();
    }
}
