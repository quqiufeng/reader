package com.zentraedi.comic.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import com.zentraedi.comic.viewmodel.Clip;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class b1 extends a1 implements com.zentraedi.comic.generated.callback.b.a {

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

    public b1(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 12, V, W));
    }

    private boolean D1(ObservableField<Clip> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.a1
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
                n6Var2.w1(Clip.WHITE);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (n6Var = this.F) != null) {
                n6Var.w1(Clip.NORMAL);
                return;
            }
            return;
        }
        n6 n6Var3 = this.F;
        if (n6Var3 != null) {
            n6Var3.C0();
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
        long j2;
        Drawable drawableB;
        Drawable drawableB2;
        int iB;
        int iB2;
        int iB3;
        Drawable drawableB3;
        TextView textView;
        int i;
        Context context;
        int i2;
        synchronized (this) {
            j = this.U;
            this.U = 0L;
        }
        n6 n6Var = this.F;
        long j3 = j & 7;
        View.OnClickListener onClickListenerF0 = null;
        if (j3 != 0) {
            ObservableField<Clip> observableFieldQ0 = n6Var != null ? n6Var.Q0() : null;
            p1(0, observableFieldQ0);
            Clip clip = observableFieldQ0 != null ? (Clip) observableFieldQ0.get() : null;
            boolean z = clip == Clip.NORMAL;
            j2 = 0;
            boolean z2 = clip == Clip.WHITE;
            boolean z3 = clip == Clip.CUSTOM;
            if (j3 != 0) {
                j |= z ? 17408L : 8704L;
            }
            if ((j & 7) != 0) {
                j |= z2 ? 4112L : 2056L;
            }
            if ((j & 7) != 0) {
                j |= z3 ? 320L : 160L;
            }
            drawableB = g.a.b(this.Q.getContext(), z ? com.zentraedi.comic.q.h.NF : com.zentraedi.comic.q.h.LF);
            iB2 = androidx.databinding.c0.B(this.I, z ? com.zentraedi.comic.q.f.n4 : com.zentraedi.comic.q.f.Vz);
            drawableB2 = g.a.b(this.K.getContext(), z2 ? com.zentraedi.comic.q.h.IF : com.zentraedi.comic.q.h.GF);
            if (z2) {
                textView = this.L;
                i = com.zentraedi.comic.q.f.n4;
            } else {
                textView = this.L;
                i = com.zentraedi.comic.q.f.Vz;
            }
            iB = androidx.databinding.c0.B(textView, i);
            iB3 = androidx.databinding.c0.B(this.O, z3 ? com.zentraedi.comic.q.f.n4 : com.zentraedi.comic.q.f.Vz);
            if (z3) {
                context = this.N.getContext();
                i2 = com.zentraedi.comic.q.h.OF;
            } else {
                context = this.N.getContext();
                i2 = com.zentraedi.comic.q.h.JF;
            }
            drawableB3 = g.a.b(context, i2);
            if ((j & 6) != 0 && n6Var != null) {
                onClickListenerF0 = n6Var.F0();
            }
        } else {
            j2 = 0;
            drawableB = null;
            drawableB2 = null;
            iB = 0;
            iB2 = 0;
            iB3 = 0;
            drawableB3 = null;
        }
        if ((6 & j) != j2) {
            this.H.setOnClickListener(onClickListenerF0);
        }
        if ((7 & j) != j2) {
            this.I.setTextColor(iB2);
            androidx.databinding.adapters.p.a(this.K, drawableB2);
            this.L.setTextColor(iB);
            androidx.databinding.adapters.p.a(this.N, drawableB3);
            this.O.setTextColor(iB3);
            androidx.databinding.adapters.p.a(this.Q, drawableB);
        }
        if ((j & 4) != j2) {
            this.J.setOnClickListener(this.S);
            this.M.setOnClickListener(this.T);
            this.P.setOnClickListener(this.R);
        }
    }

    private b1(androidx.databinding.l lVar, View view, Object[] objArr) {
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
        this.R = new com.zentraedi.comic.generated.callback.b(this, 3);
        this.S = new com.zentraedi.comic.generated.callback.b(this, 1);
        this.T = new com.zentraedi.comic.generated.callback.b(this, 2);
        i0();
    }
}
