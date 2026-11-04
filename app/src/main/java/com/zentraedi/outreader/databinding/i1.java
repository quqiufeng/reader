package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zentraedi.reader.view.CircleProgressBar;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class i1 extends h1 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i W = null;

    @androidx.annotation.p0
    private static final SparseIntArray X;
    private long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.Oz, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.jj, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.EL, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.vj, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Pi, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.yi, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ji, 7);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ii, 8);
        sparseIntArray.put(com.zentraedi.outreader.d.i.mc, 9);
        sparseIntArray.put(com.zentraedi.outreader.d.i.jk, 10);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Pn, 11);
        sparseIntArray.put(com.zentraedi.outreader.d.i.fO, 12);
        sparseIntArray.put(com.zentraedi.outreader.d.i.QN, 13);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Rz, 14);
        sparseIntArray.put(com.zentraedi.outreader.d.i.mk, 15);
        sparseIntArray.put(com.zentraedi.outreader.d.i.EM, 16);
    }

    public i1(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 17, W, X));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.V != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.V = 1L;
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
            this.V = 0L;
        }
    }

    private i1(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (CircleProgressBar) bindings[9], (ImageView) bindings[6], (ImageView) bindings[8], (ImageView) bindings[7], (ImageView) bindings[5], (ImageView) bindings[2], (ImageView) bindings[4], (ImageView) bindings[10], (ImageView) bindings[15], (RelativeLayout) bindings[11], (LinearLayout) bindings[0], (RelativeLayout) bindings[1], (RelativeLayout) bindings[14], (TextView) bindings[3], (TextView) bindings[16], (TextView) bindings[13], (TextView) bindings[12]);
        this.V = -1L;
        this.O.setTag(null);
        P0(root);
        i0();
    }
}
