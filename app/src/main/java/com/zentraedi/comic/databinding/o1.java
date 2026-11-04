package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class o1 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final RecyclerView F;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.q G;

    protected o1(Object obj, View view, int i, ImageView imageView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.E = imageView;
        this.F = recyclerView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static o1 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (o1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.T5, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static o1 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (o1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.T5, (ViewGroup) null, false, obj);
    }

    public static o1 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static o1 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (o1) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.T5);
    }

    @androidx.annotation.n0
    public static o1 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static o1 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.q qVar);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.q x1() {
        return this.G;
    }
}
