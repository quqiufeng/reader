package com.zentraedi.comic;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import com.artifex.mupdf.fitz.ColorSpace;
import com.artifex.mupdf.fitz.Document;
import com.artifex.mupdf.fitz.Outline;
import com.artifex.mupdf.fitz.Page;
import com.artifex.mupdf.fitz.Pixmap;
import com.artifex.mupdf.fitz.android.AndroidDrawDevice;
import com.zentraedi.business.model.CompressionBrowserResponse;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.task.TaskFileData;
import com.zentraedi.business.utils.d5;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.l5;
import com.zentraedi.business.utils.t7;
import com.zentraedi.business.utils.v7;
import com.zentraedi.comic.activity.ComicSubDirActivity;
import com.zentraedi.comic.data.FileListItemModel;
import com.zentraedi.comic.viewmodel.l6;
import com.zentraedi.outreader.local.LocalReaderManager;
import com.zentraedi.photo.model.AlbumAllTagModel;
import com.zspace.mobi.MobiException;
import com.zspace.mobi.MobiUtilBusiness;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Function;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.u2;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nFileOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileOperations.kt\ncom/zentraedi/comic/FileOperationsKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,490:1\n47#2,4:491\n1#3:495\n*S KotlinDebug\n*F\n+ 1 FileOperations.kt\ncom/zentraedi/comic/FileOperationsKt\n*L\n261#1:491,4\n*E\n"})
public final class m {
    static final /* synthetic */ KProperty<Object>[] a = {Reflection.mutableProperty0(new MutablePropertyReference0Impl(m.class, "fileListDisplayMode", "getFileListDisplayMode()I", 1))};

    @fo.k
    private static final String b = "sp_key_file_display_mode";

    @fo.k
    private static final v7 c = new v7(b, Integer.valueOf(FileListItemModel.LAYOUT_MODE_LIST_DETAIL));

    @fo.k
    private static String d;

    @fo.k
    private static String e;

    @DebugMetadata(c = "com.zentraedi.comic.FileOperationsKt$downloadAndProcessFile$2", f = "FileOperations.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ String c;
        final /* synthetic */ Function0<Unit> d;
        final /* synthetic */ Function1<String, Unit> e;
        final /* synthetic */ Function1<String, Unit> f;

        /* JADX INFO: renamed from: com.zentraedi.comic.m$a$a, reason: collision with other inner class name */
        @DebugMetadata(c = "com.zentraedi.comic.FileOperationsKt$downloadAndProcessFile$2$1", f = "FileOperations.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class C0123a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ d1<Pair<String, String>> b;
            final /* synthetic */ String c;
            final /* synthetic */ Function1<String, Unit> d;
            final /* synthetic */ Ref.ObjectRef<k2> e;
            final /* synthetic */ Function1<String, Unit> f;
            final /* synthetic */ Function0<Unit> g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0123a(d1<Pair<String, String>> d1Var, String str, Function1<? super String, Unit> function1, Ref.ObjectRef<k2> objectRef, Function1<? super String, Unit> function2, Function0<Unit> function0, Continuation<? super C0123a> continuation) {
                super(2, continuation);
                this.b = d1Var;
                this.c = str;
                this.d = function1;
                this.e = objectRef;
                this.f = function2;
                this.g = function0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(String str, Function1 function1, Ref.ObjectRef objectRef, Function1 function2, Function0 function0, Pair pair) {
                String str2 = (String) pair.component1();
                String str3 = (String) pair.component2();
                nd.a.a("analysisEpub", "downloadAndProcessFile observe progress=" + str2 + " path=" + str3 + " fileUrl=" + str);
                function1.invoke(str2);
                if (Intrinsics.areEqual(str2, AlbumAllTagModel.b.Hg)) {
                    k2 k2Var = (k2) objectRef.element;
                    if (k2Var != null) {
                        k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
                    }
                    nd.a.e("analysisEpub", "downloadAndProcessFile completed path=" + str3 + " fileUrl=" + str);
                    m.D(str3, null, function2, function0);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0123a(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                d1<Pair<String, String>> d1Var = this.b;
                final String str = this.c;
                final Function1<String, Unit> function1 = this.d;
                final Ref.ObjectRef<k2> objectRef = this.e;
                final Function1<String, Unit> function2 = this.f;
                final Function0<Unit> function0 = this.g;
                d1Var.l(new g(new Function1() { // from class: com.zentraedi.comic.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return m.a.C0123a.e(str, function1, objectRef, function2, function0, (Pair) obj2);
                    }
                }));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((C0123a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, Function0<Unit> function0, Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = function0;
            this.e = function1;
            this.f = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.c, this.d, this.e, this.f, continuation);
            aVar.b = obj;
            return aVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T, kotlinx.coroutines.k2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            q0 q0Var = (q0) this.b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.c.length() == 0) {
                nd.a.c("analysisEpub", "downloadAndProcessFile fileUrl empty");
                this.d.invoke();
                return Unit.INSTANCE;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("downloadAndProcessFile begin fileUrl=");
            sb.append(this.c);
            sb.append(" zipPath=");
            b0 b0Var = b0.a;
            CompressionBrowserResponse compressionBrowserResponseT = b0Var.t();
            sb.append(compressionBrowserResponseT != null ? compressionBrowserResponseT.getPath() : null);
            sb.append(" targetBase=");
            sb.append(m.z());
            nd.a.e("analysisEpub", sb.toString());
            Function1<Continuation<? super Unit>, Object> function1K = b0Var.k(this.c);
            d1<Pair<String, String>> d1Var = new d1<>();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = kotlinx.coroutines.i.e(q0Var, (CoroutineContext) null, (CoroutineStart) null, new C0123a(d1Var, this.c, this.e, objectRef, this.f, this.d, null), 3, (Object) null);
            nd.a.a("analysisEpub", "downloadAndProcessFile enqueue fileUrl=" + this.c);
            b0Var.r(this.c, function1K, 0, d1Var);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.FileOperationsKt$handleOtherTypes$2", f = "FileOperations.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class b extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ FileInfoModel b;
        final /* synthetic */ Function1<String, Unit> c;
        final /* synthetic */ Function0<Unit> d;
        final /* synthetic */ Activity e;
        final /* synthetic */ Function1<String, Unit> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(FileInfoModel fileInfoModel, Function1<? super String, Unit> function1, Function0<Unit> function0, Activity activity, Function1<? super String, Unit> function2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = fileInfoModel;
            this.c = function1;
            this.d = function0;
            this.e = activity;
            this.f = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(FileInfoModel fileInfoModel, String str, Function0 function0, Function1 function1) {
            String localPath = fileInfoModel.getLocalPath();
            if (localPath == null || localPath.length() == 0) {
                nd.a.c("analysisEpub", "handleOtherTypes download success but localPath empty fileId=" + fileInfoModel.getFileId() + " path=" + str);
                function0.invoke();
            } else {
                nd.a.a("analysisEpub", "handleOtherTypes download success localPath=" + fileInfoModel.getLocalPath() + " then process");
                String localPath2 = fileInfoModel.getLocalPath();
                if (localPath2 == null) {
                    localPath2 = "";
                }
                m.D(localPath2, fileInfoModel.getPath(), function1, function0);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final String path = this.b.getPath();
            if (path == null) {
                path = "";
            }
            boolean zExists = new File(path).exists();
            nd.a.e("analysisEpub", "handleOtherTypes path=" + path + " name=" + this.b.getName() + " exists=" + zExists + " localPath=" + this.b.getLocalPath() + " fileId=" + this.b.getFileId());
            if (zExists) {
                nd.a.c("analysisEpub", "epub open fileExists");
                m.D(path, this.b.getPath(), this.c, this.d);
            } else {
                nd.a.a("analysisEpub", "handleOtherTypes start download fileId=" + this.b.getFileId() + " filePath=" + path);
                com.zentraedi.comic.delegate.t tVar = com.zentraedi.comic.delegate.t.a;
                final FileInfoModel fileInfoModel = this.b;
                Activity activity = this.e;
                final Function0<Unit> function0 = this.d;
                final Function1<String, Unit> function1 = this.c;
                tVar.g(fileInfoModel, activity, new Function0() { // from class: com.zentraedi.comic.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.b.e(fileInfoModel, path, function0, function1);
                    }
                }, this.d, this.f);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.FileOperationsKt$handleZipType$2", f = "FileOperations.kt", i = {0, 0}, l = {221}, m = "invokeSuspend", n = {"basePath", "localFile"}, s = {"L$0", "L$1"}, v = 1)
    static final class c extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        Object a;
        Object b;
        int c;
        final /* synthetic */ FileInfoModel d;
        final /* synthetic */ Function1<String, Unit> e;
        final /* synthetic */ Function0<Unit> f;
        final /* synthetic */ Function1<String, Unit> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(FileInfoModel fileInfoModel, Function1<? super String, Unit> function1, Function0<Unit> function0, Function1<? super String, Unit> function2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.d = fileInfoModel;
            this.e = function1;
            this.f = function0;
            this.g = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String path;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StringBuilder sb = new StringBuilder();
                sb.append(m.z());
                String str = File.separator;
                sb.append(str);
                b0 b0Var = b0.a;
                CompressionBrowserResponse compressionBrowserResponseT = b0Var.t();
                if (compressionBrowserResponseT == null || (path = compressionBrowserResponseT.getPath()) == null) {
                    path = "";
                }
                sb.append(l5.y(m.x(path)));
                sb.append(str);
                String string = sb.toString();
                this.d.setLocalPath(string + this.d.getName());
                String localPath = this.d.getLocalPath();
                Intrinsics.checkNotNull(localPath);
                File file = new File(localPath);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("handleZipType path=");
                sb2.append(this.d.getPath());
                sb2.append(" name=");
                sb2.append(this.d.getName());
                sb2.append(" basePath=");
                sb2.append(string);
                sb2.append(" localPath=");
                sb2.append(this.d.getLocalPath());
                sb2.append(" exists=");
                sb2.append(file.exists());
                sb2.append(" zipPath=");
                CompressionBrowserResponse compressionBrowserResponseT2 = b0Var.t();
                sb2.append(compressionBrowserResponseT2 != null ? compressionBrowserResponseT2.getPath() : null);
                nd.a.e("analysisEpub", sb2.toString());
                if (file.exists()) {
                    nd.a.a("analysisEpub", "handleZipType use cached file localPath=" + this.d.getLocalPath());
                    String localPath2 = this.d.getLocalPath();
                    Intrinsics.checkNotNull(localPath2);
                    m.D(localPath2, this.d.getPath(), this.e, this.f);
                } else {
                    nd.a.a("analysisEpub", "handleZipType start download fileUrl=" + this.d.getPath());
                    String path2 = this.d.getPath();
                    String str2 = path2 != null ? path2 : "";
                    Function1<String, Unit> function1 = this.e;
                    Function0<Unit> function0 = this.f;
                    Function1<String, Unit> function2 = this.g;
                    this.a = SpillingKt.nullOutSpilledVariable(string);
                    this.b = SpillingKt.nullOutSpilledVariable(file);
                    this.c = 1;
                    if (m.l(str2, function1, function0, function2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class d implements com.zentraedi.basic.component.easythread.b<String> {
        final /* synthetic */ Function0<Unit> a;
        final /* synthetic */ Function0<Unit> b;

        d(Function0<Unit> function0, Function0<Unit> function1) {
            this.a = function0;
            this.b = function1;
        }

        @Override // com.zentraedi.basic.component.easythread.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            this.a.invoke();
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.invoke();
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FileOperations.kt\ncom/zentraedi/comic/FileOperationsKt\n*L\n1#1,49:1\n261#2:50\n*E\n"})
    public static final class e extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public e(CoroutineExceptionHandler.b bVar) {
            super(bVar);
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.FileOperationsKt$processExistingFile$2", f = "FileOperations.kt", i = {0}, l = {264}, m = "invokeSuspend", n = {"epubPath"}, s = {"L$0"}, v = 1)
    static final class f extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        Object a;
        int b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ Function0<Unit> e;
        final /* synthetic */ Function1<String, Unit> f;

        @DebugMetadata(c = "com.zentraedi.comic.FileOperationsKt$processExistingFile$2$1", f = "FileOperations.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ Function0<Unit> d;
            final /* synthetic */ Function1<String, Unit> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = str;
                this.c = str2;
                this.d = function0;
                this.e = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String str = this.b;
                if (str == null || str.length() == 0) {
                    MobiException.Companion.toastError();
                    nd.a.c("analysisEpub", "processExistingFile convertToEpub failed filePath=" + this.c);
                    this.d.invoke();
                } else {
                    nd.a.c("analysisEpub", "epub processExistingFile success");
                    this.e.invoke(this.b);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = str2;
            this.e = function0;
            this.f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MobiUtilBusiness mobiUtilBusiness = MobiUtilBusiness.INSTANCE;
                String strConvertToEpub = mobiUtilBusiness.convertToEpub(this.c, mobiUtilBusiness.getComicConvertDirPath(), this.d);
                nd.a.a("analysisEpub", "processExistingFile convertToEpub async filePath=" + this.c + " epubPath=" + strConvertToEpub);
                u2 u2VarE = g1.e();
                a aVar = new a(strConvertToEpub, this.c, this.e, this.f, null);
                this.a = SpillingKt.nullOutSpilledVariable(strConvertToEpub);
                this.b = 1;
                if (kotlinx.coroutines.i.h(u2VarE, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((f) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class g implements e1, FunctionAdapter {
        private final /* synthetic */ Function1 a;

        g(Function1 function) {
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

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(l5.A());
        sb.append(com.zentraedi.basic.function.utils.a.h().y() ? "/UnifyDrive/download/comic/" : com.zentraedi.basic.function.utils.a.n(q.C0124q.gt4));
        d = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.zentraedi.basic.function.utils.a.a().getFilesDir().getAbsolutePath());
        sb2.append(com.zentraedi.basic.function.utils.a.h().y() ? "/UnifyDrive/download/comic/" : com.zentraedi.basic.function.utils.a.n(q.C0124q.gt4));
        e = sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object A(FileInfoModel fileInfoModel, Function1<? super String, Unit> function1, Function0<Unit> function0, Function1<? super String, Unit> function2, Activity activity, Continuation<? super Unit> continuation) {
        Object objH = kotlinx.coroutines.i.h(g1.c(), new b(fileInfoModel, function1, function0, activity, function2, null), continuation);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object B(FileInfoModel fileInfoModel, Function1<? super String, Unit> function1, Function0<Unit> function0, Function1<? super String, Unit> function2, Activity activity, Continuation<? super Unit> continuation) {
        Object objH = kotlinx.coroutines.i.h(g1.c(), new c(fileInfoModel, function1, function0, function2, null), continuation);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : Unit.INSTANCE;
    }

    public static final void C(@fo.k AppCompatActivity context, @fo.k FileInfoModel fileInfoModel, @fo.k Function0<Unit> success, @fo.k Function0<Unit> failed) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileInfoModel, "fileInfoModel");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failed, "failed");
        LocalReaderManager.f.b().A(context, fileInfoModel, new d(success, failed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(String str, String str2, Function1<? super String, Unit> function1, Function0<Unit> function0) {
        StringBuilder sb = new StringBuilder();
        sb.append("processExistingFile begin filePath=");
        sb.append(str);
        sb.append(" nasFilePath=");
        sb.append(str2);
        sb.append(" isMobi=");
        MobiUtilBusiness mobiUtilBusiness = MobiUtilBusiness.INSTANCE;
        sb.append(mobiUtilBusiness.isMobi(str));
        nd.a.e("analysisEpub", sb.toString());
        if (!mobiUtilBusiness.isMobi(str)) {
            nd.a.a("analysisEpub", "processExistingFile direct success filePath=" + str);
            function1.invoke(str);
            return;
        }
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            kotlinx.coroutines.i.e(r0.a(g1.c().plus(new e(CoroutineExceptionHandler.F2))), (CoroutineContext) null, (CoroutineStart) null, new f(str, str2, function0, function1, null), 3, (Object) null);
            return;
        }
        String strConvertToEpub = mobiUtilBusiness.convertToEpub(str, mobiUtilBusiness.getComicConvertDirPath(), str2);
        nd.a.a("analysisEpub", "processExistingFile convertToEpub sync filePath=" + str + " epubPath=" + strConvertToEpub);
        if (strConvertToEpub != null && strConvertToEpub.length() != 0) {
            nd.a.c("analysisEpub", "epub processExistingFile success");
            function1.invoke(strConvertToEpub);
            return;
        }
        MobiException.Companion.toastError();
        nd.a.c("analysisEpub", "processExistingFile convertToEpub failed filePath=" + str);
        function0.invoke();
    }

    public static final void E(@fo.k String loadPath, @fo.k String imagePath) {
        Intrinsics.checkNotNullParameter(loadPath, "loadPath");
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        try {
            File file = new File(y(imagePath));
            if (file.exists()) {
                return;
            }
            new File(d5.a.m(y(imagePath))).mkdirs();
            l5.d(Uri.fromFile(new File(loadPath)), file, new Runnable() { // from class: com.zentraedi.comic.i
                @Override // java.lang.Runnable
                public final void run() {
                    m.F();
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0070 -> B:41:0x0097). Please report as a decompilation issue!!! */
    public static final void G(@fo.k Document document, @fo.k String desPath, int i) throws Throwable {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(desPath, "desPath");
        ?? r2 = 0;
        r2 = 0;
        r2 = 0;
        FileOutputStream fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        r2 = 0;
        try {
            try {
                try {
                    File file = new File(desPath);
                    if (!file.exists()) {
                        new File(d5.a.m(desPath)).mkdirs();
                        if (document.countPages() >= 0) {
                            Page pageLoadPage = document.loadPage(0);
                            Pixmap pixmap = pageLoadPage.toPixmap(AndroidDrawDevice.fitPageWidth(pageLoadPage, i), ColorSpace.DeviceBGR, true, true);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pixmap.getPixels(), pixmap.getWidth(), pixmap.getHeight(), Bitmap.Config.ARGB_8888);
                            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                            FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                            try {
                                r2 = 90;
                                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream3);
                                fileOutputStream3.flush();
                                fileOutputStream3.close();
                                fileOutputStream3.close();
                            } catch (Exception e2) {
                                e = e2;
                                fileOutputStream = fileOutputStream3;
                                e.printStackTrace();
                                r2 = fileOutputStream;
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                    r2 = fileOutputStream;
                                }
                            } catch (OutOfMemoryError e3) {
                                e = e3;
                                fileOutputStream2 = fileOutputStream3;
                                e.printStackTrace();
                                r2 = fileOutputStream2;
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                    r2 = fileOutputStream2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r2 = fileOutputStream3;
                                if (r2 != 0) {
                                    try {
                                        r2.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                        nd.a.c("MuPDFUtil", "close stream error");
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e5) {
                e = e5;
            } catch (OutOfMemoryError e6) {
                e = e6;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
            nd.a.c("MuPDFUtil", "close stream error");
            r2 = r2;
        }
    }

    public static final void H(int i) {
        c.setValue((Object) null, a[0], Integer.valueOf(i));
    }

    public static final void I(@fo.k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        d = str;
    }

    public static final void J(@fo.k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        e = str;
    }

    @fo.l
    public static final Object g(@fo.l FileInfoModel fileInfoModel, int i, @fo.k Function1<? super String, Unit> function1, @fo.k Function0<Unit> function0, @fo.k Function1<? super String, Unit> function2, @fo.k Function1<? super String, Unit> function3, @fo.k Activity activity, @fo.k Continuation<? super Unit> continuation) {
        if (fileInfoModel == null) {
            nd.a.c("analysisEpub", "analysisEpub fileInfoModel is null from=" + i);
            function0.invoke();
            return Unit.INSTANCE;
        }
        nd.a.e("analysisEpub", "analysisEpub start from=" + i + " path=" + fileInfoModel.getPath() + " name=" + fileInfoModel.getName() + " localPath=" + fileInfoModel.getLocalPath() + " fileId=" + fileInfoModel.getFileId());
        if (i == 10) {
            Object objB = B(fileInfoModel, function1, function0, function3, activity, continuation);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Unit.INSTANCE;
        }
        Object objA = A(fileInfoModel, function1, function0, function2, activity, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    public static final void h(@fo.l final FileInfoModel fileInfoModel, int i, @fo.k final Function1<? super String, Unit> success, @fo.k Function0<Unit> failed, @fo.k Function1<? super String, Unit> startProcess, @fo.k final Function1<? super String, Unit> downloadProgress, @fo.k Activity activity) {
        String path;
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failed, "failed");
        Intrinsics.checkNotNullParameter(startProcess, "startProcess");
        Intrinsics.checkNotNullParameter(downloadProgress, "downloadProgress");
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str = "";
        if (i != 10) {
            if (fileInfoModel != null) {
                String path2 = fileInfoModel.getPath();
                if (path2 == null) {
                    path2 = "";
                }
                if (!new File(path2).exists()) {
                    com.zentraedi.comic.delegate.t.a.g(fileInfoModel, activity, new Function0() { // from class: com.zentraedi.comic.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return m.j(fileInfoModel, success);
                        }
                    }, failed, startProcess);
                    return;
                } else {
                    String path3 = fileInfoModel.getPath();
                    success.invoke(path3 != null ? path3 : "");
                    return;
                }
            }
            return;
        }
        if (fileInfoModel != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(e);
            b0 b0Var = b0.a;
            CompressionBrowserResponse compressionBrowserResponseT = b0Var.t();
            if (compressionBrowserResponseT != null && (path = compressionBrowserResponseT.getPath()) != null) {
                str = path;
            }
            sb.append(l5.y(x(str)));
            sb.append(File.separator);
            sb.append(fileInfoModel.getPath());
            fileInfoModel.setLocalPath(sb.toString());
            String localPath = fileInfoModel.getLocalPath();
            Intrinsics.checkNotNull(localPath);
            if (new File(localPath).exists()) {
                downloadProgress.invoke(AlbumAllTagModel.b.Hg);
                String localPath2 = fileInfoModel.getLocalPath();
                Intrinsics.checkNotNull(localPath2);
                success.invoke(localPath2);
                return;
            }
            String path4 = fileInfoModel.getPath();
            Intrinsics.checkNotNull(path4);
            Function1<Continuation<? super Unit>, Object> function1K = b0Var.k(path4);
            d1<Pair<String, String>> d1Var = new d1<>();
            d1Var.l(new g(new Function1() { // from class: com.zentraedi.comic.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.i(downloadProgress, success, (Pair) obj);
                }
            }));
            String path5 = fileInfoModel.getPath();
            Intrinsics.checkNotNull(path5);
            b0Var.r(path5, function1K, 0, d1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1, Function1 function2, Pair pair) {
        if (Intrinsics.areEqual(pair.getFirst(), AlbumAllTagModel.b.Hg)) {
            function2.invoke(pair.getSecond());
            return Unit.INSTANCE;
        }
        function1.invoke(pair.getFirst());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(FileInfoModel fileInfoModel, Function1 function1) {
        String localPath = fileInfoModel.getLocalPath();
        if (localPath != null) {
            function1.invoke(localPath);
        }
        return Unit.INSTANCE;
    }

    @fo.k
    public static final String k(@fo.k String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        String strW = w(path);
        if (strW.length() == 0) {
            strW = null;
        }
        if (strW != null) {
            String str = strW + File.separator + x(path);
            if (str != null) {
                return str;
            }
        }
        return x(path);
    }

    @fo.l
    public static final Object l(@fo.k String str, @fo.k Function1<? super String, Unit> function1, @fo.k Function0<Unit> function0, @fo.k Function1<? super String, Unit> function2, @fo.k Continuation<? super Unit> continuation) {
        Object objH = kotlinx.coroutines.i.h(g1.e(), new a(str, function0, function2, function1, null), continuation);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : Unit.INSTANCE;
    }

    public static final void m(@fo.l l6 l6Var) {
        if (l6Var == null || TextUtils.isEmpty(l6Var.getFileId())) {
            return;
        }
        TaskFileData taskFileData = new TaskFileData();
        taskFileData.setExtra(l6Var.e());
        taskFileData.setFileId(l6Var.getFileId());
        taskFileData.setTargetPath(e + com.zentraedi.basic.function.utils.r.a(l6Var.w()) + File.separator + l6Var.getFileName());
        t7.o("album_download_red_round", Boolean.TRUE);
        com.zentraedi.business.task.g.D().L(ComicSubDirActivity.m0, taskFileData, true);
    }

    public static final void n(@fo.k Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
    }

    @fo.k
    public static final List<eg.d> o(int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                arrayList.add(new eg.d(String.valueOf(i2), i2, i2, false));
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return arrayList;
    }

    private static final void p(Outline[] outlineArr, List<eg.d> list, int i, Document document) {
        for (Outline outline : outlineArr) {
            String title = outline.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            list.add(new eg.d(title, i, document.pageNumberFromLocation(document.resolveLink(outline)), false));
            Outline[] down = outline.down;
            if (down != null) {
                Intrinsics.checkNotNullExpressionValue(down, "down");
                p(down, list, i + 1, document);
            }
        }
    }

    public static final int q() {
        return ((Number) c.getValue((Object) null, a[0])).intValue();
    }

    @fo.k
    public static final String r(@fo.k String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            String separator = File.separator;
            Intrinsics.checkNotNullExpressionValue(separator, "separator");
            int iLastIndexOf$default = StringsKt.lastIndexOf$default(path, separator, 0, false, 6, (Object) null);
            String strSubstring = path.substring(iLastIndexOf$default + 1, StringsKt.lastIndexOf$default(path, ".", 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        } catch (Exception unused) {
            return "";
        }
    }

    @fo.l
    public static final String s(@fo.k FileInfoModel fileInfoModel) {
        Intrinsics.checkNotNullParameter(fileInfoModel, "fileInfoModel");
        String path = fileInfoModel.getPath();
        if (path == null) {
            path = "";
        }
        return t("", path, "");
    }

    @fo.l
    public static final String t(@fo.k String modifyTime, @fo.k String nasPath, @fo.k String username) {
        Intrinsics.checkNotNullParameter(modifyTime, "modifyTime");
        Intrinsics.checkNotNullParameter(nasPath, "nasPath");
        Intrinsics.checkNotNullParameter(username, "username");
        if (TextUtils.isEmpty(nasPath)) {
            return null;
        }
        if (TextUtils.isEmpty(username)) {
            username = NasConnectManager.getInstance().loginUserName();
            Intrinsics.checkNotNullExpressionValue(username, "loginUserName(...)");
        }
        String strA = com.zentraedi.basic.function.utils.r.a(nasPath);
        String strSubstring = nasPath.substring(StringsKt.lastIndexOf$default(nasPath, "/", 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        if (TextUtils.isEmpty(modifyTime)) {
            modifyTime = com.zentraedi.basic.function.utils.a.n(q.C0124q.XS1);
            Intrinsics.checkNotNullExpressionValue(modifyTime, "getString(...)");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(e);
        sb.append(username);
        String str = File.separator;
        sb.append(str);
        sb.append(modifyTime);
        sb.append(strA);
        sb.append(str);
        sb.append(strSubstring);
        return TaskFileData.getShortPath(sb.toString());
    }

    public static final int u(@fo.l String str, @fo.l String str2) {
        if (str != null) {
            return i5.a.f(StringsKt.trim(str).toString());
        }
        return i5.a.f(str2 != null ? StringsKt.trim(str2).toString() : null);
    }

    @fo.k
    public static final String v() {
        return d;
    }

    @fo.k
    public static final String w(@fo.k String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt.split$default(StringsKt.removeSuffix(d5.a.r(path), "/"), new String[]{"/"}, false, 0, 6, (Object) null);
        return (listSplit$default.isEmpty() || listSplit$default.size() == 1) ? "" : (String) listSplit$default.get(listSplit$default.size() - 2);
    }

    @fo.k
    public static final String x(@fo.k String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        List listSplit$default = StringsKt.split$default(StringsKt.removeSuffix(d5.a.r(path), "/"), new String[]{"/"}, false, 0, 6, (Object) null);
        if (listSplit$default.isEmpty()) {
            return "";
        }
        return listSplit$default.size() == 1 ? (String) listSplit$default.get(0) : (String) listSplit$default.get(listSplit$default.size() - 1);
    }

    @fo.k
    public static final String y(@fo.k String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String str = d + x(d5.a.m(name)) + File.separator + r(name) + ".png";
        try {
            if (new File(str).exists()) {
                return str;
            }
        } catch (Exception unused) {
        }
        return e + x(d5.a.m(name)) + File.separator + r(name) + ".png";
    }

    @fo.k
    public static final String z() {
        return e;
    }
}
