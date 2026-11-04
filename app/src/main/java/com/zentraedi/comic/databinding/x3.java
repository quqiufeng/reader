package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class x3 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final CheckBox E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final Switch G;

    @androidx.annotation.n0
    public final AppCompatSeekBar H;

    @androidx.annotation.n0
    public final TextView I;

    @androidx.annotation.n0
    public final TextView J;

    @androidx.annotation.n0
    public final TextView K;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.t4 L;

    protected x3(Object obj, View view, int i, CheckBox checkBox, ImageView imageView, Switch r6, AppCompatSeekBar appCompatSeekBar, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.E = checkBox;
        this.F = imageView;
        this.G = r6;
        this.H = appCompatSeekBar;
        this.I = textView;
        this.J = textView2;
        this.K = textView3;
    }

    @androidx.annotation.n0
    @Deprecated
    public static x3 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (x3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.r9, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static x3 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (x3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.r9, (ViewGroup) null, false, obj);
    }

    public static x3 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static x3 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (x3) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.r9);
    }

    @androidx.annotation.n0
    public static x3 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static x3 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.t4 t4Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.t4 x1() {
        return this.L;
    }
}
