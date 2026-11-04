package com.zentraedi.outreader.database;

import androidx.room.b3;
import com.zentraedi.outreader.model.offline.OfflineBookEntity;
import java.util.List;
import kotlin.Deprecated;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@androidx.room.m
public interface t1 {
    @androidx.room.a1("SELECT * FROM offlineBook WHERE username LIKE :username AND categoryIndex = :categoryId AND nasId =:nasId AND nasPath =:nasPath")
    OfflineBookEntity a(String username, String nasId, String categoryId, String nasPath);

    @androidx.room.a1("SELECT * FROM offlineBook")
    @Deprecated(message = "为了刷数据使用的方法，平时不需要")
    List<OfflineBookEntity> b();

    @androidx.room.k0(onConflict = 1)
    void c(List<OfflineBookEntity> entities);

    @androidx.room.a1("SELECT * FROM offlineBook WHERE username LIKE :username")
    List<OfflineBookEntity> d(String username);

    @Deprecated(message = "为了刷数据使用的方法，平时不需要")
    @androidx.room.r
    void e(List<OfflineBookEntity> entities);

    @androidx.room.a1("DELETE FROM offlineBook WHERE userName = :userName AND nasId = :nasId")
    int f(String userName, String nasId);

    @androidx.room.k0(onConflict = 1)
    void g(OfflineBookEntity entity);

    @androidx.room.a1("SELECT * FROM offlineBook WHERE username LIKE :username AND nasId LIKE :nasId")
    List<OfflineBookEntity> h(String username, String nasId);

    @androidx.room.a1("DELETE FROM offlineBook WHERE username =:username AND nasPath = :nasBookPath AND nasId =:nasId")
    void i(String username, String nasId, String nasBookPath);

    @androidx.room.a1("DELETE FROM offlineBook WHERE username =:username AND nasPath = :nasBookPath AND categoryIndex = :categoryId AND nasId =:nasId")
    void j(String username, String nasId, String nasBookPath, String categoryId);

    @androidx.room.a1("SELECT * FROM offlineBook WHERE username LIKE :username AND categoryIndex = :categoryId AND nasId =:nasId")
    List<OfflineBookEntity> k(String username, String nasId, String categoryId);

    @androidx.room.a1("DELETE FROM offlineBook WHERE userName = :userName AND nasId = :nasId AND categoryIndex = :categoryId AND bookId = :bookId")
    int l(String userName, String nasId, String categoryId, String bookId);

    @b3
    int m(OfflineBookEntity entity);

    @androidx.room.a1("SELECT nasId FROM offlineBook WHERE username LIKE :username")
    List<String> n(String username);
}
