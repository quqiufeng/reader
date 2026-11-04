package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.business.widget.MediumTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class m extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final LinearLayout E;

    @androidx.annotation.n0
    public final RecyclerView F;

    @androidx.annotation.n0
    public final TextView G;

    @androidx.annotation.n0
    public final MediumTextView H;

    protected m(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout contentLayout, RecyclerView rv, TextView tvClear, MediumTextView tvTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = contentLayout;
        this.F = rv;
        this.G = tvClear;
        this.H = tvTitle;
    }

    @androidx.annotation.n0
    @Deprecated
    public static m A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (m) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.h5, (ViewGroup) null, false, component);
    }

    public static m u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static m v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (m) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.h5);
    }

    @androidx.annotation.n0
    public static m x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static m y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static m z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (m) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.h5, root, attachToRoot, component);
    }
}
