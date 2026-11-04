package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class m2 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final TextView F;

    @androidx.annotation.n0
    public final TextView G;

    @androidx.annotation.n0
    public final ImageView H;

    @androidx.annotation.n0
    public final TextView I;

    @androidx.databinding.c
    protected Boolean J;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.j0 K;

    protected m2(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, TextView textView3) {
        super(obj, view, i);
        this.E = imageView;
        this.F = textView;
        this.G = textView2;
        this.H = imageView2;
        this.I = textView3;
    }

    @androidx.annotation.n0
    public static m2 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return B1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static m2 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (m2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.K7, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static m2 C1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (m2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.K7, (ViewGroup) null, false, obj);
    }

    public static m2 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static m2 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (m2) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.K7);
    }

    @androidx.annotation.n0
    public static m2 z1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return C1(layoutInflater, androidx.databinding.m.i());
    }

    public abstract void D1(@androidx.annotation.p0 Boolean bool);

    public abstract void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.j0 j0Var);

    @androidx.annotation.p0
    public Boolean x1() {
        return this.J;
    }

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.j0 y1() {
        return this.K;
    }
}
