package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.zentraedi.business.databinding.dq;
import com.zentraedi.business.refresh.PhotoSyncRefreshHeader;
import com.zentraedi.business.widget.MediumTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class c extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final AppBarLayout E;

    @androidx.annotation.n0
    public final PhotoSyncRefreshHeader F;

    @androidx.annotation.n0
    public final dq G;

    @androidx.annotation.n0
    public final SmartRefreshLayout H;

    @androidx.annotation.n0
    public final RecyclerView I;

    @androidx.annotation.n0
    public final com.zentraedi.business.databinding.e3 J;

    @androidx.annotation.n0
    public final MediumTextView K;

    @androidx.databinding.c
    protected com.zentraedi.business.viewmodel.m L;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.v M;

    protected c(Object obj, View view, int i, AppBarLayout appBarLayout, PhotoSyncRefreshHeader photoSyncRefreshHeader, dq dqVar, SmartRefreshLayout smartRefreshLayout, RecyclerView recyclerView, com.zentraedi.business.databinding.e3 e3Var, MediumTextView mediumTextView) {
        super(obj, view, i);
        this.E = appBarLayout;
        this.F = photoSyncRefreshHeader;
        this.G = dqVar;
        this.H = smartRefreshLayout;
        this.I = recyclerView;
        this.J = e3Var;
        this.K = mediumTextView;
    }

    @androidx.annotation.n0
    public static c A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return B1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static c B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (c) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.J, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static c C1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (c) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.J, (ViewGroup) null, false, obj);
    }

    public static c u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static c v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (c) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.J);
    }

    @androidx.annotation.n0
    public static c z1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return C1(layoutInflater, androidx.databinding.m.i());
    }

    public abstract void D1(@androidx.annotation.p0 com.zentraedi.business.viewmodel.m mVar);

    public abstract void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.v vVar);

    @androidx.annotation.p0
    public com.zentraedi.business.viewmodel.m x1() {
        return this.L;
    }

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.v y1() {
        return this.M;
    }
}
