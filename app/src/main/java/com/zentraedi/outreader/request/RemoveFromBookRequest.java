package com.zentraedi.outreader.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class RemoveFromBookRequest extends NasDeviceRequest {

    @l
    private String data;

    @k
    public String getApiPath() {
        return "/zreader/api/v1/books/delete";
    }

    @l
    public final String getData() {
        return this.data;
    }

    public final void setData(@l String str) {
        this.data = str;
    }
}
