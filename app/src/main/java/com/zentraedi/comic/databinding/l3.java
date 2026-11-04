package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class l3 extends k3 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i I = null;

    @androidx.annotation.p0
    private static final SparseIntArray J = null;

    @androidx.annotation.n0
    private final LinearLayout F;

    @androidx.annotation.n0
    private final TextView G;
    private long H;

    public l3(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 2, I, J));
    }

    private boolean D1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.H |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.k3
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.a5 a5Var) {
        this.E = a5Var;
        synchronized (this) {
            this.H |= 2;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.K1);
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
            this.H = 4L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.K1 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.a5) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return D1((ObservableField) obj, i2);
    }

    protected void r() {
        long j;
        String str;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        com.zentraedi.comic.viewmodel.a5 a5Var = this.E;
        long j2 = 7 & j;
        View.OnClickListener onClickListener = null;
        if (j2 != 0) {
            View.OnClickListener onClickListenerL = ((j & 6) == 0 || a5Var == null) ? null : a5Var.L();
            ObservableField<String> observableFieldM = a5Var != null ? a5Var.M() : null;
            p1(0, observableFieldM);
            str = observableFieldM != null ? (String) observableFieldM.get() : null;
            onClickListener = onClickListenerL;
        } else {
            str = null;
        }
        if ((j & 6) != 0) {
            this.F.setOnClickListener(onClickListener);
        }
        if (j2 != 0) {
            androidx.databinding.adapters.f0.A(this.G, str);
        }
    }

    private l3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1);
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
