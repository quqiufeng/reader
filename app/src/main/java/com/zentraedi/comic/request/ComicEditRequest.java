package com.zentraedi.comic.request;

import com.zentraedi.business.http.NasDeviceRequest;
import fo.k;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicEditRequest extends NasDeviceRequest {

    @l
    private Integer auto;

    @l
    private final String comic_id;

    @l
    private String cover;

    @l
    private String masked = "1";

    @l
    private String name;

    public ComicEditRequest(@l String str) {
        this.comic_id = str;
    }

    @k
    public String getApiPath() {
        return "/zcomic/comic/edit";
    }

    @l
    public final Integer getAuto() {
        return this.auto;
    }

    @l
    public final String getComic_id() {
        return this.comic_id;
    }

    @l
    public final String getCover() {
        return this.cover;
    }

    @l
    public final String getMasked() {
        return this.masked;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public final void setAuto(@l Integer num) {
        this.auto = num;
    }

    public final void setCover(@l String str) {
        this.cover = str;
    }

    public final void setMasked(@l String str) {
        this.masked = str;
    }

    public final void setName(@l String str) {
        this.name = str;
    }
}
