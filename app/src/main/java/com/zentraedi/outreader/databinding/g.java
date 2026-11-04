package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class g extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final AppBarLayout E;

    @androidx.annotation.n0
    public final LinearLayout F;

    @androidx.annotation.n0
    public final CollapsingToolbarLayout G;

    @androidx.annotation.n0
    public final ImageView H;

    @androidx.annotation.n0
    public final ImageView I;

    @androidx.annotation.n0
    public final ImageView J;

    @androidx.annotation.n0
    public final ImageView K;

    @androidx.annotation.n0
    public final ImageView L;

    @androidx.annotation.n0
    public final RelativeLayout M;

    @androidx.annotation.n0
    public final LinearLayout N;

    @androidx.annotation.n0
    public final LinearLayout O;

    @androidx.annotation.n0
    public final RecyclerView P;

    @androidx.annotation.n0
    public final Toolbar Q;

    @androidx.annotation.n0
    public final TextView R;

    @androidx.annotation.n0
    public final TextView S;

    @androidx.annotation.n0
    public final TextView T;

    @androidx.annotation.n0
    public final TextView U;

    @androidx.databinding.c
    protected com.zentraedi.basic.function.viewmodel.b V;

    protected g(Object _bindingComponent, View _root, int _localFieldCount, AppBarLayout appBarLayout, LinearLayout collapseLayout, CollapsingToolbarLayout collapsingToolbarLayout, ImageView ivAdd, ImageView ivBack, ImageView ivCloseSelect, ImageView ivDelete, ImageView ivSelect, RelativeLayout layoutTitle, LinearLayout llDelete, LinearLayout llSelectTitle, RecyclerView rvTypefaceSelect, Toolbar toolbar, TextView tvBarTitle, TextView tvDelete, TextView tvSelectTitle, TextView tvTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = appBarLayout;
        this.F = collapseLayout;
        this.G = collapsingToolbarLayout;
        this.H = ivAdd;
        this.I = ivBack;
        this.J = ivCloseSelect;
        this.K = ivDelete;
        this.L = ivSelect;
        this.M = layoutTitle;
        this.N = llDelete;
        this.O = llSelectTitle;
        this.P = rvTypefaceSelect;
        this.Q = toolbar;
        this.R = tvBarTitle;
        this.S = tvDelete;
        this.T = tvSelectTitle;
        this.U = tvTitle;
    }

    @androidx.annotation.n0
    @Deprecated
    public static g A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (g) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.w0, root, attachToRoot, component);
    }

    @androidx.annotation.n0
    @Deprecated
    public static g B1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (g) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.w0, (ViewGroup) null, false, component);
    }

    public static g u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static g v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (g) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.w0);
    }

    @androidx.annotation.n0
    public static g y1(@androidx.annotation.n0 LayoutInflater inflater) {
        return B1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static g z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return A1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.basic.function.viewmodel.b pageVM);

    @androidx.annotation.p0
    public com.zentraedi.basic.function.viewmodel.b x1() {
        return this.V;
    }
}
