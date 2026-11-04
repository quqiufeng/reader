package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.zentraedi.business.databinding.gj;
import com.zentraedi.business.view.NoScrollViewPager;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class a2 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final AppBarLayout E;

    @androidx.annotation.n0
    public final TextView F;

    @androidx.annotation.n0
    public final TextView G;

    @androidx.annotation.n0
    public final ImageView H;

    @androidx.annotation.n0
    public final CollapsingToolbarLayout I;

    @androidx.annotation.n0
    public final RelativeLayout J;

    @androidx.annotation.n0
    public final TextView K;

    @androidx.annotation.n0
    public final TextView L;

    @androidx.annotation.n0
    public final f4 M;

    @androidx.annotation.n0
    public final TextView N;

    @androidx.annotation.n0
    public final ImageView O;

    @androidx.annotation.n0
    public final ImageView P;

    @androidx.annotation.n0
    public final ImageView Q;

    @androidx.annotation.n0
    public final LinearLayout R;

    @androidx.annotation.n0
    public final p4 S;

    @androidx.annotation.n0
    public final LinearLayout T;

    @androidx.annotation.n0
    public final gj U;

    @androidx.annotation.n0
    public final RelativeLayout V;

    @androidx.annotation.n0
    public final SlidingTabLayout W;

    @androidx.annotation.n0
    public final View X;

    @androidx.annotation.n0
    public final ImageView Y;

    @androidx.annotation.n0
    public final Toolbar Z;

    @androidx.annotation.n0
    public final FrameLayout a0;

    @androidx.annotation.n0
    public final RelativeLayout b0;

    @androidx.annotation.n0
    public final TextView c0;

    @androidx.annotation.n0
    public final RelativeLayout d0;

    @androidx.annotation.n0
    public final NoScrollViewPager e0;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.t2 f0;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.m2 g0;

    protected a2(Object obj, View view, int i, AppBarLayout appBarLayout, TextView textView, TextView textView2, ImageView imageView, CollapsingToolbarLayout collapsingToolbarLayout, RelativeLayout relativeLayout, TextView textView3, TextView textView4, f4 f4Var, TextView textView5, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, p4 p4Var, LinearLayout linearLayout2, gj gjVar, RelativeLayout relativeLayout2, SlidingTabLayout slidingTabLayout, View view2, ImageView imageView5, Toolbar toolbar, FrameLayout frameLayout, RelativeLayout relativeLayout3, TextView textView6, RelativeLayout relativeLayout4, NoScrollViewPager noScrollViewPager) {
        super(obj, view, i);
        this.E = appBarLayout;
        this.F = textView;
        this.G = textView2;
        this.H = imageView;
        this.I = collapsingToolbarLayout;
        this.J = relativeLayout;
        this.K = textView3;
        this.L = textView4;
        this.M = f4Var;
        this.N = textView5;
        this.O = imageView2;
        this.P = imageView3;
        this.Q = imageView4;
        this.R = linearLayout;
        this.S = p4Var;
        this.T = linearLayout2;
        this.U = gjVar;
        this.V = relativeLayout2;
        this.W = slidingTabLayout;
        this.X = view2;
        this.Y = imageView5;
        this.Z = toolbar;
        this.a0 = frameLayout;
        this.b0 = relativeLayout3;
        this.c0 = textView6;
        this.d0 = relativeLayout4;
        this.e0 = noScrollViewPager;
    }

    @androidx.annotation.n0
    public static a2 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return B1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static a2 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (a2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.Z5, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static a2 C1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (a2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.Z5, (ViewGroup) null, false, obj);
    }

    public static a2 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static a2 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (a2) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.Z5);
    }

    @androidx.annotation.n0
    public static a2 z1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return C1(layoutInflater, androidx.databinding.m.i());
    }

    public abstract void D1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.m2 m2Var);

    public abstract void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.t2 t2Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.m2 x1() {
        return this.g0;
    }

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.t2 y1() {
        return this.f0;
    }
}
