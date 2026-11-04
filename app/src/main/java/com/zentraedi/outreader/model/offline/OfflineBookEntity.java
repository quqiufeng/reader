package com.zentraedi.outreader.model.offline;

import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.room.v;
import fo.k;
import fo.l;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@v(primaryKeys = {"nasPath", "username", "categoryIndex"}, tableName = "offlineBook")
public final class OfflineBookEntity implements Serializable {
    private long addLibraryTimeStamp;
    private long addShelfTimeStamp;
    private int addToShelf;

    @l
    private String bookId;

    @l
    private String bookName;

    @l
    private transient String categoryName;
    private int chapterCount;
    private long fileSize;
    private long lastModifyTimeStamp;

    @l
    private String latestReadChapter;

    @l
    private String latestReadChapterId;
    private int latestReadPage;
    private long latestReadTimestamp;

    @l
    @p0
    private String nasId;
    private boolean readOnOfflineMode;

    @l
    private String readProgressExt;

    @l
    private String readProgressPercent;
    private int textNumberPositionHistory;

    @n0
    @k
    private String nasPath = "";

    @n0
    @k
    private String username = "";

    @n0
    @k
    private String categoryIndex = "";
    private int textSize = 3;

    public final long getAddLibraryTimeStamp() {
        return this.addLibraryTimeStamp;
    }

    public final long getAddShelfTimeStamp() {
        return this.addShelfTimeStamp;
    }

    public final int getAddToShelf() {
        return this.addToShelf;
    }

    @l
    public final String getBookId() {
        return this.bookId;
    }

    @l
    public final String getBookName() {
        return this.bookName;
    }

    @k
    public final String getCategoryIndex() {
        return this.categoryIndex;
    }

    @l
    public final String getCategoryName() {
        return this.categoryName;
    }

    public final int getChapterCount() {
        return this.chapterCount;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final long getLastModifyTimeStamp() {
        return this.lastModifyTimeStamp;
    }

    @l
    public final String getLatestReadChapter() {
        return this.latestReadChapter;
    }

    @l
    public final String getLatestReadChapterId() {
        return this.latestReadChapterId;
    }

    public final int getLatestReadPage() {
        return this.latestReadPage;
    }

    public final long getLatestReadTimestamp() {
        return this.latestReadTimestamp;
    }

    @l
    public final String getNasId() {
        return this.nasId;
    }

    @k
    public final String getNasPath() {
        return this.nasPath;
    }

    public final boolean getReadOnOfflineMode() {
        return this.readOnOfflineMode;
    }

    @l
    public final String getReadProgressExt() {
        return this.readProgressExt;
    }

    @l
    public final String getReadProgressPercent() {
        return this.readProgressPercent;
    }

    public final int getTextNumberPositionHistory() {
        return this.textNumberPositionHistory;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    @k
    public final String getUsername() {
        return this.username;
    }

    public final void setAddLibraryTimeStamp(long j) {
        this.addLibraryTimeStamp = j;
    }

    public final void setAddShelfTimeStamp(long j) {
        this.addShelfTimeStamp = j;
    }

    public final void setAddToShelf(int i) {
        this.addToShelf = i;
    }

    public final void setBookId(@l String str) {
        this.bookId = str;
    }

    public final void setBookName(@l String str) {
        this.bookName = str;
    }

    public final void setCategoryIndex(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.categoryIndex = str;
    }

    public final void setCategoryName(@l String str) {
        this.categoryName = str;
    }

    public final void setChapterCount(int i) {
        this.chapterCount = i;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setLastModifyTimeStamp(long j) {
        this.lastModifyTimeStamp = j;
    }

    public final void setLatestReadChapter(@l String str) {
        this.latestReadChapter = str;
    }

    public final void setLatestReadChapterId(@l String str) {
        this.latestReadChapterId = str;
    }

    public final void setLatestReadPage(int i) {
        this.latestReadPage = i;
    }

    public final void setLatestReadTimestamp(long j) {
        this.latestReadTimestamp = j;
    }

    public final void setNasId(@l String str) {
        this.nasId = str;
    }

    public final void setNasPath(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nasPath = str;
    }

    public final void setReadOnOfflineMode(boolean z) {
        this.readOnOfflineMode = z;
    }

    public final void setReadProgressExt(@l String str) {
        this.readProgressExt = str;
    }

    public final void setReadProgressPercent(@l String str) {
        this.readProgressPercent = str;
    }

    public final void setTextNumberPositionHistory(int i) {
        this.textNumberPositionHistory = i;
    }

    public final void setTextSize(int i) {
        this.textSize = i;
    }

    public final void setUsername(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.username = str;
    }
}
