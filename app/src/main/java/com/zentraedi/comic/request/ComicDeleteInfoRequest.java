package com.zentraedi.comic.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicDeleteInfoRequest extends NasDeviceRequest {

    @l
    private final String comic_ids;

    @l
    private final Integer pgonly;

    /* JADX WARN: Multi-variable type inference failed */
    public ComicDeleteInfoRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @k
    public String getApiPath() {
        return "/zcomic/comic/delete";
    }

    @l
    public final String getComic_ids() {
        return this.comic_ids;
    }

    @l
    public final Integer getPgonly() {
        return this.pgonly;
    }

    public ComicDeleteInfoRequest(@l String str, @l Integer num) {
        this.comic_ids = str;
        this.pgonly = num;
    }

    public /* synthetic */ ComicDeleteInfoRequest(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0 : num);
    }
}
