package com.zentraedi.comic.business;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.tencent.tbs.one.TBSOneErrorCodes;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.file.data.FileData;
import com.zentraedi.business.file.response.TaskStatusResponse;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.nas.NasSDKManager;
import com.zentraedi.business.upload.FileSyncBasicManager;
import com.zentraedi.business.upload.SyncBasicFunctionManager;
import com.zentraedi.business.utils.l5;
import com.zentraedi.business.utils.v6;
import com.zentraedi.business.utils.x4;
import com.zentraedi.comic.event.ComicCoverChangeSuccessEvent;
import com.zentraedi.comic.request.ComicEditRequest;
import java.io.File;
import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicCoverBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCoverBusiness.kt\ncom/zentraedi/comic/business/ComicCoverBusiness\n+ 2 FilePathConstant.kt\ncom/zentraedi/business/FilePathConstantKt\n*L\n1#1,335:1\n1181#2:336\n1181#2:337\n*S KotlinDebug\n*F\n+ 1 ComicCoverBusiness.kt\ncom/zentraedi/comic/business/ComicCoverBusiness\n*L\n78#1:336\n87#1:337\n*E\n"})
public final class m {

    @fo.k
    public static final a h = new a(null);

    @fo.k
    private static String i = "/.comicposter/";

    @fo.k
    public static final String j = "_";

    @fo.k
    public static final String k = "/.comicposter/";

    @fo.l
    private SyncBasicFunctionManager.BaseSyncListener b;

    @fo.l
    private FileData c;

    @fo.l
    private ComicInfoModel d;

    @fo.l
    private String e;

    @fo.l
    private com.zentraedi.business.listener.l g;

    @fo.k
    private final String a = "ComicCoverBusiness";
    private boolean f = true;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.k
        public final String a() {
            return m.i;
        }

        public final void b(@fo.k String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            m.i = str;
        }

        private a() {
        }
    }

    public static final class b implements com.bumptech.glide.request.g<File> {
        b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean d(File resource, Object model, com.bumptech.glide.request.target.p<File> pVar, DataSource dataSource, boolean z) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            nd.a.e(m.this.a, "downloadUrl onResourceReady resource=" + resource.getAbsolutePath());
            m mVar = m.this;
            String absolutePath = resource.getAbsolutePath();
            if (absolutePath == null) {
                absolutePath = "";
            }
            mVar.l(absolutePath);
            return false;
        }

        public boolean c(GlideException glideException, Object obj, com.bumptech.glide.request.target.p<File> target, boolean z) {
            Intrinsics.checkNotNullParameter(target, "target");
            nd.a.e(m.this.a, "downloadUrl onResourceReady onLoadFailed");
            if (!m.this.f) {
                return false;
            }
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.tJ));
            com.zentraedi.business.listener.l lVar = m.this.g;
            if (lVar == null) {
                return false;
            }
            lVar.continueDo();
            return false;
        }
    }

    public static final class c extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ String a;
        final /* synthetic */ ComicInfoModel b;
        final /* synthetic */ String c;
        final /* synthetic */ Function0<Unit> d;
        final /* synthetic */ m e;

        c(String str, ComicInfoModel comicInfoModel, String str2, Function0<Unit> function0, m mVar) {
            this.a = str;
            this.b = comicInfoModel;
            this.c = str2;
            this.d = function0;
            this.e = mVar;
        }

        public void onResult(ResponseData<Object> resp) {
            ComicInfoModel comicInfoModel;
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess()) {
                if (this.e.f) {
                    com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.tJ));
                    com.zentraedi.business.listener.l lVar = this.e.g;
                    if (lVar != null) {
                        lVar.continueDo();
                        return;
                    }
                    return;
                }
                return;
            }
            String str = this.a;
            if (str != null && (comicInfoModel = this.b) != null) {
                if (TextUtils.equals("_", str)) {
                    str = null;
                }
                comicInfoModel.setCover(str);
            }
            ComicInfoModel comicInfoModel2 = this.b;
            if (comicInfoModel2 != null) {
                String str2 = this.c;
                if (str2 == null) {
                    str2 = "";
                }
                comicInfoModel2.setName(str2);
            }
            this.d.invoke();
        }

        public void onServerError() {
            if (this.e.f) {
                com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.tJ));
                com.zentraedi.business.listener.l lVar = this.e.g;
                if (lVar != null) {
                    lVar.continueDo();
                }
            }
        }
    }

    public static final class d implements SyncBasicFunctionManager.BaseSyncListener {

        @DebugMetadata(c = "com.zentraedi.comic.business.ComicCoverBusiness$getUploadListener$1$onCancel$1", f = "ComicCoverBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ m b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.r();
                if (this.b.f) {
                    com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.tJ));
                    com.zentraedi.business.listener.l lVar = this.b.g;
                    if (lVar != null) {
                        lVar.continueDo();
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.business.ComicCoverBusiness$getUploadListener$1$onError$1", f = "ComicCoverBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ m b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(m mVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.r();
                if (this.b.f) {
                    com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.tJ));
                    com.zentraedi.business.listener.l lVar = this.b.g;
                    if (lVar != null) {
                        lVar.continueDo();
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.business.ComicCoverBusiness$getUploadListener$1$onFail$1", f = "ComicCoverBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ m b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(m mVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.r();
                if (this.b.f) {
                    com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.tJ));
                    com.zentraedi.business.listener.l lVar = this.b.g;
                    if (lVar != null) {
                        lVar.continueDo();
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.comic.business.m$d$d, reason: collision with other inner class name */
        @DebugMetadata(c = "com.zentraedi.comic.business.ComicCoverBusiness$getUploadListener$1$onSuc$1", f = "ComicCoverBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class C0109d extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ m b;
            final /* synthetic */ FileData c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0109d(m mVar, FileData fileData, Continuation<? super C0109d> continuation) {
                super(2, continuation);
                this.b = mVar;
                this.c = fileData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0109d(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.r();
                m mVar = this.b;
                FileData fileData = this.c;
                mVar.s(fileData != null ? fileData.getPathInServer() : null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((C0109d) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        d() {
        }

        public void create(FileData fileData) {
        }

        public void onBlock(String str, String str2) {
        }

        public void onCancel(FileData fileData) {
            nd.a.e(m.this.a, "getUploadListener model=" + fileData);
            FileData fileData2 = m.this.c;
            if (TextUtils.equals(fileData2 != null ? fileData2.getPathInServer() : null, fileData != null ? fileData.getPathInServer() : null)) {
                kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new a(m.this, null), 3, (Object) null);
            }
        }

        public void onError(FileData fileData, String str, String str2) {
            nd.a.e(m.this.a, "getUploadListener onError model=" + fileData + " errorCode=" + str + " msg=" + str2);
            FileData fileData2 = m.this.c;
            if (TextUtils.equals(fileData2 != null ? fileData2.getPathInServer() : null, fileData != null ? fileData.getPathInServer() : null)) {
                kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new b(m.this, null), 3, (Object) null);
            }
        }

        public void onFail(FileData fileData, boolean z) {
            nd.a.e(m.this.a, "getUploadListener onFail model=" + fileData);
            FileData fileData2 = m.this.c;
            if (TextUtils.equals(fileData2 != null ? fileData2.getPathInServer() : null, fileData != null ? fileData.getPathInServer() : null)) {
                kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new c(m.this, null), 3, (Object) null);
            }
        }

        public void onPrepareCreate(FileData fileData) {
            nd.a.e(m.this.a, "getUploadListener onPrepareCreate model=" + fileData);
        }

        public void onProgress(FileData fileData, long j) {
        }

        public void onRefreshUI() {
        }

        public void onSuc(FileData fileData, TaskStatusResponse taskStatusResponse) {
            String str = m.this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("getUploadListener onSuc model=");
            sb.append(fileData != null ? fileData.toJsonStr() : null);
            nd.a.e(str, sb.toString());
            FileData fileData2 = m.this.c;
            if (TextUtils.equals(fileData2 != null ? fileData2.getPathInServer() : null, fileData != null ? fileData.getPathInServer() : null)) {
                kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new C0109d(m.this, fileData, null), 3, (Object) null);
            }
        }

        public boolean shouldSync(FileData fileData) {
            return true;
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.business.ComicCoverBusiness$startUploadNas$1", f = "ComicCoverBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class e extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return m.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (m.this.f) {
                com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.tJ));
                com.zentraedi.business.listener.l lVar = m.this.g;
                if (lVar != null) {
                    lVar.continueDo();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((e) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.business.ComicCoverBusiness$startUploadNas$2$1", f = "ComicCoverBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class f extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return m.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            m.this.r();
            if (m.this.f) {
                com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.tJ));
                com.zentraedi.business.listener.l lVar = m.this.g;
                if (lVar != null) {
                    lVar.continueDo();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((f) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public m() {
        i = "/.comicposter/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(String str, final m mVar) {
        Bitmap bitmapB = cc.a.b(str, TBSOneErrorCodes.OTHER_BASE, TBSOneErrorCodes.OTHER_BASE);
        String str2 = com.zentraedi.basic.function.utils.a.a().getCacheDir().getPath() + com.zentraedi.business.x.J;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        final String strA = com.zentraedi.basic.function.utils.r.a(com.zentraedi.business.w0.F() + System.currentTimeMillis());
        final String str3 = str2 + '/' + strA + ".jpg";
        final File file2 = new File(str3);
        l5.K(bitmapB, file2, new Runnable() { // from class: com.zentraedi.comic.business.j
            @Override // java.lang.Runnable
            public final void run() {
                m.n(this.a, file2, str3, strA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(m mVar, File file, String str, String str2) {
        nd.a.e(mVar.a, "comic cover saveBitmap targetFile.length=" + file.length());
        Intrinsics.checkNotNull(str2);
        String strSubstring = str2.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        mVar.x(str, strSubstring);
    }

    private final void o() {
        String strH;
        if (v6.r(this.e) == 2) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strI = v6.i(this.e, "pub_album", true);
            Intrinsics.checkNotNullExpressionValue(strI, "getPathUrl(...)");
            strH = String.format(strI, Arrays.copyOf(new Object[]{NasSDKManager.getInstance().getAddr(), Uri.encode(this.e)}, 2));
            Intrinsics.checkNotNullExpressionValue(strH, "format(...)");
        } else {
            strH = v6.k(this.e, false).h();
        }
        nd.a.e(this.a, "downloadUrl url=" + strH);
        com.bumptech.glide.c.F(com.zentraedi.basic.function.utils.a.a()).D().z1(new com.bumptech.glide.load.model.h(strH, new com.bumptech.glide.load.model.k.a().b("Cookie", v6.d()).c())).t1(new b()).w0(100).G1();
    }

    private final SyncBasicFunctionManager.BaseSyncListener q() {
        return new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(final String str) {
        ComicInfoModel comicInfoModel = this.d;
        p(comicInfoModel, comicInfoModel != null ? comicInfoModel.getName() : null, str, new Function0() { // from class: com.zentraedi.comic.business.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.t(this.a, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(m mVar, String str) {
        if (mVar.f) {
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.yI));
            com.zentraedi.business.listener.l lVar = mVar.g;
            if (lVar != null) {
                lVar.continueDo();
            }
        }
        org.greenrobot.eventbus.c.f().q(new ComicCoverChangeSuccessEvent(mVar.d, str, mVar.e));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void w(m mVar, String str, ComicInfoModel comicInfoModel, boolean z, com.zentraedi.business.listener.l lVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        mVar.v(str, comicInfoModel, z, lVar);
    }

    private final void x(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new e(null), 3, (Object) null);
        }
        this.c = x4.a(i + str2, file, 1, file.getParent());
        String str3 = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("comic cover startUploadNas uploadData=");
        FileData fileData = this.c;
        sb.append(fileData != null ? fileData.toJsonStr() : null);
        nd.a.e(str3, sb.toString());
        if (this.b == null) {
            this.b = q();
        }
        FileSyncBasicManager.Companion companion = FileSyncBasicManager.Companion;
        companion.getInstance().addListener(this.b);
        FileSyncBasicManager companion2 = companion.getInstance();
        FileData fileData2 = this.c;
        Intrinsics.checkNotNull(fileData2);
        companion2.immediateUpload(fileData2, new Function2() { // from class: com.zentraedi.comic.business.i
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return m.y(this.a, ((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(m mVar, boolean z, String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!z) {
            nd.a.e(mVar.a, "comic cover startUploadNas immediateUpload error=" + error);
            kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, mVar.new f(null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void l(@fo.k final String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        wd.b.d().execute(new Runnable() { // from class: com.zentraedi.comic.business.k
            @Override // java.lang.Runnable
            public final void run() {
                m.m(path, this);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicEditRequest] */
    public final void p(@fo.l ComicInfoModel comicInfoModel, @fo.l String str, @fo.l String str2, @fo.k Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ?? comicEditRequest = new ComicEditRequest(comicInfoModel != null ? comicInfoModel.getId() : null);
        comicEditRequest.setName(str);
        comicEditRequest.setCover(str2);
        if (!this.f) {
            comicEditRequest.setAuto(1);
        }
        if (Intrinsics.areEqual(comicInfoModel != null ? comicInfoModel.getMasked() : null, "2")) {
            comicEditRequest.setMasked(null);
        }
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) comicEditRequest, new c(str2, comicInfoModel, str, callback, this));
    }

    public final void r() {
        FileSyncBasicManager.Companion.getInstance().removeListener(this.b);
        this.b = null;
    }

    public final void u(@fo.k String path, @fo.l ComicInfoModel comicInfoModel, boolean z) {
        Intrinsics.checkNotNullParameter(path, "path");
        StringBuilder sb = new StringBuilder();
        sb.append("comicInfoModel = ");
        sb.append(comicInfoModel != null ? comicInfoModel.toJsonStr() : null);
        nd.a.e("setComicPathByNasFile", sb.toString());
        this.e = path;
        this.d = comicInfoModel;
        this.f = z;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.zentraedi.business.n.a.o(comicInfoModel != null ? comicInfoModel.getPath() : null, true));
        sb2.append("/.comicposter/");
        i = sb2.toString();
        l(path);
    }

    public final void v(@fo.k String path, @fo.l ComicInfoModel comicInfoModel, boolean z, @fo.l com.zentraedi.business.listener.l lVar) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.g = lVar;
        StringBuilder sb = new StringBuilder();
        sb.append("comicInfoModel = ");
        sb.append(comicInfoModel != null ? comicInfoModel.toJsonStr() : null);
        nd.a.e("setComicPathByNasFile", sb.toString());
        this.e = path;
        this.d = comicInfoModel;
        this.f = z;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.zentraedi.business.n.a.o(comicInfoModel != null ? comicInfoModel.getPath() : null, true));
        sb2.append("/.comicposter/");
        i = sb2.toString();
        o();
    }
}
