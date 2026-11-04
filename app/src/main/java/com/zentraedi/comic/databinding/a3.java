package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageViewNew;
import com.zentraedi.comic.viewmodel.l6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class a3 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final SubsamplingScaleImageViewNew E;

    @androidx.annotation.n0
    public final FrameLayout F;

    @androidx.databinding.c
    protected l6 G;

    protected a3(Object obj, View view, int i, SubsamplingScaleImageViewNew subsamplingScaleImageViewNew, FrameLayout frameLayout) {
        super(obj, view, i);
        this.E = subsamplingScaleImageViewNew;
        this.F = frameLayout;
    }

    @androidx.annotation.n0
    @Deprecated
    public static a3 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (a3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.R7, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static a3 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (a3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.R7, (ViewGroup) null, false, obj);
    }

    public static a3 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static a3 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (a3) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.R7);
    }

    @androidx.annotation.n0
    public static a3 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static a3 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 l6 l6Var);

    @androidx.annotation.p0
    public l6 x1() {
        return this.G;
    }
}
