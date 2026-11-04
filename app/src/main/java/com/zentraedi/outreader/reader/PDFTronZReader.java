package com.zentraedi.outreader.reader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import android.util.LruCache;
import androidx.fragment.app.Fragment;
import com.pdftron.common.Matrix2D;
import com.pdftron.pdf.Action;
import com.pdftron.pdf.Bookmark;
import com.pdftron.pdf.Destination;
import com.pdftron.pdf.PDFDoc;
import com.pdftron.pdf.PDFDraw;
import com.pdftron.pdf.PDFRasterizer;
import com.pdftron.pdf.Page;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.basic.function.utils.r;
import com.zentraedi.business.utils.l5;
import com.zentraedi.outreader.model.ChapterM;
import com.zentraedi.outreader.v2.fragment.t;
import com.zentraedi.reader.OpenFileResult;
import com.zentraedi.reader.reader.LocalPdfBookModel;
import fo.k;
import fo.l;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import pe.i;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nPDFTronZReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PDFTronZReader.kt\ncom/zentraedi/outreader/reader/PDFTronZReader\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,675:1\n35#2,8:676\n53#2:688\n35#2,8:689\n53#2:701\n35#2,8:703\n53#2:715\n48#3,4:684\n48#3,4:697\n48#3,4:711\n1#4:702\n*S KotlinDebug\n*F\n+ 1 PDFTronZReader.kt\ncom/zentraedi/outreader/reader/PDFTronZReader\n*L\n284#1:676,8\n284#1:688\n377#1:689,8\n377#1:701\n655#1:703,8\n655#1:715\n284#1:684,4\n377#1:697,4\n655#1:711,4\n*E\n"})
public final class PDFTronZReader extends com.zentraedi.outreader.reader.d {

    @l
    private PDFDoc g;
    private Bookmark h;

    @l
    private List<ChapterM.Chapter> i;
    private long p;

    @k
    private final Object f = new Object();

    @k
    private final List<LocalPdfBookModel.LocalPdfChapter> j = new ArrayList();

    @k
    private final g k = new g();

    @k
    private final f l = new f();

    @k
    private String m = "";

    @k
    private String n = "";

    @k
    private String o = "";

    @k
    private String q = "";

    @k
    private String r = "";

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ PDFTronZReader a;
        final /* synthetic */ int b;
        final /* synthetic */ com.zentraedi.reader.g c;

        /* JADX INFO: renamed from: com.zentraedi.outreader.reader.PDFTronZReader$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 PDFTronZReader.kt\ncom/zentraedi/outreader/reader/PDFTronZReader\n*L\n1#1,61:1\n285#2,4:62\n*E\n"})
        public static final class C0147a implements Function0<Unit> {
            final /* synthetic */ PDFTronZReader a;
            final /* synthetic */ int b;
            final /* synthetic */ com.zentraedi.reader.g c;

            public C0147a(PDFTronZReader pDFTronZReader, int i, com.zentraedi.reader.g gVar) {
                this.a = pDFTronZReader;
                this.b = i;
                this.c = gVar;
            }

            public final void a() {
                nd.a.c("nas_book", "PDFTronZReader->getPageBitmap fileName=" + this.a.n + " pageNumber=" + this.b);
                com.zentraedi.reader.g gVar = this.c;
                if (gVar != null) {
                    gVar.a(this.b, 0, 0);
                }
                com.zentraedi.reader.g gVar2 = this.c;
                if (gVar2 != null) {
                    gVar2.b(this.b, null);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 PDFTronZReader.kt\ncom/zentraedi/outreader/reader/PDFTronZReader\n*L\n1#1,61:1\n285#2,4:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            final /* synthetic */ PDFTronZReader a;
            final /* synthetic */ int b;
            final /* synthetic */ com.zentraedi.reader.g c;

            public b(PDFTronZReader pDFTronZReader, int i, com.zentraedi.reader.g gVar) {
                this.a = pDFTronZReader;
                this.b = i;
                this.c = gVar;
            }

            public final void a() {
                nd.a.c("nas_book", "PDFTronZReader->getPageBitmap fileName=" + this.a.n + " pageNumber=" + this.b);
                com.zentraedi.reader.g gVar = this.c;
                if (gVar != null) {
                    gVar.a(this.b, 0, 0);
                }
                com.zentraedi.reader.g gVar2 = this.c;
                if (gVar2 != null) {
                    gVar2.b(this.b, null);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 PDFTronZReader.kt\ncom/zentraedi/outreader/reader/PDFTronZReader\n*L\n1#1,61:1\n285#2,4:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            final /* synthetic */ PDFTronZReader a;
            final /* synthetic */ int b;
            final /* synthetic */ com.zentraedi.reader.g c;

            public c(PDFTronZReader pDFTronZReader, int i, com.zentraedi.reader.g gVar) {
                this.a = pDFTronZReader;
                this.b = i;
                this.c = gVar;
            }

            public final void a() {
                nd.a.c("nas_book", "PDFTronZReader->getPageBitmap fileName=" + this.a.n + " pageNumber=" + this.b);
                com.zentraedi.reader.g gVar = this.c;
                if (gVar != null) {
                    gVar.a(this.b, 0, 0);
                }
                com.zentraedi.reader.g gVar2 = this.c;
                if (gVar2 != null) {
                    gVar2.b(this.b, null);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.b bVar, PDFTronZReader pDFTronZReader, int i, com.zentraedi.reader.g gVar) {
            super(bVar);
            this.a = pDFTronZReader;
            this.b = i;
            this.c = gVar;
        }

        public void handleException(@k CoroutineContext coroutineContext, @k Throwable th2) {
            try {
                nd.a.h("CoroutineScope", "throwable->coroutineDefaultWithMain() throwable=" + Log.getStackTraceString(th2));
                th2.printStackTrace();
                i.r(new C0147a(this.a, this.b, this.c));
            } catch (Throwable th3) {
                try {
                    th3.printStackTrace();
                    i.r(new b(this.a, this.b, this.c));
                } catch (Throwable th4) {
                    i.r(new c(this.a, this.b, this.c));
                    throw th4;
                }
            }
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.PDFTronZReader$getPageBitmap$2$1", f = "PDFTronZReader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class b extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ com.zentraedi.reader.g b;
        final /* synthetic */ int c;
        final /* synthetic */ Page d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.zentraedi.reader.g gVar, int i, Page page, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = gVar;
            this.c = i;
            this.d = page;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.zentraedi.reader.g gVar = this.b;
            if (gVar == null) {
                return null;
            }
            int i = this.c;
            Page page = this.d;
            int iX = page != null ? (int) page.x() : 0;
            Page page2 = this.d;
            gVar.a(i, iX, page2 != null ? (int) page2.v() : 0);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ PDFTronZReader a;
        final /* synthetic */ int b;
        final /* synthetic */ com.zentraedi.reader.g c;

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 PDFTronZReader.kt\ncom/zentraedi/outreader/reader/PDFTronZReader\n*L\n1#1,61:1\n378#2,4:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            final /* synthetic */ PDFTronZReader a;
            final /* synthetic */ int b;
            final /* synthetic */ com.zentraedi.reader.g c;

            public a(PDFTronZReader pDFTronZReader, int i, com.zentraedi.reader.g gVar) {
                this.a = pDFTronZReader;
                this.b = i;
                this.c = gVar;
            }

            public final void a() {
                nd.a.c("nas_book", "PDFTronZReader->getPagePreviewBitmap fileName=" + this.a.n + " pageNumber=" + this.b);
                com.zentraedi.reader.g gVar = this.c;
                if (gVar != null) {
                    gVar.a(this.b, 0, 0);
                }
                com.zentraedi.reader.g gVar2 = this.c;
                if (gVar2 != null) {
                    gVar2.b(this.b, null);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 PDFTronZReader.kt\ncom/zentraedi/outreader/reader/PDFTronZReader\n*L\n1#1,61:1\n378#2,4:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            final /* synthetic */ PDFTronZReader a;
            final /* synthetic */ int b;
            final /* synthetic */ com.zentraedi.reader.g c;

            public b(PDFTronZReader pDFTronZReader, int i, com.zentraedi.reader.g gVar) {
                this.a = pDFTronZReader;
                this.b = i;
                this.c = gVar;
            }

            public final void a() {
                nd.a.c("nas_book", "PDFTronZReader->getPagePreviewBitmap fileName=" + this.a.n + " pageNumber=" + this.b);
                com.zentraedi.reader.g gVar = this.c;
                if (gVar != null) {
                    gVar.a(this.b, 0, 0);
                }
                com.zentraedi.reader.g gVar2 = this.c;
                if (gVar2 != null) {
                    gVar2.b(this.b, null);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.outreader.reader.PDFTronZReader$c$c, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 PDFTronZReader.kt\ncom/zentraedi/outreader/reader/PDFTronZReader\n*L\n1#1,61:1\n378#2,4:62\n*E\n"})
        public static final class C0148c implements Function0<Unit> {
            final /* synthetic */ PDFTronZReader a;
            final /* synthetic */ int b;
            final /* synthetic */ com.zentraedi.reader.g c;

            public C0148c(PDFTronZReader pDFTronZReader, int i, com.zentraedi.reader.g gVar) {
                this.a = pDFTronZReader;
                this.b = i;
                this.c = gVar;
            }

            public final void a() {
                nd.a.c("nas_book", "PDFTronZReader->getPagePreviewBitmap fileName=" + this.a.n + " pageNumber=" + this.b);
                com.zentraedi.reader.g gVar = this.c;
                if (gVar != null) {
                    gVar.a(this.b, 0, 0);
                }
                com.zentraedi.reader.g gVar2 = this.c;
                if (gVar2 != null) {
                    gVar2.b(this.b, null);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.b bVar, PDFTronZReader pDFTronZReader, int i, com.zentraedi.reader.g gVar) {
            super(bVar);
            this.a = pDFTronZReader;
            this.b = i;
            this.c = gVar;
        }

        public void handleException(@k CoroutineContext coroutineContext, @k Throwable th2) {
            try {
                nd.a.h("CoroutineScope", "throwable->coroutineDefaultWithMain() throwable=" + Log.getStackTraceString(th2));
                th2.printStackTrace();
                i.r(new a(this.a, this.b, this.c));
            } catch (Throwable th3) {
                try {
                    th3.printStackTrace();
                    i.r(new b(this.a, this.b, this.c));
                } catch (Throwable th4) {
                    i.r(new C0148c(this.a, this.b, this.c));
                    throw th4;
                }
            }
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.reader.PDFTronZReader$getPagePreviewBitmap$2$1", f = "PDFTronZReader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class d extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ com.zentraedi.reader.g b;
        final /* synthetic */ int c;
        final /* synthetic */ Page d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.zentraedi.reader.g gVar, int i, Page page, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = gVar;
            this.c = i;
            this.d = page;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.zentraedi.reader.g gVar = this.b;
            if (gVar == null) {
                return null;
            }
            int i = this.c;
            Page page = this.d;
            int iX = page != null ? (int) page.x() : 0;
            Page page2 = this.d;
            gVar.a(i, iX, page2 != null ? (int) page2.v() : 0);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((d) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class e extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 PDFTronZReader.kt\ncom/zentraedi/outreader/reader/PDFTronZReader\n*L\n1#1,61:1\n657#2:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 PDFTronZReader.kt\ncom/zentraedi/outreader/reader/PDFTronZReader\n*L\n1#1,61:1\n657#2:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 PDFTronZReader.kt\ncom/zentraedi/outreader/reader/PDFTronZReader\n*L\n1#1,61:1\n657#2:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        public e(CoroutineExceptionHandler.b bVar) {
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

    public static final class f extends LruCache<Integer, Bitmap> {
        f() {
            super(50331648);
        }

        protected int a(int i, Bitmap value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.getByteCount();
        }

        @Override // android.util.LruCache
        public /* bridge */ /* synthetic */ int sizeOf(Integer num, Bitmap bitmap) {
            return a(num.intValue(), bitmap);
        }
    }

    public static final class g extends LruCache<Integer, Bitmap> {
        g() {
            super(16777216);
        }

        protected int a(int i, Bitmap value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.getByteCount();
        }

        @Override // android.util.LruCache
        public /* bridge */ /* synthetic */ int sizeOf(Integer num, Bitmap bitmap) {
            return a(num.intValue(), bitmap);
        }
    }

    private final double W(Page page, double d2, long j, int i) {
        double dCoerceAtLeast = (RangesKt.coerceAtLeast(page.y(1), 1.0d) * d2) / 72.0d;
        double dCoerceAtLeast2 = (RangesKt.coerceAtLeast(page.w(1), 1.0d) * d2) / 72.0d;
        return d2 * Math.min(1.0d, Math.min(Math.sqrt(j / (dCoerceAtLeast * dCoerceAtLeast2)), ((double) i) / Math.max(dCoerceAtLeast, dCoerceAtLeast2)));
    }

    private final LocalPdfBookModel.LocalPdfChapter X(String str, int i, int i2) {
        LocalPdfBookModel.LocalPdfChapter localPdfChapter = new LocalPdfBookModel.LocalPdfChapter();
        localPdfChapter.setLevel(i2);
        localPdfChapter.setPage(i);
        localPdfChapter.setTitle(F(i2) + str);
        return localPdfChapter;
    }

    private final Bitmap Y(File file, long j, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i2 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            return null;
        }
        while (true) {
            int i3 = options.outWidth;
            long j2 = i2;
            int i4 = options.outHeight;
            if ((((long) i3) / j2) * (((long) i4) / j2) <= j && Math.max(i3, i4) / i2 <= i) {
                String absolutePath = file.getAbsolutePath();
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = i2;
                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return BitmapFactory.decodeFile(absolutePath, options2);
            }
            i2 *= 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PDFDraw e0() {
        PDFDraw pDFDraw = new PDFDraw();
        pDFDraw.N(true);
        pDFDraw.F0(true);
        pDFDraw.U(0);
        pDFDraw.b0(true);
        return pDFDraw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double f0(int i, Page page) {
        double dY = page.y(1);
        double d2 = 400.0d / (dY / 72.0d);
        nd.a.e("nas_book", "PDFTronZReader->getPreviewDrawDpi fileName=" + this.n + " pageNumber=" + i + "  pageWidthInPoints=" + dY + " requiredDpi=" + d2);
        return W(page, Math.min(d2, 96.0d), 2000000L, 4096);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double h0(int i, Page page) {
        int i2 = com.zentraedi.basic.function.utils.a.a().getResources().getDisplayMetrics().densityDpi;
        double dMin = ((double) Math.min(k0.l(), k0.i())) * 1.5d;
        double dY = page.y(1);
        double d2 = (72.0d * dMin) / dY;
        double dW = W(page, Math.min(300.0d, d2), 12000000L, ConstantsKt.DEFAULT_BUFFER_SIZE);
        nd.a.e("nas_book", "PDFTronZReader->getReadDrawDpi fileName=" + this.n + " pageNumber=" + i + " screenWidth=" + dMin + " screenDpi=" + i2 + " pageWidthInPoints=" + dY + " requiredDpi=" + d2 + " drawDpi=" + dW);
        return dW;
    }

    private final void l0(Bookmark bookmark, int i, List<LocalPdfBookModel.LocalPdfChapter> list) {
        Destination destinationR;
        if (!bookmark.y()) {
            nd.a.e("nas_book", "PDFTronZReader->traverseBookmarks level=" + i + " chapterListSize=" + list.size());
            if (list.isEmpty()) {
                nd.a.h("nas_book", "PDFTronZReader->traverseBookmarks 读取目录失败");
                return;
            }
            return;
        }
        while (bookmark.y()) {
            String strU = bookmark.u();
            Action actionJ = bookmark.j();
            int iS = (actionJ == null || !actionJ.v() || (destinationR = actionJ.r()) == null || !destinationR.m()) ? -1 : destinationR.k().s();
            if (iS < 0) {
                nd.a.e("nas_book", "PDFTronZReader->traverseBookmarks 章节页码获取失败 title=" + strU + " pageNum=" + iS);
            } else {
                Intrinsics.checkNotNull(strU);
                list.add(X(strU, iS, i));
            }
            if (bookmark.w()) {
                Bookmark bookmarkL = bookmark.l();
                Intrinsics.checkNotNullExpressionValue(bookmarkL, "getFirstChild(...)");
                l0(bookmarkL, i + 1, list);
            }
            bookmark = bookmark.p();
            Intrinsics.checkNotNullExpressionValue(bookmark, "getNext(...)");
        }
    }

    public final void Z(int i, @l com.zentraedi.reader.g gVar) {
        Bitmap bitmapY;
        if (i < 1 || i > a0()) {
            nd.a.h("nas_book", "PDFTronZReader->getPageBitmap 页码有误 fileName=" + this.n + " pageNumber=" + i + " fileName");
            if (gVar != null) {
                gVar.a(i, 0, 0);
            }
            if (gVar != null) {
                gVar.b(i, null);
                return;
            }
            return;
        }
        Bitmap bitmap = this.l.get(Integer.valueOf(i));
        if (bitmap != null && !bitmap.isRecycled()) {
            nd.a.e("nas_book", "PDFTronZReader->getPageBitmap 内存缓存 fileName=" + this.n + " pageNumber=" + i);
            if (gVar != null) {
                gVar.a(i, bitmap.getWidth(), bitmap.getHeight());
            }
            if (gVar != null) {
                gVar.b(i, bitmap);
                return;
            }
            return;
        }
        File file = new File(g0(), this.o);
        if (file.exists()) {
            File file2 = new File(file, i + ".jpg");
            if (file2.exists() && file2.lastModified() > this.p && (bitmapY = Y(file2, 12000000L, ConstantsKt.DEFAULT_BUFFER_SIZE)) != null) {
                this.l.put(Integer.valueOf(i), bitmapY);
                if (gVar != null) {
                    gVar.a(i, bitmapY.getWidth(), bitmapY.getHeight());
                }
                if (gVar != null) {
                    gVar.b(i, bitmapY);
                }
                nd.a.e("nas_book", "PDFTronZReader->getPageBitmap 文件缓存 fileName=" + this.n + " pageNumber=" + i);
                return;
            }
        }
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + PDFTronZReader.class + ' ' + Thread.currentThread().getName());
        kotlinx.coroutines.i.e(r0.a(g1.a().plus(new a(CoroutineExceptionHandler.F2, this, i, gVar))), (CoroutineContext) null, (CoroutineStart) null, new PDFTronZReader$getPageBitmap$$inlined$coroutineDefaultWithMain$2(this, PDFTronZReader.class, null, i, gVar, this, i, gVar), 3, (Object) null);
    }

    public final int a0() {
        PDFDoc pDFDoc = this.g;
        if (pDFDoc != null) {
            return pDFDoc.a3();
        }
        return 0;
    }

    @Override // com.zentraedi.outreader.reader.h, com.zentraedi.reader.i
    public int b() {
        return a0();
    }

    public final void b0(int i, @l com.zentraedi.reader.g gVar) {
        Bitmap bitmapY;
        if (i < 1 || i > a0()) {
            nd.a.h("nas_book", "PDFTronZReader->getPagePreviewBitmap 页码有误 fileName=" + this.n + " pageNumber=" + i + " fileName");
            if (gVar != null) {
                gVar.a(i, 0, 0);
            }
            if (gVar != null) {
                gVar.b(i, null);
                return;
            }
            return;
        }
        Bitmap bitmap = this.k.get(Integer.valueOf(i));
        if (bitmap != null && !bitmap.isRecycled()) {
            nd.a.e("nas_book", "PDFTronZReader->getPagePreviewBitmap 内存缓存 fileName=" + this.n + " pageNumber=" + i);
            if (gVar != null) {
                gVar.a(i, bitmap.getWidth(), bitmap.getHeight());
            }
            if (gVar != null) {
                gVar.b(i, bitmap);
                return;
            }
            return;
        }
        File file = new File(d0(), this.o);
        if (file.exists()) {
            File file2 = new File(file, i + ".jpg");
            if (file2.exists() && file2.lastModified() > this.p && (bitmapY = Y(file2, 2000000L, 4096)) != null) {
                this.k.put(Integer.valueOf(i), bitmapY);
                if (gVar != null) {
                    gVar.a(i, bitmapY.getWidth(), bitmapY.getHeight());
                }
                if (gVar != null) {
                    gVar.b(i, bitmapY);
                }
                nd.a.e("nas_book", "PDFTronZReader->getPagePreviewBitmap 文件缓存 fileName=" + this.n + " pageNumber=" + i);
                return;
            }
        }
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + PDFTronZReader.class + ' ' + Thread.currentThread().getName());
        kotlinx.coroutines.i.e(r0.a(g1.a().plus(new c(CoroutineExceptionHandler.F2, this, i, gVar))), (CoroutineContext) null, (CoroutineStart) null, new PDFTronZReader$getPagePreviewBitmap$$inlined$coroutineDefaultWithMain$2(this, PDFTronZReader.class, null, i, gVar, this, i, gVar), 3, (Object) null);
    }

    @l
    public final Pair<Integer, Integer> c0(int i) {
        Pair<Integer, Integer> pair;
        Page pageZ2;
        Integer numValueOf;
        Integer numValueOf2;
        synchronized (this.f) {
            try {
                PDFDoc pDFDoc = this.g;
                if (pDFDoc == null || (pageZ2 = pDFDoc.Z2(i)) == null) {
                    pair = null;
                } else {
                    int iCoerceAtLeast = RangesKt.coerceAtLeast((int) pageZ2.y(1), 1);
                    int iCoerceAtLeast2 = RangesKt.coerceAtLeast((int) pageZ2.w(1), 1);
                    if (pageZ2.A() == 1 || pageZ2.A() == 3) {
                        numValueOf = Integer.valueOf(iCoerceAtLeast2);
                        numValueOf2 = Integer.valueOf(iCoerceAtLeast);
                    } else {
                        numValueOf = Integer.valueOf(iCoerceAtLeast);
                        numValueOf2 = Integer.valueOf(iCoerceAtLeast2);
                    }
                    pair = TuplesKt.to(numValueOf, numValueOf2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pair;
    }

    @k
    public final String d0() {
        String str = this.q;
        if (str.length() != 0) {
            return str;
        }
        return com.zentraedi.basic.function.utils.a.a().getCacheDir().getAbsolutePath() + "/pdf_tron/preview/";
    }

    @Override // com.zentraedi.outreader.reader.h, com.zentraedi.reader.i
    @k
    public List<LocalPdfBookModel.LocalPdfChapter> e() {
        if (!this.j.isEmpty()) {
            return this.j;
        }
        Bookmark bookmark = this.h;
        if (bookmark == null) {
            return this.j;
        }
        if (bookmark == null) {
            Intrinsics.throwUninitializedPropertyAccessException("firstBookmark");
            bookmark = null;
        }
        l0(bookmark, 0, this.j);
        nd.a.e("nas_book", "PDFTronZReader->getBookChapters 读取到的章节信息 " + this.j);
        if (this.j.isEmpty()) {
            String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.rB);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            LocalPdfBookModel.LocalPdfChapter localPdfChapterX = X(strN, 1, 0);
            localPdfChapterX.setAddByDefault(true);
            this.j.add(localPdfChapterX);
        } else if (this.j.get(0).getPage() > 1) {
            String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.rB);
            Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
            LocalPdfBookModel.LocalPdfChapter localPdfChapterX2 = X(strN2, 1, 0);
            localPdfChapterX2.setAddByDefault(true);
            this.j.add(0, localPdfChapterX2);
        }
        return this.j;
    }

    @Override // com.zentraedi.outreader.reader.h, com.zentraedi.reader.i
    public void g(int i, @k com.zentraedi.reader.g onDrawListener) {
        Intrinsics.checkNotNullParameter(onDrawListener, "onDrawListener");
        super.g(i, onDrawListener);
        b0(i, onDrawListener);
    }

    @k
    public final String g0() {
        String str = this.r;
        if (str.length() != 0) {
            return str;
        }
        return com.zentraedi.basic.function.utils.a.a().getCacheDir().getAbsolutePath() + "/pdf_tron/read/";
    }

    @Override // com.zentraedi.reader.i
    @l
    public Object h(@k String str, @k Continuation<? super Result<? extends OpenFileResult>> continuation) {
        File file = new File(str);
        if (!file.exists()) {
            nd.a.c(h.b, "openFile->file is not exists");
            Result.Companion companion = Result.Companion;
            return Result.m6constructorimpl(OpenFileResult.FILE_NOT_EXISTS);
        }
        try {
            Context contextA = com.zentraedi.basic.function.utils.a.a();
            Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext(...)");
            com.zentraedi.zspace.pdftron.c.a(contextA);
            synchronized (this.f) {
                try {
                    PDFDoc pDFDoc = this.g;
                    if (pDFDoc != null) {
                        pDFDoc.close();
                    }
                    this.g = new PDFDoc(new FileInputStream(file));
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.m = str;
            String strA = r.a(str);
            Intrinsics.checkNotNullExpressionValue(strA, "md5(...)");
            this.o = strA;
            String strR = l5.r(str);
            Intrinsics.checkNotNullExpressionValue(strR, "getFileName(...)");
            this.n = strR;
            this.p = file.lastModified();
            PDFDoc pDFDoc2 = this.g;
            Boolean boolBoxBoolean = pDFDoc2 != null ? Boxing.boxBoolean(pDFDoc2.w4()) : null;
            nd.a.e("nas_book", "PDFTronZReader->openFile security=" + boolBoxBoolean + " pageCount=" + a0() + " filePath=" + str);
            if (Intrinsics.areEqual(boolBoxBoolean, Boxing.boxBoolean(false))) {
                nd.a.c(h.b, "openFile->security is false");
                Result.Companion companion2 = Result.Companion;
                return Result.m6constructorimpl(OpenFileResult.PASSWORD_REQUIRED);
            }
            PDFDoc pDFDoc3 = this.g;
            Bookmark bookmarkH2 = pDFDoc3 != null ? pDFDoc3.H2() : null;
            if (bookmarkH2 == null || !bookmarkH2.y()) {
                nd.a.c("nas_book", "PDFTronZReader->openFile isValid=false");
            } else {
                nd.a.e("nas_book", "PDFTronZReader->openFile isValid=" + bookmarkH2.y() + " isOpen=" + bookmarkH2.x());
            }
            if (bookmarkH2 == null) {
                nd.a.c("nas_book", "PDFTronZReader->openFile rootBookmark null");
                Result.Companion companion3 = Result.Companion;
                return Result.m6constructorimpl(OpenFileResult.CORRUPTED_FILE);
            }
            List<ChapterM.Chapter> list = this.i;
            if (list != null) {
                list.clear();
            }
            this.j.clear();
            this.h = bookmarkH2;
            Result.Companion companion4 = Result.Companion;
            return Result.m6constructorimpl(OpenFileResult.SUCCESS);
        } catch (Exception e2) {
            nd.a.c("nas_book", "PDFTronZReader->openFile exception: " + e2.getMessage());
            Result.Companion companion5 = Result.Companion;
            return Result.m6constructorimpl(ResultKt.createFailure(e2));
        }
    }

    @l
    public final Bitmap i0(int i, @k Rect region, int i2, int i3) {
        Bitmap bitmap;
        Page pageZ2;
        PDFRasterizer pDFRasterizer;
        Intrinsics.checkNotNullParameter(region, "region");
        synchronized (this.f) {
            bitmap = null;
            if (1 <= i2 && i2 < 513 && 1 <= i3 && i3 < 513) {
                try {
                    PDFDoc pDFDoc = this.g;
                    if (pDFDoc != null && (pageZ2 = pDFDoc.Z2(i)) != null) {
                        Matrix2D matrix2DR = pageZ2.r(true, 1, 0);
                        try {
                            matrix2DR.E0(-region.left, -region.top);
                            Matrix2D matrix2D = new Matrix2D(((double) i2) / ((double) region.width()), 0.0d, 0.0d, ((double) i3) / ((double) region.height()), 0.0d, 0.0d);
                            try {
                                Matrix2D matrix2DQ = matrix2D.Q(matrix2DR);
                                try {
                                    int[] iArr = new int[i2 * i3];
                                    PDFRasterizer pDFRasterizer2 = new PDFRasterizer();
                                    try {
                                        pDFRasterizer2.y(true);
                                        pDFRasterizer2.a0(true);
                                        pDFRasterizer2.Q(true);
                                        pDFRasterizer = pDFRasterizer2;
                                        try {
                                            pDFRasterizer.v(pageZ2, iArr, i2, i3, true, matrix2DQ, (com.pdftron.pdf.Rect) null);
                                            Unit unit = Unit.INSTANCE;
                                            AutoCloseableKt.closeFinally(pDFRasterizer, null);
                                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i2, i3, Bitmap.Config.ARGB_8888);
                                            AutoCloseableKt.closeFinally(matrix2DQ, null);
                                            AutoCloseableKt.closeFinally(matrix2D, null);
                                            AutoCloseableKt.closeFinally(matrix2DR, null);
                                            bitmap = bitmapCreateBitmap;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            Throwable th3 = th;
                                            try {
                                                throw th3;
                                            } catch (Throwable th4) {
                                                AutoCloseableKt.closeFinally(pDFRasterizer, th3);
                                                throw th4;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        pDFRasterizer = pDFRasterizer2;
                                    }
                                } catch (Throwable th6) {
                                    try {
                                        throw th6;
                                    } catch (Throwable th7) {
                                        AutoCloseableKt.closeFinally(matrix2DQ, th6);
                                        throw th7;
                                    }
                                }
                            } catch (Throwable th8) {
                                try {
                                    throw th8;
                                } catch (Throwable th9) {
                                    AutoCloseableKt.closeFinally(matrix2D, th8);
                                    throw th9;
                                }
                            }
                        } catch (Throwable th10) {
                            try {
                                throw th10;
                            } catch (Throwable th11) {
                                AutoCloseableKt.closeFinally(matrix2DR, th10);
                                throw th11;
                            }
                        }
                    }
                } catch (Throwable th12) {
                    throw th12;
                }
            }
        }
        return bitmap;
    }

    public final void j0(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.q = str;
    }

    @Override // com.zentraedi.outreader.reader.h, com.zentraedi.reader.i
    public void k(int i, @k com.zentraedi.reader.g onDrawListener) {
        Intrinsics.checkNotNullParameter(onDrawListener, "onDrawListener");
        super.k(i, onDrawListener);
        Z(i, onDrawListener);
    }

    public final void k0(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.r = str;
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object m(@k Continuation<? super List<? extends ChapterM.Chapter>> continuation) {
        List<ChapterM.Chapter> list = this.i;
        if (list != null && !list.isEmpty()) {
            List<ChapterM.Chapter> list2 = this.i;
            return list2 == null ? CollectionsKt.emptyList() : list2;
        }
        ArrayList arrayList = new ArrayList();
        if (this.h != null) {
            List<LocalPdfBookModel.LocalPdfChapter> listE = e();
            if (!listE.isEmpty()) {
                int i = 0;
                for (LocalPdfBookModel.LocalPdfChapter localPdfChapter : listE) {
                    ChapterM.Chapter chapter = new ChapterM.Chapter();
                    chapter.volumeName = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.gC2);
                    chapter.name = F(localPdfChapter.getLevel()) + localPdfChapter.getTitle();
                    chapter.f985id = String.valueOf(i);
                    chapter.isCache = true;
                    chapter.page = localPdfChapter.getPage();
                    arrayList.add(chapter);
                    i++;
                }
                this.i = arrayList;
                return arrayList;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // com.zentraedi.outreader.reader.d, com.zentraedi.reader.i
    public void onDestroy() {
        super.onDestroy();
        nd.a.h("nas_book", "PDFTronZReader->onDestroy filePathMd5=" + this.o + " filePath=" + this.m);
        this.l.evictAll();
        this.k.evictAll();
        synchronized (this.f) {
            try {
                PDFDoc pDFDoc = this.g;
                if (pDFDoc != null) {
                    pDFDoc.close();
                }
                this.g = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + PDFTronZReader.class + ' ' + Thread.currentThread().getName());
        kotlinx.coroutines.i.e(r0.a(g1.a().plus(new e(CoroutineExceptionHandler.F2))), (CoroutineContext) null, (CoroutineStart) null, new PDFTronZReader$onDestroy$$inlined$coroutineDefaultWithMain$2(this, PDFTronZReader.class, null), 3, (Object) null);
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Fragment q() {
        if (this.g == null) {
            return null;
        }
        return t.r.a();
    }

    @Override // com.zentraedi.outreader.reader.d, com.zentraedi.outreader.reader.h
    @k
    public List<Integer> r() {
        return CollectionsKt.listOf((Object[]) new Integer[]{1, 2, 3, 5});
    }

    @Override // com.zentraedi.outreader.reader.d, com.zentraedi.outreader.reader.h
    public void z(int i) {
    }
}
