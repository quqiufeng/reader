package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class i3 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final TextView E;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.m0 F;

    protected i3(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.E = textView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static i3 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (i3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.V7, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static i3 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (i3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.V7, (ViewGroup) null, false, obj);
    }

    public static i3 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static i3 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (i3) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.V7);
    }

    @androidx.annotation.n0
    public static i3 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static i3 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.m0 m0Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.m0 x1() {
        return this.F;
    }
}
