package com.zentraedi.reader.pdf;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.artifex.mupdf.fitz.ColorSpace;
import com.artifex.mupdf.fitz.Document;
import com.artifex.mupdf.fitz.Outline;
import com.artifex.mupdf.fitz.Page;
import com.artifex.mupdf.fitz.Pixmap;
import com.artifex.mupdf.fitz.android.AndroidDrawDevice;
import com.zentraedi.reader.reader.LocalPdfBookModel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class e {
    private static int a;

    class a implements Callable<String> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        a(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() throws Throwable {
            FileOutputStream fileOutputStream;
            Throwable th2;
            Document documentOpenDocument;
            FileOutputStream fileOutputStream2;
            try {
                try {
                    documentOpenDocument = Document.openDocument(this.a);
                    try {
                        if (documentOpenDocument.countPages() < 0) {
                            documentOpenDocument.destroy();
                            throw null;
                        }
                        Page pageLoadPage = documentOpenDocument.loadPage(0);
                        Pixmap pixmap = pageLoadPage.toPixmap(AndroidDrawDevice.fitPageWidth(pageLoadPage, this.b), ColorSpace.DeviceBGR, true, true);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pixmap.getPixels(), pixmap.getWidth(), pixmap.getHeight(), Bitmap.Config.ARGB_8888);
                        File file = new File(this.c);
                        fileOutputStream2 = new FileOutputStream(file);
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream2);
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            String absolutePath = file.getAbsolutePath();
                            documentOpenDocument.destroy();
                            try {
                                fileOutputStream2.close();
                                return absolutePath;
                            } catch (IOException e) {
                                e.printStackTrace();
                                nd.a.c("MuPDFUtil", "close stream error");
                                return absolutePath;
                            }
                        } catch (Exception e2) {
                            e = e2;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        fileOutputStream2 = null;
                    } catch (OutOfMemoryError e5) {
                        e = e5;
                        fileOutputStream2 = null;
                    } catch (Throwable th3) {
                        fileOutputStream = null;
                        th2 = th3;
                        if (documentOpenDocument != null) {
                            documentOpenDocument.destroy();
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            nd.a.c("MuPDFUtil", "close stream error");
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } catch (Exception e7) {
                e = e7;
                documentOpenDocument = null;
                fileOutputStream2 = null;
            } catch (OutOfMemoryError e8) {
                e = e8;
                documentOpenDocument = null;
                fileOutputStream2 = null;
            } catch (Throwable th5) {
                fileOutputStream = null;
                th2 = th5;
                documentOpenDocument = null;
            }
            e.printStackTrace();
            if (documentOpenDocument != null) {
                documentOpenDocument.destroy();
            }
            try {
                fileOutputStream2.close();
            } catch (IOException e9) {
                e9.printStackTrace();
                nd.a.c("MuPDFUtil", "close stream error");
            }
            return null;
        }
    }

    class b implements com.zentraedi.basic.component.easythread.b<String> {
        final /* synthetic */ com.zentraedi.basic.component.easythread.b a;

        b(com.zentraedi.basic.component.easythread.b bVar) {
            this.a = bVar;
        }

        @Override // com.zentraedi.basic.component.easythread.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            if (this.a != null) {
                if (TextUtils.isEmpty(str)) {
                    this.a.onFailed(null);
                } else {
                    this.a.onSuccess(str);
                }
            }
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable th2) {
            com.zentraedi.basic.component.easythread.b bVar = this.a;
            if (bVar != null) {
                bVar.onFailed(th2);
            }
        }
    }

    public static List<LocalPdfBookModel.LocalPdfChapter> a(Document document) {
        if (document == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Outline[] outlineArrLoadOutline = document.loadOutline();
        if (outlineArrLoadOutline == null) {
            LocalPdfBookModel.LocalPdfChapter localPdfChapter = new LocalPdfBookModel.LocalPdfChapter();
            localPdfChapter.setMupdfVersion(LocalPdfBookModel.MUPDF_VERSION);
            localPdfChapter.setLevel(0);
            localPdfChapter.setTitle(com.zentraedi.basic.function.utils.a.n(com.zentraedi.reader.h.q.vz2));
            localPdfChapter.setPage(0);
            arrayList.add(localPdfChapter);
            return arrayList;
        }
        if (outlineArrLoadOutline.length > 0 && document.pageNumberFromLocation(document.resolveLink(outlineArrLoadOutline[0])) != 0) {
            LocalPdfBookModel.LocalPdfChapter localPdfChapter2 = new LocalPdfBookModel.LocalPdfChapter();
            localPdfChapter2.setMupdfVersion(LocalPdfBookModel.MUPDF_VERSION);
            localPdfChapter2.setLevel(0);
            localPdfChapter2.setTitle(com.zentraedi.basic.function.utils.a.n(com.zentraedi.reader.h.q.Gy));
            localPdfChapter2.setPage(0);
            localPdfChapter2.setAddByDefault(true);
            arrayList.add(localPdfChapter2);
        }
        a = 0;
        b(outlineArrLoadOutline, arrayList, 0, document);
        return arrayList;
    }

    private static void b(Outline[] outlineArr, List<LocalPdfBookModel.LocalPdfChapter> list, int i, Document document) {
        if (outlineArr == null) {
            return;
        }
        for (Outline outline : outlineArr) {
            if (list.size() > 200 && i >= 2) {
                return;
            }
            LocalPdfBookModel.LocalPdfChapter localPdfChapter = new LocalPdfBookModel.LocalPdfChapter();
            localPdfChapter.setMupdfVersion(LocalPdfBookModel.MUPDF_VERSION);
            localPdfChapter.setTitle(outline.title);
            int iPageNumberFromLocation = document.pageNumberFromLocation(document.resolveLink(outline));
            int i2 = a;
            if (iPageNumberFromLocation < i2) {
                iPageNumberFromLocation = i2;
            }
            a = iPageNumberFromLocation;
            localPdfChapter.setPage(iPageNumberFromLocation);
            localPdfChapter.setLevel(i);
            list.add(localPdfChapter);
            Outline[] outlineArr2 = outline.down;
            if (outlineArr2 != null) {
                b(outlineArr2, list, i + 1, document);
            }
        }
    }

    public static void c(Context context, String str, int i, String str2, com.zentraedi.basic.component.easythread.b<String> bVar) {
        if (TextUtils.isEmpty(str) || !(str.toLowerCase().endsWith(".pdf") || str.toLowerCase().endsWith(".epub"))) {
            if (bVar != null) {
                bVar.onFailed(null);
                return;
            }
            return;
        }
        if (!new File(str).exists()) {
            if (bVar != null) {
                bVar.onFailed(null);
                return;
            }
            return;
        }
        File file = new File(str2);
        if (file.exists()) {
            if (bVar != null) {
                bVar.onSuccess(str2);
            }
        } else {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            com.zentraedi.basic.component.easythread.h.b.f().a().a(new a(str, i, str2), new b(bVar));
        }
    }
}
