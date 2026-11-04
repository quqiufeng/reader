package com.zentraedi.outreader.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.c0;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.e1;
import androidx.lifecycle.m2;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.tbs.one.TBSOneErrorCodes;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.basic.function.utils.m0;
import com.zentraedi.business.utils.m;
import com.zentraedi.business.utils.p0;
import com.zentraedi.outreader.adapter.k;
import com.zentraedi.outreader.databinding.o;
import com.zentraedi.outreader.event.MsgChapterChangeEvent;
import com.zentraedi.outreader.model.ChapterM;
import com.zentraedi.outreader.reader.PDFTronZReader;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.widget.fastscrollview.FastScrollRecyclerView;
import fo.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.q0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nChapterFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChapterFragment.kt\ncom/zentraedi/outreader/fragment/ChapterFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,522:1\n257#2,2:523\n257#2,2:525\n257#2,2:538\n257#2,2:540\n1563#3:527\n1634#3,3:528\n360#3,7:531\n1056#3:542\n1869#3,2:543\n1563#3:545\n1634#3,3:546\n1878#3,3:549\n*S KotlinDebug\n*F\n+ 1 ChapterFragment.kt\ncom/zentraedi/outreader/fragment/ChapterFragment\n*L\n217#1:523,2\n218#1:525,2\n248#1:538,2\n249#1:540,2\n221#1:527\n221#1:528,3\n236#1:531,7\n270#1:542\n356#1:543,2\n376#1:545\n376#1:546,3\n384#1:549,3\n*E\n"})
public final class f extends com.zentraedi.business.fragment.a implements k.d {

    @fo.k
    public static final a w = new a(null);
    private o n;

    @fo.k
    private final Lazy o;

    @fo.k
    private final Lazy p;

    @fo.k
    private final List<ChapterM.Chapter> q;
    private int r;

    @l
    private LinearLayoutManager s;

    @fo.k
    private final Lazy t;
    private boolean u;
    private boolean v;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @fo.k
        public final f a() {
            return new f(null);
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ChapterFragment.kt\ncom/zentraedi/outreader/fragment/ChapterFragment\n*L\n1#1,328:1\n271#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((ChapterM.Chapter) t).page), Integer.valueOf(((ChapterM.Chapter) t2).page));
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.fragment.ChapterFragment$initChapters$1", f = "ChapterFragment.kt", i = {1}, l = {195, 196}, m = "invokeSuspend", n = {"chapters"}, s = {"L$0"}, v = 1)
    static final class c extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        Object a;
        int b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return f.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<? extends ChapterM.Chapter> list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.zentraedi.outreader.reader.h hVarY = f.this.Q2().Y();
                this.b = 1;
                obj = hVarY.m(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.a;
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) obj;
            nd.a.e("nas_book", "ChapterFragment->initChapters openChapterId=" + str);
            f.this.j3(list, null, str);
            return Unit.INSTANCE;
            List<? extends ChapterM.Chapter> list2 = (List) obj;
            com.zentraedi.outreader.reader.h hVarY2 = f.this.Q2().Y();
            this.a = list2;
            this.b = 2;
            Object objN = hVarY2.n(this);
            if (objN != coroutine_suspended) {
                list = list2;
                obj = objN;
                String str2 = (String) obj;
                nd.a.e("nas_book", "ChapterFragment->initChapters openChapterId=" + str2);
                f.this.j3(list, null, str2);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m.c()) {
                return;
            }
            f fVar = f.this;
            fVar.u = !fVar.u;
            o oVar = null;
            if (f.this.u) {
                o oVar2 = f.this.n;
                if (oVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    oVar = oVar2;
                }
                oVar.E.setImageResource(com.zentraedi.outreader.d.h.bH);
            } else {
                o oVar3 = f.this.n;
                if (oVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    oVar = oVar3;
                }
                oVar.E.setImageResource(com.zentraedi.outreader.d.h.iH);
            }
            f fVar2 = f.this;
            fVar2.h3(fVar2.u);
        }
    }

    public static final class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m.c()) {
                return;
            }
            if (f.this.v) {
                f.this.k3();
            } else {
                f.this.l3();
            }
        }
    }

    /* JADX INFO: renamed from: com.zentraedi.outreader.fragment.f$f, reason: collision with other inner class name */
    public static final class C0141f implements ih.b.a {
        C0141f() {
        }

        @Override // ih.b.a
        public String Y(int i) {
            ChapterM.Chapter chapter = (ChapterM.Chapter) CollectionsKt.getOrNull(f.this.q, i);
            String str = chapter != null ? chapter.volumeName : null;
            return str == null ? "" : str;
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.fragment.ChapterFragment$openChapter$1", f = "ChapterFragment.kt", i = {}, l = {TBSOneErrorCodes.WAIT_DEPS_LOCK_TIMEOUT, TBSOneErrorCodes.COPY_LOCAL_DEPS_FAILED}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class g extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ int b;
        final /* synthetic */ f c;
        final /* synthetic */ ChapterM.Chapter d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i, f fVar, ChapterM.Chapter chapter, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = i;
            this.c = fVar;
            this.d = chapter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.b, this.c, this.d, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r5.s(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        
            if (r5.t(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.throwOnFailure(r5)
                goto L4c
            L1b:
                kotlin.ResultKt.throwOnFailure(r5)
                int r5 = r4.b
                if (r5 < 0) goto L37
                com.zentraedi.outreader.fragment.f r5 = r4.c
                com.zentraedi.outreader.viewmodel.d r5 = com.zentraedi.outreader.fragment.f.I2(r5)
                com.zentraedi.outreader.reader.h r5 = r5.Y()
                int r1 = r4.b
                r4.a = r3
                java.lang.Object r5 = r5.s(r1, r4)
                if (r5 != r0) goto L4c
                goto L4b
            L37:
                com.zentraedi.outreader.fragment.f r5 = r4.c
                com.zentraedi.outreader.viewmodel.d r5 = com.zentraedi.outreader.fragment.f.I2(r5)
                com.zentraedi.outreader.reader.h r5 = r5.Y()
                com.zentraedi.outreader.model.ChapterM$Chapter r1 = r4.d
                r4.a = r2
                java.lang.Object r5 = r5.t(r1, r4)
                if (r5 != r0) goto L4c
            L4b:
                return r0
            L4c:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.fragment.f.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((g) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.fragment.ChapterFragment$refreshChapterSelectedState$1", f = "ChapterFragment.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nChapterFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChapterFragment.kt\ncom/zentraedi/outreader/fragment/ChapterFragment$refreshChapterSelectedState$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,522:1\n295#2,2:523\n*S KotlinDebug\n*F\n+ 1 ChapterFragment.kt\ncom/zentraedi/outreader/fragment/ChapterFragment$refreshChapterSelectedState$1\n*L\n206#1:523,2\n*E\n"})
    static final class h extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        int a;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return f.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.zentraedi.outreader.reader.h hVarY = f.this.Q2().Y();
                this.a = 1;
                obj = hVarY.n(this);
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
            for (Object obj2 : f.this.q) {
                if (Intrinsics.areEqual(((ChapterM.Chapter) obj2).f985id, str)) {
                    ChapterM.Chapter chapter = (ChapterM.Chapter) obj2;
                    nd.a.e("nas_book", "ChapterFragment->refreshChapterSelectedState openChapterId=" + str + " chapter=" + chapter);
                    f.this.o3(chapter);
                    return Unit.INSTANCE;
                }
            }
            obj2 = null;
            ChapterM.Chapter chapter2 = (ChapterM.Chapter) obj2;
            nd.a.e("nas_book", "ChapterFragment->refreshChapterSelectedState openChapterId=" + str + " chapter=" + chapter2);
            f.this.o3(chapter2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((h) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class i implements e1, FunctionAdapter {
        private final /* synthetic */ Function1 a;

        i(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof e1) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @fo.k
        public final Function<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class j extends RecyclerView.AdapterDataObserver {
        final /* synthetic */ int a;
        final /* synthetic */ RecyclerView b;
        final /* synthetic */ f c;

        j(int i, RecyclerView recyclerView, f fVar) {
            this.a = i;
            this.b = recyclerView;
            this.c = fVar;
        }

        public void onItemRangeChanged(int i, int i2) {
            super.onItemRangeChanged(i, i2);
            nd.a.e("nas_book", "ChapterFragment->scrollToPosition onItemRangeChanged positionStart=" + i + " itemCount=" + i2 + " position=" + this.a);
            this.b.scrollToPosition(i);
            this.c.O2().unregisterAdapterDataObserver(this);
        }

        public void onItemRangeInserted(int i, int i2) {
            super.onItemRangeInserted(i, i2);
            nd.a.e("nas_book", "ChapterFragment->scrollToPosition onItemRangeInserted positionStart=" + i + " itemCount=" + i2 + " position=" + this.a);
            this.b.scrollToPosition(i);
            this.c.O2().unregisterAdapterDataObserver(this);
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final ChapterM.Chapter N2(int i2, List<? extends ChapterM.Chapter> list) {
        Object objPrevious;
        List listSortedWith = CollectionsKt.sortedWith(list, new b());
        ListIterator listIterator = listSortedWith.listIterator(listSortedWith.size());
        while (listIterator.hasPrevious()) {
            objPrevious = listIterator.previous();
            if (i2 >= ((ChapterM.Chapter) objPrevious).page) {
                return (ChapterM.Chapter) objPrevious;
            }
        }
        objPrevious = null;
        return (ChapterM.Chapter) objPrevious;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.outreader.adapter.h O2() {
        return (com.zentraedi.outreader.adapter.h) this.p.getValue();
    }

    private final k P2() {
        return (k) this.o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.outreader.viewmodel.d Q2() {
        return (com.zentraedi.outreader.viewmodel.d) this.t.getValue();
    }

    private final PDFTronZReader R2() {
        com.zentraedi.outreader.reader.h hVarY = Q2().Y();
        com.zentraedi.outreader.reader.e eVar = hVarY instanceof com.zentraedi.outreader.reader.e ? (com.zentraedi.outreader.reader.e) hVarY : null;
        if (eVar != null) {
            return eVar.O();
        }
        return null;
    }

    private final int S2(List<ChapterM.Chapter> list, String str) {
        if (j0.l(list)) {
            return -1;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ChapterM.Chapter chapter = list.get(i2);
            Intrinsics.checkNotNull(chapter);
            if (Intrinsics.areEqual(chapter.f985id, str)) {
                return i2;
            }
        }
        return -1;
    }

    private final void T2() {
        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(this), (CoroutineContext) null, (CoroutineStart) null, new c(null), 3, (Object) null);
    }

    private final void U2() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        this.s = new LinearLayoutManager(activity, 1, false);
        o oVar = this.n;
        o oVar2 = null;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        oVar.I.setLayoutManager(this.s);
        ih.b bVar = new ih.b(activity, new C0141f());
        bVar.b(androidx.core.content.e.g(requireContext(), com.zentraedi.outreader.d.f.e0));
        bVar.d(androidx.core.content.e.g(requireContext(), com.zentraedi.outreader.d.f.Qx));
        bVar.c(m0.b(50.0f));
        bVar.e(m0.b(15.0f));
        o oVar3 = this.n;
        if (oVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar3 = null;
        }
        oVar3.I.addItemDecoration(bVar);
        P2().I(this);
        o oVar4 = this.n;
        if (oVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar4 = null;
        }
        oVar4.I.setAdapter(P2());
        o oVar5 = this.n;
        if (oVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar5 = null;
        }
        oVar5.E.setOnClickListener(new d());
        BookModel bookModelM = Q2().M();
        nd.a.e("nas_book", "ChapterFragment->initView fileName=" + (bookModelM != null ? bookModelM.getShowName() : null));
        BookModel bookModelM2 = Q2().M();
        if (bookModelM2 == null || !bookModelM2.isPdf()) {
            o oVar6 = this.n;
            if (oVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar6 = null;
            }
            oVar6.F.setVisibility(8);
        } else {
            o oVar7 = this.n;
            if (oVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar7 = null;
            }
            oVar7.F.setVisibility(0);
            int i2 = Y2() ? 4 : 2;
            o oVar8 = this.n;
            if (oVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar8 = null;
            }
            oVar8.H.setLayoutManager(new GridLayoutManager(getContext(), i2));
            o oVar9 = this.n;
            if (oVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar9 = null;
            }
            oVar9.H.setAdapter(O2());
            O2().N(R2());
            O2().P(new Function3() { // from class: com.zentraedi.outreader.fragment.e
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return f.V2(this.a, (com.zentraedi.outreader.model.a) obj, (View) obj2, ((Integer) obj3).intValue());
                }
            });
        }
        o oVar10 = this.n;
        if (oVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oVar2 = oVar10;
        }
        oVar2.F.setOnClickListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V2(f fVar, com.zentraedi.outreader.model.a aVar, View view, int i2) {
        if (aVar == null) {
            return Unit.INSTANCE;
        }
        fVar.f3(aVar.e());
        return Unit.INSTANCE;
    }

    private final void W2() {
        Q2().X().k(getViewLifecycleOwner(), new i(new Function1() { // from class: com.zentraedi.outreader.fragment.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.X2(this.a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X2(f fVar, Boolean bool) {
        if (bool.booleanValue()) {
            fVar.g3();
        }
        return Unit.INSTANCE;
    }

    private final boolean Y2() {
        return p0.K(com.zentraedi.basic.function.utils.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.adapter.h Z2() {
        return new com.zentraedi.outreader.adapter.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k a3(f fVar) {
        return new k(fVar.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.d b3(f fVar) {
        FragmentActivity fragmentActivityRequireActivity = fVar.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.d.class);
    }

    private final void c3(LinearLayoutManager linearLayoutManager, RecyclerView recyclerView, int i2) {
        if (linearLayoutManager == null) {
            return;
        }
        nd.a.e("nas_book", "ChapterFragment->moveToPosition position=" + i2);
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        linearLayoutManager.findLastVisibleItemPosition();
        if (i2 <= iFindFirstVisibleItemPosition && i2 != 0) {
            recyclerView.scrollToPosition(i2 - 1);
        } else {
            if (i2 < 0 || i2 >= linearLayoutManager.getItemCount()) {
                return;
            }
            recyclerView.scrollToPosition(i2);
        }
    }

    @JvmStatic
    @fo.k
    public static final f d3() {
        return w.a();
    }

    private final void e3(ChapterM.Chapter chapter, int i2) {
        nd.a.e("nas_book", "ChapterFragment->openChapter chapter=" + chapter + " pageNumber=" + i2);
        if (chapter == null) {
            return;
        }
        org.greenrobot.eventbus.c.f().q(new MsgChapterChangeEvent(MsgChapterChangeEvent.MSG_CHAPTER_CHANGE, chapter.f985id, chapter.name));
        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(this), (CoroutineContext) null, (CoroutineStart) null, new g(i2, this, chapter, null), 3, (Object) null);
        Q2().X().r(Boolean.FALSE);
    }

    private final void f3(int i2) {
        nd.a.e("nas_book", "ChapterFragment->openPageNumber pageNumber=" + i2);
        e3(N2(i2, this.q), i2);
    }

    private final void g3() {
        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(this), (CoroutineContext) null, (CoroutineStart) null, new h(null), 3, (Object) null);
    }

    private final void i3(RecyclerView recyclerView, int i2) {
        if (i2 >= 0) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (i2 < (adapter != null ? adapter.getItemCount() : 0)) {
                O2().registerAdapterDataObserver(new j(i2, recyclerView, this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k3() {
        this.v = false;
        o oVar = this.n;
        o oVar2 = null;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        oVar.F.setImageResource(com.zentraedi.outreader.d.h.ML);
        o oVar3 = this.n;
        if (oVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar3 = null;
        }
        RecyclerView.OnItemTouchListener srvCategoryList = oVar3.I;
        Intrinsics.checkNotNullExpressionValue(srvCategoryList, "srvCategoryList");
        srvCategoryList.setVisibility(0);
        o oVar4 = this.n;
        if (oVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar4 = null;
        }
        RecyclerView rvPreview = oVar4.H;
        Intrinsics.checkNotNullExpressionValue(rvPreview, "rvPreview");
        rvPreview.setVisibility(8);
        o oVar5 = this.n;
        if (oVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oVar2 = oVar5;
        }
        oVar2.J.setText(com.zentraedi.basic.function.utils.m.e(com.zentraedi.outreader.d.q.xC2, "num", Integer.valueOf(this.q.size())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l3() {
        ArrayList arrayList;
        this.v = true;
        o oVar = this.n;
        o oVar2 = null;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        oVar.F.setImageResource(com.zentraedi.outreader.d.h.JL);
        o oVar3 = this.n;
        if (oVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar3 = null;
        }
        RecyclerView.OnItemTouchListener srvCategoryList = oVar3.I;
        Intrinsics.checkNotNullExpressionValue(srvCategoryList, "srvCategoryList");
        srvCategoryList.setVisibility(8);
        o oVar4 = this.n;
        if (oVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar4 = null;
        }
        RecyclerView rvPreview = oVar4.H;
        Intrinsics.checkNotNullExpressionValue(rvPreview, "rvPreview");
        rvPreview.setVisibility(0);
        List currentList = O2().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        if (currentList.isEmpty()) {
            int iO = Q2().Y().o();
            PDFTronZReader pDFTronZReaderR2 = R2();
            int iA0 = pDFTronZReaderR2 != null ? pDFTronZReaderR2.a0() : 0;
            nd.a.e("nas_book", "ChapterFragment->showPreviewList pageCount=" + iA0 + " pageNumber=" + iO);
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            while (i2 < iA0) {
                i2++;
                arrayList2.add(new com.zentraedi.outreader.model.a(i2, i2 == iO));
            }
            arrayList = arrayList2;
        } else {
            int iO2 = Q2().Y().o();
            List currentList2 = O2().getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList2, "getCurrentList(...)");
            List<com.zentraedi.outreader.model.a> list = currentList2;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.zentraedi.outreader.model.a aVar : list) {
                Intrinsics.checkNotNull(aVar);
                arrayList.add(com.zentraedi.outreader.model.a.d(aVar, 0, aVar.e() == iO2, 1, null));
            }
            nd.a.e("nas_book", "ChapterFragment->showPreviewList pageNumber=" + iO2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && !((com.zentraedi.outreader.model.a) it.next()).f()) {
        }
        O2().submitList(arrayList);
        o oVar5 = this.n;
        if (oVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            oVar2 = oVar5;
        }
        oVar2.J.setText(com.zentraedi.basic.function.utils.m.e(com.zentraedi.outreader.d.q.wE2, "num", Integer.valueOf(arrayList.size())));
    }

    private final void n3(String str) {
        this.r = 0;
        int i2 = 0;
        for (Object obj : this.q) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ChapterM.Chapter chapter = (ChapterM.Chapter) obj;
            if (Intrinsics.areEqual(str, chapter.f985id)) {
                chapter.isSelect = true;
                this.r = i2;
            } else {
                chapter.isSelect = false;
            }
            i2 = i3;
        }
        P2().G(this.q);
        LinearLayoutManager linearLayoutManager = this.s;
        if (linearLayoutManager != null) {
            o oVar = this.n;
            if (oVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oVar = null;
            }
            FastScrollRecyclerView srvCategoryList = oVar.I;
            Intrinsics.checkNotNullExpressionValue(srvCategoryList, "srvCategoryList");
            c3(linearLayoutManager, srvCategoryList, this.r);
        }
    }

    private final void q3(int i2) {
        List currentList = O2().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        List<com.zentraedi.outreader.model.a> list = currentList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.zentraedi.outreader.model.a aVar : list) {
            Intrinsics.checkNotNull(aVar);
            arrayList.add(com.zentraedi.outreader.model.a.d(aVar, 0, aVar.e() == i2, 1, null));
        }
        O2().submitList(arrayList);
    }

    public final boolean h3(boolean z) {
        if (this.v) {
            List currentList = O2().getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            List mutableList = CollectionsKt.toMutableList((Collection) currentList);
            CollectionsKt.reverse(mutableList);
            O2().submitList(mutableList);
            return true;
        }
        if (this.q.isEmpty()) {
            return false;
        }
        CollectionsKt.reverse(this.q);
        P2().G(this.q);
        o oVar = null;
        if (z) {
            o oVar2 = this.n;
            if (oVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar = oVar2;
            }
            oVar.I.scrollToPosition(this.r);
        } else {
            o oVar3 = this.n;
            if (oVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oVar = oVar3;
            }
            oVar.I.scrollToPosition(0);
        }
        return true;
    }

    public final void j3(@fo.k List<? extends ChapterM.Chapter> chapterList, @l List<String> list, @l String str) {
        Intrinsics.checkNotNullParameter(chapterList, "chapterList");
        if (this.q.size() > 0) {
            this.q.clear();
        }
        this.q.addAll(chapterList);
        if (j0.l(this.q) || getActivity() == null) {
            return;
        }
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (Intrinsics.areEqual(this.q.get(i2).f985id, str)) {
                this.q.get(i2).isSelect = true;
            }
            if (list != null && list.indexOf(this.q.get(i2).f985id) != -1) {
                this.q.get(i2).isCache = true;
            }
        }
        o oVar = this.n;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        oVar.J.setText(com.zentraedi.basic.function.utils.m.e(com.zentraedi.outreader.d.q.xC2, "num", Integer.valueOf(this.q.size())));
        P2().G(this.q);
    }

    public final void m3(@l List<String> list, @l String str) {
        nd.a.e("nas_book", "ChapterFragment->updateChapterCacheSelectedState chapterId=" + str + " cacheChapter=" + list);
        List<String> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            for (ChapterM.Chapter chapter : this.q) {
                chapter.isCache = list.indexOf(chapter.f985id) != -1;
            }
        }
        n3(str);
    }

    public final void o3(@l ChapterM.Chapter chapter) {
        int iO = Q2().Y().o();
        nd.a.e("nas_book", "ChapterFragment->updateChapterSelectedState pageNumber=" + iO + " selectChapter=" + chapter);
        n3(chapter != null ? chapter.f985id : null);
        q3(iO);
    }

    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
    }

    @l
    public View onCreateView(@fo.k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        c0 c0VarJ = androidx.databinding.m.j(inflater, com.zentraedi.outreader.d.l.j5, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        o oVar = (o) c0VarJ;
        this.n = oVar;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            oVar = null;
        }
        return oVar.getRoot();
    }

    public void onViewCreated(@fo.k View view, @l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        U2();
        T2();
        W2();
    }

    public final void p3(boolean z) {
    }

    @Override // com.zentraedi.outreader.adapter.k.d
    public void z(@l View view, int i2) {
        ChapterM.Chapter chapter = (ChapterM.Chapter) CollectionsKt.getOrNull(this.q, i2);
        if (chapter == null) {
            return;
        }
        e3(chapter, -1);
    }

    private f() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.zentraedi.outreader.fragment.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.a3(this.a);
            }
        });
        this.p = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.zentraedi.outreader.fragment.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.Z2();
            }
        });
        this.q = new ArrayList();
        this.t = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.fragment.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.b3(this.a);
            }
        });
        this.u = true;
    }
}
