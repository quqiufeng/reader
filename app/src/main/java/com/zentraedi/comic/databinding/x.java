package com.zentraedi.comic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zentraedi.business.imgedit.CropImageView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class x implements j4.b {

    @androidx.annotation.n0
    private final RelativeLayout a;

    @androidx.annotation.n0
    public final CheckBox b;

    @androidx.annotation.n0
    public final CheckBox c;

    @androidx.annotation.n0
    public final CropImageView d;

    @androidx.annotation.n0
    public final RelativeLayout e;

    @androidx.annotation.p0
    public final RelativeLayout f;

    @androidx.annotation.n0
    public final TextView g;

    @androidx.annotation.n0
    public final TextView h;

    @androidx.annotation.n0
    public final TextView i;

    private x(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 CheckBox checkBox2, @androidx.annotation.n0 CropImageView cropImageView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.p0 RelativeLayout relativeLayout3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.a = relativeLayout;
        this.b = checkBox;
        this.c = checkBox2;
        this.d = cropImageView;
        this.e = relativeLayout2;
        this.f = relativeLayout3;
        this.g = textView;
        this.h = textView2;
        this.i = textView3;
    }

    @androidx.annotation.n0
    public static x a(@androidx.annotation.n0 View view) {
        CropImageView cropImageViewA;
        int i = com.zentraedi.comic.q.i.l6;
        CheckBox checkBox = (CheckBox) j4.c.a(view, i);
        if (checkBox != null) {
            i = com.zentraedi.comic.q.i.m6;
            CheckBox checkBox2 = (CheckBox) j4.c.a(view, i);
            if (checkBox2 != null && (cropImageViewA = j4.c.a(view, (i = com.zentraedi.comic.q.i.zk))) != null) {
                i = com.zentraedi.comic.q.i.QB;
                RelativeLayout relativeLayout = (RelativeLayout) j4.c.a(view, i);
                if (relativeLayout != null) {
                    RelativeLayout relativeLayout2 = (RelativeLayout) j4.c.a(view, com.zentraedi.comic.q.i.UC);
                    i = com.zentraedi.comic.q.i.tP;
                    TextView textView = (TextView) j4.c.a(view, i);
                    if (textView != null) {
                        i = com.zentraedi.comic.q.i.kS;
                        TextView textView2 = (TextView) j4.c.a(view, i);
                        if (textView2 != null) {
                            i = com.zentraedi.comic.q.i.sS;
                            TextView textView3 = (TextView) j4.c.a(view, i);
                            if (textView3 != null) {
                                return new x((RelativeLayout) view, checkBox, checkBox2, cropImageViewA, relativeLayout, relativeLayout2, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @androidx.annotation.n0
    public static x c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static x d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.comic.q.l.V, viewGroup, false);
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
