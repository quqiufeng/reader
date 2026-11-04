package com.zentraedi.comic.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class t2 extends s2 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i Z = null;

    @androidx.annotation.p0
    private static final SparseIntArray a0;

    @androidx.annotation.n0
    private final LinearLayout L;

    @androidx.annotation.n0
    private final RelativeLayout M;

    @androidx.annotation.n0
    private final TextView N;

    @androidx.annotation.n0
    private final TextView O;

    @androidx.annotation.n0
    private final View P;

    @androidx.annotation.n0
    private final View Q;

    @androidx.annotation.n0
    private final ImageView R;

    @androidx.annotation.n0
    private final ImageView S;

    @androidx.annotation.n0
    private final ImageView T;

    @androidx.annotation.n0
    private final ProgressBar U;

    @androidx.annotation.n0
    private final TextView V;

    @androidx.annotation.p0
    private final View.OnClickListener W;

    @androidx.annotation.p0
    private final View.OnClickListener X;
    private long Y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.NG, 13);
        sparseIntArray.put(com.zentraedi.comic.q.i.Pa, 14);
    }

    public t2(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 15, Z, a0));
    }

    private boolean I1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Y |= 8;
        }
        return true;
    }

    private boolean J1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Y |= 1;
        }
        return true;
    }

    private boolean K1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Y |= 2;
        }
        return true;
    }

    private boolean L1(ObservableField<Integer> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Y |= 4;
        }
        return true;
    }

    private boolean N1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Y |= 64;
        }
        return true;
    }

    private boolean O1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Y |= 256;
        }
        return true;
    }

    private boolean P1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Y |= 128;
        }
        return true;
    }

    private boolean Q1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Y |= 32;
        }
        return true;
    }

    private boolean R1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Y |= 16;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.s2
    public void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.k2.a aVar) {
        this.I = aVar;
        synchronized (this) {
            this.Y |= 512;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.I);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.s2
    public void F1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.k2.a aVar) {
        this.J = aVar;
        synchronized (this) {
            this.Y |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.m2);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.s2
    public void G1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.l0 l0Var) {
        this.K = l0Var;
        synchronized (this) {
            this.Y |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        if (i == 1) {
            com.zentraedi.comic.viewmodel.k2.a aVar = this.I;
            com.zentraedi.comic.viewmodel.l0 l0Var = this.K;
            if (aVar != null) {
                aVar.a(view, l0Var);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        com.zentraedi.comic.viewmodel.k2.a aVar2 = this.J;
        com.zentraedi.comic.viewmodel.l0 l0Var2 = this.K;
        if (aVar2 != null) {
            aVar2.a(view, l0Var2);
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.Y != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.Y = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
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
        switch (i) {
            case 0:
                return J1((ObservableField) obj, i2);
            case 1:
                return K1((ObservableField) obj, i2);
            case 2:
                return L1((ObservableField) obj, i2);
            case 3:
                return I1((ObservableField) obj, i2);
            case 4:
                return R1((ObservableField) obj, i2);
            case 5:
                return Q1((ObservableField) obj, i2);
            case 6:
                return N1((ObservableField) obj, i2);
            case 7:
                return P1((ObservableField) obj, i2);
            case 8:
                return O1((ObservableField) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0152  */
    /* JADX WARN: Code duplicated, block: B:103:0x015b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0169  */
    /* JADX WARN: Code duplicated, block: B:108:0x016e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0175  */
    /* JADX WARN: Code duplicated, block: B:112:0x017c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0185  */
    /* JADX WARN: Code duplicated, block: B:118:0x0189  */
    /* JADX WARN: Code duplicated, block: B:121:0x0194  */
    /* JADX WARN: Code duplicated, block: B:123:0x019b  */
    /* JADX WARN: Code duplicated, block: B:124:0x019e  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:133:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:137:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01db  */
    /* JADX WARN: Code duplicated, block: B:144:0x01de  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:154:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:155:0x0201  */
    /* JADX WARN: Code duplicated, block: B:158:0x0208 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x020a  */
    /* JADX WARN: Code duplicated, block: B:161:0x020f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0215  */
    /* JADX WARN: Code duplicated, block: B:164:0x0217  */
    /* JADX WARN: Code duplicated, block: B:166:0x021b  */
    /* JADX WARN: Code duplicated, block: B:167:0x021e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0231  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108  */
    /* JADX WARN: Code duplicated, block: B:82:0x010e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0110  */
    /* JADX WARN: Code duplicated, block: B:87:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0121  */
    /* JADX WARN: Code duplicated, block: B:92:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x012b  */
    /* JADX WARN: Code duplicated, block: B:95:0x013c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0148  */
    /* JADX WARN: Code duplicated, block: B:99:0x014f  */
    protected void r() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        int i4;
        String str;
        int i5;
        String str2;
        String str3;
        String str4;
        int i6;
        Drawable drawableB;
        boolean zB0;
        String str5;
        String path;
        boolean zEquals;
        long j7;
        String str6;
        String strY;
        String str7;
        long j8;
        boolean zK0;
        long j9;
        com.zentraedi.comic.viewmodel.l0 l0Var;
        int i7;
        long j10;
        ObservableField<Boolean> observableFieldW;
        Boolean bool;
        boolean zK1;
        int i8;
        long j11;
        androidx.databinding.u uVarC0;
        Boolean bool2;
        boolean zK2;
        long j12;
        ObservableField<Boolean> observableFieldX;
        Boolean bool3;
        int i9;
        long j13;
        androidx.databinding.u title;
        androidx.databinding.u uVarV;
        androidx.databinding.u uVarN;
        boolean zIsEmpty;
        long j14;
        ObservableField<String> observableFieldR;
        String strU;
        ObservableField<String> clickItemPath;
        synchronized (this) {
            j = this.Y;
            this.Y = 0L;
        }
        com.zentraedi.comic.viewmodel.l0 l0Var2 = this.K;
        if ((6655 & j) != 0) {
            if ((j & 6145) != 0) {
                if (l0Var2 != null) {
                    clickItemPath = l0Var2.getClickItemPath();
                    strU = l0Var2.U();
                } else {
                    strU = null;
                    clickItemPath = null;
                }
                p1(0, clickItemPath);
                zEquals = TextUtils.equals(strU, clickItemPath != null ? (String) clickItemPath.get() : null);
            } else {
                zEquals = false;
            }
            if ((j & 6146) != 0) {
                if (l0Var2 != null) {
                    observableFieldR = l0Var2.R();
                    zB0 = l0Var2.b0();
                    path = l0Var2.getPath();
                } else {
                    observableFieldR = null;
                    zB0 = false;
                    path = null;
                }
                p1(1, observableFieldR);
                str5 = observableFieldR != null ? (String) observableFieldR.get() : null;
            } else {
                str5 = null;
                zB0 = false;
                path = null;
            }
            long j15 = j & 6148;
            if (j15 != 0) {
                androidx.databinding.u uVarT = l0Var2 != null ? l0Var2.T() : null;
                j4 = 6272;
                p1(2, uVarT);
                int iH0 = androidx.databinding.c0.H0(uVarT != null ? (Integer) uVarT.get() : null);
                boolean z3 = iH0 == 0;
                boolean z4 = iH0 == 2;
                if (j15 != 0) {
                    j |= z3 ? 67108864L : 33554432L;
                }
                if ((j & 6148) != 0) {
                    j |= z4 ? 16777216L : 8388608L;
                }
                i3 = z3 ? 0 : 8;
                if (!z4) {
                    i4 = 8;
                }
                j7 = j & 6152;
                if (j7 != 0) {
                    if (l0Var2 != null) {
                        uVarN = l0Var2.N();
                    } else {
                        uVarN = null;
                    }
                    j5 = 6208;
                    p1(3, uVarN);
                    if (uVarN != null) {
                        str6 = (String) uVarN.get();
                    } else {
                        str6 = null;
                    }
                    zIsEmpty = TextUtils.isEmpty(str6);
                    if (j7 != 0) {
                        if (zIsEmpty) {
                            j14 = 262144;
                        } else {
                            j14 = 131072;
                        }
                        j |= j14;
                    }
                    i5 = zIsEmpty ? 8 : 0;
                    if ((j & 6144) != 0 || l0Var2 == null) {
                        strY = null;
                    } else {
                        strY = l0Var2.Y();
                    }
                    if ((j & 6416) != 0) {
                        if (l0Var2 != null) {
                            title = l0Var2.getTitle();
                            uVarV = l0Var2.V();
                        } else {
                            title = null;
                            uVarV = null;
                        }
                        j2 = 6416;
                        j6 = 6176;
                        p1(4, title);
                        p1(8, uVarV);
                        if (title != null) {
                            str7 = (String) title.get();
                        } else {
                            str7 = null;
                        }
                        String str8 = uVarV != null ? (String) uVarV.get() : null;
                        j8 = j & j6;
                        if (j8 != 0) {
                            if (l0Var2 != null) {
                                observableFieldX = l0Var2.X();
                            } else {
                                observableFieldX = null;
                            }
                            p1(5, observableFieldX);
                            if (observableFieldX != null) {
                                bool3 = (Boolean) observableFieldX.get();
                            } else {
                                bool3 = null;
                            }
                            zK0 = androidx.databinding.c0.K0(bool3);
                            if (j8 != 0) {
                                if (zK0) {
                                    j13 = 16384;
                                } else {
                                    j13 = 8192;
                                }
                                j |= j13;
                            }
                            Context context = this.G.getContext();
                            if (zK0) {
                                i9 = com.zentraedi.comic.q.h.sI;
                            } else {
                                i9 = com.zentraedi.comic.q.h.tI;
                            }
                            drawableB = g.a.b(context, i9);
                        } else {
                            zK0 = false;
                            drawableB = null;
                        }
                        j9 = j & j5;
                        if (j9 != 0) {
                            if (l0Var2 != null) {
                                uVarC0 = l0Var2.c0();
                                j3 = 6144;
                            } else {
                                j3 = 6144;
                                uVarC0 = null;
                            }
                            l0Var = l0Var2;
                            p1(6, uVarC0);
                            if (uVarC0 != null) {
                                bool2 = (Boolean) uVarC0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j9 != 0) {
                                if (zK2) {
                                    j12 = 4194304;
                                } else {
                                    j12 = 2097152;
                                }
                                j |= j12;
                            }
                            if (zK2) {
                                i7 = 8;
                            }
                            j10 = j & j4;
                            if (j10 != 0) {
                                if (l0Var != null) {
                                    observableFieldW = l0Var.W();
                                } else {
                                    observableFieldW = null;
                                }
                                p1(7, observableFieldW);
                                if (observableFieldW != null) {
                                    bool = (Boolean) observableFieldW.get();
                                } else {
                                    bool = null;
                                }
                                zK1 = androidx.databinding.c0.K0(bool);
                                if (j10 != 0) {
                                    if (zK1) {
                                        j11 = 1114112;
                                    } else {
                                        j11 = 557056;
                                    }
                                    j |= j11;
                                }
                                if (zK1) {
                                    i6 = 0;
                                } else {
                                    i6 = 8;
                                }
                                if (zK1) {
                                    i8 = 8;
                                } else {
                                    i8 = 0;
                                }
                                i = i8;
                            } else {
                                i = 0;
                                i6 = 0;
                            }
                            z2 = zK0;
                            z = zEquals;
                            str4 = str8;
                            i2 = i7;
                            str3 = str7;
                            str2 = str6;
                            str = strY;
                        } else {
                            j3 = 6144;
                            l0Var = l0Var2;
                        }
                        i7 = 0;
                        j10 = j & j4;
                        if (j10 != 0) {
                            if (l0Var != null) {
                                observableFieldW = l0Var.W();
                            } else {
                                observableFieldW = null;
                            }
                            p1(7, observableFieldW);
                            if (observableFieldW != null) {
                                bool = (Boolean) observableFieldW.get();
                            } else {
                                bool = null;
                            }
                            zK1 = androidx.databinding.c0.K0(bool);
                            if (j10 != 0) {
                                if (zK1) {
                                    j11 = 1114112;
                                } else {
                                    j11 = 557056;
                                }
                                j |= j11;
                            }
                            if (zK1) {
                                i6 = 0;
                            } else {
                                i6 = 8;
                            }
                            if (zK1) {
                                i8 = 8;
                            } else {
                                i8 = 0;
                            }
                            i = i8;
                        } else {
                            i = 0;
                            i6 = 0;
                        }
                        z2 = zK0;
                        z = zEquals;
                        str4 = str8;
                        i2 = i7;
                        str3 = str7;
                        str2 = str6;
                        str = strY;
                    } else {
                        j2 = 6416;
                        j6 = 6176;
                        str7 = null;
                    }
                    j8 = j & j6;
                    if (j8 != 0) {
                        if (l0Var2 != null) {
                            observableFieldX = l0Var2.X();
                        } else {
                            observableFieldX = null;
                        }
                        p1(5, observableFieldX);
                        if (observableFieldX != null) {
                            bool3 = (Boolean) observableFieldX.get();
                        } else {
                            bool3 = null;
                        }
                        zK0 = androidx.databinding.c0.K0(bool3);
                        if (j8 != 0) {
                            if (zK0) {
                                j13 = 16384;
                            } else {
                                j13 = 8192;
                            }
                            j |= j13;
                        }
                        Context context2 = this.G.getContext();
                        if (zK0) {
                            i9 = com.zentraedi.comic.q.h.sI;
                        } else {
                            i9 = com.zentraedi.comic.q.h.tI;
                        }
                        drawableB = g.a.b(context2, i9);
                    } else {
                        zK0 = false;
                        drawableB = null;
                    }
                    j9 = j & j5;
                    if (j9 != 0) {
                        if (l0Var2 != null) {
                            uVarC0 = l0Var2.c0();
                            j3 = 6144;
                        } else {
                            j3 = 6144;
                            uVarC0 = null;
                        }
                        l0Var = l0Var2;
                        p1(6, uVarC0);
                        if (uVarC0 != null) {
                            bool2 = (Boolean) uVarC0.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j9 != 0) {
                            if (zK2) {
                                j12 = 4194304;
                            } else {
                                j12 = 2097152;
                            }
                            j |= j12;
                        }
                        if (zK2) {
                            i7 = 8;
                        }
                        j10 = j & j4;
                        if (j10 != 0) {
                            if (l0Var != null) {
                                observableFieldW = l0Var.W();
                            } else {
                                observableFieldW = null;
                            }
                            p1(7, observableFieldW);
                            if (observableFieldW != null) {
                                bool = (Boolean) observableFieldW.get();
                            } else {
                                bool = null;
                            }
                            zK1 = androidx.databinding.c0.K0(bool);
                            if (j10 != 0) {
                                if (zK1) {
                                    j11 = 1114112;
                                } else {
                                    j11 = 557056;
                                }
                                j |= j11;
                            }
                            if (zK1) {
                                i6 = 0;
                            } else {
                                i6 = 8;
                            }
                            if (zK1) {
                                i8 = 8;
                            } else {
                                i8 = 0;
                            }
                            i = i8;
                        } else {
                            i = 0;
                            i6 = 0;
                        }
                        z2 = zK0;
                        z = zEquals;
                        str4 = str8;
                        i2 = i7;
                        str3 = str7;
                        str2 = str6;
                        str = strY;
                    } else {
                        j3 = 6144;
                        l0Var = l0Var2;
                    }
                    i7 = 0;
                    j10 = j & j4;
                    if (j10 != 0) {
                        if (l0Var != null) {
                            observableFieldW = l0Var.W();
                        } else {
                            observableFieldW = null;
                        }
                        p1(7, observableFieldW);
                        if (observableFieldW != null) {
                            bool = (Boolean) observableFieldW.get();
                        } else {
                            bool = null;
                        }
                        zK1 = androidx.databinding.c0.K0(bool);
                        if (j10 != 0) {
                            if (zK1) {
                                j11 = 1114112;
                            } else {
                                j11 = 557056;
                            }
                            j |= j11;
                        }
                        if (zK1) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        if (zK1) {
                            i8 = 8;
                        } else {
                            i8 = 0;
                        }
                        i = i8;
                    } else {
                        i = 0;
                        i6 = 0;
                    }
                    z2 = zK0;
                    z = zEquals;
                    str4 = str8;
                    i2 = i7;
                    str3 = str7;
                    str2 = str6;
                    str = strY;
                } else {
                    j5 = 6208;
                    str6 = null;
                }
                if ((j & 6144) != 0) {
                    strY = null;
                } else {
                    strY = null;
                }
                if ((j & 6416) != 0) {
                    if (l0Var2 != null) {
                        title = l0Var2.getTitle();
                        uVarV = l0Var2.V();
                    } else {
                        title = null;
                        uVarV = null;
                    }
                    j2 = 6416;
                    j6 = 6176;
                    p1(4, title);
                    p1(8, uVarV);
                    if (title != null) {
                        str7 = (String) title.get();
                    } else {
                        str7 = null;
                    }
                    if (uVarV != null) {
                    }
                    j8 = j & j6;
                    if (j8 != 0) {
                        if (l0Var2 != null) {
                            observableFieldX = l0Var2.X();
                        } else {
                            observableFieldX = null;
                        }
                        p1(5, observableFieldX);
                        if (observableFieldX != null) {
                            bool3 = (Boolean) observableFieldX.get();
                        } else {
                            bool3 = null;
                        }
                        zK0 = androidx.databinding.c0.K0(bool3);
                        if (j8 != 0) {
                            if (zK0) {
                                j13 = 16384;
                            } else {
                                j13 = 8192;
                            }
                            j |= j13;
                        }
                        Context context3 = this.G.getContext();
                        if (zK0) {
                            i9 = com.zentraedi.comic.q.h.sI;
                        } else {
                            i9 = com.zentraedi.comic.q.h.tI;
                        }
                        drawableB = g.a.b(context3, i9);
                    } else {
                        zK0 = false;
                        drawableB = null;
                    }
                    j9 = j & j5;
                    if (j9 != 0) {
                        if (l0Var2 != null) {
                            uVarC0 = l0Var2.c0();
                            j3 = 6144;
                        } else {
                            j3 = 6144;
                            uVarC0 = null;
                        }
                        l0Var = l0Var2;
                        p1(6, uVarC0);
                        if (uVarC0 != null) {
                            bool2 = (Boolean) uVarC0.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j9 != 0) {
                            if (zK2) {
                                j12 = 4194304;
                            } else {
                                j12 = 2097152;
                            }
                            j |= j12;
                        }
                        if (zK2) {
                            i7 = 8;
                        }
                        j10 = j & j4;
                        if (j10 != 0) {
                            if (l0Var != null) {
                                observableFieldW = l0Var.W();
                            } else {
                                observableFieldW = null;
                            }
                            p1(7, observableFieldW);
                            if (observableFieldW != null) {
                                bool = (Boolean) observableFieldW.get();
                            } else {
                                bool = null;
                            }
                            zK1 = androidx.databinding.c0.K0(bool);
                            if (j10 != 0) {
                                if (zK1) {
                                    j11 = 1114112;
                                } else {
                                    j11 = 557056;
                                }
                                j |= j11;
                            }
                            if (zK1) {
                                i6 = 0;
                            } else {
                                i6 = 8;
                            }
                            if (zK1) {
                                i8 = 8;
                            } else {
                                i8 = 0;
                            }
                            i = i8;
                        } else {
                            i = 0;
                            i6 = 0;
                        }
                        z2 = zK0;
                        z = zEquals;
                        str4 = str8;
                        i2 = i7;
                        str3 = str7;
                        str2 = str6;
                        str = strY;
                    } else {
                        j3 = 6144;
                        l0Var = l0Var2;
                    }
                    i7 = 0;
                    j10 = j & j4;
                    if (j10 != 0) {
                        if (l0Var != null) {
                            observableFieldW = l0Var.W();
                        } else {
                            observableFieldW = null;
                        }
                        p1(7, observableFieldW);
                        if (observableFieldW != null) {
                            bool = (Boolean) observableFieldW.get();
                        } else {
                            bool = null;
                        }
                        zK1 = androidx.databinding.c0.K0(bool);
                        if (j10 != 0) {
                            if (zK1) {
                                j11 = 1114112;
                            } else {
                                j11 = 557056;
                            }
                            j |= j11;
                        }
                        if (zK1) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        if (zK1) {
                            i8 = 8;
                        } else {
                            i8 = 0;
                        }
                        i = i8;
                    } else {
                        i = 0;
                        i6 = 0;
                    }
                    z2 = zK0;
                    z = zEquals;
                    str4 = str8;
                    i2 = i7;
                    str3 = str7;
                    str2 = str6;
                    str = strY;
                } else {
                    j2 = 6416;
                    j6 = 6176;
                    str7 = null;
                }
                j8 = j & j6;
                if (j8 != 0) {
                    if (l0Var2 != null) {
                        observableFieldX = l0Var2.X();
                    } else {
                        observableFieldX = null;
                    }
                    p1(5, observableFieldX);
                    if (observableFieldX != null) {
                        bool3 = (Boolean) observableFieldX.get();
                    } else {
                        bool3 = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool3);
                    if (j8 != 0) {
                        if (zK0) {
                            j13 = 16384;
                        } else {
                            j13 = 8192;
                        }
                        j |= j13;
                    }
                    Context context4 = this.G.getContext();
                    if (zK0) {
                        i9 = com.zentraedi.comic.q.h.sI;
                    } else {
                        i9 = com.zentraedi.comic.q.h.tI;
                    }
                    drawableB = g.a.b(context4, i9);
                } else {
                    zK0 = false;
                    drawableB = null;
                }
                j9 = j & j5;
                if (j9 != 0) {
                    if (l0Var2 != null) {
                        uVarC0 = l0Var2.c0();
                        j3 = 6144;
                    } else {
                        j3 = 6144;
                        uVarC0 = null;
                    }
                    l0Var = l0Var2;
                    p1(6, uVarC0);
                    if (uVarC0 != null) {
                        bool2 = (Boolean) uVarC0.get();
                    } else {
                        bool2 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool2);
                    if (j9 != 0) {
                        if (zK2) {
                            j12 = 4194304;
                        } else {
                            j12 = 2097152;
                        }
                        j |= j12;
                    }
                    if (zK2) {
                        i7 = 8;
                    }
                    j10 = j & j4;
                    if (j10 != 0) {
                        if (l0Var != null) {
                            observableFieldW = l0Var.W();
                        } else {
                            observableFieldW = null;
                        }
                        p1(7, observableFieldW);
                        if (observableFieldW != null) {
                            bool = (Boolean) observableFieldW.get();
                        } else {
                            bool = null;
                        }
                        zK1 = androidx.databinding.c0.K0(bool);
                        if (j10 != 0) {
                            if (zK1) {
                                j11 = 1114112;
                            } else {
                                j11 = 557056;
                            }
                            j |= j11;
                        }
                        if (zK1) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        if (zK1) {
                            i8 = 8;
                        } else {
                            i8 = 0;
                        }
                        i = i8;
                    } else {
                        i = 0;
                        i6 = 0;
                    }
                    z2 = zK0;
                    z = zEquals;
                    str4 = str8;
                    i2 = i7;
                    str3 = str7;
                    str2 = str6;
                    str = strY;
                } else {
                    j3 = 6144;
                    l0Var = l0Var2;
                }
                i7 = 0;
                j10 = j & j4;
                if (j10 != 0) {
                    if (l0Var != null) {
                        observableFieldW = l0Var.W();
                    } else {
                        observableFieldW = null;
                    }
                    p1(7, observableFieldW);
                    if (observableFieldW != null) {
                        bool = (Boolean) observableFieldW.get();
                    } else {
                        bool = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool);
                    if (j10 != 0) {
                        if (zK1) {
                            j11 = 1114112;
                        } else {
                            j11 = 557056;
                        }
                        j |= j11;
                    }
                    if (zK1) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    if (zK1) {
                        i8 = 8;
                    } else {
                        i8 = 0;
                    }
                    i = i8;
                } else {
                    i = 0;
                    i6 = 0;
                }
                z2 = zK0;
                z = zEquals;
                str4 = str8;
                i2 = i7;
                str3 = str7;
                str2 = str6;
                str = strY;
            } else {
                j4 = 6272;
                i3 = 0;
            }
            i4 = 0;
            j7 = j & 6152;
            if (j7 != 0) {
                if (l0Var2 != null) {
                    uVarN = l0Var2.N();
                } else {
                    uVarN = null;
                }
                j5 = 6208;
                p1(3, uVarN);
                if (uVarN != null) {
                    str6 = (String) uVarN.get();
                } else {
                    str6 = null;
                }
                zIsEmpty = TextUtils.isEmpty(str6);
                if (j7 != 0) {
                    if (zIsEmpty) {
                        j14 = 262144;
                    } else {
                        j14 = 131072;
                    }
                    j |= j14;
                }
                if (zIsEmpty) {
                }
                if ((j & 6144) != 0) {
                    strY = null;
                } else {
                    strY = null;
                }
                if ((j & 6416) != 0) {
                    if (l0Var2 != null) {
                        title = l0Var2.getTitle();
                        uVarV = l0Var2.V();
                    } else {
                        title = null;
                        uVarV = null;
                    }
                    j2 = 6416;
                    j6 = 6176;
                    p1(4, title);
                    p1(8, uVarV);
                    if (title != null) {
                        str7 = (String) title.get();
                    } else {
                        str7 = null;
                    }
                    if (uVarV != null) {
                    }
                    j8 = j & j6;
                    if (j8 != 0) {
                        if (l0Var2 != null) {
                            observableFieldX = l0Var2.X();
                        } else {
                            observableFieldX = null;
                        }
                        p1(5, observableFieldX);
                        if (observableFieldX != null) {
                            bool3 = (Boolean) observableFieldX.get();
                        } else {
                            bool3 = null;
                        }
                        zK0 = androidx.databinding.c0.K0(bool3);
                        if (j8 != 0) {
                            if (zK0) {
                                j13 = 16384;
                            } else {
                                j13 = 8192;
                            }
                            j |= j13;
                        }
                        Context context5 = this.G.getContext();
                        if (zK0) {
                            i9 = com.zentraedi.comic.q.h.sI;
                        } else {
                            i9 = com.zentraedi.comic.q.h.tI;
                        }
                        drawableB = g.a.b(context5, i9);
                    } else {
                        zK0 = false;
                        drawableB = null;
                    }
                    j9 = j & j5;
                    if (j9 != 0) {
                        if (l0Var2 != null) {
                            uVarC0 = l0Var2.c0();
                            j3 = 6144;
                        } else {
                            j3 = 6144;
                            uVarC0 = null;
                        }
                        l0Var = l0Var2;
                        p1(6, uVarC0);
                        if (uVarC0 != null) {
                            bool2 = (Boolean) uVarC0.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j9 != 0) {
                            if (zK2) {
                                j12 = 4194304;
                            } else {
                                j12 = 2097152;
                            }
                            j |= j12;
                        }
                        if (zK2) {
                            i7 = 8;
                        }
                        j10 = j & j4;
                        if (j10 != 0) {
                            if (l0Var != null) {
                                observableFieldW = l0Var.W();
                            } else {
                                observableFieldW = null;
                            }
                            p1(7, observableFieldW);
                            if (observableFieldW != null) {
                                bool = (Boolean) observableFieldW.get();
                            } else {
                                bool = null;
                            }
                            zK1 = androidx.databinding.c0.K0(bool);
                            if (j10 != 0) {
                                if (zK1) {
                                    j11 = 1114112;
                                } else {
                                    j11 = 557056;
                                }
                                j |= j11;
                            }
                            if (zK1) {
                                i6 = 0;
                            } else {
                                i6 = 8;
                            }
                            if (zK1) {
                                i8 = 8;
                            } else {
                                i8 = 0;
                            }
                            i = i8;
                        } else {
                            i = 0;
                            i6 = 0;
                        }
                        z2 = zK0;
                        z = zEquals;
                        str4 = str8;
                        i2 = i7;
                        str3 = str7;
                        str2 = str6;
                        str = strY;
                    } else {
                        j3 = 6144;
                        l0Var = l0Var2;
                    }
                    i7 = 0;
                    j10 = j & j4;
                    if (j10 != 0) {
                        if (l0Var != null) {
                            observableFieldW = l0Var.W();
                        } else {
                            observableFieldW = null;
                        }
                        p1(7, observableFieldW);
                        if (observableFieldW != null) {
                            bool = (Boolean) observableFieldW.get();
                        } else {
                            bool = null;
                        }
                        zK1 = androidx.databinding.c0.K0(bool);
                        if (j10 != 0) {
                            if (zK1) {
                                j11 = 1114112;
                            } else {
                                j11 = 557056;
                            }
                            j |= j11;
                        }
                        if (zK1) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        if (zK1) {
                            i8 = 8;
                        } else {
                            i8 = 0;
                        }
                        i = i8;
                    } else {
                        i = 0;
                        i6 = 0;
                    }
                    z2 = zK0;
                    z = zEquals;
                    str4 = str8;
                    i2 = i7;
                    str3 = str7;
                    str2 = str6;
                    str = strY;
                } else {
                    j2 = 6416;
                    j6 = 6176;
                    str7 = null;
                }
                j8 = j & j6;
                if (j8 != 0) {
                    if (l0Var2 != null) {
                        observableFieldX = l0Var2.X();
                    } else {
                        observableFieldX = null;
                    }
                    p1(5, observableFieldX);
                    if (observableFieldX != null) {
                        bool3 = (Boolean) observableFieldX.get();
                    } else {
                        bool3 = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool3);
                    if (j8 != 0) {
                        if (zK0) {
                            j13 = 16384;
                        } else {
                            j13 = 8192;
                        }
                        j |= j13;
                    }
                    Context context6 = this.G.getContext();
                    if (zK0) {
                        i9 = com.zentraedi.comic.q.h.sI;
                    } else {
                        i9 = com.zentraedi.comic.q.h.tI;
                    }
                    drawableB = g.a.b(context6, i9);
                } else {
                    zK0 = false;
                    drawableB = null;
                }
                j9 = j & j5;
                if (j9 != 0) {
                    if (l0Var2 != null) {
                        uVarC0 = l0Var2.c0();
                        j3 = 6144;
                    } else {
                        j3 = 6144;
                        uVarC0 = null;
                    }
                    l0Var = l0Var2;
                    p1(6, uVarC0);
                    if (uVarC0 != null) {
                        bool2 = (Boolean) uVarC0.get();
                    } else {
                        bool2 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool2);
                    if (j9 != 0) {
                        if (zK2) {
                            j12 = 4194304;
                        } else {
                            j12 = 2097152;
                        }
                        j |= j12;
                    }
                    if (zK2) {
                        i7 = 8;
                    }
                    j10 = j & j4;
                    if (j10 != 0) {
                        if (l0Var != null) {
                            observableFieldW = l0Var.W();
                        } else {
                            observableFieldW = null;
                        }
                        p1(7, observableFieldW);
                        if (observableFieldW != null) {
                            bool = (Boolean) observableFieldW.get();
                        } else {
                            bool = null;
                        }
                        zK1 = androidx.databinding.c0.K0(bool);
                        if (j10 != 0) {
                            if (zK1) {
                                j11 = 1114112;
                            } else {
                                j11 = 557056;
                            }
                            j |= j11;
                        }
                        if (zK1) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        if (zK1) {
                            i8 = 8;
                        } else {
                            i8 = 0;
                        }
                        i = i8;
                    } else {
                        i = 0;
                        i6 = 0;
                    }
                    z2 = zK0;
                    z = zEquals;
                    str4 = str8;
                    i2 = i7;
                    str3 = str7;
                    str2 = str6;
                    str = strY;
                } else {
                    j3 = 6144;
                    l0Var = l0Var2;
                }
                i7 = 0;
                j10 = j & j4;
                if (j10 != 0) {
                    if (l0Var != null) {
                        observableFieldW = l0Var.W();
                    } else {
                        observableFieldW = null;
                    }
                    p1(7, observableFieldW);
                    if (observableFieldW != null) {
                        bool = (Boolean) observableFieldW.get();
                    } else {
                        bool = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool);
                    if (j10 != 0) {
                        if (zK1) {
                            j11 = 1114112;
                        } else {
                            j11 = 557056;
                        }
                        j |= j11;
                    }
                    if (zK1) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    if (zK1) {
                        i8 = 8;
                    } else {
                        i8 = 0;
                    }
                    i = i8;
                } else {
                    i = 0;
                    i6 = 0;
                }
                z2 = zK0;
                z = zEquals;
                str4 = str8;
                i2 = i7;
                str3 = str7;
                str2 = str6;
                str = strY;
            } else {
                j5 = 6208;
                str6 = null;
            }
            if ((j & 6144) != 0) {
                strY = null;
            } else {
                strY = null;
            }
            if ((j & 6416) != 0) {
                if (l0Var2 != null) {
                    title = l0Var2.getTitle();
                    uVarV = l0Var2.V();
                } else {
                    title = null;
                    uVarV = null;
                }
                j2 = 6416;
                j6 = 6176;
                p1(4, title);
                p1(8, uVarV);
                if (title != null) {
                    str7 = (String) title.get();
                } else {
                    str7 = null;
                }
                if (uVarV != null) {
                }
                j8 = j & j6;
                if (j8 != 0) {
                    if (l0Var2 != null) {
                        observableFieldX = l0Var2.X();
                    } else {
                        observableFieldX = null;
                    }
                    p1(5, observableFieldX);
                    if (observableFieldX != null) {
                        bool3 = (Boolean) observableFieldX.get();
                    } else {
                        bool3 = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool3);
                    if (j8 != 0) {
                        if (zK0) {
                            j13 = 16384;
                        } else {
                            j13 = 8192;
                        }
                        j |= j13;
                    }
                    Context context7 = this.G.getContext();
                    if (zK0) {
                        i9 = com.zentraedi.comic.q.h.sI;
                    } else {
                        i9 = com.zentraedi.comic.q.h.tI;
                    }
                    drawableB = g.a.b(context7, i9);
                } else {
                    zK0 = false;
                    drawableB = null;
                }
                j9 = j & j5;
                if (j9 != 0) {
                    if (l0Var2 != null) {
                        uVarC0 = l0Var2.c0();
                        j3 = 6144;
                    } else {
                        j3 = 6144;
                        uVarC0 = null;
                    }
                    l0Var = l0Var2;
                    p1(6, uVarC0);
                    if (uVarC0 != null) {
                        bool2 = (Boolean) uVarC0.get();
                    } else {
                        bool2 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool2);
                    if (j9 != 0) {
                        if (zK2) {
                            j12 = 4194304;
                        } else {
                            j12 = 2097152;
                        }
                        j |= j12;
                    }
                    if (zK2) {
                        i7 = 8;
                    }
                    j10 = j & j4;
                    if (j10 != 0) {
                        if (l0Var != null) {
                            observableFieldW = l0Var.W();
                        } else {
                            observableFieldW = null;
                        }
                        p1(7, observableFieldW);
                        if (observableFieldW != null) {
                            bool = (Boolean) observableFieldW.get();
                        } else {
                            bool = null;
                        }
                        zK1 = androidx.databinding.c0.K0(bool);
                        if (j10 != 0) {
                            if (zK1) {
                                j11 = 1114112;
                            } else {
                                j11 = 557056;
                            }
                            j |= j11;
                        }
                        if (zK1) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        if (zK1) {
                            i8 = 8;
                        } else {
                            i8 = 0;
                        }
                        i = i8;
                    } else {
                        i = 0;
                        i6 = 0;
                    }
                    z2 = zK0;
                    z = zEquals;
                    str4 = str8;
                    i2 = i7;
                    str3 = str7;
                    str2 = str6;
                    str = strY;
                } else {
                    j3 = 6144;
                    l0Var = l0Var2;
                }
                i7 = 0;
                j10 = j & j4;
                if (j10 != 0) {
                    if (l0Var != null) {
                        observableFieldW = l0Var.W();
                    } else {
                        observableFieldW = null;
                    }
                    p1(7, observableFieldW);
                    if (observableFieldW != null) {
                        bool = (Boolean) observableFieldW.get();
                    } else {
                        bool = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool);
                    if (j10 != 0) {
                        if (zK1) {
                            j11 = 1114112;
                        } else {
                            j11 = 557056;
                        }
                        j |= j11;
                    }
                    if (zK1) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    if (zK1) {
                        i8 = 8;
                    } else {
                        i8 = 0;
                    }
                    i = i8;
                } else {
                    i = 0;
                    i6 = 0;
                }
                z2 = zK0;
                z = zEquals;
                str4 = str8;
                i2 = i7;
                str3 = str7;
                str2 = str6;
                str = strY;
            } else {
                j2 = 6416;
                j6 = 6176;
                str7 = null;
            }
            j8 = j & j6;
            if (j8 != 0) {
                if (l0Var2 != null) {
                    observableFieldX = l0Var2.X();
                } else {
                    observableFieldX = null;
                }
                p1(5, observableFieldX);
                if (observableFieldX != null) {
                    bool3 = (Boolean) observableFieldX.get();
                } else {
                    bool3 = null;
                }
                zK0 = androidx.databinding.c0.K0(bool3);
                if (j8 != 0) {
                    if (zK0) {
                        j13 = 16384;
                    } else {
                        j13 = 8192;
                    }
                    j |= j13;
                }
                Context context8 = this.G.getContext();
                if (zK0) {
                    i9 = com.zentraedi.comic.q.h.sI;
                } else {
                    i9 = com.zentraedi.comic.q.h.tI;
                }
                drawableB = g.a.b(context8, i9);
            } else {
                zK0 = false;
                drawableB = null;
            }
            j9 = j & j5;
            if (j9 != 0) {
                if (l0Var2 != null) {
                    uVarC0 = l0Var2.c0();
                    j3 = 6144;
                } else {
                    j3 = 6144;
                    uVarC0 = null;
                }
                l0Var = l0Var2;
                p1(6, uVarC0);
                if (uVarC0 != null) {
                    bool2 = (Boolean) uVarC0.get();
                } else {
                    bool2 = null;
                }
                zK2 = androidx.databinding.c0.K0(bool2);
                if (j9 != 0) {
                    if (zK2) {
                        j12 = 4194304;
                    } else {
                        j12 = 2097152;
                    }
                    j |= j12;
                }
                if (zK2) {
                    i7 = 8;
                }
                j10 = j & j4;
                if (j10 != 0) {
                    if (l0Var != null) {
                        observableFieldW = l0Var.W();
                    } else {
                        observableFieldW = null;
                    }
                    p1(7, observableFieldW);
                    if (observableFieldW != null) {
                        bool = (Boolean) observableFieldW.get();
                    } else {
                        bool = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool);
                    if (j10 != 0) {
                        if (zK1) {
                            j11 = 1114112;
                        } else {
                            j11 = 557056;
                        }
                        j |= j11;
                    }
                    if (zK1) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    if (zK1) {
                        i8 = 8;
                    } else {
                        i8 = 0;
                    }
                    i = i8;
                } else {
                    i = 0;
                    i6 = 0;
                }
                z2 = zK0;
                z = zEquals;
                str4 = str8;
                i2 = i7;
                str3 = str7;
                str2 = str6;
                str = strY;
            } else {
                j3 = 6144;
                l0Var = l0Var2;
            }
            i7 = 0;
            j10 = j & j4;
            if (j10 != 0) {
                if (l0Var != null) {
                    observableFieldW = l0Var.W();
                } else {
                    observableFieldW = null;
                }
                p1(7, observableFieldW);
                if (observableFieldW != null) {
                    bool = (Boolean) observableFieldW.get();
                } else {
                    bool = null;
                }
                zK1 = androidx.databinding.c0.K0(bool);
                if (j10 != 0) {
                    if (zK1) {
                        j11 = 1114112;
                    } else {
                        j11 = 557056;
                    }
                    j |= j11;
                }
                if (zK1) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                if (zK1) {
                    i8 = 8;
                } else {
                    i8 = 0;
                }
                i = i8;
            } else {
                i = 0;
                i6 = 0;
            }
            z2 = zK0;
            z = zEquals;
            str4 = str8;
            i2 = i7;
            str3 = str7;
            str2 = str6;
            str = strY;
        } else {
            j2 = 6416;
            j3 = 6144;
            j4 = 6272;
            j5 = 6208;
            j6 = 6176;
            i = 0;
            z = false;
            i2 = 0;
            z2 = false;
            i3 = 0;
            i4 = 0;
            str = null;
            i5 = 0;
            str2 = null;
            str3 = null;
            str4 = null;
            i6 = 0;
            drawableB = null;
            zB0 = false;
            str5 = null;
            path = null;
        }
        long j16 = j;
        if ((j & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0) {
            this.M.setOnClickListener(this.W);
            this.F.setOnClickListener(this.X);
        }
        if ((j16 & 6145) != 0) {
            com.zentraedi.business.utils.u.v(this.M, z);
        }
        if ((j16 & j3) != 0) {
            androidx.databinding.adapters.f0.A(this.N, str);
        }
        if ((j16 & 6152) != 0) {
            androidx.databinding.adapters.f0.A(this.O, str2);
            this.O.setVisibility(i5);
        }
        if ((j16 & j4) != 0) {
            this.P.setVisibility(i);
            this.Q.setVisibility(i6);
            this.F.setVisibility(i);
            this.G.setVisibility(i6);
        }
        if ((j16 & 6146) != 0) {
            com.zentraedi.comic.util.e.a(this.R, str5, path, Boolean.FALSE, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(4.0f)), Boolean.valueOf(zB0), true);
        }
        if ((j16 & j5) != 0) {
            this.S.setVisibility(i2);
        }
        if ((j16 & 6148) != 0) {
            this.T.setVisibility(i3);
            this.U.setVisibility(i4);
        }
        if ((j16 & j2) != 0) {
            com.zentraedi.comic.util.j.a(this.V, str3, str4);
        }
        if ((j16 & j6) != 0) {
            this.G.setSelected(z2);
            androidx.databinding.adapters.p.a(this.G, drawableB);
        }
    }

    private t2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 9, (RelativeLayout) objArr[14], (ImageView) objArr[12], (ImageView) objArr[4], (FrameLayout) objArr[13]);
        this.Y = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.L = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.M = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.N = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[11];
        this.O = textView2;
        textView2.setTag(null);
        View view2 = (View) objArr[2];
        this.P = view2;
        view2.setTag(null);
        View view3 = (View) objArr[3];
        this.Q = view3;
        view3.setTag(null);
        ImageView imageView = (ImageView) objArr[5];
        this.R = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[6];
        this.S = imageView2;
        imageView2.setTag(null);
        ImageView imageView3 = (ImageView) objArr[7];
        this.T = imageView3;
        imageView3.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[8];
        this.U = progressBar;
        progressBar.setTag(null);
        TextView textView3 = (TextView) objArr[9];
        this.V = textView3;
        textView3.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        P0(view);
        this.W = new com.zentraedi.comic.generated.callback.b(this, 1);
        this.X = new com.zentraedi.comic.generated.callback.b(this, 2);
        i0();
    }
}
