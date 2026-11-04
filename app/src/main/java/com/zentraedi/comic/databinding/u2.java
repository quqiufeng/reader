package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class u2 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final TextView E;

    @androidx.annotation.n0
    public final TextView F;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.m0 G;

    protected u2(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.E = textView;
        this.F = textView2;
    }

    @androidx.annotation.n0
    @Deprecated
    public static u2 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (u2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.O7, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static u2 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (u2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.O7, (ViewGroup) null, false, obj);
    }

    public static u2 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static u2 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (u2) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.O7);
    }

    @androidx.annotation.n0
    public static u2 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static u2 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.m0 m0Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.m0 x1() {
        return this.G;
    }
}
