package com.zentraedi.outreader.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.m2;
import com.litao.slider.NiftySlider;
import com.zentraedi.filemanage.activity.be;
import com.zentraedi.filemanage.activity.ce;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.util.ReaderUtils;
import com.zentraedi.outreader.v2.fragment.p2;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.r0;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SuppressLint({"WrongConstant"})
@SourceDebugExtension({"SMAP\nMoreMarginDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoreMarginDialog.kt\ncom/zentraedi/outreader/dialog/MoreMarginDialog\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n35#2,8:244\n53#2:256\n35#2,8:257\n53#2:269\n35#2,8:270\n53#2:282\n48#3,4:252\n48#3,4:265\n48#3,4:278\n295#4,2:283\n*S KotlinDebug\n*F\n+ 1 MoreMarginDialog.kt\ncom/zentraedi/outreader/dialog/MoreMarginDialog\n*L\n209#1:244,8\n209#1:256\n222#1:257,8\n222#1:269\n235#1:270,8\n235#1:282\n209#1:252,4\n222#1:265,4\n235#1:278,4\n121#1:283,2\n*E\n"})
public final class MoreMarginDialog {

    @fo.k
    private final FragmentActivity a;

    @fo.k
    private final com.zentraedi.outreader.databinding.c0 b;

    @fo.k
    private final Lazy c;

    @fo.k
    private final Lazy d;

    @fo.k
    private final Lazy e;

    @fo.k
    private Function1<? super Boolean, Unit> f;

    @fo.l
    private k2 g;

    @fo.l
    private k2 h;

    @fo.l
    private k2 i;

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: com.zentraedi.outreader.dialog.MoreMarginDialog$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 MoreMarginDialog.kt\ncom/zentraedi/outreader/dialog/MoreMarginDialog\n*L\n1#1,61:1\n209#2:62\n*E\n"})
        public static final class C0138a implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 MoreMarginDialog.kt\ncom/zentraedi/outreader/dialog/MoreMarginDialog\n*L\n1#1,61:1\n209#2:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 MoreMarginDialog.kt\ncom/zentraedi/outreader/dialog/MoreMarginDialog\n*L\n1#1,61:1\n209#2:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        public a(CoroutineExceptionHandler.b bVar) {
            super(bVar);
        }

        public void handleException(@fo.k CoroutineContext coroutineContext, @fo.k Throwable th2) {
            try {
                nd.a.h("CoroutineScope", "throwable->coroutineDefaultWithMain() throwable=" + Log.getStackTraceString(th2));
                th2.printStackTrace();
                pe.i.r(new C0138a());
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
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 MoreMarginDialog.kt\ncom/zentraedi/outreader/dialog/MoreMarginDialog\n*L\n1#1,61:1\n235#2:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.outreader.dialog.MoreMarginDialog$b$b, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 MoreMarginDialog.kt\ncom/zentraedi/outreader/dialog/MoreMarginDialog\n*L\n1#1,61:1\n235#2:62\n*E\n"})
        public static final class C0139b implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 MoreMarginDialog.kt\ncom/zentraedi/outreader/dialog/MoreMarginDialog\n*L\n1#1,61:1\n235#2:62\n*E\n"})
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
                    pe.i.r(new C0139b());
                } catch (Throwable th4) {
                    pe.i.r(new c());
                    throw th4;
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 MoreMarginDialog.kt\ncom/zentraedi/outreader/dialog/MoreMarginDialog\n*L\n1#1,61:1\n222#2:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 MoreMarginDialog.kt\ncom/zentraedi/outreader/dialog/MoreMarginDialog\n*L\n1#1,61:1\n222#2:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            public final void a() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.outreader.dialog.MoreMarginDialog$c$c, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 MoreMarginDialog.kt\ncom/zentraedi/outreader/dialog/MoreMarginDialog\n*L\n1#1,61:1\n222#2:62\n*E\n"})
        public static final class C0140c implements Function0<Unit> {
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
                    pe.i.r(new C0140c());
                    throw th4;
                }
            }
        }
    }

    public MoreMarginDialog(@fo.k FragmentActivity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.c = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.dialog.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MoreMarginDialog.J(this.a);
            }
        });
        this.d = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.dialog.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MoreMarginDialog.K(this.a);
            }
        });
        this.e = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.dialog.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MoreMarginDialog.W(this.a);
            }
        });
        androidx.databinding.c0 c0VarJ = androidx.databinding.m.j(LayoutInflater.from(context), com.zentraedi.outreader.d.l.Fa, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        this.b = (com.zentraedi.outreader.databinding.c0) c0VarJ;
        this.f = new Function1() { // from class: com.zentraedi.outreader.dialog.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoreMarginDialog.L(((Boolean) obj).booleanValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(MoreMarginDialog moreMarginDialog, NiftySlider it) {
        Object next;
        Intrinsics.checkNotNullParameter(it, "it");
        moreMarginDialog.u().P().set(false);
        moreMarginDialog.u().M().set(false);
        moreMarginDialog.b.G.setAlpha(1.0f);
        List listN0 = moreMarginDialog.a.I2().N0();
        Intrinsics.checkNotNullExpressionValue(listN0, "getFragments(...)");
        Iterator it2 = listN0.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(((Fragment) next) instanceof p2));
        Fragment fragment = (Fragment) next;
        p2 p2Var = fragment instanceof p2 ? (p2) fragment : null;
        if (p2Var != null) {
            p2Var.T3();
        }
        return Unit.INSTANCE;
    }

    private final void B() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = t().M();
        ReaderUtils.PageMargin pageMarginS = aVar.s(bookModelM != null ? bookModelM.getBookFileType() : null);
        StringBuilder sb = new StringBuilder();
        sb.append("ReaderMenuSettingFragment->initPageMarginView nasFileName=");
        BookModel bookModelM2 = t().M();
        sb.append(bookModelM2 != null ? bookModelM2.getNasFileName() : null);
        sb.append(" pageMargin=");
        sb.append(pageMarginS);
        nd.a.e("nas_book", sb.toString());
        this.b.K.j0(aVar.t().indexOf(pageMarginS), false);
        this.b.K.J0(new Function3() { // from class: com.zentraedi.outreader.dialog.k
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MoreMarginDialog.C(this.a, (NiftySlider) obj, ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        });
        this.b.K.L0(new Function1() { // from class: com.zentraedi.outreader.dialog.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoreMarginDialog.D((NiftySlider) obj);
            }
        });
        this.b.K.M0(new Function1() { // from class: com.zentraedi.outreader.dialog.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoreMarginDialog.E(this.a, (NiftySlider) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(MoreMarginDialog moreMarginDialog, NiftySlider slider, int i, boolean z) {
        Intrinsics.checkNotNullParameter(slider, "slider");
        moreMarginDialog.V(moreMarginDialog.w());
        ReaderUtils.a aVar = ReaderUtils.a;
        ReaderUtils.PageMargin pageMarginQ = (ReaderUtils.PageMargin) CollectionsKt.getOrNull(aVar.t(), i);
        if (pageMarginQ == null) {
            pageMarginQ = aVar.q();
        }
        moreMarginDialog.O(pageMarginQ);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(NiftySlider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(MoreMarginDialog moreMarginDialog, NiftySlider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        moreMarginDialog.u().P().set(false);
        moreMarginDialog.u().N().set(false);
        moreMarginDialog.b.H.setAlpha(1.0f);
        return Unit.INSTANCE;
    }

    private final void F() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = t().M();
        ReaderUtils.ParagraphSpace paragraphSpaceX = aVar.x(bookModelM != null ? bookModelM.getBookFileType() : null);
        StringBuilder sb = new StringBuilder();
        sb.append("ReaderMenuSettingFragment->initParagraphSpaceView nasFileName=");
        BookModel bookModelM2 = t().M();
        sb.append(bookModelM2 != null ? bookModelM2.getNasFileName() : null);
        sb.append(" paragraphSpace=");
        sb.append(paragraphSpaceX);
        nd.a.e("nas_book", sb.toString());
        this.b.L.j0(aVar.w().indexOf(paragraphSpaceX), false);
        this.b.L.J0(new Function3() { // from class: com.zentraedi.outreader.dialog.n
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MoreMarginDialog.G(this.a, (NiftySlider) obj, ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        });
        this.b.L.L0(new Function1() { // from class: com.zentraedi.outreader.dialog.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoreMarginDialog.H((NiftySlider) obj);
            }
        });
        this.b.L.M0(new Function1() { // from class: com.zentraedi.outreader.dialog.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoreMarginDialog.I(this.a, (NiftySlider) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(MoreMarginDialog moreMarginDialog, NiftySlider slider, int i, boolean z) {
        Intrinsics.checkNotNullParameter(slider, "slider");
        moreMarginDialog.V(moreMarginDialog.w());
        ReaderUtils.a aVar = ReaderUtils.a;
        ReaderUtils.ParagraphSpace paragraphSpaceR = (ReaderUtils.ParagraphSpace) CollectionsKt.getOrNull(aVar.w(), i);
        if (paragraphSpaceR == null) {
            paragraphSpaceR = aVar.r();
        }
        moreMarginDialog.P(paragraphSpaceR);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(NiftySlider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(MoreMarginDialog moreMarginDialog, NiftySlider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        moreMarginDialog.u().P().set(false);
        moreMarginDialog.u().O().set(false);
        moreMarginDialog.b.I.setAlpha(1.0f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.d J(MoreMarginDialog moreMarginDialog) {
        return new m2(moreMarginDialog.a).c(com.zentraedi.outreader.viewmodel.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.c K(MoreMarginDialog moreMarginDialog) {
        return new m2(moreMarginDialog.a).c(com.zentraedi.outreader.viewmodel.c.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(boolean z) {
        return Unit.INSTANCE;
    }

    private final void M(ReaderUtils.LineSpace lineSpace) {
        k2 k2Var = this.g;
        if (k2Var != null) {
            k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
        }
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + MoreMarginDialog.class + ' ' + Thread.currentThread().getName());
        this.g = kotlinx.coroutines.i.e(r0.a(g1.a().plus(new a(CoroutineExceptionHandler.F2))), (CoroutineContext) null, (CoroutineStart) null, new MoreMarginDialog$setLineSpace$$inlined$coroutineDefaultWithMain$2(this, MoreMarginDialog.class, null, lineSpace, this), 3, (Object) null);
    }

    private final void O(ReaderUtils.PageMargin pageMargin) {
        k2 k2Var = this.i;
        if (k2Var != null) {
            k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
        }
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + MoreMarginDialog.class + ' ' + Thread.currentThread().getName());
        this.i = kotlinx.coroutines.i.e(r0.a(g1.a().plus(new b(CoroutineExceptionHandler.F2))), (CoroutineContext) null, (CoroutineStart) null, new MoreMarginDialog$setPageMargin$$inlined$coroutineDefaultWithMain$2(this, MoreMarginDialog.class, null, pageMargin, this), 3, (Object) null);
    }

    private final void P(ReaderUtils.ParagraphSpace paragraphSpace) {
        k2 k2Var = this.h;
        if (k2Var != null) {
            k2.a.b(k2Var, (CancellationException) null, 1, (Object) null);
        }
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + MoreMarginDialog.class + ' ' + Thread.currentThread().getName());
        this.h = kotlinx.coroutines.i.e(r0.a(g1.a().plus(new c(CoroutineExceptionHandler.F2))), (CoroutineContext) null, (CoroutineStart) null, new MoreMarginDialog$setParagraphSpace$$inlined$coroutineDefaultWithMain$2(this, MoreMarginDialog.class, null, paragraphSpace, this), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(Ref.BooleanRef booleanRef, com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        booleanRef.element = true;
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(com.zentraedi.basic.function.ui.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(MoreMarginDialog moreMarginDialog, View view) {
        ReaderUtils.a aVar = ReaderUtils.a;
        moreMarginDialog.b.J.j0(aVar.l().indexOf(aVar.k()), false);
        moreMarginDialog.b.L.j0(aVar.w().indexOf(aVar.r()), false);
        moreMarginDialog.b.K.j0(aVar.t().indexOf(aVar.q()), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(MoreMarginDialog moreMarginDialog, Ref.BooleanRef booleanRef, DialogInterface dialogInterface) {
        moreMarginDialog.f.invoke(Boolean.valueOf(booleanRef.element));
    }

    private final void V(Vibrator vibrator) {
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
    public static final Vibrator W(MoreMarginDialog moreMarginDialog) {
        Object systemService;
        Vibrator defaultVibrator;
        if (Build.VERSION.SDK_INT >= 31) {
            FragmentActivity fragmentActivity = moreMarginDialog.a;
            systemService = fragmentActivity != null ? fragmentActivity.getSystemService("vibrator_manager") : null;
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
            defaultVibrator = com.zentraedi.outreader.dialog.a.a(systemService).getDefaultVibrator();
        } else {
            FragmentActivity fragmentActivity2 = moreMarginDialog.a;
            systemService = fragmentActivity2 != null ? fragmentActivity2.getSystemService("vibrator") : null;
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            defaultVibrator = (Vibrator) systemService;
        }
        Intrinsics.checkNotNull(defaultVibrator);
        return defaultVibrator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.outreader.viewmodel.d t() {
        return (com.zentraedi.outreader.viewmodel.d) this.c.getValue();
    }

    private final com.zentraedi.outreader.viewmodel.c u() {
        return (com.zentraedi.outreader.viewmodel.c) this.d.getValue();
    }

    private final Vibrator w() {
        return (Vibrator) this.e.getValue();
    }

    private final void x() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = t().M();
        ReaderUtils.LineSpace lineSpaceM = aVar.m(bookModelM != null ? bookModelM.getBookFileType() : null);
        StringBuilder sb = new StringBuilder();
        sb.append("ReaderMenuSettingFragment->initLineSpaceView nasFileName=");
        BookModel bookModelM2 = t().M();
        sb.append(bookModelM2 != null ? bookModelM2.getNasFileName() : null);
        sb.append(" lineSpace=");
        sb.append(lineSpaceM);
        nd.a.e("nas_book", sb.toString());
        this.b.J.j0(aVar.l().indexOf(lineSpaceM), false);
        this.b.J.J0(new Function3() { // from class: com.zentraedi.outreader.dialog.d
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MoreMarginDialog.y(this.a, (NiftySlider) obj, ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        });
        this.b.J.L0(new Function1() { // from class: com.zentraedi.outreader.dialog.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoreMarginDialog.z((NiftySlider) obj);
            }
        });
        this.b.J.M0(new Function1() { // from class: com.zentraedi.outreader.dialog.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoreMarginDialog.A(this.a, (NiftySlider) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(MoreMarginDialog moreMarginDialog, NiftySlider slider, int i, boolean z) {
        Intrinsics.checkNotNullParameter(slider, "slider");
        moreMarginDialog.V(moreMarginDialog.w());
        ReaderUtils.a aVar = ReaderUtils.a;
        ReaderUtils.LineSpace lineSpaceK = (ReaderUtils.LineSpace) CollectionsKt.getOrNull(aVar.l(), i);
        if (lineSpaceK == null) {
            lineSpaceK = aVar.k();
        }
        moreMarginDialog.M(lineSpaceK);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(NiftySlider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void N(@fo.k Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f = function1;
    }

    @fo.k
    public final MoreMarginDialog Q() {
        final com.zentraedi.basic.function.ui.dialog.b bVar = new com.zentraedi.basic.function.ui.dialog.b((Context) this.a, this.b.getRoot(), com.zentraedi.outreader.d.r.Or);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.b.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.dialog.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreMarginDialog.R(booleanRef, bVar, view);
            }
        });
        this.b.F.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.dialog.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreMarginDialog.S(bVar, view);
            }
        });
        this.b.M.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.dialog.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreMarginDialog.T(this.a, view);
            }
        });
        x();
        F();
        B();
        bVar.d(80);
        bVar.setCanceledOnTouchOutside(true);
        bVar.c(com.zentraedi.outreader.d.r.Bp);
        Window window = bVar.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        bVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.zentraedi.outreader.dialog.j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                MoreMarginDialog.U(this.a, booleanRef, dialogInterface);
            }
        });
        bVar.show();
        return this;
    }

    @fo.k
    public final FragmentActivity s() {
        return this.a;
    }

    @fo.k
    public final Function1<Boolean, Unit> v() {
        return this.f;
    }
}
