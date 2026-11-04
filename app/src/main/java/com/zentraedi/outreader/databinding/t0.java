package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.litao.slider.NiftySlider;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class t0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final View E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final ImageView G;

    @androidx.annotation.n0
    public final FrameLayout H;

    @androidx.annotation.n0
    public final LinearLayout I;

    @androidx.annotation.n0
    public final LinearLayout J;

    @androidx.annotation.n0
    public final LinearLayout K;

    @androidx.annotation.n0
    public final LinearLayout L;

    @androidx.annotation.n0
    public final RelativeLayout M;

    @androidx.annotation.n0
    public final LinearLayout N;

    @androidx.annotation.n0
    public final NiftySlider O;

    @androidx.annotation.n0
    public final TextView P;

    @androidx.annotation.n0
    public final TextView Q;

    @androidx.annotation.n0
    public final TextView R;

    @androidx.databinding.c
    protected com.zentraedi.outreader.viewmodel.a S;

    protected t0(Object _bindingComponent, View _root, int _localFieldCount, View ivAutoLine, ImageView ivAutoPageCover, ImageView ivAutoPageScroll, FrameLayout layoutAutoSpeed, LinearLayout layoutCover, LinearLayout layoutScroll, LinearLayout layoutScrollDisable, LinearLayout llAutoPage, RelativeLayout llQuitAutoPage, LinearLayout rlAutoTurnPage, NiftySlider sliderAutoSpeed, TextView tvAutoPageCover, TextView tvAutoPageScroll, TextView tvQuitAutoPage) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = ivAutoLine;
        this.F = ivAutoPageCover;
        this.G = ivAutoPageScroll;
        this.H = layoutAutoSpeed;
        this.I = layoutCover;
        this.J = layoutScroll;
        this.K = layoutScrollDisable;
        this.L = llAutoPage;
        this.M = llQuitAutoPage;
        this.N = rlAutoTurnPage;
        this.O = sliderAutoSpeed;
        this.P = tvAutoPageCover;
        this.Q = tvAutoPageScroll;
        this.R = tvQuitAutoPage;
    }

    @androidx.annotation.n0
    @Deprecated
    public static t0 A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (t0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.oe, root, attachToRoot, component);
    }

    @androidx.annotation.n0
    @Deprecated
    public static t0 B1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (t0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.oe, (ViewGroup) null, false, component);
    }

    public static t0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static t0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (t0) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.oe);
    }

    @androidx.annotation.n0
    public static t0 y1(@androidx.annotation.n0 LayoutInflater inflater) {
        return B1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static t0 z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return A1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.outreader.viewmodel.a viewModel);

    @androidx.annotation.p0
    public com.zentraedi.outreader.viewmodel.a x1() {
        return this.S;
    }
}
