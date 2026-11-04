package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import fo.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class CategoryViewModeChangeEvent extends BaseMessageEvent {

    @k
    private final String cid;
    private final boolean isFolderViewMode;

    public CategoryViewModeChangeEvent(@k String cid, boolean z) {
        Intrinsics.checkNotNullParameter(cid, "cid");
        this.cid = cid;
        this.isFolderViewMode = z;
    }

    @k
    public final String getCid() {
        return this.cid;
    }

    public final boolean isFolderViewMode() {
        return this.isFolderViewMode;
    }
}
