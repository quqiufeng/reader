package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.zentraedi.comic.view.ComicPullToRefreshRecyclerView;
import com.zentraedi.comic.viewmodel.ComicReaderViewModel;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class o extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final View E;

    @androidx.annotation.n0
    public final ConstraintLayout F;

    @androidx.annotation.n0
    public final DrawerLayout G;

    @androidx.annotation.n0
    public final x3 H;

    @androidx.annotation.n0
    public final z3 I;

    @androidx.annotation.n0
    public final h4 J;

    @androidx.annotation.n0
    public final j4 K;

    @androidx.annotation.n0
    public final l4 L;

    @androidx.annotation.n0
    public final x4 M;

    @androidx.annotation.n0
    public final z4 N;

    @androidx.annotation.n0
    public final b5 O;

    @androidx.annotation.n0
    public final ComicPullToRefreshRecyclerView P;

    @androidx.annotation.n0
    public final m1 Q;

    @androidx.databinding.c
    protected ComicReaderViewModel R;

    @androidx.databinding.c
    protected n6 S;

    protected o(Object obj, View view, int i, View view2, ConstraintLayout constraintLayout, DrawerLayout drawerLayout, x3 x3Var, z3 z3Var, h4 h4Var, j4 j4Var, l4 l4Var, x4 x4Var, z4 z4Var, b5 b5Var, ComicPullToRefreshRecyclerView comicPullToRefreshRecyclerView, m1 m1Var) {
        super(obj, view, i);
        this.E = view2;
        this.F = constraintLayout;
        this.G = drawerLayout;
        this.H = x3Var;
        this.I = z3Var;
        this.J = h4Var;
        this.K = j4Var;
        this.L = l4Var;
        this.M = x4Var;
        this.N = z4Var;
        this.O = b5Var;
        this.P = comicPullToRefreshRecyclerView;
        this.Q = m1Var;
    }

    @androidx.annotation.n0
    public static o A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return B1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static o B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (o) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.P, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static o C1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (o) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.P, (ViewGroup) null, false, obj);
    }

    public static o u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static o v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (o) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.P);
    }

    @androidx.annotation.n0
    public static o z1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return C1(layoutInflater, androidx.databinding.m.i());
    }

    public abstract void D1(@androidx.annotation.p0 n6 n6Var);

    public abstract void E1(@androidx.annotation.p0 ComicReaderViewModel comicReaderViewModel);

    @androidx.annotation.p0
    public n6 x1() {
        return this.S;
    }

    @androidx.annotation.p0
    public ComicReaderViewModel y1() {
        return this.R;
    }
}
