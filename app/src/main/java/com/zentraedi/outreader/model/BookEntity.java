package com.zentraedi.outreader.model;

import android.text.TextUtils;
import androidx.room.j0;
import androidx.room.v;
import androidx.room.x0;
import fo.k;
import fo.l;
import java.io.Serializable;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@v(tableName = "book")
public final class BookEntity implements Serializable {
    public static final int BOOK_IS_AVAILABLE = 0;
    public static final int BOOK_IS_NOT_AVAILABLE = 1;

    @k
    public static final a Companion = new a(null);
    public static final int NEED_SYNC = 1;
    public static final int NOT_NEED_SYNC = 0;
    private static final long serialVersionUID = 7433619792183805700L;
    private long addCacheTimeStamp;
    private long addLibraryTimeStamp;
    private long addShelfTimeStamp;
    private boolean addToLibrary;
    private boolean addToShelf;

    @l
    private transient Integer categoryIndex;

    @l
    private transient String categoryName;
    private int chapterCount;

    @l
    private String cover;

    @l
    private String epubCover;
    private long fileSize;
    private int hasReadFinished;

    @x0(autoGenerate = true)
    private int index;

    @l
    private String latestReadChapter;

    @l
    private String latestReadChapterId;
    private int latestReadPage;
    private long latestReadTimestamp;

    @l
    private String localPath;

    @l
    private String md5Path;

    @l
    private String name;

    @l
    private String nasPath;
    private int readNumber;

    @l
    private String readProgressPercent;

    @l
    private String showName;

    @l
    private String sourceId;
    private int textNumberPositionHistory;
    private long time;
    private int words;

    @k
    private String userId = "0";
    private int mupdfSizeLevel = 3;

    @j0
    @k
    private String groupName = "no_group";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final String getNoSuffixName() {
        if (TextUtils.isEmpty(this.name)) {
            return "";
        }
        String str = this.name;
        Intrinsics.checkNotNull(str);
        int iLastIndexOf$default = StringsKt.lastIndexOf$default(str, ".", 0, false, 6, (Object) null);
        if (iLastIndexOf$default >= 0) {
            String str2 = this.name;
            Intrinsics.checkNotNull(str2);
            if (iLastIndexOf$default < str2.length()) {
                String str3 = this.name;
                Intrinsics.checkNotNull(str3);
                String strSubstring = str3.substring(0, iLastIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        String str4 = this.name;
        Intrinsics.checkNotNull(str4);
        return str4;
    }

    public final long getAddCacheTimeStamp() {
        return this.addCacheTimeStamp;
    }

    public final long getAddLibraryTimeStamp() {
        return this.addLibraryTimeStamp;
    }

    public final long getAddShelfTimeStamp() {
        return this.addShelfTimeStamp;
    }

    public final boolean getAddToLibrary() {
        return this.addToLibrary;
    }

    public final boolean getAddToShelf() {
        return this.addToShelf;
    }

    public final int getBookType() {
        String str = this.name;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                if (StringsKt.endsWith$default(lowerCase, ".pdf", false, 2, (Object) null)) {
                    return 1;
                }
                if (StringsKt.endsWith$default(lowerCase, ".epub", false, 2, (Object) null)) {
                    return 2;
                }
            }
        }
        return 0;
    }

    @l
    public final Integer getCategoryIndex() {
        return this.categoryIndex;
    }

    @l
    public final String getCategoryName() {
        return this.categoryName;
    }

    public final int getChapterCount() {
        return this.chapterCount;
    }

    @l
    public final String getCover() {
        return this.cover;
    }

    @l
    public final String getEpubCover() {
        return this.epubCover;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    @k
    public final String getGroupName() {
        return TextUtils.isEmpty(this.groupName) ? "no_group" : this.groupName;
    }

    public final int getHasReadFinished() {
        return this.hasReadFinished;
    }

    public final int getIndex() {
        return this.index;
    }

    @l
    public final String getLatestReadChapter() {
        return this.latestReadChapter;
    }

    @l
    public final String getLatestReadChapterId() {
        return this.latestReadChapterId;
    }

    public final int getLatestReadPage() {
        return this.latestReadPage;
    }

    public final long getLatestReadTimestamp() {
        return this.latestReadTimestamp;
    }

    @l
    public final String getLocalPath() {
        return this.localPath;
    }

    @l
    public final String getMd5Path() {
        return this.md5Path;
    }

    public final int getMupdfSizeLevel() {
        return this.mupdfSizeLevel;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final String getNasPath() {
        return this.nasPath;
    }

    public final int getReadNumber() {
        return this.readNumber;
    }

    @l
    public final String getReadProgressPercent() {
        return this.readProgressPercent;
    }

    @l
    public final String getShowName() {
        if (TextUtils.isEmpty(this.showName)) {
            return getNoSuffixName();
        }
        return StringsKt.equals$default(this.showName, this.name, false, 2, (Object) null) ? getNoSuffixName() : this.showName;
    }

    @l
    public final String getSourceId() {
        return this.sourceId;
    }

    public final int getTextNumberPositionHistory() {
        return this.textNumberPositionHistory;
    }

    public final long getTime() {
        return this.time;
    }

    @k
    public final String getUserId() {
        return this.userId;
    }

    public final int getWords() {
        return this.words;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public final boolean isPdfEpub() {
        String str;
        String lowerCase;
        String str2 = this.name;
        if (str2 == null) {
            str = this.name;
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase != null) {
                }
            }
            return false;
        }
        String lowerCase2 = str2.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (lowerCase2 == null || !StringsKt.endsWith$default(lowerCase2, ".pdf", false, 2, (Object) null)) {
            str = this.name;
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (lowerCase != null || !StringsKt.endsWith$default(lowerCase, ".epub", false, 2, (Object) null)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setAddCacheTimeStamp(long j) {
        this.addCacheTimeStamp = j;
    }

    public final void setAddLibraryTimeStamp(long j) {
        this.addLibraryTimeStamp = j;
    }

    public final void setAddShelfTimeStamp(long j) {
        this.addShelfTimeStamp = j;
    }

    public final void setAddToLibrary(boolean z) {
        this.addToLibrary = z;
    }

    public final void setAddToShelf(boolean z) {
        this.addToShelf = z;
    }

    public final void setCategoryIndex(@l Integer num) {
        this.categoryIndex = num;
    }

    public final void setCategoryName(@l String str) {
        this.categoryName = str;
    }

    public final void setChapterCount(int i) {
        this.chapterCount = i;
    }

    public final void setCover(@l String str) {
        this.cover = str;
    }

    public final void setEpubCover(@l String str) {
        this.epubCover = str;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setGroupName(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.groupName = str;
    }

    public final void setHasReadFinished(int i) {
        this.hasReadFinished = i;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setLatestReadChapter(@l String str) {
        this.latestReadChapter = str;
    }

    public final void setLatestReadChapterId(@l String str) {
        this.latestReadChapterId = str;
    }

    public final void setLatestReadPage(int i) {
        this.latestReadPage = i;
    }

    public final void setLatestReadTimestamp(long j) {
        this.latestReadTimestamp = j;
    }

    public final void setLocalPath(@l String str) {
        this.localPath = str;
    }

    public final void setMd5Path(@l String str) {
        this.md5Path = str;
    }

    public final void setMupdfSizeLevel(int i) {
        this.mupdfSizeLevel = i;
    }

    public final void setName(@l String str) {
        this.name = str;
    }

    public final void setNasPath(@l String str) {
        this.nasPath = str;
    }

    public final void setReadNumber(int i) {
        this.readNumber = i;
    }

    public final void setReadProgressPercent(@l String str) {
        this.readProgressPercent = str;
    }

    public final void setShowName(@l String str) {
        this.showName = str;
    }

    public final void setSourceId(@l String str) {
        this.sourceId = str;
    }

    public final void setTextNumberPositionHistory(int i) {
        this.textNumberPositionHistory = i;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setUserId(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final void setWords(int i) {
        this.words = i;
    }
}
