package com.zentraedi.reader.viewpagertransformers;

import android.view.View;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class c extends a {
    @Override // com.zentraedi.reader.viewpagertransformers.a
    protected void e(View view, float f) {
        view.setTranslationX(f >= 0.0f ? (-view.getWidth()) * f : 0.0f);
    }
}
