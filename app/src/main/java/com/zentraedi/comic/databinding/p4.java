package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class p4 extends androidx.databinding.c0 {

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.m2 E;

    protected p4(Object obj, View view, int i) {
        super(obj, view, i);
    }

    @androidx.annotation.n0
    @Deprecated
    public static p4 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (p4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.aa, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static p4 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (p4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.aa, (ViewGroup) null, false, obj);
    }

    public static p4 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static p4 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (p4) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.aa);
    }

    @androidx.annotation.n0
    public static p4 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static p4 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.m2 m2Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.m2 x1() {
        return this.E;
    }
}
