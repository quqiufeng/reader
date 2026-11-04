package com.zentraedi.comic.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.business.request.Bookmark;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class g extends RecyclerView.Adapter<a> {

    @fo.k
    private Function1<? super Bookmark, Unit> a;

    @fo.k
    private Function1<? super Bookmark, Unit> b;

    @fo.l
    private ArrayList<Bookmark> c;
    private int d;

    public static final class a extends RecyclerView.ViewHolder {
        private final TextView a;
        private final TextView b;
        private final ImageView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@fo.k View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.a = (TextView) itemView.findViewById(com.zentraedi.comic.q.i.RP);
            this.b = (TextView) itemView.findViewById(com.zentraedi.comic.q.i.LR);
            this.c = (ImageView) itemView.findViewById(com.zentraedi.comic.q.i.Ck);
        }

        public final ImageView a() {
            return this.c;
        }

        public final TextView b() {
            return this.a;
        }

        public final TextView c() {
            return this.b;
        }
    }

    public g(@fo.k Function1<? super Bookmark, Unit> itemOnClickListener, @fo.k Function1<? super Bookmark, Unit> itemDeleteOnClickListener) {
        Intrinsics.checkNotNullParameter(itemOnClickListener, "itemOnClickListener");
        Intrinsics.checkNotNullParameter(itemDeleteOnClickListener, "itemDeleteOnClickListener");
        this.a = itemOnClickListener;
        this.b = itemDeleteOnClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Bookmark bookmark, g gVar, View view) {
        if (bookmark == null) {
            return;
        }
        gVar.b.invoke(bookmark);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(Bookmark bookmark, g gVar, View view) {
        if (bookmark == null) {
            return;
        }
        gVar.a.invoke(bookmark);
    }

    public final int F() {
        return this.d;
    }

    @fo.k
    public final Function1<Bookmark, Unit> G() {
        return this.b;
    }

    @fo.k
    public final Function1<Bookmark, Unit> H() {
        return this.a;
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@fo.k a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ArrayList<Bookmark> arrayList = this.c;
        final Bookmark bookmark = arrayList != null ? arrayList.get(i) : null;
        holder.b().setText(bookmark != null ? bookmark.getDesc() : null);
        TextView textViewC = holder.c();
        StringBuilder sb = new StringBuilder();
        sb.append(bookmark != null ? bookmark.getPosition() + 1 : 0);
        sb.append('/');
        sb.append(this.d);
        textViewC.setText(sb.toString());
        holder.a().setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.adapter.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.J(bookmark, this, view);
            }
        });
        ((RecyclerView.ViewHolder) holder).itemView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.adapter.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.K(bookmark, this, view);
            }
        });
    }

    @fo.k
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@fo.k ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(com.zentraedi.comic.q.l.F7, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new a(viewInflate);
    }

    public final void M(int i) {
        this.d = i;
    }

    public final void N(@fo.k Function1<? super Bookmark, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.b = function1;
    }

    public final void O(@fo.k Function1<? super Bookmark, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.a = function1;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void P(@fo.k ArrayList<Bookmark> pdfChapterModelList) {
        Intrinsics.checkNotNullParameter(pdfChapterModelList, "pdfChapterModelList");
        this.c = pdfChapterModelList;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        ArrayList<Bookmark> arrayList = this.c;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
