package com.zentraedi.comic.model;

import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.business.model.ComicDirModel;
import fo.l;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicDirListResponse extends BaseModel {

    @l
    private List<ComicDirModel> list;
    private int total;

    @l
    public final List<ComicDirModel> getList() {
        return this.list;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setList(@l List<ComicDirModel> list) {
        this.list = list;
    }

    public final void setTotal(int i) {
        this.total = i;
    }
}
