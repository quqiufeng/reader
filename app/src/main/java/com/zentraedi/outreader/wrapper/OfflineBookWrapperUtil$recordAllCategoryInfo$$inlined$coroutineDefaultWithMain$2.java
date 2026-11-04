package com.zentraedi.outreader.wrapper;

import java.io.Serializable;
import java.util.List;
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
@DebugMetadata(c = "com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil$recordAllCategoryInfo$$inlined$coroutineDefaultWithMain$2", f = "OfflineBookWrapperUtil.kt", i = {0, 0, 0, 1}, l = {62, 56}, m = "invokeSuspend", n = {"$completion", "$this$recordAllCategoryInfo_u24lambda_u241", "$i$a$-coroutineDefaultWithMain-OfflineBookWrapperUtil$recordAllCategoryInfo$2", "r"}, s = {"L$0", "L$1", "I$0", "L$0"}, v = 1)
@SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$4\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,61:1\n97#2:62\n*E\n"})
public final class OfflineBookWrapperUtil$recordAllCategoryInfo$$inlined$coroutineDefaultWithMain$2 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List $categoryList$inlined;
    final /* synthetic */ Serializable $className;
    final /* synthetic */ com.zentraedi.business.http.b $resultHandler$inlined;
    final /* synthetic */ Object $this_coroutineDefaultWithMain;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil$recordAllCategoryInfo$$inlined$coroutineDefaultWithMain$2$1, reason: invalid class name */
    @DebugMetadata(c = "com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil$recordAllCategoryInfo$$inlined$coroutineDefaultWithMain$2$1", f = "OfflineBookWrapperUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$4$1\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,58:1\n99#2,7:59\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $r;
        final /* synthetic */ com.zentraedi.business.http.b $resultHandler$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Continuation continuation, com.zentraedi.business.http.b bVar) {
            super(2, continuation);
            this.$r = obj;
            this.$resultHandler$inlined = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$r, continuation, this.$resultHandler$inlined);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((Boolean) this.$r).booleanValue()) {
                com.zentraedi.business.http.b bVar = this.$resultHandler$inlined;
                if (bVar != null) {
                    bVar.onResult(null);
                }
            } else {
                com.zentraedi.business.http.b bVar2 = this.$resultHandler$inlined;
                if (bVar2 != null) {
                    bVar2.onServerError();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineBookWrapperUtil$recordAllCategoryInfo$$inlined$coroutineDefaultWithMain$2(Object obj, Serializable serializable, Continuation continuation, List list, com.zentraedi.business.http.b bVar) {
        super(2, continuation);
        this.$this_coroutineDefaultWithMain = obj;
        this.$className = serializable;
        this.$categoryList$inlined = list;
        this.$resultHandler$inlined = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OfflineBookWrapperUtil$recordAllCategoryInfo$$inlined$coroutineDefaultWithMain$2(this.$this_coroutineDefaultWithMain, this.$className, continuation, this.$categoryList$inlined, this.$resultHandler$inlined);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        if (kotlinx.coroutines.i.h(r1, r3, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.throwOnFailure(r7)
            goto L8d
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            java.lang.Object r1 = r6.L$1
            com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil r1 = (com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil) r1
            java.lang.Object r1 = r6.L$0
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L48
        L27:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.$this_coroutineDefaultWithMain
            com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil r7 = (com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil) r7
            java.util.List r1 = r6.$categoryList$inlined
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r6.L$0 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r6.L$1 = r4
            r4 = 0
            r6.I$0 = r4
            r6.label = r3
            java.lang.Object r7 = r7.A(r1, r6)
            if (r7 != r0) goto L48
            goto L8c
        L48:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "->coroutineDefaultWithMain() withContext "
            r1.append(r3)
            java.io.Serializable r3 = r6.$className
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
            com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil$recordAllCategoryInfo$$inlined$coroutineDefaultWithMain$2$1 r3 = new com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil$recordAllCategoryInfo$$inlined$coroutineDefaultWithMain$2$1
            com.zentraedi.business.http.b r4 = r6.$resultHandler$inlined
            r5 = 0
            r3.<init>(r7, r5, r4)
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r6.L$0 = r7
            r6.L$1 = r5
            r6.label = r2
            java.lang.Object r7 = kotlinx.coroutines.i.h(r1, r3, r6)
            if (r7 != r0) goto L8d
        L8c:
            return r0
        L8d:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil$recordAllCategoryInfo$$inlined$coroutineDefaultWithMain$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
        return ((OfflineBookWrapperUtil$recordAllCategoryInfo$$inlined$coroutineDefaultWithMain$2) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
