package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class j0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final ProgressBar F;

    @androidx.annotation.n0
    public final RelativeLayout G;

    @androidx.annotation.n0
    public final RelativeLayout H;

    @androidx.annotation.n0
    public final TextView I;

    @androidx.annotation.n0
    public final TextView J;

    @androidx.annotation.n0
    public final TextView K;

    protected j0(Object _bindingComponent, View _root, int _localFieldCount, ImageView ivContentErrorClose, ProgressBar pbWebProgress, RelativeLayout rlChangeSource, RelativeLayout rlReadTip, TextView tvBookSource, TextView tvChangeSource, TextView tvErrorTip) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = ivContentErrorClose;
        this.F = pbWebProgress;
        this.G = rlChangeSource;
        this.H = rlReadTip;
        this.I = tvBookSource;
        this.J = tvChangeSource;
        this.K = tvErrorTip;
    }

    @androidx.annotation.n0
    @Deprecated
    public static j0 A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (j0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.Ob, (ViewGroup) null, false, component);
    }

    public static j0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static j0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (j0) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.Ob);
    }

    @androidx.annotation.n0
    public static j0 x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static j0 y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static j0 z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (j0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.Ob, root, attachToRoot, component);
    }
}
