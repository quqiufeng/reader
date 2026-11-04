package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class b5 extends androidx.databinding.c0 {

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.q3 E;

    @androidx.databinding.c
    protected n6 F;

    protected b5(Object obj, View view, int i) {
        super(obj, view, i);
    }

    @androidx.annotation.n0
    public static b5 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return B1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static b5 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (b5) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.ga, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static b5 C1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (b5) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.ga, (ViewGroup) null, false, obj);
    }

    public static b5 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static b5 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (b5) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.ga);
    }

    @androidx.annotation.n0
    public static b5 z1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return C1(layoutInflater, androidx.databinding.m.i());
    }

    public abstract void D1(@androidx.annotation.p0 n6 n6Var);

    public abstract void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.q3 q3Var);

    @androidx.annotation.p0
    public n6 x1() {
        return this.F;
    }

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.q3 y1() {
        return this.E;
    }
}
