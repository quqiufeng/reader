package com.zentraedi.outreader.database;

import androidx.room.b3;
import com.zentraedi.outreader.model.BookEntity;
import java.util.List;
import kotlin.Deprecated;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@androidx.room.m
public interface k {
    @androidx.room.a1("DELETE FROM book WHERE userId = :userId")
    int a(String userId);

    @androidx.room.a1("SELECT * FROM book")
    @Deprecated(message = "为了刷数据使用的方法，平时不需要")
    List<BookEntity> b();

    @androidx.room.k0(onConflict = 1)
    void c(List<BookEntity> bookEntities);

    @androidx.room.a1("SELECT * FROM book WHERE userId LIKE :userId AND addToLibrary = 1 ORDER BY addLibraryTimeStamp DESC")
    List<BookEntity> d(String userId);

    @androidx.room.a1("SELECT * FROM book WHERE userId = :userId AND nasPath = :nasPath")
    BookEntity e(String userId, String nasPath);

    @androidx.room.k0(onConflict = 1)
    void f(BookEntity... bookEntities);

    @androidx.room.a1("UPDATE book SET addToLibrary = 0 , addToShelf= 0 , addShelfTimeStamp = 0 , addLibraryTimeStamp = 0 WHERE `index` = :bookIndex AND userId = :userId")
    void g(String userId, int bookIndex);

    @androidx.room.a1("SELECT * FROM book WHERE userId LIKE :userId AND addToShelf = 1 ORDER BY addShelfTimeStamp DESC")
    List<BookEntity> h(String userId);

    @b3
    int i(BookEntity... entities);

    @androidx.room.a1("SELECT * FROM book WHERE userId = :userId AND `index` = :bookIndex")
    BookEntity j(String userId, int bookIndex);

    @androidx.room.a1("SELECT * FROM book WHERE userId LIKE :userId AND nasPath = :nasPath ORDER BY addCacheTimeStamp DESC")
    BookEntity k(String userId, String nasPath);

    @androidx.room.a1("SELECT * FROM book WHERE userId LIKE :userId AND addToLibrary = 1 ORDER BY addLibraryTimeStamp DESC LIMIT :size")
    List<BookEntity> l(String userId, int size);

    @androidx.room.a1("SELECT * FROM book WHERE `index` IN (SELECT bookIndex FROM categoryBookRelate WHERE userId = :userId AND categoryIndex = :categoryId)")
    List<BookEntity> m(String userId, int categoryId);

    @androidx.room.a1("SELECT * FROM  book  WHERE userId LIKE :userId AND addToShelf = 1 ORDER BY addShelfTimeStamp DESC LIMIT :size")
    List<BookEntity> n(String userId, int size);
}
