package com.zentraedi.comic.data;

import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.business.model.ComicInfoModel;
import com.zentraedi.business.model.FileInfoModel;
import fo.k;
import fo.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicZipModel extends BaseModel {

    @k
    private final ComicInfoModel comicInfoModel;

    @k
    private final FileInfoModel fileInfoModel;

    @k
    private final String path;

    public ComicZipModel(@k String path, @k ComicInfoModel comicInfoModel, @k FileInfoModel fileInfoModel) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(comicInfoModel, "comicInfoModel");
        Intrinsics.checkNotNullParameter(fileInfoModel, "fileInfoModel");
        this.path = path;
        this.comicInfoModel = comicInfoModel;
        this.fileInfoModel = fileInfoModel;
    }

    public static /* synthetic */ ComicZipModel copy$default(ComicZipModel comicZipModel, String str, ComicInfoModel comicInfoModel, FileInfoModel fileInfoModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comicZipModel.path;
        }
        if ((i & 2) != 0) {
            comicInfoModel = comicZipModel.comicInfoModel;
        }
        if ((i & 4) != 0) {
            fileInfoModel = comicZipModel.fileInfoModel;
        }
        return comicZipModel.copy(str, comicInfoModel, fileInfoModel);
    }

    @k
    public final String component1() {
        return this.path;
    }

    @k
    public final ComicInfoModel component2() {
        return this.comicInfoModel;
    }

    @k
    public final FileInfoModel component3() {
        return this.fileInfoModel;
    }

    @k
    public final ComicZipModel copy(@k String path, @k ComicInfoModel comicInfoModel, @k FileInfoModel fileInfoModel) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(comicInfoModel, "comicInfoModel");
        Intrinsics.checkNotNullParameter(fileInfoModel, "fileInfoModel");
        return new ComicZipModel(path, comicInfoModel, fileInfoModel);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComicZipModel)) {
            return false;
        }
        ComicZipModel comicZipModel = (ComicZipModel) obj;
        return Intrinsics.areEqual(this.path, comicZipModel.path) && Intrinsics.areEqual(this.comicInfoModel, comicZipModel.comicInfoModel) && Intrinsics.areEqual(this.fileInfoModel, comicZipModel.fileInfoModel);
    }

    @k
    public final ComicInfoModel getComicInfoModel() {
        return this.comicInfoModel;
    }

    @k
    public final FileInfoModel getFileInfoModel() {
        return this.fileInfoModel;
    }

    @k
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + this.comicInfoModel.hashCode()) * 31) + this.fileInfoModel.hashCode();
    }

    @k
    public String toString() {
        return "ComicZipModel(path=" + this.path + ", comicInfoModel=" + this.comicInfoModel + ", fileInfoModel=" + this.fileInfoModel + ')';
    }
}
