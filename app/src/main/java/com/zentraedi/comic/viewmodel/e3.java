package com.zentraedi.comic.viewmodel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class e3 {
    private final int a;
    private final boolean b;
    private final long c;

    @fo.k
    private final PageTurning d;
    private final boolean e;
    private final int f;

    @fo.k
    private final PageOver g;

    public e3() {
        this(0, false, 0L, null, false, 0, null, 127, null);
    }

    public static /* synthetic */ e3 i(e3 e3Var, int i, boolean z, long j, PageTurning pageTurning, boolean z2, int i2, PageOver pageOver, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = e3Var.a;
        }
        if ((i3 & 2) != 0) {
            z = e3Var.b;
        }
        if ((i3 & 4) != 0) {
            j = e3Var.c;
        }
        if ((i3 & 8) != 0) {
            pageTurning = e3Var.d;
        }
        if ((i3 & 16) != 0) {
            z2 = e3Var.e;
        }
        if ((i3 & 32) != 0) {
            i2 = e3Var.f;
        }
        if ((i3 & 64) != 0) {
            pageOver = e3Var.g;
        }
        long j2 = j;
        return e3Var.h(i, z, j2, pageTurning, z2, i2, pageOver);
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    @fo.k
    public final PageTurning d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(@fo.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return this.a == e3Var.a && this.b == e3Var.b && this.c == e3Var.c && this.d == e3Var.d && this.e == e3Var.e && this.f == e3Var.f && this.g == e3Var.g;
    }

    public final int f() {
        return this.f;
    }

    @fo.k
    public final PageOver g() {
        return this.g;
    }

    @fo.k
    public final e3 h(int i, boolean z, long j, @fo.k PageTurning pageTurn, boolean z2, int i2, @fo.k PageOver pageOver) {
        Intrinsics.checkNotNullParameter(pageTurn, "pageTurn");
        Intrinsics.checkNotNullParameter(pageOver, "pageOver");
        return new e3(i, z, j, pageTurn, z2, i2, pageOver);
    }

    public int hashCode() {
        return (((((((((((this.a * 31) + androidx.compose.animation.w.a(this.b)) * 31) + androidx.activity.compose.h.a(this.c)) * 31) + this.d.hashCode()) * 31) + androidx.compose.animation.w.a(this.e)) * 31) + this.f) * 31) + this.g.hashCode();
    }

    public final int j() {
        return this.a;
    }

    public final boolean k() {
        return this.b;
    }

    public final long l() {
        return this.c;
    }

    public final boolean m() {
        return this.e;
    }

    @fo.k
    public final PageOver n() {
        return this.g;
    }

    public final int o() {
        return this.f;
    }

    @fo.k
    public final PageTurning p() {
        return this.d;
    }

    @fo.k
    public String toString() {
        return "ComicMenuSetting(backgroundColor=" + this.a + ", keyPage=" + this.b + ", lockScreenTime=" + this.c + ", pageTurn=" + this.d + ", openAuto=" + this.e + ", pageTime=" + this.f + ", pageOver=" + this.g + ')';
    }

    public e3(int i, boolean z, long j, @fo.k PageTurning pageTurn, boolean z2, int i2, @fo.k PageOver pageOver) {
        Intrinsics.checkNotNullParameter(pageTurn, "pageTurn");
        Intrinsics.checkNotNullParameter(pageOver, "pageOver");
        this.a = i;
        this.b = z;
        this.c = j;
        this.d = pageTurn;
        this.e = z2;
        this.f = i2;
        this.g = pageOver;
    }

    public /* synthetic */ e3(int i, boolean z, long j, PageTurning pageTurning, boolean z2, int i2, PageOver pageOver, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? PageTurning.SINGLE : pageTurning, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? PageOver.SCROLL : pageOver);
    }
}
