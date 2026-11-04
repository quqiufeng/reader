package com.zentraedi.comic.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class q4 extends p4 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i P = null;

    @androidx.annotation.p0
    private static final SparseIntArray Q = null;

    @androidx.annotation.n0
    private final LinearLayout F;

    @androidx.annotation.n0
    private final TextView G;

    @androidx.annotation.n0
    private final ImageView H;

    @androidx.annotation.n0
    private final TextView I;

    @androidx.annotation.n0
    private final ImageView J;

    @androidx.annotation.n0
    private final ImageView K;

    @androidx.annotation.p0
    private final View.OnClickListener L;

    @androidx.annotation.p0
    private final View.OnClickListener M;

    @androidx.annotation.p0
    private final View.OnClickListener N;
    private long O;

    public q4(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 6, P, Q));
    }

    private boolean D1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 2;
        }
        return true;
    }

    private boolean E1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 16;
        }
        return true;
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 8;
        }
        return true;
    }

    private boolean G1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 1;
        }
        return true;
    }

    private boolean I1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 32;
        }
        return true;
    }

    private boolean J1(ObservableField<Drawable> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 4;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.p4
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.m2 m2Var) {
        this.E = m2Var;
        synchronized (this) {
            this.O |= 64;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        com.zentraedi.comic.viewmodel.m2 m2Var;
        if (i == 1) {
            com.zentraedi.comic.viewmodel.m2 m2Var2 = this.E;
            if (m2Var2 != null) {
                m2Var2.c0();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (m2Var = this.E) != null) {
                m2Var.W();
                return;
            }
            return;
        }
        com.zentraedi.comic.viewmodel.m2 m2Var3 = this.E;
        if (m2Var3 != null) {
            m2Var3.X();
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.O = 128L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.m2) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return G1((ObservableBoolean) obj, i2);
        }
        if (i == 1) {
            return D1((ObservableBoolean) obj, i2);
        }
        if (i == 2) {
            return J1((ObservableField) obj, i2);
        }
        if (i == 3) {
            return F1((ObservableField) obj, i2);
        }
        if (i == 4) {
            return E1((ObservableBoolean) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return I1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0141  */
    /* JADX WARN: Code duplicated, block: B:104:0x014e  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f A[PHI: r2
      0x004f: PHI (r2v3 long) = (r2v0 long), (r2v11 long) binds: [B:9:0x0026, B:22:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0104  */
    /* JADX WARN: Code duplicated, block: B:85:0x0109  */
    /* JADX WARN: Code duplicated, block: B:88:0x0110  */
    /* JADX WARN: Code duplicated, block: B:89:0x0115  */
    /* JADX WARN: Code duplicated, block: B:92:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0127  */
    /* JADX WARN: Code duplicated, block: B:97:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:0x013a  */
    protected void r() {
        long j;
        long j2;
        long j3;
        float f;
        String str;
        boolean z;
        int i;
        Drawable drawable;
        View.OnClickListener onClickListenerO;
        String str2;
        Drawable drawable2;
        Drawable drawableB;
        long j4;
        boolean z2;
        ObservableField<String> observableFieldQ;
        ObservableBoolean observableBooleanU;
        boolean z3;
        float f2;
        long j5;
        Context context;
        int i2;
        synchronized (this) {
            j = this.O;
            this.O = 0L;
        }
        com.zentraedi.comic.viewmodel.m2 m2Var = this.E;
        long j6 = 200;
        float f3 = 0.0f;
        if ((255 & j) != 0) {
            long j7 = j & 193;
            if (j7 == 0) {
                i = 0;
            } else {
                androidx.databinding.u uVarP = m2Var != null ? m2Var.P() : null;
                p1(0, uVarP);
                boolean z4 = uVarP != null ? uVarP.get() : false;
                if (j7 != 0) {
                    j |= z4 ? 512L : 256L;
                }
                if (z4) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            long j8 = j & 194;
            if (j8 != 0) {
                androidx.databinding.u uVarN = m2Var != null ? m2Var.N() : null;
                j2 = 224;
                p1(1, uVarN);
                boolean z5 = uVarN != null ? uVarN.get() : false;
                if (j8 != 0) {
                    j |= z5 ? 8192L : ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                }
                if (z5) {
                    context = this.K.getContext();
                    i2 = com.zentraedi.comic.q.h.RZ;
                } else {
                    context = this.K.getContext();
                    i2 = com.zentraedi.comic.q.h.QZ;
                }
                drawableB = g.a.b(context, i2);
            } else {
                j2 = 224;
                drawableB = null;
            }
            if ((j & 196) == 0) {
                drawable = null;
            } else {
                ObservableField<Drawable> observableFieldR = m2Var != null ? m2Var.R() : null;
                p1(2, observableFieldR);
                if (observableFieldR != null) {
                    drawable = (Drawable) observableFieldR.get();
                } else {
                    drawable = null;
                }
            }
            onClickListenerO = ((j & 192) == 0 || m2Var == null) ? null : m2Var.O();
            if ((j & 200) != 0) {
                ObservableField<String> numDesc = m2Var != null ? m2Var.getNumDesc() : null;
                j3 = 208;
                p1(3, numDesc);
                str2 = numDesc != null ? (String) numDesc.get() : null;
                j4 = j & j3;
                if (j4 != 0) {
                    if (m2Var != null) {
                        observableBooleanU = m2Var.U();
                    } else {
                        observableBooleanU = null;
                    }
                    p1(4, observableBooleanU);
                    if (observableBooleanU != null) {
                        z3 = observableBooleanU.get();
                    } else {
                        z3 = false;
                    }
                    if (j4 != 0) {
                        if (z3) {
                            j5 = 34816;
                        } else {
                            j5 = 17408;
                        }
                        j |= j5;
                    }
                    if (z3) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    boolean z6 = !z3;
                    float f4 = z3 ? 0.1f : 1.0f;
                    float f5 = f2;
                    f3 = f4;
                    f = f5;
                    z2 = z6;
                } else {
                    f = 0.0f;
                    z2 = false;
                }
                if ((j & j2) == 0) {
                    str = null;
                } else {
                    if (m2Var != null) {
                        observableFieldQ = m2Var.Q();
                    } else {
                        observableFieldQ = null;
                    }
                    p1(5, observableFieldQ);
                    if (observableFieldQ != null) {
                        str = (String) observableFieldQ.get();
                    } else {
                        str = null;
                    }
                }
                drawable2 = drawableB;
                z = z2;
            } else {
                j3 = 208;
            }
            j4 = j & j3;
            if (j4 != 0) {
                if (m2Var != null) {
                    observableBooleanU = m2Var.U();
                } else {
                    observableBooleanU = null;
                }
                p1(4, observableBooleanU);
                if (observableBooleanU != null) {
                    z3 = observableBooleanU.get();
                } else {
                    z3 = false;
                }
                if (j4 != 0) {
                    if (z3) {
                        j5 = 34816;
                    } else {
                        j5 = 17408;
                    }
                    j |= j5;
                }
                if (z3) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                boolean z7 = !z3;
                if (z3) {
                }
                float f6 = f2;
                f3 = f4;
                f = f6;
                z2 = z7;
            } else {
                f = 0.0f;
                z2 = false;
            }
            if ((j & j2) == 0) {
                str = null;
            } else {
                if (m2Var != null) {
                    observableFieldQ = m2Var.Q();
                } else {
                    observableFieldQ = null;
                }
                p1(5, observableFieldQ);
                if (observableFieldQ != null) {
                    str = (String) observableFieldQ.get();
                } else {
                    str = null;
                }
            }
            drawable2 = drawableB;
            z = z2;
        } else {
            j6 = 200;
            j2 = 224;
            j3 = 208;
            f = 0.0f;
            f3 = 0.0f;
            str = null;
            z = false;
            i = 0;
            drawable = null;
            onClickListenerO = null;
            str2 = null;
            drawable2 = null;
        }
        if ((j & j3) != 0) {
            this.G.setEnabled(z);
            this.H.setEnabled(z);
            this.J.setEnabled(z);
            this.K.setEnabled(z);
            if (androidx.databinding.c0.A() >= 11) {
                this.G.setAlpha(f);
                this.H.setAlpha(f3);
                this.J.setAlpha(f);
                this.K.setAlpha(f);
            }
        }
        if ((128 & j) != 0) {
            this.G.setOnClickListener(this.N);
            this.H.setOnClickListener(this.L);
            this.K.setOnClickListener(this.M);
        }
        if ((j & j2) != 0) {
            androidx.databinding.adapters.f0.A(this.G, str);
        }
        if ((j & 196) != 0) {
            androidx.databinding.adapters.p.a(this.H, drawable);
        }
        if ((j & j6) != 0) {
            androidx.databinding.adapters.f0.A(this.I, str2);
        }
        if ((j & 192) != 0) {
            this.J.setOnClickListener(onClickListenerO);
        }
        if ((j & 193) != 0) {
            this.J.setVisibility(i);
        }
        if ((j & 194) != 0) {
            androidx.databinding.adapters.p.a(this.K, drawable2);
        }
    }

    private q4(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 6);
        this.O = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.F = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.G = textView;
        textView.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.H = imageView;
        imageView.setTag(null);
        TextView textView2 = (TextView) objArr[3];
        this.I = textView2;
        textView2.setTag(null);
        ImageView imageView2 = (ImageView) objArr[4];
        this.J = imageView2;
        imageView2.setTag(null);
        ImageView imageView3 = (ImageView) objArr[5];
        this.K = imageView3;
        imageView3.setTag(null);
        P0(view);
        this.L = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.M = new com.zentraedi.comic.generated.callback.b(this, 3);
        this.N = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
