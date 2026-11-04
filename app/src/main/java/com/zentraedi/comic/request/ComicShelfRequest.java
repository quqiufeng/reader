package com.zentraedi.comic.request;

import com.google.gson.annotations.SerializedName;
import com.zentraedi.business.http.NasDeviceRequest;
import com.zentraedi.comic.activity.ComicSubDirActivity;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class ComicShelfRequest extends NasDeviceRequest {

    @k
    public static final a Companion = new a(null);
    public static final int has_edited = 1;
    public static final int no_on_shelf = 0;
    public static final int on_shelf = 1;

    @SerializedName(ComicSubDirActivity.h0)
    @l
    private String cateId;

    @SerializedName(ComicSubDirActivity.i0)
    @l
    private Integer dirId;

    @l
    private Integer edited;
    private int num = 50;

    @SerializedName("on_shelf")
    @l
    private Integer onShelf;

    @l
    private String order;

    @l
    private Integer progressed;

    @l
    private String sortby;
    private int start;

    @SerializedName("without_masked")
    @l
    private String withoutMasked;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @k
    public String getApiPath() {
        return "/zcomic/comic/list";
    }

    @l
    public final String getCateId() {
        return this.cateId;
    }

    @l
    public final Integer getDirId() {
        return this.dirId;
    }

    @l
    public final Integer getEdited() {
        return this.edited;
    }

    public final int getNum() {
        return this.num;
    }

    @l
    public final Integer getOnShelf() {
        return this.onShelf;
    }

    @l
    public final String getOrder() {
        return this.order;
    }

    @l
    public final Integer getProgressed() {
        return this.progressed;
    }

    @l
    public final String getSortby() {
        return this.sortby;
    }

    public final int getStart() {
        return this.start;
    }

    @l
    public final String getWithoutMasked() {
        return this.withoutMasked;
    }

    public final void setCateId(@l String str) {
        this.cateId = str;
    }

    public final void setDirId(@l Integer num) {
        this.dirId = num;
    }

    public final void setEdited(@l Integer num) {
        this.edited = num;
    }

    public final void setNum(int i) {
        this.num = i;
    }

    public final void setOnShelf(@l Integer num) {
        this.onShelf = num;
    }

    public final void setOrder(@l String str) {
        this.order = str;
    }

    public final void setPage(int i) {
        this.start = i * this.num;
    }

    public final void setProgressed(@l Integer num) {
        this.progressed = num;
    }

    public final void setSortby(@l String str) {
        this.sortby = str;
    }

    public final void setStart(int i) {
        this.start = i;
    }

    public final void setWithoutMasked(@l String str) {
        this.withoutMasked = str;
    }
}
