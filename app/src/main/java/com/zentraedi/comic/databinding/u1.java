package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.zentraedi.business.refresh.PhotoSyncRefreshHeader;
import com.zentraedi.business.refresh.ReaderLoadMoreFooter;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class u1 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final SmartRefreshLayout E;

    @androidx.annotation.n0
    public final ReaderLoadMoreFooter F;

    @androidx.annotation.n0
    public final PhotoSyncRefreshHeader G;

    @androidx.annotation.n0
    public final RecyclerView H;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.c3 I;

    protected u1(Object obj, View view, int i, SmartRefreshLayout smartRefreshLayout, ReaderLoadMoreFooter readerLoadMoreFooter, PhotoSyncRefreshHeader photoSyncRefreshHeader, RecyclerView recyclerView) {
        super(obj, view, i);
        this.E = smartRefreshLayout;
        this.F = readerLoadMoreFooter;
        this.G = photoSyncRefreshHeader;
        this.H = recyclerView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static u1 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (u1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.W5, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static u1 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (u1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.W5, (ViewGroup) null, false, obj);
    }

    public static u1 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static u1 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (u1) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.W5);
    }

    @androidx.annotation.n0
    public static u1 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static u1 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.c3 c3Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.c3 x1() {
        return this.I;
    }
}
