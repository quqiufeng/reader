package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.zentraedi.business.view.BaseEditText;
import com.zentraedi.comic.viewmodel.ComicCodeBookOperate;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class w0 extends androidx.databinding.c0 {

    @androidx.annotation.n0
    public final TextView E;

    @androidx.annotation.n0
    public final CheckBox F;

    @androidx.annotation.n0
    public final TextView G;

    @androidx.annotation.n0
    public final BaseEditText H;

    @androidx.annotation.n0
    public final BaseEditText I;

    @androidx.annotation.n0
    public final View J;

    @androidx.annotation.n0
    public final TextView K;

    @androidx.databinding.c
    protected com.zentraedi.comic.viewmodel.k0 L;

    @androidx.databinding.c
    protected ComicCodeBookOperate M;

    protected w0(Object obj, View view, int i, TextView textView, CheckBox checkBox, TextView textView2, BaseEditText baseEditText, BaseEditText baseEditText2, View view2, TextView textView3) {
        super(obj, view, i);
        this.E = textView;
        this.F = checkBox;
        this.G = textView2;
        this.H = baseEditText;
        this.I = baseEditText2;
        this.J = view2;
        this.K = textView3;
    }

    @androidx.annotation.n0
    public static w0 A1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        return B1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @androidx.annotation.n0
    @Deprecated
    public static w0 B1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z, @androidx.annotation.p0 Object obj) {
        return (w0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.z3, viewGroup, z, obj);
    }

    @androidx.annotation.n0
    @Deprecated
    public static w0 C1(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 Object obj) {
        return (w0) androidx.databinding.c0.h0(layoutInflater, com.zentraedi.comic.q.l.z3, (ViewGroup) null, false, obj);
    }

    public static w0 u1(@androidx.annotation.n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static w0 v1(@androidx.annotation.n0 View view, @androidx.annotation.p0 Object obj) {
        return (w0) androidx.databinding.c0.o(obj, view, com.zentraedi.comic.q.l.z3);
    }

    @androidx.annotation.n0
    public static w0 z1(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return C1(layoutInflater, androidx.databinding.m.i());
    }

    public abstract void D1(@androidx.annotation.p0 ComicCodeBookOperate comicCodeBookOperate);

    public abstract void E1(@androidx.annotation.p0 com.zentraedi.comic.viewmodel.k0 k0Var);

    @androidx.annotation.p0
    public ComicCodeBookOperate x1() {
        return this.M;
    }

    @androidx.annotation.p0
    public com.zentraedi.comic.viewmodel.k0 y1() {
        return this.L;
    }
}
