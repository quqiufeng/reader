package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.zentraedi.comic.viewmodel.ComicReaderViewModel;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class z4 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final TextView G;

    @androidx.databinding.c
    protected ComicReaderViewModel H;

    protected z4(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i);
        this.E = imageView;
        this.F = imageView2;
        this.G = textView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static z4 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (z4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.fa, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static z4 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (z4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.fa, (ViewGroup) null, false, obj);
    }

    public static z4 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static z4 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (z4) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.fa);
    }

    @androidx.annotation.n0
    public static z4 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static z4 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 ComicReaderViewModel comicReaderViewModel);

    @androidx.annotation.p0
    public ComicReaderViewModel x1() {
        return this.H;
    }
}
