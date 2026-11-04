package com.zentraedi.comic.viewmodel;

import android.app.Application;
import android.graphics.drawable.Drawable;
import androidx.databinding.ObservableField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class m0 extends com.zentraedi.basic.function.viewmodel.f<Object> {

    @fo.k
    private ObservableField<Drawable> a;

    @fo.k
    private final ObservableField<String> b;

    @fo.k
    private final ObservableField<String> c;

    @fo.k
    private final ObservableField<Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(@fo.k Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.a = new ObservableField<>();
        this.b = new ObservableField<>();
        this.c = new ObservableField<>();
        this.d = new ObservableField<>(Boolean.FALSE);
    }

    @fo.k
    public final ObservableField<Drawable> L() {
        return this.a;
    }

    @fo.k
    public final ObservableField<Boolean> M() {
        return this.d;
    }

    @fo.k
    public final ObservableField<String> N() {
        return this.c;
    }

    public final void O(@fo.k ObservableField<Drawable> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.a = observableField;
    }

    @fo.k
    public final ObservableField<String> getTitleStr() {
        return this.b;
    }

    @Override // com.zentraedi.basic.function.viewmodel.f
    public int getViewType() {
        return com.zentraedi.comic.constant.a.b.f9if.b();
    }
}
