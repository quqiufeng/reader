package com.zentraedi.outreader.responsemodel;

import com.zentraedi.basic.function.server.BaseModel;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class ReadProgressExt extends BaseModel {

    @l
    private String fileIndex;

    @l
    private String fileProgress;

    @l
    public final String getFileIndex() {
        return this.fileIndex;
    }

    @l
    public final String getFileProgress() {
        return this.fileProgress;
    }

    public final void setFileIndex(@l String str) {
        this.fileIndex = str;
    }

    public final void setFileProgress(@l String str) {
        this.fileProgress = str;
    }

    @k
    public String toString() {
        return "ReadProgressExt(fileIndex=" + this.fileIndex + ", fileProgress=" + this.fileProgress + ')';
    }
}
