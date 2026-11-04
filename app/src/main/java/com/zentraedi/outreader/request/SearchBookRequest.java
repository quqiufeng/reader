package com.zentraedi.outreader.request;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class SearchBookRequest extends NasDeviceRequest {

    @l
    private String keyword;

    @l
    private String order;

    @l
    private Integer page;

    @SerializedName("page_size")
    @l
    private Integer pageSize;

    @SerializedName("sort_field")
    @l
    private String sortField;

    @k
    public String getApiPath() {
        return "/zreader/api/v1/books/search";
    }

    @l
    public final String getKeyword() {
        return this.keyword;
    }

    @l
    public final String getOrder() {
        return this.order;
    }

    @l
    public final Integer getPage() {
        return this.page;
    }

    @l
    public final Integer getPageSize() {
        return this.pageSize;
    }

    public int getRequestMethod() {
        return 1;
    }

    @l
    public final String getSortField() {
        return this.sortField;
    }

    public final void setKeyword(@l String str) {
        this.keyword = str;
    }

    public final void setOrder(@l String str) {
        this.order = str;
    }

    public final void setPage(@l Integer num) {
        this.page = num;
    }

    public final void setPageSize(@l Integer num) {
        this.pageSize = num;
    }

    public final void setSortField(@l String str) {
        this.sortField = str;
    }
}
