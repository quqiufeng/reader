package com.zentraedi.outreader.database;

import androidx.room.b3;
import com.zentraedi.outreader.model.offline.BookInfoEntity;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@androidx.room.m
public interface a0 {

    @fo.k
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    @androidx.room.a1("SELECT * FROM book_info WHERE userName = :userName AND nasId = :nasId AND bookId = :bookId")
    @fo.l
    List<BookInfoEntity> a(@fo.k String str, @fo.k String str2, @fo.k String str3);

    @androidx.room.k0(onConflict = 1)
    @fo.k
    List<Long> c(@fo.k List<BookInfoEntity> list);

    @androidx.room.a1("SELECT * FROM book_info WHERE downloadId = :downloadId")
    @fo.l
    List<BookInfoEntity> d(@fo.k String str);

    @androidx.room.a1("SELECT * FROM book_info WHERE userName = :userName AND nasId = :nasId")
    @fo.l
    List<BookInfoEntity> e(@fo.k String str, @fo.k String str2);

    @androidx.room.a1("DELETE FROM book_info WHERE userName = :userName AND nasId = :nasId")
    int f(@fo.k String str, @fo.k String str2);

    @androidx.room.a1("SELECT count(*) FROM book_info WHERE userName = :userName AND nasId = :nasId")
    int g(@fo.k String str, @fo.k String str2);

    @androidx.room.a1("DELETE FROM book_info WHERE username =:username AND nasId =:nasId AND nasPath = :nasPath")
    int i(@fo.l String str, @fo.l String str2, @fo.l String str3);

    @androidx.room.a1("DELETE FROM book_info WHERE username =:username AND nasId =:nasId AND categoryId = :categoryId AND nasPath = :nasPath")
    int j(@fo.l String str, @fo.l String str2, @fo.l String str3, @fo.l String str4);

    @androidx.room.r
    int k(@fo.k BookInfoEntity bookInfoEntity);

    @androidx.room.r
    int l(@fo.k BookInfoEntity... bookInfoEntityArr);

    @b3
    int m(@fo.k BookInfoEntity bookInfoEntity);

    @androidx.room.a1("DELETE FROM book_info WHERE userName = :userName AND nasId = :nasId AND categoryId = :categoryId AND bookId = :bookId")
    int n(@fo.k String str, @fo.k String str2, @fo.k String str3, @fo.k String str4);

    @androidx.room.k0(onConflict = 1)
    long o(@fo.k BookInfoEntity bookInfoEntity);
}
