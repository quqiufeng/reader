package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.zentraedi.business.refresh.PhotoSyncRefreshHeader;
import com.zentraedi.business.refresh.ReaderLoadMoreFooter;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class s extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final SmartRefreshLayout E;

    @androidx.annotation.n0
    public final RecyclerView F;

    @androidx.annotation.n0
    public final ReaderLoadMoreFooter G;

    @androidx.annotation.n0
    public final PhotoSyncRefreshHeader H;

    @androidx.annotation.n0
    public final ImageView I;

    @androidx.annotation.n0
    public final NestedScrollView J;

    @androidx.annotation.n0
    public final TextView K;

    @androidx.annotation.n0
    public final TextView L;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.z4 M;

    protected s(Object obj, View view, int i, SmartRefreshLayout smartRefreshLayout, RecyclerView recyclerView, ReaderLoadMoreFooter readerLoadMoreFooter, PhotoSyncRefreshHeader photoSyncRefreshHeader, ImageView imageView, NestedScrollView nestedScrollView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.E = smartRefreshLayout;
        this.F = recyclerView;
        this.G = readerLoadMoreFooter;
        this.H = photoSyncRefreshHeader;
        this.I = imageView;
        this.J = nestedScrollView;
        this.K = textView;
        this.L = textView2;
    }

    @androidx.annotation.n0
    @Deprecated
    public static s A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (s) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.R, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static s B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (s) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.R, (ViewGroup) null, false, obj);
    }

    public static s u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static s v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (s) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.R);
    }

    @androidx.annotation.n0
    public static s y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static s z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.z4 z4Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.z4 x1() {
        return this.M;
    }
}
