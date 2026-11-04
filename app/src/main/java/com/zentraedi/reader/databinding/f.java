package com.zentraedi.reader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.zentraedi.reader.view.CircleProgressBar;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class f implements j4.b {

    @n0
    private final RelativeLayout a;

    @n0
    public final CircleProgressBar b;

    @n0
    public final RelativeLayout c;

    @n0
    public final RelativeLayout d;

    @n0
    public final ImageView e;

    @n0
    public final ImageView f;

    @n0
    public final RelativeLayout g;

    @n0
    public final RelativeLayout h;

    @n0
    public final TextView i;

    @n0
    public final TextView j;

    private f(@n0 RelativeLayout relativeLayout, @n0 CircleProgressBar circleProgressBar, @n0 RelativeLayout relativeLayout2, @n0 RelativeLayout relativeLayout3, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 RelativeLayout relativeLayout4, @n0 RelativeLayout relativeLayout5, @n0 TextView textView, @n0 TextView textView2) {
        this.a = relativeLayout;
        this.b = circleProgressBar;
        this.c = relativeLayout2;
        this.d = relativeLayout3;
        this.e = imageView;
        this.f = imageView2;
        this.g = relativeLayout4;
        this.h = relativeLayout5;
        this.i = textView;
        this.j = textView2;
    }

    @n0
    public static f a(@n0 View view) {
        int i = com.zentraedi.reader.h.i.m3;
        CircleProgressBar circleProgressBar = (CircleProgressBar) j4.c.a(view, i);
        if (circleProgressBar != null) {
            i = com.zentraedi.reader.h.i.n3;
            RelativeLayout relativeLayout = (RelativeLayout) j4.c.a(view, i);
            if (relativeLayout != null) {
                i = com.zentraedi.reader.h.i.X6;
                RelativeLayout relativeLayout2 = (RelativeLayout) j4.c.a(view, i);
                if (relativeLayout2 != null) {
                    i = com.zentraedi.reader.h.i.a9;
                    ImageView imageView = (ImageView) j4.c.a(view, i);
                    if (imageView != null) {
                        i = com.zentraedi.reader.h.i.G9;
                        ImageView imageView2 = (ImageView) j4.c.a(view, i);
                        if (imageView2 != null) {
                            RelativeLayout relativeLayout3 = (RelativeLayout) view;
                            i = com.zentraedi.reader.h.i.Nh;
                            RelativeLayout relativeLayout4 = (RelativeLayout) j4.c.a(view, i);
                            if (relativeLayout4 != null) {
                                i = com.zentraedi.reader.h.i.zj;
                                TextView textView = (TextView) j4.c.a(view, i);
                                if (textView != null) {
                                    i = com.zentraedi.reader.h.i.zq;
                                    TextView textView2 = (TextView) j4.c.a(view, i);
                                    if (textView2 != null) {
                                        return new f(relativeLayout3, circleProgressBar, relativeLayout, relativeLayout2, imageView, imageView2, relativeLayout3, relativeLayout4, textView, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @n0
    public static f c(@n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @n0
    public static f d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.reader.h.l.A8, viewGroup, false);
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
