package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class d5 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final RelativeLayout G;

    @androidx.annotation.n0
    public final TextView H;

    @androidx.annotation.n0
    public final TextView I;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.c J;

    protected d5(Object obj, View view, int i, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.E = imageView;
        this.F = imageView2;
        this.G = relativeLayout;
        this.H = textView;
        this.I = textView2;
    }

    @androidx.annotation.n0
    @Deprecated
    public static d5 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (d5) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.ha, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static d5 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (d5) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.ha, (ViewGroup) null, false, obj);
    }

    public static d5 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static d5 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (d5) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.ha);
    }

    @androidx.annotation.n0
    public static d5 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static d5 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.c cVar);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.c x1() {
        return this.J;
    }
}
