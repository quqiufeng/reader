package com.zentraedi.outreader.v2.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.zentraedi.business.utils.t7;
import com.zentraedi.outreader.model.ChapterM;
import com.zentraedi.outreader.model.LocalTxtBookModel;
import com.zentraedi.outreader.model.SectionContentEntity;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.util.ReaderUtils;
import com.zentraedi.reader.reader.PageView;
import com.zentraedi.reader.reader.TxtAttribute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class w2 extends com.zentraedi.business.fragment.a {

    @fo.k
    public static final a r = new a(null);

    @fo.k
    private final Lazy n = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.u2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return w2.N2(this.a);
        }
    });
    public com.zentraedi.outreader.databinding.s o;
    public com.zentraedi.outreader.reader.g p;
    public com.zentraedi.outreader.adapter.l q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.k
        public final w2 a() {
            w2 w2Var = new w2();
            w2Var.setArguments(new Bundle());
            return w2Var;
        }

        private a() {
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.TxtReaderFragment$goPage$1", f = "TxtReaderFragment.kt", i = {1, 1, 1}, l = {171, 187}, m = "invokeSuspend", n = {"chapters", "sectionEntities", "isOpenListIndex"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    @SourceDebugExtension({"SMAP\nTxtReaderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TxtReaderFragment.kt\ncom/zentraedi/outreader/v2/fragment/TxtReaderFragment$goPage$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,336:1\n1869#2,2:337\n*S KotlinDebug\n*F\n+ 1 TxtReaderFragment.kt\ncom/zentraedi/outreader/v2/fragment/TxtReaderFragment$goPage$1\n*L\n177#1:337,2\n*E\n"})
    static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        Object a;
        Object b;
        Object c;
        int d;
        int e;
        int f;
        int g;
        final /* synthetic */ String i;
        final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, int i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.i = str;
            this.j = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(w2 w2Var) {
            w2Var.G2().V().r(Boolean.TRUE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return w2.this.new b(this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int iL2;
            PageView pageView;
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.g;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                com.zentraedi.outreader.reader.g gVarI2 = w2.this.I2();
                this.g = 1;
                obj = gVarI2.m(this);
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
                i = this.f;
                iL2 = this.e;
                pageView = (PageView) this.c;
                ResultKt.throwOnFailure(obj);
            }
            pageView.I1(iL2, i, (List) obj);
            View root = w2.this.F2().getRoot();
            final w2 w2Var = w2.this;
            root.post(new Runnable() { // from class: com.zentraedi.outreader.v2.fragment.x2
                @Override // java.lang.Runnable
                public final void run() {
                    w2.b.e(w2Var);
                }
            });
            return Unit.INSTANCE;
            List list = (List) obj;
            iL2 = w2.this.L2(list, this.i);
            if (iL2 < 0) {
                iL2 = 0;
            }
            List<SectionContentEntity> listL = com.zentraedi.outreader.v2.local.a.f.a().l();
            List<SectionContentEntity> mutableList = listL != null ? CollectionsKt.toMutableList((Collection) listL) : null;
            w2.this.H2().I();
            if (mutableList != null) {
                w2 w2Var2 = w2.this;
                for (SectionContentEntity sectionContentEntity : mutableList) {
                    w2Var2.H2().H(w2Var2.L2(list, sectionContentEntity.getSectionId()), sectionContentEntity);
                }
            }
            PageView pageView2 = w2.this.F2().E;
            int i3 = this.j;
            w2 w2Var3 = w2.this;
            this.a = SpillingKt.nullOutSpilledVariable(list);
            this.b = SpillingKt.nullOutSpilledVariable(mutableList);
            this.c = pageView2;
            this.d = iL2;
            this.e = iL2;
            this.f = i3;
            this.g = 2;
            obj = w2Var3.P2(this);
            if (obj != coroutine_suspended) {
                pageView = pageView2;
                i = i3;
                pageView.I1(iL2, i, (List) obj);
                View root2 = w2.this.F2().getRoot();
                final w2 w2Var4 = w2.this;
                root2.post(new Runnable() { // from class: com.zentraedi.outreader.v2.fragment.x2
                    @Override // java.lang.Runnable
                    public final void run() {
                        w2.b.e(w2Var4);
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

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.TxtReaderFragment", f = "TxtReaderFragment.kt", i = {0}, l = {293}, m = "reBuildChapters", n = {"list"}, s = {"L$0"}, v = 1)
    static final class c extends ContinuationImpl {
        Object a;
        /* synthetic */ Object b;
        int d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @fo.l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.b = obj;
            this.d |= IntCompanionObject.MIN_VALUE;
            return w2.this.P2(this);
        }
    }

    @SourceDebugExtension({"SMAP\nTxtReaderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TxtReaderFragment.kt\ncom/zentraedi/outreader/v2/fragment/TxtReaderFragment$setListener$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,336:1\n1179#2,2:337\n*S KotlinDebug\n*F\n+ 1 TxtReaderFragment.kt\ncom/zentraedi/outreader/v2/fragment/TxtReaderFragment$setListener$1\n*L\n235#1:337,2\n*E\n"})
    public static final class d implements com.zentraedi.reader.reader.d {

        @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.TxtReaderFragment$setListener$1$onChapterChange$1", f = "TxtReaderFragment.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ w2 b;
            final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w2 w2Var, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = w2Var;
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
                    com.zentraedi.outreader.reader.g gVarI2 = this.b.I2();
                    this.a = 1;
                    obj = gVarI2.m(this);
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
                this.b.G2().P().r(chapter.f985id);
                BookModel bookModelM = this.b.G2().M();
                if (bookModelM != null) {
                    bookModelM.setRead_chapter(chapter.name);
                }
                BookModel bookModelM2 = this.b.G2().M();
                if (bookModelM2 != null) {
                    bookModelM2.setRead_chapter_id(chapter.f985id);
                }
                BookModel bookModelM3 = this.b.G2().M();
                if (bookModelM3 != null) {
                    bookModelM3.setReadTime(System.currentTimeMillis());
                }
                BookModel bookModelM4 = this.b.G2().M();
                if (bookModelM4 != null) {
                    bookModelM4.setReadProgressPercent(this.b.F2().E.getContentProgress());
                }
                if (this.c == list.size() - 1) {
                    BookModel bookModelM5 = this.b.G2().M();
                    if (bookModelM5 != null) {
                        bookModelM5.setRead_finished(1);
                    }
                } else {
                    BookModel bookModelM6 = this.b.G2().M();
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

        @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.TxtReaderFragment$setListener$1$onPageChange$2", f = "TxtReaderFragment.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ w2 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w2 w2Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = w2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.zentraedi.outreader.reader.g gVarI2 = this.b.I2();
                    this.a = 1;
                    obj = gVarI2.n(this);
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
                BookModel bookModelM = this.b.G2().M();
                if (bookModelM != null) {
                    bookModelM.setRead_chapter_id(str);
                }
                androidx.lifecycle.d1<Integer> d1VarU = this.b.G2().U();
                Integer num = (Integer) this.b.G2().U().f();
                d1VarU.r(num != null ? Boxing.boxInt(num.intValue() + 1) : null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        d() {
        }

        @Override // com.zentraedi.reader.reader.d
        public void F1(int i, int i2) {
            com.zentraedi.reader.reader.m currentPage = w2.this.F2().E.getCurrentPage();
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = currentPage.e().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                if (sb.length() >= 50) {
                    sb.setLength(50);
                    break;
                }
            }
            String string = sb.toString();
            com.zentraedi.business.fragment.a aVar = w2.this;
            for (int i3 = 0; i3 < string.length(); i3++) {
                char cCharAt = string.charAt(i3);
                Log.d(aVar.i, "onPageChange: " + cCharAt);
            }
            BookModel bookModelM = w2.this.G2().M();
            if (bookModelM != null) {
                bookModelM.setCurrentPageDesc(StringsKt.trim(StringsKt.replace$default(string, "\n", "\t", false, 4, (Object) null)).toString());
            }
            int iF = currentPage.f();
            BookModel bookModelM2 = w2.this.G2().M();
            if (bookModelM2 != null) {
                bookModelM2.setRead_page(iF + "");
            }
            BookModel bookModelM3 = w2.this.G2().M();
            if (bookModelM3 != null) {
                bookModelM3.setReadTime(System.currentTimeMillis());
            }
            BookModel bookModelM4 = w2.this.G2().M();
            if (bookModelM4 != null) {
                bookModelM4.setReadProgressPercent(w2.this.F2().E.getContentProgress());
            }
            t7.j(gh.b.X, com.zentraedi.basic.component.utils.a.b().toJson(w2.this.G2().M()));
            int iE2 = w2.this.E2();
            if (iE2 >= 0) {
                BookModel bookModelM5 = w2.this.G2().M();
                if (bookModelM5 != null) {
                    bookModelM5.setText_position(iE2 + "");
                }
                BookModel bookModelM6 = w2.this.G2().M();
                if (bookModelM6 != null) {
                    bookModelM6.setChapterTotalPage(currentPage.b());
                }
            }
            kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(w2.this), (CoroutineContext) null, (CoroutineStart) null, new b(w2.this, null), 3, (Object) null);
        }

        @Override // com.zentraedi.reader.reader.d
        public void L0(int i, int i2, int i3) {
        }

        @Override // com.zentraedi.reader.reader.d
        public void m1(int i, int i2) {
            kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(w2.this), (CoroutineContext) null, (CoroutineStart) null, new a(w2.this, i2, null), 3, (Object) null);
        }
    }

    public static final class e implements PageView.u {
        e() {
        }

        @Override // com.zentraedi.reader.reader.PageView.u
        public void a() {
            w2.this.G2().W().r(Boolean.valueOf(!Intrinsics.areEqual(w2.this.G2().W().f(), Boolean.TRUE)));
        }

        @Override // com.zentraedi.reader.reader.PageView.u
        public boolean b() {
            return Intrinsics.areEqual(w2.this.G2().W().f(), Boolean.TRUE);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final int E2() {
        if (F2().E.getCurrentPage() != null) {
            return F2().E.getCurrentPage().m();
        }
        return -1;
    }

    private final TxtAttribute J2() {
        TxtAttribute txtAttribute = new TxtAttribute();
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = G2().M();
        txtAttribute.setTextSizePx(com.zentraedi.basic.function.utils.m0.b(aVar.h(bookModelM != null ? bookModelM.getBookFileType() : null).getValue()));
        BookModel bookModelM2 = G2().M();
        txtAttribute.setFontTypeface(new com.zentraedi.outreader.business.b().h(aVar.j(bookModelM2 != null ? bookModelM2.getBookFileType() : null)));
        BookModel bookModelM3 = G2().M();
        txtAttribute.setPageMargin(com.zentraedi.basic.function.utils.m0.b(aVar.s(bookModelM3 != null ? bookModelM3.getBookFileType() : null).getValue()));
        BookModel bookModelM4 = G2().M();
        txtAttribute.setLineSpace(aVar.M(aVar.m(bookModelM4 != null ? bookModelM4.getBookFileType() : null)));
        BookModel bookModelM5 = G2().M();
        txtAttribute.setParagraphSpace(aVar.N(aVar.x(bookModelM5 != null ? bookModelM5.getBookFileType() : null)));
        BookModel bookModelM6 = G2().M();
        int iU = aVar.u(bookModelM6 != null ? bookModelM6.getBookFileType() : null);
        I2().z(iU);
        txtAttribute.setPageMode(iU);
        BookModel bookModelM7 = G2().M();
        int iC = aVar.c(bookModelM7 != null ? bookModelM7.getBookFileType() : null);
        if (iC == 5) {
            txtAttribute.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.Vx));
        } else {
            txtAttribute.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.Ox));
        }
        txtAttribute.setBackgroundColorId(aVar.d(iC));
        BookModel bookModelM8 = G2().M();
        txtAttribute.setBackgroundImageId(aVar.f(bookModelM8 != null ? bookModelM8.getBookFileType() : null));
        Boolean bool = (Boolean) t7.d(gh.b.T, Boolean.FALSE);
        Intrinsics.checkNotNull(bool);
        txtAttribute.setClickLeftGoNext(bool.booleanValue());
        return txtAttribute;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int L2(List<? extends ChapterM.Chapter> list, String str) {
        if (com.zentraedi.basic.function.utils.j0.l(list)) {
            return -1;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual(list.get(i).f985id, str)) {
                return i;
            }
        }
        return -1;
    }

    private final void M2() {
        F2().E.setFileType(0);
        F2().E.d1(J2());
        I2().N(F2().E);
        Lifecycle lifecycle = getLifecycle();
        PageView pvRead = F2().E;
        Intrinsics.checkNotNullExpressionValue(pvRead, "pvRead");
        lifecycle.c(pvRead);
        com.zentraedi.outreader.adapter.l lVar = new com.zentraedi.outreader.adapter.l(getContext(), "");
        Object objD = t7.d(gh.b.f0, 3);
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        lVar.U(((Number) objD).intValue());
        Object objD2 = t7.d(gh.b.g0, 0);
        Intrinsics.checkNotNullExpressionValue(objD2, "get(...)");
        lVar.W(((Number) objD2).intValue());
        T2(lVar);
        F2().E.setAdapter(H2());
        R2();
        Q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.d N2(w2 w2Var) {
        FragmentActivity fragmentActivityRequireActivity = w2Var.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new androidx.lifecycle.m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(w2 w2Var) {
        w2Var.M2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P2(Continuation<? super ArrayList<com.zentraedi.reader.reader.k>> continuation) {
        c cVar;
        ArrayList arrayList;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.d;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                cVar.d = i - IntCompanionObject.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList2 = new ArrayList();
            com.zentraedi.outreader.reader.g gVarI2 = I2();
            cVar.a = arrayList2;
            cVar.d = 1;
            Object objM = gVarI2.m(cVar);
            if (objM == coroutine_suspended) {
                return coroutine_suspended;
            }
            arrayList = arrayList2;
            obj = objM;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (ArrayList) cVar.a;
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
                BookModel bookModelM = G2().M();
                Intrinsics.checkNotNull(bookModelM);
                kVar.h = bookModelM.getWordCountInt();
                BookModel bookModelM2 = G2().M();
                Intrinsics.checkNotNull(bookModelM2);
                kVar.b = bookModelM2.getNasFileName();
                BookModel bookModelM3 = G2().M();
                Intrinsics.checkNotNull(bookModelM3);
                kVar.c = bookModelM3.getBookType();
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0073  */
    private final void Q2() {
        if (G2().M() == null || I2().Q() == null) {
            return;
        }
        LocalTxtBookModel localTxtBookModelQ = I2().Q();
        Intrinsics.checkNotNull(localTxtBookModelQ);
        String str = localTxtBookModelQ.getWords() + "";
        String str2 = localTxtBookModelQ.getWords() + "";
        BookModel bookModelM = G2().M();
        Intrinsics.checkNotNull(bookModelM);
        if (Intrinsics.areEqual(str, bookModelM.getWords())) {
            BookModel bookModelM2 = G2().M();
            Intrinsics.checkNotNull(bookModelM2);
            if (!Intrinsics.areEqual(str2, bookModelM2.getChapters())) {
                BookModel bookModelM3 = G2().M();
                Intrinsics.checkNotNull(bookModelM3);
                bookModelM3.setWords(str);
                BookModel bookModelM4 = G2().M();
                Intrinsics.checkNotNull(bookModelM4);
                bookModelM4.setChapters(str2);
                com.zentraedi.outreader.wrapper.b bVar = com.zentraedi.outreader.wrapper.b.a;
                BookModel bookModelM5 = G2().M();
                Intrinsics.checkNotNull(bookModelM5);
                bVar.h(bookModelM5, null);
            }
        } else {
            BookModel bookModelM6 = G2().M();
            Intrinsics.checkNotNull(bookModelM6);
            bookModelM6.setWords(str);
            BookModel bookModelM7 = G2().M();
            Intrinsics.checkNotNull(bookModelM7);
            bookModelM7.setChapters(str2);
            com.zentraedi.outreader.wrapper.b bVar2 = com.zentraedi.outreader.wrapper.b.a;
            BookModel bookModelM8 = G2().M();
            Intrinsics.checkNotNull(bookModelM8);
            bVar2.h(bookModelM8, null);
        }
        BookModel bookModelM9 = G2().M();
        Intrinsics.checkNotNull(bookModelM9);
        String recordReadChapterId = bookModelM9.getRecordReadChapterId();
        BookModel bookModelM10 = G2().M();
        Intrinsics.checkNotNull(bookModelM10);
        K2(recordReadChapterId, bookModelM10.getTextPositionInt());
    }

    @fo.k
    public final com.zentraedi.outreader.databinding.s F2() {
        com.zentraedi.outreader.databinding.s sVar = this.o;
        if (sVar != null) {
            return sVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    @fo.k
    public final com.zentraedi.outreader.viewmodel.d G2() {
        return (com.zentraedi.outreader.viewmodel.d) this.n.getValue();
    }

    @fo.k
    public final com.zentraedi.outreader.adapter.l H2() {
        com.zentraedi.outreader.adapter.l lVar = this.q;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mReadAdapter");
        return null;
    }

    @fo.k
    public final com.zentraedi.outreader.reader.g I2() {
        com.zentraedi.outreader.reader.g gVar = this.p;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mZReader");
        return null;
    }

    public final void K2(@fo.k String chapterId, int i) {
        Intrinsics.checkNotNullParameter(chapterId, "chapterId");
        if (isAdded()) {
            kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(this), (CoroutineContext) null, (CoroutineStart) null, new b(chapterId, i, null), 3, (Object) null);
        }
    }

    public final void R2() {
        F2().E.setOnPageChangeListener(new d());
        F2().E.setTouchListener(new e());
    }

    public final void S2(@fo.k com.zentraedi.outreader.databinding.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
        this.o = sVar;
    }

    public final void T2(@fo.k com.zentraedi.outreader.adapter.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.q = lVar;
    }

    public final void U2(@fo.k com.zentraedi.outreader.reader.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.p = gVar;
    }

    public void onCreate(@fo.l Bundle bundle) {
        if (G2().M() != null && (G2().Y() instanceof com.zentraedi.outreader.reader.g)) {
            com.zentraedi.outreader.reader.h hVarY = G2().Y();
            Intrinsics.checkNotNull(hVarY, "null cannot be cast to non-null type com.zentraedi.outreader.reader.TxtPageViewZReader");
            U2((com.zentraedi.outreader.reader.g) hVarY);
            if (I2().Q() == null) {
                return;
            }
            super.onCreate(bundle);
        }
    }

    @fo.l
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super/*androidx.fragment.app.Fragment*/.onCreateView(inflater, viewGroup, bundle);
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(inflater, com.zentraedi.outreader.d.l.T5, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        S2((com.zentraedi.outreader.databinding.s) c0VarJ);
        return F2().getRoot();
    }

    public void onDestroyView() {
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        F2().E.Q0();
        Lifecycle lifecycle = getLifecycle();
        PageView pvRead = F2().E;
        Intrinsics.checkNotNullExpressionValue(pvRead, "pvRead");
        lifecycle.g(pvRead);
    }

    public void onViewCreated(@fo.k View view, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        F2().getRoot().post(new Runnable() { // from class: com.zentraedi.outreader.v2.fragment.v2
            @Override // java.lang.Runnable
            public final void run() {
                w2.O2(this.a);
            }
        });
    }
}
