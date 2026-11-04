package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zentraedi.business.view.BaseEditText;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class v0 implements j4.b {

    @androidx.annotation.n0
    private final LinearLayout a;

    @androidx.annotation.n0
    public final TextView b;

    @androidx.annotation.n0
    public final ImageView c;

    @androidx.annotation.n0
    public final TextView d;

    @androidx.annotation.n0
    public final BaseEditText e;

    @androidx.annotation.n0
    public final TextView f;

    @androidx.annotation.n0
    public final TextView g;

    private v0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 BaseEditText baseEditText, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.a = linearLayout;
        this.b = textView;
        this.c = imageView;
        this.d = textView2;
        this.e = baseEditText;
        this.f = textView3;
        this.g = textView4;
    }

    @androidx.annotation.n0
    public static v0 a(@androidx.annotation.n0 View view) {
        BaseEditText baseEditTextA;
        int i = com.zentraedi.comic.q.i.d5;
        TextView textView = (TextView) j4.c.a(view, i);
        if (textView != null) {
            i = com.zentraedi.comic.q.i.J6;
            ImageView imageView = (ImageView) j4.c.a(view, i);
            if (imageView != null) {
                i = com.zentraedi.comic.q.i.E7;
                TextView textView2 = (TextView) j4.c.a(view, i);
                if (textView2 != null && (baseEditTextA = j4.c.a(view, (i = com.zentraedi.comic.q.i.ae))) != null) {
                    i = com.zentraedi.comic.q.i.ce;
                    TextView textView3 = (TextView) j4.c.a(view, i);
                    if (textView3 != null) {
                        i = com.zentraedi.comic.q.i.tK;
                        TextView textView4 = (TextView) j4.c.a(view, i);
                        if (textView4 != null) {
                            return new v0((LinearLayout) view, textView, imageView, textView2, baseEditTextA, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @androidx.annotation.n0
    public static v0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.comic.q.l.y3, viewGroup, false);
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
