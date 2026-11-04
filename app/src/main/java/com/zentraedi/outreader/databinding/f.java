package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class f extends e {

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
        sparseIntArray.put(com.zentraedi.outreader.d.i.ZE, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.YE, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.XE, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.WE, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Wk, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.EJ, 6);
    }

    public f(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 7, N, O));
    }

    @Override // com.zentraedi.outreader.databinding.e
    public void C1(@androidx.annotation.p0 com.zentraedi.outreader.viewmodel.e ViewModel) {
        this.K = ViewModel;
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

    public boolean l1(int variableId, @androidx.annotation.p0 Object variable) {
        if (com.zentraedi.outreader.a.A4 != variableId) {
            return false;
        }
        C1((com.zentraedi.outreader.viewmodel.e) variable);
        return true;
    }

    protected boolean o0(int localFieldId, Object object, int fieldId) {
        return false;
    }

    protected void r() {
        synchronized (this) {
            this.M = 0L;
        }
    }

    private f(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (LinearLayout) bindings[5], (Switch) bindings[4], (Switch) bindings[3], (Switch) bindings[2], (Switch) bindings[1], (TextView) bindings[6]);
        this.M = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.L = linearLayout;
        linearLayout.setTag(null);
        P0(root);
        i0();
    }
}
