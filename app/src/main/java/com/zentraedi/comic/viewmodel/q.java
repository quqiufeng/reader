package com.zentraedi.comic.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.operationpopup.OperationItemViewModel;
import com.zentraedi.business.utils.t7;
import com.zentraedi.comic.delegate.ForceRefreshState;
import com.zentraedi.comic.event.ComicFilesDeleteEvent;
import com.zentraedi.comic.event.ComicHouseAddedEvent;
import com.zentraedi.comic.event.ComicHouseRefreshedEvent;
import com.zentraedi.comic.model.ComicDirListResponse;
import com.zentraedi.comic.model.ForceRefresh;
import com.zentraedi.comic.request.ComicDirDeleteRequest;
import com.zentraedi.comic.request.ComicDirListRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicCategoryContentManagementViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCategoryContentManagementViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCategoryContentManagementViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,445:1\n1869#2:446\n1870#2:448\n1869#2,2:449\n1869#2,2:451\n1869#2,2:453\n1869#2,2:455\n1869#2,2:457\n1#3:447\n*S KotlinDebug\n*F\n+ 1 ComicCategoryContentManagementViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCategoryContentManagementViewModel\n*L\n169#1:446\n169#1:448\n212#1:449,2\n257#1:451,2\n268#1:453,2\n273#1:455,2\n282#1:457,2\n*E\n"})
public final class q extends com.zentraedi.basic.function.viewmodel.e {

    @fo.l
    private ComicDirListRequest f;

    @fo.l
    private kotlinx.coroutines.k2 j;

    @fo.l
    private ComicCategory k;

    @fo.l
    private j0 n;

    @fo.l
    private com.zentraedi.business.business.w o;

    @fo.k
    private final Function1<ForceRefresh, Unit> p;

    @fo.k
    private final ObservableBoolean a = new ObservableBoolean(false);

    @fo.k
    private final ObservableBoolean b = new ObservableBoolean(false);

    @fo.k
    private final ObservableField<String> c = new ObservableField<>("");

    @fo.k
    private final ObservableField<String> d = new ObservableField<>(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.CJ));

    @fo.k
    private final ObservableField<String> e = new ObservableField<>(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.mI));

    @fo.k
    private final Lazy g = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return q.J0();
        }
    });

    @fo.k
    private final Lazy h = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return q.L0();
        }
    });

    @fo.k
    private final ArrayList<j0> i = new ArrayList<>();

    @fo.k
    private final Lazy l = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.viewmodel.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return q.K0(this.a);
        }
    });

    @fo.k
    private String m = "";

    public static final class a implements com.zentraedi.business.utils.n4.f {
        final /* synthetic */ Context b;
        final /* synthetic */ View c;

        a(Context context, View view) {
            this.b = context;
            this.c = view;
        }

        public void a(Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2)) {
                t7.j(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.g, (String) null, 1, (Object) null), bool2);
            }
            q.this.k0(this.b, this.c);
        }
    }

    public static final class b implements com.zentraedi.business.utils.n4.f {
        final /* synthetic */ Context b;
        final /* synthetic */ View c;

        b(Context context, View view) {
            this.b = context;
            this.c = view;
        }

        public void a(Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2)) {
                t7.j(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.g, (String) null, 1, (Object) null), bool2);
            }
            q.this.T0(this.b, this.c);
        }
    }

    @SourceDebugExtension({"SMAP\nComicCategoryContentManagementViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCategoryContentManagementViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCategoryContentManagementViewModel$deleteComicDirModel$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,445:1\n774#2:446\n865#2,2:447\n*S KotlinDebug\n*F\n+ 1 ComicCategoryContentManagementViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCategoryContentManagementViewModel$deleteComicDirModel$1\n*L\n433#1:446\n433#1:447,2\n*E\n"})
    public static final class c extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ ComicDirModel b;

        c(ComicDirModel comicDirModel) {
            this.b = comicDirModel;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (resp.isSuccess()) {
                ArrayList arrayList = q.this.i;
                ComicDirModel comicDirModel = this.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (Intrinsics.areEqual(comicDirModel.getId(), ((j0) obj).P())) {
                        arrayList2.add(obj);
                    }
                }
                q.this.i.removeAll(CollectionsKt.toSet(arrayList2));
                q.this.H0().set(q.this.i.isEmpty());
                q.this.B0().notifyDataSetChanged();
                org.greenrobot.eventbus.c.f().q(new ComicFilesDeleteEvent(CollectionsKt.arrayListOf(this.b.getPath()), Boolean.TRUE));
            }
        }

        public void onServerError() {
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicCategoryContentManagementViewModel$getAllContent$1", f = "ComicCategoryContentManagementViewModel.kt", i = {0, 0}, l = {125}, m = "invokeSuspend", n = {"$this$launch", "response"}, s = {"L$0", "L$1"}, v = 1)
    static final class d extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        Object a;
        int b;
        private /* synthetic */ Object c;

        @DebugMetadata(c = "com.zentraedi.comic.viewmodel.ComicCategoryContentManagementViewModel$getAllContent$1$2", f = "ComicCategoryContentManagementViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        @SourceDebugExtension({"SMAP\nComicCategoryContentManagementViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCategoryContentManagementViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCategoryContentManagementViewModel$getAllContent$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,445:1\n1869#2,2:446\n*S KotlinDebug\n*F\n+ 1 ComicCategoryContentManagementViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCategoryContentManagementViewModel$getAllContent$1$2\n*L\n127#1:446,2\n*E\n"})
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ q b;
            final /* synthetic */ ResponseData<ComicDirListResponse> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, ResponseData<ComicDirListResponse> responseData, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = qVar;
                this.c = responseData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ComicDirListResponse data;
                List<ComicDirModel> list;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.i.clear();
                ResponseData<ComicDirListResponse> responseData = this.c;
                if (responseData != null && (data = responseData.getData()) != null && (list = data.getList()) != null) {
                    q qVar = this.b;
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        qVar.i.add(qVar.s0((ComicDirModel) it.next()));
                    }
                }
                if (this.b.i.size() == 0) {
                    this.b.H0().set(true);
                } else {
                    this.b.H0().set(false);
                    this.b.O0();
                }
                this.b.B0().U1(this.b.i);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = q.this.new d(continuation);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.c;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                q qVar = q.this;
                ComicCategory comicCategory = qVar.k;
                ComicDirListRequest comicDirListRequest = new ComicDirListRequest(comicCategory != null ? comicCategory.getId() : null);
                comicDirListRequest.setSortBy("ctime");
                comicDirListRequest.setOrder("desc");
                qVar.f = comicDirListRequest;
                ResponseData responseDataK = com.zentraedi.business.http.a.b().k(q.this.f, ComicDirListResponse.class);
                q.this.I0().set(false);
                if (responseDataK == null || !responseDataK.isSuccess()) {
                    com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.Bu1, responseDataK != null ? responseDataK.getCode() : null, responseDataK != null ? responseDataK.getMsg() : null), false);
                }
                if (!kotlinx.coroutines.r0.k(q0Var)) {
                    return Unit.INSTANCE;
                }
                kotlinx.coroutines.u2 u2VarE = kotlinx.coroutines.g1.e();
                a aVar = new a(q.this, responseDataK, null);
                this.c = SpillingKt.nullOutSpilledVariable(q0Var);
                this.a = SpillingKt.nullOutSpilledVariable(responseDataK);
                this.b = 1;
                if (kotlinx.coroutines.i.h(u2VarE, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((d) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @SourceDebugExtension({"SMAP\nComicCategoryContentManagementViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCategoryContentManagementViewModel.kt\ncom/zentraedi/comic/viewmodel/ComicCategoryContentManagementViewModel$initCommonMoreOperationPopupBusiness$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,445:1\n1#2:446\n*E\n"})
    public static final class e implements com.zentraedi.business.business.w.a {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(q qVar) {
            ObservableField<Boolean> observableFieldR;
            qVar.I0().set(false);
            j0 j0Var = qVar.n;
            if (j0Var == null || (observableFieldR = j0Var.R()) == null) {
                return;
            }
            observableFieldR.set(Boolean.FALSE);
        }

        public void a(String str) {
            String strP;
            ObservableField<Boolean> observableFieldR;
            j0 j0Var;
            ObservableField<Boolean> observableFieldR2;
            if (com.zentraedi.business.utils.m.c()) {
                return;
            }
            if (Intrinsics.areEqual(str, com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.wA))) {
                j0 j0Var2 = q.this.n;
                if (((j0Var2 == null || (observableFieldR2 = j0Var2.R()) == null) ? false : Intrinsics.areEqual(observableFieldR2.get(), Boolean.TRUE)) || (j0Var = q.this.n) == null) {
                    return;
                }
                q qVar = q.this;
                BaseModel source = j0Var.getSource();
                Intrinsics.checkNotNull(source, "null cannot be cast to non-null type com.zentraedi.business.model.ComicDirModel");
                qVar.V0((ComicDirModel) source);
                return;
            }
            if (!Intrinsics.areEqual(str, com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.GB))) {
                if (Intrinsics.areEqual(str, com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dY))) {
                    com.zentraedi.comic.delegate.a aVar = com.zentraedi.comic.delegate.a.a;
                    final q qVar2 = q.this;
                    aVar.g(new com.zentraedi.business.listener.l() { // from class: com.zentraedi.comic.viewmodel.r
                        public final void continueDo() {
                            q.e.c(qVar2);
                        }
                    });
                    return;
                }
                return;
            }
            j0 j0Var3 = q.this.n;
            if (j0Var3 != null && (observableFieldR = j0Var3.R()) != null) {
                observableFieldR.set(Boolean.TRUE);
            }
            q qVar3 = q.this;
            j0 j0Var4 = qVar3.n;
            if (j0Var4 == null || (strP = j0Var4.P()) == null) {
                strP = "";
            }
            qVar3.P0(strP);
            org.greenrobot.eventbus.c.f().q(new ComicHouseRefreshedEvent(null, 1, null));
        }
    }

    static final class f implements androidx.lifecycle.e1, FunctionAdapter {
        private final /* synthetic */ Function1 a;

        f(Function1 function) {
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

    public q() {
        G0();
        this.p = new Function1() { // from class: com.zentraedi.comic.viewmodel.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.x0(this.a, (ForceRefresh) obj);
            }
        };
    }

    private final com.zentraedi.comic.business.b A0() {
        return (com.zentraedi.comic.business.b) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.comic.adapter.m B0() {
        return (com.zentraedi.comic.adapter.m) this.l.getValue();
    }

    private final com.zentraedi.comic.business.a1 C0() {
        return (com.zentraedi.comic.business.a1) this.h.getValue();
    }

    private final List<OperationItemViewModel> F0() {
        ObservableField<Boolean> observableFieldR;
        ArrayList arrayList = new ArrayList();
        j0 j0Var = this.n;
        boolean zAreEqual = (j0Var == null || (observableFieldR = j0Var.R()) == null) ? false : Intrinsics.areEqual(observableFieldR.get(), Boolean.TRUE);
        if (zAreEqual) {
            OperationItemViewModel operationItemViewModel = new OperationItemViewModel();
            operationItemViewModel.setViewType(OperationItemViewModel.COMMON_ITEM);
            operationItemViewModel.icon.set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.dk));
            operationItemViewModel.title.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dY));
            arrayList.add(operationItemViewModel);
        } else {
            OperationItemViewModel operationItemViewModel2 = new OperationItemViewModel();
            operationItemViewModel2.setViewType(OperationItemViewModel.COMMON_ITEM);
            operationItemViewModel2.icon.set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.VG));
            operationItemViewModel2.title.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.GB));
            arrayList.add(operationItemViewModel2);
        }
        OperationItemViewModel operationItemViewModel3 = new OperationItemViewModel();
        operationItemViewModel3.setViewType(OperationItemViewModel.COMMON_ITEM);
        operationItemViewModel3.icon.set(com.zentraedi.basic.function.utils.a.g(zAreEqual ? com.zentraedi.comic.q.h.eH : com.zentraedi.comic.q.h.hH));
        operationItemViewModel3.titleTextColor.set(com.zentraedi.basic.function.utils.a.d(zAreEqual ? com.zentraedi.comic.q.f.e8 : com.zentraedi.comic.q.f.Ud));
        operationItemViewModel3.title.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.wA));
        arrayList.add(operationItemViewModel3);
        return arrayList;
    }

    private final void G0() {
        com.zentraedi.business.business.w wVar = new com.zentraedi.business.business.w();
        this.o = wVar;
        wVar.f(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.b J0() {
        return new com.zentraedi.comic.business.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.adapter.m K0(q qVar) {
        return new com.zentraedi.comic.adapter.m(qVar.k != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.a1 L0() {
        return new com.zentraedi.comic.business.a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0(Context context, View view) {
        String path;
        ArrayList arrayList = new ArrayList();
        List<j0> data = B0().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        for (j0 j0Var : data) {
            BaseModel source = j0Var != null ? j0Var.getSource() : null;
            ComicDirModel comicDirModel = source instanceof ComicDirModel ? (ComicDirModel) source : null;
            if (comicDirModel != null && (path = comicDirModel.getPath()) != null) {
                String str = StringsKt.isBlank(path) ? null : path;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        com.zentraedi.comic.business.b bVarA0 = A0();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        com.zentraedi.comic.business.b.g(bVarA0, (FragmentActivity) context, view, null, arrayList, new Function0() { // from class: com.zentraedi.comic.viewmodel.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.U0(this.a);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U0(q qVar) {
        qVar.y0();
        org.greenrobot.eventbus.c.f().q(new ComicHouseAddedEvent(null, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(q qVar, ComicDirModel comicDirModel, com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        qVar.w0(comicDirModel);
        bVar.dismiss();
    }

    private final void Y0(View view) {
        com.zentraedi.business.business.w wVar = this.o;
        if (wVar != null) {
            Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
            Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
            List<OperationItemViewModel> listF0 = F0();
            String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Cw);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            com.zentraedi.business.business.w.h(wVar, activityE, view, listF0, strN, (String) null, (Drawable) null, 48, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(Context context, View view) {
        String path;
        ArrayList arrayList = new ArrayList();
        List data = B0().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator it = data.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            j0 j0Var = (j0) it.next();
            BaseModel source = j0Var != null ? j0Var.getSource() : null;
            ComicDirModel comicDirModel = source instanceof ComicDirModel ? (ComicDirModel) source : null;
            if (comicDirModel != null && (path = comicDirModel.getPath()) != null) {
                String str = StringsKt.isBlank(path) ? null : path;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        com.zentraedi.comic.business.b bVarA0 = A0();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        ComicCategory comicCategory = this.k;
        bVarA0.f(fragmentActivity, view, comicCategory != null ? comicCategory.getId() : null, arrayList, new Function0() { // from class: com.zentraedi.comic.viewmodel.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.l0(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(q qVar) {
        qVar.y0();
        qVar.refreshData();
        org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
        ComicCategory comicCategory = qVar.k;
        cVarF.q(new ComicHouseAddedEvent(comicCategory != null ? comicCategory.getId() : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(FragmentActivity fragmentActivity, q qVar, fg.a aVar) {
        if (aVar.e()) {
            fragmentActivity.finish();
        } else if (aVar.d()) {
            qVar.refreshData();
        } else {
            Intrinsics.checkNotNull(aVar);
            qVar.r0(aVar);
        }
        return Unit.INSTANCE;
    }

    private final void o0(ArrayList<j0> arrayList) {
        j0 j0Var = new j0();
        j0Var.setViewType(com.zentraedi.comic.constant.a.InterfaceC0110a.hf.c());
        arrayList.add(0, j0Var);
    }

    private final void r0(fg.a aVar) {
        String strA = aVar.a();
        ComicCategory comicCategory = this.k;
        if (Intrinsics.areEqual(strA, comicCategory != null ? comicCategory.getId() : null)) {
            ComicCategory comicCategory2 = this.k;
            if (comicCategory2 != null) {
                comicCategory2.setName(aVar.b());
            }
            ObservableField<String> observableField = this.c;
            ComicCategory comicCategory3 = this.k;
            observableField.set(comicCategory3 != null ? comicCategory3.getName() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j0 s0(final ComicDirModel comicDirModel) {
        String id2;
        ComicCategory category;
        String path;
        ComicCategory category2;
        final j0 j0Var = new j0();
        j0Var.setViewType(com.zentraedi.comic.constant.a.InterfaceC0110a.hf.a());
        String name = null;
        j0Var.getFileName().set(com.zentraedi.business.utils.l5.J(comicDirModel != null ? comicDirModel.getPath() : null));
        if (comicDirModel == null || (id2 = comicDirModel.getId()) == null) {
            id2 = "0";
        }
        j0Var.U(id2);
        j0Var.setSource(comicDirModel);
        ObservableField<String> observableFieldL = j0Var.L();
        String str = "";
        if (Intrinsics.areEqual("", (comicDirModel == null || (category2 = comicDirModel.getCategory()) == null) ? null : category2.getName())) {
            name = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.FH);
        } else if (comicDirModel != null && (category = comicDirModel.getCategory()) != null) {
            name = category.getName();
        }
        observableFieldL.set(name);
        ObservableField<String> filePath = j0Var.getFilePath();
        com.zentraedi.business.utils.d5.a aVar = com.zentraedi.business.utils.d5.a;
        if (comicDirModel != null && (path = comicDirModel.getPath()) != null) {
            str = path;
        }
        filePath.set(aVar.m(aVar.r(str)));
        j0Var.S(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.t0(comicDirModel, this, view);
            }
        });
        j0Var.T(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.u0(comicDirModel, view);
            }
        });
        j0Var.V(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.v0(this.a, j0Var, view);
            }
        });
        return j0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(ComicDirModel comicDirModel, q qVar, View view) {
        if (comicDirModel != null) {
            qVar.V0(comicDirModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(ComicDirModel comicDirModel, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        com.zentraedi.business.l0.g().e.L(com.zentraedi.basic.function.utils.a.h().e(), comicDirModel != null ? comicDirModel.getPath() : null, com.zentraedi.business.utils.l5.r(comicDirModel != null ? comicDirModel.getPath() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(q qVar, j0 j0Var, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        qVar.n = j0Var;
        qVar.Y0(view);
    }

    private final void w0(ComicDirModel comicDirModel) {
        com.zentraedi.business.http.a.b().h(new ComicDirDeleteRequest(comicDirModel.getId()), new c(comicDirModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x0(q qVar, ForceRefresh forceRefresh) {
        Object next;
        Intrinsics.checkNotNullParameter(forceRefresh, "forceRefresh");
        List<j0> data = qVar.B0().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        String state = forceRefresh.getState();
        if (Intrinsics.areEqual(state, ForceRefreshState.DONE.getValue())) {
            qVar.b.set(false);
            qVar.y0();
        } else if (Intrinsics.areEqual(state, ForceRefreshState.CANCEL.getValue())) {
            qVar.b.set(false);
            if (!com.zentraedi.basic.function.utils.j0.l(data)) {
                Iterator it = data.iterator();
                while (it.hasNext()) {
                    ((j0) it.next()).R().set(Boolean.FALSE);
                }
            }
        } else if (Intrinsics.areEqual(state, ForceRefreshState.RUNNING.getValue()) || Intrinsics.areEqual(state, ForceRefreshState.WAITING.getValue())) {
            qVar.b.set(true);
            List<String> dirIdList = forceRefresh.getDirIdList();
            if (com.zentraedi.basic.function.utils.j0.l(dirIdList)) {
                Iterator it2 = data.iterator();
                while (it2.hasNext()) {
                    ((j0) it2.next()).R().set(Boolean.TRUE);
                }
            } else {
                for (j0 j0Var : data) {
                    Iterator<T> it3 = dirIdList.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!Intrinsics.areEqual((String) next, j0Var.P()));
                    j0Var.R().set(Boolean.valueOf(((String) next) != null));
                }
            }
        } else {
            qVar.b.set(false);
            if (!com.zentraedi.basic.function.utils.j0.l(data)) {
                Iterator it4 = data.iterator();
                while (it4.hasNext()) {
                    ((j0) it4.next()).R().set(Boolean.FALSE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    @fo.k
    public final String D0() {
        return this.m;
    }

    @fo.k
    public final ObservableField<String> E0() {
        return this.c;
    }

    @fo.k
    public final ObservableBoolean H0() {
        return this.a;
    }

    @fo.k
    public final ObservableBoolean I0() {
        return this.b;
    }

    public final void M0() {
        ComicCategory comicCategory = this.k;
        if (comicCategory != null) {
            C0().T(comicCategory.getId(), comicCategory.getName(), new Function1() { // from class: com.zentraedi.comic.viewmodel.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q.N0(((Boolean) obj).booleanValue());
                }
            });
        }
    }

    public final void O0() {
        com.zentraedi.comic.delegate.a.a.k(this.p);
    }

    public final void P0(@fo.k String ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        com.zentraedi.comic.delegate.a.a.n(this.p, 2000L, ids);
    }

    public final void Q0() {
        this.b.set(true);
        this.m = "";
        org.greenrobot.eventbus.c.f().q(new ComicHouseRefreshedEvent(null, 1, null));
        refreshData();
    }

    public final void R0(@fo.k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.m = str;
    }

    public final void S0(@fo.l ComicCategory comicCategory) {
        this.k = comicCategory;
        this.c.set(comicCategory != null ? comicCategory.getName() : null);
    }

    public final void V0(@fo.k final ComicDirModel comicDirModel) {
        Intrinsics.checkNotNullParameter(comicDirModel, "comicDirModel");
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.comic.q.l.j3, com.zentraedi.business.utils.m6.a.e());
        ((TextView) bVar.b(com.zentraedi.comic.q.i.WS)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.GS1));
        ((TextView) bVar.b(com.zentraedi.comic.q.i.KP)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.BL));
        TextView textView = (TextView) bVar.b(com.zentraedi.comic.q.i.tP);
        textView.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.W0(bVar, view);
            }
        });
        TextView textView2 = (TextView) bVar.b(com.zentraedi.comic.q.i.JP);
        textView2.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Qz));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.X0(this.a, comicDirModel, bVar, view);
            }
        });
        bVar.show();
    }

    @fo.k
    public final ObservableField<String> getTitle() {
        return this.d;
    }

    public final void i0(@fo.k Context context, @fo.k View view) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        if (((Boolean) t7.d(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.g, (String) null, 1, (Object) null), Boolean.FALSE)).booleanValue()) {
            k0(context, view);
            return;
        }
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        com.zentraedi.business.utils.n4 n4VarA = com.zentraedi.business.utils.n4.c.a();
        Intrinsics.checkNotNull(activityE);
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.qH);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Mo2);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        String strN4 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx);
        Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
        String strN5 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.zx);
        Intrinsics.checkNotNullExpressionValue(strN5, "getString(...)");
        n4VarA.r3(activityE, strN, strN2, strN3, false, strN4, strN5, new a(context, view));
    }

    public final void j0(@fo.k Context context, @fo.k View view) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        if (((Boolean) t7.d(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.g, (String) null, 1, (Object) null), Boolean.FALSE)).booleanValue()) {
            T0(context, view);
            return;
        }
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        com.zentraedi.business.utils.n4 n4VarA = com.zentraedi.business.utils.n4.c.a();
        Intrinsics.checkNotNull(activityE);
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.qH);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Mo2);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        String strN4 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx);
        Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
        String strN5 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.zx);
        Intrinsics.checkNotNullExpressionValue(strN5, "getString(...)");
        n4VarA.r3(activityE, strN, strN2, strN3, false, strN4, strN5, new b(context, view));
    }

    public final void m0(@fo.k final FragmentActivity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C0().r0().k(context, new f(new Function1() { // from class: com.zentraedi.comic.viewmodel.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.n0(context, this, (fg.a) obj);
            }
        }));
    }

    protected void onCleared() {
        super.onCleared();
        kotlinx.coroutines.k2 k2Var = this.j;
        if (k2Var != null) {
            kotlinx.coroutines.k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
        }
        com.zentraedi.comic.delegate.a.a.i(this.p);
    }

    public final void p0(@fo.k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(B0());
    }

    public final void q0() {
        String name;
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        com.zentraedi.comic.business.a1 a1VarC0 = C0();
        ComicCategory comicCategory = this.k;
        String strValueOf = String.valueOf(comicCategory != null ? comicCategory.getId() : null);
        ComicCategory comicCategory2 = this.k;
        if (comicCategory2 == null || (name = comicCategory2.getName()) == null) {
            name = "";
        }
        a1VarC0.p0(strValueOf, name);
    }

    public final void refreshData() {
        com.zentraedi.comic.delegate.a.a.n(this.p, 2000L, this.m);
    }

    public final void y0() {
        if (this.k != null) {
            this.d.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.JH));
            this.e.set("");
        } else {
            this.d.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.CJ));
            this.e.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.mI));
        }
        kotlinx.coroutines.k2 k2Var = this.j;
        if (k2Var != null) {
            kotlinx.coroutines.k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
        }
        this.b.set(true);
        this.j = kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.c()), (CoroutineContext) null, (CoroutineStart) null, new d(null), 3, (Object) null);
    }

    @fo.k
    public final ObservableField<String> z0() {
        return this.e;
    }
}
