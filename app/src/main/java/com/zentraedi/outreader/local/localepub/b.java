package com.zentraedi.outreader.local.localepub;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.business.utils.l5;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.h0;
import org.dom4j.DocumentException;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class b {
    public static final String a = "epub";
    public static final String b = "META-INF/";
    public static final String c = "META-INF/container.xml";
    private static final Class<?> d = b.class;

    public static Boolean a(Context context, String bookPath) {
        int i;
        if (context == null) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(bookPath) || !bookPath.toLowerCase().endsWith(".epub")) {
            return Boolean.FALSE;
        }
        if (!new File(bookPath).exists()) {
            return Boolean.FALSE;
        }
        int iLastIndexOf = bookPath.lastIndexOf("/");
        String strSubstring = (iLastIndexOf < 0 || (i = iLastIndexOf + 1) >= bookPath.length()) ? bookPath : bookPath.substring(i);
        if (strSubstring.length() > 5) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 5);
        }
        File file = new File(d.a(context), System.currentTimeMillis() + "_" + strSubstring);
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, "container.xml");
        try {
            if (l(context, bookPath, c, file2)) {
                f.g(file2.getPath(), "rootfiles", "rootfile", "full-path");
                return Boolean.TRUE;
            }
            l5.i(file);
            return Boolean.FALSE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        } finally {
            l5.i(file);
        }
    }

    public static void b(String bookId) {
        l5.g(e(bookId));
    }

    private static void c(String path) {
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            try {
                file.delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.dom4j.DocumentException */
    public static String d(String opfFilePath) throws DocumentException {
        String strF = "";
        try {
            String strF2 = f.f(opfFilePath, "metadata", "name", "cover", "content");
            if (strF2 != null) {
                return f.f(opfFilePath, "manifest", "id", strF2, "href");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("cover");
            arrayList.add("cover.jpeg");
            arrayList.add("cover.jpg");
            arrayList.add("cover.png");
            Iterator it = arrayList.iterator();
            while (it.hasNext() && ((strF = f.f(opfFilePath, "manifest", "id", (String) it.next(), "href")) == null || TextUtils.isEmpty(strF))) {
            }
            return strF;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String e(String bookId) {
        return com.zentraedi.basic.function.utils.a.a().getFilesDir().getAbsolutePath() + "/epub/" + bookId;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.dom4j.DocumentException */
    private static String f(String opfFilePath) throws DocumentException {
        try {
            String strD = f.d(opfFilePath, "spine", "toc");
            if (strD != null) {
                return f.f(opfFilePath, "manifest", "id", strD, "href");
            }
            nd.a.e(d.getSimpleName(), "getNcxFilePath spine 中没有找到 toc");
            return null;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String g(String opfFilePath) {
        try {
            return f.f(opfFilePath, "manifest", "media-type", "application/x-dtbncx+xml", "href");
        } catch (Exception e) {
            nd.a.c(gh.b.b, "getNcxPath excption:" + e.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.dom4j.DocumentException */
    private static Pair<Integer, Integer> h(String ncxFilePath) throws DocumentException {
        try {
            List<String> listE = f.e(ncxFilePath, "navMap", "navPoint", "content", "src");
            if (j0.l(listE)) {
                nd.a.e(d.getSimpleName(), "getNcxSignCount navMap 中没有找到 srcList");
                return Pair.create(0, 0);
            }
            HashSet hashSet = new HashSet();
            int i = 0;
            for (String str : listE) {
                if (str.endsWith(".html")) {
                    hashSet.add(str.substring(0, str.lastIndexOf(".html")));
                } else if (str.contains(".html#")) {
                    i++;
                    hashSet.add(str.substring(0, str.lastIndexOf(".html#")));
                } else {
                    hashSet.add(str);
                }
            }
            int size = hashSet.size();
            nd.a.e(d.getSimpleName(), "getNcxSignCount srcList.size=" + listE.size() + ", mapSize=" + size + ", signCount=" + i);
            return Pair.create(Integer.valueOf(size), Integer.valueOf(i));
        } catch (Exception unused) {
            return Pair.create(0, 0);
        }
    }

    public static String i(String containerPath) {
        try {
            return f.g(containerPath, "rootfiles", "rootfile", "full-path");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.dom4j.DocumentException */
    public static boolean j(Context context, String bookPath) throws DocumentException {
        int i;
        if (context == null || TextUtils.isEmpty(bookPath) || !bookPath.toLowerCase().endsWith(".epub") || !new File(bookPath).exists()) {
            return false;
        }
        int iLastIndexOf = bookPath.lastIndexOf("/");
        String strSubstring = (iLastIndexOf < 0 || (i = iLastIndexOf + 1) >= bookPath.length()) ? bookPath : bookPath.substring(i);
        if (strSubstring.length() > 5) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 5);
        }
        File file = new File(d.a(context), System.currentTimeMillis() + "_" + strSubstring);
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, "container.xml");
        if (!l(context, bookPath, c, file2)) {
            l5.i(file);
            return false;
        }
        String strI = i(file2.getPath());
        if (TextUtils.isEmpty(strI)) {
            l5.i(file);
            return false;
        }
        File file3 = new File(file, "content.opf");
        if (!l(context, bookPath, strI, file3)) {
            l5.i(file);
            return false;
        }
        String strF = f(file3.getPath());
        nd.a.e(d.getSimpleName(), "getNcxFilePath ncxFilePath=" + strF);
        if (TextUtils.isEmpty(strF)) {
            l5.i(file);
            return false;
        }
        File file4 = new File(file, strF);
        if (l(context, bookPath, strF, file4)) {
            Pair<Integer, Integer> pairH = h(file4.getPath());
            return ((Integer) pairH.first).intValue() != 1 || ((Integer) pairH.second).intValue() <= 1;
        }
        l5.i(file);
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.dom4j.DocumentException */
    public static String k(Context context, String bookPath, String targetCoverPath) throws DocumentException {
        int i;
        if (context == null || TextUtils.isEmpty(bookPath) || !bookPath.toLowerCase().endsWith(".epub") || !new File(bookPath).exists()) {
            return null;
        }
        int iLastIndexOf = bookPath.lastIndexOf("/");
        String strSubstring = (iLastIndexOf < 0 || (i = iLastIndexOf + 1) >= bookPath.length()) ? bookPath : bookPath.substring(i);
        if (strSubstring.length() > 5) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 5);
        }
        File file = new File(d.a(context), System.currentTimeMillis() + "_" + strSubstring);
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, "container.xml");
        if (!l(context, bookPath, c, file2)) {
            l5.i(file);
            return null;
        }
        String strI = i(file2.getPath());
        if (TextUtils.isEmpty(strI)) {
            l5.i(file);
            return null;
        }
        File file3 = new File(file, "content.opf");
        if (!l(context, bookPath, strI, file3)) {
            l5.i(file);
            return null;
        }
        String strD = d(file3.getPath());
        if (TextUtils.isEmpty(strD)) {
            l5.i(file);
            return null;
        }
        if (l(context, bookPath, strD, new File(targetCoverPath))) {
            return targetCoverPath;
        }
        l5.i(file);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [org.apache.commons.compress.archivers.zip.h0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    private static boolean l(Context context, String str, String str2, File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        h0 h0Var;
        IOException e;
        boolean z = false;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || file == null) {
            return false;
        }
        File parentFile = file.getParentFile();
        ?? Exists = parentFile.exists();
        if (Exists == 0) {
            parentFile.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                h0Var = new h0(new BufferedInputStream(new FileInputStream(str)));
                try {
                    byte[] bArr = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
                    try {
                        while (true) {
                            ZipArchiveEntry zipArchiveEntryV = h0Var.V();
                            if (zipArchiveEntryV == null) {
                                break;
                            }
                            if (zipArchiveEntryV.getName().endsWith(str2)) {
                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                                while (true) {
                                    try {
                                        int i = h0Var.read(bArr, 0, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);
                                        if (i == -1) {
                                            break;
                                        }
                                        bufferedOutputStream.write(bArr, 0, i);
                                    } catch (IOException e2) {
                                        e = e2;
                                        e.printStackTrace();
                                        if (h0Var != null) {
                                            try {
                                                h0Var.close();
                                            } catch (Exception e3) {
                                                e3.printStackTrace();
                                            }
                                        }
                                        com.zentraedi.outreader.util.c.a(bufferedOutputStream);
                                    }
                                }
                                z = true;
                                bufferedOutputStream2 = bufferedOutputStream;
                                break;
                            }
                            e.printStackTrace();
                            if (h0Var != null) {
                                h0Var.close();
                            }
                            com.zentraedi.outreader.util.c.a(bufferedOutputStream);
                            return z;
                        }
                        h0Var.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    com.zentraedi.outreader.util.c.a(bufferedOutputStream2);
                } catch (IOException e5) {
                    e = e5;
                    bufferedOutputStream = null;
                    h0Var = h0Var;
                    e = e;
                } catch (Throwable th2) {
                    th = th2;
                    str2 = 0;
                    Exists = h0Var;
                    th = th;
                    if (Exists != 0) {
                        try {
                            Exists.close();
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                    com.zentraedi.outreader.util.c.a(str2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (Exists != 0) {
                    Exists.close();
                }
                com.zentraedi.outreader.util.c.a(str2);
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            bufferedOutputStream = null;
            h0Var = null;
        } catch (Throwable th4) {
            th = th4;
            str2 = 0;
            Exists = 0;
        }
        return z;
    }
}
