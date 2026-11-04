package com.zentraedi.outreader.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.outreader.model.ChapterM;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class k extends com.zentraedi.outreader.adapter.a<ChapterM.Chapter, RecyclerView.ViewHolder> {
    private d e;
    private boolean f;

    class a implements View.OnClickListener {
        final /* synthetic */ int a;

        a(final int val$position) {
            this.a = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (k.this.e != null) {
                k.this.e.z(view, this.a);
            }
        }
    }

    public static class b extends ih.a<com.zentraedi.outreader.databinding.k> {
        public final TextView b;

        public b(com.zentraedi.outreader.databinding.k binding) {
            super(binding);
            this.b = binding.E;
        }
    }

    public static class c extends ih.a<com.zentraedi.outreader.databinding.i> {
        public final ImageView b;
        public final ImageView c;
        public final TextView d;
        public final ImageView e;
        public final ImageView f;
        public final TextView g;

        public c(com.zentraedi.outreader.databinding.i binding) {
            super(binding);
            this.g = binding.L;
            this.e = binding.I;
            this.d = binding.H;
            this.b = binding.F;
            this.f = binding.K;
            this.c = binding.G;
        }
    }

    public interface d {
        void z(View view, int position);
    }

    public k(Context context) {
        super(context);
        this.f = false;
    }

    @Override // com.zentraedi.outreader.adapter.a
    public void E(RecyclerView.ViewHolder viewHolder, final int position) {
        ChapterM.Chapter chapter = (ChapterM.Chapter) this.c.get(position);
        b bVar = (b) viewHolder;
        bVar.b.setText(chapter.name);
        if (chapter.isSelect) {
            bVar.b.setTypeface(Typeface.DEFAULT_BOLD);
            TextView textView = bVar.b;
            textView.setTextColor(androidx.core.content.e.g(textView.getContext(), com.zentraedi.outreader.d.f.Nx));
        } else {
            bVar.b.setTypeface(Typeface.DEFAULT);
            TextView textView2 = bVar.b;
            textView2.setTextColor(androidx.core.content.e.g(textView2.getContext(), com.zentraedi.outreader.d.f.Qx));
        }
        viewHolder.itemView.setOnClickListener(new a(position));
    }

    @Override // com.zentraedi.outreader.adapter.a
    public RecyclerView.ViewHolder F(ViewGroup parent, int viewType) {
        return new b((com.zentraedi.outreader.databinding.k) androidx.databinding.m.j(LayoutInflater.from(parent.getContext()), com.zentraedi.outreader.d.l.Q0, parent, false));
    }

    public void I(d listener) {
        this.e = listener;
    }
}
