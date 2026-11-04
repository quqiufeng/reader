package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.comic.viewmodel.ComicReaderViewModel;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class b4 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final ImageView G;

    @androidx.annotation.n0
    public final RecyclerView H;

    @androidx.annotation.n0
    public final AppCompatSeekBar I;

    @androidx.annotation.n0
    public final TextView J;

    @androidx.annotation.n0
    public final TextView K;

    @androidx.annotation.n0
    public final TextView L;

    @androidx.annotation.n0
    public final TextView M;

    @androidx.annotation.n0
    public final TextView N;

    @androidx.annotation.n0
    public final TextView O;

    @androidx.annotation.n0
    public final TextView P;

    @androidx.annotation.n0
    public final TextView Q;

    @androidx.annotation.n0
    public final View R;

    @androidx.databinding.c
    protected ComicReaderViewModel S;

    protected b4(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, RecyclerView recyclerView, AppCompatSeekBar appCompatSeekBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, View view2) {
        super(obj, view, i);
        this.E = imageView;
        this.F = imageView2;
        this.G = imageView3;
        this.H = recyclerView;
        this.I = appCompatSeekBar;
        this.J = textView;
        this.K = textView2;
        this.L = textView3;
        this.M = textView4;
        this.N = textView5;
        this.O = textView6;
        this.P = textView7;
        this.Q = textView8;
        this.R = view2;
    }

    @androidx.annotation.n0
    @Deprecated
    public static b4 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (b4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.T9, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static b4 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (b4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.T9, (ViewGroup) null, false, obj);
    }

    public static b4 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static b4 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (b4) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.T9);
    }

    @androidx.annotation.n0
    public static b4 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static b4 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 ComicReaderViewModel comicReaderViewModel);

    @androidx.annotation.p0
    public ComicReaderViewModel x1() {
        return this.S;
    }
}
