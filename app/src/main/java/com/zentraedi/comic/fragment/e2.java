package com.zentraedi.comic.fragment;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.zentraedi.business.utils.m6;
import com.zentraedi.business.utils.n4;
import com.zentraedi.business.utils.t7;
import com.zentraedi.comic.event.ComicFilesDeleteEvent;
import com.zentraedi.comic.event.ComicHouseAddedEvent;
import com.zentraedi.comic.event.ComicHouseDisplayChangedEvent;
import com.zentraedi.comic.event.ComicHouseEditModeEvent;
import com.zentraedi.comic.event.ComicHouseRefreshedEvent;
import com.zentraedi.comic.event.ComicInfoCreateEvent;
import com.zentraedi.comic.event.ComicInfoEditEvent;
import com.zentraedi.comic.event.ComicLibraryLooperRequestEvent;
import com.zentraedi.comic.event.ComicListDeleteEvent;
import com.zentraedi.comic.event.ComicListEvent;
import com.zentraedi.comic.event.ReadRecordUpdateEvent;
import com.zentraedi.comic.viewmodel.i6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicListDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicListDetailFragment.kt\ncom/zentraedi/comic/fragment/ComicListDetailFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,533:1\n1869#2,2:534\n1563#2:536\n1634#2,3:537\n774#2:540\n865#2,2:541\n*S KotlinDebug\n*F\n+ 1 ComicListDetailFragment.kt\ncom/zentraedi/comic/fragment/ComicListDetailFragment\n*L\n262#1:534,2\n478#1:536\n478#1:537,3\n479#1:540\n479#1:541,2\n*E\n"})
public final class e2 extends com.zentraedi.business.fragment.a {
    private boolean A;
    private int B;

    @fo.l
    private String o;
    public com.zentraedi.comic.databinding.u1 p;

    @fo.l
    private RecyclerView.LayoutManager q;

    @fo.l
    private com.chad.library.adapter.base.c<com.zentraedi.basic.function.viewmodel.f<?>, ?> r;

    @fo.l
    private RecyclerView s;

    @fo.l
    private SmartRefreshLayout t;

    @fo.l
    private a y;

    @fo.l
    private Function0<Unit> z;

    @fo.k
    private final String n = "ComicListDetailFragment";

    @fo.k
    private final com.zentraedi.basic.component.handler.a u = new com.zentraedi.basic.component.handler.a();

    @fo.k
    private final Lazy v = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.a2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return e2.r3();
        }
    });

    @fo.k
    private final Lazy w = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.b2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return e2.p3();
        }
    });

    @fo.k
    private final Lazy x = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.c2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return e2.o3();
        }
    });
    private int C = 7;
    private boolean D = true;

    @fo.k
    private final Lazy E = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.d2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(e2.q3());
        }
    });

    @fo.k
    private final e F = new e();

    public interface a {
        void a(@fo.l WeakReference<e2> weakReference);

        @fo.l
        List<com.zentraedi.business.addfile.n> b(@fo.l List<? extends com.zentraedi.business.addfile.n> list, @fo.l String str);

        void c(int i, @fo.l String str, @fo.l String str2, @fo.l b bVar);
    }

    public interface b {
        void onError(@fo.l String str, @fo.l String str2);

        void onResult(@fo.l List<? extends com.zentraedi.business.addfile.n> list);
    }

    public static final class c implements n4.f {
        c() {
        }

        public void a(Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2)) {
                t7.j(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.g, (String) null, 1, (Object) null), bool2);
            }
            e2.this.O2();
        }
    }

    public static final class d implements b {
        d() {
        }

        @Override // com.zentraedi.comic.fragment.e2.b
        public void onError(String str, String str2) {
            e2.this.D = false;
            e2.this.t2((View) null);
            if (e2.this.B == 0) {
                e2.this.w3(true);
                com.chad.library.adapter.base.c cVar = e2.this.r;
                Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type com.zentraedi.comic.adapter.ComicHomeAdapter");
                List data = ((com.zentraedi.comic.adapter.n) cVar).getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                com.zentraedi.business.addfile.n nVar = new com.zentraedi.business.addfile.n();
                nVar.viewType = com.zentraedi.comic.constant.a.b.f9if.a();
                data.add(nVar);
                com.chad.library.adapter.base.c cVar2 = e2.this.r;
                if (cVar2 != null) {
                    cVar2.notifyDataSetChanged();
                }
            }
            e2.this.f3().i();
            SmartRefreshLayout smartRefreshLayout = e2.this.t;
            if (smartRefreshLayout != null) {
                smartRefreshLayout.finishRefresh();
            }
            SmartRefreshLayout smartRefreshLayout2 = e2.this.t;
            if (smartRefreshLayout2 != null) {
                smartRefreshLayout2.finishLoadMore();
            }
        }

        @Override // com.zentraedi.comic.fragment.e2.b
        public void onResult(List<? extends com.zentraedi.business.addfile.n> list) {
            e2.this.D = false;
            e2.this.t2((View) null);
            e2.this.D3(list);
            e2.this.f3().i();
            SmartRefreshLayout smartRefreshLayout = e2.this.t;
            if (smartRefreshLayout != null) {
                smartRefreshLayout.finishRefresh();
            }
            SmartRefreshLayout smartRefreshLayout2 = e2.this.t;
            if (smartRefreshLayout2 != null) {
                smartRefreshLayout2.finishLoadMore();
            }
        }
    }

    public static final class e implements com.zentraedi.comic.business.a2.a {
        e() {
        }

        @Override // com.zentraedi.comic.business.a2.a
        public void a() {
            if (e2.this.i3() != null) {
                a aVarI3 = e2.this.i3();
                Intrinsics.checkNotNull(aVarI3);
                aVarI3.a(new WeakReference<>(e2.this));
            }
        }
    }

    public static final class f extends GridLayoutManager.SpanSizeLookup {
        final /* synthetic */ int b;

        f(int i) {
            this.b = i;
        }

        public int getSpanSize(int i) {
            com.zentraedi.basic.function.viewmodel.f fVar;
            com.chad.library.adapter.base.c cVar = e2.this.r;
            Integer numValueOf = (cVar == null || (fVar = (com.zentraedi.basic.function.viewmodel.f) cVar.getItem(i)) == null) ? null : Integer.valueOf(fVar.getViewType());
            int iD = com.zentraedi.comic.constant.a.b.f9if.d();
            if (numValueOf != null && numValueOf.intValue() == iD) {
                return 1;
            }
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2() {
        a aVar = this.y;
        if (aVar instanceof com.zentraedi.comic.impl.n) {
            Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type com.zentraedi.comic.impl.ComicHouseListImpl");
            final String strV = ((com.zentraedi.comic.impl.n) aVar).V();
            com.zentraedi.comic.business.b bVarC3 = c3();
            FragmentActivity fragmentActivityE = com.zentraedi.basic.function.utils.a.h().e();
            Intrinsics.checkNotNull(fragmentActivityE, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            View root = d3().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            com.zentraedi.comic.business.b.g(bVarC3, fragmentActivityE, root, strV, null, new Function0() { // from class: com.zentraedi.comic.fragment.v1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e2.P2(strV);
                }
            }, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P2(String str) {
        org.greenrobot.eventbus.c.f().q(new ComicHouseAddedEvent(str));
        return Unit.INSTANCE;
    }

    private final void R2() {
        if (this.A) {
            if (Intrinsics.areEqual(com.zentraedi.comic.util.g.a.b(), com.zentraedi.comic.constant.a.e.Af.a())) {
                d3().H.setPadding(g3(), 0, 0, 0);
                return;
            } else {
                d3().H.setPadding(0, 0, 0, 0);
                return;
            }
        }
        if (Intrinsics.areEqual(com.zentraedi.comic.util.h.a.a(), com.zentraedi.comic.constant.a.e.Af.a())) {
            d3().H.setPadding(g3(), 0, 0, 0);
        } else {
            d3().H.setPadding(0, 0, 0, 0);
        }
    }

    private final void S2() {
        String strA;
        org.greenrobot.eventbus.c.f().v(this);
        if (this.r == null) {
            this.r = new com.zentraedi.comic.adapter.n(h3());
        }
        h3().S(new View.OnClickListener() { // from class: com.zentraedi.comic.fragment.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e2.T2(this.a, view);
            }
        });
        if (this.A) {
            h3().M().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.uK));
        }
        com.zentraedi.comic.viewmodel.c3 c3VarH3 = h3();
        if (this.A) {
            Boolean bool = Boolean.FALSE;
            strA = Intrinsics.areEqual(t7.d("SP_KEY_NAS_COMIC_BOOK_TAG", bool), bool) ? com.zentraedi.comic.constant.a.e.Af.a() : com.zentraedi.comic.util.g.a.b();
        } else {
            strA = com.zentraedi.comic.util.h.a.a();
        }
        c3VarH3.U(strA);
        f3().j(this.F);
        d3().C1(h3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(e2 e2Var, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (((Boolean) t7.d(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.g, (String) null, 1, (Object) null), Boolean.FALSE)).booleanValue()) {
            e2Var.O2();
            return;
        }
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        n4 n4VarA = n4.c.a();
        Intrinsics.checkNotNull(activityE);
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.qH);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Mo2);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        String strN4 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx);
        Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
        String strN5 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.zx);
        Intrinsics.checkNotNullExpressionValue(strN5, "getString(...)");
        n4VarA.r3(activityE, strN, strN2, strN3, false, strN4, strN5, e2Var.new c());
    }

    private final void V2() {
        RecyclerView recyclerView = d3().H;
        this.s = recyclerView;
        Intrinsics.checkNotNull(recyclerView);
        if (recyclerView.getLayoutManager() != this.q) {
            RecyclerView recyclerView2 = this.s;
            Intrinsics.checkNotNull(recyclerView2);
            recyclerView2.setLayoutManager(this.q);
        }
        RecyclerView recyclerView3 = this.s;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.r);
        y3();
        SmartRefreshLayout smartRefreshLayout = d3().E;
        this.t = smartRefreshLayout;
        Intrinsics.checkNotNull(smartRefreshLayout);
        smartRefreshLayout.setEnableLoadMore(true);
        SmartRefreshLayout smartRefreshLayout2 = this.t;
        Intrinsics.checkNotNull(smartRefreshLayout2);
        smartRefreshLayout2.setOnRefreshListener(new tc.d() { // from class: com.zentraedi.comic.fragment.w1
            public final void z0(sc.j jVar) {
                e2.W2(this.a, jVar);
            }
        });
        SmartRefreshLayout smartRefreshLayout3 = this.t;
        Intrinsics.checkNotNull(smartRefreshLayout3);
        smartRefreshLayout3.setOnLoadMoreListener(new tc.b() { // from class: com.zentraedi.comic.fragment.x1
            public final void h1(sc.j jVar) {
                e2.X2(this.a, jVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(e2 e2Var, sc.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        e2Var.B = 0;
        SmartRefreshLayout smartRefreshLayout = e2Var.t;
        Intrinsics.checkNotNull(smartRefreshLayout);
        smartRefreshLayout.setEnableLoadMore(true);
        e2Var.n3(false);
        if (e2Var.y instanceof com.zentraedi.comic.impl.n) {
            org.greenrobot.eventbus.c.f().q(new ComicHouseRefreshedEvent(null, 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(e2 e2Var, sc.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        e2Var.B++;
        e2Var.n3(false);
    }

    private final void Y2(ComicListDeleteEvent comicListDeleteEvent) {
        com.chad.library.adapter.base.c<com.zentraedi.basic.function.viewmodel.f<?>, ?> cVar = this.r;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type com.zentraedi.comic.adapter.ComicHomeAdapter");
        List data = ((com.zentraedi.comic.adapter.n) cVar).getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        List<i6> comicThumbItemViewModels = comicListDeleteEvent.getComicThumbItemViewModels();
        data.removeAll(comicThumbItemViewModels);
        f3().b().removeAll(CollectionsKt.toSet(comicThumbItemViewModels));
        boolean zL = com.zentraedi.basic.function.utils.j0.l(data);
        w3(zL);
        if (zL) {
            com.zentraedi.business.addfile.n nVar = new com.zentraedi.business.addfile.n();
            nVar.viewType = com.zentraedi.comic.constant.a.b.f9if.a();
            data.add(nVar);
        }
        com.chad.library.adapter.base.c<com.zentraedi.basic.function.viewmodel.f<?>, ?> cVar2 = this.r;
        if (cVar2 != null) {
            cVar2.notifyDataSetChanged();
        }
    }

    private final void Z2(ComicListDeleteEvent comicListDeleteEvent) {
        com.chad.library.adapter.base.c<com.zentraedi.basic.function.viewmodel.f<?>, ?> cVar = this.r;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type com.zentraedi.comic.adapter.ComicHomeAdapter");
        List data = ((com.zentraedi.comic.adapter.n) cVar).getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        List<i6> comicThumbItemViewModels = comicListDeleteEvent.getComicThumbItemViewModels();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(comicThumbItemViewModels, 10));
        Iterator<T> it = comicThumbItemViewModels.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((i6) it.next()).u0().get()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : data) {
            androidx.lifecycle.b bVar = (com.zentraedi.basic.function.viewmodel.f) obj;
            if ((bVar instanceof i6) && CollectionsKt.contains(arrayList, ((i6) bVar).u0().get())) {
                arrayList2.add(obj);
            }
        }
        ArrayList<com.zentraedi.business.addfile.n> arrayListB = f3().b();
        TypeIntrinsics.asMutableCollection(arrayListB).removeAll(CollectionsKt.toSet(arrayList2));
        data.removeAll(arrayList2);
        boolean zL = com.zentraedi.basic.function.utils.j0.l(data);
        w3(zL);
        if (zL) {
            com.zentraedi.business.addfile.n nVar = new com.zentraedi.business.addfile.n();
            nVar.viewType = com.zentraedi.comic.constant.a.b.f9if.a();
            data.add(nVar);
        }
        com.chad.library.adapter.base.c<com.zentraedi.basic.function.viewmodel.f<?>, ?> cVar2 = this.r;
        if (cVar2 != null) {
            cVar2.notifyDataSetChanged();
        }
    }

    private final com.zentraedi.comic.business.b c3() {
        return (com.zentraedi.comic.business.b) this.x.getValue();
    }

    private final int g3() {
        return ((Number) this.E.getValue()).intValue();
    }

    private final void m3() {
        if (this.A || this.y == null) {
            n3(false);
        } else {
            n3(true);
        }
    }

    private final void n3(boolean z) {
        if (this.B == 0) {
            f3().d().clear();
        }
        if (z) {
            x2((View) null);
        }
        a aVar = this.y;
        if (aVar == null || aVar == null) {
            return;
        }
        aVar.c(this.B, h3().P(), h3().O(), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.b o3() {
        return new com.zentraedi.comic.business.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.a2 p3() {
        return new com.zentraedi.comic.business.a2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q3() {
        return com.zentraedi.basic.function.utils.m0.b(15.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.c3 r3() {
        return new com.zentraedi.comic.viewmodel.c3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(e2 e2Var) {
        e2Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w3(boolean z) {
        h3().showEmpty.set(Boolean.valueOf(z));
        Function0<Unit> function0 = this.z;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void y3() {
        int iA = com.zentraedi.business.utils.p0.K(getActivity()) ? m6.a.a() : 3;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), iA);
        gridLayoutManager.setSpanSizeLookup(new f(iA));
        this.q = gridLayoutManager;
        RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
    }

    public final void A3(@fo.l Function0<Unit> function0) {
        this.z = function0;
    }

    public final void B3(@fo.k com.zentraedi.comic.databinding.u1 u1Var) {
        Intrinsics.checkNotNullParameter(u1Var, "<set-?>");
        this.p = u1Var;
    }

    public final void C3(@fo.l String str) {
        this.o = str;
    }

    public final void D3(@fo.l List<? extends com.zentraedi.business.addfile.n> list) {
        List<com.zentraedi.business.addfile.n> listB;
        a aVar = this.y;
        List mutableList = (aVar == null || (listB = aVar.b(list, h3().N())) == null) ? null : CollectionsKt.toMutableList((Collection) listB);
        R2();
        if (this.B == 0) {
            f3().b().clear();
            f3().b().addAll(list != null ? list : new ArrayList<>());
            w3(com.zentraedi.basic.function.utils.j0.l(list));
            if (com.zentraedi.basic.function.utils.j0.l(mutableList) && mutableList != null) {
                com.zentraedi.business.addfile.n nVar = new com.zentraedi.business.addfile.n();
                nVar.viewType = com.zentraedi.comic.constant.a.b.f9if.a();
                mutableList.add(nVar);
            }
            com.chad.library.adapter.base.c<com.zentraedi.basic.function.viewmodel.f<?>, ?> cVar = this.r;
            if (cVar != null) {
                if (mutableList == null) {
                    mutableList = new ArrayList();
                }
                cVar.U1(mutableList);
            }
        } else {
            if (Intrinsics.areEqual(h3().editModel.get(), Boolean.TRUE) && list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((com.zentraedi.business.addfile.n) it.next()).x.set(true);
                }
            }
            f3().b().addAll(list != null ? list : new ArrayList<>());
            w3(false);
            com.chad.library.adapter.base.c<com.zentraedi.basic.function.viewmodel.f<?>, ?> cVar2 = this.r;
            if (cVar2 != null) {
                if (mutableList == null) {
                    return;
                } else {
                    cVar2.N(mutableList);
                }
            }
        }
        SmartRefreshLayout smartRefreshLayout = this.t;
        if (smartRefreshLayout != null) {
            smartRefreshLayout.setEnableLoadMore(!com.zentraedi.basic.function.utils.j0.l(list));
        }
    }

    public final void E3(int i) {
        this.C = i;
    }

    public final void F3(@fo.l a aVar) {
        this.y = aVar;
    }

    public final void G3(boolean z) {
        f3().k(z);
    }

    public final void H3() {
        f3().h();
    }

    public final void Q2(@fo.k String listType) {
        Intrinsics.checkNotNullParameter(listType, "listType");
        h3().U(listType);
        com.zentraedi.comic.util.h.a.f(listType);
        a aVar = this.y;
        List<com.zentraedi.business.addfile.n> listB = aVar != null ? aVar.b(f3().b(), h3().N()) : null;
        if (com.zentraedi.basic.function.utils.j0.l(listB)) {
            return;
        }
        R2();
        com.chad.library.adapter.base.c<com.zentraedi.basic.function.viewmodel.f<?>, ?> cVar = this.r;
        if (cVar == null || listB == null) {
            return;
        }
        cVar.U1(listB);
    }

    public final void U2(boolean z) {
        a aVar = this.y;
        if (aVar instanceof com.zentraedi.comic.impl.n) {
            Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type com.zentraedi.comic.impl.ComicHouseListImpl");
            ((com.zentraedi.comic.impl.n) aVar).T();
        }
        h3().editModel.set(Boolean.valueOf(z));
        f3().a(z);
        if (!z) {
            org.greenrobot.eventbus.c.f().q(new ComicListEvent(ComicListEvent.Companion.c()));
            d3().E.setEnableRefresh(true);
        } else {
            H3();
            org.greenrobot.eventbus.c.f().q(new ComicListEvent(ComicListEvent.Companion.b()));
            d3().E.setEnableRefresh(false);
        }
    }

    public final int a3() {
        return f3().b().size();
    }

    public final void b() {
        this.B = 0;
        m3();
    }

    @fo.l
    public final Function0<Unit> b3() {
        return this.z;
    }

    @fo.k
    public final com.zentraedi.comic.databinding.u1 d3() {
        com.zentraedi.comic.databinding.u1 u1Var = this.p;
        if (u1Var != null) {
            return u1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    @fo.l
    public final String e3() {
        return this.o;
    }

    @fo.k
    public final com.zentraedi.comic.business.a2 f3() {
        return (com.zentraedi.comic.business.a2) this.w.getValue();
    }

    @fo.k
    public final com.zentraedi.comic.viewmodel.c3 h3() {
        return (com.zentraedi.comic.viewmodel.c3) this.v.getValue();
    }

    @fo.l
    public final a i3() {
        return this.y;
    }

    public final boolean j3() {
        return this.A;
    }

    public final boolean k3() {
        return Intrinsics.areEqual(h3().showEmpty.get(), Boolean.TRUE);
    }

    public final void l3(boolean z) {
        h3().R().set(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void o2() {
        super/*com.zentraedi.basic.function.ui.fragment.a*/.o2();
        if (this.D || !Intrinsics.areEqual(h3().showEmpty.get(), Boolean.TRUE)) {
            return;
        }
        m3();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicFilesDeleteEvent(@fo.k ComicFilesDeleteEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if ((this.y instanceof com.zentraedi.comic.impl.n) && Intrinsics.areEqual(event.getFromHouse(), Boolean.TRUE)) {
            b();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseAddedEvent(@fo.k ComicHouseAddedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        a aVar = this.y;
        if (aVar instanceof com.zentraedi.comic.impl.n) {
            Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type com.zentraedi.comic.impl.ComicHouseListImpl");
            String strV = ((com.zentraedi.comic.impl.n) aVar).V();
            if (TextUtils.equals("0", strV) || TextUtils.equals(event.getCategory(), strV)) {
                b();
            }
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseDisplayChangedEvent(@fo.k ComicHouseDisplayChangedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getDisplayChanged()) {
            Q2(com.zentraedi.comic.util.g.a.b());
        } else {
            b();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseEditModeEvent(@fo.k ComicHouseEditModeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        a aVar = this.y;
        if (aVar instanceof com.zentraedi.comic.impl.n) {
            Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type com.zentraedi.comic.impl.ComicHouseListImpl");
            if (!Intrinsics.areEqual(((com.zentraedi.comic.impl.n) aVar).V(), event.getCid()) || event.isFolderMode()) {
                return;
            }
            U2(event.getInEdit());
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicInfoCreateEvent(@fo.k ComicInfoCreateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.y instanceof com.zentraedi.comic.impl.n) {
            b();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicInfoEditEvent(@fo.k ComicInfoEditEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.y instanceof com.zentraedi.comic.impl.n) {
            b();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicLibraryLooperRequestEvent(@fo.k ComicLibraryLooperRequestEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        a aVar = this.y;
        if (aVar instanceof com.zentraedi.comic.impl.n) {
            Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type com.zentraedi.comic.impl.ComicHouseListImpl");
            String strV = ((com.zentraedi.comic.impl.n) aVar).V();
            if (TextUtils.equals("0", strV) || TextUtils.equals(event.getCategory(), strV)) {
                b();
            }
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicListDeleteEvent(@fo.k ComicListDeleteEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String option = event.getOption();
        if (option != null) {
            int iHashCode = option.hashCode();
            if (iHashCode != -1122239600) {
                if (iHashCode != -349596688) {
                    if (iHashCode == 1621358214 && option.equals(ComicListDeleteEvent.OPTION_TYPE_DELETE_READ_RECORD)) {
                        Y2(event);
                        return;
                    }
                    return;
                }
                if (option.equals(ComicListDeleteEvent.OPTION_TYPE_REMOVE_FROM_SHELF) && this.C == 7) {
                    Y2(event);
                    return;
                }
                return;
            }
            if (option.equals(ComicListDeleteEvent.OPTION_TYPE_DELETE_FILE)) {
                int i = this.C;
                if (i == 9 || i == 10) {
                    Z2(event);
                } else if (this.y instanceof com.zentraedi.comic.impl.n) {
                    b();
                } else {
                    Y2(event);
                }
            }
        }
    }

    public void onConfigurationChanged(@fo.k Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(newConfig);
        y3();
    }

    @fo.k
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (this.p != null) {
            View root = d3().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            return root;
        }
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(inflater, com.zentraedi.comic.q.l.W5, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        B3((com.zentraedi.comic.databinding.u1) c0VarJ);
        View root2 = d3().getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        S2();
        V2();
        m3();
        return root2;
    }

    public void onDestroyView() {
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        org.greenrobot.eventbus.c.f().A(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@fo.k ComicListEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String message = event.getMessage();
        ComicListEvent.a aVar = ComicListEvent.Companion;
        if (Intrinsics.areEqual(message, aVar.a())) {
            U2(false);
        } else if (Intrinsics.areEqual(message, aVar.d())) {
            b();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onReadRecordUpdateEvent(@fo.k ReadRecordUpdateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i = this.C;
        if (i == 6 || i == 9) {
            this.u.postDelayed(new Runnable() { // from class: com.zentraedi.comic.fragment.y1
                @Override // java.lang.Runnable
                public final void run() {
                    e2.t3(this.a);
                }
            }, 100L);
        }
    }

    public final void s3(@fo.l com.zentraedi.business.addfile.n nVar) {
        com.zentraedi.comic.business.a2 a2VarF3 = f3();
        if (nVar == null) {
            return;
        }
        a2VarF3.f(nVar);
    }

    public final void u3() {
        f3().g();
    }

    public final void v3(@fo.l com.chad.library.adapter.base.c<com.zentraedi.basic.function.viewmodel.f<?>, ?> cVar) {
        RecyclerView recyclerView;
        if (this.r != null && (recyclerView = this.s) != null) {
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setAdapter(cVar);
        }
        this.r = cVar;
    }

    public final void x3(boolean z) {
        this.A = z;
    }

    public final void z3(@fo.l RecyclerView.LayoutManager layoutManager) {
        RecyclerView recyclerView;
        if (this.q != null && (recyclerView = this.s) != null) {
            Intrinsics.checkNotNull(recyclerView);
            if (recyclerView.getLayoutManager() != this.q) {
                RecyclerView recyclerView2 = this.s;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setLayoutManager(layoutManager);
            }
        }
        this.q = layoutManager;
    }
}
