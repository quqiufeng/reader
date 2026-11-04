package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class e0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final RadioButton E;

    @androidx.annotation.n0
    public final RadioButton F;

    @androidx.annotation.n0
    public final RadioButton G;

    @androidx.annotation.n0
    public final RadioButton H;

    @androidx.annotation.n0
    public final RadioButton I;

    @androidx.annotation.n0
    public final ImageView J;

    @androidx.annotation.n0
    public final ImageView K;

    @androidx.annotation.n0
    public final RadioGroup L;

    protected e0(Object _bindingComponent, View _root, int _localFieldCount, RadioButton checkboxCover, RadioButton checkboxNone, RadioButton checkboxSimulation, RadioButton checkboxSlide, RadioButton checkboxVertically, ImageView ivBack, ImageView ivClose, RadioGroup radioGroup) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = checkboxCover;
        this.F = checkboxNone;
        this.G = checkboxSimulation;
        this.H = checkboxSlide;
        this.I = checkboxVertically;
        this.J = ivBack;
        this.K = ivClose;
        this.L = radioGroup;
    }

    @androidx.annotation.n0
    @Deprecated
    public static e0 A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (e0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.qb, (ViewGroup) null, false, component);
    }

    public static e0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static e0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (e0) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.qb);
    }

    @androidx.annotation.n0
    public static e0 x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static e0 y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static e0 z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (e0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.qb, root, attachToRoot, component);
    }
}
