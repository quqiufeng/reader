package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ObservableField;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;
import com.zentraedi.business.R;
import com.zentraedi.business.utils.w8;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class b extends a implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i V;

    @androidx.annotation.p0
    private static final SparseIntArray W;

    @androidx.annotation.n0
    private final CoordinatorLayout O;

    @androidx.annotation.n0
    private final LinearLayout P;

    @androidx.annotation.n0
    private final Toolbar Q;

    @androidx.annotation.p0
    private final View.OnClickListener R;

    @androidx.annotation.p0
    private final View.OnClickListener S;

    @androidx.annotation.p0
    private final View.OnClickListener T;
    private long U;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(11);
        V = iVar;
        iVar.a(3, new String[]{"common_toolbar"}, new int[]{8}, new int[]{R.layout.I0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.i3, 9);
        sparseIntArray.put(com.zentraedi.comic.q.i.tg, 10);
    }

    public b(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 11, V, W));
    }

    private boolean F1(com.zentraedi.business.databinding.e3 e3Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 1;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 4;
        }
        return true;
    }

    private boolean I1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 2;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.a
    public void D1(@androidx.annotation.p0 com.zentraedi.business.viewmodel.m mVar) {
        this.M = mVar;
        synchronized (this) {
            this.U |= 8;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.s4);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.a
    public void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.q qVar) {
        this.N = qVar;
        synchronized (this) {
            this.U |= 16;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.G.O0(p0Var);
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        com.zentraedi.comic.viewmodel.q qVar;
        if (i == 1) {
            com.zentraedi.comic.viewmodel.q qVar2 = this.N;
            if (qVar2 != null) {
                qVar2.i0(getRoot().getContext(), view);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (qVar = this.N) != null) {
                qVar.M0();
                return;
            }
            return;
        }
        com.zentraedi.comic.viewmodel.q qVar3 = this.N;
        if (qVar3 != null) {
            qVar3.q0();
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.U != 0) {
                    return true;
                }
                return this.G.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.U = 32L;
        }
        this.G.i0();
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.s4 == i) {
            D1((com.zentraedi.business.viewmodel.m) obj);
            return true;
        }
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        E1((com.zentraedi.comic.viewmodel.q) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return F1((com.zentraedi.business.databinding.e3) obj, i2);
        }
        if (i == 1) {
            return I1((ObservableField) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return G1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    protected void r() {
        long j;
        String str;
        synchronized (this) {
            j = this.U;
            this.U = 0L;
        }
        com.zentraedi.business.viewmodel.m mVar = this.M;
        com.zentraedi.comic.viewmodel.q qVar = this.N;
        long j2 = 44 & j;
        String str2 = null;
        if (j2 == 0) {
            str = null;
        } else {
            ObservableField observableField = mVar != null ? mVar.b : null;
            p1(2, observableField);
            if (observableField != null) {
                str = (String) observableField.get();
            } else {
                str = null;
            }
        }
        long j3 = 50 & j;
        if (j3 != 0) {
            ObservableField<String> observableFieldE0 = qVar != null ? qVar.E0() : null;
            p1(1, observableFieldE0);
            if (observableFieldE0 != null) {
                str2 = (String) observableFieldE0.get();
            }
        }
        if ((32 & j) != 0) {
            androidx.databinding.adapters.j0.o(this.P, w8.a.a(44.0f));
            this.H.setOnClickListener(this.T);
            this.I.setOnClickListener(this.S);
            this.L.setOnClickListener(this.R);
        }
        if ((j & 40) != 0) {
            this.G.C1(mVar);
        }
        if (j2 != 0) {
            androidx.databinding.adapters.f0.A(this.J, str);
        }
        if (j3 != 0) {
            androidx.databinding.adapters.f0.A(this.K, str2);
        }
        androidx.databinding.c0.t(this.G);
    }

    private b(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 3, (AppBarLayout) objArr[9], (FragmentContainerView) objArr[10], (com.zentraedi.business.databinding.e3) objArr[8], (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[7]);
        this.U = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.O = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.P = linearLayout;
        linearLayout.setTag(null);
        Toolbar toolbar = (Toolbar) objArr[3];
        this.Q = toolbar;
        toolbar.setTag(null);
        N0(this.G);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        P0(view);
        this.R = new com.zentraedi.comic.generated.callback.b(this, 3);
        this.S = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.T = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
