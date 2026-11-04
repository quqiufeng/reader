package com.zentraedi.comic;

import androidx.lifecycle.d1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.w0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nZipFileDownLoad.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileDownLoad.kt\ncom/zentraedi/comic/CoroutineTaskQueue\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,294:1\n1869#2,2:295\n1#3:297\n*S KotlinDebug\n*F\n+ 1 ZipFileDownLoad.kt\ncom/zentraedi/comic/CoroutineTaskQueue\n*L\n281#1:295,2\n*E\n"})
public final class h {

    @fo.k
    public static final a e = new a(null);
    private static final int f = 10;
    private final int a;

    @fo.k
    private final LinkedList<k2> b = new LinkedList<>();

    @fo.k
    private final Map<k2, Integer> c = new LinkedHashMap();

    @fo.k
    private final d1<Pair<String, Boolean>> d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.CoroutineTaskQueue$enqueue$job$1", f = "ZipFileDownLoad.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class b extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ Function1<Continuation<? super T>, Object> b;
        final /* synthetic */ kotlinx.coroutines.x<T> c;
        final /* synthetic */ h d;
        final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Continuation<? super T>, ? extends Object> function1, kotlinx.coroutines.x<T> xVar, h hVar, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = function1;
            this.c = xVar;
            this.d = hVar;
            this.e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, this.e, continuation);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.zentraedi.comic.h$b for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.a
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
                goto L29
            Lf:
                r4 = move-exception
                goto L4b
            L11:
                r4 = move-exception
                goto L42
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L1b:
                kotlin.ResultKt.throwOnFailure(r4)
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> r4 = r3.b     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
                r3.a = r2     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
                java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
                if (r4 != r0) goto L29
                return r0
            L29:
                kotlinx.coroutines.x<T> r0 = r3.c     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
                r0.c(r4)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            L2e:
                com.zentraedi.comic.h r4 = r3.d
                androidx.lifecycle.d1 r4 = r4.h()
                java.lang.String r0 = r3.e
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
                r4.o(r0)
                goto L48
            L42:
                kotlinx.coroutines.x<T> r0 = r3.c     // Catch: java.lang.Throwable -> Lf
                r0.b(r4)     // Catch: java.lang.Throwable -> Lf
                goto L2e
            L48:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L4b:
                com.zentraedi.comic.h r0 = r3.d
                androidx.lifecycle.d1 r0 = r0.h()
                java.lang.String r1 = r3.e
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)
                r0.o(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public h(int i) {
        this.a = i;
        d1<Pair<String, Boolean>> d1Var = new d1<>();
        this.d = d1Var;
        d1Var.l(new b0.b(new Function1() { // from class: com.zentraedi.comic.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.b(this.a, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(h hVar, Pair pair) {
        Object next;
        if (((Boolean) pair.component2()).booleanValue()) {
            Iterator<T> it = hVar.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((k2) next).y());
            k2 k2Var = (k2) next;
            if (k2Var != null) {
                hVar.b.remove(k2Var);
                hVar.c.remove(k2Var);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ w0 f(h hVar, String str, Function1 function1, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return hVar.e(str, function1, i);
    }

    public final void c(@fo.k k2 job) {
        Intrinsics.checkNotNullParameter(job, "job");
        if (job.isActive()) {
            k2.a.b(job, (CancellationException) null, 1, (Object) null);
            this.b.remove(job);
            this.c.remove(job);
        }
    }

    public final void d() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            k2.a.b((k2) it.next(), (CancellationException) null, 1, (Object) null);
        }
        this.b.clear();
        this.c.clear();
    }

    @fo.k
    public final <T> w0<T> e(@fo.k String key, @fo.k Function1<? super Continuation<? super T>, ? extends Object> task, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(task, "task");
        int i2 = 0;
        if (this.b.size() >= 10) {
            k2 k2Var = (k2) CollectionsKt.last((List) this.b);
            Integer num = this.c.get(k2Var);
            if (i <= (num != null ? num.intValue() : 0)) {
                kotlinx.coroutines.x xVarC = kotlinx.coroutines.z.c((k2) null, 1, (Object) null);
                xVarC.a(new CancellationException("Task queue is full and new task has lower priority"));
                return xVarC;
            }
            this.b.removeLast();
            this.c.remove(k2Var);
            k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
        }
        kotlinx.coroutines.x xVarC2 = kotlinx.coroutines.z.c((k2) null, 1, (Object) null);
        k2 k2VarE = kotlinx.coroutines.i.e(a2.a, (CoroutineContext) null, (CoroutineStart) null, new b(task, xVarC2, this, key, null), 3, (Object) null);
        int size = this.b.size();
        for (int i3 = 0; i3 < size; i3++) {
            Integer num2 = this.c.get(this.b.get(i3));
            if (num2 == null || i > num2.intValue()) {
                i2 = i3;
                break;
            }
        }
        this.b.add(i2, k2VarE);
        this.c.put(k2VarE, Integer.valueOf(i));
        return xVarC2;
    }

    @fo.l
    public final k2 g() {
        return this.b.pollLast();
    }

    @fo.k
    public final d1<Pair<String, Boolean>> h() {
        return this.d;
    }
}
