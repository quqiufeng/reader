package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicLibraryLooperRequestEvent extends BaseMessageEvent {

    @l
    private final String category;

    /* JADX WARN: Multi-variable type inference failed */
    public ComicLibraryLooperRequestEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @l
    public final String getCategory() {
        return this.category;
    }

    public ComicLibraryLooperRequestEvent(@l String str) {
        this.category = str;
    }

    public /* synthetic */ ComicLibraryLooperRequestEvent(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str);
    }
}
