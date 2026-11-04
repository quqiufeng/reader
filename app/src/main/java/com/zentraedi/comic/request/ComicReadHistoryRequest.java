package com.zentraedi.comic.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicReadHistoryRequest extends NasDeviceRequest {
    private int num = 50;

    @l
    private String order;

    @l
    private String sortby;
    private int start;

    @k
    public String getApiPath() {
        return "/zcomic/progress/list";
    }

    public final int getNum() {
        return this.num;
    }

    @l
    public final String getOrder() {
        return this.order;
    }

    @l
    public final String getSortby() {
        return this.sortby;
    }

    public final int getStart() {
        return this.start;
    }

    public final void setNum(int i) {
        this.num = i;
    }

    public final void setOrder(@l String str) {
        this.order = str;
    }

    public final void setPage(int i) {
        this.start = i * this.num;
    }

    public final void setSortby(@l String str) {
        this.sortby = str;
    }

    public final void setStart(int i) {
        this.start = i;
    }
}
