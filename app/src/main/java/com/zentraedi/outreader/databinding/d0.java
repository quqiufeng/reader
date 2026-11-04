package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.litao.slider.NiftySlider;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class d0 extends c0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i P = null;

    @androidx.annotation.p0
    private static final SparseIntArray Q;

    @androidx.annotation.n0
    private final LinearLayout N;
    private long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.Gh, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.RN, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Mh, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Vk, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.XC, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.el, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.ZC, 7);
        sparseIntArray.put(com.zentraedi.outreader.d.i.dl, 8);
        sparseIntArray.put(com.zentraedi.outreader.d.i.YC, 9);
    }

    public d0(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
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

    private d0(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[1], (ImageView) bindings[3], (FrameLayout) bindings[4], (FrameLayout) bindings[8], (FrameLayout) bindings[6], (NiftySlider) bindings[5], (NiftySlider) bindings[9], (NiftySlider) bindings[7], (TextView) bindings[2]);
        this.O = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.N = linearLayout;
        linearLayout.setTag(null);
        P0(root);
        i0();
    }
}
