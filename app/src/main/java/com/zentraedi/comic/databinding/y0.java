package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zentraedi.business.view.BaseEditText;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class y0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final TextView G;

    @androidx.annotation.n0
    public final TextView H;

    @androidx.annotation.n0
    public final ImageView I;

    @androidx.annotation.n0
    public final TextView J;

    @androidx.annotation.n0
    public final BaseEditText K;

    @androidx.annotation.n0
    public final BaseEditText L;

    @androidx.annotation.n0
    public final ImageView M;

    @androidx.annotation.n0
    public final ImageView N;

    @androidx.annotation.n0
    public final ImageView O;

    @androidx.annotation.n0
    public final ImageView P;

    @androidx.annotation.n0
    public final ImageView Q;

    @androidx.annotation.n0
    public final FrameLayout R;

    @androidx.annotation.n0
    public final RelativeLayout S;

    @androidx.annotation.n0
    public final LinearLayout T;

    @androidx.annotation.n0
    public final TextView U;

    @androidx.annotation.n0
    public final TextView V;

    @androidx.annotation.n0
    public final TextView W;

    @androidx.annotation.n0
    public final ImageView X;

    @androidx.annotation.n0
    public final TextView Y;

    @androidx.annotation.n0
    public final TextView Z;

    @androidx.annotation.n0
    public final ProgressBar a0;

    protected y0(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, ImageView imageView3, TextView textView3, BaseEditText baseEditText, BaseEditText baseEditText2, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, FrameLayout frameLayout, RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView4, TextView textView5, TextView textView6, ImageView imageView9, TextView textView7, TextView textView8, ProgressBar progressBar) {
        super(obj, view, i);
        this.E = imageView;
        this.F = imageView2;
        this.G = textView;
        this.H = textView2;
        this.I = imageView3;
        this.J = textView3;
        this.K = baseEditText;
        this.L = baseEditText2;
        this.M = imageView4;
        this.N = imageView5;
        this.O = imageView6;
        this.P = imageView7;
        this.Q = imageView8;
        this.R = frameLayout;
        this.S = relativeLayout;
        this.T = linearLayout;
        this.U = textView4;
        this.V = textView5;
        this.W = textView6;
        this.X = imageView9;
        this.Y = textView7;
        this.Z = textView8;
        this.a0 = progressBar;
    }

    @androidx.annotation.n0
    @Deprecated
    public static y0 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (y0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.O3, (ViewGroup) null, false, obj);
    }

    public static y0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static y0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (y0) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.O3);
    }

    @androidx.annotation.n0
    public static y0 x1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return A1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static y0 y1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return z1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static y0 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (y0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.O3, viewGroup, z, obj);
    }
}
