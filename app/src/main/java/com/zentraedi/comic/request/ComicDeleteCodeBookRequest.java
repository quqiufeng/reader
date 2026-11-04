package com.zentraedi.comic.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicDeleteCodeBookRequest extends NasDeviceRequest {

    @k
    private final String ids;

    public ComicDeleteCodeBookRequest(@k String ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.ids = ids;
    }

    @k
    public String getApiPath() {
        return "/zcomic/notebook/delete";
    }

    @k
    public final String getIds() {
        return this.ids;
    }
}
