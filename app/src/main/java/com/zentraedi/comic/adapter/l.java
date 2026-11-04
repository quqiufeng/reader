package com.zentraedi.comic.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.comic.databinding.i2;
import com.zentraedi.comic.databinding.s3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class l extends com.chad.library.adapter.base.c<com.zentraedi.comic.viewmodel.b0, com.chad.library.adapter.base.e> {
    private final int V;

    public l() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: k2, reason: merged with bridge method [inline-methods] */
    public void d0(@fo.k com.chad.library.adapter.base.e helper, @fo.k com.zentraedi.comic.viewmodel.b0 item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.V == com.zentraedi.comic.q.l.p8) {
            s3 s3Var = (s3) androidx.databinding.m.a(((RecyclerView.ViewHolder) helper).itemView);
            if (s3Var != null) {
                s3Var.C1(item);
                s3Var.u();
                return;
            }
            return;
        }
        i2 i2Var = (i2) androidx.databinding.m.a(((RecyclerView.ViewHolder) helper).itemView);
        if (i2Var != null) {
            i2Var.C1(item);
            i2Var.u();
        }
    }

    public final int l2() {
        return this.V;
    }

    public l(int i) {
        super(i);
        this.V = i;
    }

    public /* synthetic */ l(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? com.zentraedi.comic.q.l.I7 : i);
    }
}
