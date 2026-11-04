package com.zentraedi.outreader.database;

import com.zentraedi.outreader.model.SectionContentEntity;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@androidx.room.m
public interface p2 {
    @androidx.room.a1("DELETE FROM sectionContent WHERE userId = :userId")
    int a(String userId);

    @androidx.room.a1("UPDATE sectionContent SET userId = :userId WHERE userId = \"0\"")
    void b(String userId);

    @androidx.room.k0
    void c(SectionContentEntity... sectionContentEntity);

    @androidx.room.a1("SELECT * FROM sectionContent WHERE userId = :userId AND bookId = :bookId")
    List<SectionContentEntity> d(String userId, String bookId);

    @androidx.room.k0(onConflict = 1)
    void e(List<SectionContentEntity> entities);

    @androidx.room.a1("SELECT * FROM sectionContent WHERE userId = :userId AND bookId = :bookId AND sectionId IN(:chapterIds)")
    List<SectionContentEntity> f(String userId, String bookId, List<String> chapterIds);
}
