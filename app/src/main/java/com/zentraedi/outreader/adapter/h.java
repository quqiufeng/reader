package com.zentraedi.outreader.adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.zentraedi.outreader.databinding.a0;
import com.zentraedi.outreader.reader.PDFTronZReader;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class h extends ListAdapter<com.zentraedi.outreader.model.a, com.zentraedi.business.adapter.n<com.zentraedi.outreader.model.a>> {

    @fo.k
    public static final b d = new b(null);

    @fo.k
    private static final a e = new a();

    @fo.l
    private PDFTronZReader a;

    @fo.k
    private Function3<? super com.zentraedi.outreader.model.a, ? super View, ? super Integer, Unit> b;

    @fo.k
    private Function3<? super com.zentraedi.outreader.model.a, ? super Integer, ? super Integer, Unit> c;

    public static final class a extends DiffUtil.ItemCallback<com.zentraedi.outreader.model.a> {
        a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(com.zentraedi.outreader.model.a oldItem, com.zentraedi.outreader.model.a newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(com.zentraedi.outreader.model.a oldItem, com.zentraedi.outreader.model.a newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.e() == newItem.e();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Object getChangePayload(com.zentraedi.outreader.model.a oldItem, com.zentraedi.outreader.model.a newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            Bundle bundle = new Bundle();
            if (bundle.size() == 0) {
                return null;
            }
            return bundle;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public h() {
        super(e);
        this.b = new Function3() { // from class: com.zentraedi.outreader.adapter.f
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return h.M((com.zentraedi.outreader.model.a) obj, (View) obj2, ((Integer) obj3).intValue());
            }
        };
        this.c = new Function3() { // from class: com.zentraedi.outreader.adapter.g
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return h.L((com.zentraedi.outreader.model.a) obj, (Integer) obj2, ((Integer) obj3).intValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(com.zentraedi.outreader.model.a aVar, Integer num, int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(com.zentraedi.outreader.model.a aVar, View view, int i) {
        return Unit.INSTANCE;
    }

    @fo.l
    public final PDFTronZReader F() {
        return this.a;
    }

    @fo.k
    public final Function3<com.zentraedi.outreader.model.a, Integer, Integer, Unit> G() {
        return this.c;
    }

    @fo.k
    public final Function3<com.zentraedi.outreader.model.a, View, Integer, Unit> H() {
        return this.b;
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@fo.k com.zentraedi.business.adapter.n<com.zentraedi.outreader.model.a> holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        holder.o(CollectionsKt.getOrNull(currentList, i), i);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@fo.k com.zentraedi.business.adapter.n<com.zentraedi.outreader.model.a> holder, int i, @fo.k List<Object> payloads) {
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
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public com.zentraedi.business.adapter.n<com.zentraedi.outreader.model.a> onCreateViewHolder(@fo.k ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        c0 c0VarJ = androidx.databinding.m.j(LayoutInflater.from(parent.getContext()), com.zentraedi.outreader.d.l.M6, parent, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.outreader.adapter.viewholder.e eVar = new com.zentraedi.outreader.adapter.viewholder.e((a0) c0VarJ);
        eVar.l(this.b);
        eVar.k(this.c);
        eVar.t(this.a);
        return eVar;
    }

    public final void N(@fo.l PDFTronZReader pDFTronZReader) {
        this.a = pDFTronZReader;
    }

    public final void O(@fo.k Function3<? super com.zentraedi.outreader.model.a, ? super Integer, ? super Integer, Unit> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.c = function3;
    }

    public final void P(@fo.k Function3<? super com.zentraedi.outreader.model.a, ? super View, ? super Integer, Unit> function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.b = function3;
    }

    public int getItemCount() {
        return getCurrentList().size();
    }

    public int getItemViewType(int i) {
        return 0;
    }
}
