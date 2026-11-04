package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.zentraedi.basic.function.ui.imageview.EqualRatioImageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class o0 extends n0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i W = null;

    @androidx.annotation.p0
    private static final SparseIntArray X;

    @androidx.annotation.n0
    private final RelativeLayout U;
    private long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.Hi, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.wO, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.ln, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Nn, 7);
        sparseIntArray.put(com.zentraedi.outreader.d.i.MN, 8);
        sparseIntArray.put(com.zentraedi.outreader.d.i.NN, 9);
        sparseIntArray.put(com.zentraedi.outreader.d.i.gP, 10);
        sparseIntArray.put(com.zentraedi.outreader.d.i.uk, 11);
        sparseIntArray.put(com.zentraedi.outreader.d.i.vk, 12);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Hn, 13);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Dj, 14);
        sparseIntArray.put(com.zentraedi.outreader.d.i.nN, 15);
        sparseIntArray.put(com.zentraedi.outreader.d.i.iE, 16);
    }

    public o0(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View[] root) {
        this(bindingComponent, root, androidx.databinding.c0.n0(bindingComponent, root, 17, W, X));
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

    private o0(androidx.databinding.l bindingComponent, View[] root, Object[] bindings) {
        super(bindingComponent, root[0], 0, (EqualRatioImageView) bindings[4], (ImageView) bindings[14], (ImageView) bindings[2], (TextView) bindings[11], (TextView) bindings[12], (LinearLayout) bindings[6], (LinearLayout) bindings[13], (LinearLayout) bindings[7], (RelativeLayout) bindings[0], (SlidingTabLayout) bindings[16], (TextView) bindings[15], (TextView) bindings[8], (TextView) bindings[9], (TextView) bindings[5], (LinearLayout) bindings[10], (ViewPager) bindings[3]);
        this.V = -1L;
        this.G.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) bindings[1];
        this.U = relativeLayout;
        relativeLayout.setTag(null);
        this.M.setTag(null);
        this.T.setTag(null);
        Q0(root);
        i0();
    }
}
