package com.zentraedi.outreader.v2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.zentraedi.business.utils.t7;
import com.zentraedi.outreader.model.ChapterM;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.util.ReaderUtils;
import com.zentraedi.reader.reader.LocalPdfBookModel;
import com.zentraedi.reader.reader.PageView;
import com.zentraedi.reader.reader.TxtAttribute;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class t extends com.zentraedi.business.fragment.a {

    @fo.k
    public static final a r = new a(null);

    @fo.k
    private final Lazy n = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.P2(this.a);
        }
    });
    public com.zentraedi.outreader.databinding.s o;
    public com.zentraedi.outreader.reader.e p;
    public com.zentraedi.outreader.adapter.l q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.k
        public final t a() {
            t tVar = new t();
            tVar.setArguments(new Bundle());
            return tVar;
        }

        private a() {
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.PdfMupdfReaderFragment$goPage$1", f = "PdfMupdfReaderFragment.kt", i = {1, 1}, l = {169, 174}, m = "invokeSuspend", n = {"chapters", "isOpenListIndex"}, s = {"L$0", "I$0"}, v = 1)
    static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        Object a;
        Object b;
        int c;
        int d;
        int e;
        int f;
        final /* synthetic */ String h;
        final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, int i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.h = str;
            this.i = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(t tVar) {
            tVar.F2().V().r(Boolean.TRUE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return t.this.new b(this.h, this.i, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int iL2;
            PageView pageView;
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                com.zentraedi.outreader.reader.e eVarH2 = t.this.H2();
                this.f = 1;
                obj = eVarH2.m(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.e;
                iL2 = this.d;
                pageView = (PageView) this.b;
                ResultKt.throwOnFailure(obj);
            }
            pageView.G1(iL2, i, (List) obj, 0.0f);
            View root = t.this.E2().getRoot();
            final t tVar = t.this;
            root.post(new Runnable() { // from class: com.zentraedi.outreader.v2.fragment.u
                @Override // java.lang.Runnable
                public final void run() {
                    t.b.e(tVar);
                }
            });
            return Unit.INSTANCE;
            List list = (List) obj;
            iL2 = t.this.L2(list, this.h);
            if (iL2 < 0) {
                iL2 = 0;
            }
            t.this.E2().E.setReaderDraw(t.this.H2().O());
            PageView pageView2 = t.this.E2().E;
            int i3 = this.i;
            t tVar2 = t.this;
            this.a = SpillingKt.nullOutSpilledVariable(list);
            this.b = pageView2;
            this.c = iL2;
            this.d = iL2;
            this.e = i3;
            this.f = 2;
            obj = tVar2.R2(this);
            if (obj != coroutine_suspended) {
                pageView = pageView2;
                i = i3;
                pageView.G1(iL2, i, (List) obj, 0.0f);
                View root2 = t.this.E2().getRoot();
                final t tVar3 = t.this;
                root2.post(new Runnable() { // from class: com.zentraedi.outreader.v2.fragment.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.b.e(tVar3);
                    }
                });
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.PdfMupdfReaderFragment$loadDocument$1", f = "PdfMupdfReaderFragment.kt", i = {0, 0}, l = {145}, m = "invokeSuspend", n = {"localPdfChapterList", "countPages"}, s = {"L$0", "L$1"}, v = 1)
    static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        Object a;
        Object b;
        int c;

        @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.PdfMupdfReaderFragment$loadDocument$1$1", f = "PdfMupdfReaderFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Boolean>, Object> {
            int a;
            final /* synthetic */ Ref.IntRef b;
            final /* synthetic */ t c;
            final /* synthetic */ List<LocalPdfBookModel.LocalPdfChapter> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ref.IntRef intRef, t tVar, List<LocalPdfBookModel.LocalPdfChapter> list, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = intRef;
                this.c = tVar;
                this.d = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.element = this.c.H2().b();
                return Boxing.boxBoolean(this.d.addAll(this.c.H2().e()));
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Boolean> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return t.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List arrayList;
            Ref.IntRef intRef;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                arrayList = new ArrayList();
                Ref.IntRef intRef2 = new Ref.IntRef();
                kotlinx.coroutines.m0 m0VarC = kotlinx.coroutines.g1.c();
                a aVar = new a(intRef2, t.this, arrayList, null);
                this.a = arrayList;
                this.b = intRef2;
                this.c = 1;
                if (kotlinx.coroutines.i.h(m0VarC, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                intRef = intRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                intRef = (Ref.IntRef) this.b;
                arrayList = (List) this.a;
                ResultKt.throwOnFailure(obj);
            }
            if (t.this.isDetached()) {
                t.this.H2().onDestroy();
                return Unit.INSTANCE;
            }
            t.this.K2(arrayList, intRef.element);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.PdfMupdfReaderFragment", f = "PdfMupdfReaderFragment.kt", i = {0}, l = {252}, m = "reBuildChapters", n = {"list"}, s = {"L$0"}, v = 1)
    static final class d extends ContinuationImpl {
        Object a;
        /* synthetic */ Object b;
        int d;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @fo.l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.b = obj;
            this.d |= IntCompanionObject.MIN_VALUE;
            return t.this.R2(this);
        }
    }

    public static final class e implements com.zentraedi.reader.reader.d {

        @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.PdfMupdfReaderFragment$setListener$1$onChapterChange$1", f = "PdfMupdfReaderFragment.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ t b;
            final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = tVar;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.zentraedi.outreader.reader.e eVarH2 = this.b.H2();
                    this.a = 1;
                    obj = eVarH2.m(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) obj;
                ChapterM.Chapter chapter = (ChapterM.Chapter) CollectionsKt.getOrNull(list, this.c);
                if (chapter == null) {
                    return Unit.INSTANCE;
                }
                this.b.F2().P().r(chapter.f985id);
                BookModel bookModelM = this.b.F2().M();
                if (bookModelM != null) {
                    bookModelM.setRead_chapter(chapter.name);
                }
                BookModel bookModelM2 = this.b.F2().M();
                if (bookModelM2 != null) {
                    bookModelM2.setRead_chapter_id(chapter.f985id);
                }
                BookModel bookModelM3 = this.b.F2().M();
                if (bookModelM3 != null) {
                    bookModelM3.setReadTime(System.currentTimeMillis());
                }
                BookModel bookModelM4 = this.b.F2().M();
                if (bookModelM4 != null) {
                    bookModelM4.setReadProgressPercent(this.b.E2().E.getContentProgress());
                }
                if (this.c == list.size() - 1) {
                    BookModel bookModelM5 = this.b.F2().M();
                    if (bookModelM5 != null) {
                        bookModelM5.setRead_finished(1);
                    }
                } else {
                    BookModel bookModelM6 = this.b.F2().M();
                    if (bookModelM6 != null) {
                        bookModelM6.setRead_finished(0);
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.PdfMupdfReaderFragment$setListener$1$onPageChange$1", f = "PdfMupdfReaderFragment.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ t b;
            final /* synthetic */ com.zentraedi.reader.reader.m c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(t tVar, com.zentraedi.reader.reader.m mVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = tVar;
                this.c = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.zentraedi.outreader.reader.e eVarH2 = this.b.H2();
                    this.a = 1;
                    obj = eVarH2.n(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String str = (String) obj;
                BookModel bookModelM = this.b.F2().M();
                if (bookModelM != null) {
                    bookModelM.setRead_chapter_id(str);
                }
                BookModel bookModelM2 = this.b.F2().M();
                if (bookModelM2 != null) {
                    bookModelM2.setCurrentPageDesc(com.zentraedi.basic.function.utils.a.p(com.zentraedi.outreader.d.q.NK, Boxing.boxInt(this.c.i() + 1)));
                }
                androidx.lifecycle.d1<Integer> d1VarU = this.b.F2().U();
                Integer num = (Integer) this.b.F2().U().f();
                d1VarU.r(num != null ? Boxing.boxInt(num.intValue() + 1) : null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        e() {
        }

        @Override // com.zentraedi.reader.reader.d
        public void F1(int i, int i2) {
            com.zentraedi.reader.reader.m currentPage = t.this.E2().E.getCurrentPage();
            BookModel bookModelM = t.this.F2().M();
            if (bookModelM != null) {
                bookModelM.setRead_page(currentPage.f() + "");
            }
            BookModel bookModelM2 = t.this.F2().M();
            if (bookModelM2 != null) {
                bookModelM2.setReadTime(System.currentTimeMillis());
            }
            BookModel bookModelM3 = t.this.F2().M();
            if (bookModelM3 != null) {
                bookModelM3.setReadProgressPercent(t.this.E2().E.getContentProgress());
            }
            t7.j(gh.b.X, com.zentraedi.basic.component.utils.a.b().toJson(t.this.F2().M()));
            kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(t.this), (CoroutineContext) null, (CoroutineStart) null, new b(t.this, currentPage, null), 3, (Object) null);
        }

        @Override // com.zentraedi.reader.reader.d
        public void L0(int i, int i2, int i3) {
        }

        @Override // com.zentraedi.reader.reader.d
        public void m1(int i, int i2) {
            kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(t.this), (CoroutineContext) null, (CoroutineStart) null, new a(t.this, i2, null), 3, (Object) null);
        }
    }

    public static final class f implements PageView.u {
        f() {
        }

        @Override // com.zentraedi.reader.reader.PageView.u
        public void a() {
            t.this.F2().W().r(Boolean.valueOf(!Intrinsics.areEqual(t.this.F2().W().f(), Boolean.TRUE)));
        }

        @Override // com.zentraedi.reader.reader.PageView.u
        public boolean b() {
            return Intrinsics.areEqual(t.this.F2().W().f(), Boolean.TRUE);
        }

        @Override // com.zentraedi.reader.reader.PageView.u
        public void c(boolean z, int i) {
        }

        @Override // com.zentraedi.reader.reader.PageView.u
        public void cancel() {
        }

        @Override // com.zentraedi.reader.reader.PageView.u
        public void d() {
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.outreader.d.q.iA2);
        }
    }

    private final TxtAttribute I2() {
        TxtAttribute txtAttribute = new TxtAttribute();
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = F2().M();
        int iU = aVar.u(bookModelM != null ? bookModelM.getBookFileType() : null);
        H2().z(iU);
        txtAttribute.setPageMode(iU);
        BookModel bookModelM2 = F2().M();
        txtAttribute.setBackgroundColorId(aVar.d(aVar.c(bookModelM2 != null ? bookModelM2.getBookFileType() : null)));
        BookModel bookModelM3 = F2().M();
        txtAttribute.setBackgroundImageId(aVar.f(bookModelM3 != null ? bookModelM3.getBookFileType() : null));
        Boolean bool = (Boolean) t7.d(gh.b.T, Boolean.FALSE);
        Intrinsics.checkNotNull(bool);
        txtAttribute.setClickLeftGoNext(bool.booleanValue());
        return txtAttribute;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K2(List<LocalPdfBookModel.LocalPdfChapter> list, int i) {
        if (F2().M() == null) {
            return;
        }
        E2().E.f2(list);
        E2().E.setCountPages(i);
        BookModel bookModelM = F2().M();
        Intrinsics.checkNotNull(bookModelM);
        String recordReadChapterId = bookModelM.getRecordReadChapterId();
        BookModel bookModelM2 = F2().M();
        J2(recordReadChapterId, bookModelM2 != null ? bookModelM2.getReadPageInt() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int L2(List<? extends ChapterM.Chapter> list, String str) {
        List<? extends ChapterM.Chapter> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.areEqual(list.get(i).f985id, str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private final void M2() {
        E2().E.setFileType(1);
        H2().N(E2().E);
        E2().E.d1(I2());
        Lifecycle lifecycle = getLifecycle();
        PageView pvRead = E2().E;
        Intrinsics.checkNotNullExpressionValue(pvRead, "pvRead");
        lifecycle.c(pvRead);
        com.zentraedi.outreader.adapter.l lVar = new com.zentraedi.outreader.adapter.l(getContext(), "");
        Object objD = t7.d(gh.b.f0, 3);
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        lVar.U(((Number) objD).intValue());
        Object objD2 = t7.d(gh.b.g0, 0);
        Intrinsics.checkNotNullExpressionValue(objD2, "get(...)");
        lVar.W(((Number) objD2).intValue());
        U2(lVar);
        E2().E.setAdapter(G2());
        N2();
        S2();
    }

    private final void N2() {
        if (F2().M() == null) {
            return;
        }
        O2();
    }

    private final void O2() {
        if (F2().M() == null) {
            return;
        }
        nd.a.e("nas_book", "PdfMupdfReaderFragment->loadDocument ");
        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(this), (CoroutineContext) null, (CoroutineStart) null, new c(null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.d P2(t tVar) {
        FragmentActivity fragmentActivityRequireActivity = tVar.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new androidx.lifecycle.m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(t tVar) {
        tVar.M2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R2(Continuation<? super ArrayList<com.zentraedi.reader.reader.k>> continuation) {
        d dVar;
        ArrayList arrayList;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.d;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                dVar.d = i - IntCompanionObject.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = dVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList2 = new ArrayList();
            com.zentraedi.outreader.reader.e eVarH2 = H2();
            dVar.a = arrayList2;
            dVar.d = 1;
            Object objM = eVarH2.m(dVar);
            if (objM == coroutine_suspended) {
                return coroutine_suspended;
            }
            arrayList = arrayList2;
            obj = objM;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (ArrayList) dVar.a;
            ResultKt.throwOnFailure(obj);
        }
        List<ChapterM.Chapter> list = (List) obj;
        if (!com.zentraedi.basic.function.utils.j0.l(list)) {
            for (ChapterM.Chapter chapter : list) {
                com.zentraedi.reader.reader.k kVar = new com.zentraedi.reader.reader.k();
                kVar.d = chapter.f985id;
                kVar.e = chapter.name;
                Integer numG = com.zentraedi.outreader.util.d.g(chapter.words);
                Intrinsics.checkNotNullExpressionValue(numG, "toInt(...)");
                kVar.i = numG.intValue();
                BookModel bookModelM = F2().M();
                Intrinsics.checkNotNull(bookModelM);
                kVar.h = bookModelM.getWordCountInt();
                BookModel bookModelM2 = F2().M();
                Intrinsics.checkNotNull(bookModelM2);
                kVar.b = bookModelM2.getNasFileName();
                BookModel bookModelM3 = F2().M();
                Intrinsics.checkNotNull(bookModelM3);
                kVar.c = bookModelM3.getBookType();
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    @fo.k
    public final com.zentraedi.outreader.databinding.s E2() {
        com.zentraedi.outreader.databinding.s sVar = this.o;
        if (sVar != null) {
            return sVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    @fo.k
    public final com.zentraedi.outreader.viewmodel.d F2() {
        return (com.zentraedi.outreader.viewmodel.d) this.n.getValue();
    }

    @fo.k
    public final com.zentraedi.outreader.adapter.l G2() {
        com.zentraedi.outreader.adapter.l lVar = this.q;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mReadAdapter");
        return null;
    }

    @fo.k
    public final com.zentraedi.outreader.reader.e H2() {
        com.zentraedi.outreader.reader.e eVar = this.p;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mZReader");
        return null;
    }

    public final void J2(@fo.k String chapterId, int i) {
        Intrinsics.checkNotNullParameter(chapterId, "chapterId");
        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(this), (CoroutineContext) null, (CoroutineStart) null, new b(chapterId, i, null), 3, (Object) null);
    }

    public final void S2() {
        E2().E.setOnPageChangeListener(new e());
        E2().E.setTouchListener(new f());
    }

    public final void T2(@fo.k com.zentraedi.outreader.databinding.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
        this.o = sVar;
    }

    public final void U2(@fo.k com.zentraedi.outreader.adapter.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.q = lVar;
    }

    public final void V2(@fo.k com.zentraedi.outreader.reader.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.p = eVar;
    }

    public void onCreate(@fo.l Bundle bundle) {
        super.onCreate(bundle);
        if (F2().M() != null && (F2().Y() instanceof com.zentraedi.outreader.reader.e)) {
            com.zentraedi.outreader.reader.h hVarY = F2().Y();
            Intrinsics.checkNotNull(hVarY, "null cannot be cast to non-null type com.zentraedi.outreader.reader.PdfPageViewZReader");
            V2((com.zentraedi.outreader.reader.e) hVarY);
        }
    }

    @fo.l
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super/*androidx.fragment.app.Fragment*/.onCreateView(inflater, viewGroup, bundle);
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(inflater, com.zentraedi.outreader.d.l.T5, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        T2((com.zentraedi.outreader.databinding.s) c0VarJ);
        return E2().getRoot();
    }

    public void onDestroyView() {
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        E2().E.Q0();
        Lifecycle lifecycle = getLifecycle();
        PageView pvRead = E2().E;
        Intrinsics.checkNotNullExpressionValue(pvRead, "pvRead");
        lifecycle.g(pvRead);
    }

    public void onViewCreated(@fo.k View view, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        E2().getRoot().post(new Runnable() { // from class: com.zentraedi.outreader.v2.fragment.s
            @Override // java.lang.Runnable
            public final void run() {
                t.Q2(this.a);
            }
        });
    }
}
