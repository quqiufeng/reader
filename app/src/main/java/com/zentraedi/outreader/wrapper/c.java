package com.zentraedi.outreader.wrapper;

import android.text.TextUtils;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.basic.function.utils.j0;
import com.zentraedi.outreader.database.ReaderDatabase;
import com.zentraedi.outreader.model.BookEntity;
import com.zentraedi.outreader.model.BookLibraryCategoryEntity;
import com.zentraedi.outreader.model.LibraryCategoryAndBookRelate;
import com.zentraedi.outreader.request.BookLibCategoryListRequest;
import com.zentraedi.outreader.responsemodel.BookCategoryListModel;
import com.zentraedi.outreader.responsemodel.BookCategoryModel;
import com.zentraedi.outreader.util.h;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class c {
    public static String a = "Reader-Category";
    private static String b;

    class a extends com.zentraedi.business.http.b<BookCategoryListModel> {
        final /* synthetic */ b a;

        a(final b val$resultHandler) {
            this.a = val$resultHandler;
        }

        public void onResult(ResponseData<BookCategoryListModel> resp) {
            BookCategoryModel next;
            if (!"200".equals(resp.getCode()) || resp.getData() == null || j0.l(resp.getData().getList())) {
                this.a.a(null);
                return;
            }
            Iterator<BookCategoryModel> it = resp.getData().getList().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.is_system() != 1);
            if (next == null) {
                this.a.a(null);
            } else {
                this.a.a(next.getCategory_id());
            }
        }

        public void onServerError() {
            this.a.a(null);
        }
    }

    public interface b {
        void a(String categoryId);
    }

    public static void a(final b resultHandler) {
        if (resultHandler == null) {
            return;
        }
        if (!TextUtils.isEmpty(b)) {
            resultHandler.a(b);
        } else {
            com.zentraedi.business.http.a.b().h(new BookLibCategoryListRequest(), new a(resultHandler));
        }
    }

    public static void b() {
        b = null;
    }

    public static boolean c(int categoryIndex) {
        List<BookLibraryCategoryEntity> listE = ReaderDatabase.A().w().e(h.a(), categoryIndex);
        if (!j0.l(listE)) {
            return d(listE.get(0));
        }
        nd.a.c(a, "deleteCategory 该分类不存书");
        return false;
    }

    public static boolean d(BookLibraryCategoryEntity entity) {
        if (entity == null) {
            nd.a.c(a, "deleteCategory entity is null");
            return false;
        }
        try {
            ReaderDatabase.A().w().a(entity);
            List<LibraryCategoryAndBookRelate> listG = ReaderDatabase.A().y().g(entity.getIndex());
            if (j0.l(listG)) {
                return true;
            }
            int size = listG.size();
            BookEntity[] bookEntityArr = new BookEntity[size];
            int i = 0;
            for (LibraryCategoryAndBookRelate libraryCategoryAndBookRelate : listG) {
                ReaderDatabase.A().y().a(libraryCategoryAndBookRelate);
                if (j0.l(ReaderDatabase.A().y().b(libraryCategoryAndBookRelate.getBookIndex(), 1))) {
                    BookEntity bookEntityJ = ReaderDatabase.A().u().j(h.a(), libraryCategoryAndBookRelate.getBookIndex());
                    bookEntityJ.setAddToLibrary(false);
                    bookEntityJ.setAddToShelf(false);
                    bookEntityArr[i] = bookEntityJ;
                    i++;
                }
            }
            if (size > 0) {
                ReaderDatabase.A().u().f(bookEntityArr);
            }
            return true;
        } catch (Exception unused) {
            nd.a.c(a, "deleteCategory exception");
            return false;
        }
    }
}
