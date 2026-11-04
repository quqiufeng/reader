package com.zentraedi.outreader.reader;

import android.graphics.Bitmap;
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
@DebugMetadata(c = "com.zentraedi.outreader.reader.ComicEpubZReader$onPreviewPageBitmap$$inlined$coroutineDefaultWithMain$2", f = "ComicEpubZReader.kt", i = {0, 0, 0, 0, 1}, l = {63, 56}, m = "invokeSuspend", n = {"$completion", "$this$onPreviewPageBitmap_u24lambda_u241", "embeddedLink", "$i$a$-coroutineDefaultWithMain-ComicEpubZReader$onPreviewPageBitmap$2", "r"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0"}, v = 1)
@SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$4\n+ 2 ComicEpubZReader.kt\ncom/zentraedi/outreader/reader/ComicEpubZReader\n*L\n1#1,61:1\n424#2,3:62\n*E\n"})
public final class ComicEpubZReader$onPreviewPageBitmap$$inlined$coroutineDefaultWithMain$2 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Serializable $className;
    final /* synthetic */ com.zentraedi.reader.g $onDrawListener$inlined;
    final /* synthetic */ int $pageNumber$inlined;
    final /* synthetic */ int $pageNumber$inlined$1;
    final /* synthetic */ Object $this_coroutineDefaultWithMain;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ComicEpubZReader this$0;

    /* JADX INFO: renamed from: com.zentraedi.outreader.reader.ComicEpubZReader$onPreviewPageBitmap$$inlined$coroutineDefaultWithMain$2$1, reason: invalid class name */
    @DebugMetadata(c = "com.zentraedi.outreader.reader.ComicEpubZReader$onPreviewPageBitmap$$inlined$coroutineDefaultWithMain$2$1", f = "ComicEpubZReader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$4$1\n+ 2 ComicEpubZReader.kt\ncom/zentraedi/outreader/reader/ComicEpubZReader\n*L\n1#1,58:1\n428#2,6:59\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        final /* synthetic */ com.zentraedi.reader.g $onDrawListener$inlined;
        final /* synthetic */ int $pageNumber$inlined;
        final /* synthetic */ Object $r;
        int label;
        final /* synthetic */ ComicEpubZReader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Continuation continuation, ComicEpubZReader comicEpubZReader, int i, com.zentraedi.reader.g gVar) {
            super(2, continuation);
            this.$r = obj;
            this.this$0 = comicEpubZReader;
            this.$pageNumber$inlined = i;
            this.$onDrawListener$inlined = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$r, continuation, this.this$0, this.$pageNumber$inlined, this.$onDrawListener$inlined);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Bitmap bitmap = (Bitmap) this.$r;
            if (bitmap != null) {
                this.this$0.g.put(Boxing.boxInt(this.$pageNumber$inlined), bitmap);
            }
            this.$onDrawListener$inlined.a(this.$pageNumber$inlined, bitmap != null ? bitmap.getWidth() : 0, bitmap != null ? bitmap.getHeight() : 0);
            this.$onDrawListener$inlined.b(this.$pageNumber$inlined, bitmap);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComicEpubZReader$onPreviewPageBitmap$$inlined$coroutineDefaultWithMain$2(Object obj, Serializable serializable, Continuation continuation, int i, ComicEpubZReader comicEpubZReader, int i2, com.zentraedi.reader.g gVar) {
        super(2, continuation);
        this.$this_coroutineDefaultWithMain = obj;
        this.$className = serializable;
        this.$pageNumber$inlined = i;
        this.this$0 = comicEpubZReader;
        this.$pageNumber$inlined$1 = i2;
        this.$onDrawListener$inlined = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ComicEpubZReader$onPreviewPageBitmap$$inlined$coroutineDefaultWithMain$2(this.$this_coroutineDefaultWithMain, this.$className, continuation, this.$pageNumber$inlined, this.this$0, this.$pageNumber$inlined$1, this.$onDrawListener$inlined);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b9, code lost:
    
        if (kotlinx.coroutines.i.h(r11, r3, r10) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r0 = r10.L$0
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            kotlin.ResultKt.throwOnFailure(r11)
            r9 = r10
            goto Lbc
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            java.lang.Object r1 = r10.L$2
            org.readium.r2.shared.publication.Link r1 = (org.readium.r2.shared.publication.Link) r1
            java.lang.Object r1 = r10.L$1
            com.zentraedi.outreader.reader.ComicEpubZReader r1 = (com.zentraedi.outreader.reader.ComicEpubZReader) r1
            java.lang.Object r1 = r10.L$0
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.ResultKt.throwOnFailure(r11)
            r9 = r10
            goto L6d
        L31:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.$this_coroutineDefaultWithMain
            r4 = r11
            com.zentraedi.outreader.reader.ComicEpubZReader r4 = (com.zentraedi.outreader.reader.ComicEpubZReader) r4
            java.util.List r11 = com.zentraedi.outreader.reader.ComicEpubZReader.G(r4)
            int r1 = r10.$pageNumber$inlined
            int r1 = r1 - r3
            java.lang.Object r11 = kotlin.collections.CollectionsKt.getOrNull(r11, r1)
            r6 = r11
            org.readium.r2.shared.publication.Link r6 = (org.readium.r2.shared.publication.Link) r6
            org.readium.r2.shared.publication.Publication r5 = com.zentraedi.outreader.reader.ComicEpubZReader.K(r4)
            int r7 = r10.$pageNumber$inlined
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r10.L$0 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r10.L$1 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r10.L$2 = r11
            r11 = 0
            r10.I$0 = r11
            r10.label = r3
            r8 = 1
            r9 = r10
            java.lang.Object r11 = com.zentraedi.outreader.reader.ComicEpubZReader.F(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L6d
            goto Lbb
        L6d:
            r4 = r11
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "->coroutineDefaultWithMain() withContext "
            r11.append(r1)
            java.io.Serializable r1 = r9.$className
            r11.append(r1)
            r1 = 32
            r11.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            java.lang.String r1 = "CoroutineScope"
            nd.a.a(r1, r11)
            kotlinx.coroutines.u2 r11 = kotlinx.coroutines.g1.e()
            com.zentraedi.outreader.reader.ComicEpubZReader$onPreviewPageBitmap$$inlined$coroutineDefaultWithMain$2$1 r3 = new com.zentraedi.outreader.reader.ComicEpubZReader$onPreviewPageBitmap$$inlined$coroutineDefaultWithMain$2$1
            com.zentraedi.outreader.reader.ComicEpubZReader r6 = r9.this$0
            int r7 = r9.$pageNumber$inlined$1
            com.zentraedi.reader.g r8 = r9.$onDrawListener$inlined
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r9.L$0 = r1
            r1 = 0
            r9.L$1 = r1
            r9.L$2 = r1
            r9.label = r2
            java.lang.Object r11 = kotlinx.coroutines.i.h(r11, r3, r10)
            if (r11 != r0) goto Lbc
        Lbb:
            return r0
        Lbc:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.reader.ComicEpubZReader$onPreviewPageBitmap$$inlined$coroutineDefaultWithMain$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
        return ((ComicEpubZReader$onPreviewPageBitmap$$inlined$coroutineDefaultWithMain$2) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
