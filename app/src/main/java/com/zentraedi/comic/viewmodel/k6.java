package com.zentraedi.comic.viewmodel;

import gg.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /tmp/opencode/dump3/classes26.dex */
public final class k6<T extends gg.a> implements androidx.lifecycle.m2.c {
    @fo.k
    public /* bridge */ <T extends androidx.lifecycle.i2> T a(@fo.k Class<T> cls, @fo.k z2.a aVar) {
        return androidx.lifecycle.n2.b(this, cls, aVar);
    }

    public /* synthetic */ androidx.lifecycle.i2 b(KClass kClass, z2.a aVar) {
        return androidx.lifecycle.n2.c(this, kClass, aVar);
    }

    @fo.k
    public <T extends androidx.lifecycle.i2> T create(@fo.k Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (Intrinsics.areEqual(modelClass, i4.class)) {
            return new i4();
        }
        if (Intrinsics.areEqual(modelClass, o0.class)) {
            return new o0();
        }
        if (Intrinsics.areEqual(modelClass, y2.class)) {
            return new y2();
        }
        throw new IllegalArgumentException("Invalid ViewModel class");
    }
}
