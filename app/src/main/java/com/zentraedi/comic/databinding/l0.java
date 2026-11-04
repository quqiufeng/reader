package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.ReadModel;
import com.zentraedi.comic.viewmodel.ScreenOrganize;
import com.zentraedi.comic.viewmodel.ZoomType;
import com.zentraedi.comic.viewmodel.n6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class l0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final CheckBox E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final ImageView G;

    @androidx.annotation.n0
    public final LinearLayout H;

    @androidx.annotation.n0
    public final LinearLayout I;

    @androidx.annotation.n0
    public final AppCompatSeekBar J;

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
    public final TextView R;

    @androidx.annotation.n0
    public final TextView S;

    @androidx.databinding.c
    protected Layout T;

    @androidx.databinding.c
    protected n6 U;

    @androidx.databinding.c
    protected ReadModel V;

    @androidx.databinding.c
    protected ScreenOrganize W;

    @androidx.databinding.c
    protected ZoomType X;

    protected l0(Object obj, View view, int i, CheckBox checkBox, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatSeekBar appCompatSeekBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        super(obj, view, i);
        this.E = checkBox;
        this.F = imageView;
        this.G = imageView2;
        this.H = linearLayout;
        this.I = linearLayout2;
        this.J = appCompatSeekBar;
        this.K = textView;
        this.L = textView2;
        this.M = textView3;
        this.N = textView4;
        this.O = textView5;
        this.P = textView6;
        this.Q = textView7;
        this.R = textView8;
        this.S = textView9;
    }

    @androidx.annotation.n0
    public static l0 C1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return F1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static l0 D1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return E1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static l0 E1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (l0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.P2, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static l0 F1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (l0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.P2, (ViewGroup) null, false, obj);
    }

    public static l0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static l0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (l0) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.P2);
    }

    @androidx.annotation.p0
    public n6 A1() {
        return this.U;
    }

    @androidx.annotation.p0
    public ZoomType B1() {
        return this.X;
    }

    public abstract void G1(@androidx.annotation.p0 Layout layout);

    public abstract void I1(@androidx.annotation.p0 ReadModel readModel);

    public abstract void J1(@androidx.annotation.p0 ScreenOrganize screenOrganize);

    public abstract void K1(@androidx.annotation.p0 n6 n6Var);

    public abstract void L1(@androidx.annotation.p0 ZoomType zoomType);

    @androidx.annotation.p0
    public Layout x1() {
        return this.T;
    }

    @androidx.annotation.p0
    public ReadModel y1() {
        return this.V;
    }

    @androidx.annotation.p0
    public ScreenOrganize z1() {
        return this.W;
    }
}
