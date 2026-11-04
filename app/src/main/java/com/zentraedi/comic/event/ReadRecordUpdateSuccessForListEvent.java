package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ReadRecordUpdateSuccessForListEvent extends BaseMessageEvent {

    @k
    private final String comicId;

    @l
    private final String parentPath;

    @k
    private final String progress;

    public ReadRecordUpdateSuccessForListEvent(@k String comicId, @k String progress, @l String str) {
        Intrinsics.checkNotNullParameter(comicId, "comicId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.comicId = comicId;
        this.progress = progress;
        this.parentPath = str;
    }

    @k
    public final String getComicId() {
        return this.comicId;
    }

    @l
    public final String getParentPath() {
        return this.parentPath;
    }

    @k
    public final String getProgress() {
        return this.progress;
    }

    public /* synthetic */ ReadRecordUpdateSuccessForListEvent(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
