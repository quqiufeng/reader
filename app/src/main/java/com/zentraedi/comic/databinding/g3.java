package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zentraedi.comic.viewmodel.m6;
import com.zentraedi.reader.pdf.MuPdfPageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class g3 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final LinearLayout E;

    @androidx.annotation.n0
    public final MuPdfPageView F;

    @androidx.databinding.c
    protected m6 G;

    protected g3(Object obj, View view, int i, LinearLayout linearLayout, MuPdfPageView muPdfPageView) {
        super(obj, view, i);
        this.E = linearLayout;
        this.F = muPdfPageView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static g3 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (g3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.U7, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static g3 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (g3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.U7, (ViewGroup) null, false, obj);
    }

    public static g3 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static g3 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (g3) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.U7);
    }

    @androidx.annotation.n0
    public static g3 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static g3 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 m6 m6Var);

    @androidx.annotation.p0
    public m6 x1() {
        return this.G;
    }
}
