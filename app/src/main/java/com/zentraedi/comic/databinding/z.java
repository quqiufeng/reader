package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.business.R;
import com.zentraedi.business.databinding.ej;
import com.zentraedi.business.databinding.gj;
import com.zentraedi.business.utils.g8;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class z extends y {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i V;

    @androidx.annotation.p0
    private static final SparseIntArray W;

    @androidx.annotation.n0
    private final CoordinatorLayout P;

    @androidx.annotation.n0
    private final LinearLayout Q;

    @androidx.annotation.n0
    private final View R;

    @androidx.annotation.n0
    private final View S;

    @androidx.annotation.n0
    private final RelativeLayout T;
    private long U;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(15);
        V = iVar;
        iVar.a(0, new String[]{"layout_comic_list_edit_tab_bar"}, new int[]{11}, new int[]{com.zentraedi.comic.q.l.ba});
        iVar.a(1, new String[]{"layout_comic_read_progress"}, new int[]{7}, new int[]{com.zentraedi.comic.q.l.ia});
        iVar.a(5, new String[]{"layout_common_navigation_bar", "layout_common_edit_navigation_bar"}, new int[]{8, 9}, new int[]{R.layout.d6, R.layout.c6});
        iVar.a(6, new String[]{"layout_comic_list_head"}, new int[]{10}, new int[]{com.zentraedi.comic.q.l.da});
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.i3, 12);
        sparseIntArray.put(com.zentraedi.comic.q.i.X6, 13);
        sparseIntArray.put(com.zentraedi.comic.q.i.d8, 14);
    }

    public z(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 15, V, W));
    }

    private boolean D1(ej ejVar, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 128;
        }
        return true;
    }

    private boolean E1(r4 r4Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 32;
        }
        return true;
    }

    private boolean F1(v4 v4Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 256;
        }
        return true;
    }

    private boolean G1(f5 f5Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 2;
        }
        return true;
    }

    private boolean I1(gj gjVar, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 16;
        }
        return true;
    }

    private boolean J1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 8;
        }
        return true;
    }

    private boolean K1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 1;
        }
        return true;
    }

    private boolean L1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 64;
        }
        return true;
    }

    private boolean N1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 4;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.y
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.a3 a3Var) {
        this.O = a3Var;
        synchronized (this) {
            this.U |= 512;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.G2);
        super.C0();
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.K.O0(p0Var);
        this.L.O0(p0Var);
        this.H.O0(p0Var);
        this.J.O0(p0Var);
        this.I.O0(p0Var);
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.U != 0) {
                    return true;
                }
                return this.K.g0() || this.L.g0() || this.H.g0() || this.J.g0() || this.I.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.U = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
        this.K.i0();
        this.L.i0();
        this.H.i0();
        this.J.i0();
        this.I.i0();
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
                return K1((ObservableField) obj, i2);
            case 1:
                return G1((f5) obj, i2);
            case 2:
                return N1((ObservableField) obj, i2);
            case 3:
                return J1((ObservableField) obj, i2);
            case 4:
                return I1((gj) obj, i2);
            case 5:
                return E1((r4) obj, i2);
            case 6:
                return L1((ObservableBoolean) obj, i2);
            case 7:
                return D1((ej) obj, i2);
            case 8:
                return F1((v4) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0169 A[PHI: r2
      0x0169: PHI (r2v3 long) = (r2v2 long), (r2v9 long) binds: [B:98:0x0150, B:107:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    protected void r() {
        long j;
        long j2;
        long j3;
        String str;
        ObservableField<Boolean> observableField;
        Boolean bool;
        boolean z;
        int i;
        int i2;
        int i3;
        boolean zK0;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        synchronized (this) {
            j = this.U;
            this.U = 0L;
        }
        com.zentraedi.comic.viewmodel.a3 a3Var = this.O;
        if ((1613 & j) != 0) {
            if ((j & 1537) == 0) {
                str = null;
            } else {
                ObservableField<String> observableField2 = a3Var != null ? a3Var.navTitle : null;
                p1(0, observableField2);
                if (observableField2 != null) {
                    str = (String) observableField2.get();
                } else {
                    str = null;
                }
            }
            if ((j & 1548) != 0) {
                observableField = a3Var != null ? a3Var.editModel : null;
                p1(3, observableField);
                bool = observableField != null ? (Boolean) observableField.get() : null;
                zK0 = androidx.databinding.c0.K0(bool);
                if ((j & 1544) != 0) {
                    j = zK0 ? j | 5242880 : j | 2621440;
                }
                if ((j & 1548) != 0) {
                    j = zK0 ? j | 16777216 : j | 8388608;
                }
                if ((j & 1544) != 0) {
                    i2 = zK0 ? 0 : 8;
                    i6 = zK0 ? 8 : 0;
                } else {
                    i2 = 0;
                    i6 = 0;
                }
            } else {
                zK0 = false;
                i2 = 0;
                i6 = 0;
                observableField = null;
                bool = null;
            }
            if ((j & 1608) != 0) {
                androidx.databinding.u uVarT = a3Var != null ? a3Var.T() : null;
                j2 = 65536;
                p1(6, uVarT);
                z = uVarT != null ? uVarT.get() : false;
                if ((j & 1600) != 0) {
                    j |= z ? 16384L : 8192L;
                }
                if ((j & 1608) != 0) {
                    j = z ? j | 65536 : j | 32768;
                }
                if ((j & 1600) != 0) {
                    i = z ? 8 : 0;
                    i2 = i2;
                }
                i3 = i6;
                j3 = 16777216;
            } else {
                j2 = 65536;
                z = false;
            }
            i = 0;
            i3 = i6;
            j3 = 16777216;
        } else {
            j2 = 65536;
            j3 = 16777216;
            str = null;
            observableField = null;
            bool = null;
            z = false;
            i = 0;
            i2 = 0;
            i3 = 0;
            zK0 = false;
        }
        if ((j & j2) != 0) {
            if (a3Var != null) {
                observableField = a3Var.editModel;
            }
            p1(3, observableField);
            if (observableField != null) {
                bool = (Boolean) observableField.get();
            }
            zK0 = androidx.databinding.c0.K0(bool);
            if ((j & 1544) != 0) {
                j = zK0 ? j | 5242880 : j | 2621440;
            }
            if ((j & 1548) != 0) {
                j = zK0 ? j | j3 : j | 8388608;
            }
            z2 = !zK0;
        } else {
            z2 = false;
        }
        long j4 = j & 1608;
        if (j4 == 0) {
            i4 = 0;
        } else {
            if (!z) {
                z2 = false;
            }
            if (j4 != 0) {
                j |= z2 ? 262144L : 131072L;
            }
            if (z2) {
                i4 = 0;
            } else {
                i4 = 8;
            }
        }
        if ((j & 8388608) != 0) {
            ObservableField<Boolean> observableFieldU = a3Var != null ? a3Var.U() : null;
            p1(2, observableFieldU);
            z3 = !androidx.databinding.c0.K0(observableFieldU != null ? (Boolean) observableFieldU.get() : null);
        } else {
            z3 = false;
        }
        long j5 = j & 1548;
        if (j5 != 0) {
            boolean z4 = zK0 ? true : z3;
            if (j5 != 0) {
                j |= z4 ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF : ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
            }
            i5 = z4 ? 8 : 0;
        } else {
            i5 = 0;
        }
        if ((j & 1544) != 0) {
            this.H.getRoot().setVisibility(i2);
            this.I.getRoot().setVisibility(i2);
            this.S.setVisibility(i3);
            this.L.getRoot().setVisibility(i3);
            this.N.setVisibility(i3);
        }
        if ((1536 & j) != 0) {
            this.H.C1(a3Var);
            this.L.C1(a3Var);
        }
        if ((j & 1548) != 0) {
            this.J.getRoot().setVisibility(i5);
        }
        if ((j & 1608) != 0) {
            this.K.getRoot().setVisibility(i4);
        }
        if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j) != 0) {
            androidx.databinding.adapters.j0.o(this.Q, g8.a(Float.valueOf(44.0f)));
        }
        if ((j & 1600) != 0) {
            this.R.setVisibility(i);
        }
        if ((j & 1537) != 0) {
            androidx.databinding.adapters.f0.A(this.N, str);
        }
        androidx.databinding.c0.t(this.K);
        androidx.databinding.c0.t(this.L);
        androidx.databinding.c0.t(this.H);
        androidx.databinding.c0.t(this.J);
        androidx.databinding.c0.t(this.I);
    }

    private z(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 9, (AppBarLayout) objArr[12], (CollapsingToolbarLayout) objArr[13], (FrameLayout) objArr[14], (ej) objArr[9], (r4) objArr[11], (v4) objArr[10], (f5) objArr[7], (gj) objArr[8], (Toolbar) objArr[5], (TextView) objArr[2]);
        this.U = -1L;
        N0(this.H);
        N0(this.I);
        N0(this.J);
        N0(this.K);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.P = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.Q = linearLayout;
        linearLayout.setTag(null);
        View view2 = (View) objArr[3];
        this.R = view2;
        view2.setTag(null);
        View view3 = (View) objArr[4];
        this.S = view3;
        view3.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[6];
        this.T = relativeLayout;
        relativeLayout.setTag(null);
        N0(this.L);
        this.M.setTag(null);
        this.N.setTag(null);
        P0(view);
        i0();
    }
}
