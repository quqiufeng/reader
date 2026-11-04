package com.zentraedi.comic.request;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicDirListRequest extends NasDeviceRequest {

    @l
    private final String cate_id;

    @l
    private String order;

    @SerializedName("sortby")
    @l
    private String sortBy;

    /* JADX WARN: Multi-variable type inference failed */
    public ComicDirListRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @k
    public String getApiPath() {
        return "/zcomic/dir/list";
    }

    @l
    public final String getCate_id() {
        return this.cate_id;
    }

    @l
    public final String getOrder() {
        return this.order;
    }

    @l
    public final String getSortBy() {
        return this.sortBy;
    }

    public final void setOrder(@l String str) {
        this.order = str;
    }

    public final void setSortBy(@l String str) {
        this.sortBy = str;
    }

    public ComicDirListRequest(@l String str) {
        this.cate_id = str;
    }

    public /* synthetic */ ComicDirListRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
