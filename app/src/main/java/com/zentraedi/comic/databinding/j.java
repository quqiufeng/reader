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
import com.zentraedi.business.utils.g8;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class j extends i {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i O;

    @androidx.annotation.p0
    private static final SparseIntArray P;

    @androidx.annotation.n0
    private final CoordinatorLayout K;

    @androidx.annotation.n0
    private final LinearLayout L;

    @androidx.annotation.n0
    private final Toolbar M;
    private long N;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(7);
        O = iVar;
        iVar.a(3, new String[]{"common_toolbar"}, new int[]{4}, new int[]{R.layout.I0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.i3, 5);
        sparseIntArray.put(com.zentraedi.comic.q.i.tg, 6);
    }

    public j(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 7, O, P));
    }

    private boolean F1(com.zentraedi.business.databinding.e3 e3Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.N |= 1;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.N |= 2;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.i
    public void D1(@androidx.annotation.p0 com.zentraedi.business.viewmodel.m mVar) {
        this.I = mVar;
        synchronized (this) {
            this.N |= 4;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.s4);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.i
    public void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.q qVar) {
        this.J = qVar;
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.G.O0(p0Var);
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.N != 0) {
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
            this.N = 16L;
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
        if (i != 1) {
            return false;
        }
        return G1((ObservableField) obj, i2);
    }

    protected void r() {
        long j;
        synchronized (this) {
            j = this.N;
            this.N = 0L;
        }
        com.zentraedi.business.viewmodel.m mVar = this.I;
        long j2 = 22 & j;
        String str = null;
        if (j2 != 0) {
            ObservableField observableField = mVar != null ? mVar.b : null;
            p1(1, observableField);
            if (observableField != null) {
                str = (String) observableField.get();
            }
        }
        if ((16 & j) != 0) {
            androidx.databinding.adapters.j0.o(this.L, g8.a(Float.valueOf(44.0f)));
        }
        if ((j & 20) != 0) {
            this.G.C1(mVar);
        }
        if (j2 != 0) {
            androidx.databinding.adapters.f0.A(this.H, str);
        }
        androidx.databinding.c0.t(this.G);
    }

    private j(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 2, (AppBarLayout) objArr[5], (FragmentContainerView) objArr[6], (com.zentraedi.business.databinding.e3) objArr[4], (TextView) objArr[2]);
        this.N = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.K = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.L = linearLayout;
        linearLayout.setTag(null);
        Toolbar toolbar = (Toolbar) objArr[3];
        this.M = toolbar;
        toolbar.setTag(null);
        N0(this.G);
        this.H.setTag(null);
        P0(view);
        i0();
    }
}
