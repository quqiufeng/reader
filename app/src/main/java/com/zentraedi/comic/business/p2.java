package com.zentraedi.comic.business;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zentraedi.business.utils.l5;
import com.zentraedi.business.utils.n4;
import com.zentraedi.business.utils.t7;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class p2 {

    @fo.l
    private Function0<Unit> a;

    @fo.l
    private com.zentraedi.basic.function.ui.dialog.b b;

    public static final class a implements n4.f {
        final /* synthetic */ List<String> b;
        final /* synthetic */ Function1<Boolean, Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<String> list, Function1<? super Boolean, Unit> function1) {
            this.b = list;
            this.c = function1;
        }

        public void a(Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2)) {
                t7.j(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.c, (String) null, 1, (Object) null), bool2);
            }
            p2.this.i(this.b, this.c);
        }
    }

    @DebugMetadata(c = "com.zentraedi.comic.business.OfflineComicOptionBusiness$onDeleteFile$1", f = "OfflineComicOptionBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ List<String> c;
        final /* synthetic */ p2 d;
        final /* synthetic */ Function1<Boolean, Unit> e;

        @DebugMetadata(c = "com.zentraedi.comic.business.OfflineComicOptionBusiness$onDeleteFile$1$1", f = "OfflineComicOptionBusiness.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ p2 b;
            final /* synthetic */ Function1<Boolean, Unit> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p2 p2Var, Function1<? super Boolean, Unit> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = p2Var;
                this.c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                Function1<Boolean, Unit> function1 = this.c;
                if (function1 != null) {
                    function1.invoke(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<String> list, p2 p2Var, Function1<? super Boolean, Unit> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = list;
            this.d = p2Var;
            this.e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.c, this.d, this.e, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Iterator<String> it = this.c.iterator();
            while (it.hasNext()) {
                l5.f(new File(it.next()));
            }
            kotlinx.coroutines.i.e(q0Var, kotlinx.coroutines.g1.e(), (CoroutineStart) null, new a(this.d, this.e, null), 2, (Object) null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(p2 p2Var, List list, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        p2Var.e(list, function1);
    }

    private final int g(Activity activity, int i) {
        return com.zentraedi.basic.function.utils.k0.a(activity, (i * 56) + 76);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(List<String> list, Function1<? super Boolean, Unit> function1) {
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.zu1);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        com.zentraedi.basic.function.ui.dialog.b bVarP = p(strN);
        this.b = bVarP;
        if (bVarP != null) {
            bVarP.show();
        }
        kotlinx.coroutines.i.e(kotlinx.coroutines.a2.a, kotlinx.coroutines.g1.c(), (CoroutineStart) null, new b(list, this, function1, null), 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void j(p2 p2Var, List list, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        p2Var.i(list, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(p2 p2Var, View view, String str, String str2, Boolean bool, Function0 function0, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        p2Var.l(view, str, str2, bool, function0, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(com.zentraedi.basic.function.ui.popup.b bVar, View view) {
        bVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Function0 function0, com.zentraedi.basic.function.ui.popup.b bVar, View view) {
        if (!com.zentraedi.business.utils.m.c()) {
            if (function0 != null) {
                function0.invoke();
            }
            bVar.e();
        }
        bVar.e();
    }

    private final com.zentraedi.basic.function.ui.dialog.b p(String str) {
        com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.comic.q.l.lc);
        ((TextView) bVar.b(com.zentraedi.comic.q.i.WS)).setText(str);
        return bVar;
    }

    public final void e(@fo.k List<String> pathList, @fo.l Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(pathList, "pathList");
        if (pathList.isEmpty()) {
            return;
        }
        if (((Boolean) t7.d(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.c, (String) null, 1, (Object) null), Boolean.FALSE)).booleanValue()) {
            i(pathList, function1);
            return;
        }
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        n4 n4VarA = n4.c.a();
        Intrinsics.checkNotNull(activityE);
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.MI);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Mo2);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        String strN4 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx);
        Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
        String strN5 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.zx);
        Intrinsics.checkNotNullExpressionValue(strN5, "getString(...)");
        n4VarA.r3(activityE, strN, strN2, strN3, false, strN4, strN5, new a(pathList, function1));
    }

    @fo.l
    public final Function0<Unit> h() {
        return this.a;
    }

    public final void k(@fo.l Function0<Unit> function0) {
        this.a = function0;
    }

    public final void l(@fo.k View rootView, @fo.l String str, @fo.l String str2, @fo.l Boolean bool, @fo.l final Function0<Unit> function0, @fo.l String str3) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        final com.zentraedi.basic.function.ui.popup.b bVar = new com.zentraedi.basic.function.ui.popup.b(com.zentraedi.basic.function.utils.a.h().e(), com.zentraedi.comic.q.l.U2);
        androidx.databinding.c0 c0Var = bVar.d;
        Intrinsics.checkNotNull(c0Var, "null cannot be cast to non-null type com.zentraedi.comic.databinding.DialogComicHouseMoreOptionBinding");
        com.zentraedi.comic.databinding.r0 r0Var = (com.zentraedi.comic.databinding.r0) c0Var;
        r0Var.G.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.n2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p2.n(bVar, view);
            }
        });
        r0Var.H.setVisibility(8);
        r0Var.E.setVisibility(8);
        r0Var.R.setVisibility(8);
        r0Var.K.setVisibility(8);
        r0Var.J.setVisibility(8);
        r0Var.I.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.business.o2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p2.o(function0, bVar, view);
            }
        });
        r0Var.M.setText(str);
        r0Var.N.setVisibility(8);
        if (TextUtils.isEmpty(str2)) {
            ImageView image = r0Var.L;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            com.zentraedi.comic.util.e.b(image, str2, String.valueOf(str3), Boolean.FALSE, null, Boolean.valueOf(Intrinsics.areEqual(bool, Boolean.TRUE)), false, 64, null);
        } else {
            ImageView image2 = r0Var.L;
            Intrinsics.checkNotNullExpressionValue(image2, "image");
            com.zentraedi.comic.util.e.b(image2, str2, String.valueOf(str3), Boolean.FALSE, null, null, false, 112, null);
        }
        bVar.l(rootView);
    }
}
