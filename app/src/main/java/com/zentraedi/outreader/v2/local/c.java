package com.zentraedi.outreader.v2.local;

import android.content.Context;
import android.text.TextUtils;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.basic.component.http.i;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.business.model.CourseFileInfoModel;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.model.LocalFileModel;
import com.zentraedi.business.nas.NasConnectManager;
import com.zentraedi.business.utils.l5;
import com.zentraedi.outreader.database.ReaderDatabase;
import com.zentraedi.outreader.model.BookEntity;
import com.zentraedi.outreader.model.SectionContentEntity;
import com.zentraedi.outreader.model.offline.OfflineBookEntity;
import com.zentraedi.outreader.request.BookInfoRequest;
import com.zentraedi.outreader.request.CourseBookRecordModify;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil;
import com.zspace.mobi.MobiException;
import com.zspace.mobi.MobiUtilBusiness;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class c {
    private static final Class<?> a = c.class;

    class a extends com.zentraedi.business.http.b<BookModel> {
        final /* synthetic */ FileInfoModel a;
        final /* synthetic */ Context b;
        final /* synthetic */ com.zentraedi.basic.component.easythread.b c;

        a(final FileInfoModel val$fileInfo, final Context val$context, final com.zentraedi.basic.component.easythread.b val$callback) {
            this.a = val$fileInfo;
            this.b = val$context;
            this.c = val$callback;
        }

        public void onResult(ResponseData<BookModel> resp) {
            BookModel data = resp.getData();
            if (data == null || TextUtils.isEmpty(data.getBook_id())) {
                data = com.zentraedi.outreader.wrapper.b.f(this.a);
            } else {
                data.setLocalPath(this.a.getLocalPath());
            }
            c.b(this.b, data, this.c);
        }

        public void onServerError() {
            c.b(this.b, com.zentraedi.outreader.wrapper.b.f(this.a), this.c);
        }
    }

    class b implements Callable<List<SectionContentEntity>> {
        final /* synthetic */ BookModel a;

        b(final BookModel val$bookModel) {
            this.a = val$bookModel;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<SectionContentEntity> call() throws Exception {
            String strLoginUserName = NasConnectManager.getInstance().loginUserName();
            String nasId = NasConnectManager.getInstance().getNasId();
            String category_id = this.a.getCategory_id();
            BookModel bookModelK = com.zentraedi.outreader.v2.local.a.j().k();
            if (TextUtils.isEmpty(category_id) && bookModelK != null) {
                category_id = bookModelK.getCategory_id();
                this.a.setCategory_id(category_id);
                this.a.setReadTime(bookModelK.getReadTime());
                this.a.setRead_page(bookModelK.getRead_page());
                this.a.setReadProgressPercent(bookModelK.getReadProgressPercent());
                this.a.setText_position(bookModelK.getText_position());
                this.a.setRead_progress_ext(bookModelK.getRead_progress_ext());
            }
            OfflineBookEntity offlineBookEntityA = ReaderDatabase.A().B().a(strLoginUserName, nasId, category_id, this.a.getNasPath());
            if (offlineBookEntityA != null && offlineBookEntityA.getLatestReadTimestamp() / 1000 > this.a.getReadTime()) {
                this.a.setRead_chapter_id(offlineBookEntityA.getLatestReadChapterId());
                this.a.setRead_page(offlineBookEntityA.getLatestReadPage() + "");
                this.a.setReadProgressPercent(offlineBookEntityA.getReadProgressPercent());
                this.a.setText_position(offlineBookEntityA.getTextNumberPositionHistory() + "");
                this.a.setRead_progress_ext(offlineBookEntityA.getReadProgressExt());
                if (bookModelK != null) {
                    bookModelK.setRead_chapter_id(offlineBookEntityA.getLatestReadChapterId());
                    bookModelK.setRead_page(this.a.getRead_page());
                    bookModelK.setReadProgressPercent(this.a.getReadProgressPercent());
                    bookModelK.setText_position(this.a.getText_position());
                    bookModelK.setRead_progress_ext(offlineBookEntityA.getReadProgressExt());
                }
            }
            return ReaderDatabase.A().D().d(com.zentraedi.outreader.util.h.a(), this.a.getMd5Path());
        }
    }

    /* JADX INFO: renamed from: com.zentraedi.outreader.v2.local.c$c, reason: collision with other inner class name */
    class C0160c implements com.zentraedi.basic.component.easythread.b<List<SectionContentEntity>> {
        final /* synthetic */ BookModel a;
        final /* synthetic */ com.zentraedi.basic.component.easythread.b b;
        final /* synthetic */ Context c;

        C0160c(final BookModel val$bookModel, final com.zentraedi.basic.component.easythread.b val$callback, final Context val$context) {
            this.a = val$bookModel;
            this.b = val$callback;
            this.c = val$context;
        }

        @Override // com.zentraedi.basic.component.easythread.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<SectionContentEntity> entity) {
            com.zentraedi.outreader.v2.local.a.j().s(this.a);
            if (j0.l(entity)) {
                c.a(this.c, this.a, this.b);
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

    class d implements com.zentraedi.basic.component.easythread.d {
        final /* synthetic */ com.zentraedi.basic.component.easythread.b a;

        d(final com.zentraedi.basic.component.easythread.b val$callback) {
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

    class e implements com.zentraedi.basic.component.easythread.b<String> {
        final /* synthetic */ com.zentraedi.basic.component.easythread.d a;
        final /* synthetic */ com.zentraedi.basic.component.easythread.b b;

        e(final com.zentraedi.basic.component.easythread.d val$databaseCallback, final com.zentraedi.basic.component.easythread.b val$callback) {
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

    class f implements com.zentraedi.basic.component.easythread.d {
        final /* synthetic */ com.zentraedi.basic.component.easythread.b a;

        f(final com.zentraedi.basic.component.easythread.b val$callback) {
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

    class g implements Callable<Void> {
        final /* synthetic */ BookModel a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;

        g(final BookModel val$bookModel, final String val$filePath, final Context val$context) {
            this.a = val$bookModel;
            this.b = val$filePath;
            this.c = val$context;
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
            String strConvertToEpub = mobiUtilBusiness.convertToEpub(this.b, mobiUtilBusiness.getReaderConvertDirPath(), this.a.getNasPath());
            if (TextUtils.isEmpty(strConvertToEpub)) {
                throw new MobiException();
            }
            nd.a.e("nas_book", "transferLocalMobi isSupport=" + com.zentraedi.outreader.local.localepub.b.j(this.c, strConvertToEpub) + " epubPath=" + strConvertToEpub);
            this.a.setLocalConvertPath(strConvertToEpub);
            if (this.a.getFromFileInfo() != null && ((this.a.getFromFileInfo() instanceof CourseFileInfoModel) || (this.a.getFromFileInfo() instanceof LocalFileModel))) {
                return null;
            }
            BookEntity bookEntityE = ReaderDatabase.A().u().e(com.zentraedi.outreader.util.h.a(), this.a.getNasPath());
            if (bookEntityE == null && (bookEntityE = com.zentraedi.outreader.wrapper.b.d(this.a)) != null) {
                bookEntityE.setUserId(com.zentraedi.outreader.util.h.a());
            }
            ReaderDatabase.A().u().f(bookEntityE);
            return null;
        }
    }

    class h implements com.zentraedi.basic.component.easythread.b<Void> {
        final /* synthetic */ com.zentraedi.basic.component.easythread.d a;
        final /* synthetic */ com.zentraedi.basic.component.easythread.b b;

        h(final com.zentraedi.basic.component.easythread.d val$databaseCallback, final com.zentraedi.basic.component.easythread.b val$callback) {
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

    public static void a(final Context context, final BookModel bookModel, final com.zentraedi.basic.component.easythread.b<String> wrapCallback) {
        String localPath = bookModel.getLocalPath();
        if (TextUtils.isEmpty(localPath)) {
            localPath = com.zentraedi.business.reader.c.g(bookModel.getTime() + "", bookModel.getNasPath(), (String) null);
        }
        if (localPath.toLowerCase().endsWith(".pdf")) {
            wrapCallback.onSuccess("");
            return;
        }
        if (localPath.toLowerCase().endsWith(".epub")) {
            bookModel.setLocalConvertPath(fk.a.a.c(localPath));
            wrapCallback.onSuccess("");
        } else if (localPath.toLowerCase().endsWith(".txt")) {
            f(bookModel, wrapCallback);
        } else if (MobiUtilBusiness.INSTANCE.isMobi(localPath)) {
            d(context, localPath, bookModel, wrapCallback);
        } else {
            wrapCallback.onFailed(null);
        }
    }

    public static void b(final Context context, final BookModel bookModel, final com.zentraedi.basic.component.easythread.b<String> callback) {
        wd.b.a().a(new b(bookModel), new C0160c(bookModel, callback, context));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.zentraedi.basic.component.http.i, com.zentraedi.outreader.request.BookInfoRequest] */
    public static void c(final Context context, final FileInfoModel fileInfo, final com.zentraedi.basic.component.easythread.b<String> callback) {
        if (fileInfo == null || TextUtils.isEmpty(fileInfo.getLocalPath())) {
            if (callback != null) {
                callback.onFailed(null);
            }
        } else {
            if (!new File(fileInfo.getLocalPath()).exists()) {
                nd.a.c(a.getName(), "transferCommonLocalFile failed: 源文件不存在");
                if (callback != null) {
                    callback.onFailed(null);
                    return;
                }
                return;
            }
            if (NasConnectManager.getInstance().isOfflineLogin()) {
                b(context, com.zentraedi.outreader.wrapper.b.f(fileInfo), callback);
                return;
            }
            ?? bookInfoRequest = new BookInfoRequest();
            bookInfoRequest.setFile_path(fileInfo.getPath());
            com.zentraedi.business.http.a.b().h((i) bookInfoRequest, new a(fileInfo, context, callback));
        }
    }

    private static void d(final Context context, final String filePath, final BookModel bookModel, final com.zentraedi.basic.component.easythread.b<String> callback) {
        wd.b.a().a(new g(bookModel, filePath, context), new h(new f(callback), callback));
    }

    public static void e(Context context, FileInfoModel fileInfo, com.zentraedi.basic.component.easythread.b<String> callback) {
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
        if ((fileInfo instanceof CourseFileInfoModel) && !TextUtils.isEmpty(((CourseFileInfoModel) fileInfo).getRecordReading())) {
            try {
                CourseBookRecordModify courseBookRecordModify = (CourseBookRecordModify) com.zentraedi.basic.component.utils.a.b().fromJson(((CourseFileInfoModel) fileInfo).getRecordReading(), CourseBookRecordModify.class);
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
        com.zentraedi.outreader.v2.local.a.j().s(bookModelF);
        a(context, bookModelF, callback);
    }

    private static void f(final BookModel bookModel, final com.zentraedi.basic.component.easythread.b<String> callback) {
        com.zentraedi.outreader.v2.local.d.b(bookModel, new e(new d(callback), callback));
    }
}
