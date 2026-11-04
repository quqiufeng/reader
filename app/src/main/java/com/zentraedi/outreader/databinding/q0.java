package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class q0 extends p0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i M = null;

    @androidx.annotation.p0
    private static final SparseIntArray N;
    private long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.ez, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Xi, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Yi, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Zi, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.uM, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.ON, 6);
    }

    public q0(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
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

    private q0(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[2], (ImageView) bindings[3], (ImageView) bindings[4], (RelativeLayout) bindings[1], (RelativeLayout) bindings[0], (TextView) bindings[5], (TextView) bindings[6]);
        this.L = -1L;
        this.I.setTag(null);
        P0(root);
        i0();
    }
}
