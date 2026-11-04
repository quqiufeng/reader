package com.zentraedi.comic.util;

import android.app.Activity;
import android.os.Looper;
import com.zentraedi.business.dialog.n;
import com.zentraedi.business.widget.h0;
import com.zentraedi.comic.adapter.ComicItemType;
import com.zentraedi.outreader.reader.ComicEpubZReader;
import com.zentraedi.outreader.reader.PDFTronZReader;
import com.zentraedi.reader.OpenFileResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicPDFTronZReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicPDFTronZReader.kt\ncom/zentraedi/comic/util/ComicPDFTronZReader\n+ 2 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt\n+ 3 DialogTipsBuilder.kt\ncom/zentraedi/business/widget/DialogTipsBuilderKt\n*L\n1#1,56:1\n179#2,2:57\n182#2,5:60\n146#3:59\n*S KotlinDebug\n*F\n+ 1 ComicPDFTronZReader.kt\ncom/zentraedi/comic/util/ComicPDFTronZReader\n*L\n39#1:57,2\n39#1:60,5\n42#1:59\n*E\n"})
public final class k {

    @fo.k
    public static final k a = new k();

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComicItemType.values().length];
            try {
                iArr[ComicItemType.COMIC_ITEM_TYPE_EPUB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComicItemType.COMIC_ITEM_TYPE_PDF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComicItemType.COMIC_ITEM_TYPE_IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ComicItemType.COMIC_ITEM_TYPE_ZIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\ncom/zentraedi/business/utils/CommonUtilsKt$withMain$1\n+ 2 ComicPDFTronZReader.kt\ncom/zentraedi/comic/util/ComicPDFTronZReader\n+ 3 DialogTipsBuilder.kt\ncom/zentraedi/business/widget/DialogTipsBuilderKt\n*L\n1#1,778:1\n40#2,3:779\n43#2,9:783\n146#3:782\n*S KotlinDebug\n*F\n+ 1 ComicPDFTronZReader.kt\ncom/zentraedi/comic/util/ComicPDFTronZReader\n*L\n42#1:782\n*E\n"})
    public static final class b implements Function0<Unit> {
        final /* synthetic */ Object a;
        final /* synthetic */ Result b;

        public b(Object obj, Result result) {
            this.a = obj;
            this.b = result;
        }

        public final void a() {
            Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
            if (activityE.isFinishing() || activityE.isDestroyed()) {
                return;
            }
            h0 h0VarI = new h0(activityE).I(com.zentraedi.outreader.d.q.cE2);
            Object objM15unboximpl = this.b.m15unboximpl();
            if (Result.m12isFailureimpl(objM15unboximpl)) {
                objM15unboximpl = null;
            }
            Intrinsics.checkNotNull(objM15unboximpl);
            h0.y(h0VarI.o(((OpenFileResult) objM15unboximpl).getMessage()).H().E(com.zentraedi.outreader.d.q.vx, new d(activityE)), (Function1) null, 1, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.util.ComicPDFTronZReader", f = "ComicPDFTronZReader.kt", i = {0, 0, 0}, l = {35}, m = "openComic", n = {"localPath", "type", "pdfTronZReader"}, s = {"L$0", "L$1", "L$2"}, v = 1)
    static final class c extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        /* synthetic */ Object d;
        int f;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @fo.l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.d = obj;
            this.f |= IntCompanionObject.MIN_VALUE;
            return k.this.a(null, null, this);
        }
    }

    static final class d implements Function1<n, Unit> {
        final /* synthetic */ Activity a;

        d(Activity activity) {
            this.a = activity;
        }

        public final void a(n it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.dismiss();
            if (this.a.isFinishing() || this.a.isDestroyed()) {
                return;
            }
            this.a.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(n nVar) {
            a(nVar);
            return Unit.INSTANCE;
        }
    }

    private k() {
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @fo.l
    public final Object a(@fo.k String str, @fo.k ComicItemType comicItemType, @fo.k Continuation<? super com.zentraedi.outreader.reader.h> continuation) {
        c cVar;
        ComicEpubZReader comicEpubZReader;
        com.zentraedi.outreader.reader.h hVar;
        Result resultM5boximpl;
        Object objH;
        com.zentraedi.outreader.reader.h hVar2;
        PDFTronZReader pDFTronZReader;
        com.zentraedi.outreader.reader.h hVar3;
        Object objM15unboximpl;
        Activity activityE;
        Object objM15unboximpl2;
        Object objM15unboximpl3;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.f;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                cVar.f = i - IntCompanionObject.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cVar.f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            int i3 = a.$EnumSwitchMapping$0[comicItemType.ordinal()];
            if (i3 == 1) {
                comicEpubZReader = new ComicEpubZReader();
                f fVar = f.a;
                comicEpubZReader.b0(fVar.e());
                comicEpubZReader.a0(fVar.d());
            } else if (i3 == 2) {
                pDFTronZReader = new PDFTronZReader();
                f fVar2 = f.a;
                pDFTronZReader.k0(fVar2.e());
                pDFTronZReader.j0(fVar2.d());
            } else {
                if (i3 != 3 && i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                hVar = null;
            }
            if (hVar != null) {
                hVar = comicEpubZReader;
                hVar = pDFTronZReader;
                cVar.a = SpillingKt.nullOutSpilledVariable(str);
                cVar.b = SpillingKt.nullOutSpilledVariable(comicItemType);
                cVar.c = hVar;
                cVar.f = 1;
                objH = hVar.h(str, cVar);
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hVar2 = hVar;
            } else {
                hVar = comicEpubZReader;
                hVar = pDFTronZReader;
                resultM5boximpl = null;
            }
            if (resultM5boximpl != null) {
                hVar3 = hVar;
                if (Result.m13isSuccessimpl(resultM5boximpl.m15unboximpl())) {
                    objM15unboximpl3 = resultM5boximpl.m15unboximpl();
                    if (Result.m12isFailureimpl(objM15unboximpl3)) {
                        objM15unboximpl3 = null;
                    }
                    if (objM15unboximpl3 == OpenFileResult.SUCCESS) {
                        return hVar3;
                    }
                }
            }
            if (resultM5boximpl != null) {
                objM15unboximpl = resultM5boximpl.m15unboximpl();
                if (Result.m12isFailureimpl(objM15unboximpl)) {
                    objM15unboximpl = null;
                }
                if (objM15unboximpl != null) {
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        activityE = com.zentraedi.basic.function.utils.a.h().e();
                        if (!activityE.isFinishing() && !activityE.isDestroyed()) {
                            h0 h0VarI = new h0(activityE).I(com.zentraedi.outreader.d.q.cE2);
                            objM15unboximpl2 = resultM5boximpl.m15unboximpl();
                            if (Result.m12isFailureimpl(objM15unboximpl2)) {
                                objM15unboximpl2 = null;
                            }
                            Intrinsics.checkNotNull(objM15unboximpl2);
                            h0.y(h0VarI.o(((OpenFileResult) objM15unboximpl2).getMessage()).H().E(com.zentraedi.outreader.d.q.vx, new d(activityE)), (Function1) null, 1, (Object) null);
                        }
                    } else {
                        pe.i.r(new b(this, resultM5boximpl));
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.zentraedi.outreader.reader.h hVar4 = (com.zentraedi.outreader.reader.h) cVar.c;
        ResultKt.throwOnFailure(obj);
        objH = ((Result) obj).m15unboximpl();
        hVar2 = hVar4;
        resultM5boximpl = Result.m5boximpl(objH);
        hVar3 = hVar2;
        if (resultM5boximpl != null) {
            hVar3 = hVar;
            if (Result.m13isSuccessimpl(resultM5boximpl.m15unboximpl())) {
                objM15unboximpl3 = resultM5boximpl.m15unboximpl();
                if (Result.m12isFailureimpl(objM15unboximpl3)) {
                    objM15unboximpl3 = null;
                }
                if (objM15unboximpl3 == OpenFileResult.SUCCESS) {
                    return hVar3;
                }
            }
        }
        if (resultM5boximpl != null) {
            objM15unboximpl = resultM5boximpl.m15unboximpl();
            if (Result.m12isFailureimpl(objM15unboximpl)) {
                objM15unboximpl = null;
            }
            if (objM15unboximpl != null) {
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    activityE = com.zentraedi.basic.function.utils.a.h().e();
                    if (!activityE.isFinishing()) {
                        h0 h0VarI2 = new h0(activityE).I(com.zentraedi.outreader.d.q.cE2);
                        objM15unboximpl2 = resultM5boximpl.m15unboximpl();
                        if (Result.m12isFailureimpl(objM15unboximpl2)) {
                            objM15unboximpl2 = null;
                        }
                        Intrinsics.checkNotNull(objM15unboximpl2);
                        h0.y(h0VarI2.o(((OpenFileResult) objM15unboximpl2).getMessage()).H().E(com.zentraedi.outreader.d.q.vx, new d(activityE)), (Function1) null, 1, (Object) null);
                    }
                } else {
                    pe.i.r(new b(this, resultM5boximpl));
                }
            }
        }
        return null;
    }
}
