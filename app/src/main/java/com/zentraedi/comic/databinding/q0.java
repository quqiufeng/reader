package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zentraedi.business.utils.r5;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class q0 extends p0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i I = null;

    @androidx.annotation.p0
    private static final SparseIntArray J;

    @androidx.annotation.n0
    private final LinearLayout F;

    @androidx.annotation.n0
    private final TextView G;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.P6, 2);
    }

    public q0(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 3, I, J));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.H = 1L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        return false;
    }

    protected void r() {
        long j;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        if ((j & 1) != 0) {
            TextView textView = this.G;
            r5.r(textView, textView.getResources().getString(com.zentraedi.comic.q.C0124q.AJ), -3);
        }
    }

    private q0(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[2]);
        this.H = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.F = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.G = textView;
        textView.setTag(null);
        P0(view);
        i0();
    }
}
