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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.comic.viewmodel.i6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class n3 extends m3 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i X = null;

    @androidx.annotation.p0
    private static final SparseIntArray Y;

    @androidx.annotation.n0
    private final ConstraintLayout I;

    @androidx.annotation.n0
    private final ImageView J;

    @androidx.annotation.n0
    private final TextView K;

    @androidx.annotation.n0
    private final ImageView L;

    @androidx.annotation.n0
    private final LinearLayout M;

    @androidx.annotation.n0
    private final TextView N;

    @androidx.annotation.n0
    private final ImageView O;

    @androidx.annotation.n0
    private final ImageView P;

    @androidx.annotation.n0
    private final ImageView Q;

    @androidx.annotation.n0
    private final RelativeLayout R;

    @androidx.annotation.n0
    private final TextView S;

    @androidx.annotation.n0
    private final ImageView T;

    @androidx.annotation.n0
    private final ProgressBar U;

    @androidx.annotation.n0
    private final LinearLayout V;
    private long W;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.Qn, 14);
        sparseIntArray.put(com.zentraedi.comic.q.i.m4, 15);
    }

    public n3(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 16, X, Y));
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= 256;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
        return true;
    }

    private boolean I1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= 1;
        }
        return true;
    }

    private boolean J1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= 4;
        }
        return true;
    }

    private boolean K1(ObservableInt observableInt, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= 512;
        }
        return true;
    }

    private boolean L1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= 64;
        }
        return true;
    }

    private boolean N1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= 32;
        }
        return true;
    }

    private boolean O1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
        }
        return true;
    }

    private boolean P1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= 8;
        }
        return true;
    }

    private boolean Q1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= 16;
        }
        return true;
    }

    private boolean R1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= 128;
        }
        return true;
    }

    private boolean S1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.W |= 2;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.m3
    public void D1(@androidx.annotation.p0 Boolean bool) {
        this.G = bool;
    }

    @Override // com.zentraedi.comic.databinding.m3
    public void E1(@androidx.annotation.p0 i6 i6Var) {
        this.H = i6Var;
        synchronized (this) {
            this.W |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.G1);
        super.C0();
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.W != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.W = 16384L;
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
                return S1((ObservableBoolean) obj, i2);
            case 2:
                return J1((ObservableField) obj, i2);
            case 3:
                return P1((ObservableField) obj, i2);
            case 4:
                return Q1((ObservableField) obj, i2);
            case 5:
                return N1((ObservableField) obj, i2);
            case 6:
                return L1((ObservableBoolean) obj, i2);
            case 7:
                return R1((ObservableField) obj, i2);
            case 8:
                return F1((ObservableField) obj, i2);
            case 9:
                return K1((ObservableInt) obj, i2);
            case 10:
                return G1((ObservableField) obj, i2);
            case 11:
                return O1((ObservableField) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0180  */
    /* JADX WARN: Code duplicated, block: B:103:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x018c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0194  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:124:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:128:0x01db  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:139:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:142:0x0200  */
    /* JADX WARN: Code duplicated, block: B:143:0x0202  */
    /* JADX WARN: Code duplicated, block: B:145:0x0205 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x0207  */
    /* JADX WARN: Code duplicated, block: B:148:0x020f  */
    /* JADX WARN: Code duplicated, block: B:151:0x021b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x021d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0223  */
    /* JADX WARN: Code duplicated, block: B:156:0x0229  */
    /* JADX WARN: Code duplicated, block: B:157:0x022b  */
    /* JADX WARN: Code duplicated, block: B:159:0x022f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0231  */
    /* JADX WARN: Code duplicated, block: B:161:0x0234  */
    /* JADX WARN: Code duplicated, block: B:164:0x023e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x0240  */
    /* JADX WARN: Code duplicated, block: B:166:0x0245  */
    /* JADX WARN: Code duplicated, block: B:169:0x024f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0251  */
    /* JADX WARN: Code duplicated, block: B:172:0x0254 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x0256  */
    /* JADX WARN: Code duplicated, block: B:175:0x025c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0268  */
    /* JADX WARN: Code duplicated, block: B:180:0x026b  */
    /* JADX WARN: Code duplicated, block: B:181:0x026e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0272 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0274  */
    /* JADX WARN: Code duplicated, block: B:188:0x0290  */
    /* JADX WARN: Code duplicated, block: B:189:0x0296  */
    /* JADX WARN: Code duplicated, block: B:190:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:201:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x0305  */
    /* JADX WARN: Code duplicated, block: B:205:0x0315  */
    /* JADX WARN: Code duplicated, block: B:208:0x0327 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x0329  */
    /* JADX WARN: Code duplicated, block: B:210:0x032c  */
    /* JADX WARN: Code duplicated, block: B:212:0x0332  */
    /* JADX WARN: Code duplicated, block: B:215:0x0340  */
    /* JADX WARN: Code duplicated, block: B:218:0x0345  */
    /* JADX WARN: Code duplicated, block: B:221:0x034f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:222:0x0351  */
    /* JADX WARN: Code duplicated, block: B:223:0x0356  */
    /* JADX WARN: Code duplicated, block: B:226:0x035e  */
    /* JADX WARN: Code duplicated, block: B:227:0x0365  */
    /* JADX WARN: Code duplicated, block: B:229:0x036b  */
    /* JADX WARN: Code duplicated, block: B:232:0x0372 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x0374  */
    /* JADX WARN: Code duplicated, block: B:235:0x0377 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x0379  */
    /* JADX WARN: Code duplicated, block: B:238:0x037f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0385  */
    /* JADX WARN: Code duplicated, block: B:241:0x0388 A[PHI: r35
      0x0388: PHI (r35v3 long) = (r35v2 long), (r35v17 long) binds: [B:231:0x0370, B:239:0x0383] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:244:0x0393 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:245:0x0395  */
    /* JADX WARN: Code duplicated, block: B:248:0x039c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x039e  */
    /* JADX WARN: Code duplicated, block: B:251:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:254:0x03ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:255:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:257:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:258:0x03be  */
    /* JADX WARN: Code duplicated, block: B:261:0x03c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:263:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:265:0x03cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:266:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:268:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:269:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:272:0x03e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:273:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:275:0x03e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:276:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:278:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:280:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:281:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:283:0x0400  */
    /* JADX WARN: Code duplicated, block: B:286:0x040c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:287:0x040e  */
    /* JADX WARN: Code duplicated, block: B:289:0x041c  */
    /* JADX WARN: Code duplicated, block: B:292:0x0425  */
    /* JADX WARN: Code duplicated, block: B:293:0x042c  */
    /* JADX WARN: Code duplicated, block: B:297:0x043b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:298:0x043d  */
    /* JADX WARN: Code duplicated, block: B:300:0x0448  */
    /* JADX WARN: Code duplicated, block: B:303:0x044f  */
    /* JADX WARN: Code duplicated, block: B:304:0x0456  */
    /* JADX WARN: Code duplicated, block: B:307:0x0460  */
    /* JADX WARN: Code duplicated, block: B:309:0x0468  */
    /* JADX WARN: Code duplicated, block: B:312:0x0479 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:313:0x047b  */
    /* JADX WARN: Code duplicated, block: B:315:0x0484  */
    /* JADX WARN: Code duplicated, block: B:318:0x048d  */
    /* JADX WARN: Code duplicated, block: B:319:0x0494  */
    /* JADX WARN: Code duplicated, block: B:323:0x049d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:324:0x049f  */
    /* JADX WARN: Code duplicated, block: B:326:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:329:0x04ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:331:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:333:0x04b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:334:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:336:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:338:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:339:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:341:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:344:0x04d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:345:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:347:0x04de  */
    /* JADX WARN: Code duplicated, block: B:350:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:351:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:354:0x0506  */
    /* JADX WARN: Code duplicated, block: B:356:0x0521  */
    /* JADX WARN: Code duplicated, block: B:359:0x0531  */
    /* JADX WARN: Code duplicated, block: B:362:0x053c  */
    /* JADX WARN: Code duplicated, block: B:365:0x054c  */
    /* JADX WARN: Code duplicated, block: B:368:0x0557  */
    /* JADX WARN: Code duplicated, block: B:371:0x0562  */
    /* JADX WARN: Code duplicated, block: B:374:0x056f  */
    /* JADX WARN: Code duplicated, block: B:377:0x057a  */
    /* JADX WARN: Code duplicated, block: B:380:0x0585  */
    /* JADX WARN: Code duplicated, block: B:383:0x0592  */
    /* JADX WARN: Code duplicated, block: B:390:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x011e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0129  */
    /* JADX WARN: Code duplicated, block: B:73:0x0132  */
    /* JADX WARN: Code duplicated, block: B:74:0x0139  */
    /* JADX WARN: Code duplicated, block: B:77:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0142  */
    /* JADX WARN: Code duplicated, block: B:80:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0153  */
    /* JADX WARN: Code duplicated, block: B:84:0x0156  */
    /* JADX WARN: Code duplicated, block: B:88:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0163  */
    /* JADX WARN: Code duplicated, block: B:90:0x0166  */
    /* JADX WARN: Code duplicated, block: B:93:0x016c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0171  */
    /* JADX WARN: Code duplicated, block: B:97:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x017a  */
    protected void r() {
        long j;
        i6 i6Var;
        long j2;
        long j3;
        long j4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View.OnLongClickListener longListener;
        int i6;
        String str;
        Drawable drawableB;
        View.OnClickListener onClickListenerK0;
        View.OnClickListener onClickListenerJ0;
        androidx.databinding.u uVarS0;
        int iH0;
        View.OnClickListener onClickListenerN0;
        boolean z;
        boolean z2;
        boolean zZ0;
        Boolean bool;
        boolean zK0;
        boolean z3;
        String str2;
        String str3;
        androidx.databinding.u uVarS1;
        boolean z4;
        boolean z5;
        boolean z6;
        long j5;
        boolean z7;
        boolean zK1;
        long j6;
        int i7;
        long j7;
        long j8;
        int i8;
        int i9;
        String str4;
        String str5;
        String str6;
        boolean zIsEmpty;
        String str7;
        String str8;
        String str9;
        long j9;
        int i10;
        long j10;
        String str10;
        int i11;
        long j11;
        androidx.databinding.u uVarI0;
        androidx.databinding.u uVarH0;
        androidx.databinding.u uVarL0;
        int i12;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        ObservableField<Boolean> observableFieldR0;
        Boolean bool2;
        androidx.databinding.u uVar;
        long j17;
        int i13;
        long j18;
        long j19;
        Integer numP0;
        boolean z8;
        long j20;
        boolean z9;
        long j21;
        long j22;
        androidx.databinding.u uVarO0;
        int i14;
        boolean z10;
        boolean z11;
        long j23;
        long j24;
        androidx.databinding.u uVarW0;
        ObservableBoolean observableBoolean;
        long j25;
        long j26;
        long j27;
        androidx.databinding.u uVarQ0;
        Boolean bool3;
        boolean zK2;
        long j28;
        ObservableField<String> observableFieldM0;
        ObservableField<String> observableFieldU0;
        Context context;
        int i15;
        synchronized (this) {
            j = this.W;
            this.W = 0L;
        }
        i6 i6Var2 = this.H;
        if ((24575 & j) != 0) {
            if ((j & 20480) == 0 || i6Var2 == null) {
                longListener = null;
                onClickListenerK0 = null;
                onClickListenerJ0 = null;
                onClickListenerN0 = null;
            } else {
                longListener = i6Var2.getLongListener();
                onClickListenerK0 = i6Var2.k0();
                onClickListenerJ0 = i6Var2.j0();
                onClickListenerN0 = i6Var2.n0();
            }
            long j29 = j & 20482;
            j3 = 1099511889920L;
            if (j29 != 0) {
                ObservableBoolean observableBoolean2 = i6Var2 != null ? ((com.zentraedi.business.addfile.n) i6Var2).w : null;
                p1(1, observableBoolean2);
                boolean z12 = observableBoolean2 != null ? observableBoolean2.get() : false;
                if (j29 != 0) {
                    j |= z12 ? 68719476736L : 34359738368L;
                }
                if (z12) {
                    context = this.O.getContext();
                    i15 = com.zentraedi.comic.q.h.pI;
                } else {
                    context = this.O.getContext();
                    i15 = com.zentraedi.comic.q.h.qI;
                }
                drawableB = g.a.b(context, i15);
            } else {
                drawableB = null;
            }
            if ((j & 20500) != 0) {
                if (i6Var2 != null) {
                    observableFieldM0 = i6Var2.m0();
                    observableFieldU0 = i6Var2.u0();
                    zZ0 = i6Var2.z0();
                } else {
                    observableFieldM0 = null;
                    observableFieldU0 = null;
                    zZ0 = false;
                }
                p1(2, observableFieldM0);
                p1(4, observableFieldU0);
                str2 = observableFieldM0 != null ? (String) observableFieldM0.get() : null;
                str3 = observableFieldU0 != null ? (String) observableFieldU0.get() : null;
            } else {
                str2 = null;
                str3 = null;
                zZ0 = false;
            }
            long j30 = j & 20488;
            if (j30 != 0) {
                uVarS0 = i6Var2 != null ? i6Var2.s0() : null;
                p1(3, uVarS0);
                bool = uVarS0 != null ? (Boolean) uVarS0.get() : null;
                zK0 = androidx.databinding.c0.K0(bool);
                if (j30 != 0) {
                    j = zK0 ? j | 1099511889920L : j | 549755944960L;
                }
                i = zK0 ? 0 : 8;
                int i16 = zK0 ? 8 : 0;
                j17 = j & 20512;
                if (j17 != 0) {
                    if (i6Var2 != null) {
                        uVarQ0 = i6Var2.q0();
                        j2 = 20482;
                    } else {
                        j2 = 20482;
                        uVarQ0 = null;
                    }
                    p1(5, uVarQ0);
                    if (uVarQ0 != null) {
                        bool3 = (Boolean) uVarQ0.get();
                    } else {
                        bool3 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool3);
                    if (j17 != 0) {
                        if (zK2) {
                            j28 = 70368744177664L;
                        } else {
                            j28 = 35184372088832L;
                        }
                        j |= j28;
                    }
                    if (zK2) {
                        i5 = 8;
                    }
                    if ((j & 22600) != 0) {
                        if (i6Var2 != null) {
                            observableBoolean = ((com.zentraedi.business.addfile.n) i6Var2).x;
                        } else {
                            observableBoolean = null;
                        }
                        p1(6, observableBoolean);
                        if (observableBoolean != null) {
                            z = observableBoolean.get();
                        } else {
                            z = false;
                        }
                        if ((j & 22592) != 0) {
                            if (z) {
                                j27 = 65536;
                            } else {
                                j27 = 32768;
                            }
                            j |= j27;
                        }
                        if ((j & 20552) != 0) {
                            if (z) {
                                j26 = 17592186044416L;
                            } else {
                                j26 = 8796093022208L;
                            }
                            j |= j26;
                        }
                        if ((j & 20544) != 0) {
                            if (z) {
                                j25 = 281474976710656L;
                            } else {
                                j25 = 140737488355328L;
                            }
                            j |= j25;
                        }
                        if ((j & 20544) == 0 && !z) {
                            i13 = 8;
                        }
                        if ((j & 21633) == 0) {
                            str = null;
                        } else {
                            if (i6Var2 != null) {
                                uVarW0 = i6Var2.w0();
                            } else {
                                uVarW0 = null;
                            }
                            p1(7, uVarW0);
                            if (uVarW0 != null) {
                                str = (String) uVarW0.get();
                            } else {
                                str = null;
                            }
                        }
                        j18 = j & 20992;
                        if (j18 != 0) {
                            if (i6Var2 != null) {
                                uVarO0 = i6Var2.o0();
                            } else {
                                uVarO0 = null;
                            }
                            p1(9, uVarO0);
                            if (uVarO0 != null) {
                                i14 = uVarO0.get();
                            } else {
                                i14 = 0;
                            }
                            if (i14 == 2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (i14 == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (j18 != 0) {
                                if (z10) {
                                    j24 = 17179869184L;
                                } else {
                                    j24 = 8589934592L;
                                }
                                j |= j24;
                            }
                            if ((j & 20992) != 0) {
                                if (z11) {
                                    j23 = 1073741824;
                                } else {
                                    j23 = 536870912;
                                }
                                j |= j23;
                            }
                            if (z10) {
                                i6 = 0;
                            } else {
                                i6 = 8;
                            }
                            if (z11) {
                                i4 = 0;
                            } else {
                                i4 = 8;
                            }
                        } else {
                            i4 = 0;
                            i6 = 0;
                        }
                        j19 = j & 21889;
                        if (j19 != 0) {
                            if (i6Var2 != null) {
                                numP0 = i6Var2.p0();
                            } else {
                                numP0 = null;
                            }
                            iH0 = androidx.databinding.c0.H0(numP0);
                            i6Var = i6Var2;
                            if (iH0 == 1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (j19 != 0) {
                                if (z8) {
                                    j22 = 4194304;
                                } else {
                                    j22 = 2097152;
                                }
                                j |= j22;
                            }
                            j20 = j & 20736;
                            z3 = z8;
                            if (j20 != 0) {
                                if (iH0 != 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (j20 != 0) {
                                    if (z9) {
                                        j21 = 4398046511104L;
                                    } else {
                                        j21 = 2199023255552L;
                                    }
                                    j |= j21;
                                }
                                z2 = z9;
                            } else {
                                z2 = false;
                            }
                        } else {
                            i6Var = i6Var2;
                            iH0 = 0;
                            z2 = false;
                            z3 = false;
                        }
                        j4 = j;
                        i2 = i16;
                        i3 = i13;
                    } else {
                        z = false;
                    }
                    i13 = 0;
                    if ((j & 21633) == 0) {
                        str = null;
                    } else {
                        if (i6Var2 != null) {
                            uVarW0 = i6Var2.w0();
                        } else {
                            uVarW0 = null;
                        }
                        p1(7, uVarW0);
                        if (uVarW0 != null) {
                            str = (String) uVarW0.get();
                        } else {
                            str = null;
                        }
                    }
                    j18 = j & 20992;
                    if (j18 != 0) {
                        if (i6Var2 != null) {
                            uVarO0 = i6Var2.o0();
                        } else {
                            uVarO0 = null;
                        }
                        p1(9, uVarO0);
                        if (uVarO0 != null) {
                            i14 = uVarO0.get();
                        } else {
                            i14 = 0;
                        }
                        if (i14 == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i14 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (j18 != 0) {
                            if (z10) {
                                j24 = 17179869184L;
                            } else {
                                j24 = 8589934592L;
                            }
                            j |= j24;
                        }
                        if ((j & 20992) != 0) {
                            if (z11) {
                                j23 = 1073741824;
                            } else {
                                j23 = 536870912;
                            }
                            j |= j23;
                        }
                        if (z10) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        if (z11) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                    } else {
                        i4 = 0;
                        i6 = 0;
                    }
                    j19 = j & 21889;
                    if (j19 != 0) {
                        if (i6Var2 != null) {
                            numP0 = i6Var2.p0();
                        } else {
                            numP0 = null;
                        }
                        iH0 = androidx.databinding.c0.H0(numP0);
                        i6Var = i6Var2;
                        if (iH0 == 1) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (j19 != 0) {
                            if (z8) {
                                j22 = 4194304;
                            } else {
                                j22 = 2097152;
                            }
                            j |= j22;
                        }
                        j20 = j & 20736;
                        z3 = z8;
                        if (j20 != 0) {
                            if (iH0 != 1) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (j20 != 0) {
                                if (z9) {
                                    j21 = 4398046511104L;
                                } else {
                                    j21 = 2199023255552L;
                                }
                                j |= j21;
                            }
                            z2 = z9;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i6Var = i6Var2;
                        iH0 = 0;
                        z2 = false;
                        z3 = false;
                    }
                    j4 = j;
                    i2 = i16;
                    i3 = i13;
                } else {
                    j2 = 20482;
                }
                i5 = 0;
                if ((j & 22600) != 0) {
                    if (i6Var2 != null) {
                        observableBoolean = ((com.zentraedi.business.addfile.n) i6Var2).x;
                    } else {
                        observableBoolean = null;
                    }
                    p1(6, observableBoolean);
                    if (observableBoolean != null) {
                        z = observableBoolean.get();
                    } else {
                        z = false;
                    }
                    if ((j & 22592) != 0) {
                        if (z) {
                            j27 = 65536;
                        } else {
                            j27 = 32768;
                        }
                        j |= j27;
                    }
                    if ((j & 20552) != 0) {
                        if (z) {
                            j26 = 17592186044416L;
                        } else {
                            j26 = 8796093022208L;
                        }
                        j |= j26;
                    }
                    if ((j & 20544) != 0) {
                        if (z) {
                            j25 = 281474976710656L;
                        } else {
                            j25 = 140737488355328L;
                        }
                        j |= j25;
                    }
                    if ((j & 20544) == 0) {
                    }
                    if ((j & 21633) == 0) {
                        str = null;
                    } else {
                        if (i6Var2 != null) {
                            uVarW0 = i6Var2.w0();
                        } else {
                            uVarW0 = null;
                        }
                        p1(7, uVarW0);
                        if (uVarW0 != null) {
                            str = (String) uVarW0.get();
                        } else {
                            str = null;
                        }
                    }
                    j18 = j & 20992;
                    if (j18 != 0) {
                        if (i6Var2 != null) {
                            uVarO0 = i6Var2.o0();
                        } else {
                            uVarO0 = null;
                        }
                        p1(9, uVarO0);
                        if (uVarO0 != null) {
                            i14 = uVarO0.get();
                        } else {
                            i14 = 0;
                        }
                        if (i14 == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i14 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (j18 != 0) {
                            if (z10) {
                                j24 = 17179869184L;
                            } else {
                                j24 = 8589934592L;
                            }
                            j |= j24;
                        }
                        if ((j & 20992) != 0) {
                            if (z11) {
                                j23 = 1073741824;
                            } else {
                                j23 = 536870912;
                            }
                            j |= j23;
                        }
                        if (z10) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        if (z11) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                    } else {
                        i4 = 0;
                        i6 = 0;
                    }
                    j19 = j & 21889;
                    if (j19 != 0) {
                        if (i6Var2 != null) {
                            numP0 = i6Var2.p0();
                        } else {
                            numP0 = null;
                        }
                        iH0 = androidx.databinding.c0.H0(numP0);
                        i6Var = i6Var2;
                        if (iH0 == 1) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (j19 != 0) {
                            if (z8) {
                                j22 = 4194304;
                            } else {
                                j22 = 2097152;
                            }
                            j |= j22;
                        }
                        j20 = j & 20736;
                        z3 = z8;
                        if (j20 != 0) {
                            if (iH0 != 1) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (j20 != 0) {
                                if (z9) {
                                    j21 = 4398046511104L;
                                } else {
                                    j21 = 2199023255552L;
                                }
                                j |= j21;
                            }
                            z2 = z9;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i6Var = i6Var2;
                        iH0 = 0;
                        z2 = false;
                        z3 = false;
                    }
                    j4 = j;
                    i2 = i16;
                    i3 = i13;
                } else {
                    z = false;
                }
                i13 = 0;
                if ((j & 21633) == 0) {
                    str = null;
                } else {
                    if (i6Var2 != null) {
                        uVarW0 = i6Var2.w0();
                    } else {
                        uVarW0 = null;
                    }
                    p1(7, uVarW0);
                    if (uVarW0 != null) {
                        str = (String) uVarW0.get();
                    } else {
                        str = null;
                    }
                }
                j18 = j & 20992;
                if (j18 != 0) {
                    if (i6Var2 != null) {
                        uVarO0 = i6Var2.o0();
                    } else {
                        uVarO0 = null;
                    }
                    p1(9, uVarO0);
                    if (uVarO0 != null) {
                        i14 = uVarO0.get();
                    } else {
                        i14 = 0;
                    }
                    if (i14 == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i14 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j18 != 0) {
                        if (z10) {
                            j24 = 17179869184L;
                        } else {
                            j24 = 8589934592L;
                        }
                        j |= j24;
                    }
                    if ((j & 20992) != 0) {
                        if (z11) {
                            j23 = 1073741824;
                        } else {
                            j23 = 536870912;
                        }
                        j |= j23;
                    }
                    if (z10) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    if (z11) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                } else {
                    i4 = 0;
                    i6 = 0;
                }
                j19 = j & 21889;
                if (j19 != 0) {
                    if (i6Var2 != null) {
                        numP0 = i6Var2.p0();
                    } else {
                        numP0 = null;
                    }
                    iH0 = androidx.databinding.c0.H0(numP0);
                    i6Var = i6Var2;
                    if (iH0 == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (j19 != 0) {
                        if (z8) {
                            j22 = 4194304;
                        } else {
                            j22 = 2097152;
                        }
                        j |= j22;
                    }
                    j20 = j & 20736;
                    z3 = z8;
                    if (j20 != 0) {
                        if (iH0 != 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (j20 != 0) {
                            if (z9) {
                                j21 = 4398046511104L;
                            } else {
                                j21 = 2199023255552L;
                            }
                            j |= j21;
                        }
                        z2 = z9;
                    } else {
                        z2 = false;
                    }
                } else {
                    i6Var = i6Var2;
                    iH0 = 0;
                    z2 = false;
                    z3 = false;
                }
                j4 = j;
                i2 = i16;
                i3 = i13;
            } else {
                uVarS0 = null;
                i = 0;
                bool = null;
                zK0 = false;
            }
            j17 = j & 20512;
            if (j17 != 0) {
                if (i6Var2 != null) {
                    uVarQ0 = i6Var2.q0();
                    j2 = 20482;
                } else {
                    j2 = 20482;
                    uVarQ0 = null;
                }
                p1(5, uVarQ0);
                if (uVarQ0 != null) {
                    bool3 = (Boolean) uVarQ0.get();
                } else {
                    bool3 = null;
                }
                zK2 = androidx.databinding.c0.K0(bool3);
                if (j17 != 0) {
                    if (zK2) {
                        j28 = 70368744177664L;
                    } else {
                        j28 = 35184372088832L;
                    }
                    j |= j28;
                }
                if (zK2) {
                    i5 = 8;
                }
                if ((j & 22600) != 0) {
                    if (i6Var2 != null) {
                        observableBoolean = ((com.zentraedi.business.addfile.n) i6Var2).x;
                    } else {
                        observableBoolean = null;
                    }
                    p1(6, observableBoolean);
                    if (observableBoolean != null) {
                        z = observableBoolean.get();
                    } else {
                        z = false;
                    }
                    if ((j & 22592) != 0) {
                        if (z) {
                            j27 = 65536;
                        } else {
                            j27 = 32768;
                        }
                        j |= j27;
                    }
                    if ((j & 20552) != 0) {
                        if (z) {
                            j26 = 17592186044416L;
                        } else {
                            j26 = 8796093022208L;
                        }
                        j |= j26;
                    }
                    if ((j & 20544) != 0) {
                        if (z) {
                            j25 = 281474976710656L;
                        } else {
                            j25 = 140737488355328L;
                        }
                        j |= j25;
                    }
                    if ((j & 20544) == 0) {
                    }
                    if ((j & 21633) == 0) {
                        str = null;
                    } else {
                        if (i6Var2 != null) {
                            uVarW0 = i6Var2.w0();
                        } else {
                            uVarW0 = null;
                        }
                        p1(7, uVarW0);
                        if (uVarW0 != null) {
                            str = (String) uVarW0.get();
                        } else {
                            str = null;
                        }
                    }
                    j18 = j & 20992;
                    if (j18 != 0) {
                        if (i6Var2 != null) {
                            uVarO0 = i6Var2.o0();
                        } else {
                            uVarO0 = null;
                        }
                        p1(9, uVarO0);
                        if (uVarO0 != null) {
                            i14 = uVarO0.get();
                        } else {
                            i14 = 0;
                        }
                        if (i14 == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i14 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (j18 != 0) {
                            if (z10) {
                                j24 = 17179869184L;
                            } else {
                                j24 = 8589934592L;
                            }
                            j |= j24;
                        }
                        if ((j & 20992) != 0) {
                            if (z11) {
                                j23 = 1073741824;
                            } else {
                                j23 = 536870912;
                            }
                            j |= j23;
                        }
                        if (z10) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        if (z11) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                    } else {
                        i4 = 0;
                        i6 = 0;
                    }
                    j19 = j & 21889;
                    if (j19 != 0) {
                        if (i6Var2 != null) {
                            numP0 = i6Var2.p0();
                        } else {
                            numP0 = null;
                        }
                        iH0 = androidx.databinding.c0.H0(numP0);
                        i6Var = i6Var2;
                        if (iH0 == 1) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (j19 != 0) {
                            if (z8) {
                                j22 = 4194304;
                            } else {
                                j22 = 2097152;
                            }
                            j |= j22;
                        }
                        j20 = j & 20736;
                        z3 = z8;
                        if (j20 != 0) {
                            if (iH0 != 1) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (j20 != 0) {
                                if (z9) {
                                    j21 = 4398046511104L;
                                } else {
                                    j21 = 2199023255552L;
                                }
                                j |= j21;
                            }
                            z2 = z9;
                        } else {
                            z2 = false;
                        }
                    } else {
                        i6Var = i6Var2;
                        iH0 = 0;
                        z2 = false;
                        z3 = false;
                    }
                    j4 = j;
                    i2 = i16;
                    i3 = i13;
                } else {
                    z = false;
                }
                i13 = 0;
                if ((j & 21633) == 0) {
                    str = null;
                } else {
                    if (i6Var2 != null) {
                        uVarW0 = i6Var2.w0();
                    } else {
                        uVarW0 = null;
                    }
                    p1(7, uVarW0);
                    if (uVarW0 != null) {
                        str = (String) uVarW0.get();
                    } else {
                        str = null;
                    }
                }
                j18 = j & 20992;
                if (j18 != 0) {
                    if (i6Var2 != null) {
                        uVarO0 = i6Var2.o0();
                    } else {
                        uVarO0 = null;
                    }
                    p1(9, uVarO0);
                    if (uVarO0 != null) {
                        i14 = uVarO0.get();
                    } else {
                        i14 = 0;
                    }
                    if (i14 == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i14 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j18 != 0) {
                        if (z10) {
                            j24 = 17179869184L;
                        } else {
                            j24 = 8589934592L;
                        }
                        j |= j24;
                    }
                    if ((j & 20992) != 0) {
                        if (z11) {
                            j23 = 1073741824;
                        } else {
                            j23 = 536870912;
                        }
                        j |= j23;
                    }
                    if (z10) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    if (z11) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                } else {
                    i4 = 0;
                    i6 = 0;
                }
                j19 = j & 21889;
                if (j19 != 0) {
                    if (i6Var2 != null) {
                        numP0 = i6Var2.p0();
                    } else {
                        numP0 = null;
                    }
                    iH0 = androidx.databinding.c0.H0(numP0);
                    i6Var = i6Var2;
                    if (iH0 == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (j19 != 0) {
                        if (z8) {
                            j22 = 4194304;
                        } else {
                            j22 = 2097152;
                        }
                        j |= j22;
                    }
                    j20 = j & 20736;
                    z3 = z8;
                    if (j20 != 0) {
                        if (iH0 != 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (j20 != 0) {
                            if (z9) {
                                j21 = 4398046511104L;
                            } else {
                                j21 = 2199023255552L;
                            }
                            j |= j21;
                        }
                        z2 = z9;
                    } else {
                        z2 = false;
                    }
                } else {
                    i6Var = i6Var2;
                    iH0 = 0;
                    z2 = false;
                    z3 = false;
                }
                j4 = j;
                i2 = i16;
                i3 = i13;
            } else {
                j2 = 20482;
            }
            i5 = 0;
            if ((j & 22600) != 0) {
                if (i6Var2 != null) {
                    observableBoolean = ((com.zentraedi.business.addfile.n) i6Var2).x;
                } else {
                    observableBoolean = null;
                }
                p1(6, observableBoolean);
                if (observableBoolean != null) {
                    z = observableBoolean.get();
                } else {
                    z = false;
                }
                if ((j & 22592) != 0) {
                    if (z) {
                        j27 = 65536;
                    } else {
                        j27 = 32768;
                    }
                    j |= j27;
                }
                if ((j & 20552) != 0) {
                    if (z) {
                        j26 = 17592186044416L;
                    } else {
                        j26 = 8796093022208L;
                    }
                    j |= j26;
                }
                if ((j & 20544) != 0) {
                    if (z) {
                        j25 = 281474976710656L;
                    } else {
                        j25 = 140737488355328L;
                    }
                    j |= j25;
                }
                if ((j & 20544) == 0) {
                }
                if ((j & 21633) == 0) {
                    str = null;
                } else {
                    if (i6Var2 != null) {
                        uVarW0 = i6Var2.w0();
                    } else {
                        uVarW0 = null;
                    }
                    p1(7, uVarW0);
                    if (uVarW0 != null) {
                        str = (String) uVarW0.get();
                    } else {
                        str = null;
                    }
                }
                j18 = j & 20992;
                if (j18 != 0) {
                    if (i6Var2 != null) {
                        uVarO0 = i6Var2.o0();
                    } else {
                        uVarO0 = null;
                    }
                    p1(9, uVarO0);
                    if (uVarO0 != null) {
                        i14 = uVarO0.get();
                    } else {
                        i14 = 0;
                    }
                    if (i14 == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i14 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j18 != 0) {
                        if (z10) {
                            j24 = 17179869184L;
                        } else {
                            j24 = 8589934592L;
                        }
                        j |= j24;
                    }
                    if ((j & 20992) != 0) {
                        if (z11) {
                            j23 = 1073741824;
                        } else {
                            j23 = 536870912;
                        }
                        j |= j23;
                    }
                    if (z10) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    if (z11) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                } else {
                    i4 = 0;
                    i6 = 0;
                }
                j19 = j & 21889;
                if (j19 != 0) {
                    if (i6Var2 != null) {
                        numP0 = i6Var2.p0();
                    } else {
                        numP0 = null;
                    }
                    iH0 = androidx.databinding.c0.H0(numP0);
                    i6Var = i6Var2;
                    if (iH0 == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (j19 != 0) {
                        if (z8) {
                            j22 = 4194304;
                        } else {
                            j22 = 2097152;
                        }
                        j |= j22;
                    }
                    j20 = j & 20736;
                    z3 = z8;
                    if (j20 != 0) {
                        if (iH0 != 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (j20 != 0) {
                            if (z9) {
                                j21 = 4398046511104L;
                            } else {
                                j21 = 2199023255552L;
                            }
                            j |= j21;
                        }
                        z2 = z9;
                    } else {
                        z2 = false;
                    }
                } else {
                    i6Var = i6Var2;
                    iH0 = 0;
                    z2 = false;
                    z3 = false;
                }
                j4 = j;
                i2 = i16;
                i3 = i13;
            } else {
                z = false;
            }
            i13 = 0;
            if ((j & 21633) == 0) {
                str = null;
            } else {
                if (i6Var2 != null) {
                    uVarW0 = i6Var2.w0();
                } else {
                    uVarW0 = null;
                }
                p1(7, uVarW0);
                if (uVarW0 != null) {
                    str = (String) uVarW0.get();
                } else {
                    str = null;
                }
            }
            j18 = j & 20992;
            if (j18 != 0) {
                if (i6Var2 != null) {
                    uVarO0 = i6Var2.o0();
                } else {
                    uVarO0 = null;
                }
                p1(9, uVarO0);
                if (uVarO0 != null) {
                    i14 = uVarO0.get();
                } else {
                    i14 = 0;
                }
                if (i14 == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i14 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (j18 != 0) {
                    if (z10) {
                        j24 = 17179869184L;
                    } else {
                        j24 = 8589934592L;
                    }
                    j |= j24;
                }
                if ((j & 20992) != 0) {
                    if (z11) {
                        j23 = 1073741824;
                    } else {
                        j23 = 536870912;
                    }
                    j |= j23;
                }
                if (z10) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                if (z11) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
            } else {
                i4 = 0;
                i6 = 0;
            }
            j19 = j & 21889;
            if (j19 != 0) {
                if (i6Var2 != null) {
                    numP0 = i6Var2.p0();
                } else {
                    numP0 = null;
                }
                iH0 = androidx.databinding.c0.H0(numP0);
                i6Var = i6Var2;
                if (iH0 == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (j19 != 0) {
                    if (z8) {
                        j22 = 4194304;
                    } else {
                        j22 = 2097152;
                    }
                    j |= j22;
                }
                j20 = j & 20736;
                z3 = z8;
                if (j20 != 0) {
                    if (iH0 != 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (j20 != 0) {
                        if (z9) {
                            j21 = 4398046511104L;
                        } else {
                            j21 = 2199023255552L;
                        }
                        j |= j21;
                    }
                    z2 = z9;
                } else {
                    z2 = false;
                }
            } else {
                i6Var = i6Var2;
                iH0 = 0;
                z2 = false;
                z3 = false;
            }
            j4 = j;
            i2 = i16;
            i3 = i13;
        } else {
            i6Var = i6Var2;
            j2 = 20482;
            j3 = 1099511889920L;
            j4 = j;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            longListener = null;
            i6 = 0;
            str = null;
            drawableB = null;
            onClickListenerK0 = null;
            onClickListenerJ0 = null;
            uVarS0 = null;
            iH0 = 0;
            onClickListenerN0 = null;
            z = false;
            z2 = false;
            zZ0 = false;
            bool = null;
            zK0 = false;
            z3 = false;
            str2 = null;
            str3 = null;
        }
        if ((j4 & 4398046511104L) != 0) {
            uVarS1 = uVarS0;
            z4 = iH0 != 6;
            if ((j4 & 8796093022208L) != 0) {
                if (i6Var != null) {
                    uVarS1 = i6Var.s0();
                }
                z5 = z4;
                uVar = uVarS1;
                z6 = z;
                p1(3, uVar);
                if (uVar != null) {
                    bool = (Boolean) uVar.get();
                }
                zK0 = androidx.databinding.c0.K0(bool);
                if ((j4 & 20488) != 0) {
                    if (zK0) {
                        j5 = j4 | j3;
                    } else {
                        j5 = j4 | 549755944960L;
                    }
                }
                if ((j5 & 2097152) == 0 && iH0 == 6) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((j5 & 32768) != 0) {
                    if (i6Var != null) {
                        observableFieldR0 = i6Var.r0();
                    } else {
                        observableFieldR0 = null;
                    }
                    p1(11, observableFieldR0);
                    if (observableFieldR0 != null) {
                        bool2 = (Boolean) observableFieldR0.get();
                    } else {
                        bool2 = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool2);
                } else {
                    zK1 = false;
                }
                j6 = j5 & 22592;
                if (j6 == 0) {
                    i7 = 0;
                } else {
                    if (z6) {
                        zK1 = true;
                    }
                    if (j6 != 0) {
                        if (zK1) {
                            j16 = 1048576;
                        } else {
                            j16 = 524288;
                        }
                        j5 |= j16;
                    }
                    if (zK1) {
                        i7 = 8;
                    } else {
                        i7 = 0;
                    }
                }
                if ((j5 & 21889) != 0) {
                    if (z3) {
                        z7 = true;
                    }
                    if ((j5 & 20737) != 0) {
                        if (z7) {
                            j15 = 16777216;
                        } else {
                            j15 = 8388608;
                        }
                        j5 |= j15;
                    }
                    if ((j5 & 21633) != 0) {
                        if (z7) {
                            j14 = 4294967296L;
                        } else {
                            j14 = 2147483648L;
                        }
                        j5 |= j14;
                    }
                } else {
                    z7 = false;
                }
                j7 = j5 & 20736;
                if (j7 != 0) {
                    if (!z2) {
                        z5 = false;
                    }
                    if (j7 != 0) {
                        if (z5) {
                            j13 = 67108864;
                        } else {
                            j13 = 33554432;
                        }
                        j5 |= j13;
                    }
                } else {
                    z5 = false;
                }
                j8 = j5 & 20552;
                if (j8 != 0) {
                    if (z6) {
                        zK0 = true;
                    }
                    if (j8 != 0) {
                        if (zK0) {
                            j12 = 274877906944L;
                        } else {
                            j12 = 137438953472L;
                        }
                        j5 |= j12;
                    }
                    if (zK0) {
                        i12 = 4;
                    } else {
                        i12 = 0;
                    }
                    i8 = i12;
                } else {
                    i8 = 0;
                }
                if ((j5 & 2164260864L) != 0) {
                    if (i6Var != null) {
                        uVarL0 = i6Var.l0();
                    } else {
                        uVarL0 = null;
                    }
                    i9 = i6;
                    p1(0, uVarL0);
                    str4 = uVarL0 != null ? (String) uVarL0.get() : null;
                    if ((j5 & 75497472) != 0) {
                        if (i6Var != null) {
                            uVarH0 = i6Var.h0();
                        } else {
                            uVarH0 = null;
                        }
                        str5 = str4;
                        p1(8, uVarH0);
                        if (uVarH0 != null) {
                            str6 = (String) uVarH0.get();
                        } else {
                            str6 = null;
                        }
                        zIsEmpty = (j5 & 67108864) != 0 ? TextUtils.isEmpty(str6) : false;
                        if ((j5 & 4294967296L) != 0) {
                            if (i6Var != null) {
                                uVarI0 = i6Var.i0();
                            } else {
                                uVarI0 = null;
                            }
                            str7 = str6;
                            p1(10, uVarI0);
                            str8 = uVarI0 != null ? (String) uVarI0.get() : null;
                            if ((j5 & 20737) != 0) {
                                if (z7) {
                                    str7 = str5;
                                }
                                str9 = str7;
                            } else {
                                str9 = null;
                            }
                            j9 = j5 & 20736;
                            if (j9 != 0) {
                                if (!z5) {
                                    zIsEmpty = false;
                                }
                                if (j9 != 0) {
                                    if (zIsEmpty) {
                                        j11 = 268435456;
                                    } else {
                                        j11 = 134217728;
                                    }
                                    j5 |= j11;
                                }
                                if (zIsEmpty) {
                                    i11 = 8;
                                } else {
                                    i11 = 0;
                                }
                                i10 = i11;
                            } else {
                                i10 = 0;
                            }
                            j10 = j5 & 21633;
                            if (j10 != 0) {
                                if (z7) {
                                    str5 = str8;
                                }
                                str10 = str5;
                            } else {
                                str10 = null;
                            }
                            if ((j5 & 20480) != 0) {
                                this.I.setOnClickListener(onClickListenerJ0);
                                this.I.setOnLongClickListener(longListener);
                                this.L.setOnClickListener(onClickListenerK0);
                                this.P.setOnClickListener(onClickListenerN0);
                            }
                            if ((j5 & 20500) != 0) {
                                com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                            }
                            if (j10 != 0) {
                                com.zentraedi.comic.util.j.a(this.K, str10, str);
                                com.zentraedi.comic.util.j.a(this.N, str10, str);
                            }
                            if ((j5 & 20552) != 0) {
                                this.L.setVisibility(i8);
                            }
                            if ((j5 & 20488) != 0) {
                                this.M.setVisibility(i);
                                this.V.setVisibility(i2);
                            }
                            if ((j5 & j2) != 0) {
                                androidx.databinding.adapters.p.a(this.O, drawableB);
                            }
                            if ((j5 & 20544) != 0) {
                                this.O.setVisibility(i3);
                            }
                            if ((j5 & 22592) != 0) {
                                this.P.setVisibility(i7);
                            }
                            if ((j5 & 20512) != 0) {
                                this.Q.setVisibility(i5);
                            }
                            if ((j5 & 20736) != 0) {
                                this.R.setVisibility(i10);
                            }
                            if ((j5 & 20737) != 0) {
                                androidx.databinding.adapters.f0.A(this.S, str9);
                            }
                            if ((j5 & 20992) != 0) {
                                this.T.setVisibility(i4);
                                this.U.setVisibility(i9);
                            }
                        }
                        str7 = str6;
                        if ((j5 & 20737) != 0) {
                            if (z7) {
                                str7 = str5;
                            }
                            str9 = str7;
                        } else {
                            str9 = null;
                        }
                        j9 = j5 & 20736;
                        if (j9 != 0) {
                            if (!z5) {
                                zIsEmpty = false;
                            }
                            if (j9 != 0) {
                                if (zIsEmpty) {
                                    j11 = 268435456;
                                } else {
                                    j11 = 134217728;
                                }
                                j5 |= j11;
                            }
                            if (zIsEmpty) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            i10 = i11;
                        } else {
                            i10 = 0;
                        }
                        j10 = j5 & 21633;
                        if (j10 != 0) {
                            if (z7) {
                                str5 = str8;
                            }
                            str10 = str5;
                        } else {
                            str10 = null;
                        }
                        if ((j5 & 20480) != 0) {
                            this.I.setOnClickListener(onClickListenerJ0);
                            this.I.setOnLongClickListener(longListener);
                            this.L.setOnClickListener(onClickListenerK0);
                            this.P.setOnClickListener(onClickListenerN0);
                        }
                        if ((j5 & 20500) != 0) {
                            com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                        }
                        if (j10 != 0) {
                            com.zentraedi.comic.util.j.a(this.K, str10, str);
                            com.zentraedi.comic.util.j.a(this.N, str10, str);
                        }
                        if ((j5 & 20552) != 0) {
                            this.L.setVisibility(i8);
                        }
                        if ((j5 & 20488) != 0) {
                            this.M.setVisibility(i);
                            this.V.setVisibility(i2);
                        }
                        if ((j5 & j2) != 0) {
                            androidx.databinding.adapters.p.a(this.O, drawableB);
                        }
                        if ((j5 & 20544) != 0) {
                            this.O.setVisibility(i3);
                        }
                        if ((j5 & 22592) != 0) {
                            this.P.setVisibility(i7);
                        }
                        if ((j5 & 20512) != 0) {
                            this.Q.setVisibility(i5);
                        }
                        if ((j5 & 20736) != 0) {
                            this.R.setVisibility(i10);
                        }
                        if ((j5 & 20737) != 0) {
                            androidx.databinding.adapters.f0.A(this.S, str9);
                        }
                        if ((j5 & 20992) != 0) {
                            this.T.setVisibility(i4);
                            this.U.setVisibility(i9);
                        }
                    }
                    str5 = str4;
                    str6 = null;
                    if ((j5 & 4294967296L) != 0) {
                        if (i6Var != null) {
                            uVarI0 = i6Var.i0();
                        } else {
                            uVarI0 = null;
                        }
                        str7 = str6;
                        p1(10, uVarI0);
                        if (uVarI0 != null) {
                        }
                        if ((j5 & 20737) != 0) {
                            if (z7) {
                                str7 = str5;
                            }
                            str9 = str7;
                        } else {
                            str9 = null;
                        }
                        j9 = j5 & 20736;
                        if (j9 != 0) {
                            if (!z5) {
                                zIsEmpty = false;
                            }
                            if (j9 != 0) {
                                if (zIsEmpty) {
                                    j11 = 268435456;
                                } else {
                                    j11 = 134217728;
                                }
                                j5 |= j11;
                            }
                            if (zIsEmpty) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            i10 = i11;
                        } else {
                            i10 = 0;
                        }
                        j10 = j5 & 21633;
                        if (j10 != 0) {
                            if (z7) {
                                str5 = str8;
                            }
                            str10 = str5;
                        } else {
                            str10 = null;
                        }
                        if ((j5 & 20480) != 0) {
                            this.I.setOnClickListener(onClickListenerJ0);
                            this.I.setOnLongClickListener(longListener);
                            this.L.setOnClickListener(onClickListenerK0);
                            this.P.setOnClickListener(onClickListenerN0);
                        }
                        if ((j5 & 20500) != 0) {
                            com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                        }
                        if (j10 != 0) {
                            com.zentraedi.comic.util.j.a(this.K, str10, str);
                            com.zentraedi.comic.util.j.a(this.N, str10, str);
                        }
                        if ((j5 & 20552) != 0) {
                            this.L.setVisibility(i8);
                        }
                        if ((j5 & 20488) != 0) {
                            this.M.setVisibility(i);
                            this.V.setVisibility(i2);
                        }
                        if ((j5 & j2) != 0) {
                            androidx.databinding.adapters.p.a(this.O, drawableB);
                        }
                        if ((j5 & 20544) != 0) {
                            this.O.setVisibility(i3);
                        }
                        if ((j5 & 22592) != 0) {
                            this.P.setVisibility(i7);
                        }
                        if ((j5 & 20512) != 0) {
                            this.Q.setVisibility(i5);
                        }
                        if ((j5 & 20736) != 0) {
                            this.R.setVisibility(i10);
                        }
                        if ((j5 & 20737) != 0) {
                            androidx.databinding.adapters.f0.A(this.S, str9);
                        }
                        if ((j5 & 20992) != 0) {
                            this.T.setVisibility(i4);
                            this.U.setVisibility(i9);
                        }
                    }
                    str7 = str6;
                    if ((j5 & 20737) != 0) {
                        if (z7) {
                            str7 = str5;
                        }
                        str9 = str7;
                    } else {
                        str9 = null;
                    }
                    j9 = j5 & 20736;
                    if (j9 != 0) {
                        if (!z5) {
                            zIsEmpty = false;
                        }
                        if (j9 != 0) {
                            if (zIsEmpty) {
                                j11 = 268435456;
                            } else {
                                j11 = 134217728;
                            }
                            j5 |= j11;
                        }
                        if (zIsEmpty) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        i10 = i11;
                    } else {
                        i10 = 0;
                    }
                    j10 = j5 & 21633;
                    if (j10 != 0) {
                        if (z7) {
                            str5 = str8;
                        }
                        str10 = str5;
                    } else {
                        str10 = null;
                    }
                    if ((j5 & 20480) != 0) {
                        this.I.setOnClickListener(onClickListenerJ0);
                        this.I.setOnLongClickListener(longListener);
                        this.L.setOnClickListener(onClickListenerK0);
                        this.P.setOnClickListener(onClickListenerN0);
                    }
                    if ((j5 & 20500) != 0) {
                        com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                    }
                    if (j10 != 0) {
                        com.zentraedi.comic.util.j.a(this.K, str10, str);
                        com.zentraedi.comic.util.j.a(this.N, str10, str);
                    }
                    if ((j5 & 20552) != 0) {
                        this.L.setVisibility(i8);
                    }
                    if ((j5 & 20488) != 0) {
                        this.M.setVisibility(i);
                        this.V.setVisibility(i2);
                    }
                    if ((j5 & j2) != 0) {
                        androidx.databinding.adapters.p.a(this.O, drawableB);
                    }
                    if ((j5 & 20544) != 0) {
                        this.O.setVisibility(i3);
                    }
                    if ((j5 & 22592) != 0) {
                        this.P.setVisibility(i7);
                    }
                    if ((j5 & 20512) != 0) {
                        this.Q.setVisibility(i5);
                    }
                    if ((j5 & 20736) != 0) {
                        this.R.setVisibility(i10);
                    }
                    if ((j5 & 20737) != 0) {
                        androidx.databinding.adapters.f0.A(this.S, str9);
                    }
                    if ((j5 & 20992) != 0) {
                        this.T.setVisibility(i4);
                        this.U.setVisibility(i9);
                    }
                }
                i9 = i6;
                z7 = z7;
                if ((j5 & 75497472) != 0) {
                    if (i6Var != null) {
                        uVarH0 = i6Var.h0();
                    } else {
                        uVarH0 = null;
                    }
                    str5 = str4;
                    p1(8, uVarH0);
                    if (uVarH0 != null) {
                        str6 = (String) uVarH0.get();
                    } else {
                        str6 = null;
                    }
                    if ((j5 & 67108864) != 0) {
                    }
                    if ((j5 & 4294967296L) != 0) {
                        if (i6Var != null) {
                            uVarI0 = i6Var.i0();
                        } else {
                            uVarI0 = null;
                        }
                        str7 = str6;
                        p1(10, uVarI0);
                        if (uVarI0 != null) {
                        }
                        if ((j5 & 20737) != 0) {
                            if (z7) {
                                str7 = str5;
                            }
                            str9 = str7;
                        } else {
                            str9 = null;
                        }
                        j9 = j5 & 20736;
                        if (j9 != 0) {
                            if (!z5) {
                                zIsEmpty = false;
                            }
                            if (j9 != 0) {
                                if (zIsEmpty) {
                                    j11 = 268435456;
                                } else {
                                    j11 = 134217728;
                                }
                                j5 |= j11;
                            }
                            if (zIsEmpty) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            i10 = i11;
                        } else {
                            i10 = 0;
                        }
                        j10 = j5 & 21633;
                        if (j10 != 0) {
                            if (z7) {
                                str5 = str8;
                            }
                            str10 = str5;
                        } else {
                            str10 = null;
                        }
                        if ((j5 & 20480) != 0) {
                            this.I.setOnClickListener(onClickListenerJ0);
                            this.I.setOnLongClickListener(longListener);
                            this.L.setOnClickListener(onClickListenerK0);
                            this.P.setOnClickListener(onClickListenerN0);
                        }
                        if ((j5 & 20500) != 0) {
                            com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                        }
                        if (j10 != 0) {
                            com.zentraedi.comic.util.j.a(this.K, str10, str);
                            com.zentraedi.comic.util.j.a(this.N, str10, str);
                        }
                        if ((j5 & 20552) != 0) {
                            this.L.setVisibility(i8);
                        }
                        if ((j5 & 20488) != 0) {
                            this.M.setVisibility(i);
                            this.V.setVisibility(i2);
                        }
                        if ((j5 & j2) != 0) {
                            androidx.databinding.adapters.p.a(this.O, drawableB);
                        }
                        if ((j5 & 20544) != 0) {
                            this.O.setVisibility(i3);
                        }
                        if ((j5 & 22592) != 0) {
                            this.P.setVisibility(i7);
                        }
                        if ((j5 & 20512) != 0) {
                            this.Q.setVisibility(i5);
                        }
                        if ((j5 & 20736) != 0) {
                            this.R.setVisibility(i10);
                        }
                        if ((j5 & 20737) != 0) {
                            androidx.databinding.adapters.f0.A(this.S, str9);
                        }
                        if ((j5 & 20992) != 0) {
                            this.T.setVisibility(i4);
                            this.U.setVisibility(i9);
                        }
                    }
                    str7 = str6;
                    if ((j5 & 20737) != 0) {
                        if (z7) {
                            str7 = str5;
                        }
                        str9 = str7;
                    } else {
                        str9 = null;
                    }
                    j9 = j5 & 20736;
                    if (j9 != 0) {
                        if (!z5) {
                            zIsEmpty = false;
                        }
                        if (j9 != 0) {
                            if (zIsEmpty) {
                                j11 = 268435456;
                            } else {
                                j11 = 134217728;
                            }
                            j5 |= j11;
                        }
                        if (zIsEmpty) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        i10 = i11;
                    } else {
                        i10 = 0;
                    }
                    j10 = j5 & 21633;
                    if (j10 != 0) {
                        if (z7) {
                            str5 = str8;
                        }
                        str10 = str5;
                    } else {
                        str10 = null;
                    }
                    if ((j5 & 20480) != 0) {
                        this.I.setOnClickListener(onClickListenerJ0);
                        this.I.setOnLongClickListener(longListener);
                        this.L.setOnClickListener(onClickListenerK0);
                        this.P.setOnClickListener(onClickListenerN0);
                    }
                    if ((j5 & 20500) != 0) {
                        com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                    }
                    if (j10 != 0) {
                        com.zentraedi.comic.util.j.a(this.K, str10, str);
                        com.zentraedi.comic.util.j.a(this.N, str10, str);
                    }
                    if ((j5 & 20552) != 0) {
                        this.L.setVisibility(i8);
                    }
                    if ((j5 & 20488) != 0) {
                        this.M.setVisibility(i);
                        this.V.setVisibility(i2);
                    }
                    if ((j5 & j2) != 0) {
                        androidx.databinding.adapters.p.a(this.O, drawableB);
                    }
                    if ((j5 & 20544) != 0) {
                        this.O.setVisibility(i3);
                    }
                    if ((j5 & 22592) != 0) {
                        this.P.setVisibility(i7);
                    }
                    if ((j5 & 20512) != 0) {
                        this.Q.setVisibility(i5);
                    }
                    if ((j5 & 20736) != 0) {
                        this.R.setVisibility(i10);
                    }
                    if ((j5 & 20737) != 0) {
                        androidx.databinding.adapters.f0.A(this.S, str9);
                    }
                    if ((j5 & 20992) != 0) {
                        this.T.setVisibility(i4);
                        this.U.setVisibility(i9);
                    }
                }
                str5 = str4;
                str6 = null;
                if ((j5 & 4294967296L) != 0) {
                    if (i6Var != null) {
                        uVarI0 = i6Var.i0();
                    } else {
                        uVarI0 = null;
                    }
                    str7 = str6;
                    p1(10, uVarI0);
                    if (uVarI0 != null) {
                    }
                    if ((j5 & 20737) != 0) {
                        if (z7) {
                            str7 = str5;
                        }
                        str9 = str7;
                    } else {
                        str9 = null;
                    }
                    j9 = j5 & 20736;
                    if (j9 != 0) {
                        if (!z5) {
                            zIsEmpty = false;
                        }
                        if (j9 != 0) {
                            if (zIsEmpty) {
                                j11 = 268435456;
                            } else {
                                j11 = 134217728;
                            }
                            j5 |= j11;
                        }
                        if (zIsEmpty) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        i10 = i11;
                    } else {
                        i10 = 0;
                    }
                    j10 = j5 & 21633;
                    if (j10 != 0) {
                        if (z7) {
                            str5 = str8;
                        }
                        str10 = str5;
                    } else {
                        str10 = null;
                    }
                    if ((j5 & 20480) != 0) {
                        this.I.setOnClickListener(onClickListenerJ0);
                        this.I.setOnLongClickListener(longListener);
                        this.L.setOnClickListener(onClickListenerK0);
                        this.P.setOnClickListener(onClickListenerN0);
                    }
                    if ((j5 & 20500) != 0) {
                        com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                    }
                    if (j10 != 0) {
                        com.zentraedi.comic.util.j.a(this.K, str10, str);
                        com.zentraedi.comic.util.j.a(this.N, str10, str);
                    }
                    if ((j5 & 20552) != 0) {
                        this.L.setVisibility(i8);
                    }
                    if ((j5 & 20488) != 0) {
                        this.M.setVisibility(i);
                        this.V.setVisibility(i2);
                    }
                    if ((j5 & j2) != 0) {
                        androidx.databinding.adapters.p.a(this.O, drawableB);
                    }
                    if ((j5 & 20544) != 0) {
                        this.O.setVisibility(i3);
                    }
                    if ((j5 & 22592) != 0) {
                        this.P.setVisibility(i7);
                    }
                    if ((j5 & 20512) != 0) {
                        this.Q.setVisibility(i5);
                    }
                    if ((j5 & 20736) != 0) {
                        this.R.setVisibility(i10);
                    }
                    if ((j5 & 20737) != 0) {
                        androidx.databinding.adapters.f0.A(this.S, str9);
                    }
                    if ((j5 & 20992) != 0) {
                        this.T.setVisibility(i4);
                        this.U.setVisibility(i9);
                    }
                }
                str7 = str6;
                if ((j5 & 20737) != 0) {
                    if (z7) {
                        str7 = str5;
                    }
                    str9 = str7;
                } else {
                    str9 = null;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z5) {
                        zIsEmpty = false;
                    }
                    if (j9 != 0) {
                        if (zIsEmpty) {
                            j11 = 268435456;
                        } else {
                            j11 = 134217728;
                        }
                        j5 |= j11;
                    }
                    if (zIsEmpty) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    i10 = i11;
                } else {
                    i10 = 0;
                }
                j10 = j5 & 21633;
                if (j10 != 0) {
                    if (z7) {
                        str5 = str8;
                    }
                    str10 = str5;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(longListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListenerN0);
                }
                if ((j5 & 20500) != 0) {
                    com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                }
                if (j10 != 0) {
                    com.zentraedi.comic.util.j.a(this.K, str10, str);
                    com.zentraedi.comic.util.j.a(this.N, str10, str);
                }
                if ((j5 & 20552) != 0) {
                    this.L.setVisibility(i8);
                }
                if ((j5 & 20488) != 0) {
                    this.M.setVisibility(i);
                    this.V.setVisibility(i2);
                }
                if ((j5 & j2) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawableB);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i3);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i5);
                }
                if ((j5 & 20736) != 0) {
                    this.R.setVisibility(i10);
                }
                if ((j5 & 20737) != 0) {
                    androidx.databinding.adapters.f0.A(this.S, str9);
                }
                if ((j5 & 20992) != 0) {
                    this.T.setVisibility(i4);
                    this.U.setVisibility(i9);
                }
            }
            z5 = z4;
            z6 = z;
            j5 = j4;
            if ((j5 & 2097152) == 0) {
                z7 = false;
            } else {
                z7 = false;
            }
            if ((j5 & 32768) != 0) {
                if (i6Var != null) {
                    observableFieldR0 = i6Var.r0();
                } else {
                    observableFieldR0 = null;
                }
                p1(11, observableFieldR0);
                if (observableFieldR0 != null) {
                    bool2 = (Boolean) observableFieldR0.get();
                } else {
                    bool2 = null;
                }
                zK1 = androidx.databinding.c0.K0(bool2);
            } else {
                zK1 = false;
            }
            j6 = j5 & 22592;
            if (j6 == 0) {
                i7 = 0;
            } else {
                if (z6) {
                    zK1 = true;
                }
                if (j6 != 0) {
                    if (zK1) {
                        j16 = 1048576;
                    } else {
                        j16 = 524288;
                    }
                    j5 |= j16;
                }
                if (zK1) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
            }
            if ((j5 & 21889) != 0) {
                if (z3) {
                    z7 = true;
                }
                if ((j5 & 20737) != 0) {
                    if (z7) {
                        j15 = 16777216;
                    } else {
                        j15 = 8388608;
                    }
                    j5 |= j15;
                }
                if ((j5 & 21633) != 0) {
                    if (z7) {
                        j14 = 4294967296L;
                    } else {
                        j14 = 2147483648L;
                    }
                    j5 |= j14;
                }
            } else {
                z7 = false;
            }
            j7 = j5 & 20736;
            if (j7 != 0) {
                if (!z2) {
                    z5 = false;
                }
                if (j7 != 0) {
                    if (z5) {
                        j13 = 67108864;
                    } else {
                        j13 = 33554432;
                    }
                    j5 |= j13;
                }
            } else {
                z5 = false;
            }
            j8 = j5 & 20552;
            if (j8 != 0) {
                if (z6) {
                    zK0 = true;
                }
                if (j8 != 0) {
                    if (zK0) {
                        j12 = 274877906944L;
                    } else {
                        j12 = 137438953472L;
                    }
                    j5 |= j12;
                }
                if (zK0) {
                    i12 = 4;
                } else {
                    i12 = 0;
                }
                i8 = i12;
            } else {
                i8 = 0;
            }
            if ((j5 & 2164260864L) != 0) {
                if (i6Var != null) {
                    uVarL0 = i6Var.l0();
                } else {
                    uVarL0 = null;
                }
                i9 = i6;
                p1(0, uVarL0);
                if (uVarL0 != null) {
                }
                if ((j5 & 75497472) != 0) {
                    if (i6Var != null) {
                        uVarH0 = i6Var.h0();
                    } else {
                        uVarH0 = null;
                    }
                    str5 = str4;
                    p1(8, uVarH0);
                    if (uVarH0 != null) {
                        str6 = (String) uVarH0.get();
                    } else {
                        str6 = null;
                    }
                    if ((j5 & 67108864) != 0) {
                    }
                    if ((j5 & 4294967296L) != 0) {
                        if (i6Var != null) {
                            uVarI0 = i6Var.i0();
                        } else {
                            uVarI0 = null;
                        }
                        str7 = str6;
                        p1(10, uVarI0);
                        if (uVarI0 != null) {
                        }
                        if ((j5 & 20737) != 0) {
                            if (z7) {
                                str7 = str5;
                            }
                            str9 = str7;
                        } else {
                            str9 = null;
                        }
                        j9 = j5 & 20736;
                        if (j9 != 0) {
                            if (!z5) {
                                zIsEmpty = false;
                            }
                            if (j9 != 0) {
                                if (zIsEmpty) {
                                    j11 = 268435456;
                                } else {
                                    j11 = 134217728;
                                }
                                j5 |= j11;
                            }
                            if (zIsEmpty) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            i10 = i11;
                        } else {
                            i10 = 0;
                        }
                        j10 = j5 & 21633;
                        if (j10 != 0) {
                            if (z7) {
                                str5 = str8;
                            }
                            str10 = str5;
                        } else {
                            str10 = null;
                        }
                        if ((j5 & 20480) != 0) {
                            this.I.setOnClickListener(onClickListenerJ0);
                            this.I.setOnLongClickListener(longListener);
                            this.L.setOnClickListener(onClickListenerK0);
                            this.P.setOnClickListener(onClickListenerN0);
                        }
                        if ((j5 & 20500) != 0) {
                            com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                        }
                        if (j10 != 0) {
                            com.zentraedi.comic.util.j.a(this.K, str10, str);
                            com.zentraedi.comic.util.j.a(this.N, str10, str);
                        }
                        if ((j5 & 20552) != 0) {
                            this.L.setVisibility(i8);
                        }
                        if ((j5 & 20488) != 0) {
                            this.M.setVisibility(i);
                            this.V.setVisibility(i2);
                        }
                        if ((j5 & j2) != 0) {
                            androidx.databinding.adapters.p.a(this.O, drawableB);
                        }
                        if ((j5 & 20544) != 0) {
                            this.O.setVisibility(i3);
                        }
                        if ((j5 & 22592) != 0) {
                            this.P.setVisibility(i7);
                        }
                        if ((j5 & 20512) != 0) {
                            this.Q.setVisibility(i5);
                        }
                        if ((j5 & 20736) != 0) {
                            this.R.setVisibility(i10);
                        }
                        if ((j5 & 20737) != 0) {
                            androidx.databinding.adapters.f0.A(this.S, str9);
                        }
                        if ((j5 & 20992) != 0) {
                            this.T.setVisibility(i4);
                            this.U.setVisibility(i9);
                        }
                    }
                    str7 = str6;
                    if ((j5 & 20737) != 0) {
                        if (z7) {
                            str7 = str5;
                        }
                        str9 = str7;
                    } else {
                        str9 = null;
                    }
                    j9 = j5 & 20736;
                    if (j9 != 0) {
                        if (!z5) {
                            zIsEmpty = false;
                        }
                        if (j9 != 0) {
                            if (zIsEmpty) {
                                j11 = 268435456;
                            } else {
                                j11 = 134217728;
                            }
                            j5 |= j11;
                        }
                        if (zIsEmpty) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        i10 = i11;
                    } else {
                        i10 = 0;
                    }
                    j10 = j5 & 21633;
                    if (j10 != 0) {
                        if (z7) {
                            str5 = str8;
                        }
                        str10 = str5;
                    } else {
                        str10 = null;
                    }
                    if ((j5 & 20480) != 0) {
                        this.I.setOnClickListener(onClickListenerJ0);
                        this.I.setOnLongClickListener(longListener);
                        this.L.setOnClickListener(onClickListenerK0);
                        this.P.setOnClickListener(onClickListenerN0);
                    }
                    if ((j5 & 20500) != 0) {
                        com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                    }
                    if (j10 != 0) {
                        com.zentraedi.comic.util.j.a(this.K, str10, str);
                        com.zentraedi.comic.util.j.a(this.N, str10, str);
                    }
                    if ((j5 & 20552) != 0) {
                        this.L.setVisibility(i8);
                    }
                    if ((j5 & 20488) != 0) {
                        this.M.setVisibility(i);
                        this.V.setVisibility(i2);
                    }
                    if ((j5 & j2) != 0) {
                        androidx.databinding.adapters.p.a(this.O, drawableB);
                    }
                    if ((j5 & 20544) != 0) {
                        this.O.setVisibility(i3);
                    }
                    if ((j5 & 22592) != 0) {
                        this.P.setVisibility(i7);
                    }
                    if ((j5 & 20512) != 0) {
                        this.Q.setVisibility(i5);
                    }
                    if ((j5 & 20736) != 0) {
                        this.R.setVisibility(i10);
                    }
                    if ((j5 & 20737) != 0) {
                        androidx.databinding.adapters.f0.A(this.S, str9);
                    }
                    if ((j5 & 20992) != 0) {
                        this.T.setVisibility(i4);
                        this.U.setVisibility(i9);
                    }
                }
                str5 = str4;
                str6 = null;
                if ((j5 & 4294967296L) != 0) {
                    if (i6Var != null) {
                        uVarI0 = i6Var.i0();
                    } else {
                        uVarI0 = null;
                    }
                    str7 = str6;
                    p1(10, uVarI0);
                    if (uVarI0 != null) {
                    }
                    if ((j5 & 20737) != 0) {
                        if (z7) {
                            str7 = str5;
                        }
                        str9 = str7;
                    } else {
                        str9 = null;
                    }
                    j9 = j5 & 20736;
                    if (j9 != 0) {
                        if (!z5) {
                            zIsEmpty = false;
                        }
                        if (j9 != 0) {
                            if (zIsEmpty) {
                                j11 = 268435456;
                            } else {
                                j11 = 134217728;
                            }
                            j5 |= j11;
                        }
                        if (zIsEmpty) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        i10 = i11;
                    } else {
                        i10 = 0;
                    }
                    j10 = j5 & 21633;
                    if (j10 != 0) {
                        if (z7) {
                            str5 = str8;
                        }
                        str10 = str5;
                    } else {
                        str10 = null;
                    }
                    if ((j5 & 20480) != 0) {
                        this.I.setOnClickListener(onClickListenerJ0);
                        this.I.setOnLongClickListener(longListener);
                        this.L.setOnClickListener(onClickListenerK0);
                        this.P.setOnClickListener(onClickListenerN0);
                    }
                    if ((j5 & 20500) != 0) {
                        com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                    }
                    if (j10 != 0) {
                        com.zentraedi.comic.util.j.a(this.K, str10, str);
                        com.zentraedi.comic.util.j.a(this.N, str10, str);
                    }
                    if ((j5 & 20552) != 0) {
                        this.L.setVisibility(i8);
                    }
                    if ((j5 & 20488) != 0) {
                        this.M.setVisibility(i);
                        this.V.setVisibility(i2);
                    }
                    if ((j5 & j2) != 0) {
                        androidx.databinding.adapters.p.a(this.O, drawableB);
                    }
                    if ((j5 & 20544) != 0) {
                        this.O.setVisibility(i3);
                    }
                    if ((j5 & 22592) != 0) {
                        this.P.setVisibility(i7);
                    }
                    if ((j5 & 20512) != 0) {
                        this.Q.setVisibility(i5);
                    }
                    if ((j5 & 20736) != 0) {
                        this.R.setVisibility(i10);
                    }
                    if ((j5 & 20737) != 0) {
                        androidx.databinding.adapters.f0.A(this.S, str9);
                    }
                    if ((j5 & 20992) != 0) {
                        this.T.setVisibility(i4);
                        this.U.setVisibility(i9);
                    }
                }
                str7 = str6;
                if ((j5 & 20737) != 0) {
                    if (z7) {
                        str7 = str5;
                    }
                    str9 = str7;
                } else {
                    str9 = null;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z5) {
                        zIsEmpty = false;
                    }
                    if (j9 != 0) {
                        if (zIsEmpty) {
                            j11 = 268435456;
                        } else {
                            j11 = 134217728;
                        }
                        j5 |= j11;
                    }
                    if (zIsEmpty) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    i10 = i11;
                } else {
                    i10 = 0;
                }
                j10 = j5 & 21633;
                if (j10 != 0) {
                    if (z7) {
                        str5 = str8;
                    }
                    str10 = str5;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(longListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListenerN0);
                }
                if ((j5 & 20500) != 0) {
                    com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                }
                if (j10 != 0) {
                    com.zentraedi.comic.util.j.a(this.K, str10, str);
                    com.zentraedi.comic.util.j.a(this.N, str10, str);
                }
                if ((j5 & 20552) != 0) {
                    this.L.setVisibility(i8);
                }
                if ((j5 & 20488) != 0) {
                    this.M.setVisibility(i);
                    this.V.setVisibility(i2);
                }
                if ((j5 & j2) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawableB);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i3);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i5);
                }
                if ((j5 & 20736) != 0) {
                    this.R.setVisibility(i10);
                }
                if ((j5 & 20737) != 0) {
                    androidx.databinding.adapters.f0.A(this.S, str9);
                }
                if ((j5 & 20992) != 0) {
                    this.T.setVisibility(i4);
                    this.U.setVisibility(i9);
                }
            }
            i9 = i6;
            z7 = z7;
            if ((j5 & 75497472) != 0) {
                if (i6Var != null) {
                    uVarH0 = i6Var.h0();
                } else {
                    uVarH0 = null;
                }
                str5 = str4;
                p1(8, uVarH0);
                if (uVarH0 != null) {
                    str6 = (String) uVarH0.get();
                } else {
                    str6 = null;
                }
                if ((j5 & 67108864) != 0) {
                }
                if ((j5 & 4294967296L) != 0) {
                    if (i6Var != null) {
                        uVarI0 = i6Var.i0();
                    } else {
                        uVarI0 = null;
                    }
                    str7 = str6;
                    p1(10, uVarI0);
                    if (uVarI0 != null) {
                    }
                    if ((j5 & 20737) != 0) {
                        if (z7) {
                            str7 = str5;
                        }
                        str9 = str7;
                    } else {
                        str9 = null;
                    }
                    j9 = j5 & 20736;
                    if (j9 != 0) {
                        if (!z5) {
                            zIsEmpty = false;
                        }
                        if (j9 != 0) {
                            if (zIsEmpty) {
                                j11 = 268435456;
                            } else {
                                j11 = 134217728;
                            }
                            j5 |= j11;
                        }
                        if (zIsEmpty) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        i10 = i11;
                    } else {
                        i10 = 0;
                    }
                    j10 = j5 & 21633;
                    if (j10 != 0) {
                        if (z7) {
                            str5 = str8;
                        }
                        str10 = str5;
                    } else {
                        str10 = null;
                    }
                    if ((j5 & 20480) != 0) {
                        this.I.setOnClickListener(onClickListenerJ0);
                        this.I.setOnLongClickListener(longListener);
                        this.L.setOnClickListener(onClickListenerK0);
                        this.P.setOnClickListener(onClickListenerN0);
                    }
                    if ((j5 & 20500) != 0) {
                        com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                    }
                    if (j10 != 0) {
                        com.zentraedi.comic.util.j.a(this.K, str10, str);
                        com.zentraedi.comic.util.j.a(this.N, str10, str);
                    }
                    if ((j5 & 20552) != 0) {
                        this.L.setVisibility(i8);
                    }
                    if ((j5 & 20488) != 0) {
                        this.M.setVisibility(i);
                        this.V.setVisibility(i2);
                    }
                    if ((j5 & j2) != 0) {
                        androidx.databinding.adapters.p.a(this.O, drawableB);
                    }
                    if ((j5 & 20544) != 0) {
                        this.O.setVisibility(i3);
                    }
                    if ((j5 & 22592) != 0) {
                        this.P.setVisibility(i7);
                    }
                    if ((j5 & 20512) != 0) {
                        this.Q.setVisibility(i5);
                    }
                    if ((j5 & 20736) != 0) {
                        this.R.setVisibility(i10);
                    }
                    if ((j5 & 20737) != 0) {
                        androidx.databinding.adapters.f0.A(this.S, str9);
                    }
                    if ((j5 & 20992) != 0) {
                        this.T.setVisibility(i4);
                        this.U.setVisibility(i9);
                    }
                }
                str7 = str6;
                if ((j5 & 20737) != 0) {
                    if (z7) {
                        str7 = str5;
                    }
                    str9 = str7;
                } else {
                    str9 = null;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z5) {
                        zIsEmpty = false;
                    }
                    if (j9 != 0) {
                        if (zIsEmpty) {
                            j11 = 268435456;
                        } else {
                            j11 = 134217728;
                        }
                        j5 |= j11;
                    }
                    if (zIsEmpty) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    i10 = i11;
                } else {
                    i10 = 0;
                }
                j10 = j5 & 21633;
                if (j10 != 0) {
                    if (z7) {
                        str5 = str8;
                    }
                    str10 = str5;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(longListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListenerN0);
                }
                if ((j5 & 20500) != 0) {
                    com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                }
                if (j10 != 0) {
                    com.zentraedi.comic.util.j.a(this.K, str10, str);
                    com.zentraedi.comic.util.j.a(this.N, str10, str);
                }
                if ((j5 & 20552) != 0) {
                    this.L.setVisibility(i8);
                }
                if ((j5 & 20488) != 0) {
                    this.M.setVisibility(i);
                    this.V.setVisibility(i2);
                }
                if ((j5 & j2) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawableB);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i3);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i5);
                }
                if ((j5 & 20736) != 0) {
                    this.R.setVisibility(i10);
                }
                if ((j5 & 20737) != 0) {
                    androidx.databinding.adapters.f0.A(this.S, str9);
                }
                if ((j5 & 20992) != 0) {
                    this.T.setVisibility(i4);
                    this.U.setVisibility(i9);
                }
            }
            str5 = str4;
            str6 = null;
            if ((j5 & 4294967296L) != 0) {
                if (i6Var != null) {
                    uVarI0 = i6Var.i0();
                } else {
                    uVarI0 = null;
                }
                str7 = str6;
                p1(10, uVarI0);
                if (uVarI0 != null) {
                }
                if ((j5 & 20737) != 0) {
                    if (z7) {
                        str7 = str5;
                    }
                    str9 = str7;
                } else {
                    str9 = null;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z5) {
                        zIsEmpty = false;
                    }
                    if (j9 != 0) {
                        if (zIsEmpty) {
                            j11 = 268435456;
                        } else {
                            j11 = 134217728;
                        }
                        j5 |= j11;
                    }
                    if (zIsEmpty) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    i10 = i11;
                } else {
                    i10 = 0;
                }
                j10 = j5 & 21633;
                if (j10 != 0) {
                    if (z7) {
                        str5 = str8;
                    }
                    str10 = str5;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(longListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListenerN0);
                }
                if ((j5 & 20500) != 0) {
                    com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                }
                if (j10 != 0) {
                    com.zentraedi.comic.util.j.a(this.K, str10, str);
                    com.zentraedi.comic.util.j.a(this.N, str10, str);
                }
                if ((j5 & 20552) != 0) {
                    this.L.setVisibility(i8);
                }
                if ((j5 & 20488) != 0) {
                    this.M.setVisibility(i);
                    this.V.setVisibility(i2);
                }
                if ((j5 & j2) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawableB);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i3);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i5);
                }
                if ((j5 & 20736) != 0) {
                    this.R.setVisibility(i10);
                }
                if ((j5 & 20737) != 0) {
                    androidx.databinding.adapters.f0.A(this.S, str9);
                }
                if ((j5 & 20992) != 0) {
                    this.T.setVisibility(i4);
                    this.U.setVisibility(i9);
                }
            }
            str7 = str6;
            if ((j5 & 20737) != 0) {
                if (z7) {
                    str7 = str5;
                }
                str9 = str7;
            } else {
                str9 = null;
            }
            j9 = j5 & 20736;
            if (j9 != 0) {
                if (!z5) {
                    zIsEmpty = false;
                }
                if (j9 != 0) {
                    if (zIsEmpty) {
                        j11 = 268435456;
                    } else {
                        j11 = 134217728;
                    }
                    j5 |= j11;
                }
                if (zIsEmpty) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                i10 = i11;
            } else {
                i10 = 0;
            }
            j10 = j5 & 21633;
            if (j10 != 0) {
                if (z7) {
                    str5 = str8;
                }
                str10 = str5;
            } else {
                str10 = null;
            }
            if ((j5 & 20480) != 0) {
                this.I.setOnClickListener(onClickListenerJ0);
                this.I.setOnLongClickListener(longListener);
                this.L.setOnClickListener(onClickListenerK0);
                this.P.setOnClickListener(onClickListenerN0);
            }
            if ((j5 & 20500) != 0) {
                com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
            }
            if (j10 != 0) {
                com.zentraedi.comic.util.j.a(this.K, str10, str);
                com.zentraedi.comic.util.j.a(this.N, str10, str);
            }
            if ((j5 & 20552) != 0) {
                this.L.setVisibility(i8);
            }
            if ((j5 & 20488) != 0) {
                this.M.setVisibility(i);
                this.V.setVisibility(i2);
            }
            if ((j5 & j2) != 0) {
                androidx.databinding.adapters.p.a(this.O, drawableB);
            }
            if ((j5 & 20544) != 0) {
                this.O.setVisibility(i3);
            }
            if ((j5 & 22592) != 0) {
                this.P.setVisibility(i7);
            }
            if ((j5 & 20512) != 0) {
                this.Q.setVisibility(i5);
            }
            if ((j5 & 20736) != 0) {
                this.R.setVisibility(i10);
            }
            if ((j5 & 20737) != 0) {
                androidx.databinding.adapters.f0.A(this.S, str9);
            }
            if ((j5 & 20992) != 0) {
                this.T.setVisibility(i4);
                this.U.setVisibility(i9);
            }
        }
        uVarS1 = uVarS0;
        if ((j4 & 8796093022208L) != 0) {
            if (i6Var != null) {
                uVarS1 = i6Var.s0();
            }
            z5 = z4;
            uVar = uVarS1;
            z6 = z;
            p1(3, uVar);
            if (uVar != null) {
                bool = (Boolean) uVar.get();
            }
            zK0 = androidx.databinding.c0.K0(bool);
            if ((j4 & 20488) != 0) {
                if (zK0) {
                    j5 = j4 | j3;
                } else {
                    j5 = j4 | 549755944960L;
                }
            }
            if ((j5 & 2097152) == 0) {
                z7 = false;
            } else {
                z7 = false;
            }
            if ((j5 & 32768) != 0) {
                if (i6Var != null) {
                    observableFieldR0 = i6Var.r0();
                } else {
                    observableFieldR0 = null;
                }
                p1(11, observableFieldR0);
                if (observableFieldR0 != null) {
                    bool2 = (Boolean) observableFieldR0.get();
                } else {
                    bool2 = null;
                }
                zK1 = androidx.databinding.c0.K0(bool2);
            } else {
                zK1 = false;
            }
            j6 = j5 & 22592;
            if (j6 == 0) {
                i7 = 0;
            } else {
                if (z6) {
                    zK1 = true;
                }
                if (j6 != 0) {
                    if (zK1) {
                        j16 = 1048576;
                    } else {
                        j16 = 524288;
                    }
                    j5 |= j16;
                }
                if (zK1) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
            }
            if ((j5 & 21889) != 0) {
                if (z3) {
                    z7 = true;
                }
                if ((j5 & 20737) != 0) {
                    if (z7) {
                        j15 = 16777216;
                    } else {
                        j15 = 8388608;
                    }
                    j5 |= j15;
                }
                if ((j5 & 21633) != 0) {
                    if (z7) {
                        j14 = 4294967296L;
                    } else {
                        j14 = 2147483648L;
                    }
                    j5 |= j14;
                }
            } else {
                z7 = false;
            }
            j7 = j5 & 20736;
            if (j7 != 0) {
                if (!z2) {
                    z5 = false;
                }
                if (j7 != 0) {
                    if (z5) {
                        j13 = 67108864;
                    } else {
                        j13 = 33554432;
                    }
                    j5 |= j13;
                }
            } else {
                z5 = false;
            }
            j8 = j5 & 20552;
            if (j8 != 0) {
                if (z6) {
                    zK0 = true;
                }
                if (j8 != 0) {
                    if (zK0) {
                        j12 = 274877906944L;
                    } else {
                        j12 = 137438953472L;
                    }
                    j5 |= j12;
                }
                if (zK0) {
                    i12 = 4;
                } else {
                    i12 = 0;
                }
                i8 = i12;
            } else {
                i8 = 0;
            }
            if ((j5 & 2164260864L) != 0) {
                if (i6Var != null) {
                    uVarL0 = i6Var.l0();
                } else {
                    uVarL0 = null;
                }
                i9 = i6;
                p1(0, uVarL0);
                if (uVarL0 != null) {
                }
                if ((j5 & 75497472) != 0) {
                    if (i6Var != null) {
                        uVarH0 = i6Var.h0();
                    } else {
                        uVarH0 = null;
                    }
                    str5 = str4;
                    p1(8, uVarH0);
                    if (uVarH0 != null) {
                        str6 = (String) uVarH0.get();
                    } else {
                        str6 = null;
                    }
                    if ((j5 & 67108864) != 0) {
                    }
                    if ((j5 & 4294967296L) != 0) {
                        if (i6Var != null) {
                            uVarI0 = i6Var.i0();
                        } else {
                            uVarI0 = null;
                        }
                        str7 = str6;
                        p1(10, uVarI0);
                        if (uVarI0 != null) {
                        }
                        if ((j5 & 20737) != 0) {
                            if (z7) {
                                str7 = str5;
                            }
                            str9 = str7;
                        } else {
                            str9 = null;
                        }
                        j9 = j5 & 20736;
                        if (j9 != 0) {
                            if (!z5) {
                                zIsEmpty = false;
                            }
                            if (j9 != 0) {
                                if (zIsEmpty) {
                                    j11 = 268435456;
                                } else {
                                    j11 = 134217728;
                                }
                                j5 |= j11;
                            }
                            if (zIsEmpty) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            i10 = i11;
                        } else {
                            i10 = 0;
                        }
                        j10 = j5 & 21633;
                        if (j10 != 0) {
                            if (z7) {
                                str5 = str8;
                            }
                            str10 = str5;
                        } else {
                            str10 = null;
                        }
                        if ((j5 & 20480) != 0) {
                            this.I.setOnClickListener(onClickListenerJ0);
                            this.I.setOnLongClickListener(longListener);
                            this.L.setOnClickListener(onClickListenerK0);
                            this.P.setOnClickListener(onClickListenerN0);
                        }
                        if ((j5 & 20500) != 0) {
                            com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                        }
                        if (j10 != 0) {
                            com.zentraedi.comic.util.j.a(this.K, str10, str);
                            com.zentraedi.comic.util.j.a(this.N, str10, str);
                        }
                        if ((j5 & 20552) != 0) {
                            this.L.setVisibility(i8);
                        }
                        if ((j5 & 20488) != 0) {
                            this.M.setVisibility(i);
                            this.V.setVisibility(i2);
                        }
                        if ((j5 & j2) != 0) {
                            androidx.databinding.adapters.p.a(this.O, drawableB);
                        }
                        if ((j5 & 20544) != 0) {
                            this.O.setVisibility(i3);
                        }
                        if ((j5 & 22592) != 0) {
                            this.P.setVisibility(i7);
                        }
                        if ((j5 & 20512) != 0) {
                            this.Q.setVisibility(i5);
                        }
                        if ((j5 & 20736) != 0) {
                            this.R.setVisibility(i10);
                        }
                        if ((j5 & 20737) != 0) {
                            androidx.databinding.adapters.f0.A(this.S, str9);
                        }
                        if ((j5 & 20992) != 0) {
                            this.T.setVisibility(i4);
                            this.U.setVisibility(i9);
                        }
                    }
                    str7 = str6;
                    if ((j5 & 20737) != 0) {
                        if (z7) {
                            str7 = str5;
                        }
                        str9 = str7;
                    } else {
                        str9 = null;
                    }
                    j9 = j5 & 20736;
                    if (j9 != 0) {
                        if (!z5) {
                            zIsEmpty = false;
                        }
                        if (j9 != 0) {
                            if (zIsEmpty) {
                                j11 = 268435456;
                            } else {
                                j11 = 134217728;
                            }
                            j5 |= j11;
                        }
                        if (zIsEmpty) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        i10 = i11;
                    } else {
                        i10 = 0;
                    }
                    j10 = j5 & 21633;
                    if (j10 != 0) {
                        if (z7) {
                            str5 = str8;
                        }
                        str10 = str5;
                    } else {
                        str10 = null;
                    }
                    if ((j5 & 20480) != 0) {
                        this.I.setOnClickListener(onClickListenerJ0);
                        this.I.setOnLongClickListener(longListener);
                        this.L.setOnClickListener(onClickListenerK0);
                        this.P.setOnClickListener(onClickListenerN0);
                    }
                    if ((j5 & 20500) != 0) {
                        com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                    }
                    if (j10 != 0) {
                        com.zentraedi.comic.util.j.a(this.K, str10, str);
                        com.zentraedi.comic.util.j.a(this.N, str10, str);
                    }
                    if ((j5 & 20552) != 0) {
                        this.L.setVisibility(i8);
                    }
                    if ((j5 & 20488) != 0) {
                        this.M.setVisibility(i);
                        this.V.setVisibility(i2);
                    }
                    if ((j5 & j2) != 0) {
                        androidx.databinding.adapters.p.a(this.O, drawableB);
                    }
                    if ((j5 & 20544) != 0) {
                        this.O.setVisibility(i3);
                    }
                    if ((j5 & 22592) != 0) {
                        this.P.setVisibility(i7);
                    }
                    if ((j5 & 20512) != 0) {
                        this.Q.setVisibility(i5);
                    }
                    if ((j5 & 20736) != 0) {
                        this.R.setVisibility(i10);
                    }
                    if ((j5 & 20737) != 0) {
                        androidx.databinding.adapters.f0.A(this.S, str9);
                    }
                    if ((j5 & 20992) != 0) {
                        this.T.setVisibility(i4);
                        this.U.setVisibility(i9);
                    }
                }
                str5 = str4;
                str6 = null;
                if ((j5 & 4294967296L) != 0) {
                    if (i6Var != null) {
                        uVarI0 = i6Var.i0();
                    } else {
                        uVarI0 = null;
                    }
                    str7 = str6;
                    p1(10, uVarI0);
                    if (uVarI0 != null) {
                    }
                    if ((j5 & 20737) != 0) {
                        if (z7) {
                            str7 = str5;
                        }
                        str9 = str7;
                    } else {
                        str9 = null;
                    }
                    j9 = j5 & 20736;
                    if (j9 != 0) {
                        if (!z5) {
                            zIsEmpty = false;
                        }
                        if (j9 != 0) {
                            if (zIsEmpty) {
                                j11 = 268435456;
                            } else {
                                j11 = 134217728;
                            }
                            j5 |= j11;
                        }
                        if (zIsEmpty) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        i10 = i11;
                    } else {
                        i10 = 0;
                    }
                    j10 = j5 & 21633;
                    if (j10 != 0) {
                        if (z7) {
                            str5 = str8;
                        }
                        str10 = str5;
                    } else {
                        str10 = null;
                    }
                    if ((j5 & 20480) != 0) {
                        this.I.setOnClickListener(onClickListenerJ0);
                        this.I.setOnLongClickListener(longListener);
                        this.L.setOnClickListener(onClickListenerK0);
                        this.P.setOnClickListener(onClickListenerN0);
                    }
                    if ((j5 & 20500) != 0) {
                        com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                    }
                    if (j10 != 0) {
                        com.zentraedi.comic.util.j.a(this.K, str10, str);
                        com.zentraedi.comic.util.j.a(this.N, str10, str);
                    }
                    if ((j5 & 20552) != 0) {
                        this.L.setVisibility(i8);
                    }
                    if ((j5 & 20488) != 0) {
                        this.M.setVisibility(i);
                        this.V.setVisibility(i2);
                    }
                    if ((j5 & j2) != 0) {
                        androidx.databinding.adapters.p.a(this.O, drawableB);
                    }
                    if ((j5 & 20544) != 0) {
                        this.O.setVisibility(i3);
                    }
                    if ((j5 & 22592) != 0) {
                        this.P.setVisibility(i7);
                    }
                    if ((j5 & 20512) != 0) {
                        this.Q.setVisibility(i5);
                    }
                    if ((j5 & 20736) != 0) {
                        this.R.setVisibility(i10);
                    }
                    if ((j5 & 20737) != 0) {
                        androidx.databinding.adapters.f0.A(this.S, str9);
                    }
                    if ((j5 & 20992) != 0) {
                        this.T.setVisibility(i4);
                        this.U.setVisibility(i9);
                    }
                }
                str7 = str6;
                if ((j5 & 20737) != 0) {
                    if (z7) {
                        str7 = str5;
                    }
                    str9 = str7;
                } else {
                    str9 = null;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z5) {
                        zIsEmpty = false;
                    }
                    if (j9 != 0) {
                        if (zIsEmpty) {
                            j11 = 268435456;
                        } else {
                            j11 = 134217728;
                        }
                        j5 |= j11;
                    }
                    if (zIsEmpty) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    i10 = i11;
                } else {
                    i10 = 0;
                }
                j10 = j5 & 21633;
                if (j10 != 0) {
                    if (z7) {
                        str5 = str8;
                    }
                    str10 = str5;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(longListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListenerN0);
                }
                if ((j5 & 20500) != 0) {
                    com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                }
                if (j10 != 0) {
                    com.zentraedi.comic.util.j.a(this.K, str10, str);
                    com.zentraedi.comic.util.j.a(this.N, str10, str);
                }
                if ((j5 & 20552) != 0) {
                    this.L.setVisibility(i8);
                }
                if ((j5 & 20488) != 0) {
                    this.M.setVisibility(i);
                    this.V.setVisibility(i2);
                }
                if ((j5 & j2) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawableB);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i3);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i5);
                }
                if ((j5 & 20736) != 0) {
                    this.R.setVisibility(i10);
                }
                if ((j5 & 20737) != 0) {
                    androidx.databinding.adapters.f0.A(this.S, str9);
                }
                if ((j5 & 20992) != 0) {
                    this.T.setVisibility(i4);
                    this.U.setVisibility(i9);
                }
            }
            i9 = i6;
            z7 = z7;
            if ((j5 & 75497472) != 0) {
                if (i6Var != null) {
                    uVarH0 = i6Var.h0();
                } else {
                    uVarH0 = null;
                }
                str5 = str4;
                p1(8, uVarH0);
                if (uVarH0 != null) {
                    str6 = (String) uVarH0.get();
                } else {
                    str6 = null;
                }
                if ((j5 & 67108864) != 0) {
                }
                if ((j5 & 4294967296L) != 0) {
                    if (i6Var != null) {
                        uVarI0 = i6Var.i0();
                    } else {
                        uVarI0 = null;
                    }
                    str7 = str6;
                    p1(10, uVarI0);
                    if (uVarI0 != null) {
                    }
                    if ((j5 & 20737) != 0) {
                        if (z7) {
                            str7 = str5;
                        }
                        str9 = str7;
                    } else {
                        str9 = null;
                    }
                    j9 = j5 & 20736;
                    if (j9 != 0) {
                        if (!z5) {
                            zIsEmpty = false;
                        }
                        if (j9 != 0) {
                            if (zIsEmpty) {
                                j11 = 268435456;
                            } else {
                                j11 = 134217728;
                            }
                            j5 |= j11;
                        }
                        if (zIsEmpty) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        i10 = i11;
                    } else {
                        i10 = 0;
                    }
                    j10 = j5 & 21633;
                    if (j10 != 0) {
                        if (z7) {
                            str5 = str8;
                        }
                        str10 = str5;
                    } else {
                        str10 = null;
                    }
                    if ((j5 & 20480) != 0) {
                        this.I.setOnClickListener(onClickListenerJ0);
                        this.I.setOnLongClickListener(longListener);
                        this.L.setOnClickListener(onClickListenerK0);
                        this.P.setOnClickListener(onClickListenerN0);
                    }
                    if ((j5 & 20500) != 0) {
                        com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                    }
                    if (j10 != 0) {
                        com.zentraedi.comic.util.j.a(this.K, str10, str);
                        com.zentraedi.comic.util.j.a(this.N, str10, str);
                    }
                    if ((j5 & 20552) != 0) {
                        this.L.setVisibility(i8);
                    }
                    if ((j5 & 20488) != 0) {
                        this.M.setVisibility(i);
                        this.V.setVisibility(i2);
                    }
                    if ((j5 & j2) != 0) {
                        androidx.databinding.adapters.p.a(this.O, drawableB);
                    }
                    if ((j5 & 20544) != 0) {
                        this.O.setVisibility(i3);
                    }
                    if ((j5 & 22592) != 0) {
                        this.P.setVisibility(i7);
                    }
                    if ((j5 & 20512) != 0) {
                        this.Q.setVisibility(i5);
                    }
                    if ((j5 & 20736) != 0) {
                        this.R.setVisibility(i10);
                    }
                    if ((j5 & 20737) != 0) {
                        androidx.databinding.adapters.f0.A(this.S, str9);
                    }
                    if ((j5 & 20992) != 0) {
                        this.T.setVisibility(i4);
                        this.U.setVisibility(i9);
                    }
                }
                str7 = str6;
                if ((j5 & 20737) != 0) {
                    if (z7) {
                        str7 = str5;
                    }
                    str9 = str7;
                } else {
                    str9 = null;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z5) {
                        zIsEmpty = false;
                    }
                    if (j9 != 0) {
                        if (zIsEmpty) {
                            j11 = 268435456;
                        } else {
                            j11 = 134217728;
                        }
                        j5 |= j11;
                    }
                    if (zIsEmpty) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    i10 = i11;
                } else {
                    i10 = 0;
                }
                j10 = j5 & 21633;
                if (j10 != 0) {
                    if (z7) {
                        str5 = str8;
                    }
                    str10 = str5;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(longListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListenerN0);
                }
                if ((j5 & 20500) != 0) {
                    com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                }
                if (j10 != 0) {
                    com.zentraedi.comic.util.j.a(this.K, str10, str);
                    com.zentraedi.comic.util.j.a(this.N, str10, str);
                }
                if ((j5 & 20552) != 0) {
                    this.L.setVisibility(i8);
                }
                if ((j5 & 20488) != 0) {
                    this.M.setVisibility(i);
                    this.V.setVisibility(i2);
                }
                if ((j5 & j2) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawableB);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i3);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i5);
                }
                if ((j5 & 20736) != 0) {
                    this.R.setVisibility(i10);
                }
                if ((j5 & 20737) != 0) {
                    androidx.databinding.adapters.f0.A(this.S, str9);
                }
                if ((j5 & 20992) != 0) {
                    this.T.setVisibility(i4);
                    this.U.setVisibility(i9);
                }
            }
            str5 = str4;
            str6 = null;
            if ((j5 & 4294967296L) != 0) {
                if (i6Var != null) {
                    uVarI0 = i6Var.i0();
                } else {
                    uVarI0 = null;
                }
                str7 = str6;
                p1(10, uVarI0);
                if (uVarI0 != null) {
                }
                if ((j5 & 20737) != 0) {
                    if (z7) {
                        str7 = str5;
                    }
                    str9 = str7;
                } else {
                    str9 = null;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z5) {
                        zIsEmpty = false;
                    }
                    if (j9 != 0) {
                        if (zIsEmpty) {
                            j11 = 268435456;
                        } else {
                            j11 = 134217728;
                        }
                        j5 |= j11;
                    }
                    if (zIsEmpty) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    i10 = i11;
                } else {
                    i10 = 0;
                }
                j10 = j5 & 21633;
                if (j10 != 0) {
                    if (z7) {
                        str5 = str8;
                    }
                    str10 = str5;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(longListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListenerN0);
                }
                if ((j5 & 20500) != 0) {
                    com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                }
                if (j10 != 0) {
                    com.zentraedi.comic.util.j.a(this.K, str10, str);
                    com.zentraedi.comic.util.j.a(this.N, str10, str);
                }
                if ((j5 & 20552) != 0) {
                    this.L.setVisibility(i8);
                }
                if ((j5 & 20488) != 0) {
                    this.M.setVisibility(i);
                    this.V.setVisibility(i2);
                }
                if ((j5 & j2) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawableB);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i3);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i5);
                }
                if ((j5 & 20736) != 0) {
                    this.R.setVisibility(i10);
                }
                if ((j5 & 20737) != 0) {
                    androidx.databinding.adapters.f0.A(this.S, str9);
                }
                if ((j5 & 20992) != 0) {
                    this.T.setVisibility(i4);
                    this.U.setVisibility(i9);
                }
            }
            str7 = str6;
            if ((j5 & 20737) != 0) {
                if (z7) {
                    str7 = str5;
                }
                str9 = str7;
            } else {
                str9 = null;
            }
            j9 = j5 & 20736;
            if (j9 != 0) {
                if (!z5) {
                    zIsEmpty = false;
                }
                if (j9 != 0) {
                    if (zIsEmpty) {
                        j11 = 268435456;
                    } else {
                        j11 = 134217728;
                    }
                    j5 |= j11;
                }
                if (zIsEmpty) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                i10 = i11;
            } else {
                i10 = 0;
            }
            j10 = j5 & 21633;
            if (j10 != 0) {
                if (z7) {
                    str5 = str8;
                }
                str10 = str5;
            } else {
                str10 = null;
            }
            if ((j5 & 20480) != 0) {
                this.I.setOnClickListener(onClickListenerJ0);
                this.I.setOnLongClickListener(longListener);
                this.L.setOnClickListener(onClickListenerK0);
                this.P.setOnClickListener(onClickListenerN0);
            }
            if ((j5 & 20500) != 0) {
                com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
            }
            if (j10 != 0) {
                com.zentraedi.comic.util.j.a(this.K, str10, str);
                com.zentraedi.comic.util.j.a(this.N, str10, str);
            }
            if ((j5 & 20552) != 0) {
                this.L.setVisibility(i8);
            }
            if ((j5 & 20488) != 0) {
                this.M.setVisibility(i);
                this.V.setVisibility(i2);
            }
            if ((j5 & j2) != 0) {
                androidx.databinding.adapters.p.a(this.O, drawableB);
            }
            if ((j5 & 20544) != 0) {
                this.O.setVisibility(i3);
            }
            if ((j5 & 22592) != 0) {
                this.P.setVisibility(i7);
            }
            if ((j5 & 20512) != 0) {
                this.Q.setVisibility(i5);
            }
            if ((j5 & 20736) != 0) {
                this.R.setVisibility(i10);
            }
            if ((j5 & 20737) != 0) {
                androidx.databinding.adapters.f0.A(this.S, str9);
            }
            if ((j5 & 20992) != 0) {
                this.T.setVisibility(i4);
                this.U.setVisibility(i9);
            }
        }
        z5 = z4;
        z6 = z;
        j5 = j4;
        if ((j5 & 2097152) == 0) {
            z7 = false;
        } else {
            z7 = false;
        }
        if ((j5 & 32768) != 0) {
            if (i6Var != null) {
                observableFieldR0 = i6Var.r0();
            } else {
                observableFieldR0 = null;
            }
            p1(11, observableFieldR0);
            if (observableFieldR0 != null) {
                bool2 = (Boolean) observableFieldR0.get();
            } else {
                bool2 = null;
            }
            zK1 = androidx.databinding.c0.K0(bool2);
        } else {
            zK1 = false;
        }
        j6 = j5 & 22592;
        if (j6 == 0) {
            i7 = 0;
        } else {
            if (z6) {
                zK1 = true;
            }
            if (j6 != 0) {
                if (zK1) {
                    j16 = 1048576;
                } else {
                    j16 = 524288;
                }
                j5 |= j16;
            }
            if (zK1) {
                i7 = 8;
            } else {
                i7 = 0;
            }
        }
        if ((j5 & 21889) != 0) {
            if (z3) {
                z7 = true;
            }
            if ((j5 & 20737) != 0) {
                if (z7) {
                    j15 = 16777216;
                } else {
                    j15 = 8388608;
                }
                j5 |= j15;
            }
            if ((j5 & 21633) != 0) {
                if (z7) {
                    j14 = 4294967296L;
                } else {
                    j14 = 2147483648L;
                }
                j5 |= j14;
            }
        } else {
            z7 = false;
        }
        j7 = j5 & 20736;
        if (j7 != 0) {
            if (!z2) {
                z5 = false;
            }
            if (j7 != 0) {
                if (z5) {
                    j13 = 67108864;
                } else {
                    j13 = 33554432;
                }
                j5 |= j13;
            }
        } else {
            z5 = false;
        }
        j8 = j5 & 20552;
        if (j8 != 0) {
            if (z6) {
                zK0 = true;
            }
            if (j8 != 0) {
                if (zK0) {
                    j12 = 274877906944L;
                } else {
                    j12 = 137438953472L;
                }
                j5 |= j12;
            }
            if (zK0) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            i8 = i12;
        } else {
            i8 = 0;
        }
        if ((j5 & 2164260864L) != 0) {
            if (i6Var != null) {
                uVarL0 = i6Var.l0();
            } else {
                uVarL0 = null;
            }
            i9 = i6;
            p1(0, uVarL0);
            if (uVarL0 != null) {
            }
            if ((j5 & 75497472) != 0) {
                if (i6Var != null) {
                    uVarH0 = i6Var.h0();
                } else {
                    uVarH0 = null;
                }
                str5 = str4;
                p1(8, uVarH0);
                if (uVarH0 != null) {
                    str6 = (String) uVarH0.get();
                } else {
                    str6 = null;
                }
                if ((j5 & 67108864) != 0) {
                }
                if ((j5 & 4294967296L) != 0) {
                    if (i6Var != null) {
                        uVarI0 = i6Var.i0();
                    } else {
                        uVarI0 = null;
                    }
                    str7 = str6;
                    p1(10, uVarI0);
                    if (uVarI0 != null) {
                    }
                    if ((j5 & 20737) != 0) {
                        if (z7) {
                            str7 = str5;
                        }
                        str9 = str7;
                    } else {
                        str9 = null;
                    }
                    j9 = j5 & 20736;
                    if (j9 != 0) {
                        if (!z5) {
                            zIsEmpty = false;
                        }
                        if (j9 != 0) {
                            if (zIsEmpty) {
                                j11 = 268435456;
                            } else {
                                j11 = 134217728;
                            }
                            j5 |= j11;
                        }
                        if (zIsEmpty) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        i10 = i11;
                    } else {
                        i10 = 0;
                    }
                    j10 = j5 & 21633;
                    if (j10 != 0) {
                        if (z7) {
                            str5 = str8;
                        }
                        str10 = str5;
                    } else {
                        str10 = null;
                    }
                    if ((j5 & 20480) != 0) {
                        this.I.setOnClickListener(onClickListenerJ0);
                        this.I.setOnLongClickListener(longListener);
                        this.L.setOnClickListener(onClickListenerK0);
                        this.P.setOnClickListener(onClickListenerN0);
                    }
                    if ((j5 & 20500) != 0) {
                        com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                    }
                    if (j10 != 0) {
                        com.zentraedi.comic.util.j.a(this.K, str10, str);
                        com.zentraedi.comic.util.j.a(this.N, str10, str);
                    }
                    if ((j5 & 20552) != 0) {
                        this.L.setVisibility(i8);
                    }
                    if ((j5 & 20488) != 0) {
                        this.M.setVisibility(i);
                        this.V.setVisibility(i2);
                    }
                    if ((j5 & j2) != 0) {
                        androidx.databinding.adapters.p.a(this.O, drawableB);
                    }
                    if ((j5 & 20544) != 0) {
                        this.O.setVisibility(i3);
                    }
                    if ((j5 & 22592) != 0) {
                        this.P.setVisibility(i7);
                    }
                    if ((j5 & 20512) != 0) {
                        this.Q.setVisibility(i5);
                    }
                    if ((j5 & 20736) != 0) {
                        this.R.setVisibility(i10);
                    }
                    if ((j5 & 20737) != 0) {
                        androidx.databinding.adapters.f0.A(this.S, str9);
                    }
                    if ((j5 & 20992) != 0) {
                        this.T.setVisibility(i4);
                        this.U.setVisibility(i9);
                    }
                }
                str7 = str6;
                if ((j5 & 20737) != 0) {
                    if (z7) {
                        str7 = str5;
                    }
                    str9 = str7;
                } else {
                    str9 = null;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z5) {
                        zIsEmpty = false;
                    }
                    if (j9 != 0) {
                        if (zIsEmpty) {
                            j11 = 268435456;
                        } else {
                            j11 = 134217728;
                        }
                        j5 |= j11;
                    }
                    if (zIsEmpty) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    i10 = i11;
                } else {
                    i10 = 0;
                }
                j10 = j5 & 21633;
                if (j10 != 0) {
                    if (z7) {
                        str5 = str8;
                    }
                    str10 = str5;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(longListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListenerN0);
                }
                if ((j5 & 20500) != 0) {
                    com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                }
                if (j10 != 0) {
                    com.zentraedi.comic.util.j.a(this.K, str10, str);
                    com.zentraedi.comic.util.j.a(this.N, str10, str);
                }
                if ((j5 & 20552) != 0) {
                    this.L.setVisibility(i8);
                }
                if ((j5 & 20488) != 0) {
                    this.M.setVisibility(i);
                    this.V.setVisibility(i2);
                }
                if ((j5 & j2) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawableB);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i3);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i5);
                }
                if ((j5 & 20736) != 0) {
                    this.R.setVisibility(i10);
                }
                if ((j5 & 20737) != 0) {
                    androidx.databinding.adapters.f0.A(this.S, str9);
                }
                if ((j5 & 20992) != 0) {
                    this.T.setVisibility(i4);
                    this.U.setVisibility(i9);
                }
            }
            str5 = str4;
            str6 = null;
            if ((j5 & 4294967296L) != 0) {
                if (i6Var != null) {
                    uVarI0 = i6Var.i0();
                } else {
                    uVarI0 = null;
                }
                str7 = str6;
                p1(10, uVarI0);
                if (uVarI0 != null) {
                }
                if ((j5 & 20737) != 0) {
                    if (z7) {
                        str7 = str5;
                    }
                    str9 = str7;
                } else {
                    str9 = null;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z5) {
                        zIsEmpty = false;
                    }
                    if (j9 != 0) {
                        if (zIsEmpty) {
                            j11 = 268435456;
                        } else {
                            j11 = 134217728;
                        }
                        j5 |= j11;
                    }
                    if (zIsEmpty) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    i10 = i11;
                } else {
                    i10 = 0;
                }
                j10 = j5 & 21633;
                if (j10 != 0) {
                    if (z7) {
                        str5 = str8;
                    }
                    str10 = str5;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(longListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListenerN0);
                }
                if ((j5 & 20500) != 0) {
                    com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                }
                if (j10 != 0) {
                    com.zentraedi.comic.util.j.a(this.K, str10, str);
                    com.zentraedi.comic.util.j.a(this.N, str10, str);
                }
                if ((j5 & 20552) != 0) {
                    this.L.setVisibility(i8);
                }
                if ((j5 & 20488) != 0) {
                    this.M.setVisibility(i);
                    this.V.setVisibility(i2);
                }
                if ((j5 & j2) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawableB);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i3);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i5);
                }
                if ((j5 & 20736) != 0) {
                    this.R.setVisibility(i10);
                }
                if ((j5 & 20737) != 0) {
                    androidx.databinding.adapters.f0.A(this.S, str9);
                }
                if ((j5 & 20992) != 0) {
                    this.T.setVisibility(i4);
                    this.U.setVisibility(i9);
                }
            }
            str7 = str6;
            if ((j5 & 20737) != 0) {
                if (z7) {
                    str7 = str5;
                }
                str9 = str7;
            } else {
                str9 = null;
            }
            j9 = j5 & 20736;
            if (j9 != 0) {
                if (!z5) {
                    zIsEmpty = false;
                }
                if (j9 != 0) {
                    if (zIsEmpty) {
                        j11 = 268435456;
                    } else {
                        j11 = 134217728;
                    }
                    j5 |= j11;
                }
                if (zIsEmpty) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                i10 = i11;
            } else {
                i10 = 0;
            }
            j10 = j5 & 21633;
            if (j10 != 0) {
                if (z7) {
                    str5 = str8;
                }
                str10 = str5;
            } else {
                str10 = null;
            }
            if ((j5 & 20480) != 0) {
                this.I.setOnClickListener(onClickListenerJ0);
                this.I.setOnLongClickListener(longListener);
                this.L.setOnClickListener(onClickListenerK0);
                this.P.setOnClickListener(onClickListenerN0);
            }
            if ((j5 & 20500) != 0) {
                com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
            }
            if (j10 != 0) {
                com.zentraedi.comic.util.j.a(this.K, str10, str);
                com.zentraedi.comic.util.j.a(this.N, str10, str);
            }
            if ((j5 & 20552) != 0) {
                this.L.setVisibility(i8);
            }
            if ((j5 & 20488) != 0) {
                this.M.setVisibility(i);
                this.V.setVisibility(i2);
            }
            if ((j5 & j2) != 0) {
                androidx.databinding.adapters.p.a(this.O, drawableB);
            }
            if ((j5 & 20544) != 0) {
                this.O.setVisibility(i3);
            }
            if ((j5 & 22592) != 0) {
                this.P.setVisibility(i7);
            }
            if ((j5 & 20512) != 0) {
                this.Q.setVisibility(i5);
            }
            if ((j5 & 20736) != 0) {
                this.R.setVisibility(i10);
            }
            if ((j5 & 20737) != 0) {
                androidx.databinding.adapters.f0.A(this.S, str9);
            }
            if ((j5 & 20992) != 0) {
                this.T.setVisibility(i4);
                this.U.setVisibility(i9);
            }
        }
        i9 = i6;
        z7 = z7;
        if ((j5 & 75497472) != 0) {
            if (i6Var != null) {
                uVarH0 = i6Var.h0();
            } else {
                uVarH0 = null;
            }
            str5 = str4;
            p1(8, uVarH0);
            if (uVarH0 != null) {
                str6 = (String) uVarH0.get();
            } else {
                str6 = null;
            }
            if ((j5 & 67108864) != 0) {
            }
            if ((j5 & 4294967296L) != 0) {
                if (i6Var != null) {
                    uVarI0 = i6Var.i0();
                } else {
                    uVarI0 = null;
                }
                str7 = str6;
                p1(10, uVarI0);
                if (uVarI0 != null) {
                }
                if ((j5 & 20737) != 0) {
                    if (z7) {
                        str7 = str5;
                    }
                    str9 = str7;
                } else {
                    str9 = null;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z5) {
                        zIsEmpty = false;
                    }
                    if (j9 != 0) {
                        if (zIsEmpty) {
                            j11 = 268435456;
                        } else {
                            j11 = 134217728;
                        }
                        j5 |= j11;
                    }
                    if (zIsEmpty) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    i10 = i11;
                } else {
                    i10 = 0;
                }
                j10 = j5 & 21633;
                if (j10 != 0) {
                    if (z7) {
                        str5 = str8;
                    }
                    str10 = str5;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(longListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListenerN0);
                }
                if ((j5 & 20500) != 0) {
                    com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
                }
                if (j10 != 0) {
                    com.zentraedi.comic.util.j.a(this.K, str10, str);
                    com.zentraedi.comic.util.j.a(this.N, str10, str);
                }
                if ((j5 & 20552) != 0) {
                    this.L.setVisibility(i8);
                }
                if ((j5 & 20488) != 0) {
                    this.M.setVisibility(i);
                    this.V.setVisibility(i2);
                }
                if ((j5 & j2) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawableB);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i3);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i5);
                }
                if ((j5 & 20736) != 0) {
                    this.R.setVisibility(i10);
                }
                if ((j5 & 20737) != 0) {
                    androidx.databinding.adapters.f0.A(this.S, str9);
                }
                if ((j5 & 20992) != 0) {
                    this.T.setVisibility(i4);
                    this.U.setVisibility(i9);
                }
            }
            str7 = str6;
            if ((j5 & 20737) != 0) {
                if (z7) {
                    str7 = str5;
                }
                str9 = str7;
            } else {
                str9 = null;
            }
            j9 = j5 & 20736;
            if (j9 != 0) {
                if (!z5) {
                    zIsEmpty = false;
                }
                if (j9 != 0) {
                    if (zIsEmpty) {
                        j11 = 268435456;
                    } else {
                        j11 = 134217728;
                    }
                    j5 |= j11;
                }
                if (zIsEmpty) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                i10 = i11;
            } else {
                i10 = 0;
            }
            j10 = j5 & 21633;
            if (j10 != 0) {
                if (z7) {
                    str5 = str8;
                }
                str10 = str5;
            } else {
                str10 = null;
            }
            if ((j5 & 20480) != 0) {
                this.I.setOnClickListener(onClickListenerJ0);
                this.I.setOnLongClickListener(longListener);
                this.L.setOnClickListener(onClickListenerK0);
                this.P.setOnClickListener(onClickListenerN0);
            }
            if ((j5 & 20500) != 0) {
                com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
            }
            if (j10 != 0) {
                com.zentraedi.comic.util.j.a(this.K, str10, str);
                com.zentraedi.comic.util.j.a(this.N, str10, str);
            }
            if ((j5 & 20552) != 0) {
                this.L.setVisibility(i8);
            }
            if ((j5 & 20488) != 0) {
                this.M.setVisibility(i);
                this.V.setVisibility(i2);
            }
            if ((j5 & j2) != 0) {
                androidx.databinding.adapters.p.a(this.O, drawableB);
            }
            if ((j5 & 20544) != 0) {
                this.O.setVisibility(i3);
            }
            if ((j5 & 22592) != 0) {
                this.P.setVisibility(i7);
            }
            if ((j5 & 20512) != 0) {
                this.Q.setVisibility(i5);
            }
            if ((j5 & 20736) != 0) {
                this.R.setVisibility(i10);
            }
            if ((j5 & 20737) != 0) {
                androidx.databinding.adapters.f0.A(this.S, str9);
            }
            if ((j5 & 20992) != 0) {
                this.T.setVisibility(i4);
                this.U.setVisibility(i9);
            }
        }
        str5 = str4;
        str6 = null;
        if ((j5 & 4294967296L) != 0) {
            if (i6Var != null) {
                uVarI0 = i6Var.i0();
            } else {
                uVarI0 = null;
            }
            str7 = str6;
            p1(10, uVarI0);
            if (uVarI0 != null) {
            }
            if ((j5 & 20737) != 0) {
                if (z7) {
                    str7 = str5;
                }
                str9 = str7;
            } else {
                str9 = null;
            }
            j9 = j5 & 20736;
            if (j9 != 0) {
                if (!z5) {
                    zIsEmpty = false;
                }
                if (j9 != 0) {
                    if (zIsEmpty) {
                        j11 = 268435456;
                    } else {
                        j11 = 134217728;
                    }
                    j5 |= j11;
                }
                if (zIsEmpty) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                i10 = i11;
            } else {
                i10 = 0;
            }
            j10 = j5 & 21633;
            if (j10 != 0) {
                if (z7) {
                    str5 = str8;
                }
                str10 = str5;
            } else {
                str10 = null;
            }
            if ((j5 & 20480) != 0) {
                this.I.setOnClickListener(onClickListenerJ0);
                this.I.setOnLongClickListener(longListener);
                this.L.setOnClickListener(onClickListenerK0);
                this.P.setOnClickListener(onClickListenerN0);
            }
            if ((j5 & 20500) != 0) {
                com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
            }
            if (j10 != 0) {
                com.zentraedi.comic.util.j.a(this.K, str10, str);
                com.zentraedi.comic.util.j.a(this.N, str10, str);
            }
            if ((j5 & 20552) != 0) {
                this.L.setVisibility(i8);
            }
            if ((j5 & 20488) != 0) {
                this.M.setVisibility(i);
                this.V.setVisibility(i2);
            }
            if ((j5 & j2) != 0) {
                androidx.databinding.adapters.p.a(this.O, drawableB);
            }
            if ((j5 & 20544) != 0) {
                this.O.setVisibility(i3);
            }
            if ((j5 & 22592) != 0) {
                this.P.setVisibility(i7);
            }
            if ((j5 & 20512) != 0) {
                this.Q.setVisibility(i5);
            }
            if ((j5 & 20736) != 0) {
                this.R.setVisibility(i10);
            }
            if ((j5 & 20737) != 0) {
                androidx.databinding.adapters.f0.A(this.S, str9);
            }
            if ((j5 & 20992) != 0) {
                this.T.setVisibility(i4);
                this.U.setVisibility(i9);
            }
        }
        str7 = str6;
        if ((j5 & 20737) != 0) {
            if (z7) {
                str7 = str5;
            }
            str9 = str7;
        } else {
            str9 = null;
        }
        j9 = j5 & 20736;
        if (j9 != 0) {
            if (!z5) {
                zIsEmpty = false;
            }
            if (j9 != 0) {
                if (zIsEmpty) {
                    j11 = 268435456;
                } else {
                    j11 = 134217728;
                }
                j5 |= j11;
            }
            if (zIsEmpty) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            i10 = i11;
        } else {
            i10 = 0;
        }
        j10 = j5 & 21633;
        if (j10 != 0) {
            if (z7) {
                str5 = str8;
            }
            str10 = str5;
        } else {
            str10 = null;
        }
        if ((j5 & 20480) != 0) {
            this.I.setOnClickListener(onClickListenerJ0);
            this.I.setOnLongClickListener(longListener);
            this.L.setOnClickListener(onClickListenerK0);
            this.P.setOnClickListener(onClickListenerN0);
        }
        if ((j5 & 20500) != 0) {
            com.zentraedi.comic.util.e.a(this.J, str2, str3, null, Integer.valueOf(com.zentraedi.basic.function.utils.m0.b(8.0f)), Boolean.valueOf(zZ0), false);
        }
        if (j10 != 0) {
            com.zentraedi.comic.util.j.a(this.K, str10, str);
            com.zentraedi.comic.util.j.a(this.N, str10, str);
        }
        if ((j5 & 20552) != 0) {
            this.L.setVisibility(i8);
        }
        if ((j5 & 20488) != 0) {
            this.M.setVisibility(i);
            this.V.setVisibility(i2);
        }
        if ((j5 & j2) != 0) {
            androidx.databinding.adapters.p.a(this.O, drawableB);
        }
        if ((j5 & 20544) != 0) {
            this.O.setVisibility(i3);
        }
        if ((j5 & 22592) != 0) {
            this.P.setVisibility(i7);
        }
        if ((j5 & 20512) != 0) {
            this.Q.setVisibility(i5);
        }
        if ((j5 & 20736) != 0) {
            this.R.setVisibility(i10);
        }
        if ((j5 & 20737) != 0) {
            androidx.databinding.adapters.f0.A(this.S, str9);
        }
        if ((j5 & 20992) != 0) {
            this.T.setVisibility(i4);
            this.U.setVisibility(i9);
        }
    }

    private n3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 12, (FrameLayout) objArr[15], (FrameLayout) objArr[14]);
        this.W = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.J = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.K = textView;
        textView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[11];
        this.L = imageView2;
        imageView2.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[12];
        this.M = linearLayout;
        linearLayout.setTag(null);
        TextView textView2 = (TextView) objArr[13];
        this.N = textView2;
        textView2.setTag(null);
        ImageView imageView3 = (ImageView) objArr[2];
        this.O = imageView3;
        imageView3.setTag(null);
        ImageView imageView4 = (ImageView) objArr[3];
        this.P = imageView4;
        imageView4.setTag(null);
        ImageView imageView5 = (ImageView) objArr[4];
        this.Q = imageView5;
        imageView5.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[5];
        this.R = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView3 = (TextView) objArr[6];
        this.S = textView3;
        textView3.setTag(null);
        ImageView imageView6 = (ImageView) objArr[7];
        this.T = imageView6;
        imageView6.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[8];
        this.U = progressBar;
        progressBar.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[9];
        this.V = linearLayout2;
        linearLayout2.setTag(null);
        P0(view);
        i0();
    }
}
