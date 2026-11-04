package com.zentraedi.outreader.responsemodel;

import com.zentraedi.basic.function.server.BaseModel;
import fo.l;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookListModel extends BaseModel {
    private int count;

    @l
    private List<BookModel> list;

    @l
    private Integer adding = 0;

    @l
    private Integer refreshing = 0;

    @l
    public final Integer getAdding() {
        return this.adding;
    }

    public final int getCount() {
        return this.count;
    }

    @l
    public final List<BookModel> getList() {
        return this.list;
    }

    @l
    public final Integer getRefreshing() {
        return this.refreshing;
    }

    public final void setAdding(@l Integer num) {
        this.adding = num;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setList(@l List<BookModel> list) {
        this.list = list;
    }

    public final void setRefreshing(@l Integer num) {
        this.refreshing = num;
    }
}
