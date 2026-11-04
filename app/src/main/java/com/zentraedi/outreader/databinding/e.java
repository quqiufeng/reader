package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class e extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final LinearLayout E;

    @androidx.annotation.n0
    public final Switch F;

    @androidx.annotation.n0
    public final Switch G;

    @androidx.annotation.n0
    public final Switch H;

    @androidx.annotation.n0
    public final Switch I;

    @androidx.annotation.n0
    public final TextView J;

    @androidx.databinding.c
    protected com.zentraedi.outreader.viewmodel.e K;

    protected e(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout layoutLockTime, Switch switchClickLeft, Switch switchNavigationBars, Switch switchStatusBars, Switch switchVolume, TextView tvLockTime) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = layoutLockTime;
        this.F = switchClickLeft;
        this.G = switchNavigationBars;
        this.H = switchStatusBars;
        this.I = switchVolume;
        this.J = tvLockTime;
    }

    @androidx.annotation.n0
    @Deprecated
    public static e A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (e) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.v0, root, attachToRoot, component);
    }

    @androidx.annotation.n0
    @Deprecated
    public static e B1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (e) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.v0, (ViewGroup) null, false, component);
    }

    public static e u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static e v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (e) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.v0);
    }

    @androidx.annotation.n0
    public static e y1(@androidx.annotation.n0 LayoutInflater inflater) {
        return B1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static e z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return A1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.outreader.viewmodel.e viewModel);

    @androidx.annotation.p0
    public com.zentraedi.outreader.viewmodel.e x1() {
        return this.K;
    }
}
