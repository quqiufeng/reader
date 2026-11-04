package com.zentraedi.comic.viewmodel;

import android.app.Application;
import android.view.View;
import androidx.databinding.ObservableField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class j6 extends com.zentraedi.basic.function.viewmodel.f<Object> {

    @fo.k
    private final ObservableField<String> a;

    @fo.k
    private final ObservableField<Boolean> b;

    @fo.k
    private final ObservableField<String> c;

    @fo.l
    private View.OnClickListener d;
    private boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(@fo.k Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.a = new ObservableField<>();
        this.b = new ObservableField<>(Boolean.TRUE);
        this.c = new ObservableField<>();
        this.e = true;
    }

    @fo.l
    public final View.OnClickListener L() {
        return this.d;
    }

    @fo.k
    public final ObservableField<String> M() {
        return this.c;
    }

    public final boolean N() {
        return this.e;
    }

    @fo.k
    public final ObservableField<Boolean> O() {
        return this.b;
    }

    public final void P(@fo.l View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final void Q(boolean z) {
        this.e = z;
    }

    @fo.k
    public final ObservableField<String> getTitleStr() {
        return this.a;
    }
}
