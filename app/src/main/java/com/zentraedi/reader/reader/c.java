package com.zentraedi.reader.reader;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class c {
    public static final int a = 32;
    public static final int b = 8;

    public static String a() {
        return Build.BRAND;
    }

    public static String b(Context context, String str) {
        if (a().contains("HUAWEI") && g(context) && str.length() >= 12) {
            str = str.substring(0, 11) + "...";
        }
        if (a().contains("Xiaomi") && j(context) && str.length() >= 7) {
            str = str.substring(0, 6) + "...";
        }
        if (a().contains("HONOR") && g(context) && str.length() >= 9) {
            str = str.substring(0, 8) + "...";
        }
        if (a().contains("OPPO") && h(context) && str.length() >= 13) {
            str = str.substring(0, 12) + "...";
        }
        if (!a().contains("vivo") || !i(context) || str.length() < 10) {
            return str;
        }
        return str.substring(0, 9) + "...";
    }

    public static String c(float f, float f2) {
        if (f2 == 0.0f) {
            return "0%";
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double d = (f / f2) * 100.0f;
        if (d > 100.0d) {
            d = 100.0d;
        }
        return decimalFormat.format(d) + "%";
    }

    public static String d(float f, float f2, float f3, float f4) {
        if (f2 == 0.0f) {
            return "0%";
        }
        double d = ((f - 1.0f) / f2) * 100.0f;
        double d2 = d + (f4 > 0.0f ? ((double) (f3 / f4)) * (((double) ((f / f2) * 100.0f)) - d) : 0.0d);
        if (d2 > 100.0d) {
            d2 = 100.0d;
        }
        return new DecimalFormat("0.00").format(d2) + "%";
    }

    public static int e(Context context) {
        if (a().contains("Xiaomi")) {
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                Object objInvoke = clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, "ro.miui.notch", 0);
                if (objInvoke != null) {
                    return ((Integer) objInvoke).intValue();
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public static boolean f(Context context) {
        if (a().contains("HUAWEI") && g(context)) {
            return true;
        }
        if (a().contains("Xiaomi") && j(context)) {
            return true;
        }
        if (a().contains("HONOR") && g(context)) {
            return true;
        }
        if (a().contains("OPPO") && h(context)) {
            return true;
        }
        return a().contains("vivo") && i(context);
    }

    public static boolean g(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            Object objInvoke = clsLoadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(clsLoadClass, new Object[0]);
            if (objInvoke == null) {
                return false;
            }
            return ((Boolean) objInvoke).booleanValue();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean h(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean i(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            Object objInvoke = clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32);
            if (objInvoke == null) {
                return false;
            }
            return ((Boolean) objInvoke).booleanValue();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean j(Context context) {
        try {
            return e(context) == 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean k(com.zentraedi.reader.event.f.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (aVar.c() == 4) {
            return true;
        }
        return aVar.a() != null && aVar.a().c() == 4;
    }
}
