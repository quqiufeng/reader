package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.zentraedi.business.refresh.PhotoSyncRefreshHeader;
import com.zentraedi.business.refresh.ReaderLoadMoreFooter;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class s1 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ReaderLoadMoreFooter E;

    @androidx.annotation.n0
    public final PhotoSyncRefreshHeader F;

    @androidx.annotation.n0
    public final RecyclerView G;

    @androidx.annotation.n0
    public final SmartRefreshLayout H;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.k2 I;

    protected s1(Object obj, View view, int i, ReaderLoadMoreFooter readerLoadMoreFooter, PhotoSyncRefreshHeader photoSyncRefreshHeader, RecyclerView recyclerView, SmartRefreshLayout smartRefreshLayout) {
        super(obj, view, i);
        this.E = readerLoadMoreFooter;
        this.F = photoSyncRefreshHeader;
        this.G = recyclerView;
        this.H = smartRefreshLayout;
    }

    @androidx.annotation.n0
    @Deprecated
    public static s1 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (s1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.V5, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static s1 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (s1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.V5, (ViewGroup) null, false, obj);
    }

    public static s1 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static s1 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (s1) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.V5);
    }

    @androidx.annotation.n0
    public static s1 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static s1 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.k2 k2Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.k2 x1() {
        return this.I;
    }
}
