package com.zentraedi.outreader.responsemodel;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.basic.function.server.BaseModel;
import fo.l;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class BookCategoryInfoModel extends BaseModel {

    @SerializedName("category_id")
    @l
    private String categoryId;

    @SerializedName("category_name")
    @l
    private String categoryName;

    @l
    private List<BookFilePathModel> file_list;
    private int is_system;

    @SerializedName("file_count")
    @l
    private Integer fileCount = 0;

    @SerializedName("dir_count")
    @l
    private Integer dirCount = 0;

    @l
    public final String getCategoryId() {
        return this.categoryId;
    }

    @l
    public final String getCategoryName() {
        return this.categoryName;
    }

    @l
    public final Integer getDirCount() {
        return this.dirCount;
    }

    @l
    public final Integer getFileCount() {
        return this.fileCount;
    }

    @l
    public final List<BookFilePathModel> getFile_list() {
        return this.file_list;
    }

    public final int is_system() {
        return this.is_system;
    }

    public final void setCategoryId(@l String str) {
        this.categoryId = str;
    }

    public final void setCategoryName(@l String str) {
        this.categoryName = str;
    }

    public final void setDirCount(@l Integer num) {
        this.dirCount = num;
    }

    public final void setFileCount(@l Integer num) {
        this.fileCount = num;
    }

    public final void setFile_list(@l List<BookFilePathModel> list) {
        this.file_list = list;
    }

    public final void set_system(int i) {
        this.is_system = i;
    }
}
