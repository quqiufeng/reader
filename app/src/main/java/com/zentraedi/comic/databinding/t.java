package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.zentraedi.business.refresh.PhotoSyncRefreshHeader;
import com.zentraedi.business.refresh.ReaderLoadMoreFooter;
import com.zentraedi.business.utils.g8;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class t extends s {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i U;

    @androidx.annotation.p0
    private static final SparseIntArray V;

    @androidx.annotation.n0
    private final FrameLayout N;

    @androidx.annotation.n0
    private final Space O;

    @androidx.annotation.n0
    private final ImageView P;

    @androidx.annotation.n0
    private final FrameLayout Q;

    @androidx.annotation.p0
    private final i3 R;

    @androidx.annotation.n0
    private final RelativeLayout S;
    private long T;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(14);
        U = iVar;
        iVar.a(4, new String[]{"item_comic_search_empty"}, new int[]{9}, new int[]{com.zentraedi.comic.q.l.V7});
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.uI, 10);
        sparseIntArray.put(com.zentraedi.comic.q.i.r8, 11);
        sparseIntArray.put(com.zentraedi.comic.q.i.q8, 12);
        sparseIntArray.put(com.zentraedi.comic.q.i.Rk, 13);
    }

    public t(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 14, U, V));
    }

    private boolean D1(ObservableArrayList<Object> observableArrayList, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.T |= 2;
        }
        return true;
    }

    private boolean E1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.T |= 4;
        }
        return true;
    }

    private boolean F1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.T |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.s
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.z4 z4Var) {
        this.M = z4Var;
        synchronized (this) {
            this.T |= 8;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.R.O0(p0Var);
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.T != 0) {
                    return true;
                }
                return this.R.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.T = 16L;
        }
        this.R.i0();
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.z4) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return F1((ObservableBoolean) obj, i2);
        }
        if (i == 1) {
            return D1((ObservableArrayList) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return E1((ObservableField) obj, i2);
    }

    protected void r() {
        long j;
        long j2;
        long j3;
        int i;
        me.tatarka.bindingcollectionadapter2.itembindings.b<Object> bVar;
        androidx.databinding.w wVar;
        me.tatarka.bindingcollectionadapter2.e<Object> eVar;
        androidx.databinding.w items;
        me.tatarka.bindingcollectionadapter2.itembindings.b<Object> itemBinding;
        me.tatarka.bindingcollectionadapter2.e<Object> adapter;
        int i2;
        synchronized (this) {
            j = this.T;
            this.T = 0L;
        }
        com.zentraedi.comic.viewmodel.z4 z4Var = this.M;
        int i3 = 0;
        me.tatarka.bindingcollectionadapter2.itembindings.b<Object> bVar2 = null;
        if ((31 & j) != 0) {
            if ((j & 26) != 0) {
                if (z4Var != null) {
                    itemBinding = z4Var.getItemBinding();
                    adapter = z4Var.getAdapter();
                    items = z4Var.getItems();
                    j2 = 0;
                } else {
                    j2 = 0;
                    items = null;
                    itemBinding = null;
                    adapter = null;
                }
                q1(1, items);
            } else {
                j2 = 0;
                items = null;
                itemBinding = null;
                adapter = null;
            }
            long j4 = j & 25;
            if (j4 != j2) {
                androidx.databinding.u uVarO0 = z4Var != null ? z4Var.O0() : null;
                j3 = 28;
                p1(0, uVarO0);
                boolean z = uVarO0 != null ? uVarO0.get() : false;
                if (j4 != j2) {
                    j |= z ? 320L : 160L;
                }
                int i4 = z ? 0 : 8;
                i2 = z ? 8 : 0;
                i3 = i4;
            } else {
                j3 = 28;
                i2 = 0;
            }
            if ((j & j3) != j2) {
                ObservableField<String> observableFieldM0 = z4Var != null ? z4Var.M0() : null;
                p1(2, observableFieldM0);
                if (observableFieldM0 != null) {
                    bVar2 = (String) observableFieldM0.get();
                }
            }
            wVar = items;
            i = i3;
            bVar = bVar2;
            eVar = adapter;
            i3 = i2;
            bVar2 = itemBinding;
        } else {
            j2 = 0;
            j3 = 28;
            i = 0;
            bVar = null;
            wVar = null;
            eVar = null;
        }
        if ((j & 25) != j2) {
            this.E.setVisibility(i3);
            this.P.setVisibility(i3);
            this.R.getRoot().setVisibility(i);
        }
        if ((j & 26) != j2) {
            me.tatarka.bindingcollectionadapter2.f.a(this.F, me.tatarka.bindingcollectionadapter2.c.c(bVar2), wVar, eVar, (me.tatarka.bindingcollectionadapter2.e.c) null, (me.tatarka.bindingcollectionadapter2.e.d) null);
        }
        if ((16 & j) != j2) {
            com.zentraedi.business.viewmodel.h.b(this.O, g8.a(Float.valueOf(44.0f)));
            com.zentraedi.business.viewmodel.h.b(this.S, g8.a(Float.valueOf(44.0f)));
            androidx.databinding.adapters.j0.o(this.S, g8.h());
        }
        if ((j & j3) != j2) {
            androidx.databinding.adapters.f0.A(this.K, bVar);
            androidx.databinding.adapters.f0.A(this.L, bVar);
        }
        androidx.databinding.c0.t(this.R);
    }

    private t(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 3, (SmartRefreshLayout) objArr[5], (RecyclerView) objArr[6], (ReaderLoadMoreFooter) objArr[12], (PhotoSyncRefreshHeader) objArr[11], (ImageView) objArr[13], (NestedScrollView) objArr[10], (TextView) objArr[2], (TextView) objArr[8]);
        this.T = -1L;
        this.E.setTag(null);
        this.F.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.N = frameLayout;
        frameLayout.setTag(null);
        Space space = (Space) objArr[1];
        this.O = space;
        space.setTag(null);
        ImageView imageView = (ImageView) objArr[3];
        this.P = imageView;
        imageView.setTag(null);
        FrameLayout frameLayout2 = (FrameLayout) objArr[4];
        this.Q = frameLayout2;
        frameLayout2.setTag(null);
        i3 i3Var = (i3) objArr[9];
        this.R = i3Var;
        N0(i3Var);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[7];
        this.S = relativeLayout;
        relativeLayout.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        P0(view);
        i0();
    }
}
