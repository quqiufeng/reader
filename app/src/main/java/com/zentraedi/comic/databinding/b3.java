package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageViewNew;
import com.zentraedi.comic.viewmodel.l6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class b3 extends a3 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i I = null;

    @androidx.annotation.p0
    private static final SparseIntArray J;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.zx, 1);
    }

    public b3(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 2, I, J));
    }

    private boolean D1(l6 l6Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.H |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.a3
    public void C1(@androidx.annotation.p0 l6 l6Var) {
        this.G = l6Var;
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.H = 2L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((l6) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return D1((l6) obj, i2);
    }

    protected void r() {
        synchronized (this) {
            this.H = 0L;
        }
    }

    private b3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, (SubsamplingScaleImageViewNew) objArr[1], (FrameLayout) objArr[0]);
        this.H = -1L;
        this.F.setTag(null);
        P0(view);
        i0();
    }
}
