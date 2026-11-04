package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zentraedi.comic.viewmodel.p6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class c2 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final FrameLayout E;

    @androidx.databinding.c
    protected p6 F;

    protected c2(Object obj, View view, int i, FrameLayout frameLayout) {
        super(obj, view, i);
        this.E = frameLayout;
    }

    @androidx.annotation.n0
    @Deprecated
    public static c2 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (c2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.l7, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static c2 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (c2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.l7, (ViewGroup) null, false, obj);
    }

    public static c2 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static c2 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (c2) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.l7);
    }

    @androidx.annotation.n0
    public static c2 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static c2 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 p6 p6Var);

    @androidx.annotation.p0
    public p6 x1() {
        return this.F;
    }
}
