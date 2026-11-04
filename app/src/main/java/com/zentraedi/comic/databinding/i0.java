package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class i0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final AppCompatSeekBar E;

    @androidx.annotation.n0
    public final CheckBox F;

    @androidx.annotation.n0
    public final CheckBox G;

    @androidx.annotation.n0
    public final AppCompatSeekBar H;

    @androidx.annotation.n0
    public final CheckBox I;

    @androidx.annotation.n0
    public final ImageView J;

    @androidx.annotation.n0
    public final TextView K;

    @androidx.annotation.n0
    public final CheckBox L;

    @androidx.annotation.n0
    public final AppCompatSeekBar M;

    @androidx.databinding.c
    protected Layout N;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.q3 O;

    @androidx.databinding.c
    protected n6 P;

    protected i0(Object obj, View view, int i, AppCompatSeekBar appCompatSeekBar, CheckBox checkBox, CheckBox checkBox2, AppCompatSeekBar appCompatSeekBar2, CheckBox checkBox3, ImageView imageView, TextView textView, CheckBox checkBox4, AppCompatSeekBar appCompatSeekBar3) {
        super(obj, view, i);
        this.E = appCompatSeekBar;
        this.F = checkBox;
        this.G = checkBox2;
        this.H = appCompatSeekBar2;
        this.I = checkBox3;
        this.J = imageView;
        this.K = textView;
        this.L = checkBox4;
        this.M = appCompatSeekBar3;
    }

    @androidx.annotation.n0
    public static i0 A1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return D1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static i0 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return C1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static i0 C1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (i0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.O2, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static i0 D1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (i0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.O2, (ViewGroup) null, false, obj);
    }

    public static i0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static i0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (i0) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.O2);
    }

    public abstract void E1(@androidx.annotation.p0 Layout layout);

    public abstract void F1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.q3 q3Var);

    public abstract void G1(@androidx.annotation.p0 n6 n6Var);

    @androidx.annotation.p0
    public Layout x1() {
        return this.N;
    }

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.q3 y1() {
        return this.O;
    }

    @androidx.annotation.p0
    public n6 z1() {
        return this.P;
    }
}
