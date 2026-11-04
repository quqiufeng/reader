package com.zentraedi.comic.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.zentraedi.business.request.Bookmark;
import com.zentraedi.business.utils.v6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class a0 extends com.zentraedi.basic.function.viewmodel.e {

    @fo.k
    private final ObservableField<String> a = new ObservableField<>("");

    @fo.k
    private final ObservableField<String> b = new ObservableField<>(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bL) + " 0.0%");

    @fo.k
    private final ObservableField<Boolean> c;

    @fo.k
    private final ObservableField<Boolean> d;

    @fo.k
    private final ObservableField<String> e;

    @fo.k
    private final ObservableField<String> f;

    @fo.l
    private RecyclerView g;

    @fo.l
    private Function2<? super Integer, ? super String, Unit> h;

    @fo.l
    private Function1<? super Bookmark, Unit> i;

    @fo.k
    private final com.zentraedi.comic.adapter.g j;

    @fo.k
    private final com.zentraedi.comic.adapter.i k;

    public static final class a extends RecyclerView.ItemDecoration {
        a() {
        }

        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            outRect.bottom = com.zentraedi.basic.function.utils.m0.b(12.0f) * (-1);
        }
    }

    public a0() {
        Boolean bool = Boolean.TRUE;
        this.c = new ObservableField<>(bool);
        this.d = new ObservableField<>(bool);
        this.e = new ObservableField<>("");
        this.f = new ObservableField<>("");
        this.j = new com.zentraedi.comic.adapter.g(new Function1() { // from class: com.zentraedi.comic.viewmodel.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.P(this.a, (Bookmark) obj);
            }
        }, new Function1() { // from class: com.zentraedi.comic.viewmodel.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.Q(this.a, (Bookmark) obj);
            }
        });
        this.k = new com.zentraedi.comic.adapter.i(new Function2() { // from class: com.zentraedi.comic.viewmodel.y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return a0.R(this.a, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(a0 a0Var, Bookmark data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Function2<? super Integer, ? super String, Unit> function2 = a0Var.h;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(data.getPosition()), data.getDesc());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(a0 a0Var, Bookmark bookTag) {
        Intrinsics.checkNotNullParameter(bookTag, "bookTag");
        Function1<? super Bookmark, Unit> function1 = a0Var.i;
        if (function1 != null) {
            function1.invoke(bookTag);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(a0 a0Var, int i, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Function2<? super Integer, ? super String, Unit> function2 = a0Var.h;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i), name);
        }
        return Unit.INSTANCE;
    }

    private final void e0(String str, ImageView imageView) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        if (((Activity) context).isFinishing()) {
            return;
        }
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
        if (((Activity) context2).isDestroyed()) {
            return;
        }
        com.bumptech.glide.c.F(imageView.getContext()).u().z1(v6.k(str, false)).r1(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(a0 a0Var, int i) {
        RecyclerView recyclerView = a0Var.g;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(i, com.zentraedi.basic.function.utils.m0.b(100.0f));
        }
    }

    @fo.k
    public final ObservableField<String> S() {
        return this.e;
    }

    @fo.k
    public final com.zentraedi.comic.adapter.g T() {
        return this.j;
    }

    @fo.k
    public final com.zentraedi.comic.adapter.i U() {
        return this.k;
    }

    @fo.k
    public final ObservableField<Boolean> V() {
        return this.c;
    }

    @fo.k
    public final ObservableField<String> W() {
        return this.f;
    }

    @fo.l
    public final Function1<Bookmark, Unit> X() {
        return this.i;
    }

    @fo.l
    public final Function2<Integer, String, Unit> Y() {
        return this.h;
    }

    @fo.l
    public final RecyclerView Z() {
        return this.g;
    }

    @fo.k
    public final ObservableField<String> b0() {
        return this.a;
    }

    @fo.k
    public final ObservableField<String> c0() {
        return this.b;
    }

    public final void changeOrder() {
        ObservableField<Boolean> observableField = this.c;
        Object obj = observableField.get();
        Intrinsics.checkNotNull(obj);
        observableField.set(Boolean.valueOf(!((Boolean) obj).booleanValue()));
        this.k.J();
    }

    @fo.k
    public final ObservableField<Boolean> d0() {
        return this.d;
    }

    public final void f0(int i) {
        RecyclerView recyclerView;
        this.k.K(i);
        final int iF = this.k.F();
        if (iF == -1 || (recyclerView = this.g) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: com.zentraedi.comic.viewmodel.z
            @Override // java.lang.Runnable
            public final void run() {
                a0.g0(this.a, iF);
            }
        });
    }

    public final void h0(@fo.k String pdfThumbPath, @fo.k ImageView imageView) {
        Intrinsics.checkNotNullParameter(pdfThumbPath, "pdfThumbPath");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        e0(pdfThumbPath, imageView);
    }

    public final void i0(@fo.l Function1<? super Bookmark, Unit> function1) {
        this.i = function1;
    }

    public final void j0(@fo.l Function2<? super Integer, ? super String, Unit> function2) {
        this.h = function2;
    }

    public final void k0(@fo.l RecyclerView recyclerView) {
        this.g = recyclerView;
    }

    public final void l0() {
        this.d.set(Boolean.FALSE);
        RecyclerView recyclerView = this.g;
        if (recyclerView != null) {
            recyclerView.removeAllViews();
        }
        RecyclerView recyclerView2 = this.g;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((RecyclerView.Adapter) null);
        }
        RecyclerView recyclerView3 = this.g;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.j);
        }
        this.e.set(com.zentraedi.basic.function.utils.l.f(Integer.valueOf(com.zentraedi.comic.q.C0124q.iM), "total", Integer.valueOf(this.j.getItemCount())));
        this.j.notifyDataSetChanged();
    }

    public final void m0() {
        this.d.set(Boolean.TRUE);
        RecyclerView recyclerView = this.g;
        if (recyclerView != null) {
            recyclerView.removeAllViews();
        }
        RecyclerView recyclerView2 = this.g;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((RecyclerView.Adapter) null);
        }
        RecyclerView recyclerView3 = this.g;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.k);
        }
        this.e.set(com.zentraedi.basic.function.utils.l.f(Integer.valueOf(com.zentraedi.comic.q.C0124q.hM), "total", Integer.valueOf(this.k.getItemCount())));
        this.k.notifyDataSetChanged();
    }

    public final void n0(@fo.l ArrayList<Bookmark> arrayList) {
        if (arrayList != null) {
            this.j.P(arrayList);
        }
    }

    public final void o0(@fo.l List<eg.d> list) {
        if (list != null) {
            this.k.M(list);
            this.j.M(list.size());
            this.e.set(com.zentraedi.basic.function.utils.l.f(Integer.valueOf(com.zentraedi.comic.q.C0124q.hM), "total", Integer.valueOf(list.size())));
        }
    }

    public final void v(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.g = recyclerView;
        recyclerView.setAdapter(this.k);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setAddDuration(0L);
        }
        RecyclerView.ItemAnimator itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.setChangeDuration(0L);
        }
        RecyclerView.ItemAnimator itemAnimator3 = recyclerView.getItemAnimator();
        if (itemAnimator3 != null) {
            itemAnimator3.setMoveDuration(0L);
        }
        RecyclerView.ItemAnimator itemAnimator4 = recyclerView.getItemAnimator();
        if (itemAnimator4 != null) {
            itemAnimator4.setRemoveDuration(0L);
        }
        SimpleItemAnimator itemAnimator5 = recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator5, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        itemAnimator5.setSupportsChangeAnimations(false);
        recyclerView.addItemDecoration(new a());
    }
}
