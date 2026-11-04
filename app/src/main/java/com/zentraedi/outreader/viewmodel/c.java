package com.zentraedi.outreader.viewmodel;

import android.app.Application;
import androidx.databinding.ObservableBoolean;
import fo.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class c extends androidx.lifecycle.b {

    @k
    private final ObservableBoolean a;

    @k
    private final ObservableBoolean b;

    @k
    private final ObservableBoolean c;

    @k
    private final ObservableBoolean d;

    @k
    private final ObservableBoolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@k Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.a = new ObservableBoolean(false);
        this.b = new ObservableBoolean(false);
        this.c = new ObservableBoolean(false);
        this.d = new ObservableBoolean(false);
        this.e = new ObservableBoolean(false);
    }

    @k
    public final ObservableBoolean L() {
        return this.b;
    }

    @k
    public final ObservableBoolean M() {
        return this.d;
    }

    @k
    public final ObservableBoolean N() {
        return this.c;
    }

    @k
    public final ObservableBoolean O() {
        return this.e;
    }

    @k
    public final ObservableBoolean P() {
        return this.a;
    }
}
