package com.zentraedi.comic.util;

import android.app.Activity;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.zentraedi.business.model.ComicDirModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.model.CompressionBrowserResponse;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.request.NasReadingRecordModule;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.l5;
import com.zentraedi.comic.activity.ComicReaderActivity;
import com.zentraedi.comic.b0;
import com.zentraedi.comic.data.ComicZipModel;
import com.zentraedi.comic.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nComicSubDirUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComicSubDirUtil.kt\ncom/zentraedi/comic/util/ComicSubDirUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
public final class l {

    @fo.k
    private static final String b = "ComicSubDirUtil";

    @fo.l
    private static String c;

    @fo.l
    private static ComicInfoModel d;

    @fo.k
    public static final l a = new l();

    @fo.k
    private static final Stack<String> e = new Stack<>();

    private l() {
    }

    public final void a() {
        b();
        h();
    }

    public final void b() {
        List<FileInfoModel> arrayList;
        FileInfoModel fileInfoModel;
        List list;
        ComicZipModel comicZipModel = d;
        if (comicZipModel != null) {
            Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
            if (i5.a.f(comicZipModel.getPath()) == 10) {
                NasReadingRecordModule nasReadingRecordModule = (NasReadingRecordModule) new Gson().fromJson(comicZipModel.getProgress(), NasReadingRecordModule.class);
                if (TextUtils.isEmpty(nasReadingRecordModule.getFilePath())) {
                    CompressionBrowserResponse compressionBrowserResponseT = b0.a.t();
                    fileInfoModel = (compressionBrowserResponseT == null || (list = compressionBrowserResponseT.getList()) == null) ? null : (FileInfoModel) list.get(0);
                } else {
                    CompressionBrowserResponse compressionBrowserResponseT2 = b0.a.t();
                    if (compressionBrowserResponseT2 == null || (arrayList = compressionBrowserResponseT2.getList()) == null) {
                        arrayList = new ArrayList();
                    }
                    FileInfoModel fileInfoModel2 = null;
                    for (FileInfoModel fileInfoModel3 : arrayList) {
                        if (TextUtils.equals(nasReadingRecordModule.getFilePath(), fileInfoModel3.getPath())) {
                            fileInfoModel2 = fileInfoModel3;
                        }
                    }
                    fileInfoModel = fileInfoModel2;
                }
                CompressionBrowserResponse compressionBrowserResponseT3 = b0.a.t();
                String strValueOf = String.valueOf(compressionBrowserResponseT3 != null ? compressionBrowserResponseT3.getPath() : null);
                if (fileInfoModel == null) {
                    fileInfoModel = new FileInfoModel();
                }
                comicZipModel = new ComicZipModel(strValueOf, comicZipModel, fileInfoModel);
            }
            ComicReaderActivity.a aVar = ComicReaderActivity.x5;
            Intrinsics.checkNotNull(activityE);
            aVar.a(activityE, comicZipModel);
            activityE.overridePendingTransition(q.a.t, q.a.G0);
        }
    }

    public final void c(@fo.l String str, @fo.k Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        nd.a.e(b, "finishSubDirStrategy currentPath=" + str);
        if (d == null || TextUtils.isEmpty(c)) {
            h();
            callback.invoke(Boolean.FALSE);
            return;
        }
        if (TextUtils.equals(c, str)) {
            a();
            callback.invoke(Boolean.FALSE);
            return;
        }
        String str2 = c;
        Stack<String> stack = e;
        if (!TextUtils.equals(str2, stack.peek())) {
            stack.pop();
        }
        nd.a.e(b, "finishSubDirStrategy mStack=" + stack);
        if (stack.isEmpty()) {
            callback.invoke(Boolean.TRUE);
            return;
        }
        if (TextUtils.equals(stack.peek(), l5.z(str))) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.TRUE);
        }
    }

    public final void d(@fo.l String str) {
        Stack<String> stack = e;
        if (stack.isEmpty()) {
            return;
        }
        if (TextUtils.equals(str, c)) {
            h();
        }
        if (str != null) {
            stack.remove(str);
        }
        nd.a.e(b, "justRemovePath path=" + str + ", mTopLevelDir=" + c + ", mStack=" + stack);
    }

    public final void e(@fo.l String str, @fo.l String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(c)) {
            c = str;
        }
        Stack<String> stack = e;
        if ((stack.empty() || !TextUtils.equals(stack.peek(), str2)) && str2 != null) {
            stack.push(str2);
        }
        nd.a.e(b, "mTopLevelDir=" + c + ", mStack=" + stack);
    }

    public final void f(@fo.k ComicInfoModel comicInfo, @fo.k Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(comicInfo, "comicInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        nd.a.e(b, "comicInfo=" + comicInfo.toJsonStr());
        d = comicInfo;
        if (!TextUtils.isEmpty(c)) {
            callback.invoke(Boolean.valueOf(e.isEmpty()));
            return;
        }
        if (comicInfo.isOfflineData()) {
            e(comicInfo.getOfflineDataTopLevelPath(), null);
        } else {
            ComicDirModel dir = comicInfo.getDir();
            e(dir != null ? dir.getPath() : null, null);
        }
        callback.invoke(Boolean.TRUE);
    }

    public final void g() {
        d = null;
    }

    public final void h() {
        c = null;
        d = null;
        e.clear();
    }

    public final void i(@fo.l String str, @fo.l String str2) {
        ComicInfoModel comicInfoModel;
        if (str2 != null) {
            ComicInfoModel comicInfoModel2 = d;
            if (!TextUtils.equals(str, comicInfoModel2 != null ? comicInfoModel2.getId() : null) || (comicInfoModel = d) == null) {
                return;
            }
            comicInfoModel.setProgress(str2);
        }
    }

    public final void j(@fo.l String str, @fo.l String str2) {
        ComicInfoModel comicInfoModel;
        if (str2 != null) {
            ComicInfoModel comicInfoModel2 = d;
            if (!TextUtils.equals(str, comicInfoModel2 != null ? comicInfoModel2.getPath() : null) || (comicInfoModel = d) == null) {
                return;
            }
            comicInfoModel.setProgress(str2);
        }
    }
}
