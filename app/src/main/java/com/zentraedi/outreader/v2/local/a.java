package com.zentraedi.outreader.v2.local;

import android.content.Context;
import android.text.TextUtils;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.basic.component.networkmonitor.NetWorkState;
import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.basic.function.utils.r;
import com.zentraedi.business.model.CourseFileInfoModel;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.model.LocalFileModel;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.reader.BookContentChangeEvent;
import com.zentraedi.business.w0;
import com.zentraedi.outreader.database.ReaderDatabase;
import com.zentraedi.outreader.event.BookModelChangeEvent;
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
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.z0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class a {

    @k
    public static final C0157a f = new C0157a(null);

    @l
    private static a g;

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

    /* JADX INFO: renamed from: com.zentraedi.outreader.v2.local.a$a, reason: collision with other inner class name */
    public static final class C0157a {
        public /* synthetic */ C0157a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void b() {
        }

        @k
        public final a a() {
            if (a.g == null) {
                synchronized (a.class) {
                    try {
                        if (a.g == null) {
                            C0157a c0157a = a.f;
                            a.g = new a();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            a aVar = a.g;
            Intrinsics.checkNotNull(aVar);
            return aVar;
        }

        private C0157a() {
        }
    }

    public static final class b extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ boolean a;
        final /* synthetic */ a b;

        b(boolean z, a aVar) {
            this.a = z;
            this.b = aVar;
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
        final /* synthetic */ a b;
        final /* synthetic */ boolean c;

        c(BookModel bookModel, a aVar, boolean z) {
            this.a = bookModel;
            this.b = aVar;
            this.c = z;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (Intrinsics.areEqual("200", resp.getCode())) {
                org.greenrobot.eventbus.c.f().q(new BookContentChangeEvent());
                return;
            }
            BookModel bookModel = this.a;
            Intrinsics.checkNotNull(bookModel);
            bookModel.setOffline(Boolean.TRUE);
            this.b.p(this.a, true, this.c);
        }

        public void onServerError() {
            BookModel bookModel = this.a;
            Intrinsics.checkNotNull(bookModel);
            bookModel.setOffline(Boolean.TRUE);
            this.b.p(this.a, true, this.c);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.local.NewLocalReaderManager$saveChapterEntity$1", f = "NewLocalReaderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class d extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ BookChapterEntity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(BookChapterEntity bookChapterEntity, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = bookChapterEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ReaderDatabase.A().t().c(this.b);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((d) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class e extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ boolean a;
        final /* synthetic */ a b;

        e(boolean z, a aVar) {
            this.a = z;
            this.b = aVar;
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

    @DebugMetadata(c = "com.zentraedi.outreader.v2.local.NewLocalReaderManager$saveSectionEntities$1", f = "NewLocalReaderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class f extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ List<SectionContentEntity> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List<SectionContentEntity> list, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ReaderDatabase.A().D().e(this.b);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((f) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class g implements com.zentraedi.basic.component.easythread.b<String> {
        final /* synthetic */ com.zentraedi.basic.component.easythread.b<String> b;
        final /* synthetic */ String c;
        final /* synthetic */ BaseModel d;
        final /* synthetic */ Context e;

        /* JADX INFO: renamed from: com.zentraedi.outreader.v2.local.a$g$a, reason: collision with other inner class name */
        @DebugMetadata(c = "com.zentraedi.outreader.v2.local.NewLocalReaderManager$transfer$handler$1$onSuccess$1", f = "NewLocalReaderManager.kt", i = {0, 0}, l = {195}, m = "invokeSuspend", n = {"$this$launch", "bookId"}, s = {"L$0", "L$1"}, v = 1)
        static final class C0158a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            Object a;
            int b;
            private /* synthetic */ Object c;
            final /* synthetic */ String d;
            final /* synthetic */ a e;
            final /* synthetic */ BaseModel f;
            final /* synthetic */ Context g;
            final /* synthetic */ com.zentraedi.basic.component.easythread.b<String> h;
            final /* synthetic */ String i;

            /* JADX INFO: renamed from: com.zentraedi.outreader.v2.local.a$g$a$a, reason: collision with other inner class name */
            @DebugMetadata(c = "com.zentraedi.outreader.v2.local.NewLocalReaderManager$transfer$handler$1$onSuccess$1$1", f = "NewLocalReaderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            static final class C0159a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
                int a;

                C0159a(Continuation<? super C0159a> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0159a(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.hC2), false);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                    return ((C0159a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.zentraedi.outreader.v2.local.a$g$a$b */
            @DebugMetadata(c = "com.zentraedi.outreader.v2.local.NewLocalReaderManager$transfer$handler$1$onSuccess$1$2", f = "NewLocalReaderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            static final class b extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
                int a;
                final /* synthetic */ com.zentraedi.basic.component.easythread.b<String> b;
                final /* synthetic */ String c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(com.zentraedi.basic.component.easythread.b<String> bVar, String str, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.b = bVar;
                    this.c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.b, this.c, continuation);
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
                    return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.zentraedi.outreader.v2.local.a$g$a$c */
            @DebugMetadata(c = "com.zentraedi.outreader.v2.local.NewLocalReaderManager$transfer$handler$1$onSuccess$1$4", f = "NewLocalReaderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            static final class c extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
                int a;
                final /* synthetic */ com.zentraedi.basic.component.easythread.b<String> b;
                final /* synthetic */ String c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(com.zentraedi.basic.component.easythread.b<String> bVar, String str, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.b = bVar;
                    this.c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.b, this.c, continuation);
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
                    return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0158a(String str, a aVar, BaseModel baseModel, Context context, com.zentraedi.basic.component.easythread.b<String> bVar, String str2, Continuation<? super C0158a> continuation) {
                super(2, continuation);
                this.d = str;
                this.e = aVar;
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
                C0158a c0158a = new C0158a(this.d, this.e, this.f, this.g, this.h, this.i, continuation);
                c0158a.c = obj;
                return c0158a;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x0131  */
            /* JADX WARN: Code duplicated, block: B:33:0x0164  */
            /* JADX WARN: Instruction removed from duplicated block: B:31:0x0131, please report this as an issue */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Continuation continuation;
                String str;
                q0 q0Var = (q0) this.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String strA = r.a(this.d);
                    this.e.u(ReaderDatabase.A().D().d(h.a(), strA));
                    if (this.e.l() == null) {
                        this.e.u(new ArrayList());
                    }
                    if (this.e.i() == null) {
                        i.e(q0Var, g1.e(), (CoroutineStart) null, new C0159a(null), 2, (Object) null);
                        return Unit.INSTANCE;
                    }
                    continuation = null;
                    BookModel bookModelI = this.e.i();
                    Intrinsics.checkNotNull(bookModelI);
                    if (!bookModelI.isTxt()) {
                        i.e(q0Var, g1.e(), (CoroutineStart) null, new b(this.h, this.i, null), 2, (Object) null);
                        return Unit.INSTANCE;
                    }
                    if (this.e.h() == null) {
                        nd.a.c(this.e.a, "transfer->handler->bookChapter is null, read database");
                        this.e.r(ReaderDatabase.A().t().h(h.a(), strA));
                        nd.a.c(this.e.a, "transfer->handler->bookChapter is null, read database, bookChapter = " + this.e.h());
                    }
                    if (this.e.h() == null) {
                        this.c = q0Var;
                        this.a = strA;
                        this.b = 1;
                        if (z0.b(2000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = strA;
                    }
                    if (this.e.h() == null) {
                        i.e(q0Var, g1.e(), (CoroutineStart) null, new c(this.h, this.i, continuation), 2, (Object) null);
                        return Unit.INSTANCE;
                    }
                    nd.a.c(this.e.a, "transfer->bookChapter is always null. path=" + this.d + ", fileInfoModel=" + this.f);
                    pe.i.q(this.g, new Function1() { // from class: com.zentraedi.outreader.v2.local.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return a.g.C0158a.e((Context) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.a;
                ResultKt.throwOnFailure(obj);
                continuation = null;
                this.e.r(ReaderDatabase.A().t().h(h.a(), str));
                nd.a.c(this.e.a, "transfer->handler->Delay 2s, bookChapter = " + this.e.h());
                if (this.e.h() == null) {
                    i.e(q0Var, g1.e(), (CoroutineStart) null, new c(this.h, this.i, continuation), 2, (Object) null);
                    return Unit.INSTANCE;
                }
                nd.a.c(this.e.a, "transfer->bookChapter is always null. path=" + this.d + ", fileInfoModel=" + this.f);
                pe.i.q(this.g, new Function1() { // from class: com.zentraedi.outreader.v2.local.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return a.g.C0158a.e((Context) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((C0158a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (a.this.l() == null || a.this.h() == null) {
                i.e(a2.a, (CoroutineContext) null, (CoroutineStart) null, new C0158a(this.c, a.this, this.d, this.e, this.b, str, null), 3, (Object) null);
                return;
            }
            com.zentraedi.basic.component.easythread.b<String> bVar = this.b;
            if (bVar != null) {
                bVar.onSuccess(str);
            }
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable th2) {
            a.this.e();
            com.zentraedi.basic.component.easythread.b<String> bVar = this.b;
            if (bVar != null) {
                bVar.onFailed(th2);
            }
        }
    }

    @k
    public static final a j() {
        return f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(BookModel bookModel, boolean z, boolean z2) {
        OfflineBookWrapperUtil.a.n(bookModel, z, new e(z2, this));
    }

    public final void e() {
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final void f(@k FileInfoModel fileInfoModel, boolean z, @l gd.a aVar) {
        Intrinsics.checkNotNullParameter(fileInfoModel, "fileInfoModel");
        try {
            if (g(fileInfoModel, z)) {
                com.zentraedi.business.reader.d.d(fileInfoModel, fileInfoModel.getLocalPath(), aVar);
            } else if (aVar != null) {
                aVar.complete(2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            nd.a.c(this.a, "downloadIfNeed exception: " + e2.getLocalizedMessage());
        }
    }

    public final boolean g(@k FileInfoModel fileInfoModel, boolean z) {
        Intrinsics.checkNotNullParameter(fileInfoModel, "fileInfoModel");
        if ((fileInfoModel instanceof CourseFileInfoModel) || (fileInfoModel instanceof LocalFileModel)) {
            return false;
        }
        String strD = com.zentraedi.business.reader.c.d(fileInfoModel);
        if (new File(strD).exists()) {
            fileInfoModel.setLocalPath(strD);
            return false;
        }
        if (!z) {
            fileInfoModel.setLocalPath(strD);
            return true;
        }
        String strB = com.zentraedi.business.reader.c.b(fileInfoModel);
        if (!TextUtils.isEmpty(strB) && new File(strB).exists()) {
            fileInfoModel.setLocalPath(strB);
            return false;
        }
        if (TextUtils.isEmpty(strD) || !new File(strD).exists()) {
            fileInfoModel.setLocalPath(strB);
            return true;
        }
        fileInfoModel.setLocalPath(strD);
        return false;
    }

    @l
    public final BookChapterEntity h() {
        return this.c;
    }

    @l
    public final BookModel i() {
        return this.d;
    }

    @l
    public final BookModel k() {
        return this.e;
    }

    @l
    public final List<SectionContentEntity> l() {
        return this.b;
    }

    public final void m(@l BookModel bookModel, boolean z) {
        if (bookModel == null) {
            return;
        }
        org.greenrobot.eventbus.c.f().q(new BookModelChangeEvent(bookModel));
        if (NasConnectManager.getInstance().isOfflineLogin() || !NasConnectManager.getInstance().isConnection(w0.a) || com.zentraedi.basic.function.utils.a.h().i() == NetWorkState.NONE) {
            OfflineBookWrapperUtil.a.n(bookModel, true, new b(z, this));
            return;
        }
        if (z) {
            Boolean boolIsOffline = bookModel.isOffline();
            OfflineBookWrapperUtil.a.n(bookModel, boolIsOffline != null ? boolIsOffline.booleanValue() : false, null);
        }
        com.zentraedi.outreader.wrapper.b.a.i(bookModel, new c(bookModel, this, z));
    }

    public final void n(@l BookChapterEntity bookChapterEntity) {
        if (bookChapterEntity == null) {
            return;
        }
        this.c = bookChapterEntity;
        i.e(a2.a, (CoroutineContext) null, (CoroutineStart) null, new d(bookChapterEntity, null), 3, (Object) null);
    }

    public final void o(@l BookModel bookModel) {
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

    public final void q(@l List<SectionContentEntity> list) {
        if (list == null) {
            return;
        }
        this.b = list;
        i.e(a2.a, (CoroutineContext) null, (CoroutineStart) null, new f(list, null), 3, (Object) null);
    }

    public final void r(@l BookChapterEntity bookChapterEntity) {
        this.c = bookChapterEntity;
    }

    public final void s(@l BookModel bookModel) {
        this.d = bookModel;
    }

    public final void t(@l BookModel bookModel) {
        this.e = bookModel;
    }

    public final void u(@l List<SectionContentEntity> list) {
        this.b = list;
    }

    public final void v(@k Context context, @k BaseModel fileInfoModel, @l com.zentraedi.basic.component.easythread.b<String> bVar) {
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
            com.zentraedi.outreader.v2.local.c.e(context, (FileInfoModel) fileInfoModel, gVar);
            return;
        }
        if (fileInfoModel instanceof LocalFileModel) {
            com.zentraedi.outreader.v2.local.c.e(context, (FileInfoModel) fileInfoModel, gVar);
        } else if (z) {
            com.zentraedi.outreader.v2.local.c.c(context, (FileInfoModel) fileInfoModel, gVar);
        } else if (fileInfoModel instanceof BookModel) {
            com.zentraedi.outreader.v2.local.c.b(context, (BookModel) fileInfoModel, gVar);
        }
    }
}
