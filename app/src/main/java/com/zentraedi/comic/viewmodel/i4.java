package com.zentraedi.comic.viewmodel;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.tencent.tbs.one.TBSOneErrorCodes;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.request.Bookmark;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.comic.DownLoadFileState;
import com.zentraedi.comic.adapter.ComicItemType;
import com.zentraedi.outreader.reader.PDFTronZReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicPdfReaderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicPdfReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicPdfReaderViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,386:1\n1878#2,3:387\n1869#2,2:390\n1669#2,8:392\n1669#2,8:400\n1669#2,8:408\n230#2,2:416\n*S KotlinDebug\n*F\n+ 1 ComicPdfReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicPdfReaderViewModel\n*L\n61#1:387,3\n80#1:390,2\n87#1:392,8\n91#1:400,8\n95#1:408,8\n156#1:416,2\n*E\n"})
public final class i4 extends com.zentraedi.basic.function.viewmodel.e implements gg.a {

    @fo.l
    private Activity e;

    @fo.l
    private com.zentraedi.comic.view.e0 f;

    @fo.l
    private m6 i;

    @fo.l
    private FileInfoModel j;

    @fo.k
    private final LinkedList<FileInfoModel> a = new LinkedList<>();

    @fo.k
    private com.zentraedi.comic.adapter.g0 b = new com.zentraedi.comic.adapter.g0();

    @fo.k
    private com.zentraedi.comic.adapter.k0 c = new com.zentraedi.comic.adapter.k0();

    @fo.k
    private final a0 d = new a0();
    private int g = -1;

    @fo.k
    private final ArrayList<m6> h = new ArrayList<>();

    @fo.k
    private final RecyclerView.OnScrollListener k = new g();

    public static final class a implements com.zentraedi.comic.adapter.b0 {
        final /* synthetic */ Function2<Integer, String, Unit> a;
        final /* synthetic */ i4 b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Integer, ? super String, Unit> function2, i4 i4Var) {
            this.a = function2;
            this.b = i4Var;
        }

        @Override // com.zentraedi.comic.adapter.b0
        public void a(int i) {
            String name;
            Function2<Integer, String, Unit> function2 = this.a;
            Integer numValueOf = Integer.valueOf(i);
            FileInfoModel fileInfoModelS0 = this.b.s0();
            if (fileInfoModelS0 == null || (name = fileInfoModelS0.getName()) == null) {
                name = "";
            }
            function2.invoke(numValueOf, name);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicPdfReaderViewModel$continueReade$1$1$1", f = "ComicPdfReaderViewModel.kt", i = {0}, l = {TBSOneErrorCodes.EXTRACT_COMPONENT_FILES_FAILED}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
    @SourceDebugExtension({"SMAP\nComicPdfReaderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicPdfReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicPdfReaderViewModel$continueReade$1$1$1\n+ 2 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt\n*L\n1#1,386:1\n179#2,8:387\n*S KotlinDebug\n*F\n+ 1 ComicPdfReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicPdfReaderViewModel$continueReade$1$1$1\n*L\n317#1:387,8\n*E\n"})
    static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ String c;
        final /* synthetic */ i4 d;
        final /* synthetic */ Activity e;
        final /* synthetic */ int f;
        final /* synthetic */ Function2<Boolean, String, Unit> g;

        @SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt$withMain$1\n+ 2 ComicPdfReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicPdfReaderViewModel$continueReade$1$1$1\n*L\n1#1,778:1\n318#2,4:779\n*E\n"})
        public static final class a implements Function0<Unit> {
            final /* synthetic */ Object a;
            final /* synthetic */ com.zentraedi.outreader.reader.h b;
            final /* synthetic */ i4 c;
            final /* synthetic */ Activity d;
            final /* synthetic */ int e;
            final /* synthetic */ Function2 f;

            public a(Object obj, com.zentraedi.outreader.reader.h hVar, i4 i4Var, Activity activity, int i, Function2 function2) {
                this.a = obj;
                this.b = hVar;
                this.c = i4Var;
                this.d = activity;
                this.e = i;
                this.f = function2;
            }

            public final void a() {
                String name;
                com.zentraedi.outreader.reader.h hVar = this.b;
                if (hVar instanceof PDFTronZReader) {
                    i4 i4Var = this.c;
                    i4Var.z0(hVar, this.d, this.e, ComicItemType.COMIC_ITEM_TYPE_PDF, i4Var.y0());
                    Function2 function2 = this.f;
                    Boolean bool = Boolean.TRUE;
                    FileInfoModel fileInfoModelS0 = this.c.s0();
                    if (fileInfoModelS0 == null || (name = fileInfoModelS0.getName()) == null) {
                        name = "";
                    }
                    function2.invoke(bool, name);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, i4 i4Var, Activity activity, int i, Function2<? super Boolean, ? super String, Unit> function2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = i4Var;
            this.e = activity;
            this.f = i;
            this.g = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.c, this.d, this.e, this.f, this.g, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String name;
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.zentraedi.comic.util.k kVar = com.zentraedi.comic.util.k.a;
                String str = this.c;
                ComicItemType comicItemType = ComicItemType.COMIC_ITEM_TYPE_PDF;
                this.b = q0Var;
                this.a = 1;
                obj = kVar.a(str, comicItemType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.zentraedi.outreader.reader.h hVar = (com.zentraedi.outreader.reader.h) obj;
            i4 i4Var = this.d;
            Activity activity = this.e;
            int i2 = this.f;
            Function2<Boolean, String, Unit> function2 = this.g;
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                pe.i.r(new a(q0Var, hVar, i4Var, activity, i2, function2));
            } else if (hVar instanceof PDFTronZReader) {
                i4Var.z0(hVar, activity, i2, ComicItemType.COMIC_ITEM_TYPE_PDF, i4Var.y0());
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                FileInfoModel fileInfoModelS0 = i4Var.s0();
                if (fileInfoModelS0 == null || (name = fileInfoModelS0.getName()) == null) {
                    name = "";
                }
                function2.invoke(boolBoxBoolean, name);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicPdfReaderViewModel$dataChangeOnItemRangeInserted$1$1", f = "ComicPdfReaderViewModel.kt", i = {0}, l = {167}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
    @SourceDebugExtension({"SMAP\nComicPdfReaderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicPdfReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicPdfReaderViewModel$dataChangeOnItemRangeInserted$1$1\n+ 2 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt\n*L\n1#1,386:1\n179#2,8:387\n*S KotlinDebug\n*F\n+ 1 ComicPdfReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicPdfReaderViewModel$dataChangeOnItemRangeInserted$1$1\n*L\n168#1:387,8\n*E\n"})
    static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ String c;
        final /* synthetic */ i4 d;
        final /* synthetic */ Activity e;
        final /* synthetic */ int f;
        final /* synthetic */ Function1<DownLoadFileState, Unit> g;

        @SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt$withMain$1\n+ 2 ComicPdfReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicPdfReaderViewModel$dataChangeOnItemRangeInserted$1$1\n*L\n1#1,778:1\n169#2,7:779\n*E\n"})
        public static final class a implements Function0<Unit> {
            final /* synthetic */ Object a;
            final /* synthetic */ com.zentraedi.outreader.reader.h b;
            final /* synthetic */ String c;
            final /* synthetic */ i4 d;
            final /* synthetic */ Activity e;
            final /* synthetic */ int f;
            final /* synthetic */ Function1 g;

            public a(Object obj, com.zentraedi.outreader.reader.h hVar, String str, i4 i4Var, Activity activity, int i, Function1 function1) {
                this.a = obj;
                this.b = hVar;
                this.c = str;
                this.d = i4Var;
                this.e = activity;
                this.f = i;
                this.g = function1;
            }

            public final void a() {
                StringBuilder sb = new StringBuilder();
                sb.append("openComic result=");
                com.zentraedi.outreader.reader.h hVar = this.b;
                sb.append(hVar != null ? hVar.getClass().getSimpleName() : null);
                sb.append(" path=");
                sb.append(this.c);
                nd.a.e("ComicPdfReaderVM", sb.toString());
                com.zentraedi.outreader.reader.h hVar2 = this.b;
                if (hVar2 instanceof PDFTronZReader) {
                    i4 i4Var = this.d;
                    i4Var.z0(hVar2, this.e, this.f, ComicItemType.COMIC_ITEM_TYPE_PDF, i4Var.y0());
                    nd.a.e("ComicPdfReaderVM", "initPDFAdapter done pageCount=" + ((PDFTronZReader) this.b).b() + " location=" + this.f + " path=" + this.c);
                    this.d.d.o0(com.zentraedi.comic.m.o(((PDFTronZReader) this.b).b()));
                    this.g.invoke(DownLoadFileState.SUCCESS);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, i4 i4Var, Activity activity, int i, Function1<? super DownLoadFileState, Unit> function1, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = i4Var;
            this.e = activity;
            this.f = i;
            this.g = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.c, this.d, this.e, this.f, this.g, continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.zentraedi.comic.util.k kVar = com.zentraedi.comic.util.k.a;
                String str = this.c;
                ComicItemType comicItemType = ComicItemType.COMIC_ITEM_TYPE_PDF;
                this.b = q0Var;
                this.a = 1;
                obj = kVar.a(str, comicItemType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.zentraedi.outreader.reader.h hVar = (com.zentraedi.outreader.reader.h) obj;
            String str2 = this.c;
            i4 i4Var = this.d;
            Activity activity = this.e;
            int i2 = this.f;
            Function1<DownLoadFileState, Unit> function1 = this.g;
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                StringBuilder sb = new StringBuilder();
                sb.append("openComic result=");
                sb.append(hVar != null ? hVar.getClass().getSimpleName() : null);
                sb.append(" path=");
                sb.append(str2);
                nd.a.e("ComicPdfReaderVM", sb.toString());
                if (hVar instanceof PDFTronZReader) {
                    i4Var.z0(hVar, activity, i2, ComicItemType.COMIC_ITEM_TYPE_PDF, i4Var.y0());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("initPDFAdapter done pageCount=");
                    PDFTronZReader pDFTronZReader = (PDFTronZReader) hVar;
                    sb2.append(pDFTronZReader.b());
                    sb2.append(" location=");
                    sb2.append(i2);
                    sb2.append(" path=");
                    sb2.append(str2);
                    nd.a.e("ComicPdfReaderVM", sb2.toString());
                    i4Var.d.o0(com.zentraedi.comic.m.o(pDFTronZReader.b()));
                    function1.invoke(DownLoadFileState.SUCCESS);
                }
            } else {
                pe.i.r(new a(q0Var, hVar, str2, i4Var, activity, i2, function1));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class d extends RecyclerView.ItemDecoration {
        d() {
        }

        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            outRect.right = com.zentraedi.basic.function.utils.m0.b(10.0f);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicPdfReaderViewModel$loadLastPageData$1$1$1", f = "ComicPdfReaderViewModel.kt", i = {0}, l = {243}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
    @SourceDebugExtension({"SMAP\nComicPdfReaderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicPdfReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicPdfReaderViewModel$loadLastPageData$1$1$1\n+ 2 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt\n*L\n1#1,386:1\n179#2,8:387\n*S KotlinDebug\n*F\n+ 1 ComicPdfReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicPdfReaderViewModel$loadLastPageData$1$1$1\n*L\n244#1:387,8\n*E\n"})
    static final class e extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ String c;
        final /* synthetic */ i4 d;
        final /* synthetic */ int e;
        final /* synthetic */ Function1<DownLoadFileState, Unit> f;

        @SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt$withMain$1\n+ 2 ComicPdfReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicPdfReaderViewModel$loadLastPageData$1$1$1\n*L\n1#1,778:1\n245#2,12:779\n*E\n"})
        public static final class a implements Function0<Unit> {
            final /* synthetic */ Object a;
            final /* synthetic */ com.zentraedi.outreader.reader.h b;
            final /* synthetic */ i4 c;
            final /* synthetic */ int d;
            final /* synthetic */ Function1 e;

            public a(Object obj, com.zentraedi.outreader.reader.h hVar, i4 i4Var, int i, Function1 function1) {
                this.a = obj;
                this.b = hVar;
                this.c = i4Var;
                this.d = i;
                this.e = function1;
            }

            public final void a() {
                if (this.b instanceof PDFTronZReader) {
                    this.c.u0().F0(this.c.q0(), this.b, this.c.y0());
                    this.c.k0(((PDFTronZReader) this.b).a0(), this.d);
                    this.c.d.o0(com.zentraedi.comic.m.o(((PDFTronZReader) this.b).b()));
                    ArrayList<m6> arrayListW0 = this.c.w0();
                    if (arrayListW0 != null) {
                        this.c.u0().N(arrayListW0);
                    }
                    this.e.invoke(DownLoadFileState.SUCCESS);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(String str, i4 i4Var, int i, Function1<? super DownLoadFileState, Unit> function1, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = i4Var;
            this.e = i;
            this.f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.c, this.d, this.e, this.f, continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.zentraedi.comic.util.k kVar = com.zentraedi.comic.util.k.a;
                String str = this.c;
                ComicItemType comicItemType = ComicItemType.COMIC_ITEM_TYPE_PDF;
                this.b = q0Var;
                this.a = 1;
                obj = kVar.a(str, comicItemType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.zentraedi.outreader.reader.h hVar = (com.zentraedi.outreader.reader.h) obj;
            i4 i4Var = this.d;
            int i2 = this.e;
            Function1<DownLoadFileState, Unit> function1 = this.f;
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                pe.i.r(new a(q0Var, hVar, i4Var, i2, function1));
            } else if (hVar instanceof PDFTronZReader) {
                i4Var.u0().F0(i4Var.q0(), hVar, i4Var.y0());
                PDFTronZReader pDFTronZReader = (PDFTronZReader) hVar;
                i4Var.k0(pDFTronZReader.a0(), i2);
                i4Var.d.o0(com.zentraedi.comic.m.o(pDFTronZReader.b()));
                ArrayList<m6> arrayListW0 = i4Var.w0();
                if (arrayListW0 != null) {
                    i4Var.u0().N(arrayListW0);
                }
                function1.invoke(DownLoadFileState.SUCCESS);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((e) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicPdfReaderViewModel$loadNextPageData$1$1$1", f = "ComicPdfReaderViewModel.kt", i = {0}, l = {215}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
    @SourceDebugExtension({"SMAP\nComicPdfReaderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicPdfReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicPdfReaderViewModel$loadNextPageData$1$1$1\n+ 2 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt\n*L\n1#1,386:1\n179#2,8:387\n*S KotlinDebug\n*F\n+ 1 ComicPdfReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicPdfReaderViewModel$loadNextPageData$1$1$1\n*L\n216#1:387,8\n*E\n"})
    static final class f extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ String c;
        final /* synthetic */ i4 d;
        final /* synthetic */ int e;
        final /* synthetic */ Function1<DownLoadFileState, Unit> f;

        @SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt$withMain$1\n+ 2 ComicPdfReaderViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicPdfReaderViewModel$loadNextPageData$1$1$1\n*L\n1#1,778:1\n217#2,12:779\n*E\n"})
        public static final class a implements Function0<Unit> {
            final /* synthetic */ Object a;
            final /* synthetic */ com.zentraedi.outreader.reader.h b;
            final /* synthetic */ i4 c;
            final /* synthetic */ int d;
            final /* synthetic */ Function1 e;

            public a(Object obj, com.zentraedi.outreader.reader.h hVar, i4 i4Var, int i, Function1 function1) {
                this.a = obj;
                this.b = hVar;
                this.c = i4Var;
                this.d = i;
                this.e = function1;
            }

            public final void a() {
                if (this.b instanceof PDFTronZReader) {
                    this.c.u0().F0(this.c.q0(), this.b, this.c.y0());
                    this.c.k0(((PDFTronZReader) this.b).a0(), this.d);
                    this.c.d.o0(com.zentraedi.comic.m.o(((PDFTronZReader) this.b).b()));
                    ArrayList<m6> arrayListW0 = this.c.w0();
                    if (arrayListW0 != null) {
                        this.c.u0().N(arrayListW0);
                    }
                    this.e.invoke(DownLoadFileState.SUCCESS);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(String str, i4 i4Var, int i, Function1<? super DownLoadFileState, Unit> function1, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = i4Var;
            this.e = i;
            this.f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.c, this.d, this.e, this.f, continuation);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.zentraedi.comic.util.k kVar = com.zentraedi.comic.util.k.a;
                String str = this.c;
                ComicItemType comicItemType = ComicItemType.COMIC_ITEM_TYPE_PDF;
                this.b = q0Var;
                this.a = 1;
                obj = kVar.a(str, comicItemType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.zentraedi.outreader.reader.h hVar = (com.zentraedi.outreader.reader.h) obj;
            i4 i4Var = this.d;
            int i2 = this.e;
            Function1<DownLoadFileState, Unit> function1 = this.f;
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                pe.i.r(new a(q0Var, hVar, i4Var, i2, function1));
            } else if (hVar instanceof PDFTronZReader) {
                i4Var.u0().F0(i4Var.q0(), hVar, i4Var.y0());
                PDFTronZReader pDFTronZReader = (PDFTronZReader) hVar;
                i4Var.k0(pDFTronZReader.a0(), i2);
                i4Var.d.o0(com.zentraedi.comic.m.o(pDFTronZReader.b()));
                ArrayList<m6> arrayListW0 = i4Var.w0();
                if (arrayListW0 != null) {
                    i4Var.u0().N(arrayListW0);
                }
                function1.invoke(DownLoadFileState.SUCCESS);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((f) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class g extends RecyclerView.OnScrollListener {
        g() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if ((recyclerView instanceof com.zentraedi.comic.view.e0) && com.zentraedi.comic.w.j(recyclerView) != -1 && com.zentraedi.comic.w.j(recyclerView) < i4.this.w0().size()) {
                i4 i4Var = i4.this;
                i4Var.J0(i4Var.w0().get(com.zentraedi.comic.w.j(recyclerView)));
                if (com.zentraedi.comic.w.j(recyclerView) < i4.this.x0().size() && i4.this.x0().get(i4.this.p0(com.zentraedi.comic.w.j(recyclerView))) != null) {
                    i4 i4Var2 = i4.this;
                    i4Var2.K0(i4Var2.x0().get(i4.this.p0(com.zentraedi.comic.w.j(recyclerView))));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A0(i4 i4Var, int i, Function1 function1, String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        kotlinx.coroutines.i.e(androidx.lifecycle.j2.a(i4Var), (CoroutineContext) null, (CoroutineStart) null, new e(path, i4Var, i, function1, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B0(Function1 function1) {
        function1.invoke(DownLoadFileState.FAIL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C0(Function1 function1, String str) {
        function1.invoke(DownLoadFileState.WAIT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D0(String str) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E0(i4 i4Var, int i, Function1 function1, String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        kotlinx.coroutines.i.e(androidx.lifecycle.j2.a(i4Var), (CoroutineContext) null, (CoroutineStart) null, new f(path, i4Var, i, function1, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F0(Function1 function1) {
        function1.invoke(DownLoadFileState.FAIL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G0(Function1 function1, String str) {
        function1.invoke(DownLoadFileState.WAIT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H0(String str) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(RecyclerView recyclerView, int i, i4 i4Var) {
        recyclerView.scrollToPosition((int) ((i / 100.0f) * (i4Var.c.getItemCount() - 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(i4 i4Var, Activity activity, int i, Function2 function2, String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        kotlinx.coroutines.i.e(androidx.lifecycle.j2.a(i4Var), (CoroutineContext) null, (CoroutineStart) null, new b(path, i4Var, activity, i, function2, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(Function2 function2) {
        function2.invoke(Boolean.TRUE, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(Function2 function2, String str) {
        function2.invoke(Boolean.FALSE, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(String str) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(int i, int i2) {
        this.h.clear();
        for (int i3 = 0; i3 < i; i3++) {
            ArrayList<m6> arrayList = this.h;
            m6 m6Var = new m6();
            m6Var.setPosition(i3);
            m6Var.j(i);
            m6Var.l(i2);
            arrayList.add(m6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(i4 i4Var, Activity activity, int i, Function1 function1, String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        StringBuilder sb = new StringBuilder();
        sb.append("analysisPdf success path=");
        sb.append(path);
        sb.append(" currentFile=");
        FileInfoModel fileInfoModel = i4Var.j;
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        nd.a.e("ComicPdfReaderVM", sb.toString());
        kotlinx.coroutines.i.e(androidx.lifecycle.j2.a(i4Var), (CoroutineContext) null, (CoroutineStart) null, new c(path, i4Var, activity, i, function1, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(i4 i4Var, Function1 function1) {
        StringBuilder sb = new StringBuilder();
        sb.append("analysisPdf failed currentFile=");
        FileInfoModel fileInfoModel = i4Var.j;
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        nd.a.c("ComicPdfReaderVM", sb.toString());
        function1.invoke(DownLoadFileState.FAIL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(i4 i4Var, Function1 function1, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("analysisPdf waiting download currentFile=");
        FileInfoModel fileInfoModel = i4Var.j;
        sb.append(fileInfoModel != null ? fileInfoModel.getPath() : null);
        nd.a.a("ComicPdfReaderVM", sb.toString());
        function1.invoke(DownLoadFileState.WAIT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int p0(int i) {
        if (this.h.size() == 0) {
            return 0;
        }
        return this.h.get(i).g();
    }

    @Override // gg.a
    public void C(@fo.l FileInfoModel fileInfoModel, final int i, @fo.k final Function1<? super DownLoadFileState, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activity = this.e;
        if (activity != null) {
            com.zentraedi.comic.m.h(fileInfoModel, this.g, new Function1() { // from class: com.zentraedi.comic.viewmodel.g4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i4.A0(this.a, i, callback, (String) obj);
                }
            }, new Function0() { // from class: com.zentraedi.comic.viewmodel.h4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i4.B0(callback);
                }
            }, new Function1() { // from class: com.zentraedi.comic.viewmodel.t3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i4.C0(callback, (String) obj);
                }
            }, new Function1() { // from class: com.zentraedi.comic.viewmodel.u3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i4.D0((String) obj);
                }
            }, activity);
        }
    }

    @Override // gg.a
    public void H() {
        com.zentraedi.comic.adapter.g0 g0Var = this.b;
        if (g0Var != null) {
            g0Var.notifyDataSetChanged();
        }
    }

    @Override // gg.a
    public void I(@fo.k RecyclerView recyclerView, final int i, @fo.k final Function2<? super Boolean, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.b.E0();
        this.h.clear();
        FileInfoModel fileInfoModel = this.a.get(i);
        this.j = fileInfoModel;
        final Activity activity = this.e;
        if (activity != null) {
            com.zentraedi.comic.m.h(fileInfoModel, this.g, new Function1() { // from class: com.zentraedi.comic.viewmodel.s3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i4.f0(this.a, activity, i, callback, (String) obj);
                }
            }, new Function0() { // from class: com.zentraedi.comic.viewmodel.z3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i4.g0(callback);
                }
            }, new Function1() { // from class: com.zentraedi.comic.viewmodel.a4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i4.h0(callback, (String) obj);
                }
            }, new Function1() { // from class: com.zentraedi.comic.viewmodel.b4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i4.i0((String) obj);
                }
            }, activity);
        }
    }

    public final void I0(@fo.l Activity activity) {
        this.e = activity;
    }

    public final void J0(@fo.l m6 m6Var) {
        this.i = m6Var;
    }

    public final void K0(@fo.l FileInfoModel fileInfoModel) {
        this.j = fileInfoModel;
    }

    public final void L0(int i) {
        this.g = i;
    }

    public final void M0(@fo.k com.zentraedi.comic.adapter.g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<set-?>");
        this.b = g0Var;
    }

    public final void N0(@fo.k com.zentraedi.comic.adapter.k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<set-?>");
        this.c = k0Var;
    }

    public final void O0(@fo.l com.zentraedi.comic.view.e0 e0Var) {
        this.f = e0Var;
    }

    @Override // gg.a
    public int b(int i) {
        if (this.h.size() == 0) {
            return 0;
        }
        return i >= this.h.size() ? this.h.size() - 1 : this.h.get(i).getPosition();
    }

    @Override // gg.a
    @fo.k
    public com.zentraedi.comic.adapter.a d() {
        return this.b;
    }

    @Override // gg.a
    public void destroy() {
        this.c.O();
        this.b.k0();
        this.a.clear();
        this.h.clear();
        this.i = null;
        this.j = null;
    }

    @Override // gg.a
    public void f(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView instanceof com.zentraedi.comic.view.e0) {
            this.f = (com.zentraedi.comic.view.e0) recyclerView;
        }
        recyclerView.addOnScrollListener(this.k);
    }

    @Override // gg.a
    @fo.k
    public a0 g() {
        return this.d;
    }

    @Override // gg.a
    public void h(@fo.k final RecyclerView bottomMenuRecyclerView, final int i) {
        Intrinsics.checkNotNullParameter(bottomMenuRecyclerView, "bottomMenuRecyclerView");
        if (!Intrinsics.areEqual(this.c.P(), this.b.l0())) {
            this.c.O();
            this.c.T(this.e, this.b.l0());
            com.zentraedi.comic.adapter.k0 k0Var = this.c;
            com.zentraedi.outreader.reader.h hVarL0 = this.b.l0();
            ArrayList<m6> arrayListJ0 = j0(hVarL0 != null ? hVarL0.b() : 0);
            Intrinsics.checkNotNull(arrayListJ0, "null cannot be cast to non-null type kotlin.collections.List<androidx.databinding.BaseObservable>");
            k0Var.L(arrayListJ0);
        }
        bottomMenuRecyclerView.post(new Runnable() { // from class: com.zentraedi.comic.viewmodel.f4
            @Override // java.lang.Runnable
            public final void run() {
                i4.P0(bottomMenuRecyclerView, i, this);
            }
        });
    }

    @Override // gg.a
    public void i(@fo.k Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (layout == Layout.SINGLE) {
            ArrayList arrayList = new ArrayList();
            for (m6 m6Var : this.h) {
                arrayList.add(m6Var);
                arrayList.add(m6Var);
            }
            this.h.clear();
            this.h.addAll(arrayList);
        } else if (layout == Layout.DOUBLE_REVERSAL) {
            ArrayList<m6> arrayList2 = this.h;
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (hashSet.add(Integer.valueOf(((m6) obj).getPosition()))) {
                    arrayList3.add(obj);
                }
            }
            this.h.clear();
            this.h.addAll(arrayList3);
        } else if (layout == Layout.DOUBLE) {
            ArrayList<m6> arrayList4 = this.h;
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList4) {
                if (hashSet2.add(Integer.valueOf(((m6) obj2).getPosition()))) {
                    arrayList5.add(obj2);
                }
            }
            this.h.clear();
            this.h.addAll(arrayList5);
        } else {
            ArrayList<m6> arrayList6 = this.h;
            HashSet hashSet3 = new HashSet();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj3 : arrayList6) {
                if (hashSet3.add(Integer.valueOf(((m6) obj3).getPosition()))) {
                    arrayList7.add(obj3);
                }
            }
            this.h.clear();
            this.h.addAll(arrayList7);
        }
        this.c.L(this.h);
    }

    @fo.k
    public final ArrayList<m6> j0(int i) {
        ArrayList<m6> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < i; i2++) {
            m6 m6Var = new m6();
            m6Var.setPosition(i2);
            arrayList.add(m6Var);
        }
        return arrayList;
    }

    @Override // gg.a
    public void k(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.setAdapter(this.c);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setAddDuration(0L);
        }
        RecyclerView.ItemAnimator itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.setChangeDuration(0L);
        }
        RecyclerView.ItemAnimator itemAnimator3 = recyclerView.getItemAnimator();
        if (itemAnimator3 != null) {
            itemAnimator3.setMoveDuration(0L);
        }
        RecyclerView.ItemAnimator itemAnimator4 = recyclerView.getItemAnimator();
        if (itemAnimator4 != null) {
            itemAnimator4.setRemoveDuration(0L);
        }
        SimpleItemAnimator itemAnimator5 = recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator5, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        itemAnimator5.setSupportsChangeAnimations(false);
        recyclerView.addItemDecoration(new d());
    }

    public final void l0(@fo.l androidx.databinding.w<FileInfoModel> wVar) {
        if (wVar != null) {
            int i = 0;
            for (Object obj : wVar) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                this.a.addLast((FileInfoModel) obj);
                i = i2;
            }
        }
    }

    @Override // gg.a
    @fo.l
    public FileInfoModel n() {
        return this.j;
    }

    @Override // gg.a
    @fo.k
    public NasReadingRecordModule q() {
        String path;
        m6 m6Var = this.i;
        int position = m6Var != null ? m6Var.getPosition() : 0;
        m6 m6Var2 = this.i;
        int iE = m6Var2 != null ? m6Var2.e() : 0;
        FileInfoModel fileInfoModel = this.j;
        if (fileInfoModel == null || (path = fileInfoModel.getPath()) == null) {
            path = "";
        }
        NasReadingRecordModule nasReadingRecordModule = new NasReadingRecordModule();
        nasReadingRecordModule.setPosition(position);
        nasReadingRecordModule.setFilePath(path);
        nasReadingRecordModule.setCount(iE);
        nasReadingRecordModule.setReadModel(0);
        nasReadingRecordModule.setCurrentPath("");
        nasReadingRecordModule.setTime(System.currentTimeMillis());
        return nasReadingRecordModule;
    }

    @fo.l
    public final Activity q0() {
        return this.e;
    }

    @Override // gg.a
    public void r(@fo.l androidx.databinding.w<FileInfoModel> wVar, int i, int i2, @fo.k final Activity activity, @fo.k final Function1<? super DownLoadFileState, Unit> callback, @fo.k Function1<? super String, Unit> downloadProgress, @fo.l FileInfoModel fileInfoModel) {
        Exception exc;
        String path;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(downloadProgress, "downloadProgress");
        if (wVar != null) {
            l0(wVar);
        }
        this.e = activity;
        if (fileInfoModel != null) {
            this.j = fileInfoModel;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("dataChangeOnItemRangeInserted start senderSize=");
        sb.append(wVar != null ? wVar.size() : 0);
        sb.append(" currentFile=");
        FileInfoModel fileInfoModel2 = this.j;
        sb.append(fileInfoModel2 != null ? fileInfoModel2.getPath() : null);
        sb.append(" from=");
        sb.append(this.g);
        nd.a.e("ComicPdfReaderVM", sb.toString());
        try {
            for (Object obj : this.a) {
                try {
                    String path2 = ((FileInfoModel) obj).getPath();
                    FileInfoModel fileInfoModel3 = this.j;
                    if (fileInfoModel3 != null) {
                        try {
                            path = fileInfoModel3.getPath();
                        } catch (Exception e2) {
                            exc = e2;
                        }
                    } else {
                        path = null;
                    }
                    if (Intrinsics.areEqual(path2, path)) {
                        final int iIndexOf = this.a.indexOf((FileInfoModel) obj);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("analysisPdf begin currentFile=");
                        FileInfoModel fileInfoModel4 = this.j;
                        sb2.append(fileInfoModel4 != null ? fileInfoModel4.getPath() : null);
                        sb2.append(" location=");
                        sb2.append(iIndexOf);
                        sb2.append(" linkedSize=");
                        sb2.append(this.a.size());
                        nd.a.a("ComicPdfReaderVM", sb2.toString());
                        com.zentraedi.comic.m.h(this.j, this.g, new Function1() { // from class: com.zentraedi.comic.viewmodel.c4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return i4.m0(this.a, activity, iIndexOf, callback, (String) obj2);
                            }
                        }, new Function0() { // from class: com.zentraedi.comic.viewmodel.d4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return i4.n0(this.a, callback);
                            }
                        }, new Function1() { // from class: com.zentraedi.comic.viewmodel.e4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return i4.o0(this.a, callback, (String) obj2);
                            }
                        }, downloadProgress, activity);
                        return;
                    }
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                }
                exc = e;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("dataChangeOnItemRangeInserted exception currentFile=");
                FileInfoModel fileInfoModel5 = this.j;
                sb3.append(fileInfoModel5 != null ? fileInfoModel5.getPath() : null);
                nd.a.d("ComicPdfReaderVM", sb3.toString(), exc);
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.CK), false);
                callback.invoke(DownLoadFileState.FAIL);
                activity.finish();
                return;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception e4) {
            e = e4;
        }
    }

    @fo.l
    public final m6 r0() {
        return this.i;
    }

    @Override // gg.a
    public void s(@fo.k RecyclerView recyclerView, @fo.k Function2<? super Integer, ? super String, Unit> itemClick, @fo.k Function1<? super Bookmark, Unit> deleteBookmark, @fo.k ArrayList<Bookmark> list) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        Intrinsics.checkNotNullParameter(deleteBookmark, "deleteBookmark");
        Intrinsics.checkNotNullParameter(list, "list");
        if (recyclerView instanceof com.zentraedi.comic.view.e0) {
            this.f = (com.zentraedi.comic.view.e0) recyclerView;
        }
        this.d.j0(itemClick);
        this.d.i0(deleteBookmark);
        this.d.n0(list);
        this.c.M(new a(itemClick, this));
    }

    @fo.l
    public final FileInfoModel s0() {
        return this.j;
    }

    public final int t0() {
        return this.g;
    }

    @Override // gg.a
    public void u(@fo.l FileInfoModel fileInfoModel, final int i, @fo.k final Function1<? super DownLoadFileState, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activity = this.e;
        if (activity != null) {
            com.zentraedi.comic.m.h(fileInfoModel, this.g, new Function1() { // from class: com.zentraedi.comic.viewmodel.v3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i4.E0(this.a, i, callback, (String) obj);
                }
            }, new Function0() { // from class: com.zentraedi.comic.viewmodel.w3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i4.F0(callback);
                }
            }, new Function1() { // from class: com.zentraedi.comic.viewmodel.x3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i4.G0(callback, (String) obj);
                }
            }, new Function1() { // from class: com.zentraedi.comic.viewmodel.y3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i4.H0((String) obj);
                }
            }, activity);
        }
    }

    @fo.k
    public final com.zentraedi.comic.adapter.g0 u0() {
        return this.b;
    }

    @Override // gg.a
    public void v(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.d.v(recyclerView);
    }

    @fo.k
    public final com.zentraedi.comic.adapter.k0 v0() {
        return this.c;
    }

    @fo.k
    public final ArrayList<m6> w0() {
        return this.h;
    }

    @fo.k
    public final LinkedList<FileInfoModel> x0() {
        return this.a;
    }

    @fo.l
    public final com.zentraedi.comic.view.e0 y0() {
        return this.f;
    }

    public final void z0(@fo.k com.zentraedi.outreader.reader.h document, @fo.k Activity activity, int i, @fo.k ComicItemType comicItemType, @fo.l com.zentraedi.comic.view.e0 e0Var) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(comicItemType, "comicItemType");
        this.b.n0(activity, document, comicItemType, e0Var);
        k0(document.b(), i);
        if (e0Var != null) {
            this.f = e0Var;
        }
        if (e0Var != null) {
            e0Var.setAdapter(this.b);
        }
        ArrayList<m6> arrayList = this.h;
        if (arrayList != null) {
            this.b.N(arrayList);
        }
    }
}
