package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import fo.k;
import fo.l;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicFilesDeleteEvent extends BaseMessageEvent {

    @l
    private final Boolean fromHouse;

    @k
    private final List<String> paths;

    public ComicFilesDeleteEvent(@k List<String> paths, @l Boolean bool) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        this.paths = paths;
        this.fromHouse = bool;
    }

    @l
    public final Boolean getFromHouse() {
        return this.fromHouse;
    }

    @k
    public final List<String> getPaths() {
        return this.paths;
    }

    public /* synthetic */ ComicFilesDeleteEvent(List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? Boolean.FALSE : bool);
    }
}
