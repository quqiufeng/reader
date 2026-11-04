package com.zentraedi.outreader.util;

import android.graphics.Typeface;
import androidx.collection.i3;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class l {
    private static final Class<?> a = l.class;
    private static final i3<String, Typeface> b = new i3<>();

    public static Typeface a(String name) {
        i3<String, Typeface> i3Var = b;
        if (!i3Var.containsKey(name)) {
            try {
                i3Var.put(name, Typeface.createFromAsset(com.zentraedi.basic.function.utils.a.a().getAssets(), "fonts/" + name));
            } catch (Exception unused) {
                return null;
            }
        }
        return (Typeface) i3Var.get(name);
    }
}
