package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.business.refresh.PhotoSyncRefreshHeader;
import com.zentraedi.business.refresh.ReaderLoadMoreFooter;
import com.zentraedi.comic.viewmodel.d6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class z1 extends y1 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i R;

    @androidx.annotation.p0
    private static final SparseIntArray S;

    @androidx.annotation.n0
    private final LinearLayout K;

    @androidx.annotation.n0
    private final TextView L;

    @androidx.annotation.n0
    private final TextView M;

    @androidx.annotation.n0
    private final RelativeLayout N;

    @androidx.annotation.p0
    private final i3 O;

    @androidx.annotation.n0
    private final LinearLayout P;
    private long Q;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(11);
        R = iVar;
        iVar.a(3, new String[]{"item_comic_search_empty"}, new int[]{6}, new int[]{com.zentraedi.comic.q.l.V7});
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.i8, 7);
        sparseIntArray.put(com.zentraedi.comic.q.i.r8, 8);
        sparseIntArray.put(com.zentraedi.comic.q.i.NS, 9);
        sparseIntArray.put(com.zentraedi.comic.q.i.q8, 10);
    }

    public z1(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 11, R, S));
    }

    private boolean D1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q |= 2;
        }
        return true;
    }

    private boolean E1(ObservableArrayList<Object> observableArrayList, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q |= 16;
        }
        return true;
    }

    private boolean F1(ObservableField<View.OnClickListener> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q |= 8;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q |= 32;
        }
        return true;
    }

    private boolean I1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q |= 4;
        }
        return true;
    }

    private boolean J1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.y1
    public void C1(@androidx.annotation.p0 d6 d6Var) {
        this.J = d6Var;
        synchronized (this) {
            this.Q |= 64;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.O.O0(p0Var);
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.Q != 0) {
                    return true;
                }
                return this.O.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.Q = 128L;
        }
        this.O.i0();
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((d6) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return J1((ObservableBoolean) obj, i2);
        }
        if (i == 1) {
            return D1((ObservableBoolean) obj, i2);
        }
        if (i == 2) {
            return I1((ObservableBoolean) obj, i2);
        }
        if (i == 3) {
            return F1((ObservableField) obj, i2);
        }
        if (i == 4) {
            return E1((ObservableArrayList) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return G1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004d A[PHI: r2
      0x004d: PHI (r2v3 long) = (r2v0 long), (r2v13 long) binds: [B:9:0x0024, B:22:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0 A[PHI: r2
      0x00d0: PHI (r2v7 long) = (r2v6 long), (r2v9 long) binds: [B:55:0x00ac, B:68:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0102  */
    /* JADX WARN: Code duplicated, block: B:87:0x0111  */
    protected void r() {
        long j;
        long j2;
        long j3;
        int i;
        int i2;
        int i3;
        me.tatarka.bindingcollectionadapter2.itembindings.b<Object> itemBinding;
        String str;
        View.OnClickListener onClickListener;
        androidx.databinding.w wVar;
        me.tatarka.bindingcollectionadapter2.e<Object> eVar;
        androidx.databinding.w items;
        me.tatarka.bindingcollectionadapter2.e<Object> adapter;
        int i4;
        long j4;
        int i5;
        ObservableField<String> observableFieldM0;
        ObservableField<View.OnClickListener> observableFieldJ0;
        ObservableBoolean observableBooleanO0;
        boolean z;
        long j5;
        synchronized (this) {
            j = this.Q;
            this.Q = 0L;
        }
        d6 d6Var = this.J;
        if ((255 & j) != 0) {
            long j6 = j & 193;
            if (j6 == 0) {
                i3 = 0;
            } else {
                androidx.databinding.u showLoadingView = d6Var != null ? d6Var.getShowLoadingView() : null;
                p1(0, showLoadingView);
                boolean z2 = showLoadingView != null ? showLoadingView.get() : false;
                if (j6 != 0) {
                    j |= z2 ? 8192L : ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                }
                if (z2) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
            }
            if ((j & 208) != 0) {
                if (d6Var != null) {
                    itemBinding = d6Var.getItemBinding();
                    adapter = d6Var.getAdapter();
                    items = d6Var.getItems();
                } else {
                    items = null;
                    itemBinding = null;
                    adapter = null;
                }
                j2 = 224;
                q1(4, items);
            } else {
                j2 = 224;
                items = null;
                itemBinding = null;
                adapter = null;
            }
            long j7 = j & 194;
            if (j7 != 0) {
                ObservableBoolean observableBooleanU0 = d6Var != null ? d6Var.U0() : null;
                j3 = 200;
                p1(1, observableBooleanU0);
                boolean z3 = observableBooleanU0 != null ? observableBooleanU0.get() : false;
                if (j7 != 0) {
                    j |= z3 ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX : ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                }
                if (!z3) {
                    i4 = 8;
                }
                j4 = j & 196;
                if (j4 == 0) {
                    if (d6Var != null) {
                        observableBooleanO0 = d6Var.O0();
                    } else {
                        observableBooleanO0 = null;
                    }
                    p1(2, observableBooleanO0);
                    if (observableBooleanO0 != null) {
                        z = observableBooleanO0.get();
                    } else {
                        z = false;
                    }
                    if (j4 != 0) {
                        if (z) {
                            j5 = 512;
                        } else {
                            j5 = 256;
                        }
                        j |= j5;
                    }
                    i5 = z ? 0 : 8;
                }
                if ((j & j3) == 0) {
                    onClickListener = null;
                } else {
                    if (d6Var != null) {
                        observableFieldJ0 = d6Var.J0();
                    } else {
                        observableFieldJ0 = null;
                    }
                    p1(3, observableFieldJ0);
                    if (observableFieldJ0 != null) {
                        onClickListener = (View.OnClickListener) observableFieldJ0.get();
                    } else {
                        onClickListener = null;
                    }
                }
                if ((j & j2) == 0) {
                    wVar = items;
                    i2 = i4;
                    i = i5;
                    eVar = adapter;
                    str = null;
                } else {
                    if (d6Var != null) {
                        observableFieldM0 = d6Var.M0();
                    } else {
                        observableFieldM0 = null;
                    }
                    p1(5, observableFieldM0);
                    if (observableFieldM0 != null) {
                        wVar = items;
                        i2 = i4;
                        eVar = adapter;
                        str = (String) observableFieldM0.get();
                        i = i5;
                    } else {
                        wVar = items;
                        i2 = i4;
                        i = i5;
                        eVar = adapter;
                        str = null;
                    }
                }
            } else {
                j3 = 200;
            }
            i4 = 0;
            j4 = j & 196;
            if (j4 == 0) {
                if (d6Var != null) {
                    observableBooleanO0 = d6Var.O0();
                } else {
                    observableBooleanO0 = null;
                }
                p1(2, observableBooleanO0);
                if (observableBooleanO0 != null) {
                    z = observableBooleanO0.get();
                } else {
                    z = false;
                }
                if (j4 != 0) {
                    if (z) {
                        j5 = 512;
                    } else {
                        j5 = 256;
                    }
                    j |= j5;
                }
                if (z) {
                }
            }
            if ((j & j3) == 0) {
                onClickListener = null;
            } else {
                if (d6Var != null) {
                    observableFieldJ0 = d6Var.J0();
                } else {
                    observableFieldJ0 = null;
                }
                p1(3, observableFieldJ0);
                if (observableFieldJ0 != null) {
                    onClickListener = (View.OnClickListener) observableFieldJ0.get();
                } else {
                    onClickListener = null;
                }
            }
            if ((j & j2) == 0) {
                wVar = items;
                i2 = i4;
                i = i5;
                eVar = adapter;
                str = null;
            } else {
                if (d6Var != null) {
                    observableFieldM0 = d6Var.M0();
                } else {
                    observableFieldM0 = null;
                }
                p1(5, observableFieldM0);
                if (observableFieldM0 != null) {
                    wVar = items;
                    i2 = i4;
                    eVar = adapter;
                    str = (String) observableFieldM0.get();
                    i = i5;
                } else {
                    wVar = items;
                    i2 = i4;
                    i = i5;
                    eVar = adapter;
                    str = null;
                }
            }
        } else {
            j2 = 224;
            j3 = 200;
            i = 0;
            i2 = 0;
            i3 = 0;
            itemBinding = null;
            str = null;
            onClickListener = null;
            wVar = null;
            eVar = null;
        }
        if ((j & 208) != 0) {
            me.tatarka.bindingcollectionadapter2.f.a(this.F, me.tatarka.bindingcollectionadapter2.c.c(itemBinding), wVar, eVar, (me.tatarka.bindingcollectionadapter2.e.c) null, (me.tatarka.bindingcollectionadapter2.e.d) null);
        }
        if ((j & j2) != 0) {
            androidx.databinding.adapters.f0.A(this.L, str);
        }
        if ((j & j3) != 0) {
            this.M.setOnClickListener(onClickListener);
        }
        if ((j & 194) != 0) {
            this.M.setVisibility(i2);
        }
        if ((j & 196) != 0) {
            this.O.getRoot().setVisibility(i);
        }
        if ((j & 193) != 0) {
            this.P.setVisibility(i3);
        }
        androidx.databinding.c0.t(this.O);
    }

    private z1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 6, (SmartRefreshLayout) objArr[7], (RecyclerView) objArr[4], (ReaderLoadMoreFooter) objArr[10], (PhotoSyncRefreshHeader) objArr[8], (TextView) objArr[9]);
        this.Q = -1L;
        this.F.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.K = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.L = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.M = textView2;
        textView2.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[3];
        this.N = relativeLayout;
        relativeLayout.setTag(null);
        i3 i3Var = (i3) objArr[6];
        this.O = i3Var;
        N0(i3Var);
        LinearLayout linearLayout2 = (LinearLayout) objArr[5];
        this.P = linearLayout2;
        linearLayout2.setTag(null);
        P0(view);
        i0();
    }
}
