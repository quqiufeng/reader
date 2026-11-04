package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class l extends k {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i H = null;

    @androidx.annotation.p0
    private static final SparseIntArray I;

    @androidx.annotation.n0
    private final LinearLayout F;
    private long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.JK, 1);
    }

    public l(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 2, H, I));
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

    public boolean l1(int variableId, @androidx.annotation.p0 Object variable) {
        return true;
    }

    protected boolean o0(int localFieldId, Object object, int fieldId) {
        return false;
    }

    protected void r() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    private l(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[1]);
        this.G = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.F = linearLayout;
        linearLayout.setTag(null);
        P0(root);
        i0();
    }
}
