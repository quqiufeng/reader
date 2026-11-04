package com.zentraedi.outreader.responsemodel;

import com.zentraedi.basic.function.server.BaseModel;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class BookCategoryModel extends BaseModel {

    @l
    private String category_id;

    @l
    private String category_name;

    @l
    private transient String dirPath;
    private int is_system;

    @l
    private transient String page;

    @l
    private transient Boolean isDir = Boolean.FALSE;

    @l
    private transient String searchWord = "";

    @l
    public final String getCategory_id() {
        return this.category_id;
    }

    @l
    public final String getCategory_name() {
        return this.category_name;
    }

    @l
    public final String getDirPath() {
        return this.dirPath;
    }

    @l
    public final String getPage() {
        return this.page;
    }

    @l
    public final String getSearchWord() {
        return this.searchWord;
    }

    @l
    public final Boolean isDir() {
        return this.isDir;
    }

    public final int is_system() {
        return this.is_system;
    }

    public final void setCategory_id(@l String str) {
        this.category_id = str;
    }

    public final void setCategory_name(@l String str) {
        this.category_name = str;
    }

    public final void setDir(@l Boolean bool) {
        this.isDir = bool;
    }

    public final void setDirPath(@l String str) {
        this.dirPath = str;
    }

    public final void setPage(@l String str) {
        this.page = str;
    }

    public final void setSearchWord(@l String str) {
        this.searchWord = str;
    }

    public final void set_system(int i) {
        this.is_system = i;
    }

    @k
    public String toString() {
        return "BookCategoryModel(category_id=" + this.category_id + ", category_name=" + this.category_name + ", is_system=" + this.is_system + ", isDir=" + this.isDir + ", dirPath=" + this.dirPath + ", page=" + this.page + ", searchWord=" + this.searchWord + ')';
    }
}
