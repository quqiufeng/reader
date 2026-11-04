package com.zentraedi.outreader.database;

import androidx.room.RoomDatabase;
import com.zentraedi.outreader.model.BookChapterEntity;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class j implements com.zentraedi.outreader.database.a {
    private final RoomDatabase a;
    private final androidx.room.y<BookChapterEntity> b = new a();

    class a extends androidx.room.y<BookChapterEntity> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.n0 final c4.g statement, final BookChapterEntity entity) {
            statement.l(1, entity.getIndex());
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
            if (entity.getSourceId() == null) {
                statement.G(4);
            } else {
                statement.G2(4, entity.getSourceId());
            }
            if (entity.getChapterList() == null) {
                statement.G(5);
            } else {
                statement.G2(5, entity.getChapterList());
            }
            if (entity.getChapterState() == null) {
                statement.G(6);
            } else {
                statement.G2(6, entity.getChapterState());
            }
        }

        @androidx.annotation.n0
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `bookChapter` (`index`,`userId`,`bookId`,`sourceId`,`chapterList`,`chapterState`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }
    }

    public j(@androidx.annotation.n0 final RoomDatabase __db) {
        this.a = __db;
    }

    public static /* synthetic */ Integer i(String str, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM bookChapter WHERE userId = ?");
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

    public static /* synthetic */ Object j(j jVar, BookChapterEntity[] bookChapterEntityArr, c4.c cVar) {
        jVar.b.insert(cVar, bookChapterEntityArr);
        return null;
    }

    public static /* synthetic */ BookChapterEntity k(String str, String str2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("SELECT * FROM bookChapter WHERE userId =? AND bookId =?");
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
            int iD = androidx.room.util.p.d(gVarN2, "index");
            int iD2 = androidx.room.util.p.d(gVarN2, "userId");
            int iD3 = androidx.room.util.p.d(gVarN2, "bookId");
            int iD4 = androidx.room.util.p.d(gVarN2, "sourceId");
            int iD5 = androidx.room.util.p.d(gVarN2, "chapterList");
            int iD6 = androidx.room.util.p.d(gVarN2, "chapterState");
            BookChapterEntity bookChapterEntity = null;
            String strY = null;
            if (gVarN2.k2()) {
                BookChapterEntity bookChapterEntity2 = new BookChapterEntity();
                bookChapterEntity2.setIndex((int) gVarN2.getLong(iD));
                bookChapterEntity2.setUserId(gVarN2.isNull(iD2) ? null : gVarN2.Y(iD2));
                bookChapterEntity2.setBookId(gVarN2.isNull(iD3) ? null : gVarN2.Y(iD3));
                bookChapterEntity2.setSourceId(gVarN2.isNull(iD4) ? null : gVarN2.Y(iD4));
                bookChapterEntity2.setChapterList(gVarN2.isNull(iD5) ? null : gVarN2.Y(iD5));
                if (!gVarN2.isNull(iD6)) {
                    strY = gVarN2.Y(iD6);
                }
                bookChapterEntity2.setChapterState(strY);
                bookChapterEntity = bookChapterEntity2;
            }
            gVarN2.close();
            return bookChapterEntity;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object l(String str, String str2, String str3, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM bookChapter WHERE userId =? AND bookId = ? AND sourceId = ?");
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
            gVarN2.close();
            return null;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object m(String str, String str2, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM bookChapter WHERE userId =? AND bookId = ?");
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
            gVarN2.close();
            return null;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Object n(String str, String str2, String str3, String str4, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("UPDATE bookChapter SET chapterList = ? WHERE userId =? AND bookId = ? AND sourceId =?");
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
            gVarN2.close();
            return null;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    public static /* synthetic */ Integer o(String str, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("DELETE FROM bookChapter WHERE bookId = ?");
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

    public static /* synthetic */ Object p(String str, String str2, String str3, String str4, c4.c cVar) {
        c4.g gVarN2 = cVar.n2("UPDATE bookChapter SET chapterState = ? WHERE userId =? AND bookId = ? AND sourceId =?");
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
            gVarN2.close();
            return null;
        } catch (Throwable th2) {
            gVarN2.close();
            throw th2;
        }
    }

    @androidx.annotation.n0
    public static List<Class<?>> q() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.zentraedi.outreader.database.a
    public int a(final String userId) {
        return ((Integer) androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.i(userId, (c4.c) obj);
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.a
    public void b(final String userId, final String bookId) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.m(userId, bookId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.a
    public void c(final BookChapterEntity... bookChapterEntities) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.j(this.a, bookChapterEntities, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.a
    public void d(final String userId, final String bookId, final String sourceId) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.l(userId, bookId, sourceId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.a
    public void e(final String userId, final String bookId, final String sourceId, final String chapterState) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.p(chapterState, userId, bookId, sourceId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.a
    public int f(final String bookId) {
        return ((Integer) androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.o(bookId, (c4.c) obj);
            }
        })).intValue();
    }

    @Override // com.zentraedi.outreader.database.a
    public void g(final String userId, final String bookId, final String sourceId, final String chapterList) {
        androidx.room.util.c.h(this.a, false, true, new Function1() { // from class: com.zentraedi.outreader.database.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.n(chapterList, userId, bookId, sourceId, (c4.c) obj);
            }
        });
    }

    @Override // com.zentraedi.outreader.database.a
    public BookChapterEntity h(final String userId, final String bookId) {
        return (BookChapterEntity) androidx.room.util.c.h(this.a, true, false, new Function1() { // from class: com.zentraedi.outreader.database.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.k(userId, bookId, (c4.c) obj);
            }
        });
    }
}
