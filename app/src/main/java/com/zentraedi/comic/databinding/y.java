package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.zentraedi.business.databinding.ej;
import com.zentraedi.business.databinding.gj;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class y extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final AppBarLayout E;

    @androidx.annotation.n0
    public final CollapsingToolbarLayout F;

    @androidx.annotation.n0
    public final FrameLayout G;

    @androidx.annotation.n0
    public final ej H;

    @androidx.annotation.n0
    public final r4 I;

    @androidx.annotation.n0
    public final v4 J;

    @androidx.annotation.n0
    public final f5 K;

    @androidx.annotation.n0
    public final gj L;

    @androidx.annotation.n0
    public final Toolbar M;

    @androidx.annotation.n0
    public final TextView N;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.a3 O;

    protected y(Object obj, View view, int i, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, FrameLayout frameLayout, ej ejVar, r4 r4Var, v4 v4Var, f5 f5Var, gj gjVar, Toolbar toolbar, TextView textView) {
        super(obj, view, i);
        this.E = appBarLayout;
        this.F = collapsingToolbarLayout;
        this.G = frameLayout;
        this.H = ejVar;
        this.I = r4Var;
        this.J = v4Var;
        this.K = f5Var;
        this.L = gjVar;
        this.M = toolbar;
        this.N = textView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static y A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (y) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.C0, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static y B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (y) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.C0, (ViewGroup) null, false, obj);
    }

    public static y u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static y v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (y) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.C0);
    }

    @androidx.annotation.n0
    public static y y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static y z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.a3 a3Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.a3 x1() {
        return this.O;
    }
}
