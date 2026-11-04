package com.zentraedi.comic.viewmodel;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.fragment.app.FragmentActivity;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.tbs.reader.ITbsReader;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.request.FileListRequest;
import com.zentraedi.business.utils.t7;
import com.zentraedi.business.utils.v6;
import com.zentraedi.comic.event.ComicFilesDeleteEvent;
import com.zentraedi.comic.event.ComicHouseAddedEvent;
import com.zentraedi.comic.event.ComicHouseClearLastClickItemEvent;
import com.zentraedi.comic.event.ComicInfoCancelEvent;
import com.zentraedi.comic.event.ComicInfoCreateEvent;
import com.zentraedi.comic.event.ReadRecordUpdateSuccessForListEvent;
import com.zentraedi.comic.manager.ComicDownloadManager;
import com.zentraedi.comic.model.ComicDirListResponse;
import com.zentraedi.comic.request.ComicDirListRequest;
import com.zentraedi.comic.request.ComicInfoBatchRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicHouseListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHouseListViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicHouseListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,631:1\n1869#2,2:632\n1869#2,2:634\n1869#2,2:636\n1869#2,2:638\n1869#2,2:641\n1869#2,2:643\n1869#2,2:645\n1869#2,2:647\n1869#2,2:649\n1869#2,2:651\n1869#2,2:653\n774#2:655\n865#2,2:656\n1869#2,2:658\n1869#2,2:660\n1#3:640\n*S KotlinDebug\n*F\n+ 1 ComicHouseListViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicHouseListViewModel\n*L\n238#1:632,2\n254#1:634,2\n275#1:636,2\n377#1:638,2\n431#1:641,2\n447#1:643,2\n448#1:645,2\n465#1:647,2\n477#1:649,2\n495#1:651,2\n507#1:653,2\n523#1:655\n523#1:656,2\n546#1:658,2\n556#1:660,2\n*E\n"})
public final class k2 extends com.zentraedi.basic.function.viewmodel.f<Object> {
    private final int A;

    @fo.k
    private final ObservableField<String> B;

    @fo.k
    private String a;

    @fo.l
    private String b;

    @fo.l
    private String c;

    @fo.l
    private Boolean d;

    @fo.l
    private ComicInfoModel e;

    @fo.k
    private String f;

    @fo.k
    private final ObservableField<Boolean> g;

    @fo.k
    private final me.tatarka.bindingcollectionadapter2.e<Object> h;

    @fo.k
    private final ObservableArrayList<Object> i;

    @fo.k
    private final me.tatarka.bindingcollectionadapter2.itembindings.b<Object> j;

    @fo.l
    private Function3<? super Boolean, ? super Boolean, ? super Boolean, Unit> k;

    @fo.l
    private Function1<? super List<l0>, Unit> l;

    @fo.l
    private Function2<? super Integer, ? super Integer, Unit> m;

    @fo.k
    private ObservableField<Boolean> n;

    @fo.k
    private final Lazy o;

    @fo.k
    private final Lazy p;

    @fo.k
    private final d q;

    @fo.k
    private final e r;

    @fo.k
    private final Lazy s;

    @fo.k
    private final Lazy t;

    @fo.k
    private final Lazy u;

    @fo.k
    private final Lazy v;

    @fo.k
    private final Lazy w;

    @fo.k
    private final Lazy x;

    @fo.l
    private kotlinx.coroutines.k2 y;
    private int z;

    public interface a {
        void a(@fo.k View view, @fo.k l0 l0Var);
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHouseListViewModel$loadData$1", f = "ComicHouseListViewModel.kt", i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3}, l = {154, 179, 194, 218}, m = "invokeSuspend", n = {"$this$launch", "response", "$this$launch", "response", "pathList", "map", "infoResponse", "$this$launch", "response", "pathList", "map", "$this$launch", "response"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"}, v = 1)
    @SourceDebugExtension({"SMAP\nComicHouseListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHouseListViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicHouseListViewModel$loadData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,631:1\n1869#2,2:632\n1869#2,2:634\n*S KotlinDebug\n*F\n+ 1 ComicHouseListViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicHouseListViewModel$loadData$1\n*L\n164#1:632,2\n185#1:634,2\n*E\n"})
    static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        Object a;
        Object b;
        Object c;
        Object d;
        int e;
        private /* synthetic */ Object f;
        final /* synthetic */ boolean h;

        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHouseListViewModel$loadData$1$1", f = "ComicHouseListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ k2 b;
            final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k2 k2Var, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = k2Var;
                this.c = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                k2.g1(this.b, this.c, false, false, 6, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.comic.viewmodel.k2$b$b, reason: collision with other inner class name */
        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHouseListViewModel$loadData$1$3", f = "ComicHouseListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class C0132b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ k2 b;
            final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0132b(k2 k2Var, boolean z, Continuation<? super C0132b> continuation) {
                super(2, continuation);
                this.b = k2Var;
                this.c = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0132b(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                k2.g1(this.b, this.c, false, false, 6, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((C0132b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHouseListViewModel$loadData$1$5", f = "ComicHouseListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        @SourceDebugExtension({"SMAP\nComicHouseListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHouseListViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicHouseListViewModel$loadData$1$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,631:1\n1869#2,2:632\n*S KotlinDebug\n*F\n+ 1 ComicHouseListViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicHouseListViewModel$loadData$1$5\n*L\n198#1:632,2\n*E\n"})
        static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ boolean b;
            final /* synthetic */ k2 c;
            final /* synthetic */ ResponseData<ComicDirListResponse> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(boolean z, k2 k2Var, ResponseData<ComicDirListResponse> responseData, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = z;
                this.c = k2Var;
                this.d = responseData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.b, this.c, this.d, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00e5  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z;
                List<ComicDirModel> list;
                List<ComicDirModel> list2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.b) {
                    this.c.getItems().clear();
                }
                ComicDirListResponse data = this.d.getData();
                if (data != null && (list2 = data.getList()) != null) {
                    k2 k2Var = this.c;
                    for (ComicDirModel comicDirModel : list2) {
                        ObservableArrayList<Object> items = k2Var.getItems();
                        l0 l0Var = new l0(k2Var.I0());
                        l0Var.k0(!TextUtils.isEmpty(k2Var.getParentPath()));
                        comicDirModel.setParentComic(k2Var.X0());
                        l0Var.Z(comicDirModel);
                        l0Var.i0(k2Var.J0());
                        l0Var.W().set(k2Var.Y0().get());
                        l0Var.setClickItemPath(k2Var.M0());
                        items.add(l0Var);
                    }
                }
                this.c.U1(this.d.getData().getTotal());
                Function2<Integer, Integer, Unit> function2B1 = this.c.b1();
                if (function2B1 != null) {
                    function2B1.invoke(Boxing.boxInt(this.d.getData().getTotal()), Boxing.boxInt(this.c.getItems().size()));
                }
                if (!TextUtils.isEmpty(this.c.getParentPath())) {
                    ComicDirListResponse data2 = this.d.getData();
                    z = ((data2 == null || (list = data2.getList()) == null) ? 0 : list.size()) < this.c.A;
                }
                this.c.f1(this.b, z, true);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHouseListViewModel$loadData$1$6", f = "ComicHouseListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class d extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ k2 b;
            final /* synthetic */ boolean c;
            final /* synthetic */ ResponseData<ComicDirListResponse> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(k2 k2Var, boolean z, ResponseData<ComicDirListResponse> responseData, Continuation<? super d> continuation) {
                super(2, continuation);
                this.b = k2Var;
                this.c = z;
                this.d = responseData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                k2.g1(this.b, this.c, false, false, 2, null);
                com.zentraedi.basic.function.ui.toast.a.A(this.d.getMsg());
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((d) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z, Continuation<? super b> continuation) {
            super(2, continuation);
            this.h = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = k2.this.new b(this.h, continuation);
            bVar.f = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0125, code lost:
        
            if (kotlinx.coroutines.i.h(r3, r4, r13) == r1) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x01de, code lost:
        
            if (kotlinx.coroutines.i.h(r4, r8, r13) == r1) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x025a, code lost:
        
            if (kotlinx.coroutines.i.h(r5, r7, r13) == r1) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0288, code lost:
        
            if (kotlinx.coroutines.i.h(r4, r5, r13) == r1) goto L82;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 654
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.viewmodel.k2.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class c implements com.zentraedi.business.utils.n4.f {
        final /* synthetic */ View b;

        c(View view) {
            this.b = view;
        }

        public void a(Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2)) {
                t7.j(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.g, (String) null, 1, (Object) null), bool2);
            }
            k2 k2Var = k2.this;
            View view = this.b;
            Intrinsics.checkNotNull(view);
            k2Var.Z1(view);
        }
    }

    @SourceDebugExtension({"SMAP\nComicHouseListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHouseListViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicHouseListViewModel$mItemClickListener$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,631:1\n360#2,7:632\n*S KotlinDebug\n*F\n+ 1 ComicHouseListViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicHouseListViewModel$mItemClickListener$1\n*L\n114#1:632,7\n*E\n"})
    public static final class d implements a {
        d() {
        }

        @Override // com.zentraedi.comic.viewmodel.k2.a
        public void a(View view, l0 model) {
            int i = 0;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(model, "model");
            if (Intrinsics.areEqual(k2.this.Y0().get(), Boolean.TRUE)) {
                model.X().set(Boolean.valueOf(Intrinsics.areEqual(model.X().get(), Boolean.FALSE)));
                Function1<List<l0>, Unit> function1Z0 = k2.this.Z0();
                if (function1Z0 != null) {
                    function1Z0.invoke(CollectionsKt.arrayListOf(model));
                    return;
                }
                return;
            }
            if (com.zentraedi.business.utils.m.c()) {
                return;
            }
            k2.this.j2(model.U());
            com.zentraedi.comic.delegate.m mVar = com.zentraedi.comic.delegate.m.a;
            for (Object obj : k2.this.getItems()) {
                if ((obj instanceof l0) && Intrinsics.areEqual(((l0) obj).getPath(), model.getPath())) {
                    mVar.t(model, i);
                }
                i++;
            }
            i = -1;
            mVar.t(model, i);
        }
    }

    public static final class e implements a {
        e() {
        }

        @Override // com.zentraedi.comic.viewmodel.k2.a
        public void a(View view, l0 model) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(model, "model");
            if (com.zentraedi.business.utils.m.c()) {
                return;
            }
            k2.this.j2(model.U());
            k2.this.u1(view, model);
        }
    }

    public static final class f implements com.zentraedi.business.utils.n4.f {
        final /* synthetic */ l0 b;

        f(l0 l0Var) {
            this.b = l0Var;
        }

        public void a(Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2)) {
                t7.j(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.f, (String) null, 1, (Object) null), bool2);
            }
            k2.this.F0(this.b);
        }
    }

    public k2() {
        super(com.zentraedi.basic.function.utils.a.c());
        this.a = "";
        Boolean bool = Boolean.FALSE;
        this.d = bool;
        this.f = com.zentraedi.comic.util.g.a.b();
        this.g = new ObservableField<>(bool);
        this.h = new me.tatarka.bindingcollectionadapter2.e<>();
        this.i = new ObservableArrayList<>();
        me.tatarka.bindingcollectionadapter2.itembindings.b<Object> bVarD = new me.tatarka.bindingcollectionadapter2.itembindings.b().d(com.zentraedi.business.viewmodel.v.class, new me.tatarka.bindingcollectionadapter2.k() { // from class: com.zentraedi.comic.viewmodel.q1
            public final void onItemBind(me.tatarka.bindingcollectionadapter2.i iVar, int i, Object obj) {
                k2.c1(iVar, i, (com.zentraedi.business.viewmodel.v) obj);
            }
        }).d(l0.class, new me.tatarka.bindingcollectionadapter2.k() { // from class: com.zentraedi.comic.viewmodel.b2
            public final void onItemBind(me.tatarka.bindingcollectionadapter2.i iVar, int i, Object obj) {
                k2.d1(this.a, iVar, i, (l0) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bVarD, "map(...)");
        this.j = bVarD;
        this.n = new ObservableField<>(bool);
        this.o = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.d2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.h1();
            }
        });
        this.p = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.e2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.m1(this.a);
            }
        });
        this.q = new d();
        this.r = new e();
        this.s = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.f2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.q1();
            }
        });
        this.t = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.g2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.k1();
            }
        });
        this.u = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.i1();
            }
        });
        this.v = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.o1();
            }
        });
        this.w = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.j2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.l1(this.a);
            }
        });
        this.x = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.p1();
            }
        });
        this.A = 20;
        this.B = new ObservableField<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A1(final k2 k2Var, final l0 l0Var, final View view) {
        k2Var.C0(l0Var, new Function1() { // from class: com.zentraedi.comic.viewmodel.c2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.B1(this.a, view, l0Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B1(k2 k2Var, View view, l0 l0Var, boolean z) {
        k2Var.t1(view, l0Var);
        return Unit.INSTANCE;
    }

    private final void C0(final l0 l0Var, final Function1<? super Boolean, Unit> function1) {
        if (l0Var.Q() != null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        if (l0Var.b0() || com.zentraedi.business.utils.i5.a.n(l0Var.getPath())) {
            com.zentraedi.comic.delegate.m mVar = com.zentraedi.comic.delegate.m.a;
            ComicDirModel comicDirModelP = l0Var.P();
            com.zentraedi.comic.delegate.m.k(mVar, String.valueOf(comicDirModelP != null ? comicDirModelP.getRootDirId() : null), String.valueOf(l0Var.getPath()), null, new Function1() { // from class: com.zentraedi.comic.viewmodel.x1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.D0(this.a, l0Var, function1, (ComicInfoModel) obj);
                }
            }, 4, null);
        } else {
            if (this.e != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            com.zentraedi.comic.delegate.m mVar2 = com.zentraedi.comic.delegate.m.a;
            ComicDirModel comicDirModelP2 = l0Var.P();
            String strValueOf = String.valueOf(comicDirModelP2 != null ? comicDirModelP2.getRootDirId() : null);
            String strZ = com.zentraedi.business.utils.l5.z(l0Var.getPath());
            Intrinsics.checkNotNullExpressionValue(strZ, "getParentFolderPath(...)");
            com.zentraedi.comic.delegate.m.k(mVar2, strValueOf, strZ, null, new Function1() { // from class: com.zentraedi.comic.viewmodel.y1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.E0(this.a, function1, (ComicInfoModel) obj);
                }
            }, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C1(k2 k2Var, View view, l0 l0Var) {
        k2Var.r1(view, l0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D0(k2 k2Var, l0 l0Var, Function1 function1, ComicInfoModel comicInfoModel) {
        if (comicInfoModel != null) {
            if (!TextUtils.isEmpty(k2Var.c)) {
                ComicDirModel comicDirModelP = l0Var.P();
                comicInfoModel.setDirFromOuter(comicDirModelP != null ? comicDirModelP.isDir() : null);
            }
            l0Var.n0(comicInfoModel);
            function1.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D1(final k2 k2Var, final l0 l0Var) {
        k2Var.C0(l0Var, new Function1() { // from class: com.zentraedi.comic.viewmodel.u1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.E1(this.a, l0Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E0(k2 k2Var, Function1 function1, ComicInfoModel comicInfoModel) {
        if (comicInfoModel != null) {
            k2Var.e = comicInfoModel;
            function1.invoke(Boolean.TRUE);
            k2Var.S1();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E1(k2 k2Var, l0 l0Var, boolean z) {
        k2Var.I1(l0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0(l0 l0Var) {
        C0(l0Var, new Function1() { // from class: com.zentraedi.comic.viewmodel.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.G0(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F1(k2 k2Var, l0 l0Var) {
        if (((Boolean) t7.d(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.f, (String) null, 1, (Object) null), Boolean.FALSE)).booleanValue()) {
            k2Var.F0(l0Var);
            return Unit.INSTANCE;
        }
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        com.zentraedi.business.utils.n4 n4VarA = com.zentraedi.business.utils.n4.c.a();
        Intrinsics.checkNotNull(activityE);
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.PJ);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Mo2);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        String strN4 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx);
        Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
        String strN5 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.zx);
        Intrinsics.checkNotNullExpressionValue(strN5, "getString(...)");
        n4VarA.r3(activityE, strN, strN2, strN3, false, strN4, strN5, k2Var.new f(l0Var));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G0(boolean z) {
        if (z) {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Kl2), true);
        } else {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Hl2), true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G1(k2 k2Var, final l0 l0Var) {
        com.zentraedi.comic.business.a1 a1VarV0 = k2Var.V0();
        ComicInfoModel comicInfoModelQ = l0Var.Q();
        a1VarV0.Y(comicInfoModelQ != null ? comicInfoModelQ.getId() : null, false, new Function1() { // from class: com.zentraedi.comic.viewmodel.k1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.H1(l0Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H1(l0 l0Var, boolean z) {
        ComicDirModel comicDirModelP;
        if (z && (comicDirModelP = l0Var.P()) != null) {
            comicDirModelP.setComic((ComicInfoModel) null);
        }
        return Unit.INSTANCE;
    }

    private final void I1(l0 l0Var) {
        this.n.set(Boolean.TRUE);
        com.zentraedi.comic.business.m mVarP0 = P0();
        String path = l0Var.getPath();
        if (path == null) {
            path = "";
        }
        mVarP0.v(path, this.e, true, new com.zentraedi.business.listener.l() { // from class: com.zentraedi.comic.viewmodel.i1
            public final void continueDo() {
                k2.J1(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(k2 k2Var) {
        k2Var.n.set(Boolean.FALSE);
    }

    private final void K1(View view, l0 l0Var) {
        com.zentraedi.comic.business.x1 x1VarQ0 = Q0();
        ComicInfoModel comicInfoModelQ = l0Var.Q();
        com.zentraedi.comic.business.x1.G(x1VarQ0, comicInfoModelQ != null ? comicInfoModelQ.getId() : null, Boolean.valueOf(Intrinsics.areEqual(l0Var.c0().get(), Boolean.FALSE)), null, 4, null);
    }

    private final void N1(final l0 l0Var, final String str) {
        com.zentraedi.comic.delegate.m mVar = com.zentraedi.comic.delegate.m.a;
        ComicDirModel comicDirModelP = l0Var.P();
        com.zentraedi.comic.delegate.m.k(mVar, String.valueOf(comicDirModelP != null ? comicDirModelP.getRootDirId() : null), str, null, new Function1() { // from class: com.zentraedi.comic.viewmodel.h1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.O1(str, l0Var, this, (ComicInfoModel) obj);
            }
        }, 4, null);
    }

    private final com.zentraedi.comic.business.b O0() {
        return (com.zentraedi.comic.business.b) this.o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0024  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    public static final Unit O1(String str, l0 l0Var, k2 k2Var, ComicInfoModel comicInfoModel) {
        int iF;
        String strY;
        String strY2;
        if (comicInfoModel != null) {
            l0Var.n0(comicInfoModel);
        }
        if (TextUtils.isEmpty(comicInfoModel != null ? comicInfoModel.getCover() : null)) {
            com.zentraedi.business.utils.i5 i5Var = com.zentraedi.business.utils.i5.a;
            iF = i5Var.f(str);
            strY = com.zentraedi.comic.m.y(str);
            if ((8 != iF || 26 == iF || iF == 10 || iF == 33) && new File(strY).exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("文件封面 comicDir name = ");
                sb.append(comicInfoModel != null ? comicInfoModel.getName() : null);
                sb.append("    封面本地路径 ======== ");
                sb.append(strY);
                nd.a.c("setCoverToNas", sb.toString());
                com.zentraedi.comic.business.h hVarB = com.zentraedi.comic.business.h.g.b();
                String absolutePath = new File(strY).getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                hVarB.m(absolutePath, comicInfoModel);
            } else if (l0Var.b0()) {
                String strD = com.zentraedi.comic.util.c.a.d(str);
                if (TextUtils.isEmpty(strD)) {
                    return Unit.INSTANCE;
                }
                int iF2 = i5Var.f(strD);
                String str2 = "";
                if (!v6.o(strD) && 3 == iF2) {
                    com.zentraedi.comic.business.m mVarP0 = k2Var.P0();
                    if (strD == null) {
                        strD = "";
                    }
                    com.zentraedi.comic.business.m.w(mVarP0, strD, comicInfoModel, false, null, 8, null);
                    return Unit.INSTANCE;
                }
                if (strD != null && (strY2 = com.zentraedi.comic.m.y(strD)) != null) {
                    str2 = strY2;
                }
                if (new File(str2).exists()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("comicDir name = ");
                    sb2.append(comicInfoModel != null ? comicInfoModel.getName() : null);
                    sb2.append("    封面本地路径 ======== ");
                    sb2.append(str2);
                    nd.a.c("setCoverToNas", sb2.toString());
                    com.zentraedi.comic.business.h hVarB2 = com.zentraedi.comic.business.h.g.b();
                    String absolutePath2 = new File(str2).getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
                    hVarB2.m(absolutePath2, comicInfoModel);
                }
            }
        } else {
            if (TextUtils.equals(comicInfoModel != null ? comicInfoModel.getCover() : null, "_")) {
                com.zentraedi.business.utils.i5 i5Var2 = com.zentraedi.business.utils.i5.a;
                iF = i5Var2.f(str);
                strY = com.zentraedi.comic.m.y(str);
                if (8 != iF) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("文件封面 comicDir name = ");
                    sb3.append(comicInfoModel != null ? comicInfoModel.getName() : null);
                    sb3.append("    封面本地路径 ======== ");
                    sb3.append(strY);
                    nd.a.c("setCoverToNas", sb3.toString());
                    com.zentraedi.comic.business.h hVarB3 = com.zentraedi.comic.business.h.g.b();
                    String absolutePath3 = new File(strY).getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath3, "getAbsolutePath(...)");
                    hVarB3.m(absolutePath3, comicInfoModel);
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("文件封面 comicDir name = ");
                    sb4.append(comicInfoModel != null ? comicInfoModel.getName() : null);
                    sb4.append("    封面本地路径 ======== ");
                    sb4.append(strY);
                    nd.a.c("setCoverToNas", sb4.toString());
                    com.zentraedi.comic.business.h hVarB4 = com.zentraedi.comic.business.h.g.b();
                    String absolutePath4 = new File(strY).getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath4, "getAbsolutePath(...)");
                    hVarB4.m(absolutePath4, comicInfoModel);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final com.zentraedi.comic.business.m P0() {
        return (com.zentraedi.comic.business.m) this.u.getValue();
    }

    private final com.zentraedi.comic.business.x1 Q0() {
        return (com.zentraedi.comic.business.x1) this.t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComicDirListRequest R0() {
        return (ComicDirListRequest) this.w.getValue();
    }

    private final com.zentraedi.business.viewmodel.v S0() {
        return (com.zentraedi.business.viewmodel.v) this.p.getValue();
    }

    private final void S1() {
        ComicDirModel comicDirModelP;
        for (Object obj : this.i) {
            if ((obj instanceof l0) && (comicDirModelP = ((l0) obj).P()) != null) {
                comicDirModelP.setParentComic(this.e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FileListRequest T0() {
        return (FileListRequest) this.v.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComicInfoBatchRequest U0() {
        return (ComicInfoBatchRequest) this.x.getValue();
    }

    private final com.zentraedi.comic.business.a1 V0() {
        return (com.zentraedi.comic.business.a1) this.s.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(View view) {
        com.zentraedi.comic.business.b bVarO0 = O0();
        FragmentActivity fragmentActivityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNull(fragmentActivityE, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        com.zentraedi.comic.business.b.g(bVarO0, fragmentActivityE, view, this.a, null, new Function0() { // from class: com.zentraedi.comic.viewmodel.a2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.a2(this.a);
            }
        }, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a2(k2 k2Var) {
        org.greenrobot.eventbus.c.f().q(new ComicHouseAddedEvent(k2Var.a));
        return Unit.INSTANCE;
    }

    private final void b2(View view, l0 l0Var) {
        com.zentraedi.comic.business.x1.v0(Q0(), view, l0Var.Q(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c1(me.tatarka.bindingcollectionadapter2.i iVar, int i, com.zentraedi.business.viewmodel.v vVar) {
        iVar.k(com.zentraedi.comic.a.A4, com.zentraedi.comic.q.l.gb);
    }

    private final void c2(ComicInfoModel comicInfoModel, String str, boolean z) {
        ComicDownloadManager.ComicFileInfo comicFileInfo = new ComicDownloadManager.ComicFileInfo();
        comicFileInfo.setPath(str);
        comicFileInfo.setFolder(z);
        ComicDownloadManager.c.a().g(comicInfoModel, CollectionsKt.listOf(comicFileInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d1(k2 k2Var, me.tatarka.bindingcollectionadapter2.i iVar, int i, l0 l0Var) {
        iVar.c();
        String strS = l0Var.S();
        com.zentraedi.comic.constant.a.e.C0115a c0115a = com.zentraedi.comic.constant.a.e.Af;
        if (Intrinsics.areEqual(strS, c0115a.b())) {
            iVar.k(com.zentraedi.comic.a.A4, com.zentraedi.comic.q.l.N7);
        } else if (Intrinsics.areEqual(strS, c0115a.a())) {
            iVar.k(com.zentraedi.comic.a.A4, com.zentraedi.comic.q.l.M7);
        }
        iVar.b(com.zentraedi.comic.a.I, k2Var.q).b(com.zentraedi.comic.a.m2, k2Var.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f1(boolean z, boolean z2, boolean z3) {
        Function3<? super Boolean, ? super Boolean, ? super Boolean, Unit> function3 = this.k;
        if (function3 != null) {
            function3.invoke(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
        }
        if (this.i.isEmpty()) {
            this.i.add(S0());
        }
    }

    static /* synthetic */ void g1(k2 k2Var, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        k2Var.f1(z, z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.b h1() {
        return new com.zentraedi.comic.business.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.m i1() {
        return new com.zentraedi.comic.business.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j2(String str) {
        this.B.set(str);
        if (TextUtils.isEmpty(this.c)) {
            org.greenrobot.eventbus.c.f().q(new ComicHouseClearLastClickItemEvent(this.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.x1 k1() {
        return new com.zentraedi.comic.business.x1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComicDirListRequest l1(k2 k2Var) {
        return new ComicDirListRequest(k2Var.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.business.viewmodel.v m1(final k2 k2Var) {
        com.zentraedi.business.viewmodel.v vVar = new com.zentraedi.business.viewmodel.v(k2Var.getApplication());
        if (TextUtils.isEmpty(k2Var.b)) {
            vVar.P().set(com.zentraedi.basic.function.utils.a.n(Intrinsics.areEqual(k2Var.a, "0") ? com.zentraedi.comic.q.C0124q.uK : com.zentraedi.comic.q.C0124q.bI));
        } else {
            vVar.P().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ep0));
        }
        vVar.N().set(Boolean.valueOf(TextUtils.isEmpty(k2Var.b)));
        vVar.Q(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k2.n1(this.a, view);
            }
        });
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n1(k2 k2Var, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (((Boolean) t7.d(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.g, (String) null, 1, (Object) null), Boolean.FALSE)).booleanValue()) {
            Intrinsics.checkNotNull(view);
            k2Var.Z1(view);
            return;
        }
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        com.zentraedi.business.utils.n4 n4VarA = com.zentraedi.business.utils.n4.c.a();
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
        n4VarA.r3(activityE, strN, strN2, strN3, false, strN4, strN5, k2Var.new c(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileListRequest o1() {
        return new FileListRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComicInfoBatchRequest p1() {
        return new ComicInfoBatchRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.a1 q1() {
        return new com.zentraedi.comic.business.a1();
    }

    private final void r1(View view, final l0 l0Var) {
        final ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(String.valueOf(l0Var.getPath()));
        V0().a0(arrayListArrayListOf, l0Var.P(), new Function1() { // from class: com.zentraedi.comic.viewmodel.j1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.s1(this.a, l0Var, arrayListArrayListOf, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s1(k2 k2Var, l0 l0Var, ArrayList arrayList, boolean z) {
        if (z) {
            k2Var.i.remove(l0Var);
            org.greenrobot.eventbus.c.f().q(new ComicFilesDeleteEvent(arrayList, Boolean.TRUE));
        }
        return Unit.INSTANCE;
    }

    private final void t1(View view, l0 l0Var) {
        if (l0Var.b0() || com.zentraedi.business.utils.i5.a.n(l0Var.getPath())) {
            ComicInfoModel comicInfoModelQ = l0Var.Q();
            if (comicInfoModelQ != null) {
                c2(comicInfoModelQ, l0Var.getPath(), l0Var.b0());
                return;
            }
            return;
        }
        ComicInfoModel comicInfoModel = this.e;
        if (comicInfoModel != null) {
            c2(comicInfoModel, l0Var.getPath(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1(final View view, final l0 l0Var) {
        com.zentraedi.comic.business.a1 a1VarV0 = V0();
        String str = (String) l0Var.getTitle().get();
        boolean zB0 = l0Var.b0();
        ComicDirModel comicDirModelP = l0Var.P();
        String size = comicDirModelP != null ? comicDirModelP.getSize() : null;
        ComicInfoModel comicInfoModelQ = l0Var.Q();
        a1VarV0.I0(view, (1130496 & 2) != 0 ? null : str, (1130496 & 4) != 0 ? null : comicInfoModelQ != null ? comicInfoModelQ.getCover() : null, (1130496 & 8) != 0 ? Boolean.FALSE : Boolean.valueOf(zB0), (1130496 & 16) != 0 ? null : size, (1130496 & 32) != 0, (1130496 & 64) != 0 ? false : false, (1130496 & 128) != 0 ? Boolean.FALSE : (Boolean) l0Var.c0().get(), (1130496 & 256) != 0 ? Boolean.FALSE : Boolean.valueOf(l0Var.e0()), (1130496 & 512) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.l1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.v1(this.a, l0Var, view);
            }
        }, (1130496 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.m1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.x1(l0Var, this);
            }
        }, (1130496 & 2048) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.n1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.y1(this.a, l0Var, view);
            }
        }, (1130496 & 4096) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.o1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.A1(this.a, l0Var, view);
            }
        }, (1130496 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.p1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.C1(this.a, view, l0Var);
            }
        }, (1130496 & 16384) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.r1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.D1(this.a, l0Var);
            }
        }, (1130496 & 32768) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.s1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.F1(this.a, l0Var);
            }
        }, (1130496 & 65536) != 0 ? null : null, (1130496 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.t1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.G1(this.a, l0Var);
            }
        }, (1130496 & 262144) == 0 ? l0Var.getPath() : null, (1130496 & CommonNetImpl.MAX_SEND_SIZE_IN_KB) != 0 ? Boolean.FALSE : Boolean.valueOf(l0Var.Q() != null), (1130496 & ITbsReader.READER_MENU_ID_RECENT_FILE_LIST) != 0 ? Boolean.FALSE : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v1(final k2 k2Var, final l0 l0Var, final View view) {
        k2Var.C0(l0Var, new Function1() { // from class: com.zentraedi.comic.viewmodel.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.w1(this.a, view, l0Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w1(k2 k2Var, View view, l0 l0Var, boolean z) {
        k2Var.K1(view, l0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x1(l0 l0Var, k2 k2Var) {
        ComicDirModel comicDirModelP = l0Var.P();
        if (comicDirModelP != null) {
            k2Var.V0().B0(comicDirModelP);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y1(final k2 k2Var, final l0 l0Var, final View view) {
        k2Var.C0(l0Var, new Function1() { // from class: com.zentraedi.comic.viewmodel.w1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.z1(this.a, view, l0Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z1(k2 k2Var, View view, l0 l0Var, boolean z) {
        k2Var.b2(view, l0Var);
        return Unit.INSTANCE;
    }

    public final void A0(@fo.k String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f = type;
        for (Object obj : this.i) {
            if (obj instanceof l0) {
                ((l0) obj).i0(type);
            }
        }
    }

    public final void B0(boolean z) {
        this.B.set((Object) null);
        this.g.set(Boolean.valueOf(z));
        for (Object obj : this.i) {
            if (obj instanceof l0) {
                ((l0) obj).W().set(Boolean.valueOf(z));
            }
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void H0(@fo.k ObservableArrayList<l0> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.z -= list.size();
        this.i.removeAll(list);
        this.h.notifyDataSetChanged();
        Function1<? super List<l0>, Unit> function1 = this.l;
        if (function1 != null) {
            function1.invoke(new ArrayList());
        }
        if (this.z < 0) {
            this.z = 0;
        }
        Function2<? super Integer, ? super Integer, Unit> function2 = this.m;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(this.z), Integer.valueOf(this.i.size()));
        }
    }

    @fo.k
    public final String I0() {
        return this.a;
    }

    @fo.k
    public final String J0() {
        return this.f;
    }

    @fo.l
    public final String K0() {
        return this.b;
    }

    @fo.l
    public final Boolean L0() {
        return this.d;
    }

    public final void L1(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.i) {
            if (obj instanceof l0) {
                ((l0) obj).X().set(Boolean.valueOf(z));
                if (z) {
                    arrayList.add(obj);
                }
            }
        }
        Function1<? super List<l0>, Unit> function1 = this.l;
        if (function1 != null) {
            function1.invoke(arrayList);
        }
    }

    @fo.k
    public final ObservableField<String> M0() {
        return this.B;
    }

    public final void M1(@fo.k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a = str;
    }

    @fo.l
    public final Function3<Boolean, Boolean, Boolean, Unit> N0() {
        return this.k;
    }

    public final void P1(@fo.k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f = str;
    }

    public final void Q1(@fo.l String str) {
        this.b = str;
    }

    public final void R1(@fo.l Boolean bool) {
        this.d = bool;
    }

    public final void T1(@fo.l Function3<? super Boolean, ? super Boolean, ? super Boolean, Unit> function3) {
        this.k = function3;
    }

    public final void U1(int i) {
        this.z = i;
    }

    public final void V1(@fo.l ComicInfoModel comicInfoModel) {
        this.e = comicInfoModel;
    }

    public final int W0() {
        return this.z;
    }

    public final void W1(@fo.l Function1<? super List<l0>, Unit> function1) {
        this.l = function1;
    }

    @fo.l
    public final ComicInfoModel X0() {
        return this.e;
    }

    public final void X1(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.n = observableField;
    }

    @fo.k
    public final ObservableField<Boolean> Y0() {
        return this.g;
    }

    public final void Y1(@fo.l Function2<? super Integer, ? super Integer, Unit> function2) {
        this.m = function2;
    }

    @fo.l
    public final Function1<List<l0>, Unit> Z0() {
        return this.l;
    }

    @fo.k
    public final ObservableField<Boolean> a1() {
        return this.n;
    }

    @fo.l
    public final Function2<Integer, Integer, Unit> b1() {
        return this.m;
    }

    public final void d2(@fo.k ComicInfoModel info) {
        Intrinsics.checkNotNullParameter(info, "info");
        for (Object obj : this.i) {
            if (obj instanceof l0) {
                l0 l0Var = (l0) obj;
                ComicInfoModel comicInfoModelQ = l0Var.Q();
                if (TextUtils.equals(comicInfoModelQ != null ? comicInfoModelQ.getId() : null, info.getId())) {
                    l0Var.o0(info.getCover());
                    return;
                }
            }
        }
    }

    public final boolean e1() {
        return this.i.contains(S0()) || this.i.isEmpty();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void e2(@fo.k ComicInfoCancelEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (TextUtils.isEmpty(this.c)) {
            for (Object obj : this.i) {
                if (obj instanceof l0) {
                    l0 l0Var = (l0) obj;
                    ComicDirModel comicDirModelP = l0Var.P();
                    if (TextUtils.equals(comicDirModelP != null ? comicDirModelP.createKey(this.b) : null, event.getInfo().getKey())) {
                        l0Var.L();
                        return;
                    }
                }
            }
            return;
        }
        String str = this.b;
        ComicDirModel dir = event.getInfo().getDir();
        if (TextUtils.equals(str, dir != null ? dir.getId() : null) && StringsKt.startsWith$default(event.getInfo().getPath(), String.valueOf(this.c), false, 2, (Object) null)) {
            for (Object obj2 : this.i) {
                if (obj2 instanceof l0) {
                    l0 l0Var2 = (l0) obj2;
                    ComicDirModel comicDirModelP2 = l0Var2.P();
                    if (TextUtils.equals(comicDirModelP2 != null ? comicDirModelP2.getPath() : null, event.getInfo().getPath())) {
                        l0Var2.L();
                        return;
                    }
                }
            }
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void f2(@fo.k ComicInfoCreateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (TextUtils.isEmpty(this.c)) {
            for (Object obj : this.i) {
                if (obj instanceof l0) {
                    l0 l0Var = (l0) obj;
                    ComicDirModel comicDirModelP = l0Var.P();
                    if (TextUtils.equals(comicDirModelP != null ? comicDirModelP.createKey(this.b) : null, event.getInfo().getKey())) {
                        l0Var.n0(event.getInfo());
                        return;
                    }
                }
            }
            return;
        }
        String str = this.b;
        ComicDirModel dir = event.getInfo().getDir();
        if (TextUtils.equals(str, dir != null ? dir.getId() : null) && StringsKt.startsWith$default(event.getInfo().getPath(), String.valueOf(this.c), false, 2, (Object) null)) {
            for (Object obj2 : this.i) {
                if (obj2 instanceof l0) {
                    l0 l0Var2 = (l0) obj2;
                    ComicDirModel comicDirModelP2 = l0Var2.P();
                    if (TextUtils.equals(comicDirModelP2 != null ? comicDirModelP2.getPath() : null, event.getInfo().getPath())) {
                        l0Var2.n0(event.getInfo());
                        return;
                    }
                }
            }
        }
    }

    public final void g2(@fo.l Integer num, @fo.l String str) {
        if (num == null || str == null) {
            return;
        }
        List listSplit$default = StringsKt.split$default(str, new String[]{","}, false, 0, 6, (Object) null);
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            StringsKt.trim((String) it.next()).toString();
        }
        for (Object obj : this.i) {
            if (obj instanceof l0) {
                l0 l0Var = (l0) obj;
                if (l0Var.Q() == null) {
                    continue;
                } else {
                    ComicInfoModel comicInfoModelQ = l0Var.Q();
                    if (listSplit$default.contains(String.valueOf(comicInfoModelQ != null ? comicInfoModelQ.getId() : null))) {
                        l0Var.r0(num.intValue());
                        return;
                    }
                }
            }
        }
    }

    @fo.k
    public final me.tatarka.bindingcollectionadapter2.e<Object> getAdapter() {
        return this.h;
    }

    @fo.k
    public final me.tatarka.bindingcollectionadapter2.itembindings.b<Object> getItemBinding() {
        return this.j;
    }

    @fo.k
    public final ObservableArrayList<Object> getItems() {
        return this.i;
    }

    @fo.l
    public final String getParentPath() {
        return this.c;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void h2(@fo.k List<String> paths) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        if (paths.isEmpty() || this.i.contains(S0())) {
            return;
        }
        ObservableArrayList<Object> observableArrayList = this.i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : observableArrayList) {
            if ((obj instanceof l0) && CollectionsKt.contains(paths, ((l0) obj).getPath())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i.add(S0());
                this.h.notifyDataSetChanged();
                return;
            }
            return;
        }
        this.i.removeAll(CollectionsKt.toSet(arrayList));
        if (this.i.isEmpty()) {
            this.i.add(S0());
        }
        this.h.notifyDataSetChanged();
    }

    public final void i2(@fo.k String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (TextUtils.equals(path, this.c)) {
            return;
        }
        if (TextUtils.isEmpty(this.c) || TextUtils.equals(this.c, com.zentraedi.business.utils.l5.z(path))) {
            for (IndexedValue indexedValue : CollectionsKt.withIndex((Iterable) this.i)) {
                if (indexedValue.getValue() instanceof l0) {
                    Object value = indexedValue.getValue();
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.zentraedi.comic.viewmodel.ComicDirViewModel");
                    if (TextUtils.equals(path, ((l0) value).getPath())) {
                        this.h.notifyItemChanged(indexedValue.getIndex());
                        Object value2 = indexedValue.getValue();
                        Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.zentraedi.comic.viewmodel.ComicDirViewModel");
                        N1((l0) value2, path);
                        return;
                    }
                }
            }
        }
    }

    public final void k2(@fo.k ReadRecordUpdateSuccessForListEvent event) {
        ComicInfoModel comicInfoModelQ;
        ComicInfoModel comicInfoModelQ2;
        Intrinsics.checkNotNullParameter(event, "event");
        if (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(event.getParentPath())) {
            for (Object obj : this.i) {
                if (obj instanceof l0) {
                    l0 l0Var = (l0) obj;
                    ComicInfoModel comicInfoModelQ3 = l0Var.Q();
                    if (TextUtils.equals(comicInfoModelQ3 != null ? comicInfoModelQ3.getId() : null, event.getComicId()) && (comicInfoModelQ = l0Var.Q()) != null) {
                        comicInfoModelQ.setProgress(event.getProgress());
                    }
                }
            }
            return;
        }
        String parentPath = event.getParentPath();
        if (parentPath == null || !TextUtils.equals(com.zentraedi.business.utils.l5.z(parentPath), this.c)) {
            return;
        }
        for (Object obj2 : this.i) {
            if (obj2 instanceof l0) {
                l0 l0Var2 = (l0) obj2;
                ComicInfoModel comicInfoModelQ4 = l0Var2.Q();
                if (TextUtils.equals(comicInfoModelQ4 != null ? comicInfoModelQ4.getId() : null, event.getComicId()) && (comicInfoModelQ2 = l0Var2.Q()) != null) {
                    comicInfoModelQ2.setProgress(event.getProgress());
                }
            }
        }
    }

    public final void loadData(boolean z) {
        kotlinx.coroutines.k2 k2Var = this.y;
        if (k2Var != null) {
            kotlinx.coroutines.k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
        }
        this.y = kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.c()), (CoroutineContext) null, (CoroutineStart) null, new b(z, null), 3, (Object) null);
    }

    @Override // com.zentraedi.basic.function.viewmodel.f
    public void onCleared() {
        super.onCleared();
        kotlinx.coroutines.k2 k2Var = this.y;
        if (k2Var != null) {
            kotlinx.coroutines.k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
        }
    }

    public final void setParentPath(@fo.l String str) {
        this.c = str;
    }
}
