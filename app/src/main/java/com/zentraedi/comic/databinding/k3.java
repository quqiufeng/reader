package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class k3 extends androidx.databinding.c0 {

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.a5 E;

    protected k3(Object obj, View view, int i) {
        super(obj, view, i);
    }

    @androidx.annotation.n0
    @Deprecated
    public static k3 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (k3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.W7, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static k3 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (k3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.W7, (ViewGroup) null, false, obj);
    }

    public static k3 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static k3 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (k3) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.W7);
    }

    @androidx.annotation.n0
    public static k3 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static k3 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.a5 a5Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.a5 x1() {
        return this.E;
    }
}
