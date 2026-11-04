package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.zentraedi.business.databinding.ej;
import com.zentraedi.business.databinding.gj;
import com.zentraedi.business.widget.MediumTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class k extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final AppBarLayout E;

    @androidx.annotation.n0
    public final CollapsingToolbarLayout F;

    @androidx.annotation.n0
    public final FrameLayout G;

    @androidx.annotation.n0
    public final View H;

    @androidx.annotation.n0
    public final ej I;

    @androidx.annotation.n0
    public final LinearLayout J;

    @androidx.annotation.n0
    public final r4 K;

    @androidx.annotation.n0
    public final v4 L;

    @androidx.annotation.n0
    public final gj M;

    @androidx.annotation.n0
    public final Toolbar N;

    @androidx.annotation.n0
    public final MediumTextView O;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.a3 P;

    protected k(Object obj, View view, int i, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, FrameLayout frameLayout, View view2, ej ejVar, LinearLayout linearLayout, r4 r4Var, v4 v4Var, gj gjVar, Toolbar toolbar, MediumTextView mediumTextView) {
        super(obj, view, i);
        this.E = appBarLayout;
        this.F = collapsingToolbarLayout;
        this.G = frameLayout;
        this.H = view2;
        this.I = ejVar;
        this.J = linearLayout;
        this.K = r4Var;
        this.L = v4Var;
        this.M = gjVar;
        this.N = toolbar;
        this.O = mediumTextView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static k A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (k) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.N, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static k B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (k) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.N, (ViewGroup) null, false, obj);
    }

    public static k u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static k v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (k) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.N);
    }

    @androidx.annotation.n0
    public static k y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static k z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.a3 a3Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.a3 x1() {
        return this.P;
    }
}
