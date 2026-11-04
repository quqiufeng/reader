package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class x0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ImageView E;

    @androidx.annotation.n0
    public final LinearLayout F;

    @androidx.annotation.n0
    public final SeekBar G;

    @androidx.annotation.n0
    public final RelativeLayout H;

    @androidx.annotation.n0
    public final LinearLayout I;

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

    protected x0(Object _bindingComponent, View _root, int _localFieldCount, ImageView ivSeekbarChapterBack, LinearLayout llReaderBottomBar, SeekBar pbChapterChange, RelativeLayout rlChapterChange, LinearLayout rlChapterDesOuter, TextView tvChapterChangeDes, TextView tvChapterRate, TextView tvLastChapter, TextView tvNextChapter, TextView tvPageDes) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = ivSeekbarChapterBack;
        this.F = llReaderBottomBar;
        this.G = pbChapterChange;
        this.H = rlChapterChange;
        this.I = rlChapterDesOuter;
        this.J = tvChapterChangeDes;
        this.K = tvChapterRate;
        this.L = tvLastChapter;
        this.M = tvNextChapter;
        this.N = tvPageDes;
    }

    @androidx.annotation.n0
    @Deprecated
    public static x0 A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (x0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.pe, (ViewGroup) null, false, component);
    }

    public static x0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static x0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (x0) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.pe);
    }

    @androidx.annotation.n0
    public static x0 x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static x0 y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static x0 z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (x0) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.pe, root, attachToRoot, component);
    }
}
