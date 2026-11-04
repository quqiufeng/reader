package com.zentraedi.comic.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.zentraedi.business.activity.BaseLandscapeActivity;
import com.zentraedi.business.database.ComicLibCategoryEntity;
import com.zentraedi.business.database.ReadingRecord;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.comic.event.ComicDisplayModeChangeEvent;
import com.zentraedi.comic.event.ComicListDeleteEvent;
import com.zentraedi.comic.event.ComicListEvent;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineStart;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nOfflineComicMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfflineComicMainActivity.kt\ncom/zentraedi/comic/activity/OfflineComicMainActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,383:1\n774#2:384\n865#2,2:385\n*S KotlinDebug\n*F\n+ 1 OfflineComicMainActivity.kt\ncom/zentraedi/comic/activity/OfflineComicMainActivity\n*L\n124#1:384\n124#1:385,2\n*E\n"})
public final class OfflineComicMainActivity extends BaseLandscapeActivity {

    @fo.k
    public static final a d0 = new a(null);

    @fo.l
    private static List<ComicLibCategoryEntity> e0 = null;

    @fo.k
    public static final String f0 = "key_from_online";

    @fo.k
    private final String T = "OfflineComicMainActivity";

    @fo.k
    private final Lazy U = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.b8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfflineComicMainActivity.k5(this.a);
        }
    });

    @fo.k
    private final Lazy V = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.m8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfflineComicMainActivity.l5();
        }
    });

    @fo.k
    private final Lazy W = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.n8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfflineComicMainActivity.o5();
        }
    });

    @fo.k
    private final Lazy X = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.o8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfflineComicMainActivity.p5();
        }
    });

    @fo.k
    private final Lazy Y = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.p8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfflineComicMainActivity.n5();
        }
    });

    @fo.k
    private final Lazy Z = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.q8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfflineComicMainActivity.m5();
        }
    });

    @fo.k
    private String a0 = com.zentraedi.comic.constant.a.e.Af.a();

    @fo.k
    private final Lazy b0 = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.r8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OfflineComicMainActivity.j5(this.a);
        }
    });
    private boolean c0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void c(a aVar, Activity activity, Boolean bool, int i, Object obj) {
            if ((i & 2) != 0) {
                bool = Boolean.FALSE;
            }
            aVar.b(activity, bool);
        }

        @fo.l
        public final List<ComicLibCategoryEntity> a() {
            return OfflineComicMainActivity.e0;
        }

        public final void b(@fo.k Activity activity, @fo.l Boolean bool) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = new Intent(activity, (Class<?>) OfflineComicMainActivity.class);
            intent.putExtra(OfflineComicMainActivity.f0, bool);
            activity.startActivity(intent);
        }

        public final void d(@fo.l List<ComicLibCategoryEntity> list) {
            OfflineComicMainActivity.e0 = list;
        }

        private a() {
        }
    }

    public static final class b implements e6.b {
        b() {
        }

        public void a(int i) {
            OfflineComicMainActivity.this.r5(i);
        }

        public void b(int i) {
        }
    }

    public static final class c implements ViewPager.j {
        c() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            OfflineComicMainActivity.this.r5(i);
        }
    }

    public static final class d implements com.zentraedi.comic.business.z1.a {
        d() {
        }

        @Override // com.zentraedi.comic.business.z1.a
        public void a() {
            OfflineComicMainActivity offlineComicMainActivity = OfflineComicMainActivity.this;
            offlineComicMainActivity.q5((String) offlineComicMainActivity.Q4().getSortBy().get(), (String) OfflineComicMainActivity.this.Q4().getOrder().get());
            OfflineComicMainActivity.this.Q4().W();
        }
    }

    public static final class e extends androidx.databinding.u.a {
        e() {
        }

        public void onPropertyChanged(androidx.databinding.u uVar, int i) {
            ObservableBoolean observableBooleanV = OfflineComicMainActivity.this.Q4().V();
            Object obj = OfflineComicMainActivity.this.W4().editModel.get();
            Boolean bool = Boolean.TRUE;
            observableBooleanV.set(Intrinsics.areEqual(obj, bool));
            OfflineComicMainActivity.this.P4().O.setScroll(!Intrinsics.areEqual(OfflineComicMainActivity.this.W4().editModel.get(), bool));
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.activity.OfflineComicMainActivity$loadData$1$2", f = "OfflineComicMainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class f extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ List<ComicCategory> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List<ComicCategory> list, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OfflineComicMainActivity.this.new f(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OfflineComicMainActivity.this.O4().B(this.c);
            OfflineComicMainActivity.this.P4().K.r();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((f) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void I4() {
        com.zentraedi.comic.constant.a.e.C0115a c0115a = com.zentraedi.comic.constant.a.e.Af;
        this.a0 = Intrinsics.areEqual(c0115a.b(), this.a0) ? c0115a.a() : c0115a.b();
        com.zentraedi.comic.adapter.a0 a0VarO4 = O4();
        if (a0VarO4 != null) {
            a0VarO4.o(this.a0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K4(com.zentraedi.comic.fragment.e2 e2Var, com.zentraedi.business.addfile.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (e2Var != null) {
            e2Var.s3(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L4(OfflineComicMainActivity offlineComicMainActivity, com.zentraedi.comic.viewmodel.i6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        offlineComicMainActivity.t5(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M4(OfflineComicMainActivity offlineComicMainActivity, com.zentraedi.comic.fragment.e2 e2Var) {
        if (Intrinsics.areEqual(offlineComicMainActivity.W4().editModel.get(), Boolean.FALSE)) {
            offlineComicMainActivity.W4().editModel.set(Boolean.TRUE);
            if (e2Var != null) {
                e2Var.U2(true);
            }
        }
        return Unit.INSTANCE;
    }

    private final void N4() {
        W4().editModel.set(Boolean.FALSE);
        com.zentraedi.comic.adapter.a0 a0VarO4 = O4();
        if (a0VarO4 != null) {
            a0VarO4.p(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.comic.adapter.a0 O4() {
        return (com.zentraedi.comic.adapter.a0) this.b0.getValue();
    }

    public static /* synthetic */ void S4() {
    }

    private final com.zentraedi.comic.business.z1 U4() {
        return (com.zentraedi.comic.business.z1) this.Y.getValue();
    }

    private final void Y4() {
        P4().J.J.setBackgroundColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.du));
        P4().J.L.setTextSize(2, 16.0f);
        P4().J.L.setTypeface(Typeface.DEFAULT);
        if (NasConnectManager.getInstance().isOfflineLogin()) {
            P4().J.F.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.Vy));
        } else {
            P4().J.F.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.Gi));
        }
        ObservableField<Boolean> observableField = W4().hideRightNavIcon;
        Boolean bool = Boolean.TRUE;
        observableField.set(bool);
        P4().J.I.setVisibility(8);
        P4().G.E.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.xl));
        P4().G.I.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.K3));
        P4().G.G.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.K3));
        P4().G.F.setBackground(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.f.Vd));
        W4().U().set(bool);
        W4().showDividerLine.set(Boolean.FALSE);
        P4().O.setScroll(true);
        P4().O.setAdapter(O4());
        P4().K.setViewPager(P4().O);
        P4().K.setOnTabSelectListener(new b());
        P4().O.addOnPageChangeListener(new c());
        AppBarLayout appBarLayout = P4().E;
        com.zentraedi.business.listener.a aVar = new com.zentraedi.business.listener.a();
        TextView tvNavTitle = P4().J.L;
        Intrinsics.checkNotNullExpressionValue(tvNavTitle, "tvNavTitle");
        aVar.f(new View[]{tvNavTitle});
        View tvTitle = P4().N;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        aVar.i(new View[]{tvTitle});
        appBarLayout.e(aVar);
    }

    private final void Z4() {
        if (this.c0) {
            W4().navTitle.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Xj0));
        } else {
            W4().navTitle.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.HK));
        }
        W4().setRightIconOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.s8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicMainActivity.a5(this.a, view);
            }
        });
        W4().setCloseEditOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.t8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicMainActivity.b5(this.a, view);
            }
        });
        W4().setSelectOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.u8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicMainActivity.c5(this.a, view);
            }
        });
        this.a0 = com.zentraedi.comic.util.h.a.a();
        Q4().L().set(Intrinsics.areEqual(com.zentraedi.comic.constant.a.e.Af.a(), this.a0));
        Q4().getSortBy().set("name");
        Q4().getOrder().set("asc");
        Q4().M().set(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.c8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicMainActivity.d5(this.a, view);
            }
        });
        Q4().R().set(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.d8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicMainActivity.e5(this.a, view);
            }
        });
        Q4().N().set(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.e8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicMainActivity.f5(this.a, view);
            }
        });
        Q4().O().set(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.f8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineComicMainActivity.g5(this.a, view);
            }
        });
        U4().k(new d());
        W4().editModel.addOnPropertyChangedCallback(new e());
        Q4().W();
        Q4().U(9);
        V4().R().set(false);
        V4().U().set(false);
        P4().C1(W4());
        P4().I.C1(Q4());
        P4().H.C1(V4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a5(OfflineComicMainActivity offlineComicMainActivity, View view) {
        offlineComicMainActivity.W4().editModel.set(Boolean.TRUE);
        offlineComicMainActivity.O4().u(offlineComicMainActivity.P4().K.getCurrentTab()).U2(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b5(OfflineComicMainActivity offlineComicMainActivity, View view) {
        offlineComicMainActivity.N4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c5(OfflineComicMainActivity offlineComicMainActivity, View view) {
        String str = (String) offlineComicMainActivity.W4().rightEditTextObserver.get();
        com.zentraedi.comic.fragment.e2 e2VarU = offlineComicMainActivity.O4().u(offlineComicMainActivity.P4().K.getCurrentTab());
        if (Intrinsics.areEqual(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dB), str)) {
            e2VarU.u3();
        } else {
            e2VarU.H3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d5(OfflineComicMainActivity offlineComicMainActivity, View view) {
        org.greenrobot.eventbus.c.f().q(new ComicDisplayModeChangeEvent());
        offlineComicMainActivity.I4();
        offlineComicMainActivity.Q4().L().set(Intrinsics.areEqual(com.zentraedi.comic.constant.a.e.Af.a(), offlineComicMainActivity.a0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e5(OfflineComicMainActivity offlineComicMainActivity, View view) {
        offlineComicMainActivity.w5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f5(OfflineComicMainActivity offlineComicMainActivity, View view) {
        offlineComicMainActivity.U4().b(offlineComicMainActivity.Q4().getSortBy(), offlineComicMainActivity.Q4().getOrder(), offlineComicMainActivity.Q4().T(), 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g5(OfflineComicMainActivity offlineComicMainActivity, View view) {
        offlineComicMainActivity.W4().editModel.set(Boolean.TRUE);
        offlineComicMainActivity.O4().u(offlineComicMainActivity.P4().K.getCurrentTab()).U2(true);
    }

    private final void h5() {
        ig.k.a.p(new Function1() { // from class: com.zentraedi.comic.activity.g8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OfflineComicMainActivity.i5(this.a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i5(OfflineComicMainActivity offlineComicMainActivity, List list) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        e0 = list;
        List<String> listC = ig.k.a.C();
        List<String> listDistinct = listC != null ? CollectionsKt.distinct(listC) : null;
        if (listDistinct != null) {
            for (String str : listDistinct) {
                List<ComicLibCategoryEntity> list2 = e0;
                if (list2 != null) {
                    arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (Intrinsics.areEqual(((ComicLibCategoryEntity) obj).getCategoryId(), str)) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (!com.zentraedi.basic.function.utils.j0.l(arrayList) && offlineComicMainActivity.x5(str)) {
                    ComicCategory comicCategory = new ComicCategory();
                    Intrinsics.checkNotNull(arrayList);
                    comicCategory.setName(((ComicLibCategoryEntity) arrayList.get(0)).getName());
                    comicCategory.setId(str);
                    arrayList2.add(comicCategory);
                }
            }
        }
        kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, offlineComicMainActivity.new f(arrayList2, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.adapter.a0 j5(OfflineComicMainActivity offlineComicMainActivity) {
        FragmentManager fragmentManagerI2 = offlineComicMainActivity.I2();
        Intrinsics.checkNotNullExpressionValue(fragmentManagerI2, "getSupportFragmentManager(...)");
        com.zentraedi.comic.adapter.a0 a0Var = new com.zentraedi.comic.adapter.a0(fragmentManagerI2);
        a0Var.A(new WeakReference<>(offlineComicMainActivity));
        return a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final com.zentraedi.comic.databinding.a0 k5(OfflineComicMainActivity offlineComicMainActivity) {
        return (com.zentraedi.comic.databinding.a0) androidx.databinding.m.l(offlineComicMainActivity, com.zentraedi.comic.q.l.D0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.b3 l5() {
        return new com.zentraedi.comic.viewmodel.b3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.p2 m5() {
        return new com.zentraedi.comic.business.p2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.z1 n5() {
        return new com.zentraedi.comic.business.z1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.d3 o5() {
        return new com.zentraedi.comic.viewmodel.d3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.a3 p5() {
        return new com.zentraedi.comic.viewmodel.a3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r5(int i) {
        P4().K.setCurrentTab(i);
    }

    private final void t5(final com.zentraedi.comic.viewmodel.i6 i6Var) {
        com.zentraedi.comic.business.p2 p2VarT4 = T4();
        View root = P4().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        p2VarT4.l(root, (String) i6Var.l0().get(), (String) i6Var.m0().get(), Boolean.valueOf(com.zentraedi.business.utils.i5.a.f((String) i6Var.u0().get()) == -1), new Function0() { // from class: com.zentraedi.comic.activity.k8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OfflineComicMainActivity.u5(this.a, i6Var);
            }
        }, (String) i6Var.u0().get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u5(OfflineComicMainActivity offlineComicMainActivity, final com.zentraedi.comic.viewmodel.i6 i6Var) {
        offlineComicMainActivity.T4().e(CollectionsKt.arrayListOf(String.valueOf(i6Var.u0().get())), new Function1() { // from class: com.zentraedi.comic.activity.l8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OfflineComicMainActivity.v5(i6Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v5(com.zentraedi.comic.viewmodel.i6 i6Var, boolean z) {
        if (z) {
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            ComicListDeleteEvent comicListDeleteEvent = new ComicListDeleteEvent();
            comicListDeleteEvent.setOption(ComicListDeleteEvent.OPTION_TYPE_DELETE_FILE);
            comicListDeleteEvent.setComicThumbItemViewModels(CollectionsKt.mutableListOf(i6Var));
            cVarF.q(comicListDeleteEvent);
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.io2), true);
        }
        return Unit.INSTANCE;
    }

    private final void w5() {
        U4().p(P4().getRoot(), Q4().getSortBy(), Q4().getOrder(), Q4().T(), true, 9);
    }

    private final boolean x5(String str) {
        List<ReadingRecord> listG = ig.k.a.G(str);
        if (com.zentraedi.basic.function.utils.j0.l(listG)) {
            return false;
        }
        Intrinsics.checkNotNull(listG);
        for (ReadingRecord readingRecord : listG) {
            if (readingRecord.getLocalDownload() && new File(com.zentraedi.comic.util.f.a.h(readingRecord.getComicId(), readingRecord.getComicNasPath())).exists()) {
                return true;
            }
        }
        return false;
    }

    public final void J4(@fo.k final com.zentraedi.comic.fragment.e2 comicFragment, @fo.k com.zentraedi.comic.impl.j impl) {
        Intrinsics.checkNotNullParameter(comicFragment, "comicFragment");
        Intrinsics.checkNotNullParameter(impl, "impl");
        impl.P(new Function1() { // from class: com.zentraedi.comic.activity.h8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OfflineComicMainActivity.K4(comicFragment, (com.zentraedi.business.addfile.n) obj);
            }
        });
        impl.N(new Function1() { // from class: com.zentraedi.comic.activity.i8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OfflineComicMainActivity.L4(this.a, (com.zentraedi.comic.viewmodel.i6) obj);
            }
        });
        impl.R(new Function0() { // from class: com.zentraedi.comic.activity.j8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OfflineComicMainActivity.M4(this.a, comicFragment);
            }
        });
    }

    @fo.k
    public final com.zentraedi.comic.databinding.a0 P4() {
        Object value = this.U.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (com.zentraedi.comic.databinding.a0) value;
    }

    @fo.k
    public final com.zentraedi.comic.viewmodel.b3 Q4() {
        return (com.zentraedi.comic.viewmodel.b3) this.V.getValue();
    }

    @fo.k
    public final String R4() {
        return this.a0;
    }

    @fo.k
    public final com.zentraedi.comic.business.p2 T4() {
        return (com.zentraedi.comic.business.p2) this.Z.getValue();
    }

    @fo.k
    public final com.zentraedi.comic.viewmodel.d3 V4() {
        return (com.zentraedi.comic.viewmodel.d3) this.W.getValue();
    }

    @fo.k
    public final com.zentraedi.comic.viewmodel.a3 W4() {
        return (com.zentraedi.comic.viewmodel.a3) this.X.getValue();
    }

    @fo.k
    public final String X4() {
        return this.T;
    }

    protected void onDestroy() {
        super/*com.zentraedi.business.activity.BaseActivity*/.onDestroy();
        org.greenrobot.eventbus.c.f().A(this);
    }

    public boolean onKeyDown(int i, @fo.k KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i != 4 || event.getRepeatCount() != 0 || !Intrinsics.areEqual(W4().editModel.get(), Boolean.TRUE)) {
            return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i, event);
        }
        N4();
        return true;
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@fo.k ComicListEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event.getMessage(), ComicListEvent.Companion.a())) {
            N4();
        }
    }

    public final void q5(@fo.l String str, @fo.l String str2) {
        for (Map.Entry<String, com.zentraedi.comic.fragment.e2> entry : O4().v().entrySet()) {
            entry.getValue().h3().X(str);
            entry.getValue().h3().V(str2);
            entry.getValue().b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void r3() {
        org.greenrobot.eventbus.c.f().v(this);
        this.c0 = getIntent().getBooleanExtra(f0, false);
    }

    protected void s3() {
        Y4();
        Z4();
        h5();
    }

    public final void s5(@fo.k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a0 = str;
    }
}
