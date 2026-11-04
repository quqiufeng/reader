package com.zentraedi.comic.business;

import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.business.model.ComicInfoModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicSetCoverModel extends BaseModel {

    @fo.l
    private ComicInfoModel model;

    @fo.k
    private String path;

    public ComicSetCoverModel(@fo.l ComicInfoModel comicInfoModel, @fo.k String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.model = comicInfoModel;
        this.path = path;
    }

    @fo.l
    public final ComicInfoModel getModel() {
        return this.model;
    }

    @fo.k
    public final String getPath() {
        return this.path;
    }

    public final void setModel(@fo.l ComicInfoModel comicInfoModel) {
        this.model = comicInfoModel;
    }

    public final void setPath(@fo.k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.path = str;
    }
}
