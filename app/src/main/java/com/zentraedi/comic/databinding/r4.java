package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class r4 extends androidx.databinding.c0 {

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.d3 E;

    protected r4(Object obj, View view, int i) {
        super(obj, view, i);
    }

    @androidx.annotation.n0
    @Deprecated
    public static r4 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (r4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.ba, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static r4 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (r4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.ba, (ViewGroup) null, false, obj);
    }

    public static r4 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static r4 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (r4) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.ba);
    }

    @androidx.annotation.n0
    public static r4 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static r4 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.d3 d3Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.d3 x1() {
        return this.E;
    }
}
