package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class a1 extends z0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i i0 = null;

    @androidx.annotation.p0
    private static final SparseIntArray j0;
    private long h0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.ej, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Fn, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.aN, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.jL, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.iz, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.xM, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.cj, 7);
        sparseIntArray.put(com.zentraedi.outreader.d.i.zM, 8);
        sparseIntArray.put(com.zentraedi.outreader.d.i.dj, 9);
        sparseIntArray.put(com.zentraedi.outreader.d.i.yM, 10);
        sparseIntArray.put(com.zentraedi.outreader.d.i.lz, 11);
        sparseIntArray.put(com.zentraedi.outreader.d.i.TM, 12);
        sparseIntArray.put(com.zentraedi.outreader.d.i.ak, 13);
        sparseIntArray.put(com.zentraedi.outreader.d.i.ck, 14);
        sparseIntArray.put(com.zentraedi.outreader.d.i.dk, 15);
        sparseIntArray.put(com.zentraedi.outreader.d.i.bk, 16);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Pz, 17);
        sparseIntArray.put(com.zentraedi.outreader.d.i.yO, 18);
        sparseIntArray.put(com.zentraedi.outreader.d.i.pN, 19);
        sparseIntArray.put(com.zentraedi.outreader.d.i.uN, 20);
        sparseIntArray.put(com.zentraedi.outreader.d.i.sN, 21);
        sparseIntArray.put(com.zentraedi.outreader.d.i.tN, 22);
        sparseIntArray.put(com.zentraedi.outreader.d.i.rN, 23);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Yy, 24);
        sparseIntArray.put(com.zentraedi.outreader.d.i.IL, 25);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ni, 26);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ny, 27);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Di, 28);
    }

    public a1(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
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

    private a1(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[28], (ImageView) bindings[26], (ImageView) bindings[7], (ImageView) bindings[9], (ImageView) bindings[1], (ImageView) bindings[13], (ImageView) bindings[16], (ImageView) bindings[14], (ImageView) bindings[15], (RelativeLayout) bindings[2], (RelativeLayout) bindings[27], (RelativeLayout) bindings[24], (LinearLayout) bindings[5], (LinearLayout) bindings[11], (LinearLayout) bindings[0], (LinearLayout) bindings[17], (TextView) bindings[4], (TextView) bindings[25], (TextView) bindings[6], (TextView) bindings[10], (TextView) bindings[8], (TextView) bindings[12], (TextView) bindings[3], (TextView) bindings[19], (TextView) bindings[23], (TextView) bindings[21], (TextView) bindings[22], (TextView) bindings[20], (TextView) bindings[18]);
        this.h0 = -1L;
        this.S.setTag(null);
        P0(root);
        i0();
    }
}
