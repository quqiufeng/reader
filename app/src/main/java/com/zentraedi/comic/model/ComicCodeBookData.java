package com.zentraedi.comic.model;

import com.zentraedi.basic.function.server.BaseModel;
import fo.k;
import fo.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicCodeBookData extends BaseModel {

    @k
    private final List<ComicCodeBook> list;

    @k
    private final String total;

    public ComicCodeBookData(@k String total, @k List<ComicCodeBook> list) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(list, "list");
        this.total = total;
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComicCodeBookData copy$default(ComicCodeBookData comicCodeBookData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comicCodeBookData.total;
        }
        if ((i & 2) != 0) {
            list = comicCodeBookData.list;
        }
        return comicCodeBookData.copy(str, list);
    }

    @k
    public final String component1() {
        return this.total;
    }

    @k
    public final List<ComicCodeBook> component2() {
        return this.list;
    }

    @k
    public final ComicCodeBookData copy(@k String total, @k List<ComicCodeBook> list) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(list, "list");
        return new ComicCodeBookData(total, list);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComicCodeBookData)) {
            return false;
        }
        ComicCodeBookData comicCodeBookData = (ComicCodeBookData) obj;
        return Intrinsics.areEqual(this.total, comicCodeBookData.total) && Intrinsics.areEqual(this.list, comicCodeBookData.list);
    }

    @k
    public final List<ComicCodeBook> getList() {
        return this.list;
    }

    @k
    public final String getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (this.total.hashCode() * 31) + this.list.hashCode();
    }

    @k
    public String toString() {
        return "ComicCodeBookData(total=" + this.total + ", list=" + this.list + ')';
    }
}
