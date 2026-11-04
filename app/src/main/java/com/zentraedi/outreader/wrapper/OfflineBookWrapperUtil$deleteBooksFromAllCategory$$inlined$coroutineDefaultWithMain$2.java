package com.zentraedi.outreader.wrapper;

import com.zentraedi.comic.activity.ComicSubDirActivity;
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
@DebugMetadata(c = "com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil$deleteBooksFromAllCategory$$inlined$coroutineDefaultWithMain$2", f = "OfflineBookWrapperUtil.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2}, l = {68, 72, 56}, m = "invokeSuspend", n = {"$completion", "$this$deleteBooksFromAllCategory_u24lambda_u241", "$this$withLock_u24default$iv", "$completion$iv", "$i$a$-coroutineDefaultWithMain-OfflineBookWrapperUtil$deleteBooksFromAllCategory$2", "$i$f$withLock", "$completion", "$this$deleteBooksFromAllCategory_u24lambda_u241", "$this$withLock_u24default$iv", "$completion$iv", ComicSubDirActivity.k0, "$i$a$-coroutineDefaultWithMain-OfflineBookWrapperUtil$deleteBooksFromAllCategory$2", "$i$f$withLock", "$i$a$-withLock$default-OfflineBookWrapperUtil$deleteBooksFromAllCategory$2$1", "r"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "I$1", "I$2", "L$0"}, v = 1)
@SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$4\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,61:1\n62#2:62\n63#2,4:71\n67#2:77\n116#3,8:63\n125#3,2:75\n*S KotlinDebug\n*F\n+ 1 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n62#1:63,8\n62#1:75,2\n*E\n"})
public final class OfflineBookWrapperUtil$deleteBooksFromAllCategory$$inlined$coroutineDefaultWithMain$2 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Serializable $className;
    final /* synthetic */ List $nasBookPaths$inlined;
    final /* synthetic */ com.zentraedi.business.http.b $resultHandler$inlined;
    final /* synthetic */ Object $this_coroutineDefaultWithMain;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX INFO: renamed from: com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil$deleteBooksFromAllCategory$$inlined$coroutineDefaultWithMain$2$1, reason: invalid class name */
    @DebugMetadata(c = "com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil$deleteBooksFromAllCategory$$inlined$coroutineDefaultWithMain$2$1", f = "OfflineBookWrapperUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$4$1\n+ 2 OfflineBookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/OfflineBookWrapperUtil\n*L\n1#1,58:1\n68#2,2:59\n*E\n"})
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
            com.zentraedi.business.http.b bVar = this.$resultHandler$inlined;
            if (bVar != null) {
                bVar.onResult(null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineBookWrapperUtil$deleteBooksFromAllCategory$$inlined$coroutineDefaultWithMain$2(Object obj, Serializable serializable, Continuation continuation, List list, com.zentraedi.business.http.b bVar) {
        super(2, continuation);
        this.$this_coroutineDefaultWithMain = obj;
        this.$className = serializable;
        this.$nasBookPaths$inlined = list;
        this.$resultHandler$inlined = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OfflineBookWrapperUtil$deleteBooksFromAllCategory$$inlined$coroutineDefaultWithMain$2(this.$this_coroutineDefaultWithMain, this.$className, continuation, this.$nasBookPaths$inlined, this.$resultHandler$inlined);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00aa A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:11:0x0042, B:21:0x00a4, B:23:0x00aa, B:26:0x00d7, B:20:0x0096), top: B:34:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:21:0x00a4->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0125, code lost:
    
        if (kotlinx.coroutines.i.h(r1, r3, r13) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil$deleteBooksFromAllCategory$$inlined$coroutineDefaultWithMain$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
        return ((OfflineBookWrapperUtil$deleteBooksFromAllCategory$$inlined$coroutineDefaultWithMain$2) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
