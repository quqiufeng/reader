package com.zentraedi.comic.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class v2 extends u2 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i J = null;

    @androidx.annotation.p0
    private static final SparseIntArray K = null;

    @androidx.annotation.n0
    private final RelativeLayout H;
    private long I;

    public v2(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 3, J, K));
    }

    private boolean D1(ObservableField<Drawable> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.I |= 2;
        }
        return true;
    }

    private boolean E1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.I |= 4;
        }
        return true;
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.I |= 8;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.u2
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.m0 m0Var) {
        this.G = m0Var;
        synchronized (this) {
            this.I |= 16;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.I = 32L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.m0) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return F1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return D1((ObservableField) obj, i2);
        }
        if (i == 2) {
            return E1((ObservableField) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return G1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    protected void r() {
        long j;
        long j2;
        long j3;
        String str;
        Drawable drawable;
        String str2;
        long j4;
        ObservableField<String> titleStr;
        androidx.databinding.u uVarM;
        Boolean bool;
        boolean zK0;
        long j5;
        androidx.databinding.u uVarL;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        com.zentraedi.comic.viewmodel.m0 m0Var = this.G;
        int i = 0;
        String str3 = null;
        if ((63 & j) != 0) {
            if ((j & 49) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableFieldN = m0Var != null ? m0Var.N() : null;
                p1(0, observableFieldN);
                if (observableFieldN != null) {
                    str2 = (String) observableFieldN.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 50) != 0) {
                if (m0Var != null) {
                    uVarL = m0Var.L();
                    j2 = 0;
                } else {
                    j2 = 0;
                    uVarL = null;
                }
                p1(1, uVarL);
                if (uVarL != null) {
                    drawable = (Drawable) uVarL.get();
                }
                j4 = j & 52;
                if (j4 != j2) {
                    if (m0Var != null) {
                        uVarM = m0Var.M();
                    } else {
                        uVarM = null;
                    }
                    j3 = 56;
                    p1(2, uVarM);
                    if (uVarM != null) {
                        bool = (Boolean) uVarM.get();
                    } else {
                        bool = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool);
                    if (j4 != j2) {
                        if (zK0) {
                            j5 = 128;
                        } else {
                            j5 = 64;
                        }
                        j |= j5;
                    }
                    if (!zK0) {
                        i = 8;
                    }
                } else {
                    j3 = 56;
                }
                if ((j & j3) != j2) {
                    if (m0Var != null) {
                        titleStr = m0Var.getTitleStr();
                    } else {
                        titleStr = null;
                    }
                    p1(3, titleStr);
                    if (titleStr != null) {
                        str3 = (String) titleStr.get();
                    }
                }
                str = str3;
            } else {
                j2 = 0;
            }
            drawable = null;
            j4 = j & 52;
            if (j4 != j2) {
                if (m0Var != null) {
                    uVarM = m0Var.M();
                } else {
                    uVarM = null;
                }
                j3 = 56;
                p1(2, uVarM);
                if (uVarM != null) {
                    bool = (Boolean) uVarM.get();
                } else {
                    bool = null;
                }
                zK0 = androidx.databinding.c0.K0(bool);
                if (j4 != j2) {
                    if (zK0) {
                        j5 = 128;
                    } else {
                        j5 = 64;
                    }
                    j |= j5;
                }
                if (!zK0) {
                    i = 8;
                }
            } else {
                j3 = 56;
            }
            if ((j & j3) != j2) {
                if (m0Var != null) {
                    titleStr = m0Var.getTitleStr();
                } else {
                    titleStr = null;
                }
                p1(3, titleStr);
                if (titleStr != null) {
                    str3 = (String) titleStr.get();
                }
            }
            str = str3;
        } else {
            j2 = 0;
            j3 = 56;
            str = null;
            drawable = null;
            str2 = null;
        }
        if ((j & 50) != j2) {
            androidx.databinding.adapters.j0.b(this.H, drawable);
        }
        if ((j & 49) != j2) {
            androidx.databinding.adapters.f0.A(this.E, str2);
        }
        if ((j & 52) != j2) {
            this.E.setVisibility(i);
        }
        if ((j & j3) != j2) {
            androidx.databinding.adapters.f0.A(this.F, str);
        }
    }

    private v2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 4, (TextView) objArr[2], (TextView) objArr[1]);
        this.I = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.H = relativeLayout;
        relativeLayout.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        P0(view);
        i0();
    }
}
