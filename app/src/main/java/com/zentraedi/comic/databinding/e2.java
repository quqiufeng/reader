package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class e2 implements j4.b {

    @androidx.annotation.n0
    private final LinearLayout a;

    @androidx.annotation.n0
    public final ImageView b;

    @androidx.annotation.n0
    public final TextView c;

    @androidx.annotation.n0
    public final TextView d;

    private e2(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
    }

    @androidx.annotation.n0
    public static e2 a(@androidx.annotation.n0 View view) {
        int i = com.zentraedi.comic.q.i.Ck;
        ImageView imageView = (ImageView) j4.c.a(view, i);
        if (imageView != null) {
            i = com.zentraedi.comic.q.i.RP;
            TextView textView = (TextView) j4.c.a(view, i);
            if (textView != null) {
                i = com.zentraedi.comic.q.i.LR;
                TextView textView2 = (TextView) j4.c.a(view, i);
                if (textView2 != null) {
                    return new e2((LinearLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @androidx.annotation.n0
    public static e2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.comic.q.l.F7, viewGroup, false);
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
