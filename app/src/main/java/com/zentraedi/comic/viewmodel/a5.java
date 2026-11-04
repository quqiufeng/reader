package com.zentraedi.comic.viewmodel;

import android.app.Application;
import android.view.View;
import androidx.databinding.ObservableField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class a5 extends com.zentraedi.basic.function.viewmodel.f<Object> {

    @fo.l
    private View.OnClickListener a;

    @fo.k
    private ObservableField<String> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(@fo.k Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.b = new ObservableField<>("");
    }

    @fo.l
    public final View.OnClickListener L() {
        return this.a;
    }

    @fo.k
    public final ObservableField<String> M() {
        return this.b;
    }

    public final void N(@fo.l View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    public final void O(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.b = observableField;
    }
}
