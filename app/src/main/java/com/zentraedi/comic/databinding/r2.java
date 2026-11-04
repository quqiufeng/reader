package com.zentraedi.comic.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableField;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.business.model.ComicInfoModel;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class r2 extends q2 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i T = null;

    @androidx.annotation.p0
    private static final SparseIntArray U;

    @androidx.annotation.n0
    private final ConstraintLayout I;

    @androidx.annotation.n0
    private final ImageView J;

    @androidx.annotation.n0
    private final ImageView K;

    @androidx.annotation.n0
    private final ImageView L;

    @androidx.annotation.n0
    private final ImageView M;

    @androidx.annotation.n0
    private final ProgressBar N;

    @androidx.annotation.n0
    private final TextView O;

    @androidx.annotation.n0
    private final ImageView P;

    @androidx.annotation.p0
    private final View.OnClickListener Q;

    @androidx.annotation.p0
    private final View.OnClickListener R;
    private long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.Qn, 8);
    }

    public r2(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 9, T, U));
    }

    private boolean I1(ObservableField<Integer> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.S |= 1;
        }
        return true;
    }

    private boolean J1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.S |= 8;
        }
        return true;
    }

    private boolean K1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.S |= 16;
        }
        return true;
    }

    private boolean L1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.S |= 4;
        }
        return true;
    }

    private boolean N1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.S |= 2;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.q2
    public void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.k2.a aVar) {
        this.F = aVar;
        synchronized (this) {
            this.S |= 32;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.I);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.q2
    public void F1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.k2.a aVar) {
        this.G = aVar;
        synchronized (this) {
            this.S |= 64;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.m2);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.q2
    public void G1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.l0 l0Var) {
        this.H = l0Var;
        synchronized (this) {
            this.S |= 128;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        if (i == 1) {
            com.zentraedi.comic.viewmodel.k2.a aVar = this.F;
            com.zentraedi.comic.viewmodel.l0 l0Var = this.H;
            if (aVar != null) {
                aVar.a(view, l0Var);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        com.zentraedi.comic.viewmodel.k2.a aVar2 = this.G;
        com.zentraedi.comic.viewmodel.l0 l0Var2 = this.H;
        if (aVar2 != null) {
            aVar2.a(view, l0Var2);
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.S = 256L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.I == i) {
            E1((com.zentraedi.comic.viewmodel.k2.a) obj);
            return true;
        }
        if (com.zentraedi.comic.a.m2 == i) {
            F1((com.zentraedi.comic.viewmodel.k2.a) obj);
            return true;
        }
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        G1((com.zentraedi.comic.viewmodel.l0) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return I1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return N1((ObservableField) obj, i2);
        }
        if (i == 2) {
            return L1((ObservableField) obj, i2);
        }
        if (i == 3) {
            return J1((ObservableField) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return K1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0141  */
    /* JADX WARN: Code duplicated, block: B:104:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x014c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0151  */
    /* JADX WARN: Code duplicated, block: B:109:0x0158  */
    /* JADX WARN: Code duplicated, block: B:110:0x015f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0168  */
    /* JADX WARN: Code duplicated, block: B:116:0x016e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0174  */
    /* JADX WARN: Code duplicated, block: B:119:0x0177  */
    /* JADX WARN: Code duplicated, block: B:121:0x017b  */
    /* JADX WARN: Code duplicated, block: B:122:0x017e  */
    /* JADX WARN: Code duplicated, block: B:124:0x018c  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00db  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x010a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0115  */
    /* JADX WARN: Code duplicated, block: B:86:0x011c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0124  */
    /* JADX WARN: Code duplicated, block: B:90:0x012b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0134  */
    /* JADX WARN: Code duplicated, block: B:96:0x0138  */
    /* JADX WARN: Code duplicated, block: B:99:0x013e  */
    protected void r() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        boolean z;
        int i2;
        int i3;
        Drawable drawable;
        int i4;
        int i5;
        String str;
        String str2;
        String str3;
        String str4;
        boolean zB0;
        String path;
        String cover;
        long j5;
        Drawable drawableB;
        long j6;
        long j7;
        ObservableField<Boolean> observableFieldW;
        Boolean bool;
        boolean zK0;
        int i6;
        int i7;
        long j8;
        ObservableField<Boolean> observableFieldC0;
        Boolean bool2;
        boolean zK1;
        long j9;
        androidx.databinding.u uVarX;
        Boolean bool3;
        boolean zK2;
        Context context;
        int i8;
        long j10;
        ComicInfoModel comicInfoModelQ;
        synchronized (this) {
            j = this.S;
            this.S = 0L;
        }
        com.zentraedi.comic.viewmodel.l0 l0Var = this.H;
        if ((415 & j) != 0) {
            long j11 = j & 385;
            j3 = 400;
            if (j11 != 0) {
                androidx.databinding.u uVarT = l0Var != null ? l0Var.T() : null;
                p1(0, uVarT);
                int iH0 = androidx.databinding.c0.H0(uVarT != null ? (Integer) uVarT.get() : null);
                boolean z2 = iH0 == 0;
                boolean z3 = iH0 == 2;
                if (j11 != 0) {
                    j |= z2 ? 262144L : 131072L;
                }
                if ((j & 385) != 0) {
                    j |= z3 ? 65536L : 32768L;
                }
                i3 = z2 ? 0 : 8;
                i4 = z3 ? 0 : 8;
            } else {
                i3 = 0;
                i4 = 0;
            }
            if ((j & 386) == 0) {
                str4 = null;
            } else {
                androidx.databinding.u title = l0Var != null ? l0Var.getTitle() : null;
                p1(1, title);
                if (title != null) {
                    str4 = (String) title.get();
                } else {
                    str4 = null;
                }
            }
            if ((j & 384) != 0) {
                if (l0Var != null) {
                    zB0 = l0Var.b0();
                    path = l0Var.getPath();
                    comicInfoModelQ = l0Var.Q();
                } else {
                    zB0 = false;
                    path = null;
                    comicInfoModelQ = null;
                }
                cover = comicInfoModelQ != null ? comicInfoModelQ.getCover() : null;
                j5 = j & 388;
                if (j5 != 0) {
                    if (l0Var != null) {
                        uVarX = l0Var.X();
                    } else {
                        uVarX = null;
                    }
                    j4 = 392;
                    p1(2, uVarX);
                    if (uVarX != null) {
                        bool3 = (Boolean) uVarX.get();
                    } else {
                        bool3 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool3);
                    if (j5 != 0) {
                        if (zK2) {
                            j10 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                        } else {
                            j10 = 512;
                        }
                        j |= j10;
                    }
                    if (zK2) {
                        context = this.K.getContext();
                        i8 = com.zentraedi.comic.q.h.pI;
                    } else {
                        context = this.K.getContext();
                        i8 = com.zentraedi.comic.q.h.qI;
                    }
                    drawableB = g.a.b(context, i8);
                } else {
                    j4 = 392;
                    drawableB = null;
                }
                j6 = j & j4;
                if (j6 != 0) {
                    if (l0Var != null) {
                        observableFieldC0 = l0Var.c0();
                    } else {
                        observableFieldC0 = null;
                    }
                    j2 = 388;
                    p1(3, observableFieldC0);
                    if (observableFieldC0 != null) {
                        bool2 = (Boolean) observableFieldC0.get();
                    } else {
                        bool2 = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool2);
                    if (j6 != 0) {
                        if (zK1) {
                            j9 = 16384;
                        } else {
                            j9 = 8192;
                        }
                        j |= j9;
                    }
                    if (zK1) {
                        i5 = 8;
                    }
                    j7 = j & 400;
                    if (j7 != 0) {
                        if (l0Var != null) {
                            observableFieldW = l0Var.W();
                        } else {
                            observableFieldW = null;
                        }
                        p1(4, observableFieldW);
                        if (observableFieldW != null) {
                            bool = (Boolean) observableFieldW.get();
                        } else {
                            bool = null;
                        }
                        zK0 = androidx.databinding.c0.K0(bool);
                        if (j7 != 0) {
                            if (zK0) {
                                j8 = 1052672;
                            } else {
                                j8 = 526336;
                            }
                            j |= j8;
                        }
                        if (zK0) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        if (zK0) {
                            i7 = 4;
                        } else {
                            i7 = 0;
                        }
                        str = str4;
                        z = zB0;
                        i = i6;
                        str3 = path;
                        str2 = cover;
                        drawable = drawableB;
                        i2 = i7;
                    } else {
                        str = str4;
                        z = zB0;
                        str3 = path;
                        str2 = cover;
                        i = 0;
                        drawable = drawableB;
                        i2 = 0;
                    }
                } else {
                    j2 = 388;
                }
                i5 = 0;
                j7 = j & 400;
                if (j7 != 0) {
                    if (l0Var != null) {
                        observableFieldW = l0Var.W();
                    } else {
                        observableFieldW = null;
                    }
                    p1(4, observableFieldW);
                    if (observableFieldW != null) {
                        bool = (Boolean) observableFieldW.get();
                    } else {
                        bool = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool);
                    if (j7 != 0) {
                        if (zK0) {
                            j8 = 1052672;
                        } else {
                            j8 = 526336;
                        }
                        j |= j8;
                    }
                    if (zK0) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    if (zK0) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    str = str4;
                    z = zB0;
                    i = i6;
                    str3 = path;
                    str2 = cover;
                    drawable = drawableB;
                    i2 = i7;
                } else {
                    str = str4;
                    z = zB0;
                    str3 = path;
                    str2 = cover;
                    i = 0;
                    drawable = drawableB;
                    i2 = 0;
                }
            } else {
                zB0 = false;
                path = null;
            }
            j5 = j & 388;
            if (j5 != 0) {
                if (l0Var != null) {
                    uVarX = l0Var.X();
                } else {
                    uVarX = null;
                }
                j4 = 392;
                p1(2, uVarX);
                if (uVarX != null) {
                    bool3 = (Boolean) uVarX.get();
                } else {
                    bool3 = null;
                }
                zK2 = androidx.databinding.c0.K0(bool3);
                if (j5 != 0) {
                    if (zK2) {
                        j10 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                    } else {
                        j10 = 512;
                    }
                    j |= j10;
                }
                if (zK2) {
                    context = this.K.getContext();
                    i8 = com.zentraedi.comic.q.h.pI;
                } else {
                    context = this.K.getContext();
                    i8 = com.zentraedi.comic.q.h.qI;
                }
                drawableB = g.a.b(context, i8);
            } else {
                j4 = 392;
                drawableB = null;
            }
            j6 = j & j4;
            if (j6 != 0) {
                if (l0Var != null) {
                    observableFieldC0 = l0Var.c0();
                } else {
                    observableFieldC0 = null;
                }
                j2 = 388;
                p1(3, observableFieldC0);
                if (observableFieldC0 != null) {
                    bool2 = (Boolean) observableFieldC0.get();
                } else {
                    bool2 = null;
                }
                zK1 = androidx.databinding.c0.K0(bool2);
                if (j6 != 0) {
                    if (zK1) {
                        j9 = 16384;
                    } else {
                        j9 = 8192;
                    }
                    j |= j9;
                }
                if (zK1) {
                    i5 = 8;
                }
                j7 = j & 400;
                if (j7 != 0) {
                    if (l0Var != null) {
                        observableFieldW = l0Var.W();
                    } else {
                        observableFieldW = null;
                    }
                    p1(4, observableFieldW);
                    if (observableFieldW != null) {
                        bool = (Boolean) observableFieldW.get();
                    } else {
                        bool = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool);
                    if (j7 != 0) {
                        if (zK0) {
                            j8 = 1052672;
                        } else {
                            j8 = 526336;
                        }
                        j |= j8;
                    }
                    if (zK0) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    if (zK0) {
                        i7 = 4;
                    } else {
                        i7 = 0;
                    }
                    str = str4;
                    z = zB0;
                    i = i6;
                    str3 = path;
                    str2 = cover;
                    drawable = drawableB;
                    i2 = i7;
                } else {
                    str = str4;
                    z = zB0;
                    str3 = path;
                    str2 = cover;
                    i = 0;
                    drawable = drawableB;
                    i2 = 0;
                }
            } else {
                j2 = 388;
            }
            i5 = 0;
            j7 = j & 400;
            if (j7 != 0) {
                if (l0Var != null) {
                    observableFieldW = l0Var.W();
                } else {
                    observableFieldW = null;
                }
                p1(4, observableFieldW);
                if (observableFieldW != null) {
                    bool = (Boolean) observableFieldW.get();
                } else {
                    bool = null;
                }
                zK0 = androidx.databinding.c0.K0(bool);
                if (j7 != 0) {
                    if (zK0) {
                        j8 = 1052672;
                    } else {
                        j8 = 526336;
                    }
                    j |= j8;
                }
                if (zK0) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                if (zK0) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                str = str4;
                z = zB0;
                i = i6;
                str3 = path;
                str2 = cover;
                drawable = drawableB;
                i2 = i7;
            } else {
                str = str4;
                z = zB0;
                str3 = path;
                str2 = cover;
                i = 0;
                drawable = drawableB;
                i2 = 0;
            }
        } else {
            j2 = 388;
            j3 = 400;
            j4 = 392;
            i = 0;
            z = false;
            i2 = 0;
            i3 = 0;
            drawable = null;
            i4 = 0;
            i5 = 0;
            str = null;
            str2 = null;
            str3 = null;
        }
        if ((256 & j) != 0) {
            this.I.setOnClickListener(this.Q);
            this.P.setOnClickListener(this.R);
        }
        if ((j & 384) != 0) {
            com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(z), true);
        }
        if ((j & j2) != 0) {
            androidx.databinding.adapters.p.a(this.K, drawable);
        }
        if ((j & j3) != 0) {
            this.K.setVisibility(i);
            this.P.setVisibility(i2);
        }
        if ((j & j4) != 0) {
            this.L.setVisibility(i5);
        }
        if ((j & 385) != 0) {
            this.M.setVisibility(i3);
            this.N.setVisibility(i4);
        }
        if ((j & 386) != 0) {
            androidx.databinding.adapters.f0.A(this.O, str);
        }
    }

    private r2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 5, (FrameLayout) objArr[8]);
        this.S = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.J = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[2];
        this.K = imageView2;
        imageView2.setTag(null);
        ImageView imageView3 = (ImageView) objArr[3];
        this.L = imageView3;
        imageView3.setTag(null);
        ImageView imageView4 = (ImageView) objArr[4];
        this.M = imageView4;
        imageView4.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[5];
        this.N = progressBar;
        progressBar.setTag(null);
        TextView textView = (TextView) objArr[6];
        this.O = textView;
        textView.setTag(null);
        ImageView imageView5 = (ImageView) objArr[7];
        this.P = imageView5;
        imageView5.setTag(null);
        P0(view);
        this.Q = new com.zentraedi.comic.generated.callback.b(this, 1);
        this.R = new com.zentraedi.comic.generated.callback.b(this, 2);
        i0();
    }
}
