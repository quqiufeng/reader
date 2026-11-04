package com.zentraedi.comic.model;

import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.business.model.ComicCategory;
import fo.l;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicCategoryListResponse extends BaseModel {

    @l
    private List<ComicCategory> list;
    private int total;

    @l
    public final List<ComicCategory> getList() {
        return this.list;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setList(@l List<ComicCategory> list) {
        this.list = list;
    }

    public final void setTotal(int i) {
        this.total = i;
    }
}
