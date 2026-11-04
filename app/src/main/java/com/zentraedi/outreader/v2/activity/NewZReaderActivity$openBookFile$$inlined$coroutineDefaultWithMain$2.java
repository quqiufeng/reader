package com.zentraedi.outreader.v2.activity;

import com.zentraedi.business.widget.h0;
import com.zentraedi.outreader.v2.activity.NewZReaderActivity.e;
import com.zentraedi.outreader.v2.activity.NewZReaderActivity.g;
import com.zentraedi.reader.OpenFileResult;
import java.io.Serializable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.q0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@DebugMetadata(c = "com.zentraedi.outreader.v2.activity.NewZReaderActivity$openBookFile$$inlined$coroutineDefaultWithMain$2", f = "NewZReaderActivity.kt", i = {0, 0, 0, 1}, l = {62, 56}, m = "invokeSuspend", n = {"$completion", "$this$openBookFile_u24lambda_u242", "$i$a$-coroutineDefaultWithMain-NewZReaderActivity$openBookFile$3", "r"}, s = {"L$0", "L$1", "I$0", "L$0"}, v = 1)
@SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$4\n+ 2 NewZReaderActivity.kt\ncom/zentraedi/outreader/v2/activity/NewZReaderActivity\n*L\n1#1,61:1\n389#2:62\n*E\n"})
public final class NewZReaderActivity$openBookFile$$inlined$coroutineDefaultWithMain$2 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Serializable $className;
    final /* synthetic */ String $path$inlined;
    final /* synthetic */ String $path$inlined$1;
    final /* synthetic */ Object $this_coroutineDefaultWithMain;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ NewZReaderActivity this$0;

    /* JADX INFO: renamed from: com.zentraedi.outreader.v2.activity.NewZReaderActivity$openBookFile$$inlined$coroutineDefaultWithMain$2$1, reason: invalid class name */
    @DebugMetadata(c = "com.zentraedi.outreader.v2.activity.NewZReaderActivity$openBookFile$$inlined$coroutineDefaultWithMain$2$1", f = "NewZReaderActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$4$1\n+ 2 NewZReaderActivity.kt\ncom/zentraedi/outreader/v2/activity/NewZReaderActivity\n+ 3 DialogTipsBuilder.kt\ncom/zentraedi/business/widget/DialogTipsBuilderKt\n*L\n1#1,58:1\n391#2,8:59\n411#2:67\n405#2:68\n406#2,17:70\n146#3:69\n*S KotlinDebug\n*F\n+ 1 NewZReaderActivity.kt\ncom/zentraedi/outreader/v2/activity/NewZReaderActivity\n*L\n405#1:69\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $path$inlined;
        final /* synthetic */ Object $r;
        int label;
        final /* synthetic */ NewZReaderActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Continuation continuation, NewZReaderActivity newZReaderActivity, String str) {
            super(2, continuation);
            this.$r = obj;
            this.this$0 = newZReaderActivity;
            this.$path$inlined = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$r, continuation, this.this$0, this.$path$inlined);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object objM15unboximpl = ((Result) this.$r).m15unboximpl();
            nd.a.a(this.this$0.T, "openBookFile result=" + ((Object) Result.m14toStringimpl(objM15unboximpl)) + " path=" + this.$path$inlined);
            Throwable thM9exceptionOrNullimpl = Result.m9exceptionOrNullimpl(objM15unboximpl);
            if (thM9exceptionOrNullimpl == null) {
                OpenFileResult openFileResult = (OpenFileResult) objM15unboximpl;
                if (openFileResult == OpenFileResult.SUCCESS) {
                    this.this$0.L4();
                    Boxing.boxBoolean(this.this$0.W4().getRoot().post(this.this$0.new e()));
                } else {
                    com.zentraedi.basic.function.ui.dialog.b bVarY = h0.y(new h0(this.this$0).I(com.zentraedi.outreader.d.q.cE2).o(openFileResult.getMessage()).H().E(com.zentraedi.outreader.d.q.vx, NewZReaderActivity.f.a), (Function1) null, 1, (Object) null);
                    if (bVarY != null) {
                        bVarY.setOnDismissListener(this.this$0.new g());
                    }
                }
            } else {
                nd.a.c(this.this$0.T, "openBookFile exception: " + thM9exceptionOrNullimpl.getMessage());
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Pw1), false);
            }
            this.this$0.Y = true;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewZReaderActivity$openBookFile$$inlined$coroutineDefaultWithMain$2(Object obj, Serializable serializable, Continuation continuation, String str, NewZReaderActivity newZReaderActivity, String str2) {
        super(2, continuation);
        this.$this_coroutineDefaultWithMain = obj;
        this.$className = serializable;
        this.$path$inlined = str;
        this.this$0 = newZReaderActivity;
        this.$path$inlined$1 = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewZReaderActivity$openBookFile$$inlined$coroutineDefaultWithMain$2(this.$this_coroutineDefaultWithMain, this.$className, continuation, this.$path$inlined, this.this$0, this.$path$inlined$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a2, code lost:
    
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
            if (r1 == 0) goto L31
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r7.L$0
            kotlin.Result r0 = (kotlin.Result) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto La5
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            java.lang.Object r1 = r7.L$1
            com.zentraedi.outreader.v2.activity.NewZReaderActivity r1 = (com.zentraedi.outreader.v2.activity.NewZReaderActivity) r1
            java.lang.Object r1 = r7.L$0
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.m15unboximpl()
            goto L5a
        L31:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.$this_coroutineDefaultWithMain
            com.zentraedi.outreader.v2.activity.NewZReaderActivity r8 = (com.zentraedi.outreader.v2.activity.NewZReaderActivity) r8
            com.zentraedi.outreader.viewmodel.d r1 = r8.X4()
            com.zentraedi.outreader.reader.h r1 = r1.Y()
            java.lang.String r4 = r7.$path$inlined
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r7.L$0 = r5
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r7.L$1 = r8
            r8 = 0
            r7.I$0 = r8
            r7.label = r3
            java.lang.Object r8 = r1.h(r4, r7)
            if (r8 != r0) goto L5a
            goto La4
        L5a:
            kotlin.Result r8 = kotlin.Result.m5boximpl(r8)
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
            com.zentraedi.outreader.v2.activity.NewZReaderActivity$openBookFile$$inlined$coroutineDefaultWithMain$2$1 r3 = new com.zentraedi.outreader.v2.activity.NewZReaderActivity$openBookFile$$inlined$coroutineDefaultWithMain$2$1
            com.zentraedi.outreader.v2.activity.NewZReaderActivity r4 = r7.this$0
            java.lang.String r5 = r7.$path$inlined$1
            r6 = 0
            r3.<init>(r8, r6, r4, r5)
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r7.L$0 = r8
            r7.L$1 = r6
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.i.h(r1, r3, r7)
            if (r8 != r0) goto La5
        La4:
            return r0
        La5:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.v2.activity.NewZReaderActivity$openBookFile$$inlined$coroutineDefaultWithMain$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
        return ((NewZReaderActivity$openBookFile$$inlined$coroutineDefaultWithMain$2) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
