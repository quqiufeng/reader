package com.zentraedi.comic.adapter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.comic.databinding.c3;
import com.zentraedi.comic.viewmodel.Layout;
import com.zentraedi.comic.viewmodel.m6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class k0 extends b {

    @fo.l
    private com.zentraedi.outreader.reader.h d;

    public static final class a implements com.zentraedi.reader.g {
        final /* synthetic */ c3 a;

        a(c3 c3Var) {
            this.a = c3Var;
        }

        @Override // com.zentraedi.reader.g
        public void a(int i, int i2, int i3) {
        }

        @Override // com.zentraedi.reader.g
        public void b(int i, Bitmap bitmap) {
            this.a.E.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(k0 k0Var, int i, View view) {
        b0 b0VarH = k0Var.H();
        if (b0VarH != null) {
            b0VarH.a(i);
        }
    }

    @Override // com.zentraedi.comic.adapter.b
    public void D(@fo.k Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
    }

    public final void O() {
        com.zentraedi.outreader.reader.h hVar = this.d;
        if (hVar != null) {
            hVar.onDestroy();
        }
        this.d = null;
    }

    @fo.l
    public final com.zentraedi.outreader.reader.h P() {
        return this.d;
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@fo.k c holder, final int i) {
        c3 c3Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        androidx.databinding.a aVar = G().get(i);
        if (!(aVar instanceof m6) || (c3Var = (c3) androidx.databinding.m.a(((RecyclerView.ViewHolder) holder).itemView)) == null) {
            return;
        }
        ImageFilterView imageFilterView = c3Var.E;
        imageFilterView.setImageDrawable(imageFilterView.getContext().getDrawable(com.zentraedi.comic.q.h.So));
        com.zentraedi.outreader.reader.h hVar = this.d;
        if (hVar != null) {
            hVar.g(((m6) aVar).getPosition() + 1, new a(c3Var));
        }
        c3Var.F.setText(String.valueOf(i + 1));
        ((RecyclerView.ViewHolder) holder).itemView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.adapter.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k0.R(this.a, i, view);
            }
        });
        c3Var.u();
    }

    public final void S() {
        com.zentraedi.outreader.reader.h hVar = this.d;
        if (hVar != null) {
            hVar.onDestroy();
        }
        this.d = null;
    }

    public final void T(@fo.l Activity activity, @fo.l com.zentraedi.outreader.reader.h hVar) {
        this.d = hVar;
        if (activity != null) {
            K(activity);
        }
    }

    public final void U(@fo.l com.zentraedi.outreader.reader.h hVar) {
        this.d = hVar;
    }
}
