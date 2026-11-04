package com.zentraedi.comic.viewmodel;

import android.view.View;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import com.zentraedi.business.model.ComicInfoModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class i6 extends com.zentraedi.business.addfile.n {

    @fo.k
    private final ObservableField<String> B = new ObservableField<>("");

    @fo.k
    private final ObservableField<String> C = new ObservableField<>();

    @fo.k
    private final ObservableField<String> D = new ObservableField<>();

    @fo.k
    private final ObservableField<String> E = new ObservableField<>();

    @fo.k
    private final ObservableField<String> F = new ObservableField<>();

    @fo.k
    private final ObservableField<String> G = new ObservableField<>();

    @fo.k
    private final ObservableField<String> H = new ObservableField<>();

    @fo.k
    private ObservableInt I = new ObservableInt(1);

    @fo.k
    private ObservableField<Boolean> J;

    @fo.l
    private View.OnClickListener K;

    @fo.l
    private View.OnClickListener L;

    @fo.k
    private ObservableField<Boolean> M;

    @fo.k
    private ObservableField<Boolean> N;

    @fo.l
    private View.OnClickListener O;

    @fo.k
    private ObservableField<String> P;

    @fo.k
    private ObservableField<String> Q;

    @fo.l
    private ComicInfoModel R;

    @fo.k
    private ObservableField<String> S;

    @fo.l
    private Integer T;

    @fo.k
    private ObservableField<String> U;

    public i6() {
        Boolean bool = Boolean.FALSE;
        this.J = new ObservableField<>(bool);
        this.M = new ObservableField<>(Boolean.TRUE);
        this.N = new ObservableField<>(bool);
        this.P = new ObservableField<>();
        this.Q = new ObservableField<>("");
        this.S = new ObservableField<>("");
        this.U = new ObservableField<>();
    }

    public final void A0(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.P = observableField;
    }

    public final void B0(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.Q = observableField;
    }

    public final void C0(@fo.l View.OnClickListener onClickListener) {
        this.K = onClickListener;
    }

    public final void D0(@fo.l View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public final void E0(@fo.l View.OnClickListener onClickListener) {
        this.O = onClickListener;
    }

    public final void F0(@fo.k ObservableInt observableInt) {
        Intrinsics.checkNotNullParameter(observableInt, "<set-?>");
        this.I = observableInt;
    }

    public final void G0(@fo.l Integer num) {
        this.T = num;
    }

    public final void H0(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.J = observableField;
    }

    public final void I0(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.M = observableField;
    }

    public final void J0(@fo.k ObservableField<Boolean> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.N = observableField;
    }

    public final void K0(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.S = observableField;
    }

    public final void L0(@fo.l ComicInfoModel comicInfoModel) {
        this.R = comicInfoModel;
    }

    @fo.k
    public final ObservableField<String> getClickItemPath() {
        return this.U;
    }

    @fo.k
    public final ObservableField<String> getProgress() {
        return this.G;
    }

    @fo.k
    public final ObservableField<String> getTitle() {
        return this.C;
    }

    @fo.k
    public final ObservableField<String> h0() {
        return this.P;
    }

    @fo.k
    public final ObservableField<String> i0() {
        return this.Q;
    }

    @fo.l
    public final View.OnClickListener j0() {
        return this.K;
    }

    @fo.l
    public final View.OnClickListener k0() {
        return this.L;
    }

    @fo.k
    public final ObservableField<String> l0() {
        return this.B;
    }

    @fo.k
    public final ObservableField<String> m0() {
        return this.H;
    }

    @fo.l
    public final View.OnClickListener n0() {
        return this.O;
    }

    @fo.k
    public final ObservableInt o0() {
        return this.I;
    }

    @fo.l
    public final Integer p0() {
        return this.T;
    }

    @fo.k
    public final ObservableField<Boolean> q0() {
        return this.J;
    }

    @fo.k
    public final ObservableField<Boolean> r0() {
        return this.M;
    }

    @fo.k
    public final ObservableField<Boolean> s0() {
        return this.N;
    }

    public final void setClickItemPath(@fo.k ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.U = observableField;
    }

    @fo.k
    public final String t0() {
        StringBuilder sb = new StringBuilder();
        ComicInfoModel comicInfoModel = this.R;
        sb.append(comicInfoModel != null ? comicInfoModel.getId() : null);
        sb.append(' ');
        ComicInfoModel comicInfoModel2 = this.R;
        sb.append(comicInfoModel2 != null ? comicInfoModel2.getPath() : null);
        return sb.toString();
    }

    @fo.k
    public final ObservableField<String> u0() {
        return this.D;
    }

    @fo.k
    public final ObservableField<String> v0() {
        return this.F;
    }

    @fo.k
    public final ObservableField<String> w0() {
        return this.S;
    }

    @fo.k
    public final ObservableField<String> x0() {
        return this.E;
    }

    @fo.l
    public final ComicInfoModel y0() {
        return this.R;
    }

    public final boolean z0() {
        return com.zentraedi.business.utils.i5.a.f((String) this.D.get()) == -1;
    }
}
