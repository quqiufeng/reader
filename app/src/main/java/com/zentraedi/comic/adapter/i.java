package com.zentraedi.comic.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nChapterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChapterAdapter.kt\ncom/zentraedi/comic/adapter/ChapterAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1869#2,2:100\n774#2:102\n865#2,2:103\n388#2,7:105\n360#2,7:112\n360#2,7:119\n*S KotlinDebug\n*F\n+ 1 ChapterAdapter.kt\ncom/zentraedi/comic/adapter/ChapterAdapter\n*L\n71#1:100,2\n75#1:102\n75#1:103,2\n84#1:105,7\n86#1:112,7\n89#1:119,7\n*E\n"})
public final class i extends RecyclerView.Adapter<a> {

    @fo.k
    private Function2<? super Integer, ? super String, Unit> a;

    @fo.k
    private final ArrayList<eg.d> b;

    @fo.l
    private eg.d c;
    private int d;

    public static final class a extends RecyclerView.ViewHolder {
        private final TextView a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@fo.k View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.a = (TextView) itemView.findViewById(com.zentraedi.comic.q.i.WS);
        }

        public final TextView a() {
            return this.a;
        }
    }

    public i(@fo.k Function2<? super Integer, ? super String, Unit> itemOnClickListener) {
        Intrinsics.checkNotNullParameter(itemOnClickListener, "itemOnClickListener");
        this.a = itemOnClickListener;
        this.b = new ArrayList<>();
        this.d = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(i iVar, eg.d dVar, View view) {
        eg.d dVar2 = iVar.c;
        if (dVar2 != null) {
            dVar2.k(false);
        }
        dVar.k(true);
        iVar.notifyDataSetChanged();
        iVar.a.invoke(Integer.valueOf(dVar.i() - 1), dVar.j());
    }

    @fo.k
    public final Function2<Integer, String, Unit> E() {
        return this.a;
    }

    public final int F() {
        return this.d;
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@fo.k a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ArrayList<eg.d> arrayList = this.b;
        Intrinsics.checkNotNull(arrayList);
        eg.d dVar = arrayList.get(i);
        Intrinsics.checkNotNullExpressionValue(dVar, "get(...)");
        final eg.d dVar2 = dVar;
        if (dVar2.g()) {
            this.c = dVar2;
            holder.a().setTextColor(holder.a().getContext().getResources().getColor(com.zentraedi.comic.q.f.n4));
        } else {
            holder.a().setTextColor(holder.a().getContext().getResources().getColor(com.zentraedi.comic.q.f.f416qd));
        }
        holder.a().setText(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.OK, dVar2.j()));
        ((RecyclerView.ViewHolder) holder).itemView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.adapter.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.H(this.a, dVar2, view);
            }
        });
    }

    @fo.k
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@fo.k ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(com.zentraedi.comic.q.l.H7, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new a(viewInflate);
    }

    public final void J() {
        CollectionsKt.reverse(this.b);
        notifyDataSetChanged();
    }

    public final void K(int i) {
        int i2;
        int iNextIndex;
        Iterator<T> it = this.b.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            } else {
                ((eg.d) it.next()).k(false);
            }
        }
        ArrayList<eg.d> arrayList = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((eg.d) obj).i() - i >= 0) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int i3 = -1;
        if (arrayList2.size() == 1) {
            ((eg.d) arrayList2.get(0)).k(true);
        } else if (((eg.d) arrayList2.get(0)).i() > ((eg.d) arrayList2.get(1)).i()) {
            ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((eg.d) listIterator.previous()).i() >= i) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            ((eg.d) arrayList2.get(iNextIndex)).k(true);
        } else {
            Iterator it2 = arrayList2.iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i4 = -1;
                    break;
                } else if (((eg.d) it2.next()).i() >= i) {
                    break;
                } else {
                    i4++;
                }
            }
            ((eg.d) arrayList2.get(i4)).k(true);
        }
        Iterator<eg.d> it3 = this.b.iterator();
        while (it3.hasNext()) {
            if (it3.next().g()) {
                i3 = i2;
                break;
            }
            i2++;
        }
        this.d = i3;
        notifyDataSetChanged();
    }

    public final void L(@fo.k Function2<? super Integer, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.a = function2;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void M(@fo.k List<eg.d> pdfChapterModelList) {
        Intrinsics.checkNotNullParameter(pdfChapterModelList, "pdfChapterModelList");
        this.b.clear();
        this.b.addAll(pdfChapterModelList);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        ArrayList<eg.d> arrayList = this.b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
