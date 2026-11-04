package com.zentraedi.comic.view;

import android.graphics.Rect;
import com.zentraedi.comic.viewmodel.ReadModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class o {
    @fo.k
    public static final Rect a(int i, int i2, int i3, @fo.k ReadModel readModel) {
        Intrinsics.checkNotNullParameter(readModel, "readModel");
        if (i < 2) {
            return new Rect(0, 0, RangesKt.coerceAtLeast(i, 1), RangesKt.coerceAtLeast(i2, 1));
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i / 2, 1);
        int i4 = (i3 % 2 == 0) == (readModel == ReadModel.MANGA_READ) ? iCoerceAtLeast : 0;
        return new Rect(i4, 0, RangesKt.coerceAtMost(iCoerceAtLeast + i4, i), i2);
    }
}
