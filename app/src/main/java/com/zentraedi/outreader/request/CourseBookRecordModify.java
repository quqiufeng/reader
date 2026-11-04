package com.zentraedi.outreader.request;

import com.zentraedi.basic.function.server.BaseModel;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class CourseBookRecordModify extends BaseModel {

    @l
    private Integer font_size;

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
    private String text_position;

    @l
    public final Integer getFont_size() {
        return this.font_size;
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
    public final String getText_position() {
        return this.text_position;
    }

    public final void setFont_size(@l Integer num) {
        this.font_size = num;
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

    public final void setText_position(@l String str) {
        this.text_position = str;
    }
}
