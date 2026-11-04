package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ObservableField;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.business.R;
import com.zentraedi.business.databinding.ej;
import com.zentraedi.business.databinding.gj;
import com.zentraedi.business.utils.g8;
import com.zentraedi.business.view.NoScrollViewPager;
import com.zentraedi.business.widget.MediumTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class b0 extends a0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i U;

    @androidx.annotation.p0
    private static final SparseIntArray V;

    @androidx.annotation.n0
    private final CoordinatorLayout Q;

    @androidx.annotation.n0
    private final LinearLayout R;

    @androidx.annotation.n0
    private final RelativeLayout S;
    private long T;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(14);
        U = iVar;
        iVar.a(0, new String[]{"layout_comic_list_edit_tab_bar"}, new int[]{9}, new int[]{com.zentraedi.comic.q.l.ba});
        iVar.a(3, new String[]{"layout_common_navigation_bar", "layout_common_edit_navigation_bar"}, new int[]{6, 7}, new int[]{R.layout.d6, R.layout.c6});
        iVar.a(4, new String[]{"layout_comic_list_head"}, new int[]{8}, new int[]{com.zentraedi.comic.q.l.da});
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.i3, 10);
        sparseIntArray.put(com.zentraedi.comic.q.i.X6, 11);
        sparseIntArray.put(com.zentraedi.comic.q.i.xK, 12);
        sparseIntArray.put(com.zentraedi.comic.q.i.lU, 13);
    }

    public b0(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 14, U, V));
    }

    private boolean D1(ej ejVar, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.T |= 32;
        }
        return true;
    }

    private boolean E1(r4 r4Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.T |= 16;
        }
        return true;
    }

    private boolean F1(v4 v4Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.T |= 64;
        }
        return true;
    }

    private boolean G1(gj gjVar, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.T |= 8;
        }
        return true;
    }

    private boolean I1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.T |= 4;
        }
        return true;
    }

    private boolean J1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.T |= 1;
        }
        return true;
    }

    private boolean K1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.T |= 2;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.a0
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.a3 a3Var) {
        this.P = a3Var;
        synchronized (this) {
            this.T |= 128;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.G2);
        super.C0();
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.J.O0(p0Var);
        this.G.O0(p0Var);
        this.I.O0(p0Var);
        this.H.O0(p0Var);
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.T != 0) {
                    return true;
                }
                return this.J.g0() || this.G.g0() || this.I.g0() || this.H.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.T = 256L;
        }
        this.J.i0();
        this.G.i0();
        this.I.i0();
        this.H.i0();
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.G2 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.a3) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return J1((ObservableField) obj, i2);
            case 1:
                return K1((ObservableField) obj, i2);
            case 2:
                return I1((ObservableField) obj, i2);
            case 3:
                return G1((gj) obj, i2);
            case 4:
                return E1((r4) obj, i2);
            case 5:
                return D1((ej) obj, i2);
            case 6:
                return F1((v4) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0128  */
    /* JADX WARN: Code duplicated, block: B:85:0x0138  */
    /* JADX WARN: Code duplicated, block: B:88:0x0148  */
    /* JADX WARN: Code duplicated, block: B:91:0x015e  */
    protected void r() {
        long j;
        String str;
        boolean zK0;
        boolean zK1;
        int i;
        int i2;
        boolean z;
        long j2;
        int i3;
        boolean z2;
        long j3;
        ObservableField<Boolean> observableFieldU;
        synchronized (this) {
            j = this.T;
            this.T = 0L;
        }
        com.zentraedi.comic.viewmodel.a3 a3Var = this.P;
        long j4 = 32768;
        if ((391 & j) != 0) {
            if ((j & 385) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField = a3Var != null ? a3Var.navTitle : null;
                p1(0, observableField);
                if (observableField != null) {
                    str = (String) observableField.get();
                } else {
                    str = null;
                }
            }
            if ((j & 390) != 0) {
                ObservableField<Boolean> observableField2 = a3Var != null ? a3Var.editModel : null;
                p1(2, observableField2);
                zK0 = androidx.databinding.c0.K0(observableField2 != null ? (Boolean) observableField2.get() : null);
                if ((j & 388) != 0) {
                    j |= zK0 ? 20480L : 10240L;
                }
                if ((j & 390) != 0) {
                    j = zK0 ? j | 65536 : j | 32768;
                }
                if ((j & 388) != 0) {
                    boolean z3 = !zK0;
                    int i4 = zK0 ? 0 : 8;
                    int i5 = zK0 ? 8 : 0;
                    zK1 = androidx.databinding.c0.K0(Boolean.valueOf(z3));
                    i = i4;
                    i2 = i5;
                    j4 = 32768;
                } else {
                    j4 = 32768;
                    zK1 = false;
                    i = 0;
                    i2 = 0;
                }
            }
            if ((j & j4) != 0) {
                if (a3Var != null) {
                    observableFieldU = a3Var.U();
                } else {
                    observableFieldU = null;
                }
                p1(1, observableFieldU);
                z = !androidx.databinding.c0.K0(observableFieldU != null ? (Boolean) observableFieldU.get() : null);
            } else {
                z = false;
            }
            j2 = j & 390;
            if (j2 != 0) {
                z2 = zK0 ? true : z;
                if (j2 != 0) {
                    if (z2) {
                        j3 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                    } else {
                        j3 = 512;
                    }
                    j |= j3;
                }
                i3 = z2 ? 8 : 0;
            } else {
                i3 = 0;
            }
            if ((j & 388) != 0) {
                this.G.getRoot().setVisibility(i);
                this.H.getRoot().setVisibility(i);
                this.J.getRoot().setVisibility(i2);
                this.K.setVisibility(i2);
                this.N.setEnabled(zK1);
            }
            if ((384 & j) != 0) {
                this.G.C1(a3Var);
                this.J.C1(a3Var);
            }
            if ((j & 390) != 0) {
                this.I.getRoot().setVisibility(i3);
            }
            if ((256 & j) != 0) {
                androidx.databinding.adapters.j0.o(this.R, g8.a(Float.valueOf(44.0f)));
            }
            if ((j & 385) != 0) {
                androidx.databinding.adapters.f0.A(this.N, str);
            }
            androidx.databinding.c0.t(this.J);
            androidx.databinding.c0.t(this.G);
            androidx.databinding.c0.t(this.I);
            androidx.databinding.c0.t(this.H);
        }
        str = null;
        zK0 = false;
        zK1 = false;
        i = 0;
        i2 = 0;
        if ((j & j4) != 0) {
            if (a3Var != null) {
                observableFieldU = a3Var.U();
            } else {
                observableFieldU = null;
            }
            p1(1, observableFieldU);
            z = !androidx.databinding.c0.K0(observableFieldU != null ? (Boolean) observableFieldU.get() : null);
        } else {
            z = false;
        }
        j2 = j & 390;
        if (j2 != 0) {
            if (zK0) {
            }
            if (j2 != 0) {
                if (z2) {
                    j3 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                } else {
                    j3 = 512;
                }
                j |= j3;
            }
            i3 = z2 ? 8 : 0;
        } else {
            i3 = 0;
        }
        if ((j & 388) != 0) {
            this.G.getRoot().setVisibility(i);
            this.H.getRoot().setVisibility(i);
            this.J.getRoot().setVisibility(i2);
            this.K.setVisibility(i2);
            this.N.setEnabled(zK1);
        }
        if ((384 & j) != 0) {
            this.G.C1(a3Var);
            this.J.C1(a3Var);
        }
        if ((j & 390) != 0) {
            this.I.getRoot().setVisibility(i3);
        }
        if ((256 & j) != 0) {
            androidx.databinding.adapters.j0.o(this.R, g8.a(Float.valueOf(44.0f)));
        }
        if ((j & 385) != 0) {
            androidx.databinding.adapters.f0.A(this.N, str);
        }
        androidx.databinding.c0.t(this.J);
        androidx.databinding.c0.t(this.G);
        androidx.databinding.c0.t(this.I);
        androidx.databinding.c0.t(this.H);
    }

    private b0(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 7, (AppBarLayout) objArr[10], (CollapsingToolbarLayout) objArr[11], (ej) objArr[7], (r4) objArr[9], (v4) objArr[8], (gj) objArr[6], (SlidingTabLayout) objArr[5], (View) objArr[12], (Toolbar) objArr[3], (MediumTextView) objArr[2], (NoScrollViewPager) objArr[13]);
        this.T = -1L;
        N0(this.G);
        N0(this.H);
        N0(this.I);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.Q = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.R = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[4];
        this.S = relativeLayout;
        relativeLayout.setTag(null);
        N0(this.J);
        this.K.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        P0(view);
        i0();
    }
}
