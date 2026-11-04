package com.zentraedi.outreader.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookInfoModifyRequest extends NasDeviceRequest {

    @l
    private String book_id;

    @l
    private String chapters;

    @l
    private String cover;

    @l
    private String title;

    @l
    private String words;

    @k
    public String getApiPath() {
        return "/zreader/api/v1/book/update";
    }

    @l
    public final String getBook_id() {
        return this.book_id;
    }

    @l
    public final String getChapters() {
        return this.chapters;
    }

    @l
    public final String getCover() {
        return this.cover;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getWords() {
        return this.words;
    }

    public final void setBook_id(@l String str) {
        this.book_id = str;
    }

    public final void setChapters(@l String str) {
        this.chapters = str;
    }

    public final void setCover(@l String str) {
        this.cover = str;
    }

    public final void setTitle(@l String str) {
        this.title = str;
    }

    public final void setWords(@l String str) {
        this.words = str;
    }
}
