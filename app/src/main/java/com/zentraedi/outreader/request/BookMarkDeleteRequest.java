package com.zentraedi.outreader.request;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookMarkDeleteRequest extends NasDeviceRequest {

    @l
    private String book_id;

    @SerializedName("bookmark_id[]")
    @l
    private List<String> bookmark_id;

    @l
    private String category_id;

    @k
    public String getApiPath() {
        return "/zreader/api/v1/bookmark/delete";
    }

    @l
    public final String getBook_id() {
        return this.book_id;
    }

    @l
    public final List<String> getBookmark_id() {
        return this.bookmark_id;
    }

    @l
    public final String getCategory_id() {
        return this.category_id;
    }

    public final void setBook_id(@l String str) {
        this.book_id = str;
    }

    public final void setBookmark_id(@l List<String> list) {
        this.bookmark_id = list;
    }

    public final void setCategory_id(@l String str) {
        this.category_id = str;
    }
}
