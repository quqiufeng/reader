package com.zentraedi.outreader.v2.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.litao.slider.NiftySlider;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.util.ReaderUtils;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nReaderMenuAutoPageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReaderMenuAutoPageFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuAutoPageFragment\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,187:1\n35#2,8:188\n53#2:200\n48#3,4:196\n*S KotlinDebug\n*F\n+ 1 ReaderMenuAutoPageFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuAutoPageFragment\n*L\n107#1:188,8\n107#1:200\n107#1:196,4\n*E\n"})
public final class ReaderMenuAutoPageFragment extends com.zentraedi.business.fragment.a {

    @fo.k
    public static final a r = new a(null);

    @fo.k
    private final Lazy n = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReaderMenuAutoPageFragment.J2(this.a);
        }
    });

    @fo.k
    private final Lazy o = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.w
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReaderMenuAutoPageFragment.K2(this.a);
        }
    });
    private com.zentraedi.outreader.databinding.t0 p;

    @fo.l
    private kotlinx.coroutines.k2 q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.k
        public final ReaderMenuAutoPageFragment a() {
            return new ReaderMenuAutoPageFragment();
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuAutoPageFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuAutoPageFragment\n*L\n1#1,61:1\n107#2:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.outreader.v2.fragment.ReaderMenuAutoPageFragment$b$b, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuAutoPageFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuAutoPageFragment\n*L\n1#1,61:1\n107#2:62\n*E\n"})
        public static final class C0154b implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuAutoPageFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuAutoPageFragment\n*L\n1#1,61:1\n107#2:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        public b(CoroutineExceptionHandler.b bVar) {
            super(bVar);
        }

        public void handleException(@fo.k CoroutineContext coroutineContext, @fo.k Throwable th2) {
            try {
                nd.a.h("CoroutineScope", "throwable->coroutineDefaultWithMain() throwable=" + Log.getStackTraceString(th2));
                th2.printStackTrace();
                pe.i.r(new a());
            } catch (Throwable th3) {
                try {
                    th3.printStackTrace();
                    pe.i.r(new C0154b());
                } catch (Throwable th4) {
                    pe.i.r(new c());
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.outreader.viewmodel.d H2() {
        return (com.zentraedi.outreader.viewmodel.d) this.n.getValue();
    }

    private final com.zentraedi.outreader.viewmodel.a I2() {
        return (com.zentraedi.outreader.viewmodel.a) this.o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.d J2(ReaderMenuAutoPageFragment readerMenuAutoPageFragment) {
        FragmentActivity fragmentActivityRequireActivity = readerMenuAutoPageFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new androidx.lifecycle.m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.a K2(ReaderMenuAutoPageFragment readerMenuAutoPageFragment) {
        FragmentActivity fragmentActivityRequireActivity = readerMenuAutoPageFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new androidx.lifecycle.m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L2(ReaderMenuAutoPageFragment readerMenuAutoPageFragment, NiftySlider slider, int i, boolean z) {
        Intrinsics.checkNotNullParameter(slider, "slider");
        readerMenuAutoPageFragment.Q2(i + 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(View view) {
        com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.NA2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(ReaderMenuAutoPageFragment readerMenuAutoPageFragment, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        readerMenuAutoPageFragment.I2().L().set(false);
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = readerMenuAutoPageFragment.H2().M();
        aVar.z(bookModelM != null ? bookModelM.getBookFileType() : null, 2);
        readerMenuAutoPageFragment.H2().Y().z(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(ReaderMenuAutoPageFragment readerMenuAutoPageFragment, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        readerMenuAutoPageFragment.I2().L().set(true);
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = readerMenuAutoPageFragment.H2().M();
        aVar.z(bookModelM != null ? bookModelM.getBookFileType() : null, 1);
        readerMenuAutoPageFragment.H2().Y().z(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(ReaderMenuAutoPageFragment readerMenuAutoPageFragment, View view) {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = readerMenuAutoPageFragment.H2().M();
        readerMenuAutoPageFragment.H2().Y().z(aVar.u(bookModelM != null ? bookModelM.getBookFileType() : null));
        readerMenuAutoPageFragment.H2().R().r(Boolean.FALSE);
    }

    private final void Q2(int i) {
        kotlinx.coroutines.k2 k2Var = this.q;
        if (k2Var != null) {
            kotlinx.coroutines.k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
        }
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + ReaderMenuAutoPageFragment.class + ' ' + Thread.currentThread().getName());
        this.q = kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.a().plus(new b(CoroutineExceptionHandler.F2))), (CoroutineContext) null, (CoroutineStart) null, new ReaderMenuAutoPageFragment$setAutoSpeed$$inlined$coroutineDefaultWithMain$2(this, ReaderMenuAutoPageFragment.class, null, i, this), 3, (Object) null);
    }

    @fo.l
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(inflater, com.zentraedi.outreader.d.l.oe, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.outreader.databinding.t0 t0Var = (com.zentraedi.outreader.databinding.t0) c0VarJ;
        this.p = t0Var;
        com.zentraedi.outreader.databinding.t0 t0Var2 = null;
        if (t0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            t0Var = null;
        }
        t0Var.C1(I2());
        com.zentraedi.outreader.databinding.t0 t0Var3 = this.p;
        if (t0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            t0Var2 = t0Var3;
        }
        return t0Var2.getRoot();
    }

    public void onViewCreated(@fo.k View view, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = H2().M();
        com.zentraedi.outreader.databinding.t0 t0Var = null;
        int iB = aVar.b(bookModelM != null ? bookModelM.getBookFileType() : null);
        com.zentraedi.outreader.databinding.t0 t0Var2 = this.p;
        if (t0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            t0Var2 = null;
        }
        t0Var2.O.j0(iB - 1, false);
        com.zentraedi.outreader.databinding.t0 t0Var3 = this.p;
        if (t0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            t0Var3 = null;
        }
        t0Var3.O.J0(new Function3() { // from class: com.zentraedi.outreader.v2.fragment.x
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ReaderMenuAutoPageFragment.L2(this.a, (NiftySlider) obj, ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        });
        com.zentraedi.outreader.databinding.t0 t0Var4 = this.p;
        if (t0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            t0Var4 = null;
        }
        t0Var4.K.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReaderMenuAutoPageFragment.M2(view2);
            }
        });
        BookModel bookModelM2 = H2().M();
        I2().L().set(aVar.a(bookModelM2 != null ? bookModelM2.getBookFileType() : null) == 1);
        BookModel bookModelM3 = H2().M();
        if (bookModelM3 != null) {
            bookModelM3.isTxt();
        }
        com.zentraedi.outreader.databinding.t0 t0Var5 = this.p;
        if (t0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            t0Var5 = null;
        }
        t0Var5.J.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReaderMenuAutoPageFragment.N2(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.t0 t0Var6 = this.p;
        if (t0Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            t0Var6 = null;
        }
        t0Var6.I.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReaderMenuAutoPageFragment.O2(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.t0 t0Var7 = this.p;
        if (t0Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            t0Var = t0Var7;
        }
        t0Var.M.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReaderMenuAutoPageFragment.P2(this.a, view2);
            }
        });
    }
}
