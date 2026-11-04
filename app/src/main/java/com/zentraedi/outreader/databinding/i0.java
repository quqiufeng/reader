package com.zentraedi.outreader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class i0 implements j4.b {

    @androidx.annotation.n0
    private final RelativeLayout a;

    @androidx.annotation.n0
    public final CheckBox b;

    @androidx.annotation.n0
    public final ImageView c;

    @androidx.annotation.n0
    public final LinearLayout d;

    @androidx.annotation.n0
    public final RelativeLayout e;

    @androidx.annotation.n0
    public final TextView f;

    @androidx.annotation.n0
    public final TextView g;

    @androidx.annotation.n0
    public final TextView h;

    @androidx.annotation.n0
    public final TextView i;

    @androidx.annotation.n0
    public final TextView j;

    private i0(@androidx.annotation.n0 RelativeLayout rootView, @androidx.annotation.n0 CheckBox cbSelect, @androidx.annotation.n0 ImageView ivTypefaceFail, @androidx.annotation.n0 LinearLayout llSelect, @androidx.annotation.n0 RelativeLayout rlTypeface, @androidx.annotation.n0 TextView tvDownloadDes, @androidx.annotation.n0 TextView tvTypefaceDownload, @androidx.annotation.n0 TextView tvTypefaceName, @androidx.annotation.n0 TextView tvUse, @androidx.annotation.n0 TextView tvUsing) {
        this.a = rootView;
        this.b = cbSelect;
        this.c = ivTypefaceFail;
        this.d = llSelect;
        this.e = rlTypeface;
        this.f = tvDownloadDes;
        this.g = tvTypefaceDownload;
        this.h = tvTypefaceName;
        this.i = tvUse;
        this.j = tvUsing;
    }

    @androidx.annotation.n0
    public static i0 a(@androidx.annotation.n0 View rootView) {
        int i = com.zentraedi.outreader.d.i.l5;
        CheckBox checkBox = (CheckBox) j4.c.a(rootView, i);
        if (checkBox != null) {
            i = com.zentraedi.outreader.d.i.kk;
            ImageView imageView = (ImageView) j4.c.a(rootView, i);
            if (imageView != null) {
                i = com.zentraedi.outreader.d.i.Tn;
                LinearLayout linearLayout = (LinearLayout) j4.c.a(rootView, i);
                if (linearLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) rootView;
                    i = com.zentraedi.outreader.d.i.jM;
                    TextView textView = (TextView) j4.c.a(rootView, i);
                    if (textView != null) {
                        i = com.zentraedi.outreader.d.i.BO;
                        TextView textView2 = (TextView) j4.c.a(rootView, i);
                        if (textView2 != null) {
                            i = com.zentraedi.outreader.d.i.CO;
                            TextView textView3 = (TextView) j4.c.a(rootView, i);
                            if (textView3 != null) {
                                i = com.zentraedi.outreader.d.i.WK;
                                TextView textView4 = (TextView) j4.c.a(rootView, i);
                                if (textView4 != null) {
                                    i = com.zentraedi.outreader.d.i.YK;
                                    TextView textView5 = (TextView) j4.c.a(rootView, i);
                                    if (textView5 != null) {
                                        return new i0(relativeLayout, checkBox, imageView, linearLayout, relativeLayout, textView, textView2, textView3, textView4, textView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @androidx.annotation.n0
    public static i0 c(@androidx.annotation.n0 LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @androidx.annotation.n0
    public static i0 d(@androidx.annotation.n0 LayoutInflater inflater, @androidx.annotation.p0 ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(com.zentraedi.outreader.d.l.Ib, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.a;
    }
}
