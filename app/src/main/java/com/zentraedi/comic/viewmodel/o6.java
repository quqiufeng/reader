package com.zentraedi.comic.viewmodel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class o6 {

    @fo.l
    private final String a;

    @fo.k
    private final ReadSetting b;

    @fo.l
    private final e3 c;

    public o6(@fo.l String str, @fo.k ReadSetting readSetting, @fo.l e3 e3Var) {
        Intrinsics.checkNotNullParameter(readSetting, "readSetting");
        this.a = str;
        this.b = readSetting;
        this.c = e3Var;
    }

    public static /* synthetic */ o6 e(o6 o6Var, String str, ReadSetting readSetting, e3 e3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = o6Var.a;
        }
        if ((i & 2) != 0) {
            readSetting = o6Var.b;
        }
        if ((i & 4) != 0) {
            e3Var = o6Var.c;
        }
        return o6Var.d(str, readSetting, e3Var);
    }

    @fo.l
    public final String a() {
        return this.a;
    }

    @fo.k
    public final ReadSetting b() {
        return this.b;
    }

    @fo.l
    public final e3 c() {
        return this.c;
    }

    @fo.k
    public final o6 d(@fo.l String str, @fo.k ReadSetting readSetting, @fo.l e3 e3Var) {
        Intrinsics.checkNotNullParameter(readSetting, "readSetting");
        return new o6(str, readSetting, e3Var);
    }

    public boolean equals(@fo.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        return Intrinsics.areEqual(this.a, o6Var.a) && Intrinsics.areEqual(this.b, o6Var.b) && Intrinsics.areEqual(this.c, o6Var.c);
    }

    @fo.l
    public final e3 f() {
        return this.c;
    }

    @fo.k
    public final ReadSetting g() {
        return this.b;
    }

    @fo.l
    public final String h() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31;
        e3 e3Var = this.c;
        return iHashCode + (e3Var != null ? e3Var.hashCode() : 0);
    }

    @fo.k
    public String toString() {
        return "SaveReadSetting(userName=" + this.a + ", readSetting=" + this.b + ", menuSetting=" + this.c + ')';
    }

    public /* synthetic */ o6(String str, ReadSetting readSetting, e3 e3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, readSetting, (i & 4) != 0 ? null : e3Var);
    }
}
