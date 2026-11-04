package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class k0 extends j0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i M = null;

    @androidx.annotation.p0
    private static final SparseIntArray N;
    private long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.yt, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.sM, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.qL, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ri, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Uy, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.CL, 6);
    }

    public k0(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 7, M, N));
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

    public boolean l1(int variableId, @androidx.annotation.p0 Object variable) {
        return true;
    }

    protected boolean o0(int localFieldId, Object object, int fieldId) {
        return false;
    }

    protected void r() {
        synchronized (this) {
            this.L = 0L;
        }
    }

    private k0(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[4], (ProgressBar) bindings[1], (RelativeLayout) bindings[5], (RelativeLayout) bindings[0], (TextView) bindings[3], (TextView) bindings[6], (TextView) bindings[2]);
        this.L = -1L;
        this.H.setTag(null);
        P0(root);
        i0();
    }
}
