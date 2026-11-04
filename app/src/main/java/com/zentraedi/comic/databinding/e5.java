package com.zentraedi.comic.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.business.utils.g8;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class e5 extends d5 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i M = null;

    @androidx.annotation.p0
    private static final SparseIntArray N = null;

    @androidx.annotation.n0
    private final LinearLayout K;
    private long L;

    public e5(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 6, M, N));
    }

    private boolean D1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 16;
        }
        return true;
    }

    private boolean E1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 2;
        }
        return true;
    }

    private boolean F1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 8;
        }
        return true;
    }

    private boolean G1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 4;
        }
        return true;
    }

    private boolean I1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    private boolean J1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 64;
        }
        return true;
    }

    private boolean K1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.L |= 32;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.d5
    public void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.c cVar) {
        this.J = cVar;
        synchronized (this) {
            this.L |= 128;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.G2);
        super.C0();
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.L = 256L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.G2 != i) {
            return false;
        }
        C1((com.zentraedi.comic.viewmodel.c) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return I1((ObservableField) obj, i2);
            case 1:
                return E1((ObservableField) obj, i2);
            case 2:
                return G1((ObservableField) obj, i2);
            case 3:
                return F1((ObservableField) obj, i2);
            case 4:
                return D1((ObservableField) obj, i2);
            case 5:
                return K1((ObservableField) obj, i2);
            case 6:
                return J1((ObservableField) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0135  */
    /* JADX WARN: Code duplicated, block: B:104:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0141  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x014b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0152  */
    /* JADX WARN: Code duplicated, block: B:113:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x015b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0160  */
    /* JADX WARN: Code duplicated, block: B:119:0x016c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0173  */
    /* JADX WARN: Code duplicated, block: B:122:0x0176  */
    /* JADX WARN: Code duplicated, block: B:125:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x017f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0182  */
    /* JADX WARN: Code duplicated, block: B:130:0x0189  */
    /* JADX WARN: Code duplicated, block: B:132:0x019f  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00da  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0101 A[PHI: r2
      0x0101: PHI (r2v6 long) = (r2v5 long), (r2v15 long) binds: [B:65:0x00d6, B:79:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x010f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0117  */
    /* JADX WARN: Code duplicated, block: B:91:0x011e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0127  */
    /* JADX WARN: Code duplicated, block: B:97:0x012c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0132  */
    protected void r() {
        long j;
        long j2;
        long j3;
        long j4;
        View.OnClickListener leftIconOnClickListener;
        int i;
        int i2;
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        int i3;
        View.OnClickListener rightTextOnClickListener;
        Drawable drawableB;
        Drawable drawableB2;
        String str;
        String str2;
        String str3;
        View.OnClickListener onClickListener3;
        View.OnClickListener rightIconOnClickListener;
        long j5;
        long j6;
        long j7;
        long j8;
        ObservableField<String> observableField;
        ObservableField<Boolean> observableField2;
        Boolean bool;
        boolean zK0;
        int i4;
        long j9;
        ObservableField<Boolean> observableField3;
        Boolean bool2;
        boolean zK1;
        long j10;
        ObservableField<Boolean> observableField4;
        Boolean bool3;
        boolean zK2;
        long j11;
        ObservableField<Boolean> observableFieldQ;
        Boolean bool4;
        boolean zK3;
        int i5;
        long j12;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        com.zentraedi.comic.viewmodel.c cVar = this.J;
        if ((511 & j) != 0) {
            if ((j & 385) == 0) {
                str3 = null;
            } else {
                ObservableField<String> observableField5 = cVar != null ? cVar.navTitle : null;
                p1(0, observableField5);
                if (observableField5 != null) {
                    str3 = (String) observableField5.get();
                } else {
                    str3 = null;
                }
            }
            if ((j & 384) == 0 || cVar == null) {
                onClickListener3 = null;
                leftIconOnClickListener = null;
                rightIconOnClickListener = null;
                rightTextOnClickListener = null;
            } else {
                leftIconOnClickListener = cVar.getLeftIconOnClickListener();
                onClickListener3 = cVar.titleOnClickListener;
                rightIconOnClickListener = cVar.getRightIconOnClickListener();
                rightTextOnClickListener = cVar.getRightTextOnClickListener();
            }
            long j13 = j & 386;
            if (j13 != 0) {
                ObservableField<Boolean> observableField6 = cVar != null ? cVar.hideRightNavIcon : null;
                j3 = 448;
                p1(1, observableField6);
                boolean zK4 = androidx.databinding.c0.K0(observableField6 != null ? (Boolean) observableField6.get() : null);
                if (j13 != 0) {
                    j |= zK4 ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS : 512L;
                }
                i2 = zK4 ? 8 : 0;
                j5 = j & 388;
                if (j5 != 0) {
                    if (cVar != null) {
                        observableFieldQ = cVar.Q();
                    } else {
                        observableFieldQ = null;
                    }
                    j4 = 416;
                    p1(2, observableFieldQ);
                    if (observableFieldQ != null) {
                        bool4 = (Boolean) observableFieldQ.get();
                    } else {
                        bool4 = null;
                    }
                    zK3 = androidx.databinding.c0.K0(bool4);
                    if (j5 != 0) {
                        if (zK3) {
                            j12 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                        } else {
                            j12 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                        }
                        j |= j12;
                    }
                    Context context = this.E.getContext();
                    if (zK3) {
                        i5 = com.zentraedi.comic.q.h.Vy;
                    } else {
                        i5 = com.zentraedi.comic.q.h.Gi;
                    }
                    drawableB = g.a.b(context, i5);
                } else {
                    j4 = 416;
                    drawableB = null;
                }
                j6 = j & 392;
                if (j6 == 0) {
                    i3 = 0;
                } else {
                    if (cVar != null) {
                        observableField4 = cVar.hideRightNavText;
                    } else {
                        observableField4 = null;
                    }
                    p1(3, observableField4);
                    if (observableField4 != null) {
                        bool3 = (Boolean) observableField4.get();
                    } else {
                        bool3 = null;
                    }
                    zK2 = androidx.databinding.c0.K0(bool3);
                    if (j6 != 0) {
                        if (zK2) {
                            j11 = 16384;
                        } else {
                            j11 = 8192;
                        }
                        j |= j11;
                    }
                    if (zK2) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                }
                j7 = j & 400;
                if (j7 != 0) {
                    if (cVar != null) {
                        observableField3 = cVar.editModel;
                    } else {
                        observableField3 = null;
                    }
                    j2 = 400;
                    p1(4, observableField3);
                    if (observableField3 != null) {
                        bool2 = (Boolean) observableField3.get();
                    } else {
                        bool2 = null;
                    }
                    zK1 = androidx.databinding.c0.K0(bool2);
                    if (j7 != 0) {
                        if (zK1) {
                            j10 = 65536;
                        } else {
                            j10 = 32768;
                        }
                        j |= j10;
                    }
                    int i6 = zK1 ? 8 : 0;
                    j8 = j & j4;
                    if (j8 != 0) {
                        if (cVar != null) {
                            observableField2 = cVar.rightNavIconEnable;
                        } else {
                            observableField2 = null;
                        }
                        p1(5, observableField2);
                        if (observableField2 != null) {
                            bool = (Boolean) observableField2.get();
                        } else {
                            bool = null;
                        }
                        zK0 = androidx.databinding.c0.K0(bool);
                        if (j8 != 0) {
                            if (zK0) {
                                j9 = 262144;
                            } else {
                                j9 = 131072;
                            }
                            j |= j9;
                        }
                        Context context2 = this.F.getContext();
                        if (zK0) {
                            i4 = com.zentraedi.comic.q.h.jD;
                        } else {
                            i4 = com.zentraedi.comic.q.h.kD;
                        }
                        drawableB2 = g.a.b(context2, i4);
                    } else {
                        drawableB2 = null;
                    }
                    if ((j & j3) == 0) {
                        str = null;
                    } else {
                        if (cVar != null) {
                            observableField = cVar.rightItemText;
                        } else {
                            observableField = null;
                        }
                        p1(6, observableField);
                        if (observableField != null) {
                            str = (String) observableField.get();
                        } else {
                            str = null;
                        }
                    }
                    onClickListener2 = onClickListener3;
                    i = i6;
                    str2 = str3;
                    onClickListener = rightIconOnClickListener;
                } else {
                    j2 = 400;
                }
                j8 = j & j4;
                if (j8 != 0) {
                    if (cVar != null) {
                        observableField2 = cVar.rightNavIconEnable;
                    } else {
                        observableField2 = null;
                    }
                    p1(5, observableField2);
                    if (observableField2 != null) {
                        bool = (Boolean) observableField2.get();
                    } else {
                        bool = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool);
                    if (j8 != 0) {
                        if (zK0) {
                            j9 = 262144;
                        } else {
                            j9 = 131072;
                        }
                        j |= j9;
                    }
                    Context context3 = this.F.getContext();
                    if (zK0) {
                        i4 = com.zentraedi.comic.q.h.jD;
                    } else {
                        i4 = com.zentraedi.comic.q.h.kD;
                    }
                    drawableB2 = g.a.b(context3, i4);
                } else {
                    drawableB2 = null;
                }
                if ((j & j3) == 0) {
                    str = null;
                } else {
                    if (cVar != null) {
                        observableField = cVar.rightItemText;
                    } else {
                        observableField = null;
                    }
                    p1(6, observableField);
                    if (observableField != null) {
                        str = (String) observableField.get();
                    } else {
                        str = null;
                    }
                }
                onClickListener2 = onClickListener3;
                i = i6;
                str2 = str3;
                onClickListener = rightIconOnClickListener;
            } else {
                j3 = 448;
            }
            j5 = j & 388;
            if (j5 != 0) {
                if (cVar != null) {
                    observableFieldQ = cVar.Q();
                } else {
                    observableFieldQ = null;
                }
                j4 = 416;
                p1(2, observableFieldQ);
                if (observableFieldQ != null) {
                    bool4 = (Boolean) observableFieldQ.get();
                } else {
                    bool4 = null;
                }
                zK3 = androidx.databinding.c0.K0(bool4);
                if (j5 != 0) {
                    if (zK3) {
                        j12 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                    } else {
                        j12 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                    }
                    j |= j12;
                }
                Context context4 = this.E.getContext();
                if (zK3) {
                    i5 = com.zentraedi.comic.q.h.Vy;
                } else {
                    i5 = com.zentraedi.comic.q.h.Gi;
                }
                drawableB = g.a.b(context4, i5);
            } else {
                j4 = 416;
                drawableB = null;
            }
            j6 = j & 392;
            if (j6 == 0) {
                i3 = 0;
            } else {
                if (cVar != null) {
                    observableField4 = cVar.hideRightNavText;
                } else {
                    observableField4 = null;
                }
                p1(3, observableField4);
                if (observableField4 != null) {
                    bool3 = (Boolean) observableField4.get();
                } else {
                    bool3 = null;
                }
                zK2 = androidx.databinding.c0.K0(bool3);
                if (j6 != 0) {
                    if (zK2) {
                        j11 = 16384;
                    } else {
                        j11 = 8192;
                    }
                    j |= j11;
                }
                if (zK2) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
            }
            j7 = j & 400;
            if (j7 != 0) {
                if (cVar != null) {
                    observableField3 = cVar.editModel;
                } else {
                    observableField3 = null;
                }
                j2 = 400;
                p1(4, observableField3);
                if (observableField3 != null) {
                    bool2 = (Boolean) observableField3.get();
                } else {
                    bool2 = null;
                }
                zK1 = androidx.databinding.c0.K0(bool2);
                if (j7 != 0) {
                    if (zK1) {
                        j10 = 65536;
                    } else {
                        j10 = 32768;
                    }
                    j |= j10;
                }
                if (zK1) {
                }
                j8 = j & j4;
                if (j8 != 0) {
                    if (cVar != null) {
                        observableField2 = cVar.rightNavIconEnable;
                    } else {
                        observableField2 = null;
                    }
                    p1(5, observableField2);
                    if (observableField2 != null) {
                        bool = (Boolean) observableField2.get();
                    } else {
                        bool = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool);
                    if (j8 != 0) {
                        if (zK0) {
                            j9 = 262144;
                        } else {
                            j9 = 131072;
                        }
                        j |= j9;
                    }
                    Context context5 = this.F.getContext();
                    if (zK0) {
                        i4 = com.zentraedi.comic.q.h.jD;
                    } else {
                        i4 = com.zentraedi.comic.q.h.kD;
                    }
                    drawableB2 = g.a.b(context5, i4);
                } else {
                    drawableB2 = null;
                }
                if ((j & j3) == 0) {
                    str = null;
                } else {
                    if (cVar != null) {
                        observableField = cVar.rightItemText;
                    } else {
                        observableField = null;
                    }
                    p1(6, observableField);
                    if (observableField != null) {
                        str = (String) observableField.get();
                    } else {
                        str = null;
                    }
                }
                onClickListener2 = onClickListener3;
                i = i6;
                str2 = str3;
                onClickListener = rightIconOnClickListener;
            } else {
                j2 = 400;
            }
            j8 = j & j4;
            if (j8 != 0) {
                if (cVar != null) {
                    observableField2 = cVar.rightNavIconEnable;
                } else {
                    observableField2 = null;
                }
                p1(5, observableField2);
                if (observableField2 != null) {
                    bool = (Boolean) observableField2.get();
                } else {
                    bool = null;
                }
                zK0 = androidx.databinding.c0.K0(bool);
                if (j8 != 0) {
                    if (zK0) {
                        j9 = 262144;
                    } else {
                        j9 = 131072;
                    }
                    j |= j9;
                }
                Context context6 = this.F.getContext();
                if (zK0) {
                    i4 = com.zentraedi.comic.q.h.jD;
                } else {
                    i4 = com.zentraedi.comic.q.h.kD;
                }
                drawableB2 = g.a.b(context6, i4);
            } else {
                drawableB2 = null;
            }
            if ((j & j3) == 0) {
                str = null;
            } else {
                if (cVar != null) {
                    observableField = cVar.rightItemText;
                } else {
                    observableField = null;
                }
                p1(6, observableField);
                if (observableField != null) {
                    str = (String) observableField.get();
                } else {
                    str = null;
                }
            }
            onClickListener2 = onClickListener3;
            i = i6;
            str2 = str3;
            onClickListener = rightIconOnClickListener;
        } else {
            j2 = 400;
            j3 = 448;
            j4 = 416;
            leftIconOnClickListener = null;
            i = 0;
            i2 = 0;
            onClickListener = null;
            onClickListener2 = null;
            i3 = 0;
            rightTextOnClickListener = null;
            drawableB = null;
            drawableB2 = null;
            str = null;
            str2 = null;
        }
        if ((j & 384) != 0) {
            this.E.setOnClickListener(leftIconOnClickListener);
            this.F.setOnClickListener(onClickListener);
            this.K.setOnClickListener(onClickListener2);
            this.H.setOnClickListener(rightTextOnClickListener);
        }
        if ((j & 388) != 0) {
            androidx.databinding.adapters.p.a(this.E, drawableB);
        }
        if ((j & j2) != 0) {
            this.E.setVisibility(i);
        }
        if ((j & j4) != 0) {
            androidx.databinding.adapters.p.a(this.F, drawableB2);
        }
        if ((j & 386) != 0) {
            this.F.setVisibility(i2);
        }
        if ((256 & j) != 0) {
            com.zentraedi.business.viewmodel.h.b(this.G, g8.a(Float.valueOf(44.0f)));
            androidx.databinding.adapters.j0.o(this.G, g8.h());
        }
        if ((j & j3) != 0) {
            androidx.databinding.adapters.f0.A(this.H, str);
        }
        if ((j & 392) != 0) {
            this.H.setVisibility(i3);
        }
        if ((j & 385) != 0) {
            androidx.databinding.adapters.f0.A(this.I, str2);
        }
    }

    private e5(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 7, (ImageView) objArr[1], (ImageView) objArr[5], (RelativeLayout) objArr[0], (TextView) objArr[4], (TextView) objArr[3]);
        this.L = -1L;
        this.E.setTag(null);
        this.F.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.K = linearLayout;
        linearLayout.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        P0(view);
        i0();
    }
}
