package com.zentraedi.outreader.database;

import androidx.room.RoomDatabase;
import com.zentraedi.outreader.model.BookLibraryCategoryEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class v0 implements p0 {
    private final RoomDatabase a;
    private final androidx.room.y<BookLibraryCategoryEntity> b = new a();
    private final androidx.room.w<BookLibraryCategoryEntity> c = new b();
    private final androidx.room.w<BookLibraryCategoryEntity> d = new c();

    class a extends androidx.room.y<BookLibraryCategoryEntity> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final BookLibraryCategoryEntity entity) {
            statement.l(1, entity.getIndex());
            if (entity.getName() == null) {
                statement.G(2);
            } else {
                statement.G2(2, entity.getName());
            }
            if (entity.getUsername() == null) {
                statement.G(3);
            } else {
                statement.G2(3, entity.getUsername());
            }
        }

        @androidx.annotation.n0
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `bookLibraryCategory` (`index`,`name`,`username`) VALUES (nullif(?, 0),?,?)";
        }
    }

    class b extends androidx.room.w<BookLibraryCategoryEntity> {
        b() {
        }

        @androidx.annotation.n0
        protected String b() {
            return "DELETE FROM `bookLibraryCategory` WHERE `index` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final BookLibraryCategoryEntity entity) {
            statement.l(1, entity.getIndex());
        }
    }

    class c extends androidx.room.w<BookLibraryCategoryEntity> {
        c() {
        }

        @androidx.annotation.n0
        protected String b() {
            return "UPDATE OR ABORT `bookLibraryCategory` SET `index` = ?,`name` = ?,`username` = ? WHERE `index` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final BookLibraryCategoryEntity entity) {
            statement.l(1, entity.getIndex());
            if (entity.getName() == null) {
                statement.G(2);
            } else {
                statement.G2(2, entity.getName());
            }
            if (entity.getUsername() == null) {
                statement.G(3);
            } else {
                statement.G2(3, entity.getUsername());
            }
            statement.l(4, entity.getIndex());
        }
    }

    public v0(@androidx.annotation.n0 final RoomDatabase __db) {
        this.a = __db;
    }

    public static /* synthetic */ Object f(v0 v0Var, BookLibraryCategoryEntity[] bookLibraryCategoryEntityArr, c4.c cVar) {
        v0Var.b.insert(cVar, bookLibraryCategoryEntityArr);
        return null;
    }

    public static /* synthetic */ List g(String str, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM bookLibraryCategory WHERE username LIKE ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "name");
            int iD3 = androidx.room.util.p.d(gVarN2, "username");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                BookLibraryCategoryEntity bookLibraryCategoryEntity = new BookLibraryCategoryEntity();
                bookLibraryCategoryEntity.setIndex((int) gVarN2.getLong(iD));
                String strY = null;
                bookLibraryCategoryEntity.setName(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                if (!gVarN2.isNull(iD3)) {
                    strY = gVarN2.Y(iD3);
                }
                bookLibraryCategoryEntity.setUsername(strY);
                arrayList.add(bookLibraryCategoryEntity);
            }
            gVarN2.close();
            return arrayList;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ List i(String str, int i, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM bookLibraryCategory WHERE username LIKE ? AND `index` = ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            gVarN2.l(2, i);
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "name");
            int iD3 = androidx.room.util.p.d(gVarN2, "username");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                BookLibraryCategoryEntity bookLibraryCategoryEntity = new BookLibraryCategoryEntity();
                bookLibraryCategoryEntity.setIndex((int) gVarN2.getLong(iD));
                String strY = null;
                bookLibraryCategoryEntity.setName(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                if (!gVarN2.isNull(iD3)) {
                    strY = gVarN2.Y(iD3);
                }
                bookLibraryCategoryEntity.setUsername(strY);
                arrayList.add(bookLibraryCategoryEntity);
            }
            gVarN2.close();
            return arrayList;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    @androidx.annotation.n0
    public static List<Class<?>> k() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.zentraedi.outreader.database.p0
    public int a(final BookLibraryCategoryEntity... entities) {
        return ((Integer) androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(this.a.c.e((c4.c) obj, entities));
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.p0
    public void b(final BookLibraryCategoryEntity... entities) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v0.f(this.a, entities, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.p0
    public int c(final BookLibraryCategoryEntity... entities) {
        return ((Integer) androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(this.a.d.e((c4.c) obj, entities));
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.p0
    public List<BookLibraryCategoryEntity> d(final String username) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v0.g(username, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.p0
    public List<BookLibraryCategoryEntity> e(final String username, final int categoryId) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v0.i(username, categoryId, (c4.c) obj);
            }
        });
    }
}
