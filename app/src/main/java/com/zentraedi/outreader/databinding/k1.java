package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.litao.slider.NiftySlider;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class k1 extends j1 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i d0 = null;

    @androidx.annotation.p0
    private static final SparseIntArray e0;
    private long c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.RM, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.WC, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.lj, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.mj, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.mO, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.oO, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Xn, 7);
        sparseIntArray.put(com.zentraedi.outreader.d.i.De, 8);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ti, 9);
        sparseIntArray.put(com.zentraedi.outreader.d.i.DP, 10);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ge, 11);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ej, 12);
        sparseIntArray.put(com.zentraedi.outreader.d.i.KP, 13);
        sparseIntArray.put(com.zentraedi.outreader.d.i.He, 14);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Tj, 15);
        sparseIntArray.put(com.zentraedi.outreader.d.i.LP, 16);
        sparseIntArray.put(com.zentraedi.outreader.d.i.pL, 17);
        sparseIntArray.put(com.zentraedi.outreader.d.i.se, 18);
        sparseIntArray.put(com.zentraedi.outreader.d.i.QC, 19);
        sparseIntArray.put(com.zentraedi.outreader.d.i.QB, 20);
        sparseIntArray.put(com.zentraedi.outreader.d.i.sG, 21);
        sparseIntArray.put(com.zentraedi.outreader.d.i.cf, 22);
        sparseIntArray.put(com.zentraedi.outreader.d.i.be, 23);
    }

    public k1(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 24, d0, e0));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.c0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.c0 = 1L;
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
            this.c0 = 0L;
        }
    }

    private k1(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[23], (ImageView) bindings[18], (FrameLayout) bindings[8], (FrameLayout) bindings[11], (FrameLayout) bindings[14], (ImageView) bindings[22], (ShapeableImageView) bindings[9], (ImageView) bindings[3], (ImageView) bindings[4], (ShapeableImageView) bindings[12], (ShapeableImageView) bindings[15], (LinearLayout) bindings[7], (LinearLayout) bindings[0], (ImageView) bindings[20], (ImageView) bindings[19], (NiftySlider) bindings[2], (ImageView) bindings[21], (TextView) bindings[17], (TextView) bindings[1], (TextView) bindings[5], (TextView) bindings[6], (View) bindings[10], (View) bindings[13], (View) bindings[16]);
        this.c0 = -1L;
        this.Q.setTag(null);
        P0(root);
        i0();
    }
}
