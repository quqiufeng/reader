package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class m0 extends l0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i K = null;

    @androidx.annotation.p0
    private static final SparseIntArray L;

    @androidx.annotation.n0
    private final LinearLayout I;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.En, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.gK, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.dJ, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.hJ, 4);
    }

    public m0(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 5, K, L));
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

    public boolean l1(int variableId, @androidx.annotation.p0 Object variable) {
        return true;
    }

    protected boolean o0(int localFieldId, Object object, int fieldId) {
        return false;
    }

    protected void r() {
        synchronized (this) {
            this.J = 0L;
        }
    }

    private m0(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (LinearLayout) bindings[1], (TextView) bindings[3], (TextView) bindings[4], (TextView) bindings[2]);
        this.J = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.I = linearLayout;
        linearLayout.setTag(null);
        P0(root);
        i0();
    }
}
