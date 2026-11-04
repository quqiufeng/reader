package com.zentraedi.comic.request;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicDirDeleteRequest extends NasDeviceRequest {

    @SerializedName("dir_ids")
    @l
    private String dirIds;

    /* JADX WARN: Multi-variable type inference failed */
    public ComicDirDeleteRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @k
    public String getApiPath() {
        return "/zcomic/dir/delete";
    }

    @l
    public final String getDirIds() {
        return this.dirIds;
    }

    public final void setDirIds(@l String str) {
        this.dirIds = str;
    }

    public ComicDirDeleteRequest(@l String str) {
        this.dirIds = str;
    }

    public /* synthetic */ ComicDirDeleteRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
