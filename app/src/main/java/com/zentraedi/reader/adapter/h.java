package com.zentraedi.reader.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.n0;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.reader.adapter.view.NovelLinearLayout;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public class h extends RecyclerView.Adapter<a> implements com.zentraedi.reader.reader.a {
    private final Context a;
    private final d b;
    private List<com.zentraedi.reader.reader.m> c;
    private final com.zentraedi.reader.c d;
    private final com.zentraedi.reader.d e;

    public h(Context context, com.zentraedi.reader.c cVar, com.zentraedi.reader.d dVar, d dVar2) {
        this.a = context;
        this.b = dVar2;
        this.d = cVar;
        this.e = dVar;
    }

    public a E(int i, e eVar, View view) {
        if (i == 1) {
            return new a(eVar, view, this.a.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.Ub));
        }
        return i == 3 ? new a(eVar, view, this.d.getViewRect()[1]) : new a(eVar, view, this.d.getContentProperty().d + this.a.getResources().getDimensionPixelOffset(com.zentraedi.reader.h.g.d6));
    }

    @Override // 
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@n0 a aVar, int i) {
        aVar.a.z(g(i));
    }

    @Override // 
    @n0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@n0 ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(com.zentraedi.reader.h.l.M7, viewGroup, false);
        e eVarA = this.b.a(i, this.a, this.d, this.e);
        eVarA.n();
        return E(i, eVarA, viewInflate);
    }

    public void H(List<com.zentraedi.reader.reader.m> list) {
        this.c = list;
        notifyDataSetChanged();
    }

    @Override // com.zentraedi.reader.reader.a
    public void f(int i, List<com.zentraedi.reader.reader.m> list) {
        if (this.c.addAll(i, list)) {
            notifyItemRangeInserted(i, list.size() + i);
        }
    }

    @Override // com.zentraedi.reader.reader.a
    public com.zentraedi.reader.reader.m g(int i) {
        List<com.zentraedi.reader.reader.m> list;
        if (i < 0 || i >= getItemCount() || (list = this.c) == null) {
            return null;
        }
        return list.get(i);
    }

    @Override // com.zentraedi.reader.reader.a
    public List<com.zentraedi.reader.reader.m> getData() {
        return this.c;
    }

    @Override // com.zentraedi.reader.reader.a
    public int getItemCount() {
        return j0.i(this.c);
    }

    public int getItemViewType(int i) {
        com.zentraedi.reader.reader.m mVar = (com.zentraedi.reader.reader.m) j0.j(this.c, i);
        if (mVar != null) {
            return mVar.o();
        }
        return 0;
    }

    class a extends RecyclerView.ViewHolder {
        e a;

        public a(View view) {
            super(view);
        }

        public a(e eVar, View view, int i) {
            super(view);
            this.a = eVar;
            NovelLinearLayout novelLinearLayout = (NovelLinearLayout) view.findViewById(com.zentraedi.reader.h.i.c8);
            View viewM = this.a.m();
            if (viewM.getParent() != null) {
                ((ViewGroup) viewM.getParent()).removeView(viewM);
            }
            novelLinearLayout.addView(viewM, new LinearLayout.LayoutParams(-1, i));
            if (h.this.e.getOnTouchListener() != null) {
                novelLinearLayout.setOnTouchListener(h.this.e.getOnTouchListener());
            }
        }
    }
}
