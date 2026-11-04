package com.zentraedi.outreader.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookFolderManageListRequest extends NasDeviceRequest {
    @k
    public String getApiPath() {
        return "/zreader/api/v1/manage/file";
    }

    public int getRequestMethod() {
        return 1;
    }
}
