package com.zentraedi.outreader.database;

import androidx.room.RoomDatabase;
import com.zentraedi.outreader.model.offline.OfflineBookEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class i2 implements t1 {
    private final RoomDatabase a;
    private final androidx.room.y<OfflineBookEntity> b = new a();
    private final androidx.room.w<OfflineBookEntity> c = new b();
    private final androidx.room.w<OfflineBookEntity> d = new c();

    class a extends androidx.room.y<OfflineBookEntity> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.n0 c4.g gVar, @androidx.annotation.n0 OfflineBookEntity offlineBookEntity) {
            if (offlineBookEntity.getNasPath() == null) {
                gVar.G(1);
            } else {
                gVar.G2(1, offlineBookEntity.getNasPath());
            }
            if (offlineBookEntity.getUsername() == null) {
                gVar.G(2);
            } else {
                gVar.G2(2, offlineBookEntity.getUsername());
            }
            if (offlineBookEntity.getCategoryIndex() == null) {
                gVar.G(3);
            } else {
                gVar.G2(3, offlineBookEntity.getCategoryIndex());
            }
            if (offlineBookEntity.getNasId() == null) {
                gVar.G(4);
            } else {
                gVar.G2(4, offlineBookEntity.getNasId());
            }
            if (offlineBookEntity.getBookId() == null) {
                gVar.G(5);
            } else {
                gVar.G2(5, offlineBookEntity.getBookId());
            }
            if (offlineBookEntity.getBookName() == null) {
                gVar.G(6);
            } else {
                gVar.G2(6, offlineBookEntity.getBookName());
            }
            gVar.l(7, offlineBookEntity.getAddToShelf());
            gVar.l(8, offlineBookEntity.getAddShelfTimeStamp());
            gVar.l(9, offlineBookEntity.getAddLibraryTimeStamp());
            gVar.l(10, offlineBookEntity.getLastModifyTimeStamp());
            gVar.l(11, offlineBookEntity.getFileSize());
            gVar.l(12, offlineBookEntity.getTextSize());
            gVar.l(13, offlineBookEntity.getLatestReadTimestamp());
            if (offlineBookEntity.getLatestReadChapter() == null) {
                gVar.G(14);
            } else {
                gVar.G2(14, offlineBookEntity.getLatestReadChapter());
            }
            if (offlineBookEntity.getLatestReadChapterId() == null) {
                gVar.G(15);
            } else {
                gVar.G2(15, offlineBookEntity.getLatestReadChapterId());
            }
            gVar.l(16, offlineBookEntity.getLatestReadPage());
            gVar.l(17, offlineBookEntity.getChapterCount());
            if (offlineBookEntity.getReadProgressPercent() == null) {
                gVar.G(18);
            } else {
                gVar.G2(18, offlineBookEntity.getReadProgressPercent());
            }
            gVar.l(19, offlineBookEntity.getTextNumberPositionHistory());
            gVar.l(20, offlineBookEntity.getReadOnOfflineMode() ? 1L : 0L);
            if (offlineBookEntity.getReadProgressExt() == null) {
                gVar.G(21);
            } else {
                gVar.G2(21, offlineBookEntity.getReadProgressExt());
            }
        }

        @androidx.annotation.n0
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `offlineBook` (`nasPath`,`username`,`categoryIndex`,`nasId`,`bookId`,`bookName`,`addToShelf`,`addShelfTimeStamp`,`addLibraryTimeStamp`,`lastModifyTimeStamp`,`fileSize`,`textSize`,`latestReadTimestamp`,`latestReadChapter`,`latestReadChapterId`,`latestReadPage`,`chapterCount`,`readProgressPercent`,`textNumberPositionHistory`,`readOnOfflineMode`,`readProgressExt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    class b extends androidx.room.w<OfflineBookEntity> {
        b() {
        }

        @androidx.annotation.n0
        protected String b() {
            return "DELETE FROM `offlineBook` WHERE `nasPath` = ? AND `username` = ? AND `categoryIndex` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final OfflineBookEntity entity) {
            if (entity.getNasPath() == null) {
                statement.G(1);
            } else {
                statement.G2(1, entity.getNasPath());
            }
            if (entity.getUsername() == null) {
                statement.G(2);
            } else {
                statement.G2(2, entity.getUsername());
            }
            if (entity.getCategoryIndex() == null) {
                statement.G(3);
            } else {
                statement.G2(3, entity.getCategoryIndex());
            }
        }
    }

    class c extends androidx.room.w<OfflineBookEntity> {
        c() {
        }

        @androidx.annotation.n0
        protected String b() {
            return "UPDATE OR ABORT `offlineBook` SET `nasPath` = ?,`username` = ?,`categoryIndex` = ?,`nasId` = ?,`bookId` = ?,`bookName` = ?,`addToShelf` = ?,`addShelfTimeStamp` = ?,`addLibraryTimeStamp` = ?,`lastModifyTimeStamp` = ?,`fileSize` = ?,`textSize` = ?,`latestReadTimestamp` = ?,`latestReadChapter` = ?,`latestReadChapterId` = ?,`latestReadPage` = ?,`chapterCount` = ?,`readProgressPercent` = ?,`textNumberPositionHistory` = ?,`readOnOfflineMode` = ?,`readProgressExt` = ? WHERE `nasPath` = ? AND `username` = ? AND `categoryIndex` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.n0 c4.g gVar, @androidx.annotation.n0 OfflineBookEntity offlineBookEntity) {
            if (offlineBookEntity.getNasPath() == null) {
                gVar.G(1);
            } else {
                gVar.G2(1, offlineBookEntity.getNasPath());
            }
            if (offlineBookEntity.getUsername() == null) {
                gVar.G(2);
            } else {
                gVar.G2(2, offlineBookEntity.getUsername());
            }
            if (offlineBookEntity.getCategoryIndex() == null) {
                gVar.G(3);
            } else {
                gVar.G2(3, offlineBookEntity.getCategoryIndex());
            }
            if (offlineBookEntity.getNasId() == null) {
                gVar.G(4);
            } else {
                gVar.G2(4, offlineBookEntity.getNasId());
            }
            if (offlineBookEntity.getBookId() == null) {
                gVar.G(5);
            } else {
                gVar.G2(5, offlineBookEntity.getBookId());
            }
            if (offlineBookEntity.getBookName() == null) {
                gVar.G(6);
            } else {
                gVar.G2(6, offlineBookEntity.getBookName());
            }
            gVar.l(7, offlineBookEntity.getAddToShelf());
            gVar.l(8, offlineBookEntity.getAddShelfTimeStamp());
            gVar.l(9, offlineBookEntity.getAddLibraryTimeStamp());
            gVar.l(10, offlineBookEntity.getLastModifyTimeStamp());
            gVar.l(11, offlineBookEntity.getFileSize());
            gVar.l(12, offlineBookEntity.getTextSize());
            gVar.l(13, offlineBookEntity.getLatestReadTimestamp());
            if (offlineBookEntity.getLatestReadChapter() == null) {
                gVar.G(14);
            } else {
                gVar.G2(14, offlineBookEntity.getLatestReadChapter());
            }
            if (offlineBookEntity.getLatestReadChapterId() == null) {
                gVar.G(15);
            } else {
                gVar.G2(15, offlineBookEntity.getLatestReadChapterId());
            }
            gVar.l(16, offlineBookEntity.getLatestReadPage());
            gVar.l(17, offlineBookEntity.getChapterCount());
            if (offlineBookEntity.getReadProgressPercent() == null) {
                gVar.G(18);
            } else {
                gVar.G2(18, offlineBookEntity.getReadProgressPercent());
            }
            gVar.l(19, offlineBookEntity.getTextNumberPositionHistory());
            gVar.l(20, offlineBookEntity.getReadOnOfflineMode() ? 1L : 0L);
            if (offlineBookEntity.getReadProgressExt() == null) {
                gVar.G(21);
            } else {
                gVar.G2(21, offlineBookEntity.getReadProgressExt());
            }
            if (offlineBookEntity.getNasPath() == null) {
                gVar.G(22);
            } else {
                gVar.G2(22, offlineBookEntity.getNasPath());
            }
            if (offlineBookEntity.getUsername() == null) {
                gVar.G(23);
            } else {
                gVar.G2(23, offlineBookEntity.getUsername());
            }
            if (offlineBookEntity.getCategoryIndex() == null) {
                gVar.G(24);
            } else {
                gVar.G2(24, offlineBookEntity.getCategoryIndex());
            }
        }
    }

    public i2(@androidx.annotation.n0 final RoomDatabase __db) {
        this.a = __db;
    }

    public static /* synthetic */ List A(String str, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM offlineBook WHERE username LIKE ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            int iD = androidx.room.util.p.d(gVarN2, "nasPath");
            int iD2 = androidx.room.util.p.d(gVarN2, "username");
            int iD3 = androidx.room.util.p.d(gVarN2, "categoryIndex");
            int iD4 = androidx.room.util.p.d(gVarN2, "nasId");
            int iD5 = androidx.room.util.p.d(gVarN2, "bookId");
            int iD6 = androidx.room.util.p.d(gVarN2, "bookName");
            int iD7 = androidx.room.util.p.d(gVarN2, "addToShelf");
            int iD8 = androidx.room.util.p.d(gVarN2, "addShelfTimeStamp");
            int iD9 = androidx.room.util.p.d(gVarN2, "addLibraryTimeStamp");
            int iD10 = androidx.room.util.p.d(gVarN2, "lastModifyTimeStamp");
            int iD11 = androidx.room.util.p.d(gVarN2, "fileSize");
            int iD12 = androidx.room.util.p.d(gVarN2, "textSize");
            int iD13 = androidx.room.util.p.d(gVarN2, "latestReadTimestamp");
            int iD14 = androidx.room.util.p.d(gVarN2, "latestReadChapter");
            int iD15 = androidx.room.util.p.d(gVarN2, "latestReadChapterId");
            int iD16 = androidx.room.util.p.d(gVarN2, "latestReadPage");
            int iD17 = androidx.room.util.p.d(gVarN2, "chapterCount");
            int iD18 = androidx.room.util.p.d(gVarN2, "readProgressPercent");
            int iD19 = androidx.room.util.p.d(gVarN2, "textNumberPositionHistory");
            int iD20 = androidx.room.util.p.d(gVarN2, "readOnOfflineMode");
            int iD21 = androidx.room.util.p.d(gVarN2, "readProgressExt");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                ArrayList arrayList2 = arrayList;
                OfflineBookEntity offlineBookEntity = new OfflineBookEntity();
                offlineBookEntity.setNasPath(gVarN2.isNull(iD) ? null : gVarN2.Y(iD));
                offlineBookEntity.setUsername(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                offlineBookEntity.setCategoryIndex(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                offlineBookEntity.setNasId(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                offlineBookEntity.setBookId(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                offlineBookEntity.setBookName(gVarN2.isNull(iD6) ? null : gVarN2.Y(iD6));
                int i = iD2;
                int i2 = iD3;
                offlineBookEntity.setAddToShelf((int) gVarN2.getLong(iD7));
                offlineBookEntity.setAddShelfTimeStamp(gVarN2.getLong(iD8));
                offlineBookEntity.setAddLibraryTimeStamp(gVarN2.getLong(iD9));
                offlineBookEntity.setLastModifyTimeStamp(gVarN2.getLong(iD10));
                offlineBookEntity.setFileSize(gVarN2.getLong(iD11));
                offlineBookEntity.setTextSize((int) gVarN2.getLong(iD12));
                offlineBookEntity.setLatestReadTimestamp(gVarN2.getLong(iD13));
                offlineBookEntity.setLatestReadChapter(gVarN2.isNull(iD14) ? null : gVarN2.Y(iD14));
                int i3 = iD15;
                offlineBookEntity.setLatestReadChapterId(gVarN2.isNull(i3) ? null : gVarN2.Y(i3));
                int i4 = iD4;
                int i5 = iD16;
                int i6 = iD5;
                offlineBookEntity.setLatestReadPage((int) gVarN2.getLong(i5));
                int i7 = iD17;
                offlineBookEntity.setChapterCount((int) gVarN2.getLong(i7));
                int i8 = iD18;
                offlineBookEntity.setReadProgressPercent(gVarN2.isNull(i8) ? null : gVarN2.Y(i8));
                int i9 = iD19;
                offlineBookEntity.setTextNumberPositionHistory((int) gVarN2.getLong(i9));
                int i10 = iD20;
                offlineBookEntity.setReadOnOfflineMode(((int) gVarN2.getLong(i10)) != 0);
                int i11 = iD21;
                offlineBookEntity.setReadProgressExt(gVarN2.isNull(i11) ? null : gVarN2.Y(i11));
                arrayList2.add(offlineBookEntity);
                iD4 = i4;
                iD15 = i3;
                iD19 = i9;
                iD20 = i10;
                iD18 = i8;
                iD5 = i6;
                iD16 = i5;
                iD17 = i7;
                iD21 = i11;
                arrayList = arrayList2;
                iD3 = i2;
                iD2 = i;
                iD = iD;
            }
            ArrayList arrayList3 = arrayList;
            gVarN2.close();
            return arrayList3;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ List B(c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM offlineBook");
        try {
            int iD = androidx.room.util.p.d(gVarN2, "nasPath");
            int iD2 = androidx.room.util.p.d(gVarN2, "username");
            int iD3 = androidx.room.util.p.d(gVarN2, "categoryIndex");
            int iD4 = androidx.room.util.p.d(gVarN2, "nasId");
            int iD5 = androidx.room.util.p.d(gVarN2, "bookId");
            int iD6 = androidx.room.util.p.d(gVarN2, "bookName");
            int iD7 = androidx.room.util.p.d(gVarN2, "addToShelf");
            int iD8 = androidx.room.util.p.d(gVarN2, "addShelfTimeStamp");
            int iD9 = androidx.room.util.p.d(gVarN2, "addLibraryTimeStamp");
            int iD10 = androidx.room.util.p.d(gVarN2, "lastModifyTimeStamp");
            int iD11 = androidx.room.util.p.d(gVarN2, "fileSize");
            int iD12 = androidx.room.util.p.d(gVarN2, "textSize");
            int iD13 = androidx.room.util.p.d(gVarN2, "latestReadTimestamp");
            int iD14 = androidx.room.util.p.d(gVarN2, "latestReadChapter");
            int iD15 = androidx.room.util.p.d(gVarN2, "latestReadChapterId");
            int iD16 = androidx.room.util.p.d(gVarN2, "latestReadPage");
            int iD17 = androidx.room.util.p.d(gVarN2, "chapterCount");
            int iD18 = androidx.room.util.p.d(gVarN2, "readProgressPercent");
            int iD19 = androidx.room.util.p.d(gVarN2, "textNumberPositionHistory");
            int iD20 = androidx.room.util.p.d(gVarN2, "readOnOfflineMode");
            int iD21 = androidx.room.util.p.d(gVarN2, "readProgressExt");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                ArrayList arrayList2 = arrayList;
                OfflineBookEntity offlineBookEntity = new OfflineBookEntity();
                offlineBookEntity.setNasPath(gVarN2.isNull(iD) ? null : gVarN2.Y(iD));
                offlineBookEntity.setUsername(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                offlineBookEntity.setCategoryIndex(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                offlineBookEntity.setNasId(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                offlineBookEntity.setBookId(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                offlineBookEntity.setBookName(gVarN2.isNull(iD6) ? null : gVarN2.Y(iD6));
                int i = iD2;
                int i2 = iD3;
                offlineBookEntity.setAddToShelf((int) gVarN2.getLong(iD7));
                offlineBookEntity.setAddShelfTimeStamp(gVarN2.getLong(iD8));
                offlineBookEntity.setAddLibraryTimeStamp(gVarN2.getLong(iD9));
                offlineBookEntity.setLastModifyTimeStamp(gVarN2.getLong(iD10));
                offlineBookEntity.setFileSize(gVarN2.getLong(iD11));
                offlineBookEntity.setTextSize((int) gVarN2.getLong(iD12));
                offlineBookEntity.setLatestReadTimestamp(gVarN2.getLong(iD13));
                offlineBookEntity.setLatestReadChapter(gVarN2.isNull(iD14) ? null : gVarN2.Y(iD14));
                int i3 = iD15;
                offlineBookEntity.setLatestReadChapterId(gVarN2.isNull(i3) ? null : gVarN2.Y(i3));
                int i4 = iD4;
                int i5 = iD16;
                int i6 = iD5;
                offlineBookEntity.setLatestReadPage((int) gVarN2.getLong(i5));
                int i7 = iD17;
                offlineBookEntity.setChapterCount((int) gVarN2.getLong(i7));
                int i8 = iD18;
                offlineBookEntity.setReadProgressPercent(gVarN2.isNull(i8) ? null : gVarN2.Y(i8));
                int i9 = iD19;
                offlineBookEntity.setTextNumberPositionHistory((int) gVarN2.getLong(i9));
                int i10 = iD20;
                offlineBookEntity.setReadOnOfflineMode(((int) gVarN2.getLong(i10)) != 0);
                int i11 = iD21;
                offlineBookEntity.setReadProgressExt(gVarN2.isNull(i11) ? null : gVarN2.Y(i11));
                arrayList2.add(offlineBookEntity);
                iD4 = i4;
                iD15 = i3;
                iD19 = i9;
                iD20 = i10;
                iD18 = i8;
                iD5 = i6;
                iD16 = i5;
                iD17 = i7;
                iD21 = i11;
                arrayList = arrayList2;
                iD3 = i2;
                iD2 = i;
                iD = iD;
            }
            return arrayList;
        } finally {
            gVarN2.close();
        }
    }

    @androidx.annotation.n0
    public static List<Class<?>> C() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ Object o(i2 i2Var, List list, c4.c cVar) {
        i2Var.c.d(cVar, list);
        return null;
    }

    public static /* synthetic */ Integer p(String str, String str2, String str3, String str4, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM offlineBook WHERE userName = ? AND nasId = ? AND categoryIndex = ? AND bookId = ?");
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
            if (str3 == null) {
                gVarN2.G(3);
            } else {
                gVarN2.G2(3, str3);
            }
            if (str4 == null) {
                gVarN2.G(4);
            } else {
                gVarN2.G2(4, str4);
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

    public static /* synthetic */ OfflineBookEntity q(String str, String str2, String str3, String str4, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM offlineBook WHERE username LIKE ? AND categoryIndex = ? AND nasId =? AND nasPath =?");
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
            if (str3 == null) {
                gVarN2.G(3);
            } else {
                gVarN2.G2(3, str3);
            }
            if (str4 == null) {
                gVarN2.G(4);
            } else {
                gVarN2.G2(4, str4);
            }
            int iD = androidx.room.util.p.d(gVarN2, "nasPath");
            int iD2 = androidx.room.util.p.d(gVarN2, "username");
            int iD3 = androidx.room.util.p.d(gVarN2, "categoryIndex");
            int iD4 = androidx.room.util.p.d(gVarN2, "nasId");
            int iD5 = androidx.room.util.p.d(gVarN2, "bookId");
            int iD6 = androidx.room.util.p.d(gVarN2, "bookName");
            int iD7 = androidx.room.util.p.d(gVarN2, "addToShelf");
            int iD8 = androidx.room.util.p.d(gVarN2, "addShelfTimeStamp");
            int iD9 = androidx.room.util.p.d(gVarN2, "addLibraryTimeStamp");
            int iD10 = androidx.room.util.p.d(gVarN2, "lastModifyTimeStamp");
            int iD11 = androidx.room.util.p.d(gVarN2, "fileSize");
            int iD12 = androidx.room.util.p.d(gVarN2, "textSize");
            int iD13 = androidx.room.util.p.d(gVarN2, "latestReadTimestamp");
            int iD14 = androidx.room.util.p.d(gVarN2, "latestReadChapter");
            int iD15 = androidx.room.util.p.d(gVarN2, "latestReadChapterId");
            int iD16 = androidx.room.util.p.d(gVarN2, "latestReadPage");
            int iD17 = androidx.room.util.p.d(gVarN2, "chapterCount");
            int iD18 = androidx.room.util.p.d(gVarN2, "readProgressPercent");
            int iD19 = androidx.room.util.p.d(gVarN2, "textNumberPositionHistory");
            int iD20 = androidx.room.util.p.d(gVarN2, "readOnOfflineMode");
            int iD21 = androidx.room.util.p.d(gVarN2, "readProgressExt");
            OfflineBookEntity offlineBookEntity = null;
            if (gVarN2.k2()) {
                OfflineBookEntity offlineBookEntity2 = new OfflineBookEntity();
                offlineBookEntity2.setNasPath(gVarN2.isNull(iD) ? null : gVarN2.Y(iD));
                offlineBookEntity2.setUsername(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                offlineBookEntity2.setCategoryIndex(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                offlineBookEntity2.setNasId(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                offlineBookEntity2.setBookId(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                offlineBookEntity2.setBookName(gVarN2.isNull(iD6) ? null : gVarN2.Y(iD6));
                offlineBookEntity2.setAddToShelf((int) gVarN2.getLong(iD7));
                offlineBookEntity2.setAddShelfTimeStamp(gVarN2.getLong(iD8));
                offlineBookEntity2.setAddLibraryTimeStamp(gVarN2.getLong(iD9));
                offlineBookEntity2.setLastModifyTimeStamp(gVarN2.getLong(iD10));
                offlineBookEntity2.setFileSize(gVarN2.getLong(iD11));
                offlineBookEntity2.setTextSize((int) gVarN2.getLong(iD12));
                offlineBookEntity2.setLatestReadTimestamp(gVarN2.getLong(iD13));
                offlineBookEntity2.setLatestReadChapter(gVarN2.isNull(iD14) ? null : gVarN2.Y(iD14));
                offlineBookEntity2.setLatestReadChapterId(gVarN2.isNull(iD15) ? null : gVarN2.Y(iD15));
                offlineBookEntity2.setLatestReadPage((int) gVarN2.getLong(iD16));
                offlineBookEntity2.setChapterCount((int) gVarN2.getLong(iD17));
                offlineBookEntity2.setReadProgressPercent(gVarN2.isNull(iD18) ? null : gVarN2.Y(iD18));
                offlineBookEntity2.setTextNumberPositionHistory((int) gVarN2.getLong(iD19));
                offlineBookEntity2.setReadOnOfflineMode(((int) gVarN2.getLong(iD20)) != 0);
                offlineBookEntity2.setReadProgressExt(gVarN2.isNull(iD21) ? null : gVarN2.Y(iD21));
                offlineBookEntity = offlineBookEntity2;
            }
            gVarN2.close();
            return offlineBookEntity;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object r(String str, String str2, String str3, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM offlineBook WHERE username =? AND nasPath = ? AND nasId =?");
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
            if (str3 == null) {
                gVarN2.G(3);
            } else {
                gVarN2.G2(3, str3);
            }
            gVarN2.k2();
            gVarN2.close();
            return null;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ List s(String str, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT nasId FROM offlineBook WHERE username LIKE ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                arrayList.add(gVarN2.isNull(0) ? null : gVarN2.Y(0));
            }
            gVarN2.close();
            return arrayList;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object t(i2 i2Var, List list, c4.c cVar) {
        i2Var.b.insert(cVar, list);
        return null;
    }

    public static /* synthetic */ Integer v(String str, String str2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM offlineBook WHERE userName = ? AND nasId = ?");
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
            gVarN2.k2();
            Integer numValueOf = Integer.valueOf(androidx.room.util.n.b(cVar));
            gVarN2.close();
            return numValueOf;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object w(i2 i2Var, OfflineBookEntity offlineBookEntity, c4.c cVar) {
        i2Var.b.insert(cVar, offlineBookEntity);
        return null;
    }

    public static /* synthetic */ List x(String str, String str2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM offlineBook WHERE username LIKE ? AND nasId LIKE ?");
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
            int iD = androidx.room.util.p.d(gVarN2, "nasPath");
            int iD2 = androidx.room.util.p.d(gVarN2, "username");
            int iD3 = androidx.room.util.p.d(gVarN2, "categoryIndex");
            int iD4 = androidx.room.util.p.d(gVarN2, "nasId");
            int iD5 = androidx.room.util.p.d(gVarN2, "bookId");
            int iD6 = androidx.room.util.p.d(gVarN2, "bookName");
            int iD7 = androidx.room.util.p.d(gVarN2, "addToShelf");
            int iD8 = androidx.room.util.p.d(gVarN2, "addShelfTimeStamp");
            int iD9 = androidx.room.util.p.d(gVarN2, "addLibraryTimeStamp");
            int iD10 = androidx.room.util.p.d(gVarN2, "lastModifyTimeStamp");
            int iD11 = androidx.room.util.p.d(gVarN2, "fileSize");
            int iD12 = androidx.room.util.p.d(gVarN2, "textSize");
            int iD13 = androidx.room.util.p.d(gVarN2, "latestReadTimestamp");
            int iD14 = androidx.room.util.p.d(gVarN2, "latestReadChapter");
            int iD15 = androidx.room.util.p.d(gVarN2, "latestReadChapterId");
            int iD16 = androidx.room.util.p.d(gVarN2, "latestReadPage");
            int iD17 = androidx.room.util.p.d(gVarN2, "chapterCount");
            int iD18 = androidx.room.util.p.d(gVarN2, "readProgressPercent");
            int iD19 = androidx.room.util.p.d(gVarN2, "textNumberPositionHistory");
            int iD20 = androidx.room.util.p.d(gVarN2, "readOnOfflineMode");
            int iD21 = androidx.room.util.p.d(gVarN2, "readProgressExt");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                ArrayList arrayList2 = arrayList;
                OfflineBookEntity offlineBookEntity = new OfflineBookEntity();
                offlineBookEntity.setNasPath(gVarN2.isNull(iD) ? null : gVarN2.Y(iD));
                offlineBookEntity.setUsername(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                offlineBookEntity.setCategoryIndex(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                offlineBookEntity.setNasId(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                offlineBookEntity.setBookId(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                offlineBookEntity.setBookName(gVarN2.isNull(iD6) ? null : gVarN2.Y(iD6));
                int i = iD2;
                offlineBookEntity.setAddToShelf((int) gVarN2.getLong(iD7));
                offlineBookEntity.setAddShelfTimeStamp(gVarN2.getLong(iD8));
                offlineBookEntity.setAddLibraryTimeStamp(gVarN2.getLong(iD9));
                offlineBookEntity.setLastModifyTimeStamp(gVarN2.getLong(iD10));
                offlineBookEntity.setFileSize(gVarN2.getLong(iD11));
                offlineBookEntity.setTextSize((int) gVarN2.getLong(iD12));
                offlineBookEntity.setLatestReadTimestamp(gVarN2.getLong(iD13));
                offlineBookEntity.setLatestReadChapter(gVarN2.isNull(iD14) ? null : gVarN2.Y(iD14));
                int i2 = iD15;
                offlineBookEntity.setLatestReadChapterId(gVarN2.isNull(i2) ? null : gVarN2.Y(i2));
                int i3 = iD16;
                int i4 = iD3;
                int i5 = iD4;
                offlineBookEntity.setLatestReadPage((int) gVarN2.getLong(i3));
                int i6 = iD17;
                offlineBookEntity.setChapterCount((int) gVarN2.getLong(i6));
                int i7 = iD18;
                offlineBookEntity.setReadProgressPercent(gVarN2.isNull(i7) ? null : gVarN2.Y(i7));
                int i8 = iD19;
                offlineBookEntity.setTextNumberPositionHistory((int) gVarN2.getLong(i8));
                int i9 = iD20;
                offlineBookEntity.setReadOnOfflineMode(((int) gVarN2.getLong(i9)) != 0);
                int i10 = iD21;
                offlineBookEntity.setReadProgressExt(gVarN2.isNull(i10) ? null : gVarN2.Y(i10));
                arrayList2.add(offlineBookEntity);
                iD3 = i4;
                iD15 = i2;
                iD19 = i8;
                iD20 = i9;
                iD4 = i5;
                iD16 = i3;
                iD17 = i6;
                iD18 = i7;
                iD21 = i10;
                arrayList = arrayList2;
                iD2 = i;
                iD = iD;
            }
            ArrayList arrayList3 = arrayList;
            gVarN2.close();
            return arrayList3;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ List y(String str, String str2, String str3, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM offlineBook WHERE username LIKE ? AND categoryIndex = ? AND nasId =?");
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
            if (str3 == null) {
                gVarN2.G(3);
            } else {
                gVarN2.G2(3, str3);
            }
            int iD = androidx.room.util.p.d(gVarN2, "nasPath");
            int iD2 = androidx.room.util.p.d(gVarN2, "username");
            int iD3 = androidx.room.util.p.d(gVarN2, "categoryIndex");
            int iD4 = androidx.room.util.p.d(gVarN2, "nasId");
            int iD5 = androidx.room.util.p.d(gVarN2, "bookId");
            int iD6 = androidx.room.util.p.d(gVarN2, "bookName");
            int iD7 = androidx.room.util.p.d(gVarN2, "addToShelf");
            int iD8 = androidx.room.util.p.d(gVarN2, "addShelfTimeStamp");
            int iD9 = androidx.room.util.p.d(gVarN2, "addLibraryTimeStamp");
            int iD10 = androidx.room.util.p.d(gVarN2, "lastModifyTimeStamp");
            int iD11 = androidx.room.util.p.d(gVarN2, "fileSize");
            int iD12 = androidx.room.util.p.d(gVarN2, "textSize");
            int iD13 = androidx.room.util.p.d(gVarN2, "latestReadTimestamp");
            int iD14 = androidx.room.util.p.d(gVarN2, "latestReadChapter");
            int iD15 = androidx.room.util.p.d(gVarN2, "latestReadChapterId");
            int iD16 = androidx.room.util.p.d(gVarN2, "latestReadPage");
            int iD17 = androidx.room.util.p.d(gVarN2, "chapterCount");
            int iD18 = androidx.room.util.p.d(gVarN2, "readProgressPercent");
            int iD19 = androidx.room.util.p.d(gVarN2, "textNumberPositionHistory");
            int iD20 = androidx.room.util.p.d(gVarN2, "readOnOfflineMode");
            int iD21 = androidx.room.util.p.d(gVarN2, "readProgressExt");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                ArrayList arrayList2 = arrayList;
                OfflineBookEntity offlineBookEntity = new OfflineBookEntity();
                offlineBookEntity.setNasPath(gVarN2.isNull(iD) ? null : gVarN2.Y(iD));
                offlineBookEntity.setUsername(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                offlineBookEntity.setCategoryIndex(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                offlineBookEntity.setNasId(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                offlineBookEntity.setBookId(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                offlineBookEntity.setBookName(gVarN2.isNull(iD6) ? null : gVarN2.Y(iD6));
                int i = iD2;
                offlineBookEntity.setAddToShelf((int) gVarN2.getLong(iD7));
                offlineBookEntity.setAddShelfTimeStamp(gVarN2.getLong(iD8));
                offlineBookEntity.setAddLibraryTimeStamp(gVarN2.getLong(iD9));
                offlineBookEntity.setLastModifyTimeStamp(gVarN2.getLong(iD10));
                offlineBookEntity.setFileSize(gVarN2.getLong(iD11));
                offlineBookEntity.setTextSize((int) gVarN2.getLong(iD12));
                offlineBookEntity.setLatestReadTimestamp(gVarN2.getLong(iD13));
                offlineBookEntity.setLatestReadChapter(gVarN2.isNull(iD14) ? null : gVarN2.Y(iD14));
                int i2 = iD15;
                offlineBookEntity.setLatestReadChapterId(gVarN2.isNull(i2) ? null : gVarN2.Y(i2));
                int i3 = iD16;
                int i4 = iD4;
                int i5 = iD5;
                offlineBookEntity.setLatestReadPage((int) gVarN2.getLong(i3));
                int i6 = iD17;
                offlineBookEntity.setChapterCount((int) gVarN2.getLong(i6));
                int i7 = iD18;
                offlineBookEntity.setReadProgressPercent(gVarN2.isNull(i7) ? null : gVarN2.Y(i7));
                int i8 = iD19;
                offlineBookEntity.setTextNumberPositionHistory((int) gVarN2.getLong(i8));
                int i9 = iD20;
                offlineBookEntity.setReadOnOfflineMode(((int) gVarN2.getLong(i9)) != 0);
                int i10 = iD21;
                offlineBookEntity.setReadProgressExt(gVarN2.isNull(i10) ? null : gVarN2.Y(i10));
                arrayList2.add(offlineBookEntity);
                iD4 = i4;
                iD15 = i2;
                iD19 = i8;
                iD20 = i9;
                iD5 = i5;
                iD16 = i3;
                iD17 = i6;
                iD18 = i7;
                iD21 = i10;
                arrayList = arrayList2;
                iD2 = i;
                iD = iD;
            }
            ArrayList arrayList3 = arrayList;
            gVarN2.close();
            return arrayList3;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object z(String str, String str2, String str3, String str4, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM offlineBook WHERE username =? AND nasPath = ? AND categoryIndex = ? AND nasId =?");
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
            if (str3 == null) {
                gVarN2.G(3);
            } else {
                gVarN2.G2(3, str3);
            }
            if (str4 == null) {
                gVarN2.G(4);
            } else {
                gVarN2.G2(4, str4);
            }
            gVarN2.k2();
            gVarN2.close();
            return null;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    @Override // com.zentraedi.outreader.database.t1
    public OfflineBookEntity a(final String username, final String nasId, final String categoryId, final String nasPath) {
        return (OfflineBookEntity) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.d2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i2.q(username, categoryId, nasId, nasPath, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.t1
    public List<OfflineBookEntity> b() {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.u1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i2.B((c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.t1
    public void c(final List<OfflineBookEntity> entities) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.b2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i2.t(this.a, entities, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.t1
    public List<OfflineBookEntity> d(final String username) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.e2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i2.A(username, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.t1
    public void e(final List<OfflineBookEntity> entities) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.f2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i2.o(this.a, entities, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.t1
    public int f(final String userName, final String nasId) {
        return ((Integer) androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i2.v(userName, nasId, (c4.c) obj);
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.t1
    public void g(final OfflineBookEntity entity) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.z1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i2.w(this.a, entity, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.t1
    public List<OfflineBookEntity> h(final String username, final String nasId) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.x1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i2.x(username, nasId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.t1
    public void i(final String username, final String nasId, final String nasBookPath) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.c2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i2.r(username, nasBookPath, nasId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.t1
    public void j(final String username, final String nasId, final String nasBookPath, final String categoryId) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.h2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i2.z(username, nasBookPath, categoryId, nasId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.t1
    public List<OfflineBookEntity> k(final String username, final String nasId, final String categoryId) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.w1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i2.y(username, categoryId, nasId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.t1
    public int l(final String userName, final String nasId, final String categoryId, final String bookId) {
        return ((Integer) androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.g2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i2.p(userName, nasId, categoryId, bookId, (c4.c) obj);
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.t1
    public int m(final OfflineBookEntity entity) {
        return ((Integer) androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(this.a.d.c((c4.c) obj, entity));
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.t1
    public List<String> n(final String username) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.y1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i2.s(username, (c4.c) obj);
            }
        });
    }
}
