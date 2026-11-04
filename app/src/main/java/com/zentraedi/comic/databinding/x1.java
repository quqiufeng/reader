package com.zentraedi.comic.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.Switch;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ObservableField;
import com.zentraedi.business.utils.g8;
import com.zentraedi.business.widget.MediumTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class x1 extends w1 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i i0 = null;

    @androidx.annotation.p0
    private static final SparseIntArray j0;

    @androidx.annotation.n0
    private final FrameLayout K;

    @androidx.annotation.n0
    private final Space L;

    @androidx.annotation.n0
    private final RelativeLayout M;

    @androidx.annotation.n0
    private final RelativeLayout N;

    @androidx.annotation.n0
    private final TextView O;

    @androidx.annotation.n0
    private final RelativeLayout P;

    @androidx.annotation.n0
    private final RelativeLayout Q;

    @androidx.annotation.n0
    private final RelativeLayout R;

    @androidx.annotation.n0
    private final RelativeLayout S;

    @androidx.annotation.n0
    private final LinearLayout T;

    @androidx.annotation.n0
    private final TextView U;

    @androidx.annotation.n0
    private final LinearLayout V;

    @androidx.annotation.n0
    private final TextView W;

    @androidx.annotation.n0
    private final RelativeLayout X;

    @androidx.annotation.p0
    private final View.OnClickListener Y;

    @androidx.annotation.p0
    private final View.OnClickListener Z;

    @androidx.annotation.p0
    private final View.OnClickListener a0;

    @androidx.annotation.p0
    private final View.OnClickListener b0;

    @androidx.annotation.p0
    private final View.OnClickListener c0;

    @androidx.annotation.p0
    private final View.OnClickListener d0;

    @androidx.annotation.p0
    private final View.OnClickListener e0;

    @androidx.annotation.p0
    private final View.OnClickListener f0;

    @androidx.annotation.p0
    private final View.OnClickListener g0;
    private long h0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.uI, 15);
        sparseIntArray.put(com.zentraedi.comic.q.i.WS, 16);
        sparseIntArray.put(com.zentraedi.comic.q.i.Rk, 17);
        sparseIntArray.put(com.zentraedi.comic.q.i.YS, 18);
    }

    public x1(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 19, i0, j0));
    }

    private boolean D1(ObservableField<Integer> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.h0 |= 4;
        }
        return true;
    }

    private boolean E1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.h0 |= 1;
        }
        return true;
    }

    private boolean F1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.h0 |= 8;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.h0 |= 2;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.w1
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.t4 t4Var) {
        this.J = t4Var;
        synchronized (this) {
            this.h0 |= 16;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        switch (i) {
            case 1:
                com.zentraedi.comic.viewmodel.t4 t4Var = this.J;
                if (t4Var != null) {
                    t4Var.P(getRoot().getContext());
                }
                break;
            case 2:
                com.zentraedi.comic.viewmodel.t4 t4Var2 = this.J;
                if (t4Var2 != null) {
                    t4Var2.P0(getRoot().getContext());
                }
                break;
            case 3:
                com.zentraedi.comic.viewmodel.t4 t4Var3 = this.J;
                if (t4Var3 != null) {
                    t4Var3.s0(getRoot().getContext());
                }
                break;
            case 4:
                com.zentraedi.comic.viewmodel.t4 t4Var4 = this.J;
                if (t4Var4 != null) {
                    t4Var4.t0(0);
                }
                break;
            case 5:
                com.zentraedi.comic.viewmodel.t4 t4Var5 = this.J;
                if (t4Var5 != null) {
                    t4Var5.t0(1);
                }
                break;
            case 6:
                com.zentraedi.comic.viewmodel.t4 t4Var6 = this.J;
                if (t4Var6 != null) {
                    t4Var6.C0();
                }
                break;
            case 7:
                com.zentraedi.comic.viewmodel.t4 t4Var7 = this.J;
                if (t4Var7 != null) {
                    t4Var7.C0();
                }
                break;
            case 8:
                com.zentraedi.comic.viewmodel.t4 t4Var8 = this.J;
                if (t4Var8 != null) {
                    t4Var8.u0(getRoot().getContext());
                }
                break;
            case 9:
                com.zentraedi.comic.viewmodel.t4 t4Var9 = this.J;
                if (t4Var9 != null) {
                    t4Var9.O();
                }
                break;
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.h0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.h0 = 32L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.t4) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return E1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return G1((ObservableField) obj, i2);
        }
        if (i == 2) {
            return D1((ObservableField) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return F1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    protected void r() {
        long j;
        long j2;
        long j3;
        String string;
        String str;
        String str2;
        Resources resources;
        int i;
        synchronized (this) {
            j = this.h0;
            this.h0 = 0L;
        }
        com.zentraedi.comic.viewmodel.t4 t4Var = this.J;
        boolean zK0 = false;
        if ((63 & j) != 0) {
            if ((j & 49) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableFieldU = t4Var != null ? t4Var.U() : null;
                p1(0, observableFieldU);
                if (observableFieldU != null) {
                    str2 = (String) observableFieldU.get();
                } else {
                    str2 = null;
                }
            }
            j2 = 0;
            if ((j & 50) == 0) {
                str = null;
            } else {
                ObservableField<String> observableFieldC0 = t4Var != null ? t4Var.c0() : null;
                p1(1, observableFieldC0);
                if (observableFieldC0 != null) {
                    str = (String) observableFieldC0.get();
                } else {
                    str = null;
                }
            }
            long j4 = j & 52;
            if (j4 != 0) {
                androidx.databinding.u uVarT = t4Var != null ? t4Var.T() : null;
                j3 = 56;
                p1(2, uVarT);
                boolean z = androidx.databinding.c0.H0(uVarT != null ? (Integer) uVarT.get() : null) == 0;
                if (j4 != 0) {
                    j |= z ? 128L : 64L;
                }
                if (z) {
                    resources = this.U.getResources();
                    i = com.zentraedi.comic.q.C0124q.UH;
                } else {
                    resources = this.U.getResources();
                    i = com.zentraedi.comic.q.C0124q.BM;
                }
                string = resources.getString(i);
            } else {
                j3 = 56;
                string = null;
            }
            if ((j & j3) != 0) {
                ObservableField<Boolean> observableFieldX = t4Var != null ? t4Var.X() : null;
                p1(3, observableFieldX);
                zK0 = androidx.databinding.c0.K0(observableFieldX != null ? (Boolean) observableFieldX.get() : null);
            }
        } else {
            j2 = 0;
            j3 = 56;
            string = null;
            str = null;
            str2 = null;
        }
        if ((j & j3) != j2) {
            androidx.databinding.adapters.k.a(this.F, zK0);
        }
        if ((32 & j) != j2) {
            this.F.setOnClickListener(this.e0);
            com.zentraedi.business.viewmodel.h.b(this.L, g8.a(Float.valueOf(44.0f)));
            this.M.setOnClickListener(this.Y);
            this.N.setOnClickListener(this.d0);
            com.zentraedi.business.viewmodel.h.b(this.P, g8.a(Float.valueOf(44.0f)));
            androidx.databinding.adapters.j0.o(this.P, g8.h());
            this.Q.setOnClickListener(this.c0);
            this.R.setOnClickListener(this.b0);
            this.S.setOnClickListener(this.g0);
            this.T.setOnClickListener(this.a0);
            this.V.setOnClickListener(this.f0);
            this.X.setOnClickListener(this.Z);
        }
        if ((j & 49) != j2) {
            androidx.databinding.adapters.f0.A(this.O, str2);
        }
        if ((j & 52) != j2) {
            androidx.databinding.adapters.f0.A(this.U, string);
        }
        if ((j & 50) != j2) {
            androidx.databinding.adapters.f0.A(this.W, str);
        }
    }

    private x1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 4, (ImageView) objArr[17], (Switch) objArr[10], (NestedScrollView) objArr[15], (MediumTextView) objArr[16], (TextView) objArr[18]);
        this.h0 = -1L;
        this.F.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.K = frameLayout;
        frameLayout.setTag(null);
        Space space = (Space) objArr[1];
        this.L = space;
        space.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[11];
        this.M = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[12];
        this.N = relativeLayout2;
        relativeLayout2.setTag(null);
        TextView textView = (TextView) objArr[13];
        this.O = textView;
        textView.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[14];
        this.P = relativeLayout3;
        relativeLayout3.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[2];
        this.Q = relativeLayout4;
        relativeLayout4.setTag(null);
        RelativeLayout relativeLayout5 = (RelativeLayout) objArr[3];
        this.R = relativeLayout5;
        relativeLayout5.setTag(null);
        RelativeLayout relativeLayout6 = (RelativeLayout) objArr[4];
        this.S = relativeLayout6;
        relativeLayout6.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[5];
        this.T = linearLayout;
        linearLayout.setTag(null);
        TextView textView2 = (TextView) objArr[6];
        this.U = textView2;
        textView2.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[7];
        this.V = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView3 = (TextView) objArr[8];
        this.W = textView3;
        textView3.setTag(null);
        RelativeLayout relativeLayout7 = (RelativeLayout) objArr[9];
        this.X = relativeLayout7;
        relativeLayout7.setTag(null);
        P0(view);
        this.Y = new com.zentraedi.comic.generated.callback.b(this, 8);
        this.Z = new com.zentraedi.comic.generated.callback.b(this, 6);
        this.a0 = new com.zentraedi.comic.generated.callback.b(this, 4);
        this.b0 = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.c0 = new com.zentraedi.comic.generated.callback.b(this, 1);
        this.d0 = new com.zentraedi.comic.generated.callback.b(this, 9);
        this.e0 = new com.zentraedi.comic.generated.callback.b(this, 7);
        this.f0 = new com.zentraedi.comic.generated.callback.b(this, 5);
        this.g0 = new com.zentraedi.comic.generated.callback.b(this, 3);
        i0();
    }
}
