package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class w0 extends v0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i i0 = null;

    @androidx.annotation.p0
    private static final SparseIntArray j0;
    private long h0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.mz, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.nz, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.nj, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Xd, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Jz, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Kz, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Xj, 7);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Zy, 8);
        sparseIntArray.put(com.zentraedi.outreader.d.i.rz, 9);
        sparseIntArray.put(com.zentraedi.outreader.d.i.tj, 10);
        sparseIntArray.put(com.zentraedi.outreader.d.i.WM, 11);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ga, 12);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Si, 13);
        sparseIntArray.put(com.zentraedi.outreader.d.i.SM, 14);
        sparseIntArray.put(com.zentraedi.outreader.d.i.sj, 15);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Cz, 16);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Qj, 17);
        sparseIntArray.put(com.zentraedi.outreader.d.i.bO, 18);
        sparseIntArray.put(com.zentraedi.outreader.d.i.In, 19);
        sparseIntArray.put(com.zentraedi.outreader.d.i.wz, 20);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Hj, 21);
        sparseIntArray.put(com.zentraedi.outreader.d.i.xN, 22);
        sparseIntArray.put(com.zentraedi.outreader.d.i.zt, 23);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Gj, 24);
        sparseIntArray.put(com.zentraedi.outreader.d.i.wN, 25);
        sparseIntArray.put(com.zentraedi.outreader.d.i.xz, 26);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ij, 27);
        sparseIntArray.put(com.zentraedi.outreader.d.i.yN, 28);
    }

    public w0(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 29, i0, j0));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.h0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.h0 = 1L;
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
            this.h0 = 0L;
        }
    }

    private w0(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (RelativeLayout) bindings[12], (FragmentContainerView) bindings[4], (ImageView) bindings[13], (ImageView) bindings[3], (ImageView) bindings[15], (ImageView) bindings[10], (ImageView) bindings[24], (ImageView) bindings[21], (ImageView) bindings[27], (ImageView) bindings[17], (ImageView) bindings[7], (LinearLayout) bindings[19], (LinearLayout) bindings[0], (RelativeLayout) bindings[23], (LinearLayout) bindings[8], (RelativeLayout) bindings[1], (RelativeLayout) bindings[2], (RelativeLayout) bindings[9], (RelativeLayout) bindings[20], (RelativeLayout) bindings[26], (RelativeLayout) bindings[16], (RelativeLayout) bindings[5], (RelativeLayout) bindings[6], (TextView) bindings[14], (TextView) bindings[11], (TextView) bindings[25], (TextView) bindings[22], (TextView) bindings[28], (TextView) bindings[18]);
        this.h0 = -1L;
        this.Q.setTag(null);
        P0(root);
        i0();
    }
}
