package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class k extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final TextView E;

    protected k(Object _bindingComponent, View _root, int _localFieldCount, TextView tvTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = tvTitle;
    }

    @androidx.annotation.n0
    @Deprecated
    public static k A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (k) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.Q0, (ViewGroup) null, false, component);
    }

    public static k u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static k v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (k) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.Q0);
    }

    @androidx.annotation.n0
    public static k x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static k y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static k z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (k) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.Q0, root, attachToRoot, component);
    }
}
