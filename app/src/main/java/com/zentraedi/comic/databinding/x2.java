package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import com.zentraedi.comic.viewmodel.j6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class x2 extends w2 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i J = null;

    @androidx.annotation.p0
    private static final SparseIntArray K = null;

    @androidx.annotation.n0
    private final LinearLayout G;

    @androidx.annotation.n0
    private final TextView H;
    private long I;

    public x2(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 3, J, K));
    }

    private boolean D1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.I |= 2;
        }
        return true;
    }

    private boolean E1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.w2
    public void C1(@androidx.annotation.p0 j6 j6Var) {
        this.F = j6Var;
        synchronized (this) {
            this.I |= 4;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.G1);
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
        if (com.zentraedi.comic.a.G1 != i) {
            return false;
        }
        C1((j6) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return E1((ObservableField) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return D1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    protected void r() {
        long j;
        long j2;
        String str;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        j6 j6Var = this.F;
        int i = 0;
        View.OnClickListener onClickListener = null;
        if ((15 & j) != 0) {
            if ((j & 13) == 0) {
                str = null;
            } else {
                ObservableField<String> titleStr = j6Var != null ? j6Var.getTitleStr() : null;
                p1(0, titleStr);
                if (titleStr != null) {
                    str = (String) titleStr.get();
                } else {
                    str = null;
                }
            }
            View.OnClickListener onClickListenerL = ((j & 12) == 0 || j6Var == null) ? null : j6Var.L();
            long j3 = j & 14;
            if (j3 != 0) {
                ObservableField<Boolean> observableFieldO = j6Var != null ? j6Var.O() : null;
                j2 = 0;
                p1(1, observableFieldO);
                boolean zK0 = androidx.databinding.c0.K0(observableFieldO != null ? (Boolean) observableFieldO.get() : null);
                if (j3 != 0) {
                    j |= zK0 ? 32L : 16L;
                }
                if (!zK0) {
                    i = 4;
                }
            } else {
                j2 = 0;
            }
            onClickListener = onClickListenerL;
        } else {
            j2 = 0;
            str = null;
        }
        if ((j & 12) != j2) {
            this.E.setOnClickListener(onClickListener);
        }
        if ((j & 14) != j2) {
            this.E.setVisibility(i);
        }
        if ((j & 13) != j2) {
            androidx.databinding.adapters.f0.A(this.H, str);
        }
    }

    private x2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 2, (TextView) objArr[2]);
        this.I = -1L;
        this.E.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.H = textView;
        textView.setTag(null);
        P0(view);
        i0();
    }
}
