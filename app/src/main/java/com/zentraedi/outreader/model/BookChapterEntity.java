package com.zentraedi.outreader.model;

import androidx.room.j0;
import androidx.room.v;
import androidx.room.x0;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@v(tableName = "bookChapter")
public class BookChapterEntity implements Serializable {
    private String bookId;

    @j0
    private int chapterCount;
    private String chapterList;
    private String chapterState;

    @x0(autoGenerate = true)
    private int index;
    private String sourceId;
    private String userId;

    public String getBookId() {
        return this.bookId;
    }

    public int getChapterCount() {
        return this.chapterCount;
    }

    public String getChapterList() {
        return this.chapterList;
    }

    public String getChapterState() {
        return this.chapterState;
    }

    public int getIndex() {
        return this.index;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    public void setChapterList(String chapterList) {
        this.chapterList = chapterList;
    }

    public void setChapterState(String chapterState) {
        this.chapterState = chapterState;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
