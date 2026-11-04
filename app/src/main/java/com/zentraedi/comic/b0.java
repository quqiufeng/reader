package com.zentraedi.comic;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import androidx.lifecycle.p0;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.R;
import com.zentraedi.business.event.CloseComicReaderEvent;
import com.zentraedi.business.model.CompressionBrowserResponse;
import com.zentraedi.business.request.CompressionDownloadRequest;
import com.zentraedi.business.utils.d5;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.l5;
import com.zentraedi.business.utils.n4;
import com.zentraedi.comic.event.ComicFolderThumbUpdateEvent;
import com.zentraedi.photo.model.AlbumAllTagModel;
import java.io.File;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.k2;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nZipFileDownLoad.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileDownLoad.kt\ncom/zentraedi/comic/ZipFileDownLoad\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,294:1\n1#2:295\n*E\n"})
public final class b0 {

    @fo.k
    public static final b0 a;

    @fo.l
    private static CompressionBrowserResponse b;

    @fo.k
    private static final Lazy c;

    @fo.k
    private static final Map<String, d1<Pair<String, String>>> d;

    @fo.k
    private static final Map<String, k2> e;

    @DebugMetadata(c = "com.zentraedi.comic.ZipFileDownLoad$createTaskForFile$1", f = "ZipFileDownLoad.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation<? super a> continuation) {
            super(1, continuation);
            this.b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            b0.a.z(this.b);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class b implements e1, FunctionAdapter {
        private final /* synthetic */ Function1 a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        public final boolean equals(@fo.l Object obj) {
            if ((obj instanceof e1) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @fo.k
        public final Function<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class c implements n4.j {
        c() {
        }

        public void confirmClick() {
            org.greenrobot.eventbus.c.f().q(new CloseComicReaderEvent());
        }
    }

    public static final class d extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ String a;

        public static final class a implements com.zentraedi.business.manager.f {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public void onError(int i, String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                nd.a.c("ZipFileDownLoad", "download onError code=" + i + " msg=" + msg + " filePath=" + this.a);
            }

            public void onProgress(String path, long j, long j2) {
                String path2;
                Intrinsics.checkNotNullParameter(path, "path");
                if (3 == i5.a.f(path)) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(m.z());
                b0 b0Var = b0.a;
                CompressionBrowserResponse compressionBrowserResponseT = b0Var.t();
                if (compressionBrowserResponseT == null || (path2 = compressionBrowserResponseT.getPath()) == null) {
                    path2 = "";
                }
                sb.append(l5.y(m.k(path2)));
                sb.append(File.separator);
                double d = (j / j2) * ((double) 100);
                String strRemovePrefix = StringsKt.removePrefix(path, sb.toString());
                nd.a.a("ZipFileDownLoad", "download onProgress path=" + path + " key=" + strRemovePrefix + " current=" + j + " total=" + j2 + " progress=" + b0Var.v(d));
                b0Var.o(this.a, b0Var.v(d), path);
                if (strRemovePrefix.length() <= 0 || Intrinsics.areEqual(strRemovePrefix, this.a)) {
                    return;
                }
                b0Var.o(strRemovePrefix, b0Var.v(d), path);
            }

            public void onStart() {
                nd.a.e("ZipFileDownLoad", "download onStart filePath=" + this.a + " downPath=" + this.b);
            }

            public void onSuccess(String path, boolean z) {
                String path2;
                Intrinsics.checkNotNullParameter(path, "path");
                StringBuilder sb = new StringBuilder();
                sb.append(m.z());
                b0 b0Var = b0.a;
                CompressionBrowserResponse compressionBrowserResponseT = b0Var.t();
                if (compressionBrowserResponseT == null || (path2 = compressionBrowserResponseT.getPath()) == null) {
                    path2 = "";
                }
                sb.append(l5.y(m.k(path2)));
                sb.append(File.separator);
                String string = sb.toString();
                String strRemovePrefix = StringsKt.removePrefix(path, string);
                nd.a.e("ZipFileDownLoad", "download onSuccess path=" + path + " isDownloaded=" + z + " key=" + StringsKt.removePrefix(path, string));
                b0Var.o(this.a, AlbumAllTagModel.b.Hg, path);
                if (strRemovePrefix.length() <= 0 || Intrinsics.areEqual(strRemovePrefix, this.a)) {
                    return;
                }
                b0Var.o(strRemovePrefix, AlbumAllTagModel.b.Hg, path);
            }
        }

        d(String str) {
            this.a = str;
        }

        public boolean automaticResolution() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onCallResponse(Response<ResponseBody> response) {
            String path;
            ResponseBody responseBody;
            ResponseBody responseBody2;
            super/*com.zentraedi.basic.component.http.k*/.onCallResponse(response);
            StringBuilder sb = new StringBuilder();
            sb.append("startDownload onCallResponse filePath=");
            sb.append(this.a);
            sb.append(" code=");
            Long lValueOf = null;
            sb.append(response != null ? Integer.valueOf(response.code()) : null);
            sb.append(" message=");
            sb.append(response != null ? response.message() : null);
            sb.append(" hasBody=");
            sb.append((response != null ? (ResponseBody) response.body() : null) != null);
            sb.append(" contentLength=");
            if (response != null && (responseBody2 = (ResponseBody) response.body()) != null) {
                lValueOf = Long.valueOf(responseBody2.contentLength());
            }
            sb.append(lValueOf);
            nd.a.e("ZipFileDownLoad", sb.toString());
            long jContentLength = (response == null || (responseBody = (ResponseBody) response.body()) == null) ? 0L : responseBody.contentLength();
            if (jContentLength < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                nd.a.c("ZipFileDownLoad", "startDownload response too small filePath=" + this.a + " contentLength=" + jContentLength);
                b0.a.y();
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m.z());
            CompressionBrowserResponse compressionBrowserResponseT = b0.a.t();
            if (compressionBrowserResponseT == null || (path = compressionBrowserResponseT.getPath()) == null) {
                path = "";
            }
            sb2.append(l5.y(m.k(path)));
            sb2.append(File.separator);
            sb2.append(this.a);
            String string = sb2.toString();
            nd.a.a("ZipFileDownLoad", "startDownload downPath=" + string);
            File file = new File(d5.a.m(string));
            if (!file.exists()) {
                nd.a.a("ZipFileDownLoad", "startDownload mkdirs parent=" + file.getAbsolutePath());
                file.mkdirs();
            }
            if (response != null) {
                com.zentraedi.business.manager.e.e(new com.zentraedi.business.manager.e(), response, string, new a(this.a, string), false, 8, (Object) null);
            }
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            nd.a.a("ZipFileDownLoad", "startDownload onResult filePath=" + this.a + " resp=" + resp);
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.x(R.string.pv4);
        }
    }

    static {
        b0 b0Var = new b0();
        a = b0Var;
        c = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b0.j();
            }
        });
        d = new LinkedHashMap();
        e = new LinkedHashMap();
        b0Var.u().h().l(new b(new Function1() { // from class: com.zentraedi.comic.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.d((Pair) obj);
            }
        }));
    }

    private b0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Pair pair) {
        if (!((Boolean) pair.getSecond()).booleanValue()) {
            return Unit.INSTANCE;
        }
        e.remove(pair.getFirst());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h j() {
        return new h(5);
    }

    public static /* synthetic */ void m(b0 b0Var, String str, Function1 function1, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        b0Var.l(str, function1, i);
    }

    private final Function1<Continuation<? super Unit>, Object> n(String str) {
        return new a(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(String str, String str2, String str3) {
        d1<Pair<String, String>> d1Var = d.get(str);
        if (d1Var != null) {
            d1Var.o(new Pair(str2, str3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(String str, String str2, Pair pair) {
        nd.a.a("downloadZipThumb", "observe progress=" + ((String) pair.getFirst()) + " path=" + ((String) pair.getSecond()) + " zipPath=" + str + " imagePath=" + str2);
        if (!Intrinsics.areEqual(pair.getFirst(), AlbumAllTagModel.b.Hg)) {
            return Unit.INSTANCE;
        }
        if (new File((String) pair.getSecond()).exists()) {
            m.E((String) pair.getSecond(), str);
        }
        a.h(str2);
        org.greenrobot.eventbus.c.f().q(new ComicFolderThumbUpdateEvent(str));
        nd.a.e("downloadZipThumb", "checkDownloadThumb success zipPath=" + str + " imagePath=" + str2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void s(b0 b0Var, String str, Function1 function1, int i, d1 d1Var, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        b0Var.r(str, function1, i, d1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        n4 n4VarA = n4.c.a();
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
        String strN = com.zentraedi.basic.function.utils.a.n(q.C0124q.Ps2);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        String strN2 = com.zentraedi.basic.function.utils.a.n(q.C0124q.qJ);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        String strN3 = com.zentraedi.basic.function.utils.a.n(q.C0124q.cz);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        n4VarA.Z1(activityE, strN, strN2, strN3, false, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(String str) {
        String path;
        String pwd;
        String pwd2;
        String charset;
        CompressionBrowserResponse compressionBrowserResponse = b;
        String str2 = "";
        if (compressionBrowserResponse == null || (path = compressionBrowserResponse.getPath()) == null) {
            path = "";
        }
        CompressionBrowserResponse compressionBrowserResponse2 = b;
        if (compressionBrowserResponse2 == null || (pwd = compressionBrowserResponse2.getPwd()) == null) {
            pwd = "";
        }
        CompressionBrowserResponse compressionBrowserResponse3 = b;
        if (compressionBrowserResponse3 != null && (charset = compressionBrowserResponse3.getCharset()) != null) {
            str2 = charset;
        }
        CompressionDownloadRequest compressionDownloadRequest = new CompressionDownloadRequest(path, str, pwd, str2);
        StringBuilder sb = new StringBuilder();
        sb.append("startDownload begin filePath=");
        sb.append(str);
        sb.append(" zipPath=");
        CompressionBrowserResponse compressionBrowserResponse4 = b;
        sb.append(compressionBrowserResponse4 != null ? compressionBrowserResponse4.getPath() : null);
        sb.append(" charset=");
        CompressionBrowserResponse compressionBrowserResponse5 = b;
        sb.append(compressionBrowserResponse5 != null ? compressionBrowserResponse5.getCharset() : null);
        sb.append(" pwdLen=");
        CompressionBrowserResponse compressionBrowserResponse6 = b;
        sb.append((compressionBrowserResponse6 == null || (pwd2 = compressionBrowserResponse6.getPwd()) == null) ? 0 : pwd2.length());
        sb.append(" request=");
        sb.append(CompressionDownloadRequest.class.getSimpleName());
        nd.a.e("ZipFileDownLoad", sb.toString());
        com.zentraedi.business.http.a.b().h(compressionDownloadRequest, new d(str));
    }

    public final void h(@fo.k String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        k2 k2Var = e.get(key);
        if (k2Var != null) {
            a.u().c(k2Var);
        }
        d.remove(key);
    }

    public final void i() {
        e.clear();
        u().d();
        d.clear();
    }

    @fo.k
    public final Function1<Continuation<? super Unit>, Object> k(@fo.k String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return n(filePath);
    }

    public final void l(@fo.k String key, @fo.k Function1<? super Continuation<? super Unit>, ? extends Object> task, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(task, "task");
    }

    public final void p(@fo.k Context context, @fo.k final String zipPath, @fo.k final String imagePath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        d1<Pair<String, String>> d1Var = new d1<>();
        Function1<Continuation<? super Unit>, Object> function1K = k(imagePath);
        nd.a.e("downloadZipThumb", "enqueue zipPath=" + zipPath + " imagePath=" + imagePath);
        r(imagePath, function1K, 0, d1Var);
        d1Var.k((p0) context, new b(new Function1() { // from class: com.zentraedi.comic.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.q(zipPath, imagePath, (Pair) obj);
            }
        }));
    }

    public final void r(@fo.k String key, @fo.k Function1<? super Continuation<? super Unit>, ? extends Object> task, int i, @fo.k d1<Pair<String, String>> liveData) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        e.put(key, u().e(key, task, i));
        d.put(key, liveData);
    }

    @fo.l
    public final CompressionBrowserResponse t() {
        return b;
    }

    @fo.k
    public final h u() {
        return (h) c.getValue();
    }

    @fo.k
    public final String v(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
        String str = decimalFormat.format(d2);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @fo.k
    public final Map<String, d1<Pair<String, String>>> w() {
        return d;
    }

    public final void x(@fo.l CompressionBrowserResponse compressionBrowserResponse) {
        b = compressionBrowserResponse;
    }
}
