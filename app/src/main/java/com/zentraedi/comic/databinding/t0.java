package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class t0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final LinearLayout F;

    @androidx.annotation.n0
    public final LinearLayout G;

    @androidx.annotation.n0
    public final LinearLayout H;

    @androidx.annotation.n0
    public final LinearLayout I;

    @androidx.annotation.n0
    public final LinearLayout J;

    @androidx.annotation.n0
    public final View K;

    @androidx.databinding.c
    protected String L;

    @androidx.databinding.c
    protected String M;

    protected t0(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, View view2) {
        super(obj, view, i);
        this.E = imageView;
        this.F = linearLayout;
        this.G = linearLayout2;
        this.H = linearLayout3;
        this.I = linearLayout4;
        this.J = linearLayout5;
        this.K = view2;
    }

    @androidx.annotation.n0
    @Deprecated
    public static t0 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (t0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.V2, (ViewGroup) null, false, obj);
    }

    public static t0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static t0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (t0) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.V2);
    }

    @androidx.annotation.n0
    public static t0 x1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return A1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static t0 y1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return z1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static t0 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (t0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.V2, viewGroup, z, obj);
    }

    @androidx.annotation.p0
    public String getOrder() {
        return this.M;
    }

    @androidx.annotation.p0
    public String getSortBy() {
        return this.L;
    }

    public abstract void setOrder(@androidx.annotation.p0 String str);

    public abstract void setSortBy(@androidx.annotation.p0 String str);
}
