package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zentraedi.basic.function.ui.imageview.ProportionImageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class b0 extends a0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i J = null;

    @androidx.annotation.p0
    private static final SparseIntArray K;
    private long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.Hk, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.ji, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.QJ, 3);
    }

    public b0(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 4, J, K));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.I = 1L;
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
            this.I = 0L;
        }
    }

    private b0(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ProportionImageView) bindings[2], (FrameLayout) bindings[1], (FrameLayout) bindings[0], (TextView) bindings[3]);
        this.I = -1L;
        this.G.setTag(null);
        P0(root);
        i0();
    }
}
