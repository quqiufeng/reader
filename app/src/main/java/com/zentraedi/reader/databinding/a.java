package com.zentraedi.reader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.databinding.c0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public abstract class a extends c0 {

    @n0
    public final RecyclerView E;

    protected a(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.E = recyclerView;
    }

    @n0
    @Deprecated
    public static a A1(@n0 LayoutInflater layoutInflater, @p0 Object obj) {
        return (a) c0.h0(layoutInflater, com.zentraedi.reader.h.l.h4, (ViewGroup) null, false, obj);
    }

    public static a u1(@n0 View view) {
        return v1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static a v1(@n0 View view, @p0 Object obj) {
        return (a) c0.o(obj, view, com.zentraedi.reader.h.l.h4);
    }

    @n0
    public static a x1(@n0 LayoutInflater layoutInflater) {
        return A1(layoutInflater, androidx.databinding.m.i());
    }

    @n0
    public static a y1(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z) {
        return z1(layoutInflater, viewGroup, z, androidx.databinding.m.i());
    }

    @n0
    @Deprecated
    public static a z1(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z, @p0 Object obj) {
        return (a) c0.h0(layoutInflater, com.zentraedi.reader.h.l.h4, viewGroup, z, obj);
    }
}
