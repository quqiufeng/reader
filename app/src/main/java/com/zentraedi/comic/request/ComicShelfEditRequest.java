package com.zentraedi.comic.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicShelfEditRequest extends NasDeviceRequest {

    @l
    private final String comic_ids;

    @l
    private final Integer on_shelf;

    /* JADX WARN: Multi-variable type inference failed */
    public ComicShelfEditRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @k
    public String getApiPath() {
        return "/zcomic/comic/shelf";
    }

    @l
    public final String getComic_ids() {
        return this.comic_ids;
    }

    @l
    public final Integer getOn_shelf() {
        return this.on_shelf;
    }

    public ComicShelfEditRequest(@l String str, @l Integer num) {
        this.comic_ids = str;
        this.on_shelf = num;
    }

    public /* synthetic */ ComicShelfEditRequest(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0 : num);
    }
}
