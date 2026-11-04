package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class a extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final AppBarLayout E;

    @androidx.annotation.n0
    public final FragmentContainerView F;

    @androidx.annotation.n0
    public final com.zentraedi.business.databinding.e3 G;

    @androidx.annotation.n0
    public final TextView H;

    @androidx.annotation.n0
    public final TextView I;

    @androidx.annotation.n0
    public final TextView J;

    @androidx.annotation.n0
    public final TextView K;

    @androidx.annotation.n0
    public final TextView L;

    @androidx.databinding.c
    protected com.zentraedi.business.viewmodel.m M;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.q N;

    protected a(Object obj, View view, int i, AppBarLayout appBarLayout, FragmentContainerView fragmentContainerView, com.zentraedi.business.databinding.e3 e3Var, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.E = appBarLayout;
        this.F = fragmentContainerView;
        this.G = e3Var;
        this.H = textView;
        this.I = textView2;
        this.J = textView3;
        this.K = textView4;
        this.L = textView5;
    }

    @androidx.annotation.n0
    public static a A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return B1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static a B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (a) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.I, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static a C1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (a) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.I, (ViewGroup) null, false, obj);
    }

    public static a u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static a v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (a) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.I);
    }

    @androidx.annotation.n0
    public static a z1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return C1(layoutInflater, androidx.databinding.m.i());
    }

    public abstract void D1(@androidx.annotation.p0 com.zentraedi.business.viewmodel.m mVar);

    public abstract void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.q qVar);

    @androidx.annotation.p0
    public com.zentraedi.business.viewmodel.m x1() {
        return this.M;
    }

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.q y1() {
        return this.N;
    }
}
