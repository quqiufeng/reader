package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zentraedi.business.view.BaseEditText;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class z0 extends y0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i d0 = null;

    @androidx.annotation.p0
    private static final SparseIntArray e0;

    @androidx.annotation.n0
    private final FrameLayout b0;
    private long c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.xo, 1);
        sparseIntArray.put(com.zentraedi.comic.q.i.P6, 2);
        sparseIntArray.put(com.zentraedi.comic.q.i.Ys, 3);
        sparseIntArray.put(com.zentraedi.comic.q.i.Ld, 4);
        sparseIntArray.put(com.zentraedi.comic.q.i.N6, 5);
        sparseIntArray.put(com.zentraedi.comic.q.i.fo, 6);
        sparseIntArray.put(com.zentraedi.comic.q.i.Gb, 7);
        sparseIntArray.put(com.zentraedi.comic.q.i.ei, 8);
        sparseIntArray.put(com.zentraedi.comic.q.i.ii, 9);
        sparseIntArray.put(com.zentraedi.comic.q.i.Eb, 10);
        sparseIntArray.put(com.zentraedi.comic.q.i.xh, 11);
        sparseIntArray.put(com.zentraedi.comic.q.i.ji, 12);
        sparseIntArray.put(com.zentraedi.comic.q.i.Kd, 13);
        sparseIntArray.put(com.zentraedi.comic.q.i.hF, 14);
        sparseIntArray.put(com.zentraedi.comic.q.i.lF, 15);
        sparseIntArray.put(com.zentraedi.comic.q.i.Zs, 16);
        sparseIntArray.put(com.zentraedi.comic.q.i.mF, 17);
        sparseIntArray.put(com.zentraedi.comic.q.i.mi, 18);
        sparseIntArray.put(com.zentraedi.comic.q.i.de, 19);
        sparseIntArray.put(com.zentraedi.comic.q.i.Fo, 20);
        sparseIntArray.put(com.zentraedi.comic.q.i.QT, 21);
        sparseIntArray.put(com.zentraedi.comic.q.i.PT, 22);
        sparseIntArray.put(com.zentraedi.comic.q.i.S7, 23);
    }

    public z0(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 24, d0, e0));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.c0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.c0 = 1L;
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
        synchronized (this) {
            this.c0 = 0L;
        }
    }

    private z0(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[5], (ImageView) objArr[2], (TextView) objArr[23], (TextView) objArr[10], (ImageView) objArr[7], (TextView) objArr[13], (BaseEditText) objArr[4], (BaseEditText) objArr[19], (ImageView) objArr[11], (ImageView) objArr[8], (ImageView) objArr[9], (ImageView) objArr[12], (ImageView) objArr[18], (FrameLayout) objArr[6], (RelativeLayout) objArr[1], (LinearLayout) objArr[20], (TextView) objArr[3], (TextView) objArr[16], (TextView) objArr[14], (ImageView) objArr[15], (TextView) objArr[17], (TextView) objArr[22], (ProgressBar) objArr[21]);
        this.c0 = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.b0 = frameLayout;
        frameLayout.setTag(null);
        P0(view);
        i0();
    }
}
