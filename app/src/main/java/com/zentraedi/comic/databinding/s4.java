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
public class s4 extends r4 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i Q = null;

    @androidx.annotation.p0
    private static final SparseIntArray R = null;

    @androidx.annotation.n0
    private final LinearLayout F;

    @androidx.annotation.n0
    private final LinearLayout G;

    @androidx.annotation.n0
    private final ImageView H;

    @androidx.annotation.n0
    private final TextView I;

    @androidx.annotation.n0
    private final LinearLayout J;

    @androidx.annotation.n0
    private final ImageView K;

    @androidx.annotation.n0
    private final TextView L;

    @androidx.annotation.n0
    private final LinearLayout M;

    @androidx.annotation.n0
    private final ImageView N;

    @androidx.annotation.n0
    private final TextView O;
    private long P;

    public s4(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 10, Q, R));
    }

    private boolean D1(ObservableField<View.OnClickListener> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 2;
        }
        return true;
    }

    private boolean E1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 32;
        }
        return true;
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 16;
        }
        return true;
    }

    private boolean G1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 128;
        }
        return true;
    }

    private boolean I1(ObservableField<View.OnClickListener> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 8;
        }
        return true;
    }

    private boolean J1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 4;
        }
        return true;
    }

    private boolean K1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 1;
        }
        return true;
    }

    private boolean L1(ObservableField<View.OnClickListener> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 512;
        }
        return true;
    }

    private boolean N1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 256;
        }
        return true;
    }

    private boolean O1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 64;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.r4
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.d3 d3Var) {
        this.E = d3Var;
        synchronized (this) {
            this.P |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.g4);
        super.C0();
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.P = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.g4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.d3) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return K1((ObservableBoolean) obj, i2);
            case 1:
                return D1((ObservableField) obj, i2);
            case 2:
                return J1((ObservableBoolean) obj, i2);
            case 3:
                return I1((ObservableField) obj, i2);
            case 4:
                return F1((ObservableField) obj, i2);
            case 5:
                return E1((ObservableBoolean) obj, i2);
            case 6:
                return O1((ObservableBoolean) obj, i2);
            case 7:
                return G1((ObservableBoolean) obj, i2);
            case 8:
                return N1((ObservableBoolean) obj, i2);
            case 9:
                return L1((ObservableField) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x013a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0141  */
    /* JADX WARN: Code duplicated, block: B:107:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x014e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0153  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:116:0x015d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0160  */
    /* JADX WARN: Code duplicated, block: B:121:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x016b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0170  */
    /* JADX WARN: Code duplicated, block: B:126:0x0177  */
    /* JADX WARN: Code duplicated, block: B:127:0x017c  */
    /* JADX WARN: Code duplicated, block: B:129:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0181  */
    /* JADX WARN: Code duplicated, block: B:132:0x0186  */
    /* JADX WARN: Code duplicated, block: B:135:0x018d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0190 A[PHI: r2
      0x0190: PHI (r2v38 long) = (r2v37 long), (r2v43 long) binds: [B:120:0x0167, B:133:0x018a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x0199  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:157:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:83:0x0101  */
    /* JADX WARN: Code duplicated, block: B:86:0x0109  */
    /* JADX WARN: Code duplicated, block: B:87:0x010e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0113  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x0124  */
    /* JADX WARN: Code duplicated, block: B:97:0x012b  */
    /* JADX WARN: Code duplicated, block: B:98:0x012e  */
    protected void r() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        boolean z;
        boolean z2;
        int i;
        int i2;
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        Drawable drawable;
        String str;
        Drawable drawableB;
        boolean z3;
        int i3;
        Drawable drawableB2;
        View.OnClickListener onClickListener3;
        View.OnClickListener onClickListener4;
        long j7;
        boolean z4;
        Drawable drawableB3;
        View.OnClickListener onClickListener5;
        long j8;
        long j9;
        long j10;
        long j11;
        boolean z5;
        boolean z6;
        ObservableField<View.OnClickListener> observableFieldS;
        ObservableBoolean observableBooleanT;
        int i4;
        long j12;
        ObservableBoolean observableBooleanO;
        boolean z7;
        long j13;
        ObservableBoolean observableBooleanU;
        boolean z8;
        long j14;
        ObservableBoolean observableBooleanM;
        int i5;
        long j15;
        ObservableField<String> observableFieldN;
        ObservableField<View.OnClickListener> observableFieldP;
        androidx.databinding.u uVarQ;
        int i6;
        long j16;
        ObservableField<View.OnClickListener> observableFieldL;
        synchronized (this) {
            j = this.P;
            this.P = 0L;
        }
        com.zentraedi.comic.viewmodel.d3 d3Var = this.E;
        if ((4095 & j) != 0) {
            long j17 = j & 3073;
            if (j17 != 0) {
                androidx.databinding.u uVarR = d3Var != null ? d3Var.R() : null;
                j3 = 3584;
                p1(0, uVarR);
                boolean z9 = uVarR != null ? uVarR.get() : false;
                if (j17 != 0) {
                    j |= z9 ? 2097152L : 1048576L;
                }
                if (!z9) {
                    i2 = 8;
                }
                if ((j & 3074) == 0) {
                    onClickListener4 = null;
                } else {
                    if (d3Var != null) {
                        observableFieldL = d3Var.L();
                    } else {
                        observableFieldL = null;
                    }
                    p1(1, observableFieldL);
                    if (observableFieldL != null) {
                        onClickListener4 = (View.OnClickListener) observableFieldL.get();
                    } else {
                        onClickListener4 = null;
                    }
                }
                j7 = j & 3076;
                if (j7 != 0) {
                    if (d3Var != null) {
                        uVarQ = d3Var.Q();
                    } else {
                        uVarQ = null;
                    }
                    j4 = 3328;
                    p1(2, uVarQ);
                    if (uVarQ != null) {
                        z4 = uVarQ.get();
                    } else {
                        z4 = false;
                    }
                    if (j7 != 0) {
                        if (z4) {
                            j16 = 8388608;
                        } else {
                            j16 = 4194304;
                        }
                        j |= j16;
                    }
                    Context context = this.N.getContext();
                    if (z4) {
                        i6 = com.zentraedi.comic.q.h.Uq;
                    } else {
                        i6 = com.zentraedi.comic.q.h.Zq;
                    }
                    drawableB3 = g.a.b(context, i6);
                } else {
                    j4 = 3328;
                    z4 = false;
                    drawableB3 = null;
                }
                if ((j & 3080) == 0) {
                    onClickListener5 = null;
                } else {
                    if (d3Var != null) {
                        observableFieldP = d3Var.P();
                    } else {
                        observableFieldP = null;
                    }
                    p1(3, observableFieldP);
                    if (observableFieldP != null) {
                        onClickListener5 = (View.OnClickListener) observableFieldP.get();
                    } else {
                        onClickListener5 = null;
                    }
                }
                if ((j & 3088) != 0) {
                    if (d3Var != null) {
                        observableFieldN = d3Var.N();
                    } else {
                        observableFieldN = null;
                    }
                    j5 = 3200;
                    p1(4, observableFieldN);
                    str = observableFieldN != null ? (String) observableFieldN.get() : null;
                    j8 = j & 3104;
                    if (j8 != 0) {
                        if (d3Var != null) {
                            observableBooleanM = d3Var.M();
                        } else {
                            observableBooleanM = null;
                        }
                        j6 = 3136;
                        p1(5, observableBooleanM);
                        if (observableBooleanM != null) {
                            z3 = observableBooleanM.get();
                        } else {
                            z3 = false;
                        }
                        if (j8 != 0) {
                            if (z3) {
                                j15 = 131072;
                            } else {
                                j15 = 65536;
                            }
                            j |= j15;
                        }
                        Context context2 = this.K.getContext();
                        if (z3) {
                            i5 = com.zentraedi.comic.q.h.Yo;
                        } else {
                            i5 = com.zentraedi.comic.q.h.hp;
                        }
                        drawableB = g.a.b(context2, i5);
                    } else {
                        j6 = 3136;
                        drawableB = null;
                        z3 = false;
                    }
                    j9 = j & j6;
                    if (j9 != 0) {
                        if (d3Var != null) {
                            observableBooleanU = d3Var.U();
                        } else {
                            observableBooleanU = null;
                        }
                        j2 = 3104;
                        p1(6, observableBooleanU);
                        if (observableBooleanU != null) {
                            z8 = observableBooleanU.get();
                        } else {
                            z8 = false;
                        }
                        if (j9 != 0) {
                            if (z8) {
                                j14 = 8192;
                            } else {
                                j14 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                            }
                            j |= j14;
                        }
                        if (z8) {
                            i3 = 8;
                        }
                        j10 = j & j5;
                        if (j10 == 0) {
                            i = 0;
                        } else {
                            if (d3Var != null) {
                                observableBooleanO = d3Var.O();
                            } else {
                                observableBooleanO = null;
                            }
                            p1(7, observableBooleanO);
                            if (observableBooleanO != null) {
                                z7 = observableBooleanO.get();
                            } else {
                                z7 = false;
                            }
                            if (j10 != 0) {
                                if (z7) {
                                    j13 = 524288;
                                } else {
                                    j13 = 262144;
                                }
                                j |= j13;
                            }
                            if (z7) {
                                i = 0;
                            } else {
                                i = 8;
                            }
                        }
                        j11 = j & j4;
                        if (j11 != 0) {
                            if (d3Var != null) {
                                observableBooleanT = d3Var.T();
                            } else {
                                observableBooleanT = null;
                            }
                            p1(8, observableBooleanT);
                            if (observableBooleanT != null) {
                                z5 = observableBooleanT.get();
                            } else {
                                z5 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j12 = 32768;
                                } else {
                                    j12 = 16384;
                                }
                                j |= j12;
                            }
                            Context context3 = this.H.getContext();
                            if (z5) {
                                i4 = com.zentraedi.comic.q.h.fH;
                            } else {
                                i4 = com.zentraedi.comic.q.h.eH;
                            }
                            drawableB2 = g.a.b(context3, i4);
                        } else {
                            z5 = false;
                            drawableB2 = null;
                        }
                        if ((j & j3) != 0) {
                            if (d3Var != 0) {
                                observableFieldS = d3Var.S();
                            } else {
                                observableFieldS = null;
                            }
                            z6 = z5;
                            p1(9, observableFieldS);
                            if (observableFieldS != null) {
                                View.OnClickListener onClickListener6 = (View.OnClickListener) observableFieldS.get();
                                onClickListener3 = onClickListener5;
                                drawable = drawableB3;
                                onClickListener2 = onClickListener4;
                                onClickListener = onClickListener6;
                                z = z4;
                                z2 = z6;
                            }
                        } else {
                            z6 = z5;
                        }
                        z = z4;
                        onClickListener3 = onClickListener5;
                        z2 = z6;
                        drawable = drawableB3;
                        onClickListener2 = onClickListener4;
                        onClickListener = null;
                    } else {
                        j2 = 3104;
                    }
                    i3 = 0;
                    j10 = j & j5;
                    if (j10 == 0) {
                        i = 0;
                    } else {
                        if (d3Var != null) {
                            observableBooleanO = d3Var.O();
                        } else {
                            observableBooleanO = null;
                        }
                        p1(7, observableBooleanO);
                        if (observableBooleanO != null) {
                            z7 = observableBooleanO.get();
                        } else {
                            z7 = false;
                        }
                        if (j10 != 0) {
                            if (z7) {
                                j13 = 524288;
                            } else {
                                j13 = 262144;
                            }
                            j |= j13;
                        }
                        if (z7) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                    }
                    j11 = j & j4;
                    if (j11 != 0) {
                        if (d3Var != null) {
                            observableBooleanT = d3Var.T();
                        } else {
                            observableBooleanT = null;
                        }
                        p1(8, observableBooleanT);
                        if (observableBooleanT != null) {
                            z5 = observableBooleanT.get();
                        } else {
                            z5 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j12 = 32768;
                            } else {
                                j12 = 16384;
                            }
                            j |= j12;
                        }
                        Context context4 = this.H.getContext();
                        if (z5) {
                            i4 = com.zentraedi.comic.q.h.fH;
                        } else {
                            i4 = com.zentraedi.comic.q.h.eH;
                        }
                        drawableB2 = g.a.b(context4, i4);
                    } else {
                        z5 = false;
                        drawableB2 = null;
                    }
                    if ((j & j3) != 0) {
                        if (d3Var != 0) {
                            observableFieldS = d3Var.S();
                        } else {
                            observableFieldS = null;
                        }
                        z6 = z5;
                        p1(9, observableFieldS);
                        if (observableFieldS != null) {
                            View.OnClickListener onClickListener7 = (View.OnClickListener) observableFieldS.get();
                            onClickListener3 = onClickListener5;
                            drawable = drawableB3;
                            onClickListener2 = onClickListener4;
                            onClickListener = onClickListener7;
                            z = z4;
                            z2 = z6;
                        }
                    } else {
                        z6 = z5;
                    }
                    z = z4;
                    onClickListener3 = onClickListener5;
                    z2 = z6;
                    drawable = drawableB3;
                    onClickListener2 = onClickListener4;
                    onClickListener = null;
                } else {
                    j5 = 3200;
                }
                j8 = j & 3104;
                if (j8 != 0) {
                    if (d3Var != null) {
                        observableBooleanM = d3Var.M();
                    } else {
                        observableBooleanM = null;
                    }
                    j6 = 3136;
                    p1(5, observableBooleanM);
                    if (observableBooleanM != null) {
                        z3 = observableBooleanM.get();
                    } else {
                        z3 = false;
                    }
                    if (j8 != 0) {
                        if (z3) {
                            j15 = 131072;
                        } else {
                            j15 = 65536;
                        }
                        j |= j15;
                    }
                    Context context5 = this.K.getContext();
                    if (z3) {
                        i5 = com.zentraedi.comic.q.h.Yo;
                    } else {
                        i5 = com.zentraedi.comic.q.h.hp;
                    }
                    drawableB = g.a.b(context5, i5);
                } else {
                    j6 = 3136;
                    drawableB = null;
                    z3 = false;
                }
                j9 = j & j6;
                if (j9 != 0) {
                    if (d3Var != null) {
                        observableBooleanU = d3Var.U();
                    } else {
                        observableBooleanU = null;
                    }
                    j2 = 3104;
                    p1(6, observableBooleanU);
                    if (observableBooleanU != null) {
                        z8 = observableBooleanU.get();
                    } else {
                        z8 = false;
                    }
                    if (j9 != 0) {
                        if (z8) {
                            j14 = 8192;
                        } else {
                            j14 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                        }
                        j |= j14;
                    }
                    if (z8) {
                        i3 = 8;
                    }
                    j10 = j & j5;
                    if (j10 == 0) {
                        i = 0;
                    } else {
                        if (d3Var != null) {
                            observableBooleanO = d3Var.O();
                        } else {
                            observableBooleanO = null;
                        }
                        p1(7, observableBooleanO);
                        if (observableBooleanO != null) {
                            z7 = observableBooleanO.get();
                        } else {
                            z7 = false;
                        }
                        if (j10 != 0) {
                            if (z7) {
                                j13 = 524288;
                            } else {
                                j13 = 262144;
                            }
                            j |= j13;
                        }
                        if (z7) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                    }
                    j11 = j & j4;
                    if (j11 != 0) {
                        if (d3Var != null) {
                            observableBooleanT = d3Var.T();
                        } else {
                            observableBooleanT = null;
                        }
                        p1(8, observableBooleanT);
                        if (observableBooleanT != null) {
                            z5 = observableBooleanT.get();
                        } else {
                            z5 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j12 = 32768;
                            } else {
                                j12 = 16384;
                            }
                            j |= j12;
                        }
                        Context context6 = this.H.getContext();
                        if (z5) {
                            i4 = com.zentraedi.comic.q.h.fH;
                        } else {
                            i4 = com.zentraedi.comic.q.h.eH;
                        }
                        drawableB2 = g.a.b(context6, i4);
                    } else {
                        z5 = false;
                        drawableB2 = null;
                    }
                    if ((j & j3) != 0) {
                        if (d3Var != 0) {
                            observableFieldS = d3Var.S();
                        } else {
                            observableFieldS = null;
                        }
                        z6 = z5;
                        p1(9, observableFieldS);
                        if (observableFieldS != null) {
                            View.OnClickListener onClickListener8 = (View.OnClickListener) observableFieldS.get();
                            onClickListener3 = onClickListener5;
                            drawable = drawableB3;
                            onClickListener2 = onClickListener4;
                            onClickListener = onClickListener8;
                            z = z4;
                            z2 = z6;
                        }
                    } else {
                        z6 = z5;
                    }
                    z = z4;
                    onClickListener3 = onClickListener5;
                    z2 = z6;
                    drawable = drawableB3;
                    onClickListener2 = onClickListener4;
                    onClickListener = null;
                } else {
                    j2 = 3104;
                }
                i3 = 0;
                j10 = j & j5;
                if (j10 == 0) {
                    i = 0;
                } else {
                    if (d3Var != null) {
                        observableBooleanO = d3Var.O();
                    } else {
                        observableBooleanO = null;
                    }
                    p1(7, observableBooleanO);
                    if (observableBooleanO != null) {
                        z7 = observableBooleanO.get();
                    } else {
                        z7 = false;
                    }
                    if (j10 != 0) {
                        if (z7) {
                            j13 = 524288;
                        } else {
                            j13 = 262144;
                        }
                        j |= j13;
                    }
                    if (z7) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                }
                j11 = j & j4;
                if (j11 != 0) {
                    if (d3Var != null) {
                        observableBooleanT = d3Var.T();
                    } else {
                        observableBooleanT = null;
                    }
                    p1(8, observableBooleanT);
                    if (observableBooleanT != null) {
                        z5 = observableBooleanT.get();
                    } else {
                        z5 = false;
                    }
                    if (j11 != 0) {
                        if (z5) {
                            j12 = 32768;
                        } else {
                            j12 = 16384;
                        }
                        j |= j12;
                    }
                    Context context7 = this.H.getContext();
                    if (z5) {
                        i4 = com.zentraedi.comic.q.h.fH;
                    } else {
                        i4 = com.zentraedi.comic.q.h.eH;
                    }
                    drawableB2 = g.a.b(context7, i4);
                } else {
                    z5 = false;
                    drawableB2 = null;
                }
                if ((j & j3) != 0) {
                    if (d3Var != 0) {
                        observableFieldS = d3Var.S();
                    } else {
                        observableFieldS = null;
                    }
                    z6 = z5;
                    p1(9, observableFieldS);
                    if (observableFieldS != null) {
                        View.OnClickListener onClickListener9 = (View.OnClickListener) observableFieldS.get();
                        onClickListener3 = onClickListener5;
                        drawable = drawableB3;
                        onClickListener2 = onClickListener4;
                        onClickListener = onClickListener9;
                        z = z4;
                        z2 = z6;
                    }
                } else {
                    z6 = z5;
                }
                z = z4;
                onClickListener3 = onClickListener5;
                z2 = z6;
                drawable = drawableB3;
                onClickListener2 = onClickListener4;
                onClickListener = null;
            } else {
                j3 = 3584;
            }
            i2 = 0;
            if ((j & 3074) == 0) {
                onClickListener4 = null;
            } else {
                if (d3Var != null) {
                    observableFieldL = d3Var.L();
                } else {
                    observableFieldL = null;
                }
                p1(1, observableFieldL);
                if (observableFieldL != null) {
                    onClickListener4 = (View.OnClickListener) observableFieldL.get();
                } else {
                    onClickListener4 = null;
                }
            }
            j7 = j & 3076;
            if (j7 != 0) {
                if (d3Var != null) {
                    uVarQ = d3Var.Q();
                } else {
                    uVarQ = null;
                }
                j4 = 3328;
                p1(2, uVarQ);
                if (uVarQ != null) {
                    z4 = uVarQ.get();
                } else {
                    z4 = false;
                }
                if (j7 != 0) {
                    if (z4) {
                        j16 = 8388608;
                    } else {
                        j16 = 4194304;
                    }
                    j |= j16;
                }
                Context context8 = this.N.getContext();
                if (z4) {
                    i6 = com.zentraedi.comic.q.h.Uq;
                } else {
                    i6 = com.zentraedi.comic.q.h.Zq;
                }
                drawableB3 = g.a.b(context8, i6);
            } else {
                j4 = 3328;
                z4 = false;
                drawableB3 = null;
            }
            if ((j & 3080) == 0) {
                onClickListener5 = null;
            } else {
                if (d3Var != null) {
                    observableFieldP = d3Var.P();
                } else {
                    observableFieldP = null;
                }
                p1(3, observableFieldP);
                if (observableFieldP != null) {
                    onClickListener5 = (View.OnClickListener) observableFieldP.get();
                } else {
                    onClickListener5 = null;
                }
            }
            if ((j & 3088) != 0) {
                if (d3Var != null) {
                    observableFieldN = d3Var.N();
                } else {
                    observableFieldN = null;
                }
                j5 = 3200;
                p1(4, observableFieldN);
                if (observableFieldN != null) {
                }
                j8 = j & 3104;
                if (j8 != 0) {
                    if (d3Var != null) {
                        observableBooleanM = d3Var.M();
                    } else {
                        observableBooleanM = null;
                    }
                    j6 = 3136;
                    p1(5, observableBooleanM);
                    if (observableBooleanM != null) {
                        z3 = observableBooleanM.get();
                    } else {
                        z3 = false;
                    }
                    if (j8 != 0) {
                        if (z3) {
                            j15 = 131072;
                        } else {
                            j15 = 65536;
                        }
                        j |= j15;
                    }
                    Context context9 = this.K.getContext();
                    if (z3) {
                        i5 = com.zentraedi.comic.q.h.Yo;
                    } else {
                        i5 = com.zentraedi.comic.q.h.hp;
                    }
                    drawableB = g.a.b(context9, i5);
                } else {
                    j6 = 3136;
                    drawableB = null;
                    z3 = false;
                }
                j9 = j & j6;
                if (j9 != 0) {
                    if (d3Var != null) {
                        observableBooleanU = d3Var.U();
                    } else {
                        observableBooleanU = null;
                    }
                    j2 = 3104;
                    p1(6, observableBooleanU);
                    if (observableBooleanU != null) {
                        z8 = observableBooleanU.get();
                    } else {
                        z8 = false;
                    }
                    if (j9 != 0) {
                        if (z8) {
                            j14 = 8192;
                        } else {
                            j14 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                        }
                        j |= j14;
                    }
                    if (z8) {
                        i3 = 8;
                    }
                    j10 = j & j5;
                    if (j10 == 0) {
                        i = 0;
                    } else {
                        if (d3Var != null) {
                            observableBooleanO = d3Var.O();
                        } else {
                            observableBooleanO = null;
                        }
                        p1(7, observableBooleanO);
                        if (observableBooleanO != null) {
                            z7 = observableBooleanO.get();
                        } else {
                            z7 = false;
                        }
                        if (j10 != 0) {
                            if (z7) {
                                j13 = 524288;
                            } else {
                                j13 = 262144;
                            }
                            j |= j13;
                        }
                        if (z7) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                    }
                    j11 = j & j4;
                    if (j11 != 0) {
                        if (d3Var != null) {
                            observableBooleanT = d3Var.T();
                        } else {
                            observableBooleanT = null;
                        }
                        p1(8, observableBooleanT);
                        if (observableBooleanT != null) {
                            z5 = observableBooleanT.get();
                        } else {
                            z5 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j12 = 32768;
                            } else {
                                j12 = 16384;
                            }
                            j |= j12;
                        }
                        Context context10 = this.H.getContext();
                        if (z5) {
                            i4 = com.zentraedi.comic.q.h.fH;
                        } else {
                            i4 = com.zentraedi.comic.q.h.eH;
                        }
                        drawableB2 = g.a.b(context10, i4);
                    } else {
                        z5 = false;
                        drawableB2 = null;
                    }
                    if ((j & j3) != 0) {
                        if (d3Var != 0) {
                            observableFieldS = d3Var.S();
                        } else {
                            observableFieldS = null;
                        }
                        z6 = z5;
                        p1(9, observableFieldS);
                        if (observableFieldS != null) {
                            View.OnClickListener onClickListener10 = (View.OnClickListener) observableFieldS.get();
                            onClickListener3 = onClickListener5;
                            drawable = drawableB3;
                            onClickListener2 = onClickListener4;
                            onClickListener = onClickListener10;
                            z = z4;
                            z2 = z6;
                        }
                    } else {
                        z6 = z5;
                    }
                    z = z4;
                    onClickListener3 = onClickListener5;
                    z2 = z6;
                    drawable = drawableB3;
                    onClickListener2 = onClickListener4;
                    onClickListener = null;
                } else {
                    j2 = 3104;
                }
                i3 = 0;
                j10 = j & j5;
                if (j10 == 0) {
                    i = 0;
                } else {
                    if (d3Var != null) {
                        observableBooleanO = d3Var.O();
                    } else {
                        observableBooleanO = null;
                    }
                    p1(7, observableBooleanO);
                    if (observableBooleanO != null) {
                        z7 = observableBooleanO.get();
                    } else {
                        z7 = false;
                    }
                    if (j10 != 0) {
                        if (z7) {
                            j13 = 524288;
                        } else {
                            j13 = 262144;
                        }
                        j |= j13;
                    }
                    if (z7) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                }
                j11 = j & j4;
                if (j11 != 0) {
                    if (d3Var != null) {
                        observableBooleanT = d3Var.T();
                    } else {
                        observableBooleanT = null;
                    }
                    p1(8, observableBooleanT);
                    if (observableBooleanT != null) {
                        z5 = observableBooleanT.get();
                    } else {
                        z5 = false;
                    }
                    if (j11 != 0) {
                        if (z5) {
                            j12 = 32768;
                        } else {
                            j12 = 16384;
                        }
                        j |= j12;
                    }
                    Context context11 = this.H.getContext();
                    if (z5) {
                        i4 = com.zentraedi.comic.q.h.fH;
                    } else {
                        i4 = com.zentraedi.comic.q.h.eH;
                    }
                    drawableB2 = g.a.b(context11, i4);
                } else {
                    z5 = false;
                    drawableB2 = null;
                }
                if ((j & j3) != 0) {
                    if (d3Var != 0) {
                        observableFieldS = d3Var.S();
                    } else {
                        observableFieldS = null;
                    }
                    z6 = z5;
                    p1(9, observableFieldS);
                    if (observableFieldS != null) {
                        View.OnClickListener onClickListener11 = (View.OnClickListener) observableFieldS.get();
                        onClickListener3 = onClickListener5;
                        drawable = drawableB3;
                        onClickListener2 = onClickListener4;
                        onClickListener = onClickListener11;
                        z = z4;
                        z2 = z6;
                    }
                } else {
                    z6 = z5;
                }
                z = z4;
                onClickListener3 = onClickListener5;
                z2 = z6;
                drawable = drawableB3;
                onClickListener2 = onClickListener4;
                onClickListener = null;
            } else {
                j5 = 3200;
            }
            j8 = j & 3104;
            if (j8 != 0) {
                if (d3Var != null) {
                    observableBooleanM = d3Var.M();
                } else {
                    observableBooleanM = null;
                }
                j6 = 3136;
                p1(5, observableBooleanM);
                if (observableBooleanM != null) {
                    z3 = observableBooleanM.get();
                } else {
                    z3 = false;
                }
                if (j8 != 0) {
                    if (z3) {
                        j15 = 131072;
                    } else {
                        j15 = 65536;
                    }
                    j |= j15;
                }
                Context context12 = this.K.getContext();
                if (z3) {
                    i5 = com.zentraedi.comic.q.h.Yo;
                } else {
                    i5 = com.zentraedi.comic.q.h.hp;
                }
                drawableB = g.a.b(context12, i5);
            } else {
                j6 = 3136;
                drawableB = null;
                z3 = false;
            }
            j9 = j & j6;
            if (j9 != 0) {
                if (d3Var != null) {
                    observableBooleanU = d3Var.U();
                } else {
                    observableBooleanU = null;
                }
                j2 = 3104;
                p1(6, observableBooleanU);
                if (observableBooleanU != null) {
                    z8 = observableBooleanU.get();
                } else {
                    z8 = false;
                }
                if (j9 != 0) {
                    if (z8) {
                        j14 = 8192;
                    } else {
                        j14 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                    }
                    j |= j14;
                }
                if (z8) {
                    i3 = 8;
                }
                j10 = j & j5;
                if (j10 == 0) {
                    i = 0;
                } else {
                    if (d3Var != null) {
                        observableBooleanO = d3Var.O();
                    } else {
                        observableBooleanO = null;
                    }
                    p1(7, observableBooleanO);
                    if (observableBooleanO != null) {
                        z7 = observableBooleanO.get();
                    } else {
                        z7 = false;
                    }
                    if (j10 != 0) {
                        if (z7) {
                            j13 = 524288;
                        } else {
                            j13 = 262144;
                        }
                        j |= j13;
                    }
                    if (z7) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                }
                j11 = j & j4;
                if (j11 != 0) {
                    if (d3Var != null) {
                        observableBooleanT = d3Var.T();
                    } else {
                        observableBooleanT = null;
                    }
                    p1(8, observableBooleanT);
                    if (observableBooleanT != null) {
                        z5 = observableBooleanT.get();
                    } else {
                        z5 = false;
                    }
                    if (j11 != 0) {
                        if (z5) {
                            j12 = 32768;
                        } else {
                            j12 = 16384;
                        }
                        j |= j12;
                    }
                    Context context13 = this.H.getContext();
                    if (z5) {
                        i4 = com.zentraedi.comic.q.h.fH;
                    } else {
                        i4 = com.zentraedi.comic.q.h.eH;
                    }
                    drawableB2 = g.a.b(context13, i4);
                } else {
                    z5 = false;
                    drawableB2 = null;
                }
                if ((j & j3) != 0) {
                    if (d3Var != 0) {
                        observableFieldS = d3Var.S();
                    } else {
                        observableFieldS = null;
                    }
                    z6 = z5;
                    p1(9, observableFieldS);
                    if (observableFieldS != null) {
                        View.OnClickListener onClickListener12 = (View.OnClickListener) observableFieldS.get();
                        onClickListener3 = onClickListener5;
                        drawable = drawableB3;
                        onClickListener2 = onClickListener4;
                        onClickListener = onClickListener12;
                        z = z4;
                        z2 = z6;
                    }
                } else {
                    z6 = z5;
                }
                z = z4;
                onClickListener3 = onClickListener5;
                z2 = z6;
                drawable = drawableB3;
                onClickListener2 = onClickListener4;
                onClickListener = null;
            } else {
                j2 = 3104;
            }
            i3 = 0;
            j10 = j & j5;
            if (j10 == 0) {
                i = 0;
            } else {
                if (d3Var != null) {
                    observableBooleanO = d3Var.O();
                } else {
                    observableBooleanO = null;
                }
                p1(7, observableBooleanO);
                if (observableBooleanO != null) {
                    z7 = observableBooleanO.get();
                } else {
                    z7 = false;
                }
                if (j10 != 0) {
                    if (z7) {
                        j13 = 524288;
                    } else {
                        j13 = 262144;
                    }
                    j |= j13;
                }
                if (z7) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            j11 = j & j4;
            if (j11 != 0) {
                if (d3Var != null) {
                    observableBooleanT = d3Var.T();
                } else {
                    observableBooleanT = null;
                }
                p1(8, observableBooleanT);
                if (observableBooleanT != null) {
                    z5 = observableBooleanT.get();
                } else {
                    z5 = false;
                }
                if (j11 != 0) {
                    if (z5) {
                        j12 = 32768;
                    } else {
                        j12 = 16384;
                    }
                    j |= j12;
                }
                Context context14 = this.H.getContext();
                if (z5) {
                    i4 = com.zentraedi.comic.q.h.fH;
                } else {
                    i4 = com.zentraedi.comic.q.h.eH;
                }
                drawableB2 = g.a.b(context14, i4);
            } else {
                z5 = false;
                drawableB2 = null;
            }
            if ((j & j3) != 0) {
                if (d3Var != 0) {
                    observableFieldS = d3Var.S();
                } else {
                    observableFieldS = null;
                }
                z6 = z5;
                p1(9, observableFieldS);
                if (observableFieldS != null) {
                    View.OnClickListener onClickListener13 = (View.OnClickListener) observableFieldS.get();
                    onClickListener3 = onClickListener5;
                    drawable = drawableB3;
                    onClickListener2 = onClickListener4;
                    onClickListener = onClickListener13;
                    z = z4;
                    z2 = z6;
                }
            } else {
                z6 = z5;
            }
            z = z4;
            onClickListener3 = onClickListener5;
            z2 = z6;
            drawable = drawableB3;
            onClickListener2 = onClickListener4;
            onClickListener = null;
        } else {
            j2 = 3104;
            j3 = 3584;
            j4 = 3328;
            j5 = 3200;
            j6 = 3136;
            z = false;
            z2 = false;
            i = 0;
            i2 = 0;
            onClickListener = null;
            onClickListener2 = null;
            drawable = null;
            str = null;
            drawableB = null;
            z3 = false;
            i3 = 0;
            drawableB2 = null;
            onClickListener3 = null;
        }
        long j18 = j;
        if ((j & j4) != 0) {
            this.G.setEnabled(z2);
            androidx.databinding.adapters.p.a(this.H, drawableB2);
            this.I.setEnabled(z2);
        }
        if ((j18 & j3) != 0) {
            this.G.setOnClickListener(onClickListener);
        }
        if ((j18 & j6) != 0) {
            this.G.setVisibility(i3);
        }
        if ((j18 & j2) != 0) {
            this.J.setEnabled(z3);
            androidx.databinding.adapters.p.a(this.K, drawableB);
            this.L.setEnabled(z3);
        }
        if ((j18 & 3074) != 0) {
            this.J.setOnClickListener(onClickListener2);
        }
        if ((j18 & j5) != 0) {
            this.J.setVisibility(i);
        }
        if ((j18 & 3088) != 0) {
            androidx.databinding.adapters.f0.A(this.L, str);
        }
        if ((j18 & 3076) != 0) {
            this.M.setEnabled(z);
            androidx.databinding.adapters.p.a(this.N, drawable);
            this.O.setEnabled(z);
        }
        if ((j18 & 3080) != 0) {
            this.M.setOnClickListener(onClickListener3);
        }
        if ((j18 & 3073) != 0) {
            this.M.setVisibility(i2);
        }
    }

    private s4(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 10);
        this.P = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.F = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.G = linearLayout2;
        linearLayout2.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.H = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.I = textView;
        textView.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[4];
        this.J = linearLayout3;
        linearLayout3.setTag(null);
        ImageView imageView2 = (ImageView) objArr[5];
        this.K = imageView2;
        imageView2.setTag(null);
        TextView textView2 = (TextView) objArr[6];
        this.L = textView2;
        textView2.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[7];
        this.M = linearLayout4;
        linearLayout4.setTag(null);
        ImageView imageView3 = (ImageView) objArr[8];
        this.N = imageView3;
        imageView3.setTag(null);
        TextView textView3 = (TextView) objArr[9];
        this.O = textView3;
        textView3.setTag(null);
        P0(view);
        i0();
    }
}
