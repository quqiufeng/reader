package com.zentraedi.comic.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.Gson;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.tbs.reader.ITbsReader;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.database.ReadingRecord;
import com.zentraedi.business.manager.placeholder.PlaceholderLoader;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.comic.event.ComicCoverChangeSuccessEvent;
import com.zentraedi.comic.event.ComicFilesDeleteEvent;
import com.zentraedi.comic.event.ComicFinishSpecificDirEvent;
import com.zentraedi.comic.event.ComicFinishSubDirEvent;
import com.zentraedi.comic.event.ComicInfoCancelEvent;
import com.zentraedi.comic.event.ComicInfoCreateEvent;
import com.zentraedi.comic.event.ReadRecordUpdateSuccessEvent;
import com.zentraedi.comic.event.ReadRecordUpdateSuccessForListEvent;
import com.zentraedi.comic.manager.ComicDownloadManager;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicSubDirActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicSubDirActivity.kt\ncom/zentraedi/comic/activity/ComicSubDirActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,585:1\n1#2:586\n1563#3:587\n1634#3,3:588\n*S KotlinDebug\n*F\n+ 1 ComicSubDirActivity.kt\ncom/zentraedi/comic/activity/ComicSubDirActivity\n*L\n412#1:587\n412#1:588,3\n*E\n"})
public final class ComicSubDirActivity extends ComicBaseListActivity {

    @fo.k
    public static final a g0 = new a(null);

    @fo.k
    public static final String h0 = "cate_id";

    @fo.k
    public static final String i0 = "dir_id";

    @fo.k
    public static final String j0 = "dir_path";

    @fo.k
    public static final String k0 = "path";

    @fo.k
    public static final String l0 = "select";

    @fo.k
    public static final String m0 = "comic";

    @fo.k
    public static final String n0 = "from_home";

    @fo.k
    private final Lazy T = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.s5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicSubDirActivity.b6(this.a);
        }
    });

    @fo.k
    private final Lazy U = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.u5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicSubDirActivity.j6();
        }
    });

    @fo.k
    private final Lazy V = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.v5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicSubDirActivity.d6();
        }
    });

    @fo.k
    private final Lazy W = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.w5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicSubDirActivity.c6();
        }
    });

    @fo.k
    private final Lazy X = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.x5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicSubDirActivity.i6();
        }
    });

    @fo.k
    private final Lazy Y = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.y5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicSubDirActivity.f6(this.a);
        }
    });

    @fo.k
    private final Lazy Z = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.z5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicSubDirActivity.e6();
        }
    });

    @fo.k
    private String a0 = "";

    @fo.l
    private String b0;

    @fo.l
    private String c0;

    @fo.l
    private String d0;
    private boolean e0;

    @fo.l
    private ComicInfoModel f0;

    @SourceDebugExtension({"SMAP\nComicSubDirActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicSubDirActivity.kt\ncom/zentraedi/comic/activity/ComicSubDirActivity$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,585:1\n1#2:586\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, Activity activity, String str, String str2, String str3, String str4, Boolean bool, ComicInfoModel comicInfoModel, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) != 0) {
                str4 = null;
            }
            if ((i & 32) != 0) {
                bool = null;
            }
            if ((i & 64) != 0) {
                comicInfoModel = null;
            }
            aVar.a(activity, str, str2, str3, str4, bool, comicInfoModel);
        }

        public final void a(@fo.k Activity activity, @fo.l String str, @fo.l String str2, @fo.l String str3, @fo.l String str4, @fo.l Boolean bool, @fo.l ComicInfoModel comicInfoModel) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = new Intent(activity, (Class<?>) ComicSubDirActivity.class);
            intent.putExtra(ComicSubDirActivity.h0, str);
            if (str4 != null) {
                intent.putExtra(ComicSubDirActivity.k0, str4);
            }
            if (str2 != null) {
                intent.putExtra(ComicSubDirActivity.i0, str2);
            }
            if (str3 != null) {
                intent.putExtra(ComicSubDirActivity.j0, str3);
            }
            intent.putExtra(ComicSubDirActivity.m0, (Serializable) comicInfoModel);
            if (bool != null) {
                intent.putExtra(ComicSubDirActivity.l0, bool.booleanValue());
            }
            activity.startActivity(intent);
        }

        private a() {
        }
    }

    public static final class b implements com.zentraedi.business.utils.n4.f {
        b() {
        }

        public void a(Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2)) {
                com.zentraedi.business.utils.t7.j(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.f, (String) null, 1, (Object) null), bool2);
            }
            ComicSubDirActivity.this.L5();
        }
    }

    public static final class c extends PlaceholderLoader.b {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(Drawable drawable, final ComicSubDirActivity comicSubDirActivity) {
            final Bitmap bitmapF = com.zentraedi.business.utils.v.a.f(com.zentraedi.basic.function.utils.a.h().e(), drawable, 15.0f);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zentraedi.comic.activity.d7
                @Override // java.lang.Runnable
                public final void run() {
                    ComicSubDirActivity.c.f(comicSubDirActivity, bitmapF);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(ComicSubDirActivity comicSubDirActivity, Bitmap bitmap) {
            comicSubDirActivity.N5().H.setImageBitmap(bitmap);
        }

        public void a(PlaceholderLoader.Builder builder, int i) {
        }

        public void b(PlaceholderLoader.Builder builder, final Drawable drawable) {
            super.b(builder, drawable);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            final ComicSubDirActivity comicSubDirActivity = ComicSubDirActivity.this;
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.zentraedi.comic.activity.e7
                @Override // java.lang.Runnable
                public final void run() {
                    ComicSubDirActivity.c.e(drawable, comicSubDirActivity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A5(final ComicSubDirActivity comicSubDirActivity) {
        com.zentraedi.comic.business.a1 a1VarQ5 = comicSubDirActivity.Q5();
        ComicInfoModel comicInfoModelW = comicSubDirActivity.T5().W();
        a1VarQ5.Y(comicInfoModelW != null ? comicInfoModelW.getId() : null, false, new Function1() { // from class: com.zentraedi.comic.activity.j6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicSubDirActivity.B5(this.a, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    private final void A6() {
        com.zentraedi.comic.business.x1 x1VarP5 = P5();
        View root = N5().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        com.zentraedi.comic.business.x1.v0(x1VarP5, root, T5().W(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B5(ComicSubDirActivity comicSubDirActivity, boolean z) {
        if (z) {
            ObservableField<Boolean> observableFieldG0 = comicSubDirActivity.T5().g0();
            Boolean bool = Boolean.FALSE;
            observableFieldG0.set(bool);
            ComicInfoModel comicInfoModelW = comicSubDirActivity.T5().W();
            if (comicInfoModelW != null) {
                org.greenrobot.eventbus.c.f().q(new ComicInfoCancelEvent(comicInfoModelW));
            }
            comicSubDirActivity.T5().r0(null);
            comicSubDirActivity.T5().c0().set(bool);
        }
        return Unit.INSTANCE;
    }

    private final void B6() {
        String strE0 = com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.e, (String) null, 1, (Object) null);
        Boolean bool = Boolean.FALSE;
        if (((Boolean) com.zentraedi.business.utils.t7.d(strE0, bool)).booleanValue()) {
            T5().h0().set(bool);
        } else {
            N5().a0.post(new Runnable() { // from class: com.zentraedi.comic.activity.k6
                @Override // java.lang.Runnable
                public final void run() {
                    ComicSubDirActivity.C6(this.a);
                }
            });
            T5().h0().set(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void C5(ComicSubDirActivity comicSubDirActivity, View view) {
        ComicReaderActivity.a aVar = ComicReaderActivity.x5;
        ComicInfoModel comicInfoModelW = comicSubDirActivity.T5().W();
        Intrinsics.checkNotNull(comicInfoModelW);
        aVar.a(comicSubDirActivity, comicInfoModelW.fake());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C6(ComicSubDirActivity comicSubDirActivity) {
        comicSubDirActivity.N5().a0.addDrawCircleRect(comicSubDirActivity.N5().k0.getViewRect());
        comicSubDirActivity.N5().a0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D5(ComicSubDirActivity comicSubDirActivity, View view) {
        comicSubDirActivity.k6();
    }

    private final void D6() {
        ComicDownloadManager.ComicFileInfo comicFileInfo = new ComicDownloadManager.ComicFileInfo();
        comicFileInfo.setPath(T5().getPath());
        comicFileInfo.setFolder(true);
        ComicInfoModel comicInfoModelW = T5().W();
        if (comicInfoModelW != null) {
            ComicDownloadManager.c.a().g(comicInfoModelW, CollectionsKt.listOf(comicFileInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void E5(ComicSubDirActivity comicSubDirActivity, View view) {
        com.zentraedi.comic.util.l.a.a();
        org.greenrobot.eventbus.c.f().q(new ComicFinishSubDirEvent());
        comicSubDirActivity.overridePendingTransition(com.zentraedi.comic.q.a.n0, com.zentraedi.comic.q.a.G0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F5(ComicSubDirActivity comicSubDirActivity, View view) {
        comicSubDirActivity.k6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G5(ComicSubDirActivity comicSubDirActivity, View view) {
        comicSubDirActivity.m6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H5(ComicSubDirActivity comicSubDirActivity, View view) {
        comicSubDirActivity.r6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I5(ComicSubDirActivity comicSubDirActivity, View view) {
        comicSubDirActivity.t6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void J5(ComicSubDirActivity comicSubDirActivity, View view) {
        ComicReaderActivity.a aVar = ComicReaderActivity.x5;
        ComicInfoModel comicInfoModel = comicSubDirActivity.f0;
        Intrinsics.checkNotNull(comicInfoModel);
        aVar.a(comicSubDirActivity, comicInfoModel.fake());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K5(ComicSubDirActivity comicSubDirActivity, View view) {
        if (((Boolean) com.zentraedi.business.utils.t7.d(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.f, (String) null, 1, (Object) null), Boolean.FALSE)).booleanValue()) {
            comicSubDirActivity.L5();
            return;
        }
        Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        com.zentraedi.business.utils.n4 n4VarA = com.zentraedi.business.utils.n4.c.a();
        Intrinsics.checkNotNull(activityE);
        String strN = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        String strN2 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.PJ);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        String strN3 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Mo2);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        String strN4 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bx);
        Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
        String strN5 = com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.zx);
        Intrinsics.checkNotNullExpressionValue(strN5, "getString(...)");
        n4VarA.r3(activityE, strN, strN2, strN3, false, strN4, strN5, comicSubDirActivity.new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L5() {
        com.zentraedi.comic.delegate.m mVar = com.zentraedi.comic.delegate.m.a;
        String str = this.c0;
        if (str == null) {
            str = "";
        }
        String str2 = this.d0;
        com.zentraedi.comic.delegate.m.k(mVar, str, str2 != null ? str2 : "", null, new Function1() { // from class: com.zentraedi.comic.activity.t6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicSubDirActivity.M5(this.a, (ComicInfoModel) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M5(ComicSubDirActivity comicSubDirActivity, ComicInfoModel comicInfoModel) {
        if (comicInfoModel != null) {
            comicSubDirActivity.T5().r0(comicInfoModel);
            comicSubDirActivity.T5().g0().set(Boolean.TRUE);
            comicSubDirActivity.U5();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.zentraedi.comic.databinding.v N5() {
        Object value = this.T.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (com.zentraedi.comic.databinding.v) value;
    }

    private final com.zentraedi.comic.business.m O5() {
        return (com.zentraedi.comic.business.m) this.W.getValue();
    }

    private final com.zentraedi.comic.business.x1 P5() {
        return (com.zentraedi.comic.business.x1) this.V.getValue();
    }

    private final com.zentraedi.comic.business.a1 Q5() {
        return (com.zentraedi.comic.business.a1) this.Z.getValue();
    }

    private final com.zentraedi.comic.fragment.u1 R5() {
        return (com.zentraedi.comic.fragment.u1) this.Y.getValue();
    }

    private final com.zentraedi.comic.viewmodel.m2 S5() {
        return (com.zentraedi.comic.viewmodel.m2) this.X.getValue();
    }

    private final com.zentraedi.comic.viewmodel.g6 T5() {
        return (com.zentraedi.comic.viewmodel.g6) this.U.getValue();
    }

    private final void U5() {
        ComicInfoModel comicInfoModelW = T5().W();
        if (comicInfoModelW != null) {
            T5().getTitle().set(com.zentraedi.business.utils.l5.r(comicInfoModelW.getName()));
        }
        ObservableField<String> observableFieldR = T5().R();
        ComicInfoModel comicInfoModelW2 = T5().W();
        observableFieldR.set(comicInfoModelW2 != null ? comicInfoModelW2.getCover() : null);
        ObservableField<Boolean> observableFieldJ0 = T5().j0();
        ComicInfoModel comicInfoModelW3 = T5().W();
        observableFieldJ0.set(Boolean.valueOf(comicInfoModelW3 != null && comicInfoModelW3.getOnShelf() == 1));
        String strH = com.zentraedi.business.utils.x4.h(com.zentraedi.business.utils.l5.z(T5().getPath()));
        Intrinsics.checkNotNull(strH);
        if (StringsKt.startsWith$default(strH, "/", false, 2, (Object) null)) {
            Intrinsics.checkNotNull(strH);
            strH = strH.substring(1);
            Intrinsics.checkNotNullExpressionValue(strH, "substring(...)");
        }
        T5().b0().set(strH);
        l5((String) T5().R().get(), T5().getPath(), Boolean.TRUE, false);
    }

    private final void V5() {
        ComicInfoModel comicInfoModel = this.f0;
        if (comicInfoModel != null) {
            if (!TextUtils.isEmpty(comicInfoModel != null ? comicInfoModel.getProgress() : null)) {
                ComicInfoModel comicInfoModel2 = this.f0;
                if (comicInfoModel2 != null) {
                    NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) new Gson().fromJson(comicInfoModel2.getProgress(), NasReadingRecordModule.class);
                    if (TextUtils.isEmpty(nasReadingRecordModule.getFilePath())) {
                        T5().c0().set(Boolean.FALSE);
                        return;
                    }
                    N5().O.setText(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.UJ, (char) 65306 + com.zentraedi.comic.m.x(nasReadingRecordModule.getFilePath())));
                    T5().c0().set(Boolean.TRUE);
                    return;
                }
                return;
            }
        }
        T5().c0().set(Boolean.FALSE);
    }

    private final void W5(String str) {
        new PlaceholderLoader.Builder().url(str).view(N5().K).module(2).type(12).roundingRadius(com.zentraedi.basic.function.utils.m0.b(5.0f)).scaleType(ImageView.ScaleType.CENTER_CROP).from("pub_album").preview(false).bigImage(true).callback(new c()).load();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y5(Drawable drawable, final ComicSubDirActivity comicSubDirActivity) {
        final Bitmap bitmapF = com.zentraedi.business.utils.v.a.f(com.zentraedi.basic.function.utils.a.h().e(), drawable, 15.0f);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zentraedi.comic.activity.f6
            @Override // java.lang.Runnable
            public final void run() {
                ComicSubDirActivity.Z5(this.a, bitmapF);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z5(ComicSubDirActivity comicSubDirActivity, Bitmap bitmap) {
        comicSubDirActivity.N5().H.setImageBitmap(bitmap);
    }

    private final void a6(String str, boolean z) {
        String strD = com.zentraedi.comic.util.c.a.d(str);
        if (TextUtils.isEmpty(strD)) {
            X5(z ? com.zentraedi.comic.q.h.Hm : com.zentraedi.comic.q.h.sm);
            return;
        }
        if (3 == com.zentraedi.business.utils.i5.a.f(strD)) {
            W5(strD);
            return;
        }
        Intrinsics.checkNotNull(strD);
        String strY = com.zentraedi.comic.m.y(strD);
        if (!StringsKt.startsWith$default(strY, "/storage/emulated/0", false, 2, (Object) null)) {
            X5(z ? com.zentraedi.comic.q.h.Hm : com.zentraedi.comic.q.h.sm);
        } else if (new File(strY).exists()) {
            W5(strY);
        } else {
            X5(z ? com.zentraedi.comic.q.h.Hm : com.zentraedi.comic.q.h.sm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final com.zentraedi.comic.databinding.v b6(ComicSubDirActivity comicSubDirActivity) {
        return (com.zentraedi.comic.databinding.v) androidx.databinding.m.l(comicSubDirActivity, com.zentraedi.comic.q.l.T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.m c6() {
        return new com.zentraedi.comic.business.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.x1 d6() {
        return new com.zentraedi.comic.business.x1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.business.a1 e6() {
        return new com.zentraedi.comic.business.a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.fragment.u1 f6(final ComicSubDirActivity comicSubDirActivity) {
        com.zentraedi.comic.fragment.u1 u1VarB = com.zentraedi.comic.fragment.u1.a.b(com.zentraedi.comic.fragment.u1.u, comicSubDirActivity.a0, comicSubDirActivity.c0, comicSubDirActivity.b0, Boolean.valueOf(comicSubDirActivity.e0), comicSubDirActivity.f0, null, 32, null);
        u1VarB.a3(new Function1() { // from class: com.zentraedi.comic.activity.h6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicSubDirActivity.g6(this.a, (List) obj);
            }
        });
        u1VarB.b3(comicSubDirActivity.T5().e0());
        u1VarB.Z2(new Function0() { // from class: com.zentraedi.comic.activity.i6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicSubDirActivity.h6(this.a);
            }
        });
        return u1VarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g6(ComicSubDirActivity comicSubDirActivity, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        comicSubDirActivity.T5().u0(it);
        return Unit.INSTANCE;
    }

    private final void h5() {
        final ComicInfoModel comicInfoModel = this.f0;
        if (comicInfoModel != null) {
            ig.k.s(ig.k.a, comicInfoModel.getId(), null, new Function1() { // from class: com.zentraedi.comic.activity.q5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicSubDirActivity.i5(comicInfoModel, this, (ReadingRecord) obj);
                }
            }, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h6(ComicSubDirActivity comicSubDirActivity) {
        comicSubDirActivity.T5().d0().set(Boolean.valueOf(!comicSubDirActivity.R5().T2() && Intrinsics.areEqual(comicSubDirActivity.T5().g0().get(), Boolean.FALSE)));
        comicSubDirActivity.T5().k0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit i5(ComicInfoModel comicInfoModel, final ComicSubDirActivity comicSubDirActivity, ReadingRecord readingRecord) {
        String progress;
        if (readingRecord == null || TextUtils.isEmpty(comicInfoModel.getProgress())) {
            comicSubDirActivity.runOnUiThread(new Runnable() { // from class: com.zentraedi.comic.activity.c6
                @Override // java.lang.Runnable
                public final void run() {
                    ComicSubDirActivity.j5(this.a);
                }
            });
        } else {
            NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) new Gson().fromJson(comicInfoModel.getProgress(), NasReadingRecordModule.class);
            NasReadingRecordModule nasReadingRecordModule2 = (NasReadingRecordModule) new Gson().fromJson(readingRecord.getProgress(), NasReadingRecordModule.class);
            if (nasReadingRecordModule2 != null && nasReadingRecordModule != null && nasReadingRecordModule2.getTime() > nasReadingRecordModule.getTime() && (progress = readingRecord.getProgress()) != null) {
                comicInfoModel.setProgress(progress);
            }
            comicSubDirActivity.runOnUiThread(new Runnable() { // from class: com.zentraedi.comic.activity.d6
                @Override // java.lang.Runnable
                public final void run() {
                    ComicSubDirActivity.k5(this.a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.m2 i6() {
        return new com.zentraedi.comic.viewmodel.m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j5(ComicSubDirActivity comicSubDirActivity) {
        comicSubDirActivity.V5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.g6 j6() {
        return new com.zentraedi.comic.viewmodel.g6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k5(ComicSubDirActivity comicSubDirActivity) {
        comicSubDirActivity.V5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void k6() {
        if (this.e0) {
            finish();
            return;
        }
        if (!Intrinsics.areEqual(T5().X().get(), Boolean.TRUE)) {
            com.zentraedi.comic.util.l.a.c(this.b0, new Function1() { // from class: com.zentraedi.comic.activity.b6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicSubDirActivity.l6(this.a, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        T5().P(false);
        S5().U().set(false);
        R5().X2(false);
        R5().W2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static final Unit l6(ComicSubDirActivity comicSubDirActivity, boolean z) {
        ?? r1;
        if (z) {
            ?? r2 = comicSubDirActivity;
            a.b(g0, r2, comicSubDirActivity.a0, comicSubDirActivity.c0, comicSubDirActivity.d0, com.zentraedi.business.utils.l5.z(comicSubDirActivity.b0), null, null, 96, null);
            r2.overridePendingTransition(com.zentraedi.comic.q.a.t, com.zentraedi.comic.q.a.G0);
            r1 = r2;
        } else {
            r1 = comicSubDirActivity;
        }
        r1.finish();
        r1.overridePendingTransition(com.zentraedi.comic.q.a.n0, com.zentraedi.comic.q.a.G0);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void m5(ComicSubDirActivity comicSubDirActivity, String str, String str2, Boolean bool, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        comicSubDirActivity.l5(str, str2, bool, z);
    }

    private final void m6() {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        ObservableArrayList<com.zentraedi.comic.viewmodel.l0> observableArrayListY = T5().Y();
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(observableArrayListY, 10));
        Iterator it = observableArrayListY.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((com.zentraedi.comic.viewmodel.l0) it.next()).getPath()));
        }
        nd.a.e(((BaseActivity) this).J, "onDeleteClick " + arrayList);
        Q5().b0(arrayList, new Function1() { // from class: com.zentraedi.comic.activity.i5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicSubDirActivity.n6(this.a, arrayList, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n5(ComicSubDirActivity comicSubDirActivity, View view) {
        comicSubDirActivity.y6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n6(ComicSubDirActivity comicSubDirActivity, List list, boolean z) {
        if (z) {
            comicSubDirActivity.R5().H2(comicSubDirActivity.T5().Y());
            comicSubDirActivity.k6();
            if (comicSubDirActivity.e0) {
                org.greenrobot.eventbus.c.f().q(new ComicFilesDeleteEvent(list, Boolean.TRUE));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o5(ComicSubDirActivity comicSubDirActivity, View view) {
        comicSubDirActivity.k6();
    }

    private final void o6() {
        if (TextUtils.isEmpty(T5().getPath())) {
            return;
        }
        String path = T5().getPath();
        if (path == null) {
            path = "";
        }
        final ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(path);
        ComicInfoModel comicInfoModelW = T5().W();
        if ((comicInfoModelW != null ? comicInfoModelW.getDir() : null) != null) {
            ComicDirModel dir = comicInfoModelW.getDir();
            if (Intrinsics.areEqual(dir != null ? dir.isDir() : null, "1")) {
                String path2 = T5().getPath();
                ComicDirModel dir2 = comicInfoModelW.getDir();
                if (Intrinsics.areEqual(path2, dir2 != null ? dir2.getPath() : null)) {
                    Q5().a0(arrayListArrayListOf, comicInfoModelW.getDir(), new Function1() { // from class: com.zentraedi.comic.activity.u6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ComicSubDirActivity.p6(arrayListArrayListOf, this, ((Boolean) obj).booleanValue());
                        }
                    });
                    return;
                }
            }
        }
        Q5().b0(arrayListArrayListOf, new Function1() { // from class: com.zentraedi.comic.activity.v6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicSubDirActivity.q6(arrayListArrayListOf, this, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void p5(ComicSubDirActivity comicSubDirActivity, View view) {
        com.zentraedi.comic.util.l.a.a();
        org.greenrobot.eventbus.c.f().q(new ComicFinishSubDirEvent());
        comicSubDirActivity.overridePendingTransition(com.zentraedi.comic.q.a.n0, com.zentraedi.comic.q.a.G0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit p6(ArrayList arrayList, ComicSubDirActivity comicSubDirActivity, boolean z) {
        if (z) {
            org.greenrobot.eventbus.c.f().q(new ComicFilesDeleteEvent(arrayList, Boolean.TRUE));
            comicSubDirActivity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q5(ComicSubDirActivity comicSubDirActivity, View view) {
        comicSubDirActivity.T5().h0().set(Boolean.FALSE);
        com.zentraedi.business.utils.t7.j(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.e, (String) null, 1, (Object) null), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit q6(ArrayList arrayList, ComicSubDirActivity comicSubDirActivity, boolean z) {
        if (z) {
            org.greenrobot.eventbus.c.f().q(new ComicFilesDeleteEvent(arrayList, Boolean.TRUE));
            comicSubDirActivity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r5(ComicSubDirActivity comicSubDirActivity, View view) {
        comicSubDirActivity.T5().h0().set(Boolean.FALSE);
        com.zentraedi.business.utils.t7.j(com.zentraedi.business.utils.k0.e0(com.zentraedi.comic.constant.a.e, (String) null, 1, (Object) null), Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void r6() {
        if (!com.zentraedi.business.utils.m.c() && com.zentraedi.business.permission.a.d(this, com.zentraedi.business.permission.a.i)) {
            h4(N5().getRoot(), com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.CI));
            T5().m0(new Function1() { // from class: com.zentraedi.comic.activity.g6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicSubDirActivity.s6(this.a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s5(ComicSubDirActivity comicSubDirActivity, View view) {
        if (com.zentraedi.business.utils.m.c() || Intrinsics.areEqual(comicSubDirActivity.T5().X().get(), Boolean.TRUE)) {
            return;
        }
        comicSubDirActivity.w6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s6(ComicSubDirActivity comicSubDirActivity, boolean z) {
        comicSubDirActivity.hideContentLoading(comicSubDirActivity.N5().getRoot());
        if (z) {
            comicSubDirActivity.k6();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t5(ComicSubDirActivity comicSubDirActivity, View view) {
        if (com.zentraedi.business.utils.m.c() || Intrinsics.areEqual(comicSubDirActivity.T5().X().get(), Boolean.TRUE)) {
            return;
        }
        comicSubDirActivity.A6();
    }

    private final void t6() {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        R5().W2(Intrinsics.areEqual(T5().i0().get(), Boolean.FALSE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u5(final ComicSubDirActivity comicSubDirActivity, View view) {
        if (com.zentraedi.business.utils.m.c()) {
            return;
        }
        Object obj = comicSubDirActivity.T5().X().get();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(obj, bool)) {
            return;
        }
        com.zentraedi.comic.business.a1 a1VarQ5 = comicSubDirActivity.Q5();
        Intrinsics.checkNotNull(view);
        a1VarQ5.I0(view, (1130496 & 2) != 0 ? null : (String) comicSubDirActivity.T5().getTitle().get(), (1130496 & 4) != 0 ? null : (String) comicSubDirActivity.T5().R().get(), (1130496 & 8) != 0 ? Boolean.FALSE : bool, (1130496 & 16) != 0 ? null : null, (1130496 & 32) != 0, (1130496 & 64) != 0 ? false : false, (1130496 & 128) != 0 ? Boolean.FALSE : (Boolean) comicSubDirActivity.T5().j0().get(), (1130496 & 256) != 0 ? Boolean.FALSE : bool, (1130496 & 512) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.l6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicSubDirActivity.v5(this.a);
            }
        }, (1130496 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? null : null, (1130496 & 2048) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.m6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicSubDirActivity.w5(this.a);
            }
        }, (1130496 & 4096) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.n6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicSubDirActivity.x5(this.a);
            }
        }, (1130496 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.o6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicSubDirActivity.y5(this.a);
            }
        }, (1130496 & 16384) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.q6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicSubDirActivity.z5(this.a);
            }
        }, (1130496 & 32768) != 0 ? null : null, (1130496 & 65536) != 0 ? null : null, (1130496 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0 ? null : new Function0() { // from class: com.zentraedi.comic.activity.r6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicSubDirActivity.A5(this.a);
            }
        }, (1130496 & 262144) == 0 ? comicSubDirActivity.T5().getPath() : null, (1130496 & CommonNetImpl.MAX_SEND_SIZE_IN_KB) != 0 ? Boolean.FALSE : Boolean.valueOf(comicSubDirActivity.T5().W() != null), (1130496 & ITbsReader.READER_MENU_ID_RECENT_FILE_LIST) != 0 ? Boolean.FALSE : null);
    }

    private final void u6() {
        g4();
        com.zentraedi.comic.business.m mVarO5 = O5();
        String path = T5().getPath();
        if (path == null) {
            path = "";
        }
        mVarO5.v(path, T5().W(), true, new com.zentraedi.business.listener.l() { // from class: com.zentraedi.comic.activity.s6
            public final void continueDo() {
                ComicSubDirActivity.v6(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v5(ComicSubDirActivity comicSubDirActivity) {
        comicSubDirActivity.w6();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v6(ComicSubDirActivity comicSubDirActivity) {
        comicSubDirActivity.N3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w5(ComicSubDirActivity comicSubDirActivity) {
        comicSubDirActivity.A6();
        return Unit.INSTANCE;
    }

    private final void w6() {
        com.zentraedi.comic.business.x1 x1VarP5 = P5();
        ComicInfoModel comicInfoModelW = T5().W();
        x1VarP5.F(comicInfoModelW != null ? comicInfoModelW.getId() : null, Boolean.valueOf(Intrinsics.areEqual(T5().j0().get(), Boolean.FALSE)), new Function1() { // from class: com.zentraedi.comic.activity.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicSubDirActivity.x6(this.a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x5(ComicSubDirActivity comicSubDirActivity) {
        comicSubDirActivity.D6();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x6(ComicSubDirActivity comicSubDirActivity, boolean z) {
        if (z) {
            comicSubDirActivity.T5().j0().set(Boolean.valueOf(Intrinsics.areEqual(comicSubDirActivity.T5().j0().get(), Boolean.FALSE)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y5(ComicSubDirActivity comicSubDirActivity) {
        comicSubDirActivity.o6();
        return Unit.INSTANCE;
    }

    private final void y6() {
        T5().P(true);
        S5().U().set(true);
        R5().X2(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z5(ComicSubDirActivity comicSubDirActivity) {
        comicSubDirActivity.u6();
        return Unit.INSTANCE;
    }

    private final void z6() {
        ComicDirModel dir;
        if (this.e0) {
            return;
        }
        ComicInfoModel comicInfoModel = this.f0;
        if (comicInfoModel != null) {
            com.zentraedi.comic.util.l.a.e((comicInfoModel == null || (dir = comicInfoModel.getDir()) == null) ? null : dir.getPath(), this.b0);
        } else {
            com.zentraedi.comic.util.l.a.e(this.d0, this.b0);
        }
    }

    public final void X5(int i) {
        final Drawable drawableG = com.zentraedi.basic.function.utils.a.g(i);
        com.bumptech.glide.c.F(N5().K.getContext()).J(drawableG).S0(new com.bumptech.glide.load.i[]{new com.bumptech.glide.load.resource.bitmap.m(), new com.bumptech.glide.load.resource.bitmap.g0(com.zentraedi.basic.function.utils.m0.b(5.0f))}).s().r1(N5().K);
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.zentraedi.comic.activity.a6
            @Override // java.lang.Runnable
            public final void run() {
                ComicSubDirActivity.Y5(drawableG, this);
            }
        });
    }

    public final void l5(@fo.l String str, @fo.l String str2, @fo.l Boolean bool, boolean z) {
        if (str2 == null) {
            str2 = "";
        }
        int iF = com.zentraedi.business.utils.i5.a.f(str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "_")) {
            W5(str);
            return;
        }
        String strY = com.zentraedi.comic.m.y(str2);
        if ((8 == iF || 26 == iF || iF == 10 || iF == 33) && new File(strY).exists()) {
            W5(strY);
            return;
        }
        if (3 == iF) {
            W5(str2);
            return;
        }
        if (10 == iF) {
            X5(z ? com.zentraedi.comic.q.h.Mm : com.zentraedi.comic.q.h.xm);
            return;
        }
        if (8 == iF) {
            X5(z ? com.zentraedi.comic.q.h.Km : com.zentraedi.comic.q.h.vm);
            return;
        }
        if (26 == iF) {
            X5(z ? com.zentraedi.comic.q.h.Gm : com.zentraedi.comic.q.h.rm);
            return;
        }
        if (33 == iF) {
            X5(z ? com.zentraedi.comic.q.h.Jm : com.zentraedi.comic.q.h.um);
        } else if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            a6(str2, z);
        } else {
            X5(z ? com.zentraedi.comic.q.h.Lm : com.zentraedi.comic.q.h.wm);
        }
    }

    public void onBackPressed() {
        k6();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicCoverChangeSuccessEvent(@fo.k ComicCoverChangeSuccessEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(T5().W(), event.getComicInfo())) {
            ComicInfoModel comicInfoModelW = T5().W();
            if (comicInfoModelW != null) {
                comicInfoModelW.setCover(event.getTempUrl());
            }
            ObservableField<String> observableFieldR = T5().R();
            ComicInfoModel comicInfoModelW2 = T5().W();
            observableFieldR.set(comicInfoModelW2 != null ? comicInfoModelW2.getCover() : null);
            l5((String) T5().R().get(), T5().getPath(), Boolean.TRUE, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicFinishSpecificDirEvent(@fo.k ComicFinishSpecificDirEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (TextUtils.equals(event.getDirId(), this.c0) && TextUtils.equals(event.getPath(), this.b0)) {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicFinishSubDirEvent(@fo.k ComicFinishSubDirEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        finish();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicInfoCreateEvent(@fo.k ComicInfoCreateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (TextUtils.equals(event.getInfo().getPath(), this.b0)) {
            ComicDirModel dir = event.getInfo().getDir();
            if (TextUtils.equals(dir != null ? dir.getId() : null, this.c0)) {
                this.f0 = event.getInfo();
                T5().r0(event.getInfo());
                T5().g0().set(Boolean.TRUE);
                U5();
                V5();
            }
        }
    }

    protected void onDestroy() {
        org.greenrobot.eventbus.c.f().A(this);
        super/*com.zentraedi.business.activity.BaseActivity*/.onDestroy();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onReadRecordUpdateSuccessEvent(@fo.k ReadRecordUpdateSuccessEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ComicInfoModel comicInfoModel = this.f0;
        if (TextUtils.equals(comicInfoModel != null ? comicInfoModel.getId() : null, event.getComicId())) {
            ComicInfoModel comicInfoModel2 = this.f0;
            if (comicInfoModel2 != null) {
                comicInfoModel2.setProgress(event.getProgress());
            }
            V5();
            org.greenrobot.eventbus.c.f().q(new ReadRecordUpdateSuccessForListEvent(event.getComicId(), event.getProgress(), this.b0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void r3() {
        ComicInfoModel serializableExtra;
        String stringExtra = getIntent().getStringExtra(h0);
        if (stringExtra == null) {
            stringExtra = "0";
        }
        this.a0 = stringExtra;
        this.b0 = getIntent().getStringExtra(k0);
        T5().setPath(this.b0);
        Intent intent = getIntent();
        if (intent != null && (serializableExtra = intent.getSerializableExtra(m0)) != null) {
            T5().r0(serializableExtra);
        }
        if (T5().W() != null) {
            T5().g0().set(Boolean.TRUE);
        }
        if (Intrinsics.areEqual(T5().g0().get(), Boolean.FALSE)) {
            B6();
        }
        this.c0 = getIntent().getStringExtra(i0);
        this.d0 = getIntent().getStringExtra(j0);
        ComicInfoModel serializableExtra2 = getIntent().getSerializableExtra(m0);
        if (serializableExtra2 != null) {
            this.f0 = serializableExtra2;
        }
        T5().p0(this.c0);
        String str = this.b0;
        if (str != null) {
            T5().getTitle().set(com.zentraedi.business.utils.l5.r(str));
        }
        this.e0 = getIntent().getBooleanExtra(l0, false);
        T5().X().set(Boolean.valueOf(this.e0));
        N5().E1(T5());
        N5().D1(S5());
        S5().S(this.b0);
        S5().b0(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.r5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.n5(this.a, view);
            }
        });
        I2().w().f(com.zentraedi.comic.q.i.a8, R5()).q();
        AppBarLayout appBarLayout = N5().E;
        com.zentraedi.business.listener.a aVar = new com.zentraedi.business.listener.a();
        TextView tvItem = N5().m0;
        Intrinsics.checkNotNullExpressionValue(tvItem, "tvItem");
        View root = N5().b0.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        View comicInfoCl = N5().L;
        Intrinsics.checkNotNullExpressionValue(comicInfoCl, "comicInfoCl");
        aVar.i(new View[]{tvItem, root, comicInfoCl});
        TextView title = N5().i0;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextView titleTv = N5().j0;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        aVar.f(new View[]{title, titleTv});
        appBarLayout.e(aVar);
        z6();
    }

    protected void s3() {
        org.greenrobot.eventbus.c.f().v(this);
        if (T5().W() != null) {
            U5();
        }
        h5();
        N5().F.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.t5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.o5(this.a, view);
            }
        });
        N5().V.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.b7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.p5(this.a, view);
            }
        });
        N5().G.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.c7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.D5(this.a, view);
            }
        });
        N5().W.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.j5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.E5(this.a, view);
            }
        });
        N5().J.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.k5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.F5(this.a, view);
            }
        });
        N5().S.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.l5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.G5(this.a, view);
            }
        });
        N5().T.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.m5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.H5(this.a, view);
            }
        });
        N5().g0.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.n5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.I5(this.a, view);
            }
        });
        N5().b0.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.o5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.J5(this.a, view);
            }
        });
        N5().R.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.p5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.K5(this.a, view);
            }
        });
        N5().l0.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.e6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.q5(this.a, view);
            }
        });
        N5().a0.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.p6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.r5(this.a, view);
            }
        });
        N5().h0.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.x6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.s5(this.a, view);
            }
        });
        N5().U.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.y6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.t5(this.a, view);
            }
        });
        N5().e0.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.z6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.u5(this.a, view);
            }
        });
        N5().Q.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.a7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicSubDirActivity.C5(this.a, view);
            }
        });
    }
}
