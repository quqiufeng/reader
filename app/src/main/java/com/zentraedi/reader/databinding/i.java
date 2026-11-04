package com.zentraedi.reader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.zentraedi.reader.NovelViewPager;
import com.zentraedi.reader.adapter.view.NovelRelativeLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class i implements j4.b {

    @n0
    private final NovelRelativeLayout a;

    @n0
    public final RelativeLayout b;

    @n0
    public final NovelViewPager c;

    @n0
    public final NovelRelativeLayout d;

    private i(@n0 NovelRelativeLayout novelRelativeLayout, @n0 RelativeLayout relativeLayout, @n0 NovelViewPager novelViewPager, @n0 NovelRelativeLayout novelRelativeLayout2) {
        this.a = novelRelativeLayout;
        this.b = relativeLayout;
        this.c = novelViewPager;
        this.d = novelRelativeLayout2;
    }

    @n0
    public static i a(@n0 View view) {
        int i = com.zentraedi.reader.h.i.If;
        RelativeLayout relativeLayout = (RelativeLayout) j4.c.a(view, i);
        if (relativeLayout != null) {
            i = com.zentraedi.reader.h.i.Kf;
            NovelViewPager novelViewPager = (NovelViewPager) j4.c.a(view, i);
            if (novelViewPager != null) {
                NovelRelativeLayout novelRelativeLayout = (NovelRelativeLayout) view;
                return new i(novelRelativeLayout, relativeLayout, novelViewPager, novelRelativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @n0
    public static i c(@n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @n0
    public static i d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.reader.h.l.D8, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NovelRelativeLayout getRoot() {
        return this.a;
    }
}
