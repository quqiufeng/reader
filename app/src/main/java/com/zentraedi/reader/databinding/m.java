package com.zentraedi.reader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.zentraedi.reader.view.PdfPhotoView;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class m implements j4.b {

    @n0
    private final FrameLayout a;

    @n0
    public final PdfPhotoView b;

    private m(@n0 FrameLayout frameLayout, @n0 PdfPhotoView pdfPhotoView) {
        this.a = frameLayout;
        this.b = pdfPhotoView;
    }

    @n0
    public static m a(@n0 View view) {
        int i = com.zentraedi.reader.h.i.ng;
        PdfPhotoView pdfPhotoView = (PdfPhotoView) j4.c.a(view, i);
        if (pdfPhotoView != null) {
            return new m((FrameLayout) view, pdfPhotoView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @n0
    public static m c(@n0 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @n0
    public static m d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.zentraedi.reader.h.l.Ka, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.a;
    }
}
