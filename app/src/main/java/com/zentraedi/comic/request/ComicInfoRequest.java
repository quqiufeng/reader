package com.zentraedi.comic.request;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.business.http.NasDeviceRequest;
import com.zentraedi.comic.activity.ComicSubDirActivity;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicInfoRequest extends NasDeviceRequest {

    @SerializedName(ComicSubDirActivity.i0)
    @l
    private String dirId;

    @l
    private String path;

    @k
    public String getApiPath() {
        return "/zcomic/comic/info";
    }

    @l
    public final String getDirId() {
        return this.dirId;
    }

    @l
    public final String getPath() {
        return this.path;
    }

    public final void setDirId(@l String str) {
        this.dirId = str;
    }

    public final void setPath(@l String str) {
        this.path = str;
    }
}
