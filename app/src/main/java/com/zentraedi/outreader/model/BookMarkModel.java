package com.zentraedi.outreader.model;

import com.zentraedi.basic.function.server.BaseModel;
import fo.k;
import fo.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class BookMarkModel extends BaseModel implements Comparable<BookMarkModel> {

    @l
    private String book_id;

    @l
    private String bookmark;

    @l
    private Integer bookmark_id;

    @l
    private String category_id;

    @l
    private Long created_on;

    @l
    private Long updated_on;

    static final /* synthetic */ class a extends FunctionReferenceImpl implements Function1<String, Integer> {
        public static final a a = new a();

        a() {
            super(1, StringsKt.class, "toIntOrNull", "toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return StringsKt.toIntOrNull(p0);
        }
    }

    static final /* synthetic */ class b extends FunctionReferenceImpl implements Function1<String, Integer> {
        public static final b a = new b();

        b() {
            super(1, StringsKt.class, "toIntOrNull", "toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return StringsKt.toIntOrNull(p0);
        }
    }

    static final /* synthetic */ class c extends FunctionReferenceImpl implements Function1<String, Double> {
        public static final c a = new c();

        c() {
            super(1, StringsKt.class, "toDoubleOrNull", "toDoubleOrNull(Ljava/lang/String;)Ljava/lang/Double;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Double invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return StringsKt.toDoubleOrNull(p0);
        }
    }

    static final /* synthetic */ class d extends FunctionReferenceImpl implements Function1<String, Integer> {
        public static final d a = new d();

        d() {
            super(1, StringsKt.class, "toIntOrNull", "toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return StringsKt.toIntOrNull(p0);
        }
    }

    static final /* synthetic */ class e extends FunctionReferenceImpl implements Function1<String, Integer> {
        public static final e a = new e();

        e() {
            super(1, StringsKt.class, "toIntOrNull", "toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return StringsKt.toIntOrNull(p0);
        }
    }

    private final <T extends Comparable<? super T>> int compareNumericString(String str, String str2, Function1<? super String, ? extends T> function1) {
        T tInvoke = null;
        T tInvoke2 = (str == null || StringsKt.isBlank(str)) ? null : function1.invoke(str);
        if (str2 != null && !StringsKt.isBlank(str2)) {
            tInvoke = function1.invoke(str2);
        }
        if (tInvoke2 == null && tInvoke == null) {
            return 0;
        }
        if (tInvoke2 == null) {
            return -1;
        }
        if (tInvoke == null) {
            return 1;
        }
        return tInvoke2.compareTo(tInvoke);
    }

    @l
    public final String getBook_id() {
        return this.book_id;
    }

    @l
    public final String getBookmark() {
        return this.bookmark;
    }

    @l
    public final Integer getBookmark_id() {
        return this.bookmark_id;
    }

    @l
    public final String getCategory_id() {
        return this.category_id;
    }

    @l
    public final Long getCreated_on() {
        return this.created_on;
    }

    @l
    public final Long getUpdated_on() {
        return this.updated_on;
    }

    public final void setBook_id(@l String str) {
        this.book_id = str;
    }

    public final void setBookmark(@l String str) {
        this.bookmark = str;
    }

    public final void setBookmark_id(@l Integer num) {
        this.bookmark_id = num;
    }

    public final void setCategory_id(@l String str) {
        this.category_id = str;
    }

    public final void setCreated_on(@l Long l) {
        this.created_on = l;
    }

    public final void setUpdated_on(@l Long l) {
        this.updated_on = l;
    }

    @Override // java.lang.Comparable
    public int compareTo(@k BookMarkModel other) {
        String str;
        Intrinsics.checkNotNullParameter(other, "other");
        String str2 = this.bookmark;
        if ((str2 == null || StringsKt.isBlank(str2)) && ((str = other.bookmark) == null || StringsKt.isBlank(str))) {
            return 0;
        }
        String str3 = this.bookmark;
        if (str3 == null || StringsKt.isBlank(str3)) {
            return -1;
        }
        String str4 = other.bookmark;
        if (str4 == null || StringsKt.isBlank(str4)) {
            return 1;
        }
        BookMarkInfoModel.a aVar = BookMarkInfoModel.Companion;
        BookMarkInfoModel bookMarkInfoModelA = aVar.a(this.bookmark);
        BookMarkInfoModel bookMarkInfoModelA2 = aVar.a(other.bookmark);
        if (bookMarkInfoModelA == null && bookMarkInfoModelA2 == null) {
            return 0;
        }
        if (bookMarkInfoModelA == null) {
            return -1;
        }
        if (bookMarkInfoModelA2 == null) {
            return 1;
        }
        int iCompareNumericString = compareNumericString(bookMarkInfoModelA.getChapterId(), bookMarkInfoModelA2.getChapterId(), a.a);
        if (iCompareNumericString != 0) {
            return iCompareNumericString;
        }
        int iCompareNumericString2 = compareNumericString(bookMarkInfoModelA.getFileIndex(), bookMarkInfoModelA2.getFileIndex(), b.a);
        if (iCompareNumericString2 != 0) {
            return iCompareNumericString2;
        }
        int iCompareNumericString3 = compareNumericString(bookMarkInfoModelA.getTextPosition(), bookMarkInfoModelA2.getTextPosition(), e.a);
        if (iCompareNumericString3 != 0) {
            return iCompareNumericString3;
        }
        int iCompareNumericString4 = compareNumericString(bookMarkInfoModelA.getPageIndex(), bookMarkInfoModelA2.getPageIndex(), d.a);
        if (iCompareNumericString4 != 0) {
            return iCompareNumericString4;
        }
        int iCompareNumericString5 = compareNumericString(bookMarkInfoModelA.getFileProgress(), bookMarkInfoModelA2.getFileProgress(), c.a);
        if (iCompareNumericString5 != 0) {
            return iCompareNumericString5;
        }
        return 0;
    }
}
