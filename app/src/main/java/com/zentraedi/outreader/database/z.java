package com.zentraedi.outreader.database;

import androidx.room.RoomDatabase;
import com.zentraedi.outreader.model.BookEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class z implements k {
    private final RoomDatabase a;
    private final androidx.room.y<BookEntity> b = new a();
    private final androidx.room.w<BookEntity> c = new b();

    class a extends androidx.room.y<BookEntity> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.n0 c4.g gVar, @androidx.annotation.n0 BookEntity bookEntity) {
            gVar.l(1, bookEntity.getIndex());
            if (bookEntity.getUserId() == null) {
                gVar.G(2);
            } else {
                gVar.G2(2, bookEntity.getUserId());
            }
            if (bookEntity.getMd5Path() == null) {
                gVar.G(3);
            } else {
                gVar.G2(3, bookEntity.getMd5Path());
            }
            if (bookEntity.getName() == null) {
                gVar.G(4);
            } else {
                gVar.G2(4, bookEntity.getName());
            }
            if (bookEntity.getCover() == null) {
                gVar.G(5);
            } else {
                gVar.G2(5, bookEntity.getCover());
            }
            gVar.l(6, bookEntity.getReadNumber());
            gVar.l(7, bookEntity.getLatestReadTimestamp());
            if (bookEntity.getSourceId() == null) {
                gVar.G(8);
            } else {
                gVar.G2(8, bookEntity.getSourceId());
            }
            if (bookEntity.getLatestReadChapter() == null) {
                gVar.G(9);
            } else {
                gVar.G2(9, bookEntity.getLatestReadChapter());
            }
            if (bookEntity.getLatestReadChapterId() == null) {
                gVar.G(10);
            } else {
                gVar.G2(10, bookEntity.getLatestReadChapterId());
            }
            gVar.l(11, bookEntity.getLatestReadPage());
            gVar.l(12, bookEntity.getChapterCount());
            gVar.l(13, bookEntity.getWords());
            gVar.l(14, bookEntity.getHasReadFinished());
            gVar.l(15, bookEntity.getTime());
            if (bookEntity.getReadProgressPercent() == null) {
                gVar.G(16);
            } else {
                gVar.G2(16, bookEntity.getReadProgressPercent());
            }
            gVar.l(17, bookEntity.getTextNumberPositionHistory());
            if (bookEntity.getEpubCover() == null) {
                gVar.G(18);
            } else {
                gVar.G2(18, bookEntity.getEpubCover());
            }
            gVar.l(19, bookEntity.getAddToShelf() ? 1L : 0L);
            gVar.l(20, bookEntity.getAddToLibrary() ? 1L : 0L);
            if (bookEntity.getLocalPath() == null) {
                gVar.G(21);
            } else {
                gVar.G2(21, bookEntity.getLocalPath());
            }
            if (bookEntity.getNasPath() == null) {
                gVar.G(22);
            } else {
                gVar.G2(22, bookEntity.getNasPath());
            }
            gVar.l(23, bookEntity.getAddShelfTimeStamp());
            gVar.l(24, bookEntity.getAddLibraryTimeStamp());
            gVar.l(25, bookEntity.getAddCacheTimeStamp());
            if (bookEntity.getShowName() == null) {
                gVar.G(26);
            } else {
                gVar.G2(26, bookEntity.getShowName());
            }
            gVar.l(27, bookEntity.getFileSize());
            gVar.l(28, bookEntity.getMupdfSizeLevel());
        }

        @androidx.annotation.n0
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `book` (`index`,`userId`,`md5Path`,`name`,`cover`,`readNumber`,`latestReadTimestamp`,`sourceId`,`latestReadChapter`,`latestReadChapterId`,`latestReadPage`,`chapterCount`,`words`,`hasReadFinished`,`time`,`readProgressPercent`,`textNumberPositionHistory`,`epubCover`,`addToShelf`,`addToLibrary`,`localPath`,`nasPath`,`addShelfTimeStamp`,`addLibraryTimeStamp`,`addCacheTimeStamp`,`showName`,`fileSize`,`mupdfSizeLevel`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    class b extends androidx.room.w<BookEntity> {
        b() {
        }

        @androidx.annotation.n0
        protected String b() {
            return "UPDATE OR ABORT `book` SET `index` = ?,`userId` = ?,`md5Path` = ?,`name` = ?,`cover` = ?,`readNumber` = ?,`latestReadTimestamp` = ?,`sourceId` = ?,`latestReadChapter` = ?,`latestReadChapterId` = ?,`latestReadPage` = ?,`chapterCount` = ?,`words` = ?,`hasReadFinished` = ?,`time` = ?,`readProgressPercent` = ?,`textNumberPositionHistory` = ?,`epubCover` = ?,`addToShelf` = ?,`addToLibrary` = ?,`localPath` = ?,`nasPath` = ?,`addShelfTimeStamp` = ?,`addLibraryTimeStamp` = ?,`addCacheTimeStamp` = ?,`showName` = ?,`fileSize` = ?,`mupdfSizeLevel` = ? WHERE `index` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.n0 c4.g gVar, @androidx.annotation.n0 BookEntity bookEntity) {
            gVar.l(1, bookEntity.getIndex());
            if (bookEntity.getUserId() == null) {
                gVar.G(2);
            } else {
                gVar.G2(2, bookEntity.getUserId());
            }
            if (bookEntity.getMd5Path() == null) {
                gVar.G(3);
            } else {
                gVar.G2(3, bookEntity.getMd5Path());
            }
            if (bookEntity.getName() == null) {
                gVar.G(4);
            } else {
                gVar.G2(4, bookEntity.getName());
            }
            if (bookEntity.getCover() == null) {
                gVar.G(5);
            } else {
                gVar.G2(5, bookEntity.getCover());
            }
            gVar.l(6, bookEntity.getReadNumber());
            gVar.l(7, bookEntity.getLatestReadTimestamp());
            if (bookEntity.getSourceId() == null) {
                gVar.G(8);
            } else {
                gVar.G2(8, bookEntity.getSourceId());
            }
            if (bookEntity.getLatestReadChapter() == null) {
                gVar.G(9);
            } else {
                gVar.G2(9, bookEntity.getLatestReadChapter());
            }
            if (bookEntity.getLatestReadChapterId() == null) {
                gVar.G(10);
            } else {
                gVar.G2(10, bookEntity.getLatestReadChapterId());
            }
            gVar.l(11, bookEntity.getLatestReadPage());
            gVar.l(12, bookEntity.getChapterCount());
            gVar.l(13, bookEntity.getWords());
            gVar.l(14, bookEntity.getHasReadFinished());
            gVar.l(15, bookEntity.getTime());
            if (bookEntity.getReadProgressPercent() == null) {
                gVar.G(16);
            } else {
                gVar.G2(16, bookEntity.getReadProgressPercent());
            }
            gVar.l(17, bookEntity.getTextNumberPositionHistory());
            if (bookEntity.getEpubCover() == null) {
                gVar.G(18);
            } else {
                gVar.G2(18, bookEntity.getEpubCover());
            }
            gVar.l(19, bookEntity.getAddToShelf() ? 1L : 0L);
            gVar.l(20, bookEntity.getAddToLibrary() ? 1L : 0L);
            if (bookEntity.getLocalPath() == null) {
                gVar.G(21);
            } else {
                gVar.G2(21, bookEntity.getLocalPath());
            }
            if (bookEntity.getNasPath() == null) {
                gVar.G(22);
            } else {
                gVar.G2(22, bookEntity.getNasPath());
            }
            gVar.l(23, bookEntity.getAddShelfTimeStamp());
            gVar.l(24, bookEntity.getAddLibraryTimeStamp());
            gVar.l(25, bookEntity.getAddCacheTimeStamp());
            if (bookEntity.getShowName() == null) {
                gVar.G(26);
            } else {
                gVar.G2(26, bookEntity.getShowName());
            }
            gVar.l(27, bookEntity.getFileSize());
            gVar.l(28, bookEntity.getMupdfSizeLevel());
            gVar.l(29, bookEntity.getIndex());
        }
    }

    public z(@androidx.annotation.n0 final RoomDatabase __db) {
        this.a = __db;
    }

    public static /* synthetic */ List A(String str, int i, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM book WHERE userId LIKE ? AND addToLibrary = 1 ORDER BY addLibraryTimeStamp DESC LIMIT ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            gVarN2.l(2, i);
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "userId");
            int iD3 = androidx.room.util.p.d(gVarN2, "md5Path");
            int iD4 = androidx.room.util.p.d(gVarN2, "name");
            int iD5 = androidx.room.util.p.d(gVarN2, "cover");
            int iD6 = androidx.room.util.p.d(gVarN2, "readNumber");
            int iD7 = androidx.room.util.p.d(gVarN2, "latestReadTimestamp");
            int iD8 = androidx.room.util.p.d(gVarN2, "sourceId");
            int iD9 = androidx.room.util.p.d(gVarN2, "latestReadChapter");
            int iD10 = androidx.room.util.p.d(gVarN2, "latestReadChapterId");
            int iD11 = androidx.room.util.p.d(gVarN2, "latestReadPage");
            int iD12 = androidx.room.util.p.d(gVarN2, "chapterCount");
            int iD13 = androidx.room.util.p.d(gVarN2, "words");
            int iD14 = androidx.room.util.p.d(gVarN2, "hasReadFinished");
            int iD15 = androidx.room.util.p.d(gVarN2, "time");
            int iD16 = androidx.room.util.p.d(gVarN2, "readProgressPercent");
            int iD17 = androidx.room.util.p.d(gVarN2, "textNumberPositionHistory");
            int iD18 = androidx.room.util.p.d(gVarN2, "epubCover");
            int iD19 = androidx.room.util.p.d(gVarN2, "addToShelf");
            int iD20 = androidx.room.util.p.d(gVarN2, "addToLibrary");
            int iD21 = androidx.room.util.p.d(gVarN2, "localPath");
            int iD22 = androidx.room.util.p.d(gVarN2, "nasPath");
            int iD23 = androidx.room.util.p.d(gVarN2, "addShelfTimeStamp");
            int iD24 = androidx.room.util.p.d(gVarN2, "addLibraryTimeStamp");
            int iD25 = androidx.room.util.p.d(gVarN2, "addCacheTimeStamp");
            int iD26 = androidx.room.util.p.d(gVarN2, "showName");
            int iD27 = androidx.room.util.p.d(gVarN2, "fileSize");
            int iD28 = androidx.room.util.p.d(gVarN2, "mupdfSizeLevel");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                ArrayList arrayList2 = arrayList;
                BookEntity bookEntity = new BookEntity();
                int i2 = iD13;
                int i3 = iD14;
                bookEntity.setIndex((int) gVarN2.getLong(iD));
                bookEntity.setUserId(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                bookEntity.setMd5Path(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                bookEntity.setName(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                bookEntity.setCover(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                int i4 = iD2;
                int i5 = iD3;
                bookEntity.setReadNumber((int) gVarN2.getLong(iD6));
                bookEntity.setLatestReadTimestamp(gVarN2.getLong(iD7));
                bookEntity.setSourceId(gVarN2.isNull(iD8) ? null : gVarN2.Y(iD8));
                bookEntity.setLatestReadChapter(gVarN2.isNull(iD9) ? null : gVarN2.Y(iD9));
                bookEntity.setLatestReadChapterId(gVarN2.isNull(iD10) ? null : gVarN2.Y(iD10));
                bookEntity.setLatestReadPage((int) gVarN2.getLong(iD11));
                bookEntity.setChapterCount((int) gVarN2.getLong(iD12));
                int i6 = iD4;
                bookEntity.setWords((int) gVarN2.getLong(i2));
                int i7 = iD5;
                bookEntity.setHasReadFinished((int) gVarN2.getLong(i3));
                int i8 = iD15;
                bookEntity.setTime(gVarN2.getLong(i8));
                int i9 = iD16;
                bookEntity.setReadProgressPercent(gVarN2.isNull(i9) ? null : gVarN2.Y(i9));
                int i10 = iD17;
                bookEntity.setTextNumberPositionHistory((int) gVarN2.getLong(i10));
                int i11 = iD18;
                bookEntity.setEpubCover(gVarN2.isNull(i11) ? null : gVarN2.Y(i11));
                int i12 = iD19;
                bookEntity.setAddToShelf(((int) gVarN2.getLong(i12)) != 0);
                int i13 = iD20;
                bookEntity.setAddToLibrary(((int) gVarN2.getLong(i13)) != 0);
                int i14 = iD21;
                bookEntity.setLocalPath(gVarN2.isNull(i14) ? null : gVarN2.Y(i14));
                int i15 = iD22;
                bookEntity.setNasPath(gVarN2.isNull(i15) ? null : gVarN2.Y(i15));
                int i16 = iD23;
                bookEntity.setAddShelfTimeStamp(gVarN2.getLong(i16));
                int i17 = iD24;
                bookEntity.setAddLibraryTimeStamp(gVarN2.getLong(i17));
                int i18 = iD25;
                bookEntity.setAddCacheTimeStamp(gVarN2.getLong(i18));
                int i19 = iD26;
                bookEntity.setShowName(gVarN2.isNull(i19) ? null : gVarN2.Y(i19));
                int i20 = iD27;
                bookEntity.setFileSize(gVarN2.getLong(i20));
                int i21 = iD28;
                bookEntity.setMupdfSizeLevel((int) gVarN2.getLong(i21));
                arrayList2.add(bookEntity);
                iD24 = i17;
                iD22 = i15;
                iD28 = i21;
                arrayList = arrayList2;
                iD2 = i4;
                iD4 = i6;
                iD3 = i5;
                iD13 = i2;
                iD16 = i9;
                iD18 = i11;
                iD20 = i13;
                iD21 = i14;
                iD23 = i16;
                iD14 = i3;
                iD15 = i8;
                iD17 = i10;
                iD19 = i12;
                iD25 = i18;
                iD26 = i19;
                iD27 = i20;
                iD5 = i7;
            }
            ArrayList arrayList3 = arrayList;
            gVarN2.close();
            return arrayList3;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object B(z zVar, BookEntity[] bookEntityArr, c4.c cVar) {
        zVar.b.insert(cVar, bookEntityArr);
        return null;
    }

    @androidx.annotation.n0
    public static List<Class<?>> C() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List o(String str, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM book WHERE userId LIKE ? AND addToLibrary = 1 ORDER BY addLibraryTimeStamp DESC");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "userId");
            int iD3 = androidx.room.util.p.d(gVarN2, "md5Path");
            int iD4 = androidx.room.util.p.d(gVarN2, "name");
            int iD5 = androidx.room.util.p.d(gVarN2, "cover");
            int iD6 = androidx.room.util.p.d(gVarN2, "readNumber");
            int iD7 = androidx.room.util.p.d(gVarN2, "latestReadTimestamp");
            int iD8 = androidx.room.util.p.d(gVarN2, "sourceId");
            int iD9 = androidx.room.util.p.d(gVarN2, "latestReadChapter");
            int iD10 = androidx.room.util.p.d(gVarN2, "latestReadChapterId");
            int iD11 = androidx.room.util.p.d(gVarN2, "latestReadPage");
            int iD12 = androidx.room.util.p.d(gVarN2, "chapterCount");
            int iD13 = androidx.room.util.p.d(gVarN2, "words");
            int iD14 = androidx.room.util.p.d(gVarN2, "hasReadFinished");
            int iD15 = androidx.room.util.p.d(gVarN2, "time");
            int iD16 = androidx.room.util.p.d(gVarN2, "readProgressPercent");
            int iD17 = androidx.room.util.p.d(gVarN2, "textNumberPositionHistory");
            int iD18 = androidx.room.util.p.d(gVarN2, "epubCover");
            int iD19 = androidx.room.util.p.d(gVarN2, "addToShelf");
            int iD20 = androidx.room.util.p.d(gVarN2, "addToLibrary");
            int iD21 = androidx.room.util.p.d(gVarN2, "localPath");
            int iD22 = androidx.room.util.p.d(gVarN2, "nasPath");
            int iD23 = androidx.room.util.p.d(gVarN2, "addShelfTimeStamp");
            int iD24 = androidx.room.util.p.d(gVarN2, "addLibraryTimeStamp");
            int iD25 = androidx.room.util.p.d(gVarN2, "addCacheTimeStamp");
            int iD26 = androidx.room.util.p.d(gVarN2, "showName");
            int iD27 = androidx.room.util.p.d(gVarN2, "fileSize");
            int iD28 = androidx.room.util.p.d(gVarN2, "mupdfSizeLevel");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                ArrayList arrayList2 = arrayList;
                BookEntity bookEntity = new BookEntity();
                int i = iD13;
                int i2 = iD14;
                bookEntity.setIndex((int) gVarN2.getLong(iD));
                bookEntity.setUserId(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                bookEntity.setMd5Path(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                bookEntity.setName(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                bookEntity.setCover(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                int i3 = iD2;
                int i4 = iD3;
                bookEntity.setReadNumber((int) gVarN2.getLong(iD6));
                bookEntity.setLatestReadTimestamp(gVarN2.getLong(iD7));
                bookEntity.setSourceId(gVarN2.isNull(iD8) ? null : gVarN2.Y(iD8));
                bookEntity.setLatestReadChapter(gVarN2.isNull(iD9) ? null : gVarN2.Y(iD9));
                bookEntity.setLatestReadChapterId(gVarN2.isNull(iD10) ? null : gVarN2.Y(iD10));
                bookEntity.setLatestReadPage((int) gVarN2.getLong(iD11));
                bookEntity.setChapterCount((int) gVarN2.getLong(iD12));
                int i5 = iD4;
                bookEntity.setWords((int) gVarN2.getLong(i));
                int i6 = iD5;
                bookEntity.setHasReadFinished((int) gVarN2.getLong(i2));
                int i7 = iD15;
                bookEntity.setTime(gVarN2.getLong(i7));
                int i8 = iD16;
                bookEntity.setReadProgressPercent(gVarN2.isNull(i8) ? null : gVarN2.Y(i8));
                int i9 = iD17;
                bookEntity.setTextNumberPositionHistory((int) gVarN2.getLong(i9));
                int i10 = iD18;
                bookEntity.setEpubCover(gVarN2.isNull(i10) ? null : gVarN2.Y(i10));
                int i11 = iD19;
                bookEntity.setAddToShelf(((int) gVarN2.getLong(i11)) != 0);
                int i12 = iD20;
                bookEntity.setAddToLibrary(((int) gVarN2.getLong(i12)) != 0);
                int i13 = iD21;
                bookEntity.setLocalPath(gVarN2.isNull(i13) ? null : gVarN2.Y(i13));
                int i14 = iD22;
                bookEntity.setNasPath(gVarN2.isNull(i14) ? null : gVarN2.Y(i14));
                int i15 = iD23;
                bookEntity.setAddShelfTimeStamp(gVarN2.getLong(i15));
                int i16 = iD24;
                bookEntity.setAddLibraryTimeStamp(gVarN2.getLong(i16));
                int i17 = iD25;
                bookEntity.setAddCacheTimeStamp(gVarN2.getLong(i17));
                int i18 = iD26;
                bookEntity.setShowName(gVarN2.isNull(i18) ? null : gVarN2.Y(i18));
                int i19 = iD27;
                bookEntity.setFileSize(gVarN2.getLong(i19));
                int i20 = iD28;
                bookEntity.setMupdfSizeLevel((int) gVarN2.getLong(i20));
                arrayList2.add(bookEntity);
                iD14 = i2;
                iD15 = i7;
                iD16 = i8;
                iD18 = i10;
                iD20 = i12;
                iD21 = i13;
                iD23 = i15;
                iD24 = i16;
                iD22 = i14;
                iD28 = i20;
                arrayList = arrayList2;
                iD2 = i3;
                iD13 = i;
                iD17 = i9;
                iD19 = i11;
                iD25 = i17;
                iD26 = i18;
                iD4 = i5;
                iD3 = i4;
                iD27 = i19;
                iD5 = i6;
            }
            ArrayList arrayList3 = arrayList;
            gVarN2.close();
            return arrayList3;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object p(int i, String str, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("UPDATE book SET addToLibrary = 0 , addToShelf= 0 , addShelfTimeStamp = 0 , addLibraryTimeStamp = 0 WHERE `index` = ? AND userId = ?");
        try {
            gVarN2.l(1, i);
            if (str == null) {
                gVarN2.G(2);
            } else {
                gVarN2.G2(2, str);
            }
            gVarN2.k2();
            return null;
        } finally {
            gVarN2.close();
        }
    }

    public static /* synthetic */ BookEntity q(String str, String str2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM book WHERE userId = ? AND nasPath = ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            if (str2 == null) {
                gVarN2.G(2);
            } else {
                gVarN2.G2(2, str2);
            }
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "userId");
            int iD3 = androidx.room.util.p.d(gVarN2, "md5Path");
            int iD4 = androidx.room.util.p.d(gVarN2, "name");
            int iD5 = androidx.room.util.p.d(gVarN2, "cover");
            int iD6 = androidx.room.util.p.d(gVarN2, "readNumber");
            int iD7 = androidx.room.util.p.d(gVarN2, "latestReadTimestamp");
            int iD8 = androidx.room.util.p.d(gVarN2, "sourceId");
            int iD9 = androidx.room.util.p.d(gVarN2, "latestReadChapter");
            int iD10 = androidx.room.util.p.d(gVarN2, "latestReadChapterId");
            int iD11 = androidx.room.util.p.d(gVarN2, "latestReadPage");
            int iD12 = androidx.room.util.p.d(gVarN2, "chapterCount");
            int iD13 = androidx.room.util.p.d(gVarN2, "words");
            int iD14 = androidx.room.util.p.d(gVarN2, "hasReadFinished");
            int iD15 = androidx.room.util.p.d(gVarN2, "time");
            int iD16 = androidx.room.util.p.d(gVarN2, "readProgressPercent");
            int iD17 = androidx.room.util.p.d(gVarN2, "textNumberPositionHistory");
            int iD18 = androidx.room.util.p.d(gVarN2, "epubCover");
            int iD19 = androidx.room.util.p.d(gVarN2, "addToShelf");
            int iD20 = androidx.room.util.p.d(gVarN2, "addToLibrary");
            int iD21 = androidx.room.util.p.d(gVarN2, "localPath");
            int iD22 = androidx.room.util.p.d(gVarN2, "nasPath");
            int iD23 = androidx.room.util.p.d(gVarN2, "addShelfTimeStamp");
            int iD24 = androidx.room.util.p.d(gVarN2, "addLibraryTimeStamp");
            int iD25 = androidx.room.util.p.d(gVarN2, "addCacheTimeStamp");
            int iD26 = androidx.room.util.p.d(gVarN2, "showName");
            int iD27 = androidx.room.util.p.d(gVarN2, "fileSize");
            int iD28 = androidx.room.util.p.d(gVarN2, "mupdfSizeLevel");
            BookEntity bookEntity = null;
            if (gVarN2.k2()) {
                BookEntity bookEntity2 = new BookEntity();
                bookEntity2.setIndex((int) gVarN2.getLong(iD));
                bookEntity2.setUserId(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                bookEntity2.setMd5Path(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                bookEntity2.setName(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                bookEntity2.setCover(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                bookEntity2.setReadNumber((int) gVarN2.getLong(iD6));
                bookEntity2.setLatestReadTimestamp(gVarN2.getLong(iD7));
                bookEntity2.setSourceId(gVarN2.isNull(iD8) ? null : gVarN2.Y(iD8));
                bookEntity2.setLatestReadChapter(gVarN2.isNull(iD9) ? null : gVarN2.Y(iD9));
                bookEntity2.setLatestReadChapterId(gVarN2.isNull(iD10) ? null : gVarN2.Y(iD10));
                bookEntity2.setLatestReadPage((int) gVarN2.getLong(iD11));
                bookEntity2.setChapterCount((int) gVarN2.getLong(iD12));
                bookEntity2.setWords((int) gVarN2.getLong(iD13));
                bookEntity2.setHasReadFinished((int) gVarN2.getLong(iD14));
                bookEntity2.setTime(gVarN2.getLong(iD15));
                bookEntity2.setReadProgressPercent(gVarN2.isNull(iD16) ? null : gVarN2.Y(iD16));
                bookEntity2.setTextNumberPositionHistory((int) gVarN2.getLong(iD17));
                bookEntity2.setEpubCover(gVarN2.isNull(iD18) ? null : gVarN2.Y(iD18));
                bookEntity2.setAddToShelf(((int) gVarN2.getLong(iD19)) != 0);
                bookEntity2.setAddToLibrary(((int) gVarN2.getLong(iD20)) != 0);
                bookEntity2.setLocalPath(gVarN2.isNull(iD21) ? null : gVarN2.Y(iD21));
                bookEntity2.setNasPath(gVarN2.isNull(iD22) ? null : gVarN2.Y(iD22));
                bookEntity2.setAddShelfTimeStamp(gVarN2.getLong(iD23));
                bookEntity2.setAddLibraryTimeStamp(gVarN2.getLong(iD24));
                bookEntity2.setAddCacheTimeStamp(gVarN2.getLong(iD25));
                bookEntity2.setShowName(gVarN2.isNull(iD26) ? null : gVarN2.Y(iD26));
                bookEntity2.setFileSize(gVarN2.getLong(iD27));
                bookEntity2.setMupdfSizeLevel((int) gVarN2.getLong(iD28));
                bookEntity = bookEntity2;
            }
            gVarN2.close();
            return bookEntity;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ List r(String str, int i, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM  book  WHERE userId LIKE ? AND addToShelf = 1 ORDER BY addShelfTimeStamp DESC LIMIT ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            gVarN2.l(2, i);
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "userId");
            int iD3 = androidx.room.util.p.d(gVarN2, "md5Path");
            int iD4 = androidx.room.util.p.d(gVarN2, "name");
            int iD5 = androidx.room.util.p.d(gVarN2, "cover");
            int iD6 = androidx.room.util.p.d(gVarN2, "readNumber");
            int iD7 = androidx.room.util.p.d(gVarN2, "latestReadTimestamp");
            int iD8 = androidx.room.util.p.d(gVarN2, "sourceId");
            int iD9 = androidx.room.util.p.d(gVarN2, "latestReadChapter");
            int iD10 = androidx.room.util.p.d(gVarN2, "latestReadChapterId");
            int iD11 = androidx.room.util.p.d(gVarN2, "latestReadPage");
            int iD12 = androidx.room.util.p.d(gVarN2, "chapterCount");
            int iD13 = androidx.room.util.p.d(gVarN2, "words");
            int iD14 = androidx.room.util.p.d(gVarN2, "hasReadFinished");
            int iD15 = androidx.room.util.p.d(gVarN2, "time");
            int iD16 = androidx.room.util.p.d(gVarN2, "readProgressPercent");
            int iD17 = androidx.room.util.p.d(gVarN2, "textNumberPositionHistory");
            int iD18 = androidx.room.util.p.d(gVarN2, "epubCover");
            int iD19 = androidx.room.util.p.d(gVarN2, "addToShelf");
            int iD20 = androidx.room.util.p.d(gVarN2, "addToLibrary");
            int iD21 = androidx.room.util.p.d(gVarN2, "localPath");
            int iD22 = androidx.room.util.p.d(gVarN2, "nasPath");
            int iD23 = androidx.room.util.p.d(gVarN2, "addShelfTimeStamp");
            int iD24 = androidx.room.util.p.d(gVarN2, "addLibraryTimeStamp");
            int iD25 = androidx.room.util.p.d(gVarN2, "addCacheTimeStamp");
            int iD26 = androidx.room.util.p.d(gVarN2, "showName");
            int iD27 = androidx.room.util.p.d(gVarN2, "fileSize");
            int iD28 = androidx.room.util.p.d(gVarN2, "mupdfSizeLevel");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                ArrayList arrayList2 = arrayList;
                BookEntity bookEntity = new BookEntity();
                int i2 = iD13;
                int i3 = iD14;
                bookEntity.setIndex((int) gVarN2.getLong(iD));
                bookEntity.setUserId(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                bookEntity.setMd5Path(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                bookEntity.setName(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                bookEntity.setCover(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                int i4 = iD2;
                int i5 = iD3;
                bookEntity.setReadNumber((int) gVarN2.getLong(iD6));
                bookEntity.setLatestReadTimestamp(gVarN2.getLong(iD7));
                bookEntity.setSourceId(gVarN2.isNull(iD8) ? null : gVarN2.Y(iD8));
                bookEntity.setLatestReadChapter(gVarN2.isNull(iD9) ? null : gVarN2.Y(iD9));
                bookEntity.setLatestReadChapterId(gVarN2.isNull(iD10) ? null : gVarN2.Y(iD10));
                bookEntity.setLatestReadPage((int) gVarN2.getLong(iD11));
                bookEntity.setChapterCount((int) gVarN2.getLong(iD12));
                int i6 = iD4;
                bookEntity.setWords((int) gVarN2.getLong(i2));
                int i7 = iD5;
                bookEntity.setHasReadFinished((int) gVarN2.getLong(i3));
                int i8 = iD15;
                bookEntity.setTime(gVarN2.getLong(i8));
                int i9 = iD16;
                bookEntity.setReadProgressPercent(gVarN2.isNull(i9) ? null : gVarN2.Y(i9));
                int i10 = iD17;
                bookEntity.setTextNumberPositionHistory((int) gVarN2.getLong(i10));
                int i11 = iD18;
                bookEntity.setEpubCover(gVarN2.isNull(i11) ? null : gVarN2.Y(i11));
                int i12 = iD19;
                bookEntity.setAddToShelf(((int) gVarN2.getLong(i12)) != 0);
                int i13 = iD20;
                bookEntity.setAddToLibrary(((int) gVarN2.getLong(i13)) != 0);
                int i14 = iD21;
                bookEntity.setLocalPath(gVarN2.isNull(i14) ? null : gVarN2.Y(i14));
                int i15 = iD22;
                bookEntity.setNasPath(gVarN2.isNull(i15) ? null : gVarN2.Y(i15));
                int i16 = iD23;
                bookEntity.setAddShelfTimeStamp(gVarN2.getLong(i16));
                int i17 = iD24;
                bookEntity.setAddLibraryTimeStamp(gVarN2.getLong(i17));
                int i18 = iD25;
                bookEntity.setAddCacheTimeStamp(gVarN2.getLong(i18));
                int i19 = iD26;
                bookEntity.setShowName(gVarN2.isNull(i19) ? null : gVarN2.Y(i19));
                int i20 = iD27;
                bookEntity.setFileSize(gVarN2.getLong(i20));
                int i21 = iD28;
                bookEntity.setMupdfSizeLevel((int) gVarN2.getLong(i21));
                arrayList2.add(bookEntity);
                iD24 = i17;
                iD22 = i15;
                iD28 = i21;
                arrayList = arrayList2;
                iD2 = i4;
                iD4 = i6;
                iD3 = i5;
                iD13 = i2;
                iD16 = i9;
                iD18 = i11;
                iD20 = i13;
                iD21 = i14;
                iD23 = i16;
                iD14 = i3;
                iD15 = i8;
                iD17 = i10;
                iD19 = i12;
                iD25 = i18;
                iD26 = i19;
                iD27 = i20;
                iD5 = i7;
            }
            ArrayList arrayList3 = arrayList;
            gVarN2.close();
            return arrayList3;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ List s(c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM book");
        try {
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "userId");
            int iD3 = androidx.room.util.p.d(gVarN2, "md5Path");
            int iD4 = androidx.room.util.p.d(gVarN2, "name");
            int iD5 = androidx.room.util.p.d(gVarN2, "cover");
            int iD6 = androidx.room.util.p.d(gVarN2, "readNumber");
            int iD7 = androidx.room.util.p.d(gVarN2, "latestReadTimestamp");
            int iD8 = androidx.room.util.p.d(gVarN2, "sourceId");
            int iD9 = androidx.room.util.p.d(gVarN2, "latestReadChapter");
            int iD10 = androidx.room.util.p.d(gVarN2, "latestReadChapterId");
            int iD11 = androidx.room.util.p.d(gVarN2, "latestReadPage");
            int iD12 = androidx.room.util.p.d(gVarN2, "chapterCount");
            int iD13 = androidx.room.util.p.d(gVarN2, "words");
            int iD14 = androidx.room.util.p.d(gVarN2, "hasReadFinished");
            int iD15 = androidx.room.util.p.d(gVarN2, "time");
            int iD16 = androidx.room.util.p.d(gVarN2, "readProgressPercent");
            int iD17 = androidx.room.util.p.d(gVarN2, "textNumberPositionHistory");
            int iD18 = androidx.room.util.p.d(gVarN2, "epubCover");
            int iD19 = androidx.room.util.p.d(gVarN2, "addToShelf");
            int iD20 = androidx.room.util.p.d(gVarN2, "addToLibrary");
            int iD21 = androidx.room.util.p.d(gVarN2, "localPath");
            int iD22 = androidx.room.util.p.d(gVarN2, "nasPath");
            int iD23 = androidx.room.util.p.d(gVarN2, "addShelfTimeStamp");
            int iD24 = androidx.room.util.p.d(gVarN2, "addLibraryTimeStamp");
            int iD25 = androidx.room.util.p.d(gVarN2, "addCacheTimeStamp");
            int iD26 = androidx.room.util.p.d(gVarN2, "showName");
            int iD27 = androidx.room.util.p.d(gVarN2, "fileSize");
            int iD28 = androidx.room.util.p.d(gVarN2, "mupdfSizeLevel");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                ArrayList arrayList2 = arrayList;
                BookEntity bookEntity = new BookEntity();
                int i = iD13;
                int i2 = iD14;
                bookEntity.setIndex((int) gVarN2.getLong(iD));
                bookEntity.setUserId(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                bookEntity.setMd5Path(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                bookEntity.setName(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                bookEntity.setCover(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                bookEntity.setReadNumber((int) gVarN2.getLong(iD6));
                bookEntity.setLatestReadTimestamp(gVarN2.getLong(iD7));
                bookEntity.setSourceId(gVarN2.isNull(iD8) ? null : gVarN2.Y(iD8));
                bookEntity.setLatestReadChapter(gVarN2.isNull(iD9) ? null : gVarN2.Y(iD9));
                bookEntity.setLatestReadChapterId(gVarN2.isNull(iD10) ? null : gVarN2.Y(iD10));
                bookEntity.setLatestReadPage((int) gVarN2.getLong(iD11));
                bookEntity.setChapterCount((int) gVarN2.getLong(iD12));
                int i3 = iD2;
                int i4 = iD3;
                bookEntity.setWords((int) gVarN2.getLong(i));
                int i5 = iD4;
                bookEntity.setHasReadFinished((int) gVarN2.getLong(i2));
                int i6 = iD15;
                int i7 = iD5;
                bookEntity.setTime(gVarN2.getLong(i6));
                int i8 = iD16;
                bookEntity.setReadProgressPercent(gVarN2.isNull(i8) ? null : gVarN2.Y(i8));
                int i9 = iD17;
                bookEntity.setTextNumberPositionHistory((int) gVarN2.getLong(i9));
                int i10 = iD18;
                bookEntity.setEpubCover(gVarN2.isNull(i10) ? null : gVarN2.Y(i10));
                int i11 = iD19;
                bookEntity.setAddToShelf(((int) gVarN2.getLong(i11)) != 0);
                int i12 = iD20;
                int i13 = iD6;
                bookEntity.setAddToLibrary(((int) gVarN2.getLong(i12)) != 0);
                int i14 = iD21;
                bookEntity.setLocalPath(gVarN2.isNull(i14) ? null : gVarN2.Y(i14));
                int i15 = iD22;
                bookEntity.setNasPath(gVarN2.isNull(i15) ? null : gVarN2.Y(i15));
                int i16 = iD23;
                bookEntity.setAddShelfTimeStamp(gVarN2.getLong(i16));
                int i17 = iD24;
                bookEntity.setAddLibraryTimeStamp(gVarN2.getLong(i17));
                int i18 = iD25;
                bookEntity.setAddCacheTimeStamp(gVarN2.getLong(i18));
                int i19 = iD26;
                bookEntity.setShowName(gVarN2.isNull(i19) ? null : gVarN2.Y(i19));
                int i20 = iD27;
                bookEntity.setFileSize(gVarN2.getLong(i20));
                int i21 = iD28;
                bookEntity.setMupdfSizeLevel((int) gVarN2.getLong(i21));
                arrayList2.add(bookEntity);
                iD13 = i;
                iD14 = i2;
                iD16 = i8;
                iD18 = i10;
                iD21 = i14;
                iD25 = i18;
                iD4 = i5;
                iD27 = i20;
                iD5 = i7;
                iD15 = i6;
                iD17 = i9;
                iD19 = i11;
                iD23 = i16;
                iD = iD;
                iD22 = i15;
                iD6 = i13;
                iD20 = i12;
                iD24 = i17;
                iD26 = i19;
                iD28 = i21;
                iD2 = i3;
                arrayList = arrayList2;
                iD3 = i4;
            }
            return arrayList;
        } finally {
            gVarN2.close();
        }
    }

    public static /* synthetic */ Integer t(String str, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM book WHERE userId = ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            gVarN2.k2();
            Integer numValueOf = Integer.valueOf(androidx.room.util.n.b(cVar));
            gVarN2.close();
            return numValueOf;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ List u(String str, int i, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM book WHERE `index` IN (SELECT bookIndex FROM categoryBookRelate WHERE userId = ? AND categoryIndex = ?)");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            gVarN2.l(2, i);
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "userId");
            int iD3 = androidx.room.util.p.d(gVarN2, "md5Path");
            int iD4 = androidx.room.util.p.d(gVarN2, "name");
            int iD5 = androidx.room.util.p.d(gVarN2, "cover");
            int iD6 = androidx.room.util.p.d(gVarN2, "readNumber");
            int iD7 = androidx.room.util.p.d(gVarN2, "latestReadTimestamp");
            int iD8 = androidx.room.util.p.d(gVarN2, "sourceId");
            int iD9 = androidx.room.util.p.d(gVarN2, "latestReadChapter");
            int iD10 = androidx.room.util.p.d(gVarN2, "latestReadChapterId");
            int iD11 = androidx.room.util.p.d(gVarN2, "latestReadPage");
            int iD12 = androidx.room.util.p.d(gVarN2, "chapterCount");
            int iD13 = androidx.room.util.p.d(gVarN2, "words");
            int iD14 = androidx.room.util.p.d(gVarN2, "hasReadFinished");
            int iD15 = androidx.room.util.p.d(gVarN2, "time");
            int iD16 = androidx.room.util.p.d(gVarN2, "readProgressPercent");
            int iD17 = androidx.room.util.p.d(gVarN2, "textNumberPositionHistory");
            int iD18 = androidx.room.util.p.d(gVarN2, "epubCover");
            int iD19 = androidx.room.util.p.d(gVarN2, "addToShelf");
            int iD20 = androidx.room.util.p.d(gVarN2, "addToLibrary");
            int iD21 = androidx.room.util.p.d(gVarN2, "localPath");
            int iD22 = androidx.room.util.p.d(gVarN2, "nasPath");
            int iD23 = androidx.room.util.p.d(gVarN2, "addShelfTimeStamp");
            int iD24 = androidx.room.util.p.d(gVarN2, "addLibraryTimeStamp");
            int iD25 = androidx.room.util.p.d(gVarN2, "addCacheTimeStamp");
            int iD26 = androidx.room.util.p.d(gVarN2, "showName");
            int iD27 = androidx.room.util.p.d(gVarN2, "fileSize");
            int iD28 = androidx.room.util.p.d(gVarN2, "mupdfSizeLevel");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                ArrayList arrayList2 = arrayList;
                BookEntity bookEntity = new BookEntity();
                int i2 = iD13;
                int i3 = iD14;
                bookEntity.setIndex((int) gVarN2.getLong(iD));
                bookEntity.setUserId(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                bookEntity.setMd5Path(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                bookEntity.setName(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                bookEntity.setCover(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                int i4 = iD2;
                int i5 = iD3;
                bookEntity.setReadNumber((int) gVarN2.getLong(iD6));
                bookEntity.setLatestReadTimestamp(gVarN2.getLong(iD7));
                bookEntity.setSourceId(gVarN2.isNull(iD8) ? null : gVarN2.Y(iD8));
                bookEntity.setLatestReadChapter(gVarN2.isNull(iD9) ? null : gVarN2.Y(iD9));
                bookEntity.setLatestReadChapterId(gVarN2.isNull(iD10) ? null : gVarN2.Y(iD10));
                bookEntity.setLatestReadPage((int) gVarN2.getLong(iD11));
                bookEntity.setChapterCount((int) gVarN2.getLong(iD12));
                int i6 = iD4;
                bookEntity.setWords((int) gVarN2.getLong(i2));
                int i7 = iD5;
                bookEntity.setHasReadFinished((int) gVarN2.getLong(i3));
                int i8 = iD15;
                bookEntity.setTime(gVarN2.getLong(i8));
                int i9 = iD16;
                bookEntity.setReadProgressPercent(gVarN2.isNull(i9) ? null : gVarN2.Y(i9));
                int i10 = iD17;
                bookEntity.setTextNumberPositionHistory((int) gVarN2.getLong(i10));
                int i11 = iD18;
                bookEntity.setEpubCover(gVarN2.isNull(i11) ? null : gVarN2.Y(i11));
                int i12 = iD19;
                bookEntity.setAddToShelf(((int) gVarN2.getLong(i12)) != 0);
                int i13 = iD20;
                bookEntity.setAddToLibrary(((int) gVarN2.getLong(i13)) != 0);
                int i14 = iD21;
                bookEntity.setLocalPath(gVarN2.isNull(i14) ? null : gVarN2.Y(i14));
                int i15 = iD22;
                bookEntity.setNasPath(gVarN2.isNull(i15) ? null : gVarN2.Y(i15));
                int i16 = iD23;
                bookEntity.setAddShelfTimeStamp(gVarN2.getLong(i16));
                int i17 = iD24;
                bookEntity.setAddLibraryTimeStamp(gVarN2.getLong(i17));
                int i18 = iD25;
                bookEntity.setAddCacheTimeStamp(gVarN2.getLong(i18));
                int i19 = iD26;
                bookEntity.setShowName(gVarN2.isNull(i19) ? null : gVarN2.Y(i19));
                int i20 = iD27;
                bookEntity.setFileSize(gVarN2.getLong(i20));
                int i21 = iD28;
                bookEntity.setMupdfSizeLevel((int) gVarN2.getLong(i21));
                arrayList2.add(bookEntity);
                iD24 = i17;
                iD22 = i15;
                iD28 = i21;
                arrayList = arrayList2;
                iD2 = i4;
                iD4 = i6;
                iD3 = i5;
                iD13 = i2;
                iD16 = i9;
                iD18 = i11;
                iD20 = i13;
                iD21 = i14;
                iD23 = i16;
                iD14 = i3;
                iD15 = i8;
                iD17 = i10;
                iD19 = i12;
                iD25 = i18;
                iD26 = i19;
                iD27 = i20;
                iD5 = i7;
            }
            ArrayList arrayList3 = arrayList;
            gVarN2.close();
            return arrayList3;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ BookEntity v(String str, int i, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM book WHERE userId = ? AND `index` = ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            gVarN2.l(2, i);
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "userId");
            int iD3 = androidx.room.util.p.d(gVarN2, "md5Path");
            int iD4 = androidx.room.util.p.d(gVarN2, "name");
            int iD5 = androidx.room.util.p.d(gVarN2, "cover");
            int iD6 = androidx.room.util.p.d(gVarN2, "readNumber");
            int iD7 = androidx.room.util.p.d(gVarN2, "latestReadTimestamp");
            int iD8 = androidx.room.util.p.d(gVarN2, "sourceId");
            int iD9 = androidx.room.util.p.d(gVarN2, "latestReadChapter");
            int iD10 = androidx.room.util.p.d(gVarN2, "latestReadChapterId");
            int iD11 = androidx.room.util.p.d(gVarN2, "latestReadPage");
            int iD12 = androidx.room.util.p.d(gVarN2, "chapterCount");
            int iD13 = androidx.room.util.p.d(gVarN2, "words");
            int iD14 = androidx.room.util.p.d(gVarN2, "hasReadFinished");
            int iD15 = androidx.room.util.p.d(gVarN2, "time");
            int iD16 = androidx.room.util.p.d(gVarN2, "readProgressPercent");
            int iD17 = androidx.room.util.p.d(gVarN2, "textNumberPositionHistory");
            int iD18 = androidx.room.util.p.d(gVarN2, "epubCover");
            int iD19 = androidx.room.util.p.d(gVarN2, "addToShelf");
            int iD20 = androidx.room.util.p.d(gVarN2, "addToLibrary");
            int iD21 = androidx.room.util.p.d(gVarN2, "localPath");
            int iD22 = androidx.room.util.p.d(gVarN2, "nasPath");
            int iD23 = androidx.room.util.p.d(gVarN2, "addShelfTimeStamp");
            int iD24 = androidx.room.util.p.d(gVarN2, "addLibraryTimeStamp");
            int iD25 = androidx.room.util.p.d(gVarN2, "addCacheTimeStamp");
            int iD26 = androidx.room.util.p.d(gVarN2, "showName");
            int iD27 = androidx.room.util.p.d(gVarN2, "fileSize");
            int iD28 = androidx.room.util.p.d(gVarN2, "mupdfSizeLevel");
            BookEntity bookEntity = null;
            if (gVarN2.k2()) {
                BookEntity bookEntity2 = new BookEntity();
                bookEntity2.setIndex((int) gVarN2.getLong(iD));
                bookEntity2.setUserId(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                bookEntity2.setMd5Path(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                bookEntity2.setName(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                bookEntity2.setCover(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                bookEntity2.setReadNumber((int) gVarN2.getLong(iD6));
                bookEntity2.setLatestReadTimestamp(gVarN2.getLong(iD7));
                bookEntity2.setSourceId(gVarN2.isNull(iD8) ? null : gVarN2.Y(iD8));
                bookEntity2.setLatestReadChapter(gVarN2.isNull(iD9) ? null : gVarN2.Y(iD9));
                bookEntity2.setLatestReadChapterId(gVarN2.isNull(iD10) ? null : gVarN2.Y(iD10));
                bookEntity2.setLatestReadPage((int) gVarN2.getLong(iD11));
                bookEntity2.setChapterCount((int) gVarN2.getLong(iD12));
                bookEntity2.setWords((int) gVarN2.getLong(iD13));
                bookEntity2.setHasReadFinished((int) gVarN2.getLong(iD14));
                bookEntity2.setTime(gVarN2.getLong(iD15));
                bookEntity2.setReadProgressPercent(gVarN2.isNull(iD16) ? null : gVarN2.Y(iD16));
                bookEntity2.setTextNumberPositionHistory((int) gVarN2.getLong(iD17));
                bookEntity2.setEpubCover(gVarN2.isNull(iD18) ? null : gVarN2.Y(iD18));
                bookEntity2.setAddToShelf(((int) gVarN2.getLong(iD19)) != 0);
                bookEntity2.setAddToLibrary(((int) gVarN2.getLong(iD20)) != 0);
                bookEntity2.setLocalPath(gVarN2.isNull(iD21) ? null : gVarN2.Y(iD21));
                bookEntity2.setNasPath(gVarN2.isNull(iD22) ? null : gVarN2.Y(iD22));
                bookEntity2.setAddShelfTimeStamp(gVarN2.getLong(iD23));
                bookEntity2.setAddLibraryTimeStamp(gVarN2.getLong(iD24));
                bookEntity2.setAddCacheTimeStamp(gVarN2.getLong(iD25));
                bookEntity2.setShowName(gVarN2.isNull(iD26) ? null : gVarN2.Y(iD26));
                bookEntity2.setFileSize(gVarN2.getLong(iD27));
                bookEntity2.setMupdfSizeLevel((int) gVarN2.getLong(iD28));
                bookEntity = bookEntity2;
            }
            gVarN2.close();
            return bookEntity;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ BookEntity w(String str, String str2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM book WHERE userId LIKE ? AND nasPath = ? ORDER BY addCacheTimeStamp DESC");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            if (str2 == null) {
                gVarN2.G(2);
            } else {
                gVarN2.G2(2, str2);
            }
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "userId");
            int iD3 = androidx.room.util.p.d(gVarN2, "md5Path");
            int iD4 = androidx.room.util.p.d(gVarN2, "name");
            int iD5 = androidx.room.util.p.d(gVarN2, "cover");
            int iD6 = androidx.room.util.p.d(gVarN2, "readNumber");
            int iD7 = androidx.room.util.p.d(gVarN2, "latestReadTimestamp");
            int iD8 = androidx.room.util.p.d(gVarN2, "sourceId");
            int iD9 = androidx.room.util.p.d(gVarN2, "latestReadChapter");
            int iD10 = androidx.room.util.p.d(gVarN2, "latestReadChapterId");
            int iD11 = androidx.room.util.p.d(gVarN2, "latestReadPage");
            int iD12 = androidx.room.util.p.d(gVarN2, "chapterCount");
            int iD13 = androidx.room.util.p.d(gVarN2, "words");
            int iD14 = androidx.room.util.p.d(gVarN2, "hasReadFinished");
            int iD15 = androidx.room.util.p.d(gVarN2, "time");
            int iD16 = androidx.room.util.p.d(gVarN2, "readProgressPercent");
            int iD17 = androidx.room.util.p.d(gVarN2, "textNumberPositionHistory");
            int iD18 = androidx.room.util.p.d(gVarN2, "epubCover");
            int iD19 = androidx.room.util.p.d(gVarN2, "addToShelf");
            int iD20 = androidx.room.util.p.d(gVarN2, "addToLibrary");
            int iD21 = androidx.room.util.p.d(gVarN2, "localPath");
            int iD22 = androidx.room.util.p.d(gVarN2, "nasPath");
            int iD23 = androidx.room.util.p.d(gVarN2, "addShelfTimeStamp");
            int iD24 = androidx.room.util.p.d(gVarN2, "addLibraryTimeStamp");
            int iD25 = androidx.room.util.p.d(gVarN2, "addCacheTimeStamp");
            int iD26 = androidx.room.util.p.d(gVarN2, "showName");
            int iD27 = androidx.room.util.p.d(gVarN2, "fileSize");
            int iD28 = androidx.room.util.p.d(gVarN2, "mupdfSizeLevel");
            BookEntity bookEntity = null;
            if (gVarN2.k2()) {
                BookEntity bookEntity2 = new BookEntity();
                bookEntity2.setIndex((int) gVarN2.getLong(iD));
                bookEntity2.setUserId(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                bookEntity2.setMd5Path(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                bookEntity2.setName(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                bookEntity2.setCover(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                bookEntity2.setReadNumber((int) gVarN2.getLong(iD6));
                bookEntity2.setLatestReadTimestamp(gVarN2.getLong(iD7));
                bookEntity2.setSourceId(gVarN2.isNull(iD8) ? null : gVarN2.Y(iD8));
                bookEntity2.setLatestReadChapter(gVarN2.isNull(iD9) ? null : gVarN2.Y(iD9));
                bookEntity2.setLatestReadChapterId(gVarN2.isNull(iD10) ? null : gVarN2.Y(iD10));
                bookEntity2.setLatestReadPage((int) gVarN2.getLong(iD11));
                bookEntity2.setChapterCount((int) gVarN2.getLong(iD12));
                bookEntity2.setWords((int) gVarN2.getLong(iD13));
                bookEntity2.setHasReadFinished((int) gVarN2.getLong(iD14));
                bookEntity2.setTime(gVarN2.getLong(iD15));
                bookEntity2.setReadProgressPercent(gVarN2.isNull(iD16) ? null : gVarN2.Y(iD16));
                bookEntity2.setTextNumberPositionHistory((int) gVarN2.getLong(iD17));
                bookEntity2.setEpubCover(gVarN2.isNull(iD18) ? null : gVarN2.Y(iD18));
                bookEntity2.setAddToShelf(((int) gVarN2.getLong(iD19)) != 0);
                bookEntity2.setAddToLibrary(((int) gVarN2.getLong(iD20)) != 0);
                bookEntity2.setLocalPath(gVarN2.isNull(iD21) ? null : gVarN2.Y(iD21));
                bookEntity2.setNasPath(gVarN2.isNull(iD22) ? null : gVarN2.Y(iD22));
                bookEntity2.setAddShelfTimeStamp(gVarN2.getLong(iD23));
                bookEntity2.setAddLibraryTimeStamp(gVarN2.getLong(iD24));
                bookEntity2.setAddCacheTimeStamp(gVarN2.getLong(iD25));
                bookEntity2.setShowName(gVarN2.isNull(iD26) ? null : gVarN2.Y(iD26));
                bookEntity2.setFileSize(gVarN2.getLong(iD27));
                bookEntity2.setMupdfSizeLevel((int) gVarN2.getLong(iD28));
                bookEntity = bookEntity2;
            }
            gVarN2.close();
            return bookEntity;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ List y(String str, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM book WHERE userId LIKE ? AND addToShelf = 1 ORDER BY addShelfTimeStamp DESC");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "userId");
            int iD3 = androidx.room.util.p.d(gVarN2, "md5Path");
            int iD4 = androidx.room.util.p.d(gVarN2, "name");
            int iD5 = androidx.room.util.p.d(gVarN2, "cover");
            int iD6 = androidx.room.util.p.d(gVarN2, "readNumber");
            int iD7 = androidx.room.util.p.d(gVarN2, "latestReadTimestamp");
            int iD8 = androidx.room.util.p.d(gVarN2, "sourceId");
            int iD9 = androidx.room.util.p.d(gVarN2, "latestReadChapter");
            int iD10 = androidx.room.util.p.d(gVarN2, "latestReadChapterId");
            int iD11 = androidx.room.util.p.d(gVarN2, "latestReadPage");
            int iD12 = androidx.room.util.p.d(gVarN2, "chapterCount");
            int iD13 = androidx.room.util.p.d(gVarN2, "words");
            int iD14 = androidx.room.util.p.d(gVarN2, "hasReadFinished");
            int iD15 = androidx.room.util.p.d(gVarN2, "time");
            int iD16 = androidx.room.util.p.d(gVarN2, "readProgressPercent");
            int iD17 = androidx.room.util.p.d(gVarN2, "textNumberPositionHistory");
            int iD18 = androidx.room.util.p.d(gVarN2, "epubCover");
            int iD19 = androidx.room.util.p.d(gVarN2, "addToShelf");
            int iD20 = androidx.room.util.p.d(gVarN2, "addToLibrary");
            int iD21 = androidx.room.util.p.d(gVarN2, "localPath");
            int iD22 = androidx.room.util.p.d(gVarN2, "nasPath");
            int iD23 = androidx.room.util.p.d(gVarN2, "addShelfTimeStamp");
            int iD24 = androidx.room.util.p.d(gVarN2, "addLibraryTimeStamp");
            int iD25 = androidx.room.util.p.d(gVarN2, "addCacheTimeStamp");
            int iD26 = androidx.room.util.p.d(gVarN2, "showName");
            int iD27 = androidx.room.util.p.d(gVarN2, "fileSize");
            int iD28 = androidx.room.util.p.d(gVarN2, "mupdfSizeLevel");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                ArrayList arrayList2 = arrayList;
                BookEntity bookEntity = new BookEntity();
                int i = iD13;
                int i2 = iD14;
                bookEntity.setIndex((int) gVarN2.getLong(iD));
                bookEntity.setUserId(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                bookEntity.setMd5Path(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                bookEntity.setName(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                bookEntity.setCover(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                int i3 = iD2;
                int i4 = iD3;
                bookEntity.setReadNumber((int) gVarN2.getLong(iD6));
                bookEntity.setLatestReadTimestamp(gVarN2.getLong(iD7));
                bookEntity.setSourceId(gVarN2.isNull(iD8) ? null : gVarN2.Y(iD8));
                bookEntity.setLatestReadChapter(gVarN2.isNull(iD9) ? null : gVarN2.Y(iD9));
                bookEntity.setLatestReadChapterId(gVarN2.isNull(iD10) ? null : gVarN2.Y(iD10));
                bookEntity.setLatestReadPage((int) gVarN2.getLong(iD11));
                bookEntity.setChapterCount((int) gVarN2.getLong(iD12));
                int i5 = iD4;
                bookEntity.setWords((int) gVarN2.getLong(i));
                int i6 = iD5;
                bookEntity.setHasReadFinished((int) gVarN2.getLong(i2));
                int i7 = iD15;
                bookEntity.setTime(gVarN2.getLong(i7));
                int i8 = iD16;
                bookEntity.setReadProgressPercent(gVarN2.isNull(i8) ? null : gVarN2.Y(i8));
                int i9 = iD17;
                bookEntity.setTextNumberPositionHistory((int) gVarN2.getLong(i9));
                int i10 = iD18;
                bookEntity.setEpubCover(gVarN2.isNull(i10) ? null : gVarN2.Y(i10));
                int i11 = iD19;
                bookEntity.setAddToShelf(((int) gVarN2.getLong(i11)) != 0);
                int i12 = iD20;
                bookEntity.setAddToLibrary(((int) gVarN2.getLong(i12)) != 0);
                int i13 = iD21;
                bookEntity.setLocalPath(gVarN2.isNull(i13) ? null : gVarN2.Y(i13));
                int i14 = iD22;
                bookEntity.setNasPath(gVarN2.isNull(i14) ? null : gVarN2.Y(i14));
                int i15 = iD23;
                bookEntity.setAddShelfTimeStamp(gVarN2.getLong(i15));
                int i16 = iD24;
                bookEntity.setAddLibraryTimeStamp(gVarN2.getLong(i16));
                int i17 = iD25;
                bookEntity.setAddCacheTimeStamp(gVarN2.getLong(i17));
                int i18 = iD26;
                bookEntity.setShowName(gVarN2.isNull(i18) ? null : gVarN2.Y(i18));
                int i19 = iD27;
                bookEntity.setFileSize(gVarN2.getLong(i19));
                int i20 = iD28;
                bookEntity.setMupdfSizeLevel((int) gVarN2.getLong(i20));
                arrayList2.add(bookEntity);
                iD14 = i2;
                iD15 = i7;
                iD16 = i8;
                iD18 = i10;
                iD20 = i12;
                iD21 = i13;
                iD23 = i15;
                iD24 = i16;
                iD22 = i14;
                iD28 = i20;
                arrayList = arrayList2;
                iD2 = i3;
                iD13 = i;
                iD17 = i9;
                iD19 = i11;
                iD25 = i17;
                iD26 = i18;
                iD4 = i5;
                iD3 = i4;
                iD27 = i19;
                iD5 = i6;
            }
            ArrayList arrayList3 = arrayList;
            gVarN2.close();
            return arrayList3;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object z(z zVar, List list, c4.c cVar) {
        zVar.b.insert(cVar, list);
        return null;
    }

    @Override // com.zentraedi.outreader.database.k
    public int a(final String userId) {
        return ((Integer) androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.t(userId, (c4.c) obj);
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.k
    public List<BookEntity> b() {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.s((c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.k
    public void c(final List<BookEntity> bookEntities) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.z(this.a, bookEntities, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.k
    public List<BookEntity> d(final String userId) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.o(userId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.k
    public BookEntity e(final String userId, final String nasPath) {
        return (BookEntity) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.q(userId, nasPath, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.k
    public void f(final BookEntity... bookEntities) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.B(this.a, bookEntities, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.k
    public void g(final String userId, final int bookIndex) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.p(bookIndex, userId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.k
    public List<BookEntity> h(final String userId) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.y(userId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.k
    public int i(final BookEntity... entities) {
        return ((Integer) androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(this.a.c.e((c4.c) obj, entities));
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.k
    public BookEntity j(final String userId, final int bookIndex) {
        return (BookEntity) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.v(userId, bookIndex, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.k
    public BookEntity k(final String userId, final String nasPath) {
        return (BookEntity) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.w(userId, nasPath, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.k
    public List<BookEntity> l(final String userId, final int size) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.A(userId, size, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.k
    public List<BookEntity> m(final String userId, final int categoryId) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.u(userId, categoryId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.k
    public List<BookEntity> n(final String userId, final int size) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.r(userId, size, (c4.c) obj);
            }
        });
    }
}
