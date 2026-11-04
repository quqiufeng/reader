package com.zentraedi.comic.util;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.zentraedi.comic.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class j {
    @androidx.databinding.d(requireAll = false, value = {"allContent", "highLightContent"})
    public static final void a(@fo.k TextView textView, @fo.k String allContent, @fo.k String highLightContent) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(allContent, "allContent");
        Intrinsics.checkNotNullParameter(highLightContent, "highLightContent");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(allContent);
        if (TextUtils.isEmpty(allContent) || TextUtils.isEmpty(highLightContent)) {
            textView.setText(allContent);
            return;
        }
        int iIndexOf = StringsKt.indexOf(allContent, highLightContent, 0, true);
        while (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(com.zentraedi.basic.function.utils.a.d(q.f.yd)), iIndexOf, highLightContent.length() + iIndexOf, 33);
            iIndexOf = StringsKt.indexOf(allContent, highLightContent, iIndexOf + highLightContent.length(), true);
        }
        textView.setText(spannableStringBuilder);
    }
}
