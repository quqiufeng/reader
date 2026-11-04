package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import com.zentraedi.comic.viewmodel.ScreenOrganize;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class j1 extends i1 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i V = null;

    @androidx.annotation.p0
    private static final SparseIntArray W;

    @androidx.annotation.n0
    private final LinearLayout G;

    @androidx.annotation.n0
    private final ImageView H;

    @androidx.annotation.n0
    private final TextView I;

    @androidx.annotation.n0
    private final LinearLayout J;

    @androidx.annotation.n0
    private final ImageView K;

    @androidx.annotation.n0
    private final TextView L;

    @androidx.annotation.n0
    private final LinearLayout M;

    @androidx.annotation.n0
    private final ImageView N;

    @androidx.annotation.n0
    private final TextView O;

    @androidx.annotation.n0
    private final LinearLayout P;

    @androidx.annotation.n0
    private final ImageView Q;

    @androidx.annotation.p0
    private final View.OnClickListener R;

    @androidx.annotation.p0
    private final View.OnClickListener S;

    @androidx.annotation.p0
    private final View.OnClickListener T;
    private long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.tK, 11);
    }

    public j1(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 12, V, W));
    }

    private boolean D1(ObservableField<ScreenOrganize> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.i1
    public void C1(@androidx.annotation.p0 n6 n6Var) {
        this.F = n6Var;
        synchronized (this) {
            this.U |= 2;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        n6 n6Var;
        if (i == 1) {
            n6 n6Var2 = this.F;
            if (n6Var2 != null) {
                n6Var2.q1();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (n6Var = this.F) != null) {
                n6Var.p1();
                return;
            }
            return;
        }
        n6 n6Var3 = this.F;
        if (n6Var3 != null) {
            n6Var3.r1();
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.U != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.U = 4L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
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
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.U;
            this.U = 0L;
        }
        n6 n6Var = this.F;
        long j2 = 7 & j;
        View.OnClickListener onClickListenerF0 = null;
        boolean z3 = false;
        if (j2 != 0) {
            ObservableField<ScreenOrganize> observableFieldU0 = n6Var != null ? n6Var.U0() : null;
            p1(0, observableFieldU0);
            ScreenOrganize screenOrganize = observableFieldU0 != null ? (ScreenOrganize) observableFieldU0.get() : null;
            z2 = screenOrganize == ScreenOrganize.NORMAL;
            boolean z4 = screenOrganize == ScreenOrganize.LANDSCAPE;
            z3 = screenOrganize == ScreenOrganize.VERTICAL;
            if ((j & 6) != 0 && n6Var != null) {
                onClickListenerF0 = n6Var.F0();
            }
            z = z3;
            z3 = z4;
        } else {
            z = false;
            z2 = false;
        }
        if ((6 & j) != 0) {
            this.H.setOnClickListener(onClickListenerF0);
        }
        if (j2 != 0) {
            this.I.setSelected(z3);
            this.K.setSelected(z2);
            this.L.setSelected(z2);
            this.N.setSelected(z);
            this.O.setSelected(z);
            this.Q.setSelected(z3);
        }
        if ((j & 4) != 0) {
            this.J.setOnClickListener(this.T);
            this.M.setOnClickListener(this.R);
            this.P.setOnClickListener(this.S);
        }
    }

    private j1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, (TextView) objArr[11]);
        this.U = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.H = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.I = textView;
        textView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[2];
        this.J = linearLayout2;
        linearLayout2.setTag(null);
        ImageView imageView2 = (ImageView) objArr[3];
        this.K = imageView2;
        imageView2.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.L = textView2;
        textView2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[5];
        this.M = linearLayout3;
        linearLayout3.setTag(null);
        ImageView imageView3 = (ImageView) objArr[6];
        this.N = imageView3;
        imageView3.setTag(null);
        TextView textView3 = (TextView) objArr[7];
        this.O = textView3;
        textView3.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[8];
        this.P = linearLayout4;
        linearLayout4.setTag(null);
        ImageView imageView4 = (ImageView) objArr[9];
        this.Q = imageView4;
        imageView4.setTag(null);
        P0(view);
        this.R = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.S = new com.zentraedi.comic.generated.callback.b(this, 3);
        this.T = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
