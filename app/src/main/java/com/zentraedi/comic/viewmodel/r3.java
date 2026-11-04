package com.zentraedi.comic.viewmodel;

import android.app.Application;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class r3 extends com.zentraedi.basic.function.viewmodel.f<Object> {

    @fo.l
    private View.OnClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(@fo.k Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
    }

    @fo.l
    public final View.OnClickListener L() {
        return this.a;
    }

    public final void M(@fo.l View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }
}
