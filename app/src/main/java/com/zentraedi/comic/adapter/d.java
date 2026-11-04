package com.zentraedi.comic.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.comic.databinding.y2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class d extends RecyclerView.ViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@fo.k y2 viewBinding) {
        super(viewBinding.getRoot());
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
    }

    @fo.l
    public final View a(int i) {
        return ((RecyclerView.ViewHolder) this).itemView.findViewById(i);
    }
}
