package com.zentraedi.comic.activity;

import android.app.Activity;
import android.content.Intent;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.comic.viewmodel.OverallReadSetting;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicSettingActivity.kt\ncom/zentraedi/comic/activity/ComicSettingActivity\n+ 2 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n13#2:94\n1#3:95\n*S KotlinDebug\n*F\n+ 1 ComicSettingActivity.kt\ncom/zentraedi/comic/activity/ComicSettingActivity\n*L\n20#1:94\n*E\n"})
public final class ComicSettingActivity extends BaseActivity {

    @fo.k
    public static final a U = new a(null);
    private static final int V = 18;
    public static final int W = 19;

    @fo.k
    public static final String X = "START_ACTIVITY_RESULT";

    @fo.k
    public static final String Y = "background_color";

    @fo.k
    private final Lazy T = LazyKt.lazy(new b(this));

    @SourceDebugExtension({"SMAP\nComicSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicSettingActivity.kt\ncom/zentraedi/comic/activity/ComicSettingActivity$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, Activity activity, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            aVar.a(activity, num);
        }

        @JvmStatic
        public final void a(@fo.k Activity activity, @fo.l Integer num) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = new Intent(activity, (Class<?>) ComicSettingActivity.class);
            if (num != null) {
                intent.putExtra(ComicSettingActivity.Y, num.intValue());
            }
            activity.startActivityForResult(intent, 18);
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class b implements Function0<com.zentraedi.comic.viewmodel.t4> {
        final /* synthetic */ androidx.lifecycle.r2 a;

        public b(androidx.lifecycle.r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.t4] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.zentraedi.comic.viewmodel.t4 invoke() {
            return new androidx.lifecycle.m2(this.a).c(com.zentraedi.comic.viewmodel.t4.class);
        }
    }

    private final void k4() {
        com.zentraedi.comic.fragment.i3 i3Var = new com.zentraedi.comic.fragment.i3();
        androidx.fragment.app.t0 t0VarW = I2().w();
        Intrinsics.checkNotNullExpressionValue(t0VarW, "beginTransaction(...)");
        t0VarW.f(com.zentraedi.comic.q.i.tg, i3Var);
        t0VarW.q();
    }

    private final com.zentraedi.comic.viewmodel.t4 l4() {
        return (com.zentraedi.comic.viewmodel.t4) this.T.getValue();
    }

    private final void m4(OverallReadSetting overallReadSetting) {
        l4().X().set(Boolean.valueOf(overallReadSetting.c()));
        l4().b0().set(Long.valueOf(overallReadSetting.d()));
        l4().n0().set(Integer.valueOf(overallReadSetting.m()));
        l4().W().set(Integer.valueOf(overallReadSetting.b()));
        l4().m0().set(Boolean.valueOf(overallReadSetting.l()));
        l4().T().set(Integer.valueOf(overallReadSetting.a()));
    }

    @JvmStatic
    public static final void n4(@fo.k Activity activity, @fo.l Integer num) {
        U.a(activity, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        Intent intent = new Intent();
        Integer num = (Integer) l4().T().get();
        int iIntValue = num != null ? num.intValue() : 0;
        Boolean bool = (Boolean) l4().X().get();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Long l = (Long) l4().b0().get();
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer num2 = (Integer) l4().n0().get();
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = (Integer) l4().W().get();
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        Boolean bool2 = (Boolean) l4().m0().get();
        OverallReadSetting overallReadSetting = new OverallReadSetting(iIntValue, zBooleanValue, jLongValue, iIntValue2, iIntValue3, bool2 != null ? bool2.booleanValue() : true, null, false, 0, null, 960, null);
        com.zentraedi.business.utils.t7.j(ComicReaderActivity.y5, overallReadSetting);
        intent.putExtra("START_ACTIVITY_RESULT", overallReadSetting);
        setResult(19, intent);
        super/*android.app.Activity*/.finish();
    }

    protected void onActivityResult(int i, int i2, @fo.l Intent intent) {
        OverallReadSetting overallReadSetting;
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        if (intent == null || (overallReadSetting = (OverallReadSetting) intent.getParcelableExtra("START_ACTIVITY_RESULT")) == null) {
            return;
        }
        m4(overallReadSetting);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void r3() {
        int intExtra = getIntent().getIntExtra(Y, -1);
        if (intExtra >= 0) {
            l4().B0(Integer.valueOf(intExtra));
        }
    }

    protected void s3() {
        setContentView(com.zentraedi.comic.q.l.S);
        k4();
    }
}
