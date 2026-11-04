package com.zentraedi.comic.business;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.databinding.ObservableField;
import com.zentraedi.business.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class z1 {
    public ObservableField<Drawable> a;
    public ObservableField<String> b;
    public ObservableField<String> c;

    @fo.l
    private a d;
    private boolean e = true;
    private int f = 7;

    public interface a {
        void a();
    }

    private final void i() {
        if (Intrinsics.areEqual("name", g().get())) {
            if (Intrinsics.areEqual("asc", e().get())) {
                h().set(com.zentraedi.basic.function.utils.a.g(R.drawable.iA));
                return;
            } else {
                h().set(com.zentraedi.basic.function.utils.a.g(R.drawable.eA));
                return;
            }
        }
        if (Intrinsics.areEqual("ctime", g().get())) {
            if (Intrinsics.areEqual("asc", e().get())) {
                h().set(com.zentraedi.basic.function.utils.a.g(R.drawable.iA));
            } else {
                h().set(com.zentraedi.basic.function.utils.a.g(R.drawable.eA));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(z1 z1Var, int i, String sort, boolean z) {
        Intrinsics.checkNotNullParameter(sort, "sort");
        z1Var.g().set(sort);
        z1Var.e().set(z ? "asc" : "desc");
        if (z1Var.e && i == 7) {
            com.zentraedi.comic.util.h hVar = com.zentraedi.comic.util.h.a;
            hVar.j(sort);
            hVar.i(z ? "asc" : "desc");
        }
        z1Var.i();
        a aVar = z1Var.d;
        if (aVar != null) {
            aVar.a();
        }
        return Unit.INSTANCE;
    }

    public final void b(@fo.k ObservableField<String> sortBy, @fo.k ObservableField<String> order, @fo.k ObservableField<Drawable> sortDrawable, int i) {
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(sortDrawable, "sortDrawable");
        n(sortBy);
        l(order);
        String str = Intrinsics.areEqual(order.get(), "asc") ? "desc" : "asc";
        e().set(str);
        if (i == 7) {
            com.zentraedi.comic.util.h.a.i(str);
        }
        o(sortDrawable);
        i();
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final int c() {
        return this.f;
    }

    @fo.l
    public final a d() {
        return this.d;
    }

    @fo.k
    public final ObservableField<String> e() {
        ObservableField<String> observableField = this.c;
        if (observableField != null) {
            return observableField;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOrder");
        return null;
    }

    public final boolean f() {
        return this.e;
    }

    @fo.k
    public final ObservableField<String> g() {
        ObservableField<String> observableField = this.b;
        if (observableField != null) {
            return observableField;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSortBy");
        return null;
    }

    @fo.k
    public final ObservableField<Drawable> h() {
        ObservableField<Drawable> observableField = this.a;
        if (observableField != null) {
            return observableField;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSortDrawable");
        return null;
    }

    public final void j(int i) {
        this.f = i;
    }

    public final void k(@fo.l a aVar) {
        this.d = aVar;
    }

    public final void l(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.c = observableField;
    }

    public final void m(boolean z) {
        this.e = z;
    }

    public final void n(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.b = observableField;
    }

    public final void o(@fo.k ObservableField<Drawable> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.a = observableField;
    }

    @fo.l
    public final com.zentraedi.business.dialog.e0 p(@fo.l View view, @fo.k ObservableField<String> sortBy, @fo.k ObservableField<String> order, @fo.k ObservableField<Drawable> sortDrawable, boolean z, final int i) {
        Context context;
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(sortDrawable, "sortDrawable");
        n(sortBy);
        l(order);
        o(sortDrawable);
        this.e = z;
        this.f = i;
        if (view == null || (context = view.getContext()) == null) {
            return null;
        }
        com.zentraedi.business.dialog.e0 e0Var = new com.zentraedi.business.dialog.e0(context);
        if (i == 7) {
            String strN = com.zentraedi.basic.function.utils.a.n(R.string.nz2);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            String strN2 = com.zentraedi.basic.function.utils.a.n(R.string.oz2);
            Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
            e0Var.g("ctime", strN, strN2);
            String strN3 = com.zentraedi.basic.function.utils.a.n(R.string.xy3);
            Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
            String strN4 = com.zentraedi.basic.function.utils.a.n(R.string.ly3);
            Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
            e0Var.g("name", strN3, strN4);
        } else if (i == 9) {
            String strN5 = com.zentraedi.basic.function.utils.a.n(R.string.xy3);
            Intrinsics.checkNotNullExpressionValue(strN5, "getString(...)");
            String strN6 = com.zentraedi.basic.function.utils.a.n(R.string.ly3);
            Intrinsics.checkNotNullExpressionValue(strN6, "getString(...)");
            e0Var.g("name", strN5, strN6);
        }
        String str = (String) g().get();
        e0Var.j(str != null ? str : "name", Intrinsics.areEqual(e().get(), "asc"), new Function2() { // from class: com.zentraedi.comic.business.y1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return z1.q(this.a, i, (String) obj, ((Boolean) obj2).booleanValue());
            }
        });
        return e0Var;
    }
}
