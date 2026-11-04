package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class q2 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final FrameLayout E;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.k2.a F;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.k2.a G;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.l0 H;

    protected q2(Object obj, View view, int i, FrameLayout frameLayout) {
        super(obj, view, i);
        this.E = frameLayout;
    }

    @androidx.annotation.n0
    public static q2 A1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return D1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static q2 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return C1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static q2 C1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (q2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.M7, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static q2 D1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (q2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.M7, (ViewGroup) null, false, obj);
    }

    public static q2 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static q2 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (q2) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.M7);
    }

    public abstract void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.k2.a aVar);

    public abstract void F1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.k2.a aVar);

    public abstract void G1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.l0 l0Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.k2.a x1() {
        return this.F;
    }

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.k2.a y1() {
        return this.G;
    }

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.l0 z1() {
        return this.H;
    }
}
