package com.zentraedi.comic.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.databinding.ObservableField;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class j0 extends i0 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i a0 = null;

    @androidx.annotation.p0
    private static final SparseIntArray b0;

    @androidx.annotation.n0
    private final LinearLayout Q;

    @androidx.annotation.n0
    private final TextView R;

    @androidx.annotation.n0
    private final TextView S;

    @androidx.annotation.n0
    private final TextView T;

    @androidx.annotation.p0
    private final View.OnClickListener U;
    private androidx.databinding.o V;
    private androidx.databinding.o W;
    private androidx.databinding.o X;
    private androidx.databinding.o Y;
    private long Z;

    class a implements androidx.databinding.o {
        a() {
        }

        public void a() {
            ObservableField<Boolean> observableFieldG0;
            boolean zIsChecked = j0.this.F.isChecked();
            n6 n6Var = j0.this.P;
            if (n6Var == null || (observableFieldG0 = n6Var.G0()) == null) {
                return;
            }
            observableFieldG0.set(Boolean.valueOf(zIsChecked));
        }
    }

    class b implements androidx.databinding.o {
        b() {
        }

        public void a() {
            ObservableField<Boolean> observableFieldH0;
            boolean zIsChecked = j0.this.G.isChecked();
            n6 n6Var = j0.this.P;
            if (n6Var == null || (observableFieldH0 = n6Var.H0()) == null) {
                return;
            }
            observableFieldH0.set(Boolean.valueOf(zIsChecked));
        }
    }

    class c implements androidx.databinding.o {
        c() {
        }

        public void a() {
            ObservableField<Boolean> observableFieldI0;
            boolean zIsChecked = j0.this.I.isChecked();
            n6 n6Var = j0.this.P;
            if (n6Var == null || (observableFieldI0 = n6Var.I0()) == null) {
                return;
            }
            observableFieldI0.set(Boolean.valueOf(zIsChecked));
        }
    }

    class d implements androidx.databinding.o {
        d() {
        }

        public void a() {
            ObservableField<Boolean> observableFieldJ0;
            boolean zIsChecked = j0.this.L.isChecked();
            n6 n6Var = j0.this.P;
            if (n6Var == null || (observableFieldJ0 = n6Var.J0()) == null) {
                return;
            }
            observableFieldJ0.set(Boolean.valueOf(zIsChecked));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.iB, 12);
    }

    public j0(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 13, a0, b0));
    }

    private boolean I1(ObservableField<Integer> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Z |= 4;
        }
        return true;
    }

    private boolean J1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Z |= 256;
        }
        return true;
    }

    private boolean K1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Z |= 64;
        }
        return true;
    }

    private boolean L1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Z |= 8;
        }
        return true;
    }

    private boolean N1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Z |= 32;
        }
        return true;
    }

    private boolean O1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Z |= 512;
        }
        return true;
    }

    private boolean P1(ObservableField<Integer> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Z |= 16;
        }
        return true;
    }

    private boolean Q1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Z |= 2;
        }
        return true;
    }

    private boolean R1(ObservableField<Integer> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Z |= 128;
        }
        return true;
    }

    private boolean S1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.Z |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.i0
    public void E1(@androidx.annotation.p0 Layout layout) {
        this.N = layout;
    }

    @Override // com.zentraedi.comic.databinding.i0
    public void F1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.q3 q3Var) {
        this.O = q3Var;
        synchronized (this) {
            this.Z |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.g2);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.i0
    public void G1(@androidx.annotation.p0 n6 n6Var) {
        this.P = n6Var;
        synchronized (this) {
            this.Z |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.F3);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        com.zentraedi.comic.viewmodel.q3 q3Var = this.O;
        if (q3Var != null) {
            q3Var.closeDialog();
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.Z != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.Z = 8192L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.g2 == i) {
            F1((com.zentraedi.comic.viewmodel.q3) obj);
            return true;
        }
        if (com.zentraedi.comic.a.Q1 == i) {
            E1((Layout) obj);
            return true;
        }
        if (com.zentraedi.comic.a.F3 != i) {
            return false;
        }
        G1((n6) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return S1((ObservableField) obj, i2);
            case 1:
                return Q1((ObservableField) obj, i2);
            case 2:
                return I1((ObservableField) obj, i2);
            case 3:
                return L1((ObservableField) obj, i2);
            case 4:
                return P1((ObservableField) obj, i2);
            case 5:
                return N1((ObservableField) obj, i2);
            case 6:
                return K1((ObservableField) obj, i2);
            case 7:
                return R1((ObservableField) obj, i2);
            case 8:
                return J1((ObservableField) obj, i2);
            case 9:
                return O1((ObservableField) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0153  */
    /* JADX WARN: Code duplicated, block: B:103:0x015a  */
    /* JADX WARN: Code duplicated, block: B:104:0x015d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0169  */
    /* JADX WARN: Code duplicated, block: B:110:0x0170  */
    /* JADX WARN: Code duplicated, block: B:113:0x0178  */
    /* JADX WARN: Code duplicated, block: B:114:0x017f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0185  */
    /* JADX WARN: Code duplicated, block: B:119:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0190  */
    /* JADX WARN: Code duplicated, block: B:121:0x0195  */
    /* JADX WARN: Code duplicated, block: B:124:0x019d  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:135:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01db  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:147:0x0202  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108  */
    /* JADX WARN: Code duplicated, block: B:81:0x010f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0115  */
    /* JADX WARN: Code duplicated, block: B:86:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x011e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0129  */
    /* JADX WARN: Code duplicated, block: B:91:0x0132  */
    /* JADX WARN: Code duplicated, block: B:92:0x0139  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0142  */
    /* JADX WARN: Code duplicated, block: B:98:0x0148  */
    protected void r() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Drawable drawableB;
        boolean z;
        String str;
        boolean z2;
        int iH0;
        String str2;
        boolean zK0;
        int iH1;
        boolean zK1;
        String str3;
        Drawable drawable;
        int iH2;
        Drawable drawable2;
        String str4;
        String str5;
        long j6;
        Drawable drawableB2;
        long j7;
        Drawable drawableB3;
        boolean zK2;
        String str6;
        long j8;
        ObservableField<Boolean> observableFieldJ0;
        long j9;
        Boolean bool;
        boolean zK3;
        long j10;
        ObservableField<String> observableFieldE0;
        ObservableField<Integer> observableFieldD1;
        Integer num;
        androidx.databinding.u uVarG0;
        Boolean bool2;
        int i;
        long j11;
        ObservableField<Boolean> observableFieldI0;
        Boolean bool3;
        ObservableField<Integer> observableFieldK0;
        Integer num2;
        androidx.databinding.u uVarH0;
        Boolean bool4;
        int i2;
        long j12;
        ObservableField<Integer> observableFieldD0;
        Integer num3;
        synchronized (this) {
            j = this.Z;
            this.Z = 0L;
        }
        n6 n6Var = this.P;
        long j13 = 12320;
        if ((13311 & j) != 0) {
            if ((j & 12289) == 0) {
                str4 = null;
            } else {
                ObservableField<String> observableFieldE1 = n6Var != null ? n6Var.e1() : null;
                p1(0, observableFieldE1);
                if (observableFieldE1 != null) {
                    str4 = (String) observableFieldE1.get();
                } else {
                    str4 = null;
                }
            }
            if ((j & 12290) != 0) {
                androidx.databinding.u uVarL0 = n6Var != null ? n6Var.L0() : null;
                j3 = 12800;
                p1(1, uVarL0);
                str5 = uVarL0 != null ? (String) uVarL0.get() : null;
                if ((j & 12292) != 0) {
                    if (n6Var != null) {
                        observableFieldD0 = n6Var.D0();
                    } else {
                        observableFieldD0 = null;
                    }
                    p1(2, observableFieldD0);
                    if (observableFieldD0 != null) {
                        num3 = (Integer) observableFieldD0.get();
                    } else {
                        num3 = null;
                    }
                    iH0 = androidx.databinding.c0.H0(num3);
                } else {
                    iH0 = 0;
                }
                j6 = j & 12296;
                if (j6 != 0) {
                    if (n6Var != null) {
                        uVarH0 = n6Var.H0();
                    } else {
                        uVarH0 = null;
                    }
                    j4 = 12544;
                    p1(3, uVarH0);
                    if (uVarH0 != null) {
                        bool4 = (Boolean) uVarH0.get();
                    } else {
                        bool4 = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool4);
                    if (j6 != 0) {
                        if (zK0) {
                            j12 = 131072;
                        } else {
                            j12 = 65536;
                        }
                        j |= j12;
                    }
                    Context context = this.H.getContext();
                    if (zK0) {
                        i2 = com.zentraedi.comic.q.h.UU;
                    } else {
                        i2 = com.zentraedi.comic.q.h.TU;
                    }
                    drawableB2 = g.a.b(context, i2);
                } else {
                    j4 = 12544;
                    drawableB2 = null;
                    zK0 = false;
                }
                if ((j & 12304) != 0) {
                    if (n6Var != null) {
                        observableFieldK0 = n6Var.K0();
                    } else {
                        observableFieldK0 = null;
                    }
                    j5 = 12416;
                    p1(4, observableFieldK0);
                    if (observableFieldK0 != null) {
                        num2 = (Integer) observableFieldK0.get();
                    } else {
                        num2 = null;
                    }
                    iH1 = androidx.databinding.c0.H0(num2);
                } else {
                    j5 = 12416;
                    iH1 = 0;
                }
                if ((j & 12320) != 0) {
                    if (n6Var != null) {
                        observableFieldI0 = n6Var.I0();
                    } else {
                        observableFieldI0 = null;
                    }
                    p1(5, observableFieldI0);
                    if (observableFieldI0 != null) {
                        bool3 = (Boolean) observableFieldI0.get();
                    } else {
                        bool3 = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool3);
                } else {
                    zK1 = false;
                }
                j7 = j & 12352;
                if (j7 != 0) {
                    if (n6Var != null) {
                        uVarG0 = n6Var.G0();
                        j2 = 12352;
                    } else {
                        j2 = 12352;
                        uVarG0 = null;
                    }
                    p1(6, uVarG0);
                    if (uVarG0 != null) {
                        bool2 = (Boolean) uVarG0.get();
                    } else {
                        bool2 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool2);
                    if (j7 != 0) {
                        if (zK2) {
                            j11 = 32768;
                        } else {
                            j11 = 16384;
                        }
                        j |= j11;
                    }
                    Context context2 = this.E.getContext();
                    if (zK2) {
                        i = com.zentraedi.comic.q.h.UU;
                    } else {
                        i = com.zentraedi.comic.q.h.TU;
                    }
                    drawableB3 = g.a.b(context2, i);
                } else {
                    j2 = 12352;
                    drawableB3 = null;
                    zK2 = false;
                }
                if ((j & j5) != 0) {
                    if (n6Var != null) {
                        observableFieldD1 = n6Var.d1();
                    } else {
                        observableFieldD1 = null;
                    }
                    p1(7, observableFieldD1);
                    if (observableFieldD1 != null) {
                        num = (Integer) observableFieldD1.get();
                    } else {
                        num = null;
                    }
                    iH2 = androidx.databinding.c0.H0(num);
                } else {
                    iH2 = 0;
                }
                if ((j & j4) == 0) {
                    str6 = null;
                } else {
                    if (n6Var != null) {
                        observableFieldE0 = n6Var.E0();
                    } else {
                        observableFieldE0 = null;
                    }
                    p1(8, observableFieldE0);
                    if (observableFieldE0 != null) {
                        str6 = (String) observableFieldE0.get();
                    } else {
                        str6 = null;
                    }
                }
                j8 = j & j3;
                if (j8 != 0) {
                    if (n6Var != null) {
                        observableFieldJ0 = n6Var.J0();
                    } else {
                        observableFieldJ0 = null;
                    }
                    j9 = j;
                    p1(9, observableFieldJ0);
                    if (observableFieldJ0 != null) {
                        bool = (Boolean) observableFieldJ0.get();
                    } else {
                        bool = null;
                    }
                    zK3 = androidx.databinding.c0.K0(bool);
                    if (j8 != 0) {
                        if (zK3) {
                            j10 = 524288;
                        } else {
                            j10 = 262144;
                        }
                        j = j9 | j10;
                    } else {
                        j = j9;
                    }
                    if (zK3) {
                        drawableB = g.a.b(this.M.getContext(), com.zentraedi.comic.q.h.UU);
                    } else {
                        drawableB = g.a.b(this.M.getContext(), com.zentraedi.comic.q.h.TU);
                    }
                    String str7 = str6;
                    str = str5;
                    z = zK2;
                    drawable = drawableB2;
                    str2 = str7;
                    drawable2 = drawableB3;
                    str3 = str4;
                    z2 = zK3;
                } else {
                    String str8 = str6;
                    str = str5;
                    z = zK2;
                    drawable = drawableB2;
                    str2 = str8;
                    drawable2 = drawableB3;
                    drawableB = null;
                    str3 = str4;
                    z2 = false;
                }
            } else {
                j3 = 12800;
            }
            if ((j & 12292) != 0) {
                if (n6Var != null) {
                    observableFieldD0 = n6Var.D0();
                } else {
                    observableFieldD0 = null;
                }
                p1(2, observableFieldD0);
                if (observableFieldD0 != null) {
                    num3 = (Integer) observableFieldD0.get();
                } else {
                    num3 = null;
                }
                iH0 = androidx.databinding.c0.H0(num3);
            } else {
                iH0 = 0;
            }
            j6 = j & 12296;
            if (j6 != 0) {
                if (n6Var != null) {
                    uVarH0 = n6Var.H0();
                } else {
                    uVarH0 = null;
                }
                j4 = 12544;
                p1(3, uVarH0);
                if (uVarH0 != null) {
                    bool4 = (Boolean) uVarH0.get();
                } else {
                    bool4 = null;
                }
                zK0 = androidx.databinding.c0.K0(bool4);
                if (j6 != 0) {
                    if (zK0) {
                        j12 = 131072;
                    } else {
                        j12 = 65536;
                    }
                    j |= j12;
                }
                Context context3 = this.H.getContext();
                if (zK0) {
                    i2 = com.zentraedi.comic.q.h.UU;
                } else {
                    i2 = com.zentraedi.comic.q.h.TU;
                }
                drawableB2 = g.a.b(context3, i2);
            } else {
                j4 = 12544;
                drawableB2 = null;
                zK0 = false;
            }
            if ((j & 12304) != 0) {
                if (n6Var != null) {
                    observableFieldK0 = n6Var.K0();
                } else {
                    observableFieldK0 = null;
                }
                j5 = 12416;
                p1(4, observableFieldK0);
                if (observableFieldK0 != null) {
                    num2 = (Integer) observableFieldK0.get();
                } else {
                    num2 = null;
                }
                iH1 = androidx.databinding.c0.H0(num2);
            } else {
                j5 = 12416;
                iH1 = 0;
            }
            if ((j & 12320) != 0) {
                if (n6Var != null) {
                    observableFieldI0 = n6Var.I0();
                } else {
                    observableFieldI0 = null;
                }
                p1(5, observableFieldI0);
                if (observableFieldI0 != null) {
                    bool3 = (Boolean) observableFieldI0.get();
                } else {
                    bool3 = null;
                }
                zK1 = androidx.databinding.c0.K0(bool3);
            } else {
                zK1 = false;
            }
            j7 = j & 12352;
            if (j7 != 0) {
                if (n6Var != null) {
                    uVarG0 = n6Var.G0();
                    j2 = 12352;
                } else {
                    j2 = 12352;
                    uVarG0 = null;
                }
                p1(6, uVarG0);
                if (uVarG0 != null) {
                    bool2 = (Boolean) uVarG0.get();
                } else {
                    bool2 = null;
                }
                zK2 = androidx.databinding.c0.K0(bool2);
                if (j7 != 0) {
                    if (zK2) {
                        j11 = 32768;
                    } else {
                        j11 = 16384;
                    }
                    j |= j11;
                }
                Context context4 = this.E.getContext();
                if (zK2) {
                    i = com.zentraedi.comic.q.h.UU;
                } else {
                    i = com.zentraedi.comic.q.h.TU;
                }
                drawableB3 = g.a.b(context4, i);
            } else {
                j2 = 12352;
                drawableB3 = null;
                zK2 = false;
            }
            if ((j & j5) != 0) {
                if (n6Var != null) {
                    observableFieldD1 = n6Var.d1();
                } else {
                    observableFieldD1 = null;
                }
                p1(7, observableFieldD1);
                if (observableFieldD1 != null) {
                    num = (Integer) observableFieldD1.get();
                } else {
                    num = null;
                }
                iH2 = androidx.databinding.c0.H0(num);
            } else {
                iH2 = 0;
            }
            if ((j & j4) == 0) {
                str6 = null;
            } else {
                if (n6Var != null) {
                    observableFieldE0 = n6Var.E0();
                } else {
                    observableFieldE0 = null;
                }
                p1(8, observableFieldE0);
                if (observableFieldE0 != null) {
                    str6 = (String) observableFieldE0.get();
                } else {
                    str6 = null;
                }
            }
            j8 = j & j3;
            if (j8 != 0) {
                if (n6Var != null) {
                    observableFieldJ0 = n6Var.J0();
                } else {
                    observableFieldJ0 = null;
                }
                j9 = j;
                p1(9, observableFieldJ0);
                if (observableFieldJ0 != null) {
                    bool = (Boolean) observableFieldJ0.get();
                } else {
                    bool = null;
                }
                zK3 = androidx.databinding.c0.K0(bool);
                if (j8 != 0) {
                    if (zK3) {
                        j10 = 524288;
                    } else {
                        j10 = 262144;
                    }
                    j = j9 | j10;
                } else {
                    j = j9;
                }
                if (zK3) {
                    drawableB = g.a.b(this.M.getContext(), com.zentraedi.comic.q.h.UU);
                } else {
                    drawableB = g.a.b(this.M.getContext(), com.zentraedi.comic.q.h.TU);
                }
                String str9 = str6;
                str = str5;
                z = zK2;
                drawable = drawableB2;
                str2 = str9;
                drawable2 = drawableB3;
                str3 = str4;
                z2 = zK3;
            } else {
                String str10 = str6;
                str = str5;
                z = zK2;
                drawable = drawableB2;
                str2 = str10;
                drawable2 = drawableB3;
                drawableB = null;
                str3 = str4;
                z2 = false;
            }
        } else {
            j2 = 12352;
            j13 = 12320;
            j3 = 12800;
            j4 = 12544;
            j5 = 12416;
            drawableB = null;
            z = false;
            str = null;
            z2 = false;
            iH0 = 0;
            str2 = null;
            zK0 = false;
            iH1 = 0;
            zK1 = false;
            str3 = null;
            drawable = null;
            iH2 = 0;
            drawable2 = null;
        }
        long j14 = j & j2;
        long j15 = j;
        if (j14 != 0) {
            this.E.setEnabled(z);
            this.E.setProgressDrawable(drawable2);
            androidx.databinding.adapters.k.a(this.F, z);
        }
        if ((j15 & 12292) != 0) {
            androidx.databinding.adapters.y.b(this.E, iH0);
        }
        if ((j15 & 8192) != 0) {
            androidx.databinding.adapters.k.b(this.F, (CompoundButton.OnCheckedChangeListener) null, this.V);
            androidx.databinding.adapters.k.b(this.G, (CompoundButton.OnCheckedChangeListener) null, this.W);
            androidx.databinding.adapters.k.b(this.I, (CompoundButton.OnCheckedChangeListener) null, this.X);
            this.J.setOnClickListener(this.U);
            androidx.databinding.adapters.k.b(this.L, (CompoundButton.OnCheckedChangeListener) null, this.Y);
        }
        if ((j15 & 12296) != 0) {
            androidx.databinding.adapters.k.a(this.G, zK0);
            this.H.setEnabled(zK0);
            this.H.setProgressDrawable(drawable);
        }
        if ((j15 & 12304) != 0) {
            androidx.databinding.adapters.y.b(this.H, iH1);
        }
        if ((j15 & j13) != 0) {
            androidx.databinding.adapters.k.a(this.I, zK1);
        }
        if ((j15 & j4) != 0) {
            androidx.databinding.adapters.f0.A(this.R, str2);
        }
        if ((j15 & 12290) != 0) {
            androidx.databinding.adapters.f0.A(this.S, str);
        }
        if ((j15 & 12289) != 0) {
            androidx.databinding.adapters.f0.A(this.T, str3);
        }
        if ((j15 & j3) != 0) {
            androidx.databinding.adapters.k.a(this.L, z2);
            this.M.setEnabled(z2);
            this.M.setProgressDrawable(drawableB);
        }
        if ((j15 & j5) != 0) {
            androidx.databinding.adapters.y.b(this.M, iH2);
        }
    }

    private j0(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 10, (AppCompatSeekBar) objArr[10], (CheckBox) objArr[9], (CheckBox) objArr[3], (AppCompatSeekBar) objArr[4], (CheckBox) objArr[2], (ImageView) objArr[1], (TextView) objArr[12], (CheckBox) objArr[6], (AppCompatSeekBar) objArr[7]);
        this.V = new a();
        this.W = new b();
        this.X = new c();
        this.Y = new d();
        this.Z = -1L;
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.Q = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[11];
        this.R = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.S = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[8];
        this.T = textView3;
        textView3.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        P0(view);
        this.U = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
