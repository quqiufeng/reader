package com.zentraedi.comic.business;

import android.view.View;
import com.zentraedi.comic.event.ComicListDeleteEvent;
import com.zentraedi.comic.event.ComicListEvent;
import com.zentraedi.comic.viewmodel.d3;
import com.zentraedi.comic.viewmodel.i6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nOfflineComicTabBarBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfflineComicTabBarBusiness.kt\ncom/zentraedi/comic/business/OfflineComicTabBarBusiness\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1563#2:72\n1634#2,3:73\n*S KotlinDebug\n*F\n+ 1 OfflineComicTabBarBusiness.kt\ncom/zentraedi/comic/business/OfflineComicTabBarBusiness\n*L\n43#1:72\n43#1:73,3\n*E\n"})
public final class t2 {

    @fo.l
    private List<? extends com.zentraedi.business.addfile.n> b;

    @fo.l
    private String c;

    @fo.k
    private final String a = "ComicListTabBarBusiness";

    @fo.k
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.business.q2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t2.l();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(t2 t2Var, View view) {
        if (com.zentraedi.business.utils.m.c() || com.zentraedi.basic.function.utils.j0.l(t2Var.b)) {
            return;
        }
        t2Var.f();
    }

    private final void f() {
        List<? extends com.zentraedi.business.addfile.n> list = this.b;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.zentraedi.comic.viewmodel.ComicThumbItemViewModel>");
        List<? extends com.zentraedi.business.addfile.n> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((i6) it.next()).u0().get()));
        }
        i().e(arrayList, new Function1() { // from class: com.zentraedi.comic.business.s2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t2.g(this.a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(t2 t2Var, boolean z) {
        if (z) {
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            ComicListDeleteEvent comicListDeleteEvent = new ComicListDeleteEvent();
            comicListDeleteEvent.setOption(ComicListDeleteEvent.OPTION_TYPE_DELETE_FILE);
            List<? extends com.zentraedi.business.addfile.n> list = t2Var.b;
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.zentraedi.comic.viewmodel.ComicThumbItemViewModel>");
            comicListDeleteEvent.setComicThumbItemViewModels(TypeIntrinsics.asMutableList(list));
            cVarF.q(comicListDeleteEvent);
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.io2), true);
            org.greenrobot.eventbus.c.f().q(new ComicListEvent(ComicListEvent.Companion.a()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p2 l() {
        return new p2();
    }

    public final void d(@fo.k d3 tabBarVM, @fo.l String str, int i) {
        Intrinsics.checkNotNullParameter(tabBarVM, "tabBarVM");
        this.c = str;
        tabBarVM.U().set(false);
        tabBarVM.R().set(false);
        tabBarVM.L().set(new View.OnClickListener() { // from class: com.zentraedi.comic.business.r2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.e(this.a, view);
            }
        });
    }

    @fo.l
    public final String h() {
        return this.c;
    }

    @fo.k
    public final p2 i() {
        return (p2) this.d.getValue();
    }

    @fo.l
    public final List<com.zentraedi.business.addfile.n> j() {
        return this.b;
    }

    @fo.k
    public final String k() {
        return this.a;
    }

    public final void m(@fo.k d3 tabBarVM, int i) {
        Intrinsics.checkNotNullParameter(tabBarVM, "tabBarVM");
        if (i == 0) {
            tabBarVM.T().set(false);
            tabBarVM.M().set(false);
            tabBarVM.Q().set(false);
        } else {
            tabBarVM.T().set(true);
            tabBarVM.M().set(true);
            tabBarVM.Q().set(true);
        }
    }

    public final void n(@fo.l String str) {
        this.c = str;
    }

    public final void o(@fo.l List<? extends com.zentraedi.business.addfile.n> list) {
        this.b = list;
    }
}
