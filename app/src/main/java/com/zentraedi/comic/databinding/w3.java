package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class w3 implements j4.b {

    @androidx.annotation.n0
    private final ConstraintLayout a;

    @androidx.annotation.n0
    public final TextView b;

    @androidx.annotation.n0
    public final TextView c;

    private w3(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
    }

    @androidx.annotation.n0
    public static w3 a(@androidx.annotation.n0 View view) {
        int i = com.zentraedi.comic.q.i.SP;
        TextView textView = (TextView) j4.c.a(view, i);
        if (textView != null) {
            i = com.zentraedi.comic.q.i.PQ;
            TextView textView2 = (TextView) j4.c.a(view, i);
            if (textView2 != null) {
                return new w3((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @androidx.annotation.n0
    public static w3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.comic.q.l.Z8, viewGroup, false);
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
