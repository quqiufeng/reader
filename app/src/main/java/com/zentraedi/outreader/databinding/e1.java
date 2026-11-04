package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.zentraedi.outreader.widget.TypeFaceTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class e1 extends d1 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i f0 = null;

    @androidx.annotation.p0
    private static final SparseIntArray g0;
    private long e0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        g0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.ej, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.kz, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.RM, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.lj, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.RA, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.mj, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.mO, 7);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Xn, 8);
        sparseIntArray.put(com.zentraedi.outreader.d.i.oO, 9);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Yn, 10);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ti, 11);
        sparseIntArray.put(com.zentraedi.outreader.d.i.pO, 12);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Zn, 13);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ej, 14);
        sparseIntArray.put(com.zentraedi.outreader.d.i.qO, 15);
        sparseIntArray.put(com.zentraedi.outreader.d.i.ao, 16);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Tj, 17);
        sparseIntArray.put(com.zentraedi.outreader.d.i.rO, 18);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Qy, 19);
        sparseIntArray.put(com.zentraedi.outreader.d.i.pL, 20);
        sparseIntArray.put(com.zentraedi.outreader.d.i.se, 21);
        sparseIntArray.put(com.zentraedi.outreader.d.i.QB, 22);
        sparseIntArray.put(com.zentraedi.outreader.d.i.sG, 23);
        sparseIntArray.put(com.zentraedi.outreader.d.i.cf, 24);
        sparseIntArray.put(com.zentraedi.outreader.d.i.be, 25);
    }

    public e1(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 26, f0, g0));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.e0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.e0 = 1L;
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
            this.e0 = 0L;
        }
    }

    private e1(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[25], (ImageView) bindings[21], (ImageView) bindings[24], (ImageView) bindings[11], (ImageView) bindings[1], (ImageView) bindings[4], (ImageView) bindings[6], (ImageView) bindings[14], (ImageView) bindings[17], (RelativeLayout) bindings[8], (RelativeLayout) bindings[10], (RelativeLayout) bindings[13], (RelativeLayout) bindings[16], (LinearLayout) bindings[19], (LinearLayout) bindings[2], (LinearLayout) bindings[0], (SeekBar) bindings[5], (ImageView) bindings[22], (ImageView) bindings[23], (TextView) bindings[20], (TextView) bindings[3], (TextView) bindings[7], (TextView) bindings[9], (TypeFaceTextView) bindings[12], (TypeFaceTextView) bindings[15], (TypeFaceTextView) bindings[18]);
        this.e0 = -1L;
        this.T.setTag(null);
        P0(root);
        i0();
    }
}
