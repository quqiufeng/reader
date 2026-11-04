package com.zentraedi.outreader.database;

import androidx.room.b3;
import com.zentraedi.outreader.model.LibraryCategoryAndBookRelate;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@androidx.room.m
public interface y0 {
    @androidx.room.r
    int a(LibraryCategoryAndBookRelate... entities);

    @androidx.room.a1("SELECT * FROM categoryBookRelate WHERE bookIndex = :bookId LIMIT :size")
    List<LibraryCategoryAndBookRelate> b(int bookId, int size);

    @b3
    int c(LibraryCategoryAndBookRelate... entities);

    @androidx.room.a1("SELECT * FROM categoryBookRelate WHERE categoryIndex = :categoryId AND bookIndex = :bookId")
    LibraryCategoryAndBookRelate d(int categoryId, int bookId);

    @androidx.room.a1("DELETE FROM categoryBookRelate WHERE bookIndex = :bookIndex AND categoryIndex = :categoryIndex")
    void deleteData(int categoryIndex, int bookIndex);

    @androidx.room.a1("SELECT * FROM categoryBookRelate WHERE bookIndex = :bookId")
    List<LibraryCategoryAndBookRelate> e(int bookId);

    @androidx.room.k0(onConflict = 1)
    void f(LibraryCategoryAndBookRelate... entities);

    @androidx.room.a1("SELECT * FROM categoryBookRelate WHERE categoryIndex = :categoryId")
    List<LibraryCategoryAndBookRelate> g(int categoryId);
}
