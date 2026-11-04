package com.zentraedi.reader;

import fo.k;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SUCCESS' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public final class OpenFileResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OpenFileResult[] $VALUES;
    public static final OpenFileResult CORRUPTED_FILE;
    public static final OpenFileResult DRM_PROTECTED;
    public static final OpenFileResult FILE_FORMAT_ERROR;
    public static final OpenFileResult FILE_NOT_EXISTS;
    public static final OpenFileResult PASSWORD_REQUIRED;
    public static final OpenFileResult SUCCESS;
    public static final OpenFileResult UNKNOWN_ERROR;
    private final int code;

    @k
    private final String message;

    private static final /* synthetic */ OpenFileResult[] $values() {
        return new OpenFileResult[]{SUCCESS, FILE_NOT_EXISTS, FILE_FORMAT_ERROR, DRM_PROTECTED, PASSWORD_REQUIRED, CORRUPTED_FILE, UNKNOWN_ERROR};
    }

    static {
        String strN = com.zentraedi.basic.function.utils.a.n(h.q.Vk1);
        Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
        SUCCESS = new OpenFileResult("SUCCESS", 0, 0, strN);
        String strN2 = com.zentraedi.basic.function.utils.a.n(h.q.hj0);
        Intrinsics.checkNotNullExpressionValue(strN2, "getString(...)");
        FILE_NOT_EXISTS = new OpenFileResult("FILE_NOT_EXISTS", 1, 1, strN2);
        String strN3 = com.zentraedi.basic.function.utils.a.n(h.q.IA2);
        Intrinsics.checkNotNullExpressionValue(strN3, "getString(...)");
        FILE_FORMAT_ERROR = new OpenFileResult("FILE_FORMAT_ERROR", 2, 2, strN3);
        String strN4 = com.zentraedi.basic.function.utils.a.n(h.q.yA2);
        Intrinsics.checkNotNullExpressionValue(strN4, "getString(...)");
        DRM_PROTECTED = new OpenFileResult("DRM_PROTECTED", 3, 3, strN4);
        String strN5 = com.zentraedi.basic.function.utils.a.n(h.q.fI);
        Intrinsics.checkNotNullExpressionValue(strN5, "getString(...)");
        PASSWORD_REQUIRED = new OpenFileResult("PASSWORD_REQUIRED", 4, 7, strN5);
        String strN6 = com.zentraedi.basic.function.utils.a.n(h.q.xz2);
        Intrinsics.checkNotNullExpressionValue(strN6, "getString(...)");
        CORRUPTED_FILE = new OpenFileResult("CORRUPTED_FILE", 5, 8, strN6);
        String strN7 = com.zentraedi.basic.function.utils.a.n(h.q.pu2);
        Intrinsics.checkNotNullExpressionValue(strN7, "getString(...)");
        UNKNOWN_ERROR = new OpenFileResult("UNKNOWN_ERROR", 6, 999, strN7);
        OpenFileResult[] openFileResultArr$values = $values();
        $VALUES = openFileResultArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(openFileResultArr$values);
    }

    private OpenFileResult(String str, int i, int i2, String str2) {
        super(str, i);
        this.code = i2;
        this.message = str2;
    }

    @k
    public static EnumEntries<OpenFileResult> getEntries() {
        return $ENTRIES;
    }

    public static OpenFileResult valueOf(String str) {
        return (OpenFileResult) Enum.valueOf(OpenFileResult.class, str);
    }

    public static OpenFileResult[] values() {
        return (OpenFileResult[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }

    @k
    public final String getMessage() {
        return this.message;
    }
}
