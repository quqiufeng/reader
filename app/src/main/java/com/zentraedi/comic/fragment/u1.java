package com.zentraedi.comic.fragment;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ObservableArrayList;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.task.event.FileDownloadProgressEvent;
import com.zentraedi.business.utils.d5;
import com.zentraedi.business.utils.m6;
import com.zentraedi.comic.event.ComicCoverChangeSuccessEvent;
import com.zentraedi.comic.event.ComicFilesDeleteEvent;
import com.zentraedi.comic.event.ComicFolderThumbUpdateEvent;
import com.zentraedi.comic.event.ComicHouseAddedEvent;
import com.zentraedi.comic.event.ComicHouseClearLastClickItemEvent;
import com.zentraedi.comic.event.ComicHouseDisplayChangedEvent;
import com.zentraedi.comic.event.ComicHouseEditModeEvent;
import com.zentraedi.comic.event.ComicHouseRefreshedEvent;
import com.zentraedi.comic.event.ComicInfoCancelEvent;
import com.zentraedi.comic.event.ComicInfoCreateEvent;
import com.zentraedi.comic.event.ComicInfoEditEvent;
import com.zentraedi.comic.event.ComicLibraryLooperRequestEvent;
import com.zentraedi.comic.event.ComicListDeleteEvent;
import com.zentraedi.comic.event.ComicShelfChangedEvent;
import com.zentraedi.comic.event.ReadRecordUpdateSuccessForListEvent;
import com.zentraedi.comic.viewmodel.i6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicHouseListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHouseListFragment.kt\ncom/zentraedi/comic/fragment/ComicHouseListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,337:1\n1#2:338\n1869#3,2:339\n1563#3:341\n1634#3,3:342\n*S KotlinDebug\n*F\n+ 1 ComicHouseListFragment.kt\ncom/zentraedi/comic/fragment/ComicHouseListFragment\n*L\n186#1:339,2\n279#1:341\n279#1:342,3\n*E\n"})
public final class u1 extends com.zentraedi.business.fragment.a {

    @fo.k
    private static final String A = "fromHouse";

    @fo.k
    public static final a u = new a(null);

    @fo.k
    private static final String v = "cate_id";

    @fo.k
    private static final String w = "dir_id";

    @fo.k
    private static final String x = "path";

    @fo.k
    private static final String y = "select";

    @fo.k
    private static final String z = "comic";

    @fo.l
    private com.zentraedi.comic.databinding.s1 n;

    @fo.l
    private Function0<Unit> q;

    @fo.l
    private Function1<? super List<com.zentraedi.comic.viewmodel.l0>, Unit> r;

    @fo.l
    private Function2<? super Integer, ? super Integer, Unit> s;

    @fo.k
    private final Lazy o = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.p1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return u1.V2();
        }
    });

    @fo.k
    private final Lazy p = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.fragment.q1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(u1.U2(this.a));
        }
    });
    private boolean t = true;

    @SourceDebugExtension({"SMAP\nComicHouseListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHouseListFragment.kt\ncom/zentraedi/comic/fragment/ComicHouseListFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ u1 b(a aVar, String str, String str2, String str3, Boolean bool, ComicInfoModel comicInfoModel, Boolean bool2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                bool = null;
            }
            if ((i & 16) != 0) {
                comicInfoModel = null;
            }
            if ((i & 32) != 0) {
                bool2 = Boolean.FALSE;
            }
            return aVar.a(str, str2, str3, bool, comicInfoModel, bool2);
        }

        @fo.k
        public final u1 a(@fo.l String str, @fo.l String str2, @fo.l String str3, @fo.l Boolean bool, @fo.l ComicInfoModel comicInfoModel, @fo.l Boolean bool2) {
            u1 u1Var = new u1();
            Bundle bundle = new Bundle();
            bundle.putString("cate_id", str);
            if (str3 != null) {
                bundle.putString("path", str3);
            }
            if (str2 != null) {
                bundle.putString("dir_id", str2);
            }
            if (bool != null) {
                bundle.putBoolean("select", bool.booleanValue());
            }
            if (bool2 != null) {
                bundle.putBoolean(u1.A, bool2.booleanValue());
            }
            if (comicInfoModel != null) {
                bundle.putSerializable("comic", comicInfoModel);
            }
            u1Var.setArguments(bundle);
            return u1Var;
        }

        private a() {
        }
    }

    public static final class b extends androidx.databinding.u.a {
        final /* synthetic */ com.zentraedi.comic.databinding.s1 b;

        b(com.zentraedi.comic.databinding.s1 s1Var) {
            this.b = s1Var;
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            if (Intrinsics.areEqual(u1.this.L2().a1().get(), Boolean.TRUE)) {
                u1.this.x2(this.b.getRoot());
            } else {
                u1.this.t2(this.b.getRoot());
            }
        }
    }

    public static final class c extends GridLayoutManager.SpanSizeLookup {
        final /* synthetic */ int b;

        c(int i) {
            this.b = i;
        }

        public int getSpanSize(int i) {
            if (u1.this.L2().getItems().get(i) instanceof com.zentraedi.business.viewmodel.v) {
                return this.b;
            }
            return 1;
        }
    }

    private final void F2(Boolean bool) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        String strB = com.zentraedi.comic.util.g.a.b();
        com.zentraedi.comic.constant.a.e.C0115a c0115a = com.zentraedi.comic.constant.a.e.Af;
        if (!Intrinsics.areEqual(strB, c0115a.a())) {
            com.zentraedi.comic.databinding.s1 s1Var = this.n;
            if (s1Var != null && (recyclerView2 = s1Var.G) != null) {
                recyclerView2.setPadding(0, 0, 0, 0);
            }
            com.zentraedi.comic.databinding.s1 s1Var2 = this.n;
            if (s1Var2 != null && (recyclerView = s1Var2.G) != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            }
            L2().A0(c0115a.b());
            return;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            com.zentraedi.comic.databinding.s1 s1Var3 = this.n;
            if (s1Var3 != null && (recyclerView4 = s1Var3.G) != null) {
                recyclerView4.setPadding(T2() ? 0 : K2(), 0, 0, 0);
            }
        } else {
            com.zentraedi.comic.databinding.s1 s1Var4 = this.n;
            if (s1Var4 != null && (recyclerView3 = s1Var4.G) != null) {
                recyclerView3.setPadding(K2(), 0, 0, 0);
            }
        }
        Y2();
        L2().A0(c0115a.a());
    }

    static /* synthetic */ void G2(u1 u1Var, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        u1Var.F2(bool);
    }

    private final int K2() {
        return ((Number) this.p.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.comic.viewmodel.k2 L2() {
        return (com.zentraedi.comic.viewmodel.k2) this.o.getValue();
    }

    private final void P2(final com.zentraedi.comic.databinding.s1 s1Var) {
        G2(this, null, 1, null);
        L2().T1(new Function3() { // from class: com.zentraedi.comic.fragment.r1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return u1.Q2(this.a, s1Var, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
            }
        });
        s1Var.H.setOnRefreshListener(new tc.d() { // from class: com.zentraedi.comic.fragment.s1
            public final void z0(sc.j jVar) {
                u1.R2(this.a, jVar);
            }
        });
        s1Var.H.setOnLoadMoreListener(new tc.b() { // from class: com.zentraedi.comic.fragment.t1
            public final void h1(sc.j jVar) {
                u1.S2(this.a, jVar);
            }
        });
        s1Var.H.autoRefresh();
        L2().W1(this.r);
        L2().Y1(this.s);
        L2().a1().addOnPropertyChangedCallback(new b(s1Var));
        s1Var.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q2(u1 u1Var, com.zentraedi.comic.databinding.s1 s1Var, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            u1Var.t = false;
            s1Var.H.finishRefresh(z4);
            s1Var.H.setEnableRefresh(!Intrinsics.areEqual(u1Var.L2().Y0().get(), Boolean.TRUE));
            G2(u1Var, null, 1, null);
        } else {
            s1Var.H.finishLoadMore(z4);
        }
        if (z3) {
            s1Var.H.finishLoadMoreWithNoMoreData();
        }
        Function0<Unit> function0 = u1Var.q;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(u1 u1Var, sc.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        u1Var.L2().loadData(true);
        if (Intrinsics.areEqual(u1Var.L2().L0(), Boolean.TRUE)) {
            org.greenrobot.eventbus.c.f().q(new ComicHouseRefreshedEvent(null, 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(u1 u1Var, sc.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        u1Var.L2().loadData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U2(u1 u1Var) {
        return com.zentraedi.basic.function.utils.k0.a(u1Var.getContext(), 15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.k2 V2() {
        return new com.zentraedi.comic.viewmodel.k2();
    }

    private final void Y2() {
        RecyclerView recyclerView;
        int iA = com.zentraedi.business.utils.p0.K(getActivity()) ? m6.a.a() : 3;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), iA);
        gridLayoutManager.setSpanSizeLookup(new c(iA));
        com.zentraedi.comic.databinding.s1 s1Var = this.n;
        if (s1Var == null || (recyclerView = s1Var.G) == null) {
            return;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    public final void H2(@fo.k ObservableArrayList<com.zentraedi.comic.viewmodel.l0> list) {
        com.zentraedi.comic.databinding.s1 s1Var;
        SmartRefreshLayout smartRefreshLayout;
        Intrinsics.checkNotNullParameter(list, "list");
        L2().H0(list);
        if (!L2().getItems().isEmpty() || (s1Var = this.n) == null || (smartRefreshLayout = s1Var.H) == null) {
            return;
        }
        smartRefreshLayout.autoRefresh();
    }

    @fo.k
    public final List<String> I2() {
        String path;
        ArrayList arrayList = new ArrayList();
        for (Object obj : L2().getItems()) {
            if ((obj instanceof com.zentraedi.comic.viewmodel.l0) && (path = ((com.zentraedi.comic.viewmodel.l0) obj).getPath()) != null) {
                arrayList.add(path);
            }
        }
        return arrayList;
    }

    @fo.l
    public final Function0<Unit> J2() {
        return this.q;
    }

    @fo.l
    public final Function1<List<com.zentraedi.comic.viewmodel.l0>, Unit> M2() {
        return this.r;
    }

    @fo.l
    public final Function2<Integer, Integer, Unit> N2() {
        return this.s;
    }

    public final int O2() {
        return L2().W0();
    }

    public final boolean T2() {
        return L2().e1();
    }

    public final void W2(boolean z2) {
        L2().L1(z2);
    }

    public final void X2(boolean z2) {
        SmartRefreshLayout smartRefreshLayout;
        com.zentraedi.comic.databinding.s1 s1Var = this.n;
        if (s1Var != null && (smartRefreshLayout = s1Var.H) != null) {
            smartRefreshLayout.setEnableRefresh(!z2);
        }
        L2().B0(z2);
    }

    public final void Z2(@fo.l Function0<Unit> function0) {
        this.q = function0;
    }

    public final void a3(@fo.l Function1<? super List<com.zentraedi.comic.viewmodel.l0>, Unit> function1) {
        this.r = function1;
    }

    public final void b3(@fo.l Function2<? super Integer, ? super Integer, Unit> function2) {
        this.s = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void o2() {
        super/*com.zentraedi.basic.function.ui.fragment.a*/.o2();
        if (this.t || !L2().e1()) {
            return;
        }
        L2().loadData(true);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicCoverChangeSuccessEvent(@fo.k ComicCoverChangeSuccessEvent event) {
        ComicInfoModel comic;
        Intrinsics.checkNotNullParameter(event, "event");
        String parentPath = L2().getParentPath();
        d5.a aVar = d5.a;
        ComicInfoModel comicInfo = event.getComicInfo();
        if (Intrinsics.areEqual(parentPath, aVar.m(comicInfo != null ? comicInfo.getPath() : null))) {
            for (IndexedValue indexedValue : CollectionsKt.withIndex((Iterable) L2().getItems())) {
                if (indexedValue.getValue() instanceof com.zentraedi.comic.viewmodel.l0) {
                    ComicInfoModel comicInfo2 = event.getComicInfo();
                    String id2 = comicInfo2 != null ? comicInfo2.getId() : null;
                    Object value = indexedValue.getValue();
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.zentraedi.comic.viewmodel.ComicDirViewModel");
                    ComicDirModel comicDirModelP = ((com.zentraedi.comic.viewmodel.l0) value).P();
                    if (Intrinsics.areEqual(id2, (comicDirModelP == null || (comic = comicDirModelP.getComic()) == null) ? null : comic.getId())) {
                        L2().loadData(true);
                        return;
                    }
                }
            }
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicFilesDeleteEvent(@fo.k ComicFilesDeleteEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        L2().h2(event.getPaths());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicFolderThumbUpdateEvent(@fo.k ComicFolderThumbUpdateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        L2().i2(event.getParentPath());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseAddedEvent(@fo.k ComicHouseAddedEvent event) {
        com.zentraedi.comic.databinding.s1 s1Var;
        SmartRefreshLayout smartRefreshLayout;
        Intrinsics.checkNotNullParameter(event, "event");
        if ((!TextUtils.equals("0", L2().I0()) && !TextUtils.equals(event.getCategory(), L2().I0())) || (s1Var = this.n) == null || (smartRefreshLayout = s1Var.H) == null) {
            return;
        }
        smartRefreshLayout.autoRefresh();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseClearLastClickItemEvent(@fo.k ComicHouseClearLastClickItemEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (TextUtils.equals(event.getCateId(), L2().I0())) {
            return;
        }
        L2().M0().set((Object) null);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseDisplayChangedEvent(@fo.k ComicHouseDisplayChangedEvent event) {
        com.zentraedi.comic.databinding.s1 s1Var;
        SmartRefreshLayout smartRefreshLayout;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getDisplayChanged()) {
            F2(Boolean.TRUE);
        } else {
            if (!TextUtils.equals(event.getSortPath(), L2().getParentPath()) || (s1Var = this.n) == null || (smartRefreshLayout = s1Var.H) == null) {
                return;
            }
            smartRefreshLayout.autoRefresh();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseEditModeEvent(@fo.k ComicHouseEditModeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event.getCid(), L2().I0()) && event.isFolderMode()) {
            L2().Y0().set(Boolean.valueOf(event.getInEdit()));
            if (!event.getInEdit()) {
                W2(false);
            }
            X2(event.getInEdit());
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicInfoCancelEvent(@fo.k ComicInfoCancelEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        L2().e2(event);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicInfoCreateEvent(@fo.k ComicInfoCreateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        L2().f2(event);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicInfoEditEvent(@fo.k ComicInfoEditEvent event) {
        ComicCategory category;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!TextUtils.equals("0", L2().I0())) {
            ComicDirModel dir = event.getInfo().getDir();
            if (!TextUtils.equals((dir == null || (category = dir.getCategory()) == null) ? null : category.getId(), L2().I0())) {
                return;
            }
        }
        L2().d2(event.getInfo());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicLibraryLooperRequestEvent(@fo.k ComicLibraryLooperRequestEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (TextUtils.equals("0", L2().I0()) || TextUtils.equals(event.getCategory(), L2().I0())) {
            L2().loadData(true);
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicListDeleteEvent(@fo.k ComicListDeleteEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event.getOption(), ComicListDeleteEvent.OPTION_TYPE_DELETE_FILE)) {
            List<i6> comicThumbItemViewModels = event.getComicThumbItemViewModels();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(comicThumbItemViewModels, 10));
            Iterator<T> it = comicThumbItemViewModels.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((i6) it.next()).u0().get()));
            }
            L2().h2(arrayList);
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicShelfChangedEvent(@fo.k ComicShelfChangedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        L2().g2(event.getOnShelf(), event.getIds());
    }

    public void onConfigurationChanged(@fo.k Configuration newConfig) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(newConfig);
        com.zentraedi.comic.databinding.s1 s1Var = this.n;
        if (((s1Var == null || (recyclerView = s1Var.G) == null) ? null : recyclerView.getLayoutManager()) instanceof GridLayoutManager) {
            Y2();
        }
    }

    @fo.l
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.zentraedi.comic.databinding.s1 s1Var = (com.zentraedi.comic.databinding.s1) androidx.databinding.m.j(inflater, com.zentraedi.comic.q.l.V5, viewGroup, false);
        this.n = s1Var;
        if (s1Var != null) {
            s1Var.C1(L2());
        }
        com.zentraedi.comic.databinding.s1 s1Var2 = this.n;
        if (s1Var2 != null) {
            return s1Var2.getRoot();
        }
        return null;
    }

    public void onDestroyView() {
        L2().onCleared();
        org.greenrobot.eventbus.c.f().A(this);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onFileDownloadProgressEvent(@fo.k FileDownloadProgressEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onReadRecordUpdateSuccessForListEvent(@fo.k ReadRecordUpdateSuccessForListEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        L2().k2(event);
    }

    public void onViewCreated(@fo.k View view, @fo.l Bundle bundle) {
        String string;
        Serializable serializable;
        String string2;
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        org.greenrobot.eventbus.c.f().v(this);
        com.zentraedi.comic.viewmodel.k2 k2VarL2 = L2();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("cate_id")) == null) {
            string = "0";
        }
        k2VarL2.M1(string);
        com.zentraedi.comic.viewmodel.k2 k2VarL3 = L2();
        Bundle arguments2 = getArguments();
        k2VarL3.Q1(arguments2 != null ? arguments2.getString("dir_id") : null);
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string2 = arguments3.getString("path")) != null) {
            L2().setParentPath(string2);
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            L2().Y0().set(Boolean.valueOf(arguments4.getBoolean("select")));
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            L2().R1(Boolean.valueOf(arguments5.getBoolean(A)));
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null && (serializable = arguments6.getSerializable("comic")) != null) {
            L2().V1((ComicInfoModel) serializable);
        }
        com.zentraedi.comic.databinding.s1 s1Var = this.n;
        if (s1Var != null) {
            P2(s1Var);
        }
    }
}
