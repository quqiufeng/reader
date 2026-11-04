package com.zentraedi.comic.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.comic.databinding.c3;
import com.zentraedi.comic.viewmodel.Layout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public abstract class b extends RecyclerView.Adapter<c> {

    @fo.k
    private final List<androidx.databinding.a> a = new ArrayList();

    @fo.l
    private Context b;

    @fo.l
    private b0 c;

    public abstract void D(@fo.k Layout layout);

    @fo.l
    public final androidx.databinding.a E(int i) {
        if (i < 0 || i > this.a.size()) {
            return null;
        }
        return this.a.get(i);
    }

    @fo.l
    public final Context F() {
        return this.b;
    }

    @fo.k
    public final List<androidx.databinding.a> G() {
        return this.a;
    }

    @fo.l
    public final b0 H() {
        return this.c;
    }

    @fo.l
    public final View I(@fo.l RecyclerView recyclerView, int i, int i2) {
        c cVar;
        if (recyclerView == null || (cVar = (c) recyclerView.findViewHolderForLayoutPosition(i)) == null) {
            return null;
        }
        return cVar.a(i2);
    }

    @fo.k
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(@fo.k ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.b = parent.getContext();
        c3 c3Var = (c3) androidx.databinding.m.j(LayoutInflater.from(parent.getContext()), com.zentraedi.comic.q.l.S7, parent, false);
        Intrinsics.checkNotNull(c3Var);
        return new c(c3Var);
    }

    public final void K(@fo.l Context context) {
        this.b = context;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void L(@fo.k List<? extends androidx.databinding.a> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.a.clear();
        this.a.addAll(dataList);
        notifyDataSetChanged();
    }

    public final void M(@fo.l b0 b0Var) {
        this.c = b0Var;
    }

    public int getItemCount() {
        return this.a.size();
    }
}
