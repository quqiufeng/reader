package com.zentraedi.comic.databinding;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.comic.viewmodel.ComicReaderViewModel;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class a4 extends z3 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i Z4;

    @androidx.annotation.p0
    private static final SparseIntArray u5;

    @androidx.annotation.p0
    private final View.OnClickListener A3;

    @androidx.annotation.p0
    private final View.OnClickListener A4;

    @androidx.annotation.p0
    private final View.OnClickListener M1;

    @androidx.annotation.p0
    private final View.OnClickListener M2;

    @androidx.annotation.p0
    private final View.OnClickListener M4;

    @androidx.annotation.p0
    private final View.OnClickListener P2;

    @androidx.annotation.p0
    private final View.OnClickListener P3;

    @androidx.annotation.p0
    private final View.OnClickListener P4;

    @androidx.annotation.p0
    private final View.OnClickListener Q2;
    private long Q4;

    @androidx.annotation.p0
    private final View.OnClickListener T2;

    @androidx.annotation.p0
    private final View.OnClickListener T3;

    @androidx.annotation.p0
    private final View.OnClickListener Z2;

    @androidx.annotation.p0
    private final View.OnClickListener a1;

    @androidx.annotation.p0
    private final View.OnClickListener a2;

    @androidx.annotation.n0
    private final LinearLayout g0;

    @androidx.annotation.n0
    private final ConstraintLayout h0;

    @androidx.annotation.n0
    private final LinearLayout i0;

    @androidx.annotation.n0
    private final ConstraintLayout j0;

    @androidx.annotation.n0
    private final LinearLayout k0;

    @androidx.annotation.n0
    private final ConstraintLayout l0;

    @androidx.annotation.n0
    private final LinearLayout m0;

    @androidx.annotation.p0
    private final View.OnClickListener n0;

    @androidx.annotation.p0
    private final View.OnClickListener r1;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(32);
        Z4 = iVar;
        iVar.a(11, new String[]{"item_read_setting"}, new int[]{30}, new int[]{com.zentraedi.comic.q.l.r9});
        SparseIntArray sparseIntArray = new SparseIntArray();
        u5 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.FA, 31);
    }

    public a4(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 32, Z4, u5));
    }

    private boolean I1(x3 x3Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 128;
        }
        return true;
    }

    private boolean J1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 2;
        }
        return true;
    }

    private boolean K1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
        return true;
    }

    private boolean L1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 1;
        }
        return true;
    }

    private boolean N1(ObservableField<ComicReaderViewModel.BottomMenu> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 512;
        }
        return true;
    }

    private boolean O1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 8;
        }
        return true;
    }

    private boolean P1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 256;
        }
        return true;
    }

    private boolean Q1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 32;
        }
        return true;
    }

    private boolean R1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 16;
        }
        return true;
    }

    private boolean S1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 64;
        }
        return true;
    }

    private boolean T1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Q4 |= 4;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.z3
    public void E1(@androidx.annotation.p0 ComicReaderViewModel.BottomMenu bottomMenu) {
        this.f0 = bottomMenu;
    }

    @Override // com.zentraedi.comic.databinding.z3
    public void F1(@androidx.annotation.p0 ComicReaderViewModel comicReaderViewModel) {
        this.d0 = comicReaderViewModel;
        synchronized (this) {
            this.Q4 |= 8192;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.z3
    public void G1(@androidx.annotation.p0 n6 n6Var) {
        this.e0 = n6Var;
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.E.O0(p0Var);
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        Resources resources;
        Configuration configuration;
        Resources resources2;
        Configuration configuration2;
        switch (i) {
            case 1:
                ComicReaderViewModel comicReaderViewModel = this.d0;
                if (comicReaderViewModel != null) {
                    comicReaderViewModel.N0();
                }
                break;
            case 2:
                ComicReaderViewModel comicReaderViewModel2 = this.d0;
                if (comicReaderViewModel2 != null) {
                    comicReaderViewModel2.M0();
                }
                break;
            case 3:
                ComicReaderViewModel comicReaderViewModel3 = this.d0;
                if (comicReaderViewModel3 != null) {
                    comicReaderViewModel3.N0();
                }
                break;
            case 4:
                ComicReaderViewModel comicReaderViewModel4 = this.d0;
                if (comicReaderViewModel4 != null) {
                    comicReaderViewModel4.M0();
                }
                break;
            case 5:
                ComicReaderViewModel comicReaderViewModel5 = this.d0;
                if (comicReaderViewModel5 != null) {
                    comicReaderViewModel5.D1();
                }
                break;
            case 6:
                ComicReaderViewModel comicReaderViewModel6 = this.d0;
                if (comicReaderViewModel6 != null) {
                    comicReaderViewModel6.E1();
                }
                break;
            case 7:
                ComicReaderViewModel comicReaderViewModel7 = this.d0;
                if (comicReaderViewModel7 != null) {
                    comicReaderViewModel7.F1();
                }
                break;
            case 8:
                ComicReaderViewModel comicReaderViewModel8 = this.d0;
                if (comicReaderViewModel8 != null) {
                    comicReaderViewModel8.J1(getRoot().getContext());
                }
                break;
            case 9:
                ComicReaderViewModel comicReaderViewModel9 = this.d0;
                if (comicReaderViewModel9 != null && getRoot().getContext() != null && (resources = getRoot().getContext().getResources()) != null && (configuration = resources.getConfiguration()) != null) {
                    comicReaderViewModel9.O1(getRoot().getContext(), configuration.orientation);
                    break;
                }
                break;
            case 10:
                ComicReaderViewModel comicReaderViewModel10 = this.d0;
                if (comicReaderViewModel10 != null) {
                    comicReaderViewModel10.N1(getRoot().getContext());
                }
                break;
            case 11:
                ComicReaderViewModel comicReaderViewModel11 = this.d0;
                if (comicReaderViewModel11 != null) {
                    comicReaderViewModel11.J1(getRoot().getContext());
                }
                break;
            case 12:
                ComicReaderViewModel comicReaderViewModel12 = this.d0;
                if (comicReaderViewModel12 != null) {
                    comicReaderViewModel12.D1();
                }
                break;
            case 13:
                ComicReaderViewModel comicReaderViewModel13 = this.d0;
                if (comicReaderViewModel13 != null) {
                    comicReaderViewModel13.E1();
                }
                break;
            case 14:
                ComicReaderViewModel comicReaderViewModel14 = this.d0;
                if (comicReaderViewModel14 != null) {
                    comicReaderViewModel14.F1();
                }
                break;
            case 15:
                ComicReaderViewModel comicReaderViewModel15 = this.d0;
                if (comicReaderViewModel15 != null && getRoot().getContext() != null && (resources2 = getRoot().getContext().getResources()) != null && (configuration2 = resources2.getConfiguration()) != null) {
                    comicReaderViewModel15.O1(getRoot().getContext(), configuration2.orientation);
                    break;
                }
                break;
            case 16:
                ComicReaderViewModel comicReaderViewModel16 = this.d0;
                if (comicReaderViewModel16 != null) {
                    comicReaderViewModel16.N1(getRoot().getContext());
                }
                break;
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.Q4 != 0) {
                    return true;
                }
                return this.E.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.Q4 = 16384L;
        }
        this.E.i0();
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.f2 == i) {
            E1((ComicReaderViewModel.BottomMenu) obj);
            return true;
        }
        if (com.zentraedi.comic.a.B4 == i) {
            G1((n6) obj);
            return true;
        }
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        F1((ComicReaderViewModel) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return L1((ObservableField) obj, i2);
            case 1:
                return J1((ObservableField) obj, i2);
            case 2:
                return T1((ObservableField) obj, i2);
            case 3:
                return O1((ObservableField) obj, i2);
            case 4:
                return R1((ObservableField) obj, i2);
            case 5:
                return Q1((ObservableField) obj, i2);
            case 6:
                return S1((ObservableField) obj, i2);
            case 7:
                return I1((x3) obj, i2);
            case 8:
                return P1((ObservableField) obj, i2);
            case 9:
                return N1((ObservableField) obj, i2);
            case 10:
                return K1((ObservableField) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0183  */
    /* JADX WARN: Code duplicated, block: B:103:0x018a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0193  */
    /* JADX WARN: Code duplicated, block: B:109:0x019a  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:121:0x01be  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:125:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:131:0x01db  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:146:0x0202  */
    /* JADX WARN: Code duplicated, block: B:148:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x0208  */
    /* JADX WARN: Code duplicated, block: B:151:0x0210  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x0223  */
    /* JADX WARN: Code duplicated, block: B:156:0x022f  */
    /* JADX WARN: Code duplicated, block: B:157:0x023a  */
    /* JADX WARN: Code duplicated, block: B:159:0x024a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0256 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x0258  */
    /* JADX WARN: Code duplicated, block: B:165:0x025f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0266  */
    /* JADX WARN: Code duplicated, block: B:169:0x026d  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:173:0x0278 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x027a  */
    /* JADX WARN: Code duplicated, block: B:176:0x0283  */
    /* JADX WARN: Code duplicated, block: B:179:0x028c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0293  */
    /* JADX WARN: Code duplicated, block: B:183:0x0298  */
    /* JADX WARN: Code duplicated, block: B:184:0x029b  */
    /* JADX WARN: Code duplicated, block: B:186:0x029f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:189:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:194:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:195:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:199:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:205:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:208:0x02f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:211:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:214:0x0308  */
    /* JADX WARN: Code duplicated, block: B:216:0x030f  */
    /* JADX WARN: Code duplicated, block: B:218:0x0314  */
    /* JADX WARN: Code duplicated, block: B:220:0x0321  */
    /* JADX WARN: Code duplicated, block: B:223:0x0348  */
    /* JADX WARN: Code duplicated, block: B:80:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0140  */
    /* JADX WARN: Code duplicated, block: B:83:0x0149  */
    /* JADX WARN: Code duplicated, block: B:86:0x0151  */
    /* JADX WARN: Code duplicated, block: B:87:0x0158  */
    /* JADX WARN: Code duplicated, block: B:90:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0161  */
    /* JADX WARN: Code duplicated, block: B:92:0x0163  */
    /* JADX WARN: Code duplicated, block: B:93:0x0169  */
    /* JADX WARN: Code duplicated, block: B:96:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0174  */
    /* JADX WARN: Code duplicated, block: B:99:0x017b  */
    protected void r() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i;
        Drawable drawable;
        int i2;
        int i3;
        int i4;
        int i5;
        Drawable drawable2;
        int i6;
        Drawable drawableB;
        Boolean bool;
        Drawable drawableB2;
        Drawable drawableB3;
        String str;
        String str2;
        String str3;
        boolean zK0;
        ObservableField<Boolean> observableFieldB1;
        int i7;
        int i8;
        Drawable drawable3;
        long j7;
        int i9;
        int i10;
        long j8;
        int i11;
        int i12;
        long j9;
        long j10;
        long j11;
        int i13;
        long j12;
        long j13;
        int i14;
        long j14;
        Drawable drawableB4;
        long j15;
        androidx.databinding.u uVarV0;
        Boolean bool2;
        boolean zK1;
        int i15;
        Context context;
        int i16;
        long j16;
        androidx.databinding.u uVarI1;
        ComicReaderViewModel.BottomMenu bottomMenu;
        boolean z;
        int i17;
        long j17;
        ObservableField<String> observableFieldP1;
        ComicInfoModel comicInfoModelH1;
        boolean z2;
        int iB;
        int iB2;
        long j18;
        androidx.databinding.u uVarZ1;
        Boolean bool3;
        boolean zK2;
        long j19;
        ObservableField<Boolean> observableFieldS1;
        Boolean bool4;
        boolean zK3;
        long j20;
        androidx.databinding.u uVarX1;
        Boolean bool5;
        Context context2;
        int i18;
        Context context3;
        int i19;
        synchronized (this) {
            j = this.Q4;
            this.Q4 = 0L;
        }
        ComicReaderViewModel comicReaderViewModel = this.d0;
        if ((26495 & j) != 0) {
            if ((j & 24577) == 0) {
                str = null;
            } else {
                ObservableField<String> observableFieldG1 = comicReaderViewModel != null ? comicReaderViewModel.g1() : null;
                p1(0, observableFieldG1);
                if (observableFieldG1 != null) {
                    str = (String) observableFieldG1.get();
                } else {
                    str = null;
                }
            }
            long j21 = j & 24578;
            if (j21 != 0) {
                androidx.databinding.u uVarU0 = comicReaderViewModel != null ? comicReaderViewModel.U0() : null;
                p1(1, uVarU0);
                boolean zK4 = androidx.databinding.c0.K0(uVarU0 != null ? (Boolean) uVarU0.get() : null);
                if (j21 != 0) {
                    j |= zK4 ? 4563402752L : 2281701376L;
                }
                if (zK4) {
                    context2 = this.I.getContext();
                    j3 = 24576;
                    i18 = com.zentraedi.comic.q.h.ck;
                } else {
                    j3 = 24576;
                    context2 = this.I.getContext();
                    i18 = com.zentraedi.comic.q.h.lk;
                }
                drawableB2 = g.a.b(context2, i18);
                if (zK4) {
                    context3 = this.H.getContext();
                    i19 = com.zentraedi.comic.q.h.ck;
                } else {
                    context3 = this.H.getContext();
                    i19 = com.zentraedi.comic.q.h.lk;
                }
                drawableB3 = g.a.b(context3, i19);
            } else {
                j3 = 24576;
                drawableB2 = null;
                drawableB3 = null;
            }
            if ((j & 24580) != 0) {
                observableFieldB1 = comicReaderViewModel != null ? comicReaderViewModel.B1() : null;
                p1(2, observableFieldB1);
                bool = observableFieldB1 != null ? (Boolean) observableFieldB1.get() : null;
                boolean zK5 = androidx.databinding.c0.K0(bool);
                if ((j & 90116) != 0) {
                    j = zK5 ? j | 274877906944L : j | 137438953472L;
                }
                if ((j & 4218884) != 0) {
                    j = zK5 ? j | 17592186044416L : j | 8796093022208L;
                }
                i12 = zK5 ? 0 : 8;
                i11 = zK5 ? 8 : 0;
            } else {
                observableFieldB1 = null;
                bool = null;
                i11 = 0;
                i12 = 0;
            }
            if ((j & 24584) != 0) {
                androidx.databinding.u uVarO1 = comicReaderViewModel != null ? comicReaderViewModel.o1() : null;
                j4 = 24640;
                p1(3, uVarO1);
                str2 = uVarO1 != null ? (String) uVarO1.get() : null;
                j9 = j & 24596;
                if (j9 != 0) {
                    if (comicReaderViewModel != null) {
                        uVarX1 = comicReaderViewModel.x1();
                    } else {
                        uVarX1 = null;
                    }
                    j5 = 24608;
                    p1(4, uVarX1);
                    if (uVarX1 != null) {
                        bool5 = (Boolean) uVarX1.get();
                    } else {
                        bool5 = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool5);
                    if (j9 != 0) {
                        if (zK0) {
                            j |= 4259840;
                        } else {
                            j |= 2129920;
                        }
                    }
                } else {
                    j5 = 24608;
                    zK0 = false;
                }
                j10 = j & j5;
                if (j10 != 0) {
                    if (comicReaderViewModel != null) {
                        observableFieldS1 = comicReaderViewModel.s1();
                    } else {
                        observableFieldS1 = null;
                    }
                    j2 = 4259840;
                    p1(5, observableFieldS1);
                    if (observableFieldS1 != null) {
                        bool4 = (Boolean) observableFieldS1.get();
                    } else {
                        bool4 = null;
                    }
                    zK3 = androidx.databinding.c0.K0(bool4);
                    if (j10 != 0) {
                        if (zK3) {
                            j20 = 69793218560L;
                        } else {
                            j20 = 34896609280L;
                        }
                        j |= j20;
                    }
                    if (zK3) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    i6 = zK3 ? 8 : 0;
                    j11 = j & j4;
                    if (j11 != 0) {
                        if (comicReaderViewModel != null) {
                            uVarZ1 = comicReaderViewModel.z1();
                        } else {
                            uVarZ1 = null;
                        }
                        p1(6, uVarZ1);
                        if (uVarZ1 != null) {
                            bool3 = (Boolean) uVarZ1.get();
                        } else {
                            bool3 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool3);
                        if (j11 != 0) {
                            if (zK2) {
                                j19 = 17039360;
                            } else {
                                j19 = 8519680;
                            }
                            j |= j19;
                        }
                        if (zK2) {
                            i5 = 8;
                        } else {
                            i5 = 0;
                        }
                        if (zK2) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                    } else {
                        i13 = 0;
                        i5 = 0;
                    }
                    j12 = j & j3;
                    if (j12 != 0) {
                        if (comicReaderViewModel != null) {
                            comicInfoModelH1 = comicReaderViewModel.h1();
                        } else {
                            comicInfoModelH1 = null;
                        }
                        if (comicInfoModelH1 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (j12 != 0) {
                            if (z2) {
                                j18 = 17180917760L;
                            } else {
                                j18 = 8590458880L;
                            }
                            j |= j18;
                        }
                        if (z2) {
                            iB = androidx.databinding.c0.B(this.X, com.zentraedi.comic.q.f.f416qd);
                        } else {
                            iB = androidx.databinding.c0.B(this.X, com.zentraedi.comic.q.f.f401gg);
                        }
                        if (z2) {
                            iB2 = androidx.databinding.c0.B(this.W, com.zentraedi.comic.q.f.f416qd);
                        } else {
                            iB2 = androidx.databinding.c0.B(this.W, com.zentraedi.comic.q.f.f401gg);
                        }
                        j13 = j;
                        i14 = iB2;
                        i = iB;
                    } else {
                        comicReaderViewModel = comicReaderViewModel;
                        j13 = j;
                        i = 0;
                        i14 = 0;
                    }
                    if ((j13 & 24832) == 0) {
                        if (comicReaderViewModel != null) {
                            observableFieldP1 = comicReaderViewModel.p1();
                        } else {
                            observableFieldP1 = null;
                        }
                        p1(8, observableFieldP1);
                        str3 = observableFieldP1 != null ? (String) observableFieldP1.get() : null;
                        j14 = j13 & 25088;
                        if (j14 != 0) {
                            if (comicReaderViewModel != null) {
                                uVarI1 = comicReaderViewModel.i1();
                            } else {
                                uVarI1 = null;
                            }
                            p1(9, uVarI1);
                            if (uVarI1 != null) {
                                bottomMenu = (ComicReaderViewModel.BottomMenu) uVarI1.get();
                            } else {
                                bottomMenu = null;
                            }
                            if (bottomMenu == ComicReaderViewModel.BottomMenu.SETTING) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (j14 != 0) {
                                if (z) {
                                    j17 = 67108864;
                                } else {
                                    j17 = 33554432;
                                }
                                j13 |= j17;
                            }
                            Context context4 = this.b0.getContext();
                            if (z) {
                                i17 = com.zentraedi.comic.q.h.V00;
                            } else {
                                i17 = com.zentraedi.comic.q.h.A00;
                            }
                            drawableB4 = g.a.b(context4, i17);
                        } else {
                            drawableB4 = null;
                        }
                        j15 = j13 & 25600;
                        if (j15 != 0) {
                            if (comicReaderViewModel != null) {
                                uVarV0 = comicReaderViewModel.V0();
                            } else {
                                uVarV0 = null;
                            }
                            p1(10, uVarV0);
                            if (uVarV0 != null) {
                                bool2 = (Boolean) uVarV0.get();
                            } else {
                                bool2 = null;
                            }
                            zK1 = androidx.databinding.c0.K0(bool2);
                            if (j15 != 0) {
                                if (zK1) {
                                    j16 = 5497558138880L;
                                } else {
                                    j16 = 2748779069440L;
                                }
                                j13 |= j16;
                            }
                            Context context5 = this.K.getContext();
                            if (zK1) {
                                i15 = com.zentraedi.comic.q.h.ck;
                            } else {
                                i15 = com.zentraedi.comic.q.h.lk;
                            }
                            Drawable drawableB5 = g.a.b(context5, i15);
                            if (zK1) {
                                context = this.J.getContext();
                                i16 = com.zentraedi.comic.q.h.ck;
                            } else {
                                context = this.J.getContext();
                                i16 = com.zentraedi.comic.q.h.lk;
                            }
                            drawableB = g.a.b(context, i16);
                            drawable2 = drawableB5;
                            drawable = drawableB4;
                        } else {
                            drawable = drawableB4;
                            drawableB = null;
                            drawable2 = null;
                        }
                        i4 = i13;
                        i3 = i14;
                        i7 = i11;
                        long j22 = j13;
                        i8 = i12;
                        j6 = j22;
                    }
                    j14 = j13 & 25088;
                    if (j14 != 0) {
                        if (comicReaderViewModel != null) {
                            uVarI1 = comicReaderViewModel.i1();
                        } else {
                            uVarI1 = null;
                        }
                        p1(9, uVarI1);
                        if (uVarI1 != null) {
                            bottomMenu = (ComicReaderViewModel.BottomMenu) uVarI1.get();
                        } else {
                            bottomMenu = null;
                        }
                        if (bottomMenu == ComicReaderViewModel.BottomMenu.SETTING) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (j14 != 0) {
                            if (z) {
                                j17 = 67108864;
                            } else {
                                j17 = 33554432;
                            }
                            j13 |= j17;
                        }
                        Context context6 = this.b0.getContext();
                        if (z) {
                            i17 = com.zentraedi.comic.q.h.V00;
                        } else {
                            i17 = com.zentraedi.comic.q.h.A00;
                        }
                        drawableB4 = g.a.b(context6, i17);
                    } else {
                        drawableB4 = null;
                    }
                    j15 = j13 & 25600;
                    if (j15 != 0) {
                        if (comicReaderViewModel != null) {
                            uVarV0 = comicReaderViewModel.V0();
                        } else {
                            uVarV0 = null;
                        }
                        p1(10, uVarV0);
                        if (uVarV0 != null) {
                            bool2 = (Boolean) uVarV0.get();
                        } else {
                            bool2 = null;
                        }
                        zK1 = androidx.databinding.c0.K0(bool2);
                        if (j15 != 0) {
                            if (zK1) {
                                j16 = 5497558138880L;
                            } else {
                                j16 = 2748779069440L;
                            }
                            j13 |= j16;
                        }
                        Context context7 = this.K.getContext();
                        if (zK1) {
                            i15 = com.zentraedi.comic.q.h.ck;
                        } else {
                            i15 = com.zentraedi.comic.q.h.lk;
                        }
                        Drawable drawableB6 = g.a.b(context7, i15);
                        if (zK1) {
                            context = this.J.getContext();
                            i16 = com.zentraedi.comic.q.h.ck;
                        } else {
                            context = this.J.getContext();
                            i16 = com.zentraedi.comic.q.h.lk;
                        }
                        drawableB = g.a.b(context, i16);
                        drawable2 = drawableB6;
                        drawable = drawableB4;
                    } else {
                        drawable = drawableB4;
                        drawableB = null;
                        drawable2 = null;
                    }
                    i4 = i13;
                    i3 = i14;
                    i7 = i11;
                    long j23 = j13;
                    i8 = i12;
                    j6 = j23;
                } else {
                    j2 = 4259840;
                    i2 = 0;
                }
                j11 = j & j4;
                if (j11 != 0) {
                    if (comicReaderViewModel != null) {
                        uVarZ1 = comicReaderViewModel.z1();
                    } else {
                        uVarZ1 = null;
                    }
                    p1(6, uVarZ1);
                    if (uVarZ1 != null) {
                        bool3 = (Boolean) uVarZ1.get();
                    } else {
                        bool3 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool3);
                    if (j11 != 0) {
                        if (zK2) {
                            j19 = 17039360;
                        } else {
                            j19 = 8519680;
                        }
                        j |= j19;
                    }
                    if (zK2) {
                        i5 = 8;
                    } else {
                        i5 = 0;
                    }
                    if (zK2) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                } else {
                    i13 = 0;
                    i5 = 0;
                }
                j12 = j & j3;
                if (j12 != 0) {
                    if (comicReaderViewModel != null) {
                        comicInfoModelH1 = comicReaderViewModel.h1();
                    } else {
                        comicInfoModelH1 = null;
                    }
                    if (comicInfoModelH1 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (j12 != 0) {
                        if (z2) {
                            j18 = 17180917760L;
                        } else {
                            j18 = 8590458880L;
                        }
                        j |= j18;
                    }
                    if (z2) {
                        iB = androidx.databinding.c0.B(this.X, com.zentraedi.comic.q.f.f416qd);
                    } else {
                        iB = androidx.databinding.c0.B(this.X, com.zentraedi.comic.q.f.f401gg);
                    }
                    if (z2) {
                        iB2 = androidx.databinding.c0.B(this.W, com.zentraedi.comic.q.f.f416qd);
                    } else {
                        iB2 = androidx.databinding.c0.B(this.W, com.zentraedi.comic.q.f.f401gg);
                    }
                    j13 = j;
                    i14 = iB2;
                    i = iB;
                } else {
                    comicReaderViewModel = comicReaderViewModel;
                    j13 = j;
                    i = 0;
                    i14 = 0;
                }
                if ((j13 & 24832) == 0) {
                    if (comicReaderViewModel != null) {
                        observableFieldP1 = comicReaderViewModel.p1();
                    } else {
                        observableFieldP1 = null;
                    }
                    p1(8, observableFieldP1);
                    if (observableFieldP1 != null) {
                    }
                    j14 = j13 & 25088;
                    if (j14 != 0) {
                        if (comicReaderViewModel != null) {
                            uVarI1 = comicReaderViewModel.i1();
                        } else {
                            uVarI1 = null;
                        }
                        p1(9, uVarI1);
                        if (uVarI1 != null) {
                            bottomMenu = (ComicReaderViewModel.BottomMenu) uVarI1.get();
                        } else {
                            bottomMenu = null;
                        }
                        if (bottomMenu == ComicReaderViewModel.BottomMenu.SETTING) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (j14 != 0) {
                            if (z) {
                                j17 = 67108864;
                            } else {
                                j17 = 33554432;
                            }
                            j13 |= j17;
                        }
                        Context context8 = this.b0.getContext();
                        if (z) {
                            i17 = com.zentraedi.comic.q.h.V00;
                        } else {
                            i17 = com.zentraedi.comic.q.h.A00;
                        }
                        drawableB4 = g.a.b(context8, i17);
                    } else {
                        drawableB4 = null;
                    }
                    j15 = j13 & 25600;
                    if (j15 != 0) {
                        if (comicReaderViewModel != null) {
                            uVarV0 = comicReaderViewModel.V0();
                        } else {
                            uVarV0 = null;
                        }
                        p1(10, uVarV0);
                        if (uVarV0 != null) {
                            bool2 = (Boolean) uVarV0.get();
                        } else {
                            bool2 = null;
                        }
                        zK1 = androidx.databinding.c0.K0(bool2);
                        if (j15 != 0) {
                            if (zK1) {
                                j16 = 5497558138880L;
                            } else {
                                j16 = 2748779069440L;
                            }
                            j13 |= j16;
                        }
                        Context context9 = this.K.getContext();
                        if (zK1) {
                            i15 = com.zentraedi.comic.q.h.ck;
                        } else {
                            i15 = com.zentraedi.comic.q.h.lk;
                        }
                        Drawable drawableB7 = g.a.b(context9, i15);
                        if (zK1) {
                            context = this.J.getContext();
                            i16 = com.zentraedi.comic.q.h.ck;
                        } else {
                            context = this.J.getContext();
                            i16 = com.zentraedi.comic.q.h.lk;
                        }
                        drawableB = g.a.b(context, i16);
                        drawable2 = drawableB7;
                        drawable = drawableB4;
                    } else {
                        drawable = drawableB4;
                        drawableB = null;
                        drawable2 = null;
                    }
                    i4 = i13;
                    i3 = i14;
                    i7 = i11;
                    long j24 = j13;
                    i8 = i12;
                    j6 = j24;
                }
                j14 = j13 & 25088;
                if (j14 != 0) {
                    if (comicReaderViewModel != null) {
                        uVarI1 = comicReaderViewModel.i1();
                    } else {
                        uVarI1 = null;
                    }
                    p1(9, uVarI1);
                    if (uVarI1 != null) {
                        bottomMenu = (ComicReaderViewModel.BottomMenu) uVarI1.get();
                    } else {
                        bottomMenu = null;
                    }
                    if (bottomMenu == ComicReaderViewModel.BottomMenu.SETTING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (j14 != 0) {
                        if (z) {
                            j17 = 67108864;
                        } else {
                            j17 = 33554432;
                        }
                        j13 |= j17;
                    }
                    Context context10 = this.b0.getContext();
                    if (z) {
                        i17 = com.zentraedi.comic.q.h.V00;
                    } else {
                        i17 = com.zentraedi.comic.q.h.A00;
                    }
                    drawableB4 = g.a.b(context10, i17);
                } else {
                    drawableB4 = null;
                }
                j15 = j13 & 25600;
                if (j15 != 0) {
                    if (comicReaderViewModel != null) {
                        uVarV0 = comicReaderViewModel.V0();
                    } else {
                        uVarV0 = null;
                    }
                    p1(10, uVarV0);
                    if (uVarV0 != null) {
                        bool2 = (Boolean) uVarV0.get();
                    } else {
                        bool2 = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool2);
                    if (j15 != 0) {
                        if (zK1) {
                            j16 = 5497558138880L;
                        } else {
                            j16 = 2748779069440L;
                        }
                        j13 |= j16;
                    }
                    Context context11 = this.K.getContext();
                    if (zK1) {
                        i15 = com.zentraedi.comic.q.h.ck;
                    } else {
                        i15 = com.zentraedi.comic.q.h.lk;
                    }
                    Drawable drawableB8 = g.a.b(context11, i15);
                    if (zK1) {
                        context = this.J.getContext();
                        i16 = com.zentraedi.comic.q.h.ck;
                    } else {
                        context = this.J.getContext();
                        i16 = com.zentraedi.comic.q.h.lk;
                    }
                    drawableB = g.a.b(context, i16);
                    drawable2 = drawableB8;
                    drawable = drawableB4;
                } else {
                    drawable = drawableB4;
                    drawableB = null;
                    drawable2 = null;
                }
                i4 = i13;
                i3 = i14;
                i7 = i11;
                long j25 = j13;
                i8 = i12;
                j6 = j25;
            } else {
                j4 = 24640;
            }
            j9 = j & 24596;
            if (j9 != 0) {
                if (comicReaderViewModel != null) {
                    uVarX1 = comicReaderViewModel.x1();
                } else {
                    uVarX1 = null;
                }
                j5 = 24608;
                p1(4, uVarX1);
                if (uVarX1 != null) {
                    bool5 = (Boolean) uVarX1.get();
                } else {
                    bool5 = null;
                }
                zK0 = androidx.databinding.c0.K0(bool5);
                if (j9 != 0) {
                    if (zK0) {
                        j |= 4259840;
                    } else {
                        j |= 2129920;
                    }
                }
            } else {
                j5 = 24608;
                zK0 = false;
            }
            j10 = j & j5;
            if (j10 != 0) {
                if (comicReaderViewModel != null) {
                    observableFieldS1 = comicReaderViewModel.s1();
                } else {
                    observableFieldS1 = null;
                }
                j2 = 4259840;
                p1(5, observableFieldS1);
                if (observableFieldS1 != null) {
                    bool4 = (Boolean) observableFieldS1.get();
                } else {
                    bool4 = null;
                }
                zK3 = androidx.databinding.c0.K0(bool4);
                if (j10 != 0) {
                    if (zK3) {
                        j20 = 69793218560L;
                    } else {
                        j20 = 34896609280L;
                    }
                    j |= j20;
                }
                if (zK3) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                if (zK3) {
                }
                j11 = j & j4;
                if (j11 != 0) {
                    if (comicReaderViewModel != null) {
                        uVarZ1 = comicReaderViewModel.z1();
                    } else {
                        uVarZ1 = null;
                    }
                    p1(6, uVarZ1);
                    if (uVarZ1 != null) {
                        bool3 = (Boolean) uVarZ1.get();
                    } else {
                        bool3 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool3);
                    if (j11 != 0) {
                        if (zK2) {
                            j19 = 17039360;
                        } else {
                            j19 = 8519680;
                        }
                        j |= j19;
                    }
                    if (zK2) {
                        i5 = 8;
                    } else {
                        i5 = 0;
                    }
                    if (zK2) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                } else {
                    i13 = 0;
                    i5 = 0;
                }
                j12 = j & j3;
                if (j12 != 0) {
                    if (comicReaderViewModel != null) {
                        comicInfoModelH1 = comicReaderViewModel.h1();
                    } else {
                        comicInfoModelH1 = null;
                    }
                    if (comicInfoModelH1 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (j12 != 0) {
                        if (z2) {
                            j18 = 17180917760L;
                        } else {
                            j18 = 8590458880L;
                        }
                        j |= j18;
                    }
                    if (z2) {
                        iB = androidx.databinding.c0.B(this.X, com.zentraedi.comic.q.f.f416qd);
                    } else {
                        iB = androidx.databinding.c0.B(this.X, com.zentraedi.comic.q.f.f401gg);
                    }
                    if (z2) {
                        iB2 = androidx.databinding.c0.B(this.W, com.zentraedi.comic.q.f.f416qd);
                    } else {
                        iB2 = androidx.databinding.c0.B(this.W, com.zentraedi.comic.q.f.f401gg);
                    }
                    j13 = j;
                    i14 = iB2;
                    i = iB;
                } else {
                    comicReaderViewModel = comicReaderViewModel;
                    j13 = j;
                    i = 0;
                    i14 = 0;
                }
                if ((j13 & 24832) == 0) {
                    if (comicReaderViewModel != null) {
                        observableFieldP1 = comicReaderViewModel.p1();
                    } else {
                        observableFieldP1 = null;
                    }
                    p1(8, observableFieldP1);
                    if (observableFieldP1 != null) {
                    }
                    j14 = j13 & 25088;
                    if (j14 != 0) {
                        if (comicReaderViewModel != null) {
                            uVarI1 = comicReaderViewModel.i1();
                        } else {
                            uVarI1 = null;
                        }
                        p1(9, uVarI1);
                        if (uVarI1 != null) {
                            bottomMenu = (ComicReaderViewModel.BottomMenu) uVarI1.get();
                        } else {
                            bottomMenu = null;
                        }
                        if (bottomMenu == ComicReaderViewModel.BottomMenu.SETTING) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (j14 != 0) {
                            if (z) {
                                j17 = 67108864;
                            } else {
                                j17 = 33554432;
                            }
                            j13 |= j17;
                        }
                        Context context12 = this.b0.getContext();
                        if (z) {
                            i17 = com.zentraedi.comic.q.h.V00;
                        } else {
                            i17 = com.zentraedi.comic.q.h.A00;
                        }
                        drawableB4 = g.a.b(context12, i17);
                    } else {
                        drawableB4 = null;
                    }
                    j15 = j13 & 25600;
                    if (j15 != 0) {
                        if (comicReaderViewModel != null) {
                            uVarV0 = comicReaderViewModel.V0();
                        } else {
                            uVarV0 = null;
                        }
                        p1(10, uVarV0);
                        if (uVarV0 != null) {
                            bool2 = (Boolean) uVarV0.get();
                        } else {
                            bool2 = null;
                        }
                        zK1 = androidx.databinding.c0.K0(bool2);
                        if (j15 != 0) {
                            if (zK1) {
                                j16 = 5497558138880L;
                            } else {
                                j16 = 2748779069440L;
                            }
                            j13 |= j16;
                        }
                        Context context13 = this.K.getContext();
                        if (zK1) {
                            i15 = com.zentraedi.comic.q.h.ck;
                        } else {
                            i15 = com.zentraedi.comic.q.h.lk;
                        }
                        Drawable drawableB9 = g.a.b(context13, i15);
                        if (zK1) {
                            context = this.J.getContext();
                            i16 = com.zentraedi.comic.q.h.ck;
                        } else {
                            context = this.J.getContext();
                            i16 = com.zentraedi.comic.q.h.lk;
                        }
                        drawableB = g.a.b(context, i16);
                        drawable2 = drawableB9;
                        drawable = drawableB4;
                    } else {
                        drawable = drawableB4;
                        drawableB = null;
                        drawable2 = null;
                    }
                    i4 = i13;
                    i3 = i14;
                    i7 = i11;
                    long j26 = j13;
                    i8 = i12;
                    j6 = j26;
                }
                j14 = j13 & 25088;
                if (j14 != 0) {
                    if (comicReaderViewModel != null) {
                        uVarI1 = comicReaderViewModel.i1();
                    } else {
                        uVarI1 = null;
                    }
                    p1(9, uVarI1);
                    if (uVarI1 != null) {
                        bottomMenu = (ComicReaderViewModel.BottomMenu) uVarI1.get();
                    } else {
                        bottomMenu = null;
                    }
                    if (bottomMenu == ComicReaderViewModel.BottomMenu.SETTING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (j14 != 0) {
                        if (z) {
                            j17 = 67108864;
                        } else {
                            j17 = 33554432;
                        }
                        j13 |= j17;
                    }
                    Context context14 = this.b0.getContext();
                    if (z) {
                        i17 = com.zentraedi.comic.q.h.V00;
                    } else {
                        i17 = com.zentraedi.comic.q.h.A00;
                    }
                    drawableB4 = g.a.b(context14, i17);
                } else {
                    drawableB4 = null;
                }
                j15 = j13 & 25600;
                if (j15 != 0) {
                    if (comicReaderViewModel != null) {
                        uVarV0 = comicReaderViewModel.V0();
                    } else {
                        uVarV0 = null;
                    }
                    p1(10, uVarV0);
                    if (uVarV0 != null) {
                        bool2 = (Boolean) uVarV0.get();
                    } else {
                        bool2 = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool2);
                    if (j15 != 0) {
                        if (zK1) {
                            j16 = 5497558138880L;
                        } else {
                            j16 = 2748779069440L;
                        }
                        j13 |= j16;
                    }
                    Context context15 = this.K.getContext();
                    if (zK1) {
                        i15 = com.zentraedi.comic.q.h.ck;
                    } else {
                        i15 = com.zentraedi.comic.q.h.lk;
                    }
                    Drawable drawableB10 = g.a.b(context15, i15);
                    if (zK1) {
                        context = this.J.getContext();
                        i16 = com.zentraedi.comic.q.h.ck;
                    } else {
                        context = this.J.getContext();
                        i16 = com.zentraedi.comic.q.h.lk;
                    }
                    drawableB = g.a.b(context, i16);
                    drawable2 = drawableB10;
                    drawable = drawableB4;
                } else {
                    drawable = drawableB4;
                    drawableB = null;
                    drawable2 = null;
                }
                i4 = i13;
                i3 = i14;
                i7 = i11;
                long j27 = j13;
                i8 = i12;
                j6 = j27;
            } else {
                j2 = 4259840;
                i2 = 0;
            }
            j11 = j & j4;
            if (j11 != 0) {
                if (comicReaderViewModel != null) {
                    uVarZ1 = comicReaderViewModel.z1();
                } else {
                    uVarZ1 = null;
                }
                p1(6, uVarZ1);
                if (uVarZ1 != null) {
                    bool3 = (Boolean) uVarZ1.get();
                } else {
                    bool3 = null;
                }
                zK2 = androidx.databinding.c0.K0(bool3);
                if (j11 != 0) {
                    if (zK2) {
                        j19 = 17039360;
                    } else {
                        j19 = 8519680;
                    }
                    j |= j19;
                }
                if (zK2) {
                    i5 = 8;
                } else {
                    i5 = 0;
                }
                if (zK2) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
            } else {
                i13 = 0;
                i5 = 0;
            }
            j12 = j & j3;
            if (j12 != 0) {
                if (comicReaderViewModel != null) {
                    comicInfoModelH1 = comicReaderViewModel.h1();
                } else {
                    comicInfoModelH1 = null;
                }
                if (comicInfoModelH1 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (j12 != 0) {
                    if (z2) {
                        j18 = 17180917760L;
                    } else {
                        j18 = 8590458880L;
                    }
                    j |= j18;
                }
                if (z2) {
                    iB = androidx.databinding.c0.B(this.X, com.zentraedi.comic.q.f.f416qd);
                } else {
                    iB = androidx.databinding.c0.B(this.X, com.zentraedi.comic.q.f.f401gg);
                }
                if (z2) {
                    iB2 = androidx.databinding.c0.B(this.W, com.zentraedi.comic.q.f.f416qd);
                } else {
                    iB2 = androidx.databinding.c0.B(this.W, com.zentraedi.comic.q.f.f401gg);
                }
                j13 = j;
                i14 = iB2;
                i = iB;
            } else {
                comicReaderViewModel = comicReaderViewModel;
                j13 = j;
                i = 0;
                i14 = 0;
            }
            if ((j13 & 24832) == 0) {
                if (comicReaderViewModel != null) {
                    observableFieldP1 = comicReaderViewModel.p1();
                } else {
                    observableFieldP1 = null;
                }
                p1(8, observableFieldP1);
                if (observableFieldP1 != null) {
                }
                j14 = j13 & 25088;
                if (j14 != 0) {
                    if (comicReaderViewModel != null) {
                        uVarI1 = comicReaderViewModel.i1();
                    } else {
                        uVarI1 = null;
                    }
                    p1(9, uVarI1);
                    if (uVarI1 != null) {
                        bottomMenu = (ComicReaderViewModel.BottomMenu) uVarI1.get();
                    } else {
                        bottomMenu = null;
                    }
                    if (bottomMenu == ComicReaderViewModel.BottomMenu.SETTING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (j14 != 0) {
                        if (z) {
                            j17 = 67108864;
                        } else {
                            j17 = 33554432;
                        }
                        j13 |= j17;
                    }
                    Context context16 = this.b0.getContext();
                    if (z) {
                        i17 = com.zentraedi.comic.q.h.V00;
                    } else {
                        i17 = com.zentraedi.comic.q.h.A00;
                    }
                    drawableB4 = g.a.b(context16, i17);
                } else {
                    drawableB4 = null;
                }
                j15 = j13 & 25600;
                if (j15 != 0) {
                    if (comicReaderViewModel != null) {
                        uVarV0 = comicReaderViewModel.V0();
                    } else {
                        uVarV0 = null;
                    }
                    p1(10, uVarV0);
                    if (uVarV0 != null) {
                        bool2 = (Boolean) uVarV0.get();
                    } else {
                        bool2 = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool2);
                    if (j15 != 0) {
                        if (zK1) {
                            j16 = 5497558138880L;
                        } else {
                            j16 = 2748779069440L;
                        }
                        j13 |= j16;
                    }
                    Context context17 = this.K.getContext();
                    if (zK1) {
                        i15 = com.zentraedi.comic.q.h.ck;
                    } else {
                        i15 = com.zentraedi.comic.q.h.lk;
                    }
                    Drawable drawableB11 = g.a.b(context17, i15);
                    if (zK1) {
                        context = this.J.getContext();
                        i16 = com.zentraedi.comic.q.h.ck;
                    } else {
                        context = this.J.getContext();
                        i16 = com.zentraedi.comic.q.h.lk;
                    }
                    drawableB = g.a.b(context, i16);
                    drawable2 = drawableB11;
                    drawable = drawableB4;
                } else {
                    drawable = drawableB4;
                    drawableB = null;
                    drawable2 = null;
                }
                i4 = i13;
                i3 = i14;
                i7 = i11;
                long j28 = j13;
                i8 = i12;
                j6 = j28;
            }
            j14 = j13 & 25088;
            if (j14 != 0) {
                if (comicReaderViewModel != null) {
                    uVarI1 = comicReaderViewModel.i1();
                } else {
                    uVarI1 = null;
                }
                p1(9, uVarI1);
                if (uVarI1 != null) {
                    bottomMenu = (ComicReaderViewModel.BottomMenu) uVarI1.get();
                } else {
                    bottomMenu = null;
                }
                if (bottomMenu == ComicReaderViewModel.BottomMenu.SETTING) {
                    z = true;
                } else {
                    z = false;
                }
                if (j14 != 0) {
                    if (z) {
                        j17 = 67108864;
                    } else {
                        j17 = 33554432;
                    }
                    j13 |= j17;
                }
                Context context18 = this.b0.getContext();
                if (z) {
                    i17 = com.zentraedi.comic.q.h.V00;
                } else {
                    i17 = com.zentraedi.comic.q.h.A00;
                }
                drawableB4 = g.a.b(context18, i17);
            } else {
                drawableB4 = null;
            }
            j15 = j13 & 25600;
            if (j15 != 0) {
                if (comicReaderViewModel != null) {
                    uVarV0 = comicReaderViewModel.V0();
                } else {
                    uVarV0 = null;
                }
                p1(10, uVarV0);
                if (uVarV0 != null) {
                    bool2 = (Boolean) uVarV0.get();
                } else {
                    bool2 = null;
                }
                zK1 = androidx.databinding.c0.K0(bool2);
                if (j15 != 0) {
                    if (zK1) {
                        j16 = 5497558138880L;
                    } else {
                        j16 = 2748779069440L;
                    }
                    j13 |= j16;
                }
                Context context19 = this.K.getContext();
                if (zK1) {
                    i15 = com.zentraedi.comic.q.h.ck;
                } else {
                    i15 = com.zentraedi.comic.q.h.lk;
                }
                Drawable drawableB12 = g.a.b(context19, i15);
                if (zK1) {
                    context = this.J.getContext();
                    i16 = com.zentraedi.comic.q.h.ck;
                } else {
                    context = this.J.getContext();
                    i16 = com.zentraedi.comic.q.h.lk;
                }
                drawableB = g.a.b(context, i16);
                drawable2 = drawableB12;
                drawable = drawableB4;
            } else {
                drawable = drawableB4;
                drawableB = null;
                drawable2 = null;
            }
            i4 = i13;
            i3 = i14;
            i7 = i11;
            long j29 = j13;
            i8 = i12;
            j6 = j29;
        } else {
            comicReaderViewModel = comicReaderViewModel;
            j2 = 4259840;
            j3 = 24576;
            j4 = 24640;
            j5 = 24608;
            j6 = j;
            i = 0;
            drawable = null;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            drawable2 = null;
            i6 = 0;
            drawableB = null;
            bool = null;
            drawableB2 = null;
            drawableB3 = null;
            str = null;
            str2 = null;
            str3 = null;
            zK0 = false;
            observableFieldB1 = null;
            i7 = 0;
            i8 = 0;
        }
        if ((j6 & j2) != 0) {
            if (comicReaderViewModel != null) {
                observableFieldB1 = comicReaderViewModel.B1();
            }
            drawable3 = drawable;
            Boolean bool6 = bool;
            ObservableField<Boolean> observableField = observableFieldB1;
            p1(2, observableField);
            boolean zK6 = androidx.databinding.c0.K0(observableField != null ? (Boolean) observableField.get() : bool6);
            if ((j6 & 90116) != 0) {
                j8 = zK6 ? j6 | 274877906944L : j6 | 137438953472L;
            } else {
                j8 = j6;
            }
            if ((j8 & 4218884) != 0) {
                j7 = zK6 ? j8 | 17592186044416L : j8 | 8796093022208L;
            } else {
                j7 = j8;
            }
            if ((j7 & 65536) != 0) {
                i8 = zK6 ? 0 : 8;
            }
            if ((j7 & 4194304) != 0) {
                i7 = zK6 ? 8 : 0;
            }
        } else {
            drawable3 = drawable;
            j7 = j6;
        }
        int i20 = i7;
        int i21 = i8;
        long j30 = j7 & 24596;
        if (j30 != 0) {
            i10 = zK0 ? i21 : 8;
            i9 = zK0 ? i20 : 8;
        } else {
            i9 = 0;
            i10 = 0;
        }
        if ((j7 & j4) != 0) {
            this.E.getRoot().setVisibility(i4);
            this.j0.setVisibility(i5);
            this.m0.setVisibility(i5);
        }
        if ((j7 & 16384) != 0) {
            this.F.setOnClickListener(this.A3);
            this.G.setOnClickListener(this.M2);
            this.H.setOnClickListener(this.Q2);
            this.I.setOnClickListener(this.A4);
            this.J.setOnClickListener(this.n0);
            this.K.setOnClickListener(this.P4);
            this.O.setOnClickListener(this.M4);
            this.P.setOnClickListener(this.P3);
            this.S.setOnClickListener(this.a1);
            this.T.setOnClickListener(this.a2);
            this.U.setOnClickListener(this.P2);
            TextView textView = this.U;
            com.zentraedi.business.utils.u.X(textView, androidx.databinding.c0.B(textView, com.zentraedi.comic.q.f.f416qd));
            this.V.setOnClickListener(this.Z2);
            this.W.setOnClickListener(this.T2);
            this.X.setOnClickListener(this.M1);
            this.b0.setOnClickListener(this.r1);
            this.c0.setOnClickListener(this.T3);
        }
        if ((j7 & 24578) != 0) {
            androidx.databinding.adapters.p.a(this.H, drawableB3);
            androidx.databinding.adapters.p.a(this.I, drawableB2);
        }
        if ((j7 & 25600) != 0) {
            androidx.databinding.adapters.p.a(this.J, drawableB);
            androidx.databinding.adapters.p.a(this.K, drawable2);
        }
        if (j30 != 0) {
            this.h0.setVisibility(i10);
            this.l0.setVisibility(i9);
        }
        if ((j7 & 24580) != 0) {
            this.i0.setVisibility(i21);
            this.k0.setVisibility(i20);
        }
        if ((j7 & j5) != 0) {
            this.M.setVisibility(i6);
            this.N.setVisibility(i6);
            this.Y.setVisibility(i6);
            this.Z.setVisibility(i2);
            this.a0.setVisibility(i2);
        }
        if ((j7 & 24577) != 0) {
            androidx.databinding.adapters.f0.A(this.Q, str);
            androidx.databinding.adapters.f0.A(this.R, str);
        }
        if ((j7 & j3) != 0) {
            com.zentraedi.business.utils.u.X(this.W, i3);
            com.zentraedi.business.utils.u.X(this.X, i);
        }
        if ((j7 & 24584) != 0) {
            androidx.databinding.adapters.f0.A(this.Y, str2);
        }
        if ((j7 & 24832) != 0) {
            String str4 = str3;
            androidx.databinding.adapters.f0.A(this.Z, str4);
            androidx.databinding.adapters.f0.A(this.a0, str4);
        }
        if ((j7 & 25088) != 0) {
            androidx.databinding.adapters.j0.b(this.b0, drawable3);
        }
        androidx.databinding.c0.t(this.E);
    }

    private a4(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 11, (x3) objArr[30], (ImageView) objArr[4], (ImageView) objArr[8], (ImageView) objArr[13], (ImageView) objArr[23], (ImageView) objArr[16], (ImageView) objArr[26], (RecyclerView) objArr[31], (AppCompatSeekBar) objArr[14], (AppCompatSeekBar) objArr[24], (TextView) objArr[3], (TextView) objArr[7], (TextView) objArr[2], (TextView) objArr[6], (TextView) objArr[20], (TextView) objArr[29], (TextView) objArr[17], (TextView) objArr[27], (TextView) objArr[18], (TextView) objArr[22], (TextView) objArr[10], (TextView) objArr[15], (TextView) objArr[25], (TextView) objArr[19], (TextView) objArr[28]);
        this.Q4 = -1L;
        N0(this.E);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.g0 = linearLayout;
        linearLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.h0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[11];
        this.i0 = linearLayout2;
        linearLayout2.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[12];
        this.j0 = constraintLayout2;
        constraintLayout2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[21];
        this.k0 = linearLayout3;
        linearLayout3.setTag(null);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) objArr[5];
        this.l0 = constraintLayout3;
        constraintLayout3.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[9];
        this.m0 = linearLayout4;
        linearLayout4.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        this.T.setTag(null);
        this.U.setTag(null);
        this.V.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        this.Y.setTag(null);
        this.Z.setTag(null);
        this.a0.setTag(null);
        this.b0.setTag(null);
        this.c0.setTag(null);
        P0(view);
        this.n0 = new com.zentraedi.comic.generated.callback.b(this, 6);
        this.a1 = new com.zentraedi.comic.generated.callback.b(this, 10);
        this.r1 = new com.zentraedi.comic.generated.callback.b(this, 9);
        this.M1 = new com.zentraedi.comic.generated.callback.b(this, 11);
        this.a2 = new com.zentraedi.comic.generated.callback.b(this, 16);
        this.M2 = new com.zentraedi.comic.generated.callback.b(this, 4);
        this.P2 = new com.zentraedi.comic.generated.callback.b(this, 7);
        this.Q2 = new com.zentraedi.comic.generated.callback.b(this, 5);
        this.T2 = new com.zentraedi.comic.generated.callback.b(this, 8);
        this.Z2 = new com.zentraedi.comic.generated.callback.b(this, 14);
        this.A3 = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.P3 = new com.zentraedi.comic.generated.callback.b(this, 3);
        this.T3 = new com.zentraedi.comic.generated.callback.b(this, 15);
        this.A4 = new com.zentraedi.comic.generated.callback.b(this, 12);
        this.M4 = new com.zentraedi.comic.generated.callback.b(this, 1);
        this.P4 = new com.zentraedi.comic.generated.callback.b(this, 13);
        i0();
    }
}
