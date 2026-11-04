package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import com.zentraedi.business.model.ComicInfoModel;
import fo.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicInfoCreateEvent extends BaseMessageEvent {

    @k
    private final ComicInfoModel info;

    public ComicInfoCreateEvent(@k ComicInfoModel info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.info = info;
    }

    @k
    public final ComicInfoModel getInfo() {
        return this.info;
    }
}
