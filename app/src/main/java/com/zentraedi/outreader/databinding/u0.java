package com.zentraedi.outreader.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ObservableBoolean;
import com.litao.slider.NiftySlider;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class u0 extends t0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i U = null;

    @androidx.annotation.p0
    private static final SparseIntArray V;
    private long T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.Bk, 8);
        sparseIntArray.put(com.zentraedi.outreader.d.i.UC, 9);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Py, 10);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ai, 11);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Mn, 12);
        sparseIntArray.put(com.zentraedi.outreader.d.i.KN, 13);
    }

    public u0(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 14, U, V));
    }

    private boolean D1(ObservableBoolean ViewModelAutoPageCover, int fieldId) {
        if (fieldId != com.zentraedi.outreader.a.b) {
            return false;
        }
        synchronized (this) {
            this.T |= 1;
        }
        return true;
    }

    private boolean E1(ObservableBoolean ViewModelAutoPageSupportScroll, int fieldId) {
        if (fieldId != com.zentraedi.outreader.a.b) {
            return false;
        }
        synchronized (this) {
            this.T |= 2;
        }
        return true;
    }

    @Override // com.zentraedi.outreader.databinding.t0
    public void C1(@androidx.annotation.p0 com.zentraedi.outreader.viewmodel.a ViewModel) {
        this.S = ViewModel;
        synchronized (this) {
            this.T |= 4;
        }
        notifyPropertyChanged(com.zentraedi.outreader.a.A4);
        super.C0();
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.T != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.T = 8L;
        }
        C0();
    }

    public boolean l1(int variableId, @androidx.annotation.p0 Object variable) {
        if (com.zentraedi.outreader.a.A4 != variableId) {
            return false;
        }
        C1((com.zentraedi.outreader.viewmodel.a) variable);
        return true;
    }

    protected boolean o0(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return D1((ObservableBoolean) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return E1((ObservableBoolean) object, fieldId);
    }

    protected void r() {
        long j;
        long j2;
        long j3;
        Drawable drawableB;
        int i;
        int i2;
        int iB;
        int iB2;
        int i3;
        Drawable drawableB2;
        int i4;
        Context context;
        int i5;
        synchronized (this) {
            j = this.T;
            j2 = 0;
            this.T = 0L;
        }
        com.zentraedi.outreader.viewmodel.a aVar = this.S;
        Drawable drawableM = null;
        int i6 = 0;
        if ((15 & j) != 0) {
            long j4 = j & 13;
            if (j4 != 0) {
                ObservableBoolean observableBooleanL = aVar != null ? aVar.L() : null;
                p1(0, observableBooleanL);
                boolean z = observableBooleanL != null ? observableBooleanL.get() : false;
                if (j4 != 0) {
                    j |= z ? 663552L : 331776L;
                }
                iB = androidx.databinding.c0.B(this.Q, z ? com.zentraedi.outreader.d.f.Qx : com.zentraedi.outreader.d.f.Nx);
                drawableB = z ? g.a.b(this.J.getContext(), com.zentraedi.outreader.d.h.GZ) : g.a.b(this.J.getContext(), com.zentraedi.outreader.d.h.HZ);
                i2 = z ? 8 : 0;
                if ((j & 13) != j2) {
                    j |= !z ? 32928L : 16464L;
                }
                if (z) {
                    j3 = 14;
                    iB2 = androidx.databinding.c0.B(this.P, com.zentraedi.outreader.d.f.Nx);
                } else {
                    j3 = 14;
                    iB2 = androidx.databinding.c0.B(this.P, com.zentraedi.outreader.d.f.Qx);
                }
                i4 = !z ? 8 : 0;
                if (z) {
                    context = this.I.getContext();
                    i5 = com.zentraedi.outreader.d.h.HZ;
                } else {
                    context = this.I.getContext();
                    i5 = com.zentraedi.outreader.d.h.GZ;
                }
                drawableB2 = g.a.b(context, i5);
            } else {
                j2 = 0;
                j3 = 14;
                drawableB = null;
                drawableB2 = null;
                i2 = 0;
                iB = 0;
                iB2 = 0;
                i4 = 0;
            }
            long j5 = j & j3;
            if (j5 != j2) {
                drawableM = aVar != null ? aVar.M() : null;
                p1(1, drawableM);
                boolean z2 = drawableM != null ? drawableM.get() : false;
                if (j5 != j2) {
                    j |= z2 ? 2560L : 1280L;
                }
                int i7 = z2 ? 0 : 8;
                i6 = i4;
                i3 = z2 ? 8 : 0;
                i = i7;
                drawableM = drawableB2;
            } else {
                i = 0;
                drawableM = drawableB2;
                i6 = i4;
                i3 = 0;
            }
        } else {
            j2 = 0;
            j3 = 14;
            drawableB = null;
            i = 0;
            i2 = 0;
            iB = 0;
            iB2 = 0;
            i3 = 0;
        }
        if ((13 & j) != j2) {
            this.F.setVisibility(i6);
            this.G.setVisibility(i2);
            androidx.databinding.adapters.j0.b(this.I, drawableM);
            androidx.databinding.adapters.j0.b(this.J, drawableB);
            this.P.setTextColor(iB2);
            this.Q.setTextColor(iB);
        }
        if ((j & j3) != j2) {
            this.J.setVisibility(i);
            this.K.setVisibility(i3);
        }
    }

    private u0(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2, (View) bindings[11], (ImageView) bindings[6], (ImageView) bindings[3], (FrameLayout) bindings[8], (LinearLayout) bindings[5], (LinearLayout) bindings[2], (LinearLayout) bindings[1], (LinearLayout) bindings[0], (RelativeLayout) bindings[12], (LinearLayout) bindings[10], (NiftySlider) bindings[9], (TextView) bindings[7], (TextView) bindings[4], (TextView) bindings[13]);
        this.T = -1L;
        this.F.setTag(null);
        this.G.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        P0(root);
        i0();
    }
}
