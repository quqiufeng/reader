package com.zentraedi.outreader.model.entity;

import androidx.room.v;
import androidx.room.x0;
import fo.l;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@v(tableName = "comic_epub_info")
public final class ComicEpubInfoEntity implements Serializable {

    @l
    private String fileLocalPath;
    private long fileModifiedTime;

    @l
    private String filePathMd5;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @x0(autoGenerate = true)
    private long f987id;

    @l
    private String imageLinkJson;

    @l
    private String nasId;

    @l
    private String username;

    @l
    public final String getFileLocalPath() {
        return this.fileLocalPath;
    }

    public final long getFileModifiedTime() {
        return this.fileModifiedTime;
    }

    @l
    public final String getFilePathMd5() {
        return this.filePathMd5;
    }

    public final long getId() {
        return this.f987id;
    }

    @l
    public final String getImageLinkJson() {
        return this.imageLinkJson;
    }

    @l
    public final String getNasId() {
        return this.nasId;
    }

    @l
    public final String getUsername() {
        return this.username;
    }

    public final void setFileLocalPath(@l String str) {
        this.fileLocalPath = str;
    }

    public final void setFileModifiedTime(long j) {
        this.fileModifiedTime = j;
    }

    public final void setFilePathMd5(@l String str) {
        this.filePathMd5 = str;
    }

    public final void setId(long j) {
        this.f987id = j;
    }

    public final void setImageLinkJson(@l String str) {
        this.imageLinkJson = str;
    }

    public final void setNasId(@l String str) {
        this.nasId = str;
    }

    public final void setUsername(@l String str) {
        this.username = str;
    }
}
