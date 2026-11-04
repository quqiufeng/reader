package com.zentraedi.outreader.responsemodel;

import com.zentraedi.basic.function.server.BaseModel;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookDirModel extends BaseModel {

    @l
    private final String categoryId;

    @l
    private final String categoryName;

    @l
    private final String filePath;

    @l
    private final Integer isDir;

    @l
    private Boolean isRefreshing;

    public BookDirModel() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ BookDirModel copy$default(BookDirModel bookDirModel, String str, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bookDirModel.filePath;
        }
        if ((i & 2) != 0) {
            num = bookDirModel.isDir;
        }
        if ((i & 4) != 0) {
            str2 = bookDirModel.categoryId;
        }
        if ((i & 8) != 0) {
            str3 = bookDirModel.categoryName;
        }
        return bookDirModel.copy(str, num, str2, str3);
    }

    @l
    public final String component1() {
        return this.filePath;
    }

    @l
    public final Integer component2() {
        return this.isDir;
    }

    @l
    public final String component3() {
        return this.categoryId;
    }

    @l
    public final String component4() {
        return this.categoryName;
    }

    @k
    public final BookDirModel copy(@l String str, @l Integer num, @l String str2, @l String str3) {
        return new BookDirModel(str, num, str2, str3);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookDirModel)) {
            return false;
        }
        BookDirModel bookDirModel = (BookDirModel) obj;
        return Intrinsics.areEqual(this.filePath, bookDirModel.filePath) && Intrinsics.areEqual(this.isDir, bookDirModel.isDir) && Intrinsics.areEqual(this.categoryId, bookDirModel.categoryId) && Intrinsics.areEqual(this.categoryName, bookDirModel.categoryName);
    }

    @l
    public final String getCategoryId() {
        return this.categoryId;
    }

    @l
    public final String getCategoryName() {
        return this.categoryName;
    }

    @l
    public final String getFilePath() {
        return this.filePath;
    }

    public int hashCode() {
        String str = this.filePath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.isDir;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.categoryId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.categoryName;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @l
    public final Integer isDir() {
        return this.isDir;
    }

    @l
    public final Boolean isRefreshing() {
        return this.isRefreshing;
    }

    public final void setRefreshing(@l Boolean bool) {
        this.isRefreshing = bool;
    }

    @k
    public String toString() {
        return "BookDirModel(file_path=" + this.filePath + ", is_dir=" + this.isDir + ", categoryId=" + this.categoryId + ", categoryName=" + this.categoryName + ", isRefreshing=" + this.isRefreshing + ')';
    }

    public BookDirModel(@l String str, @l Integer num, @l String str2, @l String str3) {
        this.filePath = str;
        this.isDir = num;
        this.categoryId = str2;
        this.categoryName = str3;
    }

    public /* synthetic */ BookDirModel(String str, Integer num, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
