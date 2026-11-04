package com.zentraedi.outreader.local.localepub;

import android.text.TextUtils;
import com.zentraedi.basic.function.utils.j;
import com.zentraedi.business.utils.l5;
import fo.k;
import fo.l;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nHtmlSplitUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HtmlSplitUtils.kt\ncom/zentraedi/outreader/local/localepub/HtmlSplitUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
public final class e {

    @k
    public static final e a = new e();

    @k
    public static final String b = "zspace-split-";

    private e() {
    }

    private final String a(String str, String str2) {
        String strC;
        if (str2 == null) {
            return str2;
        }
        if (!StringsKt.contains$default(str2, "href=\"", false, 2, (Object) null)) {
            return str2;
        }
        int iIndexOf$default = StringsKt.indexOf$default(str2, "href=\"", 0, false, 6, (Object) null) + 6;
        int iIndexOf$default2 = StringsKt.indexOf$default(str2, "\"", iIndexOf$default, false, 4, (Object) null);
        String strSubstring = str2.substring(iIndexOf$default, iIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        if (!StringsKt.contains$default(strSubstring, "#", false, 2, (Object) null)) {
            return str2;
        }
        String strSubstring2 = str2.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String strSubstring3 = str2.substring(iIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        if (StringsKt.startsWith$default(strSubstring, "#", false, 2, (Object) null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('-');
            String strSubstring4 = strSubstring.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
            sb.append(strSubstring4);
            sb.append(".html");
            strC = sb.toString();
        } else {
            strC = c(strSubstring);
        }
        return strSubstring2 + strC + strSubstring3;
    }

    private final String b(String str, String str2, String str3, String str4, String str5) {
        String strY = l5.y(l5.r(str));
        String str6 = strY + '-' + str2 + ".html";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            String str7 = l5.z(str) + '/' + str6;
            File file = new File(str7);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(str7));
            bufferedWriter.write(str4);
            boolean z = false;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (StringsKt.contains$default(line, "id=\"" + str2 + '\"', false, 2, (Object) null)) {
                    z = true;
                }
                if (str3 != null) {
                    if (StringsKt.contains$default(line, "id=\"" + str3 + '\"', false, 2, (Object) null)) {
                        bufferedWriter.write(str5);
                        break;
                    }
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    Intrinsics.checkNotNull(strY);
                    sb.append(a(strY, line));
                    sb.append('\n');
                    bufferedWriter.write(sb.toString());
                }
            }
            j.a(bufferedReader);
            j.a(bufferedWriter);
            return str6;
        } catch (Exception e) {
            nd.a.c(gh.b.b, "createHtml->ex:" + e.getLocalizedMessage());
            return str6;
        }
    }

    private final Map<String, String> g(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            char c = 0;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    j.a(bufferedReader);
                    return MapsKt.mapOf(TuplesKt.to("prefix", sb.toString()), TuplesKt.to("suffix", sb2.toString()));
                }
                if (c == 0) {
                    sb.append(line + '\n');
                } else if (c == 2) {
                    sb2.append(line + '\n');
                }
                if (StringsKt.contains$default(line, "<body", false, 2, (Object) null)) {
                    c = 1;
                } else if (StringsKt.contains$default(line, "</body", false, 2, (Object) null)) {
                    sb2.append(line + '\n');
                    c = (char) 2;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            nd.a.c(gh.b.b, "readLines: " + e.getLocalizedMessage());
            return null;
        }
    }

    @k
    public final String c(@l String str) {
        return l5.z(str) + "/zspace-split-" + l5.r(str);
    }

    @l
    public final String d(@l String str) {
        if (str != null && StringsKt.contains$default(str, "/", false, 2, (Object) null)) {
            str = l5.r(str);
        }
        String str2 = str;
        if (str2 == null || !StringsKt.contains$default(str2, ".html#", false, 2, (Object) null)) {
            return str2;
        }
        List listSplit$default = StringsKt.split$default(str2, new String[]{".html#"}, false, 0, 6, (Object) null);
        return b + ((String) listSplit$default.get(0)) + '-' + ((String) listSplit$default.get(1)) + ".html";
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00ad  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    @l
    public final List<String> e(@k File ncxFile, @k List<String> navPointList) {
        ?? r15;
        String str;
        Intrinsics.checkNotNullParameter(ncxFile, "ncxFile");
        Intrinsics.checkNotNullParameter(navPointList, "navPointList");
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ?? r11 = 0;
        int i = 0;
        for (String str2 : navPointList) {
            int i2 = i + 1;
            if (StringsKt.contains$default(str2, "#", (boolean) r11, 2, (Object) null)) {
                ?? Split$default = StringsKt.split$default(str2, new String[]{"#"}, false, 0, 6, (Object) null);
                Map<String, String> mapG = (Map) map.get(Split$default.get(r11));
                String path = new File(ncxFile.getParentFile(), (String) Split$default.get(r11)).getPath();
                if (mapG == null) {
                    String strF = f(path);
                    if (TextUtils.isEmpty(strF)) {
                        nd.a.c(gh.b.b, "splitHtml-> newHtmlPath is " + strF);
                        return null;
                    }
                    Intrinsics.checkNotNull(strF);
                    mapG = g(strF);
                    if (mapG == null) {
                        nd.a.c(gh.b.b, "splitHtml-> htmlMapInfo is null");
                        return null;
                    }
                    map.put(Split$default.get(r11), mapG);
                }
                if (i == navPointList.size() - 1) {
                    str = null;
                    r15 = 0;
                } else {
                    List listSplit$default = StringsKt.split$default(navPointList.get(i2), new String[]{"#"}, false, 0, 6, (Object) null);
                    if (listSplit$default.size() != 2) {
                        str = null;
                        r15 = 0;
                    } else {
                        r15 = 0;
                        r15 = 0;
                        str = !Intrinsics.areEqual(listSplit$default.get(0), Split$default.get(0)) ? null : (String) listSplit$default.get(1);
                    }
                }
                String strC = c(path);
                String str3 = (String) Split$default.get(1);
                String str4 = mapG.get("prefix");
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = mapG.get("suffix");
                String strB = b(strC, str3, str, str4, str5 != null ? str5 : "");
                if (strB == null) {
                    nd.a.c(gh.b.b, "splitHtml-> createHtml is null");
                    return null;
                }
                arrayList.add(strB);
            } else {
                r15 = r11;
                arrayList.add(str2);
            }
            i = i2;
            r11 = r15;
        }
        return arrayList;
    }

    @l
    public final String f(@l String str) {
        String strC = c(str);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(strC));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    j.a(bufferedReader);
                    j.a(bufferedWriter);
                    return strC;
                }
                int i = 0;
                if (StringsKt.contains$default(line, "<html>", false, 2, (Object) null) && StringsKt.contains$default(line, "</html>", false, 2, (Object) null)) {
                    List<String> listSplit$default = StringsKt.split$default(line, new String[]{"><"}, false, 0, 6, (Object) null);
                    if (listSplit$default == null) {
                        listSplit$default = new ArrayList();
                    }
                    int size = listSplit$default.size();
                    for (String str2 : listSplit$default) {
                        int i2 = i + 1;
                        if (i == 0) {
                            bufferedWriter.write(str2 + ">\n");
                        } else if (i == size - 1) {
                            bufferedWriter.write('<' + str2);
                        } else {
                            bufferedWriter.write('<' + str2 + ">\n");
                        }
                        i = i2;
                    }
                } else {
                    bufferedWriter.write(line + '\n');
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            nd.a.c(gh.b.b, "readLines: " + e.getLocalizedMessage());
            return null;
        }
    }
}
