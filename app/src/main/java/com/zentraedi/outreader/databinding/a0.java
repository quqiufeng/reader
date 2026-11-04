package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zentraedi.basic.function.ui.imageview.ProportionImageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class a0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ProportionImageView E;

    @androidx.annotation.n0
    public final FrameLayout F;

    @androidx.annotation.n0
    public final FrameLayout G;

    @androidx.annotation.n0
    public final TextView H;

    protected a0(Object _bindingComponent, View _root, int _localFieldCount, ProportionImageView ivPoster, FrameLayout layoutCover, FrameLayout previewRootLayout, TextView tvNumber) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = ivPoster;
        this.F = layoutCover;
        this.G = previewRootLayout;
        this.H = tvNumber;
    }

    @androidx.annotation.n0
    @Deprecated
    public static a0 A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (a0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.M6, (ViewGroup) null, false, component);
    }

    public static a0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static a0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (a0) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.M6);
    }

    @androidx.annotation.n0
    public static a0 x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static a0 y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static a0 z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (a0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.M6, root, attachToRoot, component);
    }
}
