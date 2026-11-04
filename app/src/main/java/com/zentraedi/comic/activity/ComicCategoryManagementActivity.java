package com.zentraedi.comic.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.zentraedi.business.activity.BaseLandscapeActivity;
import com.zentraedi.business.model.ComicCategory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicCategoryManagementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCategoryManagementActivity.kt\ncom/zentraedi/comic/activity/ComicCategoryManagementActivity\n+ 2 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt\n*L\n1#1,101:1\n13#2:102\n*S KotlinDebug\n*F\n+ 1 ComicCategoryManagementActivity.kt\ncom/zentraedi/comic/activity/ComicCategoryManagementActivity\n*L\n31#1:102\n*E\n"})
public final class ComicCategoryManagementActivity extends BaseLandscapeActivity {

    @fo.k
    public static final a X = new a(null);
    private com.zentraedi.comic.databinding.c V;

    @fo.k
    private final Lazy T = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicCategoryManagementActivity.z4();
        }
    });

    @fo.k
    private final Lazy U = LazyKt.lazy(new b(this));
    private boolean W = true;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@fo.k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(new Intent(activity, (Class<?>) ComicCategoryManagementActivity.class));
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class b implements Function0<com.zentraedi.comic.viewmodel.v> {
        final /* synthetic */ androidx.lifecycle.r2 a;

        public b(androidx.lifecycle.r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.v] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.zentraedi.comic.viewmodel.v invoke() {
            return new androidx.lifecycle.m2(this.a).c(com.zentraedi.comic.viewmodel.v.class);
        }
    }

    private final void q4() {
        u4().S(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dI));
        u4().m.set(true);
        u4().n.set(com.zentraedi.basic.function.utils.a.g(com.zentraedi.comic.q.h.Qf));
        u4().o.set(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicCategoryManagementActivity.r4(this.a, view);
            }
        });
        com.zentraedi.comic.databinding.c cVar = this.V;
        com.zentraedi.comic.databinding.c cVar2 = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cVar = null;
        }
        cVar.J.H.setBackgroundColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.du));
        com.zentraedi.comic.databinding.c cVar3 = this.V;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cVar3 = null;
        }
        cVar3.D1(u4());
        com.zentraedi.comic.databinding.c cVar4 = this.V;
        if (cVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cVar4 = null;
        }
        AppBarLayout appBarLayout = cVar4.E;
        com.zentraedi.business.listener.a aVar = new com.zentraedi.business.listener.a();
        com.zentraedi.comic.databinding.c cVar5 = this.V;
        if (cVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cVar5 = null;
        }
        TextView tvNavTitle = cVar5.J.J;
        Intrinsics.checkNotNullExpressionValue(tvNavTitle, "tvNavTitle");
        aVar.f(new View[]{tvNavTitle});
        com.zentraedi.comic.databinding.c cVar6 = this.V;
        if (cVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            cVar2 = cVar6;
        }
        View tvItem = cVar2.K;
        Intrinsics.checkNotNullExpressionValue(tvItem, "tvItem");
        aVar.i(new View[]{tvItem});
        appBarLayout.e(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r4(ComicCategoryManagementActivity comicCategoryManagementActivity, View view) {
        if (!com.zentraedi.business.utils.m.c() && comicCategoryManagementActivity.W) {
            comicCategoryManagementActivity.t4().U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s4(ComicCategoryManagementActivity comicCategoryManagementActivity, sc.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        comicCategoryManagementActivity.t4().X();
    }

    private final com.zentraedi.comic.viewmodel.v t4() {
        return (com.zentraedi.comic.viewmodel.v) this.U.getValue();
    }

    private final com.zentraedi.business.viewmodel.m u4() {
        return (com.zentraedi.business.viewmodel.m) this.T.getValue();
    }

    private final void v4() {
        com.zentraedi.comic.viewmodel.v vVarT4 = t4();
        com.zentraedi.comic.databinding.c cVar = this.V;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cVar = null;
        }
        RecyclerView rlCategory = cVar.I;
        Intrinsics.checkNotNullExpressionValue(rlCategory, "rlCategory");
        vVarT4.R(rlCategory, new Function1() { // from class: com.zentraedi.comic.activity.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicCategoryManagementActivity.w4(this.a, (ComicCategory) obj);
            }
        });
        t4().j0(new Function1() { // from class: com.zentraedi.comic.activity.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicCategoryManagementActivity.x4(this.a, ((Boolean) obj).booleanValue());
            }
        });
        t4().i0(new Function1() { // from class: com.zentraedi.comic.activity.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicCategoryManagementActivity.y4(this.a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit w4(ComicCategoryManagementActivity comicCategoryManagementActivity, ComicCategory it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComicCategoryContentManagementActivity.W.a(comicCategoryManagementActivity, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x4(ComicCategoryManagementActivity comicCategoryManagementActivity, boolean z) {
        com.zentraedi.comic.databinding.c cVar = comicCategoryManagementActivity.V;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cVar = null;
        }
        cVar.H.finishRefresh(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y4(ComicCategoryManagementActivity comicCategoryManagementActivity, boolean z) {
        com.zentraedi.comic.databinding.c cVar = comicCategoryManagementActivity.V;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cVar = null;
        }
        cVar.H.setEnableRefresh(z);
        comicCategoryManagementActivity.W = z;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.business.viewmodel.m z4() {
        return new com.zentraedi.business.viewmodel.m(com.zentraedi.basic.function.utils.a.c());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicCategoryEvent(@fo.k fg.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.d()) {
            t4().X();
        } else if (event.e()) {
            t4().V(event.a());
        } else if (event.f()) {
            t4().W(event.a(), event.b());
        }
    }

    protected void onDestroy() {
        super/*com.zentraedi.business.activity.BaseActivity*/.onDestroy();
        org.greenrobot.eventbus.c.f().A(this);
    }

    protected void r3() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void s3() {
        com.zentraedi.comic.databinding.c cVarZ1 = com.zentraedi.comic.databinding.c.z1(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(cVarZ1, "inflate(...)");
        this.V = cVarZ1;
        com.zentraedi.comic.databinding.c cVar = null;
        if (cVarZ1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cVarZ1 = null;
        }
        setContentView(cVarZ1.getRoot());
        com.zentraedi.comic.databinding.c cVar2 = this.V;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cVar2 = null;
        }
        cVar2.E1(t4());
        q4();
        org.greenrobot.eventbus.c.f().v(this);
        v4();
        com.zentraedi.comic.databinding.c cVar3 = this.V;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            cVar3 = null;
        }
        cVar3.H.setOnRefreshListener(new tc.d() { // from class: com.zentraedi.comic.activity.f
            public final void z0(sc.j jVar) {
                ComicCategoryManagementActivity.s4(this.a, jVar);
            }
        });
        com.zentraedi.comic.databinding.c cVar4 = this.V;
        if (cVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            cVar = cVar4;
        }
        cVar.H.autoRefresh();
    }
}
