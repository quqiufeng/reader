package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.zentraedi.basic.function.ui.imageview.EqualRatioImageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class n0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final EqualRatioImageView E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final ImageView G;

    @androidx.annotation.n0
    public final TextView H;

    @androidx.annotation.n0
    public final TextView I;

    @androidx.annotation.n0
    public final LinearLayout J;

    @androidx.annotation.n0
    public final LinearLayout K;

    @androidx.annotation.n0
    public final LinearLayout L;

    @androidx.annotation.n0
    public final RelativeLayout M;

    @androidx.annotation.n0
    public final SlidingTabLayout N;

    @androidx.annotation.n0
    public final TextView O;

    @androidx.annotation.n0
    public final TextView P;

    @androidx.annotation.n0
    public final TextView Q;

    @androidx.annotation.n0
    public final TextView R;

    @androidx.annotation.n0
    public final LinearLayout S;

    @androidx.annotation.n0
    public final ViewPager T;

    protected n0(Object _bindingComponent, View _root, int _localFieldCount, EqualRatioImageView ivBookCover, ImageView ivOrder, ImageView ivSlideLine, TextView latestChapter, TextView latestTime, LinearLayout llAuthor, LinearLayout llOrder, LinearLayout llReadProgress, RelativeLayout rlBook, SlidingTabLayout stlTabs, TextView tvOrder, TextView tvReadProgress, TextView tvReaded, TextView tvTitle, LinearLayout updateStateLayout, ViewPager vpPager) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = ivBookCover;
        this.F = ivOrder;
        this.G = ivSlideLine;
        this.H = latestChapter;
        this.I = latestTime;
        this.J = llAuthor;
        this.K = llOrder;
        this.L = llReadProgress;
        this.M = rlBook;
        this.N = stlTabs;
        this.O = tvOrder;
        this.P = tvReadProgress;
        this.Q = tvReaded;
        this.R = tvTitle;
        this.S = updateStateLayout;
        this.T = vpPager;
    }

    @androidx.annotation.n0
    @Deprecated
    public static n0 A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (n0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.ke, (ViewGroup) null, false, component);
    }

    public static n0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static n0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (n0) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.ke);
    }

    @androidx.annotation.n0
    public static n0 x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static n0 y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static n0 z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (n0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.ke, root, attachToRoot, component);
    }
}
