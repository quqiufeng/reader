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
public class r3 extends q3 {

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

    public r3(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
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

    @Override // com.zentraedi.comic.databinding.q3
    public void D1(@androidx.annotation.p0 Boolean bool) {
        this.G = bool;
    }

    @Override // com.zentraedi.comic.databinding.q3
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

    /* JADX WARN: Code duplicated, block: B:102:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0182  */
    /* JADX WARN: Code duplicated, block: B:105:0x018a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0198  */
    /* JADX WARN: Code duplicated, block: B:111:0x019d  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x01da  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207  */
    /* JADX WARN: Code duplicated, block: B:151:0x0213 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x0215  */
    /* JADX WARN: Code duplicated, block: B:154:0x021b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0221  */
    /* JADX WARN: Code duplicated, block: B:157:0x0223  */
    /* JADX WARN: Code duplicated, block: B:159:0x0227  */
    /* JADX WARN: Code duplicated, block: B:160:0x0229  */
    /* JADX WARN: Code duplicated, block: B:161:0x022c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0236 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x0238  */
    /* JADX WARN: Code duplicated, block: B:167:0x023f  */
    /* JADX WARN: Code duplicated, block: B:170:0x024b  */
    /* JADX WARN: Code duplicated, block: B:171:0x024d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0250 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x0252  */
    /* JADX WARN: Code duplicated, block: B:176:0x0258  */
    /* JADX WARN: Code duplicated, block: B:179:0x0262  */
    /* JADX WARN: Code duplicated, block: B:181:0x0265  */
    /* JADX WARN: Code duplicated, block: B:182:0x0268  */
    /* JADX WARN: Code duplicated, block: B:184:0x026c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x026e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0291  */
    /* JADX WARN: Code duplicated, block: B:190:0x0297  */
    /* JADX WARN: Code duplicated, block: B:192:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:203:0x030a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x030c  */
    /* JADX WARN: Code duplicated, block: B:207:0x0318  */
    /* JADX WARN: Code duplicated, block: B:210:0x032a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:211:0x032c  */
    /* JADX WARN: Code duplicated, block: B:212:0x032f  */
    /* JADX WARN: Code duplicated, block: B:213:0x0332  */
    /* JADX WARN: Code duplicated, block: B:219:0x0342  */
    /* JADX WARN: Code duplicated, block: B:222:0x034c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:223:0x034e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0353  */
    /* JADX WARN: Code duplicated, block: B:227:0x035b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0362  */
    /* JADX WARN: Code duplicated, block: B:230:0x0368  */
    /* JADX WARN: Code duplicated, block: B:233:0x036f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:234:0x0371  */
    /* JADX WARN: Code duplicated, block: B:236:0x0374 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:237:0x0376  */
    /* JADX WARN: Code duplicated, block: B:239:0x037c  */
    /* JADX WARN: Code duplicated, block: B:241:0x0382  */
    /* JADX WARN: Code duplicated, block: B:242:0x0385 A[PHI: r38
      0x0385: PHI (r38v3 long) = (r38v2 long), (r38v18 long) binds: [B:232:0x036d, B:240:0x0380] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:245:0x0390 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:246:0x0392  */
    /* JADX WARN: Code duplicated, block: B:249:0x0399 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:250:0x039b  */
    /* JADX WARN: Code duplicated, block: B:252:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:256:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:258:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:259:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:262:0x03c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:264:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:266:0x03c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:267:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:269:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:270:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:273:0x03dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:274:0x03df  */
    /* JADX WARN: Code duplicated, block: B:276:0x03e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:277:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:279:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:281:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:282:0x03f8 A[PHI: r38
      0x03f8: PHI (r38v7 long) = (r38v6 long), (r38v12 long) binds: [B:272:0x03db, B:280:0x03f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:285:0x0404 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:286:0x0406  */
    /* JADX WARN: Code duplicated, block: B:288:0x0414  */
    /* JADX WARN: Code duplicated, block: B:291:0x041d  */
    /* JADX WARN: Code duplicated, block: B:292:0x0424  */
    /* JADX WARN: Code duplicated, block: B:296:0x0433 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:297:0x0435  */
    /* JADX WARN: Code duplicated, block: B:299:0x0440  */
    /* JADX WARN: Code duplicated, block: B:302:0x0447  */
    /* JADX WARN: Code duplicated, block: B:303:0x044e  */
    /* JADX WARN: Code duplicated, block: B:306:0x0458  */
    /* JADX WARN: Code duplicated, block: B:308:0x0460  */
    /* JADX WARN: Code duplicated, block: B:311:0x0471 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:312:0x0473  */
    /* JADX WARN: Code duplicated, block: B:314:0x047c  */
    /* JADX WARN: Code duplicated, block: B:317:0x0485  */
    /* JADX WARN: Code duplicated, block: B:318:0x048c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0495 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:323:0x0497  */
    /* JADX WARN: Code duplicated, block: B:324:0x049a  */
    /* JADX WARN: Code duplicated, block: B:325:0x049d  */
    /* JADX WARN: Code duplicated, block: B:328:0x04a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:330:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:332:0x04ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:333:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:335:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:337:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:338:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:340:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:343:0x04cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:345:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:347:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:350:0x04df  */
    /* JADX WARN: Code duplicated, block: B:351:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:354:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:356:0x0519  */
    /* JADX WARN: Code duplicated, block: B:359:0x0529  */
    /* JADX WARN: Code duplicated, block: B:362:0x0534  */
    /* JADX WARN: Code duplicated, block: B:365:0x0544  */
    /* JADX WARN: Code duplicated, block: B:368:0x054f  */
    /* JADX WARN: Code duplicated, block: B:371:0x055a  */
    /* JADX WARN: Code duplicated, block: B:374:0x0565  */
    /* JADX WARN: Code duplicated, block: B:377:0x0570  */
    /* JADX WARN: Code duplicated, block: B:380:0x057b  */
    /* JADX WARN: Code duplicated, block: B:383:0x0588  */
    /* JADX WARN: Code duplicated, block: B:390:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0123  */
    /* JADX WARN: Code duplicated, block: B:73:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0131  */
    /* JADX WARN: Code duplicated, block: B:77:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x013a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0142  */
    /* JADX WARN: Code duplicated, block: B:83:0x014b  */
    /* JADX WARN: Code duplicated, block: B:84:0x014e A[PHI: r2
      0x014e: PHI (r2v32 long) = (r2v31 long), (r2v56 long) binds: [B:67:0x0118, B:81:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0159  */
    /* JADX WARN: Code duplicated, block: B:89:0x015c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0162  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:96:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0170  */
    /* JADX WARN: Code duplicated, block: B:99:0x0176  */
    protected void r() {
        long j;
        i6 i6Var;
        long j2;
        long j3;
        long j4;
        long j5;
        int iH0;
        View.OnClickListener onClickListener;
        int i;
        int i2;
        String str;
        int i3;
        View.OnLongClickListener onLongClickListener;
        int i4;
        boolean z;
        Drawable drawable;
        int i5;
        View.OnClickListener onClickListenerK0;
        View.OnClickListener onClickListenerJ0;
        int i6;
        ObservableField<Boolean> observableFieldS0;
        boolean z2;
        boolean zZ0;
        Boolean bool;
        boolean zK0;
        boolean z3;
        String str2;
        String str3;
        boolean z4;
        boolean z5;
        boolean z6;
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
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        ObservableField<Boolean> observableFieldR0;
        Boolean bool2;
        View.OnLongClickListener longListener;
        View.OnClickListener onClickListenerN0;
        Drawable drawableB;
        String str11;
        long j17;
        int i12;
        boolean z8;
        int i13;
        String str12;
        long j18;
        int i14;
        long j19;
        Integer numP0;
        long j20;
        boolean z9;
        long j21;
        boolean z10;
        long j22;
        long j23;
        androidx.databinding.u uVarO0;
        int i15;
        boolean z11;
        boolean z12;
        long j24;
        long j25;
        androidx.databinding.u uVarW0;
        ObservableBoolean observableBoolean;
        long j26;
        long j27;
        long j28;
        androidx.databinding.u uVarQ0;
        Boolean bool3;
        boolean zK2;
        long j29;
        ObservableField<String> observableFieldM0;
        ObservableField<String> observableFieldU0;
        Context context;
        int i16;
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
            long j30 = j & 20482;
            j3 = 137439084544L;
            if (j30 != 0) {
                ObservableBoolean observableBoolean2 = i6Var2 != null ? ((com.zentraedi.business.addfile.n) i6Var2).w : null;
                p1(1, observableBoolean2);
                boolean z13 = observableBoolean2 != null ? observableBoolean2.get() : false;
                if (j30 != 0) {
                    j |= z13 ? 68719476736L : 34359738368L;
                }
                if (z13) {
                    context = this.O.getContext();
                    i16 = com.zentraedi.comic.q.h.pI;
                } else {
                    context = this.O.getContext();
                    i16 = com.zentraedi.comic.q.h.qI;
                }
                drawableB = g.a.b(context, i16);
            } else {
                drawableB = null;
            }
            j4 = 274878169088L;
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
                j2 = 20500;
                p1(4, observableFieldU0);
                str11 = observableFieldM0 != null ? (String) observableFieldM0.get() : null;
                str3 = observableFieldU0 != null ? (String) observableFieldU0.get() : null;
            } else {
                j2 = 20500;
                str11 = null;
                str3 = null;
                zZ0 = false;
            }
            long j31 = j & 20488;
            if (j31 != 0) {
                observableFieldS0 = i6Var2 != null ? i6Var2.s0() : null;
                p1(3, observableFieldS0);
                bool = observableFieldS0 != null ? (Boolean) observableFieldS0.get() : null;
                zK0 = androidx.databinding.c0.K0(bool);
                if (j31 != 0) {
                    j = zK0 ? j | 274878169088L : j | 137439084544L;
                }
                i6 = zK0 ? 0 : 8;
                i = zK0 ? 8 : 0;
                j17 = j & 20512;
                if (j17 == 0) {
                    i12 = 0;
                } else {
                    if (i6Var2 != null) {
                        uVarQ0 = i6Var2.q0();
                    } else {
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
                            j29 = 70368744177664L;
                        } else {
                            j29 = 35184372088832L;
                        }
                        j |= j29;
                    }
                    if (zK2) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                }
                if ((j & 22600) != 0) {
                    if (i6Var2 != null) {
                        observableBoolean = ((com.zentraedi.business.addfile.n) i6Var2).x;
                    } else {
                        observableBoolean = null;
                    }
                    p1(6, observableBoolean);
                    if (observableBoolean != null) {
                        z8 = observableBoolean.get();
                    } else {
                        z8 = false;
                    }
                    if ((j & 22592) != 0) {
                        if (z8) {
                            j28 = 65536;
                        } else {
                            j28 = 32768;
                        }
                        j |= j28;
                    }
                    if ((j & 20552) != 0) {
                        if (z8) {
                            j27 = 17592186044416L;
                        } else {
                            j27 = 8796093022208L;
                        }
                        j |= j27;
                    }
                    if ((j & 20544) != 0) {
                        if (z8) {
                            j26 = 281474976710656L;
                        } else {
                            j26 = 140737488355328L;
                        }
                        j |= j26;
                    }
                    if ((j & 20544) == 0 && !z8) {
                        i13 = 8;
                    }
                    if ((j & 21633) == 0) {
                        str12 = null;
                    } else {
                        if (i6Var2 != null) {
                            uVarW0 = i6Var2.w0();
                        } else {
                            uVarW0 = null;
                        }
                        p1(7, uVarW0);
                        if (uVarW0 != null) {
                            str12 = (String) uVarW0.get();
                        } else {
                            str12 = null;
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
                            i15 = uVarO0.get();
                        } else {
                            i15 = 0;
                        }
                        if (i15 == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i15 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (j18 != 0) {
                            if (z11) {
                                j25 = 17179869184L;
                            } else {
                                j25 = 8589934592L;
                            }
                            j |= j25;
                        }
                        if ((j & 20992) != 0) {
                            if (z12) {
                                j24 = 1073741824;
                            } else {
                                j24 = 536870912;
                            }
                            j |= j24;
                        }
                        if (z11) {
                            i5 = 0;
                        } else {
                            i5 = 8;
                        }
                        if (z12) {
                            i14 = 0;
                        } else {
                            i14 = 8;
                        }
                    } else {
                        i14 = 0;
                        i5 = 0;
                    }
                    j19 = j & 21889;
                    if (j19 != 0) {
                        if (i6Var2 != null) {
                            numP0 = i6Var2.p0();
                        } else {
                            numP0 = null;
                        }
                        i6Var = i6Var2;
                        iH0 = androidx.databinding.c0.H0(numP0);
                        j20 = j;
                        if (iH0 == 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (j19 != 0) {
                            if (z9) {
                                j23 = 4194304;
                            } else {
                                j23 = 2097152;
                            }
                            j20 |= j23;
                        }
                        j21 = j20 & 20736;
                        if (j21 != 0) {
                            if (iH0 != 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (j21 != 0) {
                                if (z10) {
                                    j22 = 4398046511104L;
                                } else {
                                    j22 = 2199023255552L;
                                }
                                j20 |= j22;
                            }
                            View.OnClickListener onClickListener2 = onClickListenerN0;
                            z2 = z9;
                            onClickListener = onClickListener2;
                            str3 = str3;
                            onClickListenerK0 = onClickListenerK0;
                            onClickListenerJ0 = onClickListenerJ0;
                            i = i;
                            z3 = z10;
                            j5 = j20;
                        } else {
                            View.OnClickListener onClickListener3 = onClickListenerN0;
                            z2 = z9;
                            onClickListener = onClickListener3;
                            j5 = j20;
                        }
                        str2 = str11;
                        drawable = drawableB;
                        z = z8;
                        i4 = i14;
                        onLongClickListener = longListener;
                        i3 = i12;
                        str = str12;
                        i2 = i13;
                    } else {
                        i6Var = i6Var2;
                        long j32 = j;
                        onClickListener = onClickListenerN0;
                        j5 = j32;
                        iH0 = 0;
                        z2 = false;
                    }
                    z3 = false;
                    str2 = str11;
                    drawable = drawableB;
                    z = z8;
                    i4 = i14;
                    onLongClickListener = longListener;
                    i3 = i12;
                    str = str12;
                    i2 = i13;
                } else {
                    z8 = false;
                }
                i13 = 0;
                if ((j & 21633) == 0) {
                    str12 = null;
                } else {
                    if (i6Var2 != null) {
                        uVarW0 = i6Var2.w0();
                    } else {
                        uVarW0 = null;
                    }
                    p1(7, uVarW0);
                    if (uVarW0 != null) {
                        str12 = (String) uVarW0.get();
                    } else {
                        str12 = null;
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
                        i15 = uVarO0.get();
                    } else {
                        i15 = 0;
                    }
                    if (i15 == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i15 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (j18 != 0) {
                        if (z11) {
                            j25 = 17179869184L;
                        } else {
                            j25 = 8589934592L;
                        }
                        j |= j25;
                    }
                    if ((j & 20992) != 0) {
                        if (z12) {
                            j24 = 1073741824;
                        } else {
                            j24 = 536870912;
                        }
                        j |= j24;
                    }
                    if (z11) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    if (z12) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                } else {
                    i14 = 0;
                    i5 = 0;
                }
                j19 = j & 21889;
                if (j19 != 0) {
                    if (i6Var2 != null) {
                        numP0 = i6Var2.p0();
                    } else {
                        numP0 = null;
                    }
                    i6Var = i6Var2;
                    iH0 = androidx.databinding.c0.H0(numP0);
                    j20 = j;
                    if (iH0 == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (j19 != 0) {
                        if (z9) {
                            j23 = 4194304;
                        } else {
                            j23 = 2097152;
                        }
                        j20 |= j23;
                    }
                    j21 = j20 & 20736;
                    if (j21 != 0) {
                        if (iH0 != 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (j21 != 0) {
                            if (z10) {
                                j22 = 4398046511104L;
                            } else {
                                j22 = 2199023255552L;
                            }
                            j20 |= j22;
                        }
                        View.OnClickListener onClickListener4 = onClickListenerN0;
                        z2 = z9;
                        onClickListener = onClickListener4;
                        str3 = str3;
                        onClickListenerK0 = onClickListenerK0;
                        onClickListenerJ0 = onClickListenerJ0;
                        i = i;
                        z3 = z10;
                        j5 = j20;
                    } else {
                        View.OnClickListener onClickListener5 = onClickListenerN0;
                        z2 = z9;
                        onClickListener = onClickListener5;
                        j5 = j20;
                    }
                    str2 = str11;
                    drawable = drawableB;
                    z = z8;
                    i4 = i14;
                    onLongClickListener = longListener;
                    i3 = i12;
                    str = str12;
                    i2 = i13;
                } else {
                    i6Var = i6Var2;
                    long j33 = j;
                    onClickListener = onClickListenerN0;
                    j5 = j33;
                    iH0 = 0;
                    z2 = false;
                }
                z3 = false;
                str2 = str11;
                drawable = drawableB;
                z = z8;
                i4 = i14;
                onLongClickListener = longListener;
                i3 = i12;
                str = str12;
                i2 = i13;
            } else {
                i6 = 0;
                observableFieldS0 = null;
                bool = null;
                zK0 = false;
            }
            j17 = j & 20512;
            if (j17 == 0) {
                i12 = 0;
            } else {
                if (i6Var2 != null) {
                    uVarQ0 = i6Var2.q0();
                } else {
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
                        j29 = 70368744177664L;
                    } else {
                        j29 = 35184372088832L;
                    }
                    j |= j29;
                }
                if (zK2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
            }
            if ((j & 22600) != 0) {
                if (i6Var2 != null) {
                    observableBoolean = ((com.zentraedi.business.addfile.n) i6Var2).x;
                } else {
                    observableBoolean = null;
                }
                p1(6, observableBoolean);
                if (observableBoolean != null) {
                    z8 = observableBoolean.get();
                } else {
                    z8 = false;
                }
                if ((j & 22592) != 0) {
                    if (z8) {
                        j28 = 65536;
                    } else {
                        j28 = 32768;
                    }
                    j |= j28;
                }
                if ((j & 20552) != 0) {
                    if (z8) {
                        j27 = 17592186044416L;
                    } else {
                        j27 = 8796093022208L;
                    }
                    j |= j27;
                }
                if ((j & 20544) != 0) {
                    if (z8) {
                        j26 = 281474976710656L;
                    } else {
                        j26 = 140737488355328L;
                    }
                    j |= j26;
                }
                if ((j & 20544) == 0) {
                }
                if ((j & 21633) == 0) {
                    str12 = null;
                } else {
                    if (i6Var2 != null) {
                        uVarW0 = i6Var2.w0();
                    } else {
                        uVarW0 = null;
                    }
                    p1(7, uVarW0);
                    if (uVarW0 != null) {
                        str12 = (String) uVarW0.get();
                    } else {
                        str12 = null;
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
                        i15 = uVarO0.get();
                    } else {
                        i15 = 0;
                    }
                    if (i15 == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i15 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (j18 != 0) {
                        if (z11) {
                            j25 = 17179869184L;
                        } else {
                            j25 = 8589934592L;
                        }
                        j |= j25;
                    }
                    if ((j & 20992) != 0) {
                        if (z12) {
                            j24 = 1073741824;
                        } else {
                            j24 = 536870912;
                        }
                        j |= j24;
                    }
                    if (z11) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    if (z12) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                } else {
                    i14 = 0;
                    i5 = 0;
                }
                j19 = j & 21889;
                if (j19 != 0) {
                    if (i6Var2 != null) {
                        numP0 = i6Var2.p0();
                    } else {
                        numP0 = null;
                    }
                    i6Var = i6Var2;
                    iH0 = androidx.databinding.c0.H0(numP0);
                    j20 = j;
                    if (iH0 == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (j19 != 0) {
                        if (z9) {
                            j23 = 4194304;
                        } else {
                            j23 = 2097152;
                        }
                        j20 |= j23;
                    }
                    j21 = j20 & 20736;
                    if (j21 != 0) {
                        if (iH0 != 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (j21 != 0) {
                            if (z10) {
                                j22 = 4398046511104L;
                            } else {
                                j22 = 2199023255552L;
                            }
                            j20 |= j22;
                        }
                        View.OnClickListener onClickListener6 = onClickListenerN0;
                        z2 = z9;
                        onClickListener = onClickListener6;
                        str3 = str3;
                        onClickListenerK0 = onClickListenerK0;
                        onClickListenerJ0 = onClickListenerJ0;
                        i = i;
                        z3 = z10;
                        j5 = j20;
                    } else {
                        View.OnClickListener onClickListener7 = onClickListenerN0;
                        z2 = z9;
                        onClickListener = onClickListener7;
                        j5 = j20;
                    }
                    str2 = str11;
                    drawable = drawableB;
                    z = z8;
                    i4 = i14;
                    onLongClickListener = longListener;
                    i3 = i12;
                    str = str12;
                    i2 = i13;
                } else {
                    i6Var = i6Var2;
                    long j34 = j;
                    onClickListener = onClickListenerN0;
                    j5 = j34;
                    iH0 = 0;
                    z2 = false;
                }
                z3 = false;
                str2 = str11;
                drawable = drawableB;
                z = z8;
                i4 = i14;
                onLongClickListener = longListener;
                i3 = i12;
                str = str12;
                i2 = i13;
            } else {
                z8 = false;
            }
            i13 = 0;
            if ((j & 21633) == 0) {
                str12 = null;
            } else {
                if (i6Var2 != null) {
                    uVarW0 = i6Var2.w0();
                } else {
                    uVarW0 = null;
                }
                p1(7, uVarW0);
                if (uVarW0 != null) {
                    str12 = (String) uVarW0.get();
                } else {
                    str12 = null;
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
                    i15 = uVarO0.get();
                } else {
                    i15 = 0;
                }
                if (i15 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i15 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (j18 != 0) {
                    if (z11) {
                        j25 = 17179869184L;
                    } else {
                        j25 = 8589934592L;
                    }
                    j |= j25;
                }
                if ((j & 20992) != 0) {
                    if (z12) {
                        j24 = 1073741824;
                    } else {
                        j24 = 536870912;
                    }
                    j |= j24;
                }
                if (z11) {
                    i5 = 0;
                } else {
                    i5 = 8;
                }
                if (z12) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
            } else {
                i14 = 0;
                i5 = 0;
            }
            j19 = j & 21889;
            if (j19 != 0) {
                if (i6Var2 != null) {
                    numP0 = i6Var2.p0();
                } else {
                    numP0 = null;
                }
                i6Var = i6Var2;
                iH0 = androidx.databinding.c0.H0(numP0);
                j20 = j;
                if (iH0 == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (j19 != 0) {
                    if (z9) {
                        j23 = 4194304;
                    } else {
                        j23 = 2097152;
                    }
                    j20 |= j23;
                }
                j21 = j20 & 20736;
                if (j21 != 0) {
                    if (iH0 != 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (j21 != 0) {
                        if (z10) {
                            j22 = 4398046511104L;
                        } else {
                            j22 = 2199023255552L;
                        }
                        j20 |= j22;
                    }
                    View.OnClickListener onClickListener8 = onClickListenerN0;
                    z2 = z9;
                    onClickListener = onClickListener8;
                    str3 = str3;
                    onClickListenerK0 = onClickListenerK0;
                    onClickListenerJ0 = onClickListenerJ0;
                    i = i;
                    z3 = z10;
                    j5 = j20;
                } else {
                    View.OnClickListener onClickListener9 = onClickListenerN0;
                    z2 = z9;
                    onClickListener = onClickListener9;
                    j5 = j20;
                }
                str2 = str11;
                drawable = drawableB;
                z = z8;
                i4 = i14;
                onLongClickListener = longListener;
                i3 = i12;
                str = str12;
                i2 = i13;
            } else {
                i6Var = i6Var2;
                long j35 = j;
                onClickListener = onClickListenerN0;
                j5 = j35;
                iH0 = 0;
                z2 = false;
            }
            z3 = false;
            str2 = str11;
            drawable = drawableB;
            z = z8;
            i4 = i14;
            onLongClickListener = longListener;
            i3 = i12;
            str = str12;
            i2 = i13;
        } else {
            i6Var = i6Var2;
            j2 = 20500;
            j3 = 137439084544L;
            j4 = 274878169088L;
            j5 = j;
            iH0 = 0;
            onClickListener = null;
            i = 0;
            i2 = 0;
            str = null;
            i3 = 0;
            onLongClickListener = null;
            i4 = 0;
            z = false;
            drawable = null;
            i5 = 0;
            onClickListenerK0 = null;
            onClickListenerJ0 = null;
            i6 = 0;
            observableFieldS0 = null;
            z2 = false;
            zZ0 = false;
            bool = null;
            zK0 = false;
            z3 = false;
            str2 = null;
            str3 = null;
        }
        if ((j5 & 4398046511104L) != 0) {
            z4 = z;
            z5 = iH0 != 6;
            if ((j5 & 8796093022208L) != 0) {
                if (i6Var != null) {
                    observableFieldS0 = i6Var.s0();
                }
                z6 = z5;
                p1(3, observableFieldS0);
                if (observableFieldS0 != null) {
                    bool = (Boolean) observableFieldS0.get();
                }
                zK0 = androidx.databinding.c0.K0(bool);
                if ((j5 & 20488) != 0) {
                    if (zK0) {
                        j5 |= j4;
                    } else {
                        j5 |= j3;
                    }
                }
            } else {
                z6 = z5;
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
                if (z4) {
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
                if (z2) {
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
                if (!z3) {
                    z6 = false;
                }
                if (j7 != 0) {
                    if (z6) {
                        j13 = 67108864;
                    } else {
                        j13 = 33554432;
                    }
                    j5 |= j13;
                }
            } else {
                z6 = false;
            }
            j8 = j5 & 20552;
            if (j8 == 0) {
                i8 = 0;
            } else {
                if (z4) {
                    zK0 = true;
                }
                if (j8 != 0) {
                    if (zK0) {
                        j12 = 1099511627776L;
                    } else {
                        j12 = 549755813888L;
                    }
                    j5 |= j12;
                }
                if (zK0) {
                    i8 = 8;
                } else {
                    i8 = 0;
                }
            }
            if ((j5 & 2164260864L) != 0) {
                if (i6Var != null) {
                    uVarL0 = i6Var.l0();
                } else {
                    uVarL0 = null;
                }
                i9 = i5;
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
                            str9 = null;
                        } else if (z7) {
                            str9 = str5;
                        } else {
                            str9 = str7;
                        }
                        j9 = j5 & 20736;
                        if (j9 != 0) {
                            if (!z6) {
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
                            if (!z7) {
                                str8 = str5;
                            }
                            str10 = str8;
                        } else {
                            str10 = null;
                        }
                        if ((j5 & 20480) != 0) {
                            this.I.setOnClickListener(onClickListenerJ0);
                            this.I.setOnLongClickListener(onLongClickListener);
                            this.L.setOnClickListener(onClickListenerK0);
                            this.P.setOnClickListener(onClickListener);
                        }
                        if ((j5 & j2) != 0) {
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
                            this.M.setVisibility(i6);
                            this.V.setVisibility(i);
                        }
                        if ((j5 & 20482) != 0) {
                            androidx.databinding.adapters.p.a(this.O, drawable);
                        }
                        if ((j5 & 20544) != 0) {
                            this.O.setVisibility(i2);
                        }
                        if ((j5 & 22592) != 0) {
                            this.P.setVisibility(i7);
                        }
                        if ((j5 & 20512) != 0) {
                            this.Q.setVisibility(i3);
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
                        str9 = null;
                    } else if (z7) {
                        str9 = str5;
                    } else {
                        str9 = str7;
                    }
                    j9 = j5 & 20736;
                    if (j9 != 0) {
                        if (!z6) {
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
                        if (!z7) {
                            str8 = str5;
                        }
                        str10 = str8;
                    } else {
                        str10 = null;
                    }
                    if ((j5 & 20480) != 0) {
                        this.I.setOnClickListener(onClickListenerJ0);
                        this.I.setOnLongClickListener(onLongClickListener);
                        this.L.setOnClickListener(onClickListenerK0);
                        this.P.setOnClickListener(onClickListener);
                    }
                    if ((j5 & j2) != 0) {
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
                        this.M.setVisibility(i6);
                        this.V.setVisibility(i);
                    }
                    if ((j5 & 20482) != 0) {
                        androidx.databinding.adapters.p.a(this.O, drawable);
                    }
                    if ((j5 & 20544) != 0) {
                        this.O.setVisibility(i2);
                    }
                    if ((j5 & 22592) != 0) {
                        this.P.setVisibility(i7);
                    }
                    if ((j5 & 20512) != 0) {
                        this.Q.setVisibility(i3);
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
                        str9 = null;
                    } else if (z7) {
                        str9 = str5;
                    } else {
                        str9 = str7;
                    }
                    j9 = j5 & 20736;
                    if (j9 != 0) {
                        if (!z6) {
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
                        if (!z7) {
                            str8 = str5;
                        }
                        str10 = str8;
                    } else {
                        str10 = null;
                    }
                    if ((j5 & 20480) != 0) {
                        this.I.setOnClickListener(onClickListenerJ0);
                        this.I.setOnLongClickListener(onLongClickListener);
                        this.L.setOnClickListener(onClickListenerK0);
                        this.P.setOnClickListener(onClickListener);
                    }
                    if ((j5 & j2) != 0) {
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
                        this.M.setVisibility(i6);
                        this.V.setVisibility(i);
                    }
                    if ((j5 & 20482) != 0) {
                        androidx.databinding.adapters.p.a(this.O, drawable);
                    }
                    if ((j5 & 20544) != 0) {
                        this.O.setVisibility(i2);
                    }
                    if ((j5 & 22592) != 0) {
                        this.P.setVisibility(i7);
                    }
                    if ((j5 & 20512) != 0) {
                        this.Q.setVisibility(i3);
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
                    str9 = null;
                } else if (z7) {
                    str9 = str5;
                } else {
                    str9 = str7;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z6) {
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
                    if (!z7) {
                        str8 = str5;
                    }
                    str10 = str8;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(onLongClickListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListener);
                }
                if ((j5 & j2) != 0) {
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
                    this.M.setVisibility(i6);
                    this.V.setVisibility(i);
                }
                if ((j5 & 20482) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawable);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i2);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i3);
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
            z7 = z7;
            i9 = i5;
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
                        str9 = null;
                    } else if (z7) {
                        str9 = str5;
                    } else {
                        str9 = str7;
                    }
                    j9 = j5 & 20736;
                    if (j9 != 0) {
                        if (!z6) {
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
                        if (!z7) {
                            str8 = str5;
                        }
                        str10 = str8;
                    } else {
                        str10 = null;
                    }
                    if ((j5 & 20480) != 0) {
                        this.I.setOnClickListener(onClickListenerJ0);
                        this.I.setOnLongClickListener(onLongClickListener);
                        this.L.setOnClickListener(onClickListenerK0);
                        this.P.setOnClickListener(onClickListener);
                    }
                    if ((j5 & j2) != 0) {
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
                        this.M.setVisibility(i6);
                        this.V.setVisibility(i);
                    }
                    if ((j5 & 20482) != 0) {
                        androidx.databinding.adapters.p.a(this.O, drawable);
                    }
                    if ((j5 & 20544) != 0) {
                        this.O.setVisibility(i2);
                    }
                    if ((j5 & 22592) != 0) {
                        this.P.setVisibility(i7);
                    }
                    if ((j5 & 20512) != 0) {
                        this.Q.setVisibility(i3);
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
                    str9 = null;
                } else if (z7) {
                    str9 = str5;
                } else {
                    str9 = str7;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z6) {
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
                    if (!z7) {
                        str8 = str5;
                    }
                    str10 = str8;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(onLongClickListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListener);
                }
                if ((j5 & j2) != 0) {
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
                    this.M.setVisibility(i6);
                    this.V.setVisibility(i);
                }
                if ((j5 & 20482) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawable);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i2);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i3);
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
                    str9 = null;
                } else if (z7) {
                    str9 = str5;
                } else {
                    str9 = str7;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z6) {
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
                    if (!z7) {
                        str8 = str5;
                    }
                    str10 = str8;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(onLongClickListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListener);
                }
                if ((j5 & j2) != 0) {
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
                    this.M.setVisibility(i6);
                    this.V.setVisibility(i);
                }
                if ((j5 & 20482) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawable);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i2);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i3);
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
                str9 = null;
            } else if (z7) {
                str9 = str5;
            } else {
                str9 = str7;
            }
            j9 = j5 & 20736;
            if (j9 != 0) {
                if (!z6) {
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
                if (!z7) {
                    str8 = str5;
                }
                str10 = str8;
            } else {
                str10 = null;
            }
            if ((j5 & 20480) != 0) {
                this.I.setOnClickListener(onClickListenerJ0);
                this.I.setOnLongClickListener(onLongClickListener);
                this.L.setOnClickListener(onClickListenerK0);
                this.P.setOnClickListener(onClickListener);
            }
            if ((j5 & j2) != 0) {
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
                this.M.setVisibility(i6);
                this.V.setVisibility(i);
            }
            if ((j5 & 20482) != 0) {
                androidx.databinding.adapters.p.a(this.O, drawable);
            }
            if ((j5 & 20544) != 0) {
                this.O.setVisibility(i2);
            }
            if ((j5 & 22592) != 0) {
                this.P.setVisibility(i7);
            }
            if ((j5 & 20512) != 0) {
                this.Q.setVisibility(i3);
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
        z4 = z;
        if ((j5 & 8796093022208L) != 0) {
            if (i6Var != null) {
                observableFieldS0 = i6Var.s0();
            }
            z6 = z5;
            p1(3, observableFieldS0);
            if (observableFieldS0 != null) {
                bool = (Boolean) observableFieldS0.get();
            }
            zK0 = androidx.databinding.c0.K0(bool);
            if ((j5 & 20488) != 0) {
                if (zK0) {
                    j5 |= j4;
                } else {
                    j5 |= j3;
                }
            }
        } else {
            z6 = z5;
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
            if (z4) {
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
            if (z2) {
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
            if (!z3) {
                z6 = false;
            }
            if (j7 != 0) {
                if (z6) {
                    j13 = 67108864;
                } else {
                    j13 = 33554432;
                }
                j5 |= j13;
            }
        } else {
            z6 = false;
        }
        j8 = j5 & 20552;
        if (j8 == 0) {
            i8 = 0;
        } else {
            if (z4) {
                zK0 = true;
            }
            if (j8 != 0) {
                if (zK0) {
                    j12 = 1099511627776L;
                } else {
                    j12 = 549755813888L;
                }
                j5 |= j12;
            }
            if (zK0) {
                i8 = 8;
            } else {
                i8 = 0;
            }
        }
        if ((j5 & 2164260864L) != 0) {
            if (i6Var != null) {
                uVarL0 = i6Var.l0();
            } else {
                uVarL0 = null;
            }
            i9 = i5;
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
                        str9 = null;
                    } else if (z7) {
                        str9 = str5;
                    } else {
                        str9 = str7;
                    }
                    j9 = j5 & 20736;
                    if (j9 != 0) {
                        if (!z6) {
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
                        if (!z7) {
                            str8 = str5;
                        }
                        str10 = str8;
                    } else {
                        str10 = null;
                    }
                    if ((j5 & 20480) != 0) {
                        this.I.setOnClickListener(onClickListenerJ0);
                        this.I.setOnLongClickListener(onLongClickListener);
                        this.L.setOnClickListener(onClickListenerK0);
                        this.P.setOnClickListener(onClickListener);
                    }
                    if ((j5 & j2) != 0) {
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
                        this.M.setVisibility(i6);
                        this.V.setVisibility(i);
                    }
                    if ((j5 & 20482) != 0) {
                        androidx.databinding.adapters.p.a(this.O, drawable);
                    }
                    if ((j5 & 20544) != 0) {
                        this.O.setVisibility(i2);
                    }
                    if ((j5 & 22592) != 0) {
                        this.P.setVisibility(i7);
                    }
                    if ((j5 & 20512) != 0) {
                        this.Q.setVisibility(i3);
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
                    str9 = null;
                } else if (z7) {
                    str9 = str5;
                } else {
                    str9 = str7;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z6) {
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
                    if (!z7) {
                        str8 = str5;
                    }
                    str10 = str8;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(onLongClickListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListener);
                }
                if ((j5 & j2) != 0) {
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
                    this.M.setVisibility(i6);
                    this.V.setVisibility(i);
                }
                if ((j5 & 20482) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawable);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i2);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i3);
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
                    str9 = null;
                } else if (z7) {
                    str9 = str5;
                } else {
                    str9 = str7;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z6) {
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
                    if (!z7) {
                        str8 = str5;
                    }
                    str10 = str8;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(onLongClickListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListener);
                }
                if ((j5 & j2) != 0) {
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
                    this.M.setVisibility(i6);
                    this.V.setVisibility(i);
                }
                if ((j5 & 20482) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawable);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i2);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i3);
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
                str9 = null;
            } else if (z7) {
                str9 = str5;
            } else {
                str9 = str7;
            }
            j9 = j5 & 20736;
            if (j9 != 0) {
                if (!z6) {
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
                if (!z7) {
                    str8 = str5;
                }
                str10 = str8;
            } else {
                str10 = null;
            }
            if ((j5 & 20480) != 0) {
                this.I.setOnClickListener(onClickListenerJ0);
                this.I.setOnLongClickListener(onLongClickListener);
                this.L.setOnClickListener(onClickListenerK0);
                this.P.setOnClickListener(onClickListener);
            }
            if ((j5 & j2) != 0) {
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
                this.M.setVisibility(i6);
                this.V.setVisibility(i);
            }
            if ((j5 & 20482) != 0) {
                androidx.databinding.adapters.p.a(this.O, drawable);
            }
            if ((j5 & 20544) != 0) {
                this.O.setVisibility(i2);
            }
            if ((j5 & 22592) != 0) {
                this.P.setVisibility(i7);
            }
            if ((j5 & 20512) != 0) {
                this.Q.setVisibility(i3);
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
        z7 = z7;
        i9 = i5;
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
                    str9 = null;
                } else if (z7) {
                    str9 = str5;
                } else {
                    str9 = str7;
                }
                j9 = j5 & 20736;
                if (j9 != 0) {
                    if (!z6) {
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
                    if (!z7) {
                        str8 = str5;
                    }
                    str10 = str8;
                } else {
                    str10 = null;
                }
                if ((j5 & 20480) != 0) {
                    this.I.setOnClickListener(onClickListenerJ0);
                    this.I.setOnLongClickListener(onLongClickListener);
                    this.L.setOnClickListener(onClickListenerK0);
                    this.P.setOnClickListener(onClickListener);
                }
                if ((j5 & j2) != 0) {
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
                    this.M.setVisibility(i6);
                    this.V.setVisibility(i);
                }
                if ((j5 & 20482) != 0) {
                    androidx.databinding.adapters.p.a(this.O, drawable);
                }
                if ((j5 & 20544) != 0) {
                    this.O.setVisibility(i2);
                }
                if ((j5 & 22592) != 0) {
                    this.P.setVisibility(i7);
                }
                if ((j5 & 20512) != 0) {
                    this.Q.setVisibility(i3);
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
                str9 = null;
            } else if (z7) {
                str9 = str5;
            } else {
                str9 = str7;
            }
            j9 = j5 & 20736;
            if (j9 != 0) {
                if (!z6) {
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
                if (!z7) {
                    str8 = str5;
                }
                str10 = str8;
            } else {
                str10 = null;
            }
            if ((j5 & 20480) != 0) {
                this.I.setOnClickListener(onClickListenerJ0);
                this.I.setOnLongClickListener(onLongClickListener);
                this.L.setOnClickListener(onClickListenerK0);
                this.P.setOnClickListener(onClickListener);
            }
            if ((j5 & j2) != 0) {
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
                this.M.setVisibility(i6);
                this.V.setVisibility(i);
            }
            if ((j5 & 20482) != 0) {
                androidx.databinding.adapters.p.a(this.O, drawable);
            }
            if ((j5 & 20544) != 0) {
                this.O.setVisibility(i2);
            }
            if ((j5 & 22592) != 0) {
                this.P.setVisibility(i7);
            }
            if ((j5 & 20512) != 0) {
                this.Q.setVisibility(i3);
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
                str9 = null;
            } else if (z7) {
                str9 = str5;
            } else {
                str9 = str7;
            }
            j9 = j5 & 20736;
            if (j9 != 0) {
                if (!z6) {
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
                if (!z7) {
                    str8 = str5;
                }
                str10 = str8;
            } else {
                str10 = null;
            }
            if ((j5 & 20480) != 0) {
                this.I.setOnClickListener(onClickListenerJ0);
                this.I.setOnLongClickListener(onLongClickListener);
                this.L.setOnClickListener(onClickListenerK0);
                this.P.setOnClickListener(onClickListener);
            }
            if ((j5 & j2) != 0) {
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
                this.M.setVisibility(i6);
                this.V.setVisibility(i);
            }
            if ((j5 & 20482) != 0) {
                androidx.databinding.adapters.p.a(this.O, drawable);
            }
            if ((j5 & 20544) != 0) {
                this.O.setVisibility(i2);
            }
            if ((j5 & 22592) != 0) {
                this.P.setVisibility(i7);
            }
            if ((j5 & 20512) != 0) {
                this.Q.setVisibility(i3);
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
            str9 = null;
        } else if (z7) {
            str9 = str5;
        } else {
            str9 = str7;
        }
        j9 = j5 & 20736;
        if (j9 != 0) {
            if (!z6) {
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
            if (!z7) {
                str8 = str5;
            }
            str10 = str8;
        } else {
            str10 = null;
        }
        if ((j5 & 20480) != 0) {
            this.I.setOnClickListener(onClickListenerJ0);
            this.I.setOnLongClickListener(onLongClickListener);
            this.L.setOnClickListener(onClickListenerK0);
            this.P.setOnClickListener(onClickListener);
        }
        if ((j5 & j2) != 0) {
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
            this.M.setVisibility(i6);
            this.V.setVisibility(i);
        }
        if ((j5 & 20482) != 0) {
            androidx.databinding.adapters.p.a(this.O, drawable);
        }
        if ((j5 & 20544) != 0) {
            this.O.setVisibility(i2);
        }
        if ((j5 & 22592) != 0) {
            this.P.setVisibility(i7);
        }
        if ((j5 & 20512) != 0) {
            this.Q.setVisibility(i3);
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

    private r3(androidx.databinding.l lVar, View view, Object[] objArr) {
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
