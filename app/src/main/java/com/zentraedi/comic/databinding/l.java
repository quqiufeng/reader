package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ObservableField;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.business.R;
import com.zentraedi.business.databinding.ej;
import com.zentraedi.business.databinding.gj;
import com.zentraedi.business.utils.g8;
import com.zentraedi.business.widget.MediumTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class l extends k {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i U;

    @androidx.annotation.p0
    private static final SparseIntArray V;

    @androidx.annotation.n0
    private final CoordinatorLayout Q;

    @androidx.annotation.n0
    private final LinearLayout R;

    @androidx.annotation.n0
    private final View S;
    private long T;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(14);
        U = iVar;
        iVar.a(0, new String[]{"layout_comic_list_edit_tab_bar"}, new int[]{10}, new int[]{com.zentraedi.comic.q.l.ba});
        iVar.a(3, new String[]{"layout_common_navigation_bar", "layout_common_edit_navigation_bar"}, new int[]{7, 8}, new int[]{R.layout.d6, R.layout.c6});
        iVar.a(4, new String[]{"layout_comic_list_head"}, new int[]{9}, new int[]{com.zentraedi.comic.q.l.da});
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.i3, 11);
        sparseIntArray.put(com.zentraedi.comic.q.i.X6, 12);
        sparseIntArray.put(com.zentraedi.comic.q.i.d8, 13);
    }

    public l(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
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

    @Override // com.zentraedi.comic.databinding.k
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
        this.M.O0(p0Var);
        this.I.O0(p0Var);
        this.L.O0(p0Var);
        this.K.O0(p0Var);
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.T != 0) {
                    return true;
                }
                return this.M.g0() || this.I.g0() || this.L.g0() || this.K.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.T = 256L;
        }
        this.M.i0();
        this.I.i0();
        this.L.i0();
        this.K.i0();
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
    /* JADX WARN: Code duplicated, block: B:53:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x011e  */
    /* JADX WARN: Code duplicated, block: B:84:0x012e  */
    /* JADX WARN: Code duplicated, block: B:87:0x013e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0154  */
    protected void r() {
        long j;
        String str;
        boolean zK0;
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
                    i = zK0 ? 0 : 8;
                    i2 = zK0 ? 8 : 0;
                    j4 = 32768;
                } else {
                    j4 = 32768;
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
                this.H.setVisibility(i);
                this.I.getRoot().setVisibility(i);
                this.K.getRoot().setVisibility(i);
                this.R.setVisibility(i2);
                this.S.setVisibility(i);
                this.M.getRoot().setVisibility(i2);
            }
            if ((384 & j) != 0) {
                this.I.C1(a3Var);
                this.M.C1(a3Var);
            }
            if ((j & 390) != 0) {
                this.L.getRoot().setVisibility(i3);
            }
            if ((256 & j) != 0) {
                androidx.databinding.adapters.j0.o(this.R, g8.a(Float.valueOf(44.0f)));
            }
            if ((j & 385) != 0) {
                androidx.databinding.adapters.f0.A(this.O, str);
            }
            androidx.databinding.c0.t(this.M);
            androidx.databinding.c0.t(this.I);
            androidx.databinding.c0.t(this.L);
            androidx.databinding.c0.t(this.K);
        }
        str = null;
        zK0 = false;
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
            this.H.setVisibility(i);
            this.I.getRoot().setVisibility(i);
            this.K.getRoot().setVisibility(i);
            this.R.setVisibility(i2);
            this.S.setVisibility(i);
            this.M.getRoot().setVisibility(i2);
        }
        if ((384 & j) != 0) {
            this.I.C1(a3Var);
            this.M.C1(a3Var);
        }
        if ((j & 390) != 0) {
            this.L.getRoot().setVisibility(i3);
        }
        if ((256 & j) != 0) {
            androidx.databinding.adapters.j0.o(this.R, g8.a(Float.valueOf(44.0f)));
        }
        if ((j & 385) != 0) {
            androidx.databinding.adapters.f0.A(this.O, str);
        }
        androidx.databinding.c0.t(this.M);
        androidx.databinding.c0.t(this.I);
        androidx.databinding.c0.t(this.L);
        androidx.databinding.c0.t(this.K);
    }

    private l(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 7, (AppBarLayout) objArr[11], (CollapsingToolbarLayout) objArr[12], (FrameLayout) objArr[13], (View) objArr[6], (ej) objArr[8], (LinearLayout) objArr[4], (r4) objArr[10], (v4) objArr[9], (gj) objArr[7], (Toolbar) objArr[3], (MediumTextView) objArr[2]);
        this.T = -1L;
        this.H.setTag(null);
        N0(this.I);
        this.J.setTag(null);
        N0(this.K);
        N0(this.L);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.Q = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.R = linearLayout;
        linearLayout.setTag(null);
        View view2 = (View) objArr[5];
        this.S = view2;
        view2.setTag(null);
        N0(this.M);
        this.N.setTag(null);
        this.O.setTag(null);
        P0(view);
        i0();
    }
}
