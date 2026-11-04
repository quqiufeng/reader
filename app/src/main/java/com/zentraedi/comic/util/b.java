package com.zentraedi.comic.util;

import android.widget.ImageView;
import com.zentraedi.business.databinding.pd;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.utils.i5;
import com.zentraedi.business.utils.l5;
import com.zentraedi.comic.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class b implements ge.b {
    private final void b(pd pdVar, FileInfoModel fileInfoModel) {
        ImageView icon = pdVar.G;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        e.a(icon, null, String.valueOf(fileInfoModel.getPath()), Boolean.FALSE, null, Boolean.TRUE, true);
        pdVar.E.setText(fileInfoModel.getModifyTimeFormat());
    }

    private final void c(pd pdVar, FileInfoModel fileInfoModel) {
        int iF = i5.a.f(String.valueOf(fileInfoModel.getPath()));
        if (iF == 3) {
            pdVar.G.setImageResource(q.h.Im);
        } else if (iF == 8 || iF == 10 || iF == 26 || iF == 33) {
            ImageView icon = pdVar.G;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            e.b(icon, null, String.valueOf(fileInfoModel.getPath()), null, null, null, true, 56, null);
        } else {
            pdVar.G.setImageResource(q.h.nw);
        }
        pdVar.E.setText(l5.R(fileInfoModel.getSize()));
    }

    public void a(@fo.k pd binding, @fo.k FileInfoModel item) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        binding.G.setVisibility(0);
        binding.F.setVisibility(8);
        if (item.isDir()) {
            b(binding, item);
        } else {
            c(binding, item);
        }
    }
}
