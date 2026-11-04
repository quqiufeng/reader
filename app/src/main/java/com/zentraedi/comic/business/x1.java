package com.zentraedi.comic.business;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.tencent.tbs.one.TBSOneErrorCodes;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.basic.function.picture.ImageProxy;
import com.zentraedi.business.FileConstant;
import com.zentraedi.business.file.data.FileData;
import com.zentraedi.business.file.response.TaskStatusResponse;
import com.zentraedi.business.manager.placeholder.PlaceholderLoader;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.nas.NasSDKManager;
import com.zentraedi.business.request.FileListRequest;
import com.zentraedi.business.upload.FileSyncBasicManager;
import com.zentraedi.business.upload.SyncBasicFunctionManager;
import com.zentraedi.business.utils.d5;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.l5;
import com.zentraedi.business.utils.v6;
import com.zentraedi.business.utils.x4;
import com.zentraedi.business.view.BaseEditText;
import com.zentraedi.comic.activity.SelectPhoneImageActivity;
import com.zentraedi.comic.event.ComicInfoCreateEvent;
import com.zentraedi.comic.event.ComicInfoEditEvent;
import com.zentraedi.comic.event.ComicShelfChangedEvent;
import com.zentraedi.comic.model.ComicDirListResponse;
import com.zentraedi.comic.model.ComicInfoBatchResponse;
import com.zentraedi.comic.request.ComicCreateRequest;
import com.zentraedi.comic.request.ComicEditRequest;
import com.zentraedi.comic.request.ComicInfoBatchRequest;
import com.zentraedi.comic.request.ComicInfoRequest;
import com.zentraedi.comic.request.ComicShelfEditRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicInfoBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicInfoBusiness.kt\ncom/zentraedi/comic/business/ComicInfoBusiness\n+ 2 FilePathConstant.kt\ncom/zentraedi/business/FilePathConstantKt\n+ 3 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt\n*L\n1#1,905:1\n1273#2:906\n1212#2:907\n1188#2:908\n416#3:909\n429#3:910\n*S KotlinDebug\n*F\n+ 1 ComicInfoBusiness.kt\ncom/zentraedi/comic/business/ComicInfoBusiness\n*L\n166#1:906\n167#1:907\n169#1:908\n223#1:909\n223#1:910\n*E\n"})
public final class x1 {

    @fo.k
    public static final a r = new a(null);

    @fo.k
    private static String s = "/.comicposter/";

    @fo.k
    public static final String t = "_";

    @fo.k
    public static final String u = "/.comicposter/";
    private final int c;

    @fo.l
    private com.zentraedi.basic.function.ui.dialog.b g;

    @fo.l
    private SyncBasicFunctionManager.BaseSyncListener h;

    @fo.l
    private FileData i;

    @fo.l
    private ComicInfoModel j;

    @fo.l
    private com.zentraedi.comic.databinding.y0 l;

    @fo.l
    private Function0<Unit> m;

    @fo.l
    private com.zentraedi.basic.function.ui.dialog.b n;

    @fo.l
    private String o;

    @fo.k
    private final String a = "ComicInfoBusiness";
    private final int b = -1;
    private final int d = 1;
    private final int e = 2;
    private final int f = 3;
    private int k = -1;

    @fo.k
    private final Lazy p = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.business.v1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return x1.j0(this.a);
        }
    });

    @fo.k
    private String q = "";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.k
        public final String a() {
            return x1.s;
        }

        public final void b(@fo.k String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            x1.s = str;
        }

        private a() {
        }
    }

    public static final class b extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ Function1<Boolean, Unit> a;
        final /* synthetic */ Boolean b;
        final /* synthetic */ ComicShelfEditRequest c;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Boolean, Unit> function1, Boolean bool, ComicShelfEditRequest comicShelfEditRequest) {
            this.a = function1;
            this.b = bool;
            this.c = comicShelfEditRequest;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            Function1<Boolean, Unit> function1 = this.a;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(resp.isSuccess()));
            }
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
            } else {
                com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(Intrinsics.areEqual(this.b, Boolean.TRUE) ? com.zentraedi.comic.q.C0124q.Qv2 : com.zentraedi.comic.q.C0124q.lx2));
                org.greenrobot.eventbus.c.f().q(new ComicShelfChangedEvent(this.c.getOn_shelf(), this.c.getComic_ids()));
            }
        }

        public void onServerError() {
            Function1<Boolean, Unit> function1 = this.a;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    public static final class c extends com.zentraedi.business.http.b<ComicInfoModel> {
        final /* synthetic */ Function1<ComicInfoModel, Unit> a;

        c(Function1<? super ComicInfoModel, Unit> function1) {
            this.a = function1;
        }

        public void onResult(ResponseData<ComicInfoModel> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
                return;
            }
            Function1<ComicInfoModel, Unit> function1 = this.a;
            ComicInfoModel data = resp.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            function1.invoke(data);
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            ComicInfoModel data2 = resp.getData();
            Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
            cVarF.q(new ComicInfoCreateEvent(data2));
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    public static final class d implements com.bumptech.glide.request.g<File> {
        final /* synthetic */ boolean b;

        d(boolean z) {
            this.b = z;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean d(File resource, Object model, com.bumptech.glide.request.target.p<File> pVar, DataSource dataSource, boolean z) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            nd.a.e(x1.this.a, "downloadUrl onResourceReady resource=" + resource.getAbsolutePath());
            x1 x1Var = x1.this;
            String absolutePath = resource.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            x1Var.H(absolutePath, false);
            return false;
        }

        public boolean c(GlideException glideException, Object obj, com.bumptech.glide.request.target.p<File> target, boolean z) {
            com.zentraedi.basic.function.ui.dialog.b bVar;
            Intrinsics.checkNotNullParameter(target, "target");
            nd.a.e(x1.this.a, "downloadUrl onResourceReady onLoadFailed");
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.wu1));
            if (!this.b || (bVar = x1.this.g) == null) {
                return false;
            }
            bVar.dismiss();
            return false;
        }
    }

    public static final class e implements com.bumptech.glide.request.g<File> {
        e() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean d(File resource, Object model, com.bumptech.glide.request.target.p<File> pVar, DataSource dataSource, boolean z) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            nd.a.e(x1.this.a, "downloadUrl onResourceReady resource=" + resource.getAbsolutePath());
            com.zentraedi.comic.databinding.y0 y0Var = x1.this.l;
            if (y0Var != null) {
                y0Var.L.setTag(resource.getAbsolutePath());
                if (y0Var.Q.isSelected()) {
                    ImageProxy.j(com.zentraedi.basic.function.utils.a.a(), resource.getAbsolutePath(), y0Var.N, com.zentraedi.comic.util.e.c());
                    y0Var.N.setVisibility(0);
                }
            }
            com.zentraedi.comic.databinding.y0 y0Var2 = x1.this.l;
            if (y0Var2 != null) {
                y0Var2.a0.setVisibility(8);
                y0Var2.T.setEnabled(true);
            }
            return false;
        }

        public boolean c(GlideException glideException, Object obj, com.bumptech.glide.request.target.p<File> target, boolean z) {
            Intrinsics.checkNotNullParameter(target, "target");
            nd.a.e(x1.this.a, "downloadUrl onResourceReady onLoadFailed");
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.XK));
            com.zentraedi.comic.databinding.y0 y0Var = x1.this.l;
            if (y0Var == null) {
                return false;
            }
            y0Var.a0.setVisibility(8);
            y0Var.T.setEnabled(true);
            return false;
        }
    }

    @SourceDebugExtension({"SMAP\nComicInfoBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicInfoBusiness.kt\ncom/zentraedi/comic/business/ComicInfoBusiness$editComic$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,905:1\n1#2:906\n*E\n"})
    public static final class f extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ String b;
        final /* synthetic */ ComicInfoModel c;
        final /* synthetic */ String d;
        final /* synthetic */ Function0<Unit> e;
        final /* synthetic */ Boolean f;

        f(String str, ComicInfoModel comicInfoModel, String str2, Function0<Unit> function0, Boolean bool) {
            this.b = str;
            this.c = comicInfoModel;
            this.d = str2;
            this.e = function0;
            this.f = bool;
        }

        public void onResult(ResponseData<Object> resp) {
            ComicInfoModel comicInfoModel;
            Intrinsics.checkNotNullParameter(resp, "resp");
            com.zentraedi.basic.function.ui.dialog.b bVar = x1.this.g;
            if (bVar != null) {
                bVar.dismiss();
            }
            if (!resp.isSuccess()) {
                if (Intrinsics.areEqual(this.f, Boolean.TRUE)) {
                    com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
                    return;
                }
                return;
            }
            String str = this.b;
            if (str != null && (comicInfoModel = this.c) != null) {
                if (TextUtils.equals("_", str)) {
                    str = null;
                }
                comicInfoModel.setCover(str);
            }
            ComicInfoModel comicInfoModel2 = this.c;
            if (comicInfoModel2 != null) {
                String str2 = this.d;
                if (str2 == null) {
                    str2 = "";
                }
                comicInfoModel2.setName(str2);
            }
            this.e.invoke();
            ComicInfoModel comicInfoModel3 = this.c;
            if (comicInfoModel3 != null) {
                org.greenrobot.eventbus.c.f().q(new ComicInfoEditEvent(comicInfoModel3));
            }
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.dialog.b bVar = x1.this.g;
            if (bVar != null) {
                bVar.dismiss();
            }
            if (Intrinsics.areEqual(this.f, Boolean.TRUE)) {
                com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
            }
        }
    }

    public static final class g extends com.zentraedi.business.http.b<ComicInfoModel> {
        final /* synthetic */ Function2<Boolean, ComicInfoModel, Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        g(Function2<? super Boolean, ? super ComicInfoModel, Unit> function2) {
            this.b = function2;
        }

        public void onResult(ResponseData<ComicInfoModel> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            com.zentraedi.basic.function.ui.dialog.b bVar = x1.this.g;
            if (bVar != null) {
                bVar.dismiss();
            }
            if (resp.isSuccess()) {
                this.b.invoke(Boolean.TRUE, resp.getData());
            } else {
                this.b.invoke(Boolean.TRUE, null);
            }
        }

        public void onServerError() {
            this.b.invoke(Boolean.FALSE, null);
            com.zentraedi.basic.function.ui.dialog.b bVar = x1.this.g;
            if (bVar != null) {
                bVar.dismiss();
            }
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    @SourceDebugExtension({"SMAP\nComicInfoBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicInfoBusiness.kt\ncom/zentraedi/comic/business/ComicInfoBusiness$getDirFirstComicCover$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,905:1\n1#2:906\n1869#3,2:907\n*S KotlinDebug\n*F\n+ 1 ComicInfoBusiness.kt\ncom/zentraedi/comic/business/ComicInfoBusiness$getDirFirstComicCover$1\n*L\n859#1:907,2\n*E\n"})
    public static final class h extends com.zentraedi.business.http.b<ComicDirListResponse> {
        final /* synthetic */ Function1<String, Unit> a;
        final /* synthetic */ String b;

        @SourceDebugExtension({"SMAP\nComicInfoBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicInfoBusiness.kt\ncom/zentraedi/comic/business/ComicInfoBusiness$getDirFirstComicCover$1$onResult$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,905:1\n1#2:906\n*E\n"})
        public static final class a extends com.zentraedi.business.http.b<ComicInfoBatchResponse> {
            final /* synthetic */ Function1<String, Unit> a;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super String, Unit> function1) {
                this.a = function1;
            }

            public void onResult(ResponseData<ComicInfoBatchResponse> responseData) {
                ComicInfoModel comicInfoModel;
                List<ComicInfoModel> list;
                Object next;
                String cover;
                if (responseData == null || !responseData.isSuccess()) {
                    this.a.invoke(null);
                    return;
                }
                ComicInfoBatchResponse data = responseData.getData();
                if (data == null || (list = data.getList()) == null) {
                    comicInfoModel = null;
                } else {
                    Iterator<T> it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            cover = ((ComicInfoModel) next).getCover();
                        }
                    } while (cover == null || cover.length() == 0);
                    comicInfoModel = (ComicInfoModel) next;
                }
                if (comicInfoModel != null) {
                    this.a.invoke(comicInfoModel.getCover());
                } else {
                    this.a.invoke(null);
                }
            }

            public void onServerError() {
                this.a.invoke(null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        h(Function1<? super String, Unit> function1, String str) {
            this.a = function1;
            this.b = str;
        }

        /* JADX WARN: Type inference failed for: r9v6, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicInfoBatchRequest] */
        public void onResult(ResponseData<ComicDirListResponse> responseData) {
            ComicDirModel comicDirModel;
            List<ComicDirModel> list;
            Object next;
            if (responseData == null || !responseData.isSuccess()) {
                this.a.invoke(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            ComicDirListResponse data = responseData.getData();
            List<ComicDirModel> list2 = data != null ? data.getList() : null;
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (3 != i5.a.f(((ComicDirModel) next).getPath()));
                comicDirModel = (ComicDirModel) next;
            } else {
                comicDirModel = null;
            }
            if (comicDirModel != null) {
                this.a.invoke(comicDirModel.getPath());
                return;
            }
            ComicDirListResponse data2 = responseData.getData();
            if (data2 != null && (list = data2.getList()) != null) {
                String str = this.b;
                for (ComicDirModel comicDirModel2 : list) {
                    String strCreateKey = comicDirModel2.createKey(str);
                    if (TextUtils.equals(comicDirModel2.isDir(), "1") || i5.a.n(comicDirModel2.getPath())) {
                        arrayList.add(strCreateKey);
                        map.put(strCreateKey, comicDirModel2);
                    }
                }
            }
            if (map.isEmpty()) {
                this.a.invoke(null);
                return;
            }
            ?? comicInfoBatchRequest = new ComicInfoBatchRequest();
            comicInfoBatchRequest.setList(arrayList);
            com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) comicInfoBatchRequest, new a(this.a));
        }

        public void onServerError() {
            this.a.invoke(null);
        }
    }

    public static final class i implements SyncBasicFunctionManager.BaseSyncListener {

        @DebugMetadata(c = "com.zentraedi.comic.business.ComicInfoBusiness$getUploadListener$1$onCancel$1", f = "ComicInfoBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ x1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x1 x1Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = x1Var;
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
                com.zentraedi.basic.function.ui.dialog.b bVar = this.b.g;
                if (bVar != null) {
                    bVar.dismiss();
                }
                com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.ZH));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.business.ComicInfoBusiness$getUploadListener$1$onError$1", f = "ComicInfoBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ x1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(x1 x1Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = x1Var;
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
                com.zentraedi.basic.function.ui.dialog.b bVar = this.b.g;
                if (bVar != null) {
                    bVar.dismiss();
                }
                com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.oM));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.business.ComicInfoBusiness$getUploadListener$1$onFail$1", f = "ComicInfoBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ x1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(x1 x1Var, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = x1Var;
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
                com.zentraedi.basic.function.ui.dialog.b bVar = this.b.g;
                if (bVar != null) {
                    bVar.dismiss();
                }
                com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.oM));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.business.ComicInfoBusiness$getUploadListener$1$onSuc$1", f = "ComicInfoBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class d extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ x1 b;
            final /* synthetic */ FileData c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(x1 x1Var, FileData fileData, Continuation<? super d> continuation) {
                super(2, continuation);
                this.b = x1Var;
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
                com.zentraedi.basic.function.ui.dialog.b bVar = this.b.g;
                if (bVar != null) {
                    bVar.dismiss();
                }
                x1 x1Var = this.b;
                FileData fileData = this.c;
                x1Var.n0(fileData != null ? fileData.getPathInServer() : null);
                com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.ux2));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((d) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        i() {
        }

        public void create(FileData fileData) {
        }

        public void onBlock(String str, String str2) {
        }

        public void onCancel(FileData fileData) {
            nd.a.e(x1.this.a, "getUploadListener model=" + fileData);
            FileData fileData2 = x1.this.i;
            if (TextUtils.equals(fileData2 != null ? fileData2.getPathInServer() : null, fileData != null ? fileData.getPathInServer() : null)) {
                kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new a(x1.this, null), 3, (Object) null);
            }
        }

        public void onError(FileData fileData, String str, String str2) {
            nd.a.e(x1.this.a, "getUploadListener onError model=" + fileData + " errorCode=" + str + " msg=" + str2);
            FileData fileData2 = x1.this.i;
            if (TextUtils.equals(fileData2 != null ? fileData2.getPathInServer() : null, fileData != null ? fileData.getPathInServer() : null)) {
                kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new b(x1.this, null), 3, (Object) null);
            }
        }

        public void onFail(FileData fileData, boolean z) {
            nd.a.e(x1.this.a, "getUploadListener onFail model=" + fileData);
            FileData fileData2 = x1.this.i;
            if (TextUtils.equals(fileData2 != null ? fileData2.getPathInServer() : null, fileData != null ? fileData.getPathInServer() : null)) {
                kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new c(x1.this, null), 3, (Object) null);
            }
        }

        public void onPrepareCreate(FileData fileData) {
            nd.a.e(x1.this.a, "getUploadListener onPrepareCreate model=" + fileData);
        }

        public void onProgress(FileData fileData, long j) {
        }

        public void onRefreshUI() {
        }

        public void onSuc(FileData fileData, TaskStatusResponse taskStatusResponse) {
            String str = x1.this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("getUploadListener onSuc model=");
            sb.append(fileData != null ? fileData.toJsonStr() : null);
            nd.a.e(str, sb.toString());
            FileData fileData2 = x1.this.i;
            if (TextUtils.equals(fileData2 != null ? fileData2.getPathInServer() : null, fileData != null ? fileData.getPathInServer() : null)) {
                kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new d(x1.this, fileData, null), 3, (Object) null);
            }
        }

        public boolean shouldSync(FileData fileData) {
            return true;
        }
    }

    @SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt$addTextWatcher$1\n+ 2 ComicInfoBusiness.kt\ncom/zentraedi/comic/business/ComicInfoBusiness\n*L\n1#1,778:1\n224#2,3:779\n*E\n"})
    public static final class j implements TextWatcher {
        final /* synthetic */ com.zentraedi.comic.databinding.y0 a;

        public j(com.zentraedi.comic.databinding.y0 y0Var) {
            this.a = y0Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            this.a.T.setEnabled(!TextUtils.isEmpty(StringsKt.trim(s.toString()).toString()));
            this.a.Z.setEnabled(!TextUtils.isEmpty(StringsKt.trim(s.toString()).toString()));
        }
    }

    public static final class k implements SelectPhoneImageActivity.b {
        final /* synthetic */ Activity b;

        k(Activity activity) {
            this.b = activity;
        }

        @Override // com.zentraedi.comic.activity.SelectPhoneImageActivity.b
        public void a(String str) {
            nd.a.e(x1.this.a, "localImageDialog path=" + str);
            if (str != null) {
                x1 x1Var = x1.this;
                Activity activity = this.b;
                Intrinsics.checkNotNull(activity);
                x1Var.B0(activity, str);
            }
        }
    }

    public static final class l implements com.zentraedi.business.fileselect.f0.k {
        l() {
        }

        public void a(com.zentraedi.business.fileselect.f0 f0Var, List<String> list) {
        }

        public void onDismiss(androidx.fragment.app.m mVar) {
        }

        public void onSuccess(List<FileInfoModel> list) {
            TextView textView;
            FileInfoModel fileInfoModel;
            FileInfoModel fileInfoModel2;
            if (com.zentraedi.basic.function.utils.j0.l(list)) {
                return;
            }
            String name = null;
            x1.this.r0((list == null || (fileInfoModel2 = (FileInfoModel) CollectionsKt.first((List) list)) == null) ? null : fileInfoModel2.getPath());
            PlaceholderLoader.Builder builderUrl = new PlaceholderLoader.Builder().url(x1.this.o);
            com.zentraedi.comic.databinding.y0 y0Var = x1.this.l;
            builderUrl.view(y0Var != null ? y0Var.N : null).roundingRadius(com.zentraedi.comic.util.e.c()).load();
            com.zentraedi.comic.databinding.y0 y0Var2 = x1.this.l;
            if (y0Var2 == null || (textView = y0Var2.V) == null) {
                return;
            }
            if (list != null && (fileInfoModel = (FileInfoModel) CollectionsKt.first((List) list)) != null) {
                name = fileInfoModel.getName();
            }
            textView.setText(name);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.business.ComicInfoBusiness$startUploadNas$1", f = "ComicInfoBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class m extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;

        m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return x1.this.new m(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.zentraedi.basic.function.ui.dialog.b bVar = x1.this.g;
            if (bVar != null) {
                bVar.dismiss();
            }
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.wu1));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((m) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.business.ComicInfoBusiness$startUploadNas$2$1", f = "ComicInfoBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class n extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, Continuation<? super n> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return x1.this.new n(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.zentraedi.basic.function.ui.dialog.b bVar = x1.this.g;
            if (bVar != null) {
                bVar.dismiss();
            }
            com.zentraedi.basic.function.ui.toast.a.A(this.c);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((n) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public x1() {
        s = "/.comicposter/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(x1 x1Var, DialogInterface dialogInterface) {
        FileSyncBasicManager.Companion.getInstance().removeListener(x1Var.h);
        x1Var.h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(Context context, String str) {
        this.q = str;
        com.zentraedi.comic.databinding.y0 y0Var = this.l;
        if (y0Var != null) {
            y0Var.J.setText(l5.r(str));
            y0Var.N.setVisibility(0);
            y0Var.I.setVisibility(8);
            ImageProxy.j(context, str, y0Var.N, com.zentraedi.comic.util.e.c());
        }
    }

    private final com.zentraedi.basic.function.ui.dialog.b C0(String str) {
        com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.comic.q.l.lc);
        ((TextView) bVar.b(com.zentraedi.comic.q.i.WS)).setText(str);
        bVar.setCanceledOnTouchOutside(false);
        bVar.e(true);
        return bVar;
    }

    private final void D0(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, new m(null), 3, (Object) null);
        }
        this.i = x4.a(s + str2, file, 1, file.getParent());
        String str3 = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("comic cover startUploadNas uploadData=");
        FileData fileData = this.i;
        sb.append(fileData != null ? fileData.toJsonStr() : null);
        nd.a.e(str3, sb.toString());
        this.h = Y();
        FileSyncBasicManager.Companion companion = FileSyncBasicManager.Companion;
        companion.getInstance().addListener(this.h);
        FileSyncBasicManager companion2 = companion.getInstance();
        FileData fileData2 = this.i;
        Intrinsics.checkNotNull(fileData2);
        companion2.immediateUpload(fileData2, new Function2() { // from class: com.zentraedi.comic.business.t1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return x1.E0(this.a, ((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E0(x1 x1Var, boolean z, String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!z) {
            nd.a.e(x1Var.a, "comic cover startUploadNas immediateUpload error=" + error);
            kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.e()), (CoroutineContext) null, (CoroutineStart) null, x1Var.new n(error, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private final void F0(int i2, com.zentraedi.comic.databinding.y0 y0Var) {
        this.k = i2;
        y0Var.O.setSelected(i2 == this.c);
        y0Var.H.setEnabled(this.k == this.c);
        y0Var.P.setSelected(this.k == this.d);
        y0Var.W.setEnabled(this.k == this.d);
        y0Var.Q.setSelected(this.k == this.e);
        y0Var.L.setEnabled(this.k == this.e);
        y0Var.X.setSelected(this.k == this.f);
        y0Var.V.setSelected(this.k == this.f);
        y0Var.Y.setEnabled(this.k == this.f);
        y0Var.T.setEnabled(this.k == this.e && !TextUtils.isEmpty(StringsKt.trim(String.valueOf(y0Var.L.getText())).toString()));
        y0Var.Z.setEnabled(this.k == this.e && !TextUtils.isEmpty(StringsKt.trim(String.valueOf(y0Var.L.getText())).toString()));
        y0Var.J.setText("");
        y0Var.V.setText("");
        y0Var.L.setText("");
        this.q = "";
        this.o = "";
        if (y0Var.O.isSelected()) {
            h0();
        }
        if (y0Var.P.isSelected() && !TextUtils.isEmpty(this.q)) {
            Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
            Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
            B0(activityE, this.q);
        }
        if (y0Var.Q.isSelected()) {
            String string = y0Var.L.getTag() != null ? y0Var.L.getTag().toString() : "";
            if (TextUtils.isEmpty(string)) {
                return;
            }
            ImageProxy.j(com.zentraedi.basic.function.utils.a.a(), string, y0Var.N, com.zentraedi.comic.util.e.c());
            y0Var.N.setVisibility(0);
            y0Var.I.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void G(x1 x1Var, String str, Boolean bool, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bool = Boolean.TRUE;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        x1Var.F(str, bool, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(final String str, boolean z) {
        if (z) {
            String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.pM);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            com.zentraedi.basic.function.ui.dialog.b bVarC0 = C0(strN);
            this.g = bVarC0;
            if (bVarC0 != null) {
                bVarC0.show();
            }
        }
        wd.b.d().execute(new Runnable() { // from class: com.zentraedi.comic.business.l1
            @Override // java.lang.Runnable
            public final void run() {
                x1.J(str, this);
            }
        });
    }

    static /* synthetic */ void I(x1 x1Var, String str, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        x1Var.H(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(String str, final x1 x1Var) {
        Bitmap bitmapB = cc.a.b(str, TBSOneErrorCodes.OTHER_BASE, TBSOneErrorCodes.OTHER_BASE);
        String str2 = com.zentraedi.basic.function.utils.a.a().getCacheDir().getPath() + com.zentraedi.business.x.J;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        final String strA = com.zentraedi.basic.function.utils.r.a(com.zentraedi.business.w0.F() + System.currentTimeMillis());
        final String str3 = str2 + '/' + strA + ".jpg";
        final File file2 = new File(str3);
        l5.K(bitmapB, file2, new Runnable() { // from class: com.zentraedi.comic.business.u1
            @Override // java.lang.Runnable
            public final void run() {
                x1.K(this.a, file2, str3, strA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(x1 x1Var, File file, String str, String str2) {
        nd.a.e(x1Var.a, "comic cover saveBitmap targetFile.length=" + file.length());
        Intrinsics.checkNotNull(str2);
        String strSubstring = str2.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        x1Var.D0(str, strSubstring);
    }

    public static /* synthetic */ void M(x1 x1Var, String str, String str2, String str3, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        x1Var.L(str, str2, str3, function1);
    }

    public static /* synthetic */ void P(x1 x1Var, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        x1Var.O(z);
    }

    private final void Q(String str) {
        nd.a.e(this.a, "downloadUrl url=" + str);
        com.bumptech.glide.c.F(com.zentraedi.basic.function.utils.a.a()).D().z1(new com.bumptech.glide.load.model.h(str, new com.bumptech.glide.load.model.k.a().c())).t1(new e()).w0(100).G1();
    }

    public static /* synthetic */ void S(x1 x1Var, ComicInfoModel comicInfoModel, String str, String str2, Boolean bool, Function0 function0, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            bool = Boolean.TRUE;
        }
        x1Var.R(comicInfoModel, str, str2, bool, function0);
    }

    private final com.zentraedi.business.fileselect.s X() {
        return (com.zentraedi.business.fileselect.s) this.p.getValue();
    }

    private final SyncBasicFunctionManager.BaseSyncListener Y() {
        return new i();
    }

    private final void Z(final com.zentraedi.comic.databinding.y0 y0Var) {
        BaseEditText baseEditText = y0Var.L;
        if (baseEditText != null) {
            baseEditText.addTextChangedListener(new j(y0Var));
        }
        y0Var.O.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x1.a0(this.a, y0Var, view);
            }
        });
        y0Var.P.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x1.b0(this.a, y0Var, view);
            }
        });
        y0Var.Q.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x1.c0(this.a, y0Var, view);
            }
        });
        y0Var.X.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x1.d0(this.a, y0Var, view);
            }
        });
        y0Var.W.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x1.e0(this.a, view);
            }
        });
        y0Var.T.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x1.f0(y0Var, this, view);
            }
        });
        y0Var.Y.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x1.g0(this.a, y0Var, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(x1 x1Var, com.zentraedi.comic.databinding.y0 y0Var, View view) {
        x1Var.F0(x1Var.c, y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(x1 x1Var, com.zentraedi.comic.databinding.y0 y0Var, View view) {
        x1Var.F0(x1Var.d, y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(x1 x1Var, com.zentraedi.comic.databinding.y0 y0Var, View view) {
        x1Var.F0(x1Var.e, y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(x1 x1Var, com.zentraedi.comic.databinding.y0 y0Var, View view) {
        x1Var.F0(x1Var.f, y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(x1 x1Var, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        x1Var.i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(com.zentraedi.comic.databinding.y0 y0Var, x1 x1Var, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        String string = StringsKt.trim(String.valueOf(y0Var.L.getText())).toString();
        y0Var.L.setTag(string);
        if (TextUtils.isEmpty(string)) {
            y0Var.N.setImageResource(0);
            return;
        }
        y0Var.T.setEnabled(false);
        y0Var.a0.setVisibility(0);
        x1Var.Q(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(x1 x1Var, com.zentraedi.comic.databinding.y0 y0Var, View view) {
        String strM;
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        x1Var.X().f0().set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.UK));
        ComicInfoModel comicInfoModel = x1Var.j;
        if (comicInfoModel == null || !comicInfoModel.isDir()) {
            d5.a aVar = d5.a;
            ComicInfoModel comicInfoModel2 = x1Var.j;
            strM = aVar.m(comicInfoModel2 != null ? comicInfoModel2.getPath() : null);
        } else {
            ComicInfoModel comicInfoModel3 = x1Var.j;
            strM = comicInfoModel3 != null ? comicInfoModel3.getPath() : null;
        }
        com.zentraedi.business.fileselect.s.a aVar2 = new com.zentraedi.business.fileselect.s.a();
        FragmentActivity fragmentActivityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNull(fragmentActivityE, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        com.zentraedi.business.fileselect.s.a aVarB = aVar2.b(fragmentActivityE);
        View root = y0Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        x1Var.X().U0(aVarB.Y(root).a(FileConstant.DialogOptionActionType.COMIC_SELECT_COVER).X(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.LU0)).z(strM).A((String) null).x(1).W((String) null).y((String) null).G(true));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    private final void h0() {
        boolean z;
        com.zentraedi.comic.databinding.y0 y0Var = this.l;
        if (y0Var != null) {
            ImageView defaultIcon = y0Var.I;
            Intrinsics.checkNotNullExpressionValue(defaultIcon, "defaultIcon");
            ComicInfoModel comicInfoModel = this.j;
            String strValueOf = String.valueOf(comicInfoModel != null ? comicInfoModel.getPath() : null);
            ComicInfoModel comicInfoModel2 = this.j;
            if (comicInfoModel2 != null) {
                z = comicInfoModel2.isDir();
            }
            com.zentraedi.comic.util.e.b(defaultIcon, null, strValueOf, null, null, Boolean.valueOf(z), false, 64, null);
            y0Var.I.setVisibility(0);
            y0Var.N.setVisibility(8);
        }
    }

    private final void i0() {
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        if (!com.zentraedi.business.permission.a.d(activityE, com.zentraedi.business.permission.a.i)) {
            nd.a.e(this.a, "localImageDialog 没有权限");
            return;
        }
        SelectPhoneImageActivity.a aVar = SelectPhoneImageActivity.T;
        aVar.c(new k(activityE));
        Intrinsics.checkNotNull(activityE);
        aVar.b(activityE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.business.fileselect.s j0(x1 x1Var) {
        com.zentraedi.business.fileselect.s sVar = new com.zentraedi.business.fileselect.s();
        sVar.L0(x1Var.new l());
        return sVar;
    }

    private final void k0(ComicInfoModel comicInfoModel) {
        String string;
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        String path = comicInfoModel != null ? comicInfoModel.getPath() : null;
        com.zentraedi.business.n.a aVar = com.zentraedi.business.n.a;
        if (aVar.T(path)) {
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.r(comicInfoModel != null ? comicInfoModel.getPath() : null));
            sb.append("/.comicposter/");
            string = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.zentraedi.business.n.a.p(aVar, comicInfoModel != null ? comicInfoModel.getPath() : null, false, 2, (Object) null));
            sb2.append("/.comicposter/");
            string = sb2.toString();
        }
        s = string;
        com.zentraedi.comic.databinding.y0 y0Var = this.l;
        if (y0Var != null) {
            String string2 = StringsKt.trim(String.valueOf(y0Var.K.getText())).toString();
            if (TextUtils.isEmpty(string2)) {
                com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.is2));
                return;
            }
            if (y0Var.P.isSelected()) {
                if (TextUtils.isEmpty(this.q)) {
                    com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.SK));
                    return;
                } else {
                    I(this, this.q, false, 2, null);
                    return;
                }
            }
            if (y0Var.Q.isSelected()) {
                String string3 = y0Var.L.getTag() == null ? "" : y0Var.L.getTag().toString();
                if (TextUtils.isEmpty(string3)) {
                    com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.EJ));
                    return;
                } else {
                    I(this, string3, false, 2, null);
                    return;
                }
            }
            if (y0Var.O.isSelected()) {
                S(this, comicInfoModel, string2, "_", null, new Function0() { // from class: com.zentraedi.comic.business.w1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return x1.l0(this.a);
                    }
                }, 8, null);
            } else if (y0Var.X.isSelected()) {
                P(this, false, 1, null);
            } else {
                S(this, comicInfoModel, string2, null, null, new Function0() { // from class: com.zentraedi.comic.business.d1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return x1.m0(this.a);
                    }
                }, 8, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(x1 x1Var) {
        Function0<Unit> function0 = x1Var.m;
        if (function0 != null) {
            function0.invoke();
        }
        com.zentraedi.basic.function.ui.dialog.b bVar = x1Var.n;
        if (bVar != null) {
            bVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(x1 x1Var) {
        Function0<Unit> function0 = x1Var.m;
        if (function0 != null) {
            function0.invoke();
        }
        com.zentraedi.basic.function.ui.dialog.b bVar = x1Var.n;
        if (bVar != null) {
            bVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(String str) {
        com.zentraedi.comic.databinding.y0 y0Var = this.l;
        if (y0Var != null) {
            S(this, this.j, String.valueOf(y0Var.K.getText()), str, null, new Function0() { // from class: com.zentraedi.comic.business.m1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x1.o0(this.a);
                }
            }, 8, null);
        } else {
            ComicInfoModel comicInfoModel = this.j;
            S(this, comicInfoModel, comicInfoModel != null ? comicInfoModel.getName() : null, str, null, new Function0() { // from class: com.zentraedi.comic.business.o1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x1.p0(this.a);
                }
            }, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(x1 x1Var) {
        Function0<Unit> function0 = x1Var.m;
        if (function0 != null) {
            function0.invoke();
        }
        com.zentraedi.basic.function.ui.dialog.b bVar = x1Var.n;
        if (bVar != null) {
            bVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(x1 x1Var) {
        Function0<Unit> function0 = x1Var.m;
        if (function0 != null) {
            function0.invoke();
        }
        com.zentraedi.basic.function.ui.dialog.b bVar = x1Var.n;
        if (bVar != null) {
            bVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    private final void s0() {
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.comic.q.l.T2);
        bVar.b(com.zentraedi.comic.q.i.P6).setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x1.t0(bVar, view);
            }
        });
        bVar.d(80);
        bVar.setCanceledOnTouchOutside(true);
        bVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v0(x1 x1Var, View view, ComicInfoModel comicInfoModel, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        x1Var.u0(view, comicInfoModel, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(x1 x1Var, View view) {
        com.zentraedi.basic.function.ui.dialog.b bVar = x1Var.n;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(x1 x1Var, ComicInfoModel comicInfoModel, View view) {
        x1Var.k0(comicInfoModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(x1 x1Var, View view) {
        com.zentraedi.comic.databinding.y0 y0Var = x1Var.l;
        Intrinsics.checkNotNull(y0Var);
        y0Var.K.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(x1 x1Var, View view) {
        x1Var.s0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicShelfEditRequest] */
    public final void F(@fo.l String str, @fo.l Boolean bool, @fo.l Function1<? super Boolean, Unit> function1) {
        ?? comicShelfEditRequest = new ComicShelfEditRequest(str, Integer.valueOf(Intrinsics.areEqual(bool, Boolean.TRUE) ? 1 : 0));
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) comicShelfEditRequest, new b(function1, bool, comicShelfEditRequest));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicCreateRequest] */
    public final void L(@fo.l String str, @fo.l String str2, @fo.l String str3, @fo.k Function1<? super ComicInfoModel, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ?? comicCreateRequest = new ComicCreateRequest();
        comicCreateRequest.setDirId(str);
        comicCreateRequest.setName(l5.r(str2));
        comicCreateRequest.setPath(str2);
        if (str3 != null && str3.length() != 0) {
            comicCreateRequest.setCover(str3);
        }
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) comicCreateRequest, new c(callback));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicCreateRequest] */
    @fo.l
    public final ResponseData<ComicInfoModel> N(@fo.l String str, @fo.l String str2) {
        ?? comicCreateRequest = new ComicCreateRequest();
        comicCreateRequest.setDirId(str);
        comicCreateRequest.setName(l5.r(str2));
        comicCreateRequest.setPath(str2);
        return com.zentraedi.business.http.a.b().k((com.zentraedi.basic.component.http.i) comicCreateRequest, ComicInfoModel.class);
    }

    public final void O(boolean z) {
        String strH;
        if (TextUtils.isEmpty(this.o)) {
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.iH));
            return;
        }
        if (z) {
            String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.pM);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            com.zentraedi.basic.function.ui.dialog.b bVarC0 = C0(strN);
            this.g = bVarC0;
            if (bVarC0 != null) {
                bVarC0.show();
            }
        }
        if (v6.r(this.o) == 2) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strI = v6.i(this.o, "pub_album", true);
            Intrinsics.checkNotNullExpressionValue(strI, "getPathUrl(...)");
            strH = String.format(strI, Arrays.copyOf(new Object[]{NasSDKManager.getInstance().getAddr(), Uri.encode(this.o)}, 2));
            Intrinsics.checkNotNullExpressionValue(strH, "format(...)");
        } else {
            strH = v6.k(this.o, false).h();
        }
        nd.a.e(this.a, "downloadUrl url=" + strH);
        com.bumptech.glide.c.F(com.zentraedi.basic.function.utils.a.a()).D().z1(new com.bumptech.glide.load.model.h(strH, new com.bumptech.glide.load.model.k.a().b("Cookie", v6.d()).c())).t1(new d(z)).w0(100).G1();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicEditRequest] */
    public final void R(@fo.l ComicInfoModel comicInfoModel, @fo.l String str, @fo.l String str2, @fo.l Boolean bool, @fo.k Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.mK);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            com.zentraedi.basic.function.ui.dialog.b bVarC0 = C0(strN);
            this.g = bVarC0;
            if (bVarC0 != null) {
                bVarC0.show();
            }
        }
        ?? comicEditRequest = new ComicEditRequest(comicInfoModel != null ? comicInfoModel.getId() : null);
        comicEditRequest.setName(str);
        comicEditRequest.setCover(str2);
        if (Intrinsics.areEqual(comicInfoModel != null ? comicInfoModel.getMasked() : null, "2")) {
            comicEditRequest.setMasked(null);
        }
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) comicEditRequest, new f(str2, comicInfoModel, str, callback, bool));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicInfoRequest] */
    public final void T(@fo.l String str, @fo.l String str2, @fo.k Function2<? super Boolean, ? super ComicInfoModel, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ?? comicInfoRequest = new ComicInfoRequest();
        comicInfoRequest.setDirId(str);
        comicInfoRequest.setPath(str2);
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) comicInfoRequest, new g(callback));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicInfoRequest] */
    @fo.l
    public final ComicInfoModel U(@fo.l String str, @fo.l String str2) {
        ?? comicInfoRequest = new ComicInfoRequest();
        comicInfoRequest.setDirId(str);
        comicInfoRequest.setPath(str2);
        ResponseData responseDataK = com.zentraedi.business.http.a.b().k((com.zentraedi.basic.component.http.i) comicInfoRequest, ComicInfoModel.class);
        if (responseDataK.isSuccess() && responseDataK.getData() != null) {
            return (ComicInfoModel) responseDataK.getData();
        }
        ResponseData<ComicInfoModel> responseDataN = N(str, str2);
        if (responseDataN == null || !responseDataN.isSuccess()) {
            return null;
        }
        return responseDataN.getData();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicInfoRequest] */
    @fo.l
    public final ResponseData<ComicInfoModel> V(@fo.l String str, @fo.l String str2) {
        ?? comicInfoRequest = new ComicInfoRequest();
        comicInfoRequest.setDirId(str);
        comicInfoRequest.setPath(str2);
        return com.zentraedi.business.http.a.b().k((com.zentraedi.basic.component.http.i) comicInfoRequest, ComicInfoModel.class);
    }

    public final void W(@fo.k String dirId, @fo.k String path, @fo.k Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(dirId, "dirId");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FileListRequest fileListRequest = new FileListRequest();
        fileListRequest.setSortby("name");
        fileListRequest.setNormalOrder(FileListRequest.ORDER_BY_ASC);
        fileListRequest.setPath(path);
        fileListRequest.setNum(TBSOneErrorCodes.OTHER_BASE);
        fileListRequest.setStart(0);
        com.zentraedi.business.http.a.b().h(fileListRequest, new h(callback, dirId));
    }

    public final void q0(@fo.l ComicInfoModel comicInfoModel) {
        this.j = comicInfoModel;
    }

    public final void r0(@fo.l String str) {
        this.o = str;
    }

    public final void u0(@fo.k View rootView, @fo.l final ComicInfoModel comicInfoModel, @fo.l Function0<Unit> function0) {
        int i2;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        StringBuilder sb = new StringBuilder();
        sb.append("comicInfoModel = ");
        sb.append(comicInfoModel != null ? comicInfoModel.toJsonStr() : null);
        nd.a.e("showEditComicDialog", sb.toString());
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        this.l = (com.zentraedi.comic.databinding.y0) androidx.databinding.m.j(LayoutInflater.from(com.zentraedi.basic.function.utils.a.h().e()), com.zentraedi.comic.q.l.O3, (ViewGroup) null, false);
        com.zentraedi.comic.databinding.y0 y0Var = this.l;
        Intrinsics.checkNotNull(y0Var);
        this.n = new com.zentraedi.basic.function.ui.dialog.b(activityE, y0Var.getRoot());
        com.zentraedi.comic.databinding.y0 y0Var2 = this.l;
        Intrinsics.checkNotNull(y0Var2);
        y0Var2.F.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x1.w0(this.a, view);
            }
        });
        com.zentraedi.comic.databinding.y0 y0Var3 = this.l;
        Intrinsics.checkNotNull(y0Var3);
        y0Var3.G.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x1.x0(this.a, comicInfoModel, view);
            }
        });
        this.j = comicInfoModel;
        this.m = function0;
        com.zentraedi.comic.databinding.y0 y0Var4 = this.l;
        Intrinsics.checkNotNull(y0Var4);
        y0Var4.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x1.y0(this.a, view);
            }
        });
        com.zentraedi.comic.databinding.y0 y0Var5 = this.l;
        Intrinsics.checkNotNull(y0Var5);
        y0Var5.M.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x1.z0(this.a, view);
            }
        });
        com.zentraedi.comic.databinding.y0 y0Var6 = this.l;
        Intrinsics.checkNotNull(y0Var6);
        y0Var6.K.setText(comicInfoModel != null ? comicInfoModel.getName() : null);
        com.zentraedi.comic.databinding.y0 y0Var7 = this.l;
        Intrinsics.checkNotNull(y0Var7);
        BaseEditText baseEditText = y0Var7.K;
        com.zentraedi.comic.databinding.y0 y0Var8 = this.l;
        Intrinsics.checkNotNull(y0Var8);
        baseEditText.setSelection(y0Var8.K.length());
        ComicInfoModel comicInfoModel2 = this.j;
        if (TextUtils.isEmpty(comicInfoModel2 != null ? comicInfoModel2.getCover() : null)) {
            i2 = this.c;
        } else {
            com.zentraedi.comic.databinding.y0 y0Var9 = this.l;
            Intrinsics.checkNotNull(y0Var9);
            ImageView image = y0Var9.N;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            ComicInfoModel comicInfoModel3 = this.j;
            String cover = comicInfoModel3 != null ? comicInfoModel3.getCover() : null;
            ComicInfoModel comicInfoModel4 = this.j;
            com.zentraedi.comic.util.e.b(image, cover, String.valueOf(comicInfoModel4 != null ? comicInfoModel4.getPath() : null), null, null, null, false, 120, null);
            com.zentraedi.comic.databinding.y0 y0Var10 = this.l;
            Intrinsics.checkNotNull(y0Var10);
            y0Var10.N.setVisibility(0);
            com.zentraedi.comic.databinding.y0 y0Var11 = this.l;
            Intrinsics.checkNotNull(y0Var11);
            y0Var11.I.setVisibility(8);
            i2 = this.b;
        }
        com.zentraedi.comic.databinding.y0 y0Var12 = this.l;
        Intrinsics.checkNotNull(y0Var12);
        F0(i2, y0Var12);
        com.zentraedi.comic.databinding.y0 y0Var13 = this.l;
        Intrinsics.checkNotNull(y0Var13);
        Z(y0Var13);
        com.zentraedi.basic.function.ui.dialog.b bVar = this.n;
        if (bVar != null) {
            bVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.zentraedi.comic.business.r1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    x1.A0(this.a, dialogInterface);
                }
            });
        }
        com.zentraedi.basic.function.ui.dialog.b bVar2 = this.n;
        if (bVar2 != null) {
            bVar2.d(80);
        }
        com.zentraedi.basic.function.ui.dialog.b bVar3 = this.n;
        if (bVar3 != null) {
            bVar3.show();
        }
    }
}
