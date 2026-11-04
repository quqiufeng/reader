package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class f3 extends e3 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i I = null;

    @androidx.annotation.p0
    private static final SparseIntArray J = null;

    @androidx.annotation.n0
    private final LinearLayout F;

    @androidx.annotation.n0
    private final TextView G;
    private long H;

    public f3(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 2, I, J));
    }

    @Override // com.zentraedi.comic.databinding.e3
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.r3 r3Var) {
        this.E = r3Var;
        synchronized (this) {
            this.H |= 1;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
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
        C1((com.zentraedi.comic.viewmodel.r3) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        return false;
    }

    protected void r() {
        long j;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        com.zentraedi.comic.viewmodel.r3 r3Var = this.E;
        long j2 = j & 3;
        View.OnClickListener onClickListenerL = (j2 == 0 || r3Var == null) ? null : r3Var.L();
        if (j2 != 0) {
            this.G.setOnClickListener(onClickListenerL);
        }
    }

    private f3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0);
        this.H = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.F = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.G = textView;
        textView.setTag(null);
        P0(view);
        i0();
    }
}
