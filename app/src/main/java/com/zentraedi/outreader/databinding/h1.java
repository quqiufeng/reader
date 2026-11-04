package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zentraedi.reader.view.CircleProgressBar;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class h1 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final CircleProgressBar E;

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
    public final ImageView L;

    @androidx.annotation.n0
    public final ImageView M;

    @androidx.annotation.n0
    public final RelativeLayout N;

    @androidx.annotation.n0
    public final LinearLayout O;

    @androidx.annotation.n0
    public final RelativeLayout P;

    @androidx.annotation.n0
    public final RelativeLayout Q;

    @androidx.annotation.n0
    public final TextView R;

    @androidx.annotation.n0
    public final TextView S;

    @androidx.annotation.n0
    public final TextView T;

    @androidx.annotation.n0
    public final TextView U;

    protected h1(Object _bindingComponent, View _root, int _localFieldCount, CircleProgressBar downloadProgress, ImageView ivAddShelf, ImageView ivBookDownload, ImageView ivBookmark, ImageView ivCommentMark, ImageView ivLeftBack, ImageView ivMore, ImageView ivToReward, ImageView ivWebErrorIcon, RelativeLayout llResourceDes, LinearLayout llTitleBar, RelativeLayout rlTitleBar, RelativeLayout rlWebBookErrorTip, TextView tvChapterName, TextView tvHeaderErrorTip, TextView tvResourceUrlDes, TextView tvSourceDes) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = downloadProgress;
        this.F = ivAddShelf;
        this.G = ivBookDownload;
        this.H = ivBookmark;
        this.I = ivCommentMark;
        this.J = ivLeftBack;
        this.K = ivMore;
        this.L = ivToReward;
        this.M = ivWebErrorIcon;
        this.N = llResourceDes;
        this.O = llTitleBar;
        this.P = rlTitleBar;
        this.Q = rlWebBookErrorTip;
        this.R = tvChapterName;
        this.S = tvHeaderErrorTip;
        this.T = tvResourceUrlDes;
        this.U = tvSourceDes;
    }

    @androidx.annotation.n0
    @Deprecated
    public static h1 A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (h1) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.ue, (ViewGroup) null, false, component);
    }

    public static h1 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static h1 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (h1) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.ue);
    }

    @androidx.annotation.n0
    public static h1 x1(@androidx.annotation.n0 LayoutInflater inflater) {
        return A1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static h1 y1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return z1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static h1 z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (h1) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.ue, root, attachToRoot, component);
    }
}
