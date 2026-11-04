package com.zentraedi.comic.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.comic.databinding.f2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class k extends com.chad.library.adapter.base.c<ComicCategory, com.chad.library.adapter.base.e> {
    public k() {
        super(com.zentraedi.comic.q.l.G7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: k2, reason: merged with bridge method [inline-methods] */
    public void d0(@fo.k com.chad.library.adapter.base.e helper, @fo.l ComicCategory comicCategory) {
        String dirs;
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(helper, "helper");
        f2 f2Var = (f2) androidx.databinding.m.a(((RecyclerView.ViewHolder) helper).itemView);
        if (f2Var != null) {
            f2Var.E.setText(com.zentraedi.basic.function.utils.l.f(Integer.valueOf(com.zentraedi.comic.q.C0124q.tH), "num", Integer.valueOf((comicCategory == null || (dirs = comicCategory.getDirs()) == null || (intOrNull = StringsKt.toIntOrNull(dirs)) == null) ? 0 : intOrNull.intValue())));
            f2Var.F.setText(comicCategory != null ? comicCategory.getName() : null);
            f2Var.u();
        }
    }
}
