package com.zentraedi.outreader.dialog;

import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.util.ReaderUtils;
import java.io.Serializable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.q0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@DebugMetadata(c = "com.zentraedi.outreader.dialog.MoreMarginDialog$setParagraphSpace$$inlined$coroutineDefaultWithMain$2", f = "MoreMarginDialog.kt", i = {0, 0, 0, 1}, l = {62, 56}, m = "invokeSuspend", n = {"$completion", "$this$setParagraphSpace_u24lambda_u241", "$i$a$-coroutineDefaultWithMain-MoreMarginDialog$setParagraphSpace$2", "r"}, s = {"L$0", "L$1", "I$0", "L$0"}, v = 1)
@SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$4\n+ 2 MoreMarginDialog.kt\ncom/zentraedi/outreader/dialog/MoreMarginDialog\n*L\n1#1,61:1\n223#2,2:62\n*E\n"})
public final class MoreMarginDialog$setParagraphSpace$$inlined$coroutineDefaultWithMain$2 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Serializable $className;
    final /* synthetic */ Object $this_coroutineDefaultWithMain;
    final /* synthetic */ ReaderUtils.ParagraphSpace $value$inlined;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MoreMarginDialog this$0;

    /* JADX INFO: renamed from: com.zentraedi.outreader.dialog.MoreMarginDialog$setParagraphSpace$$inlined$coroutineDefaultWithMain$2$1, reason: invalid class name */
    @DebugMetadata(c = "com.zentraedi.outreader.dialog.MoreMarginDialog$setParagraphSpace$$inlined$coroutineDefaultWithMain$2$1", f = "MoreMarginDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$4$1\n+ 2 MoreMarginDialog.kt\ncom/zentraedi/outreader/dialog/MoreMarginDialog\n*L\n1#1,58:1\n225#2,4:59\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $r;
        final /* synthetic */ ReaderUtils.ParagraphSpace $value$inlined;
        int label;
        final /* synthetic */ MoreMarginDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Continuation continuation, ReaderUtils.ParagraphSpace paragraphSpace, MoreMarginDialog moreMarginDialog) {
            super(2, continuation);
            this.$r = obj;
            this.$value$inlined = paragraphSpace;
            this.this$0 = moreMarginDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$r, continuation, this.$value$inlined, this.this$0);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            nd.a.h("nas_book", "ReaderMenuSettingFragment setParagraphSpace value=" + this.$value$inlined);
            ReaderUtils.a aVar = ReaderUtils.a;
            BookModel bookModelM = this.this$0.t().M();
            aVar.J(bookModelM != null ? bookModelM.getBookFileType() : null, this.$value$inlined);
            com.zentraedi.reader.i iVarY = this.this$0.t().Y();
            com.zentraedi.outreader.reader.c cVar = iVarY instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVarY : null;
            if (cVar != null) {
                cVar.l(this.$value$inlined);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreMarginDialog$setParagraphSpace$$inlined$coroutineDefaultWithMain$2(Object obj, Serializable serializable, Continuation continuation, ReaderUtils.ParagraphSpace paragraphSpace, MoreMarginDialog moreMarginDialog) {
        super(2, continuation);
        this.$this_coroutineDefaultWithMain = obj;
        this.$className = serializable;
        this.$value$inlined = paragraphSpace;
        this.this$0 = moreMarginDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MoreMarginDialog$setParagraphSpace$$inlined$coroutineDefaultWithMain$2(this.$this_coroutineDefaultWithMain, this.$className, continuation, this.$value$inlined, this.this$0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0092, code lost:
    
        if (kotlinx.coroutines.i.h(r1, r3, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r7.L$0
            kotlin.Unit r0 = (kotlin.Unit) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L95
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            java.lang.Object r1 = r7.L$1
            com.zentraedi.outreader.dialog.MoreMarginDialog r1 = (com.zentraedi.outreader.dialog.MoreMarginDialog) r1
            java.lang.Object r1 = r7.L$0
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4c
        L2b:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.$this_coroutineDefaultWithMain
            com.zentraedi.outreader.dialog.MoreMarginDialog r8 = (com.zentraedi.outreader.dialog.MoreMarginDialog) r8
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r7.L$0 = r1
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r7.L$1 = r8
            r8 = 0
            r7.I$0 = r8
            r7.label = r3
            r3 = 60
            java.lang.Object r8 = kotlinx.coroutines.z0.b(r3, r7)
            if (r8 != r0) goto L4c
            goto L94
        L4c:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "->coroutineDefaultWithMain() withContext "
            r1.append(r3)
            java.io.Serializable r3 = r7.$className
            r1.append(r3)
            r3 = 32
            r1.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "CoroutineScope"
            nd.a.a(r3, r1)
            kotlinx.coroutines.u2 r1 = kotlinx.coroutines.g1.e()
            com.zentraedi.outreader.dialog.MoreMarginDialog$setParagraphSpace$$inlined$coroutineDefaultWithMain$2$1 r3 = new com.zentraedi.outreader.dialog.MoreMarginDialog$setParagraphSpace$$inlined$coroutineDefaultWithMain$2$1
            com.zentraedi.outreader.util.ReaderUtils$ParagraphSpace r4 = r7.$value$inlined
            com.zentraedi.outreader.dialog.MoreMarginDialog r5 = r7.this$0
            r6 = 0
            r3.<init>(r8, r6, r4, r5)
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r7.L$0 = r8
            r7.L$1 = r6
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.i.h(r1, r3, r7)
            if (r8 != r0) goto L95
        L94:
            return r0
        L95:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.dialog.MoreMarginDialog$setParagraphSpace$$inlined$coroutineDefaultWithMain$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
        return ((MoreMarginDialog$setParagraphSpace$$inlined$coroutineDefaultWithMain$2) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
