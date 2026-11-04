package com.zentraedi.reader.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.reader.reader.LocalPdfBookModel;
import com.zentraedi.reader.view.PdfPhotoView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class i extends h {
    private static final Class<?> n = i.class;
    private final Context f;
    private final d g;
    private List<com.zentraedi.reader.reader.m> h;
    private final com.zentraedi.reader.c i;
    private final com.zentraedi.reader.d j;
    private com.zentraedi.reader.i k;
    private List<LocalPdfBookModel.LocalPdfChapter> l;
    private int m;

    class a implements com.zentraedi.reader.g {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // com.zentraedi.reader.g
        public void a(int i, int i2, int i3) {
        }

        @Override // com.zentraedi.reader.g
        public void b(int i, @fo.l Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                this.a.c.a.setImage(com.davemorrissey.labs.subscaleview.a.b(bitmap));
            } catch (IllegalArgumentException e) {
                nd.a.d("Bitmap", "Cannot create bitmap from recycled source", e);
            }
        }
    }

    class b extends h.a {
        k.c c;

        public b(View view) {
            super(view);
            k.c cVar = new k.c();
            cVar.a = (PdfPhotoView) view.findViewById(com.zentraedi.reader.h.i.ng);
            view.getLayoutParams().height = -2;
            cVar.a.getLayoutParams().height = -2;
            cVar.a.setZoomEnabled(false);
            cVar.a.setMaxScale(10.0f);
            cVar.a.setDoubleTapZoomScale(1.0f);
            cVar.a.setOnTouchListener(i.this.j.getOnTouchListener());
            cVar.a.setPageClickEvent(i.this.j.getPageClickEvent());
            view.setTag(cVar);
            this.c = cVar;
        }
    }

    public i(Context context, com.zentraedi.reader.i iVar, com.zentraedi.reader.c cVar, com.zentraedi.reader.d dVar, List<LocalPdfBookModel.LocalPdfChapter> list, int i) {
        super(context, cVar, dVar, null);
        this.f = context;
        this.k = iVar;
        this.g = null;
        this.i = cVar;
        this.j = dVar;
        this.l = list;
        J(i);
    }

    @Override // com.zentraedi.reader.adapter.h
    /* JADX INFO: renamed from: F */
    public void onBindViewHolder(@n0 h.a aVar, int i) {
        b bVar = (b) aVar;
        com.zentraedi.reader.i iVar = this.k;
        if (iVar != null) {
            iVar.k(i + 1, new a(bVar));
        }
    }

    @Override // com.zentraedi.reader.adapter.h
    public void H(List<com.zentraedi.reader.reader.m> list) {
        this.h = list;
        notifyDataSetChanged();
    }

    public void J(int i) {
        int i2;
        com.zentraedi.reader.i iVar;
        if (this.h == null && !j0.l(this.l)) {
            if (i == 0 && (iVar = this.k) != null) {
                i = iVar.b();
            }
            this.m = i;
            int page = 1 < this.l.size() ? this.l.get(1).getPage() - 1 : 1;
            this.h = new ArrayList();
            SparseIntArray sparseIntArray = new SparseIntArray();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                if (i5 >= page && (i2 = i3 + 1) < this.l.size()) {
                    int i6 = 0;
                    while (true) {
                        i3 = i2;
                        if (i6 >= 10 || (i2 = i3 + 1) >= this.l.size()) {
                            break;
                        }
                        int page2 = this.l.get(i2).getPage() - 1;
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
                this.h.add(mVarA);
            }
            for (com.zentraedi.reader.reader.m mVar : this.h) {
                mVar.t(sparseIntArray.get(mVar.l()) + 1);
            }
        }
    }

    @Override // com.zentraedi.reader.adapter.h
    @n0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@n0 ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(com.zentraedi.reader.h.l.Ka, viewGroup, false));
    }

    public void L() {
        this.l = null;
        this.h = null;
    }

    @Override // com.zentraedi.reader.adapter.h, com.zentraedi.reader.reader.a
    public void f(int i, List<com.zentraedi.reader.reader.m> list) {
        if (this.h.addAll(i, list)) {
            notifyItemRangeInserted(i, list.size() + i);
        }
    }

    @Override // com.zentraedi.reader.adapter.h, com.zentraedi.reader.reader.a
    public com.zentraedi.reader.reader.m g(int i) {
        List<com.zentraedi.reader.reader.m> list;
        if (i < 0 || i >= getItemCount() || (list = this.h) == null) {
            return null;
        }
        return list.get(i);
    }

    @Override // com.zentraedi.reader.adapter.h, com.zentraedi.reader.reader.a
    public List<com.zentraedi.reader.reader.m> getData() {
        return this.h;
    }

    @Override // com.zentraedi.reader.adapter.h, com.zentraedi.reader.reader.a
    public int getItemCount() {
        return j0.i(this.h);
    }

    @Override // com.zentraedi.reader.adapter.h
    public int getItemViewType(int i) {
        com.zentraedi.reader.reader.m mVar = (com.zentraedi.reader.reader.m) j0.j(this.h, i);
        if (mVar != null) {
            return mVar.o();
        }
        return 0;
    }
}
