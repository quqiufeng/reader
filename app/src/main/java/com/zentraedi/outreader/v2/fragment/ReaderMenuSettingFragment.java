package com.zentraedi.outreader.v2.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.litao.slider.NiftySlider;
import com.zentraedi.filemanage.activity.be;
import com.zentraedi.filemanage.activity.ce;
import com.zentraedi.outreader.activity.ReaderSettingActivity;
import com.zentraedi.outreader.activity.ZReaderTypefaceActivity;
import com.zentraedi.outreader.dialog.MoreMarginDialog;
import com.zentraedi.outreader.event.ChangeTypefaceEvent;
import com.zentraedi.outreader.model.TypefaceM;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.util.ReaderUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SuppressLint({"WrongConstant"})
@SourceDebugExtension({"SMAP\nReaderMenuSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReaderMenuSettingFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuSettingFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,428:1\n257#2,2:429\n257#2,2:431\n257#2,2:433\n257#2,2:435\n257#2,2:437\n35#3,8:439\n53#3:451\n35#3,8:452\n53#3:464\n35#3,8:465\n53#3:477\n35#3,8:478\n53#3:490\n48#4,4:447\n48#4,4:460\n48#4,4:473\n48#4,4:486\n*S KotlinDebug\n*F\n+ 1 ReaderMenuSettingFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuSettingFragment\n*L\n122#1:429,2\n123#1:431,2\n124#1:433,2\n125#1:435,2\n126#1:437,2\n324#1:439,8\n324#1:451\n337#1:452,8\n337#1:464\n351#1:465,8\n351#1:477\n365#1:478,8\n365#1:490\n324#1:447,4\n337#1:460,4\n351#1:473,4\n365#1:486,4\n*E\n"})
public final class ReaderMenuSettingFragment extends com.zentraedi.business.fragment.a {

    @fo.k
    public static final a w = new a(null);
    private com.zentraedi.outreader.databinding.b1 q;

    @fo.l
    private kotlinx.coroutines.k2 s;

    @fo.l
    private kotlinx.coroutines.k2 t;

    @fo.l
    private kotlinx.coroutines.k2 u;

    @fo.l
    private kotlinx.coroutines.k2 v;

    @fo.k
    private final Lazy n = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.x0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReaderMenuSettingFragment.u3(this.a);
        }
    });

    @fo.k
    private final Lazy o = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.y0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReaderMenuSettingFragment.v3(this.a);
        }
    });

    @fo.k
    private final Lazy p = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.fragment.z0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReaderMenuSettingFragment.N3(this.a);
        }
    });
    private int r = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fo.k
        public final ReaderMenuSettingFragment a() {
            return new ReaderMenuSettingFragment();
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuSettingFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuSettingFragment\n*L\n1#1,61:1\n324#2:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.outreader.v2.fragment.ReaderMenuSettingFragment$b$b, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuSettingFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuSettingFragment\n*L\n1#1,61:1\n324#2:62\n*E\n"})
        public static final class C0155b implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuSettingFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuSettingFragment\n*L\n1#1,61:1\n324#2:62\n*E\n"})
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
                    pe.i.r(new C0155b());
                } catch (Throwable th4) {
                    pe.i.r(new c());
                    throw th4;
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuSettingFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuSettingFragment\n*L\n1#1,61:1\n351#2:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuSettingFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuSettingFragment\n*L\n1#1,61:1\n351#2:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.outreader.v2.fragment.ReaderMenuSettingFragment$c$c, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuSettingFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuSettingFragment\n*L\n1#1,61:1\n351#2:62\n*E\n"})
        public static final class C0156c implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        public c(CoroutineExceptionHandler.b bVar) {
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
                    pe.i.r(new b());
                } catch (Throwable th4) {
                    pe.i.r(new C0156c());
                    throw th4;
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class d extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuSettingFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuSettingFragment\n*L\n1#1,61:1\n337#2:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuSettingFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuSettingFragment\n*L\n1#1,61:1\n337#2:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuSettingFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuSettingFragment\n*L\n1#1,61:1\n337#2:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        public d(CoroutineExceptionHandler.b bVar) {
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
                    pe.i.r(new b());
                } catch (Throwable th4) {
                    pe.i.r(new c());
                    throw th4;
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class e extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuSettingFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuSettingFragment\n*L\n1#1,61:1\n365#2:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuSettingFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuSettingFragment\n*L\n1#1,61:1\n365#2:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 ReaderMenuSettingFragment.kt\ncom/zentraedi/outreader/v2/fragment/ReaderMenuSettingFragment\n*L\n1#1,61:1\n365#2:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        public e(CoroutineExceptionHandler.b bVar) {
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
                    pe.i.r(new b());
                } catch (Throwable th4) {
                    pe.i.r(new c());
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A3(ReaderMenuSettingFragment readerMenuSettingFragment, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        readerMenuSettingFragment.F3();
    }

    private final void B3(ReaderUtils.FontSize fontSize) {
        kotlinx.coroutines.k2 k2Var = this.s;
        if (k2Var != null) {
            kotlinx.coroutines.k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
        }
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + ReaderMenuSettingFragment.class + ' ' + Thread.currentThread().getName());
        this.s = kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.a().plus(new b(CoroutineExceptionHandler.F2))), (CoroutineContext) null, (CoroutineStart) null, new ReaderMenuSettingFragment$setFontSize$$inlined$coroutineDefaultWithMain$2(this, ReaderMenuSettingFragment.class, null, fontSize, this), 3, (Object) null);
    }

    private final void C3(ReaderUtils.LineSpace lineSpace) {
        kotlinx.coroutines.k2 k2Var = this.u;
        if (k2Var != null) {
            kotlinx.coroutines.k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
        }
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + ReaderMenuSettingFragment.class + ' ' + Thread.currentThread().getName());
        this.u = kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.a().plus(new c(CoroutineExceptionHandler.F2))), (CoroutineContext) null, (CoroutineStart) null, new ReaderMenuSettingFragment$setLineSpace$$inlined$coroutineDefaultWithMain$2(this, ReaderMenuSettingFragment.class, null, lineSpace, this), 3, (Object) null);
    }

    private final void D3(ReaderUtils.PageMargin pageMargin) {
        kotlinx.coroutines.k2 k2Var = this.t;
        if (k2Var != null) {
            kotlinx.coroutines.k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
        }
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + ReaderMenuSettingFragment.class + ' ' + Thread.currentThread().getName());
        this.t = kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.a().plus(new d(CoroutineExceptionHandler.F2))), (CoroutineContext) null, (CoroutineStart) null, new ReaderMenuSettingFragment$setPageMargin$$inlined$coroutineDefaultWithMain$2(this, ReaderMenuSettingFragment.class, null, pageMargin, this), 3, (Object) null);
    }

    private final void E3(ReaderUtils.ParagraphSpace paragraphSpace) {
        kotlinx.coroutines.k2 k2Var = this.v;
        if (k2Var != null) {
            kotlinx.coroutines.k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
        }
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + ReaderMenuSettingFragment.class + ' ' + Thread.currentThread().getName());
        this.v = kotlinx.coroutines.i.e(kotlinx.coroutines.r0.a(kotlinx.coroutines.g1.a().plus(new e(CoroutineExceptionHandler.F2))), (CoroutineContext) null, (CoroutineStart) null, new ReaderMenuSettingFragment$setParagraphSpace$$inlined$coroutineDefaultWithMain$2(this, ReaderMenuSettingFragment.class, null, paragraphSpace, this), 3, (Object) null);
    }

    private final void F3() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        new MoreMarginDialog(fragmentActivityRequireActivity).Q().N(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.w0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReaderMenuSettingFragment.G3(this.a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G3(ReaderMenuSettingFragment readerMenuSettingFragment, boolean z) {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = readerMenuSettingFragment.Z2().M();
        com.zentraedi.outreader.databinding.b1 b1Var = null;
        int iIndexOf = aVar.l().indexOf(aVar.m(bookModelM != null ? bookModelM.getBookFileType() : null));
        com.zentraedi.outreader.databinding.b1 b1Var2 = readerMenuSettingFragment.q;
        if (b1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            b1Var = b1Var2;
        }
        b1Var.L.j0(iIndexOf, false);
        if (!z) {
            readerMenuSettingFragment.Z2().W().r(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    private final void H3() {
        List<Integer> listR = Z2().Y().r();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        com.zentraedi.outreader.dialog.a0 a0VarN = new com.zentraedi.outreader.dialog.a0(contextRequireContext).n(this.r, listR);
        a0VarN.m(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReaderMenuSettingFragment.I3(this.a, ((Integer) obj).intValue());
            }
        });
        a0VarN.l(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReaderMenuSettingFragment.J3(this.a, ((Boolean) obj).booleanValue());
            }
        });
        com.zentraedi.outreader.databinding.b1 b1Var = this.q;
        if (b1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var = null;
        }
        b1Var.getRoot().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I3(ReaderMenuSettingFragment readerMenuSettingFragment, int i) {
        readerMenuSettingFragment.L3(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J3(ReaderMenuSettingFragment readerMenuSettingFragment, boolean z) {
        if (z) {
            com.zentraedi.outreader.databinding.b1 b1Var = readerMenuSettingFragment.q;
            if (b1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                b1Var = null;
            }
            b1Var.getRoot().setVisibility(0);
        } else {
            readerMenuSettingFragment.Z2().W().r(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    private final void K3() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = Z2().M();
        int iB = aVar.b(bookModelM != null ? bookModelM.getBookFileType() : null);
        Z2().L().r(Integer.valueOf(iB));
        BookModel bookModelM2 = Z2().M();
        int iA = aVar.a(bookModelM2 != null ? bookModelM2.getBookFileType() : null);
        Z2().Y().z(iA);
        nd.a.e("nas_book", "ReaderMenuSettingFragment->startAutoPage speed=" + iB + " autoPageMode=" + iA);
        Z2().R().r(Boolean.TRUE);
    }

    private final void L3(int i) {
        if (i == this.r) {
            return;
        }
        this.r = i;
        com.zentraedi.outreader.databinding.b1 b1Var = this.q;
        if (b1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var = null;
        }
        TextView textView = b1Var.V;
        ReaderUtils.a aVar = ReaderUtils.a;
        textView.setText(aVar.v(this.r));
        BookModel bookModelM = Z2().M();
        aVar.I(bookModelM != null ? bookModelM.getBookFileType() : null, i);
        Z2().Y().z(i);
    }

    private final void M3(Vibrator vibrator) {
        if (vibrator.hasVibrator()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                VibrationEffect vibrationEffectCreatePredefined = VibrationEffect.createPredefined(2);
                Intrinsics.checkNotNullExpressionValue(vibrationEffectCreatePredefined, "createPredefined(...)");
                ce.a(vibrator, vibrationEffectCreatePredefined);
            } else if (i >= 26) {
                ce.a(vibrator, be.a(50L, -1));
            } else {
                vibrator.vibrate(50L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vibrator N3(ReaderMenuSettingFragment readerMenuSettingFragment) {
        Object systemService;
        Vibrator defaultVibrator;
        if (Build.VERSION.SDK_INT >= 31) {
            Context context = readerMenuSettingFragment.getContext();
            systemService = context != null ? context.getSystemService("vibrator_manager") : null;
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
            defaultVibrator = com.zentraedi.outreader.dialog.a.a(systemService).getDefaultVibrator();
        } else {
            Context context2 = readerMenuSettingFragment.getContext();
            systemService = context2 != null ? context2.getSystemService("vibrator") : null;
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            defaultVibrator = (Vibrator) systemService;
        }
        Intrinsics.checkNotNull(defaultVibrator);
        return defaultVibrator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.outreader.viewmodel.d Z2() {
        return (com.zentraedi.outreader.viewmodel.d) this.n.getValue();
    }

    private final com.zentraedi.outreader.viewmodel.c a3() {
        return (com.zentraedi.outreader.viewmodel.c) this.o.getValue();
    }

    private final Vibrator b3() {
        return (Vibrator) this.p.getValue();
    }

    private final void c3() {
        Object next;
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = Z2().M();
        com.zentraedi.outreader.databinding.b1 b1Var = null;
        String strJ = aVar.j(bookModelM != null ? bookModelM.getBookFileType() : null);
        Iterator<T> it = new com.zentraedi.outreader.business.b().i("").iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((TypefaceM) next).getType(), strJ));
        TypefaceM typefaceM = (TypefaceM) next;
        if (typefaceM != null) {
            com.zentraedi.outreader.databinding.b1 b1Var2 = this.q;
            if (b1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                b1Var2 = null;
            }
            b1Var2.P.setText(typefaceM.getName());
        }
        ReaderUtils.a aVar2 = ReaderUtils.a;
        BookModel bookModelM2 = Z2().M();
        ReaderUtils.FontSize fontSizeH = aVar2.h(bookModelM2 != null ? bookModelM2.getBookFileType() : null);
        StringBuilder sb = new StringBuilder();
        sb.append("ReaderMenuSettingFragment->initFontChangeView nasFileName=");
        BookModel bookModelM3 = Z2().M();
        sb.append(bookModelM3 != null ? bookModelM3.getNasFileName() : null);
        sb.append(" fontSize=");
        sb.append(fontSizeH);
        nd.a.e("nas_book", sb.toString());
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = aVar2.i().indexOf(fontSizeH);
        com.zentraedi.outreader.databinding.b1 b1Var3 = this.q;
        if (b1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var3 = null;
        }
        b1Var3.Q.setText(String.valueOf(fontSizeH.getValue()));
        com.zentraedi.outreader.databinding.b1 b1Var4 = this.q;
        if (b1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var4 = null;
        }
        b1Var4.R.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReaderMenuSettingFragment.d3(intRef, this, view);
            }
        });
        com.zentraedi.outreader.databinding.b1 b1Var5 = this.q;
        if (b1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var5 = null;
        }
        b1Var5.S.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReaderMenuSettingFragment.e3(intRef, this, view);
            }
        });
        com.zentraedi.outreader.databinding.b1 b1Var6 = this.q;
        if (b1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var6 = null;
        }
        b1Var6.K.j0(intRef.element, false);
        com.zentraedi.outreader.databinding.b1 b1Var7 = this.q;
        if (b1Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var7 = null;
        }
        b1Var7.K.J0(new Function3() { // from class: com.zentraedi.outreader.v2.fragment.s0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ReaderMenuSettingFragment.f3(this.a, (NiftySlider) obj, ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        });
        com.zentraedi.outreader.databinding.b1 b1Var8 = this.q;
        if (b1Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var8 = null;
        }
        b1Var8.K.L0(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReaderMenuSettingFragment.g3((NiftySlider) obj);
            }
        });
        com.zentraedi.outreader.databinding.b1 b1Var9 = this.q;
        if (b1Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            b1Var = b1Var9;
        }
        b1Var.K.M0(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReaderMenuSettingFragment.h3(this.a, (NiftySlider) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(Ref.IntRef intRef, ReaderMenuSettingFragment readerMenuSettingFragment, View view) {
        if (intRef.element <= 0) {
            return;
        }
        ReaderUtils.a aVar = ReaderUtils.a;
        EnumEntries<ReaderUtils.FontSize> enumEntriesI = aVar.i();
        int i = intRef.element - 1;
        intRef.element = i;
        ReaderUtils.FontSize fontSizeG = (ReaderUtils.FontSize) CollectionsKt.getOrNull(enumEntriesI, i);
        if (fontSizeG == null) {
            fontSizeG = aVar.g();
        }
        readerMenuSettingFragment.B3(fontSizeG);
        com.zentraedi.outreader.databinding.b1 b1Var = readerMenuSettingFragment.q;
        if (b1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var = null;
        }
        b1Var.Q.setText(String.valueOf(fontSizeG.getValue()));
        Fragment parentFragment = readerMenuSettingFragment.getParentFragment();
        if (parentFragment != null) {
            p2 p2Var = parentFragment instanceof p2 ? (p2) parentFragment : null;
            if (p2Var != null) {
                p2Var.T3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(Ref.IntRef intRef, ReaderMenuSettingFragment readerMenuSettingFragment, View view) {
        int i = intRef.element;
        ReaderUtils.a aVar = ReaderUtils.a;
        if (i >= aVar.i().size() - 1) {
            return;
        }
        EnumEntries<ReaderUtils.FontSize> enumEntriesI = aVar.i();
        int i2 = intRef.element + 1;
        intRef.element = i2;
        ReaderUtils.FontSize fontSizeG = (ReaderUtils.FontSize) CollectionsKt.getOrNull(enumEntriesI, i2);
        if (fontSizeG == null) {
            fontSizeG = aVar.g();
        }
        readerMenuSettingFragment.B3(fontSizeG);
        com.zentraedi.outreader.databinding.b1 b1Var = readerMenuSettingFragment.q;
        if (b1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var = null;
        }
        b1Var.Q.setText(String.valueOf(fontSizeG.getValue()));
        Fragment parentFragment = readerMenuSettingFragment.getParentFragment();
        if (parentFragment != null) {
            p2 p2Var = parentFragment instanceof p2 ? (p2) parentFragment : null;
            if (p2Var != null) {
                p2Var.T3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f3(ReaderMenuSettingFragment readerMenuSettingFragment, NiftySlider slider, int i, boolean z) {
        Intrinsics.checkNotNullParameter(slider, "slider");
        readerMenuSettingFragment.M3(readerMenuSettingFragment.b3());
        ReaderUtils.a aVar = ReaderUtils.a;
        ReaderUtils.FontSize fontSizeG = (ReaderUtils.FontSize) CollectionsKt.getOrNull(aVar.i(), i);
        if (fontSizeG == null) {
            fontSizeG = aVar.g();
        }
        readerMenuSettingFragment.B3(fontSizeG);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g3(NiftySlider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h3(ReaderMenuSettingFragment readerMenuSettingFragment, NiftySlider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        readerMenuSettingFragment.a3().P().set(false);
        readerMenuSettingFragment.a3().L().set(false);
        com.zentraedi.outreader.databinding.b1 b1Var = readerMenuSettingFragment.q;
        if (b1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var = null;
        }
        b1Var.E.setAlpha(1.0f);
        Fragment parentFragment = readerMenuSettingFragment.getParentFragment();
        if (parentFragment != null) {
            p2 p2Var = parentFragment instanceof p2 ? (p2) parentFragment : null;
            if (p2Var != null) {
                p2Var.T3();
            }
        }
        return Unit.INSTANCE;
    }

    private final void i3() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = Z2().M();
        com.zentraedi.outreader.databinding.b1 b1Var = null;
        ReaderUtils.LineSpace lineSpaceM = aVar.m(bookModelM != null ? bookModelM.getBookFileType() : null);
        StringBuilder sb = new StringBuilder();
        sb.append("ReaderMenuSettingFragment->initLineSpaceView nasFileName=");
        BookModel bookModelM2 = Z2().M();
        sb.append(bookModelM2 != null ? bookModelM2.getNasFileName() : null);
        sb.append(" lineSpace=");
        sb.append(lineSpaceM);
        nd.a.e("nas_book", sb.toString());
        int iIndexOf = aVar.l().indexOf(lineSpaceM);
        com.zentraedi.outreader.databinding.b1 b1Var2 = this.q;
        if (b1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var2 = null;
        }
        b1Var2.L.j0(iIndexOf, false);
        com.zentraedi.outreader.databinding.b1 b1Var3 = this.q;
        if (b1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var3 = null;
        }
        b1Var3.L.J0(new Function3() { // from class: com.zentraedi.outreader.v2.fragment.g1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ReaderMenuSettingFragment.j3(this.a, (NiftySlider) obj, ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        });
        com.zentraedi.outreader.databinding.b1 b1Var4 = this.q;
        if (b1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var4 = null;
        }
        b1Var4.L.L0(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.h1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReaderMenuSettingFragment.k3((NiftySlider) obj);
            }
        });
        com.zentraedi.outreader.databinding.b1 b1Var5 = this.q;
        if (b1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            b1Var = b1Var5;
        }
        b1Var.L.M0(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReaderMenuSettingFragment.l3(this.a, (NiftySlider) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j3(ReaderMenuSettingFragment readerMenuSettingFragment, NiftySlider slider, int i, boolean z) {
        Intrinsics.checkNotNullParameter(slider, "slider");
        readerMenuSettingFragment.M3(readerMenuSettingFragment.b3());
        ReaderUtils.a aVar = ReaderUtils.a;
        ReaderUtils.LineSpace lineSpaceK = (ReaderUtils.LineSpace) CollectionsKt.getOrNull(aVar.l(), i);
        if (lineSpaceK == null) {
            lineSpaceK = aVar.k();
        }
        readerMenuSettingFragment.C3(lineSpaceK);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k3(NiftySlider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l3(ReaderMenuSettingFragment readerMenuSettingFragment, NiftySlider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        readerMenuSettingFragment.a3().P().set(false);
        readerMenuSettingFragment.a3().M().set(false);
        com.zentraedi.outreader.databinding.b1 b1Var = readerMenuSettingFragment.q;
        if (b1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var = null;
        }
        b1Var.F.setAlpha(1.0f);
        Fragment parentFragment = readerMenuSettingFragment.getParentFragment();
        if (parentFragment != null) {
            p2 p2Var = parentFragment instanceof p2 ? (p2) parentFragment : null;
            if (p2Var != null) {
                p2Var.T3();
            }
        }
        return Unit.INSTANCE;
    }

    private final void m3() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = Z2().M();
        com.zentraedi.outreader.databinding.b1 b1Var = null;
        ReaderUtils.PageMargin pageMarginS = aVar.s(bookModelM != null ? bookModelM.getBookFileType() : null);
        StringBuilder sb = new StringBuilder();
        sb.append("ReaderMenuSettingFragment->initPageMarginView nasFileName=");
        BookModel bookModelM2 = Z2().M();
        sb.append(bookModelM2 != null ? bookModelM2.getNasFileName() : null);
        sb.append(" pageMargin=");
        sb.append(pageMarginS);
        nd.a.e("nas_book", sb.toString());
        int iIndexOf = aVar.t().indexOf(pageMarginS);
        com.zentraedi.outreader.databinding.b1 b1Var2 = this.q;
        if (b1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var2 = null;
        }
        b1Var2.M.j0(iIndexOf, false);
        com.zentraedi.outreader.databinding.b1 b1Var3 = this.q;
        if (b1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var3 = null;
        }
        b1Var3.M.J0(new Function3() { // from class: com.zentraedi.outreader.v2.fragment.b1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ReaderMenuSettingFragment.n3(this.a, (NiftySlider) obj, ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        });
        com.zentraedi.outreader.databinding.b1 b1Var4 = this.q;
        if (b1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var4 = null;
        }
        b1Var4.M.L0(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReaderMenuSettingFragment.o3((NiftySlider) obj);
            }
        });
        com.zentraedi.outreader.databinding.b1 b1Var5 = this.q;
        if (b1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            b1Var = b1Var5;
        }
        b1Var.M.M0(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReaderMenuSettingFragment.p3(this.a, (NiftySlider) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n3(ReaderMenuSettingFragment readerMenuSettingFragment, NiftySlider slider, int i, boolean z) {
        Intrinsics.checkNotNullParameter(slider, "slider");
        readerMenuSettingFragment.M3(readerMenuSettingFragment.b3());
        ReaderUtils.a aVar = ReaderUtils.a;
        ReaderUtils.PageMargin pageMarginQ = (ReaderUtils.PageMargin) CollectionsKt.getOrNull(aVar.t(), i);
        if (pageMarginQ == null) {
            pageMarginQ = aVar.q();
        }
        readerMenuSettingFragment.D3(pageMarginQ);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o3(NiftySlider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p3(ReaderMenuSettingFragment readerMenuSettingFragment, NiftySlider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        readerMenuSettingFragment.a3().P().set(false);
        readerMenuSettingFragment.a3().N().set(false);
        com.zentraedi.outreader.databinding.b1 b1Var = readerMenuSettingFragment.q;
        if (b1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var = null;
        }
        b1Var.G.setAlpha(1.0f);
        Fragment parentFragment = readerMenuSettingFragment.getParentFragment();
        if (parentFragment != null) {
            p2 p2Var = parentFragment instanceof p2 ? (p2) parentFragment : null;
            if (p2Var != null) {
                p2Var.T3();
            }
        }
        return Unit.INSTANCE;
    }

    private final void q3() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = Z2().M();
        com.zentraedi.outreader.databinding.b1 b1Var = null;
        ReaderUtils.ParagraphSpace paragraphSpaceX = aVar.x(bookModelM != null ? bookModelM.getBookFileType() : null);
        StringBuilder sb = new StringBuilder();
        sb.append("ReaderMenuSettingFragment->initParagraphSpaceView nasFileName=");
        BookModel bookModelM2 = Z2().M();
        sb.append(bookModelM2 != null ? bookModelM2.getNasFileName() : null);
        sb.append(" paragraphSpace=");
        sb.append(paragraphSpaceX);
        nd.a.e("nas_book", sb.toString());
        int iIndexOf = aVar.w().indexOf(paragraphSpaceX);
        com.zentraedi.outreader.databinding.b1 b1Var2 = this.q;
        if (b1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var2 = null;
        }
        b1Var2.N.j0(iIndexOf, false);
        com.zentraedi.outreader.databinding.b1 b1Var3 = this.q;
        if (b1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var3 = null;
        }
        b1Var3.N.J0(new Function3() { // from class: com.zentraedi.outreader.v2.fragment.j0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ReaderMenuSettingFragment.r3(this.a, (NiftySlider) obj, ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        });
        com.zentraedi.outreader.databinding.b1 b1Var4 = this.q;
        if (b1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var4 = null;
        }
        b1Var4.N.L0(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReaderMenuSettingFragment.s3((NiftySlider) obj);
            }
        });
        com.zentraedi.outreader.databinding.b1 b1Var5 = this.q;
        if (b1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            b1Var = b1Var5;
        }
        b1Var.N.M0(new Function1() { // from class: com.zentraedi.outreader.v2.fragment.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReaderMenuSettingFragment.t3(this.a, (NiftySlider) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r3(ReaderMenuSettingFragment readerMenuSettingFragment, NiftySlider slider, int i, boolean z) {
        Intrinsics.checkNotNullParameter(slider, "slider");
        readerMenuSettingFragment.M3(readerMenuSettingFragment.b3());
        ReaderUtils.a aVar = ReaderUtils.a;
        ReaderUtils.ParagraphSpace paragraphSpaceR = (ReaderUtils.ParagraphSpace) CollectionsKt.getOrNull(aVar.w(), i);
        if (paragraphSpaceR == null) {
            paragraphSpaceR = aVar.r();
        }
        readerMenuSettingFragment.E3(paragraphSpaceR);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s3(NiftySlider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t3(ReaderMenuSettingFragment readerMenuSettingFragment, NiftySlider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        readerMenuSettingFragment.a3().P().set(false);
        readerMenuSettingFragment.a3().O().set(false);
        com.zentraedi.outreader.databinding.b1 b1Var = readerMenuSettingFragment.q;
        if (b1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var = null;
        }
        b1Var.H.setAlpha(1.0f);
        Fragment parentFragment = readerMenuSettingFragment.getParentFragment();
        if (parentFragment != null) {
            p2 p2Var = parentFragment instanceof p2 ? (p2) parentFragment : null;
            if (p2Var != null) {
                p2Var.T3();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.d u3(ReaderMenuSettingFragment readerMenuSettingFragment) {
        FragmentActivity fragmentActivityRequireActivity = readerMenuSettingFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new androidx.lifecycle.m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.c v3(ReaderMenuSettingFragment readerMenuSettingFragment) {
        FragmentActivity fragmentActivityRequireActivity = readerMenuSettingFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new androidx.lifecycle.m2(fragmentActivityRequireActivity).c(com.zentraedi.outreader.viewmodel.c.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(ReaderMenuSettingFragment readerMenuSettingFragment, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        readerMenuSettingFragment.K3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(ReaderMenuSettingFragment readerMenuSettingFragment, View view) {
        readerMenuSettingFragment.Z2().W().r(Boolean.FALSE);
        ReaderSettingActivity.a aVar = ReaderSettingActivity.Z;
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
        BookModel bookModelM = readerMenuSettingFragment.Z2().M();
        aVar.a(activityE, bookModelM != null ? bookModelM.getMd5Path() : null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(ReaderMenuSettingFragment readerMenuSettingFragment, View view) {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = readerMenuSettingFragment.Z2().M();
        String strJ = aVar.j(bookModelM != null ? bookModelM.getBookFileType() : null);
        ZReaderTypefaceActivity.a aVar2 = ZReaderTypefaceActivity.c0;
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        Intrinsics.checkNotNullExpressionValue(activityE, "getCurActivity(...)");
        BookModel bookModelM2 = readerMenuSettingFragment.Z2().M();
        String bookFileType = bookModelM2 != null ? bookModelM2.getBookFileType() : null;
        if (bookFileType == null) {
            bookFileType = "";
        }
        aVar2.a(activityE, strJ, bookFileType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z3(ReaderMenuSettingFragment readerMenuSettingFragment, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        readerMenuSettingFragment.H3();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onChangeTypefaceEvent(@fo.k ChangeTypefaceEvent event) {
        Object next;
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator<T> it = new com.zentraedi.outreader.business.b().i("").iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((TypefaceM) next).getType(), event.getType()));
        TypefaceM typefaceM = (TypefaceM) next;
        if (typefaceM != null) {
            com.zentraedi.outreader.databinding.b1 b1Var = this.q;
            if (b1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                b1Var = null;
            }
            b1Var.P.setText(typefaceM.getName());
        }
        com.zentraedi.reader.i iVarY = Z2().Y();
        com.zentraedi.outreader.reader.c cVar = iVarY instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVarY : null;
        if (cVar != null) {
            String type = event.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            cVar.f(type);
        }
    }

    @fo.l
    public View onCreateView(@fo.k LayoutInflater inflater, @fo.l ViewGroup viewGroup, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(inflater, com.zentraedi.outreader.d.l.re, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        com.zentraedi.outreader.databinding.b1 b1Var = (com.zentraedi.outreader.databinding.b1) c0VarJ;
        this.q = b1Var;
        com.zentraedi.outreader.databinding.b1 b1Var2 = null;
        if (b1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var = null;
        }
        b1Var.C1(a3());
        com.zentraedi.outreader.databinding.b1 b1Var3 = this.q;
        if (b1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            b1Var2 = b1Var3;
        }
        return b1Var2.getRoot();
    }

    public void onDestroyView() {
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        org.greenrobot.eventbus.c.f().A(this);
    }

    public void onViewCreated(@fo.k View view, @fo.l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        org.greenrobot.eventbus.c.f().v(this);
        com.zentraedi.outreader.databinding.b1 b1Var = this.q;
        com.zentraedi.outreader.databinding.b1 b1Var2 = null;
        if (b1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var = null;
        }
        b1Var.O.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReaderMenuSettingFragment.w3(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.b1 b1Var3 = this.q;
        if (b1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var3 = null;
        }
        b1Var3.U.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReaderMenuSettingFragment.x3(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.b1 b1Var4 = this.q;
        if (b1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var4 = null;
        }
        b1Var4.P.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReaderMenuSettingFragment.y3(this.a, view2);
            }
        });
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = Z2().M();
        this.r = aVar.u(bookModelM != null ? bookModelM.getBookFileType() : null);
        List<Integer> listR = Z2().Y().r();
        if (!listR.isEmpty() && !listR.contains(Integer.valueOf(this.r))) {
            this.r = listR.get(0).intValue();
        }
        com.zentraedi.outreader.databinding.b1 b1Var5 = this.q;
        if (b1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var5 = null;
        }
        b1Var5.V.setText(aVar.v(this.r));
        com.zentraedi.outreader.databinding.b1 b1Var6 = this.q;
        if (b1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var6 = null;
        }
        b1Var6.V.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReaderMenuSettingFragment.z3(this.a, view2);
            }
        });
        com.zentraedi.outreader.databinding.b1 b1Var7 = this.q;
        if (b1Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var7 = null;
        }
        b1Var7.T.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.fragment.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReaderMenuSettingFragment.A3(this.a, view2);
            }
        });
        BookModel bookModelM2 = Z2().M();
        if (bookModelM2 == null || !bookModelM2.isPdf()) {
            c3();
            m3();
            i3();
            q3();
            return;
        }
        com.zentraedi.outreader.databinding.b1 b1Var8 = this.q;
        if (b1Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var8 = null;
        }
        LinearLayout llFont = b1Var8.I;
        Intrinsics.checkNotNullExpressionValue(llFont, "llFont");
        llFont.setVisibility(8);
        com.zentraedi.outreader.databinding.b1 b1Var9 = this.q;
        if (b1Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var9 = null;
        }
        FrameLayout layoutFontSize = b1Var9.E;
        Intrinsics.checkNotNullExpressionValue(layoutFontSize, "layoutFontSize");
        layoutFontSize.setVisibility(8);
        com.zentraedi.outreader.databinding.b1 b1Var10 = this.q;
        if (b1Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var10 = null;
        }
        FrameLayout layoutPageMargin = b1Var10.G;
        Intrinsics.checkNotNullExpressionValue(layoutPageMargin, "layoutPageMargin");
        layoutPageMargin.setVisibility(8);
        com.zentraedi.outreader.databinding.b1 b1Var11 = this.q;
        if (b1Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            b1Var11 = null;
        }
        FrameLayout layoutLineSpace = b1Var11.F;
        Intrinsics.checkNotNullExpressionValue(layoutLineSpace, "layoutLineSpace");
        layoutLineSpace.setVisibility(8);
        com.zentraedi.outreader.databinding.b1 b1Var12 = this.q;
        if (b1Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            b1Var2 = b1Var12;
        }
        FrameLayout layoutParagraphSpace = b1Var2.H;
        Intrinsics.checkNotNullExpressionValue(layoutParagraphSpace, "layoutParagraphSpace");
        layoutParagraphSpace.setVisibility(8);
    }
}
