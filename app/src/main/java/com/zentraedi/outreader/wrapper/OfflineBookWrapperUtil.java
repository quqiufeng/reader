package com.zentraedi.outreader.wrapper;

import android.text.TextUtils;
import android.util.Log;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.basic.function.utils.r;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.outreader.database.ReaderDatabase;
import com.zentraedi.outreader.database.a0;
import com.zentraedi.outreader.database.t1;
import com.zentraedi.outreader.model.offline.BookInfoEntity;
import com.zentraedi.outreader.model.offline.OfflineBookEntity;
import com.zentraedi.outreader.model.offline.OfflineCategoryEntity;
import com.zentraedi.outreader.responsemodel.BookCategoryModel;
import com.zentraedi.outreader.responsemodel.BookModel;
import fo.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.r0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nOfflineBookWrapperUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt\n*L\n1#1,529:1\n35#2,8:530\n53#2:542\n35#2,8:543\n53#2:555\n35#2,8:556\n53#2:568\n35#2,8:569\n53#2:581\n48#3,4:538\n48#3,4:551\n48#3,4:564\n48#3,4:577\n116#4,11:582\n116#4,11:593\n116#4,11:604\n116#4,11:615\n116#4,11:632\n116#4,11:643\n116#4,11:654\n1869#5,2:626\n655#6,2:628\n655#6,2:630\n*S KotlinDebug\n*F\n+ 1 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n41#1:530,8\n41#1:542\n59#1:543,8\n59#1:555\n77#1:556,8\n77#1:568\n94#1:569,8\n94#1:581\n41#1:538,4\n59#1:551,4\n77#1:564,4\n94#1:577,4\n113#1:582,11\n153#1:593,11\n164#1:604,11\n193#1:615,11\n338#1:632,11\n353#1:643,11\n377#1:654,11\n231#1:626,2\n268#1:628,2\n269#1:630,2\n*E\n"})
public final class OfflineBookWrapperUtil {

    @fo.k
    public static final OfflineBookWrapperUtil a = new OfflineBookWrapperUtil();

    @fo.k
    private static String b = gh.b.a;

    @fo.k
    private static final kotlinx.coroutines.sync.a c = kotlinx.coroutines.sync.g.b(false, 1, (Object) null);

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ com.zentraedi.business.http.b a;

        /* JADX INFO: renamed from: com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,61:1\n60#2,2:62\n*E\n"})
        public static final class C0161a implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.business.http.b a;

            public C0161a(com.zentraedi.business.http.b bVar) {
                this.a = bVar;
            }

            public final void a() {
                com.zentraedi.business.http.b bVar = this.a;
                if (bVar != null) {
                    bVar.onServerError();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,61:1\n60#2,2:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.business.http.b a;

            public b(com.zentraedi.business.http.b bVar) {
                this.a = bVar;
            }

            public final void a() {
                com.zentraedi.business.http.b bVar = this.a;
                if (bVar != null) {
                    bVar.onServerError();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,61:1\n60#2,2:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.business.http.b a;

            public c(com.zentraedi.business.http.b bVar) {
                this.a = bVar;
            }

            public final void a() {
                com.zentraedi.business.http.b bVar = this.a;
                if (bVar != null) {
                    bVar.onServerError();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.b bVar, com.zentraedi.business.http.b bVar2) {
            super(bVar);
            this.a = bVar2;
        }

        public void handleException(@fo.k CoroutineContext coroutineContext, @fo.k Throwable th2) {
            try {
                nd.a.h("CoroutineScope", "throwable->coroutineDefaultWithMain() throwable=" + Log.getStackTraceString(th2));
                th2.printStackTrace();
                pe.i.r(new C0161a(this.a));
            } catch (Throwable th3) {
                try {
                    th3.printStackTrace();
                    pe.i.r(new b(this.a));
                } catch (Throwable th4) {
                    pe.i.r(new c(this.a));
                    throw th4;
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ com.zentraedi.business.http.b a;

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,61:1\n78#2,2:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.business.http.b a;

            public a(com.zentraedi.business.http.b bVar) {
                this.a = bVar;
            }

            public final void a() {
                com.zentraedi.business.http.b bVar = this.a;
                if (bVar != null) {
                    bVar.onServerError();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil$b$b, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,61:1\n78#2,2:62\n*E\n"})
        public static final class C0162b implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.business.http.b a;

            public C0162b(com.zentraedi.business.http.b bVar) {
                this.a = bVar;
            }

            public final void a() {
                com.zentraedi.business.http.b bVar = this.a;
                if (bVar != null) {
                    bVar.onServerError();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,61:1\n78#2,2:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.business.http.b a;

            public c(com.zentraedi.business.http.b bVar) {
                this.a = bVar;
            }

            public final void a() {
                com.zentraedi.business.http.b bVar = this.a;
                if (bVar != null) {
                    bVar.onServerError();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.b bVar, com.zentraedi.business.http.b bVar2) {
            super(bVar);
            this.a = bVar2;
        }

        public void handleException(@fo.k CoroutineContext coroutineContext, @fo.k Throwable th2) {
            try {
                nd.a.h("CoroutineScope", "throwable->coroutineDefaultWithMain() throwable=" + Log.getStackTraceString(th2));
                th2.printStackTrace();
                pe.i.r(new a(this.a));
            } catch (Throwable th3) {
                try {
                    th3.printStackTrace();
                    pe.i.r(new C0162b(this.a));
                } catch (Throwable th4) {
                    pe.i.r(new c(this.a));
                    throw th4;
                }
            }
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil", f = "OfflineBookWrapperUtil.kt", i = {0, 0, 0}, l = {535}, m = "queryBook", n = {"downloadId", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    static final class c extends ContinuationImpl {
        Object a;
        Object b;
        int c;
        /* synthetic */ Object d;
        int f;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.d = obj;
            this.f |= IntCompanionObject.MIN_VALUE;
            return OfflineBookWrapperUtil.this.k(null, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil", f = "OfflineBookWrapperUtil.kt", i = {0, 0}, l = {535}, m = "queryBookAllBook", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    static final class d extends ContinuationImpl {
        Object a;
        int b;
        /* synthetic */ Object c;
        int e;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.c = obj;
            this.e |= IntCompanionObject.MIN_VALUE;
            return OfflineBookWrapperUtil.this.l(this);
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class e extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ com.zentraedi.business.http.b a;

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,61:1\n95#2,2:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.business.http.b a;

            public a(com.zentraedi.business.http.b bVar) {
                this.a = bVar;
            }

            public final void a() {
                com.zentraedi.business.http.b bVar = this.a;
                if (bVar != null) {
                    bVar.onServerError();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,61:1\n95#2,2:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.business.http.b a;

            public b(com.zentraedi.business.http.b bVar) {
                this.a = bVar;
            }

            public final void a() {
                com.zentraedi.business.http.b bVar = this.a;
                if (bVar != null) {
                    bVar.onServerError();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,61:1\n95#2,2:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.business.http.b a;

            public c(com.zentraedi.business.http.b bVar) {
                this.a = bVar;
            }

            public final void a() {
                com.zentraedi.business.http.b bVar = this.a;
                if (bVar != null) {
                    bVar.onServerError();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CoroutineExceptionHandler.b bVar, com.zentraedi.business.http.b bVar2) {
            super(bVar);
            this.a = bVar2;
        }

        public void handleException(@fo.k CoroutineContext coroutineContext, @fo.k Throwable th2) {
            try {
                nd.a.h("CoroutineScope", "throwable->coroutineDefaultWithMain() throwable=" + Log.getStackTraceString(th2));
                th2.printStackTrace();
                pe.i.r(new a(this.a));
            } catch (Throwable th3) {
                try {
                    th3.printStackTrace();
                    pe.i.r(new b(this.a));
                } catch (Throwable th4) {
                    pe.i.r(new c(this.a));
                    throw th4;
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class f extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ com.zentraedi.business.http.b a;

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,61:1\n42#2,2:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.business.http.b a;

            public a(com.zentraedi.business.http.b bVar) {
                this.a = bVar;
            }

            public final void a() {
                com.zentraedi.business.http.b bVar = this.a;
                if (bVar != null) {
                    bVar.onServerError();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,61:1\n42#2,2:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.business.http.b a;

            public b(com.zentraedi.business.http.b bVar) {
                this.a = bVar;
            }

            public final void a() {
                com.zentraedi.business.http.b bVar = this.a;
                if (bVar != null) {
                    bVar.onServerError();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,61:1\n42#2,2:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.business.http.b a;

            public c(com.zentraedi.business.http.b bVar) {
                this.a = bVar;
            }

            public final void a() {
                com.zentraedi.business.http.b bVar = this.a;
                if (bVar != null) {
                    bVar.onServerError();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CoroutineExceptionHandler.b bVar, com.zentraedi.business.http.b bVar2) {
            super(bVar);
            this.a = bVar2;
        }

        public void handleException(@fo.k CoroutineContext coroutineContext, @fo.k Throwable th2) {
            try {
                nd.a.h("CoroutineScope", "throwable->coroutineDefaultWithMain() throwable=" + Log.getStackTraceString(th2));
                th2.printStackTrace();
                pe.i.r(new a(this.a));
            } catch (Throwable th3) {
                try {
                    th3.printStackTrace();
                    pe.i.r(new b(this.a));
                } catch (Throwable th4) {
                    pe.i.r(new c(this.a));
                    throw th4;
                }
            }
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil", f = "OfflineBookWrapperUtil.kt", i = {0, 0}, l = {535}, m = "syncDeleteAll", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    static final class g extends ContinuationImpl {
        Object a;
        int b;
        /* synthetic */ Object c;
        int e;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.c = obj;
            this.e |= IntCompanionObject.MIN_VALUE;
            return OfflineBookWrapperUtil.this.p(this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil", f = "OfflineBookWrapperUtil.kt", i = {0, 0}, l = {535}, m = "syncDeleteAllBook", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    static final class h extends ContinuationImpl {
        Object a;
        int b;
        /* synthetic */ Object c;
        int e;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.c = obj;
            this.e |= IntCompanionObject.MIN_VALUE;
            return OfflineBookWrapperUtil.this.q(this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil", f = "OfflineBookWrapperUtil.kt", i = {0, 0, 0}, l = {535}, m = "syncDeleteBook", n = {"bookModel", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    static final class i extends ContinuationImpl {
        Object a;
        Object b;
        int c;
        /* synthetic */ Object d;
        int f;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.d = obj;
            this.f |= IntCompanionObject.MIN_VALUE;
            return OfflineBookWrapperUtil.this.r(null, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil", f = "OfflineBookWrapperUtil.kt", i = {0, 0, 0, 0, 0, 0}, l = {535}, m = "syncInsertBooks", n = {"bookModels", "entityList", "bookEntityList", "$this$withLock_u24default$iv", "isOffline", "$i$f$withLock"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "I$0"}, v = 1)
    static final class j extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        boolean e;
        int f;
        /* synthetic */ Object g;
        int i;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.g = obj;
            this.i |= IntCompanionObject.MIN_VALUE;
            return OfflineBookWrapperUtil.this.t(null, false, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil", f = "OfflineBookWrapperUtil.kt", i = {0, 0, 0, 0}, l = {535}, m = "syncUpdateBook", n = {"bookModel", "$this$withLock_u24default$iv", "isOffline", "$i$f$withLock"}, s = {"L$0", "L$1", "Z$0", "I$0"}, v = 1)
    static final class k extends ContinuationImpl {
        Object a;
        Object b;
        boolean c;
        int d;
        /* synthetic */ Object e;
        int g;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.e = obj;
            this.g |= IntCompanionObject.MIN_VALUE;
            return OfflineBookWrapperUtil.this.z(null, false, this);
        }
    }

    private OfflineBookWrapperUtil() {
    }

    @JvmStatic
    @fo.k
    public static final BookInfoEntity c(@fo.k BookModel bookModel) {
        Intrinsics.checkNotNullParameter(bookModel, "bookModel");
        String strLoginUserName = NasConnectManager.getInstance().loginUserName();
        BookInfoEntity bookInfoEntity = new BookInfoEntity();
        String nasPath = bookModel.getNasPath();
        if (nasPath == null) {
            nasPath = "";
        }
        bookInfoEntity.setNasPath(nasPath);
        bookInfoEntity.setUsername(strLoginUserName);
        String category_id = bookModel.getCategory_id();
        bookInfoEntity.setCategoryId(category_id != null ? category_id : "");
        bookInfoEntity.setNasId(NasConnectManager.getInstance().getNasId());
        bookInfoEntity.setBookId(bookModel.getBook_id());
        bookInfoEntity.setBookName(bookModel.getShowName());
        bookInfoEntity.setBookCover(bookModel.getCover());
        bookInfoEntity.setBookType(bookModel.getBookFileType());
        bookInfoEntity.setAddBookshelf(bookModel.getAdd_shelf());
        bookInfoEntity.setDownloadId(bookModel.getDownloadId());
        bookInfoEntity.setDownloadTime(System.currentTimeMillis());
        return bookInfoEntity;
    }

    @JvmStatic
    @fo.k
    public static final OfflineBookEntity d(@fo.k BookModel bookModel, boolean z) {
        Intrinsics.checkNotNullParameter(bookModel, "bookModel");
        String strLoginUserName = NasConnectManager.getInstance().loginUserName();
        OfflineBookEntity offlineBookEntity = new OfflineBookEntity();
        String nasPath = bookModel.getNasPath();
        if (nasPath == null) {
            nasPath = "";
        }
        offlineBookEntity.setNasPath(nasPath);
        Intrinsics.checkNotNull(strLoginUserName);
        offlineBookEntity.setUsername(strLoginUserName);
        String category_id = bookModel.getCategory_id();
        offlineBookEntity.setCategoryIndex(category_id != null ? category_id : "");
        offlineBookEntity.setNasId(NasConnectManager.getInstance().getNasId());
        offlineBookEntity.setBookId(bookModel.getBook_id());
        offlineBookEntity.setBookName(bookModel.getShowName());
        offlineBookEntity.setAddToShelf(bookModel.getAdd_shelf());
        offlineBookEntity.setAddShelfTimeStamp(bookModel.getAddShelfTime());
        offlineBookEntity.setAddLibraryTimeStamp(bookModel.getAddLibraryTime());
        offlineBookEntity.setLastModifyTimeStamp(bookModel.getTime());
        offlineBookEntity.setFileSize(bookModel.getFileSize());
        offlineBookEntity.setTextSize(bookModel.getFontSize());
        offlineBookEntity.setLatestReadTimestamp(bookModel.getReadTime());
        offlineBookEntity.setLatestReadChapter(bookModel.getRead_chapter());
        offlineBookEntity.setLatestReadChapterId(bookModel.recordReadChapterId());
        offlineBookEntity.setLatestReadPage(bookModel.getReadPageInt());
        offlineBookEntity.setChapterCount(bookModel.getChaptersInt());
        offlineBookEntity.setReadProgressPercent(bookModel.getReadProgressPercent());
        offlineBookEntity.setTextNumberPositionHistory(bookModel.getTextPositionInt());
        offlineBookEntity.setReadProgressExt(bookModel.getRead_progress_ext());
        offlineBookEntity.setReadOnOfflineMode(z);
        return offlineBookEntity;
    }

    @JvmStatic
    @fo.k
    public static final OfflineCategoryEntity e(@fo.k BookCategoryModel categoryModel) {
        Intrinsics.checkNotNullParameter(categoryModel, "categoryModel");
        OfflineCategoryEntity offlineCategoryEntity = new OfflineCategoryEntity();
        String strLoginUserName = NasConnectManager.getInstance().loginUserName();
        Intrinsics.checkNotNullExpressionValue(strLoginUserName, "loginUserName(...)");
        offlineCategoryEntity.setUsername(strLoginUserName);
        offlineCategoryEntity.setNasId(NasConnectManager.getInstance().getNasId());
        String category_id = categoryModel.getCategory_id();
        if (category_id == null) {
            category_id = "";
        }
        offlineCategoryEntity.setCategoryIndex(category_id);
        String category_name = categoryModel.getCategory_name();
        offlineCategoryEntity.setCategoryName(category_name != null ? category_name : "");
        return offlineCategoryEntity;
    }

    @JvmStatic
    @l
    public static final BookModel f(@l OfflineBookEntity offlineBookEntity) {
        if (offlineBookEntity == null) {
            return null;
        }
        BookModel bookModel = new BookModel();
        bookModel.setNasPath(offlineBookEntity.getNasPath());
        bookModel.setBook_id(offlineBookEntity.getBookId());
        bookModel.setCategory_id(offlineBookEntity.getCategoryIndex());
        bookModel.setCategory_name(offlineBookEntity.getCategoryName());
        bookModel.setShowName(offlineBookEntity.getBookName());
        bookModel.setAdd_shelf(offlineBookEntity.getAddToShelf());
        bookModel.setAddShelfTime(offlineBookEntity.getAddShelfTimeStamp());
        bookModel.setAddLibraryTime(offlineBookEntity.getAddLibraryTimeStamp());
        bookModel.setTime(offlineBookEntity.getLastModifyTimeStamp());
        bookModel.setFileSize(offlineBookEntity.getFileSize());
        bookModel.setFont_size(String.valueOf(offlineBookEntity.getTextSize()));
        bookModel.setDownloadStatus(0);
        bookModel.setOffline(Boolean.TRUE);
        bookModel.setReadTime(offlineBookEntity.getLatestReadTimestamp());
        bookModel.setRead_chapter(offlineBookEntity.getLatestReadChapter());
        bookModel.setRead_chapter_id(offlineBookEntity.getLatestReadChapterId());
        bookModel.setRead_page(String.valueOf(offlineBookEntity.getLatestReadPage()));
        bookModel.setChapters(String.valueOf(offlineBookEntity.getChapterCount()));
        bookModel.setReadProgressPercent(offlineBookEntity.getReadProgressPercent());
        bookModel.setHave_read(!TextUtils.isEmpty(offlineBookEntity.getReadProgressPercent()) ? 1 : 0);
        bookModel.setText_position(String.valueOf(offlineBookEntity.getTextNumberPositionHistory()));
        bookModel.setRead_progress_ext(offlineBookEntity.getReadProgressExt());
        return bookModel;
    }

    @JvmStatic
    @fo.k
    public static final String i(@l BookModel bookModel) {
        String[] list;
        String[] list2;
        String str = null;
        String localPath = bookModel != null ? bookModel.getLocalPath() : null;
        if (localPath != null && localPath.length() != 0) {
            String strLoginUserName = NasConnectManager.getInstance().loginUserName();
            String strK = com.zentraedi.business.reader.c.k(r.a(bookModel.getLocalPath()));
            Intrinsics.checkNotNull(strK);
            if (strK.length() > 0) {
                File file = new File(strK);
                if (file.exists() && file.isDirectory() && (list2 = file.list()) != null && list2.length != 0) {
                    String[] list3 = file.list();
                    str = list3 != null ? (String) ArraysKt.firstOrNull(list3) : null;
                    String str2 = str != null ? str : "";
                    nd.a.e("nas_book", "OfflineBookWrapperUtil->getLocalCoverPath downloadCoverPath=" + str2);
                    return strK + File.separator + str2;
                }
            }
            String strC = com.zentraedi.business.reader.c.c(String.valueOf(bookModel.getTime()), bookModel.getNasPath(), strLoginUserName);
            if (strC != null && strC.length() != 0) {
                File file2 = new File(strC);
                if (!file2.exists()) {
                    return "";
                }
                File parentFile = file2.getParentFile();
                if (parentFile != null && (list = parentFile.list()) != null) {
                    for (String str3 : list) {
                        if (!Intrinsics.areEqual(str3, file2.getName())) {
                            str = str3;
                            break;
                        }
                    }
                }
                nd.a.e("nas_book", "OfflineBookWrapperUtil->getLocalCoverPath cacheCover=" + str);
                if (str != null && str.length() != 0) {
                    return strC + File.separator + str;
                }
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(String str, String str2, Continuation<? super Unit> continuation) {
        if (str == null || str.length() == 0) {
            return Unit.INSTANCE;
        }
        try {
            String strLoginUserName = NasConnectManager.getInstance().loginUserName();
            String nasId = NasConnectManager.getInstance().getNasId();
            if (str2 == null) {
                ReaderDatabase.A().B().i(strLoginUserName, nasId, str);
            } else {
                ReaderDatabase.A().B().j(strLoginUserName, nasId, str, str2);
            }
            if (str2 == null) {
                ReaderDatabase.A().v().i(strLoginUserName, nasId, str);
            } else {
                ReaderDatabase.A().v().j(strLoginUserName, nasId, str2, str);
            }
        } catch (Throwable th2) {
            nd.a.d(gh.b.a, "syncDeleteBook", th2);
        }
        return Unit.INSTANCE;
    }

    @l
    public final Object A(@l List<? extends BookCategoryModel> list, @fo.k Continuation<? super Boolean> continuation) {
        try {
            List<? extends BookCategoryModel> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                ReaderDatabase.A().C().f(NasConnectManager.getInstance().loginUserName(), NasConnectManager.getInstance().getNasId());
                ArrayList arrayList = new ArrayList();
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                Iterator<? extends BookCategoryModel> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(e(it.next()));
                }
                ReaderDatabase.A().C().c(arrayList);
                return Boxing.boxBoolean(true);
            }
            nd.a.c(gh.b.a, "syncUpdateCategoryList->categoryList is null");
            return Boxing.boxBoolean(false);
        } catch (Exception e2) {
            nd.a.c(gh.b.a, "syncUpdateCategoryList->exception:" + e2.getLocalizedMessage());
            return Boxing.boxBoolean(false);
        }
    }

    public final void g(@fo.k List<String> nasBookPaths, @l com.zentraedi.business.http.b<Object> bVar) {
        Intrinsics.checkNotNullParameter(nasBookPaths, "nasBookPaths");
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + OfflineBookWrapperUtil.class + ' ' + Thread.currentThread().getName());
        kotlinx.coroutines.i.e(r0.a(g1.a().plus(new a(CoroutineExceptionHandler.F2, bVar))), (CoroutineContext) null, (CoroutineStart) null, new OfflineBookWrapperUtil$deleteBooksFromAllCategory$$inlined$coroutineDefaultWithMain$2(this, OfflineBookWrapperUtil.class, null, nasBookPaths, bVar), 3, (Object) null);
    }

    public final void h(@fo.k List<BookModel> nasBooks, @l com.zentraedi.business.http.b<Object> bVar) {
        Intrinsics.checkNotNullParameter(nasBooks, "nasBooks");
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + OfflineBookWrapperUtil.class + ' ' + Thread.currentThread().getName());
        kotlinx.coroutines.i.e(r0.a(g1.a().plus(new b(CoroutineExceptionHandler.F2, bVar))), (CoroutineContext) null, (CoroutineStart) null, new OfflineBookWrapperUtil$deleteBooksFromCategory$$inlined$coroutineDefaultWithMain$2(this, OfflineBookWrapperUtil.class, null, nasBooks, bVar), 3, (Object) null);
    }

    @fo.k
    public final String j() {
        return b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @l
    public final Object k(@fo.k String str, @fo.k Continuation<? super BookInfoEntity> continuation) {
        c cVar;
        kotlinx.coroutines.sync.a aVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.f;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                cVar.f = i2 - IntCompanionObject.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cVar.f;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                aVar = c;
                cVar.a = str;
                cVar.b = aVar;
                cVar.c = 0;
                cVar.f = 1;
                if (aVar.t((Object) null, cVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) cVar.b;
                String str2 = (String) cVar.a;
                ResultKt.throwOnFailure(obj);
                aVar = aVar2;
                str = str2;
            }
            try {
                List<BookInfoEntity> listD = ReaderDatabase.A().v().d(str);
                return listD != null ? (BookInfoEntity) CollectionsKt.firstOrNull((List) listD) : null;
            } finally {
                aVar.v((Object) null);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @l
    public final Object l(@fo.k Continuation<? super List<BookInfoEntity>> continuation) {
        d dVar;
        kotlinx.coroutines.sync.a aVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.e;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                dVar.e = i2 - IntCompanionObject.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dVar.e;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.sync.a aVar2 = c;
                dVar.a = aVar2;
                dVar.b = 0;
                dVar.e = 1;
                if (aVar2.t((Object) null, dVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = aVar2;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (kotlinx.coroutines.sync.a) dVar.a;
                ResultKt.throwOnFailure(obj);
            }
            try {
                String strLoginUserName = NasConnectManager.getInstance().loginUserName();
                String nasId = NasConnectManager.getInstance().getNasId();
                a0 a0VarV = ReaderDatabase.A().v();
                Intrinsics.checkNotNull(strLoginUserName);
                Intrinsics.checkNotNull(nasId);
                List<BookInfoEntity> listE = a0VarV.e(strLoginUserName, nasId);
                if (listE == null) {
                    listE = CollectionsKt.emptyList();
                }
                return listE;
            } finally {
                aVar.v((Object) null);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            return CollectionsKt.emptyList();
        }
    }

    public final void m(@l List<? extends BookCategoryModel> list, @l com.zentraedi.business.http.b<Object> bVar) {
        if (j0.l(list)) {
            return;
        }
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + OfflineBookWrapperUtil.class + ' ' + Thread.currentThread().getName());
        kotlinx.coroutines.i.e(r0.a(g1.a().plus(new e(CoroutineExceptionHandler.F2, bVar))), (CoroutineContext) null, (CoroutineStart) null, new OfflineBookWrapperUtil$recordAllCategoryInfo$$inlined$coroutineDefaultWithMain$2(this, OfflineBookWrapperUtil.class, null, list, bVar), 3, (Object) null);
    }

    public final void n(@l BookModel bookModel, boolean z, @l com.zentraedi.business.http.b<Object> bVar) {
        if (bookModel == null || TextUtils.isEmpty(bookModel.getBook_id())) {
            return;
        }
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + OfflineBookWrapperUtil.class + ' ' + Thread.currentThread().getName());
        kotlinx.coroutines.i.e(r0.a(g1.a().plus(new f(CoroutineExceptionHandler.F2, bVar))), (CoroutineContext) null, (CoroutineStart) null, new OfflineBookWrapperUtil$recordBookProgressInfo$$inlined$coroutineDefaultWithMain$2(this, OfflineBookWrapperUtil.class, null, bookModel, z, bVar), 3, (Object) null);
    }

    public final void o(@fo.k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        b = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @l
    public final Object p(@fo.k Continuation<? super Unit> continuation) {
        g gVar;
        kotlinx.coroutines.sync.a aVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.e;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                gVar.e = i2 - IntCompanionObject.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = gVar.e;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                nd.a.e("nas_book", "OfflineBookWrapperUtil->syncDeleteAll ");
                kotlinx.coroutines.sync.a aVar2 = c;
                gVar.a = aVar2;
                gVar.b = 0;
                gVar.e = 1;
                if (aVar2.t((Object) null, gVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = aVar2;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (kotlinx.coroutines.sync.a) gVar.a;
                ResultKt.throwOnFailure(obj);
            }
            try {
                String strLoginUserName = NasConnectManager.getInstance().loginUserName();
                String nasId = NasConnectManager.getInstance().getNasId();
                ReaderDatabase.A().B().f(strLoginUserName, nasId);
                a0 a0VarV = ReaderDatabase.A().v();
                Intrinsics.checkNotNull(strLoginUserName);
                Intrinsics.checkNotNull(nasId);
                a0VarV.f(strLoginUserName, nasId);
                ReaderDatabase.A().C().f(strLoginUserName, nasId);
                ReaderDatabase.A().u().a(strLoginUserName);
                ReaderDatabase.A().t().a(strLoginUserName);
                ReaderDatabase.A().D().a(strLoginUserName);
            } finally {
                aVar.v((Object) null);
            }
        } catch (Throwable th2) {
            nd.a.d(gh.b.a, "syncDeleteAll", th2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @l
    public final Object q(@fo.k Continuation<? super Unit> continuation) {
        h hVar;
        kotlinx.coroutines.sync.a aVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.e;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                hVar.e = i2 - IntCompanionObject.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object obj = hVar.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = hVar.e;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                nd.a.e("nas_book", "OfflineBookWrapperUtil->syncDeleteBookAllBook ");
                kotlinx.coroutines.sync.a aVar2 = c;
                hVar.a = aVar2;
                hVar.b = 0;
                hVar.e = 1;
                if (aVar2.t((Object) null, hVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = aVar2;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (kotlinx.coroutines.sync.a) hVar.a;
                ResultKt.throwOnFailure(obj);
            }
            try {
                String strLoginUserName = NasConnectManager.getInstance().loginUserName();
                String nasId = NasConnectManager.getInstance().getNasId();
                ReaderDatabase.A().B().f(strLoginUserName, nasId);
                a0 a0VarV = ReaderDatabase.A().v();
                Intrinsics.checkNotNull(strLoginUserName);
                Intrinsics.checkNotNull(nasId);
                a0VarV.f(strLoginUserName, nasId);
            } finally {
                aVar.v((Object) null);
            }
        } catch (Throwable th2) {
            nd.a.d(gh.b.a, "syncDeleteBookAllBook", th2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @l
    public final Object r(@fo.k BookModel bookModel, @fo.k Continuation<? super Unit> continuation) {
        i iVar;
        kotlinx.coroutines.sync.a aVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.f;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                iVar.f = i2 - IntCompanionObject.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object obj = iVar.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = iVar.f;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                nd.a.e("nas_book", "OfflineBookWrapperUtil->syncDeleteBook bookModel=" + bookModel);
                aVar = c;
                iVar.a = bookModel;
                iVar.b = aVar;
                iVar.c = 0;
                iVar.f = 1;
                if (aVar.t((Object) null, iVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) iVar.b;
                BookModel bookModel2 = (BookModel) iVar.a;
                ResultKt.throwOnFailure(obj);
                aVar = aVar2;
                bookModel = bookModel2;
            }
            try {
                String strLoginUserName = NasConnectManager.getInstance().loginUserName();
                String nasId = NasConnectManager.getInstance().getNasId();
                t1 t1VarB = ReaderDatabase.A().B();
                String category_id = bookModel.getCategory_id();
                String str = "";
                if (category_id == null) {
                    category_id = "";
                }
                String book_id = bookModel.getBook_id();
                if (book_id == null) {
                    book_id = "";
                }
                t1VarB.l(strLoginUserName, nasId, category_id, book_id);
                a0 a0VarV = ReaderDatabase.A().v();
                Intrinsics.checkNotNull(strLoginUserName);
                Intrinsics.checkNotNull(nasId);
                String category_id2 = bookModel.getCategory_id();
                if (category_id2 == null) {
                    category_id2 = "";
                }
                String book_id2 = bookModel.getBook_id();
                if (book_id2 == null) {
                    book_id2 = "";
                }
                a0VarV.n(strLoginUserName, nasId, category_id2, book_id2);
                String strValueOf = String.valueOf(bookModel.getTime());
                String nasPath = bookModel.getNasPath();
                if (nasPath != null) {
                    str = nasPath;
                }
                ReaderDatabase.A().t().f(r.a(com.zentraedi.business.reader.c.g(strValueOf, str, (String) null)));
            } finally {
                aVar.v((Object) null);
            }
        } catch (Throwable th2) {
            nd.a.d(gh.b.a, "syncDeleteAll", th2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @l
    public final Object t(@fo.k List<BookModel> list, boolean z, @fo.k Continuation<? super Boolean> continuation) {
        j jVar;
        List<OfflineBookEntity> list2;
        List<BookInfoEntity> list3;
        kotlinx.coroutines.sync.a aVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.i;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                jVar.i = i2 - IntCompanionObject.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object obj = jVar.g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.i;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (BookModel bookModel : list) {
                    if (!TextUtils.isEmpty(bookModel.getBook_id())) {
                        arrayList.add(d(bookModel, z));
                        arrayList2.add(c(bookModel));
                    }
                }
                if (j0.l(arrayList)) {
                    nd.a.c(gh.b.a, "syncUpdateBooks->entityList is empty");
                    return Boxing.boxBoolean(false);
                }
                kotlinx.coroutines.sync.a aVar2 = c;
                jVar.a = SpillingKt.nullOutSpilledVariable(list);
                jVar.b = arrayList;
                jVar.c = arrayList2;
                jVar.d = aVar2;
                jVar.e = z;
                jVar.f = 0;
                jVar.i = 1;
                if (aVar2.t((Object) null, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = arrayList;
                list3 = arrayList2;
                aVar = aVar2;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (kotlinx.coroutines.sync.a) jVar.d;
                list3 = (List) jVar.c;
                list2 = (List) jVar.b;
                ResultKt.throwOnFailure(obj);
            }
            try {
                ReaderDatabase.A().v().c(list3);
                ReaderDatabase.A().B().c(list2);
                Unit unit = Unit.INSTANCE;
                return Boxing.boxBoolean(true);
            } finally {
                aVar.v((Object) null);
            }
        } catch (Throwable th2) {
            nd.a.d(gh.b.a, "syncUpdateBook->exception", th2);
            return Boxing.boxBoolean(false);
        }
    }

    @fo.k
    public final List<OfflineBookEntity> u() {
        return v(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x004b A[SYNTHETIC] */
    @fo.k
    public final List<OfflineBookEntity> v(@l String str, @l String str2) {
        ArrayList arrayList = new ArrayList();
        String strLoginUserName = NasConnectManager.getInstance().loginUserName();
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            if (strLoginUserName == null) {
                strLoginUserName = "";
            }
            str = strLoginUserName;
        }
        String nasId = NasConnectManager.getInstance().getNasId();
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            str2 = nasId != null ? nasId : "";
        }
        try {
            List<OfflineBookEntity> listD = ReaderDatabase.A().B().d(str);
            if (listD == null) {
                listD = CollectionsKt.emptyList();
            }
            for (OfflineBookEntity offlineBookEntity : listD) {
                if (str2.length() == 0) {
                    String nasId2 = offlineBookEntity.getNasId();
                    if (nasId2 == null || nasId2.length() == 0) {
                        if (new File(com.zentraedi.business.reader.c.e(String.valueOf(offlineBookEntity.getLastModifyTimeStamp()), offlineBookEntity.getNasPath(), str)).exists()) {
                            Intrinsics.checkNotNull(offlineBookEntity);
                            arrayList.add(offlineBookEntity);
                        }
                    }
                } else if (Intrinsics.areEqual(str2, offlineBookEntity.getNasId())) {
                    if (new File(com.zentraedi.business.reader.c.e(String.valueOf(offlineBookEntity.getLastModifyTimeStamp()), offlineBookEntity.getNasPath(), str)).exists()) {
                        Intrinsics.checkNotNull(offlineBookEntity);
                        arrayList.add(offlineBookEntity);
                    }
                }
            }
        } catch (Exception e2) {
            nd.a.c(gh.b.a, "syncQueryAllBook->exception:" + e2.getLocalizedMessage());
        }
        return arrayList;
    }

    @l
    public final Object w(@fo.k Continuation<? super List<OfflineCategoryEntity>> continuation) {
        ArrayList arrayList = new ArrayList();
        String strLoginUserName = NasConnectManager.getInstance().loginUserName();
        String nasId = NasConnectManager.getInstance().getNasId();
        try {
            List<OfflineCategoryEntity> listD = ReaderDatabase.A().C().d(strLoginUserName);
            if (listD != null) {
                for (OfflineCategoryEntity offlineCategoryEntity : listD) {
                    if (nasId == null || nasId.length() == 0) {
                        String nasId2 = offlineCategoryEntity.getNasId();
                        if (nasId2 == null || nasId2.length() == 0) {
                            Intrinsics.checkNotNull(offlineCategoryEntity);
                            arrayList.add(offlineCategoryEntity);
                        }
                    } else if (Intrinsics.areEqual(nasId, offlineCategoryEntity.getNasId())) {
                        Intrinsics.checkNotNull(offlineCategoryEntity);
                        arrayList.add(offlineCategoryEntity);
                    }
                }
            }
        } catch (Exception e2) {
            nd.a.c(gh.b.a, "syncUpdateData->exception:" + e2.getLocalizedMessage());
        }
        return arrayList;
    }

    @l
    public final List<String> x(@l String str) {
        if (TextUtils.isEmpty(str)) {
            str = NasConnectManager.getInstance().loginUserName();
        } else {
            Intrinsics.checkNotNull(str);
        }
        try {
            return ReaderDatabase.A().B().n(str);
        } catch (Exception e2) {
            nd.a.c(gh.b.a, "syncQueryAllBook->exception:" + e2.getLocalizedMessage());
            return null;
        }
    }

    @l
    public final Object y(@fo.k String str, @fo.k Continuation<? super List<OfflineBookEntity>> continuation) {
        ArrayList arrayList = new ArrayList();
        String strLoginUserName = NasConnectManager.getInstance().loginUserName();
        try {
            for (OfflineBookEntity offlineBookEntity : ReaderDatabase.A().B().k(strLoginUserName, NasConnectManager.getInstance().getNasId(), str)) {
                if (new File(com.zentraedi.business.reader.c.e(String.valueOf(offlineBookEntity.getLastModifyTimeStamp()), offlineBookEntity.getNasPath(), strLoginUserName)).exists()) {
                    Intrinsics.checkNotNull(offlineBookEntity);
                    arrayList.add(offlineBookEntity);
                }
            }
        } catch (Exception e2) {
            nd.a.c(gh.b.a, "syncQueryBooksInCategory->exception:" + e2.getLocalizedMessage());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @l
    public final Object z(@fo.k BookModel bookModel, boolean z, @fo.k Continuation<? super Boolean> continuation) {
        k kVar;
        kotlinx.coroutines.sync.a aVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.g;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                kVar.g = i2 - IntCompanionObject.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object obj = kVar.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = kVar.g;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                aVar = c;
                kVar.a = bookModel;
                kVar.b = aVar;
                kVar.c = z;
                kVar.d = 0;
                kVar.g = 1;
                if (aVar.t((Object) null, kVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = kVar.c;
                kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) kVar.b;
                BookModel bookModel2 = (BookModel) kVar.a;
                ResultKt.throwOnFailure(obj);
                aVar = aVar2;
                bookModel = bookModel2;
            }
            try {
                String strLoginUserName = NasConnectManager.getInstance().loginUserName();
                String str = "";
                if (strLoginUserName == null) {
                    strLoginUserName = "";
                }
                String nasId = NasConnectManager.getInstance().getNasId();
                if (nasId == null) {
                    nasId = "";
                }
                t1 t1VarB = ReaderDatabase.A().B();
                String category_id = bookModel.getCategory_id();
                if (category_id == null) {
                    category_id = "";
                }
                String nasPath = bookModel.getNasPath();
                if (nasPath != null) {
                    str = nasPath;
                }
                OfflineBookEntity offlineBookEntityA = t1VarB.a(strLoginUserName, nasId, category_id, str);
                OfflineBookEntity offlineBookEntityD = d(bookModel, z);
                if (offlineBookEntityA != null) {
                    Boxing.boxInt(ReaderDatabase.A().B().m(offlineBookEntityD));
                } else {
                    ReaderDatabase.A().B().g(offlineBookEntityD);
                    Unit unit = Unit.INSTANCE;
                }
                return Boxing.boxBoolean(true);
            } finally {
                aVar.v((Object) null);
            }
        } catch (Exception e2) {
            nd.a.d(gh.b.a, "syncUpdateBook->exception", e2);
            return Boxing.boxBoolean(false);
        }
    }
}
