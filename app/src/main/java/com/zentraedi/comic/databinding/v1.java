package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.zentraedi.business.refresh.PhotoSyncRefreshHeader;
import com.zentraedi.business.refresh.ReaderLoadMoreFooter;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class v1 extends u1 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i L = null;

    @androidx.annotation.p0
    private static final SparseIntArray M;

    @androidx.annotation.n0
    private final RelativeLayout J;
    private long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.i8, 1);
        sparseIntArray.put(com.zentraedi.comic.q.i.r8, 2);
        sparseIntArray.put(com.zentraedi.comic.q.i.KD, 3);
        sparseIntArray.put(com.zentraedi.comic.q.i.q8, 4);
    }

    public v1(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 5, L, M));
    }

    @Override // com.zentraedi.comic.databinding.u1
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.c3 c3Var) {
        this.I = c3Var;
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
            this.K = 2L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.G2 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.c3) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        return false;
    }

    protected void r() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    private v1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (SmartRefreshLayout) objArr[1], (ReaderLoadMoreFooter) objArr[4], (PhotoSyncRefreshHeader) objArr[2], (RecyclerView) objArr[3]);
        this.K = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.J = relativeLayout;
        relativeLayout.setTag(null);
        P0(view);
        i0();
    }
}
