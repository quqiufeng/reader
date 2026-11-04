package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zentraedi.comic.view.ComicTiledImageView;
import com.zentraedi.comic.viewmodel.l6;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class y2 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final ComicTiledImageView E;

    @androidx.annotation.n0
    public final RelativeLayout F;

    @androidx.databinding.c
    protected l6 G;

    protected y2(Object obj, View view, int i, ComicTiledImageView comicTiledImageView, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.E = comicTiledImageView;
        this.F = relativeLayout;
    }

    @androidx.annotation.n0
    @Deprecated
    public static y2 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (y2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.Q7, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static y2 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (y2) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.Q7, (ViewGroup) null, false, obj);
    }

    public static y2 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static y2 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (y2) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.Q7);
    }

    @androidx.annotation.n0
    public static y2 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static y2 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 l6 l6Var);

    @androidx.annotation.p0
    public l6 x1() {
        return this.G;
    }
}
