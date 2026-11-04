package com.zentraedi.reader.adapter;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.reader.NovelTextView;
import com.zentraedi.reader.pdf.MuPdfPageView;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class f extends e {
    private final NovelTextView v;
    private final MuPdfPageView w;
    private final com.zentraedi.reader.pdf.f x;
    private final LinearLayout y;

    class a implements com.zentraedi.reader.pdf.c {
        a() {
        }

        @Override // com.zentraedi.reader.pdf.c
        public void a(int i, int i2, PdfBitmapLoader.MuPDFPageData muPDFPageData) {
            f.this.w.f(muPDFPageData.mBitmap, 1.0f, false, null, null);
            if (f.this.l() == 2 || f.this.l() == 4) {
                return;
            }
            f.this.w.setOnTouchListener(f.this.d.getOnTouchListener());
            f.this.w.setInnerOnTouchListener(f.this.d.getInnerOnTouchListener());
        }

        @Override // com.zentraedi.reader.pdf.c
        public void b(int i, int i2) {
        }
    }

    public f(Context context, com.zentraedi.reader.c cVar, com.zentraedi.reader.d dVar) {
        super(context, cVar, dVar, com.zentraedi.reader.h.l.B8);
        this.v = (NovelTextView) this.b.findViewById(com.zentraedi.reader.h.i.O3);
        MuPdfPageView muPdfPageView = (MuPdfPageView) this.b.findViewById(com.zentraedi.reader.h.i.ng);
        this.w = muPdfPageView;
        muPdfPageView.setForbiddenZoom(true);
        this.y = (LinearLayout) this.b.findViewById(com.zentraedi.reader.h.i.qb);
        this.x = cVar.getMupdfCache();
        u(this.c.c(), this.c.getViewMode());
        x(5);
    }

    private void D() {
        if (this.c.c()) {
            ((TextView) this.y.findViewById(com.zentraedi.reader.h.i.Vf)).setTextColor(androidx.core.content.e.g(this.a, com.zentraedi.reader.h.f.p3));
            ((TextView) this.y.findViewById(com.zentraedi.reader.h.i.Uf)).setTextColor(androidx.core.content.e.g(this.a, com.zentraedi.reader.h.f.x2));
            ((TextView) this.y.findViewById(com.zentraedi.reader.h.i.Wf)).setTextColor(androidx.core.content.e.g(this.a, com.zentraedi.reader.h.f.o3));
        } else {
            ((TextView) this.y.findViewById(com.zentraedi.reader.h.i.Vf)).setTextColor(androidx.core.content.e.g(this.a, com.zentraedi.reader.h.f.k2));
            ((TextView) this.y.findViewById(com.zentraedi.reader.h.i.Uf)).setTextColor(androidx.core.content.e.g(this.a, com.zentraedi.reader.h.f.w2));
            ((TextView) this.y.findViewById(com.zentraedi.reader.h.i.Wf)).setTextColor(androidx.core.content.e.g(this.a, com.zentraedi.reader.h.f.b6));
        }
    }

    @Override // com.zentraedi.reader.adapter.e
    public void j() {
        super.j();
        AppCompatTextView appCompatTextView = this.v;
        if (appCompatTextView != null) {
            appCompatTextView.setText("");
            this.v.invalidate();
            this.v.setTxtPage(null);
        }
    }

    @Override // com.zentraedi.reader.adapter.e
    public void k(com.zentraedi.reader.reader.m mVar) {
        List<String> listE = mVar.e();
        if (listE != null && !j0.l(listE)) {
            this.w.setVisibility(8);
            this.v.setVisibility(0);
            this.y.setVisibility(8);
            this.v.setTxtPage(mVar);
            return;
        }
        this.v.setVisibility(8);
        if (!mVar.r()) {
            this.w.setVisibility(0);
            this.y.setVisibility(8);
            com.zentraedi.reader.pdf.f fVar = this.x;
            if (fVar != null) {
                fVar.h(mVar, new a());
                return;
            }
            return;
        }
        this.w.setVisibility(8);
        this.y.setVisibility(0);
        if (mVar.k() == null || mVar.k().a == null || mVar.k().b == null) {
            return;
        }
        ((TextView) this.y.findViewById(com.zentraedi.reader.h.i.Vf)).setText(mVar.k().b);
        ((TextView) this.y.findViewById(com.zentraedi.reader.h.i.Uf)).setText(mVar.k().a);
    }

    @Override // com.zentraedi.reader.adapter.e
    public void onEvent(com.zentraedi.reader.event.c cVar) {
        if (cVar != null && cVar.c == 102) {
            com.zentraedi.reader.event.d dVar = (com.zentraedi.reader.event.d) cVar;
            com.zentraedi.reader.reader.m mVar = this.k;
            if (mVar != null) {
                if (mVar.l() == dVar.g.l() && this.k.h() == dVar.g.h()) {
                    this.v.x(dVar.f, dVar.e);
                } else {
                    this.v.x(-1, -1);
                }
            }
        }
    }

    @Override // com.zentraedi.reader.adapter.e
    public void u(boolean z, int i) {
        this.v.y(this.c, this.l);
        this.v.invalidate();
        D();
    }
}
