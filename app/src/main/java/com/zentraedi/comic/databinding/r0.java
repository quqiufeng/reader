package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class r0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final TextView E;

    @androidx.annotation.n0
    public final TextView F;

    @androidx.annotation.n0
    public final ImageView G;

    @androidx.annotation.n0
    public final TextView H;

    @androidx.annotation.n0
    public final TextView I;

    @androidx.annotation.n0
    public final TextView J;

    @androidx.annotation.n0
    public final TextView K;

    @androidx.annotation.n0
    public final ImageView L;

    @androidx.annotation.n0
    public final TextView M;

    @androidx.annotation.n0
    public final TextView N;

    @androidx.annotation.n0
    public final TextView O;

    @androidx.annotation.n0
    public final TextView P;

    @androidx.annotation.n0
    public final TextView Q;

    @androidx.annotation.n0
    public final TextView R;

    protected r0(Object obj, View view, int i, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ImageView imageView2, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        super(obj, view, i);
        this.E = textView;
        this.F = textView2;
        this.G = imageView;
        this.H = textView3;
        this.I = textView4;
        this.J = textView5;
        this.K = textView6;
        this.L = imageView2;
        this.M = textView7;
        this.N = textView8;
        this.O = textView9;
        this.P = textView10;
        this.Q = textView11;
        this.R = textView12;
    }

    @androidx.annotation.n0
    @Deprecated
    public static r0 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (r0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.U2, (ViewGroup) null, false, obj);
    }

    public static r0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static r0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (r0) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.U2);
    }

    @androidx.annotation.n0
    public static r0 x1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return A1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static r0 y1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return z1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static r0 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (r0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.U2, viewGroup, z, obj);
    }
}
