package com.zentraedi.outreader.reader;

import androidx.fragment.app.Fragment;
import com.zentraedi.basic.function.utils.m0;
import com.zentraedi.outreader.model.BookChapterEntity;
import com.zentraedi.outreader.model.ChapterM;
import com.zentraedi.outreader.model.LocalTxtBookModel;
import com.zentraedi.outreader.util.ReaderUtils;
import com.zentraedi.outreader.v2.fragment.w2;
import com.zentraedi.reader.OpenFileResult;
import com.zentraedi.reader.reader.PageView;
import com.zentraedi.reader.reader.m;
import fo.k;
import fo.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class g extends d implements c {

    @l
    private LocalTxtBookModel g;

    @l
    private List<ChapterM.Chapter> h;
    private int i;
    private int j;
    private int k;
    private float l;

    @l
    private PageView o;

    @k
    private w2 f = w2.r.a();
    private float m = -1.0f;
    private int n = -1;

    @Override // com.zentraedi.outreader.reader.d
    @l
    public PageView E() {
        return this.o;
    }

    @Override // com.zentraedi.outreader.reader.d
    public void N(@l PageView pageView) {
        this.o = pageView;
    }

    public final int O() {
        return this.i;
    }

    public final int P() {
        return this.j;
    }

    @l
    public final LocalTxtBookModel Q() {
        return this.g;
    }

    @k
    public final w2 R() {
        return this.f;
    }

    public final void S(int i) {
        this.i = i;
    }

    public final void T(int i) {
        this.j = i;
    }

    public final void U(@l LocalTxtBookModel localTxtBookModel) {
        this.g = localTxtBookModel;
    }

    public final void V(@k w2 w2Var) {
        Intrinsics.checkNotNullParameter(w2Var, "<set-?>");
        this.f = w2Var;
    }

    @Override // com.zentraedi.outreader.reader.c
    public void a(@k ReaderUtils.FontSize fontSize) {
        Intrinsics.checkNotNullParameter(fontSize, "fontSize");
        if (this.k == fontSize.getValue()) {
            return;
        }
        this.k = fontSize.getValue();
        PageView pageViewE = E();
        if (pageViewE != null) {
            pageViewE.setTextSize(m0.b(fontSize.getValue()));
        }
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
        if (this.n == margin.getValue()) {
            return;
        }
        this.n = margin.getValue();
        PageView pageViewE = E();
        if (pageViewE != null) {
            pageViewE.setPageMargin(m0.b(margin.getValue()));
        }
    }

    @Override // com.zentraedi.outreader.reader.c
    public void f(@k String fontName) {
        Intrinsics.checkNotNullParameter(fontName, "fontName");
        PageView pageViewE = E();
        if (pageViewE != null) {
            pageViewE.setTypeface(new com.zentraedi.outreader.business.b().h(fontName));
        }
    }

    @Override // com.zentraedi.reader.i
    @l
    public Object h(@k String str, @k Continuation<? super Result<? extends OpenFileResult>> continuation) {
        BookChapterEntity bookChapterEntityH = com.zentraedi.outreader.v2.local.a.f.a().h();
        if (bookChapterEntityH == null) {
            nd.a.c(h.b, "openFile->bookChapterEntity is null");
            Result.Companion companion = Result.Companion;
            return Result.m6constructorimpl(OpenFileResult.FILE_FORMAT_ERROR);
        }
        try {
            LocalTxtBookModel localTxtBookModel = (LocalTxtBookModel) com.zentraedi.basic.component.utils.a.b().fromJson(bookChapterEntityH.getChapterList(), LocalTxtBookModel.class);
            this.g = localTxtBookModel;
            if (localTxtBookModel != null) {
                Result.Companion companion2 = Result.Companion;
                return Result.m6constructorimpl(OpenFileResult.SUCCESS);
            }
            nd.a.c(h.b, "openFile->localTxtBookModel is null");
            Result.Companion companion3 = Result.Companion;
            return Result.m6constructorimpl(OpenFileResult.FILE_FORMAT_ERROR);
        } catch (Exception e) {
            nd.a.c(h.b, "openFile->json exception:" + e.getLocalizedMessage());
            Result.Companion companion4 = Result.Companion;
            return Result.m6constructorimpl(OpenFileResult.CORRUPTED_FILE);
        }
    }

    @Override // com.zentraedi.outreader.reader.c
    public void i(@k ReaderUtils.LineSpace lineSpace) {
        Intrinsics.checkNotNullParameter(lineSpace, "lineSpace");
        if (this.l == lineSpace.getValue()) {
            return;
        }
        this.l = lineSpace.getValue();
        PageView pageViewE = E();
        if (pageViewE != null) {
            pageViewE.setLineSpacing(ReaderUtils.a.M(lineSpace));
        }
    }

    @Override // com.zentraedi.outreader.reader.c
    public void j(int i) {
        this.j = i;
        PageView pageViewE = E();
        if (pageViewE != null) {
            pageViewE.i2(ReaderUtils.a.d(this.i), this.j);
        }
    }

    @Override // com.zentraedi.outreader.reader.c
    public void l(@k ReaderUtils.ParagraphSpace space) {
        Intrinsics.checkNotNullParameter(space, "space");
        if (this.m == space.getValue()) {
            return;
        }
        this.m = space.getValue();
        PageView pageViewE = E();
        if (pageViewE != null) {
            pageViewE.setParagraphSize(ReaderUtils.a.N(space));
        }
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Object m(@k Continuation<? super List<? extends ChapterM.Chapter>> continuation) {
        List<ChapterM.Chapter> list = this.h;
        if (list != null && !list.isEmpty()) {
            List<ChapterM.Chapter> list2 = this.h;
            Intrinsics.checkNotNull(list2);
            return list2;
        }
        ArrayList arrayList = new ArrayList();
        LocalTxtBookModel localTxtBookModel = this.g;
        if (localTxtBookModel == null) {
            return arrayList;
        }
        Intrinsics.checkNotNull(localTxtBookModel);
        for (LocalTxtBookModel.LocalTxtChapterModel localTxtChapterModel : localTxtBookModel.getChapterInfoList()) {
            ChapterM.Chapter chapter = new ChapterM.Chapter();
            chapter.volumeName = com.zentraedi.basic.function.utils.a.n(com.zentraedi.outreader.d.q.gC2);
            chapter.name = localTxtChapterModel.getName();
            chapter.f985id = localTxtChapterModel.getChapterId();
            chapter.words = com.zentraedi.outreader.util.d.l(Boxing.boxLong(localTxtChapterModel.getWords()));
            chapter.isCache = true;
            arrayList.add(chapter);
        }
        this.h = arrayList;
        return arrayList;
    }

    @Override // com.zentraedi.outreader.reader.d, com.zentraedi.outreader.reader.h
    @l
    public Object n(@k Continuation<? super String> continuation) {
        m currentPage;
        PageView pageViewE = E();
        Integer numBoxInt = (pageViewE == null || (currentPage = pageViewE.getCurrentPage()) == null) ? null : Boxing.boxInt(currentPage.l());
        return numBoxInt == null ? "" : String.valueOf(numBoxInt.intValue() + 1);
    }

    @Override // com.zentraedi.outreader.reader.h
    @l
    public Fragment q() {
        return this.f;
    }

    @Override // com.zentraedi.outreader.reader.c
    public void setBackgroundColor(int i) {
        if (i == 5) {
            PageView pageViewE = E();
            if (pageViewE != null) {
                pageViewE.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.Vx));
            }
            PageView pageViewE2 = E();
            if (pageViewE2 != null) {
                pageViewE2.setTitleColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.Vx));
            }
            PageView pageViewE3 = E();
            if (pageViewE3 != null) {
                pageViewE3.setTipColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.Vx));
            }
        } else {
            PageView pageViewE4 = E();
            if (pageViewE4 != null) {
                pageViewE4.setTextColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.Ox));
            }
            PageView pageViewE5 = E();
            if (pageViewE5 != null) {
                pageViewE5.setTitleColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.Ox));
            }
            PageView pageViewE6 = E();
            if (pageViewE6 != null) {
                pageViewE6.setTipColor(com.zentraedi.basic.function.utils.a.d(com.zentraedi.outreader.d.f.Ox));
            }
        }
        this.i = i;
        PageView pageViewE7 = E();
        if (pageViewE7 != null) {
            pageViewE7.i2(ReaderUtils.a.d(this.i), this.j);
        }
    }
}
