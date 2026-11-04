package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.business.widget.MediumTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class n extends m {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i J = null;

    @androidx.annotation.p0
    private static final SparseIntArray K;
    private long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.wO, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.HL, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.wA, 3);
    }

    public n(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
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

    private n(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (LinearLayout) bindings[0], (RecyclerView) bindings[3], (TextView) bindings[2], (MediumTextView) bindings[1]);
        this.I = -1L;
        this.E.setTag(null);
        P0(root);
        i0();
    }
}
