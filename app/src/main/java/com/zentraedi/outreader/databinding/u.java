package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class u extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final f1 E;

    @androidx.annotation.n0
    public final h1 F;

    @androidx.databinding.c
    protected com.zentraedi.outreader.viewmodel.c G;

    protected u(Object _bindingComponent, View _root, int _localFieldCount, f1 readerFooter, h1 readerHeaderBar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = readerFooter;
        this.F = readerHeaderBar;
    }

    @androidx.annotation.n0
    @Deprecated
    public static u A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (u) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.Y5, root, attachToRoot, component);
    }

    @androidx.annotation.n0
    @Deprecated
    public static u B1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (u) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.Y5, (ViewGroup) null, false, component);
    }

    public static u u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static u v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (u) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.Y5);
    }

    @androidx.annotation.n0
    public static u y1(@androidx.annotation.n0 LayoutInflater inflater) {
        return B1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static u z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return A1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.outreader.viewmodel.c settingViewModel);

    @androidx.annotation.p0
    public com.zentraedi.outreader.viewmodel.c x1() {
        return this.G;
    }
}
