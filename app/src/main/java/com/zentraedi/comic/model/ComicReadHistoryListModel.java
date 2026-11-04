package com.zentraedi.comic.model;

import com.zentraedi.basic.function.server.BaseModel;
import fo.l;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicReadHistoryListModel extends BaseModel {

    @l
    private List<ComicReadHistoryModel> list;
    private int total;

    @l
    public final List<ComicReadHistoryModel> getList() {
        return this.list;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setList(@l List<ComicReadHistoryModel> list) {
        this.list = list;
    }

    public final void setTotal(int i) {
        this.total = i;
    }
}
