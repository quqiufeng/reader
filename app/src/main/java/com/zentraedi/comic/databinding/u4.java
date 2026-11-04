package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class u4 extends t4 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i J = null;

    @androidx.annotation.p0
    private static final SparseIntArray K = null;

    @androidx.annotation.n0
    private final LinearLayout F;

    @androidx.annotation.n0
    private final TextView G;

    @androidx.annotation.n0
    private final LinearLayout H;
    private long I;

    public u4(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 3, J, K));
    }

    private boolean D1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    private boolean E1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.I |= 2;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.t4
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.c3 c3Var) {
        this.E = c3Var;
        synchronized (this) {
            this.I |= 4;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.I = 8L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.c3) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return D1((ObservableField) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return E1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    protected void r() {
        long j;
        long j2;
        View.OnClickListener onClickListener;
        String str;
        androidx.databinding.u uVarR;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        com.zentraedi.comic.viewmodel.c3 c3Var = this.E;
        int i = 0;
        String str2 = null;
        onClickListenerL = null;
        View.OnClickListener onClickListenerL = null;
        if ((15 & j) != 0) {
            if ((j & 13) == 0) {
                str = null;
            } else {
                ObservableField<String> observableFieldM = c3Var != null ? c3Var.M() : null;
                p1(0, observableFieldM);
                if (observableFieldM != null) {
                    str = (String) observableFieldM.get();
                } else {
                    str = null;
                }
            }
            long j3 = j & 14;
            if (j3 != 0) {
                if (c3Var != null) {
                    uVarR = c3Var.R();
                    j2 = 0;
                } else {
                    j2 = 0;
                    uVarR = null;
                }
                p1(1, uVarR);
                boolean zK0 = androidx.databinding.c0.K0(uVarR != null ? (Boolean) uVarR.get() : null);
                if (j3 != 0) {
                    j |= zK0 ? 32L : 16L;
                }
                if (!zK0) {
                    i = 8;
                }
            } else {
                j2 = 0;
            }
            if ((j & 12) != j2 && c3Var != null) {
                onClickListenerL = c3Var.L();
            }
            onClickListener = onClickListenerL;
            str2 = str;
        } else {
            j2 = 0;
            onClickListener = null;
        }
        if ((j & 13) != j2) {
            androidx.databinding.adapters.f0.A(this.G, str2);
        }
        if ((j & 12) != j2) {
            this.H.setOnClickListener(onClickListener);
        }
        if ((j & 14) != j2) {
            this.H.setVisibility(i);
        }
    }

    private u4(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 2);
        this.I = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.F = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.G = textView;
        textView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[2];
        this.H = linearLayout2;
        linearLayout2.setTag(null);
        P0(view);
        i0();
    }
}
