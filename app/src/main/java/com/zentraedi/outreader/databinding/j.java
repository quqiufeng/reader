package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zentraedi.basic.function.ui.imageview.EqualRatioImageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class j extends i {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i N = null;

    @androidx.annotation.p0
    private static final SparseIntArray O;
    private long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.Z9, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Lg, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.gt, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.qj, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.fj, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.B3, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.BL, 7);
    }

    public j(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 8, N, O));
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
            this.M = 1L;
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
            this.M = 0L;
        }
    }

    private j(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (Barrier) bindings[6], (EqualRatioImageView) bindings[1], (ImageView) bindings[2], (TextView) bindings[5], (ImageView) bindings[4], (ConstraintLayout) bindings[0], (ImageView) bindings[3], (TextView) bindings[7]);
        this.M = -1L;
        this.J.setTag(null);
        P0(root);
        i0();
    }
}
