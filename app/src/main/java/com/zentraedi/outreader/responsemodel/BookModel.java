package com.zentraedi.outreader.responsemodel;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.vivo.identifier.IdentifierConstant;
import com.zentraedi.basic.function.server.BaseModel;
import com.zentraedi.basic.function.utils.r;
import com.zentraedi.business.model.CourseFileInfoModel;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.utils.l5;
import com.zentraedi.outreader.d;
import com.zspace.mobi.MobiUtilBusiness;
import fo.k;
import fo.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookModel extends BaseModel {
    public static final int ADDED_BOOKSHELF = 1;

    @k
    public static final a Companion = new a(null);
    public static final int UN_ADD_BOOKSHELF = 0;

    @SerializedName("add_library_time")
    private long addLibraryTime;

    @SerializedName("add_shelf_time")
    private long addShelfTime;
    private int add_shelf;

    @l
    private String book_id;

    @l
    private String category_id;

    @l
    private Integer category_index;

    @l
    private String category_name;
    private int chapterTotalPage;

    @l
    private String chapters;

    @l
    private String cover;

    @l
    private transient String currentPageDesc;

    @l
    private transient String downloadId;

    @SerializedName("file_size")
    private long fileSize;

    @l
    private String font_size;

    @l
    private transient FileInfoModel fromFileInfo;
    private int have_read;

    @l
    private transient Boolean isOffline;

    @l
    private Integer is_system;

    @l
    private transient String localPath;

    @l
    private transient String nasFileName;

    @SerializedName("file_path")
    @l
    private String nasPath;

    @l
    private transient Boolean offlineCover;

    @l
    private transient ReadProgressExt readProgressExt;

    @SerializedName("read_progress")
    @l
    private String readProgressPercent;

    @SerializedName("read_time")
    private long readTime;

    @l
    private String read_chapter;

    @l
    private String read_chapter_id;
    private int read_finished;

    @l
    private String read_page;

    @l
    private String read_progress_ext;

    @l
    private Integer read_status;

    @SerializedName("title")
    @l
    private String showName;

    @l
    private String text_position;

    @SerializedName("file_modify_time")
    private long time;

    @l
    private String words;

    @SerializedName("is_dir")
    @l
    private Integer dir = 0;

    @SerializedName("pin")
    @l
    private Integer bookPin = 0;

    @l
    private transient Integer downloadStatus = 1;

    @k
    private String localConvertPath = "";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static /* synthetic */ String showReadProgressPercent$default(BookModel bookModel, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.TRUE;
        }
        return bookModel.showReadProgressPercent(bool);
    }

    public final long getAddLibraryTime() {
        return this.addLibraryTime;
    }

    public final long getAddShelfTime() {
        return this.addShelfTime;
    }

    public final int getAdd_shelf() {
        return this.add_shelf;
    }

    @k
    public final String getBookFileType() {
        String str = this.fromFileInfo instanceof CourseFileInfoModel ? this.localPath : this.nasPath;
        if (str == null) {
            str = "";
        }
        if (StringsKt.endsWith(str, ".pdf", true)) {
            return "pdf";
        }
        if (StringsKt.endsWith(str, ".epub", true)) {
            return "epub";
        }
        if (StringsKt.endsWith(str, ".mobi", true)) {
            return com.zbooklibrary.constant.a.h;
        }
        return StringsKt.endsWith(str, ".azw3", true) ? com.zbooklibrary.constant.a.l : "txt";
    }

    @l
    public final Integer getBookPin() {
        return this.bookPin;
    }

    public final int getBookType() {
        String str = this.fromFileInfo instanceof CourseFileInfoModel ? this.localPath : this.nasPath;
        if (str == null) {
            str = "";
        }
        if (StringsKt.endsWith(str, ".pdf", true)) {
            return 1;
        }
        return (StringsKt.endsWith(str, ".epub", true) || MobiUtilBusiness.INSTANCE.isMobi(str)) ? 2 : 0;
    }

    @l
    public final String getBook_id() {
        return this.book_id;
    }

    @l
    public final String getCategory_id() {
        return this.category_id;
    }

    @l
    public final Integer getCategory_index() {
        return this.category_index;
    }

    @l
    public final String getCategory_name() {
        return this.category_name;
    }

    public final int getChapterTotalPage() {
        return this.chapterTotalPage;
    }

    @l
    public final String getChapters() {
        return this.chapters;
    }

    public final int getChaptersInt() {
        try {
            String str = this.chapters;
            if (str != null) {
                return Integer.parseInt(str);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @l
    public final String getCover() {
        return this.cover;
    }

    @l
    public final String getCurrentPageDesc() {
        return this.currentPageDesc;
    }

    @l
    public final Integer getDir() {
        return this.dir;
    }

    @l
    public final String getDownloadId() {
        return this.downloadId;
    }

    @l
    public final Integer getDownloadStatus() {
        return this.downloadStatus;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final int getFontSize() {
        try {
            String str = this.font_size;
            if (str != null) {
                return Integer.parseInt(str);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @l
    public final String getFont_size() {
        return this.font_size;
    }

    @l
    public final FileInfoModel getFromFileInfo() {
        return this.fromFileInfo;
    }

    public final int getHave_read() {
        return this.have_read;
    }

    @k
    public final String getLocalConvertPath() {
        if (!StringsKt.isBlank(this.localConvertPath)) {
            return this.localConvertPath;
        }
        String str = this.localPath;
        return str == null ? "" : str;
    }

    @l
    public final String getLocalPath() {
        return this.localPath;
    }

    @k
    public final String getMd5Path() {
        String strA = r.a(this.localPath);
        Intrinsics.checkNotNullExpressionValue(strA, "md5(...)");
        return strA;
    }

    @l
    public final String getNasFileName() {
        if (TextUtils.isEmpty(this.nasFileName)) {
            this.nasFileName = l5.J(this.nasPath);
        }
        return this.nasFileName;
    }

    @l
    public final String getNasPath() {
        return this.nasPath;
    }

    @l
    public final Boolean getOfflineCover() {
        return this.offlineCover;
    }

    public final int getReadPageInt() {
        try {
            String str = this.read_page;
            if (str != null) {
                return Integer.parseInt(str);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @l
    public final ReadProgressExt getReadProgressExt() {
        if (getBookType() == 2) {
            try {
                this.readProgressExt = (ReadProgressExt) com.zentraedi.basic.component.utils.a.b().fromJson(this.read_progress_ext, ReadProgressExt.class);
            } catch (Exception e) {
                nd.a.c("ReadProgressExt", e.toString());
            }
        }
        return this.readProgressExt;
    }

    @l
    public final String getReadProgressPercent() {
        return this.readProgressPercent;
    }

    public final long getReadTime() {
        return this.readTime;
    }

    @l
    public final String getRead_chapter() {
        return this.read_chapter;
    }

    @l
    public final String getRead_chapter_id() {
        return this.read_chapter_id;
    }

    public final int getRead_finished() {
        return this.read_finished;
    }

    @l
    public final String getRead_page() {
        return this.read_page;
    }

    @l
    public final String getRead_progress_ext() {
        return this.read_progress_ext;
    }

    @l
    public final Integer getRead_status() {
        return this.read_status;
    }

    @k
    public final String getRecordReadChapterId() {
        if (TextUtils.isEmpty(this.read_chapter_id)) {
            return "";
        }
        if (!MobiUtilBusiness.INSTANCE.isMobi(getNasFileName())) {
            return String.valueOf(this.read_chapter_id);
        }
        try {
            String str = this.read_chapter_id;
            Intrinsics.checkNotNull(str);
            int i = Integer.parseInt(str) - 1;
            if (i < 0) {
                i = 0;
            }
            return String.valueOf(i);
        } catch (Exception unused) {
            return String.valueOf(this.read_chapter_id);
        }
    }

    @l
    public final String getRecordTextPosition() {
        if (!MobiUtilBusiness.INSTANCE.isMobi(getNasFileName())) {
            return this.text_position;
        }
        if (TextUtils.isEmpty(this.text_position) || TextUtils.equals("0", this.text_position) || this.chapterTotalPage < 1) {
            return this.text_position;
        }
        try {
            String str = this.text_position;
            Intrinsics.checkNotNull(str);
            return String.valueOf(Float.parseFloat(str) / this.chapterTotalPage);
        } catch (Exception unused) {
            return "0";
        }
    }

    @l
    public final String getShowName() {
        return this.showName;
    }

    @k
    public final String getShowReadProgressText() {
        String str;
        String str2 = this.readProgressPercent;
        if (str2 == null || str2.length() == 0 || Intrinsics.areEqual(IdentifierConstant.OAID_STATE_DEFAULT, this.readProgressPercent) || (str = this.readProgressPercent) == null || !StringsKt.contains$default(str, "%", false, 2, (Object) null)) {
            return "";
        }
        String strP = com.zentraedi.basic.function.utils.a.p(d.q.Oz2, this.readProgressPercent);
        Intrinsics.checkNotNull(strP);
        return strP;
    }

    public final int getTextPositionInt() {
        try {
            String str = this.text_position;
            if (str != null) {
                return Integer.parseInt(str);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @l
    public final String getText_position() {
        return this.text_position;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getWordCountInt() {
        try {
            String str = this.words;
            if (str != null) {
                return Integer.parseInt(str);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @l
    public final String getWords() {
        return this.words;
    }

    public final boolean isEpub() {
        String nasFileName = getNasFileName();
        return (nasFileName != null && StringsKt.endsWith(nasFileName, ".epub", true)) || MobiUtilBusiness.INSTANCE.isMobi(getNasFileName());
    }

    @l
    public final Boolean isOffline() {
        return this.isOffline;
    }

    public final boolean isPdf() {
        String nasFileName = getNasFileName();
        return nasFileName != null && StringsKt.endsWith(nasFileName, ".pdf", true);
    }

    public final boolean isPdfEpub() {
        String nasFileName;
        String nasFileName2 = getNasFileName();
        return (nasFileName2 != null && StringsKt.endsWith(nasFileName2, ".pdf", true)) || ((nasFileName = getNasFileName()) != null && StringsKt.endsWith(nasFileName, ".epub", true)) || MobiUtilBusiness.INSTANCE.isMobi(getNasFileName());
    }

    public final boolean isTxt() {
        String nasFileName = getNasFileName();
        return nasFileName != null && StringsKt.endsWith(nasFileName, ".txt", true);
    }

    @l
    public final Integer is_system() {
        return this.is_system;
    }

    @l
    public final String recordReadChapterId() {
        if (TextUtils.isEmpty(this.read_chapter_id)) {
            return this.read_chapter_id;
        }
        if (!MobiUtilBusiness.INSTANCE.isMobi(getNasFileName())) {
            return this.read_chapter_id;
        }
        try {
            String str = this.read_chapter_id;
            Intrinsics.checkNotNull(str);
            return String.valueOf(Integer.parseInt(str) + 1);
        } catch (Exception unused) {
            return this.read_chapter_id;
        }
    }

    public final void setAddLibraryTime(long j) {
        this.addLibraryTime = j;
    }

    public final void setAddShelfTime(long j) {
        this.addShelfTime = j;
    }

    public final void setAdd_shelf(int i) {
        this.add_shelf = i;
    }

    public final void setBookPin(@l Integer num) {
        this.bookPin = num;
    }

    public final void setBook_id(@l String str) {
        this.book_id = str;
    }

    public final void setCategory_id(@l String str) {
        this.category_id = str;
    }

    public final void setCategory_index(@l Integer num) {
        this.category_index = num;
    }

    public final void setCategory_name(@l String str) {
        this.category_name = str;
    }

    public final void setChapterTotalPage(int i) {
        this.chapterTotalPage = i;
    }

    public final void setChapters(@l String str) {
        this.chapters = str;
    }

    public final void setCover(@l String str) {
        this.cover = str;
    }

    public final void setCurrentPageDesc(@l String str) {
        this.currentPageDesc = str;
    }

    public final void setDir(@l Integer num) {
        this.dir = num;
    }

    public final void setDownloadId(@l String str) {
        this.downloadId = str;
    }

    public final void setDownloadStatus(@l Integer num) {
        this.downloadStatus = num;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setFont_size(@l String str) {
        this.font_size = str;
    }

    public final void setFromFileInfo(@l FileInfoModel fileInfoModel) {
        this.fromFileInfo = fileInfoModel;
    }

    public final void setHave_read(int i) {
        this.have_read = i;
    }

    public final void setLocalConvertPath(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localConvertPath = str;
    }

    public final void setLocalPath(@l String str) {
        this.localPath = str;
    }

    public final void setNasFileName(@l String str) {
        this.nasFileName = str;
    }

    public final void setNasPath(@l String str) {
        this.nasPath = str;
    }

    public final void setOffline(@l Boolean bool) {
        this.isOffline = bool;
    }

    public final void setOfflineCover(@l Boolean bool) {
        this.offlineCover = bool;
    }

    public final void setReadProgressExt(@l ReadProgressExt readProgressExt) {
        this.readProgressExt = readProgressExt;
        try {
            this.read_progress_ext = com.zentraedi.basic.component.utils.a.b().toJson(readProgressExt);
        } catch (Exception e) {
            nd.a.c("ReadProgressExt", e.toString());
        }
    }

    public final void setReadProgressPercent(@l String str) {
        this.readProgressPercent = str;
    }

    public final void setReadTime(long j) {
        this.readTime = j;
    }

    public final void setRead_chapter(@l String str) {
        this.read_chapter = str;
    }

    public final void setRead_chapter_id(@l String str) {
        this.read_chapter_id = str;
    }

    public final void setRead_finished(int i) {
        this.read_finished = i;
    }

    public final void setRead_page(@l String str) {
        this.read_page = str;
    }

    public final void setRead_progress_ext(@l String str) {
        this.read_progress_ext = str;
    }

    public final void setRead_status(@l Integer num) {
        this.read_status = num;
    }

    public final void setShowName(@l String str) {
        this.showName = str;
    }

    public final void setText_position(@l String str) {
        this.text_position = str;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setWords(@l String str) {
        this.words = str;
    }

    public final void set_system(@l Integer num) {
        this.is_system = num;
    }

    @k
    public final String showReadProgressPercent(@l Boolean bool) {
        if (TextUtils.isEmpty(this.readProgressPercent) || TextUtils.equals(IdentifierConstant.OAID_STATE_DEFAULT, this.readProgressPercent)) {
            String strN = com.zentraedi.basic.function.utils.a.n(d.q.cB2);
            Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            return strN;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return String.valueOf(this.readProgressPercent);
        }
        String strP = com.zentraedi.basic.function.utils.a.p(d.q.Oz2, this.readProgressPercent);
        Intrinsics.checkNotNullExpressionValue(strP, "getString(...)");
        return strP;
    }

    public final boolean supportReadFile() {
        return isPdf() || isEpub() || isTxt();
    }

    @k
    public String toString() {
        return "BookModel(book_id=" + this.book_id + ", showName=" + this.showName + ", cover=" + this.cover + ", words=" + this.words + ", chapters=" + this.chapters + ", fileSize=" + this.fileSize + ", nasPath=" + this.nasPath + ", category_id=" + this.category_id + ", is_system=" + this.is_system + ", category_name=" + this.category_name + ", have_read=" + this.have_read + ", read_chapter=" + this.read_chapter + ", read_chapter_id=" + this.read_chapter_id + ", read_page=" + this.read_page + ", read_status=" + this.read_status + ", dir=" + this.dir + ", bookPin=" + this.bookPin + ", readProgressPercent=" + this.readProgressPercent + ", read_finished=" + this.read_finished + ", text_position=" + this.text_position + ", font_size=" + this.font_size + ", add_shelf=" + this.add_shelf + ", chapterTotalPage=" + this.chapterTotalPage + ", readTime=" + this.readTime + ", addShelfTime=" + this.addShelfTime + ", addLibraryTime=" + this.addLibraryTime + ", category_index=" + this.category_index + ", time=" + this.time + ", read_progress_ext=" + this.read_progress_ext + ", localPath=" + this.localPath + ", isOffline=" + this.isOffline + ", offlineCover=" + this.offlineCover + ", fromFileInfo=" + this.fromFileInfo + ", downloadId=" + this.downloadId + ", downloadStatus=" + this.downloadStatus + ", nasFileName=" + getNasFileName() + ", isPdfEpub=" + isPdfEpub() + ", isEpub=" + isEpub() + ", isPdf=" + isPdf() + ", isTxt=" + isTxt() + ", localConvertPath='" + getLocalConvertPath() + "', bookType=" + getBookType() + ", bookFileType='" + getBookFileType() + "', readPageInt=" + getReadPageInt() + ", textPositionInt=" + getTextPositionInt() + ", wordCountInt=" + getWordCountInt() + ", fontSize=" + getFontSize() + ", chaptersInt=" + getChaptersInt() + ", md5Path='" + getMd5Path() + "', readProgressExt=" + getReadProgressExt() + ')';
    }
}
