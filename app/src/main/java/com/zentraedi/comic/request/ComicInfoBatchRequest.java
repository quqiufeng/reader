package com.zentraedi.comic.request;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicInfoBatchRequest extends NasDeviceRequest {

    @SerializedName("paths[]")
    @l
    private List<String> list;

    @k
    public String getApiPath() {
        return "/zcomic/comic/infos";
    }

    @l
    public final List<String> getList() {
        return this.list;
    }

    public final void setList(@l List<String> list) {
        this.list = list;
    }
}
