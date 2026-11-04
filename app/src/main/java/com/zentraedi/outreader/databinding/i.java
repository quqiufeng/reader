package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zentraedi.basic.function.ui.imageview.EqualRatioImageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class i extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final Barrier E;

    @androidx.annotation.n0
    public final EqualRatioImageView F;

    @androidx.annotation.n0
    public final ImageView G;

    @androidx.annotation.n0
    public final TextView H;

    @androidx.annotation.n0
    public final ImageView I;

    @androidx.annotation.n0
    public final ConstraintLayout J;

    @androidx.annotation.n0
    public final ImageView K;

    @androidx.annotation.n0
    public final TextView L;

    protected i(Object _bindingComponent, View _root, int _localFieldCount, Barrier barrier, EqualRatioImageView cover, ImageView imageSelect, TextView ivHasLock, ImageView ivLock, ConstraintLayout linearLayout, ImageView payType, TextView tvCategory) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = barrier;
        this.F = cover;
        this.G = imageSelect;
        this.H = ivHasLock;
        this.I = ivLock;
        this.J = linearLayout;
        this.K = payType;
        this.L = tvCategory;
    }

    @androidx.annotation.n0
    @Deprecated
    public static i A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (i) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.P0, (ViewGroup) null, false, component);
    }

    public static i u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static i v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (i) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.P0);
    }

    @androidx.annotation.n0
    public static i x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static i y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static i z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (i) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.P0, root, attachToRoot, component);
    }
}
