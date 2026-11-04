package com.zentraedi.comic.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.zentraedi.business.utils.g8;
import com.zentraedi.business.widget.MediumTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class f extends e implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i h0;

    @androidx.annotation.p0
    private static final SparseIntArray i0;

    @androidx.annotation.n0
    private final FrameLayout S;

    @androidx.annotation.n0
    private final LinearLayout T;

    @androidx.annotation.n0
    private final View U;

    @androidx.annotation.n0
    private final LinearLayout V;

    @androidx.annotation.p0
    private final d4 W;

    @androidx.annotation.n0
    private final RelativeLayout X;

    @androidx.annotation.n0
    private final TextView Y;

    @androidx.annotation.n0
    private final RelativeLayout Z;

    @androidx.annotation.n0
    private final RelativeLayout a0;

    @androidx.annotation.p0
    private final View.OnClickListener b0;

    @androidx.annotation.p0
    private final View.OnClickListener c0;

    @androidx.annotation.p0
    private final View.OnClickListener d0;

    @androidx.annotation.p0
    private final View.OnClickListener e0;

    @androidx.annotation.p0
    private final View.OnClickListener f0;
    private long g0;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(22);
        h0 = iVar;
        iVar.a(11, new String[]{"layout_comic_code_book_empty"}, new int[]{18}, new int[]{com.zentraedi.comic.q.l.U9});
        SparseIntArray sparseIntArray = new SparseIntArray();
        i0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.i3, 19);
        sparseIntArray.put(com.zentraedi.comic.q.i.IQ, 20);
        sparseIntArray.put(com.zentraedi.comic.q.i.YS, 21);
    }

    public f(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 22, h0, i0));
    }

    private boolean D1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.g0 |= 8;
        }
        return true;
    }

    private boolean E1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.g0 |= 2;
        }
        return true;
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.g0 |= 32;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.g0 |= 1;
        }
        return true;
    }

    private boolean I1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.g0 |= 4;
        }
        return true;
    }

    private boolean J1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.g0 |= 16;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.e
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.h0 h0Var) {
        this.R = h0Var;
        synchronized (this) {
            this.g0 |= 64;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.W.O0(p0Var);
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        com.zentraedi.comic.viewmodel.h0 h0Var;
        if (i == 1) {
            com.zentraedi.comic.viewmodel.h0 h0Var2 = this.R;
            if (h0Var2 != null) {
                h0Var2.M0();
                return;
            }
            return;
        }
        if (i == 2) {
            com.zentraedi.comic.viewmodel.h0 h0Var3 = this.R;
            if (h0Var3 != null) {
                h0Var3.N0();
                return;
            }
            return;
        }
        if (i == 3) {
            com.zentraedi.comic.viewmodel.h0 h0Var4 = this.R;
            if (h0Var4 != null) {
                h0Var4.L0();
                return;
            }
            return;
        }
        if (i != 4) {
            if (i == 5 && (h0Var = this.R) != null) {
                h0Var.R0(getRoot().getContext());
                return;
            }
            return;
        }
        com.zentraedi.comic.viewmodel.h0 h0Var5 = this.R;
        if (h0Var5 != null) {
            h0Var5.J0();
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.g0 != 0) {
                    return true;
                }
                return this.W.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.g0 = 128L;
        }
        this.W.i0();
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.h0) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return G1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return E1((ObservableField) obj, i2);
        }
        if (i == 2) {
            return I1((ObservableField) obj, i2);
        }
        if (i == 3) {
            return D1((ObservableField) obj, i2);
        }
        if (i == 4) {
            return J1((ObservableField) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return F1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0147  */
    /* JADX WARN: Code duplicated, block: B:101:0x014c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:106:0x0167  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00de  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:78:0x0107  */
    /* JADX WARN: Code duplicated, block: B:81:0x0110  */
    /* JADX WARN: Code duplicated, block: B:82:0x0117  */
    /* JADX WARN: Code duplicated, block: B:85:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0120  */
    /* JADX WARN: Code duplicated, block: B:88:0x0126  */
    /* JADX WARN: Code duplicated, block: B:90:0x012b  */
    /* JADX WARN: Code duplicated, block: B:91:0x012d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0131  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134  */
    /* JADX WARN: Code duplicated, block: B:96:0x0139  */
    /* JADX WARN: Code duplicated, block: B:99:0x0145 A[DONT_INVERT] */
    protected void r() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        Drawable drawable;
        View.OnClickListener leftIconOnClickListener;
        String str;
        String str2;
        String str3;
        String str4;
        boolean zK0;
        Drawable drawableB;
        long j6;
        int i5;
        int i6;
        ObservableField<String> observableFieldX0;
        androidx.databinding.u uVarZ0;
        Boolean bool;
        boolean zK1;
        int i7;
        long j7;
        ObservableField<String> observableFieldS0;
        Context context;
        int i8;
        synchronized (this) {
            j = this.g0;
            this.g0 = 0L;
        }
        com.zentraedi.comic.viewmodel.h0 h0Var = this.R;
        if ((255 & j) != 0) {
            if ((j & 193) == 0) {
                str4 = null;
            } else {
                ObservableField<String> observableFieldY0 = h0Var != null ? h0Var.Y0() : null;
                p1(0, observableFieldY0);
                if (observableFieldY0 != null) {
                    str4 = (String) observableFieldY0.get();
                } else {
                    str4 = null;
                }
            }
            long j8 = j & 194;
            if (j8 != 0) {
                androidx.databinding.u uVarT0 = h0Var != null ? h0Var.T0() : null;
                p1(1, uVarT0);
                zK0 = androidx.databinding.c0.K0(uVarT0 != null ? (Boolean) uVarT0.get() : null);
                if (j8 != 0) {
                    j |= zK0 ? 131072L : 65536L;
                }
                if (zK0) {
                    context = this.G.getContext();
                    j3 = 224;
                    i8 = com.zentraedi.comic.q.h.ap;
                } else {
                    j3 = 224;
                    context = this.G.getContext();
                    i8 = com.zentraedi.comic.q.h.Zo;
                }
                drawableB = g.a.b(context, i8);
            } else {
                j3 = 224;
                zK0 = false;
                drawableB = null;
            }
            long j9 = j & 196;
            if (j9 != 0) {
                androidx.databinding.u showEmpty = h0Var != null ? h0Var.getShowEmpty() : null;
                j4 = 208;
                p1(2, showEmpty);
                boolean zK2 = androidx.databinding.c0.K0(showEmpty != null ? (Boolean) showEmpty.get() : null);
                if (j9 != 0) {
                    j |= zK2 ? 10240L : 5120L;
                }
                i3 = zK2 ? 0 : 8;
                int i9 = zK2 ? 8 : 0;
                if ((j & 200) == 0) {
                    str2 = null;
                } else {
                    if (h0Var != null) {
                        observableFieldS0 = h0Var.S0();
                    } else {
                        observableFieldS0 = null;
                    }
                    p1(3, observableFieldS0);
                    if (observableFieldS0 != null) {
                        str2 = (String) observableFieldS0.get();
                    } else {
                        str2 = null;
                    }
                }
                if ((j & 192) != 0 || h0Var == null) {
                    leftIconOnClickListener = null;
                } else {
                    leftIconOnClickListener = h0Var.getLeftIconOnClickListener();
                }
                j6 = j & j4;
                if (j6 != 0) {
                    if (h0Var != null) {
                        uVarZ0 = h0Var.Z0();
                        j2 = 192;
                    } else {
                        j2 = 192;
                        uVarZ0 = null;
                    }
                    p1(4, uVarZ0);
                    if (uVarZ0 != null) {
                        bool = (Boolean) uVarZ0.get();
                    } else {
                        bool = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool);
                    if (j6 != 0) {
                        if (zK1) {
                            j7 = 33280;
                        } else {
                            j7 = 16640;
                        }
                        j |= j7;
                    }
                    if (zK1) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    if (zK1) {
                        i5 = 8;
                    } else {
                        i5 = 0;
                    }
                    i6 = i7;
                } else {
                    j2 = 192;
                    i5 = 0;
                    i6 = 0;
                }
                if ((j & j3) == 0) {
                    str = null;
                } else {
                    if (h0Var != null) {
                        observableFieldX0 = h0Var.X0();
                    } else {
                        observableFieldX0 = null;
                    }
                    p1(5, observableFieldX0);
                    if (observableFieldX0 != null) {
                        str = (String) observableFieldX0.get();
                    } else {
                        str = null;
                    }
                }
                drawable = drawableB;
                z = zK0;
                i = i9;
                i4 = i5;
                str3 = str4;
                i2 = i6;
                j5 = 200;
            } else {
                j4 = 208;
                i3 = 0;
            }
            if ((j & 200) == 0) {
                str2 = null;
            } else {
                if (h0Var != null) {
                    observableFieldS0 = h0Var.S0();
                } else {
                    observableFieldS0 = null;
                }
                p1(3, observableFieldS0);
                if (observableFieldS0 != null) {
                    str2 = (String) observableFieldS0.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 192) != 0) {
                leftIconOnClickListener = null;
            } else {
                leftIconOnClickListener = null;
            }
            j6 = j & j4;
            if (j6 != 0) {
                if (h0Var != null) {
                    uVarZ0 = h0Var.Z0();
                    j2 = 192;
                } else {
                    j2 = 192;
                    uVarZ0 = null;
                }
                p1(4, uVarZ0);
                if (uVarZ0 != null) {
                    bool = (Boolean) uVarZ0.get();
                } else {
                    bool = null;
                }
                zK1 = androidx.databinding.c0.K0(bool);
                if (j6 != 0) {
                    if (zK1) {
                        j7 = 33280;
                    } else {
                        j7 = 16640;
                    }
                    j |= j7;
                }
                if (zK1) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                if (zK1) {
                    i5 = 8;
                } else {
                    i5 = 0;
                }
                i6 = i7;
            } else {
                j2 = 192;
                i5 = 0;
                i6 = 0;
            }
            if ((j & j3) == 0) {
                str = null;
            } else {
                if (h0Var != null) {
                    observableFieldX0 = h0Var.X0();
                } else {
                    observableFieldX0 = null;
                }
                p1(5, observableFieldX0);
                if (observableFieldX0 != null) {
                    str = (String) observableFieldX0.get();
                } else {
                    str = null;
                }
            }
            drawable = drawableB;
            z = zK0;
            i = i9;
            i4 = i5;
            str3 = str4;
            i2 = i6;
            j5 = 200;
        } else {
            j2 = 192;
            j3 = 224;
            j4 = 208;
            j5 = 200;
            i = 0;
            z = false;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            drawable = null;
            leftIconOnClickListener = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        if ((196 & j) != 0) {
            this.F.setVisibility(i);
            this.I.setVisibility(i);
            this.U.setVisibility(i);
            this.W.getRoot().setVisibility(i3);
            this.X.setVisibility(i);
        }
        if ((j & 194) != 0) {
            androidx.databinding.adapters.p.a(this.G, drawable);
            this.M.setEnabled(z);
        }
        if ((j & j2) != 0) {
            this.H.setOnClickListener(leftIconOnClickListener);
            this.W.C1(h0Var);
        }
        if ((128 & j) != 0) {
            this.I.setOnClickListener(this.b0);
            this.J.setOnClickListener(this.e0);
            com.zentraedi.business.utils.u.b0(this.T, g8.a(Float.valueOf(44.0f)));
            this.Y.setOnClickListener(this.f0);
            com.zentraedi.business.viewmodel.h.b(this.Z, g8.a(Float.valueOf(44.0f)));
            androidx.databinding.adapters.j0.o(this.Z, g8.h());
            com.zentraedi.business.viewmodel.h.b(this.a0, g8.a(Float.valueOf(44.0f)));
            androidx.databinding.adapters.j0.o(this.a0, g8.h());
            this.K.setOnClickListener(this.d0);
            this.L.setOnClickListener(this.c0);
        }
        if ((j & j4) != 0) {
            this.J.setVisibility(i2);
            this.T.setVisibility(i4);
            this.Z.setVisibility(i4);
            this.a0.setVisibility(i2);
        }
        if ((j & j3) != 0) {
            androidx.databinding.adapters.f0.A(this.L, str);
        }
        if ((j & j5) != 0) {
            androidx.databinding.adapters.f0.A(this.O, str2);
        }
        if ((j & 193) != 0) {
            androidx.databinding.adapters.f0.A(this.P, str3);
        }
        androidx.databinding.c0.t(this.W);
    }

    private f(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 6, (AppBarLayout) objArr[19], (RecyclerView) objArr[12], (ImageView) objArr[16], (ImageView) objArr[3], (ImageView) objArr[4], (LinearLayout) objArr[15], (TextView) objArr[9], (TextView) objArr[6], (TextView) objArr[17], (MediumTextView) objArr[20], (TextView) objArr[8], (TextView) objArr[7], (TextView) objArr[21]);
        this.g0 = -1L;
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.S = frameLayout;
        frameLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.T = linearLayout;
        linearLayout.setTag(null);
        View view2 = (View) objArr[10];
        this.U = view2;
        view2.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[11];
        this.V = linearLayout2;
        linearLayout2.setTag(null);
        d4 d4Var = (d4) objArr[18];
        this.W = d4Var;
        N0(d4Var);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[13];
        this.X = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[14];
        this.Y = textView;
        textView.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[2];
        this.Z = relativeLayout2;
        relativeLayout2.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[5];
        this.a0 = relativeLayout3;
        relativeLayout3.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        P0(view);
        this.b0 = new com.zentraedi.comic.generated.callback.b(this, 1);
        this.c0 = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.d0 = new com.zentraedi.comic.generated.callback.b(this, 3);
        this.e0 = new com.zentraedi.comic.generated.callback.b(this, 5);
        this.f0 = new com.zentraedi.comic.generated.callback.b(this, 4);
        i0();
    }
}
