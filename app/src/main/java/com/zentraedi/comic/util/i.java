package com.zentraedi.comic.util;

import com.zentraedi.business.utils.l5;
import com.zentraedi.comic.m;
import com.zspace.mobi.MobiUtilBusiness;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.q0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class i {

    @fo.k
    public static final i a = new i();

    @DebugMetadata(c = "com.zentraedi.comic.util.ComicLocalCleanUtils$clean$1", f = "ComicLocalCleanUtils.kt", i = {0}, l = {31}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
    static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ com.zentraedi.business.listener.l c;

        /* JADX INFO: renamed from: com.zentraedi.comic.util.i$a$a, reason: collision with other inner class name */
        @DebugMetadata(c = "com.zentraedi.comic.util.ComicLocalCleanUtils$clean$1$1", f = "ComicLocalCleanUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class C0125a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ com.zentraedi.business.listener.l b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0125a(com.zentraedi.business.listener.l lVar, Continuation<? super C0125a> continuation) {
                super(2, continuation);
                this.b = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0125a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.continueDo();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((C0125a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.zentraedi.business.listener.l lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.c, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            q0 q0Var = (q0) this.b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                l5.g(m.z());
                f fVar = f.a;
                l5.g(fVar.a());
                l5.g(fVar.c());
                l5.g(m.v());
                MobiUtilBusiness mobiUtilBusiness = MobiUtilBusiness.INSTANCE;
                l5.g(mobiUtilBusiness.getFileConvertDirPath());
                l5.g(mobiUtilBusiness.getReaderConvertDirPath());
                l5.g(mobiUtilBusiness.getComicConvertDirPath());
                com.zentraedi.outreader.database.helper.b bVarA = com.zentraedi.outreader.database.helper.b.b.a();
                this.b = q0Var;
                this.a = 1;
                if (bVarA.c(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (this.c != null) {
                kotlinx.coroutines.i.e(q0Var, g1.e(), (CoroutineStart) null, new C0125a(this.c, null), 2, (Object) null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private i() {
    }

    public final void a(@fo.l com.zentraedi.business.listener.l lVar) {
        kotlinx.coroutines.i.e(a2.a, g1.c(), (CoroutineStart) null, new a(lVar, null), 2, (Object) null);
    }
}
