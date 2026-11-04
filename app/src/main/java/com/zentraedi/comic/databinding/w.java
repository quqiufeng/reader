package com.zentraedi.comic.databinding;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.business.manager.guide.RectTransparentLayout;
import com.zentraedi.business.manager.guide.TransparentView;
import com.zentraedi.business.utils.g8;
import com.zentraedi.business.widget.MediumTextView;
import com.zentraedi.comic.viewmodel.g6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class w extends v {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i Z4;

    @androidx.annotation.p0
    private static final SparseIntArray u5;

    @androidx.annotation.n0
    private final LinearLayout A3;

    @androidx.annotation.n0
    private final LinearLayout A4;

    @androidx.annotation.n0
    private final RelativeLayout M1;

    @androidx.annotation.n0
    private final RelativeLayout M2;

    @androidx.annotation.n0
    private final View M4;

    @androidx.annotation.n0
    private final MediumTextView P2;

    @androidx.annotation.n0
    private final LinearLayout P3;

    @androidx.annotation.n0
    private final TextView P4;

    @androidx.annotation.n0
    private final MediumTextView Q2;
    private long Q4;

    @androidx.annotation.n0
    private final LinearLayout T2;

    @androidx.annotation.n0
    private final LinearLayout T3;

    @androidx.annotation.n0
    private final MediumTextView Z2;

    @androidx.annotation.n0
    private final RelativeLayout a2;

    @androidx.annotation.n0
    private final RelativeLayout r1;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(49);
        Z4 = iVar;
        iVar.a(3, new String[]{"layout_comic_read_progress"}, new int[]{30}, new int[]{com.zentraedi.comic.q.l.ia});
        iVar.a(22, new String[]{"layout_comic_house_sort"}, new int[]{31}, new int[]{com.zentraedi.comic.q.l.aa});
        SparseIntArray sparseIntArray = new SparseIntArray();
        u5 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.k4, 32);
        sparseIntArray.put(com.zentraedi.comic.q.i.i3, 33);
        sparseIntArray.put(com.zentraedi.comic.q.i.yi, 34);
        sparseIntArray.put(com.zentraedi.comic.q.i.F7, 35);
        sparseIntArray.put(com.zentraedi.comic.q.i.H7, 36);
        sparseIntArray.put(com.zentraedi.comic.q.i.x3, 37);
        sparseIntArray.put(com.zentraedi.comic.q.i.Df, 38);
        sparseIntArray.put(com.zentraedi.comic.q.i.y3, 39);
        sparseIntArray.put(com.zentraedi.comic.q.i.Ef, 40);
        sparseIntArray.put(com.zentraedi.comic.q.i.ms, 41);
        sparseIntArray.put(com.zentraedi.comic.q.i.xo, 42);
        sparseIntArray.put(com.zentraedi.comic.q.i.a8, 43);
        sparseIntArray.put(com.zentraedi.comic.q.i.Fn, 44);
        sparseIntArray.put(com.zentraedi.comic.q.i.K7, 45);
        sparseIntArray.put(com.zentraedi.comic.q.i.u8, 46);
        sparseIntArray.put(com.zentraedi.comic.q.i.zQ, 47);
        sparseIntArray.put(com.zentraedi.comic.q.i.Ok, 48);
    }

    public w(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 49, Z4, u5));
    }

    private boolean F1(f5 f5Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
        return true;
    }

    private boolean G1(p4 p4Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 64;
        }
        return true;
    }

    private boolean I1(ObservableArrayList<com.zentraedi.comic.viewmodel.l0> observableArrayList, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 512;
        }
        return true;
    }

    private boolean J1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 32;
        }
        return true;
    }

    private boolean K1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 8192;
        }
        return true;
    }

    private boolean L1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 256;
        }
        return true;
    }

    private boolean N1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        }
        return true;
    }

    private boolean O1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
        }
        return true;
    }

    private boolean P1(ObservableArrayList<com.zentraedi.comic.viewmodel.l0> observableArrayList, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 1;
        }
        return true;
    }

    private boolean Q1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 16;
        }
        return true;
    }

    private boolean R1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 128;
        }
        return true;
    }

    private boolean S1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 2;
        }
        return true;
    }

    private boolean T1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 4;
        }
        return true;
    }

    private boolean U1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 8;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.v
    public void D1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.m2 m2Var) {
        this.n0 = m2Var;
        synchronized (this) {
            this.Q4 |= 16384;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.b4);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.v
    public void E1(@androidx.annotation.p0 g6 g6Var) {
        this.a1 = g6Var;
        synchronized (this) {
            this.Q4 |= 32768;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.b0.O0(p0Var);
        this.c0.O0(p0Var);
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.Q4 != 0) {
                    return true;
                }
                return this.b0.g0() || this.c0.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.Q4 = 65536L;
        }
        this.b0.i0();
        this.c0.i0();
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.b4 == i) {
            D1((com.zentraedi.comic.viewmodel.m2) obj);
            return true;
        }
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        E1((g6) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return P1((ObservableArrayList) obj, i2);
            case 1:
                return S1((ObservableField) obj, i2);
            case 2:
                return T1((ObservableField) obj, i2);
            case 3:
                return U1((ObservableField) obj, i2);
            case 4:
                return Q1((ObservableField) obj, i2);
            case 5:
                return J1((ObservableField) obj, i2);
            case 6:
                return G1((p4) obj, i2);
            case 7:
                return R1((ObservableField) obj, i2);
            case 8:
                return L1((ObservableField) obj, i2);
            case 9:
                return I1((ObservableArrayList) obj, i2);
            case 10:
                return F1((f5) obj, i2);
            case 11:
                return O1((ObservableField) obj, i2);
            case 12:
                return N1((ObservableField) obj, i2);
            case 13:
                return K1((ObservableField) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0189  */
    /* JADX WARN: Code duplicated, block: B:107:0x018f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x019b  */
    /* JADX WARN: Code duplicated, block: B:112:0x019e  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01be  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:129:0x01da  */
    /* JADX WARN: Code duplicated, block: B:130:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:136:0x0206  */
    /* JADX WARN: Code duplicated, block: B:138:0x0216  */
    /* JADX WARN: Code duplicated, block: B:139:0x0221  */
    /* JADX WARN: Code duplicated, block: B:141:0x022d  */
    /* JADX WARN: Code duplicated, block: B:142:0x022f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0235  */
    /* JADX WARN: Code duplicated, block: B:147:0x0240  */
    /* JADX WARN: Code duplicated, block: B:149:0x024b  */
    /* JADX WARN: Code duplicated, block: B:152:0x025f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x0261  */
    /* JADX WARN: Code duplicated, block: B:154:0x0264  */
    /* JADX WARN: Code duplicated, block: B:157:0x0269  */
    /* JADX WARN: Code duplicated, block: B:159:0x0280 A[PHI: r43
      0x0280: PHI (r43v8 float) = (r43v0 float), (r43v12 float) binds: [B:151:0x025d, B:155:0x0266] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x0283  */
    /* JADX WARN: Code duplicated, block: B:163:0x02a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:169:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:173:0x02ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:176:0x02db  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:180:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:186:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:188:0x0304  */
    /* JADX WARN: Code duplicated, block: B:190:0x0311  */
    /* JADX WARN: Code duplicated, block: B:192:0x0321  */
    /* JADX WARN: Code duplicated, block: B:195:0x0330 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0332  */
    /* JADX WARN: Code duplicated, block: B:197:0x033b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:200:0x0345  */
    /* JADX WARN: Code duplicated, block: B:201:0x034a  */
    /* JADX WARN: Code duplicated, block: B:203:0x034d  */
    /* JADX WARN: Code duplicated, block: B:204:0x034f  */
    /* JADX WARN: Code duplicated, block: B:208:0x035b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x035d  */
    /* JADX WARN: Code duplicated, block: B:211:0x036a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0375  */
    /* JADX WARN: Code duplicated, block: B:215:0x037c  */
    /* JADX WARN: Code duplicated, block: B:218:0x0383 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x0385  */
    /* JADX WARN: Code duplicated, block: B:221:0x038a  */
    /* JADX WARN: Code duplicated, block: B:223:0x0392  */
    /* JADX WARN: Code duplicated, block: B:225:0x039f  */
    /* JADX WARN: Code duplicated, block: B:227:0x03af  */
    /* JADX WARN: Code duplicated, block: B:230:0x03be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:231:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:232:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:235:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:236:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:239:0x03e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:240:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:242:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:244:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:245:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:247:0x042b  */
    /* JADX WARN: Code duplicated, block: B:297:0x053a A[PHI: r17
      0x053a: PHI (r17v4 long) = (r17v3 long), (r17v9 long) binds: [B:285:0x051f, B:294:0x0534] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:70:0x0100  */
    /* JADX WARN: Code duplicated, block: B:71:0x0107  */
    /* JADX WARN: Code duplicated, block: B:74:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0110  */
    /* JADX WARN: Code duplicated, block: B:77:0x011a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0122  */
    /* JADX WARN: Code duplicated, block: B:81:0x0129  */
    /* JADX WARN: Code duplicated, block: B:85:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0137  */
    /* JADX WARN: Code duplicated, block: B:88:0x0145  */
    /* JADX WARN: Code duplicated, block: B:91:0x0151  */
    /* JADX WARN: Code duplicated, block: B:92:0x0158  */
    /* JADX WARN: Code duplicated, block: B:94:0x015b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0162  */
    /* JADX WARN: Code duplicated, block: B:98:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0173  */
    protected void r() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        float f;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        String str;
        Drawable drawable;
        int i8;
        int i9;
        int i10;
        Boolean bool;
        boolean z3;
        ObservableField<Boolean> observableFieldX;
        boolean z4;
        Drawable drawable2;
        String str2;
        String str3;
        boolean zK0;
        String str4;
        String str5;
        int i11;
        long j6;
        boolean z5;
        long j7;
        int i12;
        int i13;
        int i14;
        boolean z6;
        boolean zK1;
        int i15;
        int i16;
        String str6;
        String str7;
        String str8;
        float f2;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z7;
        ObservableField<Boolean> observableField;
        boolean z8;
        int i21;
        int iB;
        Drawable drawableB;
        int i22;
        int i23;
        long j8;
        String str9;
        long j9;
        long j10;
        String string;
        boolean z9;
        long j11;
        long j12;
        Drawable drawableB2;
        long j13;
        long j14;
        androidx.databinding.u uVarH0;
        Boolean bool2;
        boolean zK2;
        int i24;
        long j15;
        androidx.databinding.u uVarJ0;
        Boolean bool3;
        boolean zK3;
        Context context;
        int i25;
        long j16;
        androidx.databinding.w wVarU;
        int size;
        androidx.databinding.u uVarI0;
        Boolean bool4;
        boolean zK4;
        Resources resources;
        int i26;
        long j17;
        androidx.databinding.u uVarB0;
        ObservableField<Boolean> observableFieldG0;
        ObservableField<Boolean> observableFieldX2;
        Boolean bool5;
        Boolean bool6;
        boolean zK5;
        boolean zK6;
        int i27;
        int iB2;
        int iB3;
        int i28;
        int i29;
        int iB4;
        int iB5;
        TextView textView;
        int i30;
        long j18;
        long j19;
        ObservableField<String> observableFieldZ;
        ObservableField<String> observableFieldF0;
        androidx.databinding.u title;
        synchronized (this) {
            j = this.Q4;
            this.Q4 = 0L;
        }
        com.zentraedi.comic.viewmodel.m2 m2Var = this.n0;
        g6 g6Var = this.a1;
        float f3 = 0.0f;
        if ((113599 & j) != 0) {
            if ((j & 98305) == 0) {
                z6 = false;
            } else {
                ObservableArrayList<com.zentraedi.comic.viewmodel.l0> observableArrayListY = g6Var != null ? g6Var.Y() : null;
                q1(0, observableArrayListY);
                if ((observableArrayListY != null ? observableArrayListY.size() : 0) > 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            if ((j & 100354) != 0) {
                androidx.databinding.u uVarC0 = g6Var != null ? g6Var.c0() : null;
                p1(1, uVarC0);
                zK1 = androidx.databinding.c0.K0(uVarC0 != null ? (Boolean) uVarC0.get() : null);
                if ((j & 98306) != 0) {
                    j |= zK1 ? 17039360L : 8519680L;
                }
                if ((j & 100354) != 0) {
                    j |= zK1 ? 17592186044416L : 8796093022208L;
                }
                if ((j & 98306) != 0) {
                    i15 = zK1 ? 8 : 0;
                    if (!zK1) {
                        i16 = 8;
                    }
                    if ((j & 98308) != 0) {
                        if (g6Var != null) {
                            title = g6Var.getTitle();
                        } else {
                            title = null;
                        }
                        j2 = 98432;
                        p1(2, title);
                        str6 = title != null ? (String) title.get() : null;
                        if ((j & 98312) == 0) {
                            str7 = null;
                        } else {
                            if (g6Var != null) {
                                observableFieldF0 = g6Var.f0();
                            } else {
                                observableFieldF0 = null;
                            }
                            p1(3, observableFieldF0);
                            if (observableFieldF0 != null) {
                                str7 = (String) observableFieldF0.get();
                            } else {
                                str7 = null;
                            }
                        }
                        if ((j & 98320) != 0) {
                            if (g6Var != null) {
                                observableFieldZ = g6Var.Z();
                            } else {
                                observableFieldZ = null;
                            }
                            j3 = 34359738368L;
                            p1(4, observableFieldZ);
                            str8 = observableFieldZ != null ? (String) observableFieldZ.get() : null;
                            if ((j & 100384) != 0) {
                                if (g6Var != null) {
                                    observableFieldG0 = g6Var.g0();
                                    observableFieldX2 = g6Var.X();
                                } else {
                                    observableFieldG0 = null;
                                    observableFieldX2 = null;
                                }
                                j4 = 68719476736L;
                                p1(5, observableFieldG0);
                                p1(11, observableFieldX2);
                                if (observableFieldG0 != null) {
                                    bool5 = (Boolean) observableFieldG0.get();
                                } else {
                                    bool5 = null;
                                }
                                if (observableFieldX2 != null) {
                                    bool6 = (Boolean) observableFieldX2.get();
                                } else {
                                    bool6 = null;
                                }
                                zK5 = androidx.databinding.c0.K0(bool5);
                                zK6 = androidx.databinding.c0.K0(bool6);
                                if ((j & 98336) != 0) {
                                    if (zK5) {
                                        j19 = 22589471024218112L;
                                    } else {
                                        j19 = 11294735512109056L;
                                    }
                                    j |= j19;
                                }
                                if ((j & 100384) != 0) {
                                    if (zK5) {
                                        j18 = 4194304;
                                    } else {
                                        j18 = 2097152;
                                    }
                                    j |= j18;
                                }
                                if ((j & 100352) != 0) {
                                    if (zK6) {
                                        j |= 1125917086711808L;
                                    } else {
                                        j |= 562958543355904L;
                                    }
                                }
                                if ((j & 100384) != 0) {
                                    if (zK6) {
                                        j |= 68719476736L;
                                    } else {
                                        j |= j3;
                                    }
                                }
                                if ((j & 98336) != 0) {
                                    MediumTextView mediumTextView = this.P2;
                                    if (zK5) {
                                        i29 = com.zentraedi.comic.q.f.Ux;
                                    } else {
                                        i29 = com.zentraedi.comic.q.f.Ud;
                                    }
                                    iB3 = androidx.databinding.c0.B(mediumTextView, i29);
                                    if (zK5) {
                                        iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ux);
                                    } else {
                                        iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ud);
                                    }
                                    if (zK5) {
                                        i23 = 8;
                                    } else {
                                        i23 = 0;
                                    }
                                    if (zK5) {
                                        iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ux);
                                    } else {
                                        iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ud);
                                    }
                                    if (zK5) {
                                        drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.cm);
                                    } else {
                                        drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.G0);
                                    }
                                    if (zK5) {
                                        iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.qz);
                                    } else {
                                        iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.Vd);
                                    }
                                    if (zK5) {
                                        i28 = 0;
                                    } else {
                                        i28 = 8;
                                    }
                                    i22 = iB5;
                                    if (zK5) {
                                        textView = this.g0;
                                        i30 = com.zentraedi.comic.q.f.Ux;
                                    } else {
                                        textView = this.g0;
                                        i30 = com.zentraedi.comic.q.f.yd;
                                    }
                                    iB2 = androidx.databinding.c0.B(textView, i30);
                                    i27 = iB4;
                                } else {
                                    j = j;
                                    i27 = 0;
                                    iB2 = 0;
                                    iB3 = 0;
                                    i28 = 0;
                                    iB = 0;
                                    drawableB = null;
                                    i22 = 0;
                                    i23 = 0;
                                }
                                if ((j & 100352) == 0) {
                                    i21 = 0;
                                } else {
                                    if (zK6) {
                                        f3 = 0.5f;
                                    } else {
                                        f3 = 1.0f;
                                    }
                                    if (zK6) {
                                        i21 = 0;
                                    } else {
                                        i21 = 8;
                                    }
                                }
                                int i31 = iB3;
                                i17 = i27;
                                int i32 = i28;
                                i18 = iB2;
                                j = j;
                                z8 = zK6;
                                f2 = f3;
                                observableField = observableFieldX2;
                                bool = bool6;
                                i20 = i32;
                                z7 = zK5;
                                i19 = i31;
                            } else {
                                j4 = 68719476736L;
                                f2 = 0.0f;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                i20 = 0;
                                z7 = false;
                                observableField = null;
                                bool = null;
                                z8 = false;
                                i21 = 0;
                                iB = 0;
                                drawableB = null;
                                i22 = 0;
                                i23 = 0;
                            }
                            if ((j & j2) != 0) {
                                if (g6Var != null) {
                                    long j20 = j;
                                    uVarB0 = g6Var.b0();
                                    j8 = j20;
                                } else {
                                    j8 = j;
                                    uVarB0 = null;
                                }
                                p1(7, uVarB0);
                                str9 = uVarB0 != null ? (String) uVarB0.get() : null;
                                j9 = j8 & 98560;
                                if (j9 != 0) {
                                    if (g6Var != null) {
                                        uVarI0 = g6Var.i0();
                                    } else {
                                        uVarI0 = null;
                                    }
                                    p1(8, uVarI0);
                                    if (uVarI0 != null) {
                                        bool4 = (Boolean) uVarI0.get();
                                    } else {
                                        bool4 = null;
                                    }
                                    zK4 = androidx.databinding.c0.K0(bool4);
                                    if (j9 != 0) {
                                        if (zK4) {
                                            j17 = 274877906944L;
                                        } else {
                                            j17 = 137438953472L;
                                        }
                                        j8 |= j17;
                                    }
                                    if (zK4) {
                                        resources = this.g0.getResources();
                                        i26 = com.zentraedi.comic.q.C0124q.dy;
                                    } else {
                                        resources = this.g0.getResources();
                                        i26 = com.zentraedi.comic.q.C0124q.dB;
                                    }
                                    long j21 = j8;
                                    string = resources.getString(i26);
                                    j10 = j21;
                                } else {
                                    str9 = str9;
                                    j10 = j8;
                                    string = null;
                                }
                                if ((j10 & 98816) != 0) {
                                    if (g6Var != null) {
                                        wVarU = g6Var.U();
                                    } else {
                                        wVarU = null;
                                    }
                                    q1(9, wVarU);
                                    if (wVarU != null) {
                                        size = wVarU.size();
                                    } else {
                                        size = 0;
                                    }
                                    z9 = size > 0;
                                    j11 = j10 & 102400;
                                    if (j11 != 0) {
                                        if (g6Var != null) {
                                            uVarJ0 = g6Var.j0();
                                        } else {
                                            uVarJ0 = null;
                                        }
                                        p1(12, uVarJ0);
                                        if (uVarJ0 != null) {
                                            bool3 = (Boolean) uVarJ0.get();
                                        } else {
                                            bool3 = null;
                                        }
                                        zK3 = androidx.databinding.c0.K0(bool3);
                                        if (j11 != 0) {
                                            if (zK3) {
                                                j16 = 281474976710656L;
                                            } else {
                                                j16 = 140737488355328L;
                                            }
                                            j10 |= j16;
                                        }
                                        if (zK3) {
                                            context = this.h0.getContext();
                                            i25 = com.zentraedi.comic.q.h.hn;
                                        } else {
                                            context = this.h0.getContext();
                                            i25 = com.zentraedi.comic.q.h.sn;
                                        }
                                        long j22 = j10;
                                        drawableB2 = g.a.b(context, i25);
                                        j12 = j22;
                                    } else {
                                        z9 = z9;
                                        j12 = j10;
                                        drawableB2 = null;
                                    }
                                    j13 = j12 & 106496;
                                    if (j13 != 0) {
                                        if (g6Var != null) {
                                            long j23 = j12;
                                            uVarH0 = g6Var.h0();
                                            j14 = j23;
                                        } else {
                                            j14 = j12;
                                            uVarH0 = null;
                                        }
                                        p1(13, uVarH0);
                                        if (uVarH0 != null) {
                                            bool2 = (Boolean) uVarH0.get();
                                        } else {
                                            bool2 = null;
                                        }
                                        zK2 = androidx.databinding.c0.K0(bool2);
                                        if (j13 != 0) {
                                            if (zK2) {
                                                j15 = 72057594037927936L;
                                            } else {
                                                j15 = 36028797018963968L;
                                            }
                                            j14 |= j15;
                                        }
                                        if (zK2) {
                                            i24 = 0;
                                        } else {
                                            i24 = 8;
                                        }
                                        String str10 = string;
                                        str4 = str7;
                                        i7 = i19;
                                        drawable = drawableB;
                                        str2 = str10;
                                        int i33 = i21;
                                        z4 = z7;
                                        i9 = i33;
                                        String str11 = str9;
                                        i11 = i22;
                                        str3 = str11;
                                        i3 = i15;
                                        f = f2;
                                        observableFieldX = observableField;
                                        i10 = i20;
                                        i8 = iB;
                                        drawable2 = drawableB2;
                                        i = i23;
                                        zK0 = z8;
                                        z3 = zK1;
                                        i6 = i18;
                                        z2 = z6;
                                        i5 = i17;
                                        z = z9;
                                        str5 = str8;
                                        str = str6;
                                        i4 = i24;
                                        i2 = i16;
                                        j5 = j14;
                                    } else {
                                        long j24 = j12;
                                        String str12 = string;
                                        str4 = str7;
                                        i7 = i19;
                                        drawable = drawableB;
                                        str2 = str12;
                                        int i34 = i21;
                                        z4 = z7;
                                        i9 = i34;
                                        String str13 = str9;
                                        i11 = i22;
                                        str3 = str13;
                                        i3 = i15;
                                        i2 = i16;
                                        f = f2;
                                        j5 = j24;
                                        observableFieldX = observableField;
                                        i10 = i20;
                                        i8 = iB;
                                        drawable2 = drawableB2;
                                        i = i23;
                                        zK0 = z8;
                                        z3 = zK1;
                                        i6 = i18;
                                        z2 = z6;
                                        i5 = i17;
                                        z = z9;
                                        str5 = str8;
                                        str = str6;
                                        i4 = 0;
                                    }
                                } else {
                                    j10 = j10;
                                }
                                j11 = j10 & 102400;
                                if (j11 != 0) {
                                    if (g6Var != null) {
                                        uVarJ0 = g6Var.j0();
                                    } else {
                                        uVarJ0 = null;
                                    }
                                    p1(12, uVarJ0);
                                    if (uVarJ0 != null) {
                                        bool3 = (Boolean) uVarJ0.get();
                                    } else {
                                        bool3 = null;
                                    }
                                    zK3 = androidx.databinding.c0.K0(bool3);
                                    if (j11 != 0) {
                                        if (zK3) {
                                            j16 = 281474976710656L;
                                        } else {
                                            j16 = 140737488355328L;
                                        }
                                        j10 |= j16;
                                    }
                                    if (zK3) {
                                        context = this.h0.getContext();
                                        i25 = com.zentraedi.comic.q.h.hn;
                                    } else {
                                        context = this.h0.getContext();
                                        i25 = com.zentraedi.comic.q.h.sn;
                                    }
                                    long j25 = j10;
                                    drawableB2 = g.a.b(context, i25);
                                    j12 = j25;
                                } else {
                                    z9 = z9;
                                    j12 = j10;
                                    drawableB2 = null;
                                }
                                j13 = j12 & 106496;
                                if (j13 != 0) {
                                    if (g6Var != null) {
                                        long j26 = j12;
                                        uVarH0 = g6Var.h0();
                                        j14 = j26;
                                    } else {
                                        j14 = j12;
                                        uVarH0 = null;
                                    }
                                    p1(13, uVarH0);
                                    if (uVarH0 != null) {
                                        bool2 = (Boolean) uVarH0.get();
                                    } else {
                                        bool2 = null;
                                    }
                                    zK2 = androidx.databinding.c0.K0(bool2);
                                    if (j13 != 0) {
                                        if (zK2) {
                                            j15 = 72057594037927936L;
                                        } else {
                                            j15 = 36028797018963968L;
                                        }
                                        j14 |= j15;
                                    }
                                    if (zK2) {
                                        i24 = 0;
                                    } else {
                                        i24 = 8;
                                    }
                                    String str14 = string;
                                    str4 = str7;
                                    i7 = i19;
                                    drawable = drawableB;
                                    str2 = str14;
                                    int i35 = i21;
                                    z4 = z7;
                                    i9 = i35;
                                    String str15 = str9;
                                    i11 = i22;
                                    str3 = str15;
                                    i3 = i15;
                                    f = f2;
                                    observableFieldX = observableField;
                                    i10 = i20;
                                    i8 = iB;
                                    drawable2 = drawableB2;
                                    i = i23;
                                    zK0 = z8;
                                    z3 = zK1;
                                    i6 = i18;
                                    z2 = z6;
                                    i5 = i17;
                                    z = z9;
                                    str5 = str8;
                                    str = str6;
                                    i4 = i24;
                                    i2 = i16;
                                    j5 = j14;
                                } else {
                                    long j27 = j12;
                                    String str16 = string;
                                    str4 = str7;
                                    i7 = i19;
                                    drawable = drawableB;
                                    str2 = str16;
                                    int i36 = i21;
                                    z4 = z7;
                                    i9 = i36;
                                    String str17 = str9;
                                    i11 = i22;
                                    str3 = str17;
                                    i3 = i15;
                                    i2 = i16;
                                    f = f2;
                                    j5 = j27;
                                    observableFieldX = observableField;
                                    i10 = i20;
                                    i8 = iB;
                                    drawable2 = drawableB2;
                                    i = i23;
                                    zK0 = z8;
                                    z3 = zK1;
                                    i6 = i18;
                                    z2 = z6;
                                    i5 = i17;
                                    z = z9;
                                    str5 = str8;
                                    str = str6;
                                    i4 = 0;
                                }
                            } else {
                                j8 = j;
                            }
                            j9 = j8 & 98560;
                            if (j9 != 0) {
                                if (g6Var != null) {
                                    uVarI0 = g6Var.i0();
                                } else {
                                    uVarI0 = null;
                                }
                                p1(8, uVarI0);
                                if (uVarI0 != null) {
                                    bool4 = (Boolean) uVarI0.get();
                                } else {
                                    bool4 = null;
                                }
                                zK4 = androidx.databinding.c0.K0(bool4);
                                if (j9 != 0) {
                                    if (zK4) {
                                        j17 = 274877906944L;
                                    } else {
                                        j17 = 137438953472L;
                                    }
                                    j8 |= j17;
                                }
                                if (zK4) {
                                    resources = this.g0.getResources();
                                    i26 = com.zentraedi.comic.q.C0124q.dy;
                                } else {
                                    resources = this.g0.getResources();
                                    i26 = com.zentraedi.comic.q.C0124q.dB;
                                }
                                long j28 = j8;
                                string = resources.getString(i26);
                                j10 = j28;
                            } else {
                                str9 = str9;
                                j10 = j8;
                                string = null;
                            }
                            if ((j10 & 98816) != 0) {
                                if (g6Var != null) {
                                    wVarU = g6Var.U();
                                } else {
                                    wVarU = null;
                                }
                                q1(9, wVarU);
                                if (wVarU != null) {
                                    size = wVarU.size();
                                } else {
                                    size = 0;
                                }
                                if (size > 0) {
                                }
                                j11 = j10 & 102400;
                                if (j11 != 0) {
                                    if (g6Var != null) {
                                        uVarJ0 = g6Var.j0();
                                    } else {
                                        uVarJ0 = null;
                                    }
                                    p1(12, uVarJ0);
                                    if (uVarJ0 != null) {
                                        bool3 = (Boolean) uVarJ0.get();
                                    } else {
                                        bool3 = null;
                                    }
                                    zK3 = androidx.databinding.c0.K0(bool3);
                                    if (j11 != 0) {
                                        if (zK3) {
                                            j16 = 281474976710656L;
                                        } else {
                                            j16 = 140737488355328L;
                                        }
                                        j10 |= j16;
                                    }
                                    if (zK3) {
                                        context = this.h0.getContext();
                                        i25 = com.zentraedi.comic.q.h.hn;
                                    } else {
                                        context = this.h0.getContext();
                                        i25 = com.zentraedi.comic.q.h.sn;
                                    }
                                    long j29 = j10;
                                    drawableB2 = g.a.b(context, i25);
                                    j12 = j29;
                                } else {
                                    z9 = z9;
                                    j12 = j10;
                                    drawableB2 = null;
                                }
                                j13 = j12 & 106496;
                                if (j13 != 0) {
                                    if (g6Var != null) {
                                        long j210 = j12;
                                        uVarH0 = g6Var.h0();
                                        j14 = j210;
                                    } else {
                                        j14 = j12;
                                        uVarH0 = null;
                                    }
                                    p1(13, uVarH0);
                                    if (uVarH0 != null) {
                                        bool2 = (Boolean) uVarH0.get();
                                    } else {
                                        bool2 = null;
                                    }
                                    zK2 = androidx.databinding.c0.K0(bool2);
                                    if (j13 != 0) {
                                        if (zK2) {
                                            j15 = 72057594037927936L;
                                        } else {
                                            j15 = 36028797018963968L;
                                        }
                                        j14 |= j15;
                                    }
                                    if (zK2) {
                                        i24 = 0;
                                    } else {
                                        i24 = 8;
                                    }
                                    String str18 = string;
                                    str4 = str7;
                                    i7 = i19;
                                    drawable = drawableB;
                                    str2 = str18;
                                    int i37 = i21;
                                    z4 = z7;
                                    i9 = i37;
                                    String str19 = str9;
                                    i11 = i22;
                                    str3 = str19;
                                    i3 = i15;
                                    f = f2;
                                    observableFieldX = observableField;
                                    i10 = i20;
                                    i8 = iB;
                                    drawable2 = drawableB2;
                                    i = i23;
                                    zK0 = z8;
                                    z3 = zK1;
                                    i6 = i18;
                                    z2 = z6;
                                    i5 = i17;
                                    z = z9;
                                    str5 = str8;
                                    str = str6;
                                    i4 = i24;
                                    i2 = i16;
                                    j5 = j14;
                                } else {
                                    long j211 = j12;
                                    String str110 = string;
                                    str4 = str7;
                                    i7 = i19;
                                    drawable = drawableB;
                                    str2 = str110;
                                    int i38 = i21;
                                    z4 = z7;
                                    i9 = i38;
                                    String str111 = str9;
                                    i11 = i22;
                                    str3 = str111;
                                    i3 = i15;
                                    i2 = i16;
                                    f = f2;
                                    j5 = j211;
                                    observableFieldX = observableField;
                                    i10 = i20;
                                    i8 = iB;
                                    drawable2 = drawableB2;
                                    i = i23;
                                    zK0 = z8;
                                    z3 = zK1;
                                    i6 = i18;
                                    z2 = z6;
                                    i5 = i17;
                                    z = z9;
                                    str5 = str8;
                                    str = str6;
                                    i4 = 0;
                                }
                            } else {
                                j10 = j10;
                            }
                            j11 = j10 & 102400;
                            if (j11 != 0) {
                                if (g6Var != null) {
                                    uVarJ0 = g6Var.j0();
                                } else {
                                    uVarJ0 = null;
                                }
                                p1(12, uVarJ0);
                                if (uVarJ0 != null) {
                                    bool3 = (Boolean) uVarJ0.get();
                                } else {
                                    bool3 = null;
                                }
                                zK3 = androidx.databinding.c0.K0(bool3);
                                if (j11 != 0) {
                                    if (zK3) {
                                        j16 = 281474976710656L;
                                    } else {
                                        j16 = 140737488355328L;
                                    }
                                    j10 |= j16;
                                }
                                if (zK3) {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.hn;
                                } else {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.sn;
                                }
                                long j212 = j10;
                                drawableB2 = g.a.b(context, i25);
                                j12 = j212;
                            } else {
                                z9 = z9;
                                j12 = j10;
                                drawableB2 = null;
                            }
                            j13 = j12 & 106496;
                            if (j13 != 0) {
                                if (g6Var != null) {
                                    long j213 = j12;
                                    uVarH0 = g6Var.h0();
                                    j14 = j213;
                                } else {
                                    j14 = j12;
                                    uVarH0 = null;
                                }
                                p1(13, uVarH0);
                                if (uVarH0 != null) {
                                    bool2 = (Boolean) uVarH0.get();
                                } else {
                                    bool2 = null;
                                }
                                zK2 = androidx.databinding.c0.K0(bool2);
                                if (j13 != 0) {
                                    if (zK2) {
                                        j15 = 72057594037927936L;
                                    } else {
                                        j15 = 36028797018963968L;
                                    }
                                    j14 |= j15;
                                }
                                if (zK2) {
                                    i24 = 0;
                                } else {
                                    i24 = 8;
                                }
                                String str112 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str112;
                                int i39 = i21;
                                z4 = z7;
                                i9 = i39;
                                String str113 = str9;
                                i11 = i22;
                                str3 = str113;
                                i3 = i15;
                                f = f2;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = i24;
                                i2 = i16;
                                j5 = j14;
                            } else {
                                long j214 = j12;
                                String str114 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str114;
                                int i310 = i21;
                                z4 = z7;
                                i9 = i310;
                                String str115 = str9;
                                i11 = i22;
                                str3 = str115;
                                i3 = i15;
                                i2 = i16;
                                f = f2;
                                j5 = j214;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = 0;
                            }
                        } else {
                            j3 = 34359738368L;
                        }
                        if ((j & 100384) != 0) {
                            if (g6Var != null) {
                                observableFieldG0 = g6Var.g0();
                                observableFieldX2 = g6Var.X();
                            } else {
                                observableFieldG0 = null;
                                observableFieldX2 = null;
                            }
                            j4 = 68719476736L;
                            p1(5, observableFieldG0);
                            p1(11, observableFieldX2);
                            if (observableFieldG0 != null) {
                                bool5 = (Boolean) observableFieldG0.get();
                            } else {
                                bool5 = null;
                            }
                            if (observableFieldX2 != null) {
                                bool6 = (Boolean) observableFieldX2.get();
                            } else {
                                bool6 = null;
                            }
                            zK5 = androidx.databinding.c0.K0(bool5);
                            zK6 = androidx.databinding.c0.K0(bool6);
                            if ((j & 98336) != 0) {
                                if (zK5) {
                                    j19 = 22589471024218112L;
                                } else {
                                    j19 = 11294735512109056L;
                                }
                                j |= j19;
                            }
                            if ((j & 100384) != 0) {
                                if (zK5) {
                                    j18 = 4194304;
                                } else {
                                    j18 = 2097152;
                                }
                                j |= j18;
                            }
                            if ((j & 100352) != 0) {
                                if (zK6) {
                                    j |= 1125917086711808L;
                                } else {
                                    j |= 562958543355904L;
                                }
                            }
                            if ((j & 100384) != 0) {
                                if (zK6) {
                                    j |= 68719476736L;
                                } else {
                                    j |= j3;
                                }
                            }
                            if ((j & 98336) != 0) {
                                MediumTextView mediumTextView2 = this.P2;
                                if (zK5) {
                                    i29 = com.zentraedi.comic.q.f.Ux;
                                } else {
                                    i29 = com.zentraedi.comic.q.f.Ud;
                                }
                                iB3 = androidx.databinding.c0.B(mediumTextView2, i29);
                                if (zK5) {
                                    iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ux);
                                } else {
                                    iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ud);
                                }
                                if (zK5) {
                                    i23 = 8;
                                } else {
                                    i23 = 0;
                                }
                                if (zK5) {
                                    iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ux);
                                } else {
                                    iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ud);
                                }
                                if (zK5) {
                                    drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.cm);
                                } else {
                                    drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.G0);
                                }
                                if (zK5) {
                                    iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.qz);
                                } else {
                                    iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.Vd);
                                }
                                if (zK5) {
                                    i28 = 0;
                                } else {
                                    i28 = 8;
                                }
                                i22 = iB5;
                                if (zK5) {
                                    textView = this.g0;
                                    i30 = com.zentraedi.comic.q.f.Ux;
                                } else {
                                    textView = this.g0;
                                    i30 = com.zentraedi.comic.q.f.yd;
                                }
                                iB2 = androidx.databinding.c0.B(textView, i30);
                                i27 = iB4;
                            } else {
                                j = j;
                                i27 = 0;
                                iB2 = 0;
                                iB3 = 0;
                                i28 = 0;
                                iB = 0;
                                drawableB = null;
                                i22 = 0;
                                i23 = 0;
                            }
                            if ((j & 100352) == 0) {
                                i21 = 0;
                            } else {
                                if (zK6) {
                                    f3 = 0.5f;
                                } else {
                                    f3 = 1.0f;
                                }
                                if (zK6) {
                                    i21 = 0;
                                } else {
                                    i21 = 8;
                                }
                            }
                            int i311 = iB3;
                            i17 = i27;
                            int i312 = i28;
                            i18 = iB2;
                            j = j;
                            z8 = zK6;
                            f2 = f3;
                            observableField = observableFieldX2;
                            bool = bool6;
                            i20 = i312;
                            z7 = zK5;
                            i19 = i311;
                        } else {
                            j4 = 68719476736L;
                            f2 = 0.0f;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            i20 = 0;
                            z7 = false;
                            observableField = null;
                            bool = null;
                            z8 = false;
                            i21 = 0;
                            iB = 0;
                            drawableB = null;
                            i22 = 0;
                            i23 = 0;
                        }
                        if ((j & j2) != 0) {
                            if (g6Var != null) {
                                long j215 = j;
                                uVarB0 = g6Var.b0();
                                j8 = j215;
                            } else {
                                j8 = j;
                                uVarB0 = null;
                            }
                            p1(7, uVarB0);
                            if (uVarB0 != null) {
                            }
                            j9 = j8 & 98560;
                            if (j9 != 0) {
                                if (g6Var != null) {
                                    uVarI0 = g6Var.i0();
                                } else {
                                    uVarI0 = null;
                                }
                                p1(8, uVarI0);
                                if (uVarI0 != null) {
                                    bool4 = (Boolean) uVarI0.get();
                                } else {
                                    bool4 = null;
                                }
                                zK4 = androidx.databinding.c0.K0(bool4);
                                if (j9 != 0) {
                                    if (zK4) {
                                        j17 = 274877906944L;
                                    } else {
                                        j17 = 137438953472L;
                                    }
                                    j8 |= j17;
                                }
                                if (zK4) {
                                    resources = this.g0.getResources();
                                    i26 = com.zentraedi.comic.q.C0124q.dy;
                                } else {
                                    resources = this.g0.getResources();
                                    i26 = com.zentraedi.comic.q.C0124q.dB;
                                }
                                long j216 = j8;
                                string = resources.getString(i26);
                                j10 = j216;
                            } else {
                                str9 = str9;
                                j10 = j8;
                                string = null;
                            }
                            if ((j10 & 98816) != 0) {
                                if (g6Var != null) {
                                    wVarU = g6Var.U();
                                } else {
                                    wVarU = null;
                                }
                                q1(9, wVarU);
                                if (wVarU != null) {
                                    size = wVarU.size();
                                } else {
                                    size = 0;
                                }
                                if (size > 0) {
                                }
                                j11 = j10 & 102400;
                                if (j11 != 0) {
                                    if (g6Var != null) {
                                        uVarJ0 = g6Var.j0();
                                    } else {
                                        uVarJ0 = null;
                                    }
                                    p1(12, uVarJ0);
                                    if (uVarJ0 != null) {
                                        bool3 = (Boolean) uVarJ0.get();
                                    } else {
                                        bool3 = null;
                                    }
                                    zK3 = androidx.databinding.c0.K0(bool3);
                                    if (j11 != 0) {
                                        if (zK3) {
                                            j16 = 281474976710656L;
                                        } else {
                                            j16 = 140737488355328L;
                                        }
                                        j10 |= j16;
                                    }
                                    if (zK3) {
                                        context = this.h0.getContext();
                                        i25 = com.zentraedi.comic.q.h.hn;
                                    } else {
                                        context = this.h0.getContext();
                                        i25 = com.zentraedi.comic.q.h.sn;
                                    }
                                    long j217 = j10;
                                    drawableB2 = g.a.b(context, i25);
                                    j12 = j217;
                                } else {
                                    z9 = z9;
                                    j12 = j10;
                                    drawableB2 = null;
                                }
                                j13 = j12 & 106496;
                                if (j13 != 0) {
                                    if (g6Var != null) {
                                        long j218 = j12;
                                        uVarH0 = g6Var.h0();
                                        j14 = j218;
                                    } else {
                                        j14 = j12;
                                        uVarH0 = null;
                                    }
                                    p1(13, uVarH0);
                                    if (uVarH0 != null) {
                                        bool2 = (Boolean) uVarH0.get();
                                    } else {
                                        bool2 = null;
                                    }
                                    zK2 = androidx.databinding.c0.K0(bool2);
                                    if (j13 != 0) {
                                        if (zK2) {
                                            j15 = 72057594037927936L;
                                        } else {
                                            j15 = 36028797018963968L;
                                        }
                                        j14 |= j15;
                                    }
                                    if (zK2) {
                                        i24 = 0;
                                    } else {
                                        i24 = 8;
                                    }
                                    String str116 = string;
                                    str4 = str7;
                                    i7 = i19;
                                    drawable = drawableB;
                                    str2 = str116;
                                    int i313 = i21;
                                    z4 = z7;
                                    i9 = i313;
                                    String str117 = str9;
                                    i11 = i22;
                                    str3 = str117;
                                    i3 = i15;
                                    f = f2;
                                    observableFieldX = observableField;
                                    i10 = i20;
                                    i8 = iB;
                                    drawable2 = drawableB2;
                                    i = i23;
                                    zK0 = z8;
                                    z3 = zK1;
                                    i6 = i18;
                                    z2 = z6;
                                    i5 = i17;
                                    z = z9;
                                    str5 = str8;
                                    str = str6;
                                    i4 = i24;
                                    i2 = i16;
                                    j5 = j14;
                                } else {
                                    long j219 = j12;
                                    String str118 = string;
                                    str4 = str7;
                                    i7 = i19;
                                    drawable = drawableB;
                                    str2 = str118;
                                    int i314 = i21;
                                    z4 = z7;
                                    i9 = i314;
                                    String str119 = str9;
                                    i11 = i22;
                                    str3 = str119;
                                    i3 = i15;
                                    i2 = i16;
                                    f = f2;
                                    j5 = j219;
                                    observableFieldX = observableField;
                                    i10 = i20;
                                    i8 = iB;
                                    drawable2 = drawableB2;
                                    i = i23;
                                    zK0 = z8;
                                    z3 = zK1;
                                    i6 = i18;
                                    z2 = z6;
                                    i5 = i17;
                                    z = z9;
                                    str5 = str8;
                                    str = str6;
                                    i4 = 0;
                                }
                            } else {
                                j10 = j10;
                            }
                            j11 = j10 & 102400;
                            if (j11 != 0) {
                                if (g6Var != null) {
                                    uVarJ0 = g6Var.j0();
                                } else {
                                    uVarJ0 = null;
                                }
                                p1(12, uVarJ0);
                                if (uVarJ0 != null) {
                                    bool3 = (Boolean) uVarJ0.get();
                                } else {
                                    bool3 = null;
                                }
                                zK3 = androidx.databinding.c0.K0(bool3);
                                if (j11 != 0) {
                                    if (zK3) {
                                        j16 = 281474976710656L;
                                    } else {
                                        j16 = 140737488355328L;
                                    }
                                    j10 |= j16;
                                }
                                if (zK3) {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.hn;
                                } else {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.sn;
                                }
                                long j2110 = j10;
                                drawableB2 = g.a.b(context, i25);
                                j12 = j2110;
                            } else {
                                z9 = z9;
                                j12 = j10;
                                drawableB2 = null;
                            }
                            j13 = j12 & 106496;
                            if (j13 != 0) {
                                if (g6Var != null) {
                                    long j2111 = j12;
                                    uVarH0 = g6Var.h0();
                                    j14 = j2111;
                                } else {
                                    j14 = j12;
                                    uVarH0 = null;
                                }
                                p1(13, uVarH0);
                                if (uVarH0 != null) {
                                    bool2 = (Boolean) uVarH0.get();
                                } else {
                                    bool2 = null;
                                }
                                zK2 = androidx.databinding.c0.K0(bool2);
                                if (j13 != 0) {
                                    if (zK2) {
                                        j15 = 72057594037927936L;
                                    } else {
                                        j15 = 36028797018963968L;
                                    }
                                    j14 |= j15;
                                }
                                if (zK2) {
                                    i24 = 0;
                                } else {
                                    i24 = 8;
                                }
                                String str1110 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str1110;
                                int i315 = i21;
                                z4 = z7;
                                i9 = i315;
                                String str1111 = str9;
                                i11 = i22;
                                str3 = str1111;
                                i3 = i15;
                                f = f2;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = i24;
                                i2 = i16;
                                j5 = j14;
                            } else {
                                long j2112 = j12;
                                String str1112 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str1112;
                                int i316 = i21;
                                z4 = z7;
                                i9 = i316;
                                String str1113 = str9;
                                i11 = i22;
                                str3 = str1113;
                                i3 = i15;
                                i2 = i16;
                                f = f2;
                                j5 = j2112;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = 0;
                            }
                        } else {
                            j8 = j;
                        }
                        j9 = j8 & 98560;
                        if (j9 != 0) {
                            if (g6Var != null) {
                                uVarI0 = g6Var.i0();
                            } else {
                                uVarI0 = null;
                            }
                            p1(8, uVarI0);
                            if (uVarI0 != null) {
                                bool4 = (Boolean) uVarI0.get();
                            } else {
                                bool4 = null;
                            }
                            zK4 = androidx.databinding.c0.K0(bool4);
                            if (j9 != 0) {
                                if (zK4) {
                                    j17 = 274877906944L;
                                } else {
                                    j17 = 137438953472L;
                                }
                                j8 |= j17;
                            }
                            if (zK4) {
                                resources = this.g0.getResources();
                                i26 = com.zentraedi.comic.q.C0124q.dy;
                            } else {
                                resources = this.g0.getResources();
                                i26 = com.zentraedi.comic.q.C0124q.dB;
                            }
                            long j2113 = j8;
                            string = resources.getString(i26);
                            j10 = j2113;
                        } else {
                            str9 = str9;
                            j10 = j8;
                            string = null;
                        }
                        if ((j10 & 98816) != 0) {
                            if (g6Var != null) {
                                wVarU = g6Var.U();
                            } else {
                                wVarU = null;
                            }
                            q1(9, wVarU);
                            if (wVarU != null) {
                                size = wVarU.size();
                            } else {
                                size = 0;
                            }
                            if (size > 0) {
                            }
                            j11 = j10 & 102400;
                            if (j11 != 0) {
                                if (g6Var != null) {
                                    uVarJ0 = g6Var.j0();
                                } else {
                                    uVarJ0 = null;
                                }
                                p1(12, uVarJ0);
                                if (uVarJ0 != null) {
                                    bool3 = (Boolean) uVarJ0.get();
                                } else {
                                    bool3 = null;
                                }
                                zK3 = androidx.databinding.c0.K0(bool3);
                                if (j11 != 0) {
                                    if (zK3) {
                                        j16 = 281474976710656L;
                                    } else {
                                        j16 = 140737488355328L;
                                    }
                                    j10 |= j16;
                                }
                                if (zK3) {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.hn;
                                } else {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.sn;
                                }
                                long j2114 = j10;
                                drawableB2 = g.a.b(context, i25);
                                j12 = j2114;
                            } else {
                                z9 = z9;
                                j12 = j10;
                                drawableB2 = null;
                            }
                            j13 = j12 & 106496;
                            if (j13 != 0) {
                                if (g6Var != null) {
                                    long j2115 = j12;
                                    uVarH0 = g6Var.h0();
                                    j14 = j2115;
                                } else {
                                    j14 = j12;
                                    uVarH0 = null;
                                }
                                p1(13, uVarH0);
                                if (uVarH0 != null) {
                                    bool2 = (Boolean) uVarH0.get();
                                } else {
                                    bool2 = null;
                                }
                                zK2 = androidx.databinding.c0.K0(bool2);
                                if (j13 != 0) {
                                    if (zK2) {
                                        j15 = 72057594037927936L;
                                    } else {
                                        j15 = 36028797018963968L;
                                    }
                                    j14 |= j15;
                                }
                                if (zK2) {
                                    i24 = 0;
                                } else {
                                    i24 = 8;
                                }
                                String str1114 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str1114;
                                int i317 = i21;
                                z4 = z7;
                                i9 = i317;
                                String str1115 = str9;
                                i11 = i22;
                                str3 = str1115;
                                i3 = i15;
                                f = f2;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = i24;
                                i2 = i16;
                                j5 = j14;
                            } else {
                                long j2116 = j12;
                                String str1116 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str1116;
                                int i318 = i21;
                                z4 = z7;
                                i9 = i318;
                                String str1117 = str9;
                                i11 = i22;
                                str3 = str1117;
                                i3 = i15;
                                i2 = i16;
                                f = f2;
                                j5 = j2116;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = 0;
                            }
                        } else {
                            j10 = j10;
                        }
                        j11 = j10 & 102400;
                        if (j11 != 0) {
                            if (g6Var != null) {
                                uVarJ0 = g6Var.j0();
                            } else {
                                uVarJ0 = null;
                            }
                            p1(12, uVarJ0);
                            if (uVarJ0 != null) {
                                bool3 = (Boolean) uVarJ0.get();
                            } else {
                                bool3 = null;
                            }
                            zK3 = androidx.databinding.c0.K0(bool3);
                            if (j11 != 0) {
                                if (zK3) {
                                    j16 = 281474976710656L;
                                } else {
                                    j16 = 140737488355328L;
                                }
                                j10 |= j16;
                            }
                            if (zK3) {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.hn;
                            } else {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.sn;
                            }
                            long j2117 = j10;
                            drawableB2 = g.a.b(context, i25);
                            j12 = j2117;
                        } else {
                            z9 = z9;
                            j12 = j10;
                            drawableB2 = null;
                        }
                        j13 = j12 & 106496;
                        if (j13 != 0) {
                            if (g6Var != null) {
                                long j2118 = j12;
                                uVarH0 = g6Var.h0();
                                j14 = j2118;
                            } else {
                                j14 = j12;
                                uVarH0 = null;
                            }
                            p1(13, uVarH0);
                            if (uVarH0 != null) {
                                bool2 = (Boolean) uVarH0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j13 != 0) {
                                if (zK2) {
                                    j15 = 72057594037927936L;
                                } else {
                                    j15 = 36028797018963968L;
                                }
                                j14 |= j15;
                            }
                            if (zK2) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            String str1118 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str1118;
                            int i319 = i21;
                            z4 = z7;
                            i9 = i319;
                            String str1119 = str9;
                            i11 = i22;
                            str3 = str1119;
                            i3 = i15;
                            f = f2;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = i24;
                            i2 = i16;
                            j5 = j14;
                        } else {
                            long j2119 = j12;
                            String str11110 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str11110;
                            int i3110 = i21;
                            z4 = z7;
                            i9 = i3110;
                            String str11111 = str9;
                            i11 = i22;
                            str3 = str11111;
                            i3 = i15;
                            i2 = i16;
                            f = f2;
                            j5 = j2119;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = 0;
                        }
                    } else {
                        j2 = 98432;
                    }
                    if ((j & 98312) == 0) {
                        str7 = null;
                    } else {
                        if (g6Var != null) {
                            observableFieldF0 = g6Var.f0();
                        } else {
                            observableFieldF0 = null;
                        }
                        p1(3, observableFieldF0);
                        if (observableFieldF0 != null) {
                            str7 = (String) observableFieldF0.get();
                        } else {
                            str7 = null;
                        }
                    }
                    if ((j & 98320) != 0) {
                        if (g6Var != null) {
                            observableFieldZ = g6Var.Z();
                        } else {
                            observableFieldZ = null;
                        }
                        j3 = 34359738368L;
                        p1(4, observableFieldZ);
                        if (observableFieldZ != null) {
                        }
                        if ((j & 100384) != 0) {
                            if (g6Var != null) {
                                observableFieldG0 = g6Var.g0();
                                observableFieldX2 = g6Var.X();
                            } else {
                                observableFieldG0 = null;
                                observableFieldX2 = null;
                            }
                            j4 = 68719476736L;
                            p1(5, observableFieldG0);
                            p1(11, observableFieldX2);
                            if (observableFieldG0 != null) {
                                bool5 = (Boolean) observableFieldG0.get();
                            } else {
                                bool5 = null;
                            }
                            if (observableFieldX2 != null) {
                                bool6 = (Boolean) observableFieldX2.get();
                            } else {
                                bool6 = null;
                            }
                            zK5 = androidx.databinding.c0.K0(bool5);
                            zK6 = androidx.databinding.c0.K0(bool6);
                            if ((j & 98336) != 0) {
                                if (zK5) {
                                    j19 = 22589471024218112L;
                                } else {
                                    j19 = 11294735512109056L;
                                }
                                j |= j19;
                            }
                            if ((j & 100384) != 0) {
                                if (zK5) {
                                    j18 = 4194304;
                                } else {
                                    j18 = 2097152;
                                }
                                j |= j18;
                            }
                            if ((j & 100352) != 0) {
                                if (zK6) {
                                    j |= 1125917086711808L;
                                } else {
                                    j |= 562958543355904L;
                                }
                            }
                            if ((j & 100384) != 0) {
                                if (zK6) {
                                    j |= 68719476736L;
                                } else {
                                    j |= j3;
                                }
                            }
                            if ((j & 98336) != 0) {
                                MediumTextView mediumTextView3 = this.P2;
                                if (zK5) {
                                    i29 = com.zentraedi.comic.q.f.Ux;
                                } else {
                                    i29 = com.zentraedi.comic.q.f.Ud;
                                }
                                iB3 = androidx.databinding.c0.B(mediumTextView3, i29);
                                if (zK5) {
                                    iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ux);
                                } else {
                                    iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ud);
                                }
                                if (zK5) {
                                    i23 = 8;
                                } else {
                                    i23 = 0;
                                }
                                if (zK5) {
                                    iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ux);
                                } else {
                                    iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ud);
                                }
                                if (zK5) {
                                    drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.cm);
                                } else {
                                    drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.G0);
                                }
                                if (zK5) {
                                    iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.qz);
                                } else {
                                    iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.Vd);
                                }
                                if (zK5) {
                                    i28 = 0;
                                } else {
                                    i28 = 8;
                                }
                                i22 = iB5;
                                if (zK5) {
                                    textView = this.g0;
                                    i30 = com.zentraedi.comic.q.f.Ux;
                                } else {
                                    textView = this.g0;
                                    i30 = com.zentraedi.comic.q.f.yd;
                                }
                                iB2 = androidx.databinding.c0.B(textView, i30);
                                i27 = iB4;
                            } else {
                                j = j;
                                i27 = 0;
                                iB2 = 0;
                                iB3 = 0;
                                i28 = 0;
                                iB = 0;
                                drawableB = null;
                                i22 = 0;
                                i23 = 0;
                            }
                            if ((j & 100352) == 0) {
                                i21 = 0;
                            } else {
                                if (zK6) {
                                    f3 = 0.5f;
                                } else {
                                    f3 = 1.0f;
                                }
                                if (zK6) {
                                    i21 = 0;
                                } else {
                                    i21 = 8;
                                }
                            }
                            int i3111 = iB3;
                            i17 = i27;
                            int i3112 = i28;
                            i18 = iB2;
                            j = j;
                            z8 = zK6;
                            f2 = f3;
                            observableField = observableFieldX2;
                            bool = bool6;
                            i20 = i3112;
                            z7 = zK5;
                            i19 = i3111;
                        } else {
                            j4 = 68719476736L;
                            f2 = 0.0f;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            i20 = 0;
                            z7 = false;
                            observableField = null;
                            bool = null;
                            z8 = false;
                            i21 = 0;
                            iB = 0;
                            drawableB = null;
                            i22 = 0;
                            i23 = 0;
                        }
                        if ((j & j2) != 0) {
                            if (g6Var != null) {
                                long j2120 = j;
                                uVarB0 = g6Var.b0();
                                j8 = j2120;
                            } else {
                                j8 = j;
                                uVarB0 = null;
                            }
                            p1(7, uVarB0);
                            if (uVarB0 != null) {
                            }
                            j9 = j8 & 98560;
                            if (j9 != 0) {
                                if (g6Var != null) {
                                    uVarI0 = g6Var.i0();
                                } else {
                                    uVarI0 = null;
                                }
                                p1(8, uVarI0);
                                if (uVarI0 != null) {
                                    bool4 = (Boolean) uVarI0.get();
                                } else {
                                    bool4 = null;
                                }
                                zK4 = androidx.databinding.c0.K0(bool4);
                                if (j9 != 0) {
                                    if (zK4) {
                                        j17 = 274877906944L;
                                    } else {
                                        j17 = 137438953472L;
                                    }
                                    j8 |= j17;
                                }
                                if (zK4) {
                                    resources = this.g0.getResources();
                                    i26 = com.zentraedi.comic.q.C0124q.dy;
                                } else {
                                    resources = this.g0.getResources();
                                    i26 = com.zentraedi.comic.q.C0124q.dB;
                                }
                                long j21110 = j8;
                                string = resources.getString(i26);
                                j10 = j21110;
                            } else {
                                str9 = str9;
                                j10 = j8;
                                string = null;
                            }
                            if ((j10 & 98816) != 0) {
                                if (g6Var != null) {
                                    wVarU = g6Var.U();
                                } else {
                                    wVarU = null;
                                }
                                q1(9, wVarU);
                                if (wVarU != null) {
                                    size = wVarU.size();
                                } else {
                                    size = 0;
                                }
                                if (size > 0) {
                                }
                                j11 = j10 & 102400;
                                if (j11 != 0) {
                                    if (g6Var != null) {
                                        uVarJ0 = g6Var.j0();
                                    } else {
                                        uVarJ0 = null;
                                    }
                                    p1(12, uVarJ0);
                                    if (uVarJ0 != null) {
                                        bool3 = (Boolean) uVarJ0.get();
                                    } else {
                                        bool3 = null;
                                    }
                                    zK3 = androidx.databinding.c0.K0(bool3);
                                    if (j11 != 0) {
                                        if (zK3) {
                                            j16 = 281474976710656L;
                                        } else {
                                            j16 = 140737488355328L;
                                        }
                                        j10 |= j16;
                                    }
                                    if (zK3) {
                                        context = this.h0.getContext();
                                        i25 = com.zentraedi.comic.q.h.hn;
                                    } else {
                                        context = this.h0.getContext();
                                        i25 = com.zentraedi.comic.q.h.sn;
                                    }
                                    long j21111 = j10;
                                    drawableB2 = g.a.b(context, i25);
                                    j12 = j21111;
                                } else {
                                    z9 = z9;
                                    j12 = j10;
                                    drawableB2 = null;
                                }
                                j13 = j12 & 106496;
                                if (j13 != 0) {
                                    if (g6Var != null) {
                                        long j21112 = j12;
                                        uVarH0 = g6Var.h0();
                                        j14 = j21112;
                                    } else {
                                        j14 = j12;
                                        uVarH0 = null;
                                    }
                                    p1(13, uVarH0);
                                    if (uVarH0 != null) {
                                        bool2 = (Boolean) uVarH0.get();
                                    } else {
                                        bool2 = null;
                                    }
                                    zK2 = androidx.databinding.c0.K0(bool2);
                                    if (j13 != 0) {
                                        if (zK2) {
                                            j15 = 72057594037927936L;
                                        } else {
                                            j15 = 36028797018963968L;
                                        }
                                        j14 |= j15;
                                    }
                                    if (zK2) {
                                        i24 = 0;
                                    } else {
                                        i24 = 8;
                                    }
                                    String str11112 = string;
                                    str4 = str7;
                                    i7 = i19;
                                    drawable = drawableB;
                                    str2 = str11112;
                                    int i3113 = i21;
                                    z4 = z7;
                                    i9 = i3113;
                                    String str11113 = str9;
                                    i11 = i22;
                                    str3 = str11113;
                                    i3 = i15;
                                    f = f2;
                                    observableFieldX = observableField;
                                    i10 = i20;
                                    i8 = iB;
                                    drawable2 = drawableB2;
                                    i = i23;
                                    zK0 = z8;
                                    z3 = zK1;
                                    i6 = i18;
                                    z2 = z6;
                                    i5 = i17;
                                    z = z9;
                                    str5 = str8;
                                    str = str6;
                                    i4 = i24;
                                    i2 = i16;
                                    j5 = j14;
                                } else {
                                    long j21113 = j12;
                                    String str11114 = string;
                                    str4 = str7;
                                    i7 = i19;
                                    drawable = drawableB;
                                    str2 = str11114;
                                    int i3114 = i21;
                                    z4 = z7;
                                    i9 = i3114;
                                    String str11115 = str9;
                                    i11 = i22;
                                    str3 = str11115;
                                    i3 = i15;
                                    i2 = i16;
                                    f = f2;
                                    j5 = j21113;
                                    observableFieldX = observableField;
                                    i10 = i20;
                                    i8 = iB;
                                    drawable2 = drawableB2;
                                    i = i23;
                                    zK0 = z8;
                                    z3 = zK1;
                                    i6 = i18;
                                    z2 = z6;
                                    i5 = i17;
                                    z = z9;
                                    str5 = str8;
                                    str = str6;
                                    i4 = 0;
                                }
                            } else {
                                j10 = j10;
                            }
                            j11 = j10 & 102400;
                            if (j11 != 0) {
                                if (g6Var != null) {
                                    uVarJ0 = g6Var.j0();
                                } else {
                                    uVarJ0 = null;
                                }
                                p1(12, uVarJ0);
                                if (uVarJ0 != null) {
                                    bool3 = (Boolean) uVarJ0.get();
                                } else {
                                    bool3 = null;
                                }
                                zK3 = androidx.databinding.c0.K0(bool3);
                                if (j11 != 0) {
                                    if (zK3) {
                                        j16 = 281474976710656L;
                                    } else {
                                        j16 = 140737488355328L;
                                    }
                                    j10 |= j16;
                                }
                                if (zK3) {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.hn;
                                } else {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.sn;
                                }
                                long j21114 = j10;
                                drawableB2 = g.a.b(context, i25);
                                j12 = j21114;
                            } else {
                                z9 = z9;
                                j12 = j10;
                                drawableB2 = null;
                            }
                            j13 = j12 & 106496;
                            if (j13 != 0) {
                                if (g6Var != null) {
                                    long j21115 = j12;
                                    uVarH0 = g6Var.h0();
                                    j14 = j21115;
                                } else {
                                    j14 = j12;
                                    uVarH0 = null;
                                }
                                p1(13, uVarH0);
                                if (uVarH0 != null) {
                                    bool2 = (Boolean) uVarH0.get();
                                } else {
                                    bool2 = null;
                                }
                                zK2 = androidx.databinding.c0.K0(bool2);
                                if (j13 != 0) {
                                    if (zK2) {
                                        j15 = 72057594037927936L;
                                    } else {
                                        j15 = 36028797018963968L;
                                    }
                                    j14 |= j15;
                                }
                                if (zK2) {
                                    i24 = 0;
                                } else {
                                    i24 = 8;
                                }
                                String str11116 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str11116;
                                int i3115 = i21;
                                z4 = z7;
                                i9 = i3115;
                                String str11117 = str9;
                                i11 = i22;
                                str3 = str11117;
                                i3 = i15;
                                f = f2;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = i24;
                                i2 = i16;
                                j5 = j14;
                            } else {
                                long j21116 = j12;
                                String str11118 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str11118;
                                int i3116 = i21;
                                z4 = z7;
                                i9 = i3116;
                                String str11119 = str9;
                                i11 = i22;
                                str3 = str11119;
                                i3 = i15;
                                i2 = i16;
                                f = f2;
                                j5 = j21116;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = 0;
                            }
                        } else {
                            j8 = j;
                        }
                        j9 = j8 & 98560;
                        if (j9 != 0) {
                            if (g6Var != null) {
                                uVarI0 = g6Var.i0();
                            } else {
                                uVarI0 = null;
                            }
                            p1(8, uVarI0);
                            if (uVarI0 != null) {
                                bool4 = (Boolean) uVarI0.get();
                            } else {
                                bool4 = null;
                            }
                            zK4 = androidx.databinding.c0.K0(bool4);
                            if (j9 != 0) {
                                if (zK4) {
                                    j17 = 274877906944L;
                                } else {
                                    j17 = 137438953472L;
                                }
                                j8 |= j17;
                            }
                            if (zK4) {
                                resources = this.g0.getResources();
                                i26 = com.zentraedi.comic.q.C0124q.dy;
                            } else {
                                resources = this.g0.getResources();
                                i26 = com.zentraedi.comic.q.C0124q.dB;
                            }
                            long j21117 = j8;
                            string = resources.getString(i26);
                            j10 = j21117;
                        } else {
                            str9 = str9;
                            j10 = j8;
                            string = null;
                        }
                        if ((j10 & 98816) != 0) {
                            if (g6Var != null) {
                                wVarU = g6Var.U();
                            } else {
                                wVarU = null;
                            }
                            q1(9, wVarU);
                            if (wVarU != null) {
                                size = wVarU.size();
                            } else {
                                size = 0;
                            }
                            if (size > 0) {
                            }
                            j11 = j10 & 102400;
                            if (j11 != 0) {
                                if (g6Var != null) {
                                    uVarJ0 = g6Var.j0();
                                } else {
                                    uVarJ0 = null;
                                }
                                p1(12, uVarJ0);
                                if (uVarJ0 != null) {
                                    bool3 = (Boolean) uVarJ0.get();
                                } else {
                                    bool3 = null;
                                }
                                zK3 = androidx.databinding.c0.K0(bool3);
                                if (j11 != 0) {
                                    if (zK3) {
                                        j16 = 281474976710656L;
                                    } else {
                                        j16 = 140737488355328L;
                                    }
                                    j10 |= j16;
                                }
                                if (zK3) {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.hn;
                                } else {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.sn;
                                }
                                long j21118 = j10;
                                drawableB2 = g.a.b(context, i25);
                                j12 = j21118;
                            } else {
                                z9 = z9;
                                j12 = j10;
                                drawableB2 = null;
                            }
                            j13 = j12 & 106496;
                            if (j13 != 0) {
                                if (g6Var != null) {
                                    long j21119 = j12;
                                    uVarH0 = g6Var.h0();
                                    j14 = j21119;
                                } else {
                                    j14 = j12;
                                    uVarH0 = null;
                                }
                                p1(13, uVarH0);
                                if (uVarH0 != null) {
                                    bool2 = (Boolean) uVarH0.get();
                                } else {
                                    bool2 = null;
                                }
                                zK2 = androidx.databinding.c0.K0(bool2);
                                if (j13 != 0) {
                                    if (zK2) {
                                        j15 = 72057594037927936L;
                                    } else {
                                        j15 = 36028797018963968L;
                                    }
                                    j14 |= j15;
                                }
                                if (zK2) {
                                    i24 = 0;
                                } else {
                                    i24 = 8;
                                }
                                String str111110 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str111110;
                                int i3117 = i21;
                                z4 = z7;
                                i9 = i3117;
                                String str111111 = str9;
                                i11 = i22;
                                str3 = str111111;
                                i3 = i15;
                                f = f2;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = i24;
                                i2 = i16;
                                j5 = j14;
                            } else {
                                long j211110 = j12;
                                String str111112 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str111112;
                                int i3118 = i21;
                                z4 = z7;
                                i9 = i3118;
                                String str111113 = str9;
                                i11 = i22;
                                str3 = str111113;
                                i3 = i15;
                                i2 = i16;
                                f = f2;
                                j5 = j211110;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = 0;
                            }
                        } else {
                            j10 = j10;
                        }
                        j11 = j10 & 102400;
                        if (j11 != 0) {
                            if (g6Var != null) {
                                uVarJ0 = g6Var.j0();
                            } else {
                                uVarJ0 = null;
                            }
                            p1(12, uVarJ0);
                            if (uVarJ0 != null) {
                                bool3 = (Boolean) uVarJ0.get();
                            } else {
                                bool3 = null;
                            }
                            zK3 = androidx.databinding.c0.K0(bool3);
                            if (j11 != 0) {
                                if (zK3) {
                                    j16 = 281474976710656L;
                                } else {
                                    j16 = 140737488355328L;
                                }
                                j10 |= j16;
                            }
                            if (zK3) {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.hn;
                            } else {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.sn;
                            }
                            long j211111 = j10;
                            drawableB2 = g.a.b(context, i25);
                            j12 = j211111;
                        } else {
                            z9 = z9;
                            j12 = j10;
                            drawableB2 = null;
                        }
                        j13 = j12 & 106496;
                        if (j13 != 0) {
                            if (g6Var != null) {
                                long j211112 = j12;
                                uVarH0 = g6Var.h0();
                                j14 = j211112;
                            } else {
                                j14 = j12;
                                uVarH0 = null;
                            }
                            p1(13, uVarH0);
                            if (uVarH0 != null) {
                                bool2 = (Boolean) uVarH0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j13 != 0) {
                                if (zK2) {
                                    j15 = 72057594037927936L;
                                } else {
                                    j15 = 36028797018963968L;
                                }
                                j14 |= j15;
                            }
                            if (zK2) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            String str111114 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str111114;
                            int i3119 = i21;
                            z4 = z7;
                            i9 = i3119;
                            String str111115 = str9;
                            i11 = i22;
                            str3 = str111115;
                            i3 = i15;
                            f = f2;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = i24;
                            i2 = i16;
                            j5 = j14;
                        } else {
                            long j211113 = j12;
                            String str111116 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str111116;
                            int i31110 = i21;
                            z4 = z7;
                            i9 = i31110;
                            String str111117 = str9;
                            i11 = i22;
                            str3 = str111117;
                            i3 = i15;
                            i2 = i16;
                            f = f2;
                            j5 = j211113;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = 0;
                        }
                    } else {
                        j3 = 34359738368L;
                    }
                    if ((j & 100384) != 0) {
                        if (g6Var != null) {
                            observableFieldG0 = g6Var.g0();
                            observableFieldX2 = g6Var.X();
                        } else {
                            observableFieldG0 = null;
                            observableFieldX2 = null;
                        }
                        j4 = 68719476736L;
                        p1(5, observableFieldG0);
                        p1(11, observableFieldX2);
                        if (observableFieldG0 != null) {
                            bool5 = (Boolean) observableFieldG0.get();
                        } else {
                            bool5 = null;
                        }
                        if (observableFieldX2 != null) {
                            bool6 = (Boolean) observableFieldX2.get();
                        } else {
                            bool6 = null;
                        }
                        zK5 = androidx.databinding.c0.K0(bool5);
                        zK6 = androidx.databinding.c0.K0(bool6);
                        if ((j & 98336) != 0) {
                            if (zK5) {
                                j19 = 22589471024218112L;
                            } else {
                                j19 = 11294735512109056L;
                            }
                            j |= j19;
                        }
                        if ((j & 100384) != 0) {
                            if (zK5) {
                                j18 = 4194304;
                            } else {
                                j18 = 2097152;
                            }
                            j |= j18;
                        }
                        if ((j & 100352) != 0) {
                            if (zK6) {
                                j |= 1125917086711808L;
                            } else {
                                j |= 562958543355904L;
                            }
                        }
                        if ((j & 100384) != 0) {
                            if (zK6) {
                                j |= 68719476736L;
                            } else {
                                j |= j3;
                            }
                        }
                        if ((j & 98336) != 0) {
                            MediumTextView mediumTextView4 = this.P2;
                            if (zK5) {
                                i29 = com.zentraedi.comic.q.f.Ux;
                            } else {
                                i29 = com.zentraedi.comic.q.f.Ud;
                            }
                            iB3 = androidx.databinding.c0.B(mediumTextView4, i29);
                            if (zK5) {
                                iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ux);
                            } else {
                                iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ud);
                            }
                            if (zK5) {
                                i23 = 8;
                            } else {
                                i23 = 0;
                            }
                            if (zK5) {
                                iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ux);
                            } else {
                                iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ud);
                            }
                            if (zK5) {
                                drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.cm);
                            } else {
                                drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.G0);
                            }
                            if (zK5) {
                                iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.qz);
                            } else {
                                iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.Vd);
                            }
                            if (zK5) {
                                i28 = 0;
                            } else {
                                i28 = 8;
                            }
                            i22 = iB5;
                            if (zK5) {
                                textView = this.g0;
                                i30 = com.zentraedi.comic.q.f.Ux;
                            } else {
                                textView = this.g0;
                                i30 = com.zentraedi.comic.q.f.yd;
                            }
                            iB2 = androidx.databinding.c0.B(textView, i30);
                            i27 = iB4;
                        } else {
                            j = j;
                            i27 = 0;
                            iB2 = 0;
                            iB3 = 0;
                            i28 = 0;
                            iB = 0;
                            drawableB = null;
                            i22 = 0;
                            i23 = 0;
                        }
                        if ((j & 100352) == 0) {
                            i21 = 0;
                        } else {
                            if (zK6) {
                                f3 = 0.5f;
                            } else {
                                f3 = 1.0f;
                            }
                            if (zK6) {
                                i21 = 0;
                            } else {
                                i21 = 8;
                            }
                        }
                        int i31111 = iB3;
                        i17 = i27;
                        int i31112 = i28;
                        i18 = iB2;
                        j = j;
                        z8 = zK6;
                        f2 = f3;
                        observableField = observableFieldX2;
                        bool = bool6;
                        i20 = i31112;
                        z7 = zK5;
                        i19 = i31111;
                    } else {
                        j4 = 68719476736L;
                        f2 = 0.0f;
                        i17 = 0;
                        i18 = 0;
                        i19 = 0;
                        i20 = 0;
                        z7 = false;
                        observableField = null;
                        bool = null;
                        z8 = false;
                        i21 = 0;
                        iB = 0;
                        drawableB = null;
                        i22 = 0;
                        i23 = 0;
                    }
                    if ((j & j2) != 0) {
                        if (g6Var != null) {
                            long j2121 = j;
                            uVarB0 = g6Var.b0();
                            j8 = j2121;
                        } else {
                            j8 = j;
                            uVarB0 = null;
                        }
                        p1(7, uVarB0);
                        if (uVarB0 != null) {
                        }
                        j9 = j8 & 98560;
                        if (j9 != 0) {
                            if (g6Var != null) {
                                uVarI0 = g6Var.i0();
                            } else {
                                uVarI0 = null;
                            }
                            p1(8, uVarI0);
                            if (uVarI0 != null) {
                                bool4 = (Boolean) uVarI0.get();
                            } else {
                                bool4 = null;
                            }
                            zK4 = androidx.databinding.c0.K0(bool4);
                            if (j9 != 0) {
                                if (zK4) {
                                    j17 = 274877906944L;
                                } else {
                                    j17 = 137438953472L;
                                }
                                j8 |= j17;
                            }
                            if (zK4) {
                                resources = this.g0.getResources();
                                i26 = com.zentraedi.comic.q.C0124q.dy;
                            } else {
                                resources = this.g0.getResources();
                                i26 = com.zentraedi.comic.q.C0124q.dB;
                            }
                            long j211114 = j8;
                            string = resources.getString(i26);
                            j10 = j211114;
                        } else {
                            str9 = str9;
                            j10 = j8;
                            string = null;
                        }
                        if ((j10 & 98816) != 0) {
                            if (g6Var != null) {
                                wVarU = g6Var.U();
                            } else {
                                wVarU = null;
                            }
                            q1(9, wVarU);
                            if (wVarU != null) {
                                size = wVarU.size();
                            } else {
                                size = 0;
                            }
                            if (size > 0) {
                            }
                            j11 = j10 & 102400;
                            if (j11 != 0) {
                                if (g6Var != null) {
                                    uVarJ0 = g6Var.j0();
                                } else {
                                    uVarJ0 = null;
                                }
                                p1(12, uVarJ0);
                                if (uVarJ0 != null) {
                                    bool3 = (Boolean) uVarJ0.get();
                                } else {
                                    bool3 = null;
                                }
                                zK3 = androidx.databinding.c0.K0(bool3);
                                if (j11 != 0) {
                                    if (zK3) {
                                        j16 = 281474976710656L;
                                    } else {
                                        j16 = 140737488355328L;
                                    }
                                    j10 |= j16;
                                }
                                if (zK3) {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.hn;
                                } else {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.sn;
                                }
                                long j211115 = j10;
                                drawableB2 = g.a.b(context, i25);
                                j12 = j211115;
                            } else {
                                z9 = z9;
                                j12 = j10;
                                drawableB2 = null;
                            }
                            j13 = j12 & 106496;
                            if (j13 != 0) {
                                if (g6Var != null) {
                                    long j211116 = j12;
                                    uVarH0 = g6Var.h0();
                                    j14 = j211116;
                                } else {
                                    j14 = j12;
                                    uVarH0 = null;
                                }
                                p1(13, uVarH0);
                                if (uVarH0 != null) {
                                    bool2 = (Boolean) uVarH0.get();
                                } else {
                                    bool2 = null;
                                }
                                zK2 = androidx.databinding.c0.K0(bool2);
                                if (j13 != 0) {
                                    if (zK2) {
                                        j15 = 72057594037927936L;
                                    } else {
                                        j15 = 36028797018963968L;
                                    }
                                    j14 |= j15;
                                }
                                if (zK2) {
                                    i24 = 0;
                                } else {
                                    i24 = 8;
                                }
                                String str111118 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str111118;
                                int i31113 = i21;
                                z4 = z7;
                                i9 = i31113;
                                String str111119 = str9;
                                i11 = i22;
                                str3 = str111119;
                                i3 = i15;
                                f = f2;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = i24;
                                i2 = i16;
                                j5 = j14;
                            } else {
                                long j211117 = j12;
                                String str1111110 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str1111110;
                                int i31114 = i21;
                                z4 = z7;
                                i9 = i31114;
                                String str1111111 = str9;
                                i11 = i22;
                                str3 = str1111111;
                                i3 = i15;
                                i2 = i16;
                                f = f2;
                                j5 = j211117;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = 0;
                            }
                        } else {
                            j10 = j10;
                        }
                        j11 = j10 & 102400;
                        if (j11 != 0) {
                            if (g6Var != null) {
                                uVarJ0 = g6Var.j0();
                            } else {
                                uVarJ0 = null;
                            }
                            p1(12, uVarJ0);
                            if (uVarJ0 != null) {
                                bool3 = (Boolean) uVarJ0.get();
                            } else {
                                bool3 = null;
                            }
                            zK3 = androidx.databinding.c0.K0(bool3);
                            if (j11 != 0) {
                                if (zK3) {
                                    j16 = 281474976710656L;
                                } else {
                                    j16 = 140737488355328L;
                                }
                                j10 |= j16;
                            }
                            if (zK3) {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.hn;
                            } else {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.sn;
                            }
                            long j211118 = j10;
                            drawableB2 = g.a.b(context, i25);
                            j12 = j211118;
                        } else {
                            z9 = z9;
                            j12 = j10;
                            drawableB2 = null;
                        }
                        j13 = j12 & 106496;
                        if (j13 != 0) {
                            if (g6Var != null) {
                                long j211119 = j12;
                                uVarH0 = g6Var.h0();
                                j14 = j211119;
                            } else {
                                j14 = j12;
                                uVarH0 = null;
                            }
                            p1(13, uVarH0);
                            if (uVarH0 != null) {
                                bool2 = (Boolean) uVarH0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j13 != 0) {
                                if (zK2) {
                                    j15 = 72057594037927936L;
                                } else {
                                    j15 = 36028797018963968L;
                                }
                                j14 |= j15;
                            }
                            if (zK2) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            String str1111112 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str1111112;
                            int i31115 = i21;
                            z4 = z7;
                            i9 = i31115;
                            String str1111113 = str9;
                            i11 = i22;
                            str3 = str1111113;
                            i3 = i15;
                            f = f2;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = i24;
                            i2 = i16;
                            j5 = j14;
                        } else {
                            long j2111110 = j12;
                            String str1111114 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str1111114;
                            int i31116 = i21;
                            z4 = z7;
                            i9 = i31116;
                            String str1111115 = str9;
                            i11 = i22;
                            str3 = str1111115;
                            i3 = i15;
                            i2 = i16;
                            f = f2;
                            j5 = j2111110;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = 0;
                        }
                    } else {
                        j8 = j;
                    }
                    j9 = j8 & 98560;
                    if (j9 != 0) {
                        if (g6Var != null) {
                            uVarI0 = g6Var.i0();
                        } else {
                            uVarI0 = null;
                        }
                        p1(8, uVarI0);
                        if (uVarI0 != null) {
                            bool4 = (Boolean) uVarI0.get();
                        } else {
                            bool4 = null;
                        }
                        zK4 = androidx.databinding.c0.K0(bool4);
                        if (j9 != 0) {
                            if (zK4) {
                                j17 = 274877906944L;
                            } else {
                                j17 = 137438953472L;
                            }
                            j8 |= j17;
                        }
                        if (zK4) {
                            resources = this.g0.getResources();
                            i26 = com.zentraedi.comic.q.C0124q.dy;
                        } else {
                            resources = this.g0.getResources();
                            i26 = com.zentraedi.comic.q.C0124q.dB;
                        }
                        long j2111111 = j8;
                        string = resources.getString(i26);
                        j10 = j2111111;
                    } else {
                        str9 = str9;
                        j10 = j8;
                        string = null;
                    }
                    if ((j10 & 98816) != 0) {
                        if (g6Var != null) {
                            wVarU = g6Var.U();
                        } else {
                            wVarU = null;
                        }
                        q1(9, wVarU);
                        if (wVarU != null) {
                            size = wVarU.size();
                        } else {
                            size = 0;
                        }
                        if (size > 0) {
                        }
                        j11 = j10 & 102400;
                        if (j11 != 0) {
                            if (g6Var != null) {
                                uVarJ0 = g6Var.j0();
                            } else {
                                uVarJ0 = null;
                            }
                            p1(12, uVarJ0);
                            if (uVarJ0 != null) {
                                bool3 = (Boolean) uVarJ0.get();
                            } else {
                                bool3 = null;
                            }
                            zK3 = androidx.databinding.c0.K0(bool3);
                            if (j11 != 0) {
                                if (zK3) {
                                    j16 = 281474976710656L;
                                } else {
                                    j16 = 140737488355328L;
                                }
                                j10 |= j16;
                            }
                            if (zK3) {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.hn;
                            } else {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.sn;
                            }
                            long j2111112 = j10;
                            drawableB2 = g.a.b(context, i25);
                            j12 = j2111112;
                        } else {
                            z9 = z9;
                            j12 = j10;
                            drawableB2 = null;
                        }
                        j13 = j12 & 106496;
                        if (j13 != 0) {
                            if (g6Var != null) {
                                long j2111113 = j12;
                                uVarH0 = g6Var.h0();
                                j14 = j2111113;
                            } else {
                                j14 = j12;
                                uVarH0 = null;
                            }
                            p1(13, uVarH0);
                            if (uVarH0 != null) {
                                bool2 = (Boolean) uVarH0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j13 != 0) {
                                if (zK2) {
                                    j15 = 72057594037927936L;
                                } else {
                                    j15 = 36028797018963968L;
                                }
                                j14 |= j15;
                            }
                            if (zK2) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            String str1111116 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str1111116;
                            int i31117 = i21;
                            z4 = z7;
                            i9 = i31117;
                            String str1111117 = str9;
                            i11 = i22;
                            str3 = str1111117;
                            i3 = i15;
                            f = f2;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = i24;
                            i2 = i16;
                            j5 = j14;
                        } else {
                            long j2111114 = j12;
                            String str1111118 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str1111118;
                            int i31118 = i21;
                            z4 = z7;
                            i9 = i31118;
                            String str1111119 = str9;
                            i11 = i22;
                            str3 = str1111119;
                            i3 = i15;
                            i2 = i16;
                            f = f2;
                            j5 = j2111114;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = 0;
                        }
                    } else {
                        j10 = j10;
                    }
                    j11 = j10 & 102400;
                    if (j11 != 0) {
                        if (g6Var != null) {
                            uVarJ0 = g6Var.j0();
                        } else {
                            uVarJ0 = null;
                        }
                        p1(12, uVarJ0);
                        if (uVarJ0 != null) {
                            bool3 = (Boolean) uVarJ0.get();
                        } else {
                            bool3 = null;
                        }
                        zK3 = androidx.databinding.c0.K0(bool3);
                        if (j11 != 0) {
                            if (zK3) {
                                j16 = 281474976710656L;
                            } else {
                                j16 = 140737488355328L;
                            }
                            j10 |= j16;
                        }
                        if (zK3) {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.hn;
                        } else {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.sn;
                        }
                        long j2111115 = j10;
                        drawableB2 = g.a.b(context, i25);
                        j12 = j2111115;
                    } else {
                        z9 = z9;
                        j12 = j10;
                        drawableB2 = null;
                    }
                    j13 = j12 & 106496;
                    if (j13 != 0) {
                        if (g6Var != null) {
                            long j2111116 = j12;
                            uVarH0 = g6Var.h0();
                            j14 = j2111116;
                        } else {
                            j14 = j12;
                            uVarH0 = null;
                        }
                        p1(13, uVarH0);
                        if (uVarH0 != null) {
                            bool2 = (Boolean) uVarH0.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j13 != 0) {
                            if (zK2) {
                                j15 = 72057594037927936L;
                            } else {
                                j15 = 36028797018963968L;
                            }
                            j14 |= j15;
                        }
                        if (zK2) {
                            i24 = 0;
                        } else {
                            i24 = 8;
                        }
                        String str11111110 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str11111110;
                        int i31119 = i21;
                        z4 = z7;
                        i9 = i31119;
                        String str11111111 = str9;
                        i11 = i22;
                        str3 = str11111111;
                        i3 = i15;
                        f = f2;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = i24;
                        i2 = i16;
                        j5 = j14;
                    } else {
                        long j2111117 = j12;
                        String str11111112 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str11111112;
                        int i311110 = i21;
                        z4 = z7;
                        i9 = i311110;
                        String str11111113 = str9;
                        i11 = i22;
                        str3 = str11111113;
                        i3 = i15;
                        i2 = i16;
                        f = f2;
                        j5 = j2111117;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = 0;
                    }
                }
                i16 = 0;
                if ((j & 98308) != 0) {
                    if (g6Var != null) {
                        title = g6Var.getTitle();
                    } else {
                        title = null;
                    }
                    j2 = 98432;
                    p1(2, title);
                    if (title != null) {
                    }
                    if ((j & 98312) == 0) {
                        str7 = null;
                    } else {
                        if (g6Var != null) {
                            observableFieldF0 = g6Var.f0();
                        } else {
                            observableFieldF0 = null;
                        }
                        p1(3, observableFieldF0);
                        if (observableFieldF0 != null) {
                            str7 = (String) observableFieldF0.get();
                        } else {
                            str7 = null;
                        }
                    }
                    if ((j & 98320) != 0) {
                        if (g6Var != null) {
                            observableFieldZ = g6Var.Z();
                        } else {
                            observableFieldZ = null;
                        }
                        j3 = 34359738368L;
                        p1(4, observableFieldZ);
                        if (observableFieldZ != null) {
                        }
                        if ((j & 100384) != 0) {
                            if (g6Var != null) {
                                observableFieldG0 = g6Var.g0();
                                observableFieldX2 = g6Var.X();
                            } else {
                                observableFieldG0 = null;
                                observableFieldX2 = null;
                            }
                            j4 = 68719476736L;
                            p1(5, observableFieldG0);
                            p1(11, observableFieldX2);
                            if (observableFieldG0 != null) {
                                bool5 = (Boolean) observableFieldG0.get();
                            } else {
                                bool5 = null;
                            }
                            if (observableFieldX2 != null) {
                                bool6 = (Boolean) observableFieldX2.get();
                            } else {
                                bool6 = null;
                            }
                            zK5 = androidx.databinding.c0.K0(bool5);
                            zK6 = androidx.databinding.c0.K0(bool6);
                            if ((j & 98336) != 0) {
                                if (zK5) {
                                    j19 = 22589471024218112L;
                                } else {
                                    j19 = 11294735512109056L;
                                }
                                j |= j19;
                            }
                            if ((j & 100384) != 0) {
                                if (zK5) {
                                    j18 = 4194304;
                                } else {
                                    j18 = 2097152;
                                }
                                j |= j18;
                            }
                            if ((j & 100352) != 0) {
                                if (zK6) {
                                    j |= 1125917086711808L;
                                } else {
                                    j |= 562958543355904L;
                                }
                            }
                            if ((j & 100384) != 0) {
                                if (zK6) {
                                    j |= 68719476736L;
                                } else {
                                    j |= j3;
                                }
                            }
                            if ((j & 98336) != 0) {
                                MediumTextView mediumTextView5 = this.P2;
                                if (zK5) {
                                    i29 = com.zentraedi.comic.q.f.Ux;
                                } else {
                                    i29 = com.zentraedi.comic.q.f.Ud;
                                }
                                iB3 = androidx.databinding.c0.B(mediumTextView5, i29);
                                if (zK5) {
                                    iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ux);
                                } else {
                                    iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ud);
                                }
                                if (zK5) {
                                    i23 = 8;
                                } else {
                                    i23 = 0;
                                }
                                if (zK5) {
                                    iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ux);
                                } else {
                                    iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ud);
                                }
                                if (zK5) {
                                    drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.cm);
                                } else {
                                    drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.G0);
                                }
                                if (zK5) {
                                    iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.qz);
                                } else {
                                    iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.Vd);
                                }
                                if (zK5) {
                                    i28 = 0;
                                } else {
                                    i28 = 8;
                                }
                                i22 = iB5;
                                if (zK5) {
                                    textView = this.g0;
                                    i30 = com.zentraedi.comic.q.f.Ux;
                                } else {
                                    textView = this.g0;
                                    i30 = com.zentraedi.comic.q.f.yd;
                                }
                                iB2 = androidx.databinding.c0.B(textView, i30);
                                i27 = iB4;
                            } else {
                                j = j;
                                i27 = 0;
                                iB2 = 0;
                                iB3 = 0;
                                i28 = 0;
                                iB = 0;
                                drawableB = null;
                                i22 = 0;
                                i23 = 0;
                            }
                            if ((j & 100352) == 0) {
                                i21 = 0;
                            } else {
                                if (zK6) {
                                    f3 = 0.5f;
                                } else {
                                    f3 = 1.0f;
                                }
                                if (zK6) {
                                    i21 = 0;
                                } else {
                                    i21 = 8;
                                }
                            }
                            int i311111 = iB3;
                            i17 = i27;
                            int i311112 = i28;
                            i18 = iB2;
                            j = j;
                            z8 = zK6;
                            f2 = f3;
                            observableField = observableFieldX2;
                            bool = bool6;
                            i20 = i311112;
                            z7 = zK5;
                            i19 = i311111;
                        } else {
                            j4 = 68719476736L;
                            f2 = 0.0f;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            i20 = 0;
                            z7 = false;
                            observableField = null;
                            bool = null;
                            z8 = false;
                            i21 = 0;
                            iB = 0;
                            drawableB = null;
                            i22 = 0;
                            i23 = 0;
                        }
                        if ((j & j2) != 0) {
                            if (g6Var != null) {
                                long j2122 = j;
                                uVarB0 = g6Var.b0();
                                j8 = j2122;
                            } else {
                                j8 = j;
                                uVarB0 = null;
                            }
                            p1(7, uVarB0);
                            if (uVarB0 != null) {
                            }
                            j9 = j8 & 98560;
                            if (j9 != 0) {
                                if (g6Var != null) {
                                    uVarI0 = g6Var.i0();
                                } else {
                                    uVarI0 = null;
                                }
                                p1(8, uVarI0);
                                if (uVarI0 != null) {
                                    bool4 = (Boolean) uVarI0.get();
                                } else {
                                    bool4 = null;
                                }
                                zK4 = androidx.databinding.c0.K0(bool4);
                                if (j9 != 0) {
                                    if (zK4) {
                                        j17 = 274877906944L;
                                    } else {
                                        j17 = 137438953472L;
                                    }
                                    j8 |= j17;
                                }
                                if (zK4) {
                                    resources = this.g0.getResources();
                                    i26 = com.zentraedi.comic.q.C0124q.dy;
                                } else {
                                    resources = this.g0.getResources();
                                    i26 = com.zentraedi.comic.q.C0124q.dB;
                                }
                                long j2111118 = j8;
                                string = resources.getString(i26);
                                j10 = j2111118;
                            } else {
                                str9 = str9;
                                j10 = j8;
                                string = null;
                            }
                            if ((j10 & 98816) != 0) {
                                if (g6Var != null) {
                                    wVarU = g6Var.U();
                                } else {
                                    wVarU = null;
                                }
                                q1(9, wVarU);
                                if (wVarU != null) {
                                    size = wVarU.size();
                                } else {
                                    size = 0;
                                }
                                if (size > 0) {
                                }
                                j11 = j10 & 102400;
                                if (j11 != 0) {
                                    if (g6Var != null) {
                                        uVarJ0 = g6Var.j0();
                                    } else {
                                        uVarJ0 = null;
                                    }
                                    p1(12, uVarJ0);
                                    if (uVarJ0 != null) {
                                        bool3 = (Boolean) uVarJ0.get();
                                    } else {
                                        bool3 = null;
                                    }
                                    zK3 = androidx.databinding.c0.K0(bool3);
                                    if (j11 != 0) {
                                        if (zK3) {
                                            j16 = 281474976710656L;
                                        } else {
                                            j16 = 140737488355328L;
                                        }
                                        j10 |= j16;
                                    }
                                    if (zK3) {
                                        context = this.h0.getContext();
                                        i25 = com.zentraedi.comic.q.h.hn;
                                    } else {
                                        context = this.h0.getContext();
                                        i25 = com.zentraedi.comic.q.h.sn;
                                    }
                                    long j2111119 = j10;
                                    drawableB2 = g.a.b(context, i25);
                                    j12 = j2111119;
                                } else {
                                    z9 = z9;
                                    j12 = j10;
                                    drawableB2 = null;
                                }
                                j13 = j12 & 106496;
                                if (j13 != 0) {
                                    if (g6Var != null) {
                                        long j21111110 = j12;
                                        uVarH0 = g6Var.h0();
                                        j14 = j21111110;
                                    } else {
                                        j14 = j12;
                                        uVarH0 = null;
                                    }
                                    p1(13, uVarH0);
                                    if (uVarH0 != null) {
                                        bool2 = (Boolean) uVarH0.get();
                                    } else {
                                        bool2 = null;
                                    }
                                    zK2 = androidx.databinding.c0.K0(bool2);
                                    if (j13 != 0) {
                                        if (zK2) {
                                            j15 = 72057594037927936L;
                                        } else {
                                            j15 = 36028797018963968L;
                                        }
                                        j14 |= j15;
                                    }
                                    if (zK2) {
                                        i24 = 0;
                                    } else {
                                        i24 = 8;
                                    }
                                    String str11111114 = string;
                                    str4 = str7;
                                    i7 = i19;
                                    drawable = drawableB;
                                    str2 = str11111114;
                                    int i311113 = i21;
                                    z4 = z7;
                                    i9 = i311113;
                                    String str11111115 = str9;
                                    i11 = i22;
                                    str3 = str11111115;
                                    i3 = i15;
                                    f = f2;
                                    observableFieldX = observableField;
                                    i10 = i20;
                                    i8 = iB;
                                    drawable2 = drawableB2;
                                    i = i23;
                                    zK0 = z8;
                                    z3 = zK1;
                                    i6 = i18;
                                    z2 = z6;
                                    i5 = i17;
                                    z = z9;
                                    str5 = str8;
                                    str = str6;
                                    i4 = i24;
                                    i2 = i16;
                                    j5 = j14;
                                } else {
                                    long j21111111 = j12;
                                    String str11111116 = string;
                                    str4 = str7;
                                    i7 = i19;
                                    drawable = drawableB;
                                    str2 = str11111116;
                                    int i311114 = i21;
                                    z4 = z7;
                                    i9 = i311114;
                                    String str11111117 = str9;
                                    i11 = i22;
                                    str3 = str11111117;
                                    i3 = i15;
                                    i2 = i16;
                                    f = f2;
                                    j5 = j21111111;
                                    observableFieldX = observableField;
                                    i10 = i20;
                                    i8 = iB;
                                    drawable2 = drawableB2;
                                    i = i23;
                                    zK0 = z8;
                                    z3 = zK1;
                                    i6 = i18;
                                    z2 = z6;
                                    i5 = i17;
                                    z = z9;
                                    str5 = str8;
                                    str = str6;
                                    i4 = 0;
                                }
                            } else {
                                j10 = j10;
                            }
                            j11 = j10 & 102400;
                            if (j11 != 0) {
                                if (g6Var != null) {
                                    uVarJ0 = g6Var.j0();
                                } else {
                                    uVarJ0 = null;
                                }
                                p1(12, uVarJ0);
                                if (uVarJ0 != null) {
                                    bool3 = (Boolean) uVarJ0.get();
                                } else {
                                    bool3 = null;
                                }
                                zK3 = androidx.databinding.c0.K0(bool3);
                                if (j11 != 0) {
                                    if (zK3) {
                                        j16 = 281474976710656L;
                                    } else {
                                        j16 = 140737488355328L;
                                    }
                                    j10 |= j16;
                                }
                                if (zK3) {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.hn;
                                } else {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.sn;
                                }
                                long j21111112 = j10;
                                drawableB2 = g.a.b(context, i25);
                                j12 = j21111112;
                            } else {
                                z9 = z9;
                                j12 = j10;
                                drawableB2 = null;
                            }
                            j13 = j12 & 106496;
                            if (j13 != 0) {
                                if (g6Var != null) {
                                    long j21111113 = j12;
                                    uVarH0 = g6Var.h0();
                                    j14 = j21111113;
                                } else {
                                    j14 = j12;
                                    uVarH0 = null;
                                }
                                p1(13, uVarH0);
                                if (uVarH0 != null) {
                                    bool2 = (Boolean) uVarH0.get();
                                } else {
                                    bool2 = null;
                                }
                                zK2 = androidx.databinding.c0.K0(bool2);
                                if (j13 != 0) {
                                    if (zK2) {
                                        j15 = 72057594037927936L;
                                    } else {
                                        j15 = 36028797018963968L;
                                    }
                                    j14 |= j15;
                                }
                                if (zK2) {
                                    i24 = 0;
                                } else {
                                    i24 = 8;
                                }
                                String str11111118 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str11111118;
                                int i311115 = i21;
                                z4 = z7;
                                i9 = i311115;
                                String str11111119 = str9;
                                i11 = i22;
                                str3 = str11111119;
                                i3 = i15;
                                f = f2;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = i24;
                                i2 = i16;
                                j5 = j14;
                            } else {
                                long j21111114 = j12;
                                String str111111110 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str111111110;
                                int i311116 = i21;
                                z4 = z7;
                                i9 = i311116;
                                String str111111111 = str9;
                                i11 = i22;
                                str3 = str111111111;
                                i3 = i15;
                                i2 = i16;
                                f = f2;
                                j5 = j21111114;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = 0;
                            }
                        } else {
                            j8 = j;
                        }
                        j9 = j8 & 98560;
                        if (j9 != 0) {
                            if (g6Var != null) {
                                uVarI0 = g6Var.i0();
                            } else {
                                uVarI0 = null;
                            }
                            p1(8, uVarI0);
                            if (uVarI0 != null) {
                                bool4 = (Boolean) uVarI0.get();
                            } else {
                                bool4 = null;
                            }
                            zK4 = androidx.databinding.c0.K0(bool4);
                            if (j9 != 0) {
                                if (zK4) {
                                    j17 = 274877906944L;
                                } else {
                                    j17 = 137438953472L;
                                }
                                j8 |= j17;
                            }
                            if (zK4) {
                                resources = this.g0.getResources();
                                i26 = com.zentraedi.comic.q.C0124q.dy;
                            } else {
                                resources = this.g0.getResources();
                                i26 = com.zentraedi.comic.q.C0124q.dB;
                            }
                            long j21111115 = j8;
                            string = resources.getString(i26);
                            j10 = j21111115;
                        } else {
                            str9 = str9;
                            j10 = j8;
                            string = null;
                        }
                        if ((j10 & 98816) != 0) {
                            if (g6Var != null) {
                                wVarU = g6Var.U();
                            } else {
                                wVarU = null;
                            }
                            q1(9, wVarU);
                            if (wVarU != null) {
                                size = wVarU.size();
                            } else {
                                size = 0;
                            }
                            if (size > 0) {
                            }
                            j11 = j10 & 102400;
                            if (j11 != 0) {
                                if (g6Var != null) {
                                    uVarJ0 = g6Var.j0();
                                } else {
                                    uVarJ0 = null;
                                }
                                p1(12, uVarJ0);
                                if (uVarJ0 != null) {
                                    bool3 = (Boolean) uVarJ0.get();
                                } else {
                                    bool3 = null;
                                }
                                zK3 = androidx.databinding.c0.K0(bool3);
                                if (j11 != 0) {
                                    if (zK3) {
                                        j16 = 281474976710656L;
                                    } else {
                                        j16 = 140737488355328L;
                                    }
                                    j10 |= j16;
                                }
                                if (zK3) {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.hn;
                                } else {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.sn;
                                }
                                long j21111116 = j10;
                                drawableB2 = g.a.b(context, i25);
                                j12 = j21111116;
                            } else {
                                z9 = z9;
                                j12 = j10;
                                drawableB2 = null;
                            }
                            j13 = j12 & 106496;
                            if (j13 != 0) {
                                if (g6Var != null) {
                                    long j21111117 = j12;
                                    uVarH0 = g6Var.h0();
                                    j14 = j21111117;
                                } else {
                                    j14 = j12;
                                    uVarH0 = null;
                                }
                                p1(13, uVarH0);
                                if (uVarH0 != null) {
                                    bool2 = (Boolean) uVarH0.get();
                                } else {
                                    bool2 = null;
                                }
                                zK2 = androidx.databinding.c0.K0(bool2);
                                if (j13 != 0) {
                                    if (zK2) {
                                        j15 = 72057594037927936L;
                                    } else {
                                        j15 = 36028797018963968L;
                                    }
                                    j14 |= j15;
                                }
                                if (zK2) {
                                    i24 = 0;
                                } else {
                                    i24 = 8;
                                }
                                String str111111112 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str111111112;
                                int i311117 = i21;
                                z4 = z7;
                                i9 = i311117;
                                String str111111113 = str9;
                                i11 = i22;
                                str3 = str111111113;
                                i3 = i15;
                                f = f2;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = i24;
                                i2 = i16;
                                j5 = j14;
                            } else {
                                long j21111118 = j12;
                                String str111111114 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str111111114;
                                int i311118 = i21;
                                z4 = z7;
                                i9 = i311118;
                                String str111111115 = str9;
                                i11 = i22;
                                str3 = str111111115;
                                i3 = i15;
                                i2 = i16;
                                f = f2;
                                j5 = j21111118;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = 0;
                            }
                        } else {
                            j10 = j10;
                        }
                        j11 = j10 & 102400;
                        if (j11 != 0) {
                            if (g6Var != null) {
                                uVarJ0 = g6Var.j0();
                            } else {
                                uVarJ0 = null;
                            }
                            p1(12, uVarJ0);
                            if (uVarJ0 != null) {
                                bool3 = (Boolean) uVarJ0.get();
                            } else {
                                bool3 = null;
                            }
                            zK3 = androidx.databinding.c0.K0(bool3);
                            if (j11 != 0) {
                                if (zK3) {
                                    j16 = 281474976710656L;
                                } else {
                                    j16 = 140737488355328L;
                                }
                                j10 |= j16;
                            }
                            if (zK3) {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.hn;
                            } else {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.sn;
                            }
                            long j21111119 = j10;
                            drawableB2 = g.a.b(context, i25);
                            j12 = j21111119;
                        } else {
                            z9 = z9;
                            j12 = j10;
                            drawableB2 = null;
                        }
                        j13 = j12 & 106496;
                        if (j13 != 0) {
                            if (g6Var != null) {
                                long j211111110 = j12;
                                uVarH0 = g6Var.h0();
                                j14 = j211111110;
                            } else {
                                j14 = j12;
                                uVarH0 = null;
                            }
                            p1(13, uVarH0);
                            if (uVarH0 != null) {
                                bool2 = (Boolean) uVarH0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j13 != 0) {
                                if (zK2) {
                                    j15 = 72057594037927936L;
                                } else {
                                    j15 = 36028797018963968L;
                                }
                                j14 |= j15;
                            }
                            if (zK2) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            String str111111116 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str111111116;
                            int i311119 = i21;
                            z4 = z7;
                            i9 = i311119;
                            String str111111117 = str9;
                            i11 = i22;
                            str3 = str111111117;
                            i3 = i15;
                            f = f2;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = i24;
                            i2 = i16;
                            j5 = j14;
                        } else {
                            long j211111111 = j12;
                            String str111111118 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str111111118;
                            int i3111110 = i21;
                            z4 = z7;
                            i9 = i3111110;
                            String str111111119 = str9;
                            i11 = i22;
                            str3 = str111111119;
                            i3 = i15;
                            i2 = i16;
                            f = f2;
                            j5 = j211111111;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = 0;
                        }
                    } else {
                        j3 = 34359738368L;
                    }
                    if ((j & 100384) != 0) {
                        if (g6Var != null) {
                            observableFieldG0 = g6Var.g0();
                            observableFieldX2 = g6Var.X();
                        } else {
                            observableFieldG0 = null;
                            observableFieldX2 = null;
                        }
                        j4 = 68719476736L;
                        p1(5, observableFieldG0);
                        p1(11, observableFieldX2);
                        if (observableFieldG0 != null) {
                            bool5 = (Boolean) observableFieldG0.get();
                        } else {
                            bool5 = null;
                        }
                        if (observableFieldX2 != null) {
                            bool6 = (Boolean) observableFieldX2.get();
                        } else {
                            bool6 = null;
                        }
                        zK5 = androidx.databinding.c0.K0(bool5);
                        zK6 = androidx.databinding.c0.K0(bool6);
                        if ((j & 98336) != 0) {
                            if (zK5) {
                                j19 = 22589471024218112L;
                            } else {
                                j19 = 11294735512109056L;
                            }
                            j |= j19;
                        }
                        if ((j & 100384) != 0) {
                            if (zK5) {
                                j18 = 4194304;
                            } else {
                                j18 = 2097152;
                            }
                            j |= j18;
                        }
                        if ((j & 100352) != 0) {
                            if (zK6) {
                                j |= 1125917086711808L;
                            } else {
                                j |= 562958543355904L;
                            }
                        }
                        if ((j & 100384) != 0) {
                            if (zK6) {
                                j |= 68719476736L;
                            } else {
                                j |= j3;
                            }
                        }
                        if ((j & 98336) != 0) {
                            MediumTextView mediumTextView6 = this.P2;
                            if (zK5) {
                                i29 = com.zentraedi.comic.q.f.Ux;
                            } else {
                                i29 = com.zentraedi.comic.q.f.Ud;
                            }
                            iB3 = androidx.databinding.c0.B(mediumTextView6, i29);
                            if (zK5) {
                                iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ux);
                            } else {
                                iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ud);
                            }
                            if (zK5) {
                                i23 = 8;
                            } else {
                                i23 = 0;
                            }
                            if (zK5) {
                                iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ux);
                            } else {
                                iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ud);
                            }
                            if (zK5) {
                                drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.cm);
                            } else {
                                drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.G0);
                            }
                            if (zK5) {
                                iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.qz);
                            } else {
                                iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.Vd);
                            }
                            if (zK5) {
                                i28 = 0;
                            } else {
                                i28 = 8;
                            }
                            i22 = iB5;
                            if (zK5) {
                                textView = this.g0;
                                i30 = com.zentraedi.comic.q.f.Ux;
                            } else {
                                textView = this.g0;
                                i30 = com.zentraedi.comic.q.f.yd;
                            }
                            iB2 = androidx.databinding.c0.B(textView, i30);
                            i27 = iB4;
                        } else {
                            j = j;
                            i27 = 0;
                            iB2 = 0;
                            iB3 = 0;
                            i28 = 0;
                            iB = 0;
                            drawableB = null;
                            i22 = 0;
                            i23 = 0;
                        }
                        if ((j & 100352) == 0) {
                            i21 = 0;
                        } else {
                            if (zK6) {
                                f3 = 0.5f;
                            } else {
                                f3 = 1.0f;
                            }
                            if (zK6) {
                                i21 = 0;
                            } else {
                                i21 = 8;
                            }
                        }
                        int i3111111 = iB3;
                        i17 = i27;
                        int i3111112 = i28;
                        i18 = iB2;
                        j = j;
                        z8 = zK6;
                        f2 = f3;
                        observableField = observableFieldX2;
                        bool = bool6;
                        i20 = i3111112;
                        z7 = zK5;
                        i19 = i3111111;
                    } else {
                        j4 = 68719476736L;
                        f2 = 0.0f;
                        i17 = 0;
                        i18 = 0;
                        i19 = 0;
                        i20 = 0;
                        z7 = false;
                        observableField = null;
                        bool = null;
                        z8 = false;
                        i21 = 0;
                        iB = 0;
                        drawableB = null;
                        i22 = 0;
                        i23 = 0;
                    }
                    if ((j & j2) != 0) {
                        if (g6Var != null) {
                            long j2123 = j;
                            uVarB0 = g6Var.b0();
                            j8 = j2123;
                        } else {
                            j8 = j;
                            uVarB0 = null;
                        }
                        p1(7, uVarB0);
                        if (uVarB0 != null) {
                        }
                        j9 = j8 & 98560;
                        if (j9 != 0) {
                            if (g6Var != null) {
                                uVarI0 = g6Var.i0();
                            } else {
                                uVarI0 = null;
                            }
                            p1(8, uVarI0);
                            if (uVarI0 != null) {
                                bool4 = (Boolean) uVarI0.get();
                            } else {
                                bool4 = null;
                            }
                            zK4 = androidx.databinding.c0.K0(bool4);
                            if (j9 != 0) {
                                if (zK4) {
                                    j17 = 274877906944L;
                                } else {
                                    j17 = 137438953472L;
                                }
                                j8 |= j17;
                            }
                            if (zK4) {
                                resources = this.g0.getResources();
                                i26 = com.zentraedi.comic.q.C0124q.dy;
                            } else {
                                resources = this.g0.getResources();
                                i26 = com.zentraedi.comic.q.C0124q.dB;
                            }
                            long j211111112 = j8;
                            string = resources.getString(i26);
                            j10 = j211111112;
                        } else {
                            str9 = str9;
                            j10 = j8;
                            string = null;
                        }
                        if ((j10 & 98816) != 0) {
                            if (g6Var != null) {
                                wVarU = g6Var.U();
                            } else {
                                wVarU = null;
                            }
                            q1(9, wVarU);
                            if (wVarU != null) {
                                size = wVarU.size();
                            } else {
                                size = 0;
                            }
                            if (size > 0) {
                            }
                            j11 = j10 & 102400;
                            if (j11 != 0) {
                                if (g6Var != null) {
                                    uVarJ0 = g6Var.j0();
                                } else {
                                    uVarJ0 = null;
                                }
                                p1(12, uVarJ0);
                                if (uVarJ0 != null) {
                                    bool3 = (Boolean) uVarJ0.get();
                                } else {
                                    bool3 = null;
                                }
                                zK3 = androidx.databinding.c0.K0(bool3);
                                if (j11 != 0) {
                                    if (zK3) {
                                        j16 = 281474976710656L;
                                    } else {
                                        j16 = 140737488355328L;
                                    }
                                    j10 |= j16;
                                }
                                if (zK3) {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.hn;
                                } else {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.sn;
                                }
                                long j211111113 = j10;
                                drawableB2 = g.a.b(context, i25);
                                j12 = j211111113;
                            } else {
                                z9 = z9;
                                j12 = j10;
                                drawableB2 = null;
                            }
                            j13 = j12 & 106496;
                            if (j13 != 0) {
                                if (g6Var != null) {
                                    long j211111114 = j12;
                                    uVarH0 = g6Var.h0();
                                    j14 = j211111114;
                                } else {
                                    j14 = j12;
                                    uVarH0 = null;
                                }
                                p1(13, uVarH0);
                                if (uVarH0 != null) {
                                    bool2 = (Boolean) uVarH0.get();
                                } else {
                                    bool2 = null;
                                }
                                zK2 = androidx.databinding.c0.K0(bool2);
                                if (j13 != 0) {
                                    if (zK2) {
                                        j15 = 72057594037927936L;
                                    } else {
                                        j15 = 36028797018963968L;
                                    }
                                    j14 |= j15;
                                }
                                if (zK2) {
                                    i24 = 0;
                                } else {
                                    i24 = 8;
                                }
                                String str1111111110 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str1111111110;
                                int i3111113 = i21;
                                z4 = z7;
                                i9 = i3111113;
                                String str1111111111 = str9;
                                i11 = i22;
                                str3 = str1111111111;
                                i3 = i15;
                                f = f2;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = i24;
                                i2 = i16;
                                j5 = j14;
                            } else {
                                long j211111115 = j12;
                                String str1111111112 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str1111111112;
                                int i3111114 = i21;
                                z4 = z7;
                                i9 = i3111114;
                                String str1111111113 = str9;
                                i11 = i22;
                                str3 = str1111111113;
                                i3 = i15;
                                i2 = i16;
                                f = f2;
                                j5 = j211111115;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = 0;
                            }
                        } else {
                            j10 = j10;
                        }
                        j11 = j10 & 102400;
                        if (j11 != 0) {
                            if (g6Var != null) {
                                uVarJ0 = g6Var.j0();
                            } else {
                                uVarJ0 = null;
                            }
                            p1(12, uVarJ0);
                            if (uVarJ0 != null) {
                                bool3 = (Boolean) uVarJ0.get();
                            } else {
                                bool3 = null;
                            }
                            zK3 = androidx.databinding.c0.K0(bool3);
                            if (j11 != 0) {
                                if (zK3) {
                                    j16 = 281474976710656L;
                                } else {
                                    j16 = 140737488355328L;
                                }
                                j10 |= j16;
                            }
                            if (zK3) {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.hn;
                            } else {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.sn;
                            }
                            long j211111116 = j10;
                            drawableB2 = g.a.b(context, i25);
                            j12 = j211111116;
                        } else {
                            z9 = z9;
                            j12 = j10;
                            drawableB2 = null;
                        }
                        j13 = j12 & 106496;
                        if (j13 != 0) {
                            if (g6Var != null) {
                                long j211111117 = j12;
                                uVarH0 = g6Var.h0();
                                j14 = j211111117;
                            } else {
                                j14 = j12;
                                uVarH0 = null;
                            }
                            p1(13, uVarH0);
                            if (uVarH0 != null) {
                                bool2 = (Boolean) uVarH0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j13 != 0) {
                                if (zK2) {
                                    j15 = 72057594037927936L;
                                } else {
                                    j15 = 36028797018963968L;
                                }
                                j14 |= j15;
                            }
                            if (zK2) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            String str1111111114 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str1111111114;
                            int i3111115 = i21;
                            z4 = z7;
                            i9 = i3111115;
                            String str1111111115 = str9;
                            i11 = i22;
                            str3 = str1111111115;
                            i3 = i15;
                            f = f2;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = i24;
                            i2 = i16;
                            j5 = j14;
                        } else {
                            long j211111118 = j12;
                            String str1111111116 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str1111111116;
                            int i3111116 = i21;
                            z4 = z7;
                            i9 = i3111116;
                            String str1111111117 = str9;
                            i11 = i22;
                            str3 = str1111111117;
                            i3 = i15;
                            i2 = i16;
                            f = f2;
                            j5 = j211111118;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = 0;
                        }
                    } else {
                        j8 = j;
                    }
                    j9 = j8 & 98560;
                    if (j9 != 0) {
                        if (g6Var != null) {
                            uVarI0 = g6Var.i0();
                        } else {
                            uVarI0 = null;
                        }
                        p1(8, uVarI0);
                        if (uVarI0 != null) {
                            bool4 = (Boolean) uVarI0.get();
                        } else {
                            bool4 = null;
                        }
                        zK4 = androidx.databinding.c0.K0(bool4);
                        if (j9 != 0) {
                            if (zK4) {
                                j17 = 274877906944L;
                            } else {
                                j17 = 137438953472L;
                            }
                            j8 |= j17;
                        }
                        if (zK4) {
                            resources = this.g0.getResources();
                            i26 = com.zentraedi.comic.q.C0124q.dy;
                        } else {
                            resources = this.g0.getResources();
                            i26 = com.zentraedi.comic.q.C0124q.dB;
                        }
                        long j211111119 = j8;
                        string = resources.getString(i26);
                        j10 = j211111119;
                    } else {
                        str9 = str9;
                        j10 = j8;
                        string = null;
                    }
                    if ((j10 & 98816) != 0) {
                        if (g6Var != null) {
                            wVarU = g6Var.U();
                        } else {
                            wVarU = null;
                        }
                        q1(9, wVarU);
                        if (wVarU != null) {
                            size = wVarU.size();
                        } else {
                            size = 0;
                        }
                        if (size > 0) {
                        }
                        j11 = j10 & 102400;
                        if (j11 != 0) {
                            if (g6Var != null) {
                                uVarJ0 = g6Var.j0();
                            } else {
                                uVarJ0 = null;
                            }
                            p1(12, uVarJ0);
                            if (uVarJ0 != null) {
                                bool3 = (Boolean) uVarJ0.get();
                            } else {
                                bool3 = null;
                            }
                            zK3 = androidx.databinding.c0.K0(bool3);
                            if (j11 != 0) {
                                if (zK3) {
                                    j16 = 281474976710656L;
                                } else {
                                    j16 = 140737488355328L;
                                }
                                j10 |= j16;
                            }
                            if (zK3) {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.hn;
                            } else {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.sn;
                            }
                            long j2111111110 = j10;
                            drawableB2 = g.a.b(context, i25);
                            j12 = j2111111110;
                        } else {
                            z9 = z9;
                            j12 = j10;
                            drawableB2 = null;
                        }
                        j13 = j12 & 106496;
                        if (j13 != 0) {
                            if (g6Var != null) {
                                long j2111111111 = j12;
                                uVarH0 = g6Var.h0();
                                j14 = j2111111111;
                            } else {
                                j14 = j12;
                                uVarH0 = null;
                            }
                            p1(13, uVarH0);
                            if (uVarH0 != null) {
                                bool2 = (Boolean) uVarH0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j13 != 0) {
                                if (zK2) {
                                    j15 = 72057594037927936L;
                                } else {
                                    j15 = 36028797018963968L;
                                }
                                j14 |= j15;
                            }
                            if (zK2) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            String str1111111118 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str1111111118;
                            int i3111117 = i21;
                            z4 = z7;
                            i9 = i3111117;
                            String str1111111119 = str9;
                            i11 = i22;
                            str3 = str1111111119;
                            i3 = i15;
                            f = f2;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = i24;
                            i2 = i16;
                            j5 = j14;
                        } else {
                            long j2111111112 = j12;
                            String str11111111110 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str11111111110;
                            int i3111118 = i21;
                            z4 = z7;
                            i9 = i3111118;
                            String str11111111111 = str9;
                            i11 = i22;
                            str3 = str11111111111;
                            i3 = i15;
                            i2 = i16;
                            f = f2;
                            j5 = j2111111112;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = 0;
                        }
                    } else {
                        j10 = j10;
                    }
                    j11 = j10 & 102400;
                    if (j11 != 0) {
                        if (g6Var != null) {
                            uVarJ0 = g6Var.j0();
                        } else {
                            uVarJ0 = null;
                        }
                        p1(12, uVarJ0);
                        if (uVarJ0 != null) {
                            bool3 = (Boolean) uVarJ0.get();
                        } else {
                            bool3 = null;
                        }
                        zK3 = androidx.databinding.c0.K0(bool3);
                        if (j11 != 0) {
                            if (zK3) {
                                j16 = 281474976710656L;
                            } else {
                                j16 = 140737488355328L;
                            }
                            j10 |= j16;
                        }
                        if (zK3) {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.hn;
                        } else {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.sn;
                        }
                        long j2111111113 = j10;
                        drawableB2 = g.a.b(context, i25);
                        j12 = j2111111113;
                    } else {
                        z9 = z9;
                        j12 = j10;
                        drawableB2 = null;
                    }
                    j13 = j12 & 106496;
                    if (j13 != 0) {
                        if (g6Var != null) {
                            long j2111111114 = j12;
                            uVarH0 = g6Var.h0();
                            j14 = j2111111114;
                        } else {
                            j14 = j12;
                            uVarH0 = null;
                        }
                        p1(13, uVarH0);
                        if (uVarH0 != null) {
                            bool2 = (Boolean) uVarH0.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j13 != 0) {
                            if (zK2) {
                                j15 = 72057594037927936L;
                            } else {
                                j15 = 36028797018963968L;
                            }
                            j14 |= j15;
                        }
                        if (zK2) {
                            i24 = 0;
                        } else {
                            i24 = 8;
                        }
                        String str11111111112 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str11111111112;
                        int i3111119 = i21;
                        z4 = z7;
                        i9 = i3111119;
                        String str11111111113 = str9;
                        i11 = i22;
                        str3 = str11111111113;
                        i3 = i15;
                        f = f2;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = i24;
                        i2 = i16;
                        j5 = j14;
                    } else {
                        long j2111111115 = j12;
                        String str11111111114 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str11111111114;
                        int i31111110 = i21;
                        z4 = z7;
                        i9 = i31111110;
                        String str11111111115 = str9;
                        i11 = i22;
                        str3 = str11111111115;
                        i3 = i15;
                        i2 = i16;
                        f = f2;
                        j5 = j2111111115;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = 0;
                    }
                } else {
                    j2 = 98432;
                }
                if ((j & 98312) == 0) {
                    str7 = null;
                } else {
                    if (g6Var != null) {
                        observableFieldF0 = g6Var.f0();
                    } else {
                        observableFieldF0 = null;
                    }
                    p1(3, observableFieldF0);
                    if (observableFieldF0 != null) {
                        str7 = (String) observableFieldF0.get();
                    } else {
                        str7 = null;
                    }
                }
                if ((j & 98320) != 0) {
                    if (g6Var != null) {
                        observableFieldZ = g6Var.Z();
                    } else {
                        observableFieldZ = null;
                    }
                    j3 = 34359738368L;
                    p1(4, observableFieldZ);
                    if (observableFieldZ != null) {
                    }
                    if ((j & 100384) != 0) {
                        if (g6Var != null) {
                            observableFieldG0 = g6Var.g0();
                            observableFieldX2 = g6Var.X();
                        } else {
                            observableFieldG0 = null;
                            observableFieldX2 = null;
                        }
                        j4 = 68719476736L;
                        p1(5, observableFieldG0);
                        p1(11, observableFieldX2);
                        if (observableFieldG0 != null) {
                            bool5 = (Boolean) observableFieldG0.get();
                        } else {
                            bool5 = null;
                        }
                        if (observableFieldX2 != null) {
                            bool6 = (Boolean) observableFieldX2.get();
                        } else {
                            bool6 = null;
                        }
                        zK5 = androidx.databinding.c0.K0(bool5);
                        zK6 = androidx.databinding.c0.K0(bool6);
                        if ((j & 98336) != 0) {
                            if (zK5) {
                                j19 = 22589471024218112L;
                            } else {
                                j19 = 11294735512109056L;
                            }
                            j |= j19;
                        }
                        if ((j & 100384) != 0) {
                            if (zK5) {
                                j18 = 4194304;
                            } else {
                                j18 = 2097152;
                            }
                            j |= j18;
                        }
                        if ((j & 100352) != 0) {
                            if (zK6) {
                                j |= 1125917086711808L;
                            } else {
                                j |= 562958543355904L;
                            }
                        }
                        if ((j & 100384) != 0) {
                            if (zK6) {
                                j |= 68719476736L;
                            } else {
                                j |= j3;
                            }
                        }
                        if ((j & 98336) != 0) {
                            MediumTextView mediumTextView7 = this.P2;
                            if (zK5) {
                                i29 = com.zentraedi.comic.q.f.Ux;
                            } else {
                                i29 = com.zentraedi.comic.q.f.Ud;
                            }
                            iB3 = androidx.databinding.c0.B(mediumTextView7, i29);
                            if (zK5) {
                                iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ux);
                            } else {
                                iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ud);
                            }
                            if (zK5) {
                                i23 = 8;
                            } else {
                                i23 = 0;
                            }
                            if (zK5) {
                                iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ux);
                            } else {
                                iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ud);
                            }
                            if (zK5) {
                                drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.cm);
                            } else {
                                drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.G0);
                            }
                            if (zK5) {
                                iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.qz);
                            } else {
                                iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.Vd);
                            }
                            if (zK5) {
                                i28 = 0;
                            } else {
                                i28 = 8;
                            }
                            i22 = iB5;
                            if (zK5) {
                                textView = this.g0;
                                i30 = com.zentraedi.comic.q.f.Ux;
                            } else {
                                textView = this.g0;
                                i30 = com.zentraedi.comic.q.f.yd;
                            }
                            iB2 = androidx.databinding.c0.B(textView, i30);
                            i27 = iB4;
                        } else {
                            j = j;
                            i27 = 0;
                            iB2 = 0;
                            iB3 = 0;
                            i28 = 0;
                            iB = 0;
                            drawableB = null;
                            i22 = 0;
                            i23 = 0;
                        }
                        if ((j & 100352) == 0) {
                            i21 = 0;
                        } else {
                            if (zK6) {
                                f3 = 0.5f;
                            } else {
                                f3 = 1.0f;
                            }
                            if (zK6) {
                                i21 = 0;
                            } else {
                                i21 = 8;
                            }
                        }
                        int i31111111 = iB3;
                        i17 = i27;
                        int i31111112 = i28;
                        i18 = iB2;
                        j = j;
                        z8 = zK6;
                        f2 = f3;
                        observableField = observableFieldX2;
                        bool = bool6;
                        i20 = i31111112;
                        z7 = zK5;
                        i19 = i31111111;
                    } else {
                        j4 = 68719476736L;
                        f2 = 0.0f;
                        i17 = 0;
                        i18 = 0;
                        i19 = 0;
                        i20 = 0;
                        z7 = false;
                        observableField = null;
                        bool = null;
                        z8 = false;
                        i21 = 0;
                        iB = 0;
                        drawableB = null;
                        i22 = 0;
                        i23 = 0;
                    }
                    if ((j & j2) != 0) {
                        if (g6Var != null) {
                            long j2124 = j;
                            uVarB0 = g6Var.b0();
                            j8 = j2124;
                        } else {
                            j8 = j;
                            uVarB0 = null;
                        }
                        p1(7, uVarB0);
                        if (uVarB0 != null) {
                        }
                        j9 = j8 & 98560;
                        if (j9 != 0) {
                            if (g6Var != null) {
                                uVarI0 = g6Var.i0();
                            } else {
                                uVarI0 = null;
                            }
                            p1(8, uVarI0);
                            if (uVarI0 != null) {
                                bool4 = (Boolean) uVarI0.get();
                            } else {
                                bool4 = null;
                            }
                            zK4 = androidx.databinding.c0.K0(bool4);
                            if (j9 != 0) {
                                if (zK4) {
                                    j17 = 274877906944L;
                                } else {
                                    j17 = 137438953472L;
                                }
                                j8 |= j17;
                            }
                            if (zK4) {
                                resources = this.g0.getResources();
                                i26 = com.zentraedi.comic.q.C0124q.dy;
                            } else {
                                resources = this.g0.getResources();
                                i26 = com.zentraedi.comic.q.C0124q.dB;
                            }
                            long j2111111116 = j8;
                            string = resources.getString(i26);
                            j10 = j2111111116;
                        } else {
                            str9 = str9;
                            j10 = j8;
                            string = null;
                        }
                        if ((j10 & 98816) != 0) {
                            if (g6Var != null) {
                                wVarU = g6Var.U();
                            } else {
                                wVarU = null;
                            }
                            q1(9, wVarU);
                            if (wVarU != null) {
                                size = wVarU.size();
                            } else {
                                size = 0;
                            }
                            if (size > 0) {
                            }
                            j11 = j10 & 102400;
                            if (j11 != 0) {
                                if (g6Var != null) {
                                    uVarJ0 = g6Var.j0();
                                } else {
                                    uVarJ0 = null;
                                }
                                p1(12, uVarJ0);
                                if (uVarJ0 != null) {
                                    bool3 = (Boolean) uVarJ0.get();
                                } else {
                                    bool3 = null;
                                }
                                zK3 = androidx.databinding.c0.K0(bool3);
                                if (j11 != 0) {
                                    if (zK3) {
                                        j16 = 281474976710656L;
                                    } else {
                                        j16 = 140737488355328L;
                                    }
                                    j10 |= j16;
                                }
                                if (zK3) {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.hn;
                                } else {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.sn;
                                }
                                long j2111111117 = j10;
                                drawableB2 = g.a.b(context, i25);
                                j12 = j2111111117;
                            } else {
                                z9 = z9;
                                j12 = j10;
                                drawableB2 = null;
                            }
                            j13 = j12 & 106496;
                            if (j13 != 0) {
                                if (g6Var != null) {
                                    long j2111111118 = j12;
                                    uVarH0 = g6Var.h0();
                                    j14 = j2111111118;
                                } else {
                                    j14 = j12;
                                    uVarH0 = null;
                                }
                                p1(13, uVarH0);
                                if (uVarH0 != null) {
                                    bool2 = (Boolean) uVarH0.get();
                                } else {
                                    bool2 = null;
                                }
                                zK2 = androidx.databinding.c0.K0(bool2);
                                if (j13 != 0) {
                                    if (zK2) {
                                        j15 = 72057594037927936L;
                                    } else {
                                        j15 = 36028797018963968L;
                                    }
                                    j14 |= j15;
                                }
                                if (zK2) {
                                    i24 = 0;
                                } else {
                                    i24 = 8;
                                }
                                String str11111111116 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str11111111116;
                                int i31111113 = i21;
                                z4 = z7;
                                i9 = i31111113;
                                String str11111111117 = str9;
                                i11 = i22;
                                str3 = str11111111117;
                                i3 = i15;
                                f = f2;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = i24;
                                i2 = i16;
                                j5 = j14;
                            } else {
                                long j2111111119 = j12;
                                String str11111111118 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str11111111118;
                                int i31111114 = i21;
                                z4 = z7;
                                i9 = i31111114;
                                String str11111111119 = str9;
                                i11 = i22;
                                str3 = str11111111119;
                                i3 = i15;
                                i2 = i16;
                                f = f2;
                                j5 = j2111111119;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = 0;
                            }
                        } else {
                            j10 = j10;
                        }
                        j11 = j10 & 102400;
                        if (j11 != 0) {
                            if (g6Var != null) {
                                uVarJ0 = g6Var.j0();
                            } else {
                                uVarJ0 = null;
                            }
                            p1(12, uVarJ0);
                            if (uVarJ0 != null) {
                                bool3 = (Boolean) uVarJ0.get();
                            } else {
                                bool3 = null;
                            }
                            zK3 = androidx.databinding.c0.K0(bool3);
                            if (j11 != 0) {
                                if (zK3) {
                                    j16 = 281474976710656L;
                                } else {
                                    j16 = 140737488355328L;
                                }
                                j10 |= j16;
                            }
                            if (zK3) {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.hn;
                            } else {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.sn;
                            }
                            long j21111111110 = j10;
                            drawableB2 = g.a.b(context, i25);
                            j12 = j21111111110;
                        } else {
                            z9 = z9;
                            j12 = j10;
                            drawableB2 = null;
                        }
                        j13 = j12 & 106496;
                        if (j13 != 0) {
                            if (g6Var != null) {
                                long j21111111111 = j12;
                                uVarH0 = g6Var.h0();
                                j14 = j21111111111;
                            } else {
                                j14 = j12;
                                uVarH0 = null;
                            }
                            p1(13, uVarH0);
                            if (uVarH0 != null) {
                                bool2 = (Boolean) uVarH0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j13 != 0) {
                                if (zK2) {
                                    j15 = 72057594037927936L;
                                } else {
                                    j15 = 36028797018963968L;
                                }
                                j14 |= j15;
                            }
                            if (zK2) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            String str111111111110 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str111111111110;
                            int i31111115 = i21;
                            z4 = z7;
                            i9 = i31111115;
                            String str111111111111 = str9;
                            i11 = i22;
                            str3 = str111111111111;
                            i3 = i15;
                            f = f2;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = i24;
                            i2 = i16;
                            j5 = j14;
                        } else {
                            long j21111111112 = j12;
                            String str111111111112 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str111111111112;
                            int i31111116 = i21;
                            z4 = z7;
                            i9 = i31111116;
                            String str111111111113 = str9;
                            i11 = i22;
                            str3 = str111111111113;
                            i3 = i15;
                            i2 = i16;
                            f = f2;
                            j5 = j21111111112;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = 0;
                        }
                    } else {
                        j8 = j;
                    }
                    j9 = j8 & 98560;
                    if (j9 != 0) {
                        if (g6Var != null) {
                            uVarI0 = g6Var.i0();
                        } else {
                            uVarI0 = null;
                        }
                        p1(8, uVarI0);
                        if (uVarI0 != null) {
                            bool4 = (Boolean) uVarI0.get();
                        } else {
                            bool4 = null;
                        }
                        zK4 = androidx.databinding.c0.K0(bool4);
                        if (j9 != 0) {
                            if (zK4) {
                                j17 = 274877906944L;
                            } else {
                                j17 = 137438953472L;
                            }
                            j8 |= j17;
                        }
                        if (zK4) {
                            resources = this.g0.getResources();
                            i26 = com.zentraedi.comic.q.C0124q.dy;
                        } else {
                            resources = this.g0.getResources();
                            i26 = com.zentraedi.comic.q.C0124q.dB;
                        }
                        long j21111111113 = j8;
                        string = resources.getString(i26);
                        j10 = j21111111113;
                    } else {
                        str9 = str9;
                        j10 = j8;
                        string = null;
                    }
                    if ((j10 & 98816) != 0) {
                        if (g6Var != null) {
                            wVarU = g6Var.U();
                        } else {
                            wVarU = null;
                        }
                        q1(9, wVarU);
                        if (wVarU != null) {
                            size = wVarU.size();
                        } else {
                            size = 0;
                        }
                        if (size > 0) {
                        }
                        j11 = j10 & 102400;
                        if (j11 != 0) {
                            if (g6Var != null) {
                                uVarJ0 = g6Var.j0();
                            } else {
                                uVarJ0 = null;
                            }
                            p1(12, uVarJ0);
                            if (uVarJ0 != null) {
                                bool3 = (Boolean) uVarJ0.get();
                            } else {
                                bool3 = null;
                            }
                            zK3 = androidx.databinding.c0.K0(bool3);
                            if (j11 != 0) {
                                if (zK3) {
                                    j16 = 281474976710656L;
                                } else {
                                    j16 = 140737488355328L;
                                }
                                j10 |= j16;
                            }
                            if (zK3) {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.hn;
                            } else {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.sn;
                            }
                            long j21111111114 = j10;
                            drawableB2 = g.a.b(context, i25);
                            j12 = j21111111114;
                        } else {
                            z9 = z9;
                            j12 = j10;
                            drawableB2 = null;
                        }
                        j13 = j12 & 106496;
                        if (j13 != 0) {
                            if (g6Var != null) {
                                long j21111111115 = j12;
                                uVarH0 = g6Var.h0();
                                j14 = j21111111115;
                            } else {
                                j14 = j12;
                                uVarH0 = null;
                            }
                            p1(13, uVarH0);
                            if (uVarH0 != null) {
                                bool2 = (Boolean) uVarH0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j13 != 0) {
                                if (zK2) {
                                    j15 = 72057594037927936L;
                                } else {
                                    j15 = 36028797018963968L;
                                }
                                j14 |= j15;
                            }
                            if (zK2) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            String str111111111114 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str111111111114;
                            int i31111117 = i21;
                            z4 = z7;
                            i9 = i31111117;
                            String str111111111115 = str9;
                            i11 = i22;
                            str3 = str111111111115;
                            i3 = i15;
                            f = f2;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = i24;
                            i2 = i16;
                            j5 = j14;
                        } else {
                            long j21111111116 = j12;
                            String str111111111116 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str111111111116;
                            int i31111118 = i21;
                            z4 = z7;
                            i9 = i31111118;
                            String str111111111117 = str9;
                            i11 = i22;
                            str3 = str111111111117;
                            i3 = i15;
                            i2 = i16;
                            f = f2;
                            j5 = j21111111116;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = 0;
                        }
                    } else {
                        j10 = j10;
                    }
                    j11 = j10 & 102400;
                    if (j11 != 0) {
                        if (g6Var != null) {
                            uVarJ0 = g6Var.j0();
                        } else {
                            uVarJ0 = null;
                        }
                        p1(12, uVarJ0);
                        if (uVarJ0 != null) {
                            bool3 = (Boolean) uVarJ0.get();
                        } else {
                            bool3 = null;
                        }
                        zK3 = androidx.databinding.c0.K0(bool3);
                        if (j11 != 0) {
                            if (zK3) {
                                j16 = 281474976710656L;
                            } else {
                                j16 = 140737488355328L;
                            }
                            j10 |= j16;
                        }
                        if (zK3) {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.hn;
                        } else {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.sn;
                        }
                        long j21111111117 = j10;
                        drawableB2 = g.a.b(context, i25);
                        j12 = j21111111117;
                    } else {
                        z9 = z9;
                        j12 = j10;
                        drawableB2 = null;
                    }
                    j13 = j12 & 106496;
                    if (j13 != 0) {
                        if (g6Var != null) {
                            long j21111111118 = j12;
                            uVarH0 = g6Var.h0();
                            j14 = j21111111118;
                        } else {
                            j14 = j12;
                            uVarH0 = null;
                        }
                        p1(13, uVarH0);
                        if (uVarH0 != null) {
                            bool2 = (Boolean) uVarH0.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j13 != 0) {
                            if (zK2) {
                                j15 = 72057594037927936L;
                            } else {
                                j15 = 36028797018963968L;
                            }
                            j14 |= j15;
                        }
                        if (zK2) {
                            i24 = 0;
                        } else {
                            i24 = 8;
                        }
                        String str111111111118 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str111111111118;
                        int i31111119 = i21;
                        z4 = z7;
                        i9 = i31111119;
                        String str111111111119 = str9;
                        i11 = i22;
                        str3 = str111111111119;
                        i3 = i15;
                        f = f2;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = i24;
                        i2 = i16;
                        j5 = j14;
                    } else {
                        long j21111111119 = j12;
                        String str1111111111110 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str1111111111110;
                        int i311111110 = i21;
                        z4 = z7;
                        i9 = i311111110;
                        String str1111111111111 = str9;
                        i11 = i22;
                        str3 = str1111111111111;
                        i3 = i15;
                        i2 = i16;
                        f = f2;
                        j5 = j21111111119;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = 0;
                    }
                } else {
                    j3 = 34359738368L;
                }
                if ((j & 100384) != 0) {
                    if (g6Var != null) {
                        observableFieldG0 = g6Var.g0();
                        observableFieldX2 = g6Var.X();
                    } else {
                        observableFieldG0 = null;
                        observableFieldX2 = null;
                    }
                    j4 = 68719476736L;
                    p1(5, observableFieldG0);
                    p1(11, observableFieldX2);
                    if (observableFieldG0 != null) {
                        bool5 = (Boolean) observableFieldG0.get();
                    } else {
                        bool5 = null;
                    }
                    if (observableFieldX2 != null) {
                        bool6 = (Boolean) observableFieldX2.get();
                    } else {
                        bool6 = null;
                    }
                    zK5 = androidx.databinding.c0.K0(bool5);
                    zK6 = androidx.databinding.c0.K0(bool6);
                    if ((j & 98336) != 0) {
                        if (zK5) {
                            j19 = 22589471024218112L;
                        } else {
                            j19 = 11294735512109056L;
                        }
                        j |= j19;
                    }
                    if ((j & 100384) != 0) {
                        if (zK5) {
                            j18 = 4194304;
                        } else {
                            j18 = 2097152;
                        }
                        j |= j18;
                    }
                    if ((j & 100352) != 0) {
                        if (zK6) {
                            j |= 1125917086711808L;
                        } else {
                            j |= 562958543355904L;
                        }
                    }
                    if ((j & 100384) != 0) {
                        if (zK6) {
                            j |= 68719476736L;
                        } else {
                            j |= j3;
                        }
                    }
                    if ((j & 98336) != 0) {
                        MediumTextView mediumTextView8 = this.P2;
                        if (zK5) {
                            i29 = com.zentraedi.comic.q.f.Ux;
                        } else {
                            i29 = com.zentraedi.comic.q.f.Ud;
                        }
                        iB3 = androidx.databinding.c0.B(mediumTextView8, i29);
                        if (zK5) {
                            iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ux);
                        } else {
                            iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ud);
                        }
                        if (zK5) {
                            i23 = 8;
                        } else {
                            i23 = 0;
                        }
                        if (zK5) {
                            iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ux);
                        } else {
                            iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ud);
                        }
                        if (zK5) {
                            drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.cm);
                        } else {
                            drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.G0);
                        }
                        if (zK5) {
                            iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.qz);
                        } else {
                            iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.Vd);
                        }
                        if (zK5) {
                            i28 = 0;
                        } else {
                            i28 = 8;
                        }
                        i22 = iB5;
                        if (zK5) {
                            textView = this.g0;
                            i30 = com.zentraedi.comic.q.f.Ux;
                        } else {
                            textView = this.g0;
                            i30 = com.zentraedi.comic.q.f.yd;
                        }
                        iB2 = androidx.databinding.c0.B(textView, i30);
                        i27 = iB4;
                    } else {
                        j = j;
                        i27 = 0;
                        iB2 = 0;
                        iB3 = 0;
                        i28 = 0;
                        iB = 0;
                        drawableB = null;
                        i22 = 0;
                        i23 = 0;
                    }
                    if ((j & 100352) == 0) {
                        i21 = 0;
                    } else {
                        if (zK6) {
                            f3 = 0.5f;
                        } else {
                            f3 = 1.0f;
                        }
                        if (zK6) {
                            i21 = 0;
                        } else {
                            i21 = 8;
                        }
                    }
                    int i311111111 = iB3;
                    i17 = i27;
                    int i311111112 = i28;
                    i18 = iB2;
                    j = j;
                    z8 = zK6;
                    f2 = f3;
                    observableField = observableFieldX2;
                    bool = bool6;
                    i20 = i311111112;
                    z7 = zK5;
                    i19 = i311111111;
                } else {
                    j4 = 68719476736L;
                    f2 = 0.0f;
                    i17 = 0;
                    i18 = 0;
                    i19 = 0;
                    i20 = 0;
                    z7 = false;
                    observableField = null;
                    bool = null;
                    z8 = false;
                    i21 = 0;
                    iB = 0;
                    drawableB = null;
                    i22 = 0;
                    i23 = 0;
                }
                if ((j & j2) != 0) {
                    if (g6Var != null) {
                        long j2125 = j;
                        uVarB0 = g6Var.b0();
                        j8 = j2125;
                    } else {
                        j8 = j;
                        uVarB0 = null;
                    }
                    p1(7, uVarB0);
                    if (uVarB0 != null) {
                    }
                    j9 = j8 & 98560;
                    if (j9 != 0) {
                        if (g6Var != null) {
                            uVarI0 = g6Var.i0();
                        } else {
                            uVarI0 = null;
                        }
                        p1(8, uVarI0);
                        if (uVarI0 != null) {
                            bool4 = (Boolean) uVarI0.get();
                        } else {
                            bool4 = null;
                        }
                        zK4 = androidx.databinding.c0.K0(bool4);
                        if (j9 != 0) {
                            if (zK4) {
                                j17 = 274877906944L;
                            } else {
                                j17 = 137438953472L;
                            }
                            j8 |= j17;
                        }
                        if (zK4) {
                            resources = this.g0.getResources();
                            i26 = com.zentraedi.comic.q.C0124q.dy;
                        } else {
                            resources = this.g0.getResources();
                            i26 = com.zentraedi.comic.q.C0124q.dB;
                        }
                        long j211111111110 = j8;
                        string = resources.getString(i26);
                        j10 = j211111111110;
                    } else {
                        str9 = str9;
                        j10 = j8;
                        string = null;
                    }
                    if ((j10 & 98816) != 0) {
                        if (g6Var != null) {
                            wVarU = g6Var.U();
                        } else {
                            wVarU = null;
                        }
                        q1(9, wVarU);
                        if (wVarU != null) {
                            size = wVarU.size();
                        } else {
                            size = 0;
                        }
                        if (size > 0) {
                        }
                        j11 = j10 & 102400;
                        if (j11 != 0) {
                            if (g6Var != null) {
                                uVarJ0 = g6Var.j0();
                            } else {
                                uVarJ0 = null;
                            }
                            p1(12, uVarJ0);
                            if (uVarJ0 != null) {
                                bool3 = (Boolean) uVarJ0.get();
                            } else {
                                bool3 = null;
                            }
                            zK3 = androidx.databinding.c0.K0(bool3);
                            if (j11 != 0) {
                                if (zK3) {
                                    j16 = 281474976710656L;
                                } else {
                                    j16 = 140737488355328L;
                                }
                                j10 |= j16;
                            }
                            if (zK3) {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.hn;
                            } else {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.sn;
                            }
                            long j211111111111 = j10;
                            drawableB2 = g.a.b(context, i25);
                            j12 = j211111111111;
                        } else {
                            z9 = z9;
                            j12 = j10;
                            drawableB2 = null;
                        }
                        j13 = j12 & 106496;
                        if (j13 != 0) {
                            if (g6Var != null) {
                                long j211111111112 = j12;
                                uVarH0 = g6Var.h0();
                                j14 = j211111111112;
                            } else {
                                j14 = j12;
                                uVarH0 = null;
                            }
                            p1(13, uVarH0);
                            if (uVarH0 != null) {
                                bool2 = (Boolean) uVarH0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j13 != 0) {
                                if (zK2) {
                                    j15 = 72057594037927936L;
                                } else {
                                    j15 = 36028797018963968L;
                                }
                                j14 |= j15;
                            }
                            if (zK2) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            String str1111111111112 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str1111111111112;
                            int i311111113 = i21;
                            z4 = z7;
                            i9 = i311111113;
                            String str1111111111113 = str9;
                            i11 = i22;
                            str3 = str1111111111113;
                            i3 = i15;
                            f = f2;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = i24;
                            i2 = i16;
                            j5 = j14;
                        } else {
                            long j211111111113 = j12;
                            String str1111111111114 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str1111111111114;
                            int i311111114 = i21;
                            z4 = z7;
                            i9 = i311111114;
                            String str1111111111115 = str9;
                            i11 = i22;
                            str3 = str1111111111115;
                            i3 = i15;
                            i2 = i16;
                            f = f2;
                            j5 = j211111111113;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = 0;
                        }
                    } else {
                        j10 = j10;
                    }
                    j11 = j10 & 102400;
                    if (j11 != 0) {
                        if (g6Var != null) {
                            uVarJ0 = g6Var.j0();
                        } else {
                            uVarJ0 = null;
                        }
                        p1(12, uVarJ0);
                        if (uVarJ0 != null) {
                            bool3 = (Boolean) uVarJ0.get();
                        } else {
                            bool3 = null;
                        }
                        zK3 = androidx.databinding.c0.K0(bool3);
                        if (j11 != 0) {
                            if (zK3) {
                                j16 = 281474976710656L;
                            } else {
                                j16 = 140737488355328L;
                            }
                            j10 |= j16;
                        }
                        if (zK3) {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.hn;
                        } else {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.sn;
                        }
                        long j211111111114 = j10;
                        drawableB2 = g.a.b(context, i25);
                        j12 = j211111111114;
                    } else {
                        z9 = z9;
                        j12 = j10;
                        drawableB2 = null;
                    }
                    j13 = j12 & 106496;
                    if (j13 != 0) {
                        if (g6Var != null) {
                            long j211111111115 = j12;
                            uVarH0 = g6Var.h0();
                            j14 = j211111111115;
                        } else {
                            j14 = j12;
                            uVarH0 = null;
                        }
                        p1(13, uVarH0);
                        if (uVarH0 != null) {
                            bool2 = (Boolean) uVarH0.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j13 != 0) {
                            if (zK2) {
                                j15 = 72057594037927936L;
                            } else {
                                j15 = 36028797018963968L;
                            }
                            j14 |= j15;
                        }
                        if (zK2) {
                            i24 = 0;
                        } else {
                            i24 = 8;
                        }
                        String str1111111111116 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str1111111111116;
                        int i311111115 = i21;
                        z4 = z7;
                        i9 = i311111115;
                        String str1111111111117 = str9;
                        i11 = i22;
                        str3 = str1111111111117;
                        i3 = i15;
                        f = f2;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = i24;
                        i2 = i16;
                        j5 = j14;
                    } else {
                        long j211111111116 = j12;
                        String str1111111111118 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str1111111111118;
                        int i311111116 = i21;
                        z4 = z7;
                        i9 = i311111116;
                        String str1111111111119 = str9;
                        i11 = i22;
                        str3 = str1111111111119;
                        i3 = i15;
                        i2 = i16;
                        f = f2;
                        j5 = j211111111116;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = 0;
                    }
                } else {
                    j8 = j;
                }
                j9 = j8 & 98560;
                if (j9 != 0) {
                    if (g6Var != null) {
                        uVarI0 = g6Var.i0();
                    } else {
                        uVarI0 = null;
                    }
                    p1(8, uVarI0);
                    if (uVarI0 != null) {
                        bool4 = (Boolean) uVarI0.get();
                    } else {
                        bool4 = null;
                    }
                    zK4 = androidx.databinding.c0.K0(bool4);
                    if (j9 != 0) {
                        if (zK4) {
                            j17 = 274877906944L;
                        } else {
                            j17 = 137438953472L;
                        }
                        j8 |= j17;
                    }
                    if (zK4) {
                        resources = this.g0.getResources();
                        i26 = com.zentraedi.comic.q.C0124q.dy;
                    } else {
                        resources = this.g0.getResources();
                        i26 = com.zentraedi.comic.q.C0124q.dB;
                    }
                    long j211111111117 = j8;
                    string = resources.getString(i26);
                    j10 = j211111111117;
                } else {
                    str9 = str9;
                    j10 = j8;
                    string = null;
                }
                if ((j10 & 98816) != 0) {
                    if (g6Var != null) {
                        wVarU = g6Var.U();
                    } else {
                        wVarU = null;
                    }
                    q1(9, wVarU);
                    if (wVarU != null) {
                        size = wVarU.size();
                    } else {
                        size = 0;
                    }
                    if (size > 0) {
                    }
                    j11 = j10 & 102400;
                    if (j11 != 0) {
                        if (g6Var != null) {
                            uVarJ0 = g6Var.j0();
                        } else {
                            uVarJ0 = null;
                        }
                        p1(12, uVarJ0);
                        if (uVarJ0 != null) {
                            bool3 = (Boolean) uVarJ0.get();
                        } else {
                            bool3 = null;
                        }
                        zK3 = androidx.databinding.c0.K0(bool3);
                        if (j11 != 0) {
                            if (zK3) {
                                j16 = 281474976710656L;
                            } else {
                                j16 = 140737488355328L;
                            }
                            j10 |= j16;
                        }
                        if (zK3) {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.hn;
                        } else {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.sn;
                        }
                        long j211111111118 = j10;
                        drawableB2 = g.a.b(context, i25);
                        j12 = j211111111118;
                    } else {
                        z9 = z9;
                        j12 = j10;
                        drawableB2 = null;
                    }
                    j13 = j12 & 106496;
                    if (j13 != 0) {
                        if (g6Var != null) {
                            long j211111111119 = j12;
                            uVarH0 = g6Var.h0();
                            j14 = j211111111119;
                        } else {
                            j14 = j12;
                            uVarH0 = null;
                        }
                        p1(13, uVarH0);
                        if (uVarH0 != null) {
                            bool2 = (Boolean) uVarH0.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j13 != 0) {
                            if (zK2) {
                                j15 = 72057594037927936L;
                            } else {
                                j15 = 36028797018963968L;
                            }
                            j14 |= j15;
                        }
                        if (zK2) {
                            i24 = 0;
                        } else {
                            i24 = 8;
                        }
                        String str11111111111110 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str11111111111110;
                        int i311111117 = i21;
                        z4 = z7;
                        i9 = i311111117;
                        String str11111111111111 = str9;
                        i11 = i22;
                        str3 = str11111111111111;
                        i3 = i15;
                        f = f2;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = i24;
                        i2 = i16;
                        j5 = j14;
                    } else {
                        long j2111111111110 = j12;
                        String str11111111111112 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str11111111111112;
                        int i311111118 = i21;
                        z4 = z7;
                        i9 = i311111118;
                        String str11111111111113 = str9;
                        i11 = i22;
                        str3 = str11111111111113;
                        i3 = i15;
                        i2 = i16;
                        f = f2;
                        j5 = j2111111111110;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = 0;
                    }
                } else {
                    j10 = j10;
                }
                j11 = j10 & 102400;
                if (j11 != 0) {
                    if (g6Var != null) {
                        uVarJ0 = g6Var.j0();
                    } else {
                        uVarJ0 = null;
                    }
                    p1(12, uVarJ0);
                    if (uVarJ0 != null) {
                        bool3 = (Boolean) uVarJ0.get();
                    } else {
                        bool3 = null;
                    }
                    zK3 = androidx.databinding.c0.K0(bool3);
                    if (j11 != 0) {
                        if (zK3) {
                            j16 = 281474976710656L;
                        } else {
                            j16 = 140737488355328L;
                        }
                        j10 |= j16;
                    }
                    if (zK3) {
                        context = this.h0.getContext();
                        i25 = com.zentraedi.comic.q.h.hn;
                    } else {
                        context = this.h0.getContext();
                        i25 = com.zentraedi.comic.q.h.sn;
                    }
                    long j2111111111111 = j10;
                    drawableB2 = g.a.b(context, i25);
                    j12 = j2111111111111;
                } else {
                    z9 = z9;
                    j12 = j10;
                    drawableB2 = null;
                }
                j13 = j12 & 106496;
                if (j13 != 0) {
                    if (g6Var != null) {
                        long j2111111111112 = j12;
                        uVarH0 = g6Var.h0();
                        j14 = j2111111111112;
                    } else {
                        j14 = j12;
                        uVarH0 = null;
                    }
                    p1(13, uVarH0);
                    if (uVarH0 != null) {
                        bool2 = (Boolean) uVarH0.get();
                    } else {
                        bool2 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool2);
                    if (j13 != 0) {
                        if (zK2) {
                            j15 = 72057594037927936L;
                        } else {
                            j15 = 36028797018963968L;
                        }
                        j14 |= j15;
                    }
                    if (zK2) {
                        i24 = 0;
                    } else {
                        i24 = 8;
                    }
                    String str11111111111114 = string;
                    str4 = str7;
                    i7 = i19;
                    drawable = drawableB;
                    str2 = str11111111111114;
                    int i311111119 = i21;
                    z4 = z7;
                    i9 = i311111119;
                    String str11111111111115 = str9;
                    i11 = i22;
                    str3 = str11111111111115;
                    i3 = i15;
                    f = f2;
                    observableFieldX = observableField;
                    i10 = i20;
                    i8 = iB;
                    drawable2 = drawableB2;
                    i = i23;
                    zK0 = z8;
                    z3 = zK1;
                    i6 = i18;
                    z2 = z6;
                    i5 = i17;
                    z = z9;
                    str5 = str8;
                    str = str6;
                    i4 = i24;
                    i2 = i16;
                    j5 = j14;
                } else {
                    long j2111111111113 = j12;
                    String str11111111111116 = string;
                    str4 = str7;
                    i7 = i19;
                    drawable = drawableB;
                    str2 = str11111111111116;
                    int i3111111110 = i21;
                    z4 = z7;
                    i9 = i3111111110;
                    String str11111111111117 = str9;
                    i11 = i22;
                    str3 = str11111111111117;
                    i3 = i15;
                    i2 = i16;
                    f = f2;
                    j5 = j2111111111113;
                    observableFieldX = observableField;
                    i10 = i20;
                    i8 = iB;
                    drawable2 = drawableB2;
                    i = i23;
                    zK0 = z8;
                    z3 = zK1;
                    i6 = i18;
                    z2 = z6;
                    i5 = i17;
                    z = z9;
                    str5 = str8;
                    str = str6;
                    i4 = 0;
                }
            } else {
                zK1 = false;
            }
            i15 = 0;
            i16 = 0;
            if ((j & 98308) != 0) {
                if (g6Var != null) {
                    title = g6Var.getTitle();
                } else {
                    title = null;
                }
                j2 = 98432;
                p1(2, title);
                if (title != null) {
                }
                if ((j & 98312) == 0) {
                    str7 = null;
                } else {
                    if (g6Var != null) {
                        observableFieldF0 = g6Var.f0();
                    } else {
                        observableFieldF0 = null;
                    }
                    p1(3, observableFieldF0);
                    if (observableFieldF0 != null) {
                        str7 = (String) observableFieldF0.get();
                    } else {
                        str7 = null;
                    }
                }
                if ((j & 98320) != 0) {
                    if (g6Var != null) {
                        observableFieldZ = g6Var.Z();
                    } else {
                        observableFieldZ = null;
                    }
                    j3 = 34359738368L;
                    p1(4, observableFieldZ);
                    if (observableFieldZ != null) {
                    }
                    if ((j & 100384) != 0) {
                        if (g6Var != null) {
                            observableFieldG0 = g6Var.g0();
                            observableFieldX2 = g6Var.X();
                        } else {
                            observableFieldG0 = null;
                            observableFieldX2 = null;
                        }
                        j4 = 68719476736L;
                        p1(5, observableFieldG0);
                        p1(11, observableFieldX2);
                        if (observableFieldG0 != null) {
                            bool5 = (Boolean) observableFieldG0.get();
                        } else {
                            bool5 = null;
                        }
                        if (observableFieldX2 != null) {
                            bool6 = (Boolean) observableFieldX2.get();
                        } else {
                            bool6 = null;
                        }
                        zK5 = androidx.databinding.c0.K0(bool5);
                        zK6 = androidx.databinding.c0.K0(bool6);
                        if ((j & 98336) != 0) {
                            if (zK5) {
                                j19 = 22589471024218112L;
                            } else {
                                j19 = 11294735512109056L;
                            }
                            j |= j19;
                        }
                        if ((j & 100384) != 0) {
                            if (zK5) {
                                j18 = 4194304;
                            } else {
                                j18 = 2097152;
                            }
                            j |= j18;
                        }
                        if ((j & 100352) != 0) {
                            if (zK6) {
                                j |= 1125917086711808L;
                            } else {
                                j |= 562958543355904L;
                            }
                        }
                        if ((j & 100384) != 0) {
                            if (zK6) {
                                j |= 68719476736L;
                            } else {
                                j |= j3;
                            }
                        }
                        if ((j & 98336) != 0) {
                            MediumTextView mediumTextView9 = this.P2;
                            if (zK5) {
                                i29 = com.zentraedi.comic.q.f.Ux;
                            } else {
                                i29 = com.zentraedi.comic.q.f.Ud;
                            }
                            iB3 = androidx.databinding.c0.B(mediumTextView9, i29);
                            if (zK5) {
                                iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ux);
                            } else {
                                iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ud);
                            }
                            if (zK5) {
                                i23 = 8;
                            } else {
                                i23 = 0;
                            }
                            if (zK5) {
                                iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ux);
                            } else {
                                iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ud);
                            }
                            if (zK5) {
                                drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.cm);
                            } else {
                                drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.G0);
                            }
                            if (zK5) {
                                iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.qz);
                            } else {
                                iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.Vd);
                            }
                            if (zK5) {
                                i28 = 0;
                            } else {
                                i28 = 8;
                            }
                            i22 = iB5;
                            if (zK5) {
                                textView = this.g0;
                                i30 = com.zentraedi.comic.q.f.Ux;
                            } else {
                                textView = this.g0;
                                i30 = com.zentraedi.comic.q.f.yd;
                            }
                            iB2 = androidx.databinding.c0.B(textView, i30);
                            i27 = iB4;
                        } else {
                            j = j;
                            i27 = 0;
                            iB2 = 0;
                            iB3 = 0;
                            i28 = 0;
                            iB = 0;
                            drawableB = null;
                            i22 = 0;
                            i23 = 0;
                        }
                        if ((j & 100352) == 0) {
                            i21 = 0;
                        } else {
                            if (zK6) {
                                f3 = 0.5f;
                            } else {
                                f3 = 1.0f;
                            }
                            if (zK6) {
                                i21 = 0;
                            } else {
                                i21 = 8;
                            }
                        }
                        int i3111111111 = iB3;
                        i17 = i27;
                        int i3111111112 = i28;
                        i18 = iB2;
                        j = j;
                        z8 = zK6;
                        f2 = f3;
                        observableField = observableFieldX2;
                        bool = bool6;
                        i20 = i3111111112;
                        z7 = zK5;
                        i19 = i3111111111;
                    } else {
                        j4 = 68719476736L;
                        f2 = 0.0f;
                        i17 = 0;
                        i18 = 0;
                        i19 = 0;
                        i20 = 0;
                        z7 = false;
                        observableField = null;
                        bool = null;
                        z8 = false;
                        i21 = 0;
                        iB = 0;
                        drawableB = null;
                        i22 = 0;
                        i23 = 0;
                    }
                    if ((j & j2) != 0) {
                        if (g6Var != null) {
                            long j2126 = j;
                            uVarB0 = g6Var.b0();
                            j8 = j2126;
                        } else {
                            j8 = j;
                            uVarB0 = null;
                        }
                        p1(7, uVarB0);
                        if (uVarB0 != null) {
                        }
                        j9 = j8 & 98560;
                        if (j9 != 0) {
                            if (g6Var != null) {
                                uVarI0 = g6Var.i0();
                            } else {
                                uVarI0 = null;
                            }
                            p1(8, uVarI0);
                            if (uVarI0 != null) {
                                bool4 = (Boolean) uVarI0.get();
                            } else {
                                bool4 = null;
                            }
                            zK4 = androidx.databinding.c0.K0(bool4);
                            if (j9 != 0) {
                                if (zK4) {
                                    j17 = 274877906944L;
                                } else {
                                    j17 = 137438953472L;
                                }
                                j8 |= j17;
                            }
                            if (zK4) {
                                resources = this.g0.getResources();
                                i26 = com.zentraedi.comic.q.C0124q.dy;
                            } else {
                                resources = this.g0.getResources();
                                i26 = com.zentraedi.comic.q.C0124q.dB;
                            }
                            long j2111111111114 = j8;
                            string = resources.getString(i26);
                            j10 = j2111111111114;
                        } else {
                            str9 = str9;
                            j10 = j8;
                            string = null;
                        }
                        if ((j10 & 98816) != 0) {
                            if (g6Var != null) {
                                wVarU = g6Var.U();
                            } else {
                                wVarU = null;
                            }
                            q1(9, wVarU);
                            if (wVarU != null) {
                                size = wVarU.size();
                            } else {
                                size = 0;
                            }
                            if (size > 0) {
                            }
                            j11 = j10 & 102400;
                            if (j11 != 0) {
                                if (g6Var != null) {
                                    uVarJ0 = g6Var.j0();
                                } else {
                                    uVarJ0 = null;
                                }
                                p1(12, uVarJ0);
                                if (uVarJ0 != null) {
                                    bool3 = (Boolean) uVarJ0.get();
                                } else {
                                    bool3 = null;
                                }
                                zK3 = androidx.databinding.c0.K0(bool3);
                                if (j11 != 0) {
                                    if (zK3) {
                                        j16 = 281474976710656L;
                                    } else {
                                        j16 = 140737488355328L;
                                    }
                                    j10 |= j16;
                                }
                                if (zK3) {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.hn;
                                } else {
                                    context = this.h0.getContext();
                                    i25 = com.zentraedi.comic.q.h.sn;
                                }
                                long j2111111111115 = j10;
                                drawableB2 = g.a.b(context, i25);
                                j12 = j2111111111115;
                            } else {
                                z9 = z9;
                                j12 = j10;
                                drawableB2 = null;
                            }
                            j13 = j12 & 106496;
                            if (j13 != 0) {
                                if (g6Var != null) {
                                    long j2111111111116 = j12;
                                    uVarH0 = g6Var.h0();
                                    j14 = j2111111111116;
                                } else {
                                    j14 = j12;
                                    uVarH0 = null;
                                }
                                p1(13, uVarH0);
                                if (uVarH0 != null) {
                                    bool2 = (Boolean) uVarH0.get();
                                } else {
                                    bool2 = null;
                                }
                                zK2 = androidx.databinding.c0.K0(bool2);
                                if (j13 != 0) {
                                    if (zK2) {
                                        j15 = 72057594037927936L;
                                    } else {
                                        j15 = 36028797018963968L;
                                    }
                                    j14 |= j15;
                                }
                                if (zK2) {
                                    i24 = 0;
                                } else {
                                    i24 = 8;
                                }
                                String str11111111111118 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str11111111111118;
                                int i3111111113 = i21;
                                z4 = z7;
                                i9 = i3111111113;
                                String str11111111111119 = str9;
                                i11 = i22;
                                str3 = str11111111111119;
                                i3 = i15;
                                f = f2;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = i24;
                                i2 = i16;
                                j5 = j14;
                            } else {
                                long j2111111111117 = j12;
                                String str111111111111110 = string;
                                str4 = str7;
                                i7 = i19;
                                drawable = drawableB;
                                str2 = str111111111111110;
                                int i3111111114 = i21;
                                z4 = z7;
                                i9 = i3111111114;
                                String str111111111111111 = str9;
                                i11 = i22;
                                str3 = str111111111111111;
                                i3 = i15;
                                i2 = i16;
                                f = f2;
                                j5 = j2111111111117;
                                observableFieldX = observableField;
                                i10 = i20;
                                i8 = iB;
                                drawable2 = drawableB2;
                                i = i23;
                                zK0 = z8;
                                z3 = zK1;
                                i6 = i18;
                                z2 = z6;
                                i5 = i17;
                                z = z9;
                                str5 = str8;
                                str = str6;
                                i4 = 0;
                            }
                        } else {
                            j10 = j10;
                        }
                        j11 = j10 & 102400;
                        if (j11 != 0) {
                            if (g6Var != null) {
                                uVarJ0 = g6Var.j0();
                            } else {
                                uVarJ0 = null;
                            }
                            p1(12, uVarJ0);
                            if (uVarJ0 != null) {
                                bool3 = (Boolean) uVarJ0.get();
                            } else {
                                bool3 = null;
                            }
                            zK3 = androidx.databinding.c0.K0(bool3);
                            if (j11 != 0) {
                                if (zK3) {
                                    j16 = 281474976710656L;
                                } else {
                                    j16 = 140737488355328L;
                                }
                                j10 |= j16;
                            }
                            if (zK3) {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.hn;
                            } else {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.sn;
                            }
                            long j2111111111118 = j10;
                            drawableB2 = g.a.b(context, i25);
                            j12 = j2111111111118;
                        } else {
                            z9 = z9;
                            j12 = j10;
                            drawableB2 = null;
                        }
                        j13 = j12 & 106496;
                        if (j13 != 0) {
                            if (g6Var != null) {
                                long j2111111111119 = j12;
                                uVarH0 = g6Var.h0();
                                j14 = j2111111111119;
                            } else {
                                j14 = j12;
                                uVarH0 = null;
                            }
                            p1(13, uVarH0);
                            if (uVarH0 != null) {
                                bool2 = (Boolean) uVarH0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j13 != 0) {
                                if (zK2) {
                                    j15 = 72057594037927936L;
                                } else {
                                    j15 = 36028797018963968L;
                                }
                                j14 |= j15;
                            }
                            if (zK2) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            String str111111111111112 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str111111111111112;
                            int i3111111115 = i21;
                            z4 = z7;
                            i9 = i3111111115;
                            String str111111111111113 = str9;
                            i11 = i22;
                            str3 = str111111111111113;
                            i3 = i15;
                            f = f2;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = i24;
                            i2 = i16;
                            j5 = j14;
                        } else {
                            long j21111111111110 = j12;
                            String str111111111111114 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str111111111111114;
                            int i3111111116 = i21;
                            z4 = z7;
                            i9 = i3111111116;
                            String str111111111111115 = str9;
                            i11 = i22;
                            str3 = str111111111111115;
                            i3 = i15;
                            i2 = i16;
                            f = f2;
                            j5 = j21111111111110;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = 0;
                        }
                    } else {
                        j8 = j;
                    }
                    j9 = j8 & 98560;
                    if (j9 != 0) {
                        if (g6Var != null) {
                            uVarI0 = g6Var.i0();
                        } else {
                            uVarI0 = null;
                        }
                        p1(8, uVarI0);
                        if (uVarI0 != null) {
                            bool4 = (Boolean) uVarI0.get();
                        } else {
                            bool4 = null;
                        }
                        zK4 = androidx.databinding.c0.K0(bool4);
                        if (j9 != 0) {
                            if (zK4) {
                                j17 = 274877906944L;
                            } else {
                                j17 = 137438953472L;
                            }
                            j8 |= j17;
                        }
                        if (zK4) {
                            resources = this.g0.getResources();
                            i26 = com.zentraedi.comic.q.C0124q.dy;
                        } else {
                            resources = this.g0.getResources();
                            i26 = com.zentraedi.comic.q.C0124q.dB;
                        }
                        long j21111111111111 = j8;
                        string = resources.getString(i26);
                        j10 = j21111111111111;
                    } else {
                        str9 = str9;
                        j10 = j8;
                        string = null;
                    }
                    if ((j10 & 98816) != 0) {
                        if (g6Var != null) {
                            wVarU = g6Var.U();
                        } else {
                            wVarU = null;
                        }
                        q1(9, wVarU);
                        if (wVarU != null) {
                            size = wVarU.size();
                        } else {
                            size = 0;
                        }
                        if (size > 0) {
                        }
                        j11 = j10 & 102400;
                        if (j11 != 0) {
                            if (g6Var != null) {
                                uVarJ0 = g6Var.j0();
                            } else {
                                uVarJ0 = null;
                            }
                            p1(12, uVarJ0);
                            if (uVarJ0 != null) {
                                bool3 = (Boolean) uVarJ0.get();
                            } else {
                                bool3 = null;
                            }
                            zK3 = androidx.databinding.c0.K0(bool3);
                            if (j11 != 0) {
                                if (zK3) {
                                    j16 = 281474976710656L;
                                } else {
                                    j16 = 140737488355328L;
                                }
                                j10 |= j16;
                            }
                            if (zK3) {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.hn;
                            } else {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.sn;
                            }
                            long j21111111111112 = j10;
                            drawableB2 = g.a.b(context, i25);
                            j12 = j21111111111112;
                        } else {
                            z9 = z9;
                            j12 = j10;
                            drawableB2 = null;
                        }
                        j13 = j12 & 106496;
                        if (j13 != 0) {
                            if (g6Var != null) {
                                long j21111111111113 = j12;
                                uVarH0 = g6Var.h0();
                                j14 = j21111111111113;
                            } else {
                                j14 = j12;
                                uVarH0 = null;
                            }
                            p1(13, uVarH0);
                            if (uVarH0 != null) {
                                bool2 = (Boolean) uVarH0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j13 != 0) {
                                if (zK2) {
                                    j15 = 72057594037927936L;
                                } else {
                                    j15 = 36028797018963968L;
                                }
                                j14 |= j15;
                            }
                            if (zK2) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            String str111111111111116 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str111111111111116;
                            int i3111111117 = i21;
                            z4 = z7;
                            i9 = i3111111117;
                            String str111111111111117 = str9;
                            i11 = i22;
                            str3 = str111111111111117;
                            i3 = i15;
                            f = f2;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = i24;
                            i2 = i16;
                            j5 = j14;
                        } else {
                            long j21111111111114 = j12;
                            String str111111111111118 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str111111111111118;
                            int i3111111118 = i21;
                            z4 = z7;
                            i9 = i3111111118;
                            String str111111111111119 = str9;
                            i11 = i22;
                            str3 = str111111111111119;
                            i3 = i15;
                            i2 = i16;
                            f = f2;
                            j5 = j21111111111114;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = 0;
                        }
                    } else {
                        j10 = j10;
                    }
                    j11 = j10 & 102400;
                    if (j11 != 0) {
                        if (g6Var != null) {
                            uVarJ0 = g6Var.j0();
                        } else {
                            uVarJ0 = null;
                        }
                        p1(12, uVarJ0);
                        if (uVarJ0 != null) {
                            bool3 = (Boolean) uVarJ0.get();
                        } else {
                            bool3 = null;
                        }
                        zK3 = androidx.databinding.c0.K0(bool3);
                        if (j11 != 0) {
                            if (zK3) {
                                j16 = 281474976710656L;
                            } else {
                                j16 = 140737488355328L;
                            }
                            j10 |= j16;
                        }
                        if (zK3) {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.hn;
                        } else {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.sn;
                        }
                        long j21111111111115 = j10;
                        drawableB2 = g.a.b(context, i25);
                        j12 = j21111111111115;
                    } else {
                        z9 = z9;
                        j12 = j10;
                        drawableB2 = null;
                    }
                    j13 = j12 & 106496;
                    if (j13 != 0) {
                        if (g6Var != null) {
                            long j21111111111116 = j12;
                            uVarH0 = g6Var.h0();
                            j14 = j21111111111116;
                        } else {
                            j14 = j12;
                            uVarH0 = null;
                        }
                        p1(13, uVarH0);
                        if (uVarH0 != null) {
                            bool2 = (Boolean) uVarH0.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j13 != 0) {
                            if (zK2) {
                                j15 = 72057594037927936L;
                            } else {
                                j15 = 36028797018963968L;
                            }
                            j14 |= j15;
                        }
                        if (zK2) {
                            i24 = 0;
                        } else {
                            i24 = 8;
                        }
                        String str1111111111111110 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str1111111111111110;
                        int i3111111119 = i21;
                        z4 = z7;
                        i9 = i3111111119;
                        String str1111111111111111 = str9;
                        i11 = i22;
                        str3 = str1111111111111111;
                        i3 = i15;
                        f = f2;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = i24;
                        i2 = i16;
                        j5 = j14;
                    } else {
                        long j21111111111117 = j12;
                        String str1111111111111112 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str1111111111111112;
                        int i31111111110 = i21;
                        z4 = z7;
                        i9 = i31111111110;
                        String str1111111111111113 = str9;
                        i11 = i22;
                        str3 = str1111111111111113;
                        i3 = i15;
                        i2 = i16;
                        f = f2;
                        j5 = j21111111111117;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = 0;
                    }
                } else {
                    j3 = 34359738368L;
                }
                if ((j & 100384) != 0) {
                    if (g6Var != null) {
                        observableFieldG0 = g6Var.g0();
                        observableFieldX2 = g6Var.X();
                    } else {
                        observableFieldG0 = null;
                        observableFieldX2 = null;
                    }
                    j4 = 68719476736L;
                    p1(5, observableFieldG0);
                    p1(11, observableFieldX2);
                    if (observableFieldG0 != null) {
                        bool5 = (Boolean) observableFieldG0.get();
                    } else {
                        bool5 = null;
                    }
                    if (observableFieldX2 != null) {
                        bool6 = (Boolean) observableFieldX2.get();
                    } else {
                        bool6 = null;
                    }
                    zK5 = androidx.databinding.c0.K0(bool5);
                    zK6 = androidx.databinding.c0.K0(bool6);
                    if ((j & 98336) != 0) {
                        if (zK5) {
                            j19 = 22589471024218112L;
                        } else {
                            j19 = 11294735512109056L;
                        }
                        j |= j19;
                    }
                    if ((j & 100384) != 0) {
                        if (zK5) {
                            j18 = 4194304;
                        } else {
                            j18 = 2097152;
                        }
                        j |= j18;
                    }
                    if ((j & 100352) != 0) {
                        if (zK6) {
                            j |= 1125917086711808L;
                        } else {
                            j |= 562958543355904L;
                        }
                    }
                    if ((j & 100384) != 0) {
                        if (zK6) {
                            j |= 68719476736L;
                        } else {
                            j |= j3;
                        }
                    }
                    if ((j & 98336) != 0) {
                        MediumTextView mediumTextView10 = this.P2;
                        if (zK5) {
                            i29 = com.zentraedi.comic.q.f.Ux;
                        } else {
                            i29 = com.zentraedi.comic.q.f.Ud;
                        }
                        iB3 = androidx.databinding.c0.B(mediumTextView10, i29);
                        if (zK5) {
                            iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ux);
                        } else {
                            iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ud);
                        }
                        if (zK5) {
                            i23 = 8;
                        } else {
                            i23 = 0;
                        }
                        if (zK5) {
                            iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ux);
                        } else {
                            iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ud);
                        }
                        if (zK5) {
                            drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.cm);
                        } else {
                            drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.G0);
                        }
                        if (zK5) {
                            iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.qz);
                        } else {
                            iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.Vd);
                        }
                        if (zK5) {
                            i28 = 0;
                        } else {
                            i28 = 8;
                        }
                        i22 = iB5;
                        if (zK5) {
                            textView = this.g0;
                            i30 = com.zentraedi.comic.q.f.Ux;
                        } else {
                            textView = this.g0;
                            i30 = com.zentraedi.comic.q.f.yd;
                        }
                        iB2 = androidx.databinding.c0.B(textView, i30);
                        i27 = iB4;
                    } else {
                        j = j;
                        i27 = 0;
                        iB2 = 0;
                        iB3 = 0;
                        i28 = 0;
                        iB = 0;
                        drawableB = null;
                        i22 = 0;
                        i23 = 0;
                    }
                    if ((j & 100352) == 0) {
                        i21 = 0;
                    } else {
                        if (zK6) {
                            f3 = 0.5f;
                        } else {
                            f3 = 1.0f;
                        }
                        if (zK6) {
                            i21 = 0;
                        } else {
                            i21 = 8;
                        }
                    }
                    int i31111111111 = iB3;
                    i17 = i27;
                    int i31111111112 = i28;
                    i18 = iB2;
                    j = j;
                    z8 = zK6;
                    f2 = f3;
                    observableField = observableFieldX2;
                    bool = bool6;
                    i20 = i31111111112;
                    z7 = zK5;
                    i19 = i31111111111;
                } else {
                    j4 = 68719476736L;
                    f2 = 0.0f;
                    i17 = 0;
                    i18 = 0;
                    i19 = 0;
                    i20 = 0;
                    z7 = false;
                    observableField = null;
                    bool = null;
                    z8 = false;
                    i21 = 0;
                    iB = 0;
                    drawableB = null;
                    i22 = 0;
                    i23 = 0;
                }
                if ((j & j2) != 0) {
                    if (g6Var != null) {
                        long j2127 = j;
                        uVarB0 = g6Var.b0();
                        j8 = j2127;
                    } else {
                        j8 = j;
                        uVarB0 = null;
                    }
                    p1(7, uVarB0);
                    if (uVarB0 != null) {
                    }
                    j9 = j8 & 98560;
                    if (j9 != 0) {
                        if (g6Var != null) {
                            uVarI0 = g6Var.i0();
                        } else {
                            uVarI0 = null;
                        }
                        p1(8, uVarI0);
                        if (uVarI0 != null) {
                            bool4 = (Boolean) uVarI0.get();
                        } else {
                            bool4 = null;
                        }
                        zK4 = androidx.databinding.c0.K0(bool4);
                        if (j9 != 0) {
                            if (zK4) {
                                j17 = 274877906944L;
                            } else {
                                j17 = 137438953472L;
                            }
                            j8 |= j17;
                        }
                        if (zK4) {
                            resources = this.g0.getResources();
                            i26 = com.zentraedi.comic.q.C0124q.dy;
                        } else {
                            resources = this.g0.getResources();
                            i26 = com.zentraedi.comic.q.C0124q.dB;
                        }
                        long j21111111111118 = j8;
                        string = resources.getString(i26);
                        j10 = j21111111111118;
                    } else {
                        str9 = str9;
                        j10 = j8;
                        string = null;
                    }
                    if ((j10 & 98816) != 0) {
                        if (g6Var != null) {
                            wVarU = g6Var.U();
                        } else {
                            wVarU = null;
                        }
                        q1(9, wVarU);
                        if (wVarU != null) {
                            size = wVarU.size();
                        } else {
                            size = 0;
                        }
                        if (size > 0) {
                        }
                        j11 = j10 & 102400;
                        if (j11 != 0) {
                            if (g6Var != null) {
                                uVarJ0 = g6Var.j0();
                            } else {
                                uVarJ0 = null;
                            }
                            p1(12, uVarJ0);
                            if (uVarJ0 != null) {
                                bool3 = (Boolean) uVarJ0.get();
                            } else {
                                bool3 = null;
                            }
                            zK3 = androidx.databinding.c0.K0(bool3);
                            if (j11 != 0) {
                                if (zK3) {
                                    j16 = 281474976710656L;
                                } else {
                                    j16 = 140737488355328L;
                                }
                                j10 |= j16;
                            }
                            if (zK3) {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.hn;
                            } else {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.sn;
                            }
                            long j21111111111119 = j10;
                            drawableB2 = g.a.b(context, i25);
                            j12 = j21111111111119;
                        } else {
                            z9 = z9;
                            j12 = j10;
                            drawableB2 = null;
                        }
                        j13 = j12 & 106496;
                        if (j13 != 0) {
                            if (g6Var != null) {
                                long j211111111111110 = j12;
                                uVarH0 = g6Var.h0();
                                j14 = j211111111111110;
                            } else {
                                j14 = j12;
                                uVarH0 = null;
                            }
                            p1(13, uVarH0);
                            if (uVarH0 != null) {
                                bool2 = (Boolean) uVarH0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j13 != 0) {
                                if (zK2) {
                                    j15 = 72057594037927936L;
                                } else {
                                    j15 = 36028797018963968L;
                                }
                                j14 |= j15;
                            }
                            if (zK2) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            String str1111111111111114 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str1111111111111114;
                            int i31111111113 = i21;
                            z4 = z7;
                            i9 = i31111111113;
                            String str1111111111111115 = str9;
                            i11 = i22;
                            str3 = str1111111111111115;
                            i3 = i15;
                            f = f2;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = i24;
                            i2 = i16;
                            j5 = j14;
                        } else {
                            long j211111111111111 = j12;
                            String str1111111111111116 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str1111111111111116;
                            int i31111111114 = i21;
                            z4 = z7;
                            i9 = i31111111114;
                            String str1111111111111117 = str9;
                            i11 = i22;
                            str3 = str1111111111111117;
                            i3 = i15;
                            i2 = i16;
                            f = f2;
                            j5 = j211111111111111;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = 0;
                        }
                    } else {
                        j10 = j10;
                    }
                    j11 = j10 & 102400;
                    if (j11 != 0) {
                        if (g6Var != null) {
                            uVarJ0 = g6Var.j0();
                        } else {
                            uVarJ0 = null;
                        }
                        p1(12, uVarJ0);
                        if (uVarJ0 != null) {
                            bool3 = (Boolean) uVarJ0.get();
                        } else {
                            bool3 = null;
                        }
                        zK3 = androidx.databinding.c0.K0(bool3);
                        if (j11 != 0) {
                            if (zK3) {
                                j16 = 281474976710656L;
                            } else {
                                j16 = 140737488355328L;
                            }
                            j10 |= j16;
                        }
                        if (zK3) {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.hn;
                        } else {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.sn;
                        }
                        long j211111111111112 = j10;
                        drawableB2 = g.a.b(context, i25);
                        j12 = j211111111111112;
                    } else {
                        z9 = z9;
                        j12 = j10;
                        drawableB2 = null;
                    }
                    j13 = j12 & 106496;
                    if (j13 != 0) {
                        if (g6Var != null) {
                            long j211111111111113 = j12;
                            uVarH0 = g6Var.h0();
                            j14 = j211111111111113;
                        } else {
                            j14 = j12;
                            uVarH0 = null;
                        }
                        p1(13, uVarH0);
                        if (uVarH0 != null) {
                            bool2 = (Boolean) uVarH0.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j13 != 0) {
                            if (zK2) {
                                j15 = 72057594037927936L;
                            } else {
                                j15 = 36028797018963968L;
                            }
                            j14 |= j15;
                        }
                        if (zK2) {
                            i24 = 0;
                        } else {
                            i24 = 8;
                        }
                        String str1111111111111118 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str1111111111111118;
                        int i31111111115 = i21;
                        z4 = z7;
                        i9 = i31111111115;
                        String str1111111111111119 = str9;
                        i11 = i22;
                        str3 = str1111111111111119;
                        i3 = i15;
                        f = f2;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = i24;
                        i2 = i16;
                        j5 = j14;
                    } else {
                        long j211111111111114 = j12;
                        String str11111111111111110 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str11111111111111110;
                        int i31111111116 = i21;
                        z4 = z7;
                        i9 = i31111111116;
                        String str11111111111111111 = str9;
                        i11 = i22;
                        str3 = str11111111111111111;
                        i3 = i15;
                        i2 = i16;
                        f = f2;
                        j5 = j211111111111114;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = 0;
                    }
                } else {
                    j8 = j;
                }
                j9 = j8 & 98560;
                if (j9 != 0) {
                    if (g6Var != null) {
                        uVarI0 = g6Var.i0();
                    } else {
                        uVarI0 = null;
                    }
                    p1(8, uVarI0);
                    if (uVarI0 != null) {
                        bool4 = (Boolean) uVarI0.get();
                    } else {
                        bool4 = null;
                    }
                    zK4 = androidx.databinding.c0.K0(bool4);
                    if (j9 != 0) {
                        if (zK4) {
                            j17 = 274877906944L;
                        } else {
                            j17 = 137438953472L;
                        }
                        j8 |= j17;
                    }
                    if (zK4) {
                        resources = this.g0.getResources();
                        i26 = com.zentraedi.comic.q.C0124q.dy;
                    } else {
                        resources = this.g0.getResources();
                        i26 = com.zentraedi.comic.q.C0124q.dB;
                    }
                    long j211111111111115 = j8;
                    string = resources.getString(i26);
                    j10 = j211111111111115;
                } else {
                    str9 = str9;
                    j10 = j8;
                    string = null;
                }
                if ((j10 & 98816) != 0) {
                    if (g6Var != null) {
                        wVarU = g6Var.U();
                    } else {
                        wVarU = null;
                    }
                    q1(9, wVarU);
                    if (wVarU != null) {
                        size = wVarU.size();
                    } else {
                        size = 0;
                    }
                    if (size > 0) {
                    }
                    j11 = j10 & 102400;
                    if (j11 != 0) {
                        if (g6Var != null) {
                            uVarJ0 = g6Var.j0();
                        } else {
                            uVarJ0 = null;
                        }
                        p1(12, uVarJ0);
                        if (uVarJ0 != null) {
                            bool3 = (Boolean) uVarJ0.get();
                        } else {
                            bool3 = null;
                        }
                        zK3 = androidx.databinding.c0.K0(bool3);
                        if (j11 != 0) {
                            if (zK3) {
                                j16 = 281474976710656L;
                            } else {
                                j16 = 140737488355328L;
                            }
                            j10 |= j16;
                        }
                        if (zK3) {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.hn;
                        } else {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.sn;
                        }
                        long j211111111111116 = j10;
                        drawableB2 = g.a.b(context, i25);
                        j12 = j211111111111116;
                    } else {
                        z9 = z9;
                        j12 = j10;
                        drawableB2 = null;
                    }
                    j13 = j12 & 106496;
                    if (j13 != 0) {
                        if (g6Var != null) {
                            long j211111111111117 = j12;
                            uVarH0 = g6Var.h0();
                            j14 = j211111111111117;
                        } else {
                            j14 = j12;
                            uVarH0 = null;
                        }
                        p1(13, uVarH0);
                        if (uVarH0 != null) {
                            bool2 = (Boolean) uVarH0.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j13 != 0) {
                            if (zK2) {
                                j15 = 72057594037927936L;
                            } else {
                                j15 = 36028797018963968L;
                            }
                            j14 |= j15;
                        }
                        if (zK2) {
                            i24 = 0;
                        } else {
                            i24 = 8;
                        }
                        String str11111111111111112 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str11111111111111112;
                        int i31111111117 = i21;
                        z4 = z7;
                        i9 = i31111111117;
                        String str11111111111111113 = str9;
                        i11 = i22;
                        str3 = str11111111111111113;
                        i3 = i15;
                        f = f2;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = i24;
                        i2 = i16;
                        j5 = j14;
                    } else {
                        long j211111111111118 = j12;
                        String str11111111111111114 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str11111111111111114;
                        int i31111111118 = i21;
                        z4 = z7;
                        i9 = i31111111118;
                        String str11111111111111115 = str9;
                        i11 = i22;
                        str3 = str11111111111111115;
                        i3 = i15;
                        i2 = i16;
                        f = f2;
                        j5 = j211111111111118;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = 0;
                    }
                } else {
                    j10 = j10;
                }
                j11 = j10 & 102400;
                if (j11 != 0) {
                    if (g6Var != null) {
                        uVarJ0 = g6Var.j0();
                    } else {
                        uVarJ0 = null;
                    }
                    p1(12, uVarJ0);
                    if (uVarJ0 != null) {
                        bool3 = (Boolean) uVarJ0.get();
                    } else {
                        bool3 = null;
                    }
                    zK3 = androidx.databinding.c0.K0(bool3);
                    if (j11 != 0) {
                        if (zK3) {
                            j16 = 281474976710656L;
                        } else {
                            j16 = 140737488355328L;
                        }
                        j10 |= j16;
                    }
                    if (zK3) {
                        context = this.h0.getContext();
                        i25 = com.zentraedi.comic.q.h.hn;
                    } else {
                        context = this.h0.getContext();
                        i25 = com.zentraedi.comic.q.h.sn;
                    }
                    long j211111111111119 = j10;
                    drawableB2 = g.a.b(context, i25);
                    j12 = j211111111111119;
                } else {
                    z9 = z9;
                    j12 = j10;
                    drawableB2 = null;
                }
                j13 = j12 & 106496;
                if (j13 != 0) {
                    if (g6Var != null) {
                        long j2111111111111110 = j12;
                        uVarH0 = g6Var.h0();
                        j14 = j2111111111111110;
                    } else {
                        j14 = j12;
                        uVarH0 = null;
                    }
                    p1(13, uVarH0);
                    if (uVarH0 != null) {
                        bool2 = (Boolean) uVarH0.get();
                    } else {
                        bool2 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool2);
                    if (j13 != 0) {
                        if (zK2) {
                            j15 = 72057594037927936L;
                        } else {
                            j15 = 36028797018963968L;
                        }
                        j14 |= j15;
                    }
                    if (zK2) {
                        i24 = 0;
                    } else {
                        i24 = 8;
                    }
                    String str11111111111111116 = string;
                    str4 = str7;
                    i7 = i19;
                    drawable = drawableB;
                    str2 = str11111111111111116;
                    int i31111111119 = i21;
                    z4 = z7;
                    i9 = i31111111119;
                    String str11111111111111117 = str9;
                    i11 = i22;
                    str3 = str11111111111111117;
                    i3 = i15;
                    f = f2;
                    observableFieldX = observableField;
                    i10 = i20;
                    i8 = iB;
                    drawable2 = drawableB2;
                    i = i23;
                    zK0 = z8;
                    z3 = zK1;
                    i6 = i18;
                    z2 = z6;
                    i5 = i17;
                    z = z9;
                    str5 = str8;
                    str = str6;
                    i4 = i24;
                    i2 = i16;
                    j5 = j14;
                } else {
                    long j2111111111111111 = j12;
                    String str11111111111111118 = string;
                    str4 = str7;
                    i7 = i19;
                    drawable = drawableB;
                    str2 = str11111111111111118;
                    int i311111111110 = i21;
                    z4 = z7;
                    i9 = i311111111110;
                    String str11111111111111119 = str9;
                    i11 = i22;
                    str3 = str11111111111111119;
                    i3 = i15;
                    i2 = i16;
                    f = f2;
                    j5 = j2111111111111111;
                    observableFieldX = observableField;
                    i10 = i20;
                    i8 = iB;
                    drawable2 = drawableB2;
                    i = i23;
                    zK0 = z8;
                    z3 = zK1;
                    i6 = i18;
                    z2 = z6;
                    i5 = i17;
                    z = z9;
                    str5 = str8;
                    str = str6;
                    i4 = 0;
                }
            } else {
                j2 = 98432;
            }
            if ((j & 98312) == 0) {
                str7 = null;
            } else {
                if (g6Var != null) {
                    observableFieldF0 = g6Var.f0();
                } else {
                    observableFieldF0 = null;
                }
                p1(3, observableFieldF0);
                if (observableFieldF0 != null) {
                    str7 = (String) observableFieldF0.get();
                } else {
                    str7 = null;
                }
            }
            if ((j & 98320) != 0) {
                if (g6Var != null) {
                    observableFieldZ = g6Var.Z();
                } else {
                    observableFieldZ = null;
                }
                j3 = 34359738368L;
                p1(4, observableFieldZ);
                if (observableFieldZ != null) {
                }
                if ((j & 100384) != 0) {
                    if (g6Var != null) {
                        observableFieldG0 = g6Var.g0();
                        observableFieldX2 = g6Var.X();
                    } else {
                        observableFieldG0 = null;
                        observableFieldX2 = null;
                    }
                    j4 = 68719476736L;
                    p1(5, observableFieldG0);
                    p1(11, observableFieldX2);
                    if (observableFieldG0 != null) {
                        bool5 = (Boolean) observableFieldG0.get();
                    } else {
                        bool5 = null;
                    }
                    if (observableFieldX2 != null) {
                        bool6 = (Boolean) observableFieldX2.get();
                    } else {
                        bool6 = null;
                    }
                    zK5 = androidx.databinding.c0.K0(bool5);
                    zK6 = androidx.databinding.c0.K0(bool6);
                    if ((j & 98336) != 0) {
                        if (zK5) {
                            j19 = 22589471024218112L;
                        } else {
                            j19 = 11294735512109056L;
                        }
                        j |= j19;
                    }
                    if ((j & 100384) != 0) {
                        if (zK5) {
                            j18 = 4194304;
                        } else {
                            j18 = 2097152;
                        }
                        j |= j18;
                    }
                    if ((j & 100352) != 0) {
                        if (zK6) {
                            j |= 1125917086711808L;
                        } else {
                            j |= 562958543355904L;
                        }
                    }
                    if ((j & 100384) != 0) {
                        if (zK6) {
                            j |= 68719476736L;
                        } else {
                            j |= j3;
                        }
                    }
                    if ((j & 98336) != 0) {
                        MediumTextView mediumTextView11 = this.P2;
                        if (zK5) {
                            i29 = com.zentraedi.comic.q.f.Ux;
                        } else {
                            i29 = com.zentraedi.comic.q.f.Ud;
                        }
                        iB3 = androidx.databinding.c0.B(mediumTextView11, i29);
                        if (zK5) {
                            iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ux);
                        } else {
                            iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ud);
                        }
                        if (zK5) {
                            i23 = 8;
                        } else {
                            i23 = 0;
                        }
                        if (zK5) {
                            iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ux);
                        } else {
                            iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ud);
                        }
                        if (zK5) {
                            drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.cm);
                        } else {
                            drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.G0);
                        }
                        if (zK5) {
                            iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.qz);
                        } else {
                            iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.Vd);
                        }
                        if (zK5) {
                            i28 = 0;
                        } else {
                            i28 = 8;
                        }
                        i22 = iB5;
                        if (zK5) {
                            textView = this.g0;
                            i30 = com.zentraedi.comic.q.f.Ux;
                        } else {
                            textView = this.g0;
                            i30 = com.zentraedi.comic.q.f.yd;
                        }
                        iB2 = androidx.databinding.c0.B(textView, i30);
                        i27 = iB4;
                    } else {
                        j = j;
                        i27 = 0;
                        iB2 = 0;
                        iB3 = 0;
                        i28 = 0;
                        iB = 0;
                        drawableB = null;
                        i22 = 0;
                        i23 = 0;
                    }
                    if ((j & 100352) == 0) {
                        i21 = 0;
                    } else {
                        if (zK6) {
                            f3 = 0.5f;
                        } else {
                            f3 = 1.0f;
                        }
                        if (zK6) {
                            i21 = 0;
                        } else {
                            i21 = 8;
                        }
                    }
                    int i311111111111 = iB3;
                    i17 = i27;
                    int i311111111112 = i28;
                    i18 = iB2;
                    j = j;
                    z8 = zK6;
                    f2 = f3;
                    observableField = observableFieldX2;
                    bool = bool6;
                    i20 = i311111111112;
                    z7 = zK5;
                    i19 = i311111111111;
                } else {
                    j4 = 68719476736L;
                    f2 = 0.0f;
                    i17 = 0;
                    i18 = 0;
                    i19 = 0;
                    i20 = 0;
                    z7 = false;
                    observableField = null;
                    bool = null;
                    z8 = false;
                    i21 = 0;
                    iB = 0;
                    drawableB = null;
                    i22 = 0;
                    i23 = 0;
                }
                if ((j & j2) != 0) {
                    if (g6Var != null) {
                        long j2128 = j;
                        uVarB0 = g6Var.b0();
                        j8 = j2128;
                    } else {
                        j8 = j;
                        uVarB0 = null;
                    }
                    p1(7, uVarB0);
                    if (uVarB0 != null) {
                    }
                    j9 = j8 & 98560;
                    if (j9 != 0) {
                        if (g6Var != null) {
                            uVarI0 = g6Var.i0();
                        } else {
                            uVarI0 = null;
                        }
                        p1(8, uVarI0);
                        if (uVarI0 != null) {
                            bool4 = (Boolean) uVarI0.get();
                        } else {
                            bool4 = null;
                        }
                        zK4 = androidx.databinding.c0.K0(bool4);
                        if (j9 != 0) {
                            if (zK4) {
                                j17 = 274877906944L;
                            } else {
                                j17 = 137438953472L;
                            }
                            j8 |= j17;
                        }
                        if (zK4) {
                            resources = this.g0.getResources();
                            i26 = com.zentraedi.comic.q.C0124q.dy;
                        } else {
                            resources = this.g0.getResources();
                            i26 = com.zentraedi.comic.q.C0124q.dB;
                        }
                        long j2111111111111112 = j8;
                        string = resources.getString(i26);
                        j10 = j2111111111111112;
                    } else {
                        str9 = str9;
                        j10 = j8;
                        string = null;
                    }
                    if ((j10 & 98816) != 0) {
                        if (g6Var != null) {
                            wVarU = g6Var.U();
                        } else {
                            wVarU = null;
                        }
                        q1(9, wVarU);
                        if (wVarU != null) {
                            size = wVarU.size();
                        } else {
                            size = 0;
                        }
                        if (size > 0) {
                        }
                        j11 = j10 & 102400;
                        if (j11 != 0) {
                            if (g6Var != null) {
                                uVarJ0 = g6Var.j0();
                            } else {
                                uVarJ0 = null;
                            }
                            p1(12, uVarJ0);
                            if (uVarJ0 != null) {
                                bool3 = (Boolean) uVarJ0.get();
                            } else {
                                bool3 = null;
                            }
                            zK3 = androidx.databinding.c0.K0(bool3);
                            if (j11 != 0) {
                                if (zK3) {
                                    j16 = 281474976710656L;
                                } else {
                                    j16 = 140737488355328L;
                                }
                                j10 |= j16;
                            }
                            if (zK3) {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.hn;
                            } else {
                                context = this.h0.getContext();
                                i25 = com.zentraedi.comic.q.h.sn;
                            }
                            long j2111111111111113 = j10;
                            drawableB2 = g.a.b(context, i25);
                            j12 = j2111111111111113;
                        } else {
                            z9 = z9;
                            j12 = j10;
                            drawableB2 = null;
                        }
                        j13 = j12 & 106496;
                        if (j13 != 0) {
                            if (g6Var != null) {
                                long j2111111111111114 = j12;
                                uVarH0 = g6Var.h0();
                                j14 = j2111111111111114;
                            } else {
                                j14 = j12;
                                uVarH0 = null;
                            }
                            p1(13, uVarH0);
                            if (uVarH0 != null) {
                                bool2 = (Boolean) uVarH0.get();
                            } else {
                                bool2 = null;
                            }
                            zK2 = androidx.databinding.c0.K0(bool2);
                            if (j13 != 0) {
                                if (zK2) {
                                    j15 = 72057594037927936L;
                                } else {
                                    j15 = 36028797018963968L;
                                }
                                j14 |= j15;
                            }
                            if (zK2) {
                                i24 = 0;
                            } else {
                                i24 = 8;
                            }
                            String str111111111111111110 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str111111111111111110;
                            int i311111111113 = i21;
                            z4 = z7;
                            i9 = i311111111113;
                            String str111111111111111111 = str9;
                            i11 = i22;
                            str3 = str111111111111111111;
                            i3 = i15;
                            f = f2;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = i24;
                            i2 = i16;
                            j5 = j14;
                        } else {
                            long j2111111111111115 = j12;
                            String str111111111111111112 = string;
                            str4 = str7;
                            i7 = i19;
                            drawable = drawableB;
                            str2 = str111111111111111112;
                            int i311111111114 = i21;
                            z4 = z7;
                            i9 = i311111111114;
                            String str111111111111111113 = str9;
                            i11 = i22;
                            str3 = str111111111111111113;
                            i3 = i15;
                            i2 = i16;
                            f = f2;
                            j5 = j2111111111111115;
                            observableFieldX = observableField;
                            i10 = i20;
                            i8 = iB;
                            drawable2 = drawableB2;
                            i = i23;
                            zK0 = z8;
                            z3 = zK1;
                            i6 = i18;
                            z2 = z6;
                            i5 = i17;
                            z = z9;
                            str5 = str8;
                            str = str6;
                            i4 = 0;
                        }
                    } else {
                        j10 = j10;
                    }
                    j11 = j10 & 102400;
                    if (j11 != 0) {
                        if (g6Var != null) {
                            uVarJ0 = g6Var.j0();
                        } else {
                            uVarJ0 = null;
                        }
                        p1(12, uVarJ0);
                        if (uVarJ0 != null) {
                            bool3 = (Boolean) uVarJ0.get();
                        } else {
                            bool3 = null;
                        }
                        zK3 = androidx.databinding.c0.K0(bool3);
                        if (j11 != 0) {
                            if (zK3) {
                                j16 = 281474976710656L;
                            } else {
                                j16 = 140737488355328L;
                            }
                            j10 |= j16;
                        }
                        if (zK3) {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.hn;
                        } else {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.sn;
                        }
                        long j2111111111111116 = j10;
                        drawableB2 = g.a.b(context, i25);
                        j12 = j2111111111111116;
                    } else {
                        z9 = z9;
                        j12 = j10;
                        drawableB2 = null;
                    }
                    j13 = j12 & 106496;
                    if (j13 != 0) {
                        if (g6Var != null) {
                            long j2111111111111117 = j12;
                            uVarH0 = g6Var.h0();
                            j14 = j2111111111111117;
                        } else {
                            j14 = j12;
                            uVarH0 = null;
                        }
                        p1(13, uVarH0);
                        if (uVarH0 != null) {
                            bool2 = (Boolean) uVarH0.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j13 != 0) {
                            if (zK2) {
                                j15 = 72057594037927936L;
                            } else {
                                j15 = 36028797018963968L;
                            }
                            j14 |= j15;
                        }
                        if (zK2) {
                            i24 = 0;
                        } else {
                            i24 = 8;
                        }
                        String str111111111111111114 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str111111111111111114;
                        int i311111111115 = i21;
                        z4 = z7;
                        i9 = i311111111115;
                        String str111111111111111115 = str9;
                        i11 = i22;
                        str3 = str111111111111111115;
                        i3 = i15;
                        f = f2;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = i24;
                        i2 = i16;
                        j5 = j14;
                    } else {
                        long j2111111111111118 = j12;
                        String str111111111111111116 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str111111111111111116;
                        int i311111111116 = i21;
                        z4 = z7;
                        i9 = i311111111116;
                        String str111111111111111117 = str9;
                        i11 = i22;
                        str3 = str111111111111111117;
                        i3 = i15;
                        i2 = i16;
                        f = f2;
                        j5 = j2111111111111118;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = 0;
                    }
                } else {
                    j8 = j;
                }
                j9 = j8 & 98560;
                if (j9 != 0) {
                    if (g6Var != null) {
                        uVarI0 = g6Var.i0();
                    } else {
                        uVarI0 = null;
                    }
                    p1(8, uVarI0);
                    if (uVarI0 != null) {
                        bool4 = (Boolean) uVarI0.get();
                    } else {
                        bool4 = null;
                    }
                    zK4 = androidx.databinding.c0.K0(bool4);
                    if (j9 != 0) {
                        if (zK4) {
                            j17 = 274877906944L;
                        } else {
                            j17 = 137438953472L;
                        }
                        j8 |= j17;
                    }
                    if (zK4) {
                        resources = this.g0.getResources();
                        i26 = com.zentraedi.comic.q.C0124q.dy;
                    } else {
                        resources = this.g0.getResources();
                        i26 = com.zentraedi.comic.q.C0124q.dB;
                    }
                    long j2111111111111119 = j8;
                    string = resources.getString(i26);
                    j10 = j2111111111111119;
                } else {
                    str9 = str9;
                    j10 = j8;
                    string = null;
                }
                if ((j10 & 98816) != 0) {
                    if (g6Var != null) {
                        wVarU = g6Var.U();
                    } else {
                        wVarU = null;
                    }
                    q1(9, wVarU);
                    if (wVarU != null) {
                        size = wVarU.size();
                    } else {
                        size = 0;
                    }
                    if (size > 0) {
                    }
                    j11 = j10 & 102400;
                    if (j11 != 0) {
                        if (g6Var != null) {
                            uVarJ0 = g6Var.j0();
                        } else {
                            uVarJ0 = null;
                        }
                        p1(12, uVarJ0);
                        if (uVarJ0 != null) {
                            bool3 = (Boolean) uVarJ0.get();
                        } else {
                            bool3 = null;
                        }
                        zK3 = androidx.databinding.c0.K0(bool3);
                        if (j11 != 0) {
                            if (zK3) {
                                j16 = 281474976710656L;
                            } else {
                                j16 = 140737488355328L;
                            }
                            j10 |= j16;
                        }
                        if (zK3) {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.hn;
                        } else {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.sn;
                        }
                        long j21111111111111110 = j10;
                        drawableB2 = g.a.b(context, i25);
                        j12 = j21111111111111110;
                    } else {
                        z9 = z9;
                        j12 = j10;
                        drawableB2 = null;
                    }
                    j13 = j12 & 106496;
                    if (j13 != 0) {
                        if (g6Var != null) {
                            long j21111111111111111 = j12;
                            uVarH0 = g6Var.h0();
                            j14 = j21111111111111111;
                        } else {
                            j14 = j12;
                            uVarH0 = null;
                        }
                        p1(13, uVarH0);
                        if (uVarH0 != null) {
                            bool2 = (Boolean) uVarH0.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j13 != 0) {
                            if (zK2) {
                                j15 = 72057594037927936L;
                            } else {
                                j15 = 36028797018963968L;
                            }
                            j14 |= j15;
                        }
                        if (zK2) {
                            i24 = 0;
                        } else {
                            i24 = 8;
                        }
                        String str111111111111111118 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str111111111111111118;
                        int i311111111117 = i21;
                        z4 = z7;
                        i9 = i311111111117;
                        String str111111111111111119 = str9;
                        i11 = i22;
                        str3 = str111111111111111119;
                        i3 = i15;
                        f = f2;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = i24;
                        i2 = i16;
                        j5 = j14;
                    } else {
                        long j21111111111111112 = j12;
                        String str1111111111111111110 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str1111111111111111110;
                        int i311111111118 = i21;
                        z4 = z7;
                        i9 = i311111111118;
                        String str1111111111111111111 = str9;
                        i11 = i22;
                        str3 = str1111111111111111111;
                        i3 = i15;
                        i2 = i16;
                        f = f2;
                        j5 = j21111111111111112;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = 0;
                    }
                } else {
                    j10 = j10;
                }
                j11 = j10 & 102400;
                if (j11 != 0) {
                    if (g6Var != null) {
                        uVarJ0 = g6Var.j0();
                    } else {
                        uVarJ0 = null;
                    }
                    p1(12, uVarJ0);
                    if (uVarJ0 != null) {
                        bool3 = (Boolean) uVarJ0.get();
                    } else {
                        bool3 = null;
                    }
                    zK3 = androidx.databinding.c0.K0(bool3);
                    if (j11 != 0) {
                        if (zK3) {
                            j16 = 281474976710656L;
                        } else {
                            j16 = 140737488355328L;
                        }
                        j10 |= j16;
                    }
                    if (zK3) {
                        context = this.h0.getContext();
                        i25 = com.zentraedi.comic.q.h.hn;
                    } else {
                        context = this.h0.getContext();
                        i25 = com.zentraedi.comic.q.h.sn;
                    }
                    long j21111111111111113 = j10;
                    drawableB2 = g.a.b(context, i25);
                    j12 = j21111111111111113;
                } else {
                    z9 = z9;
                    j12 = j10;
                    drawableB2 = null;
                }
                j13 = j12 & 106496;
                if (j13 != 0) {
                    if (g6Var != null) {
                        long j21111111111111114 = j12;
                        uVarH0 = g6Var.h0();
                        j14 = j21111111111111114;
                    } else {
                        j14 = j12;
                        uVarH0 = null;
                    }
                    p1(13, uVarH0);
                    if (uVarH0 != null) {
                        bool2 = (Boolean) uVarH0.get();
                    } else {
                        bool2 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool2);
                    if (j13 != 0) {
                        if (zK2) {
                            j15 = 72057594037927936L;
                        } else {
                            j15 = 36028797018963968L;
                        }
                        j14 |= j15;
                    }
                    if (zK2) {
                        i24 = 0;
                    } else {
                        i24 = 8;
                    }
                    String str1111111111111111112 = string;
                    str4 = str7;
                    i7 = i19;
                    drawable = drawableB;
                    str2 = str1111111111111111112;
                    int i311111111119 = i21;
                    z4 = z7;
                    i9 = i311111111119;
                    String str1111111111111111113 = str9;
                    i11 = i22;
                    str3 = str1111111111111111113;
                    i3 = i15;
                    f = f2;
                    observableFieldX = observableField;
                    i10 = i20;
                    i8 = iB;
                    drawable2 = drawableB2;
                    i = i23;
                    zK0 = z8;
                    z3 = zK1;
                    i6 = i18;
                    z2 = z6;
                    i5 = i17;
                    z = z9;
                    str5 = str8;
                    str = str6;
                    i4 = i24;
                    i2 = i16;
                    j5 = j14;
                } else {
                    long j21111111111111115 = j12;
                    String str1111111111111111114 = string;
                    str4 = str7;
                    i7 = i19;
                    drawable = drawableB;
                    str2 = str1111111111111111114;
                    int i3111111111110 = i21;
                    z4 = z7;
                    i9 = i3111111111110;
                    String str1111111111111111115 = str9;
                    i11 = i22;
                    str3 = str1111111111111111115;
                    i3 = i15;
                    i2 = i16;
                    f = f2;
                    j5 = j21111111111111115;
                    observableFieldX = observableField;
                    i10 = i20;
                    i8 = iB;
                    drawable2 = drawableB2;
                    i = i23;
                    zK0 = z8;
                    z3 = zK1;
                    i6 = i18;
                    z2 = z6;
                    i5 = i17;
                    z = z9;
                    str5 = str8;
                    str = str6;
                    i4 = 0;
                }
            } else {
                j3 = 34359738368L;
            }
            if ((j & 100384) != 0) {
                if (g6Var != null) {
                    observableFieldG0 = g6Var.g0();
                    observableFieldX2 = g6Var.X();
                } else {
                    observableFieldG0 = null;
                    observableFieldX2 = null;
                }
                j4 = 68719476736L;
                p1(5, observableFieldG0);
                p1(11, observableFieldX2);
                if (observableFieldG0 != null) {
                    bool5 = (Boolean) observableFieldG0.get();
                } else {
                    bool5 = null;
                }
                if (observableFieldX2 != null) {
                    bool6 = (Boolean) observableFieldX2.get();
                } else {
                    bool6 = null;
                }
                zK5 = androidx.databinding.c0.K0(bool5);
                zK6 = androidx.databinding.c0.K0(bool6);
                if ((j & 98336) != 0) {
                    if (zK5) {
                        j19 = 22589471024218112L;
                    } else {
                        j19 = 11294735512109056L;
                    }
                    j |= j19;
                }
                if ((j & 100384) != 0) {
                    if (zK5) {
                        j18 = 4194304;
                    } else {
                        j18 = 2097152;
                    }
                    j |= j18;
                }
                if ((j & 100352) != 0) {
                    if (zK6) {
                        j |= 1125917086711808L;
                    } else {
                        j |= 562958543355904L;
                    }
                }
                if ((j & 100384) != 0) {
                    if (zK6) {
                        j |= 68719476736L;
                    } else {
                        j |= j3;
                    }
                }
                if ((j & 98336) != 0) {
                    MediumTextView mediumTextView12 = this.P2;
                    if (zK5) {
                        i29 = com.zentraedi.comic.q.f.Ux;
                    } else {
                        i29 = com.zentraedi.comic.q.f.Ud;
                    }
                    iB3 = androidx.databinding.c0.B(mediumTextView12, i29);
                    if (zK5) {
                        iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ux);
                    } else {
                        iB4 = androidx.databinding.c0.B(this.Q2, com.zentraedi.comic.q.f.Ud);
                    }
                    if (zK5) {
                        i23 = 8;
                    } else {
                        i23 = 0;
                    }
                    if (zK5) {
                        iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ux);
                    } else {
                        iB = androidx.databinding.c0.B(this.Z2, com.zentraedi.comic.q.f.Ud);
                    }
                    if (zK5) {
                        drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.cm);
                    } else {
                        drawableB = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.G0);
                    }
                    if (zK5) {
                        iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.qz);
                    } else {
                        iB5 = androidx.databinding.c0.B(this.M2, com.zentraedi.comic.q.f.Vd);
                    }
                    if (zK5) {
                        i28 = 0;
                    } else {
                        i28 = 8;
                    }
                    i22 = iB5;
                    if (zK5) {
                        textView = this.g0;
                        i30 = com.zentraedi.comic.q.f.Ux;
                    } else {
                        textView = this.g0;
                        i30 = com.zentraedi.comic.q.f.yd;
                    }
                    iB2 = androidx.databinding.c0.B(textView, i30);
                    i27 = iB4;
                } else {
                    j = j;
                    i27 = 0;
                    iB2 = 0;
                    iB3 = 0;
                    i28 = 0;
                    iB = 0;
                    drawableB = null;
                    i22 = 0;
                    i23 = 0;
                }
                if ((j & 100352) == 0) {
                    i21 = 0;
                } else {
                    if (zK6) {
                        f3 = 0.5f;
                    } else {
                        f3 = 1.0f;
                    }
                    if (zK6) {
                        i21 = 0;
                    } else {
                        i21 = 8;
                    }
                }
                int i3111111111111 = iB3;
                i17 = i27;
                int i3111111111112 = i28;
                i18 = iB2;
                j = j;
                z8 = zK6;
                f2 = f3;
                observableField = observableFieldX2;
                bool = bool6;
                i20 = i3111111111112;
                z7 = zK5;
                i19 = i3111111111111;
            } else {
                j4 = 68719476736L;
                f2 = 0.0f;
                i17 = 0;
                i18 = 0;
                i19 = 0;
                i20 = 0;
                z7 = false;
                observableField = null;
                bool = null;
                z8 = false;
                i21 = 0;
                iB = 0;
                drawableB = null;
                i22 = 0;
                i23 = 0;
            }
            if ((j & j2) != 0) {
                if (g6Var != null) {
                    long j2129 = j;
                    uVarB0 = g6Var.b0();
                    j8 = j2129;
                } else {
                    j8 = j;
                    uVarB0 = null;
                }
                p1(7, uVarB0);
                if (uVarB0 != null) {
                }
                j9 = j8 & 98560;
                if (j9 != 0) {
                    if (g6Var != null) {
                        uVarI0 = g6Var.i0();
                    } else {
                        uVarI0 = null;
                    }
                    p1(8, uVarI0);
                    if (uVarI0 != null) {
                        bool4 = (Boolean) uVarI0.get();
                    } else {
                        bool4 = null;
                    }
                    zK4 = androidx.databinding.c0.K0(bool4);
                    if (j9 != 0) {
                        if (zK4) {
                            j17 = 274877906944L;
                        } else {
                            j17 = 137438953472L;
                        }
                        j8 |= j17;
                    }
                    if (zK4) {
                        resources = this.g0.getResources();
                        i26 = com.zentraedi.comic.q.C0124q.dy;
                    } else {
                        resources = this.g0.getResources();
                        i26 = com.zentraedi.comic.q.C0124q.dB;
                    }
                    long j21111111111111116 = j8;
                    string = resources.getString(i26);
                    j10 = j21111111111111116;
                } else {
                    str9 = str9;
                    j10 = j8;
                    string = null;
                }
                if ((j10 & 98816) != 0) {
                    if (g6Var != null) {
                        wVarU = g6Var.U();
                    } else {
                        wVarU = null;
                    }
                    q1(9, wVarU);
                    if (wVarU != null) {
                        size = wVarU.size();
                    } else {
                        size = 0;
                    }
                    if (size > 0) {
                    }
                    j11 = j10 & 102400;
                    if (j11 != 0) {
                        if (g6Var != null) {
                            uVarJ0 = g6Var.j0();
                        } else {
                            uVarJ0 = null;
                        }
                        p1(12, uVarJ0);
                        if (uVarJ0 != null) {
                            bool3 = (Boolean) uVarJ0.get();
                        } else {
                            bool3 = null;
                        }
                        zK3 = androidx.databinding.c0.K0(bool3);
                        if (j11 != 0) {
                            if (zK3) {
                                j16 = 281474976710656L;
                            } else {
                                j16 = 140737488355328L;
                            }
                            j10 |= j16;
                        }
                        if (zK3) {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.hn;
                        } else {
                            context = this.h0.getContext();
                            i25 = com.zentraedi.comic.q.h.sn;
                        }
                        long j21111111111111117 = j10;
                        drawableB2 = g.a.b(context, i25);
                        j12 = j21111111111111117;
                    } else {
                        z9 = z9;
                        j12 = j10;
                        drawableB2 = null;
                    }
                    j13 = j12 & 106496;
                    if (j13 != 0) {
                        if (g6Var != null) {
                            long j21111111111111118 = j12;
                            uVarH0 = g6Var.h0();
                            j14 = j21111111111111118;
                        } else {
                            j14 = j12;
                            uVarH0 = null;
                        }
                        p1(13, uVarH0);
                        if (uVarH0 != null) {
                            bool2 = (Boolean) uVarH0.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j13 != 0) {
                            if (zK2) {
                                j15 = 72057594037927936L;
                            } else {
                                j15 = 36028797018963968L;
                            }
                            j14 |= j15;
                        }
                        if (zK2) {
                            i24 = 0;
                        } else {
                            i24 = 8;
                        }
                        String str1111111111111111116 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str1111111111111111116;
                        int i3111111111113 = i21;
                        z4 = z7;
                        i9 = i3111111111113;
                        String str1111111111111111117 = str9;
                        i11 = i22;
                        str3 = str1111111111111111117;
                        i3 = i15;
                        f = f2;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = i24;
                        i2 = i16;
                        j5 = j14;
                    } else {
                        long j21111111111111119 = j12;
                        String str1111111111111111118 = string;
                        str4 = str7;
                        i7 = i19;
                        drawable = drawableB;
                        str2 = str1111111111111111118;
                        int i3111111111114 = i21;
                        z4 = z7;
                        i9 = i3111111111114;
                        String str1111111111111111119 = str9;
                        i11 = i22;
                        str3 = str1111111111111111119;
                        i3 = i15;
                        i2 = i16;
                        f = f2;
                        j5 = j21111111111111119;
                        observableFieldX = observableField;
                        i10 = i20;
                        i8 = iB;
                        drawable2 = drawableB2;
                        i = i23;
                        zK0 = z8;
                        z3 = zK1;
                        i6 = i18;
                        z2 = z6;
                        i5 = i17;
                        z = z9;
                        str5 = str8;
                        str = str6;
                        i4 = 0;
                    }
                } else {
                    j10 = j10;
                }
                j11 = j10 & 102400;
                if (j11 != 0) {
                    if (g6Var != null) {
                        uVarJ0 = g6Var.j0();
                    } else {
                        uVarJ0 = null;
                    }
                    p1(12, uVarJ0);
                    if (uVarJ0 != null) {
                        bool3 = (Boolean) uVarJ0.get();
                    } else {
                        bool3 = null;
                    }
                    zK3 = androidx.databinding.c0.K0(bool3);
                    if (j11 != 0) {
                        if (zK3) {
                            j16 = 281474976710656L;
                        } else {
                            j16 = 140737488355328L;
                        }
                        j10 |= j16;
                    }
                    if (zK3) {
                        context = this.h0.getContext();
                        i25 = com.zentraedi.comic.q.h.hn;
                    } else {
                        context = this.h0.getContext();
                        i25 = com.zentraedi.comic.q.h.sn;
                    }
                    long j211111111111111110 = j10;
                    drawableB2 = g.a.b(context, i25);
                    j12 = j211111111111111110;
                } else {
                    z9 = z9;
                    j12 = j10;
                    drawableB2 = null;
                }
                j13 = j12 & 106496;
                if (j13 != 0) {
                    if (g6Var != null) {
                        long j211111111111111111 = j12;
                        uVarH0 = g6Var.h0();
                        j14 = j211111111111111111;
                    } else {
                        j14 = j12;
                        uVarH0 = null;
                    }
                    p1(13, uVarH0);
                    if (uVarH0 != null) {
                        bool2 = (Boolean) uVarH0.get();
                    } else {
                        bool2 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool2);
                    if (j13 != 0) {
                        if (zK2) {
                            j15 = 72057594037927936L;
                        } else {
                            j15 = 36028797018963968L;
                        }
                        j14 |= j15;
                    }
                    if (zK2) {
                        i24 = 0;
                    } else {
                        i24 = 8;
                    }
                    String str11111111111111111110 = string;
                    str4 = str7;
                    i7 = i19;
                    drawable = drawableB;
                    str2 = str11111111111111111110;
                    int i3111111111115 = i21;
                    z4 = z7;
                    i9 = i3111111111115;
                    String str11111111111111111111 = str9;
                    i11 = i22;
                    str3 = str11111111111111111111;
                    i3 = i15;
                    f = f2;
                    observableFieldX = observableField;
                    i10 = i20;
                    i8 = iB;
                    drawable2 = drawableB2;
                    i = i23;
                    zK0 = z8;
                    z3 = zK1;
                    i6 = i18;
                    z2 = z6;
                    i5 = i17;
                    z = z9;
                    str5 = str8;
                    str = str6;
                    i4 = i24;
                    i2 = i16;
                    j5 = j14;
                } else {
                    long j211111111111111112 = j12;
                    String str11111111111111111112 = string;
                    str4 = str7;
                    i7 = i19;
                    drawable = drawableB;
                    str2 = str11111111111111111112;
                    int i3111111111116 = i21;
                    z4 = z7;
                    i9 = i3111111111116;
                    String str11111111111111111113 = str9;
                    i11 = i22;
                    str3 = str11111111111111111113;
                    i3 = i15;
                    i2 = i16;
                    f = f2;
                    j5 = j211111111111111112;
                    observableFieldX = observableField;
                    i10 = i20;
                    i8 = iB;
                    drawable2 = drawableB2;
                    i = i23;
                    zK0 = z8;
                    z3 = zK1;
                    i6 = i18;
                    z2 = z6;
                    i5 = i17;
                    z = z9;
                    str5 = str8;
                    str = str6;
                    i4 = 0;
                }
            } else {
                j8 = j;
            }
            j9 = j8 & 98560;
            if (j9 != 0) {
                if (g6Var != null) {
                    uVarI0 = g6Var.i0();
                } else {
                    uVarI0 = null;
                }
                p1(8, uVarI0);
                if (uVarI0 != null) {
                    bool4 = (Boolean) uVarI0.get();
                } else {
                    bool4 = null;
                }
                zK4 = androidx.databinding.c0.K0(bool4);
                if (j9 != 0) {
                    if (zK4) {
                        j17 = 274877906944L;
                    } else {
                        j17 = 137438953472L;
                    }
                    j8 |= j17;
                }
                if (zK4) {
                    resources = this.g0.getResources();
                    i26 = com.zentraedi.comic.q.C0124q.dy;
                } else {
                    resources = this.g0.getResources();
                    i26 = com.zentraedi.comic.q.C0124q.dB;
                }
                long j211111111111111113 = j8;
                string = resources.getString(i26);
                j10 = j211111111111111113;
            } else {
                str9 = str9;
                j10 = j8;
                string = null;
            }
            if ((j10 & 98816) != 0) {
                if (g6Var != null) {
                    wVarU = g6Var.U();
                } else {
                    wVarU = null;
                }
                q1(9, wVarU);
                if (wVarU != null) {
                    size = wVarU.size();
                } else {
                    size = 0;
                }
                if (size > 0) {
                }
                j11 = j10 & 102400;
                if (j11 != 0) {
                    if (g6Var != null) {
                        uVarJ0 = g6Var.j0();
                    } else {
                        uVarJ0 = null;
                    }
                    p1(12, uVarJ0);
                    if (uVarJ0 != null) {
                        bool3 = (Boolean) uVarJ0.get();
                    } else {
                        bool3 = null;
                    }
                    zK3 = androidx.databinding.c0.K0(bool3);
                    if (j11 != 0) {
                        if (zK3) {
                            j16 = 281474976710656L;
                        } else {
                            j16 = 140737488355328L;
                        }
                        j10 |= j16;
                    }
                    if (zK3) {
                        context = this.h0.getContext();
                        i25 = com.zentraedi.comic.q.h.hn;
                    } else {
                        context = this.h0.getContext();
                        i25 = com.zentraedi.comic.q.h.sn;
                    }
                    long j211111111111111114 = j10;
                    drawableB2 = g.a.b(context, i25);
                    j12 = j211111111111111114;
                } else {
                    z9 = z9;
                    j12 = j10;
                    drawableB2 = null;
                }
                j13 = j12 & 106496;
                if (j13 != 0) {
                    if (g6Var != null) {
                        long j211111111111111115 = j12;
                        uVarH0 = g6Var.h0();
                        j14 = j211111111111111115;
                    } else {
                        j14 = j12;
                        uVarH0 = null;
                    }
                    p1(13, uVarH0);
                    if (uVarH0 != null) {
                        bool2 = (Boolean) uVarH0.get();
                    } else {
                        bool2 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool2);
                    if (j13 != 0) {
                        if (zK2) {
                            j15 = 72057594037927936L;
                        } else {
                            j15 = 36028797018963968L;
                        }
                        j14 |= j15;
                    }
                    if (zK2) {
                        i24 = 0;
                    } else {
                        i24 = 8;
                    }
                    String str11111111111111111114 = string;
                    str4 = str7;
                    i7 = i19;
                    drawable = drawableB;
                    str2 = str11111111111111111114;
                    int i3111111111117 = i21;
                    z4 = z7;
                    i9 = i3111111111117;
                    String str11111111111111111115 = str9;
                    i11 = i22;
                    str3 = str11111111111111111115;
                    i3 = i15;
                    f = f2;
                    observableFieldX = observableField;
                    i10 = i20;
                    i8 = iB;
                    drawable2 = drawableB2;
                    i = i23;
                    zK0 = z8;
                    z3 = zK1;
                    i6 = i18;
                    z2 = z6;
                    i5 = i17;
                    z = z9;
                    str5 = str8;
                    str = str6;
                    i4 = i24;
                    i2 = i16;
                    j5 = j14;
                } else {
                    long j211111111111111116 = j12;
                    String str11111111111111111116 = string;
                    str4 = str7;
                    i7 = i19;
                    drawable = drawableB;
                    str2 = str11111111111111111116;
                    int i3111111111118 = i21;
                    z4 = z7;
                    i9 = i3111111111118;
                    String str11111111111111111117 = str9;
                    i11 = i22;
                    str3 = str11111111111111111117;
                    i3 = i15;
                    i2 = i16;
                    f = f2;
                    j5 = j211111111111111116;
                    observableFieldX = observableField;
                    i10 = i20;
                    i8 = iB;
                    drawable2 = drawableB2;
                    i = i23;
                    zK0 = z8;
                    z3 = zK1;
                    i6 = i18;
                    z2 = z6;
                    i5 = i17;
                    z = z9;
                    str5 = str8;
                    str = str6;
                    i4 = 0;
                }
            } else {
                j10 = j10;
            }
            j11 = j10 & 102400;
            if (j11 != 0) {
                if (g6Var != null) {
                    uVarJ0 = g6Var.j0();
                } else {
                    uVarJ0 = null;
                }
                p1(12, uVarJ0);
                if (uVarJ0 != null) {
                    bool3 = (Boolean) uVarJ0.get();
                } else {
                    bool3 = null;
                }
                zK3 = androidx.databinding.c0.K0(bool3);
                if (j11 != 0) {
                    if (zK3) {
                        j16 = 281474976710656L;
                    } else {
                        j16 = 140737488355328L;
                    }
                    j10 |= j16;
                }
                if (zK3) {
                    context = this.h0.getContext();
                    i25 = com.zentraedi.comic.q.h.hn;
                } else {
                    context = this.h0.getContext();
                    i25 = com.zentraedi.comic.q.h.sn;
                }
                long j211111111111111117 = j10;
                drawableB2 = g.a.b(context, i25);
                j12 = j211111111111111117;
            } else {
                z9 = z9;
                j12 = j10;
                drawableB2 = null;
            }
            j13 = j12 & 106496;
            if (j13 != 0) {
                if (g6Var != null) {
                    long j211111111111111118 = j12;
                    uVarH0 = g6Var.h0();
                    j14 = j211111111111111118;
                } else {
                    j14 = j12;
                    uVarH0 = null;
                }
                p1(13, uVarH0);
                if (uVarH0 != null) {
                    bool2 = (Boolean) uVarH0.get();
                } else {
                    bool2 = null;
                }
                zK2 = androidx.databinding.c0.K0(bool2);
                if (j13 != 0) {
                    if (zK2) {
                        j15 = 72057594037927936L;
                    } else {
                        j15 = 36028797018963968L;
                    }
                    j14 |= j15;
                }
                if (zK2) {
                    i24 = 0;
                } else {
                    i24 = 8;
                }
                String str11111111111111111118 = string;
                str4 = str7;
                i7 = i19;
                drawable = drawableB;
                str2 = str11111111111111111118;
                int i3111111111119 = i21;
                z4 = z7;
                i9 = i3111111111119;
                String str11111111111111111119 = str9;
                i11 = i22;
                str3 = str11111111111111111119;
                i3 = i15;
                f = f2;
                observableFieldX = observableField;
                i10 = i20;
                i8 = iB;
                drawable2 = drawableB2;
                i = i23;
                zK0 = z8;
                z3 = zK1;
                i6 = i18;
                z2 = z6;
                i5 = i17;
                z = z9;
                str5 = str8;
                str = str6;
                i4 = i24;
                i2 = i16;
                j5 = j14;
            } else {
                long j211111111111111119 = j12;
                String str111111111111111111110 = string;
                str4 = str7;
                i7 = i19;
                drawable = drawableB;
                str2 = str111111111111111111110;
                int i31111111111110 = i21;
                z4 = z7;
                i9 = i31111111111110;
                String str111111111111111111111 = str9;
                i11 = i22;
                str3 = str111111111111111111111;
                i3 = i15;
                i2 = i16;
                f = f2;
                j5 = j211111111111111119;
                observableFieldX = observableField;
                i10 = i20;
                i8 = iB;
                drawable2 = drawableB2;
                i = i23;
                zK0 = z8;
                z3 = zK1;
                i6 = i18;
                z2 = z6;
                i5 = i17;
                z = z9;
                str5 = str8;
                str = str6;
                i4 = 0;
            }
        } else {
            j2 = 98432;
            j3 = 34359738368L;
            j4 = 68719476736L;
            j5 = j;
            f = 0.0f;
            i = 0;
            i2 = 0;
            i3 = 0;
            z = false;
            i4 = 0;
            i5 = 0;
            z2 = false;
            i6 = 0;
            i7 = 0;
            str = null;
            drawable = null;
            i8 = 0;
            i9 = 0;
            i10 = 0;
            bool = null;
            z3 = false;
            observableFieldX = null;
            z4 = false;
            drawable2 = null;
            str2 = null;
            str3 = null;
            zK0 = false;
            str4 = null;
            str5 = null;
            i11 = 0;
        }
        if ((j5 & 17592190238720L) != 0) {
            if (g6Var != 0) {
                observableFieldX = g6Var.X();
            }
            ObservableField<Boolean> observableField2 = observableFieldX;
            p1(11, observableField2);
            if (observableField2 != null) {
                bool = (Boolean) observableField2.get();
            }
            zK0 = androidx.databinding.c0.K0(bool);
            if ((j5 & 100352) != 0) {
                j6 = zK0 ? j5 | 1125917086711808L : j5 | 562958543355904L;
            } else {
                j6 = j5;
            }
            if ((j6 & 100384) != 0) {
                j6 = zK0 ? j6 | j4 : j6 | j3;
            }
            z5 = !zK0;
        } else {
            j6 = j5;
            z5 = false;
        }
        long j30 = j6 & 100384;
        if (j30 != 0) {
            boolean z10 = z4 ? z5 : false;
            if (j30 != 0) {
                j6 |= z10 ? 288230376151711744L : 144115188075855872L;
            }
            long j31 = j6;
            i12 = z10 ? 0 : 8;
            j7 = j31;
        } else {
            j7 = j6;
            i12 = 0;
        }
        long j32 = j7 & 100354;
        if (j32 == 0) {
            i13 = 0;
        } else {
            if (!z3) {
                z5 = false;
            }
            if (j32 != 0) {
                j7 |= z5 ? 1073741824L : 536870912L;
            }
            if (z5) {
                i13 = 0;
            } else {
                i13 = 8;
            }
        }
        long j33 = j7 & 100384;
        if (j33 != 0) {
            boolean z11 = zK0 ? true : z4;
            if (j33 != 0) {
                j7 |= z11 ? 4398046511104L : 2199023255552L;
            }
            i14 = z11 ? 8 : 0;
        } else {
            i14 = 0;
        }
        if ((j7 & 98336) != 0) {
            this.H.setVisibility(i10);
            androidx.databinding.adapters.p.a(this.J, drawable);
            this.L.setVisibility(i10);
            this.R.setVisibility(i);
            androidx.databinding.adapters.j0.b(this.M2, androidx.databinding.adapters.l.b(i11));
            this.P2.setTextColor(i7);
            this.Q2.setTextColor(i5);
            this.Z2.setTextColor(i8);
            this.A4.setVisibility(i);
            this.g0.setTextColor(i6);
        }
        if ((j7 & 100352) != 0) {
            if (androidx.databinding.c0.A() >= 11) {
                this.N.setAlpha(f);
                this.U.setAlpha(f);
                this.P4.setAlpha(f);
                this.m0.setAlpha(f);
            }
            this.M2.setVisibility(i9);
            this.P3.setVisibility(i9);
        }
        if ((j7 & 98308) != 0) {
            androidx.databinding.adapters.f0.A(this.N, str);
            androidx.databinding.adapters.f0.A(this.i0, str);
            androidx.databinding.adapters.f0.A(this.j0, str);
            androidx.databinding.adapters.f0.A(this.m0, str);
        }
        if ((j7 & 98305) != 0) {
            this.S.setEnabled(z2);
        }
        if ((j7 & 98816) != 0) {
            this.T.setEnabled(z);
        }
        if ((j7 & 106496) != 0) {
            this.a0.setVisibility(i4);
            this.f0.setVisibility(i4);
        }
        if ((j7 & 98306) != 0) {
            this.b0.getRoot().setVisibility(i2);
            this.M4.setVisibility(i3);
        }
        if ((j7 & 81920) != 0) {
            this.c0.C1(m2Var);
        }
        if ((j7 & 65536) != 0) {
            com.zentraedi.business.viewmodel.h.b(this.M1, g8.a(Float.valueOf(44.0f)));
            androidx.databinding.adapters.j0.o(this.M1, g8.h());
            com.zentraedi.business.viewmodel.h.b(this.a2, g8.a(Float.valueOf(44.0f)));
            androidx.databinding.adapters.j0.o(this.a2, g8.h());
            com.zentraedi.business.viewmodel.h.b(this.M2, g8.a(Float.valueOf(44.0f)));
            androidx.databinding.adapters.j0.o(this.M2, g8.h());
            androidx.databinding.adapters.j0.o(this.T2, g8.a(Float.valueOf(44.0f)));
            com.zentraedi.business.utils.u.b0(this.k0, g8.h());
        }
        if ((j7 & 100384) != 0) {
            this.M1.setVisibility(i14);
            this.a2.setVisibility(i12);
        }
        if ((j7 & 98320) != 0) {
            androidx.databinding.adapters.f0.A(this.P2, str5);
        }
        if ((j7 & 98312) != 0) {
            androidx.databinding.adapters.f0.A(this.Z2, str4);
        }
        if ((j7 & 100354) != 0) {
            this.T3.setVisibility(i13);
        }
        if ((j7 & j2) != 0) {
            androidx.databinding.adapters.f0.A(this.P4, str3);
        }
        if ((j7 & 98560) != 0) {
            androidx.databinding.adapters.f0.A(this.g0, str2);
        }
        if ((j7 & 102400) != 0) {
            androidx.databinding.adapters.p.a(this.h0, drawable2);
        }
        androidx.databinding.c0.t(this.b0);
        androidx.databinding.c0.t(this.c0);
    }

    private w(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 14, (AppBarLayout) objArr[33], (ImageView) objArr[37], (ImageView) objArr[39], (ImageView) objArr[1], (View) objArr[32], (ImageView) objArr[17], (ImageView) objArr[35], (ConstraintLayout) objArr[6], (LinearLayout) objArr[36], (TextView) objArr[7], (TextView) objArr[45], (FrameLayout) objArr[43], (TextView) objArr[46], (ImageView) objArr[12], (TextView) objArr[24], (TextView) objArr[25], (ImageView) objArr[8], (ImageView) objArr[38], (ImageView) objArr[40], (View) objArr[34], (ImageView) objArr[48], (RelativeLayout) objArr[44], (RectTransparentLayout) objArr[27], (f5) objArr[30], (p4) objArr[31], (LinearLayout) objArr[42], (ImageView) objArr[41], (RelativeLayout) objArr[28], (TextView) objArr[21], (ImageView) objArr[15], (TextView) objArr[11], (TextView) objArr[14], (TransparentView) objArr[29], (TextView) objArr[47], (TextView) objArr[4]);
        this.Q4 = -1L;
        this.H.setTag(null);
        this.J.setTag(null);
        this.L.setTag(null);
        this.N.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        this.T.setTag(null);
        this.U.setTag(null);
        this.a0.setTag(null);
        N0(this.b0);
        N0(this.c0);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.r1 = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[10];
        this.M1 = relativeLayout2;
        relativeLayout2.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) objArr[13];
        this.a2 = relativeLayout3;
        relativeLayout3.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) objArr[16];
        this.M2 = relativeLayout4;
        relativeLayout4.setTag(null);
        MediumTextView mediumTextView = (MediumTextView) objArr[18];
        this.P2 = mediumTextView;
        mediumTextView.setTag(null);
        MediumTextView mediumTextView2 = (MediumTextView) objArr[19];
        this.Q2 = mediumTextView2;
        mediumTextView2.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.T2 = linearLayout;
        linearLayout.setTag(null);
        MediumTextView mediumTextView3 = (MediumTextView) objArr[20];
        this.Z2 = mediumTextView3;
        mediumTextView3.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[22];
        this.A3 = linearLayout2;
        linearLayout2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[23];
        this.P3 = linearLayout3;
        linearLayout3.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[26];
        this.T3 = linearLayout4;
        linearLayout4.setTag(null);
        LinearLayout linearLayout5 = (LinearLayout) objArr[3];
        this.A4 = linearLayout5;
        linearLayout5.setTag(null);
        View view2 = (View) objArr[5];
        this.M4 = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[9];
        this.P4 = textView;
        textView.setTag(null);
        this.f0.setTag(null);
        this.g0.setTag(null);
        this.h0.setTag(null);
        this.i0.setTag(null);
        this.j0.setTag(null);
        this.k0.setTag(null);
        this.m0.setTag(null);
        P0(view);
        i0();
    }
}
