package com.zentraedi.outreader.request;

import com.zentraedi.basic.component.utils.a;
import com.zentraedi.business.http.NasDeviceRequest;
import com.zentraedi.outreader.responsemodel.ReadProgressExt;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookRecordModifyRequest extends NasDeviceRequest {

    @l
    private String book_id;

    @l
    private String category_id;

    @l
    private Integer font_size;

    @l
    private transient ReadProgressExt readProgressExt;

    @l
    private String read_chapter;

    @l
    private String read_chapter_id;
    private int read_finished;

    @l
    private String read_page;

    @l
    private String read_progress;

    @l
    private String read_progress_ext;

    @l
    private String text_position;

    @k
    public String getApiPath() {
        return "/zreader/api/v1/read/record";
    }

    @l
    public final String getBook_id() {
        return this.book_id;
    }

    @l
    public final String getCategory_id() {
        return this.category_id;
    }

    @l
    public final Integer getFont_size() {
        return this.font_size;
    }

    @l
    public final ReadProgressExt getReadProgressExt() {
        return this.readProgressExt;
    }

    @l
    public final String getRead_chapter() {
        return this.read_chapter;
    }

    @l
    public final String getRead_chapter_id() {
        return this.read_chapter_id;
    }

    public final int getRead_finished() {
        return this.read_finished;
    }

    @l
    public final String getRead_page() {
        return this.read_page;
    }

    @l
    public final String getRead_progress() {
        return this.read_progress;
    }

    @l
    public final String getRead_progress_ext() {
        return this.read_progress_ext;
    }

    @l
    public final String getText_position() {
        return this.text_position;
    }

    public final void setBook_id(@l String str) {
        this.book_id = str;
    }

    public final void setCategory_id(@l String str) {
        this.category_id = str;
    }

    public final void setFont_size(@l Integer num) {
        this.font_size = num;
    }

    public final void setReadProgressExt(@l ReadProgressExt readProgressExt) {
        this.readProgressExt = readProgressExt;
        try {
            this.read_progress_ext = a.b().toJson(readProgressExt);
        } catch (Exception e) {
            nd.a.c("ReadProgressExt", e.toString());
        }
    }

    public final void setRead_chapter(@l String str) {
        this.read_chapter = str;
    }

    public final void setRead_chapter_id(@l String str) {
        this.read_chapter_id = str;
    }

    public final void setRead_finished(int i) {
        this.read_finished = i;
    }

    public final void setRead_page(@l String str) {
        this.read_page = str;
    }

    public final void setRead_progress(@l String str) {
        this.read_progress = str;
    }

    public final void setRead_progress_ext(@l String str) {
        this.read_progress_ext = str;
    }

    public final void setText_position(@l String str) {
        this.text_position = str;
    }
}
