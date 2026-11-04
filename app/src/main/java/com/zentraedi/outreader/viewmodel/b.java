package com.zentraedi.outreader.viewmodel;

import android.app.Application;
import android.content.Context;
import androidx.annotation.n0;
import androidx.lifecycle.d1;
import com.zentraedi.outreader.model.BookmarkEntity;
import java.util.List;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public class b extends com.zentraedi.basic.function.viewmodel.f {
    private static final Class<?> b = b.class;
    private final d1<List<BookmarkEntity>> a;

    public b(@n0 Application application) {
        super(application);
        this.a = new d1<>();
    }

    public void L(Context context, String bookId, String sourceId) {
    }

    public d1<List<BookmarkEntity>> N() {
        return this.a;
    }

    public void M(Context context, String bookId, String sourceId, hh.c<List<BookmarkEntity>> listener) {
    }
}
