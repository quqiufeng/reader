package com.zentraedi.comic.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicCategoryEditRequest extends NasDeviceRequest {

    @l
    private final String cate_id;

    @k
    private final String name;

    public ComicCategoryEditRequest(@l String str, @k String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.cate_id = str;
        this.name = name;
    }

    @k
    public String getApiPath() {
        return "/zcomic/category/edit";
    }

    @l
    public final String getCate_id() {
        return this.cate_id;
    }

    @k
    public final String getName() {
        return this.name;
    }
}
