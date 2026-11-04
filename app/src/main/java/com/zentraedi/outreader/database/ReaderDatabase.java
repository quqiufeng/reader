package com.zentraedi.outreader.database;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.zentraedi.outreader.model.BookChapterEntity;
import com.zentraedi.outreader.model.BookEntity;
import com.zentraedi.outreader.model.BookLibraryCategoryEntity;
import com.zentraedi.outreader.model.BookmarkEntity;
import com.zentraedi.outreader.model.LibraryCategoryAndBookRelate;
import com.zentraedi.outreader.model.SectionContentEntity;
import com.zentraedi.outreader.model.entity.ComicEpubInfoEntity;
import com.zentraedi.outreader.model.offline.BookInfoEntity;
import com.zentraedi.outreader.model.offline.OfflineBookEntity;
import com.zentraedi.outreader.model.offline.OfflineCategoryEntity;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@androidx.room.n(entities = {BookEntity.class, SectionContentEntity.class, BookmarkEntity.class, BookChapterEntity.class, BookLibraryCategoryEntity.class, LibraryCategoryAndBookRelate.class, OfflineBookEntity.class, BookInfoEntity.class, ComicEpubInfoEntity.class, OfflineCategoryEntity.class}, exportSchema = false, version = 6)
public abstract class ReaderDatabase extends RoomDatabase {
    private static final String a = "ReaderDatabase.db";
    static final androidx.room.migration.c b = new a(1, 2);
    static final androidx.room.migration.c c = new b(2, 3);
    static final androidx.room.migration.c d = new c(3, 4);
    static final androidx.room.migration.c e = new d(4, 5);
    static final androidx.room.migration.c f = new e(5, 6);

    class a extends androidx.room.migration.c {
        a(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        public void migrate(@androidx.annotation.n0 d4.e database) {
            database.q2("DROP TABLE IF EXISTS book;");
            database.q2("DROP TABLE IF EXISTS sectionContent;");
            database.q2("DROP TABLE IF EXISTS bookmark;");
            database.q2("DROP TABLE IF EXISTS bookChapter;");
            database.q2("CREATE TABLE IF NOT EXISTS `book` (`index` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT, `md5Path` TEXT, `name` TEXT, `cover` TEXT, `addToShelf` INTEGER NOT NULL DEFAULT 0, `addToLibrary` INTEGER NOT NULL DEFAULT 0, `readNumber` INTEGER NOT NULL DEFAULT 0, `latestReadTimestamp` INTEGER NOT NULL DEFAULT 0, `sourceId` TEXT, `latestReadChapter` TEXT, `latestReadChapterId` TEXT, `latestReadPage` INTEGER NOT NULL DEFAULT 0, `hasUpdate` INTEGER NOT NULL DEFAULT 0, `chapterCount` INTEGER NOT NULL DEFAULT 0, `words` INTEGER NOT NULL DEFAULT 0, `localPath` TEXT,`hasError` INTEGER NOT NULL DEFAULT 0,`nasPath` TEXT,`finish` INTEGER NOT NULL DEFAULT 0,`addCacheTimeStamp` INTEGER NOT NULL DEFAULT 0,`epubCover` TEXT,`hasReadFinished` INTEGER NOT NULL DEFAULT 0,`textNumberPositionHistory` INTEGER NOT NULL DEFAULT 0,`readProgressPercent` TEXT,`showName` TEXT,`fileSize` INTEGER NOT NULL DEFAULT 0,`addShelfTimeStamp` INTEGER NOT NULL DEFAULT 0,`addLibraryTimeStamp` INTEGER NOT NULL DEFAULT 0)");
            database.q2("CREATE TABLE IF NOT EXISTS `sectionContent` (`sectionIndex` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT, `bookId` TEXT, `sectionId` TEXT, `sectionName` TEXT, `content` TEXT, `plaintext` INTEGER NOT NULL DEFAULT 0,`updateTime` INTEGER NOT NULL DEFAULT 0,`mupdfPath` TEXT DEFAULT '',`createDateTime` TEXT)");
            database.q2("CREATE TABLE IF NOT EXISTS `bookmark` (`index` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `position` INTEGER NOT NULL DEFAULT 0, `bookId` TEXT, `sourceId` TEXT, `chapterName` TEXT, `chapterId` TEXT, `chapterIndex` INTEGER NOT NULL DEFAULT 0, `firstLineContent` TEXT, `content` TEXT, `time` INTEGER NOT NULL DEFAULT 0, `rate` TEXT)");
            database.q2("CREATE TABLE IF NOT EXISTS `bookChapter` (`index` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT, `bookId` TEXT, `sourceId` TEXT, `chapterState` TEXT DEFAULT '',`chapterList` TEXT)");
            database.q2("CREATE TABLE IF NOT EXISTS `bookLibraryCategory` (`index` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `username` TEXT,`name` TEXT)");
            database.q2("CREATE TABLE IF NOT EXISTS `categoryBookRelate` (`index` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `bookIndex` INTEGER NOT NULL DEFAULT -1, `categoryIndex` INTEGER NOT NULL DEFAULT -1)");
        }
    }

    class b extends androidx.room.migration.c {
        b(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        public void migrate(@androidx.annotation.n0 d4.e database) {
            database.q2("ALTER TABLE book ADD COLUMN mupdfSizeLevel INTEGER NOT NULL DEFAULT 0");
        }
    }

    class c extends androidx.room.migration.c {
        c(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        public void migrate(@androidx.annotation.n0 d4.e database) {
            database.q2("DROP TABLE IF EXISTS offlineBook;");
            database.q2("DROP TABLE IF EXISTS offlineCategoryEntity;");
            database.q2("CREATE TABLE IF NOT EXISTS `offlineBook` (`nasPath` TEXT NOT NULL, `username` TEXT NOT NULL, `categoryIndex` TEXT NOT NULL, `bookId` TEXT, `bookName` TEXT, `addToShelf` INTEGER NOT NULL DEFAULT 0, `fileSize` INTEGER NOT NULL DEFAULT 0, `textSize` INTEGER NOT NULL DEFAULT 3, `latestReadChapter` TEXT, `latestReadChapterId` TEXT, `latestReadPage` INTEGER NOT NULL DEFAULT 0, `chapterCount` INTEGER NOT NULL DEFAULT 0, `readProgressPercent` TEXT, `textNumberPositionHistory` INTEGER NOT NULL DEFAULT 0, `addShelfTimeStamp` INTEGER NOT NULL DEFAULT 0, `addLibraryTimeStamp` INTEGER NOT NULL DEFAULT 0, `latestReadTimestamp` INTEGER NOT NULL DEFAULT 0, `lastModifyTimeStamp` INTEGER NOT NULL DEFAULT 0, `readOnOfflineMode` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (nasPath,username,categoryIndex))");
            database.q2("CREATE TABLE IF NOT EXISTS `offlineCategoryEntity` (`categoryIndex` TEXT NOT NULL,`username` TEXT NOT NULL,`categoryName` TEXT NOT NULL,PRIMARY KEY (categoryIndex,username))");
        }
    }

    class d extends androidx.room.migration.c {
        d(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        public void migrate(@androidx.annotation.n0 d4.e database) {
            database.q2("ALTER TABLE offlineBook ADD COLUMN nasId TEXT");
            database.q2("ALTER TABLE offlineCategoryEntity ADD COLUMN nasId TEXT");
        }
    }

    class e extends androidx.room.migration.c {
        e(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        public void migrate(@androidx.annotation.n0 d4.e database) {
            database.q2("CREATE TABLE IF NOT EXISTS comic_epub_info (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, username TEXT, nasId TEXT, filePathMd5 TEXT, fileLocalPath TEXT, fileModifiedTime INTEGER NOT NULL DEFAULT 0, imageLinkJson TEXT)");
            database.q2("CREATE TABLE IF NOT EXISTS book_info (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, username TEXT, nasId TEXT, nasPath TEXT, categoryId TEXT, bookId TEXT, bookName TEXT, bookCover TEXT, bookType TEXT, addBookshelf INTEGER NOT NULL DEFAULT 0, bookShare INTEGER NOT NULL DEFAULT 0, downloadTime INTEGER NOT NULL DEFAULT 0, downloadId TEXT)");
            database.q2("ALTER TABLE offlineBook ADD COLUMN readProgressExt TEXT");
        }
    }

    private static class f {
        public static final ReaderDatabase a = ReaderDatabase.s(com.zentraedi.basic.function.utils.a.a());

        private f() {
        }
    }

    public static ReaderDatabase A() {
        return f.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ReaderDatabase s(Context context) {
        return (ReaderDatabase) androidx.room.h1.a(context, ReaderDatabase.class, a).c(new androidx.room.migration.c[]{b, c, d, e, f}).f();
    }

    public abstract t1 B();

    public abstract j2 C();

    public abstract p2 D();

    public abstract com.zentraedi.outreader.database.a t();

    public abstract k u();

    public abstract a0 v();

    public abstract p0 w();

    public abstract w0 x();

    public abstract y0 y();

    public abstract i1 z();
}
