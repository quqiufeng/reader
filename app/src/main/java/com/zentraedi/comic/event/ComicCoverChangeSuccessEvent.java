package com.zentraedi.comic.event;

import com.zentraedi.business.message.event.BaseMessageEvent;
import com.zentraedi.business.model.ComicInfoModel;
import fo.l;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicCoverChangeSuccessEvent extends BaseMessageEvent {

    @l
    private final ComicInfoModel comicInfo;

    @l
    private final String path;

    @l
    private final String tempUrl;

    public ComicCoverChangeSuccessEvent(@l ComicInfoModel comicInfoModel, @l String str, @l String str2) {
        this.comicInfo = comicInfoModel;
        this.path = str;
        this.tempUrl = str2;
    }

    @l
    public final ComicInfoModel getComicInfo() {
        return this.comicInfo;
    }

    @l
    public final String getPath() {
        return this.path;
    }

    @l
    public final String getTempUrl() {
        return this.tempUrl;
    }
}
