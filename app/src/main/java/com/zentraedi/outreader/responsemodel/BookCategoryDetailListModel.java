package com.zentraedi.outreader.responsemodel;

import com.zentraedi.basic.function.server.BaseModel;
import fo.l;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookCategoryDetailListModel extends BaseModel {
    private int count;

    @l
    private List<BookCategoryDetailModel> list;

    public final int getCount() {
        return this.count;
    }

    @l
    public final List<BookCategoryDetailModel> getList() {
        return this.list;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setList(@l List<BookCategoryDetailModel> list) {
        this.list = list;
    }
}
