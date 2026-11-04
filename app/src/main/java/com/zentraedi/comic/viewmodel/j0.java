package com.zentraedi.comic.viewmodel;

import android.view.View;
import androidx.databinding.ObservableField;
import com.zentraedi.business.model.ComicInfoModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class j0 extends com.zentraedi.basic.function.viewmodel.e {

    @fo.l
    private View.OnClickListener f;

    @fo.l
    private View.OnClickListener g;

    @fo.l
    private View.OnClickListener h;

    @fo.k
    private String a = "";

    @fo.k
    private final ObservableField<String> b = new ObservableField<>();

    @fo.k
    private final ObservableField<String> c = new ObservableField<>();

    @fo.k
    private final ObservableField<String> d = new ObservableField<>();

    @fo.k
    private final ObservableField<ComicInfoModel> e = new ObservableField<>();

    @fo.k
    private ObservableField<Boolean> i = new ObservableField<>(Boolean.FALSE);

    @fo.k
    public final ObservableField<String> L() {
        return this.c;
    }

    @fo.k
    public final ObservableField<ComicInfoModel> M() {
        return this.e;
    }

    @fo.l
    public final View.OnClickListener N() {
        return this.f;
    }

    @fo.l
    public final View.OnClickListener O() {
        return this.g;
    }

    @fo.k
    public final String P() {
        return this.a;
    }

    @fo.l
    public final View.OnClickListener Q() {
        return this.h;
    }

    @fo.k
    public final ObservableField<Boolean> R() {
        return this.i;
    }

    public final void S(@fo.l View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public final void T(@fo.l View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public final void U(@fo.k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a = str;
    }

    public final void V(@fo.l View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public final void W(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.i = observableField;
    }

    @fo.k
    public final ObservableField<String> getFileName() {
        return this.b;
    }

    @fo.k
    public final ObservableField<String> getFilePath() {
        return this.d;
    }
}
