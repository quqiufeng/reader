package com.zentraedi.outreader.local;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.basic.component.networkmonitor.NetWorkState;
import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.basic.function.utils.r;
import com.zentraedi.business.model.CourseFileInfoModel;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.reader.BookContentChangeEvent;
import com.zentraedi.business.w0;
import com.zentraedi.outreader.database.ReaderDatabase;
import com.zentraedi.outreader.model.BookChapterEntity;
import com.zentraedi.outreader.model.SectionContentEntity;
import com.zentraedi.outreader.request.CourseBookRecordModify;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.util.h;
import com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil;
import fo.k;
import fo.l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.z0;
import pe.i;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nLocalReaderManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalReaderManager.kt\ncom/zentraedi/outreader/local/LocalReaderManager\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,333:1\n35#2,8:334\n53#2:346\n35#2,8:347\n53#2:359\n48#3,4:342\n48#3,4:355\n*S KotlinDebug\n*F\n+ 1 LocalReaderManager.kt\ncom/zentraedi/outreader/local/LocalReaderManager\n*L\n321#1:334,8\n321#1:346\n329#1:347,8\n329#1:359\n321#1:342,4\n329#1:355,4\n*E\n"})
public final class LocalReaderManager {

    @k
    public static final a f = new a(null);

    @k
    private static final Lazy<LocalReaderManager> g;

    @k
    private static final Lazy<String> h;

    @k
    private final String a = "LocalReaderManager";

    @l
    private List<SectionContentEntity> b;

    @l
    private BookChapterEntity c;

    @l
    private BookModel d;

    @l
    private BookModel e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void c() {
        }

        @k
        public final String a() {
            Object value = LocalReaderManager.h.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (String) value;
        }

        @k
        public final LocalReaderManager b() {
            return (LocalReaderManager) LocalReaderManager.g.getValue();
        }

        @JvmStatic
        public final boolean d(@l String str) {
            if (str == null || str.length() == 0) {
                return false;
            }
            return StringsKt.startsWith$default(str, a(), false, 2, (Object) null);
        }

        private a() {
        }
    }

    public static final class b extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ boolean a;
        final /* synthetic */ LocalReaderManager b;

        b(boolean z, LocalReaderManager localReaderManager) {
            this.a = z;
            this.b = localReaderManager;
        }

        public void onResult(ResponseData<Object> responseData) {
            if (NasConnectManager.getInstance().isOfflineLogin() && this.a) {
                org.greenrobot.eventbus.c.f().q(new BookContentChangeEvent());
            }
        }

        public void onServerError() {
            nd.a.c(this.b.a, "saveBookEntityAndNotifyRefresh->recordBookProgressInfo onServerError");
        }
    }

    public static final class c extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ BookModel a;
        final /* synthetic */ LocalReaderManager b;
        final /* synthetic */ boolean c;

        c(BookModel bookModel, LocalReaderManager localReaderManager, boolean z) {
            this.a = bookModel;
            this.b = localReaderManager;
            this.c = z;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (Intrinsics.areEqual("200", resp.getCode())) {
                org.greenrobot.eventbus.c.f().q(new BookContentChangeEvent());
                return;
            }
            BookModel bookModel = this.a;
            if (bookModel != null) {
                bookModel.setOffline(Boolean.TRUE);
            }
            this.b.u(this.a, true, this.c);
        }

        public void onServerError() {
            BookModel bookModel = this.a;
            if (bookModel != null) {
                bookModel.setOffline(Boolean.TRUE);
            }
            this.b.u(this.a, true, this.c);
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class d extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 LocalReaderManager.kt\ncom/zentraedi/outreader/local/LocalReaderManager\n*L\n1#1,61:1\n329#2:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 LocalReaderManager.kt\ncom/zentraedi/outreader/local/LocalReaderManager\n*L\n1#1,61:1\n329#2:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 LocalReaderManager.kt\ncom/zentraedi/outreader/local/LocalReaderManager\n*L\n1#1,61:1\n329#2:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        public d(CoroutineExceptionHandler.b bVar) {
            super(bVar);
        }

        public void handleException(@k CoroutineContext coroutineContext, @k Throwable th2) {
            try {
                nd.a.h("CoroutineScope", "throwable->coroutineDefaultWithMain() throwable=" + Log.getStackTraceString(th2));
                th2.printStackTrace();
                i.r(new a());
            } catch (Throwable th3) {
                try {
                    th3.printStackTrace();
                    i.r(new b());
                } catch (Throwable th4) {
                    i.r(new c());
                    throw th4;
                }
            }
        }
    }

    public static final class e extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ boolean a;
        final /* synthetic */ LocalReaderManager b;

        e(boolean z, LocalReaderManager localReaderManager) {
            this.a = z;
            this.b = localReaderManager;
        }

        public void onResult(ResponseData<Object> responseData) {
            if (this.a) {
                org.greenrobot.eventbus.c.f().q(new BookContentChangeEvent());
            }
        }

        public void onServerError() {
            nd.a.c(this.b.a, "saveProgressDb onServerError");
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class f extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 LocalReaderManager.kt\ncom/zentraedi/outreader/local/LocalReaderManager\n*L\n1#1,61:1\n321#2:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 LocalReaderManager.kt\ncom/zentraedi/outreader/local/LocalReaderManager\n*L\n1#1,61:1\n321#2:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 LocalReaderManager.kt\ncom/zentraedi/outreader/local/LocalReaderManager\n*L\n1#1,61:1\n321#2:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        public f(CoroutineExceptionHandler.b bVar) {
            super(bVar);
        }

        public void handleException(@k CoroutineContext coroutineContext, @k Throwable th2) {
            try {
                nd.a.h("CoroutineScope", "throwable->coroutineDefaultWithMain() throwable=" + Log.getStackTraceString(th2));
                th2.printStackTrace();
                i.r(new a());
            } catch (Throwable th3) {
                try {
                    th3.printStackTrace();
                    i.r(new b());
                } catch (Throwable th4) {
                    i.r(new c());
                    throw th4;
                }
            }
        }
    }

    public static final class g implements com.zentraedi.basic.component.easythread.b<String> {
        final /* synthetic */ com.zentraedi.basic.component.easythread.b<String> b;
        final /* synthetic */ String c;
        final /* synthetic */ BaseModel d;
        final /* synthetic */ Context e;

        @DebugMetadata(c = "com.zentraedi.outreader.local.LocalReaderManager$transfer$handler$1$onSuccess$1", f = "LocalReaderManager.kt", i = {0, 0}, l = {192}, m = "invokeSuspend", n = {"$this$launch", "bookId"}, s = {"L$0", "L$1"}, v = 1)
        static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            Object a;
            int b;
            private /* synthetic */ Object c;
            final /* synthetic */ String d;
            final /* synthetic */ LocalReaderManager e;
            final /* synthetic */ BaseModel f;
            final /* synthetic */ Context g;
            final /* synthetic */ com.zentraedi.basic.component.easythread.b<String> h;
            final /* synthetic */ String i;

            /* JADX INFO: renamed from: com.zentraedi.outreader.local.LocalReaderManager$g$a$a, reason: collision with other inner class name */
            @DebugMetadata(c = "com.zentraedi.outreader.local.LocalReaderManager$transfer$handler$1$onSuccess$1$2", f = "LocalReaderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            static final class C0142a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
                int a;
                final /* synthetic */ com.zentraedi.basic.component.easythread.b<String> b;
                final /* synthetic */ String c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0142a(com.zentraedi.basic.component.easythread.b<String> bVar, String str, Continuation<? super C0142a> continuation) {
                    super(2, continuation);
                    this.b = bVar;
                    this.c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0142a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    com.zentraedi.basic.component.easythread.b<String> bVar = this.b;
                    if (bVar != null) {
                        bVar.onSuccess(this.c);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                    return ((C0142a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, LocalReaderManager localReaderManager, BaseModel baseModel, Context context, com.zentraedi.basic.component.easythread.b<String> bVar, String str2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.d = str;
                this.e = localReaderManager;
                this.f = baseModel;
                this.g = context;
                this.h = bVar;
                this.i = str2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Context context) {
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.hC2), false);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.d, this.e, this.f, this.g, this.h, this.i, continuation);
                aVar.c = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00ee  */
            /* JADX WARN: Code duplicated, block: B:25:0x0121  */
            /* JADX WARN: Instruction removed from duplicated block: B:23:0x00ee, please report this as an issue */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str;
                q0 q0Var = (q0) this.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String strA = r.a(this.d);
                    this.e.z(ReaderDatabase.A().D().d(h.a(), strA));
                    if (this.e.o() == null) {
                        this.e.z(new ArrayList());
                    }
                    if (this.e.k() == null) {
                        nd.a.c(this.e.a, "transfer->handler->bookChapter is null, read database");
                        this.e.w(ReaderDatabase.A().t().h(h.a(), strA));
                        nd.a.c(this.e.a, "transfer->handler->bookChapter is null, read database, bookChapter = " + this.e.k());
                    }
                    if (this.e.k() == null) {
                        this.c = q0Var;
                        this.a = strA;
                        this.b = 1;
                        if (z0.b(2000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = strA;
                    }
                    if (this.e.k() == null) {
                        kotlinx.coroutines.i.e(q0Var, g1.e(), (CoroutineStart) null, new C0142a(this.h, this.i, null), 2, (Object) null);
                        return Unit.INSTANCE;
                    }
                    nd.a.c(this.e.a, "transfer->bookChapter is always null. path=" + this.d + ", fileInfoModel=" + this.f);
                    i.q(this.g, new Function1() { // from class: com.zentraedi.outreader.local.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LocalReaderManager.g.a.e((Context) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.a;
                ResultKt.throwOnFailure(obj);
                this.e.w(ReaderDatabase.A().t().h(h.a(), str));
                nd.a.c(this.e.a, "transfer->handler->Delay 2s, bookChapter = " + this.e.k());
                if (this.e.k() == null) {
                    kotlinx.coroutines.i.e(q0Var, g1.e(), (CoroutineStart) null, new C0142a(this.h, this.i, null), 2, (Object) null);
                    return Unit.INSTANCE;
                }
                nd.a.c(this.e.a, "transfer->bookChapter is always null. path=" + this.d + ", fileInfoModel=" + this.f);
                i.q(this.g, new Function1() { // from class: com.zentraedi.outreader.local.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LocalReaderManager.g.a.e((Context) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        g(com.zentraedi.basic.component.easythread.b<String> bVar, String str, BaseModel baseModel, Context context) {
            this.b = bVar;
            this.c = str;
            this.d = baseModel;
            this.e = context;
        }

        @Override // com.zentraedi.basic.component.easythread.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            if (LocalReaderManager.this.o() == null || LocalReaderManager.this.k() == null) {
                kotlinx.coroutines.i.e(a2.a, (CoroutineContext) null, (CoroutineStart) null, new a(this.c, LocalReaderManager.this, this.d, this.e, this.b, str, null), 3, (Object) null);
                return;
            }
            com.zentraedi.basic.component.easythread.b<String> bVar = this.b;
            if (bVar != null) {
                bVar.onSuccess(str);
            }
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable th2) {
            LocalReaderManager.this.h();
            com.zentraedi.basic.component.easythread.b<String> bVar = this.b;
            if (bVar != null) {
                bVar.onFailed(th2);
            }
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        g = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.zentraedi.outreader.local.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalReaderManager.p();
            }
        });
        h = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.zentraedi.outreader.local.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalReaderManager.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g() {
        return com.zentraedi.basic.function.utils.a.a().getCacheDir().getAbsolutePath();
    }

    @k
    public static final LocalReaderManager m() {
        return f.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalReaderManager p() {
        return new LocalReaderManager();
    }

    @JvmStatic
    public static final boolean q(@l String str) {
        return f.d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(BookModel bookModel, boolean z, boolean z2) {
        OfflineBookWrapperUtil.a.n(bookModel, z, new e(z2, this));
    }

    public final void A(@k Context context, @k BaseModel fileInfoModel, @l com.zentraedi.basic.component.easythread.b<String> bVar) {
        String localPath;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileInfoModel, "fileInfoModel");
        boolean z = fileInfoModel instanceof FileInfoModel;
        if (z) {
            localPath = ((FileInfoModel) fileInfoModel).getLocalPath();
            if (localPath == null) {
                return;
            }
        } else if (!(fileInfoModel instanceof BookModel) || (localPath = ((BookModel) fileInfoModel).getLocalPath()) == null) {
            return;
        }
        String str = localPath;
        if (!new File(str).exists()) {
            nd.a.c(this.a, "transfer: file not exist " + str);
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Sl0), false);
            if (bVar != null) {
                bVar.onFailed(null);
                return;
            }
            return;
        }
        g gVar = new g(bVar, str, fileInfoModel, context);
        if (fileInfoModel instanceof CourseFileInfoModel) {
            com.zentraedi.outreader.local.d.f(context, (CourseFileInfoModel) fileInfoModel, gVar);
        } else if (z) {
            com.zentraedi.outreader.local.d.h(context, (FileInfoModel) fileInfoModel, gVar);
        } else if (fileInfoModel instanceof BookModel) {
            com.zentraedi.outreader.local.d.e(context, (BookModel) fileInfoModel, gVar);
        }
    }

    public final void h() {
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final void i(@k FileInfoModel fileInfoModel, @l String str, boolean z, @l gd.a aVar) {
        Intrinsics.checkNotNullParameter(fileInfoModel, "fileInfoModel");
        if (fileInfoModel instanceof CourseFileInfoModel) {
            if (aVar != null) {
                aVar.complete(2);
                return;
            }
            return;
        }
        String strD = com.zentraedi.business.reader.c.d(fileInfoModel);
        try {
            if (new File(strD).exists()) {
                fileInfoModel.setLocalPath(strD);
                if (aVar != null) {
                    aVar.complete(2);
                    return;
                }
                return;
            }
            if (!z) {
                com.zentraedi.business.reader.d.c(fileInfoModel, strD, str, aVar);
                return;
            }
            String strB = com.zentraedi.business.reader.c.b(fileInfoModel);
            if (strB != null && strB.length() != 0 && new File(strB).exists()) {
                fileInfoModel.setLocalPath(strB);
                if (aVar != null) {
                    aVar.complete(2);
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(strD) || !new File(strD).exists()) {
                com.zentraedi.business.reader.d.c(fileInfoModel, strB, str, aVar);
                return;
            }
            fileInfoModel.setLocalPath(strD);
            if (aVar != null) {
                aVar.complete(2);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            nd.a.d(this.a, "downloadIfNeed exception", th2);
        }
    }

    public final void j(@k FileInfoModel fileInfoModel, boolean z, @l gd.a aVar) {
        Intrinsics.checkNotNullParameter(fileInfoModel, "fileInfoModel");
        i(fileInfoModel, null, z, aVar);
    }

    @l
    public final BookChapterEntity k() {
        return this.c;
    }

    @l
    public final BookModel l() {
        return this.d;
    }

    @l
    public final BookModel n() {
        return this.e;
    }

    @l
    public final List<SectionContentEntity> o() {
        return this.b;
    }

    public final void r(@l BookModel bookModel, boolean z) {
        Boolean boolIsOffline;
        if (NasConnectManager.getInstance().isOfflineLogin() || !NasConnectManager.getInstance().isConnection(w0.a) || com.zentraedi.basic.function.utils.a.h().i() == NetWorkState.NONE) {
            OfflineBookWrapperUtil.a.n(bookModel, true, new b(z, this));
            return;
        }
        if (z) {
            OfflineBookWrapperUtil.a.n(bookModel, (bookModel == null || (boolIsOffline = bookModel.isOffline()) == null) ? false : boolIsOffline.booleanValue(), null);
        }
        com.zentraedi.outreader.wrapper.b.a.i(bookModel, new c(bookModel, this, z));
    }

    public final void s(@l BookChapterEntity bookChapterEntity) {
        if (bookChapterEntity == null) {
            return;
        }
        this.c = bookChapterEntity;
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + LocalReaderManager.class + ' ' + Thread.currentThread().getName());
        kotlinx.coroutines.i.e(r0.a(g1.a().plus(new d(CoroutineExceptionHandler.F2))), (CoroutineContext) null, (CoroutineStart) null, new LocalReaderManager$saveChapterEntity$$inlined$coroutineDefaultWithMain$2(this, LocalReaderManager.class, null, bookChapterEntity), 3, (Object) null);
    }

    public final void t(@l BookModel bookModel) {
        FileInfoModel fromFileInfo = bookModel != null ? bookModel.getFromFileInfo() : null;
        if (fromFileInfo == null || !(fromFileInfo instanceof CourseFileInfoModel)) {
            return;
        }
        CourseBookRecordModify courseBookRecordModify = new CourseBookRecordModify();
        courseBookRecordModify.setRead_chapter(bookModel.getRead_chapter());
        courseBookRecordModify.setRead_chapter_id(bookModel.recordReadChapterId());
        courseBookRecordModify.setRead_page(bookModel.getRead_page());
        courseBookRecordModify.setRead_progress(bookModel.getReadProgressPercent());
        courseBookRecordModify.setRead_finished(bookModel.getRead_finished());
        courseBookRecordModify.setText_position(bookModel.getRecordTextPosition());
        courseBookRecordModify.setFont_size(Integer.valueOf(bookModel.getFontSize()));
        ((CourseFileInfoModel) fromFileInfo).setRecordReading(courseBookRecordModify.toJsonStr());
        com.zentraedi.business.video.helper.b.a.a().d(fromFileInfo);
    }

    public final void v(@l List<SectionContentEntity> list) {
        if (list == null) {
            return;
        }
        this.b = list;
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + LocalReaderManager.class + ' ' + Thread.currentThread().getName());
        kotlinx.coroutines.i.e(r0.a(g1.a().plus(new f(CoroutineExceptionHandler.F2))), (CoroutineContext) null, (CoroutineStart) null, new LocalReaderManager$saveSectionEntities$$inlined$coroutineDefaultWithMain$2(this, LocalReaderManager.class, null, list), 3, (Object) null);
    }

    public final void w(@l BookChapterEntity bookChapterEntity) {
        this.c = bookChapterEntity;
    }

    public final void x(@l BookModel bookModel) {
        this.d = bookModel;
    }

    public final void y(@l BookModel bookModel) {
        this.e = bookModel;
    }

    public final void z(@l List<SectionContentEntity> list) {
        this.b = list;
    }
}
