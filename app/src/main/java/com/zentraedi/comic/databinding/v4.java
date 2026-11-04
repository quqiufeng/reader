package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class v4 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final LinearLayout E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.b3 G;

    protected v4(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView) {
        super(obj, view, i);
        this.E = linearLayout;
        this.F = imageView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static v4 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (v4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.da, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static v4 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (v4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.da, (ViewGroup) null, false, obj);
    }

    public static v4 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static v4 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (v4) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.da);
    }

    @androidx.annotation.n0
    public static v4 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static v4 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.b3 b3Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.b3 x1() {
        return this.G;
    }
}
