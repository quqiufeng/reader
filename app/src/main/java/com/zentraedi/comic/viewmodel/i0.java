package com.zentraedi.comic.viewmodel;

import androidx.databinding.ObservableField;
import com.zentraedi.basic.component.http.ResponseData;
import com.zentraedi.comic.model.ComicCodeBook;
import com.zentraedi.comic.request.ComicAddCodeBookRequest;
import com.zentraedi.comic.request.ComicEditorCodeBookRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class i0 extends com.zentraedi.basic.function.viewmodel.f<Object> {

    @fo.k
    private final ObservableField<String> a;

    @fo.k
    private final ObservableField<Boolean> b;

    public static final class a extends com.zentraedi.business.http.b<Object> {
        a() {
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
        }

        public void onServerError() {
        }
    }

    public static final class b extends com.zentraedi.business.http.b<Object> {
        b() {
        }

        public void onResult(ResponseData<Object> resp) {
            Intrinsics.checkNotNullParameter(resp, "resp");
        }

        public void onServerError() {
        }
    }

    public i0() {
        super(com.zentraedi.basic.function.utils.a.c());
        this.a = new ObservableField<>();
        this.b = new ObservableField<>(Boolean.FALSE);
    }

    public final void L(@fo.k String path, @fo.k String pwd) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(pwd, "pwd");
        String strR = com.zentraedi.business.utils.l5.r(path);
        com.zentraedi.business.http.a aVarB = com.zentraedi.business.http.a.b();
        Intrinsics.checkNotNull(strR);
        aVarB.h(new ComicAddCodeBookRequest(strR, pwd, path), new a());
    }

    public final void M(@fo.k ComicCodeBook codeBook, @fo.k String pwd) {
        Intrinsics.checkNotNullParameter(codeBook, "codeBook");
        Intrinsics.checkNotNullParameter(pwd, "pwd");
        com.zentraedi.business.http.a.b().h(new ComicEditorCodeBookRequest(codeBook.getId(), null, pwd, 2, null), new b());
    }

    @fo.k
    public final ObservableField<Boolean> N() {
        return this.b;
    }

    @fo.k
    public final ObservableField<String> getTitle() {
        return this.a;
    }
}
