package com.zentraedi.comic.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.comic.databinding.k3;
import com.zentraedi.comic.viewmodel.a5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class p extends com.chad.library.adapter.base.c<a5, com.chad.library.adapter.base.e> {
    public p() {
        super(com.zentraedi.comic.q.l.W7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: k2, reason: merged with bridge method [inline-methods] */
    public void d0(@fo.k com.chad.library.adapter.base.e helper, @fo.l a5 a5Var) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        k3 k3Var = (k3) androidx.databinding.m.a(((RecyclerView.ViewHolder) helper).itemView);
        if (k3Var != null) {
            k3Var.C1(a5Var);
        }
        if (k3Var != null) {
            k3Var.u();
        }
    }
}
