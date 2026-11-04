package com.zentraedi.comic.delegate;

import android.text.TextUtils;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.upload.LocalPhotoManager;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.v6;
import com.zentraedi.comic.activity.ComicSubDirActivity;
import com.zentraedi.comic.viewmodel.l6;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
@SourceDebugExtension({"SMAP\nImageComicDataDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageComicDataDelegate.kt\ncom/zentraedi/comic/delegate/ImageComicDataDelegateKt\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,72:1\n106#2:73\n78#2,22:74\n*S KotlinDebug\n*F\n+ 1 ImageComicDataDelegate.kt\ncom/zentraedi/comic/delegate/ImageComicDataDelegateKt\n*L\n46#1:73\n46#1:74,22\n*E\n"})
public final class c {
    @fo.k
    public static final Lazy<l6> b(@fo.k final FileInfoModel fileInfoModel, final int i, final boolean z, final int i2, int i3) {
        Intrinsics.checkNotNullParameter(fileInfoModel, "fileInfoModel");
        return LazyKt.lazy(new Function0() { // from class: com.zentraedi.comic.delegate.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.c(i, fileInfoModel, i2, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l6 c(int i, FileInfoModel fileInfoModel, int i2, boolean z) {
        int iJ;
        l6 l6Var = new l6();
        l6Var.q(String.valueOf(i));
        String id2 = fileInfoModel.getId();
        if (id2 == null) {
            id2 = "";
        }
        l6Var.setFileId(id2);
        String path = fileInfoModel.getPath();
        if (path == null) {
            path = "";
        }
        l6Var.setPath(path);
        String path2 = fileInfoModel.getPath();
        if (path2 == null) {
            path2 = "";
        }
        l6Var.p(path2);
        l6Var.setUserName(fileInfoModel.getOwner());
        String name = fileInfoModel.getName();
        if (name == null) {
            name = "";
        }
        l6Var.setFileName(name);
        String str = fileInfoModel.get_width();
        if (str == null) {
            str = "";
        }
        l6Var.s(str);
        String str2 = fileInfoModel.get_height();
        if (str2 == null) {
            str2 = "";
        }
        l6Var.o(str2);
        l6Var.setPosition(i2);
        l6Var.r(String.valueOf(fileInfoModel.get_size()));
        String name2 = fileInfoModel.getName();
        if (name2 != null) {
            i5 i5Var = i5.a;
            int length = name2.length() - 1;
            int i3 = 0;
            boolean z2 = false;
            while (i3 <= length) {
                boolean z3 = Intrinsics.compare((int) name2.charAt(!z2 ? i3 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (z3) {
                    i3++;
                } else {
                    z2 = true;
                }
            }
            iJ = i5Var.j(name2.subSequence(i3, length + 1).toString());
        } else {
            iJ = 101;
        }
        nd.a.a("ImageComicAdapter", ComicSubDirActivity.k0 + l6Var.getPath());
        l6Var.C(iJ == 102);
        if (z && v6.o(fileInfoModel.getLocalPath())) {
            String localPath = fileInfoModel.getLocalPath();
            l6Var.p(localPath != null ? localPath : "");
            return l6Var;
        }
        String localPath2 = LocalPhotoManager.getInstance().getLocalPath(fileInfoModel.getExt());
        nd.a.a("ImageComicAdapter", "localPath" + localPath2);
        if (!TextUtils.isEmpty(localPath2)) {
            Intrinsics.checkNotNull(localPath2);
            l6Var.p(localPath2);
            return l6Var;
        }
        String strA = com.zentraedi.comic.o.a(l6Var.getFileId());
        if (strA == null) {
            strA = "";
        }
        nd.a.a("ImageComicAdapter", "downloadPath" + strA);
        l6Var.p((TextUtils.isEmpty(strA) && (strA = fileInfoModel.getId()) == null) ? "" : strA);
        return l6Var;
    }
}
