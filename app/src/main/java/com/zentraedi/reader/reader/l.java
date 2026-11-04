package com.zentraedi.reader.reader;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.basic.function.utils.m0;
import com.zentraedi.basic.function.utils.s0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public abstract class l implements f {
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    protected final Context d;
    private LruCache<Integer, SparseArray<a>> e;
    private g f;
    private boolean h;
    private final int i;
    public static final Class<?> k = l.class;
    public static final String l = com.zentraedi.basic.function.utils.a.n(com.zentraedi.reader.h.q.bx2);
    private static final StringBuilder q = new StringBuilder();
    private static final Pattern r = Pattern.compile("\\s*|\t|\r|\n");
    private final HashMap<Integer, String> g = new HashMap<>(1);
    private final boolean j = true;

    public static final class a {
        public int b;
        public final SparseBooleanArray a = new SparseBooleanArray();
        public int c = 0;
        final ArrayList<String> d = new ArrayList<>();
    }

    public l(Context context) {
        this.d = context;
        this.i = e.d(context);
    }

    public static String F(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            nd.a.a(com.zentraedi.reader.f.a, "");
            return "";
        }
        if (i < str.length()) {
            return str.substring(i);
        }
        nd.a.a(com.zentraedi.reader.f.a, "");
        return "";
    }

    public static String r(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c > 65280 && c < 65375) {
                charArray[i] = (char) (c - 65248);
            }
        }
        return new String(charArray);
    }

    private SparseArray<a> u(int i, g gVar, g gVar2) {
        if (this.e == null) {
            this.e = new LruCache<>(5);
        }
        g gVar3 = this.f;
        SparseArray<a> sparseArray = (gVar3 == null || !gVar3.equals(gVar)) ? null : this.e.get(Integer.valueOf(i));
        if (sparseArray != null) {
            return sparseArray;
        }
        SparseArray<a> sparseArrayD = D(i, d(i), gVar, gVar2);
        this.g.put(Integer.valueOf(i), q.toString());
        if (sparseArrayD.size() != 0) {
            this.e.put(Integer.valueOf(i), sparseArrayD);
        }
        this.f = gVar;
        return sparseArrayD;
    }

    private boolean y(String str) {
        return "，".equals(str) || ",".equals(str) || "。".equals(str) || ".".equals(str) || "\"".equals(str) || ";".equals(str) || "；".equals(str) || "？".equals(str) || "?".equals(str) || "”".equals(str) || ":".equals(str) || "：".equals(str) || "'".equals(str) || "’".equals(str) || "！".equals(str) || "!".equals(str) || "…".equals(str) || "、".equals(str);
    }

    private boolean z(String str) {
        return "“".equals(str);
    }

    protected abstract boolean A(int i);

    protected abstract boolean B(int i);

    protected abstract boolean C(int i);

    /* JADX WARN: Code duplicated, block: B:101:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x0402  */
    /* JADX WARN: Code duplicated, block: B:196:0x040c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0410  */
    /* JADX WARN: Code duplicated, block: B:199:0x0416  */
    /* JADX WARN: Code duplicated, block: B:200:0x041a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0420  */
    /* JADX WARN: Code duplicated, block: B:205:0x0431  */
    /* JADX WARN: Code duplicated, block: B:207:0x0434  */
    /* JADX WARN: Code duplicated, block: B:208:0x0438  */
    /* JADX WARN: Code duplicated, block: B:211:0x0445  */
    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e8  */
    public SparseArray<a> D(int i, String str, g gVar, g gVar2) {
        boolean z;
        a aVar;
        String strV;
        g gVar3;
        boolean z2;
        String str2;
        int i2;
        int i3;
        g gVar4;
        boolean z3;
        boolean z4;
        float f;
        float textSize;
        int i4;
        int iBreakText;
        String str3;
        boolean z5;
        int i5;
        g gVar5 = gVar;
        SparseArray<a> sparseArray = new SparseArray<>();
        a aVar2 = new a();
        if (str != null && str.length() > 0) {
            if (i(i)) {
                aVar2.c = 3;
                sparseArray.put(0, aVar2);
                aVar2 = new a();
            }
            String[] strArrSplit = str.split("\n");
            int iB = C(i) ? gVar5.d - m0.b(358.0f) : gVar5.d;
            q.setLength(0);
            int length = strArrSplit.length;
            int i6 = 0;
            while (i6 < length) {
                String strReplaceAll = strArrSplit[i6];
                if (C(i) && sparseArray.size() > 0) {
                    break;
                }
                if (TextUtils.isEmpty(strReplaceAll)) {
                    strArrSplit = strArrSplit;
                    i2 = length;
                    i3 = i6;
                } else {
                    if (strReplaceAll.length() > 0) {
                        String str4 = l;
                        if (strReplaceAll.contains(str4)) {
                            strReplaceAll = strReplaceAll.replaceAll(str4, "");
                            gVar3 = gVar2;
                            z2 = true;
                        } else {
                            gVar3 = gVar5;
                            z2 = false;
                        }
                    } else {
                        gVar3 = gVar5;
                        z2 = false;
                    }
                    if (z2) {
                        str2 = strReplaceAll + "\n";
                    } else {
                        str2 = s0.t("  ") + strReplaceAll + "\n";
                    }
                    String strY = s0.Y(str2, "\u3000\u3000");
                    boolean z6 = false;
                    while (true) {
                        if (strY.length() <= 0) {
                            i2 = length;
                            i3 = i6;
                            gVar4 = gVar3;
                            z3 = z6;
                            break;
                        }
                        float[] fArr = new float[1];
                        gVar4 = gVar3;
                        z3 = z6;
                        boolean z7 = z2;
                        i2 = length;
                        int iBreakText2 = gVar4.c.breakText(strY, true, gVar4.e, fArr);
                        if (iBreakText2 > strY.length()) {
                            iBreakText2 = strY.length();
                        }
                        if (iBreakText2 == 0) {
                            i3 = i6;
                            break;
                        }
                        if (!this.j || strY.length() <= iBreakText2 || iBreakText2 <= 0) {
                            i3 = i6;
                            z4 = false;
                        } else {
                            int i7 = iBreakText2 + 1;
                            i3 = i6;
                            if (y(strY.substring(iBreakText2, i7))) {
                                String strSubstring = strY.substring(0, iBreakText2);
                                if (strSubstring.equals(r(strSubstring))) {
                                    iBreakText = iBreakText2;
                                    str3 = "";
                                } else {
                                    String strSubstring2 = strY.substring(0, i7);
                                    String str5 = r(strSubstring2) + F(strY, i7);
                                    iBreakText = gVar4.c.breakText(str5, true, gVar4.e, fArr);
                                    if (iBreakText > str5.length()) {
                                        iBreakText = str5.length();
                                    }
                                    if (iBreakText == 0) {
                                        break;
                                    }
                                    String strSubstring3 = str5.substring(0, iBreakText);
                                    if (str5.length() > iBreakText && iBreakText > 0 && !strSubstring3.equals(r(strSubstring3))) {
                                        int i8 = iBreakText + 1;
                                        String strSubstring4 = str5.substring(0, i8);
                                        str5 = r(strSubstring4) + F(str5, i8);
                                        iBreakText = gVar4.c.breakText(str5, true, gVar4.e, fArr);
                                        if (iBreakText > str5.length()) {
                                            iBreakText = str5.length();
                                        }
                                        if (iBreakText != 0) {
                                            break;
                                        }
                                        break;
                                    }
                                    String str6 = str5;
                                    str3 = strY;
                                    strY = str6;
                                }
                                if (strY.length() <= iBreakText || iBreakText <= 0 || !y(strY.substring(iBreakText, iBreakText + 1))) {
                                    iBreakText2 = iBreakText;
                                } else {
                                    if (!TextUtils.isEmpty(str3)) {
                                        int iBreakText3 = gVar4.c.breakText(str3, true, gVar4.e, fArr);
                                        if (iBreakText3 > str3.length()) {
                                            iBreakText3 = str3.length();
                                        }
                                        if (iBreakText3 == 0) {
                                            break;
                                        }
                                        if (y(str3.substring(iBreakText3, iBreakText3 + 1))) {
                                            String str7 = str3;
                                            iBreakText2 = iBreakText3;
                                            strY = str7;
                                        } else {
                                            String str8 = str3;
                                            iBreakText2 = iBreakText3;
                                            strY = str8;
                                            z5 = false;
                                        }
                                        if (z5) {
                                            int i9 = 0;
                                            while (true) {
                                                i5 = iBreakText2 - 1;
                                                if (i5 > 0 || !y(strY.substring(i5, iBreakText2)) || (i9 = i9 + 1) > 2) {
                                                    break;
                                                }
                                                iBreakText2 = i5;
                                            }
                                            iBreakText2 = i5;
                                            z4 = true;
                                        }
                                        if (strY.length() > iBreakText2 && iBreakText2 > 0 && z(strY.substring(iBreakText2 - 1, iBreakText2))) {
                                            iBreakText2--;
                                            z4 = true;
                                        }
                                    } else {
                                        iBreakText2 = iBreakText;
                                    }
                                    z5 = true;
                                    if (z5) {
                                        int i10 = 0;
                                        while (true) {
                                            i5 = iBreakText2 - 1;
                                            if (i5 > 0) {
                                                break;
                                            }
                                            iBreakText2 = i5;
                                        }
                                        iBreakText2 = i5;
                                        z4 = true;
                                    }
                                    if (strY.length() > iBreakText2) {
                                        iBreakText2--;
                                        z4 = true;
                                    }
                                }
                                z4 = false;
                                if (strY.length() > iBreakText2) {
                                    iBreakText2--;
                                    z4 = true;
                                }
                            } else {
                                z4 = false;
                                if (strY.length() > iBreakText2) {
                                    iBreakText2--;
                                    z4 = true;
                                }
                            }
                        }
                        String strSubstring5 = strY.substring(0, iBreakText2);
                        String strTrim = strSubstring5.trim();
                        if ((strTrim.length() > 0 || z7) && !"\n".equals(strTrim) && !"\r\n".equals(strTrim) && (!s0.v(strTrim) || z7)) {
                            if (!s0.v(strTrim)) {
                                if (z7 && strSubstring5.endsWith("\n")) {
                                    f = iB;
                                    textSize = gVar4.c.getTextSize() + gVar4.a;
                                    i4 = this.i;
                                } else {
                                    f = iB;
                                    textSize = gVar4.c.getTextSize();
                                    i4 = gVar4.a;
                                }
                                iB = (int) (f - (textSize + i4));
                            } else if (z7) {
                                iB -= this.i;
                            }
                            if (iB < 0) {
                                if (C(i) && B(i)) {
                                    aVar2.c = 4;
                                }
                                if (!TextUtils.isEmpty(v(i))) {
                                    String strV2 = v(i);
                                    if ("chapter_no_data".equals(strV2)) {
                                        aVar2.c = -1;
                                    } else if ("chapter_on_control".equals(strV2)) {
                                        aVar2.c = -2;
                                    } else if ("chapter_other_error".equals(strV2)) {
                                        aVar2.c = -3;
                                    }
                                }
                                sparseArray.put(sparseArray.size(), aVar2);
                                aVar2 = new a();
                                iB = gVar4.d;
                                if (C(i)) {
                                    break;
                                }
                            } else {
                                if (z4) {
                                    aVar2.a.put(aVar2.d.size(), true);
                                }
                                aVar2.d.add(strSubstring5);
                                z3 = true;
                            }
                            z6 = z3;
                            z2 = z7;
                            length = i2;
                            i6 = i3;
                            gVar3 = gVar4;
                        } else {
                            aVar2.d.add(strSubstring5);
                        }
                        q.append(strSubstring5);
                        strY = strY.substring(iBreakText2);
                        z6 = z3;
                        z2 = z7;
                        length = i2;
                        i6 = i3;
                        gVar3 = gVar4;
                    }
                    if (aVar2.d.size() > 0 && z3) {
                        iB -= gVar4.b;
                    }
                }
                i6 = i3 + 1;
                gVar5 = gVar;
                strArrSplit = strArrSplit;
                length = i2;
            }
            int iQ = q(i);
            if (aVar2.d.size() != 0) {
                if (!C(i)) {
                    Context context = this.d;
                    if (context != null) {
                        if (iQ == 1) {
                            if (iB >= context.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.b7) + k0.a(this.d, 20)) {
                                aVar2.b = 2;
                                aVar2.c = 2;
                            } else if (iB >= this.d.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.Lc) + k0.a(this.d, 20)) {
                                aVar2.b = 1;
                                aVar2.c = 2;
                            }
                        } else if (iQ == 3) {
                            if (iB >= context.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.Cc) + k0.a(this.d, 20)) {
                                aVar2.c = 2;
                            } else {
                                z = true;
                            }
                        } else if (iQ == 2) {
                            if (iB >= context.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.b7) + k0.a(this.d, 20) + this.d.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.Cc)) {
                                aVar2.b = 2;
                                aVar2.c = 2;
                            } else if (iB >= this.d.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.Lc) + k0.a(this.d, 20) + this.d.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.Cc)) {
                                aVar2.b = 1;
                                aVar2.c = 2;
                            } else {
                                z = true;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(v(i))) {
                        strV = v(i);
                        if ("chapter_no_data".equals(strV)) {
                            aVar2.c = -1;
                        } else if ("chapter_on_control".equals(strV)) {
                            aVar2.c = -2;
                        } else if ("chapter_other_error".equals(strV)) {
                            aVar2.c = -3;
                        }
                    }
                    sparseArray.put(sparseArray.size(), aVar2);
                    aVar = new a();
                    if (z) {
                        if (iQ == 3) {
                            aVar.c = 2;
                        } else {
                            aVar.b = 2;
                            aVar.c = 2;
                        }
                        if (aVar.d.size() > 0) {
                            sparseArray.put(sparseArray.size(), aVar);
                        }
                    }
                } else if (B(i)) {
                    aVar2.c = 4;
                }
                z = false;
                if (!TextUtils.isEmpty(v(i))) {
                    strV = v(i);
                    if ("chapter_no_data".equals(strV)) {
                        aVar2.c = -1;
                    } else if ("chapter_on_control".equals(strV)) {
                        aVar2.c = -2;
                    } else if ("chapter_other_error".equals(strV)) {
                        aVar2.c = -3;
                    }
                }
                sparseArray.put(sparseArray.size(), aVar2);
                aVar = new a();
                if (z) {
                    if (iQ == 3) {
                        aVar.c = 2;
                    } else {
                        aVar.b = 2;
                        aVar.c = 2;
                    }
                    if (aVar.d.size() > 0) {
                        sparseArray.put(sparseArray.size(), aVar);
                    }
                }
            }
        }
        return sparseArray;
    }

    public void E(boolean z) {
        this.h = z;
    }

    @Override // com.zentraedi.reader.reader.f
    public abstract String a(int i);

    @Override // com.zentraedi.reader.reader.f
    public void b(int i) {
        LruCache<Integer, SparseArray<a>> lruCache = this.e;
        if (lruCache == null || lruCache.get(Integer.valueOf(i)) == null) {
            return;
        }
        this.e.remove(Integer.valueOf(i));
    }

    @Override // com.zentraedi.reader.reader.f
    public String c(int i, int i2) {
        LruCache<Integer, SparseArray<a>> lruCache = this.e;
        if (lruCache != null) {
            SparseArray<a> sparseArray = lruCache.get(Integer.valueOf(i));
            if (sparseArray == null) {
                nd.a.a(com.zentraedi.reader.f.a, "");
                return "";
            }
            ArrayList<String> arrayList = sparseArray.size() > i2 ? sparseArray.get(i2).d : null;
            StringBuilder sb = new StringBuilder();
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    sb.append(arrayList.get(i3));
                }
                return sb.toString();
            }
        }
        nd.a.a(com.zentraedi.reader.f.a, "");
        return "";
    }

    @Override // com.zentraedi.reader.reader.f
    public void destroy() {
        LruCache<Integer, SparseArray<a>> lruCache = this.e;
        if (lruCache != null) {
            lruCache.evictAll();
        }
    }

    @Override // com.zentraedi.reader.reader.f
    public int e(int i, g gVar, g gVar2) {
        return u(i, gVar, gVar2).size();
    }

    @Override // com.zentraedi.reader.reader.f
    public boolean f(int i, int i2) {
        if (i(i)) {
            return i2 == 1;
        }
        return i2 == 0;
    }

    @Override // com.zentraedi.reader.reader.f
    public a h(int i, int i2, g gVar, g gVar2) {
        return u(i, gVar, gVar2).get(i2);
    }

    @Override // com.zentraedi.reader.reader.f
    public int m(int i, int i2) {
        LruCache<Integer, SparseArray<a>> lruCache = this.e;
        if (lruCache != null) {
            SparseArray<a> sparseArray = lruCache.get(Integer.valueOf(i));
            if (sparseArray == null) {
                nd.a.a(com.zentraedi.reader.f.a, "");
                return 0;
            }
            ArrayList<String> arrayList = sparseArray.size() > i2 ? sparseArray.get(i2).d : null;
            if (arrayList != null) {
                int length = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    length += r.matcher(arrayList.get(i3)).replaceAll("").length();
                }
                return length;
            }
        }
        nd.a.a(com.zentraedi.reader.f.a, "");
        return 0;
    }

    @Override // com.zentraedi.reader.reader.f
    public abstract int n();

    public String s(int i) {
        if (this.g.containsKey(Integer.valueOf(i))) {
            return this.g.get(Integer.valueOf(i));
        }
        nd.a.a(com.zentraedi.reader.f.a, "");
        return "";
    }

    protected abstract int t(int i);

    protected abstract String v(int i);

    protected abstract int w(int i);

    public boolean x() {
        return this.h;
    }
}
