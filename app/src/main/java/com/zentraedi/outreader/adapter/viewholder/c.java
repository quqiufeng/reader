package com.zentraedi.outreader.adapter.viewholder;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zentraedi.basic.function.utils.h;
import com.zentraedi.business.adapter.n;
import com.zentraedi.outreader.databinding.y;
import com.zentraedi.outreader.model.BookMarkInfoModel;
import com.zentraedi.outreader.model.BookMarkModel;
import fo.k;
import fo.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class c extends n<BookMarkModel> {

    @k
    private final y e;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(@k y mBinding) {
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        View root = mBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.e = mBinding;
        ((RecyclerView.ViewHolder) this).itemView.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.adapter.viewholder.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.r(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(c cVar, View view) {
        cVar.f().invoke(cVar.c(), view, Integer.valueOf(cVar.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(c cVar, BookMarkModel bookMarkModel, int i, View view) {
        cVar.e().invoke(bookMarkModel, Integer.valueOf(cVar.e.E.getId()), Integer.valueOf(i));
    }

    @k
    public final y s() {
        return this.e;
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(@l Bundle bundle, @l BookMarkModel bookMarkModel, int i) {
        super.n(bundle, bookMarkModel, i);
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void o(@l final BookMarkModel bookMarkModel, final int i) {
        String time;
        super.m(bookMarkModel, i);
        if (bookMarkModel == null) {
            return;
        }
        BookMarkInfoModel bookMarkInfoModelA = BookMarkInfoModel.Companion.a(bookMarkModel.getBookmark());
        Long lValueOf = null;
        this.e.I.setText(bookMarkInfoModelA != null ? bookMarkInfoModelA.getChapterName() : null);
        this.e.G.setText(bookMarkInfoModelA != null ? bookMarkInfoModelA.getDesc() : null);
        TextView textView = this.e.G;
        String desc = bookMarkInfoModelA != null ? bookMarkInfoModelA.getDesc() : null;
        textView.setVisibility((desc == null || StringsKt.isBlank(desc)) ? 8 : 0);
        if (bookMarkInfoModelA != null && (time = bookMarkInfoModelA.getTime()) != null) {
            lValueOf = Long.valueOf(Long.parseLong(time));
        }
        if (lValueOf != null) {
            this.e.H.setText(h.E(lValueOf));
        } else {
            this.e.H.setText("");
        }
        this.e.E.setOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.outreader.adapter.viewholder.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.v(this.a, bookMarkModel, i, view);
            }
        });
    }
}
