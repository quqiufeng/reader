package com.zentraedi.outreader.database;

import com.zentraedi.outreader.model.BookChapterEntity;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@androidx.room.m
public interface a {
    @androidx.room.a1("DELETE FROM bookChapter WHERE userId = :userId")
    int a(String userId);

    @androidx.room.a1("DELETE FROM bookChapter WHERE userId =:userId AND bookId = :bookId")
    void b(String userId, String bookId);

    @androidx.room.k0(onConflict = 1)
    void c(BookChapterEntity... bookChapterEntities);

    @androidx.room.a1("DELETE FROM bookChapter WHERE userId =:userId AND bookId = :bookId AND sourceId = :sourceId")
    void d(String userId, String bookId, String sourceId);

    @androidx.room.a1("UPDATE bookChapter SET chapterState = :chapterState WHERE userId =:userId AND bookId = :bookId AND sourceId =:sourceId")
    void e(String userId, String bookId, String sourceId, String chapterState);

    @androidx.room.a1("DELETE FROM bookChapter WHERE bookId = :bookId")
    int f(String bookId);

    @androidx.room.a1("UPDATE bookChapter SET chapterList = :chapterList WHERE userId =:userId AND bookId = :bookId AND sourceId =:sourceId")
    void g(String userId, String bookId, String sourceId, String chapterList);

    @androidx.room.a1("SELECT * FROM bookChapter WHERE userId =:userId AND bookId =:bookId")
    BookChapterEntity h(String userId, String bookId);
}
