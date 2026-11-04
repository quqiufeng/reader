package com.zentraedi.reader;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.zentraedi.reader.reader.m;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public interface c {
    void a(int i, String str);

    void b();

    boolean c();

    Drawable d(int i);

    String f(m mVar);

    Paint getBatteryPaint();

    int getBookmarkResource();

    com.zentraedi.reader.adapter.e.InterfaceC0201e getColorAnimationListener();

    com.zentraedi.reader.reader.g getContentProperty();

    int getContentTextColor();

    Paint getHighlightPaint();

    int getMarginWidth();

    com.zentraedi.reader.pdf.f getMupdfCache();

    int getPageBackgroundColor();

    int getPageBackgroundResource();

    int getPageMode();

    View.OnClickListener getProgressOnClickListener();

    com.zentraedi.reader.event.f.a getProgressState();

    Drawable getRewardBgResource();

    int getRewardProgressColor();

    int getRewardProgressNormalColor();

    int getRewardTextColor();

    Paint getTipsPaint();

    com.zentraedi.reader.reader.g getTitleProperty();

    int getViewMode();

    int[] getViewRect();
}
