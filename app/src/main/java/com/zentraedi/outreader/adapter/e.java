package com.zentraedi.outreader.adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.zentraedi.outreader.databinding.y;
import com.zentraedi.outreader.model.BookMarkModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class e extends ListAdapter<BookMarkModel, com.zentraedi.business.adapter.n<BookMarkModel>> {

    @fo.k
    public static final b c = new b(null);

    @fo.k
    private static final a d = new a();

    @fo.k
    private Function3<? super BookMarkModel, ? super View, ? super Integer, Unit> a;

    @fo.k
    private Function3<? super BookMarkModel, ? super Integer, ? super Integer, Unit> b;

    public static final class a extends DiffUtil.ItemCallback<BookMarkModel> {
        a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(BookMarkModel oldItem, BookMarkModel newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(BookMarkModel oldItem, BookMarkModel newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getBookmark_id(), newItem.getBookmark_id());
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public e() {
        super(d);
        this.a = new Function3() { // from class: com.zentraedi.outreader.adapter.c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return e.L((BookMarkModel) obj, (View) obj2, ((Integer) obj3).intValue());
            }
        };
        this.b = new Function3() { // from class: com.zentraedi.outreader.adapter.d
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return e.K((BookMarkModel) obj, (Integer) obj2, ((Integer) obj3).intValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(BookMarkModel bookMarkModel, Integer num, int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(BookMarkModel bookMarkModel, View view, int i) {
        return Unit.INSTANCE;
    }

    @fo.k
    public final Function3<BookMarkModel, Integer, Integer, Unit> F() {
        return this.b;
    }

    @fo.k
    public final Function3<BookMarkModel, View, Integer, Unit> G() {
        return this.a;
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@fo.k com.zentraedi.business.adapter.n<BookMarkModel> holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        holder.o(CollectionsKt.getOrNull(currentList, i), i);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@fo.k com.zentraedi.business.adapter.n<BookMarkModel> holder, int i, @fo.k List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = payloads.get(0);
        Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
        List currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        holder.n(bundle, CollectionsKt.getOrNull(currentList, i), i);
    }

    @fo.k
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public com.zentraedi.business.adapter.n<BookMarkModel> onCreateViewHolder(@fo.k ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        c0 c0VarJ = androidx.databinding.m.j(LayoutInflater.from(parent.getContext()), com.zentraedi.outreader.d.l.L6, parent, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.outreader.adapter.viewholder.c cVar = new com.zentraedi.outreader.adapter.viewholder.c((y) c0VarJ);
        cVar.l(this.a);
        cVar.k(this.b);
        return cVar;
    }

    public final void M(@fo.k Function3<? super BookMarkModel, ? super Integer, ? super Integer, Unit> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.b = function3;
    }

    public final void N(@fo.k Function3<? super BookMarkModel, ? super View, ? super Integer, Unit> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.a = function3;
    }

    public int getItemCount() {
        return getCurrentList().size();
    }

    public int getItemViewType(int i) {
        return 0;
    }
}
