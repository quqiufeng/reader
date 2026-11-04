package com.zentraedi.outreader.adapter.viewholder;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.business.adapter.n;
import com.zentraedi.outreader.databinding.a0;
import com.zentraedi.outreader.reader.PDFTronZReader;
import com.zentraedi.reader.g;
import fo.k;
import fo.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class e extends n<com.zentraedi.outreader.model.a> {

    @k
    private final a0 e;

    @l
    private PDFTronZReader f;

    public static final class a implements g {
        final /* synthetic */ com.zentraedi.outreader.model.a a;
        final /* synthetic */ e b;

        a(com.zentraedi.outreader.model.a aVar, e eVar) {
            this.a = aVar;
            this.b = eVar;
        }

        @Override // com.zentraedi.reader.g
        public void a(int i, int i2, int i3) {
        }

        @Override // com.zentraedi.reader.g
        public void b(int i, Bitmap bitmap) {
            if (i != this.a.e() || bitmap == null) {
                return;
            }
            this.b.r().E.setImageBitmap(bitmap);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(@k a0 mBinding) {
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        View root = mBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.e = mBinding;
        ((RecyclerView.ViewHolder) this).itemView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.adapter.viewholder.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.q(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(e eVar, View view) {
        eVar.f().invoke(eVar.c(), view, Integer.valueOf(eVar.d()));
    }

    @k
    public final a0 r() {
        return this.e;
    }

    @l
    public final PDFTronZReader s() {
        return this.f;
    }

    public final void t(@l PDFTronZReader pDFTronZReader) {
        this.f = pDFTronZReader;
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void n(@l Bundle bundle, @l com.zentraedi.outreader.model.a aVar, int i) {
        super.n(bundle, aVar, i);
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void o(@l com.zentraedi.outreader.model.a aVar, int i) {
        super.m(aVar, i);
        if (aVar == null) {
            return;
        }
        if (aVar.f()) {
            this.e.F.setBackgroundResource(com.zentraedi.outreader.d.h.LY);
        } else {
            this.e.F.setBackgroundResource(com.zentraedi.outreader.d.h.KY);
        }
        this.e.E.setImageResource(com.zentraedi.outreader.d.h.dR);
        this.e.H.setText(String.valueOf(aVar.e()));
        PDFTronZReader pDFTronZReader = this.f;
        if (pDFTronZReader != null) {
            pDFTronZReader.b0(aVar.e(), new a(aVar, this));
        }
    }
}
