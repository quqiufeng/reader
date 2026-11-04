package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zentraedi.business.imgedit.ImageStretcherView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class e0 implements j4.b {

    @androidx.annotation.n0
    private final RelativeLayout a;

    @androidx.annotation.n0
    public final ImageStretcherView b;

    @androidx.annotation.n0
    public final RelativeLayout c;

    @androidx.annotation.n0
    public final TextView d;

    @androidx.annotation.n0
    public final TextView e;

    @androidx.annotation.n0
    public final TextView f;

    private e0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageStretcherView imageStretcherView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.a = relativeLayout;
        this.b = imageStretcherView;
        this.c = relativeLayout2;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
    }

    @androidx.annotation.n0
    public static e0 a(@androidx.annotation.n0 View view) {
        int i = com.zentraedi.comic.q.i.zk;
        ImageStretcherView imageStretcherViewA = j4.c.a(view, i);
        if (imageStretcherViewA != null) {
            i = com.zentraedi.comic.q.i.QB;
            RelativeLayout relativeLayout = (RelativeLayout) j4.c.a(view, i);
            if (relativeLayout != null) {
                i = com.zentraedi.comic.q.i.tP;
                TextView textView = (TextView) j4.c.a(view, i);
                if (textView != null) {
                    i = com.zentraedi.comic.q.i.kS;
                    TextView textView2 = (TextView) j4.c.a(view, i);
                    if (textView2 != null) {
                        i = com.zentraedi.comic.q.i.sS;
                        TextView textView3 = (TextView) j4.c.a(view, i);
                        if (textView3 != null) {
                            return new e0((RelativeLayout) view, imageStretcherViewA, relativeLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @androidx.annotation.n0
    public static e0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.comic.q.l.X0, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.a;
    }
}
