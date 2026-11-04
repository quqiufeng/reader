package com.zentraedi.comic.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicCategoryCreateRequest extends NasDeviceRequest {

    @l
    private String desc;

    @k
    private final String name;

    @l
    private final Integer seq;

    public ComicCategoryCreateRequest(@k String name, @l Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.seq = num;
    }

    @k
    public String getApiPath() {
        return "/zcomic/category/create";
    }

    @l
    public final String getDesc() {
        return this.desc;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final Integer getSeq() {
        return this.seq;
    }

    public final void setDesc(@l String str) {
        this.desc = str;
    }

    public /* synthetic */ ComicCategoryCreateRequest(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
