package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.business.view.BaseEditText;
import com.zentraedi.comic.viewmodel.d6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class q extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final BaseEditText F;

    @androidx.annotation.n0
    public final RecyclerView G;

    @androidx.annotation.n0
    public final ImageView H;

    @androidx.annotation.n0
    public final ImageView I;

    @androidx.annotation.n0
    public final FrameLayout J;

    @androidx.annotation.n0
    public final TextView K;

    @androidx.annotation.n0
    public final TextView L;

    @androidx.databinding.c
    protected d6 M;

    protected q(Object obj, View view, int i, ImageView imageView, BaseEditText baseEditText, RecyclerView recyclerView, ImageView imageView2, ImageView imageView3, FrameLayout frameLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.E = imageView;
        this.F = baseEditText;
        this.G = recyclerView;
        this.H = imageView2;
        this.I = imageView3;
        this.J = frameLayout;
        this.K = textView;
        this.L = textView2;
    }

    @androidx.annotation.n0
    @Deprecated
    public static q A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (q) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.Q, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static q B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (q) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.Q, (ViewGroup) null, false, obj);
    }

    public static q u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static q v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (q) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.Q);
    }

    @androidx.annotation.n0
    public static q y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static q z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 d6 d6Var);

    @androidx.annotation.p0
    public d6 x1() {
        return this.M;
    }
}
