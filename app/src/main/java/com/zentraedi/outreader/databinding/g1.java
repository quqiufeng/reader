package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class g1 extends f1 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i Q = null;

    @androidx.annotation.p0
    private static final SparseIntArray R;
    private long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.mz, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.nz, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.nj, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Xd, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Gm, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Jz, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Hj, 7);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Gj, 8);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ij, 9);
    }

    public g1(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 10, Q, R));
    }

    @Override // com.zentraedi.outreader.databinding.f1
    public void C1(@androidx.annotation.p0 com.zentraedi.outreader.viewmodel.c SettingViewModel) {
        this.O = SettingViewModel;
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.P = 2L;
        }
        C0();
    }

    public boolean l1(int variableId, @androidx.annotation.p0 Object variable) {
        if (com.zentraedi.outreader.a.F3 != variableId) {
            return false;
        }
        C1((com.zentraedi.outreader.viewmodel.c) variable);
        return true;
    }

    protected boolean o0(int localFieldId, Object object, int fieldId) {
        return false;
    }

    protected void r() {
        synchronized (this) {
            this.P = 0L;
        }
    }

    private g1(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (FragmentContainerView) bindings[4], (ImageView) bindings[3], (ImageView) bindings[8], (ImageView) bindings[7], (ImageView) bindings[9], (View) bindings[5], (LinearLayout) bindings[0], (RelativeLayout) bindings[1], (RelativeLayout) bindings[2], (LinearLayout) bindings[6]);
        this.P = -1L;
        this.K.setTag(null);
        P0(root);
        i0();
    }
}
