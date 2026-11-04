package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class l2 extends k2 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i L = null;

    @androidx.annotation.p0
    private static final SparseIntArray M;

    @androidx.annotation.n0
    private final LinearLayout I;

    @androidx.annotation.n0
    private final TextView J;
    private long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.Nc, 4);
    }

    public l2(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 5, L, M));
    }

    private boolean D1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.K |= 2;
        }
        return true;
    }

    private boolean E1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.k2
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.j0 j0Var) {
        this.H = j0Var;
        synchronized (this) {
            this.K |= 4;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.G1);
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
            this.K = 8L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.G1 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.j0) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return E1((ObservableField) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return D1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    protected void r() {
        long j;
        View.OnClickListener onClickListenerN;
        String str;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        com.zentraedi.comic.viewmodel.j0 j0Var = this.H;
        String str2 = null;
        if ((15 & j) != 0) {
            onClickListenerN = ((j & 12) == 0 || j0Var == null) ? null : j0Var.N();
            if ((j & 13) == 0) {
                str = null;
            } else {
                ObservableField<String> filePath = j0Var != null ? j0Var.getFilePath() : null;
                p1(0, filePath);
                if (filePath != null) {
                    str = (String) filePath.get();
                } else {
                    str = null;
                }
            }
            if ((j & 14) != 0) {
                ObservableField<String> fileName = j0Var != null ? j0Var.getFileName() : null;
                p1(1, fileName);
                if (fileName != null) {
                    str2 = (String) fileName.get();
                }
            }
        } else {
            onClickListenerN = null;
            str = null;
        }
        if ((14 & j) != 0) {
            androidx.databinding.adapters.f0.A(this.F, str2);
        }
        if ((j & 13) != 0) {
            androidx.databinding.adapters.f0.A(this.G, str);
        }
        if ((j & 12) != 0) {
            this.J.setOnClickListener(onClickListenerN);
        }
    }

    private l2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 2, (ImageView) objArr[4], (TextView) objArr[1], (TextView) objArr[2]);
        this.K = -1L;
        this.F.setTag(null);
        this.G.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.I = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.J = textView;
        textView.setTag(null);
        P0(view);
        i0();
    }
}
