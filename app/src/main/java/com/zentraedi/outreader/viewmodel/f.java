package com.zentraedi.outreader.viewmodel;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.n0;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.zentraedi.basic.component.http.i;
import com.zentraedi.business.model.CourseFileInfoModel;
import com.zentraedi.business.report.BaseDataRecord;
import com.zentraedi.outreader.activity.ReaderSettingActivity;
import com.zentraedi.outreader.database.ReaderDatabase;
import com.zentraedi.outreader.local.LocalReaderManager;
import com.zentraedi.outreader.model.BookChapterEntity;
import com.zentraedi.outreader.model.BookEntity;
import com.zentraedi.outreader.model.ChapterM;
import com.zentraedi.outreader.model.SectionContentEntity;
import com.zentraedi.outreader.request.ShelfAddBookRequest;
import com.zentraedi.outreader.request.ShelfAddFileRequest;
import com.zentraedi.outreader.request.ShelfRemoveBookRequest;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.wrapper.OfflineBookWrapperUtil;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class f extends com.zentraedi.basic.function.viewmodel.f {
    private static final Class<?> b = f.class;
    private int a;

    class a implements Callable<BookEntity> {
        final /* synthetic */ String a;

        a(final String val$nasPath) {
            this.a = val$nasPath;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BookEntity call() throws Exception {
            return ReaderDatabase.A().u().e(com.zentraedi.outreader.util.h.a(), this.a);
        }
    }

    class b implements com.zentraedi.basic.component.easythread.b<BookEntity> {
        final /* synthetic */ hh.c a;

        b(final hh.c val$onDbLoadBookListener) {
            this.a = val$onDbLoadBookListener;
        }

        @Override // com.zentraedi.basic.component.easythread.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BookEntity bookEntity) {
            this.a.a(bookEntity);
        }

        @Override // com.zentraedi.basic.component.easythread.b
        public void onFailed(Throwable t) {
            this.a.c();
        }
    }

    class c implements Runnable {
        final /* synthetic */ hh.c a;

        c(final hh.c val$onDbLoadContentListener) {
            this.a = val$onDbLoadContentListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            hh.c cVar = this.a;
            if (cVar != null) {
                cVar.a(LocalReaderManager.m().k());
            }
        }
    }

    public f(@n0 Application application) {
        super(application);
        this.a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void L(Context context, BookModel bookModel, com.zentraedi.business.http.b<Object> bVar) {
        i iVar;
        if (TextUtils.isEmpty(bookModel.getBook_id())) {
            ShelfAddFileRequest shelfAddFileRequest = new ShelfAddFileRequest();
            shelfAddFileRequest.setFile_path(bookModel.getNasPath());
            iVar = shelfAddFileRequest;
        } else {
            ShelfAddBookRequest shelfAddBookRequest = new ShelfAddBookRequest();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("category_id", bookModel.getCategory_id());
            jsonObject.addProperty(ReaderSettingActivity.b0, bookModel.getBook_id());
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(jsonObject);
            shelfAddBookRequest.setData(jsonArray.toString());
            iVar = shelfAddBookRequest;
        }
        com.zentraedi.business.http.a.b().h(iVar, bVar);
    }

    public void M(Context context, String userId, String bookId, List<ChapterM.Chapter> chapters, final hh.c<List<SectionContentEntity>> onLoadContentListener) {
        if (onLoadContentListener != null) {
            onLoadContentListener.a(LocalReaderManager.m().o());
        }
    }

    public void N(Context context, final String nasPath, final hh.c<BookEntity> onDbLoadBookListener) {
        wd.b.a().a(new a(nasPath), new b(onDbLoadBookListener));
    }

    public void P(Context context, String userId, String bookId, List<String> chapterIds, List<ChapterM.Chapter> chapters, final hh.c<List<SectionContentEntity>> onLoadContentListener) {
        if (onLoadContentListener != null) {
            onLoadContentListener.a(LocalReaderManager.m().o());
        }
    }

    public void Q(final Context context, final String userId, final String bookId, final String sourceId, final hh.c<BookChapterEntity> onDbLoadContentListener) {
        new Handler().postDelayed(new c(onDbLoadContentListener), 1000L);
    }

    public void R(Context context, BookEntity bookEntity) {
    }

    public void S(Context context, BookEntity bookEntity) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zentraedi.basic.component.http.i, com.zentraedi.outreader.request.ShelfRemoveBookRequest] */
    public void T(final BookModel bookEntity, final com.zentraedi.business.http.b<Object> handler) {
        ?? shelfRemoveBookRequest = new ShelfRemoveBookRequest();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("category_id", bookEntity.getCategory_id());
        jsonObject.addProperty(ReaderSettingActivity.b0, bookEntity.getBook_id());
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(jsonObject);
        shelfRemoveBookRequest.setData(jsonArray.toString());
        com.zentraedi.business.http.a.b().h((i) shelfRemoveBookRequest, handler);
    }

    public void U() {
        BaseDataRecord baseDataRecordA = hf.a.a(BaseDataRecord.class);
        baseDataRecordA.acode = 0;
        baseDataRecordA.ap = "add_books_into_shelf";
        baseDataRecordA.refUrl = hf.e.d;
        hf.e.c(baseDataRecordA, "add_books_into_shelf");
    }

    public void V() {
        BaseDataRecord baseDataRecordA = hf.a.a(BaseDataRecord.class);
        baseDataRecordA.acode = 51;
        baseDataRecordA.refUrl = hf.e.d;
        hf.e.c(baseDataRecordA, "zreader_page_show");
    }

    public BookChapterEntity W(String userId, String bookId, String sourceId) {
        return LocalReaderManager.m().k();
    }

    public void X(final BookModel bookModel) {
        if (bookModel != null && (bookModel.getFromFileInfo() instanceof CourseFileInfoModel)) {
            int i = this.a;
            if (i < 5) {
                this.a = i + 1;
                return;
            } else {
                this.a = 0;
                LocalReaderManager.m().t(bookModel);
                return;
            }
        }
        if (bookModel == null || TextUtils.isEmpty(bookModel.getBook_id())) {
            return;
        }
        int i2 = this.a;
        if (i2 >= 10) {
            this.a = 0;
            LocalReaderManager.m().r(bookModel, false);
            return;
        }
        int i3 = i2 + 1;
        this.a = i3;
        if (i3 > 1) {
            OfflineBookWrapperUtil.a.n(bookModel, Boolean.TRUE.equals(bookModel.isOffline()), null);
        }
    }

    public void O(Context context, String bookId, hh.c<BookEntity> onDbLoadBookListener) {
    }
}
