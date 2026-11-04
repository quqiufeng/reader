package com.zentraedi.outreader.responsemodel;

import com.zentraedi.basic.function.server.BaseModel;
import fo.l;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class BookCategoryInfoListModel extends BaseModel {
    private int count;

    @l
    private List<? extends BookCategoryInfoModel> list;

    public final int getCount() {
        return this.count;
    }

    @l
    public final List<BookCategoryInfoModel> getList() {
        return this.list;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setList(@l List<? extends BookCategoryInfoModel> list) {
        this.list = list;
    }
}
