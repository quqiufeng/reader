package com.zentraedi.reader.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import com.artifex.mupdf.fitz.Document;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.reader.pdf.MuPdfPageView;
import com.zentraedi.reader.reader.LocalPdfBookModel;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
@Deprecated
public class m extends com.zentraedi.reader.adapter.a {
    private static final Class<?> q = m.class;
    private final Context a;
    private Document b;
    private List<LocalPdfBookModel.LocalPdfChapter> c;
    private List<com.zentraedi.reader.reader.m> d;
    private final com.zentraedi.reader.pdf.d e;
    private final PdfBitmapLoader f;
    private final com.zentraedi.reader.d g;
    private final com.zentraedi.reader.c h;
    private final int i;
    private final int j;
    private String k;
    private Bitmap l;
    private int m;
    private float n = 1.0f;
    private boolean o = false;
    private int p;

    class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ com.zentraedi.reader.event.e a;

        a(com.zentraedi.reader.event.e eVar) {
            this.a = eVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            com.zentraedi.reader.event.a.a().c(3, this.a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            com.zentraedi.reader.event.a.a().d(3, this.a);
        }
    }

    public static class b {
        public RelativeLayout a;
        public MuPdfPageView b;
        public int c;
        public boolean d;
    }

    public m(Context context, com.zentraedi.reader.pdf.d dVar, Document document, com.zentraedi.reader.c cVar, com.zentraedi.reader.d dVar2, List<LocalPdfBookModel.LocalPdfChapter> list, int i) {
        this.a = context;
        this.b = document;
        this.f = new PdfBitmapLoader((Activity) context, document);
        if (j0.l(list)) {
            w();
        } else {
            this.c = list;
        }
        z(i);
        this.e = dVar;
        this.g = dVar2;
        this.h = cVar;
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.i = point.x;
        this.j = point.y;
    }

    private void D(View view) {
        if (this.h.getPageBackgroundResource() != 0) {
            view.setBackgroundResource(this.h.getPageBackgroundResource());
        } else {
            view.setBackgroundResource(0);
            view.setBackgroundColor(this.h.getPageBackgroundColor());
        }
        view.findViewById(com.zentraedi.reader.h.i.mg).setBackgroundColor(this.h.getPageBackgroundColor());
    }

    public static /* synthetic */ void p(m mVar, RelativeLayout relativeLayout, com.zentraedi.reader.event.c cVar) {
        mVar.getClass();
        if (cVar.c == 3) {
            mVar.D(relativeLayout);
        }
    }

    private RelativeLayout u(ViewGroup viewGroup) {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.a).inflate(com.zentraedi.reader.h.l.Ja, (ViewGroup) null);
        b bVar = new b();
        bVar.a = (RelativeLayout) relativeLayout.findViewById(com.zentraedi.reader.h.i.mg);
        MuPdfPageView muPdfPageView = (MuPdfPageView) relativeLayout.findViewById(com.zentraedi.reader.h.i.ng);
        bVar.b = muPdfPageView;
        muPdfPageView.setOnTouchListener(this.g.getOnTouchListener());
        bVar.b.setActionListener(this.g.getPdfScaleListener());
        bVar.b.setInnerOnTouchListener(this.g.getInnerOnTouchListener());
        bVar.b.setActionListener(this.e);
        bVar.b.f(this.l, 1.0f, false, null, null);
        viewGroup.addView(relativeLayout);
        relativeLayout.setTag(bVar);
        return relativeLayout;
    }

    public float A() {
        return this.n;
    }

    public void B() {
        this.c = null;
        this.d = null;
    }

    public void C(String str) {
        this.k = str;
    }

    public void E(float f) {
        this.n = f;
    }

    public void destroyItem(@n0 ViewGroup viewGroup, int i, @n0 Object obj) {
        if (obj instanceof RelativeLayout) {
            RelativeLayout relativeLayout = (RelativeLayout) obj;
            if (relativeLayout.getTag() instanceof b) {
                ((b) relativeLayout.getTag()).b.a();
            }
            viewGroup.removeView(relativeLayout);
            this.f.a(i);
        }
    }

    @Override // com.zentraedi.reader.adapter.a, com.zentraedi.reader.reader.a
    public void f(int i, List<com.zentraedi.reader.reader.m> list) {
        nd.a.a(com.zentraedi.reader.f.a, "");
    }

    @Override // com.zentraedi.reader.adapter.a, com.zentraedi.reader.reader.a
    public com.zentraedi.reader.reader.m g(int i) {
        if (i < this.d.size()) {
            return this.d.get(i);
        }
        return null;
    }

    public int getCount() {
        return this.m;
    }

    @Override // com.zentraedi.reader.adapter.a, com.zentraedi.reader.reader.a
    public List<com.zentraedi.reader.reader.m> getData() {
        return null;
    }

    @Override // com.zentraedi.reader.reader.a
    public int getItemCount() {
        return this.m;
    }

    public int getItemPosition(@n0 Object obj) {
        if (!(obj instanceof View)) {
            return -2;
        }
        View view = (View) obj;
        if (!(view.getTag() instanceof b)) {
            return -2;
        }
        int i = ((b) view.getTag()).c;
        if (this.o) {
            return -2;
        }
        return i;
    }

    @n0
    public Object instantiateItem(@n0 ViewGroup viewGroup, int i) {
        if (i == 0 && !TextUtils.isEmpty(this.k)) {
            if (this.l == null) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new FileInputStream(this.k));
                    this.l = bitmapDecodeStream;
                    float width = bitmapDecodeStream.getWidth() / this.l.getHeight();
                    int i2 = this.i;
                    int i3 = this.j;
                    if (i2 / i3 < width) {
                        this.l = Bitmap.createScaledBitmap(this.l, i2, (int) (i2 / width), true);
                    } else {
                        this.l = Bitmap.createScaledBitmap(this.l, (int) (i3 * width), i3, true);
                    }
                } catch (Exception unused) {
                }
            }
            if (this.l != null) {
                return u(viewGroup);
            }
        }
        final RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.a).inflate(com.zentraedi.reader.h.l.Ja, (ViewGroup) null);
        b bVar = new b();
        bVar.a = (RelativeLayout) relativeLayout.findViewById(com.zentraedi.reader.h.i.mg);
        MuPdfPageView muPdfPageView = (MuPdfPageView) relativeLayout.findViewById(com.zentraedi.reader.h.i.ng);
        bVar.b = muPdfPageView;
        bVar.c = i;
        muPdfPageView.setOnTouchListener(this.g.getOnTouchListener());
        bVar.b.setInnerOnTouchListener(this.g.getInnerOnTouchListener());
        bVar.b.setActionListener(this.e);
        int width2 = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        if (width2 == 0 || height == 0) {
            width2 = this.i;
            height = this.j;
        }
        int i4 = width2;
        int iO = k0.o(this.a);
        relativeLayout.setPadding(0, iO, 0, 0);
        D(relativeLayout);
        this.f.d(bVar, i, i4, height - iO, this.n, false);
        relativeLayout.addOnAttachStateChangeListener(new a(new com.zentraedi.reader.event.e() { // from class: com.zentraedi.reader.adapter.l
            @Override // com.zentraedi.reader.event.e
            public final void onEvent(com.zentraedi.reader.event.c cVar) {
                m.p(this.a, relativeLayout, cVar);
            }
        }));
        viewGroup.addView(relativeLayout);
        relativeLayout.setTag(bVar);
        return relativeLayout;
    }

    public boolean isViewFromObject(@n0 View view, @n0 Object obj) {
        return view == obj;
    }

    @Override // com.zentraedi.reader.adapter.a
    public void n() {
        PdfBitmapLoader pdfBitmapLoader = this.f;
        if (pdfBitmapLoader != null) {
            pdfBitmapLoader.c();
        }
        Document document = this.b;
        if (document != null) {
            document.destroy();
            this.b = null;
        }
    }

    @Override // com.zentraedi.reader.adapter.a
    public void o(List<com.zentraedi.reader.reader.m> list) {
        nd.a.a(com.zentraedi.reader.f.a, "");
    }

    public void q(int i) {
        this.o = true;
        this.p = i;
    }

    public void s() {
        this.f.b();
    }

    public void v() {
        this.o = false;
    }

    public List<LocalPdfBookModel.LocalPdfChapter> w() {
        List<LocalPdfBookModel.LocalPdfChapter> list = this.c;
        if (list != null) {
            return list;
        }
        List<LocalPdfBookModel.LocalPdfChapter> listA = com.zentraedi.reader.pdf.e.a(this.b);
        this.c = listA;
        return listA;
    }

    public String x() {
        return this.k;
    }

    public void z(int i) {
        int i2;
        if (this.d == null && !j0.l(this.c)) {
            if (i == 0) {
                i = this.b.countPages();
            }
            this.m = i;
            int page = 1 < this.c.size() ? this.c.get(1).getPage() : -1;
            this.d = new ArrayList();
            SparseIntArray sparseIntArray = new SparseIntArray();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                if (i5 == page) {
                    int i6 = i3 + 1;
                    if (i3 + 2 >= this.c.size()) {
                        i3 = i6;
                        break;
                    }
                    int i7 = 0;
                    while (true) {
                        if (i7 >= 10 || (i2 = i6 + 1) >= this.c.size()) {
                            i3 = i6;
                            break;
                        }
                        int page2 = this.c.get(i2).getPage();
                        if (page2 != page) {
                            i3 = i6;
                            page = page2;
                            break;
                        } else {
                            i7++;
                            i6 = i2;
                        }
                    }
                    i4 = 0;
                }
                sparseIntArray.put(i3, i4);
                com.zentraedi.reader.reader.m mVarA = new com.zentraedi.reader.reader.m.b().m(i3).j(i4).h(i4).a();
                mVarA.w(i5);
                mVarA.x(i);
                i4++;
                this.d.add(mVarA);
            }
            for (com.zentraedi.reader.reader.m mVar : this.d) {
                mVar.t(sparseIntArray.get(mVar.l()) + 1);
            }
        }
    }
}
