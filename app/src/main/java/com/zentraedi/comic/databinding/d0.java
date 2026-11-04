package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ObservableField;
import com.google.android.material.appbar.AppBarLayout;
import com.zentraedi.business.utils.g8;
import com.zentraedi.business.widget.MediumTextView;
import com.zentraedi.comic.viewmodel.ComicReaderSetViewModel;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class d0 extends c0 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i Y = null;

    @androidx.annotation.p0
    private static final SparseIntArray Z;

    @androidx.annotation.n0
    private final CoordinatorLayout N;

    @androidx.annotation.n0
    private final LinearLayout O;

    @androidx.annotation.n0
    private final RelativeLayout P;

    @androidx.annotation.n0
    private final RelativeLayout Q;

    @androidx.annotation.n0
    private final TextView R;

    @androidx.annotation.n0
    private final RelativeLayout S;

    @androidx.annotation.n0
    private final TextView T;

    @androidx.annotation.p0
    private final View.OnClickListener U;

    @androidx.annotation.p0
    private final View.OnClickListener V;
    private androidx.databinding.o W;
    private long X;

    class a implements androidx.databinding.o {
        a() {
        }

        public void a() {
            ObservableField<Boolean> observableFieldU;
            boolean zIsChecked = d0.this.J.isChecked();
            ComicReaderSetViewModel comicReaderSetViewModel = d0.this.M;
            if (comicReaderSetViewModel == null || (observableFieldU = comicReaderSetViewModel.U()) == null) {
                return;
            }
            observableFieldU.set(Boolean.valueOf(zIsChecked));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.i3, 9);
        sparseIntArray.put(com.zentraedi.comic.q.i.IQ, 10);
        sparseIntArray.put(com.zentraedi.comic.q.i.YS, 11);
        sparseIntArray.put(com.zentraedi.comic.q.i.Ll, 12);
        sparseIntArray.put(com.zentraedi.comic.q.i.Uk, 13);
        sparseIntArray.put(com.zentraedi.comic.q.i.K2, 14);
    }

    public d0(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 15, Y, Z));
    }

    private boolean D1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 4;
        }
        return true;
    }

    private boolean E1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 1;
        }
        return true;
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 2;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.c0
    public void C1(@androidx.annotation.p0 ComicReaderSetViewModel comicReaderSetViewModel) {
        this.M = comicReaderSetViewModel;
        synchronized (this) {
            this.X |= 8;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        ComicReaderSetViewModel comicReaderSetViewModel;
        if (i != 1) {
            if (i == 2 && (comicReaderSetViewModel = this.M) != null) {
                comicReaderSetViewModel.P(view);
                return;
            }
            return;
        }
        ComicReaderSetViewModel comicReaderSetViewModel2 = this.M;
        if (comicReaderSetViewModel2 != null) {
            comicReaderSetViewModel2.O(view);
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.X != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.X = 16L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((ComicReaderSetViewModel) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return E1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return F1((ObservableField) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return D1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    protected void r() {
        long j;
        long j2;
        View.OnClickListener leftIconOnClickListener;
        String str;
        String str2;
        ObservableField<Boolean> observableFieldU;
        Boolean bool;
        synchronized (this) {
            j = this.X;
            this.X = 0L;
        }
        ComicReaderSetViewModel comicReaderSetViewModel = this.M;
        boolean zK0 = false;
        if ((31 & j) != 0) {
            if ((j & 25) == 0) {
                str = null;
            } else {
                ObservableField<String> observableFieldV = comicReaderSetViewModel != null ? comicReaderSetViewModel.V() : null;
                p1(0, observableFieldV);
                if (observableFieldV != null) {
                    str = (String) observableFieldV.get();
                } else {
                    str = null;
                }
            }
            if ((j & 26) != 0) {
                ObservableField<String> observableFieldX = comicReaderSetViewModel != null ? comicReaderSetViewModel.X() : null;
                j2 = 24;
                p1(1, observableFieldX);
                if (observableFieldX != null) {
                    str2 = (String) observableFieldX.get();
                }
                if ((j & 28) != 0) {
                    if (comicReaderSetViewModel != null) {
                        observableFieldU = comicReaderSetViewModel.U();
                    } else {
                        observableFieldU = null;
                    }
                    p1(2, observableFieldU);
                    if (observableFieldU != null) {
                        bool = (Boolean) observableFieldU.get();
                    } else {
                        bool = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool);
                }
                if ((j & j2) != 0 || comicReaderSetViewModel == null) {
                    leftIconOnClickListener = null;
                } else {
                    leftIconOnClickListener = comicReaderSetViewModel.getLeftIconOnClickListener();
                }
            } else {
                j2 = 24;
            }
            str2 = null;
            if ((j & 28) != 0) {
                if (comicReaderSetViewModel != null) {
                    observableFieldU = comicReaderSetViewModel.U();
                } else {
                    observableFieldU = null;
                }
                p1(2, observableFieldU);
                if (observableFieldU != null) {
                    bool = (Boolean) observableFieldU.get();
                } else {
                    bool = null;
                }
                zK0 = androidx.databinding.c0.K0(bool);
            }
            if ((j & j2) != 0) {
                leftIconOnClickListener = null;
            } else {
                leftIconOnClickListener = null;
            }
        } else {
            j2 = 24;
            leftIconOnClickListener = null;
            str = null;
            str2 = null;
        }
        if ((j & j2) != 0) {
            this.G.setOnClickListener(leftIconOnClickListener);
        }
        if ((16 & j) != 0) {
            com.zentraedi.business.utils.u.b0(this.O, g8.a(Float.valueOf(44.0f)));
            com.zentraedi.business.viewmodel.h.b(this.P, g8.a(Float.valueOf(44.0f)));
            androidx.databinding.adapters.j0.o(this.P, g8.h());
            this.Q.setOnClickListener(this.U);
            this.S.setOnClickListener(this.V);
            androidx.databinding.adapters.k.b(this.J, (CompoundButton.OnCheckedChangeListener) null, this.W);
        }
        if ((j & 26) != 0) {
            androidx.databinding.adapters.f0.A(this.R, str2);
        }
        if ((j & 25) != 0) {
            androidx.databinding.adapters.f0.A(this.T, str);
        }
        if ((j & 28) != 0) {
            androidx.databinding.adapters.k.a(this.J, zK0);
        }
    }

    private d0(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 3, (TextView) objArr[14], (AppBarLayout) objArr[9], (ImageView) objArr[3], (ImageView) objArr[13], (ImageView) objArr[12], (Switch) objArr[8], (MediumTextView) objArr[10], (TextView) objArr[11]);
        this.W = new a();
        this.X = -1L;
        this.G.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.N = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.O = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[2];
        this.P = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[4];
        this.Q = relativeLayout2;
        relativeLayout2.setTag(null);
        TextView textView = (TextView) objArr[5];
        this.R = textView;
        textView.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[6];
        this.S = relativeLayout3;
        relativeLayout3.setTag(null);
        TextView textView2 = (TextView) objArr[7];
        this.T = textView2;
        textView2.setTag(null);
        this.J.setTag(null);
        P0(view);
        this.U = new com.zentraedi.comic.generated.callback.b(this, 1);
        this.V = new com.zentraedi.comic.generated.callback.b(this, 2);
        i0();
    }
}
