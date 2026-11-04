package com.zentraedi.outreader.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookCategoryAddRequest extends NasDeviceRequest {

    @l
    private String category_name;

    public BookCategoryAddRequest(@l String str) {
        this.category_name = str;
    }

    @k
    public String getApiPath() {
        return "/zreader/api/v1/category/add";
    }

    @l
    public final String getCategory_name() {
        return this.category_name;
    }

    public final void setCategory_name(@l String str) {
        this.category_name = str;
    }
}
