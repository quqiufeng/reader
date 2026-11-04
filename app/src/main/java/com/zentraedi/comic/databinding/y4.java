package com.zentraedi.comic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ObservableField;
import com.zentraedi.comic.viewmodel.ComicReaderViewModel;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class y4 extends x4 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i I = null;

    @androidx.annotation.p0
    private static final SparseIntArray J = null;

    @androidx.annotation.n0
    private final TextView G;
    private long H;

    public y4(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 2, I, J));
    }

    private boolean D1(ObservableField<String> observableField, int i) {
        if (i != com.zentraedi.comic.a.b) {
            return false;
        }
        synchronized (this) {
            this.H |= 1;
        }
        return true;
    }

    @Override // com.zentraedi.comic.databinding.x4
    public void C1(@androidx.annotation.p0 ComicReaderViewModel comicReaderViewModel) {
        this.F = comicReaderViewModel;
        synchronized (this) {
            this.H |= 2;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.A4);
        super.C0();
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
            this.H = 4L;
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
        if (i != 0) {
            return false;
        }
        return D1((ObservableField) obj, i2);
    }

    protected void r() {
        long j;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        ComicReaderViewModel comicReaderViewModel = this.F;
        long j2 = j & 7;
        String str = null;
        if (j2 != 0) {
            ObservableField<String> observableFieldC1 = comicReaderViewModel != null ? comicReaderViewModel.c1() : null;
            p1(0, observableFieldC1);
            if (observableFieldC1 != null) {
                str = (String) observableFieldC1.get();
            }
        }
        if (j2 != 0) {
            androidx.databinding.adapters.f0.A(this.G, str);
        }
    }

    private y4(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 1, (RelativeLayout) objArr[0]);
        this.H = -1L;
        TextView textView = (TextView) objArr[1];
        this.G = textView;
        textView.setTag(null);
        this.E.setTag(null);
        P0(view);
        i0();
    }
}
