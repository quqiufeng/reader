package com.zentraedi.outreader.local.localtxt;

import android.content.Context;
import com.google.gson.Gson;
import com.vivo.identifier.IdentifierConstant;
import com.zentraedi.basic.component.easythread.b;
import com.zentraedi.business.utils.f5;
import com.zentraedi.outreader.d;
import com.zentraedi.outreader.local.LocalReaderManager;
import com.zentraedi.outreader.model.BookChapterEntity;
import com.zentraedi.outreader.model.LocalTxtBookModel;
import com.zentraedi.outreader.model.SectionContentEntity;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.util.c;
import com.zentraedi.outreader.util.h;
import com.zentraedi.reader.reader.l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class a {
    public static final int a = 200;
    private static final String d = "\n";
    private static final int f = 100;
    private static final Class<?> b = a.class;
    private static final String c = l.l;
    private static final Pattern e = Pattern.compile(com.zentraedi.basic.function.utils.a.n(d.q.LI4));

    /* JADX INFO: renamed from: com.zentraedi.outreader.local.localtxt.a$a, reason: collision with other inner class name */
    class CallableC0146a implements Callable<String> {
        final /* synthetic */ BookModel a;

        CallableC0146a(final BookModel val$bookModel) {
            this.a = val$bookModel;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            File file = new File(this.a.getLocalPath());
            if (!file.exists() || !file.isFile()) {
                throw new FileNotFoundException("file error");
            }
            LocalTxtBookModel localTxtBookModelC = a.c(file);
            if (localTxtBookModelC == null) {
                throw new Exception(" LocalTxtUtil.readCatalog error ");
            }
            List<LocalTxtBookModel.LocalTxtChapterModel> chapterInfoList = localTxtBookModelC.getChapterInfoList();
            a.d(com.zentraedi.basic.function.utils.a.a(), this.a.getMd5Path(), new Gson().toJson(localTxtBookModelC));
            ArrayList arrayList = new ArrayList();
            for (LocalTxtBookModel.LocalTxtChapterModel localTxtChapterModel : chapterInfoList) {
                SectionContentEntity sectionContentEntity = new SectionContentEntity();
                sectionContentEntity.setUserId(h.a());
                sectionContentEntity.setBookId(this.a.getMd5Path());
                sectionContentEntity.setSectionId(localTxtChapterModel.getChapterId());
                sectionContentEntity.setSectionName(localTxtChapterModel.getName());
                sectionContentEntity.setContent(localTxtChapterModel.getContent());
                sectionContentEntity.setPlaintext(1);
                arrayList.add(sectionContentEntity);
            }
            LocalReaderManager.m().v(arrayList);
            return null;
        }
    }

    public static void b(final BookModel bookModel, b<String> callback) {
        wd.b.a().a(new CallableC0146a(bookModel), callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8 A[Catch: all -> 0x008f, Exception -> 0x0096, TryCatch #11 {Exception -> 0x0096, all -> 0x008f, blocks: (B:17:0x006d, B:21:0x0083, B:36:0x00d8, B:37:0x00ea, B:39:0x010b, B:49:0x014d, B:40:0x011a, B:42:0x012f, B:44:0x0135, B:46:0x0144, B:45:0x0141, B:48:0x014a, B:29:0x00a1, B:32:0x00b0, B:61:0x0198, B:62:0x01b0), top: B:98:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:39:0x010b A[Catch: all -> 0x008f, Exception -> 0x0096, TryCatch #11 {Exception -> 0x0096, all -> 0x008f, blocks: (B:17:0x006d, B:21:0x0083, B:36:0x00d8, B:37:0x00ea, B:39:0x010b, B:49:0x014d, B:40:0x011a, B:42:0x012f, B:44:0x0135, B:46:0x0144, B:45:0x0141, B:48:0x014a, B:29:0x00a1, B:32:0x00b0, B:61:0x0198, B:62:0x01b0), top: B:98:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:40:0x011a A[Catch: all -> 0x008f, Exception -> 0x0096, TryCatch #11 {Exception -> 0x0096, all -> 0x008f, blocks: (B:17:0x006d, B:21:0x0083, B:36:0x00d8, B:37:0x00ea, B:39:0x010b, B:49:0x014d, B:40:0x011a, B:42:0x012f, B:44:0x0135, B:46:0x0144, B:45:0x0141, B:48:0x014a, B:29:0x00a1, B:32:0x00b0, B:61:0x0198, B:62:0x01b0), top: B:98:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x012f A[Catch: all -> 0x008f, Exception -> 0x0096, TryCatch #11 {Exception -> 0x0096, all -> 0x008f, blocks: (B:17:0x006d, B:21:0x0083, B:36:0x00d8, B:37:0x00ea, B:39:0x010b, B:49:0x014d, B:40:0x011a, B:42:0x012f, B:44:0x0135, B:46:0x0144, B:45:0x0141, B:48:0x014a, B:29:0x00a1, B:32:0x00b0, B:61:0x0198, B:62:0x01b0), top: B:98:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0135 A[Catch: all -> 0x008f, Exception -> 0x0096, TryCatch #11 {Exception -> 0x0096, all -> 0x008f, blocks: (B:17:0x006d, B:21:0x0083, B:36:0x00d8, B:37:0x00ea, B:39:0x010b, B:49:0x014d, B:40:0x011a, B:42:0x012f, B:44:0x0135, B:46:0x0144, B:45:0x0141, B:48:0x014a, B:29:0x00a1, B:32:0x00b0, B:61:0x0198, B:62:0x01b0), top: B:98:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0141 A[Catch: all -> 0x008f, Exception -> 0x0096, TryCatch #11 {Exception -> 0x0096, all -> 0x008f, blocks: (B:17:0x006d, B:21:0x0083, B:36:0x00d8, B:37:0x00ea, B:39:0x010b, B:49:0x014d, B:40:0x011a, B:42:0x012f, B:44:0x0135, B:46:0x0144, B:45:0x0141, B:48:0x014a, B:29:0x00a1, B:32:0x00b0, B:61:0x0198, B:62:0x01b0), top: B:98:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x014a A[Catch: all -> 0x008f, Exception -> 0x0096, TryCatch #11 {Exception -> 0x0096, all -> 0x008f, blocks: (B:17:0x006d, B:21:0x0083, B:36:0x00d8, B:37:0x00ea, B:39:0x010b, B:49:0x014d, B:40:0x011a, B:42:0x012f, B:44:0x0135, B:46:0x0144, B:45:0x0141, B:48:0x014a, B:29:0x00a1, B:32:0x00b0, B:61:0x0198, B:62:0x01b0), top: B:98:0x006d }] */
    public static LocalTxtBookModel c(File file) throws Throwable {
        InputStreamReader inputStreamReader;
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        LocalTxtBookModel localTxtBookModel;
        BufferedReader bufferedReader2;
        FileInputStream fileInputStream2;
        InputStreamReader inputStreamReader2;
        FileInputStream fileInputStream3;
        InputStreamReader inputStreamReader3;
        String strN;
        String strA = f5.a(file);
        LocalTxtBookModel localTxtBookModel2 = new LocalTxtBookModel();
        localTxtBookModel2.setName(file.getName().replace(".txt", ""));
        LinkedList linkedList = new LinkedList();
        localTxtBookModel2.setChapterInfoList(linkedList);
        try {
            fileInputStream2 = new FileInputStream(file);
            try {
                inputStreamReader2 = new InputStreamReader(fileInputStream2, strA);
                try {
                    bufferedReader2 = new BufferedReader(inputStreamReader2, 4194304);
                    try {
                        try {
                            StringBuilder sb = new StringBuilder(10240);
                            String name = "";
                            LocalTxtBookModel.LocalTxtChapterModel localTxtChapterModel = null;
                            int i = 0;
                            int i2 = 0;
                            int i3 = 0;
                            int i4 = 0;
                            int i5 = 1;
                            int i6 = 1;
                            while (true) {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                }
                                int i7 = i6;
                                String strSubstring = line;
                                localTxtBookModel = null;
                                while (strSubstring.length() > 0) {
                                    try {
                                        bufferedReader = bufferedReader2;
                                        try {
                                            int iMin = Math.min(strSubstring.length(), 200);
                                            String str = strSubstring;
                                            fileInputStream3 = fileInputStream2;
                                            inputStreamReader3 = inputStreamReader2;
                                            try {
                                                String strSubstring2 = str.substring(0, iMin);
                                                Matcher matcher = e.matcher(strSubstring2);
                                                if (!matcher.find() || i4 <= 10) {
                                                    if (i3 == 0) {
                                                        strN = com.zentraedi.basic.function.utils.a.n(d.q.rB);
                                                        name = localTxtBookModel2.getName();
                                                    } else if (i4 > 100) {
                                                        i5++;
                                                        strN = String.format(Locale.getDefault(), "%s (%d)", name, Integer.valueOf(i5));
                                                    } else {
                                                        strN = null;
                                                    }
                                                    if (strN != null) {
                                                        if (localTxtChapterModel != null) {
                                                            sb.append(d);
                                                            localTxtChapterModel.setContent(sb.toString());
                                                            sb.setLength(0);
                                                            localTxtChapterModel.setWords(i);
                                                        }
                                                        localTxtChapterModel = new LocalTxtBookModel.LocalTxtChapterModel();
                                                        localTxtChapterModel.setChapterId(i7 + "");
                                                        localTxtChapterModel.setName(strN);
                                                        linkedList.add(localTxtChapterModel);
                                                        i7++;
                                                        if (i3 == 0) {
                                                            sb.append(c);
                                                            sb.append(strN);
                                                            sb.append(d);
                                                            sb.append(strSubstring2);
                                                        } else {
                                                            sb.append(c);
                                                            sb.append(strN);
                                                            sb.append(d);
                                                            if (strN.length() < strSubstring2.length()) {
                                                                if (strSubstring2.contains(strN)) {
                                                                    sb.append(strSubstring2.substring(strN.length()));
                                                                } else {
                                                                    sb.append(strSubstring2);
                                                                }
                                                                sb.append(d);
                                                            }
                                                        }
                                                        i = 0;
                                                        i4 = 0;
                                                    } else {
                                                        sb.append(strSubstring2);
                                                    }
                                                    sb.append(d);
                                                    int length = strSubstring2.length();
                                                    i += length;
                                                    i4++;
                                                    i2 += length;
                                                    i3++;
                                                    inputStreamReader2 = inputStreamReader3;
                                                    strSubstring = str.substring(iMin);
                                                    bufferedReader2 = bufferedReader;
                                                    fileInputStream2 = fileInputStream3;
                                                } else {
                                                    strN = matcher.group();
                                                    name = strN;
                                                }
                                                i5 = 1;
                                                if (strN != null) {
                                                    if (localTxtChapterModel != null) {
                                                        sb.append(d);
                                                        localTxtChapterModel.setContent(sb.toString());
                                                        sb.setLength(0);
                                                        localTxtChapterModel.setWords(i);
                                                    }
                                                    localTxtChapterModel = new LocalTxtBookModel.LocalTxtChapterModel();
                                                    localTxtChapterModel.setChapterId(i7 + "");
                                                    localTxtChapterModel.setName(strN);
                                                    linkedList.add(localTxtChapterModel);
                                                    i7++;
                                                    if (i3 == 0) {
                                                        sb.append(c);
                                                        sb.append(strN);
                                                        sb.append(d);
                                                        sb.append(strSubstring2);
                                                    } else {
                                                        sb.append(c);
                                                        sb.append(strN);
                                                        sb.append(d);
                                                        if (strN.length() < strSubstring2.length()) {
                                                            if (strSubstring2.contains(strN)) {
                                                                sb.append(strSubstring2.substring(strN.length()));
                                                            } else {
                                                                sb.append(strSubstring2);
                                                            }
                                                            sb.append(d);
                                                        }
                                                    }
                                                    i = 0;
                                                    i4 = 0;
                                                } else {
                                                    sb.append(strSubstring2);
                                                }
                                                sb.append(d);
                                                int length2 = strSubstring2.length();
                                                i += length2;
                                                i4++;
                                                i2 += length2;
                                                i3++;
                                                inputStreamReader2 = inputStreamReader3;
                                                strSubstring = str.substring(iMin);
                                                bufferedReader2 = bufferedReader;
                                                fileInputStream2 = fileInputStream3;
                                            } catch (Exception e2) {
                                                e = e2;
                                                inputStreamReader2 = inputStreamReader3;
                                                bufferedReader2 = bufferedReader;
                                                fileInputStream2 = fileInputStream3;
                                                try {
                                                    e.printStackTrace();
                                                    c.a(fileInputStream2);
                                                    c.a(inputStreamReader2);
                                                    c.a(bufferedReader2);
                                                    return localTxtBookModel;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    bufferedReader = bufferedReader2;
                                                    fileInputStream = fileInputStream2;
                                                    inputStreamReader = inputStreamReader2;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            bufferedReader2 = bufferedReader;
                                            e.printStackTrace();
                                            c.a(fileInputStream2);
                                            c.a(inputStreamReader2);
                                            c.a(bufferedReader2);
                                            return localTxtBookModel;
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                    }
                                }
                                i6 = i7;
                                fileInputStream3 = fileInputStream2;
                                inputStreamReader3 = inputStreamReader2;
                                inputStreamReader = inputStreamReader3;
                                fileInputStream = fileInputStream3;
                                c.a(fileInputStream);
                                c.a(inputStreamReader);
                                c.a(bufferedReader);
                                throw th;
                            }
                            bufferedReader = bufferedReader2;
                            fileInputStream3 = fileInputStream2;
                            inputStreamReader3 = inputStreamReader2;
                            localTxtBookModel = null;
                            if (localTxtChapterModel != null) {
                                sb.append(d);
                                localTxtChapterModel.setContent(sb.toString().replace("\n\t", d));
                                sb.setLength(0);
                                localTxtChapterModel.setWords(i);
                            }
                            localTxtBookModel2.setWords(i2);
                            c.a(fileInputStream3);
                            c.a(inputStreamReader3);
                            c.a(bufferedReader);
                            return localTxtBookModel2;
                        } catch (Exception e5) {
                            e = e5;
                            localTxtBookModel = null;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedReader = bufferedReader2;
                    }
                } catch (Exception e6) {
                    e = e6;
                    localTxtBookModel = null;
                    bufferedReader2 = null;
                } catch (Throwable th6) {
                    th = th6;
                    bufferedReader = null;
                    fileInputStream = fileInputStream2;
                    inputStreamReader = inputStreamReader2;
                }
            } catch (Exception e7) {
                e = e7;
                localTxtBookModel = null;
                bufferedReader2 = null;
                inputStreamReader2 = null;
            } catch (Throwable th7) {
                th = th7;
                fileInputStream3 = fileInputStream2;
                inputStreamReader = null;
                bufferedReader = null;
            }
        } catch (Exception e8) {
            e = e8;
            localTxtBookModel = null;
            bufferedReader2 = null;
            fileInputStream2 = null;
            inputStreamReader2 = null;
        } catch (Throwable th8) {
            th = th8;
            inputStreamReader = null;
            fileInputStream = null;
            bufferedReader = null;
        }
    }

    public static void d(Context context, String bookId, String chaptersInfo) {
        BookChapterEntity bookChapterEntity = new BookChapterEntity();
        bookChapterEntity.setBookId(bookId);
        bookChapterEntity.setSourceId(IdentifierConstant.OAID_STATE_DEFAULT);
        bookChapterEntity.setUserId(h.a());
        bookChapterEntity.setChapterList(chaptersInfo);
        LocalReaderManager.m().s(bookChapterEntity);
    }
}
