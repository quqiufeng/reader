package com.zentraedi.reader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class l implements j4.b {

    @n0
    private final RelativeLayout a;

    private l(@n0 RelativeLayout relativeLayout) {
        this.a = relativeLayout;
    }

    @n0
    public static l a(@n0 View view) {
        if (view != null) {
            return new l((RelativeLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @n0
    public static l c(@n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @n0
    public static l d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.reader.h.l.Ja, viewGroup, false);
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
