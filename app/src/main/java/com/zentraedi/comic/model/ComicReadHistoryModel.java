package com.zentraedi.comic.model;

import com.google.gson.annotations.SerializedName;
import com.umeng.socialize.common.SocializeConstants;
import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.business.model.ComicInfoModel;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicReadHistoryModel extends BaseModel {

    @l
    private String append;

    @l
    private ComicInfoModel comic;

    @SerializedName("created_at")
    @l
    private String createdAt;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @l
    private Integer f360id;

    @l
    private String path;

    @SerializedName("updated_at")
    @l
    private String updatedAt;

    @SerializedName(SocializeConstants.TENCENT_UID)
    @l
    private Integer userId;

    @l
    public final String getAppend() {
        return this.append;
    }

    @l
    public final ComicInfoModel getComic() {
        return this.comic;
    }

    @l
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @l
    public final Integer getId() {
        return this.f360id;
    }

    @l
    public final String getPath() {
        return this.path;
    }

    @l
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    @l
    public final Integer getUserId() {
        return this.userId;
    }

    public final void setAppend(@l String str) {
        this.append = str;
    }

    public final void setComic(@l ComicInfoModel comicInfoModel) {
        this.comic = comicInfoModel;
    }

    public final void setCreatedAt(@l String str) {
        this.createdAt = str;
    }

    public final void setId(@l Integer num) {
        this.f360id = num;
    }

    public final void setPath(@l String str) {
        this.path = str;
    }

    public final void setUpdatedAt(@l String str) {
        this.updatedAt = str;
    }

    public final void setUserId(@l Integer num) {
        this.userId = num;
    }
}
