package com.zentraedi.comic.model;

import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.business.model.ComicInfoModel;
import fo.l;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicInfoBatchResponse extends BaseModel {

    @l
    private List<ComicInfoModel> list;
    private int total;

    @l
    public final List<ComicInfoModel> getList() {
        return this.list;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setList(@l List<ComicInfoModel> list) {
        this.list = list;
    }

    public final void setTotal(int i) {
        this.total = i;
    }
}
