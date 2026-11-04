package com.zentraedi.outreader.v2.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.outreader.model.BookMarkInfoModel;
import com.zentraedi.outreader.model.BookMarkModel;
import com.zentraedi.outreader.model.ChapterM;
import com.zentraedi.outreader.request.BookMarkDeleteRequest;
import com.zentraedi.outreader.responsemodel.BookModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nBookMarkFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookMarkFragment.kt\ncom/zentraedi/outreader/v2/fragment/BookMarkFragment\n+ 2 DialogTipsBuilder.kt\ncom/zentraedi/business/widget/DialogTipsBuilderKt\n*L\n1#1,129:1\n146#2:130\n*S KotlinDebug\n*F\n+ 1 BookMarkFragment.kt\ncom/zentraedi/outreader/v2/fragment/BookMarkFragment\n*L\n58#1:130\n*E\n"})
public final class h extends com.zentraedi.business.fragment.a {

    @fo.k
    public static final a q = new a(null);
    private com.zentraedi.outreader.databinding.m o;

    @fo.k
    private final Lazy n = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h.M2(this.a);
        }
    });

    @fo.k
    private final Lazy p = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.zentraedi.outreader.v2.fragment.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h.L2();
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.k
        public final h a() {
            return new h();
        }

        private a() {
        }
    }

    public static final class b extends com.zentraedi.business.http.b<BaseModel> {
        final /* synthetic */ boolean a;
        final /* synthetic */ h b;

        b(boolean z, h hVar) {
            this.a = z;
            this.b = hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(List list) {
            return Unit.INSTANCE;
        }

        public void onResult(ResponseData<BaseModel> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(this.a ? com.zentraedi.outreader.d.q.cn2 : com.zentraedi.outreader.d.q.go2), true);
            } else {
                com.zentraedi.basic.function.ui.toast.a.w(resp.getMsg(), false);
            }
            this.b.K2().c0(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h.b.b((List) obj);
                }
            });
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.eF4), false);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.BookMarkFragment$onViewCreated$2$1", f = "BookMarkFragment.kt", i = {0}, l = {71}, m = "invokeSuspend", n = {"readerFragment"}, s = {"L$0"}, v = 1)
    @SourceDebugExtension({"SMAP\nBookMarkFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookMarkFragment.kt\ncom/zentraedi/outreader/v2/fragment/BookMarkFragment$onViewCreated$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n295#2,2:130\n*S KotlinDebug\n*F\n+ 1 BookMarkFragment.kt\ncom/zentraedi/outreader/v2/fragment/BookMarkFragment$onViewCreated$2$1\n*L\n73#1:130,2\n*E\n"})
    static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        Object a;
        int b;
        final /* synthetic */ BookMarkModel d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(BookMarkModel bookMarkModel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.d = bookMarkModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new c(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Fragment fragment;
            Object next;
            String pageIndex;
            Integer intOrNull;
            String textPosition;
            Integer intOrNull2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            int iIntValue = 0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                h.this.K2().X().r(Boxing.boxBoolean(false));
                Fragment fragmentQ = h.this.K2().Y().q();
                com.zentraedi.outreader.reader.h hVarY = h.this.K2().Y();
                this.a = fragmentQ;
                this.b = 1;
                Object objM = hVarY.m(this);
                if (objM == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fragment = fragmentQ;
                obj = objM;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fragment = (Fragment) this.a;
                ResultKt.throwOnFailure(obj);
            }
            BookMarkInfoModel bookMarkInfoModelA = BookMarkInfoModel.Companion.a(this.d.getBookmark());
            Iterator it = ((List) obj).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((ChapterM.Chapter) next).f985id, bookMarkInfoModelA != null ? bookMarkInfoModelA.getChapterId() : null));
            ChapterM.Chapter chapter = (ChapterM.Chapter) next;
            if (chapter != null) {
                if (fragment instanceof w2) {
                    w2 w2Var = (w2) fragment;
                    String id2 = chapter.f985id;
                    Intrinsics.checkNotNullExpressionValue(id2, "id");
                    w2Var.K2(id2, (bookMarkInfoModelA == null || (textPosition = bookMarkInfoModelA.getTextPosition()) == null || (intOrNull2 = StringsKt.toIntOrNull(textPosition)) == null) ? -1 : intOrNull2.intValue());
                } else if (fragment instanceof t) {
                    t tVar = (t) fragment;
                    String id3 = chapter.f985id;
                    Intrinsics.checkNotNullExpressionValue(id3, "id");
                    if (bookMarkInfoModelA != null && (pageIndex = bookMarkInfoModelA.getPageIndex()) != null && (intOrNull = StringsKt.toIntOrNull(pageIndex)) != null) {
                        iIntValue = intOrNull.intValue();
                    }
                    tVar.J2(id3, iIntValue);
                }
            }
            if (fragment instanceof n) {
                ((n) fragment).N2(bookMarkInfoModelA != null ? bookMarkInfoModelA.getFileIndex() : null, bookMarkInfoModelA != null ? bookMarkInfoModelA.getFileProgress() : null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class d implements androidx.lifecycle.e1, FunctionAdapter {
        private final /* synthetic */ Function1 a;

        d(Function1 function) {
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

    public static /* synthetic */ void I2(h hVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        hVar.H2(str, z);
    }

    private final com.zentraedi.outreader.adapter.e J2() {
        return (com.zentraedi.outreader.adapter.e) this.p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.outreader.viewmodel.d K2() {
        return (com.zentraedi.outreader.viewmodel.d) this.n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.adapter.e L2() {
        return new com.zentraedi.outreader.adapter.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.d M2(h hVar) {
        FragmentActivity fragmentActivityRequireActivity = hVar.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new androidx.lifecycle.m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(final h hVar, View view) {
        Context context = hVar.getContext();
        com.zentraedi.business.widget.h0.y(com.zentraedi.business.widget.h0.v(new com.zentraedi.business.widget.h0(context).I(com.zentraedi.outreader.d.q.RC2).n(com.zentraedi.outreader.d.q.PC2), 0, new Function1() { // from class: com.zentraedi.outreader.v2.fragment.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.O2(this.a, (com.zentraedi.business.dialog.n) obj);
            }
        }, 1, (Object) null), (Function1) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O2(h hVar, com.zentraedi.business.dialog.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        hVar.H2(null, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P2(h hVar, BookMarkModel bookMarkModel, View view, int i) {
        if (bookMarkModel == null) {
            return Unit.INSTANCE;
        }
        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(hVar), (CoroutineContext) null, (CoroutineStart) null, hVar.new c(bookMarkModel, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q2(h hVar, BookMarkModel bookMarkModel, Integer num, int i) {
        I2(hVar, String.valueOf(bookMarkModel != null ? bookMarkModel.getBookmark_id() : null), false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R2(h hVar, List list) {
        Intrinsics.checkNotNull(list);
        hVar.S2(list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.outreader.request.BookMarkDeleteRequest] */
    public final void H2(@fo.l String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!z) {
            if (str == null || StringsKt.isBlank(str)) {
                return;
            } else {
                arrayList.add(str);
            }
        }
        ?? bookMarkDeleteRequest = new BookMarkDeleteRequest();
        BookModel bookModelM = K2().M();
        bookMarkDeleteRequest.setBook_id(bookModelM != null ? bookModelM.getBook_id() : null);
        BookModel bookModelM2 = K2().M();
        bookMarkDeleteRequest.setCategory_id(bookModelM2 != null ? bookModelM2.getCategory_id() : null);
        bookMarkDeleteRequest.setBookmark_id(arrayList);
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) bookMarkDeleteRequest, new b(z, this));
    }

    public final void S2(@fo.k List<BookMarkModel> bookMarkList) {
        Intrinsics.checkNotNullParameter(bookMarkList, "bookMarkList");
        if (!isAdded() || isDetached()) {
            return;
        }
        J2().submitList(bookMarkList);
        com.zentraedi.outreader.databinding.m mVar = this.o;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            mVar = null;
        }
        mVar.H.setText(com.zentraedi.basic.function.utils.l.f(Integer.valueOf(com.zentraedi.outreader.d.q.tC2), "num", Integer.valueOf(bookMarkList.size())));
    }

    @fo.k
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(inflater, com.zentraedi.outreader.d.l.h5, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.outreader.databinding.m mVar = (com.zentraedi.outreader.databinding.m) c0VarJ;
        this.o = mVar;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            mVar = null;
        }
        View root = mVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public void onViewCreated(@fo.k View view, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        com.zentraedi.outreader.databinding.m mVar = this.o;
        com.zentraedi.outreader.databinding.m mVar2 = null;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            mVar = null;
        }
        mVar.F.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        com.zentraedi.outreader.databinding.m mVar3 = this.o;
        if (mVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            mVar3 = null;
        }
        mVar3.F.setAdapter(J2());
        com.zentraedi.outreader.databinding.m mVar4 = this.o;
        if (mVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            mVar2 = mVar4;
        }
        mVar2.G.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h.N2(this.a, view2);
            }
        });
        J2().N(new Function3() { // from class: com.zentraedi.outreader.v2.fragment.c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return h.P2(this.a, (BookMarkModel) obj, (View) obj2, ((Integer) obj3).intValue());
            }
        });
        J2().M(new Function3() { // from class: com.zentraedi.outreader.v2.fragment.d
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return h.Q2(this.a, (BookMarkModel) obj, (Integer) obj2, ((Integer) obj3).intValue());
            }
        });
        K2().O().k(getViewLifecycleOwner(), new d(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.R2(this.a, (List) obj);
            }
        }));
    }
}
