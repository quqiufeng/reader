package com.zentraedi.comic.databinding;

import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class j2 extends i2 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i Q = null;

    @androidx.annotation.p0
    private static final SparseIntArray R = null;

    @androidx.annotation.n0
    private final LinearLayout G;

    @androidx.annotation.n0
    private final LinearLayout H;

    @androidx.annotation.n0
    private final View I;

    @androidx.annotation.n0
    private final View J;

    @androidx.annotation.n0
    private final ImageView K;

    @androidx.annotation.n0
    private final TextView L;

    @androidx.annotation.n0
    private final ImageView M;

    @androidx.annotation.p0
    private final View.OnClickListener N;

    @androidx.annotation.p0
    private final View.OnClickListener O;
    private long P;

    public j2(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 8, Q, R));
    }

    private boolean D1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 8;
        }
        return true;
    }

    private boolean E1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 2;
        }
        return true;
    }

    private boolean F1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 1;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 4;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.i2
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.b0 b0Var) {
        this.F = b0Var;
        synchronized (this) {
            this.P |= 16;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        com.zentraedi.comic.viewmodel.b0 b0Var;
        if (i != 1) {
            if (i == 2 && (b0Var = this.F) != null) {
                b0Var.c(getRoot().getContext());
                return;
            }
            return;
        }
        com.zentraedi.comic.viewmodel.b0 b0Var2 = this.F;
        if (b0Var2 != null) {
            b0Var2.b();
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.P = 32L;
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
            return F1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return E1((ObservableField) obj, i2);
        }
        if (i == 2) {
            return G1((ObservableField) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return D1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    protected void r() {
        long j;
        long j2;
        long j3;
        String str;
        int i;
        int i2;
        boolean zK0;
        int i3;
        ObservableField<String> observableFieldG;
        synchronized (this) {
            j = this.P;
            this.P = 0L;
        }
        com.zentraedi.comic.viewmodel.b0 b0Var = this.F;
        String str2 = null;
        if ((63 & j) != 0) {
            if ((j & 49) != 0) {
                ObservableField<Boolean> observableFieldI = b0Var != null ? b0Var.i() : null;
                p1(0, observableFieldI);
                zK0 = androidx.databinding.c0.K0(observableFieldI != null ? (Boolean) observableFieldI.get() : null);
            } else {
                zK0 = false;
            }
            long j4 = j & 50;
            int i4 = 8;
            if (j4 != 0) {
                androidx.databinding.u uVarH = b0Var != null ? b0Var.h() : null;
                j3 = 56;
                p1(1, uVarH);
                boolean zK1 = androidx.databinding.c0.K0(uVarH != null ? (Boolean) uVarH.get() : null);
                if (j4 != 0) {
                    j |= zK1 ? 2176L : 1088L;
                }
                i3 = zK1 ? 8 : 0;
                i2 = zK1 ? 0 : 8;
            } else {
                j3 = 56;
                i2 = 0;
                i3 = 0;
            }
            long j5 = j & 52;
            if (j5 != 0) {
                ObservableField<String> observableFieldJ = b0Var != null ? b0Var.j() : null;
                j2 = 52;
                p1(2, observableFieldJ);
                str = observableFieldJ != null ? (String) observableFieldJ.get() : null;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                if (j5 != 0) {
                    j |= zIsEmpty ? 512L : 256L;
                }
                if (!zIsEmpty) {
                }
                if ((j & j3) != 0) {
                    if (b0Var != null) {
                        observableFieldG = b0Var.g();
                    } else {
                        observableFieldG = null;
                    }
                    p1(3, observableFieldG);
                    if (observableFieldG != null) {
                        str2 = (String) observableFieldG.get();
                    }
                }
                i = i4;
            } else {
                j2 = 52;
                str = null;
            }
            i4 = 0;
            if ((j & j3) != 0) {
                if (b0Var != null) {
                    observableFieldG = b0Var.g();
                } else {
                    observableFieldG = null;
                }
                p1(3, observableFieldG);
                if (observableFieldG != null) {
                    str2 = (String) observableFieldG.get();
                }
            }
            i = i4;
        } else {
            j2 = 52;
            j3 = 56;
            str = null;
            i = 0;
            i2 = 0;
            zK0 = false;
            i3 = 0;
        }
        if ((32 & j) != 0) {
            this.H.setOnClickListener(this.O);
            this.M.setOnClickListener(this.N);
        }
        if ((j & 50) != 0) {
            this.I.setVisibility(i2);
            this.J.setVisibility(i3);
            this.K.setVisibility(i2);
            this.M.setVisibility(i3);
        }
        if ((j & 49) != 0) {
            this.K.setSelected(zK0);
        }
        if ((j & j3) != 0) {
            androidx.databinding.adapters.f0.A(this.L, str2);
        }
        if ((j & j2) != 0) {
            androidx.databinding.adapters.f0.A(this.E, str);
            this.E.setVisibility(i);
        }
    }

    private j2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 4, (TextView) objArr[5]);
        this.P = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.H = linearLayout2;
        linearLayout2.setTag(null);
        View view2 = (View) objArr[2];
        this.I = view2;
        view2.setTag(null);
        View view3 = (View) objArr[3];
        this.J = view3;
        view3.setTag(null);
        ImageView imageView = (ImageView) objArr[4];
        this.K = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[6];
        this.L = textView;
        textView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[7];
        this.M = imageView2;
        imageView2.setTag(null);
        this.E.setTag(null);
        P0(view);
        this.N = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.O = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
