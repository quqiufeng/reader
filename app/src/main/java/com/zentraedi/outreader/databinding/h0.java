package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class h0 extends g0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i M = null;

    @androidx.annotation.p0
    private static final SparseIntArray N;

    @androidx.annotation.n0
    private final LinearLayout K;
    private long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.Mh, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ww, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Q5, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.S5, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.P5, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.R5, 6);
    }

    public h0(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
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

    private h0(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (RadioButton) bindings[5], (RadioButton) bindings[3], (RadioButton) bindings[6], (RadioButton) bindings[4], (ImageView) bindings[1], (RadioGroup) bindings[2]);
        this.L = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.K = linearLayout;
        linearLayout.setTag(null);
        P0(root);
        i0();
    }
}
