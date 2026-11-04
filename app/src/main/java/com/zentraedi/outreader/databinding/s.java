package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zentraedi.reader.reader.PageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class s extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final PageView E;

    protected s(Object _bindingComponent, View _root, int _localFieldCount, PageView pvRead) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = pvRead;
    }

    @androidx.annotation.n0
    @Deprecated
    public static s A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (s) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.T5, (ViewGroup) null, false, component);
    }

    public static s u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static s v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (s) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.T5);
    }

    @androidx.annotation.n0
    public static s x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static s y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static s z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (s) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.T5, root, attachToRoot, component);
    }
}
