package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class y extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final FrameLayout F;

    @androidx.annotation.n0
    public final TextView G;

    @androidx.annotation.n0
    public final TextView H;

    @androidx.annotation.n0
    public final TextView I;

    protected y(Object _bindingComponent, View _root, int _localFieldCount, ImageView ivDelete, FrameLayout previewRootLayout, TextView tvContent, TextView tvTime, TextView tvTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = ivDelete;
        this.F = previewRootLayout;
        this.G = tvContent;
        this.H = tvTime;
        this.I = tvTitle;
    }

    @androidx.annotation.n0
    @Deprecated
    public static y A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (y) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.L6, (ViewGroup) null, false, component);
    }

    public static y u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static y v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (y) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.L6);
    }

    @androidx.annotation.n0
    public static y x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static y y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static y z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (y) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.L6, root, attachToRoot, component);
    }
}
