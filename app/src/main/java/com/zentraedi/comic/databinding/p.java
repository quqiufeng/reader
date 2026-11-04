package com.zentraedi.comic.databinding;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableField;
import androidx.drawerlayout.widget.DrawerLayout;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.comic.view.ComicPullToRefreshRecyclerView;
import com.zentraedi.comic.viewmodel.ComicReaderViewModel;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class p extends o implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i Y;

    @androidx.annotation.p0
    private static final SparseIntArray Z;

    @androidx.annotation.n0
    private final LinearLayout T;

    @androidx.annotation.p0
    private final View.OnClickListener U;

    @androidx.annotation.p0
    private final View.OnClickListener V;

    @androidx.annotation.p0
    private final View.OnClickListener W;
    private long X;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(14);
        Y = iVar;
        iVar.a(0, new String[]{"layout_comic_bottom_menu", "layout_comic_nav_menu", "layout_comic_guide", "layout_comic_guide_mange", "layout_comic_guide_land", "layout_comic_loading", "layout_comic_nav_bar"}, new int[]{6, 7, 8, 9, 10, 11, 12}, new int[]{com.zentraedi.comic.q.l.S9, com.zentraedi.comic.q.l.ga, com.zentraedi.comic.q.l.W9, com.zentraedi.comic.q.l.Y9, com.zentraedi.comic.q.l.X9, com.zentraedi.comic.q.l.ea, com.zentraedi.comic.q.l.fa});
        iVar.a(1, new String[]{"drawer_comic_chapter"}, new int[]{4}, new int[]{com.zentraedi.comic.q.l.E5});
        iVar.a(3, new String[]{"item_read_setting"}, new int[]{5}, new int[]{com.zentraedi.comic.q.l.r9});
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.Vq, 13);
    }

    public p(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 14, Y, Z));
    }

    private boolean F1(x3 x3Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
        }
        return true;
    }

    private boolean G1(z3 z3Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 16384;
        }
        return true;
    }

    private boolean I1(h4 h4Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 16;
        }
        return true;
    }

    private boolean J1(j4 j4Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 128;
        }
        return true;
    }

    private boolean K1(l4 l4Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        }
        return true;
    }

    private boolean L1(x4 x4Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 1;
        }
        return true;
    }

    private boolean N1(z4 z4Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 32;
        }
        return true;
    }

    private boolean O1(b5 b5Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 8192;
        }
        return true;
    }

    private boolean P1(m1 m1Var, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 64;
        }
        return true;
    }

    private boolean Q1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 8;
        }
        return true;
    }

    private boolean R1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 2;
        }
        return true;
    }

    private boolean S1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 512;
        }
        return true;
    }

    private boolean T1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 4;
        }
        return true;
    }

    private boolean U1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= 256;
        }
        return true;
    }

    private boolean V1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.X |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.o
    public void D1(@androidx.annotation.p0 n6 n6Var) {
        this.S = n6Var;
        synchronized (this) {
            this.X |= 32768;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.j3);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.o
    public void E1(@androidx.annotation.p0 ComicReaderViewModel comicReaderViewModel) {
        this.R = comicReaderViewModel;
        synchronized (this) {
            this.X |= 65536;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 p0Var) {
        super.O0(p0Var);
        this.Q.O0(p0Var);
        this.H.O0(p0Var);
        this.I.O0(p0Var);
        this.O.O0(p0Var);
        this.J.O0(p0Var);
        this.L.O0(p0Var);
        this.K.O0(p0Var);
        this.M.O0(p0Var);
        this.N.O0(p0Var);
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        Resources resources;
        Configuration configuration;
        Resources resources2;
        Configuration configuration2;
        ComicReaderViewModel comicReaderViewModel;
        Resources resources3;
        Configuration configuration3;
        if (i == 1) {
            ComicReaderViewModel comicReaderViewModel2 = this.R;
            if (comicReaderViewModel2 == null || getRoot().getContext() == null || (resources = getRoot().getContext().getResources()) == null || (configuration = resources.getConfiguration()) == null) {
                return;
            }
            comicReaderViewModel2.C1(configuration.orientation);
            return;
        }
        if (i != 2) {
            if (i != 3 || (comicReaderViewModel = this.R) == null || getRoot().getContext() == null || (resources3 = getRoot().getContext().getResources()) == null || (configuration3 = resources3.getConfiguration()) == null) {
                return;
            }
            comicReaderViewModel.C1(configuration3.orientation);
            return;
        }
        ComicReaderViewModel comicReaderViewModel3 = this.R;
        if (comicReaderViewModel3 == null || getRoot().getContext() == null || (resources2 = getRoot().getContext().getResources()) == null || (configuration2 = resources2.getConfiguration()) == null) {
            return;
        }
        comicReaderViewModel3.C1(configuration2.orientation);
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.X != 0) {
                    return true;
                }
                return this.Q.g0() || this.H.g0() || this.I.g0() || this.O.g0() || this.J.g0() || this.L.g0() || this.K.g0() || this.M.g0() || this.N.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.X = 131072L;
        }
        this.Q.i0();
        this.H.i0();
        this.I.i0();
        this.O.i0();
        this.J.i0();
        this.L.i0();
        this.K.i0();
        this.M.i0();
        this.N.i0();
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.j3 == i) {
            D1((n6) obj);
            return true;
        }
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        E1((ComicReaderViewModel) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return L1((x4) obj, i2);
            case 1:
                return R1((ObservableField) obj, i2);
            case 2:
                return T1((ObservableField) obj, i2);
            case 3:
                return Q1((ObservableField) obj, i2);
            case 4:
                return I1((h4) obj, i2);
            case 5:
                return N1((z4) obj, i2);
            case 6:
                return P1((m1) obj, i2);
            case 7:
                return J1((j4) obj, i2);
            case 8:
                return U1((ObservableField) obj, i2);
            case 9:
                return S1((ObservableField) obj, i2);
            case 10:
                return V1((ObservableField) obj, i2);
            case 11:
                return F1((x3) obj, i2);
            case 12:
                return K1((l4) obj, i2);
            case 13:
                return O1((b5) obj, i2);
            case 14:
                return G1((z3) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0137  */
    /* JADX WARN: Code duplicated, block: B:102:0x013a A[PHI: r2
      0x013a: PHI (r2v11 long) = (r2v10 long), (r2v15 long) binds: [B:86:0x010a, B:100:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0143  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:110:0x0150  */
    /* JADX WARN: Code duplicated, block: B:113:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x015f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0164  */
    /* JADX WARN: Code duplicated, block: B:118:0x016a  */
    /* JADX WARN: Code duplicated, block: B:119:0x016c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047 A[PHI: r2
      0x0047: PHI (r2v1 long) = (r2v0 long), (r2v23 long) binds: [B:7:0x0019, B:21:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:83:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x0105 A[PHI: r2
      0x0105: PHI (r2v9 long) = (r2v8 long), (r2v17 long) binds: [B:67:0x00d7, B:81:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0113  */
    /* JADX WARN: Code duplicated, block: B:92:0x011b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:96:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0131  */
    protected void r() {
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        int i3;
        int i4;
        int i5;
        long j4;
        long j5;
        long j6;
        long j7;
        ObservableField<Boolean> observableFieldY1;
        boolean zK0;
        int i6;
        long j8;
        ObservableField<Boolean> observableFieldU1;
        Boolean bool;
        boolean zK1;
        long j9;
        ObservableField<Boolean> showLoading;
        Boolean bool2;
        boolean zK2;
        long j10;
        ObservableField<Boolean> observableFieldV1;
        Boolean bool3;
        boolean zK3;
        long j11;
        androidx.databinding.u uVarT1;
        synchronized (this) {
            j = this.X;
            this.X = 0L;
        }
        n6 n6Var = this.S;
        ComicReaderViewModel comicReaderViewModel = this.R;
        long j12 = j & 163848;
        int i7 = 0;
        if (j12 == 0) {
            i = 0;
        } else {
            ObservableField<Boolean> observableFieldG0 = n6Var != null ? n6Var.G0() : null;
            p1(3, observableFieldG0);
            boolean zK4 = androidx.databinding.c0.K0(observableFieldG0 != null ? (Boolean) observableFieldG0.get() : null);
            if (j12 != 0) {
                j |= zK4 ? 2097152L : 1048576L;
            }
            if (zK4) {
                i = 0;
            } else {
                i = 8;
            }
        }
        if ((198406 & j) != 0) {
            long j13 = j & 196610;
            if (j13 != 0) {
                if (comicReaderViewModel != null) {
                    uVarT1 = comicReaderViewModel.t1();
                    j2 = 0;
                } else {
                    j2 = 0;
                    uVarT1 = null;
                }
                p1(1, uVarT1);
                boolean zK5 = androidx.databinding.c0.K0(uVarT1 != null ? (Boolean) uVarT1.get() : null);
                if (j13 != 0) {
                    j |= zK5 ? 33554432L : 16777216L;
                }
                if (zK5) {
                    i2 = 8;
                }
                j4 = j & 196612;
                if (j4 != j2) {
                    if (comicReaderViewModel != null) {
                        observableFieldV1 = comicReaderViewModel.v1();
                    } else {
                        observableFieldV1 = null;
                    }
                    j3 = 163848;
                    p1(2, observableFieldV1);
                    if (observableFieldV1 != null) {
                        bool3 = (Boolean) observableFieldV1.get();
                    } else {
                        bool3 = null;
                    }
                    zK3 = androidx.databinding.c0.K0(bool3);
                    if (j4 != j2) {
                        if (zK3) {
                            j11 = 536870912;
                        } else {
                            j11 = 268435456;
                        }
                        j |= j11;
                    }
                    if (zK3) {
                        i3 = 8;
                    }
                    j5 = j & 196864;
                    if (j5 == j2) {
                        i4 = 0;
                    } else {
                        if (comicReaderViewModel != null) {
                            showLoading = comicReaderViewModel.getShowLoading();
                        } else {
                            showLoading = null;
                        }
                        p1(8, showLoading);
                        if (showLoading != null) {
                            bool2 = (Boolean) showLoading.get();
                        } else {
                            bool2 = null;
                        }
                        zK2 = androidx.databinding.c0.K0(bool2);
                        if (j5 != j2) {
                            if (zK2) {
                                j10 = 134217728;
                            } else {
                                j10 = 67108864;
                            }
                            j |= j10;
                        }
                        if (zK2) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                    }
                    j6 = j & 197120;
                    if (j6 == j2) {
                        i5 = 0;
                    } else {
                        if (comicReaderViewModel != null) {
                            observableFieldU1 = comicReaderViewModel.u1();
                        } else {
                            observableFieldU1 = null;
                        }
                        p1(9, observableFieldU1);
                        if (observableFieldU1 != null) {
                            bool = (Boolean) observableFieldU1.get();
                        } else {
                            bool = null;
                        }
                        zK1 = androidx.databinding.c0.K0(bool);
                        if (j6 != j2) {
                            if (zK1) {
                                j9 = 8388608;
                            } else {
                                j9 = 4194304;
                            }
                            j |= j9;
                        }
                        if (zK1) {
                            i5 = 8;
                        } else {
                            i5 = 0;
                        }
                    }
                    j7 = j & 197632;
                    if (j7 != j2) {
                        if (comicReaderViewModel != null) {
                            observableFieldY1 = comicReaderViewModel.y1();
                        } else {
                            observableFieldY1 = null;
                        }
                        p1(10, observableFieldY1);
                        zK0 = androidx.databinding.c0.K0(observableFieldY1 != null ? (Boolean) observableFieldY1.get() : null);
                        if (j7 != j2) {
                            if (zK0) {
                                j8 = 524288;
                            } else {
                                j8 = 262144;
                            }
                            j |= j8;
                        }
                        if (zK0) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        i7 = i6;
                    }
                } else {
                    j3 = 163848;
                }
                i3 = 0;
                j5 = j & 196864;
                if (j5 == j2) {
                    i4 = 0;
                } else {
                    if (comicReaderViewModel != null) {
                        showLoading = comicReaderViewModel.getShowLoading();
                    } else {
                        showLoading = null;
                    }
                    p1(8, showLoading);
                    if (showLoading != null) {
                        bool2 = (Boolean) showLoading.get();
                    } else {
                        bool2 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool2);
                    if (j5 != j2) {
                        if (zK2) {
                            j10 = 134217728;
                        } else {
                            j10 = 67108864;
                        }
                        j |= j10;
                    }
                    if (zK2) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                }
                j6 = j & 197120;
                if (j6 == j2) {
                    i5 = 0;
                } else {
                    if (comicReaderViewModel != null) {
                        observableFieldU1 = comicReaderViewModel.u1();
                    } else {
                        observableFieldU1 = null;
                    }
                    p1(9, observableFieldU1);
                    if (observableFieldU1 != null) {
                        bool = (Boolean) observableFieldU1.get();
                    } else {
                        bool = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool);
                    if (j6 != j2) {
                        if (zK1) {
                            j9 = 8388608;
                        } else {
                            j9 = 4194304;
                        }
                        j |= j9;
                    }
                    if (zK1) {
                        i5 = 8;
                    } else {
                        i5 = 0;
                    }
                }
                j7 = j & 197632;
                if (j7 != j2) {
                    if (comicReaderViewModel != null) {
                        observableFieldY1 = comicReaderViewModel.y1();
                    } else {
                        observableFieldY1 = null;
                    }
                    p1(10, observableFieldY1);
                    zK0 = androidx.databinding.c0.K0(observableFieldY1 != null ? (Boolean) observableFieldY1.get() : null);
                    if (j7 != j2) {
                        if (zK0) {
                            j8 = 524288;
                        } else {
                            j8 = 262144;
                        }
                        j |= j8;
                    }
                    if (zK0) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    i7 = i6;
                }
            } else {
                j2 = 0;
            }
            i2 = 0;
            j4 = j & 196612;
            if (j4 != j2) {
                if (comicReaderViewModel != null) {
                    observableFieldV1 = comicReaderViewModel.v1();
                } else {
                    observableFieldV1 = null;
                }
                j3 = 163848;
                p1(2, observableFieldV1);
                if (observableFieldV1 != null) {
                    bool3 = (Boolean) observableFieldV1.get();
                } else {
                    bool3 = null;
                }
                zK3 = androidx.databinding.c0.K0(bool3);
                if (j4 != j2) {
                    if (zK3) {
                        j11 = 536870912;
                    } else {
                        j11 = 268435456;
                    }
                    j |= j11;
                }
                if (zK3) {
                    i3 = 8;
                }
                j5 = j & 196864;
                if (j5 == j2) {
                    i4 = 0;
                } else {
                    if (comicReaderViewModel != null) {
                        showLoading = comicReaderViewModel.getShowLoading();
                    } else {
                        showLoading = null;
                    }
                    p1(8, showLoading);
                    if (showLoading != null) {
                        bool2 = (Boolean) showLoading.get();
                    } else {
                        bool2 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool2);
                    if (j5 != j2) {
                        if (zK2) {
                            j10 = 134217728;
                        } else {
                            j10 = 67108864;
                        }
                        j |= j10;
                    }
                    if (zK2) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                }
                j6 = j & 197120;
                if (j6 == j2) {
                    i5 = 0;
                } else {
                    if (comicReaderViewModel != null) {
                        observableFieldU1 = comicReaderViewModel.u1();
                    } else {
                        observableFieldU1 = null;
                    }
                    p1(9, observableFieldU1);
                    if (observableFieldU1 != null) {
                        bool = (Boolean) observableFieldU1.get();
                    } else {
                        bool = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool);
                    if (j6 != j2) {
                        if (zK1) {
                            j9 = 8388608;
                        } else {
                            j9 = 4194304;
                        }
                        j |= j9;
                    }
                    if (zK1) {
                        i5 = 8;
                    } else {
                        i5 = 0;
                    }
                }
                j7 = j & 197632;
                if (j7 != j2) {
                    if (comicReaderViewModel != null) {
                        observableFieldY1 = comicReaderViewModel.y1();
                    } else {
                        observableFieldY1 = null;
                    }
                    p1(10, observableFieldY1);
                    zK0 = androidx.databinding.c0.K0(observableFieldY1 != null ? (Boolean) observableFieldY1.get() : null);
                    if (j7 != j2) {
                        if (zK0) {
                            j8 = 524288;
                        } else {
                            j8 = 262144;
                        }
                        j |= j8;
                    }
                    if (zK0) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    i7 = i6;
                }
            } else {
                j3 = 163848;
            }
            i3 = 0;
            j5 = j & 196864;
            if (j5 == j2) {
                i4 = 0;
            } else {
                if (comicReaderViewModel != null) {
                    showLoading = comicReaderViewModel.getShowLoading();
                } else {
                    showLoading = null;
                }
                p1(8, showLoading);
                if (showLoading != null) {
                    bool2 = (Boolean) showLoading.get();
                } else {
                    bool2 = null;
                }
                zK2 = androidx.databinding.c0.K0(bool2);
                if (j5 != j2) {
                    if (zK2) {
                        j10 = 134217728;
                    } else {
                        j10 = 67108864;
                    }
                    j |= j10;
                }
                if (zK2) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
            }
            j6 = j & 197120;
            if (j6 == j2) {
                i5 = 0;
            } else {
                if (comicReaderViewModel != null) {
                    observableFieldU1 = comicReaderViewModel.u1();
                } else {
                    observableFieldU1 = null;
                }
                p1(9, observableFieldU1);
                if (observableFieldU1 != null) {
                    bool = (Boolean) observableFieldU1.get();
                } else {
                    bool = null;
                }
                zK1 = androidx.databinding.c0.K0(bool);
                if (j6 != j2) {
                    if (zK1) {
                        j9 = 8388608;
                    } else {
                        j9 = 4194304;
                    }
                    j |= j9;
                }
                if (zK1) {
                    i5 = 8;
                } else {
                    i5 = 0;
                }
            }
            j7 = j & 197632;
            if (j7 != j2) {
                if (comicReaderViewModel != null) {
                    observableFieldY1 = comicReaderViewModel.y1();
                } else {
                    observableFieldY1 = null;
                }
                p1(10, observableFieldY1);
                zK0 = androidx.databinding.c0.K0(observableFieldY1 != null ? (Boolean) observableFieldY1.get() : null);
                if (j7 != j2) {
                    if (zK0) {
                        j8 = 524288;
                    } else {
                        j8 = 262144;
                    }
                    j |= j8;
                }
                if (zK0) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                i7 = i6;
            }
        } else {
            j2 = 0;
            j3 = 163848;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if ((j & j3) != j2) {
            this.E.setVisibility(i);
        }
        if ((j & 197632) != j2) {
            this.I.getRoot().setVisibility(i7);
            this.N.getRoot().setVisibility(i7);
            this.O.getRoot().setVisibility(i7);
        }
        if ((131072 & j) != j2) {
            this.J.getRoot().setOnClickListener(this.U);
            this.K.getRoot().setOnClickListener(this.W);
            this.L.getRoot().setOnClickListener(this.V);
        }
        if ((j & 196610) != j2) {
            this.J.getRoot().setVisibility(i2);
        }
        if ((j & 197120) != j2) {
            this.K.getRoot().setVisibility(i5);
        }
        if ((j & 196612) != j2) {
            this.L.getRoot().setVisibility(i3);
        }
        if ((j & 196864) != j2) {
            this.M.getRoot().setVisibility(i4);
        }
        androidx.databinding.c0.t(this.Q);
        androidx.databinding.c0.t(this.H);
        androidx.databinding.c0.t(this.I);
        androidx.databinding.c0.t(this.O);
        androidx.databinding.c0.t(this.J);
        androidx.databinding.c0.t(this.L);
        androidx.databinding.c0.t(this.K);
        androidx.databinding.c0.t(this.M);
        androidx.databinding.c0.t(this.N);
    }

    private p(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 15, (View) objArr[2], (ConstraintLayout) objArr[0], (DrawerLayout) objArr[1], (x3) objArr[5], (z3) objArr[6], (h4) objArr[8], (j4) objArr[10], (l4) objArr[9], (x4) objArr[11], (z4) objArr[12], (b5) objArr[7], (ComicPullToRefreshRecyclerView) objArr[13], (m1) objArr[4]);
        this.X = -1L;
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        N0(this.H);
        N0(this.I);
        N0(this.J);
        N0(this.K);
        N0(this.L);
        N0(this.M);
        N0(this.N);
        N0(this.O);
        LinearLayout linearLayout = (LinearLayout) objArr[3];
        this.T = linearLayout;
        linearLayout.setTag(null);
        N0(this.Q);
        P0(view);
        this.U = new com.zentraedi.comic.generated.callback.b(this, 1);
        this.V = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.W = new com.zentraedi.comic.generated.callback.b(this, 3);
        i0();
    }
}
