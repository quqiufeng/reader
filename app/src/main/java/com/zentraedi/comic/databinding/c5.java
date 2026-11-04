package com.zentraedi.comic.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.ObservableField;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.business.utils.g8;
import com.zentraedi.comic.viewmodel.Clip;
import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.ReadModel;
import com.zentraedi.comic.viewmodel.ScreenOrganize;
import com.zentraedi.comic.viewmodel.ZoomType;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class c5 extends b5 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i P = null;

    @androidx.annotation.p0
    private static final SparseIntArray Q = null;

    @androidx.annotation.n0
    private final LinearLayout G;

    @androidx.annotation.n0
    private final LinearLayout H;

    @androidx.annotation.n0
    private final ImageView I;

    @androidx.annotation.n0
    private final ImageView J;

    @androidx.annotation.n0
    private final ImageView K;

    @androidx.annotation.n0
    private final ImageView L;

    @androidx.annotation.n0
    private final ImageView M;

    @androidx.annotation.n0
    private final ImageView N;
    private long O;

    public c5(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 8, P, Q));
    }

    private boolean F1(ObservableField<Clip> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 2;
        }
        return true;
    }

    private boolean G1(ObservableField<Layout> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 8;
        }
        return true;
    }

    private boolean I1(ObservableField<ReadModel> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 1;
        }
        return true;
    }

    private boolean J1(ObservableField<ScreenOrganize> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 16;
        }
        return true;
    }

    private boolean K1(ObservableField<ZoomType> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 4;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.b5
    public void D1(@androidx.annotation.p0 n6 n6Var) {
        this.F = n6Var;
        synchronized (this) {
            this.O |= 32;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.i3);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.b5
    public void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.q3 q3Var) {
        this.E = q3Var;
        synchronized (this) {
            this.O |= 64;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.O = 128L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.i3 == i) {
            D1((n6) obj);
            return true;
        }
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        E1((com.zentraedi.comic.viewmodel.q3) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return I1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return F1((ObservableField) obj, i2);
        }
        if (i == 2) {
            return K1((ObservableField) obj, i2);
        }
        if (i == 3) {
            return G1((ObservableField) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return J1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0198  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01af  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:138:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:141:0x0203  */
    /* JADX WARN: Code duplicated, block: B:143:0x0208  */
    /* JADX WARN: Code duplicated, block: B:145:0x0215  */
    /* JADX WARN: Code duplicated, block: B:146:0x021e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0226  */
    /* JADX WARN: Code duplicated, block: B:151:0x022a  */
    /* JADX WARN: Code duplicated, block: B:152:0x022c  */
    /* JADX WARN: Code duplicated, block: B:154:0x022f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x0231  */
    /* JADX WARN: Code duplicated, block: B:157:0x0237  */
    /* JADX WARN: Code duplicated, block: B:159:0x023d  */
    /* JADX WARN: Code duplicated, block: B:161:0x024a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0253  */
    /* JADX WARN: Code duplicated, block: B:165:0x025b  */
    /* JADX WARN: Code duplicated, block: B:167:0x025f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0261  */
    /* JADX WARN: Code duplicated, block: B:170:0x0264 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x0266  */
    /* JADX WARN: Code duplicated, block: B:173:0x026b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0270  */
    /* JADX WARN: Code duplicated, block: B:177:0x027d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0286  */
    /* JADX WARN: Code duplicated, block: B:181:0x028e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0290  */
    /* JADX WARN: Code duplicated, block: B:183:0x029d  */
    /* JADX WARN: Code duplicated, block: B:186:0x02a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:189:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:192:0x02c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:195:0x02c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:197:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:198:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:201:0x02dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x02de  */
    /* JADX WARN: Code duplicated, block: B:203:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:206:0x02f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:208:0x0302  */
    /* JADX WARN: Code duplicated, block: B:211:0x030a  */
    /* JADX WARN: Code duplicated, block: B:213:0x030e  */
    /* JADX WARN: Code duplicated, block: B:214:0x0311  */
    /* JADX WARN: Code duplicated, block: B:216:0x0315 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x0317  */
    /* JADX WARN: Code duplicated, block: B:219:0x031d  */
    /* JADX WARN: Code duplicated, block: B:222:0x0329  */
    /* JADX WARN: Code duplicated, block: B:224:0x0330  */
    /* JADX WARN: Code duplicated, block: B:225:0x0333  */
    /* JADX WARN: Code duplicated, block: B:228:0x033b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:229:0x033d  */
    /* JADX WARN: Code duplicated, block: B:233:0x0355  */
    /* JADX WARN: Code duplicated, block: B:236:0x036b  */
    /* JADX WARN: Code duplicated, block: B:238:0x038b  */
    /* JADX WARN: Code duplicated, block: B:241:0x0396  */
    /* JADX WARN: Code duplicated, block: B:244:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:247:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:257:? A[RETURN, SYNTHETIC] */
    protected void r() {
        long j;
        long j2;
        long j3;
        long j4;
        ScreenOrganize screenOrganize;
        Clip clip;
        ReadModel readModel;
        ZoomType zoomType;
        Layout layout;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j5;
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        View.OnClickListener onClickListener3;
        View.OnClickListener onClickListenerZ;
        View.OnClickListener onClickListenerG0;
        View.OnClickListener onClickListenerE0;
        boolean z6;
        long j6;
        boolean z7;
        Drawable drawableB;
        long j7;
        Drawable drawableB2;
        Drawable drawableB3;
        long j8;
        Drawable drawableB4;
        long j9;
        Drawable drawableB5;
        Drawable drawable;
        long j10;
        long j11;
        Drawable drawableB6;
        long j12;
        Drawable drawable2;
        boolean z8;
        int i;
        long j13;
        boolean z9;
        Context context;
        int i2;
        long j14;
        boolean z10;
        Context context2;
        int i3;
        long j15;
        boolean z11;
        Context context3;
        int i4;
        long j16;
        boolean z12;
        Context context4;
        int i5;
        long j17;
        androidx.databinding.u uVarR0;
        synchronized (this) {
            j = this.O;
            this.O = 0L;
        }
        n6 n6Var = this.F;
        com.zentraedi.comic.viewmodel.q3 q3Var = this.E;
        long j18 = 67108864;
        Drawable drawable3 = null;
        if ((191 & j) != 0) {
            long j19 = j & 161;
            if (j19 != 0) {
                androidx.databinding.u uVarS0 = n6Var != null ? n6Var.S0() : null;
                j3 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                p1(0, uVarS0);
                readModel = uVarS0 != null ? (ReadModel) uVarS0.get() : null;
                z2 = readModel == ReadModel.NORMAL_NULL;
                if (j19 != 0) {
                    j = z2 ? j | 131072 : j | 65536;
                }
            } else {
                j3 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                z2 = false;
                readModel = null;
            }
            long j20 = j & 162;
            if (j20 != 0) {
                androidx.databinding.u uVarQ0 = n6Var != null ? n6Var.Q0() : null;
                p1(1, uVarQ0);
                clip = uVarQ0 != null ? (Clip) uVarQ0.get() : null;
                z = clip == Clip.CUSTOM;
                if (j20 != 0) {
                    j = z ? j | 134217728 : j | 67108864;
                }
            } else {
                clip = null;
                z = false;
            }
            long j21 = j & 164;
            if (j21 != 0) {
                androidx.databinding.u uVarV0 = n6Var != null ? n6Var.V0() : null;
                j4 = 16777216;
                p1(2, uVarV0);
                zoomType = uVarV0 != null ? (ZoomType) uVarV0.get() : null;
                z3 = zoomType == ZoomType.CUSTOM;
                if (j21 != 0) {
                    j = z3 ? j | 32768 : j | 16384;
                }
            } else {
                j4 = 16777216;
                zoomType = null;
                z3 = false;
            }
            long j22 = j & 168;
            if (j22 != 0) {
                if (n6Var != null) {
                    uVarR0 = n6Var.R0();
                    j2 = 16384;
                } else {
                    j2 = 16384;
                    uVarR0 = null;
                }
                p1(3, uVarR0);
                layout = uVarR0 != null ? (Layout) uVarR0.get() : null;
                z4 = layout == Layout.COMMON;
                if (j22 != 0) {
                    j = z4 ? j | 33554432 : j | j4;
                }
            } else {
                j2 = 16384;
                layout = null;
                z4 = false;
            }
            long j23 = j & 176;
            if (j23 != 0) {
                ObservableField<ScreenOrganize> observableFieldU0 = n6Var != null ? n6Var.U0() : null;
                j18 = 67108864;
                p1(4, observableFieldU0);
                screenOrganize = observableFieldU0 != null ? (ScreenOrganize) observableFieldU0.get() : null;
                z5 = screenOrganize == ScreenOrganize.LANDSCAPE;
                if (j23 != 0) {
                    j = z5 ? j | ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX : j | j3;
                }
            } else {
                screenOrganize = null;
            }
            if ((j & 192) != 0 || q3Var == null) {
                j5 = j;
                onClickListener = null;
                onClickListener2 = null;
                onClickListener3 = null;
                onClickListenerZ = null;
                onClickListenerG0 = null;
                onClickListenerE0 = null;
            } else {
                onClickListenerG0 = q3Var.g0();
                onClickListenerE0 = q3Var.e0();
                View.OnClickListener onClickListenerC0 = q3Var.c0();
                View.OnClickListener onClickListenerD0 = q3Var.d0();
                View.OnClickListener onClickListenerB0 = q3Var.b0();
                onClickListenerZ = q3Var.Z();
                onClickListener3 = onClickListenerB0;
                long j24 = j;
                onClickListener = onClickListenerC0;
                onClickListener2 = onClickListenerD0;
                j5 = j24;
            }
            if ((j5 & 65536) != 0) {
                z6 = z2;
                boolean z13 = readModel == ReadModel.SCROLL_READ;
                j6 = j5 & j2;
                z7 = z13;
                if (j6 != 0) {
                    if (zoomType == ZoomType.HEIGHT) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (j6 != 0) {
                        if (z12) {
                            j17 = 536870912;
                        } else {
                            j17 = 268435456;
                        }
                        j5 |= j17;
                    }
                    if (z12) {
                        context4 = this.L.getContext();
                        i5 = com.zentraedi.comic.q.h.xG;
                    } else {
                        context4 = this.L.getContext();
                        i5 = com.zentraedi.comic.q.h.AG;
                    }
                    drawableB = g.a.b(context4, i5);
                } else {
                    drawableB = null;
                }
                j7 = j5 & j4;
                drawableB2 = drawableB;
                if (j7 != 0) {
                    if (layout == Layout.SINGLE) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j7 != 0) {
                        if (z11) {
                            j16 = 8192;
                        } else {
                            j16 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                        }
                        j5 |= j16;
                    }
                    if (z11) {
                        context3 = this.K.getContext();
                        i4 = com.zentraedi.comic.q.h.bG;
                    } else {
                        context3 = this.K.getContext();
                        i4 = com.zentraedi.comic.q.h.pG;
                    }
                    drawableB3 = g.a.b(context3, i4);
                } else {
                    drawableB3 = null;
                }
                j8 = j5 & j3;
                if (j8 != 0) {
                    if (screenOrganize == ScreenOrganize.VERTICAL) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (j8 != 0) {
                        if (z10) {
                            j15 = 524288;
                        } else {
                            j15 = 262144;
                        }
                        j5 |= j15;
                    }
                    if (z10) {
                        context2 = this.J.getContext();
                        i3 = com.zentraedi.comic.q.h.mG;
                    } else {
                        context2 = this.J.getContext();
                        i3 = com.zentraedi.comic.q.h.jG;
                    }
                    drawableB4 = g.a.b(context2, i3);
                } else {
                    drawableB4 = null;
                }
                j9 = j5 & j18;
                if (j9 != 0) {
                    if (clip == Clip.WHITE) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (j9 != 0) {
                        if (z9) {
                            j14 = 512;
                        } else {
                            j14 = 256;
                        }
                        j5 |= j14;
                    }
                    if (z9) {
                        context = this.M.getContext();
                        i2 = com.zentraedi.comic.q.h.HF;
                    } else {
                        context = this.M.getContext();
                        i2 = com.zentraedi.comic.q.h.MF;
                    }
                    drawableB5 = g.a.b(context, i2);
                } else {
                    drawableB5 = null;
                }
                if ((j5 & 176) != 0) {
                    drawableB4 = null;
                } else if (z5) {
                    drawableB4 = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.gG);
                }
                if ((j5 & 164) != 0) {
                    if (z3) {
                        drawableB2 = g.a.b(this.L.getContext(), com.zentraedi.comic.q.h.jE);
                    }
                    drawable = drawableB2;
                } else {
                    drawable = null;
                }
                j10 = j5 & 161;
                if (j10 != 0) {
                    if (z6) {
                        z7 = true;
                    }
                    if (j10 != 0) {
                        if (z7) {
                            j5 |= 2097152;
                        } else {
                            j5 |= 1048576;
                        }
                    }
                } else {
                    z7 = false;
                }
                if ((j5 & 168) != 0) {
                    drawableB3 = null;
                } else if (z4) {
                    drawableB3 = g.a.b(this.K.getContext(), com.zentraedi.comic.q.h.eG);
                }
                if ((j5 & 162) != 0) {
                    drawableB5 = null;
                } else if (z) {
                    drawableB5 = g.a.b(this.M.getContext(), com.zentraedi.comic.q.h.KF);
                }
                j11 = j5 & 1048576;
                if (j11 != 0) {
                    if (readModel == ReadModel.MANGA_READ) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (j11 != 0) {
                        if (z8) {
                            j13 = 8388608;
                        } else {
                            j13 = 4194304;
                        }
                        j5 |= j13;
                    }
                    Context context5 = this.I.getContext();
                    if (z8) {
                        i = com.zentraedi.comic.q.h.WF;
                    } else {
                        i = com.zentraedi.comic.q.h.UF;
                    }
                    drawableB6 = g.a.b(context5, i);
                } else {
                    drawableB6 = null;
                }
                j12 = j5 & 161;
                if (j12 != 0) {
                    if (z7) {
                        drawableB6 = g.a.b(this.I.getContext(), com.zentraedi.comic.q.h.RF);
                    }
                    drawable3 = drawableB6;
                }
                drawable2 = drawable3;
                if ((j5 & 128) != 0) {
                    com.zentraedi.business.utils.u.b0(this.H, g8.h() + com.zentraedi.basic.function.utils.m0.b(70.0f));
                }
                if ((j5 & 192) != 0) {
                    this.I.setOnClickListener(onClickListener);
                    this.J.setOnClickListener(onClickListenerG0);
                    this.K.setOnClickListener(onClickListenerE0);
                    this.L.setOnClickListener(onClickListener2);
                    this.M.setOnClickListener(onClickListener3);
                    this.N.setOnClickListener(onClickListenerZ);
                }
                if (j12 != 0) {
                    androidx.databinding.adapters.p.a(this.I, drawable2);
                }
                if ((j5 & 176) != 0) {
                    androidx.databinding.adapters.p.a(this.J, drawableB4);
                }
                if ((j5 & 168) != 0) {
                    androidx.databinding.adapters.p.a(this.K, drawableB3);
                }
                if ((j5 & 164) != 0) {
                    androidx.databinding.adapters.p.a(this.L, drawable);
                }
                if ((j5 & 162) != 0) {
                    androidx.databinding.adapters.p.a(this.M, drawableB5);
                }
            }
            z6 = z2;
            j6 = j5 & j2;
            z7 = z13;
            if (j6 != 0) {
                if (zoomType == ZoomType.HEIGHT) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (j6 != 0) {
                    if (z12) {
                        j17 = 536870912;
                    } else {
                        j17 = 268435456;
                    }
                    j5 |= j17;
                }
                if (z12) {
                    context4 = this.L.getContext();
                    i5 = com.zentraedi.comic.q.h.xG;
                } else {
                    context4 = this.L.getContext();
                    i5 = com.zentraedi.comic.q.h.AG;
                }
                drawableB = g.a.b(context4, i5);
            } else {
                drawableB = null;
            }
            j7 = j5 & j4;
            drawableB2 = drawableB;
            if (j7 != 0) {
                if (layout == Layout.SINGLE) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (j7 != 0) {
                    if (z11) {
                        j16 = 8192;
                    } else {
                        j16 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                    }
                    j5 |= j16;
                }
                if (z11) {
                    context3 = this.K.getContext();
                    i4 = com.zentraedi.comic.q.h.bG;
                } else {
                    context3 = this.K.getContext();
                    i4 = com.zentraedi.comic.q.h.pG;
                }
                drawableB3 = g.a.b(context3, i4);
            } else {
                drawableB3 = null;
            }
            j8 = j5 & j3;
            if (j8 != 0) {
                if (screenOrganize == ScreenOrganize.VERTICAL) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (j8 != 0) {
                    if (z10) {
                        j15 = 524288;
                    } else {
                        j15 = 262144;
                    }
                    j5 |= j15;
                }
                if (z10) {
                    context2 = this.J.getContext();
                    i3 = com.zentraedi.comic.q.h.mG;
                } else {
                    context2 = this.J.getContext();
                    i3 = com.zentraedi.comic.q.h.jG;
                }
                drawableB4 = g.a.b(context2, i3);
            } else {
                drawableB4 = null;
            }
            j9 = j5 & j18;
            if (j9 != 0) {
                if (clip == Clip.WHITE) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (j9 != 0) {
                    if (z9) {
                        j14 = 512;
                    } else {
                        j14 = 256;
                    }
                    j5 |= j14;
                }
                if (z9) {
                    context = this.M.getContext();
                    i2 = com.zentraedi.comic.q.h.HF;
                } else {
                    context = this.M.getContext();
                    i2 = com.zentraedi.comic.q.h.MF;
                }
                drawableB5 = g.a.b(context, i2);
            } else {
                drawableB5 = null;
            }
            if ((j5 & 176) != 0) {
                drawableB4 = null;
            } else if (z5) {
                drawableB4 = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.gG);
            }
            if ((j5 & 164) != 0) {
                if (z3) {
                    drawableB2 = g.a.b(this.L.getContext(), com.zentraedi.comic.q.h.jE);
                }
                drawable = drawableB2;
            } else {
                drawable = null;
            }
            j10 = j5 & 161;
            if (j10 != 0) {
                if (z6) {
                    z7 = true;
                }
                if (j10 != 0) {
                    if (z7) {
                        j5 |= 2097152;
                    } else {
                        j5 |= 1048576;
                    }
                }
            } else {
                z7 = false;
            }
            if ((j5 & 168) != 0) {
                drawableB3 = null;
            } else if (z4) {
                drawableB3 = g.a.b(this.K.getContext(), com.zentraedi.comic.q.h.eG);
            }
            if ((j5 & 162) != 0) {
                drawableB5 = null;
            } else if (z) {
                drawableB5 = g.a.b(this.M.getContext(), com.zentraedi.comic.q.h.KF);
            }
            j11 = j5 & 1048576;
            if (j11 != 0) {
                if (readModel == ReadModel.MANGA_READ) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (j11 != 0) {
                    if (z8) {
                        j13 = 8388608;
                    } else {
                        j13 = 4194304;
                    }
                    j5 |= j13;
                }
                Context context6 = this.I.getContext();
                if (z8) {
                    i = com.zentraedi.comic.q.h.WF;
                } else {
                    i = com.zentraedi.comic.q.h.UF;
                }
                drawableB6 = g.a.b(context6, i);
            } else {
                drawableB6 = null;
            }
            j12 = j5 & 161;
            if (j12 != 0) {
                if (z7) {
                    drawableB6 = g.a.b(this.I.getContext(), com.zentraedi.comic.q.h.RF);
                }
                drawable3 = drawableB6;
            }
            drawable2 = drawable3;
            if ((j5 & 128) != 0) {
                com.zentraedi.business.utils.u.b0(this.H, g8.h() + com.zentraedi.basic.function.utils.m0.b(70.0f));
            }
            if ((j5 & 192) != 0) {
                this.I.setOnClickListener(onClickListener);
                this.J.setOnClickListener(onClickListenerG0);
                this.K.setOnClickListener(onClickListenerE0);
                this.L.setOnClickListener(onClickListener2);
                this.M.setOnClickListener(onClickListener3);
                this.N.setOnClickListener(onClickListenerZ);
            }
            if (j12 != 0) {
                androidx.databinding.adapters.p.a(this.I, drawable2);
            }
            if ((j5 & 176) != 0) {
                androidx.databinding.adapters.p.a(this.J, drawableB4);
            }
            if ((j5 & 168) != 0) {
                androidx.databinding.adapters.p.a(this.K, drawableB3);
            }
            if ((j5 & 164) != 0) {
                androidx.databinding.adapters.p.a(this.L, drawable);
            }
            if ((j5 & 162) != 0) {
                androidx.databinding.adapters.p.a(this.M, drawableB5);
            }
        }
        j2 = 16384;
        j3 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        j4 = 16777216;
        screenOrganize = null;
        clip = null;
        readModel = null;
        zoomType = null;
        layout = null;
        z = false;
        z2 = false;
        z3 = false;
        z4 = false;
        z5 = false;
        if ((j & 192) != 0) {
            j5 = j;
            onClickListener = null;
            onClickListener2 = null;
            onClickListener3 = null;
            onClickListenerZ = null;
            onClickListenerG0 = null;
            onClickListenerE0 = null;
        } else {
            j5 = j;
            onClickListener = null;
            onClickListener2 = null;
            onClickListener3 = null;
            onClickListenerZ = null;
            onClickListenerG0 = null;
            onClickListenerE0 = null;
        }
        if ((j5 & 65536) != 0) {
            z6 = z2;
            if (readModel == ReadModel.SCROLL_READ) {
            }
            j6 = j5 & j2;
            z7 = z13;
            if (j6 != 0) {
                if (zoomType == ZoomType.HEIGHT) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (j6 != 0) {
                    if (z12) {
                        j17 = 536870912;
                    } else {
                        j17 = 268435456;
                    }
                    j5 |= j17;
                }
                if (z12) {
                    context4 = this.L.getContext();
                    i5 = com.zentraedi.comic.q.h.xG;
                } else {
                    context4 = this.L.getContext();
                    i5 = com.zentraedi.comic.q.h.AG;
                }
                drawableB = g.a.b(context4, i5);
            } else {
                drawableB = null;
            }
            j7 = j5 & j4;
            drawableB2 = drawableB;
            if (j7 != 0) {
                if (layout == Layout.SINGLE) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (j7 != 0) {
                    if (z11) {
                        j16 = 8192;
                    } else {
                        j16 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                    }
                    j5 |= j16;
                }
                if (z11) {
                    context3 = this.K.getContext();
                    i4 = com.zentraedi.comic.q.h.bG;
                } else {
                    context3 = this.K.getContext();
                    i4 = com.zentraedi.comic.q.h.pG;
                }
                drawableB3 = g.a.b(context3, i4);
            } else {
                drawableB3 = null;
            }
            j8 = j5 & j3;
            if (j8 != 0) {
                if (screenOrganize == ScreenOrganize.VERTICAL) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (j8 != 0) {
                    if (z10) {
                        j15 = 524288;
                    } else {
                        j15 = 262144;
                    }
                    j5 |= j15;
                }
                if (z10) {
                    context2 = this.J.getContext();
                    i3 = com.zentraedi.comic.q.h.mG;
                } else {
                    context2 = this.J.getContext();
                    i3 = com.zentraedi.comic.q.h.jG;
                }
                drawableB4 = g.a.b(context2, i3);
            } else {
                drawableB4 = null;
            }
            j9 = j5 & j18;
            if (j9 != 0) {
                if (clip == Clip.WHITE) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (j9 != 0) {
                    if (z9) {
                        j14 = 512;
                    } else {
                        j14 = 256;
                    }
                    j5 |= j14;
                }
                if (z9) {
                    context = this.M.getContext();
                    i2 = com.zentraedi.comic.q.h.HF;
                } else {
                    context = this.M.getContext();
                    i2 = com.zentraedi.comic.q.h.MF;
                }
                drawableB5 = g.a.b(context, i2);
            } else {
                drawableB5 = null;
            }
            if ((j5 & 176) != 0) {
                drawableB4 = null;
            } else if (z5) {
                drawableB4 = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.gG);
            }
            if ((j5 & 164) != 0) {
                if (z3) {
                    drawableB2 = g.a.b(this.L.getContext(), com.zentraedi.comic.q.h.jE);
                }
                drawable = drawableB2;
            } else {
                drawable = null;
            }
            j10 = j5 & 161;
            if (j10 != 0) {
                if (z6) {
                    z7 = true;
                }
                if (j10 != 0) {
                    if (z7) {
                        j5 |= 2097152;
                    } else {
                        j5 |= 1048576;
                    }
                }
            } else {
                z7 = false;
            }
            if ((j5 & 168) != 0) {
                drawableB3 = null;
            } else if (z4) {
                drawableB3 = g.a.b(this.K.getContext(), com.zentraedi.comic.q.h.eG);
            }
            if ((j5 & 162) != 0) {
                drawableB5 = null;
            } else if (z) {
                drawableB5 = g.a.b(this.M.getContext(), com.zentraedi.comic.q.h.KF);
            }
            j11 = j5 & 1048576;
            if (j11 != 0) {
                if (readModel == ReadModel.MANGA_READ) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (j11 != 0) {
                    if (z8) {
                        j13 = 8388608;
                    } else {
                        j13 = 4194304;
                    }
                    j5 |= j13;
                }
                Context context7 = this.I.getContext();
                if (z8) {
                    i = com.zentraedi.comic.q.h.WF;
                } else {
                    i = com.zentraedi.comic.q.h.UF;
                }
                drawableB6 = g.a.b(context7, i);
            } else {
                drawableB6 = null;
            }
            j12 = j5 & 161;
            if (j12 != 0) {
                if (z7) {
                    drawableB6 = g.a.b(this.I.getContext(), com.zentraedi.comic.q.h.RF);
                }
                drawable3 = drawableB6;
            }
            drawable2 = drawable3;
            if ((j5 & 128) != 0) {
                com.zentraedi.business.utils.u.b0(this.H, g8.h() + com.zentraedi.basic.function.utils.m0.b(70.0f));
            }
            if ((j5 & 192) != 0) {
                this.I.setOnClickListener(onClickListener);
                this.J.setOnClickListener(onClickListenerG0);
                this.K.setOnClickListener(onClickListenerE0);
                this.L.setOnClickListener(onClickListener2);
                this.M.setOnClickListener(onClickListener3);
                this.N.setOnClickListener(onClickListenerZ);
            }
            if (j12 != 0) {
                androidx.databinding.adapters.p.a(this.I, drawable2);
            }
            if ((j5 & 176) != 0) {
                androidx.databinding.adapters.p.a(this.J, drawableB4);
            }
            if ((j5 & 168) != 0) {
                androidx.databinding.adapters.p.a(this.K, drawableB3);
            }
            if ((j5 & 164) != 0) {
                androidx.databinding.adapters.p.a(this.L, drawable);
            }
            if ((j5 & 162) != 0) {
                androidx.databinding.adapters.p.a(this.M, drawableB5);
            }
        }
        z6 = z2;
        j6 = j5 & j2;
        z7 = z13;
        if (j6 != 0) {
            if (zoomType == ZoomType.HEIGHT) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (j6 != 0) {
                if (z12) {
                    j17 = 536870912;
                } else {
                    j17 = 268435456;
                }
                j5 |= j17;
            }
            if (z12) {
                context4 = this.L.getContext();
                i5 = com.zentraedi.comic.q.h.xG;
            } else {
                context4 = this.L.getContext();
                i5 = com.zentraedi.comic.q.h.AG;
            }
            drawableB = g.a.b(context4, i5);
        } else {
            drawableB = null;
        }
        j7 = j5 & j4;
        drawableB2 = drawableB;
        if (j7 != 0) {
            if (layout == Layout.SINGLE) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (j7 != 0) {
                if (z11) {
                    j16 = 8192;
                } else {
                    j16 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                }
                j5 |= j16;
            }
            if (z11) {
                context3 = this.K.getContext();
                i4 = com.zentraedi.comic.q.h.bG;
            } else {
                context3 = this.K.getContext();
                i4 = com.zentraedi.comic.q.h.pG;
            }
            drawableB3 = g.a.b(context3, i4);
        } else {
            drawableB3 = null;
        }
        j8 = j5 & j3;
        if (j8 != 0) {
            if (screenOrganize == ScreenOrganize.VERTICAL) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (j8 != 0) {
                if (z10) {
                    j15 = 524288;
                } else {
                    j15 = 262144;
                }
                j5 |= j15;
            }
            if (z10) {
                context2 = this.J.getContext();
                i3 = com.zentraedi.comic.q.h.mG;
            } else {
                context2 = this.J.getContext();
                i3 = com.zentraedi.comic.q.h.jG;
            }
            drawableB4 = g.a.b(context2, i3);
        } else {
            drawableB4 = null;
        }
        j9 = j5 & j18;
        if (j9 != 0) {
            if (clip == Clip.WHITE) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (j9 != 0) {
                if (z9) {
                    j14 = 512;
                } else {
                    j14 = 256;
                }
                j5 |= j14;
            }
            if (z9) {
                context = this.M.getContext();
                i2 = com.zentraedi.comic.q.h.HF;
            } else {
                context = this.M.getContext();
                i2 = com.zentraedi.comic.q.h.MF;
            }
            drawableB5 = g.a.b(context, i2);
        } else {
            drawableB5 = null;
        }
        if ((j5 & 176) != 0) {
            drawableB4 = null;
        } else if (z5) {
            drawableB4 = g.a.b(this.J.getContext(), com.zentraedi.comic.q.h.gG);
        }
        if ((j5 & 164) != 0) {
            if (z3) {
                drawableB2 = g.a.b(this.L.getContext(), com.zentraedi.comic.q.h.jE);
            }
            drawable = drawableB2;
        } else {
            drawable = null;
        }
        j10 = j5 & 161;
        if (j10 != 0) {
            if (z6) {
                z7 = true;
            }
            if (j10 != 0) {
                if (z7) {
                    j5 |= 2097152;
                } else {
                    j5 |= 1048576;
                }
            }
        } else {
            z7 = false;
        }
        if ((j5 & 168) != 0) {
            drawableB3 = null;
        } else if (z4) {
            drawableB3 = g.a.b(this.K.getContext(), com.zentraedi.comic.q.h.eG);
        }
        if ((j5 & 162) != 0) {
            drawableB5 = null;
        } else if (z) {
            drawableB5 = g.a.b(this.M.getContext(), com.zentraedi.comic.q.h.KF);
        }
        j11 = j5 & 1048576;
        if (j11 != 0) {
            if (readModel == ReadModel.MANGA_READ) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (j11 != 0) {
                if (z8) {
                    j13 = 8388608;
                } else {
                    j13 = 4194304;
                }
                j5 |= j13;
            }
            Context context8 = this.I.getContext();
            if (z8) {
                i = com.zentraedi.comic.q.h.WF;
            } else {
                i = com.zentraedi.comic.q.h.UF;
            }
            drawableB6 = g.a.b(context8, i);
        } else {
            drawableB6 = null;
        }
        j12 = j5 & 161;
        if (j12 != 0) {
            if (z7) {
                drawableB6 = g.a.b(this.I.getContext(), com.zentraedi.comic.q.h.RF);
            }
            drawable3 = drawableB6;
        }
        drawable2 = drawable3;
        if ((j5 & 128) != 0) {
            com.zentraedi.business.utils.u.b0(this.H, g8.h() + com.zentraedi.basic.function.utils.m0.b(70.0f));
        }
        if ((j5 & 192) != 0) {
            this.I.setOnClickListener(onClickListener);
            this.J.setOnClickListener(onClickListenerG0);
            this.K.setOnClickListener(onClickListenerE0);
            this.L.setOnClickListener(onClickListener2);
            this.M.setOnClickListener(onClickListener3);
            this.N.setOnClickListener(onClickListenerZ);
        }
        if (j12 != 0) {
            androidx.databinding.adapters.p.a(this.I, drawable2);
        }
        if ((j5 & 176) != 0) {
            androidx.databinding.adapters.p.a(this.J, drawableB4);
        }
        if ((j5 & 168) != 0) {
            androidx.databinding.adapters.p.a(this.K, drawableB3);
        }
        if ((j5 & 164) != 0) {
            androidx.databinding.adapters.p.a(this.L, drawable);
        }
        if ((j5 & 162) != 0) {
            androidx.databinding.adapters.p.a(this.M, drawableB5);
        }
    }

    private c5(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 5);
        this.O = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.H = linearLayout2;
        linearLayout2.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.I = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[3];
        this.J = imageView2;
        imageView2.setTag(null);
        ImageView imageView3 = (ImageView) objArr[4];
        this.K = imageView3;
        imageView3.setTag(null);
        ImageView imageView4 = (ImageView) objArr[5];
        this.L = imageView4;
        imageView4.setTag(null);
        ImageView imageView5 = (ImageView) objArr[6];
        this.M = imageView5;
        imageView5.setTag(null);
        ImageView imageView6 = (ImageView) objArr[7];
        this.N = imageView6;
        imageView6.setTag(null);
        P0(view);
        i0();
    }
}
