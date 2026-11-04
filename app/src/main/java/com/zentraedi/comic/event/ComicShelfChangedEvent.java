package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicShelfChangedEvent extends BaseMessageEvent {

    @l
    private final String ids;

    @l
    private final Integer onShelf;

    public ComicShelfChangedEvent(@l Integer num, @l String str) {
        this.onShelf = num;
        this.ids = str;
    }

    @l
    public final String getIds() {
        return this.ids;
    }

    @l
    public final Integer getOnShelf() {
        return this.onShelf;
    }
}
