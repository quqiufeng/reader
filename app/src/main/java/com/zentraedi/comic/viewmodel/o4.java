package com.zentraedi.comic.viewmodel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class o4 {
    @fo.k
    public static final e3 a(@fo.k e3 e3Var) {
        Intrinsics.checkNotNullParameter(e3Var, "<this>");
        return e3.i(e3Var, 0, false, 0L, null, false, 0, null, 127, null);
    }

    @fo.k
    public static final ReadSetting b() {
        ReadSetting readSetting = new ReadSetting();
        readSetting.D(com.zentraedi.business.utils.m6.a.e() ? ScreenOrganize.NORMAL : ScreenOrganize.VERTICAL);
        return readSetting;
    }

    @fo.k
    public static final ReadSetting c(@fo.k ReadSetting readSetting) {
        Intrinsics.checkNotNullParameter(readSetting, "<this>");
        ReadSetting readSetting2 = new ReadSetting();
        readSetting2.B(readSetting.k());
        readSetting2.z(readSetting.i());
        readSetting2.A(readSetting.j());
        readSetting2.D(readSetting.m());
        readSetting2.H(readSetting.q());
        readSetting2.s(readSetting.b());
        ReadSetting.Coordinate coordinateC = readSetting.c();
        readSetting2.t(coordinateC != null ? ReadSetting.Coordinate.h(coordinateC, 0.0f, 0.0f, 0.0f, 0.0f, false, 31, null) : null);
        ReadSetting.Stretcher stretcherO = readSetting.o();
        readSetting2.F(stretcherO != null ? ReadSetting.Stretcher.e(stretcherO, 0.0f, 0.0f, false, 7, null) : null);
        readSetting2.C(readSetting.l());
        readSetting2.G(readSetting.p());
        readSetting2.w(readSetting.f());
        readSetting2.v(readSetting.e());
        readSetting2.y(readSetting.h());
        readSetting2.x(readSetting.g());
        readSetting2.E(readSetting.n());
        readSetting2.u(readSetting.d());
        readSetting2.r(readSetting.a());
        return readSetting2;
    }
}
