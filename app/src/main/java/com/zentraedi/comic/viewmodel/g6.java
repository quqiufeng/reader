package com.zentraedi.comic.viewmodel;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import com.zentraedi.business.model.BasicFileInterface;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.comic.manager.ComicDownloadManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicSubDirViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicSubDirViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicSubDirViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n1869#2,2:159\n1869#2,2:161\n1563#2:163\n1634#2,3:164\n*S KotlinDebug\n*F\n+ 1 ComicSubDirViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicSubDirViewModel\n*L\n67#1:159,2\n102#1:161,2\n150#1:163\n150#1:164,3\n*E\n"})
public final class g6 extends com.zentraedi.basic.function.viewmodel.f<Object> {

    @fo.l
    private String a;

    @fo.l
    private String b;

    @fo.k
    private final ObservableField<String> c;

    @fo.k
    private final ObservableField<Boolean> d;

    @fo.l
    private ComicInfoModel e;

    @fo.k
    private ObservableField<Boolean> f;

    @fo.k
    private final ObservableField<String> g;

    @fo.k
    private final ObservableField<Boolean> h;

    @fo.k
    private final ObservableField<String> i;

    @fo.k
    private final ObservableField<String> j;

    @fo.k
    private final ObservableField<String> k;

    @fo.k
    private final ObservableField<Boolean> l;

    @fo.k
    private final ObservableField<Boolean> m;

    @fo.k
    private final ObservableField<Boolean> n;

    @fo.k
    private final ObservableArrayList<l0> o;

    @fo.k
    private final ObservableArrayList<l0> p;
    private int q;

    @fo.k
    private Function2<? super Integer, ? super Integer, Unit> r;

    @fo.k
    private final Lazy s;

    @fo.k
    private ObservableField<Boolean> t;

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicSubDirViewModel$onDownloadStart$2", f = "ComicSubDirViewModel.kt", i = {0, 1}, l = {134, 137}, m = "invokeSuspend", n = {"list", "list"}, s = {"L$0", "L$0"}, v = 1)
    static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        Object a;
        int b;
        final /* synthetic */ ArrayList<l0> c;
        final /* synthetic */ g6 d;
        final /* synthetic */ ArrayList<l0> e;
        final /* synthetic */ Function1<Boolean, Unit> f;

        /* JADX INFO: renamed from: com.zentraedi.comic.viewmodel.g6$a$a, reason: collision with other inner class name */
        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicSubDirViewModel$onDownloadStart$2$1", f = "ComicSubDirViewModel.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {119, 124, 130}, m = "invokeSuspend", n = {"$this$flow", "comicInfo", "$this$flow", "$this$forEach$iv", "element$iv", "it", "comicInfo", "$i$f$forEach", "$i$a$-forEach-ComicSubDirViewModel$onDownloadStart$2$1$1", "$i$a$-let-ComicSubDirViewModel$onDownloadStart$2$1$1$1", "$this$flow", "$this$forEach$iv", "element$iv", "it", "comicInfo", "realDirId", "$i$f$forEach", "$i$a$-forEach-ComicSubDirViewModel$onDownloadStart$2$1$1", "$i$a$-run-ComicSubDirViewModel$onDownloadStart$2$1$1$2"}, s = {"L$0", "L$1", "L$0", "L$1", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "L$0", "L$1", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2"}, v = 1)
        @SourceDebugExtension({"SMAP\nComicSubDirViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicSubDirViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicSubDirViewModel$onDownloadStart$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n1869#2,2:159\n*S KotlinDebug\n*F\n+ 1 ComicSubDirViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicSubDirViewModel$onDownloadStart$2$1\n*L\n122#1:159,2\n*E\n"})
        static final class C0131a extends SuspendLambda implements Function2<kotlinx.coroutines.flow.j<? super Pair<? extends ComicInfoModel, ? extends List<? extends ComicDownloadManager.ComicFileInfo>>>, Continuation<? super Unit>, Object> {
            Object a;
            Object b;
            Object c;
            Object d;
            Object e;
            Object f;
            Object g;
            int h;
            int i;
            int j;
            int k;
            private /* synthetic */ Object l;
            final /* synthetic */ ArrayList<l0> m;
            final /* synthetic */ g6 n;
            final /* synthetic */ ArrayList<l0> o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0131a(ArrayList<l0> arrayList, g6 g6Var, ArrayList<l0> arrayList2, Continuation<? super C0131a> continuation) {
                super(2, continuation);
                this.m = arrayList;
                this.n = g6Var;
                this.o = arrayList2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0131a c0131a = new C0131a(this.m, this.n, this.o, continuation);
                c0131a.l = obj;
                return c0131a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.j<? super Pair<? extends ComicInfoModel, ? extends List<? extends ComicDownloadManager.ComicFileInfo>>> jVar, Continuation<? super Unit> continuation) {
                return invoke2((kotlinx.coroutines.flow.j<? super Pair<ComicInfoModel, ? extends List<ComicDownloadManager.ComicFileInfo>>>) jVar, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x00b7  */
            /* JADX WARN: Code duplicated, block: B:27:0x0101  */
            /* JADX WARN: Code duplicated, block: B:29:0x010b  */
            /* JADX WARN: Code duplicated, block: B:31:0x0111  */
            /* JADX WARN: Code duplicated, block: B:32:0x0116  */
            /* JADX WARN: Code duplicated, block: B:35:0x0128  */
            /* JADX WARN: Code duplicated, block: B:41:0x016d A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:42:0x016c A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:0: B:20:0x00b1->B:46:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x016d -> B:20:0x00b1). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    Method dump skipped, instruction units count: 371
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.viewmodel.g6.a.C0131a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(kotlinx.coroutines.flow.j<? super Pair<ComicInfoModel, ? extends List<ComicDownloadManager.ComicFileInfo>>> jVar, Continuation<? super Unit> continuation) {
                return ((C0131a) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        static final class b<T> implements kotlinx.coroutines.flow.j {
            final /* synthetic */ ArrayList<Pair<ComicInfoModel, List<BasicFileInterface>>> a;

            b(ArrayList<Pair<ComicInfoModel, List<BasicFileInterface>>> arrayList) {
                this.a = arrayList;
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Pair<ComicInfoModel, ? extends List<ComicDownloadManager.ComicFileInfo>> pair, Continuation<? super Unit> continuation) {
                this.a.add(pair);
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicSubDirViewModel$onDownloadStart$2$3", f = "ComicSubDirViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ ArrayList<Pair<ComicInfoModel, List<BasicFileInterface>>> b;
            final /* synthetic */ Function1<Boolean, Unit> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(ArrayList<Pair<ComicInfoModel, List<BasicFileInterface>>> arrayList, Function1<? super Boolean, Unit> function1, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = arrayList;
                this.c = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function1 function1, boolean z) {
                function1.invoke(Boolean.valueOf(z));
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.b.isEmpty()) {
                    this.c.invoke(Boxing.boxBoolean(true));
                } else {
                    this.c.invoke(Boxing.boxBoolean(false));
                    ComicDownloadManager comicDownloadManagerA = ComicDownloadManager.c.a();
                    ArrayList<Pair<ComicInfoModel, List<BasicFileInterface>>> arrayList = this.b;
                    final Function1<Boolean, Unit> function1 = this.c;
                    comicDownloadManagerA.h(arrayList, new Function1() { // from class: com.zentraedi.comic.viewmodel.h6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return g6.a.c.e(function1, ((Boolean) obj2).booleanValue());
                        }
                    });
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ArrayList<l0> arrayList, g6 g6Var, ArrayList<l0> arrayList2, Function1<? super Boolean, Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = arrayList;
            this.d = g6Var;
            this.e = arrayList2;
            this.f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.c, this.d, this.e, this.f, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
        
            if (kotlinx.coroutines.i.h(r9, r4, r8) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.b
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                java.lang.Object r0 = r8.a
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                kotlin.ResultKt.throwOnFailure(r9)
                goto L68
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.a
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                kotlin.ResultKt.throwOnFailure(r9)
                goto L4e
            L27:
                kotlin.ResultKt.throwOnFailure(r9)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                com.zentraedi.comic.viewmodel.g6$a$a r9 = new com.zentraedi.comic.viewmodel.g6$a$a
                java.util.ArrayList<com.zentraedi.comic.viewmodel.l0> r5 = r8.c
                com.zentraedi.comic.viewmodel.g6 r6 = r8.d
                java.util.ArrayList<com.zentraedi.comic.viewmodel.l0> r7 = r8.e
                r9.<init>(r5, r6, r7, r2)
                kotlinx.coroutines.flow.i r9 = kotlinx.coroutines.flow.k.K0(r9)
                com.zentraedi.comic.viewmodel.g6$a$b r5 = new com.zentraedi.comic.viewmodel.g6$a$b
                r5.<init>(r1)
                r8.a = r1
                r8.b = r4
                java.lang.Object r9 = r9.collect(r5, r8)
                if (r9 != r0) goto L4e
                goto L67
            L4e:
                kotlinx.coroutines.u2 r9 = kotlinx.coroutines.g1.e()
                com.zentraedi.comic.viewmodel.g6$a$c r4 = new com.zentraedi.comic.viewmodel.g6$a$c
                kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r5 = r8.f
                r4.<init>(r1, r5, r2)
                java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
                r8.a = r1
                r8.b = r3
                java.lang.Object r9 = kotlinx.coroutines.i.h(r9, r4, r8)
                if (r9 != r0) goto L68
            L67:
                return r0
            L68:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.viewmodel.g6.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public g6() {
        super(com.zentraedi.basic.function.utils.a.c());
        this.c = new ObservableField<>();
        Boolean bool = Boolean.FALSE;
        this.d = new ObservableField<>(bool);
        this.f = new ObservableField<>(bool);
        this.g = new ObservableField<>("");
        this.h = new ObservableField<>(bool);
        this.i = new ObservableField<>();
        this.j = new ObservableField<>(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Lt2));
        this.k = new ObservableField<>(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.aB1));
        this.l = new ObservableField<>(bool);
        this.m = new ObservableField<>(bool);
        this.n = new ObservableField<>(bool);
        this.o = new ObservableArrayList<>();
        this.p = new ObservableArrayList<>();
        this.r = new Function2() { // from class: com.zentraedi.comic.viewmodel.e6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g6.t0(this.a, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        };
        this.s = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.f6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g6.l0();
            }
        });
        this.t = new ObservableField<>(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ComicDownloadManager.ComicFileInfo> Q(List<l0> list) {
        List<l0> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (l0 l0Var : list2) {
            ComicDownloadManager.ComicFileInfo comicFileInfo = new ComicDownloadManager.ComicFileInfo();
            comicFileInfo.setPath(l0Var.getPath());
            comicFileInfo.setFolder(l0Var.b0());
            arrayList.add(comicFileInfo);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.comic.business.x1 V() {
        return (com.zentraedi.comic.business.x1) this.s.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.x1 l0() {
        return new com.zentraedi.comic.business.x1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(g6 g6Var, int i, int i2) {
        g6Var.k.set(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.Oa0, Integer.valueOf(i)));
        g6Var.q = i2;
        return Unit.INSTANCE;
    }

    public final void P(boolean z) {
        this.l.set(Boolean.valueOf(z));
        this.o.clear();
        this.p.clear();
    }

    @fo.k
    public final ObservableField<String> R() {
        return this.g;
    }

    public final int S() {
        return this.q;
    }

    @fo.l
    public final String T() {
        return this.a;
    }

    @fo.k
    public final ObservableArrayList<l0> U() {
        return this.p;
    }

    @fo.l
    public final ComicInfoModel W() {
        return this.e;
    }

    @fo.k
    public final ObservableField<Boolean> X() {
        return this.l;
    }

    @fo.k
    public final ObservableArrayList<l0> Y() {
        return this.o;
    }

    @fo.k
    public final ObservableField<String> Z() {
        return this.j;
    }

    @fo.k
    public final ObservableField<String> b0() {
        return this.i;
    }

    @fo.k
    public final ObservableField<Boolean> c0() {
        return this.d;
    }

    @fo.k
    public final ObservableField<Boolean> d0() {
        return this.n;
    }

    @fo.k
    public final Function2<Integer, Integer, Unit> e0() {
        return this.r;
    }

    @fo.k
    public final ObservableField<String> f0() {
        return this.k;
    }

    @fo.k
    public final ObservableField<Boolean> g0() {
        return this.f;
    }

    @fo.l
    public final String getPath() {
        return this.b;
    }

    @fo.k
    public final ObservableField<String> getTitle() {
        return this.c;
    }

    @fo.k
    public final ObservableField<Boolean> h0() {
        return this.t;
    }

    @fo.k
    public final ObservableField<Boolean> i0() {
        return this.m;
    }

    @fo.k
    public final ObservableField<Boolean> j0() {
        return this.h;
    }

    public final void k0() {
        ObservableField<Boolean> observableField = this.m;
        int i = this.q;
        observableField.set(Boolean.valueOf(i > 0 && i == this.o.size()));
    }

    public final void m0(@fo.k Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (l0 l0Var : this.p) {
            if (l0Var.b0() || com.zentraedi.business.utils.i5.a.n(l0Var.getPath())) {
                arrayList2.add(l0Var);
            } else {
                arrayList.add(l0Var);
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            callback.invoke(Boolean.TRUE);
        } else {
            kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.c()), (CoroutineContext) null, (CoroutineStart) null, new a(arrayList, this, arrayList2, callback, null), 3, (Object) null);
        }
    }

    public final void n0(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.f = observableField;
    }

    public final void o0(int i) {
        this.q = i;
    }

    public final void p0(@fo.l String str) {
        this.a = str;
    }

    public final void q0(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.t = observableField;
    }

    public final void r0(@fo.l ComicInfoModel comicInfoModel) {
        this.e = comicInfoModel;
    }

    public final void s0(@fo.k Function2<? super Integer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.r = function2;
    }

    public final void setPath(@fo.l String str) {
        this.b = str;
    }

    public final void u0(@fo.k List<l0> model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.isEmpty()) {
            this.o.clear();
            this.p.clear();
        }
        for (l0 l0Var : model) {
            if (Intrinsics.areEqual(l0Var.X().get(), Boolean.TRUE)) {
                if (!this.o.contains(l0Var)) {
                    this.o.add(l0Var);
                }
                if (!this.p.contains(l0Var) && l0Var.e0()) {
                    this.p.add(l0Var);
                }
            } else {
                this.o.remove(l0Var);
                this.p.remove(l0Var);
            }
        }
        if (this.o.isEmpty()) {
            this.j.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Lt2));
        } else {
            this.j.set(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.Wt0, Integer.valueOf(this.o.size())));
        }
        k0();
    }
}
