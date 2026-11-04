package com.zentraedi.outreader.database;

import androidx.room.b3;
import com.zentraedi.outreader.model.entity.ComicEpubInfoEntity;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@androidx.room.m
public interface i1 {

    @fo.k
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    @androidx.room.a1("SELECT * FROM comic_epub_info WHERE userName = :userName AND nasId = :nasId AND filePathMd5 = :filePathMd5 AND fileModifiedTime = :fileModifiedTime")
    @fo.l
    List<ComicEpubInfoEntity> a(@fo.k String str, @fo.k String str2, @fo.k String str3, long j);

    @b3
    int b(@fo.k ComicEpubInfoEntity comicEpubInfoEntity);

    @androidx.room.k0(onConflict = 1)
    @fo.k
    List<Long> c(@fo.k List<ComicEpubInfoEntity> list);

    @androidx.room.k0(onConflict = 1)
    long d(@fo.k ComicEpubInfoEntity comicEpubInfoEntity);

    @androidx.room.a1("SELECT * FROM comic_epub_info WHERE userName = :userName AND nasId = :nasId")
    @fo.l
    List<ComicEpubInfoEntity> e(@fo.k String str, @fo.k String str2);

    @androidx.room.a1("DELETE FROM comic_epub_info WHERE userName = :userName AND nasId = :nasId")
    int f(@fo.k String str, @fo.k String str2);

    @androidx.room.a1("SELECT count(*) FROM comic_epub_info WHERE userName = :userName AND nasId = :nasId")
    int g(@fo.k String str, @fo.k String str2);

    @androidx.room.r
    int h(@fo.k ComicEpubInfoEntity comicEpubInfoEntity);

    @androidx.room.a1("DELETE FROM comic_epub_info WHERE username =:username AND nasId =:nasId AND fileLocalPath = :fileLocalPath")
    int i(@fo.l String str, @fo.l String str2, @fo.l String str3);
}
