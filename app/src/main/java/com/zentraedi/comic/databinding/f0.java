package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.zentraedi.comic.viewmodel.Layout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class f0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final Switch F;

    @androidx.annotation.p0
    public final LinearLayout G;

    @androidx.annotation.n0
    public final AppCompatSeekBar H;

    @androidx.annotation.n0
    public final TextView I;

    @androidx.databinding.c
    protected Layout J;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.t4 K;

    protected f0(Object obj, View view, int i, ImageView imageView, Switch r5, LinearLayout linearLayout, AppCompatSeekBar appCompatSeekBar, TextView textView) {
        super(obj, view, i);
        this.E = imageView;
        this.F = r5;
        this.G = linearLayout;
        this.H = appCompatSeekBar;
        this.I = textView;
    }

    @androidx.annotation.n0
    public static f0 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return B1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static f0 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (f0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.N2, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static f0 C1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (f0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.N2, (ViewGroup) null, false, obj);
    }

    public static f0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static f0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (f0) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.N2);
    }

    @androidx.annotation.n0
    public static f0 z1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return C1(layoutInflater, androidx.databinding.m.i());
    }

    public abstract void D1(@androidx.annotation.p0 Layout layout);

    public abstract void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.t4 t4Var);

    @androidx.annotation.p0
    public Layout x1() {
        return this.J;
    }

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.t4 y1() {
        return this.K;
    }
}
