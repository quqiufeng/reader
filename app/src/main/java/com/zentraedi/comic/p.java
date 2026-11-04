package com.zentraedi.comic;

import android.graphics.Bitmap;
import com.artifex.mupdf.fitz.ColorSpace;
import com.artifex.mupdf.fitz.Link;
import com.artifex.mupdf.fitz.Matrix;
import com.artifex.mupdf.fitz.Page;
import com.artifex.mupdf.fitz.Pixmap;
import com.artifex.mupdf.fitz.android.AndroidDrawDevice;
import com.zentraedi.comic.databinding.c3;
import com.zentraedi.comic.databinding.y2;
import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.ReadModel;
import com.zentraedi.reader.adapter.PdfBitmapLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class p {
    private static final int a = 480000;

    public static final class a extends PdfBitmapLoader.e.a {
        private Bitmap b;
        private Link[] c;
        final /* synthetic */ int d;
        final /* synthetic */ PdfBitmapLoader e;
        final /* synthetic */ Layout f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;
        final /* synthetic */ float i;
        final /* synthetic */ ReadModel j;
        final /* synthetic */ int k;
        final /* synthetic */ y2 l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i, PdfBitmapLoader pdfBitmapLoader, Layout layout, int i2, int i3, float f, ReadModel readModel, int i4, y2 y2Var) {
            super(i);
            this.d = i;
            this.e = pdfBitmapLoader;
            this.f = layout;
            this.g = i2;
            this.h = i3;
            this.i = f;
            this.j = readModel;
            this.k = i4;
            this.l = y2Var;
        }

        @Override // com.zentraedi.reader.adapter.PdfBitmapLoader.e.a
        public void b() {
            Page pageLoadPage = this.e.a.loadPage(this.d);
            Intrinsics.checkNotNullExpressionValue(pageLoadPage, "loadPage(...)");
            Layout layout = this.f;
            Layout layout2 = Layout.SINGLE;
            Matrix matrixFitPage = AndroidDrawDevice.fitPage(pageLoadPage, layout == layout2 ? this.g * 2 : this.g, this.h);
            if (this.g * this.h < p.a) {
                matrixFitPage.scale(this.i);
            } else {
                matrixFitPage.scale(1.0f);
            }
            Pixmap pixmap = pageLoadPage.toPixmap(matrixFitPage, ColorSpace.DeviceBGR, true, true);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pixmap.getPixels(), pixmap.getWidth(), pixmap.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            if (this.f == layout2) {
                bitmapCreateBitmap = this.j == ReadModel.MANGA_READ ? this.k % 2 == 0 ? Bitmap.createBitmap(bitmapCreateBitmap, bitmapCreateBitmap.getWidth() / 2, 0, bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight()) : Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight()) : this.k % 2 == 0 ? Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight()) : Bitmap.createBitmap(bitmapCreateBitmap, bitmapCreateBitmap.getWidth() / 2, 0, bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight());
            }
            this.b = bitmapCreateBitmap;
            Link[] links = pageLoadPage.getLinks();
            this.c = links;
            if (links != null) {
                Intrinsics.checkNotNull(links);
                for (Link link : links) {
                    link.getBounds().transform(matrixFitPage);
                }
            }
        }

        public final Bitmap c() {
            return this.b;
        }

        public final Link[] d() {
            return this.c;
        }

        public final void e(Bitmap bitmap) {
            this.b = bitmap;
        }

        public final void f(Link[] linkArr) {
            this.c = linkArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.e.b == null) {
                return;
            }
            this.e.b.put(Integer.valueOf(this.k), new PdfBitmapLoader.MuPDFPageData(this.b, this.c));
            y2 y2Var = this.l;
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                y2Var.E.setTag(bitmap);
                y2Var.E.setImageBitmap(bitmap);
                p.f(y2Var);
            }
        }
    }

    public static final class b extends PdfBitmapLoader.e.a {
        private Bitmap b;
        private Link[] c;
        final /* synthetic */ int d;
        final /* synthetic */ PdfBitmapLoader e;
        final /* synthetic */ Layout f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;
        final /* synthetic */ ReadModel i;
        final /* synthetic */ int j;
        final /* synthetic */ y2 k;
        final /* synthetic */ int l;
        final /* synthetic */ int m;
        final /* synthetic */ int n;
        final /* synthetic */ int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i, PdfBitmapLoader pdfBitmapLoader, Layout layout, int i2, int i3, ReadModel readModel, int i4, y2 y2Var, int i5, int i6, int i7, int i8) {
            super(i);
            this.d = i;
            this.e = pdfBitmapLoader;
            this.f = layout;
            this.g = i2;
            this.h = i3;
            this.i = readModel;
            this.j = i4;
            this.k = y2Var;
            this.l = i5;
            this.m = i6;
            this.n = i7;
            this.o = i8;
        }

        @Override // com.zentraedi.reader.adapter.PdfBitmapLoader.e.a
        public void b() {
            nd.a.a(com.zentraedi.reader.f.a, "PdfBitmapLoader mBitmapWorker--work");
            Page pageLoadPage = this.e.a.loadPage(this.d);
            Intrinsics.checkNotNullExpressionValue(pageLoadPage, "loadPage(...)");
            Layout layout = this.f;
            Layout layout2 = Layout.SINGLE;
            Matrix matrixFitPage = AndroidDrawDevice.fitPage(pageLoadPage, layout == layout2 ? this.g * 2 : this.g, this.h);
            if (this.g * this.h < p.a) {
                matrixFitPage.scale(p.a / (this.g * this.h));
            } else {
                matrixFitPage.scale(1.0f);
            }
            Pixmap pixmap = pageLoadPage.toPixmap(matrixFitPage, ColorSpace.DeviceBGR, true, true);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pixmap.getPixels(), pixmap.getWidth(), pixmap.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            if (this.f == layout2) {
                bitmapCreateBitmap = this.i == ReadModel.MANGA_READ ? this.j % 2 == 0 ? Bitmap.createBitmap(bitmapCreateBitmap, bitmapCreateBitmap.getWidth() / 2, 0, bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight()) : Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight()) : this.j % 2 == 0 ? Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight()) : Bitmap.createBitmap(bitmapCreateBitmap, bitmapCreateBitmap.getWidth() / 2, 0, bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight());
            }
            this.b = bitmapCreateBitmap;
            Link[] links = pageLoadPage.getLinks();
            this.c = links;
            if (links != null) {
                Intrinsics.checkNotNull(links);
                for (Link link : links) {
                    link.getBounds().transform(matrixFitPage);
                }
            }
        }

        public final Bitmap c() {
            return this.b;
        }

        public final Link[] d() {
            return this.c;
        }

        public final void e(Bitmap bitmap) {
            this.b = bitmap;
        }

        public final void f(Link[] linkArr) {
            this.c = linkArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.e.b.put(Integer.valueOf(this.j), new PdfBitmapLoader.MuPDFPageData(this.b, this.c));
            y2 y2Var = this.k;
            int i = this.l;
            int i2 = this.m;
            int i3 = this.n;
            int i4 = this.o;
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                Bitmap bitmapA = com.zentraedi.comic.c.a(bitmap, i, i2, i3, i4);
                y2Var.E.setTag(bitmap);
                y2Var.E.setImageBitmap(bitmapA);
                p.f(y2Var);
            }
        }
    }

    public static final class c extends PdfBitmapLoader.e.a {
        private Bitmap b;
        private Link[] c;
        final /* synthetic */ int d;
        final /* synthetic */ PdfBitmapLoader e;
        final /* synthetic */ int f;
        final /* synthetic */ int g;
        final /* synthetic */ c3 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i, PdfBitmapLoader pdfBitmapLoader, int i2, int i3, c3 c3Var) {
            super(i);
            this.d = i;
            this.e = pdfBitmapLoader;
            this.f = i2;
            this.g = i3;
            this.h = c3Var;
        }

        @Override // com.zentraedi.reader.adapter.PdfBitmapLoader.e.a
        public void b() {
            Page pageLoadPage = this.e.a.loadPage(this.d);
            Intrinsics.checkNotNullExpressionValue(pageLoadPage, "loadPage(...)");
            Matrix matrixFitPage = AndroidDrawDevice.fitPage(pageLoadPage, this.f, this.g);
            matrixFitPage.scale(1.0f);
            Link[] links = pageLoadPage.getLinks();
            this.c = links;
            if (links != null) {
                Intrinsics.checkNotNull(links);
                for (Link link : links) {
                    link.getBounds().transform(matrixFitPage);
                }
            }
        }

        public final Bitmap c() {
            return this.b;
        }

        public final Link[] d() {
            return this.c;
        }

        public final void e(Bitmap bitmap) {
            this.b = bitmap;
        }

        public final void f(Link[] linkArr) {
            this.c = linkArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.h.E.setImageBitmap(this.b);
            this.e.b.put(Integer.valueOf(this.d), new PdfBitmapLoader.MuPDFPageData(this.b, this.c));
        }
    }

    public static final void c(@fo.k PdfBitmapLoader pdfBitmapLoader, @fo.l y2 y2Var, int i, int i2, int i3, float f, int i4, @fo.k Layout mLayout, @fo.l ReadModel readModel) {
        Intrinsics.checkNotNullParameter(pdfBitmapLoader, "<this>");
        Intrinsics.checkNotNullParameter(mLayout, "mLayout");
        if (y2Var == null) {
            return;
        }
        if (pdfBitmapLoader.b.get(Integer.valueOf(i4)) == null || pdfBitmapLoader.b.get(Integer.valueOf(i4)).mBitmap.isRecycled()) {
            pdfBitmapLoader.c.a(new a(i, pdfBitmapLoader, mLayout, i2, i3, f, readModel, i4, y2Var));
            return;
        }
        Bitmap bitmap = pdfBitmapLoader.b.get(Integer.valueOf(i4)).mBitmap;
        if (bitmap != null) {
            y2Var.E.setTag(bitmap);
            y2Var.E.setImageBitmap(bitmap);
            f(y2Var);
        }
        pdfBitmapLoader.b.remove(Integer.valueOf(i4));
    }

    public static final void d(@fo.k PdfBitmapLoader pdfBitmapLoader, @fo.l y2 y2Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, @fo.k Layout mLayout, @fo.l ReadModel readModel) {
        Intrinsics.checkNotNullParameter(pdfBitmapLoader, "<this>");
        Intrinsics.checkNotNullParameter(mLayout, "mLayout");
        if (y2Var == null) {
            return;
        }
        if (pdfBitmapLoader.b.get(Integer.valueOf(i7)) == null || pdfBitmapLoader.b.get(Integer.valueOf(i7)).mBitmap.isRecycled()) {
            pdfBitmapLoader.c.a(new b(i8, pdfBitmapLoader, mLayout, i6, i5, readModel, i7, y2Var, i, i3, i2, i4));
            return;
        }
        Bitmap bitmap = pdfBitmapLoader.b.get(Integer.valueOf(i7)).mBitmap;
        if (bitmap != null) {
            y2Var.E.setImageBitmap(com.zentraedi.comic.c.a(bitmap, i, i3, i2, i4));
            y2Var.E.setTag(bitmap);
            f(y2Var);
        }
        pdfBitmapLoader.b.remove(Integer.valueOf(i7));
    }

    public static final void e(@fo.k PdfBitmapLoader pdfBitmapLoader, @fo.l c3 c3Var, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(pdfBitmapLoader, "<this>");
        if (c3Var == null) {
            return;
        }
        if (pdfBitmapLoader.b.get(Integer.valueOf(i)) == null || pdfBitmapLoader.b.get(Integer.valueOf(i)).mBitmap == null || pdfBitmapLoader.b.get(Integer.valueOf(i)).mBitmap.isRecycled()) {
            pdfBitmapLoader.c.a(new c(i, pdfBitmapLoader, i2, i3, c3Var));
            return;
        }
        Bitmap bitmap = pdfBitmapLoader.b.get(Integer.valueOf(i)).mBitmap;
        if (bitmap != null) {
            c3Var.E.setImageBitmap(bitmap);
        }
        pdfBitmapLoader.b.remove(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(y2 y2Var) {
        y2Var.E.setVisibility(0);
    }
}
