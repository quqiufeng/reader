package com.zentraedi.reader.pdfscroll;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.artifex.mupdf.fitz.Document;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.reader.adapter.PdfBitmapLoader;
import com.zentraedi.reader.f;
import com.zentraedi.reader.h;
import com.zentraedi.reader.pdf.MuPdfPageView;
import com.zentraedi.reader.reader.LocalPdfBookModel;
import com.zentraedi.reader.reader.m;
import fo.k;
import fo.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class a extends RecyclerView.Adapter<C0205a> {

    @l
    private Context a;

    @l
    private Document b;

    @l
    private List<? extends LocalPdfBookModel.LocalPdfChapter> c;

    @l
    private List<m> d;

    @l
    private com.zentraedi.reader.pdf.d e;

    @l
    private PdfBitmapLoader f;

    @l
    private com.zentraedi.reader.d g;
    private int h;
    private int i;

    @l
    private String j;

    @l
    private Bitmap k;
    private int l;
    private float m;
    private boolean n;
    private int o;

    /* JADX INFO: renamed from: com.zentraedi.reader.pdfscroll.a$a, reason: collision with other inner class name */
    public static final class C0205a extends RecyclerView.ViewHolder {

        @l
        private MuPdfPageView a;
        private int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0205a(@k View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        @l
        public final MuPdfPageView a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final void c(@l MuPdfPageView muPdfPageView) {
            this.a = muPdfPageView;
        }

        public final void d(int i) {
            this.b = i;
        }
    }

    public a() {
        this.m = 1.0f;
    }

    private final void E(C0205a c0205a) {
        c0205a.c((MuPdfPageView) ((RecyclerView.ViewHolder) c0205a).itemView.findViewById(h.i.ng));
        MuPdfPageView muPdfPageViewA = c0205a.a();
        Intrinsics.checkNotNull(muPdfPageViewA);
        com.zentraedi.reader.d dVar = this.g;
        muPdfPageViewA.setOnTouchListener(dVar != null ? dVar.getOnTouchListener() : null);
        MuPdfPageView muPdfPageViewA2 = c0205a.a();
        Intrinsics.checkNotNull(muPdfPageViewA2);
        com.zentraedi.reader.d dVar2 = this.g;
        muPdfPageViewA2.setActionListener(dVar2 != null ? dVar2.getPdfScaleListener() : null);
        MuPdfPageView muPdfPageViewA3 = c0205a.a();
        Intrinsics.checkNotNull(muPdfPageViewA3);
        com.zentraedi.reader.d dVar3 = this.g;
        muPdfPageViewA3.setInnerOnTouchListener(dVar3 != null ? dVar3.getInnerOnTouchListener() : null);
        MuPdfPageView muPdfPageViewA4 = c0205a.a();
        Intrinsics.checkNotNull(muPdfPageViewA4);
        muPdfPageViewA4.setActionListener(this.e);
        MuPdfPageView muPdfPageViewA5 = c0205a.a();
        Intrinsics.checkNotNull(muPdfPageViewA5);
        muPdfPageViewA5.f(this.k, 1.0f, false, null, null);
        ((RecyclerView.ViewHolder) c0205a).itemView.setTag(c0205a);
    }

    private final void M(int i) {
        int page;
        if (this.d == null && !j0.l(this.c)) {
            if (i == 0) {
                Document document = this.b;
                Intrinsics.checkNotNull(document);
                i = document.countPages();
            }
            this.l = i;
            List<? extends LocalPdfBookModel.LocalPdfChapter> list = this.c;
            Intrinsics.checkNotNull(list);
            if (1 < list.size()) {
                List<? extends LocalPdfBookModel.LocalPdfChapter> list2 = this.c;
                Intrinsics.checkNotNull(list2);
                page = list2.get(1).getPage();
            } else {
                page = -1;
            }
            this.d = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                if (i4 == page) {
                    int i5 = i2 + 1;
                    int i6 = i2 + 2;
                    List<? extends LocalPdfBookModel.LocalPdfChapter> list3 = this.c;
                    Intrinsics.checkNotNull(list3);
                    if (i6 >= list3.size()) {
                        i2 = i5;
                        break;
                    }
                    int i7 = 0;
                    while (true) {
                        if (i7 < 10) {
                            int i8 = i5 + 1;
                            List<? extends LocalPdfBookModel.LocalPdfChapter> list4 = this.c;
                            Intrinsics.checkNotNull(list4);
                            if (i8 < list4.size()) {
                                List<? extends LocalPdfBookModel.LocalPdfChapter> list5 = this.c;
                                Intrinsics.checkNotNull(list5);
                                int page2 = list5.get(i8).getPage();
                                if (page2 != page) {
                                    i2 = i5;
                                    page = page2;
                                    break;
                                } else {
                                    i7++;
                                    i5 = i8;
                                }
                            }
                        }
                        i2 = i5;
                        break;
                    }
                    i3 = 0;
                }
                m mVarA = new m.b().m(i2).j(i3).h(i3).a();
                mVarA.w(i4);
                mVarA.x(i);
                i3++;
                List<m> list6 = this.d;
                if (list6 != null) {
                    Intrinsics.checkNotNull(mVarA);
                    list6.add(mVarA);
                }
            }
        }
    }

    public final void D(int i) {
        this.n = true;
        this.o = i;
    }

    public final void F() {
        PdfBitmapLoader pdfBitmapLoader = this.f;
        if (pdfBitmapLoader != null) {
            Intrinsics.checkNotNull(pdfBitmapLoader);
            pdfBitmapLoader.c();
        }
        Document document = this.b;
        if (document != null) {
            Intrinsics.checkNotNull(document);
            document.destroy();
            this.b = null;
        }
    }

    public final void G(@k ViewGroup container, int i, @k Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        if (object instanceof RelativeLayout) {
            RelativeLayout relativeLayout = (RelativeLayout) object;
            if (relativeLayout.getTag() instanceof C0205a) {
                Object tag = relativeLayout.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.zentraedi.reader.pdfscroll.PdfScrollAdapter.PDFViewHolder");
                MuPdfPageView muPdfPageViewA = ((C0205a) tag).a();
                Intrinsics.checkNotNull(muPdfPageViewA);
                muPdfPageViewA.a();
            }
            container.removeView((View) object);
            PdfBitmapLoader pdfBitmapLoader = this.f;
            Intrinsics.checkNotNull(pdfBitmapLoader);
            pdfBitmapLoader.a(i);
        }
    }

    public final void H() {
        this.n = false;
    }

    @l
    public final List<LocalPdfBookModel.LocalPdfChapter> I() {
        List list = this.c;
        if (list != null) {
            return list;
        }
        List<LocalPdfBookModel.LocalPdfChapter> listA = com.zentraedi.reader.pdf.e.a(this.b);
        this.c = listA;
        return listA;
    }

    public final int J() {
        return this.l;
    }

    @l
    public final String K() {
        return this.j;
    }

    public final int L(@k Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        if (!(object instanceof View)) {
            return -2;
        }
        View view = (View) object;
        if (!(view.getTag() instanceof C0205a)) {
            return -2;
        }
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.zentraedi.reader.pdfscroll.PdfScrollAdapter.PDFViewHolder");
        int position = ((C0205a) tag).getPosition();
        if (!this.n || position == this.o) {
            return position;
        }
        return -2;
    }

    public final float N() {
        return this.m;
    }

    public final void O(@k C0205a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewGroup.LayoutParams layoutParams = ((RecyclerView.ViewHolder) holder).itemView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = k0.i();
        }
        ((RecyclerView.ViewHolder) holder).itemView.requestLayout();
        MuPdfPageView muPdfPageViewA = holder.a();
        Intrinsics.checkNotNull(muPdfPageViewA);
        com.zentraedi.reader.d dVar = this.g;
        muPdfPageViewA.setOnTouchListener(dVar != null ? dVar.getOnTouchListener() : null);
        MuPdfPageView muPdfPageViewA2 = holder.a();
        Intrinsics.checkNotNull(muPdfPageViewA2);
        com.zentraedi.reader.d dVar2 = this.g;
        muPdfPageViewA2.setInnerOnTouchListener(dVar2 != null ? dVar2.getInnerOnTouchListener() : null);
        MuPdfPageView muPdfPageViewA3 = holder.a();
        Intrinsics.checkNotNull(muPdfPageViewA3);
        muPdfPageViewA3.setActionListener(this.e);
        int i2 = this.h;
        int i3 = this.i;
        PdfBitmapLoader pdfBitmapLoader = this.f;
        Intrinsics.checkNotNull(pdfBitmapLoader);
        pdfBitmapLoader.e(holder, i, i2, i3, this.m);
    }

    public final boolean P(@k View view, @k Object o) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(o, "o");
        return view == o;
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@k C0205a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewGroup.LayoutParams layoutParams = ((RecyclerView.ViewHolder) holder).itemView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = k0.i();
        }
        holder.c((MuPdfPageView) ((RecyclerView.ViewHolder) holder).itemView.findViewById(h.i.ng));
        holder.d(i);
        ((RecyclerView.ViewHolder) holder).itemView.setTag(holder);
        MuPdfPageView muPdfPageViewA = holder.a();
        if (muPdfPageViewA != null) {
            muPdfPageViewA.a();
        }
    }

    @k
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public C0205a onCreateViewHolder(@k ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.a).inflate(h.l.A5, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        return new C0205a((RelativeLayout) viewInflate);
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@k C0205a holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        MuPdfPageView muPdfPageViewA = holder.a();
        if (muPdfPageViewA != null) {
            muPdfPageViewA.a();
        }
    }

    public final void T(@l String str) {
        this.j = str;
    }

    public final void U(@l List<? extends m> list) {
        nd.a.a(f.a, "");
    }

    public final void V(float f) {
        this.m = f;
    }

    public final void f(int i, @l List<? extends m> list) {
        nd.a.a(f.a, "");
    }

    @l
    public final m g(int i) {
        List<m> list = this.d;
        Intrinsics.checkNotNull(list);
        if (i >= list.size()) {
            return null;
        }
        List<m> list2 = this.d;
        Intrinsics.checkNotNull(list2);
        return list2.get(i);
    }

    @l
    public final List<m> getData() {
        return null;
    }

    public int getItemCount() {
        return this.l;
    }

    public a(@l Context context, @l com.zentraedi.reader.pdf.d dVar, @l Document document, @l com.zentraedi.reader.d dVar2, @l List<? extends LocalPdfBookModel.LocalPdfChapter> list, int i) {
        this();
        this.a = context;
        this.b = document;
        this.f = new PdfBitmapLoader((Activity) context, document);
        if (j0.l(list)) {
            I();
        } else {
            this.c = list;
        }
        M(i);
        this.e = dVar;
        this.g = dVar2;
        Activity activity = (Activity) this.a;
        Intrinsics.checkNotNull(activity);
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.h = point.x;
        this.i = point.y;
    }
}
