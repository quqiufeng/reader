package com.zspace.mobi;

import android.app.Activity;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.basic.function.utils.r;
import com.zentraedi.business.manager.e;
import com.zentraedi.business.manager.f;
import com.zentraedi.business.n;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.request.BookConvertRequest;
import com.zentraedi.business.utils.l5;
import fo.k;
import fo.l;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes11.dex */
public final class MobiUtilBusiness {

    @k
    public static final MobiUtilBusiness INSTANCE = new MobiUtilBusiness();

    @k
    private static final String TAG = "nas_book";

    private MobiUtilBusiness() {
    }

    public static /* synthetic */ String convertToEpub$default(MobiUtilBusiness mobiUtilBusiness, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return mobiUtilBusiness.convertToEpub(str, str2, str3);
    }

    public static /* synthetic */ void convertToEpubByNas$default(MobiUtilBusiness mobiUtilBusiness, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        mobiUtilBusiness.convertToEpubByNas(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit convertToEpubByNas$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit convertToEpubByNasSync$lambda$0(Ref.BooleanRef booleanRef, CountDownLatch countDownLatch, boolean z) {
        booleanRef.element = z;
        countDownLatch.countDown();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String getEpubPath$default(MobiUtilBusiness mobiUtilBusiness, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return mobiUtilBusiness.getEpubPath(str, str2, z);
    }

    @l
    public final String convertToEpub(@k String str, @l String str2, @l String str3) {
        Intrinsics.checkNotNullParameter(str, "mobiPath");
        pd.a.e(TAG, "convertToEpub mobiPath=" + str + ", targetFolder=" + str2 + ", nasFilePath=" + str3 + ' ' + Thread.currentThread().getName());
        if (str.length() == 0) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = getFileConvertDirPath();
        }
        String str4 = str2;
        String epubPath = getEpubPath(str, str4, true);
        pd.a.e(TAG, "convertToEpub epubPathByNas=" + epubPath);
        File file2 = new File(epubPath);
        if (file2.exists() && file2.lastModified() > file.lastModified()) {
            pd.a.e(TAG, "convertToEpub epubFileByNas文件已存在且未过期 epubPathByNas=" + epubPath);
            return epubPath;
        }
        if (!NasConnectManager.getInstance().isOfflineLogin() && convertToEpubByNasSync(epubPath, str3)) {
            return epubPath;
        }
        String epubPath$default = getEpubPath$default(this, str, str4, false, 4, null);
        pd.a.e(TAG, "convertToEpub epubPath=" + epubPath$default);
        File file3 = new File(epubPath$default);
        if (file3.exists()) {
            if (file3.lastModified() > file.lastModified()) {
                pd.a.e(TAG, "convertToEpub epub文件已存在且未过期 epubPath=" + epubPath$default);
                return epubPath$default;
            }
            pd.a.e(TAG, "convertToEpub epub文件已过期，尝试删除 epubPath=" + epubPath$default);
            file3.delete();
        }
        ZspaceMobiJni.mobiDebug(false);
        pd.a.e(TAG, "convertToEpub 开始转换 mobiPath=" + str);
        int iConvertToEpub = ZspaceMobiJni.convertToEpub(str, epubPath$default);
        pd.a.e(TAG, "convertToEpub 转换结束 result=" + iConvertToEpub + " mobiPath=" + str);
        if (iConvertToEpub == 0) {
            try {
                Thread.sleep(500L);
            } catch (Exception unused) {
            }
            if (file3.exists()) {
                pd.a.e(TAG, "convertToEpub epub文件存在 epubFile=" + file3);
                return epubPath$default;
            }
            pd.a.i(TAG, "convertToEpub epub文件不存在 epubFile=" + file3);
        }
        return null;
    }

    public final void convertToEpubByNas(@k String str, @l String str2, @l String str3) {
        Intrinsics.checkNotNullParameter(str, "localFilePath");
        pd.a.e(TAG, "convertToEpub localFilePath=" + str + ", targetFolder=" + str2 + ", nasFilePath=" + str3);
        if (StringsKt.isBlank(str) || str3 == null || StringsKt.isBlank(str3)) {
            return;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = getFileConvertDirPath();
        }
        String epubPath = getEpubPath(str, str2, true);
        pd.a.e(TAG, "convertToEpub epubPathByNas=" + epubPath);
        if (!new File(epubPath).exists()) {
            convertToEpubByNas(epubPath, str3, new Function1() { // from class: com.zspace.mobi.b
                public final Object invoke(Object obj) {
                    return MobiUtilBusiness.convertToEpubByNas$lambda$0(((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        pd.a.e(TAG, "convertToEpub epubFileByNas文件已存在 epubPathByNas=" + epubPath);
    }

    public final boolean convertToEpubByNasSync(@k String str, @l String str2) {
        Intrinsics.checkNotNullParameter(str, "epubPath");
        if (StringsKt.isBlank(str) || str2 == null || StringsKt.isBlank(str2) || !n.a.w(str2)) {
            return false;
        }
        if (new File(str).exists()) {
            pd.a.e(TAG, "convertToEpubByNasSync epubFileByNas文件已存在 epubPathByNas=" + str);
            return true;
        }
        pd.a.e(TAG, "convertToEpubByNasSync 获取服务器转换后的epub文件");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        convertToEpubByNas(str, str2, new Function1() { // from class: com.zspace.mobi.a
            public final Object invoke(Object obj) {
                return MobiUtilBusiness.convertToEpubByNasSync$lambda$0(booleanRef, countDownLatch, ((Boolean) obj).booleanValue());
            }
        });
        try {
            countDownLatch.await();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return booleanRef.element;
    }

    @k
    public final String getComicConvertDirPath() {
        String strLoginUserName = NasConnectManager.getInstance().loginUserName();
        String nasId = NasConnectManager.getInstance().getNasId();
        StringBuilder sb = new StringBuilder();
        sb.append(com.zentraedi.basic.function.utils.a.a().getCacheDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("mobi");
        sb.append(str);
        sb.append(nasId);
        sb.append(str);
        sb.append(strLoginUserName);
        sb.append(str);
        sb.append("comic");
        return sb.toString();
    }

    @k
    public final String getConvertEpubParentPath(@k String str, @k String str2) {
        Intrinsics.checkNotNullParameter(str, "mobiPath");
        Intrinsics.checkNotNullParameter(str2, "targetFolder");
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        String str3 = File.separator;
        sb.append(str3);
        sb.append(r.a(str));
        sb.append(str3);
        return sb.toString();
    }

    @k
    public final String getEpubPath(@k String str, @k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "mobiPath");
        Intrinsics.checkNotNullParameter(str2, "targetFolder");
        File file = new File(getConvertEpubParentPath(str, str2));
        if (!file.exists()) {
            file.mkdirs();
        }
        String strR = l5.r(str);
        Intrinsics.checkNotNullExpressionValue(strR, "getFileName(...)");
        String strSubstringBeforeLast$default = StringsKt.substringBeforeLast$default(strR, ".", (String) null, 2, (Object) null);
        StringBuilder sb = new StringBuilder();
        sb.append(strSubstringBeforeLast$default);
        sb.append(z ? "-nas" : "");
        return file.getAbsolutePath() + File.separator + sb.toString() + ".epub";
    }

    @k
    public final String getFileConvertDirPath() {
        String strLoginUserName = NasConnectManager.getInstance().loginUserName();
        String nasId = NasConnectManager.getInstance().getNasId();
        StringBuilder sb = new StringBuilder();
        sb.append(com.zentraedi.basic.function.utils.a.a().getCacheDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("mobi");
        sb.append(str);
        sb.append(nasId);
        sb.append(str);
        sb.append(strLoginUserName);
        sb.append(str);
        sb.append("file");
        return sb.toString();
    }

    @k
    public final String getReaderConvertDirPath() {
        String strLoginUserName = NasConnectManager.getInstance().loginUserName();
        String nasId = NasConnectManager.getInstance().getNasId();
        StringBuilder sb = new StringBuilder();
        sb.append(com.zentraedi.basic.function.utils.a.a().getCacheDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("mobi");
        sb.append(str);
        sb.append(nasId);
        sb.append(str);
        sb.append(strLoginUserName);
        sb.append(str);
        sb.append("read");
        return sb.toString();
    }

    @k
    public final String getSplitEpubPath(@k String str) {
        Intrinsics.checkNotNullParameter(str, "epubPath");
        return l5.y(str) + "-split.epub";
    }

    public final boolean isMobi(@l String str) {
        return (str != null && StringsKt.endsWith(str, ".mobi", true)) || (str != null && StringsKt.endsWith(str, ".azw3", true));
    }

    public final void convertToEpubByNas(@k final String str, @l String str2, @k final Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "epubPath");
        Intrinsics.checkNotNullParameter(function1, "onResult");
        if (StringsKt.isBlank(str) || str2 == null || StringsKt.isBlank(str2) || !n.a.w(str2)) {
            function1.invoke(Boolean.FALSE);
        }
        pd.a.e(TAG, "convertToEpubByNas 获取服务器转换后的epub文件");
        BookConvertRequest bookConvertRequest = new BookConvertRequest();
        bookConvertRequest.setFile_path(str2);
        final Activity activityE = com.zentraedi.basic.function.utils.a.h().e();
        com.zentraedi.business.http.a.b().f(bookConvertRequest, 1800, new com.zentraedi.business.http.b<Object>() { // from class: com.zspace.mobi.MobiUtilBusiness.convertToEpubByNas.2
            public boolean automaticResolution() {
                return false;
            }

            public void onCallResponse(Response<ResponseBody> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (activityE.isDestroyed() || activityE.isFinishing()) {
                    return;
                }
                ResponseBody responseBody = (ResponseBody) response.body();
                if (!Intrinsics.areEqual(String.valueOf(responseBody != null ? responseBody.contentType() : null), "application/epub+zip")) {
                    pd.a.e(MobiUtilBusiness.TAG, "convertToEpubByNas 获取服务器转换后的epub文件失败，返回数据错误");
                    function1.invoke(Boolean.FALSE);
                    return;
                }
                pd.a.e(MobiUtilBusiness.TAG, "convertToEpubByNas 获取服务器转换后的epub文件成功");
                e eVar = new e();
                final String str3 = str;
                final Activity activity = activityE;
                final Function1<Boolean, Unit> function2 = function1;
                eVar.c(response, str3, new f() { // from class: com.zspace.mobi.MobiUtilBusiness$convertToEpubByNas$2$onCallResponse$1
                    public void onError(int i, String str4) {
                        Intrinsics.checkNotNullParameter(str4, "msg");
                        if (activity.isDestroyed() || activity.isFinishing()) {
                            return;
                        }
                        pd.a.e("nas_book", "convertToEpubByNas 下载服务器epub文件失败, code=" + i + ", msg=" + str4);
                        function2.invoke(Boolean.FALSE);
                    }

                    public void onProgress(String str4, long j, long j2) {
                        Intrinsics.checkNotNullParameter(str4, "path");
                    }

                    public void onStart() {
                        pd.a.e("nas_book", "convertToEpubByNas 开始下载服务器epub文件");
                    }

                    public void onSuccess(String str4, boolean z) {
                        Intrinsics.checkNotNullParameter(str4, "path");
                        if (activity.isDestroyed() || activity.isFinishing()) {
                            return;
                        }
                        pd.a.e("nas_book", "convertToEpubByNas 下载服务器epub文件成功, path=" + str4 + ", isDownloaded=" + z);
                        function2.invoke(Boolean.valueOf(new File(str3).exists()));
                    }
                }, true);
            }

            public void onResult(ResponseData<? super Object> responseData) {
                pd.a.e(MobiUtilBusiness.TAG, "convertToEpubByNas 获取服务器转换后的epub文件失败, resp=" + responseData);
                if (activityE.isDestroyed() || activityE.isFinishing()) {
                    return;
                }
                function1.invoke(Boolean.FALSE);
            }

            public void onServerError() {
                pd.a.e(MobiUtilBusiness.TAG, "convertToEpubByNas 获取服务器转换后的epub文件失败");
                if (activityE.isDestroyed() || activityE.isFinishing()) {
                    return;
                }
                function1.invoke(Boolean.FALSE);
            }
        });
    }
}
