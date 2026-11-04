package com.zentraedi.comic.databinding;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.databinding.ObservableField;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.comic.viewmodel.ComicApplyScope;
import com.zentraedi.comic.viewmodel.PageOver;
import com.zentraedi.comic.viewmodel.PageTurning;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class y3 extends x3 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i P2 = null;

    @androidx.annotation.p0
    private static final SparseIntArray Q2;

    @androidx.annotation.n0
    private final LinearLayout M;

    @androidx.annotation.p0
    private final View.OnClickListener M1;
    private long M2;

    @androidx.annotation.n0
    private final TextView N;

    @androidx.annotation.n0
    private final TextView O;

    @androidx.annotation.n0
    private final TextView P;

    @androidx.annotation.n0
    private final LinearLayout Q;

    @androidx.annotation.n0
    private final TextView R;

    @androidx.annotation.n0
    private final TextView S;

    @androidx.annotation.n0
    private final TextView T;

    @androidx.annotation.n0
    private final TextView U;

    @androidx.annotation.n0
    private final TextView V;

    @androidx.annotation.n0
    private final TextView W;

    @androidx.annotation.n0
    private final TextView X;

    @androidx.annotation.n0
    private final TextView Y;

    @androidx.annotation.n0
    private final TextView Z;

    @androidx.annotation.n0
    private final TextView a0;

    @androidx.annotation.p0
    private final View.OnClickListener a1;
    private long a2;

    @androidx.annotation.p0
    private final View.OnClickListener b0;

    @androidx.annotation.p0
    private final View.OnClickListener c0;

    @androidx.annotation.p0
    private final View.OnClickListener d0;

    @androidx.annotation.p0
    private final View.OnClickListener e0;

    @androidx.annotation.p0
    private final View.OnClickListener f0;

    @androidx.annotation.p0
    private final View.OnClickListener g0;

    @androidx.annotation.p0
    private final View.OnClickListener h0;

    @androidx.annotation.p0
    private final View.OnClickListener i0;

    @androidx.annotation.p0
    private final View.OnClickListener j0;

    @androidx.annotation.p0
    private final View.OnClickListener k0;

    @androidx.annotation.p0
    private final View.OnClickListener l0;

    @androidx.annotation.p0
    private final View.OnClickListener m0;

    @androidx.annotation.p0
    private final View.OnClickListener n0;

    @androidx.annotation.p0
    private final View.OnClickListener r1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q2 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.pP, 18);
        sparseIntArray.put(com.zentraedi.comic.q.i.Sq, 19);
        sparseIntArray.put(com.zentraedi.comic.q.i.G6, 20);
        sparseIntArray.put(com.zentraedi.comic.q.i.Uk, 21);
    }

    public y3(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 22, P2, Q2));
    }

    private boolean D1(ObservableField<ComicApplyScope> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a2 |= 4;
        }
        return true;
    }

    private boolean E1(ObservableField<Integer> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a2 |= 8;
        }
        return true;
    }

    private boolean F1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a2 |= 64;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a2 |= 128;
        }
        return true;
    }

    private boolean I1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a2 |= 1;
        }
        return true;
    }

    private boolean J1(ObservableField<Integer> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a2 |= 32;
        }
        return true;
    }

    private boolean K1(ObservableField<PageOver> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a2 |= 16;
        }
        return true;
    }

    private boolean L1(ObservableField<PageTurning> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a2 |= 2;
        }
        return true;
    }

    private boolean N1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a2 |= 256;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.x3
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.t4 t4Var) {
        this.L = t4Var;
        synchronized (this) {
            this.a2 |= 512;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.B4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        switch (i) {
            case 1:
                com.zentraedi.comic.viewmodel.t4 t4Var = this.L;
                if (t4Var != null) {
                    t4Var.x0();
                }
                break;
            case 2:
                com.zentraedi.comic.viewmodel.t4 t4Var2 = this.L;
                if (t4Var2 != null) {
                    t4Var2.y0();
                }
                break;
            case 3:
                com.zentraedi.comic.viewmodel.t4 t4Var3 = this.L;
                if (t4Var3 != null) {
                    t4Var3.D0(5);
                }
                break;
            case 4:
                com.zentraedi.comic.viewmodel.t4 t4Var4 = this.L;
                if (t4Var4 != null) {
                    t4Var4.D0(10);
                }
                break;
            case 5:
                com.zentraedi.comic.viewmodel.t4 t4Var5 = this.L;
                if (t4Var5 != null) {
                    t4Var5.D0(IntCompanionObject.MAX_VALUE);
                }
                break;
            case 6:
                com.zentraedi.comic.viewmodel.t4 t4Var6 = this.L;
                if (t4Var6 != null) {
                    t4Var6.D0(0);
                }
                break;
            case 7:
                com.zentraedi.comic.viewmodel.t4 t4Var7 = this.L;
                if (t4Var7 != null) {
                    t4Var7.L0(PageOver.TRANSLATION);
                }
                break;
            case 8:
                com.zentraedi.comic.viewmodel.t4 t4Var8 = this.L;
                if (t4Var8 != null) {
                    t4Var8.L0(PageOver.SCROLL);
                }
                break;
            case 9:
                com.zentraedi.comic.viewmodel.t4 t4Var9 = this.L;
                if (t4Var9 != null) {
                    t4Var9.L0(PageOver.NO);
                }
                break;
            case 10:
                com.zentraedi.comic.viewmodel.t4 t4Var10 = this.L;
                if (t4Var10 != null) {
                    t4Var10.M0(PageTurning.RIGHT);
                }
                break;
            case 11:
                com.zentraedi.comic.viewmodel.t4 t4Var11 = this.L;
                if (t4Var11 != null) {
                    t4Var11.M0(PageTurning.LEFT);
                }
                break;
            case 12:
                com.zentraedi.comic.viewmodel.t4 t4Var12 = this.L;
                if (t4Var12 != null) {
                    t4Var12.M0(PageTurning.SINGLE);
                }
                break;
            case 13:
                com.zentraedi.comic.viewmodel.t4 t4Var13 = this.L;
                if (t4Var13 != null) {
                    t4Var13.C0();
                }
                break;
            case 14:
                com.zentraedi.comic.viewmodel.t4 t4Var14 = this.L;
                if (t4Var14 != null) {
                    t4Var14.O0();
                }
                break;
            case 15:
                com.zentraedi.comic.viewmodel.t4 t4Var15 = this.L;
                if (t4Var15 != null) {
                    t4Var15.N();
                }
                break;
            case 16:
                com.zentraedi.comic.viewmodel.t4 t4Var16 = this.L;
                if (t4Var16 != null) {
                    t4Var16.M();
                }
                break;
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.a2 == 0 && this.M2 == 0) {
                    return false;
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.a2 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
            this.M2 = 0L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.B4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.t4) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return I1((ObservableField) obj, i2);
            case 1:
                return L1((ObservableField) obj, i2);
            case 2:
                return D1((ObservableField) obj, i2);
            case 3:
                return E1((ObservableField) obj, i2);
            case 4:
                return K1((ObservableField) obj, i2);
            case 5:
                return J1((ObservableField) obj, i2);
            case 6:
                return F1((ObservableField) obj, i2);
            case 7:
                return G1((ObservableField) obj, i2);
            case 8:
                return N1((ObservableField) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:325:0x051d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:326:0x051f  */
    /* JADX WARN: Code duplicated, block: B:328:0x052c  */
    /* JADX WARN: Code duplicated, block: B:331:0x0537  */
    /* JADX WARN: Code duplicated, block: B:332:0x053e  */
    /* JADX WARN: Code duplicated, block: B:335:0x0545 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:336:0x0547  */
    /* JADX WARN: Code duplicated, block: B:338:0x054f  */
    /* JADX WARN: Code duplicated, block: B:340:0x0557  */
    /* JADX WARN: Code duplicated, block: B:342:0x0564  */
    /* JADX WARN: Code duplicated, block: B:344:0x05a1  */
    protected void r() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i;
        Drawable drawable;
        Drawable drawable2;
        boolean z;
        int iB;
        int i2;
        int iB2;
        Drawable drawable3;
        Drawable drawable4;
        int iB3;
        Drawable drawable5;
        int iB4;
        Drawable drawableB;
        String str;
        Drawable drawable6;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Drawable drawable7;
        Drawable drawable8;
        String str2;
        String str3;
        Drawable drawable9;
        Drawable drawable10;
        Drawable drawable11;
        Drawable drawable12;
        Drawable drawable13;
        String str4;
        Drawable drawableB2;
        Drawable drawableB3;
        Drawable drawableB4;
        int iB5;
        Drawable drawableB5;
        long j7;
        Drawable drawable14;
        int iB6;
        int i11;
        Drawable drawable15;
        Drawable drawable16;
        Drawable drawableB6;
        int iB7;
        int iB8;
        int iB9;
        Drawable drawableB7;
        Drawable drawable17;
        Drawable drawableB8;
        Drawable drawableB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        Drawable drawableB10;
        boolean zK0;
        boolean z2;
        String str5;
        long j8;
        androidx.databinding.u uVarK0;
        Boolean bool;
        boolean zK1;
        Resources resources;
        int i12;
        long j9;
        TextView textView;
        int i13;
        TextView textView2;
        int i14;
        TextView textView3;
        int i15;
        TextView textView4;
        int i16;
        TextView textView5;
        int i17;
        synchronized (this) {
            j = this.a2;
            this.a2 = 0L;
            this.M2 = 0L;
        }
        com.zentraedi.comic.viewmodel.t4 t4Var = this.L;
        long j10 = 1537;
        if ((2047 & j) != 0) {
            if ((j & 1537) == 0) {
                str4 = null;
            } else {
                ObservableField<String> observableFieldZ = t4Var != null ? t4Var.Z() : null;
                p1(0, observableFieldZ);
                if (observableFieldZ != null) {
                    str4 = (String) observableFieldZ.get();
                } else {
                    str4 = null;
                }
            }
            long j11 = j & 1538;
            if (j11 != 0) {
                androidx.databinding.u uVarG0 = t4Var != null ? t4Var.g0() : null;
                p1(1, uVarG0);
                PageTurning pageTurning = uVarG0 != null ? (PageTurning) uVarG0.get() : null;
                j2 = 1792;
                boolean z3 = pageTurning == PageTurning.LEFT;
                boolean z4 = pageTurning == PageTurning.SINGLE;
                j3 = 1664;
                boolean z5 = pageTurning == PageTurning.RIGHT;
                if (j11 != 0) {
                    j |= z3 ? 17825792L : 8912896L;
                }
                if ((j & 1538) != 0) {
                    j |= z4 ? 274877972480L : 137438986240L;
                }
                if ((j & 1538) != 0) {
                    j |= z5 ? 4398046527488L : 2199023263744L;
                }
                drawableB3 = z3 ? g.a.b(this.O.getContext(), com.zentraedi.comic.q.h.V00) : null;
                if (z3) {
                    textView3 = this.O;
                    i15 = com.zentraedi.comic.q.f.Wb;
                } else {
                    textView3 = this.O;
                    i15 = com.zentraedi.comic.q.f.o7;
                }
                iB2 = androidx.databinding.c0.B(textView3, i15);
                if (z4) {
                    textView4 = this.P;
                    j4 = 1600;
                    i16 = com.zentraedi.comic.q.f.Wb;
                } else {
                    j4 = 1600;
                    textView4 = this.P;
                    i16 = com.zentraedi.comic.q.f.o7;
                }
                iB3 = androidx.databinding.c0.B(textView4, i16);
                drawableB2 = z4 ? g.a.b(this.P.getContext(), com.zentraedi.comic.q.h.V00) : null;
                drawableB4 = z5 ? g.a.b(this.N.getContext(), com.zentraedi.comic.q.h.V00) : null;
                if (z5) {
                    textView5 = this.N;
                    i17 = com.zentraedi.comic.q.f.Wb;
                } else {
                    textView5 = this.N;
                    i17 = com.zentraedi.comic.q.f.o7;
                }
                iB = androidx.databinding.c0.B(textView5, i17);
            } else {
                j2 = 1792;
                j3 = 1664;
                j4 = 1600;
                iB = 0;
                iB2 = 0;
                drawableB2 = null;
                drawableB3 = null;
                iB3 = 0;
                drawableB4 = null;
            }
            long j12 = j & 1540;
            if (j12 != 0) {
                androidx.databinding.u uVarQ = t4Var != null ? t4Var.Q() : null;
                p1(2, uVarQ);
                ComicApplyScope comicApplyScope = uVarQ != null ? (ComicApplyScope) uVarQ.get() : null;
                boolean z6 = comicApplyScope == ComicApplyScope.ALL_COMIC;
                j5 = 1544;
                boolean z7 = comicApplyScope == ComicApplyScope.THIS_COMIC;
                if (j12 != 0) {
                    j |= z6 ? 17596481011712L : 8798240505856L;
                }
                if ((j & 1540) != 0) {
                    j |= z7 ? 288230376151711744L : 144115188075855872L;
                }
                iB4 = androidx.databinding.c0.B(this.T, z6 ? com.zentraedi.comic.q.f.Wb : com.zentraedi.comic.q.f.o7);
                drawableB5 = z6 ? g.a.b(this.T.getContext(), com.zentraedi.comic.q.h.V00) : null;
                iB5 = z7 ? androidx.databinding.c0.B(this.S, com.zentraedi.comic.q.f.Wb) : androidx.databinding.c0.B(this.S, com.zentraedi.comic.q.f.o7);
                drawableB = z7 ? g.a.b(this.S.getContext(), com.zentraedi.comic.q.h.V00) : null;
            } else {
                j10 = 1537;
                j5 = 1544;
                iB5 = 0;
                iB4 = 0;
                drawableB = null;
                drawableB5 = null;
            }
            long j13 = j & j5;
            if (j13 != 0) {
                androidx.databinding.u uVarT = t4Var != null ? t4Var.T() : null;
                j7 = j;
                p1(3, uVarT);
                int iH0 = androidx.databinding.c0.H0(uVarT != null ? (Integer) uVarT.get() : null);
                boolean z8 = iH0 == 1;
                boolean z9 = iH0 == 0;
                if (j13 != 0) {
                    j7 |= z8 ? 266240L : 133120L;
                }
                if ((j7 & j5) != 0) {
                    j7 |= z9 ? 281492156579840L : 140746078289920L;
                }
                Drawable drawableB11 = z8 ? g.a.b(this.K.getContext(), com.zentraedi.comic.q.h.V00) : null;
                if (z8) {
                    textView2 = this.K;
                    i14 = com.zentraedi.comic.q.f.Wb;
                } else {
                    textView2 = this.K;
                    i14 = com.zentraedi.comic.q.f.o7;
                }
                int iB14 = androidx.databinding.c0.B(textView2, i14);
                Drawable drawableB12 = z9 ? g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.V00) : null;
                drawable15 = drawableB11;
                i11 = iB14;
                iB6 = z9 ? androidx.databinding.c0.B(this.J, com.zentraedi.comic.q.f.Wb) : androidx.databinding.c0.B(this.J, com.zentraedi.comic.q.f.o7);
                drawable14 = drawableB12;
            } else {
                t4Var = t4Var;
                j7 = j;
                drawable14 = null;
                iB6 = 0;
                i11 = 0;
                drawable15 = null;
            }
            long j14 = j7 & 1552;
            if (j14 != 0) {
                androidx.databinding.u uVarF0 = t4Var != null ? t4Var.f0() : null;
                p1(4, uVarF0);
                PageOver pageOver = uVarF0 != null ? (PageOver) uVarF0.get() : null;
                boolean z10 = pageOver == PageOver.TRANSLATION;
                boolean z11 = pageOver == PageOver.NO;
                boolean z12 = pageOver == PageOver.SCROLL;
                if (j14 != 0) {
                    j7 |= z10 ? 70368748371968L : 35184374185984L;
                }
                if ((j7 & 1552) != 0) {
                    j7 |= z11 ? 18014399583223808L : 9007199791611904L;
                }
                if ((j7 & 1552) != 0) {
                    j7 |= z12 ? 68786585600L : 34393292800L;
                }
                Drawable drawableB13 = z10 ? g.a.b(this.Y.getContext(), com.zentraedi.comic.q.h.V00) : null;
                iB9 = z10 ? androidx.databinding.c0.B(this.Y, com.zentraedi.comic.q.f.Wb) : androidx.databinding.c0.B(this.Y, com.zentraedi.comic.q.f.o7);
                iB8 = z11 ? androidx.databinding.c0.B(this.a0, com.zentraedi.comic.q.f.Wb) : androidx.databinding.c0.B(this.a0, com.zentraedi.comic.q.f.o7);
                drawableB7 = z11 ? g.a.b(this.a0.getContext(), com.zentraedi.comic.q.h.V00) : null;
                iB7 = z12 != 0 ? androidx.databinding.c0.B(this.Z, com.zentraedi.comic.q.f.Wb) : androidx.databinding.c0.B(this.Z, com.zentraedi.comic.q.f.o7);
                drawableB6 = z12 ? g.a.b(this.Z.getContext(), com.zentraedi.comic.q.h.V00) : null;
                drawable16 = drawableB13;
            } else {
                drawable14 = drawable14;
                drawable16 = null;
                drawableB6 = null;
                iB7 = 0;
                iB8 = 0;
                iB9 = 0;
                drawableB7 = null;
            }
            long j15 = j7 & 1568;
            if (j15 != 0) {
                androidx.databinding.u uVarD0 = t4Var != null ? t4Var.d0() : null;
                p1(5, uVarD0);
                int iH1 = androidx.databinding.c0.H0(uVarD0 != null ? (Integer) uVarD0.get() : null);
                boolean z13 = iH1 == 5;
                boolean z14 = iH1 == 10;
                boolean z15 = iH1 == 1;
                boolean z16 = iH1 == 0;
                if (j15 != 0) {
                    j7 |= z13 ? 4612811918334230528L : 2306405959167115264L;
                }
                if ((j7 & 1568) != 0) {
                    j7 |= z14 ? 72057594037927936L : 36028797018963968L;
                }
                if ((j7 & 1568) != 0) {
                    j7 |= z15 ? 4503599627370496L : -9221120237041090560L;
                }
                if ((j7 & 1568) != 0) {
                    j7 |= z16 ? 1152921504875282432L : 576460752437641216L;
                }
                if (z13) {
                    textView = this.U;
                    i13 = com.zentraedi.comic.q.f.Wb;
                } else {
                    textView = this.U;
                    i13 = com.zentraedi.comic.q.f.o7;
                }
                iB11 = androidx.databinding.c0.B(textView, i13);
                Drawable drawableB14 = z13 ? g.a.b(this.U.getContext(), com.zentraedi.comic.q.h.V00) : null;
                drawableB9 = z14 ? g.a.b(this.V.getContext(), com.zentraedi.comic.q.h.V00) : null;
                iB13 = z14 ? androidx.databinding.c0.B(this.V, com.zentraedi.comic.q.f.Wb) : androidx.databinding.c0.B(this.V, com.zentraedi.comic.q.f.o7);
                iB12 = z15 ? androidx.databinding.c0.B(this.W, com.zentraedi.comic.q.f.Wb) : androidx.databinding.c0.B(this.W, com.zentraedi.comic.q.f.o7);
                drawableB10 = z15 ? g.a.b(this.W.getContext(), com.zentraedi.comic.q.h.V00) : null;
                iB10 = z16 != 0 ? androidx.databinding.c0.B(this.X, com.zentraedi.comic.q.f.Wb) : androidx.databinding.c0.B(this.X, com.zentraedi.comic.q.f.o7);
                drawableB8 = z16 ? g.a.b(this.X.getContext(), com.zentraedi.comic.q.h.V00) : null;
                drawable17 = drawableB14;
            } else {
                drawable16 = drawable16;
                drawable17 = null;
                drawableB8 = null;
                drawableB9 = null;
                iB10 = 0;
                iB11 = 0;
                iB12 = 0;
                iB13 = 0;
                drawableB10 = null;
            }
            if ((j7 & j4) != 0) {
                androidx.databinding.u uVarX = t4Var != null ? t4Var.X() : null;
                p1(6, uVarX);
                zK0 = androidx.databinding.c0.K0(uVarX != null ? (Boolean) uVarX.get() : null);
            } else {
                drawable17 = drawable17;
                zK0 = false;
            }
            if ((j7 & j3) != 0) {
                ObservableField<String> observableFieldY = t4Var != null ? t4Var.Y() : null;
                z2 = zK0;
                p1(7, observableFieldY);
                str5 = observableFieldY != null ? (String) observableFieldY.get() : null;
                j8 = j7 & j2;
                if (j8 != 0) {
                    if (t4Var != null) {
                        uVarK0 = t4Var.k0();
                    } else {
                        uVarK0 = null;
                    }
                    p1(8, uVarK0);
                    if (uVarK0 != null) {
                        bool = (Boolean) uVarK0.get();
                    } else {
                        bool = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool);
                    if (j8 != 0) {
                        if (zK1) {
                            j9 = 1099511627776L;
                        } else {
                            j9 = 549755813888L;
                        }
                        j7 |= j9;
                    }
                    if (zK1) {
                        resources = this.R.getResources();
                        i12 = com.zentraedi.comic.q.C0124q.h03;
                    } else {
                        resources = this.R.getResources();
                        i12 = com.zentraedi.comic.q.C0124q.wx;
                    }
                    String string = resources.getString(i12);
                    str2 = str4;
                    drawable = drawableB3;
                    drawable13 = drawable15;
                    str3 = str5;
                    drawable12 = drawable14;
                    i4 = iB6;
                    i8 = iB10;
                    drawable11 = drawableB7;
                    drawable9 = drawable16;
                    drawable10 = drawableB6;
                    i2 = iB11;
                    i9 = iB12;
                    drawable4 = drawable17;
                    i10 = iB13;
                    drawable7 = drawableB10;
                    drawable8 = drawableB8;
                    drawable6 = drawableB2;
                    drawable3 = drawableB9;
                    i3 = i11;
                    drawable2 = drawableB4;
                    drawable5 = drawableB5;
                    str = string;
                    i = iB5;
                    z = z2;
                    j6 = j7;
                    i6 = iB7;
                    i5 = iB8;
                    i7 = iB9;
                } else {
                    String str6 = str5;
                    i = iB5;
                    str2 = str4;
                    drawable = drawableB3;
                    drawable13 = drawable15;
                    str3 = str6;
                    z = z2;
                    j6 = j7;
                    i6 = iB7;
                    drawable12 = drawable14;
                    i4 = iB6;
                    i8 = iB10;
                    i5 = iB8;
                    i7 = iB9;
                    drawable11 = drawableB7;
                    drawable9 = drawable16;
                    drawable10 = drawableB6;
                    i2 = iB11;
                    i9 = iB12;
                    drawable4 = drawable17;
                    i10 = iB13;
                    drawable7 = drawableB10;
                    drawable8 = drawableB8;
                    drawable6 = drawableB2;
                    drawable3 = drawableB9;
                    i3 = i11;
                    drawable2 = drawableB4;
                    drawable5 = drawableB5;
                    str = null;
                }
            } else {
                z2 = zK0;
            }
            j8 = j7 & j2;
            if (j8 != 0) {
                if (t4Var != null) {
                    uVarK0 = t4Var.k0();
                } else {
                    uVarK0 = null;
                }
                p1(8, uVarK0);
                if (uVarK0 != null) {
                    bool = (Boolean) uVarK0.get();
                } else {
                    bool = null;
                }
                zK1 = androidx.databinding.c0.K0(bool);
                if (j8 != 0) {
                    if (zK1) {
                        j9 = 1099511627776L;
                    } else {
                        j9 = 549755813888L;
                    }
                    j7 |= j9;
                }
                if (zK1) {
                    resources = this.R.getResources();
                    i12 = com.zentraedi.comic.q.C0124q.h03;
                } else {
                    resources = this.R.getResources();
                    i12 = com.zentraedi.comic.q.C0124q.wx;
                }
                String string2 = resources.getString(i12);
                str2 = str4;
                drawable = drawableB3;
                drawable13 = drawable15;
                str3 = str5;
                drawable12 = drawable14;
                i4 = iB6;
                i8 = iB10;
                drawable11 = drawableB7;
                drawable9 = drawable16;
                drawable10 = drawableB6;
                i2 = iB11;
                i9 = iB12;
                drawable4 = drawable17;
                i10 = iB13;
                drawable7 = drawableB10;
                drawable8 = drawableB8;
                drawable6 = drawableB2;
                drawable3 = drawableB9;
                i3 = i11;
                drawable2 = drawableB4;
                drawable5 = drawableB5;
                str = string2;
                i = iB5;
                z = z2;
                j6 = j7;
                i6 = iB7;
                i5 = iB8;
                i7 = iB9;
            } else {
                String str7 = str5;
                i = iB5;
                str2 = str4;
                drawable = drawableB3;
                drawable13 = drawable15;
                str3 = str7;
                z = z2;
                j6 = j7;
                i6 = iB7;
                drawable12 = drawable14;
                i4 = iB6;
                i8 = iB10;
                i5 = iB8;
                i7 = iB9;
                drawable11 = drawableB7;
                drawable9 = drawable16;
                drawable10 = drawableB6;
                i2 = iB11;
                i9 = iB12;
                drawable4 = drawable17;
                i10 = iB13;
                drawable7 = drawableB10;
                drawable8 = drawableB8;
                drawable6 = drawableB2;
                drawable3 = drawableB9;
                i3 = i11;
                drawable2 = drawableB4;
                drawable5 = drawableB5;
                str = null;
            }
        } else {
            j10 = 1537;
            j2 = 1792;
            j3 = 1664;
            j4 = 1600;
            j5 = 1544;
            j6 = j;
            i = 0;
            drawable = null;
            drawable2 = null;
            z = false;
            iB = 0;
            i2 = 0;
            iB2 = 0;
            drawable3 = null;
            drawable4 = null;
            iB3 = 0;
            drawable5 = null;
            iB4 = 0;
            drawableB = null;
            str = null;
            drawable6 = null;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
            drawable7 = null;
            drawable8 = null;
            str2 = null;
            str3 = null;
            drawable9 = null;
            drawable10 = null;
            drawable11 = null;
            drawable12 = null;
            drawable13 = null;
        }
        if ((j6 & j4) != 0) {
            androidx.databinding.adapters.k.a(this.G, z);
        }
        if ((j6 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
            this.G.setOnClickListener(this.n0);
            this.N.setOnClickListener(this.g0);
            this.O.setOnClickListener(this.b0);
            this.P.setOnClickListener(this.c0);
            this.Q.setOnClickListener(this.M1);
            this.S.setOnClickListener(this.j0);
            this.T.setOnClickListener(this.a1);
            this.U.setOnClickListener(this.h0);
            this.V.setOnClickListener(this.f0);
            this.W.setOnClickListener(this.d0);
            this.X.setOnClickListener(this.r1);
            this.Y.setOnClickListener(this.i0);
            this.Z.setOnClickListener(this.l0);
            this.a0.setOnClickListener(this.e0);
            this.J.setOnClickListener(this.m0);
            this.K.setOnClickListener(this.k0);
        }
        if ((j6 & 1538) != 0) {
            androidx.databinding.adapters.j0.b(this.N, drawable2);
            this.N.setTextColor(iB);
            androidx.databinding.adapters.j0.b(this.O, drawable);
            this.O.setTextColor(iB2);
            androidx.databinding.adapters.j0.b(this.P, drawable6);
            this.P.setTextColor(iB3);
        }
        if ((j6 & j2) != 0) {
            androidx.databinding.adapters.f0.A(this.R, str);
        }
        if ((j6 & 1540) != 0) {
            androidx.databinding.adapters.j0.b(this.S, drawableB);
            this.S.setTextColor(i);
            androidx.databinding.adapters.j0.b(this.T, drawable5);
            this.T.setTextColor(iB4);
        }
        if ((j6 & 1568) != 0) {
            androidx.databinding.adapters.j0.b(this.U, drawable4);
            this.U.setTextColor(i2);
            androidx.databinding.adapters.j0.b(this.V, drawable3);
            this.V.setTextColor(i10);
            androidx.databinding.adapters.j0.b(this.W, drawable7);
            this.W.setTextColor(i9);
            androidx.databinding.adapters.j0.b(this.X, drawable8);
            this.X.setTextColor(i8);
        }
        if ((j6 & j10) != 0) {
            androidx.databinding.adapters.f0.A(this.U, str2);
        }
        if ((j6 & j3) != 0) {
            androidx.databinding.adapters.f0.A(this.V, str3);
        }
        if ((j6 & 1552) != 0) {
            androidx.databinding.adapters.j0.b(this.Y, drawable9);
            this.Y.setTextColor(i7);
            androidx.databinding.adapters.j0.b(this.Z, drawable10);
            this.Z.setTextColor(i6);
            androidx.databinding.adapters.j0.b(this.a0, drawable11);
            this.a0.setTextColor(i5);
        }
        if ((j6 & j5) != 0) {
            androidx.databinding.adapters.j0.b(this.J, drawable12);
            this.J.setTextColor(i4);
            androidx.databinding.adapters.j0.b(this.K, drawable13);
            this.K.setTextColor(i3);
        }
    }

    private y3(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 9, (CheckBox) objArr[20], (ImageView) objArr[21], (Switch) objArr[13], (AppCompatSeekBar) objArr[19], (TextView) objArr[18], (TextView) objArr[1], (TextView) objArr[2]);
        this.a2 = -1L;
        this.M2 = -1L;
        this.G.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.M = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.N = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[11];
        this.O = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[12];
        this.P = textView3;
        textView3.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[14];
        this.Q = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView4 = (TextView) objArr[15];
        this.R = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[16];
        this.S = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) objArr[17];
        this.T = textView6;
        textView6.setTag(null);
        TextView textView7 = (TextView) objArr[3];
        this.U = textView7;
        textView7.setTag(null);
        TextView textView8 = (TextView) objArr[4];
        this.V = textView8;
        textView8.setTag(null);
        TextView textView9 = (TextView) objArr[5];
        this.W = textView9;
        textView9.setTag(null);
        TextView textView10 = (TextView) objArr[6];
        this.X = textView10;
        textView10.setTag(null);
        TextView textView11 = (TextView) objArr[7];
        this.Y = textView11;
        textView11.setTag(null);
        TextView textView12 = (TextView) objArr[8];
        this.Z = textView12;
        textView12.setTag(null);
        TextView textView13 = (TextView) objArr[9];
        this.a0 = textView13;
        textView13.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        P0(view);
        this.b0 = new com.zentraedi.comic.generated.callback.b(this, 11);
        this.c0 = new com.zentraedi.comic.generated.callback.b(this, 12);
        this.d0 = new com.zentraedi.comic.generated.callback.b(this, 5);
        this.e0 = new com.zentraedi.comic.generated.callback.b(this, 9);
        this.f0 = new com.zentraedi.comic.generated.callback.b(this, 4);
        this.g0 = new com.zentraedi.comic.generated.callback.b(this, 10);
        this.h0 = new com.zentraedi.comic.generated.callback.b(this, 3);
        this.i0 = new com.zentraedi.comic.generated.callback.b(this, 7);
        this.j0 = new com.zentraedi.comic.generated.callback.b(this, 15);
        this.k0 = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.l0 = new com.zentraedi.comic.generated.callback.b(this, 8);
        this.m0 = new com.zentraedi.comic.generated.callback.b(this, 1);
        this.n0 = new com.zentraedi.comic.generated.callback.b(this, 13);
        this.a1 = new com.zentraedi.comic.generated.callback.b(this, 16);
        this.r1 = new com.zentraedi.comic.generated.callback.b(this, 6);
        this.M1 = new com.zentraedi.comic.generated.callback.b(this, 14);
        i0();
    }
}
