package com.zentraedi.comic.viewmodel;

import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class d3 extends com.zentraedi.basic.function.viewmodel.f<Object> {

    @fo.k
    private final ObservableBoolean a;

    @fo.k
    private final ObservableBoolean b;

    @fo.k
    private final ObservableBoolean c;

    @fo.k
    private final ObservableBoolean d;

    @fo.k
    private final ObservableBoolean e;

    @fo.k
    private final ObservableBoolean f;

    @fo.k
    private final ObservableField<View.OnClickListener> g;

    @fo.k
    private final ObservableField<View.OnClickListener> h;

    @fo.k
    private final ObservableField<View.OnClickListener> i;

    @fo.k
    private final ObservableField<String> j;

    public d3() {
        super(com.zentraedi.basic.function.utils.a.c());
        this.a = new ObservableBoolean(false);
        this.b = new ObservableBoolean(false);
        this.c = new ObservableBoolean(false);
        this.d = new ObservableBoolean(true);
        this.e = new ObservableBoolean(true);
        this.f = new ObservableBoolean(true);
        this.g = new ObservableField<>();
        this.h = new ObservableField<>();
        this.i = new ObservableField<>();
        this.j = new ObservableField<>(com.zentraedi.basic.function.utils.a.n(com.zentraedi.comic.q.C0124q.Xx));
    }

    @fo.k
    public final ObservableField<View.OnClickListener> L() {
        return this.h;
    }

    @fo.k
    public final ObservableBoolean M() {
        return this.b;
    }

    @fo.k
    public final ObservableField<String> N() {
        return this.j;
    }

    @fo.k
    public final ObservableBoolean O() {
        return this.e;
    }

    @fo.k
    public final ObservableField<View.OnClickListener> P() {
        return this.i;
    }

    @fo.k
    public final ObservableBoolean Q() {
        return this.c;
    }

    @fo.k
    public final ObservableBoolean R() {
        return this.f;
    }

    @fo.k
    public final ObservableField<View.OnClickListener> S() {
        return this.g;
    }

    @fo.k
    public final ObservableBoolean T() {
        return this.a;
    }

    @fo.k
    public final ObservableBoolean U() {
        return this.d;
    }
}
