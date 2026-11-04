package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class h1 extends g1 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i Z = null;

    @androidx.annotation.p0
    private static final SparseIntArray a0;

    @androidx.annotation.n0
    private final LinearLayout G;

    @androidx.annotation.n0
    private final ImageView H;

    @androidx.annotation.n0
    private final TextView I;

    @androidx.annotation.n0
    private final LinearLayout J;

    @androidx.annotation.n0
    private final CheckBox K;

    @androidx.annotation.n0
    private final LinearLayout L;

    @androidx.annotation.n0
    private final ImageView M;

    @androidx.annotation.n0
    private final TextView N;

    @androidx.annotation.n0
    private final LinearLayout O;

    @androidx.annotation.n0
    private final ImageView P;

    @androidx.annotation.n0
    private final TextView Q;

    @androidx.annotation.n0
    private final LinearLayout R;

    @androidx.annotation.n0
    private final ImageView S;

    @androidx.annotation.p0
    private final View.OnClickListener T;

    @androidx.annotation.p0
    private final View.OnClickListener U;

    @androidx.annotation.p0
    private final View.OnClickListener V;

    @androidx.annotation.p0
    private final View.OnClickListener W;

    @androidx.annotation.p0
    private final View.OnClickListener X;
    private long Y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.tK, 13);
    }

    public h1(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 14, Z, a0));
    }

    private boolean D1(ObservableField<Layout> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Y |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.g1
    public void C1(@androidx.annotation.p0 n6 n6Var) {
        this.F = n6Var;
        synchronized (this) {
            this.Y |= 2;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.B4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        n6 n6Var;
        if (i == 1) {
            n6 n6Var2 = this.F;
            if (n6Var2 != null) {
                n6Var2.h1();
                return;
            }
            return;
        }
        if (i == 2) {
            n6 n6Var3 = this.F;
            if (n6Var3 != null) {
                n6Var3.i1();
                return;
            }
            return;
        }
        if (i == 3) {
            n6 n6Var4 = this.F;
            if (n6Var4 != null) {
                n6Var4.L1();
                return;
            }
            return;
        }
        if (i != 4) {
            if (i == 5 && (n6Var = this.F) != null) {
                n6Var.N1();
                return;
            }
            return;
        }
        n6 n6Var5 = this.F;
        if (n6Var5 != null) {
            n6Var5.N1();
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.Y != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.Y = 4L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.B4 != i) {
            return false;
        }
        C1((n6) obj);
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
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        synchronized (this) {
            j = this.Y;
            this.Y = 0L;
        }
        n6 n6Var = this.F;
        long j4 = j & 7;
        View.OnClickListener onClickListenerF0 = null;
        boolean z5 = false;
        if (j4 != 0) {
            ObservableField<Layout> observableFieldR0 = n6Var != null ? n6Var.R0() : null;
            p1(0, observableFieldR0);
            Layout layout = observableFieldR0 != null ? (Layout) observableFieldR0.get() : null;
            z4 = layout == Layout.DOUBLE;
            j2 = 0;
            z = layout == Layout.COMMON;
            z2 = layout == Layout.SINGLE;
            j3 = 7;
            z3 = layout == Layout.DOUBLE_REVERSAL;
            if (j4 != 0) {
                j |= z4 ? 16L : 8L;
            }
            if ((j & 7) != 0) {
                j |= z3 ? 256L : 128L;
            }
            if ((j & 6) != 0 && n6Var != null) {
                onClickListenerF0 = n6Var.F0();
            }
        } else {
            j2 = 0;
            j3 = 7;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        long j5 = j & j3;
        if (j5 != j2) {
            boolean z6 = z4 ? true : z3;
            boolean z7 = z3 ? true : z4;
            if (j5 != j2) {
                j |= z7 ? 64L : 32L;
            }
            i = z7 ? 0 : 4;
            z5 = z6;
        } else {
            i = 0;
        }
        if ((j & 6) != j2) {
            this.H.setOnClickListener(onClickListenerF0);
        }
        if ((j & j3) != j2) {
            this.I.setSelected(z5);
            this.J.setVisibility(i);
            androidx.databinding.adapters.k.a(this.K, z3);
            this.M.setSelected(z);
            this.N.setSelected(z);
            this.P.setSelected(z2);
            this.Q.setSelected(z2);
            this.S.setSelected(z5);
        }
        if ((j & 4) != j2) {
            this.J.setOnClickListener(this.T);
            this.K.setOnClickListener(this.V);
            this.L.setOnClickListener(this.X);
            this.O.setOnClickListener(this.U);
            this.R.setOnClickListener(this.W);
        }
    }

    private h1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, (TextView) objArr[13]);
        this.Y = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.H = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.I = textView;
        textView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[11];
        this.J = linearLayout2;
        linearLayout2.setTag(null);
        CheckBox checkBox = (CheckBox) objArr[12];
        this.K = checkBox;
        checkBox.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[2];
        this.L = linearLayout3;
        linearLayout3.setTag(null);
        ImageView imageView2 = (ImageView) objArr[3];
        this.M = imageView2;
        imageView2.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.N = textView2;
        textView2.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[5];
        this.O = linearLayout4;
        linearLayout4.setTag(null);
        ImageView imageView3 = (ImageView) objArr[6];
        this.P = imageView3;
        imageView3.setTag(null);
        TextView textView3 = (TextView) objArr[7];
        this.Q = textView3;
        textView3.setTag(null);
        LinearLayout linearLayout5 = (LinearLayout) objArr[8];
        this.R = linearLayout5;
        linearLayout5.setTag(null);
        ImageView imageView4 = (ImageView) objArr[9];
        this.S = imageView4;
        imageView4.setTag(null);
        P0(view);
        this.T = new com.zentraedi.comic.generated.callback.b(this, 4);
        this.U = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.V = new com.zentraedi.comic.generated.callback.b(this, 5);
        this.W = new com.zentraedi.comic.generated.callback.b(this, 3);
        this.X = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
