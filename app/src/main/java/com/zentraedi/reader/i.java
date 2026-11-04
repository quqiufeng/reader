package com.zentraedi.reader;

import com.zentraedi.reader.reader.LocalPdfBookModel;
import fo.k;
import fo.l;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes29.dex */
public interface i {
    int b();

    @k
    List<LocalPdfBookModel.LocalPdfChapter> e();

    void g(int i, @k g gVar);

    @l
    Object h(@k String str, @k Continuation<? super Result<? extends OpenFileResult>> continuation);

    void k(int i, @k g gVar);

    void onDestroy();
}
