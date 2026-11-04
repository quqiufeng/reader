package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.zentraedi.outreader.model.SectionContentEntity;
import com.zentraedi.outreader.widget.TypeFaceTextView;
import com.zentraedi.reader.reader.PageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class d extends c {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i c0;

    @androidx.annotation.p0
    private static final SparseIntArray d0;

    @androidx.annotation.n0
    private final RelativeLayout a0;
    private long b0;

    static {
        androidx.databinding.c0.i iVar = new androidx.databinding.c0.i(22);
        c0 = iVar;
        iVar.a(1, new String[]{"reader_error_layout", "layout_web_content_error_tip", "reader_header_bar", "reader_footer"}, new int[]{3, 4, 5, 6}, new int[]{com.zentraedi.outreader.d.l.le, com.zentraedi.outreader.d.l.Ob, com.zentraedi.outreader.d.l.ue, com.zentraedi.outreader.d.l.me});
        iVar.a(2, new String[]{"read_slide_layout"}, new int[]{7}, new int[]{com.zentraedi.outreader.d.l.ke});
        SparseIntArray sparseIntArray = new SparseIntArray();
        d0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.outreader.d.i.xP, 8);
        sparseIntArray.put(com.zentraedi.outreader.d.i.hx, 9);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Mu, 10);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Ty, 11);
        sparseIntArray.put(com.zentraedi.outreader.d.i.sL, 12);
        sparseIntArray.put(com.zentraedi.outreader.d.i.Sy, 13);
        sparseIntArray.put(com.zentraedi.outreader.d.i.wM, 14);
        sparseIntArray.put(com.zentraedi.outreader.d.i.cz, 15);
        sparseIntArray.put(com.zentraedi.outreader.d.i.zz, 16);
        sparseIntArray.put(com.zentraedi.outreader.d.i.oz, 17);
        sparseIntArray.put(com.zentraedi.outreader.d.i.oj, 18);
        sparseIntArray.put(com.zentraedi.outreader.d.i.st, 19);
        sparseIntArray.put(com.zentraedi.outreader.d.i.pz, 20);
        sparseIntArray.put(com.zentraedi.outreader.d.i.pj, 21);
    }

    public d(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 22, c0, d0));
    }

    private boolean D1(n0 LayoutSlide, int fieldId) {
        if (fieldId != com.zentraedi.outreader.a.b) {
            return false;
        }
        synchronized (this) {
            this.b0 |= 1;
        }
        return true;
    }

    private boolean E1(p0 ReaderErrorLayout, int fieldId) {
        if (fieldId != com.zentraedi.outreader.a.b) {
            return false;
        }
        synchronized (this) {
            this.b0 |= 8;
        }
        return true;
    }

    private boolean F1(r0 ReaderFooter, int fieldId) {
        if (fieldId != com.zentraedi.outreader.a.b) {
            return false;
        }
        synchronized (this) {
            this.b0 |= 2;
        }
        return true;
    }

    private boolean G1(h1 ReaderHeaderBar, int fieldId) {
        if (fieldId != com.zentraedi.outreader.a.b) {
            return false;
        }
        synchronized (this) {
            this.b0 |= 4;
        }
        return true;
    }

    private boolean I1(j0 WebContentErrorTip, int fieldId) {
        if (fieldId != com.zentraedi.outreader.a.b) {
            return false;
        }
        synchronized (this) {
            this.b0 |= 16;
        }
        return true;
    }

    @Override // com.zentraedi.outreader.databinding.c
    public void C1(@androidx.annotation.p0 SectionContentEntity Book) {
        this.Z = Book;
    }

    public void O0(@androidx.annotation.p0 androidx.lifecycle.p0 lifecycleOwner) {
        super.O0(lifecycleOwner);
        this.M.O0(lifecycleOwner);
        this.Y.O0(lifecycleOwner);
        this.O.O0(lifecycleOwner);
        this.N.O0(lifecycleOwner);
        this.H.O0(lifecycleOwner);
    }

    public boolean g0() {
        synchronized (this) {
            try {
                if (this.b0 != 0) {
                    return true;
                }
                return this.M.g0() || this.Y.g0() || this.O.g0() || this.N.g0() || this.H.g0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.b0 = 64L;
        }
        this.M.i0();
        this.Y.i0();
        this.O.i0();
        this.N.i0();
        this.H.i0();
        C0();
    }

    public boolean l1(int variableId, @androidx.annotation.p0 Object variable) {
        if (com.zentraedi.outreader.a.s != variableId) {
            return false;
        }
        C1((SectionContentEntity) variable);
        return true;
    }

    protected boolean o0(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return D1((n0) object, fieldId);
        }
        if (localFieldId == 1) {
            return F1((r0) object, fieldId);
        }
        if (localFieldId == 2) {
            return G1((h1) object, fieldId);
        }
        if (localFieldId == 3) {
            return E1((p0) object, fieldId);
        }
        if (localFieldId != 4) {
            return false;
        }
        return I1((j0) object, fieldId);
    }

    protected void r() {
        synchronized (this) {
            this.b0 = 0L;
        }
        androidx.databinding.c0.t(this.M);
        androidx.databinding.c0.t(this.Y);
        androidx.databinding.c0.t(this.O);
        androidx.databinding.c0.t(this.N);
        androidx.databinding.c0.t(this.H);
    }

    private d(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5, (FrameLayout) bindings[0], (ImageView) bindings[18], (ImageView) bindings[21], (n0) bindings[7], (LinearLayout) bindings[2], (ProgressBar) bindings[19], (PageView) bindings[10], (DrawerLayout) bindings[9], (p0) bindings[3], (r0) bindings[6], (h1) bindings[5], (RelativeLayout) bindings[13], (RelativeLayout) bindings[11], (RelativeLayout) bindings[15], (RelativeLayout) bindings[17], (RelativeLayout) bindings[20], (RelativeLayout) bindings[16], (TypeFaceTextView) bindings[12], (TextView) bindings[14], (RelativeLayout) bindings[8], (j0) bindings[4]);
        this.b0 = -1L;
        this.E.setTag(null);
        N0(this.H);
        this.I.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) bindings[1];
        this.a0 = relativeLayout;
        relativeLayout.setTag(null);
        N0(this.M);
        N0(this.N);
        N0(this.O);
        N0(this.Y);
        P0(root);
        i0();
    }
}
