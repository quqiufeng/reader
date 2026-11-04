package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.flyco.tablayout.SlidingTabLayout;
import com.zentraedi.outreader.view.SliderViewPager;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class w extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final LinearLayout F;

    @androidx.annotation.n0
    public final LinearLayout G;

    @androidx.annotation.n0
    public final SlidingTabLayout H;

    @androidx.annotation.n0
    public final RelativeLayout I;

    @androidx.annotation.n0
    public final TextView J;

    @androidx.annotation.n0
    public final TextView K;

    @androidx.annotation.n0
    public final TextView L;

    @androidx.annotation.n0
    public final SliderViewPager M;

    protected w(Object _bindingComponent, View _root, int _localFieldCount, ImageView ivBookCover, LinearLayout layoutSideRoot, LinearLayout llReadProgress, SlidingTabLayout pageTabLayout, RelativeLayout rlBook, TextView tvReadProgress, TextView tvReaded, TextView tvTitle, SliderViewPager vpPager) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = ivBookCover;
        this.F = layoutSideRoot;
        this.G = llReadProgress;
        this.H = pageTabLayout;
        this.I = rlBook;
        this.J = tvReadProgress;
        this.K = tvReaded;
        this.L = tvTitle;
        this.M = vpPager;
    }

    @androidx.annotation.n0
    @Deprecated
    public static w A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (w) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.Z5, (ViewGroup) null, false, component);
    }

    public static w u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static w v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (w) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.Z5);
    }

    @androidx.annotation.n0
    public static w x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static w y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static w z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (w) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.Z5, root, attachToRoot, component);
    }
}
