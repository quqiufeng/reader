package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.zentraedi.business.widget.MediumTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class w1 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final Switch F;

    @androidx.annotation.n0
    public final NestedScrollView G;

    @androidx.annotation.n0
    public final MediumTextView H;

    @androidx.annotation.n0
    public final TextView I;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.t4 J;

    protected w1(Object obj, View view, int i, ImageView imageView, Switch r5, NestedScrollView nestedScrollView, MediumTextView mediumTextView, TextView textView) {
        super(obj, view, i);
        this.E = imageView;
        this.F = r5;
        this.G = nestedScrollView;
        this.H = mediumTextView;
        this.I = textView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static w1 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (w1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.X5, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static w1 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (w1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.X5, (ViewGroup) null, false, obj);
    }

    public static w1 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static w1 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (w1) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.X5);
    }

    @androidx.annotation.n0
    public static w1 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static w1 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.t4 t4Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.t4 x1() {
        return this.J;
    }
}
