package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class n2 extends m2 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i P = null;

    @androidx.annotation.p0
    private static final SparseIntArray Q;

    @androidx.annotation.n0
    private final LinearLayout L;

    @androidx.annotation.n0
    private final RelativeLayout M;

    @androidx.annotation.n0
    private final LinearLayout N;
    private long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.Nc, 7);
    }

    public n2(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 8, P, Q));
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 8;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 2;
        }
        return true;
    }

    private boolean I1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 4;
        }
        return true;
    }

    private boolean J1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.O |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.m2
    public void D1(@androidx.annotation.p0 Boolean bool) {
        this.J = bool;
        synchronized (this) {
            this.O |= 32;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.e1);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.m2
    public void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.j0 j0Var) {
        this.K = j0Var;
        synchronized (this) {
            this.O |= 16;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.G1);
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
            this.O = 64L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.G1 == i) {
            E1((com.zentraedi.comic.viewmodel.j0) obj);
            return true;
        }
        if (com.zentraedi.comic.a.e1 != i) {
            return false;
        }
        D1((Boolean) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return J1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return G1((ObservableField) obj, i2);
        }
        if (i == 2) {
            return I1((ObservableField) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return F1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1  */
    protected void r() {
        long j;
        long j2;
        long j3;
        View.OnClickListener onClickListenerO;
        String str;
        boolean zK0;
        int i;
        String str2;
        String str3;
        View.OnClickListener onClickListenerQ;
        int i2;
        int i3;
        int i4;
        ObservableField<String> observableFieldL;
        androidx.databinding.u filePath;
        androidx.databinding.u fileName;
        synchronized (this) {
            j = this.O;
            this.O = 0L;
        }
        com.zentraedi.comic.viewmodel.j0 j0Var = this.K;
        Boolean bool = this.J;
        if ((127 & j) != 0) {
            long j4 = j & 113;
            if (j4 != 0) {
                androidx.databinding.u uVarR = j0Var != null ? j0Var.R() : null;
                p1(0, uVarR);
                zK0 = androidx.databinding.c0.K0(uVarR != null ? (Boolean) uVarR.get() : null);
                if (j4 != 0) {
                    j = zK0 ? j | ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS : j | 512;
                }
                if ((j & 81) != 0) {
                    j |= zK0 ? 20480L : 10240L;
                }
                if ((j & 81) != 0) {
                    i = zK0 ? 4 : 0;
                    i4 = zK0 ? 0 : 8;
                } else {
                    i = 0;
                }
                if ((j & 82) == 0) {
                    str = null;
                } else {
                    if (j0Var != null) {
                        fileName = j0Var.getFileName();
                    } else {
                        fileName = null;
                    }
                    p1(1, fileName);
                    if (fileName != null) {
                        str = (String) fileName.get();
                    } else {
                        str = null;
                    }
                }
                if ((j & 84) != 0) {
                    if (j0Var != null) {
                        filePath = j0Var.getFilePath();
                    } else {
                        filePath = null;
                    }
                    j3 = 80;
                    p1(2, filePath);
                    str2 = filePath != null ? (String) filePath.get() : null;
                    if ((j & 88) != 0) {
                        if (j0Var != null) {
                            observableFieldL = j0Var.L();
                        } else {
                            observableFieldL = null;
                        }
                        j2 = 88;
                        p1(3, observableFieldL);
                        str3 = observableFieldL != null ? (String) observableFieldL.get() : null;
                        if ((j & j3) != 0 || j0Var == null) {
                            i2 = i4;
                            onClickListenerO = null;
                            onClickListenerQ = null;
                        } else {
                            onClickListenerQ = j0Var.Q();
                            onClickListenerO = j0Var.O();
                            i2 = i4;
                        }
                    } else {
                        j2 = 88;
                    }
                    if ((j & j3) != 0) {
                        i2 = i4;
                        onClickListenerO = null;
                        onClickListenerQ = null;
                    } else {
                        i2 = i4;
                        onClickListenerO = null;
                        onClickListenerQ = null;
                    }
                } else {
                    j3 = 80;
                }
                if ((j & 88) != 0) {
                    if (j0Var != null) {
                        observableFieldL = j0Var.L();
                    } else {
                        observableFieldL = null;
                    }
                    j2 = 88;
                    p1(3, observableFieldL);
                    if (observableFieldL != null) {
                    }
                    if ((j & j3) != 0) {
                        i2 = i4;
                        onClickListenerO = null;
                        onClickListenerQ = null;
                    } else {
                        i2 = i4;
                        onClickListenerO = null;
                        onClickListenerQ = null;
                    }
                } else {
                    j2 = 88;
                }
                if ((j & j3) != 0) {
                    i2 = i4;
                    onClickListenerO = null;
                    onClickListenerQ = null;
                } else {
                    i2 = i4;
                    onClickListenerO = null;
                    onClickListenerQ = null;
                }
            } else {
                zK0 = false;
                i = 0;
            }
            i4 = i;
            if ((j & 82) == 0) {
                str = null;
            } else {
                if (j0Var != null) {
                    fileName = j0Var.getFileName();
                } else {
                    fileName = null;
                }
                p1(1, fileName);
                if (fileName != null) {
                    str = (String) fileName.get();
                } else {
                    str = null;
                }
            }
            if ((j & 84) != 0) {
                if (j0Var != null) {
                    filePath = j0Var.getFilePath();
                } else {
                    filePath = null;
                }
                j3 = 80;
                p1(2, filePath);
                if (filePath != null) {
                }
                if ((j & 88) != 0) {
                    if (j0Var != null) {
                        observableFieldL = j0Var.L();
                    } else {
                        observableFieldL = null;
                    }
                    j2 = 88;
                    p1(3, observableFieldL);
                    if (observableFieldL != null) {
                    }
                    if ((j & j3) != 0) {
                        i2 = i4;
                        onClickListenerO = null;
                        onClickListenerQ = null;
                    } else {
                        i2 = i4;
                        onClickListenerO = null;
                        onClickListenerQ = null;
                    }
                } else {
                    j2 = 88;
                }
                if ((j & j3) != 0) {
                    i2 = i4;
                    onClickListenerO = null;
                    onClickListenerQ = null;
                } else {
                    i2 = i4;
                    onClickListenerO = null;
                    onClickListenerQ = null;
                }
            } else {
                j3 = 80;
            }
            if ((j & 88) != 0) {
                if (j0Var != null) {
                    observableFieldL = j0Var.L();
                } else {
                    observableFieldL = null;
                }
                j2 = 88;
                p1(3, observableFieldL);
                if (observableFieldL != null) {
                }
                if ((j & j3) != 0) {
                    i2 = i4;
                    onClickListenerO = null;
                    onClickListenerQ = null;
                } else {
                    i2 = i4;
                    onClickListenerO = null;
                    onClickListenerQ = null;
                }
            } else {
                j2 = 88;
            }
            if ((j & j3) != 0) {
                i2 = i4;
                onClickListenerO = null;
                onClickListenerQ = null;
            } else {
                i2 = i4;
                onClickListenerO = null;
                onClickListenerQ = null;
            }
        } else {
            j2 = 88;
            j3 = 80;
            onClickListenerO = null;
            str = null;
            zK0 = false;
            i = 0;
            str2 = null;
            str3 = null;
            onClickListenerQ = null;
            i2 = 0;
        }
        boolean zK1 = (j & 512) != 0 ? androidx.databinding.c0.K0(bool) : false;
        long j5 = j & 113;
        if (j5 != 0) {
            boolean z = zK0 ? true : zK1;
            if (j5 != 0) {
                j |= z ? 256L : 128L;
            }
            i3 = z ? 8 : 0;
        } else {
            i3 = 0;
        }
        if ((82 & j) != 0) {
            androidx.databinding.adapters.f0.A(this.F, str);
        }
        if ((84 & j) != 0) {
            androidx.databinding.adapters.f0.A(this.G, str2);
        }
        if ((j & 81) != 0) {
            this.G.setVisibility(i);
            this.N.setVisibility(i2);
            this.H.setVisibility(i);
        }
        if ((j & j3) != 0) {
            this.M.setOnClickListener(onClickListenerO);
            this.H.setOnClickListener(onClickListenerQ);
        }
        if ((j & j2) != 0) {
            androidx.databinding.adapters.f0.A(this.I, str3);
        }
        if ((j & 113) != 0) {
            this.I.setVisibility(i3);
        }
    }

    private n2(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 4, (ImageView) objArr[7], (TextView) objArr[2], (TextView) objArr[5], (ImageView) objArr[6], (TextView) objArr[4]);
        this.O = -1L;
        this.F.setTag(null);
        this.G.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.L = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.M = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[3];
        this.N = linearLayout2;
        linearLayout2.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        P0(view);
        i0();
    }
}
