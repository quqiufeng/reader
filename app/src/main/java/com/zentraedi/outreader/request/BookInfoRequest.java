package com.zentraedi.outreader.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookInfoRequest extends NasDeviceRequest {

    @l
    private String file_path;

    @k
    public String getApiPath() {
        return "/zreader/api/v1/record";
    }

    @l
    public final String getFile_path() {
        return this.file_path;
    }

    public int getRequestMethod() {
        return 1;
    }

    public final void setFile_path(@l String str) {
        this.file_path = str;
    }
}
