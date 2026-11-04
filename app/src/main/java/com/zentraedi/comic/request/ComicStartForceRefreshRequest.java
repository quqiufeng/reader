package com.zentraedi.comic.request;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicStartForceRefreshRequest extends NasDeviceRequest {

    @SerializedName("dir_ids")
    @l
    private String dirIds;

    @k
    public String getApiPath() {
        return "/zcomic/flush/run";
    }

    @l
    public final String getDirIds() {
        return this.dirIds;
    }

    public final void setDirIds(@l String str) {
        this.dirIds = str;
    }
}
