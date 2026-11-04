package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class m1 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final RecyclerView E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final TextView G;

    @androidx.annotation.n0
    public final TextView H;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.a0 I;

    protected m1(Object obj, View view, int i, RecyclerView recyclerView, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.E = recyclerView;
        this.F = imageView;
        this.G = textView;
        this.H = textView2;
    }

    @androidx.annotation.n0
    @Deprecated
    public static m1 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (m1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.E5, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static m1 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (m1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.E5, (ViewGroup) null, false, obj);
    }

    public static m1 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static m1 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (m1) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.E5);
    }

    @androidx.annotation.n0
    public static m1 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static m1 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.a0 a0Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.a0 x1() {
        return this.I;
    }
}
