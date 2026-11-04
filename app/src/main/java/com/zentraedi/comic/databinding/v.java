package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.zentraedi.business.manager.guide.RectTransparentLayout;
import com.zentraedi.business.manager.guide.TransparentView;
import com.zentraedi.comic.viewmodel.g6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class v extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final AppBarLayout E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final ImageView G;

    @androidx.annotation.n0
    public final ImageView H;

    @androidx.annotation.n0
    public final View I;

    @androidx.annotation.n0
    public final ImageView J;

    @androidx.annotation.n0
    public final ImageView K;

    @androidx.annotation.n0
    public final ConstraintLayout L;

    @androidx.annotation.n0
    public final LinearLayout M;

    @androidx.annotation.n0
    public final TextView N;

    @androidx.annotation.n0
    public final TextView O;

    @androidx.annotation.n0
    public final FrameLayout P;

    @androidx.annotation.n0
    public final TextView Q;

    @androidx.annotation.n0
    public final ImageView R;

    @androidx.annotation.n0
    public final TextView S;

    @androidx.annotation.n0
    public final TextView T;

    @androidx.annotation.n0
    public final ImageView U;

    @androidx.annotation.n0
    public final ImageView V;

    @androidx.annotation.n0
    public final ImageView W;

    @androidx.annotation.n0
    public final View X;

    @androidx.annotation.n0
    public final ImageView Y;

    @androidx.annotation.n0
    public final RelativeLayout Z;

    @androidx.annotation.n0
    public final RectTransparentLayout a0;

    @androidx.databinding.c
    protected g6 a1;

    @androidx.annotation.n0
    public final f5 b0;

    @androidx.annotation.n0
    public final p4 c0;

    @androidx.annotation.n0
    public final LinearLayout d0;

    @androidx.annotation.n0
    public final ImageView e0;

    @androidx.annotation.n0
    public final RelativeLayout f0;

    @androidx.annotation.n0
    public final TextView g0;

    @androidx.annotation.n0
    public final ImageView h0;

    @androidx.annotation.n0
    public final TextView i0;

    @androidx.annotation.n0
    public final TextView j0;

    @androidx.annotation.n0
    public final TransparentView k0;

    @androidx.annotation.n0
    public final TextView l0;

    @androidx.annotation.n0
    public final TextView m0;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.m2 n0;

    protected v(Object obj, View view, int i, AppBarLayout appBarLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, View view2, ImageView imageView4, ImageView imageView5, ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, TextView textView2, FrameLayout frameLayout, TextView textView3, ImageView imageView6, TextView textView4, TextView textView5, ImageView imageView7, ImageView imageView8, ImageView imageView9, View view3, ImageView imageView10, RelativeLayout relativeLayout, RectTransparentLayout rectTransparentLayout, f5 f5Var, p4 p4Var, LinearLayout linearLayout2, ImageView imageView11, RelativeLayout relativeLayout2, TextView textView6, ImageView imageView12, TextView textView7, TextView textView8, TransparentView transparentView, TextView textView9, TextView textView10) {
        super(obj, view, i);
        this.E = appBarLayout;
        this.F = imageView;
        this.G = imageView2;
        this.H = imageView3;
        this.I = view2;
        this.J = imageView4;
        this.K = imageView5;
        this.L = constraintLayout;
        this.M = linearLayout;
        this.N = textView;
        this.O = textView2;
        this.P = frameLayout;
        this.Q = textView3;
        this.R = imageView6;
        this.S = textView4;
        this.T = textView5;
        this.U = imageView7;
        this.V = imageView8;
        this.W = imageView9;
        this.X = view3;
        this.Y = imageView10;
        this.Z = relativeLayout;
        this.a0 = rectTransparentLayout;
        this.b0 = f5Var;
        this.c0 = p4Var;
        this.d0 = linearLayout2;
        this.e0 = imageView11;
        this.f0 = relativeLayout2;
        this.g0 = textView6;
        this.h0 = imageView12;
        this.i0 = textView7;
        this.j0 = textView8;
        this.k0 = transparentView;
        this.l0 = textView9;
        this.m0 = textView10;
    }

    @androidx.annotation.n0
    public static v A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return B1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static v B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (v) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.T, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static v C1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (v) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.T, (ViewGroup) null, false, obj);
    }

    public static v u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static v v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (v) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.T);
    }

    @androidx.annotation.n0
    public static v z1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return C1(layoutInflater, androidx.databinding.m.i());
    }

    public abstract void D1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.m2 m2Var);

    public abstract void E1(@androidx.annotation.p0 g6 g6Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.m2 x1() {
        return this.n0;
    }

    @androidx.annotation.p0
    public g6 y1() {
        return this.a1;
    }
}
