package com.zentraedi.comic.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.comic.activity.ComicReaderActivity;
import com.zentraedi.comic.databinding.y2;
import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.PageOver;
import com.zentraedi.comic.viewmodel.ReadSetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nBaseComicAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseComicAdapter.kt\ncom/zentraedi/comic/adapter/BaseComicAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1869#2,2:108\n*S KotlinDebug\n*F\n+ 1 BaseComicAdapter.kt\ncom/zentraedi/comic/adapter/BaseComicAdapter\n*L\n50#1:108,2\n*E\n"})
public abstract class a extends RecyclerView.Adapter<d> {

    @fo.k
    private Layout a = Layout.COMMON;

    @fo.k
    private PageOver b = PageOver.NO;

    @fo.k
    private final HashMap<Integer, String> c = new HashMap<>();

    @fo.k
    private final List<androidx.databinding.a> d = new ArrayList();

    @fo.l
    private Context e;

    public abstract void D(@fo.k Layout layout);

    @fo.l
    public final androidx.databinding.a E(int i) {
        if (i < 0 || i >= this.d.size()) {
            return null;
        }
        return this.d.get(i);
    }

    @fo.l
    public final Context F() {
        return this.e;
    }

    @fo.k
    public final List<androidx.databinding.a> G() {
        return this.d;
    }

    @fo.k
    public final Layout H() {
        return this.a;
    }

    @fo.k
    public final PageOver I() {
        return this.b;
    }

    @fo.l
    public abstract ReadSetting J();

    @fo.k
    public final HashMap<Integer, String> K() {
        return this.c;
    }

    public abstract float L();

    @fo.l
    public final View M(@fo.l RecyclerView recyclerView, int i, int i2) {
        d dVar;
        if (recyclerView == null || (dVar = (d) recyclerView.findViewHolderForLayoutPosition(i)) == null) {
            return null;
        }
        return dVar.a(i2);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void N(@fo.k List<? extends androidx.databinding.a> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.d.clear();
        this.c.clear();
        if (this.a == Layout.SINGLE) {
            for (androidx.databinding.a aVar : dataList) {
                this.d.add(aVar);
                this.d.add(aVar);
            }
        } else {
            this.d.addAll(dataList);
        }
        nd.a.a(ComicReaderActivity.D5, " init mDataList" + this.d.size());
        notifyDataSetChanged();
    }

    @fo.k
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(@fo.k ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.e = parent.getContext();
        y2 y2Var = (y2) androidx.databinding.m.j(LayoutInflater.from(parent.getContext()), com.zentraedi.comic.q.l.Q7, parent, false);
        Intrinsics.checkNotNull(y2Var);
        return new d(y2Var);
    }

    public void P(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }

    public void Q() {
    }

    public final void R(@fo.l Context context) {
        this.e = context;
    }

    public final void S(@fo.k Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "<set-?>");
        this.a = layout;
    }

    public final void T(@fo.k PageOver value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.b = value;
        notifyDataSetChanged();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void U(@fo.k List<? extends androidx.databinding.a> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.d.clear();
        this.c.clear();
        this.d.addAll(dataList);
        nd.a.a(ComicReaderActivity.D5, " setNewData mDataList" + this.d.size());
        notifyDataSetChanged();
    }

    public abstract void V(@fo.l ReadSetting readSetting);

    public abstract void W(float f);

    public int getItemCount() {
        Layout layout = this.a;
        return (layout == Layout.DOUBLE || layout == Layout.DOUBLE_REVERSAL) ? (this.d.size() / 2) + (this.d.size() % 2) : this.d.size();
    }
}
