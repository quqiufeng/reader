package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.zentraedi.business.databinding.ej;
import com.zentraedi.business.databinding.gj;
import com.zentraedi.business.view.NoScrollViewPager;
import com.zentraedi.business.widget.MediumTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class a0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final AppBarLayout E;

    @androidx.annotation.n0
    public final CollapsingToolbarLayout F;

    @androidx.annotation.n0
    public final ej G;

    @androidx.annotation.n0
    public final r4 H;

    @androidx.annotation.n0
    public final v4 I;

    @androidx.annotation.n0
    public final gj J;

    @androidx.annotation.n0
    public final SlidingTabLayout K;

    @androidx.annotation.n0
    public final View L;

    @androidx.annotation.n0
    public final Toolbar M;

    @androidx.annotation.n0
    public final MediumTextView N;

    @androidx.annotation.n0
    public final NoScrollViewPager O;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.a3 P;

    protected a0(Object obj, View view, int i, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ej ejVar, r4 r4Var, v4 v4Var, gj gjVar, SlidingTabLayout slidingTabLayout, View view2, Toolbar toolbar, MediumTextView mediumTextView, NoScrollViewPager noScrollViewPager) {
        super(obj, view, i);
        this.E = appBarLayout;
        this.F = collapsingToolbarLayout;
        this.G = ejVar;
        this.H = r4Var;
        this.I = v4Var;
        this.J = gjVar;
        this.K = slidingTabLayout;
        this.L = view2;
        this.M = toolbar;
        this.N = mediumTextView;
        this.O = noScrollViewPager;
    }

    @androidx.annotation.n0
    @Deprecated
    public static a0 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (a0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.D0, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static a0 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (a0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.D0, (ViewGroup) null, false, obj);
    }

    public static a0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static a0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (a0) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.D0);
    }

    @androidx.annotation.n0
    public static a0 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static a0 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.a3 a3Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.a3 x1() {
        return this.P;
    }
}
