package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicFinishSpecificDirEvent extends BaseMessageEvent {

    @l
    private final String dirId;

    @l
    private final String path;

    /* JADX WARN: Multi-variable type inference failed */
    public ComicFinishSpecificDirEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @l
    public final String getDirId() {
        return this.dirId;
    }

    @l
    public final String getPath() {
        return this.path;
    }

    public ComicFinishSpecificDirEvent(@l String str, @l String str2) {
        this.dirId = str;
        this.path = str2;
    }

    public /* synthetic */ ComicFinishSpecificDirEvent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
