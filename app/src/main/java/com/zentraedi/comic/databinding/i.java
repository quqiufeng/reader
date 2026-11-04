package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class i extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final AppBarLayout E;

    @androidx.annotation.n0
    public final FragmentContainerView F;

    @androidx.annotation.n0
    public final com.zentraedi.business.databinding.e3 G;

    @androidx.annotation.n0
    public final TextView H;

    @androidx.databinding.c
    protected com.zentraedi.business.viewmodel.m I;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.q J;

    protected i(Object obj, View view, int i, AppBarLayout appBarLayout, FragmentContainerView fragmentContainerView, com.zentraedi.business.databinding.e3 e3Var, TextView textView) {
        super(obj, view, i);
        this.E = appBarLayout;
        this.F = fragmentContainerView;
        this.G = e3Var;
        this.H = textView;
    }

    @androidx.annotation.n0
    public static i A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return B1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static i B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (i) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.M, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static i C1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (i) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.M, (ViewGroup) null, false, obj);
    }

    public static i u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static i v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (i) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.M);
    }

    @androidx.annotation.n0
    public static i z1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return C1(layoutInflater, androidx.databinding.m.i());
    }

    public abstract void D1(@androidx.annotation.p0 com.zentraedi.business.viewmodel.m mVar);

    public abstract void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.q qVar);

    @androidx.annotation.p0
    public com.zentraedi.business.viewmodel.m x1() {
        return this.I;
    }

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.q y1() {
        return this.J;
    }
}
