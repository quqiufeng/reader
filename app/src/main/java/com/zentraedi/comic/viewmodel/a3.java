package com.zentraedi.comic.viewmodel;

import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class a3 extends c {

    @fo.k
    private final String b = "ComicListDetailViewModel";

    @fo.k
    private final ObservableField<Boolean> c;

    @fo.k
    private final ObservableBoolean d;

    @fo.k
    private final ObservableField<Integer> e;

    public a3() {
        Boolean bool = Boolean.TRUE;
        this.c = new ObservableField<>(bool);
        this.d = new ObservableBoolean(false);
        this.e = new ObservableField<>(0);
        setLeftIconOnClickListener(new View.OnClickListener() { // from class: com.zentraedi.comic.viewmodel.z2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a3.S(view);
            }
        });
        this.showDividerLine.set(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(View view) {
        com.zentraedi.basic.function.utils.a.h().e().finish();
    }

    @fo.k
    public final ObservableBoolean T() {
        return this.d;
    }

    @fo.k
    public final ObservableField<Boolean> U() {
        return this.c;
    }

    @fo.k
    public final String V() {
        return this.b;
    }

    @fo.k
    public final ObservableField<Integer> getTotalNum() {
        return this.e;
    }
}
