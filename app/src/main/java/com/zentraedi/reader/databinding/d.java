package com.zentraedi.reader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.zentraedi.reader.adapter.view.NovelLinearLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class d implements j4.b {

    @n0
    private final NovelLinearLayout a;

    @n0
    public final NovelLinearLayout b;

    private d(@n0 NovelLinearLayout novelLinearLayout, @n0 NovelLinearLayout novelLinearLayout2) {
        this.a = novelLinearLayout;
        this.b = novelLinearLayout2;
    }

    @n0
    public static d a(@n0 View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        NovelLinearLayout novelLinearLayout = (NovelLinearLayout) view;
        return new d(novelLinearLayout, novelLinearLayout);
    }

    @n0
    public static d c(@n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @n0
    public static d d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.reader.h.l.M7, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NovelLinearLayout getRoot() {
        return this.a;
    }
}
