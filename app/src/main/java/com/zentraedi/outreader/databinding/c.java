package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.zentraedi.outreader.model.SectionContentEntity;
import com.zentraedi.outreader.widget.TypeFaceTextView;
import com.zentraedi.reader.reader.PageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public abstract class c extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final FrameLayout E;

    @androidx.annotation.n0
    public final ImageView F;

    @androidx.annotation.n0
    public final ImageView G;

    @androidx.annotation.n0
    public final n0 H;

    @androidx.annotation.n0
    public final LinearLayout I;

    @androidx.annotation.n0
    public final ProgressBar J;

    @androidx.annotation.n0
    public final PageView K;

    @androidx.annotation.n0
    public final DrawerLayout L;

    @androidx.annotation.n0
    public final p0 M;

    @androidx.annotation.n0
    public final r0 N;

    @androidx.annotation.n0
    public final h1 O;

    @androidx.annotation.n0
    public final RelativeLayout P;

    @androidx.annotation.n0
    public final RelativeLayout Q;

    @androidx.annotation.n0
    public final RelativeLayout R;

    @androidx.annotation.n0
    public final RelativeLayout S;

    @androidx.annotation.n0
    public final RelativeLayout T;

    @androidx.annotation.n0
    public final RelativeLayout U;

    @androidx.annotation.n0
    public final TypeFaceTextView V;

    @androidx.annotation.n0
    public final TextView W;

    @androidx.annotation.n0
    public final RelativeLayout X;

    @androidx.annotation.n0
    public final j0 Y;

    @androidx.databinding.c
    protected SectionContentEntity Z;

    protected c(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout flContainer, ImageView ivLoadBack, ImageView ivLoadingWebview, n0 layoutSlide, LinearLayout llSide, ProgressBar pbProgress, PageView pvRead, DrawerLayout readDrawer, p0 readerErrorLayout, r0 readerFooter, h1 readerHeaderBar, RelativeLayout rlBottomAdContainer, RelativeLayout rlBottomAdPosition, RelativeLayout rlDialogBg, RelativeLayout rlLoadBar, RelativeLayout rlLoadingWebview, RelativeLayout rlProgress, TypeFaceTextView tvBottomAdSlogan, TextView tvFlipTip, RelativeLayout vgCoverContainer, j0 webContentErrorTip) {
        super(_bindingComponent, _root, _localFieldCount);
        this.E = flContainer;
        this.F = ivLoadBack;
        this.G = ivLoadingWebview;
        this.H = layoutSlide;
        this.I = llSide;
        this.J = pbProgress;
        this.K = pvRead;
        this.L = readDrawer;
        this.M = readerErrorLayout;
        this.N = readerFooter;
        this.O = readerHeaderBar;
        this.P = rlBottomAdContainer;
        this.Q = rlBottomAdPosition;
        this.R = rlDialogBg;
        this.S = rlLoadBar;
        this.T = rlLoadingWebview;
        this.U = rlProgress;
        this.V = tvBottomAdSlogan;
        this.W = tvFlipTip;
        this.X = vgCoverContainer;
        this.Y = webContentErrorTip;
    }

    @androidx.annotation.n0
    @Deprecated
    public static c A1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot, @androidx.annotation.p0 Object component) {
        return (c) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.p0, root, attachToRoot, component);
    }

    @androidx.annotation.n0
    @Deprecated
    public static c B1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 Object component) {
        return (c) androidx.databinding.c0.h0(inflater, com.zentraedi.outreader.d.l.p0, (ViewGroup) null, false, component);
    }

    public static c u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static c v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object component) {
        return (c) androidx.databinding.c0.o(component, view, com.zentraedi.outreader.d.l.p0);
    }

    @androidx.annotation.n0
    public static c y1(@androidx.annotation.n0 LayoutInflater inflater) {
        return B1(inflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static c z1(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup root, boolean attachToRoot) {
        return A1(inflater, root, attachToRoot, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 SectionContentEntity book);

    @androidx.annotation.p0
    public SectionContentEntity x1() {
        return this.Z;
    }
}
