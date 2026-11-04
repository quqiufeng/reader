package com.zentraedi.comic.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.Gson;
import com.zentraedi.business.activity.BaseActivity;
import com.zentraedi.business.activity.BaseLandscapeActivity;
import com.zentraedi.business.database.ReadingRecord;
import com.zentraedi.business.event.CloseComicCompressionEvent;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.model.CompressionBrowserResponse;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.comic.data.ComicZipModel;
import com.zentraedi.comic.event.ComicFinishCompressionSubDirEvent;
import com.zentraedi.comic.event.ComicFinishSpecificDirEvent;
import com.zentraedi.comic.event.ReadRecordUpdateSuccessEvent;
import com.zentraedi.comic.model.ComicCodeBook;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicCompressionBrowserActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCompressionBrowserActivity.kt\ncom/zentraedi/comic/activity/ComicCompressionBrowserActivity\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n389#2,4:510\n389#2,4:514\n389#2,4:535\n389#2,4:539\n389#2,4:543\n774#3:518\n865#3,2:519\n774#3:521\n865#3,2:522\n360#3,7:524\n774#3:531\n865#3,2:532\n1869#3,2:547\n1#4:534\n*S KotlinDebug\n*F\n+ 1 ComicCompressionBrowserActivity.kt\ncom/zentraedi/comic/activity/ComicCompressionBrowserActivity\n*L\n118#1:510,4\n218#1:514,4\n395#1:535,4\n430#1:539,4\n181#1:543,4\n239#1:518\n239#1:519,2\n288#1:521\n288#1:522,2\n293#1:524,7\n313#1:531\n313#1:532,2\n365#1:547,2\n*E\n"})
public final class ComicCompressionBrowserActivity extends BaseLandscapeActivity {

    @fo.k
    public static final a b0 = new a(null);

    @fo.l
    private com.zentraedi.business.compression.browser.fragment.l V;

    @fo.l
    private ComicInfoModel W;

    @fo.l
    private String X;

    @fo.l
    private String Z;

    @fo.l
    private Integer a0;

    @fo.k
    private final Lazy T = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicCompressionBrowserActivity.h5(this.a);
        }
    });

    @fo.k
    private final Lazy U = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicCompressionBrowserActivity.k5();
        }
    });

    @fo.k
    private final Lazy Y = LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.activity.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComicCompressionBrowserActivity.i5(this.a);
        }
    });

    @SourceDebugExtension({"SMAP\nComicCompressionBrowserActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicCompressionBrowserActivity.kt\ncom/zentraedi/comic/activity/ComicCompressionBrowserActivity$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n1#2:510\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, Activity activity, ComicInfoModel comicInfoModel, Bundle bundle, int i, Object obj) {
            if ((i & 4) != 0) {
                bundle = null;
            }
            aVar.a(activity, comicInfoModel, bundle);
        }

        public final void a(@fo.k Activity activity, @fo.l ComicInfoModel comicInfoModel, @fo.l Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = new Intent(activity, (Class<?>) ComicCompressionBrowserActivity.class);
            intent.putExtra("info", (Serializable) comicInfoModel);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            activity.startActivityForResult(intent, 2000);
        }

        private a() {
        }
    }

    private final void G4() {
        g4();
        a5().i(new Function0() { // from class: com.zentraedi.comic.activity.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComicCompressionBrowserActivity.H4(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H4(ComicCompressionBrowserActivity comicCompressionBrowserActivity) {
        ComicCodeBook comicCodeBookF;
        String path;
        comicCompressionBrowserActivity.N3();
        com.zentraedi.business.compression.browser.fragment.l lVar = comicCompressionBrowserActivity.V;
        Object obj = null;
        if (lVar != null) {
            lVar.o3((Function0) null);
        }
        Object obj2 = null;
        for (com.zentraedi.comic.viewmodel.b0 b0Var : comicCompressionBrowserActivity.a5().h()) {
            ComicCodeBook comicCodeBookF2 = b0Var.f();
            String path2 = comicCodeBookF2 != null ? comicCodeBookF2.getPath() : null;
            ComicInfoModel comicInfoModel = comicCompressionBrowserActivity.W;
            if (TextUtils.equals(path2, comicInfoModel != null ? comicInfoModel.getPath() : null)) {
                obj = b0Var.g().get();
                break;
            }
            if (TextUtils.isEmpty((CharSequence) obj2) && (comicCodeBookF = b0Var.f()) != null && (path = comicCodeBookF.getPath()) != null) {
                ComicInfoModel comicInfoModel2 = comicCompressionBrowserActivity.W;
                String strZ = com.zentraedi.business.utils.l5.z(comicInfoModel2 != null ? comicInfoModel2.getPath() : null);
                Intrinsics.checkNotNullExpressionValue(strZ, "getParentFolderPath(...)");
                if (StringsKt.startsWith$default(path, strZ, false, 2, (Object) null)) {
                    obj2 = b0Var.g().get();
                }
            }
        }
        String str = (String) obj;
        if (str == null) {
            str = (String) obj2;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        com.zentraedi.business.compression.browser.fragment.l lVar2 = comicCompressionBrowserActivity.V;
        if (zIsEmpty) {
            if (lVar2 != null) {
                lVar2.s3();
            }
        } else if (lVar2 != null) {
            lVar2.p3(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void I4() {
        com.zentraedi.business.compression.browser.fragment.l lVar;
        CompressionBrowserResponse compressionBrowserResponseO2;
        List<FileInfoModel> list;
        ComicInfoModel comicInfoModel = this.W;
        String path = null;
        String strValueOf = String.valueOf(comicInfoModel != null ? comicInfoModel.getPath() : null);
        nd.a.e(((BaseActivity) this).J, "checkDownloadThumb zipPath=" + strValueOf);
        if (TextUtils.isEmpty(strValueOf)) {
            return;
        }
        String strY = com.zentraedi.comic.m.y(strValueOf);
        nd.a.e(((BaseActivity) this).J, "checkDownloadThumb thumbPath=" + strY);
        if ((!TextUtils.isEmpty(strY) && new File(strY).exists()) || (lVar = this.V) == null || (compressionBrowserResponseO2 = lVar.O2()) == null || (list = compressionBrowserResponseO2.getList()) == null) {
            return;
        }
        for (FileInfoModel fileInfoModel : list) {
            if (com.zentraedi.business.utils.i5.a.f(fileInfoModel.getPath()) == 3) {
                path = fileInfoModel.getPath();
                break;
            }
        }
        nd.a.e(((BaseActivity) this).J, "checkDownloadThumb firstPicture=" + path);
        if (path != null) {
            com.zentraedi.comic.b0 b0Var = com.zentraedi.comic.b0.a;
            b0Var.x(compressionBrowserResponseO2);
            b0Var.p(this, strValueOf, path);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void J4() {
        ComicDirModel dir;
        this.a0 = Integer.valueOf(getIntent().getIntExtra("fromPage", -1));
        System.out.println((Object) ("checkFromPage mFromPage " + this.a0));
        String stringExtra = getIntent().getStringExtra("parenPath");
        this.Z = stringExtra;
        if (TextUtils.isEmpty(stringExtra) && g5()) {
            d5(new Function1() { // from class: com.zentraedi.comic.activity.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicCompressionBrowserActivity.K4(this.a, (String) obj);
                }
            });
        }
        com.zentraedi.comic.util.l lVar = com.zentraedi.comic.util.l.a;
        ComicInfoModel comicInfoModel = this.W;
        lVar.e((comicInfoModel == null || (dir = comicInfoModel.getDir()) == null) ? null : dir.getPath(), c5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit K4(ComicCompressionBrowserActivity comicCompressionBrowserActivity, String str) {
        if (!TextUtils.isEmpty(str)) {
            comicCompressionBrowserActivity.Z = com.zentraedi.business.utils.l5.z(str);
            comicCompressionBrowserActivity.getIntent().putExtra("parenPath", comicCompressionBrowserActivity.Z);
        }
        return Unit.INSTANCE;
    }

    private final void L4() {
        final ComicInfoModel comicInfoModel = this.W;
        if (comicInfoModel != null) {
            ig.k.s(ig.k.a, comicInfoModel.getId(), null, new Function1() { // from class: com.zentraedi.comic.activity.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicCompressionBrowserActivity.M4(comicInfoModel, this, (ReadingRecord) obj);
                }
            }, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit M4(ComicInfoModel comicInfoModel, final ComicCompressionBrowserActivity comicCompressionBrowserActivity, ReadingRecord readingRecord) {
        String progress;
        if (readingRecord == null || TextUtils.isEmpty(comicInfoModel.getProgress())) {
            comicCompressionBrowserActivity.runOnUiThread(new Runnable() { // from class: com.zentraedi.comic.activity.t
                @Override // java.lang.Runnable
                public final void run() {
                    ComicCompressionBrowserActivity.N4(this.a);
                }
            });
        } else {
            NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) new Gson().fromJson(comicInfoModel.getProgress(), NasReadingRecordModule.class);
            NasReadingRecordModule nasReadingRecordModule2 = (NasReadingRecordModule) new Gson().fromJson(readingRecord.getProgress(), NasReadingRecordModule.class);
            if (nasReadingRecordModule2 != null && nasReadingRecordModule != null && nasReadingRecordModule2.getTime() > nasReadingRecordModule.getTime() && (progress = readingRecord.getProgress()) != null) {
                comicInfoModel.setProgress(progress);
            }
            comicCompressionBrowserActivity.runOnUiThread(new Runnable() { // from class: com.zentraedi.comic.activity.v
                @Override // java.lang.Runnable
                public final void run() {
                    ComicCompressionBrowserActivity.O4(this.a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N4(ComicCompressionBrowserActivity comicCompressionBrowserActivity) {
        comicCompressionBrowserActivity.e5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O4(ComicCompressionBrowserActivity comicCompressionBrowserActivity) {
        comicCompressionBrowserActivity.e5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P4(ComicCompressionBrowserActivity comicCompressionBrowserActivity, View view) {
        comicCompressionBrowserActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q4(ComicCompressionBrowserActivity comicCompressionBrowserActivity, View view) {
        comicCompressionBrowserActivity.m5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R4(ComicCompressionBrowserActivity comicCompressionBrowserActivity, View view) {
        comicCompressionBrowserActivity.X4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S4(ComicCompressionBrowserActivity comicCompressionBrowserActivity) {
        comicCompressionBrowserActivity.G4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T4(ComicCompressionBrowserActivity comicCompressionBrowserActivity) {
        comicCompressionBrowserActivity.L4();
        comicCompressionBrowserActivity.t5();
        comicCompressionBrowserActivity.I4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U4(ComicCompressionBrowserActivity comicCompressionBrowserActivity) {
        if (!com.zentraedi.business.utils.m.c()) {
            comicCompressionBrowserActivity.a5().r();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V4(ComicCompressionBrowserActivity comicCompressionBrowserActivity, FileInfoModel info) {
        Intrinsics.checkNotNullParameter(info, "info");
        comicCompressionBrowserActivity.p5(info);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W4(ComicCompressionBrowserActivity comicCompressionBrowserActivity, String str, String str2) {
        comicCompressionBrowserActivity.Y4(str, str2);
        return Unit.INSTANCE;
    }

    private final void X4() {
        String str;
        if (com.zentraedi.business.utils.m.c() || (str = this.X) == null || r5(str)) {
            return;
        }
        s5(str);
    }

    private final void Y4(String str, String str2) {
        if (Intrinsics.areEqual(String.valueOf(str), "N007112")) {
            u5();
        } else {
            com.zentraedi.basic.function.ui.toast.a.A(str2);
        }
    }

    private final com.zentraedi.comic.databinding.g Z4() {
        Object value = this.T.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (com.zentraedi.comic.databinding.g) value;
    }

    private final com.zentraedi.comic.dialog.k a5() {
        return (com.zentraedi.comic.dialog.k) this.Y.getValue();
    }

    private final com.zentraedi.comic.viewmodel.i0 b5() {
        return (com.zentraedi.comic.viewmodel.i0) this.U.getValue();
    }

    private final String c5() {
        String strSubstring = null;
        if (TextUtils.isEmpty(this.Z)) {
            ComicInfoModel comicInfoModel = this.W;
            if (comicInfoModel != null) {
                return comicInfoModel.getPath();
            }
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ComicInfoModel comicInfoModel2 = this.W;
        sb.append(comicInfoModel2 != null ? comicInfoModel2.getPath() : null);
        sb.append('/');
        String str = this.Z;
        if (str != null) {
            for (int lastIndex = StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
                if (str.charAt(lastIndex) != '/') {
                    strSubstring = str.substring(0, lastIndex + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                }
            }
            strSubstring = "";
        }
        sb.append(strSubstring);
        return sb.toString();
    }

    private final void d5(Function1<? super String, Unit> function1) {
        ComicInfoModel comicInfoModel = this.W;
        if (comicInfoModel == null || TextUtils.isEmpty(comicInfoModel.getProgress())) {
            return;
        }
        NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) new Gson().fromJson(comicInfoModel.getProgress(), NasReadingRecordModule.class);
        if (TextUtils.isEmpty(nasReadingRecordModule.getFilePath())) {
            function1.invoke(null);
        } else {
            function1.invoke(nasReadingRecordModule.getFilePath());
        }
    }

    private final void e5() {
        d5(new Function1() { // from class: com.zentraedi.comic.activity.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicCompressionBrowserActivity.f5(this.a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f5(ComicCompressionBrowserActivity comicCompressionBrowserActivity, String str) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            comicCompressionBrowserActivity.b5().N().set(Boolean.FALSE);
        } else {
            String strZ = com.zentraedi.business.utils.l5.z(str);
            String str2 = comicCompressionBrowserActivity.Z;
            String str3 = "";
            if (str2 != null) {
                int lastIndex = StringsKt.getLastIndex(str2);
                while (true) {
                    if (-1 >= lastIndex) {
                        strSubstring = "";
                        break;
                    }
                    if (str2.charAt(lastIndex) != '/') {
                        strSubstring = str2.substring(0, lastIndex + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        break;
                    }
                    lastIndex--;
                }
                if (strSubstring != null) {
                    str3 = strSubstring;
                }
            }
            if (TextUtils.equals(strZ, str3)) {
                comicCompressionBrowserActivity.X = str;
                TextView textView = comicCompressionBrowserActivity.Z4().G.F;
                Intrinsics.checkNotNull(str);
                textView.setText(com.zentraedi.comic.m.x(str));
                comicCompressionBrowserActivity.b5().N().set(Boolean.TRUE);
            } else {
                comicCompressionBrowserActivity.b5().N().set(Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }

    private final boolean g5() {
        Integer num;
        Integer num2;
        Integer num3 = this.a0;
        return (num3 != null && num3.intValue() == 6) || ((num = this.a0) != null && num.intValue() == 1) || ((num2 = this.a0) != null && num2.intValue() == 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final com.zentraedi.comic.databinding.g h5(ComicCompressionBrowserActivity comicCompressionBrowserActivity) {
        return (com.zentraedi.comic.databinding.g) androidx.databinding.m.l(comicCompressionBrowserActivity, com.zentraedi.comic.q.l.L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.dialog.k i5(final ComicCompressionBrowserActivity comicCompressionBrowserActivity) {
        com.zentraedi.comic.dialog.k kVar = new com.zentraedi.comic.dialog.k();
        kVar.q(new Function1() { // from class: com.zentraedi.comic.activity.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicCompressionBrowserActivity.j5(this.a, (ComicCodeBook) obj);
            }
        });
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j5(ComicCompressionBrowserActivity comicCompressionBrowserActivity, ComicCodeBook comicCodeBook) {
        if (comicCodeBook != null) {
            com.zentraedi.business.compression.browser.fragment.l lVar = comicCompressionBrowserActivity.V;
            if (lVar != null) {
                lVar.p3(comicCodeBook.getSecret());
            }
            com.zentraedi.business.compression.browser.fragment.l lVar2 = comicCompressionBrowserActivity.V;
            if (lVar2 != null) {
                lVar2.j3(comicCodeBook.getSecret());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.zentraedi.comic.viewmodel.i0 k5() {
        return new com.zentraedi.comic.viewmodel.i0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void l5() {
        String strSubstring;
        if (TextUtils.isEmpty(this.Z)) {
            return;
        }
        String str = this.Z;
        if (str != null) {
            int lastIndex = StringsKt.getLastIndex(str);
            while (true) {
                if (-1 >= lastIndex) {
                    strSubstring = "";
                    break;
                } else {
                    if (str.charAt(lastIndex) != '/') {
                        strSubstring = str.substring(0, lastIndex + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        break;
                    }
                    lastIndex--;
                }
            }
        } else {
            strSubstring = null;
        }
        String strZ = com.zentraedi.business.utils.l5.z(strSubstring);
        Integer num = TextUtils.isEmpty(strZ) ? null : this.a0;
        a aVar = b0;
        ComicInfoModel comicInfoModel = this.W;
        com.zentraedi.business.utils.l0 l0Var = com.zentraedi.business.utils.l0.a;
        com.zentraedi.business.compression.browser.fragment.l lVar = this.V;
        String strV2 = lVar != null ? lVar.V2() : null;
        com.zentraedi.business.compression.browser.fragment.l lVar2 = this.V;
        aVar.a(this, comicInfoModel, l0Var.c(strZ, strV2, lVar2 != null ? lVar2.M2() : null, num));
        overridePendingTransition(com.zentraedi.comic.q.a.t, com.zentraedi.comic.q.a.G0);
    }

    private final void m5() {
        com.zentraedi.comic.util.l.a.b();
        org.greenrobot.eventbus.c.f().q(new ComicFinishCompressionSubDirEvent());
    }

    private final void n5() {
        com.zentraedi.comic.util.l.a.c(c5(), new Function1() { // from class: com.zentraedi.comic.activity.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComicCompressionBrowserActivity.o5(this.a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.zentraedi.comic.activity.ComicCompressionBrowserActivity] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final Unit o5(ComicCompressionBrowserActivity comicCompressionBrowserActivity, boolean z) {
        ComicCompressionBrowserActivity comicCompressionBrowserActivity2;
        ?? r2;
        if (!z) {
            comicCompressionBrowserActivity2 = comicCompressionBrowserActivity;
            if (comicCompressionBrowserActivity2.g5()) {
                r2 = comicCompressionBrowserActivity2;
                comicCompressionBrowserActivity2.l5();
                r2 = comicCompressionBrowserActivity2;
            }
        } else if (TextUtils.isEmpty(comicCompressionBrowserActivity.Z)) {
            ComicInfoModel comicInfoModel = comicCompressionBrowserActivity.W;
            if (comicInfoModel != null) {
                String strZ = com.zentraedi.business.utils.l5.z(comicInfoModel.getPath());
                org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
                ComicDirModel dir = comicInfoModel.getDir();
                cVarF.q(new ComicFinishSpecificDirEvent(dir != null ? dir.getId() : null, strZ));
                ComicSubDirActivity.a aVar = ComicSubDirActivity.g0;
                ComicDirModel dir2 = comicInfoModel.getDir();
                String id2 = dir2 != null ? dir2.getId() : null;
                ComicDirModel dir3 = comicInfoModel.getDir();
                ?? r3 = comicCompressionBrowserActivity;
                ComicSubDirActivity.a.b(aVar, r3, null, id2, dir3 != null ? dir3.getPath() : null, strZ, null, null, 96, null);
                r3.overridePendingTransition(com.zentraedi.comic.q.a.t, com.zentraedi.comic.q.a.G0);
                r2 = r3;
            } else {
                r2 = comicCompressionBrowserActivity;
            }
        } else {
            ComicCompressionBrowserActivity comicCompressionBrowserActivity3 = comicCompressionBrowserActivity;
            comicCompressionBrowserActivity3.l5();
            r2 = comicCompressionBrowserActivity3;
        }
        r2 = comicCompressionBrowserActivity2;
        r2.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void p5(FileInfoModel fileInfoModel) {
        ArrayList arrayList;
        String progress;
        ComicZipModel comicZipModel = null;
        Integer numValueOf = null;
        if (fileInfoModel.isDir()) {
            a aVar = b0;
            ComicInfoModel comicInfoModel = this.W;
            com.zentraedi.business.utils.l0 l0Var = com.zentraedi.business.utils.l0.a;
            String path = fileInfoModel.getPath();
            com.zentraedi.business.compression.browser.fragment.l lVar = this.V;
            String strV2 = lVar != null ? lVar.V2() : null;
            com.zentraedi.business.compression.browser.fragment.l lVar2 = this.V;
            aVar.a(this, comicInfoModel, com.zentraedi.business.utils.l0.d(l0Var, path, strV2, lVar2 != null ? lVar2.M2() : null, (Integer) null, 8, (Object) null));
            return;
        }
        int iF = com.zentraedi.business.utils.i5.a.f(fileInfoModel.getPath());
        nd.a.e(((BaseActivity) this).J, "onItemClick path=" + fileInfoModel.getPath() + ", name=" + fileInfoModel.getName() + ", fileType=" + iF + ", isDir=" + fileInfoModel.isDir());
        if (iF == 10) {
            final com.zentraedi.business.dialog.n nVar = new com.zentraedi.business.dialog.n(this);
            nVar.L().E(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Ps2));
            nVar.s(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.FK));
            nVar.J((CharSequence) null, new View.OnClickListener() { // from class: com.zentraedi.comic.activity.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ComicCompressionBrowserActivity.q5(nVar, view);
                }
            });
            nVar.show();
            return;
        }
        if (iF != 26 && iF != 8 && iF != 3 && iF != 33) {
            com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.EK));
            return;
        }
        if (this.W == null) {
            return;
        }
        com.zentraedi.business.compression.browser.fragment.l lVar3 = this.V;
        Intrinsics.checkNotNull(lVar3);
        CompressionBrowserResponse compressionBrowserResponseO2 = lVar3.O2();
        if (compressionBrowserResponseO2 != null) {
            List list = compressionBrowserResponseO2.getList();
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (com.zentraedi.business.utils.i5.a.f(((FileInfoModel) obj).getPath()) == iF) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            compressionBrowserResponseO2.setList(arrayList);
            com.zentraedi.comic.b0.a.x(compressionBrowserResponseO2);
            Gson gsonB = com.zentraedi.basic.component.utils.a.b();
            ComicInfoModel comicInfoModel2 = this.W;
            if (comicInfoModel2 == null || (progress = comicInfoModel2.getProgress()) == null) {
                progress = "";
            }
            NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) gsonB.fromJson(progress, NasReadingRecordModule.class);
            if (nasReadingRecordModule != null) {
                List list2 = compressionBrowserResponseO2.getList();
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        } else if (Intrinsics.areEqual(((FileInfoModel) it.next()).getPath(), fileInfoModel.getPath())) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    numValueOf = Integer.valueOf(i);
                }
                String path2 = fileInfoModel.getPath();
                nasReadingRecordModule.setFilePath(path2 != null ? path2 : "");
                nasReadingRecordModule.setPosition(numValueOf != null ? numValueOf.intValue() : 0);
                ComicInfoModel comicInfoModel3 = this.W;
                if (comicInfoModel3 != null) {
                    String json = com.zentraedi.basic.component.utils.a.b().toJson(nasReadingRecordModule);
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    comicInfoModel3.setProgress(json);
                }
            }
            String path3 = compressionBrowserResponseO2.getPath();
            Intrinsics.checkNotNull(path3);
            ComicInfoModel comicInfoModel4 = this.W;
            Intrinsics.checkNotNull(comicInfoModel4);
            comicZipModel = new ComicZipModel(path3, comicInfoModel4, fileInfoModel);
        }
        ComicReaderActivity.x5.a(this, comicZipModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q5(com.zentraedi.business.dialog.n nVar, View view) {
        nVar.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean r5(String str) {
        String strSubstring;
        if (!StringsKt.contains$default(str, '/', false, 2, (Object) null) && TextUtils.isEmpty(this.Z)) {
            return false;
        }
        String strZ = com.zentraedi.business.utils.l5.z(str);
        String str2 = this.Z;
        String str3 = "";
        if (str2 != null) {
            int lastIndex = StringsKt.getLastIndex(str2);
            while (true) {
                if (-1 >= lastIndex) {
                    strSubstring = "";
                    break;
                }
                if (str2.charAt(lastIndex) != '/') {
                    strSubstring = str2.substring(0, lastIndex + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    break;
                }
                lastIndex--;
            }
            if (strSubstring != null) {
                str3 = strSubstring;
            }
        }
        if (TextUtils.equals(strZ, str3)) {
            return false;
        }
        a aVar = b0;
        ComicInfoModel comicInfoModel = this.W;
        com.zentraedi.business.utils.l0 l0Var = com.zentraedi.business.utils.l0.a;
        com.zentraedi.business.compression.browser.fragment.l lVar = this.V;
        String strV2 = lVar != null ? lVar.V2() : null;
        com.zentraedi.business.compression.browser.fragment.l lVar2 = this.V;
        aVar.a(this, comicInfoModel, l0Var.c(strZ, strV2, lVar2 != null ? lVar2.M2() : null, 100));
        org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
        ComicInfoModel comicInfoModel2 = this.W;
        String id2 = comicInfoModel2 != null ? comicInfoModel2.getId() : null;
        ComicInfoModel comicInfoModel3 = this.W;
        cVarF.q(new CloseComicCompressionEvent(id2, comicInfoModel3 != null ? comicInfoModel3.getPath() : null, (Integer) null, 4, (DefaultConstructorMarker) null));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void s5(String str) {
        ArrayList arrayList;
        FileInfoModel fileInfoModel;
        CompressionBrowserResponse compressionBrowserResponseO2;
        List list;
        int iF = com.zentraedi.business.utils.i5.a.f(str);
        nd.a.e(((BaseActivity) this).J, "openReadActivity path=" + str + ", fileType=" + iF + ", parentPath=" + this.Z);
        com.zentraedi.business.compression.browser.fragment.l lVar = this.V;
        Intrinsics.checkNotNull(lVar);
        CompressionBrowserResponse compressionBrowserResponseO3 = lVar.O2();
        ComicZipModel comicZipModel = null;
        numValueOf = null;
        numValueOf = null;
        Integer numValueOf = null;
        if (compressionBrowserResponseO3 != null) {
            List list2 = compressionBrowserResponseO3.getList();
            if (list2 != null) {
                arrayList = new ArrayList();
                fileInfoModel = null;
                for (Object obj : list2) {
                    FileInfoModel fileInfoModel2 = (FileInfoModel) obj;
                    if (TextUtils.equals(str, fileInfoModel2.getPath())) {
                        fileInfoModel = fileInfoModel2;
                    }
                    if (com.zentraedi.business.utils.i5.a.f(fileInfoModel2.getPath()) == iF) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
                fileInfoModel = null;
            }
            compressionBrowserResponseO3.setList(arrayList);
            if (fileInfoModel == null && !com.zentraedi.basic.function.utils.j0.l(compressionBrowserResponseO3.getList())) {
                List list3 = compressionBrowserResponseO3.getList();
                fileInfoModel = list3 != null ? (FileInfoModel) list3.get(0) : null;
            }
            if (fileInfoModel == null) {
                String str2 = ((BaseActivity) this).J;
                StringBuilder sb = new StringBuilder();
                sb.append("openReadActivity no matched item path=");
                sb.append(str);
                sb.append(", fileType=");
                sb.append(iF);
                sb.append(", listSize=");
                com.zentraedi.business.compression.browser.fragment.l lVar2 = this.V;
                if (lVar2 != null && (compressionBrowserResponseO2 = lVar2.O2()) != null && (list = compressionBrowserResponseO2.getList()) != null) {
                    numValueOf = Integer.valueOf(list.size());
                }
                sb.append(numValueOf);
                nd.a.c(str2, sb.toString());
                com.zentraedi.basic.function.ui.toast.a.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.wK));
                return;
            }
            com.zentraedi.comic.b0.a.x(compressionBrowserResponseO3);
            String str3 = ((BaseActivity) this).J;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("openReadActivity launch reader zipPath=");
            sb2.append(compressionBrowserResponseO3.getPath());
            sb2.append(", selectedPath=");
            sb2.append(fileInfoModel.getPath());
            sb2.append(", selectedName=");
            sb2.append(fileInfoModel.getName());
            sb2.append(", listSize=");
            List list4 = compressionBrowserResponseO3.getList();
            sb2.append(list4 != null ? Integer.valueOf(list4.size()) : null);
            nd.a.e(str3, sb2.toString());
            String path = compressionBrowserResponseO3.getPath();
            Intrinsics.checkNotNull(path);
            ComicInfoModel comicInfoModel = this.W;
            Intrinsics.checkNotNull(comicInfoModel);
            comicZipModel = new ComicZipModel(path, comicInfoModel, fileInfoModel);
        }
        ComicReaderActivity.x5.a(this, comicZipModel);
    }

    private final void t5() {
        String strV2;
        ComicInfoModel comicInfoModel;
        String path;
        com.zentraedi.business.compression.browser.fragment.l lVar = this.V;
        if (lVar == null || (strV2 = lVar.V2()) == null || (comicInfoModel = this.W) == null || (path = comicInfoModel.getPath()) == null) {
            return;
        }
        if (a5().h().isEmpty()) {
            b5().L(path, strV2);
            return;
        }
        ArrayList<com.zentraedi.comic.viewmodel.b0> arrayListH = a5().h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListH) {
            ComicCodeBook comicCodeBookF = ((com.zentraedi.comic.viewmodel.b0) obj).f();
            if (TextUtils.equals(comicCodeBookF != null ? comicCodeBookF.getPath() : null, path)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            b5().L(path, strV2);
            return;
        }
        ComicCodeBook comicCodeBookF2 = ((com.zentraedi.comic.viewmodel.b0) arrayList.get(0)).f();
        if (comicCodeBookF2 != null) {
            b5().M(comicCodeBookF2, strV2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void u5() {
        final com.zentraedi.business.dialog.n nVar = new com.zentraedi.business.dialog.n(this);
        nVar.L().E(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.WK));
        nVar.s(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.bM));
        nVar.w(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.cz), new View.OnClickListener() { // from class: com.zentraedi.comic.activity.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicCompressionBrowserActivity.v5(nVar, this, view);
            }
        });
        nVar.A(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.kJ), new View.OnClickListener() { // from class: com.zentraedi.comic.activity.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicCompressionBrowserActivity.w5(nVar, this, view);
            }
        });
        nVar.e(true);
        nVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v5(com.zentraedi.business.dialog.n nVar, ComicCompressionBrowserActivity comicCompressionBrowserActivity, View view) {
        nVar.dismiss();
        comicCompressionBrowserActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void w5(com.zentraedi.business.dialog.n nVar, ComicCompressionBrowserActivity comicCompressionBrowserActivity, View view) {
        nVar.dismiss();
        comicCompressionBrowserActivity.setResult(2023, comicCompressionBrowserActivity.getIntent());
        comicCompressionBrowserActivity.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        com.zentraedi.comic.util.l.a.d(c5());
        super/*android.app.Activity*/.finish();
        overridePendingTransition(com.zentraedi.comic.q.a.n0, com.zentraedi.comic.q.a.G0);
    }

    public void onBackPressed() {
        n5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onCloseComicCompressionEvent(@fo.k CloseComicCompressionEvent event) {
        ComicInfoModel comicInfoModel;
        Intrinsics.checkNotNullParameter(event, "event");
        ComicInfoModel comicInfoModel2 = this.W;
        String id2 = comicInfoModel2 != null ? comicInfoModel2.getId() : null;
        ComicInfoModel comicInfoModel3 = this.W;
        if (event.isSelfZip(id2, comicInfoModel3 != null ? comicInfoModel3.getPath() : null)) {
            if (event.closeAnyway()) {
                finish();
                return;
            }
            if (event.openZipParent() && (comicInfoModel = this.W) != null) {
                String strZ = com.zentraedi.business.utils.l5.z(comicInfoModel.getPath());
                org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
                ComicDirModel dir = comicInfoModel.getDir();
                cVarF.q(new ComicFinishSpecificDirEvent(dir != null ? dir.getId() : null, strZ));
                ComicSubDirActivity.a aVar = ComicSubDirActivity.g0;
                ComicDirModel dir2 = comicInfoModel.getDir();
                String id3 = dir2 != null ? dir2.getId() : null;
                ComicDirModel dir3 = comicInfoModel.getDir();
                ComicSubDirActivity.a.b(aVar, this, null, id3, dir3 != null ? dir3.getPath() : null, strZ, null, null, 96, null);
                overridePendingTransition(com.zentraedi.comic.q.a.t, com.zentraedi.comic.q.a.G0);
                finish();
            }
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onComicFinishCompressionSubDirEvent(@fo.k ComicFinishCompressionSubDirEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        finish();
    }

    protected void onDestroy() {
        org.greenrobot.eventbus.c.f().A(this);
        super/*com.zentraedi.business.activity.BaseActivity*/.onDestroy();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public final void onReadRecordUpdateSuccessEvent(@fo.k ReadRecordUpdateSuccessEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ComicInfoModel comicInfoModel = this.W;
        if (TextUtils.equals(comicInfoModel != null ? comicInfoModel.getId() : null, event.getComicId())) {
            ComicInfoModel comicInfoModel2 = this.W;
            if (comicInfoModel2 != null) {
                comicInfoModel2.setProgress(event.getProgress());
            }
            e5();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void r3() {
        ComicInfoModel serializableExtra = getIntent().getSerializableExtra("info");
        if (serializableExtra == null) {
            finish();
            serializableExtra = Unit.INSTANCE;
        }
        this.W = serializableExtra;
        J4();
        Z4().C1(b5());
        AppBarLayout appBarLayout = Z4().E;
        com.zentraedi.business.listener.a aVar = new com.zentraedi.business.listener.a();
        TextView tvItem = Z4().K;
        Intrinsics.checkNotNullExpressionValue(tvItem, "tvItem");
        View root = Z4().G.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        aVar.i(new View[]{tvItem, root});
        TextView tvNavTitle = Z4().L;
        Intrinsics.checkNotNullExpressionValue(tvNavTitle, "tvNavTitle");
        aVar.f(new View[]{tvNavTitle});
        appBarLayout.e(aVar);
        Z4().H.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicCompressionBrowserActivity.P4(this.a, view);
            }
        });
        Z4().I.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicCompressionBrowserActivity.Q4(this.a, view);
            }
        });
        Z4().G.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.activity.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComicCompressionBrowserActivity.R4(this.a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void s3() {
        String strSubstring;
        String strR;
        org.greenrobot.eventbus.c.f().v(this);
        ComicInfoModel comicInfoModel = this.W;
        if (comicInfoModel != null) {
            if (TextUtils.isEmpty(this.Z)) {
                strR = com.zentraedi.business.utils.l5.r(comicInfoModel.getPath());
            } else {
                String str = this.Z;
                if (str != null) {
                    int lastIndex = StringsKt.getLastIndex(str);
                    while (true) {
                        if (-1 >= lastIndex) {
                            strSubstring = "";
                            break;
                        } else {
                            if (str.charAt(lastIndex) != '/') {
                                strSubstring = str.substring(0, lastIndex + 1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                break;
                            }
                            lastIndex--;
                        }
                    }
                } else {
                    strSubstring = null;
                }
                strR = com.zentraedi.business.utils.l5.r(strSubstring);
            }
            b5().getTitle().set(com.zentraedi.basic.function.utils.a.p(com.zentraedi.comic.q.C0124q.Pr1, strR));
            com.zentraedi.business.utils.l0 l0Var = com.zentraedi.business.utils.l0.a;
            String path = comicInfoModel.getPath();
            Boolean bool = Boolean.TRUE;
            Intent intent = getIntent();
            this.V = l0Var.a(path, bool, intent != null ? intent.getExtras() : null);
        }
        com.zentraedi.business.compression.browser.fragment.l lVar = this.V;
        if (lVar != null) {
            lVar.i3(new com.zentraedi.comic.util.b());
            I2().w().f(com.zentraedi.comic.q.i.a8, lVar).q();
            lVar.o3(new Function0() { // from class: com.zentraedi.comic.activity.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ComicCompressionBrowserActivity.S4(this.a);
                }
            });
            lVar.n3(new Function0() { // from class: com.zentraedi.comic.activity.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ComicCompressionBrowserActivity.T4(this.a);
                }
            });
            lVar.r3(new Function0() { // from class: com.zentraedi.comic.activity.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ComicCompressionBrowserActivity.U4(this.a);
                }
            });
            lVar.m3(new Function1() { // from class: com.zentraedi.comic.activity.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComicCompressionBrowserActivity.V4(this.a, (FileInfoModel) obj);
                }
            });
            lVar.l3(new Function2() { // from class: com.zentraedi.comic.activity.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComicCompressionBrowserActivity.W4(this.a, (String) obj, (String) obj2);
                }
            });
        }
    }
}
