package com.zentraedi.outreader.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookMarkAddRequest extends NasDeviceRequest {

    @l
    private String book_id;

    @l
    private String bookmark;

    @l
    private String category_id;

    @k
    public String getApiPath() {
        return "/zreader/api/v1/bookmark/add";
    }

    @l
    public final String getBook_id() {
        return this.book_id;
    }

    @l
    public final String getBookmark() {
        return this.bookmark;
    }

    @l
    public final String getCategory_id() {
        return this.category_id;
    }

    public final void setBook_id(@l String str) {
        this.book_id = str;
    }

    public final void setBookmark(@l String str) {
        this.bookmark = str;
    }

    public final void setCategory_id(@l String str) {
        this.category_id = str;
    }
}
