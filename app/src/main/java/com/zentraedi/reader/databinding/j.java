package com.zentraedi.reader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.zentraedi.reader.NovelRecycleView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class j implements j4.b {

    @n0
    private final NovelRecycleView a;

    private j(@n0 NovelRecycleView novelRecycleView) {
        this.a = novelRecycleView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n0
    public static j a(@n0 View view) {
        if (view != 0) {
            return new j((NovelRecycleView) view);
        }
        throw new NullPointerException("rootView");
    }

    @n0
    public static j c(@n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @n0
    public static j d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.reader.h.l.E8, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NovelRecycleView getRoot() {
        return this.a;
    }
}
