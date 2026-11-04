package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.litao.slider.NiftySlider;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class b1 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final FrameLayout E;

    @androidx.annotation.n0
    public final FrameLayout F;

    @androidx.annotation.n0
    public final FrameLayout G;

    @androidx.annotation.n0
    public final FrameLayout H;

    @androidx.annotation.n0
    public final LinearLayout I;

    @androidx.annotation.n0
    public final LinearLayout J;

    @androidx.annotation.n0
    public final NiftySlider K;

    @androidx.annotation.n0
    public final NiftySlider L;

    @androidx.annotation.n0
    public final NiftySlider M;

    @androidx.annotation.n0
    public final NiftySlider N;

    @androidx.annotation.n0
    public final TextView O;

    @androidx.annotation.n0
    public final TextView P;

    @androidx.annotation.n0
    public final TextView Q;

    @androidx.annotation.n0
    public final TextView R;

    @androidx.annotation.n0
    public final TextView S;

    @androidx.annotation.n0
    public final TextView T;

    @androidx.annotation.n0
    public final TextView U;

    @androidx.annotation.n0
    public final TextView V;

    @androidx.databinding.c
    protected com.zentraedi.outreader.viewmodel.c W;

    protected b1(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout layoutFontSize, FrameLayout layoutLineSpace, FrameLayout layoutPageMargin, FrameLayout layoutParagraphSpace, LinearLayout llFont, LinearLayout rlSettingMenu, NiftySlider sliderFontSize, NiftySlider sliderLineSpace, NiftySlider sliderPageMargin, NiftySlider sliderParagraphSpace, TextView tvAutoPage, TextView tvFontChange, TextView tvFontSize, TextView tvFontSizeDecrease, TextView tvFontSizeIncrease, TextView tvMoreMargin, TextView tvMoreSetting, TextView tvTurnPage) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = layoutFontSize;
        this.F = layoutLineSpace;
        this.G = layoutPageMargin;
        this.H = layoutParagraphSpace;
        this.I = llFont;
        this.J = rlSettingMenu;
        this.K = sliderFontSize;
        this.L = sliderLineSpace;
        this.M = sliderPageMargin;
        this.N = sliderParagraphSpace;
        this.O = tvAutoPage;
        this.P = tvFontChange;
        this.Q = tvFontSize;
        this.R = tvFontSizeDecrease;
        this.S = tvFontSizeIncrease;
        this.T = tvMoreMargin;
        this.U = tvMoreSetting;
        this.V = tvTurnPage;
    }

    @androidx.annotation.n0
    @Deprecated
    public static b1 A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (b1) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.re, root, attachToRoot, component);
    }

    @androidx.annotation.n0
    @Deprecated
    public static b1 B1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (b1) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.re, (ViewGroup) null, false, component);
    }

    public static b1 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static b1 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (b1) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.re);
    }

    @androidx.annotation.n0
    public static b1 y1(@androidx.annotation.n0 LayoutInflater inflater) {
        return B1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static b1 z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return A1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.outreader.viewmodel.c viewModel);

    @androidx.annotation.p0
    public com.zentraedi.outreader.viewmodel.c x1() {
        return this.W;
    }
}
