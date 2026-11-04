package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class v3 implements j4.b {

    @androidx.annotation.n0
    private final ConstraintLayout a;

    @androidx.annotation.n0
    public final TextView b;

    private v3(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 TextView textView) {
        this.a = constraintLayout;
        this.b = textView;
    }

    @androidx.annotation.n0
    public static v3 a(@androidx.annotation.n0 View view) {
        int i = com.zentraedi.comic.q.i.PQ;
        TextView textView = (TextView) j4.c.a(view, i);
        if (textView != null) {
            return new v3((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @androidx.annotation.n0
    public static v3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.comic.q.l.Q8, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
