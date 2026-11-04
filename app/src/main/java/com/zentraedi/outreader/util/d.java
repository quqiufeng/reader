package com.zentraedi.outreader.util;

import java.text.NumberFormat;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class d {

    public interface a<I> {
        void a(I object);

        void b();
    }

    public static <I, O> O a(I object, O defaultValue, Class<O> clazz) {
        return clazz.isInstance(object) ? clazz.cast(object) : defaultValue;
    }

    public static <I, O> void b(I object, Class<O> clazz, a<O> callback) {
        if (clazz.isInstance(object) && callback != null) {
            callback.a(clazz.cast(object));
        }
        if (callback != null) {
            callback.b();
        }
    }

    public static double c(Object obj) {
        return d(obj, Double.valueOf(0.0d)).doubleValue();
    }

    public static Double d(Object obj, Double defaultVal) {
        try {
            return Double.valueOf(Double.parseDouble(obj.toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return defaultVal;
        }
    }

    public static Float e(Object obj) {
        return f(obj, 0.0f);
    }

    public static Float f(Object obj, float defaultVal) {
        Number numberK = k(obj);
        if (numberK == null) {
            return Float.valueOf(defaultVal);
        }
        return numberK instanceof Float ? (Float) numberK : Float.valueOf(numberK.floatValue());
    }

    public static Integer g(Object obj) {
        return h(obj, 0);
    }

    public static Integer h(Object obj, Integer defaultVal) {
        Number numberK = k(obj);
        if (numberK == null) {
            return defaultVal;
        }
        return numberK instanceof Integer ? (Integer) numberK : Integer.valueOf(numberK.intValue());
    }

    public static Long i(Object obj) {
        return j(obj, 0L);
    }

    public static Long j(Object obj, long defaultVal) {
        Number numberK = k(obj);
        if (numberK == null) {
            return Long.valueOf(defaultVal);
        }
        return numberK instanceof Long ? (Long) numberK : Long.valueOf(numberK.longValue());
    }

    public static Number k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return NumberFormat.getInstance().parse((String) obj);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String l(Object obj) {
        return m(obj, "");
    }

    public static String m(Object obj, String defaultVal) {
        return obj != null ? obj.toString() : defaultVal;
    }
}
