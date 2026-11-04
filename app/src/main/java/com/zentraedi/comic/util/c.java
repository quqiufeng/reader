package com.zentraedi.comic.util;

import android.text.TextUtils;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.l5;
import com.zentraedi.business.utils.t7;
import com.zentraedi.business.w0;
import com.zentraedi.comic.event.ComicFolderThumbUpdateEvent;
import com.zentraedi.comic.m;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class c {

    @fo.k
    public static final c a = new c();

    private c() {
    }

    private final void h(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Intrinsics.checkNotNull(str2);
        t7.j(str, str2);
    }

    private final boolean i(int i) {
        return 26 == i || 8 == i || 33 == i;
    }

    public final boolean a(@fo.l String str, @fo.l String str2, @fo.l String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Intrinsics.checkNotNull(str);
            if (t7.b(c(str)) && !TextUtils.isEmpty(str3)) {
                return true;
            }
            int iF = i5.a.f(str2);
            if (iF == 3) {
                f(str.toString(), String.valueOf(str2));
                return true;
            }
            if (i(iF)) {
                String strY = m.y(String.valueOf(str2));
                if (new File(strY).exists()) {
                    f(str.toString(), strY);
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(@fo.k String parentPath, @fo.l String str) {
        Intrinsics.checkNotNullParameter(parentPath, "parentPath");
        String strC = c(parentPath);
        if (t7.b(strC) && TextUtils.equals(e(strC), str)) {
            t7.n(strC);
        }
    }

    @fo.k
    public final String c(@fo.k String parentPath) {
        Intrinsics.checkNotNullParameter(parentPath, "parentPath");
        return "sp_key_folder_thumb_" + w0.a + '_' + w0.F() + '_' + parentPath;
    }

    @fo.l
    public final String d(@fo.k String parentPath) {
        Intrinsics.checkNotNullParameter(parentPath, "parentPath");
        String str = (String) t7.d(c(parentPath), "");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @fo.l
    public final String e(@fo.k String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String str = (String) t7.d(key, "");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public final boolean f(@fo.k String parentPath, @fo.k String thumbPath) {
        Intrinsics.checkNotNullParameter(parentPath, "parentPath");
        Intrinsics.checkNotNullParameter(thumbPath, "thumbPath");
        h(c(parentPath), thumbPath);
        org.greenrobot.eventbus.c.f().q(new ComicFolderThumbUpdateEvent(parentPath));
        return false;
    }

    public final void g(@fo.l ComicInfoModel comicInfoModel, @fo.l String str) {
        String strY;
        String string;
        if (comicInfoModel == null || comicInfoModel.isOfflineData()) {
            return;
        }
        i5 i5Var = i5.a;
        int iF = i5Var.f(StringsKt.trim(comicInfoModel.getPath()).toString());
        int iF2 = i5Var.f(str != null ? StringsKt.trim(str).toString() : null);
        c cVar = a;
        if (cVar.i(iF) || iF2 == 8) {
            if (iF2 == 8) {
                if (str == null || (string = StringsKt.trim(str).toString()) == null) {
                    string = "";
                }
                strY = m.y(string);
            } else {
                strY = m.y(StringsKt.trim(comicInfoModel.getPath()).toString());
            }
            if (new File(strY).exists()) {
                if (iF2 == 8) {
                    cVar.f(comicInfoModel.getPath(), strY);
                } else {
                    String strZ = l5.z(comicInfoModel.getPath());
                    Intrinsics.checkNotNullExpressionValue(strZ, "getParentFolderPath(...)");
                    cVar.f(strZ, strY);
                }
                org.greenrobot.eventbus.c.f().q(new ComicFolderThumbUpdateEvent(comicInfoModel.getPath()));
                if (iF2 == 8) {
                    org.greenrobot.eventbus.c cVarF = org.greenrobot.eventbus.c.f();
                    if (str == null) {
                        str = "";
                    }
                    cVarF.q(new ComicFolderThumbUpdateEvent(str));
                }
            }
        }
    }
}
