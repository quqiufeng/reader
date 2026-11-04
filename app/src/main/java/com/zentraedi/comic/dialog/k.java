package com.zentraedi.comic.dialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.comic.databinding.n0;
import com.zentraedi.comic.model.ComicCodeBook;
import com.zentraedi.comic.model.ComicCodeBookData;
import com.zentraedi.comic.request.ComicCodeBookListRequest;
import com.zentraedi.comic.viewmodel.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicCodeBookDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCodeBookDialog.kt\ncom/zentraedi/comic/dialog/ComicCodeBookDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1#2:105\n1869#3,2:106\n1869#3,2:108\n*S KotlinDebug\n*F\n+ 1 ComicCodeBookDialog.kt\ncom/zentraedi/comic/dialog/ComicCodeBookDialog\n*L\n87#1:106,2\n94#1:108,2\n*E\n"})
public final class k {

    @fo.l
    private n0 a;

    @fo.l
    private com.zentraedi.basic.function.ui.dialog.b b;

    @fo.k
    private final Lazy c = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.dialog.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return k.p();
        }
    });

    @fo.k
    private final ArrayList<b0> d = new ArrayList<>();

    @fo.l
    private Function1<? super ComicCodeBook, Unit> e;

    @fo.l
    private ComicCodeBook f;

    public static final class a extends com.zentraedi.business.http.b<ComicCodeBookData> {
        final /* synthetic */ Function0<Unit> b;

        a(Function0<Unit> function0) {
            this.b = function0;
        }

        public void onResult(ResponseData<ComicCodeBookData> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (resp.isSuccess() && !resp.getData().getList().isEmpty()) {
                k.this.f(resp.getData().getList());
            }
            this.b.invoke();
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
            this.b.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(k kVar, b0 b0Var, ComicCodeBook comic) {
        TextView textView;
        Intrinsics.checkNotNullParameter(comic, "comic");
        kVar.f = comic;
        n0 n0Var = kVar.a;
        if (n0Var != null && (textView = n0Var.F) != null) {
            textView.setEnabled(Intrinsics.areEqual(b0Var.i().get(), Boolean.TRUE));
        }
        for (b0 b0Var2 : kVar.d) {
            if (!Intrinsics.areEqual(b0Var2.f(), comic)) {
                b0Var2.i().set(Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }

    private final com.zentraedi.comic.adapter.l k() {
        return (com.zentraedi.comic.adapter.l) this.c.getValue();
    }

    private final void l() {
        n0 n0Var = this.a;
        if (n0Var != null) {
            n0Var.G.setVisibility(this.d.isEmpty() ? 0 : 8);
        }
        k().U1(this.d);
    }

    private final void m(n0 n0Var) {
        n0Var.H.setAdapter(k());
        n0Var.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.dialog.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.n(this.a, view);
            }
        });
        n0Var.F.setEnabled(false);
        n0Var.F.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.dialog.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.o(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(k kVar, View view) {
        com.zentraedi.basic.function.ui.dialog.b bVar = kVar.b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(k kVar, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        Function1<? super ComicCodeBook, Unit> function1 = kVar.e;
        if (function1 != null) {
            function1.invoke(kVar.f);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar = kVar.b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.adapter.l p() {
        return new com.zentraedi.comic.adapter.l(com.zentraedi.comic.q.l.p8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(k kVar) {
        kVar.l();
        return Unit.INSTANCE;
    }

    public final void f(@fo.k List<ComicCodeBook> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.d.clear();
        for (ComicCodeBook comicCodeBook : list) {
            final b0 b0Var = new b0();
            b0Var.a(comicCodeBook);
            b0Var.k(false);
            b0Var.m(new Function1() { // from class: com.zentraedi.comic.dialog.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k.g(this.a, b0Var, (ComicCodeBook) obj);
                }
            });
            this.d.add(b0Var);
        }
    }

    @fo.k
    public final ArrayList<b0> h() {
        return this.d;
    }

    public final void i(@fo.k Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        com.zentraedi.business.http.a.b().h(new ComicCodeBookListRequest(), new a(callback));
    }

    @fo.l
    public final Function1<ComicCodeBook, Unit> j() {
        return this.e;
    }

    public final void q(@fo.l Function1<? super ComicCodeBook, Unit> function1) {
        this.e = function1;
    }

    public final void r() {
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        if (this.a == null) {
            this.a = (n0) androidx.databinding.m.j(LayoutInflater.from(activityE), com.zentraedi.comic.q.l.S2, (ViewGroup) null, false);
            n0 n0Var = this.a;
            Intrinsics.checkNotNull(n0Var);
            com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(activityE, n0Var.getRoot());
            this.b = bVar;
            bVar.d(80);
            n0 n0Var2 = this.a;
            if (n0Var2 != null) {
                m(n0Var2);
            }
        }
        if (this.d.isEmpty()) {
            i(new Function0() { // from class: com.zentraedi.comic.dialog.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k.s(this.a);
                }
            });
        } else {
            l();
        }
        com.zentraedi.basic.function.ui.dialog.b bVar2 = this.b;
        if (bVar2 != null) {
            bVar2.show();
        }
    }
}
