package com.zentraedi.outreader.database;

import androidx.room.RoomDatabase;
import com.zentraedi.outreader.model.SectionContentEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class w2 implements p2 {
    private final RoomDatabase a;
    private final androidx.room.y<SectionContentEntity> b = new a();
    private final androidx.room.y<SectionContentEntity> c = new b();

    class a extends androidx.room.y<SectionContentEntity> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final SectionContentEntity entity) {
            statement.l(1, entity.getSectionIndex());
            if (entity.getUserId() == null) {
                statement.G(2);
            } else {
                statement.G2(2, entity.getUserId());
            }
            if (entity.getBookId() == null) {
                statement.G(3);
            } else {
                statement.G2(3, entity.getBookId());
            }
            if (entity.getSectionId() == null) {
                statement.G(4);
            } else {
                statement.G2(4, entity.getSectionId());
            }
            if (entity.getSectionName() == null) {
                statement.G(5);
            } else {
                statement.G2(5, entity.getSectionName());
            }
            if (entity.getContent() == null) {
                statement.G(6);
            } else {
                statement.G2(6, entity.getContent());
            }
            if (entity.getCreateDateTime() == null) {
                statement.G(7);
            } else {
                statement.G2(7, entity.getCreateDateTime());
            }
            statement.l(8, entity.getPlaintext());
            statement.l(9, entity.getUpdateTime());
            if (entity.getMupdfPath() == null) {
                statement.G(10);
            } else {
                statement.G2(10, entity.getMupdfPath());
            }
        }

        @androidx.annotation.n0
        protected String createQuery() {
            return "INSERT OR ABORT INTO `sectionContent` (`sectionIndex`,`userId`,`bookId`,`sectionId`,`sectionName`,`content`,`createDateTime`,`plaintext`,`updateTime`,`mupdfPath`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
        }
    }

    class b extends androidx.room.y<SectionContentEntity> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final SectionContentEntity entity) {
            statement.l(1, entity.getSectionIndex());
            if (entity.getUserId() == null) {
                statement.G(2);
            } else {
                statement.G2(2, entity.getUserId());
            }
            if (entity.getBookId() == null) {
                statement.G(3);
            } else {
                statement.G2(3, entity.getBookId());
            }
            if (entity.getSectionId() == null) {
                statement.G(4);
            } else {
                statement.G2(4, entity.getSectionId());
            }
            if (entity.getSectionName() == null) {
                statement.G(5);
            } else {
                statement.G2(5, entity.getSectionName());
            }
            if (entity.getContent() == null) {
                statement.G(6);
            } else {
                statement.G2(6, entity.getContent());
            }
            if (entity.getCreateDateTime() == null) {
                statement.G(7);
            } else {
                statement.G2(7, entity.getCreateDateTime());
            }
            statement.l(8, entity.getPlaintext());
            statement.l(9, entity.getUpdateTime());
            if (entity.getMupdfPath() == null) {
                statement.G(10);
            } else {
                statement.G2(10, entity.getMupdfPath());
            }
        }

        @androidx.annotation.n0
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `sectionContent` (`sectionIndex`,`userId`,`bookId`,`sectionId`,`sectionName`,`content`,`createDateTime`,`plaintext`,`updateTime`,`mupdfPath`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
        }
    }

    public w2(@androidx.annotation.n0 final RoomDatabase __db) {
        this.a = __db;
    }

    public static /* synthetic */ List g(String str, String str2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM sectionContent WHERE userId = ? AND bookId = ?");
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
            int iD = androidx.room.util.p.d(gVarN2, "sectionIndex");
            int iD2 = androidx.room.util.p.d(gVarN2, "userId");
            int iD3 = androidx.room.util.p.d(gVarN2, "bookId");
            int iD4 = androidx.room.util.p.d(gVarN2, "sectionId");
            int iD5 = androidx.room.util.p.d(gVarN2, "sectionName");
            int iD6 = androidx.room.util.p.d(gVarN2, "content");
            int iD7 = androidx.room.util.p.d(gVarN2, "createDateTime");
            int iD8 = androidx.room.util.p.d(gVarN2, "plaintext");
            int iD9 = androidx.room.util.p.d(gVarN2, "updateTime");
            int iD10 = androidx.room.util.p.d(gVarN2, "mupdfPath");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                SectionContentEntity sectionContentEntity = new SectionContentEntity();
                sectionContentEntity.setSectionIndex((int) gVarN2.getLong(iD));
                sectionContentEntity.setUserId(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                sectionContentEntity.setBookId(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                sectionContentEntity.setSectionId(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                sectionContentEntity.setSectionName(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                sectionContentEntity.setContent(gVarN2.isNull(iD6) ? null : gVarN2.Y(iD6));
                sectionContentEntity.setCreateDateTime(gVarN2.isNull(iD7) ? null : gVarN2.Y(iD7));
                sectionContentEntity.setPlaintext((int) gVarN2.getLong(iD8));
                sectionContentEntity.setUpdateTime(gVarN2.getLong(iD9));
                sectionContentEntity.setMupdfPath(gVarN2.isNull(iD10) ? null : gVarN2.Y(iD10));
                arrayList.add(sectionContentEntity);
            }
            gVarN2.close();
            return arrayList;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object h(w2 w2Var, SectionContentEntity[] sectionContentEntityArr, c4.c cVar) {
        w2Var.b.insert(cVar, sectionContentEntityArr);
        return null;
    }

    public static /* synthetic */ List i(String str, String str2, String str3, List list, c4.c cVar) {
        c4.g gVarN2 = cVar.n2(str);
        try {
            if (str2 == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str2);
            }
            if (str3 == null) {
                gVarN2.G(2);
            } else {
                gVarN2.G2(2, str3);
            }
            int i = 3;
            if (list == null) {
                gVarN2.G(3);
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    if (str4 == null) {
                        gVarN2.G(i);
                    } else {
                        gVarN2.G2(i, str4);
                    }
                    i++;
                }
            }
            int iD = androidx.room.util.p.d(gVarN2, "sectionIndex");
            int iD2 = androidx.room.util.p.d(gVarN2, "userId");
            int iD3 = androidx.room.util.p.d(gVarN2, "bookId");
            int iD4 = androidx.room.util.p.d(gVarN2, "sectionId");
            int iD5 = androidx.room.util.p.d(gVarN2, "sectionName");
            int iD6 = androidx.room.util.p.d(gVarN2, "content");
            int iD7 = androidx.room.util.p.d(gVarN2, "createDateTime");
            int iD8 = androidx.room.util.p.d(gVarN2, "plaintext");
            int iD9 = androidx.room.util.p.d(gVarN2, "updateTime");
            int iD10 = androidx.room.util.p.d(gVarN2, "mupdfPath");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                SectionContentEntity sectionContentEntity = new SectionContentEntity();
                sectionContentEntity.setSectionIndex((int) gVarN2.getLong(iD));
                sectionContentEntity.setUserId(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                sectionContentEntity.setBookId(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                sectionContentEntity.setSectionId(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                sectionContentEntity.setSectionName(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                sectionContentEntity.setContent(gVarN2.isNull(iD6) ? null : gVarN2.Y(iD6));
                sectionContentEntity.setCreateDateTime(gVarN2.isNull(iD7) ? null : gVarN2.Y(iD7));
                sectionContentEntity.setPlaintext((int) gVarN2.getLong(iD8));
                sectionContentEntity.setUpdateTime(gVarN2.getLong(iD9));
                sectionContentEntity.setMupdfPath(gVarN2.isNull(iD10) ? null : gVarN2.Y(iD10));
                arrayList.add(sectionContentEntity);
            }
            gVarN2.close();
            return arrayList;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object j(w2 w2Var, List list, c4.c cVar) {
        w2Var.c.insert(cVar, list);
        return null;
    }

    public static /* synthetic */ Object k(String str, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("UPDATE sectionContent SET userId = ? WHERE userId = \"0\"");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            gVarN2.k2();
            gVarN2.close();
            return null;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Integer l(String str, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM sectionContent WHERE userId = ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
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

    @androidx.annotation.n0
    public static List<Class<?>> m() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.zentraedi.outreader.database.p2
    public int a(final String userId) {
        return ((Integer) androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.s2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2.l(userId, (c4.c) obj);
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.p2
    public void b(final String userId) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.t2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2.k(userId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.p2
    public void c(final SectionContentEntity... sectionContentEntity) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.u2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2.h(this.a, sectionContentEntity, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.p2
    public List<SectionContentEntity> d(final String userId, final String bookId) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.v2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2.g(userId, bookId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.p2
    public void e(final List<SectionContentEntity> entities) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.q2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2.j(this.a, entities, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.p2
    public List<SectionContentEntity> f(final String userId, final String bookId, final List<String> chapterIds) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM sectionContent WHERE userId = ");
        sb.append("?");
        sb.append(" AND bookId = ");
        sb.append("?");
        sb.append(" AND sectionId IN(");
        androidx.room.util.t.a(sb, chapterIds == null ? 1 : chapterIds.size());
        sb.append(")");
        final String string = sb.toString();
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.r2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2.i(string, userId, bookId, chapterIds, (c4.c) obj);
            }
        });
    }
}
