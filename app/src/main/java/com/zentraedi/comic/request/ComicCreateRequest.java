package com.zentraedi.comic.request;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.business.http.NasDeviceRequest;
import com.zentraedi.comic.activity.ComicSubDirActivity;
import fo.k;
import fo.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicCreateRequest extends NasDeviceRequest {

    @l
    private String cover;

    @SerializedName(ComicSubDirActivity.i0)
    @l
    private String dirId;

    @k
    private String masked = "1";

    @l
    private String name;

    @SerializedName("on_shelf")
    private int onShelf;

    @l
    private String path;

    @k
    public String getApiPath() {
        return "/zcomic/comic/create";
    }

    @l
    public final String getCover() {
        return this.cover;
    }

    @l
    public final String getDirId() {
        return this.dirId;
    }

    @k
    public final String getMasked() {
        return this.masked;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public final int getOnShelf() {
        return this.onShelf;
    }

    @l
    public final String getPath() {
        return this.path;
    }

    public final void setCover(@l String str) {
        this.cover = str;
    }

    public final void setDirId(@l String str) {
        this.dirId = str;
    }

    public final void setMasked(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.masked = str;
    }

    public final void setName(@l String str) {
        this.name = str;
    }

    public final void setOnShelf(int i) {
        this.onShelf = i;
    }

    public final void setPath(@l String str) {
        this.path = str;
    }
}
