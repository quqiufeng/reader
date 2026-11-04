package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class e4 extends d4 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i K = null;

    @androidx.annotation.p0
    private static final SparseIntArray L;

    @androidx.annotation.p0
    private final View.OnClickListener I;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.fT, 2);
    }

    public e4(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 3, K, L));
    }

    @Override // com.zentraedi.comic.databinding.d4
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.h0 h0Var) {
        this.H = h0Var;
        synchronized (this) {
            this.J |= 1;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        com.zentraedi.comic.viewmodel.h0 h0Var = this.H;
        if (h0Var != null) {
            h0Var.J0();
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.J = 2L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.h0) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        return false;
    }

    protected void r() {
        long j;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        if ((j & 2) != 0) {
            this.F.setOnClickListener(this.I);
        }
    }

    private e4(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (LinearLayout) objArr[0], (TextView) objArr[1], (ImageView) objArr[2]);
        this.J = -1L;
        this.E.setTag(null);
        this.F.setTag(null);
        P0(view);
        this.I = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
