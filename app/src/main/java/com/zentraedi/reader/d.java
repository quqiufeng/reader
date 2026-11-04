package com.zentraedi.reader;

import android.view.View;
import com.zentraedi.reader.adapter.view.NovelLinearLayout;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public interface d {
    boolean e(int i, int i2);

    int getBatteryLevel();

    NovelLinearLayout.a getInnerOnTouchListener();

    View.OnTouchListener getOnTouchListener();

    com.zentraedi.reader.reader.b getPageClickEvent();

    com.zentraedi.reader.pdf.d getPdfScaleListener();

    String getTypefaceDownloadProgress();
}
