package com.zentraedi.outreader.responsemodel;

import com.zentraedi.basic.function.server.BaseModel;
import fo.l;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookCategoryFolderListModel extends BaseModel {
    private int count;

    @l
    private List<BookCategoryFolderModel> list;

    public final int getCount() {
        return this.count;
    }

    @l
    public final List<BookCategoryFolderModel> getList() {
        return this.list;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setList(@l List<BookCategoryFolderModel> list) {
        this.list = list;
    }
}
