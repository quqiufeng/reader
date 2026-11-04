package com.zentraedi.outreader.database;

import com.zentraedi.outreader.model.offline.OfflineCategoryEntity;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@androidx.room.m
public interface j2 {
    @androidx.room.k0(onConflict = 1)
    void a(OfflineCategoryEntity... entities);

    @androidx.room.k0(onConflict = 1)
    void c(List<OfflineCategoryEntity> entities);

    @androidx.room.a1("SELECT * FROM offlineCategoryEntity WHERE username LIKE :username")
    List<OfflineCategoryEntity> d(String username);

    @androidx.room.a1("DELETE FROM offlineCategoryEntity WHERE userName = :userName AND nasId = :nasId")
    int f(String userName, String nasId);
}
