package com.zentraedi.reader;

import androidx.viewpager.widget.V4ViewPager;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class j {
    private final V4ViewPager a;
    private e b;

    public j(V4ViewPager v4ViewPager) {
        this.a = v4ViewPager;
        b();
    }

    private void b() {
        this.b = new e(this.a.getContext());
        try {
            Field declaredField = V4ViewPager.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField.set(this.a, this.b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public e a() {
        return this.b;
    }
}
