package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.zentraedi.business.refresh.PhotoSyncRefreshHeader;
import com.zentraedi.business.refresh.ReaderLoadMoreFooter;
import com.zentraedi.comic.viewmodel.d6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class y1 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final SmartRefreshLayout E;

    @androidx.annotation.n0
    public final RecyclerView F;

    @androidx.annotation.n0
    public final ReaderLoadMoreFooter G;

    @androidx.annotation.n0
    public final PhotoSyncRefreshHeader H;

    @androidx.annotation.n0
    public final TextView I;

    @androidx.databinding.c
    protected d6 J;

    protected y1(Object obj, View view, int i, SmartRefreshLayout smartRefreshLayout, RecyclerView recyclerView, ReaderLoadMoreFooter readerLoadMoreFooter, PhotoSyncRefreshHeader photoSyncRefreshHeader, TextView textView) {
        super(obj, view, i);
        this.E = smartRefreshLayout;
        this.F = recyclerView;
        this.G = readerLoadMoreFooter;
        this.H = photoSyncRefreshHeader;
        this.I = textView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static y1 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (y1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.Y5, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static y1 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (y1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.Y5, (ViewGroup) null, false, obj);
    }

    public static y1 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static y1 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (y1) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.Y5);
    }

    @androidx.annotation.n0
    public static y1 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static y1 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 d6 d6Var);

    @androidx.annotation.p0
    public d6 x1() {
        return this.J;
    }
}
