package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.business.utils.r5;
import com.zentraedi.business.view.BaseEditText;
import com.zentraedi.comic.viewmodel.ComicCodeBookOperate;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class x0 extends w0 implements com.zentraedi.comic.generated.callback.a.InterfaceC0119a, com.zentraedi.comic.generated.callback.b.a {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i b0 = null;

    @androidx.annotation.p0
    private static final SparseIntArray c0;

    @androidx.annotation.n0
    private final LinearLayout N;

    @androidx.annotation.n0
    private final TextView O;

    @androidx.annotation.n0
    private final LinearLayout P;

    @androidx.annotation.n0
    private final LinearLayout Q;

    @androidx.annotation.n0
    private final ImageView R;

    @androidx.annotation.n0
    private final LinearLayout S;

    @androidx.annotation.n0
    private final TextView T;

    @androidx.annotation.p0
    private final CompoundButton.OnCheckedChangeListener U;

    @androidx.annotation.p0
    private final View.OnClickListener V;

    @androidx.annotation.p0
    private final View.OnClickListener W;

    @androidx.annotation.p0
    private final View.OnClickListener X;
    private androidx.databinding.o Y;
    private androidx.databinding.o Z;
    private long a0;

    class a implements androidx.databinding.o {
        a() {
        }

        public void a() {
            ObservableField<String> observableFieldW;
            String strA = androidx.databinding.adapters.f0.a(x0.this.H);
            com.zentraedi.comic.viewmodel.k0 k0Var = x0.this.L;
            if (k0Var == null || (observableFieldW = k0Var.W()) == null) {
                return;
            }
            observableFieldW.set(strA);
        }
    }

    class b implements androidx.databinding.o {
        b() {
        }

        public void a() {
            ObservableField<String> password;
            String strA = androidx.databinding.adapters.f0.a(x0.this.I);
            com.zentraedi.comic.viewmodel.k0 k0Var = x0.this.L;
            if (k0Var == null || (password = k0Var.getPassword()) == null) {
                return;
            }
            password.set(strA);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.tK, 12);
        sparseIntArray.put(com.zentraedi.comic.q.i.Ci, 13);
    }

    public x0(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 14, b0, c0));
    }

    private boolean F1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= 2;
        }
        return true;
    }

    private boolean G1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.a0 |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.w0
    public void D1(@androidx.annotation.p0 ComicCodeBookOperate comicCodeBookOperate) {
        this.M = comicCodeBookOperate;
    }

    @Override // com.zentraedi.comic.databinding.w0
    public void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.k0 k0Var) {
        this.L = k0Var;
        synchronized (this) {
            this.a0 |= 8;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
    }

    @Override // com.zentraedi.comic.generated.callback.b.a
    public final void a(int i, View view) {
        com.zentraedi.comic.viewmodel.k0 k0Var;
        if (i == 1) {
            com.zentraedi.comic.viewmodel.k0 k0Var2 = this.L;
            if (k0Var2 != null) {
                k0Var2.L();
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 4 && (k0Var = this.L) != null) {
                k0Var.O();
                return;
            }
            return;
        }
        com.zentraedi.comic.viewmodel.k0 k0Var3 = this.L;
        if (k0Var3 != null) {
            k0Var3.N();
        }
    }

    @Override // com.zentraedi.comic.generated.callback.a.InterfaceC0119a
    public final void b(int i, CompoundButton compoundButton, boolean z) {
        com.zentraedi.comic.viewmodel.k0 k0Var = this.L;
        if (k0Var != null) {
            if (z) {
                k0Var.editTextActionChanged(z ? 1 : 2);
            } else {
                k0Var.editTextActionChanged(z ? 1 : 2);
            }
        }
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.a0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.a0 = 16L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.J == i) {
            D1((ComicCodeBookOperate) obj);
            return true;
        }
        if (com.zentraedi.comic.a.A4 != i) {
            return false;
        }
        E1((com.zentraedi.comic.viewmodel.k0) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        if (i == 0) {
            return G1((ObservableField) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return F1((ObservableField) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    protected void r() {
        long j;
        long j2;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        boolean z;
        synchronized (this) {
            j = this.a0;
            this.a0 = 0L;
        }
        com.zentraedi.comic.viewmodel.k0 k0Var = this.L;
        boolean z2 = false;
        if ((27 & j) != 0) {
            if ((j & 25) == 0) {
                str2 = null;
            } else {
                ObservableField<String> observableFieldW = k0Var != null ? k0Var.W() : null;
                p1(0, observableFieldW);
                if (observableFieldW != null) {
                    str2 = (String) observableFieldW.get();
                } else {
                    str2 = null;
                }
            }
            long j3 = j & 26;
            j2 = 0;
            if (j3 != 0) {
                ObservableField<String> password = k0Var != null ? k0Var.getPassword() : null;
                p1(1, password);
                str = password != null ? (String) password.get() : null;
                z = (str != null ? str.length() : 0) > 0;
                if (j3 != 0) {
                    j |= z ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS : 512L;
                }
                i3 = z ? 0 : 8;
            } else {
                str = null;
                i3 = 0;
                z = false;
            }
            long j4 = j & 24;
            if (j4 != 0) {
                ComicCodeBookOperate comicCodeBookOperateX = k0Var != null ? k0Var.X() : null;
                ComicCodeBookOperate comicCodeBookOperate = ComicCodeBookOperate.DELETE;
                boolean z3 = comicCodeBookOperateX != comicCodeBookOperate;
                boolean z4 = comicCodeBookOperateX == comicCodeBookOperate;
                if (j4 != 0) {
                    j |= z3 ? 256L : 128L;
                }
                if ((j & 24) != 0) {
                    j |= z4 ? 64L : 32L;
                }
                int i4 = z3 ? 0 : 8;
                int i5 = z4 ? 0 : 8;
                i2 = i4;
                i = i5;
            } else {
                i = 0;
                i2 = 0;
            }
            z2 = z;
        } else {
            j2 = 0;
            str = null;
            str2 = null;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if ((j & 16) != j2) {
            this.E.setOnClickListener(this.V);
            this.F.setOnCheckedChangeListener(this.U);
            androidx.databinding.adapters.f0.C(this.H, (androidx.databinding.adapters.f0.c) null, (androidx.databinding.adapters.f0.d) null, (androidx.databinding.adapters.f0.b) null, this.Y);
            androidx.databinding.adapters.f0.C(this.I, (androidx.databinding.adapters.f0.c) null, (androidx.databinding.adapters.f0.d) null, (androidx.databinding.adapters.f0.b) null, this.Z);
            this.R.setOnClickListener(this.W);
            TextView textView = this.T;
            r5.r(textView, textView.getResources().getString(com.zentraedi.comic.q.C0124q.aO3), -3);
        }
        if ((j & 26) != j2) {
            this.G.setEnabled(z2);
            androidx.databinding.adapters.j0.e(this.G, this.X, z2);
            androidx.databinding.adapters.f0.A(this.I, str);
            this.Q.setVisibility(i3);
        }
        if ((j & 25) != j2) {
            androidx.databinding.adapters.f0.A(this.H, str2);
        }
        if ((j & 24) != j2) {
            this.O.setVisibility(i);
            this.P.setVisibility(i2);
            this.S.setVisibility(i2);
        }
    }

    private x0(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 2, (TextView) objArr[10], (CheckBox) objArr[6], (TextView) objArr[11], (BaseEditText) objArr[9], (BaseEditText) objArr[3], (View) objArr[13], (TextView) objArr[12]);
        this.Y = new a();
        this.Z = new b();
        this.a0 = -1L;
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.N = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.O = textView;
        textView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[2];
        this.P = linearLayout2;
        linearLayout2.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[4];
        this.Q = linearLayout3;
        linearLayout3.setTag(null);
        ImageView imageView = (ImageView) objArr[5];
        this.R = imageView;
        imageView.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[7];
        this.S = linearLayout4;
        linearLayout4.setTag(null);
        TextView textView2 = (TextView) objArr[8];
        this.T = textView2;
        textView2.setTag(null);
        P0(view);
        this.U = new com.zentraedi.comic.generated.callback.a(this, 2);
        this.V = new com.zentraedi.comic.generated.callback.b(this, 3);
        this.W = new com.zentraedi.comic.generated.callback.b(this, 1);
        this.X = new com.zentraedi.comic.generated.callback.b(this, 4);
        i0();
    }
}
