package com.zentraedi.outreader.reader;

import android.graphics.Bitmap;
import com.umeng.analytics.AnalyticsConfig;
import java.io.Serializable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.q0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@DebugMetadata(c = "com.zentraedi.outreader.reader.PDFTronZReader$getPageBitmap$$inlined$coroutineDefaultWithMain$2", f = "PDFTronZReader.kt", i = {0, 0, 0, 0, 0, 1}, l = {64, 56}, m = "invokeSuspend", n = {"$completion", "$this$getPageBitmap_u24lambda_u241", "page", "$i$a$-coroutineDefaultWithMain-PDFTronZReader$getPageBitmap$2", AnalyticsConfig.RTD_START_TIME, "r"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "L$0"}, v = 1)
@SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$4\n+ 2 PDFTronZReader.kt\ncom/zentraedi/outreader/reader/PDFTronZReader\n*L\n1#1,61:1\n290#2,39:62\n*E\n"})
public final class PDFTronZReader$getPageBitmap$$inlined$coroutineDefaultWithMain$2 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Serializable $className;
    final /* synthetic */ com.zentraedi.reader.g $listener$inlined;
    final /* synthetic */ com.zentraedi.reader.g $listener$inlined$1;
    final /* synthetic */ int $pageNumber$inlined;
    final /* synthetic */ int $pageNumber$inlined$1;
    final /* synthetic */ Object $this_coroutineDefaultWithMain;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PDFTronZReader this$0;

    /* JADX INFO: renamed from: com.zentraedi.outreader.reader.PDFTronZReader$getPageBitmap$$inlined$coroutineDefaultWithMain$2$1, reason: invalid class name */
    @DebugMetadata(c = "com.zentraedi.outreader.reader.PDFTronZReader$getPageBitmap$$inlined$coroutineDefaultWithMain$2$1", f = "PDFTronZReader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$4$1\n+ 2 PDFTronZReader.kt\ncom/zentraedi/outreader/reader/PDFTronZReader\n*L\n1#1,58:1\n330#2,6:59\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        final /* synthetic */ com.zentraedi.reader.g $listener$inlined;
        final /* synthetic */ int $pageNumber$inlined;
        final /* synthetic */ Object $r;
        int label;
        final /* synthetic */ PDFTronZReader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Continuation continuation, PDFTronZReader pDFTronZReader, int i, com.zentraedi.reader.g gVar) {
            super(2, continuation);
            this.$r = obj;
            this.this$0 = pDFTronZReader;
            this.$pageNumber$inlined = i;
            this.$listener$inlined = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$r, continuation, this.this$0, this.$pageNumber$inlined, this.$listener$inlined);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Bitmap bitmap = (Bitmap) this.$r;
            StringBuilder sb = new StringBuilder();
            sb.append("PDFTronZReader->getPageBitmap 生成  fileName=");
            sb.append(this.this$0.n);
            sb.append(" pageNumber=");
            sb.append(this.$pageNumber$inlined);
            sb.append(" bitmap=");
            sb.append(bitmap != null);
            nd.a.e("nas_book", sb.toString());
            if (bitmap != null) {
                this.this$0.l.put(Boxing.boxInt(this.$pageNumber$inlined), bitmap);
            }
            com.zentraedi.reader.g gVar = this.$listener$inlined;
            if (gVar != null) {
                gVar.b(this.$pageNumber$inlined, bitmap);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDFTronZReader$getPageBitmap$$inlined$coroutineDefaultWithMain$2(Object obj, Serializable serializable, Continuation continuation, int i, com.zentraedi.reader.g gVar, PDFTronZReader pDFTronZReader, int i2, com.zentraedi.reader.g gVar2) {
        super(2, continuation);
        this.$this_coroutineDefaultWithMain = obj;
        this.$className = serializable;
        this.$pageNumber$inlined = i;
        this.$listener$inlined = gVar;
        this.this$0 = pDFTronZReader;
        this.$pageNumber$inlined$1 = i2;
        this.$listener$inlined$1 = gVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PDFTronZReader$getPageBitmap$$inlined$coroutineDefaultWithMain$2(this.$this_coroutineDefaultWithMain, this.$className, continuation, this.$pageNumber$inlined, this.$listener$inlined, this.this$0, this.$pageNumber$inlined$1, this.$listener$inlined$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0225, code lost:
    
        if (kotlinx.coroutines.i.h(r2, r4, r18) == r1) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.reader.PDFTronZReader$getPageBitmap$$inlined$coroutineDefaultWithMain$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
        return ((PDFTronZReader$getPageBitmap$$inlined$coroutineDefaultWithMain$2) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
