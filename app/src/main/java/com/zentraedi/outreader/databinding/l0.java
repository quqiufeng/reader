package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class l0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final LinearLayout E;

    @androidx.annotation.n0
    public final TextView F;

    @androidx.annotation.n0
    public final TextView G;

    @androidx.annotation.n0
    public final TextView H;

    protected l0(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout llMore, TextView tvDelete, TextView tvDetail, TextView tvRename) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = llMore;
        this.F = tvDelete;
        this.G = tvDetail;
        this.H = tvRename;
    }

    @androidx.annotation.n0
    @Deprecated
    public static l0 A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (l0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.Hd, (ViewGroup) null, false, component);
    }

    public static l0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static l0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (l0) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.Hd);
    }

    @androidx.annotation.n0
    public static l0 x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static l0 y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static l0 z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (l0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.Hd, root, attachToRoot, component);
    }
}
