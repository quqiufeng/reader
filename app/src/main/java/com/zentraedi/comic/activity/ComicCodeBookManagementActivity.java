package com.zentraedi.comic.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.zentraedi.business.activity.BaseLandscapeActivity;
import com.zentraedi.business.model.BaseBottomDialogViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicCodeBookManagementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCodeBookManagementActivity.kt\ncom/zentraedi/comic/activity/ComicCodeBookManagementActivity\n+ 2 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt\n*L\n1#1,90:1\n13#2:91\n13#2:92\n13#2:93\n*S KotlinDebug\n*F\n+ 1 ComicCodeBookManagementActivity.kt\ncom/zentraedi/comic/activity/ComicCodeBookManagementActivity\n*L\n23#1:91\n24#1:92\n26#1:93\n*E\n"})
public final class ComicCodeBookManagementActivity extends BaseLandscapeActivity {

    @fo.k
    public static final a X = new a(null);
    private com.zentraedi.comic.databinding.e V;

    @fo.k
    private final Lazy T = LazyKt.lazy(new c(this));

    @fo.k
    private final Lazy U = LazyKt.lazy(new d(this));

    @fo.k
    private final Lazy W = LazyKt.lazy(new e(this));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(@fo.k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(new Intent(activity, (Class<?>) ComicCodeBookManagementActivity.class));
        }

        private a() {
        }
    }

    public static final class b implements AppBarLayout.g {
        private int a = -1;

        b() {
        }

        public final int a() {
            return this.a;
        }

        public final void b(int i) {
            this.a = i;
        }

        public void j(AppBarLayout appBarLayout, int i) {
            Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
            if (this.a == i) {
                return;
            }
            this.a = i;
            com.zentraedi.comic.databinding.e eVar = ComicCodeBookManagementActivity.this.V;
            com.zentraedi.comic.databinding.e eVar2 = null;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                eVar = null;
            }
            float fAbs = Math.abs(i) / eVar.E.getTotalScrollRange();
            com.zentraedi.comic.databinding.e eVar3 = ComicCodeBookManagementActivity.this.V;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                eVar3 = null;
            }
            eVar3.Q.setAlpha(fAbs);
            com.zentraedi.comic.databinding.e eVar4 = ComicCodeBookManagementActivity.this.V;
            if (eVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                eVar2 = eVar4;
            }
            eVar2.N.setAlpha(1 - fAbs);
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class c implements Function0<com.zentraedi.comic.viewmodel.h0> {
        final /* synthetic */ androidx.lifecycle.r2 a;

        public c(androidx.lifecycle.r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.h0] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.zentraedi.comic.viewmodel.h0 invoke() {
            return new androidx.lifecycle.m2(this.a).c(com.zentraedi.comic.viewmodel.h0.class);
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class d implements Function0<com.zentraedi.comic.viewmodel.k0> {
        final /* synthetic */ androidx.lifecycle.r2 a;

        public d(androidx.lifecycle.r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.k0] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.zentraedi.comic.viewmodel.k0 invoke() {
            return new androidx.lifecycle.m2(this.a).c(com.zentraedi.comic.viewmodel.k0.class);
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class e implements Function0<BaseBottomDialogViewModel> {
        final /* synthetic */ androidx.lifecycle.r2 a;

        public e(androidx.lifecycle.r2 r2Var) {
            this.a = r2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseBottomDialogViewModel invoke() {
            return new androidx.lifecycle.m2(this.a).c(BaseBottomDialogViewModel.class);
        }
    }

    private final void n4() {
        com.zentraedi.comic.databinding.e eVar = this.V;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            eVar = null;
        }
        eVar.E.e(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void o4(ComicCodeBookManagementActivity comicCodeBookManagementActivity, View view) {
        comicCodeBookManagementActivity.finish();
    }

    private final BaseBottomDialogViewModel p4() {
        return (BaseBottomDialogViewModel) this.W.getValue();
    }

    private final com.zentraedi.comic.viewmodel.h0 q4() {
        return (com.zentraedi.comic.viewmodel.h0) this.T.getValue();
    }

    private final com.zentraedi.comic.viewmodel.k0 r4() {
        return (com.zentraedi.comic.viewmodel.k0) this.U.getValue();
    }

    private final void s4() {
        q4().U0();
        q4().createFilterData();
        p4().createData(q4().getMBottomDialogData());
    }

    private final void t4() {
        com.zentraedi.comic.viewmodel.h0 h0VarQ4 = q4();
        com.zentraedi.comic.databinding.e eVar = this.V;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            eVar = null;
        }
        RecyclerView contentRv = eVar.F;
        Intrinsics.checkNotNullExpressionValue(contentRv, "contentRv");
        h0VarQ4.K0(contentRv);
        r4().d0(new Function0() { // from class: com.zentraedi.comic.activity.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicCodeBookManagementActivity.u4(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u4(ComicCodeBookManagementActivity comicCodeBookManagementActivity) {
        comicCodeBookManagementActivity.q4().U0();
        return Unit.INSTANCE;
    }

    @JvmStatic
    public static final void v4(@fo.k Activity activity) {
        X.a(activity);
    }

    protected void onDestroy() {
        super/*com.zentraedi.business.activity.BaseActivity*/.onDestroy();
    }

    protected void r3() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void s3() {
        com.zentraedi.comic.databinding.e eVarY1 = com.zentraedi.comic.databinding.e.y1(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(eVarY1, "inflate(...)");
        this.V = eVarY1;
        q4().setLeftIconOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicCodeBookManagementActivity.o4(this.a, view);
            }
        });
        com.zentraedi.comic.databinding.e eVar = this.V;
        com.zentraedi.comic.databinding.e eVar2 = null;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            eVar = null;
        }
        eVar.C1(q4());
        com.zentraedi.comic.databinding.e eVar3 = this.V;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            eVar2 = eVar3;
        }
        setContentView(eVar2.getRoot());
        t4();
        s4();
        n4();
    }
}
