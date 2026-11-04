package com.zentraedi.outreader.local.localepub;

import android.text.TextUtils;
import com.zentraedi.business.utils.g9;
import com.zentraedi.business.utils.l5;
import fo.k;
import fo.l;
import java.io.File;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class a {

    @k
    public static final a a = new a();

    @k
    private static final String b = "ReaderTag";

    /* JADX INFO: renamed from: com.zentraedi.outreader.local.localepub.a$a, reason: collision with other inner class name */
    @DebugMetadata(c = "com.zentraedi.outreader.local.localepub.EpubSplitUtil$splitEpubBlocking$1", f = "EpubSplitUtil.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class C0145a extends SuspendLambda implements Function2<q0, Continuation<? super Boolean>, Object> {
        int a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0145a(String str, String str2, Continuation<? super C0145a> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0145a(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            a aVar = a.a;
            String str = this.b;
            String str2 = this.c;
            this.a = 1;
            Object objB = aVar.b(str, str2, this);
            return objB == coroutine_suspended ? coroutine_suspended : objB;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Boolean> continuation) {
            return ((C0145a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private a() {
    }

    private final boolean a(String str) {
        String strI = b.i(new File(str, b.c).getPath());
        if (TextUtils.isEmpty(strI)) {
            return false;
        }
        File file = new File(str, strI);
        if (!file.exists()) {
            return false;
        }
        String strG = b.g(file.getPath());
        if (TextUtils.isEmpty(strG)) {
            return false;
        }
        File file2 = new File(file.getParent(), strG);
        if (!file2.exists()) {
            nd.a.c("ReaderTag", "ncxFile not exists");
            return false;
        }
        c cVar = c.a;
        List<String> listE = e.a.e(file2, cVar.b(file2));
        if (listE == null) {
            nd.a.c("ReaderTag", "splitHtmlPathList is null");
            return false;
        }
        nd.a.c("ReaderTag", "handleEpubFolder splitHtmlPathList=" + listE);
        cVar.e(file, listE);
        cVar.d(file2, listE);
        String parent = file.getParent();
        if (parent == null) {
            return true;
        }
        File file3 = new File(parent);
        if (!file3.isDirectory()) {
            return true;
        }
        File[] fileArrListFiles = file3.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file4 : fileArrListFiles) {
            String name = file4.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.endsWith$default(name, ".html", false, 2, (Object) null) && !listE.contains(file4.getName())) {
                file4.delete();
            }
        }
        return true;
    }

    @l
    public final Object b(@k String str, @k String str2, @k Continuation<? super Boolean> continuation) {
        String strZ = l5.z(str);
        String strY = l5.y(str);
        File file = new File(strY);
        g9 g9Var = g9.a;
        if (!g9Var.a(new File(str), file)) {
            return Boxing.boxBoolean(false);
        }
        Intrinsics.checkNotNull(strY);
        if (!a(strY)) {
            return Boxing.boxBoolean(false);
        }
        if (!g9Var.b(new File(strY), strZ + '/' + str2)) {
            return Boxing.boxBoolean(false);
        }
        l5.i(file);
        return Boxing.boxBoolean(true);
    }

    public final boolean c(@k String epubPath, @k String targetName) {
        Intrinsics.checkNotNullParameter(epubPath, "epubPath");
        Intrinsics.checkNotNullParameter(targetName, "targetName");
        return ((Boolean) i.g((CoroutineContext) null, new C0145a(epubPath, targetName, null), 1, (Object) null)).booleanValue();
    }
}
