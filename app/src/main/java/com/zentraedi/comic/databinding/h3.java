package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.zentraedi.comic.viewmodel.m6;
import com.zentraedi.reader.pdf.MuPdfPageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class h3 extends g3 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i I = null;

    @androidx.annotation.p0
    private static final SparseIntArray J;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.nw, 1);
    }

    public h3(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 2, I, J));
    }

    private boolean D1(m6 m6Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.H |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.g3
    public void C1(@androidx.annotation.p0 m6 m6Var) {
        this.G = m6Var;
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.H = 2L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((m6) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return D1((m6) obj, i2);
    }

    protected void r() {
        synchronized (this) {
            this.H = 0L;
        }
    }

    private h3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, (LinearLayout) objArr[0], (MuPdfPageView) objArr[1]);
        this.H = -1L;
        this.E.setTag(null);
        P0(view);
        i0();
    }
}
