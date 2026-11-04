package com.zentraedi.outreader.v2.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.e1;
import androidx.lifecycle.m2;
import com.zentraedi.basic.function.utils.m0;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.l0;
import com.zentraedi.business.message.event.BaseMessageEvent;
import com.zentraedi.business.model.CourseFileInfoModel;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.model.LocalFileModel;
import com.zentraedi.business.task.TaskFileData;
import com.zentraedi.business.task.event.FileDownloadFailEvent;
import com.zentraedi.business.task.event.FileDownloadProgressEvent;
import com.zentraedi.business.utils.l5;
import com.zentraedi.business.utils.t7;
import com.zentraedi.outreader.activity.ZReaderActivity;
import com.zentraedi.outreader.event.ReadClickLeftTurnPageEvent;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.util.ReaderUtils;
import com.zentraedi.outreader.v2.fragment.p2;
import com.zentraedi.outreader.v2.fragment.t2;
import com.zspace.mobi.MobiException;
import com.zspace.mobi.MobiUtilBusiness;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.u2;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nNewZReaderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewZReaderActivity.kt\ncom/zentraedi/outreader/v2/activity/NewZReaderActivity\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,600:1\n35#2,8:601\n53#2:613\n48#3,4:609\n*S KotlinDebug\n*F\n+ 1 NewZReaderActivity.kt\ncom/zentraedi/outreader/v2/activity/NewZReaderActivity\n*L\n386#1:601,8\n386#1:613\n386#1:609,4\n*E\n"})
public final class NewZReaderActivity extends BaseActivity {

    @fo.k
    public static final a a0 = new a(null);

    @fo.l
    private com.zentraedi.outreader.util.j X;
    private boolean Y;

    @fo.k
    private final String T = "nas_book";

    @fo.k
    private final Lazy U = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.activity.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewZReaderActivity.p5(this.a);
        }
    });

    @fo.k
    private final Lazy V = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.activity.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewZReaderActivity.q5(this.a);
        }
    });

    @fo.k
    private final Lazy W = LazyKt.lazy(new Function0() { // from class: com.zentraedi.outreader.v2.activity.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewZReaderActivity.o5(this.a);
        }
    });
    private int Z = 2;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@fo.k Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) NewZReaderActivity.class));
        }

        private a() {
        }
    }

    public static final class b extends DrawerLayout.SimpleDrawerListener {
        b() {
        }

        public void onDrawerClosed(View drawerView) {
            Intrinsics.checkNotNullParameter(drawerView, "drawerView");
            NewZReaderActivity.this.X4().X().r(Boolean.FALSE);
        }

        public void onDrawerOpened(View drawerView) {
            Intrinsics.checkNotNullParameter(drawerView, "drawerView");
            NewZReaderActivity.this.X4().X().r(Boolean.TRUE);
        }
    }

    @DebugMetadata(c = "com.zentraedi.outreader.v2.activity.NewZReaderActivity$downloadConvertEpub$2", f = "NewZReaderActivity.kt", i = {0, 0, 0}, l = {249}, m = "invokeSuspend", n = {"targetPath", "epubPathByNas", "success"}, s = {"L$0", "L$1", "Z$0"}, v = 1)
    static final class c extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
        Object a;
        Object b;
        boolean c;
        int d;
        final /* synthetic */ Ref.ObjectRef<Function0<Unit>> f;

        @DebugMetadata(c = "com.zentraedi.outreader.v2.activity.NewZReaderActivity$downloadConvertEpub$2$1", f = "NewZReaderActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        static final class a extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
            int a;
            final /* synthetic */ NewZReaderActivity b;
            final /* synthetic */ boolean c;
            final /* synthetic */ String d;
            final /* synthetic */ Ref.ObjectRef<Function0<Unit>> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NewZReaderActivity newZReaderActivity, boolean z, String str, Ref.ObjectRef<Function0<Unit>> objectRef, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = newZReaderActivity;
                this.c = z;
                this.d = str;
                this.e = objectRef;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e() {
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, this.e, continuation);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [T, com.zentraedi.outreader.v2.activity.v] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                nd.a.a(this.b.T, "downloadConvertEpub success=" + this.c);
                if (this.c) {
                    FileInfoModel fileInfoModelN = this.b.X4().N();
                    Intrinsics.checkNotNull(fileInfoModelN);
                    fileInfoModelN.setLocalPath(this.d);
                    this.b.s5();
                } else {
                    this.e.element = new Function0() { // from class: com.zentraedi.outreader.v2.activity.v
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NewZReaderActivity.c.a.e();
                        }
                    };
                    this.b.R4();
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                return ((a) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ref.ObjectRef<Function0<Unit>> objectRef, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NewZReaderActivity.this.new c(this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.zentraedi.outreader.v2.local.a aVarA = com.zentraedi.outreader.v2.local.a.f.a();
                FileInfoModel fileInfoModelN = NewZReaderActivity.this.X4().N();
                Intrinsics.checkNotNull(fileInfoModelN);
                aVarA.g(fileInfoModelN, true);
                String str = NewZReaderActivity.this.T;
                StringBuilder sb = new StringBuilder();
                sb.append("downloadConvertEpub localPath=");
                FileInfoModel fileInfoModelN2 = NewZReaderActivity.this.X4().N();
                sb.append(fileInfoModelN2 != null ? fileInfoModelN2.getLocalPath() : null);
                nd.a.a(str, sb.toString());
                MobiUtilBusiness mobiUtilBusiness = MobiUtilBusiness.INSTANCE;
                String readerConvertDirPath = mobiUtilBusiness.getReaderConvertDirPath();
                FileInfoModel fileInfoModelN3 = NewZReaderActivity.this.X4().N();
                Intrinsics.checkNotNull(fileInfoModelN3);
                String localPath = fileInfoModelN3.getLocalPath();
                if (localPath == null) {
                    localPath = "";
                }
                String epubPath = mobiUtilBusiness.getEpubPath(localPath, readerConvertDirPath, true);
                nd.a.a(NewZReaderActivity.this.T, "downloadConvertEpub epubPathByNas=" + epubPath);
                FileInfoModel fileInfoModelN4 = NewZReaderActivity.this.X4().N();
                boolean zConvertToEpubByNasSync = mobiUtilBusiness.convertToEpubByNasSync(epubPath, fileInfoModelN4 != null ? fileInfoModelN4.getPath() : null);
                u2 u2VarE = g1.e();
                a aVar = new a(NewZReaderActivity.this, zConvertToEpubByNasSync, epubPath, this.f, null);
                this.a = SpillingKt.nullOutSpilledVariable(readerConvertDirPath);
                this.b = SpillingKt.nullOutSpilledVariable(epubPath);
                this.c = zConvertToEpubByNasSync;
                this.d = 1;
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
        public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
            return ((c) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt\n*L\n1#1,110:1\n43#2,11:111\n*E\n"})
    public static final class d extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 NewZReaderActivity.kt\ncom/zentraedi/outreader/v2/activity/NewZReaderActivity\n*L\n1#1,61:1\n387#2,2:62\n*E\n"})
        public static final class a implements Function0<Unit> {
            public final void a() {
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Pw1), false);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 NewZReaderActivity.kt\ncom/zentraedi/outreader/v2/activity/NewZReaderActivity\n*L\n1#1,61:1\n387#2,2:62\n*E\n"})
        public static final class b implements Function0<Unit> {
            public final void a() {
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Pw1), false);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/zentraedi/business/utils/CoroutineUtilsKt$coroutineDefaultWithMain$3$1\n+ 2 NewZReaderActivity.kt\ncom/zentraedi/outreader/v2/activity/NewZReaderActivity\n*L\n1#1,61:1\n387#2,2:62\n*E\n"})
        public static final class c implements Function0<Unit> {
            public final void a() {
                com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Pw1), false);
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

    static final class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            NewZReaderActivity.this.K4();
            NewZReaderActivity.this.M4();
        }
    }

    static final class f implements Function1<com.zentraedi.business.dialog.n, Unit> {
        public static final f a = new f();

        f() {
        }

        public final void a(com.zentraedi.business.dialog.n it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(com.zentraedi.business.dialog.n nVar) {
            a(nVar);
            return Unit.INSTANCE;
        }
    }

    static final class g implements DialogInterface.OnDismissListener {
        g() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            NewZReaderActivity.this.finish();
        }
    }

    public static final class h implements com.zentraedi.basic.component.easythread.b<String> {
        h() {
        }

        @Override // com.zentraedi.basic.component.easythread.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            String str2 = NewZReaderActivity.this.T;
            StringBuilder sb = new StringBuilder();
            sb.append("preTransferBook onSuccess  ");
            FileInfoModel fileInfoModelN = NewZReaderActivity.this.X4().N();
            sb.append(fileInfoModelN != null ? fileInfoModelN.getPath() : null);
            nd.a.a(str2, sb.toString());
            NewZReaderActivity.this.a5();
            if (NewZReaderActivity.this.X4().M() != null) {
                NewZReaderActivity newZReaderActivity = NewZReaderActivity.this;
                BookModel bookModelM = newZReaderActivity.X4().M();
                Intrinsics.checkNotNull(bookModelM);
                newZReaderActivity.r5(bookModelM.getLocalConvertPath());
            }
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable th2) {
            String localizedMessage;
            if (th2 != null) {
                th2.printStackTrace();
                localizedMessage = th2.getLocalizedMessage();
            } else {
                localizedMessage = "Unknown";
            }
            String str = NewZReaderActivity.this.T;
            StringBuilder sb = new StringBuilder();
            sb.append("preTransferBook errorMsg=");
            sb.append(localizedMessage);
            sb.append("  ");
            FileInfoModel fileInfoModelN = NewZReaderActivity.this.X4().N();
            sb.append(fileInfoModelN != null ? fileInfoModelN.getPath() : null);
            nd.a.c(str, sb.toString());
            NewZReaderActivity.this.finish();
            if (th2 instanceof MobiException) {
                com.zentraedi.basic.function.ui.toast.a.w(((MobiException) th2).getMessage(), false);
                return;
            }
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.JB2) + localizedMessage, false);
        }
    }

    static final class i implements e1, FunctionAdapter {
        private final /* synthetic */ Function1 a;

        i(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        public final boolean equals(@fo.l Object obj) {
            if ((obj instanceof e1) && (obj instanceof FunctionAdapter)) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N4(NewZReaderActivity newZReaderActivity, Boolean bool) {
        if (bool.booleanValue()) {
            newZReaderActivity.e5();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O4(NewZReaderActivity newZReaderActivity, Boolean bool) {
        if (bool.booleanValue()) {
            newZReaderActivity.W4().K.open();
            newZReaderActivity.X4().S().r(Boolean.FALSE);
        } else {
            newZReaderActivity.W4().K.close();
            Object objF = newZReaderActivity.X4().R().f();
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(objF, bool2)) {
                newZReaderActivity.X4().S().r(bool2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P4(NewZReaderActivity newZReaderActivity) {
        int measuredWidth;
        int iB;
        ViewGroup.LayoutParams layoutParams = newZReaderActivity.W4().G.getLayoutParams();
        if (newZReaderActivity.U3()) {
            measuredWidth = Math.min(newZReaderActivity.W4().getRoot().getMeasuredWidth(), newZReaderActivity.W4().getRoot().getMeasuredHeight());
            iB = m0.b(32.0f);
        } else {
            measuredWidth = newZReaderActivity.W4().getRoot().getMeasuredWidth();
            iB = m0.b(32.0f);
        }
        layoutParams.width = measuredWidth - iB;
        newZReaderActivity.T4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void Q4(NewZReaderActivity newZReaderActivity, View view) {
        newZReaderActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R4() {
        String str = this.T;
        StringBuilder sb = new StringBuilder();
        sb.append("downloadBook ");
        FileInfoModel fileInfoModelN = X4().N();
        sb.append(fileInfoModelN != null ? fileInfoModelN.getPath() : null);
        nd.a.a(str, sb.toString());
        this.Y = false;
        com.zentraedi.outreader.v2.local.a aVarA = com.zentraedi.outreader.v2.local.a.f.a();
        FileInfoModel fileInfoModelN2 = X4().N();
        Intrinsics.checkNotNull(fileInfoModelN2);
        aVarA.f(fileInfoModelN2, true, new gd.a() { // from class: com.zentraedi.outreader.v2.activity.m
            @Override // gd.a
            public final void complete(int i2) {
                NewZReaderActivity.S4(this.a, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void S4(NewZReaderActivity newZReaderActivity, int i2) {
        nd.a.a(newZReaderActivity.T, "downloadBook result = " + i2);
        if (newZReaderActivity.isFinishing() || newZReaderActivity.isDestroyed()) {
            String str = newZReaderActivity.T;
            StringBuilder sb = new StringBuilder();
            sb.append("downloadBook 页面已关闭  ");
            FileInfoModel fileInfoModelN = newZReaderActivity.X4().N();
            sb.append(fileInfoModelN != null ? fileInfoModelN.getPath() : null);
            nd.a.a(str, sb.toString());
            return;
        }
        if (i2 == 0) {
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Iy1));
            return;
        }
        if (i2 == 1) {
            newZReaderActivity.W4().M.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.A74));
            newZReaderActivity.w3();
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return;
            }
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.Iy1));
        } else {
            if (!(newZReaderActivity.X4().N() instanceof CourseFileInfoModel) && !(newZReaderActivity.X4().N() instanceof LocalFileModel)) {
                FileInfoModel fileInfoModelN2 = newZReaderActivity.X4().N();
                Intrinsics.checkNotNull(fileInfoModelN2);
                fileInfoModelN2.setLocalPath(com.zentraedi.business.reader.c.f(newZReaderActivity.X4().N()));
            }
            newZReaderActivity.s5();
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [T, com.zentraedi.outreader.v2.activity.p] */
    private final void T4() {
        if (X4().N() == null) {
            return;
        }
        String str = this.T;
        StringBuilder sb = new StringBuilder();
        sb.append("downloadConvertEpub ");
        FileInfoModel fileInfoModelN = X4().N();
        sb.append(fileInfoModelN != null ? fileInfoModelN.getPath() : null);
        nd.a.a(str, sb.toString());
        MobiUtilBusiness mobiUtilBusiness = MobiUtilBusiness.INSTANCE;
        FileInfoModel fileInfoModelN2 = X4().N();
        Intrinsics.checkNotNull(fileInfoModelN2);
        if (!mobiUtilBusiness.isMobi(fileInfoModelN2.getPath())) {
            R4();
            return;
        }
        W4().M.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.bE2));
        W4().L.setText("");
        w3();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new Function0() { // from class: com.zentraedi.outreader.v2.activity.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewZReaderActivity.U4(this.a);
            }
        };
        pe.i.v(this, 5000L, new Function1() { // from class: com.zentraedi.outreader.v2.activity.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewZReaderActivity.V4(objectRef, (NewZReaderActivity) obj);
            }
        });
        kotlinx.coroutines.i.e(r0.a(g1.c()), (CoroutineContext) null, (CoroutineStart) null, new c(objectRef, null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U4(NewZReaderActivity newZReaderActivity) {
        newZReaderActivity.W4().L.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.UC2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V4(Ref.ObjectRef objectRef, NewZReaderActivity ktxRunOnUiDelay) {
        Intrinsics.checkNotNullParameter(ktxRunOnUiDelay, "$this$ktxRunOnUiDelay");
        ((Function0) objectRef.element).invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x008b  */
    /* JADX WARN: Code duplicated, block: B:16:0x00ac  */
    public final void a5() {
        String book_id;
        BookModel bookModelM;
        com.zentraedi.outreader.viewmodel.d dVarX4 = X4();
        com.zentraedi.outreader.v2.local.a.C0157a c0157a = com.zentraedi.outreader.v2.local.a.f;
        dVarX4.j0(c0157a.a().i());
        BookModel bookModelK = c0157a.a().k();
        if (X4().M() == null) {
            X4().j0(bookModelK);
        } else if (bookModelK != null && !TextUtils.isEmpty(bookModelK.getBook_id())) {
            BookModel bookModelM2 = X4().M();
            Intrinsics.checkNotNull(bookModelM2);
            if (TextUtils.isEmpty(bookModelM2.getBook_id())) {
                BookModel bookModelM3 = X4().M();
                Intrinsics.checkNotNull(bookModelM3);
                bookModelK.setLocalPath(bookModelM3.getLocalPath());
                BookModel bookModelM4 = X4().M();
                Intrinsics.checkNotNull(bookModelM4);
                bookModelK.setCover(bookModelM4.getCover());
                BookModel bookModelM5 = X4().M();
                Intrinsics.checkNotNull(bookModelM5);
                bookModelK.setLocalConvertPath(bookModelM5.getLocalConvertPath());
                X4().j0(bookModelK);
            } else if (bookModelK != null) {
                book_id = bookModelK.getBook_id();
                bookModelM = X4().M();
                Intrinsics.checkNotNull(bookModelM);
                if (Intrinsics.areEqual(book_id, bookModelM.getBook_id())) {
                    BookModel bookModelM6 = X4().M();
                    Intrinsics.checkNotNull(bookModelM6);
                    bookModelK.setLocalPath(bookModelM6.getLocalPath());
                    BookModel bookModelM7 = X4().M();
                    Intrinsics.checkNotNull(bookModelM7);
                    bookModelK.setCover(bookModelM7.getCover());
                    BookModel bookModelM8 = X4().M();
                    Intrinsics.checkNotNull(bookModelM8);
                    bookModelK.setLocalConvertPath(bookModelM8.getLocalConvertPath());
                    X4().j0(bookModelK);
                }
            }
        } else if (bookModelK != null && bookModelK.getBook_id() != null) {
            book_id = bookModelK.getBook_id();
            bookModelM = X4().M();
            Intrinsics.checkNotNull(bookModelM);
            if (Intrinsics.areEqual(book_id, bookModelM.getBook_id())) {
                BookModel bookModelM9 = X4().M();
                Intrinsics.checkNotNull(bookModelM9);
                bookModelK.setLocalPath(bookModelM9.getLocalPath());
                BookModel bookModelM10 = X4().M();
                Intrinsics.checkNotNull(bookModelM10);
                bookModelK.setCover(bookModelM10.getCover());
                BookModel bookModelM11 = X4().M();
                Intrinsics.checkNotNull(bookModelM11);
                bookModelK.setLocalConvertPath(bookModelM11.getLocalConvertPath());
                X4().j0(bookModelK);
            }
        }
        X4().c0(new Function1() { // from class: com.zentraedi.outreader.v2.activity.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewZReaderActivity.b5((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b5(List list) {
        return Unit.INSTANCE;
    }

    private final void c5(TaskFileData taskFileData) {
        if (taskFileData == null) {
            return;
        }
        if (!Intrinsics.areEqual("200", taskFileData.getErrorCode())) {
            HashMap map = new HashMap();
            map.put("fail", taskFileData.getErrorCode());
            map.put("reason", taskFileData.getErrorMessage());
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.m.f(com.zentraedi.outreader.d.q.EC2, map), false);
            return;
        }
        if (taskFileData.getFileSize() == 0 || TextUtils.isEmpty(taskFileData.getFileId())) {
            return;
        }
        long completeSize = (taskFileData.getCompleteSize() * ((long) 100)) / taskFileData.getFileSize();
        nd.a.a(this.T, "handleDownloadTask progress = " + completeSize);
        W4().M.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.A74) + completeSize + '%');
        W4().L.setText(l5.R(taskFileData.getCompleteSize()) + " / " + l5.R(taskFileData.getFileSize()));
        w3();
        if (completeSize == 100) {
            FileInfoModel fileInfoModelN = X4().N();
            if (fileInfoModelN != null) {
                fileInfoModelN.setLocalPath(taskFileData.getTargetPath());
            }
            s5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g5(NewZReaderActivity newZReaderActivity) {
        pe.i.q(newZReaderActivity, new Function1() { // from class: com.zentraedi.outreader.v2.activity.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewZReaderActivity.h5((NewZReaderActivity) obj);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h5(NewZReaderActivity ktxRunOnUi) {
        Intrinsics.checkNotNullParameter(ktxRunOnUi, "$this$ktxRunOnUi");
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = ktxRunOnUi.X4().M();
        if (aVar.a(bookModelM != null ? bookModelM.getBookFileType() : null) != 2) {
            ktxRunOnUi.X4().Y().v();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i5(NewZReaderActivity newZReaderActivity) {
        pe.i.q(newZReaderActivity, new Function1() { // from class: com.zentraedi.outreader.v2.activity.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewZReaderActivity.j5((NewZReaderActivity) obj);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j5(NewZReaderActivity ktxRunOnUi) {
        Intrinsics.checkNotNullParameter(ktxRunOnUi, "$this$ktxRunOnUi");
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModelM = ktxRunOnUi.X4().M();
        if (aVar.a(bookModelM != null ? bookModelM.getBookFileType() : null) == 2) {
            Integer num = (Integer) ktxRunOnUi.X4().L().f();
            ktxRunOnUi.X4().Y().y(com.zentraedi.outreader.util.f.a(num != null ? num.intValue() : 0));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k5(NewZReaderActivity newZReaderActivity, com.zentraedi.outreader.util.b bVar, com.zentraedi.outreader.util.b bVar2, Boolean bool) {
        if (bool.booleanValue()) {
            Integer num = (Integer) newZReaderActivity.X4().L().f();
            bVar.e(com.zentraedi.outreader.util.f.b(num != null ? num.intValue() : 0));
            bVar2.e(40L);
        } else {
            bVar.f();
            bVar2.f();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l5(NewZReaderActivity newZReaderActivity, Boolean bool) {
        newZReaderActivity.X4().S().r(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m5(com.zentraedi.outreader.util.b bVar, Integer num) {
        Intrinsics.checkNotNull(num);
        bVar.g(com.zentraedi.outreader.util.f.b(num.intValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n5(NewZReaderActivity newZReaderActivity, Integer num) {
        Integer num2 = (Integer) newZReaderActivity.X4().U().f();
        if ((num2 != null ? num2.intValue() : 0) > 1) {
            com.zentraedi.outreader.v2.local.a.C0157a c0157a = com.zentraedi.outreader.v2.local.a.f;
            c0157a.a().o(newZReaderActivity.X4().M());
            c0157a.a().m(newZReaderActivity.X4().M(), true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final com.zentraedi.outreader.databinding.a o5(NewZReaderActivity newZReaderActivity) {
        return (com.zentraedi.outreader.databinding.a) androidx.databinding.m.l(newZReaderActivity, com.zentraedi.outreader.d.l.o0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.d p5(NewZReaderActivity newZReaderActivity) {
        return new m2(newZReaderActivity).c(com.zentraedi.outreader.viewmodel.d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.outreader.viewmodel.f q5(NewZReaderActivity newZReaderActivity) {
        return new m2(newZReaderActivity).c(com.zentraedi.outreader.viewmodel.f.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.zentraedi.outreader.v2.activity.r] */
    public final void s5() {
        String str = this.T;
        StringBuilder sb = new StringBuilder();
        sb.append("preTransferBook  ");
        FileInfoModel fileInfoModelN = X4().N();
        sb.append(fileInfoModelN != null ? fileInfoModelN.getPath() : null);
        nd.a.a(str, sb.toString());
        if (isFinishing() || isDestroyed()) {
            String str2 = this.T;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("preTransferBook 页面已关闭  ");
            FileInfoModel fileInfoModelN2 = X4().N();
            sb2.append(fileInfoModelN2 != null ? fileInfoModelN2.getPath() : null);
            nd.a.a(str2, sb2.toString());
            return;
        }
        w3();
        W4().M.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.bE2));
        W4().L.setText("");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new Function0() { // from class: com.zentraedi.outreader.v2.activity.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewZReaderActivity.t5(this.a);
            }
        };
        pe.i.v(this, 5000L, new Function1() { // from class: com.zentraedi.outreader.v2.activity.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewZReaderActivity.u5(objectRef, (NewZReaderActivity) obj);
            }
        });
        com.zentraedi.outreader.v2.local.a aVarA = com.zentraedi.outreader.v2.local.a.f.a();
        FileInfoModel fileInfoModelN3 = X4().N();
        Intrinsics.checkNotNull(fileInfoModelN3);
        aVarA.v(this, fileInfoModelN3, new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t5(NewZReaderActivity newZReaderActivity) {
        newZReaderActivity.W4().L.setText(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.UC2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u5(Ref.ObjectRef objectRef, NewZReaderActivity ktxRunOnUiDelay) {
        Intrinsics.checkNotNullParameter(ktxRunOnUiDelay, "$this$ktxRunOnUiDelay");
        ((Function0) objectRef.element).invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K4() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        I2().w().C(W4().F.getId(), p2.A.a()).t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L4() {
        Fragment fragmentQ;
        if (isFinishing() || isDestroyed() || (fragmentQ = X4().Y().q()) == null) {
            return;
        }
        I2().w().C(W4().E.getId(), fragmentQ).q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M4() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        I2().w().C(W4().G.getId(), t2.t.a()).t();
    }

    @fo.k
    public final com.zentraedi.outreader.databinding.a W4() {
        Object value = this.W.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (com.zentraedi.outreader.databinding.a) value;
    }

    @fo.k
    public final com.zentraedi.outreader.viewmodel.d X4() {
        return (com.zentraedi.outreader.viewmodel.d) this.U.getValue();
    }

    public boolean Y3() {
        Object objD = t7.d(gh.b.A, Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(objD, "get(...)");
        return ((Boolean) objD).booleanValue();
    }

    @fo.k
    public final com.zentraedi.outreader.viewmodel.f Y4() {
        return (com.zentraedi.outreader.viewmodel.f) this.V.getValue();
    }

    @fo.l
    public final com.zentraedi.outreader.util.j Z4() {
        return this.X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d5(@fo.l Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            X4().k0((FileInfoModel) intent.getSerializableExtra(ZReaderActivity.A6));
            X4().l0(intent.getStringExtra(ZReaderActivity.B6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(@fo.k MotionEvent ev) {
        com.zentraedi.outreader.util.j jVar;
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getAction() == 0 && (jVar = this.X) != null) {
            jVar.j();
        }
        return super/*android.app.Activity*/.dispatchTouchEvent(ev);
    }

    public final void e5() {
        W4().J.setVisibility(8);
        W4().H.setVisibility(8);
    }

    public final void f5() {
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        final com.zentraedi.outreader.util.b bVar = new com.zentraedi.outreader.util.b(lifecycle);
        bVar.d(new Function0() { // from class: com.zentraedi.outreader.v2.activity.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(NewZReaderActivity.g5(this.a));
            }
        });
        Lifecycle lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
        final com.zentraedi.outreader.util.b bVar2 = new com.zentraedi.outreader.util.b(lifecycle2);
        bVar2.d(new Function0() { // from class: com.zentraedi.outreader.v2.activity.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(NewZReaderActivity.i5(this.a));
            }
        });
        X4().S().k(this, new i(new Function1() { // from class: com.zentraedi.outreader.v2.activity.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewZReaderActivity.k5(this.a, bVar, bVar2, (Boolean) obj);
            }
        }));
        X4().R().k(this, new i(new Function1() { // from class: com.zentraedi.outreader.v2.activity.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewZReaderActivity.l5(this.a, (Boolean) obj);
            }
        }));
        X4().L().k(this, new i(new Function1() { // from class: com.zentraedi.outreader.v2.activity.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewZReaderActivity.m5(bVar, (Integer) obj);
            }
        }));
        X4().U().k(this, new i(new Function1() { // from class: com.zentraedi.outreader.v2.activity.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewZReaderActivity.n5(this.a, (Integer) obj);
            }
        }));
    }

    public void onConfigurationChanged(@fo.k Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i2 = newConfig.uiMode;
        int i3 = i2 & 15;
        int i4 = i2 & 48;
        nd.a.e("nas_book", "NewZReaderActivity->onConfigurationChanged type=" + i3 + " nightMode=" + i4 + " bookLoadingCompleted=" + this.Y);
        if (this.Y) {
            if (i4 == 16) {
                M4();
                K4();
            } else {
                if (i4 != 32) {
                    return;
                }
                M4();
                K4();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(@fo.l Bundle bundle) {
        this.Z = Y2().x();
        boolean zY3 = Y3();
        nd.a.e("nas_book", "NewZReaderActivity->onCreate darkStyle=" + zY3 + " backupNightMode=" + this.Z);
        if (zY3) {
            Y2().d0(2);
        } else {
            Y2().d0(1);
        }
        boolean z = rd.a.b().a() == 0;
        super.onCreate((Bundle) null);
        if (bundle == null && !z) {
            d5(bundle);
            Y4().V();
            return;
        }
        nd.a.h(this.T, "onCreate 禁止恢复阅读器状态 isAppForceKilled=" + z);
        if (!z) {
            l0.g().O0(this);
        }
        finish();
    }

    protected void onDestroy() {
        nd.a.e("nas_book", "NewZReaderActivity->onDestroy backupNightMode=" + this.Z);
        Y2().d0(this.Z);
        super.onDestroy();
        X4().Y().onDestroy();
        com.zentraedi.outreader.v2.local.a.C0157a c0157a = com.zentraedi.outreader.v2.local.a.f;
        c0157a.a().o(X4().M());
        c0157a.a().m(X4().M(), true);
        c0157a.a().e();
        c0157a.a().t(null);
        org.greenrobot.eventbus.c.f().A(this);
    }

    public boolean onKeyDown(int i2, @fo.l KeyEvent keyEvent) {
        Integer num;
        Integer num2;
        if (i2 == 24 && (num2 = (Integer) t7.d(gh.b.S, 1)) != null && num2.intValue() == 1) {
            X4().Y().u();
            return true;
        }
        if (i2 != 25 || (num = (Integer) t7.d(gh.b.S, 1)) == null || num.intValue() != 1) {
            return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i2, keyEvent);
        }
        X4().Y().v();
        return true;
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@fo.k BaseMessageEvent event) {
        TaskFileData fileData;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof FileDownloadProgressEvent;
        if ((!z && !(event instanceof FileDownloadFailEvent)) || (X4().N() instanceof CourseFileInfoModel) || (X4().N() instanceof LocalFileModel)) {
            return;
        }
        String strF = com.zentraedi.business.reader.c.f(X4().N());
        nd.a.a(this.T, "onMessageEvent targetPath = " + strF);
        if (z) {
            fileData = ((FileDownloadProgressEvent) event).mBaseTask.getFileData();
            Intrinsics.checkNotNullExpressionValue(fileData, "getFileData(...)");
        } else {
            if (!(event instanceof FileDownloadFailEvent)) {
                return;
            }
            fileData = ((FileDownloadFailEvent) event).mBaseTask.getFileData();
            Intrinsics.checkNotNullExpressionValue(fileData, "getFileData(...)");
        }
        nd.a.a(this.T, "onMessageEvent taskFileData = " + fileData);
        if (TextUtils.isEmpty(fileData.getTargetPath()) || !Intrinsics.areEqual(fileData.getTargetPath(), strF)) {
            return;
        }
        c5(fileData);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onReadClickLeftTurnPageEvent(@fo.k ReadClickLeftTurnPageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        com.zentraedi.reader.i iVarY = X4().Y();
        com.zentraedi.outreader.reader.c cVar = iVarY instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVarY : null;
        if (cVar != null) {
            cVar.c(event.getLeftClick());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onResume() {
        super.onResume();
        ReaderUtils.a aVar = ReaderUtils.a;
        if (aVar.n()) {
            com.zentraedi.basic.function.utils.b.E(this);
        } else {
            com.zentraedi.basic.function.utils.b.k(this);
        }
        com.zentraedi.basic.function.utils.b.C(this, aVar.y());
        if (Y3()) {
            com.zentraedi.basic.function.utils.b.A(this, false);
        } else {
            com.zentraedi.basic.function.utils.b.A(this, true);
        }
    }

    protected void r3() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r5(@fo.k String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        nd.a.a(this.T, "openBookFile path =" + path);
        w3();
        if (X4().M() == null) {
            return;
        }
        nd.a.a(this.T, "openBookFile " + X4().M());
        BookModel bookModelM = X4().M();
        if (bookModelM == null || !bookModelM.isEpub()) {
            BookModel bookModelM2 = X4().M();
            if (bookModelM2 == null || !bookModelM2.isPdf()) {
                BookModel bookModelM3 = X4().M();
                if (bookModelM3 != null && bookModelM3.isTxt()) {
                    X4().b0(new com.zentraedi.outreader.reader.g());
                }
            } else {
                com.zentraedi.outreader.viewmodel.d dVarX4 = X4();
                com.zentraedi.outreader.reader.e eVar = new com.zentraedi.outreader.reader.e();
                String strH = com.zentraedi.business.reader.c.h();
                Intrinsics.checkNotNullExpressionValue(strH, "getBookPreviewImageCachePath(...)");
                eVar.R(strH);
                String strI = com.zentraedi.business.reader.c.i();
                Intrinsics.checkNotNullExpressionValue(strI, "getBookReadImageCachePath(...)");
                eVar.S(strI);
                dVarX4.b0(eVar);
            }
        } else {
            X4().b0(new com.zentraedi.outreader.reader.b());
        }
        com.zentraedi.outreader.reader.h hVarY = X4().Y();
        com.zentraedi.outreader.reader.d dVar = hVarY instanceof com.zentraedi.outreader.reader.d ? (com.zentraedi.outreader.reader.d) hVarY : null;
        if (dVar != null) {
            dVar.L(X4().M());
        }
        X4().Z(this);
        nd.a.a("CoroutineScope", "->coroutineDefaultWithMain() " + NewZReaderActivity.class + ' ' + Thread.currentThread().getName());
        kotlinx.coroutines.i.e(r0.a(g1.a().plus(new d(CoroutineExceptionHandler.F2))), (CoroutineContext) null, (CoroutineStart) null, new NewZReaderActivity$openBookFile$$inlined$coroutineDefaultWithMain$2(this, NewZReaderActivity.class, null, path, this, path), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void s3() {
        org.greenrobot.eventbus.c.f().v(this);
        X4().T().r(Boolean.valueOf(Y3()));
        X4().V().k(this, new i(new Function1() { // from class: com.zentraedi.outreader.v2.activity.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewZReaderActivity.N4(this.a, (Boolean) obj);
            }
        }));
        X4().X().k(this, new i(new Function1() { // from class: com.zentraedi.outreader.v2.activity.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewZReaderActivity.O4(this.a, (Boolean) obj);
            }
        }));
        W4().K.addDrawerListener(new b());
        W4().getRoot().post(new Runnable() { // from class: com.zentraedi.outreader.v2.activity.n
            @Override // java.lang.Runnable
            public final void run() {
                NewZReaderActivity.P4(this.a);
            }
        });
        com.zentraedi.outreader.util.j jVarA = com.zentraedi.outreader.util.j.f.a();
        this.X = jVarA;
        if (jVarA != null) {
            Lifecycle lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            jVarA.f(this, lifecycle);
        }
        f5();
        W4().H.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.v2.activity.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewZReaderActivity.Q4(this.a, view);
            }
        });
    }

    public final void v5(@fo.l com.zentraedi.outreader.util.j jVar) {
        this.X = jVar;
    }

    public void w3() {
        W4().J.setVisibility(0);
        W4().H.setVisibility(0);
    }
}
