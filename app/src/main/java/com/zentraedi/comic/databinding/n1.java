package com.zentraedi.comic.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class n1 extends m1 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i T = null;

    @androidx.annotation.p0
    private static final SparseIntArray U;

    @androidx.annotation.n0
    private final LinearLayout J;

    @androidx.annotation.n0
    private final TextView K;

    @androidx.annotation.n0
    private final View L;

    @androidx.annotation.n0
    private final View M;

    @androidx.annotation.n0
    private final TextView N;

    @androidx.annotation.n0
    private final ImageView O;

    @androidx.annotation.p0
    private final View.OnClickListener P;

    @androidx.annotation.p0
    private final View.OnClickListener Q;

    @androidx.annotation.p0
    private final View.OnClickListener R;
    private long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.Sk, 8);
        sparseIntArray.put(com.zentraedi.comic.q.i.b6, 9);
    }

    public n1(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 10, T, U));
    }

    private boolean D1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.S |= 2;
        }
        return true;
    }

    private boolean E1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.S |= 4;
        }
        return true;
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.S |= 8;
        }
        return true;
    }

    private boolean G1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.S |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.m1
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.a0 a0Var) {
        this.I = a0Var;
        synchronized (this) {
            this.S |= 16;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        com.zentraedi.comic.viewmodel.a0 a0Var;
        if (i == 1) {
            com.zentraedi.comic.viewmodel.a0 a0Var2 = this.I;
            if (a0Var2 != null) {
                a0Var2.m0();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (a0Var = this.I) != null) {
                a0Var.changeOrder();
                return;
            }
            return;
        }
        com.zentraedi.comic.viewmodel.a0 a0Var3 = this.I;
        if (a0Var3 != null) {
            a0Var3.l0();
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.S = 32L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.a0) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return G1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return D1((ObservableField) obj, i2);
        }
        if (i == 2) {
            return E1((ObservableField) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return F1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    protected void r() {
        long j;
        long j2;
        long j3;
        int i;
        int iB;
        int iB2;
        String str;
        String str2;
        Drawable drawable;
        int i2;
        String str3;
        Drawable drawableB;
        androidx.databinding.u uVarD0;
        TextView textView;
        int i3;
        synchronized (this) {
            j = this.S;
            this.S = 0L;
        }
        com.zentraedi.comic.viewmodel.a0 a0Var = this.I;
        long j4 = 52;
        int i4 = 0;
        String str4 = null;
        if ((63 & j) != 0) {
            long j5 = j & 49;
            if (j5 != 0) {
                if (a0Var != null) {
                    uVarD0 = a0Var.d0();
                    j2 = 0;
                } else {
                    j2 = 0;
                    uVarD0 = null;
                }
                p1(0, uVarD0);
                boolean zK0 = androidx.databinding.c0.K0(uVarD0 != null ? (Boolean) uVarD0.get() : null);
                if (j5 != 0) {
                    j |= zK0 ? 41600L : 20800L;
                }
                iB = androidx.databinding.c0.B(this.G, zK0 ? com.zentraedi.comic.q.f.f416qd : com.zentraedi.comic.q.f.o7);
                i2 = zK0 ? 0 : 8;
                if (zK0) {
                    textView = this.H;
                    j3 = 56;
                    i3 = com.zentraedi.comic.q.f.o7;
                } else {
                    j3 = 56;
                    textView = this.H;
                    i3 = com.zentraedi.comic.q.f.f416qd;
                }
                iB2 = androidx.databinding.c0.B(textView, i3);
                if (zK0) {
                    i4 = 8;
                }
            } else {
                j2 = 0;
                j3 = 56;
                iB = 0;
                iB2 = 0;
                i2 = 0;
            }
            if ((j & 50) == j2) {
                str3 = null;
            } else {
                ObservableField<String> observableFieldS = a0Var != null ? a0Var.S() : null;
                p1(1, observableFieldS);
                if (observableFieldS != null) {
                    str3 = (String) observableFieldS.get();
                } else {
                    str3 = null;
                }
            }
            long j6 = j & 52;
            if (j6 != j2) {
                ObservableField<Boolean> observableFieldV = a0Var != null ? a0Var.V() : null;
                p1(2, observableFieldV);
                boolean zK1 = androidx.databinding.c0.K0(observableFieldV != null ? (Boolean) observableFieldV.get() : null);
                if (j6 != j2) {
                    j |= zK1 ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX : ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                }
                drawableB = g.a.b(this.O.getContext(), zK1 ? com.zentraedi.comic.q.h.Rm : com.zentraedi.comic.q.h.Xm);
            } else {
                drawableB = null;
            }
            if ((j & j3) != j2) {
                ObservableField<String> observableFieldB0 = a0Var != null ? a0Var.b0() : null;
                p1(3, observableFieldB0);
                if (observableFieldB0 != null) {
                    str4 = (String) observableFieldB0.get();
                }
            }
            drawable = drawableB;
            i = i4;
            i4 = i2;
            str2 = str3;
            str = str4;
        } else {
            j2 = 0;
            j4 = 52;
            j3 = 56;
            i = 0;
            iB = 0;
            iB2 = 0;
            str = null;
            str2 = null;
            drawable = null;
        }
        if ((j & j3) != j2) {
            androidx.databinding.adapters.f0.A(this.K, str);
        }
        if ((j & 49) != j2) {
            this.L.setVisibility(i4);
            this.M.setVisibility(i);
            this.O.setVisibility(i4);
            this.G.setTextColor(iB);
            this.H.setTextColor(iB2);
        }
        if ((j & 50) != j2) {
            androidx.databinding.adapters.f0.A(this.N, str2);
        }
        if ((32 & j) != j2) {
            this.O.setOnClickListener(this.P);
            this.G.setOnClickListener(this.R);
            this.H.setOnClickListener(this.Q);
        }
        if ((j & j4) != j2) {
            androidx.databinding.adapters.p.a(this.O, drawable);
        }
    }

    private n1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 4, (RecyclerView) objArr[9], (ImageView) objArr[8], (TextView) objArr[2], (TextView) objArr[4]);
        this.S = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.J = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.K = textView;
        textView.setTag(null);
        View view2 = (View) objArr[3];
        this.L = view2;
        view2.setTag(null);
        View view3 = (View) objArr[5];
        this.M = view3;
        view3.setTag(null);
        TextView textView2 = (TextView) objArr[6];
        this.N = textView2;
        textView2.setTag(null);
        ImageView imageView = (ImageView) objArr[7];
        this.O = imageView;
        imageView.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        P0(view);
        this.P = new com.zentraedi.comic.generated.callback.b(this, 3);
        this.Q = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.R = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
