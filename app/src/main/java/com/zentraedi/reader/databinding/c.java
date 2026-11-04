package com.zentraedi.reader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.zentraedi.reader.pdf.MuPdfPageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class c implements j4.b {

    @n0
    private final RelativeLayout a;

    @n0
    public final MuPdfPageView b;

    private c(@n0 RelativeLayout relativeLayout, @n0 MuPdfPageView muPdfPageView) {
        this.a = relativeLayout;
        this.b = muPdfPageView;
    }

    @n0
    public static c a(@n0 View view) {
        int i = com.zentraedi.reader.h.i.ng;
        MuPdfPageView muPdfPageView = (MuPdfPageView) j4.c.a(view, i);
        if (muPdfPageView != null) {
            return new c((RelativeLayout) view, muPdfPageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @n0
    public static c c(@n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @n0
    public static c d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.reader.h.l.A5, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.a;
    }
}
