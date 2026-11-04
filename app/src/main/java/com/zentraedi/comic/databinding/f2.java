package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class f2 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final TextView E;

    @androidx.annotation.n0
    public final TextView F;

    protected f2(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.E = textView;
        this.F = textView2;
    }

    @androidx.annotation.n0
    @Deprecated
    public static f2 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (f2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.G7, (ViewGroup) null, false, obj);
    }

    public static f2 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static f2 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (f2) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.G7);
    }

    @androidx.annotation.n0
    public static f2 x1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return A1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static f2 y1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return z1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static f2 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (f2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.G7, viewGroup, z, obj);
    }
}
