package com.zentraedi.outreader.model;

import androidx.room.v;
import androidx.room.x0;
import fo.l;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@v(tableName = "bookmark")
public final class BookmarkEntity implements Serializable {

    @l
    private String bookId;

    @l
    private String chapterId;
    private int chapterIndex;

    @l
    private String chapterName;

    @l
    private String content;

    @l
    private String firstLineContent;

    @x0(autoGenerate = true)
    private int index;
    private int position;

    @l
    private String rate;

    @l
    private String sourceId;
    private long time;

    @l
    public final String getBookId() {
        return this.bookId;
    }

    @l
    public final String getChapterId() {
        return this.chapterId;
    }

    public final int getChapterIndex() {
        return this.chapterIndex;
    }

    @l
    public final String getChapterName() {
        return this.chapterName;
    }

    @l
    public final String getContent() {
        return this.content;
    }

    @l
    public final String getFirstLineContent() {
        return this.firstLineContent;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getPosition() {
        return this.position;
    }

    @l
    public final String getRate() {
        return this.rate;
    }

    @l
    public final String getSourceId() {
        return this.sourceId;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setBookId(@l String str) {
        this.bookId = str;
    }

    public final void setChapterId(@l String str) {
        this.chapterId = str;
    }

    public final void setChapterIndex(int i) {
        this.chapterIndex = i;
    }

    public final void setChapterName(@l String str) {
        this.chapterName = str;
    }

    public final void setContent(@l String str) {
        this.content = str;
    }

    public final void setFirstLineContent(@l String str) {
        this.firstLineContent = str;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setRate(@l String str) {
        this.rate = str;
    }

    public final void setSourceId(@l String str) {
        this.sourceId = str;
    }

    public final void setTime(long j) {
        this.time = j;
    }
}
