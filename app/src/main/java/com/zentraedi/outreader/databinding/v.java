package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class v extends u {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i J;

    @androidx.annotation.p0
    private static final SparseIntArray K;

    @androidx.annotation.n0
    private final RelativeLayout H;
    private long I;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(3);
        J = iVar;
        iVar.a(0, new String[]{"reader_header_bar", "reader_footer_menu_v2"}, new int[]{1, 2}, new int[]{com.zentraedi.outreader.d.l.ue, com.zentraedi.outreader.d.l.te});
        K = null;
    }

    public v(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 3, J, K));
    }

    private boolean D1(f1 ReaderFooter, int fieldId) {
        if (fieldId != com.zentraedi.outreader.a.b) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    private boolean E1(h1 ReaderHeaderBar, int fieldId) {
        if (fieldId != com.zentraedi.outreader.a.b) {
            return false;
        }
        synchronized (this) {
            this.I |= 2;
        }
        return true;
    }

    @Override // com.zentraedi.outreader.databinding.u
    public void C1(@androidx.annotation.p0 com.zentraedi.outreader.viewmodel.c SettingViewModel) {
        this.G = SettingViewModel;
        synchronized (this) {
            this.I |= 4;
        }
        notifyPropertyChanged(com.zentraedi.outreader.a.F3);
        super.C0();
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 lifecycleOwner) {
        super.O0(lifecycleOwner);
        this.F.O0(lifecycleOwner);
        this.E.O0(lifecycleOwner);
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.F.g0() || this.E.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.I = 8L;
        }
        this.F.i0();
        this.E.i0();
        C0();
    }

    public boolean l1(int variableId, @androidx.annotation.p0 Object variable) {
        if (com.zentraedi.outreader.a.F3 != variableId) {
            return false;
        }
        C1((com.zentraedi.outreader.viewmodel.c) variable);
        return true;
    }

    protected boolean o0(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return D1((f1) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return E1((h1) object, fieldId);
    }

    protected void r() {
        long j;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        com.zentraedi.outreader.viewmodel.c cVar = this.G;
        if ((j & 12) != 0) {
            this.E.C1(cVar);
        }
        androidx.databinding.c0.t(this.F);
        androidx.databinding.c0.t(this.E);
    }

    private v(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2, (f1) bindings[2], (h1) bindings[1]);
        this.I = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) bindings[0];
        this.H = relativeLayout;
        relativeLayout.setTag(null);
        N0(this.E);
        N0(this.F);
        P0(root);
        i0();
    }
}
