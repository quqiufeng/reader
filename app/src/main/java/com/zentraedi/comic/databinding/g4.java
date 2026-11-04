package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import com.zentraedi.business.utils.g8;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class g4 extends f4 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i L = null;

    @androidx.annotation.p0
    private static final SparseIntArray M = null;

    @androidx.annotation.n0
    private final ImageView J;
    private long K;

    public g4(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 5, L, M));
    }

    private boolean D1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.K |= 2;
        }
        return true;
    }

    private boolean E1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.K |= 4;
        }
        return true;
    }

    private boolean G1(ObservableField<Boolean> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.K |= 8;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.f4
    public void C1(@androidx.annotation.p0 com.zentraedi.basic.function.viewmodel.a aVar) {
        this.I = aVar;
        synchronized (this) {
            this.K |= 16;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.G2);
        super.C0();
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.K = 32L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.G2 != i) {
            return false;
        }
        C1((com.zentraedi.basic.function.viewmodel.a) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return E1((ObservableField) obj, i2);
        }
        if (i == 1) {
            return D1((ObservableField) obj, i2);
        }
        if (i == 2) {
            return F1((ObservableField) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return G1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e A[PHI: r2
      0x004e: PHI (r2v3 long) = (r2v0 long), (r2v7 long) binds: [B:9:0x0024, B:23:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    protected void r() {
        long j;
        long j2;
        View.OnClickListener onClickListener;
        int i;
        int i2;
        View.OnClickListener selectOnClickListener;
        String str;
        String str2;
        View.OnClickListener closeEditOnClickListener;
        String str3;
        long j3;
        ObservableField<Boolean> observableField;
        Boolean bool;
        boolean zK0;
        long j4;
        ObservableField<String> observableField2;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        com.zentraedi.basic.function.viewmodel.a aVar = this.I;
        if ((63 & j) != 0) {
            long j5 = j & 49;
            if (j5 == 0) {
                i2 = 0;
            } else {
                ObservableField<Boolean> observableField3 = aVar != null ? aVar.hideRightNavText : null;
                p1(0, observableField3);
                boolean zK1 = androidx.databinding.c0.K0(observableField3 != null ? (Boolean) observableField3.get() : null);
                if (j5 != 0) {
                    j |= zK1 ? 512L : 256L;
                }
                if (zK1) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
            }
            if ((j & 48) == 0 || aVar == null) {
                selectOnClickListener = null;
                closeEditOnClickListener = null;
            } else {
                selectOnClickListener = aVar.getSelectOnClickListener();
                closeEditOnClickListener = aVar.getCloseEditOnClickListener();
            }
            if ((j & 50) != 0) {
                ObservableField<String> observableField4 = aVar != null ? aVar.editNavObserver : null;
                j2 = 56;
                p1(1, observableField4);
                str3 = observableField4 != null ? (String) observableField4.get() : null;
                if ((j & 52) == 0) {
                    str = null;
                } else {
                    if (aVar != null) {
                        observableField2 = aVar.rightEditTextObserver;
                    } else {
                        observableField2 = null;
                    }
                    p1(2, observableField2);
                    if (observableField2 != null) {
                        str = (String) observableField2.get();
                    } else {
                        str = null;
                    }
                }
                j3 = j & j2;
                if (j3 != 0) {
                    if (aVar != null) {
                        observableField = aVar.showDividerLine;
                    } else {
                        observableField = null;
                    }
                    p1(3, observableField);
                    if (observableField != null) {
                        bool = (Boolean) observableField.get();
                    } else {
                        bool = null;
                    }
                    zK0 = androidx.databinding.c0.K0(bool);
                    if (j3 != 0) {
                        if (zK0) {
                            j4 = 128;
                        } else {
                            j4 = 64;
                        }
                        j |= j4;
                    }
                    str2 = str3;
                    i = zK0 ? 0 : 8;
                    onClickListener = closeEditOnClickListener;
                } else {
                    str2 = str3;
                    onClickListener = closeEditOnClickListener;
                    i = 0;
                }
            } else {
                j2 = 56;
            }
            if ((j & 52) == 0) {
                str = null;
            } else {
                if (aVar != null) {
                    observableField2 = aVar.rightEditTextObserver;
                } else {
                    observableField2 = null;
                }
                p1(2, observableField2);
                if (observableField2 != null) {
                    str = (String) observableField2.get();
                } else {
                    str = null;
                }
            }
            j3 = j & j2;
            if (j3 != 0) {
                if (aVar != null) {
                    observableField = aVar.showDividerLine;
                } else {
                    observableField = null;
                }
                p1(3, observableField);
                if (observableField != null) {
                    bool = (Boolean) observableField.get();
                } else {
                    bool = null;
                }
                zK0 = androidx.databinding.c0.K0(bool);
                if (j3 != 0) {
                    if (zK0) {
                        j4 = 128;
                    } else {
                        j4 = 64;
                    }
                    j |= j4;
                }
                str2 = str3;
                i = zK0 ? 0 : 8;
                onClickListener = closeEditOnClickListener;
            } else {
                str2 = str3;
                onClickListener = closeEditOnClickListener;
                i = 0;
            }
        } else {
            j2 = 56;
            onClickListener = null;
            i = 0;
            i2 = 0;
            selectOnClickListener = null;
            str = null;
            str2 = null;
        }
        if ((j & 48) != 0) {
            this.E.setOnClickListener(onClickListener);
            this.G.setOnClickListener(selectOnClickListener);
        }
        if ((j & j2) != 0) {
            this.J.setVisibility(i);
        }
        if ((32 & j) != 0) {
            com.zentraedi.business.viewmodel.h.b(this.F, g8.a(Float.valueOf(44.0f)));
            androidx.databinding.adapters.j0.o(this.F, g8.h());
        }
        if ((j & 52) != 0) {
            androidx.databinding.adapters.f0.A(this.G, str);
        }
        if ((j & 49) != 0) {
            this.G.setVisibility(i2);
        }
        if ((j & 50) != 0) {
            androidx.databinding.adapters.f0.A(this.H, str2);
        }
    }

    private g4(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 4, (ImageView) objArr[1], (RelativeLayout) objArr[0], (TextView) objArr[3], (TextView) objArr[2]);
        this.K = -1L;
        this.E.setTag(null);
        ImageView imageView = (ImageView) objArr[4];
        this.J = imageView;
        imageView.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        P0(view);
        i0();
    }
}
