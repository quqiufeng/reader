package com.zentraedi.outreader.database;

import androidx.room.RoomDatabase;
import com.zentraedi.outreader.model.offline.BookInfoEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class o0 implements a0 {
    private final RoomDatabase b;
    private final androidx.room.y<BookInfoEntity> c = new a();
    private final androidx.room.w<BookInfoEntity> d = new b();
    private final androidx.room.w<BookInfoEntity> e = new c();

    class a extends androidx.room.y<BookInfoEntity> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final BookInfoEntity entity) {
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
            if (entity.getCategoryId() == null) {
                statement.G(4);
            } else {
                statement.G2(4, entity.getCategoryId());
            }
            if (entity.getBookId() == null) {
                statement.G(5);
            } else {
                statement.G2(5, entity.getBookId());
            }
            if (entity.getBookName() == null) {
                statement.G(6);
            } else {
                statement.G2(6, entity.getBookName());
            }
            if (entity.getBookCover() == null) {
                statement.G(7);
            } else {
                statement.G2(7, entity.getBookCover());
            }
            if (entity.getBookType() == null) {
                statement.G(8);
            } else {
                statement.G2(8, entity.getBookType());
            }
            statement.l(9, entity.getAddBookshelf());
            statement.l(10, entity.getBookShare());
            statement.l(11, entity.getDownloadTime());
            if (entity.getDownloadId() == null) {
                statement.G(12);
            } else {
                statement.G2(12, entity.getDownloadId());
            }
            if (entity.getNasPath() == null) {
                statement.G(13);
            } else {
                statement.G2(13, entity.getNasPath());
            }
        }

        @androidx.annotation.n0
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `book_info` (`id`,`username`,`nasId`,`categoryId`,`bookId`,`bookName`,`bookCover`,`bookType`,`addBookshelf`,`bookShare`,`downloadTime`,`downloadId`,`nasPath`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    class b extends androidx.room.w<BookInfoEntity> {
        b() {
        }

        @androidx.annotation.n0
        protected String b() {
            return "DELETE FROM `book_info` WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final BookInfoEntity entity) {
            statement.l(1, entity.getId());
        }
    }

    class c extends androidx.room.w<BookInfoEntity> {
        c() {
        }

        @androidx.annotation.n0
        protected String b() {
            return "UPDATE OR ABORT `book_info` SET `id` = ?,`username` = ?,`nasId` = ?,`categoryId` = ?,`bookId` = ?,`bookName` = ?,`bookCover` = ?,`bookType` = ?,`addBookshelf` = ?,`bookShare` = ?,`downloadTime` = ?,`downloadId` = ?,`nasPath` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.n0 final c4.g statement, @androidx.annotation.n0 final BookInfoEntity entity) {
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
            if (entity.getCategoryId() == null) {
                statement.G(4);
            } else {
                statement.G2(4, entity.getCategoryId());
            }
            if (entity.getBookId() == null) {
                statement.G(5);
            } else {
                statement.G2(5, entity.getBookId());
            }
            if (entity.getBookName() == null) {
                statement.G(6);
            } else {
                statement.G2(6, entity.getBookName());
            }
            if (entity.getBookCover() == null) {
                statement.G(7);
            } else {
                statement.G2(7, entity.getBookCover());
            }
            if (entity.getBookType() == null) {
                statement.G(8);
            } else {
                statement.G2(8, entity.getBookType());
            }
            statement.l(9, entity.getAddBookshelf());
            statement.l(10, entity.getBookShare());
            statement.l(11, entity.getDownloadTime());
            if (entity.getDownloadId() == null) {
                statement.G(12);
            } else {
                statement.G2(12, entity.getDownloadId());
            }
            if (entity.getNasPath() == null) {
                statement.G(13);
            } else {
                statement.G2(13, entity.getNasPath());
            }
            statement.l(14, entity.getId());
        }
    }

    public o0(@androidx.annotation.n0 final RoomDatabase __db) {
        this.b = __db;
    }

    @androidx.annotation.n0
    public static List<Class<?>> A() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ Integer q(String str, String str2, String str3, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM book_info WHERE username =? AND nasId =? AND nasPath = ?");
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

    public static /* synthetic */ List r(String str, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM book_info WHERE downloadId = ?");
        try {
            if (str == null) {
                gVarN2.G(1);
            } else {
                gVarN2.G2(1, str);
            }
            int iD = androidx.room.util.p.d(gVarN2, "id");
            int iD2 = androidx.room.util.p.d(gVarN2, "username");
            int iD3 = androidx.room.util.p.d(gVarN2, "nasId");
            int iD4 = androidx.room.util.p.d(gVarN2, "categoryId");
            int iD5 = androidx.room.util.p.d(gVarN2, "bookId");
            int iD6 = androidx.room.util.p.d(gVarN2, "bookName");
            int iD7 = androidx.room.util.p.d(gVarN2, "bookCover");
            int iD8 = androidx.room.util.p.d(gVarN2, "bookType");
            int iD9 = androidx.room.util.p.d(gVarN2, "addBookshelf");
            int iD10 = androidx.room.util.p.d(gVarN2, "bookShare");
            int iD11 = androidx.room.util.p.d(gVarN2, "downloadTime");
            int iD12 = androidx.room.util.p.d(gVarN2, "downloadId");
            int iD13 = androidx.room.util.p.d(gVarN2, "nasPath");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                BookInfoEntity bookInfoEntity = new BookInfoEntity();
                int i = iD13;
                ArrayList arrayList2 = arrayList;
                bookInfoEntity.setId(gVarN2.getLong(iD));
                bookInfoEntity.setUsername(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                bookInfoEntity.setNasId(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                bookInfoEntity.setCategoryId(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                bookInfoEntity.setBookId(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                bookInfoEntity.setBookName(gVarN2.isNull(iD6) ? null : gVarN2.Y(iD6));
                bookInfoEntity.setBookCover(gVarN2.isNull(iD7) ? null : gVarN2.Y(iD7));
                bookInfoEntity.setBookType(gVarN2.isNull(iD8) ? null : gVarN2.Y(iD8));
                bookInfoEntity.setAddBookshelf((int) gVarN2.getLong(iD9));
                bookInfoEntity.setBookShare((int) gVarN2.getLong(iD10));
                bookInfoEntity.setDownloadTime(gVarN2.getLong(iD11));
                bookInfoEntity.setDownloadId(gVarN2.isNull(iD12) ? null : gVarN2.Y(iD12));
                bookInfoEntity.setNasPath(gVarN2.isNull(i) ? null : gVarN2.Y(i));
                arrayList2.add(bookInfoEntity);
                iD13 = i;
                arrayList = arrayList2;
            }
            ArrayList arrayList3 = arrayList;
            gVarN2.close();
            return arrayList3;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Integer s(String str, String str2, String str3, String str4, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM book_info WHERE userName = ? AND nasId = ? AND categoryId = ? AND bookId = ?");
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
            if (str4 == null) {
                gVarN2.G(4);
            } else {
                gVarN2.G2(4, str4);
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

    public static /* synthetic */ List t(String str, String str2, String str3, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM book_info WHERE userName = ? AND nasId = ? AND bookId = ?");
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
            int iD = androidx.room.util.p.d(gVarN2, "id");
            int iD2 = androidx.room.util.p.d(gVarN2, "username");
            int iD3 = androidx.room.util.p.d(gVarN2, "nasId");
            int iD4 = androidx.room.util.p.d(gVarN2, "categoryId");
            int iD5 = androidx.room.util.p.d(gVarN2, "bookId");
            int iD6 = androidx.room.util.p.d(gVarN2, "bookName");
            int iD7 = androidx.room.util.p.d(gVarN2, "bookCover");
            int iD8 = androidx.room.util.p.d(gVarN2, "bookType");
            int iD9 = androidx.room.util.p.d(gVarN2, "addBookshelf");
            int iD10 = androidx.room.util.p.d(gVarN2, "bookShare");
            int iD11 = androidx.room.util.p.d(gVarN2, "downloadTime");
            int iD12 = androidx.room.util.p.d(gVarN2, "downloadId");
            int iD13 = androidx.room.util.p.d(gVarN2, "nasPath");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                BookInfoEntity bookInfoEntity = new BookInfoEntity();
                int i = iD13;
                ArrayList arrayList2 = arrayList;
                bookInfoEntity.setId(gVarN2.getLong(iD));
                bookInfoEntity.setUsername(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                bookInfoEntity.setNasId(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                bookInfoEntity.setCategoryId(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                bookInfoEntity.setBookId(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                bookInfoEntity.setBookName(gVarN2.isNull(iD6) ? null : gVarN2.Y(iD6));
                bookInfoEntity.setBookCover(gVarN2.isNull(iD7) ? null : gVarN2.Y(iD7));
                bookInfoEntity.setBookType(gVarN2.isNull(iD8) ? null : gVarN2.Y(iD8));
                bookInfoEntity.setAddBookshelf((int) gVarN2.getLong(iD9));
                int i2 = iD;
                int i3 = iD2;
                bookInfoEntity.setBookShare((int) gVarN2.getLong(iD10));
                bookInfoEntity.setDownloadTime(gVarN2.getLong(iD11));
                bookInfoEntity.setDownloadId(gVarN2.isNull(iD12) ? null : gVarN2.Y(iD12));
                bookInfoEntity.setNasPath(gVarN2.isNull(i) ? null : gVarN2.Y(i));
                arrayList2.add(bookInfoEntity);
                arrayList = arrayList2;
                iD2 = i3;
                iD13 = i;
                iD = i2;
            }
            ArrayList arrayList3 = arrayList;
            gVarN2.close();
            return arrayList3;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Integer v(String str, String str2, String str3, String str4, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM book_info WHERE username =? AND nasId =? AND categoryId = ? AND nasPath = ?");
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
            if (str4 == null) {
                gVarN2.G(4);
            } else {
                gVarN2.G2(4, str4);
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

    public static /* synthetic */ List w(String str, String str2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM book_info WHERE userName = ? AND nasId = ?");
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
            int iD4 = androidx.room.util.p.d(gVarN2, "categoryId");
            int iD5 = androidx.room.util.p.d(gVarN2, "bookId");
            int iD6 = androidx.room.util.p.d(gVarN2, "bookName");
            int iD7 = androidx.room.util.p.d(gVarN2, "bookCover");
            int iD8 = androidx.room.util.p.d(gVarN2, "bookType");
            int iD9 = androidx.room.util.p.d(gVarN2, "addBookshelf");
            int iD10 = androidx.room.util.p.d(gVarN2, "bookShare");
            int iD11 = androidx.room.util.p.d(gVarN2, "downloadTime");
            int iD12 = androidx.room.util.p.d(gVarN2, "downloadId");
            int iD13 = androidx.room.util.p.d(gVarN2, "nasPath");
            ArrayList arrayList = new ArrayList();
            while (gVarN2.k2()) {
                BookInfoEntity bookInfoEntity = new BookInfoEntity();
                int i = iD13;
                ArrayList arrayList2 = arrayList;
                bookInfoEntity.setId(gVarN2.getLong(iD));
                bookInfoEntity.setUsername(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                bookInfoEntity.setNasId(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                bookInfoEntity.setCategoryId(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                bookInfoEntity.setBookId(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                bookInfoEntity.setBookName(gVarN2.isNull(iD6) ? null : gVarN2.Y(iD6));
                bookInfoEntity.setBookCover(gVarN2.isNull(iD7) ? null : gVarN2.Y(iD7));
                bookInfoEntity.setBookType(gVarN2.isNull(iD8) ? null : gVarN2.Y(iD8));
                bookInfoEntity.setAddBookshelf((int) gVarN2.getLong(iD9));
                bookInfoEntity.setBookShare((int) gVarN2.getLong(iD10));
                bookInfoEntity.setDownloadTime(gVarN2.getLong(iD11));
                bookInfoEntity.setDownloadId(gVarN2.isNull(iD12) ? null : gVarN2.Y(iD12));
                iD13 = i;
                bookInfoEntity.setNasPath(gVarN2.isNull(iD13) ? null : gVarN2.Y(iD13));
                arrayList = arrayList2;
                arrayList.add(bookInfoEntity);
            }
            gVarN2.close();
            return arrayList;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Integer y(String str, String str2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM book_info WHERE userName = ? AND nasId = ?");
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

    public static /* synthetic */ Integer z(String str, String str2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT count(*) FROM book_info WHERE userName = ? AND nasId = ?");
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

    @Override // com.zentraedi.outreader.database.a0
    public List<BookInfoEntity> a(final String userName, final String nasId, final String bookId) {
        return (List) androidx.room.util.c.h(this.b, true, false, new Function1() { // from class: com.zentraedi.outreader.database.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o0.t(userName, nasId, bookId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.a0
    public List<Long> c(final List<BookInfoEntity> entities) {
        entities.getClass();
        return (List) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.c.insertAndReturnIdsList((c4.c) obj, entities);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.a0
    public List<BookInfoEntity> d(final String downloadId) {
        return (List) androidx.room.util.c.h(this.b, true, false, new Function1() { // from class: com.zentraedi.outreader.database.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o0.r(downloadId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.a0
    public List<BookInfoEntity> e(final String userName, final String nasId) {
        return (List) androidx.room.util.c.h(this.b, true, false, new Function1() { // from class: com.zentraedi.outreader.database.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o0.w(userName, nasId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.a0
    public int f(final String userName, final String nasId) {
        return ((Integer) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o0.y(userName, nasId, (c4.c) obj);
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.a0
    public int g(final String userName, final String nasId) {
        return ((Integer) androidx.room.util.c.h(this.b, true, false, new Function1() { // from class: com.zentraedi.outreader.database.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o0.z(userName, nasId, (c4.c) obj);
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.a0
    public int i(final String username, final String nasId, final String nasPath) {
        return ((Integer) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o0.q(username, nasId, nasPath, (c4.c) obj);
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.a0
    public int j(final String username, final String nasId, final String categoryId, final String nasPath) {
        return ((Integer) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o0.v(username, nasId, categoryId, nasPath, (c4.c) obj);
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.a0
    public int k(final BookInfoEntity entity) {
        entity.getClass();
        return ((Integer) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(this.a.d.c((c4.c) obj, entity));
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.a0
    public int l(final BookInfoEntity... entity) {
        entity.getClass();
        return ((Integer) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(this.a.d.e((c4.c) obj, entity));
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.a0
    public int m(final BookInfoEntity entity) {
        entity.getClass();
        return ((Integer) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(this.a.e.c((c4.c) obj, entity));
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.a0
    public int n(final String userName, final String nasId, final String categoryId, final String bookId) {
        return ((Integer) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o0.s(userName, nasId, categoryId, bookId, (c4.c) obj);
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.a0
    public long o(final BookInfoEntity entity) {
        entity.getClass();
        return ((Long) androidx.room.util.c.h(this.b, false, true, new Function1() { // from class: com.zentraedi.outreader.database.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(this.a.c.insertAndReturnId((c4.c) obj, entity));
            }
        })).longValue();
    }
}
