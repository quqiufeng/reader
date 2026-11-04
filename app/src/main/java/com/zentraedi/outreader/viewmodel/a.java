package com.zentraedi.outreader.viewmodel;

import android.app.Application;
import androidx.databinding.ObservableBoolean;
import fo.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes32.dex */
public final class a extends androidx.lifecycle.b {

    @k
    private final ObservableBoolean a;

    @k
    private final ObservableBoolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@k Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.a = new ObservableBoolean(true);
        this.b = new ObservableBoolean(true);
    }

    @k
    public final ObservableBoolean L() {
        return this.a;
    }

    @k
    public final ObservableBoolean M() {
        return this.b;
    }
}
