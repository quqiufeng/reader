package com.zentraedi.outreader.reader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.util.LruCache;
import androidx.fragment.app.Fragment;
import com.tencent.tbs.reader.TbsReaderView;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.basic.function.utils.m0;
import com.zentraedi.business.utils.h0;
import com.zentraedi.comic.activity.ComicSubDirActivity;
import com.zentraedi.outreader.model.ChapterM;
import fo.k;
import fo.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.LongRange;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import org.readium.r2.navigator.Navigator;
import org.readium.r2.shared.publication.Href;
import org.readium.r2.shared.publication.Link;
import org.readium.r2.shared.publication.Publication;
import org.readium.r2.shared.util.Try;
import org.readium.r2.shared.util.data.Readable;
import org.readium.r2.shared.util.logging.Warning;
import org.readium.r2.shared.util.logging.WarningLogger;
import org.readium.r2.shared.util.resource.Resource;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nComicEpubZReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicEpubZReader.kt\ncom/zentraedi/outreader/reader/ComicEpubZReader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Closeable.kt\norg/readium/r2/shared/util/CloseableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n+ 6 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,628:1\n1878#2,3:629\n1869#2,2:632\n1869#2:648\n1870#2:650\n25#3,14:634\n1#4:649\n35#5,8:651\n53#5:663\n35#5,8:664\n53#5:676\n48#6,4:659\n48#6,4:672\n*S KotlinDebug\n*F\n+ 1 ComicEpubZReader.kt\ncom/zentraedi/outreader/reader/ComicEpubZReader\n*L\n203#1:629,3\n228#1:632,2\n347#1:648\n347#1:650\n327#1:634,14\n389#1:651,8\n389#1:663\n420#1:664,8\n420#1:676\n389#1:659,4\n420#1:672,4\n*E\n"})
public final class ComicEpubZReader extends com.zentraedi.outreader.reader.h {

    @k
    private final String c = "nas_book";

    @k
    private final com.zentraedi.reader.readium.d d;

    @l
    private Publication e;

    @l
    private Navigator f;

    @k
    private final LruCache<Integer, Bitmap> g;

    @k
    private final LruCache<Integer, Bitmap> h;

    @k
    private String i;

    @k
    private String j;

    @k
    private String k;

    @k
    private String l;

    @k
    private String m;

    @k
    private List<ChapterM.Chapter> n;

    @k
    private HashSet<Link> o;

    @k
    private List<Link> p;

    @k
    private final Regex q;

    @k
    private final c r;

    @k
    private final Pair<Integer, Integer> s;

    @DebugMetadata(c = "com.zentraedi.outreader.reader.ComicEpubZReader", f = "ComicEpubZReader.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {328, 329}, m = "collectImagesFromFixedLayoutPages", n = {"publication", "hitCount", "pageLink", "resource", "$this$use$iv", "readable", "pageCount", "index", "$i$f$use", "$i$a$-use-ComicEpubZReader$collectImagesFromFixedLayoutPages$pageHtml$1", "publication", "hitCount", "pageLink", "resource", "$this$use$iv", "readable", "bytes", "pageCount", "index", "$i$f$use", "$i$a$-use-ComicEpubZReader$collectImagesFromFixedLayoutPages$pageHtml$1"}, s = {"L$0", "L$1", "L$3", "L$4", "L$5", "L$6", "I$0", "I$2", "I$3", "I$4", "L$0", "L$1", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$2", "I$3", "I$4"}, v = 1)
    static final class a extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        Object g;
        Object h;
        int i;
        int j;
        int k;
        int l;
        int m;
        /* synthetic */ Object n;
        int p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.n = obj;
            this.p |= IntCompanionObject.MIN_VALUE;
            return ComicEpubZReader.this.N(null, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.ComicEpubZReader", f = "ComicEpubZReader.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {293}, m = "collectImagesFromReadiumContent", n = {"publication", "content", "iterator", "total", "imageCount", "textCount", "otherCount"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 1)
    static final class b extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        int d;
        int e;
        int f;
        int g;
        /* synthetic */ Object h;
        int j;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.h = obj;
            this.j |= IntCompanionObject.MIN_VALUE;
            return ComicEpubZReader.this.P(null, this);
        }
    }

    public static final class c implements WarningLogger {
        c() {
        }

        public void log(Warning warning) {
            Intrinsics.checkNotNullParameter(warning, "warning");
            nd.a.h(ComicEpubZReader.this.c, "ComicEpubZReader-> tag=" + warning.getTag() + " message=" + warning.getMessage());
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.ComicEpubZReader", f = "ComicEpubZReader.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4}, l = {227, 260, 263, 267, 271}, m = "getAllImagesInReadingOrder", n = {"publication", "lastModifiedTime", "time", "publication", "lastModifiedTime", "time", "isFixedLayoutComic", "publication", "lastModifiedTime", "time", "isFixedLayoutComic", "publication", "lastModifiedTime", "time", "isFixedLayoutComic", "publication", "lastModifiedTime", "time", "isFixedLayoutComic"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "Z$0", "L$0", "J$0", "J$1", "Z$0", "L$0", "J$0", "J$1", "Z$0", "L$0", "J$0", "J$1", "Z$0"}, v = 1)
    static final class d extends ContinuationImpl {
        Object a;
        long b;
        long c;
        boolean d;
        /* synthetic */ Object e;
        int g;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.e = obj;
            this.g |= IntCompanionObject.MIN_VALUE;
            return ComicEpubZReader.this.R(null, this);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.ComicEpubZReader$getImageBitmapFromHref$2", f = "ComicEpubZReader.kt", i = {0, 0, 0}, l = {463}, m = "invokeSuspend", n = {"href", "resource", "time"}, s = {"L$0", "L$1", "J$0"}, v = 1)
    static final class e extends SuspendLambda implements Function2<q0, Continuation<? super Bitmap>, Object> {
        long a;
        Object b;
        Object c;
        int d;
        final /* synthetic */ Link e;
        final /* synthetic */ Publication f;
        final /* synthetic */ ComicEpubZReader g;
        final /* synthetic */ int h;
        final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Link link, Publication publication, ComicEpubZReader comicEpubZReader, int i, boolean z, Continuation<? super e> continuation) {
            super(2, continuation);
            this.e = link;
            this.f = publication;
            this.g = comicEpubZReader;
            this.h = i;
            this.i = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.e, this.f, this.g, this.h, this.i, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Href href;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.d;
            Bitmap bitmapQ = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Href href2 = this.e.getHref();
                Resource resource = this.f.get(this.e);
                if (resource == null) {
                    nd.a.c(this.g.c, "ComicEpubZReader->getImageBitmapFromHref 错误：在 EPUB 中未找到 " + href2 + " 的资源。pageNumber=" + this.h);
                    return null;
                }
                this.b = href2;
                this.c = SpillingKt.nullOutSpilledVariable(resource);
                this.a = jCurrentTimeMillis;
                this.d = 1;
                Object obj2 = Readable.DefaultImpls.read$default(resource, (LongRange) null, this, 1, (Object) null);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                href = href2;
                obj = obj2;
                j = jCurrentTimeMillis;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.a;
                href = (Href) this.b;
                ResultKt.throwOnFailure(obj);
            }
            byte[] bArr = (byte[]) ((Try) obj).getOrNull();
            if (bArr == null) {
                nd.a.c(this.g.c, "ComicEpubZReader->getImageBitmapFromHref 错误：读取 中未找到  " + href + " 的资源 的资源数据失败。pageNumber=" + this.h);
                return null;
            }
            Pair pair = this.i ? this.g.s : new Pair(Boxing.boxInt(k0.l()), Boxing.boxInt(k0.i()));
            try {
                bitmapQ = this.g.Q(bArr, ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
            } catch (Exception e) {
                e.printStackTrace();
                nd.a.c(this.g.c, "ComicEpubZReader->getImageBitmapFromHref 错误：解码图片  " + href + " pageNumber=" + this.h + " 失败: " + e.getMessage());
            }
            nd.a.e(this.g.c, "ComicEpubZReader->getImageBitmapFromHref 解码图片  " + href + " pageNumber=" + this.h + " previewBitmap=" + this.i + " 耗时=" + (System.currentTimeMillis() - j) + ' ' + h0.a.d(bitmapQ));
            return bitmapQ;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Bitmap> continuation) {
            return ((e) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class f extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ com.zentraedi.reader.g a;
        final /* synthetic */ int b;

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ComicEpubZReader.kt\ncom/zentraedi/outreader/reader/ComicEpubZReader\n*L\n1#1,61:1\n390#2,3:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.reader.g a;
            final /* synthetic */ int b;

            public a(com.zentraedi.reader.g gVar, int i) {
                this.a = gVar;
                this.b = i;
            }

            public final void a() {
                this.a.a(this.b, 0, 0);
                this.a.b(this.b, null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ComicEpubZReader.kt\ncom/zentraedi/outreader/reader/ComicEpubZReader\n*L\n1#1,61:1\n390#2,3:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.reader.g a;
            final /* synthetic */ int b;

            public b(com.zentraedi.reader.g gVar, int i) {
                this.a = gVar;
                this.b = i;
            }

            public final void a() {
                this.a.a(this.b, 0, 0);
                this.a.b(this.b, null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ComicEpubZReader.kt\ncom/zentraedi/outreader/reader/ComicEpubZReader\n*L\n1#1,61:1\n390#2,3:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.reader.g a;
            final /* synthetic */ int b;

            public c(com.zentraedi.reader.g gVar, int i) {
                this.a = gVar;
                this.b = i;
            }

            public final void a() {
                this.a.a(this.b, 0, 0);
                this.a.b(this.b, null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CoroutineExceptionHandler.b bVar, com.zentraedi.reader.g gVar, int i) {
            super(bVar);
            this.a = gVar;
            this.b = i;
        }

        public void handleException(@k CoroutineContext coroutineContext, @k Throwable th2) {
            try {
                nd.a.h("CoroutineScope", "throwable->coroutineDefaultWithMain() throwable=" + Log.getStackTraceString(th2));
                th2.printStackTrace();
                pe.i.r(new a(this.a, this.b));
            } catch (Throwable th3) {
                try {
                    th3.printStackTrace();
                    pe.i.r(new b(this.a, this.b));
                } catch (Throwable th4) {
                    pe.i.r(new c(this.a, this.b));
                    throw th4;
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class g extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ com.zentraedi.reader.g a;
        final /* synthetic */ int b;

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ComicEpubZReader.kt\ncom/zentraedi/outreader/reader/ComicEpubZReader\n*L\n1#1,61:1\n421#2,3:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.reader.g a;
            final /* synthetic */ int b;

            public a(com.zentraedi.reader.g gVar, int i) {
                this.a = gVar;
                this.b = i;
            }

            public final void a() {
                this.a.a(this.b, 0, 0);
                this.a.b(this.b, null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ComicEpubZReader.kt\ncom/zentraedi/outreader/reader/ComicEpubZReader\n*L\n1#1,61:1\n421#2,3:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.reader.g a;
            final /* synthetic */ int b;

            public b(com.zentraedi.reader.g gVar, int i) {
                this.a = gVar;
                this.b = i;
            }

            public final void a() {
                this.a.a(this.b, 0, 0);
                this.a.b(this.b, null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ComicEpubZReader.kt\ncom/zentraedi/outreader/reader/ComicEpubZReader\n*L\n1#1,61:1\n421#2,3:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            final /* synthetic */ com.zentraedi.reader.g a;
            final /* synthetic */ int b;

            public c(com.zentraedi.reader.g gVar, int i) {
                this.a = gVar;
                this.b = i;
            }

            public final void a() {
                this.a.a(this.b, 0, 0);
                this.a.b(this.b, null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(CoroutineExceptionHandler.b bVar, com.zentraedi.reader.g gVar, int i) {
            super(bVar);
            this.a = gVar;
            this.b = i;
        }

        public void handleException(@k CoroutineContext coroutineContext, @k Throwable th2) {
            try {
                nd.a.h("CoroutineScope", "throwable->coroutineDefaultWithMain() throwable=" + Log.getStackTraceString(th2));
                th2.printStackTrace();
                pe.i.r(new a(this.a, this.b));
            } catch (Throwable th3) {
                try {
                    th3.printStackTrace();
                    pe.i.r(new b(this.a, this.b));
                } catch (Throwable th4) {
                    pe.i.r(new c(this.a, this.b));
                    throw th4;
                }
            }
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.ComicEpubZReader", f = "ComicEpubZReader.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {117, 133, 147, 154}, m = "openFile-gIAlu-s", n = {TbsReaderView.m, "file", TbsReaderView.m, "file", "asset", TbsReaderView.m, "file", "asset", "isRestricted", TbsReaderView.m, "file", "asset", "isRestricted", "drmStatus"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "Z$0"}, v = 1)
    static final class h extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        int e;
        boolean f;
        /* synthetic */ Object g;
        int i;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.g = obj;
            this.i |= IntCompanionObject.MIN_VALUE;
            Object objH = ComicEpubZReader.this.h(null, this);
            return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : Result.m5boximpl(objH);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.ComicEpubZReader$openFile$2", f = "ComicEpubZReader.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class i extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ComicEpubZReader.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ComicEpubZReader comicEpubZReader = ComicEpubZReader.this;
                Publication publication = comicEpubZReader.e;
                this.a = 1;
                if (comicEpubZReader.R(publication, this) == coroutine_suspended) {
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
            return ((i) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ComicEpubZReader() {
        com.zentraedi.reader.readium.d.a aVar = com.zentraedi.reader.readium.d.d;
        Context contextA = com.zentraedi.basic.function.utils.a.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext(...)");
        this.d = aVar.a(contextA);
        this.g = new LruCache<>(10);
        this.h = new LruCache<>(6);
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = new ArrayList();
        this.o = new HashSet<>();
        this.p = new ArrayList();
        this.q = new Regex("<(?:img|image)\\b[^>]*(?:src|xlink:href|href)\\s*=\\s*[\"']([^\"']+)[\"']", SetsKt.setOf((Object[]) new RegexOption[]{RegexOption.IGNORE_CASE, RegexOption.DOT_MATCHES_ALL}));
        this.r = new c();
        this.s = new Pair<>(Integer.valueOf(m0.b(111.0f)), Integer.valueOf(m0.b(156.0f)));
    }

    private final int M(BitmapFactory.Options options, int i2, int i3) {
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        int i6 = 1;
        if (i4 <= i3 && i5 <= i2) {
            return 1;
        }
        int i7 = i4 / 2;
        int i8 = i5 / 2;
        while (i7 / i6 >= i3 && i8 / i6 >= i2) {
            i6 *= 2;
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:29:0x00da A[LOOP:0: B:25:0x00c4->B:29:0x00da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x012a  */
    /* JADX WARN: Code duplicated, block: B:33:0x012b A[EDGE_INSN: B:33:0x012b->B:34:0x013a BREAK  A[LOOP:0: B:25:0x00c4->B:29:0x00da]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0144 -> B:37:0x0149). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x017f -> B:42:0x0181). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object N(org.readium.r2.shared.publication.Publication r31, kotlin.coroutines.Continuation<? super kotlin.Unit> r32) {
        /*
            Method dump skipped, instruction units count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.reader.ComicEpubZReader.N(org.readium.r2.shared.publication.Publication, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (String) CollectionsKt.getOrNull(it.getGroupValues(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0093  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0093 -> B:23:0x0098). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object P(org.readium.r2.shared.publication.Publication r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.reader.ComicEpubZReader.P(org.readium.r2.shared.publication.Publication, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap Q(byte[] bArr, int i2, int i3) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        options.inSampleSize = M(options, i2, i3);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:72:0x0202  */
    /* JADX WARN: Code duplicated, block: B:79:0x0254  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x022c, code lost:
    
        if (N(r11, r2) == r3) goto L78;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0202, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(org.readium.r2.shared.publication.Publication r17, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.reader.ComicEpubZReader.R(org.readium.r2.shared.publication.Publication, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final List<Link> S(Publication publication) {
        if (publication == null) {
            return CollectionsKt.emptyList();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = 0;
        for (Object obj : publication.getReadingOrder()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Link link = (Link) obj;
            String str = this.c;
            StringBuilder sb = new StringBuilder();
            sb.append("ComicEpubZReader->getAllPagesInOrder 页面 ");
            sb.append(i3);
            sb.append(": ");
            sb.append(link.getHref());
            sb.append(" (标题: ");
            String title = link.getTitle();
            if (title == null) {
                title = "N/A";
            }
            sb.append(title);
            sb.append(')');
            nd.a.e(str, sb.toString());
            i2 = i3;
        }
        nd.a.h(this.c, "ComicEpubZReader->getAllPagesInOrder 阅读顺序 (所有页面) 耗时=" + (System.currentTimeMillis() - jCurrentTimeMillis));
        return publication.getReadingOrder();
    }

    private final void T(Publication publication) {
        if (publication == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Z(publication.getTableOfContents(), 0);
        nd.a.h(this.c, "ComicEpubZReader->getAllTableOfContents 获取目录 耗时=" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U(Publication publication, Link link, int i2, boolean z, Continuation<? super Bitmap> continuation) {
        if (publication == null || link == null) {
            return null;
        }
        return kotlinx.coroutines.i.h(g1.c(), new e(link, publication, this, i2, z, null), continuation);
    }

    private final String X(int i2) {
        if (i2 <= 0) {
            return "";
        }
        return "  " + X(i2 - 1);
    }

    private final boolean Y(Publication publication) {
        String lowerCase;
        String string;
        String string2;
        Object obj = publication.getMetadata().get("book-type");
        String lowerCase2 = null;
        if (obj == null || (string2 = obj.toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        Object obj2 = publication.getMetadata().get("rendition:layout");
        if (obj2 != null && (string = obj2.toString()) != null) {
            lowerCase2 = string.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        }
        return Intrinsics.areEqual(lowerCase, ComicSubDirActivity.m0) || Intrinsics.areEqual(lowerCase2 != null ? lowerCase2 : "", "pre-paginated");
    }

    private final void Z(List<Link> list, int i2) {
        for (Link link : list) {
            String str = this.c;
            StringBuilder sb = new StringBuilder();
            sb.append("ComicEpubZReader->printTocTree ");
            sb.append(StringsKt.repeat("  ", i2));
            String title = link.getTitle();
            if (title == null) {
                title = "";
            }
            sb.append(title);
            nd.a.e(str, sb.toString());
            if (!link.getChildren().isEmpty()) {
                Z(link.getChildren(), i2 + 1);
            }
        }
    }

    @k
    public final String V() {
        String str = this.l;
        if (str.length() != 0) {
            return str;
        }
        return com.zentraedi.basic.function.utils.a.a().getCacheDir().getAbsolutePath() + "/epub/preview/";
    }

    @k
    public final String W() {
        String str = this.m;
        if (str.length() != 0) {
            return str;
        }
        return com.zentraedi.basic.function.utils.a.a().getCacheDir().getAbsolutePath() + "/epub/read/";
    }

    public final void a0(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.l = str;
    }

    @Override // com.zentraedi.outreader.reader.h, com.zentraedi.reader.i
    public int b() {
        return this.p.size();
    }

    public final void b0(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.m = str;
    }

    @Override // com.zentraedi.outreader.reader.h, com.zentraedi.reader.i
    public void g(int i2, @k com.zentraedi.reader.g onDrawListener) {
        Intrinsics.checkNotNullParameter(onDrawListener, "onDrawListener");
        super.g(i2, onDrawListener);
        nd.a.e(this.c, "ComicEpubZReader->onPreviewPageBitmap pageNumber=" + i2);
        if (i2 <= 0 || i2 > b()) {
            onDrawListener.a(i2, 0, 0);
            onDrawListener.b(i2, null);
            return;
        }
        Bitmap bitmap = this.g.get(Integer.valueOf(i2));
        if (bitmap == null || bitmap.isRecycled()) {
            nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + ComicEpubZReader.class + ' ' + Thread.currentThread().getName());
            kotlinx.coroutines.i.e(r0.a(g1.a().plus(new g(CoroutineExceptionHandler.F2, onDrawListener, i2))), (CoroutineContext) null, (CoroutineStart) null, new ComicEpubZReader$onPreviewPageBitmap$$inlined$coroutineDefaultWithMain$2(this, ComicEpubZReader.class, null, i2, this, i2, onDrawListener), 3, (Object) null);
            return;
        }
        nd.a.e(this.c, "ComicEpubZReader->onPreviewPageBitmap 内存缓存 fileName=" + this.j + " pageNumber=" + i2);
        onDrawListener.a(i2, bitmap.getWidth(), bitmap.getHeight());
        onDrawListener.b(i2, bitmap);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0147 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:15:0x003c, B:81:0x0221, B:22:0x005a, B:74:0x01c7, B:76:0x01e5, B:78:0x01ee, B:25:0x006f, B:51:0x013f, B:53:0x0147, B:56:0x0159, B:59:0x0160, B:61:0x0178, B:63:0x017c, B:65:0x0182, B:67:0x0190, B:68:0x0194, B:70:0x01a7, B:28:0x007c, B:37:0x00e1, B:39:0x00e5, B:41:0x00f5, B:43:0x0101, B:44:0x0108, B:46:0x0114, B:47:0x011b, B:34:0x00ca), top: B:85:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0157  */
    /* JADX WARN: Code duplicated, block: B:61:0x0178 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:15:0x003c, B:81:0x0221, B:22:0x005a, B:74:0x01c7, B:76:0x01e5, B:78:0x01ee, B:25:0x006f, B:51:0x013f, B:53:0x0147, B:56:0x0159, B:59:0x0160, B:61:0x0178, B:63:0x017c, B:65:0x0182, B:67:0x0190, B:68:0x0194, B:70:0x01a7, B:28:0x007c, B:37:0x00e1, B:39:0x00e5, B:41:0x00f5, B:43:0x0101, B:44:0x0108, B:46:0x0114, B:47:0x011b, B:34:0x00ca), top: B:85:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x017c A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:15:0x003c, B:81:0x0221, B:22:0x005a, B:74:0x01c7, B:76:0x01e5, B:78:0x01ee, B:25:0x006f, B:51:0x013f, B:53:0x0147, B:56:0x0159, B:59:0x0160, B:61:0x0178, B:63:0x017c, B:65:0x0182, B:67:0x0190, B:68:0x0194, B:70:0x01a7, B:28:0x007c, B:37:0x00e1, B:39:0x00e5, B:41:0x00f5, B:43:0x0101, B:44:0x0108, B:46:0x0114, B:47:0x011b, B:34:0x00ca), top: B:85:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0181  */
    /* JADX WARN: Code duplicated, block: B:67:0x0190 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:15:0x003c, B:81:0x0221, B:22:0x005a, B:74:0x01c7, B:76:0x01e5, B:78:0x01ee, B:25:0x006f, B:51:0x013f, B:53:0x0147, B:56:0x0159, B:59:0x0160, B:61:0x0178, B:63:0x017c, B:65:0x0182, B:67:0x0190, B:68:0x0194, B:70:0x01a7, B:28:0x007c, B:37:0x00e1, B:39:0x00e5, B:41:0x00f5, B:43:0x0101, B:44:0x0108, B:46:0x0114, B:47:0x011b, B:34:0x00ca), top: B:85:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01a7 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:15:0x003c, B:81:0x0221, B:22:0x005a, B:74:0x01c7, B:76:0x01e5, B:78:0x01ee, B:25:0x006f, B:51:0x013f, B:53:0x0147, B:56:0x0159, B:59:0x0160, B:61:0x0178, B:63:0x017c, B:65:0x0182, B:67:0x0190, B:68:0x0194, B:70:0x01a7, B:28:0x007c, B:37:0x00e1, B:39:0x00e5, B:41:0x00f5, B:43:0x0101, B:44:0x0108, B:46:0x0114, B:47:0x011b, B:34:0x00ca), top: B:85:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e5 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:15:0x003c, B:81:0x0221, B:22:0x005a, B:74:0x01c7, B:76:0x01e5, B:78:0x01ee, B:25:0x006f, B:51:0x013f, B:53:0x0147, B:56:0x0159, B:59:0x0160, B:61:0x0178, B:63:0x017c, B:65:0x0182, B:67:0x0190, B:68:0x0194, B:70:0x01a7, B:28:0x007c, B:37:0x00e1, B:39:0x00e5, B:41:0x00f5, B:43:0x0101, B:44:0x0108, B:46:0x0114, B:47:0x011b, B:34:0x00ca), top: B:85:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ee A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:15:0x003c, B:81:0x0221, B:22:0x005a, B:74:0x01c7, B:76:0x01e5, B:78:0x01ee, B:25:0x006f, B:51:0x013f, B:53:0x0147, B:56:0x0159, B:59:0x0160, B:61:0x0178, B:63:0x017c, B:65:0x0182, B:67:0x0190, B:68:0x0194, B:70:0x01a7, B:28:0x007c, B:37:0x00e1, B:39:0x00e5, B:41:0x00f5, B:43:0x0101, B:44:0x0108, B:46:0x0114, B:47:0x011b, B:34:0x00ca), top: B:85:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x021e, code lost:
    
        if (kotlinx.coroutines.i.h(r7, r8, r0) == r1) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v32, types: [int] */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // com.zentraedi.reader.i
    @fo.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(@fo.k java.lang.String r13, @fo.k kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.zentraedi.reader.OpenFileResult>> r14) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.reader.ComicEpubZReader.h(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.zentraedi.outreader.reader.h, com.zentraedi.reader.i
    public void k(int i2, @k com.zentraedi.reader.g onDrawListener) {
        Intrinsics.checkNotNullParameter(onDrawListener, "onDrawListener");
        super.k(i2, onDrawListener);
        nd.a.e(this.c, "ComicEpubZReader->onDrawPageBitmap pageNumber=" + i2);
        if (i2 <= 0 || i2 > b()) {
            onDrawListener.a(i2, 0, 0);
            onDrawListener.b(i2, null);
            return;
        }
        Bitmap bitmap = this.h.get(Integer.valueOf(i2));
        if (bitmap == null || bitmap.isRecycled()) {
            nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + ComicEpubZReader.class + ' ' + Thread.currentThread().getName());
            kotlinx.coroutines.i.e(r0.a(g1.a().plus(new f(CoroutineExceptionHandler.F2, onDrawListener, i2))), (CoroutineContext) null, (CoroutineStart) null, new ComicEpubZReader$onDrawPageBitmap$$inlined$coroutineDefaultWithMain$2(this, ComicEpubZReader.class, null, i2, this, i2, onDrawListener), 3, (Object) null);
            return;
        }
        nd.a.e(this.c, "ComicEpubZReader->onDrawPageBitmap 内存缓存 fileName=" + this.j + " pageNumber=" + i2);
        onDrawListener.a(i2, bitmap.getWidth(), bitmap.getHeight());
        onDrawListener.b(i2, bitmap);
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object m(@k Continuation<? super List<? extends ChapterM.Chapter>> continuation) {
        return this.n;
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object n(@k Continuation<? super String> continuation) {
        return "";
    }

    @Override // com.zentraedi.outreader.reader.h
    public int o() {
        return 0;
    }

    @Override // com.zentraedi.reader.i
    public void onDestroy() {
        nd.a.h(this.c, "ComicEpubZReader->onDestroy filePathMd5=" + this.k + " filePath=" + this.i);
        this.h.evictAll();
        this.g.evictAll();
    }

    @Override // com.zentraedi.outreader.reader.h
    @k
    public String p() {
        return "";
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Fragment q() {
        return null;
    }

    @Override // com.zentraedi.outreader.reader.h
    @k
    public List<Integer> r() {
        return CollectionsKt.emptyList();
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object s(int i2, @k Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object t(@k ChapterM.Chapter chapter, @k Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.zentraedi.outreader.reader.h
    public void u() {
    }

    @Override // com.zentraedi.outreader.reader.h
    public void v() {
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object w(@k Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object x(@k Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.zentraedi.outreader.reader.h
    public boolean y(int i2) {
        return false;
    }

    @Override // com.zentraedi.outreader.reader.h
    public void z(int i2) {
    }
}
