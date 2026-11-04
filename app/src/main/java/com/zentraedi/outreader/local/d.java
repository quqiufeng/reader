package com.zentraedi.outreader.local;

import android.content.Context;
import android.text.TextUtils;
import com.artifex.mupdf.fitz.Document;
import com.vivo.identifier.IdentifierConstant;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.basic.function.utils.k0;
import com.zentraedi.business.model.CourseFileInfoModel;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.utils.l5;
import com.zentraedi.outreader.database.ReaderDatabase;
import com.zentraedi.outreader.model.BookChapterEntity;
import com.zentraedi.outreader.model.BookEntity;
import com.zentraedi.outreader.model.SectionContentEntity;
import com.zentraedi.outreader.model.offline.OfflineBookEntity;
import com.zentraedi.outreader.request.BookInfoRequest;
import com.zentraedi.outreader.request.CourseBookRecordModify;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil;
import com.zentraedi.reader.reader.LocalPdfBookModel;
import com.zspace.mobi.MobiException;
import com.zspace.mobi.MobiUtilBusiness;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class d {
    private static final Class<?> a = d.class;

    class a implements com.zentraedi.basic.component.easythread.d {
        final /* synthetic */ com.zentraedi.basic.component.easythread.b a;

        a(final com.zentraedi.basic.component.easythread.b val$callback) {
            this.a = val$callback;
        }

        @Override // com.zentraedi.basic.component.easythread.d
        public void a(String threadName) {
            com.zentraedi.basic.component.easythread.b bVar = this.a;
            if (bVar != null) {
                bVar.onSuccess(threadName);
            }
        }

        @Override // com.zentraedi.basic.component.easythread.d
        public void b(String threadName, Throwable t) {
            com.zentraedi.basic.component.easythread.b bVar = this.a;
            if (bVar != null) {
                bVar.onFailed(t);
            }
        }

        @Override // com.zentraedi.basic.component.easythread.d
        public void c(String threadName) {
        }
    }

    class b implements com.zentraedi.basic.component.easythread.b<String> {
        final /* synthetic */ BookModel a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ Context d;
        final /* synthetic */ com.zentraedi.basic.component.easythread.d e;
        final /* synthetic */ com.zentraedi.basic.component.easythread.b f;

        class a implements Callable<Void> {
            a() {
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                List<LocalPdfBookModel.LocalPdfChapter> listA = com.zentraedi.reader.pdf.e.a(Document.openDocument(b.this.c));
                if (listA == null || j0.l(listA)) {
                    return null;
                }
                b bVar = b.this;
                d.c(bVar.d, bVar.a.getMd5Path(), com.zentraedi.basic.component.utils.a.b().toJson(listA));
                return null;
            }
        }

        /* JADX INFO: renamed from: com.zentraedi.outreader.local.d$b$b, reason: collision with other inner class name */
        class C0143b implements com.zentraedi.basic.component.easythread.b<Void> {
            C0143b() {
            }

            @Override // com.zentraedi.basic.component.easythread.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void aVoid) {
                b.this.e.a("");
            }

            @Override // com.zentraedi.basic.component.easythread.b
            public void onFailed(Throwable t) {
                com.zentraedi.basic.component.easythread.b bVar = b.this.f;
                if (bVar != null) {
                    bVar.onFailed(t);
                }
            }
        }

        b(final BookModel val$bookModel, final String val$picPath, final String val$filePath, final Context val$context, final com.zentraedi.basic.component.easythread.d val$databaseCallback, final com.zentraedi.basic.component.easythread.b val$callback) {
            this.a = val$bookModel;
            this.b = val$picPath;
            this.c = val$filePath;
            this.d = val$context;
            this.e = val$databaseCallback;
            this.f = val$callback;
        }

        @Override // com.zentraedi.basic.component.easythread.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String s) {
            if (TextUtils.isEmpty(this.a.getCover())) {
                this.a.setCover(this.b);
            }
            wd.b.a().a(new a(), new C0143b());
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable t) {
            com.zentraedi.basic.component.easythread.b bVar = this.f;
            if (bVar != null) {
                bVar.onFailed(t);
            }
        }
    }

    class c implements com.zentraedi.basic.component.easythread.d {
        final /* synthetic */ com.zentraedi.basic.component.easythread.b a;

        c(final com.zentraedi.basic.component.easythread.b val$callback) {
            this.a = val$callback;
        }

        @Override // com.zentraedi.basic.component.easythread.d
        public void a(String threadName) {
            com.zentraedi.basic.component.easythread.b bVar = this.a;
            if (bVar != null) {
                bVar.onSuccess(threadName);
            }
        }

        @Override // com.zentraedi.basic.component.easythread.d
        public void b(String threadName, Throwable t) {
            com.zentraedi.basic.component.easythread.b bVar = this.a;
            if (bVar != null) {
                bVar.onFailed(t);
            }
        }

        @Override // com.zentraedi.basic.component.easythread.d
        public void c(String threadName) {
        }
    }

    /* JADX INFO: renamed from: com.zentraedi.outreader.local.d$d, reason: collision with other inner class name */
    class C0144d implements com.zentraedi.basic.component.easythread.b<String> {
        final /* synthetic */ com.zentraedi.basic.component.easythread.d a;
        final /* synthetic */ com.zentraedi.basic.component.easythread.b b;

        C0144d(final com.zentraedi.basic.component.easythread.d val$databaseCallback, final com.zentraedi.basic.component.easythread.b val$callback) {
            this.a = val$databaseCallback;
            this.b = val$callback;
        }

        @Override // com.zentraedi.basic.component.easythread.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String bookId) {
            this.a.a("");
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable t) {
            com.zentraedi.basic.component.easythread.b bVar = this.b;
            if (bVar != null) {
                bVar.onFailed(t);
            }
        }
    }

    class e extends com.zentraedi.business.http.b<BookModel> {
        final /* synthetic */ FileInfoModel a;
        final /* synthetic */ Context b;
        final /* synthetic */ com.zentraedi.basic.component.easythread.b c;

        e(final FileInfoModel val$fileInfo, final Context val$context, final com.zentraedi.basic.component.easythread.b val$callback) {
            this.a = val$fileInfo;
            this.b = val$context;
            this.c = val$callback;
        }

        public void onResult(ResponseData<BookModel> resp) {
            BookModel data = resp.getData();
            if (data == null || TextUtils.isEmpty(data.getBook_id())) {
                data = com.zentraedi.outreader.wrapper.b.f(this.a);
            } else {
                data.setLocalPath(com.zentraedi.business.reader.c.f(this.a));
            }
            d.e(this.b, data, this.c);
        }

        public void onServerError() {
            d.e(this.b, com.zentraedi.outreader.wrapper.b.f(this.a), this.c);
        }
    }

    class f implements Callable<List<SectionContentEntity>> {
        final /* synthetic */ BookModel a;

        f(final BookModel val$bookModel) {
            this.a = val$bookModel;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<SectionContentEntity> call() throws Exception {
            String strLoginUserName = NasConnectManager.getInstance().loginUserName();
            String nasId = NasConnectManager.getInstance().getNasId();
            String category_id = this.a.getCategory_id();
            BookModel bookModelN = LocalReaderManager.m().n();
            if (TextUtils.isEmpty(category_id) && bookModelN != null) {
                category_id = bookModelN.getCategory_id();
                this.a.setCategory_id(category_id);
                this.a.setReadTime(bookModelN.getReadTime());
                this.a.setRead_page(bookModelN.getRead_page());
                this.a.setReadProgressPercent(bookModelN.getReadProgressPercent());
                this.a.setText_position(bookModelN.getText_position());
            }
            OfflineBookEntity offlineBookEntityA = ReaderDatabase.A().B().a(strLoginUserName, nasId, category_id, this.a.getNasPath());
            if (offlineBookEntityA != null && offlineBookEntityA.getLatestReadTimestamp() / 1000 > this.a.getReadTime()) {
                this.a.setRead_page(offlineBookEntityA.getLatestReadPage() + "");
                this.a.setReadProgressPercent(offlineBookEntityA.getReadProgressPercent());
                this.a.setText_position(offlineBookEntityA.getTextNumberPositionHistory() + "");
                if (bookModelN != null) {
                    bookModelN.setRead_page(this.a.getRead_page());
                    bookModelN.setReadProgressPercent(this.a.getReadProgressPercent());
                    bookModelN.setText_position(this.a.getText_position());
                }
            }
            return ReaderDatabase.A().D().d(com.zentraedi.outreader.util.h.a(), this.a.getMd5Path());
        }
    }

    class g implements com.zentraedi.basic.component.easythread.b<List<SectionContentEntity>> {
        final /* synthetic */ BookModel a;
        final /* synthetic */ com.zentraedi.basic.component.easythread.b b;
        final /* synthetic */ Context c;

        g(final BookModel val$bookModel, final com.zentraedi.basic.component.easythread.b val$callback, final Context val$context) {
            this.a = val$bookModel;
            this.b = val$callback;
            this.c = val$context;
        }

        @Override // com.zentraedi.basic.component.easythread.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<SectionContentEntity> entity) {
            LocalReaderManager.m().x(this.a);
            if (j0.l(entity)) {
                d.b(this.c, this.a, this.b);
                return;
            }
            com.zentraedi.basic.component.easythread.b bVar = this.b;
            if (bVar != null) {
                bVar.onSuccess("");
            }
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable t) {
            com.zentraedi.basic.component.easythread.b bVar = this.b;
            if (bVar != null) {
                bVar.onFailed(t);
            }
        }
    }

    class h implements com.zentraedi.basic.component.easythread.d {
        final /* synthetic */ com.zentraedi.basic.component.easythread.b a;

        h(final com.zentraedi.basic.component.easythread.b val$callback) {
            this.a = val$callback;
        }

        @Override // com.zentraedi.basic.component.easythread.d
        public void a(String threadName) {
            com.zentraedi.basic.component.easythread.b bVar = this.a;
            if (bVar != null) {
                bVar.onSuccess(threadName);
            }
        }

        @Override // com.zentraedi.basic.component.easythread.d
        public void b(String threadName, Throwable t) {
            com.zentraedi.basic.component.easythread.b bVar = this.a;
            if (bVar != null) {
                bVar.onFailed(t);
            }
        }

        @Override // com.zentraedi.basic.component.easythread.d
        public void c(String threadName) {
        }
    }

    class i implements Callable<Exception> {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ BookModel c;
        final /* synthetic */ String d;

        i(final String val$filePath, final Context val$context, final BookModel val$bookModel, final String val$coverPath) {
            this.a = val$filePath;
            this.b = val$context;
            this.c = val$bookModel;
            this.d = val$coverPath;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exception call() throws Exception {
            Document documentOpenDocument;
            try {
                documentOpenDocument = Document.openDocument(this.a);
            } catch (Exception e) {
                e.printStackTrace();
                documentOpenDocument = null;
            }
            if (documentOpenDocument == null) {
                return new Exception(com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.tD2));
            }
            documentOpenDocument.layout(k0.m(this.b), k0.j(this.b) - 80.0f, 50.0f);
            List<LocalPdfBookModel.LocalPdfChapter> listA = com.zentraedi.reader.pdf.e.a(documentOpenDocument);
            if (listA != null && !j0.l(listA)) {
                d.c(this.b, this.c.getMd5Path(), com.zentraedi.basic.component.utils.a.b().toJson(listA));
            }
            if (this.c.getFromFileInfo() != null && (this.c.getFromFileInfo() instanceof CourseFileInfoModel)) {
                return null;
            }
            BookEntity bookEntityE = ReaderDatabase.A().u().e(com.zentraedi.outreader.util.h.a(), this.c.getNasPath());
            if (bookEntityE == null) {
                bookEntityE = com.zentraedi.outreader.wrapper.b.d(this.c);
                bookEntityE.setUserId(com.zentraedi.outreader.util.h.a());
            }
            bookEntityE.setCover(this.d);
            ReaderDatabase.A().u().f(bookEntityE);
            return null;
        }
    }

    class j implements com.zentraedi.basic.component.easythread.b<Exception> {
        final /* synthetic */ com.zentraedi.basic.component.easythread.d a;
        final /* synthetic */ com.zentraedi.basic.component.easythread.b b;

        j(final com.zentraedi.basic.component.easythread.d val$databaseCallback, final com.zentraedi.basic.component.easythread.b val$callback) {
            this.a = val$databaseCallback;
            this.b = val$callback;
        }

        @Override // com.zentraedi.basic.component.easythread.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Exception aVoid) {
            if (aVoid == null) {
                this.a.a("");
            } else {
                this.a.b("", aVoid);
            }
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable t) {
            com.zentraedi.basic.component.easythread.b bVar = this.b;
            if (bVar != null) {
                bVar.onFailed(t);
            }
        }
    }

    class k implements com.zentraedi.basic.component.easythread.d {
        final /* synthetic */ com.zentraedi.basic.component.easythread.b a;

        k(final com.zentraedi.basic.component.easythread.b val$callback) {
            this.a = val$callback;
        }

        @Override // com.zentraedi.basic.component.easythread.d
        public void a(String threadName) {
            com.zentraedi.basic.component.easythread.b bVar = this.a;
            if (bVar != null) {
                bVar.onSuccess(threadName);
            }
        }

        @Override // com.zentraedi.basic.component.easythread.d
        public void b(String threadName, Throwable t) {
            com.zentraedi.basic.component.easythread.b bVar = this.a;
            if (bVar != null) {
                bVar.onFailed(t);
            }
        }

        @Override // com.zentraedi.basic.component.easythread.d
        public void c(String threadName) {
        }
    }

    class l implements Callable<Void> {
        final /* synthetic */ BookModel a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;
        final /* synthetic */ String d;

        l(final BookModel val$bookModel, final String val$filePath, final Context val$context, final String val$targetCoverPath) {
            this.a = val$bookModel;
            this.b = val$filePath;
            this.c = val$context;
            this.d = val$targetCoverPath;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: com.zspace.mobi.MobiException */
        /* JADX INFO: Thrown type has an unknown type hierarchy: org.dom4j.DocumentException */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            OfflineBookWrapperUtil offlineBookWrapperUtil = OfflineBookWrapperUtil.a;
            BookModel bookModel = this.a;
            offlineBookWrapperUtil.n(bookModel, Boolean.TRUE.equals(bookModel.isOffline()), null);
            MobiUtilBusiness mobiUtilBusiness = MobiUtilBusiness.INSTANCE;
            String strConvertToEpub = mobiUtilBusiness.convertToEpub(this.b, (String) null, this.a.getNasPath());
            if (TextUtils.isEmpty(strConvertToEpub)) {
                throw new MobiException();
            }
            boolean zJ = com.zentraedi.outreader.local.localepub.b.j(this.c, strConvertToEpub);
            nd.a.e(d.a.getName(), "transferLocalMobi isSupport=" + zJ);
            if (!zJ) {
                String splitEpubPath = mobiUtilBusiness.getSplitEpubPath(strConvertToEpub);
                if (!com.zentraedi.outreader.local.localepub.a.a.c(strConvertToEpub, l5.r(splitEpubPath))) {
                    throw MobiException.Companion.lowLevelException();
                }
                strConvertToEpub = splitEpubPath;
            }
            nd.a.e(d.a.getName(), "transferLocalMobi epubPath=" + strConvertToEpub);
            Document documentOpenDocument = Document.openDocument(strConvertToEpub);
            documentOpenDocument.layout((float) k0.m(this.c), ((float) k0.j(this.c)) - 80.0f, 50.0f);
            List<LocalPdfBookModel.LocalPdfChapter> listA = com.zentraedi.reader.pdf.e.a(documentOpenDocument);
            if (listA != null && !j0.l(listA)) {
                d.c(this.c, this.a.getMd5Path(), com.zentraedi.basic.component.utils.a.b().toJson(listA));
            }
            String strK = com.zentraedi.outreader.local.localepub.b.k(this.c, strConvertToEpub, this.d);
            if (this.a.getFromFileInfo() != null && (this.a.getFromFileInfo() instanceof CourseFileInfoModel)) {
                return null;
            }
            BookEntity bookEntityE = ReaderDatabase.A().u().e(com.zentraedi.outreader.util.h.a(), this.a.getNasPath());
            if (bookEntityE == null) {
                bookEntityE = com.zentraedi.outreader.wrapper.b.d(this.a);
                bookEntityE.setUserId(com.zentraedi.outreader.util.h.a());
            }
            bookEntityE.setCover(strK);
            ReaderDatabase.A().u().f(bookEntityE);
            return null;
        }
    }

    class m implements com.zentraedi.basic.component.easythread.b<Void> {
        final /* synthetic */ com.zentraedi.basic.component.easythread.d a;
        final /* synthetic */ com.zentraedi.basic.component.easythread.b b;

        m(final com.zentraedi.basic.component.easythread.d val$databaseCallback, final com.zentraedi.basic.component.easythread.b val$callback) {
            this.a = val$databaseCallback;
            this.b = val$callback;
        }

        @Override // com.zentraedi.basic.component.easythread.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void aVoid) {
            this.a.a("");
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable t) {
            com.zentraedi.basic.component.easythread.b bVar = this.b;
            if (bVar != null) {
                bVar.onFailed(t);
            }
        }
    }

    public interface n {
        void a(int addedFileCount);

        void b(String searchPath);

        boolean c();
    }

    public static void b(final Context context, final BookModel bookModel, final com.zentraedi.basic.component.easythread.b<String> wrapCallback) {
        String localPath = bookModel.getLocalPath();
        if (TextUtils.isEmpty(localPath)) {
            localPath = com.zentraedi.business.reader.c.g(bookModel.getTime() + "", bookModel.getNasPath(), (String) null);
        }
        String strF = com.zentraedi.business.reader.d.f(localPath);
        if (localPath.toLowerCase().endsWith(".pdf")) {
            j(context, localPath, strF, bookModel, wrapCallback);
            return;
        }
        if (localPath.toLowerCase().endsWith(".epub")) {
            g(context, localPath, com.zentraedi.outreader.local.localepub.b.k(context, localPath, strF), bookModel, wrapCallback);
            return;
        }
        if (localPath.toLowerCase().endsWith(".txt")) {
            k(context, bookModel, wrapCallback);
        } else if (MobiUtilBusiness.INSTANCE.isMobi(localPath)) {
            i(context, localPath, bookModel, strF, wrapCallback);
        } else {
            wrapCallback.onFailed(null);
        }
    }

    public static void c(Context context, String bookId, String chaptersInfo) {
        BookChapterEntity bookChapterEntity = new BookChapterEntity();
        bookChapterEntity.setBookId(bookId);
        bookChapterEntity.setSourceId(IdentifierConstant.OAID_STATE_DEFAULT);
        bookChapterEntity.setUserId(com.zentraedi.outreader.util.h.a());
        bookChapterEntity.setChapterList(chaptersInfo);
        LocalReaderManager.m().s(bookChapterEntity);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.zentraedi.basic.component.http.i, com.zentraedi.outreader.request.BookInfoRequest] */
    private static void d(final Context context, final FileInfoModel fileInfo, final com.zentraedi.basic.component.easythread.b<String> callback) {
        if (!new File(fileInfo.getLocalPath()).exists()) {
            nd.a.c(a.getName(), "transferCommonLocalFile failed: 源文件不存在");
            if (callback != null) {
                callback.onFailed(null);
                return;
            }
            return;
        }
        if (NasConnectManager.getInstance().isOfflineLogin()) {
            e(context, com.zentraedi.outreader.wrapper.b.f(fileInfo), callback);
            return;
        }
        ?? bookInfoRequest = new BookInfoRequest();
        bookInfoRequest.setFile_path(fileInfo.getPath());
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) bookInfoRequest, new e(fileInfo, context, callback));
    }

    public static void e(final Context context, final BookModel bookModel, final com.zentraedi.basic.component.easythread.b<String> callback) {
        wd.b.a().a(new f(bookModel), new g(bookModel, callback, context));
    }

    public static void f(Context context, CourseFileInfoModel fileInfo, com.zentraedi.basic.component.easythread.b<String> callback) {
        if (fileInfo == null || TextUtils.isEmpty(fileInfo.getLocalPath())) {
            if (callback != null) {
                callback.onFailed(null);
                return;
            }
            return;
        }
        BookModel bookModelF = com.zentraedi.outreader.wrapper.b.f(fileInfo);
        bookModelF.setFromFileInfo(fileInfo);
        bookModelF.setNasFileName(l5.J(fileInfo.getLocalPath()));
        if (!TextUtils.isEmpty(fileInfo.getRecordReading())) {
            try {
                CourseBookRecordModify courseBookRecordModify = (CourseBookRecordModify) com.zentraedi.basic.component.utils.a.b().fromJson(fileInfo.getRecordReading(), CourseBookRecordModify.class);
                bookModelF.setRead_chapter(courseBookRecordModify.getRead_chapter());
                bookModelF.setRead_chapter_id(courseBookRecordModify.getRead_chapter_id());
                bookModelF.setRead_page(courseBookRecordModify.getRead_page());
                bookModelF.setReadProgressPercent(courseBookRecordModify.getRead_progress());
                bookModelF.setText_position(courseBookRecordModify.getText_position());
                if (courseBookRecordModify.getFont_size() != null) {
                    bookModelF.setFont_size(courseBookRecordModify.getFont_size().toString());
                }
            } catch (Exception e2) {
                nd.a.e(a.getSimpleName(), "transferCourseFile 解析极课堂进度异常");
                e2.printStackTrace();
            }
        }
        LocalReaderManager.m().x(bookModelF);
        b(context, bookModelF, callback);
    }

    private static void g(final Context context, final String filePath, final String coverPath, final BookModel bookModel, final com.zentraedi.basic.component.easythread.b<String> callback) {
        wd.b.a().a(new i(filePath, context, bookModel, coverPath), new j(new h(callback), callback));
    }

    public static void h(Context context, FileInfoModel fileInfo, com.zentraedi.basic.component.easythread.b<String> callback) {
        if (fileInfo != null && !TextUtils.isEmpty(fileInfo.getLocalPath())) {
            d(context, fileInfo, callback);
        } else if (callback != null) {
            callback.onFailed(null);
        }
    }

    private static void i(final Context context, final String filePath, final BookModel bookModel, final String targetCoverPath, final com.zentraedi.basic.component.easythread.b<String> callback) {
        wd.b.a().a(new l(bookModel, filePath, context, targetCoverPath), new m(new k(callback), callback));
    }

    private static void j(final Context context, final String filePath, final String picPath, final BookModel bookModel, final com.zentraedi.basic.component.easythread.b<String> callback) {
        a aVar = new a(callback);
        if (com.zentraedi.outreader.local.localepub.d.e(context) == null) {
            return;
        }
        com.zentraedi.reader.pdf.e.c(context, filePath, 98, picPath, new b(bookModel, picPath, filePath, context, aVar, callback));
    }

    private static void k(final Context context, final BookModel bookModel, final com.zentraedi.basic.component.easythread.b<String> callback) {
        com.zentraedi.outreader.local.localtxt.a.b(bookModel, new C0144d(new c(callback), callback));
    }
}
