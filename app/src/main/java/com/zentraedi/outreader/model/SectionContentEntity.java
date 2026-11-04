package com.zentraedi.outreader.model;

import androidx.room.j0;
import androidx.room.v;
import androidx.room.x0;
import fo.l;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@v(tableName = "sectionContent")
public final class SectionContentEntity implements Serializable {

    @l
    private String bookId;

    @l
    private String content;

    @l
    @j0
    private String contentErrorStatus;

    @l
    private String createDateTime;

    @l
    @j0
    private String errorStatus;

    @l
    private String mupdfPath;

    @l
    @j0
    private String originalContent;
    private int plaintext;

    @l
    private String sectionId;

    @x0(autoGenerate = true)
    private int sectionIndex;

    @l
    private String sectionName;
    private long updateTime;

    @l
    private String userId;

    @l
    public final String getBookId() {
        return this.bookId;
    }

    @l
    public final String getContent() {
        return this.content;
    }

    @l
    public final String getContentErrorStatus() {
        return this.contentErrorStatus;
    }

    @l
    public final String getCreateDateTime() {
        return this.createDateTime;
    }

    @l
    public final String getErrorStatus() {
        return this.errorStatus;
    }

    @l
    public final String getMupdfPath() {
        return this.mupdfPath;
    }

    @l
    public final String getOriginalContent() {
        return this.originalContent;
    }

    public final int getPlaintext() {
        return this.plaintext;
    }

    @l
    public final String getSectionId() {
        return this.sectionId;
    }

    public final int getSectionIndex() {
        return this.sectionIndex;
    }

    @l
    public final String getSectionName() {
        return this.sectionName;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    @l
    public final String getUserId() {
        return this.userId;
    }

    public final void setBookId(@l String str) {
        this.bookId = str;
    }

    public final void setContent(@l String str) {
        this.content = str;
    }

    public final void setContentErrorStatus(@l String str) {
        this.contentErrorStatus = str;
    }

    public final void setCreateDateTime(@l String str) {
        this.createDateTime = str;
    }

    public final void setErrorStatus(@l String str) {
        this.errorStatus = str;
    }

    public final void setMupdfPath(@l String str) {
        this.mupdfPath = str;
    }

    public final void setOriginalContent(@l String str) {
        this.originalContent = str;
    }

    public final void setPlaintext(int i) {
        this.plaintext = i;
    }

    public final void setSectionId(@l String str) {
        this.sectionId = str;
    }

    public final void setSectionIndex(int i) {
        this.sectionIndex = i;
    }

    public final void setSectionName(@l String str) {
        this.sectionName = str;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public final void setUserId(@l String str) {
        this.userId = str;
    }
}
