package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.business.widget.MediumTextView;
import com.zentraedi.outreader.widget.fastscrollview.FastScrollRecyclerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class p extends o {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i L = null;

    @androidx.annotation.p0
    private static final SparseIntArray M;
    private long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.JK, 1);
        sparseIntArray.put(com.zentraedi.outreader.d.i.ti, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.si, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.JD, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.AA, 5);
    }

    public p(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 6, L, M));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    private p(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[3], (ImageView) bindings[2], (LinearLayout) bindings[0], (RecyclerView) bindings[5], (FastScrollRecyclerView) bindings[4], (MediumTextView) bindings[1]);
        this.K = -1L;
        this.G.setTag(null);
        P0(root);
        i0();
    }
}
