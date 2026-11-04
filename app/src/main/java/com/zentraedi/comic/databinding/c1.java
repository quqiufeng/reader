package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class c1 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final TextView E;

    @androidx.databinding.c
    protected n6 F;

    protected c1(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.E = textView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static c1 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (c1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.O4, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static c1 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (c1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.O4, (ViewGroup) null, false, obj);
    }

    public static c1 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static c1 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (c1) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.O4);
    }

    @androidx.annotation.n0
    public static c1 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static c1 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 n6 n6Var);

    @androidx.annotation.p0
    public n6 x1() {
        return this.F;
    }
}
