package com.zentraedi.comic.viewmodel;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import androidx.databinding.ObservableField;
import com.google.gson.Gson;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.database.ComicLibCategoryEntity;
import com.zentraedi.business.database.ReadingRecord;
import com.zentraedi.business.event.ComicStartFlushEvent;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.model.KeyValueModel;
import com.zentraedi.business.request.KvCreateRequest;
import com.zentraedi.business.request.KvLoadRequest;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.comic.activity.ComicListDetailActivity;
import com.zentraedi.comic.activity.ComicReaderActivity;
import com.zentraedi.comic.activity.ComicSubDirActivity;
import com.zentraedi.comic.activity.OfflineComicDetailActivity;
import com.zentraedi.comic.activity.OfflineComicMainActivity;
import com.zentraedi.comic.event.ComicJumpLastestAddEvent;
import com.zentraedi.comic.model.ComicDirListResponse;
import com.zentraedi.comic.model.ComicListModel;
import com.zentraedi.comic.request.ComicDirListRequest;
import com.zentraedi.comic.request.ComicShelfRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHomeViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicHomeViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,598:1\n1563#2:599\n1634#2,2:600\n774#2:602\n865#2,2:603\n1636#2:605\n774#2:617\n865#2,2:618\n116#3,11:606\n*S KotlinDebug\n*F\n+ 1 ComicHomeViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicHomeViewModel\n*L\n164#1:599\n164#1:600,2\n166#1:602\n166#1:603,2\n164#1:605\n530#1:617\n530#1:618,2\n264#1:606,11\n*E\n"})
public final class b1 extends com.zentraedi.comic.viewmodel.c {

    @fo.l
    private View.OnClickListener g;
    private boolean i;

    @fo.k
    private final String b = "ComicHomeViewModel";

    @fo.k
    private List<com.zentraedi.basic.function.viewmodel.f<?>> c = new ArrayList();

    @fo.k
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.s0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b1.i0();
        }
    });
    private int e = 3;

    @fo.k
    private final kotlinx.coroutines.sync.a f = kotlinx.coroutines.sync.g.b(false, 1, (Object) null);

    @fo.k
    private Function2<? super i6, ? super Integer, Unit> h = new Function2() { // from class: com.zentraedi.comic.viewmodel.t0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return b1.P0((i6) obj, ((Integer) obj2).intValue());
        }
    };

    public static final class a implements com.zentraedi.business.utils.n4.j {
        a() {
        }

        public void confirmClick() {
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHomeViewModel", f = "ComicHomeViewModel.kt", i = {0, 0, 0, 0, 0}, l = {604}, m = "configViewMode", n = {"lastReadList", "shelfList", "editedList", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
    static final class b extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        int e;
        /* synthetic */ Object f;
        int h;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @fo.l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.f = obj;
            this.h |= IntCompanionObject.MIN_VALUE;
            return b1.this.l0(null, null, null, this);
        }
    }

    public static final class c extends com.zentraedi.business.http.b<KeyValueModel> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(b1 b1Var) {
            b1Var.J0();
            org.greenrobot.eventbus.c.f().q(new ComicStartFlushEvent((String) null, 1, (DefaultConstructorMarker) null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(b1 b1Var) {
            b1Var.J0();
            return Unit.INSTANCE;
        }

        public void onResult(ResponseData<KeyValueModel> responseData) {
            if (responseData != null && responseData.isSuccess() && TextUtils.isEmpty(responseData.getData().getValue())) {
                com.zentraedi.business.utils.n4 n4VarA = com.zentraedi.business.utils.n4.c.a();
                Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
                String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2);
                Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
                String str = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.OH) + "\n\n" + com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.wI) + "\n\n" + com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.fL);
                String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.gL);
                Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
                String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.EM);
                Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
                final b1 b1Var = b1.this;
                Function0 function0 = new Function0() { // from class: com.zentraedi.comic.viewmodel.c1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b1.c.c(b1Var);
                    }
                };
                final b1 b1Var2 = b1.this;
                n4VarA.T2(activityE, strN, str, strN2, strN3, function0, new Function0() { // from class: com.zentraedi.comic.viewmodel.d1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b1.c.d(b1Var2);
                    }
                }, com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.Lf));
            }
        }

        public void onServerError() {
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHomeViewModel$loadAllData$1", f = "ComicHomeViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4}, l = {110, 111, 112, 113, 115}, m = "invokeSuspend", n = {"$this$launch", "deferred1", "deferred2", "deferred3", "$this$launch", "deferred1", "deferred2", "deferred3", "latestReadList", "$this$launch", "deferred1", "deferred2", "deferred3", "latestReadList", "shelfList", "$this$launch", "deferred1", "deferred2", "deferred3", "latestReadList", "shelfList", "editedList", "$this$launch", "deferred1", "deferred2", "deferred3", "latestReadList", "shelfList", "editedList", "vmList"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, v = 1)
    static final class d extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        Object g;
        int h;
        private /* synthetic */ Object i;
        final /* synthetic */ com.zentraedi.business.listener.l k;

        @SourceDebugExtension({"SMAP\nComicHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHomeViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicHomeViewModel$loadAllData$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,598:1\n1#2:599\n*E\n"})
        public static final class a implements com.zentraedi.comic.fragment.e2.b {
            final /* synthetic */ List<com.zentraedi.basic.function.viewmodel.f<?>> a;
            final /* synthetic */ b1 b;
            final /* synthetic */ com.zentraedi.business.listener.l c;

            /* JADX INFO: renamed from: com.zentraedi.comic.viewmodel.b1$d$a$a, reason: collision with other inner class name */
            @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHomeViewModel$loadAllData$1$1$onResult$2", f = "ComicHomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            static final class C0128a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
                int a;
                final /* synthetic */ b1 b;
                final /* synthetic */ List<com.zentraedi.business.addfile.n> c;
                final /* synthetic */ List<com.zentraedi.basic.function.viewmodel.f<?>> d;
                final /* synthetic */ com.zentraedi.business.listener.l e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0128a(b1 b1Var, List<? extends com.zentraedi.business.addfile.n> list, List<com.zentraedi.basic.function.viewmodel.f<?>> list2, com.zentraedi.business.listener.l lVar, Continuation<? super C0128a> continuation) {
                    super(2, continuation);
                    this.b = b1Var;
                    this.c = list;
                    this.d = list2;
                    this.e = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0128a(this.b, this.c, this.d, this.e, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    List<com.zentraedi.business.addfile.n> list;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if ((this.b.s0() && ((list = this.c) == null || list.isEmpty())) || com.zentraedi.basic.function.utils.j0.l(this.d)) {
                        this.b.showEmpty.set(Boxing.boxBoolean(true));
                    } else {
                        this.b.showEmpty.set(Boxing.boxBoolean(false));
                        this.b.q0().U1(this.d);
                    }
                    this.e.continueDo();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                    return ((C0128a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            a(List<com.zentraedi.basic.function.viewmodel.f<?>> list, b1 b1Var, com.zentraedi.business.listener.l lVar) {
                this.a = list;
                this.b = b1Var;
                this.c = lVar;
            }

            @Override // com.zentraedi.comic.fragment.e2.b
            public void onError(String str, String str2) {
            }

            @Override // com.zentraedi.comic.fragment.e2.b
            public void onResult(List<? extends com.zentraedi.business.addfile.n> list) {
                if (list != null) {
                    this.a.addAll(list);
                }
                kotlinx.coroutines.i.e(kotlinx.coroutines.a2.a, kotlinx.coroutines.g1.e(), (CoroutineStart) null, new C0128a(this.b, list, this.a, this.c, null), 2, (Object) null);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHomeViewModel$loadAllData$1$deferred1$1", f = "ComicHomeViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super List<? extends ComicInfoModel>>, Object> {
            int a;
            final /* synthetic */ b1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(b1 b1Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = b1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super List<? extends ComicInfoModel>> continuation) {
                return invoke2(q0Var, (Continuation<? super List<ComicInfoModel>>) continuation);
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
                b1 b1Var = this.b;
                this.a = 1;
                Object objW0 = b1Var.W0(this);
                return objW0 == coroutine_suspended ? coroutine_suspended : objW0;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(kotlinx.coroutines.q0 q0Var, Continuation<? super List<ComicInfoModel>> continuation) {
                return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHomeViewModel$loadAllData$1$deferred2$1", f = "ComicHomeViewModel.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super List<? extends ComicInfoModel>>, Object> {
            int a;
            final /* synthetic */ b1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b1 b1Var, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = b1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super List<? extends ComicInfoModel>> continuation) {
                return invoke2(q0Var, (Continuation<? super List<ComicInfoModel>>) continuation);
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
                b1 b1Var = this.b;
                this.a = 1;
                Object objR0 = b1Var.R0(this);
                return objR0 == coroutine_suspended ? coroutine_suspended : objR0;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(kotlinx.coroutines.q0 q0Var, Continuation<? super List<ComicInfoModel>> continuation) {
                return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.comic.viewmodel.b1$d$d, reason: collision with other inner class name */
        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHomeViewModel$loadAllData$1$deferred3$1", f = "ComicHomeViewModel.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class C0129d extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super List<? extends ComicInfoModel>>, Object> {
            int a;
            final /* synthetic */ b1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0129d(b1 b1Var, Continuation<? super C0129d> continuation) {
                super(2, continuation);
                this.b = b1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0129d(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super List<? extends ComicInfoModel>> continuation) {
                return invoke2(q0Var, (Continuation<? super List<ComicInfoModel>>) continuation);
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
                b1 b1Var = this.b;
                this.a = 1;
                Object objQ0 = b1Var.Q0(this);
                return objQ0 == coroutine_suspended ? coroutine_suspended : objQ0;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(kotlinx.coroutines.q0 q0Var, Continuation<? super List<ComicInfoModel>> continuation) {
                return ((C0129d) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.zentraedi.business.listener.l lVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.k = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = b1.this.new d(this.k, continuation);
            dVar.i = obj;
            return dVar;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0137  */
        /* JADX WARN: Code duplicated, block: B:33:0x0162  */
        /* JADX WARN: Code duplicated, block: B:36:0x016e  */
        /* JADX WARN: Code duplicated, block: B:40:0x01a8  */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x01ee, code lost:
        
            if (r11.T0(r12, r17) == r1) goto L43;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 500
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.viewmodel.b1.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((d) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHomeViewModel$loadComicLibraryData$1", f = "ComicHomeViewModel.kt", i = {0, 0}, l = {80}, m = "invokeSuspend", n = {"$this$launch", "deferred"}, s = {"L$0", "L$1"}, v = 1)
    static final class e extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        Object a;
        int b;
        private /* synthetic */ Object c;
        final /* synthetic */ com.zentraedi.business.listener.l e;

        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHomeViewModel$loadComicLibraryData$1$deferred$1", f = "ComicHomeViewModel.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super List<? extends ComicDirModel>>, Object> {
            int a;
            final /* synthetic */ b1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b1 b1Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = b1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super List<? extends ComicDirModel>> continuation) {
                return invoke2(q0Var, (Continuation<? super List<ComicDirModel>>) continuation);
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
                b1 b1Var = this.b;
                this.a = 1;
                Object objS0 = b1Var.S0(this);
                return objS0 == coroutine_suspended ? coroutine_suspended : objS0;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(kotlinx.coroutines.q0 q0Var, Continuation<? super List<ComicDirModel>> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(com.zentraedi.business.listener.l lVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.e = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = b1.this.new e(this.e, continuation);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.c;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.w0 w0VarB = kotlinx.coroutines.i.b(q0Var, kotlinx.coroutines.g1.c(), (CoroutineStart) null, new a(b1.this, null), 2, (Object) null);
                this.c = SpillingKt.nullOutSpilledVariable(q0Var);
                this.a = SpillingKt.nullOutSpilledVariable(w0VarB);
                this.b = 1;
                obj = w0VarB.x(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            b1.this.L0(com.zentraedi.basic.function.utils.j0.l((List) obj));
            this.e.continueDo();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((e) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class f extends com.zentraedi.business.http.b<Object> {
        f() {
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
        }

        public void onServerError() {
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHomeViewModel", f = "ComicHomeViewModel.kt", i = {}, l = {140}, m = "syncRequestLatestRead", n = {}, s = {}, v = 1)
    static final class g extends ContinuationImpl {
        /* synthetic */ Object a;
        int c;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @fo.l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.a = obj;
            this.c |= IntCompanionObject.MIN_VALUE;
            return b1.this.W0(this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicHomeViewModel$syncRequestLatestRead$readingRecordDB$1", f = "ComicHomeViewModel.kt", i = {0}, l = {145}, m = "invokeSuspend", n = {"deferred"}, s = {"L$0"}, v = 1)
    static final class h extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super List<? extends ReadingRecord>>, Object> {
        Object a;
        int b;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(kotlinx.coroutines.x xVar, List list) {
            xVar.c(list);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super List<? extends ReadingRecord>> continuation) {
            return invoke2(q0Var, (Continuation<? super List<ReadingRecord>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.x xVarC = kotlinx.coroutines.z.c((kotlinx.coroutines.k2) null, 1, (Object) null);
            ig.k.a.m(new Function1() { // from class: com.zentraedi.comic.viewmodel.e1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return b1.h.e(xVarC, (List) obj2);
                }
            });
            this.a = SpillingKt.nullOutSpilledVariable(xVarC);
            this.b = 1;
            Object objX = xVarC.x(this);
            return objX == coroutine_suspended ? coroutine_suspended : objX;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlinx.coroutines.q0 q0Var, Continuation<? super List<ReadingRecord>> continuation) {
            return ((h) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final String A0(NasReadingRecordModule nasReadingRecordModule) {
        int position = (int) ((nasReadingRecordModule.getPosition() / nasReadingRecordModule.getCount()) * 100);
        StringBuilder sb = new StringBuilder();
        sb.append(position);
        sb.append('%');
        return sb.toString();
    }

    private final void B0(List<ComicInfoModel> list) {
        Application applicationC = com.zentraedi.basic.function.utils.a.c();
        Intrinsics.checkNotNullExpressionValue(applicationC, "getApplication(...)");
        j6 j6Var = new j6(applicationC);
        com.zentraedi.comic.constant.a.b.C0112a c0112a = com.zentraedi.comic.constant.a.b.f9if;
        j6Var.viewType = c0112a.f();
        j6Var.getTitleStr().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bb1));
        j6Var.Q(true);
        j6Var.P(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1.C0(view);
            }
        });
        this.c.add(j6Var);
        if (!com.zentraedi.basic.function.utils.j0.l(list)) {
            this.c.addAll(F0(list, 2, c0112a.d()));
            return;
        }
        j6Var.Q(false);
        j6Var.O().set(Boolean.FALSE);
        Application applicationC2 = com.zentraedi.basic.function.utils.a.c();
        Intrinsics.checkNotNullExpressionValue(applicationC2, "getApplication(...)");
        m0 m0Var = new m0(applicationC2);
        m0Var.L().set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.N4));
        m0Var.getTitleStr().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ep0));
        m0Var.N().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.sH));
        m0Var.M().set(Boolean.TRUE);
        this.c.add(m0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(View view) {
        ComicListDetailActivity.a aVar = ComicListDetailActivity.e0;
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
        aVar.a(activityE, 7);
    }

    private final List<com.zentraedi.basic.function.viewmodel.f<?>> F0(List<ComicInfoModel> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator<ComicInfoModel> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(n0(it.next(), i, i2));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0() {
        KvCreateRequest kvCreateRequest = new KvCreateRequest();
        String strA = com.zentraedi.basic.function.utils.r.a("refresh_cartoon2025" + com.zentraedi.business.w0.e + com.zentraedi.business.w0.a);
        Intrinsics.checkNotNullExpressionValue(strA, "md5(...)");
        kvCreateRequest.setK(strA);
        kvCreateRequest.setV("1");
        com.zentraedi.business.http.a.b().h(kvCreateRequest, new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P0(i6 i6Var, int i) {
        Intrinsics.checkNotNullParameter(i6Var, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicShelfRequest] */
    public final Object Q0(Continuation<? super List<ComicInfoModel>> continuation) {
        ComicListModel comicListModel;
        ?? comicShelfRequest = new ComicShelfRequest();
        comicShelfRequest.setSortby("ctime");
        comicShelfRequest.setOrder("desc");
        comicShelfRequest.setNum(this.e * 2);
        comicShelfRequest.setPage(0);
        ResponseData responseDataK = com.zentraedi.business.http.a.b().k((com.zentraedi.basic.component.http.i) comicShelfRequest, ComicListModel.class);
        if (responseDataK == null || (comicListModel = (ComicListModel) responseDataK.getData()) == null) {
            return null;
        }
        return comicListModel.getList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicShelfRequest] */
    public final Object R0(Continuation<? super List<ComicInfoModel>> continuation) {
        ComicListModel comicListModel;
        ?? comicShelfRequest = new ComicShelfRequest();
        comicShelfRequest.setOnShelf(Boxing.boxInt(1));
        comicShelfRequest.setSortby("uptime");
        comicShelfRequest.setOrder("desc");
        comicShelfRequest.setNum(this.e);
        comicShelfRequest.setPage(0);
        ResponseData responseDataK = com.zentraedi.business.http.a.b().k((com.zentraedi.basic.component.http.i) comicShelfRequest, ComicListModel.class);
        if (responseDataK == null || (comicListModel = (ComicListModel) responseDataK.getData()) == null) {
            return null;
        }
        return comicListModel.getList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object S0(Continuation<? super List<ComicDirModel>> continuation) {
        ComicDirListResponse comicDirListResponse;
        ResponseData responseDataK = com.zentraedi.business.http.a.b().k(new ComicDirListRequest("0"), ComicDirListResponse.class);
        if (responseDataK == null || (comicDirListResponse = (ComicDirListResponse) responseDataK.getData()) == null) {
            return null;
        }
        return comicDirListResponse.getList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T0(final com.zentraedi.comic.fragment.e2.b bVar, Continuation<? super Unit> continuation) {
        ig.k.a.m(new Function1() { // from class: com.zentraedi.comic.viewmodel.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b1.U0(this.a, bVar, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U0(b1 b1Var, com.zentraedi.comic.fragment.e2.b bVar, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ReadingRecord readingRecord = (ReadingRecord) it.next();
                if (readingRecord.getComicPath() != null && readingRecord.getLocalDownload()) {
                    File file = new File(com.zentraedi.comic.util.f.a.h(readingRecord.getComicId(), readingRecord.getComicNasPath()));
                    if (file.exists()) {
                        if (file.isDirectory()) {
                            File[] fileArrListFiles = file.listFiles();
                            if ((fileArrListFiles != null ? fileArrListFiles.length : 0) == 0) {
                                continue;
                            }
                        }
                        i6 i6VarN0 = b1Var.n0(b1Var.m0(readingRecord), 4, com.zentraedi.comic.constant.a.b.f9if.d());
                        i6VarN0.o0().set(0);
                        arrayList.add(i6VarN0);
                        if (arrayList.size() >= b1Var.e) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (com.zentraedi.basic.function.utils.j0.l(arrayList)) {
                bVar.onResult(null);
            } else {
                Application applicationC = com.zentraedi.basic.function.utils.a.c();
                Intrinsics.checkNotNullExpressionValue(applicationC, "getApplication(...)");
                j6 j6Var = new j6(applicationC);
                j6Var.viewType = com.zentraedi.comic.constant.a.b.f9if.f();
                j6Var.getTitleStr().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Xj0));
                j6Var.P(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.u0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        b1.V0(view);
                    }
                });
                b1Var.c.add(j6Var);
                bVar.onResult(arrayList);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V0(View view) {
        OfflineComicMainActivity.a aVar = OfflineComicMainActivity.d0;
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
        aVar.b(activityE, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicShelfRequest] */
    public final Object W0(Continuation<? super List<ComicInfoModel>> continuation) {
        g gVar;
        ComicListModel comicListModel;
        ComicListModel comicListModel2;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i = gVar.c;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                gVar.c = i - IntCompanionObject.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objH = gVar.a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = gVar.c;
        List<ComicInfoModel> list = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objH);
            kotlinx.coroutines.m0 m0VarC = kotlinx.coroutines.g1.c();
            h hVar = new h(null);
            gVar.c = 1;
            objH = kotlinx.coroutines.i.h(m0VarC, hVar, gVar);
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objH);
        }
        List<ReadingRecord> list2 = (List) objH;
        ?? comicShelfRequest = new ComicShelfRequest();
        comicShelfRequest.setNum(this.e);
        comicShelfRequest.setProgressed(Boxing.boxInt(1));
        comicShelfRequest.setSortby("ptime");
        comicShelfRequest.setOrder("desc");
        comicShelfRequest.setPage(0);
        ResponseData responseDataK = com.zentraedi.business.http.a.b().k((com.zentraedi.basic.component.http.i) comicShelfRequest, ComicListModel.class);
        if (com.zentraedi.basic.function.utils.j0.l(list2)) {
            if (responseDataK == null || (comicListModel2 = (ComicListModel) responseDataK.getData()) == null) {
                return null;
            }
            return comicListModel2.getList();
        }
        if (responseDataK != null && (comicListModel = (ComicListModel) responseDataK.getData()) != null) {
            list = comicListModel.getList();
        }
        return j0(list2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.adapter.n i0() {
        return new com.zentraedi.comic.adapter.n(null, 1, null);
    }

    private final List<ComicInfoModel> j0(List<ReadingRecord> list, List<ComicInfoModel> list2) {
        ArrayList arrayList;
        if (list2 == null) {
            return null;
        }
        List<ComicInfoModel> list3 = list2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (ComicInfoModel comicInfoModel : list3) {
            NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) new Gson().fromJson(comicInfoModel.getProgress(), NasReadingRecordModule.class);
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.areEqual(((ReadingRecord) obj).getComicId(), comicInfoModel.getId())) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                ReadingRecord readingRecord = (ReadingRecord) arrayList.get(0);
                NasReadingRecordModule nasReadingRecordModule2 = (NasReadingRecordModule) new Gson().fromJson(readingRecord.getProgress(), NasReadingRecordModule.class);
                if (nasReadingRecordModule2 != null && nasReadingRecordModule != null && nasReadingRecordModule2.getTime() > nasReadingRecordModule.getTime() && !TextUtils.isEmpty(readingRecord.getProgress())) {
                    nd.a.c("compareReadingRecordAndMergeData", readingRecord.getProgress());
                    nasReadingRecordModule2.setFilePath(nasReadingRecordModule.getFilePath());
                    String json = new Gson().toJson(nasReadingRecordModule2);
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    comicInfoModel.setProgress(json);
                }
            }
            arrayList2.add(comicInfoModel);
        }
        return arrayList2;
    }

    private final void k0(int i, ComicInfoModel comicInfoModel, int i2) {
        String id2;
        ComicCategory category;
        if (i == 26 || i == 3 || i == 8 || i == 33) {
            ComicReaderActivity.a aVar = ComicReaderActivity.x5;
            Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
            Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
            aVar.a(activityE, comicInfoModel);
            return;
        }
        if (i == 10) {
            com.zentraedi.business.utils.n4 n4VarA = com.zentraedi.business.utils.n4.c.a();
            Activity activityE2 = com.zentraedi.basic.function.utils.a.h().e();
            Intrinsics.checkNotNullExpressionValue(activityE2, "getCurActivity(...)");
            String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.tM);
            Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
            String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.cz);
            Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
            n4VarA.h2(activityE2, strN, strN2, strN3, new a());
            return;
        }
        if (i2 == 4) {
            OfflineComicDetailActivity.a aVar2 = OfflineComicDetailActivity.f0;
            Activity activityE3 = com.zentraedi.basic.function.utils.a.h().e();
            Intrinsics.checkNotNullExpressionValue(activityE3, "getCurActivity(...)");
            aVar2.a(activityE3, comicInfoModel.getPath(), comicInfoModel, comicInfoModel.getPath());
            return;
        }
        ComicSubDirActivity.a aVar3 = ComicSubDirActivity.g0;
        Activity activityE4 = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNullExpressionValue(activityE4, "getCurActivity(...)");
        ComicDirModel dir = comicInfoModel.getDir();
        if (dir == null || (category = dir.getCategory()) == null || (id2 = category.getId()) == null) {
            id2 = "0";
        }
        String str = id2;
        ComicDirModel dir2 = comicInfoModel.getDir();
        String id3 = dir2 != null ? dir2.getId() : null;
        ComicDirModel dir3 = comicInfoModel.getDir();
        ComicSubDirActivity.a.b(aVar3, activityE4, str, id3, dir3 != null ? dir3.getPath() : null, comicInfoModel.getPath(), null, comicInfoModel, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l0(List<ComicInfoModel> list, List<ComicInfoModel> list2, List<ComicInfoModel> list3, Continuation<? super List<com.zentraedi.basic.function.viewmodel.f<?>>> continuation) {
        b bVar;
        kotlinx.coroutines.sync.a aVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.h;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                bVar.h = i - IntCompanionObject.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bVar.h;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            aVar = this.f;
            bVar.a = list;
            bVar.b = list2;
            bVar.c = list3;
            bVar.d = aVar;
            bVar.e = 0;
            bVar.h = 1;
            if (aVar.t((Object) null, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) bVar.d;
            list3 = (List) bVar.c;
            list2 = (List) bVar.b;
            List<ComicInfoModel> list4 = (List) bVar.a;
            ResultKt.throwOnFailure(obj);
            aVar = aVar2;
            list = list4;
        }
        try {
            nd.a.e(this.b, "  极漫画首页   最近阅读:" + list.size() + "个     我的书架:" + list2.size() + "个    编辑过的:" + list3.size() + (char) 20010);
            t0(list);
            B0(list2);
            w0(list3);
            Unit unit = Unit.INSTANCE;
            return this.c;
        } finally {
            aVar.v((Object) null);
        }
    }

    private final ComicInfoModel m0(ReadingRecord readingRecord) {
        ComicCategory comicCategory = new ComicCategory();
        comicCategory.setId(readingRecord.getCateId());
        List<ComicLibCategoryEntity> listA = OfflineComicMainActivity.d0.a();
        if (listA != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (Intrinsics.areEqual(((ComicLibCategoryEntity) obj).getCategoryId(), readingRecord.getCateId())) {
                    arrayList.add(obj);
                }
            }
            if (com.zentraedi.basic.function.utils.j0.l(arrayList)) {
                comicCategory.setName("");
            } else {
                comicCategory.setName(((ComicLibCategoryEntity) arrayList.get(0)).getName());
            }
        }
        ComicDirModel comicDirModel = new ComicDirModel();
        comicDirModel.setCategory(comicCategory);
        ComicInfoModel comicInfoModel = new ComicInfoModel();
        comicInfoModel.setId(readingRecord.getComicId());
        comicInfoModel.setDir(comicDirModel);
        comicInfoModel.setCover(readingRecord.getComicThumb());
        comicInfoModel.setOnShelf(0);
        comicInfoModel.setName(readingRecord.getComicFileName());
        comicInfoModel.setPath(com.zentraedi.comic.util.f.a.h(readingRecord.getComicId(), readingRecord.getComicNasPath()));
        String progress = readingRecord.getProgress();
        comicInfoModel.setProgress(progress != null ? progress : "");
        return comicInfoModel;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zentraedi.basic.function.viewmodel.f, com.zentraedi.comic.viewmodel.i6] */
    private final i6 n0(final ComicInfoModel comicInfoModel, final int i, int i2) {
        final ?? i6Var = new i6();
        i6Var.viewType = i2;
        i6Var.G0(Integer.valueOf(i));
        if (i != 2) {
            i6Var.q0().set(Boolean.valueOf(comicInfoModel.isOnShelf()));
        }
        if (i != 1 || TextUtils.isEmpty(comicInfoModel.getProgress())) {
            i6Var.m0().set(comicInfoModel.getCover());
            i6Var.u0().set(comicInfoModel.getPath());
            i6Var.l0().set(comicInfoModel.getName());
            ObservableField<String> observableFieldX0 = i6Var.x0();
            com.zentraedi.business.utils.d5.a aVar = com.zentraedi.business.utils.d5.a;
            observableFieldX0.set(aVar.r(aVar.m(comicInfoModel.getPath())));
        } else {
            NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) new Gson().fromJson(comicInfoModel.getProgress(), NasReadingRecordModule.class);
            if (TextUtils.isEmpty(nasReadingRecordModule.getFilePath())) {
                com.zentraedi.business.utils.i5 i5Var = com.zentraedi.business.utils.i5.a;
                int iF = i5Var.f(comicInfoModel.getPath());
                if (iF != 10) {
                    iF = i5Var.f(comicInfoModel.getPath());
                }
                if (iF == 3) {
                    i6Var.l0().set(com.zentraedi.comic.m.x(comicInfoModel.getPath()));
                } else {
                    i6Var.l0().set(com.zentraedi.comic.m.x(com.zentraedi.business.utils.d5.a.m(comicInfoModel.getPath())));
                }
                i6Var.x0().set(v0(comicInfoModel.getPath()));
                i6Var.m0().set(comicInfoModel.getCover());
                i6Var.u0().set(comicInfoModel.getPath());
                if (3 != i5Var.f(comicInfoModel.getPath())) {
                    i6Var.v0().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.xM) + ": " + com.zentraedi.comic.m.x(nasReadingRecordModule.getFilePath()));
                }
            } else {
                com.zentraedi.business.utils.i5 i5Var2 = com.zentraedi.business.utils.i5.a;
                int iF2 = i5Var2.f(comicInfoModel.getPath());
                int iF3 = iF2 == 10 ? iF2 : i5Var2.f(nasReadingRecordModule.getFilePath());
                if (iF3 == 3 || iF2 == -1) {
                    i6Var.l0().set(com.zentraedi.comic.m.x(comicInfoModel.getPath()));
                } else {
                    i6Var.l0().set(com.zentraedi.comic.m.x(com.zentraedi.business.utils.d5.a.m(comicInfoModel.getPath())));
                }
                if (iF3 != 10) {
                    comicInfoModel.setPath(nasReadingRecordModule.getFilePath());
                }
                i6Var.x0().set(v0(comicInfoModel.getPath()));
                i6Var.m0().set(comicInfoModel.getCover());
                i6Var.u0().set(comicInfoModel.getPath());
                i6Var.v0().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.xM) + ": " + com.zentraedi.comic.m.x(nasReadingRecordModule.getFilePath()));
                if (3 != i5Var2.f(nasReadingRecordModule.getFilePath())) {
                    ObservableField<String> progress = i6Var.getProgress();
                    StringBuilder sb = new StringBuilder();
                    sb.append(" I ");
                    Intrinsics.checkNotNull(nasReadingRecordModule);
                    sb.append(A0(nasReadingRecordModule));
                    progress.set(sb.toString());
                    i6Var.i0().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.xM) + ": " + com.zentraedi.comic.m.x(nasReadingRecordModule.getFilePath()) + " I " + A0(nasReadingRecordModule));
                } else {
                    i6Var.i0().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.xM) + ": " + com.zentraedi.comic.m.x(nasReadingRecordModule.getFilePath()));
                }
            }
        }
        i6Var.o0().set(1 ^ (com.zentraedi.comic.util.f.a.i(comicInfoModel) ? 1 : 0));
        i6Var.s0().set(Boolean.TRUE);
        i6Var.L0(comicInfoModel);
        i6Var.C0(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1.o0(i, comicInfoModel, this, i6Var, view);
            }
        });
        i6Var.D0(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1.p0(this.a, i6Var, i, view);
            }
        });
        return i6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(int i, ComicInfoModel comicInfoModel, b1 b1Var, i6 i6Var, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (i != 4) {
            com.zentraedi.comic.delegate.m.a.u(i6Var);
            return;
        }
        int iF = com.zentraedi.business.utils.i5.a.f(comicInfoModel.getPath());
        comicInfoModel.setOfflineData(true);
        b1Var.k0(iF, comicInfoModel, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(b1 b1Var, i6 i6Var, int i, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        b1Var.h.invoke(i6Var, Integer.valueOf(i));
    }

    private final void t0(List<ComicInfoModel> list) {
        Application applicationC = com.zentraedi.basic.function.utils.a.c();
        Intrinsics.checkNotNullExpressionValue(applicationC, "getApplication(...)");
        j6 j6Var = new j6(applicationC);
        com.zentraedi.comic.constant.a.b.C0112a c0112a = com.zentraedi.comic.constant.a.b.f9if;
        j6Var.viewType = c0112a.f();
        j6Var.getTitleStr().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.e81));
        j6Var.Q(true);
        j6Var.P(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1.u0(view);
            }
        });
        this.c.add(j6Var);
        if (!com.zentraedi.basic.function.utils.j0.l(list)) {
            this.c.addAll(F0(list, 1, c0112a.d()));
            return;
        }
        ObservableField<Boolean> observableFieldO = j6Var.O();
        Boolean bool = Boolean.FALSE;
        observableFieldO.set(bool);
        Application applicationC2 = com.zentraedi.basic.function.utils.a.c();
        Intrinsics.checkNotNullExpressionValue(applicationC2, "getApplication(...)");
        m0 m0Var = new m0(applicationC2);
        m0Var.L().set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.O3));
        m0Var.getTitleStr().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.BK));
        m0Var.M().set(bool);
        this.c.add(m0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(View view) {
        ComicListDetailActivity.a aVar = ComicListDetailActivity.e0;
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
        aVar.a(activityE, 6);
    }

    private final String v0(String str) {
        String strRemovePrefix = StringsKt.removePrefix(StringsKt.removeSuffix(com.zentraedi.business.utils.d5.a.r(str), "/"), "/");
        int iLastIndexOf$default = StringsKt.lastIndexOf$default(strRemovePrefix, "/", 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return StringsKt.removePrefix(strRemovePrefix, "/");
        }
        String strSubstring = strRemovePrefix.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        int iLastIndexOf$default2 = StringsKt.lastIndexOf$default(strSubstring, "/", 0, false, 6, (Object) null);
        if (iLastIndexOf$default2 == -1) {
            return StringsKt.removePrefix(strSubstring, "/");
        }
        String strSubstring2 = strSubstring.substring(0, iLastIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    private final void w0(List<ComicInfoModel> list) {
        Application applicationC = com.zentraedi.basic.function.utils.a.c();
        Intrinsics.checkNotNullExpressionValue(applicationC, "getApplication(...)");
        j6 j6Var = new j6(applicationC);
        com.zentraedi.comic.constant.a.b.C0112a c0112a = com.zentraedi.comic.constant.a.b.f9if;
        j6Var.viewType = c0112a.f();
        j6Var.getTitleStr().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.c81));
        j6Var.Q(true);
        j6Var.P(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1.x0(view);
            }
        });
        this.c.add(j6Var);
        if (!com.zentraedi.basic.function.utils.j0.l(list)) {
            this.c.addAll(F0(list, 3, c0112a.d()));
            return;
        }
        j6Var.Q(false);
        ObservableField<Boolean> observableFieldO = j6Var.O();
        Boolean bool = Boolean.FALSE;
        observableFieldO.set(bool);
        Application applicationC2 = com.zentraedi.basic.function.utils.a.c();
        Intrinsics.checkNotNullExpressionValue(applicationC2, "getApplication(...)");
        m0 m0Var = new m0(applicationC2);
        m0Var.L().set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.h3));
        m0Var.getTitleStr().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ep0));
        m0Var.M().set(bool);
        this.c.add(m0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(View view) {
        org.greenrobot.eventbus.c.f().q(new ComicJumpLastestAddEvent(null, 1, null));
    }

    @fo.k
    public final Function2<i6, Integer, Unit> D0() {
        return this.h;
    }

    @fo.k
    public final String E0() {
        return this.b;
    }

    public final void G0() {
        KvLoadRequest kvLoadRequest = new KvLoadRequest();
        String strA = com.zentraedi.basic.function.utils.r.a("refresh_cartoon2025" + com.zentraedi.business.w0.e + com.zentraedi.business.w0.a);
        Intrinsics.checkNotNullExpressionValue(strA, "md5(...)");
        kvLoadRequest.setK(strA);
        com.zentraedi.business.http.a.b().h(kvLoadRequest, new c());
    }

    public final void H0(@fo.k com.zentraedi.business.listener.l resultDealListener) {
        Intrinsics.checkNotNullParameter(resultDealListener, "resultDealListener");
        this.c.clear();
        kotlinx.coroutines.i.e(kotlinx.coroutines.a2.a, kotlinx.coroutines.g1.e(), (CoroutineStart) null, new d(resultDealListener, null), 2, (Object) null);
    }

    public final void I0(@fo.k com.zentraedi.business.listener.l resultDealListener) {
        Intrinsics.checkNotNullParameter(resultDealListener, "resultDealListener");
        kotlinx.coroutines.i.e(kotlinx.coroutines.a2.a, kotlinx.coroutines.g1.e(), (CoroutineStart) null, new e(resultDealListener, null), 2, (Object) null);
    }

    public final void K0(@fo.l View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public final void L0(boolean z) {
        this.i = z;
    }

    public final void M0(int i) {
        this.e = i;
    }

    public final void N0(@fo.k List<com.zentraedi.basic.function.viewmodel.f<?>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.c = list;
    }

    public final void O0(@fo.k Function2<? super i6, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.h = function2;
    }

    @fo.k
    public final com.zentraedi.comic.adapter.n q0() {
        return (com.zentraedi.comic.adapter.n) this.d.getValue();
    }

    @fo.l
    public final View.OnClickListener r0() {
        return this.g;
    }

    public final boolean s0() {
        return this.i;
    }

    public final int y0() {
        return this.e;
    }

    @fo.k
    public final List<com.zentraedi.basic.function.viewmodel.f<?>> z0() {
        return this.c;
    }
}
