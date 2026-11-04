package com.zentraedi.outreader.model;

import androidx.room.v;
import androidx.room.x0;
import fo.k;
import fo.l;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@v(tableName = "bookLibraryCategory")
public final class BookLibraryCategoryEntity implements Serializable {

    @x0(autoGenerate = true)
    private int index;

    @k
    private String name = "";

    @l
    private String username;

    public final int getIndex() {
        return this.index;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final String getUsername() {
        return this.username;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setName(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setUsername(@l String str) {
        this.username = str;
    }
}
