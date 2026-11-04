package com.zentraedi.outreader.model.offline;

import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.room.v;
import fo.k;
import fo.l;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@v(primaryKeys = {"categoryIndex", "username"}, tableName = "offlineCategoryEntity")
public final class OfflineCategoryEntity implements Serializable {

    @l
    @p0
    private String nasId;

    @n0
    @k
    private String categoryIndex = "";

    @n0
    @k
    private String username = "";

    @k
    private String categoryName = "";

    @k
    public final String getCategoryIndex() {
        return this.categoryIndex;
    }

    @k
    public final String getCategoryName() {
        return this.categoryName;
    }

    @l
    public final String getNasId() {
        return this.nasId;
    }

    @k
    public final String getUsername() {
        return this.username;
    }

    public final void setCategoryIndex(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.categoryIndex = str;
    }

    public final void setCategoryName(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.categoryName = str;
    }

    public final void setNasId(@l String str) {
        this.nasId = str;
    }

    public final void setUsername(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.username = str;
    }
}
