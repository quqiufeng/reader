package com.zentraedi.reader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.zentraedi.reader.adapter.view.NovelLinearLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class g implements j4.b {

    @n0
    private final NovelLinearLayout a;

    @n0
    public final RelativeLayout b;

    @n0
    public final e c;

    @n0
    public final f d;

    private g(@n0 NovelLinearLayout novelLinearLayout, @n0 RelativeLayout relativeLayout, @n0 e eVar, @n0 f fVar) {
        this.a = novelLinearLayout;
        this.b = relativeLayout;
        this.c = eVar;
        this.d = fVar;
    }

    @n0
    public static g a(@n0 View view) {
        View viewA;
        int i = com.zentraedi.reader.h.i.Y3;
        RelativeLayout relativeLayout = (RelativeLayout) j4.c.a(view, i);
        if (relativeLayout != null && (viewA = j4.c.a(view, (i = com.zentraedi.reader.h.i.U6))) != null) {
            e eVarA = e.a(viewA);
            int i2 = com.zentraedi.reader.h.i.t7;
            View viewA2 = j4.c.a(view, i2);
            if (viewA2 != null) {
                return new g((NovelLinearLayout) view, relativeLayout, eVarA, f.a(viewA2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @n0
    public static g c(@n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @n0
    public static g d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.reader.h.l.C8, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NovelLinearLayout getRoot() {
        return this.a;
    }
}
