package com.zentraedi.outreader.v2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.zentraedi.outreader.model.ChapterM;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nReaderMenuProgressFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReaderMenuProgressFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuProgressFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,248:1\n360#2,7:249\n295#2,2:256\n*S KotlinDebug\n*F\n+ 1 ReaderMenuProgressFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuProgressFragment\n*L\n160#1:249,7\n132#1:256,2\n*E\n"})
public final class i0 extends com.zentraedi.business.fragment.a {

    @fo.k
    public static final a u = new a(null);
    private com.zentraedi.outreader.databinding.x0 o;

    @fo.l
    private List<? extends ChapterM.Chapter> p;
    private boolean q;
    private int r;
    private boolean t;

    @fo.k
    private final Lazy n = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.c0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return i0.T2(this.a);
        }
    });

    @fo.k
    private String s = "";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.k
        public final i0 a() {
            return new i0();
        }

        private a() {
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.ReaderMenuProgressFragment$onViewCreated$1$1", f = "ReaderMenuProgressFragment.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i0.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (i0.this.t) {
                    i0.this.S2().Y().u();
                } else {
                    com.zentraedi.outreader.reader.h hVarY = i0.this.S2().Y();
                    this.a = 1;
                    if (hVarY.x(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
            return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.ReaderMenuProgressFragment$onViewCreated$2$1", f = "ReaderMenuProgressFragment.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i0.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (i0.this.t) {
                    i0.this.S2().Y().v();
                } else {
                    com.zentraedi.outreader.reader.h hVarY = i0.this.S2().Y();
                    this.a = 1;
                    if (hVarY.w(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
            return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.ReaderMenuProgressFragment$onViewCreated$3$1", f = "ReaderMenuProgressFragment.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class d extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i0.this.new d(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                i0 i0Var = i0.this;
                String str = this.c;
                this.a = 1;
                if (i0Var.Z2(str, this) == coroutine_suspended) {
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

    public static final class e implements SeekBar.OnSeekBarChangeListener {

        @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.ReaderMenuProgressFragment$onViewCreated$5$onProgressChanged$1", f = "ReaderMenuProgressFragment.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        @SourceDebugExtension({"SMAP\nReaderMenuProgressFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReaderMenuProgressFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuProgressFragment$onViewCreated$5$onProgressChanged$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,248:1\n360#2,7:249\n*S KotlinDebug\n*F\n+ 1 ReaderMenuProgressFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuProgressFragment$onViewCreated$5$onProgressChanged$1\n*L\n98#1:249,7\n*E\n"})
        static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            Object a;
            int b;
            final /* synthetic */ i0 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i0 i0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = i0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                i0 i0Var;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    i0 i0Var2 = this.c;
                    com.zentraedi.outreader.reader.h hVarY = i0Var2.S2().Y();
                    this.a = i0Var2;
                    this.b = 1;
                    Object objN = hVarY.n(this);
                    if (objN == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i0Var = i0Var2;
                    obj = objN;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i0Var = (i0) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                i0Var.s = (String) obj;
                i0 i0Var3 = this.c;
                List list = i0Var3.p;
                int i2 = 0;
                if (list != null) {
                    i0 i0Var4 = this.c;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!Intrinsics.areEqual(((ChapterM.Chapter) it.next()).f985id, i0Var4.s)) {
                            i2++;
                        }
                    }
                    i2 = -1;
                }
                i0Var3.r = i2;
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.ReaderMenuProgressFragment$onViewCreated$5$onStopTrackingTouch$1", f = "ReaderMenuProgressFragment.kt", i = {2, 2, 2, 3, 3, 3}, l = {118, 121, 123, 124}, m = "invokeSuspend", n = {"chapters", "it", "$i$a$-let-ReaderMenuProgressFragment$onViewCreated$5$onStopTrackingTouch$1$1", "chapters", "it", "$i$a$-let-ReaderMenuProgressFragment$onViewCreated$5$onStopTrackingTouch$1$1"}, s = {"L$0", "L$2", "I$0", "L$0", "L$1", "I$0"}, v = 1)
        static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
            Object a;
            Object b;
            Object c;
            int d;
            int e;
            final /* synthetic */ i0 f;
            final /* synthetic */ int g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i0 i0Var, int i, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f = i0Var;
                this.g = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f, this.g, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0089  */
            /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
            /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
            
                if (r8.s(r1, r7) == r0) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
            
                if (r8.t(r3, r7) == r0) goto L34;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    Method dump skipped, instruction units count: 217
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.v2.fragment.i0.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
                return ((b) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        e() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            if (i0.this.S2().M() == null) {
                return;
            }
            if (z) {
                i0.this.q = true;
                com.zentraedi.outreader.databinding.x0 x0Var = null;
                if (i0.this.t) {
                    com.zentraedi.outreader.databinding.x0 x0Var2 = i0.this.o;
                    if (x0Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        x0Var2 = null;
                    }
                    x0Var2.N.setVisibility(0);
                } else {
                    com.zentraedi.outreader.databinding.x0 x0Var3 = i0.this.o;
                    if (x0Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        x0Var3 = null;
                    }
                    if (x0Var3.I.getVisibility() == 8) {
                        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(i0.this), (CoroutineContext) null, (CoroutineStart) null, new a(i0.this, null), 3, (Object) null);
                    }
                    com.zentraedi.outreader.databinding.x0 x0Var4 = i0.this.o;
                    if (x0Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        x0Var4 = null;
                    }
                    x0Var4.I.setVisibility(0);
                }
                com.zentraedi.outreader.databinding.x0 x0Var5 = i0.this.o;
                if (x0Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    x0Var = x0Var5;
                }
                x0Var.E.setClickable(true);
            }
            i0.this.d3(seekBar.getProgress());
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(i0.this), (CoroutineContext) null, (CoroutineStart) null, new b(i0.this, seekBar.getProgress(), null), 3, (Object) null);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.ReaderMenuProgressFragment$onViewCreated$6$1", f = "ReaderMenuProgressFragment.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class f extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;
        final /* synthetic */ ChapterM.Chapter c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ChapterM.Chapter chapter, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = chapter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i0.this.new f(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.zentraedi.outreader.reader.h hVarY = i0.this.S2().Y();
                ChapterM.Chapter chapter = this.c;
                this.a = 1;
                if (hVarY.t(chapter, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.zentraedi.outreader.databinding.x0 x0Var = i0.this.o;
            com.zentraedi.outreader.databinding.x0 x0Var2 = null;
            if (x0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                x0Var = null;
            }
            x0Var.G.setProgress(i0.this.r);
            com.zentraedi.outreader.databinding.x0 x0Var3 = i0.this.o;
            if (x0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                x0Var2 = x0Var3;
            }
            x0Var2.E.setClickable(false);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((f) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.ReaderMenuProgressFragment$onViewCreated$7", f = "ReaderMenuProgressFragment.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    static final class g extends SuspendLambda implements Function2<kotlinx.coroutines.q0, Continuation<? super Unit>, Object> {
        int a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i0.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.zentraedi.outreader.reader.h hVarY = i0.this.S2().Y();
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
            List list = (List) obj;
            i0.this.p = list;
            if ((i0.this.S2().Y() instanceof com.zentraedi.outreader.reader.e) && list.size() <= 1) {
                i0.this.t = true;
                com.zentraedi.outreader.databinding.x0 x0Var = i0.this.o;
                com.zentraedi.outreader.databinding.x0 x0Var2 = null;
                if (x0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    x0Var = null;
                }
                x0Var.L.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.SJ));
                com.zentraedi.outreader.databinding.x0 x0Var3 = i0.this.o;
                if (x0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    x0Var2 = x0Var3;
                }
                x0Var2.M.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.rK));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Continuation<? super Unit> continuation) {
            return ((g) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
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

    @DebugMetadata(c = "com.zentraedi.outreader.v2.fragment.ReaderMenuProgressFragment", f = "ReaderMenuProgressFragment.kt", i = {0, 1, 1, 1}, l = {154, 157}, m = "updateChapterProgress", n = {"chapterId", "chapterId", "chapters", "currentChapterId"}, s = {"L$0", "L$0", "L$1", "L$2"}, v = 1)
    static final class i extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        /* synthetic */ Object e;
        int g;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @fo.l
        public final Object invokeSuspend(@fo.k Object obj) {
            this.e = obj;
            this.g |= IntCompanionObject.MIN_VALUE;
            return i0.this.Z2(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.outreader.viewmodel.d S2() {
        return (com.zentraedi.outreader.viewmodel.d) this.n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.d T2(i0 i0Var) {
        FragmentActivity fragmentActivityRequireActivity = i0Var.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new androidx.lifecycle.m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U2(i0 i0Var, View view) {
        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(i0Var), (CoroutineContext) null, (CoroutineStart) null, i0Var.new b(null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(i0 i0Var, View view) {
        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(i0Var), (CoroutineContext) null, (CoroutineStart) null, i0Var.new c(null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W2(i0 i0Var, String str) {
        if (i0Var.t) {
            return Unit.INSTANCE;
        }
        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(i0Var), (CoroutineContext) null, (CoroutineStart) null, i0Var.new d(str, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X2(i0 i0Var, Integer num) {
        if (!i0Var.t) {
            return Unit.INSTANCE;
        }
        i0Var.e3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y2(i0 i0Var, View view) {
        ChapterM.Chapter chapter;
        Object next;
        List<? extends ChapterM.Chapter> list = i0Var.p;
        if (list != null && !com.zentraedi.basic.function.utils.j0.l(list) && !StringsKt.isBlank(i0Var.s) && i0Var.r >= 0) {
            List<? extends ChapterM.Chapter> list2 = i0Var.p;
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((ChapterM.Chapter) next).f985id, i0Var.s));
                chapter = (ChapterM.Chapter) next;
            } else {
                chapter = null;
            }
            if (chapter == null) {
                return;
            } else {
                kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(i0Var), (CoroutineContext) null, (CoroutineStart) null, i0Var.new f(chapter, null), 3, (Object) null);
            }
        }
        i0Var.c3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb A[LOOP:0: B:32:0x00b4->B:37:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf A[EDGE_INSN: B:46:0x00cf->B:39:0x00cf BREAK  A[LOOP:0: B:32:0x00b4->B:37:0x00cb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object Z2(String str, Continuation<? super Unit> continuation) {
        i iVar;
        Object objM;
        Object obj;
        T t;
        List list;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        T t2;
        Ref.ObjectRef objectRef3;
        com.zentraedi.outreader.databinding.x0 x0Var;
        com.zentraedi.outreader.databinding.x0 x0Var2;
        Iterator it;
        int i2;
        com.zentraedi.outreader.databinding.x0 x0Var3;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i3 = iVar.g;
            if ((i3 & IntCompanionObject.MIN_VALUE) != 0) {
                iVar.g = i3 - IntCompanionObject.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object obj2 = iVar.e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = iVar.g;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj2);
            com.zentraedi.outreader.reader.h hVarY = S2().Y();
            iVar.a = str;
            iVar.g = 1;
            objM = hVarY.m(iVar);
            if (objM != coroutine_suspended) {
            }
            t = str;
            obj = objM;
            return coroutine_suspended;
        }
        if (i4 == 1) {
            String str2 = (String) iVar.a;
            ResultKt.throwOnFailure(obj2);
            t = str2;
            obj = obj2;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef3 = (Ref.ObjectRef) iVar.d;
            objectRef2 = (Ref.ObjectRef) iVar.c;
            list = (List) iVar.b;
            ResultKt.throwOnFailure(obj2);
            t2 = obj2;
        }
        objectRef3.element = t2;
        objectRef = objectRef2;
        x0Var = this.o;
        x0Var2 = null;
        if (x0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            x0Var = null;
        }
        x0Var.G.setMax(list.size() - 1);
        it = list.iterator();
        i2 = 0;
        while (true) {
            if (it.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.areEqual(((ChapterM.Chapter) it.next()).f985id, objectRef.element)) {
                break;
            }
            i2++;
        }
        x0Var3 = this.o;
        if (x0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            x0Var2 = x0Var3;
        }
        x0Var2.G.setProgress(i2);
        return Unit.INSTANCE;
        t = str;
        obj = objM;
        list = (List) obj;
        objectRef = new Ref.ObjectRef();
        objectRef.element = t;
        CharSequence charSequence = (CharSequence) t;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            com.zentraedi.outreader.reader.h hVarY2 = S2().Y();
            iVar.a = SpillingKt.nullOutSpilledVariable(t);
            iVar.b = list;
            iVar.c = objectRef;
            iVar.d = objectRef;
            iVar.g = 2;
            Object objN = hVarY2.n(iVar);
            if (objN != coroutine_suspended) {
                objectRef2 = objectRef;
                t2 = objN;
                objectRef3 = objectRef2;
                objectRef3.element = t2;
                objectRef = objectRef2;
            }
            t = str;
            obj = objM;
            return coroutine_suspended;
        }
        x0Var = this.o;
        x0Var2 = null;
        if (x0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            x0Var = null;
        }
        x0Var.G.setMax(list.size() - 1);
        it = list.iterator();
        i2 = 0;
        while (true) {
            if (it.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.areEqual(((ChapterM.Chapter) it.next()).f985id, objectRef.element)) {
                break;
                break;
            }
            i2++;
        }
        x0Var3 = this.o;
        if (x0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            x0Var2 = x0Var3;
        }
        x0Var2.G.setProgress(i2);
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object a3(i0 i0Var, String str, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return i0Var.Z2(str, continuation);
    }

    private final void b3() {
        com.zentraedi.outreader.databinding.x0 x0Var = null;
        if (Intrinsics.areEqual(S2().T().f(), Boolean.TRUE)) {
            com.zentraedi.outreader.databinding.x0 x0Var2 = this.o;
            if (x0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                x0Var2 = null;
            }
            if (!x0Var2.E.isClickable()) {
                com.zentraedi.outreader.databinding.x0 x0Var3 = this.o;
                if (x0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    x0Var = x0Var3;
                }
                x0Var.E.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.pT));
                return;
            }
            com.zentraedi.outreader.databinding.x0 x0Var4 = this.o;
            if (x0Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                x0Var4 = null;
            }
            x0Var4.E.setVisibility(0);
            com.zentraedi.outreader.databinding.x0 x0Var5 = this.o;
            if (x0Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                x0Var = x0Var5;
            }
            x0Var.E.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.oT));
            return;
        }
        com.zentraedi.outreader.databinding.x0 x0Var6 = this.o;
        if (x0Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            x0Var6 = null;
        }
        if (!x0Var6.E.isClickable()) {
            com.zentraedi.outreader.databinding.x0 x0Var7 = this.o;
            if (x0Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                x0Var = x0Var7;
            }
            x0Var.E.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.qT));
            return;
        }
        com.zentraedi.outreader.databinding.x0 x0Var8 = this.o;
        if (x0Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            x0Var8 = null;
        }
        x0Var8.E.setVisibility(0);
        com.zentraedi.outreader.databinding.x0 x0Var9 = this.o;
        if (x0Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            x0Var = x0Var9;
        }
        x0Var.E.setImageDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.nT));
    }

    private final void c3() {
        com.zentraedi.outreader.databinding.x0 x0Var = null;
        if (Intrinsics.areEqual(S2().T().f(), Boolean.TRUE)) {
            com.zentraedi.outreader.databinding.x0 x0Var2 = this.o;
            if (x0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                x0Var2 = null;
            }
            x0Var2.G.setProgressDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.kT));
            com.zentraedi.outreader.databinding.x0 x0Var3 = this.o;
            if (x0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                x0Var = x0Var3;
            }
            x0Var.G.setThumb(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.k70));
        } else {
            com.zentraedi.outreader.databinding.x0 x0Var4 = this.o;
            if (x0Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                x0Var4 = null;
            }
            x0Var4.G.setProgressDrawable(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.jT));
            com.zentraedi.outreader.databinding.x0 x0Var5 = this.o;
            if (x0Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                x0Var = x0Var5;
            }
            x0Var.G.setThumb(com.zentraedi.basic.function.utils.a.g(com.zentraedi.outreader.d.h.j70));
        }
        d3(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d3(int i2) {
        if (this.p == null) {
            return;
        }
        com.zentraedi.outreader.databinding.x0 x0Var = this.o;
        com.zentraedi.outreader.databinding.x0 x0Var2 = null;
        if (x0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            x0Var = null;
        }
        TextView textView = x0Var.N;
        StringBuilder sb = new StringBuilder();
        sb.append(i2 + 1);
        sb.append('/');
        sb.append(S2().Y().b());
        textView.setText(sb.toString());
        List<? extends ChapterM.Chapter> list = this.p;
        if (list != null && i2 >= 0) {
            Intrinsics.checkNotNull(list);
            if (i2 < list.size()) {
                com.zentraedi.outreader.databinding.x0 x0Var3 = this.o;
                if (x0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    x0Var3 = null;
                }
                TextView textView2 = x0Var3.J;
                List<? extends ChapterM.Chapter> list2 = this.p;
                Intrinsics.checkNotNull(list2);
                String name = list2.get(i2).name;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                textView2.setText(StringsKt.trim(name).toString());
                List<? extends ChapterM.Chapter> list3 = this.p;
                Intrinsics.checkNotNull(list3);
                if (list3.size() - 1 > 0) {
                    com.zentraedi.outreader.databinding.x0 x0Var4 = this.o;
                    if (x0Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        x0Var4 = null;
                    }
                    TextView textView3 = x0Var4.K;
                    List<? extends ChapterM.Chapter> list4 = this.p;
                    Intrinsics.checkNotNull(list4);
                    textView3.setText(com.zentraedi.outreader.util.e.f(i2, list4.size() - 1));
                }
            }
        }
        if (Intrinsics.areEqual(S2().T().f(), Boolean.TRUE)) {
            if (i2 == 0) {
                com.zentraedi.outreader.databinding.x0 x0Var5 = this.o;
                if (x0Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    x0Var5 = null;
                }
                x0Var5.L.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.M2));
            } else {
                com.zentraedi.outreader.databinding.x0 x0Var6 = this.o;
                if (x0Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    x0Var6 = null;
                }
                x0Var6.L.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.t5));
            }
            if (com.zentraedi.basic.function.utils.j0.l(this.p)) {
                return;
            }
            com.zentraedi.outreader.databinding.x0 x0Var7 = this.o;
            if (x0Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                x0Var7 = null;
            }
            if (i2 == x0Var7.G.getMax()) {
                com.zentraedi.outreader.databinding.x0 x0Var8 = this.o;
                if (x0Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    x0Var2 = x0Var8;
                }
                x0Var2.M.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.M2));
                return;
            }
            com.zentraedi.outreader.databinding.x0 x0Var9 = this.o;
            if (x0Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                x0Var2 = x0Var9;
            }
            x0Var2.M.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.t5));
            return;
        }
        if (i2 == 0) {
            com.zentraedi.outreader.databinding.x0 x0Var10 = this.o;
            if (x0Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                x0Var10 = null;
            }
            x0Var10.L.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.I3));
        } else {
            com.zentraedi.outreader.databinding.x0 x0Var11 = this.o;
            if (x0Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                x0Var11 = null;
            }
            x0Var11.L.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.K3));
        }
        if (com.zentraedi.basic.function.utils.j0.l(this.p)) {
            return;
        }
        com.zentraedi.outreader.databinding.x0 x0Var12 = this.o;
        if (x0Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            x0Var12 = null;
        }
        if (i2 == x0Var12.G.getMax()) {
            com.zentraedi.outreader.databinding.x0 x0Var13 = this.o;
            if (x0Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                x0Var2 = x0Var13;
            }
            x0Var2.M.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.I3));
            return;
        }
        com.zentraedi.outreader.databinding.x0 x0Var14 = this.o;
        if (x0Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            x0Var2 = x0Var14;
        }
        x0Var2.M.setTextColor(getResources().getColor(com.zentraedi.outreader.d.f.K3));
    }

    private final void e3() {
        int iB = S2().Y().b();
        com.zentraedi.outreader.databinding.x0 x0Var = this.o;
        com.zentraedi.outreader.databinding.x0 x0Var2 = null;
        if (x0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            x0Var = null;
        }
        x0Var.G.setMax(iB - 1);
        int iO = S2().Y().o();
        if (iO > 0) {
            iO--;
        }
        com.zentraedi.outreader.databinding.x0 x0Var3 = this.o;
        if (x0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            x0Var2 = x0Var3;
        }
        x0Var2.G.setProgress(iO);
    }

    @fo.l
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(inflater, com.zentraedi.outreader.d.l.pe, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.outreader.databinding.x0 x0Var = (com.zentraedi.outreader.databinding.x0) c0VarJ;
        this.o = x0Var;
        if (x0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            x0Var = null;
        }
        return x0Var.getRoot();
    }

    public void onViewCreated(@fo.k View view, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        com.zentraedi.outreader.databinding.x0 x0Var = this.o;
        if (x0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            x0Var = null;
        }
        x0Var.L.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i0.U2(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.x0 x0Var2 = this.o;
        if (x0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            x0Var2 = null;
        }
        x0Var2.M.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i0.V2(this.a, view2);
            }
        });
        S2().P().k(getViewLifecycleOwner(), new h(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i0.W2(this.a, (String) obj);
            }
        }));
        S2().U().k(getViewLifecycleOwner(), new h(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i0.X2(this.a, (Integer) obj);
            }
        }));
        com.zentraedi.outreader.databinding.x0 x0Var3 = this.o;
        if (x0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            x0Var3 = null;
        }
        x0Var3.G.setOnSeekBarChangeListener(new e());
        com.zentraedi.outreader.databinding.x0 x0Var4 = this.o;
        if (x0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            x0Var4 = null;
        }
        x0Var4.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i0.Y2(this.a, view2);
            }
        });
        kotlinx.coroutines.i.e(androidx.lifecycle.q0.a(this), (CoroutineContext) null, (CoroutineStart) null, new g(null), 3, (Object) null);
    }
}
