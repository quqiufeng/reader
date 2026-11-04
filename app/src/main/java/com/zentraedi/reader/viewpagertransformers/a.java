package com.zentraedi.reader.viewpagertransformers;

import android.view.View;
import androidx.viewpager.widget.V4ViewPager;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public abstract class a implements V4ViewPager.k {
    private static final Class<?> a = a.class;

    protected boolean a() {
        return true;
    }

    protected boolean b() {
        return false;
    }

    protected void c(View view, float f) {
    }

    protected void d(View view, float f) {
        float width = view.getWidth();
        float f2 = 0.0f;
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(b() ? 0.0f : (-width) * f);
        if (!a()) {
            view.setAlpha(1.0f);
            return;
        }
        if (f > -1.0f && f < 1.0f) {
            f2 = 1.0f;
        }
        view.setAlpha(f2);
    }

    protected abstract void e(View view, float f);

    public void transformPage(View view, float f) {
        d(view, f);
        e(view, f);
        c(view, f);
    }
}
