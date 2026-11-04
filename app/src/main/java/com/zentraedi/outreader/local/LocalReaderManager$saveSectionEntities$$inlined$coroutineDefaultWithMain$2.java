package com.zentraedi.outreader.local;

import com.zentraedi.outreader.database.ReaderDatabase;
import java.io.Serializable;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.u2;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@DebugMetadata(c = "com.zentraedi.outreader.local.LocalReaderManager$saveSectionEntities$$inlined$coroutineDefaultWithMain$2", f = "LocalReaderManager.kt", i = {0}, l = {56}, m = "invokeSuspend", n = {"r"}, s = {"L$0"}, v = 1)
@SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$4\n+ 2 LocalReaderManager.kt\ncom/zentraedi/outreader/local/LocalReaderManager\n*L\n1#1,61:1\n322#2,2:62\n*E\n"})
public final class LocalReaderManager$saveSectionEntities$$inlined$coroutineDefaultWithMain$2 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Serializable $className;
    final /* synthetic */ List $entities$inlined;
    final /* synthetic */ Object $this_coroutineDefaultWithMain;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.zentraedi.outreader.local.LocalReaderManager$saveSectionEntities$$inlined$coroutineDefaultWithMain$2$1, reason: invalid class name */
    @DebugMetadata(c = "com.zentraedi.outreader.local.LocalReaderManager$saveSectionEntities$$inlined$coroutineDefaultWithMain$2$1", f = "LocalReaderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$4$1\n+ 2 LocalReaderManager.kt\ncom/zentraedi/outreader/local/LocalReaderManager\n*L\n1#1,58:1\n323#2:59\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $r;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Continuation continuation) {
            super(2, continuation);
            this.$r = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalReaderManager$saveSectionEntities$$inlined$coroutineDefaultWithMain$2(Object obj, Serializable serializable, Continuation continuation, List list) {
        super(2, continuation);
        this.$this_coroutineDefaultWithMain = obj;
        this.$className = serializable;
        this.$entities$inlined = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalReaderManager$saveSectionEntities$$inlined$coroutineDefaultWithMain$2(this.$this_coroutineDefaultWithMain, this.$className, continuation, this.$entities$inlined);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ReaderDatabase.A().D().e(this.$entities$inlined);
            Unit unit = Unit.INSTANCE;
            nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() withContext " + this.$className + ' ' + Thread.currentThread().getName());
            u2 u2VarE = g1.e();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(unit, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(unit);
            this.label = 1;
            if (i.h(u2VarE, anonymousClass1, this) == coroutine_suspended) {
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
        return ((LocalReaderManager$saveSectionEntities$$inlined$coroutineDefaultWithMain$2) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
