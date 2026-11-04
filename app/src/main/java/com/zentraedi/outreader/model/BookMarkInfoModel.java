package com.zentraedi.outreader.model;

import com.zentraedi.basic.function.server.BaseModel;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookMarkInfoModel extends BaseModel {

    @k
    public static final a Companion = new a(null);

    @l
    private String chapterId;

    @l
    private String chapterName;

    @l
    private String desc;

    @l
    private String fileIndex;

    @l
    private String fileProgress;

    @l
    private String pageIndex;

    @l
    private String textPosition;

    @l
    private String time;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @l
        public final BookMarkInfoModel a(@l String str) {
            try {
                return (BookMarkInfoModel) com.zentraedi.basic.component.utils.a.b().fromJson(str, BookMarkInfoModel.class);
            } catch (Exception e) {
                nd.a.c("BookMarkInfoModel", e.toString());
                return null;
            }
        }

        @l
        public final String b(@l BookMarkInfoModel bookMarkInfoModel) {
            try {
                return com.zentraedi.basic.component.utils.a.b().toJson(bookMarkInfoModel);
            } catch (Exception e) {
                nd.a.c("BookMarkInfoModel", e.toString());
                return null;
            }
        }

        private a() {
        }
    }

    @l
    public final String getChapterId() {
        return this.chapterId;
    }

    @l
    public final String getChapterName() {
        return this.chapterName;
    }

    @l
    public final String getDesc() {
        return this.desc;
    }

    @l
    public final String getFileIndex() {
        return this.fileIndex;
    }

    @l
    public final String getFileProgress() {
        return this.fileProgress;
    }

    @l
    public final String getPageIndex() {
        return this.pageIndex;
    }

    @l
    public final String getTextPosition() {
        return this.textPosition;
    }

    @l
    public final String getTime() {
        return this.time;
    }

    public final void setChapterId(@l String str) {
        this.chapterId = str;
    }

    public final void setChapterName(@l String str) {
        this.chapterName = str;
    }

    public final void setDesc(@l String str) {
        this.desc = str;
    }

    public final void setFileIndex(@l String str) {
        this.fileIndex = str;
    }

    public final void setFileProgress(@l String str) {
        this.fileProgress = str;
    }

    public final void setPageIndex(@l String str) {
        this.pageIndex = str;
    }

    public final void setTextPosition(@l String str) {
        this.textPosition = str;
    }

    public final void setTime(@l String str) {
        this.time = str;
    }
}
