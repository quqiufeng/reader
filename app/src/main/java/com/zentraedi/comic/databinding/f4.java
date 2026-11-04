package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class f4 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final RelativeLayout F;

    @androidx.annotation.n0
    public final TextView G;

    @androidx.annotation.n0
    public final TextView H;

    @androidx.databinding.c
    protected com.zentraedi.basic.function.viewmodel.a I;

    protected f4(Object obj, View view, int i, ImageView imageView, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.E = imageView;
        this.F = relativeLayout;
        this.G = textView;
        this.H = textView2;
    }

    @androidx.annotation.n0
    @Deprecated
    public static f4 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (f4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.V9, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static f4 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (f4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.V9, (ViewGroup) null, false, obj);
    }

    public static f4 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static f4 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (f4) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.V9);
    }

    @androidx.annotation.n0
    public static f4 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static f4 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.basic.function.viewmodel.a aVar);

    @androidx.annotation.p0
    public com.zentraedi.basic.function.viewmodel.a x1() {
        return this.I;
    }
}
