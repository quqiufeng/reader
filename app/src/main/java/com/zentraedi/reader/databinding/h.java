package com.zentraedi.reader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.zentraedi.reader.NovelTextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class h implements j4.b {

    @n0
    private final RelativeLayout a;

    @n0
    public final NovelTextView b;

    @n0
    public final LinearLayout c;

    @n0
    public final k d;

    @n0
    public final TextView e;

    @n0
    public final TextView f;

    @n0
    public final TextView g;

    private h(@n0 RelativeLayout relativeLayout, @n0 NovelTextView novelTextView, @n0 LinearLayout linearLayout, @n0 k kVar, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3) {
        this.a = relativeLayout;
        this.b = novelTextView;
        this.c = linearLayout;
        this.d = kVar;
        this.e = textView;
        this.f = textView2;
        this.g = textView3;
    }

    @n0
    public static h a(@n0 View view) {
        View viewA;
        int i = com.zentraedi.reader.h.i.O3;
        NovelTextView novelTextView = (NovelTextView) j4.c.a(view, i);
        if (novelTextView != null) {
            i = com.zentraedi.reader.h.i.qb;
            LinearLayout linearLayout = (LinearLayout) j4.c.a(view, i);
            if (linearLayout != null && (viewA = j4.c.a(view, (i = com.zentraedi.reader.h.i.xe))) != null) {
                k kVarA = k.a(viewA);
                i = com.zentraedi.reader.h.i.Uf;
                TextView textView = (TextView) j4.c.a(view, i);
                if (textView != null) {
                    i = com.zentraedi.reader.h.i.Vf;
                    TextView textView2 = (TextView) j4.c.a(view, i);
                    if (textView2 != null) {
                        i = com.zentraedi.reader.h.i.Wf;
                        TextView textView3 = (TextView) j4.c.a(view, i);
                        if (textView3 != null) {
                            return new h((RelativeLayout) view, novelTextView, linearLayout, kVarA, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @n0
    public static h c(@n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @n0
    public static h d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.reader.h.l.B8, viewGroup, false);
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
