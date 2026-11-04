package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import com.airbnb.lottie.LottieAnimationView;
import com.zentraedi.outreader.widget.CustomDrawerLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class a extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final FragmentContainerView E;

    @androidx.annotation.n0
    public final FragmentContainerView F;

    @androidx.annotation.n0
    public final FragmentContainerView G;

    @androidx.annotation.n0
    public final ImageView H;

    @androidx.annotation.n0
    public final LottieAnimationView I;

    @androidx.annotation.n0
    public final LinearLayout J;

    @androidx.annotation.n0
    public final CustomDrawerLayout K;

    @androidx.annotation.n0
    public final TextView L;

    @androidx.annotation.n0
    public final TextView M;

    protected a(Object _bindingComponent, View _root, int _localFieldCount, FragmentContainerView fcvContainer, FragmentContainerView fcvContainerSettings, FragmentContainerView fcvContainerSide, ImageView ivLeftBack, LottieAnimationView lavBackingup, LinearLayout llProgress, CustomDrawerLayout readDrawer, TextView tvDownloadSize, TextView tvProgressContent) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = fcvContainer;
        this.F = fcvContainerSettings;
        this.G = fcvContainerSide;
        this.H = ivLeftBack;
        this.I = lavBackingup;
        this.J = llProgress;
        this.K = readDrawer;
        this.L = tvDownloadSize;
        this.M = tvProgressContent;
    }

    @androidx.annotation.n0
    @Deprecated
    public static a A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (a) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.o0, (ViewGroup) null, false, component);
    }

    public static a u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static a v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (a) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.o0);
    }

    @androidx.annotation.n0
    public static a x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static a y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static a z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (a) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.o0, root, attachToRoot, component);
    }
}
