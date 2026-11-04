package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import fo.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ReadRecordUpdateSuccessEvent extends BaseMessageEvent {

    @k
    private final String comicId;

    @k
    private final String progress;

    public ReadRecordUpdateSuccessEvent(@k String comicId, @k String progress) {
        Intrinsics.checkNotNullParameter(comicId, "comicId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.comicId = comicId;
        this.progress = progress;
    }

    @k
    public final String getComicId() {
        return this.comicId;
    }

    @k
    public final String getProgress() {
        return this.progress;
    }
}
