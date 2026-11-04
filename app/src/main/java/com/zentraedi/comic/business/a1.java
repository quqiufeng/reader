package com.zentraedi.comic.business;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.interval.IntervalViewModel;
import com.zentraedi.business.model.ComicCategory;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.model.FileOptResultModel;
import com.zentraedi.business.operationpopup.OperationItemViewModel;
import com.zentraedi.business.request.FileDeleteRequest;
import com.zentraedi.business.request.FileSquareGroupDeleteRequest;
import com.zentraedi.business.utils.d5;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.l5;
import com.zentraedi.business.utils.m6;
import com.zentraedi.business.utils.n4;
import com.zentraedi.business.utils.r8;
import com.zentraedi.business.utils.t7;
import com.zentraedi.comic.event.ComicFilesDeleteEvent;
import com.zentraedi.comic.request.ComicCategoryCreateRequest;
import com.zentraedi.comic.request.ComicCategoryDeleteRequest;
import com.zentraedi.comic.request.ComicCategoryEditRequest;
import com.zentraedi.comic.request.ComicCategorySequenceRequest;
import com.zentraedi.comic.request.ComicDeleteInfoRequest;
import com.zentraedi.comic.request.ComicDirDeleteRequest;
import java.util.ArrayList;
import java.util.List;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class a1 {

    @fo.k
    public static final a d = new a(null);
    private static int e;

    @fo.l
    private Function0<Unit> a;

    @fo.l
    private com.zentraedi.basic.function.ui.dialog.b b;

    @fo.k
    private final androidx.lifecycle.d1<fg.a> c = new androidx.lifecycle.d1<>();

    @SourceDebugExtension({"SMAP\nComicHouseOptionBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHouseOptionBusiness.kt\ncom/zentraedi/comic/business/ComicHouseOptionBusiness$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,742:1\n1869#2,2:743\n*S KotlinDebug\n*F\n+ 1 ComicHouseOptionBusiness.kt\ncom/zentraedi/comic/business/ComicHouseOptionBusiness$Companion\n*L\n79#1:743,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a1.e;
        }

        public final void b(@fo.l List<ComicCategory> list) {
            Integer intOrNull;
            if (list != null) {
                for (ComicCategory comicCategory : list) {
                    if (com.zentraedi.basic.function.utils.s0.H(comicCategory.getSeq()) && (intOrNull = StringsKt.toIntOrNull(comicCategory.getSeq())) != null) {
                        int iIntValue = intOrNull.intValue();
                        a aVar = a1.d;
                        if (iIntValue >= aVar.a()) {
                            aVar.c(iIntValue);
                        }
                    }
                }
            }
        }

        public final void c(int i) {
            a1.e = i;
        }

        private a() {
        }
    }

    public static final class b extends r8 {
        final /* synthetic */ TextView a;

        b(TextView textView) {
            this.a = textView;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            super.onTextChanged(charSequence, i, i2, i3);
            this.a.setEnabled(!TextUtils.isEmpty(charSequence));
        }
    }

    public static final class c extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ String a;
        final /* synthetic */ a1 b;

        c(String str, a1 a1Var) {
            this.a = str;
            this.b = a1Var;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
                return;
            }
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.ul2));
            fg.a aVarA = fg.a.h.a(this.a);
            org.greenrobot.eventbus.c.f().q(aVarA);
            this.b.r0().o(aVarA);
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    public static final class d extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ Function1<Boolean, Unit> a;
        final /* synthetic */ String b;
        final /* synthetic */ a1 c;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super Boolean, Unit> function1, String str, a1 a1Var) {
            this.a = function1;
            this.b = str;
            this.c = a1Var;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            this.a.invoke(Boolean.FALSE);
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
                return;
            }
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            fg.a.C0207a c0207a = fg.a.h;
            cVarF.q(c0207a.b(this.b));
            this.c.r0().o(c0207a.b(this.b));
        }

        public void onServerError() {
            this.a.invoke(Boolean.FALSE);
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    public static final class e extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ com.zentraedi.business.listener.l a;
        final /* synthetic */ ComicDirModel b;

        e(com.zentraedi.business.listener.l lVar, ComicDirModel comicDirModel) {
            this.a = lVar;
            this.b = comicDirModel;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (resp.isSuccess()) {
                com.zentraedi.business.listener.l lVar = this.a;
                if (lVar != null) {
                    lVar.continueDo();
                }
                org.greenrobot.eventbus.c.f().q(new ComicFilesDeleteEvent(CollectionsKt.arrayListOf(this.b.getPath()), Boolean.TRUE));
            }
        }

        public void onServerError() {
        }
    }

    public static final class f extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ Function1<Boolean, Unit> a;
        final /* synthetic */ a1 b;

        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super Boolean, Unit> function1, a1 a1Var) {
            this.a = function1;
            this.b = a1Var;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            Function1<Boolean, Unit> function1 = this.a;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(resp.isSuccess()));
            }
            com.zentraedi.basic.function.ui.dialog.b bVar = this.b.b;
            if (bVar != null) {
                bVar.dismiss();
            }
            if (resp.isSuccess()) {
                return;
            }
            com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
        }

        public void onServerError() {
            Function1<Boolean, Unit> function1 = this.a;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            com.zentraedi.basic.function.ui.dialog.b bVar = this.b.b;
            if (bVar != null) {
                bVar.dismiss();
            }
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    public static final class g implements n4.f {
        final /* synthetic */ ComicDirModel b;
        final /* synthetic */ List<String> c;
        final /* synthetic */ Function1<Boolean, Unit> d;

        /* JADX WARN: Multi-variable type inference failed */
        g(ComicDirModel comicDirModel, List<String> list, Function1<? super Boolean, Unit> function1) {
            this.b = comicDirModel;
            this.c = list;
            this.d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Boolean bool, a1 a1Var, List list, Function1 function1) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                a1Var.u0(list, function1);
            }
        }

        public void a(final Boolean bool) {
            final a1 a1Var = a1.this;
            ComicDirModel comicDirModel = this.b;
            final List<String> list = this.c;
            final Function1<Boolean, Unit> function1 = this.d;
            a1Var.W(comicDirModel, new com.zentraedi.business.listener.l() { // from class: com.zentraedi.comic.business.b1
                public final void continueDo() {
                    a1.g.c(bool, a1Var, list, function1);
                }
            });
        }
    }

    public static final class h extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ Function2<Boolean, Boolean, Unit> a;
        final /* synthetic */ String b;
        final /* synthetic */ a1 c;

        /* JADX WARN: Multi-variable type inference failed */
        h(Function2<? super Boolean, ? super Boolean, Unit> function2, String str, a1 a1Var) {
            this.a = function2;
            this.b = str;
            this.c = a1Var;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            Function2<Boolean, Boolean, Unit> function2 = this.a;
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, Boolean.valueOf(resp.isSuccess()));
            }
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
                return;
            }
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            fg.a.C0207a c0207a = fg.a.h;
            cVarF.q(c0207a.b(this.b));
            this.c.r0().o(c0207a.b(this.b));
        }

        public void onServerError() {
            Function2<Boolean, Boolean, Unit> function2 = this.a;
            if (function2 != null) {
                Boolean bool = Boolean.FALSE;
                function2.invoke(bool, bool);
            }
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    public static final class i extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ a1 c;

        i(String str, String str2, a1 a1Var) {
            this.a = str;
            this.b = str2;
            this.c = a1Var;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
                return;
            }
            org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
            fg.a.C0207a c0207a = fg.a.h;
            cVarF.q(c0207a.c(String.valueOf(this.a), this.b));
            this.c.r0().o(c0207a.c(String.valueOf(this.a), this.b));
        }

        public void onServerError() {
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.business.ComicHouseOptionBusiness$onDeleteFile$1", f = "ComicHouseOptionBusiness.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {584, 585}, m = "invokeSuspend", n = {"$this$launch", "list", "squareList", "fileResponse", "squareResponse", CommonNetImpl.RESULT, "$this$launch", "list", "squareList", "fileResponse", "squareResponse", CommonNetImpl.RESULT, "it", "$i$a$-let-ComicHouseOptionBusiness$onDeleteFile$1$2"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"}, v = 1)
    @SourceDebugExtension({"SMAP\nComicHouseOptionBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHouseOptionBusiness.kt\ncom/zentraedi/comic/business/ComicHouseOptionBusiness$onDeleteFile$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 FilePathConstant.kt\ncom/zentraedi/business/FilePathConstantKt\n*L\n1#1,742:1\n1869#2:743\n1870#2:745\n1205#3:744\n*S KotlinDebug\n*F\n+ 1 ComicHouseOptionBusiness.kt\ncom/zentraedi/comic/business/ComicHouseOptionBusiness$onDeleteFile$1\n*L\n541#1:743\n541#1:745\n542#1:744\n*E\n"})
    static final class j extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        int g;
        int h;
        private /* synthetic */ Object i;
        final /* synthetic */ List<String> j;
        final /* synthetic */ a1 k;
        final /* synthetic */ Function1<Boolean, Unit> l;

        @DebugMetadata(c = "com.zentraedi.comic.business.ComicHouseOptionBusiness$onDeleteFile$1$2$1", f = "ComicHouseOptionBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ a1 b;
            final /* synthetic */ Pair<Boolean, String> c;
            final /* synthetic */ Function1<Boolean, Unit> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(a1 a1Var, Pair<Boolean, String> pair, Function1<? super Boolean, Unit> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = a1Var;
                this.c = pair;
                this.d = function1;
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
                com.zentraedi.basic.function.ui.dialog.b bVar = this.b.b;
                if (bVar != null) {
                    bVar.dismiss();
                }
                if (this.c.getFirst().booleanValue()) {
                    com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.io2), true);
                } else {
                    com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.sJ) + ": " + this.c.getSecond(), false);
                }
                Function1<Boolean, Unit> function1 = this.d;
                if (function1 != null) {
                    function1.invoke(this.c.getFirst());
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.business.ComicHouseOptionBusiness$onDeleteFile$1$fileResponse$1", f = "ComicHouseOptionBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        @SourceDebugExtension({"SMAP\nComicHouseOptionBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHouseOptionBusiness.kt\ncom/zentraedi/comic/business/ComicHouseOptionBusiness$onDeleteFile$1$fileResponse$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,742:1\n1#2:743\n*E\n"})
        static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super ResponseData<FileOptResultModel>>, Object> {
            int a;
            final /* synthetic */ ArrayList<String> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ArrayList<String> arrayList, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.b.isEmpty()) {
                    ResponseData responseData = new ResponseData();
                    responseData.setCode("200");
                    return responseData;
                }
                FileDeleteRequest fileDeleteRequest = new FileDeleteRequest();
                fileDeleteRequest.setPaths(this.b);
                ResponseData responseDataK = com.zentraedi.business.http.a.b().k(fileDeleteRequest, FileOptResultModel.class);
                if (responseDataK == null) {
                    return null;
                }
                return responseDataK;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super ResponseData<FileOptResultModel>> continuation) {
                return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.business.ComicHouseOptionBusiness$onDeleteFile$1$result$1", f = "ComicHouseOptionBusiness.kt", i = {1}, l = {567, 568}, m = "invokeSuspend", n = {"fileResult"}, s = {"L$0"}, v = 1)
        static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Pair<? extends Boolean, ? extends String>>, Object> {
            Object a;
            int b;
            final /* synthetic */ kotlinx.coroutines.w0<ResponseData<FileOptResultModel>> c;
            final /* synthetic */ kotlinx.coroutines.w0<ResponseData<FileOptResultModel>> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(kotlinx.coroutines.w0<? extends ResponseData<FileOptResultModel>> w0Var, kotlinx.coroutines.w0<? extends ResponseData<FileOptResultModel>> w0Var2, Continuation<? super c> continuation) {
                super(2, continuation);
                this.c = w0Var;
                this.d = w0Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Pair<? extends Boolean, ? extends String>> continuation) {
                return invoke2(q0Var, (Continuation<? super Pair<Boolean, String>>) continuation);
            }

            /* JADX WARN: Code duplicated, block: B:39:0x008f  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ResponseData responseData;
                ResponseData responseData2;
                StringBuilder sb;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.w0<ResponseData<FileOptResultModel>> w0Var = this.c;
                    this.b = 1;
                    obj = w0Var.x(this);
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
                    responseData = (ResponseData) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                responseData2 = (ResponseData) obj;
                if (responseData != null && responseData2 == null) {
                    return new Pair(Boxing.boxBoolean(false), "");
                }
                sb = new StringBuilder();
                if (responseData != null && !responseData.isSuccess()) {
                    sb.append(responseData.getMsg());
                    sb.append(" ");
                }
                if (responseData2 != null && !responseData2.isSuccess()) {
                    sb.append(responseData2.getMsg());
                }
                return new Pair(Boxing.boxBoolean(responseData == null && responseData.isSuccess() && responseData2 != null && responseData2.isSuccess()), sb.toString());
                ResponseData responseData3 = (ResponseData) obj;
                kotlinx.coroutines.w0<ResponseData<FileOptResultModel>> w0Var2 = this.d;
                this.a = responseData3;
                this.b = 2;
                Object objX = w0Var2.x(this);
                if (objX != coroutine_suspended) {
                    responseData = responseData3;
                    obj = objX;
                    responseData2 = (ResponseData) obj;
                    if (responseData != null) {
                    }
                    sb = new StringBuilder();
                    if (responseData != null) {
                        sb.append(responseData.getMsg());
                        sb.append(" ");
                    }
                    if (responseData2 != null) {
                        sb.append(responseData2.getMsg());
                    }
                    return new Pair(Boxing.boxBoolean(responseData == null && responseData.isSuccess() && responseData2 != null && responseData2.isSuccess()), sb.toString());
                }
                return coroutine_suspended;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(kotlinx.coroutines.q0 q0Var, Continuation<? super Pair<Boolean, String>> continuation) {
                return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.comic.business.ComicHouseOptionBusiness$onDeleteFile$1$squareResponse$1", f = "ComicHouseOptionBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        @SourceDebugExtension({"SMAP\nComicHouseOptionBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicHouseOptionBusiness.kt\ncom/zentraedi/comic/business/ComicHouseOptionBusiness$onDeleteFile$1$squareResponse$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,742:1\n1#2:743\n*E\n"})
        static final class d extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super ResponseData<FileOptResultModel>>, Object> {
            int a;
            final /* synthetic */ ArrayList<String> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(ArrayList<String> arrayList, Continuation<? super d> continuation) {
                super(2, continuation);
                this.b = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.b.isEmpty()) {
                    ResponseData responseData = new ResponseData();
                    responseData.setCode("200");
                    return responseData;
                }
                FileSquareGroupDeleteRequest fileSquareGroupDeleteRequest = new FileSquareGroupDeleteRequest();
                fileSquareGroupDeleteRequest.setPaths(this.b);
                ResponseData responseDataK = com.zentraedi.business.http.a.b().k(fileSquareGroupDeleteRequest, FileOptResultModel.class);
                if (responseDataK == null) {
                    return null;
                }
                return responseDataK;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super ResponseData<FileOptResultModel>> continuation) {
                return ((d) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(List<String> list, a1 a1Var, Function1<? super Boolean, Unit> function1, Continuation<? super j> continuation) {
            super(2, continuation);
            this.j = list;
            this.k = a1Var;
            this.l = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = new j(this.j, this.k, this.l, continuation);
            jVar.i = obj;
            return jVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0127, code lost:
        
            if (kotlinx.coroutines.i.h(r11, r12, r13) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.comic.business.a1.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((j) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class k extends com.zentraedi.business.http.b<Object> {
        final /* synthetic */ Function1<Boolean, Unit> a;
        final /* synthetic */ a1 b;
        final /* synthetic */ String c;

        /* JADX WARN: Multi-variable type inference failed */
        k(Function1<? super Boolean, Unit> function1, a1 a1Var, String str) {
            this.a = function1;
            this.b = a1Var;
            this.c = str;
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            Function1<Boolean, Unit> function1 = this.a;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(resp.isSuccess()));
            }
            com.zentraedi.basic.function.ui.dialog.b bVar = this.b.b;
            if (bVar != null) {
                bVar.dismiss();
            }
            if (resp.isSuccess()) {
                org.greenrobot.eventbus.c.f().q(fg.a.h.d(this.c));
            } else {
                com.zentraedi.basic.function.ui.toast.a.A(resp.getMsg());
            }
        }

        public void onServerError() {
            Function1<Boolean, Unit> function1 = this.a;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            com.zentraedi.basic.function.ui.dialog.b bVar = this.b.b;
            if (bVar != null) {
                bVar.dismiss();
            }
            com.zentraedi.basic.function.ui.toast.a.x(com.zentraedi.comic.q.C0124q.kF4);
        }
    }

    public static final class l implements n4.f {
        final /* synthetic */ Function0<Unit> a;
        final /* synthetic */ Ref.ObjectRef<com.zentraedi.business.operationpopup.b> b;

        l(Function0<Unit> function0, Ref.ObjectRef<com.zentraedi.business.operationpopup.b> objectRef) {
            this.a = function0;
            this.b = objectRef;
        }

        public void a(Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2)) {
                t7.j(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.g, (String) null, 1, (Object) null), bool2);
            }
            this.a.invoke();
            com.zentraedi.business.operationpopup.b bVar = this.b.element;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(a1 a1Var, ComicDirModel comicDirModel, com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        X(a1Var, comicDirModel, null, 2, null);
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(a1 a1Var, Ref.ObjectRef objectRef, View view) {
        a1Var.R();
        com.zentraedi.business.operationpopup.b bVar = (com.zentraedi.business.operationpopup.b) objectRef.element;
        if (bVar != null) {
            bVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(Function0 function0, Ref.ObjectRef objectRef, View view) {
        if (((Boolean) t7.d(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.g, (String) null, 1, (Object) null), Boolean.FALSE)).booleanValue()) {
            function0.invoke();
            com.zentraedi.business.operationpopup.b bVar = (com.zentraedi.business.operationpopup.b) objectRef.element;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        n4 n4VarA = n4.c.a();
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
        n4VarA.r3(activityE, strN, strN2, strN3, false, strN4, strN5, new l(function0, objectRef));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(Function0 function0, Ref.ObjectRef objectRef, View view) {
        function0.invoke();
        com.zentraedi.business.operationpopup.b bVar = (com.zentraedi.business.operationpopup.b) objectRef.element;
        if (bVar != null) {
            bVar.b();
        }
    }

    private final void I(final String str, final String str2) {
        final Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(activityE, com.zentraedi.comic.q.l.y3, m6.a.e());
        TextView textView = (TextView) bVar.b(com.zentraedi.comic.q.i.E7);
        final EditText editText = (EditText) bVar.b(com.zentraedi.comic.q.i.ae);
        editText.addTextChangedListener(new b(textView));
        ((TextView) bVar.b(com.zentraedi.comic.q.i.d5)).setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.K(bVar, view);
            }
        });
        ((ImageView) bVar.b(com.zentraedi.comic.q.i.J6)).setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.L(editText, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.M(editText, str2, this, str, bVar, view);
            }
        });
        bVar.setCanceledOnTouchOutside(true);
        if (str2 != null) {
            ((TextView) bVar.b(com.zentraedi.comic.q.i.ce)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.eI) + ": ");
            ((TextView) bVar.b(com.zentraedi.comic.q.i.tK)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.B81));
            editText.setText(str2);
            editText.setSelection(str2.length());
        }
        bVar.show();
        editText.postDelayed(new Runnable() { // from class: com.zentraedi.comic.business.g0
            @Override // java.lang.Runnable
            public final void run() {
                a1.N(activityE, editText);
            }
        }, 100L);
    }

    static /* synthetic */ void J(a1 a1Var, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        a1Var.I(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(com.zentraedi.basic.function.ui.popup.b bVar, View view) {
        bVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(EditText editText, View view) {
        editText.setText((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(Function0 function0, com.zentraedi.basic.function.ui.popup.b bVar, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
        bVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(EditText editText, String str, a1 a1Var, String str2, com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        String string = StringsKt.trim(editText.getText().toString()).toString();
        if (TextUtils.isEmpty(str)) {
            a1Var.Q(string);
        } else if (!TextUtils.equals(string, str)) {
            a1Var.o0(str2, string);
        }
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(Function0 function0, com.zentraedi.basic.function.ui.popup.b bVar, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
        bVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(Activity activity, EditText editText) {
        com.zentraedi.basic.function.utils.p0.f(activity, editText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(a1 a1Var, String str, com.zentraedi.basic.function.ui.popup.b bVar, View view) {
        x0(a1Var, str, null, 2, null);
        bVar.e();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    private final void O(com.zentraedi.comic.databinding.r0 r0Var, Boolean bool, String str, boolean z, Boolean bool2) {
        Boolean bool3 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool, bool3) && Intrinsics.areEqual(bool2, Boolean.FALSE)) {
            r0Var.H.setVisibility(0);
            r0Var.J.setVisibility(8);
            r0Var.E.setVisibility(8);
            r0Var.K.setVisibility(8);
            r0Var.P.setVisibility(8);
        } else if (Intrinsics.areEqual(bool, bool3)) {
            r0Var.E.setVisibility(0);
            r0Var.K.setVisibility(0);
            r0Var.P.setVisibility(8);
            r0Var.J.setVisibility(0);
        } else {
            i5 i5Var = i5.a;
            if (i5Var.n(str)) {
                r0Var.E.setVisibility(0);
                r0Var.K.setVisibility(0);
                r0Var.P.setVisibility(8);
                r0Var.J.setVisibility(0);
            } else {
                r0Var.E.setVisibility(8);
                r0Var.K.setVisibility(8);
                r0Var.J.setVisibility(8);
                if (!z && i5Var.f(str) == 3) {
                    r0Var.P.setVisibility(0);
                }
            }
        }
        if (Intrinsics.areEqual(bool, bool3) && Intrinsics.areEqual(bool2, bool3)) {
            r0Var.F.setVisibility(0);
        } else {
            r0Var.F.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(Function0 function0, com.zentraedi.basic.function.ui.popup.b bVar, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
        bVar.e();
    }

    static /* synthetic */ void P(a1 a1Var, com.zentraedi.comic.databinding.r0 r0Var, Boolean bool, String str, boolean z, Boolean bool2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bool = Boolean.FALSE;
        }
        Boolean bool3 = bool;
        if ((i2 & 8) != 0) {
            z = false;
        }
        a1Var.O(r0Var, bool3, str, z, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(Function0 function0, com.zentraedi.basic.function.ui.popup.b bVar, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
        bVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(Function0 function0, com.zentraedi.basic.function.ui.popup.b bVar, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
        bVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R0(Function0 function0, com.zentraedi.basic.function.ui.popup.b bVar, View view) {
        if (!com.zentraedi.business.utils.m.c()) {
            if (function0 != null) {
                function0.invoke();
            }
            bVar.e();
        }
        bVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(String str, com.zentraedi.basic.function.ui.popup.b bVar, Activity activity, View view) {
        if (str != null) {
            String strZ = l5.z(str);
            d5.a aVar = d5.a;
            Intrinsics.checkNotNull(strZ);
            com.zentraedi.business.l0.g().C(activity, strZ, l5.r(aVar.r(strZ)));
        }
        bVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(Function0 function0, com.zentraedi.basic.function.ui.popup.b bVar, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
        bVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(Function0 function0, com.zentraedi.basic.function.ui.popup.b bVar, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
        bVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(Function1 function1, a1 a1Var, String str, com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        function1.invoke(Boolean.TRUE);
        a1Var.S(str, function1);
        bVar.dismiss();
    }

    private final com.zentraedi.basic.function.ui.dialog.b V0(String str) {
        com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.comic.q.l.lc);
        ((TextView) bVar.b(com.zentraedi.comic.q.i.WS)).setText(str);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(ComicDirModel comicDirModel, com.zentraedi.business.listener.l lVar) {
        com.zentraedi.business.http.a.b().h(new ComicDirDeleteRequest(comicDirModel.getId()), new e(lVar, comicDirModel));
    }

    static /* synthetic */ void X(a1 a1Var, ComicDirModel comicDirModel, com.zentraedi.business.listener.l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        a1Var.W(comicDirModel, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void Z(a1 a1Var, String str, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        a1Var.Y(str, z, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c0(a1 a1Var, List list, ComicDirModel comicDirModel, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        a1Var.a0(list, comicDirModel, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d0(a1 a1Var, List list, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        a1Var.b0(list, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(a1 a1Var, List list, Function1 function1, com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        a1Var.u0(list, function1);
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(a1 a1Var, List list, Function1 function1, com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        a1Var.u0(list, function1);
        bVar.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j0(a1 a1Var, String str, String str2, Function2 function2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function2 = null;
        }
        a1Var.i0(str, str2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l0(a1 a1Var, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        a1Var.k0(str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(a1 a1Var, String str, Function1 function1, com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        a1Var.Y(str, true, function1);
        bVar.dismiss();
    }

    private final int q0(Activity activity, int i2) {
        return com.zentraedi.basic.function.utils.k0.a(activity, (i2 * 56) + 76);
    }

    private final String t0(String str) {
        int iIndexOf$default = StringsKt.indexOf$default(str, "/public/", 0, false, 6, (Object) null);
        if (iIndexOf$default < 0) {
            return str;
        }
        String strSubstring = str.substring(iIndexOf$default + 8);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(List<String> list, Function1<? super Boolean, Unit> function1) {
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.zu1);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        com.zentraedi.basic.function.ui.dialog.b bVarV0 = V0(strN);
        this.b = bVarV0;
        if (bVarV0 != null) {
            bVarV0.show();
        }
        kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.c()), (CoroutineContext) null, (CoroutineStart) null, new j(list, this, function1, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void v0(a1 a1Var, List list, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        a1Var.u0(list, function1);
    }

    public static /* synthetic */ void x0(a1 a1Var, String str, Activity activity, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            activity = com.zentraedi.basic.function.utils.a.h().e();
        }
        a1Var.w0(str, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(a1 a1Var, boolean z) {
        if (!z) {
            com.zentraedi.basic.function.ui.dialog.b bVar = a1Var.b;
            if (bVar != null) {
                bVar.dismiss();
                return;
            }
            return;
        }
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.oJ);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        com.zentraedi.basic.function.ui.dialog.b bVarV0 = a1Var.V0(strN);
        a1Var.b = bVarV0;
        if (bVarV0 != null) {
            bVarV0.show();
        }
    }

    public final void A0(@fo.l Function0<Unit> function0) {
        this.a = function0;
    }

    public final void B0(@fo.k final ComicDirModel comicDirModel) {
        Intrinsics.checkNotNullParameter(comicDirModel, "comicDirModel");
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.comic.q.l.j3, m6.a.e());
        ((TextView) bVar.b(com.zentraedi.comic.q.i.WS)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.GS1));
        ((TextView) bVar.b(com.zentraedi.comic.q.i.KP)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.BL));
        TextView textView = (TextView) bVar.b(com.zentraedi.comic.q.i.tP);
        textView.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.C0(bVar, view);
            }
        });
        TextView textView2 = (TextView) bVar.b(com.zentraedi.comic.q.i.JP);
        textView2.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Qz));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.D0(this.a, comicDirModel, bVar, view);
            }
        });
        bVar.show();
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [T, com.zentraedi.basic.function.ui.popup.a, com.zentraedi.business.operationpopup.b] */
    public final void E0(@fo.k View rootView, boolean z, @fo.k final Function0<Unit> clickAddContent, @fo.k final Function0<Unit> clickCategoryManage) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(clickAddContent, "clickAddContent");
        Intrinsics.checkNotNullParameter(clickCategoryManage, "clickCategoryManage");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new IntervalViewModel().setViewType(OperationItemViewModel.LIGHT_SEPARATE_LINE);
        OperationItemViewModel operationItemViewModel = new OperationItemViewModel();
        operationItemViewModel.setViewType(OperationItemViewModel.COMMON_ITEM);
        operationItemViewModel.title.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.zI));
        operationItemViewModel.icon.set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.Pn));
        operationItemViewModel.itemOnClickListener = new View.OnClickListener() { // from class: com.zentraedi.comic.business.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.F0(this.a, objectRef, view);
            }
        };
        Unit unit = Unit.INSTANCE;
        OperationItemViewModel operationItemViewModel2 = new OperationItemViewModel();
        operationItemViewModel2.setViewType(OperationItemViewModel.COMMON_ITEM);
        operationItemViewModel2.title.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.hH));
        operationItemViewModel2.icon.set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.lg));
        operationItemViewModel2.itemOnClickListener = new View.OnClickListener() { // from class: com.zentraedi.comic.business.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.G0(clickAddContent, objectRef, view);
            }
        };
        OperationItemViewModel operationItemViewModel3 = new OperationItemViewModel();
        operationItemViewModel3.setViewType(OperationItemViewModel.COMMON_ITEM);
        operationItemViewModel3.title.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.O91));
        operationItemViewModel3.icon.set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.KB));
        operationItemViewModel3.itemOnClickListener = new View.OnClickListener() { // from class: com.zentraedi.comic.business.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.H0(clickCategoryManage, objectRef, view);
            }
        };
        List listListOf = CollectionsKt.listOf((Object[]) new OperationItemViewModel[]{operationItemViewModel, operationItemViewModel2, operationItemViewModel3});
        com.zentraedi.business.operationpopup.c cVar = new com.zentraedi.business.operationpopup.c();
        cVar.U1(listListOf);
        com.zentraedi.business.operationpopup.d dVar = new com.zentraedi.business.operationpopup.d();
        dVar.N(cVar);
        dVar.navTitle.set(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Cw));
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNull(activityE);
        dVar.O(q0(activityE, listListOf.size()));
        ?? bVar = new com.zentraedi.business.operationpopup.b(activityE, dVar);
        objectRef.element = bVar;
        bVar.e(rootView);
    }

    public final void I0(@fo.k View rootView, @fo.l String str, @fo.l String str2, @fo.l Boolean bool, @fo.l String str3, boolean z, boolean z2, @fo.l Boolean bool2, @fo.l Boolean bool3, @fo.l final Function0<Unit> function0, @fo.l Function0<Unit> function1, @fo.l final Function0<Unit> function2, @fo.l final Function0<Unit> function3, @fo.l final Function0<Unit> function4, @fo.l final Function0<Unit> function5, @fo.l final Function0<Unit> function6, @fo.l final Function0<Unit> function7, @fo.l final Function0<Unit> function8, @fo.l final String str4, @fo.l Boolean bool4, @fo.l Boolean bool5) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        final Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        final com.zentraedi.basic.function.ui.popup.b bVar = new com.zentraedi.basic.function.ui.popup.b(activityE, com.zentraedi.comic.q.l.U2);
        androidx.databinding.c0 c0Var = bVar.d;
        Intrinsics.checkNotNull(c0Var, "null cannot be cast to non-null type com.zentraedi.comic.databinding.DialogComicHouseMoreOptionBinding");
        com.zentraedi.comic.databinding.r0 r0Var = (com.zentraedi.comic.databinding.r0) c0Var;
        O(r0Var, bool, str4, z2, bool4);
        r0Var.G.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.K0(bVar, view);
            }
        });
        Boolean bool6 = Boolean.TRUE;
        if (Intrinsics.areEqual(bool2, bool6)) {
            r0Var.E.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.RB));
            r0Var.E.setCompoundDrawablesWithIntrinsicBounds(com.zentraedi.comic.q.h.Em, 0, 0, 0);
        } else {
            r0Var.E.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bV0));
            r0Var.E.setCompoundDrawablesWithIntrinsicBounds(com.zentraedi.comic.q.h.rn, 0, 0, 0);
        }
        r0Var.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.L0(function0, bVar, view);
            }
        });
        r0Var.R.setVisibility(i5.a.f(str4) == 10 ? 0 : 8);
        r0Var.R.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.N0(this.a, str4, bVar, view);
            }
        });
        r0Var.K.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.O0(function2, bVar, view);
            }
        });
        r0Var.P.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.P0(function5, bVar, view);
            }
        });
        r0Var.J.setEnabled(Intrinsics.areEqual(bool3, bool6));
        r0Var.J.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.Q0(function3, bVar, view);
            }
        });
        r0Var.I.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.R0(function4, bVar, view);
            }
        });
        r0Var.N.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.S0(str4, bVar, activityE, view);
            }
        });
        r0Var.H.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.T0(function6, bVar, view);
            }
        });
        if (Intrinsics.areEqual(bool5, bool6)) {
            r0Var.O.setVisibility(0);
        } else {
            r0Var.O.setVisibility(8);
        }
        r0Var.O.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.U0(function7, bVar, view);
            }
        });
        r0Var.F.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.M0(function8, bVar, view);
            }
        });
        TextView textView = r0Var.M;
        if (!TextUtils.isEmpty(str4) && !Intrinsics.areEqual(bool, bool6)) {
            str = l5.r(d5.a.r(str4 == null ? "" : str4));
        }
        textView.setText(str);
        if (TextUtils.isEmpty(str3) || Intrinsics.areEqual(bool, bool6)) {
            TextView textView2 = r0Var.Q;
            d5.a aVar = d5.a;
            textView2.setText(StringsKt.removePrefix(aVar.r(aVar.m(str4)), "/"));
        } else {
            r0Var.Q.setText(l5.R(str3 != null ? Long.parseLong(str3) : 0L));
        }
        if (TextUtils.isEmpty(str2)) {
            ImageView image = r0Var.L;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            com.zentraedi.comic.util.e.a(image, str2, String.valueOf(str4), Boolean.FALSE, null, Boolean.valueOf(Intrinsics.areEqual(bool, bool6)), !z);
        } else {
            ImageView image2 = r0Var.L;
            Intrinsics.checkNotNullExpressionValue(image2, "image");
            com.zentraedi.comic.util.e.b(image2, str2, String.valueOf(str4), Boolean.FALSE, null, null, !z, 48, null);
        }
        bVar.l(rootView);
    }

    public final void Q(@fo.k String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        com.zentraedi.business.http.a.b().h(new ComicCategoryCreateRequest(name, Integer.valueOf(e + 1)), new c(name, this));
    }

    public final void R() {
        J(this, null, null, 3, null);
    }

    public final void S(@fo.k String id2, @fo.k Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(callback, "callback");
        com.zentraedi.business.http.a.b().h(new ComicCategoryDeleteRequest(id2), new d(callback, id2, this));
    }

    @SuppressLint({"SetTextI18n"})
    public final void T(@fo.k final String id2, @fo.k String name, @fo.k final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.comic.q.l.j3, m6.a.e());
        ((TextView) bVar.b(com.zentraedi.comic.q.i.WS)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.kL));
        ((TextView) bVar.b(com.zentraedi.comic.q.i.KP)).setText(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.mL, name));
        ((TextView) bVar.b(com.zentraedi.comic.q.i.tP)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx));
        ((TextView) bVar.b(com.zentraedi.comic.q.i.JP)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Qz));
        ((TextView) bVar.b(com.zentraedi.comic.q.i.tP)).setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.U(bVar, view);
            }
        });
        ((TextView) bVar.b(com.zentraedi.comic.q.i.JP)).setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.V(callback, this, id2, bVar, view);
            }
        });
        bVar.show();
    }

    public final void Y(@fo.l String str, boolean z, @fo.l Function1<? super Boolean, Unit> function1) {
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.aL);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        com.zentraedi.basic.function.ui.dialog.b bVarV0 = V0(strN);
        this.b = bVarV0;
        if (bVarV0 != null) {
            bVarV0.show();
        }
        com.zentraedi.business.http.a.b().h(new ComicDeleteInfoRequest(str, Integer.valueOf(z ? 1 : 0)), new f(function1, this));
    }

    public final void a0(@fo.k final List<String> pathList, @fo.l ComicDirModel comicDirModel, @fo.l final Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(pathList, "pathList");
        if (pathList.isEmpty()) {
            return;
        }
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        if (comicDirModel == null || !Intrinsics.areEqual(comicDirModel.isDir(), "1")) {
            final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(activityE, com.zentraedi.comic.q.l.j3, m6.a.e());
            ((TextView) bVar.b(com.zentraedi.comic.q.i.WS)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2));
            ((TextView) bVar.b(com.zentraedi.comic.q.i.KP)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.RL));
            TextView textView = (TextView) bVar.b(com.zentraedi.comic.q.i.tP);
            textView.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.s0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a1.g0(bVar, view);
                }
            });
            TextView textView2 = (TextView) bVar.b(com.zentraedi.comic.q.i.JP);
            textView2.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Qz));
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.t0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a1.h0(this.a, pathList, function1, bVar, view);
                }
            });
            bVar.show();
            return;
        }
        n4 n4VarA = n4.c.a();
        Intrinsics.checkNotNull(activityE);
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.QH);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.SH);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        String strN4 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx);
        Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
        String strN5 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.zx);
        Intrinsics.checkNotNullExpressionValue(strN5, "getString(...)");
        n4VarA.r3(activityE, strN, strN2, strN3, false, strN4, strN5, new g(comicDirModel, pathList, function1));
    }

    public final void b0(@fo.k final List<String> pathList, @fo.l final Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(pathList, "pathList");
        if (pathList.isEmpty()) {
            return;
        }
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.comic.q.l.j3, m6.a.e());
        ((TextView) bVar.b(com.zentraedi.comic.q.i.WS)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2));
        ((TextView) bVar.b(com.zentraedi.comic.q.i.KP)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.RL));
        TextView textView = (TextView) bVar.b(com.zentraedi.comic.q.i.tP);
        textView.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.e0(bVar, view);
            }
        });
        TextView textView2 = (TextView) bVar.b(com.zentraedi.comic.q.i.JP);
        textView2.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Qz));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.f0(this.a, pathList, function1, bVar, view);
            }
        });
        bVar.show();
    }

    public final void i0(@fo.k String id2, @fo.k String dirList, @fo.l Function2<? super Boolean, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(dirList, "dirList");
        com.zentraedi.business.http.a.b().h(new ComicDirDeleteRequest(dirList), new h(function2, id2, this));
    }

    public final void k0(@fo.k final String comicIds, @fo.l final Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(comicIds, "comicIds");
        if (TextUtils.isEmpty(comicIds)) {
            return;
        }
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.comic.q.l.j3, m6.a.e());
        ((TextView) bVar.b(com.zentraedi.comic.q.i.WS)).setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.LI));
        ((TextView) bVar.b(com.zentraedi.comic.q.i.KP)).setText(com.zentraedi.basic.function.utils.a.n(StringsKt.contains$default(comicIds, ",", false, 2, (Object) null) ? com.zentraedi.comic.q.C0124q.FI : com.zentraedi.comic.q.C0124q.ZI));
        TextView textView = (TextView) bVar.b(com.zentraedi.comic.q.i.tP);
        textView.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.m0(bVar, view);
            }
        });
        TextView textView2 = (TextView) bVar.b(com.zentraedi.comic.q.i.JP);
        textView2.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Qz));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.n0(this.a, comicIds, function1, bVar, view);
            }
        });
        bVar.show();
    }

    public final void o0(@fo.l String str, @fo.k String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        com.zentraedi.business.http.a.b().h(new ComicCategoryEditRequest(str, name), new i(str, name, this));
    }

    public final void p0(@fo.k String id2, @fo.k String oldName) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(oldName, "oldName");
        I(id2, oldName);
    }

    @fo.k
    public final androidx.lifecycle.d1<fg.a> r0() {
        return this.c;
    }

    @fo.l
    public final Function0<Unit> s0() {
        return this.a;
    }

    public final void w0(@fo.l String str, @fo.l Activity activity) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        FileInfoModel fileInfoModel = new FileInfoModel();
        fileInfoModel.setName(l5.r(str));
        fileInfoModel.setPath(str);
        com.zentraedi.business.l0.g().e.E(activity, new com.zentraedi.business.listener.n() { // from class: com.zentraedi.comic.business.r0
            public final void showLoading(boolean z) {
                a1.y0(this.a, z);
            }
        }, fileInfoModel);
    }

    public final void z0(@fo.k String seq, @fo.l Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(seq, "seq");
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.vL);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        com.zentraedi.basic.function.ui.dialog.b bVarV0 = V0(strN);
        this.b = bVarV0;
        if (bVarV0 != null) {
            bVarV0.show();
        }
        com.zentraedi.business.http.a.b().h(new ComicCategorySequenceRequest(seq), new k(function1, this, seq));
    }
}
