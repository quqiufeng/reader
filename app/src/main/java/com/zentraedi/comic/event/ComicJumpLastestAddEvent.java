package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicJumpLastestAddEvent extends BaseMessageEvent {

    @l
    private final String category;

    /* JADX WARN: Multi-variable type inference failed */
    public ComicJumpLastestAddEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @l
    public final String getCategory() {
        return this.category;
    }

    public ComicJumpLastestAddEvent(@l String str) {
        this.category = str;
    }

    public /* synthetic */ ComicJumpLastestAddEvent(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str);
    }
}
