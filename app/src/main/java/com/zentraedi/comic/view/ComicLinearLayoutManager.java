package com.zentraedi.comic.view;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.comic.viewmodel.ReadModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicLinearLayoutManager extends LinearLayoutManager {

    @fo.k
    private final e0 a;
    private final int b;

    @fo.l
    private ReadModel c;
    private int d;
    private int e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComicLinearLayoutManager(@fo.k Context context, int i, boolean z, @fo.k e0 recyclerView) {
        super(context, i, z);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.a = recyclerView;
        this.b = 1;
        this.d = -1;
    }

    protected int getExtraLayoutSpace(@fo.l RecyclerView.State state) {
        return k0.l() * 2;
    }

    @fo.l
    public final ReadModel o() {
        return this.c;
    }

    public final int p() {
        return this.d;
    }

    @fo.k
    public final e0 q() {
        return this.a;
    }

    public final int r() {
        return this.e;
    }

    public final int s() {
        return this.f;
    }

    public final void t(@fo.l ReadModel readModel) {
        this.c = readModel;
    }

    public final void u(int i) {
        this.d = i;
    }

    public final void v(int i) {
        this.e = i;
    }

    public final void w(int i) {
        this.f = i;
    }
}
