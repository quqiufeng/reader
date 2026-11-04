package com.zentraedi.outreader.database;

import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class ReaderDatabase_Impl extends ReaderDatabase {
    private volatile com.zentraedi.outreader.database.a g;
    private volatile k h;
    private volatile w0 i;
    private volatile p2 j;
    private volatile p0 k;
    private volatile y0 l;
    private volatile t1 m;
    private volatile a0 n;
    private volatile i1 o;
    private volatile j2 p;

    @Override // com.zentraedi.outreader.database.ReaderDatabase
    public t1 B() {
        t1 t1Var;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new i2(this);
                }
                t1Var = this.m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t1Var;
    }

    @Override // com.zentraedi.outreader.database.ReaderDatabase
    public j2 C() {
        j2 j2Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new o2(this);
                }
                j2Var = this.p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j2Var;
    }

    @Override // com.zentraedi.outreader.database.ReaderDatabase
    public p2 D() {
        p2 p2Var;
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            try {
                if (this.j == null) {
                    this.j = new w2(this);
                }
                p2Var = this.j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p2Var;
    }

    public void clearAllTables() {
        super.performClear(false, new String[]{"book", "sectionContent", "bookmark", "bookChapter", "bookLibraryCategory", "categoryBookRelate", "offlineBook", "book_info", "comic_epub_info", "offlineCategoryEntity"});
    }

    @androidx.annotation.n0
    protected androidx.room.p0 createInvalidationTracker() {
        return new androidx.room.p0(this, new HashMap(0), new HashMap(0), new String[]{"book", "sectionContent", "bookmark", "bookChapter", "bookLibraryCategory", "categoryBookRelate", "offlineBook", "book_info", "comic_epub_info", "offlineCategoryEntity"});
    }

    @androidx.annotation.n0
    public List<androidx.room.migration.c> getAutoMigrations(@androidx.annotation.n0 final Map<Class<? extends androidx.room.migration.b>, androidx.room.migration.b> autoMigrationSpecs) {
        return new ArrayList();
    }

    @androidx.annotation.n0
    public Set<Class<? extends androidx.room.migration.b>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @androidx.annotation.n0
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(com.zentraedi.outreader.database.a.class, j.q());
        map.put(k.class, z.C());
        map.put(w0.class, x0.a());
        map.put(p2.class, w2.m());
        map.put(p0.class, v0.k());
        map.put(y0.class, h1.p());
        map.put(t1.class, i2.C());
        map.put(a0.class, o0.A());
        map.put(i1.class, s1.s());
        map.put(j2.class, o2.i());
        return map;
    }

    @Override // com.zentraedi.outreader.database.ReaderDatabase
    public com.zentraedi.outreader.database.a t() {
        com.zentraedi.outreader.database.a aVar;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            try {
                if (this.g == null) {
                    this.g = new j(this);
                }
                aVar = this.g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.zentraedi.outreader.database.ReaderDatabase
    public k u() {
        k kVar;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            try {
                if (this.h == null) {
                    this.h = new z(this);
                }
                kVar = this.h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    @Override // com.zentraedi.outreader.database.ReaderDatabase
    public a0 v() {
        a0 a0Var;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new o0(this);
                }
                a0Var = this.n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a0Var;
    }

    @Override // com.zentraedi.outreader.database.ReaderDatabase
    public p0 w() {
        p0 p0Var;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new v0(this);
                }
                p0Var = this.k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p0Var;
    }

    @Override // com.zentraedi.outreader.database.ReaderDatabase
    public w0 x() {
        w0 w0Var;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            try {
                if (this.i == null) {
                    this.i = new x0(this);
                }
                w0Var = this.i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w0Var;
    }

    @Override // com.zentraedi.outreader.database.ReaderDatabase
    public y0 y() {
        y0 y0Var;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new h1(this);
                }
                y0Var = this.l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y0Var;
    }

    @Override // com.zentraedi.outreader.database.ReaderDatabase
    public i1 z() {
        i1 i1Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new s1(this);
                }
                i1Var = this.o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.n0
    /* JADX INFO: renamed from: createOpenDelegate, reason: merged with bridge method [inline-methods] */
    public androidx.room.x1 m1createOpenDelegate() {
        return new a(6, "589231cb28a633ffb8b368de3006d93e", "4f8d40799150d93b50e3dd80ef6e0f4b");
    }

    class a extends androidx.room.x1 {
        a(int version, String identityHash, String legacyIdentityHash) {
            super(version, identityHash, legacyIdentityHash);
        }

        public void createAllTables(@androidx.annotation.n0 final c4.c connection) {
            c4.b.a(connection, "CREATE TABLE IF NOT EXISTS `book` (`index` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT NOT NULL, `md5Path` TEXT, `name` TEXT, `cover` TEXT, `readNumber` INTEGER NOT NULL, `latestReadTimestamp` INTEGER NOT NULL, `sourceId` TEXT, `latestReadChapter` TEXT, `latestReadChapterId` TEXT, `latestReadPage` INTEGER NOT NULL, `chapterCount` INTEGER NOT NULL, `words` INTEGER NOT NULL, `hasReadFinished` INTEGER NOT NULL, `time` INTEGER NOT NULL, `readProgressPercent` TEXT, `textNumberPositionHistory` INTEGER NOT NULL, `epubCover` TEXT, `addToShelf` INTEGER NOT NULL, `addToLibrary` INTEGER NOT NULL, `localPath` TEXT, `nasPath` TEXT, `addShelfTimeStamp` INTEGER NOT NULL, `addLibraryTimeStamp` INTEGER NOT NULL, `addCacheTimeStamp` INTEGER NOT NULL, `showName` TEXT, `fileSize` INTEGER NOT NULL, `mupdfSizeLevel` INTEGER NOT NULL)");
            c4.b.a(connection, "CREATE TABLE IF NOT EXISTS `sectionContent` (`sectionIndex` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT, `bookId` TEXT, `sectionId` TEXT, `sectionName` TEXT, `content` TEXT, `createDateTime` TEXT, `plaintext` INTEGER NOT NULL, `updateTime` INTEGER NOT NULL, `mupdfPath` TEXT)");
            c4.b.a(connection, "CREATE TABLE IF NOT EXISTS `bookmark` (`index` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `position` INTEGER NOT NULL, `bookId` TEXT, `sourceId` TEXT, `chapterName` TEXT, `chapterId` TEXT, `chapterIndex` INTEGER NOT NULL, `firstLineContent` TEXT, `content` TEXT, `time` INTEGER NOT NULL, `rate` TEXT)");
            c4.b.a(connection, "CREATE TABLE IF NOT EXISTS `bookChapter` (`index` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT, `bookId` TEXT, `sourceId` TEXT, `chapterList` TEXT, `chapterState` TEXT)");
            c4.b.a(connection, "CREATE TABLE IF NOT EXISTS `bookLibraryCategory` (`index` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `username` TEXT)");
            c4.b.a(connection, "CREATE TABLE IF NOT EXISTS `categoryBookRelate` (`index` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `bookIndex` INTEGER NOT NULL, `categoryIndex` INTEGER NOT NULL)");
            c4.b.a(connection, "CREATE TABLE IF NOT EXISTS `offlineBook` (`nasPath` TEXT NOT NULL, `username` TEXT NOT NULL, `categoryIndex` TEXT NOT NULL, `nasId` TEXT, `bookId` TEXT, `bookName` TEXT, `addToShelf` INTEGER NOT NULL, `addShelfTimeStamp` INTEGER NOT NULL, `addLibraryTimeStamp` INTEGER NOT NULL, `lastModifyTimeStamp` INTEGER NOT NULL, `fileSize` INTEGER NOT NULL, `textSize` INTEGER NOT NULL, `latestReadTimestamp` INTEGER NOT NULL, `latestReadChapter` TEXT, `latestReadChapterId` TEXT, `latestReadPage` INTEGER NOT NULL, `chapterCount` INTEGER NOT NULL, `readProgressPercent` TEXT, `textNumberPositionHistory` INTEGER NOT NULL, `readOnOfflineMode` INTEGER NOT NULL, `readProgressExt` TEXT, PRIMARY KEY(`nasPath`, `username`, `categoryIndex`))");
            c4.b.a(connection, "CREATE TABLE IF NOT EXISTS `book_info` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `username` TEXT, `nasId` TEXT, `categoryId` TEXT, `bookId` TEXT, `bookName` TEXT, `bookCover` TEXT, `bookType` TEXT, `addBookshelf` INTEGER NOT NULL, `bookShare` INTEGER NOT NULL, `downloadTime` INTEGER NOT NULL, `downloadId` TEXT, `nasPath` TEXT)");
            c4.b.a(connection, "CREATE TABLE IF NOT EXISTS `comic_epub_info` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `username` TEXT, `nasId` TEXT, `filePathMd5` TEXT, `fileLocalPath` TEXT, `fileModifiedTime` INTEGER NOT NULL, `imageLinkJson` TEXT)");
            c4.b.a(connection, "CREATE TABLE IF NOT EXISTS `offlineCategoryEntity` (`categoryIndex` TEXT NOT NULL, `username` TEXT NOT NULL, `nasId` TEXT, `categoryName` TEXT NOT NULL, PRIMARY KEY(`categoryIndex`, `username`))");
            c4.b.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c4.b.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '589231cb28a633ffb8b368de3006d93e')");
        }

        public void dropAllTables(@androidx.annotation.n0 final c4.c connection) {
            c4.b.a(connection, "DROP TABLE IF EXISTS `book`");
            c4.b.a(connection, "DROP TABLE IF EXISTS `sectionContent`");
            c4.b.a(connection, "DROP TABLE IF EXISTS `bookmark`");
            c4.b.a(connection, "DROP TABLE IF EXISTS `bookChapter`");
            c4.b.a(connection, "DROP TABLE IF EXISTS `bookLibraryCategory`");
            c4.b.a(connection, "DROP TABLE IF EXISTS `categoryBookRelate`");
            c4.b.a(connection, "DROP TABLE IF EXISTS `offlineBook`");
            c4.b.a(connection, "DROP TABLE IF EXISTS `book_info`");
            c4.b.a(connection, "DROP TABLE IF EXISTS `comic_epub_info`");
            c4.b.a(connection, "DROP TABLE IF EXISTS `offlineCategoryEntity`");
        }

        public void onOpen(@androidx.annotation.n0 final c4.c connection) {
            ReaderDatabase_Impl.this.internalInitInvalidationTracker(connection);
        }

        public void onPreMigrate(@androidx.annotation.n0 final c4.c connection) {
            androidx.room.util.c.b(connection);
        }

        @androidx.annotation.n0
        public androidx.room.x1.a onValidateSchema(@androidx.annotation.n0 final c4.c connection) {
            HashMap map = new HashMap(28);
            map.put("index", new androidx.room.util.u.a("index", "INTEGER", true, 1, (String) null, 1));
            map.put("userId", new androidx.room.util.u.a("userId", "TEXT", true, 0, (String) null, 1));
            map.put("md5Path", new androidx.room.util.u.a("md5Path", "TEXT", false, 0, (String) null, 1));
            map.put("name", new androidx.room.util.u.a("name", "TEXT", false, 0, (String) null, 1));
            map.put("cover", new androidx.room.util.u.a("cover", "TEXT", false, 0, (String) null, 1));
            map.put("readNumber", new androidx.room.util.u.a("readNumber", "INTEGER", true, 0, (String) null, 1));
            map.put("latestReadTimestamp", new androidx.room.util.u.a("latestReadTimestamp", "INTEGER", true, 0, (String) null, 1));
            map.put("sourceId", new androidx.room.util.u.a("sourceId", "TEXT", false, 0, (String) null, 1));
            map.put("latestReadChapter", new androidx.room.util.u.a("latestReadChapter", "TEXT", false, 0, (String) null, 1));
            map.put("latestReadChapterId", new androidx.room.util.u.a("latestReadChapterId", "TEXT", false, 0, (String) null, 1));
            map.put("latestReadPage", new androidx.room.util.u.a("latestReadPage", "INTEGER", true, 0, (String) null, 1));
            map.put("chapterCount", new androidx.room.util.u.a("chapterCount", "INTEGER", true, 0, (String) null, 1));
            map.put("words", new androidx.room.util.u.a("words", "INTEGER", true, 0, (String) null, 1));
            map.put("hasReadFinished", new androidx.room.util.u.a("hasReadFinished", "INTEGER", true, 0, (String) null, 1));
            map.put("time", new androidx.room.util.u.a("time", "INTEGER", true, 0, (String) null, 1));
            map.put("readProgressPercent", new androidx.room.util.u.a("readProgressPercent", "TEXT", false, 0, (String) null, 1));
            map.put("textNumberPositionHistory", new androidx.room.util.u.a("textNumberPositionHistory", "INTEGER", true, 0, (String) null, 1));
            map.put("epubCover", new androidx.room.util.u.a("epubCover", "TEXT", false, 0, (String) null, 1));
            map.put("addToShelf", new androidx.room.util.u.a("addToShelf", "INTEGER", true, 0, (String) null, 1));
            map.put("addToLibrary", new androidx.room.util.u.a("addToLibrary", "INTEGER", true, 0, (String) null, 1));
            map.put("localPath", new androidx.room.util.u.a("localPath", "TEXT", false, 0, (String) null, 1));
            map.put("nasPath", new androidx.room.util.u.a("nasPath", "TEXT", false, 0, (String) null, 1));
            map.put("addShelfTimeStamp", new androidx.room.util.u.a("addShelfTimeStamp", "INTEGER", true, 0, (String) null, 1));
            map.put("addLibraryTimeStamp", new androidx.room.util.u.a("addLibraryTimeStamp", "INTEGER", true, 0, (String) null, 1));
            map.put("addCacheTimeStamp", new androidx.room.util.u.a("addCacheTimeStamp", "INTEGER", true, 0, (String) null, 1));
            map.put("showName", new androidx.room.util.u.a("showName", "TEXT", false, 0, (String) null, 1));
            map.put("fileSize", new androidx.room.util.u.a("fileSize", "INTEGER", true, 0, (String) null, 1));
            map.put("mupdfSizeLevel", new androidx.room.util.u.a("mupdfSizeLevel", "INTEGER", true, 0, (String) null, 1));
            androidx.room.util.u uVar = new androidx.room.util.u("book", map, new HashSet(0), new HashSet(0));
            androidx.room.util.u uVarA = androidx.room.util.u.a(connection, "book");
            if (!uVar.equals(uVarA)) {
                return new androidx.room.x1.a(false, "book(com.zentraedi.outreader.model.BookEntity).\n Expected:\n" + uVar + "\n Found:\n" + uVarA);
            }
            HashMap map2 = new HashMap(10);
            map2.put("sectionIndex", new androidx.room.util.u.a("sectionIndex", "INTEGER", true, 1, (String) null, 1));
            map2.put("userId", new androidx.room.util.u.a("userId", "TEXT", false, 0, (String) null, 1));
            map2.put("bookId", new androidx.room.util.u.a("bookId", "TEXT", false, 0, (String) null, 1));
            map2.put("sectionId", new androidx.room.util.u.a("sectionId", "TEXT", false, 0, (String) null, 1));
            map2.put("sectionName", new androidx.room.util.u.a("sectionName", "TEXT", false, 0, (String) null, 1));
            map2.put("content", new androidx.room.util.u.a("content", "TEXT", false, 0, (String) null, 1));
            map2.put("createDateTime", new androidx.room.util.u.a("createDateTime", "TEXT", false, 0, (String) null, 1));
            map2.put("plaintext", new androidx.room.util.u.a("plaintext", "INTEGER", true, 0, (String) null, 1));
            map2.put("updateTime", new androidx.room.util.u.a("updateTime", "INTEGER", true, 0, (String) null, 1));
            map2.put("mupdfPath", new androidx.room.util.u.a("mupdfPath", "TEXT", false, 0, (String) null, 1));
            androidx.room.util.u uVar2 = new androidx.room.util.u("sectionContent", map2, new HashSet(0), new HashSet(0));
            androidx.room.util.u uVarA2 = androidx.room.util.u.a(connection, "sectionContent");
            if (!uVar2.equals(uVarA2)) {
                return new androidx.room.x1.a(false, "sectionContent(com.zentraedi.outreader.model.SectionContentEntity).\n Expected:\n" + uVar2 + "\n Found:\n" + uVarA2);
            }
            HashMap map3 = new HashMap(11);
            map3.put("index", new androidx.room.util.u.a("index", "INTEGER", true, 1, (String) null, 1));
            map3.put(CommonNetImpl.POSITION, new androidx.room.util.u.a(CommonNetImpl.POSITION, "INTEGER", true, 0, (String) null, 1));
            map3.put("bookId", new androidx.room.util.u.a("bookId", "TEXT", false, 0, (String) null, 1));
            map3.put("sourceId", new androidx.room.util.u.a("sourceId", "TEXT", false, 0, (String) null, 1));
            map3.put("chapterName", new androidx.room.util.u.a("chapterName", "TEXT", false, 0, (String) null, 1));
            map3.put("chapterId", new androidx.room.util.u.a("chapterId", "TEXT", false, 0, (String) null, 1));
            map3.put("chapterIndex", new androidx.room.util.u.a("chapterIndex", "INTEGER", true, 0, (String) null, 1));
            map3.put("firstLineContent", new androidx.room.util.u.a("firstLineContent", "TEXT", false, 0, (String) null, 1));
            map3.put("content", new androidx.room.util.u.a("content", "TEXT", false, 0, (String) null, 1));
            map3.put("time", new androidx.room.util.u.a("time", "INTEGER", true, 0, (String) null, 1));
            map3.put("rate", new androidx.room.util.u.a("rate", "TEXT", false, 0, (String) null, 1));
            androidx.room.util.u uVar3 = new androidx.room.util.u("bookmark", map3, new HashSet(0), new HashSet(0));
            androidx.room.util.u uVarA3 = androidx.room.util.u.a(connection, "bookmark");
            if (!uVar3.equals(uVarA3)) {
                return new androidx.room.x1.a(false, "bookmark(com.zentraedi.outreader.model.BookmarkEntity).\n Expected:\n" + uVar3 + "\n Found:\n" + uVarA3);
            }
            HashMap map4 = new HashMap(6);
            map4.put("index", new androidx.room.util.u.a("index", "INTEGER", true, 1, (String) null, 1));
            map4.put("userId", new androidx.room.util.u.a("userId", "TEXT", false, 0, (String) null, 1));
            map4.put("bookId", new androidx.room.util.u.a("bookId", "TEXT", false, 0, (String) null, 1));
            map4.put("sourceId", new androidx.room.util.u.a("sourceId", "TEXT", false, 0, (String) null, 1));
            map4.put("chapterList", new androidx.room.util.u.a("chapterList", "TEXT", false, 0, (String) null, 1));
            map4.put("chapterState", new androidx.room.util.u.a("chapterState", "TEXT", false, 0, (String) null, 1));
            androidx.room.util.u uVar4 = new androidx.room.util.u("bookChapter", map4, new HashSet(0), new HashSet(0));
            androidx.room.util.u uVarA4 = androidx.room.util.u.a(connection, "bookChapter");
            if (!uVar4.equals(uVarA4)) {
                return new androidx.room.x1.a(false, "bookChapter(com.zentraedi.outreader.model.BookChapterEntity).\n Expected:\n" + uVar4 + "\n Found:\n" + uVarA4);
            }
            HashMap map5 = new HashMap(3);
            map5.put("index", new androidx.room.util.u.a("index", "INTEGER", true, 1, (String) null, 1));
            map5.put("name", new androidx.room.util.u.a("name", "TEXT", true, 0, (String) null, 1));
            map5.put("username", new androidx.room.util.u.a("username", "TEXT", false, 0, (String) null, 1));
            androidx.room.util.u uVar5 = new androidx.room.util.u("bookLibraryCategory", map5, new HashSet(0), new HashSet(0));
            androidx.room.util.u uVarA5 = androidx.room.util.u.a(connection, "bookLibraryCategory");
            if (!uVar5.equals(uVarA5)) {
                return new androidx.room.x1.a(false, "bookLibraryCategory(com.zentraedi.outreader.model.BookLibraryCategoryEntity).\n Expected:\n" + uVar5 + "\n Found:\n" + uVarA5);
            }
            HashMap map6 = new HashMap(3);
            map6.put("index", new androidx.room.util.u.a("index", "INTEGER", true, 1, (String) null, 1));
            map6.put("bookIndex", new androidx.room.util.u.a("bookIndex", "INTEGER", true, 0, (String) null, 1));
            map6.put("categoryIndex", new androidx.room.util.u.a("categoryIndex", "INTEGER", true, 0, (String) null, 1));
            androidx.room.util.u uVar6 = new androidx.room.util.u("categoryBookRelate", map6, new HashSet(0), new HashSet(0));
            androidx.room.util.u uVarA6 = androidx.room.util.u.a(connection, "categoryBookRelate");
            if (!uVar6.equals(uVarA6)) {
                return new androidx.room.x1.a(false, "categoryBookRelate(com.zentraedi.outreader.model.LibraryCategoryAndBookRelate).\n Expected:\n" + uVar6 + "\n Found:\n" + uVarA6);
            }
            HashMap map7 = new HashMap(21);
            map7.put("nasPath", new androidx.room.util.u.a("nasPath", "TEXT", true, 1, (String) null, 1));
            map7.put("username", new androidx.room.util.u.a("username", "TEXT", true, 2, (String) null, 1));
            map7.put("categoryIndex", new androidx.room.util.u.a("categoryIndex", "TEXT", true, 3, (String) null, 1));
            map7.put("nasId", new androidx.room.util.u.a("nasId", "TEXT", false, 0, (String) null, 1));
            map7.put("bookId", new androidx.room.util.u.a("bookId", "TEXT", false, 0, (String) null, 1));
            map7.put("bookName", new androidx.room.util.u.a("bookName", "TEXT", false, 0, (String) null, 1));
            map7.put("addToShelf", new androidx.room.util.u.a("addToShelf", "INTEGER", true, 0, (String) null, 1));
            map7.put("addShelfTimeStamp", new androidx.room.util.u.a("addShelfTimeStamp", "INTEGER", true, 0, (String) null, 1));
            map7.put("addLibraryTimeStamp", new androidx.room.util.u.a("addLibraryTimeStamp", "INTEGER", true, 0, (String) null, 1));
            map7.put("lastModifyTimeStamp", new androidx.room.util.u.a("lastModifyTimeStamp", "INTEGER", true, 0, (String) null, 1));
            map7.put("fileSize", new androidx.room.util.u.a("fileSize", "INTEGER", true, 0, (String) null, 1));
            map7.put("textSize", new androidx.room.util.u.a("textSize", "INTEGER", true, 0, (String) null, 1));
            map7.put("latestReadTimestamp", new androidx.room.util.u.a("latestReadTimestamp", "INTEGER", true, 0, (String) null, 1));
            map7.put("latestReadChapter", new androidx.room.util.u.a("latestReadChapter", "TEXT", false, 0, (String) null, 1));
            map7.put("latestReadChapterId", new androidx.room.util.u.a("latestReadChapterId", "TEXT", false, 0, (String) null, 1));
            map7.put("latestReadPage", new androidx.room.util.u.a("latestReadPage", "INTEGER", true, 0, (String) null, 1));
            map7.put("chapterCount", new androidx.room.util.u.a("chapterCount", "INTEGER", true, 0, (String) null, 1));
            map7.put("readProgressPercent", new androidx.room.util.u.a("readProgressPercent", "TEXT", false, 0, (String) null, 1));
            map7.put("textNumberPositionHistory", new androidx.room.util.u.a("textNumberPositionHistory", "INTEGER", true, 0, (String) null, 1));
            map7.put("readOnOfflineMode", new androidx.room.util.u.a("readOnOfflineMode", "INTEGER", true, 0, (String) null, 1));
            map7.put("readProgressExt", new androidx.room.util.u.a("readProgressExt", "TEXT", false, 0, (String) null, 1));
            androidx.room.util.u uVar7 = new androidx.room.util.u("offlineBook", map7, new HashSet(0), new HashSet(0));
            androidx.room.util.u uVarA7 = androidx.room.util.u.a(connection, "offlineBook");
            if (!uVar7.equals(uVarA7)) {
                return new androidx.room.x1.a(false, "offlineBook(com.zentraedi.outreader.model.offline.OfflineBookEntity).\n Expected:\n" + uVar7 + "\n Found:\n" + uVarA7);
            }
            HashMap map8 = new HashMap(13);
            map8.put("id", new androidx.room.util.u.a("id", "INTEGER", true, 1, (String) null, 1));
            map8.put("username", new androidx.room.util.u.a("username", "TEXT", false, 0, (String) null, 1));
            map8.put("nasId", new androidx.room.util.u.a("nasId", "TEXT", false, 0, (String) null, 1));
            map8.put("categoryId", new androidx.room.util.u.a("categoryId", "TEXT", false, 0, (String) null, 1));
            map8.put("bookId", new androidx.room.util.u.a("bookId", "TEXT", false, 0, (String) null, 1));
            map8.put("bookName", new androidx.room.util.u.a("bookName", "TEXT", false, 0, (String) null, 1));
            map8.put("bookCover", new androidx.room.util.u.a("bookCover", "TEXT", false, 0, (String) null, 1));
            map8.put("bookType", new androidx.room.util.u.a("bookType", "TEXT", false, 0, (String) null, 1));
            map8.put("addBookshelf", new androidx.room.util.u.a("addBookshelf", "INTEGER", true, 0, (String) null, 1));
            map8.put("bookShare", new androidx.room.util.u.a("bookShare", "INTEGER", true, 0, (String) null, 1));
            map8.put("downloadTime", new androidx.room.util.u.a("downloadTime", "INTEGER", true, 0, (String) null, 1));
            map8.put("downloadId", new androidx.room.util.u.a("downloadId", "TEXT", false, 0, (String) null, 1));
            map8.put("nasPath", new androidx.room.util.u.a("nasPath", "TEXT", false, 0, (String) null, 1));
            androidx.room.util.u uVar8 = new androidx.room.util.u("book_info", map8, new HashSet(0), new HashSet(0));
            androidx.room.util.u uVarA8 = androidx.room.util.u.a(connection, "book_info");
            if (!uVar8.equals(uVarA8)) {
                return new androidx.room.x1.a(false, "book_info(com.zentraedi.outreader.model.offline.BookInfoEntity).\n Expected:\n" + uVar8 + "\n Found:\n" + uVarA8);
            }
            HashMap map9 = new HashMap(7);
            map9.put("id", new androidx.room.util.u.a("id", "INTEGER", true, 1, (String) null, 1));
            map9.put("username", new androidx.room.util.u.a("username", "TEXT", false, 0, (String) null, 1));
            map9.put("nasId", new androidx.room.util.u.a("nasId", "TEXT", false, 0, (String) null, 1));
            map9.put("filePathMd5", new androidx.room.util.u.a("filePathMd5", "TEXT", false, 0, (String) null, 1));
            map9.put("fileLocalPath", new androidx.room.util.u.a("fileLocalPath", "TEXT", false, 0, (String) null, 1));
            map9.put("fileModifiedTime", new androidx.room.util.u.a("fileModifiedTime", "INTEGER", true, 0, (String) null, 1));
            map9.put("imageLinkJson", new androidx.room.util.u.a("imageLinkJson", "TEXT", false, 0, (String) null, 1));
            androidx.room.util.u uVar9 = new androidx.room.util.u("comic_epub_info", map9, new HashSet(0), new HashSet(0));
            androidx.room.util.u uVarA9 = androidx.room.util.u.a(connection, "comic_epub_info");
            if (!uVar9.equals(uVarA9)) {
                return new androidx.room.x1.a(false, "comic_epub_info(com.zentraedi.outreader.model.entity.ComicEpubInfoEntity).\n Expected:\n" + uVar9 + "\n Found:\n" + uVarA9);
            }
            HashMap map10 = new HashMap(4);
            map10.put("categoryIndex", new androidx.room.util.u.a("categoryIndex", "TEXT", true, 1, (String) null, 1));
            map10.put("username", new androidx.room.util.u.a("username", "TEXT", true, 2, (String) null, 1));
            map10.put("nasId", new androidx.room.util.u.a("nasId", "TEXT", false, 0, (String) null, 1));
            map10.put("categoryName", new androidx.room.util.u.a("categoryName", "TEXT", true, 0, (String) null, 1));
            androidx.room.util.u uVar10 = new androidx.room.util.u("offlineCategoryEntity", map10, new HashSet(0), new HashSet(0));
            androidx.room.util.u uVarA10 = androidx.room.util.u.a(connection, "offlineCategoryEntity");
            if (uVar10.equals(uVarA10)) {
                return new androidx.room.x1.a(true, (String) null);
            }
            return new androidx.room.x1.a(false, "offlineCategoryEntity(com.zentraedi.outreader.model.offline.OfflineCategoryEntity).\n Expected:\n" + uVar10 + "\n Found:\n" + uVarA10);
        }

        public void onCreate(@androidx.annotation.n0 final c4.c connection) {
        }

        public void onPostMigrate(@androidx.annotation.n0 final c4.c connection) {
        }
    }
}
