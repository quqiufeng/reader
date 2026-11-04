package com.zentraedi.outreader.util;

import android.text.TextUtils;
import androidx.annotation.p0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class e {
    public static final String c = "1";
    public static final String a = "7.5";
    public static final String b = com.zentraedi.basic.function.utils.a.p(com.zentraedi.outreader.d.q.LC2, a);
    private static final Class<?> d = e.class;

    public static String a(long size) {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        DecimalFormat decimalFormat2 = new DecimalFormat("0.#");
        float f = (size / 1000.0f) / 1000.0f;
        if (Math.abs(f - 0.0f) < 0.01d) {
            return "0";
        }
        if (size < 10000000) {
            return decimalFormat.format(f);
        }
        return size < 100000000 ? decimalFormat2.format(f) : String.valueOf((size / 1000) / 1000);
    }

    public static String b(String amount) {
        try {
            return Long.parseLong(amount) <= 0 ? "" : c(BigDecimal.valueOf(Long.parseLong(amount)).divide(new BigDecimal(100), 2, 0));
        } catch (Exception unused) {
            return "";
        }
    }

    private static String c(BigDecimal fen) {
        return new DecimalFormat("0.00").format(fen);
    }

    public static int d(int min, int max) {
        return (int) (((double) min) + (Math.random() * ((double) ((max - min) + 1))));
    }

    public static String e(String price) {
        return (price.endsWith("0") ? new DecimalFormat("#0") : new DecimalFormat("#0.0")).format(Integer.valueOf(price).doubleValue() / 10.0d);
    }

    public static String f(int numerator, int denominator) {
        return new DecimalFormat("#.##%").format(numerator / denominator);
    }

    public static String g(String price) {
        return new DecimalFormat("#0.00").format(Integer.valueOf(price).doubleValue() / 100.0d);
    }

    public static String h(long balance) {
        if (balance < 0) {
            return "";
        }
        try {
            return new DecimalFormat("#,###").format(balance);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean i(@p0 String string, boolean defaultValue) {
        if (string != null && !string.isEmpty()) {
            try {
                return Boolean.parseBoolean(string);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return defaultValue;
    }

    public static double j(@p0 String string, double defaultValue) {
        if (string != null && !string.isEmpty()) {
            try {
                return Double.parseDouble(string);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return defaultValue;
    }

    public static float k(@p0 String string, float defaultValue) {
        if (string != null && !string.isEmpty()) {
            try {
                return Float.parseFloat(string);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return defaultValue;
    }

    public static int l(@p0 String string, int defaultValue) {
        if (string != null && !string.isEmpty()) {
            try {
                return Integer.parseInt(string);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return defaultValue;
    }

    public static long m(@p0 String string, long defaultValue) {
        if (string != null && !string.isEmpty()) {
            try {
                return Long.parseLong(string);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return defaultValue;
    }

    public static String n(String percent) {
        if (!TextUtils.isEmpty(percent)) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##%");
            try {
                double d2 = Double.parseDouble(percent);
                if (d2 >= 1.0d) {
                    return "100.00%";
                }
                return d2 <= 0.0d ? "0.00%" : decimalFormat.format(d2);
            } catch (Exception unused) {
            }
        }
        return "0.00%";
    }

    public static String o(int wordCount) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        if (wordCount < 1000) {
            wordCount = 1000;
        }
        int i = wordCount / 10000;
        return i >= 100 ? String.valueOf(i) : decimalFormat.format(((double) wordCount) / 10000.0d);
    }

    public static String p(String bookScore) {
        try {
            if (!TextUtils.isEmpty(bookScore) && !"0.0".equals(bookScore)) {
                float f = Float.parseFloat(bookScore);
                if (f > 0.0f && f < 10.0f) {
                    DecimalFormat decimalFormat = new DecimalFormat("0.0");
                    decimalFormat.setMaximumFractionDigits(1);
                    return decimalFormat.format(f);
                }
            }
        } catch (Exception unused) {
        }
        return a;
    }

    public static String q(String bookScore) {
        try {
            if (!TextUtils.isEmpty(bookScore) && !"0.0".equals(bookScore)) {
                float f = Float.parseFloat(bookScore);
                if (f > 0.0f && f < 10.0f) {
                    DecimalFormat decimalFormat = new DecimalFormat("0.0");
                    decimalFormat.setMaximumFractionDigits(1);
                    return decimalFormat.format(f);
                }
                return b;
            }
            return b;
        } catch (Exception unused) {
            return b;
        }
    }

    public static String r(String readerNumCount) {
        if (!TextUtils.isEmpty(readerNumCount) && !"0".equals(readerNumCount)) {
            try {
                float f = Integer.parseInt(readerNumCount);
                if (f < 10000.0f) {
                    return "1";
                }
                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                decimalFormat.setRoundingMode(RoundingMode.DOWN);
                return decimalFormat.format(((double) f) / 10000.0d);
            } catch (Exception unused) {
            }
        }
        return "1";
    }

    public static String s(String coin) {
        if (!TextUtils.isEmpty(coin) && !"0".equals(coin)) {
            try {
                int i = Integer.parseInt(coin);
                return i <= 0 ? "0" : String.valueOf(((double) i) / 100.0d);
            } catch (Exception unused) {
            }
        }
        return "0";
    }
}
