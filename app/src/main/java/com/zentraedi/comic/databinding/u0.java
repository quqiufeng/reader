package com.zentraedi.comic.databinding;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.business.request.FileListRequest;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public class u0 extends t0 {

    @androidx.annotation.p0
    private static final androidx.databinding.c0.i Z = null;

    @androidx.annotation.p0
    private static final SparseIntArray a0;

    @androidx.annotation.n0
    private final LinearLayout N;

    @androidx.annotation.n0
    private final ImageView O;

    @androidx.annotation.n0
    private final TextView P;

    @androidx.annotation.n0
    private final TextView Q;

    @androidx.annotation.n0
    private final ImageView R;

    @androidx.annotation.n0
    private final TextView S;

    @androidx.annotation.n0
    private final ImageView T;

    @androidx.annotation.n0
    private final TextView U;

    @androidx.annotation.n0
    private final ImageView V;

    @androidx.annotation.n0
    private final TextView W;

    @androidx.annotation.n0
    private final ImageView X;
    private long Y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a0 = sparseIntArray;
        sparseIntArray.put(com.zentraedi.comic.q.i.P6, 11);
        sparseIntArray.put(com.zentraedi.comic.q.i.TT, 12);
        sparseIntArray.put(com.zentraedi.comic.q.i.Dn, 13);
        sparseIntArray.put(com.zentraedi.comic.q.i.jo, 14);
        sparseIntArray.put(com.zentraedi.comic.q.i.vo, 15);
        sparseIntArray.put(com.zentraedi.comic.q.i.zo, 16);
        sparseIntArray.put(com.zentraedi.comic.q.i.Ao, 17);
    }

    public u0(@androidx.annotation.p0 androidx.databinding.l lVar, @androidx.annotation.n0 View view) {
        this(lVar, view, androidx.databinding.c0.m0(lVar, view, 18, Z, a0));
    }

    public boolean g0() {
        synchronized (this) {
            try {
                return this.Y != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i0() {
        synchronized (this) {
            this.Y = 4L;
        }
        C0();
    }

    public boolean l1(int i, @androidx.annotation.p0 Object obj) {
        if (com.zentraedi.comic.a.E2 == i) {
            setOrder((String) obj);
            return true;
        }
        if (com.zentraedi.comic.a.a4 != i) {
            return false;
        }
        setSortBy((String) obj);
        return true;
    }

    protected boolean o0(int i, Object obj, int i2) {
        return false;
    }

    protected void r() {
        long j;
        long j2;
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        boolean zEquals4;
        boolean zEquals5;
        String string;
        String string2;
        Drawable drawableB;
        Drawable drawableB2;
        Drawable drawableB3;
        Drawable drawableB4;
        String string3;
        String string4;
        Drawable drawableB5;
        String string5;
        Context context;
        int i;
        Resources resources;
        int i2;
        Context context2;
        int i3;
        Context context3;
        int i4;
        String str;
        synchronized (this) {
            j = this.Y;
            j2 = 0;
            this.Y = 0L;
        }
        String str2 = this.M;
        String str3 = this.L;
        long j3 = j & 7;
        if (j3 != 0) {
            zEquals2 = "type".equals(str3);
            zEquals3 = "mtime".equals(str3);
            zEquals4 = "ctime".equals(str3);
            zEquals5 = "size".equals(str3);
            zEquals = "name".equals(str3);
            if (j3 != 0) {
                j |= zEquals2 ? 65536L : 32768L;
            }
            if ((j & 7) != 0) {
                j |= zEquals3 ? 4194304L : 2097152L;
            }
            if ((j & 7) != 0) {
                j |= zEquals4 ? 1048576L : 524288L;
            }
            if ((j & 7) != 0) {
                j |= zEquals5 ? 4294967296L : 2147483648L;
            }
            if ((j & 7) != 0) {
                j |= zEquals ? ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF : ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
            }
        } else {
            zEquals = false;
            zEquals2 = false;
            zEquals3 = false;
            zEquals4 = false;
            zEquals5 = false;
        }
        boolean zEquals6 = ((4300279808L & j) == 0 || (str = FileListRequest.ORDER_BY_ASC) == null) ? false : str.equals(str2);
        long j4 = j & 7;
        if (j4 != 0) {
            boolean z = zEquals ? zEquals6 : false;
            boolean z2 = zEquals2 ? zEquals6 : false;
            boolean z3 = zEquals4 ? zEquals6 : false;
            boolean z4 = zEquals3 ? zEquals6 : false;
            boolean z5 = zEquals5 ? zEquals6 : false;
            if (j4 != 0) {
                j |= z ? 16640L : 8320L;
            }
            if ((j & 7) != 0) {
                j |= z2 ? 1090519040L : 545259520L;
            }
            if ((j & 7) != 0) {
                j |= z3 ? 268435520L : 134217760L;
            }
            if ((j & 7) != 0) {
                j |= z4 ? 1040L : 520L;
            }
            if ((j & 7) != 0) {
                j |= z5 ? 67371008L : 33685504L;
            }
            string = this.S.getResources().getString(z ? com.zentraedi.comic.q.C0124q.Se3 : com.zentraedi.comic.q.C0124q.sd3);
            if (z) {
                context = this.R.getContext();
                i = com.zentraedi.comic.q.h.At;
            } else {
                context = this.R.getContext();
                i = com.zentraedi.comic.q.h.tt;
            }
            drawableB2 = g.a.b(context, i);
            drawableB3 = g.a.b(this.V.getContext(), z2 ? com.zentraedi.comic.q.h.Xu : com.zentraedi.comic.q.h.yu);
            if (z2) {
                resources = this.W.getResources();
                i2 = com.zentraedi.comic.q.C0124q.jJ;
            } else {
                resources = this.W.getResources();
                i2 = com.zentraedi.comic.q.C0124q.iJ;
            }
            string3 = resources.getString(i2);
            string5 = this.Q.getResources().getString(z3 ? com.zentraedi.comic.q.C0124q.pK : com.zentraedi.comic.q.C0124q.JK);
            if (z3) {
                context2 = this.O.getContext();
                i3 = com.zentraedi.comic.q.h.Hg;
            } else {
                context2 = this.O.getContext();
                i3 = com.zentraedi.comic.q.h.Fg;
            }
            drawableB5 = g.a.b(context2, i3);
            string2 = z4 ? this.P.getResources().getString(com.zentraedi.comic.q.C0124q.JK) : this.P.getResources().getString(com.zentraedi.comic.q.C0124q.pK);
            drawableB = g.a.b(this.X.getContext(), z4 ? com.zentraedi.comic.q.h.Ow : com.zentraedi.comic.q.h.Nw);
            string4 = this.U.getResources().getString(z5 ? com.zentraedi.comic.q.C0124q.JL : com.zentraedi.comic.q.C0124q.SJ);
            if (z5) {
                context3 = this.T.getContext();
                i4 = com.zentraedi.comic.q.h.St;
            } else {
                context3 = this.T.getContext();
                i4 = com.zentraedi.comic.q.h.Lt;
            }
            drawableB4 = g.a.b(context3, i4);
        } else {
            j2 = 0;
            string = null;
            string2 = null;
            drawableB = null;
            drawableB2 = null;
            drawableB3 = null;
            drawableB4 = null;
            string3 = null;
            string4 = null;
            drawableB5 = null;
            string5 = null;
        }
        if ((j & 7) != j2) {
            androidx.databinding.adapters.p.a(this.O, drawableB5);
            androidx.databinding.adapters.f0.A(this.P, string2);
            androidx.databinding.adapters.f0.A(this.Q, string5);
            androidx.databinding.adapters.p.a(this.R, drawableB2);
            androidx.databinding.adapters.f0.A(this.S, string);
            androidx.databinding.adapters.p.a(this.T, drawableB4);
            androidx.databinding.adapters.f0.A(this.U, string4);
            androidx.databinding.adapters.p.a(this.V, drawableB3);
            androidx.databinding.adapters.f0.A(this.W, string3);
            androidx.databinding.adapters.p.a(this.X, drawableB);
        }
    }

    @Override // com.zentraedi.comic.databinding.t0
    public void setOrder(@androidx.annotation.p0 String str) {
        this.M = str;
        synchronized (this) {
            this.Y |= 1;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.E2);
        super.C0();
    }

    @Override // com.zentraedi.comic.databinding.t0
    public void setSortBy(@androidx.annotation.p0 String str) {
        this.L = str;
        synchronized (this) {
            this.Y |= 2;
        }
        notifyPropertyChanged(com.zentraedi.comic.a.a4);
        super.C0();
    }

    private u0(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[11], (LinearLayout) objArr[13], (LinearLayout) objArr[14], (LinearLayout) objArr[15], (LinearLayout) objArr[16], (LinearLayout) objArr[17], (View) objArr[12]);
        this.Y = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.N = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.O = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.P = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.Q = textView2;
        textView2.setTag(null);
        ImageView imageView2 = (ImageView) objArr[3];
        this.R = imageView2;
        imageView2.setTag(null);
        TextView textView3 = (TextView) objArr[4];
        this.S = textView3;
        textView3.setTag(null);
        ImageView imageView3 = (ImageView) objArr[5];
        this.T = imageView3;
        imageView3.setTag(null);
        TextView textView4 = (TextView) objArr[6];
        this.U = textView4;
        textView4.setTag(null);
        ImageView imageView4 = (ImageView) objArr[7];
        this.V = imageView4;
        imageView4.setTag(null);
        TextView textView5 = (TextView) objArr[8];
        this.W = textView5;
        textView5.setTag(null);
        ImageView imageView5 = (ImageView) objArr[9];
        this.X = imageView5;
        imageView5.setTag(null);
        P0(view);
        i0();
    }
}
