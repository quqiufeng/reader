package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ObservableArrayList;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.zentraedi.business.refresh.PhotoSyncRefreshHeader;
import com.zentraedi.business.refresh.ReaderLoadMoreFooter;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class t1 extends s1 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i L = null;

    @androidx.annotation.p0
    private static final SparseIntArray M;

    @androidx.annotation.n0
    private final FrameLayout J;
    private long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.UA, 2);
        sparseIntArray.put(com.zentraedi.comic.q.i.r8, 3);
        sparseIntArray.put(com.zentraedi.comic.q.i.q8, 4);
    }

    public t1(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 5, L, M));
    }

    private boolean D1(ObservableArrayList<Object> observableArrayList, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.s1
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.k2 k2Var) {
        this.I = k2Var;
        synchronized (this) {
            this.K |= 2;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.K = 4L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.k2) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return D1((ObservableArrayList) obj, i2);
    }

    protected void r() {
        long j;
        androidx.databinding.w wVar;
        me.tatarka.bindingcollectionadapter2.e<Object> eVar;
        me.tatarka.bindingcollectionadapter2.e<Object> eVar2;
        androidx.databinding.w wVar2;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        com.zentraedi.comic.viewmodel.k2 k2Var = this.I;
        long j2 = j & 7;
        androidx.databinding.w items = null;
        if (j2 != 0) {
            if (k2Var != null) {
                me.tatarka.bindingcollectionadapter2.e<Object> adapter = k2Var.getAdapter();
                androidx.databinding.w itemBinding = k2Var.getItemBinding();
                eVar2 = adapter;
                items = k2Var.getItems();
                wVar2 = itemBinding;
            } else {
                eVar2 = null;
                wVar2 = null;
            }
            q1(0, items);
            wVar = items;
            eVar = eVar2;
            items = wVar2;
        } else {
            wVar = null;
            eVar = null;
        }
        if (j2 != 0) {
            me.tatarka.bindingcollectionadapter2.f.a(this.G, me.tatarka.bindingcollectionadapter2.c.c(items), wVar, eVar, (me.tatarka.bindingcollectionadapter2.e.c) null, (me.tatarka.bindingcollectionadapter2.e.d) null);
        }
    }

    private t1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, (ReaderLoadMoreFooter) objArr[4], (PhotoSyncRefreshHeader) objArr[3], (RecyclerView) objArr[1], (SmartRefreshLayout) objArr[2]);
        this.K = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.J = frameLayout;
        frameLayout.setTag(null);
        this.G.setTag(null);
        P0(view);
        i0();
    }
}
