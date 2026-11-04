package com.zentraedi.comic.databinding;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ObservableField;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.business.R;
import com.zentraedi.business.databinding.gj;
import com.zentraedi.business.utils.g8;
import com.zentraedi.business.view.NoScrollViewPager;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class b2 extends a2 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final SparseIntArray a1;

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i n0;

    @androidx.annotation.n0
    private final FrameLayout h0;

    @androidx.annotation.n0
    private final RelativeLayout i0;

    @androidx.annotation.n0
    private final LinearLayout j0;

    @androidx.annotation.n0
    private final ProgressBar k0;

    @androidx.annotation.p0
    private final View.OnClickListener l0;
    private long m0;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(31);
        n0 = iVar;
        iVar.a(1, new String[]{"layout_comic_house_sort"}, new int[]{16}, new int[]{com.zentraedi.comic.q.l.aa});
        iVar.a(14, new String[]{"layout_common_navigation_bar", "layout_comic_edit_navigation_bar"}, new int[]{17, 18}, new int[]{R.layout.d6, com.zentraedi.comic.q.l.V9});
        SparseIntArray sparseIntArray = new SparseIntArray();
        a1 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.i3, 19);
        sparseIntArray.put(com.zentraedi.comic.q.i.X6, 20);
        sparseIntArray.put(com.zentraedi.comic.q.i.LT, 21);
        sparseIntArray.put(com.zentraedi.comic.q.i.kU, 22);
        sparseIntArray.put(com.zentraedi.comic.q.i.II, 23);
        sparseIntArray.put(com.zentraedi.comic.q.i.e8, 24);
        sparseIntArray.put(com.zentraedi.comic.q.i.lU, 25);
        sparseIntArray.put(com.zentraedi.comic.q.i.OC, 26);
        sparseIntArray.put(com.zentraedi.comic.q.i.mk, 27);
        sparseIntArray.put(com.zentraedi.comic.q.i.Lp, 28);
        sparseIntArray.put(com.zentraedi.comic.q.i.lk, 29);
        sparseIntArray.put(com.zentraedi.comic.q.i.bl, 30);
    }

    public b2(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 31, n0, a1));
    }

    private boolean F1(f4 f4Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 128;
        }
        return true;
    }

    private boolean G1(p4 p4Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 16;
        }
        return true;
    }

    private boolean I1(gj gjVar, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 32;
        }
        return true;
    }

    private boolean J1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.m0 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
        return true;
    }

    private boolean K1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 4;
        }
        return true;
    }

    private boolean L1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 8;
        }
        return true;
    }

    private boolean N1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 256;
        }
        return true;
    }

    private boolean O1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.m0 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
        }
        return true;
    }

    private boolean P1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 2;
        }
        return true;
    }

    private boolean Q1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 64;
        }
        return true;
    }

    private boolean R1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 512;
        }
        return true;
    }

    private boolean S1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 1;
        }
        return true;
    }

    private boolean T1(ObservableField<Drawable> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 8192;
        }
        return true;
    }

    private boolean U1(ObservableField<SpannableStringBuilder> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.m0 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.a2
    public void D1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.m2 m2Var) {
        this.g0 = m2Var;
        synchronized (this) {
            this.m0 |= 16384;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.b4);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.a2
    public void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.t2 t2Var) {
        this.f0 = t2Var;
        synchronized (this) {
            this.m0 |= 32768;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.S.O0(p0Var);
        this.U.O0(p0Var);
        this.M.O0(p0Var);
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        com.zentraedi.comic.viewmodel.t2 t2Var = this.f0;
        if (t2Var != null) {
            t2Var.M0();
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.m0 != 0) {
                    return true;
                }
                return this.S.g0() || this.U.g0() || this.M.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.m0 = 65536L;
        }
        this.S.i0();
        this.U.i0();
        this.M.i0();
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
        E1((com.zentraedi.comic.viewmodel.t2) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return S1((ObservableField) obj, i2);
            case 1:
                return P1((ObservableField) obj, i2);
            case 2:
                return K1((ObservableField) obj, i2);
            case 3:
                return L1((ObservableField) obj, i2);
            case 4:
                return G1((p4) obj, i2);
            case 5:
                return I1((gj) obj, i2);
            case 6:
                return Q1((ObservableField) obj, i2);
            case 7:
                return F1((f4) obj, i2);
            case 8:
                return N1((ObservableField) obj, i2);
            case 9:
                return R1((ObservableField) obj, i2);
            case 10:
                return J1((ObservableField) obj, i2);
            case 11:
                return O1((ObservableField) obj, i2);
            case 12:
                return U1((ObservableField) obj, i2);
            case 13:
                return T1((ObservableField) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0167  */
    /* JADX WARN: Code duplicated, block: B:105:0x0173  */
    /* JADX WARN: Code duplicated, block: B:106:0x0175  */
    /* JADX WARN: Code duplicated, block: B:109:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x017c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0182  */
    /* JADX WARN: Code duplicated, block: B:115:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x018e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0196  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:124:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x01df  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:147:0x0201 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x0203  */
    /* JADX WARN: Code duplicated, block: B:150:0x0209  */
    /* JADX WARN: Code duplicated, block: B:151:0x020f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x021a  */
    /* JADX WARN: Code duplicated, block: B:157:0x0227  */
    /* JADX WARN: Code duplicated, block: B:160:0x0230  */
    /* JADX WARN: Code duplicated, block: B:161:0x0237  */
    /* JADX WARN: Code duplicated, block: B:163:0x023d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0248 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x024a  */
    /* JADX WARN: Code duplicated, block: B:169:0x024f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0258  */
    /* JADX WARN: Code duplicated, block: B:173:0x025f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0266 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x0268  */
    /* JADX WARN: Code duplicated, block: B:179:0x0270  */
    /* JADX WARN: Code duplicated, block: B:181:0x0278  */
    /* JADX WARN: Code duplicated, block: B:182:0x027b  */
    /* JADX WARN: Code duplicated, block: B:185:0x0281  */
    /* JADX WARN: Code duplicated, block: B:188:0x028e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x0290  */
    /* JADX WARN: Code duplicated, block: B:191:0x0295  */
    /* JADX WARN: Code duplicated, block: B:194:0x029c  */
    /* JADX WARN: Code duplicated, block: B:195:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:198:0x02aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:199:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:200:0x02af  */
    /* JADX WARN: Code duplicated, block: B:201:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:203:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:204:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:207:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:208:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:210:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:211:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:213:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:216:0x02f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:218:0x0302  */
    /* JADX WARN: Code duplicated, block: B:221:0x030c  */
    /* JADX WARN: Code duplicated, block: B:222:0x0313  */
    /* JADX WARN: Code duplicated, block: B:226:0x031c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x031e  */
    /* JADX WARN: Code duplicated, block: B:229:0x0325  */
    /* JADX WARN: Code duplicated, block: B:232:0x032e  */
    /* JADX WARN: Code duplicated, block: B:234:0x0364  */
    /* JADX WARN: Code duplicated, block: B:283:0x0468 A[PHI: r48
      0x0468: PHI (r48v4 long) = (r48v3 long), (r48v11 long) binds: [B:271:0x0449, B:280:0x0462] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00da  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x0108  */
    /* JADX WARN: Code duplicated, block: B:74:0x010a  */
    /* JADX WARN: Code duplicated, block: B:76:0x010d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0110  */
    /* JADX WARN: Code duplicated, block: B:79:0x0112  */
    /* JADX WARN: Code duplicated, block: B:80:0x0115  */
    /* JADX WARN: Code duplicated, block: B:83:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0129  */
    /* JADX WARN: Code duplicated, block: B:86:0x0135  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144  */
    /* JADX WARN: Code duplicated, block: B:93:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x014d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0153  */
    /* JADX WARN: Code duplicated, block: B:99:0x015d A[DONT_INVERT] */
    protected void r() {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        float f;
        boolean z2;
        boolean zK0;
        int i2;
        int i3;
        boolean zK1;
        int i4;
        boolean zK2;
        boolean z3;
        int i5;
        int i6;
        String str;
        int i7;
        boolean z4;
        boolean z5;
        ObservableField<Boolean> observableField;
        boolean z6;
        boolean z7;
        Boolean bool;
        SpannableStringBuilder spannableStringBuilder;
        boolean z8;
        Drawable drawable;
        int i8;
        boolean zK3;
        long j6;
        int i9;
        boolean z9;
        boolean z10;
        int i10;
        long j7;
        int i11;
        int i12;
        boolean zEquals;
        long j8;
        boolean zK4;
        long j9;
        boolean z11;
        long j10;
        long j11;
        long j12;
        long j13;
        int i13;
        SpannableStringBuilder spannableStringBuilder2;
        SpannableStringBuilder spannableStringBuilder3;
        ObservableField<Drawable> observableFieldX0;
        androidx.databinding.u uVarY0;
        ObservableField<Boolean> observableField2;
        Boolean bool2;
        boolean zK5;
        long j14;
        float f2;
        ObservableField<Boolean> observableField3;
        Boolean bool3;
        boolean zK6;
        int i14;
        long j15;
        androidx.databinding.u uVarK0;
        Boolean bool4;
        long j16;
        androidx.databinding.u uVarZ0;
        Boolean bool5;
        boolean zK7;
        androidx.databinding.u uVarJ0;
        Boolean bool6;
        androidx.databinding.u uVarH0;
        Boolean bool7;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        ObservableField<String> observableFieldM0;
        boolean z12;
        boolean z13;
        boolean zEquals2;
        long j22;
        long j23;
        long j24;
        synchronized (this) {
            j = this.m0;
            this.m0 = 0L;
        }
        com.zentraedi.comic.viewmodel.m2 m2Var = this.g0;
        com.zentraedi.comic.viewmodel.t2 t2Var = this.f0;
        if ((114511 & j) != 0) {
            long j25 = j & 98305;
            if (j25 != 0) {
                androidx.databinding.u uVarW0 = t2Var != null ? t2Var.w0() : null;
                j2 = 102400;
                p1(0, uVarW0);
                boolean zK8 = androidx.databinding.c0.K0(uVarW0 != null ? (Boolean) uVarW0.get() : null);
                if (j25 != 0) {
                    j |= zK8 ? 1073741824L : 536870912L;
                }
                if (!zK8) {
                    i8 = 8;
                }
                j7 = j & 98306;
                if (j7 != 0) {
                    if (t2Var != null) {
                        observableFieldM0 = t2Var.m0();
                    } else {
                        observableFieldM0 = null;
                    }
                    p1(1, observableFieldM0);
                    if (observableFieldM0 != null) {
                        str = (String) observableFieldM0.get();
                    } else {
                        str = null;
                    }
                    z = true;
                    if (str != "running") {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (str == "running") {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    j3 = 149533715595264L;
                    zEquals = "done".equals(str);
                    zEquals2 = "running".equals(str);
                    if (j7 != 0) {
                        if (z12) {
                            j24 = 16777216;
                        } else {
                            j24 = 8388608;
                        }
                        j |= j24;
                    }
                    if ((j & 98306) != 0) {
                        if (z13) {
                            j23 = 70368744177664L;
                        } else {
                            j23 = 35184372088832L;
                        }
                        j |= j23;
                    }
                    if ((j & 98306) != 0) {
                        if (zEquals) {
                            j |= 1125899906842624L;
                        } else {
                            j |= 562949953421312L;
                        }
                    }
                    if ((j & 98306) != 0) {
                        if (zEquals2) {
                            j22 = 274877906944L;
                        } else {
                            j22 = 137438953472L;
                        }
                        j |= j22;
                    }
                    if (z12) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    i6 = z13 ? 0 : 4;
                    if (zEquals2) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                } else {
                    z = true;
                    j3 = 149533715595264L;
                    i11 = 0;
                    i12 = 0;
                    i6 = 0;
                    str = null;
                    zEquals = false;
                }
                j8 = j & 100356;
                if (j8 != 0) {
                    if (t2Var != null) {
                        uVarH0 = t2Var.h0();
                    } else {
                        uVarH0 = null;
                    }
                    j4 = 299067431190528L;
                    p1(2, uVarH0);
                    if (uVarH0 != null) {
                        bool7 = (Boolean) uVarH0.get();
                    } else {
                        bool7 = null;
                    }
                    zK4 = androidx.databinding.c0.K0(bool7);
                    if (j8 != 0) {
                        if (zK4) {
                            j21 = 1048576;
                        } else {
                            j21 = 524288;
                        }
                        j |= j21;
                    }
                    if ((j & 98308) != 0) {
                        if (zK4) {
                            j20 = 4294967296L;
                        } else {
                            j20 = 2147483648L;
                        }
                        j |= j20;
                    }
                    j17 = j & 98308;
                    if (j17 != 0) {
                        z2 = zK4;
                    } else {
                        z2 = false;
                    }
                    z3 = !zK4;
                    if (j17 != 0) {
                        if (zK4) {
                            j19 = 2097152;
                        } else {
                            j19 = 4194304;
                        }
                        j |= j19;
                    }
                    if ((j & 100356) != 0) {
                        if (zK4) {
                            j18 = 8589934592L;
                        } else {
                            j18 = 17179869184L;
                        }
                        j |= j18;
                    }
                    if ((j & 98308) != 0) {
                        z4 = z3;
                    } else {
                        z4 = z3;
                    }
                    if ((j & 98312) != 0) {
                        if (t2Var != null) {
                            uVarJ0 = t2Var.j0();
                        } else {
                            uVarJ0 = null;
                        }
                        p1(3, uVarJ0);
                        if (uVarJ0 != null) {
                            bool6 = (Boolean) uVarJ0.get();
                        } else {
                            bool6 = null;
                        }
                        zK1 = androidx.databinding.c0.K0(bool6);
                    } else {
                        zK1 = false;
                    }
                    j9 = j & 99392;
                    if (j9 != 0) {
                        if (t2Var != null) {
                            long j26 = j;
                            uVarZ0 = t2Var.z0();
                            j16 = j26;
                        } else {
                            j16 = j;
                            uVarZ0 = null;
                        }
                        p1(6, uVarZ0);
                        if (uVarZ0 != null) {
                            bool5 = (Boolean) uVarZ0.get();
                        } else {
                            bool5 = null;
                        }
                        zK7 = androidx.databinding.c0.K0(bool5);
                        if (j9 != 0) {
                            if (zK7) {
                                j16 |= 262144;
                            } else {
                                j16 |= 131072;
                            }
                        }
                        z11 = zK7;
                        j = j16;
                    } else {
                        z11 = false;
                    }
                    if ((j & 98560) != 0) {
                        if (t2Var != null) {
                            long j27 = j;
                            uVarK0 = t2Var.k0();
                            j10 = j27;
                        } else {
                            j10 = j;
                            uVarK0 = null;
                        }
                        p1(8, uVarK0);
                        if (uVarK0 != null) {
                            bool4 = (Boolean) uVarK0.get();
                        } else {
                            bool4 = null;
                        }
                        zK0 = androidx.databinding.c0.K0(bool4);
                    } else {
                        j10 = j;
                        zK0 = false;
                    }
                    j11 = j10 & 98816;
                    if (j11 != 0) {
                        if (t2Var != null) {
                            observableField3 = t2Var.mIsCurrentFragmentEmpty;
                        } else {
                            observableField3 = null;
                        }
                        p1(9, observableField3);
                        if (observableField3 != null) {
                            bool3 = (Boolean) observableField3.get();
                        } else {
                            bool3 = null;
                        }
                        zK6 = androidx.databinding.c0.K0(bool3);
                        if (j11 != 0) {
                            if (zK6) {
                                j15 = 4398046511104L;
                            } else {
                                j15 = 2199023255552L;
                            }
                            j10 |= j15;
                        }
                        if (zK6) {
                            i14 = 8;
                        } else {
                            i14 = 0;
                        }
                        i7 = i14;
                    } else {
                        i7 = 0;
                    }
                    j12 = j10;
                    j13 = j12 & 100352;
                    if (j13 != 0) {
                        if (t2Var != null) {
                            observableField2 = t2Var.editModel;
                        } else {
                            observableField2 = null;
                        }
                        p1(11, observableField2);
                        if (observableField2 != null) {
                            bool2 = (Boolean) observableField2.get();
                        } else {
                            bool2 = null;
                        }
                        zK5 = androidx.databinding.c0.K0(bool2);
                        if (j13 != 0) {
                            j14 = j12;
                        } else if (zK5) {
                            j14 = j12 | j4;
                        } else {
                            j14 = j12 | j3;
                        }
                        if (zK5) {
                            i3 = 8;
                        } else {
                            i3 = 0;
                        }
                        z8 = !zK5;
                        if (zK5) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        if (zK5) {
                            f2 = 0.3f;
                        } else {
                            f2 = 1.0f;
                        }
                        zK2 = androidx.databinding.c0.K0(Boolean.valueOf(z8));
                        float f3 = f2;
                        observableField = observableField2;
                        long j28 = j14;
                        bool = bool2;
                        f = f3;
                        j12 = j28;
                    } else {
                        f = 0.0f;
                        observableField = null;
                        bool = null;
                        i3 = 0;
                        z8 = false;
                        i13 = 0;
                        zK2 = false;
                    }
                    if ((j12 & j2) != 0) {
                        if (t2Var != null) {
                            long j29 = j12;
                            uVarY0 = t2Var.y0();
                            j5 = j29;
                        } else {
                            j5 = j12;
                            uVarY0 = null;
                        }
                        p1(12, uVarY0);
                        spannableStringBuilder2 = uVarY0 != null ? (SpannableStringBuilder) uVarY0.get() : null;
                        if ((j5 & 106496) != 0) {
                            if (t2Var != null) {
                                observableFieldX0 = t2Var.x0();
                            } else {
                                observableFieldX0 = null;
                            }
                            spannableStringBuilder3 = spannableStringBuilder2;
                            p1(13, observableFieldX0);
                            if (observableFieldX0 != null) {
                                z6 = z11;
                                z5 = zK4;
                                drawable = (Drawable) observableFieldX0.get();
                                i = 8;
                            }
                            z7 = zEquals;
                            i5 = i12;
                            i4 = i11;
                            i2 = i13;
                            spannableStringBuilder = spannableStringBuilder3;
                        } else {
                            spannableStringBuilder3 = spannableStringBuilder2;
                        }
                        z6 = z11;
                        z5 = zK4;
                        i = 8;
                        drawable = null;
                        z7 = zEquals;
                        i5 = i12;
                        i4 = i11;
                        i2 = i13;
                        spannableStringBuilder = spannableStringBuilder3;
                    } else {
                        j5 = j12;
                    }
                    if ((j5 & 106496) != 0) {
                        if (t2Var != null) {
                            observableFieldX0 = t2Var.x0();
                        } else {
                            observableFieldX0 = null;
                        }
                        spannableStringBuilder3 = spannableStringBuilder2;
                        p1(13, observableFieldX0);
                        if (observableFieldX0 != null) {
                            z6 = z11;
                            z5 = zK4;
                            drawable = (Drawable) observableFieldX0.get();
                            i = 8;
                        }
                        z7 = zEquals;
                        i5 = i12;
                        i4 = i11;
                        i2 = i13;
                        spannableStringBuilder = spannableStringBuilder3;
                    } else {
                        spannableStringBuilder3 = spannableStringBuilder2;
                    }
                    z6 = z11;
                    z5 = zK4;
                    i = 8;
                    drawable = null;
                    z7 = zEquals;
                    i5 = i12;
                    i4 = i11;
                    i2 = i13;
                    spannableStringBuilder = spannableStringBuilder3;
                } else {
                    j4 = 299067431190528L;
                    z4 = false;
                    zK4 = false;
                    z2 = false;
                }
                z3 = false;
                if ((j & 98312) != 0) {
                    if (t2Var != null) {
                        uVarJ0 = t2Var.j0();
                    } else {
                        uVarJ0 = null;
                    }
                    p1(3, uVarJ0);
                    if (uVarJ0 != null) {
                        bool6 = (Boolean) uVarJ0.get();
                    } else {
                        bool6 = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool6);
                } else {
                    zK1 = false;
                }
                j9 = j & 99392;
                if (j9 != 0) {
                    if (t2Var != null) {
                        long j210 = j;
                        uVarZ0 = t2Var.z0();
                        j16 = j210;
                    } else {
                        j16 = j;
                        uVarZ0 = null;
                    }
                    p1(6, uVarZ0);
                    if (uVarZ0 != null) {
                        bool5 = (Boolean) uVarZ0.get();
                    } else {
                        bool5 = null;
                    }
                    zK7 = androidx.databinding.c0.K0(bool5);
                    if (j9 != 0) {
                        if (zK7) {
                            j16 |= 262144;
                        } else {
                            j16 |= 131072;
                        }
                    }
                    z11 = zK7;
                    j = j16;
                } else {
                    z11 = false;
                }
                if ((j & 98560) != 0) {
                    if (t2Var != null) {
                        long j211 = j;
                        uVarK0 = t2Var.k0();
                        j10 = j211;
                    } else {
                        j10 = j;
                        uVarK0 = null;
                    }
                    p1(8, uVarK0);
                    if (uVarK0 != null) {
                        bool4 = (Boolean) uVarK0.get();
                    } else {
                        bool4 = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool4);
                } else {
                    j10 = j;
                    zK0 = false;
                }
                j11 = j10 & 98816;
                if (j11 != 0) {
                    if (t2Var != null) {
                        observableField3 = t2Var.mIsCurrentFragmentEmpty;
                    } else {
                        observableField3 = null;
                    }
                    p1(9, observableField3);
                    if (observableField3 != null) {
                        bool3 = (Boolean) observableField3.get();
                    } else {
                        bool3 = null;
                    }
                    zK6 = androidx.databinding.c0.K0(bool3);
                    if (j11 != 0) {
                        if (zK6) {
                            j15 = 4398046511104L;
                        } else {
                            j15 = 2199023255552L;
                        }
                        j10 |= j15;
                    }
                    if (zK6) {
                        i14 = 8;
                    } else {
                        i14 = 0;
                    }
                    i7 = i14;
                } else {
                    i7 = 0;
                }
                j12 = j10;
                j13 = j12 & 100352;
                if (j13 != 0) {
                    if (t2Var != null) {
                        observableField2 = t2Var.editModel;
                    } else {
                        observableField2 = null;
                    }
                    p1(11, observableField2);
                    if (observableField2 != null) {
                        bool2 = (Boolean) observableField2.get();
                    } else {
                        bool2 = null;
                    }
                    zK5 = androidx.databinding.c0.K0(bool2);
                    if (j13 != 0) {
                        j14 = j12;
                    } else if (zK5) {
                        j14 = j12 | j4;
                    } else {
                        j14 = j12 | j3;
                    }
                    if (zK5) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    z8 = !zK5;
                    if (zK5) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    if (zK5) {
                        f2 = 0.3f;
                    } else {
                        f2 = 1.0f;
                    }
                    zK2 = androidx.databinding.c0.K0(Boolean.valueOf(z8));
                    float f4 = f2;
                    observableField = observableField2;
                    long j212 = j14;
                    bool = bool2;
                    f = f4;
                    j12 = j212;
                } else {
                    f = 0.0f;
                    observableField = null;
                    bool = null;
                    i3 = 0;
                    z8 = false;
                    i13 = 0;
                    zK2 = false;
                }
                if ((j12 & j2) != 0) {
                    if (t2Var != null) {
                        long j213 = j12;
                        uVarY0 = t2Var.y0();
                        j5 = j213;
                    } else {
                        j5 = j12;
                        uVarY0 = null;
                    }
                    p1(12, uVarY0);
                    if (uVarY0 != null) {
                    }
                    if ((j5 & 106496) != 0) {
                        if (t2Var != null) {
                            observableFieldX0 = t2Var.x0();
                        } else {
                            observableFieldX0 = null;
                        }
                        spannableStringBuilder3 = spannableStringBuilder2;
                        p1(13, observableFieldX0);
                        if (observableFieldX0 != null) {
                            z6 = z11;
                            z5 = zK4;
                            drawable = (Drawable) observableFieldX0.get();
                            i = 8;
                        }
                        z7 = zEquals;
                        i5 = i12;
                        i4 = i11;
                        i2 = i13;
                        spannableStringBuilder = spannableStringBuilder3;
                    } else {
                        spannableStringBuilder3 = spannableStringBuilder2;
                    }
                    z6 = z11;
                    z5 = zK4;
                    i = 8;
                    drawable = null;
                    z7 = zEquals;
                    i5 = i12;
                    i4 = i11;
                    i2 = i13;
                    spannableStringBuilder = spannableStringBuilder3;
                } else {
                    j5 = j12;
                }
                if ((j5 & 106496) != 0) {
                    if (t2Var != null) {
                        observableFieldX0 = t2Var.x0();
                    } else {
                        observableFieldX0 = null;
                    }
                    spannableStringBuilder3 = spannableStringBuilder2;
                    p1(13, observableFieldX0);
                    if (observableFieldX0 != null) {
                        z6 = z11;
                        z5 = zK4;
                        drawable = (Drawable) observableFieldX0.get();
                        i = 8;
                    }
                    z7 = zEquals;
                    i5 = i12;
                    i4 = i11;
                    i2 = i13;
                    spannableStringBuilder = spannableStringBuilder3;
                } else {
                    spannableStringBuilder3 = spannableStringBuilder2;
                }
                z6 = z11;
                z5 = zK4;
                i = 8;
                drawable = null;
                z7 = zEquals;
                i5 = i12;
                i4 = i11;
                i2 = i13;
                spannableStringBuilder = spannableStringBuilder3;
            } else {
                j2 = 102400;
            }
            i8 = 0;
            j7 = j & 98306;
            if (j7 != 0) {
                if (t2Var != null) {
                    observableFieldM0 = t2Var.m0();
                } else {
                    observableFieldM0 = null;
                }
                p1(1, observableFieldM0);
                if (observableFieldM0 != null) {
                    str = (String) observableFieldM0.get();
                } else {
                    str = null;
                }
                z = true;
                if (str != "running") {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (str == "running") {
                    z13 = true;
                } else {
                    z13 = false;
                }
                j3 = 149533715595264L;
                zEquals = "done".equals(str);
                zEquals2 = "running".equals(str);
                if (j7 != 0) {
                    if (z12) {
                        j24 = 16777216;
                    } else {
                        j24 = 8388608;
                    }
                    j |= j24;
                }
                if ((j & 98306) != 0) {
                    if (z13) {
                        j23 = 70368744177664L;
                    } else {
                        j23 = 35184372088832L;
                    }
                    j |= j23;
                }
                if ((j & 98306) != 0) {
                    if (zEquals) {
                        j |= 1125899906842624L;
                    } else {
                        j |= 562949953421312L;
                    }
                }
                if ((j & 98306) != 0) {
                    if (zEquals2) {
                        j22 = 274877906944L;
                    } else {
                        j22 = 137438953472L;
                    }
                    j |= j22;
                }
                if (z12) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                if (z13) {
                }
                if (zEquals2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
            } else {
                z = true;
                j3 = 149533715595264L;
                i11 = 0;
                i12 = 0;
                i6 = 0;
                str = null;
                zEquals = false;
            }
            j8 = j & 100356;
            if (j8 != 0) {
                if (t2Var != null) {
                    uVarH0 = t2Var.h0();
                } else {
                    uVarH0 = null;
                }
                j4 = 299067431190528L;
                p1(2, uVarH0);
                if (uVarH0 != null) {
                    bool7 = (Boolean) uVarH0.get();
                } else {
                    bool7 = null;
                }
                zK4 = androidx.databinding.c0.K0(bool7);
                if (j8 != 0) {
                    if (zK4) {
                        j21 = 1048576;
                    } else {
                        j21 = 524288;
                    }
                    j |= j21;
                }
                if ((j & 98308) != 0) {
                    if (zK4) {
                        j20 = 4294967296L;
                    } else {
                        j20 = 2147483648L;
                    }
                    j |= j20;
                }
                j17 = j & 98308;
                if (j17 != 0) {
                    z2 = zK4;
                } else {
                    z2 = false;
                }
                z3 = !zK4;
                if (j17 != 0) {
                    if (zK4) {
                        j19 = 4194304;
                    } else {
                        j19 = 2097152;
                    }
                    j |= j19;
                }
                if ((j & 100356) != 0) {
                    if (zK4) {
                        j18 = 17179869184L;
                    } else {
                        j18 = 8589934592L;
                    }
                    j |= j18;
                }
                if ((j & 98308) != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                }
                if ((j & 98312) != 0) {
                    if (t2Var != null) {
                        uVarJ0 = t2Var.j0();
                    } else {
                        uVarJ0 = null;
                    }
                    p1(3, uVarJ0);
                    if (uVarJ0 != null) {
                        bool6 = (Boolean) uVarJ0.get();
                    } else {
                        bool6 = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool6);
                } else {
                    zK1 = false;
                }
                j9 = j & 99392;
                if (j9 != 0) {
                    if (t2Var != null) {
                        long j214 = j;
                        uVarZ0 = t2Var.z0();
                        j16 = j214;
                    } else {
                        j16 = j;
                        uVarZ0 = null;
                    }
                    p1(6, uVarZ0);
                    if (uVarZ0 != null) {
                        bool5 = (Boolean) uVarZ0.get();
                    } else {
                        bool5 = null;
                    }
                    zK7 = androidx.databinding.c0.K0(bool5);
                    if (j9 != 0) {
                        if (zK7) {
                            j16 |= 262144;
                        } else {
                            j16 |= 131072;
                        }
                    }
                    z11 = zK7;
                    j = j16;
                } else {
                    z11 = false;
                }
                if ((j & 98560) != 0) {
                    if (t2Var != null) {
                        long j215 = j;
                        uVarK0 = t2Var.k0();
                        j10 = j215;
                    } else {
                        j10 = j;
                        uVarK0 = null;
                    }
                    p1(8, uVarK0);
                    if (uVarK0 != null) {
                        bool4 = (Boolean) uVarK0.get();
                    } else {
                        bool4 = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool4);
                } else {
                    j10 = j;
                    zK0 = false;
                }
                j11 = j10 & 98816;
                if (j11 != 0) {
                    if (t2Var != null) {
                        observableField3 = t2Var.mIsCurrentFragmentEmpty;
                    } else {
                        observableField3 = null;
                    }
                    p1(9, observableField3);
                    if (observableField3 != null) {
                        bool3 = (Boolean) observableField3.get();
                    } else {
                        bool3 = null;
                    }
                    zK6 = androidx.databinding.c0.K0(bool3);
                    if (j11 != 0) {
                        if (zK6) {
                            j15 = 4398046511104L;
                        } else {
                            j15 = 2199023255552L;
                        }
                        j10 |= j15;
                    }
                    if (zK6) {
                        i14 = 8;
                    } else {
                        i14 = 0;
                    }
                    i7 = i14;
                } else {
                    i7 = 0;
                }
                j12 = j10;
                j13 = j12 & 100352;
                if (j13 != 0) {
                    if (t2Var != null) {
                        observableField2 = t2Var.editModel;
                    } else {
                        observableField2 = null;
                    }
                    p1(11, observableField2);
                    if (observableField2 != null) {
                        bool2 = (Boolean) observableField2.get();
                    } else {
                        bool2 = null;
                    }
                    zK5 = androidx.databinding.c0.K0(bool2);
                    if (j13 != 0) {
                        j14 = j12;
                    } else if (zK5) {
                        j14 = j12 | j4;
                    } else {
                        j14 = j12 | j3;
                    }
                    if (zK5) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    z8 = !zK5;
                    if (zK5) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    if (zK5) {
                        f2 = 0.3f;
                    } else {
                        f2 = 1.0f;
                    }
                    zK2 = androidx.databinding.c0.K0(Boolean.valueOf(z8));
                    float f5 = f2;
                    observableField = observableField2;
                    long j216 = j14;
                    bool = bool2;
                    f = f5;
                    j12 = j216;
                } else {
                    f = 0.0f;
                    observableField = null;
                    bool = null;
                    i3 = 0;
                    z8 = false;
                    i13 = 0;
                    zK2 = false;
                }
                if ((j12 & j2) != 0) {
                    if (t2Var != null) {
                        long j217 = j12;
                        uVarY0 = t2Var.y0();
                        j5 = j217;
                    } else {
                        j5 = j12;
                        uVarY0 = null;
                    }
                    p1(12, uVarY0);
                    if (uVarY0 != null) {
                    }
                    if ((j5 & 106496) != 0) {
                        if (t2Var != null) {
                            observableFieldX0 = t2Var.x0();
                        } else {
                            observableFieldX0 = null;
                        }
                        spannableStringBuilder3 = spannableStringBuilder2;
                        p1(13, observableFieldX0);
                        if (observableFieldX0 != null) {
                            z6 = z11;
                            z5 = zK4;
                            drawable = (Drawable) observableFieldX0.get();
                            i = 8;
                        }
                        z7 = zEquals;
                        i5 = i12;
                        i4 = i11;
                        i2 = i13;
                        spannableStringBuilder = spannableStringBuilder3;
                    } else {
                        spannableStringBuilder3 = spannableStringBuilder2;
                    }
                    z6 = z11;
                    z5 = zK4;
                    i = 8;
                    drawable = null;
                    z7 = zEquals;
                    i5 = i12;
                    i4 = i11;
                    i2 = i13;
                    spannableStringBuilder = spannableStringBuilder3;
                } else {
                    j5 = j12;
                }
                if ((j5 & 106496) != 0) {
                    if (t2Var != null) {
                        observableFieldX0 = t2Var.x0();
                    } else {
                        observableFieldX0 = null;
                    }
                    spannableStringBuilder3 = spannableStringBuilder2;
                    p1(13, observableFieldX0);
                    if (observableFieldX0 != null) {
                        z6 = z11;
                        z5 = zK4;
                        drawable = (Drawable) observableFieldX0.get();
                        i = 8;
                    }
                    z7 = zEquals;
                    i5 = i12;
                    i4 = i11;
                    i2 = i13;
                    spannableStringBuilder = spannableStringBuilder3;
                } else {
                    spannableStringBuilder3 = spannableStringBuilder2;
                }
                z6 = z11;
                z5 = zK4;
                i = 8;
                drawable = null;
                z7 = zEquals;
                i5 = i12;
                i4 = i11;
                i2 = i13;
                spannableStringBuilder = spannableStringBuilder3;
            } else {
                j4 = 299067431190528L;
                z4 = false;
                zK4 = false;
                z2 = false;
            }
            z3 = false;
            if ((j & 98312) != 0) {
                if (t2Var != null) {
                    uVarJ0 = t2Var.j0();
                } else {
                    uVarJ0 = null;
                }
                p1(3, uVarJ0);
                if (uVarJ0 != null) {
                    bool6 = (Boolean) uVarJ0.get();
                } else {
                    bool6 = null;
                }
                zK1 = androidx.databinding.c0.K0(bool6);
            } else {
                zK1 = false;
            }
            j9 = j & 99392;
            if (j9 != 0) {
                if (t2Var != null) {
                    long j218 = j;
                    uVarZ0 = t2Var.z0();
                    j16 = j218;
                } else {
                    j16 = j;
                    uVarZ0 = null;
                }
                p1(6, uVarZ0);
                if (uVarZ0 != null) {
                    bool5 = (Boolean) uVarZ0.get();
                } else {
                    bool5 = null;
                }
                zK7 = androidx.databinding.c0.K0(bool5);
                if (j9 != 0) {
                    if (zK7) {
                        j16 |= 262144;
                    } else {
                        j16 |= 131072;
                    }
                }
                z11 = zK7;
                j = j16;
            } else {
                z11 = false;
            }
            if ((j & 98560) != 0) {
                if (t2Var != null) {
                    long j219 = j;
                    uVarK0 = t2Var.k0();
                    j10 = j219;
                } else {
                    j10 = j;
                    uVarK0 = null;
                }
                p1(8, uVarK0);
                if (uVarK0 != null) {
                    bool4 = (Boolean) uVarK0.get();
                } else {
                    bool4 = null;
                }
                zK0 = androidx.databinding.c0.K0(bool4);
            } else {
                j10 = j;
                zK0 = false;
            }
            j11 = j10 & 98816;
            if (j11 != 0) {
                if (t2Var != null) {
                    observableField3 = t2Var.mIsCurrentFragmentEmpty;
                } else {
                    observableField3 = null;
                }
                p1(9, observableField3);
                if (observableField3 != null) {
                    bool3 = (Boolean) observableField3.get();
                } else {
                    bool3 = null;
                }
                zK6 = androidx.databinding.c0.K0(bool3);
                if (j11 != 0) {
                    if (zK6) {
                        j15 = 4398046511104L;
                    } else {
                        j15 = 2199023255552L;
                    }
                    j10 |= j15;
                }
                if (zK6) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                i7 = i14;
            } else {
                i7 = 0;
            }
            j12 = j10;
            j13 = j12 & 100352;
            if (j13 != 0) {
                if (t2Var != null) {
                    observableField2 = t2Var.editModel;
                } else {
                    observableField2 = null;
                }
                p1(11, observableField2);
                if (observableField2 != null) {
                    bool2 = (Boolean) observableField2.get();
                } else {
                    bool2 = null;
                }
                zK5 = androidx.databinding.c0.K0(bool2);
                if (j13 != 0) {
                    j14 = j12;
                } else if (zK5) {
                    j14 = j12 | j4;
                } else {
                    j14 = j12 | j3;
                }
                if (zK5) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                z8 = !zK5;
                if (zK5) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                if (zK5) {
                    f2 = 0.3f;
                } else {
                    f2 = 1.0f;
                }
                zK2 = androidx.databinding.c0.K0(Boolean.valueOf(z8));
                float f6 = f2;
                observableField = observableField2;
                long j2110 = j14;
                bool = bool2;
                f = f6;
                j12 = j2110;
            } else {
                f = 0.0f;
                observableField = null;
                bool = null;
                i3 = 0;
                z8 = false;
                i13 = 0;
                zK2 = false;
            }
            if ((j12 & j2) != 0) {
                if (t2Var != null) {
                    long j2111 = j12;
                    uVarY0 = t2Var.y0();
                    j5 = j2111;
                } else {
                    j5 = j12;
                    uVarY0 = null;
                }
                p1(12, uVarY0);
                if (uVarY0 != null) {
                }
                if ((j5 & 106496) != 0) {
                    if (t2Var != null) {
                        observableFieldX0 = t2Var.x0();
                    } else {
                        observableFieldX0 = null;
                    }
                    spannableStringBuilder3 = spannableStringBuilder2;
                    p1(13, observableFieldX0);
                    if (observableFieldX0 != null) {
                        z6 = z11;
                        z5 = zK4;
                        drawable = (Drawable) observableFieldX0.get();
                        i = 8;
                    }
                    z7 = zEquals;
                    i5 = i12;
                    i4 = i11;
                    i2 = i13;
                    spannableStringBuilder = spannableStringBuilder3;
                } else {
                    spannableStringBuilder3 = spannableStringBuilder2;
                }
                z6 = z11;
                z5 = zK4;
                i = 8;
                drawable = null;
                z7 = zEquals;
                i5 = i12;
                i4 = i11;
                i2 = i13;
                spannableStringBuilder = spannableStringBuilder3;
            } else {
                j5 = j12;
            }
            if ((j5 & 106496) != 0) {
                if (t2Var != null) {
                    observableFieldX0 = t2Var.x0();
                } else {
                    observableFieldX0 = null;
                }
                spannableStringBuilder3 = spannableStringBuilder2;
                p1(13, observableFieldX0);
                if (observableFieldX0 != null) {
                    z6 = z11;
                    z5 = zK4;
                    drawable = (Drawable) observableFieldX0.get();
                    i = 8;
                }
                z7 = zEquals;
                i5 = i12;
                i4 = i11;
                i2 = i13;
                spannableStringBuilder = spannableStringBuilder3;
            } else {
                spannableStringBuilder3 = spannableStringBuilder2;
            }
            z6 = z11;
            z5 = zK4;
            i = 8;
            drawable = null;
            z7 = zEquals;
            i5 = i12;
            i4 = i11;
            i2 = i13;
            spannableStringBuilder = spannableStringBuilder3;
        } else {
            z = true;
            j2 = 102400;
            j3 = 149533715595264L;
            j4 = 299067431190528L;
            i = 8;
            j5 = j;
            f = 0.0f;
            z2 = false;
            zK0 = false;
            i2 = 0;
            i3 = 0;
            zK1 = false;
            i4 = 0;
            zK2 = false;
            z3 = false;
            i5 = 0;
            i6 = 0;
            str = null;
            i7 = 0;
            z4 = false;
            z5 = false;
            observableField = null;
            z6 = false;
            z7 = false;
            bool = null;
            spannableStringBuilder = null;
            z8 = false;
            drawable = null;
            i8 = 0;
        }
        boolean zEquals3 = (j5 & 562949953421312L) != 0 ? com.zentraedi.comic.viewmodel.t2.F.equals(str) : false;
        if ((j5 & 262144) != 0) {
            androidx.databinding.u uVarG0 = t2Var != null ? t2Var.g0() : null;
            p1(10, uVarG0);
            zK3 = androidx.databinding.c0.K0(uVarG0 != null ? (Boolean) uVarG0.get() : null);
        } else {
            zEquals3 = zEquals3;
            zK3 = false;
        }
        if ((j5 & 17180917760L) != 0) {
            ObservableField<Boolean> observableField4 = t2Var != null ? t2Var.editModel : observableField;
            p1(11, observableField4);
            if (observableField4 != null) {
                bool = (Boolean) observableField4.get();
            }
            boolean zK9 = androidx.databinding.c0.K0(bool);
            if ((j5 & 100352) != 0) {
                j6 = zK9 ? j5 | j4 : j5 | j3;
            } else {
                j6 = j5;
            }
            z8 = !zK9;
        } else {
            j6 = j5;
        }
        long j30 = j6 & 99392;
        if (j30 == 0) {
            i9 = 0;
        } else {
            if (!z6) {
                zK3 = false;
            }
            if (j30 != 0) {
                j6 |= zK3 ? 1099511627776L : 549755813888L;
            }
            if (zK3) {
                i9 = 0;
            } else {
                i9 = i;
            }
        }
        if ((j6 & 100356) != 0) {
            z10 = z5 ? z8 : false;
            if (!z4) {
                z8 = false;
            }
            z9 = z8;
        } else {
            z9 = false;
            z10 = false;
        }
        long j31 = j6 & 98306;
        if (j31 != 0) {
            if (z7) {
                zEquals3 = z;
            }
            if (j31 != 0) {
                j6 |= zEquals3 ? 67108864L : 33554432L;
            }
        } else {
            zEquals3 = false;
        }
        boolean zEquals4 = (j6 & 33554432) != 0 ? "error".equals(str) : false;
        long j32 = j6 & 98306;
        if (j32 != 0) {
            if (zEquals3) {
                zEquals4 = z;
            }
            if (j32 != 0) {
                j6 |= zEquals4 ? 68719476736L : 34359738368L;
            }
            i10 = zEquals4 ? 0 : i;
        } else {
            i10 = 0;
        }
        if ((j6 & 100352) != 0) {
            if (androidx.databinding.c0.A() >= 11) {
                this.F.setAlpha(f);
                this.N.setAlpha(f);
            }
            this.M.getRoot().setVisibility(i2);
            this.R.setVisibility(i2);
            this.U.getRoot().setVisibility(i3);
            this.W.setEnabled(zK2);
        }
        if ((j6 & 100356) != 0) {
            this.F.setEnabled(z10);
            this.N.setEnabled(z9);
        }
        if ((j6 & 98308) != 0) {
            com.zentraedi.business.utils.u.Y(this.F, z3);
            com.zentraedi.business.utils.u.Y(this.N, z2);
        }
        if ((j6 & 98306) != 0) {
            this.G.setVisibility(i6);
            this.H.setVisibility(i4);
            this.k0.setVisibility(i5);
            this.Y.setVisibility(i10);
        }
        if ((j6 & 98312) != 0) {
            this.K.setEnabled(zK1);
        }
        if ((j6 & 98560) != 0) {
            this.L.setEnabled(zK0);
        }
        if ((j6 & 98304) != 0) {
            this.M.C1(t2Var);
            this.U.C1(t2Var);
        }
        if ((j6 & 98816) != 0) {
            this.S.getRoot().setVisibility(i7);
        }
        if ((j6 & 81920) != 0) {
            this.S.C1(m2Var);
        }
        if ((j6 & 65536) != 0) {
            androidx.databinding.adapters.j0.o(this.i0, g8.h() + com.zentraedi.basic.function.utils.m0.b(88.0f));
            this.j0.setOnClickListener(this.l0);
            com.zentraedi.business.utils.u.b0(this.W, g8.h() + com.zentraedi.basic.function.utils.m0.b(44.0f));
        }
        if ((j6 & 98305) != 0) {
            this.j0.setVisibility(i8);
        }
        if ((j6 & 106496) != 0) {
            androidx.databinding.adapters.p.a(this.Y, drawable);
        }
        if ((j6 & 99392) != 0) {
            this.b0.setVisibility(i9);
        }
        if ((j6 & j2) != 0) {
            androidx.databinding.adapters.f0.A(this.c0, spannableStringBuilder);
        }
        androidx.databinding.c0.t(this.S);
        androidx.databinding.c0.t(this.U);
        androidx.databinding.c0.t(this.M);
    }

    private b2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 14, (AppBarLayout) objArr[19], (TextView) objArr[8], (TextView) objArr[7], (ImageView) objArr[6], (CollapsingToolbarLayout) objArr[20], (RelativeLayout) objArr[24], (TextView) objArr[11], (TextView) objArr[12], (f4) objArr[18], (TextView) objArr[9], (ImageView) objArr[29], (ImageView) objArr[27], (ImageView) objArr[30], (LinearLayout) objArr[10], (p4) objArr[16], (LinearLayout) objArr[28], (gj) objArr[17], (RelativeLayout) objArr[26], (SlidingTabLayout) objArr[13], (View) objArr[23], (ImageView) objArr[3], (Toolbar) objArr[14], (FrameLayout) objArr[21], (RelativeLayout) objArr[2], (TextView) objArr[5], (RelativeLayout) objArr[22], (NoScrollViewPager) objArr[25]);
        this.m0 = -1L;
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        N0(this.M);
        this.N.setTag(null);
        this.R.setTag(null);
        N0(this.S);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.h0 = frameLayout;
        frameLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.i0 = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[15];
        this.j0 = linearLayout;
        linearLayout.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[4];
        this.k0 = progressBar;
        progressBar.setTag(null);
        N0(this.U);
        this.W.setTag(null);
        this.Y.setTag(null);
        this.Z.setTag(null);
        this.b0.setTag(null);
        this.c0.setTag(null);
        P0(view);
        this.l0 = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
