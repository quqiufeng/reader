package com.zentraedi.outreader.model.offline;

import androidx.room.v;
import androidx.room.x0;
import fo.l;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@v(tableName = "book_info")
public final class BookInfoEntity implements Serializable {
    private int addBookshelf;

    @l
    private String bookCover;

    @l
    private String bookId;

    @l
    private String bookName;
    private int bookShare;

    @l
    private String bookType;

    @l
    private String categoryId = "";

    @l
    private String downloadId;
    private long downloadTime;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @x0(autoGenerate = true)
    private long f988id;

    @l
    private String nasId;

    @l
    private String nasPath;

    @l
    private String username;

    public final int getAddBookshelf() {
        return this.addBookshelf;
    }

    @l
    public final String getBookCover() {
        return this.bookCover;
    }

    @l
    public final String getBookId() {
        return this.bookId;
    }

    @l
    public final String getBookName() {
        return this.bookName;
    }

    public final int getBookShare() {
        return this.bookShare;
    }

    @l
    public final String getBookType() {
        return this.bookType;
    }

    @l
    public final String getCategoryId() {
        return this.categoryId;
    }

    @l
    public final String getDownloadId() {
        return this.downloadId;
    }

    public final long getDownloadTime() {
        return this.downloadTime;
    }

    public final long getId() {
        return this.f988id;
    }

    @l
    public final String getNasId() {
        return this.nasId;
    }

    @l
    public final String getNasPath() {
        return this.nasPath;
    }

    @l
    public final String getUsername() {
        return this.username;
    }

    public final void setAddBookshelf(int i) {
        this.addBookshelf = i;
    }

    public final void setBookCover(@l String str) {
        this.bookCover = str;
    }

    public final void setBookId(@l String str) {
        this.bookId = str;
    }

    public final void setBookName(@l String str) {
        this.bookName = str;
    }

    public final void setBookShare(int i) {
        this.bookShare = i;
    }

    public final void setBookType(@l String str) {
        this.bookType = str;
    }

    public final void setCategoryId(@l String str) {
        this.categoryId = str;
    }

    public final void setDownloadId(@l String str) {
        this.downloadId = str;
    }

    public final void setDownloadTime(long j) {
        this.downloadTime = j;
    }

    public final void setId(long j) {
        this.f988id = j;
    }

    public final void setNasId(@l String str) {
        this.nasId = str;
    }

    public final void setNasPath(@l String str) {
        this.nasPath = str;
    }

    public final void setUsername(@l String str) {
        this.username = str;
    }
}
