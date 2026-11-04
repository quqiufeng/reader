package com.zentraedi.comic.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.zentraedi.business.activity.BaseLandscapeActivity;
import com.zentraedi.business.event.ComicStartFlushEvent;
import com.zentraedi.business.model.ComicCategory;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicCategoryContentManagementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCategoryContentManagementActivity.kt\ncom/zentraedi/comic/activity/ComicCategoryContentManagementActivity\n+ 2 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt\n*L\n1#1,93:1\n13#2:94\n*S KotlinDebug\n*F\n+ 1 ComicCategoryContentManagementActivity.kt\ncom/zentraedi/comic/activity/ComicCategoryContentManagementActivity\n*L\n30#1:94\n*E\n"})
public final class ComicCategoryContentManagementActivity extends BaseLandscapeActivity {

    @fo.k
    public static final a W = new a(null);

    @fo.k
    private static final String X = "intent_key_category";

    @fo.k
    private final Lazy T = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicCategoryContentManagementActivity.q4();
        }
    });

    @fo.k
    private final Lazy U = LazyKt.lazy(new b(this));
    private com.zentraedi.comic.databinding.a V;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@fo.k Activity activity, @fo.k ComicCategory category) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(category, "category");
            Intent intent = new Intent(activity, (Class<?>) ComicCategoryContentManagementActivity.class);
            intent.putExtra(ComicCategoryContentManagementActivity.X, (Serializable) category);
            activity.startActivity(intent);
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

    private final void l4() {
        com.zentraedi.comic.fragment.c cVar = new com.zentraedi.comic.fragment.c();
        androidx.fragment.app.t0 t0VarW = I2().w();
        Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction(...)");
        t0VarW.f(com.zentraedi.comic.q.i.tg, cVar);
        t0VarW.q();
    }

    private final void m4() {
        o4().S(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.dI));
        o4().m.set(false);
        com.zentraedi.comic.databinding.a aVar = this.V;
        com.zentraedi.comic.databinding.a aVar2 = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            aVar = null;
        }
        aVar.G.H.setBackgroundColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.comic.q.f.du));
        com.zentraedi.comic.databinding.a aVar3 = this.V;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            aVar3 = null;
        }
        aVar3.D1(o4());
        com.zentraedi.comic.databinding.a aVar4 = this.V;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            aVar4 = null;
        }
        AppBarLayout appBarLayout = aVar4.E;
        com.zentraedi.business.listener.a aVar5 = new com.zentraedi.business.listener.a();
        com.zentraedi.comic.databinding.a aVar6 = this.V;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            aVar6 = null;
        }
        TextView tvNavTitle = aVar6.G.J;
        Intrinsics.checkNotNullExpressionValue(tvNavTitle, "tvNavTitle");
        aVar5.f(new View[]{tvNavTitle});
        com.zentraedi.comic.databinding.a aVar7 = this.V;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            aVar2 = aVar7;
        }
        TextView tvItem = aVar2.J;
        Intrinsics.checkNotNullExpressionValue(tvItem, "tvItem");
        aVar5.i(new View[]{tvItem});
        appBarLayout.e(aVar5);
    }

    private final com.zentraedi.comic.viewmodel.q n4() {
        return (com.zentraedi.comic.viewmodel.q) this.U.getValue();
    }

    private final com.zentraedi.business.viewmodel.m o4() {
        return (com.zentraedi.business.viewmodel.m) this.T.getValue();
    }

    private final void p4() {
        n4().y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.business.viewmodel.m q4() {
        return new com.zentraedi.business.viewmodel.m(com.zentraedi.basic.function.utils.a.c());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicHouseDisplayChangedEvent(@fo.k ComicStartFlushEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        com.zentraedi.comic.viewmodel.q qVarN4 = n4();
        String dirIds = event.getDirIds();
        if (dirIds == null) {
            dirIds = "";
        }
        qVarN4.R0(dirIds);
        com.zentraedi.comic.viewmodel.q qVarN5 = n4();
        String dirIds2 = event.getDirIds();
        qVarN5.P0(dirIds2 != null ? dirIds2 : "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void r3() {
        n4().S0((ComicCategory) getIntent().getSerializableExtra(X));
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void s3() {
        com.zentraedi.comic.databinding.a aVarZ1 = com.zentraedi.comic.databinding.a.z1(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(aVarZ1, "inflate(...)");
        this.V = aVarZ1;
        com.zentraedi.comic.databinding.a aVar = null;
        if (aVarZ1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            aVarZ1 = null;
        }
        setContentView(aVarZ1.getRoot());
        com.zentraedi.comic.databinding.a aVar2 = this.V;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            aVar = aVar2;
        }
        aVar.E1(n4());
        n4().m0(this);
        m4();
        p4();
        l4();
    }
}
