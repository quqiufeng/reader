package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class u implements j4.b {

    @androidx.annotation.n0
    private final LinearLayout a;

    @androidx.annotation.n0
    public final FragmentContainerView b;

    private u(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FragmentContainerView fragmentContainerView) {
        this.a = linearLayout;
        this.b = fragmentContainerView;
    }

    @androidx.annotation.n0
    public static u a(@androidx.annotation.n0 View view) {
        int i = com.zentraedi.comic.q.i.tg;
        FragmentContainerView fragmentContainerViewA = j4.c.a(view, i);
        if (fragmentContainerViewA != null) {
            return new u((LinearLayout) view, fragmentContainerViewA);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @androidx.annotation.n0
    public static u c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static u d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.comic.q.l.S, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.a;
    }
}
