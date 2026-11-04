package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class m extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final RadioGroup E;

    @androidx.annotation.n0
    public final RelativeLayout F;

    @androidx.annotation.n0
    public final RadioButton G;

    @androidx.annotation.n0
    public final FrameLayout H;

    @androidx.annotation.n0
    public final RadioButton I;

    @androidx.annotation.n0
    public final RadioButton J;

    protected m(Object obj, View view, int i, RadioGroup radioGroup, RelativeLayout relativeLayout, RadioButton radioButton, FrameLayout frameLayout, RadioButton radioButton2, RadioButton radioButton3) {
        super(obj, view, i);
        this.E = radioGroup;
        this.F = relativeLayout;
        this.G = radioButton;
        this.H = frameLayout;
        this.I = radioButton2;
        this.J = radioButton3;
    }

    @androidx.annotation.n0
    @Deprecated
    public static m A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (m) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.O, (ViewGroup) null, false, obj);
    }

    public static m u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static m v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (m) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.O);
    }

    @androidx.annotation.n0
    public static m x1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return A1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static m y1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return z1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static m z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (m) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.O, viewGroup, z, obj);
    }
}
