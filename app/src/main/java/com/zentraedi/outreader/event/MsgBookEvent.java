package com.zentraedi.outreader.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import com.zentraedi.outreader.model.BookmarkEntity;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class MsgBookEvent extends BaseMessageEvent {
    public static final String DELETE_MARK = "delete_mark";
    public static final String OPEN_BOOK = "open_book";
    public final BookmarkEntity book;

    public MsgBookEvent(String message, BookmarkEntity book) {
        super(message);
        this.book = book;
    }
}
