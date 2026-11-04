package com.zentraedi.outreader.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookTaskStatusRequest extends NasDeviceRequest {

    @l
    private String category_id;

    @k
    public String getApiPath() {
        return "/zreader/api/v1/task/status";
    }

    @l
    public final String getCategory_id() {
        return this.category_id;
    }

    public int getRequestMethod() {
        return 1;
    }

    public final void setCategory_id(@l String str) {
        this.category_id = str;
    }
}
