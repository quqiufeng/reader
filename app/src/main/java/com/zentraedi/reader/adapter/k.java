package com.zentraedi.reader.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.reader.reader.LocalPdfBookModel;
import com.zentraedi.reader.view.PdfPhotoView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class k extends com.zentraedi.reader.adapter.a {
    private static final Class<?> p = k.class;
    private final Context a;
    private List<LocalPdfBookModel.LocalPdfChapter> b;
    private List<com.zentraedi.reader.reader.m> c;
    private final com.zentraedi.reader.pdf.d d;
    private final com.zentraedi.reader.d e;
    private final com.zentraedi.reader.c f;
    private final int g;
    private final int h;
    private String i;
    private Bitmap j;
    private int k;
    private float l = 1.0f;
    private boolean m = false;
    private int n;
    private com.zentraedi.reader.i o;

    class a implements com.zentraedi.reader.g {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        @Override // com.zentraedi.reader.g
        public void a(int i, int i2, int i3) {
        }

        @Override // com.zentraedi.reader.g
        public void b(int i, @fo.l Bitmap bitmap) {
            if (bitmap != null) {
                this.a.a.setImage(com.davemorrissey.labs.subscaleview.a.b(bitmap));
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        final /* synthetic */ com.zentraedi.reader.event.e a;

        b(com.zentraedi.reader.event.e eVar) {
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

    public static class c {
        public PdfPhotoView a;
        public int b;
        public boolean c;
    }

    public k(Context context, com.zentraedi.reader.pdf.d dVar, com.zentraedi.reader.i iVar, com.zentraedi.reader.c cVar, com.zentraedi.reader.d dVar2, List<LocalPdfBookModel.LocalPdfChapter> list, int i) {
        this.a = context;
        this.o = iVar;
        if (!j0.l(list)) {
            this.b = list;
        }
        x(i);
        this.d = dVar;
        this.e = dVar2;
        this.f = cVar;
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.g = point.x;
        this.h = point.y;
    }

    private void C(View view) {
        if (this.f.getPageBackgroundResource() != 0) {
            view.setBackgroundResource(this.f.getPageBackgroundResource());
        } else {
            view.setBackgroundColor(this.f.getPageBackgroundColor());
        }
    }

    public static /* synthetic */ void p(k kVar, View view, com.zentraedi.reader.event.c cVar) {
        kVar.getClass();
        if (cVar.c == 3) {
            kVar.C(view);
        }
    }

    public void A() {
        this.b = null;
        this.c = null;
    }

    public void B(String str) {
        this.i = str;
    }

    public void D(float f) {
        this.l = f;
    }

    public void destroyItem(@n0 ViewGroup viewGroup, int i, @n0 Object obj) {
        if (obj instanceof RelativeLayout) {
            viewGroup.removeView((RelativeLayout) obj);
        }
    }

    @Override // com.zentraedi.reader.adapter.a, com.zentraedi.reader.reader.a
    public void f(int i, List<com.zentraedi.reader.reader.m> list) {
        nd.a.a(com.zentraedi.reader.f.a, "");
    }

    @Override // com.zentraedi.reader.adapter.a, com.zentraedi.reader.reader.a
    public com.zentraedi.reader.reader.m g(int i) {
        if (i < this.c.size()) {
            return this.c.get(i);
        }
        return null;
    }

    public int getCount() {
        return this.k;
    }

    @Override // com.zentraedi.reader.adapter.a, com.zentraedi.reader.reader.a
    public List<com.zentraedi.reader.reader.m> getData() {
        return null;
    }

    @Override // com.zentraedi.reader.reader.a
    public int getItemCount() {
        return this.k;
    }

    public int getItemPosition(@n0 Object obj) {
        if (!(obj instanceof View)) {
            return -2;
        }
        View view = (View) obj;
        if (!(view.getTag() instanceof c)) {
            return -2;
        }
        int i = ((c) view.getTag()).b;
        if (this.m) {
            return -2;
        }
        return i;
    }

    @n0
    public Object instantiateItem(@n0 ViewGroup viewGroup, int i) {
        final View viewInflate = LayoutInflater.from(this.a).inflate(com.zentraedi.reader.h.l.Ka, (ViewGroup) null);
        c cVar = new c();
        PdfPhotoView pdfPhotoView = (PdfPhotoView) viewInflate.findViewById(com.zentraedi.reader.h.i.ng);
        cVar.a = pdfPhotoView;
        cVar.b = i;
        pdfPhotoView.setMaxScale(10.0f);
        cVar.a.setDoubleTapZoomScale(1.0f);
        cVar.a.setOnTouchListener(this.e.getOnTouchListener());
        cVar.a.setPageClickEvent(this.e.getPageClickEvent());
        C(viewInflate);
        com.zentraedi.reader.i iVar = this.o;
        if (iVar != null) {
            iVar.k(i + 1, new a(cVar));
        }
        viewInflate.addOnAttachStateChangeListener(new b(new com.zentraedi.reader.event.e() { // from class: com.zentraedi.reader.adapter.j
            @Override // com.zentraedi.reader.event.e
            public final void onEvent(com.zentraedi.reader.event.c cVar2) {
                k.p(this.a, viewInflate, cVar2);
            }
        }));
        viewGroup.addView(viewInflate);
        viewInflate.setTag(cVar);
        return viewInflate;
    }

    public boolean isViewFromObject(@n0 View view, @n0 Object obj) {
        return view == obj;
    }

    @Override // com.zentraedi.reader.adapter.a
    public void n() {
    }

    @Override // com.zentraedi.reader.adapter.a
    public void o(List<com.zentraedi.reader.reader.m> list) {
        nd.a.a(com.zentraedi.reader.f.a, "");
    }

    public void q(int i) {
        this.m = true;
        this.n = i;
    }

    public void s() {
    }

    public void u() {
        this.m = false;
    }

    public List<LocalPdfBookModel.LocalPdfChapter> v() {
        return this.b;
    }

    public String w() {
        return this.i;
    }

    public void x(int i) {
        int i2;
        com.zentraedi.reader.i iVar;
        if (this.c == null && !j0.l(this.b)) {
            if (i == 0 && (iVar = this.o) != null) {
                i = iVar.b();
            }
            this.k = i;
            int page = 1 < this.b.size() ? this.b.get(1).getPage() - 1 : 1;
            this.c = new ArrayList();
            SparseIntArray sparseIntArray = new SparseIntArray();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                if (i5 >= page && (i2 = i3 + 1) < this.b.size()) {
                    int i6 = 0;
                    while (true) {
                        i3 = i2;
                        if (i6 >= 10 || (i2 = i3 + 1) >= this.b.size()) {
                            break;
                        }
                        int page2 = this.b.get(i2).getPage() - 1;
                        if (page2 != page && page2 > page) {
                            page = page2;
                            break;
                        }
                        i6++;
                    }
                    i4 = 0;
                }
                sparseIntArray.put(i3, i4);
                com.zentraedi.reader.reader.m mVarA = new com.zentraedi.reader.reader.m.b().m(i3).j(i4).h(i4).a();
                mVarA.w(i5);
                mVarA.x(i);
                i4++;
                this.c.add(mVarA);
            }
            for (com.zentraedi.reader.reader.m mVar : this.c) {
                mVar.t(sparseIntArray.get(mVar.l()) + 1);
            }
        }
    }

    public float z() {
        return this.l;
    }
}
