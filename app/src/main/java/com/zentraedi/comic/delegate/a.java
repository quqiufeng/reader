package com.zentraedi.comic.delegate;

import android.text.TextUtils;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.R;
import com.zentraedi.comic.model.ForceRefresh;
import com.zentraedi.comic.request.ComicCancelForceRefreshRequest;
import com.zentraedi.comic.request.ComicCleanForceRefreshRequest;
import com.zentraedi.comic.request.ComicForceRefreshRequest;
import com.zentraedi.comic.request.ComicStartForceRefreshRequest;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class a {

    @fo.l
    private static k2 b;
    private static boolean d;

    @fo.k
    public static final a a = new a();

    @fo.k
    private static ArrayList<Function1<ForceRefresh, Unit>> c = new ArrayList<>();

    @fo.k
    private static String e = "";

    /* JADX INFO: renamed from: com.zentraedi.comic.delegate.a$a, reason: collision with other inner class name */
    public static final class C0118a extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ com.zentraedi.business.listener.l a;

        C0118a(com.zentraedi.business.listener.l lVar) {
            this.a = lVar;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (resp.isSuccess()) {
                this.a.continueDo();
            } else {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
            }
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(R.string.yp2));
        }
    }

    public static final class b extends com.zentraedi.business.http.b<Object> {
        b() {
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (resp.isSuccess()) {
                resp.getData();
            }
        }

        public void onServerError() {
        }
    }

    @SourceDebugExtension({"SMAP\nComicForceRefreshDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicForceRefreshDelegate.kt\ncom/zentraedi/comic/delegate/ComicForceRefreshDelegate$queryForceRefresh$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n1869#2,2:186\n*S KotlinDebug\n*F\n+ 1 ComicForceRefreshDelegate.kt\ncom/zentraedi/comic/delegate/ComicForceRefreshDelegate$queryForceRefresh$1\n*L\n110#1:186,2\n*E\n"})
    public static final class c extends com.zentraedi.business.http.b<ForceRefresh> {
        c() {
        }

        public void onResult(ResponseData<ForceRefresh> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (resp.isSuccess() && resp.getData() != null) {
                if (Intrinsics.areEqual(ForceRefreshState.DONE.getValue(), resp.getData().getState()) || Intrinsics.areEqual(ForceRefreshState.CANCEL.getValue(), resp.getData().getState())) {
                    a aVar = a.a;
                    a.d = false;
                    k2 k2Var = a.b;
                    if (k2Var != null) {
                        k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
                    }
                }
                for (Function1 function1 : a.c) {
                    ForceRefresh data = resp.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                    function1.invoke(data);
                }
            }
        }

        public void onServerError() {
        }
    }

    public static final class d extends com.zentraedi.business.http.b<ForceRefresh> {
        final /* synthetic */ Function1<ForceRefresh, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super ForceRefresh, Unit> function1) {
            this.a = function1;
        }

        public void onResult(ResponseData<ForceRefresh> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (resp.isSuccess() && resp.getData() != null) {
                if (Intrinsics.areEqual(ForceRefreshState.DONE.getValue(), resp.getData().getState()) || Intrinsics.areEqual(ForceRefreshState.CANCEL.getValue(), resp.getData().getState())) {
                    a aVar = a.a;
                    a.d = false;
                    k2 k2Var = a.b;
                    if (k2Var != null) {
                        k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
                    }
                }
                Function1<ForceRefresh, Unit> function1 = this.a;
                ForceRefresh data = resp.getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                function1.invoke(data);
            }
        }

        public void onServerError() {
        }
    }

    public static final class e extends com.zentraedi.business.http.b<Object> {
        e() {
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (resp.isSuccess()) {
                a aVar = a.a;
                a.d = true;
            } else {
                k2 k2Var = a.b;
                if (k2Var != null) {
                    k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
                }
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
            }
        }

        public void onServerError() {
        }
    }

    public static final class f extends com.zentraedi.business.http.b<Object> {
        f() {
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (resp.isSuccess()) {
                return;
            }
            com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
        }

        public void onServerError() {
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.delegate.ComicForceRefreshDelegate$startRepeatingJob$1", f = "ComicForceRefreshDelegate.kt", i = {0}, l = {38}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
    static final class g extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.c, continuation);
            gVar.b = obj;
            return gVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0024  */
        /* JADX WARN: Code duplicated, block: B:12:0x002a  */
        /* JADX WARN: Code duplicated, block: B:15:0x003b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x0042  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0039 -> B:16:0x003c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x0042
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.b
                kotlinx.coroutines.q0 r0 = (kotlinx.coroutines.q0) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r6.a
                r3 = 1
                if (r2 == 0) goto L1b
                if (r2 != r3) goto L13
                kotlin.ResultKt.throwOnFailure(r7)
                goto L3c
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                kotlin.ResultKt.throwOnFailure(r7)
            L1e:
                boolean r7 = com.zentraedi.comic.delegate.a.c()
                if (r7 == 0) goto L2a
                com.zentraedi.comic.delegate.a r7 = com.zentraedi.comic.delegate.a.a
                com.zentraedi.comic.delegate.a.d(r7)
                goto L2f
            L2a:
                com.zentraedi.comic.delegate.a r7 = com.zentraedi.comic.delegate.a.a
                com.zentraedi.comic.delegate.a.f(r7)
            L2f:
                long r4 = r6.c
                r6.b = r0
                r6.a = r3
                java.lang.Object r7 = kotlinx.coroutines.z0.b(r4, r6)
                if (r7 != r1) goto L3c
                return r1
            L3c:
                boolean r7 = kotlinx.coroutines.r0.k(r0)
                if (r7 != 0) goto L1e
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.delegate.a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((g) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private a() {
    }

    private final void h() {
        com.zentraedi.business.http.a.b().h(new ComicCleanForceRefreshRequest(), new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        com.zentraedi.business.http.a.b().h(new ComicForceRefreshRequest(), new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicStartForceRefreshRequest] */
    public final void l() {
        ?? comicStartForceRefreshRequest = new ComicStartForceRefreshRequest();
        if (!TextUtils.isEmpty(e)) {
            comicStartForceRefreshRequest.setDirIds(e);
        }
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) comicStartForceRefreshRequest, new e());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zentraedi.basic.component.http.i, com.zentraedi.comic.request.ComicStartForceRefreshRequest] */
    private final void m(String str) {
        ?? comicStartForceRefreshRequest = new ComicStartForceRefreshRequest();
        if (!TextUtils.isEmpty(str)) {
            comicStartForceRefreshRequest.setDirIds(str);
        }
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) comicStartForceRefreshRequest, new f());
    }

    public static /* synthetic */ void o(a aVar, Function1 function1, long j, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        aVar.n(function1, j, str);
    }

    private final k2 p(long j) {
        return kotlinx.coroutines.i.e(r0.a(g1.c()), (CoroutineContext) null, (CoroutineStart) null, new g(j, null), 3, (Object) null);
    }

    public final void g(@fo.k com.zentraedi.business.listener.l listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.zentraedi.business.http.a.b().h(new ComicCancelForceRefreshRequest(), new C0118a(listener));
    }

    public final void i(@fo.k Function1<? super ForceRefresh, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        c.remove(callBack);
        if (c.size() > 0) {
            return;
        }
        h();
    }

    public final void k(@fo.k Function1<? super ForceRefresh, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        com.zentraedi.business.http.a.b().h(new ComicForceRefreshRequest(), new d(callBack));
    }

    public final void n(@fo.k Function1<? super ForceRefresh, Unit> callBack, long j, @fo.l String str) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (d && !TextUtils.isEmpty(str)) {
            if (str == null) {
                str = "";
            }
            m(str);
            return;
        }
        if (str == null) {
            str = "";
        }
        e = str;
        c.add(callBack);
        k2 k2Var = b;
        if (k2Var == null || !k2Var.isActive()) {
            b = p(j);
        }
    }
}
