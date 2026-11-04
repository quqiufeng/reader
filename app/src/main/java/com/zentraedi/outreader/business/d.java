package com.zentraedi.outreader.business;

import android.widget.TextView;
import fo.k;
import fo.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class d {
    private final void a(boolean z, TextView textView) {
        if (textView == null) {
            return;
        }
        if (z) {
            textView.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.q4));
        } else {
            textView.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.Bb));
        }
        textView.setBackground(null);
    }

    private final void b(boolean z, TextView textView) {
        if (textView == null) {
            return;
        }
        if (z) {
            textView.setBackground(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.d60));
            textView.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.E5));
        } else {
            textView.setBackground(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.c60));
            textView.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.K3));
        }
    }

    private final void c(boolean z, TextView textView) {
        if (textView == null) {
            return;
        }
        if (z) {
            textView.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.q4));
        } else {
            textView.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.L5));
        }
        textView.setBackground(null);
    }

    public final void d(boolean z, boolean z2, int i, @k TextView title, @l TextView textView, @l TextView textView2, @l TextView textView3, @l TextView textView4, @l TextView textView5) {
        Intrinsics.checkNotNullParameter(title, "title");
        if (z2) {
            title.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.E5));
        } else {
            title.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.o0));
        }
        if (i == 1) {
            b(z2, textView2);
            c(z2, textView3);
            c(z2, textView);
            c(z2, textView4);
            c(z2, textView5);
        } else if (i == 2) {
            c(z2, textView2);
            c(z2, textView3);
            b(z2, textView);
            c(z2, textView4);
            c(z2, textView5);
        } else if (i == 3) {
            c(z2, textView2);
            b(z2, textView3);
            c(z2, textView);
            c(z2, textView4);
            c(z2, textView5);
        } else if (i == 4) {
            c(z2, textView2);
            c(z2, textView3);
            c(z2, textView);
            b(z2, textView4);
            c(z2, textView5);
        } else if (i == 5) {
            c(z2, textView2);
            c(z2, textView3);
            c(z2, textView);
            c(z2, textView4);
            b(z2, textView5);
        }
        if (z) {
            a(z2, textView);
            a(z2, textView4);
        }
    }
}
