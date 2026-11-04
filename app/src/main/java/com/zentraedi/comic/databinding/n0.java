package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class n0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final TextView F;

    @androidx.annotation.n0
    public final TextView G;

    @androidx.annotation.n0
    public final RecyclerView H;

    protected n0(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, RecyclerView recyclerView) {
        super(obj, view, i);
        this.E = imageView;
        this.F = textView;
        this.G = textView2;
        this.H = recyclerView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static n0 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (n0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.S2, (ViewGroup) null, false, obj);
    }

    public static n0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static n0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (n0) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.S2);
    }

    @androidx.annotation.n0
    public static n0 x1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return A1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static n0 y1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return z1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static n0 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (n0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.S2, viewGroup, z, obj);
    }
}
