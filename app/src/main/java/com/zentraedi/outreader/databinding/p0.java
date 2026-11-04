package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class p0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final ImageView G;

    @androidx.annotation.n0
    public final RelativeLayout H;

    @androidx.annotation.n0
    public final RelativeLayout I;

    @androidx.annotation.n0
    public final TextView J;

    @androidx.annotation.n0
    public final TextView K;

    protected p0(Object _bindingComponent, View _root, int _localFieldCount, ImageView ivErrorBack, ImageView ivErrorLine, ImageView ivFeedbackImg, RelativeLayout rlErrorBar, RelativeLayout rlReaderError, TextView tvFeedback, TextView tvReload) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = ivErrorBack;
        this.F = ivErrorLine;
        this.G = ivFeedbackImg;
        this.H = rlErrorBar;
        this.I = rlReaderError;
        this.J = tvFeedback;
        this.K = tvReload;
    }

    @androidx.annotation.n0
    @Deprecated
    public static p0 A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (p0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.le, (ViewGroup) null, false, component);
    }

    public static p0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static p0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (p0) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.le);
    }

    @androidx.annotation.n0
    public static p0 x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static p0 y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static p0 z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (p0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.le, root, attachToRoot, component);
    }
}
