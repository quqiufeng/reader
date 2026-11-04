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
public class w4 extends v4 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i M = null;

    @androidx.annotation.p0
    private static final SparseIntArray N = null;

    @androidx.annotation.n0
    private final TextView H;

    @androidx.annotation.n0
    private final TextView I;

    @androidx.annotation.n0
    private final ImageView J;

    @androidx.annotation.n0
    private final ImageView K;
    private long L;

    public w4(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 6, M, N));
    }

    private boolean D1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 512;
        }
        return true;
    }

    private boolean E1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 2;
        }
        return true;
    }

    private boolean F1(ObservableField<View.OnClickListener> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 8;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    private boolean I1(ObservableField<View.OnClickListener> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 128;
        }
        return true;
    }

    private boolean J1(ObservableField<View.OnClickListener> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 256;
        }
        return true;
    }

    private boolean K1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 32;
        }
        return true;
    }

    private boolean L1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 4;
        }
        return true;
    }

    private boolean N1(ObservableField<View.OnClickListener> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
        return true;
    }

    private boolean O1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 64;
        }
        return true;
    }

    private boolean P1(ObservableField<Drawable> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 16;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.v4
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.b3 b3Var) {
        this.G = b3Var;
        synchronized (this) {
            this.L |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.U0);
        super.C0();
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.L = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.U0 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.b3) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return G1((ObservableField) obj, i2);
            case 1:
                return E1((ObservableBoolean) obj, i2);
            case 2:
                return L1((ObservableField) obj, i2);
            case 3:
                return F1((ObservableField) obj, i2);
            case 4:
                return P1((ObservableField) obj, i2);
            case 5:
                return K1((ObservableBoolean) obj, i2);
            case 6:
                return O1((ObservableField) obj, i2);
            case 7:
                return I1((ObservableField) obj, i2);
            case 8:
                return J1((ObservableField) obj, i2);
            case 9:
                return D1((ObservableBoolean) obj, i2);
            case 10:
                return N1((ObservableField) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0138  */
    /* JADX WARN: Code duplicated, block: B:108:0x013f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0146  */
    /* JADX WARN: Code duplicated, block: B:112:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x014f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x015a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0161  */
    /* JADX WARN: Code duplicated, block: B:121:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x016a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0177  */
    /* JADX WARN: Code duplicated, block: B:127:0x0182  */
    /* JADX WARN: Code duplicated, block: B:128:0x0189  */
    /* JADX WARN: Code duplicated, block: B:130:0x018d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x018f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0194  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:139:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:155:0x0203  */
    /* JADX WARN: Code duplicated, block: B:158:0x020e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0219  */
    /* JADX WARN: Code duplicated, block: B:164:0x022e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0239  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0244  */
    /* JADX WARN: Code duplicated, block: B:173:0x024f  */
    /* JADX WARN: Code duplicated, block: B:176:0x025a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0265  */
    /* JADX WARN: Code duplicated, block: B:182:0x0270  */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x0103  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0123  */
    protected void r() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        Drawable drawableB;
        boolean z;
        int i;
        String str;
        View.OnClickListener onClickListener;
        int i2;
        View.OnClickListener onClickListener2;
        Drawable drawable;
        int i3;
        String str2;
        View.OnClickListener onClickListener3;
        View.OnClickListener onClickListener4;
        long j7;
        long j8;
        ObservableField<View.OnClickListener> observableFieldR;
        androidx.databinding.u uVarL;
        boolean z2;
        int i4;
        long j9;
        ObservableField<View.OnClickListener> observableFieldO;
        ObservableField<View.OnClickListener> observableFieldN;
        ObservableField<String> observableFieldS;
        ObservableBoolean observableBooleanP;
        boolean z3;
        long j10;
        ObservableField<Drawable> observableFieldT;
        ObservableField<View.OnClickListener> observableFieldM;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        com.zentraedi.comic.viewmodel.b3 b3Var = this.G;
        if ((8191 & j) != 0) {
            if ((j & 6145) == 0) {
                str = null;
            } else {
                ObservableField<String> numDesc = b3Var != null ? b3Var.getNumDesc() : null;
                p1(0, numDesc);
                if (numDesc != null) {
                    str = (String) numDesc.get();
                } else {
                    str = null;
                }
            }
            if ((j & 6146) != 0) {
                androidx.databinding.u uVarV = b3Var != null ? b3Var.V() : null;
                p1(1, uVarV);
                z = !(uVarV != null ? uVarV.get() : false);
            } else {
                z = false;
            }
            long j11 = j & 6148;
            j3 = 7168;
            if (j11 != 0) {
                ObservableField<Boolean> observableFieldQ = b3Var != null ? b3Var.Q() : null;
                j4 = 6656;
                p1(2, observableFieldQ);
                boolean zK0 = androidx.databinding.c0.K0(observableFieldQ != null ? (Boolean) observableFieldQ.get() : null);
                if (j11 != 0) {
                    j |= zK0 ? 1064960L : 532480L;
                }
                i = zK0 ? 8 : 0;
                if (!zK0) {
                    i2 = 8;
                }
                if ((j & 6152) == 0) {
                    onClickListener2 = null;
                } else {
                    if (b3Var != null) {
                        observableFieldM = b3Var.M();
                    } else {
                        observableFieldM = null;
                    }
                    p1(3, observableFieldM);
                    if (observableFieldM != null) {
                        onClickListener2 = (View.OnClickListener) observableFieldM.get();
                    } else {
                        onClickListener2 = null;
                    }
                }
                if ((j & 6160) != 0) {
                    if (b3Var != null) {
                        observableFieldT = b3Var.T();
                    } else {
                        observableFieldT = null;
                    }
                    j5 = 6400;
                    p1(4, observableFieldT);
                    drawable = observableFieldT != null ? (Drawable) observableFieldT.get() : null;
                    j7 = j & 6176;
                    if (j7 != 0) {
                        if (b3Var != null) {
                            observableBooleanP = b3Var.P();
                        } else {
                            observableBooleanP = null;
                        }
                        j6 = 6272;
                        p1(5, observableBooleanP);
                        if (observableBooleanP != null) {
                            z3 = observableBooleanP.get();
                        } else {
                            z3 = false;
                        }
                        if (j7 != 0) {
                            if (z3) {
                                j10 = 65536;
                            } else {
                                j10 = 32768;
                            }
                            j |= j10;
                        }
                        if (z3) {
                            i3 = 8;
                        }
                        if ((j & 6208) == 0) {
                            str2 = null;
                        } else {
                            if (b3Var != null) {
                                observableFieldS = b3Var.S();
                            } else {
                                observableFieldS = null;
                            }
                            p1(6, observableFieldS);
                            if (observableFieldS != null) {
                                str2 = (String) observableFieldS.get();
                            } else {
                                str2 = null;
                            }
                        }
                        if ((j & j6) == 0) {
                            onClickListener3 = null;
                        } else {
                            if (b3Var != null) {
                                observableFieldN = b3Var.N();
                            } else {
                                observableFieldN = null;
                            }
                            p1(7, observableFieldN);
                            if (observableFieldN != null) {
                                onClickListener3 = (View.OnClickListener) observableFieldN.get();
                            } else {
                                onClickListener3 = null;
                            }
                        }
                        if ((j & j5) == 0) {
                            onClickListener = null;
                        } else {
                            if (b3Var != null) {
                                observableFieldO = b3Var.O();
                            } else {
                                observableFieldO = null;
                            }
                            p1(8, observableFieldO);
                            if (observableFieldO != null) {
                                onClickListener = (View.OnClickListener) observableFieldO.get();
                            } else {
                                onClickListener = null;
                            }
                        }
                        j8 = j & j4;
                        if (j8 != 0) {
                            if (b3Var != null) {
                                uVarL = b3Var.L();
                                j2 = 6208;
                            } else {
                                j2 = 6208;
                                uVarL = null;
                            }
                            p1(9, uVarL);
                            if (uVarL != null) {
                                z2 = uVarL.get();
                            } else {
                                z2 = false;
                            }
                            if (j8 != 0) {
                                if (z2) {
                                    j9 = 262144;
                                } else {
                                    j9 = 131072;
                                }
                                j |= j9;
                            }
                            Context context = this.K.getContext();
                            if (z2) {
                                i4 = com.zentraedi.comic.q.h.LO;
                            } else {
                                i4 = com.zentraedi.comic.q.h.OO;
                            }
                            drawableB = g.a.b(context, i4);
                        } else {
                            j2 = 6208;
                            drawableB = null;
                        }
                        if ((j & 7168) == 0) {
                            if (b3Var != 0) {
                                observableFieldR = b3Var.R();
                            } else {
                                observableFieldR = null;
                            }
                            p1(10, observableFieldR);
                            onClickListener4 = observableFieldR != null ? (View.OnClickListener) observableFieldR.get() : null;
                        }
                        if ((j & 6146) != 0) {
                            this.F.setEnabled(z);
                            this.H.setEnabled(z);
                            this.J.setEnabled(z);
                            this.K.setEnabled(z);
                        }
                        if ((j & j6) != 0) {
                            this.F.setOnClickListener(onClickListener3);
                        }
                        if ((j & 6160) != 0) {
                            androidx.databinding.adapters.p.a(this.F, drawable);
                        }
                        if ((j & 6148) != 0) {
                            this.F.setVisibility(i2);
                            this.H.setVisibility(i2);
                            this.I.setVisibility(i);
                        }
                        if ((j & j3) != 0) {
                            this.H.setOnClickListener(onClickListener4);
                        }
                        if ((j & j2) != 0) {
                            androidx.databinding.adapters.f0.A(this.H, str2);
                        }
                        if ((j & 6145) != 0) {
                            androidx.databinding.adapters.f0.A(this.I, str);
                        }
                        if ((j & j5) != 0) {
                            this.J.setOnClickListener(onClickListener);
                        }
                        if ((j & 6176) != 0) {
                            this.J.setVisibility(i3);
                        }
                        if ((j & 6152) != 0) {
                            this.K.setOnClickListener(onClickListener2);
                        }
                        if ((j & j4) != 0) {
                            androidx.databinding.adapters.p.a(this.K, drawableB);
                        }
                    }
                    j6 = 6272;
                    i3 = 0;
                    if ((j & 6208) == 0) {
                        str2 = null;
                    } else {
                        if (b3Var != null) {
                            observableFieldS = b3Var.S();
                        } else {
                            observableFieldS = null;
                        }
                        p1(6, observableFieldS);
                        if (observableFieldS != null) {
                            str2 = (String) observableFieldS.get();
                        } else {
                            str2 = null;
                        }
                    }
                    if ((j & j6) == 0) {
                        onClickListener3 = null;
                    } else {
                        if (b3Var != null) {
                            observableFieldN = b3Var.N();
                        } else {
                            observableFieldN = null;
                        }
                        p1(7, observableFieldN);
                        if (observableFieldN != null) {
                            onClickListener3 = (View.OnClickListener) observableFieldN.get();
                        } else {
                            onClickListener3 = null;
                        }
                    }
                    if ((j & j5) == 0) {
                        onClickListener = null;
                    } else {
                        if (b3Var != null) {
                            observableFieldO = b3Var.O();
                        } else {
                            observableFieldO = null;
                        }
                        p1(8, observableFieldO);
                        if (observableFieldO != null) {
                            onClickListener = (View.OnClickListener) observableFieldO.get();
                        } else {
                            onClickListener = null;
                        }
                    }
                    j8 = j & j4;
                    if (j8 != 0) {
                        if (b3Var != null) {
                            uVarL = b3Var.L();
                            j2 = 6208;
                        } else {
                            j2 = 6208;
                            uVarL = null;
                        }
                        p1(9, uVarL);
                        if (uVarL != null) {
                            z2 = uVarL.get();
                        } else {
                            z2 = false;
                        }
                        if (j8 != 0) {
                            if (z2) {
                                j9 = 262144;
                            } else {
                                j9 = 131072;
                            }
                            j |= j9;
                        }
                        Context context2 = this.K.getContext();
                        if (z2) {
                            i4 = com.zentraedi.comic.q.h.LO;
                        } else {
                            i4 = com.zentraedi.comic.q.h.OO;
                        }
                        drawableB = g.a.b(context2, i4);
                    } else {
                        j2 = 6208;
                        drawableB = null;
                    }
                    if ((j & 7168) == 0) {
                        if (b3Var != 0) {
                            observableFieldR = b3Var.R();
                        } else {
                            observableFieldR = null;
                        }
                        p1(10, observableFieldR);
                        if (observableFieldR != null) {
                        }
                    }
                    if ((j & 6146) != 0) {
                        this.F.setEnabled(z);
                        this.H.setEnabled(z);
                        this.J.setEnabled(z);
                        this.K.setEnabled(z);
                    }
                    if ((j & j6) != 0) {
                        this.F.setOnClickListener(onClickListener3);
                    }
                    if ((j & 6160) != 0) {
                        androidx.databinding.adapters.p.a(this.F, drawable);
                    }
                    if ((j & 6148) != 0) {
                        this.F.setVisibility(i2);
                        this.H.setVisibility(i2);
                        this.I.setVisibility(i);
                    }
                    if ((j & j3) != 0) {
                        this.H.setOnClickListener(onClickListener4);
                    }
                    if ((j & j2) != 0) {
                        androidx.databinding.adapters.f0.A(this.H, str2);
                    }
                    if ((j & 6145) != 0) {
                        androidx.databinding.adapters.f0.A(this.I, str);
                    }
                    if ((j & j5) != 0) {
                        this.J.setOnClickListener(onClickListener);
                    }
                    if ((j & 6176) != 0) {
                        this.J.setVisibility(i3);
                    }
                    if ((j & 6152) != 0) {
                        this.K.setOnClickListener(onClickListener2);
                    }
                    if ((j & j4) != 0) {
                        androidx.databinding.adapters.p.a(this.K, drawableB);
                    }
                }
                j5 = 6400;
                j7 = j & 6176;
                if (j7 != 0) {
                    if (b3Var != null) {
                        observableBooleanP = b3Var.P();
                    } else {
                        observableBooleanP = null;
                    }
                    j6 = 6272;
                    p1(5, observableBooleanP);
                    if (observableBooleanP != null) {
                        z3 = observableBooleanP.get();
                    } else {
                        z3 = false;
                    }
                    if (j7 != 0) {
                        if (z3) {
                            j10 = 65536;
                        } else {
                            j10 = 32768;
                        }
                        j |= j10;
                    }
                    if (z3) {
                        i3 = 8;
                    }
                    if ((j & 6208) == 0) {
                        str2 = null;
                    } else {
                        if (b3Var != null) {
                            observableFieldS = b3Var.S();
                        } else {
                            observableFieldS = null;
                        }
                        p1(6, observableFieldS);
                        if (observableFieldS != null) {
                            str2 = (String) observableFieldS.get();
                        } else {
                            str2 = null;
                        }
                    }
                    if ((j & j6) == 0) {
                        onClickListener3 = null;
                    } else {
                        if (b3Var != null) {
                            observableFieldN = b3Var.N();
                        } else {
                            observableFieldN = null;
                        }
                        p1(7, observableFieldN);
                        if (observableFieldN != null) {
                            onClickListener3 = (View.OnClickListener) observableFieldN.get();
                        } else {
                            onClickListener3 = null;
                        }
                    }
                    if ((j & j5) == 0) {
                        onClickListener = null;
                    } else {
                        if (b3Var != null) {
                            observableFieldO = b3Var.O();
                        } else {
                            observableFieldO = null;
                        }
                        p1(8, observableFieldO);
                        if (observableFieldO != null) {
                            onClickListener = (View.OnClickListener) observableFieldO.get();
                        } else {
                            onClickListener = null;
                        }
                    }
                    j8 = j & j4;
                    if (j8 != 0) {
                        if (b3Var != null) {
                            uVarL = b3Var.L();
                            j2 = 6208;
                        } else {
                            j2 = 6208;
                            uVarL = null;
                        }
                        p1(9, uVarL);
                        if (uVarL != null) {
                            z2 = uVarL.get();
                        } else {
                            z2 = false;
                        }
                        if (j8 != 0) {
                            if (z2) {
                                j9 = 262144;
                            } else {
                                j9 = 131072;
                            }
                            j |= j9;
                        }
                        Context context3 = this.K.getContext();
                        if (z2) {
                            i4 = com.zentraedi.comic.q.h.LO;
                        } else {
                            i4 = com.zentraedi.comic.q.h.OO;
                        }
                        drawableB = g.a.b(context3, i4);
                    } else {
                        j2 = 6208;
                        drawableB = null;
                    }
                    if ((j & 7168) == 0) {
                        if (b3Var != 0) {
                            observableFieldR = b3Var.R();
                        } else {
                            observableFieldR = null;
                        }
                        p1(10, observableFieldR);
                        if (observableFieldR != null) {
                        }
                    }
                    if ((j & 6146) != 0) {
                        this.F.setEnabled(z);
                        this.H.setEnabled(z);
                        this.J.setEnabled(z);
                        this.K.setEnabled(z);
                    }
                    if ((j & j6) != 0) {
                        this.F.setOnClickListener(onClickListener3);
                    }
                    if ((j & 6160) != 0) {
                        androidx.databinding.adapters.p.a(this.F, drawable);
                    }
                    if ((j & 6148) != 0) {
                        this.F.setVisibility(i2);
                        this.H.setVisibility(i2);
                        this.I.setVisibility(i);
                    }
                    if ((j & j3) != 0) {
                        this.H.setOnClickListener(onClickListener4);
                    }
                    if ((j & j2) != 0) {
                        androidx.databinding.adapters.f0.A(this.H, str2);
                    }
                    if ((j & 6145) != 0) {
                        androidx.databinding.adapters.f0.A(this.I, str);
                    }
                    if ((j & j5) != 0) {
                        this.J.setOnClickListener(onClickListener);
                    }
                    if ((j & 6176) != 0) {
                        this.J.setVisibility(i3);
                    }
                    if ((j & 6152) != 0) {
                        this.K.setOnClickListener(onClickListener2);
                    }
                    if ((j & j4) != 0) {
                        androidx.databinding.adapters.p.a(this.K, drawableB);
                    }
                }
                j6 = 6272;
                i3 = 0;
                if ((j & 6208) == 0) {
                    str2 = null;
                } else {
                    if (b3Var != null) {
                        observableFieldS = b3Var.S();
                    } else {
                        observableFieldS = null;
                    }
                    p1(6, observableFieldS);
                    if (observableFieldS != null) {
                        str2 = (String) observableFieldS.get();
                    } else {
                        str2 = null;
                    }
                }
                if ((j & j6) == 0) {
                    onClickListener3 = null;
                } else {
                    if (b3Var != null) {
                        observableFieldN = b3Var.N();
                    } else {
                        observableFieldN = null;
                    }
                    p1(7, observableFieldN);
                    if (observableFieldN != null) {
                        onClickListener3 = (View.OnClickListener) observableFieldN.get();
                    } else {
                        onClickListener3 = null;
                    }
                }
                if ((j & j5) == 0) {
                    onClickListener = null;
                } else {
                    if (b3Var != null) {
                        observableFieldO = b3Var.O();
                    } else {
                        observableFieldO = null;
                    }
                    p1(8, observableFieldO);
                    if (observableFieldO != null) {
                        onClickListener = (View.OnClickListener) observableFieldO.get();
                    } else {
                        onClickListener = null;
                    }
                }
                j8 = j & j4;
                if (j8 != 0) {
                    if (b3Var != null) {
                        uVarL = b3Var.L();
                        j2 = 6208;
                    } else {
                        j2 = 6208;
                        uVarL = null;
                    }
                    p1(9, uVarL);
                    if (uVarL != null) {
                        z2 = uVarL.get();
                    } else {
                        z2 = false;
                    }
                    if (j8 != 0) {
                        if (z2) {
                            j9 = 262144;
                        } else {
                            j9 = 131072;
                        }
                        j |= j9;
                    }
                    Context context4 = this.K.getContext();
                    if (z2) {
                        i4 = com.zentraedi.comic.q.h.LO;
                    } else {
                        i4 = com.zentraedi.comic.q.h.OO;
                    }
                    drawableB = g.a.b(context4, i4);
                } else {
                    j2 = 6208;
                    drawableB = null;
                }
                if ((j & 7168) == 0) {
                    if (b3Var != 0) {
                        observableFieldR = b3Var.R();
                    } else {
                        observableFieldR = null;
                    }
                    p1(10, observableFieldR);
                    if (observableFieldR != null) {
                    }
                }
                if ((j & 6146) != 0) {
                    this.F.setEnabled(z);
                    this.H.setEnabled(z);
                    this.J.setEnabled(z);
                    this.K.setEnabled(z);
                }
                if ((j & j6) != 0) {
                    this.F.setOnClickListener(onClickListener3);
                }
                if ((j & 6160) != 0) {
                    androidx.databinding.adapters.p.a(this.F, drawable);
                }
                if ((j & 6148) != 0) {
                    this.F.setVisibility(i2);
                    this.H.setVisibility(i2);
                    this.I.setVisibility(i);
                }
                if ((j & j3) != 0) {
                    this.H.setOnClickListener(onClickListener4);
                }
                if ((j & j2) != 0) {
                    androidx.databinding.adapters.f0.A(this.H, str2);
                }
                if ((j & 6145) != 0) {
                    androidx.databinding.adapters.f0.A(this.I, str);
                }
                if ((j & j5) != 0) {
                    this.J.setOnClickListener(onClickListener);
                }
                if ((j & 6176) != 0) {
                    this.J.setVisibility(i3);
                }
                if ((j & 6152) != 0) {
                    this.K.setOnClickListener(onClickListener2);
                }
                if ((j & j4) != 0) {
                    androidx.databinding.adapters.p.a(this.K, drawableB);
                }
            }
            j4 = 6656;
            i = 0;
            i2 = 0;
            if ((j & 6152) == 0) {
                onClickListener2 = null;
            } else {
                if (b3Var != null) {
                    observableFieldM = b3Var.M();
                } else {
                    observableFieldM = null;
                }
                p1(3, observableFieldM);
                if (observableFieldM != null) {
                    onClickListener2 = (View.OnClickListener) observableFieldM.get();
                } else {
                    onClickListener2 = null;
                }
            }
            if ((j & 6160) != 0) {
                if (b3Var != null) {
                    observableFieldT = b3Var.T();
                } else {
                    observableFieldT = null;
                }
                j5 = 6400;
                p1(4, observableFieldT);
                if (observableFieldT != null) {
                }
                j7 = j & 6176;
                if (j7 != 0) {
                    if (b3Var != null) {
                        observableBooleanP = b3Var.P();
                    } else {
                        observableBooleanP = null;
                    }
                    j6 = 6272;
                    p1(5, observableBooleanP);
                    if (observableBooleanP != null) {
                        z3 = observableBooleanP.get();
                    } else {
                        z3 = false;
                    }
                    if (j7 != 0) {
                        if (z3) {
                            j10 = 65536;
                        } else {
                            j10 = 32768;
                        }
                        j |= j10;
                    }
                    if (z3) {
                        i3 = 8;
                    }
                    if ((j & 6208) == 0) {
                        str2 = null;
                    } else {
                        if (b3Var != null) {
                            observableFieldS = b3Var.S();
                        } else {
                            observableFieldS = null;
                        }
                        p1(6, observableFieldS);
                        if (observableFieldS != null) {
                            str2 = (String) observableFieldS.get();
                        } else {
                            str2 = null;
                        }
                    }
                    if ((j & j6) == 0) {
                        onClickListener3 = null;
                    } else {
                        if (b3Var != null) {
                            observableFieldN = b3Var.N();
                        } else {
                            observableFieldN = null;
                        }
                        p1(7, observableFieldN);
                        if (observableFieldN != null) {
                            onClickListener3 = (View.OnClickListener) observableFieldN.get();
                        } else {
                            onClickListener3 = null;
                        }
                    }
                    if ((j & j5) == 0) {
                        onClickListener = null;
                    } else {
                        if (b3Var != null) {
                            observableFieldO = b3Var.O();
                        } else {
                            observableFieldO = null;
                        }
                        p1(8, observableFieldO);
                        if (observableFieldO != null) {
                            onClickListener = (View.OnClickListener) observableFieldO.get();
                        } else {
                            onClickListener = null;
                        }
                    }
                    j8 = j & j4;
                    if (j8 != 0) {
                        if (b3Var != null) {
                            uVarL = b3Var.L();
                            j2 = 6208;
                        } else {
                            j2 = 6208;
                            uVarL = null;
                        }
                        p1(9, uVarL);
                        if (uVarL != null) {
                            z2 = uVarL.get();
                        } else {
                            z2 = false;
                        }
                        if (j8 != 0) {
                            if (z2) {
                                j9 = 262144;
                            } else {
                                j9 = 131072;
                            }
                            j |= j9;
                        }
                        Context context5 = this.K.getContext();
                        if (z2) {
                            i4 = com.zentraedi.comic.q.h.LO;
                        } else {
                            i4 = com.zentraedi.comic.q.h.OO;
                        }
                        drawableB = g.a.b(context5, i4);
                    } else {
                        j2 = 6208;
                        drawableB = null;
                    }
                    if ((j & 7168) == 0) {
                        if (b3Var != 0) {
                            observableFieldR = b3Var.R();
                        } else {
                            observableFieldR = null;
                        }
                        p1(10, observableFieldR);
                        if (observableFieldR != null) {
                        }
                    }
                    if ((j & 6146) != 0) {
                        this.F.setEnabled(z);
                        this.H.setEnabled(z);
                        this.J.setEnabled(z);
                        this.K.setEnabled(z);
                    }
                    if ((j & j6) != 0) {
                        this.F.setOnClickListener(onClickListener3);
                    }
                    if ((j & 6160) != 0) {
                        androidx.databinding.adapters.p.a(this.F, drawable);
                    }
                    if ((j & 6148) != 0) {
                        this.F.setVisibility(i2);
                        this.H.setVisibility(i2);
                        this.I.setVisibility(i);
                    }
                    if ((j & j3) != 0) {
                        this.H.setOnClickListener(onClickListener4);
                    }
                    if ((j & j2) != 0) {
                        androidx.databinding.adapters.f0.A(this.H, str2);
                    }
                    if ((j & 6145) != 0) {
                        androidx.databinding.adapters.f0.A(this.I, str);
                    }
                    if ((j & j5) != 0) {
                        this.J.setOnClickListener(onClickListener);
                    }
                    if ((j & 6176) != 0) {
                        this.J.setVisibility(i3);
                    }
                    if ((j & 6152) != 0) {
                        this.K.setOnClickListener(onClickListener2);
                    }
                    if ((j & j4) != 0) {
                        androidx.databinding.adapters.p.a(this.K, drawableB);
                    }
                }
                j6 = 6272;
                i3 = 0;
                if ((j & 6208) == 0) {
                    str2 = null;
                } else {
                    if (b3Var != null) {
                        observableFieldS = b3Var.S();
                    } else {
                        observableFieldS = null;
                    }
                    p1(6, observableFieldS);
                    if (observableFieldS != null) {
                        str2 = (String) observableFieldS.get();
                    } else {
                        str2 = null;
                    }
                }
                if ((j & j6) == 0) {
                    onClickListener3 = null;
                } else {
                    if (b3Var != null) {
                        observableFieldN = b3Var.N();
                    } else {
                        observableFieldN = null;
                    }
                    p1(7, observableFieldN);
                    if (observableFieldN != null) {
                        onClickListener3 = (View.OnClickListener) observableFieldN.get();
                    } else {
                        onClickListener3 = null;
                    }
                }
                if ((j & j5) == 0) {
                    onClickListener = null;
                } else {
                    if (b3Var != null) {
                        observableFieldO = b3Var.O();
                    } else {
                        observableFieldO = null;
                    }
                    p1(8, observableFieldO);
                    if (observableFieldO != null) {
                        onClickListener = (View.OnClickListener) observableFieldO.get();
                    } else {
                        onClickListener = null;
                    }
                }
                j8 = j & j4;
                if (j8 != 0) {
                    if (b3Var != null) {
                        uVarL = b3Var.L();
                        j2 = 6208;
                    } else {
                        j2 = 6208;
                        uVarL = null;
                    }
                    p1(9, uVarL);
                    if (uVarL != null) {
                        z2 = uVarL.get();
                    } else {
                        z2 = false;
                    }
                    if (j8 != 0) {
                        if (z2) {
                            j9 = 262144;
                        } else {
                            j9 = 131072;
                        }
                        j |= j9;
                    }
                    Context context6 = this.K.getContext();
                    if (z2) {
                        i4 = com.zentraedi.comic.q.h.LO;
                    } else {
                        i4 = com.zentraedi.comic.q.h.OO;
                    }
                    drawableB = g.a.b(context6, i4);
                } else {
                    j2 = 6208;
                    drawableB = null;
                }
                if ((j & 7168) == 0) {
                    if (b3Var != 0) {
                        observableFieldR = b3Var.R();
                    } else {
                        observableFieldR = null;
                    }
                    p1(10, observableFieldR);
                    if (observableFieldR != null) {
                    }
                }
                if ((j & 6146) != 0) {
                    this.F.setEnabled(z);
                    this.H.setEnabled(z);
                    this.J.setEnabled(z);
                    this.K.setEnabled(z);
                }
                if ((j & j6) != 0) {
                    this.F.setOnClickListener(onClickListener3);
                }
                if ((j & 6160) != 0) {
                    androidx.databinding.adapters.p.a(this.F, drawable);
                }
                if ((j & 6148) != 0) {
                    this.F.setVisibility(i2);
                    this.H.setVisibility(i2);
                    this.I.setVisibility(i);
                }
                if ((j & j3) != 0) {
                    this.H.setOnClickListener(onClickListener4);
                }
                if ((j & j2) != 0) {
                    androidx.databinding.adapters.f0.A(this.H, str2);
                }
                if ((j & 6145) != 0) {
                    androidx.databinding.adapters.f0.A(this.I, str);
                }
                if ((j & j5) != 0) {
                    this.J.setOnClickListener(onClickListener);
                }
                if ((j & 6176) != 0) {
                    this.J.setVisibility(i3);
                }
                if ((j & 6152) != 0) {
                    this.K.setOnClickListener(onClickListener2);
                }
                if ((j & j4) != 0) {
                    androidx.databinding.adapters.p.a(this.K, drawableB);
                }
            }
            j5 = 6400;
            j7 = j & 6176;
            if (j7 != 0) {
                if (b3Var != null) {
                    observableBooleanP = b3Var.P();
                } else {
                    observableBooleanP = null;
                }
                j6 = 6272;
                p1(5, observableBooleanP);
                if (observableBooleanP != null) {
                    z3 = observableBooleanP.get();
                } else {
                    z3 = false;
                }
                if (j7 != 0) {
                    if (z3) {
                        j10 = 65536;
                    } else {
                        j10 = 32768;
                    }
                    j |= j10;
                }
                if (z3) {
                    i3 = 8;
                }
                if ((j & 6208) == 0) {
                    str2 = null;
                } else {
                    if (b3Var != null) {
                        observableFieldS = b3Var.S();
                    } else {
                        observableFieldS = null;
                    }
                    p1(6, observableFieldS);
                    if (observableFieldS != null) {
                        str2 = (String) observableFieldS.get();
                    } else {
                        str2 = null;
                    }
                }
                if ((j & j6) == 0) {
                    onClickListener3 = null;
                } else {
                    if (b3Var != null) {
                        observableFieldN = b3Var.N();
                    } else {
                        observableFieldN = null;
                    }
                    p1(7, observableFieldN);
                    if (observableFieldN != null) {
                        onClickListener3 = (View.OnClickListener) observableFieldN.get();
                    } else {
                        onClickListener3 = null;
                    }
                }
                if ((j & j5) == 0) {
                    onClickListener = null;
                } else {
                    if (b3Var != null) {
                        observableFieldO = b3Var.O();
                    } else {
                        observableFieldO = null;
                    }
                    p1(8, observableFieldO);
                    if (observableFieldO != null) {
                        onClickListener = (View.OnClickListener) observableFieldO.get();
                    } else {
                        onClickListener = null;
                    }
                }
                j8 = j & j4;
                if (j8 != 0) {
                    if (b3Var != null) {
                        uVarL = b3Var.L();
                        j2 = 6208;
                    } else {
                        j2 = 6208;
                        uVarL = null;
                    }
                    p1(9, uVarL);
                    if (uVarL != null) {
                        z2 = uVarL.get();
                    } else {
                        z2 = false;
                    }
                    if (j8 != 0) {
                        if (z2) {
                            j9 = 262144;
                        } else {
                            j9 = 131072;
                        }
                        j |= j9;
                    }
                    Context context7 = this.K.getContext();
                    if (z2) {
                        i4 = com.zentraedi.comic.q.h.LO;
                    } else {
                        i4 = com.zentraedi.comic.q.h.OO;
                    }
                    drawableB = g.a.b(context7, i4);
                } else {
                    j2 = 6208;
                    drawableB = null;
                }
                if ((j & 7168) == 0) {
                    if (b3Var != 0) {
                        observableFieldR = b3Var.R();
                    } else {
                        observableFieldR = null;
                    }
                    p1(10, observableFieldR);
                    if (observableFieldR != null) {
                    }
                }
                if ((j & 6146) != 0) {
                    this.F.setEnabled(z);
                    this.H.setEnabled(z);
                    this.J.setEnabled(z);
                    this.K.setEnabled(z);
                }
                if ((j & j6) != 0) {
                    this.F.setOnClickListener(onClickListener3);
                }
                if ((j & 6160) != 0) {
                    androidx.databinding.adapters.p.a(this.F, drawable);
                }
                if ((j & 6148) != 0) {
                    this.F.setVisibility(i2);
                    this.H.setVisibility(i2);
                    this.I.setVisibility(i);
                }
                if ((j & j3) != 0) {
                    this.H.setOnClickListener(onClickListener4);
                }
                if ((j & j2) != 0) {
                    androidx.databinding.adapters.f0.A(this.H, str2);
                }
                if ((j & 6145) != 0) {
                    androidx.databinding.adapters.f0.A(this.I, str);
                }
                if ((j & j5) != 0) {
                    this.J.setOnClickListener(onClickListener);
                }
                if ((j & 6176) != 0) {
                    this.J.setVisibility(i3);
                }
                if ((j & 6152) != 0) {
                    this.K.setOnClickListener(onClickListener2);
                }
                if ((j & j4) != 0) {
                    androidx.databinding.adapters.p.a(this.K, drawableB);
                }
            }
            j6 = 6272;
            i3 = 0;
            if ((j & 6208) == 0) {
                str2 = null;
            } else {
                if (b3Var != null) {
                    observableFieldS = b3Var.S();
                } else {
                    observableFieldS = null;
                }
                p1(6, observableFieldS);
                if (observableFieldS != null) {
                    str2 = (String) observableFieldS.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & j6) == 0) {
                onClickListener3 = null;
            } else {
                if (b3Var != null) {
                    observableFieldN = b3Var.N();
                } else {
                    observableFieldN = null;
                }
                p1(7, observableFieldN);
                if (observableFieldN != null) {
                    onClickListener3 = (View.OnClickListener) observableFieldN.get();
                } else {
                    onClickListener3 = null;
                }
            }
            if ((j & j5) == 0) {
                onClickListener = null;
            } else {
                if (b3Var != null) {
                    observableFieldO = b3Var.O();
                } else {
                    observableFieldO = null;
                }
                p1(8, observableFieldO);
                if (observableFieldO != null) {
                    onClickListener = (View.OnClickListener) observableFieldO.get();
                } else {
                    onClickListener = null;
                }
            }
            j8 = j & j4;
            if (j8 != 0) {
                if (b3Var != null) {
                    uVarL = b3Var.L();
                    j2 = 6208;
                } else {
                    j2 = 6208;
                    uVarL = null;
                }
                p1(9, uVarL);
                if (uVarL != null) {
                    z2 = uVarL.get();
                } else {
                    z2 = false;
                }
                if (j8 != 0) {
                    if (z2) {
                        j9 = 262144;
                    } else {
                        j9 = 131072;
                    }
                    j |= j9;
                }
                Context context8 = this.K.getContext();
                if (z2) {
                    i4 = com.zentraedi.comic.q.h.LO;
                } else {
                    i4 = com.zentraedi.comic.q.h.OO;
                }
                drawableB = g.a.b(context8, i4);
            } else {
                j2 = 6208;
                drawableB = null;
            }
            if ((j & 7168) == 0) {
                if (b3Var != 0) {
                    observableFieldR = b3Var.R();
                } else {
                    observableFieldR = null;
                }
                p1(10, observableFieldR);
                if (observableFieldR != null) {
                }
            }
            if ((j & 6146) != 0) {
                this.F.setEnabled(z);
                this.H.setEnabled(z);
                this.J.setEnabled(z);
                this.K.setEnabled(z);
            }
            if ((j & j6) != 0) {
                this.F.setOnClickListener(onClickListener3);
            }
            if ((j & 6160) != 0) {
                androidx.databinding.adapters.p.a(this.F, drawable);
            }
            if ((j & 6148) != 0) {
                this.F.setVisibility(i2);
                this.H.setVisibility(i2);
                this.I.setVisibility(i);
            }
            if ((j & j3) != 0) {
                this.H.setOnClickListener(onClickListener4);
            }
            if ((j & j2) != 0) {
                androidx.databinding.adapters.f0.A(this.H, str2);
            }
            if ((j & 6145) != 0) {
                androidx.databinding.adapters.f0.A(this.I, str);
            }
            if ((j & j5) != 0) {
                this.J.setOnClickListener(onClickListener);
            }
            if ((j & 6176) != 0) {
                this.J.setVisibility(i3);
            }
            if ((j & 6152) != 0) {
                this.K.setOnClickListener(onClickListener2);
            }
            if ((j & j4) != 0) {
                androidx.databinding.adapters.p.a(this.K, drawableB);
            }
        }
        j2 = 6208;
        j3 = 7168;
        j4 = 6656;
        j5 = 6400;
        j6 = 6272;
        drawableB = null;
        z = false;
        i = 0;
        str = null;
        onClickListener = null;
        i2 = 0;
        onClickListener2 = null;
        drawable = null;
        i3 = 0;
        str2 = null;
        onClickListener3 = null;
        if ((j & 6146) != 0) {
            this.F.setEnabled(z);
            this.H.setEnabled(z);
            this.J.setEnabled(z);
            this.K.setEnabled(z);
        }
        if ((j & j6) != 0) {
            this.F.setOnClickListener(onClickListener3);
        }
        if ((j & 6160) != 0) {
            androidx.databinding.adapters.p.a(this.F, drawable);
        }
        if ((j & 6148) != 0) {
            this.F.setVisibility(i2);
            this.H.setVisibility(i2);
            this.I.setVisibility(i);
        }
        if ((j & j3) != 0) {
            this.H.setOnClickListener(onClickListener4);
        }
        if ((j & j2) != 0) {
            androidx.databinding.adapters.f0.A(this.H, str2);
        }
        if ((j & 6145) != 0) {
            androidx.databinding.adapters.f0.A(this.I, str);
        }
        if ((j & j5) != 0) {
            this.J.setOnClickListener(onClickListener);
        }
        if ((j & 6176) != 0) {
            this.J.setVisibility(i3);
        }
        if ((j & 6152) != 0) {
            this.K.setOnClickListener(onClickListener2);
        }
        if ((j & j4) != 0) {
            androidx.databinding.adapters.p.a(this.K, drawableB);
        }
    }

    private w4(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 11, (LinearLayout) objArr[0], (ImageView) objArr[2]);
        this.L = -1L;
        this.E.setTag(null);
        this.F.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.H = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[3];
        this.I = textView2;
        textView2.setTag(null);
        ImageView imageView = (ImageView) objArr[4];
        this.J = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[5];
        this.K = imageView2;
        imageView2.setTag(null);
        P0(view);
        i0();
    }
}
