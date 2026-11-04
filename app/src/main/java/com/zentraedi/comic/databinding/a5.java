package com.zentraedi.comic.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.business.utils.g8;
import com.zentraedi.comic.viewmodel.ComicReaderViewModel;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class a5 extends z4 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i O = null;

    @androidx.annotation.p0
    private static final SparseIntArray P = null;

    @androidx.annotation.n0
    private final RelativeLayout I;

    @androidx.annotation.n0
    private final ImageView J;

    @androidx.annotation.p0
    private final View.OnClickListener K;

    @androidx.annotation.p0
    private final View.OnClickListener L;

    @androidx.annotation.p0
    private final View.OnClickListener M;
    private long N;

    public a5(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 5, O, P));
    }

    private boolean D1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.N |= 2;
        }
        return true;
    }

    private boolean E1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.N |= 8;
        }
        return true;
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.N |= 4;
        }
        return true;
    }

    private boolean G1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.N |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.z4
    public void C1(@androidx.annotation.p0 ComicReaderViewModel comicReaderViewModel) {
        this.H = comicReaderViewModel;
        synchronized (this) {
            this.N |= 16;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        ComicReaderViewModel comicReaderViewModel;
        if (i == 1) {
            ComicReaderViewModel comicReaderViewModel2 = this.H;
            if (comicReaderViewModel2 != null) {
                comicReaderViewModel2.L0();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (comicReaderViewModel = this.H) != null) {
                comicReaderViewModel.I0();
                return;
            }
            return;
        }
        ComicReaderViewModel comicReaderViewModel3 = this.H;
        if (comicReaderViewModel3 != null) {
            comicReaderViewModel3.H0();
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.N = 32L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((ComicReaderViewModel) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return G1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return D1((ObservableField) obj, i2);
        }
        if (i == 2) {
            return F1((ObservableField) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return E1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    protected void r() {
        long j;
        long j2;
        Drawable drawable;
        Drawable drawableB;
        String str;
        Context context;
        int i;
        androidx.databinding.u uVarQ1;
        synchronized (this) {
            j = this.N;
            this.N = 0L;
        }
        ComicReaderViewModel comicReaderViewModel = this.H;
        long j3 = 56;
        int i2 = 0;
        Drawable drawableB2 = null;
        if ((63 & j) != 0) {
            long j4 = j & 49;
            if (j4 != 0) {
                if (comicReaderViewModel != null) {
                    uVarQ1 = comicReaderViewModel.q1();
                    j2 = 0;
                } else {
                    j2 = 0;
                    uVarQ1 = null;
                }
                p1(0, uVarQ1);
                boolean zK0 = androidx.databinding.c0.K0(uVarQ1 != null ? (Boolean) uVarQ1.get() : null);
                if (j4 != 0) {
                    j |= zK0 ? 128L : 64L;
                }
                if (zK0) {
                    i2 = 8;
                }
            } else {
                j2 = 0;
            }
            long j5 = j & 50;
            if (j5 != j2) {
                ObservableField<Boolean> observableFieldO0 = comicReaderViewModel != null ? comicReaderViewModel.O0() : null;
                p1(1, observableFieldO0);
                boolean zK1 = androidx.databinding.c0.K0(observableFieldO0 != null ? (Boolean) observableFieldO0.get() : null);
                if (j5 != j2) {
                    j |= zK1 ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX : ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                }
                drawableB = g.a.b(this.F.getContext(), zK1 ? com.zentraedi.comic.q.h.f469fg : com.zentraedi.comic.q.h.f467eg);
            } else {
                drawableB = null;
            }
            if ((j & 52) == j2) {
                str = null;
            } else {
                ObservableField<String> observableFieldT = comicReaderViewModel != null ? comicReaderViewModel.T() : null;
                p1(2, observableFieldT);
                if (observableFieldT != null) {
                    str = (String) observableFieldT.get();
                } else {
                    str = null;
                }
            }
            long j6 = j & 56;
            if (j6 != j2) {
                ObservableField<Boolean> observableFieldQ0 = comicReaderViewModel != null ? comicReaderViewModel.Q0() : null;
                p1(3, observableFieldQ0);
                boolean zK2 = androidx.databinding.c0.K0(observableFieldQ0 != null ? (Boolean) observableFieldQ0.get() : null);
                if (j6 != j2) {
                    j |= zK2 ? 512L : 256L;
                }
                if (zK2) {
                    context = this.J.getContext();
                    i = com.zentraedi.comic.q.h.dg;
                } else {
                    context = this.J.getContext();
                    i = com.zentraedi.comic.q.h.cg;
                }
                drawableB2 = g.a.b(context, i);
            }
            drawable = drawableB2;
        } else {
            j2 = 0;
            j3 = 56;
            drawable = null;
            drawableB = null;
            str = null;
        }
        if ((32 & j) != j2) {
            this.E.setOnClickListener(this.M);
            this.F.setOnClickListener(this.L);
            com.zentraedi.business.viewmodel.h.b(this.I, g8.h() + com.zentraedi.basic.function.utils.m0.b(44.0f));
            androidx.databinding.adapters.j0.o(this.I, g8.h());
            this.J.setOnClickListener(this.K);
        }
        if ((j & 50) != j2) {
            androidx.databinding.adapters.p.a(this.F, drawableB);
        }
        if ((j & 49) != j2) {
            this.F.setVisibility(i2);
            this.J.setVisibility(i2);
        }
        if ((j & j3) != j2) {
            androidx.databinding.adapters.p.a(this.J, drawable);
        }
        if ((j & 52) != j2) {
            androidx.databinding.adapters.f0.A(this.G, str);
        }
    }

    private a5(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 4, (ImageView) objArr[1], (ImageView) objArr[4], (TextView) objArr[2]);
        this.N = -1L;
        this.E.setTag(null);
        this.F.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.I = relativeLayout;
        relativeLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[3];
        this.J = imageView;
        imageView.setTag(null);
        this.G.setTag(null);
        P0(view);
        this.K = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.L = new com.zentraedi.comic.generated.callback.b(this, 3);
        this.M = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
