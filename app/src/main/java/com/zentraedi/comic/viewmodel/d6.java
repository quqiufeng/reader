package com.zentraedi.comic.viewmodel;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.google.gson.Gson;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.tbs.reader.ITbsReader;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.request.FileSearchRequest;
import com.zentraedi.business.utils.t7;
import com.zentraedi.comic.activity.ComicSubDirActivity;
import com.zentraedi.comic.manager.ComicDownloadManager;
import com.zentraedi.comic.model.ComicDirListResponse;
import com.zentraedi.comic.model.ComicInfoBatchResponse;
import com.zentraedi.comic.model.ComicListModel;
import com.zentraedi.comic.request.ComicDirListRequest;
import com.zentraedi.comic.request.ComicInfoBatchRequest;
import com.zentraedi.comic.request.ComicSearchRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicSearchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicSearchViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicSearchViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,523:1\n1#2:524\n1563#3:525\n1634#3,3:526\n1869#3:529\n1869#3,2:530\n1870#3:532\n1869#3:533\n1870#3:536\n1869#3,2:548\n216#4,2:534\n116#5,11:537\n*S KotlinDebug\n*F\n+ 1 ComicSearchViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicSearchViewModel\n*L\n178#1:525\n178#1:526,3\n197#1:529\n198#1:530,2\n197#1:532\n233#1:533\n233#1:536\n272#1:548,2\n238#1:534,2\n251#1:537,11\n*E\n"})
public class d6 extends com.zentraedi.basic.function.viewmodel.f<Object> {

    @fo.k
    private final String a;
    private final int b;
    private int c;

    @fo.k
    private final ObservableField<String> d;

    @fo.k
    private final ObservableField<String> e;

    @fo.k
    private String f;

    @fo.k
    private final ObservableBoolean g;

    @fo.k
    private final ObservableBoolean h;

    @fo.k
    private final ObservableBoolean i;

    @fo.k
    private final ObservableBoolean j;

    @fo.k
    private final ObservableField<View.OnClickListener> k;

    @fo.k
    private final ObservableBoolean l;
    private int m;

    @fo.k
    private final me.tatarka.bindingcollectionadapter2.e<Object> n;

    @fo.k
    private final ObservableArrayList<Object> o;

    @fo.k
    private final me.tatarka.bindingcollectionadapter2.itembindings.b<Object> p;

    @fo.k
    private final c q;

    @fo.k
    private final d r;

    @fo.k
    private final Lazy s;

    @fo.k
    private final Lazy t;

    @fo.k
    private final kotlinx.coroutines.sync.a u;

    @fo.k
    private Function2<? super i6, ? super Integer, Unit> v;

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicSearchViewModel", f = "ComicSearchViewModel.kt", i = {0, 0, 0, 0}, l = {529}, m = "configViewMode", n = {"lastReadList", "comicDirListResponse", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 1)
    static final class a extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        int d;
        /* synthetic */ Object e;
        int g;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @fo.l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.e = obj;
            this.g |= IntCompanionObject.MIN_VALUE;
            return d6.this.x0(null, null, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicSearchViewModel$loadData$1", f = "ComicSearchViewModel.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3}, l = {119, 120, 126, 136}, m = "invokeSuspend", n = {"$this$launch", "deferred1", "deferred2", "$this$launch", "deferred1", "deferred2", "comicInfoModelsResponse", "$this$launch", "deferred1", "deferred2", "comicInfoModelsResponse", "comicDirListResponse", "searchComicTotalCount", "searchDirTotalCount", "$this$launch", "loadMoreData"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1"}, v = 1)
    static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        Object a;
        Object b;
        Object c;
        Object d;
        int e;
        int f;
        int g;
        private /* synthetic */ Object h;
        final /* synthetic */ boolean i;
        final /* synthetic */ d6 j;
        final /* synthetic */ com.zentraedi.business.listener.l k;

        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicSearchViewModel$loadData$1$deferred1$1", f = "ComicSearchViewModel.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super ResponseData<ComicListModel>>, Object> {
            int a;
            final /* synthetic */ d6 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d6 d6Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = d6Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                d6 d6Var = this.b;
                this.a = 1;
                Object objH1 = d6Var.H1(this);
                return objH1 == coroutine_suspended ? coroutine_suspended : objH1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super ResponseData<ComicListModel>> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.comic.viewmodel.d6$b$b, reason: collision with other inner class name */
        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicSearchViewModel$loadData$1$deferred2$1", f = "ComicSearchViewModel.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class C0130b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super ResponseData<ComicDirListResponse>>, Object> {
            int a;
            final /* synthetic */ d6 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0130b(d6 d6Var, Continuation<? super C0130b> continuation) {
                super(2, continuation);
                this.b = d6Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0130b(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                d6 d6Var = this.b;
                this.a = 1;
                Object objI1 = d6Var.I1(true, this);
                return objI1 == coroutine_suspended ? coroutine_suspended : objI1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super ResponseData<ComicDirListResponse>> continuation) {
                return ((C0130b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicSearchViewModel$loadData$1$loadMoreData$1", f = "ComicSearchViewModel.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super ResponseData<ComicDirListResponse>>, Object> {
            int a;
            final /* synthetic */ d6 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(d6 d6Var, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = d6Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                d6 d6Var = this.b;
                this.a = 1;
                Object objI1 = d6Var.I1(false, this);
                return objI1 == coroutine_suspended ? coroutine_suspended : objI1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super ResponseData<ComicDirListResponse>> continuation) {
                return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z, d6 d6Var, com.zentraedi.business.listener.l lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.i = z;
            this.j = d6Var;
            this.k = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.i, this.j, this.k, continuation);
            bVar.h = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:33:0x00c7 A[Catch: Exception -> 0x01a9, PHI: r2 r3 r4 r15
          0x00c7: PHI (r2v8 com.zentraedi.basic.component.http.ResponseData) = (r2v7 com.zentraedi.basic.component.http.ResponseData), (r2v12 com.zentraedi.basic.component.http.ResponseData) binds: [B:31:0x00c3, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x00c7: PHI (r3v8 kotlinx.coroutines.w0) = (r3v7 kotlinx.coroutines.w0), (r3v12 kotlinx.coroutines.w0) binds: [B:31:0x00c3, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x00c7: PHI (r4v5 kotlinx.coroutines.w0) = (r4v4 kotlinx.coroutines.w0), (r4v8 kotlinx.coroutines.w0) binds: [B:31:0x00c3, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x00c7: PHI (r15v17 java.lang.Object) = (r15v16 java.lang.Object), (r15v0 java.lang.Object) binds: [B:31:0x00c3, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x01a9, blocks: (B:9:0x001e, B:59:0x01a1, B:14:0x003b, B:53:0x0164, B:55:0x0170, B:17:0x004c, B:33:0x00c7, B:35:0x00d1, B:37:0x00d7, B:39:0x00df, B:41:0x00e5, B:45:0x0119, B:47:0x012f, B:50:0x0139, B:49:0x0135, B:20:0x0059, B:30:0x00a6, B:24:0x0062, B:26:0x0067, B:56:0x017a), top: B:64:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00d1 A[Catch: Exception -> 0x01a9, TryCatch #0 {Exception -> 0x01a9, blocks: (B:9:0x001e, B:59:0x01a1, B:14:0x003b, B:53:0x0164, B:55:0x0170, B:17:0x004c, B:33:0x00c7, B:35:0x00d1, B:37:0x00d7, B:39:0x00df, B:41:0x00e5, B:45:0x0119, B:47:0x012f, B:50:0x0139, B:49:0x0135, B:20:0x0059, B:30:0x00a6, B:24:0x0062, B:26:0x0067, B:56:0x017a), top: B:64:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:39:0x00df A[Catch: Exception -> 0x01a9, TryCatch #0 {Exception -> 0x01a9, blocks: (B:9:0x001e, B:59:0x01a1, B:14:0x003b, B:53:0x0164, B:55:0x0170, B:17:0x004c, B:33:0x00c7, B:35:0x00d1, B:37:0x00d7, B:39:0x00df, B:41:0x00e5, B:45:0x0119, B:47:0x012f, B:50:0x0139, B:49:0x0135, B:20:0x0059, B:30:0x00a6, B:24:0x0062, B:26:0x0067, B:56:0x017a), top: B:64:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:43:0x0116  */
        /* JADX WARN: Code duplicated, block: B:44:0x0118  */
        /* JADX WARN: Code duplicated, block: B:47:0x012f A[Catch: Exception -> 0x01a9, TryCatch #0 {Exception -> 0x01a9, blocks: (B:9:0x001e, B:59:0x01a1, B:14:0x003b, B:53:0x0164, B:55:0x0170, B:17:0x004c, B:33:0x00c7, B:35:0x00d1, B:37:0x00d7, B:39:0x00df, B:41:0x00e5, B:45:0x0119, B:47:0x012f, B:50:0x0139, B:49:0x0135, B:20:0x0059, B:30:0x00a6, B:24:0x0062, B:26:0x0067, B:56:0x017a), top: B:64:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x0135 A[Catch: Exception -> 0x01a9, TryCatch #0 {Exception -> 0x01a9, blocks: (B:9:0x001e, B:59:0x01a1, B:14:0x003b, B:53:0x0164, B:55:0x0170, B:17:0x004c, B:33:0x00c7, B:35:0x00d1, B:37:0x00d7, B:39:0x00df, B:41:0x00e5, B:45:0x0119, B:47:0x012f, B:50:0x0139, B:49:0x0135, B:20:0x0059, B:30:0x00a6, B:24:0x0062, B:26:0x0067, B:56:0x017a), top: B:64:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x0163  */
        /* JADX WARN: Code duplicated, block: B:55:0x0170 A[Catch: Exception -> 0x01a9, TryCatch #0 {Exception -> 0x01a9, blocks: (B:9:0x001e, B:59:0x01a1, B:14:0x003b, B:53:0x0164, B:55:0x0170, B:17:0x004c, B:33:0x00c7, B:35:0x00d1, B:37:0x00d7, B:39:0x00df, B:41:0x00e5, B:45:0x0119, B:47:0x012f, B:50:0x0139, B:49:0x0135, B:20:0x0059, B:30:0x00a6, B:24:0x0062, B:26:0x0067, B:56:0x017a), top: B:64:0x0010 }] */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x019e, code lost:
        
            if (r15 == r0) goto L58;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 442
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.viewmodel.d6.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class c implements k2.a {
        c() {
        }

        @Override // com.zentraedi.comic.viewmodel.k2.a
        public void a(View view, l0 model) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(model, "model");
            if (com.zentraedi.business.utils.m.c()) {
                return;
            }
            d6.this.y1(model);
        }
    }

    public static final class d implements k2.a {
        d() {
        }

        @Override // com.zentraedi.comic.viewmodel.k2.a
        public void a(View view, l0 model) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(model, "model");
            if (com.zentraedi.business.utils.m.c()) {
                return;
            }
            d6.this.i1(view, model);
        }
    }

    public static final class e implements com.zentraedi.business.utils.n4.f {
        final /* synthetic */ l0 b;

        e(l0 l0Var) {
            this.b = l0Var;
        }

        public void a(Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2)) {
                t7.j(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.f, (String) null, 1, (Object) null), bool2);
            }
            d6.this.y0(this.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(@fo.k Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.a = "ComicSearchViewModel";
        this.b = 20;
        this.c = 3;
        this.d = new ObservableField<>("");
        this.e = new ObservableField<>("");
        this.f = "";
        this.g = new ObservableBoolean(false);
        this.h = new ObservableBoolean();
        this.i = new ObservableBoolean(false);
        this.j = new ObservableBoolean(false);
        this.k = new ObservableField<>();
        this.l = new ObservableBoolean(false);
        this.n = new me.tatarka.bindingcollectionadapter2.e<>();
        this.o = new ObservableArrayList<>();
        me.tatarka.bindingcollectionadapter2.itembindings.b<Object> bVarD = new me.tatarka.bindingcollectionadapter2.itembindings.b().d(com.zentraedi.business.viewmodel.v.class, new me.tatarka.bindingcollectionadapter2.k() { // from class: com.zentraedi.comic.viewmodel.d5
            public final void onItemBind(me.tatarka.bindingcollectionadapter2.i iVar, int i, Object obj) {
                d6.W0(iVar, i, (com.zentraedi.business.viewmodel.v) obj);
            }
        }).d(l0.class, new me.tatarka.bindingcollectionadapter2.k() { // from class: com.zentraedi.comic.viewmodel.e5
            public final void onItemBind(me.tatarka.bindingcollectionadapter2.i iVar, int i, Object obj) {
                d6.X0(this.a, iVar, i, (l0) obj);
            }
        }).d(i6.class, new me.tatarka.bindingcollectionadapter2.k() { // from class: com.zentraedi.comic.viewmodel.f5
            public final void onItemBind(me.tatarka.bindingcollectionadapter2.i iVar, int i, Object obj) {
                d6.Y0(iVar, i, (i6) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bVarD, "map(...)");
        this.p = bVarD;
        this.q = new c();
        this.r = new d();
        this.s = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.g5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d6.b1();
            }
        });
        this.t = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.h5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d6.a1();
            }
        });
        this.u = kotlinx.coroutines.sync.g.b(false, 1, (Object) null);
        this.v = new Function2() { // from class: com.zentraedi.comic.viewmodel.i5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return d6.F1((i6) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zentraedi.basic.function.viewmodel.f, com.zentraedi.comic.viewmodel.i6] */
    private final i6 A0(ComicInfoModel comicInfoModel, final int i, int i2) {
        String name;
        ComicCategory category;
        final ?? i6Var = new i6();
        i6Var.viewType = i2;
        i6Var.m0().set(comicInfoModel.getCover());
        i6Var.q0().set(Boolean.valueOf(comicInfoModel.isOnShelf()));
        ObservableField<String> observableFieldH0 = i6Var.h0();
        ComicDirModel dir = comicInfoModel.getDir();
        if (dir == null || (category = dir.getCategory()) == null || (name = category.getName()) == null) {
            name = "";
        }
        observableFieldH0.set(name);
        i6Var.u0().set(comicInfoModel.getPath());
        i6Var.l0().set(comicInfoModel.getName());
        ObservableField<String> observableFieldX0 = i6Var.x0();
        com.zentraedi.business.utils.d5.a aVar = com.zentraedi.business.utils.d5.a;
        observableFieldX0.set(aVar.r(aVar.m(comicInfoModel.getPath())));
        i6Var.o0().set(!com.zentraedi.comic.util.f.a.i(comicInfoModel) ? 1 : 0);
        i6Var.s0().set(Boolean.valueOf(i == 1));
        i6Var.w0().set(this.f);
        i6Var.L0(comicInfoModel);
        i6Var.C0(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.r5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d6.B0(i6Var, view);
            }
        });
        i6Var.D0(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.s5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d6.C0(this.a, i6Var, i, view);
            }
        });
        return i6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(i6 i6Var, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        com.zentraedi.comic.delegate.m.a.u(i6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(d6 d6Var, i6 i6Var, int i, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        d6Var.v.invoke(i6Var, Integer.valueOf(i));
    }

    private final String D0(l0 l0Var) {
        int iY = com.zentraedi.business.utils.i5.a.y(l0Var.getPath());
        if (iY == 8 || iY == 10 || iY == 26 || iY == 33) {
            String path = l0Var.getPath();
            return path == null ? "" : path;
        }
        com.zentraedi.business.utils.d5.a aVar = com.zentraedi.business.utils.d5.a;
        String path2 = l0Var.getPath();
        return aVar.m(path2 != null ? path2 : "");
    }

    private final void D1(View view, final l0 l0Var) {
        H0().u0(view, l0Var.Q(), new Function0() { // from class: com.zentraedi.comic.viewmodel.p5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d6.E1(l0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E1(l0 l0Var) {
        ComicInfoModel comicInfoModelQ = l0Var.Q();
        l0Var.q0(comicInfoModelQ != null ? comicInfoModelQ.getName() : null);
        ComicInfoModel comicInfoModelQ2 = l0Var.Q();
        l0Var.o0(comicInfoModelQ2 != null ? comicInfoModelQ2.getCover() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void F0(ResponseData<ComicDirListResponse> responseData) {
        List<ComicDirModel> list;
        ComicDirListResponse data = responseData.getData();
        if (data == null || (list = data.getList()) == null) {
            return;
        }
        for (ComicDirModel comicDirModel : list) {
            ObservableArrayList<Object> observableArrayList = this.o;
            l0 l0Var = new l0(null, 1, 0 == true ? 1 : 0);
            l0Var.Z(comicDirModel);
            l0Var.V().set(this.f);
            observableArrayList.add(l0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F1(i6 i6Var, int i) {
        Intrinsics.checkNotNullParameter(i6Var, "<unused var>");
        return Unit.INSTANCE;
    }

    private final void G1(ComicInfoModel comicInfoModel, String str, boolean z) {
        ComicDownloadManager.ComicFileInfo comicFileInfo = new ComicDownloadManager.ComicFileInfo();
        comicFileInfo.setPath(str);
        comicFileInfo.setFolder(z);
        ComicDownloadManager.c.a().g(comicInfoModel, CollectionsKt.listOf(comicFileInfo));
    }

    private final com.zentraedi.comic.business.x1 H0() {
        return (com.zentraedi.comic.business.x1) this.t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicSearchRequest] */
    public final Object H1(Continuation<? super ResponseData<ComicListModel>> continuation) {
        ?? comicSearchRequest = new ComicSearchRequest();
        comicSearchRequest.setName(this.f);
        comicSearchRequest.setStart(0);
        comicSearchRequest.setNum(this.c);
        ResponseData responseDataK = com.zentraedi.business.http.a.b().k((com.zentraedi.basic.component.http.i) comicSearchRequest, ComicListModel.class);
        Intrinsics.checkNotNullExpressionValue(responseDataK, "sendNasRequestSync(...)");
        return responseDataK;
    }

    private final com.zentraedi.comic.business.a1 I0() {
        return (com.zentraedi.comic.business.a1) this.s.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x0165  */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicInfoBatchRequest] */
    public final Object I1(boolean z, Continuation<? super ResponseData<ComicDirListResponse>> continuation) {
        List<ComicInfoModel> list;
        ResponseData responseDataK = com.zentraedi.business.http.a.b().k(new ComicDirListRequest(null, 1, null), ComicDirListResponse.class);
        if (responseDataK == null || !responseDataK.isSuccess() || ((ComicDirListResponse) responseDataK.getData()).getTotal() == 0) {
            ResponseData responseData = new ResponseData();
            ComicDirListResponse comicDirListResponse = new ComicDirListResponse();
            comicDirListResponse.setTotal(0);
            responseData.setData(comicDirListResponse);
            return responseData;
        }
        List<ComicDirModel> list2 = ((ComicDirListResponse) responseDataK.getData()).getList();
        if (list2 == null) {
            ResponseData responseData2 = new ResponseData();
            ComicDirListResponse comicDirListResponse2 = new ComicDirListResponse();
            comicDirListResponse2.setTotal(0);
            responseData2.setData(comicDirListResponse2);
            return responseData2;
        }
        FileSearchRequest fileSearchRequest = new FileSearchRequest();
        fileSearchRequest.setName(this.f);
        fileSearchRequest.setNum(this.b);
        fileSearchRequest.setStart(z ? 0 : this.o.size() - this.m);
        List<ComicDirModel> list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((ComicDirModel) it.next()).getPath());
        }
        fileSearchRequest.setPaths(arrayList);
        fileSearchRequest.setFromApp("1");
        fileSearchRequest.setIgnoreLabel("1");
        ResponseData responseDataK2 = com.zentraedi.business.http.a.b().k(fileSearchRequest, ComicDirListResponse.class);
        if (responseDataK2 == null || !responseDataK2.isSuccess() || ((ComicDirListResponse) responseDataK2.getData()).getTotal() == 0) {
            ResponseData responseData3 = new ResponseData();
            ComicDirListResponse comicDirListResponse3 = new ComicDirListResponse();
            comicDirListResponse3.setTotal(0);
            responseData3.setData(comicDirListResponse3);
            return responseData3;
        }
        List<ComicDirModel> list4 = ((ComicDirListResponse) responseDataK2.getData()).getList();
        if (list4 == null) {
            ResponseData responseData4 = new ResponseData();
            ComicDirListResponse comicDirListResponse4 = new ComicDirListResponse();
            comicDirListResponse4.setTotal(0);
            responseData4.setData(comicDirListResponse4);
            return responseData4;
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        for (ComicDirModel comicDirModel : list4) {
            for (ComicDirModel comicDirModel2 : list3) {
                if (StringsKt.startsWith$default(comicDirModel.getPath(), comicDirModel2.getPath(), false, 2, (Object) null)) {
                    ComicDirModel comicDirModel3 = (ComicDirModel) new Gson().fromJson(comicDirModel.toJsonStr(), ComicDirModel.class);
                    comicDirModel3.setCategory(comicDirModel2.getCategory());
                    String strCreateKey = comicDirModel3.createKey(comicDirModel2.getId());
                    if (Intrinsics.areEqual(comicDirModel.isDir(), "1")) {
                        arrayList2.add(strCreateKey);
                        map.put(strCreateKey, comicDirModel3);
                    } else {
                        com.zentraedi.business.utils.i5 i5Var = com.zentraedi.business.utils.i5.a;
                        if (i5Var.n(comicDirModel.getPath())) {
                            arrayList2.add(strCreateKey);
                            map.put(strCreateKey, comicDirModel3);
                        } else if (3 == i5Var.f(comicDirModel.getPath())) {
                            arrayList2.add(com.zentraedi.business.utils.d5.a.m(strCreateKey));
                            map2.put(strCreateKey, comicDirModel3);
                        }
                    }
                    arrayList3.add(comicDirModel3);
                }
            }
        }
        ((ComicDirListResponse) responseDataK2.getData()).setList(arrayList3);
        ((ComicDirListResponse) responseDataK2.getData()).setTotal(((ComicDirListResponse) responseDataK2.getData()).getTotal());
        if (!arrayList2.isEmpty()) {
            com.zentraedi.business.http.a aVarB = com.zentraedi.business.http.a.b();
            ?? comicInfoBatchRequest = new ComicInfoBatchRequest();
            comicInfoBatchRequest.setList(arrayList2);
            ResponseData responseDataK3 = aVarB.k((com.zentraedi.basic.component.http.i) comicInfoBatchRequest, ComicInfoBatchResponse.class);
            if (responseDataK3 != null && responseDataK3.isSuccess() && ((ComicInfoBatchResponse) responseDataK3.getData()).getTotal() != 0 && (list = ((ComicInfoBatchResponse) responseDataK3.getData()).getList()) != null) {
                for (ComicInfoModel comicInfoModel : list) {
                    String key = comicInfoModel.getKey();
                    ComicDirModel comicDirModel4 = (ComicDirModel) map.get(key);
                    if (comicDirModel4 != null) {
                        comicDirModel4.setComic(comicInfoModel);
                    }
                    for (Map.Entry entry : map2.entrySet()) {
                        if (Intrinsics.areEqual(key, com.zentraedi.business.utils.d5.a.m((String) entry.getKey()))) {
                            ((ComicDirModel) entry.getValue()).setParentComic(comicInfoModel);
                        }
                    }
                }
            }
        }
        return responseDataK2;
    }

    private final List<com.zentraedi.basic.function.viewmodel.f<?>> S0(List<ComicInfoModel> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator<ComicInfoModel> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A0(it.next(), i, i2));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(me.tatarka.bindingcollectionadapter2.i iVar, int i, com.zentraedi.business.viewmodel.v vVar) {
        iVar.k(com.zentraedi.comic.a.A4, com.zentraedi.comic.q.l.gb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(d6 d6Var, me.tatarka.bindingcollectionadapter2.i iVar, int i, l0 l0Var) {
        iVar.c();
        iVar.k(com.zentraedi.comic.a.A4, com.zentraedi.comic.q.l.N7);
        iVar.b(com.zentraedi.comic.a.I, d6Var.q).b(com.zentraedi.comic.a.m2, d6Var.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y0(me.tatarka.bindingcollectionadapter2.i iVar, int i, i6 i6Var) {
        iVar.c();
        iVar.k(com.zentraedi.comic.a.G1, com.zentraedi.comic.q.l.Z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.x1 a1() {
        return new com.zentraedi.comic.business.x1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.a1 b1() {
        return new com.zentraedi.comic.business.a1();
    }

    private final void c1(View view, final l0 l0Var) {
        I0().a0(CollectionsKt.arrayListOf(String.valueOf(l0Var.getPath())), l0Var.P(), new Function1() { // from class: com.zentraedi.comic.viewmodel.t5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d6.d1(this.a, l0Var, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d1(d6 d6Var, l0 l0Var, boolean z) {
        if (z) {
            d6Var.o.remove(l0Var);
        }
        return Unit.INSTANCE;
    }

    private final void e1(View view, final l0 l0Var) {
        if (!l0Var.b0() && !com.zentraedi.business.utils.i5.a.n(l0Var.getPath())) {
            final String strD0 = D0(l0Var);
            com.zentraedi.comic.business.x1 x1VarH0 = H0();
            ComicDirModel comicDirModelP = l0Var.P();
            x1VarH0.T(comicDirModelP != null ? comicDirModelP.getRootDirId() : null, strD0, new Function2() { // from class: com.zentraedi.comic.viewmodel.m5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d6.g1(this.a, l0Var, strD0, ((Boolean) obj).booleanValue(), (ComicInfoModel) obj2);
                }
            });
            return;
        }
        if (l0Var.Q() == null) {
            com.zentraedi.comic.business.x1 x1VarH1 = H0();
            ComicDirModel comicDirModelP2 = l0Var.P();
            com.zentraedi.comic.business.x1.M(x1VarH1, comicDirModelP2 != null ? comicDirModelP2.getRootDirId() : null, l0Var.getPath(), null, new Function1() { // from class: com.zentraedi.comic.viewmodel.b5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d6.f1(l0Var, this, (ComicInfoModel) obj);
                }
            }, 4, null);
        } else {
            ComicInfoModel comicInfoModelQ = l0Var.Q();
            if (comicInfoModelQ != null) {
                G1(comicInfoModelQ, l0Var.getPath(), l0Var.b0());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f1(l0 l0Var, d6 d6Var, ComicInfoModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        l0Var.n0(it);
        d6Var.G1(it, l0Var.getPath(), l0Var.b0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g1(final d6 d6Var, final l0 l0Var, String str, boolean z, ComicInfoModel comicInfoModel) {
        if (!z) {
            return Unit.INSTANCE;
        }
        if (comicInfoModel == null) {
            com.zentraedi.comic.business.x1 x1VarH0 = d6Var.H0();
            ComicDirModel comicDirModelP = l0Var.P();
            com.zentraedi.comic.business.x1.M(x1VarH0, comicDirModelP != null ? comicDirModelP.getRootDirId() : null, str, null, new Function1() { // from class: com.zentraedi.comic.viewmodel.c5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d6.h1(this.a, l0Var, (ComicInfoModel) obj);
                }
            }, 4, null);
        } else {
            d6Var.G1(comicInfoModel, l0Var.getPath(), false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h1(d6 d6Var, l0 l0Var, ComicInfoModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        d6Var.G1(it, l0Var.getPath(), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i1(final View view, final l0 l0Var) {
        com.zentraedi.comic.business.a1 a1VarI0 = I0();
        String str = (String) l0Var.getTitle().get();
        boolean zB0 = l0Var.b0();
        ComicDirModel comicDirModelP = l0Var.P();
        String size = comicDirModelP != null ? comicDirModelP.getSize() : null;
        ComicInfoModel comicInfoModelQ = l0Var.Q();
        String cover = comicInfoModelQ != null ? comicInfoModelQ.getCover() : null;
        boolean z = l0Var.Q() != null;
        Boolean bool = (Boolean) l0Var.c0().get();
        Integer num = (Integer) l0Var.T().get();
        a1VarI0.I0(view, (1130496 & 2) != 0 ? null : str, (1130496 & 4) != 0 ? null : cover, (1130496 & 8) != 0 ? Boolean.FALSE : Boolean.valueOf(zB0), (1130496 & 16) != 0 ? null : size, (1130496 & 32) != 0 ? true : z, (1130496 & 64) != 0 ? false : true, (1130496 & 128) != 0 ? Boolean.FALSE : bool, (1130496 & 256) != 0 ? Boolean.FALSE : Boolean.valueOf(num != null && num.intValue() == 1), (1130496 & 512) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.v5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d6.k1(this.a, l0Var, view);
            }
        }, (1130496 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.w5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d6.m1(l0Var, this);
            }
        }, (1130496 & 2048) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.x5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d6.n1(this.a, l0Var, view);
            }
        }, (1130496 & 4096) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.y5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d6.p1(this.a, l0Var, view);
            }
        }, (1130496 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.z5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d6.r1(this.a, view, l0Var);
            }
        }, (1130496 & 16384) != 0 ? null : null, (1130496 & 32768) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.a6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d6.s1(this.a, l0Var);
            }
        }, (1130496 & 65536) != 0 ? null : null, (1130496 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.viewmodel.b6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d6.t1(this.a, l0Var);
            }
        }, (1130496 & 262144) == 0 ? l0Var.getPath() : null, (1130496 & CommonNetImpl.MAX_SEND_SIZE_IN_KB) != 0 ? Boolean.FALSE : Boolean.valueOf(l0Var.Q() != null), (1130496 & ITbsReader.READER_MENU_ID_RECENT_FILE_LIST) != 0 ? Boolean.FALSE : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k1(final d6 d6Var, final l0 l0Var, final View view) {
        d6Var.u0(l0Var, new Function1() { // from class: com.zentraedi.comic.viewmodel.c6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d6.l1(this.a, view, l0Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l1(d6 d6Var, View view, l0 l0Var, boolean z) {
        d6Var.v1(view, l0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m1(l0 l0Var, d6 d6Var) {
        ComicDirModel comicDirModelP = l0Var.P();
        if (comicDirModelP != null) {
            d6Var.I0().B0(comicDirModelP);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n1(final d6 d6Var, final l0 l0Var, final View view) {
        d6Var.u0(l0Var, new Function1() { // from class: com.zentraedi.comic.viewmodel.u5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d6.o1(this.a, view, l0Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o1(d6 d6Var, View view, l0 l0Var, boolean z) {
        d6Var.D1(view, l0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p1(final d6 d6Var, final l0 l0Var, final View view) {
        d6Var.u0(l0Var, new Function1() { // from class: com.zentraedi.comic.viewmodel.o5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d6.q1(this.a, view, l0Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q1(d6 d6Var, View view, l0 l0Var, boolean z) {
        d6Var.e1(view, l0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r1(d6 d6Var, View view, l0 l0Var) {
        d6Var.c1(view, l0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s1(d6 d6Var, l0 l0Var) {
        if (((Boolean) t7.d(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.f, (String) null, 1, (Object) null), Boolean.FALSE)).booleanValue()) {
            d6Var.y0(l0Var);
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
        n4VarA.r3(activityE, strN, strN2, strN3, false, strN4, strN5, d6Var.new e(l0Var));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t1(final d6 d6Var, final l0 l0Var) {
        com.zentraedi.comic.business.a1 a1VarI0 = d6Var.I0();
        ComicInfoModel comicInfoModelQ = l0Var.Q();
        a1VarI0.Y(comicInfoModelQ != null ? comicInfoModelQ.getId() : null, false, new Function1() { // from class: com.zentraedi.comic.viewmodel.n5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d6.u1(this.a, l0Var, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    private final void u0(final l0 l0Var, final Function1<? super Boolean, Unit> function1) {
        if (l0Var.Q() != null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        if (l0Var.b0() || com.zentraedi.business.utils.i5.a.n(l0Var.getPath())) {
            com.zentraedi.comic.delegate.m mVar = com.zentraedi.comic.delegate.m.a;
            ComicDirModel comicDirModelP = l0Var.P();
            com.zentraedi.comic.delegate.m.k(mVar, String.valueOf(comicDirModelP != null ? comicDirModelP.getRootDirId() : null), String.valueOf(l0Var.getPath()), null, new Function1() { // from class: com.zentraedi.comic.viewmodel.k5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d6.v0(l0Var, function1, (ComicInfoModel) obj);
                }
            }, 4, null);
            return;
        }
        ComicDirModel comicDirModelP2 = l0Var.P();
        if ((comicDirModelP2 != null ? comicDirModelP2.getParentComic() : null) != null) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        com.zentraedi.comic.delegate.m mVar2 = com.zentraedi.comic.delegate.m.a;
        ComicDirModel comicDirModelP3 = l0Var.P();
        String strValueOf = String.valueOf(comicDirModelP3 != null ? comicDirModelP3.getRootDirId() : null);
        String strZ = com.zentraedi.business.utils.l5.z(l0Var.getPath());
        Intrinsics.checkNotNullExpressionValue(strZ, "getParentFolderPath(...)");
        com.zentraedi.comic.delegate.m.k(mVar2, strValueOf, strZ, null, new Function1() { // from class: com.zentraedi.comic.viewmodel.l5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d6.w0(l0Var, function1, (ComicInfoModel) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u1(d6 d6Var, l0 l0Var, boolean z) {
        if (z) {
            d6Var.o.remove(l0Var);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(l0 l0Var, Function1 function1, ComicInfoModel comicInfoModel) {
        if (comicInfoModel != null) {
            l0Var.n0(comicInfoModel);
            function1.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    private final void v1(View view, final l0 l0Var) {
        com.zentraedi.comic.business.x1 x1VarH0 = H0();
        ComicInfoModel comicInfoModelQ = l0Var.Q();
        x1VarH0.F(comicInfoModelQ != null ? comicInfoModelQ.getId() : null, Boolean.valueOf(Intrinsics.areEqual(l0Var.c0().get(), Boolean.FALSE)), new Function1() { // from class: com.zentraedi.comic.viewmodel.j5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d6.w1(l0Var, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(l0 l0Var, Function1 function1, ComicInfoModel comicInfoModel) {
        if (comicInfoModel != null) {
            ComicDirModel comicDirModelP = l0Var.P();
            if (comicDirModelP != null) {
                comicDirModelP.setParentComic(comicInfoModel);
            }
            function1.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w1(l0 l0Var, boolean z) {
        if (z) {
            ObservableField<Boolean> observableFieldC0 = l0Var.c0();
            Boolean bool = (Boolean) l0Var.c0().get();
            observableFieldC0.set(Boolean.valueOf(!(bool != null ? bool.booleanValue() : false)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x0(List<ComicInfoModel> list, ResponseData<ComicDirListResponse> responseData, Continuation<? super Unit> continuation) {
        a aVar;
        kotlinx.coroutines.sync.a aVar2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.g;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                aVar.g = i - IntCompanionObject.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            aVar2 = this.u;
            aVar.a = list;
            aVar.b = responseData;
            aVar.c = aVar2;
            aVar.d = 0;
            aVar.g = 1;
            if (aVar2.t((Object) null, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) aVar.c;
            responseData = (ResponseData) aVar.b;
            List<ComicInfoModel> list2 = (List) aVar.a;
            ResultKt.throwOnFailure(obj);
            aVar2 = aVar3;
            list = list2;
        }
        try {
            E0(list);
            F0(responseData);
            return Unit.INSTANCE;
        } finally {
            aVar2.v((Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(l0 l0Var) {
        u0(l0Var, new Function1() { // from class: com.zentraedi.comic.viewmodel.q5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d6.z0(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(boolean z) {
        if (z) {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Kl2), true);
        } else {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Hl2), true);
        }
        return Unit.INSTANCE;
    }

    public final void A1(int i) {
        this.m = i;
    }

    public final void B1(@fo.k Function2<? super i6, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.v = function2;
    }

    public final void C1(int i) {
        this.c = i;
    }

    public final void E0(@fo.k List<ComicInfoModel> bookList) {
        Intrinsics.checkNotNullParameter(bookList, "bookList");
        List<com.zentraedi.basic.function.viewmodel.f<?>> listS0 = S0(bookList, 5, com.zentraedi.comic.constant.a.b.f9if.d());
        this.m = listS0.size();
        if (com.zentraedi.basic.function.utils.j0.l(listS0)) {
            return;
        }
        this.o.addAll(listS0);
    }

    @fo.k
    public final ObservableField<String> G0() {
        return this.d;
    }

    @fo.k
    public final ObservableField<View.OnClickListener> J0() {
        return this.k;
    }

    @fo.k
    public final kotlinx.coroutines.sync.a K0() {
        return this.u;
    }

    @fo.k
    public final String L0() {
        return this.f;
    }

    @fo.k
    public final ObservableField<String> M0() {
        return this.e;
    }

    public final int N0() {
        return this.m;
    }

    @fo.k
    public final ObservableBoolean O0() {
        return this.j;
    }

    @fo.k
    public final Function2<i6, Integer, Unit> P0() {
        return this.v;
    }

    public final int Q0() {
        return this.c;
    }

    @fo.k
    public final String R0() {
        return this.a;
    }

    @fo.k
    public final ObservableBoolean T0() {
        return this.h;
    }

    @fo.k
    public final ObservableBoolean U0() {
        return this.l;
    }

    @fo.k
    public final ObservableBoolean V0() {
        return this.i;
    }

    public final void Z0(boolean z, @fo.k com.zentraedi.business.listener.l resultDealListener) {
        Intrinsics.checkNotNullParameter(resultDealListener, "resultDealListener");
        kotlinx.coroutines.i.e(kotlinx.coroutines.a2.a, kotlinx.coroutines.g1.e(), (CoroutineStart) null, new b(z, this, resultDealListener, null), 2, (Object) null);
    }

    @fo.k
    public final me.tatarka.bindingcollectionadapter2.e<Object> getAdapter() {
        return this.n;
    }

    @fo.k
    public final me.tatarka.bindingcollectionadapter2.itembindings.b<Object> getItemBinding() {
        return this.p;
    }

    @fo.k
    public final ObservableArrayList<Object> getItems() {
        return this.o;
    }

    @fo.k
    public final ObservableBoolean getShowLoadingView() {
        return this.g;
    }

    public final boolean x1(@fo.k l0 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        if (!model.b0()) {
            return false;
        }
        ComicSubDirActivity.a aVar = ComicSubDirActivity.g0;
        Intrinsics.checkNotNull(activityE);
        ComicDirModel comicDirModelP = model.P();
        String rootDirId = comicDirModelP != null ? comicDirModelP.getRootDirId() : null;
        ComicDirModel comicDirModelP2 = model.P();
        ComicSubDirActivity.a.b(aVar, activityE, "0", rootDirId, comicDirModelP2 != null ? comicDirModelP2.getPath() : null, model.getPath(), null, model.Q(), 32, null);
        return true;
    }

    public final void y1(@fo.k l0 model) {
        String rootDirId;
        Intrinsics.checkNotNullParameter(model, "model");
        if (x1(model)) {
            return;
        }
        com.zentraedi.comic.delegate.m mVar = com.zentraedi.comic.delegate.m.a;
        ComicDirModel comicDirModelP = model.P();
        if (comicDirModelP == null || (rootDirId = comicDirModelP.getRootDirId()) == null) {
            rootDirId = "";
        }
        String path = model.getPath();
        com.zentraedi.comic.delegate.m.w(mVar, rootDirId, path == null ? "" : path, null, null, 12, null);
    }

    public final void z1(@fo.k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f = str;
    }
}
