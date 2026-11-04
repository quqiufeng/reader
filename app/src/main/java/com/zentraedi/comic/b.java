package com.zentraedi.comic;

import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class b {
    public static final void a(@fo.k com.chad.library.adapter.base.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        try {
            ImageView imageView = (ImageView) eVar.k(q.i.zx);
            if (imageView != null) {
                imageView.setImageDrawable(imageView.getContext().getDrawable(q.h.So));
                imageView.setTag(null);
            }
        } catch (Exception e) {
            nd.a.c("BaseViewHolder ---", e.getMessage());
        }
    }
}
