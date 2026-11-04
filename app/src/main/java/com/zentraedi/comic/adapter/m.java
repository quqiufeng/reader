package com.zentraedi.comic.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.comic.databinding.k2;
import com.zentraedi.comic.databinding.m2;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class m extends com.chad.library.adapter.base.c<com.zentraedi.comic.viewmodel.j0, com.chad.library.adapter.base.e> {
    private boolean V;

    public static final class a extends com.chad.library.adapter.base.util.a<com.zentraedi.comic.viewmodel.j0> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int d(com.zentraedi.comic.viewmodel.j0 item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item.getViewType();
        }
    }

    public m() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: k2, reason: merged with bridge method [inline-methods] */
    public void d0(@fo.k com.chad.library.adapter.base.e helper, @fo.k com.zentraedi.comic.viewmodel.j0 item) {
        m2 m2Var;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int viewType = item.getViewType();
        com.zentraedi.comic.constant.a.InterfaceC0110a.C0111a c0111a = com.zentraedi.comic.constant.a.InterfaceC0110a.hf;
        if (viewType == c0111a.b()) {
            k2 k2Var = (k2) androidx.databinding.m.a(((RecyclerView.ViewHolder) helper).itemView);
            if (k2Var != null) {
                k2Var.C1(item);
            }
        } else if (viewType == c0111a.a() && (m2Var = (m2) androidx.databinding.m.a(((RecyclerView.ViewHolder) helper).itemView)) != null) {
            m2Var.E1(item);
            m2Var.D1(Boolean.valueOf(this.V));
            m2Var.u();
        }
        androidx.databinding.c0 c0VarA = androidx.databinding.m.a(((RecyclerView.ViewHolder) helper).itemView);
        if (c0VarA != null) {
            c0VarA.u();
        }
    }

    public final boolean l2() {
        return this.V;
    }

    public final void m2(boolean z) {
        this.V = z;
    }

    public m(boolean z) {
        super((List) null);
        this.V = z;
        T1(new a());
        com.chad.library.adapter.base.util.a aVarJ0 = J0();
        com.zentraedi.comic.constant.a.InterfaceC0110a.C0111a c0111a = com.zentraedi.comic.constant.a.InterfaceC0110a.hf;
        aVarJ0.f(c0111a.c(), com.zentraedi.comic.q.l.L7).f(c0111a.b(), com.zentraedi.comic.q.l.J7).f(c0111a.a(), com.zentraedi.comic.q.l.K7);
    }

    public /* synthetic */ m(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
