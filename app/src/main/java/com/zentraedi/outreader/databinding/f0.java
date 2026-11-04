package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class f0 extends e0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i O = null;

    @androidx.annotation.p0
    private static final SparseIntArray P;

    @androidx.annotation.n0
    private final LinearLayout M;
    private long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.Gh, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Mh, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ww, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.O5, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.V5, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.W5, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.U5, 7);
        sparseIntArray.put(com.zentraedi.outreader.d.i.T5, 8);
    }

    public f0(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 9, O, P));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.N = 1L;
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
            this.N = 0L;
        }
    }

    private f0(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (RadioButton) bindings[4], (RadioButton) bindings[8], (RadioButton) bindings[7], (RadioButton) bindings[5], (RadioButton) bindings[6], (ImageView) bindings[1], (ImageView) bindings[2], (RadioGroup) bindings[3]);
        this.N = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.M = linearLayout;
        linearLayout.setTag(null);
        P0(root);
        i0();
    }
}
