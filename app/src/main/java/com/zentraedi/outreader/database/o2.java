package com.zentraedi.outreader.database;

import androidx.room.RoomDatabase;
import com.zentraedi.outreader.model.offline.OfflineCategoryEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class o2 implements j2 {
    private final RoomDatabase a;
    private final androidx.room.y<OfflineCategoryEntity> b = new a();

    class a extends androidx.room.y<OfflineCategoryEntity> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final OfflineCategoryEntity entity) {
            if (entity.getCategoryIndex() == null) {
                statement.G(1);
            } else {
                statement.G2(1, entity.getCategoryIndex());
            }
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
            if (entity.getCategoryName() == null) {
                statement.G(4);
            } else {
                statement.G2(4, entity.getCategoryName());
            }
        }

        @androidx.annotation.n0
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `offlineCategoryEntity` (`categoryIndex`,`username`,`nasId`,`categoryName`) VALUES (?,?,?,?)";
        }
    }

    public o2(@androidx.annotation.n0 final RoomDatabase __db) {
        this.a = __db;
    }

    public static /* synthetic */ Object b(o2 o2Var, OfflineCategoryEntity[] offlineCategoryEntityArr, c4.c cVar) {
        o2Var.b.insert(cVar, offlineCategoryEntityArr);
        return null;
    }

    public static /* synthetic */ List e(String str, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM offlineCategoryEntity WHERE username LIKE ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            int iD = androidx.room.util.p.d(gVarN2, "categoryIndex");
            int iD2 = androidx.room.util.p.d(gVarN2, "username");
            int iD3 = androidx.room.util.p.d(gVarN2, "nasId");
            int iD4 = androidx.room.util.p.d(gVarN2, "categoryName");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                OfflineCategoryEntity offlineCategoryEntity = new OfflineCategoryEntity();
                String strY = null;
                offlineCategoryEntity.setCategoryIndex(gVarN2.isNull(iD) ? null : gVarN2.Y(iD));
                offlineCategoryEntity.setUsername(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                offlineCategoryEntity.setNasId(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                if (!gVarN2.isNull(iD4)) {
                    strY = gVarN2.Y(iD4);
                }
                offlineCategoryEntity.setCategoryName(strY);
                arrayList.add(offlineCategoryEntity);
            }
            gVarN2.close();
            return arrayList;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object g(o2 o2Var, List list, c4.c cVar) {
        o2Var.b.insert(cVar, list);
        return null;
    }

    public static /* synthetic */ Integer h(String str, String str2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM offlineCategoryEntity WHERE userName = ? AND nasId = ?");
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

    @androidx.annotation.n0
    public static List<Class<?>> i() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.zentraedi.outreader.database.j2
    public void a(final OfflineCategoryEntity... entities) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.l2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o2.b(this.a, entities, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.j2
    public void c(final List<OfflineCategoryEntity> entities) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.n2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o2.g(this.a, entities, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.j2
    public List<OfflineCategoryEntity> d(final String username) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.m2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o2.e(username, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.j2
    public int f(final String userName, final String nasId) {
        return ((Integer) androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.k2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o2.h(userName, nasId, (c4.c) obj);
            }
        })).intValue();
    }
}
