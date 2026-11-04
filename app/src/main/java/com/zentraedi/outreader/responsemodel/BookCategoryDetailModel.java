package com.zentraedi.outreader.responsemodel;

import com.zentraedi.basic.function.server.BaseModel;
import fo.l;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookCategoryDetailModel extends BookCategoryModel {
    private int dir_count;
    private int file_count;

    @l
    private List<BookFileInfo> file_list;

    public static final class BookFileInfo extends BaseModel {

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

    public final int getDir_count() {
        return this.dir_count;
    }

    public final int getFile_count() {
        return this.file_count;
    }

    @l
    public final List<BookFileInfo> getFile_list() {
        return this.file_list;
    }

    public final void setDir_count(int i) {
        this.dir_count = i;
    }

    public final void setFile_count(int i) {
        this.file_count = i;
    }

    public final void setFile_list(@l List<BookFileInfo> list) {
        this.file_list = list;
    }
}
