package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class q extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final FragmentContainerView E;

    protected q(Object _bindingComponent, View _root, int _localFieldCount, FragmentContainerView fragmentContainerView) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = fragmentContainerView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static q A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (q) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.I5, (ViewGroup) null, false, component);
    }

    public static q u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static q v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (q) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.I5);
    }

    @androidx.annotation.n0
    public static q x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static q y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static q z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (q) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.I5, root, attachToRoot, component);
    }
}
