package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.litao.slider.NiftySlider;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class j1 extends androidx.databinding.c0 {

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
    public final ImageView J;

    @androidx.annotation.n0
    public final ShapeableImageView K;

    @androidx.annotation.n0
    public final ImageView L;

    @androidx.annotation.n0
    public final ImageView M;

    @androidx.annotation.n0
    public final ShapeableImageView N;

    @androidx.annotation.n0
    public final ShapeableImageView O;

    @androidx.annotation.n0
    public final LinearLayout P;

    @androidx.annotation.n0
    public final LinearLayout Q;

    @androidx.annotation.n0
    public final ImageView R;

    @androidx.annotation.n0
    public final ImageView S;

    @androidx.annotation.n0
    public final NiftySlider T;

    @androidx.annotation.n0
    public final ImageView U;

    @androidx.annotation.n0
    public final TextView V;

    @androidx.annotation.n0
    public final TextView W;

    @androidx.annotation.n0
    public final TextView X;

    @androidx.annotation.n0
    public final TextView Y;

    @androidx.annotation.n0
    public final View Z;

    @androidx.annotation.n0
    public final View a0;

    @androidx.annotation.n0
    public final View b0;

    protected j1(Object _bindingComponent, View _root, int _localFieldCount, ImageView fifthBg, ImageView firstBg, FrameLayout flDef, FrameLayout flPager, FrameLayout flScenery, ImageView fourthBg, ShapeableImageView ivDef, ImageView ivLight, ImageView ivLightIncrease, ShapeableImageView ivPaper, ShapeableImageView ivScenery, LinearLayout llTheme, LinearLayout rlThemeMenu, ImageView secondBg, ImageView sixthBg, NiftySlider sliderLight, ImageView thirdBg, TextView tvBackground, TextView tvLight, TextView tvSystem, TextView tvTheme, View viewDefSelected, View viewPaperSelected, View viewScenerySelected) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = fifthBg;
        this.F = firstBg;
        this.G = flDef;
        this.H = flPager;
        this.I = flScenery;
        this.J = fourthBg;
        this.K = ivDef;
        this.L = ivLight;
        this.M = ivLightIncrease;
        this.N = ivPaper;
        this.O = ivScenery;
        this.P = llTheme;
        this.Q = rlThemeMenu;
        this.R = secondBg;
        this.S = sixthBg;
        this.T = sliderLight;
        this.U = thirdBg;
        this.V = tvBackground;
        this.W = tvLight;
        this.X = tvSystem;
        this.Y = tvTheme;
        this.Z = viewDefSelected;
        this.a0 = viewPaperSelected;
        this.b0 = viewScenerySelected;
    }

    @androidx.annotation.n0
    @Deprecated
    public static j1 A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (j1) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.ve, (ViewGroup) null, false, component);
    }

    public static j1 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static j1 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (j1) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.ve);
    }

    @androidx.annotation.n0
    public static j1 x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static j1 y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static j1 z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (j1) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.ve, root, attachToRoot, component);
    }
}
