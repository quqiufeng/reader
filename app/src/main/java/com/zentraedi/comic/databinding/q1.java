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
import com.zentraedi.business.widget.MediumTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class q1 extends androidx.databinding.c0 {

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
    public final ImageView J;

    @androidx.annotation.n0
    public final ImageView K;

    @androidx.annotation.n0
    public final NestedScrollView L;

    @androidx.annotation.n0
    public final MediumTextView M;

    @androidx.annotation.n0
    public final TextView N;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.b1 O;

    protected q1(Object obj, View view, int i, SmartRefreshLayout smartRefreshLayout, RecyclerView recyclerView, ReaderLoadMoreFooter readerLoadMoreFooter, PhotoSyncRefreshHeader photoSyncRefreshHeader, ImageView imageView, ImageView imageView2, ImageView imageView3, NestedScrollView nestedScrollView, MediumTextView mediumTextView, TextView textView) {
        super(obj, view, i);
        this.E = smartRefreshLayout;
        this.F = recyclerView;
        this.G = readerLoadMoreFooter;
        this.H = photoSyncRefreshHeader;
        this.I = imageView;
        this.J = imageView2;
        this.K = imageView3;
        this.L = nestedScrollView;
        this.M = mediumTextView;
        this.N = textView;
    }

    @androidx.annotation.n0
    @Deprecated
    public static q1 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (q1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.U5, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static q1 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (q1) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.U5, (ViewGroup) null, false, obj);
    }

    public static q1 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static q1 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (q1) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.U5);
    }

    @androidx.annotation.n0
    public static q1 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static q1 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.b1 b1Var);

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.b1 x1() {
        return this.O;
    }
}
