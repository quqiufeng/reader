package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import fo.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicFolderThumbUpdateEvent extends BaseMessageEvent {

    @k
    private final String parentPath;

    public ComicFolderThumbUpdateEvent(@k String parentPath) {
        Intrinsics.checkNotNullParameter(parentPath, "parentPath");
        this.parentPath = parentPath;
    }

    @k
    public final String getParentPath() {
        return this.parentPath;
    }
}
