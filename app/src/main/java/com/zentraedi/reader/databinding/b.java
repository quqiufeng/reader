package com.zentraedi.reader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.databinding.c0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class b extends a {

    @p0
    private static final c0.i H = null;

    @p0
    private static final SparseIntArray I;

    @n0
    private final RelativeLayout F;
    private long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(com.zentraedi.reader.h.i.zi, 1);
    }

    public b(@p0 androidx.databinding.l lVar, @n0 View view) {
        this(lVar, view, c0.m0(lVar, view, 2, H, I));
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
            this.G = 1L;
        }
        C0();
    }

    public boolean l1(int i, @p0 Object obj) {
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

    private b(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (RecyclerView) objArr[1]);
        this.G = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.F = relativeLayout;
        relativeLayout.setTag(null);
        P0(view);
        i0();
    }
}
