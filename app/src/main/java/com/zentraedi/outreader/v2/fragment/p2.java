package com.zentraedi.outreader.v2.fragment;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.business.model.CourseFileInfoModel;
import com.zentraedi.business.model.LocalFileModel;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.reader.BookShelfStatusChangeEvent;
import com.zentraedi.business.utils.t7;
import com.zentraedi.outreader.model.BookMarkInfoModel;
import com.zentraedi.outreader.model.BookMarkModel;
import com.zentraedi.outreader.request.BookMarkAddRequest;
import com.zentraedi.outreader.request.BookMarkDeleteRequest;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.responsemodel.ReadProgressExt;
import com.zentraedi.reader.reader.PageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;
import org.readium.r2.navigator.epub.EpubPreferences;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nReaderMenusFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReaderMenusFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenusFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,680:1\n255#2:681\n255#2:682\n255#2:683\n255#2:684\n278#2,2:700\n278#2,2:702\n278#2,2:704\n278#2,2:706\n278#2,2:708\n278#2,2:710\n257#2,2:712\n257#2,2:714\n295#3,2:685\n295#3,2:687\n774#3:689\n865#3,2:690\n1869#3:692\n543#3,6:693\n1870#3:699\n*S KotlinDebug\n*F\n+ 1 ReaderMenusFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenusFragment\n*L\n211#1:681\n215#1:682\n314#1:683\n320#1:684\n637#1:700,2\n638#1:702,2\n639#1:704,2\n643#1:706,2\n644#1:708,2\n645#1:710,2\n190#1:712,2\n191#1:714,2\n533#1:685,2\n540#1:687,2\n546#1:689\n546#1:690,2\n560#1:692\n565#1:693,6\n560#1:699\n*E\n"})
public final class p2 extends com.zentraedi.business.fragment.a {

    @fo.k
    public static final a A = new a(null);
    private com.zentraedi.outreader.databinding.u q;
    private boolean s;
    private boolean t;

    @fo.l
    private Animation u;

    @fo.l
    private Animation v;

    @fo.l
    private Animation w;

    @fo.l
    private Animation x;
    private boolean y;

    @fo.l
    private BookMarkModel z;

    @fo.k
    private final Lazy n = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.x1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p2.H3(this.a);
        }
    });

    @fo.k
    private final Lazy o = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.y1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p2.I3(this.a);
        }
    });

    @fo.k
    private final Lazy p = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.z1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p2.G3(this.a);
        }
    });
    private boolean r = true;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.k
        public final p2 a() {
            return new p2();
        }

        private a() {
        }
    }

    public static final class b extends com.zentraedi.business.http.b<BaseModel> {
        final /* synthetic */ Function0<Unit> a;

        b(Function0<Unit> function0) {
            this.a = function0;
        }

        public void onResult(ResponseData<BaseModel> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.w(resp.getMsg(), false);
            } else {
                this.a.invoke();
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Il2), true);
            }
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.eF4), false);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.ReaderMenusFragment$addBookMark$request$1$1$1", f = "ReaderMenusFragment.kt", i = {}, l = {470}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ BookMarkInfoModel b;
        final /* synthetic */ p2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(BookMarkInfoModel bookMarkInfoModel, p2 p2Var, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = bookMarkInfoModel;
            this.c = p2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String read_chapter;
            ReadProgressExt readProgressExt;
            ReadProgressExt readProgressExt2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BookMarkInfoModel bookMarkInfoModel = this.b;
                BookModel bookModelM = this.c.d3().M();
                bookMarkInfoModel.setChapterId(bookModelM != null ? bookModelM.getRead_chapter_id() : null);
                BookMarkInfoModel bookMarkInfoModel2 = this.b;
                BookModel bookModelM2 = this.c.d3().M();
                bookMarkInfoModel2.setTextPosition(bookModelM2 != null ? bookModelM2.getText_position() : null);
                BookMarkInfoModel bookMarkInfoModel3 = this.b;
                BookModel bookModelM3 = this.c.d3().M();
                bookMarkInfoModel3.setPageIndex(bookModelM3 != null ? bookModelM3.getRead_page() : null);
                BookMarkInfoModel bookMarkInfoModel4 = this.b;
                BookModel bookModelM4 = this.c.d3().M();
                bookMarkInfoModel4.setFileIndex((bookModelM4 == null || (readProgressExt2 = bookModelM4.getReadProgressExt()) == null) ? null : readProgressExt2.getFileIndex());
                BookMarkInfoModel bookMarkInfoModel5 = this.b;
                BookModel bookModelM5 = this.c.d3().M();
                bookMarkInfoModel5.setFileProgress((bookModelM5 == null || (readProgressExt = bookModelM5.getReadProgressExt()) == null) ? null : readProgressExt.getFileProgress());
                BookMarkInfoModel bookMarkInfoModel6 = this.b;
                BookModel bookModelM6 = this.c.d3().M();
                bookMarkInfoModel6.setChapterName((bookModelM6 == null || (read_chapter = bookModelM6.getRead_chapter()) == null) ? null : StringsKt.trim(read_chapter).toString());
                BookMarkInfoModel bookMarkInfoModel7 = this.b;
                BookModel bookModelM7 = this.c.d3().M();
                bookMarkInfoModel7.setDesc(bookModelM7 != null ? bookModelM7.getCurrentPageDesc() : null);
                com.zentraedi.outreader.reader.h hVarY = this.c.d3().Y();
                this.a = 1;
                obj = hVarY.m(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((List) obj).size() <= 1) {
                BookMarkInfoModel bookMarkInfoModel8 = this.b;
                BookModel bookModelM8 = this.c.d3().M();
                bookMarkInfoModel8.setChapterName(bookModelM8 != null ? bookModelM8.getCurrentPageDesc() : null);
                this.b.setDesc(null);
            }
            this.b.setTime(String.valueOf(System.currentTimeMillis()));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class d extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ boolean b;

        d(boolean z) {
            this.b = z;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (Intrinsics.areEqual("200", resp.getCode())) {
                p2.this.g3(this.b);
                return;
            }
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.tB2) + resp.getCode() + ": " + resp.getMsg(), false);
            p2.this.f3(this.b);
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Mw1), false);
            p2.this.f3(this.b);
        }
    }

    public static final class e extends com.zentraedi.business.http.b<BaseModel> {
        final /* synthetic */ Function0<Unit> a;
        final /* synthetic */ boolean b;

        e(Function0<Unit> function0, boolean z) {
            this.a = function0;
            this.b = z;
        }

        public void onResult(ResponseData<BaseModel> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.w(resp.getMsg(), false);
            } else {
                this.a.invoke();
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(this.b ? com.zentraedi.outreader.d.q.cn2 : com.zentraedi.outreader.d.q.go2), true);
            }
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.eF4), false);
        }
    }

    public static final class f implements Animation.AnimationListener {
        f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        @androidx.annotation.w0(api = 21)
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public static final class g extends com.zentraedi.business.http.b<Object> {
        g() {
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.uB2) + resp.getCode() + ": " + resp.getMsg(), false);
                return;
            }
            BookModel bookModelM = p2.this.d3().M();
            Intrinsics.checkNotNull(bookModelM);
            bookModelM.setAdd_shelf(1);
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.nL), true);
            p2.this.W3(false);
            BookShelfStatusChangeEvent bookShelfStatusChangeEvent = new BookShelfStatusChangeEvent();
            BookModel bookModelM2 = p2.this.d3().M();
            bookShelfStatusChangeEvent.setBookId(bookModelM2 != null ? bookModelM2.getBook_id() : null);
            bookShelfStatusChangeEvent.setShelfStatus(0);
            org.greenrobot.eventbus.c.f().q(bookShelfStatusChangeEvent);
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Lw1), false);
        }
    }

    static final class h implements androidx.lifecycle.e1, FunctionAdapter {
        private final /* synthetic */ Function1 a;

        h(Function1 function) {
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

    private final boolean A3(String str) {
        return Intrinsics.areEqual(gh.b.c, str) || Intrinsics.areEqual(gh.b.d, str) || Intrinsics.areEqual(gh.b.e, str);
    }

    private final boolean B3() {
        com.zentraedi.outreader.databinding.u uVar = this.q;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        LinearLayout llReaderBottomBar = uVar.E.K;
        Intrinsics.checkNotNullExpressionValue(llReaderBottomBar, "llReaderBottomBar");
        return llReaderBottomBar.getVisibility() == 0;
    }

    private final boolean C3() {
        com.zentraedi.outreader.databinding.u uVar = this.q;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        LinearLayout llTitleBar = uVar.F.O;
        Intrinsics.checkNotNullExpressionValue(llTitleBar, "llTitleBar");
        return llTitleBar.getVisibility() == 0;
    }

    private final boolean D3() {
        if (!(d3().N() instanceof CourseFileInfoModel) && !(d3().N() instanceof LocalFileModel) && d3().M() != null && Intrinsics.areEqual("FILE_MANAGE", d3().Q())) {
            BookModel bookModelM = d3().M();
            Intrinsics.checkNotNull(bookModelM);
            if (bookModelM.getAdd_shelf() == 0) {
                return true;
            }
        }
        return false;
    }

    private final void E3() {
        com.zentraedi.outreader.databinding.u uVar = this.q;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        uVar.E.L.setVisibility(8);
    }

    private final void F3() {
        com.zentraedi.outreader.databinding.u uVar = this.q;
        com.zentraedi.outreader.databinding.u uVar2 = null;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        uVar.E.M.setVisibility(8);
        com.zentraedi.outreader.databinding.u uVar3 = this.q;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar3 = null;
        }
        uVar3.E.F.setVisibility(8);
        if (this.t) {
            com.zentraedi.outreader.databinding.u uVar4 = this.q;
            if (uVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                uVar2 = uVar4;
            }
            uVar2.E.L.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.c G3(p2 p2Var) {
        FragmentActivity fragmentActivityRequireActivity = p2Var.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new androidx.lifecycle.m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.c.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.d H3(p2 p2Var) {
        FragmentActivity fragmentActivityRequireActivity = p2Var.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new androidx.lifecycle.m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.f I3(p2 p2Var) {
        FragmentActivity fragmentActivityRequireActivity = p2Var.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new androidx.lifecycle.m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.f.class);
    }

    private final void J3() {
        if (d3().M() == null) {
            return;
        }
        e3().T(d3().M(), new g());
    }

    private final void L3(View view) {
        com.zentraedi.outreader.databinding.u uVar = this.q;
        com.zentraedi.outreader.databinding.u uVar2 = null;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        uVar.E.H.setSelected(false);
        com.zentraedi.outreader.databinding.u uVar3 = this.q;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar3 = null;
        }
        uVar3.E.I.setSelected(false);
        com.zentraedi.outreader.databinding.u uVar4 = this.q;
        if (uVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uVar2 = uVar4;
        }
        uVar2.E.G.setSelected(false);
        view.setSelected(true);
    }

    private final void M3() {
        com.zentraedi.outreader.databinding.u uVar = this.q;
        com.zentraedi.outreader.databinding.u uVar2 = null;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        uVar.F.O.startAnimation(this.u);
        com.zentraedi.outreader.databinding.u uVar3 = this.q;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar3 = null;
        }
        uVar3.E.K.startAnimation(this.w);
        com.zentraedi.outreader.databinding.u uVar4 = this.q;
        if (uVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar4 = null;
        }
        uVar4.F.O.setVisibility(0);
        com.zentraedi.outreader.databinding.u uVar5 = this.q;
        if (uVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uVar2 = uVar5;
        }
        uVar2.E.K.setVisibility(0);
        F3();
    }

    private final void N3() {
        com.zentraedi.outreader.databinding.u uVar = this.q;
        com.zentraedi.outreader.databinding.u uVar2 = null;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        ImageView ivPdfReaderSetting = uVar.E.I;
        Intrinsics.checkNotNullExpressionValue(ivPdfReaderSetting, "ivPdfReaderSetting");
        L3(ivPdfReaderSetting);
        com.zentraedi.outreader.databinding.u uVar3 = this.q;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar3 = null;
        }
        uVar3.E.E.setVisibility(0);
        ReaderMenuSettingFragment readerMenuSettingFragmentA = ReaderMenuSettingFragment.w.a();
        androidx.fragment.app.t0 t0VarW = getChildFragmentManager().w();
        com.zentraedi.outreader.databinding.u uVar4 = this.q;
        if (uVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uVar2 = uVar4;
        }
        t0VarW.C(uVar2.E.E.getId(), readerMenuSettingFragmentA).t();
    }

    private final void O3() {
        if (d3().M() == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Rw1));
        BookModel bookModelM = d3().M();
        Intrinsics.checkNotNull(bookModelM);
        sb.append(bookModelM.getShowName());
        sb.append(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Sw1));
        String string = sb.toString();
        final com.zentraedi.business.dialog.n nVar = new com.zentraedi.business.dialog.n(com.zentraedi.basic.function.utils.a.h().e());
        nVar.E(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Dq2)).s(string).w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.ax), new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.a2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p2.P3(nVar, this, view);
            }
        }).A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Pz), new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p2.Q3(nVar, this, view);
            }
        });
        nVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(com.zentraedi.business.dialog.n nVar, p2 p2Var, View view) {
        nVar.dismiss();
        FragmentActivity activity = p2Var.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(com.zentraedi.business.dialog.n nVar, p2 p2Var, View view) {
        nVar.dismiss();
        p2Var.X2(true);
    }

    private final void R3() {
        if (this.v == null || this.x == null || ((Boolean) t7.d(gh.b.P, Boolean.FALSE)).booleanValue()) {
            return;
        }
        M3();
    }

    private final void U3() {
        com.zentraedi.outreader.databinding.u uVar = this.q;
        com.zentraedi.outreader.databinding.u uVar2 = null;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        ImageView ivPdfDayNight = uVar.E.G;
        Intrinsics.checkNotNullExpressionValue(ivPdfDayNight, "ivPdfDayNight");
        L3(ivPdfDayNight);
        com.zentraedi.outreader.databinding.u uVar3 = this.q;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar3 = null;
        }
        uVar3.E.E.setVisibility(0);
        v1 v1VarA = v1.q.a();
        androidx.fragment.app.t0 t0VarW = getChildFragmentManager().w();
        com.zentraedi.outreader.databinding.u uVar4 = this.q;
        if (uVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uVar2 = uVar4;
        }
        t0VarW.C(uVar2.E.E.getId(), v1VarA).t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W3(boolean z) {
        com.zentraedi.outreader.databinding.u uVar = this.q;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        uVar.F.F.setSelected(z);
    }

    private final void X2(boolean z) {
        if (d3().M() == null) {
            return;
        }
        e3().U();
        e3().L(getContext(), d3().M(), new d(z));
    }

    private final void Y2() {
        com.zentraedi.outreader.databinding.u uVar = this.q;
        com.zentraedi.outreader.databinding.u uVar2 = null;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        ImageView ivPdfMenuBtn = uVar.E.H;
        Intrinsics.checkNotNullExpressionValue(ivPdfMenuBtn, "ivPdfMenuBtn");
        L3(ivPdfMenuBtn);
        com.zentraedi.outreader.databinding.u uVar3 = this.q;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar3 = null;
        }
        uVar3.E.E.setVisibility(0);
        Fragment fragmentA = Intrinsics.areEqual(d3().R().f(), Boolean.TRUE) ? ReaderMenuAutoPageFragment.r.a() : i0.u.a();
        androidx.fragment.app.t0 t0VarW = getChildFragmentManager().w();
        com.zentraedi.outreader.databinding.u uVar4 = this.q;
        if (uVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uVar2 = uVar4;
        }
        t0VarW.C(uVar2.E.E.getId(), fragmentA).t();
    }

    private final void Y3(boolean z) {
        if (z) {
            com.zentraedi.basic.function.ui.statusbar.a.E(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.D2));
            com.zentraedi.basic.function.ui.statusbar.a.F(com.zentraedi.basic.function.utils.a.h().e(), false);
        } else {
            com.zentraedi.basic.function.ui.statusbar.a.E(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.f731qd));
            com.zentraedi.basic.function.ui.statusbar.a.F(com.zentraedi.basic.function.utils.a.h().e(), true);
        }
    }

    public static /* synthetic */ void a3(p2 p2Var, String str, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        p2Var.Z2(str, z, function0);
    }

    private final com.zentraedi.outreader.viewmodel.c b3() {
        return (com.zentraedi.outreader.viewmodel.c) this.p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.outreader.viewmodel.d d3() {
        return (com.zentraedi.outreader.viewmodel.d) this.n.getValue();
    }

    private final com.zentraedi.outreader.viewmodel.f e3() {
        return (com.zentraedi.outreader.viewmodel.f) this.o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f3(boolean z) {
        if (d3().M() == null) {
            return;
        }
        BookModel bookModelM = d3().M();
        Intrinsics.checkNotNull(bookModelM);
        bookModelM.setAdd_shelf(0);
        if (z) {
            this.y = true;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3(boolean z) {
        if (d3().M() == null) {
            return;
        }
        BookModel bookModelM = d3().M();
        Intrinsics.checkNotNull(bookModelM);
        bookModelM.setAdd_shelf(1);
        if (this.r) {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Ly1), true);
        }
        BookShelfStatusChangeEvent bookShelfStatusChangeEvent = new BookShelfStatusChangeEvent();
        BookModel bookModelM2 = d3().M();
        Intrinsics.checkNotNull(bookModelM2);
        bookShelfStatusChangeEvent.setBookId(bookModelM2.getBook_id());
        bookShelfStatusChangeEvent.setShelfStatus(1);
        org.greenrobot.eventbus.c.f().q(bookShelfStatusChangeEvent);
        W3(true);
        if (z) {
            this.y = true;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    private final void h3(boolean z) {
        com.zentraedi.outreader.databinding.u uVar = null;
        if (z) {
            com.zentraedi.outreader.databinding.u uVar2 = this.q;
            if (uVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                uVar2 = null;
            }
            LinearLayout llTitleBar = uVar2.F.O;
            Intrinsics.checkNotNullExpressionValue(llTitleBar, "llTitleBar");
            if (llTitleBar.getVisibility() == 0) {
                com.zentraedi.outreader.databinding.u uVar3 = this.q;
                if (uVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    uVar3 = null;
                }
                uVar3.F.O.startAnimation(this.v);
                com.zentraedi.outreader.databinding.u uVar4 = this.q;
                if (uVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    uVar4 = null;
                }
                uVar4.F.O.setVisibility(8);
            }
        }
        com.zentraedi.outreader.databinding.u uVar5 = this.q;
        if (uVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar5 = null;
        }
        LinearLayout llReaderBottomBar = uVar5.E.K;
        Intrinsics.checkNotNullExpressionValue(llReaderBottomBar, "llReaderBottomBar");
        if (llReaderBottomBar.getVisibility() == 0) {
            if (z) {
                com.zentraedi.outreader.databinding.u uVar6 = this.q;
                if (uVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    uVar6 = null;
                }
                uVar6.E.K.startAnimation(this.x);
                com.zentraedi.outreader.databinding.u uVar7 = this.q;
                if (uVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    uVar = uVar7;
                }
                uVar.E.K.setVisibility(8);
                E3();
            } else {
                F3();
            }
            Y2();
        }
    }

    @SuppressLint({"WrongConstant"})
    private final void i3(boolean z) {
        if (this.v == null || this.x == null) {
            return;
        }
        this.t = false;
        h3(z);
    }

    private final void j3() {
        if (com.zentraedi.basic.function.utils.b.o(com.zentraedi.basic.function.utils.a.h().e())) {
            com.zentraedi.basic.function.utils.b.n(com.zentraedi.basic.function.utils.a.h().e());
        }
    }

    private final void k3() {
        com.zentraedi.outreader.databinding.u uVar = this.q;
        com.zentraedi.outreader.databinding.u uVar2 = null;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        uVar.F.J.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p2.l3(this.a, view);
            }
        });
        com.zentraedi.outreader.databinding.u uVar3 = this.q;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar3 = null;
        }
        uVar3.F.F.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.g2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p2.m3(this.a, view);
            }
        });
        com.zentraedi.outreader.databinding.u uVar4 = this.q;
        if (uVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar4 = null;
        }
        uVar4.F.H.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.h2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p2.n3(this.a, view);
            }
        });
        d3().U().k(getViewLifecycleOwner(), new h(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.i2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p2.s3(this.a, (Integer) obj);
            }
        }));
        d3().O().k(getViewLifecycleOwner(), new h(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.j2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p2.t3(this.a, (List) obj);
            }
        }));
        com.zentraedi.outreader.databinding.u uVar5 = this.q;
        if (uVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar5 = null;
        }
        uVar5.E.H.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p2.u3(this.a, view);
            }
        });
        com.zentraedi.outreader.databinding.u uVar6 = this.q;
        if (uVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar6 = null;
        }
        uVar6.E.G.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p2.v3(this.a, view);
            }
        });
        com.zentraedi.outreader.databinding.u uVar7 = this.q;
        if (uVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uVar2 = uVar7;
        }
        uVar2.E.I.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.m2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p2.w3(this.a, view);
            }
        });
        d3().W().k(getViewLifecycleOwner(), new h(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.n2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p2.x3(this.a, (Boolean) obj);
            }
        }));
        d3().R().k(getViewLifecycleOwner(), new h(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.o2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p2.y3(this.a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(p2 p2Var, View view) {
        if (p2Var.D3()) {
            p2Var.O3();
            return;
        }
        FragmentActivity activity = p2Var.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(p2 p2Var, View view) {
        com.zentraedi.outreader.databinding.u uVar = p2Var.q;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        if (uVar.F.F.isSelected()) {
            p2Var.J3();
        } else {
            p2Var.X2(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(final p2 p2Var, View view) {
        com.zentraedi.outreader.databinding.u uVar = p2Var.q;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        if (!uVar.F.H.isSelected()) {
            p2Var.W2(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.d2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p2.q3(this.a);
                }
            });
        } else {
            BookMarkModel bookMarkModel = p2Var.z;
            p2Var.Z2(String.valueOf(bookMarkModel != null ? bookMarkModel.getBookmark_id() : null), false, new Function0() { // from class: com.zentraedi.outreader.v2.fragment.c2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p2.o3(this.a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o3(p2 p2Var) {
        com.zentraedi.outreader.databinding.u uVar = p2Var.q;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        uVar.F.H.setSelected(false);
        p2Var.d3().c0(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.f2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p2.p3((List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p3(List list) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q3(p2 p2Var) {
        com.zentraedi.outreader.databinding.u uVar = p2Var.q;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        uVar.F.H.setSelected(true);
        p2Var.d3().c0(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.e2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p2.r3((List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r3(List list) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s3(p2 p2Var, Integer num) {
        p2Var.X3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t3(p2 p2Var, List list) {
        p2Var.X3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(p2 p2Var, View view) {
        p2Var.d3().X().r(Boolean.TRUE);
        p2Var.d3().W().r(Boolean.FALSE);
        p2Var.Y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(p2 p2Var, View view) {
        if (!p2Var.s) {
            p2Var.s = true;
            t7.j(gh.b.Q, Boolean.TRUE);
        }
        p2Var.t = true;
        p2Var.U3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(p2 p2Var, View view) {
        p2Var.t = true;
        com.zentraedi.outreader.databinding.u uVar = p2Var.q;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        ImageView ivPdfReaderSetting = uVar.E.I;
        Intrinsics.checkNotNullExpressionValue(ivPdfReaderSetting, "ivPdfReaderSetting");
        p2Var.L3(ivPdfReaderSetting);
        p2Var.N3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x3(p2 p2Var, Boolean bool) {
        if (bool.booleanValue()) {
            p2Var.V3();
        } else {
            p2Var.i3(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y3(p2 p2Var, Boolean bool) {
        com.zentraedi.outreader.databinding.u uVar = p2Var.q;
        com.zentraedi.outreader.databinding.u uVar2 = null;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        LinearLayout llTitleBar = uVar.F.O;
        Intrinsics.checkNotNullExpressionValue(llTitleBar, "llTitleBar");
        llTitleBar.setVisibility(!bool.booleanValue() ? 0 : 8);
        com.zentraedi.outreader.databinding.u uVar3 = p2Var.q;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uVar2 = uVar3;
        }
        LinearLayout rlSetBar = uVar2.E.N;
        Intrinsics.checkNotNullExpressionValue(rlSetBar, "rlSetBar");
        rlSetBar.setVisibility(bool.booleanValue() ? 8 : 0);
        p2Var.d3().W().r(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    private final void z3() {
        if (this.u != null) {
            return;
        }
        this.u = AnimationUtils.loadAnimation(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.outreader.d.a.h1);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.outreader.d.a.i1);
        this.v = animationLoadAnimation;
        Intrinsics.checkNotNull(animationLoadAnimation);
        animationLoadAnimation.setAnimationListener(new f());
        this.w = AnimationUtils.loadAnimation(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.outreader.d.a.d1);
        this.x = AnimationUtils.loadAnimation(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.outreader.d.a.e1);
        Animation animation = this.v;
        Intrinsics.checkNotNull(animation);
        animation.setDuration(200L);
        Animation animation2 = this.x;
        Intrinsics.checkNotNull(animation2);
        animation2.setDuration(200L);
    }

    public final void K3(@fo.l BookMarkModel bookMarkModel) {
        this.z = bookMarkModel;
    }

    public final void S3() {
        com.zentraedi.outreader.databinding.u uVar = this.q;
        com.zentraedi.outreader.databinding.u uVar2 = null;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        LinearLayout llTitleBar = uVar.F.O;
        Intrinsics.checkNotNullExpressionValue(llTitleBar, "llTitleBar");
        llTitleBar.setVisibility(4);
        com.zentraedi.outreader.databinding.u uVar3 = this.q;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar3 = null;
        }
        View lineSetBar = uVar3.E.J;
        Intrinsics.checkNotNullExpressionValue(lineSetBar, "lineSetBar");
        lineSetBar.setVisibility(4);
        com.zentraedi.outreader.databinding.u uVar4 = this.q;
        if (uVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uVar2 = uVar4;
        }
        LinearLayout rlSetBar = uVar2.E.N;
        Intrinsics.checkNotNullExpressionValue(rlSetBar, "rlSetBar");
        rlSetBar.setVisibility(4);
    }

    public final void T3() {
        com.zentraedi.outreader.databinding.u uVar = this.q;
        com.zentraedi.outreader.databinding.u uVar2 = null;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        LinearLayout llTitleBar = uVar.F.O;
        Intrinsics.checkNotNullExpressionValue(llTitleBar, "llTitleBar");
        llTitleBar.setVisibility(0);
        com.zentraedi.outreader.databinding.u uVar3 = this.q;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar3 = null;
        }
        View lineSetBar = uVar3.E.J;
        Intrinsics.checkNotNullExpressionValue(lineSetBar, "lineSetBar");
        lineSetBar.setVisibility(0);
        com.zentraedi.outreader.databinding.u uVar4 = this.q;
        if (uVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uVar2 = uVar4;
        }
        LinearLayout rlSetBar = uVar2.E.N;
        Intrinsics.checkNotNullExpressionValue(rlSetBar, "rlSetBar");
        rlSetBar.setVisibility(0);
    }

    public final void V3() {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (C3() || B3()) {
            i3(true);
        } else {
            R3();
            Y2();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.outreader.request.BookMarkAddRequest] */
    public final void W2(@fo.k Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        ?? bookMarkAddRequest = new BookMarkAddRequest();
        BookModel bookModelM = d3().M();
        bookMarkAddRequest.setBook_id(bookModelM != null ? bookModelM.getBook_id() : null);
        BookModel bookModelM2 = d3().M();
        bookMarkAddRequest.setCategory_id(bookModelM2 != null ? bookModelM2.getCategory_id() : null);
        BookMarkInfoModel.a aVar = BookMarkInfoModel.Companion;
        BookMarkInfoModel bookMarkInfoModel = new BookMarkInfoModel();
        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(this), (CoroutineContext) null, (CoroutineStart) null, new c(bookMarkInfoModel, this, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        bookMarkAddRequest.setBookmark(aVar.b(bookMarkInfoModel));
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) bookMarkAddRequest, new b(onSuccess));
    }

    public final void X3() {
        ArrayList<BookMarkModel> arrayList;
        Object objPrevious;
        String fileProgress;
        EpubPreferences epubPreferencesY;
        ReadProgressExt readProgressExt;
        BookMarkModel bookMarkModel;
        Object next;
        BookMarkModel bookMarkModel2;
        Object next2;
        String textPosition;
        Integer intOrNull;
        com.zentraedi.outreader.databinding.u uVar = this.q;
        com.zentraedi.outreader.databinding.u uVar2 = null;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        uVar.F.H.setClickable(false);
        this.z = null;
        BookModel bookModelM = d3().M();
        if (bookModelM == null || !bookModelM.isTxt()) {
            BookModel bookModelM2 = d3().M();
            if (bookModelM2 == null || !bookModelM2.isPdf()) {
                BookModel bookModelM3 = d3().M();
                if (bookModelM3 != null && bookModelM3.isEpub()) {
                    List list = (List) d3().O().f();
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (Object obj : list) {
                            BookMarkInfoModel bookMarkInfoModelA = BookMarkInfoModel.Companion.a(((BookMarkModel) obj).getBookmark());
                            String fileIndex = bookMarkInfoModelA != null ? bookMarkInfoModelA.getFileIndex() : null;
                            BookModel bookModelM4 = d3().M();
                            if (Intrinsics.areEqual(fileIndex, (bookModelM4 == null || (readProgressExt = bookModelM4.getReadProgressExt()) == null) ? null : readProgressExt.getFileIndex())) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        BookModel bookModelM5 = d3().M();
                        int chapterTotalPage = bookModelM5 != null ? bookModelM5.getChapterTotalPage() : 0;
                        if (chapterTotalPage < 1) {
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (int i = 0; i < chapterTotalPage; i++) {
                            arrayList2.add(new Pair(Integer.valueOf(i), Double.valueOf(((double) i) / ((double) chapterTotalPage))));
                        }
                        double d2 = 0.454d / ((double) chapterTotalPage);
                        com.zentraedi.outreader.reader.h hVarY = d3().Y();
                        com.zentraedi.outreader.reader.b bVar = hVarY instanceof com.zentraedi.outreader.reader.b ? (com.zentraedi.outreader.reader.b) hVarY : null;
                        if ((bVar == null || (epubPreferencesY = bVar.Y()) == null) ? false : Intrinsics.areEqual(epubPreferencesY.getScroll(), Boolean.TRUE)) {
                            d2 = 0.0d;
                        }
                        for (BookMarkModel bookMarkModel3 : arrayList) {
                            BookMarkInfoModel bookMarkInfoModelA2 = BookMarkInfoModel.Companion.a(bookMarkModel3.getBookmark());
                            Double doubleOrNull = (bookMarkInfoModelA2 == null || (fileProgress = bookMarkInfoModelA2.getFileProgress()) == null) ? null : StringsKt.toDoubleOrNull(fileProgress);
                            if (doubleOrNull != null) {
                                Double dValueOf = Double.valueOf(doubleOrNull.doubleValue() + d2);
                                ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                                do {
                                    if (!listIterator.hasPrevious()) {
                                        objPrevious = null;
                                        break;
                                    }
                                    objPrevious = listIterator.previous();
                                } while (!(dValueOf.doubleValue() >= ((Number) ((Pair) objPrevious).getSecond()).doubleValue()));
                                Pair pair = (Pair) objPrevious;
                                if (pair != null) {
                                    BookModel bookModelM6 = d3().M();
                                    if ((bookModelM6 != null ? bookModelM6.getReadPageInt() : 0) == ((Number) pair.getFirst()).intValue()) {
                                        this.z = bookMarkModel3;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            } else {
                List list2 = (List) d3().O().f();
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        BookMarkInfoModel bookMarkInfoModelA3 = BookMarkInfoModel.Companion.a(((BookMarkModel) next).getBookmark());
                        String chapterId = bookMarkInfoModelA3 != null ? bookMarkInfoModelA3.getChapterId() : null;
                        BookModel bookModelM7 = d3().M();
                        if (Intrinsics.areEqual(chapterId, bookModelM7 != null ? bookModelM7.getRead_chapter_id() : null)) {
                            String pageIndex = bookMarkInfoModelA3 != null ? bookMarkInfoModelA3.getPageIndex() : null;
                            BookModel bookModelM8 = d3().M();
                            if (Intrinsics.areEqual(pageIndex, bookModelM8 != null ? bookModelM8.getRead_page() : null)) {
                                break;
                            }
                        }
                    }
                    bookMarkModel = (BookMarkModel) next;
                } else {
                    bookMarkModel = null;
                }
                this.z = bookMarkModel;
            }
        } else if (d3().Y() instanceof com.zentraedi.outreader.reader.d) {
            com.zentraedi.outreader.reader.h hVarY2 = d3().Y();
            Intrinsics.checkNotNull(hVarY2, "null cannot be cast to non-null type com.zentraedi.outreader.reader.PageViewZReader");
            PageView pageViewE = ((com.zentraedi.outreader.reader.d) hVarY2).E();
            com.zentraedi.reader.reader.m currentPage = pageViewE != null ? pageViewE.getCurrentPage() : null;
            if (currentPage != null) {
                List list3 = (List) d3().O().f();
                if (list3 != null) {
                    Iterator it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        BookMarkInfoModel bookMarkInfoModelA4 = BookMarkInfoModel.Companion.a(((BookMarkModel) next2).getBookmark());
                        int iIntValue = (bookMarkInfoModelA4 == null || (textPosition = bookMarkInfoModelA4.getTextPosition()) == null || (intOrNull = StringsKt.toIntOrNull(textPosition)) == null) ? 0 : intOrNull.intValue();
                        String chapterId2 = bookMarkInfoModelA4 != null ? bookMarkInfoModelA4.getChapterId() : null;
                        BookModel bookModelM9 = d3().M();
                        if (Intrinsics.areEqual(chapterId2, bookModelM9 != null ? bookModelM9.getRead_chapter_id() : null) && iIntValue > currentPage.m() - 1 && iIntValue < currentPage.c() - 1) {
                            break;
                        }
                    }
                    bookMarkModel2 = (BookMarkModel) next2;
                } else {
                    bookMarkModel2 = null;
                }
                this.z = bookMarkModel2;
            }
        }
        com.zentraedi.outreader.databinding.u uVar3 = this.q;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar3 = null;
        }
        uVar3.F.H.setSelected(this.z != null);
        com.zentraedi.outreader.databinding.u uVar4 = this.q;
        if (uVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uVar2 = uVar4;
        }
        uVar2.F.H.setClickable(true);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.outreader.request.BookMarkDeleteRequest] */
    public final void Z2(@fo.l String str, boolean z, @fo.k Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        ArrayList arrayList = new ArrayList();
        if (!z) {
            if (str == null || StringsKt.isBlank(str)) {
                return;
            } else {
                arrayList.add(str);
            }
        }
        ?? bookMarkDeleteRequest = new BookMarkDeleteRequest();
        BookModel bookModelM = d3().M();
        bookMarkDeleteRequest.setBook_id(bookModelM != null ? bookModelM.getBook_id() : null);
        BookModel bookModelM2 = d3().M();
        bookMarkDeleteRequest.setCategory_id(bookModelM2 != null ? bookModelM2.getCategory_id() : null);
        bookMarkDeleteRequest.setBookmark_id(arrayList);
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) bookMarkDeleteRequest, new e(onSuccess, z));
    }

    @fo.l
    public final BookMarkModel c3() {
        return this.z;
    }

    public void onConfigurationChanged(@fo.k Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(newConfig);
        int i = newConfig.uiMode;
        int i2 = i & 15;
        int i3 = i & 48;
        nd.a.e("nas_book", "ReaderMenusFragment->onConfigurationChanged type=" + i2 + " nightMode=" + i3);
        com.zentraedi.outreader.databinding.u uVar = null;
        if (i3 == 16) {
            com.zentraedi.outreader.databinding.u uVar2 = this.q;
            if (uVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                uVar = uVar2;
            }
            uVar.F.O.invalidate();
            return;
        }
        if (i3 != 32) {
            return;
        }
        com.zentraedi.outreader.databinding.u uVar3 = this.q;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uVar = uVar3;
        }
        uVar.F.O.invalidate();
    }

    @fo.l
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(inflater, com.zentraedi.outreader.d.l.Y5, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.outreader.databinding.u uVar = (com.zentraedi.outreader.databinding.u) c0VarJ;
        this.q = uVar;
        com.zentraedi.outreader.databinding.u uVar2 = null;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            uVar = null;
        }
        uVar.C1(b3());
        com.zentraedi.outreader.databinding.u uVar3 = this.q;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            uVar2 = uVar3;
        }
        return uVar2.getRoot();
    }

    public void onViewCreated(@fo.k View view, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        if (NasConnectManager.getInstance().isOfflineLogin() || (d3().N() instanceof CourseFileInfoModel) || (d3().N() instanceof LocalFileModel)) {
            com.zentraedi.outreader.databinding.u uVar = this.q;
            com.zentraedi.outreader.databinding.u uVar2 = null;
            if (uVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                uVar = null;
            }
            uVar.F.F.setVisibility(8);
            com.zentraedi.outreader.databinding.u uVar3 = this.q;
            if (uVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                uVar2 = uVar3;
            }
            uVar2.F.H.setVisibility(8);
        }
        BookModel bookModelM = d3().M();
        boolean z = false;
        if (bookModelM != null && bookModelM.getAdd_shelf() == 1) {
            z = true;
        }
        W3(z);
        Object objD = t7.d(gh.b.Q, Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        this.s = ((Boolean) objD).booleanValue();
        z3();
        k3();
    }
}
