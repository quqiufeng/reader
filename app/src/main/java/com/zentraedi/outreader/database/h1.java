package com.zentraedi.outreader.database;

import androidx.room.RoomDatabase;
import com.zentraedi.outreader.model.LibraryCategoryAndBookRelate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class h1 implements y0 {
    private final RoomDatabase a;
    private final androidx.room.y<LibraryCategoryAndBookRelate> b = new a();
    private final androidx.room.w<LibraryCategoryAndBookRelate> c = new b();
    private final androidx.room.w<LibraryCategoryAndBookRelate> d = new c();

    class a extends androidx.room.y<LibraryCategoryAndBookRelate> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final LibraryCategoryAndBookRelate entity) {
            statement.l(1, entity.getIndex());
            statement.l(2, entity.getBookIndex());
            statement.l(3, entity.getCategoryIndex());
        }

        @androidx.annotation.n0
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `categoryBookRelate` (`index`,`bookIndex`,`categoryIndex`) VALUES (nullif(?, 0),?,?)";
        }
    }

    class b extends androidx.room.w<LibraryCategoryAndBookRelate> {
        b() {
        }

        @androidx.annotation.n0
        protected String b() {
            return "DELETE FROM `categoryBookRelate` WHERE `index` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final LibraryCategoryAndBookRelate entity) {
            statement.l(1, entity.getIndex());
        }
    }

    class c extends androidx.room.w<LibraryCategoryAndBookRelate> {
        c() {
        }

        @androidx.annotation.n0
        protected String b() {
            return "UPDATE OR ABORT `categoryBookRelate` SET `index` = ?,`bookIndex` = ?,`categoryIndex` = ? WHERE `index` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final LibraryCategoryAndBookRelate entity) {
            statement.l(1, entity.getIndex());
            statement.l(2, entity.getBookIndex());
            statement.l(3, entity.getCategoryIndex());
            statement.l(4, entity.getIndex());
        }
    }

    public h1(@androidx.annotation.n0 final RoomDatabase __db) {
        this.a = __db;
    }

    public static /* synthetic */ Object h(h1 h1Var, LibraryCategoryAndBookRelate[] libraryCategoryAndBookRelateArr, c4.c cVar) {
        h1Var.b.insert(cVar, libraryCategoryAndBookRelateArr);
        return null;
    }

    public static /* synthetic */ LibraryCategoryAndBookRelate j(int i, int i2, c4.c cVar) {
        LibraryCategoryAndBookRelate libraryCategoryAndBookRelate;
        c4.g gVarN2 = cVar.n2("SELECT * FROM categoryBookRelate WHERE categoryIndex = ? AND bookIndex = ?");
        try {
            gVarN2.l(1, i);
            gVarN2.l(2, i2);
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "bookIndex");
            int iD3 = androidx.room.util.p.d(gVarN2, "categoryIndex");
            if (gVarN2.k2()) {
                libraryCategoryAndBookRelate = new LibraryCategoryAndBookRelate();
                libraryCategoryAndBookRelate.setIndex((int) gVarN2.getLong(iD));
                libraryCategoryAndBookRelate.setBookIndex((int) gVarN2.getLong(iD2));
                libraryCategoryAndBookRelate.setCategoryIndex((int) gVarN2.getLong(iD3));
            } else {
                libraryCategoryAndBookRelate = null;
            }
            return libraryCategoryAndBookRelate;
        } finally {
            gVarN2.close();
        }
    }

    public static /* synthetic */ Object l(int i, int i2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM categoryBookRelate WHERE bookIndex = ? AND categoryIndex = ?");
        try {
            gVarN2.l(1, i);
            gVarN2.l(2, i2);
            gVarN2.k2();
            return null;
        } finally {
            gVarN2.close();
        }
    }

    public static /* synthetic */ List m(int i, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM categoryBookRelate WHERE categoryIndex = ?");
        try {
            gVarN2.l(1, i);
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "bookIndex");
            int iD3 = androidx.room.util.p.d(gVarN2, "categoryIndex");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                LibraryCategoryAndBookRelate libraryCategoryAndBookRelate = new LibraryCategoryAndBookRelate();
                libraryCategoryAndBookRelate.setIndex((int) gVarN2.getLong(iD));
                libraryCategoryAndBookRelate.setBookIndex((int) gVarN2.getLong(iD2));
                libraryCategoryAndBookRelate.setCategoryIndex((int) gVarN2.getLong(iD3));
                arrayList.add(libraryCategoryAndBookRelate);
            }
            gVarN2.close();
            return arrayList;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ List n(int i, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM categoryBookRelate WHERE bookIndex = ?");
        try {
            gVarN2.l(1, i);
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "bookIndex");
            int iD3 = androidx.room.util.p.d(gVarN2, "categoryIndex");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                LibraryCategoryAndBookRelate libraryCategoryAndBookRelate = new LibraryCategoryAndBookRelate();
                libraryCategoryAndBookRelate.setIndex((int) gVarN2.getLong(iD));
                libraryCategoryAndBookRelate.setBookIndex((int) gVarN2.getLong(iD2));
                libraryCategoryAndBookRelate.setCategoryIndex((int) gVarN2.getLong(iD3));
                arrayList.add(libraryCategoryAndBookRelate);
            }
            gVarN2.close();
            return arrayList;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ List o(int i, int i2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM categoryBookRelate WHERE bookIndex = ? LIMIT ?");
        try {
            gVarN2.l(1, i);
            gVarN2.l(2, i2);
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "bookIndex");
            int iD3 = androidx.room.util.p.d(gVarN2, "categoryIndex");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                LibraryCategoryAndBookRelate libraryCategoryAndBookRelate = new LibraryCategoryAndBookRelate();
                libraryCategoryAndBookRelate.setIndex((int) gVarN2.getLong(iD));
                libraryCategoryAndBookRelate.setBookIndex((int) gVarN2.getLong(iD2));
                libraryCategoryAndBookRelate.setCategoryIndex((int) gVarN2.getLong(iD3));
                arrayList.add(libraryCategoryAndBookRelate);
            }
            gVarN2.close();
            return arrayList;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    @androidx.annotation.n0
    public static List<Class<?>> p() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.zentraedi.outreader.database.y0
    public int a(final LibraryCategoryAndBookRelate... entities) {
        return ((Integer) androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.g1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(this.a.c.e((c4.c) obj, entities));
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.y0
    public List<LibraryCategoryAndBookRelate> b(final int bookId, final int size) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h1.o(bookId, size, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.y0
    public int c(final LibraryCategoryAndBookRelate... entities) {
        return ((Integer) androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(this.a.d.e((c4.c) obj, entities));
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.y0
    public LibraryCategoryAndBookRelate d(final int categoryId, final int bookId) {
        return (LibraryCategoryAndBookRelate) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h1.j(categoryId, bookId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.y0
    public void deleteData(final int categoryIndex, final int bookIndex) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h1.l(bookIndex, categoryIndex, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.y0
    public List<LibraryCategoryAndBookRelate> e(final int bookId) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h1.n(bookId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.y0
    public void f(final LibraryCategoryAndBookRelate... entities) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h1.h(this.a, entities, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.y0
    public List<LibraryCategoryAndBookRelate> g(final int categoryId) {
        return (List) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h1.m(categoryId, (c4.c) obj);
            }
        });
    }
}
