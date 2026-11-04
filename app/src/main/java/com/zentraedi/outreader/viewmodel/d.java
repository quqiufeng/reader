package com.zentraedi.outreader.viewmodel;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.d1;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.business.model.FileInfoModel;
import com.zentraedi.business.utils.t7;
import com.zentraedi.outreader.model.BookMarkModel;
import com.zentraedi.outreader.request.BookMarkListRequest;
import com.zentraedi.outreader.responsemodel.BookModel;
import com.zentraedi.outreader.util.ReaderUtils;
import com.zentraedi.reader.i;
import fo.k;
import fo.l;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class d extends com.zentraedi.basic.function.viewmodel.f<Object> {

    @l
    private String a;

    @l
    private FileInfoModel b;

    @l
    private BookModel c;

    @k
    private com.zentraedi.outreader.reader.h d;

    @k
    private final d1<Boolean> e;

    @k
    private final d1<Boolean> f;

    @k
    private final d1<Boolean> g;

    @k
    private final d1<Boolean> h;

    @k
    private final d1<Boolean> i;

    @k
    private final d1<Boolean> j;

    @k
    private final d1<Integer> k;

    @k
    private final d1<String> l;

    @k
    private final d1<Integer> m;

    @k
    private final d1<List<BookMarkModel>> n;

    public static final class a extends com.zentraedi.business.http.b<List<? extends BookMarkModel>> {
        final /* synthetic */ Function1<List<BookMarkModel>, Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super List<BookMarkModel>, Unit> function1) {
            this.b = function1;
        }

        public void onResult(ResponseData<List<BookMarkModel>> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
            if (!resp.isSuccess()) {
                com.zentraedi.basic.function.ui.toast.a.w(resp.getMsg(), false);
                return;
            }
            d1<List<BookMarkModel>> d1VarO = d.this.O();
            List<BookMarkModel> data = resp.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            d1VarO.r(CollectionsKt.sorted(data));
            this.b.invoke((List<BookMarkModel>) d.this.O().f());
        }

        public void onServerError() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@k Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.d = new com.zentraedi.outreader.reader.b();
        Boolean bool = Boolean.FALSE;
        this.e = new d1<>(bool);
        this.f = new d1<>(bool);
        this.g = new d1<>(bool);
        this.h = new d1<>(bool);
        this.i = new d1<>(bool);
        this.j = new d1<>(bool);
        this.k = new d1<>(11);
        this.l = new d1<>("");
        this.m = new d1<>(0);
        this.n = new d1<>();
    }

    private final void d0() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModel = this.c;
        int iC = aVar.c(bookModel != null ? bookModel.getBookFileType() : null);
        i iVar = this.d;
        com.zentraedi.outreader.reader.c cVar = iVar instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVar : null;
        if (cVar != null) {
            cVar.setBackgroundColor(iC);
        }
    }

    private final void e0() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModel = this.c;
        int iF = aVar.f(bookModel != null ? bookModel.getBookFileType() : null);
        i iVar = this.d;
        com.zentraedi.outreader.reader.c cVar = iVar instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVar : null;
        if (cVar != null) {
            cVar.j(iF);
        }
    }

    private final void f0(Activity activity) {
        if (((Boolean) t7.d(gh.b.p, Boolean.TRUE)).booleanValue()) {
            return;
        }
        Integer num = (Integer) t7.d(gh.b.o, Integer.valueOf(com.zentraedi.basic.function.utils.e.a(com.zentraedi.basic.function.utils.a.h().e())));
        if (activity == null) {
            activity = com.zentraedi.basic.function.utils.a.h().e();
        }
        Intrinsics.checkNotNull(num);
        com.zentraedi.basic.function.utils.e.c(activity, num.intValue());
    }

    private final void h0() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModel = this.c;
        ReaderUtils.FontSize fontSizeH = aVar.h(bookModel != null ? bookModel.getBookFileType() : null);
        StringBuilder sb = new StringBuilder();
        sb.append("NewZReaderViewModel->setFontSize nasFileName=");
        BookModel bookModel2 = this.c;
        sb.append(bookModel2 != null ? bookModel2.getNasFileName() : null);
        sb.append(" fontSize=");
        sb.append(fontSizeH);
        nd.a.e("nas_book", sb.toString());
        i iVar = this.d;
        com.zentraedi.outreader.reader.c cVar = iVar instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVar : null;
        if (cVar != null) {
            cVar.a(fontSizeH);
        }
    }

    private final void m0() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModel = this.c;
        ReaderUtils.PageMargin pageMarginS = aVar.s(bookModel != null ? bookModel.getBookFileType() : null);
        StringBuilder sb = new StringBuilder();
        sb.append("NewZReaderViewModel->setPageMargin nasFileName=");
        BookModel bookModel2 = this.c;
        sb.append(bookModel2 != null ? bookModel2.getNasFileName() : null);
        sb.append(" pageMargin=");
        sb.append(pageMarginS);
        nd.a.e("nas_book", sb.toString());
        i iVar = this.d;
        com.zentraedi.outreader.reader.c cVar = iVar instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVar : null;
        if (cVar != null) {
            cVar.d(pageMarginS);
        }
    }

    private final void n0() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModel = this.c;
        int iU = aVar.u(bookModel != null ? bookModel.getBookFileType() : null);
        List<Integer> listR = this.d.r();
        if (listR.isEmpty()) {
            return;
        }
        if (listR.contains(Integer.valueOf(iU))) {
            this.d.z(iU);
        } else {
            this.d.z(listR.get(0).intValue());
        }
    }

    @k
    public final d1<Integer> L() {
        return this.k;
    }

    @l
    public final BookModel M() {
        return this.c;
    }

    @l
    public final FileInfoModel N() {
        return this.b;
    }

    @k
    public final d1<List<BookMarkModel>> O() {
        return this.n;
    }

    @k
    public final d1<String> P() {
        return this.l;
    }

    @l
    public final String Q() {
        return this.a;
    }

    @k
    public final d1<Boolean> R() {
        return this.i;
    }

    @k
    public final d1<Boolean> S() {
        return this.j;
    }

    @k
    public final d1<Boolean> T() {
        return this.h;
    }

    @k
    public final d1<Integer> U() {
        return this.m;
    }

    @k
    public final d1<Boolean> V() {
        return this.e;
    }

    @k
    public final d1<Boolean> W() {
        return this.g;
    }

    @k
    public final d1<Boolean> X() {
        return this.f;
    }

    @k
    public final com.zentraedi.outreader.reader.h Y() {
        return this.d;
    }

    public final void Z(@l Activity activity) {
        f0(activity);
        d0();
        e0();
        h0();
        m0();
        n0();
        i0();
        o0();
        p0();
        g0();
    }

    public final void b0(@k com.zentraedi.outreader.reader.h reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.d = reader;
        Z(null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.zentraedi.basic.component.http.i, com.zentraedi.outreader.request.BookMarkListRequest] */
    public final void c0(@k Function1<? super List<BookMarkModel>, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        ?? bookMarkListRequest = new BookMarkListRequest();
        BookModel bookModel = this.c;
        bookMarkListRequest.setBook_id(bookModel != null ? bookModel.getBook_id() : null);
        BookModel bookModel2 = this.c;
        bookMarkListRequest.setCategory_id(bookModel2 != null ? bookModel2.getCategory_id() : null);
        com.zentraedi.business.http.a.b().h((com.zentraedi.basic.component.http.i) bookMarkListRequest, new a(onSuccess));
    }

    public final void g0() {
        Boolean bool = (Boolean) t7.d(gh.b.T, Boolean.FALSE);
        i iVar = this.d;
        com.zentraedi.outreader.reader.c cVar = iVar instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVar : null;
        if (cVar != null) {
            Intrinsics.checkNotNull(bool);
            cVar.c(bool.booleanValue());
        }
    }

    public final void i0() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModel = this.c;
        ReaderUtils.LineSpace lineSpaceM = aVar.m(bookModel != null ? bookModel.getBookFileType() : null);
        i iVar = this.d;
        com.zentraedi.outreader.reader.c cVar = iVar instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVar : null;
        if (cVar != null) {
            cVar.i(lineSpaceM);
        }
    }

    public final void j0(@l BookModel bookModel) {
        this.c = bookModel;
    }

    public final void k0(@l FileInfoModel fileInfoModel) {
        this.b = fileInfoModel;
    }

    public final void l0(@l String str) {
        this.a = str;
    }

    public final void o0() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModel = this.c;
        ReaderUtils.ParagraphSpace paragraphSpaceX = aVar.x(bookModel != null ? bookModel.getBookFileType() : null);
        i iVar = this.d;
        com.zentraedi.outreader.reader.c cVar = iVar instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVar : null;
        if (cVar != null) {
            cVar.l(paragraphSpaceX);
        }
    }

    public final void p0() {
        ReaderUtils.a aVar = ReaderUtils.a;
        BookModel bookModel = this.c;
        String strJ = aVar.j(bookModel != null ? bookModel.getBookFileType() : null);
        i iVar = this.d;
        com.zentraedi.outreader.reader.c cVar = iVar instanceof com.zentraedi.outreader.reader.c ? (com.zentraedi.outreader.reader.c) iVar : null;
        if (cVar != null) {
            cVar.f(strJ);
        }
    }
}
