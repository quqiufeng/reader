package com.zentraedi.comic.viewmodel;

import android.view.View;
import androidx.databinding.ObservableField;
import com.zentraedi.business.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class c3 extends com.zentraedi.basic.function.viewmodel.a {

    @fo.l
    private String b;

    @fo.l
    private String c;

    @fo.l
    private String d;

    @fo.l
    private View.OnClickListener g;

    @fo.k
    private final String a = "ComicListPageViewModel";

    @fo.k
    private ObservableField<Boolean> e = new ObservableField<>(Boolean.FALSE);

    @fo.k
    private ObservableField<String> f = new ObservableField<>(com.zentraedi.basic.function.utils.a.n(R.string.Rm0));

    @fo.l
    public final View.OnClickListener L() {
        return this.g;
    }

    @fo.k
    public final ObservableField<String> M() {
        return this.f;
    }

    @fo.l
    public final String N() {
        return this.d;
    }

    @fo.l
    public final String O() {
        return this.c;
    }

    @fo.l
    public final String P() {
        return this.b;
    }

    @fo.k
    public final String Q() {
        return this.a;
    }

    @fo.k
    public final ObservableField<Boolean> R() {
        return this.e;
    }

    public final void S(@fo.l View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public final void T(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.f = observableField;
    }

    public final void U(@fo.l String str) {
        this.d = str;
    }

    public final void V(@fo.l String str) {
        this.c = str;
    }

    public final void W(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.e = observableField;
    }

    public final void X(@fo.l String str) {
        this.b = str;
    }
}
