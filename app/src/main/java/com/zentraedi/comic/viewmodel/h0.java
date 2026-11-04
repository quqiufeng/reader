package com.zentraedi.comic.viewmodel;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.model.BaseBottomDialogModel;
import com.zentraedi.business.model.BaseBottomDialogViewModel;
import com.zentraedi.comic.model.ComicCodeBook;
import com.zentraedi.comic.model.ComicCodeBookData;
import com.zentraedi.comic.request.ComicCodeBookListRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicCodeBookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCodeBookViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCodeBookViewModel\n+ 2 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n13#2:220\n13#2:231\n1869#3,2:221\n1869#3,2:223\n1869#3,2:225\n1869#3,2:227\n1869#3,2:229\n*S KotlinDebug\n*F\n+ 1 ComicCodeBookViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCodeBookViewModel\n*L\n46#1:220\n185#1:231\n54#1:221,2\n64#1:223,2\n79#1:225,2\n92#1:227,2\n123#1:229,2\n*E\n"})
public final class h0 extends com.zentraedi.basic.function.viewmodel.d {

    @fo.k
    private final ObservableField<Boolean> B = new ObservableField<>(Boolean.TRUE);

    @fo.k
    private final ObservableField<Boolean> C;

    @fo.k
    private final ObservableField<Boolean> D;

    @fo.k
    private final ObservableField<String> E;

    @fo.k
    private final ObservableField<String> F;

    @fo.k
    private final ObservableField<String> G;

    @fo.k
    private final Lazy H;

    @fo.k
    private final List<b0> I;

    @fo.k
    private final List<ComicCodeBook> J;

    @fo.k
    private final com.zentraedi.comic.adapter.l K;

    @fo.l
    private com.zentraedi.business.dialog.c L;

    @fo.k
    private final List<BaseBottomDialogModel> M;

    @fo.k
    private final Lazy N;

    @SourceDebugExtension({"SMAP\nComicCodeBookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCodeBookViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCodeBookViewModel$deleteSelect$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n1869#2,2:220\n*S KotlinDebug\n*F\n+ 1 ComicCodeBookViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCodeBookViewModel$deleteSelect$1\n*L\n165#1:220,2\n*E\n"})
    public static final class a implements com.zentraedi.business.utils.n4.j {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(h0 h0Var) {
            h0Var.L0();
            h0Var.U0();
            return Unit.INSTANCE;
        }

        public void confirmClick() {
            Iterator it = h0.this.J.iterator();
            String str = "";
            while (it.hasNext()) {
                str = str + ((ComicCodeBook) it.next()).getId() + ',';
            }
            h0.this.W0().Q(StringsKt.removeSuffix(str, ","));
            k0 k0VarW0 = h0.this.W0();
            final h0 h0Var = h0.this;
            k0VarW0.d0(new Function0() { // from class: com.zentraedi.comic.viewmodel.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h0.a.b(h0Var);
                }
            });
        }
    }

    public static final class b extends com.zentraedi.business.http.b<ComicCodeBookData> {
        b() {
        }

        public void onResult(ResponseData<ComicCodeBookData> resp) {
            List<ComicCodeBook> list;
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess() || (list = resp.getData().getList()) == null || list.isEmpty()) {
                h0.this.getShowEmpty().set(Boolean.TRUE);
            } else {
                h0.this.K.U1(h0.this.O0(resp.getData().getList()));
                h0.this.getShowEmpty().set(Boolean.FALSE);
            }
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class c implements Function0<BaseBottomDialogViewModel> {
        final /* synthetic */ androidx.lifecycle.r2 a;

        public c(androidx.lifecycle.r2 r2Var) {
            this.a = r2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseBottomDialogViewModel invoke() {
            return new androidx.lifecycle.m2(this.a).c(BaseBottomDialogViewModel.class);
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class d implements Function0<k0> {
        final /* synthetic */ androidx.lifecycle.r2 a;

        public d(androidx.lifecycle.r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.k0] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return new androidx.lifecycle.m2(this.a).c(k0.class);
        }
    }

    public h0() {
        Boolean bool = Boolean.FALSE;
        this.C = new ObservableField<>(bool);
        this.D = new ObservableField<>(bool);
        this.E = new ObservableField<>(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dB));
        this.F = new ObservableField<>(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.Wt0, "0"));
        this.G = new ObservableField<>("");
        this.H = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h0.a1();
            }
        });
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new com.zentraedi.comic.adapter.l(0, 1, null);
        this.M = new ArrayList();
        AppCompatActivity appCompatActivityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNull(appCompatActivityE, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        this.N = LazyKt.lazy(new d(appCompatActivityE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P0(h0 h0Var, ComicCodeBook comic) {
        Intrinsics.checkNotNullParameter(comic, "comic");
        if (h0Var.J.contains(comic)) {
            h0Var.J.remove(comic);
        } else {
            h0Var.J.add(comic);
        }
        h0Var.D.set(Boolean.valueOf(h0Var.J.size() > 0));
        if (h0Var.J.size() == h0Var.I.size()) {
            h0Var.E.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dy));
        } else {
            h0Var.E.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dB));
        }
        h0Var.F.set(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.Wt0, Integer.valueOf(h0Var.J.size())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q0(h0 h0Var, Context context, ComicCodeBook comicCodeBook) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (comicCodeBook != null) {
            h0Var.b1(context, comicCodeBook);
        }
        return Unit.INSTANCE;
    }

    private final com.zentraedi.comic.dialog.c V0() {
        return (com.zentraedi.comic.dialog.c) this.H.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k0 W0() {
        return (k0) this.N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.dialog.c a1() {
        return new com.zentraedi.comic.dialog.c();
    }

    private final void b1(Context context, final ComicCodeBook comicCodeBook) {
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) context;
        Lazy lazy = LazyKt.lazy(new c(appCompatActivity));
        c1(lazy).getMTitle().set(comicCodeBook.getTitle());
        c1(lazy).getMSubTitle().set(comicCodeBook.getSecret());
        com.zentraedi.business.dialog.c cVar = new com.zentraedi.business.dialog.c(appCompatActivity, new Function1() { // from class: com.zentraedi.comic.viewmodel.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h0.d1(this.a, comicCodeBook, (BaseBottomDialogModel) obj);
            }
        });
        this.L = cVar;
        cVar.show();
    }

    private static final BaseBottomDialogViewModel c1(Lazy<BaseBottomDialogViewModel> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d1(h0 h0Var, ComicCodeBook comicCodeBook, BaseBottomDialogModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String itemDes = it.getItemDes();
        if (Intrinsics.areEqual(itemDes, com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.xy))) {
            h0Var.V0().k(comicCodeBook);
        } else if (Intrinsics.areEqual(itemDes, com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Xx))) {
            h0Var.V0().j(comicCodeBook);
        }
        return Unit.INSTANCE;
    }

    public final void J0() {
        V0().e();
    }

    public final void K0(@fo.k RecyclerView contentRv) {
        Intrinsics.checkNotNullParameter(contentRv, "contentRv");
        contentRv.setLayoutManager(new LinearLayoutManager(contentRv.getContext()));
        contentRv.setAdapter(this.K);
    }

    public final void L0() {
        this.C.set(Boolean.FALSE);
        this.J.clear();
        for (b0 b0Var : this.I) {
            ObservableField<Boolean> observableFieldI = b0Var.i();
            Boolean bool = Boolean.FALSE;
            observableFieldI.set(bool);
            b0Var.h().set(bool);
        }
        this.E.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dB));
        this.F.set(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.Wt0, "0"));
        this.K.notifyDataSetChanged();
    }

    public final void M0() {
        this.C.set(Boolean.TRUE);
        for (b0 b0Var : this.I) {
            b0Var.i().set(Boolean.FALSE);
            b0Var.h().set(Boolean.TRUE);
        }
        this.K.notifyDataSetChanged();
    }

    public final void N0() {
        if (Intrinsics.areEqual(this.E.get(), com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dB))) {
            this.E.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dy));
            this.J.clear();
            this.D.set(Boolean.FALSE);
            for (b0 b0Var : this.I) {
                ObservableField<Boolean> observableFieldI = b0Var.i();
                Boolean bool = Boolean.TRUE;
                observableFieldI.set(bool);
                ComicCodeBook comicCodeBookF = b0Var.f();
                if (comicCodeBookF != null) {
                    this.J.add(comicCodeBookF);
                    this.D.set(bool);
                }
            }
            this.F.set(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.Wt0, Integer.valueOf(this.J.size())));
        } else {
            this.E.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dB));
            this.J.clear();
            this.D.set(Boolean.FALSE);
            this.F.set(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.Wt0, "0"));
            Iterator<T> it = this.I.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).i().set(Boolean.FALSE);
            }
        }
        this.K.notifyDataSetChanged();
    }

    @fo.k
    public final List<b0> O0(@fo.k List<ComicCodeBook> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.I.clear();
        for (ComicCodeBook comicCodeBook : list) {
            b0 b0Var = new b0();
            b0Var.a(comicCodeBook);
            b0Var.k(false);
            b0Var.m(new Function1() { // from class: com.zentraedi.comic.viewmodel.d0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h0.P0(this.a, (ComicCodeBook) obj);
                }
            });
            b0Var.l(new Function2() { // from class: com.zentraedi.comic.viewmodel.e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h0.Q0(this.a, (Context) obj, (ComicCodeBook) obj2);
                }
            });
            this.I.add(b0Var);
            this.G.set(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.Oa0, Integer.valueOf(this.I.size())));
        }
        return this.I;
    }

    public final void R0(@fo.k Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.J.size() == 0) {
            return;
        }
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.JI);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.gK);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        com.zentraedi.business.utils.n4.c.a().A2((Activity) context, strN, strN2, new a());
    }

    @fo.k
    public final ObservableField<String> S0() {
        return this.G;
    }

    @fo.k
    public final ObservableField<Boolean> T0() {
        return this.D;
    }

    public final void U0() {
        com.zentraedi.business.http.a.b().h(new ComicCodeBookListRequest(), new b());
    }

    @fo.k
    public final ObservableField<String> X0() {
        return this.E;
    }

    @fo.k
    public final ObservableField<String> Y0() {
        return this.F;
    }

    @fo.k
    public final ObservableField<Boolean> Z0() {
        return this.C;
    }

    public final void createFilterData() {
        this.M.clear();
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.xy);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        this.M.add(new BaseBottomDialogModel(0, false, (String) null, (String) null, strN, com.zentraedi.comic.q.h.lm, 0, (String) null, 207, (DefaultConstructorMarker) null));
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Xx);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        this.M.add(new BaseBottomDialogModel(0, false, (String) null, (String) null, strN2, com.zentraedi.comic.q.h.km, 0, (String) null, 207, (DefaultConstructorMarker) null));
    }

    @fo.k
    public final List<BaseBottomDialogModel> getMBottomDialogData() {
        return this.M;
    }

    @fo.k
    public final ObservableField<Boolean> getShowEmpty() {
        return this.B;
    }
}
