package com.zentraedi.outreader.databinding;

import android.util.SparseIntArray;
import android.view.View;
import com.zentraedi.reader.reader.PageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class t extends s {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i G = null;

    @androidx.annotation.p0
    private static final SparseIntArray H = null;
    private long F;

    public t(@androidx.annotation.p0 androidx.databinding.l bindingComponent, @androidx.annotation.n0 View root) {
        this(bindingComponent, root, androidx.databinding.c0.m0(bindingComponent, root, 1, G, H));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.F = 1L;
        }
        C0();
    }

    public boolean l1(int variableId, @androidx.annotation.p0 Object variable) {
        return true;
    }

    protected boolean o0(int localFieldId, Object object, int fieldId) {
        return false;
    }

    protected void r() {
        synchronized (this) {
            this.F = 0L;
        }
    }

    private t(androidx.databinding.l bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (PageView) bindings[0]);
        this.F = -1L;
        this.E.setTag(null);
        P0(root);
        i0();
    }
}
