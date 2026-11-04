package com.zentraedi.outreader.database;

import androidx.room.RoomDatabase;
import com.zentraedi.outreader.model.entity.ComicEpubInfoEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class s1 implements i1 {
    private final RoomDatabase b;
    private final androidx.room.y<ComicEpubInfoEntity> c = new a();
    private final androidx.room.w<ComicEpubInfoEntity> d = new b();
    private final androidx.room.w<ComicEpubInfoEntity> e = new c();

    class a extends androidx.room.y<ComicEpubInfoEntity> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final ComicEpubInfoEntity entity) {
            statement.l(1, entity.getId());
            if (entity.getUsername() == null) {
                statement.G(2);
            } else {
                statement.G2(2, entity.getUsername());
            }
            if (entity.getNasId() == null) {
                statement.G(3);
            } else {
                statement.G2(3, entity.getNasId());
            }
            if (entity.getFilePathMd5() == null) {
                statement.G(4);
            } else {
                statement.G2(4, entity.getFilePathMd5());
            }
            if (entity.getFileLocalPath() == null) {
                statement.G(5);
            } else {
                statement.G2(5, entity.getFileLocalPath());
            }
            statement.l(6, entity.getFileModifiedTime());
            if (entity.getImageLinkJson() == null) {
                statement.G(7);
            } else {
                statement.G2(7, entity.getImageLinkJson());
            }
        }

        @androidx.annotation.n0
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `comic_epub_info` (`id`,`username`,`nasId`,`filePathMd5`,`fileLocalPath`,`fileModifiedTime`,`imageLinkJson`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }
    }

    class b extends androidx.room.w<ComicEpubInfoEntity> {
        b() {
        }

        @androidx.annotation.n0
        protected String b() {
            return "DELETE FROM `comic_epub_info` WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final ComicEpubInfoEntity entity) {
            statement.l(1, entity.getId());
        }
    }

    class c extends androidx.room.w<ComicEpubInfoEntity> {
        c() {
        }

        @androidx.annotation.n0
        protected String b() {
            return "UPDATE OR ABORT `comic_epub_info` SET `id` = ?,`username` = ?,`nasId` = ?,`filePathMd5` = ?,`fileLocalPath` = ?,`fileModifiedTime` = ?,`imageLinkJson` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final ComicEpubInfoEntity entity) {
            statement.l(1, entity.getId());
            if (entity.getUsername() == null) {
                statement.G(2);
            } else {
                statement.G2(2, entity.getUsername());
            }
            if (entity.getNasId() == null) {
                statement.G(3);
            } else {
                statement.G2(3, entity.getNasId());
            }
            if (entity.getFilePathMd5() == null) {
                statement.G(4);
            } else {
                statement.G2(4, entity.getFilePathMd5());
            }
            if (entity.getFileLocalPath() == null) {
                statement.G(5);
            } else {
                statement.G2(5, entity.getFileLocalPath());
            }
            statement.l(6, entity.getFileModifiedTime());
            if (entity.getImageLinkJson() == null) {
                statement.G(7);
            } else {
                statement.G2(7, entity.getImageLinkJson());
            }
            statement.l(8, entity.getId());
        }
    }

    public s1(@androidx.annotation.n0 final RoomDatabase __db) {
        this.b = __db;
    }

    public static /* synthetic */ Integer k(String str, String str2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT count(*) FROM comic_epub_info WHERE userName = ? AND nasId = ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            if (str2 == null) {
                gVarN2.G(2);
            } else {
                gVarN2.G2(2, str2);
            }
            Integer numValueOf = Integer.valueOf(gVarN2.k2() ? (int) gVarN2.getLong(0) : 0);
            gVarN2.close();
            return numValueOf;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Integer m(String str, String str2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM comic_epub_info WHERE userName = ? AND nasId = ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            if (str2 == null) {
                gVarN2.G(2);
            } else {
                gVarN2.G2(2, str2);
            }
            gVarN2.k2();
            Integer numValueOf = Integer.valueOf(androidx.room.util.n.b(cVar));
            gVarN2.close();
            return numValueOf;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Integer o(String str, String str2, String str3, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM comic_epub_info WHERE username =? AND nasId =? AND fileLocalPath = ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            if (str2 == null) {
                gVarN2.G(2);
            } else {
                gVarN2.G2(2, str2);
            }
            if (str3 == null) {
                gVarN2.G(3);
            } else {
                gVarN2.G2(3, str3);
            }
            gVarN2.k2();
            Integer numValueOf = Integer.valueOf(androidx.room.util.n.b(cVar));
            gVarN2.close();
            return numValueOf;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ List p(String str, String str2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM comic_epub_info WHERE userName = ? AND nasId = ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            if (str2 == null) {
                gVarN2.G(2);
            } else {
                gVarN2.G2(2, str2);
            }
            int iD = androidx.room.util.p.d(gVarN2, "id");
            int iD2 = androidx.room.util.p.d(gVarN2, "username");
            int iD3 = androidx.room.util.p.d(gVarN2, "nasId");
            int iD4 = androidx.room.util.p.d(gVarN2, "filePathMd5");
            int iD5 = androidx.room.util.p.d(gVarN2, "fileLocalPath");
            int iD6 = androidx.room.util.p.d(gVarN2, "fileModifiedTime");
            int iD7 = androidx.room.util.p.d(gVarN2, "imageLinkJson");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                ComicEpubInfoEntity comicEpubInfoEntity = new ComicEpubInfoEntity();
                comicEpubInfoEntity.setId(gVarN2.getLong(iD));
                String strY = null;
                comicEpubInfoEntity.setUsername(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                comicEpubInfoEntity.setNasId(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                comicEpubInfoEntity.setFilePathMd5(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                comicEpubInfoEntity.setFileLocalPath(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                comicEpubInfoEntity.setFileModifiedTime(gVarN2.getLong(iD6));
                if (!gVarN2.isNull(iD7)) {
                    strY = gVarN2.Y(iD7);
                }
                comicEpubInfoEntity.setImageLinkJson(strY);
                arrayList.add(comicEpubInfoEntity);
            }
            gVarN2.close();
            return arrayList;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ List r(String str, String str2, String str3, long j, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM comic_epub_info WHERE userName = ? AND nasId = ? AND filePathMd5 = ? AND fileModifiedTime = ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            if (str2 == null) {
                gVarN2.G(2);
            } else {
                gVarN2.G2(2, str2);
            }
            if (str3 == null) {
                gVarN2.G(3);
            } else {
                gVarN2.G2(3, str3);
            }
            gVarN2.l(4, j);
            int iD = androidx.room.util.p.d(gVarN2, "id");
            int iD2 = androidx.room.util.p.d(gVarN2, "username");
            int iD3 = androidx.room.util.p.d(gVarN2, "nasId");
            int iD4 = androidx.room.util.p.d(gVarN2, "filePathMd5");
            int iD5 = androidx.room.util.p.d(gVarN2, "fileLocalPath");
            int iD6 = androidx.room.util.p.d(gVarN2, "fileModifiedTime");
            int iD7 = androidx.room.util.p.d(gVarN2, "imageLinkJson");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                ComicEpubInfoEntity comicEpubInfoEntity = new ComicEpubInfoEntity();
                comicEpubInfoEntity.setId(gVarN2.getLong(iD));
                String strY = null;
                comicEpubInfoEntity.setUsername(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                comicEpubInfoEntity.setNasId(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                comicEpubInfoEntity.setFilePathMd5(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                comicEpubInfoEntity.setFileLocalPath(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                comicEpubInfoEntity.setFileModifiedTime(gVarN2.getLong(iD6));
                if (!gVarN2.isNull(iD7)) {
                    strY = gVarN2.Y(iD7);
                }
                comicEpubInfoEntity.setImageLinkJson(strY);
                arrayList.add(comicEpubInfoEntity);
            }
            gVarN2.close();
            return arrayList;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    @androidx.annotation.n0
    public static List<Class<?>> s() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.zentraedi.outreader.database.i1
    public List<ComicEpubInfoEntity> a(final String userName, final String nasId, final String filePathMd5, final long fileModifiedTime) {
        return (List) androidx.room.util.c.h(this.b, true, false, new Function1() { // from class: com.zentraedi.outreader.database.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s1.r(userName, nasId, filePathMd5, fileModifiedTime, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.i1
    public int b(final ComicEpubInfoEntity entity) {
        entity.getClass();
        return ((Integer) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.q1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(this.a.e.c((c4.c) obj, entity));
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.i1
    public List<Long> c(final List<ComicEpubInfoEntity> entities) {
        entities.getClass();
        return (List) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.r1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.c.insertAndReturnIdsList((c4.c) obj, entities);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.i1
    public long d(final ComicEpubInfoEntity entity) {
        entity.getClass();
        return ((Long) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(this.a.c.insertAndReturnId((c4.c) obj, entity));
            }
        })).longValue();
    }

    @Override // com.zentraedi.outreader.database.i1
    public List<ComicEpubInfoEntity> e(final String userName, final String nasId) {
        return (List) androidx.room.util.c.h(this.b, true, false, new Function1() { // from class: com.zentraedi.outreader.database.k1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s1.p(userName, nasId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.i1
    public int f(final String userName, final String nasId) {
        return ((Integer) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s1.m(userName, nasId, (c4.c) obj);
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.i1
    public int g(final String userName, final String nasId) {
        return ((Integer) androidx.room.util.c.h(this.b, true, false, new Function1() { // from class: com.zentraedi.outreader.database.p1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s1.k(userName, nasId, (c4.c) obj);
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.i1
    public int h(final ComicEpubInfoEntity entity) {
        entity.getClass();
        return ((Integer) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.j1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(this.a.d.c((c4.c) obj, entity));
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.i1
    public int i(final String username, final String nasId, final String fileLocalPath) {
        return ((Integer) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.o1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s1.o(username, nasId, fileLocalPath, (c4.c) obj);
            }
        })).intValue();
    }
}
