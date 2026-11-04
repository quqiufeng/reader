package com.zentraedi.reader.adapter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.LruCache;
import com.artifex.mupdf.fitz.ColorSpace;
import com.artifex.mupdf.fitz.Document;
import com.artifex.mupdf.fitz.Link;
import com.artifex.mupdf.fitz.Matrix;
import com.artifex.mupdf.fitz.Page;
import com.artifex.mupdf.fitz.Pixmap;
import com.artifex.mupdf.fitz.android.AndroidDrawDevice;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class PdfBitmapLoader {
    public Document a;
    public LruCache<Integer, MuPDFPageData> b;
    public e c;

    public static final class MuPDFPageData implements Serializable {
        public final Bitmap mBitmap;
        public final Link[] mLinks;

        public MuPDFPageData(Bitmap bitmap, Link[] linkArr) {
            this.mBitmap = bitmap;
            this.mLinks = linkArr;
        }
    }

    class a extends LruCache<Integer, MuPDFPageData> {
        a(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z, Integer num, MuPDFPageData muPDFPageData, MuPDFPageData muPDFPageData2) {
            Bitmap bitmap;
            super.entryRemoved(z, num, muPDFPageData, muPDFPageData2);
            if (!z || muPDFPageData == null || (bitmap = muPDFPageData.mBitmap) == null || bitmap.isRecycled()) {
                return;
            }
            muPDFPageData.mBitmap.recycle();
        }
    }

    class b extends LruCache<Integer, MuPDFPageData> {
        b(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z, Integer num, MuPDFPageData muPDFPageData, MuPDFPageData muPDFPageData2) {
            Bitmap bitmap;
            super.entryRemoved(z, num, muPDFPageData, muPDFPageData2);
            if (!z || muPDFPageData == null || (bitmap = muPDFPageData.mBitmap) == null) {
                return;
            }
            bitmap.isRecycled();
        }
    }

    class c extends e.a {
        Bitmap b;
        Link[] c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;
        final /* synthetic */ int f;
        final /* synthetic */ float g;
        final /* synthetic */ m.b h;
        final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i, int i2, int i3, int i4, float f, m.b bVar, boolean z) {
            super(i);
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.g = f;
            this.h = bVar;
            this.i = z;
        }

        @Override // com.zentraedi.reader.adapter.PdfBitmapLoader.e.a
        public void b() {
            Page pageLoadPage = PdfBitmapLoader.this.a.loadPage(this.d);
            Matrix matrixFitPage = AndroidDrawDevice.fitPage(pageLoadPage, this.e, this.f);
            if (this.g != 1.0f) {
                matrixFitPage.scale(1);
            }
            Pixmap pixmap = pageLoadPage.toPixmap(matrixFitPage, ColorSpace.DeviceBGR, true, true);
            this.b = Bitmap.createBitmap(pixmap.getPixels(), pixmap.getWidth(), pixmap.getHeight(), Bitmap.Config.ARGB_8888);
            Link[] links = pageLoadPage.getLinks();
            this.c = links;
            if (links != null) {
                for (Link link : links) {
                    link.getBounds().transform(matrixFitPage);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PdfBitmapLoader.this.b == null) {
                return;
            }
            PdfBitmapLoader.this.b.put(Integer.valueOf(this.d), new MuPDFPageData(this.b, this.c));
            if (this.h.b.getParent().getParent() != null) {
                this.h.a.setVisibility(8);
                this.h.b.setViewScale(this.g);
                Bitmap bitmapE = PdfBitmapLoader.this.b.get(Integer.valueOf(this.d)).mBitmap;
                if (this.i && !bitmapE.isRecycled()) {
                    bitmapE = com.zentraedi.business.imgedit.b.e(bitmapE);
                }
                this.h.b.f(bitmapE, 1.0f, false, PdfBitmapLoader.this.b.get(Integer.valueOf(this.d)).mLinks, null);
            }
        }
    }

    class d extends e.a {
        Bitmap b;
        Link[] c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;
        final /* synthetic */ int f;
        final /* synthetic */ float g;
        final /* synthetic */ com.zentraedi.reader.pdfscroll.a.C0205a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i, int i2, int i3, int i4, float f, com.zentraedi.reader.pdfscroll.a.C0205a c0205a) {
            super(i);
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.g = f;
            this.h = c0205a;
        }

        @Override // com.zentraedi.reader.adapter.PdfBitmapLoader.e.a
        public void b() {
            Page pageLoadPage = PdfBitmapLoader.this.a.loadPage(this.d);
            Matrix matrixFitPage = AndroidDrawDevice.fitPage(pageLoadPage, this.e, this.f);
            if (this.g != 1.0f) {
                matrixFitPage.scale(1);
            }
            Pixmap pixmap = pageLoadPage.toPixmap(matrixFitPage, ColorSpace.DeviceBGR, true, true);
            this.b = Bitmap.createBitmap(pixmap.getPixels(), pixmap.getWidth(), pixmap.getHeight(), Bitmap.Config.ARGB_8888);
            Link[] links = pageLoadPage.getLinks();
            this.c = links;
            if (links != null) {
                for (Link link : links) {
                    link.getBounds().transform(matrixFitPage);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PdfBitmapLoader.this.b == null) {
                return;
            }
            PdfBitmapLoader.this.b.put(Integer.valueOf(this.d), new MuPDFPageData(this.b, this.c));
            if (this.h.a().getParent().getParent() != null) {
                this.h.a().setViewScale(this.g);
                this.h.a().f(PdfBitmapLoader.this.b.get(Integer.valueOf(this.d)).mBitmap, 1.0f, false, PdfBitmapLoader.this.b.get(Integer.valueOf(this.d)).mLinks, null);
            }
        }
    }

    public static class e implements Runnable {
        protected Activity a;
        protected boolean c;
        protected final LinkedBlockingQueue<a> b = new LinkedBlockingQueue<>();
        private Thread d = new Thread(this);

        public static abstract class a implements Runnable {
            private final int a;

            public a(int i) {
                this.a = i;
            }

            public abstract void b();
        }

        public e(Activity activity) {
            this.a = activity;
        }

        public void a(a aVar) {
            try {
                Iterator<a> it = this.b.iterator();
                while (it.hasNext()) {
                    if (it.next().a == aVar.a) {
                        return;
                    }
                }
                this.b.put(aVar);
            } catch (InterruptedException e) {
                Log.e("MuPDF Worker", "", e);
                Thread.currentThread().interrupt();
            }
        }

        public void b(int i) {
            for (a aVar : this.b) {
                if (aVar.a == i) {
                    this.b.remove(aVar);
                    return;
                }
            }
        }

        public void c() {
            this.c = true;
            this.d.start();
        }

        public void d() {
            this.c = false;
            this.b.clear();
            this.a = null;
            Thread thread = this.d;
            if (thread != null) {
                thread.interrupt();
                this.d = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (this.c && !Thread.currentThread().isInterrupted()) {
                try {
                    a aVarTake = this.b.take();
                    aVarTake.b();
                    Activity activity = this.a;
                    if (activity != null) {
                        activity.runOnUiThread(aVarTake);
                    }
                } catch (Throwable th2) {
                    Log.e("MuPDF Worker", th2.getMessage() == null ? " null " : th2.getMessage());
                }
            }
        }
    }

    public PdfBitmapLoader(Activity activity, Document document) {
        this.a = document;
        this.b = new a(5);
        e eVar = new e(activity);
        this.c = eVar;
        eVar.c();
    }

    public void a(int i) {
        e eVar = this.c;
        if (eVar != null) {
            eVar.b(i);
        }
    }

    public void b() {
        LruCache<Integer, MuPDFPageData> lruCache = this.b;
        if (lruCache != null) {
            lruCache.evictAll();
        }
    }

    public void c() {
        e eVar = this.c;
        if (eVar != null) {
            eVar.d();
            this.c = null;
        }
        LruCache<Integer, MuPDFPageData> lruCache = this.b;
        if (lruCache != null) {
            lruCache.evictAll();
            this.b = null;
        }
    }

    public void d(m.b bVar, int i, int i2, int i3, float f, boolean z) {
        LruCache<Integer, MuPDFPageData> lruCache;
        if (bVar == null || (lruCache = this.b) == null) {
            return;
        }
        if (lruCache.get(Integer.valueOf(i)) == null || this.b.get(Integer.valueOf(i)).mBitmap.isRecycled()) {
            bVar.a.setVisibility(0);
            this.c.a(new c(i, i, i2, i3, f, bVar, z));
            return;
        }
        Bitmap bitmapE = this.b.get(Integer.valueOf(i)).mBitmap;
        bVar.b.setViewScale(f);
        if (z) {
            bitmapE = com.zentraedi.business.imgedit.b.e(bitmapE);
        }
        bVar.b.f(bitmapE, 1.0f, false, this.b.get(Integer.valueOf(i)).mLinks, null);
    }

    public void e(com.zentraedi.reader.pdfscroll.a.C0205a c0205a, int i, int i2, int i3, float f) {
        LruCache<Integer, MuPDFPageData> lruCache;
        if (c0205a == null || (lruCache = this.b) == null) {
            return;
        }
        if (lruCache.get(Integer.valueOf(i)) != null) {
            if (!this.b.get(Integer.valueOf(i)).mBitmap.isRecycled()) {
                c0205a.a().setViewScale(f);
                c0205a.a().f(this.b.get(Integer.valueOf(i)).mBitmap, 1.0f, false, this.b.get(Integer.valueOf(i)).mLinks, null);
                return;
            }
            this.b.remove(Integer.valueOf(i));
        }
        this.c.a(new d(i, i, i2, i3, f, c0205a));
    }

    public void f(Document document) {
        this.a = document;
    }

    public PdfBitmapLoader(Activity activity, Document document, int i) {
        this.a = document;
        this.b = new b(i);
        e eVar = new e(activity);
        this.c = eVar;
        eVar.c();
    }
}
