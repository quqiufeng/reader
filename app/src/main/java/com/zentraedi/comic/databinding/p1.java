package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.business.R;
import com.zentraedi.business.databinding.dq;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class p1 extends o1 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i Q;

    @androidx.annotation.p0
    private static final SparseIntArray R;

    @androidx.annotation.n0
    private final LinearLayout H;

    @androidx.annotation.n0
    private final TextView I;

    @androidx.annotation.n0
    private final LinearLayout J;

    @androidx.annotation.n0
    private final LinearLayout K;

    @androidx.annotation.n0
    private final TextView L;

    @androidx.annotation.n0
    private final FrameLayout M;

    @androidx.annotation.p0
    private final dq N;

    @androidx.annotation.p0
    private final View.OnClickListener O;
    private long P;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(9);
        Q = iVar;
        iVar.a(5, new String[]{"layout_list_empty"}, new int[]{7}, new int[]{R.layout.T7});
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.f5, 8);
    }

    public p1(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 9, Q, R));
    }

    private boolean D1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 4;
        }
        return true;
    }

    private boolean E1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 1;
        }
        return true;
    }

    private boolean F1(ObservableBoolean observableBoolean, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 8;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.P |= 2;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.o1
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.q qVar) {
        this.G = qVar;
        synchronized (this) {
            this.P |= 16;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.N.O0(p0Var);
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        com.zentraedi.comic.viewmodel.q qVar = this.G;
        if (qVar != null) {
            qVar.Q0();
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.P != 0) {
                    return true;
                }
                return this.N.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.P = 32L;
        }
        this.N.i0();
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.q) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return E1((ObservableBoolean) obj, i2);
        }
        if (i == 1) {
            return G1((ObservableField) obj, i2);
        }
        if (i == 2) {
            return D1((ObservableField) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return F1((ObservableBoolean) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x013c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x012d  */
    protected void r() {
        long j;
        long j2;
        long j3;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str2;
        long j4;
        String str3;
        long j5;
        boolean z;
        int i6;
        long j6;
        androidx.databinding.u uVarZ0;
        int length;
        boolean z2;
        long j7;
        synchronized (this) {
            j = this.P;
            this.P = 0L;
        }
        com.zentraedi.comic.viewmodel.q qVar = this.G;
        String strI0 = null;
        if ((63 & j) != 0) {
            long j8 = j & 49;
            if (j8 != 0) {
                androidx.databinding.u uVarH0 = qVar != null ? qVar.H0() : null;
                p1(0, uVarH0);
                boolean z3 = uVarH0 != null ? uVarH0.get() : false;
                if (j8 != 0) {
                    j |= z3 ? 10240L : 5120L;
                }
                i2 = z3 ? 0 : 8;
                i3 = z3 ? 8 : 0;
            } else {
                i2 = 0;
                i3 = 0;
            }
            if ((j & 50) != 0) {
                androidx.databinding.u title = qVar != null ? qVar.getTitle() : null;
                j3 = 56;
                p1(1, title);
                if (title != null) {
                    str2 = (String) title.get();
                }
                j4 = j & 52;
                if (j4 != 0) {
                    if (qVar != null) {
                        uVarZ0 = qVar.z0();
                    } else {
                        uVarZ0 = null;
                    }
                    j2 = 52;
                    p1(2, uVarZ0);
                    if (uVarZ0 != null) {
                        str3 = (String) uVarZ0.get();
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        length = str3.length();
                    } else {
                        length = 0;
                    }
                    if (length == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (j4 != 0) {
                        if (z2) {
                            j7 = 32768;
                        } else {
                            j7 = 16384;
                        }
                        j |= j7;
                    }
                    i4 = z2 ? 8 : 0;
                    j5 = j & j3;
                    if (j5 != 0) {
                        strI0 = qVar != null ? qVar.I0() : null;
                        p1(3, strI0);
                        if (strI0 != null) {
                            z = strI0.get();
                        } else {
                            z = false;
                        }
                        if (j5 != 0) {
                            if (z) {
                                j6 = 640;
                            } else {
                                j6 = 320;
                            }
                            j |= j6;
                        }
                        if (z) {
                            i5 = 0;
                        } else {
                            i5 = 8;
                        }
                        if (z) {
                            i6 = 8;
                        } else {
                            i6 = 0;
                        }
                        str = str3;
                        strI0 = str2;
                        i = i6;
                    } else {
                        str = str3;
                        strI0 = str2;
                        i = 0;
                    }
                    if ((50 & j) != 0) {
                        androidx.databinding.adapters.f0.A(this.I, strI0);
                    }
                    if ((32 & j) != 0) {
                        this.J.setOnClickListener(this.O);
                    }
                    if ((j & j3) != 0) {
                        this.J.setVisibility(i);
                        this.K.setVisibility(i5);
                    }
                    if ((j & j2) != 0) {
                        androidx.databinding.adapters.f0.A(this.L, str);
                        this.L.setVisibility(i4);
                    }
                    if ((j & 49) != 0) {
                        this.N.getRoot().setVisibility(i2);
                        this.F.setVisibility(i3);
                    }
                    androidx.databinding.c0.t(this.N);
                }
                j2 = 52;
                str3 = null;
                j5 = j & j3;
                if (j5 != 0) {
                    if (qVar != null) {
                    }
                    p1(3, strI0);
                    if (strI0 != null) {
                        z = strI0.get();
                    } else {
                        z = false;
                    }
                    if (j5 != 0) {
                        if (z) {
                            j6 = 640;
                        } else {
                            j6 = 320;
                        }
                        j |= j6;
                    }
                    if (z) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    if (z) {
                        i6 = 8;
                    } else {
                        i6 = 0;
                    }
                    str = str3;
                    strI0 = str2;
                    i = i6;
                } else {
                    str = str3;
                    strI0 = str2;
                    i = 0;
                }
                if ((50 & j) != 0) {
                    androidx.databinding.adapters.f0.A(this.I, strI0);
                }
                if ((32 & j) != 0) {
                    this.J.setOnClickListener(this.O);
                }
                if ((j & j3) != 0) {
                    this.J.setVisibility(i);
                    this.K.setVisibility(i5);
                }
                if ((j & j2) != 0) {
                    androidx.databinding.adapters.f0.A(this.L, str);
                    this.L.setVisibility(i4);
                }
                if ((j & 49) != 0) {
                    this.N.getRoot().setVisibility(i2);
                    this.F.setVisibility(i3);
                }
                androidx.databinding.c0.t(this.N);
            }
            j3 = 56;
            str2 = null;
            j4 = j & 52;
            if (j4 != 0) {
                if (qVar != null) {
                    uVarZ0 = qVar.z0();
                } else {
                    uVarZ0 = null;
                }
                j2 = 52;
                p1(2, uVarZ0);
                if (uVarZ0 != null) {
                    str3 = (String) uVarZ0.get();
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    length = str3.length();
                } else {
                    length = 0;
                }
                if (length == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (j4 != 0) {
                    if (z2) {
                        j7 = 32768;
                    } else {
                        j7 = 16384;
                    }
                    j |= j7;
                }
                if (z2) {
                }
                j5 = j & j3;
                if (j5 != 0) {
                    if (qVar != null) {
                    }
                    p1(3, strI0);
                    if (strI0 != null) {
                        z = strI0.get();
                    } else {
                        z = false;
                    }
                    if (j5 != 0) {
                        if (z) {
                            j6 = 640;
                        } else {
                            j6 = 320;
                        }
                        j |= j6;
                    }
                    if (z) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    if (z) {
                        i6 = 8;
                    } else {
                        i6 = 0;
                    }
                    str = str3;
                    strI0 = str2;
                    i = i6;
                } else {
                    str = str3;
                    strI0 = str2;
                    i = 0;
                }
                if ((50 & j) != 0) {
                    androidx.databinding.adapters.f0.A(this.I, strI0);
                }
                if ((32 & j) != 0) {
                    this.J.setOnClickListener(this.O);
                }
                if ((j & j3) != 0) {
                    this.J.setVisibility(i);
                    this.K.setVisibility(i5);
                }
                if ((j & j2) != 0) {
                    androidx.databinding.adapters.f0.A(this.L, str);
                    this.L.setVisibility(i4);
                }
                if ((j & 49) != 0) {
                    this.N.getRoot().setVisibility(i2);
                    this.F.setVisibility(i3);
                }
                androidx.databinding.c0.t(this.N);
            }
            j2 = 52;
            str3 = null;
            j5 = j & j3;
            if (j5 != 0) {
                if (qVar != null) {
                }
                p1(3, strI0);
                if (strI0 != null) {
                    z = strI0.get();
                } else {
                    z = false;
                }
                if (j5 != 0) {
                    if (z) {
                        j6 = 640;
                    } else {
                        j6 = 320;
                    }
                    j |= j6;
                }
                if (z) {
                    i5 = 0;
                } else {
                    i5 = 8;
                }
                if (z) {
                    i6 = 8;
                } else {
                    i6 = 0;
                }
                str = str3;
                strI0 = str2;
                i = i6;
            } else {
                str = str3;
                strI0 = str2;
                i = 0;
            }
            if ((50 & j) != 0) {
                androidx.databinding.adapters.f0.A(this.I, strI0);
            }
            if ((32 & j) != 0) {
                this.J.setOnClickListener(this.O);
            }
            if ((j & j3) != 0) {
                this.J.setVisibility(i);
                this.K.setVisibility(i5);
            }
            if ((j & j2) != 0) {
                androidx.databinding.adapters.f0.A(this.L, str);
                this.L.setVisibility(i4);
            }
            if ((j & 49) != 0) {
                this.N.getRoot().setVisibility(i2);
                this.F.setVisibility(i3);
            }
            androidx.databinding.c0.t(this.N);
        }
        j2 = 52;
        j3 = 56;
        str = null;
        i = 0;
        i2 = 0;
        i3 = 0;
        i4 = 0;
        i5 = 0;
        if ((50 & j) != 0) {
            androidx.databinding.adapters.f0.A(this.I, strI0);
        }
        if ((32 & j) != 0) {
            this.J.setOnClickListener(this.O);
        }
        if ((j & j3) != 0) {
            this.J.setVisibility(i);
            this.K.setVisibility(i5);
        }
        if ((j & j2) != 0) {
            androidx.databinding.adapters.f0.A(this.L, str);
            this.L.setVisibility(i4);
        }
        if ((j & 49) != 0) {
            this.N.getRoot().setVisibility(i2);
            this.F.setVisibility(i3);
        }
        androidx.databinding.c0.t(this.N);
    }

    private p1(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 4, (ImageView) objArr[8], (RecyclerView) objArr[6]);
        this.P = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.H = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.I = textView;
        textView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[2];
        this.J = linearLayout2;
        linearLayout2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[3];
        this.K = linearLayout3;
        linearLayout3.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.L = textView2;
        textView2.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[5];
        this.M = frameLayout;
        frameLayout.setTag(null);
        dq dqVar = (dq) objArr[7];
        this.N = dqVar;
        N0(dqVar);
        this.F.setTag(null);
        P0(view);
        this.O = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
