package com.zentraedi.comic.business;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.tbs.one.TBSOneErrorCodes;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.file.data.FileData;
import com.zentraedi.business.file.response.TaskStatusResponse;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.upload.FileSyncBasicManager;
import com.zentraedi.business.upload.SyncBasicFunctionManager;
import com.zentraedi.business.utils.l5;
import com.zentraedi.business.utils.x4;
import com.zentraedi.comic.request.ComicEditRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicAutoCoverBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicAutoCoverBusiness.kt\ncom/zentraedi/comic/business/ComicAutoCoverBusiness\n+ 2 FilePathConstant.kt\ncom/zentraedi/business/FilePathConstantKt\n*L\n1#1,256:1\n1181#2:257\n*S KotlinDebug\n*F\n+ 1 ComicAutoCoverBusiness.kt\ncom/zentraedi/comic/business/ComicAutoCoverBusiness\n*L\n74#1:257\n*E\n"})
public final class h {

    @fo.k
    public static final String i = "_";

    @fo.k
    public static final String j = "/.comicposter/";

    @fo.k
    private final String a = "ComicAutoCoverBusiness";

    @fo.l
    private SyncBasicFunctionManager.BaseSyncListener b;

    @fo.l
    private String c;

    @fo.l
    private FileData d;

    @fo.l
    private ComicInfoModel e;

    @fo.l
    private String f;

    @fo.k
    public static final a g = new a(null);

    @fo.k
    private static String h = "/.comicposter/";

    @fo.k
    private static final HashMap<String, ComicSetCoverModel> k = new HashMap<>();

    @fo.k
    private static final Lazy<h> l = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.zentraedi.comic.business.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h.s();
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.k
        public final String a() {
            return h.h;
        }

        @fo.k
        public final h b() {
            return (h) h.l.getValue();
        }

        @fo.k
        public final HashMap<String, ComicSetCoverModel> c() {
            return h.k;
        }

        public final void d(@fo.k String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            h.h = str;
        }

        private a() {
        }
    }

    public static final class b extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ String a;
        final /* synthetic */ ComicInfoModel b;
        final /* synthetic */ String c;
        final /* synthetic */ Function0<Unit> d;
        final /* synthetic */ h e;

        b(String str, ComicInfoModel comicInfoModel, String str2, Function0<Unit> function0, h hVar) {
            this.a = str;
            this.b = comicInfoModel;
            this.c = str2;
            this.d = function0;
            this.e = hVar;
        }

        public void onResult(ResponseData<Object> resp) {
            ComicInfoModel comicInfoModel;
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess()) {
                this.e.t();
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
            this.e.t();
        }
    }

    public static final class c implements SyncBasicFunctionManager.BaseSyncListener {

        @DebugMetadata(c = "com.zentraedi.comic.business.ComicAutoCoverBusiness$getUploadListener$1$onCancel$1", f = "ComicAutoCoverBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ h b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = hVar;
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
                this.b.t();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.business.ComicAutoCoverBusiness$getUploadListener$1$onError$1", f = "ComicAutoCoverBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ h b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = hVar;
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
                this.b.t();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.comic.business.h$c$c, reason: collision with other inner class name */
        @DebugMetadata(c = "com.zentraedi.comic.business.ComicAutoCoverBusiness$getUploadListener$1$onFail$1", f = "ComicAutoCoverBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class C0108c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ h b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0108c(h hVar, Continuation<? super C0108c> continuation) {
                super(2, continuation);
                this.b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0108c(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.t();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((C0108c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.business.ComicAutoCoverBusiness$getUploadListener$1$onSuc$1", f = "ComicAutoCoverBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class d extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ h b;
            final /* synthetic */ FileData c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(h hVar, FileData fileData, Continuation<? super d> continuation) {
                super(2, continuation);
                this.b = hVar;
                this.c = fileData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                h hVar = this.b;
                FileData fileData = this.c;
                hVar.v(fileData != null ? fileData.getPathInServer() : null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((d) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        c() {
        }

        public void create(FileData fileData) {
        }

        public void onBlock(String str, String str2) {
        }

        public void onCancel(FileData fileData) {
            nd.a.e(h.this.a, "getUploadListener model=" + fileData);
            FileData fileData2 = h.this.d;
            if (TextUtils.equals(fileData2 != null ? fileData2.getPathInServer() : null, fileData != null ? fileData.getPathInServer() : null)) {
                kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new a(h.this, null), 3, (Object) null);
            }
        }

        public void onError(FileData fileData, String str, String str2) {
            nd.a.e(h.this.a, "getUploadListener onError model=" + fileData + " errorCode=" + str + " msg=" + str2);
            FileData fileData2 = h.this.d;
            if (TextUtils.equals(fileData2 != null ? fileData2.getPathInServer() : null, fileData != null ? fileData.getPathInServer() : null)) {
                kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new b(h.this, null), 3, (Object) null);
            }
        }

        public void onFail(FileData fileData, boolean z) {
            nd.a.e(h.this.a, "getUploadListener onFail model=" + fileData);
            FileData fileData2 = h.this.d;
            if (TextUtils.equals(fileData2 != null ? fileData2.getPathInServer() : null, fileData != null ? fileData.getPathInServer() : null)) {
                kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new C0108c(h.this, null), 3, (Object) null);
            }
        }

        public void onPrepareCreate(FileData fileData) {
            nd.a.e(h.this.a, "getUploadListener onPrepareCreate model=" + fileData);
        }

        public void onProgress(FileData fileData, long j) {
        }

        public void onRefreshUI() {
        }

        public void onSuc(FileData fileData, TaskStatusResponse taskStatusResponse) {
            String str = h.this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("getUploadListener onSuc model=");
            sb.append(fileData != null ? fileData.toJsonStr() : null);
            nd.a.e(str, sb.toString());
            FileData fileData2 = h.this.d;
            if (TextUtils.equals(fileData2 != null ? fileData2.getPathInServer() : null, fileData != null ? fileData.getPathInServer() : null)) {
                kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new d(h.this, fileData, null), 3, (Object) null);
            }
        }

        public boolean shouldSync(FileData fileData) {
            return true;
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.business.ComicAutoCoverBusiness$startUploadNas$1", f = "ComicAutoCoverBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class d extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            h.this.t();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((d) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.business.ComicAutoCoverBusiness$startUploadNas$2$1", f = "ComicAutoCoverBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class e extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            h.this.t();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((e) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public h() {
        h = "/.comicposter/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(String str, final h hVar) {
        Bitmap bitmapB = cc.a.b(str, TBSOneErrorCodes.OTHER_BASE, TBSOneErrorCodes.OTHER_BASE);
        String str2 = com.zentraedi.basic.function.utils.a.a().getCacheDir().getPath() + com.zentraedi.business.x.J;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        final String strA = com.zentraedi.basic.function.utils.r.a(com.zentraedi.business.w0.F() + System.currentTimeMillis());
        final String str3 = str2 + '/' + strA + ".jpg";
        final File file2 = new File(str3);
        l5.K(bitmapB, file2, new Runnable() { // from class: com.zentraedi.comic.business.f
            @Override // java.lang.Runnable
            public final void run() {
                h.p(this.a, file2, str3, strA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(h hVar, File file, String str, String str2) {
        nd.a.e(hVar.a, "comic cover saveBitmap targetFile.length=" + file.length());
        Intrinsics.checkNotNull(str2);
        String strSubstring = str2.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        hVar.y(str, strSubstring);
    }

    private final SyncBasicFunctionManager.BaseSyncListener r() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h s() {
        return new h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String str) {
        ComicInfoModel comicInfoModel = this.e;
        q(comicInfoModel, comicInfoModel != null ? comicInfoModel.getName() : null, str, new Function0() { // from class: com.zentraedi.comic.business.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.w(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(h hVar) {
        hVar.t();
        return Unit.INSTANCE;
    }

    private final void x() {
        Set<Map.Entry<String, ComicSetCoverModel>> setEntrySet = k.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        Map.Entry entry = (Map.Entry) CollectionsKt.firstOrNull(setEntrySet);
        if (entry != null) {
            this.c = (String) entry.getKey();
            this.f = ((ComicSetCoverModel) entry.getValue()).getPath();
            this.e = ((ComicSetCoverModel) entry.getValue()).getModel();
            StringBuilder sb = new StringBuilder();
            ComicInfoModel model = ((ComicSetCoverModel) entry.getValue()).getModel();
            sb.append(com.zentraedi.business.n.a.o(model != null ? model.getPath() : null, true));
            sb.append("/.comicposter/");
            h = sb.toString();
            n(((ComicSetCoverModel) entry.getValue()).getPath());
        }
    }

    private final void y(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new d(null), 3, (Object) null);
            return;
        }
        this.d = x4.a(h + str2, file, 1, file.getParent());
        String str3 = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("comic cover startUploadNas uploadData=");
        FileData fileData = this.d;
        sb.append(fileData != null ? fileData.toJsonStr() : null);
        nd.a.e(str3, sb.toString());
        if (this.b == null) {
            this.b = r();
            FileSyncBasicManager.Companion.getInstance().addListener(this.b);
        }
        FileSyncBasicManager companion = FileSyncBasicManager.Companion.getInstance();
        FileData fileData2 = this.d;
        Intrinsics.checkNotNull(fileData2);
        companion.immediateUpload(fileData2, new Function2() { // from class: com.zentraedi.comic.business.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return h.z(this.a, ((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(h hVar, boolean z, String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!z) {
            nd.a.e(hVar.a, "comic cover startUploadNas immediateUpload error=" + error);
            kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, hVar.new e(null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void m(@fo.k String path, @fo.l ComicInfoModel comicInfoModel) {
        ComicDirModel dir;
        Intrinsics.checkNotNullParameter(path, "path");
        StringBuilder sb = new StringBuilder();
        sb.append("comicInfoModel = ");
        sb.append(comicInfoModel != null ? comicInfoModel.toJsonStr() : null);
        nd.a.e("setComicPathByNasFile", sb.toString());
        HashMap<String, ComicSetCoverModel> map = k;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((comicInfoModel == null || (dir = comicInfoModel.getDir()) == null) ? null : dir.getId());
        sb2.append(comicInfoModel != null ? comicInfoModel.getPath() : null);
        map.put(sb2.toString(), new ComicSetCoverModel(comicInfoModel, path));
        if (this.c == null) {
            x();
        }
    }

    public final void n(@fo.k final String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        wd.b.d().execute(new Runnable() { // from class: com.zentraedi.comic.business.g
            @Override // java.lang.Runnable
            public final void run() {
                h.o(path, this);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicEditRequest] */
    public final void q(@fo.l ComicInfoModel comicInfoModel, @fo.l String str, @fo.l String str2, @fo.k Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ?? comicEditRequest = new ComicEditRequest(comicInfoModel != null ? comicInfoModel.getId() : null);
        comicEditRequest.setName(str);
        comicEditRequest.setCover(str2);
        comicEditRequest.setAuto(1);
        if (Intrinsics.areEqual(comicInfoModel != null ? comicInfoModel.getMasked() : null, "2")) {
            comicEditRequest.setMasked(null);
        }
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) comicEditRequest, new b(str2, comicInfoModel, str, callback, this));
    }

    public final void t() {
        HashMap<String, ComicSetCoverModel> map = k;
        TypeIntrinsics.asMutableMap(map).remove(this.c);
        u();
        x();
    }

    public final void u() {
        this.c = null;
        this.d = null;
        this.f = null;
        this.e = null;
        h = "";
    }
}
