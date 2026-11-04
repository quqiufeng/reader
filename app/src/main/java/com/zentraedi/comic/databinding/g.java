package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class g extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final AppBarLayout E;

    @androidx.annotation.n0
    public final FrameLayout F;

    @androidx.annotation.n0
    public final f5 G;

    @androidx.annotation.n0
    public final ImageView H;

    @androidx.annotation.n0
    public final ImageView I;

    @androidx.annotation.n0
    public final RelativeLayout J;

    @androidx.annotation.n0
    public final TextView K;

    @androidx.annotation.n0
    public final TextView L;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.i0 M;

    protected g(Object obj, View view, int i, AppBarLayout appBarLayout, FrameLayout frameLayout, f5 f5Var, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.E = appBarLayout;
        this.F = frameLayout;
        this.G = f5Var;
        this.H = imageView;
        this.I = imageView2;
        this.J = relativeLayout;
        this.K = textView;
        this.L = textView2;
    }

    @androidx.annotation.n0
    @Deprecated
    public static g A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (g) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.L, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static g B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (g) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.L, (ViewGroup) null, false, obj);
    }

    public static g u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static g v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (g) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.L);
    }

    @androidx.annotation.n0
    public static g y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static g z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.i0 i0Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.i0 x1() {
        return this.M;
    }
}
