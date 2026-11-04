package com.zentraedi.comic.imageprocess;

import android.graphics.Bitmap;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class g {

    @fo.k
    private final List<f> a = new ArrayList();

    @DebugMetadata(c = "com.zentraedi.comic.imageprocess.ImageProcessingPipeline", f = "ImageProcessStep.kt", i = {0, 0, 0}, l = {76}, m = "execute", n = {"input", CommonNetImpl.RESULT, "step"}, s = {"L$0", "L$1", "L$3"}, v = 1)
    static final class a extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        /* synthetic */ Object e;
        int g;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @fo.l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.e = obj;
            this.g |= IntCompanionObject.MIN_VALUE;
            return g.this.b(null, this);
        }
    }

    @fo.k
    public final g a(@fo.k f step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.a.add(step);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @fo.l
    public final Object b(@fo.k Object obj, @fo.k Continuation<? super Bitmap> continuation) {
        a aVar;
        Object obj2;
        Iterator<f> it;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.g;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                aVar.g = i - IntCompanionObject.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            obj2 = obj;
            it = this.a.iterator();
            objA = obj2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) aVar.c;
            Object obj3 = aVar.a;
            ResultKt.throwOnFailure(objA);
            obj2 = obj3;
        }
        while (it.hasNext()) {
            f next = it.next();
            aVar.a = SpillingKt.nullOutSpilledVariable(obj2);
            aVar.b = SpillingKt.nullOutSpilledVariable(objA);
            aVar.c = it;
            aVar.d = SpillingKt.nullOutSpilledVariable(next);
            aVar.g = 1;
            objA = next.a(objA, aVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Intrinsics.checkNotNull(objA, "null cannot be cast to non-null type android.graphics.Bitmap");
        return (Bitmap) objA;
    }
}
