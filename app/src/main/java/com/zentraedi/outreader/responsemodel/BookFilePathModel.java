package com.zentraedi.outreader.responsemodel;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.basic.function.server.BaseModel;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookFilePathModel extends BaseModel {

    @SerializedName("file_path")
    @l
    private String filePath;

    @SerializedName("is_dir")
    @l
    private Integer isDir;

    @l
    public final String getFilePath() {
        return this.filePath;
    }

    @l
    public final Integer isDir() {
        return this.isDir;
    }

    public final void setDir(@l Integer num) {
        this.isDir = num;
    }

    public final void setFilePath(@l String str) {
        this.filePath = str;
    }
}
