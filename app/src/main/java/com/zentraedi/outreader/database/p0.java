package com.zentraedi.outreader.database;

import androidx.room.b3;
import com.zentraedi.outreader.model.BookLibraryCategoryEntity;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@androidx.room.m
public interface p0 {
    @androidx.room.r
    int a(BookLibraryCategoryEntity... entities);

    @androidx.room.k0(onConflict = 1)
    void b(BookLibraryCategoryEntity... entities);

    @b3
    int c(BookLibraryCategoryEntity... entities);

    @androidx.room.a1("SELECT * FROM bookLibraryCategory WHERE username LIKE :username")
    List<BookLibraryCategoryEntity> d(String username);

    @androidx.room.a1("SELECT * FROM bookLibraryCategory WHERE username LIKE :username AND `index` = :categoryId")
    List<BookLibraryCategoryEntity> e(String username, int categoryId);
}
