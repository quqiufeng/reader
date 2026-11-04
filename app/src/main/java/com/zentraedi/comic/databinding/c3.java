package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.utils.widget.ImageFilterView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class c3 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageFilterView E;

    @androidx.annotation.n0
    public final TextView F;

    protected c3(Object obj, View view, int i, ImageFilterView imageFilterView, TextView textView) {
        super(obj, view, i);
        this.E = imageFilterView;
        this.F = textView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static c3 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (c3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.S7, (ViewGroup) null, false, obj);
    }

    public static c3 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static c3 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (c3) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.S7);
    }

    @androidx.annotation.n0
    public static c3 x1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return A1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static c3 y1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return z1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static c3 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (c3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.S7, viewGroup, z, obj);
    }
}
