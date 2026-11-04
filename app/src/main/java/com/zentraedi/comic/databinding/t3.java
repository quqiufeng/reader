package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class t3 extends s3 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i M = null;

    @androidx.annotation.p0
    private static final SparseIntArray N = null;

    @androidx.annotation.n0
    private final LinearLayout F;

    @androidx.annotation.n0
    private final RelativeLayout G;

    @androidx.annotation.n0
    private final ImageView H;

    @androidx.annotation.n0
    private final TextView I;

    @androidx.annotation.n0
    private final TextView J;

    @androidx.annotation.p0
    private final View.OnClickListener K;
    private long L;

    public t3(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 5, M, N));
    }

    private boolean D1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 4;
        }
        return true;
    }

    private boolean E1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 2;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.s3
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.b0 b0Var) {
        this.E = b0Var;
        synchronized (this) {
            this.L |= 8;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        com.zentraedi.comic.viewmodel.b0 b0Var = this.E;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.L = 16L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.b0) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return E1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return F1((ObservableField) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return D1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    protected void r() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        com.zentraedi.comic.viewmodel.b0 b0Var = this.E;
        boolean zK0 = false;
        String str3 = null;
        if ((31 & j) != 0) {
            if ((j & 25) != 0) {
                ObservableField<Boolean> observableFieldI = b0Var != null ? b0Var.i() : null;
                p1(0, observableFieldI);
                zK0 = androidx.databinding.c0.K0(observableFieldI != null ? (Boolean) observableFieldI.get() : null);
            }
            if ((j & 26) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableFieldJ = b0Var != null ? b0Var.j() : null;
                p1(1, observableFieldJ);
                if (observableFieldJ != null) {
                    str2 = (String) observableFieldJ.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 28) != 0) {
                ObservableField<String> observableFieldG = b0Var != null ? b0Var.g() : null;
                p1(2, observableFieldG);
                if (observableFieldG != null) {
                    str3 = (String) observableFieldG.get();
                }
            }
            str = str3;
            str3 = str2;
        } else {
            str = null;
        }
        if ((16 & j) != 0) {
            this.G.setOnClickListener(this.K);
        }
        if ((25 & j) != 0) {
            this.H.setSelected(zK0);
        }
        if ((26 & j) != 0) {
            androidx.databinding.adapters.f0.A(this.I, str3);
        }
        if ((j & 28) != 0) {
            androidx.databinding.adapters.f0.A(this.J, str);
        }
    }

    private t3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 3);
        this.L = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.F = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.G = relativeLayout;
        relativeLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.H = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.I = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.J = textView2;
        textView2.setTag(null);
        P0(view);
        this.K = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
