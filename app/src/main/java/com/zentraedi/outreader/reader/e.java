package com.zentraedi.outreader.reader;

import androidx.fragment.app.Fragment;
import com.artifex.mupdf.fitz.Context;
import com.artifex.mupdf.fitz.Document;
import com.tencent.tbs.reader.TbsReaderView;
import com.zentraedi.outreader.model.ChapterM;
import com.zentraedi.outreader.util.ReaderUtils;
import com.zentraedi.outreader.v2.fragment.t;
import com.zentraedi.reader.OpenFileResult;
import com.zentraedi.reader.reader.LocalPdfBookModel;
import com.zentraedi.reader.reader.PageView;
import fo.k;
import fo.l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class e extends d implements c {

    @l
    private Document g;

    @l
    private List<ChapterM.Chapter> h;
    private int j;
    private int k;

    @k
    private final t f = t.r.a();

    @k
    private PDFTronZReader i = new PDFTronZReader();

    @DebugMetadata(c = "com.zentraedi.outreader.reader.PdfPageViewZReader", f = "PdfPageViewZReader.kt", i = {0, 0}, l = {52}, m = "openFile-gIAlu-s", n = {TbsReaderView.m, "file"}, s = {"L$0", "L$1"}, v = 1)
    static final class a extends ContinuationImpl {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.c = obj;
            this.e |= IntCompanionObject.MIN_VALUE;
            Object objH = e.this.h(null, this);
            return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : Result.m5boximpl(objH);
        }
    }

    @k
    public final PDFTronZReader O() {
        return this.i;
    }

    @k
    public final t P() {
        return this.f;
    }

    public final void Q(@k PDFTronZReader pDFTronZReader) {
        Intrinsics.checkNotNullParameter(pDFTronZReader, "<set-?>");
        this.i = pDFTronZReader;
    }

    public final void R(@k String dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.i.j0(dir);
    }

    public final void S(@k String dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.i.k0(dir);
    }

    @Override // com.zentraedi.outreader.reader.c
    public void a(@k ReaderUtils.FontSize fontSize) {
        Intrinsics.checkNotNullParameter(fontSize, "fontSize");
    }

    @Override // com.zentraedi.outreader.reader.h, com.zentraedi.reader.i
    public int b() {
        PDFTronZReader pDFTronZReader = this.i;
        if (pDFTronZReader != null) {
            return pDFTronZReader.a0();
        }
        Document document = this.g;
        if (document != null) {
            return document.countPages();
        }
        return 0;
    }

    @Override // com.zentraedi.outreader.reader.c
    public void c(boolean z) {
        PageView pageViewE = E();
        if (pageViewE != null) {
            pageViewE.setClickLeftGoNext(z);
        }
    }

    @Override // com.zentraedi.outreader.reader.c
    public void d(@k ReaderUtils.PageMargin margin) {
        Intrinsics.checkNotNullParameter(margin, "margin");
    }

    @Override // com.zentraedi.outreader.reader.h, com.zentraedi.reader.i
    @k
    public List<LocalPdfBookModel.LocalPdfChapter> e() {
        PDFTronZReader pDFTronZReader = this.i;
        return pDFTronZReader != null ? pDFTronZReader.e() : super.e();
    }

    @Override // com.zentraedi.outreader.reader.c
    public void f(@k String fontName) {
        Intrinsics.checkNotNullParameter(fontName, "fontName");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.zentraedi.reader.i
    @l
    public Object h(@k String str, @k Continuation<? super Result<? extends OpenFileResult>> continuation) {
        a aVar;
        Object objH;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                aVar.e = i - IntCompanionObject.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.e;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                File file = new File(str);
                if (!file.exists()) {
                    nd.a.c(h.b, "openFile->file is not exists");
                    Result.Companion companion = Result.Companion;
                    return Result.m6constructorimpl(OpenFileResult.FILE_NOT_EXISTS);
                }
                PDFTronZReader pDFTronZReader = this.i;
                aVar.a = str;
                aVar.b = SpillingKt.nullOutSpilledVariable(file);
                aVar.e = 1;
                objH = pDFTronZReader.h(str, aVar);
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) aVar.a;
                ResultKt.throwOnFailure(obj);
                objH = ((Result) obj).m15unboximpl();
            }
            if (Result.m13isSuccessimpl(objH)) {
                if (Result.m12isFailureimpl(objH)) {
                    objH = null;
                }
                OpenFileResult openFileResult = OpenFileResult.SUCCESS;
                if (objH == openFileResult) {
                    Result.Companion companion2 = Result.Companion;
                    return Result.m6constructorimpl(openFileResult);
                }
            }
            this.g = Document.openDocument(str);
            Context.setUserCSS(com.zentraedi.reader.pdf.g.a(false));
            Context.useDocumentCSS(true);
            nd.a.e("nas_book", "PdfPageViewZReader->openFile filePath=" + str);
            Result.Companion companion3 = Result.Companion;
            return Result.m6constructorimpl(OpenFileResult.SUCCESS);
        } catch (Exception e) {
            nd.a.c("nas_book", "PdfPageViewZReader->openFile exception: " + e.getMessage());
            Result.Companion companion4 = Result.Companion;
            return Result.m6constructorimpl(ResultKt.createFailure(e));
        }
    }

    @Override // com.zentraedi.outreader.reader.c
    public void i(@k ReaderUtils.LineSpace lineSpace) {
        Intrinsics.checkNotNullParameter(lineSpace, "lineSpace");
    }

    @Override // com.zentraedi.outreader.reader.c
    public void j(int i) {
        this.k = i;
        PageView pageViewE = E();
        if (pageViewE != null) {
            pageViewE.i2(ReaderUtils.a.d(this.j), this.k);
        }
    }

    @Override // com.zentraedi.outreader.reader.c
    public void l(@k ReaderUtils.ParagraphSpace space) {
        Intrinsics.checkNotNullParameter(space, "space");
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object m(@k Continuation<? super List<? extends ChapterM.Chapter>> continuation) {
        List<LocalPdfBookModel.LocalPdfChapter> listA;
        PDFTronZReader pDFTronZReader = this.i;
        if (pDFTronZReader != null) {
            return pDFTronZReader.m(continuation);
        }
        List<ChapterM.Chapter> list = this.h;
        if (list != null && !list.isEmpty()) {
            List<ChapterM.Chapter> list2 = this.h;
            Intrinsics.checkNotNull(list2);
            return list2;
        }
        ArrayList arrayList = new ArrayList();
        Document document = this.g;
        if (document == null || (listA = com.zentraedi.reader.pdf.e.a(document)) == null) {
            return arrayList;
        }
        int i = 0;
        for (LocalPdfBookModel.LocalPdfChapter localPdfChapter : listA) {
            ChapterM.Chapter chapter = new ChapterM.Chapter();
            chapter.volumeName = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.gC2);
            chapter.name = F(localPdfChapter.getLevel()) + localPdfChapter.getTitle();
            chapter.f985id = i + "";
            chapter.isCache = true;
            chapter.page = localPdfChapter.getPage();
            arrayList.add(chapter);
            i++;
        }
        this.h = arrayList;
        return arrayList;
    }

    @Override // com.zentraedi.outreader.reader.d, com.zentraedi.reader.i
    public void onDestroy() {
        super.onDestroy();
        this.i.onDestroy();
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Fragment q() {
        return this.f;
    }

    @Override // com.zentraedi.outreader.reader.d, com.zentraedi.outreader.reader.h
    @k
    public List<Integer> r() {
        return this.i.r();
    }

    @Override // com.zentraedi.outreader.reader.c
    public void setBackgroundColor(int i) {
        this.j = i;
        PageView pageViewE = E();
        if (pageViewE != null) {
            pageViewE.i2(ReaderUtils.a.d(this.j), this.k);
        }
    }
}
