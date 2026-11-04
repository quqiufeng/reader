package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.zentraedi.business.refresh.PhotoSyncRefreshHeader;
import com.zentraedi.business.refresh.ReaderLoadMoreFooter;
import com.zentraedi.business.utils.g8;
import com.zentraedi.business.widget.MediumTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class r1 extends q1 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i V;

    @androidx.annotation.p0
    private static final SparseIntArray W;

    @androidx.annotation.n0
    private final FrameLayout P;

    @androidx.annotation.n0
    private final Space Q;

    @androidx.annotation.n0
    private final FrameLayout R;

    @androidx.annotation.p0
    private final n4 S;

    @androidx.annotation.n0
    private final RelativeLayout T;
    private long U;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(15);
        V = iVar;
        iVar.a(2, new String[]{"layout_comic_home_empty"}, new int[]{9}, new int[]{com.zentraedi.comic.q.l.Z9});
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.uI, 10);
        sparseIntArray.put(com.zentraedi.comic.q.i.WS, 11);
        sparseIntArray.put(com.zentraedi.comic.q.i.r8, 12);
        sparseIntArray.put(com.zentraedi.comic.q.i.q8, 13);
        sparseIntArray.put(com.zentraedi.comic.q.i.YS, 14);
    }

    public r1(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 15, V, W));
    }

    private boolean D1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.U |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.q1
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.b1 b1Var) {
        this.O = b1Var;
        synchronized (this) {
            this.U |= 2;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.S.O0(p0Var);
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.U != 0) {
                    return true;
                }
                return this.S.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.U = 4L;
        }
        this.S.i0();
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.b1) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return D1((ObservableField) obj, i2);
    }

    protected void r() {
        long j;
        int i;
        synchronized (this) {
            j = this.U;
            this.U = 0L;
        }
        com.zentraedi.comic.viewmodel.b1 b1Var = this.O;
        long j2 = j & 7;
        View.OnClickListener leftIconOnClickListener = null;
        int i2 = 0;
        if (j2 != 0) {
            ObservableField<Boolean> observableField = b1Var != null ? b1Var.showEmpty : null;
            p1(0, observableField);
            boolean zK0 = androidx.databinding.c0.K0(observableField != null ? (Boolean) observableField.get() : null);
            if (j2 != 0) {
                j |= zK0 ? 80L : 40L;
            }
            i = zK0 ? 0 : 8;
            i2 = zK0 ? 8 : 0;
            if ((j & 6) != 0 && b1Var != null) {
                leftIconOnClickListener = b1Var.getLeftIconOnClickListener();
            }
        } else {
            i = 0;
        }
        if ((7 & j) != 0) {
            this.E.setVisibility(i2);
            this.F.setVisibility(i2);
            this.I.setVisibility(i2);
            this.K.setVisibility(i2);
            this.S.getRoot().setVisibility(i);
        }
        if ((j & 6) != 0) {
            this.J.setOnClickListener(leftIconOnClickListener);
            this.S.C1(b1Var);
        }
        if ((j & 4) != 0) {
            com.zentraedi.business.viewmodel.h.b(this.Q, g8.a(Float.valueOf(44.0f)));
            com.zentraedi.business.viewmodel.h.b(this.T, g8.a(Float.valueOf(44.0f)));
            androidx.databinding.adapters.j0.o(this.T, g8.h());
        }
        androidx.databinding.c0.t(this.S);
    }

    private r1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, (SmartRefreshLayout) objArr[3], (RecyclerView) objArr[4], (ReaderLoadMoreFooter) objArr[13], (PhotoSyncRefreshHeader) objArr[12], (ImageView) objArr[8], (ImageView) objArr[6], (ImageView) objArr[7], (NestedScrollView) objArr[10], (MediumTextView) objArr[11], (TextView) objArr[14]);
        this.U = -1L;
        this.E.setTag(null);
        this.F.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.P = frameLayout;
        frameLayout.setTag(null);
        Space space = (Space) objArr[1];
        this.Q = space;
        space.setTag(null);
        FrameLayout frameLayout2 = (FrameLayout) objArr[2];
        this.R = frameLayout2;
        frameLayout2.setTag(null);
        n4 n4Var = (n4) objArr[9];
        this.S = n4Var;
        N0(n4Var);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[5];
        this.T = relativeLayout;
        relativeLayout.setTag(null);
        P0(view);
        i0();
    }
}
