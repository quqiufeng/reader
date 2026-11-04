package com.zentraedi.comic.viewmodel;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class l6 extends eg.a {
    private boolean k;

    @fo.l
    private String l;
    private int m;
    private int n;
    private float o;

    @fo.k
    private androidx.lifecycle.d1<Pair<String, String>> p;

    public l6() {
        super(null, null, null, null, 0, null, null, null, null, null, 1023, null);
        this.k = getType() == 1;
        this.p = new androidx.lifecycle.d1<>();
    }

    public final void A(@fo.k androidx.lifecycle.d1<Pair<String, String>> d1Var) {
        Intrinsics.checkNotNullParameter(d1Var, "<set-?>");
        this.p = d1Var;
    }

    public final void B(float f) {
        this.o = f;
    }

    public final void C(boolean z) {
        this.k = z;
    }

    public final int getPosition() {
        return this.m;
    }

    @fo.l
    public final String getUserName() {
        return this.l;
    }

    public final void setPosition(int i) {
        this.m = i;
    }

    public final void setUserName(@fo.l String str) {
        this.l = str;
    }

    public final int t() {
        return this.n;
    }

    @fo.k
    public final androidx.lifecycle.d1<Pair<String, String>> u() {
        return this.p;
    }

    @fo.k
    public final String w() {
        return StringsKt.contains$default(getPath(), getFileName(), false, 2, (Object) null) ? StringsKt.removeSuffix(getPath(), getFileName()) : getPath();
    }

    public final float x() {
        return this.o;
    }

    public final boolean y() {
        return this.k;
    }

    public final void z(int i) {
        this.n = i;
    }
}
