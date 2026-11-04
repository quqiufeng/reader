package com.zentraedi.reader.pdf;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.artifex.mupdf.fitz.ColorSpace;
import com.artifex.mupdf.fitz.Context;
import com.artifex.mupdf.fitz.Document;
import com.artifex.mupdf.fitz.Matrix;
import com.artifex.mupdf.fitz.Page;
import com.artifex.mupdf.fitz.Pixmap;
import com.artifex.mupdf.fitz.android.AndroidDrawDevice;
import com.zentraedi.reader.adapter.PdfBitmapLoader;
import com.zentraedi.reader.reader.m;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class f {
    public static final Class<?> f = f.class;
    private int d;
    private int e;
    private final ArrayList<com.zentraedi.reader.pdf.a<Void, PdfBitmapLoader.MuPDFPageData>> c = new ArrayList<>();
    private final LruCache<Integer, Document> a = new a(10);
    private final LruCache<String, PdfBitmapLoader.MuPDFPageData> b = new b(10);

    class a extends LruCache<Integer, Document> {
        a(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z, Integer num, Document document, Document document2) {
            super.entryRemoved(z, num, document, document2);
            if (!z || document == null) {
                return;
            }
            document.destroy();
        }
    }

    class b extends LruCache<String, PdfBitmapLoader.MuPDFPageData> {
        b(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z, String str, PdfBitmapLoader.MuPDFPageData muPDFPageData, PdfBitmapLoader.MuPDFPageData muPDFPageData2) {
            Bitmap bitmap;
            super.entryRemoved(z, str, muPDFPageData, muPDFPageData2);
            if (!z || muPDFPageData == null || (bitmap = muPDFPageData.mBitmap) == null || bitmap.isRecycled()) {
                return;
            }
            muPDFPageData.mBitmap.recycle();
        }
    }

    class c extends com.zentraedi.reader.pdf.a<Void, PdfBitmapLoader.MuPDFPageData> {
        final /* synthetic */ int d;
        final /* synthetic */ int e;
        final /* synthetic */ String f;
        final /* synthetic */ com.zentraedi.reader.pdf.c g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.zentraedi.reader.pdf.b bVar, int i, int i2, String str, com.zentraedi.reader.pdf.c cVar) {
            super(bVar);
            this.d = i;
            this.e = i2;
            this.f = str;
            this.g = cVar;
        }

        @Override // com.zentraedi.reader.pdf.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(PdfBitmapLoader.MuPDFPageData muPDFPageData) {
            super.c(muPDFPageData);
            f.this.b.put(this.f, muPDFPageData);
            com.zentraedi.reader.pdf.c cVar = this.g;
            if (cVar != null) {
                cVar.a(this.d, this.e, muPDFPageData);
            }
            f.this.c.remove(this);
        }
    }

    class d implements com.zentraedi.reader.pdf.b<Void, PdfBitmapLoader.MuPDFPageData> {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ Document c;

        d(int i, int i2, Document document) {
            this.a = i;
            this.b = i2;
            this.c = document;
        }

        @Override // com.zentraedi.reader.pdf.b
        public void a() {
        }

        @Override // com.zentraedi.reader.pdf.b
        public void b() {
        }

        @Override // com.zentraedi.reader.pdf.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PdfBitmapLoader.MuPDFPageData c(Void... voidArr) {
            Page pageLoadPage = this.c.loadPage(this.b);
            Matrix matrixFitPageWidth = AndroidDrawDevice.fitPageWidth(pageLoadPage, f.this.d);
            matrixFitPageWidth.scale(1);
            Pixmap pixmap = pageLoadPage.toPixmap(matrixFitPageWidth, ColorSpace.DeviceBGR, true, true);
            return new PdfBitmapLoader.MuPDFPageData(Bitmap.createBitmap(pixmap.getPixels(), pixmap.getWidth(), pixmap.getHeight(), Bitmap.Config.ARGB_8888), null);
        }
    }

    private void d() {
        Iterator<com.zentraedi.reader.pdf.a<Void, PdfBitmapLoader.MuPDFPageData>> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.c.clear();
        LruCache<String, PdfBitmapLoader.MuPDFPageData> lruCache = this.b;
        if (lruCache != null) {
            lruCache.evictAll();
        }
    }

    private static String i(int i, int i2) {
        return i + "_" + i2;
    }

    private com.zentraedi.reader.pdf.b<Void, PdfBitmapLoader.MuPDFPageData> j(Document document, int i, int i2) {
        return new d(i, i2, document);
    }

    public Document e(int i, String str, float f2, boolean z) {
        Document documentOpenDocument = this.a.get(Integer.valueOf(i));
        if (documentOpenDocument == null) {
            try {
                documentOpenDocument = Document.openDocument(str);
                Context.setUserCSS(g.a(false));
                Context.useDocumentCSS(true);
                this.a.put(Integer.valueOf(i), documentOpenDocument);
            } catch (Exception unused) {
                return null;
            }
        }
        documentOpenDocument.layout(this.d, this.e, f2);
        return documentOpenDocument;
    }

    public void f() {
        d();
        LruCache<Integer, Document> lruCache = this.a;
        if (lruCache != null) {
            lruCache.evictAll();
        }
    }

    public Document g(int i) {
        return this.a.get(Integer.valueOf(i));
    }

    public void h(m mVar, com.zentraedi.reader.pdf.c cVar) {
        int iL = mVar.l();
        int iF = mVar.f();
        mVar.h();
        String strI = i(iL, iF);
        PdfBitmapLoader.MuPDFPageData muPDFPageData = this.b.get(strI);
        if (muPDFPageData == null || muPDFPageData.mBitmap.isRecycled()) {
            c cVar2 = new c(j(g(iL), iL, iF), iL, iF, strI, cVar);
            cVar2.b(new Void[0]);
            this.c.add(cVar2);
        } else if (cVar != null) {
            cVar.a(iL, iF, muPDFPageData);
        }
    }

    public int k(long j, int i) {
        Document documentG = g(i);
        if (documentG != null) {
            return documentG.pageNumberFromLocation(documentG.findBookmark(j));
        }
        return -1;
    }

    public long l(int i, int i2) {
        Document documentG = g(i);
        if (documentG != null) {
            return documentG.makeBookmark(documentG.locationFromPageNumber(i2));
        }
        return -1L;
    }

    public void m() {
        d();
    }

    public void n(int i, int i2) {
        this.d = i;
        this.e = i2;
    }
}
