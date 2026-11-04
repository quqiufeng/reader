package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class f1 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final FragmentContainerView E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final ImageView G;

    @androidx.annotation.n0
    public final ImageView H;

    @androidx.annotation.n0
    public final ImageView I;

    @androidx.annotation.n0
    public final View J;

    @androidx.annotation.n0
    public final LinearLayout K;

    @androidx.annotation.n0
    public final RelativeLayout L;

    @androidx.annotation.n0
    public final RelativeLayout M;

    @androidx.annotation.n0
    public final LinearLayout N;

    @androidx.databinding.c
    protected com.zentraedi.outreader.viewmodel.c O;

    protected f1(Object _bindingComponent, View _root, int _localFieldCount, FragmentContainerView fcvContainer, ImageView ivListenIcon, ImageView ivPdfDayNight, ImageView ivPdfMenuBtn, ImageView ivPdfReaderSetting, View lineSetBar, LinearLayout llReaderBottomBar, RelativeLayout rlListen, RelativeLayout rlListenPanel, LinearLayout rlSetBar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = fcvContainer;
        this.F = ivListenIcon;
        this.G = ivPdfDayNight;
        this.H = ivPdfMenuBtn;
        this.I = ivPdfReaderSetting;
        this.J = lineSetBar;
        this.K = llReaderBottomBar;
        this.L = rlListen;
        this.M = rlListenPanel;
        this.N = rlSetBar;
    }

    @androidx.annotation.n0
    @Deprecated
    public static f1 A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (f1) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.te, root, attachToRoot, component);
    }

    @androidx.annotation.n0
    @Deprecated
    public static f1 B1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (f1) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.te, (ViewGroup) null, false, component);
    }

    public static f1 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static f1 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (f1) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.te);
    }

    @androidx.annotation.n0
    public static f1 y1(@androidx.annotation.n0 LayoutInflater inflater) {
        return B1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static f1 z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return A1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.outreader.viewmodel.c settingViewModel);

    @androidx.annotation.p0
    public com.zentraedi.outreader.viewmodel.c x1() {
        return this.O;
    }
}
