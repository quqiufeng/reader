package com.zentraedi.comic.viewmodel;

import androidx.databinding.ObservableField;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class p6 extends com.zentraedi.basic.function.viewmodel.f<Object> {

    @fo.k
    private final ObservableField<Integer> a;

    public p6() {
        super(com.zentraedi.basic.function.utils.a.c());
        this.a = new ObservableField<>(0);
    }

    @fo.k
    public final ObservableField<Integer> getTotalNum() {
        return this.a;
    }
}
