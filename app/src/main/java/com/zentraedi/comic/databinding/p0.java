package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class p0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    protected p0(Object obj, View view, int i, ImageView imageView) {
        super(obj, view, i);
        this.E = imageView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static p0 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (p0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.T2, (ViewGroup) null, false, obj);
    }

    public static p0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static p0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (p0) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.T2);
    }

    @androidx.annotation.n0
    public static p0 x1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return A1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static p0 y1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return z1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static p0 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (p0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.T2, viewGroup, z, obj);
    }
}
