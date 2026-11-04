package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class h4 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final LinearLayout E;

    @androidx.annotation.n0
    public final LinearLayout F;

    @androidx.annotation.n0
    public final View G;

    @androidx.annotation.n0
    public final View H;

    protected h4(Object obj, View view, int i, LinearLayout linearLayout, LinearLayout linearLayout2, View view2, View view3) {
        super(obj, view, i);
        this.E = linearLayout;
        this.F = linearLayout2;
        this.G = view2;
        this.H = view3;
    }

    @androidx.annotation.n0
    @Deprecated
    public static h4 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (h4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.W9, (ViewGroup) null, false, obj);
    }

    public static h4 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static h4 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (h4) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.W9);
    }

    @androidx.annotation.n0
    public static h4 x1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return A1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static h4 y1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return z1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static h4 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (h4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.W9, viewGroup, z, obj);
    }
}
