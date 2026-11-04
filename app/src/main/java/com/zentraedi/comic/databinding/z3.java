package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.comic.viewmodel.ComicReaderViewModel;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class z3 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final x3 E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final ImageView G;

    @androidx.annotation.n0
    public final ImageView H;

    @androidx.annotation.n0
    public final ImageView I;

    @androidx.annotation.n0
    public final ImageView J;

    @androidx.annotation.n0
    public final ImageView K;

    @androidx.annotation.n0
    public final RecyclerView L;

    @androidx.annotation.n0
    public final AppCompatSeekBar M;

    @androidx.annotation.n0
    public final AppCompatSeekBar N;

    @androidx.annotation.n0
    public final TextView O;

    @androidx.annotation.n0
    public final TextView P;

    @androidx.annotation.n0
    public final TextView Q;

    @androidx.annotation.n0
    public final TextView R;

    @androidx.annotation.n0
    public final TextView S;

    @androidx.annotation.n0
    public final TextView T;

    @androidx.annotation.n0
    public final TextView U;

    @androidx.annotation.n0
    public final TextView V;

    @androidx.annotation.n0
    public final TextView W;

    @androidx.annotation.n0
    public final TextView X;

    @androidx.annotation.n0
    public final TextView Y;

    @androidx.annotation.n0
    public final TextView Z;

    @androidx.annotation.n0
    public final TextView a0;

    @androidx.annotation.n0
    public final TextView b0;

    @androidx.annotation.n0
    public final TextView c0;

    @androidx.databinding.c
    protected ComicReaderViewModel d0;

    @androidx.databinding.c
    protected n6 e0;

    @androidx.databinding.c
    protected ComicReaderViewModel.BottomMenu f0;

    protected z3(Object obj, View view, int i, x3 x3Var, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, RecyclerView recyclerView, AppCompatSeekBar appCompatSeekBar, AppCompatSeekBar appCompatSeekBar2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15) {
        super(obj, view, i);
        this.E = x3Var;
        this.F = imageView;
        this.G = imageView2;
        this.H = imageView3;
        this.I = imageView4;
        this.J = imageView5;
        this.K = imageView6;
        this.L = recyclerView;
        this.M = appCompatSeekBar;
        this.N = appCompatSeekBar2;
        this.O = textView;
        this.P = textView2;
        this.Q = textView3;
        this.R = textView4;
        this.S = textView5;
        this.T = textView6;
        this.U = textView7;
        this.V = textView8;
        this.W = textView9;
        this.X = textView10;
        this.Y = textView11;
        this.Z = textView12;
        this.a0 = textView13;
        this.b0 = textView14;
        this.c0 = textView15;
    }

    @androidx.annotation.n0
    public static z3 A1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return D1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static z3 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return C1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static z3 C1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (z3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.S9, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static z3 D1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (z3) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.S9, (ViewGroup) null, false, obj);
    }

    public static z3 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static z3 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (z3) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.S9);
    }

    public abstract void E1(@androidx.annotation.p0 ComicReaderViewModel.BottomMenu bottomMenu);

    public abstract void F1(@androidx.annotation.p0 ComicReaderViewModel comicReaderViewModel);

    public abstract void G1(@androidx.annotation.p0 n6 n6Var);

    @androidx.annotation.p0
    public ComicReaderViewModel.BottomMenu x1() {
        return this.f0;
    }

    @androidx.annotation.p0
    public ComicReaderViewModel y1() {
        return this.d0;
    }

    @androidx.annotation.p0
    public n6 z1() {
        return this.e0;
    }
}
