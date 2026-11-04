package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.zentraedi.business.widget.MediumTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class e extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final AppBarLayout E;

    @androidx.annotation.n0
    public final RecyclerView F;

    @androidx.annotation.n0
    public final ImageView G;

    @androidx.annotation.n0
    public final ImageView H;

    @androidx.annotation.n0
    public final ImageView I;

    @androidx.annotation.n0
    public final LinearLayout J;

    @androidx.annotation.n0
    public final TextView K;

    @androidx.annotation.n0
    public final TextView L;

    @androidx.annotation.n0
    public final TextView M;

    @androidx.annotation.n0
    public final MediumTextView N;

    @androidx.annotation.n0
    public final TextView O;

    @androidx.annotation.n0
    public final TextView P;

    @androidx.annotation.n0
    public final TextView Q;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.h0 R;

    protected e(Object obj, View view, int i, AppBarLayout appBarLayout, RecyclerView recyclerView, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, MediumTextView mediumTextView, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.E = appBarLayout;
        this.F = recyclerView;
        this.G = imageView;
        this.H = imageView2;
        this.I = imageView3;
        this.J = linearLayout;
        this.K = textView;
        this.L = textView2;
        this.M = textView3;
        this.N = mediumTextView;
        this.O = textView4;
        this.P = textView5;
        this.Q = textView6;
    }

    @androidx.annotation.n0
    @Deprecated
    public static e A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (e) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.K, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static e B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (e) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.K, (ViewGroup) null, false, obj);
    }

    public static e u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static e v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (e) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.K);
    }

    @androidx.annotation.n0
    public static e y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static e z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.h0 h0Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.h0 x1() {
        return this.R;
    }
}
