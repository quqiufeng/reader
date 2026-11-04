package com.zentraedi.outreader.request;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookCategoryRefreshRequest extends NasDeviceRequest {

    @l
    private String category_id;

    @SerializedName("files[]")
    @l
    private List<String> paths;

    @k
    public String getApiPath() {
        return "/zreader/api/v1/manage/file/refresh";
    }

    @l
    public final String getCategory_id() {
        return this.category_id;
    }

    @l
    public final List<String> getPaths() {
        return this.paths;
    }

    public int getRequestMethod() {
        return 2;
    }

    public final void setCategory_id(@l String str) {
        this.category_id = str;
    }

    public final void setPaths(@l List<String> list) {
        this.paths = list;
    }
}
