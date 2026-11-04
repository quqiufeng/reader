package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.litao.slider.NiftySlider;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class c0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final FrameLayout G;

    @androidx.annotation.n0
    public final FrameLayout H;

    @androidx.annotation.n0
    public final FrameLayout I;

    @androidx.annotation.n0
    public final NiftySlider J;

    @androidx.annotation.n0
    public final NiftySlider K;

    @androidx.annotation.n0
    public final NiftySlider L;

    @androidx.annotation.n0
    public final TextView M;

    protected c0(Object _bindingComponent, View _root, int _localFieldCount, ImageView ivBack, ImageView ivClose, FrameLayout layoutLineSpace, FrameLayout layoutPageMargin, FrameLayout layoutParagraphSpace, NiftySlider sliderLineSpace, NiftySlider sliderPageMargin, NiftySlider sliderParagraphSpace, TextView tvRestoreDefault) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = ivBack;
        this.F = ivClose;
        this.G = layoutLineSpace;
        this.H = layoutPageMargin;
        this.I = layoutParagraphSpace;
        this.J = sliderLineSpace;
        this.K = sliderPageMargin;
        this.L = sliderParagraphSpace;
        this.M = tvRestoreDefault;
    }

    @androidx.annotation.n0
    @Deprecated
    public static c0 A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (c0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.Fa, (ViewGroup) null, false, component);
    }

    public static c0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static c0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (c0) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.Fa);
    }

    @androidx.annotation.n0
    public static c0 x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static c0 y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static c0 z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (c0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.Fa, root, attachToRoot, component);
    }
}
