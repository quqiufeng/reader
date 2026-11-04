package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.business.R;
import com.zentraedi.business.databinding.dq;
import com.zentraedi.business.refresh.PhotoSyncRefreshHeader;
import com.zentraedi.business.utils.g8;
import com.zentraedi.business.widget.MediumTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class d extends c implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i V;

    @androidx.annotation.p0
    private static final SparseIntArray W;

    @androidx.annotation.n0
    private final CoordinatorLayout N;

    @androidx.annotation.n0
    private final LinearLayout O;

    @androidx.annotation.n0
    private final Toolbar P;

    @androidx.annotation.n0
    private final RelativeLayout Q;

    @androidx.annotation.n0
    private final ImageView R;

    @androidx.annotation.n0
    private final FrameLayout S;

    @androidx.annotation.p0
    private final View.OnClickListener T;
    private long U;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(13);
        V = iVar;
        iVar.a(3, new String[]{"common_toolbar"}, new int[]{8}, new int[]{R.layout.I0});
        iVar.a(6, new String[]{"layout_list_empty"}, new int[]{9}, new int[]{R.layout.T7});
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.i3, 10);
        sparseIntArray.put(com.zentraedi.comic.q.i.UA, 11);
        sparseIntArray.put(com.zentraedi.comic.q.i.r8, 12);
    }

    public d(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 13, V, W));
    }

    private boolean F1(dq dqVar, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 8;
        }
        return true;
    }

    private boolean G1(com.zentraedi.business.databinding.e3 e3Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 1;
        }
        return true;
    }

    private boolean I1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 4;
        }
        return true;
    }

    private boolean J1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 2;
        }
        return true;
    }

    private boolean K1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 16;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.c
    public void D1(@androidx.annotation.p0 com.zentraedi.business.viewmodel.m mVar) {
        this.L = mVar;
        synchronized (this) {
            this.U |= 32;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.s4);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.c
    public void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.v vVar) {
        this.M = vVar;
        synchronized (this) {
            this.U |= 64;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.J.O0(p0Var);
        this.G.O0(p0Var);
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        com.zentraedi.comic.viewmodel.v vVar = this.M;
        if (vVar != null) {
            vVar.f0();
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.U != 0) {
                    return true;
                }
                return this.J.g0() || this.G.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.U = 128L;
        }
        this.J.i0();
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
        E1((com.zentraedi.comic.viewmodel.v) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return G1((com.zentraedi.business.databinding.e3) obj, i2);
        }
        if (i == 1) {
            return J1((ObservableField) obj, i2);
        }
        if (i == 2) {
            return I1((ObservableField) obj, i2);
        }
        if (i == 3) {
            return F1((dq) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return K1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:44:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    protected void r() {
        long j;
        String str;
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        ObservableField<Boolean> observableFieldE0;
        boolean zK0;
        long j5;
        androidx.databinding.u showEmpty;
        synchronized (this) {
            j = this.U;
            this.U = 0L;
        }
        com.zentraedi.business.viewmodel.m mVar = this.L;
        com.zentraedi.comic.viewmodel.v vVar = this.M;
        RecyclerView.Adapter adapter = null;
        if ((j & 164) == 0) {
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
        int i3 = 0;
        if ((210 & j) != 0) {
            RecyclerView.Adapter adapterD0 = ((j & 192) == 0 || vVar == null) ? null : vVar.d0();
            long j6 = j & 194;
            if (j6 != 0) {
                if (vVar != null) {
                    showEmpty = vVar.getShowEmpty();
                    j2 = 0;
                } else {
                    j2 = 0;
                    showEmpty = null;
                }
                p1(1, showEmpty);
                boolean zK1 = androidx.databinding.c0.K0(showEmpty != null ? (Boolean) showEmpty.get() : null);
                if (j6 != 0) {
                    j |= zK1 ? 512L : 256L;
                }
                if (!zK1) {
                    i = 8;
                }
                j4 = j & 208;
                if (j4 != j2) {
                    if (vVar != null) {
                        observableFieldE0 = vVar.e0();
                    } else {
                        observableFieldE0 = null;
                    }
                    j3 = 164;
                    p1(4, observableFieldE0);
                    zK0 = androidx.databinding.c0.K0(observableFieldE0 != null ? (Boolean) observableFieldE0.get() : null);
                    if (j4 != j2) {
                        if (zK0) {
                            j5 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                        } else {
                            j5 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                        }
                        j |= j5;
                    }
                    if (!zK0) {
                        i3 = 8;
                    }
                } else {
                    j3 = 164;
                }
                adapter = adapterD0;
                i2 = i3;
            } else {
                j2 = 0;
            }
            i = 0;
            j4 = j & 208;
            if (j4 != j2) {
                if (vVar != null) {
                    observableFieldE0 = vVar.e0();
                } else {
                    observableFieldE0 = null;
                }
                j3 = 164;
                p1(4, observableFieldE0);
                zK0 = androidx.databinding.c0.K0(observableFieldE0 != null ? (Boolean) observableFieldE0.get() : null);
                if (j4 != j2) {
                    if (zK0) {
                        j5 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                    } else {
                        j5 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                    }
                    j |= j5;
                }
                if (!zK0) {
                    i3 = 8;
                }
            } else {
                j3 = 164;
            }
            adapter = adapterD0;
            i2 = i3;
        } else {
            j2 = 0;
            j3 = 164;
            i = 0;
            i2 = 0;
        }
        if ((j & 194) != j2) {
            this.G.getRoot().setVisibility(i);
        }
        if ((128 & j) != j2) {
            androidx.databinding.adapters.j0.o(this.O, g8.a(Float.valueOf(44.0f)));
            this.R.setOnClickListener(this.T);
        }
        if ((j & 208) != j2) {
            this.Q.setVisibility(i2);
        }
        if ((j & 192) != j2) {
            this.I.setAdapter(adapter);
        }
        if ((160 & j) != j2) {
            this.J.C1(mVar);
        }
        if ((j & j3) != j2) {
            androidx.databinding.adapters.f0.A(this.K, str);
        }
        androidx.databinding.c0.t(this.J);
        androidx.databinding.c0.t(this.G);
    }

    private d(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 5, (AppBarLayout) objArr[10], (PhotoSyncRefreshHeader) objArr[12], (dq) objArr[9], (SmartRefreshLayout) objArr[11], (RecyclerView) objArr[7], (com.zentraedi.business.databinding.e3) objArr[8], (MediumTextView) objArr[2]);
        this.U = -1L;
        N0(this.G);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.N = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.O = linearLayout;
        linearLayout.setTag(null);
        Toolbar toolbar = (Toolbar) objArr[3];
        this.P = toolbar;
        toolbar.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[4];
        this.Q = relativeLayout;
        relativeLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[5];
        this.R = imageView;
        imageView.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[6];
        this.S = frameLayout;
        frameLayout.setTag(null);
        this.I.setTag(null);
        N0(this.J);
        this.K.setTag(null);
        P0(view);
        this.T = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
