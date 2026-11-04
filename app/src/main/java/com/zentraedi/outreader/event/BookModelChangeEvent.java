package com.zentraedi.outreader.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import com.zentraedi.outreader.responsemodel.BookModel;
import fo.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookModelChangeEvent extends BaseMessageEvent {

    @k
    private final BookModel bookModel;

    public BookModelChangeEvent(@k BookModel bookModel) {
        Intrinsics.checkNotNullParameter(bookModel, "bookModel");
        this.bookModel = bookModel;
    }

    @k
    public final BookModel getBookModel() {
        return this.bookModel;
    }
}
