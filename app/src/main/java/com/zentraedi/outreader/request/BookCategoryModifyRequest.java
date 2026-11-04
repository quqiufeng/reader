package com.zentraedi.outreader.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookCategoryModifyRequest extends NasDeviceRequest {

    @l
    private String category_id;

    @l
    private String category_name;

    @k
    public String getApiPath() {
        return "/zreader/api/v1/category/edit";
    }

    @l
    public final String getCategory_id() {
        return this.category_id;
    }

    @l
    public final String getCategory_name() {
        return this.category_name;
    }

    public final void setCategory_id(@l String str) {
        this.category_id = str;
    }

    public final void setCategory_name(@l String str) {
        this.category_name = str;
    }
}
