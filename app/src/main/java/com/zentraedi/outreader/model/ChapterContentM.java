package com.zentraedi.outreader.model;

import com.zentraedi.basic.function.server.BaseModel;
import fo.k;
import fo.l;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class ChapterContentM extends BaseModel {
    public static final int CHAPTER_CONTENT_LOCK = 1;

    @k
    public static final a Companion = new a(null);
    private static final long serialVersionUID = 342727183934287489L;

    @l
    @JvmField
    public String chapterId;

    @l
    @JvmField
    public String chapterName;

    @l
    private List<ComicBean> comicImages;

    @l
    @JvmField
    public String content;

    @l
    private String originalContent;

    @l
    private String url;

    public static final class ComicBean extends BaseModel {
        private int height;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @l
        private String f981id;
        private int order;

        @l
        private String url;
        private int width;

        public final int getHeight() {
            return this.height;
        }

        @l
        public final String getId() {
            return this.f981id;
        }

        public final int getOrder() {
            return this.order;
        }

        @l
        public final String getUrl() {
            return this.url;
        }

        public final int getWidth() {
            return this.width;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        public final void setId(@l String str) {
            this.f981id = str;
        }

        public final void setOrder(int i) {
            this.order = i;
        }

        public final void setUrl(@l String str) {
            this.url = str;
        }

        public final void setWidth(int i) {
            this.width = i;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @l
    public final List<ComicBean> getComicImages() {
        return this.comicImages;
    }

    @l
    public final String getOriginalContent() {
        return this.originalContent;
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    public final void setComicImages(@l List<ComicBean> list) {
        this.comicImages = list;
    }

    public final void setOriginalContent(@l String str) {
        this.originalContent = str;
    }

    public final void setUrl(@l String str) {
        this.url = str;
    }
}
