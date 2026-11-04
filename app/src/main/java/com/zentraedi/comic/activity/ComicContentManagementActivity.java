package com.zentraedi.comic.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.zentraedi.business.activity.BaseLandscapeActivity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicContentManagementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicContentManagementActivity.kt\ncom/zentraedi/comic/activity/ComicContentManagementActivity\n+ 2 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt\n*L\n1#1,80:1\n13#2:81\n*S KotlinDebug\n*F\n+ 1 ComicContentManagementActivity.kt\ncom/zentraedi/comic/activity/ComicContentManagementActivity\n*L\n28#1:81\n*E\n"})
public final class ComicContentManagementActivity extends BaseLandscapeActivity {

    @fo.k
    public static final a W = new a(null);

    @fo.k
    private final Lazy T = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.f0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicContentManagementActivity.r4();
        }
    });

    @fo.k
    private final Lazy U = LazyKt.lazy(new b(this));
    private com.zentraedi.comic.databinding.i V;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@fo.k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(new Intent(activity, (Class<?>) ComicContentManagementActivity.class));
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class b implements Function0<com.zentraedi.comic.viewmodel.q> {
        final /* synthetic */ androidx.lifecycle.r2 a;

        public b(androidx.lifecycle.r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.q] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.zentraedi.comic.viewmodel.q invoke() {
            return new androidx.lifecycle.m2(this.a).c(com.zentraedi.comic.viewmodel.q.class);
        }
    }

    private final void m4() {
        com.zentraedi.comic.fragment.c cVar = new com.zentraedi.comic.fragment.c();
        androidx.fragment.app.t0 t0VarW = I2().w();
        Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction(...)");
        t0VarW.f(com.zentraedi.comic.q.i.tg, cVar);
        t0VarW.q();
    }

    private final void n4() {
        q4().S(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.tI));
        q4().m.set(true);
        q4().n.set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.Qf));
        q4().o.set(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicContentManagementActivity.o4(this.a, view);
            }
        });
        com.zentraedi.comic.databinding.i iVar = this.V;
        com.zentraedi.comic.databinding.i iVar2 = null;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            iVar = null;
        }
        iVar.G.H.setBackgroundColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.du));
        com.zentraedi.comic.databinding.i iVar3 = this.V;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            iVar3 = null;
        }
        iVar3.D1(q4());
        com.zentraedi.comic.databinding.i iVar4 = this.V;
        if (iVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            iVar4 = null;
        }
        AppBarLayout appBarLayout = iVar4.E;
        com.zentraedi.business.listener.a aVar = new com.zentraedi.business.listener.a();
        com.zentraedi.comic.databinding.i iVar5 = this.V;
        if (iVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            iVar5 = null;
        }
        TextView tvNavTitle = iVar5.G.J;
        Intrinsics.checkNotNullExpressionValue(tvNavTitle, "tvNavTitle");
        aVar.f(new View[]{tvNavTitle});
        com.zentraedi.comic.databinding.i iVar6 = this.V;
        if (iVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            iVar2 = iVar6;
        }
        TextView tvItem = iVar2.H;
        Intrinsics.checkNotNullExpressionValue(tvItem, "tvItem");
        aVar.i(new View[]{tvItem});
        appBarLayout.e(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void o4(ComicContentManagementActivity comicContentManagementActivity, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        if (!comicContentManagementActivity.q4().t.get()) {
            com.zentraedi.basic.function.ui.toast.a.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.nx1), false);
            return;
        }
        com.zentraedi.comic.viewmodel.q qVarP4 = comicContentManagementActivity.p4();
        Intrinsics.checkNotNull(view);
        qVarP4.j0(comicContentManagementActivity, view);
    }

    private final com.zentraedi.comic.viewmodel.q p4() {
        return (com.zentraedi.comic.viewmodel.q) this.U.getValue();
    }

    private final com.zentraedi.business.viewmodel.m q4() {
        return (com.zentraedi.business.viewmodel.m) this.T.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.business.viewmodel.m r4() {
        return new com.zentraedi.business.viewmodel.m(com.zentraedi.basic.function.utils.a.c());
    }

    protected void r3() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void s3() {
        com.zentraedi.comic.databinding.i iVarZ1 = com.zentraedi.comic.databinding.i.z1(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(iVarZ1, "inflate(...)");
        this.V = iVarZ1;
        com.zentraedi.comic.databinding.i iVar = null;
        if (iVarZ1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            iVarZ1 = null;
        }
        setContentView(iVarZ1.getRoot());
        com.zentraedi.comic.databinding.i iVar2 = this.V;
        if (iVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            iVar = iVar2;
        }
        iVar.E1(p4());
        n4();
        m4();
    }
}
