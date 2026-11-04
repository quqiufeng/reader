package com.zentraedi.comic.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicCategoryDeleteRequest extends NasDeviceRequest {

    @k
    private final String cate_id;

    public ComicCategoryDeleteRequest(@k String cate_id) {
        Intrinsics.checkNotNullParameter(cate_id, "cate_id");
        this.cate_id = cate_id;
    }

    @k
    public String getApiPath() {
        return "/zcomic/category/delete";
    }

    @k
    public final String getCate_id() {
        return this.cate_id;
    }
}
