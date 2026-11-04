package com.zentraedi.reader.pdfscroll;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.c0;
import androidx.databinding.m;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.artifex.mupdf.fitz.Document;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.reader.pdf.h;
import com.zentraedi.reader.reader.LocalPdfBookModel;
import fo.k;
import fo.l;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class c extends com.zentraedi.business.fragment.a {

    @l
    private String o;
    public com.zentraedi.reader.databinding.a p;

    @l
    private RecyclerView.LayoutManager q;

    @l
    private com.zentraedi.reader.pdfscroll.a r;

    @l
    private h s;

    @l
    private Document t;

    @l
    private RecyclerView u;

    @l
    private List<? extends LocalPdfBookModel.LocalPdfChapter> w;

    @k
    private final String n = "BookListFragment";

    @k
    private final Lazy v = LazyKt.lazy(new Function0() { // from class: com.zentraedi.reader.pdfscroll.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c.Q2();
        }
    });

    public static final class a extends RecyclerView.OnScrollListener {
        a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            c.this.P2();
        }
    }

    public static final class b extends h.b {
        private boolean a;

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(c cVar) {
            cVar.O2(0, 1);
        }

        @Override // com.zentraedi.reader.pdf.h.b
        public void a() {
            c cVar = c.this;
            cVar.S2(Document.openDocument(cVar.H2()));
            Document documentG2 = c.this.G2();
            Intrinsics.checkNotNull(documentG2);
            this.a = documentG2.needsPassword();
            c cVar2 = c.this;
            Document documentG3 = cVar2.G2();
            Intrinsics.checkNotNull(documentG3);
            cVar2.N2(documentG3);
        }

        public final boolean c() {
            return this.a;
        }

        public final void e(boolean z) {
            this.a = z;
        }

        @Override // com.zentraedi.reader.pdf.h.b, java.lang.Runnable
        public void run() {
            c cVar = c.this;
            FragmentActivity activity = cVar.getActivity();
            Document documentG2 = c.this.G2();
            List<LocalPdfBookModel.LocalPdfChapter> listI2 = c.this.I2();
            Document documentG3 = c.this.G2();
            cVar.r = new com.zentraedi.reader.pdfscroll.a(activity, null, documentG2, null, listI2, documentG3 != null ? documentG3.countPages() : 0);
            c.this.J2().E.setAdapter(c.this.r);
            com.zentraedi.reader.pdfscroll.a aVar = c.this.r;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
            Handler handler = new Handler();
            final c cVar2 = c.this;
            handler.postDelayed(new Runnable() { // from class: com.zentraedi.reader.pdfscroll.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.b.d(cVar2);
                }
            }, 1000L);
        }
    }

    private final void E2() {
        if (this.q == null) {
            this.q = new LinearLayoutManager(getActivity());
        }
        h hVar = new h(getActivity());
        this.s = hVar;
        Intrinsics.checkNotNull(hVar);
        hVar.b();
    }

    private final void F2() {
        RecyclerView recyclerView = J2().E;
        this.u = recyclerView;
        Intrinsics.checkNotNull(recyclerView);
        if (recyclerView.getLayoutManager() != this.q) {
            RecyclerView recyclerView2 = this.u;
            Intrinsics.checkNotNull(recyclerView2);
            recyclerView2.setLayoutManager(this.q);
        }
        RecyclerView recyclerView3 = this.u;
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(new a());
        }
    }

    private final void M2() {
        if (this.o == null) {
            return;
        }
        R2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2(int i, int i2) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (i == -1 || i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        while (i < i3) {
            RecyclerView recyclerView = this.u;
            if (recyclerView != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) != null) {
                com.zentraedi.reader.pdfscroll.a.C0205a c0205a = (com.zentraedi.reader.pdfscroll.a.C0205a) viewHolderFindViewHolderForAdapterPosition;
                com.zentraedi.reader.pdfscroll.a aVar = this.r;
                if (aVar != null) {
                    aVar.O(c0205a, i);
                }
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P2() {
        RecyclerView recyclerView;
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity);
            if (activity.isFinishing() || (recyclerView = this.u) == null || recyclerView.getScrollState() != 0) {
                return;
            }
            LinearLayoutManager linearLayoutManager = this.q;
            Intrinsics.checkNotNull(linearLayoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            LinearLayoutManager linearLayoutManager2 = this.q;
            Intrinsics.checkNotNull(linearLayoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
            nd.a.a(this.n, "scroll position:" + iFindFirstVisibleItemPosition + ", end:" + iFindLastVisibleItemPosition);
            O2(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e Q2() {
        return new e();
    }

    @l
    protected final Document G2() {
        return this.t;
    }

    @l
    public final String H2() {
        return this.o;
    }

    @l
    public final List<LocalPdfBookModel.LocalPdfChapter> I2() {
        return this.w;
    }

    @k
    public final com.zentraedi.reader.databinding.a J2() {
        com.zentraedi.reader.databinding.a aVar = this.p;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    @k
    public final e K2() {
        return (e) this.v.getValue();
    }

    @l
    protected final h L2() {
        return this.s;
    }

    protected final void N2(@k Document document) {
        Intrinsics.checkNotNullParameter(document, "document");
        document.layout(k0.m(getActivity()), k0.j(getActivity()) - 80.0f, 50.0f);
        try {
            this.w = com.zentraedi.reader.pdf.e.a(document);
        } catch (Exception unused) {
        }
    }

    protected final void R2() {
        h hVar = this.s;
        if (hVar != null) {
            hVar.a(new b());
        }
    }

    protected final void S2(@l Document document) {
        this.t = document;
    }

    public final void T2(@l String str) {
        this.o = str;
    }

    public final void U2(@l List<? extends LocalPdfBookModel.LocalPdfChapter> list) {
        this.w = list;
    }

    public final void V2(@k com.zentraedi.reader.databinding.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.p = aVar;
    }

    protected final void W2(@l h hVar) {
        this.s = hVar;
    }

    @l
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (this.p != null) {
            return J2().getRoot();
        }
        c0 c0VarJ = m.j(inflater, com.zentraedi.reader.h.l.h4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c0VarJ, "inflate(...)");
        V2((com.zentraedi.reader.databinding.a) c0VarJ);
        View root = J2().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        E2();
        F2();
        M2();
        return root;
    }

    public void onDestroyView() {
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
    }
}
