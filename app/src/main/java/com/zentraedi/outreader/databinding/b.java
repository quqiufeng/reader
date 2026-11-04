package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import com.airbnb.lottie.LottieAnimationView;
import com.zentraedi.business.utils.g8;
import com.zentraedi.outreader.widget.CustomDrawerLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class b extends a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i O = null;

    @androidx.annotation.p0
    private static final SparseIntArray P;
    private long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.Xd, 2);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Yd, 3);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Jn, 4);
        sparseIntArray.put(com.zentraedi.outreader.d.i.xk, 5);
        sparseIntArray.put(com.zentraedi.outreader.d.i.EN, 6);
        sparseIntArray.put(com.zentraedi.outreader.d.i.kM, 7);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Zd, 8);
    }

    public b(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
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
        long j;
        synchronized (this) {
            j = this.N;
            this.N = 0L;
        }
        if ((j & 1) != 0) {
            com.zentraedi.business.utils.u.b0(this.H, g8.h());
        }
    }

    private b(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (FragmentContainerView) bindings[2], (FragmentContainerView) bindings[3], (FragmentContainerView) bindings[8], (ImageView) bindings[1], (LottieAnimationView) bindings[5], (LinearLayout) bindings[4], (CustomDrawerLayout) bindings[0], (TextView) bindings[7], (TextView) bindings[6]);
        this.N = -1L;
        this.H.setTag(null);
        this.K.setTag(null);
        P0(root);
        i0();
    }
}
