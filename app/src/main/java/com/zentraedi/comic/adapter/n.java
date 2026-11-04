package com.zentraedi.comic.adapter;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.comic.databinding.e3;
import com.zentraedi.comic.databinding.m3;
import com.zentraedi.comic.databinding.o3;
import com.zentraedi.comic.databinding.t4;
import com.zentraedi.comic.databinding.u2;
import com.zentraedi.comic.databinding.w2;
import com.zentraedi.comic.viewmodel.c3;
import com.zentraedi.comic.viewmodel.i6;
import com.zentraedi.comic.viewmodel.j6;
import com.zentraedi.comic.viewmodel.m0;
import com.zentraedi.comic.viewmodel.r3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class n extends com.chad.library.adapter.base.c<com.zentraedi.basic.function.viewmodel.f<?>, com.chad.library.adapter.base.e> {

    @fo.l
    private c3 V;

    public static final class a extends com.chad.library.adapter.base.util.a<com.zentraedi.basic.function.viewmodel.f<?>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int d(com.zentraedi.basic.function.viewmodel.f<?> item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item.getViewType();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k2, reason: merged with bridge method [inline-methods] */
    public void d0(@fo.k com.chad.library.adapter.base.e helper, @fo.k com.zentraedi.basic.function.viewmodel.f<?> item) {
        t4 t4Var;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int viewType = item.getViewType();
        com.zentraedi.comic.constant.a.b.C0112a c0112a = com.zentraedi.comic.constant.a.b.f9if;
        if (viewType == c0112a.f()) {
            w2 w2Var = (w2) androidx.databinding.m.a(((RecyclerView.ViewHolder) helper).itemView);
            if (w2Var != null) {
                j6 j6Var = (j6) item;
                w2Var.C1(j6Var);
                int iA = com.zentraedi.basic.function.utils.k0.a(w2Var.E.getContext(), 15);
                int iA2 = com.zentraedi.basic.function.utils.k0.a(w2Var.E.getContext(), 22);
                com.zentraedi.basic.function.utils.k0.a(w2Var.E.getContext(), 25);
                TextView textView = w2Var.E;
                if (j6Var.N()) {
                    iA2 = com.zentraedi.basic.function.utils.k0.a(w2Var.E.getContext(), 13);
                }
                textView.setPadding(iA, 0, iA, iA2);
            }
        } else if (viewType == c0112a.e()) {
            o3 o3Var = (o3) androidx.databinding.m.a(((RecyclerView.ViewHolder) helper).itemView);
            if (o3Var != null) {
                o3Var.E1((i6) item);
            }
        } else if (viewType == c0112a.d()) {
            m3 m3Var = (m3) androidx.databinding.m.a(((RecyclerView.ViewHolder) helper).itemView);
            if (m3Var != null) {
                m3Var.E1((i6) item);
            }
        } else if (viewType == c0112a.b()) {
            u2 u2Var = (u2) androidx.databinding.m.a(((RecyclerView.ViewHolder) helper).itemView);
            if (u2Var != null) {
                u2Var.C1((m0) item);
            }
        } else if (viewType == c0112a.c()) {
            e3 e3Var = (e3) androidx.databinding.m.a(((RecyclerView.ViewHolder) helper).itemView);
            if (e3Var != null) {
                e3Var.C1((r3) item);
            }
        } else if (viewType == c0112a.a() && (t4Var = (t4) androidx.databinding.m.a(((RecyclerView.ViewHolder) helper).itemView)) != null) {
            t4Var.C1(this.V);
        }
        androidx.databinding.c0 c0VarA = androidx.databinding.m.a(((RecyclerView.ViewHolder) helper).itemView);
        if (c0VarA != null) {
            c0VarA.u();
        }
    }

    @fo.l
    public final c3 l2() {
        return this.V;
    }

    public final void m2(@fo.l c3 c3Var) {
        this.V = c3Var;
    }

    public n(@fo.l c3 c3Var) {
        super((List) null);
        this.V = c3Var;
        T1(new a());
        com.chad.library.adapter.base.util.a aVarJ0 = J0();
        com.zentraedi.comic.constant.a.b.C0112a c0112a = com.zentraedi.comic.constant.a.b.f9if;
        aVarJ0.f(c0112a.f(), com.zentraedi.comic.q.l.P7).f(c0112a.e(), com.zentraedi.comic.q.l.Y7).f(c0112a.d(), com.zentraedi.comic.q.l.X7).f(c0112a.b(), com.zentraedi.comic.q.l.O7).f(c0112a.c(), com.zentraedi.comic.q.l.T7).f(c0112a.a(), com.zentraedi.comic.q.l.ca);
    }

    public /* synthetic */ n(c3 c3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c3Var);
    }
}
