package com.zentraedi.reader.reader;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.p0;
import com.artifex.mupdf.fitz.Document;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.basic.function.utils.k0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class e {
    public static final int A = 2;
    private static final Class<?> B = e.class;
    private static final int C = 12;
    public static final int z = 1;
    protected final Context b;
    protected f c;
    private final PageView e;
    private Paint f;
    private Paint g;
    private TextPaint h;
    private TextPaint i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private m s;
    private m t;
    private m u;
    private List<k> v;
    private int w;
    private com.zentraedi.reader.pdf.f x;
    private boolean y;
    protected int a = 1;
    protected boolean d = false;

    public e(PageView pageView) {
        this.e = pageView;
        this.b = pageView.getContext();
        u();
        v();
    }

    public static int c(Context context) {
        return context.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.p7);
    }

    public static int d(Context context) {
        return context.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.q7);
    }

    private List<m> j(int i) {
        nd.a.e("nas_book", "PageLoader->getPageList section=" + i);
        g gVar = new g(this.h, this.j, this.k, this.q, this.r);
        g gVar2 = new g(this.i, this.j, this.k, this.q, this.r);
        f fVar = this.c;
        if (fVar == null) {
            return null;
        }
        if (fVar.o(i) == 0) {
            return n(i, gVar, gVar2);
        }
        if (this.c.o(i) == 2) {
            return m(i);
        }
        return null;
    }

    @p0
    private ArrayList<m> m(int i) {
        nd.a.e("nas_book", "PageLoader->getPagesMupdf section=" + i);
        PageView pageView = this.e;
        ArrayList<m> arrayList = null;
        if (pageView != null && pageView.getDocument() != null) {
            if (this.x == null) {
                this.x = new com.zentraedi.reader.pdf.f();
            }
            this.x.n(this.l, this.m);
            Document document = this.e.getDocument();
            if (document == null) {
                return null;
            }
            int iCountPages = document.countPages();
            k kVar = (k) j0.j(this.v, i);
            if (kVar == null) {
                return null;
            }
            arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < iCountPages; i2++) {
                m mVarA = new m.b().l(kVar).m(i).h(i2).o(0).j(arrayList.size()).a();
                mVarA.x(iCountPages);
                arrayList.add(mVarA);
            }
        }
        return arrayList;
    }

    @p0
    private List<m> n(int i, g gVar, g gVar2) {
        int iE = this.c.e(i, gVar, gVar2);
        if (iE <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        k kVar = (k) j0.j(this.v, i);
        if (kVar == null) {
            return null;
        }
        int i2 = kVar.f;
        int i3 = 0;
        int i4 = 0;
        while (i3 < iE) {
            int length = this.c.c(i, i3).length();
            i2 += length;
            int i5 = length + i4;
            int i6 = i5 - 1;
            if (i6 < i4) {
                i6 = i4;
            }
            int iM = this.c.m(i, i3);
            l.a aVarH = this.c.h(i, i3, gVar, gVar2);
            arrayList.add(new m.b().j(i3).e(aVarH.d).l(this.v.get(i)).m(i).p(i2).c(this.c.f(i, i3)).n(i4).d(i6).i(iM).h(i3).k(aVarH.b).o(aVarH.c).f(aVarH.a).a());
            i3++;
            i4 = i5;
        }
        return arrayList;
    }

    private void u() {
        nd.a.e("nas_book", "PageLoader->initData");
        this.n = this.e.getContext().getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.p6);
        this.p = c(this.b);
        this.q = this.e.getContext().getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.d6);
        this.r = 0;
    }

    private void v() {
        Paint paint = new Paint();
        this.g = paint;
        paint.setColor(this.e.getTextColor());
        this.g.setTextAlign(Paint.Align.LEFT);
        this.g.setTextSize(k0.y(this.b, 12));
        this.g.setAntiAlias(true);
        this.g.setSubpixelText(true);
        TextPaint textPaint = new TextPaint();
        this.h = textPaint;
        textPaint.setColor(this.e.getTextColor());
        this.h.setTextSize(this.e.getTextSize());
        this.h.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setAntiAlias(true);
        this.f.setDither(true);
        this.f.setColor(this.e.getTextColor());
        TextPaint textPaint2 = new TextPaint();
        this.i = textPaint2;
        textPaint2.setColor(this.e.getTitleColor());
        this.i.setTextSize((int) (((double) this.e.getTextSize()) * 1.2d));
        this.i.setTypeface(Typeface.DEFAULT_BOLD);
        this.i.setAntiAlias(true);
    }

    public void A(f fVar) {
        this.c = fVar;
    }

    public void B(List<k> list) {
        this.v = list;
        if (list != null) {
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                this.v.get(i2).f = i;
                i += this.v.get(i2).i;
                this.v.get(i2).g = j0.i(this.v);
            }
        }
    }

    void C(int i, int i2) {
        this.l = i;
        this.m = i2;
        int i3 = this.w;
        if (i3 > 0) {
            int i4 = i - (this.n * 2);
            this.j = i4;
            int i5 = (i4 / i3) * i3;
            this.j = i5;
            this.o = (i - i5) / 2;
        }
        this.k = i2 - this.p;
    }

    public void D(int i) {
        this.q = i;
    }

    public void E(int i) {
        this.o = i;
    }

    public void F(int i) {
        nd.a.e("nas_book", "PageLoader->setMarginWidthInit marginWidthInit=" + i + " mMarginWidth=" + this.o + " mDisplayWidth=" + this.l + " mTextSize=" + this.w);
        this.n = i;
        int i2 = this.l;
        if (i2 > 0) {
            this.j = i2 - (i * 2);
        }
        if (this.w > 0) {
            this.o = (i2 - this.j) / 2;
        }
        nd.a.e("nas_book", "PageLoader->setMarginWidthInit mMarginWidth=" + this.o + " mVisibleWidth=" + this.j);
    }

    public void G(boolean z2) {
        this.y = z2;
    }

    public void H(int i) {
        this.r = i;
    }

    public void I(int i) {
        this.h.setColor(i);
    }

    public void J(int i) {
        nd.a.e("nas_book", "PageLoader->setTextSize textSize=" + i + " mMarginWidthInit=" + this.n);
        this.w = i;
        this.h.setTextSize((float) i);
        this.i.setTextSize((float) ((int) (((double) i) * 1.2d)));
        int i2 = this.l;
        if (i2 > 0) {
            int i3 = i2 - (this.n * 2);
            this.j = i3;
            int i4 = this.w;
            if (i4 > 0) {
                int i5 = (i3 / i4) * i4;
                this.j = i5;
                this.o = (i2 - i5) / 2;
            }
        }
    }

    public void K(int i) {
        this.f.setColor(i);
        this.g.setColor(i);
    }

    public void L(int i) {
        this.i.setColor(i);
    }

    public void M(Typeface typeface) {
        this.h.setTypeface(typeface);
        this.i.setTypeface(typeface);
    }

    public void a(int i) {
        f fVar = this.c;
        if (fVar != null) {
            fVar.b(i);
        }
    }

    public void b() {
        f fVar = this.c;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    public f e() {
        return this.c;
    }

    public Paint f() {
        return this.f;
    }

    public g g() {
        return new g(this.h, this.j, this.k, this.q, this.r);
    }

    int h() {
        return this.o;
    }

    public com.zentraedi.reader.pdf.f i() {
        return this.x;
    }

    public int k(int i, int i2, List<m> list) {
        if (this.c == null) {
            nd.a.a(com.zentraedi.reader.f.a, "");
            return 0;
        }
        if (list == null || list.size() == 0) {
            nd.a.a(com.zentraedi.reader.f.a, "");
            return 0;
        }
        int length = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            length += this.c.c(i, i3).length();
            if (length > i2) {
                return i3;
            }
        }
        nd.a.a(com.zentraedi.reader.f.a, "");
        return 0;
    }

    public int l(int i, int i2, List<m> list) {
        if (list == null || list.size() == 0) {
            nd.a.a(com.zentraedi.reader.f.a, "");
            return -1;
        }
        int length = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            m mVar = list.get(i3);
            if (mVar != null) {
                List<String> listE = mVar.e();
                if (listE != null && !j0.l(listE)) {
                    for (int i4 = 0; i4 < listE.size(); i4++) {
                        if (listE.get(i4) != null) {
                            length += listE.get(i4).length();
                        }
                    }
                }
                if (length > i2) {
                    return i3;
                }
            }
        }
        nd.a.a(com.zentraedi.reader.f.a, "");
        return -1;
    }

    public k o(int i) {
        return this.v.get(i);
    }

    public List<k> p() {
        return this.v;
    }

    public Paint q() {
        return this.g;
    }

    public g r() {
        return new g(this.i, this.j, this.k, this.q, this.r);
    }

    public boolean s(int i) {
        return i + 1 < j0.i(this.v);
    }

    public boolean t(int i) {
        return i - 1 >= 0;
    }

    public boolean w() {
        return this.y;
    }

    public void x(int i) {
        if (s(i)) {
            int i2 = i + 1;
            f fVar = this.c;
            if (fVar == null || fVar.k(i)) {
                nd.a.a(com.zentraedi.reader.f.a, "loadSectionContent section = %d 已经加载过了" + i2);
                return;
            }
            if (this.v.size() > i) {
                nd.a.a(com.zentraedi.reader.f.a, "loadSectionContent section = %d" + i2);
                this.c.l(i2);
            }
        }
    }

    public void y(int i) {
        f fVar;
        if (t(i) && (fVar = this.c) != null && !fVar.p(i) && this.v.size() > i) {
            this.c.l(i - 1);
        }
    }

    public List<m> z(int i) {
        nd.a.e("nas_book", "PageLoader->openChapter section=" + i);
        if (i < 0) {
            return null;
        }
        List<m> listJ = j(i);
        this.a = 2;
        if (!this.d) {
            this.d = true;
        }
        return listJ;
    }
}
