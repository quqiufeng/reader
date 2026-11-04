package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class o2 extends androidx.databinding.c0 {
    protected o2(Object obj, View view, int i) {
        super(obj, view, i);
    }

    @androidx.annotation.n0
    @Deprecated
    public static o2 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (o2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.L7, (ViewGroup) null, false, obj);
    }

    public static o2 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static o2 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (o2) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.L7);
    }

    @androidx.annotation.n0
    public static o2 x1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return A1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static o2 y1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return z1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static o2 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (o2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.L7, viewGroup, z, obj);
    }
}
