package com.zentraedi.comic.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicSearchRequest extends NasDeviceRequest {

    @l
    private String name;
    private int num = 50;
    private int start;

    @k
    public String getApiPath() {
        return "/zcomic/comic/search";
    }

    @l
    public final String getName() {
        return this.name;
    }

    public final int getNum() {
        return this.num;
    }

    public final int getStart() {
        return this.start;
    }

    public final void setName(@l String str) {
        this.name = str;
    }

    public final void setNum(int i) {
        this.num = i;
    }

    public final void setStart(int i) {
        this.start = i;
    }
}
