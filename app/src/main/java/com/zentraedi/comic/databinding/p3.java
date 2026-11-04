package com.zentraedi.comic.databinding;

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
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.comic.viewmodel.i6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class p3 extends o3 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i b0 = null;

    @androidx.annotation.p0
    private static final SparseIntArray c0;

    @androidx.annotation.n0
    private final LinearLayout M;

    @androidx.annotation.n0
    private final RelativeLayout N;

    @androidx.annotation.n0
    private final TextView O;

    @androidx.annotation.n0
    private final TextView P;

    @androidx.annotation.n0
    private final TextView Q;

    @androidx.annotation.n0
    private final ImageView R;

    @androidx.annotation.n0
    private final ImageView S;

    @androidx.annotation.n0
    private final View T;

    @androidx.annotation.n0
    private final View U;

    @androidx.annotation.n0
    private final ImageView V;

    @androidx.annotation.n0
    private final ImageView W;

    @androidx.annotation.n0
    private final ImageView X;

    @androidx.annotation.n0
    private final ProgressBar Y;

    @androidx.annotation.n0
    private final TextView Z;
    private long a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.NG, 16);
        sparseIntArray.put(com.zentraedi.comic.q.i.Pa, 17);
        sparseIntArray.put(com.zentraedi.comic.q.i.m4, 18);
        sparseIntArray.put(com.zentraedi.comic.q.i.Bu, 19);
    }

    public p3(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 20, b0, c0));
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
        return true;
    }

    private boolean I1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= 1;
        }
        return true;
    }

    private boolean J1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= 8;
        }
        return true;
    }

    private boolean K1(ObservableInt observableInt, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
        }
        return true;
    }

    private boolean L1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= 512;
        }
        return true;
    }

    private boolean N1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= 256;
        }
        return true;
    }

    private boolean O1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= 8192;
        }
        return true;
    }

    private boolean P1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= 16;
        }
        return true;
    }

    private boolean Q1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= 32;
        }
        return true;
    }

    private boolean R1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= 128;
        }
        return true;
    }

    private boolean S1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= 64;
        }
        return true;
    }

    private boolean T1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= 2;
        }
        return true;
    }

    private boolean U1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= 4;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.o3
    public void D1(@androidx.annotation.p0 Boolean bool) {
        this.K = bool;
    }

    @Override // com.zentraedi.comic.databinding.o3
    public void E1(@androidx.annotation.p0 i6 i6Var) {
        this.L = i6Var;
        synchronized (this) {
            this.a0 |= 16384;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.G1);
        super.C0();
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.a0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.a0 = 65536L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.G1 == i) {
            E1((i6) obj);
            return true;
        }
        if (com.zentraedi.comic.a.r1 != i) {
            return false;
        }
        D1((Boolean) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return I1((ObservableField) obj, i2);
            case 1:
                return T1((ObservableBoolean) obj, i2);
            case 2:
                return U1((ObservableField) obj, i2);
            case 3:
                return J1((ObservableField) obj, i2);
            case 4:
                return P1((ObservableField) obj, i2);
            case 5:
                return Q1((ObservableField) obj, i2);
            case 6:
                return S1((ObservableField) obj, i2);
            case 7:
                return R1((ObservableField) obj, i2);
            case 8:
                return N1((ObservableField) obj, i2);
            case 9:
                return L1((ObservableBoolean) obj, i2);
            case 10:
                return G1((ObservableField) obj, i2);
            case 11:
                return K1((ObservableInt) obj, i2);
            case 12:
                return F1((ObservableField) obj, i2);
            case 13:
                return O1((ObservableField) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01db  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:127:0x0206  */
    /* JADX WARN: Code duplicated, block: B:130:0x0210  */
    /* JADX WARN: Code duplicated, block: B:131:0x0217  */
    /* JADX WARN: Code duplicated, block: B:134:0x021f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x0221  */
    /* JADX WARN: Code duplicated, block: B:137:0x0229  */
    /* JADX WARN: Code duplicated, block: B:140:0x0232  */
    /* JADX WARN: Code duplicated, block: B:141:0x0234  */
    /* JADX WARN: Code duplicated, block: B:145:0x023f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x0241  */
    /* JADX WARN: Code duplicated, block: B:148:0x024e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0259  */
    /* JADX WARN: Code duplicated, block: B:152:0x0260  */
    /* JADX WARN: Code duplicated, block: B:154:0x0267  */
    /* JADX WARN: Code duplicated, block: B:157:0x0273 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x0275  */
    /* JADX WARN: Code duplicated, block: B:159:0x0278  */
    /* JADX WARN: Code duplicated, block: B:162:0x0281  */
    /* JADX WARN: Code duplicated, block: B:163:0x0286  */
    /* JADX WARN: Code duplicated, block: B:166:0x028d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x028f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0295  */
    /* JADX WARN: Code duplicated, block: B:171:0x029d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x029f  */
    /* JADX WARN: Code duplicated, block: B:173:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:176:0x02af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:179:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:182:0x02c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:184:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:186:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:189:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:192:0x02dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x02de  */
    /* JADX WARN: Code duplicated, block: B:195:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:198:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:199:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:202:0x0306 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x0308  */
    /* JADX WARN: Code duplicated, block: B:205:0x030e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0314  */
    /* JADX WARN: Code duplicated, block: B:208:0x0317  */
    /* JADX WARN: Code duplicated, block: B:212:0x0324 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x0326  */
    /* JADX WARN: Code duplicated, block: B:215:0x0333  */
    /* JADX WARN: Code duplicated, block: B:218:0x033f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0345  */
    /* JADX WARN: Code duplicated, block: B:222:0x0349  */
    /* JADX WARN: Code duplicated, block: B:223:0x034b  */
    /* JADX WARN: Code duplicated, block: B:225:0x034e  */
    /* JADX WARN: Code duplicated, block: B:226:0x0350  */
    /* JADX WARN: Code duplicated, block: B:228:0x0353 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:229:0x0355  */
    /* JADX WARN: Code duplicated, block: B:231:0x035b  */
    /* JADX WARN: Code duplicated, block: B:234:0x0365 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:235:0x0367  */
    /* JADX WARN: Code duplicated, block: B:237:0x036d  */
    /* JADX WARN: Code duplicated, block: B:239:0x0373  */
    /* JADX WARN: Code duplicated, block: B:240:0x0375  */
    /* JADX WARN: Code duplicated, block: B:242:0x0379  */
    /* JADX WARN: Code duplicated, block: B:243:0x037b  */
    /* JADX WARN: Code duplicated, block: B:246:0x03af  */
    /* JADX WARN: Code duplicated, block: B:282:0x0480 A[PHI: r60
      0x0480: PHI (r60v2 long) = (r60v1 long), (r60v8 long) binds: [B:272:0x0468, B:280:0x047b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:295:0x04a1 A[PHI: r60
      0x04a1: PHI (r60v4 long) = (r60v3 long), (r60v6 long) binds: [B:284:0x0485, B:293:0x049c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:74:0x0140  */
    /* JADX WARN: Code duplicated, block: B:77:0x0150  */
    /* JADX WARN: Code duplicated, block: B:78:0x0157  */
    /* JADX WARN: Code duplicated, block: B:80:0x015b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0162  */
    /* JADX WARN: Code duplicated, block: B:82:0x0165  */
    /* JADX WARN: Code duplicated, block: B:85:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0178  */
    /* JADX WARN: Code duplicated, block: B:88:0x0180  */
    /* JADX WARN: Code duplicated, block: B:91:0x0189  */
    /* JADX WARN: Code duplicated, block: B:92:0x0190  */
    /* JADX WARN: Code duplicated, block: B:95:0x0198 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x019a  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a2  */
    protected void r() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        long j6;
        String str;
        String str2;
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        View.OnClickListener onClickListenerN0;
        View.OnLongClickListener onLongClickListener;
        String str3;
        Drawable drawable;
        String str4;
        String str5;
        String str6;
        String str7;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        boolean z3;
        int i11;
        boolean zK0;
        boolean zK1;
        int i12;
        int i13;
        String str8;
        View.OnLongClickListener longListener;
        View.OnClickListener onClickListenerK0;
        View.OnClickListener onClickListenerJ0;
        Drawable drawableB;
        String str9;
        boolean zZ0;
        long j7;
        long j8;
        String str10;
        long j9;
        int i14;
        boolean zEquals;
        int i15;
        long j10;
        boolean z4;
        String str11;
        int i16;
        long j11;
        androidx.databinding.u uVarO0;
        int i17;
        boolean z5;
        boolean z6;
        int i18;
        int i19;
        long j12;
        long j13;
        androidx.databinding.u uVarH0;
        boolean zIsEmpty;
        long j14;
        ObservableBoolean observableBoolean;
        long j15;
        androidx.databinding.u clickItemPath;
        String strT0;
        String str12;
        androidx.databinding.u uVarQ0;
        Boolean bool;
        boolean zK2;
        long j16;
        androidx.databinding.u progress;
        boolean zIsEmpty2;
        long j17;
        ObservableField<String> observableFieldV0;
        boolean zIsEmpty3;
        long j18;
        androidx.databinding.u uVar;
        androidx.databinding.u uVar2;
        synchronized (this) {
            j = this.a0;
            this.a0 = 0L;
        }
        i6 i6Var = this.L;
        if ((98303 & j) != 0) {
            long j19 = j & 81921;
            if (j19 != 0) {
                ObservableField<String> observableFieldL0 = i6Var != null ? i6Var.l0() : null;
                p1(0, observableFieldL0);
                str8 = observableFieldL0 != null ? (String) observableFieldL0.get() : null;
                boolean zIsEmpty4 = TextUtils.isEmpty(str8);
                if (j19 != 0) {
                    j |= zIsEmpty4 ? 16777216L : 8388608L;
                }
                i10 = zIsEmpty4 ? 8 : 0;
            } else {
                i10 = 0;
                str8 = null;
            }
            if ((j & 81920) == 0 || i6Var == null) {
                longListener = null;
                onClickListenerK0 = null;
                onClickListenerJ0 = null;
                onClickListenerN0 = null;
            } else {
                longListener = i6Var.getLongListener();
                onClickListenerK0 = i6Var.k0();
                onClickListenerJ0 = i6Var.j0();
                onClickListenerN0 = i6Var.n0();
            }
            long j20 = j & 81922;
            if (j20 != 0) {
                ObservableBoolean observableBoolean2 = i6Var != null ? ((com.zentraedi.business.addfile.n) i6Var).w : null;
                p1(1, observableBoolean2);
                boolean z7 = observableBoolean2 != null ? observableBoolean2.get() : false;
                if (j20 != 0) {
                    j |= z7 ? 1099511627776L : 549755813888L;
                }
                drawableB = z7 ? g.a.b(this.I.getContext(), com.zentraedi.comic.q.h.sI) : g.a.b(this.I.getContext(), com.zentraedi.comic.q.h.tI);
            } else {
                drawableB = null;
            }
            long j21 = j & 81924;
            j2 = 2147483648L;
            if (j21 != 0) {
                ObservableField<String> observableFieldX0 = i6Var != null ? i6Var.x0() : null;
                p1(2, observableFieldX0);
                str9 = observableFieldX0 != null ? (String) observableFieldX0.get() : null;
                boolean zIsEmpty5 = TextUtils.isEmpty(str9);
                if (j21 != 0) {
                    j |= zIsEmpty5 ? 17179869184L : 8589934592L;
                }
                i7 = zIsEmpty5 ? 8 : 0;
                if ((j & 81960) != 0) {
                    if (i6Var != null) {
                        androidx.databinding.u uVarM0 = i6Var.m0();
                        androidx.databinding.u uVarU0 = i6Var.u0();
                        zZ0 = i6Var.z0();
                        uVar = uVarM0;
                        uVar2 = uVarU0;
                    } else {
                        uVar = null;
                        uVar2 = null;
                        zZ0 = false;
                    }
                    j3 = 131072;
                    j4 = 86016;
                    p1(3, uVar);
                    p1(5, uVar2);
                    if (uVar != null) {
                        str6 = (String) uVar.get();
                    } else {
                        str6 = null;
                    }
                    if (uVar2 != null) {
                        str7 = (String) uVar2.get();
                    } else {
                        str7 = null;
                    }
                } else {
                    j3 = 131072;
                    j4 = 86016;
                    str6 = null;
                    str7 = null;
                    zZ0 = false;
                }
                j7 = j & 81984;
                if (j7 != 0) {
                    if (i6Var != null) {
                        observableFieldV0 = i6Var.v0();
                    } else {
                        observableFieldV0 = null;
                    }
                    j5 = 82176;
                    p1(6, observableFieldV0);
                    if (observableFieldV0 != null) {
                        str2 = (String) observableFieldV0.get();
                    } else {
                        str2 = null;
                    }
                    zIsEmpty3 = TextUtils.isEmpty(str2);
                    if (j7 != 0) {
                        if (zIsEmpty3) {
                            j18 = 17592186044416L;
                        } else {
                            j18 = 8796093022208L;
                        }
                        j |= j18;
                    }
                    int i20 = zIsEmpty3 ? 8 : 0;
                    j8 = j & 82048;
                    if (j8 != 0) {
                        if (i6Var != null) {
                            progress = i6Var.getProgress();
                        } else {
                            progress = null;
                        }
                        p1(7, progress);
                        if (progress != null) {
                            str10 = (String) progress.get();
                        } else {
                            str10 = null;
                        }
                        zIsEmpty2 = TextUtils.isEmpty(str10);
                        if (j8 != 0) {
                            if (zIsEmpty2) {
                                j17 = 274877906944L;
                            } else {
                                j17 = 137438953472L;
                            }
                            j |= j17;
                        }
                        i9 = zIsEmpty2 ? 8 : 0;
                        j9 = j & j5;
                        if (j9 != 0) {
                            if (i6Var != null) {
                                long j22 = j;
                                uVarQ0 = i6Var.q0();
                                j6 = j22;
                            } else {
                                j6 = j;
                                uVarQ0 = null;
                            }
                            p1(8, uVarQ0);
                            if (uVarQ0 != null) {
                                bool = (Boolean) uVarQ0.get();
                            } else {
                                bool = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool);
                            if (j9 != 0) {
                                if (zK2) {
                                    j16 = 68719476736L;
                                } else {
                                    j16 = 34359738368L;
                                }
                                j6 |= j16;
                            }
                            if (zK2) {
                                i14 = 8;
                            }
                            if ((j6 & j4) != 0) {
                                if (i6Var != null) {
                                    strT0 = i6Var.t0();
                                    clickItemPath = i6Var.getClickItemPath();
                                } else {
                                    clickItemPath = null;
                                    strT0 = null;
                                }
                                p1(12, clickItemPath);
                                if (clickItemPath != null) {
                                    str12 = (String) clickItemPath.get();
                                } else {
                                    str12 = null;
                                }
                                zEquals = TextUtils.equals(strT0, str12);
                            } else {
                                zEquals = false;
                            }
                            if ((j6 & 90640) != 0) {
                                if (i6Var != null) {
                                    observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                                } else {
                                    observableBoolean = null;
                                }
                                p1(9, observableBoolean);
                                if (observableBoolean != null) {
                                    z2 = observableBoolean.get();
                                } else {
                                    z2 = false;
                                }
                                if ((j6 & 90624) != 0) {
                                    if (z2) {
                                        j6 |= 262144;
                                    } else {
                                        j6 |= j3;
                                    }
                                }
                                if ((j6 & 82448) != 0) {
                                    if (z2) {
                                        j6 |= 4294967296L;
                                    } else {
                                        j6 |= 2147483648L;
                                    }
                                }
                                if ((j6 & 82432) != 0) {
                                    if (z2) {
                                        j15 = 74766790688768L;
                                    } else {
                                        j15 = 37383395344384L;
                                    }
                                    j6 |= j15;
                                }
                                if ((j6 & 82432) != 0) {
                                    if (z2) {
                                        i15 = 0;
                                    } else {
                                        i15 = 8;
                                    }
                                    i5 = z2 ? 8 : 0;
                                    j10 = j6 & 82944;
                                    if (j10 != 0) {
                                        if (i6Var != null) {
                                            uVarH0 = i6Var.h0();
                                        } else {
                                            uVarH0 = null;
                                        }
                                        z4 = zEquals;
                                        p1(10, uVarH0);
                                        if (uVarH0 != null) {
                                            str11 = (String) uVarH0.get();
                                        } else {
                                            str11 = null;
                                        }
                                        zIsEmpty = TextUtils.isEmpty(str11);
                                        if (j10 != 0) {
                                            if (zIsEmpty) {
                                                j14 = 4194304;
                                            } else {
                                                j14 = 2097152;
                                            }
                                            j6 |= j14;
                                        }
                                        i16 = zIsEmpty ? 8 : 0;
                                        j11 = j6 & 83968;
                                        if (j11 != 0) {
                                            if (i6Var != null) {
                                                uVarO0 = i6Var.o0();
                                            } else {
                                                uVarO0 = null;
                                            }
                                            int i21 = i16;
                                            p1(11, uVarO0);
                                            if (uVarO0 != null) {
                                                i17 = uVarO0.get();
                                            } else {
                                                i17 = 0;
                                            }
                                            if (i17 == 2) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (i17 == 0) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            if (j11 != 0) {
                                                if (z5) {
                                                    j13 = 268435456;
                                                } else {
                                                    j13 = 134217728;
                                                }
                                                j6 |= j13;
                                            }
                                            if ((j6 & 83968) != 0) {
                                                if (z6) {
                                                    j12 = 67108864;
                                                } else {
                                                    j12 = 33554432;
                                                }
                                                j6 |= j12;
                                            }
                                            if (z5) {
                                                i18 = 0;
                                            } else {
                                                i18 = 8;
                                            }
                                            if (z6) {
                                                i19 = 0;
                                            } else {
                                                i19 = 8;
                                            }
                                            onClickListener = onClickListenerK0;
                                            i3 = i21;
                                            i = 8;
                                            i11 = i18;
                                            i2 = i19;
                                            str = str11;
                                        } else {
                                            onClickListener = onClickListenerK0;
                                            str = str11;
                                            i3 = i16;
                                            i2 = 0;
                                            i = 8;
                                            i11 = 0;
                                        }
                                        str3 = str9;
                                        onClickListener2 = onClickListenerJ0;
                                        str4 = str10;
                                        i4 = i14;
                                        z3 = zZ0;
                                        str5 = str8;
                                        i6 = i15;
                                        i8 = i20;
                                        onLongClickListener = longListener;
                                        drawable = drawableB;
                                        z = z4;
                                    } else {
                                        i6Var = i6Var;
                                        z4 = zEquals;
                                        str11 = null;
                                    }
                                    j11 = j6 & 83968;
                                    if (j11 != 0) {
                                        if (i6Var != null) {
                                            uVarO0 = i6Var.o0();
                                        } else {
                                            uVarO0 = null;
                                        }
                                        int i22 = i16;
                                        p1(11, uVarO0);
                                        if (uVarO0 != null) {
                                            i17 = uVarO0.get();
                                        } else {
                                            i17 = 0;
                                        }
                                        if (i17 == 2) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (i17 == 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        if (j11 != 0) {
                                            if (z5) {
                                                j13 = 268435456;
                                            } else {
                                                j13 = 134217728;
                                            }
                                            j6 |= j13;
                                        }
                                        if ((j6 & 83968) != 0) {
                                            if (z6) {
                                                j12 = 67108864;
                                            } else {
                                                j12 = 33554432;
                                            }
                                            j6 |= j12;
                                        }
                                        if (z5) {
                                            i18 = 0;
                                        } else {
                                            i18 = 8;
                                        }
                                        if (z6) {
                                            i19 = 0;
                                        } else {
                                            i19 = 8;
                                        }
                                        onClickListener = onClickListenerK0;
                                        i3 = i22;
                                        i = 8;
                                        i11 = i18;
                                        i2 = i19;
                                        str = str11;
                                    } else {
                                        onClickListener = onClickListenerK0;
                                        str = str11;
                                        i3 = i16;
                                        i2 = 0;
                                        i = 8;
                                        i11 = 0;
                                    }
                                    str3 = str9;
                                    onClickListener2 = onClickListenerJ0;
                                    str4 = str10;
                                    i4 = i14;
                                    z3 = zZ0;
                                    str5 = str8;
                                    i6 = i15;
                                    i8 = i20;
                                    onLongClickListener = longListener;
                                    drawable = drawableB;
                                    z = z4;
                                }
                                j10 = j6 & 82944;
                                if (j10 != 0) {
                                    if (i6Var != null) {
                                        uVarH0 = i6Var.h0();
                                    } else {
                                        uVarH0 = null;
                                    }
                                    z4 = zEquals;
                                    p1(10, uVarH0);
                                    if (uVarH0 != null) {
                                        str11 = (String) uVarH0.get();
                                    } else {
                                        str11 = null;
                                    }
                                    zIsEmpty = TextUtils.isEmpty(str11);
                                    if (j10 != 0) {
                                        if (zIsEmpty) {
                                            j14 = 4194304;
                                        } else {
                                            j14 = 2097152;
                                        }
                                        j6 |= j14;
                                    }
                                    if (zIsEmpty) {
                                    }
                                    j11 = j6 & 83968;
                                    if (j11 != 0) {
                                        if (i6Var != null) {
                                            uVarO0 = i6Var.o0();
                                        } else {
                                            uVarO0 = null;
                                        }
                                        int i23 = i16;
                                        p1(11, uVarO0);
                                        if (uVarO0 != null) {
                                            i17 = uVarO0.get();
                                        } else {
                                            i17 = 0;
                                        }
                                        if (i17 == 2) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (i17 == 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        if (j11 != 0) {
                                            if (z5) {
                                                j13 = 268435456;
                                            } else {
                                                j13 = 134217728;
                                            }
                                            j6 |= j13;
                                        }
                                        if ((j6 & 83968) != 0) {
                                            if (z6) {
                                                j12 = 67108864;
                                            } else {
                                                j12 = 33554432;
                                            }
                                            j6 |= j12;
                                        }
                                        if (z5) {
                                            i18 = 0;
                                        } else {
                                            i18 = 8;
                                        }
                                        if (z6) {
                                            i19 = 0;
                                        } else {
                                            i19 = 8;
                                        }
                                        onClickListener = onClickListenerK0;
                                        i3 = i23;
                                        i = 8;
                                        i11 = i18;
                                        i2 = i19;
                                        str = str11;
                                    } else {
                                        onClickListener = onClickListenerK0;
                                        str = str11;
                                        i3 = i16;
                                        i2 = 0;
                                        i = 8;
                                        i11 = 0;
                                    }
                                    str3 = str9;
                                    onClickListener2 = onClickListenerJ0;
                                    str4 = str10;
                                    i4 = i14;
                                    z3 = zZ0;
                                    str5 = str8;
                                    i6 = i15;
                                    i8 = i20;
                                    onLongClickListener = longListener;
                                    drawable = drawableB;
                                    z = z4;
                                } else {
                                    i6Var = i6Var;
                                    z4 = zEquals;
                                    str11 = null;
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i24 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i24;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            } else {
                                z2 = false;
                            }
                            i15 = 0;
                            j10 = j6 & 82944;
                            if (j10 != 0) {
                                if (i6Var != null) {
                                    uVarH0 = i6Var.h0();
                                } else {
                                    uVarH0 = null;
                                }
                                z4 = zEquals;
                                p1(10, uVarH0);
                                if (uVarH0 != null) {
                                    str11 = (String) uVarH0.get();
                                } else {
                                    str11 = null;
                                }
                                zIsEmpty = TextUtils.isEmpty(str11);
                                if (j10 != 0) {
                                    if (zIsEmpty) {
                                        j14 = 4194304;
                                    } else {
                                        j14 = 2097152;
                                    }
                                    j6 |= j14;
                                }
                                if (zIsEmpty) {
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i25 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i25;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            } else {
                                i6Var = i6Var;
                                z4 = zEquals;
                                str11 = null;
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i26 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i26;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            j6 = j;
                        }
                        i14 = 0;
                        if ((j6 & j4) != 0) {
                            if (i6Var != null) {
                                strT0 = i6Var.t0();
                                clickItemPath = i6Var.getClickItemPath();
                            } else {
                                clickItemPath = null;
                                strT0 = null;
                            }
                            p1(12, clickItemPath);
                            if (clickItemPath != null) {
                                str12 = (String) clickItemPath.get();
                            } else {
                                str12 = null;
                            }
                            zEquals = TextUtils.equals(strT0, str12);
                        } else {
                            zEquals = false;
                        }
                        if ((j6 & 90640) != 0) {
                            if (i6Var != null) {
                                observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                            } else {
                                observableBoolean = null;
                            }
                            p1(9, observableBoolean);
                            if (observableBoolean != null) {
                                z2 = observableBoolean.get();
                            } else {
                                z2 = false;
                            }
                            if ((j6 & 90624) != 0) {
                                if (z2) {
                                    j6 |= 262144;
                                } else {
                                    j6 |= j3;
                                }
                            }
                            if ((j6 & 82448) != 0) {
                                if (z2) {
                                    j6 |= 4294967296L;
                                } else {
                                    j6 |= 2147483648L;
                                }
                            }
                            if ((j6 & 82432) != 0) {
                                if (z2) {
                                    j15 = 74766790688768L;
                                } else {
                                    j15 = 37383395344384L;
                                }
                                j6 |= j15;
                            }
                            if ((j6 & 82432) != 0) {
                                if (z2) {
                                    i15 = 0;
                                } else {
                                    i15 = 8;
                                }
                                if (z2) {
                                }
                                j10 = j6 & 82944;
                                if (j10 != 0) {
                                    if (i6Var != null) {
                                        uVarH0 = i6Var.h0();
                                    } else {
                                        uVarH0 = null;
                                    }
                                    z4 = zEquals;
                                    p1(10, uVarH0);
                                    if (uVarH0 != null) {
                                        str11 = (String) uVarH0.get();
                                    } else {
                                        str11 = null;
                                    }
                                    zIsEmpty = TextUtils.isEmpty(str11);
                                    if (j10 != 0) {
                                        if (zIsEmpty) {
                                            j14 = 4194304;
                                        } else {
                                            j14 = 2097152;
                                        }
                                        j6 |= j14;
                                    }
                                    if (zIsEmpty) {
                                    }
                                    j11 = j6 & 83968;
                                    if (j11 != 0) {
                                        if (i6Var != null) {
                                            uVarO0 = i6Var.o0();
                                        } else {
                                            uVarO0 = null;
                                        }
                                        int i27 = i16;
                                        p1(11, uVarO0);
                                        if (uVarO0 != null) {
                                            i17 = uVarO0.get();
                                        } else {
                                            i17 = 0;
                                        }
                                        if (i17 == 2) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (i17 == 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        if (j11 != 0) {
                                            if (z5) {
                                                j13 = 268435456;
                                            } else {
                                                j13 = 134217728;
                                            }
                                            j6 |= j13;
                                        }
                                        if ((j6 & 83968) != 0) {
                                            if (z6) {
                                                j12 = 67108864;
                                            } else {
                                                j12 = 33554432;
                                            }
                                            j6 |= j12;
                                        }
                                        if (z5) {
                                            i18 = 0;
                                        } else {
                                            i18 = 8;
                                        }
                                        if (z6) {
                                            i19 = 0;
                                        } else {
                                            i19 = 8;
                                        }
                                        onClickListener = onClickListenerK0;
                                        i3 = i27;
                                        i = 8;
                                        i11 = i18;
                                        i2 = i19;
                                        str = str11;
                                    } else {
                                        onClickListener = onClickListenerK0;
                                        str = str11;
                                        i3 = i16;
                                        i2 = 0;
                                        i = 8;
                                        i11 = 0;
                                    }
                                    str3 = str9;
                                    onClickListener2 = onClickListenerJ0;
                                    str4 = str10;
                                    i4 = i14;
                                    z3 = zZ0;
                                    str5 = str8;
                                    i6 = i15;
                                    i8 = i20;
                                    onLongClickListener = longListener;
                                    drawable = drawableB;
                                    z = z4;
                                } else {
                                    i6Var = i6Var;
                                    z4 = zEquals;
                                    str11 = null;
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i28 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i28;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            }
                            j10 = j6 & 82944;
                            if (j10 != 0) {
                                if (i6Var != null) {
                                    uVarH0 = i6Var.h0();
                                } else {
                                    uVarH0 = null;
                                }
                                z4 = zEquals;
                                p1(10, uVarH0);
                                if (uVarH0 != null) {
                                    str11 = (String) uVarH0.get();
                                } else {
                                    str11 = null;
                                }
                                zIsEmpty = TextUtils.isEmpty(str11);
                                if (j10 != 0) {
                                    if (zIsEmpty) {
                                        j14 = 4194304;
                                    } else {
                                        j14 = 2097152;
                                    }
                                    j6 |= j14;
                                }
                                if (zIsEmpty) {
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i29 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i29;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            } else {
                                i6Var = i6Var;
                                z4 = zEquals;
                                str11 = null;
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i210 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i210;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            z2 = false;
                        }
                        i15 = 0;
                        j10 = j6 & 82944;
                        if (j10 != 0) {
                            if (i6Var != null) {
                                uVarH0 = i6Var.h0();
                            } else {
                                uVarH0 = null;
                            }
                            z4 = zEquals;
                            p1(10, uVarH0);
                            if (uVarH0 != null) {
                                str11 = (String) uVarH0.get();
                            } else {
                                str11 = null;
                            }
                            zIsEmpty = TextUtils.isEmpty(str11);
                            if (j10 != 0) {
                                if (zIsEmpty) {
                                    j14 = 4194304;
                                } else {
                                    j14 = 2097152;
                                }
                                j6 |= j14;
                            }
                            if (zIsEmpty) {
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i211 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i211;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            i6Var = i6Var;
                            z4 = zEquals;
                            str11 = null;
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i212 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i212;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        str10 = null;
                    }
                    j9 = j & j5;
                    if (j9 != 0) {
                        if (i6Var != null) {
                            long j23 = j;
                            uVarQ0 = i6Var.q0();
                            j6 = j23;
                        } else {
                            j6 = j;
                            uVarQ0 = null;
                        }
                        p1(8, uVarQ0);
                        if (uVarQ0 != null) {
                            bool = (Boolean) uVarQ0.get();
                        } else {
                            bool = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool);
                        if (j9 != 0) {
                            if (zK2) {
                                j16 = 68719476736L;
                            } else {
                                j16 = 34359738368L;
                            }
                            j6 |= j16;
                        }
                        if (zK2) {
                            i14 = 8;
                        }
                        if ((j6 & j4) != 0) {
                            if (i6Var != null) {
                                strT0 = i6Var.t0();
                                clickItemPath = i6Var.getClickItemPath();
                            } else {
                                clickItemPath = null;
                                strT0 = null;
                            }
                            p1(12, clickItemPath);
                            if (clickItemPath != null) {
                                str12 = (String) clickItemPath.get();
                            } else {
                                str12 = null;
                            }
                            zEquals = TextUtils.equals(strT0, str12);
                        } else {
                            zEquals = false;
                        }
                        if ((j6 & 90640) != 0) {
                            if (i6Var != null) {
                                observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                            } else {
                                observableBoolean = null;
                            }
                            p1(9, observableBoolean);
                            if (observableBoolean != null) {
                                z2 = observableBoolean.get();
                            } else {
                                z2 = false;
                            }
                            if ((j6 & 90624) != 0) {
                                if (z2) {
                                    j6 |= 262144;
                                } else {
                                    j6 |= j3;
                                }
                            }
                            if ((j6 & 82448) != 0) {
                                if (z2) {
                                    j6 |= 4294967296L;
                                } else {
                                    j6 |= 2147483648L;
                                }
                            }
                            if ((j6 & 82432) != 0) {
                                if (z2) {
                                    j15 = 74766790688768L;
                                } else {
                                    j15 = 37383395344384L;
                                }
                                j6 |= j15;
                            }
                            if ((j6 & 82432) != 0) {
                                if (z2) {
                                    i15 = 0;
                                } else {
                                    i15 = 8;
                                }
                                if (z2) {
                                }
                                j10 = j6 & 82944;
                                if (j10 != 0) {
                                    if (i6Var != null) {
                                        uVarH0 = i6Var.h0();
                                    } else {
                                        uVarH0 = null;
                                    }
                                    z4 = zEquals;
                                    p1(10, uVarH0);
                                    if (uVarH0 != null) {
                                        str11 = (String) uVarH0.get();
                                    } else {
                                        str11 = null;
                                    }
                                    zIsEmpty = TextUtils.isEmpty(str11);
                                    if (j10 != 0) {
                                        if (zIsEmpty) {
                                            j14 = 4194304;
                                        } else {
                                            j14 = 2097152;
                                        }
                                        j6 |= j14;
                                    }
                                    if (zIsEmpty) {
                                    }
                                    j11 = j6 & 83968;
                                    if (j11 != 0) {
                                        if (i6Var != null) {
                                            uVarO0 = i6Var.o0();
                                        } else {
                                            uVarO0 = null;
                                        }
                                        int i213 = i16;
                                        p1(11, uVarO0);
                                        if (uVarO0 != null) {
                                            i17 = uVarO0.get();
                                        } else {
                                            i17 = 0;
                                        }
                                        if (i17 == 2) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (i17 == 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        if (j11 != 0) {
                                            if (z5) {
                                                j13 = 268435456;
                                            } else {
                                                j13 = 134217728;
                                            }
                                            j6 |= j13;
                                        }
                                        if ((j6 & 83968) != 0) {
                                            if (z6) {
                                                j12 = 67108864;
                                            } else {
                                                j12 = 33554432;
                                            }
                                            j6 |= j12;
                                        }
                                        if (z5) {
                                            i18 = 0;
                                        } else {
                                            i18 = 8;
                                        }
                                        if (z6) {
                                            i19 = 0;
                                        } else {
                                            i19 = 8;
                                        }
                                        onClickListener = onClickListenerK0;
                                        i3 = i213;
                                        i = 8;
                                        i11 = i18;
                                        i2 = i19;
                                        str = str11;
                                    } else {
                                        onClickListener = onClickListenerK0;
                                        str = str11;
                                        i3 = i16;
                                        i2 = 0;
                                        i = 8;
                                        i11 = 0;
                                    }
                                    str3 = str9;
                                    onClickListener2 = onClickListenerJ0;
                                    str4 = str10;
                                    i4 = i14;
                                    z3 = zZ0;
                                    str5 = str8;
                                    i6 = i15;
                                    i8 = i20;
                                    onLongClickListener = longListener;
                                    drawable = drawableB;
                                    z = z4;
                                } else {
                                    i6Var = i6Var;
                                    z4 = zEquals;
                                    str11 = null;
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i214 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i214;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            }
                            j10 = j6 & 82944;
                            if (j10 != 0) {
                                if (i6Var != null) {
                                    uVarH0 = i6Var.h0();
                                } else {
                                    uVarH0 = null;
                                }
                                z4 = zEquals;
                                p1(10, uVarH0);
                                if (uVarH0 != null) {
                                    str11 = (String) uVarH0.get();
                                } else {
                                    str11 = null;
                                }
                                zIsEmpty = TextUtils.isEmpty(str11);
                                if (j10 != 0) {
                                    if (zIsEmpty) {
                                        j14 = 4194304;
                                    } else {
                                        j14 = 2097152;
                                    }
                                    j6 |= j14;
                                }
                                if (zIsEmpty) {
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i215 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i215;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            } else {
                                i6Var = i6Var;
                                z4 = zEquals;
                                str11 = null;
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i216 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i216;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            z2 = false;
                        }
                        i15 = 0;
                        j10 = j6 & 82944;
                        if (j10 != 0) {
                            if (i6Var != null) {
                                uVarH0 = i6Var.h0();
                            } else {
                                uVarH0 = null;
                            }
                            z4 = zEquals;
                            p1(10, uVarH0);
                            if (uVarH0 != null) {
                                str11 = (String) uVarH0.get();
                            } else {
                                str11 = null;
                            }
                            zIsEmpty = TextUtils.isEmpty(str11);
                            if (j10 != 0) {
                                if (zIsEmpty) {
                                    j14 = 4194304;
                                } else {
                                    j14 = 2097152;
                                }
                                j6 |= j14;
                            }
                            if (zIsEmpty) {
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i217 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i217;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            i6Var = i6Var;
                            z4 = zEquals;
                            str11 = null;
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i218 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i218;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        j6 = j;
                    }
                    i14 = 0;
                    if ((j6 & j4) != 0) {
                        if (i6Var != null) {
                            strT0 = i6Var.t0();
                            clickItemPath = i6Var.getClickItemPath();
                        } else {
                            clickItemPath = null;
                            strT0 = null;
                        }
                        p1(12, clickItemPath);
                        if (clickItemPath != null) {
                            str12 = (String) clickItemPath.get();
                        } else {
                            str12 = null;
                        }
                        zEquals = TextUtils.equals(strT0, str12);
                    } else {
                        zEquals = false;
                    }
                    if ((j6 & 90640) != 0) {
                        if (i6Var != null) {
                            observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                        } else {
                            observableBoolean = null;
                        }
                        p1(9, observableBoolean);
                        if (observableBoolean != null) {
                            z2 = observableBoolean.get();
                        } else {
                            z2 = false;
                        }
                        if ((j6 & 90624) != 0) {
                            if (z2) {
                                j6 |= 262144;
                            } else {
                                j6 |= j3;
                            }
                        }
                        if ((j6 & 82448) != 0) {
                            if (z2) {
                                j6 |= 4294967296L;
                            } else {
                                j6 |= 2147483648L;
                            }
                        }
                        if ((j6 & 82432) != 0) {
                            if (z2) {
                                j15 = 74766790688768L;
                            } else {
                                j15 = 37383395344384L;
                            }
                            j6 |= j15;
                        }
                        if ((j6 & 82432) != 0) {
                            if (z2) {
                                i15 = 0;
                            } else {
                                i15 = 8;
                            }
                            if (z2) {
                            }
                            j10 = j6 & 82944;
                            if (j10 != 0) {
                                if (i6Var != null) {
                                    uVarH0 = i6Var.h0();
                                } else {
                                    uVarH0 = null;
                                }
                                z4 = zEquals;
                                p1(10, uVarH0);
                                if (uVarH0 != null) {
                                    str11 = (String) uVarH0.get();
                                } else {
                                    str11 = null;
                                }
                                zIsEmpty = TextUtils.isEmpty(str11);
                                if (j10 != 0) {
                                    if (zIsEmpty) {
                                        j14 = 4194304;
                                    } else {
                                        j14 = 2097152;
                                    }
                                    j6 |= j14;
                                }
                                if (zIsEmpty) {
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i219 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i219;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            } else {
                                i6Var = i6Var;
                                z4 = zEquals;
                                str11 = null;
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i2110 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i2110;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        }
                        j10 = j6 & 82944;
                        if (j10 != 0) {
                            if (i6Var != null) {
                                uVarH0 = i6Var.h0();
                            } else {
                                uVarH0 = null;
                            }
                            z4 = zEquals;
                            p1(10, uVarH0);
                            if (uVarH0 != null) {
                                str11 = (String) uVarH0.get();
                            } else {
                                str11 = null;
                            }
                            zIsEmpty = TextUtils.isEmpty(str11);
                            if (j10 != 0) {
                                if (zIsEmpty) {
                                    j14 = 4194304;
                                } else {
                                    j14 = 2097152;
                                }
                                j6 |= j14;
                            }
                            if (zIsEmpty) {
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i2111 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i2111;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            i6Var = i6Var;
                            z4 = zEquals;
                            str11 = null;
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i2112 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i2112;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        z2 = false;
                    }
                    i15 = 0;
                    j10 = j6 & 82944;
                    if (j10 != 0) {
                        if (i6Var != null) {
                            uVarH0 = i6Var.h0();
                        } else {
                            uVarH0 = null;
                        }
                        z4 = zEquals;
                        p1(10, uVarH0);
                        if (uVarH0 != null) {
                            str11 = (String) uVarH0.get();
                        } else {
                            str11 = null;
                        }
                        zIsEmpty = TextUtils.isEmpty(str11);
                        if (j10 != 0) {
                            if (zIsEmpty) {
                                j14 = 4194304;
                            } else {
                                j14 = 2097152;
                            }
                            j6 |= j14;
                        }
                        if (zIsEmpty) {
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i2113 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i2113;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        i6Var = i6Var;
                        z4 = zEquals;
                        str11 = null;
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i2114 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i2114;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    j5 = 82176;
                    str2 = null;
                }
                j8 = j & 82048;
                if (j8 != 0) {
                    if (i6Var != null) {
                        progress = i6Var.getProgress();
                    } else {
                        progress = null;
                    }
                    p1(7, progress);
                    if (progress != null) {
                        str10 = (String) progress.get();
                    } else {
                        str10 = null;
                    }
                    zIsEmpty2 = TextUtils.isEmpty(str10);
                    if (j8 != 0) {
                        if (zIsEmpty2) {
                            j17 = 274877906944L;
                        } else {
                            j17 = 137438953472L;
                        }
                        j |= j17;
                    }
                    if (zIsEmpty2) {
                    }
                    j9 = j & j5;
                    if (j9 != 0) {
                        if (i6Var != null) {
                            long j24 = j;
                            uVarQ0 = i6Var.q0();
                            j6 = j24;
                        } else {
                            j6 = j;
                            uVarQ0 = null;
                        }
                        p1(8, uVarQ0);
                        if (uVarQ0 != null) {
                            bool = (Boolean) uVarQ0.get();
                        } else {
                            bool = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool);
                        if (j9 != 0) {
                            if (zK2) {
                                j16 = 68719476736L;
                            } else {
                                j16 = 34359738368L;
                            }
                            j6 |= j16;
                        }
                        if (zK2) {
                            i14 = 8;
                        }
                        if ((j6 & j4) != 0) {
                            if (i6Var != null) {
                                strT0 = i6Var.t0();
                                clickItemPath = i6Var.getClickItemPath();
                            } else {
                                clickItemPath = null;
                                strT0 = null;
                            }
                            p1(12, clickItemPath);
                            if (clickItemPath != null) {
                                str12 = (String) clickItemPath.get();
                            } else {
                                str12 = null;
                            }
                            zEquals = TextUtils.equals(strT0, str12);
                        } else {
                            zEquals = false;
                        }
                        if ((j6 & 90640) != 0) {
                            if (i6Var != null) {
                                observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                            } else {
                                observableBoolean = null;
                            }
                            p1(9, observableBoolean);
                            if (observableBoolean != null) {
                                z2 = observableBoolean.get();
                            } else {
                                z2 = false;
                            }
                            if ((j6 & 90624) != 0) {
                                if (z2) {
                                    j6 |= 262144;
                                } else {
                                    j6 |= j3;
                                }
                            }
                            if ((j6 & 82448) != 0) {
                                if (z2) {
                                    j6 |= 4294967296L;
                                } else {
                                    j6 |= 2147483648L;
                                }
                            }
                            if ((j6 & 82432) != 0) {
                                if (z2) {
                                    j15 = 74766790688768L;
                                } else {
                                    j15 = 37383395344384L;
                                }
                                j6 |= j15;
                            }
                            if ((j6 & 82432) != 0) {
                                if (z2) {
                                    i15 = 0;
                                } else {
                                    i15 = 8;
                                }
                                if (z2) {
                                }
                                j10 = j6 & 82944;
                                if (j10 != 0) {
                                    if (i6Var != null) {
                                        uVarH0 = i6Var.h0();
                                    } else {
                                        uVarH0 = null;
                                    }
                                    z4 = zEquals;
                                    p1(10, uVarH0);
                                    if (uVarH0 != null) {
                                        str11 = (String) uVarH0.get();
                                    } else {
                                        str11 = null;
                                    }
                                    zIsEmpty = TextUtils.isEmpty(str11);
                                    if (j10 != 0) {
                                        if (zIsEmpty) {
                                            j14 = 4194304;
                                        } else {
                                            j14 = 2097152;
                                        }
                                        j6 |= j14;
                                    }
                                    if (zIsEmpty) {
                                    }
                                    j11 = j6 & 83968;
                                    if (j11 != 0) {
                                        if (i6Var != null) {
                                            uVarO0 = i6Var.o0();
                                        } else {
                                            uVarO0 = null;
                                        }
                                        int i2115 = i16;
                                        p1(11, uVarO0);
                                        if (uVarO0 != null) {
                                            i17 = uVarO0.get();
                                        } else {
                                            i17 = 0;
                                        }
                                        if (i17 == 2) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (i17 == 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        if (j11 != 0) {
                                            if (z5) {
                                                j13 = 268435456;
                                            } else {
                                                j13 = 134217728;
                                            }
                                            j6 |= j13;
                                        }
                                        if ((j6 & 83968) != 0) {
                                            if (z6) {
                                                j12 = 67108864;
                                            } else {
                                                j12 = 33554432;
                                            }
                                            j6 |= j12;
                                        }
                                        if (z5) {
                                            i18 = 0;
                                        } else {
                                            i18 = 8;
                                        }
                                        if (z6) {
                                            i19 = 0;
                                        } else {
                                            i19 = 8;
                                        }
                                        onClickListener = onClickListenerK0;
                                        i3 = i2115;
                                        i = 8;
                                        i11 = i18;
                                        i2 = i19;
                                        str = str11;
                                    } else {
                                        onClickListener = onClickListenerK0;
                                        str = str11;
                                        i3 = i16;
                                        i2 = 0;
                                        i = 8;
                                        i11 = 0;
                                    }
                                    str3 = str9;
                                    onClickListener2 = onClickListenerJ0;
                                    str4 = str10;
                                    i4 = i14;
                                    z3 = zZ0;
                                    str5 = str8;
                                    i6 = i15;
                                    i8 = i20;
                                    onLongClickListener = longListener;
                                    drawable = drawableB;
                                    z = z4;
                                } else {
                                    i6Var = i6Var;
                                    z4 = zEquals;
                                    str11 = null;
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i2116 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i2116;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            }
                            j10 = j6 & 82944;
                            if (j10 != 0) {
                                if (i6Var != null) {
                                    uVarH0 = i6Var.h0();
                                } else {
                                    uVarH0 = null;
                                }
                                z4 = zEquals;
                                p1(10, uVarH0);
                                if (uVarH0 != null) {
                                    str11 = (String) uVarH0.get();
                                } else {
                                    str11 = null;
                                }
                                zIsEmpty = TextUtils.isEmpty(str11);
                                if (j10 != 0) {
                                    if (zIsEmpty) {
                                        j14 = 4194304;
                                    } else {
                                        j14 = 2097152;
                                    }
                                    j6 |= j14;
                                }
                                if (zIsEmpty) {
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i2117 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i2117;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            } else {
                                i6Var = i6Var;
                                z4 = zEquals;
                                str11 = null;
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i2118 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i2118;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            z2 = false;
                        }
                        i15 = 0;
                        j10 = j6 & 82944;
                        if (j10 != 0) {
                            if (i6Var != null) {
                                uVarH0 = i6Var.h0();
                            } else {
                                uVarH0 = null;
                            }
                            z4 = zEquals;
                            p1(10, uVarH0);
                            if (uVarH0 != null) {
                                str11 = (String) uVarH0.get();
                            } else {
                                str11 = null;
                            }
                            zIsEmpty = TextUtils.isEmpty(str11);
                            if (j10 != 0) {
                                if (zIsEmpty) {
                                    j14 = 4194304;
                                } else {
                                    j14 = 2097152;
                                }
                                j6 |= j14;
                            }
                            if (zIsEmpty) {
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i2119 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i2119;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            i6Var = i6Var;
                            z4 = zEquals;
                            str11 = null;
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i21110 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i21110;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        j6 = j;
                    }
                    i14 = 0;
                    if ((j6 & j4) != 0) {
                        if (i6Var != null) {
                            strT0 = i6Var.t0();
                            clickItemPath = i6Var.getClickItemPath();
                        } else {
                            clickItemPath = null;
                            strT0 = null;
                        }
                        p1(12, clickItemPath);
                        if (clickItemPath != null) {
                            str12 = (String) clickItemPath.get();
                        } else {
                            str12 = null;
                        }
                        zEquals = TextUtils.equals(strT0, str12);
                    } else {
                        zEquals = false;
                    }
                    if ((j6 & 90640) != 0) {
                        if (i6Var != null) {
                            observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                        } else {
                            observableBoolean = null;
                        }
                        p1(9, observableBoolean);
                        if (observableBoolean != null) {
                            z2 = observableBoolean.get();
                        } else {
                            z2 = false;
                        }
                        if ((j6 & 90624) != 0) {
                            if (z2) {
                                j6 |= 262144;
                            } else {
                                j6 |= j3;
                            }
                        }
                        if ((j6 & 82448) != 0) {
                            if (z2) {
                                j6 |= 4294967296L;
                            } else {
                                j6 |= 2147483648L;
                            }
                        }
                        if ((j6 & 82432) != 0) {
                            if (z2) {
                                j15 = 74766790688768L;
                            } else {
                                j15 = 37383395344384L;
                            }
                            j6 |= j15;
                        }
                        if ((j6 & 82432) != 0) {
                            if (z2) {
                                i15 = 0;
                            } else {
                                i15 = 8;
                            }
                            if (z2) {
                            }
                            j10 = j6 & 82944;
                            if (j10 != 0) {
                                if (i6Var != null) {
                                    uVarH0 = i6Var.h0();
                                } else {
                                    uVarH0 = null;
                                }
                                z4 = zEquals;
                                p1(10, uVarH0);
                                if (uVarH0 != null) {
                                    str11 = (String) uVarH0.get();
                                } else {
                                    str11 = null;
                                }
                                zIsEmpty = TextUtils.isEmpty(str11);
                                if (j10 != 0) {
                                    if (zIsEmpty) {
                                        j14 = 4194304;
                                    } else {
                                        j14 = 2097152;
                                    }
                                    j6 |= j14;
                                }
                                if (zIsEmpty) {
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i21111 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i21111;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            } else {
                                i6Var = i6Var;
                                z4 = zEquals;
                                str11 = null;
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i21112 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i21112;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        }
                        j10 = j6 & 82944;
                        if (j10 != 0) {
                            if (i6Var != null) {
                                uVarH0 = i6Var.h0();
                            } else {
                                uVarH0 = null;
                            }
                            z4 = zEquals;
                            p1(10, uVarH0);
                            if (uVarH0 != null) {
                                str11 = (String) uVarH0.get();
                            } else {
                                str11 = null;
                            }
                            zIsEmpty = TextUtils.isEmpty(str11);
                            if (j10 != 0) {
                                if (zIsEmpty) {
                                    j14 = 4194304;
                                } else {
                                    j14 = 2097152;
                                }
                                j6 |= j14;
                            }
                            if (zIsEmpty) {
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i21113 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i21113;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            i6Var = i6Var;
                            z4 = zEquals;
                            str11 = null;
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i21114 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i21114;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        z2 = false;
                    }
                    i15 = 0;
                    j10 = j6 & 82944;
                    if (j10 != 0) {
                        if (i6Var != null) {
                            uVarH0 = i6Var.h0();
                        } else {
                            uVarH0 = null;
                        }
                        z4 = zEquals;
                        p1(10, uVarH0);
                        if (uVarH0 != null) {
                            str11 = (String) uVarH0.get();
                        } else {
                            str11 = null;
                        }
                        zIsEmpty = TextUtils.isEmpty(str11);
                        if (j10 != 0) {
                            if (zIsEmpty) {
                                j14 = 4194304;
                            } else {
                                j14 = 2097152;
                            }
                            j6 |= j14;
                        }
                        if (zIsEmpty) {
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i21115 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i21115;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        i6Var = i6Var;
                        z4 = zEquals;
                        str11 = null;
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i21116 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i21116;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    str10 = null;
                }
                j9 = j & j5;
                if (j9 != 0) {
                    if (i6Var != null) {
                        long j25 = j;
                        uVarQ0 = i6Var.q0();
                        j6 = j25;
                    } else {
                        j6 = j;
                        uVarQ0 = null;
                    }
                    p1(8, uVarQ0);
                    if (uVarQ0 != null) {
                        bool = (Boolean) uVarQ0.get();
                    } else {
                        bool = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool);
                    if (j9 != 0) {
                        if (zK2) {
                            j16 = 68719476736L;
                        } else {
                            j16 = 34359738368L;
                        }
                        j6 |= j16;
                    }
                    if (zK2) {
                        i14 = 8;
                    }
                    if ((j6 & j4) != 0) {
                        if (i6Var != null) {
                            strT0 = i6Var.t0();
                            clickItemPath = i6Var.getClickItemPath();
                        } else {
                            clickItemPath = null;
                            strT0 = null;
                        }
                        p1(12, clickItemPath);
                        if (clickItemPath != null) {
                            str12 = (String) clickItemPath.get();
                        } else {
                            str12 = null;
                        }
                        zEquals = TextUtils.equals(strT0, str12);
                    } else {
                        zEquals = false;
                    }
                    if ((j6 & 90640) != 0) {
                        if (i6Var != null) {
                            observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                        } else {
                            observableBoolean = null;
                        }
                        p1(9, observableBoolean);
                        if (observableBoolean != null) {
                            z2 = observableBoolean.get();
                        } else {
                            z2 = false;
                        }
                        if ((j6 & 90624) != 0) {
                            if (z2) {
                                j6 |= 262144;
                            } else {
                                j6 |= j3;
                            }
                        }
                        if ((j6 & 82448) != 0) {
                            if (z2) {
                                j6 |= 4294967296L;
                            } else {
                                j6 |= 2147483648L;
                            }
                        }
                        if ((j6 & 82432) != 0) {
                            if (z2) {
                                j15 = 74766790688768L;
                            } else {
                                j15 = 37383395344384L;
                            }
                            j6 |= j15;
                        }
                        if ((j6 & 82432) != 0) {
                            if (z2) {
                                i15 = 0;
                            } else {
                                i15 = 8;
                            }
                            if (z2) {
                            }
                            j10 = j6 & 82944;
                            if (j10 != 0) {
                                if (i6Var != null) {
                                    uVarH0 = i6Var.h0();
                                } else {
                                    uVarH0 = null;
                                }
                                z4 = zEquals;
                                p1(10, uVarH0);
                                if (uVarH0 != null) {
                                    str11 = (String) uVarH0.get();
                                } else {
                                    str11 = null;
                                }
                                zIsEmpty = TextUtils.isEmpty(str11);
                                if (j10 != 0) {
                                    if (zIsEmpty) {
                                        j14 = 4194304;
                                    } else {
                                        j14 = 2097152;
                                    }
                                    j6 |= j14;
                                }
                                if (zIsEmpty) {
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i21117 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i21117;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            } else {
                                i6Var = i6Var;
                                z4 = zEquals;
                                str11 = null;
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i21118 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i21118;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        }
                        j10 = j6 & 82944;
                        if (j10 != 0) {
                            if (i6Var != null) {
                                uVarH0 = i6Var.h0();
                            } else {
                                uVarH0 = null;
                            }
                            z4 = zEquals;
                            p1(10, uVarH0);
                            if (uVarH0 != null) {
                                str11 = (String) uVarH0.get();
                            } else {
                                str11 = null;
                            }
                            zIsEmpty = TextUtils.isEmpty(str11);
                            if (j10 != 0) {
                                if (zIsEmpty) {
                                    j14 = 4194304;
                                } else {
                                    j14 = 2097152;
                                }
                                j6 |= j14;
                            }
                            if (zIsEmpty) {
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i21119 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i21119;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            i6Var = i6Var;
                            z4 = zEquals;
                            str11 = null;
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i211110 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i211110;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        z2 = false;
                    }
                    i15 = 0;
                    j10 = j6 & 82944;
                    if (j10 != 0) {
                        if (i6Var != null) {
                            uVarH0 = i6Var.h0();
                        } else {
                            uVarH0 = null;
                        }
                        z4 = zEquals;
                        p1(10, uVarH0);
                        if (uVarH0 != null) {
                            str11 = (String) uVarH0.get();
                        } else {
                            str11 = null;
                        }
                        zIsEmpty = TextUtils.isEmpty(str11);
                        if (j10 != 0) {
                            if (zIsEmpty) {
                                j14 = 4194304;
                            } else {
                                j14 = 2097152;
                            }
                            j6 |= j14;
                        }
                        if (zIsEmpty) {
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i211111 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i211111;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        i6Var = i6Var;
                        z4 = zEquals;
                        str11 = null;
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i211112 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i211112;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    j6 = j;
                }
                i14 = 0;
                if ((j6 & j4) != 0) {
                    if (i6Var != null) {
                        strT0 = i6Var.t0();
                        clickItemPath = i6Var.getClickItemPath();
                    } else {
                        clickItemPath = null;
                        strT0 = null;
                    }
                    p1(12, clickItemPath);
                    if (clickItemPath != null) {
                        str12 = (String) clickItemPath.get();
                    } else {
                        str12 = null;
                    }
                    zEquals = TextUtils.equals(strT0, str12);
                } else {
                    zEquals = false;
                }
                if ((j6 & 90640) != 0) {
                    if (i6Var != null) {
                        observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                    } else {
                        observableBoolean = null;
                    }
                    p1(9, observableBoolean);
                    if (observableBoolean != null) {
                        z2 = observableBoolean.get();
                    } else {
                        z2 = false;
                    }
                    if ((j6 & 90624) != 0) {
                        if (z2) {
                            j6 |= 262144;
                        } else {
                            j6 |= j3;
                        }
                    }
                    if ((j6 & 82448) != 0) {
                        if (z2) {
                            j6 |= 4294967296L;
                        } else {
                            j6 |= 2147483648L;
                        }
                    }
                    if ((j6 & 82432) != 0) {
                        if (z2) {
                            j15 = 74766790688768L;
                        } else {
                            j15 = 37383395344384L;
                        }
                        j6 |= j15;
                    }
                    if ((j6 & 82432) != 0) {
                        if (z2) {
                            i15 = 0;
                        } else {
                            i15 = 8;
                        }
                        if (z2) {
                        }
                        j10 = j6 & 82944;
                        if (j10 != 0) {
                            if (i6Var != null) {
                                uVarH0 = i6Var.h0();
                            } else {
                                uVarH0 = null;
                            }
                            z4 = zEquals;
                            p1(10, uVarH0);
                            if (uVarH0 != null) {
                                str11 = (String) uVarH0.get();
                            } else {
                                str11 = null;
                            }
                            zIsEmpty = TextUtils.isEmpty(str11);
                            if (j10 != 0) {
                                if (zIsEmpty) {
                                    j14 = 4194304;
                                } else {
                                    j14 = 2097152;
                                }
                                j6 |= j14;
                            }
                            if (zIsEmpty) {
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i211113 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i211113;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            i6Var = i6Var;
                            z4 = zEquals;
                            str11 = null;
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i211114 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i211114;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    }
                    j10 = j6 & 82944;
                    if (j10 != 0) {
                        if (i6Var != null) {
                            uVarH0 = i6Var.h0();
                        } else {
                            uVarH0 = null;
                        }
                        z4 = zEquals;
                        p1(10, uVarH0);
                        if (uVarH0 != null) {
                            str11 = (String) uVarH0.get();
                        } else {
                            str11 = null;
                        }
                        zIsEmpty = TextUtils.isEmpty(str11);
                        if (j10 != 0) {
                            if (zIsEmpty) {
                                j14 = 4194304;
                            } else {
                                j14 = 2097152;
                            }
                            j6 |= j14;
                        }
                        if (zIsEmpty) {
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i211115 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i211115;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        i6Var = i6Var;
                        z4 = zEquals;
                        str11 = null;
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i211116 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i211116;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    z2 = false;
                }
                i15 = 0;
                j10 = j6 & 82944;
                if (j10 != 0) {
                    if (i6Var != null) {
                        uVarH0 = i6Var.h0();
                    } else {
                        uVarH0 = null;
                    }
                    z4 = zEquals;
                    p1(10, uVarH0);
                    if (uVarH0 != null) {
                        str11 = (String) uVarH0.get();
                    } else {
                        str11 = null;
                    }
                    zIsEmpty = TextUtils.isEmpty(str11);
                    if (j10 != 0) {
                        if (zIsEmpty) {
                            j14 = 4194304;
                        } else {
                            j14 = 2097152;
                        }
                        j6 |= j14;
                    }
                    if (zIsEmpty) {
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i211117 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i211117;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    i6Var = i6Var;
                    z4 = zEquals;
                    str11 = null;
                }
                j11 = j6 & 83968;
                if (j11 != 0) {
                    if (i6Var != null) {
                        uVarO0 = i6Var.o0();
                    } else {
                        uVarO0 = null;
                    }
                    int i211118 = i16;
                    p1(11, uVarO0);
                    if (uVarO0 != null) {
                        i17 = uVarO0.get();
                    } else {
                        i17 = 0;
                    }
                    if (i17 == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i17 == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (j11 != 0) {
                        if (z5) {
                            j13 = 268435456;
                        } else {
                            j13 = 134217728;
                        }
                        j6 |= j13;
                    }
                    if ((j6 & 83968) != 0) {
                        if (z6) {
                            j12 = 67108864;
                        } else {
                            j12 = 33554432;
                        }
                        j6 |= j12;
                    }
                    if (z5) {
                        i18 = 0;
                    } else {
                        i18 = 8;
                    }
                    if (z6) {
                        i19 = 0;
                    } else {
                        i19 = 8;
                    }
                    onClickListener = onClickListenerK0;
                    i3 = i211118;
                    i = 8;
                    i11 = i18;
                    i2 = i19;
                    str = str11;
                } else {
                    onClickListener = onClickListenerK0;
                    str = str11;
                    i3 = i16;
                    i2 = 0;
                    i = 8;
                    i11 = 0;
                }
                str3 = str9;
                onClickListener2 = onClickListenerJ0;
                str4 = str10;
                i4 = i14;
                z3 = zZ0;
                str5 = str8;
                i6 = i15;
                i8 = i20;
                onLongClickListener = longListener;
                drawable = drawableB;
                z = z4;
            } else {
                str9 = null;
            }
            if ((j & 81960) != 0) {
                if (i6Var != null) {
                    androidx.databinding.u uVarM1 = i6Var.m0();
                    androidx.databinding.u uVarU1 = i6Var.u0();
                    zZ0 = i6Var.z0();
                    uVar = uVarM1;
                    uVar2 = uVarU1;
                } else {
                    uVar = null;
                    uVar2 = null;
                    zZ0 = false;
                }
                j3 = 131072;
                j4 = 86016;
                p1(3, uVar);
                p1(5, uVar2);
                if (uVar != null) {
                    str6 = (String) uVar.get();
                } else {
                    str6 = null;
                }
                if (uVar2 != null) {
                    str7 = (String) uVar2.get();
                } else {
                    str7 = null;
                }
            } else {
                j3 = 131072;
                j4 = 86016;
                str6 = null;
                str7 = null;
                zZ0 = false;
            }
            j7 = j & 81984;
            if (j7 != 0) {
                if (i6Var != null) {
                    observableFieldV0 = i6Var.v0();
                } else {
                    observableFieldV0 = null;
                }
                j5 = 82176;
                p1(6, observableFieldV0);
                if (observableFieldV0 != null) {
                    str2 = (String) observableFieldV0.get();
                } else {
                    str2 = null;
                }
                zIsEmpty3 = TextUtils.isEmpty(str2);
                if (j7 != 0) {
                    if (zIsEmpty3) {
                        j18 = 17592186044416L;
                    } else {
                        j18 = 8796093022208L;
                    }
                    j |= j18;
                }
                if (zIsEmpty3) {
                }
                j8 = j & 82048;
                if (j8 != 0) {
                    if (i6Var != null) {
                        progress = i6Var.getProgress();
                    } else {
                        progress = null;
                    }
                    p1(7, progress);
                    if (progress != null) {
                        str10 = (String) progress.get();
                    } else {
                        str10 = null;
                    }
                    zIsEmpty2 = TextUtils.isEmpty(str10);
                    if (j8 != 0) {
                        if (zIsEmpty2) {
                            j17 = 274877906944L;
                        } else {
                            j17 = 137438953472L;
                        }
                        j |= j17;
                    }
                    if (zIsEmpty2) {
                    }
                    j9 = j & j5;
                    if (j9 != 0) {
                        if (i6Var != null) {
                            long j26 = j;
                            uVarQ0 = i6Var.q0();
                            j6 = j26;
                        } else {
                            j6 = j;
                            uVarQ0 = null;
                        }
                        p1(8, uVarQ0);
                        if (uVarQ0 != null) {
                            bool = (Boolean) uVarQ0.get();
                        } else {
                            bool = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool);
                        if (j9 != 0) {
                            if (zK2) {
                                j16 = 68719476736L;
                            } else {
                                j16 = 34359738368L;
                            }
                            j6 |= j16;
                        }
                        if (zK2) {
                            i14 = 8;
                        }
                        if ((j6 & j4) != 0) {
                            if (i6Var != null) {
                                strT0 = i6Var.t0();
                                clickItemPath = i6Var.getClickItemPath();
                            } else {
                                clickItemPath = null;
                                strT0 = null;
                            }
                            p1(12, clickItemPath);
                            if (clickItemPath != null) {
                                str12 = (String) clickItemPath.get();
                            } else {
                                str12 = null;
                            }
                            zEquals = TextUtils.equals(strT0, str12);
                        } else {
                            zEquals = false;
                        }
                        if ((j6 & 90640) != 0) {
                            if (i6Var != null) {
                                observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                            } else {
                                observableBoolean = null;
                            }
                            p1(9, observableBoolean);
                            if (observableBoolean != null) {
                                z2 = observableBoolean.get();
                            } else {
                                z2 = false;
                            }
                            if ((j6 & 90624) != 0) {
                                if (z2) {
                                    j6 |= 262144;
                                } else {
                                    j6 |= j3;
                                }
                            }
                            if ((j6 & 82448) != 0) {
                                if (z2) {
                                    j6 |= 4294967296L;
                                } else {
                                    j6 |= 2147483648L;
                                }
                            }
                            if ((j6 & 82432) != 0) {
                                if (z2) {
                                    j15 = 74766790688768L;
                                } else {
                                    j15 = 37383395344384L;
                                }
                                j6 |= j15;
                            }
                            if ((j6 & 82432) != 0) {
                                if (z2) {
                                    i15 = 0;
                                } else {
                                    i15 = 8;
                                }
                                if (z2) {
                                }
                                j10 = j6 & 82944;
                                if (j10 != 0) {
                                    if (i6Var != null) {
                                        uVarH0 = i6Var.h0();
                                    } else {
                                        uVarH0 = null;
                                    }
                                    z4 = zEquals;
                                    p1(10, uVarH0);
                                    if (uVarH0 != null) {
                                        str11 = (String) uVarH0.get();
                                    } else {
                                        str11 = null;
                                    }
                                    zIsEmpty = TextUtils.isEmpty(str11);
                                    if (j10 != 0) {
                                        if (zIsEmpty) {
                                            j14 = 4194304;
                                        } else {
                                            j14 = 2097152;
                                        }
                                        j6 |= j14;
                                    }
                                    if (zIsEmpty) {
                                    }
                                    j11 = j6 & 83968;
                                    if (j11 != 0) {
                                        if (i6Var != null) {
                                            uVarO0 = i6Var.o0();
                                        } else {
                                            uVarO0 = null;
                                        }
                                        int i211119 = i16;
                                        p1(11, uVarO0);
                                        if (uVarO0 != null) {
                                            i17 = uVarO0.get();
                                        } else {
                                            i17 = 0;
                                        }
                                        if (i17 == 2) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (i17 == 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        if (j11 != 0) {
                                            if (z5) {
                                                j13 = 268435456;
                                            } else {
                                                j13 = 134217728;
                                            }
                                            j6 |= j13;
                                        }
                                        if ((j6 & 83968) != 0) {
                                            if (z6) {
                                                j12 = 67108864;
                                            } else {
                                                j12 = 33554432;
                                            }
                                            j6 |= j12;
                                        }
                                        if (z5) {
                                            i18 = 0;
                                        } else {
                                            i18 = 8;
                                        }
                                        if (z6) {
                                            i19 = 0;
                                        } else {
                                            i19 = 8;
                                        }
                                        onClickListener = onClickListenerK0;
                                        i3 = i211119;
                                        i = 8;
                                        i11 = i18;
                                        i2 = i19;
                                        str = str11;
                                    } else {
                                        onClickListener = onClickListenerK0;
                                        str = str11;
                                        i3 = i16;
                                        i2 = 0;
                                        i = 8;
                                        i11 = 0;
                                    }
                                    str3 = str9;
                                    onClickListener2 = onClickListenerJ0;
                                    str4 = str10;
                                    i4 = i14;
                                    z3 = zZ0;
                                    str5 = str8;
                                    i6 = i15;
                                    i8 = i20;
                                    onLongClickListener = longListener;
                                    drawable = drawableB;
                                    z = z4;
                                } else {
                                    i6Var = i6Var;
                                    z4 = zEquals;
                                    str11 = null;
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i2111110 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i2111110;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            }
                            j10 = j6 & 82944;
                            if (j10 != 0) {
                                if (i6Var != null) {
                                    uVarH0 = i6Var.h0();
                                } else {
                                    uVarH0 = null;
                                }
                                z4 = zEquals;
                                p1(10, uVarH0);
                                if (uVarH0 != null) {
                                    str11 = (String) uVarH0.get();
                                } else {
                                    str11 = null;
                                }
                                zIsEmpty = TextUtils.isEmpty(str11);
                                if (j10 != 0) {
                                    if (zIsEmpty) {
                                        j14 = 4194304;
                                    } else {
                                        j14 = 2097152;
                                    }
                                    j6 |= j14;
                                }
                                if (zIsEmpty) {
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i2111111 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i2111111;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            } else {
                                i6Var = i6Var;
                                z4 = zEquals;
                                str11 = null;
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i2111112 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i2111112;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            z2 = false;
                        }
                        i15 = 0;
                        j10 = j6 & 82944;
                        if (j10 != 0) {
                            if (i6Var != null) {
                                uVarH0 = i6Var.h0();
                            } else {
                                uVarH0 = null;
                            }
                            z4 = zEquals;
                            p1(10, uVarH0);
                            if (uVarH0 != null) {
                                str11 = (String) uVarH0.get();
                            } else {
                                str11 = null;
                            }
                            zIsEmpty = TextUtils.isEmpty(str11);
                            if (j10 != 0) {
                                if (zIsEmpty) {
                                    j14 = 4194304;
                                } else {
                                    j14 = 2097152;
                                }
                                j6 |= j14;
                            }
                            if (zIsEmpty) {
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i2111113 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i2111113;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            i6Var = i6Var;
                            z4 = zEquals;
                            str11 = null;
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i2111114 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i2111114;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        j6 = j;
                    }
                    i14 = 0;
                    if ((j6 & j4) != 0) {
                        if (i6Var != null) {
                            strT0 = i6Var.t0();
                            clickItemPath = i6Var.getClickItemPath();
                        } else {
                            clickItemPath = null;
                            strT0 = null;
                        }
                        p1(12, clickItemPath);
                        if (clickItemPath != null) {
                            str12 = (String) clickItemPath.get();
                        } else {
                            str12 = null;
                        }
                        zEquals = TextUtils.equals(strT0, str12);
                    } else {
                        zEquals = false;
                    }
                    if ((j6 & 90640) != 0) {
                        if (i6Var != null) {
                            observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                        } else {
                            observableBoolean = null;
                        }
                        p1(9, observableBoolean);
                        if (observableBoolean != null) {
                            z2 = observableBoolean.get();
                        } else {
                            z2 = false;
                        }
                        if ((j6 & 90624) != 0) {
                            if (z2) {
                                j6 |= 262144;
                            } else {
                                j6 |= j3;
                            }
                        }
                        if ((j6 & 82448) != 0) {
                            if (z2) {
                                j6 |= 4294967296L;
                            } else {
                                j6 |= 2147483648L;
                            }
                        }
                        if ((j6 & 82432) != 0) {
                            if (z2) {
                                j15 = 74766790688768L;
                            } else {
                                j15 = 37383395344384L;
                            }
                            j6 |= j15;
                        }
                        if ((j6 & 82432) != 0) {
                            if (z2) {
                                i15 = 0;
                            } else {
                                i15 = 8;
                            }
                            if (z2) {
                            }
                            j10 = j6 & 82944;
                            if (j10 != 0) {
                                if (i6Var != null) {
                                    uVarH0 = i6Var.h0();
                                } else {
                                    uVarH0 = null;
                                }
                                z4 = zEquals;
                                p1(10, uVarH0);
                                if (uVarH0 != null) {
                                    str11 = (String) uVarH0.get();
                                } else {
                                    str11 = null;
                                }
                                zIsEmpty = TextUtils.isEmpty(str11);
                                if (j10 != 0) {
                                    if (zIsEmpty) {
                                        j14 = 4194304;
                                    } else {
                                        j14 = 2097152;
                                    }
                                    j6 |= j14;
                                }
                                if (zIsEmpty) {
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i2111115 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i2111115;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            } else {
                                i6Var = i6Var;
                                z4 = zEquals;
                                str11 = null;
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i2111116 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i2111116;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        }
                        j10 = j6 & 82944;
                        if (j10 != 0) {
                            if (i6Var != null) {
                                uVarH0 = i6Var.h0();
                            } else {
                                uVarH0 = null;
                            }
                            z4 = zEquals;
                            p1(10, uVarH0);
                            if (uVarH0 != null) {
                                str11 = (String) uVarH0.get();
                            } else {
                                str11 = null;
                            }
                            zIsEmpty = TextUtils.isEmpty(str11);
                            if (j10 != 0) {
                                if (zIsEmpty) {
                                    j14 = 4194304;
                                } else {
                                    j14 = 2097152;
                                }
                                j6 |= j14;
                            }
                            if (zIsEmpty) {
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i2111117 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i2111117;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            i6Var = i6Var;
                            z4 = zEquals;
                            str11 = null;
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i2111118 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i2111118;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        z2 = false;
                    }
                    i15 = 0;
                    j10 = j6 & 82944;
                    if (j10 != 0) {
                        if (i6Var != null) {
                            uVarH0 = i6Var.h0();
                        } else {
                            uVarH0 = null;
                        }
                        z4 = zEquals;
                        p1(10, uVarH0);
                        if (uVarH0 != null) {
                            str11 = (String) uVarH0.get();
                        } else {
                            str11 = null;
                        }
                        zIsEmpty = TextUtils.isEmpty(str11);
                        if (j10 != 0) {
                            if (zIsEmpty) {
                                j14 = 4194304;
                            } else {
                                j14 = 2097152;
                            }
                            j6 |= j14;
                        }
                        if (zIsEmpty) {
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i2111119 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i2111119;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        i6Var = i6Var;
                        z4 = zEquals;
                        str11 = null;
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i21111110 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i21111110;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    str10 = null;
                }
                j9 = j & j5;
                if (j9 != 0) {
                    if (i6Var != null) {
                        long j27 = j;
                        uVarQ0 = i6Var.q0();
                        j6 = j27;
                    } else {
                        j6 = j;
                        uVarQ0 = null;
                    }
                    p1(8, uVarQ0);
                    if (uVarQ0 != null) {
                        bool = (Boolean) uVarQ0.get();
                    } else {
                        bool = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool);
                    if (j9 != 0) {
                        if (zK2) {
                            j16 = 68719476736L;
                        } else {
                            j16 = 34359738368L;
                        }
                        j6 |= j16;
                    }
                    if (zK2) {
                        i14 = 8;
                    }
                    if ((j6 & j4) != 0) {
                        if (i6Var != null) {
                            strT0 = i6Var.t0();
                            clickItemPath = i6Var.getClickItemPath();
                        } else {
                            clickItemPath = null;
                            strT0 = null;
                        }
                        p1(12, clickItemPath);
                        if (clickItemPath != null) {
                            str12 = (String) clickItemPath.get();
                        } else {
                            str12 = null;
                        }
                        zEquals = TextUtils.equals(strT0, str12);
                    } else {
                        zEquals = false;
                    }
                    if ((j6 & 90640) != 0) {
                        if (i6Var != null) {
                            observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                        } else {
                            observableBoolean = null;
                        }
                        p1(9, observableBoolean);
                        if (observableBoolean != null) {
                            z2 = observableBoolean.get();
                        } else {
                            z2 = false;
                        }
                        if ((j6 & 90624) != 0) {
                            if (z2) {
                                j6 |= 262144;
                            } else {
                                j6 |= j3;
                            }
                        }
                        if ((j6 & 82448) != 0) {
                            if (z2) {
                                j6 |= 4294967296L;
                            } else {
                                j6 |= 2147483648L;
                            }
                        }
                        if ((j6 & 82432) != 0) {
                            if (z2) {
                                j15 = 74766790688768L;
                            } else {
                                j15 = 37383395344384L;
                            }
                            j6 |= j15;
                        }
                        if ((j6 & 82432) != 0) {
                            if (z2) {
                                i15 = 0;
                            } else {
                                i15 = 8;
                            }
                            if (z2) {
                            }
                            j10 = j6 & 82944;
                            if (j10 != 0) {
                                if (i6Var != null) {
                                    uVarH0 = i6Var.h0();
                                } else {
                                    uVarH0 = null;
                                }
                                z4 = zEquals;
                                p1(10, uVarH0);
                                if (uVarH0 != null) {
                                    str11 = (String) uVarH0.get();
                                } else {
                                    str11 = null;
                                }
                                zIsEmpty = TextUtils.isEmpty(str11);
                                if (j10 != 0) {
                                    if (zIsEmpty) {
                                        j14 = 4194304;
                                    } else {
                                        j14 = 2097152;
                                    }
                                    j6 |= j14;
                                }
                                if (zIsEmpty) {
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i21111111 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i21111111;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            } else {
                                i6Var = i6Var;
                                z4 = zEquals;
                                str11 = null;
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i21111112 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i21111112;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        }
                        j10 = j6 & 82944;
                        if (j10 != 0) {
                            if (i6Var != null) {
                                uVarH0 = i6Var.h0();
                            } else {
                                uVarH0 = null;
                            }
                            z4 = zEquals;
                            p1(10, uVarH0);
                            if (uVarH0 != null) {
                                str11 = (String) uVarH0.get();
                            } else {
                                str11 = null;
                            }
                            zIsEmpty = TextUtils.isEmpty(str11);
                            if (j10 != 0) {
                                if (zIsEmpty) {
                                    j14 = 4194304;
                                } else {
                                    j14 = 2097152;
                                }
                                j6 |= j14;
                            }
                            if (zIsEmpty) {
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i21111113 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i21111113;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            i6Var = i6Var;
                            z4 = zEquals;
                            str11 = null;
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i21111114 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i21111114;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        z2 = false;
                    }
                    i15 = 0;
                    j10 = j6 & 82944;
                    if (j10 != 0) {
                        if (i6Var != null) {
                            uVarH0 = i6Var.h0();
                        } else {
                            uVarH0 = null;
                        }
                        z4 = zEquals;
                        p1(10, uVarH0);
                        if (uVarH0 != null) {
                            str11 = (String) uVarH0.get();
                        } else {
                            str11 = null;
                        }
                        zIsEmpty = TextUtils.isEmpty(str11);
                        if (j10 != 0) {
                            if (zIsEmpty) {
                                j14 = 4194304;
                            } else {
                                j14 = 2097152;
                            }
                            j6 |= j14;
                        }
                        if (zIsEmpty) {
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i21111115 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i21111115;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        i6Var = i6Var;
                        z4 = zEquals;
                        str11 = null;
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i21111116 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i21111116;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    j6 = j;
                }
                i14 = 0;
                if ((j6 & j4) != 0) {
                    if (i6Var != null) {
                        strT0 = i6Var.t0();
                        clickItemPath = i6Var.getClickItemPath();
                    } else {
                        clickItemPath = null;
                        strT0 = null;
                    }
                    p1(12, clickItemPath);
                    if (clickItemPath != null) {
                        str12 = (String) clickItemPath.get();
                    } else {
                        str12 = null;
                    }
                    zEquals = TextUtils.equals(strT0, str12);
                } else {
                    zEquals = false;
                }
                if ((j6 & 90640) != 0) {
                    if (i6Var != null) {
                        observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                    } else {
                        observableBoolean = null;
                    }
                    p1(9, observableBoolean);
                    if (observableBoolean != null) {
                        z2 = observableBoolean.get();
                    } else {
                        z2 = false;
                    }
                    if ((j6 & 90624) != 0) {
                        if (z2) {
                            j6 |= 262144;
                        } else {
                            j6 |= j3;
                        }
                    }
                    if ((j6 & 82448) != 0) {
                        if (z2) {
                            j6 |= 4294967296L;
                        } else {
                            j6 |= 2147483648L;
                        }
                    }
                    if ((j6 & 82432) != 0) {
                        if (z2) {
                            j15 = 74766790688768L;
                        } else {
                            j15 = 37383395344384L;
                        }
                        j6 |= j15;
                    }
                    if ((j6 & 82432) != 0) {
                        if (z2) {
                            i15 = 0;
                        } else {
                            i15 = 8;
                        }
                        if (z2) {
                        }
                        j10 = j6 & 82944;
                        if (j10 != 0) {
                            if (i6Var != null) {
                                uVarH0 = i6Var.h0();
                            } else {
                                uVarH0 = null;
                            }
                            z4 = zEquals;
                            p1(10, uVarH0);
                            if (uVarH0 != null) {
                                str11 = (String) uVarH0.get();
                            } else {
                                str11 = null;
                            }
                            zIsEmpty = TextUtils.isEmpty(str11);
                            if (j10 != 0) {
                                if (zIsEmpty) {
                                    j14 = 4194304;
                                } else {
                                    j14 = 2097152;
                                }
                                j6 |= j14;
                            }
                            if (zIsEmpty) {
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i21111117 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i21111117;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            i6Var = i6Var;
                            z4 = zEquals;
                            str11 = null;
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i21111118 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i21111118;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    }
                    j10 = j6 & 82944;
                    if (j10 != 0) {
                        if (i6Var != null) {
                            uVarH0 = i6Var.h0();
                        } else {
                            uVarH0 = null;
                        }
                        z4 = zEquals;
                        p1(10, uVarH0);
                        if (uVarH0 != null) {
                            str11 = (String) uVarH0.get();
                        } else {
                            str11 = null;
                        }
                        zIsEmpty = TextUtils.isEmpty(str11);
                        if (j10 != 0) {
                            if (zIsEmpty) {
                                j14 = 4194304;
                            } else {
                                j14 = 2097152;
                            }
                            j6 |= j14;
                        }
                        if (zIsEmpty) {
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i21111119 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i21111119;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        i6Var = i6Var;
                        z4 = zEquals;
                        str11 = null;
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i211111110 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i211111110;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    z2 = false;
                }
                i15 = 0;
                j10 = j6 & 82944;
                if (j10 != 0) {
                    if (i6Var != null) {
                        uVarH0 = i6Var.h0();
                    } else {
                        uVarH0 = null;
                    }
                    z4 = zEquals;
                    p1(10, uVarH0);
                    if (uVarH0 != null) {
                        str11 = (String) uVarH0.get();
                    } else {
                        str11 = null;
                    }
                    zIsEmpty = TextUtils.isEmpty(str11);
                    if (j10 != 0) {
                        if (zIsEmpty) {
                            j14 = 4194304;
                        } else {
                            j14 = 2097152;
                        }
                        j6 |= j14;
                    }
                    if (zIsEmpty) {
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i211111111 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i211111111;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    i6Var = i6Var;
                    z4 = zEquals;
                    str11 = null;
                }
                j11 = j6 & 83968;
                if (j11 != 0) {
                    if (i6Var != null) {
                        uVarO0 = i6Var.o0();
                    } else {
                        uVarO0 = null;
                    }
                    int i211111112 = i16;
                    p1(11, uVarO0);
                    if (uVarO0 != null) {
                        i17 = uVarO0.get();
                    } else {
                        i17 = 0;
                    }
                    if (i17 == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i17 == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (j11 != 0) {
                        if (z5) {
                            j13 = 268435456;
                        } else {
                            j13 = 134217728;
                        }
                        j6 |= j13;
                    }
                    if ((j6 & 83968) != 0) {
                        if (z6) {
                            j12 = 67108864;
                        } else {
                            j12 = 33554432;
                        }
                        j6 |= j12;
                    }
                    if (z5) {
                        i18 = 0;
                    } else {
                        i18 = 8;
                    }
                    if (z6) {
                        i19 = 0;
                    } else {
                        i19 = 8;
                    }
                    onClickListener = onClickListenerK0;
                    i3 = i211111112;
                    i = 8;
                    i11 = i18;
                    i2 = i19;
                    str = str11;
                } else {
                    onClickListener = onClickListenerK0;
                    str = str11;
                    i3 = i16;
                    i2 = 0;
                    i = 8;
                    i11 = 0;
                }
                str3 = str9;
                onClickListener2 = onClickListenerJ0;
                str4 = str10;
                i4 = i14;
                z3 = zZ0;
                str5 = str8;
                i6 = i15;
                i8 = i20;
                onLongClickListener = longListener;
                drawable = drawableB;
                z = z4;
            } else {
                j5 = 82176;
                str2 = null;
            }
            j8 = j & 82048;
            if (j8 != 0) {
                if (i6Var != null) {
                    progress = i6Var.getProgress();
                } else {
                    progress = null;
                }
                p1(7, progress);
                if (progress != null) {
                    str10 = (String) progress.get();
                } else {
                    str10 = null;
                }
                zIsEmpty2 = TextUtils.isEmpty(str10);
                if (j8 != 0) {
                    if (zIsEmpty2) {
                        j17 = 274877906944L;
                    } else {
                        j17 = 137438953472L;
                    }
                    j |= j17;
                }
                if (zIsEmpty2) {
                }
                j9 = j & j5;
                if (j9 != 0) {
                    if (i6Var != null) {
                        long j28 = j;
                        uVarQ0 = i6Var.q0();
                        j6 = j28;
                    } else {
                        j6 = j;
                        uVarQ0 = null;
                    }
                    p1(8, uVarQ0);
                    if (uVarQ0 != null) {
                        bool = (Boolean) uVarQ0.get();
                    } else {
                        bool = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool);
                    if (j9 != 0) {
                        if (zK2) {
                            j16 = 68719476736L;
                        } else {
                            j16 = 34359738368L;
                        }
                        j6 |= j16;
                    }
                    if (zK2) {
                        i14 = 8;
                    }
                    if ((j6 & j4) != 0) {
                        if (i6Var != null) {
                            strT0 = i6Var.t0();
                            clickItemPath = i6Var.getClickItemPath();
                        } else {
                            clickItemPath = null;
                            strT0 = null;
                        }
                        p1(12, clickItemPath);
                        if (clickItemPath != null) {
                            str12 = (String) clickItemPath.get();
                        } else {
                            str12 = null;
                        }
                        zEquals = TextUtils.equals(strT0, str12);
                    } else {
                        zEquals = false;
                    }
                    if ((j6 & 90640) != 0) {
                        if (i6Var != null) {
                            observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                        } else {
                            observableBoolean = null;
                        }
                        p1(9, observableBoolean);
                        if (observableBoolean != null) {
                            z2 = observableBoolean.get();
                        } else {
                            z2 = false;
                        }
                        if ((j6 & 90624) != 0) {
                            if (z2) {
                                j6 |= 262144;
                            } else {
                                j6 |= j3;
                            }
                        }
                        if ((j6 & 82448) != 0) {
                            if (z2) {
                                j6 |= 4294967296L;
                            } else {
                                j6 |= 2147483648L;
                            }
                        }
                        if ((j6 & 82432) != 0) {
                            if (z2) {
                                j15 = 74766790688768L;
                            } else {
                                j15 = 37383395344384L;
                            }
                            j6 |= j15;
                        }
                        if ((j6 & 82432) != 0) {
                            if (z2) {
                                i15 = 0;
                            } else {
                                i15 = 8;
                            }
                            if (z2) {
                            }
                            j10 = j6 & 82944;
                            if (j10 != 0) {
                                if (i6Var != null) {
                                    uVarH0 = i6Var.h0();
                                } else {
                                    uVarH0 = null;
                                }
                                z4 = zEquals;
                                p1(10, uVarH0);
                                if (uVarH0 != null) {
                                    str11 = (String) uVarH0.get();
                                } else {
                                    str11 = null;
                                }
                                zIsEmpty = TextUtils.isEmpty(str11);
                                if (j10 != 0) {
                                    if (zIsEmpty) {
                                        j14 = 4194304;
                                    } else {
                                        j14 = 2097152;
                                    }
                                    j6 |= j14;
                                }
                                if (zIsEmpty) {
                                }
                                j11 = j6 & 83968;
                                if (j11 != 0) {
                                    if (i6Var != null) {
                                        uVarO0 = i6Var.o0();
                                    } else {
                                        uVarO0 = null;
                                    }
                                    int i211111113 = i16;
                                    p1(11, uVarO0);
                                    if (uVarO0 != null) {
                                        i17 = uVarO0.get();
                                    } else {
                                        i17 = 0;
                                    }
                                    if (i17 == 2) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i17 == 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (j11 != 0) {
                                        if (z5) {
                                            j13 = 268435456;
                                        } else {
                                            j13 = 134217728;
                                        }
                                        j6 |= j13;
                                    }
                                    if ((j6 & 83968) != 0) {
                                        if (z6) {
                                            j12 = 67108864;
                                        } else {
                                            j12 = 33554432;
                                        }
                                        j6 |= j12;
                                    }
                                    if (z5) {
                                        i18 = 0;
                                    } else {
                                        i18 = 8;
                                    }
                                    if (z6) {
                                        i19 = 0;
                                    } else {
                                        i19 = 8;
                                    }
                                    onClickListener = onClickListenerK0;
                                    i3 = i211111113;
                                    i = 8;
                                    i11 = i18;
                                    i2 = i19;
                                    str = str11;
                                } else {
                                    onClickListener = onClickListenerK0;
                                    str = str11;
                                    i3 = i16;
                                    i2 = 0;
                                    i = 8;
                                    i11 = 0;
                                }
                                str3 = str9;
                                onClickListener2 = onClickListenerJ0;
                                str4 = str10;
                                i4 = i14;
                                z3 = zZ0;
                                str5 = str8;
                                i6 = i15;
                                i8 = i20;
                                onLongClickListener = longListener;
                                drawable = drawableB;
                                z = z4;
                            } else {
                                i6Var = i6Var;
                                z4 = zEquals;
                                str11 = null;
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i211111114 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i211111114;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        }
                        j10 = j6 & 82944;
                        if (j10 != 0) {
                            if (i6Var != null) {
                                uVarH0 = i6Var.h0();
                            } else {
                                uVarH0 = null;
                            }
                            z4 = zEquals;
                            p1(10, uVarH0);
                            if (uVarH0 != null) {
                                str11 = (String) uVarH0.get();
                            } else {
                                str11 = null;
                            }
                            zIsEmpty = TextUtils.isEmpty(str11);
                            if (j10 != 0) {
                                if (zIsEmpty) {
                                    j14 = 4194304;
                                } else {
                                    j14 = 2097152;
                                }
                                j6 |= j14;
                            }
                            if (zIsEmpty) {
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i211111115 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i211111115;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            i6Var = i6Var;
                            z4 = zEquals;
                            str11 = null;
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i211111116 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i211111116;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        z2 = false;
                    }
                    i15 = 0;
                    j10 = j6 & 82944;
                    if (j10 != 0) {
                        if (i6Var != null) {
                            uVarH0 = i6Var.h0();
                        } else {
                            uVarH0 = null;
                        }
                        z4 = zEquals;
                        p1(10, uVarH0);
                        if (uVarH0 != null) {
                            str11 = (String) uVarH0.get();
                        } else {
                            str11 = null;
                        }
                        zIsEmpty = TextUtils.isEmpty(str11);
                        if (j10 != 0) {
                            if (zIsEmpty) {
                                j14 = 4194304;
                            } else {
                                j14 = 2097152;
                            }
                            j6 |= j14;
                        }
                        if (zIsEmpty) {
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i211111117 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i211111117;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        i6Var = i6Var;
                        z4 = zEquals;
                        str11 = null;
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i211111118 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i211111118;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    j6 = j;
                }
                i14 = 0;
                if ((j6 & j4) != 0) {
                    if (i6Var != null) {
                        strT0 = i6Var.t0();
                        clickItemPath = i6Var.getClickItemPath();
                    } else {
                        clickItemPath = null;
                        strT0 = null;
                    }
                    p1(12, clickItemPath);
                    if (clickItemPath != null) {
                        str12 = (String) clickItemPath.get();
                    } else {
                        str12 = null;
                    }
                    zEquals = TextUtils.equals(strT0, str12);
                } else {
                    zEquals = false;
                }
                if ((j6 & 90640) != 0) {
                    if (i6Var != null) {
                        observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                    } else {
                        observableBoolean = null;
                    }
                    p1(9, observableBoolean);
                    if (observableBoolean != null) {
                        z2 = observableBoolean.get();
                    } else {
                        z2 = false;
                    }
                    if ((j6 & 90624) != 0) {
                        if (z2) {
                            j6 |= 262144;
                        } else {
                            j6 |= j3;
                        }
                    }
                    if ((j6 & 82448) != 0) {
                        if (z2) {
                            j6 |= 4294967296L;
                        } else {
                            j6 |= 2147483648L;
                        }
                    }
                    if ((j6 & 82432) != 0) {
                        if (z2) {
                            j15 = 74766790688768L;
                        } else {
                            j15 = 37383395344384L;
                        }
                        j6 |= j15;
                    }
                    if ((j6 & 82432) != 0) {
                        if (z2) {
                            i15 = 0;
                        } else {
                            i15 = 8;
                        }
                        if (z2) {
                        }
                        j10 = j6 & 82944;
                        if (j10 != 0) {
                            if (i6Var != null) {
                                uVarH0 = i6Var.h0();
                            } else {
                                uVarH0 = null;
                            }
                            z4 = zEquals;
                            p1(10, uVarH0);
                            if (uVarH0 != null) {
                                str11 = (String) uVarH0.get();
                            } else {
                                str11 = null;
                            }
                            zIsEmpty = TextUtils.isEmpty(str11);
                            if (j10 != 0) {
                                if (zIsEmpty) {
                                    j14 = 4194304;
                                } else {
                                    j14 = 2097152;
                                }
                                j6 |= j14;
                            }
                            if (zIsEmpty) {
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i211111119 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i211111119;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            i6Var = i6Var;
                            z4 = zEquals;
                            str11 = null;
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i2111111110 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i2111111110;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    }
                    j10 = j6 & 82944;
                    if (j10 != 0) {
                        if (i6Var != null) {
                            uVarH0 = i6Var.h0();
                        } else {
                            uVarH0 = null;
                        }
                        z4 = zEquals;
                        p1(10, uVarH0);
                        if (uVarH0 != null) {
                            str11 = (String) uVarH0.get();
                        } else {
                            str11 = null;
                        }
                        zIsEmpty = TextUtils.isEmpty(str11);
                        if (j10 != 0) {
                            if (zIsEmpty) {
                                j14 = 4194304;
                            } else {
                                j14 = 2097152;
                            }
                            j6 |= j14;
                        }
                        if (zIsEmpty) {
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i2111111111 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i2111111111;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        i6Var = i6Var;
                        z4 = zEquals;
                        str11 = null;
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i2111111112 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i2111111112;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    z2 = false;
                }
                i15 = 0;
                j10 = j6 & 82944;
                if (j10 != 0) {
                    if (i6Var != null) {
                        uVarH0 = i6Var.h0();
                    } else {
                        uVarH0 = null;
                    }
                    z4 = zEquals;
                    p1(10, uVarH0);
                    if (uVarH0 != null) {
                        str11 = (String) uVarH0.get();
                    } else {
                        str11 = null;
                    }
                    zIsEmpty = TextUtils.isEmpty(str11);
                    if (j10 != 0) {
                        if (zIsEmpty) {
                            j14 = 4194304;
                        } else {
                            j14 = 2097152;
                        }
                        j6 |= j14;
                    }
                    if (zIsEmpty) {
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i2111111113 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i2111111113;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    i6Var = i6Var;
                    z4 = zEquals;
                    str11 = null;
                }
                j11 = j6 & 83968;
                if (j11 != 0) {
                    if (i6Var != null) {
                        uVarO0 = i6Var.o0();
                    } else {
                        uVarO0 = null;
                    }
                    int i2111111114 = i16;
                    p1(11, uVarO0);
                    if (uVarO0 != null) {
                        i17 = uVarO0.get();
                    } else {
                        i17 = 0;
                    }
                    if (i17 == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i17 == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (j11 != 0) {
                        if (z5) {
                            j13 = 268435456;
                        } else {
                            j13 = 134217728;
                        }
                        j6 |= j13;
                    }
                    if ((j6 & 83968) != 0) {
                        if (z6) {
                            j12 = 67108864;
                        } else {
                            j12 = 33554432;
                        }
                        j6 |= j12;
                    }
                    if (z5) {
                        i18 = 0;
                    } else {
                        i18 = 8;
                    }
                    if (z6) {
                        i19 = 0;
                    } else {
                        i19 = 8;
                    }
                    onClickListener = onClickListenerK0;
                    i3 = i2111111114;
                    i = 8;
                    i11 = i18;
                    i2 = i19;
                    str = str11;
                } else {
                    onClickListener = onClickListenerK0;
                    str = str11;
                    i3 = i16;
                    i2 = 0;
                    i = 8;
                    i11 = 0;
                }
                str3 = str9;
                onClickListener2 = onClickListenerJ0;
                str4 = str10;
                i4 = i14;
                z3 = zZ0;
                str5 = str8;
                i6 = i15;
                i8 = i20;
                onLongClickListener = longListener;
                drawable = drawableB;
                z = z4;
            } else {
                str10 = null;
            }
            j9 = j & j5;
            if (j9 != 0) {
                if (i6Var != null) {
                    long j29 = j;
                    uVarQ0 = i6Var.q0();
                    j6 = j29;
                } else {
                    j6 = j;
                    uVarQ0 = null;
                }
                p1(8, uVarQ0);
                if (uVarQ0 != null) {
                    bool = (Boolean) uVarQ0.get();
                } else {
                    bool = null;
                }
                zK2 = androidx.databinding.c0.K0(bool);
                if (j9 != 0) {
                    if (zK2) {
                        j16 = 68719476736L;
                    } else {
                        j16 = 34359738368L;
                    }
                    j6 |= j16;
                }
                if (zK2) {
                    i14 = 8;
                }
                if ((j6 & j4) != 0) {
                    if (i6Var != null) {
                        strT0 = i6Var.t0();
                        clickItemPath = i6Var.getClickItemPath();
                    } else {
                        clickItemPath = null;
                        strT0 = null;
                    }
                    p1(12, clickItemPath);
                    if (clickItemPath != null) {
                        str12 = (String) clickItemPath.get();
                    } else {
                        str12 = null;
                    }
                    zEquals = TextUtils.equals(strT0, str12);
                } else {
                    zEquals = false;
                }
                if ((j6 & 90640) != 0) {
                    if (i6Var != null) {
                        observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                    } else {
                        observableBoolean = null;
                    }
                    p1(9, observableBoolean);
                    if (observableBoolean != null) {
                        z2 = observableBoolean.get();
                    } else {
                        z2 = false;
                    }
                    if ((j6 & 90624) != 0) {
                        if (z2) {
                            j6 |= 262144;
                        } else {
                            j6 |= j3;
                        }
                    }
                    if ((j6 & 82448) != 0) {
                        if (z2) {
                            j6 |= 4294967296L;
                        } else {
                            j6 |= 2147483648L;
                        }
                    }
                    if ((j6 & 82432) != 0) {
                        if (z2) {
                            j15 = 74766790688768L;
                        } else {
                            j15 = 37383395344384L;
                        }
                        j6 |= j15;
                    }
                    if ((j6 & 82432) != 0) {
                        if (z2) {
                            i15 = 0;
                        } else {
                            i15 = 8;
                        }
                        if (z2) {
                        }
                        j10 = j6 & 82944;
                        if (j10 != 0) {
                            if (i6Var != null) {
                                uVarH0 = i6Var.h0();
                            } else {
                                uVarH0 = null;
                            }
                            z4 = zEquals;
                            p1(10, uVarH0);
                            if (uVarH0 != null) {
                                str11 = (String) uVarH0.get();
                            } else {
                                str11 = null;
                            }
                            zIsEmpty = TextUtils.isEmpty(str11);
                            if (j10 != 0) {
                                if (zIsEmpty) {
                                    j14 = 4194304;
                                } else {
                                    j14 = 2097152;
                                }
                                j6 |= j14;
                            }
                            if (zIsEmpty) {
                            }
                            j11 = j6 & 83968;
                            if (j11 != 0) {
                                if (i6Var != null) {
                                    uVarO0 = i6Var.o0();
                                } else {
                                    uVarO0 = null;
                                }
                                int i2111111115 = i16;
                                p1(11, uVarO0);
                                if (uVarO0 != null) {
                                    i17 = uVarO0.get();
                                } else {
                                    i17 = 0;
                                }
                                if (i17 == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i17 == 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (j11 != 0) {
                                    if (z5) {
                                        j13 = 268435456;
                                    } else {
                                        j13 = 134217728;
                                    }
                                    j6 |= j13;
                                }
                                if ((j6 & 83968) != 0) {
                                    if (z6) {
                                        j12 = 67108864;
                                    } else {
                                        j12 = 33554432;
                                    }
                                    j6 |= j12;
                                }
                                if (z5) {
                                    i18 = 0;
                                } else {
                                    i18 = 8;
                                }
                                if (z6) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                onClickListener = onClickListenerK0;
                                i3 = i2111111115;
                                i = 8;
                                i11 = i18;
                                i2 = i19;
                                str = str11;
                            } else {
                                onClickListener = onClickListenerK0;
                                str = str11;
                                i3 = i16;
                                i2 = 0;
                                i = 8;
                                i11 = 0;
                            }
                            str3 = str9;
                            onClickListener2 = onClickListenerJ0;
                            str4 = str10;
                            i4 = i14;
                            z3 = zZ0;
                            str5 = str8;
                            i6 = i15;
                            i8 = i20;
                            onLongClickListener = longListener;
                            drawable = drawableB;
                            z = z4;
                        } else {
                            i6Var = i6Var;
                            z4 = zEquals;
                            str11 = null;
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i2111111116 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i2111111116;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    }
                    j10 = j6 & 82944;
                    if (j10 != 0) {
                        if (i6Var != null) {
                            uVarH0 = i6Var.h0();
                        } else {
                            uVarH0 = null;
                        }
                        z4 = zEquals;
                        p1(10, uVarH0);
                        if (uVarH0 != null) {
                            str11 = (String) uVarH0.get();
                        } else {
                            str11 = null;
                        }
                        zIsEmpty = TextUtils.isEmpty(str11);
                        if (j10 != 0) {
                            if (zIsEmpty) {
                                j14 = 4194304;
                            } else {
                                j14 = 2097152;
                            }
                            j6 |= j14;
                        }
                        if (zIsEmpty) {
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i2111111117 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i2111111117;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        i6Var = i6Var;
                        z4 = zEquals;
                        str11 = null;
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i2111111118 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i2111111118;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    z2 = false;
                }
                i15 = 0;
                j10 = j6 & 82944;
                if (j10 != 0) {
                    if (i6Var != null) {
                        uVarH0 = i6Var.h0();
                    } else {
                        uVarH0 = null;
                    }
                    z4 = zEquals;
                    p1(10, uVarH0);
                    if (uVarH0 != null) {
                        str11 = (String) uVarH0.get();
                    } else {
                        str11 = null;
                    }
                    zIsEmpty = TextUtils.isEmpty(str11);
                    if (j10 != 0) {
                        if (zIsEmpty) {
                            j14 = 4194304;
                        } else {
                            j14 = 2097152;
                        }
                        j6 |= j14;
                    }
                    if (zIsEmpty) {
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i2111111119 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i2111111119;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    i6Var = i6Var;
                    z4 = zEquals;
                    str11 = null;
                }
                j11 = j6 & 83968;
                if (j11 != 0) {
                    if (i6Var != null) {
                        uVarO0 = i6Var.o0();
                    } else {
                        uVarO0 = null;
                    }
                    int i21111111110 = i16;
                    p1(11, uVarO0);
                    if (uVarO0 != null) {
                        i17 = uVarO0.get();
                    } else {
                        i17 = 0;
                    }
                    if (i17 == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i17 == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (j11 != 0) {
                        if (z5) {
                            j13 = 268435456;
                        } else {
                            j13 = 134217728;
                        }
                        j6 |= j13;
                    }
                    if ((j6 & 83968) != 0) {
                        if (z6) {
                            j12 = 67108864;
                        } else {
                            j12 = 33554432;
                        }
                        j6 |= j12;
                    }
                    if (z5) {
                        i18 = 0;
                    } else {
                        i18 = 8;
                    }
                    if (z6) {
                        i19 = 0;
                    } else {
                        i19 = 8;
                    }
                    onClickListener = onClickListenerK0;
                    i3 = i21111111110;
                    i = 8;
                    i11 = i18;
                    i2 = i19;
                    str = str11;
                } else {
                    onClickListener = onClickListenerK0;
                    str = str11;
                    i3 = i16;
                    i2 = 0;
                    i = 8;
                    i11 = 0;
                }
                str3 = str9;
                onClickListener2 = onClickListenerJ0;
                str4 = str10;
                i4 = i14;
                z3 = zZ0;
                str5 = str8;
                i6 = i15;
                i8 = i20;
                onLongClickListener = longListener;
                drawable = drawableB;
                z = z4;
            } else {
                j6 = j;
            }
            i14 = 0;
            if ((j6 & j4) != 0) {
                if (i6Var != null) {
                    strT0 = i6Var.t0();
                    clickItemPath = i6Var.getClickItemPath();
                } else {
                    clickItemPath = null;
                    strT0 = null;
                }
                p1(12, clickItemPath);
                if (clickItemPath != null) {
                    str12 = (String) clickItemPath.get();
                } else {
                    str12 = null;
                }
                zEquals = TextUtils.equals(strT0, str12);
            } else {
                zEquals = false;
            }
            if ((j6 & 90640) != 0) {
                if (i6Var != null) {
                    observableBoolean = ((com.zentraedi.business.addfile.n) i6Var).x;
                } else {
                    observableBoolean = null;
                }
                p1(9, observableBoolean);
                if (observableBoolean != null) {
                    z2 = observableBoolean.get();
                } else {
                    z2 = false;
                }
                if ((j6 & 90624) != 0) {
                    if (z2) {
                        j6 |= 262144;
                    } else {
                        j6 |= j3;
                    }
                }
                if ((j6 & 82448) != 0) {
                    if (z2) {
                        j6 |= 4294967296L;
                    } else {
                        j6 |= 2147483648L;
                    }
                }
                if ((j6 & 82432) != 0) {
                    if (z2) {
                        j15 = 74766790688768L;
                    } else {
                        j15 = 37383395344384L;
                    }
                    j6 |= j15;
                }
                if ((j6 & 82432) != 0) {
                    if (z2) {
                        i15 = 0;
                    } else {
                        i15 = 8;
                    }
                    if (z2) {
                    }
                    j10 = j6 & 82944;
                    if (j10 != 0) {
                        if (i6Var != null) {
                            uVarH0 = i6Var.h0();
                        } else {
                            uVarH0 = null;
                        }
                        z4 = zEquals;
                        p1(10, uVarH0);
                        if (uVarH0 != null) {
                            str11 = (String) uVarH0.get();
                        } else {
                            str11 = null;
                        }
                        zIsEmpty = TextUtils.isEmpty(str11);
                        if (j10 != 0) {
                            if (zIsEmpty) {
                                j14 = 4194304;
                            } else {
                                j14 = 2097152;
                            }
                            j6 |= j14;
                        }
                        if (zIsEmpty) {
                        }
                        j11 = j6 & 83968;
                        if (j11 != 0) {
                            if (i6Var != null) {
                                uVarO0 = i6Var.o0();
                            } else {
                                uVarO0 = null;
                            }
                            int i21111111111 = i16;
                            p1(11, uVarO0);
                            if (uVarO0 != null) {
                                i17 = uVarO0.get();
                            } else {
                                i17 = 0;
                            }
                            if (i17 == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (i17 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (j11 != 0) {
                                if (z5) {
                                    j13 = 268435456;
                                } else {
                                    j13 = 134217728;
                                }
                                j6 |= j13;
                            }
                            if ((j6 & 83968) != 0) {
                                if (z6) {
                                    j12 = 67108864;
                                } else {
                                    j12 = 33554432;
                                }
                                j6 |= j12;
                            }
                            if (z5) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            if (z6) {
                                i19 = 0;
                            } else {
                                i19 = 8;
                            }
                            onClickListener = onClickListenerK0;
                            i3 = i21111111111;
                            i = 8;
                            i11 = i18;
                            i2 = i19;
                            str = str11;
                        } else {
                            onClickListener = onClickListenerK0;
                            str = str11;
                            i3 = i16;
                            i2 = 0;
                            i = 8;
                            i11 = 0;
                        }
                        str3 = str9;
                        onClickListener2 = onClickListenerJ0;
                        str4 = str10;
                        i4 = i14;
                        z3 = zZ0;
                        str5 = str8;
                        i6 = i15;
                        i8 = i20;
                        onLongClickListener = longListener;
                        drawable = drawableB;
                        z = z4;
                    } else {
                        i6Var = i6Var;
                        z4 = zEquals;
                        str11 = null;
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i21111111112 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i21111111112;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                }
                j10 = j6 & 82944;
                if (j10 != 0) {
                    if (i6Var != null) {
                        uVarH0 = i6Var.h0();
                    } else {
                        uVarH0 = null;
                    }
                    z4 = zEquals;
                    p1(10, uVarH0);
                    if (uVarH0 != null) {
                        str11 = (String) uVarH0.get();
                    } else {
                        str11 = null;
                    }
                    zIsEmpty = TextUtils.isEmpty(str11);
                    if (j10 != 0) {
                        if (zIsEmpty) {
                            j14 = 4194304;
                        } else {
                            j14 = 2097152;
                        }
                        j6 |= j14;
                    }
                    if (zIsEmpty) {
                    }
                    j11 = j6 & 83968;
                    if (j11 != 0) {
                        if (i6Var != null) {
                            uVarO0 = i6Var.o0();
                        } else {
                            uVarO0 = null;
                        }
                        int i21111111113 = i16;
                        p1(11, uVarO0);
                        if (uVarO0 != null) {
                            i17 = uVarO0.get();
                        } else {
                            i17 = 0;
                        }
                        if (i17 == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i17 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (j11 != 0) {
                            if (z5) {
                                j13 = 268435456;
                            } else {
                                j13 = 134217728;
                            }
                            j6 |= j13;
                        }
                        if ((j6 & 83968) != 0) {
                            if (z6) {
                                j12 = 67108864;
                            } else {
                                j12 = 33554432;
                            }
                            j6 |= j12;
                        }
                        if (z5) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        if (z6) {
                            i19 = 0;
                        } else {
                            i19 = 8;
                        }
                        onClickListener = onClickListenerK0;
                        i3 = i21111111113;
                        i = 8;
                        i11 = i18;
                        i2 = i19;
                        str = str11;
                    } else {
                        onClickListener = onClickListenerK0;
                        str = str11;
                        i3 = i16;
                        i2 = 0;
                        i = 8;
                        i11 = 0;
                    }
                    str3 = str9;
                    onClickListener2 = onClickListenerJ0;
                    str4 = str10;
                    i4 = i14;
                    z3 = zZ0;
                    str5 = str8;
                    i6 = i15;
                    i8 = i20;
                    onLongClickListener = longListener;
                    drawable = drawableB;
                    z = z4;
                } else {
                    i6Var = i6Var;
                    z4 = zEquals;
                    str11 = null;
                }
                j11 = j6 & 83968;
                if (j11 != 0) {
                    if (i6Var != null) {
                        uVarO0 = i6Var.o0();
                    } else {
                        uVarO0 = null;
                    }
                    int i21111111114 = i16;
                    p1(11, uVarO0);
                    if (uVarO0 != null) {
                        i17 = uVarO0.get();
                    } else {
                        i17 = 0;
                    }
                    if (i17 == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i17 == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (j11 != 0) {
                        if (z5) {
                            j13 = 268435456;
                        } else {
                            j13 = 134217728;
                        }
                        j6 |= j13;
                    }
                    if ((j6 & 83968) != 0) {
                        if (z6) {
                            j12 = 67108864;
                        } else {
                            j12 = 33554432;
                        }
                        j6 |= j12;
                    }
                    if (z5) {
                        i18 = 0;
                    } else {
                        i18 = 8;
                    }
                    if (z6) {
                        i19 = 0;
                    } else {
                        i19 = 8;
                    }
                    onClickListener = onClickListenerK0;
                    i3 = i21111111114;
                    i = 8;
                    i11 = i18;
                    i2 = i19;
                    str = str11;
                } else {
                    onClickListener = onClickListenerK0;
                    str = str11;
                    i3 = i16;
                    i2 = 0;
                    i = 8;
                    i11 = 0;
                }
                str3 = str9;
                onClickListener2 = onClickListenerJ0;
                str4 = str10;
                i4 = i14;
                z3 = zZ0;
                str5 = str8;
                i6 = i15;
                i8 = i20;
                onLongClickListener = longListener;
                drawable = drawableB;
                z = z4;
            } else {
                z2 = false;
            }
            i15 = 0;
            j10 = j6 & 82944;
            if (j10 != 0) {
                if (i6Var != null) {
                    uVarH0 = i6Var.h0();
                } else {
                    uVarH0 = null;
                }
                z4 = zEquals;
                p1(10, uVarH0);
                if (uVarH0 != null) {
                    str11 = (String) uVarH0.get();
                } else {
                    str11 = null;
                }
                zIsEmpty = TextUtils.isEmpty(str11);
                if (j10 != 0) {
                    if (zIsEmpty) {
                        j14 = 4194304;
                    } else {
                        j14 = 2097152;
                    }
                    j6 |= j14;
                }
                if (zIsEmpty) {
                }
                j11 = j6 & 83968;
                if (j11 != 0) {
                    if (i6Var != null) {
                        uVarO0 = i6Var.o0();
                    } else {
                        uVarO0 = null;
                    }
                    int i21111111115 = i16;
                    p1(11, uVarO0);
                    if (uVarO0 != null) {
                        i17 = uVarO0.get();
                    } else {
                        i17 = 0;
                    }
                    if (i17 == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i17 == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (j11 != 0) {
                        if (z5) {
                            j13 = 268435456;
                        } else {
                            j13 = 134217728;
                        }
                        j6 |= j13;
                    }
                    if ((j6 & 83968) != 0) {
                        if (z6) {
                            j12 = 67108864;
                        } else {
                            j12 = 33554432;
                        }
                        j6 |= j12;
                    }
                    if (z5) {
                        i18 = 0;
                    } else {
                        i18 = 8;
                    }
                    if (z6) {
                        i19 = 0;
                    } else {
                        i19 = 8;
                    }
                    onClickListener = onClickListenerK0;
                    i3 = i21111111115;
                    i = 8;
                    i11 = i18;
                    i2 = i19;
                    str = str11;
                } else {
                    onClickListener = onClickListenerK0;
                    str = str11;
                    i3 = i16;
                    i2 = 0;
                    i = 8;
                    i11 = 0;
                }
                str3 = str9;
                onClickListener2 = onClickListenerJ0;
                str4 = str10;
                i4 = i14;
                z3 = zZ0;
                str5 = str8;
                i6 = i15;
                i8 = i20;
                onLongClickListener = longListener;
                drawable = drawableB;
                z = z4;
            } else {
                i6Var = i6Var;
                z4 = zEquals;
                str11 = null;
            }
            j11 = j6 & 83968;
            if (j11 != 0) {
                if (i6Var != null) {
                    uVarO0 = i6Var.o0();
                } else {
                    uVarO0 = null;
                }
                int i21111111116 = i16;
                p1(11, uVarO0);
                if (uVarO0 != null) {
                    i17 = uVarO0.get();
                } else {
                    i17 = 0;
                }
                if (i17 == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (i17 == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (j11 != 0) {
                    if (z5) {
                        j13 = 268435456;
                    } else {
                        j13 = 134217728;
                    }
                    j6 |= j13;
                }
                if ((j6 & 83968) != 0) {
                    if (z6) {
                        j12 = 67108864;
                    } else {
                        j12 = 33554432;
                    }
                    j6 |= j12;
                }
                if (z5) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                if (z6) {
                    i19 = 0;
                } else {
                    i19 = 8;
                }
                onClickListener = onClickListenerK0;
                i3 = i21111111116;
                i = 8;
                i11 = i18;
                i2 = i19;
                str = str11;
            } else {
                onClickListener = onClickListenerK0;
                str = str11;
                i3 = i16;
                i2 = 0;
                i = 8;
                i11 = 0;
            }
            str3 = str9;
            onClickListener2 = onClickListenerJ0;
            str4 = str10;
            i4 = i14;
            z3 = zZ0;
            str5 = str8;
            i6 = i15;
            i8 = i20;
            onLongClickListener = longListener;
            drawable = drawableB;
            z = z4;
        } else {
            i6Var = i6Var;
            j2 = 2147483648L;
            j3 = 131072;
            j4 = 86016;
            j5 = 82176;
            i = 8;
            j6 = j;
            str = null;
            str2 = null;
            onClickListener = null;
            onClickListener2 = null;
            onClickListenerN0 = null;
            onLongClickListener = null;
            str3 = null;
            drawable = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            i2 = 0;
            i3 = 0;
            z = false;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            z2 = false;
            i9 = 0;
            i10 = 0;
            z3 = false;
            i11 = 0;
        }
        if ((j6 & j2) != 0) {
            androidx.databinding.u uVarS0 = i6Var != null ? i6Var.s0() : null;
            p1(4, uVarS0);
            zK0 = androidx.databinding.c0.K0(uVarS0 != null ? (Boolean) uVarS0.get() : null);
        } else {
            i2 = i2;
            zK0 = false;
        }
        if ((j6 & j3) != 0) {
            ObservableField<Boolean> observableFieldR0 = i6Var != null ? i6Var.r0() : null;
            p1(13, observableFieldR0);
            zK1 = androidx.databinding.c0.K0(observableFieldR0 != null ? (Boolean) observableFieldR0.get() : null);
        } else {
            zK1 = false;
        }
        long j30 = j6 & 90624;
        if (j30 == 0) {
            i12 = 0;
        } else {
            if (z2) {
                zK1 = true;
            }
            if (j30 != 0) {
                j6 |= zK1 ? 1048576L : 524288L;
            }
            if (zK1) {
                i12 = i;
            } else {
                i12 = 0;
            }
        }
        long j31 = j6 & 82448;
        if (j31 == 0) {
            i13 = 0;
        } else {
            boolean z8 = z2 ? true : zK0;
            if (j31 != 0) {
                j6 |= z8 ? 1073741824L : 536870912L;
            }
            if (z8) {
                i13 = i;
            } else {
                i13 = 0;
            }
        }
        if ((j6 & 81920) != 0) {
            this.N.setOnClickListener(onClickListener2);
            this.N.setOnLongClickListener(onLongClickListener);
            this.R.setOnClickListener(onClickListener);
            this.S.setOnClickListener(onClickListenerN0);
        }
        if ((j6 & j4) != 0) {
            com.zentraedi.business.utils.u.v(this.N, z);
        }
        if ((j6 & 81924) != 0) {
            androidx.databinding.adapters.f0.A(this.O, str3);
            this.O.setVisibility(i7);
        }
        if ((j6 & 81984) != 0) {
            androidx.databinding.adapters.f0.A(this.P, str2);
            this.P.setVisibility(i8);
        }
        if ((j6 & 82944) != 0) {
            androidx.databinding.adapters.f0.A(this.Q, str);
            this.Q.setVisibility(i3);
        }
        if ((j6 & 82448) != 0) {
            this.R.setVisibility(i13);
        }
        if ((j6 & 90624) != 0) {
            this.S.setVisibility(i12);
        }
        if ((j6 & 82432) != 0) {
            this.T.setVisibility(i5);
            int i30 = i6;
            this.U.setVisibility(i30);
            this.I.setVisibility(i30);
        }
        if ((j6 & 81960) != 0) {
            com.zentraedi.comic.util.e.a(this.V, str6, str7, Boolean.FALSE, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(4.0f)), Boolean.valueOf(z3), false);
        }
        if ((j6 & j5) != 0) {
            this.W.setVisibility(i4);
        }
        if ((j6 & 83968) != 0) {
            this.X.setVisibility(i2);
            this.Y.setVisibility(i11);
        }
        if ((j6 & 81921) != 0) {
            androidx.databinding.adapters.f0.A(this.Z, str5);
            this.Z.setVisibility(i10);
        }
        if ((j6 & 82048) != 0) {
            androidx.databinding.adapters.f0.A(this.H, str4);
            this.H.setVisibility(i9);
        }
        if ((j6 & 81922) != 0) {
            androidx.databinding.adapters.p.a(this.I, drawable);
        }
    }

    private p3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 14, (FrameLayout) objArr[18], (FrameLayout) objArr[17], (FrameLayout) objArr[19], (TextView) objArr[11], (ImageView) objArr[4], (FrameLayout) objArr[16]);
        this.a0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.M = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.N = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.O = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[12];
        this.P = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[13];
        this.Q = textView3;
        textView3.setTag(null);
        ImageView imageView = (ImageView) objArr[14];
        this.R = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[15];
        this.S = imageView2;
        imageView2.setTag(null);
        View view2 = (View) objArr[2];
        this.T = view2;
        view2.setTag(null);
        View view3 = (View) objArr[3];
        this.U = view3;
        view3.setTag(null);
        ImageView imageView3 = (ImageView) objArr[5];
        this.V = imageView3;
        imageView3.setTag(null);
        ImageView imageView4 = (ImageView) objArr[6];
        this.W = imageView4;
        imageView4.setTag(null);
        ImageView imageView5 = (ImageView) objArr[7];
        this.X = imageView5;
        imageView5.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[8];
        this.Y = progressBar;
        progressBar.setTag(null);
        TextView textView4 = (TextView) objArr[9];
        this.Z = textView4;
        textView4.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        P0(view);
        i0();
    }
}
