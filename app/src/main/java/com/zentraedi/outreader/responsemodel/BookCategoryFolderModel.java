package com.zentraedi.outreader.responsemodel;

import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookCategoryFolderModel extends BookCategoryModel {

    @l
    private String file_path;
    private int is_dir;

    @l
    public final String getFile_path() {
        return this.file_path;
    }

    public final int is_dir() {
        return this.is_dir;
    }

    public final void setFile_path(@l String str) {
        this.file_path = str;
    }

    public final void set_dir(int i) {
        this.is_dir = i;
    }
}
