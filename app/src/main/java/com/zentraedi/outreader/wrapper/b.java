package com.zentraedi.outreader.wrapper;

import android.text.TextUtils;
import com.zentraedi.basic.component.http.i;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.business.model.CourseFileInfoModel;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.reader.d;
import com.zentraedi.business.utils.d5;
import com.zentraedi.business.w0;
import com.zentraedi.outreader.database.ReaderDatabase;
import com.zentraedi.outreader.model.BookEntity;
import com.zentraedi.outreader.model.offline.OfflineBookEntity;
import com.zentraedi.outreader.request.BookInfoModifyRequest;
import com.zentraedi.outreader.request.BookRecordModifyRequest;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.util.h;
import fo.k;
import fo.l;
import java.io.File;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
@SourceDebugExtension({"SMAP\nBookWrapperUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/BookWrapperUtil\n+ 2 FilePathConvertUtils.kt\ncom/zentraedi/business/utils/FilePathConvertUtils$Companion\n*L\n1#1,313:1\n586#2:314\n586#2:315\n*S KotlinDebug\n*F\n+ 1 BookWrapperUtil.kt\ncom/zentraedi/outreader/wrapper/BookWrapperUtil\n*L\n278#1:314\n294#1:315\n*E\n"})
public final class b {

    @k
    public static final b a = new b();

    @k
    private static String b = "Reader-Book";

    @DebugMetadata(c = "com.zentraedi.outreader.wrapper.BookWrapperUtil", f = "BookWrapperUtil.kt", i = {0, 0, 0, 0}, l = {214}, m = "syncQueryCategoryAll", n = {"categoryList", "resultList", "categoryEntity", "hasDefaultCategory"}, s = {"L$0", "L$1", "L$3", "I$0"}, v = 1)
    static final class a extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        int e;
        /* synthetic */ Object f;
        int h;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f = obj;
            this.h |= IntCompanionObject.MIN_VALUE;
            return b.this.n(this);
        }
    }

    private b() {
    }

    @JvmStatic
    public static final void c(@l BookModel bookModel) {
        if (bookModel == null) {
            return;
        }
        if (bookModel.getFromFileInfo() == null || !(bookModel.getFromFileInfo() instanceof CourseFileInfoModel)) {
            String strG = com.zentraedi.business.reader.c.g(String.valueOf(bookModel.getTime()), bookModel.getNasPath(), (String) null);
            if (new File(strG).exists()) {
                bookModel.setLocalPath(strG);
            }
        }
        if (TextUtils.isEmpty(bookModel.getLocalPath())) {
            return;
        }
        String strF = d.f(bookModel.getLocalPath());
        if (new File(strF).exists()) {
            bookModel.setCover(strF);
            return;
        }
        String strE = d.e(bookModel.getLocalPath());
        if (!new File(strE).exists()) {
            bookModel.setCover(null);
            return;
        }
        try {
            FilesKt.copyTo$default(new File(strE), new File(strF), false, 0, 6, null);
            bookModel.setCover(strF);
        } catch (Exception e) {
            nd.a.c(b, "configLocalPathAndCover-> " + strE + " copyTo " + strF + ": " + e.getLocalizedMessage());
        }
    }

    @JvmStatic
    @l
    public static final BookEntity d(@l BookModel bookModel) {
        if (bookModel == null) {
            return null;
        }
        BookEntity bookEntity = new BookEntity();
        bookEntity.setNasPath(bookModel.getNasPath());
        bookEntity.setMd5Path(bookModel.getMd5Path());
        return bookEntity;
    }

    @JvmStatic
    @l
    public static final BookModel e(@l BookEntity bookEntity) {
        if (bookEntity == null) {
            return null;
        }
        BookModel bookModel = new BookModel();
        bookModel.setCategory_name(bookEntity.getCategoryName());
        bookModel.setCategory_index(bookEntity.getCategoryIndex());
        bookModel.setShowName(bookEntity.getShowName());
        bookModel.setWords(String.valueOf(bookEntity.getWords()));
        bookModel.setChapters(String.valueOf(bookEntity.getChapterCount()));
        bookModel.setNasPath(bookEntity.getNasPath());
        long j = 1000;
        bookModel.setReadTime(bookEntity.getLatestReadTimestamp() / j);
        bookModel.setRead_chapter(bookEntity.getLatestReadChapter());
        bookModel.setRead_chapter_id(bookEntity.getLatestReadChapterId());
        bookModel.setRead_page(String.valueOf(bookEntity.getLatestReadPage()));
        bookModel.setReadProgressPercent(bookEntity.getReadProgressPercent());
        bookModel.setRead_finished(bookEntity.getHasReadFinished());
        bookModel.setText_position(String.valueOf(bookEntity.getTextNumberPositionHistory()));
        bookModel.setFont_size(String.valueOf(bookEntity.getMupdfSizeLevel()));
        bookModel.setAdd_shelf(bookEntity.getAddToShelf() ? 1 : 0);
        bookModel.setAddShelfTime(bookEntity.getAddShelfTimeStamp() / j);
        bookModel.setAddLibraryTime(bookEntity.getAddLibraryTimeStamp() / j);
        return bookModel;
    }

    @JvmStatic
    @l
    public static final BookModel f(@l FileInfoModel fileInfoModel) {
        if (fileInfoModel == null) {
            return null;
        }
        BookModel bookModel = new BookModel();
        bookModel.setNasPath(fileInfoModel.getPath());
        bookModel.setLocalPath(fileInfoModel.getLocalPath());
        if (TextUtils.isEmpty(bookModel.getLocalPath())) {
            bookModel.setLocalPath(com.zentraedi.business.reader.c.f(fileInfoModel));
        }
        bookModel.setShowName(fileInfoModel.getName());
        return bookModel;
    }

    @JvmStatic
    public static final boolean l(@l BookEntity bookEntity) {
        if (bookEntity != null && !TextUtils.isEmpty(bookEntity.getNasPath())) {
            try {
                BookEntity bookEntityE = ReaderDatabase.A().u().e(h.a(), bookEntity.getNasPath());
                if (bookEntityE != null) {
                    bookEntity.setIndex(bookEntityE.getIndex());
                }
                ReaderDatabase.A().u().f(bookEntity);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                nd.a.c(b, "syncInsertOrUpdateBook: " + e.getLocalizedMessage());
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(int i, String str, Continuation<? super List<BookEntity>> continuation) {
        try {
            List<BookEntity> listM = ReaderDatabase.A().u().m(h.a(), i);
            if (j0.l(listM)) {
                return listM;
            }
            for (BookEntity bookEntity : listM) {
                bookEntity.setCategoryIndex(Boxing.boxInt(i));
                bookEntity.setCategoryName(str);
            }
            return listM;
        } catch (Exception e) {
            e.printStackTrace();
            nd.a.c(b, "syncQueryBooksFromCategory: " + e.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(BookEntity bookEntity, BookEntity bookEntity2) {
        long latestReadTimestamp = bookEntity.getLatestReadTimestamp();
        long latestReadTimestamp2 = bookEntity2.getLatestReadTimestamp();
        if (latestReadTimestamp2 > latestReadTimestamp) {
            return 1;
        }
        return latestReadTimestamp == latestReadTimestamp2 ? 0 : -1;
    }

    @k
    public final String g() {
        return b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.zentraedi.basic.component.http.i, com.zentraedi.outreader.request.BookInfoModifyRequest] */
    public final void h(@l BookModel bookModel, @l com.zentraedi.business.http.b<Object> bVar) {
        if (bookModel == null) {
            return;
        }
        if (NasConnectManager.getInstance().isOfflineLogin()) {
            if (bVar != null) {
                bVar.onServerError();
            }
            nd.a.e(b, "recordBookBasicInfo offline");
        } else {
            ?? bookInfoModifyRequest = new BookInfoModifyRequest();
            bookInfoModifyRequest.setBook_id(bookModel.getBook_id());
            bookInfoModifyRequest.setWords(bookModel.getWords());
            bookInfoModifyRequest.setChapters(bookModel.getChapters());
            bookInfoModifyRequest.setTitle(bookModel.getShowName());
            com.zentraedi.business.http.a.b().h((i) bookInfoModifyRequest, bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.zentraedi.basic.component.http.i, com.zentraedi.outreader.request.BookRecordModifyRequest] */
    public final void i(@l BookModel bookModel, @l com.zentraedi.business.http.b<Object> bVar) {
        if (bookModel == null || TextUtils.isEmpty(bookModel.getBook_id())) {
            return;
        }
        if (NasConnectManager.getInstance().isOfflineLogin()) {
            if (bVar != null) {
                bVar.onServerError();
            }
            nd.a.e(b, "recordBookProgressInfo offline");
            return;
        }
        ?? bookRecordModifyRequest = new BookRecordModifyRequest();
        bookRecordModifyRequest.setCategory_id(bookModel.getCategory_id());
        bookRecordModifyRequest.setBook_id(bookModel.getBook_id());
        bookRecordModifyRequest.setRead_chapter(bookModel.getRead_chapter());
        bookRecordModifyRequest.setRead_chapter_id(bookModel.recordReadChapterId());
        bookRecordModifyRequest.setRead_page(bookModel.getRead_page());
        bookRecordModifyRequest.setRead_progress(bookModel.getReadProgressPercent());
        bookRecordModifyRequest.setRead_finished(bookModel.getRead_finished());
        bookRecordModifyRequest.setText_position(bookModel.getRecordTextPosition());
        bookRecordModifyRequest.setFont_size(Integer.valueOf(bookModel.getFontSize()));
        bookRecordModifyRequest.setReadProgressExt(bookModel.getReadProgressExt());
        com.zentraedi.business.http.a.b().h((i) bookRecordModifyRequest, bVar);
    }

    public final void j(@k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        b = str;
    }

    public final boolean k() {
        try {
            List<BookEntity> listB = ReaderDatabase.A().u().b();
            if (!j0.l(listB)) {
                for (BookEntity bookEntity : listB) {
                    if (Intrinsics.areEqual(h.a(), bookEntity.getUserId())) {
                        String nasPath = bookEntity.getNasPath();
                        bookEntity.setNasPath(nasPath != null ? d5.a.z(nasPath.toString()) : null);
                    }
                }
                ReaderDatabase.A().u().c(listB);
            }
            List<OfflineBookEntity> listD = ReaderDatabase.A().B().d(h.a());
            if (j0.l(listD)) {
                return true;
            }
            ReaderDatabase.A().B().e(listD);
            for (OfflineBookEntity offlineBookEntity : listD) {
                if (Intrinsics.areEqual(h.a(), offlineBookEntity.getUsername()) && Intrinsics.areEqual(w0.a, offlineBookEntity.getNasId())) {
                    String strE = com.zentraedi.business.reader.c.e(String.valueOf(offlineBookEntity.getLastModifyTimeStamp()), offlineBookEntity.getNasPath(), offlineBookEntity.getUsername());
                    String strZ = d5.a.z(offlineBookEntity.getNasPath().toString());
                    if (strZ == null) {
                        strZ = "";
                    }
                    offlineBookEntity.setNasPath(strZ);
                    String strE2 = com.zentraedi.business.reader.c.e(String.valueOf(offlineBookEntity.getLastModifyTimeStamp()), offlineBookEntity.getNasPath(), offlineBookEntity.getUsername());
                    File file = new File(strE);
                    if (file.exists() && file.isDirectory()) {
                        File file2 = new File(strE2);
                        if (!file2.exists()) {
                            file.renameTo(file2);
                        }
                    }
                }
            }
            ReaderDatabase.A().B().c(listD);
            return true;
        } catch (Exception e) {
            nd.a.c(b, "syncChangeAllDbPath exception: " + e.getLocalizedMessage());
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b8 -> B:27:0x00bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @fo.l
    public final java.lang.Object n(@fo.k kotlin.coroutines.Continuation<? super java.util.List<com.zentraedi.outreader.model.BookEntity>> r12) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zentraedi.outreader.wrapper.b.n(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
