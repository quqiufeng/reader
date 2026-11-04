package com.zentraedi.comic.business;

import android.text.TextUtils;
import android.view.View;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.utils.y4;
import com.zentraedi.comic.event.ComicListDeleteEvent;
import com.zentraedi.comic.event.ComicListEvent;
import com.zentraedi.comic.manager.ComicDownloadManager;
import com.zentraedi.comic.viewmodel.d3;
import com.zentraedi.comic.viewmodel.i6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicListTabBarBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicListTabBarBusiness.kt\ncom/zentraedi/comic/business/ComicListTabBarBusiness\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1563#2:188\n1634#2,3:189\n1869#2,2:192\n1617#2,9:194\n1869#2:203\n1870#2:205\n1626#2:206\n1#3:204\n*S KotlinDebug\n*F\n+ 1 ComicListTabBarBusiness.kt\ncom/zentraedi/comic/business/ComicListTabBarBusiness\n*L\n125#1:188\n125#1:189,3\n105#1:192,2\n131#1:194,9\n131#1:203\n131#1:205\n131#1:206\n131#1:204\n*E\n"})
public final class l2 {

    @fo.l
    private List<? extends com.zentraedi.business.addfile.n> b;

    @fo.l
    private String c;

    @fo.k
    private final String a = "ComicListTabBarBusiness";

    @fo.k
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.business.e2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l2.A();
        }
    });

    @fo.k
    private final Lazy e = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.business.f2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l2.B();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final a1 A() {
        return new a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x1 B() {
        return new x1();
    }

    private final void C(List<i6> list) {
        org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
        ComicListDeleteEvent comicListDeleteEvent = new ComicListDeleteEvent();
        comicListDeleteEvent.setOption(ComicListDeleteEvent.OPTION_TYPE_DELETE_FILE);
        comicListDeleteEvent.setComicThumbItemViewModels(CollectionsKt.toMutableList((Collection) list));
        cVarF.q(comicListDeleteEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final l2 l2Var, View view) {
        String id2;
        if (com.zentraedi.business.utils.m.c() || com.zentraedi.basic.function.utils.j0.l(l2Var.b)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        List<com.zentraedi.business.addfile.n> arrayList = l2Var.b;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (com.zentraedi.business.addfile.n nVar : arrayList) {
            Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type com.zentraedi.comic.viewmodel.ComicThumbItemViewModel");
            ComicInfoModel comicInfoModelY0 = ((i6) nVar).y0();
            if (comicInfoModelY0 != null && (id2 = comicInfoModelY0.getId()) != null) {
                if (TextUtils.isEmpty(sb)) {
                    sb.append(id2);
                } else {
                    sb.append(',' + id2);
                }
            }
        }
        l2Var.x().F(sb.toString(), Boolean.FALSE, new Function1() { // from class: com.zentraedi.comic.business.g2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l2.m(this.a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(l2 l2Var, boolean z) {
        if (z) {
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            ComicListDeleteEvent comicListDeleteEvent = new ComicListDeleteEvent();
            comicListDeleteEvent.setOption(ComicListDeleteEvent.OPTION_TYPE_REMOVE_FROM_SHELF);
            List<? extends com.zentraedi.business.addfile.n> list = l2Var.b;
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.zentraedi.comic.viewmodel.ComicThumbItemViewModel>");
            comicListDeleteEvent.setComicThumbItemViewModels(TypeIntrinsics.asMutableList(list));
            cVarF.q(comicListDeleteEvent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(l2 l2Var, int i, View view) {
        if (com.zentraedi.business.utils.m.c() || com.zentraedi.basic.function.utils.j0.l(l2Var.b)) {
            return;
        }
        if (i == 6) {
            l2Var.t();
        } else {
            l2Var.q(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(l2 l2Var, View view) {
        i6 i6Var;
        ComicInfoModel comicInfoModelY0;
        if (com.zentraedi.business.permission.a.d(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.business.permission.a.i) && !com.zentraedi.basic.function.utils.j0.l(l2Var.b)) {
            if (y4.h().i().size() > 200) {
                com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Jh4));
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<? extends com.zentraedi.business.addfile.n> list = l2Var.b;
            if (list != null) {
                for (com.zentraedi.business.addfile.n nVar : list) {
                    if ((nVar instanceof i6) && (comicInfoModelY0 = (i6Var = (i6) nVar).y0()) != null) {
                        ComicDownloadManager.ComicFileInfo comicFileInfo = new ComicDownloadManager.ComicFileInfo();
                        comicFileInfo.setPath(comicInfoModelY0.getPath());
                        comicFileInfo.setFolder(i6Var.z0());
                        Unit unit = Unit.INSTANCE;
                        arrayList.add(new Pair(comicInfoModelY0, CollectionsKt.arrayListOf(comicFileInfo)));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ComicDownloadManager.c.a().h(arrayList, new Function1() { // from class: com.zentraedi.comic.business.d2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l2.p(((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(boolean z) {
        org.greenrobot.eventbus.c.f().q(new ComicListEvent(ComicListEvent.Companion.a()));
        return Unit.INSTANCE;
    }

    private final void q(final int i) {
        final List<? extends com.zentraedi.business.addfile.n> list = this.b;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.zentraedi.comic.viewmodel.ComicThumbItemViewModel>");
        List<? extends com.zentraedi.business.addfile.n> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((i6) it.next()).u0().get()));
        }
        w().b0(arrayList, new Function1() { // from class: com.zentraedi.comic.business.b2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l2.r(i, list, this, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(int i, final List list, final l2 l2Var, boolean z) {
        if (!z) {
            return Unit.INSTANCE;
        }
        if (i == 7) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ComicInfoModel comicInfoModelY0 = ((i6) it.next()).y0();
                String id2 = comicInfoModelY0 != null ? comicInfoModelY0.getId() : null;
                if (id2 != null) {
                    arrayList.add(id2);
                }
            }
            l2Var.x().F(CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null), Boolean.FALSE, new Function1() { // from class: com.zentraedi.comic.business.c2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l2.s(this.a, list, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            l2Var.C(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(l2 l2Var, List list, boolean z) {
        if (z) {
            l2Var.C(list);
        }
        return Unit.INSTANCE;
    }

    private final void t() {
        String id2;
        StringBuilder sb = new StringBuilder();
        List<com.zentraedi.business.addfile.n> arrayList = this.b;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (com.zentraedi.business.addfile.n nVar : arrayList) {
            Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type com.zentraedi.comic.viewmodel.ComicThumbItemViewModel");
            ComicInfoModel comicInfoModelY0 = ((i6) nVar).y0();
            if (comicInfoModelY0 != null && (id2 = comicInfoModelY0.getId()) != null) {
                if (TextUtils.isEmpty(sb)) {
                    sb.append(id2);
                } else {
                    sb.append(',' + id2);
                }
            }
        }
        a1 a1VarW = w();
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        a1VarW.k0(string, new Function1() { // from class: com.zentraedi.comic.business.h2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l2.u(this.a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(l2 l2Var, boolean z) {
        if (z) {
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            ComicListDeleteEvent comicListDeleteEvent = new ComicListDeleteEvent();
            comicListDeleteEvent.setOption(ComicListDeleteEvent.OPTION_TYPE_DELETE_READ_RECORD);
            List<? extends com.zentraedi.business.addfile.n> list = l2Var.b;
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.zentraedi.comic.viewmodel.ComicThumbItemViewModel>");
            comicListDeleteEvent.setComicThumbItemViewModels(TypeIntrinsics.asMutableList(list));
            cVarF.q(comicListDeleteEvent);
        }
        return Unit.INSTANCE;
    }

    public final void D(@fo.k d3 tabBarVM, int i) {
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

    public final void E(@fo.l String str) {
        this.c = str;
    }

    public final void F(@fo.l List<? extends com.zentraedi.business.addfile.n> list) {
        this.b = list;
    }

    public final void k(@fo.k d3 tabBarVM, @fo.l String str, final int i) {
        Intrinsics.checkNotNullParameter(tabBarVM, "tabBarVM");
        this.c = str;
        if (i == 6) {
            tabBarVM.U().set(false);
            tabBarVM.R().set(false);
            tabBarVM.N().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.LI));
        }
        if (i == 8) {
            tabBarVM.U().set(false);
        }
        tabBarVM.S().set(new View.OnClickListener() { // from class: com.zentraedi.comic.business.i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l2.l(this.a, view);
            }
        });
        tabBarVM.L().set(new View.OnClickListener() { // from class: com.zentraedi.comic.business.j2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l2.n(this.a, i, view);
            }
        });
        tabBarVM.P().set(new View.OnClickListener() { // from class: com.zentraedi.comic.business.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l2.o(this.a, view);
            }
        });
    }

    @fo.l
    public final String v() {
        return this.c;
    }

    @fo.k
    public final a1 w() {
        return (a1) this.d.getValue();
    }

    @fo.k
    public final x1 x() {
        return (x1) this.e.getValue();
    }

    @fo.l
    public final List<com.zentraedi.business.addfile.n> y() {
        return this.b;
    }

    @fo.k
    public final String z() {
        return this.a;
    }
}
