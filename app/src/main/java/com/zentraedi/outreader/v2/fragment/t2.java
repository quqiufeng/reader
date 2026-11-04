package com.zentraedi.outreader.v2.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.flyco.tablayout.SlidingTabLayout;
import com.zentraedi.basic.function.picture.ImageProxy;
import com.zentraedi.business.R;
import com.zentraedi.business.model.CourseFileInfoModel;
import com.zentraedi.business.model.LocalFileModel;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.nas.NasSDKManager;
import com.zentraedi.outreader.model.ChapterM;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.view.SliderViewPager;
import com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineStart;
import org.readium.r2.shared.publication.Link;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nReaderSideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReaderSideFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderSideFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,328:1\n257#2,2:329\n*S KotlinDebug\n*F\n+ 1 ReaderSideFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderSideFragment\n*L\n146#1:329,2\n*E\n"})
public final class t2 extends com.zentraedi.business.fragment.a {

    @fo.k
    public static final a t = new a(null);
    private com.zentraedi.outreader.databinding.w p;
    private com.zentraedi.outreader.adapter.j q;
    private boolean s;

    @fo.k
    private final Lazy n = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.s2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t2.M2(this.a);
        }
    });
    private final int o = com.zentraedi.basic.function.utils.m0.b(2.0f);

    @fo.k
    private List<? extends ChapterM.Chapter> r = new ArrayList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.k
        public final t2 a() {
            return new t2();
        }

        private a() {
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.ReaderSideFragment$configChapters$1", f = "ReaderSideFragment.kt", i = {}, l = {135, 136}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        Object a;
        int b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return t2.this.new b(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.b
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.throwOnFailure(r6)
                goto L55
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                java.lang.Object r1 = r5.a
                com.zentraedi.outreader.v2.fragment.t2 r1 = (com.zentraedi.outreader.v2.fragment.t2) r1
                kotlin.ResultKt.throwOnFailure(r6)
                goto L3b
            L23:
                kotlin.ResultKt.throwOnFailure(r6)
                com.zentraedi.outreader.v2.fragment.t2 r1 = com.zentraedi.outreader.v2.fragment.t2.this
                com.zentraedi.outreader.viewmodel.d r6 = com.zentraedi.outreader.v2.fragment.t2.D2(r1)
                com.zentraedi.outreader.reader.h r6 = r6.Y()
                r5.a = r1
                r5.b = r3
                java.lang.Object r6 = r6.m(r5)
                if (r6 != r0) goto L3b
                goto L54
            L3b:
                java.util.List r6 = (java.util.List) r6
                com.zentraedi.outreader.v2.fragment.t2.F2(r1, r6)
                com.zentraedi.outreader.v2.fragment.t2 r6 = com.zentraedi.outreader.v2.fragment.t2.this
                com.zentraedi.outreader.viewmodel.d r6 = com.zentraedi.outreader.v2.fragment.t2.D2(r6)
                com.zentraedi.outreader.reader.h r6 = r6.Y()
                r5.a = r4
                r5.b = r2
                java.lang.Object r6 = r6.n(r5)
                if (r6 != r0) goto L55
            L54:
                return r0
            L55:
                java.lang.String r6 = (java.lang.String) r6
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ReaderSideFragment->configChapters openChapterId="
                r0.append(r1)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "nas_book"
                nd.a.e(r1, r0)
                com.zentraedi.outreader.v2.fragment.t2 r0 = com.zentraedi.outreader.v2.fragment.t2.this
                com.zentraedi.outreader.adapter.j r0 = com.zentraedi.outreader.v2.fragment.t2.E2(r0)
                if (r0 != 0) goto L7b
                java.lang.String r0 = "mSliderBarPagerAdapter"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = r4
            L7b:
                com.zentraedi.outreader.fragment.f r0 = r0.p()
                if (r0 == 0) goto L8a
                com.zentraedi.outreader.v2.fragment.t2 r1 = com.zentraedi.outreader.v2.fragment.t2.this
                java.util.List r1 = com.zentraedi.outreader.v2.fragment.t2.C2(r1)
                r0.j3(r1, r4, r6)
            L8a:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.v2.fragment.t2.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class c implements androidx.lifecycle.e1, FunctionAdapter {
        private final /* synthetic */ Function1 a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        public final boolean equals(@fo.l Object obj) {
            if ((obj instanceof androidx.lifecycle.e1) && (obj instanceof FunctionAdapter)) {
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

    private final void H2() {
        com.zentraedi.outreader.databinding.w wVar = this.p;
        com.zentraedi.outreader.databinding.w wVar2 = null;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wVar = null;
        }
        TextView textView = wVar.L;
        BookModel bookModelM = L2().M();
        textView.setText(bookModelM != null ? bookModelM.getNasFileName() : null);
        com.zentraedi.outreader.databinding.w wVar3 = this.p;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wVar3 = null;
        }
        LinearLayout llReadProgress = wVar3.G;
        Intrinsics.checkNotNullExpressionValue(llReadProgress, "llReadProgress");
        llReadProgress.setVisibility(L2().M() != null ? 0 : 8);
        String strP = L2().Y().p();
        com.zentraedi.outreader.databinding.w wVar4 = this.p;
        if (wVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            wVar2 = wVar4;
        }
        wVar2.J.setText(com.zentraedi.basic.function.utils.a.p(com.zentraedi.outreader.d.q.Oz2, strP));
        P2(L2().M());
    }

    private final void I2() {
        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(this), (CoroutineContext) null, (CoroutineStart) null, new b(null), 3, (Object) null);
    }

    private final String K2(BookModel bookModel) {
        return OfflineBookWrapperUtil.i(bookModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.outreader.viewmodel.d L2() {
        return (com.zentraedi.outreader.viewmodel.d) this.n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.d M2(t2 t2Var) {
        FragmentActivity fragmentActivityRequireActivity = t2Var.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new androidx.lifecycle.m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(t2 t2Var) {
        t2Var.H2();
        t2Var.I2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O2(t2 t2Var, Boolean bool) {
        if (bool.booleanValue()) {
            t2Var.H2();
        }
        return Unit.INSTANCE;
    }

    private final void P2(BookModel bookModel) {
        if (bookModel == null) {
            Q2();
            return;
        }
        com.zentraedi.outreader.databinding.w wVar = null;
        if (NasConnectManager.getInstance().isOfflineLogin()) {
            String strK2 = K2(bookModel);
            if (strK2.length() == 0) {
                Q2();
                return;
            }
            ImageProxy.RequestOptions requestOptions = new ImageProxy.RequestOptions(0, 0, 0);
            requestOptions.n(this.o);
            com.zentraedi.outreader.databinding.w wVar2 = this.p;
            if (wVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                wVar2 = null;
            }
            Context context = wVar2.E.getContext();
            com.zentraedi.outreader.databinding.w wVar3 = this.p;
            if (wVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                wVar = wVar3;
            }
            ImageProxy.X(context, strK2, wVar.E, requestOptions);
            return;
        }
        String cover = bookModel.getCover();
        if (cover == null || cover.length() == 0) {
            String strK3 = K2(bookModel);
            if (strK3.length() == 0) {
                Q2();
                return;
            }
            ImageProxy.RequestOptions requestOptions2 = new ImageProxy.RequestOptions(0, 0, 0);
            requestOptions2.n(this.o);
            com.zentraedi.outreader.databinding.w wVar4 = this.p;
            if (wVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                wVar4 = null;
            }
            Context context2 = wVar4.E.getContext();
            com.zentraedi.outreader.databinding.w wVar5 = this.p;
            if (wVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                wVar = wVar5;
            }
            ImageProxy.X(context2, strK3, wVar.E, requestOptions2);
            return;
        }
        ImageProxy.RequestOptions requestOptions3 = new ImageProxy.RequestOptions(0, R.drawable.E6, 0);
        requestOptions3.n(this.o);
        com.zentraedi.outreader.databinding.w wVar6 = this.p;
        if (wVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wVar6 = null;
        }
        Context context3 = wVar6.E.getContext();
        String cover2 = bookModel.getCover();
        if (cover2 == null) {
            cover2 = "";
        }
        String strJ2 = J2(cover2);
        com.zentraedi.outreader.databinding.w wVar7 = this.p;
        if (wVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            wVar = wVar7;
        }
        ImageProxy.X(context3, strJ2, wVar.E, requestOptions3);
    }

    private final void Q2() {
        int i;
        BookModel bookModelM = L2().M();
        com.zentraedi.outreader.databinding.w wVar = null;
        if (Intrinsics.areEqual(bookModelM != null ? bookModelM.getBookFileType() : null, "pdf")) {
            i = com.zentraedi.outreader.d.h.lj;
        } else {
            BookModel bookModelM2 = L2().M();
            if (Intrinsics.areEqual(bookModelM2 != null ? bookModelM2.getBookFileType() : null, "epub")) {
                i = com.zentraedi.outreader.d.h.aj;
            } else {
                BookModel bookModelM3 = L2().M();
                if (Intrinsics.areEqual(bookModelM3 != null ? bookModelM3.getBookFileType() : null, com.zbooklibrary.constant.a.h)) {
                    i = com.zentraedi.outreader.d.h.jj;
                } else {
                    BookModel bookModelM4 = L2().M();
                    i = Intrinsics.areEqual(bookModelM4 != null ? bookModelM4.getBookFileType() : null, com.zbooklibrary.constant.a.l) ? com.zentraedi.outreader.d.h.Zi : com.zentraedi.outreader.d.h.mj;
                }
            }
        }
        ImageProxy.RequestOptions requestOptions = new ImageProxy.RequestOptions(0, 0, 0);
        requestOptions.n(this.o);
        com.zentraedi.outreader.databinding.w wVar2 = this.p;
        if (wVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wVar2 = null;
        }
        Context context = wVar2.E.getContext();
        Integer numValueOf = Integer.valueOf(i);
        com.zentraedi.outreader.databinding.w wVar3 = this.p;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            wVar = wVar3;
        }
        ImageProxy.X(context, numValueOf, wVar.E, requestOptions);
    }

    private final void R2() {
    }

    private final void S2(boolean z) {
        this.s = z;
    }

    private final void T2() {
    }

    @fo.k
    public final List<Pair<Integer, Link>> G2(@fo.k Pair<Integer, Link> parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int iIntValue = parent.getFirst().intValue() + 1;
        ArrayList arrayList = new ArrayList();
        for (Link link : parent.getSecond().getChildren()) {
            arrayList.add(new Pair(Integer.valueOf(iIntValue), link));
            arrayList.addAll(G2(new Pair<>(Integer.valueOf(iIntValue), link)));
        }
        return arrayList;
    }

    @fo.k
    public final String J2(@fo.k String cover) {
        Intrinsics.checkNotNullParameter(cover, "cover");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s%s", Arrays.copyOf(new Object[]{NasSDKManager.getInstance().getAddr(), cover}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @fo.l
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(inflater, com.zentraedi.outreader.d.l.Z5, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.outreader.databinding.w wVar = (com.zentraedi.outreader.databinding.w) c0VarJ;
        this.p = wVar;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wVar = null;
        }
        return wVar.getRoot();
    }

    public void onViewCreated(@fo.k View view, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.q = new com.zentraedi.outreader.adapter.j(childFragmentManager);
        com.zentraedi.outreader.databinding.w wVar = null;
        if (NasConnectManager.getInstance().isOfflineLogin() || (L2().N() instanceof CourseFileInfoModel) || (L2().N() instanceof LocalFileModel)) {
            com.zentraedi.outreader.adapter.j jVar = this.q;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSliderBarPagerAdapter");
                jVar = null;
            }
            jVar.s(new String[]{com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.UA2)});
        }
        com.zentraedi.outreader.databinding.w wVar2 = this.p;
        if (wVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wVar2 = null;
        }
        wVar2.H.setOnlyText(true);
        com.zentraedi.outreader.databinding.w wVar3 = this.p;
        if (wVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wVar3 = null;
        }
        SliderViewPager sliderViewPager = wVar3.M;
        androidx.viewpager.widget.a aVar = this.q;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSliderBarPagerAdapter");
            aVar = null;
        }
        sliderViewPager.setAdapter(aVar);
        com.zentraedi.outreader.databinding.w wVar4 = this.p;
        if (wVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wVar4 = null;
        }
        SlidingTabLayout slidingTabLayout = wVar4.H;
        com.zentraedi.outreader.databinding.w wVar5 = this.p;
        if (wVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            wVar5 = null;
        }
        slidingTabLayout.setViewPager(wVar5.M);
        com.zentraedi.outreader.databinding.w wVar6 = this.p;
        if (wVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            wVar = wVar6;
        }
        wVar.getRoot().post(new Runnable() { // from class: com.zentraedi.outreader.v2.fragment.q2
            @Override // java.lang.Runnable
            public final void run() {
                t2.N2(this.a);
            }
        });
        L2().X().k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.r2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t2.O2(this.a, (Boolean) obj);
            }
        }));
    }
}
