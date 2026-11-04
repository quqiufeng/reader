package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import fo.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicHouseClearLastClickItemEvent extends BaseMessageEvent {

    @k
    private final String cateId;

    public ComicHouseClearLastClickItemEvent(@k String cateId) {
        Intrinsics.checkNotNullParameter(cateId, "cateId");
        this.cateId = cateId;
    }

    @k
    public final String getCateId() {
        return this.cateId;
    }
}
