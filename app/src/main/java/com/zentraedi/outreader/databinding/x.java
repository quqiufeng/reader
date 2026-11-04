package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.flyco.tablayout.SlidingTabLayout;
import com.zentraedi.outreader.view.SliderViewPager;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class x extends w {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i O = null;

    @androidx.annotation.p0
    private static final SparseIntArray P;
    private long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ry, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Hi, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.wO, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Nn, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.MN, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.NN, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.ns, 7);
        sparseIntArray.put(com.zentraedi.outreader.d.i.aQ, 8);
    }

    public x(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 9, O, P));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.N = 1L;
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
            this.N = 0L;
        }
    }

    private x(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[2], (LinearLayout) bindings[0], (LinearLayout) bindings[4], (SlidingTabLayout) bindings[7], (RelativeLayout) bindings[1], (TextView) bindings[5], (TextView) bindings[6], (TextView) bindings[3], (SliderViewPager) bindings[8]);
        this.N = -1L;
        this.F.setTag(null);
        P0(root);
        i0();
    }
}
