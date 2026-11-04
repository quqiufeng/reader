package com.zentraedi.comic.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.comic.viewmodel.ComicReaderSetViewModel;
import com.zentraedi.comic.viewmodel.OverallReadSetting;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicReadSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicReadSettingActivity.kt\ncom/zentraedi/comic/activity/ComicReadSettingActivity\n+ 2 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n13#2:90\n1#3:91\n*S KotlinDebug\n*F\n+ 1 ComicReadSettingActivity.kt\ncom/zentraedi/comic/activity/ComicReadSettingActivity\n*L\n21#1:90\n*E\n"})
public final class ComicReadSettingActivity extends BaseActivity {

    @fo.k
    public static final a V = new a(null);
    private static final int W = 18;

    @fo.k
    public static final String X = "START_ACTIVITY_RESULT";

    @fo.k
    private final Lazy T = LazyKt.lazy(new b(this));
    private com.zentraedi.comic.databinding.c0 U;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(@fo.k Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivityForResult(new Intent(activity, (Class<?>) ComicReadSettingActivity.class), 18);
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nArchExtentions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchExtentions.kt\ncom/zentraedi/basic/ktx/ArchExtentionsKt$lazyViewModel$1\n*L\n1#1,16:1\n*E\n"})
    public static final class b implements Function0<ComicReaderSetViewModel> {
        final /* synthetic */ androidx.lifecycle.r2 a;

        public b(androidx.lifecycle.r2 r2Var) {
            this.a = r2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.i2, com.zentraedi.comic.viewmodel.ComicReaderSetViewModel] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ComicReaderSetViewModel invoke() {
            return new androidx.lifecycle.m2(this.a).c(ComicReaderSetViewModel.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l4(ComicReadSettingActivity comicReadSettingActivity, View view) {
        comicReadSettingActivity.finish();
    }

    private final ComicReaderSetViewModel m4() {
        return (ComicReaderSetViewModel) this.T.getValue();
    }

    private final void n4(OverallReadSetting overallReadSetting) {
        m4().S().set(Boolean.valueOf(overallReadSetting.c()));
        m4().T().set(Long.valueOf(overallReadSetting.d()));
        m4().W().set(Integer.valueOf(overallReadSetting.m()));
        m4().R().set(Integer.valueOf(overallReadSetting.b()));
        m4().U().set(Boolean.valueOf(overallReadSetting.l()));
        m4().Q().set(Integer.valueOf(overallReadSetting.a()));
    }

    @JvmStatic
    public static final void o4(@fo.k Activity activity) {
        V.a(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        Intent intent = new Intent();
        Integer num = (Integer) m4().Q().get();
        int iIntValue = num != null ? num.intValue() : 0;
        Boolean bool = (Boolean) m4().S().get();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Long l = (Long) m4().T().get();
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer num2 = (Integer) m4().W().get();
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = (Integer) m4().R().get();
        int iIntValue3 = num3 != null ? num3.intValue() : 1;
        Boolean bool2 = (Boolean) m4().U().get();
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
        n4(overallReadSetting);
    }

    public void onBackPressed() {
        finish();
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    protected void r3() {
        OverallReadSetting overallReadSetting = (OverallReadSetting) com.zentraedi.business.utils.t7.d(ComicReaderActivity.y5, new OverallReadSetting(0, true, 0L, 0, 1, true, null, false, 0, null, 960, null));
        Intrinsics.checkNotNull(overallReadSetting);
        n4(overallReadSetting);
        m4().initData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void s3() {
        com.zentraedi.comic.databinding.c0 c0VarY1 = com.zentraedi.comic.databinding.c0.y1(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c0VarY1, "inflate(...)");
        this.U = c0VarY1;
        m4().setLeftIconOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicReadSettingActivity.l4(this.a, view);
            }
        });
        com.zentraedi.comic.databinding.c0 c0Var = this.U;
        com.zentraedi.comic.databinding.c0 c0Var2 = null;
        if (c0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            c0Var = null;
        }
        setContentView(c0Var.getRoot());
        com.zentraedi.comic.databinding.c0 c0Var3 = this.U;
        if (c0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            c0Var2 = c0Var3;
        }
        c0Var2.C1(m4());
    }
}
