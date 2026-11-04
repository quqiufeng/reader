package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.business.widget.MediumTextView;
import com.zentraedi.outreader.widget.fastscrollview.FastScrollRecyclerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class o extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final LinearLayout G;

    @androidx.annotation.n0
    public final RecyclerView H;

    @androidx.annotation.n0
    public final FastScrollRecyclerView I;

    @androidx.annotation.n0
    public final MediumTextView J;

    protected o(Object _bindingComponent, View _root, int _localFieldCount, ImageView ivSwitchSort, ImageView ivSwitchView, LinearLayout rlContainer, RecyclerView rvPreview, FastScrollRecyclerView srvCategoryList, MediumTextView tvTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = ivSwitchSort;
        this.F = ivSwitchView;
        this.G = rlContainer;
        this.H = rvPreview;
        this.I = srvCategoryList;
        this.J = tvTitle;
    }

    @androidx.annotation.n0
    @Deprecated
    public static o A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (o) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.j5, (ViewGroup) null, false, component);
    }

    public static o u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static o v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (o) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.j5);
    }

    @androidx.annotation.n0
    public static o x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static o y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static o z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (o) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.j5, root, attachToRoot, component);
    }
}
