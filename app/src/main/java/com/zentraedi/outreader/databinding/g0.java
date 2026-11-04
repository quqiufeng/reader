package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class g0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final RadioButton E;

    @androidx.annotation.n0
    public final RadioButton F;

    @androidx.annotation.n0
    public final RadioButton G;

    @androidx.annotation.n0
    public final RadioButton H;

    @androidx.annotation.n0
    public final ImageView I;

    @androidx.annotation.n0
    public final RadioGroup J;

    protected g0(Object _bindingComponent, View _root, int _localFieldCount, RadioButton checkboxKeepAlways, RadioButton checkboxKeepFive, RadioButton checkboxKeepSystem, RadioButton checkboxKeepTen, ImageView ivClose, RadioGroup radioGroup) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = checkboxKeepAlways;
        this.F = checkboxKeepFive;
        this.G = checkboxKeepSystem;
        this.H = checkboxKeepTen;
        this.I = ivClose;
        this.J = radioGroup;
    }

    @androidx.annotation.n0
    @Deprecated
    public static g0 A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (g0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.rb, (ViewGroup) null, false, component);
    }

    public static g0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static g0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (g0) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.rb);
    }

    @androidx.annotation.n0
    public static g0 x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static g0 y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static g0 z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (g0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.rb, root, attachToRoot, component);
    }
}
