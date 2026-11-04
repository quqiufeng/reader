package com.zentraedi.reader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import com.zentraedi.reader.pdf.MuPdfPageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class k implements j4.b {

    @n0
    private final View a;

    @n0
    public final ProgressBar b;

    @n0
    public final RelativeLayout c;

    @n0
    public final MuPdfPageView d;

    private k(@n0 View view, @n0 ProgressBar progressBar, @n0 RelativeLayout relativeLayout, @n0 MuPdfPageView muPdfPageView) {
        this.a = view;
        this.b = progressBar;
        this.c = relativeLayout;
        this.d = muPdfPageView;
    }

    @n0
    public static k a(@n0 View view) {
        int i = com.zentraedi.reader.h.i.f1168gg;
        ProgressBar progressBar = (ProgressBar) j4.c.a(view, i);
        if (progressBar != null) {
            i = com.zentraedi.reader.h.i.mg;
            RelativeLayout relativeLayout = (RelativeLayout) j4.c.a(view, i);
            if (relativeLayout != null) {
                i = com.zentraedi.reader.h.i.ng;
                MuPdfPageView muPdfPageView = (MuPdfPageView) j4.c.a(view, i);
                if (muPdfPageView != null) {
                    return new k(view, progressBar, relativeLayout, muPdfPageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @n0
    public static k b(@n0 LayoutInflater layoutInflater, @n0 ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.zentraedi.reader.h.l.ta, viewGroup);
        return a(viewGroup);
    }

    @n0
    public View getRoot() {
        return this.a;
    }
}
