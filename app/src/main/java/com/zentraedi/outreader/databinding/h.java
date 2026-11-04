package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.zentraedi.business.utils.g8;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class h extends g {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i Y = null;

    @androidx.annotation.p0
    private static final SparseIntArray Z;

    @androidx.annotation.n0
    private final CoordinatorLayout W;
    private long X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.c3, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.s6, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.JK, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.zl, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Gh, 7);
        sparseIntArray.put(com.zentraedi.outreader.d.i.OI, 8);
        sparseIntArray.put(com.zentraedi.outreader.d.i.mi, 9);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ch, 10);
        sparseIntArray.put(com.zentraedi.outreader.d.i.in, 11);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Nh, 12);
        sparseIntArray.put(com.zentraedi.outreader.d.i.qK, 13);
        sparseIntArray.put(com.zentraedi.outreader.d.i.KA, 14);
        sparseIntArray.put(com.zentraedi.outreader.d.i.un, 15);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ui, 16);
        sparseIntArray.put(com.zentraedi.outreader.d.i.VL, 17);
    }

    public h(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 18, Y, Z));
    }

    @Override // com.zentraedi.outreader.databinding.g
    public void C1(@androidx.annotation.p0 com.zentraedi.basic.function.viewmodel.b PageVM) {
        this.V = PageVM;
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.X != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.X = 2L;
        }
        C0();
    }

    public boolean l1(int variableId, @androidx.annotation.p0 Object variable) {
        if (com.zentraedi.outreader.a.G2 != variableId) {
            return false;
        }
        C1((com.zentraedi.basic.function.viewmodel.b) variable);
        return true;
    }

    protected boolean o0(int localFieldId, Object object, int fieldId) {
        return false;
    }

    protected void r() {
        long j;
        synchronized (this) {
            j = this.X;
            this.X = 0L;
        }
        if ((j & 2) != 0) {
            androidx.databinding.adapters.j0.o(this.F, g8.a(Float.valueOf(44.0f)));
            androidx.databinding.adapters.j0.o(this.Q, g8.h());
        }
    }

    private h(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (AppBarLayout) bindings[3], (LinearLayout) bindings[1], (CollapsingToolbarLayout) bindings[4], (ImageView) bindings[10], (ImageView) bindings[7], (ImageView) bindings[12], (ImageView) bindings[16], (ImageView) bindings[9], (RelativeLayout) bindings[6], (LinearLayout) bindings[15], (LinearLayout) bindings[11], (RecyclerView) bindings[14], (Toolbar) bindings[2], (TextView) bindings[8], (TextView) bindings[17], (TextView) bindings[13], (TextView) bindings[5]);
        this.X = -1L;
        this.F.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) bindings[0];
        this.W = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.Q.setTag(null);
        P0(root);
        i0();
    }
}
