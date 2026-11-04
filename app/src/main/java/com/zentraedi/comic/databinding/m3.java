package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zentraedi.comic.viewmodel.i6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class m3 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final FrameLayout E;

    @androidx.annotation.n0
    public final FrameLayout F;

    @androidx.databinding.c
    protected Boolean G;

    @androidx.databinding.c
    protected i6 H;

    protected m3(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2) {
        super(obj, view, i);
        this.E = frameLayout;
        this.F = frameLayout2;
    }

    @androidx.annotation.n0
    public static m3 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return B1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static m3 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (m3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.X7, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static m3 C1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (m3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.X7, (ViewGroup) null, false, obj);
    }

    public static m3 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static m3 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (m3) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.X7);
    }

    @androidx.annotation.n0
    public static m3 z1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return C1(layoutInflater, androidx.databinding.m.i());
    }

    public abstract void D1(@androidx.annotation.p0 Boolean bool);

    public abstract void E1(@androidx.annotation.p0 i6 i6Var);

    @androidx.annotation.p0
    public Boolean x1() {
        return this.G;
    }

    @androidx.annotation.p0
    public i6 y1() {
        return this.H;
    }
}
