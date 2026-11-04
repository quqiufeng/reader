package com.zentraedi.comic.viewmodel;

import android.app.Application;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.comic.model.ComicListModel;
import com.zentraedi.comic.request.ComicSearchRequest;
import java.util.List;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class z4 extends d6 {

    @fo.l
    private Function2<? super Boolean, ? super Boolean, Unit> w;
    private int x;

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicSearchDetailViewModel$loadSearchComicData$1", f = "ComicSearchDetailViewModel.kt", i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3}, l = {31, 76, 47, 87}, m = "invokeSuspend", n = {"$this$launch", "deferred", "$this$launch", "deferred", "comicInfoModelsResponse", "$this$withLock_u24default$iv", "$i$f$withLock", "$this$launch", "loadMoreData", "$this$launch", "loadMoreData", "comicDirListResponse", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
    @SourceDebugExtension({"SMAP\nComicSearchDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicSearchDetailViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicSearchDetailViewModel$loadSearchComicData$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,70:1\n116#2,11:71\n116#2,11:82\n*S KotlinDebug\n*F\n+ 1 ComicSearchDetailViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicSearchDetailViewModel$loadSearchComicData$1\n*L\n35#1:71,11\n48#1:82,11\n*E\n"})
    static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        Object a;
        Object b;
        Object c;
        Object d;
        int e;
        int f;
        private /* synthetic */ Object g;
        final /* synthetic */ boolean h;
        final /* synthetic */ z4 i;

        /* JADX INFO: renamed from: com.zentraedi.comic.viewmodel.z4$a$a, reason: collision with other inner class name */
        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicSearchDetailViewModel$loadSearchComicData$1$deferred$1", f = "ComicSearchDetailViewModel.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class C0134a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super ResponseData<ComicListModel>>, Object> {
            int a;
            final /* synthetic */ z4 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0134a(z4 z4Var, Continuation<? super C0134a> continuation) {
                super(2, continuation);
                this.b = z4Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0134a(this.b, continuation);
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
                z4 z4Var = this.b;
                this.a = 1;
                Object objP1 = z4Var.P1(true, this);
                return objP1 == coroutine_suspended ? coroutine_suspended : objP1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super ResponseData<ComicListModel>> continuation) {
                return ((C0134a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicSearchDetailViewModel$loadSearchComicData$1$loadMoreData$1", f = "ComicSearchDetailViewModel.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super ResponseData<ComicListModel>>, Object> {
            int a;
            final /* synthetic */ z4 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(z4 z4Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = z4Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.b, continuation);
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
                z4 z4Var = this.b;
                this.a = 1;
                Object objP1 = z4Var.P1(false, this);
                return objP1 == coroutine_suspended ? coroutine_suspended : objP1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super ResponseData<ComicListModel>> continuation) {
                return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, z4 z4Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.h = z;
            this.i = z4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.h, this.i, continuation);
            aVar.g = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: Exception -> 0x01a8, TryCatch #1 {Exception -> 0x01a8, blocks: (B:9:0x002b, B:66:0x01a0, B:67:0x01a4, B:68:0x01a7, B:14:0x003c, B:53:0x015b, B:17:0x0051, B:45:0x0116, B:47:0x0125, B:48:0x0130, B:49:0x0133, B:20:0x005a, B:28:0x008d, B:30:0x0099, B:32:0x009f, B:23:0x0061, B:25:0x0065, B:50:0x0134, B:57:0x0185, B:59:0x018d, B:65:0x019b, B:64:0x0197, B:36:0x00fb, B:38:0x0103, B:44:0x0111, B:43:0x010d), top: B:83:0x0011, inners: #0, #2 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x009e  */
        /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:43:0x010d A[Catch: all -> 0x010a, TryCatch #2 {all -> 0x010a, blocks: (B:36:0x00fb, B:38:0x0103, B:44:0x0111, B:43:0x010d), top: B:84:0x00fb, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0125 A[Catch: Exception -> 0x01a8, TryCatch #1 {Exception -> 0x01a8, blocks: (B:9:0x002b, B:66:0x01a0, B:67:0x01a4, B:68:0x01a7, B:14:0x003c, B:53:0x015b, B:17:0x0051, B:45:0x0116, B:47:0x0125, B:48:0x0130, B:49:0x0133, B:20:0x005a, B:28:0x008d, B:30:0x0099, B:32:0x009f, B:23:0x0061, B:25:0x0065, B:50:0x0134, B:57:0x0185, B:59:0x018d, B:65:0x019b, B:64:0x0197, B:36:0x00fb, B:38:0x0103, B:44:0x0111, B:43:0x010d), top: B:83:0x0011, inners: #0, #2 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0182  */
        /* JADX WARN: Code duplicated, block: B:64:0x0197 A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:57:0x0185, B:59:0x018d, B:65:0x019b, B:64:0x0197), top: B:81:0x0185, outer: #1 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.w0 w0VarB;
            kotlinx.coroutines.w0 w0VarB2;
            ResponseData responseData;
            ComicListModel comicListModel;
            int total;
            kotlinx.coroutines.sync.a aVarK0;
            z4 z4Var;
            ResponseData responseData2;
            kotlinx.coroutines.sync.a aVar;
            z4 z4Var2;
            ComicListModel comicListModel2;
            List<ComicInfoModel> listEmptyList;
            ResponseData responseData3;
            kotlinx.coroutines.sync.a aVarK1;
            z4 z4Var3;
            ResponseData responseData4;
            kotlinx.coroutines.sync.a aVar2;
            z4 z4Var4;
            ComicListModel comicListModel3;
            List<ComicInfoModel> listEmptyList2;
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.g;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.h) {
                        w0VarB2 = kotlinx.coroutines.i.b(q0Var, kotlinx.coroutines.g1.c(), (CoroutineStart) null, new C0134a(this.i, null), 2, (Object) null);
                        this.g = SpillingKt.nullOutSpilledVariable(q0Var);
                        this.a = SpillingKt.nullOutSpilledVariable(w0VarB2);
                        this.f = 1;
                        obj = w0VarB2.x(this);
                        if (obj != coroutine_suspended) {
                            responseData = (ResponseData) obj;
                            z4 z4Var5 = this.i;
                            comicListModel = (ComicListModel) responseData.getData();
                            if (comicListModel != null) {
                                total = comicListModel.getTotal();
                            } else {
                                total = 0;
                            }
                            z4Var5.O1(total);
                            this.i.M0().set(com.zentraedi.basic.function.utils.l.g(Boxing.boxInt(com.zentraedi.comic.q.C0124q.oz0), MapsKt.mapOf(TuplesKt.to("total", Boxing.boxInt(this.i.L1())))));
                            this.i.getItems().clear();
                            aVarK0 = this.i.K0();
                            z4Var = this.i;
                            this.g = SpillingKt.nullOutSpilledVariable(q0Var);
                            this.a = SpillingKt.nullOutSpilledVariable(w0VarB2);
                            this.b = responseData;
                            this.c = aVarK0;
                            this.d = z4Var;
                            this.e = 0;
                            this.f = 2;
                            if (aVarK0.t((Object) null, this) != coroutine_suspended) {
                                responseData2 = responseData;
                                aVar = aVarK0;
                                z4Var2 = z4Var;
                                comicListModel2 = (ComicListModel) responseData2.getData();
                                if (comicListModel2 != null) {
                                    listEmptyList = CollectionsKt.emptyList();
                                } else {
                                    listEmptyList = CollectionsKt.emptyList();
                                }
                                z4Var2.E0(listEmptyList);
                                Unit unit = Unit.INSTANCE;
                                aVar.v((Object) null);
                                if (com.zentraedi.basic.function.utils.j0.l(this.i.getItems())) {
                                    this.i.O0().set(true);
                                }
                            }
                        }
                    } else {
                        w0VarB = kotlinx.coroutines.i.b(q0Var, kotlinx.coroutines.g1.c(), (CoroutineStart) null, new b(this.i, null), 2, (Object) null);
                        this.g = SpillingKt.nullOutSpilledVariable(q0Var);
                        this.a = SpillingKt.nullOutSpilledVariable(w0VarB);
                        this.f = 3;
                        obj = w0VarB.x(this);
                        if (obj != coroutine_suspended) {
                            responseData3 = (ResponseData) obj;
                            aVarK1 = this.i.K0();
                            z4Var3 = this.i;
                            this.g = SpillingKt.nullOutSpilledVariable(q0Var);
                            this.a = SpillingKt.nullOutSpilledVariable(w0VarB);
                            this.b = responseData3;
                            this.c = aVarK1;
                            this.d = z4Var3;
                            this.e = 0;
                            this.f = 4;
                            if (aVarK1.t((Object) null, this) != coroutine_suspended) {
                                responseData4 = responseData3;
                                aVar2 = aVarK1;
                                z4Var4 = z4Var3;
                                comicListModel3 = (ComicListModel) responseData4.getData();
                                if (comicListModel3 != null) {
                                    listEmptyList2 = CollectionsKt.emptyList();
                                } else {
                                    listEmptyList2 = CollectionsKt.emptyList();
                                }
                                z4Var4.E0(listEmptyList2);
                                Unit unit2 = Unit.INSTANCE;
                                aVar2.v((Object) null);
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    w0VarB2 = (kotlinx.coroutines.w0) this.a;
                    ResultKt.throwOnFailure(obj);
                    responseData = (ResponseData) obj;
                    z4 z4Var6 = this.i;
                    comicListModel = (ComicListModel) responseData.getData();
                    if (comicListModel != null) {
                        total = comicListModel.getTotal();
                    } else {
                        total = 0;
                    }
                    z4Var6.O1(total);
                    this.i.M0().set(com.zentraedi.basic.function.utils.l.g(Boxing.boxInt(com.zentraedi.comic.q.C0124q.oz0), MapsKt.mapOf(TuplesKt.to("total", Boxing.boxInt(this.i.L1())))));
                    this.i.getItems().clear();
                    aVarK0 = this.i.K0();
                    z4Var = this.i;
                    this.g = SpillingKt.nullOutSpilledVariable(q0Var);
                    this.a = SpillingKt.nullOutSpilledVariable(w0VarB2);
                    this.b = responseData;
                    this.c = aVarK0;
                    this.d = z4Var;
                    this.e = 0;
                    this.f = 2;
                    if (aVarK0.t((Object) null, this) != coroutine_suspended) {
                        responseData2 = responseData;
                        aVar = aVarK0;
                        z4Var2 = z4Var;
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    if (i == 3) {
                        w0VarB = (kotlinx.coroutines.w0) this.a;
                        ResultKt.throwOnFailure(obj);
                        responseData3 = (ResponseData) obj;
                        aVarK1 = this.i.K0();
                        z4Var3 = this.i;
                        this.g = SpillingKt.nullOutSpilledVariable(q0Var);
                        this.a = SpillingKt.nullOutSpilledVariable(w0VarB);
                        this.b = responseData3;
                        this.c = aVarK1;
                        this.d = z4Var3;
                        this.e = 0;
                        this.f = 4;
                        if (aVarK1.t((Object) null, this) != coroutine_suspended) {
                            responseData4 = responseData3;
                            aVar2 = aVarK1;
                            z4Var4 = z4Var3;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z4Var4 = (z4) this.d;
                    aVar2 = (kotlinx.coroutines.sync.a) this.c;
                    responseData4 = (ResponseData) this.b;
                    ResultKt.throwOnFailure(obj);
                    try {
                        comicListModel3 = (ComicListModel) responseData4.getData();
                        if (comicListModel3 != null || (listEmptyList2 = comicListModel3.getList()) == null) {
                            listEmptyList2 = CollectionsKt.emptyList();
                        }
                        z4Var4.E0(listEmptyList2);
                        Unit unit3 = Unit.INSTANCE;
                        aVar2.v((Object) null);
                    } catch (Throwable th2) {
                        aVar2.v((Object) null);
                        throw th2;
                    }
                } else {
                    z4Var2 = (z4) this.d;
                    aVar = (kotlinx.coroutines.sync.a) this.c;
                    responseData2 = (ResponseData) this.b;
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    comicListModel2 = (ComicListModel) responseData2.getData();
                    if (comicListModel2 != null || (listEmptyList = comicListModel2.getList()) == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    z4Var2.E0(listEmptyList);
                    Unit unit4 = Unit.INSTANCE;
                    aVar.v((Object) null);
                    if (com.zentraedi.basic.function.utils.j0.l(this.i.getItems())) {
                        this.i.O0().set(true);
                    }
                } catch (Throwable th3) {
                    aVar.v((Object) null);
                    throw th3;
                }
            } catch (Exception unused) {
                this.i.getShowLoadingView().set(false);
            }
            Function2<Boolean, Boolean, Unit> function2K1 = this.i.K1();
            if (function2K1 != null) {
                function2K1.invoke(Boxing.boxBoolean(this.h), Boxing.boxBoolean(this.i.L1() != 0 && this.i.L1() > this.i.getItems().size()));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(@fo.k Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicSearchRequest] */
    public final Object P1(boolean z, Continuation<? super ResponseData<ComicListModel>> continuation) {
        ?? comicSearchRequest = new ComicSearchRequest();
        comicSearchRequest.setName(L0());
        comicSearchRequest.setStart(z ? 0 : getItems().size());
        comicSearchRequest.setNum(20);
        ResponseData responseDataK = com.zentraedi.business.http.a.b().k((com.zentraedi.basic.component.http.i) comicSearchRequest, ComicListModel.class);
        Intrinsics.checkNotNullExpressionValue(responseDataK, "sendNasRequestSync(...)");
        return responseDataK;
    }

    @fo.l
    public final Function2<Boolean, Boolean, Unit> K1() {
        return this.w;
    }

    public final int L1() {
        return this.x;
    }

    public final void M1(boolean z) {
        kotlinx.coroutines.i.e(kotlinx.coroutines.a2.a, kotlinx.coroutines.g1.e(), (CoroutineStart) null, new a(z, this, null), 2, (Object) null);
    }

    public final void N1(@fo.l Function2<? super Boolean, ? super Boolean, Unit> function2) {
        this.w = function2;
    }

    public final void O1(int i) {
        this.x = i;
    }
}
