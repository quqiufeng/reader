package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class y0 extends x0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i P = null;

    @androidx.annotation.p0
    private static final SparseIntArray Q;
    private long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.qN, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Xy, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.DL, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.FL, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Vj, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Vy, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.QM, 7);
        sparseIntArray.put(com.zentraedi.outreader.d.i.pt, 8);
        sparseIntArray.put(com.zentraedi.outreader.d.i.jN, 9);
    }

    public y0(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 10, P, Q));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.O = 1L;
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
            this.O = 0L;
        }
    }

    private y0(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[5], (LinearLayout) bindings[0], (SeekBar) bindings[8], (RelativeLayout) bindings[6], (LinearLayout) bindings[2], (TextView) bindings[3], (TextView) bindings[4], (TextView) bindings[7], (TextView) bindings[9], (TextView) bindings[1]);
        this.O = -1L;
        this.F.setTag(null);
        P0(root);
        i0();
    }
}
