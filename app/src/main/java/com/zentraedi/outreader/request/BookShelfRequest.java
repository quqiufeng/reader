package com.zentraedi.outreader.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookShelfRequest extends NasDeviceRequest {

    @l
    private String order;
    private int page = 1;

    @l
    private Integer page_size;

    @l
    private String sort_field;

    @k
    public String getApiPath() {
        return "/zreader/api/v1/bookshelf";
    }

    @l
    public final String getOrder() {
        return this.order;
    }

    public final int getPage() {
        return this.page;
    }

    @l
    public final Integer getPage_size() {
        return this.page_size;
    }

    public int getRequestMethod() {
        return 1;
    }

    @l
    public final String getSort_field() {
        return this.sort_field;
    }

    public final void setOrder(@l String str) {
        this.order = str;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final void setPage_size(@l Integer num) {
        this.page_size = num;
    }

    public final void setSort_field(@l String str) {
        this.sort_field = str;
    }
}
