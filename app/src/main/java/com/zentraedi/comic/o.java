package com.zentraedi.comic;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.zentraedi.business.R;
import com.zentraedi.business.nas.NasSDKManager;
import com.zentraedi.business.task.BaseTask;
import com.zentraedi.business.utils.v6;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class o {
    @fo.l
    public static final String a(@fo.k String fileId) {
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        BaseTask baseTaskH = com.zentraedi.business.task.g.D().H(fileId);
        if (baseTaskH != null && baseTaskH.getState() == 6) {
            String targetPath = baseTaskH.getFileData().getTargetPath();
            if (new File(targetPath).exists()) {
                return targetPath;
            }
        }
        return null;
    }

    public static final void b(@fo.k com.zentraedi.business.manager.placeholder.n holderLoader, @fo.k ImageView view, @fo.k eg.a model) {
        Intrinsics.checkNotNullParameter(holderLoader, "holderLoader");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        String strH = model.h();
        if (TextUtils.isEmpty(strH)) {
            view.setImageDrawable(view.getContext().getResources().getDrawable(R.drawable.lJ));
            return;
        }
        if (Intrinsics.areEqual("page_from_pub_r", model.j()) || Intrinsics.areEqual("page_from_pub_r_w", model.j()) || v6.r(model.getFileId()) == 2) {
            d(holderLoader, view, strH, model.getFileId(), false);
            return;
        }
        if (!v6.o(strH) || new File(strH).exists()) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = strH.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!StringsKt.endsWith$default(lowerCase, "heic", false, 2, (Object) null) && !c(strH)) {
                nd.a.e("BigPictureAdapter", "BigPictureAdapter->loadBigImage() 非加密 path=" + strH);
                holderLoader.b(view, 6, 12, strH, 0);
                return;
            }
        }
        nd.a.h("BigPictureAdapter", "BigPictureAdapter->loadBigImage()  model.getFileId=" + model.getFileId());
        holderLoader.b(view, 6, 12, model.getFileId(), 0);
    }

    public static final boolean c(@fo.k String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = path.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt.endsWith$default(lowerCase, ".tif", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase2 = path.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (StringsKt.endsWith$default(lowerCase2, ".tiff", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase3 = path.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        if (StringsKt.endsWith$default(lowerCase3, ".arw", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase4 = path.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
        if (StringsKt.endsWith$default(lowerCase4, ".rw2", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase5 = path.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
        if (StringsKt.endsWith$default(lowerCase5, ".raf", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase6 = path.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
        if (StringsKt.endsWith$default(lowerCase6, ".cr2", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase7 = path.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase7, "toLowerCase(...)");
        if (StringsKt.endsWith$default(lowerCase7, ".cr3", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase8 = path.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase8, "toLowerCase(...)");
        if (StringsKt.endsWith$default(lowerCase8, ".dng", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase9 = path.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase9, "toLowerCase(...)");
        if (StringsKt.endsWith$default(lowerCase9, ".nef", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase10 = path.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase10, "toLowerCase(...)");
        if (StringsKt.endsWith$default(lowerCase10, ".orf", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase11 = path.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase11, "toLowerCase(...)");
        return StringsKt.endsWith$default(lowerCase11, ".3fr", false, 2, (Object) null);
    }

    public static final void d(@fo.k com.zentraedi.business.manager.placeholder.n holderLoader, @fo.l View view, @fo.k String path, @fo.k String fileId, boolean z) {
        Intrinsics.checkNotNullParameter(holderLoader, "holderLoader");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        if (v6.o(path) && new File(path).exists()) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = path.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!StringsKt.endsWith$default(lowerCase, "heic", false, 2, (Object) null) && !c(path)) {
                holderLoader.b(view, 6, 12, path, 0);
                return;
            }
        }
        if (v6.r(path) == 2) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strI = v6.i(path, "pub_album", false);
            Intrinsics.checkNotNullExpressionValue(strI, "getPathUrl(...)");
            String str = String.format(strI, Arrays.copyOf(new Object[]{NasSDKManager.getInstance().getAddr(), Uri.encode(path)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            holderLoader.b(view, 6, z ? 17 : 14, str, 0);
            return;
        }
        int i = z ? 17 : 14;
        nd.a.e("BigPictureAdapter", "BigPictureAdapter->showPubPhoto() 家庭相册 fileId=" + fileId);
        if (v6.r(fileId) != 2) {
            holderLoader.b(view, 6, 12, fileId, 0);
            return;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String strI2 = v6.i(fileId, "pub_album", false);
        Intrinsics.checkNotNullExpressionValue(strI2, "getPathUrl(...)");
        String str2 = String.format(strI2, Arrays.copyOf(new Object[]{NasSDKManager.getInstance().getAddr(), Uri.encode(fileId)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        holderLoader.b(view, 6, i, str2, 0);
    }
}
