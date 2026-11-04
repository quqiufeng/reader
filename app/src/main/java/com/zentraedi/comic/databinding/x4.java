package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zentraedi.comic.viewmodel.ComicReaderViewModel;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class x4 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final RelativeLayout E;

    @androidx.databinding.c
    protected ComicReaderViewModel F;

    protected x4(Object obj, View view, int i, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.E = relativeLayout;
    }

    @androidx.annotation.n0
    @Deprecated
    public static x4 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (x4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.ea, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static x4 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (x4) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.ea, (ViewGroup) null, false, obj);
    }

    public static x4 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static x4 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (x4) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.ea);
    }

    @androidx.annotation.n0
    public static x4 y1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return B1(layoutInflater, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    public static x4 z1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return A1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    public abstract void C1(@androidx.annotation.p0 ComicReaderViewModel comicReaderViewModel);

    @androidx.annotation.p0
    public ComicReaderViewModel x1() {
        return this.F;
    }
}
