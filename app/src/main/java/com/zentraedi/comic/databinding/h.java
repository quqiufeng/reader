package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ObservableField;
import com.google.android.material.appbar.AppBarLayout;
import com.zentraedi.business.utils.g8;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class h extends g {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i R;

    @androidx.annotation.p0
    private static final SparseIntArray S;

    @androidx.annotation.n0
    private final CoordinatorLayout N;

    @androidx.annotation.n0
    private final LinearLayout O;

    @androidx.annotation.n0
    private final View P;
    private long Q;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(11);
        R = iVar;
        iVar.a(1, new String[]{"layout_comic_read_progress"}, new int[]{6}, new int[]{com.zentraedi.comic.q.l.ia});
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.i3, 7);
        sparseIntArray.put(com.zentraedi.comic.q.i.bt, 8);
        sparseIntArray.put(com.zentraedi.comic.q.i.dt, 9);
        sparseIntArray.put(com.zentraedi.comic.q.i.a8, 10);
    }

    public h(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 11, R, S));
    }

    private boolean D1(f5 f5Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q |= 1;
        }
        return true;
    }

    private boolean E1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q |= 2;
        }
        return true;
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q |= 4;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.g
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.i0 i0Var) {
        this.M = i0Var;
        synchronized (this) {
            this.Q |= 8;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.G.O0(p0Var);
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.Q != 0) {
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
            this.Q = 16L;
        }
        this.G.i0();
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.i0) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return D1((f5) obj, i2);
        }
        if (i == 1) {
            return E1((ObservableField) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return F1((ObservableField) obj, i2);
    }

    protected void r() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.Q;
            this.Q = 0L;
        }
        com.zentraedi.comic.viewmodel.i0 i0Var = this.M;
        String str = null;
        int i3 = 0;
        if ((30 & j) != 0) {
            long j2 = j & 26;
            if (j2 != 0) {
                ObservableField<Boolean> observableFieldN = i0Var != null ? i0Var.N() : null;
                p1(1, observableFieldN);
                boolean zK0 = androidx.databinding.c0.K0(observableFieldN != null ? (Boolean) observableFieldN.get() : null);
                if (j2 != 0) {
                    j |= zK0 ? 320L : 160L;
                }
                int i4 = zK0 ? 8 : 0;
                i2 = zK0 ? 0 : 8;
                i3 = i4;
            } else {
                i2 = 0;
            }
            if ((j & 28) != 0) {
                ObservableField<String> title = i0Var != null ? i0Var.getTitle() : null;
                p1(2, title);
                if (title != null) {
                    str = (String) title.get();
                }
            }
            i = i3;
            i3 = i2;
        } else {
            i = 0;
        }
        if ((26 & j) != 0) {
            this.G.getRoot().setVisibility(i3);
            this.P.setVisibility(i);
        }
        if ((16 & j) != 0) {
            androidx.databinding.adapters.j0.o(this.O, g8.a(Float.valueOf(44.0f)));
            com.zentraedi.business.viewmodel.h.b(this.J, g8.a(Float.valueOf(44.0f)));
            androidx.databinding.adapters.j0.o(this.J, g8.h());
        }
        if ((j & 28) != 0) {
            androidx.databinding.adapters.f0.A(this.K, str);
            androidx.databinding.adapters.f0.A(this.L, str);
        }
        androidx.databinding.c0.t(this.G);
    }

    private h(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 3, (AppBarLayout) objArr[7], (FrameLayout) objArr[10], (f5) objArr[6], (ImageView) objArr[8], (ImageView) objArr[9], (RelativeLayout) objArr[4], (TextView) objArr[2], (TextView) objArr[5]);
        this.Q = -1L;
        N0(this.G);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.N = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.O = linearLayout;
        linearLayout.setTag(null);
        View view2 = (View) objArr[3];
        this.P = view2;
        view2.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        P0(view);
        i0();
    }
}
