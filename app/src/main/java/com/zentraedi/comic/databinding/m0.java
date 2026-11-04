package com.zentraedi.comic.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.databinding.ObservableField;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.ReadModel;
import com.zentraedi.comic.viewmodel.ScreenOrganize;
import com.zentraedi.comic.viewmodel.ZoomType;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class m0 extends l0 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final SparseIntArray M2;

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i a2 = null;
    private long M1;

    @androidx.annotation.n0
    private final LinearLayout Y;

    @androidx.annotation.n0
    private final TextView Z;

    @androidx.annotation.n0
    private final LinearLayout a0;

    @androidx.annotation.p0
    private final View.OnClickListener a1;

    @androidx.annotation.n0
    private final TextView b0;

    @androidx.annotation.n0
    private final LinearLayout c0;

    @androidx.annotation.n0
    private final TextView d0;

    @androidx.annotation.n0
    private final LinearLayout e0;

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
    private long r1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M2 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.pP, 19);
        sparseIntArray.put(com.zentraedi.comic.q.i.Sq, 20);
        sparseIntArray.put(com.zentraedi.comic.q.i.G6, 21);
    }

    public m0(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 22, a2, M2));
    }

    private boolean N1(ObservableField<Layout> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.r1 |= 8;
        }
        return true;
    }

    private boolean O1(ObservableField<ReadModel> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.r1 |= 16;
        }
        return true;
    }

    private boolean P1(ObservableField<ScreenOrganize> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.r1 |= 1;
        }
        return true;
    }

    private boolean Q1(ObservableField<ZoomType> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.r1 |= 2;
        }
        return true;
    }

    private boolean R1(ObservableField<ZoomType> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.r1 |= 4;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.l0
    public void G1(@androidx.annotation.p0 Layout layout) {
        this.T = layout;
    }

    @Override // com.zentraedi.comic.databinding.l0
    public void I1(@androidx.annotation.p0 ReadModel readModel) {
        this.V = readModel;
    }

    @Override // com.zentraedi.comic.databinding.l0
    public void J1(@androidx.annotation.p0 ScreenOrganize screenOrganize) {
        this.W = screenOrganize;
    }

    @Override // com.zentraedi.comic.databinding.l0
    public void K1(@androidx.annotation.p0 n6 n6Var) {
        this.U = n6Var;
        synchronized (this) {
            this.r1 |= 512;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.l0
    public void L1(@androidx.annotation.p0 ZoomType zoomType) {
        this.X = zoomType;
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        switch (i) {
            case 1:
                n6 n6Var = this.U;
                if (n6Var != null) {
                    n6Var.l1();
                }
                break;
            case 2:
                n6 n6Var2 = this.U;
                if (n6Var2 != null) {
                    n6Var2.k1();
                }
                break;
            case 3:
                n6 n6Var3 = this.U;
                if (n6Var3 != null) {
                    n6Var3.s1();
                }
                break;
            case 4:
                n6 n6Var4 = this.U;
                if (n6Var4 != null) {
                    n6Var4.r1();
                }
                break;
            case 5:
                n6 n6Var5 = this.U;
                if (n6Var5 != null) {
                    n6Var5.p1();
                }
                break;
            case 6:
                n6 n6Var6 = this.U;
                if (n6Var6 != null) {
                    n6Var6.h1();
                }
                break;
            case 7:
                n6 n6Var7 = this.U;
                if (n6Var7 != null) {
                    n6Var7.i1();
                }
                break;
            case 8:
                n6 n6Var8 = this.U;
                if (n6Var8 != null) {
                    n6Var8.l2();
                }
                break;
            case 9:
                n6 n6Var9 = this.U;
                if (n6Var9 != null) {
                    n6Var9.m2();
                }
                break;
            case 10:
                n6 n6Var10 = this.U;
                if (n6Var10 != null) {
                    n6Var10.n2();
                }
                break;
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.r1 == 0 && this.M1 == 0) {
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
            this.r1 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
            this.M1 = 0L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.Q1 == i) {
            G1((Layout) obj);
            return true;
        }
        if (com.zentraedi.comic.a.h3 == i) {
            I1((ReadModel) obj);
            return true;
        }
        if (com.zentraedi.comic.a.q3 == i) {
            J1((ScreenOrganize) obj);
            return true;
        }
        if (com.zentraedi.comic.a.G4 == i) {
            L1((ZoomType) obj);
            return true;
        }
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        K1((n6) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return P1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return Q1((ObservableField) obj, i2);
        }
        if (i == 2) {
            return R1((ObservableField) obj, i2);
        }
        if (i == 3) {
            return N1((ObservableField) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return O1((ObservableField) obj, i2);
    }

    protected void r() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i;
        int i2;
        Drawable drawable;
        int i3;
        int iB;
        int i4;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        Drawable drawable7;
        Drawable drawable8;
        int i5;
        Drawable drawableB;
        ObservableField<Layout> observableFieldR0;
        Layout layout;
        int i6;
        Drawable drawable9;
        Drawable drawable10;
        Drawable drawable11;
        Drawable drawable12;
        Drawable drawableB2;
        int iB2;
        boolean z;
        Drawable drawableB3;
        int iB3;
        int iB4;
        int iB5;
        Drawable drawableB4;
        Drawable drawableB5;
        Drawable drawableB6;
        Drawable drawableB7;
        int iB6;
        Drawable drawableB8;
        int iB7;
        Drawable drawableB9;
        int iB8;
        Drawable drawableB10;
        Drawable drawableB11;
        Drawable drawableB12;
        Drawable drawableB13;
        Drawable drawableB14;
        Context context;
        int i7;
        Context context2;
        int i8;
        long j7;
        TextView textView;
        int i9;
        Context context3;
        int i10;
        Context context4;
        int i11;
        TextView textView2;
        int i12;
        Context context5;
        int i13;
        Context context6;
        int i14;
        synchronized (this) {
            j = this.r1;
            this.r1 = 0L;
            this.M1 = 0L;
        }
        n6 n6Var = this.U;
        if ((1567 & j) != 0) {
            long j8 = j & 1537;
            if (j8 != 0) {
                androidx.databinding.u uVarU0 = n6Var != null ? n6Var.U0() : null;
                j2 = Long.MIN_VALUE;
                p1(0, uVarU0);
                ScreenOrganize screenOrganize = uVarU0 != null ? (ScreenOrganize) uVarU0.get() : null;
                boolean z2 = screenOrganize == ScreenOrganize.VERTICAL;
                boolean z3 = screenOrganize == ScreenOrganize.LANDSCAPE;
                if (j8 != 0) {
                    j |= z2 ? 68719542272L : 34359771136L;
                }
                if ((j & 1537) != 0) {
                    j |= z3 ? 4507997673881600L : 2253998836940800L;
                }
                drawableB4 = g.a.b(this.G.getContext(), z2 ? com.zentraedi.comic.q.h.V00 : com.zentraedi.comic.q.h.A00);
                drawableB5 = g.a.b(this.G.getContext(), z2 ? com.zentraedi.comic.q.h.aO : com.zentraedi.comic.q.h.ZN);
                if (z3) {
                    context5 = this.F.getContext();
                    j3 = 36028797018963968L;
                    i13 = com.zentraedi.comic.q.h.QA;
                } else {
                    j3 = 36028797018963968L;
                    context5 = this.F.getContext();
                    i13 = com.zentraedi.comic.q.h.PA;
                }
                drawableB6 = g.a.b(context5, i13);
                if (z3) {
                    context6 = this.F.getContext();
                    i14 = com.zentraedi.comic.q.h.V00;
                } else {
                    context6 = this.F.getContext();
                    i14 = com.zentraedi.comic.q.h.A00;
                }
                drawableB = g.a.b(context6, i14);
            } else {
                j2 = Long.MIN_VALUE;
                j3 = 36028797018963968L;
                drawableB = null;
                drawableB4 = null;
                drawableB5 = null;
                drawableB6 = null;
            }
            long j9 = j & 1538;
            if (j9 != 0) {
                ObservableField<ZoomType> observableFieldV0 = n6Var != null ? n6Var.V0() : null;
                p1(1, observableFieldV0);
                ZoomType zoomType = observableFieldV0 != null ? (ZoomType) observableFieldV0.get() : null;
                boolean z4 = zoomType == ZoomType.WIDTH;
                j4 = 72057594037927936L;
                boolean z5 = zoomType == ZoomType.HEIGHT;
                boolean z6 = zoomType == ZoomType.CUSTOM;
                if (j9 != 0) {
                    j |= z4 ? 288230397626548224L : 144115198813274112L;
                }
                if ((j & 1538) != 0) {
                    j |= z5 ? 17592186044416L : 8796093022208L;
                }
                if ((j & 1538) != 0) {
                    j |= z6 ? 1170936177994235904L : 585468088997117952L;
                }
                iB6 = androidx.databinding.c0.B(this.d0, z4 ? com.zentraedi.comic.q.f.n4 : com.zentraedi.comic.q.f.f416qd);
                if (z4) {
                    textView = this.S;
                    j5 = 1540;
                    i9 = com.zentraedi.comic.q.f.n4;
                } else {
                    j5 = 1540;
                    textView = this.S;
                    i9 = com.zentraedi.comic.q.f.f416qd;
                }
                iB7 = androidx.databinding.c0.B(textView, i9);
                if (z4) {
                    context3 = this.c0.getContext();
                    i10 = com.zentraedi.comic.q.h.V00;
                } else {
                    context3 = this.c0.getContext();
                    i10 = com.zentraedi.comic.q.h.A00;
                }
                drawableB7 = g.a.b(context3, i10);
                if (z5) {
                    context4 = this.a0.getContext();
                    i11 = com.zentraedi.comic.q.h.V00;
                } else {
                    context4 = this.a0.getContext();
                    i11 = com.zentraedi.comic.q.h.A00;
                }
                drawableB8 = g.a.b(context4, i11);
                iB8 = androidx.databinding.c0.B(this.Z, z6 ? com.zentraedi.comic.q.f.n4 : com.zentraedi.comic.q.f.f416qd);
                drawableB9 = z6 ? g.a.b(this.H.getContext(), com.zentraedi.comic.q.h.V00) : g.a.b(this.H.getContext(), com.zentraedi.comic.q.h.A00);
                if (z6) {
                    textView2 = this.Q;
                    i12 = com.zentraedi.comic.q.f.n4;
                } else {
                    textView2 = this.Q;
                    i12 = com.zentraedi.comic.q.f.f416qd;
                }
                iB = androidx.databinding.c0.B(textView2, i12);
            } else {
                j4 = 72057594037927936L;
                j5 = 1540;
                drawableB7 = null;
                iB6 = 0;
                iB = 0;
                drawableB8 = null;
                iB7 = 0;
                drawableB9 = null;
                iB8 = 0;
            }
            long j10 = j & j5;
            if (j10 != 0) {
                androidx.databinding.u uVarV0 = n6Var != null ? n6Var.V0() : null;
                long j11 = j;
                p1(2, uVarV0);
                boolean z7 = (uVarV0 != null ? (ZoomType) uVarV0.get() : null) == ZoomType.HEIGHT;
                if (j10 != 0) {
                    j7 = j11 | (z7 ? 281474976714752L : 140737488357376L);
                } else {
                    j7 = j11;
                }
                int iB9 = z7 ? androidx.databinding.c0.B(this.b0, com.zentraedi.comic.q.f.n4) : androidx.databinding.c0.B(this.b0, com.zentraedi.comic.q.f.f416qd);
                long j12 = j7;
                iB2 = z7 ? androidx.databinding.c0.B(this.R, com.zentraedi.comic.q.f.n4) : androidx.databinding.c0.B(this.R, com.zentraedi.comic.q.f.f416qd);
                i = iB9;
                j6 = j12;
            } else {
                n6Var = n6Var;
                j6 = j;
                i = 0;
                iB2 = 0;
            }
            if ((j6 & 1544) != 0) {
                observableFieldR0 = n6Var != null ? n6Var.R0() : null;
                p1(3, observableFieldR0);
                layout = observableFieldR0 != null ? (Layout) observableFieldR0.get() : null;
                boolean z8 = layout == Layout.SINGLE;
                boolean z9 = layout == Layout.COMMON;
                if ((j6 & 134217728) != 0) {
                    j6 = z8 ? j6 | j4 : j6 | j3;
                }
                if ((j6 & 1544) != 0 && !z8) {
                    j6 |= j2;
                }
                if ((j6 & 1544) != 0) {
                    j6 |= z9 ? 17039360L : 8519680L;
                }
                if (z8) {
                    context2 = this.e0.getContext();
                    i8 = com.zentraedi.comic.q.h.V00;
                } else {
                    context2 = this.e0.getContext();
                    i8 = com.zentraedi.comic.q.h.A00;
                }
                drawableB11 = g.a.b(context2, i8);
                int iB10 = z9 != 0 ? androidx.databinding.c0.B(this.L, com.zentraedi.comic.q.f.n4) : androidx.databinding.c0.B(this.L, com.zentraedi.comic.q.f.f416qd);
                drawableB10 = z9 ? g.a.b(this.I.getContext(), com.zentraedi.comic.q.h.V00) : g.a.b(this.I.getContext(), com.zentraedi.comic.q.h.A00);
                i2 = iB10;
            } else {
                iB2 = iB2;
                i2 = 0;
                drawableB10 = null;
                observableFieldR0 = null;
                layout = null;
                drawableB11 = null;
            }
            if ((j6 & 1560) != 0) {
                androidx.databinding.u uVarT0 = n6Var != null ? n6Var.T0() : null;
                Drawable drawable13 = drawableB10;
                p1(4, uVarT0);
                ReadModel readModel = uVarT0 != null ? (ReadModel) uVarT0.get() : null;
                long j13 = j6 & 1552;
                if (j13 != 0) {
                    boolean z10 = readModel == ReadModel.MANGA_READ;
                    boolean z11 = readModel == ReadModel.NORMAL_READ;
                    if (j13 != 0) {
                        j6 |= z10 ? 1125899907907584L : 562949953953792L;
                    }
                    if ((j6 & 1552) != 0) {
                        j6 |= z11 ? 70369822113792L : 35184911056896L;
                    }
                    boolean z12 = z11;
                    if (z10) {
                        context = this.N.getContext();
                        i7 = com.zentraedi.comic.q.h.V00;
                    } else {
                        context = this.N.getContext();
                        i7 = com.zentraedi.comic.q.h.A00;
                    }
                    drawableB2 = g.a.b(context, i7);
                    iB3 = z10 ? androidx.databinding.c0.B(this.N, com.zentraedi.comic.q.f.n4) : androidx.databinding.c0.B(this.N, com.zentraedi.comic.q.f.f416qd);
                    drawableB14 = z10 ? g.a.b(this.N.getContext(), com.zentraedi.comic.q.h.Tm) : g.a.b(this.N.getContext(), com.zentraedi.comic.q.h.Sm);
                    iB4 = z12 ? androidx.databinding.c0.B(this.O, com.zentraedi.comic.q.f.n4) : androidx.databinding.c0.B(this.O, com.zentraedi.comic.q.f.f416qd);
                    drawableB13 = z12 ? g.a.b(this.O.getContext(), com.zentraedi.comic.q.h.nm) : g.a.b(this.O.getContext(), com.zentraedi.comic.q.h.mm);
                    drawableB12 = z12 ? g.a.b(this.O.getContext(), com.zentraedi.comic.q.h.V00) : g.a.b(this.O.getContext(), com.zentraedi.comic.q.h.A00);
                } else {
                    observableFieldR0 = observableFieldR0;
                    drawableB12 = null;
                    drawableB13 = null;
                    iB3 = 0;
                    drawableB2 = null;
                    drawableB14 = null;
                    iB4 = 0;
                }
                z = readModel == ReadModel.SCROLL_READ;
                if ((j6 & 1552) != 0) {
                    j6 |= z ? 4611687118006124544L : 2305843559003062272L;
                }
                if ((j6 & 1560) != 0) {
                    j6 = z ? j6 | 268435456 : j6 | 134217728;
                }
                if ((j6 & 1552) != 0) {
                    int iB11 = z ? androidx.databinding.c0.B(this.P, com.zentraedi.comic.q.f.n4) : androidx.databinding.c0.B(this.P, com.zentraedi.comic.q.f.f416qd);
                    Drawable drawableB15 = z != 0 ? g.a.b(this.P.getContext(), com.zentraedi.comic.q.h.V00) : g.a.b(this.P.getContext(), com.zentraedi.comic.q.h.A00);
                    drawableB3 = z != 0 ? g.a.b(this.P.getContext(), com.zentraedi.comic.q.h.dn) : g.a.b(this.P.getContext(), com.zentraedi.comic.q.h.cn);
                    i6 = iB11;
                    drawable9 = drawableB15;
                } else {
                    z = z;
                    i6 = 0;
                    drawableB3 = null;
                    drawable9 = null;
                }
                drawable5 = drawableB5;
                drawable2 = drawableB4;
                i4 = iB7;
                drawable7 = drawableB6;
                drawable3 = drawable13;
                drawable11 = drawableB12;
                drawable = drawableB9;
                drawable8 = drawableB8;
                drawable6 = drawableB7;
                i3 = iB8;
                i5 = iB6;
                drawable4 = drawableB11;
                drawable10 = drawableB13;
                drawable12 = drawableB14;
            } else {
                int i15 = i2;
                Drawable drawable14 = drawableB10;
                ObservableField<Layout> observableField = observableFieldR0;
                drawable = drawableB9;
                i = i;
                i2 = i15;
                observableFieldR0 = observableField;
                i6 = 0;
                drawable12 = null;
                drawableB2 = null;
                z = false;
                drawableB3 = null;
                iB3 = 0;
                iB4 = 0;
                drawable8 = drawableB8;
                layout = layout;
                iB2 = iB2;
                drawable9 = null;
                drawable6 = drawableB7;
                drawableB = drawableB;
                iB = iB;
                i3 = iB8;
                drawable5 = drawableB5;
                i5 = iB6;
                drawable4 = drawableB11;
                drawable10 = null;
                drawable2 = drawableB4;
                i4 = iB7;
                drawable7 = drawableB6;
                drawable3 = drawable14;
                drawable11 = null;
            }
        } else {
            n6Var = n6Var;
            j2 = Long.MIN_VALUE;
            j3 = 36028797018963968L;
            j4 = 72057594037927936L;
            j5 = 1540;
            j6 = j;
            i = 0;
            i2 = 0;
            drawable = null;
            i3 = 0;
            iB = 0;
            i4 = 0;
            drawable2 = null;
            drawable3 = null;
            drawable4 = null;
            drawable5 = null;
            drawable6 = null;
            drawable7 = null;
            drawable8 = null;
            i5 = 0;
            drawableB = null;
            observableFieldR0 = null;
            layout = null;
            i6 = 0;
            drawable9 = null;
            drawable10 = null;
            drawable11 = null;
            drawable12 = null;
            drawableB2 = null;
            iB2 = 0;
            z = false;
            drawableB3 = null;
            iB3 = 0;
            iB4 = 0;
        }
        long j14 = j6 & 134217728;
        if (j14 != 0) {
            if (n6Var != null) {
                observableFieldR0 = n6Var.R0();
            }
            ObservableField<Layout> observableField2 = observableFieldR0;
            p1(3, observableField2);
            boolean z13 = (observableField2 != null ? (Layout) observableField2.get() : layout) == Layout.SINGLE;
            if (j14 != 0) {
                j6 = z13 ? j6 | j4 : j6 | j3;
            }
            if ((j6 & 1544) != 0 && !z13) {
                j6 |= j2;
            }
            iB5 = androidx.databinding.c0.B(this.M, z13 ? com.zentraedi.comic.q.f.n4 : com.zentraedi.comic.q.f.f416qd);
        } else {
            iB5 = 0;
        }
        long j15 = j6 & 1560;
        if (j15 == 0) {
            iB5 = 0;
        } else if (z) {
            iB5 = androidx.databinding.c0.B(this.M, com.zentraedi.comic.q.f.K3);
        }
        if ((j6 & 1537) != 0) {
            androidx.databinding.adapters.j0.b(this.F, drawableB);
            androidx.databinding.adapters.p.a(this.F, drawable7);
            androidx.databinding.adapters.j0.b(this.G, drawable2);
            androidx.databinding.adapters.p.a(this.G, drawable5);
        }
        if ((j6 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
            this.F.setOnClickListener(this.g0);
            this.G.setOnClickListener(this.m0);
            this.H.setOnClickListener(this.h0);
            this.I.setOnClickListener(this.l0);
            this.a0.setOnClickListener(this.i0);
            this.c0.setOnClickListener(this.f0);
            this.e0.setOnClickListener(this.n0);
            this.N.setOnClickListener(this.k0);
            this.O.setOnClickListener(this.a1);
            this.P.setOnClickListener(this.j0);
        }
        if ((j6 & 1538) != 0) {
            androidx.databinding.adapters.j0.b(this.H, drawable);
            this.Z.setTextColor(i3);
            androidx.databinding.adapters.j0.b(this.a0, drawable8);
            androidx.databinding.adapters.j0.b(this.c0, drawable6);
            this.d0.setTextColor(i5);
            this.Q.setTextColor(iB);
            this.S.setTextColor(i4);
        }
        if ((j6 & 1544) != 0) {
            androidx.databinding.adapters.j0.b(this.I, drawable3);
            androidx.databinding.adapters.j0.b(this.e0, drawable4);
            this.L.setTextColor(i2);
        }
        if ((j6 & j5) != 0) {
            this.b0.setTextColor(i);
            this.R.setTextColor(iB2);
        }
        if (j15 != 0) {
            this.M.setTextColor(iB5);
        }
        if ((j6 & 1552) != 0) {
            androidx.databinding.adapters.j0.b(this.N, drawableB2);
            androidx.databinding.adapters.f0.l(this.N, drawable12);
            this.N.setTextColor(iB3);
            androidx.databinding.adapters.j0.b(this.O, drawable11);
            androidx.databinding.adapters.f0.l(this.O, drawable10);
            this.O.setTextColor(iB4);
            androidx.databinding.adapters.j0.b(this.P, drawable9);
            androidx.databinding.adapters.f0.l(this.P, drawableB3);
            this.P.setTextColor(i6);
        }
    }

    private m0(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 5, (CheckBox) objArr[21], (ImageView) objArr[5], (ImageView) objArr[4], (LinearLayout) objArr[10], (LinearLayout) objArr[6], (AppCompatSeekBar) objArr[20], (TextView) objArr[19], (TextView) objArr[7], (TextView) objArr[9], (TextView) objArr[2], (TextView) objArr[1], (TextView) objArr[3], (TextView) objArr[11], (TextView) objArr[14], (TextView) objArr[17]);
        this.r1 = -1L;
        this.M1 = -1L;
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.Y = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[12];
        this.Z = textView;
        textView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[13];
        this.a0 = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView2 = (TextView) objArr[15];
        this.b0 = textView2;
        textView2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[16];
        this.c0 = linearLayout3;
        linearLayout3.setTag(null);
        TextView textView3 = (TextView) objArr[18];
        this.d0 = textView3;
        textView3.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[8];
        this.e0 = linearLayout4;
        linearLayout4.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        P0(view);
        this.f0 = new com.zentraedi.comic.generated.callback.b(this, 10);
        this.g0 = new com.zentraedi.comic.generated.callback.b(this, 5);
        this.h0 = new com.zentraedi.comic.generated.callback.b(this, 8);
        this.i0 = new com.zentraedi.comic.generated.callback.b(this, 9);
        this.j0 = new com.zentraedi.comic.generated.callback.b(this, 3);
        this.k0 = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.l0 = new com.zentraedi.comic.generated.callback.b(this, 6);
        this.m0 = new com.zentraedi.comic.generated.callback.b(this, 4);
        this.n0 = new com.zentraedi.comic.generated.callback.b(this, 7);
        this.a1 = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
