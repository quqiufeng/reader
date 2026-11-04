package com.zentraedi.comic.databinding;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.comic.viewmodel.ComicReaderViewModel;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class c4 extends b4 implements com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i e0 = null;

    @androidx.annotation.p0
    private static final SparseIntArray f0;

    @androidx.annotation.n0
    private final LinearLayout T;

    @androidx.annotation.n0
    private final ConstraintLayout U;

    @androidx.annotation.p0
    private final View.OnClickListener V;

    @androidx.annotation.p0
    private final View.OnClickListener W;

    @androidx.annotation.p0
    private final View.OnClickListener X;

    @androidx.annotation.p0
    private final View.OnClickListener Y;

    @androidx.annotation.p0
    private final View.OnClickListener Z;

    @androidx.annotation.p0
    private final View.OnClickListener a0;

    @androidx.annotation.p0
    private final View.OnClickListener b0;

    @androidx.annotation.p0
    private final View.OnClickListener c0;
    private long d0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.FA, 13);
        sparseIntArray.put(com.zentraedi.comic.q.i.rU, 14);
        sparseIntArray.put(com.zentraedi.comic.q.i.dF, 15);
    }

    public c4(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 16, e0, f0));
    }

    private boolean D1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.d0 |= 4;
        }
        return true;
    }

    private boolean E1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.d0 |= 32;
        }
        return true;
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.d0 |= 1;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.d0 |= 8;
        }
        return true;
    }

    private boolean I1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.d0 |= 16;
        }
        return true;
    }

    private boolean J1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.d0 |= 2;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.b4
    public void C1(@androidx.annotation.p0 ComicReaderViewModel comicReaderViewModel) {
        this.S = comicReaderViewModel;
        synchronized (this) {
            this.d0 |= 64;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        Resources resources;
        Configuration configuration;
        Resources resources2;
        Configuration configuration2;
        switch (i) {
            case 1:
                ComicReaderViewModel comicReaderViewModel = this.S;
                if (comicReaderViewModel != null) {
                    comicReaderViewModel.N0();
                }
                break;
            case 2:
                ComicReaderViewModel comicReaderViewModel2 = this.S;
                if (comicReaderViewModel2 != null) {
                    comicReaderViewModel2.M0();
                }
                break;
            case 3:
                ComicReaderViewModel comicReaderViewModel3 = this.S;
                if (comicReaderViewModel3 != null) {
                    comicReaderViewModel3.F1();
                }
                break;
            case 4:
                ComicReaderViewModel comicReaderViewModel4 = this.S;
                if (comicReaderViewModel4 != null && getRoot().getContext() != null && (resources = getRoot().getContext().getResources()) != null && (configuration = resources.getConfiguration()) != null) {
                    comicReaderViewModel4.O1(getRoot().getContext(), configuration.orientation);
                    break;
                }
                break;
            case 5:
                ComicReaderViewModel comicReaderViewModel5 = this.S;
                if (comicReaderViewModel5 != null) {
                    comicReaderViewModel5.D1();
                }
                break;
            case 6:
                ComicReaderViewModel comicReaderViewModel6 = this.S;
                if (comicReaderViewModel6 != null) {
                    comicReaderViewModel6.E1();
                }
                break;
            case 7:
                ComicReaderViewModel comicReaderViewModel7 = this.S;
                if (comicReaderViewModel7 != null && getRoot().getContext() != null && (resources2 = getRoot().getContext().getResources()) != null && (configuration2 = resources2.getConfiguration()) != null) {
                    comicReaderViewModel7.O1(getRoot().getContext(), configuration2.orientation);
                    break;
                }
                break;
            case 8:
                ComicReaderViewModel comicReaderViewModel8 = this.S;
                if (comicReaderViewModel8 != null) {
                    comicReaderViewModel8.N1(getRoot().getContext());
                }
                break;
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.d0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.d0 = 128L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        C1((ComicReaderViewModel) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return F1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return J1((ObservableField) obj, i2);
        }
        if (i == 2) {
            return D1((ObservableField) obj, i2);
        }
        if (i == 3) {
            return G1((ObservableField) obj, i2);
        }
        if (i == 4) {
            return I1((ObservableField) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return E1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[PHI: r2
      0x006f: PHI (r2v3 long) = (r2v0 long), (r2v10 long) binds: [B:18:0x003f, B:32:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:85:0x0107  */
    /* JADX WARN: Code duplicated, block: B:86:0x010e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX WARN: Code duplicated, block: B:96:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0136  */
    protected void r() {
        long j;
        long j2;
        long j3;
        Drawable drawableB;
        int i;
        Drawable drawableB2;
        String str;
        String str2;
        String str3;
        long j4;
        ObservableField<Boolean> observableFieldV0;
        Boolean bool;
        boolean zK0;
        Context context;
        int i2;
        long j5;
        synchronized (this) {
            j = this.d0;
            this.d0 = 0L;
        }
        ComicReaderViewModel comicReaderViewModel = this.S;
        if ((255 & j) != 0) {
            if ((j & 193) == 0) {
                str = null;
            } else {
                ObservableField<String> observableFieldG1 = comicReaderViewModel != null ? comicReaderViewModel.g1() : null;
                p1(0, observableFieldG1);
                if (observableFieldG1 != null) {
                    str = (String) observableFieldG1.get();
                } else {
                    str = null;
                }
            }
            long j6 = j & 194;
            if (j6 == 0) {
                i = 0;
            } else {
                androidx.databinding.u uVarX1 = comicReaderViewModel != null ? comicReaderViewModel.x1() : null;
                p1(1, uVarX1);
                boolean zK1 = androidx.databinding.c0.K0(uVarX1 != null ? (Boolean) uVarX1.get() : null);
                if (j6 != 0) {
                    j |= zK1 ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX : ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                }
                if (zK1) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            long j7 = j & 196;
            if (j7 != 0) {
                androidx.databinding.u uVarU0 = comicReaderViewModel != null ? comicReaderViewModel.U0() : null;
                j3 = 224;
                p1(2, uVarU0);
                boolean zK2 = androidx.databinding.c0.K0(uVarU0 != null ? (Boolean) uVarU0.get() : null);
                if (j7 != 0) {
                    j |= zK2 ? 512L : 256L;
                }
                drawableB2 = g.a.b(this.F.getContext(), zK2 ? com.zentraedi.comic.q.h.ck : com.zentraedi.comic.q.h.lk);
            } else {
                j3 = 224;
                drawableB2 = null;
            }
            if ((j & 200) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableFieldO1 = comicReaderViewModel != null ? comicReaderViewModel.o1() : null;
                p1(3, observableFieldO1);
                if (observableFieldO1 != null) {
                    str2 = (String) observableFieldO1.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 208) != 0) {
                ObservableField<String> observableFieldP1 = comicReaderViewModel != null ? comicReaderViewModel.p1() : null;
                j2 = 208;
                p1(4, observableFieldP1);
                str3 = observableFieldP1 != null ? (String) observableFieldP1.get() : null;
                j4 = j & j3;
                if (j4 != 0) {
                    if (comicReaderViewModel != null) {
                        observableFieldV0 = comicReaderViewModel.V0();
                    } else {
                        observableFieldV0 = null;
                    }
                    p1(5, observableFieldV0);
                    if (observableFieldV0 != null) {
                        bool = (Boolean) observableFieldV0.get();
                    } else {
                        bool = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool);
                    if (j4 != 0) {
                        if (zK0) {
                            j5 = 8192;
                        } else {
                            j5 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                        }
                        j |= j5;
                    }
                    if (zK0) {
                        context = this.G.getContext();
                        i2 = com.zentraedi.comic.q.h.ck;
                    } else {
                        context = this.G.getContext();
                        i2 = com.zentraedi.comic.q.h.lk;
                    }
                    drawableB = g.a.b(context, i2);
                } else {
                    drawableB = null;
                }
            } else {
                j2 = 208;
            }
            j4 = j & j3;
            if (j4 != 0) {
                if (comicReaderViewModel != null) {
                    observableFieldV0 = comicReaderViewModel.V0();
                } else {
                    observableFieldV0 = null;
                }
                p1(5, observableFieldV0);
                if (observableFieldV0 != null) {
                    bool = (Boolean) observableFieldV0.get();
                } else {
                    bool = null;
                }
                zK0 = androidx.databinding.c0.K0(bool);
                if (j4 != 0) {
                    if (zK0) {
                        j5 = 8192;
                    } else {
                        j5 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                    }
                    j |= j5;
                }
                if (zK0) {
                    context = this.G.getContext();
                    i2 = com.zentraedi.comic.q.h.ck;
                } else {
                    context = this.G.getContext();
                    i2 = com.zentraedi.comic.q.h.lk;
                }
                drawableB = g.a.b(context, i2);
            } else {
                drawableB = null;
            }
        } else {
            j2 = 208;
            j3 = 224;
            drawableB = null;
            i = 0;
            drawableB2 = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        if ((128 & j) != 0) {
            this.E.setOnClickListener(this.V);
            this.F.setOnClickListener(this.W);
            this.G.setOnClickListener(this.Z);
            this.J.setOnClickListener(this.c0);
            this.L.setOnClickListener(this.a0);
            this.M.setOnClickListener(this.X);
            this.N.setOnClickListener(this.b0);
            this.Q.setOnClickListener(this.Y);
        }
        if ((j & 196) != 0) {
            androidx.databinding.adapters.p.a(this.F, drawableB2);
        }
        if ((j & j3) != 0) {
            androidx.databinding.adapters.p.a(this.G, drawableB);
        }
        if ((j & 194) != 0) {
            this.U.setVisibility(i);
        }
        if ((j & 193) != 0) {
            androidx.databinding.adapters.f0.A(this.K, str);
        }
        if ((j & 200) != 0) {
            androidx.databinding.adapters.f0.A(this.O, str2);
        }
        if ((j & j2) != 0) {
            androidx.databinding.adapters.f0.A(this.P, str3);
        }
    }

    private c4(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 6, (ImageView) objArr[4], (ImageView) objArr[8], (ImageView) objArr[10], (RecyclerView) objArr[13], (AppCompatSeekBar) objArr[15], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[12], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[5], (TextView) objArr[9], (TextView) objArr[11], (View) objArr[14]);
        this.d0 = -1L;
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.T = linearLayout;
        linearLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.U = constraintLayout;
        constraintLayout.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        P0(view);
        this.V = new com.zentraedi.comic.generated.callback.b(this, 2);
        this.W = new com.zentraedi.comic.generated.callback.b(this, 5);
        this.X = new com.zentraedi.comic.generated.callback.b(this, 3);
        this.Y = new com.zentraedi.comic.generated.callback.b(this, 7);
        this.Z = new com.zentraedi.comic.generated.callback.b(this, 6);
        this.a0 = new com.zentraedi.comic.generated.callback.b(this, 8);
        this.b0 = new com.zentraedi.comic.generated.callback.b(this, 4);
        this.c0 = new com.zentraedi.comic.generated.callback.b(this, 1);
        i0();
    }
}
