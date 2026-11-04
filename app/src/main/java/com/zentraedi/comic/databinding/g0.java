package com.zentraedi.comic.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.databinding.ObservableField;
import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.PageOver;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class g0 extends f0 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i X = null;

    @androidx.annotation.p0
    private static final SparseIntArray Y;

    @androidx.annotation.n0
    private final LinearLayout L;

    @androidx.annotation.n0
    private final TextView M;

    @androidx.annotation.n0
    private final LinearLayout N;

    @androidx.annotation.n0
    private final View O;

    @androidx.annotation.n0
    private final LinearLayout P;

    @androidx.annotation.n0
    private final TextView Q;

    @androidx.annotation.n0
    private final TextView R;

    @androidx.annotation.p0
    private final View.OnClickListener S;

    @androidx.annotation.p0
    private final View.OnClickListener T;

    @androidx.annotation.p0
    private final View.OnClickListener U;

    @androidx.annotation.p0
    private final View.OnClickListener V;
    private long W;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.pP, 10);
    }

    public g0(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 11, X, Y));
    }

    private boolean F1(ObservableField<Integer> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= 1;
        }
        return true;
    }

    private boolean G1(ObservableField<PageOver> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= 4;
        }
        return true;
    }

    private boolean I1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= 2;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.f0
    public void D1(@androidx.annotation.p0 Layout layout) {
        this.J = layout;
    }

    @Override // com.zentraedi.comic.databinding.f0
    public void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.t4 t4Var) {
        this.K = t4Var;
        synchronized (this) {
            this.W |= 16;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        com.zentraedi.comic.viewmodel.t4 t4Var;
        if (i == 1) {
            com.zentraedi.comic.viewmodel.t4 t4Var2 = this.K;
            if (t4Var2 != null) {
                t4Var2.closeDialog();
                return;
            }
            return;
        }
        if (i == 2) {
            com.zentraedi.comic.viewmodel.t4 t4Var3 = this.K;
            if (t4Var3 != null) {
                t4Var3.J0();
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 4 && (t4Var = this.K) != null) {
                t4Var.L0(PageOver.TRANSLATION);
                return;
            }
            return;
        }
        com.zentraedi.comic.viewmodel.t4 t4Var4 = this.K;
        if (t4Var4 != null) {
            t4Var4.L0(PageOver.SCROLL);
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.W != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.W = 32L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.Q1 == i) {
            D1((Layout) obj);
            return true;
        }
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        E1((com.zentraedi.comic.viewmodel.t4) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return F1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return I1((ObservableField) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return G1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0113  */
    /* JADX WARN: Code duplicated, block: B:90:0x0135  */
    /* JADX WARN: Code duplicated, block: B:93:0x0154  */
    /* JADX WARN: Code duplicated, block: B:96:0x015e  */
    protected void r() {
        long j;
        long j2;
        int iB;
        int i;
        int iH0;
        int i2;
        Drawable drawable;
        boolean zK0;
        synchronized (this) {
            j = this.W;
            this.W = 0L;
        }
        com.zentraedi.comic.viewmodel.t4 t4Var = this.K;
        long j3 = 50;
        boolean z = false;
        Drawable drawableB = null;
        if ((55 & j) != 0) {
            if ((j & 49) != 0) {
                ObservableField<Integer> observableFieldS = t4Var != null ? t4Var.S() : null;
                p1(0, observableFieldS);
                iH0 = androidx.databinding.c0.H0(observableFieldS != null ? (Integer) observableFieldS.get() : null);
            } else {
                iH0 = 0;
            }
            long j4 = j & 50;
            j2 = 0;
            if (j4 != 0) {
                ObservableField<Boolean> observableFieldK0 = t4Var != null ? t4Var.k0() : null;
                p1(1, observableFieldK0);
                zK0 = androidx.databinding.c0.K0(observableFieldK0 != null ? (Boolean) observableFieldK0.get() : null);
                if (j4 != 0) {
                    j |= zK0 ? 32768L : 16384L;
                }
                i2 = zK0 ? 0 : 8;
            } else {
                zK0 = false;
                i2 = 0;
            }
            long j5 = j & 52;
            if (j5 != 0) {
                ObservableField<PageOver> observableFieldF0 = t4Var != null ? t4Var.f0() : null;
                p1(2, observableFieldF0);
                PageOver pageOver = observableFieldF0 != null ? (PageOver) observableFieldF0.get() : null;
                boolean z2 = pageOver == PageOver.TRANSLATION;
                j3 = 50;
                z = pageOver == PageOver.SCROLL;
                if (j5 != 0) {
                    j |= z2 ? 10240L : 5120L;
                }
                if ((j & 52) != 0) {
                    j |= z ? 640L : 320L;
                }
                int iB2 = androidx.databinding.c0.B(this.R, z2 ? com.zentraedi.comic.q.f.Wb : com.zentraedi.comic.q.f.o7);
                Drawable drawableB2 = z2 ? g.a.b(this.R.getContext(), com.zentraedi.comic.q.h.V00) : null;
                drawableB = z ? g.a.b(this.Q.getContext(), com.zentraedi.comic.q.h.V00) : null;
                Drawable drawable2 = drawableB2;
                i = iB2;
                iB = androidx.databinding.c0.B(this.Q, z ? com.zentraedi.comic.q.f.Wb : com.zentraedi.comic.q.f.o7);
                z = zK0;
                drawable = drawable2;
            } else {
                iB = 0;
                i = 0;
                z = zK0;
            }
            if ((32 & j) != j2) {
                this.E.setOnClickListener(this.S);
                this.F.setOnClickListener(this.U);
                this.Q.setOnClickListener(this.V);
                this.R.setOnClickListener(this.T);
            }
            if ((j & j3) != j2) {
                androidx.databinding.adapters.k.a(this.F, z);
                this.M.setVisibility(i2);
                this.N.setVisibility(i2);
                this.O.setVisibility(i2);
                this.P.setVisibility(i2);
            }
            if ((j & 49) != j2) {
                androidx.databinding.adapters.y.b(this.H, iH0);
            }
            if ((j & 52) != j2) {
                androidx.databinding.adapters.j0.b(this.Q, drawableB);
                this.Q.setTextColor(iB);
                androidx.databinding.adapters.j0.b(this.R, drawable);
                this.R.setTextColor(i);
            }
        }
        j2 = 0;
        iB = 0;
        i = 0;
        iH0 = 0;
        i2 = 0;
        drawable = null;
        if ((32 & j) != j2) {
            this.E.setOnClickListener(this.S);
            this.F.setOnClickListener(this.U);
            this.Q.setOnClickListener(this.V);
            this.R.setOnClickListener(this.T);
        }
        if ((j & j3) != j2) {
            androidx.databinding.adapters.k.a(this.F, z);
            this.M.setVisibility(i2);
            this.N.setVisibility(i2);
            this.O.setVisibility(i2);
            this.P.setVisibility(i2);
        }
        if ((j & 49) != j2) {
            androidx.databinding.adapters.y.b(this.H, iH0);
        }
        if ((j & 52) != j2) {
            androidx.databinding.adapters.j0.b(this.Q, drawableB);
            this.Q.setTextColor(iB);
            androidx.databinding.adapters.j0.b(this.R, drawable);
            this.R.setTextColor(i);
        }
    }

    private g0(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 3, (ImageView) objArr[1], (Switch) objArr[2], null, (AppCompatSeekBar) objArr[5], (TextView) objArr[10]);
        this.W = -1L;
        this.E.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.L = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.M = textView;
        textView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[4];
        this.N = linearLayout2;
        linearLayout2.setTag(null);
        View view2 = (View) objArr[6];
        this.O = view2;
        view2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[7];
        this.P = linearLayout3;
        linearLayout3.setTag(null);
        TextView textView2 = (TextView) objArr[8];
        this.Q = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[9];
        this.R = textView3;
        textView3.setTag(null);
        P0(view);
        this.S = new com.zentraedi.comic.generated.callback.b(this, 1);
        this.T = new com.zentraedi.comic.generated.callback.b(this, 4);
        this.U = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.V = new com.zentraedi.comic.generated.callback.b(this, 3);
        i0();
    }
}
