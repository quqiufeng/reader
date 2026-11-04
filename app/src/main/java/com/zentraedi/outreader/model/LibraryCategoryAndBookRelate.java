package com.zentraedi.outreader.model;

import androidx.room.v;
import androidx.room.x0;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@v(tableName = "categoryBookRelate")
public final class LibraryCategoryAndBookRelate implements Serializable {
    private int bookIndex = -1;
    private int categoryIndex = -1;

    @x0(autoGenerate = true)
    private int index;

    public final int getBookIndex() {
        return this.bookIndex;
    }

    public final int getCategoryIndex() {
        return this.categoryIndex;
    }

    public final int getIndex() {
        return this.index;
    }

    public final void setBookIndex(int i) {
        this.bookIndex = i;
    }

    public final void setCategoryIndex(int i) {
        this.categoryIndex = i;
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}
