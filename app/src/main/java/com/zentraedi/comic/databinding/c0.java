package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.zentraedi.business.widget.MediumTextView;
import com.zentraedi.comic.viewmodel.ComicReaderSetViewModel;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class c0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final TextView E;

    @androidx.annotation.n0
    public final AppBarLayout F;

    @androidx.annotation.n0
    public final ImageView G;

    @androidx.annotation.n0
    public final ImageView H;

    @androidx.annotation.n0
    public final ImageView I;

    @androidx.annotation.n0
    public final Switch J;

    @androidx.annotation.n0
    public final MediumTextView K;

    @androidx.annotation.n0
    public final TextView L;

    @androidx.databinding.c
    protected ComicReaderSetViewModel M;

    protected c0(Object obj, View view, int i, TextView textView, AppBarLayout appBarLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, Switch r9, MediumTextView mediumTextView, TextView textView2) {
        super(obj, view, i);
        this.E = textView;
        this.F = appBarLayout;
        this.G = imageView;
        this.H = imageView2;
        this.I = imageView3;
        this.J = r9;
        this.K = mediumTextView;
        this.L = textView2;
    }

    @androidx.annotation.n0
    @Deprecated
    public static c0 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (c0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.J0, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static c0 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (c0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.J0, (ViewGroup) null, false, obj);
    }

    public static c0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static c0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (c0) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.J0);
    }

    @androidx.annotation.n0
    public static c0 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static c0 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 ComicReaderSetViewModel comicReaderSetViewModel);

    @androidx.annotation.p0
    public ComicReaderSetViewModel x1() {
        return this.M;
    }
}
